\encoding UTF-8

CREATE TABLE mst_mrp_cntr_all
(wg_cd varchar (10) NOT NULL,
mrp_cntr_typ varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
prefix varchar (3) NULL,
cntr numeric (15,0) NOT NULL,
max_val numeric (15,0) NOT NULL,
min_val numeric (15,0) NOT NULL,
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


ALTER TABLE mst_mrp_cntr_all
ADD CONSTRAINT mst_mrp_cntr_all_pk PRIMARY KEY(wg_cd,mrp_cntr_typ,co_cd);


CREATE INDEX mst_mrp_cntr_all_ie01
ON mst_mrp_cntr_all USING BTREE (prefix,co_cd);

