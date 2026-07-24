\encoding UTF-8

CREATE TABLE mst_arr_pr_all
(arr_pr_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
po_d_no varchar (15) NULL,
sls_ret_schd_d_no varchar (15) NULL,
dlv_slip_d_no varchar (15) NULL,
iv_d_no varchar (15) NULL,
rqst_dpt_cd varchar (20) NULL,
rqst_wg_cd varchar (10) NULL,
rqst_usr_cd varchar (500) NULL,
cst_cd varchar (20) NULL,
sret_fr_cd varchar (20) NULL,
sppl_cd varchar (20) NULL,
ret_dlv_slip_d_no varchar (15) NULL,
ret_stk_arrv_bp_cd varchar (20) NULL,
dlv_rqst_tm timestamp(0)  NULL,
prms_rcpt_dt timestamp(0)  NULL,
prms_dlv_dt timestamp(0)  NULL,
prms_refl_dt timestamp(0)  NULL,
dlv_inst_dt timestamp(0)  NULL,
dlv_inst_prms_rcpt_dt timestamp(0)  NULL,
dlv_inst_prms_refl_dt timestamp(0)  NULL,
arr_schd_tm timestamp(0)  NULL,
arr_tm timestamp(0)  NULL,
purc_dt timestamp(0)  NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
pack_unit_qty numeric (21,8) NOT NULL,
pack_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
prms_rcpt_qty numeric (21,8) NOT NULL,
prms_refl_qty numeric (21,8) NOT NULL,
dlv_inst_qty numeric (21,8) NOT NULL,
dlv_inst_prms_rcpt_qty numeric (21,8) NOT NULL,
dlv_inst_prms_refl_qty numeric (21,8) NOT NULL,
re_arr_schd_qty numeric (21,8) NOT NULL,
rcpt_iv_qty numeric (21,8) NOT NULL,
arr_qty numeric (21,8) NOT NULL,
purc_qty numeric (21,8) NOT NULL,
sls_ret_qty numeric (21,8) NOT NULL,
abort_flg char (1) DEFAULT '0' NOT NULL,
arr_schd_abort_qty numeric (21,8) NOT NULL,
purc_schd_abort_qty numeric (21,8) NOT NULL,
sls_ret_schd_abort_qty numeric (21,8) NOT NULL,
accpt_dfct_qty numeric (21,8) NOT NULL,
std_purc_lt numeric (9,0) NULL,
act_purc_lt numeric (9,0) NULL,
rsn_cd varchar (10) NULL,
bd_dpt_cd varchar (20) NULL,
bd_wg_cd varchar (10) NULL,
purc_ddlv_flg char (1) DEFAULT '0' NOT NULL,
purc_sts_typ varchar (1) NULL,
prms_dlv_dt_overdue_flg char (1) DEFAULT '0' NOT NULL,
dlv_rqst_dt_overdue_flg char (1) DEFAULT '0' NOT NULL,
arr_schd_split_flg char (1) DEFAULT '0' NOT NULL,
arr_schd_refl_flg char (1) DEFAULT '0' NOT NULL,
arr_cmpl_flg char (1) DEFAULT '0' NOT NULL,
purc_cmpl_flg char (1) DEFAULT '0' NOT NULL,
sls_ret_cmpl_flg char (1) DEFAULT '0' NOT NULL,
arr_cnt_rmrks varchar (100) NULL,
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


ALTER TABLE mst_arr_pr_all
ADD CONSTRAINT mst_arr_pr_all_pk PRIMARY KEY(arr_pr_no,co_cd);


CREATE INDEX mst_arr_pr_all_ie01
ON mst_arr_pr_all USING BTREE (po_d_no, co_cd);


CREATE INDEX mst_arr_pr_all_ie02
ON mst_arr_pr_all USING BTREE (sls_ret_schd_d_no, co_cd);


CREATE INDEX mst_arr_pr_all_ie03
ON mst_arr_pr_all USING BTREE (dlv_slip_d_no, co_cd);


CREATE INDEX mst_arr_pr_all_ie04
ON mst_arr_pr_all USING BTREE (iv_d_no, co_cd);


CREATE INDEX mst_arr_pr_all_ie05
ON mst_arr_pr_all USING BTREE (cst_cd, co_cd);


CREATE INDEX mst_arr_pr_all_ie06
ON mst_arr_pr_all USING BTREE (sppl_cd, co_cd);


CREATE INDEX mst_arr_pr_all_ie07
ON mst_arr_pr_all USING BTREE (ret_dlv_slip_d_no, co_cd);


CREATE INDEX mst_arr_pr_all_ie08
ON mst_arr_pr_all USING BTREE (dlv_rqst_tm, co_cd);

