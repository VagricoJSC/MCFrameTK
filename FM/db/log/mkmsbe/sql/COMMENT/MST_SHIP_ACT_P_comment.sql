
COMMENT ON TABLE MST_SHIP_ACT_P IS '出荷実績ヘッダ（改訂履歴） // Shipping result header (Rev. history)';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_ACT_NO IS '出荷実績ＮＯ // #MA.SHIP_ACT_NO // Shipping result No.';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_ACT_REV IS '出荷実績改訂番号 // #MA.SLIP_REV // Shipping result rev. number';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_INST_NO IS '出荷指図ＮＯ // #MA.SHIP_INST_NO // Shipping order No.';


COMMENT ON COLUMN MST_SHIP_ACT_P.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TM IS '出荷日時 // #MA.TM // Shipping date and time';


COMMENT ON COLUMN MST_SHIP_ACT_P.DLV_TM IS '納品日時 // #MA.TM // Delivery date and time';


COMMENT ON COLUMN MST_SHIP_ACT_P.RQST_DPT_CD IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN MST_SHIP_ACT_P.RQST_USR_CD IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_FR_LG_GRP_CD IS '出荷元物流グループＣＤ // #MA.LG_GRP_CD // Shipping point distribution group cd.';


COMMENT ON COLUMN MST_SHIP_ACT_P.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TERM_CD IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_DPT_CD IS '出荷部門ＣＤ // #MA.DPT_CD // Shipping dept. cd.';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_USR_CD IS '出荷担当者ＣＤ // #MA.USR_CD // Shipping PIC cd.';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TO_LG_GRP_CD IS '出荷先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN MST_SHIP_ACT_P.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TO_ID_TYP IS '送付先識別区分 // #MS.SHIP_TO_ID_TYP // Receiving point identification type';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TO_ID_CD IS '送付先識別ＣＤ // #MS.SHIP_TO_ID_CD // Receiving point identification cd.';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TO_ID_NM IS '送付先識別名 // #MS.SHIP_TO_ID_NM // Receiving point Identification name';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TO_ZIP_CD IS '送付先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TO_ADDR1 IS '送付先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TO_ADDR2 IS '送付先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TO_ADDR3 IS '送付先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TO_ADDR4 IS '送付先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TO_CNTCT_DPT IS '送付先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TO_CNTCT_PSN IS '送付先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TO_TEL IS '送付先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TO_FAX IS '送付先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_TO_SUNDRY_FLG IS '送付先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN MST_SHIP_ACT_P.VIA_DLV_TYP IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN MST_SHIP_ACT_P.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_SHIP_ACT_P.UPLND_FLG IS '計画外ＦＬＧ // #MA.FLG // Unplanned flg.';


COMMENT ON COLUMN MST_SHIP_ACT_P.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_ADV_PRNT_FLG IS '出荷案内書発行済ＦＬＧ // #MA.FLG // Shipping guide issued flg.';


COMMENT ON COLUMN MST_SHIP_ACT_P.SHIP_ADV_PRNT_TM IS '出荷案内書発行日時 // #MA.TM // Shipping guide issue date and time';


COMMENT ON COLUMN MST_SHIP_ACT_P.DLV_PRNT_FLG IS '納品書発行済ＦＬＧ // #MA.FLG // Delivery note issued flg.';


COMMENT ON COLUMN MST_SHIP_ACT_P.DLV_PRNT_TM IS '納品書発行日時 // #MA.TM // Delivery note issue date and time';


COMMENT ON COLUMN MST_SHIP_ACT_P.INTR_RMRKS IS '内部備考 // #MS.SHIP_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_SHIP_ACT_P.SUB_CHAR1 IS '予備１ // #MS.SHIP_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_SHIP_ACT_P.SUB_CHAR2 IS '予備２ // #MS.SHIP_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_SHIP_ACT_P.SUB_CHAR3 IS '予備３ // #MS.SHIP_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_SHIP_ACT_P.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SHIP_ACT_P.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SHIP_ACT_P.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SHIP_ACT_P.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SHIP_ACT_P.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SHIP_ACT_P.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SHIP_ACT_P.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SHIP_ACT_P.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SHIP_ACT_P.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SHIP_ACT_P.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

