\encoding UTF-8

CREATE TABLE mst_spln_fmt_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
spln_fmt_no varchar (15) NULL,
co_cd varchar (10) NULL,
dpt_cd varchar (20) NULL,
cst_cd varchar (20) DEFAULT '*' NULL,
wrk_no varchar (15) DEFAULT '*' NULL,
spln_itm_cd varchar (40) DEFAULT '*' NULL,
itm_cd varchar (40) DEFAULT '*' NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
cur_cd varchar (3) NULL,
spln_set_typ varchar (1) NULL,
cst_cd_unit_flg char (1) DEFAULT '0' NULL,
wrk_no_unit_flg char (1) DEFAULT '0' NULL,
disp_seq numeric (4,0) NULL,
st_ym timestamp(0)  NULL,
end_ym timestamp(0)  NULL,
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



ALTER TABLE mst_spln_fmt_all_r ADD CONSTRAINT mst_spln_fmt_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mst_spln_fmt_all_r', 'mst_spln_fmt_all', 'mst_spln_fmt_all_tr_r');

