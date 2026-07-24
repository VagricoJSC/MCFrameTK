
COMMENT ON TABLE MST_RCV_ACT IS '入金実績ヘッダ // Payment received result header';


COMMENT ON COLUMN MST_RCV_ACT.RCV_ACT_NO IS '入金実績ＮＯ // #MA.RCV_ACT_NO // Payment received result No.';


COMMENT ON COLUMN MST_RCV_ACT.RCV_ACT_SEQ IS '入金実績連番 // #MA.SLIP_SEQ // Payment received result sequence number';


COMMENT ON COLUMN MST_RCV_ACT.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_RCV_ACT.RCV_ACT_REV IS '入金実績改訂番号 // #MA.SLIP_REV // Payment received result rev. number';


COMMENT ON COLUMN MST_RCV_ACT.AR_TRD_GRP_TYP IS '債権取引グループ区分 // #MA.AR_TRD_GRP_TYP // AR transaction group type';


COMMENT ON COLUMN MST_RCV_ACT.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_RCV_ACT.RCV_NO IS '入金ＮＯ // #MA.RCV_NO // Payment received No.';


COMMENT ON COLUMN MST_RCV_ACT.DPT_CD IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN MST_RCV_ACT.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_RCV_ACT.USR_CD IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN MST_RCV_ACT.RCST_CD IS '入金先ＣＤ // #MA.BP_CD // Payer cd.';


COMMENT ON COLUMN MST_RCV_ACT.BCST_CD IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN MST_RCV_ACT.BILL_DPT_CD IS '請求部門ＣＤ // #MA.DPT_CD // Billing dept. cd.';


COMMENT ON COLUMN MST_RCV_ACT.CRED_CD IS '与信管理先ＣＤ // #MA.BP_CD // Credit managed BP cd.';


COMMENT ON COLUMN MST_RCV_ACT.RCV_DT IS '入金日 // #MA.DT // Payment received date';


COMMENT ON COLUMN MST_RCV_ACT.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_RCV_ACT.BILL_BASIS_DT IS '請求起算日 // #MA.DT // Billing base date';


COMMENT ON COLUMN MST_RCV_ACT.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MST_RCV_ACT.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_RCV_ACT.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MST_RCV_ACT.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MST_RCV_ACT.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_RCV_ACT.TRD_AC_RSN_CD IS '取引会計理由ＣＤ // #MA.AC_RSN_CD // Transaction accounting reason cd.';


COMMENT ON COLUMN MST_RCV_ACT.AR_STTL_CD1 IS '債権決済方法ＣＤ１ // #MA.STTL_CD // AR settlement method cd. 1';


COMMENT ON COLUMN MST_RCV_ACT.AR_STTL_TYP1 IS '債権決済区分１ // #MA.AR_STTL_TYP // AR settlement type 1';


COMMENT ON COLUMN MST_RCV_ACT.AR_STTL_AC_RSN_CD1 IS '債権決済会計理由ＣＤ１ // #MA.AC_RSN_CD // AR settlement accounting reason cd. 1';


COMMENT ON COLUMN MST_RCV_ACT.TAX_CD1 IS '税ＣＤ１ // #MA.TAX_CD // Tax cd. 1';


COMMENT ON COLUMN MST_RCV_ACT.BANK_AC_CD IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN MST_RCV_ACT.XFR_PSN IS '振込人名 // #MA.XFR_PSN // Payment person name';


COMMENT ON COLUMN MST_RCV_ACT.NOTE_MNG_NO IS '手形管理ＮＯ // #MA.NOTE_MNG_NO // Note management No.';


COMMENT ON COLUMN MST_RCV_ACT.NOTE_NO IS '手形番号 // #MA.NOTE_NO // Note number';


COMMENT ON COLUMN MST_RCV_ACT.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_RCV_ACT.DEBT_CRED_ID_TYP IS '債権債務先識別区分 // #MA.DEBT_CRED_ID_TYP // AR/AP BP identification type';


COMMENT ON COLUMN MST_RCV_ACT.DEBT_CRED_ID_CD IS '債権債務先識別ＣＤ // #MA.BP_CD // AR/AP identification cd.';


COMMENT ON COLUMN MST_RCV_ACT.DEBT_CRED_NM IS '債権債務先名 // #MA.BP_NM // AR/AP BP name';


COMMENT ON COLUMN MST_RCV_ACT.AR_STTL_CD2 IS '債権決済方法ＣＤ２ // #MA.STTL_CD // AR settlement method cd. 2';


COMMENT ON COLUMN MST_RCV_ACT.AR_STTL_TYP2 IS '債権決済区分２ // #MA.AR_STTL_TYP // AR settlement type 2';


COMMENT ON COLUMN MST_RCV_ACT.AR_STTL_AC_RSN_CD2 IS '債権決済会計理由ＣＤ２ // #MA.AC_RSN_CD // AR settlement accounting reason cd. 2';


COMMENT ON COLUMN MST_RCV_ACT.TAX_CD2 IS '税ＣＤ２ // #MA.TAX_CD // Tax cd. 2';


