\encoding UTF-8

CREATE TABLE mst_cred_all
(cred_cd varchar (20) NOT NULL,
trd_cur_cd varchar (3) NOT NULL,
co_cd varchar (10) NOT NULL,
cred_amt numeric (21,8) NOT NULL,
ap_cred_amt numeric (21,8) NOT NULL,
ar_cred_amt numeric (21,8) NOT NULL,
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


ALTER TABLE mst_cred_all
ADD CONSTRAINT mst_cred_all_pk PRIMARY KEY(cred_cd,trd_cur_cd,co_cd);

