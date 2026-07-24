\encoding UTF-8

CREATE TABLE mst_onr_prov_bal_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
asppl_cd varchar (20) NULL,
ap_dpt_cd varchar (20) NULL,
ac_ym timestamp(0)  NULL,
trd_cur_cd varchar (3) NULL,
co_cd varchar (10) NULL,
init_bal numeric (21,8) NULL,
onr_prov_amt numeric (21,8) NULL,
onr_prov_ret_amt numeric (21,8) NULL,
setoff_amt numeric (21,8) NULL,
tax_amt numeric (21,8) NULL,
end_bal numeric (21,8) NULL,
base_cur_cd varchar (3) NULL,
base_cur_init_bal numeric (21,8) NULL,
base_cur_onr_prov_amt numeric (21,8) NULL,
base_cur_onr_prov_ret_amt numeric (21,8) NULL,
base_cur_setoff_amt numeric (21,8) NULL,
base_cur_tax_amt numeric (21,8) NULL,
base_cur_end_bal numeric (21,8) NULL,
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



ALTER TABLE mst_onr_prov_bal_all_r ADD CONSTRAINT mst_onr_prov_bal_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_onr_prov_bal_all_r', 'mst_onr_prov_bal_all', 'mst_onr_prov_bal_all_tr_r');

