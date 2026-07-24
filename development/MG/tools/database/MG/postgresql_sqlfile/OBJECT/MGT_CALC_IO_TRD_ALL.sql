\encoding UTF-8

CREATE TABLE mgt_calc_io_trd_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
act_io_id varchar (20) NOT NULL,
act_io_id_sub varchar (3) NOT NULL,
co_cd varchar (10) NOT NULL,
ym timestamp(0)  NOT NULL,
trd_grp varchar (50) NOT NULL,
wg_cd varchar (10) NOT NULL,
other_wg_cd varchar (10) NOT NULL,
cost_io_typ varchar (2) NOT NULL
);


ALTER TABLE mgt_calc_io_trd_all
ADD CONSTRAINT mgt_calc_io_trd_all_pk PRIMARY KEY(calc_no,calc_grp_cd,act_io_id,act_io_id_sub,co_cd);


CREATE INDEX mgt_calc_io_trd_all_ie01
ON mgt_calc_io_trd_all USING BTREE (trd_grp, ym, co_cd);

