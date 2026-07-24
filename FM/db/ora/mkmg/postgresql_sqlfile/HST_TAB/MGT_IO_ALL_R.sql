\encoding UTF-8

CREATE TABLE mgt_io_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
calc_no varchar (15) NULL,
calc_grp_cd varchar (10) NULL,
wg_cd varchar (10) NULL,
ym timestamp(0)  NULL,
mng_dpt_cd varchar (20) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
lot_no varchar (15) DEFAULT '*' NULL,
sublot_no varchar (15) DEFAULT '*' NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
asst_typ varchar (1) NULL,
co_cd varchar (10) NULL,
std_qty numeric (21,8) NULL,
ave_upri numeric (21,8) NULL,
std_upri numeric (21,8) NULL,
st_stk_qty numeric (21,8) NULL,
st_stk_amt numeric (21,8) NULL,
mfg_qty numeric (21,8) NULL,
mfg_amt numeric (21,8) NULL,
purc_qty numeric (21,8) NULL,
purc_amt numeric (21,8) NULL,
mfg_gr_qty numeric (21,8) NULL,
mfg_gr_amt numeric (21,8) NULL,
othr_gr_qty numeric (21,8) NULL,
othr_gr_amt numeric (21,8) NULL,
alc_amt numeric (21,8) DEFAULT 0 NULL,
inpt_qty numeric (21,8) NULL,
inpt_amt numeric (21,8) NULL,
plnt_gi_qty numeric (21,8) NULL,
plnt_gi_amt numeric (21,8) NULL,
othr_gi_qty numeric (21,8) NULL,
othr_gi_amt numeric (21,8) NULL,
prov_qty numeric (21,8) NULL,
prov_amt numeric (21,8) NULL,
sls_qty numeric (21,8) NULL,
sls_amt numeric (21,8) NULL,
end_stk_qty numeric (21,8) NULL,
end_stk_amt numeric (21,8) NULL,
diff_qty numeric (21,8) NULL,
diff_amt numeric (21,8) NULL,
xpns_inpt_qty numeric (21,8) NULL,
xpns_inpt_amt numeric (21,8) NULL,
ym_sub timestamp(0)  NULL,
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



ALTER TABLE mgt_io_all_r ADD CONSTRAINT mgt_io_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_io_all_r', 'mgt_io_all', 'mgt_io_all_tr_r');

