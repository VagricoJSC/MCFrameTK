\encoding UTF-8

CREATE TABLE mgt_std_wk_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
wk_rec_no numeric (9,0) NOT NULL,
co_cd varchar (10) NOT NULL,
oper_rec_no numeric (9,0) NOT NULL,
wk_cost_cd varchar (10) NOT NULL,
std_wk_cost numeric (21,8) NOT NULL,
the_wk_cost numeric (21,8) NOT NULL,
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


ALTER TABLE mgt_std_wk_all
ADD CONSTRAINT mgt_std_wk_all_pk PRIMARY KEY(calc_no,calc_grp_cd,wk_rec_no,co_cd);


CREATE INDEX mgt_std_wk_all_ie01
ON mgt_std_wk_all USING BTREE (oper_rec_no, calc_no, calc_grp_cd, co_cd);

