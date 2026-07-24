\encoding UTF-8

CREATE TABLE mbt_aprv_all
(aprv_no varchar (15) NOT NULL,
aprv_no_seq numeric (9,0) NOT NULL,
co_cd varchar (10) NOT NULL,
aprv_sts_typ varchar (1) NOT NULL,
last_aprv_usr_cd varchar (500) NULL,
last_aprv_tm timestamp(0)  NULL,
next_opr_flg char (1) DEFAULT '0' NOT NULL,
ins_dt timestamp(0)  NOT NULL,
biz_usr_cd varchar (500) NULL,
src_ins_usr_cd varchar (500) NOT NULL,
master_dt timestamp(0)  NOT NULL,
aprv_func_typ varchar (2) NOT NULL,
aprv_rt_ptn varchar (10) NOT NULL,
aprv_row_num numeric (4,0) NOT NULL,
src_itm_cd varchar (40) NULL,
src_itm_sub1 varchar (5) NULL,
src_itm_sub2 varchar (5) NULL,
src_itm_sub3 varchar (5) NULL,
src_dpt_cd varchar (20) NULL,
src_bp_cd varchar (20) NULL,
src_cur_cd1 varchar (3) NULL,
src_amt1 numeric (21,8) NULL,
src_cur_cd2 varchar (3) NULL,
src_amt2 numeric (21,8) NULL,
src_cur_cd3 varchar (3) NULL,
src_amt3 numeric (21,8) NULL,
src_ext_key1 varchar (20) NULL,
src_ext_key2 varchar (20) NULL,
src_ext_key3 varchar (20) NULL,
aprv_src_no1 varchar (15) NULL,
aprv_src_no2 varchar (15) NULL,
aprv_upd_flg char (1) DEFAULT '0' NOT NULL,
aprv_can_flg char (1) DEFAULT '0' NOT NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mbt_aprv_all
ADD CONSTRAINT mbt_aprv_all_pk PRIMARY KEY(aprv_no,aprv_no_seq,co_cd);


CREATE INDEX mbt_aprv_all_ie01
ON mbt_aprv_all USING BTREE (aprv_src_no1,co_cd);


CREATE INDEX mbt_aprv_all_ie02
ON mbt_aprv_all USING BTREE (aprv_src_no2,co_cd);

