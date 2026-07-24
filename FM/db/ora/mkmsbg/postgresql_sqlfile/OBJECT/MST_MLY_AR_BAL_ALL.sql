\encoding UTF-8

CREATE TABLE mst_mly_ar_bal_all
(ac_ym timestamp(0)  NOT NULL,
acst_cd varchar (20) NOT NULL,
ar_dpt_cd varchar (20) NOT NULL,
trd_cur_cd varchar (3) NOT NULL,
iv_no varchar (15) NOT NULL,
wrk_no varchar (15) NULL,
ar_typ varchar (1) NOT NULL,
co_cd varchar (10) NOT NULL,
init_bal numeric (21,8) NOT NULL,
sls_amt numeric (21,8) NOT NULL,
ret_amt numeric (21,8) NOT NULL,
dscnt_amt numeric (21,8) NOT NULL,
sw_to_amt numeric (21,8) DEFAULT 0 NOT NULL,
tax_amt numeric (21,8) NOT NULL,
cash_amt numeric (21,8) NOT NULL,
note_amt numeric (21,8) NOT NULL,
xfr_amt numeric (21,8) NOT NULL,
setoff_amt numeric (21,8) NOT NULL,
sw_amt numeric (21,8) NOT NULL,
end_bal numeric (21,8) NOT NULL,
ar_appl_amt numeric (21,8) NOT NULL,
ar_not_appl_bal numeric (21,8) NOT NULL,
rcv_appl_amt numeric (21,8) NOT NULL,
rcv_not_appl_bal numeric (21,8) NOT NULL,
base_cur_cd varchar (3) NOT NULL,
base_cur_init_bal numeric (21,8) NOT NULL,
base_cur_sls_amt numeric (21,8) NOT NULL,
base_cur_ret_amt numeric (21,8) NOT NULL,
base_cur_dscnt_amt numeric (21,8) NOT NULL,
base_cur_sw_to_amt numeric (21,8) DEFAULT 0 NOT NULL,
base_cur_tax_amt numeric (21,8) NOT NULL,
base_cur_cash_amt numeric (21,8) NOT NULL,
base_cur_note_amt numeric (21,8) NOT NULL,
base_cur_xfr_amt numeric (21,8) NOT NULL,
base_cur_setoff_amt numeric (21,8) NOT NULL,
base_cur_sw_amt numeric (21,8) NOT NULL,
base_cur_end_bal numeric (21,8) NOT NULL,
base_cur_ar_appl_amt numeric (21,8) NOT NULL,
base_cur_ar_not_appl_bal numeric (21,8) NOT NULL,
base_cur_rcv_appl_amt numeric (21,8) NOT NULL,
base_cur_rcv_not_appl_bal numeric (21,8) NOT NULL,
exc_gain_loss numeric (21,8) NOT NULL,
total_exc_gain_loss numeric (21,8) NOT NULL,
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


ALTER TABLE mst_mly_ar_bal_all
ADD CONSTRAINT mst_mly_ar_bal_all_pk UNIQUE(ac_ym,acst_cd,ar_dpt_cd,trd_cur_cd,iv_no,wrk_no,ar_typ,co_cd);


CREATE UNIQUE INDEX mst_mly_ar_bal_all_pk_ie ON mst_mly_ar_bal_all (ac_ym,acst_cd,ar_dpt_cd,trd_cur_cd,iv_no,COALESCE(wrk_no,''),ar_typ,co_cd);

