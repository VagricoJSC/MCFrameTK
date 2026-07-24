\encoding UTF-8

CREATE TABLE mst_prov_schd_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
prov_schd_no varchar (15) NULL,
co_cd varchar (10) NULL,
prov_src_schd_typ varchar (1) NULL,
prov_src_schd_no1 varchar (15) DEFAULT '*' NULL,
prov_src_schd_no2 varchar (15) DEFAULT '*' NULL,
trd_cd varchar (4) NULL,
trd_ptn_typ varchar (4) NULL,
xfr_rsn_cd varchar (10) NULL,
base_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
accpt_schd_dt timestamp(0)  NULL,
wg_cd varchar (10) NULL,
prsppl_cd varchar (20) NULL,
prov_typ varchar (1) NULL,
prov_basis_typ varchar (1) NULL,
xrate_inpt_flg char (1) DEFAULT '0' NULL,
xrate numeric (21,8) NULL,
ptax_xrate_inpt_flg char (1) DEFAULT '0' NULL,
ptax_xrate numeric (21,8) NULL,
trd_cur_cd varchar (3) NULL,
tax_fix_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_prov_schd_all_r ADD CONSTRAINT mst_prov_schd_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_prov_schd_all_r', 'mst_prov_schd_all', 'mst_prov_schd_all_tr_r');

