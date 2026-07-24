\encoding UTF-8

CREATE TABLE mbt_aprv_d_all
(aprv_no varchar (15) NOT NULL,
aprv_no_seq numeric (9,0) NOT NULL,
aprv_role_cd varchar (10) NOT NULL,
aprv_usr_cd varchar (500) NOT NULL,
co_cd varchar (10) NOT NULL,
aprv_seq numeric (9,0) NOT NULL,
aprv_d_sts_typ varchar (1) NOT NULL,
aprv_d_tm timestamp(0)  NULL,
deputy_flg char (1) DEFAULT '0' NOT NULL,
deputy_usr_cd varchar (500) NULL,
aprv_d_rmrks varchar (100) NULL,
not_upd_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mbt_aprv_d_all
ADD CONSTRAINT mbt_aprv_d_all_pk PRIMARY KEY(aprv_no,aprv_no_seq,aprv_role_cd,aprv_usr_cd,co_cd);


CREATE INDEX mbt_aprv_d_all_ie01
ON mbt_aprv_d_all USING BTREE (aprv_d_sts_typ,co_cd);


CREATE INDEX mbt_aprv_d_all_ie02
ON mbt_aprv_d_all USING BTREE (aprv_role_cd,co_cd);


CREATE INDEX mbt_aprv_d_all_ie03
ON mbt_aprv_d_all USING BTREE (aprv_usr_cd,co_cd);

