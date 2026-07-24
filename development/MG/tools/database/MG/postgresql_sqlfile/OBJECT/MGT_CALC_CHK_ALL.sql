\encoding UTF-8

CREATE TABLE mgt_calc_chk_all
(calc_grp_cd varchar (10) NOT NULL,
msg_id varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
rmrks varchar (100) NULL,
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


ALTER TABLE mgt_calc_chk_all
ADD CONSTRAINT mgt_calc_chk_all_pk PRIMARY KEY(calc_grp_cd,msg_id,co_cd);

