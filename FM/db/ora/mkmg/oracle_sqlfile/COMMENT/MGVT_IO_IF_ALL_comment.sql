
COMMENT ON TABLE MGVT_IO_IF_ALL IS '原価受払表送信ＩＦビュー // T account export IF view';


COMMENT ON COLUMN MGVT_IO_IF_ALL.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MGVT_IO_IF_ALL.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MGVT_IO_IF_ALL.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.BI_NOT_SEND_FLG IS '送信対象外ＦＬＧ // #MA.FLG // Not to be exported flg.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.CALC_NO IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.CALC_GRP_CD IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.FIX_FLG IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.TERM IS '期 // #MA.YM // Term';


COMMENT ON COLUMN MGVT_IO_IF_ALL.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGVT_IO_IF_ALL.MNG_DPT_CD IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGVT_IO_IF_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGVT_IO_IF_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGVT_IO_IF_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGVT_IO_IF_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGVT_IO_IF_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGVT_IO_IF_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGVT_IO_IF_ALL.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGVT_IO_IF_ALL.STD_QTY IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.AVE_UPRI IS '総平均単価 // #MA.MONEY // Weighted average unit price';


COMMENT ON COLUMN MGVT_IO_IF_ALL.STD_UPRI IS '標準単価 // #MA.MONEY // Standard unit cost';


COMMENT ON COLUMN MGVT_IO_IF_ALL.ST_STK_QTY IS '月初在庫数量 // #MA.QTY // Beginning inventory qty.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.ST_STK_AMT IS '月初在庫原価 // #MA.MONEY // Beginning inventory cost';


COMMENT ON COLUMN MGVT_IO_IF_ALL.MFG_QTY IS '製造数量 // #MA.QTY // Mfg. qty.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.MFG_AMT IS '製造原価 // #MA.MONEY // Mfg. cost';


COMMENT ON COLUMN MGVT_IO_IF_ALL.PURC_QTY IS '購買数量 // #MA.QTY // Purchase qty.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.PURC_AMT IS '購買原価 // #MA.MONEY // Purchase cost';


COMMENT ON COLUMN MGVT_IO_IF_ALL.MFG_GR_QTY IS '製造受入数量 // #MA.QTY // Mfg. receipt qty.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.MFG_GR_AMT IS '製造受入原価 // #MA.MONEY // Mfg. receipt cost';


COMMENT ON COLUMN MGVT_IO_IF_ALL.OTHR_GR_QTY IS '入庫数量 // #MA.QTY // GR qty.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.OTHR_GR_AMT IS '入庫原価 // #MA.MONEY // GR cost';


COMMENT ON COLUMN MGVT_IO_IF_ALL.ALC_AMT IS '配賦原価 // #MA.MONEY // Allocation cost';


COMMENT ON COLUMN MGVT_IO_IF_ALL.INPT_QTY IS '投入数量 // #MA.QTY // Input qty.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.INPT_AMT IS '投入原価 // #MA.MONEY // Input cost';


COMMENT ON COLUMN MGVT_IO_IF_ALL.PLNT_GI_QTY IS '販売倉入数量 // #MA.QTY // Sales warehousing qty.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.PLNT_GI_AMT IS '販売倉入原価 // #MA.MONEY // Sales warehousing cost';


COMMENT ON COLUMN MGVT_IO_IF_ALL.OTHR_GI_QTY IS '出庫数量 // #MA.QTY // GI qty.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.OTHR_GI_AMT IS '出庫原価 // #MA.MONEY // GI cost';


COMMENT ON COLUMN MGVT_IO_IF_ALL.PROV_QTY IS '有償支給数量 // #MA.QTY // Chargeable supply qty.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.PROV_AMT IS '有償支給原価 // #MA.MONEY // Chargeable supply cost';


COMMENT ON COLUMN MGVT_IO_IF_ALL.SLS_QTY IS '売上数量 // #MA.QTY // Sales qty.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.SLS_AMT IS '売上原価 // #MA.MONEY // Cost of goods sold';


COMMENT ON COLUMN MGVT_IO_IF_ALL.END_STK_QTY IS '月末在庫数量 // #MA.QTY // Ending inventory qty.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.END_STK_AMT IS '月末在庫原価 // #MA.MONEY // Ending inventory cost';


