\encoding UTF-8

CREATE TABLE mst_po_crct_rsn_all
(po_crct_rsn_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
po_crct_rsn_nm varchar (100) NOT NULL,
po_crct_rsn_rmrks varchar (100) NULL,
upri_mod_typ varchar (1) NOT NULL,
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


ALTER TABLE mst_po_crct_rsn_all
ADD CONSTRAINT mst_po_crct_rsn_all_pk PRIMARY KEY(po_crct_rsn_cd,co_cd);

