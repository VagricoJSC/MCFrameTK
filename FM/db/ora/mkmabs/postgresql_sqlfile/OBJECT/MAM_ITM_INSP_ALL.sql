\encoding UTF-8

CREATE TABLE mam_itm_insp_all
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
mfg_loc_cd varchar (20) DEFAULT '*' NOT NULL,
sppl_cd varchar (20) DEFAULT '*' NOT NULL,
maker_cd varchar (20) DEFAULT '*' NOT NULL,
from_site_cd varchar (10) DEFAULT '*' NOT NULL,
to_site_cd varchar (10) DEFAULT '*' NOT NULL,
st_dt timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
end_dt timestamp(0)  NOT NULL,
no_insp_flg char (1) DEFAULT '0' NOT NULL,
insp_ptn_cd varchar (2) NULL,
no_mrkt_judg_flg char (1) DEFAULT '0' NOT NULL,
no_plnt_aprv_flg char (1) DEFAULT '0' NOT NULL,
no_insp_aprv_flg char (1) DEFAULT '0' NOT NULL,
lmt_dt_frm_typ varchar (1) NULL,
vld_pd numeric (6,0) NOT NULL,
lmt_pd numeric (6,0) NOT NULL,
lot_insp_vld_pd numeric (6,0) NULL,
calc_pd_typ varchar (1) NULL,
lot_insp_lmt_dt_frm_typ varchar (1) NULL,
insp_inst_issue_typ varchar (1) NULL,
insp_offst numeric (9,0) NULL,
inst_rslt_issue_flg char (1) DEFAULT '0' NOT NULL,
pre_insp_valid_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_itm_insp_all
ADD CONSTRAINT mam_itm_insp_all_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,mfg_loc_cd,sppl_cd,maker_cd,from_site_cd,to_site_cd,st_dt,co_cd);

