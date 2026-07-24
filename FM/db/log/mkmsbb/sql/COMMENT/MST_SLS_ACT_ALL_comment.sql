
COMMENT ON TABLE MST_SLS_ACT_ALL IS '売上実績ヘッダ // Sales result header';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SLS_ACT_NO IS '売上実績ＮＯ // #MA.SLS_ACT_NO // Sales result No.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SLS_ACT_SEQ IS '売上実績連番 // #MA.SLIP_SEQ // Sales result sequence number';


COMMENT ON COLUMN MST_SLS_ACT_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SLS_ACT_REV IS '売上実績改訂番号 // #MA.SLIP_REV // Sales result rev. number';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SLIP_STS_TYP IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN MST_SLS_ACT_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_SLS_ACT_ALL.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MST_SLS_ACT_ALL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SLS_DPT_CD IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SLS_USR_CD IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SLS_DT IS '売上日 // #MA.DT // Sales date';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SHIP_TM IS '出荷日時 // #MA.TM // Shipping date and time';


COMMENT ON COLUMN MST_SLS_ACT_ALL.DLV_TM IS '納品日時 // #MA.TM // Delivery date and time';


COMMENT ON COLUMN MST_SLS_ACT_ALL.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.REF_IV_NO IS '対応インボイスＮＯ // #MA.IV_NO // Corresponding I/V No.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.RCPT_IV_MNG_NO IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.TTERM_CD1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN MST_SLS_ACT_ALL.TTERM_RMRKS1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN MST_SLS_ACT_ALL.TTERM_CD2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN MST_SLS_ACT_ALL.TTERM_RMRKS2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN MST_SLS_ACT_ALL.TTERM_CD3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN MST_SLS_ACT_ALL.TTERM_RMRKS3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN MST_SLS_ACT_ALL.LC_NO IS 'Ｌ／ＣＮＯ // #MA.LC_NO // L/C No.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.LC_DT IS 'Ｌ／Ｃ日付 // #MA.DT // L/C Date';


COMMENT ON COLUMN MST_SLS_ACT_ALL.LC_RMRKS IS 'Ｌ／Ｃ備考 // #MS.LC_RMRKS // L/C remarks';


COMMENT ON COLUMN MST_SLS_ACT_ALL.RCV_SCHD_DT IS '入金予定日 // #MA.DT // Scheduled payment receipt date';


COMMENT ON COLUMN MST_SLS_ACT_ALL.BILL_BASIS_DT IS '請求起算日 // #MA.DT // Billing base date';


COMMENT ON COLUMN MST_SLS_ACT_ALL.CRED_CD IS '与信管理先ＣＤ // #MA.BP_CD // Credit managed BP cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.BCST_CD IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.ACST_CD IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.AR_DPT_CD IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.CST_PO_NO IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_SLS_ACT_ALL.PTAX_CUR_CD IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MST_SLS_ACT_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_SLS_ACT_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_SLS_ACT_ALL.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_SLS_ACT_ALL.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MST_SLS_ACT_ALL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_SLS_ACT_ALL.INTR_RMRKS IS '内部備考 // #MS.SLS_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SHIP_ACT_NO IS '出荷実績ＮＯ // #MA.SHIP_ACT_NO // Shipping result No.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SLS_RET_SCHD_NO IS '売上返品予定ＮＯ // #MA.SLS_RET_SCHD_NO // Sales return schedule No.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.QTN_NO IS '見積ＮＯ // #MA.QTN_NO // Quotation No.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.QTN_REV IS '見積改訂番号 // #MA.SLIP_REV // Quotation rev. number';


COMMENT ON COLUMN MST_SLS_ACT_ALL.DLV_SLIP_NO IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.DLV_SLIP_SEQ IS '納品書連番 // #MA.SLIP_SEQ // Delivery note sequence number';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SHIP_DLV_SLIP_NO IS '出荷時納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No. at shipping';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SLIP_FORM_CD IS '伝票帳票ＣＤ // #MA.SLIP_FORM_CD // Slip report cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.APRV_FLG IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.APRV_NO IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.APRV_STS_TYP IS '承認状況区分 // #MA.APRV_STS_TYP // Approval status type';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SLS_BASIS_TYP IS '売上計上区分 // #MA.SLS_BASIS_TYP // Revenue recording type';


COMMENT ON COLUMN MST_SLS_ACT_ALL.DDLV_SLS_FLG IS '直送売上ＦＬＧ // #MA.FLG // Direct-delivery sales flg.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SHIP_ACT_SYNC_FLG IS '出荷実績同時計上ＦＬＧ // #MA.FLG // Shipping result simultaneously recorded flg.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SHIP_LG_GRP_CD IS '出荷物流グループＣＤ // #MA.LG_GRP_CD // Shipping distribution group cd.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.ADJST_TGT_DT IS '調整対象日 // #MA.DT // Adjustment required date';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SLS_ADJST_TYP IS '売上調整区分 // #MS.SLS_ADJST_TYP // Sales adjustment type';


COMMENT ON COLUMN MST_SLS_ACT_ALL.ADJST_MTD_TYP IS '調整方法区分 // #MS.ADJST_MTD_TYP // Adjustment method type';


COMMENT ON COLUMN MST_SLS_ACT_ALL.EDI_FLG IS 'ＥＤＩＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SUB_CHAR1 IS '予備１ // #MS.SLS_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SUB_CHAR2 IS '予備２ // #MS.SLS_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_SLS_ACT_ALL.SUB_CHAR3 IS '予備３ // #MS.SLS_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_SLS_ACT_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SLS_ACT_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SLS_ACT_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SLS_ACT_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SLS_ACT_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SLS_ACT_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SLS_ACT_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SLS_ACT_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SLS_ACT_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SLS_ACT_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

