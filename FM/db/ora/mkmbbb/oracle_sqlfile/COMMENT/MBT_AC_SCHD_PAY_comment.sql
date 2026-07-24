
COMMENT ON TABLE MBT_AC_SCHD_PAY IS '会計支払依頼情報 // Accounting payment request info.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.DATA_NO IS 'データＮＯ // #MA.IT_DAT_NO // Data No.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.PAY_AP_TYP IS '支払債務区分 // #MA.PAY_AP_TYP // Payment obligation type';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.AP_APPL_SCHD_NO IS '買掛消込予定ＮＯ // #MA.AP_APPL_SCHD_NO // AP reconciliation schedule No.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.PAY_CHK_NO IS '支払照合ＮＯ // #MA.PAY_CHK_NO // Payment collation No.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.PAY_DPT_CD IS '支払部門ＣＤ // #MA.AC_DPT_CD // Payment dept. cd.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.BSPPL_DPT_CD IS '支払予定管理先部門ＣＤ // #MA.AC_DPT_CD // Scheduled payee dept. cd.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.AP_DPT_CD IS '債務部門ＣＤ // #MA.AC_DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_DPT_CD1 IS '予備部門ＣＤ１ // #MA.AC_DPT_CD // Spare dept. cd. 1';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_DPT_CD2 IS '予備部門ＣＤ２ // #MA.AC_DPT_CD // Spare dept. cd. 2';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_DPT_CD3 IS '予備部門ＣＤ３ // #MA.AC_DPT_CD // Spare dept. cd. 3';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.ASPPL_CD IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.BSPPL_CD IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.PSPPL_CD IS '支払先ＣＤ // #MA.BP_CD // Payee cd.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.FOREIGN_FLG IS '国外取引ＦＬＧ // #MA.FLG // Foreign transaction flg.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.PAY_SPOT_FLG IS '都度支払ＦＬＧ // #MA.FLG // Payment per transaction flg.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.PAY_SCHD_DT IS '支払予定日 // #MA.DT // Scheduled payment date';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.STTL_CD IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.AP_STTL_TYP IS '債務決済区分 // #MA.AP_STTL_TYP // AP settlement type';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.AP_TYP IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.BANK_AC_CD IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.PAY_BANK_AC_CD IS '支払先口座ＣＤ // #MA.BANK_AC_CD // Payee account cd.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.DRAWER_NM IS '振込人名 // #MA.DRAWER_NM // Payment person name';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.NOTE_NO IS '手形番号 // #MA.NOTE_NO // Note number';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.DUE_DT IS '手形満期日 // #MA.DT // Note expiration date';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.DRAW_DT IS '手形振出日 // #MA.DT // Note drawing date';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.RCV_BILL_NO IS '相手先請求書ＮＯ // #MA.RCV_BILL_NO // Counterpart invoice No.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.USR_CD IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.SEND_FLG IS '送信ＦＬＧ // #MA.FLG // Export flg.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.PROC_NO IS '処理ＮＯ // #MA.JNL_PROC_NO // Process No.';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MBT_AC_SCHD_PAY.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

