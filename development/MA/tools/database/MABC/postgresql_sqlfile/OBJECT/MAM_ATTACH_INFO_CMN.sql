\encoding UTF-8

CREATE TABLE mam_attach_info_cmn
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
wg_cd varchar (10) DEFAULT '*' NOT NULL,
attach_info_key1 varchar (50) NULL,
attach_info_key2 varchar (50) NULL,
attach_info_key3 varchar (50) NULL,
attach_info_key4 varchar (50) NULL,
attach_info_key5 varchar (50) NULL,
attach_info_id varchar (20) NOT NULL,
attach_info_typ varchar (1) NOT NULL,
attach_info_rmrks varchar (100) NOT NULL,
attach_info_path varchar (200) NULL,
attach_info_bin numeric  NULL,
attach_info_bin_nm varchar (200) NULL,
ext_sys_no_attach varchar (20) NULL,
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


ALTER TABLE mam_attach_info_cmn
ADD CONSTRAINT mam_attach_info_cmn_pk UNIQUE(itm_cd,itm_sub1,itm_sub2,itm_sub3,sno1,sno2,sno3,sno4,wg_cd,attach_info_key1,attach_info_key2,attach_info_key3,attach_info_key4,attach_info_key5,attach_info_id,attach_info_typ);


CREATE INDEX mam_attach_info_cmn_ie01
ON mam_attach_info_cmn USING BTREE (ext_sys_no_attach);


CREATE UNIQUE INDEX mam_attach_info_cmn_pk_ie ON mam_attach_info_cmn (itm_cd,itm_sub1,itm_sub2,itm_sub3,sno1,sno2,sno3,sno4,wg_cd,COALESCE(attach_info_key1,''),COALESCE(attach_info_key2,''),COALESCE(attach_info_key3,''),COALESCE(attach_info_key4,''),COALESCE(attach_info_key5,''),attach_info_id,attach_info_typ);

;

INSERT INTO fcm_delete_binary (table_name, column_name)
VALUES ('mam_attach_info_cmn','attach_info_bin');

