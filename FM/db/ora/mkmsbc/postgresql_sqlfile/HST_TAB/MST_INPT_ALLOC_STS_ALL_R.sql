\encoding UTF-8

CREATE TABLE mst_inpt_alloc_sts_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
inpt_alloc_sts_no varchar (15) NULL,
co_cd varchar (10) NULL,
inpt_schd_no varchar (15) NULL,
mfg_inst_no varchar (15) NULL,
itm_mfg_inst_no varchar (15) NULL,
oper_inst_no varchar (15) NULL,
base_unit_qty numeric (21,8) NULL,
stk_id_typ varchar (1) NULL,
stk_bp_cd varchar (20) DEFAULT '*' NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NULL,
to_stk_id_typ varchar (1) NULL,
to_stk_bp_cd varchar (20) DEFAULT '*' NULL,
to_stk_arrv_bp_cd varchar (20) DEFAULT '*' NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
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



ALTER TABLE mst_inpt_alloc_sts_all_r ADD CONSTRAINT mst_inpt_alloc_sts_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_inpt_alloc_sts_all_r', 'mst_inpt_alloc_sts_all', 'mst_inpt_alloc_sts_all_tr_r');

