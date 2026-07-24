\encoding UTF-8

CREATE TABLE mst_prcd_oper_order_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
oper_ord_no varchar (15) NULL,
co_cd varchar (10) NULL,
st_schd_tm timestamp(0)  NULL,
inst_st_schd_tm timestamp(0)  NULL,
act_st_tm timestamp(0)  NULL,
end_schd_tm timestamp(0)  NULL,
inst_end_schd_tm timestamp(0)  NULL,
act_end_tm timestamp(0)  NULL,
oper_lt numeric (9,0) DEFAULT 0 NULL,
act_oper_lt numeric (9,0) NULL,
oper_offst_typ varchar (1) NULL,
oper_offst numeric (9,0) DEFAULT 0 NULL,
oper_schd_qty numeric (21,8) DEFAULT 0 NULL,
not_oper_schd_qty numeric (21,8) DEFAULT 0 NULL,
itm_ord_no varchar (15) NULL,
disp_seq numeric (9,0) NULL,
oper_ptn varchar (40) NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
loc_cd varchar (20) NULL,
oper_ord_sts_typ varchar (1) DEFAULT 0 NULL,
itm_ord_sts_typ varchar (1) DEFAULT 0 NULL,
wg_cd varchar (10) NULL,
yield_oper_flg char (1) DEFAULT '0' NULL,
sim_mrp_no varchar (15) NULL,
oper_rsrc varchar (100) NULL,
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



ALTER TABLE mst_prcd_oper_order_all_r ADD CONSTRAINT mst_prcd_oper_order_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_prcd_oper_order_all_r', 'mst_prcd_oper_order_all', 'mst_prcd_oper_order_all_tr_r');

