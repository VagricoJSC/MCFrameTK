\encoding UTF-8

CREATE TABLE mgt_act_ptn_config_all
(act_ptn_cd varchar (10) NOT NULL,
calc_act_seq numeric (3,0) NOT NULL,
co_cd varchar (10) NOT NULL,
term timestamp(0)  NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
st_ym timestamp(0)  NOT NULL,
end_ym timestamp(0)  NOT NULL,
xrate_cd varchar (2) NULL,
carry_flg char (1) DEFAULT '0' NOT NULL,
err_proceed_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mgt_act_ptn_config_all
ADD CONSTRAINT mgt_act_ptn_config_all_pk PRIMARY KEY(act_ptn_cd,calc_act_seq,co_cd);

