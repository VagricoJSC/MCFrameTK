\encoding UTF-8

CREATE TABLE mst_ar_exc_gain_loss_all
(rcv_act_d_no varchar (15) NULL,
rcv_act_d_seq numeric (4,0) NULL,
ar_xrate_rev_his_no varchar (15) NULL,
ref_ar_xrate_rev_his_no varchar (15) NULL,
co_cd varchar (10) NOT NULL,
exc_gain_loss numeric (21,8) NOT NULL,
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


ALTER TABLE mst_ar_exc_gain_loss_all
ADD CONSTRAINT mst_ar_exc_gain_loss_all_pk UNIQUE(rcv_act_d_no,rcv_act_d_seq,ar_xrate_rev_his_no,ref_ar_xrate_rev_his_no,co_cd);


CREATE INDEX mst_ar_exc_gain_loss_all_ie01
ON mst_ar_exc_gain_loss_all USING BTREE (ar_xrate_rev_his_no,co_cd);


CREATE INDEX mst_ar_exc_gain_loss_all_ie02
ON mst_ar_exc_gain_loss_all USING BTREE (ref_ar_xrate_rev_his_no,co_cd);


CREATE UNIQUE INDEX mst_ar_exc_gain_loss_all_pk_ie ON mst_ar_exc_gain_loss_all (COALESCE(rcv_act_d_no,''),COALESCE(rcv_act_d_seq,0),COALESCE(ar_xrate_rev_his_no,''),COALESCE(ref_ar_xrate_rev_his_no,''),co_cd);

