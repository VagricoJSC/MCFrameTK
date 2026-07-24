
COMMENT ON TABLE MST_QTN_ALL IS '見積ヘッダ // Quotation header';


COMMENT ON COLUMN MST_QTN_ALL.QTN_NO IS '見積ＮＯ // #MA.QTN_NO // Quotation No.';


COMMENT ON COLUMN MST_QTN_ALL.QTN_REV IS '見積改訂番号 // #MA.SLIP_REV // Quotation rev. number';


COMMENT ON COLUMN MST_QTN_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_QTN_ALL.QTN_TYP IS '見積区分 // #MS.QTN_TYP // Quotation type';


COMMENT ON COLUMN MST_QTN_ALL.FAILURE_FLG IS '失注ＦＬＧ // #MA.FLG // Failed order flg.';


COMMENT ON COLUMN MST_QTN_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_QTN_ALL.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_QTN_ALL.QTN_DT IS '見積日 // #MA.DT // Quotation date';


COMMENT ON COLUMN MST_QTN_ALL.VALID_DT IS '有効期限 // #MA.DT // Expiration date';


COMMENT ON COLUMN MST_QTN_ALL.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_QTN_ALL.CST_SUNDRY_FLG IS '得意先諸口ＦＬＧ // #MA.FLG // Miscellaneous customer flg.';


COMMENT ON COLUMN MST_QTN_ALL.CST_NM IS '得意先名 // #MA.BP_NM // Customer name';


COMMENT ON COLUMN MST_QTN_ALL.CST_CNTCT_DPT IS '得意先部署 // #MA.BP_CNTCT_DPT // Customer dept.';


COMMENT ON COLUMN MST_QTN_ALL.CST_CNTCT_PSN IS '得意先担当者 // #MA.BP_CNTCT_PSN // Customer PIC';


COMMENT ON COLUMN MST_QTN_ALL.CST_ZIP_CD IS '得意先郵便番号 // #MA.ZIP_CD // Customer zip code';


COMMENT ON COLUMN MST_QTN_ALL.CST_ADDR1 IS '得意先住所１ // #MA.ADDR1 // Customer address 1';


COMMENT ON COLUMN MST_QTN_ALL.CST_ADDR2 IS '得意先住所２ // #MA.ADDR2 // Customer address 2';


COMMENT ON COLUMN MST_QTN_ALL.CST_ADDR3 IS '得意先住所３ // #MA.ADDR3 // Customer address 3';


COMMENT ON COLUMN MST_QTN_ALL.CST_ADDR4 IS '得意先住所４ // #MA.ADDR4 // Customer address 4';


COMMENT ON COLUMN MST_QTN_ALL.CST_TEL IS '得意先ＴＥＬ // #MA.TEL // Customer TEL';


COMMENT ON COLUMN MST_QTN_ALL.CST_FAX IS '得意先ＦＡＸ // #MA.TEL // Customer FAX';


COMMENT ON COLUMN MST_QTN_ALL.TTERM_CD1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN MST_QTN_ALL.TTERM_RMRKS1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN MST_QTN_ALL.TTERM_CD2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN MST_QTN_ALL.TTERM_RMRKS2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN MST_QTN_ALL.TTERM_CD3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN MST_QTN_ALL.TTERM_RMRKS3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN MST_QTN_ALL.TRNSPT_CD IS '輸送方法ＣＤ // #MA.TRNSPT_CD // Transportation method cd.';


COMMENT ON COLUMN MST_QTN_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_QTN_ALL.XRATE_INPT_FLG IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN MST_QTN_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_QTN_ALL.SLS_USR_CD IS '売上担当者 // #MA.USR_CD // Sales PIC';


COMMENT ON COLUMN MST_QTN_ALL.SLS_DPT_CD IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MST_QTN_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_QTN_ALL.QTN_RMRKS IS '見積備考 // #MS.QTN_RMRKS // Quotation remarks';


COMMENT ON COLUMN MST_QTN_ALL.INTR_RMRKS IS '内部備考 // #MS.QTN_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_QTN_ALL.QTN_TERM_CD IS '見積条件 // #MS.SLO_RSN_CD // Quotation terms';


COMMENT ON COLUMN MST_QTN_ALL.QTN_RSLT_RSN_CD IS '見積結果理由ＣＤ // #MS.SLO_RSN_CD // Quotation result reason cd.';


COMMENT ON COLUMN MST_QTN_ALL.QTN_RSLT_RSN_RMRKS IS '見積結果理由備考 // #MS.QTN_RSLT_RSN_RMRKS // Quotation result reason remarks';


COMMENT ON COLUMN MST_QTN_ALL.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_QTN_ALL.CST_QTN_RQST_NO IS '得意先見積依頼ＮＯ // #MA.CST_QTN_RQST_NO // Customer quotation request No.';


COMMENT ON COLUMN MST_QTN_ALL.RCPT_DT IS '受付日 // #MA.DT // Receiving date';


COMMENT ON COLUMN MST_QTN_ALL.RCPT_USR_CD IS '受付担当者ＣＤ // #MA.USR_CD // Receiving PIC cd.';


COMMENT ON COLUMN MST_QTN_ALL.APRV_FLG IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN MST_QTN_ALL.APRV_NO IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN MST_QTN_ALL.APRV_STS_TYP IS '承認状況区分 // #MA.APRV_STS_TYP // Approval status type';


COMMENT ON COLUMN MST_QTN_ALL.SUB_CHAR1 IS '予備１ // #MS.QTN_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_QTN_ALL.SUB_CHAR2 IS '予備２ // #MS.QTN_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_QTN_ALL.SUB_CHAR3 IS '予備３ // #MS.QTN_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_QTN_ALL.QTN_PRNT_FLG IS '見積書発行済ＦＬＧ // #MA.FLG // Quotation issued flg.';


COMMENT ON COLUMN MST_QTN_ALL.QTN_PRNT_SEQ IS '見積書連番 // #MA.PRNT_SEQ // Quotation sequence number';


COMMENT ON COLUMN MST_QTN_ALL.QTN_PRNT_DT IS '見積書発行日 // #MA.DT // Quotation issue date';


COMMENT ON COLUMN MST_QTN_ALL.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_QTN_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_QTN_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_QTN_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_QTN_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_QTN_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_QTN_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_QTN_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_QTN_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_QTN_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_QTN_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

