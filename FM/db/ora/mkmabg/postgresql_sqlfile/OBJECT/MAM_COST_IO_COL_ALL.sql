\encoding UTF-8

CREATE TABLE mam_cost_io_col_all
(cost_io_id numeric (2,0) NOT NULL,
io_col_cd varchar (10) NOT NULL,
ac_slip_typ varchar (5) NOT NULL,
ac_rsn_cd varchar (10) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NOT NULL,
del_usr_id varchar (500) NULL,
del_usr_nm varchar (100) NULL,
del_ts timestamp(3)  NULL,
ins_usr_id varchar (500) NULL,
ins_usr_nm varchar (100) NULL,
ins_ts timestamp(3)  NULL,
ins_func_id varchar (50) NULL,
upd_cntr numeric (9,0) DEFAULT 0 NULL,
upd_usr_id varchar (500) NULL,
upd_usr_nm varchar (100) NULL,
upd_ts timestamp(3)  NULL,
upd_func_id varchar (50) NULL,
upd_srv_req_no varchar (50) NULL,
co_cd varchar (10) NOT NULL
);


ALTER TABLE mam_cost_io_col_all
ADD CONSTRAINT mam_cost_io_col_all_pk UNIQUE(cost_io_id,io_col_cd,ac_slip_typ,ac_rsn_cd,co_cd);


CREATE UNIQUE INDEX mam_cost_io_col_all_pk_ie ON mam_cost_io_col_all (cost_io_id,io_col_cd,ac_slip_typ,COALESCE(ac_rsn_cd,''),co_cd);

