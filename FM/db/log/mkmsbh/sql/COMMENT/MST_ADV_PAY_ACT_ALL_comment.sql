
COMMENT ON TABLE MST_ADV_PAY_ACT_ALL IS '前渡金実績 // Advance payment result';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.ADV_PAY_ACT_NO IS '前渡金実績ＮＯ // #MA.PAY_ACT_NO // Advance payment result No.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.ADV_PAY_ACT_SEQ IS '前渡金実績連番 // #MA.SLIP_SEQ // Advance payment result sequence number';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.ADV_PAY_ACT_REV IS '前渡金実績改訂番号 // #MA.SLIP_REV // Advance payment result revision number';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.SLIP_STS_TYP IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.PSPPL_CD IS '支払先ＣＤ // #MA.BP_CD // Payee cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.BSPPL_CD IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.BSPPL_DPT_CD IS '支払予定管理先担当部門ＣＤ // #MA.DPT_CD // Cd. of dept. in charge of scheduled payee';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.PAY_DPT_CD IS '支払部門ＣＤ // #MA.DPT_CD // Payment dept. cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.PAY_USR_CD IS '支払担当者ＣＤ // #MA.USR_CD // Payment PIC cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.PAY_ACT_DT IS '支払実績日 // #MA.DT // Actual payment date';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.AP_STTL_CD IS '債務決済方法ＣＤ // #MA.STTL_CD // AP settlement method cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.AP_STTL_TYP IS '債務決済区分 // #MA.AP_STTL_TYP // AP settlement type';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.COM_PAID_AP_STTL_CD IS '手数料債務決済方法ＣＤ // #MA.STTL_CD // Fee AP settlement method cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.COM_PAID_AP_STTL_TYP IS '手数料債務決済区分 // #MA.AP_STTL_TYP // Fee AP settlement type';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.COM_PAID_AC_RSN_CD IS '手数料会計理由ＣＤ // #MA.AC_RSN_CD // Fee accounting reason cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.TRD_CUR_COM_PAID_TAX_CD IS '手数料税ＣＤ // #MA.TAX_CD // Fee tax cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.BANK_AC_CD IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.PAY_BANK_AC_CD IS '支払先口座ＣＤ // #MA.BANK_AC_CD // Payee account cd.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.TRD_CUR_COM_PAID IS '取引通貨手数料金額 // #MA.MONEY // Fee amount (Transaction currency)';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.TRD_CUR_COM_PAID_TAX_AMT IS '取引通貨手数料税額 // #MA.MONEY // Fee tax amount (Transaction currency)';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.TRD_CUR_EXC_COM_PAID IS '取引通貨手数料税抜額 // #MA.MONEY // Fee amount without tax (Transaction currency)';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.TRD_CUR_SETOFF_TGT_AMT IS '取引通貨相殺対象額 // #MA.MONEY // Offset target amount (Transaction currency)';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.TRD_CUR_SETOFF_SCHD_AMT IS '取引通貨相殺予定額 // #MA.MONEY // Offset schedule amount (Transaction currency)';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.TRD_CUR_SETOFF_ACT_AMT IS '取引通貨相殺実績額 // #MA.MONEY // Offset result amount (Transaction currency)';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.TRD_CUR_NOT_PROC_BAL IS '取引通貨未処理残高 // #MA.MONEY // Unreconciled balance (Transaction currency)';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.BASE_CUR_COM_PAID IS '基準通貨手数料金額 // #MA.MONEY // Fee (Base currency)';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.BASE_CUR_COM_PAID_TAX_AMT IS '基準通貨手数料税額 // #MA.MONEY // Fee tax amount (Base currency)';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.BASE_CUR_EXC_COM_PAID IS '基準通貨手数料税抜額 // #MA.MONEY // Fee without tax (Base currency)';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.BASE_CUR_SETOFF_TGT_AMT IS '基準通貨相殺対象額 // #MA.MONEY // Offset amount (Base currency)';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.PAY_CHK_MNG_NO IS '支払照合管理ＮＯ // #MA.PAY_CHK_MNG_NO // Payment collation management No.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.PAY_NTC_ADV_PAY_FLG IS '支払通知書前渡金表示ＦＬＧ // #MA.FLG // Display advance payment on payment notice flg.';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.INTR_RMRKS IS '内部備考 // #MS.ADV_PAY_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.SUB_CHAR1 IS '予備１ // #MS.ADV_PAY_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.SUB_CHAR2 IS '予備２ // #MS.ADV_PAY_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.SUB_CHAR3 IS '予備３ // #MS.ADV_PAY_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_ADV_PAY_ACT_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

