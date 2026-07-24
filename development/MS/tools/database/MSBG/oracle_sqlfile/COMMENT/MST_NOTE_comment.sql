
COMMENT ON TABLE MST_NOTE IS '手形 // Notes';


COMMENT ON COLUMN MST_NOTE.NOTE_MNG_NO IS '手形管理ＮＯ // #MA.NOTE_MNG_NO // Note management No.';


COMMENT ON COLUMN MST_NOTE.NOTE_NO IS '手形番号 // #MA.NOTE_NO // Note number';


COMMENT ON COLUMN MST_NOTE.NOTE_TYP IS '手形区分 // #MA.NOTE_TYP // Note type';


COMMENT ON COLUMN MST_NOTE.DRAW_DT IS '振出日 // #MA.DT // Drawing date';


COMMENT ON COLUMN MST_NOTE.DUE_DT IS '支払期日 // #MA.DT // Payment due date';


COMMENT ON COLUMN MST_NOTE.DRAWER_NM IS '振出人名 // #MA.DRAWER_NM // Drawer name';


COMMENT ON COLUMN MST_NOTE.DRAW_BANK_CD IS '振出銀行ＣＤ // #MA.BANK_CD // Drawing bank cd.';


COMMENT ON COLUMN MST_NOTE.DRAW_BRANCH_CD IS '振出支店ＣＤ // #MA.BANK_BRANCH_CD // Drawing branch cd.';


COMMENT ON COLUMN MST_NOTE.ENDRSR IS '裏書人 // #MA.NOTE_ENDRSR // Endorser';


COMMENT ON COLUMN MST_NOTE.ACCPTR IS '引受人 // #MA.NOTE_ACCPTR // Accepted by';


COMMENT ON COLUMN MST_NOTE.NOTE_RSN_CD IS '手形理由ＣＤ // #MA.NOTE_RSN_CD // Note reason cd.';


COMMENT ON COLUMN MST_NOTE.NOTE_AMT IS '手形額 // #MA.MONEY // Note amount';


COMMENT ON COLUMN MST_NOTE.APPL_AMT IS '消込額 // #MA.MONEY // Reconciled amount';


COMMENT ON COLUMN MST_NOTE.NOT_APPL_BAL IS '未消込残高 // #MA.MONEY // Unreconciled balance';


COMMENT ON COLUMN MST_NOTE.SUSP_AMT IS '仮受処理額 // #MA.MONEY // Suspense received process amount';


COMMENT ON COLUMN MST_NOTE.ADV_AMT IS '前受処理額 // #MA.MONEY // Processed as advance received amount';


COMMENT ON COLUMN MST_NOTE.MAT_FLG IS '決済ＦＬＧ // #MA.FLG // Settlement flg.';


COMMENT ON COLUMN MST_NOTE.SUB_CHAR1 IS '予備１ // #MS.NOTE_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_NOTE.SUB_CHAR2 IS '予備２ // #MS.NOTE_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_NOTE.SUB_CHAR3 IS '予備３ // #MS.NOTE_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_NOTE.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_NOTE.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_NOTE.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_NOTE.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_NOTE.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_NOTE.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_NOTE.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_NOTE.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_NOTE.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_NOTE.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_NOTE.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

