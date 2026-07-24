\encoding UTF-8

CREATE TABLE mst_bf_br_all
(batch_data_no varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
batch_log_no varchar (15) NOT NULL,
log_sub_key1 numeric (9,0) NULL,
log_sub_key2 numeric (9,0) NULL,
exe_sts_typ varchar (1) NOT NULL,
mfg_inst_no varchar (15) NOT NULL,
div_seq numeric (3,0) NOT NULL,
mfg_act_no varchar (15) NOT NULL,
oper_act_no varchar (15) NOT NULL,
par_itm_cd varchar (40) NOT NULL,
par_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
par_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
par_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
mfg_loc_cd varchar (20) NOT NULL,
oper_cd varchar (10) NOT NULL,
st_act_tm timestamp(0)  NOT NULL,
end_act_tm timestamp(0)  NULL,
bf_tgt_cnt numeric (9,0) NULL,
bf_success_cnt numeric (9,0) NULL,
bf_failure_cnt numeric (9,0) NULL,
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


ALTER TABLE mst_bf_br_all
ADD CONSTRAINT mst_bf_br_all_pk PRIMARY KEY(batch_data_no,co_cd);


CREATE INDEX mst_bf_br_all_ie01
ON mst_bf_br_all USING BTREE (batch_log_no,co_cd);


CREATE INDEX mst_bf_br_all_ie02
ON mst_bf_br_all USING BTREE (exe_sts_typ,co_cd);

