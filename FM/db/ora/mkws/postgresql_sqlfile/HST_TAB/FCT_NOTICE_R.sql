\encoding UTF-8

CREATE TABLE fct_notice_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
notice_id varchar (15) NULL,
start_dt timestamp(0)  NULL,
end_dt timestamp(0)  NULL,
locale_cd varchar (20) NULL,
notice_title varchar (500) NULL,
text_line varchar (1000) NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
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



ALTER TABLE fct_notice_r ADD CONSTRAINT fct_notice_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fct_notice_r', 'fct_notice', 'fct_notice_tr_r');

