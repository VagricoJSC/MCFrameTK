\encoding UTF-8

CREATE TABLE mst_wrk_act_hist_all
(wrk_no varchar (15) NOT NULL,
hist_no numeric (9,0) NOT NULL,
co_cd varchar (10) NOT NULL,
act_sts_cd varchar (10) NOT NULL,
act_hist varchar (100) NULL,
act_schd_dt timestamp(0)  NULL,
act_schd varchar (100) NULL,
act_act_dt timestamp(0)  NULL,
act_act varchar (100) NULL,
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


ALTER TABLE mst_wrk_act_hist_all
ADD CONSTRAINT mst_wrk_act_hist_all_pk PRIMARY KEY(wrk_no,hist_no,co_cd);

