\encoding UTF-8

CREATE TABLE mam_aprv_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
aprv_func_typ varchar (2) NULL,
aprv_row_num numeric (4,0) NULL,
st_dt timestamp(0)  NULL,
end_dt timestamp(0)  NULL,
prio numeric (9,0) NULL,
aprv_rt_ptn varchar (10) NULL,
aprv_upd_flg char (1) DEFAULT '0' NULL,
aprv_del_flg char (1) DEFAULT '0' NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) NULL,
itm_sub2 varchar (5) NULL,
itm_sub3 varchar (5) NULL,
itm_grp_typ varchar (2) NULL,
itm_grp_cd varchar (10) NULL,
dpt_cd varchar (20) NULL,
bp_cd varchar (20) NULL,
bp_grp_typ varchar (2) NULL,
bp_grp_cd varchar (10) NULL,
cur_cd1 varchar (3) NULL,
val_min1 numeric (21,8) NULL,
val_max1 numeric (21,8) NULL,
bind_cond1 varchar (1) NULL,
cur_cd2 varchar (3) NULL,
val_min2 numeric (21,8) NULL,
val_max2 numeric (21,8) NULL,
bind_cond2 varchar (1) NULL,
cur_cd3 varchar (3) NULL,
val_min3 numeric (21,8) NULL,
val_max3 numeric (21,8) NULL,
ext_key1 varchar (20) NULL,
ext_key2 varchar (20) NULL,
ext_key3 varchar (20) NULL,
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
upd_srv_req_no varchar (50) NULL,
co_cd varchar (10) NULL
);



ALTER TABLE mam_aprv_all_r ADD CONSTRAINT mam_aprv_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_aprv_all_r', 'mam_aprv_all', 'mam_aprv_all_tr_r');

