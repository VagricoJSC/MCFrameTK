\encoding UTF-8

CREATE TABLE mam_usr_acl_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
usr_cd varchar (500) NULL,
st_dt timestamp(0)  NULL,
co_cd varchar (10) NULL,
end_dt timestamp(0)  NULL,
da_cd varchar (10) NULL,
pre_cl_usr_flg char (1) DEFAULT '0' NULL,
cl_usr_flg char (1) DEFAULT '0' NULL,
dpt_cd varchar (20) NULL,
add_dpt_cd1 varchar (20) NULL,
add_dpt_cd2 varchar (20) NULL,
add_dpt_cd3 varchar (20) NULL,
add_dpt_cd4 varchar (20) NULL,
add_dpt_cd5 varchar (20) NULL,
add_dpt_cd6 varchar (20) NULL,
add_dpt_cd7 varchar (20) NULL,
add_dpt_cd8 varchar (20) NULL,
add_dpt_cd9 varchar (20) NULL,
aprv_role_cd varchar (10) NULL,
aprv_role_cd1 varchar (10) NULL,
aprv_role_cd2 varchar (10) NULL,
aprv_role_cd3 varchar (10) NULL,
aprv_role_cd4 varchar (10) NULL,
aprv_role_cd5 varchar (10) NULL,
aprv_role_cd6 varchar (10) NULL,
aprv_role_cd7 varchar (10) NULL,
aprv_role_cd8 varchar (10) NULL,
aprv_role_cd9 varchar (10) NULL,
sub_aprv_role_cd varchar (10) NULL,
sub_aprv_role_cd1 varchar (10) NULL,
sub_aprv_role_cd2 varchar (10) NULL,
sub_aprv_role_cd3 varchar (10) NULL,
sub_aprv_role_cd4 varchar (10) NULL,
sub_aprv_role_cd5 varchar (10) NULL,
sub_aprv_role_cd6 varchar (10) NULL,
sub_aprv_role_cd7 varchar (10) NULL,
sub_aprv_role_cd8 varchar (10) NULL,
sub_aprv_role_cd9 varchar (10) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NULL,
del_usr_id varchar (500) NULL,
del_usr_nm varchar (100) NULL,
del_ts timestamp(3)  NULL,
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



ALTER TABLE mam_usr_acl_all_r ADD CONSTRAINT mam_usr_acl_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_usr_acl_all_r', 'mam_usr_acl_all', 'mam_usr_acl_all_tr_r');

