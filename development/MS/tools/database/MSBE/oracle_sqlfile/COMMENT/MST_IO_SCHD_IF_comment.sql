
COMMENT ON TABLE MST_IO_SCHD_IF IS '受払予定送信ＩＦ // GR/GI schedule export IF';


COMMENT ON COLUMN MST_IO_SCHD_IF.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MST_IO_SCHD_IF.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_IO_SCHD_IF.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_IO_SCHD_IF.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MST_IO_SCHD_IF.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_IO_SCHD_IF.DPT_ST_DT IS '部門マスタ適用開始日 // #MA.DT // Dept. master application start date';


COMMENT ON COLUMN MST_IO_SCHD_IF.DATA_UPD_TS IS '送信元レコード更新日時 // #MA.SYS_TS // Update date and time of source record';


COMMENT ON COLUMN MST_IO_SCHD_IF.BI_NOT_SEND_FLG IS 'ＢＩ送信対象外ＦＬＧ // #MA.FLG // BI not to be exported flg.';


COMMENT ON COLUMN MST_IO_SCHD_IF.DPT_CD IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN MST_IO_SCHD_IF.STD_COST_AMT IS '標準単価金額 // #MA.MONEY // Standard unit amount';


COMMENT ON COLUMN MST_IO_SCHD_IF.SLIP_SCHD_NO IS '受払予定伝票ＮＯ // #MA.SLIP_SCHD_NO // GR/GI schedule slip No.';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_TYP IS '受払予定区分 // #MS.IO_SCHD_TYP // GR/GI schedule type';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_TYP IS '入出庫区分 // #MS.IO_TYP // GR/GI type';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_STS_TYP IS '受払予定状況区分 // #MS.IO_SCHD_STS_TYP // GR/GI schedule status type';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_NO IS '受払予定ＮＯ // #MA.IO_SCHD_NO // GR/GI schedule No.';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_SEQ IS '受払予定連番 // #MA.INT3 // GR/GI schedule sequence number';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_SUB_TYP1 IS '受払予定予備区分１ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 1';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_SUB_NO1 IS '受払予定予備ＮＯ１ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 1';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_SUB_SEQ1 IS '受払予定予備連番１ // #MA.INT3 // GR/GI schedule spare sequence No. 1';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_SUB_TYP2 IS '受払予定予備区分２ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 2';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_SUB_NO2 IS '受払予定予備ＮＯ２ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 2';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_SUB_SEQ2 IS '受払予定予備連番２ // #MA.INT3 // GR/GI schedule spare sequence No. 2';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_SUB_TYP3 IS '受払予定予備区分３ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 3';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_SUB_NO3 IS '受払予定予備ＮＯ３ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 3';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_SUB_SEQ3 IS '受払予定予備連番３ // #MA.INT3 // GR/GI schedule spare sequence No. 3';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_SUB_TYP4 IS '受払予定予備区分４ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 4';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_SUB_NO4 IS '受払予定予備ＮＯ４ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 4';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_SUB_SEQ4 IS '受払予定予備連番４ // #MA.INT3 // GR/GI schedule spare sequence No. 4';


COMMENT ON COLUMN MST_IO_SCHD_IF.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_IO_SCHD_IF.SCHD_DT IS '予定日付 // #MA.DT // Scheduled date';


COMMENT ON COLUMN MST_IO_SCHD_IF.ACCPT_SCHD_DT IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN MST_IO_SCHD_IF.AVL_SCHD_DT IS '使用可能予定日 // #MA.DT // Available date';


COMMENT ON COLUMN MST_IO_SCHD_IF.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_IO_SCHD_IF.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_IO_SCHD_IF.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_IO_SCHD_IF.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_IO_SCHD_IF.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_IO_SCHD_IF.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_IO_SCHD_IF.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_IO_SCHD_IF.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_IO_SCHD_IF.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_IO_SCHD_IF.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_IO_SCHD_IF.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_IO_SCHD_IF.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_IO_SCHD_IF.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_IO_SCHD_IF.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_IO_SCHD_IF.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_IO_SCHD_IF.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_IO_SCHD_IF.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_IO_SCHD_IF.IN_XFR_TYP IS '積送品区分 // #MS.IN_XFR_TYP // In-transit type';


COMMENT ON COLUMN MST_IO_SCHD_IF.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_IO_SCHD_IF.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MST_IO_SCHD_IF.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_IO_SCHD_IF.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_IO_SCHD_IF.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_IO_SCHD_IF.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_IO_SCHD_IF.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_IO_SCHD_IF.GI_LOC_CD IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN MST_IO_SCHD_IF.GR_LOC_CD IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN MST_IO_SCHD_IF.ACCRUAL_FLG IS '在庫発生基準ＦＬＧ // #MA.FLG // Inventory accrual base flg.';


COMMENT ON COLUMN MST_IO_SCHD_IF.ACCPT_FLG IS '資産発生基準ＦＬＧ // #MA.FLG // Asset accrual base flg.';


COMMENT ON COLUMN MST_IO_SCHD_IF.AVL_FLG IS '使用可能日基準ＦＬＧ // #MA.FLG // Available date basis flg.';


COMMENT ON COLUMN MST_IO_SCHD_IF.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MST_IO_SCHD_IF.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MST_IO_SCHD_IF.BUF_QTY IS '安全在庫数量 // #MA.QTY // Fluctuation inventory qty.';


COMMENT ON COLUMN MST_IO_SCHD_IF.RORD_STK_QTY IS '発注点在庫数量 // #MA.QTY // Reorder point inventory qty.';


COMMENT ON COLUMN MST_IO_SCHD_IF.RORD_RQST_QTY IS '発注点依頼数量 // #MA.QTY // Reorder point request qty.';


COMMENT ON COLUMN MST_IO_SCHD_IF.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MST_IO_SCHD_IF.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MST_IO_SCHD_IF.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MST_IO_SCHD_IF.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MST_IO_SCHD_IF.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_IO_SCHD_IF.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_IO_SCHD_IF.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_IO_SCHD_IF.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_IO_SCHD_IF.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_IO_SCHD_IF.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_IO_SCHD_IF.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_IO_SCHD_IF.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_IO_SCHD_IF.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_IO_SCHD_IF.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_IO_SCHD_IF.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_IO_SCHD_IF.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_IO_SCHD_IF.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

