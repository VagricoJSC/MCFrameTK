
COMMENT ON TABLE MST_ITM_ORDER_IF IS '品目オーダ情報送信ＩＦ // Item order info. export IF';


COMMENT ON COLUMN MST_ITM_ORDER_IF.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_ITM_ORDER_IF.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MST_ITM_ORDER_IF.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.DPT_ST_DT IS '部門マスタ適用開始日 // #MA.DT // Dept. master application start date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.DATA_UPD_TS IS '送信元レコード更新日時 // #MA.SYS_TS // Update date and time of source record';


COMMENT ON COLUMN MST_ITM_ORDER_IF.BI_NOT_SEND_FLG IS 'ＢＩ送信対象外ＦＬＧ // #MA.FLG // BI not to be exported flg.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ARR_ACT_TM IS '入荷実績日 // #MA.TM // Actual receipt date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ITM_ORD_NO IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ITM_ORD_TYP IS 'オーダ区分 // #MS.ITM_ORD_TYP // Order type';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ORD_GNRT_TYP IS 'オーダ生成区分 // #MS.ORD_GNRT_TYP // Order generation type';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_ITM_ORDER_IF.STRG_LOC_CD IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MST_MFG_LOC_CD IS 'マスタ製造場所ＣＤ // #MA.LOC_CD // Master mfg. location cd.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.RQST_LOC_CD IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.RQST_WG_CD IS '依頼先ワーキンググループＣＤ // #MA.WG_CD // Requested WG cd.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MST_ITM_ORDER_IF.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INST_QTY IS '指図予定数量 // #MA.QTY // Order scheduled qty.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.YIELD_SCHD_QTY IS '出来高予定数量 // #MA.QTY // Output scheduled qty.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.NOT_INST_QTY IS '未指図数量 // #MA.QTY // Unordered qty.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MFG_INST_UNIT_TYP IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INST_YIELD_SCHD_QTY IS '出来高予定数量（指図・発注） // #MA.QTY // Output scheduled qty. (Order/PO)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.YIELD_ACT_QTY IS '出来高実績数量（入荷・出来高） // #MA.QTY // Output result qty. (Receipt/output)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.PURC_ACT_QTY IS '仕入実績数量 // #MA.QTY // Purchase result qty.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INSP_ACT_QTY IS '検査実績数量 // #MA.QTY // Inspection result qty.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.NMR_QTY IS '歩留分子 // #MA.QTY // Yield numerator';


COMMENT ON COLUMN MST_ITM_ORDER_IF.DNM_QTY IS '歩留分母 // #MA.QTY // Yield denominator';


COMMENT ON COLUMN MST_ITM_ORDER_IF.FXD_YIELD_QTY IS '固定歩留数量 // #MA.QTY // Constant yield qty.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ITM_ORD_STS_TYP IS '品目オーダ状況区分 // #MS.ITM_ORD_STS_TYP // Item order status type';


