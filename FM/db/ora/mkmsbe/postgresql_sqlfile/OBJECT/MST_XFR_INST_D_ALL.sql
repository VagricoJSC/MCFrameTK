\encoding UTF-8

CREATE TABLE mst_xfr_inst_d_all
(xfr_inst_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
xfr_inst_no varchar (15) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
base_dlv_slip_no varchar (15) NULL,
base_prov_act_no varchar (15) NULL,
base_ac_dt timestamp(0)  NULL,
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


ALTER TABLE mst_xfr_inst_d_all
ADD CONSTRAINT mst_xfr_inst_d_all_pk PRIMARY KEY(xfr_inst_d_no,co_cd);


CREATE INDEX mst_xfr_inst_d_all_ie01
ON mst_xfr_inst_d_all USING BTREE (xfr_inst_no, co_cd);


CREATE INDEX mst_xfr_inst_d_all_ie02
ON mst_xfr_inst_d_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);

