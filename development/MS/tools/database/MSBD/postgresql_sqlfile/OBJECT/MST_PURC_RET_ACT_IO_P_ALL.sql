\encoding UTF-8

CREATE TABLE mst_purc_ret_act_io_p_all
(purc_ret_act_io_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
purc_ret_act_no varchar (15) NOT NULL,
purc_ret_act_d_no varchar (15) NOT NULL,
purc_ret_act_rev numeric (4,0) NOT NULL,
purc_ret_loc_wg_cd varchar (10) NOT NULL,
purc_ret_loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
ver_no varchar (10) NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
bp_lot_no varchar (15) NULL,
stk_id_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
quality_typ varchar (1) NOT NULL,
gd_cd varchar (2) NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
in_xfr_typ varchar (1) NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
pack_unit_cd varchar (5) NOT NULL,
pack_unit_qty numeric (21,8) NOT NULL,
purc_cont_qty numeric (21,8) NULL,
ref_arr_act_no varchar (15) NULL,
ref_arr_act_rev numeric (4,0) NULL,
ref_purc_act_io_no varchar (15) NULL,
ref_purc_act_io_seq numeric (4,0) NULL,
purc_ret_schd_io_no varchar (15) NULL,
sls_act_io_no varchar (15) NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_purc_ret_act_io_p_all
ADD CONSTRAINT mst_purc_ret_act_io_p_all_pk PRIMARY KEY(purc_ret_act_io_no,co_cd,purc_ret_act_rev);


CREATE INDEX mst_purc_ret_act_io_p_all_ie01
ON mst_purc_ret_act_io_p_all USING BTREE (purc_ret_act_no, purc_ret_act_rev, co_cd);

