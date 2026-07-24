\encoding UTF-8

CREATE TABLE mam_itm_cmn
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_nm varchar (100) NOT NULL,
itm_alt_nm1 varchar (100) NULL,
itm_alt_nm2 varchar (100) NULL,
itm_alt_nm3 varchar (100) NULL,
itm_alt_nm4 varchar (100) NULL,
itm_grp_cd1 varchar (10) NULL,
itm_grp_cd2 varchar (10) NULL,
itm_grp_cd3 varchar (10) NULL,
itm_grp_cd4 varchar (10) NULL,
itm_grp_cd5 varchar (10) NULL,
itm_grp_cd6 varchar (10) NULL,
itm_grp_cd7 varchar (10) NULL,
itm_grp_cd8 varchar (10) NULL,
itm_grp_cd9 varchar (10) NULL,
itm_grp_cd10 varchar (10) NULL,
stk_mng_typ varchar (1) NOT NULL,
asset_mng_typ varchar (1) NOT NULL,
sundry_itm_flg char (1) DEFAULT '0' NOT NULL,
dscnt_itm_flg char (1) DEFAULT '0' NOT NULL,
unit_cd varchar (5) NOT NULL,
dec_place numeric (2,0) NOT NULL,
rnd_typ varchar (1) NOT NULL,
dim_unit_cd varchar (5) NULL,
dim numeric (21,8) NULL,
wt_unit_cd varchar (5) NULL,
wt numeric (21,8) NULL,
conts_unit_cd varchar (5) NULL,
conts_qty numeric (21,8) NULL,
unit_dim numeric (21,8) NULL,
unit_wt numeric (21,8) NULL,
hs_cd varchar (10) NULL,
jan_typ varchar (1) NULL,
jan_cd varchar (13) NULL,
itf_cd varchar (16) NULL,
gtin_cd varchar (14) NULL,
th_image numeric  NULL,
sls_itm_grp_cd varchar (10) NULL,
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


ALTER TABLE mam_itm_cmn
ADD CONSTRAINT mam_itm_cmn_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3);


CREATE INDEX mam_itm_cmn_ie01
ON mam_itm_cmn USING BTREE (itm_nm);


CREATE INDEX mam_itm_cmn_ie02
ON mam_itm_cmn USING BTREE (itm_alt_nm1);


CREATE INDEX mam_itm_cmn_ie03
ON mam_itm_cmn USING BTREE (itm_alt_nm2);


CREATE INDEX mam_itm_cmn_ie04
ON mam_itm_cmn USING BTREE (itm_alt_nm3);


CREATE INDEX mam_itm_cmn_ie05
ON mam_itm_cmn USING BTREE (itm_alt_nm4);


CREATE INDEX mam_itm_cmn_ie06
ON mam_itm_cmn USING BTREE (itm_grp_cd1);


CREATE INDEX mam_itm_cmn_ie07
ON mam_itm_cmn USING BTREE (itm_grp_cd2);


CREATE INDEX mam_itm_cmn_ie08
ON mam_itm_cmn USING BTREE (itm_grp_cd3);


CREATE INDEX mam_itm_cmn_ie09
ON mam_itm_cmn USING BTREE (itm_grp_cd4);


CREATE INDEX mam_itm_cmn_ie10
ON mam_itm_cmn USING BTREE (itm_grp_cd5);


CREATE INDEX mam_itm_cmn_ie11
ON mam_itm_cmn USING BTREE (itm_grp_cd6);


CREATE INDEX mam_itm_cmn_ie12
ON mam_itm_cmn USING BTREE (itm_grp_cd7);


CREATE INDEX mam_itm_cmn_ie13
ON mam_itm_cmn USING BTREE (itm_grp_cd8);


CREATE INDEX mam_itm_cmn_ie14
ON mam_itm_cmn USING BTREE (itm_grp_cd9);


CREATE INDEX mam_itm_cmn_ie15
ON mam_itm_cmn USING BTREE (itm_grp_cd10);


CREATE INDEX mam_itm_cmn_ie16
ON mam_itm_cmn USING BTREE (sls_itm_grp_cd);


INSERT INTO fcm_delete_binary (table_name, column_name)
VALUES ('mam_itm_cmn','th_image');

