\encoding UTF-8

CREATE TABLE mgt_pln_other_wk_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
pln_other_wk_key numeric (15) NULL,
co_cd varchar (10) NULL,
calc_ctg_cd varchar (10) NULL,
wg_cd varchar (10) NULL,
ym timestamp(0)  NULL,
dpt_cd varchar (20) NULL,
ctg_cd varchar (20) NULL,
loc_cd varchar (20) NULL,
oper_cd varchar (10) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
wk_cost_cd varchar (10) NULL,
wk_cost numeric (21,8) NULL,
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



ALTER TABLE mgt_pln_other_wk_all_r ADD CONSTRAINT mgt_pln_other_wk_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_pln_other_wk_all_r', 'mgt_pln_other_wk_all', 'mgt_pln_other_wk_all_tr_r');

