
COMMENT ON TABLE MST_SHIP_PR IS '出荷進捗 // Shipping progress';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_PR_NO IS '出荷進捗ＮＯ // #MA.SHIP_PR_NO // Shipping progress No.';


COMMENT ON COLUMN MST_SHIP_PR.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_SHIP_PR.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_SHIP_PR.SLO_D_NO IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN MST_SHIP_PR.XFR_SCHD_NO IS '移動・移送予定ＮＯ // #MA.XFR_SCHD_NO // Movement/transport schedule No.';


COMMENT ON COLUMN MST_SHIP_PR.RQST_DPT_CD IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN MST_SHIP_PR.RQST_USR_CD IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN MST_SHIP_PR.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_RQST_TM IS '出荷希望日時 // #MA.TM // Desired shipping date and time';


COMMENT ON COLUMN MST_SHIP_PR.DLV_RQST_TM IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN MST_SHIP_PR.PRMS_DT IS '納期回答日 // #MA.DT // order promising date';


COMMENT ON COLUMN MST_SHIP_PR.PRMS_DLV_DT IS '回答納入日 // #MA.DT // Replied delivery date';


COMMENT ON COLUMN MST_SHIP_PR.DLV_INST_RCPT_DT IS '納入指示受領日 // #MA.DT // Delivery order received date';


COMMENT ON COLUMN MST_SHIP_PR.DLV_INST_PRMS_DT IS '納入指示回答日 // #MA.DT // Delivery order replied date';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_SCHD_TM IS '出荷予定日時 // #MA.TM // Scheduled shipping date and time';


COMMENT ON COLUMN MST_SHIP_PR.DLV_SCHD_TM IS '納品予定日時 // #MA.TM // Scheduled delivery date and time';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TM IS '出荷日時 // #MA.TM // Shipping date and time';


COMMENT ON COLUMN MST_SHIP_PR.DLV_TM IS '納品日時 // #MA.TM // Delivery date and time';


COMMENT ON COLUMN MST_SHIP_PR.SLS_DT IS '売上日 // #MA.DT // Sales date';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TO_LG_GRP_CD IS '出荷先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN MST_SHIP_PR.DLV_ID_TYP IS '納品先識別区分 // #MS.DLV_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN MST_SHIP_PR.DLV_ID_CD IS '納品先識別ＣＤ // #MS.DLV_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN MST_SHIP_PR.DLV_ID_NM IS '納品先識別名 // #MS.DLV_ID_NM // Delivery destination identification name';


COMMENT ON COLUMN MST_SHIP_PR.DLV_ZIP_CD IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_PR.DLV_ADDR1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_PR.DLV_ADDR2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_PR.DLV_ADDR3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_PR.DLV_ADDR4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_PR.DLV_CNTCT_DPT IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN MST_SHIP_PR.DLV_CNTCT_PSN IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN MST_SHIP_PR.DLV_TEL IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_PR.DLV_FAX IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_PR.DLV_SUNDRY_FLG IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN MST_SHIP_PR.DLV_STR_LN_CD IS '納品棚・ラインＣＤ // #MA.STR_LN_CD // Delivery rack/line cd.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TO_ID_TYP IS '送付先識別区分 // #MS.SHIP_TO_ID_TYP // Receiving point identification type';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TO_ID_CD IS '送付先識別ＣＤ // #MS.SHIP_TO_ID_CD // Receiving point identification cd.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TO_ID_NM IS '送付先識別名 // #MS.SHIP_TO_ID_NM // Receiving point Identification name';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TO_ZIP_CD IS '送付先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TO_ADDR1 IS '送付先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TO_ADDR2 IS '送付先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TO_ADDR3 IS '送付先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TO_ADDR4 IS '送付先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TO_CNTCT_DPT IS '送付先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TO_CNTCT_PSN IS '送付先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TO_TEL IS '送付先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TO_FAX IS '送付先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TO_SUNDRY_FLG IS '送付先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN MST_SHIP_PR.VIA_DLV_TYP IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN MST_SHIP_PR.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_SHIP_PR.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_SHIP_PR.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_SHIP_PR.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_SHIP_PR.PRMS_QTY IS '納期回答数量 // #MA.QTY // Order promising qty.';


COMMENT ON COLUMN MST_SHIP_PR.DLV_INST_RCPT_QTY IS '納入指示受領数量 // #MA.QTY // Delivery order received qty.';


COMMENT ON COLUMN MST_SHIP_PR.DLV_INST_PRMS_QTY IS '納入指示回答数量 // #MA.QTY // Delivery order replied qty.';


COMMENT ON COLUMN MST_SHIP_PR.RE_SHIP_SCHD_QTY IS '再出荷予定数量 // #MA.QTY // Scheduled re-shipping qty.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_INST_QTY IS '出荷指図数量 // #MA.QTY // Shipping order qty.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_ACT_QTY IS '出荷実績数量 // #MA.QTY // Shipping result qty.';


