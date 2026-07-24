\encoding UTF-8

CREATE TABLE mst_purc_dlv_slip_all
(dlv_slip_mng_no varchar (15) NOT NULL,
dlv_slip_mng_seq numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
dlv_slip_no varchar (15) NOT NULL,
dlv_slip_seq numeric (4,0) NOT NULL,
dlv_slip_rev numeric (4,0) NOT NULL,
slip_sts_typ varchar (1) NOT NULL,
po_no varchar (15) NOT NULL,
po_rev numeric (4,0) NOT NULL,
last_po_rev numeric (4,0) NULL,
dlv_inst_grp_no varchar (15) NULL,
prms_rcpt_grp_no varchar (15) NULL,
purc_dlv_slip_src_typ varchar (4) NOT NULL,
dpt_cd varchar (20) NULL,
usr_cd varchar (500) NULL,
dlv_rqst_tm timestamp(0)  NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
trd_cur_cd varchar (3) NULL,
trd_cur_nm varchar (40) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
base_cur_dscnt_amt numeric (21,8) NULL,
xrate numeric (21,8) NULL,
ptax_xrate numeric (21,8) NULL,
slip_line_max numeric (9,0) NOT NULL,
bp_cd varchar (20) NULL,
arr_loc_cd varchar (20) NOT NULL,
arr_loc_nm varchar (40) NULL,
arr_loc_zip_cd varchar (10) NULL,
arr_loc_addr1 varchar (250) NULL,
arr_loc_addr2 varchar (250) NULL,
arr_loc_addr3 varchar (250) NULL,
arr_loc_addr4 varchar (250) NULL,
bp_cntct_dpt varchar (100) NULL,
bp_cntct_psn varchar (100) NULL,
arr_loc_tel varchar (30) NULL,
arr_loc_fax varchar (30) NULL,
sppl_id_typ varchar (1) NULL,
sppl_id_cd varchar (20) NULL,
sppl_id_nm varchar (100) NULL,
sppl_sundry_flg char (1) DEFAULT '0' NOT NULL,
sppl_zip_cd varchar (10) NULL,
sppl_addr1 varchar (250) NULL,
sppl_addr2 varchar (250) NULL,
sppl_addr3 varchar (250) NULL,
sppl_addr4 varchar (250) NULL,
sppl_cntct_dpt varchar (100) NULL,
sppl_cntct_psn varchar (100) NULL,
sppl_tel varchar (30) NULL,
sppl_fax varchar (30) NULL,
wg_cd varchar (10) NOT NULL,
trd_rmrks varchar (100) NULL,
slip_prnt_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_purc_dlv_slip_all
ADD CONSTRAINT mst_purc_dlv_slip_all_pk PRIMARY KEY(dlv_slip_mng_no,dlv_slip_mng_seq,co_cd);


CREATE INDEX mst_purc_dlv_slip_all_ie01
ON mst_purc_dlv_slip_all USING BTREE (purc_dlv_slip_src_typ, po_no, co_cd);


CREATE INDEX mst_purc_dlv_slip_all_ie02
ON mst_purc_dlv_slip_all USING BTREE (purc_dlv_slip_src_typ, dlv_inst_grp_no, co_cd);


CREATE INDEX mst_purc_dlv_slip_all_ie03
ON mst_purc_dlv_slip_all USING BTREE (purc_dlv_slip_src_typ, prms_rcpt_grp_no, co_cd);


CREATE INDEX mst_purc_dlv_slip_all_ie04
ON mst_purc_dlv_slip_all USING BTREE (po_no, co_cd);


CREATE INDEX mst_purc_dlv_slip_all_ie05
ON mst_purc_dlv_slip_all USING BTREE (bp_cd, co_cd);


CREATE INDEX mst_purc_dlv_slip_all_ie06
ON mst_purc_dlv_slip_all USING BTREE (po_no, po_rev, last_po_rev, co_cd);

