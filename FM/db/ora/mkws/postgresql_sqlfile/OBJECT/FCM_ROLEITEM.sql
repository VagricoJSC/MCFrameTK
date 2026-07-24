\encoding UTF-8

CREATE TABLE fcm_roleitem
(iid numeric (15) NOT NULL,
rid varchar (50) NOT NULL,
type_cd varchar (1) NOT NULL,
actype varchar (50) NOT NULL,
chk_pw char (1) NOT NULL,
chk_id char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE fcm_roleitem
ADD CONSTRAINT fcm_roleitem_pk PRIMARY KEY(iid);

