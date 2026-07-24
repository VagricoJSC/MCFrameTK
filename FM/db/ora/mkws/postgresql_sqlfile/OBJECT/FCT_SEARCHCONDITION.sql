\encoding UTF-8

CREATE TABLE fct_searchcondition
(user_id varchar (500) NOT NULL,
table_name varchar (30) NOT NULL,
rows_no numeric (3) NOT NULL,
valid_flg char (1) DEFAULT '0' NOT NULL,
column_name varchar (30) NOT NULL,
search_operator varchar (15) NULL,
search_value varchar (100) NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (40) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (40) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL
);


ALTER TABLE fct_searchcondition
ADD CONSTRAINT fct_searchcondition_pk PRIMARY KEY(user_id,table_name,rows_no);

