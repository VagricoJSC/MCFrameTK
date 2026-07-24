
COMMENT ON TABLE MST_PO IS '発注ヘッダ // PO header';


COMMENT ON COLUMN MST_PO.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MST_PO.PO_REV IS '発注改訂番号 // #MA.SLIP_REV // PO rev. number';


COMMENT ON COLUMN MST_PO.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_PO.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_PO.PURC_DPT_CD IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN MST_PO.WG_CD IS 'ＷＧ ＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_PO.PURC_USR_CD IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN MST_PO.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_PO.SPPL_CNTCT_DPT IS '発注先部署 // #MA.BP_CNTCT_DPT // Supplier dept.';


COMMENT ON COLUMN MST_PO.SPPL_CNTCT_PSN IS '発注先担当者 // #MA.BP_CNTCT_PSN // Supplier PIC';


COMMENT ON COLUMN MST_PO.SPPL_ZIP_CD IS '発注先郵便番号 // #MA.ZIP_CD // Supplier zip code';


COMMENT ON COLUMN MST_PO.SPPL_ADDR1 IS '発注先住所１ // #MA.ADDR // Supplier address 1';


COMMENT ON COLUMN MST_PO.SPPL_ADDR2 IS '発注先住所２ // #MA.ADDR // Supplier address 2';


COMMENT ON COLUMN MST_PO.SPPL_ADDR3 IS '発注先住所３ // #MA.ADDR // Supplier address 3';


COMMENT ON COLUMN MST_PO.SPPL_ADDR4 IS '発注先住所４ // #MA.ADDR // Supplier address 4';


COMMENT ON COLUMN MST_PO.SPPL_TEL IS '発注先ＴＥＬ // #MA.TEL // Supplier TEL';


COMMENT ON COLUMN MST_PO.SPPL_FAX IS '発注先ＦＡＸ // #MA.TEL // Supplier FAX';


COMMENT ON COLUMN MST_PO.PO_DT IS '発注日 // #MA.DT // PO date';


COMMENT ON COLUMN MST_PO.UPD_PO_PRINT_SCHD_DT IS '変更注文書発行予定日 // #MA.DT // Scheduled change PO sheet issue date after change';


COMMENT ON COLUMN MST_PO.PO_PRINT_DT IS '注文書発行日時 // #MA.TM // PO sheet issue date and time';


COMMENT ON COLUMN MST_PO.PO_PRINT_FLG IS '注文書発行済ＦＬＧ // #MA.FLG // PO sheet issued flg.';


COMMENT ON COLUMN MST_PO.LAST_PO_REV IS '最新発注改訂番号 // #MA.SLIP_REV // Latest PO rev. number';


COMMENT ON COLUMN MST_PO.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_PO.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_PO.XRATE_INPT_FLG IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN MST_PO.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MST_PO.PTAX_XRATE_INPT_FLG IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN MST_PO.CRCT_RSN_CD IS '訂正理由ＣＤ // #MS.PO_CRCT_RSN_CD // Correction reason cd.';


COMMENT ON COLUMN MST_PO.PO_PRINT_CD IS '注文書表示ＣＤ // #MA.PO_PRINT_CD // Display PO sheet cd.';


COMMENT ON COLUMN MST_PO.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_PO.TTERM_CD1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN MST_PO.TTERM_RMRKS1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN MST_PO.TTERM_CD2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN MST_PO.TTERM_RMRKS2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN MST_PO.TTERM_CD3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN MST_PO.TTERM_RMRKS3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN MST_PO.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_PO.EDI_FLG IS 'ＥＤＩ　ＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN MST_PO.APRV_FLG IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN MST_PO.APRV_NO IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN MST_PO.APRV_STS_TYP IS '承認状況区分 // #MA.APRV_STS_TYP // Approval status type';


COMMENT ON COLUMN MST_PO.PURC_IF_FLG IS '購買ＩＦ　ＦＬＧ // #MA.FLG // Purchasing IF flg.';


COMMENT ON COLUMN MST_PO.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_PO.EXT_PO_NO IS '外部発注ＮＯ // #MA.EXT_PO_NO // External PO No.';


COMMENT ON COLUMN MST_PO.DLV_SLIP_FORM_CD IS '伝票帳票ＣＤ // #MA.SLIP_FORM_CD // Slip report cd.';


COMMENT ON COLUMN MST_PO.SGL_FORM_FLG IS '単票ＦＬＧ // #MA.FLG // Single slip flg.';


COMMENT ON COLUMN MST_PO.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_PO.INTR_RMRKS IS '内部備考 // #MS.PO_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_PO.PO_PRINT_RMRKS IS '注文書備考 // #MS.PO_PRINT_RMRKS // PO sheet remarks';


COMMENT ON COLUMN MST_PO.DLV_SLIP_RMRKS IS '納品書備考 // #MA.TRD_RMRKS // Delivery note remarks';


COMMENT ON COLUMN MST_PO.SUB_CHAR1 IS '予備１ // #MS.PO_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_PO.SUB_CHAR2 IS '予備２ // #MS.PO_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_PO.SUB_CHAR3 IS '予備３ // #MS.PO_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_PO.EDI_SUB_CHAR1 IS 'ＥＤＩ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI spare CHAR column 1';


COMMENT ON COLUMN MST_PO.EDI_SUB_CHAR2 IS 'ＥＤＩ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI spare CHAR column 2';


COMMENT ON COLUMN MST_PO.EDI_SUB_CHAR3 IS 'ＥＤＩ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI spare CHAR column 3';


COMMENT ON COLUMN MST_PO.EDI_SUB_CHAR4 IS 'ＥＤＩ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI spare CHAR column 4';


COMMENT ON COLUMN MST_PO.EDI_SUB_CHAR5 IS 'ＥＤＩ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI spare CHAR column 5';


COMMENT ON COLUMN MST_PO.EDI_SUB_NUM1 IS 'ＥＤＩ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI spare NUM column 1';


COMMENT ON COLUMN MST_PO.EDI_SUB_DT1 IS 'ＥＤＩ予備ＤＡＴＥ項目１ // #MA.DT // EDI spare DATE column 1';


COMMENT ON COLUMN MST_PO.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PO.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PO.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PO.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PO.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PO.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PO.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PO.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PO.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PO.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

