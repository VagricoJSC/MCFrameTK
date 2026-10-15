
COMMENT ON TABLE MST_SLO IS '受注ヘッダ // Sales order header';


COMMENT ON COLUMN MST_SLO.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MST_SLO.SLO_REV IS '受注改訂番号 // #MA.SLIP_REV // Sales order rev. number';


COMMENT ON COLUMN MST_SLO.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_SLO.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_SLO.SLO_DT IS '受注日 // #MA.DT // Sales order date';


COMMENT ON COLUMN MST_SLO.SLO_TYP IS '受注区分 // #MS.SLO_TYP // Sales order type';


COMMENT ON COLUMN MST_SLO.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_SLO.CST_PO_NO IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN MST_SLO.CST_PO_REV IS '得意先注文改訂番号 // #MA.SLIP_REV // Customer order rev. number';


COMMENT ON COLUMN MST_SLO.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_SLO.XRATE_INPT_FLG IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN MST_SLO.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_SLO.PTAX_XRATE_INPT_FLG IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN MST_SLO.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MST_SLO.SLS_USR_CD IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN MST_SLO.SLS_DPT_CD IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MST_SLO.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_SLO.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_SLO.TTERM_CD1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN MST_SLO.TTERM_RMRKS1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN MST_SLO.TTERM_CD2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN MST_SLO.TTERM_RMRKS2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN MST_SLO.TTERM_CD3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN MST_SLO.TTERM_RMRKS3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN MST_SLO.TRNSPT_CD IS '輸送方法ＣＤ // #MA.TRNSPT_CD // Transportation method cd.';


COMMENT ON COLUMN MST_SLO.VSSL_FLGHT IS '船名／便名 // #MA.VSSL_FLGHT // Ship/flight name';


COMMENT ON COLUMN MST_SLO.LOAD_PORT_CD IS '船積港ＣＤ // #MA.PORT_CD // Loading port cd.';


COMMENT ON COLUMN MST_SLO.ETD_DT IS '船積予定日 // #MA.DT // Estimated date of loading';


COMMENT ON COLUMN MST_SLO.DSCHRG_PORT_CD IS '船卸港ＣＤ // #MA.PORT_CD // Unloading port cd.';


COMMENT ON COLUMN MST_SLO.ETA_DT IS '船卸予定日 // #MA.DT // Estimated date of unloading';


COMMENT ON COLUMN MST_SLO.VIA_PORT_CD IS '経由地ＣＤ // #MA.PORT_CD // Stopover point cd.';


COMMENT ON COLUMN MST_SLO.VIA_SCHD_DT IS '経由予定日 // #MA.DT // Estimated stopover date';


COMMENT ON COLUMN MST_SLO.ASSORT_TYP IS '品揃区分 // #MS.SHIP_ASSORT_TYP // Assortment type';


COMMENT ON COLUMN MST_SLO.SLS_BASIS_TYP IS '売上計上区分 // #MA.SLS_BASIS_TYP // Revenue recording type';


COMMENT ON COLUMN MST_SLO.AR_DPT_CD IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN MST_SLO.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_SLO.RCPT_DT IS '受付日 // #MA.DT // Receiving date';


COMMENT ON COLUMN MST_SLO.RCPT_USR_CD IS '受付担当者ＣＤ // #MA.USR_CD // Receiving PIC cd.';


COMMENT ON COLUMN MST_SLO.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_SLO.INTR_RMRKS IS '内部備考 // #MS.SLO_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_SLO.CST_PO_RMRKS IS '得意先注文備考 // #MS.CST_PO_RMRKS // Customer order remarks';


COMMENT ON COLUMN MST_SLO.QTN_NO IS '見積ＮＯ // #MA.QTN_NO // Quotation No.';


COMMENT ON COLUMN MST_SLO.QTN_REV IS '見積改訂番号 // #MA.SLIP_REV // Quotation rev. number';


COMMENT ON COLUMN MST_SLO.ADV_SHIP_CTRL_TYP IS '前受金出荷制御区分 // #MS.ADV_SHIP_CTRL_TYP // Advance received control shipping type';


COMMENT ON COLUMN MST_SLO.ADV_BILL_AMT IS '前受金請求額 // #MA.MONEY // Advance received billing amount';


