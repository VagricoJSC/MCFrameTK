\encoding UTF-8

CREATE TABLE fcm_grant_menu_ptn
(gid numeric (15) NOT NULL,
user_id varchar (500) NOT NULL,
co_cd varchar (10) NOT NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
menu_ptn_id varchar (50) NOT NULL,
st_dt timestamp(0)  NOT NULL,
end_dt timestamp(0)  NOT NULL,
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


ALTER TABLE fcm_grant_menu_ptn
ADD CONSTRAINT fcm_grant_menu_ptn_pk PRIMARY KEY(gid);

