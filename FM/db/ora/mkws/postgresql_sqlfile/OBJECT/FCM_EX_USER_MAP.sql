\encoding UTF-8

CREATE TABLE fcm_ex_user_map
(ex_user_id varchar (500) NOT NULL,
auth_mode varchar (10) NOT NULL,
user_id varchar (500) NOT NULL,
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


ALTER TABLE fcm_ex_user_map
ADD CONSTRAINT fcm_ex_user_map_pk PRIMARY KEY(ex_user_id,auth_mode);

