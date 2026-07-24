
COMMENT ON TABLE MST_IV_D_ALL IS 'インボイス明細 // Invoice details';


COMMENT ON COLUMN MST_IV_D_ALL.IV_D_NO IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN MST_IV_D_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_IV_D_ALL.IV_MNG_NO IS 'インボイス管理ＮＯ // #MA.IV_MNG_NO // Invoice management No.';


COMMENT ON COLUMN MST_IV_D_ALL.IV_REV IS 'インボイス改訂番号 // #MA.SLIP_REV // Invoice rev. number';


COMMENT ON COLUMN MST_IV_D_ALL.DISP_SEQ IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN MST_IV_D_ALL.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MST_IV_D_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_IV_D_ALL.SLO_D_NO IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN MST_IV_D_ALL.XFR_SCHD_NO IS '移動・移送予定ＮＯ // #MA.XFR_SCHD_NO // Movement/transport schedule No.';


COMMENT ON COLUMN MST_IV_D_ALL.CST_PO_NO IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN MST_IV_D_ALL.CST_PO_D_NO IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN MST_IV_D_ALL.BNDL_FLG IS 'まとめＦＬＧ // #MA.FLG // Aggregation flg.';


COMMENT ON COLUMN MST_IV_D_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_IV_D_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_IV_D_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_IV_D_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_IV_D_ALL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_IV_D_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_IV_D_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_IV_D_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_IV_D_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_IV_D_ALL.IV_ITM_NM IS 'インボイス表記用品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN MST_IV_D_ALL.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MST_IV_D_ALL.CST_ITM_NM IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MST_IV_D_ALL.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_IV_D_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_IV_D_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_IV_D_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_IV_D_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_IV_D_ALL.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_IV_D_ALL.UPRI_NOT_TGT_FLG IS '単価再取得対象外ＦＬＧ // #MA.FLG // Not to reacquire unit price flg.';


COMMENT ON COLUMN MST_IV_D_ALL.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_IV_D_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_IV_D_ALL.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_IV_D_ALL.IV_UPRI IS 'インボイス表記単価 // #MA.MONEY // Unit price for invoice';


COMMENT ON COLUMN MST_IV_D_ALL.IV_AMT IS 'インボイス表記金額 // #MA.MONEY // Amount for invoice';


COMMENT ON COLUMN MST_IV_D_ALL.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_IV_D_ALL.TAX_FIX_FLG IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN MST_IV_D_ALL.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_IV_D_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_IV_D_ALL.PTAX_CUR_AMT IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN MST_IV_D_ALL.WTAX_RATE IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MST_IV_D_ALL.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MST_IV_D_ALL.CNTRY_ORG_CD IS '原産地ＣＤ // #MA.CNTRY_CD // Place of origin cd.';


COMMENT ON COLUMN MST_IV_D_ALL.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MST_IV_D_ALL.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_IV_D_ALL.SLS_DPT_CD IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MST_IV_D_ALL.SLS_USR_CD IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN MST_IV_D_ALL.DSCNT_RSN_CD IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN MST_IV_D_ALL.MANUAL_ADD_FLG IS 'マニュアル追加ＦＬＧ // #MA.FLG // Manual addition flg.';


COMMENT ON COLUMN MST_IV_D_ALL.AR_DPT_CD IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN MST_IV_D_ALL.DLV_RQST_TM IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN MST_IV_D_ALL.PURC_SCHD_NO IS '仕入予定ＮＯ // #MA.PURC_SCHD_NO // Purchase schedule No.';


COMMENT ON COLUMN MST_IV_D_ALL.IV_D_RMRKS IS 'インボイス明細備考 // #MS.IV_D_RMRKS // Invoice details remarks';


COMMENT ON COLUMN MST_IV_D_ALL.CASE_MRK1 IS 'ケースマーク１ // #MS.CASE_MRK // Case mark 1';


COMMENT ON COLUMN MST_IV_D_ALL.CASE_MRK2 IS 'ケースマーク２ // #MS.CASE_MRK // Case mark 2';


COMMENT ON COLUMN MST_IV_D_ALL.CASE_MRK3 IS 'ケースマーク３ // #MS.CASE_MRK // Case mark 3';


COMMENT ON COLUMN MST_IV_D_ALL.CASE_MRK4 IS 'ケースマーク４ // #MS.CASE_MRK // Case mark 4';


COMMENT ON COLUMN MST_IV_D_ALL.CASE_MRK5 IS 'ケースマーク５ // #MS.CASE_MRK // Case mark 5';


COMMENT ON COLUMN MST_IV_D_ALL.CASE_MRK6 IS 'ケースマーク６ // #MS.CASE_MRK // Case mark 6';


COMMENT ON COLUMN MST_IV_D_ALL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_IV_D_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_IV_D_ALL.INTR_D_RMRKS IS '内部明細備考 // #MS.IV_D_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN MST_IV_D_ALL.SUB_CHAR1 IS '予備１ // #MS.IV_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_IV_D_ALL.SUB_CHAR2 IS '予備２ // #MS.IV_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_IV_D_ALL.SUB_CHAR3 IS '予備３ // #MS.IV_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_IV_D_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_IV_D_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_IV_D_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_IV_D_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_IV_D_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_IV_D_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_IV_D_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_IV_D_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_IV_D_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_IV_D_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

