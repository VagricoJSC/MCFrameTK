\encoding UTF-8

CREATE TABLE mst_dlv_inst_send_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
data_no numeric (15,0) NOT NULL,
data_crud_typ varchar (1) NOT NULL,
exe_sts_typ varchar (1) NOT NULL,
ext_sys_cd varchar (10) NOT NULL,
po_no varchar (15) NOT NULL,
po_rev numeric (4,0) NOT NULL,
po_d_no varchar (15) NOT NULL,
dlv_inst_no varchar (15) NULL,
dlv_inst_rev numeric (4,0) NULL,
dlv_inst_d_no varchar (15) NULL,
sppl_cd varchar (20) NOT NULL,
if_sppl_cd varchar (500) NULL,
sppl_nm varchar (100) NULL,
sppl_cntry_cd varchar (2) NULL,
if_sppl_cntry_cd varchar (500) NULL,
dlv_inst_dt timestamp(0)  NULL,
dlv_inst_grp_no varchar (15) NULL,
in_to_id_typ varchar (1) NULL,
in_to_id_cd varchar (20) NULL,
if_in_to_id_cd varchar (500) NULL,
in_to_nm varchar (100) NULL,
in_to_zip_cd varchar (10) NULL,
in_to_addr1 varchar (250) NULL,
in_to_addr2 varchar (250) NULL,
in_to_addr3 varchar (250) NULL,
in_to_addr4 varchar (250) NULL,
in_to_cntct_dpt varchar (100) NULL,
in_to_cntct_psn varchar (100) NULL,
in_to_tel varchar (30) NULL,
in_to_fax varchar (30) NULL,
in_to_sundry_flg char (1) DEFAULT '0' NOT NULL,
in_to_cntry_cd varchar (2) NULL,
if_in_to_cntry_cd varchar (500) NULL,
tdlv_cd varchar (20) NULL,
if_tdlv_cd varchar (500) NULL,
tdlv_nm varchar (100) NULL,
tdlv_zip_cd varchar (10) NULL,
tdlv_addr1 varchar (250) NULL,
tdlv_addr2 varchar (250) NULL,
tdlv_addr3 varchar (250) NULL,
tdlv_addr4 varchar (250) NULL,
tdlv_cntct_dpt varchar (100) NULL,
tdlv_cntct_psn varchar (100) NULL,
tdlv_tel varchar (30) NULL,
tdlv_fax varchar (30) NULL,
tdlv_sundry_flg char (1) DEFAULT '0' NOT NULL,
tdlv_cntry_cd varchar (2) NULL,
if_tdlv_cntry_cd varchar (500) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
if_itm_cd varchar (500) NULL,
if_itm_sub1 varchar (5) NULL,
if_itm_sub2 varchar (5) NULL,
if_itm_sub3 varchar (5) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
itm_nm varchar (100) NULL,
iv_itm_nm varchar (100) NULL,
sppl_itm_cd varchar (40) NULL,
sppl_itm_nm varchar (100) NULL,
trd_unit_cd varchar (5) NULL,
if_trd_unit_cd varchar (500) NULL,
trd_unit_nm varchar (40) NULL,
trd_unit_qty numeric (21,8) NULL,
dlv_rqst_tm timestamp(0)  NULL,
dlv_inst_print_rmrks varchar (100) NULL,
dlv_inst_print_d_rmrks varchar (100) NULL,
pri_print_flg char (1) DEFAULT '0' NOT NULL,
if_co_cd varchar (500) NULL,
co_nm varchar (100) NULL,
cntry_cd varchar (2) NOT NULL,
if_cntry_cd varchar (500) NULL,
batch_log_no varchar (15) NULL,
log_sub_key1 numeric (9,0) NULL,
log_sub_key2 numeric (9,0) NULL,
sub_char1 varchar (50) NULL,
sub_char2 varchar (50) NULL,
sub_char3 varchar (50) NULL,
sub_char4 varchar (50) NULL,
sub_char5 varchar (50) NULL,
sub_char6 varchar (50) NULL,
sub_char7 varchar (50) NULL,
sub_char8 varchar (50) NULL,
sub_char9 varchar (50) NULL,
sub_char10 varchar (50) NULL,
sub_char11 varchar (50) NULL,
sub_char12 varchar (50) NULL,
sub_char13 varchar (50) NULL,
sub_char14 varchar (50) NULL,
sub_char15 varchar (50) NULL,
sub_char16 varchar (50) NULL,
sub_char17 varchar (50) NULL,
sub_char18 varchar (50) NULL,
sub_char19 varchar (50) NULL,
sub_char20 varchar (50) NULL,
sub_char21 varchar (50) NULL,
sub_char22 varchar (50) NULL,
sub_char23 varchar (50) NULL,
sub_char24 varchar (50) NULL,
sub_char25 varchar (50) NULL,
sub_char26 varchar (50) NULL,
sub_char27 varchar (50) NULL,
sub_char28 varchar (50) NULL,
sub_char29 varchar (50) NULL,
sub_char30 varchar (50) NULL,
sub_num1 numeric (21,8) NULL,
sub_num2 numeric (21,8) NULL,
sub_num3 numeric (21,8) NULL,
sub_num4 numeric (21,8) NULL,
sub_num5 numeric (21,8) NULL,
sub_dt1 timestamp(0)  NULL,
sub_dt2 timestamp(0)  NULL,
sub_dt3 timestamp(0)  NULL,
sub_dt4 timestamp(0)  NULL,
sub_dt5 timestamp(0)  NULL,
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


ALTER TABLE mst_dlv_inst_send_if_all
ADD CONSTRAINT mst_dlv_inst_send_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mst_dlv_inst_send_if_all_ie01
ON mst_dlv_inst_send_if_all USING BTREE (dlv_inst_no,dlv_inst_rev,co_cd);


CREATE INDEX mst_dlv_inst_send_if_all_ie02
ON mst_dlv_inst_send_if_all USING BTREE (dlv_inst_d_no,co_cd);


CREATE INDEX mst_dlv_inst_send_if_all_ie03
ON mst_dlv_inst_send_if_all USING BTREE (sppl_cd,co_cd);


CREATE INDEX mst_dlv_inst_send_if_all_ie04
ON mst_dlv_inst_send_if_all USING BTREE (dlv_inst_dt,co_cd);


CREATE INDEX mst_dlv_inst_send_if_all_ie05
ON mst_dlv_inst_send_if_all USING BTREE (data_no,co_cd);


CREATE INDEX mst_dlv_inst_send_if_all_ie06
ON mst_dlv_inst_send_if_all USING BTREE (exe_sts_typ,co_cd);


CREATE INDEX mst_dlv_inst_send_if_all_ie07
ON mst_dlv_inst_send_if_all USING BTREE (batch_log_no, co_cd);

