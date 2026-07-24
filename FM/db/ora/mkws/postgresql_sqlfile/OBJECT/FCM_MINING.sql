\encoding UTF-8

CREATE TABLE fcm_mining
(mining_id varchar (30) NOT NULL,
mining_nm varchar (1000) NOT NULL,
user_id varchar (500) NOT NULL,
co_cd varchar (10) NULL,
public_lv varchar (500) NOT NULL,
description_text varchar (1000) NULL,
module_id varchar (3) NOT NULL,
logic_id varchar (50) NOT NULL,
operation_id varchar (50) NOT NULL,
func_typ varchar (10) NULL,
scr_module_id varchar (3) NULL,
screen_id varchar (10) NULL,
gadget_size varchar (1000) NOT NULL,
gadget_icon numeric  NULL,
gadget_cache_flg char (1) DEFAULT '0' NOT NULL,
md_module_id varchar (3) NULL,
md_screen_id varchar (10) NULL,
md_gadget_size varchar (1000) NOT NULL,
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


ALTER TABLE fcm_mining
ADD CONSTRAINT fcm_mining_pk PRIMARY KEY(mining_id);


INSERT INTO fcm_delete_binary (table_name, column_name)
VALUES ('fcm_mining','gadget_icon');

