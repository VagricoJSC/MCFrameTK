\encoding UTF-8

CREATE TABLE mam_cur_xrate_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
fr_cur_cd varchar (3) NULL,
to_cur_cd varchar (3) NULL,
xrate_cd varchar (2) NULL,
st_dt timestamp(0)  NULL,
end_dt timestamp(0)  NULL,
xrate numeric (21,8) NULL,
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



ALTER TABLE mam_cur_xrate_all_r ADD CONSTRAINT mam_cur_xrate_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_cur_xrate_all_r', 'mam_cur_xrate_all', 'mam_cur_xrate_all_tr_r');

