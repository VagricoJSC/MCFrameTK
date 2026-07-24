\encoding UTF-8

CREATE TABLE mst_ship_act_all
(ship_act_no varchar (15) NOT NULL,
co_cd varchar (10) NOT NULL,
ship_act_rev numeric (4,0) NOT NULL,
ship_inst_no varchar (15) NULL,
ac_dt timestamp(0)  NOT NULL,
ship_tm timestamp(0)  NOT NULL,
dlv_tm timestamp(0)  NOT NULL,
rqst_dpt_cd varchar (20) NULL,
rqst_usr_cd varchar (500) NULL,
ship_fr_lg_grp_cd varchar (10) NOT NULL,
wg_cd varchar (10) NOT NULL,
ship_term_cd varchar (5) NULL,
ship_dpt_cd varchar (20) NULL,
ship_usr_cd varchar (500) NULL,
ship_to_lg_grp_cd varchar (10) NULL,
cst_cd varchar (20) NULL,
ship_to_id_typ varchar (1) NOT NULL,
ship_to_id_cd varchar (20) NOT NULL,
ship_to_id_nm varchar (100) NULL,
ship_to_zip_cd varchar (10) NULL,
ship_to_addr1 varchar (250) NULL,
ship_to_addr2 varchar (250) NULL,
ship_to_addr3 varchar (250) NULL,
ship_to_addr4 varchar (250) NULL,
ship_to_cntct_dpt varchar (100) NULL,
ship_to_cntct_psn varchar (100) NULL,
ship_to_tel varchar (30) NULL,
ship_to_fax varchar (30) NULL,
ship_to_sundry_flg char (1) DEFAULT '0' NOT NULL,
via_dlv_typ varchar (1) NULL,
iv_no varchar (15) NULL,
uplnd_flg char (1) DEFAULT '0' NOT NULL,
can_flg char (1) DEFAULT '0' NOT NULL,
ship_adv_prnt_flg char (1) DEFAULT '0' NOT NULL,
ship_adv_prnt_tm timestamp(0)  NULL,
dlv_prnt_flg char (1) DEFAULT '0' NOT NULL,
dlv_prnt_tm timestamp(0)  NULL,
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


ALTER TABLE mst_ship_act_all
ADD CONSTRAINT mst_ship_act_all_pk PRIMARY KEY(ship_act_no,co_cd);


CREATE INDEX mst_ship_act_all_ie01
ON mst_ship_act_all USING BTREE (ship_inst_no, co_cd);


CREATE INDEX mst_ship_act_all_ie02
ON mst_ship_act_all USING BTREE (ac_dt, co_cd);


CREATE INDEX mst_ship_act_all_ie03
ON mst_ship_act_all USING BTREE (cst_cd, co_cd);


CREATE INDEX mst_ship_act_all_ie04
ON mst_ship_act_all USING BTREE (ship_to_id_cd, co_cd);


CREATE INDEX mst_ship_act_all_ie05
ON mst_ship_act_all USING BTREE (iv_no, co_cd);

