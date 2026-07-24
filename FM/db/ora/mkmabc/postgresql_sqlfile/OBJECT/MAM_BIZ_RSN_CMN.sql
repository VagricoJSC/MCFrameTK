\encoding UTF-8

CREATE TABLE mam_biz_rsn_cmn
(biz_rsn_cd varchar (10) NOT NULL,
biz_rsn_nm varchar (100) NOT NULL,
ac_rsn_cd varchar (10) NULL,
purc_flg char (1) DEFAULT '0' NOT NULL,
purc_sort_seq numeric (9,0) NULL,
purc_rtn_flg char (1) DEFAULT '0' NOT NULL,
purc_rtn_sort_seq numeric (9,0) NULL,
xpns_purc_flg char (1) DEFAULT '0' NOT NULL,
slo_xpns_purc_flg char (1) DEFAULT '0' NOT NULL,
purc_dscnt_flg char (1) DEFAULT '0' NOT NULL,
purc_dscnt_loc_mng_typ varchar (1) NULL,
purc_dscnt_sort_seq numeric (9,0) NULL,
sls_flg char (1) DEFAULT '0' NOT NULL,
sls_sort_seq numeric (9,0) NULL,
sls_rtn_flg char (1) DEFAULT '0' NOT NULL,
sls_rtn_sort_seq numeric (9,0) NULL,
sls_acxfr_flg char (1) DEFAULT '0' NOT NULL,
sls_dscnt_flg char (1) DEFAULT '0' NOT NULL,
sls_dscnt_sort_seq numeric (9,0) NULL,
acxfr_gr_flg char (1) DEFAULT '0' NOT NULL,
acxfr_gr_sort_seq numeric (9,0) NULL,
acxfr_gi_flg char (1) DEFAULT '0' NOT NULL,
acxfr_gi_sort_seq numeric (9,0) NULL,
inpt_acxfr_sort_seq numeric (9,0) NULL,
disp_flg char (1) DEFAULT '0' NOT NULL,
disp_sort_seq numeric (9,0) NULL,
stk_xfr_flg char (1) DEFAULT '0' NOT NULL,
stk_xfr_sort_seq numeric (9,0) NULL,
xfr_flg char (1) DEFAULT '0' NOT NULL,
xfr_sort_seq numeric (9,0) NULL,
yield_flg char (1) DEFAULT '0' NOT NULL,
yield_typ varchar (1) NULL,
yield_sort_seq numeric (9,0) NULL,
not_stk_flg char (1) DEFAULT '0' NOT NULL,
loss_flg char (1) DEFAULT '0' NOT NULL,
fxd_loss_flg char (1) DEFAULT '0' NOT NULL,
not_lot_trace_flg char (1) DEFAULT '0' NOT NULL,
inpt_flg char (1) DEFAULT '0' NOT NULL,
inpt_sort_seq numeric (9,0) NULL,
dfct_flg char (1) DEFAULT '0' NOT NULL,
dfct_sort_seq numeric (9,0) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NOT NULL,
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
upd_srv_req_no varchar (50) NULL
);


ALTER TABLE mam_biz_rsn_cmn
ADD CONSTRAINT mam_biz_rsn_cmn_pk PRIMARY KEY(biz_rsn_cd);


CREATE INDEX mam_biz_rsn_cmn_ie01
ON mam_biz_rsn_cmn USING BTREE (biz_rsn_nm);

