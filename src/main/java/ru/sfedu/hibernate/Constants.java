package ru.sfedu.hibernate;

public class Constants {
    public static final String SQL_ALL_SHEMAS="SELECT schema_name FROM information_schema.schemata";
    public static final String SQL_ALL_TABLES="SELECT table_name FROM information_schema.tables where table_schema='public'";
    public static final String SQL_ALL_COLUMN="select table_name, column_name from information_schema.columns where table_schema='public'";
   // public static final String SQL_ALL_Clients="SELECT datname, COUNT(*) AS c from pg_stat_activity GROUP BY datname ORDER BY c DESC, datname ASC";

    public static final String SQL_ALL_Clients="SELECT datname,usename,client_addr,client_port FROM pg_stat_activity";

    public static final String SQL_BD_Size="SELECT pg_size_pretty(pg_database_size(current_database()));";

    public static final String SQL_Table_Size="SELECT pg_size_pretty( pg_total_relation_size('Test_table'))";
    public static final String SQL_Table_Information="select column_name,data_type from information_schema.columns where table_name = 'Test_table'";
    public static final String LAB1_HBN_CFG="lab1.hbn_cfg";

}
