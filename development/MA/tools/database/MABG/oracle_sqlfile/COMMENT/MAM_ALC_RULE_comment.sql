
COMMENT ON TABLE MAM_ALC_RULE IS '配賦方法マスタ // Allocation basis Master';


COMMENT ON COLUMN MAM_ALC_RULE.ALC_PTN_CD IS '配賦パタンＣＤ // #MA.ALC_PTN_CD // Allocation pattern cd.';


COMMENT ON COLUMN MAM_ALC_RULE.TERM IS '期 // #MA.YM // Term';


COMMENT ON COLUMN MAM_ALC_RULE.ALC_TGT_TYP IS '配賦対象区分 // #MA.ALC_TGT_TYP // Allocation target type';


COMMENT ON COLUMN MAM_ALC_RULE.ALC_RULE_TYP IS '配賦方法区分 // #MA.ALC_RULE_TYP // Allocation basis type';


COMMENT ON COLUMN MAM_ALC_RULE.EXPNS_CD IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN MAM_ALC_RULE.DIFF_CALC_TYP IS '差異計算区分 // #MA.DIFF_CALC_TYP // Variance calculation type';


COMMENT ON COLUMN MAM_ALC_RULE.RND_TYP IS '端数処理区分 // #MA.RND_TYP // Rounding type';


COMMENT ON COLUMN MAM_ALC_RULE.DEC_PLACE IS '小数部有効桁数 // #MA.DEC_PLACE // Number of decimal places';


COMMENT ON COLUMN MAM_ALC_RULE.ALC_COEF_CD IS '配賦係数ＣＤ // #MA.ALC_COEF_CD // Allocation coefficient cd.';


COMMENT ON COLUMN MAM_ALC_RULE.COEF_LIMIT_FLG IS '配賦係数限定ＦＬＧ // #MA.FLG // Allocation coefficient limit flg.';


COMMENT ON COLUMN MAM_ALC_RULE.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MAM_ALC_RULE.NON_MINUS_FLG IS 'マイナス対象外ＦＬＧ // #MA.FLG // Not for minus flg.';


COMMENT ON COLUMN MAM_ALC_RULE.NON_OS_FLG IS '外注対象外ＦＬＧ // #MA.FLG // Not for subcontracting flg.';


COMMENT ON COLUMN MAM_ALC_RULE.SCST_ALC_FLG IS '納品先配賦ＦＬＧ // #MA.FLG // Delivery destination allocation flg.';


COMMENT ON COLUMN MAM_ALC_RULE.STD_ALC_FLG IS '標準配賦ＦＬＧ // #MA.FLG // Standard allocation flg.';


COMMENT ON COLUMN MAM_ALC_RULE.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_ALC_RULE.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_ALC_RULE.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_ALC_RULE.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_ALC_RULE.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_ALC_RULE.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_ALC_RULE.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_ALC_RULE.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_ALC_RULE.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_ALC_RULE.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_ALC_RULE.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_ALC_RULE.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_ALC_RULE.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_ALC_RULE.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_ALC_RULE.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_ALC_RULE.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_ALC_RULE.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

