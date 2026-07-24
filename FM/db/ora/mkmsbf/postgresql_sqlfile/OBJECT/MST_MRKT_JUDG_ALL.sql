\encoding UTF-8

CREATE TABLE mst_mrkt_judg_all
(mrkt_judg_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
mrkt_judg_sts_typ varchar (1) NOT NULL,
mrkt_judg_upd_role_cd varchar (10) NULL,
upd_usr_cd varchar (500) NULL,
upd_dpt_cd varchar (20) NULL,
upd_dt timestamp(0)  NULL,
mrkt_judg_role_cd varchar (10) NULL,
judg_usr_cd varchar (500) NULL,
main_flg char (1) DEFAULT '0' NOT NULL,
judg_dpt_cd varchar (20) NULL,
judg_dt timestamp(0)  NULL,
mfg_so_aprv_typ varchar (1) NULL,
quality_mng_typ varchar (1) NULL,
mfg_mng_typ varchar (1) NULL,
deviant_typ varchar (1) NULL,
deviant_msr_typ varchar (1) NULL,
prod_itm_info_typ varchar (1) NULL,
chd_itm_info_typ varchar (1) NULL,
mrkt_judg_prnt_flg char (1) DEFAULT '0' NOT NULL,
mrkt_judg_prnt_tm timestamp(0)  NULL,
seq numeric (3,0) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
vld_dt timestamp(0)  NULL,
judg_rsn varchar (100) NULL,
site_cd varchar (10) NULL,
add_flg char (1) DEFAULT '0' NOT NULL,
no_del_flg char (1) DEFAULT '0' NOT NULL,
intr_rmrks varchar (100) NULL,
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


ALTER TABLE mst_mrkt_judg_all
ADD CONSTRAINT mst_mrkt_judg_all_pk PRIMARY KEY(mrkt_judg_no,co_cd);


CREATE INDEX mst_mrkt_judg_all_ie01
ON mst_mrkt_judg_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,co_cd);


CREATE INDEX mst_mrkt_judg_all_ie02
ON mst_mrkt_judg_all USING BTREE (lot_no,co_cd);

