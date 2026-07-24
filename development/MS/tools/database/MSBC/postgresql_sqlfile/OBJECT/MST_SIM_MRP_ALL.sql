\encoding UTF-8

CREATE TABLE mst_sim_mrp_all
(sim_mrp_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
sim_mrp_typ varchar (1) NOT NULL,
sim_usr_cd varchar (500) NULL,
dly_rqmt_flg char (1) DEFAULT '0' NOT NULL,
stk_flg char (1) DEFAULT '0' NOT NULL,
gr_flg char (1) DEFAULT '0' NOT NULL,
gi_flg char (1) DEFAULT '0' NOT NULL,
ship_flg char (1) DEFAULT '0' NOT NULL,
tree_lvl numeric (3) NULL,
mrp_proc_dt timestamp(0)  NULL,
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


ALTER TABLE mst_sim_mrp_all
ADD CONSTRAINT mst_sim_mrp_all_pk PRIMARY KEY(sim_mrp_no,co_cd);


CREATE INDEX mst_sim_mrp_all_ie01
ON mst_sim_mrp_all USING BTREE (wg_cd,co_cd);


CREATE INDEX mst_sim_mrp_all_ie02
ON mst_sim_mrp_all USING BTREE (sim_usr_cd,co_cd);


CREATE INDEX mst_sim_mrp_all_ie03
ON mst_sim_mrp_all USING BTREE (sim_mrp_typ,co_cd);

