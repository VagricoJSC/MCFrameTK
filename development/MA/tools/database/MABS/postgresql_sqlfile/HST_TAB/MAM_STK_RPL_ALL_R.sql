\encoding UTF-8

CREATE TABLE mam_stk_rpl_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NULL,
itm_sub2 varchar (5) DEFAULT '*' NULL,
itm_sub3 varchar (5) DEFAULT '*' NULL,
loc_cd varchar (20) NULL,
st_dt timestamp(0)  NULL,
co_cd varchar (10) NULL,
end_dt timestamp(0)  NULL,
buf_qty numeric (21,8) NULL,
rord_stk_qty numeric (21,8) NULL,
gi_schd_flg char (1) DEFAULT '0' NULL,
rord_rqst_qty numeric (21,8) NULL,
lot_sizing_flg char (1) DEFAULT '0' NULL,
gi_loc_cd varchar (20) NULL,
gi_str_ln_cd varchar (10) NULL,
inpt_gi_loc_cd varchar (20) NULL,
inpt_gi_str_ln_cd varchar (10) NULL,
ship_gi_loc_cd varchar (20) NULL,
ship_gi_str_ln_cd varchar (10) NULL,
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



ALTER TABLE mam_stk_rpl_all_r ADD CONSTRAINT mam_stk_rpl_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_stk_rpl_all_r', 'mam_stk_rpl_all', 'mam_stk_rpl_all_tr_r');

