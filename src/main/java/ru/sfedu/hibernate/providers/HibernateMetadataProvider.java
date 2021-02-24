package ru.sfedu.hibernate.providers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import ru.sfedu.hibernate.Constants;
import ru.sfedu.hibernate.utils.HibernateUtil;

import java.io.IOException;
import java.util.List;

public class HibernateMetadataProvider implements IMetadataProvider {


    private static Logger log = LogManager.getLogger(HibernateMetadataProvider.class);

    @Override
    public String toString() {
        return "HibernateMetadataProvider{" +
                "resultList1=" + resultList1 +
                '}';
    }

    List <Object> resultList1;

    @Override
    public List getAllSchemas() throws IOException {

        Session session = getSession();
        NativeQuery query = session.createSQLQuery(Constants.SQL_ALL_SHEMAS);
        List resultList = query.getResultList();
        session.close();

        if (resultList.isEmpty()) {
            log.error("Schemas size is null");
        } else {
            log.info("Get schemas size: {}", resultList.size());

        }

        return resultList;
    }

    //список таблиц базы
    @Override
    public List getAllTables() throws IOException {
        Session session = getSession();
        NativeQuery query = session.createSQLQuery(Constants.SQL_ALL_TABLES);
        List resultList = query.getResultList();
        session.close();

        if (resultList.isEmpty()) {
            log.error("Tables not exist");
        } else {

            log.info(resultList);

        }

        return resultList;
    }


    @Override
    public List getAllColumn() throws IOException {
        Session session = getSession();
        NativeQuery query = session.createSQLQuery(Constants.SQL_ALL_COLUMN);
        resultList1 = query.getResultList();
        session.close();


        if (resultList1.isEmpty()) {
            log.error("Tables and Column not exist");
        } else {

            for (int i = 0; i < resultList1.size(); i++) {
                log.info(resultList1.get(i));
                log.info(resultList1.get(i).toString());

            }


        }

        return resultList1;
    }

    @Override
    public List getAllClients() throws IOException {
        Session session = getSession();
        NativeQuery query = session.createSQLQuery(Constants.SQL_ALL_Clients);
        List resultList = query.getResultList();
        session.close();

        if (resultList.isEmpty()) {
            log.error("Clients not exist");
        } else {
            log.info("Clients");

            for (int i = 0; i < resultList.size(); i++) {
                log.info(resultList.get(i).toString());
                log.info(resultList.get(i));
                // log.info(List.toS);
            }

            //log.info(resultList.toString());


            //   log.info(resultList);
        }

        return resultList;

    }

    @Override
    public List getAllBdSize() throws IOException {

        Session session = getSession();
        NativeQuery query = session.createSQLQuery(Constants.SQL_BD_Size);
        List resultList = query.getResultList();
        session.close();

        if (resultList.isEmpty()) {
            log.error("BD size is null");
        } else {
            log.info("Get bd size: {}", resultList);

        }

        return resultList;
    }

    @Override
    public List getAllTableSize() throws IOException {

        Session session = getSession();
        NativeQuery query = session.createSQLQuery(Constants.SQL_Table_Size);
       //try
        List resultList = query.getResultList();
        session.close();

        if (resultList.isEmpty()) {
            log.error("Table size is null");
        } else {
            log.info("Get table size: {}", resultList);

        }

        return resultList;
    }

    @Override
    public List getTableInformation() throws IOException {

        Session session = getSession();
        NativeQuery query = session.createSQLQuery(Constants.SQL_Table_Information);
        //try
        List resultList = query.getResultList();
        session.close();

        if (resultList.isEmpty()) {
            log.error("Table information is null");
        } else {
            log.info("Get table information: {}", resultList);

        }

        return resultList;

    }


    private Session getSession() throws IOException {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        return sessionFactory.openSession();
    }


}