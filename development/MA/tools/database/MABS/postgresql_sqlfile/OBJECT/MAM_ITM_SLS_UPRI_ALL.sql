\encoding UTF-8

CREATE TABLE mam_itm_sls_upri_all
(sls_upri_grp_cd varchar (5) DEFAULT '*' NOT NULL,
itm_cd varchar (40) DEFAULT '*' NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
sls_upri_rank_cd varchar (5) DEFAULT '*' NOT NULL,
unit_cd varchar (5) NOT NULL,
lot_qty numeric (21,8) NOT NULL,
cur_cd varchar (3) NOT NULL,
wg_cd varchar (10) DEFAULT '*' NOT NULL,
st_dt timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
end_dt timestamp(0)  NOT NULL,
upri numeric (21,8) NULL,
upri_bf numeric (21,8) NULL,
interim_flg char (1) DEFAULT '0' NOT NULL,
upri_rate numeric (5,2) NULL,
upri_rate_bf numeric (5,2) NULL,
sub_upri1 numeric (21,8) NULL,
sub_upri2 numeric (21,8) NULL,
sub_upri3 numeric (21,8) NULL,
not_cost_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mam_itm_sls_upri_all
ADD CONSTRAINT mam_itm_sls_upri_all_pk PRIMARY KEY(sls_upri_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,sls_upri_rank_cd,unit_cd,lot_qty,cur_cd,wg_cd,st_dt,co_cd);


CREATE INDEX mam_itm_sls_upri_all_ie01
ON mam_itm_sls_upri_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3);


CREATE INDEX mam_itm_sls_upri_all_ie02
ON mam_itm_sls_upri_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,sls_upri_grp_cd,wg_cd,co_cd,del_flg);

