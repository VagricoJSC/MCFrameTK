\encoding UTF-8

CREATE TABLE mgt_calc_parm_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
parm_key varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
parm_val varchar (200) NOT NULL,
rmrks varchar (100) NULL,
sub_char1 varchar (20) NULL,
sub_char2 varchar (20) NULL,
sub_char3 varchar (20) NULL
);


ALTER TABLE mgt_calc_parm_all
ADD CONSTRAINT mgt_calc_parm_all_pk PRIMARY KEY(calc_no,calc_grp_cd,parm_key,co_cd);

