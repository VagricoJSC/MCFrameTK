
COMMENT ON TABLE MST_PL_D IS 'パッキング明細 // Packing details';


COMMENT ON COLUMN MST_PL_D.PL_D_NO IS 'パッキングリスト明細ＮＯ // #MA.PL_D_NO // Packing list details No.';


COMMENT ON COLUMN MST_PL_D.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_PL_D.DISP_SEQ IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN MST_PL_D.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_PL_D.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_PL_D.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_PL_D.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_PL_D.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_PL_D.IV_ITM_NM IS 'インボイス表記用品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN MST_PL_D.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_PL_D.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_PL_D.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_PL_D.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_PL_D.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_PL_D.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_PL_D.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_PL_D.CNTNR_CD IS '梱包容器ＣＤ // #MA.CNTNR_CD // Packing container cd.';


COMMENT ON COLUMN MST_PL_D.CNTNR_NO_FR IS '梱包番号ＦＲ // #MS.CNTNR_NO // Container No. FR';


COMMENT ON COLUMN MST_PL_D.CNTNR_NO_TO IS '梱包番号ＴＯ // #MS.CNTNR_NO // Container No. TO';


COMMENT ON COLUMN MST_PL_D.NET_WT IS '純重量 // #MA.WT // Net weight';


COMMENT ON COLUMN MST_PL_D.GRSS_WT IS '総重量 // #MA.WT // Gross weight';


COMMENT ON COLUMN MST_PL_D.DIM IS '容積 // #MA.DIM // Volume';


COMMENT ON COLUMN MST_PL_D.CNTRY_ORG_CD IS '原産地ＣＤ // #MA.CNTRY_CD // Place of origin cd.';


COMMENT ON COLUMN MST_PL_D.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MST_PL_D.CST_ITM_NM IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MST_PL_D.CST_PO_NO IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN MST_PL_D.CST_PO_D_NO IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN MST_PL_D.PL_D_RMRKS IS 'パッキングリスト明細備考 // #MS.PL_D_RMRKS // Packing list details remarks';


COMMENT ON COLUMN MST_PL_D.INTR_D_RMRKS IS '内部明細備考 // #MS.PL_D_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN MST_PL_D.SUB_CHAR1 IS '予備１ // #MS.PL_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_PL_D.SUB_CHAR2 IS '予備２ // #MS.PL_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_PL_D.SUB_CHAR3 IS '予備３ // #MS.PL_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_PL_D.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PL_D.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PL_D.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PL_D.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PL_D.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PL_D.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PL_D.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PL_D.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PL_D.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PL_D.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

