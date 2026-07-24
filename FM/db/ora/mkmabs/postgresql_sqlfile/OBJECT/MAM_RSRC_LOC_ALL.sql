\encoding UTF-8

CREATE TABLE mam_rsrc_loc_all
(mfg_loc_cd varchar (20) NOT NULL,
rsrc_cd varchar (10) NOT NULL,
st_dt timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
end_dt timestamp(0)  NOT NULL,
rsrc_base_qty numeric (21,8) NOT NULL,
var_per numeric (5,2) NULL,
alert_per numeric (5,2) NULL,
disp_seq numeric (9,0) NOT NULL,
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


ALTER TABLE mam_rsrc_loc_all
ADD CONSTRAINT mam_rsrc_loc_all_pk PRIMARY KEY(mfg_loc_cd,rsrc_cd,st_dt,co_cd);

