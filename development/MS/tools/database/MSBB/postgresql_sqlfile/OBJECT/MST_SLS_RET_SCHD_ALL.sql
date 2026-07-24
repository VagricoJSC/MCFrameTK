\encoding UTF-8

CREATE TABLE mst_sls_ret_schd_all
(sls_ret_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
cst_cd varchar (20) NOT NULL,
sls_dpt_cd varchar (20) NOT NULL,
wg_cd varchar (10) NOT NULL,
sls_usr_cd varchar (500) NULL,
reg_dt timestamp(0)  NOT NULL,
sls_ret_schd_dt timestamp(0)  NOT NULL,
cst_po_no varchar (20) NULL,
trd_cur_cd varchar (3) NULL,
xrate_inpt_flg char (1) DEFAULT '0' NOT NULL,
xrate numeric (21,8) NULL,
ptax_xrate_inpt_flg char (1) DEFAULT '0' NOT NULL,
ptax_xrate numeric (21,8) NULL,
trd_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
ar_dpt_cd varchar (20) NULL,
iv_no varchar (15) NULL,
ref_iv_no varchar (15) NULL,
rcv_schd_dt timestamp(0)  NULL,
sync_flg char (1) DEFAULT '0' NOT NULL,
tterm_cd1 varchar (5) NULL,
tterm_rmrks1 varchar (100) NULL,
tterm_cd2 varchar (5) NULL,
tterm_rmrks2 varchar (100) NULL,
tterm_cd3 varchar (5) NULL,
tterm_rmrks3 varchar (100) NULL,
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


ALTER TABLE mst_sls_ret_schd_all
ADD CONSTRAINT mst_sls_ret_schd_all_pk PRIMARY KEY(sls_ret_schd_no,co_cd);


CREATE INDEX mst_sls_ret_schd_all_ie01
ON mst_sls_ret_schd_all USING BTREE (cst_cd, co_cd);


CREATE INDEX mst_sls_ret_schd_all_ie02
ON mst_sls_ret_schd_all USING BTREE (sls_dpt_cd, co_cd);


CREATE INDEX mst_sls_ret_schd_all_ie03
ON mst_sls_ret_schd_all USING BTREE (sls_usr_cd, co_cd);


CREATE INDEX mst_sls_ret_schd_all_ie04
ON mst_sls_ret_schd_all USING BTREE (reg_dt, co_cd);


CREATE INDEX mst_sls_ret_schd_all_ie05
ON mst_sls_ret_schd_all USING BTREE (sls_ret_schd_dt, co_cd);


CREATE INDEX mst_sls_ret_schd_all_ie06
ON mst_sls_ret_schd_all USING BTREE (cst_po_no, co_cd);

