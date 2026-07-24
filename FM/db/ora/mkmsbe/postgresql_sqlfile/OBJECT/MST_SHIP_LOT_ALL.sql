\encoding UTF-8

CREATE TABLE mst_ship_lot_all
(cst_cd varchar (20) NOT NULL,
dlv_cd varchar (20) DEFAULT '*' NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
base_dt timestamp(0)  NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
valid_dt timestamp(0)  NOT NULL,
ship_alloc_sts_no varchar (15) NULL,
ship_act_d_no varchar (15) NULL,
co_cd varchar (10) NOT NULL,
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



CREATE INDEX mst_ship_lot_all_ie01
ON mst_ship_lot_all USING BTREE (cst_cd, dlv_cd, itm_cd, itm_sub1, itm_sub2, itm_sub3, base_dt, co_cd);


CREATE INDEX mst_ship_lot_all_ie02
ON mst_ship_lot_all USING BTREE (ship_alloc_sts_no, co_cd);


CREATE INDEX mst_ship_lot_all_ie03
ON mst_ship_lot_all USING BTREE (ship_act_d_no, co_cd);

