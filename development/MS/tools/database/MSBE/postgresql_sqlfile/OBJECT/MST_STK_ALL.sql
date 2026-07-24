\encoding UTF-8

CREATE TABLE mst_stk_all
(itm_cd varchar (40) NOT NULL,
itm_sub1 varchar (5) DEFAULT '*' NOT NULL,
itm_sub2 varchar (5) DEFAULT '*' NOT NULL,
itm_sub3 varchar (5) DEFAULT '*' NOT NULL,
loc_cd varchar (20) NOT NULL,
str_ln_cd varchar (10) DEFAULT '*' NOT NULL,
stk_arrv_bp_cd varchar (20) DEFAULT '*' NOT NULL,
lot_no varchar (15) DEFAULT '*' NOT NULL,
sublot_no varchar (15) DEFAULT '*' NOT NULL,
sno1 varchar (15) DEFAULT '*' NOT NULL,
sno2 varchar (15) DEFAULT '*' NOT NULL,
sno3 varchar (15) DEFAULT '*' NOT NULL,
sno4 varchar (15) DEFAULT '*' NOT NULL,
fix_no_typ varchar (1) NOT NULL,
fix_no varchar (15) DEFAULT '*' NOT NULL,
pack_unit_cd varchar (5) NOT NULL,
gd_cd varchar (2) NOT NULL,
in_xfr_typ varchar (1) NOT NULL,
quality_typ varchar (1) NOT NULL,
asst_typ varchar (1) NOT NULL,
stk_insp_typ varchar (1) NOT NULL,
stk_id_typ varchar (1) NOT NULL,
stk_bp_cd varchar (20) DEFAULT '*' NOT NULL,
co_cd varchar (10) NOT NULL,
pack_unit_qty numeric (21,8) NOT NULL,
base_unit_qty numeric (21,8) NOT NULL,
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


ALTER TABLE mst_stk_all
ADD CONSTRAINT mst_stk_all_pk PRIMARY KEY(itm_cd,itm_sub1,itm_sub2,itm_sub3,loc_cd,str_ln_cd,stk_arrv_bp_cd,lot_no,sublot_no,sno1,sno2,sno3,sno4,fix_no_typ,fix_no,pack_unit_cd,gd_cd,in_xfr_typ,quality_typ,asst_typ,stk_insp_typ,stk_id_typ,stk_bp_cd,co_cd);


CREATE INDEX mst_stk_all_ie01
ON mst_stk_all USING BTREE (loc_cd, co_cd);


CREATE INDEX mst_stk_all_ie02
ON mst_stk_all USING BTREE (lot_no, co_cd);


CREATE INDEX mst_stk_all_ie03
ON mst_stk_all USING BTREE (fix_no, fix_no_typ, co_cd);

