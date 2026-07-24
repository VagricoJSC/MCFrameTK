\encoding UTF-8

CREATE TABLE mam_insp_spec_all
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
insp_ptn_cd varchar (2) NOT NULL,
insp_seq numeric (3,0) NOT NULL,
st_dt timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
end_dt timestamp(0)  NOT NULL,
insp_point_cd varchar (5) NOT NULL,
pre_insp_inf_typ varchar (1) NULL,
insp_qlqn_typ varchar (1) NOT NULL,
ql_std_val varchar (30) NULL,
unit_cd varchar (5) NULL,
qn_int_digit numeric (2,0) NULL,
qn_int_frac numeric (2,0) NULL,
qn_out_min numeric (21,8) NULL,
sign_out_min_typ varchar (2) NULL,
sign_out_max_typ varchar (2) NULL,
qn_out_max numeric (21,8) NULL,
qn_in_min numeric (21,8) NULL,
sign_in_min_typ varchar (2) NULL,
sign_in_max_typ varchar (2) NULL,
qn_in_max numeric (21,8) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_insp_spec_all
ADD CONSTRAINT mam_insp_spec_all_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,insp_ptn_cd,insp_seq,st_dt,co_cd);

