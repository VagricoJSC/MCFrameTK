\encoding UTF-8

CREATE TABLE mst_arr_map_all
(arr_act_no varchar (15) NOT NULL,
ship_act_d_no varchar (15) NULL,
iv_ship_act_d_no varchar (15) NULL,
co_cd varchar (10) NOT NULL,
arr_qty numeric (21,8) NOT NULL,
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


ALTER TABLE mst_arr_map_all
ADD CONSTRAINT mst_arr_map_all_pk UNIQUE(arr_act_no,ship_act_d_no,iv_ship_act_d_no,co_cd);


CREATE UNIQUE INDEX mst_arr_map_all_pk_ie ON mst_arr_map_all (arr_act_no,COALESCE(ship_act_d_no,''),COALESCE(iv_ship_act_d_no,''),co_cd);

