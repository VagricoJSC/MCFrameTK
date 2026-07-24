\encoding UTF-8

CREATE TABLE mam_gp_lcl_all
(gp_grp_cd varchar (5) NOT NULL,
key1 varchar (20) DEFAULT '*' NOT NULL,
key2 varchar (20) DEFAULT '*' NOT NULL,
key3 varchar (20) DEFAULT '*' NOT NULL,
key4 varchar (20) DEFAULT '*' NOT NULL,
key5 varchar (20) DEFAULT '*' NOT NULL,
key6 varchar (20) DEFAULT '*' NOT NULL,
key7 varchar (20) DEFAULT '*' NOT NULL,
key8 varchar (20) DEFAULT '*' NOT NULL,
key9 varchar (20) DEFAULT '*' NOT NULL,
key10 varchar (20) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
char1 varchar (100) NULL,
char2 varchar (100) NULL,
char3 varchar (100) NULL,
char4 varchar (100) NULL,
char5 varchar (100) NULL,
char6 varchar (100) NULL,
char7 varchar (100) NULL,
char8 varchar (100) NULL,
char9 varchar (100) NULL,
char10 varchar (100) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (100) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (100) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL,
lcl_cd varchar (7) NOT NULL
);


ALTER TABLE mam_gp_lcl_all
ADD CONSTRAINT mam_gp_lcl_all_pk PRIMARY KEY(gp_grp_cd,key1,key2,key3,key4,key5,key6,key7,key8,key9,key10,co_cd,lcl_cd);

