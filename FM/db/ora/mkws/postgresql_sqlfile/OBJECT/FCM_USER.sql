\encoding UTF-8

CREATE TABLE fcm_user
(user_id varchar (500) NOT NULL,
user_nm varchar (40) NULL,
user_pw varchar (40) NULL,
pw_mod_dt timestamp(0)  NULL,
act_dt timestamp(0)  NULL,
inact_dt timestamp(0)  NULL,
inv_flg char (1) NOT NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (40) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (40) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL
);


ALTER TABLE fcm_user
ADD CONSTRAINT fcm_user_pk PRIMARY KEY(user_id);

