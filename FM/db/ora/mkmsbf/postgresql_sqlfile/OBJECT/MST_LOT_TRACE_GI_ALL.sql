\encoding UTF-8

CREATE TABLE mst_lot_trace_gi_all
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
slip_no varchar (15) NULL,
slip_schd_no varchar (15) NULL,
co_cd varchar (10) NOT NULL,
itm_mfg_inst_no varchar (15) NULL,
mfg_act_no varchar (15) NULL,
stk_xfr_act_no varchar (15) NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
dlv_cd varchar (20) NULL,
tdlv_cd varchar (20) NULL,
loc_cd varchar (20) NULL,
schd_dt timestamp(0)  NULL,
act_dt timestamp(0)  NULL,
trd_ptn_typ varchar (4) NULL,
io_act_typ varchar (5) NULL,
schd_act_typ varchar (1) NOT NULL,
mfg_inst_unit_typ varchar (1) NULL,
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


ALTER TABLE mst_lot_trace_gi_all
ADD CONSTRAINT mst_lot_trace_gi_all_pk UNIQUE(itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,slip_no,slip_schd_no,co_cd);


CREATE INDEX mst_lot_trace_gi_all_ie01
ON mst_lot_trace_gi_all USING BTREE (slip_schd_no,co_cd);


CREATE INDEX mst_lot_trace_gi_all_ie02
ON mst_lot_trace_gi_all USING BTREE (slip_no,co_cd);


CREATE INDEX mst_lot_trace_gi_all_ie03
ON mst_lot_trace_gi_all USING BTREE (mfg_act_no,mfg_inst_unit_typ,co_cd);


CREATE INDEX mst_lot_trace_gi_all_ie04
ON mst_lot_trace_gi_all USING BTREE (itm_mfg_inst_no,mfg_inst_unit_typ,schd_act_typ,co_cd);


CREATE INDEX mst_lot_trace_gi_all_ie05
ON mst_lot_trace_gi_all USING BTREE (stk_xfr_act_no,co_cd);


CREATE INDEX mst_lot_trace_gi_all_ie06
ON mst_lot_trace_gi_all USING BTREE (lot_no,co_cd);


CREATE UNIQUE INDEX mst_lot_trace_gi_all_pk_ie ON mst_lot_trace_gi_all (itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,sno1,sno2,sno3,sno4,COALESCE(slip_no,''),COALESCE(slip_schd_no,''),co_cd);

