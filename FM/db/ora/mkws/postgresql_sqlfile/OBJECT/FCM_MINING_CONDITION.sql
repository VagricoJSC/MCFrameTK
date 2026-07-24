\encoding UTF-8

CREATE TABLE fcm_mining_condition
(mining_id varchar (30) NOT NULL,
col_id varchar (512) NOT NULL,
col_nm varchar (1000) NOT NULL,
list_order numeric (10) NOT NULL,
scr_itm_id varchar (100) NULL,
md_itm_id varchar (100) NULL,
data_typ varchar (1) NOT NULL,
require_flg char (1) DEFAULT '0' NOT NULL,
init_val varchar (1000) NULL,
editable_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE fcm_mining_condition
ADD CONSTRAINT fcm_mining_condition_pk PRIMARY KEY(mining_id,col_id);

