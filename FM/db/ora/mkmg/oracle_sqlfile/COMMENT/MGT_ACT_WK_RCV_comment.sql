
COMMENT ON TABLE MGT_ACT_WK_RCV IS '工数情報受信ＩＦ // Man-hour info. import IF';


COMMENT ON COLUMN MGT_ACT_WK_RCV.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MGT_ACT_WK_RCV.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MGT_ACT_WK_RCV.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.EXT_DATA_NO IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.EXT_DATA_LNO IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.DATA_MAKE_DT IS '送信元レコード作成日時 // #MA.TM // Creation date and time of source record';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IMP_FLG IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.CALC_CTG_CD IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGT_ACT_WK_RCV.DPT_CD IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MGT_ACT_WK_RCV.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGT_ACT_WK_RCV.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGT_ACT_WK_RCV.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGT_ACT_WK_RCV.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGT_ACT_WK_RCV.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGT_ACT_WK_RCV.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGT_ACT_WK_RCV.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGT_ACT_WK_RCV.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.STR_LN_CD IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MGT_ACT_WK_RCV.DISP_SEQ IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN MGT_ACT_WK_RCV.CTG_CD IS '品群ＣＤ // #MA.COST_CTG_CD // Item category cd.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.WK_COST_CD IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.WK_RSN_CD IS '工数理由ＣＤ // #MA.WK_RSN_CD // Man-hour reason cd.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.WK_COST IS '工数 // #MA.WK_COST_QTY // Man-hour';


COMMENT ON COLUMN MGT_ACT_WK_RCV.MFG_ACT_GRP IS '製造実績グループ // #MG.MFG_ACT_GRP // Mfg. result group';


COMMENT ON COLUMN MGT_ACT_WK_RCV.NO_PLN_FLG IS '計画対象外ＦＬＧ // #MA.FLG // Not to plan flg.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.NO_ITM_INFO_FLG IS '品目情報対象外ＦＬＧ // #MA.FLG // Not for item info. flg.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.WK_ACT_NO IS '工数実績ＮＯ // #MA.WK_ACT_NO // Man-hour result No.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.RMRKS IS '備考 // #MG.ACT_INST_WK_IF_RMRKS // Remarks';


COMMENT ON COLUMN MGT_ACT_WK_RCV.SUB_CHAR1 IS '予備１ // #MG.ACT_INST_WK_IF_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MGT_ACT_WK_RCV.SUB_CHAR2 IS '予備２ // #MG.ACT_INST_WK_IF_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MGT_ACT_WK_RCV.SUB_CHAR3 IS '予備３ // #MG.ACT_INST_WK_IF_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR1 IS 'ＩＦ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // IF spare CHAR column 1';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR2 IS 'ＩＦ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // IF spare CHAR column 2';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR3 IS 'ＩＦ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // IF spare CHAR column 3';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR4 IS 'ＩＦ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // IF spare CHAR column 4';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR5 IS 'ＩＦ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // IF spare CHAR column 5';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR6 IS 'ＩＦ予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // IF spare CHAR column 6';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR7 IS 'ＩＦ予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // IF spare CHAR column 7';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR8 IS 'ＩＦ予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // IF spare CHAR column 8';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR9 IS 'ＩＦ予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // IF spare CHAR column 9';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR10 IS 'ＩＦ予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // IF spare CHAR column 10';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR11 IS 'ＩＦ予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // IF spare CHAR column 11';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR12 IS 'ＩＦ予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // IF spare CHAR column 12';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR13 IS 'ＩＦ予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // IF spare CHAR column 13';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR14 IS 'ＩＦ予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // IF spare CHAR column 14';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR15 IS 'ＩＦ予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // IF spare CHAR column 15';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR16 IS 'ＩＦ予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // IF spare CHAR column 16';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR17 IS 'ＩＦ予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // IF spare CHAR column 17';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR18 IS 'ＩＦ予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // IF spare CHAR column 18';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR19 IS 'ＩＦ予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // IF spare CHAR column 19';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR20 IS 'ＩＦ予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // IF spare CHAR column 20';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR21 IS 'ＩＦ予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // IF spare CHAR column 21';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR22 IS 'ＩＦ予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // IF spare CHAR column 22';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR23 IS 'ＩＦ予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // IF spare CHAR column 23';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR24 IS 'ＩＦ予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // IF spare CHAR column 24';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR25 IS 'ＩＦ予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // IF spare CHAR column 25';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR26 IS 'ＩＦ予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // IF spare CHAR column 26';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR27 IS 'ＩＦ予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // IF spare CHAR column 27';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR28 IS 'ＩＦ予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // IF spare CHAR column 28';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR29 IS 'ＩＦ予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // IF spare CHAR column 29';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_CHAR30 IS 'ＩＦ予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // IF spare CHAR column 30';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_NUM1 IS 'ＩＦ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // IF spare NUM column 1';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_NUM2 IS 'ＩＦ予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // IF spare NUM column 2';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_NUM3 IS 'ＩＦ予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // IF spare NUM column 3';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_NUM4 IS 'ＩＦ予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // IF spare NUM column 4';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_NUM5 IS 'ＩＦ予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // IF spare NUM column 5';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_DT1 IS 'ＩＦ予備ＤＡＴＥ項目１ // #MA.DT // IF spare DATE column 1';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_DT2 IS 'ＩＦ予備ＤＡＴＥ項目２ // #MA.DT // IF spare DATE column 2';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_DT3 IS 'ＩＦ予備ＤＡＴＥ項目３ // #MA.DT // IF spare DATE column 3';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_DT4 IS 'ＩＦ予備ＤＡＴＥ項目４ // #MA.DT // IF spare DATE column 4';


COMMENT ON COLUMN MGT_ACT_WK_RCV.IF_SUB_DT5 IS 'ＩＦ予備ＤＡＴＥ項目５ // #MA.DT // IF spare DATE column 5';


COMMENT ON COLUMN MGT_ACT_WK_RCV.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MGT_ACT_WK_RCV.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MGT_ACT_WK_RCV.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MGT_ACT_WK_RCV.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_ACT_WK_RCV.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_ACT_WK_RCV.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_ACT_WK_RCV.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_ACT_WK_RCV.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_ACT_WK_RCV.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_ACT_WK_RCV.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_ACT_WK_RCV.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_ACT_WK_RCV.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_ACT_WK_RCV.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

