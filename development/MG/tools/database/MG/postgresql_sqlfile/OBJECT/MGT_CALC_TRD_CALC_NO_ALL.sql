\encoding UTF-8

CREATE TABLE mgt_calc_trd_calc_no_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
trd_calc_no varchar (15) NOT NULL,
trd_calc_grp_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL
);


ALTER TABLE mgt_calc_trd_calc_no_all
ADD CONSTRAINT mgt_calc_trd_calc_no_all_pk PRIMARY KEY(calc_no,calc_grp_cd,ym,trd_calc_no,trd_calc_grp_cd,co_cd);


CREATE INDEX mgt_calc_trd_calc_no_all_ie01
ON mgt_calc_trd_calc_no_all USING BTREE (ym, co_cd);


CREATE INDEX mgt_calc_trd_calc_no_all_ie02
ON mgt_calc_trd_calc_no_all USING BTREE (trd_calc_no, trd_calc_grp_cd, co_cd);

