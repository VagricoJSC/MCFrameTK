\encoding UTF-8

CREATE TABLE mgt_pln_purc_all
(pln_purc_key numeric (15) NOT NULL,
co_cd varchar (10) NOT NULL,
calc_ctg_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
mng_dpt_cd varchar (20) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
sppl_cd varchar (20) NOT NULL,
alc_dpt_cd varchar (20) NULL,
asst_typ varchar (1) NOT NULL,
unit_cd varchar (5) NOT NULL,
qty numeric (21,8) NOT NULL,
cur_cd varchar (3) NULL,
amt numeric (21,8) NULL,
rmrks varchar (100) NULL,
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


ALTER TABLE mgt_pln_purc_all
ADD CONSTRAINT mgt_pln_purc_all_pk PRIMARY KEY(pln_purc_key,co_cd);


CREATE INDEX mgt_pln_purc_all_ie01
ON mgt_pln_purc_all USING BTREE (ym, co_cd);


CREATE INDEX mgt_pln_purc_all_ie02
ON mgt_pln_purc_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);


CREATE INDEX mgt_pln_purc_all_ie03
ON mgt_pln_purc_all USING BTREE (lot_no, co_cd);


CREATE INDEX mgt_pln_purc_all_ie04
ON mgt_pln_purc_all USING BTREE (sublot_no, co_cd);


CREATE INDEX mgt_pln_purc_all_ie05
ON mgt_pln_purc_all USING BTREE (sno1, co_cd);


CREATE INDEX mgt_pln_purc_all_ie06
ON mgt_pln_purc_all USING BTREE (sno2, co_cd);


CREATE INDEX mgt_pln_purc_all_ie07
ON mgt_pln_purc_all USING BTREE (sno3, co_cd);


CREATE INDEX mgt_pln_purc_all_ie08
ON mgt_pln_purc_all USING BTREE (sno4, co_cd);


CREATE INDEX mgt_pln_purc_all_ie09
ON mgt_pln_purc_all USING BTREE (sppl_cd, co_cd);

