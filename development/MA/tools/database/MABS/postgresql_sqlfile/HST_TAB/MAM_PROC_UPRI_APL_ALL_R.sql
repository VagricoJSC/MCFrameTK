\encoding UTF-8

CREATE TABLE mam_proc_upri_apl_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
sppl_cd varchar (20) NULL,
maker_cd varchar (20) DEFAULT '*' NULL,
unit_cd varchar (5) NULL,
lot_qty numeric (21,8) NULL,
cur_cd varchar (3) NULL,
proc_upri_typ varchar (1) NULL,
loc_cd varchar (20) DEFAULT '*' NULL,
dlv_cd varchar (20) DEFAULT '*' NULL,
wg_cd varchar (10) DEFAULT '*' NULL,
st_dt timestamp(0)  NULL,
co_cd varchar (10) NULL,
end_dt timestamp(0)  NULL,
upri numeric (21,8) NULL,
upri_bf numeric (21,8) NULL,
interim_flg char (1) DEFAULT '0' NULL,
std_wk_cost numeric (21,8) NULL,
std_wk_cost_upri numeric (21,8) NULL,
not_cost_flg char (1) DEFAULT '0' NULL,
sub_upri1 numeric (21,8) NULL,
sub_upri2 numeric (21,8) NULL,
sub_upri3 numeric (21,8) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NULL,
del_usr_id varchar (500) NULL,
del_usr_nm varchar (100) NULL,
del_ts timestamp(3)  NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (100) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (100) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL,
apl_no varchar (15) NULL,
st_dt_bf timestamp(0)  NULL,
aprv_no varchar (15) NULL,
ref_flg char (1) DEFAULT '0' NULL,
mst_apl_memo varchar (100) NULL
);



ALTER TABLE mam_proc_upri_apl_all_r ADD CONSTRAINT mam_proc_upri_apl_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_proc_upri_apl_all_r', 'mam_proc_upri_apl_all', 'mam_proc_upri_apl_all_tr_r');

