\encoding UTF-8

CREATE TABLE mgt_calc_ptn_all
(calc_no varchar (15) NOT NULL,
calc_grp_cd varchar (10) NOT NULL,
calc_ptn_cd varchar (10) NOT NULL,
co_cd varchar (10) NOT NULL,
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
amt_rnd_typ varchar (1) NULL,
amt_dec_place numeric (2,0) NULL,
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
exp_alloc_typ varchar (1) NULL
);


ALTER TABLE mgt_calc_ptn_all
ADD CONSTRAINT mgt_calc_ptn_all_pk PRIMARY KEY(calc_no,calc_grp_cd,calc_ptn_cd,co_cd);

