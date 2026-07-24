\encoding UTF-8

CREATE TABLE mst_purc_ret_act_all
(purc_ret_act_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
purc_ret_act_rev numeric (4,0) NOT NULL,
purc_ret_schd_no varchar (15) NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
ac_dt timestamp(0)  NOT NULL,
purc_usr_cd varchar (500) NULL,
purc_dpt_cd varchar (20) NOT NULL,
wg_cd varchar (10) NOT NULL,
sppl_cd varchar (20) NOT NULL,
sppl_cntct_dpt varchar (100) NULL,
sppl_cntct_psn varchar (100) NULL,
sppl_zip_cd varchar (10) NULL,
sppl_addr1 varchar (250) NULL,
sppl_addr2 varchar (250) NULL,
sppl_addr3 varchar (250) NULL,
sppl_addr4 varchar (250) NULL,
sppl_tel varchar (30) NULL,
sppl_fax varchar (30) NULL,
ret_sppl_nm varchar (100) NULL,
ret_sppl_cntct_dpt varchar (100) NULL,
ret_sppl_cntct_psn varchar (100) NULL,
ret_sppl_cntct_psn_title varchar (10) NULL,
ret_sppl_zip_cd varchar (10) NULL,
ret_sppl_addr1 varchar (250) NULL,
ret_sppl_addr2 varchar (250) NULL,
ret_sppl_addr3 varchar (250) NULL,
ret_sppl_addr4 varchar (250) NULL,
ret_sppl_tel varchar (30) NULL,
ret_sppl_fax varchar (30) NULL,
purc_ret_dt timestamp(0)  NOT NULL,
purc_ret_print_dt timestamp(0)  NULL,
purc_ret_print_flg char (1) DEFAULT '0' NOT NULL,
last_purc_ret_print_rev numeric (4,0) NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
rcpt_iv_no varchar (15) NULL,
ref_rcpt_iv_no varchar (15) NULL,
tterm_cd1 varchar (5) NULL,
tterm_rmrks1 varchar (100) NULL,
tterm_cd2 varchar (5) NULL,
tterm_rmrks2 varchar (100) NULL,
tterm_cd3 varchar (5) NULL,
tterm_rmrks3 varchar (100) NULL,
trd_rmrks varchar (100) NULL,
intr_rmrks varchar (100) NULL,
purc_ret_print_rmrks varchar (100) NULL,
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


ALTER TABLE mst_purc_ret_act_all
ADD CONSTRAINT mst_purc_ret_act_all_pk PRIMARY KEY(purc_ret_act_no,co_cd);


CREATE INDEX mst_purc_ret_act_all_ie01
ON mst_purc_ret_act_all USING BTREE (purc_ret_schd_no,co_cd);


CREATE INDEX mst_purc_ret_act_all_ie02
ON mst_purc_ret_act_all USING BTREE (sppl_cd,co_cd);

