
COMMENT ON TABLE MST_RCV_ACT_D IS '入金実績明細 // Payment received result details';


COMMENT ON COLUMN MST_RCV_ACT_D.RCV_ACT_D_NO IS '入金実績明細ＮＯ // #MA.RCV_ACT_D_NO // Payment received result details No.';


COMMENT ON COLUMN MST_RCV_ACT_D.RCV_ACT_D_SEQ IS '入金実績明細連番 // #MA.SLIP_SEQ // Payment received result details sequence number';


COMMENT ON COLUMN MST_RCV_ACT_D.RCV_ACT_NO IS '入金実績ＮＯ // #MA.RCV_ACT_NO // Payment received result No.';


COMMENT ON COLUMN MST_RCV_ACT_D.RCV_ACT_SEQ IS '入金実績連番 // #MA.SLIP_SEQ // Payment received result sequence number';


COMMENT ON COLUMN MST_RCV_ACT_D.DISP_SEQ IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN MST_RCV_ACT_D.BILL_MNG_NO IS '請求管理ＮＯ // #MA.BILL_MNG_NO // Billing management No.';


COMMENT ON COLUMN MST_RCV_ACT_D.BCST_CD IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN MST_RCV_ACT_D.BILL_DPT_CD IS '請求部門ＣＤ // #MA.DPT_CD // Billing dept. cd.';


COMMENT ON COLUMN MST_RCV_ACT_D.ACST_CD IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN MST_RCV_ACT_D.AR_DPT_CD IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN MST_RCV_ACT_D.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_RCV_ACT_D.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_RCV_ACT_D.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_RCV_ACT_D.AR_TYP IS '債権区分 // #MA.AR_TYP // AR type';


COMMENT ON COLUMN MST_RCV_ACT_D.AR_STTL_CD1 IS '債権決済方法ＣＤ１ // #MA.STTL_CD // AR settlement method cd. 1';


COMMENT ON COLUMN MST_RCV_ACT_D.AR_STTL_TYP1 IS '債権決済区分１ // #MA.AR_STTL_TYP // AR settlement type 1';


COMMENT ON COLUMN MST_RCV_ACT_D.TRD_CUR_AMT1 IS '取引通貨金額１ // #MA.MONEY // Amount 1 (Transaction currency)';


COMMENT ON COLUMN MST_RCV_ACT_D.TRD_CUR_TAX_AMT1 IS '取引通貨内税額１ // #MA.MONEY // Tax inclusive amount 1 (Transaction currency)';


COMMENT ON COLUMN MST_RCV_ACT_D.TRD_CUR_AMT2 IS '取引通貨金額２ // #MA.MONEY // Amount 2 (Transaction currency)';


COMMENT ON COLUMN MST_RCV_ACT_D.TRD_CUR_TAX_AMT2 IS '取引通貨内税額２ // #MA.MONEY // Tax inclusive amount 2 (Transaction currency)';


COMMENT ON COLUMN MST_RCV_ACT_D.TRD_CUR_AMT3 IS '取引通貨金額３ // #MA.MONEY // Amount 3 (Transaction currency)';


COMMENT ON COLUMN MST_RCV_ACT_D.TRD_CUR_TAX_AMT3 IS '取引通貨内税額３ // #MA.MONEY // Tax inclusive amount 3 (Transaction currency)';


COMMENT ON COLUMN MST_RCV_ACT_D.BASE_CUR_AMT1 IS '基準通貨金額１ // #MA.MONEY // Amount 1 (Base currency)';


COMMENT ON COLUMN MST_RCV_ACT_D.BASE_CUR_TAX_AMT1 IS '基準通貨内税額１ // #MA.MONEY // Tax inclusive amount 1 (Base currency)';


COMMENT ON COLUMN MST_RCV_ACT_D.BASE_CUR_AMT2 IS '基準通貨金額２ // #MA.MONEY // Amount 2 (Base currency)';


COMMENT ON COLUMN MST_RCV_ACT_D.BASE_CUR_TAX_AMT2 IS '基準通貨内税額２ // #MA.MONEY // Tax inclusive amount 2 (Base currency)';


COMMENT ON COLUMN MST_RCV_ACT_D.BASE_CUR_AMT3 IS '基準通貨金額３ // #MA.MONEY // Amount 3 (Base currency)';


COMMENT ON COLUMN MST_RCV_ACT_D.BASE_CUR_TAX_AMT3 IS '基準通貨内税額３ // #MA.MONEY // Tax inclusive amount 3 (Base currency)';


COMMENT ON COLUMN MST_RCV_ACT_D.TRD_XRATE IS '取引時為替レート // #MA.MONEY // Exchange rate at trading';


COMMENT ON COLUMN MST_RCV_ACT_D.GEN_RCV_NO IS '発生入金ＮＯ // #MA.RCV_NO // Source incoming payment result No.';


COMMENT ON COLUMN MST_RCV_ACT_D.BILL_D_RMRKS IS '請求書明細備考 // #MS.BILL_D_RMRKS // Invoice details remarks';


COMMENT ON COLUMN MST_RCV_ACT_D.SUB_CHAR1 IS '予備１ // #MS.RCV_ACT_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_RCV_ACT_D.SUB_CHAR2 IS '予備２ // #MS.RCV_ACT_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_RCV_ACT_D.SUB_CHAR3 IS '予備３ // #MS.RCV_ACT_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_RCV_ACT_D.APPL_CMPL_FLG IS '消込完了ＦＬＧ // #MA.FLG // Reconciled flg.';


COMMENT ON COLUMN MST_RCV_ACT_D.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_RCV_ACT_D.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_RCV_ACT_D.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_RCV_ACT_D.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_RCV_ACT_D.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_RCV_ACT_D.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_RCV_ACT_D.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_RCV_ACT_D.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_RCV_ACT_D.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_RCV_ACT_D.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

