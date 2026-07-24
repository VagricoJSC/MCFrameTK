
COMMENT ON TABLE MST_PURC_RET_ACT_ALL IS '仕入返品実績ヘッダ // Purchase return result header';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.PURC_RET_ACT_NO IS '仕入返品実績ＮＯ // #MA.PURC_RET_ACT_NO // Purchase return result No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.PURC_RET_ACT_REV IS '仕入返品実績改訂番号 // #MA.SLIP_REV // Purchase return result rev. number';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.PURC_RET_SCHD_NO IS '仕入返品予定ＮＯ // #MA.PURC_RET_SCHD_NO // Purchase return schedule No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.PURC_USR_CD IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.PURC_DPT_CD IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.WG_CD IS 'ＷＧ ＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.SPPL_CNTCT_DPT IS '発注先部署 // #MA.BP_CNTCT_DPT // Supplier dept.';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.SPPL_CNTCT_PSN IS '発注先担当者 // #MA.BP_CNTCT_PSN // Supplier PIC';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.SPPL_ZIP_CD IS '発注先郵便番号 // #MA.ZIP_CD // Supplier zip code';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.SPPL_ADDR1 IS '発注先住所１ // #MA.ADDR // Supplier address 1';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.SPPL_ADDR2 IS '発注先住所２ // #MA.ADDR // Supplier address 2';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.SPPL_ADDR3 IS '発注先住所３ // #MA.ADDR // Supplier address 3';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.SPPL_ADDR4 IS '発注先住所４ // #MA.ADDR // Supplier address 4';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.SPPL_TEL IS '発注先ＴＥＬ // #MA.TEL // Supplier TEL';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.SPPL_FAX IS '発注先ＦＡＸ // #MA.TEL // Supplier FAX';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.RET_SPPL_NM IS '返品先名 // #MA.BP_NM // Return-to name';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.RET_SPPL_CNTCT_DPT IS '返品先部署 // #MA.BP_CNTCT_DPT // Return-to dept.';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.RET_SPPL_CNTCT_PSN IS '返品先担当者 // #MA.BP_CNTCT_PSN // Return-to PIC';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.RET_SPPL_CNTCT_PSN_TITLE IS '返品先担当者敬称 // #MA.BP_PSN_TITLE // Return-to PIC form of address';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.RET_SPPL_ZIP_CD IS '返品先郵便番号 // #MA.ZIP_CD // Return-to zip code';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.RET_SPPL_ADDR1 IS '返品先住所１ // #MA.ADDR // Return-to address 1';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.RET_SPPL_ADDR2 IS '返品先住所２ // #MA.ADDR // Return-to address 2';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.RET_SPPL_ADDR3 IS '返品先住所３ // #MA.ADDR // Return-to address 3';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.RET_SPPL_ADDR4 IS '返品先住所４ // #MA.ADDR // Return-to address 4';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.RET_SPPL_TEL IS '返品先ＴＥＬ // #MA.TEL // Return-to TEL';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.RET_SPPL_FAX IS '返品先ＦＡＸ // #MA.TEL // Return-to FAX';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.PURC_RET_DT IS '仕入返品日 // #MA.DT // Purchase return date';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.PURC_RET_PRINT_DT IS '返品票発行日時 // #MA.TM // Return slip issue date and time';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.PURC_RET_PRINT_FLG IS '返品票発行済ＦＬＧ // #MA.FLG // Return slip issued flg.';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.LAST_PURC_RET_PRINT_REV IS '最新返品票改訂番号 // #MA.SLIP_REV // Latest return slip rev. number';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.REF_RCPT_IV_NO IS '対応受領インボイスＮＯ // #MA.IV_NO // Corresponding purchase I/V No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.TTERM_CD1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.TTERM_RMRKS1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.TTERM_CD2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.TTERM_RMRKS2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.TTERM_CD3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.TTERM_RMRKS3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.INTR_RMRKS IS '内部備考 // #MS.PURC_RET_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.PURC_RET_PRINT_RMRKS IS '仕入返品票備考 // #MS.PURC_RET_PRINT_RMRKS // Purchase return slip remarks';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.SUB_CHAR1 IS '予備項目１ // #MS.PURC_RET_ACT_SUB_CHAR1 // Spare column 1';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.SUB_CHAR2 IS '予備項目２ // #MS.PURC_RET_ACT_SUB_CHAR2 // Spare column 2';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.SUB_CHAR3 IS '予備項目３ // #MS.PURC_RET_ACT_SUB_CHAR3 // Spare column 3';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PURC_RET_ACT_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

