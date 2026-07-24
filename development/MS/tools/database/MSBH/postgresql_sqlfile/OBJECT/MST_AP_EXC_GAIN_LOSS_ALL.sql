\encoding UTF-8

CREATE TABLE mst_ap_exc_gain_loss_all
(pay_act_d_no varchar (15) NULL,
pay_act_d_seq numeric (4,0) NULL,
ap_xrate_rev_his_no varchar (15) NULL,
ref_ap_xrate_rev_his_no varchar (15) NULL,
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


ALTER TABLE mst_ap_exc_gain_loss_all
ADD CONSTRAINT mst_ap_exc_gain_loss_all_pk UNIQUE(pay_act_d_no,pay_act_d_seq,ap_xrate_rev_his_no,ref_ap_xrate_rev_his_no,co_cd);


CREATE UNIQUE INDEX mst_ap_exc_gain_loss_all_pk_ie ON mst_ap_exc_gain_loss_all (COALESCE(pay_act_d_no,''),COALESCE(pay_act_d_seq,0),COALESCE(ap_xrate_rev_his_no,''),COALESCE(ref_ap_xrate_rev_his_no,''),co_cd);

