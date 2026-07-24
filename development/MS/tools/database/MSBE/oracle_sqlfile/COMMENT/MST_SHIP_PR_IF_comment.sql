
COMMENT ON TABLE MST_SHIP_PR_IF IS '出荷進捗送信ＩＦ // Shipping progress export IF';


COMMENT ON COLUMN MST_SHIP_PR_IF.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MST_SHIP_PR_IF.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_SHIP_PR_IF.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_SHIP_PR_IF.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MST_SHIP_PR_IF.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.DPT_ST_DT IS '部門マスタ適用開始日 // #MA.DT // Dept. master application start date';


COMMENT ON COLUMN MST_SHIP_PR_IF.DATA_UPD_TS IS '送信元レコード更新日時 // #MA.SYS_TS // Update date and time of source record';


COMMENT ON COLUMN MST_SHIP_PR_IF.BI_NOT_SEND_FLG IS 'ＢＩ送信対象外ＦＬＧ // #MA.FLG // BI not to be exported flg.';


COMMENT ON COLUMN MST_SHIP_PR_IF.SHIP_PR_NO IS '出荷進捗ＮＯ // #MA.SHIP_PR_NO // Shipping progress No.';


COMMENT ON COLUMN MST_SHIP_PR_IF.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_SHIP_PR_IF.SLO_D_NO IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN MST_SHIP_PR_IF.RQST_DPT_CD IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.RQST_USR_CD IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.SHIP_RQST_TM IS '出荷希望日時 // #MA.TM // Desired shipping date and time';


COMMENT ON COLUMN MST_SHIP_PR_IF.DLV_RQST_TM IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN MST_SHIP_PR_IF.PRMS_DT IS '納期回答日 // #MA.DT // order promising date';


COMMENT ON COLUMN MST_SHIP_PR_IF.PRMS_DLV_DT IS '回答納入日 // #MA.DT // Replied delivery date';


COMMENT ON COLUMN MST_SHIP_PR_IF.DLV_INST_RCPT_DT IS '納入指示受領日 // #MA.DT // Delivery order received date';


COMMENT ON COLUMN MST_SHIP_PR_IF.DLV_INST_PRMS_DT IS '納入指示回答日 // #MA.DT // Delivery order replied date';


COMMENT ON COLUMN MST_SHIP_PR_IF.SHIP_SCHD_TM IS '出荷予定日時 // #MA.TM // Scheduled shipping date and time';


COMMENT ON COLUMN MST_SHIP_PR_IF.DLV_SCHD_TM IS '納品予定日時 // #MA.TM // Scheduled delivery date and time';


COMMENT ON COLUMN MST_SHIP_PR_IF.SHIP_TM IS '出荷日時 // #MA.TM // Shipping date and time';


COMMENT ON COLUMN MST_SHIP_PR_IF.DLV_TM IS '納品日時 // #MA.TM // Delivery date and time';


COMMENT ON COLUMN MST_SHIP_PR_IF.SLS_DT IS '売上日 // #MA.DT // Sales date';


COMMENT ON COLUMN MST_SHIP_PR_IF.SHIP_TO_LG_GRP_CD IS '出荷先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.TDLV_CD IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.VIA_DLV_TYP IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN MST_SHIP_PR_IF.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.PRMS_QTY IS '納期回答数量 // #MA.QTY // Order promising qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.DLV_INST_RCPT_QTY IS '納入指示受領数量 // #MA.QTY // Delivery order received qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.DLV_INST_PRMS_QTY IS '納入指示回答数量 // #MA.QTY // Delivery order replied qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.RE_SHIP_SCHD_QTY IS '再出荷予定数量 // #MA.QTY // Scheduled re-shipping qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.SHIP_INST_QTY IS '出荷指図数量 // #MA.QTY // Shipping order qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.SHIP_ACT_QTY IS '出荷実績数量 // #MA.QTY // Shipping result qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.IV_SCHD_QTY IS 'インボイス出荷予定数量 // #MA.QTY // Invoice shipping scheduled qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.IV_ACT_QTY IS 'インボイス出荷実績数量 // #MA.QTY // Invoice shipping result qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.SLS_QTY IS '売上数量 // #MA.QTY // Sales qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.DLV_QTY IS '納品数量 // #MA.QTY // Delivery qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.SHIP_RET_QTY IS '出荷返品数量 // #MA.QTY // Shipping return qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MST_SHIP_PR_IF.SHIP_SCHD_ABORT_QTY IS '出荷予定打切数量 // #MA.QTY // Cancelled remaining shipping schedule qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.SLS_SCHD_ABORT_QTY IS '売上予定打切数量 // #MA.QTY // Cancelled remaining sales schedule qty.';


COMMENT ON COLUMN MST_SHIP_PR_IF.ACT_DLV_LT IS '納品ＬＴ // #MA.LT // Delivery LT';


COMMENT ON COLUMN MST_SHIP_PR_IF.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.SHIP_TERM_CD IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.SHIP_INST_TYP IS '出荷指図区分 // #MA.SHIP_INST_TYP // Shipping order type';


COMMENT ON COLUMN MST_SHIP_PR_IF.SLS_STS_TYP IS '販売状況区分 // #MS.SLS_STS_TYP // Sales status type';


COMMENT ON COLUMN MST_SHIP_PR_IF.PRMS_DLV_DT_OVERDUE_FLG IS '回答納入日遅れＦＬＧ // #MA.FLG // Replied delivery date delay flg.';


COMMENT ON COLUMN MST_SHIP_PR_IF.DLV_RQST_DT_OVERDUE_FLG IS '納入希望日遅れＦＬＧ // #MA.FLG // Delivery dates delayed flg.';


COMMENT ON COLUMN MST_SHIP_PR_IF.SHIP_CMPL_FLG IS '出荷完了ＦＬＧ // #MA.FLG // Shipping completion flg.';


COMMENT ON COLUMN MST_SHIP_PR_IF.SLS_CMPL_FLG IS '売上完了ＦＬＧ // #MA.FLG // Sales completed flg.';


COMMENT ON COLUMN MST_SHIP_PR_IF.DLV_CMPL_FLG IS '納品完了ＦＬＧ // #MA.FLG // Delivery completion flg.';


COMMENT ON COLUMN MST_SHIP_PR_IF.SHIP_CNT_RMRKS IS '出荷連絡備考 // #MS.SHIP_CNT_RMRKS // Shipping notification remarks';


COMMENT ON COLUMN MST_SHIP_PR_IF.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_SHIP_PR_IF.SLO_DT IS '受注日 // #MA.DT // Sales order date';


COMMENT ON COLUMN MST_SHIP_PR_IF.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_SHIP_PR_IF.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_SHIP_PR_IF.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_SHIP_PR_IF.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_SHIP_PR_IF.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MST_SHIP_PR_IF.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MST_SHIP_PR_IF.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_SHIP_PR_IF.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_SHIP_PR_IF.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_SHIP_PR_IF.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SHIP_PR_IF.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SHIP_PR_IF.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SHIP_PR_IF.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SHIP_PR_IF.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SHIP_PR_IF.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SHIP_PR_IF.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SHIP_PR_IF.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SHIP_PR_IF.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SHIP_PR_IF.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

