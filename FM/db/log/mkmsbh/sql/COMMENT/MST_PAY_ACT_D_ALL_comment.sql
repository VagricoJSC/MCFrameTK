
COMMENT ON TABLE MST_PAY_ACT_D_ALL IS '支払実績明細 // Payment result details';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.PAY_ACT_D_NO IS '支払実績明細ＮＯ // #MA.PAY_ACT_D_NO // Payment result details No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.PAY_ACT_D_SEQ IS '支払実績明細連番 // #MA.SLIP_SEQ // Payment result details sequence number';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.PAY_ACT_NO IS '支払実績ＮＯ // #MA.PAY_ACT_NO // Payment result No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.PAY_ACT_SEQ IS '支払実績連番 // #MA.SLIP_SEQ // Payment result sequence No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.DISP_SEQ IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.AP_APPL_SCHD_NO IS '買掛消込予定ＮＯ // #MA.AP_APPL_SCHD_NO // AP reconciliation schedule No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.PAY_SCHD_NO IS '支払予定ＮＯ // #MA.PAY_SCHD_NO // Payment schedule No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.PAY_CHK_MNG_NO IS '支払照合管理ＮＯ // #MA.PAY_CHK_MNG_NO // Payment collation management No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.PAY_CHK_NO IS '支払照合ＮＯ // #MA.PAY_CHK_NO // Payment collation No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.CALC_TGT_PAY_CHK_MNG_NO IS '計算対象支払照合管理ＮＯ // #MA.PAY_CHK_MNG_NO // (Calculation) Payment collation management No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.AP_D_NO IS '買掛明細ＮＯ // #MA.AP_D_NO // AP details No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.AP_STTL_CD IS '債務決済方法ＣＤ // #MA.STTL_CD // AP settlement method cd.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.AP_STTL_TYP IS '債務決済区分 // #MA.AP_STTL_TYP // AP settlement type';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.BANK_AC_CD IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.PAY_BANK_AC_CD IS '支払先口座ＣＤ // #MA.BANK_AC_CD // Payee account cd.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.TRD_CUR_COM_PAID_TAX_CD IS '手数料税ＣＤ // #MA.TAX_CD // Fee tax cd.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.AP_SETOFF_TYP IS '相殺先区分 // #MA.AP_SETOFF_TYP // Offset destination type';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.SETOFF_CD IS '相殺先ＣＤ // #MA.BP_CD // Offset destination cd.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.SETOFF_NM IS '相殺先名 // #MA.BP_NM // Offset destination name';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.SO_DPT_CD IS '相殺部門ＣＤ // #MA.DPT_CD // Offset dept. cd.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.TRD_CUR_COM_PAID_TAX_AMT IS '取引通貨手数料税額 // #MA.MONEY // Fee tax amount (Transaction currency)';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.TRD_CUR_EXC_COM_PAID IS '取引通貨手数料税抜額 // #MA.MONEY // Fee amount without tax (Transaction currency)';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.BASE_CUR_COM_PAID_TAX_AMT IS '基準通貨手数料税額 // #MA.MONEY // Fee tax amount (Base currency)';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.BASE_CUR_EXC_COM_PAID IS '基準通貨手数料税抜額 // #MA.MONEY // Fee without tax (Base currency)';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.RCV_NO IS '入金ＮＯ // #MA.RCV_NO // Payment received No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.ADV_PAY_ACT_NO IS '前渡金支払実績ＮＯ // #MA.PAY_ACT_NO // Advance payment amount payment result No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.BSPPL_CD IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.BSPPL_DPT_CD IS '支払予定管理先担当部門ＣＤ // #MA.DPT_CD // Cd. of dept. in charge of scheduled payee';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.ASPPL_CD IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.AP_DPT_CD IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.PURC_ACT_NO IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.RCPT_IV_MNG_NO IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.AP_TYP IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.PAY_NTC_D_PRINT_RMRKS IS '支払通知書明細備考 // #MS.PAY_NTC_D_PRINT_RMRKS // Payment notice details remarks';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.INTR_D_RMRKS IS '内部明細備考 // #MS.PAY_ACT_D_INTR_RMRKS // Internal details remarks';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.PAR_PAY_ACT_D_NO IS '親支払実績明細ＮＯ // #MA.PAY_ACT_NO // Parent payment result details No.';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.PAR_PAY_ACT_D_SEQ IS '親支払実績明細連番 // #MA.SLIP_SEQ // Parent payment result details sequence number';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.SUB_CHAR1 IS '予備１ // #MS.PAY_ACT_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.SUB_CHAR2 IS '予備２ // #MS.PAY_ACT_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.SUB_CHAR3 IS '予備３ // #MS.PAY_ACT_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PAY_ACT_D_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

