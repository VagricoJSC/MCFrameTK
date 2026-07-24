\encoding UTF-8

CREATE TABLE fcm_mining_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
mining_id varchar (30) NULL,
mining_nm varchar (1000) NULL,
user_id varchar (500) NULL,
co_cd varchar (10) NULL,
public_lv varchar (500) NULL,
description_text varchar (1000) NULL,
module_id varchar (3) NULL,
logic_id varchar (50) NULL,
operation_id varchar (50) NULL,
func_typ varchar (10) NULL,
scr_module_id varchar (3) NULL,
screen_id varchar (10) NULL,
gadget_size varchar (1000) NULL,
gadget_icon numeric  NULL,
gadget_cache_flg char (1) DEFAULT '0' NULL,
md_module_id varchar (3) NULL,
md_screen_id varchar (10) NULL,
md_gadget_size varchar (1000) NULL,
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



ALTER TABLE fcm_mining_r ADD CONSTRAINT fcm_mining_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('fcm_mining_r', 'fcm_mining', 'fcm_mining_tr_r');

