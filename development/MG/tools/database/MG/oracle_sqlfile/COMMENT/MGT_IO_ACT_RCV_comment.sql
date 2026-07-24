
COMMENT ON TABLE MGT_IO_ACT_RCV IS '受払実績受信ＩＦ // GR/GI result import IF';


COMMENT ON COLUMN MGT_IO_ACT_RCV.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MGT_IO_ACT_RCV.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MGT_IO_ACT_RCV.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.EXT_DATA_NO IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.EXT_DATA_LNO IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.DATA_MAKE_DT IS '送信元レコード作成日時 // #MA.TM // Creation date and time of source record';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IMP_FLG IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.CALC_CTG_CD IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGT_IO_ACT_RCV.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MGT_IO_ACT_RCV.MNG_DPT_CD IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.SLS_DPT_CD IS '売上部門ＣＤ // #MA.COST_DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGT_IO_ACT_RCV.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGT_IO_ACT_RCV.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGT_IO_ACT_RCV.COST_IO_ACT_TYP IS '原価受払区分 // #MG.COST_IO_ACT_TYP // Cost GR/GI result type';


COMMENT ON COLUMN MGT_IO_ACT_RCV.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGT_IO_ACT_RCV.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGT_IO_ACT_RCV.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGT_IO_ACT_RCV.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGT_IO_ACT_RCV.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.STR_LN_CD IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MGT_IO_ACT_RCV.DISP_SEQ IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN MGT_IO_ACT_RCV.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGT_IO_ACT_RCV.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MGT_IO_ACT_RCV.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.QTY IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN MGT_IO_ACT_RCV.AMT IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN MGT_IO_ACT_RCV.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MGT_IO_ACT_RCV.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MGT_IO_ACT_RCV.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.DEST_CD1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN MGT_IO_ACT_RCV.DEST_CD2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN MGT_IO_ACT_RCV.DEST_CD3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN MGT_IO_ACT_RCV.STK_BP_CD IS '在庫先ＣＤ // #MA.BP_CD // Company holding inventory cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.USR_CD IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.MFG_PER IS '製造進捗度 // #MA.RATE // Mfg. progress';


COMMENT ON COLUMN MGT_IO_ACT_RCV.MFG_COST_RATIO IS '製造原価比率 // #MG.MFG_COST_RATIO // Mfg. cost ratio';


COMMENT ON COLUMN MGT_IO_ACT_RCV.TRD_GRP IS '振替グループ // #MA.TRD_GRP // Transfer group';


COMMENT ON COLUMN MGT_IO_ACT_RCV.TRD_RATIO IS '振替比率 // #MG.TRD_RATIO // Transfer ratio';


COMMENT ON COLUMN MGT_IO_ACT_RCV.ALC_AC_CD IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.ALC_AMT_FLG IS '配賦振替ＦＬＧ // #MA.FLG // Transfer allocation flg.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_WG_CD IS '負担ワーキンググループＣＤ // #MA.WG_CD // Allocation WG cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_DPT_CD IS '負担部門ＣＤ // #MA.COST_DPT_CD // Allocation destination dept. cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_LOC_CD IS '負担場所ＣＤ // #MA.LOC_CD // Allocation destination location cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_OPER_CD IS '負担工程ＣＤ // #MA.OPER_CD // Allocation destination operation cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_BP_CD IS '負担取引先ＣＤ // #MA.BP_CD // Allocation destination BP cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_CTG_CD IS '負担品群ＣＤ // #MA.COST_CTG_CD // Allocation destination item category cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_LOT_NO IS '負担ロットＮＯ // #MA.LOT_NO // Allocation destination lot No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_SUBLOT_NO IS '負担サブロットＮＯ // #MA.SUBLOT_NO // Allocation destination sublot No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_SNO1 IS '負担手配ＮＯ１ // #MA.SNO1 // Allocation destination SEIBAN No. 1';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_SNO2 IS '負担手配ＮＯ２ // #MA.SNO2 // Allocation destination SEIBAN No. 2';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_SNO3 IS '負担手配ＮＯ３ // #MA.SNO3 // Allocation destination SEIBAN No. 3';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_SNO4 IS '負担手配ＮＯ４ // #MA.SNO4 // Allocation destination SEIBAN No. 4';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BD_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MGT_IO_ACT_RCV.COST_SLS_CD1 IS '売上分類１ // #MA.COST_SLS_CD // Sales classification 1';


COMMENT ON COLUMN MGT_IO_ACT_RCV.COST_SLS_CD2 IS '売上分類２ // #MA.COST_SLS_CD // Sales classification 2';


COMMENT ON COLUMN MGT_IO_ACT_RCV.COST_SLS_CD3 IS '売上分類３ // #MA.COST_SLS_CD // Sales classification 3';


COMMENT ON COLUMN MGT_IO_ACT_RCV.COST_SLS_CD4 IS '売上分類４ // #MA.COST_SLS_CD // Sales classification 4';


COMMENT ON COLUMN MGT_IO_ACT_RCV.COST_SLS_CD5 IS '売上分類５ // #MA.COST_SLS_CD // Sales classification 5';


COMMENT ON COLUMN MGT_IO_ACT_RCV.ALC_VAL1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN MGT_IO_ACT_RCV.ALC_VAL2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN MGT_IO_ACT_RCV.ALC_VAL3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN MGT_IO_ACT_RCV.ALC_VAL4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN MGT_IO_ACT_RCV.ALC_VAL5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';


