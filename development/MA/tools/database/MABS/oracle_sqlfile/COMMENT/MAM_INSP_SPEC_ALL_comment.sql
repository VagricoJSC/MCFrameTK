
COMMENT ON TABLE MAM_INSP_SPEC_ALL IS '品目検査規格マスタ // Item inspection specific master';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.INSP_PTN_CD IS '検査パタンＣＤ // #MA.INSP_PTN_CD // Inspection pattern cd.';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.INSP_SEQ IS '検査順序 // #MA.INSP_SEQ // Inspection sequence';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.INSP_POINT_CD IS '検査項目ＣＤ // #MA.INSP_POINT_CD // Inspection checkpoint cd.';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.PRE_INSP_INF_TYP IS '先行検査引継区分 // #MA.PRE_INSP_INF_TYP // Prior inspection copy type';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.INSP_QLQN_TYP IS '定性定量区分 // #MA.INSP_QLQN_TYP // Qualitative/quantitative type';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.QL_STD_VAL IS '定性規格値 // #MA.QL_STD_VAL // Qualitative specific value';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.UNIT_CD IS '単位ＣＤ // #MA.UNIT_CD // Unit cd.';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.QN_INT_DIGIT IS '定量値整数部桁数 // #MA.INT_DIGIT // Quantitative integer digits';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.QN_INT_FRAC IS '定量値小数部桁数 // #MA.INT_DIGIT // Quantitative decimal digits';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.QN_OUT_MIN IS '外規格下限値 // #MA.QN_INSP_VAL // Lower limit of external specification';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.SIGN_OUT_MIN_TYP IS '外規格下限符号区分 // #MA.SIGN_TYP // Sign type (Lower limit of external specification)';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.SIGN_OUT_MAX_TYP IS '外規格上限符号区分 // #MA.SIGN_TYP // Sign type (Upper limit of external specification)';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.QN_OUT_MAX IS '外規格上限値 // #MA.QN_INSP_VAL // Upper limit of external specification';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.QN_IN_MIN IS '内規格下限値 // #MA.QN_INSP_VAL // Lower limit of internal specification';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.SIGN_IN_MIN_TYP IS '内規格下限符号区分 // #MA.SIGN_TYP // Sign type (Lower limit of internal specification)';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.SIGN_IN_MAX_TYP IS '内規格上限符号区分 // #MA.SIGN_TYP // Sign type (Upper limit of internal specification)';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.QN_IN_MAX IS '内規格上限値 // #MA.QN_INSP_VAL // Upper limit of internal specification';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_INSP_SPEC_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