COMMENT ON COLUMN MST_ITM_ORDER_IF.FIX_DT IS '確定日 // #MA.DT // Firm date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.BLK_FLG IS 'まとめＦＬＧ // #MA.FLG // Aggregation flg.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.PO_SCHD_DT IS '発注予定日 // #MA.DT // Scheduled PO date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MRP_PO_SCHD_DT IS '発注予定日（ＭＲＰ） // #MA.DT // Scheduled PO date (MRP)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.PO_DT IS '発注日 // #MA.DT // PO date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MRP_PURC_LT IS '購入ＬＴ（ＭＲＰ） // #MA.LT // Purchase LT (MRP)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.PURC_LT IS '購入ＬＴ // #MA.LT // Purchase LT';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ACT_PURC_LT IS '購入ＬＴ（実績） // #MA.LT // Purchase LT (Result)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MFG_ST_SCHD_DT IS '製造着手予定日 // #MA.DT // Scheduled mfg. start date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MRP_MFG_ST_SCHD_DT IS '製造着手予定日（ＭＲＰ） // #MA.DT // Scheduled mfg. start date (MRP)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INST_MFG_ST_SCHD_DT IS '製造着手予定日（指図） // #MA.DT // Scheduled mfg. start date (Order)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MFG_ST_ACT_DT IS '製造着手実績日 // #MA.DT // Actual mfg. start date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MFG_END_SCHD_DT IS '製造終了予定日 // #MA.DT // Scheduled mfg. end date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MRP_MFG_END_SCHD_DT IS '製造終了予定日（ＭＲＰ） // #MA.DT // Scheduled mfg. end date (MRP)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INST_MFG_END_SCHD_DT IS '製造終了予定日（指図） // #MA.DT // Scheduled mfg. end date (Order)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MFG_END_ACT_DT IS '製造終了実績日 // #MA.DT // Actual mfg. end date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MRP_MFG_LT IS '製造ＬＴ（ＭＲＰ） // #MA.LT // Mfg. LT (MRP)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MFG_LT IS '製造ＬＴ // #MA.LT // Mfg. LT';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ACT_MFG_LT IS '製造ＬＴ（実績） // #MA.LT // Mfg. LT (Result)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.GI_SCHD_DT IS '出庫予定日 // #MA.DT // Scheduled GI date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MRP_GI_SCHD_DT IS '出庫予定日（ＭＲＰ） // #MA.DT // Scheduled GI date (MRP)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INST_GI_SCHD_DT IS '出庫予定日（指図） // #MA.DT // Scheduled GI date (Order)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.GI_ACT_DT IS '出庫実績日 // #MA.DT // Actual GI date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.STRG_SCHD_DT IS '格納完了予定日 // #MA.DT // Scheduled storage completion date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MRP_STRG_SCHD_DT IS '格納完了予定日（ＭＲＰ） // #MA.DT // Scheduled storage completion date (MRP)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INST_STRG_SCHD_DT IS '格納完了予定日（指図・発注） // #MA.DT // Scheduled storage completion date (Order/PO)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.STRG_ACT_DT IS '格納完了実績日 // #MA.DT // Actual storage completion date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.XFR_LT IS '移動ＬＴ // #MA.LT // Movement LT';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ACCPT_SCHD_DT IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MRP_ACCPT_SCHD_DT IS '検収予定日（ＭＲＰ） // #MA.DT // Scheduled acceptance date (MRP)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INST_ACCPT_SCHD_DT IS '検収予定日（発注） // #MA.DT // Scheduled acceptance date (PO)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ACCPT_ACT_DT IS '検収実績日 // #MA.DT // Actual acceptance date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ACCPT_INSP_LT IS '検収ＬＴ // #MA.LT // Acceptance LT';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INSP_ST_SCHD_DT IS '検査着手予定日 // #MA.DT // Scheduled inspection start date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MRP_INSP_ST_SCHD_DT IS '検査着手予定日（ＭＲＰ） // #MA.DT // Scheduled inspection start date (MRP)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INST_INSP_ST_SCHD_DT IS '検査着手予定日（指図・発注） // #MA.DT // Scheduled inspection start date (Order/PO)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INSP_ST_ACT_DT IS '検査着手実績日 // #MA.DT // Actual inspection start date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INSP_END_SCHD_DT IS '検査終了予定日 // #MA.DT // Scheduled inspection end date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MRP_INSP_END_SCHD_DT IS '検査終了予定日（ＭＲＰ） // #MA.DT // Scheduled inspection end date (MRP)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INST_INSP_END_SCHD_DT IS '検査終了予定日（指図・発注） // #MA.DT // Scheduled inspection end date (Order/PO)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INSP_END_ACT_DT IS '検査終了実績日 // #MA.DT // Actual inspection end date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INSP_LT IS '検査ＬＴ // #MA.LT // Inspection LT';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INSP_OFFST IS '検査オフセット // #MA.OFFST // Inspection offset';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MRP_AVL_SCHD_DT IS '使用可能予定日（ＭＲＰ） // #MA.DT // Available date (MRP)';


COMMENT ON COLUMN MST_ITM_ORDER_IF.AVL_SCHD_DT IS '使用可能予定日 // #MA.DT // Available date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.MASTER_DT IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_ITM_ORDER_IF.LMT_DT IS '期限切れ日 // #MA.DT // Expired date';


COMMENT ON COLUMN MST_ITM_ORDER_IF.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.RQMT_NO IS '所要ＮＯ // #MA.RQMT_NO // Requirements No.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INTR_RMRKS IS '内部備考 // #MS.IORD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INST_ITM_ORD_STS_TYP IS '製造指図時品目オーダ状況区分 // #MS.ITM_ORD_STS_TYP // Item order at mfg. order status type';


COMMENT ON COLUMN MST_ITM_ORDER_IF.ARR_PR_NO IS '入荷進捗ＮＯ // #MA.ARR_PR_NO // Receipt progress No.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.STD_PURC_LT IS '標準納入ＬＴ // #MA.LT // Standard delivery LT';


COMMENT ON COLUMN MST_ITM_ORDER_IF.DLV_RQST_TM IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN MST_ITM_ORDER_IF.RQST_DLV_RQST_TM IS '依頼元納入希望日時 // #MA.TM // Request source desired delivery date and time';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MST_ITM_ORDER_IF.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MST_ITM_ORDER_IF.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_ITM_ORDER_IF.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_ITM_ORDER_IF.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_ITM_ORDER_IF.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_ITM_ORDER_IF.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_ITM_ORDER_IF.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_ITM_ORDER_IF.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_ITM_ORDER_IF.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_ITM_ORDER_IF.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_ITM_ORDER_IF.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

