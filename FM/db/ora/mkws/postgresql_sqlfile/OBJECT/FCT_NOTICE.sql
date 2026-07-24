\encoding UTF-8

CREATE TABLE fct_notice
(notice_id varchar (15) NOT NULL,
start_dt timestamp(0)  NOT NULL,
end_dt timestamp(0)  NOT NULL,
locale_cd varchar (20) NULL,
notice_title varchar (500) NOT NULL,
text_line varchar (1000) NULL,
co_cd varchar (10) NULL,
ext_attr1 varchar (50) NULL,
ext_attr2 varchar (50) NULL,
ext_attr3 varchar (50) NULL,
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


ALTER TABLE fct_notice
ADD CONSTRAINT fct_notice_pk PRIMARY KEY(notice_id);

