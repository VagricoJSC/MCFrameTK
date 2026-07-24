\encoding UTF-8

CREATE TABLE mam_loss_rsn_all
(itm_typ varchar (1) NOT NULL,
itm_typ_d_cd varchar (10) NOT NULL,
loss_rsn_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
def_disp_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_loss_rsn_all
ADD CONSTRAINT mam_loss_rsn_all_pk PRIMARY KEY(itm_typ,itm_typ_d_cd,loss_rsn_cd,co_cd);

