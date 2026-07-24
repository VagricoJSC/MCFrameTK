
COMMENT ON TABLE MST_RCV_RECV_IF IS '入金受信ＩＦ // Payment received import IF';


COMMENT ON COLUMN MST_RCV_RECV_IF.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MST_RCV_RECV_IF.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_RCV_RECV_IF.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MST_RCV_RECV_IF.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_RCV_RECV_IF.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.EXT_DATA_NO IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN MST_RCV_RECV_IF.EXT_DATA_LNO IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN MST_RCV_RECV_IF.DATA_MAKE_DT IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN MST_RCV_RECV_IF.IMP_FLG IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN MST_RCV_RECV_IF.RECV_DT IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN MST_RCV_RECV_IF.EXT_RCV_NO IS '外部入金ＮＯ // #MA.EXT_RCV_NO // External payment received No.';


COMMENT ON COLUMN MST_RCV_RECV_IF.RCST_CD IS '入金先ＣＤ // #MA.BP_CD // Payer cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_RCST_CD IS 'ＩＦ入金先ＣＤ // #MA.IF_EXT_SYS_CD // IF payer cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_RCST_NM IS 'ＩＦ入金先名 // #MA.IF_EXT_SYS_NM // IF payer name';


COMMENT ON COLUMN MST_RCV_RECV_IF.BCST_CD IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_BCST_CD IS 'ＩＦ請求先ＣＤ // #MA.IF_EXT_SYS_CD // IF billing customer cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_BCST_NM IS 'ＩＦ請求先名 // #MA.IF_EXT_SYS_NM // IF billing customer name';


COMMENT ON COLUMN MST_RCV_RECV_IF.BILL_DPT_CD IS '請求部門ＣＤ // #MA.DPT_CD // Billing dept. cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_BILL_DPT_CD IS 'ＩＦ請求部門ＣＤ // #MA.IF_EXT_SYS_CD // IF billing dept. cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_BILL_DPT_NM IS 'ＩＦ請求部門名 // #MA.IF_EXT_SYS_NM // IF billing dept. name';


COMMENT ON COLUMN MST_RCV_RECV_IF.RCV_DPT_CD IS '入金部門ＣＤ // #MA.DPT_CD // Payment receiving dept. cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_RCV_DPT_CD IS 'ＩＦ入金部門ＣＤ // #MA.IF_EXT_SYS_CD // IF payment receiving dept. cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_RCV_DPT_NM IS 'ＩＦ入金部門名 // #MA.IF_EXT_SYS_NM // IF payment receiving dept. name';


COMMENT ON COLUMN MST_RCV_RECV_IF.RCV_USR_CD IS '入金担当者ＣＤ // #MA.USR_CD // Payment received PIC cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_RCV_USR_CD IS 'ＩＦ入金担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF payment received PIC cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_RCV_USR_NM IS 'ＩＦ入金担当者名 // #MA.IF_EXT_SYS_NM // IF payment received PIC name';


COMMENT ON COLUMN MST_RCV_RECV_IF.RCV_DT IS '入金日 // #MA.DT // Payment received date';


COMMENT ON COLUMN MST_RCV_RECV_IF.AR_STTL_TYP IS '債権決済区分 // #MA.AR_STTL_TYP // AR settlement type';


COMMENT ON COLUMN MST_RCV_RECV_IF.BANK_CD IS '銀行ＣＤ // #MA.BANK_CD // Bank cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_BANK_CD IS 'ＩＦ銀行ＣＤ // #MA.IF_EXT_SYS_CD // IF bank cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_BANK_NM IS 'ＩＦ銀行名 // #MA.IF_EXT_SYS_NM // IF bank name';


COMMENT ON COLUMN MST_RCV_RECV_IF.RCV_MTD_CD IS '入金方法ＣＤ // #MA.STTL_CD // Payment received method cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_RCV_MTD_CD IS 'ＩＦ入金方法ＣＤ // #MA.IF_EXT_SYS_CD // IF payment received method cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_RCV_MTD_NM IS 'ＩＦ入金方法名 // #MA.IF_EXT_SYS_NM // IF payment received method name';


