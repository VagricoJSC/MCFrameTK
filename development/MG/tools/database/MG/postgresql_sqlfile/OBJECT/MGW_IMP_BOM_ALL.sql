\encoding UTF-8

CREATE TABLE mgw_imp_bom_all
(par_itm_cd varchar (40) NOT NULL,
par_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
par_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
par_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
bom_ptn varchar (40) NOT NULL,
oper_cd varchar (10) NULL,
oper_seq numeric (9,0) NULL,
chd_itm_cd varchar (40) NOT NULL,
chd_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
chd_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
chd_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
alt_grp_cd varchar (40) NULL,
expns_cd varchar (20) NULL,
term timestamp(0)  NOT NULL,
calc_ctg_cd varchar (10) NOT NULL,
wg_cd varchar (10) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
disp_seq numeric (9,0) NOT NULL,
par_rqmt_qty numeric (21,8) NOT NULL,
chd_rqmt_qty numeric (21,8) NOT NULL,
chd_base_qty numeric (21,8) NOT NULL,
fxd_chd_rqmt_qty numeric (21,8) NOT NULL,
chd_min_qty numeric (21,8) NOT NULL,
chd_batch_qty numeric (21,8) NOT NULL,
alt_itm_ratio numeric (9,0) NULL,
rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL,
non_calc_flg char (1) DEFAULT '0' NOT NULL,
imp_err_flg char (1) DEFAULT '0' NOT NULL,
imp_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mgw_imp_bom_all
ADD CONSTRAINT mgw_imp_bom_all_pk UNIQUE(par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,oper_cd,oper_seq,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,alt_grp_cd,expns_cd,term,calc_ctg_cd,wg_cd,co_cd);


CREATE INDEX mgw_imp_bom_all_ie01
ON mgw_imp_bom_all USING BTREE (term,co_cd);


CREATE INDEX mgw_imp_bom_all_ie02
ON mgw_imp_bom_all USING BTREE (calc_ctg_cd,co_cd);


CREATE INDEX mgw_imp_bom_all_ie03
ON mgw_imp_bom_all USING BTREE (par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,term,calc_ctg_cd,bom_ptn,wg_cd,co_cd);


CREATE UNIQUE INDEX mgw_imp_bom_all_pk_ie ON mgw_imp_bom_all (par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,COALESCE(oper_cd,''),COALESCE(oper_seq,0),chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,COALESCE(alt_grp_cd,''),COALESCE(expns_cd,''),term,calc_ctg_cd,wg_cd,co_cd);

