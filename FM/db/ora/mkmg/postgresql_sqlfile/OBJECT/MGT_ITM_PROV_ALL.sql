\encoding UTF-8

CREATE TABLE mgt_itm_prov_all
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
prsppl_cd varchar (20) NOT NULL,
term timestamp(0)  NOT NULL,
calc_ctg_cd varchar (10) NOT NULL,
wg_cd varchar (10) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
prov_typ varchar (1) NOT NULL,
base_qty numeric (21,8) NOT NULL,
cur_cd varchar (3) NOT NULL,
upri numeric (21,8) NOT NULL,
rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
non_calc_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mgt_itm_prov_all
ADD CONSTRAINT mgt_itm_prov_all_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,prsppl_cd,term,calc_ctg_cd,wg_cd,co_cd);


CREATE INDEX mgt_itm_prov_all_ie01
ON mgt_itm_prov_all USING BTREE (term,calc_ctg_cd,co_cd);


CREATE INDEX mgt_itm_prov_all_ie02
ON mgt_itm_prov_all USING BTREE (prsppl_cd, co_cd);


CREATE INDEX mgt_itm_prov_all_ie03
ON mgt_itm_prov_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);

