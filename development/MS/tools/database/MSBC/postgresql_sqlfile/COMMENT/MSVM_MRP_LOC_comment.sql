\encoding UTF-8

COMMENT ON VIEW msvm_mrp_loc IS 'ＭＲＰ用場所マスタ // Location master for MRP';


COMMENT ON COLUMN msvm_mrp_loc.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN msvm_mrp_loc.loc_grp_cd IS '製造場所グループＣＤ // #MA.LOC_GRP_CD // Mfg. location group cd.';


COMMENT ON COLUMN msvm_mrp_loc.cal_cd IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN msvm_mrp_loc.site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN msvm_mrp_loc.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN msvm_mrp_loc.lg_cal_cd IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN msvm_mrp_loc.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN msvm_mrp_loc.sppl_cal_cd IS '発注先カレンダＣＤ // #MA.CAL_CD // Supplier calendar cd.';


COMMENT ON COLUMN msvm_mrp_loc.loc_mng_typ IS '管轄区分 // #MA.LOC_MNG_TYP // Controlling site type';


COMMENT ON COLUMN msvm_mrp_loc.alloc_lmt_flg IS '引当限定ＦＬＧ // #MA.FLG // Allocation limited flg.';


COMMENT ON COLUMN msvm_mrp_loc.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';

