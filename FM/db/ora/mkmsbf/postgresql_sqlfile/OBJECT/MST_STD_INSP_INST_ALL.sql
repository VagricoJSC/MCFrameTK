\encoding UTF-8

CREATE TABLE mst_std_insp_inst_all
(std_insp_inst_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
insp_typ varchar (1) NOT NULL,
insp_no varchar (15) NOT NULL,
insp_freq numeric (9,0) NOT NULL,
insp_seq numeric (3,0) NOT NULL,
insp_point_cd varchar (5) NOT NULL,
insp_qlqn_typ varchar (1) NOT NULL,
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
add_point_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_std_insp_inst_all
ADD CONSTRAINT mst_std_insp_inst_all_pk PRIMARY KEY(std_insp_inst_no,co_cd);


CREATE INDEX mst_std_insp_inst_all_ie01
ON mst_std_insp_inst_all USING BTREE (insp_no,co_cd);

