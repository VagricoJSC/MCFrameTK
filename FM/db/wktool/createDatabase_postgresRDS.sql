\encoding UTF8;

CREATE ROLE :db_user
WITH CREATEDB LOGIN PASSWORD :'db_pass';

GRANT :db_user TO :master_user;
GRANT pg_signal_backend TO :db_user;


CREATE DATABASE :db_name
WITH OWNER :'db_user'
	TEMPLATE template0
	LC_COLLATE 'C'
	LC_CTYPE 'C'
	ENCODING 'UTF8';
