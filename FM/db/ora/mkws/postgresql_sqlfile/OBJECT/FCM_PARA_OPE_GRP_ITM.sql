\encoding UTF-8

CREATE TABLE fcm_para_ope_grp_itm
(iid numeric (15) NOT NULL,
gid numeric (15) NOT NULL,
ptn varchar (50) NOT NULL,
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


ALTER TABLE fcm_para_ope_grp_itm
ADD CONSTRAINT fcm_para_ope_grp_itm_pk PRIMARY KEY(iid);

