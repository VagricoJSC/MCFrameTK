
COMMENT ON TABLE MGW_IMP_ITM_DTL_ALL IS '原価品目詳細取込対象ワーク // Work for cost item details import';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.RQST_WG_CD IS '依頼先ワーキンググループＣＤ // #MA.WG_CD // Requested WG cd.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.TERM IS '期 // #MA.YM // Term';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.CALC_CTG_CD IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.COST_RATIO IS '原価比率 // #MA.COST_RATIO // Cost ratio';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.MIN_LOT_QTY IS '最小ロット数量 // #MA.QTY // Min. lot qty.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.BATCH_LOT_QTY IS '刻みロット数量 // #MA.QTY // Increments lot qty.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.FXD_LOT_QTY IS '固定基準ロット数量 // #MA.QTY // Constant reference lot qty.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.FXD_YIELD_QTY IS '固定歩留数量 // #MA.QTY // Constant yield qty.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.NMR_QTY IS '歩留製造数量 // #MA.QTY // Yield mfg. qty.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.DNM_QTY IS '理論製造数量 // #MA.QTY // Ideal mfg. qty.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.ALC_DPT_CD IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.EXP_DPT_CD IS '展開部門ＣＤ // #MA.COST_DPT_CD // Exploded dept. cd.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.EXP_PRIO IS '展開優先順位 // #MG.EXP_PRIO // Explosion priority';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.MAX_QTY IS '月次最大数量 // #MA.QTY // Monthly max. qty.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.ALC_VAL1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.ALC_VAL2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.ALC_VAL3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.ALC_VAL4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.ALC_VAL5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.RMRKS IS '備考 // #MG.ITM_DTL_RMRKS // Remarks';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.SUB_CHAR1 IS '予備１ // #MG.ITM_DTL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.SUB_CHAR2 IS '予備２ // #MG.ITM_DTL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.SUB_CHAR3 IS '予備３ // #MG.ITM_DTL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.NON_CALC_FLG IS '計算対象外ＦＬＧ // #MA.FLG // Not to calculate flg.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.IMP_ERR_FLG IS '取込エラーＦＬＧ // #MA.FLG // Import error flg.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.IMP_FLG IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGW_IMP_ITM_DTL_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

