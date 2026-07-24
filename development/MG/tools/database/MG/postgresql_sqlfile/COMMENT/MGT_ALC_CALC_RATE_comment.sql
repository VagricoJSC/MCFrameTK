\encoding UTF-8

COMMENT ON VIEW mgt_alc_calc_rate IS '配賦率情報（配賦率計算結果） // Allocation rate info. (Allocation rate calculation result)';


COMMENT ON COLUMN mgt_alc_calc_rate.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_alc_calc_rate.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_alc_calc_rate.alc_grp_id IS '配賦グループＩＤ // #MG.ALC_GRP_ID // Allocation group ID';


COMMENT ON COLUMN mgt_alc_calc_rate.inpt_alc_typ IS '入力費用区分 // #MG.INPT_ALC_TYP // Input expense type';


COMMENT ON COLUMN mgt_alc_calc_rate.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_alc_calc_rate.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_alc_calc_rate.alc_ac_cd IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN mgt_alc_calc_rate.dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mgt_alc_calc_rate.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_alc_calc_rate.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_alc_calc_rate.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgt_alc_calc_rate.ctg_cd IS '品群ＣＤ // #MA.COST_CTG_CD // Item category cd.';


COMMENT ON COLUMN mgt_alc_calc_rate.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_alc_calc_rate.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_alc_calc_rate.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_alc_calc_rate.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_alc_calc_rate.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_alc_calc_rate.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_alc_calc_rate.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_alc_calc_rate.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_alc_calc_rate.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_alc_calc_rate.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_alc_calc_rate.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgt_alc_calc_rate.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mgt_alc_calc_rate.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mgt_alc_calc_rate.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mgt_alc_calc_rate.amt IS '入力金額 // #MA.MONEY // Input amount';


COMMENT ON COLUMN mgt_alc_calc_rate.alc_tgt_val IS '配賦対象 // #MG.ALC_TGT_VAL // Allocation target';


COMMENT ON COLUMN mgt_alc_calc_rate.alc_rate IS '配賦率 // #MA.ALC_RATE // Allocation rate';


COMMENT ON COLUMN mgt_alc_calc_rate.alc_amt IS '配賦金額 // #MA.MONEY // Allocation amount';


COMMENT ON COLUMN mgt_alc_calc_rate.trd_alc_tgt_val IS '振替配賦対象 // #MG.ALC_TGT_VAL // Transfer allocation target';


COMMENT ON COLUMN mgt_alc_calc_rate.trd_alc_amt IS '振替金額 // #MA.MONEY // Transfer amount';


COMMENT ON COLUMN mgt_alc_calc_rate.std_alc_rate IS '標準配賦率 // #MA.ALC_RATE // Standard allocation rate';


COMMENT ON COLUMN mgt_alc_calc_rate.std_alc_amt IS '標準配賦金額 // #MA.MONEY // Standard allocation amount';


COMMENT ON COLUMN mgt_alc_calc_rate.std_alc_tgt_val IS '標準配賦対象 // #MG.ALC_TGT_VAL // Standard allocation target';


COMMENT ON COLUMN mgt_alc_calc_rate.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgt_alc_calc_rate.alc_ptn_cd IS '配賦パタンＣＤ // #MA.ALC_PTN_CD // Allocation pattern cd.';


COMMENT ON COLUMN mgt_alc_calc_rate.diff_calc_typ IS '差異計算区分 // #MA.DIFF_CALC_TYP // Variance calculation type';


COMMENT ON COLUMN mgt_alc_calc_rate.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_alc_calc_rate.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_alc_calc_rate.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_alc_calc_rate.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_alc_calc_rate.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_alc_calc_rate.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_alc_calc_rate.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_alc_calc_rate.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_alc_calc_rate.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_alc_calc_rate.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

