
COMMENT ON TABLE MAM_ITM_OPER_ALL IS '品目工程マスタ // Item operation master';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.DISP_SEQ IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_LT IS '工程ＬＴ // #MA.LT // Operation LT';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_LT_ADD_QTY IS '工程ＬＴ加算基準数量 // #MA.QTY // Operation LT add base qty.';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_OFFST_TYP IS '工程オフセット区分 // #MA.OFFST_TYP // Operation offset type';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_OFFST IS '工程オフセット // #MA.OFFST // Operation offset';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_OFFST_ADD_QTY IS '工程オフセット加算基準数量 // #MA.QTY // Operation offset add base qty.';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_UNIT_CD IS '工程管理単位ＣＤ // #MA.UNIT_CD // Operation management unit cd.';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_STD_QTY IS '工程基準単位数量 // #MA.QTY // Operation base unit qty.';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_CONV_QTY IS '工程換算単位数量 // #MA.QTY // Operation conversion unit qty.';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.DEC_PLACE IS '小数部有効桁数 // #MA.DEC_PLACE // Number of decimal places';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.UNIT_CONV_RND_TYP IS '換算端数処理区分 // #MA.RND_TYP // Rounding type (Conversion)';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.YIELD_OPER_FLG IS '出来高計上工程ＦＬＧ // #MA.FLG // Create inventory flg.';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.YIELD_OPER_RATIO IS '出来高工程比率 // #MA.YIELD_OPER_RATIO // Output operation ratio';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_INST_GRP IS '工程指図グループ // #MA.OPER_INST_GRP // Operation order group';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_LOC_CD IS '工程場所ＣＤ // #MA.LOC_CD // Operation location cd.';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.LMT_FR_DT_FLG IS '期限起算日使用工程ＦＬＧ // #MA.FLG // Expiration base date use operation flg.';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_LOWER_YIELD IS '工程下限収率 // #MA.YIELD // Operation min. yield';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_STD_YIELD IS '工程標準収率 // #MA.YIELD // Operation standard yield';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.OPER_UPPER_YIELD IS '工程上限収率 // #MA.YIELD // Operation max. yield';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.WIP_RATE IS '仕掛進捗率 // #MA.RATE // WIP progress rate';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.NOT_COST_FLG IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_ITM_OPER_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

