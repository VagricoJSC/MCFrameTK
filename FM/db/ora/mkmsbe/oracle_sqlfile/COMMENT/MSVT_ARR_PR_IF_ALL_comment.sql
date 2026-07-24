
COMMENT ON TABLE MSVT_ARR_PR_IF_ALL IS '入荷進捗送信ＩＦビュー // Receipt progress export IF view';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.DPT_ST_DT IS '部門マスタ適用開始日 // #MA.DT // Dept. master application start date';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.DATA_UPD_TS IS '送信元レコード更新日時 // #MA.SYS_TS // Update date and time of source record';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.BI_NOT_SEND_FLG IS 'ＢＩ送信対象外ＦＬＧ // #MA.FLG // BI not to be exported flg.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.ARR_PR_NO IS '入荷進捗ＮＯ // #MA.ARR_PR_NO // Receipt progress No.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SLS_RET_SCHD_D_NO IS '売上返品予定明細ＮＯ // #MA.SLS_RET_SCHD_D_NO // Sales return schedule details No.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.DLV_SLIP_D_NO IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.IV_D_NO IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.RQST_DPT_CD IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.RQST_WG_CD IS '依頼元ワーキンググループＣＤ // #MA.WG_CD // Requesting WG cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.RQST_USR_CD IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SRET_FR_CD IS '引取先ＣＤ // #MA.BP_CD // Pickup company cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.RET_DLV_SLIP_D_NO IS '返品元納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Return-from delivery note details No.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.RET_STK_ARRV_BP_CD IS '返品元在庫着荷先ＣＤ // #MA.BP_CD // Return-from inventory arrival destination cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.DLV_RQST_TM IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PRMS_RCPT_DT IS '納期回答受領日 // #MA.DT // Order promising result received date';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PRMS_DLV_DT IS '回答納入日 // #MA.DT // Replied delivery date';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PRMS_REFL_DT IS '納期回答反映日 // #MA.DT // Order promising applied date';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.DLV_INST_DT IS '納入指示日 // #MA.DT // Delivery order date';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.DLV_INST_PRMS_RCPT_DT IS '納入指示回答受領日 // #MA.DT // Delivery order replied received date';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.DLV_INST_PRMS_REFL_DT IS '納入指示回答反映日 // #MA.DT // Delivery order reply applied date';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.ARR_SCHD_TM IS '入荷予定日時 // #MA.TM // Scheduled receipt date and time';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.ARR_TM IS '入荷日時 // #MA.TM // Receipt date and time';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PURC_DT IS '仕入日 // #MA.DT // Purchase date';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PRMS_RCPT_QTY IS '納期回答受領数量 // #MA.QTY // Order promising result received qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PRMS_REFL_QTY IS '納期回答反映済数量 // #MA.QTY // Order promising applied qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.DLV_INST_QTY IS '納入指示数量 // #MA.QTY // Delivery order qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.DLV_INST_PRMS_RCPT_QTY IS '納入指示回答受領数量 // #MA.QTY // Delivery order replied received qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.DLV_INST_PRMS_REFL_QTY IS '納入指示回答反映済数量 // #MA.QTY // Delivery order reply applied qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.RE_ARR_SCHD_QTY IS '再入荷予定数量 // #MA.QTY // Scheduled re-receipt qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.RCPT_IV_QTY IS '受領インボイス数量 // #MA.QTY // Purchase invoice qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.ARR_QTY IS '入荷数量 // #MA.QTY // Receipt qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PURC_QTY IS '仕入数量 // #MA.QTY // Purchase qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SLS_RET_QTY IS '売上返品数量 // #MA.QTY // Sales return qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.ARR_SCHD_ABORT_QTY IS '入荷予定打切数量 // #MA.QTY // Cancelled remaining receipt schedule qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PURC_SCHD_ABORT_QTY IS '仕入予定打切数量 // #MA.QTY // Cancelled remaining purchase schedule qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SLS_RET_SCHD_ABORT_QTY IS '売上返品予定打切数量 // #MA.QTY // Cancelled remaining sales return schedule qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.ACCPT_DFCT_QTY IS '検収不良数量 // #MA.QTY // Acceptance defective qty.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.STD_PURC_LT IS '標準納入ＬＴ // #MA.LT // Standard delivery LT';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.ACT_PURC_LT IS '納入ＬＴ // #MA.LT // Delivery LT';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PURC_STS_TYP IS '購買状況区分 // #MS.PURC_STS_TYP // Purchase status type';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PRMS_DLV_DT_OVERDUE_FLG IS '回答納入日遅れＦＬＧ // #MA.FLG // Replied delivery date delay flg.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.DLV_RQST_DT_OVERDUE_FLG IS '納入希望日遅れＦＬＧ // #MA.FLG // Delivery dates delayed flg.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.ARR_CMPL_FLG IS '入荷完了ＦＬＧ // #MA.FLG // Receipt completed flg.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PURC_CMPL_FLG IS '仕入完了ＦＬＧ // #MA.FLG // Purchase completion flg.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SLS_RET_CMPL_FLG IS '売上返品完了ＦＬＧ // #MA.FLG // Sales return completion flg.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.ARR_CNT_RMRKS IS '入荷連絡備考 // #MS.ARR_CNT_RMRKS // Receipt contact remarks';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.PO_DT IS '発注日 // #MA.DT // PO date';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MSVT_ARR_PR_IF_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

