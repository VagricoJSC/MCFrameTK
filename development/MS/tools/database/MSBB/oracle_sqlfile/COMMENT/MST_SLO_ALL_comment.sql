
COMMENT ON TABLE MST_SLO_ALL IS '受注ヘッダ // Sales order header';


COMMENT ON COLUMN MST_SLO_ALL.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MST_SLO_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_SLO_ALL.SLO_REV IS '受注改訂番号 // #MA.SLIP_REV // Sales order rev. number';


COMMENT ON COLUMN MST_SLO_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_SLO_ALL.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_SLO_ALL.SLO_DT IS '受注日 // #MA.DT // Sales order date';


COMMENT ON COLUMN MST_SLO_ALL.SLO_TYP IS '受注区分 // #MS.SLO_TYP // Sales order type';


COMMENT ON COLUMN MST_SLO_ALL.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_SLO_ALL.CST_PO_NO IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN MST_SLO_ALL.CST_PO_REV IS '得意先注文改訂番号 // #MA.SLIP_REV // Customer order rev. number';


COMMENT ON COLUMN MST_SLO_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_SLO_ALL.XRATE_INPT_FLG IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN MST_SLO_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_SLO_ALL.PTAX_XRATE_INPT_FLG IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN MST_SLO_ALL.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MST_SLO_ALL.SLS_USR_CD IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN MST_SLO_ALL.SLS_DPT_CD IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MST_SLO_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_SLO_ALL.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_SLO_ALL.TTERM_CD1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN MST_SLO_ALL.TTERM_RMRKS1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN MST_SLO_ALL.TTERM_CD2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN MST_SLO_ALL.TTERM_RMRKS2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN MST_SLO_ALL.TTERM_CD3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN MST_SLO_ALL.TTERM_RMRKS3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN MST_SLO_ALL.TRNSPT_CD IS '輸送方法ＣＤ // #MA.TRNSPT_CD // Transportation method cd.';


COMMENT ON COLUMN MST_SLO_ALL.VSSL_FLGHT IS '船名／便名 // #MA.VSSL_FLGHT // Ship/flight name';


COMMENT ON COLUMN MST_SLO_ALL.LOAD_PORT_CD IS '船積港ＣＤ // #MA.PORT_CD // Loading port cd.';


COMMENT ON COLUMN MST_SLO_ALL.ETD_DT IS '船積予定日 // #MA.DT // Estimated date of loading';


COMMENT ON COLUMN MST_SLO_ALL.DSCHRG_PORT_CD IS '船卸港ＣＤ // #MA.PORT_CD // Unloading port cd.';


COMMENT ON COLUMN MST_SLO_ALL.ETA_DT IS '船卸予定日 // #MA.DT // Estimated date of unloading';


COMMENT ON COLUMN MST_SLO_ALL.VIA_PORT_CD IS '経由地ＣＤ // #MA.PORT_CD // Stopover point cd.';


COMMENT ON COLUMN MST_SLO_ALL.VIA_SCHD_DT IS '経由予定日 // #MA.DT // Estimated stopover date';


COMMENT ON COLUMN MST_SLO_ALL.ASSORT_TYP IS '品揃区分 // #MS.SHIP_ASSORT_TYP // Assortment type';


COMMENT ON COLUMN MST_SLO_ALL.SLS_BASIS_TYP IS '売上計上区分 // #MA.SLS_BASIS_TYP // Revenue recording type';


COMMENT ON COLUMN MST_SLO_ALL.AR_DPT_CD IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN MST_SLO_ALL.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_SLO_ALL.RCPT_DT IS '受付日 // #MA.DT // Receiving date';


COMMENT ON COLUMN MST_SLO_ALL.RCPT_USR_CD IS '受付担当者ＣＤ // #MA.USR_CD // Receiving PIC cd.';


COMMENT ON COLUMN MST_SLO_ALL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_SLO_ALL.INTR_RMRKS IS '内部備考 // #MS.SLO_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_SLO_ALL.CST_PO_RMRKS IS '得意先注文備考 // #MS.CST_PO_RMRKS // Customer order remarks';


COMMENT ON COLUMN MST_SLO_ALL.QTN_NO IS '見積ＮＯ // #MA.QTN_NO // Quotation No.';


COMMENT ON COLUMN MST_SLO_ALL.QTN_REV IS '見積改訂番号 // #MA.SLIP_REV // Quotation rev. number';


COMMENT ON COLUMN MST_SLO_ALL.ADV_SHIP_CTRL_TYP IS '前受金出荷制御区分 // #MS.ADV_SHIP_CTRL_TYP // Advance received control shipping type';


COMMENT ON COLUMN MST_SLO_ALL.ADV_BILL_AMT IS '前受金請求額 // #MA.MONEY // Advance received billing amount';


COMMENT ON COLUMN MST_SLO_ALL.ADV_RCV_AMT IS '前受金入金額 // #MA.MONEY // Advance received payment amount';


COMMENT ON COLUMN MST_SLO_ALL.SUB_CHAR1 IS '予備１ // #MS.SLO_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_SLO_ALL.SUB_CHAR2 IS '予備２ // #MS.SLO_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_SLO_ALL.SUB_CHAR3 IS '予備３ // #MS.SLO_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_SLO_ALL.APRV_FLG IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN MST_SLO_ALL.APRV_NO IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN MST_SLO_ALL.APRV_STS_TYP IS '承認状況区分 // #MA.APRV_STS_TYP // Approval status type';


COMMENT ON COLUMN MST_SLO_ALL.EDI_FLG IS 'ＥＤＩ ＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN MST_SLO_ALL.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_SLO_ALL.CAN_RSN_CD IS '取消理由ＣＤ // #MS.SLO_RSN_CD // Canceling reason cd.';


COMMENT ON COLUMN MST_SLO_ALL.CAN_RMRKS IS '取消備考 // #MS.SLO_CAN_RMRKS // Cancel remarks';


COMMENT ON COLUMN MST_SLO_ALL.CRED_UPD_AMT IS '与信更新金額 // #MA.MONEY // Credit update amount';


COMMENT ON COLUMN MST_SLO_ALL.EDI_SUB_CHAR1 IS 'ＥＤＩ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI spare CHAR column 1';


COMMENT ON COLUMN MST_SLO_ALL.EDI_SUB_CHAR2 IS 'ＥＤＩ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI spare CHAR column 2';


COMMENT ON COLUMN MST_SLO_ALL.EDI_SUB_CHAR3 IS 'ＥＤＩ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI spare CHAR column 3';


COMMENT ON COLUMN MST_SLO_ALL.EDI_SUB_CHAR4 IS 'ＥＤＩ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI spare CHAR column 4';


COMMENT ON COLUMN MST_SLO_ALL.EDI_SUB_CHAR5 IS 'ＥＤＩ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI spare CHAR column 5';


COMMENT ON COLUMN MST_SLO_ALL.EDI_SUB_NUM1 IS 'ＥＤＩ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI spare NUM column 1';


COMMENT ON COLUMN MST_SLO_ALL.EDI_SUB_DT1 IS 'ＥＤＩ予備ＤＡＴＥ項目１ // #MA.DT // EDI spare DATE column 1';


COMMENT ON COLUMN MST_SLO_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SLO_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SLO_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SLO_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SLO_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SLO_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SLO_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SLO_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SLO_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SLO_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

