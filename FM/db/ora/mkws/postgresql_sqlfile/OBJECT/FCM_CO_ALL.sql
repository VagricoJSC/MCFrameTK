\encoding UTF-8

CREATE TABLE fcm_co_all
(co_cd varchar (10) NOT NULL,
co_nm varchar (40) NOT NULL,
def_locale_cd varchar (20) NOT NULL,
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


ALTER TABLE fcm_co_all
ADD CONSTRAINT fcm_co_all_pk PRIMARY KEY(co_cd);

