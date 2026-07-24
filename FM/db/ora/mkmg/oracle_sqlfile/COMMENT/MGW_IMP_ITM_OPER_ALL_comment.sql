
COMMENT ON TABLE MGW_IMP_ITM_OPER_ALL IS '原価品目工程取込対象ワーク // Work for cost item operation import';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.TERM IS '期 // #MA.YM // Term';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.CALC_CTG_CD IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.DISP_SEQ IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.NMR_QTY IS '歩留製造数量 // #MA.QTY // Yield mfg. qty.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.DNM_QTY IS '理論製造数量 // #MA.QTY // Ideal mfg. qty.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.YIELD_OPER_FLG IS '出来高計上工程ＦＬＧ // #MA.FLG // Create inventory flg.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.OPER_UNIT_CD IS '工程管理単位ＣＤ // #MA.UNIT_CD // Operation management unit cd.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.OPER_STD_QTY IS '工程基準単位数量 // #MA.QTY // Operation base unit qty.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.OPER_CONV_QTY IS '工程換算単位数量 // #MA.QTY // Operation conversion unit qty.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.DEC_PLACE IS '小数部有効桁数 // #MA.DEC_PLACE // Number of decimal places';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.UNIT_CONV_RND_TYP IS '換算端数処理区分 // #MA.RND_TYP // Rounding type (Conversion)';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.RMRKS IS '備考 // #MG.ITM_OPER_RMRKS // Remarks';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.SUB_CHAR1 IS '予備１ // #MG.ITM_OPER_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.SUB_CHAR2 IS '予備２ // #MG.ITM_OPER_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.SUB_CHAR3 IS '予備３ // #MG.ITM_OPER_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.NON_CALC_FLG IS '計算対象外ＦＬＧ // #MA.FLG // Not to calculate flg.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.IMP_ERR_FLG IS '取込エラーＦＬＧ // #MA.FLG // Import error flg.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.IMP_FLG IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGW_IMP_ITM_OPER_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

