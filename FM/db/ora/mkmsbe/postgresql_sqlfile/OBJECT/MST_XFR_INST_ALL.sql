\encoding UTF-8

CREATE TABLE mst_xfr_inst_all
(xfr_inst_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
trd_cd varchar (4) NOT NULL,
trd_ptn_typ varchar (4) NOT NULL,
wg_cd varchar (10) NOT NULL,
lg_grp_cd varchar (10) NOT NULL,
gr_loc_cd varchar (20) NOT NULL,
gr_stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
xfr_schd_dt timestamp(0)  NOT NULL,
xfr_inst_dt timestamp(0)  NOT NULL,
inst_usr_cd varchar (500) NULL,
inst_dpt_cd varchar (20) NULL,
inst_prnt_flg char (1) DEFAULT '0' NOT NULL,
inst_prnt_tm timestamp(0)  NULL,
pick_prnt_flg char (1) DEFAULT '0' NOT NULL,
pick_prnt_tm timestamp(0)  NULL,
dlv_prnt_flg char (1) DEFAULT '0' NOT NULL,
dlv_prnt_tm timestamp(0)  NULL,
trd_rmrks varchar (100) NULL,
inst_rmrks varchar (100) NULL,
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


ALTER TABLE mst_xfr_inst_all
ADD CONSTRAINT mst_xfr_inst_all_pk PRIMARY KEY(xfr_inst_no,co_cd);


CREATE INDEX mst_xfr_inst_all_ie01
ON mst_xfr_inst_all USING BTREE (gr_loc_cd, co_cd);


CREATE INDEX mst_xfr_inst_all_ie02
ON mst_xfr_inst_all USING BTREE (xfr_schd_dt, co_cd);


CREATE INDEX mst_xfr_inst_all_ie03
ON mst_xfr_inst_all USING BTREE (xfr_inst_dt, co_cd);

