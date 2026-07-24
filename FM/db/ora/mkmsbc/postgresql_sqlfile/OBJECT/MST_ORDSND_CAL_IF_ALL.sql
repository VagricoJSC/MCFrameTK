\encoding UTF-8

CREATE TABLE mst_ordsnd_cal_if_all
(data_lno numeric (15,0) NOT NULL,
co_cd varchar (10) NOT NULL,
data_no numeric (15,0) NOT NULL,
exe_sts_typ varchar (1) NOT NULL,
data_crud_typ varchar (1) NOT NULL,
ext_sys_cd varchar (10) NOT NULL,
if_wg_cd varchar (10) NULL,
wg_cd varchar (10) NOT NULL,
cal_cd varchar (10) NOT NULL,
cal_nm varchar (40) NULL,
st_dt timestamp(0)  NOT NULL,
end_dt timestamp(0)  NOT NULL,
sun_off_flg char (1) NOT NULL,
mon_off_flg char (1) NOT NULL,
tue_off_flg char (1) NOT NULL,
wed_off_flg char (1) NOT NULL,
thu_off_flg char (1) NOT NULL,
fri_off_flg char (1) NOT NULL,
sat_off_flg char (1) NOT NULL,
sub_char1 varchar (50) NULL,
sub_char2 varchar (50) NULL,
sub_char3 varchar (50) NULL,
sub_char4 varchar (50) NULL,
sub_char5 varchar (50) NULL,
sub_char6 varchar (50) NULL,
sub_char7 varchar (50) NULL,
sub_char8 varchar (50) NULL,
sub_char9 varchar (50) NULL,
sub_char10 varchar (50) NULL,
sub_char11 varchar (50) NULL,
sub_char12 varchar (50) NULL,
sub_char13 varchar (50) NULL,
sub_char14 varchar (50) NULL,
sub_char15 varchar (50) NULL,
sub_char16 varchar (50) NULL,
sub_char17 varchar (50) NULL,
sub_char18 varchar (50) NULL,
sub_char19 varchar (50) NULL,
sub_char20 varchar (50) NULL,
sub_char21 varchar (50) NULL,
sub_char22 varchar (50) NULL,
sub_char23 varchar (50) NULL,
sub_char24 varchar (50) NULL,
sub_char25 varchar (50) NULL,
sub_char26 varchar (50) NULL,
sub_char27 varchar (50) NULL,
sub_char28 varchar (50) NULL,
sub_char29 varchar (50) NULL,
sub_char30 varchar (50) NULL,
sub_num1 numeric (21,8) NULL,
sub_num2 numeric (21,8) NULL,
sub_num3 numeric (21,8) NULL,
sub_num4 numeric (21,8) NULL,
sub_num5 numeric (21,8) NULL,
sub_dt1 timestamp(0)  NULL,
sub_dt2 timestamp(0)  NULL,
sub_dt3 timestamp(0)  NULL,
sub_dt4 timestamp(0)  NULL,
sub_dt5 timestamp(0)  NULL,
batch_log_no varchar (15) NULL,
log_sub_key1 numeric (9,0) NULL,
log_sub_key2 numeric (9,0) NULL,
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


ALTER TABLE mst_ordsnd_cal_if_all
ADD CONSTRAINT mst_ordsnd_cal_if_all_pk PRIMARY KEY(data_lno,co_cd);


CREATE INDEX mst_ordsnd_cal_if_all_ie01
ON mst_ordsnd_cal_if_all USING BTREE (wg_cd, cal_cd);


CREATE INDEX mst_ordsnd_cal_if_all_ie02
ON mst_ordsnd_cal_if_all USING BTREE (data_no, co_cd);


CREATE INDEX mst_ordsnd_cal_if_all_ie03
ON mst_ordsnd_cal_if_all USING BTREE (exe_sts_typ, co_cd);


CREATE INDEX mst_ordsnd_cal_if_all_ie04
ON mst_ordsnd_cal_if_all USING BTREE (batch_log_no, co_cd);

