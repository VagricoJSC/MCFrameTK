\encoding UTF-8

CREATE TABLE mam_grp_ptn_all_r
(
hst_id numeric(24,0) DEFAULT 0 NOT NULL,
hst_type varchar(2) NOT NULL,
calc_ptn_cd varchar (10) NULL,
calc_grp_cd varchar (10) NULL,
co_cd varchar (10) NULL,
mfg_purc_typ varchar (1) NULL,
eval_typ varchar (1) NULL,
dpt_typ varchar (1) NULL,
lot_typ varchar (1) NULL,
sublot_typ varchar (1) NULL,
sno1_typ varchar (1) NULL,
sno2_typ varchar (1) NULL,
sno3_typ varchar (1) NULL,
sno4_typ varchar (1) NULL,
lot_exp_typ varchar (1) NULL,
sublot_exp_typ varchar (1) NULL,
sno1_exp_typ varchar (1) NULL,
sno2_exp_typ varchar (1) NULL,
sno3_exp_typ varchar (1) NULL,
sno4_exp_typ varchar (1) NULL,
std_rnd_typ varchar (1) NULL,
std_dec_place numeric (2,0) NULL,
ave_rnd_typ varchar (1) NULL,
ave_dec_place numeric (2,0) NULL,
adj_typ varchar (1) NULL,
wip_typ varchar (1) NULL,
bd_agg_typ varchar (1) NULL,
mrgn_expns_cd varchar (20) NULL,
purc_expns_cd varchar (20) NULL,
out_expns_cd varchar (20) NULL,
inpt_expns_cd varchar (20) NULL,
ss_expns_cd varchar (20) NULL,
prov_expns_cd varchar (20) NULL,
exp_alloc_typ varchar (1) NULL,
memo1 varchar (100) NULL,
memo2 varchar (100) NULL,
memo3 varchar (100) NULL,
del_flg char (1) DEFAULT '0' NULL,
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



ALTER TABLE mam_grp_ptn_all_r ADD CONSTRAINT mam_grp_ptn_all_r_pk PRIMARY KEY(hst_id);


INSERT INTO fcm_history_table (history_table_name, table_name, trigger_name)
VALUES ('mam_grp_ptn_all_r', 'mam_grp_ptn_all', 'mam_grp_ptn_all_tr_r');

