
COMMENT ON TABLE MST_PAY_SCHD_ALL IS '支払予定 // Payment schedule';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.PAY_SCHD_NO IS '支払予定ＮＯ // #MA.PAY_SCHD_NO // Payment schedule No.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.PAY_CHK_MNG_NO IS '支払照合管理ＮＯ // #MA.PAY_CHK_MNG_NO // Payment collation management No.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.ASPPL_CD IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.AP_DPT_CD IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.PAY_DPT_CD IS '支払部門ＣＤ // #MA.DPT_CD // Payment dept. cd.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.AP_TYP IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.AP_STTL_CD IS '債務決済方法ＣＤ // #MA.STTL_CD // AP settlement method cd.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.AP_STTL_TYP IS '債務決済区分 // #MA.AP_STTL_TYP // AP settlement type';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.PAY_SCHD_DT IS '支払予定日 // #MA.DT // Scheduled payment date';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.PAY_BANK_AC_CD IS '支払先口座ＣＤ // #MA.BANK_AC_CD // Payee account cd.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.BANK_AC_CD IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.AP_SETOFF_TYP IS '相殺先区分 // #MA.AP_SETOFF_TYP // Offset destination type';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.SETOFF_CD IS '相殺先ＣＤ // #MA.BP_CD // Offset destination cd.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.SETOFF_NM IS '相殺先名 // #MA.BP_NM // Offset destination name';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.SO_DPT_CD IS '相殺部門ＣＤ // #MA.DPT_CD // Offset dept. cd.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.TRD_CUR_COM_PAID_TAX_CD IS '手数料税ＣＤ // #MA.TAX_CD // Fee tax cd.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.TRD_CUR_COM_PAID_TAX_AMT IS '取引通貨手数料税額 // #MA.MONEY // Fee tax amount (Transaction currency)';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.TRD_CUR_EXC_COM_PAID IS '取引通貨手数料税抜額 // #MA.MONEY // Fee amount without tax (Transaction currency)';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.TRD_CUR_APPL_AMT IS '取引通貨消込額 // #MA.MONEY // Reconciled amount (Transaction currency)';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.PAY_STS_TYP IS '支払状況区分 // #MS.PAY_STS_TYP // Payment status type';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.SW_FLG IS '振替済ＦＬＧ // #MA.FLG // Transferred flg.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.RCV_BILL_NO IS '相手先請求書ＮＯ // #MA.RCV_BILL_NO // Counterpart invoice No.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.ADV_PAY_ACT_NO IS '前渡金支払実績ＮＯ // #MA.PAY_ACT_NO // Advance payment amount payment result No.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.NOTE_NO IS '手形番号 // #MA.NOTE_NO // Note number';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.NOTE_TYP IS '手形区分 // #MA.NOTE_TYP // Note type';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.NOTE_RSN_CD IS '手形理由ＣＤ // #MA.NOTE_RSN_CD // Note reason cd.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.DRAW_DT IS '振出日 // #MA.DT // Drawing date';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.DUE_DT IS '支払期日 // #MA.DT // Payment due date';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.NOTE_DAYS IS '手形サイト // #MA.DAYS // Note sight';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.DRAWER_NM IS '振出人名 // #MA.DRAWER_NM // Drawer name';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.DRAW_BANK_CD IS '振出銀行ＣＤ // #MA.BANK_CD // Drawing bank cd.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.DRAW_BRANCH_CD IS '振出支店ＣＤ // #MA.BANK_BRANCH_CD // Drawing branch cd.';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.ENDRSR IS '裏書人 // #MA.NOTE_ENDRSR // Endorser';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.ACCPTR IS '引受人 // #MA.NOTE_ACCPTR // Accepted by';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.PAY_NTC_D_PRINT_RMRKS IS '支払通知書明細備考 // #MS.PAY_NTC_D_PRINT_RMRKS // Payment notice details remarks';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.PAY_SCHD_PRINT_RMRKS IS '支払予定表備考 // #MS.PAY_SCHD_PRINT_RMRKS // Payment schedule table details';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.INTR_RMRKS IS '内部備考 // #MS.PAY_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.SUB_CHAR1 IS '予備１ // #MS.PAY_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.SUB_CHAR2 IS '予備２ // #MS.PAY_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.SUB_CHAR3 IS '予備３ // #MS.PAY_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PAY_SCHD_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

