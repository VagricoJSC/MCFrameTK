
COMMENT ON TABLE MST_PURC_RET_SCHD IS '仕入返品予定ヘッダ // Purchase return schedule header';


COMMENT ON COLUMN MST_PURC_RET_SCHD.PURC_RET_SCHD_NO IS '仕入返品予定ＮＯ // #MA.PURC_RET_SCHD_NO // Purchase return schedule No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_PURC_RET_SCHD.PURC_DPT_CD IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD.WG_CD IS 'ＷＧ ＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD.PURC_USR_CD IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD.SPPL_CNTCT_DPT IS '発注先部署 // #MA.BP_CNTCT_DPT // Supplier dept.';


COMMENT ON COLUMN MST_PURC_RET_SCHD.SPPL_CNTCT_PSN IS '発注先担当者 // #MA.BP_CNTCT_PSN // Supplier PIC';


COMMENT ON COLUMN MST_PURC_RET_SCHD.SPPL_ZIP_CD IS '発注先郵便番号 // #MA.ZIP_CD // Supplier zip code';


COMMENT ON COLUMN MST_PURC_RET_SCHD.SPPL_ADDR1 IS '発注先住所１ // #MA.ADDR // Supplier address 1';


COMMENT ON COLUMN MST_PURC_RET_SCHD.SPPL_ADDR2 IS '発注先住所２ // #MA.ADDR // Supplier address 2';


COMMENT ON COLUMN MST_PURC_RET_SCHD.SPPL_ADDR3 IS '発注先住所３ // #MA.ADDR // Supplier address 3';


COMMENT ON COLUMN MST_PURC_RET_SCHD.SPPL_ADDR4 IS '発注先住所４ // #MA.ADDR // Supplier address 4';


COMMENT ON COLUMN MST_PURC_RET_SCHD.SPPL_TEL IS '発注先ＴＥＬ // #MA.TEL // Supplier TEL';


COMMENT ON COLUMN MST_PURC_RET_SCHD.SPPL_FAX IS '発注先ＦＡＸ // #MA.TEL // Supplier FAX';


COMMENT ON COLUMN MST_PURC_RET_SCHD.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_PURC_RET_SCHD.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_PURC_RET_SCHD.XRATE_INPT_FLG IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN MST_PURC_RET_SCHD.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MST_PURC_RET_SCHD.PTAX_XRATE_INPT_FLG IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN MST_PURC_RET_SCHD.RET_SPPL_NM IS '返品先名 // #MA.BP_NM // Return-to name';


COMMENT ON COLUMN MST_PURC_RET_SCHD.RET_SPPL_CNTCT_DPT IS '返品先部署 // #MA.BP_CNTCT_DPT // Return-to dept.';


COMMENT ON COLUMN MST_PURC_RET_SCHD.RET_SPPL_CNTCT_PSN IS '返品先担当者 // #MA.BP_CNTCT_PSN // Return-to PIC';


COMMENT ON COLUMN MST_PURC_RET_SCHD.RET_SPPL_CNTCT_PSN_TITLE IS '返品先担当者敬称 // #MA.BP_PSN_TITLE // Return-to PIC form of address';


COMMENT ON COLUMN MST_PURC_RET_SCHD.RET_SPPL_ZIP_CD IS '返品先郵便番号 // #MA.ZIP_CD // Return-to zip code';


COMMENT ON COLUMN MST_PURC_RET_SCHD.RET_SPPL_ADDR1 IS '返品先住所１ // #MA.ADDR // Return-to address 1';


COMMENT ON COLUMN MST_PURC_RET_SCHD.RET_SPPL_ADDR2 IS '返品先住所２ // #MA.ADDR // Return-to address 2';


COMMENT ON COLUMN MST_PURC_RET_SCHD.RET_SPPL_ADDR3 IS '返品先住所３ // #MA.ADDR // Return-to address 3';


COMMENT ON COLUMN MST_PURC_RET_SCHD.RET_SPPL_ADDR4 IS '返品先住所４ // #MA.ADDR // Return-to address 4';


COMMENT ON COLUMN MST_PURC_RET_SCHD.RET_SPPL_TEL IS '返品先ＴＥＬ // #MA.TEL // Return-to TEL';


COMMENT ON COLUMN MST_PURC_RET_SCHD.RET_SPPL_FAX IS '返品先ＦＡＸ // #MA.TEL // Return-to FAX';


COMMENT ON COLUMN MST_PURC_RET_SCHD.REG_DT IS '登録日 // #MA.DT // Entry date';


COMMENT ON COLUMN MST_PURC_RET_SCHD.SCHD_DT IS '仕入返品予定日 // #MA.DT // Scheduled purchase return date';


COMMENT ON COLUMN MST_PURC_RET_SCHD.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD.REF_RCPT_IV_NO IS '対応受領インボイスＮＯ // #MA.IV_NO // Corresponding purchase I/V No.';


COMMENT ON COLUMN MST_PURC_RET_SCHD.TTERM_CD1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN MST_PURC_RET_SCHD.TTERM_RMRKS1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN MST_PURC_RET_SCHD.TTERM_CD2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN MST_PURC_RET_SCHD.TTERM_RMRKS2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN MST_PURC_RET_SCHD.TTERM_CD3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN MST_PURC_RET_SCHD.TTERM_RMRKS3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN MST_PURC_RET_SCHD.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_PURC_RET_SCHD.INTR_RMRKS IS '内部備考 // #MS.PURC_RET_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_PURC_RET_SCHD.PURC_RET_PRINT_RMRKS IS '仕入返品票備考 // #MS.PURC_RET_PRINT_RMRKS // Purchase return slip remarks';


COMMENT ON COLUMN MST_PURC_RET_SCHD.SUB_CHAR1 IS '予備１ // #MS.PURC_RET_SCHD_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_PURC_RET_SCHD.SUB_CHAR2 IS '予備２ // #MS.PURC_RET_SCHD_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_PURC_RET_SCHD.SUB_CHAR3 IS '予備３ // #MS.PURC_RET_SCHD_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_PURC_RET_SCHD.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PURC_RET_SCHD.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PURC_RET_SCHD.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PURC_RET_SCHD.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PURC_RET_SCHD.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PURC_RET_SCHD.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PURC_RET_SCHD.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PURC_RET_SCHD.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PURC_RET_SCHD.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PURC_RET_SCHD.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

