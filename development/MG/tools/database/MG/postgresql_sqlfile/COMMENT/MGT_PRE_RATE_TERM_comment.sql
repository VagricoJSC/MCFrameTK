\encoding UTF-8

COMMENT ON VIEW mgt_pre_rate_term IS '一次配賦期間比率 // Departmental alloc. fixed ratio';


COMMENT ON COLUMN mgt_pre_rate_term.pre_alc_rate_cd IS '一次配賦基準ＣＤ // #MA.PRE_ALC_RATE_CD // Departmental alloc. basis cd.';


COMMENT ON COLUMN mgt_pre_rate_term.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mgt_pre_rate_term.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_pre_rate_term.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_pre_rate_term.dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mgt_pre_rate_term.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_pre_rate_term.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_pre_rate_term.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgt_pre_rate_term.ctg_cd IS '品群ＣＤ // #MA.COST_CTG_CD // Item category cd.';


COMMENT ON COLUMN mgt_pre_rate_term.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_pre_rate_term.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_pre_rate_term.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_pre_rate_term.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_pre_rate_term.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_pre_rate_term.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_pre_rate_term.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_pre_rate_term.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_pre_rate_term.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_pre_rate_term.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_pre_rate_term.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgt_pre_rate_term.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mgt_pre_rate_term.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mgt_pre_rate_term.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mgt_pre_rate_term.alc_ac_cd IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN mgt_pre_rate_term.trd_wg_cd IS '振替ワーキンググループＣＤ // #MA.WG_CD // Transfer WG cd.';


COMMENT ON COLUMN mgt_pre_rate_term.pre_alc_rate IS '比率 // #MG.PRE_ALC_RATE // Ratio';


COMMENT ON COLUMN mgt_pre_rate_term.adj_flg IS '差額調整ＦＬＧ // #MA.FLG // Difference adjustment flg.';


COMMENT ON COLUMN mgt_pre_rate_term.rmrks IS '備考 // #MG.PRE_RATE_TERM_RMRKS // Remarks';


COMMENT ON COLUMN mgt_pre_rate_term.sub_char1 IS '予備１ // #MG.PRE_RATE_TERM_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_pre_rate_term.sub_char2 IS '予備２ // #MG.PRE_RATE_TERM_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_pre_rate_term.sub_char3 IS '予備３ // #MG.PRE_RATE_TERM_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_pre_rate_term.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_pre_rate_term.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_pre_rate_term.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_pre_rate_term.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_pre_rate_term.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_pre_rate_term.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_pre_rate_term.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_pre_rate_term.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_pre_rate_term.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_pre_rate_term.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

