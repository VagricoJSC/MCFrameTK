\encoding UTF-8

COMMENT ON TABLE mgt_itm_dtl_all IS '原価品目詳細情報 // Cost item details info.';


COMMENT ON COLUMN mgt_itm_dtl_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_itm_dtl_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_itm_dtl_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_itm_dtl_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_itm_dtl_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_itm_dtl_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mgt_itm_dtl_all.rqst_wg_cd IS '依頼先ワーキンググループＣＤ // #MA.WG_CD // Requested WG cd.';


COMMENT ON COLUMN mgt_itm_dtl_all.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mgt_itm_dtl_all.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_itm_dtl_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_itm_dtl_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_itm_dtl_all.cost_ratio IS '原価比率 // #MA.COST_RATIO // Cost ratio';


COMMENT ON COLUMN mgt_itm_dtl_all.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mgt_itm_dtl_all.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mgt_itm_dtl_all.min_lot_qty IS '最小ロット数量 // #MA.QTY // Min. lot qty.';


COMMENT ON COLUMN mgt_itm_dtl_all.batch_lot_qty IS '刻みロット数量 // #MA.QTY // Increments lot qty.';


COMMENT ON COLUMN mgt_itm_dtl_all.fxd_lot_qty IS '固定基準ロット数量 // #MA.QTY // Constant reference lot qty.';


COMMENT ON COLUMN mgt_itm_dtl_all.fxd_yield_qty IS '固定歩留数量 // #MA.QTY // Constant yield qty.';


COMMENT ON COLUMN mgt_itm_dtl_all.nmr_qty IS '歩留製造数量 // #MA.QTY // Yield mfg. qty.';


COMMENT ON COLUMN mgt_itm_dtl_all.dnm_qty IS '理論製造数量 // #MA.QTY // Ideal mfg. qty.';


COMMENT ON COLUMN mgt_itm_dtl_all.alc_dpt_cd IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN mgt_itm_dtl_all.exp_dpt_cd IS '展開部門ＣＤ // #MA.COST_DPT_CD // Exploded dept. cd.';


COMMENT ON COLUMN mgt_itm_dtl_all.exp_prio IS '展開優先順位 // #MG.EXP_PRIO // Explosion priority';


COMMENT ON COLUMN mgt_itm_dtl_all.max_qty IS '月次最大数量 // #MA.QTY // Monthly max. qty.';


COMMENT ON COLUMN mgt_itm_dtl_all.alc_val1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN mgt_itm_dtl_all.alc_val2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN mgt_itm_dtl_all.alc_val3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN mgt_itm_dtl_all.alc_val4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN mgt_itm_dtl_all.alc_val5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';


COMMENT ON COLUMN mgt_itm_dtl_all.rmrks IS '備考 // #MG.ITM_DTL_RMRKS // Remarks';


COMMENT ON COLUMN mgt_itm_dtl_all.sub_char1 IS '予備１ // #MG.ITM_DTL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_itm_dtl_all.sub_char2 IS '予備２ // #MG.ITM_DTL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_itm_dtl_all.sub_char3 IS '予備３ // #MG.ITM_DTL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_itm_dtl_all.non_calc_flg IS '計算対象外ＦＬＧ // #MA.FLG // Not to calculate flg.';


COMMENT ON COLUMN mgt_itm_dtl_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_itm_dtl_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_itm_dtl_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_itm_dtl_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_itm_dtl_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_itm_dtl_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_itm_dtl_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_itm_dtl_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_itm_dtl_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_itm_dtl_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

