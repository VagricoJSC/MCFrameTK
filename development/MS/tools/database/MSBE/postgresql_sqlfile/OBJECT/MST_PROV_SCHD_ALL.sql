\encoding UTF-8

CREATE TABLE mst_prov_schd_all
(prov_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
prov_src_schd_typ varchar (1) NOT NULL,
prov_src_schd_no1 varchar (15) DEFAULT '*' NOT NULL,
prov_src_schd_no2 varchar (15) DEFAULT '*' NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
xfr_rsn_cd varchar (10) NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
accpt_schd_dt timestamp(0)  NOT NULL,
wg_cd varchar (10) NOT NULL,
prsppl_cd varchar (20) NOT NULL,
prov_typ varchar (1) NOT NULL,
prov_basis_typ varchar (1) NULL,
xrate_inpt_flg char (1) DEFAULT '0' NOT NULL,
xrate numeric (21,8) NULL,
ptax_xrate_inpt_flg char (1) DEFAULT '0' NOT NULL,
ptax_xrate numeric (21,8) NULL,
trd_cur_cd varchar (3) NULL,
tax_fix_flg char (1) DEFAULT '0' NOT NULL,
tax_cd varchar (5) NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
wtax_rate numeric (5,2) NULL,
wtax_amt numeric (21,8) NULL,
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


ALTER TABLE mst_prov_schd_all
ADD CONSTRAINT mst_prov_schd_all_pk PRIMARY KEY(prov_schd_no,co_cd);


CREATE INDEX mst_prov_schd_all_ie01
ON mst_prov_schd_all USING BTREE (prov_src_schd_no1, prov_src_schd_typ, co_cd);


CREATE INDEX mst_prov_schd_all_ie02
ON mst_prov_schd_all USING BTREE (prov_src_schd_no2, prov_src_schd_typ, co_cd);


CREATE INDEX mst_prov_schd_all_ie03
ON mst_prov_schd_all USING BTREE (accpt_schd_dt, co_cd);


CREATE INDEX mst_prov_schd_all_ie04
ON mst_prov_schd_all USING BTREE (prov_src_schd_typ, co_cd);