COMMENT ON COLUMN MST_SHIP_PR.IV_SCHD_QTY IS 'インボイス出荷予定数量 // #MA.QTY // Invoice shipping scheduled qty.';


COMMENT ON COLUMN MST_SHIP_PR.IV_ACT_QTY IS 'インボイス出荷実績数量 // #MA.QTY // Invoice shipping result qty.';


COMMENT ON COLUMN MST_SHIP_PR.SLS_QTY IS '売上数量 // #MA.QTY // Sales qty.';


COMMENT ON COLUMN MST_SHIP_PR.DLV_QTY IS '納品数量 // #MA.QTY // Delivery qty.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_RET_QTY IS '出荷返品数量 // #MA.QTY // Shipping return qty.';


COMMENT ON COLUMN MST_SHIP_PR.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_SCHD_ABORT_QTY IS '出荷予定打切数量 // #MA.QTY // Cancelled remaining shipping schedule qty.';


COMMENT ON COLUMN MST_SHIP_PR.SLS_SCHD_ABORT_QTY IS '売上予定打切数量 // #MA.QTY // Cancelled remaining sales schedule qty.';


COMMENT ON COLUMN MST_SHIP_PR.ACT_DLV_LT IS '納品ＬＴ // #MA.LT // Delivery LT';


COMMENT ON COLUMN MST_SHIP_PR.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MST_SHIP_PR.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_TERM_CD IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_INST_TYP IS '出荷指図区分 // #MA.SHIP_INST_TYP // Shipping order type';


COMMENT ON COLUMN MST_SHIP_PR.PURC_DDLV_FLG IS '仕入直送ＦＬＧ // #MA.FLG // Direct delivery flg.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_SCHD_SPLIT_TYP IS '出荷予定分割区分 // #MA.SHIP_SCHD_SPLIT_TYP // Shipping schedule split type';


COMMENT ON COLUMN MST_SHIP_PR.ALLOC_SCOPE_TYP IS '引当範囲区分 // #MA.ALLOC_SCOPE_TYP // Allocation range type';


COMMENT ON COLUMN MST_SHIP_PR.ALLOC_TYP IS '引当区分 // #MA.ALLOC_TYP // Allocation type';


COMMENT ON COLUMN MST_SHIP_PR.ALLOC_GRP_CD IS '総量引当場所グループＣＤ // #MA.ALLOC_GRP_CD // Gross allocation location group cd.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_LG_GRP_CD IS '出荷物流グループＣＤ // #MA.LG_GRP_CD // Shipping distribution group cd.';


COMMENT ON COLUMN MST_SHIP_PR.DEF_LOC_CD IS 'デフォルト場所ＣＤ // #MA.LOC_CD // Default location cd.';


COMMENT ON COLUMN MST_SHIP_PR.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_SHIP_PR.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_SHIP_PR.PERIOD_BLOCK_FLG IS '引当期間保留ＦＬＧ // #MA.FLG // Allocation period pending flg.';


COMMENT ON COLUMN MST_SHIP_PR.SLS_STS_TYP IS '販売状況区分 // #MS.SLS_STS_TYP // Sales status type';


COMMENT ON COLUMN MST_SHIP_PR.PRMS_DLV_DT_OVERDUE_FLG IS '回答納入日遅れＦＬＧ // #MA.FLG // Replied delivery date delay flg.';


COMMENT ON COLUMN MST_SHIP_PR.DLV_RQST_DT_OVERDUE_FLG IS '納入希望日遅れＦＬＧ // #MA.FLG // Delivery dates delayed flg.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_SCHD_SPLIT_FLG IS '出荷予定分割ＦＬＧ // #MA.FLG // Shipping schedule split flg.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_CMPL_FLG IS '出荷完了ＦＬＧ // #MA.FLG // Shipping completion flg.';


COMMENT ON COLUMN MST_SHIP_PR.SLS_CMPL_FLG IS '売上完了ＦＬＧ // #MA.FLG // Sales completed flg.';


COMMENT ON COLUMN MST_SHIP_PR.DLV_CMPL_FLG IS '納品完了ＦＬＧ // #MA.FLG // Delivery completion flg.';


COMMENT ON COLUMN MST_SHIP_PR.SHIP_CNT_RMRKS IS '出荷連絡備考 // #MS.SHIP_CNT_RMRKS // Shipping notification remarks';


COMMENT ON COLUMN MST_SHIP_PR.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_SHIP_PR.SUB_CHAR1 IS '予備１ // #MS.SHIP_PR_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_SHIP_PR.SUB_CHAR2 IS '予備２ // #MS.SHIP_PR_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_SHIP_PR.SUB_CHAR3 IS '予備３ // #MS.SHIP_PR_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_SHIP_PR.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SHIP_PR.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SHIP_PR.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SHIP_PR.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SHIP_PR.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SHIP_PR.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SHIP_PR.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SHIP_PR.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SHIP_PR.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SHIP_PR.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MST_SHIP_PR.NOT_LG_MIX_FLG IS '物流グループ混在不可ＦＬＧ // #MA.FLG // Prohibit mixed distribution group flg.';

