\encoding UTF-8

CREATE TABLE mgt_inst_oper_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
calc_ctg_cd varchar (10) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
itm_mfg_inst_no varchar (15) NULL,
mfg_act_no varchar (15) DEFAULT '*' NULL,
oper_act_no varchar (15) DEFAULT '*' NULL,
co_cd varchar (10) NULL,
wg_cd varchar (10) NULL,
mng_dpt_cd varchar (20) NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
disp_seq numeric (9,0) NULL,
qty numeric (21,8) NULL,
schd_st_dt timestamp(0)  NULL,
schd_end_dt timestamp(0)  NULL,
act_st_dt timestamp(0)  NULL,
act_end_dt timestamp(0)  NULL,
rmrks varchar (100) NULL,
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



ALTER TABLE mgt_inst_oper_all_r ADD CONSTRAINT mgt_inst_oper_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_inst_oper_all_r', 'mgt_inst_oper_all', 'mgt_inst_oper_all_tr_r');

