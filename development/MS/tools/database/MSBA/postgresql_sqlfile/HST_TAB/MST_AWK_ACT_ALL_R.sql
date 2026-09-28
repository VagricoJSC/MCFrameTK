\encoding UTF-8

CREATE TABLE mst_awk_act_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
awk_act_no varchar (15) NULL,
co_cd varchar (10) NULL,
wk_usr_cd varchar (500) NULL,
ac_dt timestamp(0)  NULL,
wk_cd varchar (3) NULL,
wk_typ varchar (1) NULL,
oper_inst_no varchar (15) NULL,
cnstr_no varchar (15) NULL,
mfg_inst_no varchar (15) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
wk_cost numeric (21,8) NULL,
wk_usr_dpt_cd varchar (20) NULL,
assit_dpt_cd varchar (20) NULL,
aprv_flg char (1) DEFAULT '0' NULL,
aprv_usr_id varchar (500) NULL,
aprv_usr_nm varchar (100) NULL,
aprv_ts timestamp(3)  NULL,
aprv_can_usr_id varchar (500) NULL,
aprv_can_usr_nm varchar (100) NULL,
aprv_can_ts timestamp(3)  NULL,
send_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_awk_act_all_r ADD CONSTRAINT mst_awk_act_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_awk_act_all_r', 'mst_awk_act_all', 'mst_awk_act_all_tr_r');

