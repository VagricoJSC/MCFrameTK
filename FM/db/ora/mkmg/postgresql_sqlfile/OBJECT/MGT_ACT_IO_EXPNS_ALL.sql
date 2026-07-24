\encoding UTF-8

CREATE TABLE mgt_act_io_expns_all
(act_io_id varchar (20) NOT NULL,
act_io_id_sub varchar (3) NOT NULL,
expns_cd varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
amt numeric (21,8) NOT NULL,
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


ALTER TABLE mgt_act_io_expns_all
ADD CONSTRAINT mgt_act_io_expns_all_pk PRIMARY KEY(act_io_id,act_io_id_sub,expns_cd,co_cd);

