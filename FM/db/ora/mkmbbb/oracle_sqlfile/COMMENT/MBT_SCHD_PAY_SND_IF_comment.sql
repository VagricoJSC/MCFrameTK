
COMMENT ON TABLE MBT_SCHD_PAY_SND_IF IS '支払依頼送信ＩＦ // Payment request export IF';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.PROC_NO IS '処理ＮＯ // #MA.JNL_PROC_NO // Process No.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.PAY_AP_TYP IS '支払債務区分 // #MA.PAY_AP_TYP // Payment obligation type';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.AP_APPL_SCHD_NO IS '買掛消込予定ＮＯ // #MA.AP_APPL_SCHD_NO // AP reconciliation schedule No.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SLIP_CNT_ID IS '伝票グループＩＤ // #MA.SLIP_CNT_ID // Slip group ID';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.PAY_CHK_NO IS '支払照合ＮＯ // #MA.PAY_CHK_NO // Payment collation No.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.PAY_DPT_CD IS '支払部門ＣＤ // #MA.AC_DPT_CD // Payment dept. cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.BSPPL_DPT_CD IS '支払予定管理先部門ＣＤ // #MA.AC_DPT_CD // Scheduled payee dept. cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.AP_DPT_CD IS '債務部門ＣＤ // #MA.AC_DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_DPT_CD1 IS '予備部門ＣＤ１ // #MA.AC_DPT_CD // Spare dept. cd. 1';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_DPT_CD2 IS '予備部門ＣＤ２ // #MA.AC_DPT_CD // Spare dept. cd. 2';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_DPT_CD3 IS '予備部門ＣＤ３ // #MA.AC_DPT_CD // Spare dept. cd. 3';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.ASPPL_CD IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.BSPPL_CD IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.PSPPL_CD IS '支払先ＣＤ // #MA.BP_CD // Payee cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.AC_CD IS '勘定科目ＣＤ // #MA.AC_CD // Account cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_AC_CD IS '補助勘定科目ＣＤ // #MA.SUB_AC_CD // Subsidiary account cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.PROJECT_CD IS 'プロジェクトＣＤ // #MA.SUMMARY_CD // Project cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUMMARY_CD0 IS '集計ＣＤ０ // #MA.SUMMARY_CD // Aggregated cd. 0';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUMMARY_CD1 IS '集計ＣＤ１ // #MA.SUMMARY_CD // Aggregated cd. 1';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUMMARY_CD2 IS '集計ＣＤ２ // #MA.SUMMARY_CD // Aggregated cd. 2';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUMMARY_CD3 IS '集計ＣＤ３ // #MA.SUMMARY_CD // Aggregated cd. 3';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUMMARY_CD4 IS '集計ＣＤ４ // #MA.SUMMARY_CD // Aggregated cd. 4';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUMMARY_CD5 IS '集計ＣＤ５ // #MA.SUMMARY_CD // Aggregated cd. 5';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.PAY_SPOT_FLG IS '都度支払ＦＬＧ // #MA.FLG // Payment per transaction flg.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.PAY_SCHD_DT IS '支払予定日 // #MA.DT // Scheduled payment date';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.STTL_CD IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.AP_STTL_TYP IS '債務決済区分 // #MA.AP_STTL_TYP // AP settlement type';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.AP_TYP IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.BANK_AC_CD IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.PAY_BANK_AC_CD IS '支払先口座ＣＤ // #MA.BANK_AC_CD // Payee account cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.DRAWER_NM IS '振込人名 // #MA.DRAWER_NM // Payment person name';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.NOTE_NO IS '手形番号 // #MA.NOTE_NO // Note number';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.DUE_DT IS '手形満期日 // #MA.DT // Note expiration date';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.DRAW_DT IS '手形振出日 // #MA.DT // Note drawing date';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.RCV_BILL_NO IS '相手先請求書ＮＯ // #MA.RCV_BILL_NO // Counterpart invoice No.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.USR_CD IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.ABSTRACT1 IS '摘要１ // #MA.ABSTRACT_T // Abstract 1';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.ABSTRACT2 IS '摘要２ // #MA.ABSTRACT_T // Abstract 2';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR1 IS 'ＩＦ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // IF spare CHAR column 1';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR2 IS 'ＩＦ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // IF spare CHAR column 2';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR3 IS 'ＩＦ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // IF spare CHAR column 3';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR4 IS 'ＩＦ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // IF spare CHAR column 4';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR5 IS 'ＩＦ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // IF spare CHAR column 5';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR6 IS 'ＩＦ予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // IF spare CHAR column 6';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR7 IS 'ＩＦ予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // IF spare CHAR column 7';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR8 IS 'ＩＦ予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // IF spare CHAR column 8';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR9 IS 'ＩＦ予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // IF spare CHAR column 9';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR10 IS 'ＩＦ予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // IF spare CHAR column 10';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR11 IS 'ＩＦ予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // IF spare CHAR column 11';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR12 IS 'ＩＦ予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // IF spare CHAR column 12';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR13 IS 'ＩＦ予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // IF spare CHAR column 13';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR14 IS 'ＩＦ予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // IF spare CHAR column 14';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR15 IS 'ＩＦ予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // IF spare CHAR column 15';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR16 IS 'ＩＦ予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // IF spare CHAR column 16';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR17 IS 'ＩＦ予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // IF spare CHAR column 17';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR18 IS 'ＩＦ予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // IF spare CHAR column 18';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR19 IS 'ＩＦ予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // IF spare CHAR column 19';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR20 IS 'ＩＦ予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // IF spare CHAR column 20';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR21 IS 'ＩＦ予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // IF spare CHAR column 21';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR22 IS 'ＩＦ予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // IF spare CHAR column 22';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR23 IS 'ＩＦ予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // IF spare CHAR column 23';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR24 IS 'ＩＦ予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // IF spare CHAR column 24';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR25 IS 'ＩＦ予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // IF spare CHAR column 25';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR26 IS 'ＩＦ予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // IF spare CHAR column 26';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR27 IS 'ＩＦ予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // IF spare CHAR column 27';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR28 IS 'ＩＦ予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // IF spare CHAR column 28';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR29 IS 'ＩＦ予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // IF spare CHAR column 29';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_CHAR30 IS 'ＩＦ予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // IF spare CHAR column 30';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_NUM1 IS 'ＩＦ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // IF spare NUM column 1';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_NUM2 IS 'ＩＦ予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // IF spare NUM column 2';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_NUM3 IS 'ＩＦ予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // IF spare NUM column 3';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_NUM4 IS 'ＩＦ予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // IF spare NUM column 4';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_NUM5 IS 'ＩＦ予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // IF spare NUM column 5';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_DT1 IS 'ＩＦ予備ＤＡＴＥ項目１ // #MA.DT // IF spare DATE column 1';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_DT2 IS 'ＩＦ予備ＤＡＴＥ項目２ // #MA.DT // IF spare DATE column 2';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_DT3 IS 'ＩＦ予備ＤＡＴＥ項目３ // #MA.DT // IF spare DATE column 3';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_DT4 IS 'ＩＦ予備ＤＡＴＥ項目４ // #MA.DT // IF spare DATE column 4';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.IF_SUB_DT5 IS 'ＩＦ予備ＤＡＴＥ項目５ // #MA.DT // IF spare DATE column 5';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MBT_SCHD_PAY_SND_IF.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

