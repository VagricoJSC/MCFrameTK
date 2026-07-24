\encoding UTF-8

CREATE TABLE mst_ordsnd_itm_dtl_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
data_no numeric (15,0) NOT NULL,
exe_sts_typ varchar (1) NOT NULL,
data_crud_typ varchar (1) NOT NULL,
ext_sys_cd varchar (10) NOT NULL,
if_wg_cd varchar (10) NULL,
wg_cd varchar (10) NOT NULL,
if_itm_cd varchar (40) NULL,
if_itm_sub1 varchar (5) NULL,
if_itm_sub2 varchar (5) NULL,
if_itm_sub3 varchar (5) NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) NOT NULL,
itm_sub2 varchar (5) NOT NULL,
itm_sub3 varchar (5) NOT NULL,
if_mfg_loc_cd varchar (20) NULL,
mfg_loc_cd varchar (20) NOT NULL,
bom_ptn varchar (40) NOT NULL,
st_dt timestamp(0)  NOT NULL,
end_dt timestamp(0)  NOT NULL,
oper_ptn varchar (40) NULL,
mfg_lt numeric (9,0) NULL,
mfg_lt_add_qty numeric (21,8) NULL,
purc_lt numeric (9,0) NULL,
purc_lt_add_qty numeric (21,8) NULL,
accpt_insp_lt numeric (9,0) NULL,
buf_lt numeric (9,0) NULL,
sz_day_week_typ varchar (1) NULL,
sz_week numeric (3,0) NULL,
lot_sz_pd numeric (3,0) NULL,
min_lot_qty numeric (21,8) NOT NULL,
batch_lot_qty numeric (21,8) NOT NULL,
max_lot_qty numeric (21,8) NOT NULL,
max_order numeric (9,0) NULL,
prio numeric (9,0) NULL,
order_ratio numeric (21,8) NOT NULL,
yield_schd_qty numeric (21,8) NOT NULL,
mfg_inst_qty numeric (21,8) NOT NULL,
fxd_rqmt_qty numeric (21,8) NULL,
sno1 varchar (15) NULL,
sno2 varchar (15) NULL,
sno3 varchar (15) NULL,
sno4 varchar (15) NULL,
sub_char1 varchar (50) NULL,
sub_char2 varchar (50) NULL,
sub_char3 varchar (50) NULL,
sub_char4 varchar (50) NULL,
sub_char5 varchar (50) NULL,
sub_char6 varchar (50) NULL,
sub_char7 varchar (50) NULL,
sub_char8 varchar (50) NULL,
sub_char9 varchar (50) NULL,
sub_char10 varchar (50) NULL,
sub_char11 varchar (50) NULL,
sub_char12 varchar (50) NULL,
sub_char13 varchar (50) NULL,
sub_char14 varchar (50) NULL,
sub_char15 varchar (50) NULL,
sub_char16 varchar (50) NULL,
sub_char17 varchar (50) NULL,
sub_char18 varchar (50) NULL,
sub_char19 varchar (50) NULL,
sub_char20 varchar (50) NULL,
sub_char21 varchar (50) NULL,
sub_char22 varchar (50) NULL,
sub_char23 varchar (50) NULL,
sub_char24 varchar (50) NULL,
sub_char25 varchar (50) NULL,
sub_char26 varchar (50) NULL,
sub_char27 varchar (50) NULL,
sub_char28 varchar (50) NULL,
sub_char29 varchar (50) NULL,
sub_char30 varchar (50) NULL,
sub_num1 numeric (21,8) NULL,
sub_num2 numeric (21,8) NULL,
sub_num3 numeric (21,8) NULL,
sub_num4 numeric (21,8) NULL,
sub_num5 numeric (21,8) NULL,
sub_dt1 timestamp(0)  NULL,
sub_dt2 timestamp(0)  NULL,
sub_dt3 timestamp(0)  NULL,
sub_dt4 timestamp(0)  NULL,
sub_dt5 timestamp(0)  NULL,
batch_log_no varchar (15) NULL,
log_sub_key1 numeric (9,0) NULL,
log_sub_key2 numeric (9,0) NULL,
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


ALTER TABLE mst_ordsnd_itm_dtl_if_all
ADD CONSTRAINT mst_ordsnd_itm_dtl_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mst_ordsnd_itm_dtl_if_all_ie01
ON mst_ordsnd_itm_dtl_if_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3);


CREATE INDEX mst_ordsnd_itm_dtl_if_all_ie02
ON mst_ordsnd_itm_dtl_if_all USING BTREE (data_no, co_cd);


CREATE INDEX mst_ordsnd_itm_dtl_if_all_ie03
ON mst_ordsnd_itm_dtl_if_all USING BTREE (exe_sts_typ, co_cd);


CREATE INDEX mst_ordsnd_itm_dtl_if_all_ie04
ON mst_ordsnd_itm_dtl_if_all USING BTREE (batch_log_no, co_cd);

