\encoding UTF-8

CREATE TABLE mst_plnt_aprv_all
(plnt_aprv_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
skip_chk_ship_flg char (1) DEFAULT '0' NOT NULL,
plnt_aprv_sts_typ varchar (1) NOT NULL,
aprv_dt timestamp(0)  NULL,
aprv_tm timestamp(0)  NULL,
plnt_aprv_role_cd varchar (10) NOT NULL,
aprv_dpt_cd varchar (20) NULL,
aprv_usr_cd varchar (500) NULL,
aprv_rsn varchar (100) NULL,
plnt_aprv_prnt_flg char (1) DEFAULT '0' NOT NULL,
plnt_aprv_prnt_tm timestamp(0)  NULL,
seq numeric (3,0) NOT NULL,
site_cd varchar (10) NOT NULL,
intr_rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
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


ALTER TABLE mst_plnt_aprv_all
ADD CONSTRAINT mst_plnt_aprv_all_pk PRIMARY KEY(plnt_aprv_no,co_cd);


CREATE INDEX mst_plnt_aprv_all_ie01
ON mst_plnt_aprv_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,sublot_no,site_cd,plnt_aprv_sts_typ,co_cd);


CREATE INDEX mst_plnt_aprv_all_ie02
ON mst_plnt_aprv_all USING BTREE (lot_no,co_cd);

