\encoding UTF-8

CREATE TABLE mam_com_paid_all
(cur_cd varchar (3) NOT NULL,
min_amt numeric (21,8) NULL,
max_amt numeric (21,8) NULL,
rcst_cd varchar (20) NULL,
com_paid numeric (21,8) NOT NULL,
co_cd varchar (10) NOT NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NOT NULL,
del_usr_id varchar (500) NULL,
del_usr_nm varchar (100) NULL,
del_ts timestamp(3)  NULL,
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


ALTER TABLE mam_com_paid_all
ADD CONSTRAINT mam_com_paid_all_pk UNIQUE(cur_cd,min_amt,max_amt,rcst_cd,com_paid,co_cd);


CREATE INDEX mam_com_paid_all_ie01
ON mam_com_paid_all USING BTREE (rcst_cd);


CREATE UNIQUE INDEX mam_com_paid_all_pk_ie ON mam_com_paid_all (cur_cd,COALESCE(min_amt,0),COALESCE(max_amt,0),COALESCE(rcst_cd,''),com_paid,co_cd);

