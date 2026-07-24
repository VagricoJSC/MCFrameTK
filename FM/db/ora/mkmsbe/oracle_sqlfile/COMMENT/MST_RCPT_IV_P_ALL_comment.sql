
COMMENT ON TABLE MST_RCPT_IV_P_ALL IS '受領インボイス（改訂履歴） // Purchase invoice (Rev. history)';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.RCPT_IV_MNG_NO IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.RCPT_IV_REV IS '受領インボイス改訂番号 // #MA.SLIP_REV // Purchase invoice rev. number';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.RCPT_IV_SRC_TYP IS 'インボイス作成元区分 // #MS.RCPT_IV_SRC_TYP // Invoice creating source type';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.PURC_SCHD_DT IS '仕入予定日 // #MA.DT // Scheduled purchase date';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.PURC_DT IS '仕入日 // #MA.DT // Purchase date';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IV_DT IS 'インボイス日付 // #MA.DT // Invoice date';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.PURC_AC_SCHD_DT IS '仕入計上予定日 // #MA.DT // Scheduled purchase recording date';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IN_TO_ID_TYP IS '納入先識別区分 // #MS.IN_TO_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IN_TO_ID_CD IS '納入先識別ＣＤ // #MS.IN_TO_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IN_TO_ID_NM IS '納入先識別名 // #MS.IN_TO_ID_NM // Delivery destination identification name';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IN_TO_ZIP_CD IS '納入先ＺＩＰ // #MA.ZIP_CD // Delivery destination ZIP';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IN_TO_ADDR1 IS '納入先住所１ // #MA.ADDR // Delivery destination address1';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IN_TO_ADDR2 IS '納入先住所２ // #MA.ADDR // Delivery destination address2';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IN_TO_ADDR3 IS '納入先住所３ // #MA.ADDR // Delivery destination address3';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IN_TO_ADDR4 IS '納入先住所４ // #MA.ADDR // Delivery destination address4';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IN_TO_CNTCT_DPT IS '納入先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IN_TO_CNTCT_PSN IS '納入先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IN_TO_TEL IS '納入先ＴＥＬ // #MA.TEL // Delivery destination TEL';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IN_TO_FAX IS '納入先ＦＡＸ // #MA.TEL // Delivery destination FAX';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IN_TO_CNTRY_CD IS '納入先国ＣＤ // #MA.CNTRY_CD // Delivery destination country cd.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.IN_TO_SUNDRY_FLG IS '納入先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.TRNSPT_CD IS '輸送方法ＣＤ // #MA.TRNSPT_CD // Transportation method cd.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.VSSL_FLGHT IS '船名／便名 // #MA.VSSL_FLGHT // Ship/flight name';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.LOAD_PORT_CD IS '船積港ＣＤ // #MA.PORT_CD // Loading port cd.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.ETD_DT IS '船積予定日 // #MA.DT // Estimated date of loading';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.DSCHRG_PORT_CD IS '船卸港ＣＤ // #MA.PORT_CD // Unloading port cd.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.ETA_DT IS '船卸予定日 // #MA.DT // Estimated date of unloading';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.VIA_PORT_CD IS '経由地ＣＤ // #MA.PORT_CD // Stopover point cd.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.VIA_SCHD_DT IS '経由予定日 // #MA.DT // Estimated stopover date';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.TTERM_CD1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.TTERM_RMRKS1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.TTERM_CD2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.TTERM_RMRKS2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.TTERM_CD3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.TTERM_RMRKS3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.PTAX_CUR_CD IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.XRATE_INPT_FLG IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.PTAX_XRATE_INPT_FLG IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.PAY_BASIS_DT IS '支払起算日 // #MA.DT // Payment base date';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.PAY_SCHD_DT IS '支払予定日 // #MA.DT // Scheduled payment date';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.RCPT_IV_RMRKS IS '受領インボイス備考 // #MS.IV_RMRKS // Purchase invoice remarks';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.INTR_RMRKS IS '内部備考 // #MS.RCPT_IV_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.PURC_CMPL_FLG IS '仕入完了ＦＬＧ // #MA.FLG // Purchase completion flg.';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.SUB_CHAR1 IS '予備１ // #MS.RCPT_IV_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.SUB_CHAR2 IS '予備２ // #MS.RCPT_IV_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.SUB_CHAR3 IS '予備３ // #MS.RCPT_IV_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_RCPT_IV_P_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

