\encoding UTF-8

CREATE TABLE mst_sche_exec_all
(wg_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
exec_flg char (1) DEFAULT '0' NOT NULL,
from_dt timestamp(0)  NULL,
to_dt timestamp(0)  NULL,
master_dt timestamp(0)  NULL,
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


ALTER TABLE mst_sche_exec_all
ADD CONSTRAINT mst_sche_exec_all_pk PRIMARY KEY(wg_cd,co_cd);

