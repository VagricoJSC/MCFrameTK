\encoding UTF-8

CREATE TABLE mst_spln_sum_vers_all
(dpt_cd varchar (20) NOT NULL,
cst_cd varchar (20) DEFAULT '*' NOT NULL,
wrk_no varchar (15) DEFAULT '*' NOT NULL,
ym timestamp(0)  NOT NULL,
spln_vers varchar (20) NOT NULL,
co_cd varchar (10) NOT NULL,
edited_flg char (1) DEFAULT '0' NOT NULL,
adopted_flg char (1) DEFAULT '0' NOT NULL,
locked_flg char (1) DEFAULT '0' NOT NULL,
ref_vers varchar (20) NULL,
usr_cd varchar (500) NULL,
intr_rmrks varchar (100) NULL,
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


ALTER TABLE mst_spln_sum_vers_all
ADD CONSTRAINT mst_spln_sum_vers_all_pk PRIMARY KEY(dpt_cd,cst_cd,wrk_no,ym,spln_vers,co_cd);


CREATE INDEX mst_spln_sum_vers_all_ie01
ON mst_spln_sum_vers_all USING BTREE (spln_vers,dpt_cd,co_cd);

