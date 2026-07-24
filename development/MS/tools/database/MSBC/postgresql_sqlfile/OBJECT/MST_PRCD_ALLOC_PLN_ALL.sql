\encoding UTF-8

CREATE TABLE mst_prcd_alloc_pln_all
(co_cd varchar (10) NOT NULL,
rqmt_no varchar (15) NOT NULL,
itm_cd varchar (40) NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
ver_no varchar (10) NULL,
lot_no varchar (15) NULL,
sublot_no varchar (15) NULL,
loc_cd varchar (20) NULL,
io_schd_pr_no varchar (15) NULL,
schd_alloc_qty numeric (21,8) DEFAULT 0 NOT NULL,
gi_schd_dt timestamp(0)  NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
alloc_avl_dt timestamp(0)  NULL,
avl_qty numeric (21,8) DEFAULT 0 NOT NULL,
lmt_dt timestamp(0)  NULL,
wg_cd varchar (10) NOT NULL,
sim_mrp_no varchar (15) NULL,
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



CREATE INDEX mst_prcd_alloc_pln_all_ie01
ON mst_prcd_alloc_pln_all USING BTREE (rqmt_no,co_cd);


CREATE INDEX mst_prcd_alloc_pln_all_ie02
ON mst_prcd_alloc_pln_all USING BTREE (io_schd_pr_no,co_cd);

