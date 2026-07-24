
COMMENT ON TABLE MST_RCV IS '入金 // Payment received';


COMMENT ON COLUMN MST_RCV.RCV_NO IS '入金ＮＯ // #MA.RCV_NO // Payment received No.';


COMMENT ON COLUMN MST_RCV.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MST_RCV.DAT_TYP IS 'データ区分 // #MS.RCV_DAT_TYP // Data type';


COMMENT ON COLUMN MST_RCV.RCST_CD IS '入金先ＣＤ // #MA.BP_CD // Payer cd.';


COMMENT ON COLUMN MST_RCV.BCST_CD IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN MST_RCV.BILL_DPT_CD IS '請求部門ＣＤ // #MA.DPT_CD // Billing dept. cd.';


COMMENT ON COLUMN MST_RCV.ACST_CD IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN MST_RCV.ASPPL_CD IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN MST_RCV.BSPPL_CD IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN MST_RCV.RCV_DPT_CD IS '入金部門ＣＤ // #MA.DPT_CD // Payment receiving dept. cd.';


COMMENT ON COLUMN MST_RCV.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_RCV.RCV_USR_CD IS '入金担当者ＣＤ // #MA.USR_CD // Payment received PIC cd.';


COMMENT ON COLUMN MST_RCV.RCV_DT IS '入金日 // #MA.DT // Payment received date';


COMMENT ON COLUMN MST_RCV.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_RCV.RCV_MTD_CD IS '入金方法ＣＤ // #MA.STTL_CD // Payment received method cd.';


COMMENT ON COLUMN MST_RCV.RCV_TYP IS '入金区分 // #MA.AR_STTL_TYP // Payment received type';


COMMENT ON COLUMN MST_RCV.BANK_AC_CD IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN MST_RCV.XFR_PSN IS '振込人名 // #MA.XFR_PSN // Payment person name';


COMMENT ON COLUMN MST_RCV.NOTE_MNG_NO IS '手形管理ＮＯ // #MA.NOTE_MNG_NO // Note management No.';


COMMENT ON COLUMN MST_RCV.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_RCV.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MST_RCV.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MST_RCV.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_RCV.RCV_RMRKS IS '入金備考 // #MS.RCV_RMRKS // Payment received remarks';


COMMENT ON COLUMN MST_RCV.SRC_RCV_ACT_NO IS '発生元入金実績ＮＯ // #MA.RCV_ACT_NO // Source incoming payment result received No.';


COMMENT ON COLUMN MST_RCV.SRC_RCV_ACT_SEQ IS '発生元入金実績連番 // #MA.SLIP_SEQ // Source incoming payment result sequence number';


COMMENT ON COLUMN MST_RCV.SRC_RCV_ACT_D_NO IS '発生元入金実績明細ＮＯ // #MA.RCV_ACT_D_NO // Source incoming payment result details No.';


COMMENT ON COLUMN MST_RCV.SRC_RCV_ACT_D_SEQ IS '発生元入金実績明細連番 // #MA.SLIP_SEQ // Source incoming payment result details sequence number';


COMMENT ON COLUMN MST_RCV.PAY_ACT_NO IS '支払実績ＮＯ // #MA.PAY_ACT_NO // Payment result No.';


COMMENT ON COLUMN MST_RCV.RCV_AMT IS '入金額 // #MA.MONEY // Payment received amount';


COMMENT ON COLUMN MST_RCV.RCV_PROC_AMT IS '入金処理額 // #MA.MONEY // Processed payment received amount';


COMMENT ON COLUMN MST_RCV.NOT_PROC_BAL IS '未処理残高 // #MA.MONEY // Unreconciled balance';


COMMENT ON COLUMN MST_RCV.COM_PAID IS '振込手数料 // #MA.MONEY // Transfer fee';


COMMENT ON COLUMN MST_RCV.BILL_SETOFF_AMT IS '請求済相殺額 // #MA.MONEY // Billing offset amount';


COMMENT ON COLUMN MST_RCV.AUTO_APPL_BASIS_DT IS '自動消込基準日 // #MA.DT // Auto-reconciliation base date';


COMMENT ON COLUMN MST_RCV.RCV_AUTO_APPL_TGT_FLG IS '入金自動消込対象ＦＬＧ // #MA.FLG // For auto-reconciliation flg.';


COMMENT ON COLUMN MST_RCV.AUTO_APPL_STS_TYP IS '自動消込状況区分 // #MS.AUTO_APPL_STS_TYP // Auto-reconciliation status type';


COMMENT ON COLUMN MST_RCV.FB_FLG IS 'ＦＢＦＬＧ // #MA.FLG // FB flg.';


COMMENT ON COLUMN MST_RCV.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_RCV.EXT_RCV_NO IS '外部入金ＮＯ // #MA.EXT_RCV_NO // External payment received No.';


COMMENT ON COLUMN MST_RCV.SEQ_NO IS '枝番 // #MA.INT // Branch number';


COMMENT ON COLUMN MST_RCV.PRNT_FLG IS '発行済ＦＬＧ // #MA.FLG // Issued flg.';


COMMENT ON COLUMN MST_RCV.DIV_SRC_RCV_NO IS '分割元入金ＮＯ // #MA.RCV_NO // Payment received split source No.';


COMMENT ON COLUMN MST_RCV.DIV_FLG IS '分割済ＦＬＧ // #MA.FLG // Split flg.';


COMMENT ON COLUMN MST_RCV.SUB_CHAR1 IS '予備１ // #MS.RCV_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_RCV.SUB_CHAR2 IS '予備２ // #MS.RCV_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_RCV.SUB_CHAR3 IS '予備３ // #MS.RCV_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_RCV.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_RCV.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_RCV.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_RCV.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_RCV.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_RCV.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_RCV.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_RCV.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_RCV.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_RCV.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MST_RCV.AR_TYP IS '債権区分 // #MA.AR_TYP // AR type';

