
COMMENT ON TABLE MST_DLV_SLIP_ALL IS '納品伝票ヘッダ // Delivery slip header';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_SLIP_NO IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_SLIP_SEQ IS '納品書連番 // #MA.SLIP_SEQ // Delivery note sequence number';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_SLIP_REV IS '納品書改訂番号 // #MA.SLIP_REV // Delivery note rev. number';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SLIP_STS_TYP IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.TRN_TYP IS 'トランザクション区分 // #MS.TRN_TYP // Transaction type';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_SLIP_INST_NO IS '納品伝票指図ＮＯ // #MA.DLV_SLIP_INST_NO // Delivery slip order No.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_SLIP_ACT_NO IS '納品伝票実績ＮＯ // #MA.DLV_SLIP_ACT_NO // Delivery slip result No.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SLS_ACT_NO IS '売上実績ＮＯ // #MA.SLS_ACT_NO // Sales result No.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SHIP_DLV_SLIP_NO IS '出荷時納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No. at shipping';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DPT_CD IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.USR_CD IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SHIP_TM IS '出荷日時 // #MA.TM // Shipping date and time';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_TM IS '納品日時 // #MA.TM // Delivery date and time';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_RQST_TM IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.TAX_CALC_TYP IS '税計算区分 // #MA.TAX_CALC_TYP // Tax calculation type';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.CST_PO_NO IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.PRI_PRNT_FLG IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.TRD_CUR_NM IS '取引通貨名 // #MA.CUR_NM // Transaction currency name';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.BASE_CUR_DSCNT_AMT IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SLIP_LINE_MAX IS '伝票行数最大値 // #MA.INT // Slip rows max number';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.BP_CD IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.BP_NM IS '取引先名 // #MA.BP_NM // BP name';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.BP_ZIP_CD IS '取引先郵便番号 // #MA.ZIP_CD // BP zip code';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.BP_ADDR1 IS '取引先住所１ // #MA.ADDR // BP address 1';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.BP_ADDR2 IS '取引先住所２ // #MA.ADDR // BP address 2';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.BP_ADDR3 IS '取引先住所３ // #MA.ADDR // BP address 3';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.BP_ADDR4 IS '取引先住所４ // #MA.ADDR // BP address 4';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.BP_CNTCT_DPT IS '取引先部署 // #MA.BP_CNTCT_DPT // BP dept.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.BP_CNTCT_PSN IS '取引先担当者 // #MA.BP_CNTCT_PSN // BP PIC';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.BP_TEL IS '取引先ＴＥＬ // #MA.TEL // BP TEL';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.BP_FAX IS '取引先ＦＡＸ // #MA.TEL // BP FAX';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_ID_TYP IS '納品先識別区分 // #MS.DLV_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_ID_CD IS '納品先識別ＣＤ // #MS.DLV_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_ID_NM IS '納品先識別名 // #MS.DLV_ID_NM // Delivery destination identification name';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_SUNDRY_FLG IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_ZIP_CD IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_ADDR1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_ADDR2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_ADDR3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_ADDR4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_CNTCT_DPT IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_CNTCT_PSN IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_TEL IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.DLV_FAX IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.XFR_LOC_CD IS '振替場所ＣＤ // #MA.LOC_CD // Transfer location cd.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SHIP_FR_LG_GRP_CD IS '出荷元物流グループＣＤ // #MA.LG_GRP_CD // Shipping point distribution group cd.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SLS_BASIS_TYP IS '売上計上区分 // #MA.SLS_BASIS_TYP // Revenue recording type';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SLIP_PRNT_FLG IS '伝票発行済ＦＬＧ // #MA.FLG // Slip issued flg.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SHIP_ADV_PRNT_FLG IS '出荷案内書発行済ＦＬＧ // #MA.FLG // Shipping guide issued flg.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SLS_PRNT_FLG IS '売上伝票発行済ＦＬＧ // #MA.FLG // Sales slip issued flg.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SYNC_FLG IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.ADJST_SLIP_FLG IS '調整伝票ＦＬＧ // #MA.FLG // Adjustment slip flg.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.EDI_FLG IS 'ＥＤＩ　ＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SUB_CHAR1 IS '予備１ // #MS.DLV_SLIP_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SUB_CHAR2 IS '予備２ // #MS.DLV_SLIP_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.SUB_CHAR3 IS '予備３ // #MS.DLV_SLIP_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_DLV_SLIP_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