COMMENT ON COLUMN MGVT_IO_IF_ALL.DIFF_QTY IS '数量差 // #MA.QTY // Quantity difference';


COMMENT ON COLUMN MGVT_IO_IF_ALL.DIFF_AMT IS '金額差 // #MA.MONEY // Amount variance';


COMMENT ON COLUMN MGVT_IO_IF_ALL.XPNS_INPT_QTY IS '経費投入数量 // #MA.QTY // Expenses input qty.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.XPNS_INPT_AMT IS '経費投入原価 // #MA.MONEY // Expenses input costs';


COMMENT ON COLUMN MGVT_IO_IF_ALL.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MGVT_IO_IF_ALL.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MGVT_IO_IF_ALL.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR1 IS 'ＩＦ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // IF spare CHAR column 1';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR2 IS 'ＩＦ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // IF spare CHAR column 2';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR3 IS 'ＩＦ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // IF spare CHAR column 3';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR4 IS 'ＩＦ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // IF spare CHAR column 4';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR5 IS 'ＩＦ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // IF spare CHAR column 5';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR6 IS 'ＩＦ予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // IF spare CHAR column 6';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR7 IS 'ＩＦ予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // IF spare CHAR column 7';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR8 IS 'ＩＦ予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // IF spare CHAR column 8';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR9 IS 'ＩＦ予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // IF spare CHAR column 9';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR10 IS 'ＩＦ予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // IF spare CHAR column 10';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR11 IS 'ＩＦ予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // IF spare CHAR column 11';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR12 IS 'ＩＦ予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // IF spare CHAR column 12';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR13 IS 'ＩＦ予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // IF spare CHAR column 13';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR14 IS 'ＩＦ予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // IF spare CHAR column 14';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR15 IS 'ＩＦ予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // IF spare CHAR column 15';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR16 IS 'ＩＦ予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // IF spare CHAR column 16';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR17 IS 'ＩＦ予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // IF spare CHAR column 17';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR18 IS 'ＩＦ予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // IF spare CHAR column 18';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR19 IS 'ＩＦ予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // IF spare CHAR column 19';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR20 IS 'ＩＦ予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // IF spare CHAR column 20';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR21 IS 'ＩＦ予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // IF spare CHAR column 21';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR22 IS 'ＩＦ予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // IF spare CHAR column 22';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR23 IS 'ＩＦ予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // IF spare CHAR column 23';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR24 IS 'ＩＦ予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // IF spare CHAR column 24';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR25 IS 'ＩＦ予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // IF spare CHAR column 25';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR26 IS 'ＩＦ予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // IF spare CHAR column 26';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR27 IS 'ＩＦ予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // IF spare CHAR column 27';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR28 IS 'ＩＦ予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // IF spare CHAR column 28';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR29 IS 'ＩＦ予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // IF spare CHAR column 29';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_CHAR30 IS 'ＩＦ予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // IF spare CHAR column 30';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_NUM1 IS 'ＩＦ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // IF spare NUM column 1';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_NUM2 IS 'ＩＦ予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // IF spare NUM column 2';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_NUM3 IS 'ＩＦ予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // IF spare NUM column 3';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_NUM4 IS 'ＩＦ予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // IF spare NUM column 4';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_NUM5 IS 'ＩＦ予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // IF spare NUM column 5';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_DT1 IS 'ＩＦ予備ＤＡＴＥ項目１ // #MA.DT // IF spare DATE column 1';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_DT2 IS 'ＩＦ予備ＤＡＴＥ項目２ // #MA.DT // IF spare DATE column 2';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_DT3 IS 'ＩＦ予備ＤＡＴＥ項目３ // #MA.DT // IF spare DATE column 3';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_DT4 IS 'ＩＦ予備ＤＡＴＥ項目４ // #MA.DT // IF spare DATE column 4';


COMMENT ON COLUMN MGVT_IO_IF_ALL.IF_SUB_DT5 IS 'ＩＦ予備ＤＡＴＥ項目５ // #MA.DT // IF spare DATE column 5';


COMMENT ON COLUMN MGVT_IO_IF_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGVT_IO_IF_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGVT_IO_IF_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGVT_IO_IF_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGVT_IO_IF_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGVT_IO_IF_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGVT_IO_IF_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGVT_IO_IF_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGVT_IO_IF_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGVT_IO_IF_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

