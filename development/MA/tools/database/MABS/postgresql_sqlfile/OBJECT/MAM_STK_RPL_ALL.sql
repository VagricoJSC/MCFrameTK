\encoding UTF-8

CREATE TABLE mam_stk_rpl_all
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
loc_cd varchar (20) NOT NULL,
st_dt timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
end_dt timestamp(0)  NOT NULL,
buf_qty numeric (21,8) NULL,
rord_stk_qty numeric (21,8) NULL,
gi_schd_flg char (1) DEFAULT '0' NOT NULL,
rord_rqst_qty numeric (21,8) NULL,
lot_sizing_flg char (1) DEFAULT '0' NOT NULL,
gi_loc_cd varchar (20) NULL,
gi_str_ln_cd varchar (10) NULL,
inpt_gi_loc_cd varchar (20) NULL,
inpt_gi_str_ln_cd varchar (10) NULL,
ship_gi_loc_cd varchar (20) NULL,
ship_gi_str_ln_cd varchar (10) NULL,
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


ALTER TABLE mam_stk_rpl_all
ADD CONSTRAINT mam_stk_rpl_all_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,loc_cd,st_dt,co_cd);

