\encoding UTF8;
\set csearch_path -csearch_path=:db_schema

CREATE SCHEMA :db_schema AUTHORIZATION :db_user;

CREATE EXTENSION dblink SCHEMA :db_schema;

CREATE SERVER auto_tran_dblink FOREIGN DATA WRAPPER dblink_fdw 
	OPTIONS (host :'db_host', dbname :'db_name', port :'db_port', options :'csearch_path');

GRANT USAGE ON FOREIGN SERVER auto_tran_dblink TO :db_user;

CREATE USER MAPPING FOR :db_user SERVER auto_tran_dblink OPTIONS (user :'db_user', password :'db_pass');
