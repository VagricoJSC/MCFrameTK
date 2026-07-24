\encoding UTF-8

CREATE TABLE mst_purc_schd_all
(purc_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
arr_pr_no varchar (15) NOT NULL,
arr_schd_no varchar (15) NOT NULL,
purc_schd_dt timestamp(0)  NULL,
trd_unit_schd_qty numeric (21,8) NOT NULL,
trd_unit_cd varchar (5) NOT NULL,
base_unit_schd_qty numeric (21,8) NOT NULL,
base_unit_abort_qty numeric (21,8) NOT NULL,
base_unit_purc_qty numeric (21,8) NOT NULL,
base_unit_temp_purc_qty numeric (21,8) NOT NULL,
base_unit_accpt_dfct_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
non_purc_flg char (1) DEFAULT '0' NOT NULL,
cmpl_flg char (1) DEFAULT '0' NOT NULL,
abort_flg char (1) DEFAULT '0' NOT NULL,
purc_split_flg char (1) DEFAULT '0' NOT NULL,
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


ALTER TABLE mst_purc_schd_all
ADD CONSTRAINT mst_purc_schd_all_pk PRIMARY KEY(purc_schd_no,co_cd);


CREATE INDEX mst_purc_schd_all_ie01
ON mst_purc_schd_all USING BTREE (arr_pr_no,co_cd);


CREATE INDEX mst_purc_schd_all_ie02
ON mst_purc_schd_all USING BTREE (arr_schd_no,co_cd);


CREATE INDEX mst_purc_schd_all_ie03
ON mst_purc_schd_all USING BTREE (cmpl_flg,co_cd);


CREATE INDEX mst_purc_schd_all_ie04
ON mst_purc_schd_all USING BTREE (purc_schd_dt,co_cd);

