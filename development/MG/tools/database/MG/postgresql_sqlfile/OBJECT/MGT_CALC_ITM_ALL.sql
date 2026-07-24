\encoding UTF-8

CREATE TABLE mgt_calc_itm_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_ext varchar (100) DEFAULT '*' NOT NULL,
wg_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
calc_ptn_cd varchar (10) NOT NULL,
std_qty numeric (21,8) NOT NULL,
calc_ctg_cd varchar (10) NOT NULL,
rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL
);


ALTER TABLE mgt_calc_itm_all
ADD CONSTRAINT mgt_calc_itm_all_pk PRIMARY KEY(calc_no,calc_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_ext,wg_cd,co_cd);


CREATE INDEX mgt_calc_itm_all_ie01
ON mgt_calc_itm_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);

