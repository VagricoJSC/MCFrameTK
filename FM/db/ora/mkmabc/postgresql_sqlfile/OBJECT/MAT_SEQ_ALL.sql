\encoding UTF-8

CREATE TABLE mat_seq_all
(num_biz_typ varchar (50) NOT NULL,
num_ptn_cd varchar (10) NOT NULL,
key_elm varchar (45) NOT NULL,
co_cd varchar (10) NOT NULL,
seq_typ varchar (3) NOT NULL,
ora_seq_nm varchar (30) NULL,
min_val numeric (20,0) NULL,
max_val numeric (20,0) NULL,
increment_by numeric (9,0) NULL,
cycl_flg char (1) DEFAULT '0' NOT NULL,
last_val numeric (20,0) NULL,
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


ALTER TABLE mat_seq_all
ADD CONSTRAINT mat_seq_all_pk PRIMARY KEY(num_biz_typ,num_ptn_cd,key_elm,co_cd);