COMMENT ON COLUMN MGT_IO_ACT_RCV.REC_EVAL_TYP IS '個別評価区分 // #MG.REC_EVAL_TYP // Individual evaluation type';


COMMENT ON COLUMN MGT_IO_ACT_RCV.EXPNS_CD IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.MFG_ACT_GRP IS '製造実績グループ // #MG.MFG_ACT_GRP // Mfg. result group';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MGT_IO_ACT_RCV.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MGT_IO_ACT_RCV.NO_PLN_FLG IS '計画対象外ＦＬＧ // #MA.FLG // Not to plan flg.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.NO_ITM_INFO_FLG IS '品目情報対象外ＦＬＧ // #MA.FLG // Not for item info. flg.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.NO_EVAL_FLG IS '評価単価対象外ＦＬＧ // #MA.FLG // Not for evaluation unit price flg.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.ZERO_EFFECT_FLG IS 'ゼロ評価ＦＬＧ // #MA.FLG // Zero evaluation flg.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.SLIP_NO IS '伝票ＮＯ // #MA.SLIP_NO // Slip No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.SLIP_SEQ_NO IS '伝票連番 // #MA.SLIP_SEQ // Slip sequence number';


COMMENT ON COLUMN MGT_IO_ACT_RCV.RMRKS IS '備考 // #MG.COST_IO_RMRKS // Remarks';


COMMENT ON COLUMN MGT_IO_ACT_RCV.SUB_CHAR1 IS '予備１ // #MG.COST_IO_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MGT_IO_ACT_RCV.SUB_CHAR2 IS '予備２ // #MG.COST_IO_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MGT_IO_ACT_RCV.SUB_CHAR3 IS '予備３ // #MG.COST_IO_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR1 IS 'ＩＦ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // IF spare CHAR column 1';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR2 IS 'ＩＦ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // IF spare CHAR column 2';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR3 IS 'ＩＦ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // IF spare CHAR column 3';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR4 IS 'ＩＦ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // IF spare CHAR column 4';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR5 IS 'ＩＦ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // IF spare CHAR column 5';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR6 IS 'ＩＦ予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // IF spare CHAR column 6';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR7 IS 'ＩＦ予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // IF spare CHAR column 7';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR8 IS 'ＩＦ予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // IF spare CHAR column 8';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR9 IS 'ＩＦ予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // IF spare CHAR column 9';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR10 IS 'ＩＦ予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // IF spare CHAR column 10';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR11 IS 'ＩＦ予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // IF spare CHAR column 11';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR12 IS 'ＩＦ予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // IF spare CHAR column 12';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR13 IS 'ＩＦ予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // IF spare CHAR column 13';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR14 IS 'ＩＦ予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // IF spare CHAR column 14';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR15 IS 'ＩＦ予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // IF spare CHAR column 15';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR16 IS 'ＩＦ予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // IF spare CHAR column 16';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR17 IS 'ＩＦ予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // IF spare CHAR column 17';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR18 IS 'ＩＦ予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // IF spare CHAR column 18';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR19 IS 'ＩＦ予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // IF spare CHAR column 19';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR20 IS 'ＩＦ予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // IF spare CHAR column 20';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR21 IS 'ＩＦ予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // IF spare CHAR column 21';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR22 IS 'ＩＦ予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // IF spare CHAR column 22';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR23 IS 'ＩＦ予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // IF spare CHAR column 23';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR24 IS 'ＩＦ予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // IF spare CHAR column 24';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR25 IS 'ＩＦ予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // IF spare CHAR column 25';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR26 IS 'ＩＦ予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // IF spare CHAR column 26';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR27 IS 'ＩＦ予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // IF spare CHAR column 27';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR28 IS 'ＩＦ予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // IF spare CHAR column 28';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR29 IS 'ＩＦ予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // IF spare CHAR column 29';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_CHAR30 IS 'ＩＦ予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // IF spare CHAR column 30';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_NUM1 IS 'ＩＦ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // IF spare NUM column 1';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_NUM2 IS 'ＩＦ予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // IF spare NUM column 2';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_NUM3 IS 'ＩＦ予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // IF spare NUM column 3';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_NUM4 IS 'ＩＦ予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // IF spare NUM column 4';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_NUM5 IS 'ＩＦ予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // IF spare NUM column 5';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_DT1 IS 'ＩＦ予備ＤＡＴＥ項目１ // #MA.DT // IF spare DATE column 1';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_DT2 IS 'ＩＦ予備ＤＡＴＥ項目２ // #MA.DT // IF spare DATE column 2';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_DT3 IS 'ＩＦ予備ＤＡＴＥ項目３ // #MA.DT // IF spare DATE column 3';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_DT4 IS 'ＩＦ予備ＤＡＴＥ項目４ // #MA.DT // IF spare DATE column 4';


COMMENT ON COLUMN MGT_IO_ACT_RCV.IF_SUB_DT5 IS 'ＩＦ予備ＤＡＴＥ項目５ // #MA.DT // IF spare DATE column 5';


COMMENT ON COLUMN MGT_IO_ACT_RCV.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MGT_IO_ACT_RCV.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MGT_IO_ACT_RCV.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MGT_IO_ACT_RCV.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_IO_ACT_RCV.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_IO_ACT_RCV.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_IO_ACT_RCV.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_IO_ACT_RCV.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_IO_ACT_RCV.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_IO_ACT_RCV.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_IO_ACT_RCV.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_IO_ACT_RCV.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_IO_ACT_RCV.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

