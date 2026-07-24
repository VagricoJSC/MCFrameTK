\encoding UTF-8

CREATE TABLE mst_stktk_all
(ctrl_tgt_dt timestamp(0)  NOT NULL,
loc_cd varchar (20) NOT NULL,
itm_cd varchar (40) DEFAULT '*' NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
stktk_typ varchar (1) NOT NULL,
co_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
stktk_sts_typ varchar (1) NOT NULL,
stktk_st_tm timestamp(0)  NULL,
diff_upd_tm timestamp(0)  NULL,
act_dpt_cd varchar (20) NULL,
act_usr_cd varchar (500) NULL,
io_ctrl_flg char (1) DEFAULT '0' NOT NULL,
act_qty_keep_flg char (1) DEFAULT '0' NOT NULL,
stktk_rpt_prnt_flg char (1) DEFAULT '0' NOT NULL,
diff_rpt_prnt_flg char (1) DEFAULT '0' NOT NULL,
stktk_rpt_rmrks varchar (100) NULL,
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


ALTER TABLE mst_stktk_all
ADD CONSTRAINT mst_stktk_all_pk PRIMARY KEY(ctrl_tgt_dt,loc_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,stktk_typ,co_cd);


CREATE INDEX mst_stktk_all_ie01
ON mst_stktk_all USING BTREE (itm_cd, itm_sub1, itm_sub2, itm_sub3, co_cd);

