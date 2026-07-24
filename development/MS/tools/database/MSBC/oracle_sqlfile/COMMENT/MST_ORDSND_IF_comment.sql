
COMMENT ON TABLE MST_ORDSND_IF IS 'オーダ送信ＩＦ // Order export IF';


COMMENT ON COLUMN MST_ORDSND_IF.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MST_ORDSND_IF.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_ORDSND_IF.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_ORDSND_IF.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MST_ORDSND_IF.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_ORDSND_IF.EXT_ITM_ORD_NO IS '外部品目オーダＮＯ // #MA.EXT_ITM_ORD_NO // External item order No.';


COMMENT ON COLUMN MST_ORDSND_IF.EXT_OPER_ORD_NO IS '外部工程オーダＮＯ // #MA.EXT_OPER_ORD_NO // External operation order No.';


COMMENT ON COLUMN MST_ORDSND_IF.ITM_ORD_TYP IS 'オーダ区分 // #MS.ITM_ORD_TYP // Order type';


COMMENT ON COLUMN MST_ORDSND_IF.IF_ITM_CD IS 'ＩＦ品目ＣＤ // #MA.ITM_CD // IF item cd.';


COMMENT ON COLUMN MST_ORDSND_IF.IF_ITM_SUB1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN MST_ORDSND_IF.IF_ITM_SUB2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN MST_ORDSND_IF.IF_ITM_SUB3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN MST_ORDSND_IF.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_ORDSND_IF.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_ORDSND_IF.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_ORDSND_IF.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_ORDSND_IF.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_ORDSND_IF.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_ORDSND_IF.IF_STRG_LOC_CD IS 'ＩＦ格納場所ＣＤ // #MA.LOC_CD // IF storage location cd.';


COMMENT ON COLUMN MST_ORDSND_IF.STRG_LOC_CD IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN MST_ORDSND_IF.STRG_LOC_NM IS '格納場所名 // #MA.LOC_NM // Storage location name';


COMMENT ON COLUMN MST_ORDSND_IF.IF_MFG_LOC_CD IS 'ＩＦ製造場所ＣＤ // #MA.LOC_CD // IF mfg. location cd.';


COMMENT ON COLUMN MST_ORDSND_IF.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MST_ORDSND_IF.MFG_LOC_NM IS '製造場所名 // #MA.LOC_NM // Mfg. location name';


COMMENT ON COLUMN MST_ORDSND_IF.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MST_ORDSND_IF.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MST_ORDSND_IF.INST_QTY IS '指図予定数量 // #MA.QTY // Order scheduled qty.';


COMMENT ON COLUMN MST_ORDSND_IF.YIELD_SCHD_QTY IS '出来高予定数量 // #MA.QTY // Output scheduled qty.';


COMMENT ON COLUMN MST_ORDSND_IF.PO_SCHD_DT IS '発注予定日 // #MA.DT // Scheduled PO date';


COMMENT ON COLUMN MST_ORDSND_IF.MFG_ST_SCHD_DT IS '製造着手予定日 // #MA.DT // Scheduled mfg. start date';


COMMENT ON COLUMN MST_ORDSND_IF.MFG_END_SCHD_DT IS '製造終了予定日 // #MA.DT // Scheduled mfg. end date';


COMMENT ON COLUMN MST_ORDSND_IF.STRG_SCHD_DT IS '格納完了予定日 // #MA.DT // Scheduled storage completion date';


COMMENT ON COLUMN MST_ORDSND_IF.ACCPT_SCHD_DT IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN MST_ORDSND_IF.INSP_ST_SCHD_DT IS '検査着手予定日 // #MA.DT // Scheduled inspection start date';


COMMENT ON COLUMN MST_ORDSND_IF.INSP_END_SCHD_DT IS '検査終了予定日 // #MA.DT // Scheduled inspection end date';


COMMENT ON COLUMN MST_ORDSND_IF.AVL_SCHD_DT IS '使用可能予定日 // #MA.DT // Available date';


COMMENT ON COLUMN MST_ORDSND_IF.MASTER_DT IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN MST_ORDSND_IF.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_ORDSND_IF.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_ORDSND_IF.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_ORDSND_IF.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_ORDSND_IF.INST_PO_CNT_RMRKS IS '指図・発注連絡備考 // #MS.INST_PO_CNT_RMRKS // Order/PO contact remarks';


