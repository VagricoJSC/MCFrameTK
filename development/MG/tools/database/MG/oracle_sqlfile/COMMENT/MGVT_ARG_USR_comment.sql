
COMMENT ON TABLE MGVT_ARG_USR IS 'ユーザ別原価計算設定情報ビュー // Calculation settings info. by user view';


COMMENT ON COLUMN MGVT_ARG_USR.CALC_NO IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN MGVT_ARG_USR.CALC_GRP_CD IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN MGVT_ARG_USR.TERM IS '期 // #MA.YM // Term';


COMMENT ON COLUMN MGVT_ARG_USR.ST_YM IS '対象期間先頭年月 // #MA.YM // First month of the term';


COMMENT ON COLUMN MGVT_ARG_USR.END_YM IS '対象期間末尾年月 // #MA.YM // Last month of the term';


COMMENT ON COLUMN MGVT_ARG_USR.SA_TYP IS '予実区分 // #MA.SA_TYP // Plan/Result type';


COMMENT ON COLUMN MGVT_ARG_USR.EXP_CALC_TYP IS '展開計算区分 // #MA.EXP_CALC_TYP // BOM explosion calculation type';


COMMENT ON COLUMN MGVT_ARG_USR.PRE_ALC_CALC_TYP IS '一次配賦計算区分 // #MA.PRE_ALC_CALC_TYP // Departmental alloc. calculation type';


COMMENT ON COLUMN MGVT_ARG_USR.ALC_CALC_TYP IS '配賦率計算区分 // #MA.ALC_CALC_TYP // Allocation rate calculation type';


COMMENT ON COLUMN MGVT_ARG_USR.COST_CALC_TYP IS '原価計算区分 // #MA.COST_CALC_TYP // Calculation type';


COMMENT ON COLUMN MGVT_ARG_USR.EVAL_TYP IS '金額評価区分 // #MA.EVAL_TYP // Amount evaluation type';


COMMENT ON COLUMN MGVT_ARG_USR.INPT_CALC_FLG IS '投入計算ＦＬＧ // #MA.FLG // Input calculation flg.';


COMMENT ON COLUMN MGVT_ARG_USR.WK_CALC_FLG IS '工数計算ＦＬＧ // #MA.FLG // Man-hour calculation flg.';


COMMENT ON COLUMN MGVT_ARG_USR.PROV_CALC_FLG IS '支給計算ＦＬＧ // #MA.FLG // Supply calculation flg.';


COMMENT ON COLUMN MGVT_ARG_USR.XFR_CALC_FLG IS '移動計算ＦＬＧ // #MA.FLG // Movement calculation flg.';


COMMENT ON COLUMN MGVT_ARG_USR.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MGVT_ARG_USR.RUNTIME_WG_CD IS '実行時ワーキンググループＣＤ // #MA.WG_CD // Execution working group cd.';


COMMENT ON COLUMN MGVT_ARG_USR.CALC_ST IS '計算開始時刻 // #MA.YMDHMS // Calculation start time';


COMMENT ON COLUMN MGVT_ARG_USR.CALC_FIN IS '計算終了時刻 // #MA.YMDHMS // Calculation end time';


COMMENT ON COLUMN MGVT_ARG_USR.CALC_CNT IS '計算回数 // #MG.CALC_CNT // Calculation count';


COMMENT ON COLUMN MGVT_ARG_USR.CALC_EXEC_CNT IS '計算実行回数 // #MG.CALC_CNT // Number of calculation execute';


COMMENT ON COLUMN MGVT_ARG_USR.ALC_ERR_FLG IS '未配賦ＦＬＧ // #MA.FLG // Unallocated flg.';


COMMENT ON COLUMN MGVT_ARG_USR.TRD_AMT_FLG IS '振替差額ＦＬＧ // #MA.FLG // Transfer difference flg.';


COMMENT ON COLUMN MGVT_ARG_USR.ADJ_AMT_FLG IS '受払差額ＦＬＧ // #MA.FLG // GR/GI difference flg.';


COMMENT ON COLUMN MGVT_ARG_USR.MINUS_STK_FLG IS 'マイナス在庫ＦＬＧ // #MA.FLG // Negative inventory flg.';


COMMENT ON COLUMN MGVT_ARG_USR.OTHER_CHK_FLG IS '任意チェックＦＬＧ // #MA.FLG // Optional check flg.';


COMMENT ON COLUMN MGVT_ARG_USR.ITM_LIMIT_FLG IS '品目指定ＦＬＧ // #MA.FLG // Item specification flg.';


COMMENT ON COLUMN MGVT_ARG_USR.DATA_CHECK_FLG IS 'データ確認ＦＬＧ // #MA.FLG // Data check flg.';


COMMENT ON COLUMN MGVT_ARG_USR.CARRY_FLG IS '繰越ＦＬＧ // #MA.FLG // Carry-over flg.';


COMMENT ON COLUMN MGVT_ARG_USR.NON_DEL_FLG IS '削除不可ＦＬＧ // #MA.FLG // Undeletable flg.';


COMMENT ON COLUMN MGVT_ARG_USR.FIX_FLG IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN MGVT_ARG_USR.RATE_FIX_FLG IS '配賦率確定ＦＬＧ // #MA.FLG // Firm Allocation rate flg.';


COMMENT ON COLUMN MGVT_ARG_USR.CALC_ERR_FLG IS 'エラーＦＬＧ // #MA.FLG // Error flg.';


COMMENT ON COLUMN MGVT_ARG_USR.INS_SRV_REQ_NO IS '登録リクエストＮＯ // #MA.SRV_REQ_NO // Entry request No.';


COMMENT ON COLUMN MGVT_ARG_USR.BATCH_LOG_NO IS 'バッチログＮＯ // #MA.BATCH_LOG_NO // Batch log No.';


COMMENT ON COLUMN MGVT_ARG_USR.RMRKS IS '備考 // #MG.CALC_ARG_RMRKS // Remarks';


COMMENT ON COLUMN MGVT_ARG_USR.SUB_CHAR1 IS '予備１ // #MG.CALC_ARG_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MGVT_ARG_USR.SUB_CHAR2 IS '予備２ // #MG.CALC_ARG_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MGVT_ARG_USR.SUB_CHAR3 IS '予備３ // #MG.CALC_ARG_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MGVT_ARG_USR.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGVT_ARG_USR.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGVT_ARG_USR.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGVT_ARG_USR.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGVT_ARG_USR.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGVT_ARG_USR.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGVT_ARG_USR.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGVT_ARG_USR.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGVT_ARG_USR.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGVT_ARG_USR.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