COMMENT ON COLUMN MST_RCV_RECV_IF.BANK_AC_CD IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_BANK_AC_CD IS 'ＩＦ口座ＣＤ // #MA.IF_EXT_SYS_CD // IF bank account cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_BANK_AC_NM IS 'ＩＦ口座名 // #MA.IF_EXT_SYS_NM // IF bank account name';


COMMENT ON COLUMN MST_RCV_RECV_IF.XFR_PSN IS '振込人名 // #MA.XFR_PSN // Payment person name';


COMMENT ON COLUMN MST_RCV_RECV_IF.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_TRD_CUR_CD IS 'ＩＦ取引通貨ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction currency cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_TRD_CUR_NM IS 'ＩＦ取引通貨名 // #MA.IF_EXT_SYS_NM // IF transaction currency name';


COMMENT ON COLUMN MST_RCV_RECV_IF.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_RCV_RECV_IF.RCV_AMT IS '入金額 // #MA.MONEY // Payment received amount';


COMMENT ON COLUMN MST_RCV_RECV_IF.COM_PAID IS '振込手数料 // #MA.MONEY // Transfer fee';


COMMENT ON COLUMN MST_RCV_RECV_IF.RCV_RMRKS IS '入金備考 // #MS.RCV_RMRKS // Payment received remarks';


COMMENT ON COLUMN MST_RCV_RECV_IF.NOTE_NO IS '手形番号 // #MA.NOTE_NO // Note number';


COMMENT ON COLUMN MST_RCV_RECV_IF.NOTE_TYP IS '手形区分 // #MA.NOTE_TYP // Note type';


COMMENT ON COLUMN MST_RCV_RECV_IF.DRAW_DT IS '振出日 // #MA.DT // Drawing date';


COMMENT ON COLUMN MST_RCV_RECV_IF.DUE_DT IS '支払期日 // #MA.DT // Payment due date';


COMMENT ON COLUMN MST_RCV_RECV_IF.DRAWER_NM IS '振出人名 // #MA.DRAWER_NM // Drawer name';


COMMENT ON COLUMN MST_RCV_RECV_IF.ENDRSR IS '裏書人 // #MA.NOTE_ENDRSR // Endorser';


COMMENT ON COLUMN MST_RCV_RECV_IF.ACCPTR IS '引受人 // #MA.NOTE_ACCPTR // Accepted by';


COMMENT ON COLUMN MST_RCV_RECV_IF.NOTE_RSN_CD IS '手形理由ＣＤ // #MA.NOTE_RSN_CD // Note reason cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_NOTE_RSN_CD IS 'ＩＦ手形理由ＣＤ // #MA.IF_EXT_SYS_CD // IF note reason cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_NOTE_RSN_NM IS 'ＩＦ手形理由名 // #MA.IF_EXT_SYS_NM // IF note reason name';


COMMENT ON COLUMN MST_RCV_RECV_IF.DRAW_BANK_CD IS '振出銀行 // #MA.BANK_CD // Drawing bank';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_DRAW_BANK_CD IS 'ＩＦ振出銀行ＣＤ // #MA.IF_EXT_SYS_CD // IF drawing bank cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_DRAW_BANK_NM IS 'ＩＦ振出銀行名 // #MA.IF_EXT_SYS_NM // IF drawing bank name';


COMMENT ON COLUMN MST_RCV_RECV_IF.DRAW_BRANCH_CD IS '振出支店 // #MA.BANK_BRANCH_CD // Drawing branch';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_DRAW_BRANCH_CD IS 'ＩＦ振出支店ＣＤ // #MA.IF_EXT_SYS_CD // IF drawing branch cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_DRAW_BRANCH_NM IS 'ＩＦ振出支店名 // #MA.IF_EXT_SYS_NM // IF drawing branch name';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_CO_CD IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN MST_RCV_RECV_IF.IF_CO_NM IS 'ＩＦ会社名 // #MA.IF_EXT_SYS_NM // IF company name';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MST_RCV_RECV_IF.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MST_RCV_RECV_IF.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_RCV_RECV_IF.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_RCV_RECV_IF.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_RCV_RECV_IF.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_RCV_RECV_IF.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_RCV_RECV_IF.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_RCV_RECV_IF.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_RCV_RECV_IF.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_RCV_RECV_IF.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_RCV_RECV_IF.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_RCV_RECV_IF.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_RCV_RECV_IF.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_RCV_RECV_IF.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

