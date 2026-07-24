\encoding UTF-8

CREATE TABLE mam_cost_io_conf_cmn
(cost_io_id numeric (2,0) NOT NULL,
io_col_cd varchar (10) NOT NULL,
io_col_nm varchar (40) NOT NULL,
io_seq numeric (2,0) NOT NULL,
io_tgt_typ varchar (1) NOT NULL,
io_sml_typ varchar (1) NOT NULL,
unit_flg char (1) DEFAULT '0' NOT NULL,
qty_flg char (1) DEFAULT '0' NOT NULL,
amt_flg char (1) DEFAULT '0' NOT NULL,
std_flg char (1) DEFAULT '0' NOT NULL,
diff_flg char (1) DEFAULT '0' NOT NULL,
bal_calc_typ varchar (1) NOT NULL,
minus_flg char (1) DEFAULT '0' NOT NULL,
fg_r numeric (3,0) NULL,
fg_g numeric (3,0) NULL,
fg_b numeric (3,0) NULL,
bg_r numeric (3,0) NULL,
bg_g numeric (3,0) NULL,
bg_b numeric (3,0) NULL,
prov_expns_flg char (1) DEFAULT '0' NOT NULL,
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
upd_srv_req_no varchar (50) NULL
);


ALTER TABLE mam_cost_io_conf_cmn
ADD CONSTRAINT mam_cost_io_conf_cmn_pk PRIMARY KEY(cost_io_id,io_col_cd);

