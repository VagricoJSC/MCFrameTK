\encoding UTF-8

CREATE TABLE mst_plnt_aprv_d_all
(plnt_aprv_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
plnt_aprv_no varchar (15) NOT NULL,
insp_typ varchar (1) NULL,
insp_no varchar (15) NULL,
src_no1 varchar (15) NULL,
src_no2 varchar (15) NULL,
src_no3 varchar (15) NULL,
src_no4 varchar (15) NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
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


ALTER TABLE mst_plnt_aprv_d_all
ADD CONSTRAINT mst_plnt_aprv_d_all_pk PRIMARY KEY(plnt_aprv_d_no,co_cd);


CREATE INDEX mst_plnt_aprv_d_all_ie01
ON mst_plnt_aprv_d_all USING BTREE (insp_no,co_cd);


CREATE INDEX mst_plnt_aprv_d_all_ie02
ON mst_plnt_aprv_d_all USING BTREE (src_no1,co_cd);


CREATE INDEX mst_plnt_aprv_d_all_ie03
ON mst_plnt_aprv_d_all USING BTREE (plnt_aprv_no,insp_typ,src_no4,co_cd);

