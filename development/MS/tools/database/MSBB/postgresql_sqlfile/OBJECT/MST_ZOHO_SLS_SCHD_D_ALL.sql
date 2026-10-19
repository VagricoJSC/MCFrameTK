\encoding UTF-8

CREATE TABLE mst_zoho_sls_schd_d_all
(zoho_sls_schd_no varchar (15) NOT NULL,
zoho_sls_schd_br_no varchar (5) NOT NULL,
co_cd varchar (10) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
qty numeric (21,8) NULL,
upri numeric (21,8) NULL,
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


ALTER TABLE mst_zoho_sls_schd_d_all
ADD CONSTRAINT mst_zoho_sls_schd_d_all_pk PRIMARY KEY(zoho_sls_schd_no,zoho_sls_schd_br_no,co_cd);

