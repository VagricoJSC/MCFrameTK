\encoding UTF-8

CREATE TABLE mst_wk_schd_p_all
(wk_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
mfg_inst_rev numeric (4,0) NOT NULL,
mfg_inst_no varchar (15) NULL,
itm_mfg_inst_no varchar (15) NOT NULL,
oper_inst_no varchar (15) NOT NULL,
wk_cost_cd varchar (10) NOT NULL,
wk_cost_calc_flg char (1) DEFAULT '0' NOT NULL,
fxd_wk_cost numeric (21,8) NOT NULL,
wk_cost numeric (21,8) NOT NULL,
mst_fxd_wk_cost numeric (21,8) NULL,
mst_wk_cost numeric (21,8) NULL,
disp_seq numeric (9,0) NOT NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_wk_schd_p_all
ADD CONSTRAINT mst_wk_schd_p_all_pk UNIQUE(wk_schd_no,co_cd,mfg_inst_rev,mfg_inst_no);


CREATE INDEX mst_wk_schd_p_all_ie01
ON mst_wk_schd_p_all USING BTREE (mfg_inst_no, co_cd, mfg_inst_rev);


CREATE UNIQUE INDEX mst_wk_schd_p_all_pk_ie ON mst_wk_schd_p_all (wk_schd_no,co_cd,mfg_inst_rev,COALESCE(mfg_inst_no,''));

