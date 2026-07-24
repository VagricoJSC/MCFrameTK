\encoding UTF-8

CREATE TABLE mst_slo_sts_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
slo_sts_no varchar (15) NULL,
co_cd varchar (10) NULL,
slo_d_no varchar (15) NULL,
slo_sts_typ varchar (3) NULL,
unit_cd varchar (5) NULL,
qty numeric (21,8) NULL,
cur_cd varchar (3) NULL,
upri numeric (21,8) NULL,
amt numeric (21,8) NULL,
tax_cd varchar (5) NULL,
tax_amt numeric (21,8) NULL,
loc_cd varchar (20) NULL,
ship_lg_grp_cd varchar (10) NULL,
alloc_grp_cd varchar (10) NULL,
slo_prms_rev numeric (4,0) NULL,
iv_no varchar (15) NULL,
iv_d_no varchar (15) NULL,
rcpt_iv_no varchar (15) NULL,
rcpt_iv_d_no varchar (15) NULL,
dlv_slip_no varchar (15) NULL,
dlv_slip_d_no varchar (15) NULL,
bill_no varchar (15) NULL,
ac_dt timestamp(0)  NULL,
biz_tm timestamp(0)  NULL,
st_schd_tm timestamp(0)  NULL,
end_schd_tm timestamp(0)  NULL,
st_act_tm timestamp(0)  NULL,
end_act_tm timestamp(0)  NULL,
ship_inst_no varchar (15) NULL,
ship_inst_d_no varchar (15) NULL,
arr_act_no varchar (15) NULL,
sls_act_no varchar (15) NULL,
sls_act_d_no varchar (15) NULL,
po_no varchar (15) NULL,
po_d_no varchar (15) NULL,
purc_act_no varchar (15) NULL,
purc_act_d_no varchar (15) NULL,
wg_rqst_no varchar (15) NULL,
dlv_inst_no varchar (15) NULL,
dlv_inst_d_no varchar (15) NULL,
dlv_inst_rcpt_no varchar (15) NULL,
itm_ord_no varchar (15) NULL,
mfg_inst_no varchar (15) NULL,
mfg_act_no varchar (15) NULL,
insp_no varchar (15) NULL,
insp_act_no varchar (15) NULL,
xfr_inst_no varchar (15) NULL,
xfr_inst_d_no varchar (15) NULL,
xfr_act_no varchar (15) NULL,
xfr_act_d_no varchar (15) NULL,
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



ALTER TABLE mst_slo_sts_all_r ADD CONSTRAINT mst_slo_sts_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_slo_sts_all_r', 'mst_slo_sts_all', 'mst_slo_sts_all_tr_r');

