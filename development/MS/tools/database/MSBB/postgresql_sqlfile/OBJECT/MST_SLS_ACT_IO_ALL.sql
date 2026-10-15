\encoding UTF-8

CREATE TABLE mst_sls_act_io_all
(sls_act_io_no varchar (15) NOT NULL,
sls_act_io_seq numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
sls_act_d_no varchar (15) NOT NULL,
sls_act_d_seq numeric (4,0) NOT NULL,
ship_act_d_no varchar (15) NULL,
iv_ship_act_d_no varchar (15) NULL,
arr_act_no varchar (15) NULL,
purc_act_io_no varchar (15) NULL,
gd_cd varchar (2) NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) DEFAULT '*' NULL,
lot_no varchar (15) DEFAULT '*' NULL,
sublot_no varchar (15) DEFAULT '*' NULL,
sno1 varchar (20) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
pack_unit_cd varchar (5) NOT NULL,
pack_unit_qty numeric (21,8) NOT NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
base_cur_upri numeric (21,8) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_dscnt_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
ptax_cur_upri numeric (21,8) NULL,
ptax_cur_amt numeric (21,8) NULL,
ptax_cur_dscnt_amt numeric (21,8) NULL,
ptax_cur_tax_amt numeric (21,8) NULL,
sync_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_sls_act_io_all
ADD CONSTRAINT mst_sls_act_io_all_pk PRIMARY KEY(sls_act_io_no,sls_act_io_seq,co_cd);


CREATE INDEX mst_sls_act_io_all_ie01
ON mst_sls_act_io_all USING BTREE (sls_act_d_no, sls_act_d_seq, co_cd);


CREATE INDEX mst_sls_act_io_all_ie02
ON mst_sls_act_io_all USING BTREE (ship_act_d_no, co_cd);


CREATE INDEX mst_sls_act_io_all_ie03
ON mst_sls_act_io_all USING BTREE (iv_ship_act_d_no, co_cd);


CREATE INDEX mst_sls_act_io_all_ie04
ON mst_sls_act_io_all USING BTREE (arr_act_no, co_cd);


CREATE INDEX mst_sls_act_io_all_ie05
ON mst_sls_act_io_all USING BTREE (purc_act_io_no, co_cd);

