package ru.sfedu.hibernate.providers;


import java.io.IOException;
import java.util.List;

public interface IMetadataProvider {
    List getAllSchemas() throws IOException;

    List getAllTables() throws IOException;

    List getAllColumn() throws IOException;

    List getAllClients() throws IOException;
    List getAllBdSize() throws IOException;
    List getAllTableSize() throws IOException;
    List getTableInformation() throws IOException;
}
