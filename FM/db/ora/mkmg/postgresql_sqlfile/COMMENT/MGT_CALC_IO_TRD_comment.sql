\encoding UTF-8

COMMENT ON VIEW mgt_calc_io_trd IS '計算対象入出庫振替先情報 // (Calculation) GR/GI transfer destination info.';


COMMENT ON COLUMN mgt_calc_io_trd.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_calc_io_trd.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_calc_io_trd.act_io_id IS '入出庫実績ＩＤ // #MG.ACT_IO_ID // GR/GI result ID';


COMMENT ON COLUMN mgt_calc_io_trd.act_io_id_sub IS '入出庫実績ＩＤ枝番 // #MG.ACT_IO_ID_SUB // GR/GI result ID branch No.';


COMMENT ON COLUMN mgt_calc_io_trd.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_calc_io_trd.trd_grp IS '振替グループ // #MA.TRD_GRP // Transfer group';


COMMENT ON COLUMN mgt_calc_io_trd.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_calc_io_trd.other_wg_cd IS '相手ワーキンググループＣＤ // #MA.WG_CD // Counterpart WG cd.';


COMMENT ON COLUMN mgt_calc_io_trd.cost_io_typ IS '原価入出庫区分 // #MA.COST_IO_TYP // Cost GR/GI type';

