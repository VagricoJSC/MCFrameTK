\encoding UTF-8

CREATE TABLE mac_sys_parm_remark_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
parm_key varchar (40) NULL,
lcl_cd varchar (7) NULL,
parm_remark varchar (4000) NULL,
parm_biz_grp varchar (100) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (100) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (100) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL
);



ALTER TABLE mac_sys_parm_remark_r ADD CONSTRAINT mac_sys_parm_remark_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mac_sys_parm_remark_r', 'mac_sys_parm_remark', 'mac_sys_parm_remark_tr_r');

