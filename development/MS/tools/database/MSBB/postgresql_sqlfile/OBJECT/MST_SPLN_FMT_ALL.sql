\encoding UTF-8

CREATE TABLE mst_spln_fmt_all
(spln_fmt_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
dpt_cd varchar (20) NOT NULL,
cst_cd varchar (20) DEFAULT '*' NOT NULL,
wrk_no varchar (15) DEFAULT '*' NOT NULL,
spln_itm_cd varchar (40) DEFAULT '*' NOT NULL,
itm_cd varchar (40) DEFAULT '*' NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
cur_cd varchar (3) NOT NULL,
spln_set_typ varchar (1) NULL,
cst_cd_unit_flg char (1) DEFAULT '0' NOT NULL,
wrk_no_unit_flg char (1) DEFAULT '0' NOT NULL,
disp_seq numeric (4,0) NULL,
st_ym timestamp(0)  NOT NULL,
end_ym timestamp(0)  NOT NULL,
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


ALTER TABLE mst_spln_fmt_all
ADD CONSTRAINT mst_spln_fmt_all_pk PRIMARY KEY(spln_fmt_no,co_cd);

