\encoding UTF-8

CREATE TABLE mgt_usr_itm_all
(usr_cd varchar (500) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL
);


ALTER TABLE mgt_usr_itm_all
ADD CONSTRAINT mgt_usr_itm_all_pk PRIMARY KEY(usr_cd,calc_grp_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,co_cd);

