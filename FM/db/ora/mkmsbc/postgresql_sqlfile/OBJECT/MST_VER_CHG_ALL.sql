\encoding UTF-8

CREATE TABLE mst_ver_chg_all
(par_itm_cd varchar (40) NOT NULL,
par_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
par_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
par_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
chd_itm_cd varchar (40) NOT NULL,
chd_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
chd_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
chd_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
ver_no varchar (10) NOT NULL,
bom_ptn varchar (40) NOT NULL,
wg_cd varchar (10) NOT NULL,
site_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
ver_chg_sts_typ varchar (1) NOT NULL,
first_inst_st_tm timestamp(0)  NULL,
first_inst_lot_no varchar (15) NULL,
first_inst_sublot_no varchar (15) NULL,
first_mfg_inst_no varchar (15) NULL,
first_act_st_tm timestamp(0)  NULL,
first_act_lot_no varchar (15) NULL,
first_act_sublot_no varchar (15) NULL,
first_mfg_act_no varchar (15) NULL,
last_act_st_tm timestamp(0)  NULL,
last_act_lot_no varchar (15) NULL,
last_act_sublot_no varchar (15) NULL,
last_mfg_act_no varchar (15) NULL,
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


ALTER TABLE mst_ver_chg_all
ADD CONSTRAINT mst_ver_chg_all_pk PRIMARY KEY(par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,ver_no,bom_ptn,wg_cd,site_cd,co_cd);


CREATE INDEX mst_ver_chg_all_ie01
ON mst_ver_chg_all USING BTREE (chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,ver_no,co_cd);


CREATE INDEX mst_ver_chg_all_ie02
ON mst_ver_chg_all USING BTREE (first_inst_st_tm,co_cd);


CREATE INDEX mst_ver_chg_all_ie03
ON mst_ver_chg_all USING BTREE (first_act_st_tm,co_cd);


CREATE INDEX mst_ver_chg_all_ie04
ON mst_ver_chg_all USING BTREE (last_act_st_tm,co_cd);

