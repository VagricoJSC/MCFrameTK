\encoding UTF-8

CREATE TABLE mst_ship_pr_all
(ship_pr_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
slo_d_no varchar (15) NULL,
xfr_schd_no varchar (15) NULL,
rqst_dpt_cd varchar (20) NULL,
rqst_usr_cd varchar (500) NULL,
cst_cd varchar (20) NULL,
ship_rqst_tm timestamp(0)  NULL,
dlv_rqst_tm timestamp(0)  NULL,
prms_dt timestamp(0)  NULL,
prms_dlv_dt timestamp(0)  NULL,
dlv_inst_rcpt_dt timestamp(0)  NULL,
dlv_inst_prms_dt timestamp(0)  NULL,
ship_schd_tm timestamp(0)  NULL,
dlv_schd_tm timestamp(0)  NULL,
ship_tm timestamp(0)  NULL,
dlv_tm timestamp(0)  NULL,
sls_dt timestamp(0)  NULL,
ship_to_lg_grp_cd varchar (10) NULL,
dlv_id_typ varchar (1) NOT NULL,
dlv_id_cd varchar (20) NOT NULL,
dlv_id_nm varchar (100) NULL,
dlv_zip_cd varchar (10) NULL,
dlv_addr1 varchar (250) NULL,
dlv_addr2 varchar (250) NULL,
dlv_addr3 varchar (250) NULL,
dlv_addr4 varchar (250) NULL,
dlv_cntct_dpt varchar (100) NULL,
dlv_cntct_psn varchar (100) NULL,
dlv_tel varchar (30) NULL,
dlv_fax varchar (30) NULL,
dlv_sundry_flg char (1) DEFAULT '0' NOT NULL,
dlv_str_ln_cd varchar (10) NULL,
ship_to_id_typ varchar (1) NOT NULL,
ship_to_id_cd varchar (20) NOT NULL,
ship_to_id_nm varchar (100) NULL,
ship_to_zip_cd varchar (10) NULL,
ship_to_addr1 varchar (250) NULL,
ship_to_addr2 varchar (250) NULL,
ship_to_addr3 varchar (250) NULL,
ship_to_addr4 varchar (250) NULL,
ship_to_cntct_dpt varchar (100) NULL,
ship_to_cntct_psn varchar (100) NULL,
ship_to_tel varchar (30) NULL,
ship_to_fax varchar (30) NULL,
ship_to_sundry_flg char (1) DEFAULT '0' NOT NULL,
via_dlv_typ varchar (1) NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
prms_qty numeric (21,8) NOT NULL,
dlv_inst_rcpt_qty numeric (21,8) NOT NULL,
dlv_inst_prms_qty numeric (21,8) NOT NULL,
re_ship_schd_qty numeric (21,8) NOT NULL,
ship_inst_qty numeric (21,8) NOT NULL,
ship_act_qty numeric (21,8) NOT NULL,
iv_schd_qty numeric (21,8) NOT NULL,
iv_act_qty numeric (21,8) NOT NULL,
sls_qty numeric (21,8) NOT NULL,
dlv_qty numeric (21,8) NOT NULL,
ship_ret_qty numeric (21,8) NOT NULL,
abort_flg char (1) DEFAULT '0' NOT NULL,
ship_schd_abort_qty numeric (21,8) NOT NULL,
sls_schd_abort_qty numeric (21,8) NOT NULL,
act_dlv_lt numeric (9,0) NULL,
rsn_cd varchar (10) NULL,
bd_dpt_cd varchar (20) NULL,
ship_term_cd varchar (5) NULL,
ship_inst_typ varchar (1) NOT NULL,
purc_ddlv_flg char (1) DEFAULT '0' NOT NULL,
ship_schd_split_typ varchar (1) NOT NULL,
alloc_scope_typ varchar (1) NOT NULL,
alloc_typ varchar (1) NOT NULL,
alloc_grp_cd varchar (10) NULL,
ship_lg_grp_cd varchar (10) NULL,
def_loc_cd varchar (20) NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) NULL,
period_block_flg char (1) DEFAULT '0' NOT NULL,
sls_sts_typ varchar (1) NULL,
prms_dlv_dt_overdue_flg char (1) DEFAULT '0' NOT NULL,
dlv_rqst_dt_overdue_flg char (1) DEFAULT '0' NOT NULL,
ship_schd_split_flg char (1) DEFAULT '0' NOT NULL,
ship_cmpl_flg char (1) DEFAULT '0' NOT NULL,
sls_cmpl_flg char (1) DEFAULT '0' NOT NULL,
dlv_cmpl_flg char (1) DEFAULT '0' NOT NULL,
ship_cnt_rmrks varchar (100) NULL,
io_schd_pr_no varchar (15) NULL,
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
upd_srv_req_no varchar (50) NULL,
not_lg_mix_flg char (1) DEFAULT '0' NOT NULL
);


ALTER TABLE mst_ship_pr_all
ADD CONSTRAINT mst_ship_pr_all_pk PRIMARY KEY(ship_pr_no,co_cd);


CREATE INDEX mst_ship_pr_all_ie01
ON mst_ship_pr_all USING BTREE (slo_d_no, co_cd);


CREATE INDEX mst_ship_pr_all_ie02
ON mst_ship_pr_all USING BTREE (xfr_schd_no, co_cd);


CREATE INDEX mst_ship_pr_all_ie03
ON mst_ship_pr_all USING BTREE (cst_cd, co_cd);


CREATE INDEX mst_ship_pr_all_ie04
ON mst_ship_pr_all USING BTREE (ship_rqst_tm, co_cd);


CREATE INDEX mst_ship_pr_all_ie05
ON mst_ship_pr_all USING BTREE (dlv_rqst_tm, co_cd);

