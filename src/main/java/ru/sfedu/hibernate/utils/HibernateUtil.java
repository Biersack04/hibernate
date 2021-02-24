package ru.sfedu.hibernate.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import ru.sfedu.hibernate.Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static ru.sfedu.hibernate.Constants.LAB1_HBN_CFG;


public class HibernateUtil {
    private static Logger log = LogManager.getLogger(HibernateUtil.class);
    private static SessionFactory sessionFactory;
    /**
     * Создание фабрики
     *
     */
    public static SessionFactory getSessionFactory() {
        final String DEFAULT_CONFIG_PATH = "./src/main/resources/hibernate.cfg.xml";
        //final String DEFAULT_CONFIG_PATH = "./hibernate.cfg.xml";
        final String CUSTOM_CONFIG_PATH = System.getProperty("configPath");


        if (sessionFactory == null) {
            // loads configuration and mappings
            File nf;
            try{
                nf = new File(CUSTOM_CONFIG_PATH);
            }
            catch(NullPointerException e){
                nf = new File(DEFAULT_CONFIG_PATH);
            };
            File file = nf;
            Configuration configuration = new Configuration().configure(file);

            log.error(file.getName());

            ServiceRegistry serviceRegistry
                    = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            MetadataSources metadataSources =
                    new MetadataSources(serviceRegistry);


            //metadataSources.addResource("named-queries.hbm.xml");// Именованные запросы
            sessionFactory = metadataSources.buildMetadata().buildSessionFactory();
        }

        return sessionFactory;
    }


}
