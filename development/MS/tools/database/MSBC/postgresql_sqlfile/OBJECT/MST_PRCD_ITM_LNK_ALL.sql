\encoding UTF-8

CREATE TABLE mst_prcd_itm_lnk_all
(itm_ord_no varchar (15) NOT NULL,
par_itm_ord_no varchar (15) NOT NULL,
par_oper_ord_no varchar (15) NULL,
sim_mrp_no varchar (15) NULL,
oper_ptn varchar (40) NOT NULL,
oper_cd varchar (10) NOT NULL,
oper_seq numeric (9,0) NOT NULL,
co_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
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


ALTER TABLE mst_prcd_itm_lnk_all
ADD CONSTRAINT mst_prcd_itm_lnk_all_pk UNIQUE(itm_ord_no,par_itm_ord_no,par_oper_ord_no,sim_mrp_no,oper_ptn,oper_cd,oper_seq,co_cd);


CREATE UNIQUE INDEX mst_prcd_itm_lnk_all_pk_ie ON mst_prcd_itm_lnk_all (itm_ord_no,par_itm_ord_no,COALESCE(par_oper_ord_no,''),COALESCE(sim_mrp_no,''),oper_ptn,oper_cd,oper_seq,co_cd);

