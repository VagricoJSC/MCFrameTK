\encoding UTF-8

CREATE TABLE mst_iv_ship_act_d_all
(iv_ship_act_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
iv_no varchar (15) NOT NULL,
iv_d_no varchar (15) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NULL,
iv_itm_nm varchar (100) NOT NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
stk_mng_typ varchar (1) NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
ship_loc_cd varchar (20) NULL,
ship_str_ln_cd varchar (10) NULL,
arr_str_ln_cd varchar (10) NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
ver_no varchar (10) NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NULL,
stk_insp_typ varchar (1) NULL,
stk_id_typ varchar (1) NULL,
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NULL,
base_unit_qty numeric (21,8) NULL,
base_unit_cd varchar (5) NULL,
pack_unit_qty numeric (21,8) NULL,
pack_unit_cd varchar (5) NULL,
ship_act_d_no varchar (15) NULL,
io_schd_pr_no varchar (15) NULL,
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


ALTER TABLE mst_iv_ship_act_d_all
ADD CONSTRAINT mst_iv_ship_act_d_all_pk PRIMARY KEY(iv_ship_act_d_no,co_cd);


CREATE INDEX mst_iv_ship_act_d_all_ie01
ON mst_iv_ship_act_d_all USING BTREE (iv_no, co_cd);


CREATE INDEX mst_iv_ship_act_d_all_ie02
ON mst_iv_ship_act_d_all USING BTREE (iv_d_no, co_cd);


CREATE INDEX mst_iv_ship_act_d_all_ie03
ON mst_iv_ship_act_d_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mst_iv_ship_act_d_all_ie04
ON mst_iv_ship_act_d_all USING BTREE (lot_no, co_cd);


CREATE INDEX mst_iv_ship_act_d_all_ie05
ON mst_iv_ship_act_d_all USING BTREE (ship_act_d_no, co_cd);


CREATE INDEX mst_iv_ship_act_d_all_ie06
ON mst_iv_ship_act_d_all USING BTREE (io_schd_pr_no, co_cd);

