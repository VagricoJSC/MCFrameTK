
COMMENT ON TABLE MST_PAY_ACT IS '支払実績ヘッダ // Payment result header';


COMMENT ON COLUMN MST_PAY_ACT.PAY_ACT_NO IS '支払実績ＮＯ // #MA.PAY_ACT_NO // Payment result No.';


COMMENT ON COLUMN MST_PAY_ACT.PAY_ACT_SEQ IS '支払実績連番 // #MA.SLIP_SEQ // Payment result sequence No.';


COMMENT ON COLUMN MST_PAY_ACT.PAY_ACT_REV IS '支払実績改訂番号 // #MA.SLIP_REV // Payment result revision number';


COMMENT ON COLUMN MST_PAY_ACT.SLIP_STS_TYP IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN MST_PAY_ACT.PSPPL_CD IS '支払先ＣＤ // #MA.BP_CD // Payee cd.';


COMMENT ON COLUMN MST_PAY_ACT.PAY_DPT_CD IS '支払部門ＣＤ // #MA.DPT_CD // Payment dept. cd.';


COMMENT ON COLUMN MST_PAY_ACT.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_PAY_ACT.PAY_USR_CD IS '支払担当者ＣＤ // #MA.USR_CD // Payment PIC cd.';


COMMENT ON COLUMN MST_PAY_ACT.PAY_ACT_DT IS '支払実績日 // #MA.DT // Actual payment date';


COMMENT ON COLUMN MST_PAY_ACT.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_PAY_ACT.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MST_PAY_ACT.PAY_BASIS_DT IS '支払起算日 // #MA.DT // Payment base date';


COMMENT ON COLUMN MST_PAY_ACT.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_PAY_ACT.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MST_PAY_ACT.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MST_PAY_ACT.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_PAY_ACT.AP_STTL_CD IS '債務決済方法ＣＤ // #MA.STTL_CD // AP settlement method cd.';


COMMENT ON COLUMN MST_PAY_ACT.AP_STTL_TYP IS '債務決済区分 // #MA.AP_STTL_TYP // AP settlement type';


COMMENT ON COLUMN MST_PAY_ACT.BANK_AC_CD IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN MST_PAY_ACT.PAY_BANK_AC_CD IS '支払先口座ＣＤ // #MA.BANK_AC_CD // Payee account cd.';


COMMENT ON COLUMN MST_PAY_ACT.AP_SETOFF_TYP IS '相殺先区分 // #MA.AP_SETOFF_TYP // Offset destination type';


COMMENT ON COLUMN MST_PAY_ACT.SETOFF_CD IS '相殺先ＣＤ // #MA.BP_CD // Offset destination cd.';


COMMENT ON COLUMN MST_PAY_ACT.SETOFF_NM IS '相殺先名 // #MA.BP_NM // Offset destination name';


COMMENT ON COLUMN MST_PAY_ACT.SO_DPT_CD IS '相殺部門ＣＤ // #MA.DPT_CD // Offset dept. cd.';


COMMENT ON COLUMN MST_PAY_ACT.SCHD_ACT_FLG IS '予定時実績ＦＬＧ // #MA.FLG // Result at schedule flg.';


COMMENT ON COLUMN MST_PAY_ACT.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_PAY_ACT.INTR_RMRKS IS '内部備考 // #MS.PAY_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_PAY_ACT.PAR_PAY_ACT_NO IS '親支払実績ＮＯ // #MA.PAY_ACT_NO // Parent payment result No.';


COMMENT ON COLUMN MST_PAY_ACT.PAR_PAY_ACT_SEQ IS '親支払実績連番 // #MA.SLIP_SEQ // Parent payment result sequence No.';


COMMENT ON COLUMN MST_PAY_ACT.SUB_CHAR1 IS '予備１ // #MS.PAY_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_PAY_ACT.SUB_CHAR2 IS '予備２ // #MS.PAY_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_PAY_ACT.SUB_CHAR3 IS '予備３ // #MS.PAY_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_PAY_ACT.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PAY_ACT.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PAY_ACT.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PAY_ACT.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PAY_ACT.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PAY_ACT.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PAY_ACT.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PAY_ACT.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PAY_ACT.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PAY_ACT.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

