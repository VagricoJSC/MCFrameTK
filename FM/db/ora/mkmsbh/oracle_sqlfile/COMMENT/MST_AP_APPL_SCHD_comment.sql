
COMMENT ON TABLE MST_AP_APPL_SCHD IS '買掛消込予定 // AP reconciliation schedule';


COMMENT ON COLUMN MST_AP_APPL_SCHD.AP_APPL_SCHD_NO IS '買掛消込予定ＮＯ // #MA.AP_APPL_SCHD_NO // AP reconciliation schedule No.';


COMMENT ON COLUMN MST_AP_APPL_SCHD.PAY_SCHD_NO IS '支払予定ＮＯ // #MA.PAY_SCHD_NO // Payment schedule No.';


COMMENT ON COLUMN MST_AP_APPL_SCHD.PURC_ACT_NO IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN MST_AP_APPL_SCHD.RCPT_IV_MNG_NO IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN MST_AP_APPL_SCHD.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MST_AP_APPL_SCHD.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_AP_APPL_SCHD.TRD_CUR_COM_PAID_TAX_AMT IS '取引通貨手数料税額 // #MA.MONEY // Fee tax amount (Transaction currency)';


COMMENT ON COLUMN MST_AP_APPL_SCHD.TRD_CUR_EXC_COM_PAID IS '取引通貨手数料税抜額 // #MA.MONEY // Fee amount without tax (Transaction currency)';


COMMENT ON COLUMN MST_AP_APPL_SCHD.TRD_CUR_APPL_AMT IS '取引通貨消込額 // #MA.MONEY // Reconciled amount (Transaction currency)';


COMMENT ON COLUMN MST_AP_APPL_SCHD.PAY_STS_TYP IS '支払状況区分 // #MS.PAY_STS_TYP // Payment status type';


COMMENT ON COLUMN MST_AP_APPL_SCHD.SUB_CHAR1 IS '予備１ // #MS.AP_APPL_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_AP_APPL_SCHD.SUB_CHAR2 IS '予備２ // #MS.AP_APPL_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_AP_APPL_SCHD.SUB_CHAR3 IS '予備３ // #MS.AP_APPL_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_AP_APPL_SCHD.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_AP_APPL_SCHD.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_AP_APPL_SCHD.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_AP_APPL_SCHD.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_AP_APPL_SCHD.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_AP_APPL_SCHD.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_AP_APPL_SCHD.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_AP_APPL_SCHD.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_AP_APPL_SCHD.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_AP_APPL_SCHD.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

