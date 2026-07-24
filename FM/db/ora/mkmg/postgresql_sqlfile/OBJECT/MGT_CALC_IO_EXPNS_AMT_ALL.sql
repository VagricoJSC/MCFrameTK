\encoding UTF-8

CREATE TABLE mgt_calc_io_expns_amt_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
itm_ext varchar (100) DEFAULT '*' NOT NULL,
wg_cd varchar (10) NOT NULL,
act_io_id varchar (20) NOT NULL,
act_io_id_sub varchar (3) NOT NULL,
amt_add_typ varchar (1) NOT NULL,
expns_cd varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
amt numeric (21,8) NOT NULL
);


ALTER TABLE mgt_calc_io_expns_amt_all
ADD CONSTRAINT mgt_calc_io_expns_amt_all_pk PRIMARY KEY(calc_no,calc_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,itm_ext,wg_cd,act_io_id,act_io_id_sub,amt_add_typ,expns_cd,co_cd);

