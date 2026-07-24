\encoding UTF-8

CREATE TABLE mst_purc_dlv_slip_d_all
(dlv_slip_mng_d_no varchar (15) NOT NULL,
dlv_slip_mng_d_seq numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
dlv_slip_d_no varchar (15) NOT NULL,
dlv_slip_d_seq numeric (4,0) NOT NULL,
dlv_slip_mng_no varchar (15) NOT NULL,
dlv_slip_mng_seq numeric (4,0) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_po_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_po_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
interim_flg char (1) DEFAULT '0' NOT NULL,
pri_prnt_flg char (1) DEFAULT '0' NOT NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
tax_cd varchar (5) NULL,
wtax_rate numeric (5,2) NULL,
wtax_amt numeric (21,8) NULL,
sppl_itm_cd varchar (40) NULL,
sppl_itm_nm varchar (100) NULL,
po_d_no varchar (15) NOT NULL,
dlv_inst_d_no varchar (20) NULL,
prms_rcpt_d_no varchar (15) NULL,
trd_d_rmrks varchar (100) NULL,
purc_ddlv_dlv_slip_no varchar (15) NULL,
purc_ddlv_dlv_slip_seq numeric (4,0) NULL,
purc_ddlv_dlv_slip_d_no varchar (15) NULL,
prov_ddlv_flg char (1) DEFAULT '0' NOT NULL,
purc_ddlv_flg char (1) DEFAULT '0' NOT NULL,
dlv_slip_invalid_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_purc_dlv_slip_d_all
ADD CONSTRAINT mst_purc_dlv_slip_d_all_pk PRIMARY KEY(dlv_slip_mng_d_no,dlv_slip_mng_d_seq,co_cd);


CREATE INDEX mst_purc_dlv_slip_d_all_ie01
ON mst_purc_dlv_slip_d_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_purc_dlv_slip_d_all_ie02
ON mst_purc_dlv_slip_d_all USING BTREE (prms_rcpt_d_no,co_cd);


CREATE INDEX mst_purc_dlv_slip_d_all_ie03
ON mst_purc_dlv_slip_d_all USING BTREE (purc_ddlv_dlv_slip_no,purc_ddlv_dlv_slip_seq,co_cd);


CREATE INDEX mst_purc_dlv_slip_d_all_ie04
ON mst_purc_dlv_slip_d_all USING BTREE (purc_ddlv_dlv_slip_d_no,co_cd);

