\encoding UTF-8

CREATE TABLE mgt_acc_trd_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
trd_grp varchar (50) NOT NULL,
ym timestamp(0)  NOT NULL,
expns_cd varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
amt numeric (21,8) NOT NULL,
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


ALTER TABLE mgt_acc_trd_all
ADD CONSTRAINT mgt_acc_trd_all_pk PRIMARY KEY(calc_no,calc_grp_cd,trd_grp,ym,expns_cd,co_cd);


CREATE INDEX mgt_acc_trd_all_ie01
ON mgt_acc_trd_all USING BTREE (trd_grp, calc_no, calc_grp_cd, co_cd);

