\encoding UTF-8

CREATE TABLE fct_mining_gadget_cache_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
mining_id varchar (30) NULL,
co_cd varchar (10) NULL,
data numeric  NULL,
upd_co_dt timestamp(0)  NULL,
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



ALTER TABLE fct_mining_gadget_cache_r ADD CONSTRAINT fct_mining_gadget_cache_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fct_mining_gadget_cache_r', 'fct_mining_gadget_cache', 'fct_mining_gadget_cache_tr_r');

