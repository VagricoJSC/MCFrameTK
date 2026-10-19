\encoding UTF-8

CREATE TABLE mst_zoho_sls_schd_all
(zoho_sls_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
deal_cd varchar (100) NULL,
deal_nm varchar (100) NULL,
cst_cd varchar (20) NULL,
dlv_cd varchar (20) NULL,
bcst_cd varchar (20) NULL,
sls_dpt_cd varchar (20) NULL,
sls_usr_cd varchar (500) NULL,
prod_itm_cd varchar (40) NULL,
prod_itm_sub1 varchar (5) DEFAULT '*' NULL,
prod_itm_sub2 varchar (5) DEFAULT '*' NULL,
prod_itm_sub3 varchar (5) DEFAULT '*' NULL,
mrkt_cd varchar (2) NULL,
dlv_nm varchar (100) NULL,
dlv_addr1 varchar (250) NULL,
dlv_addr2 varchar (250) NULL,
dlv_tel varchar (30) NULL,
ord_dlv_dt timestamp(0)  NULL,
post_inst_sls_dt timestamp(0)  NULL,
cur_cd varchar (3) NULL,
amt numeric (21,8) NULL,
qty numeric (21,8) NULL,
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


ALTER TABLE mst_zoho_sls_schd_all
ADD CONSTRAINT mst_zoho_sls_schd_all_pk PRIMARY KEY(zoho_sls_schd_no,co_cd);

