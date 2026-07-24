\encoding UTF-8

CREATE TABLE mst_std_insp_act_all
(std_insp_act_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
std_insp_inst_no varchar (15) NOT NULL,
insp_no varchar (15) NOT NULL,
qn_insp_val numeric (21,8) NULL,
ql_insp_val varchar (50) NULL,
st_tm timestamp(0)  NULL,
end_tm timestamp(0)  NULL,
dpt_cd varchar (20) NULL,
usr_cd varchar (500) NULL,
std_insp_rslt_typ varchar (1) NULL,
cnf_flg char (1) DEFAULT '0' NOT NULL,
cnf_dt timestamp(0)  NULL,
cnf_dpt_cd varchar (20) NULL,
cnf_usr_cd varchar (500) NULL,
act_intr_rmrks varchar (100) NULL,
cnf_intr_rmrks varchar (100) NULL,
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


ALTER TABLE mst_std_insp_act_all
ADD CONSTRAINT mst_std_insp_act_all_pk PRIMARY KEY(std_insp_act_no,co_cd);


CREATE INDEX mst_std_insp_act_all_ie01
ON mst_std_insp_act_all USING BTREE (insp_no,co_cd);


CREATE INDEX mst_std_insp_act_all_ie02
ON mst_std_insp_act_all USING BTREE (std_insp_inst_no,co_cd);

