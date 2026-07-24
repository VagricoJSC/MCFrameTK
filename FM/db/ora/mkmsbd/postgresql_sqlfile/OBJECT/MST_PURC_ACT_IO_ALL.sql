\encoding UTF-8

CREATE TABLE mst_purc_act_io_all
(purc_act_io_no varchar (15) NOT NULL,
purc_act_io_seq numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
purc_act_d_no varchar (15) NOT NULL,
purc_act_d_seq numeric (4,0) NOT NULL,
arr_act_no varchar (15) NULL,
purc_ret_act_io_no varchar (15) NULL,
insp_act_d_no varchar (15) NULL,
insp_judg_d_no varchar (15) NULL,
insp_act_no varchar (15) NULL,
in_to_loc_wg_cd varchar (10) NULL,
in_to_loc_cd varchar (20) NULL,
str_ln_cd varchar (10) NULL,
ver_no varchar (10) NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
gd_cd varchar (2) NULL,
quality_typ varchar (1) NULL,
stk_insp_typ varchar (1) NULL,
stk_id_typ varchar (1) NULL,
bp_lot_no varchar (15) NULL,
bp_dlv_slip_no varchar (15) NULL,
bp_dlv_slip_d_no varchar (15) NULL,
trd_unit_cd varchar (5) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
pack_unit_cd varchar (5) NOT NULL,
pack_unit_qty numeric (21,8) NOT NULL,
so_qty numeric (21,8) NULL,
gi_wg_cd varchar (10) NULL,
gi_loc_cd varchar (20) NULL,
gi_str_ln_cd varchar (10) NULL,
gi_unit_cd varchar (5) NOT NULL,
trd_cur_upri numeric (21,8) NULL,
trd_cur_proc_upri numeric (21,8) NULL,
trd_cur_onr_prov_upri numeric (21,8) NULL,
trd_cur_amt numeric (21,8) NULL,
trd_cur_proc_amt numeric (21,8) NULL,
trd_cur_onr_prov_amt numeric (21,8) NULL,
trd_cur_tax_amt numeric (21,8) NULL,
trd_cur_dscnt_amt numeric (21,8) NULL,
base_cur_upri numeric (21,8) NULL,
base_cur_proc_upri numeric (21,8) NULL,
base_cur_onr_prov_upri numeric (21,8) NULL,
base_cur_dscnt_amt numeric (21,8) NULL,
base_cur_amt numeric (21,8) NULL,
base_cur_proc_amt numeric (21,8) NULL,
base_cur_onr_prov_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
ptax_cur_upri numeric (21,8) NULL,
ptax_cur_proc_upri numeric (21,8) NULL,
ptax_cur_onr_prov_upri numeric (21,8) NULL,
ptax_cur_dscnt_amt numeric (21,8) NULL,
ptax_cur_amt numeric (21,8) NULL,
ptax_cur_proc_amt numeric (21,8) NULL,
ptax_cur_onr_prov_amt numeric (21,8) NULL,
ptax_cur_tax_amt numeric (21,8) NULL,
wtax_amt numeric (21,8) NULL,
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


ALTER TABLE mst_purc_act_io_all
ADD CONSTRAINT mst_purc_act_io_all_pk PRIMARY KEY(purc_act_io_no,purc_act_io_seq,co_cd);


CREATE INDEX mst_purc_act_io_all_ie01
ON mst_purc_act_io_all USING BTREE (purc_act_d_no,purc_act_d_seq,co_cd);


CREATE INDEX mst_purc_act_io_all_ie02
ON mst_purc_act_io_all USING BTREE (arr_act_no,co_cd);


CREATE INDEX mst_purc_act_io_all_ie03
ON mst_purc_act_io_all USING BTREE (purc_ret_act_io_no,co_cd);


CREATE INDEX mst_purc_act_io_all_ie04
ON mst_purc_act_io_all USING BTREE (insp_act_d_no,co_cd);


CREATE INDEX mst_purc_act_io_all_ie05
ON mst_purc_act_io_all USING BTREE (insp_judg_d_no,co_cd);


CREATE INDEX mst_purc_act_io_all_ie06
ON mst_purc_act_io_all USING BTREE (insp_act_no,co_cd);


CREATE INDEX mst_purc_act_io_all_ie07
ON mst_purc_act_io_all USING BTREE (in_to_loc_cd,str_ln_cd,co_cd);


CREATE INDEX mst_purc_act_io_all_ie08
ON mst_purc_act_io_all USING BTREE (lot_no, sublot_no,co_cd);

