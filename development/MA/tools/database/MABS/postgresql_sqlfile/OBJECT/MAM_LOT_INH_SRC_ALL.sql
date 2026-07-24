\encoding UTF-8

CREATE TABLE mam_lot_inh_src_all
(par_itm_cd varchar (40) NOT NULL,
par_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
par_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
par_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
bom_ptn varchar (40) NOT NULL,
chd_itm_cd varchar (40) NOT NULL,
chd_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
chd_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
chd_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
lot_inh_col_typ varchar (30) NOT NULL,
wg_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
prio numeric (9,0) NOT NULL,
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


ALTER TABLE mam_lot_inh_src_all
ADD CONSTRAINT mam_lot_inh_src_all_pk PRIMARY KEY(par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,lot_inh_col_typ,wg_cd,co_cd);

