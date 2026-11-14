\encoding UTF-8

CREATE TABLE mam_collat_exp_all
(match_key varchar (30) NOT NULL,
sub numeric (3) NOT NULL,
typ numeric (1) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
itm_nm varchar (100) NULL,
itm_alt_nm1 varchar (100) NULL,
match_d_key varchar (3) NULL,
itm_qty numeric (6) NULL,
work_proc_no varchar (40) NULL,
fill_color varchar (100) NULL,
nm_plate varchar (100) NULL,
rmrks1 varchar (100) NULL,
rmrks2 varchar (100) NULL,
rmrks3 varchar (100) NULL,
rmrks4 varchar (100) NULL,
rmrks5 varchar (100) NULL,
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


ALTER TABLE mam_collat_exp_all
ADD CONSTRAINT mam_collat_exp_all_pk PRIMARY KEY(match_key,sub,typ,itm_cd);

