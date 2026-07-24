\encoding UTF-8

CREATE TABLE mgt_acc_sml_cost_tmp_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
top_rec_no numeric (9,0) NOT NULL,
expns_cd varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
act_cost numeric (21,8) NOT NULL,
std_cost numeric (21,8) NOT NULL,
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


ALTER TABLE mgt_acc_sml_cost_tmp_all
ADD CONSTRAINT mgt_acc_sml_cost_tmp_all_pk PRIMARY KEY(calc_no,calc_grp_cd,top_rec_no,expns_cd,co_cd);


CREATE INDEX mgt_acc_sml_cost_tmp_all_ie01
ON mgt_acc_sml_cost_tmp_all USING BTREE (top_rec_no, calc_no, calc_grp_cd, co_cd);

