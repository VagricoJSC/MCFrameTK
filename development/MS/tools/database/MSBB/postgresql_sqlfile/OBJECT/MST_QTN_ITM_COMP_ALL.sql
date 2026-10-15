\encoding UTF-8

CREATE TABLE mst_qtn_itm_comp_all
(qtn_itm_comp_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
qtn_d_no varchar (15) NOT NULL,
qtn_itm_comp_lno varchar (3) NOT NULL,
sls_itm_comp_no varchar (15) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
sno1 varchar (20) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
core_itm_flg char (1) DEFAULT '0' NOT NULL,
mst_flg char (1) DEFAULT '0' NOT NULL,
std_comp_flg char (1) DEFAULT '0' NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
trd_cur_std_sls_upri numeric (21,8) NOT NULL,
trd_cur_std_sls_amt numeric (21,8) NOT NULL,
upri_rate numeric (5,2) NOT NULL,
trd_cur_upri numeric (21,8) NOT NULL,
trd_cur_amt numeric (21,8) NOT NULL,
cost_upri numeric (21,8) NULL,
cost_amt numeric (21,8) NULL,
rmrks varchar (100) NULL,
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


ALTER TABLE mst_qtn_itm_comp_all
ADD CONSTRAINT mst_qtn_itm_comp_all_pk PRIMARY KEY(qtn_itm_comp_no,co_cd);


CREATE INDEX mst_qtn_itm_comp_all_ie01
ON mst_qtn_itm_comp_all USING BTREE (qtn_d_no, co_cd);

