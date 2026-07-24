\encoding UTF-8

CREATE TABLE mst_iv_map_all
(iv_d_no varchar (15) NOT NULL,
ship_schd_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
trd_unit_qty numeric (21,8) NOT NULL,
base_unit_qty numeric (21,8) NULL,
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


ALTER TABLE mst_iv_map_all
ADD CONSTRAINT mst_iv_map_all_pk PRIMARY KEY(iv_d_no,ship_schd_no,co_cd);


CREATE INDEX mst_iv_map_all_ie01
ON mst_iv_map_all USING BTREE (ship_schd_no, co_cd);

