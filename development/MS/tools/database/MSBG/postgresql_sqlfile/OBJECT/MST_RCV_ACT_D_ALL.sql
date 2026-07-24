\encoding UTF-8

CREATE TABLE mst_rcv_act_d_all
(rcv_act_d_no varchar (15) NOT NULL,
rcv_act_d_seq numeric (4,0) NOT NULL,
co_cd varchar (10) NOT NULL,
rcv_act_no varchar (15) NOT NULL,
rcv_act_seq numeric (4,0) NOT NULL,
disp_seq numeric (5,0) NOT NULL,
bill_mng_no varchar (15) NULL,
bcst_cd varchar (20) NULL,
bill_dpt_cd varchar (20) NULL,
acst_cd varchar (20) NULL,
ar_dpt_cd varchar (20) NULL,
wg_cd varchar (10) NULL,
iv_no varchar (15) NOT NULL,
wrk_no varchar (15) NULL,
ar_typ varchar (1) NULL,
ar_sttl_cd1 varchar (10) NULL,
ar_sttl_typ1 varchar (1) NULL,
trd_cur_amt1 numeric (21,8) NOT NULL,
trd_cur_tax_amt1 numeric (21,8) NOT NULL,
trd_cur_amt2 numeric (21,8) NOT NULL,
trd_cur_tax_amt2 numeric (21,8) NOT NULL,
trd_cur_amt3 numeric (21,8) NOT NULL,
trd_cur_tax_amt3 numeric (21,8) NOT NULL,
base_cur_amt1 numeric (21,8) NOT NULL,
base_cur_tax_amt1 numeric (21,8) NOT NULL,
base_cur_amt2 numeric (21,8) NOT NULL,
base_cur_tax_amt2 numeric (21,8) NOT NULL,
base_cur_amt3 numeric (21,8) NOT NULL,
base_cur_tax_amt3 numeric (21,8) NOT NULL,
trd_xrate numeric (21,8) NULL,
gen_rcv_no varchar (15) NULL,
bill_d_rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
appl_cmpl_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_rcv_act_d_all
ADD CONSTRAINT mst_rcv_act_d_all_pk PRIMARY KEY(rcv_act_d_no,rcv_act_d_seq,co_cd);


CREATE INDEX mst_rcv_act_d_all_ie01
ON mst_rcv_act_d_all USING BTREE (rcv_act_no,rcv_act_seq,co_cd);


CREATE INDEX mst_rcv_act_d_all_ie02
ON mst_rcv_act_d_all USING BTREE (bill_mng_no,co_cd);


CREATE INDEX mst_rcv_act_d_all_ie03
ON mst_rcv_act_d_all USING BTREE (gen_rcv_no,co_cd);


CREATE INDEX mst_rcv_act_d_all_ie04
ON mst_rcv_act_d_all USING BTREE (iv_no,co_cd);

