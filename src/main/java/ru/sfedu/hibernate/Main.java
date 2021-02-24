package ru.sfedu.hibernate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.sfedu.hibernate.providers.HibernateMetadataProvider;
import ru.sfedu.hibernate.utils.HibernateUtil;

import java.util.List;
import java.util.Properties;

public class Main {
    private static Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

        log.info("Launching the application...");
      //  log.info(HibernateUtil.getSessionFactory());

        log.error("getAllTables");

        HibernateMetadataProvider instance = new HibernateMetadataProvider();

        List result = instance.getAllTables();
        log.error(result);

    }
}