COMMENT ON COLUMN MST_SLO.ADV_RCV_AMT IS '前受金入金額 // #MA.MONEY // Advance received payment amount';


COMMENT ON COLUMN MST_SLO.SUB_CHAR1 IS '予備１ // #MS.SLO_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_SLO.SUB_CHAR2 IS '予備２ // #MS.SLO_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_SLO.SUB_CHAR3 IS '予備３ // #MS.SLO_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_SLO.APRV_FLG IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN MST_SLO.APRV_NO IS '承認ＮＯ // #MA.APRV_NO // Approval No.';


COMMENT ON COLUMN MST_SLO.APRV_STS_TYP IS '承認状況区分 // #MA.APRV_STS_TYP // Approval status type';


COMMENT ON COLUMN MST_SLO.EDI_FLG IS 'ＥＤＩ ＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN MST_SLO.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_SLO.CAN_RSN_CD IS '取消理由ＣＤ // #MS.SLO_RSN_CD // Canceling reason cd.';


COMMENT ON COLUMN MST_SLO.CAN_RMRKS IS '取消備考 // #MS.SLO_CAN_RMRKS // Cancel remarks';


COMMENT ON COLUMN MST_SLO.CRED_UPD_AMT IS '与信更新金額 // #MA.MONEY // Credit update amount';


COMMENT ON COLUMN MST_SLO.EDI_SUB_CHAR1 IS 'ＥＤＩ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI spare CHAR column 1';


COMMENT ON COLUMN MST_SLO.EDI_SUB_CHAR2 IS 'ＥＤＩ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI spare CHAR column 2';


COMMENT ON COLUMN MST_SLO.EDI_SUB_CHAR3 IS 'ＥＤＩ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI spare CHAR column 3';


COMMENT ON COLUMN MST_SLO.EDI_SUB_CHAR4 IS 'ＥＤＩ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI spare CHAR column 4';


COMMENT ON COLUMN MST_SLO.EDI_SUB_CHAR5 IS 'ＥＤＩ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI spare CHAR column 5';


COMMENT ON COLUMN MST_SLO.EDI_SUB_NUM1 IS 'ＥＤＩ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI spare NUM column 1';


COMMENT ON COLUMN MST_SLO.EDI_SUB_DT1 IS 'ＥＤＩ予備ＤＡＴＥ項目１ // #MA.DT // EDI spare DATE column 1';


COMMENT ON COLUMN MST_SLO.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SLO.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SLO.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SLO.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SLO.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SLO.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SLO.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SLO.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SLO.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SLO.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MST_SLO.SLS_DT IS '売上日 // #MA.DT // ';


COMMENT ON COLUMN MST_SLO.SLO_APRV_DT IS '受注日 // #MA.DT // ';


COMMENT ON COLUMN MST_SLO.APRV_DT IS '更新日 // #MA.DT // ';


COMMENT ON COLUMN MST_SLO.SHIP_PRNT_NO_CST_NM_FLG IS '出荷帳票得意先名印字しないＦＬＧ // #MA.FLG // ';


COMMENT ON COLUMN MST_SLO.SRC_WRK_NO IS '元案件ＮＯ // #MA.WRK_NO // ';


COMMENT ON COLUMN MST_SLO.ZOHO_SLS_SCHD_NO IS 'ＺＯＨＯ販売予定ＮＯ // #MA.ZOHO_SLS_SCHD_NO // ';


COMMENT ON COLUMN MST_SLO.SLO_LAST_SLS_FLG IS '受注出荷最終売上 // #MA.FLG // ';


COMMENT ON COLUMN MST_SLO.PROD_ITM_CD IS '製品ＣＤ // #MA.ITM_CD // ';


COMMENT ON COLUMN MST_SLO.PROD_ITM_SUB1 IS '製品枝番１ // #MA.ITM_SUB1 // ';


COMMENT ON COLUMN MST_SLO.PROD_ITM_SUB2 IS '製品枝番２ // #MA.ITM_SUB2 // ';


COMMENT ON COLUMN MST_SLO.PROD_ITM_SUB3 IS '製品枝番３ // #MA.ITM_SUB3 // ';


