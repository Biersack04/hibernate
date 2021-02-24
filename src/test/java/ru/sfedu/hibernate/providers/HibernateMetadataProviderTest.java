package ru.sfedu.hibernate.providers;

import junit.framework.TestCase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;


public class HibernateMetadataProviderTest extends TestCase {

    private static final Logger log = LogManager.getLogger(HibernateMetadataProviderTest.class);

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testGetAllSchemas() throws IOException {

        log.info("getAllSchemas");

        HibernateMetadataProvider instance = new HibernateMetadataProvider();

        List expResult = null;
        List result = instance.getAllSchemas();
        assertNotNull(String.valueOf(expResult),result);


    }

    public void testGetAllTables() throws IOException {

        log.info("getAllTables");

        HibernateMetadataProvider instance = new HibernateMetadataProvider();

        List expResult = null;
        List result = instance.getAllTables();
        assertNotNull(String.valueOf(expResult),result);


    }
    public void testGetAllColumn() throws IOException {

        log.info("getAllColumn");

        HibernateMetadataProvider instance = new HibernateMetadataProvider();

        List expResult = null;
        List result = instance.getAllColumn();
        assertNotNull(String.valueOf(expResult),result);


    }
    /*
    public void testGetAllClients() {

        log.info("getAllClients");

        HibernateMetadataProvider instance = new HibernateMetadataProvider();

        List expResult = null;
        List result = instance.getAllClients();
        assertNotNull(String.valueOf(expResult),result);


    }*/

    public void testGetBDSize() throws IOException {

        log.info("getBdSize");

        HibernateMetadataProvider instance = new HibernateMetadataProvider();

        List expResult = null;
        List result = instance.getAllBdSize();
        assertNotNull(String.valueOf(expResult),result);


    }
/*
    public void testGetTableSize() {

        log.info("getTableSize");

        HibernateMetadataProvider instance = new HibernateMetadataProvider();

        List expResult = null;
        List result = instance.getAllTableSize();
        assertNotNull(String.valueOf(expResult),result);


    }*/

    public void testGetTableInformation() throws IOException {

        log.info("getTableInformation");

        HibernateMetadataProvider instance = new HibernateMetadataProvider();

        List expResult = null;
        List result = instance.getTableInformation();
        assertNotNull(String.valueOf(expResult),result);


    }
}