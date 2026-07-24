\encoding UTF-8

CREATE TABLE mat_push_ntc_usr_all
(push_ntc_no varchar (15) NOT NULL,
usr_cd varchar (500) NOT NULL,
msg_imp_typ varchar (1) NOT NULL,
push_typ varchar (1) NOT NULL,
co_cd varchar (10) NOT NULL,
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


ALTER TABLE mat_push_ntc_usr_all
ADD CONSTRAINT mat_push_ntc_usr_all_pk PRIMARY KEY(push_ntc_no,usr_cd,msg_imp_typ,push_typ,co_cd);


CREATE INDEX mat_push_ntc_usr_all_ie01
ON mat_push_ntc_usr_all USING BTREE (upd_srv_req_no);

