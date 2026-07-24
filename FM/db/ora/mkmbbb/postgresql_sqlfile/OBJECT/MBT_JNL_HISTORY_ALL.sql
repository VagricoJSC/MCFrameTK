\encoding UTF-8

CREATE TABLE mbt_jnl_history_all
(jnl_grp_no varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
ac_ym timestamp(0)  NOT NULL,
st_dt timestamp(0)  NOT NULL,
end_dt timestamp(0)  NOT NULL,
ac_slip_dt timestamp(0)  NOT NULL,
jnl_act_cd varchar (1) NOT NULL,
data_typ varchar (1) NOT NULL,
rerun_flg char (1) DEFAULT '0' NOT NULL,
jnl_rmrks varchar (100) NULL,
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


ALTER TABLE mbt_jnl_history_all
ADD CONSTRAINT mbt_jnl_history_all_pk PRIMARY KEY(jnl_grp_no,co_cd);

