\encoding UTF-8

CREATE TABLE mst_ap_xrate_rev_his_all
(ap_xrate_rev_his_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
ac_ym timestamp(0)  NOT NULL,
asppl_cd varchar (20) NOT NULL,
ap_dpt_cd varchar (20) NOT NULL,
trd_cur_cd varchar (3) NOT NULL,
purc_act_no varchar (15) DEFAULT '*' NOT NULL,
rcpt_iv_mng_no varchar (15) DEFAULT '*' NOT NULL,
wrk_no varchar (15) DEFAULT '*' NOT NULL,
ap_typ varchar (1) NOT NULL,
xrate_cd varchar (2) NOT NULL,
new_xrate numeric (21,8) NOT NULL,
old_xrate numeric (21,8) NOT NULL,
base_cur_cd varchar (3) NOT NULL,
exe_dt timestamp(0)  NOT NULL,
ac_dt timestamp(0)  NOT NULL,
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


ALTER TABLE mst_ap_xrate_rev_his_all
ADD CONSTRAINT mst_ap_xrate_rev_his_all_pk PRIMARY KEY(ap_xrate_rev_his_no,co_cd);


CREATE INDEX mst_ap_xrate_rev_his_all_ie01
ON mst_ap_xrate_rev_his_all USING BTREE (purc_act_no, co_cd);


CREATE INDEX mst_ap_xrate_rev_his_all_ie02
ON mst_ap_xrate_rev_his_all USING BTREE (rcpt_iv_mng_no, co_cd);

