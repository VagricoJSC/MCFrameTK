\encoding UTF-8

COMMENT ON TABLE mgt_alc_calc_dtl_all IS '配賦明細情報（配賦率計算結果） // Allocation details info. (Allocation rate calculation result)';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.alc_grp_id IS '配賦グループＩＤ // #MG.ALC_GRP_ID // Allocation group ID';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.str_ln_cd IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.wk_cost_cd IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.wk_rsn_cd IS '工数理由ＣＤ // #MA.WK_RSN_CD // Man-hour reason cd.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.alc_dpt_cd IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.act_sls_id IS '売上実績ＩＤ // #MG.ACT_SLS_ID // Sales result ID';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.act_sls_id_sub IS '売上実績ＩＤ枝番 // #MG.ACT_SLS_ID_SUB // Sales result ID branch No.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.gp_alc_cd IS '汎用配賦分類ＣＤ // #MA.GP_ALC_CD // General purpose allocation classification cd.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.alc_tgt_val IS '配賦対象 // #MG.ALC_TGT_VAL // Allocation target';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.alc_amt IS '配賦金額 // #MA.MONEY // Allocation amount';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.adj_amt IS '端数調整金額 // #MA.MONEY // Fraction adjustment amount';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.std_alc_amt IS '標準配賦金額 // #MA.MONEY // Standard allocation amount';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.coef_val IS '配賦係数値 // #MA.COEF_VAL // Allocation coefficient value';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.alc_org_tgt_val IS '配賦対象（係数無） // #MG.ALC_TGT_VAL // Allocation target (Without coefficient)';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.std_alc_tgt_val IS '標準配賦対象 // #MG.ALC_TGT_VAL // Standard allocation target';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_alc_calc_dtl_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

