\encoding UTF-8

CREATE TABLE mst_mly_wip_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
ym timestamp(0)  NULL,
itm_mfg_inst_no varchar (15) NULL,
mfg_act_no varchar (15) NULL,
co_cd varchar (10) NULL,
itm_ord_no varchar (15) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
loc_cd varchar (20) NULL,
str_ln_cd varchar (10) DEFAULT '*' NULL,
asst_typ varchar (1) NULL,
in_xfr_typ varchar (1) NULL,
quality_typ varchar (1) NULL,
stk_insp_typ varchar (1) NULL,
stk_id_typ varchar (1) NULL,
gd_cd varchar (2) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
sno1 varchar (15) DEFAULT '*' NULL,
sno2 varchar (15) DEFAULT '*' NULL,
sno3 varchar (15) DEFAULT '*' NULL,
sno4 varchar (15) DEFAULT '*' NULL,
st_ac_dt timestamp(0)  NULL,
base_unit_schd_qty numeric (21,8) NULL,
base_unit_act_qty numeric (21,8) NULL,
end_ac_dt timestamp(0)  NULL,
base_unit_cd varchar (5) NULL,
base_unit_wip_qty numeric (21,8) NULL,
wip_rate numeric (5,2) NULL,
cmpl_flg char (1) DEFAULT '0' NULL,
closing_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mst_mly_wip_all_r ADD CONSTRAINT mst_mly_wip_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_mly_wip_all_r', 'mst_mly_wip_all', 'mst_mly_wip_all_tr_r');

