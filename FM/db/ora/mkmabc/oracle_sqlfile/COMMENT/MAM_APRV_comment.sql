
COMMENT ON TABLE MAM_APRV IS '承認情報マスタ // Approval info. master';


COMMENT ON COLUMN MAM_APRV.APRV_FUNC_TYP IS '承認機能区分 // #MA.APRV_FUNC_TYP // Approval function type';


COMMENT ON COLUMN MAM_APRV.APRV_ROW_NUM IS '承認行番号 // #MA.APRV_ROW_NUM // Approver row number';


COMMENT ON COLUMN MAM_APRV.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAM_APRV.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAM_APRV.PRIO IS '優先順 // #MA.INT // Priority';


COMMENT ON COLUMN MAM_APRV.APRV_RT_PTN IS '承認ルートパタン // #MA.APRV_RT_PTN // Approval route pattern';


COMMENT ON COLUMN MAM_APRV.APRV_UPD_FLG IS '更新可能ＦＬＧ // #MA.FLG // Updatable flg.';


COMMENT ON COLUMN MAM_APRV.APRV_DEL_FLG IS '取消可能ＦＬＧ // #MA.FLG // Cancelable flg.';


COMMENT ON COLUMN MAM_APRV.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MAM_APRV.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MAM_APRV.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MAM_APRV.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MAM_APRV.ITM_GRP_TYP IS '品目分類区分 // #MA.ITM_GRP_TYP // Item classification type';


COMMENT ON COLUMN MAM_APRV.ITM_GRP_CD IS '品目分類ＣＤ // #MA.ITM_GRP_CD // Item classification cd.';


COMMENT ON COLUMN MAM_APRV.DPT_CD IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN MAM_APRV.BP_CD IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN MAM_APRV.BP_GRP_TYP IS '取引先分類区分 // #MA.BP_GRP_TYP // BP classification type';


COMMENT ON COLUMN MAM_APRV.BP_GRP_CD IS '取引先分類ＣＤ // #MA.BP_GRP_CD // BP classification cd.';


COMMENT ON COLUMN MAM_APRV.CUR_CD1 IS '通貨ＣＤ１ // #MA.CUR_CD // Currency cd. 1';


COMMENT ON COLUMN MAM_APRV.VAL_MIN1 IS '金額１下限値 // #MA.MONEY // Amount 1 lower limit';


COMMENT ON COLUMN MAM_APRV.VAL_MAX1 IS '金額１上限値 // #MA.MONEY // Amount 1 Upper limit';


COMMENT ON COLUMN MAM_APRV.BIND_COND1 IS '結合条件区分１ // #MA.BIND_COND_TYP // Join criteria type 1';


COMMENT ON COLUMN MAM_APRV.CUR_CD2 IS '通貨ＣＤ２ // #MA.CUR_CD // Currency cd. 2';


COMMENT ON COLUMN MAM_APRV.VAL_MIN2 IS '金額２下限値 // #MA.MONEY // Amount 2 lower limit';


COMMENT ON COLUMN MAM_APRV.VAL_MAX2 IS '金額２上限値 // #MA.MONEY // Amount 2 Upper limit';


COMMENT ON COLUMN MAM_APRV.BIND_COND2 IS '結合条件区分２ // #MA.BIND_COND_TYP // Join criteria type 2';


COMMENT ON COLUMN MAM_APRV.CUR_CD3 IS '通貨ＣＤ３ // #MA.CUR_CD // Currency cd. 3';


COMMENT ON COLUMN MAM_APRV.VAL_MIN3 IS '金額３下限値 // #MA.MONEY // Amount 3 lower limit';


COMMENT ON COLUMN MAM_APRV.VAL_MAX3 IS '金額３上限値 // #MA.MONEY // Amount 3 Upper limit';


COMMENT ON COLUMN MAM_APRV.EXT_KEY1 IS '拡張項目１ // #MA.APRV_EXT_KEY1 // Extended column 1';


COMMENT ON COLUMN MAM_APRV.EXT_KEY2 IS '拡張項目２ // #MA.APRV_EXT_KEY2 // Extended column 2';


COMMENT ON COLUMN MAM_APRV.EXT_KEY3 IS '拡張項目３ // #MA.APRV_EXT_KEY3 // Extended column 3';


COMMENT ON COLUMN MAM_APRV.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_APRV.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_APRV.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_APRV.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_APRV.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_APRV.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_APRV.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_APRV.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_APRV.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_APRV.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_APRV.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_APRV.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_APRV.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_APRV.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_APRV.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_APRV.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_APRV.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

