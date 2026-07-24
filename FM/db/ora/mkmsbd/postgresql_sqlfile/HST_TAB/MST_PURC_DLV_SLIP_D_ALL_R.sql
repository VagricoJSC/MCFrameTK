\encoding UTF-8

CREATE TABLE mst_purc_dlv_slip_d_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
dlv_slip_mng_d_no varchar (15) NULL,
dlv_slip_mng_d_seq numeric (4,0) NULL,
co_cd varchar (10) NULL,
dlv_slip_d_no varchar (15) NULL,
dlv_slip_d_seq numeric (4,0) NULL,
dlv_slip_mng_no varchar (15) NULL,
dlv_slip_mng_seq numeric (4,0) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
str_ln_cd varchar (10) DEFAULT '*' NULL,
trd_unit_qty numeric (21,8) NULL,
trd_unit_po_qty numeric (21,8) NULL,
trd_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
base_unit_po_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
interim_flg char (1) DEFAULT '0' NULL,
pri_prnt_flg char (1) DEFAULT '0' NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
tax_cd varchar (5) NULL,
wtax_rate numeric (5,2) NULL,
wtax_amt numeric (21,8) NULL,
sppl_itm_cd varchar (40) NULL,
sppl_itm_nm varchar (100) NULL,
po_d_no varchar (15) NULL,
dlv_inst_d_no varchar (20) NULL,
prms_rcpt_d_no varchar (15) NULL,
trd_d_rmrks varchar (100) NULL,
purc_ddlv_dlv_slip_no varchar (15) NULL,
purc_ddlv_dlv_slip_seq numeric (4,0) NULL,
purc_ddlv_dlv_slip_d_no varchar (15) NULL,
prov_ddlv_flg char (1) DEFAULT '0' NULL,
purc_ddlv_flg char (1) DEFAULT '0' NULL,
dlv_slip_invalid_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_purc_dlv_slip_d_all_r ADD CONSTRAINT mst_purc_dlv_slip_d_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_purc_dlv_slip_d_all_r', 'mst_purc_dlv_slip_d_all', 'mst_purc_dlv_slip_d_all_tr_r');

