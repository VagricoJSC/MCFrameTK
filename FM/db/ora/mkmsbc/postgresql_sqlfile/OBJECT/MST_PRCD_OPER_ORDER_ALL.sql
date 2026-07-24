\encoding UTF-8

CREATE TABLE mst_prcd_oper_order_all
(oper_ord_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
st_schd_tm timestamp(0)  NOT NULL,
inst_st_schd_tm timestamp(0)  NULL,
act_st_tm timestamp(0)  NULL,
end_schd_tm timestamp(0)  NOT NULL,
inst_end_schd_tm timestamp(0)  NULL,
act_end_tm timestamp(0)  NULL,
oper_lt numeric (9,0) DEFAULT 0 NOT NULL,
act_oper_lt numeric (9,0) NULL,
oper_offst_typ varchar (1) NOT NULL,
oper_offst numeric (9,0) DEFAULT 0 NOT NULL,
oper_schd_qty numeric (21,8) DEFAULT 0 NOT NULL,
not_oper_schd_qty numeric (21,8) DEFAULT 0 NOT NULL,
itm_ord_no varchar (15) NOT NULL,
disp_seq numeric (9,0) NOT NULL,
oper_ptn varchar (40) NOT NULL,
oper_cd varchar (10) NOT NULL,
oper_seq numeric (9,0) NOT NULL,
loc_cd varchar (20) NOT NULL,
oper_ord_sts_typ varchar (1) DEFAULT 0 NOT NULL,
itm_ord_sts_typ varchar (1) DEFAULT 0 NOT NULL,
wg_cd varchar (10) NOT NULL,
yield_oper_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_prcd_oper_order_all
ADD CONSTRAINT mst_prcd_oper_order_all_pk PRIMARY KEY(oper_ord_no,co_cd);


CREATE INDEX mst_prcd_oper_order_all_ie01
ON mst_prcd_oper_order_all USING BTREE (wg_cd,co_cd);


CREATE INDEX mst_prcd_oper_order_all_ie02
ON mst_prcd_oper_order_all USING BTREE (itm_ord_no,co_cd);


CREATE INDEX mst_prcd_oper_order_all_ie03
ON mst_prcd_oper_order_all USING BTREE (oper_ord_sts_typ,co_cd);


CREATE INDEX mst_prcd_oper_order_all_ie04
ON mst_prcd_oper_order_all USING BTREE (oper_ptn,oper_cd,oper_seq,co_cd);


CREATE INDEX mst_prcd_oper_order_all_ie05
ON mst_prcd_oper_order_all USING BTREE (oper_cd,co_cd);


CREATE INDEX mst_prcd_oper_order_all_ie06
ON mst_prcd_oper_order_all USING BTREE (loc_cd,co_cd);

