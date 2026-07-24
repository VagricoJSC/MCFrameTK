
COMMENT ON TABLE MGVT_MST_OPER_INST IS '工程指図ビュー // Operation order view';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_INST_NO IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_ORD_NO IS '工程オーダＮＯ // #MA.OPER_ORD_NO // Operation order No.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.DISP_SEQ IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MGVT_MST_OPER_INST.ST_SCHD_TM IS '着手予定日時 // #MA.TM // Scheduled start date and time';


COMMENT ON COLUMN MGVT_MST_OPER_INST.END_SCHD_TM IS '終了予定日時 // #MA.TM // Scheduled end date and time';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_LOC_CD IS '工程場所ＣＤ // #MA.LOC_CD // Operation location cd.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_STR_LN_CD IS '工程棚・ラインＣＤ // #MA.STR_LN_CD // Operation rack/line cd.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_STD_QTY IS '工程基準単位数量 // #MA.QTY // Operation base unit qty.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_CONV_QTY IS '工程換算単位数量 // #MA.QTY // Operation conversion unit qty.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_UNIT_CD IS '工程単位ＣＤ // #MA.UNIT_CD // Operation unit cd.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_UNIT_CONV_RND_TYP IS '工程換算端数処理区分 // #MA.RND_TYP // Operation conversion rounding type';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_UNIT_DEC_PLACE IS '工程単位小数部有効桁数 // #MA.DEC_PLACE // Operation unit number of decimal places';


COMMENT ON COLUMN MGVT_MST_OPER_INST.UNSCHD_INST_FLG IS '計画外指図ＦＬＧ // #MA.FLG // Unplanned order flg.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.UNSCHD_ACT_FLG IS '計画外実績ＦＬＧ // #MA.FLG // Unplanned result flg.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.BKF_FLG IS 'バックフラッシュ許可ＦＬＧ // #MA.FLG // Allow backflush flg.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.WK_COST_CALC_FLG IS '自動工数計算ＦＬＧ // #MA.FLG // Auto man-hour calculation flg.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_INST_GRP IS '工程指図グループ // #MA.OPER_INST_GRP // Operation order group';


COMMENT ON COLUMN MGVT_MST_OPER_INST.USR_CD IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_LT IS '工程ＬＴ // #MA.LT // Operation LT';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_LT_ADD_QTY IS '工程ＬＴ加算基準数量 // #MA.QTY // Operation LT add base qty.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_OFFST_TYP IS '工程オフセット区分 // #MA.OFFST_TYP // Operation offset type';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_OFFST IS '工程オフセット // #MA.OFFST // Operation offset';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_OFFST_ADD_QTY IS '工程オフセット加算基準数量 // #MA.QTY // Operation offset add base qty.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.LMT_FR_DT_FLG IS '期限起算日使用工程ＦＬＧ // #MA.FLG // Expiration base date use operation flg.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_LOWER_YIELD IS '工程下限収率 // #MA.YIELD // Operation min. yield';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_STD_YIELD IS '工程標準収率 // #MA.YIELD // Operation standard yield';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_UPPER_YIELD IS '工程上限収率 // #MA.YIELD // Operation max. yield';


COMMENT ON COLUMN MGVT_MST_OPER_INST.WIP_RATE IS '仕掛進捗度 // #MA.RATE // WIP progress';


COMMENT ON COLUMN MGVT_MST_OPER_INST.YIELD_OPER_FLG IS '出来高計上工程ＦＬＧ // #MA.FLG // Create inventory flg.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.YIELD_OPER_RATIO IS '出来高工程比率 // #MA.YIELD_OPER_RATIO // Output operation ratio';


COMMENT ON COLUMN MGVT_MST_OPER_INST.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.OPER_ABORT_FLG IS '工程打切ＦＬＧ // #MA.FLG // Cancel remaining operation flg.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.MES_FLG IS 'ＭＥＳＦＬＧ // #MA.FLG // MES flg.';


COMMENT ON COLUMN MGVT_MST_OPER_INST.INTR_RMRKS IS '内部備考 //  // Internal remarks';


COMMENT ON COLUMN MGVT_MST_OPER_INST.INST_RPT_RMRKS IS '指図書備考 //  // Order sheet remarks';


COMMENT ON COLUMN MGVT_MST_OPER_INST.SUB_CHAR1 IS '予備１ //  // Spare 1';


COMMENT ON COLUMN MGVT_MST_OPER_INST.SUB_CHAR2 IS '予備２ //  // Spare 2';


COMMENT ON COLUMN MGVT_MST_OPER_INST.SUB_CHAR3 IS '予備３ //  // Spare 3';


COMMENT ON COLUMN MGVT_MST_OPER_INST.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGVT_MST_OPER_INST.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGVT_MST_OPER_INST.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGVT_MST_OPER_INST.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGVT_MST_OPER_INST.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGVT_MST_OPER_INST.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGVT_MST_OPER_INST.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGVT_MST_OPER_INST.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGVT_MST_OPER_INST.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGVT_MST_OPER_INST.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

