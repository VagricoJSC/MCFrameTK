\encoding UTF-8

CREATE TABLE mam_lg_grp_all
(lg_grp_cd varchar (10) NOT NULL,
lg_grp_nm varchar (40) NOT NULL,
loc_flg char (1) DEFAULT '0' NOT NULL,
wg_cd varchar (10) NULL,
ship_slip_flg char (1) DEFAULT '0' NOT NULL,
pick_list_flg char (1) DEFAULT '0' NOT NULL,
ship_inst_flg char (1) DEFAULT '0' NOT NULL,
ship_slip_act_flg char (1) DEFAULT '0' NOT NULL,
cal_cd varchar (10) NULL,
site_co_cd varchar (10) NULL,
gi_minus_stk_chk_flg char (1) DEFAULT '0' NOT NULL,
ship_loc_prio_flg char (1) DEFAULT '0' NOT NULL,
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
upd_srv_req_no varchar (50) NULL,
co_cd varchar (10) NOT NULL
);


ALTER TABLE mam_lg_grp_all
ADD CONSTRAINT mam_lg_grp_all_pk PRIMARY KEY(lg_grp_cd,co_cd);


CREATE INDEX mam_lg_grp_all_ie01
ON mam_lg_grp_all USING BTREE (lg_grp_nm);


CREATE INDEX mam_lg_grp_all_ie02
ON mam_lg_grp_all USING BTREE (wg_cd);

