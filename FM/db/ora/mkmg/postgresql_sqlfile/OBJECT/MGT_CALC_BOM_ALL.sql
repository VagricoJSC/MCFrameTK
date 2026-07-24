\encoding UTF-8

CREATE TABLE mgt_calc_bom_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
par_itm_cd varchar (40) NOT NULL,
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
calc_ctg_cd varchar (10) NOT NULL,
rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL
);


ALTER TABLE mgt_calc_bom_all
ADD CONSTRAINT mgt_calc_bom_all_pk UNIQUE(calc_no,calc_grp_cd,par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,oper_cd,oper_seq,chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,alt_grp_cd,expns_cd,wg_cd,co_cd);


CREATE INDEX mgt_calc_bom_all_ie01
ON mgt_calc_bom_all USING BTREE (par_itm_cd, par_itm_sub1, par_itm_sub2, par_itm_sub3, calc_no, calc_grp_cd, co_cd, bom_ptn, calc_ctg_cd);


CREATE INDEX mgt_calc_bom_all_ie02
ON mgt_calc_bom_all USING BTREE (chd_itm_cd, chd_itm_sub1, chd_itm_sub2, chd_itm_sub3, calc_no, calc_grp_cd, co_cd);


CREATE UNIQUE INDEX mgt_calc_bom_all_pk_ie ON mgt_calc_bom_all (calc_no,calc_grp_cd,par_itm_cd,par_itm_sub1,par_itm_sub2,par_itm_sub3,bom_ptn,COALESCE(oper_cd,''),COALESCE(oper_seq,0),chd_itm_cd,chd_itm_sub1,chd_itm_sub2,chd_itm_sub3,COALESCE(alt_grp_cd,''),COALESCE(expns_cd,''),wg_cd,co_cd);

