
COMMENT ON TABLE MAM_SCHD_PAY_CMN IS '支払依頼科目マスタ_（共通）_ // Payment request account master_(Common)_';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.PAY_AP_TYP IS '支払債務区分 // #MA.PAY_AP_TYP // Payment obligation type';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.SEQ IS '連番 // #MA.INT4 // Sequence number';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.PRIO IS '優先順 // #MA.INT // Priority';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.FOREIGN_TYP IS '国外取引区分 // #MA.FOREIGN_TYP // Foreign transaction type';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.ASPPL_CD IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.DPT_ID_FLG IS '部門ＩＤ取得ＦＬＧ // #MA.FLG // Dept. ID acquisition flg.';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.SLIP_CNT_ID IS '伝票グループＩＤ // #MA.SLIP_CNT_ID // Slip group ID';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.AC_CD IS '勘定科目ＣＤ // #MA.AC_CD // Account cd.';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.SUB_AC_CD IS '補助勘定科目ＣＤ // #MA.SUB_AC_CD // Subsidiary account cd.';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.ABS_TYP IS '摘要区分 // #MA.ABS_TYP // Abstract type';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.ABSTRACT1 IS '摘要 // #MA.ABSTRACT_M // Abstract';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_SCHD_PAY_CMN.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

