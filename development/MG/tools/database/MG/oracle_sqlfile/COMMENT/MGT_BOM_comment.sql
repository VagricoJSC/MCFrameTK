
COMMENT ON TABLE MGT_BOM IS '原価ＢＯＭ情報 // Cost BOM info.';


COMMENT ON COLUMN MGT_BOM.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MGT_BOM.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MGT_BOM.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MGT_BOM.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MGT_BOM.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MGT_BOM.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGT_BOM.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MGT_BOM.CHD_ITM_CD IS '子品目ＣＤ // #MA.ITM_CD // Child item cd.';


COMMENT ON COLUMN MGT_BOM.CHD_ITM_SUB1 IS '子枝番１ // #MA.ITM_SUB1 // Child branch No. 1';


COMMENT ON COLUMN MGT_BOM.CHD_ITM_SUB2 IS '子枝番２ // #MA.ITM_SUB2 // Child branch No. 2';


COMMENT ON COLUMN MGT_BOM.CHD_ITM_SUB3 IS '子枝番３ // #MA.ITM_SUB3 // Child branch No. 3';


COMMENT ON COLUMN MGT_BOM.ALT_GRP_CD IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN MGT_BOM.EXPNS_CD IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN MGT_BOM.TERM IS '期 // #MA.YM // Term';


COMMENT ON COLUMN MGT_BOM.CALC_CTG_CD IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN MGT_BOM.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_BOM.DISP_SEQ IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN MGT_BOM.PAR_RQMT_QTY IS '親必要数量 // #MA.QTY // Parent required qty.';


COMMENT ON COLUMN MGT_BOM.CHD_RQMT_QTY IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN MGT_BOM.CHD_BASE_QTY IS '子基準数量 // #MA.QTY // Child base qty.';


COMMENT ON COLUMN MGT_BOM.FXD_CHD_RQMT_QTY IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN MGT_BOM.CHD_MIN_QTY IS '子最小必要数量 // #MA.QTY // Child min. required qty.';


COMMENT ON COLUMN MGT_BOM.CHD_BATCH_QTY IS '子刻み必要数量 // #MA.QTY // Increments of child required qty.';


COMMENT ON COLUMN MGT_BOM.ALT_ITM_RATIO IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN MGT_BOM.RMRKS IS '備考 // #MG.BOM_RMRKS // Remarks';


COMMENT ON COLUMN MGT_BOM.SUB_CHAR1 IS '予備１ // #MG.BOM_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MGT_BOM.SUB_CHAR2 IS '予備２ // #MG.BOM_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MGT_BOM.SUB_CHAR3 IS '予備３ // #MG.BOM_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MGT_BOM.NON_CALC_FLG IS '計算対象外ＦＬＧ // #MA.FLG // Not to calculate flg.';


COMMENT ON COLUMN MGT_BOM.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_BOM.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_BOM.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_BOM.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_BOM.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_BOM.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_BOM.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_BOM.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_BOM.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_BOM.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