COMMENT ON COLUMN MST_SLO.PROD_ITM_NM IS '製品名 // #MA.ITM_NM // ';


COMMENT ON COLUMN MST_SLO.SURV_LINE_QTY IS '測線数 // #MA.SURV_LINE_QTY // ';


COMMENT ON COLUMN MST_SLO.DIAMETER IS '口径 // #MA.DIAMETER // ';


COMMENT ON COLUMN MST_SLO.MATCH_KEY IS '照合ＫＥＹ // #MA.MATCH_KEY // ';


COMMENT ON COLUMN MST_SLO.RCPT_NO IS '受付番号 // #MA.RCPT_NO // ';


COMMENT ON COLUMN MST_SLO.APPL_DOC_NO IS '申請書番号 // #MA.APPL_DOC_NO // ';


COMMENT ON COLUMN MST_SLO.DLV_DRAW_NO IS '納入図番号 // #MA.DLV_DRAW_NO // ';


COMMENT ON COLUMN MST_SLO.SLO_NUM_TYP IS '注番区分 // #MA.SLO_NUM_TYP // ';


COMMENT ON COLUMN MST_SLO.SLO_NUM IS '注文番号 // #MA.SLO_NUM // ';


COMMENT ON COLUMN MST_SLO.HDR_QTY IS '数量（ヘッダ） // #MA.QTY // ';


COMMENT ON COLUMN MST_SLO.HDR_AMT IS '金額（ヘッダ） // #MA.MONEY // ';


COMMENT ON COLUMN MST_SLO.PAINT_CLR IS '塗色 // #MA.PAINT_CLR // ';


COMMENT ON COLUMN MST_SLO.SALES_COND IS '売上条件区分 // #MA.SALES_COND // ';


COMMENT ON COLUMN MST_SLO.SHIP_SP_INSTR_TYP IS '出荷特別指示区分 // #MA.SHIP_SP_INSTR_TYP // ';


COMMENT ON COLUMN MST_SLO.SPEC_DLV_NOTE_TYP IS '指定納品書区分 // #MA.SPEC_DLV_NOTE_TYP // ';


COMMENT ON COLUMN MST_SLO.ORD_DLV_DT IS '注文書納期 // #MA.DT // ';


COMMENT ON COLUMN MST_SLO.MRKT_CD IS '市場ＣＤ // #MA.MRKT_CD // ';


COMMENT ON COLUMN MST_SLO.CNTRY_SIGN IS '国別符号 // #MA.CNTRY_SIGN // ';


COMMENT ON COLUMN MST_SLO.VES_NATL IS '船籍 // #MA.VES_NATL // ';


COMMENT ON COLUMN MST_SLO.SHIPYARD_CD IS '造船所 // #MA.SHIPYARD_CD // ';


COMMENT ON COLUMN MST_SLO.VES_NO IS '船番 // #MA.VES_NO // ';


COMMENT ON COLUMN MST_SLO.VES_NM IS '船名 // #MA.VES_NM // ';


COMMENT ON COLUMN MST_SLO.TONNAGE IS '屯数 // #MA.TONNAGE // ';


COMMENT ON COLUMN MST_SLO.VES_TYP IS '船種 // #MA.VES_TYP // ';


COMMENT ON COLUMN MST_SLO.INSP_STD IS '検査規格 // #MA.INSP_STD // ';


COMMENT ON COLUMN MST_SLO.ROYALTY_TRG_AMT IS 'ロイヤリティ対象金額 // #MA.MONEY // ';


COMMENT ON COLUMN MST_SLO.ROYALTY_PSPPL IS 'ロイヤリティ支払先 // #MA.ROYALTY_PSPPL // ';


COMMENT ON COLUMN MST_SLO.INS_LOC_1 IS '設置場所1 // #MA.INS_LOC_CD // ';


COMMENT ON COLUMN MST_SLO.INS_LOC_2 IS '設置場所2 // #MA.INS_LOC_CD // ';


COMMENT ON COLUMN MST_SLO.SFI_NO IS 'SFI番号 // #MA.SFI_NO // ';


COMMENT ON COLUMN MST_SLO.PS_SAL_AFT_DT IS '装備後売上日 // #MA.DT // ';


