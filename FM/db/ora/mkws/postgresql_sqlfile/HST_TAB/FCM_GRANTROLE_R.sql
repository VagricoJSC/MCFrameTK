\encoding UTF-8

CREATE TABLE fcm_grantrole_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
gid numeric (15) NULL,
user_id varchar (500) NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
rid varchar (50) NULL,
st_dt timestamp(0)  NULL,
end_dt timestamp(0)  NULL,
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



ALTER TABLE fcm_grantrole_r ADD CONSTRAINT fcm_grantrole_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_grantrole_r', 'fcm_grantrole', 'fcm_grantrole_tr_r');

