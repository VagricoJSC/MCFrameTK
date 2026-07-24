\encoding UTF-8

CREATE TABLE fcm_gp_batch_grp_all
(gp_batch_grp_cd varchar (50) NOT NULL,
co_cd varchar (10) NOT NULL,
gp_batch_grp_nm varchar (100) NOT NULL,
module_id varchar (3) NULL,
logic_id varchar (50) NULL,
func_typ varchar (10) NULL,
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


ALTER TABLE fcm_gp_batch_grp_all
ADD CONSTRAINT fcm_gp_batch_grp_all_pk PRIMARY KEY(gp_batch_grp_cd,co_cd);

