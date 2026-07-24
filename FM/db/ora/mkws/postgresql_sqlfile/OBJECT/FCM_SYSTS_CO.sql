\encoding UTF-8

CREATE TABLE fcm_systs_co
(co_cd varchar (10) NULL,
diff varchar (50) NULL,
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


ALTER TABLE fcm_systs_co
ADD CONSTRAINT fcm_systs_co_pk UNIQUE(co_cd);


CREATE UNIQUE INDEX fcm_systs_co_pk_ie ON fcm_systs_co (COALESCE(co_cd,''));

