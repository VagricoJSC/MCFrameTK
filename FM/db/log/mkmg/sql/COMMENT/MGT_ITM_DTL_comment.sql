
COMMENT ON TABLE MGT_ITM_DTL IS '原価品目詳細情報 // Cost item details info.';


COMMENT ON COLUMN MGT_ITM_DTL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGT_ITM_DTL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGT_ITM_DTL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGT_ITM_DTL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGT_ITM_DTL.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGT_ITM_DTL.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MGT_ITM_DTL.RQST_WG_CD IS '依頼先ワーキンググループＣＤ // #MA.WG_CD // Requested WG cd.';


COMMENT ON COLUMN MGT_ITM_DTL.TERM IS '期 // #MA.YM // Term';


COMMENT ON COLUMN MGT_ITM_DTL.CALC_CTG_CD IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN MGT_ITM_DTL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_ITM_DTL.COST_RATIO IS '原価比率 // #MA.COST_RATIO // Cost ratio';


COMMENT ON COLUMN MGT_ITM_DTL.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MGT_ITM_DTL.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MGT_ITM_DTL.MIN_LOT_QTY IS '最小ロット数量 // #MA.QTY // Min. lot qty.';


COMMENT ON COLUMN MGT_ITM_DTL.BATCH_LOT_QTY IS '刻みロット数量 // #MA.QTY // Increments lot qty.';


COMMENT ON COLUMN MGT_ITM_DTL.FXD_LOT_QTY IS '固定基準ロット数量 // #MA.QTY // Constant reference lot qty.';


COMMENT ON COLUMN MGT_ITM_DTL.FXD_YIELD_QTY IS '固定歩留数量 // #MA.QTY // Constant yield qty.';


COMMENT ON COLUMN MGT_ITM_DTL.NMR_QTY IS '歩留製造数量 // #MA.QTY // Yield mfg. qty.';


COMMENT ON COLUMN MGT_ITM_DTL.DNM_QTY IS '理論製造数量 // #MA.QTY // Ideal mfg. qty.';


COMMENT ON COLUMN MGT_ITM_DTL.ALC_DPT_CD IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN MGT_ITM_DTL.EXP_DPT_CD IS '展開部門ＣＤ // #MA.COST_DPT_CD // Exploded dept. cd.';


COMMENT ON COLUMN MGT_ITM_DTL.EXP_PRIO IS '展開優先順位 // #MG.EXP_PRIO // Explosion priority';


COMMENT ON COLUMN MGT_ITM_DTL.MAX_QTY IS '月次最大数量 // #MA.QTY // Monthly max. qty.';


COMMENT ON COLUMN MGT_ITM_DTL.ALC_VAL1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN MGT_ITM_DTL.ALC_VAL2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN MGT_ITM_DTL.ALC_VAL3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN MGT_ITM_DTL.ALC_VAL4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN MGT_ITM_DTL.ALC_VAL5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';


COMMENT ON COLUMN MGT_ITM_DTL.RMRKS IS '備考 // #MG.ITM_DTL_RMRKS // Remarks';


COMMENT ON COLUMN MGT_ITM_DTL.SUB_CHAR1 IS '予備１ // #MG.ITM_DTL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MGT_ITM_DTL.SUB_CHAR2 IS '予備２ // #MG.ITM_DTL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MGT_ITM_DTL.SUB_CHAR3 IS '予備３ // #MG.ITM_DTL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MGT_ITM_DTL.NON_CALC_FLG IS '計算対象外ＦＬＧ // #MA.FLG // Not to calculate flg.';


COMMENT ON COLUMN MGT_ITM_DTL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_ITM_DTL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_ITM_DTL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_ITM_DTL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_ITM_DTL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_ITM_DTL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_ITM_DTL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_ITM_DTL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_ITM_DTL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_ITM_DTL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

