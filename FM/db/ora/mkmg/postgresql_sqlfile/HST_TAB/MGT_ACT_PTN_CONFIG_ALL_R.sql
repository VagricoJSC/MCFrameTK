\encoding UTF-8

CREATE TABLE mgt_act_ptn_config_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
act_ptn_cd varchar (10) NULL,
calc_act_seq numeric (3,0) NULL,
co_cd varchar (10) NULL,
term timestamp(0)  NULL,
calc_grp_cd varchar (10) NULL,
st_ym timestamp(0)  NULL,
end_ym timestamp(0)  NULL,
xrate_cd varchar (2) NULL,
carry_flg char (1) DEFAULT '0' NULL,
err_proceed_flg char (1) DEFAULT '0' NULL,
rmrks varchar (100) NULL,
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



ALTER TABLE mgt_act_ptn_config_all_r ADD CONSTRAINT mgt_act_ptn_config_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mgt_act_ptn_config_all_r', 'mgt_act_ptn_config_all', 'mgt_act_ptn_config_all_tr_r');

