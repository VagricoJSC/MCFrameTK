\encoding UTF-8

CREATE TABLE fcm_resource
(user_id varchar (500) NOT NULL,
pgm_id varchar (512) DEFAULT 'ALL' NOT NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
locale varchar (20) NULL,
name varchar (16) NOT NULL,
res_key varchar (512) NOT NULL,
res_val varchar (1000) NULL,
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



CREATE INDEX fcm_resource_ie01
ON fcm_resource USING BTREE (user_id, pgm_id,co_cd, ext_attr1, ext_attr2, ext_attr3);

