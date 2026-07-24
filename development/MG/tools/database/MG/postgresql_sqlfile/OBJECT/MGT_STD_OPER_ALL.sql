\encoding UTF-8

CREATE TABLE mgt_std_oper_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
oper_rec_no numeric (9,0) NOT NULL,
co_cd varchar (10) NOT NULL,
top_rec_no numeric (9,0) NOT NULL,
inpt_rec_no numeric (9,0) NOT NULL,
loc_cd varchar (20) NULL,
wg_cd varchar (10) NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
oper_ptn varchar (40) NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
disp_seq numeric (9,0) NULL,
std_qty numeric (21,8) NOT NULL,
the_qty numeric (21,8) NOT NULL,
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


ALTER TABLE mgt_std_oper_all
ADD CONSTRAINT mgt_std_oper_all_pk PRIMARY KEY(calc_no,calc_grp_cd,oper_rec_no,co_cd);


CREATE INDEX mgt_std_oper_all_ie01
ON mgt_std_oper_all USING BTREE (top_rec_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_std_oper_all_ie02
ON mgt_std_oper_all USING BTREE (inpt_rec_no, calc_no, calc_grp_cd, co_cd);


CREATE INDEX mgt_std_oper_all_ie03
ON mgt_std_oper_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, calc_no, calc_grp_cd, co_cd);

