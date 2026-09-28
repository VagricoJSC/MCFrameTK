\encoding UTF-8

CREATE TABLE mam_item_ship_comp_all
(co_cd varchar (10) NOT NULL,
prod_itm_cd varchar (40) NOT NULL,
prod_itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
prod_itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
prod_itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
surv_line_qty varchar (2) DEFAULT '*' NOT NULL,
diameter varchar (4) DEFAULT '*' NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
qty numeric (21,8) NULL,
spec_cd varchar (20) NULL,
disp_seq numeric (5,0) NULL,
body_flg char (1) DEFAULT '0' NOT NULL,
comp_flg char (1) DEFAULT '0' NOT NULL,
ship_prnt_flg char (1) DEFAULT '0' NOT NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NOT NULL,
del_usr_id varchar (500) NULL,
del_usr_nm varchar (100) NULL,
del_ts timestamp(3)  NULL,
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


ALTER TABLE mam_item_ship_comp_all
ADD CONSTRAINT mam_item_ship_comp_all_pk PRIMARY KEY(co_cd,prod_itm_cd,prod_itm_sub1,prod_itm_sub2,prod_itm_sub3,surv_line_qty,diameter,itm_cd,itm_sub1,itm_sub2,itm_sub3);


CREATE INDEX mam_item_ship_comp_all_ie01
ON mam_item_ship_comp_all USING BTREE (prod_itm_cd,prod_itm_sub1,prod_itm_sub2,prod_itm_sub3);


CREATE INDEX mam_item_ship_comp_all_ie02
ON mam_item_ship_comp_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3);


CREATE INDEX mam_item_ship_comp_all_ie03
ON mam_item_ship_comp_all USING BTREE (memo1);


CREATE INDEX mam_item_ship_comp_all_ie04
ON mam_item_ship_comp_all USING BTREE (memo2);


CREATE INDEX mam_item_ship_comp_all_ie05
ON mam_item_ship_comp_all USING BTREE (memo3);