COMMENT ON COLUMN MST_SLO.WIT_INSP_TYP IS '立会検査有無区分 // #MA.WIT_INSP_TYP // ';


COMMENT ON COLUMN MST_SLO.EQUIP_TYP IS '装備要否区分 // #MA.EQUIP_TYP // ';


COMMENT ON COLUMN MST_SLO.SPEC_DOC_TYP IS '仕様書区分 // #MA.SPEC_DOC_TYP // ';


COMMENT ON COLUMN MST_SLO.MODEL_JP_EN_TYP IS '型式和英区分 // #MA.MODEL_JP_EN_TYP // ';


COMMENT ON COLUMN MST_SLO.INSP_REP_TYP IS '検査成績書（検査成績書区分） // #MA.INSP_REP_TYP // ';


COMMENT ON COLUMN MST_SLO.INSP_REP_QTY IS '検査成績書（検査成績書部数） // #MA.INSP_REP_QTY // ';


COMMENT ON COLUMN MST_SLO.CONS_DRAW_TYP IS '協議図（協議図区分） // #MA.CONS_DRAW_TYP // ';


COMMENT ON COLUMN MST_SLO.CONS_DRAW_QTY IS '協議図（協議図部数） // #MA.CONS_DRAW_QTY // ';


COMMENT ON COLUMN MST_SLO.CONST_DRAW_TYP IS '工事図（工事図区分） // #MA.CONST_DRAW_TYP // ';


COMMENT ON COLUMN MST_SLO.CONST_DRAW_QTY IS '工事図（工事図部数） // #MA.CONST_DRAW_QTY // ';


COMMENT ON COLUMN MST_SLO.COMP_DRAW_TYP IS '完成図（完成図区分） // #MA.COMP_DRAW_TYP // ';


COMMENT ON COLUMN MST_SLO.COMP_DRAW_QTY IS '完成図（完成図部数） // #MA.COMP_DRAW_QTY // ';


COMMENT ON COLUMN MST_SLO.INST_MANUAL_TYP IS '取扱説明書（取扱説明書区分） // #MA.INST_MANUAL_TYP // ';


COMMENT ON COLUMN MST_SLO.INST_MANUAL_QTY IS '取扱説明書（取扱説明書部数） // #MA.INST_MANUAL_QTY // ';


COMMENT ON COLUMN MST_SLO.APRV_DRAW_TYP IS '承認図（承認図区分） // #MA.APRV_DRAW_TYP // ';


COMMENT ON COLUMN MST_SLO.APRV_DRAW_QTY IS '承認図（承認図部数） // #MA.APRV_DRAW_QTY // ';


COMMENT ON COLUMN MST_SLO.SLO_CNG_RSN IS '受注変更理由 // #MA.SLO_CNG_RSN // ';


COMMENT ON COLUMN MST_SLO.FRC_RSN_CD IS '無償理由ＣＤ // #MA.FRC_RSN_CD // ';


COMMENT ON COLUMN MST_SLO.MAIN_DRAW_NO IS '代表図番 // #MA.MAIN_DRAW_NO // ';


COMMENT ON COLUMN MST_SLO.SLO_CMNT_1 IS 'コメント１ // #MA.MST_MEMO1 // ';


COMMENT ON COLUMN MST_SLO.SLO_CMNT_2 IS 'コメント２ // #MA.MST_MEMO2 // ';


COMMENT ON COLUMN MST_SLO.SLO_CMNT_3 IS 'コメント３ // #MA.MST_MEMO3 // ';


COMMENT ON COLUMN MST_SLO.SLO_CMNT_4 IS 'コメント４ // #MA.MST_MEMO4 // ';


COMMENT ON COLUMN MST_SLO.SLO_CMNT_5 IS 'コメント５ // #MA.MST_MEMO5 // ';


COMMENT ON COLUMN MST_SLO.SRC_SHIP_FLG IS '元出荷基準ＦＬＧ // #MA.FLG // ';


COMMENT ON COLUMN MST_SLO.JIP_SLO_TYP IS '受注種別 // #MA.JIP_SLO_TYP // ';


COMMENT ON COLUMN MST_SLO.JIP_CST_CD IS '客先コード // #MA.CST_CD // ';

