\encoding UTF-8

CREATE TABLE mgt_calc_itm_sls_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
dpt_cd varchar (20) DEFAULT '*' NOT NULL,
cst_cd varchar (20) DEFAULT '*' NOT NULL,
dlv_cd varchar (20) DEFAULT '*' NOT NULL,
dest_cd1 varchar (20) DEFAULT '*' NOT NULL,
dest_cd2 varchar (20) DEFAULT '*' NOT NULL,
dest_cd3 varchar (20) DEFAULT '*' NOT NULL,
wg_cd varchar (10) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
base_qty numeric (21,8) NOT NULL,
cur_cd varchar (3) NOT NULL,
upri numeric (21,8) NOT NULL,
base_cur_upri numeric (21,8) NOT NULL,
prio numeric (3,0) NULL,
alc_val1 numeric (21,8) NULL,
alc_val2 numeric (21,8) NULL,
alc_val3 numeric (21,8) NULL,
alc_val4 numeric (21,8) NULL,
alc_val5 numeric (21,8) NULL,
calc_ctg_cd varchar (10) NOT NULL,
rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL
);


ALTER TABLE mgt_calc_itm_sls_all
ADD CONSTRAINT mgt_calc_itm_sls_all_pk PRIMARY KEY(calc_no,calc_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,dpt_cd,cst_cd,dlv_cd,dest_cd1,dest_cd2,dest_cd3,wg_cd,co_cd);


CREATE INDEX mgt_calc_itm_sls_all_ie01
ON mgt_calc_itm_sls_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, calc_no, calc_grp_cd, co_cd, calc_ctg_cd);

