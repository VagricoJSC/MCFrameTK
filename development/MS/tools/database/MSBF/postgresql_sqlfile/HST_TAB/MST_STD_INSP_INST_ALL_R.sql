\encoding UTF-8

CREATE TABLE mst_std_insp_inst_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
std_insp_inst_no varchar (15) NULL,
co_cd varchar (10) NULL,
insp_typ varchar (1) NULL,
insp_no varchar (15) NULL,
insp_freq numeric (9,0) NULL,
insp_seq numeric (3,0) NULL,
insp_point_cd varchar (5) NULL,
insp_qlqn_typ varchar (1) NULL,
qn_out_min numeric (21,8) NULL,
qn_out_max numeric (21,8) NULL,
sign_out_min_typ varchar (2) NULL,
sign_out_max_typ varchar (2) NULL,
qn_in_min numeric (21,8) NULL,
qn_in_max numeric (21,8) NULL,
sign_in_min_typ varchar (2) NULL,
sign_in_max_typ varchar (2) NULL,
trd_unit_cd varchar (5) NULL,
qn_int_digit numeric (2,0) NULL,
qn_int_frac numeric (2,0) NULL,
ql_std_val varchar (30) NULL,
add_point_flg char (1) DEFAULT '0' NULL,
intr_rmrks varchar (100) NULL,
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



ALTER TABLE mst_std_insp_inst_all_r ADD CONSTRAINT mst_std_insp_inst_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_std_insp_inst_all_r', 'mst_std_insp_inst_all', 'mst_std_insp_inst_all_tr_r');

