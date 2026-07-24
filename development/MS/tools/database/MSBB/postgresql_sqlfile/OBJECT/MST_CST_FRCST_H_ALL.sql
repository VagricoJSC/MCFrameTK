\encoding UTF-8

CREATE TABLE mst_cst_frcst_h_all
(cst_frcst_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
cst_cd varchar (20) NOT NULL,
dlv_cd varchar (20) NULL,
cst_frcst_prnt_dt timestamp(0)  NOT NULL,
cst_frcst_slip_no varchar (15) NULL,
frcst_dpt_cd varchar (20) NOT NULL,
frcst_usr_cd varchar (500) NULL,
wrk_no varchar (15) NULL,
rcpt_dt timestamp(0)  NOT NULL,
can_rsn_cd varchar (10) NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
can_rmrks varchar (100) NULL,
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


ALTER TABLE mst_cst_frcst_h_all
ADD CONSTRAINT mst_cst_frcst_h_all_pk PRIMARY KEY(cst_frcst_no,co_cd);


CREATE INDEX mst_cst_frcst_h_all_ie01
ON mst_cst_frcst_h_all USING BTREE (cst_cd, co_cd);


CREATE INDEX mst_cst_frcst_h_all_ie02
ON mst_cst_frcst_h_all USING BTREE (dlv_cd, co_cd);


CREATE INDEX mst_cst_frcst_h_all_ie03
ON mst_cst_frcst_h_all USING BTREE (frcst_dpt_cd,co_cd);


CREATE INDEX mst_cst_frcst_h_all_ie04
ON mst_cst_frcst_h_all USING BTREE (frcst_usr_cd,co_cd);


CREATE INDEX mst_cst_frcst_h_all_ie05
ON mst_cst_frcst_h_all USING BTREE (wrk_no,co_cd);


CREATE INDEX mst_cst_frcst_h_all_ie06
ON mst_cst_frcst_h_all USING BTREE (cst_frcst_slip_no,co_cd);


CREATE INDEX mst_cst_frcst_h_all_ie07
ON mst_cst_frcst_h_all USING BTREE (can_flg,can_rsn_cd,co_cd);