COMMENT ON COLUMN MST_RCV_ACT.AR_STTL_CD3 IS '債権決済方法ＣＤ３ // #MA.STTL_CD // AR settlement method cd. 3';


COMMENT ON COLUMN MST_RCV_ACT.AR_STTL_TYP3 IS '債権決済区分３ // #MA.AR_STTL_TYP // AR settlement type 3';


COMMENT ON COLUMN MST_RCV_ACT.AR_STTL_AC_RSN_CD3 IS '債権決済会計理由ＣＤ３ // #MA.AC_RSN_CD // AR settlement accounting reason cd. 3';


COMMENT ON COLUMN MST_RCV_ACT.TAX_CD3 IS '税ＣＤ３ // #MA.TAX_CD // Tax cd. 3';


COMMENT ON COLUMN MST_RCV_ACT.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_RCV_ACT.SUBTTL1 IS '金額小計１ // #MA.MONEY // Amount subtotal 1';


COMMENT ON COLUMN MST_RCV_ACT.SUBTTL2 IS '金額小計２ // #MA.MONEY // Amount subtotal 2';


COMMENT ON COLUMN MST_RCV_ACT.SUBTTL3 IS '金額小計３ // #MA.MONEY // Amount subtotal 3';


COMMENT ON COLUMN MST_RCV_ACT.TAX_AMT IS '内税額 // #MA.MONEY // Tax inclusive amount';


COMMENT ON COLUMN MST_RCV_ACT.TAX_SUBTTL1 IS '内税小計１ // #MA.MONEY // Tax inclusive subtotal 1';


COMMENT ON COLUMN MST_RCV_ACT.TAX_SUBTTL2 IS '内税小計２ // #MA.MONEY // Tax inclusive subtotal 2';


COMMENT ON COLUMN MST_RCV_ACT.TAX_SUBTTL3 IS '内税小計３ // #MA.MONEY // Tax inclusive subtotal 3';


COMMENT ON COLUMN MST_RCV_ACT.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_RCV_ACT.BASE_CUR_SUBTTL1 IS '基準通貨小計１ // #MA.MONEY // Subtotal 1 (Base currency)';


COMMENT ON COLUMN MST_RCV_ACT.BASE_CUR_SUBTTL2 IS '基準通貨小計２ // #MA.MONEY // Subtotal 2 (Base currency)';


COMMENT ON COLUMN MST_RCV_ACT.BASE_CUR_SUBTTL3 IS '基準通貨小計３ // #MA.MONEY // Subtotal 3 (Base currency)';


COMMENT ON COLUMN MST_RCV_ACT.BASE_CUR_TAX_AMT IS '基準通貨内税額 // #MA.MONEY // Tax inclusive amount (Base currency)';


COMMENT ON COLUMN MST_RCV_ACT.BASE_CUR_TAX_SUBTTL1 IS '基準通貨内税小計１ // #MA.MONEY // Tax inclusive subtotal 1 (Base currency)';


COMMENT ON COLUMN MST_RCV_ACT.BASE_CUR_TAX_SUBTTL2 IS '基準通貨内税小計２ // #MA.MONEY // Tax inclusive subtotal 2 (Base currency)';


COMMENT ON COLUMN MST_RCV_ACT.BASE_CUR_TAX_SUBTTL3 IS '基準通貨内税小計３ // #MA.MONEY // Tax inclusive subtotal 3 (Base currency)';


COMMENT ON COLUMN MST_RCV_ACT.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_RCV_ACT.SLIP_STS_TYP IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN MST_RCV_ACT.PAR_RCV_ACT_NO IS '親入金実績ＮＯ // #MA.RCV_ACT_NO // Parent incoming payment result No.';


COMMENT ON COLUMN MST_RCV_ACT.PAR_RCV_ACT_SEQ IS '親入金実績連番 // #MA.SLIP_SEQ // Parent incoming payment result sequence number';


COMMENT ON COLUMN MST_RCV_ACT.AR_SLIP_PRNT_TYP IS '債権伝票帳票区分 // #MS.AR_SLIP_PRNT_TYP // AR slip report type';


COMMENT ON COLUMN MST_RCV_ACT.RCV_AUTO_APPL_FLG IS '入金自動消込ＦＬＧ // #MA.FLG // Auto-reconciliation flg.';


COMMENT ON COLUMN MST_RCV_ACT.PRNT_FLG IS '発行済ＦＬＧ // #MA.FLG // Issued flg.';


COMMENT ON COLUMN MST_RCV_ACT.BILL_DTL_ADV_FLG IS '請求書前受金表示ＦＬＧ // #MA.FLG // Display advance received on invoice flg.';


COMMENT ON COLUMN MST_RCV_ACT.SUB_CHAR1 IS '予備１ // #MS.RCV_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_RCV_ACT.SUB_CHAR2 IS '予備２ // #MS.RCV_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_RCV_ACT.SUB_CHAR3 IS '予備３ // #MS.RCV_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_RCV_ACT.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_RCV_ACT.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_RCV_ACT.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_RCV_ACT.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_RCV_ACT.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_RCV_ACT.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_RCV_ACT.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_RCV_ACT.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_RCV_ACT.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_RCV_ACT.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

