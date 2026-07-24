\encoding UTF-8

CREATE TABLE mst_mrkt_judg_d_all
(mrkt_judg_d_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
mrkt_judg_no varchar (15) NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
base_unit_cd varchar (5) NOT NULL,
mrkt_judg_src_typ varchar (1) NOT NULL,
mrkt_judg_src_no varchar (15) NULL,
vld_dt timestamp(0)  NULL,
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


ALTER TABLE mst_mrkt_judg_d_all
ADD CONSTRAINT mst_mrkt_judg_d_all_pk PRIMARY KEY(mrkt_judg_d_no,co_cd);


CREATE INDEX mst_mrkt_judg_d_all_ie01
ON mst_mrkt_judg_d_all USING BTREE (mrkt_judg_no,mrkt_judg_src_typ,co_cd);


CREATE INDEX mst_mrkt_judg_d_all_ie02
ON mst_mrkt_judg_d_all USING BTREE (mrkt_judg_src_no,mrkt_judg_src_typ,co_cd);


CREATE INDEX mst_mrkt_judg_d_all_ie03
ON mst_mrkt_judg_d_all USING BTREE (itm_cd,itm_sub1,itm_sub2,itm_sub3,lot_no,co_cd);


CREATE INDEX mst_mrkt_judg_d_all_ie04
ON mst_mrkt_judg_d_all USING BTREE (lot_no,co_cd);

