\encoding UTF-8

CREATE TABLE mst_rcpt_iv_all
(rcpt_iv_mng_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
rcpt_iv_rev numeric (4,0) NOT NULL,
rcpt_iv_no varchar (15) NOT NULL,
rcpt_iv_src_typ varchar (2) NOT NULL,
purc_schd_dt timestamp(0)  NULL,
purc_dt timestamp(0)  NULL,
iv_dt timestamp(0)  NOT NULL,
purc_ac_schd_dt timestamp(0)  NULL,
sppl_cd varchar (20) NOT NULL,
in_to_id_typ varchar (1) NULL,
in_to_id_cd varchar (20) NULL,
in_to_id_nm varchar (100) NULL,
in_to_zip_cd varchar (10) NULL,
in_to_addr1 varchar (250) NULL,
in_to_addr2 varchar (250) NULL,
in_to_addr3 varchar (250) NULL,
in_to_addr4 varchar (250) NULL,
in_to_cntct_dpt varchar (100) NULL,
in_to_cntct_psn varchar (100) NULL,
in_to_tel varchar (30) NULL,
in_to_fax varchar (30) NULL,
in_to_cntry_cd varchar (2) NULL,
in_to_sundry_flg char (1) DEFAULT '0' NOT NULL,
trnspt_cd varchar (5) NULL,
vssl_flght varchar (40) NULL,
load_port_cd varchar (5) NULL,
etd_dt timestamp(0)  NULL,
dschrg_port_cd varchar (5) NULL,
eta_dt timestamp(0)  NULL,
via_port_cd varchar (5) NULL,
via_schd_dt timestamp(0)  NULL,
tterm_cd1 varchar (5) NULL,
tterm_rmrks1 varchar (100) NULL,
tterm_cd2 varchar (5) NULL,
tterm_rmrks2 varchar (100) NULL,
tterm_cd3 varchar (5) NULL,
tterm_rmrks3 varchar (100) NULL,
trd_cur_cd varchar (3) NULL,
ptax_cur_cd varchar (3) NULL,
xrate_inpt_flg char (1) DEFAULT '0' NOT NULL,
xrate numeric (21,8) NOT NULL,
ptax_xrate numeric (21,8) NULL,
ptax_xrate_inpt_flg char (1) DEFAULT '0' NOT NULL,
pay_basis_dt timestamp(0)  NULL,
pay_schd_dt timestamp(0)  NULL,
trd_rmrks varchar (100) NULL,
rcpt_iv_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
purc_cmpl_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_rcpt_iv_all
ADD CONSTRAINT mst_rcpt_iv_all_pk PRIMARY KEY(rcpt_iv_mng_no,co_cd);


CREATE INDEX mst_rcpt_iv_all_ie01
ON mst_rcpt_iv_all USING BTREE (rcpt_iv_no, co_cd);


CREATE INDEX mst_rcpt_iv_all_ie02
ON mst_rcpt_iv_all USING BTREE (iv_dt, co_cd);


CREATE INDEX mst_rcpt_iv_all_ie03
ON mst_rcpt_iv_all USING BTREE (sppl_cd, co_cd);


CREATE INDEX mst_rcpt_iv_all_ie04
ON mst_rcpt_iv_all USING BTREE (purc_schd_dt, co_cd);

