\encoding UTF-8

CREATE TABLE mst_oper_act_rem_all
(oper_inst_no varchar (15) NOT NULL,
div_seq numeric (3,0) NOT NULL,
co_cd varchar (10) NOT NULL,
mfg_sts_typ varchar (1) NOT NULL,
mfg_inst_no varchar (15) NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_rem_qty numeric (21,8) NOT NULL,
base_unit_abort_qty numeric (21,8) NOT NULL,
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


ALTER TABLE mst_oper_act_rem_all
ADD CONSTRAINT mst_oper_act_rem_all_pk PRIMARY KEY(oper_inst_no,div_seq,co_cd);


CREATE INDEX mst_oper_act_rem_all_ie01
ON mst_oper_act_rem_all USING BTREE (mfg_sts_typ,co_cd);


CREATE INDEX mst_oper_act_rem_all_ie02
ON mst_oper_act_rem_all USING BTREE (mfg_inst_no,co_cd);


CREATE INDEX mst_oper_act_rem_all_ie03
ON mst_oper_act_rem_all USING BTREE (itm_mfg_inst_no,co_cd);