COMMENT ON COLUMN MST_ORDSND_IF.ITM_ORD_INTR_RMRKS IS '品目オーダ内部備考 // #MS.IORD_INTR_RMRKS // Item order internal remarks';


COMMENT ON COLUMN MST_ORDSND_IF.ITM_ORD_SUB_CHAR1 IS '品目オーダ予備１ // #MS.IORD_SUB_CHAR1 // Item order spare 1';


COMMENT ON COLUMN MST_ORDSND_IF.ITM_ORD_SUB_CHAR2 IS '品目オーダ予備２ // #MS.IORD_SUB_CHAR2 // Item order spare 2';


COMMENT ON COLUMN MST_ORDSND_IF.ITM_ORD_SUB_CHAR3 IS '品目オーダ予備３ // #MS.IORD_SUB_CHAR3 // Item order spare 3';


COMMENT ON COLUMN MST_ORDSND_IF.ST_SCHD_TM IS '工程着手予定日時 // #MA.TM // Scheduled operation start date and time';


COMMENT ON COLUMN MST_ORDSND_IF.END_SCHD_TM IS '工程終了予定日時 // #MA.TM // Scheduled operation end date and time';


COMMENT ON COLUMN MST_ORDSND_IF.OPER_SCHD_QTY IS '工程指図予定数量 // #MA.QTY // Operation order scheduled qty.';


COMMENT ON COLUMN MST_ORDSND_IF.DISP_SEQ IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN MST_ORDSND_IF.IF_OPER_CD IS 'ＩＦ工程ＣＤ // #MA.OPER_CD // IF operation cd.';


COMMENT ON COLUMN MST_ORDSND_IF.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MST_ORDSND_IF.OPER_NM IS '工程名 // #MA.OPER_NM // Operation name';


COMMENT ON COLUMN MST_ORDSND_IF.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MST_ORDSND_IF.IF_LOC_CD IS 'ＩＦ場所ＣＤ // #MA.LOC_CD // IF location cd.';


COMMENT ON COLUMN MST_ORDSND_IF.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_ORDSND_IF.LOC_NM IS '場所名 // #MA.LOC_NM // Location name';


COMMENT ON COLUMN MST_ORDSND_IF.OPER_RSRC IS '工程資源 // #MA.OPER_RSRC // Operation resources';


COMMENT ON COLUMN MST_ORDSND_IF.OPER_ORD_INTR_RMRKS IS '工程オーダ内部備考 // #MS.OORDER_INTR_RMRKS // Operation order internal remarks';


COMMENT ON COLUMN MST_ORDSND_IF.OPER_ORD_SUB_CHAR1 IS '工程オーダ予備１ // #MS.OORDER_SUB_CHAR1 // Operation order spare 1';


COMMENT ON COLUMN MST_ORDSND_IF.OPER_ORD_SUB_CHAR2 IS '工程オーダ予備２ // #MS.OORDER_SUB_CHAR2 // Operation order spare 2';


COMMENT ON COLUMN MST_ORDSND_IF.OPER_ORD_SUB_CHAR3 IS '工程オーダ予備３ // #MS.OORDER_SUB_CHAR3 // Operation order spare 3';


COMMENT ON COLUMN MST_ORDSND_IF.CO_NM IS '会社名 // #MA.CO_NM // Company name';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MST_ORDSND_IF.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MST_ORDSND_IF.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_ORDSND_IF.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_ORDSND_IF.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_ORDSND_IF.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_ORDSND_IF.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_ORDSND_IF.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_ORDSND_IF.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_ORDSND_IF.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_ORDSND_IF.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_ORDSND_IF.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_ORDSND_IF.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_ORDSND_IF.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_ORDSND_IF.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MST_ORDSND_IF.ITM_ORD_NO IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN MST_ORDSND_IF.OPER_ORD_NO IS '工程オーダＮＯ // #MA.OPER_ORD_NO // Operation order No.';


COMMENT ON COLUMN MST_ORDSND_IF.ITM_ORD_STS_TYP IS '品目オーダ状況区分 // #MS.ITM_ORD_STS_TYP // Item order status type';


COMMENT ON COLUMN MST_ORDSND_IF.OPER_ORD_STS_TYP IS '工程オーダ状況区分 // #MS.OPER_ORD_STS_TYP // Operation order status type';

