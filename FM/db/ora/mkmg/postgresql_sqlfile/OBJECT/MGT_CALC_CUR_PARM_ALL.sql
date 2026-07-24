\encoding UTF-8

CREATE TABLE mgt_calc_cur_parm_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
cur_cd varchar (3) NOT NULL,
co_cd varchar (10) NOT NULL,
amt_rnd_typ varchar (1) NOT NULL,
amt_dec_place numeric (2,0) NOT NULL,
ave_rnd_typ varchar (1) NOT NULL,
ave_dec_place numeric (2,0) NOT NULL
);


ALTER TABLE mgt_calc_cur_parm_all
ADD CONSTRAINT mgt_calc_cur_parm_all_pk PRIMARY KEY(calc_no,calc_grp_cd,cur_cd,co_cd);

