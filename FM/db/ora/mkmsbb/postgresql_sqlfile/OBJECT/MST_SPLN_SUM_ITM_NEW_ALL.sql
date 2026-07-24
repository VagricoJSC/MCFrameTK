\encoding UTF-8

CREATE TABLE mst_spln_sum_itm_new_all
(dpt_cd varchar (20) NOT NULL,
cst_cd varchar (20) DEFAULT '*' NOT NULL,
wrk_no varchar (15) DEFAULT '*' NOT NULL,
spln_itm_cd varchar (40) DEFAULT '*' NOT NULL,
itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
cur_cd varchar (3) NOT NULL,
spln_ym timestamp(0)  NOT NULL,
co_cd varchar (10) NOT NULL,
spln_qty numeric (21,8) NOT NULL,
spln_amt numeric (21,8) NOT NULL,
ym timestamp(0)  NOT NULL,
spln_vers varchar (20) NOT NULL,
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


ALTER TABLE mst_spln_sum_itm_new_all
ADD CONSTRAINT mst_spln_sum_itm_new_all_pk PRIMARY KEY(dpt_cd,cst_cd,wrk_no,spln_itm_cd,itm_cd,itm_sub1,itm_sub2,itm_sub3,cur_cd,spln_ym,co_cd);


CREATE INDEX mst_spln_sum_itm_new_all_ie01
ON mst_spln_sum_itm_new_all USING BTREE (spln_ym,dpt_cd,co_cd);

