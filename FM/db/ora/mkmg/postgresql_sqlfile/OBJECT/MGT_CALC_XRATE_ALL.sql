\encoding UTF-8

CREATE TABLE mgt_calc_xrate_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
fr_cur_cd varchar (3) NOT NULL,
to_cur_cd varchar (3) NOT NULL,
xrate_cd varchar (2) NOT NULL,
co_cd varchar (10) NOT NULL,
xrate numeric (21,8) NOT NULL
);


ALTER TABLE mgt_calc_xrate_all
ADD CONSTRAINT mgt_calc_xrate_all_pk PRIMARY KEY(calc_no,calc_grp_cd,fr_cur_cd,to_cur_cd,xrate_cd,co_cd);

