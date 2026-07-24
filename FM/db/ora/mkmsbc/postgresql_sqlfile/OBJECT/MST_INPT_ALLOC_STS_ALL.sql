\encoding UTF-8

CREATE TABLE mst_inpt_alloc_sts_all
(inpt_alloc_sts_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
inpt_schd_no varchar (15) NOT NULL,
mfg_inst_no varchar (15) NOT NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
oper_inst_no varchar (15) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
to_stk_id_typ varchar (1) NOT NULL,
to_stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
to_stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
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


ALTER TABLE mst_inpt_alloc_sts_all
ADD CONSTRAINT mst_inpt_alloc_sts_all_pk PRIMARY KEY(inpt_alloc_sts_no,co_cd);


CREATE INDEX mst_inpt_alloc_sts_all_ie01
ON mst_inpt_alloc_sts_all USING BTREE (inpt_schd_no,co_cd);

