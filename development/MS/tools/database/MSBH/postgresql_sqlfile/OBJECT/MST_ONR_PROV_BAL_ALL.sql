\encoding UTF-8

CREATE TABLE mst_onr_prov_bal_all
(asppl_cd varchar (20) NOT NULL,
ap_dpt_cd varchar (20) NOT NULL,
ac_ym timestamp(0)  NOT NULL,
trd_cur_cd varchar (3) NOT NULL,
co_cd varchar (10) NOT NULL,
init_bal numeric (21,8) NOT NULL,
onr_prov_amt numeric (21,8) NOT NULL,
onr_prov_ret_amt numeric (21,8) NOT NULL,
setoff_amt numeric (21,8) NOT NULL,
tax_amt numeric (21,8) NOT NULL,
end_bal numeric (21,8) NOT NULL,
base_cur_cd varchar (3) NOT NULL,
base_cur_init_bal numeric (21,8) NOT NULL,
base_cur_onr_prov_amt numeric (21,8) NOT NULL,
base_cur_onr_prov_ret_amt numeric (21,8) NOT NULL,
base_cur_setoff_amt numeric (21,8) NOT NULL,
base_cur_tax_amt numeric (21,8) NOT NULL,
base_cur_end_bal numeric (21,8) NOT NULL,
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


ALTER TABLE mst_onr_prov_bal_all
ADD CONSTRAINT mst_onr_prov_bal_all_pk PRIMARY KEY(asppl_cd,ap_dpt_cd,ac_ym,trd_cur_cd,co_cd);


CREATE INDEX mst_onr_prov_bal_all_ie01
ON mst_onr_prov_bal_all USING BTREE (ac_ym, co_cd);

