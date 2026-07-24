
COMMENT ON TABLE MGW_IMP_ITM_WK_ALL IS '原価品目工数取込対象ワーク // Work for cost item man-hour import';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.WK_COST_CD IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.TERM IS '期 // #MA.YM // Term';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.CALC_CTG_CD IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.BASE_QTY IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.FXD_WK_COST IS '工数（固定） // #MA.WK_COST_QTY // Man-hour (Constant)';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.WK_COST IS '工数（数量依存） // #MA.WK_COST_QTY // Man-hour (Qty.-dependent)';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.MIN_WK_COST IS '最小工数 // #MA.WK_COST_QTY // Min. Man-hour';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.BATCH_WK_COST IS '刻み工数 // #MA.WK_COST_QTY // Increments of man-hour';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.RMRKS IS '備考 // #MG.ITM_WK_RMRKS // Remarks';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.SUB_CHAR1 IS '予備１ // #MG.ITM_WK_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.SUB_CHAR2 IS '予備２ // #MG.ITM_WK_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.SUB_CHAR3 IS '予備３ // #MG.ITM_WK_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.NON_CALC_FLG IS '計算対象外ＦＬＧ // #MA.FLG // Not to calculate flg.';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.IMP_ERR_FLG IS '取込エラーＦＬＧ // #MA.FLG // Import error flg.';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.IMP_FLG IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGW_IMP_ITM_WK_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

