
COMMENT ON TABLE MAVM_BIZ_RSN_MST IS '業務理由マスタビュー // Business reason master view';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.BIZ_RSN_CD IS '業務理由ＣＤ // #MA.BIZ_RSN_CD // Business reason cd.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.BIZ_RSN_NM IS '業務理由名 // #MA.BIZ_RSN_NM // Business reason name';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.PURC_FLG IS '仕入ＦＬＧ // #MA.FLG // Purchase flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.PURC_SORT_SEQ IS '仕入ソート順 // #MA.INT // Purchase sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.PURC_RTN_FLG IS '仕入返品ＦＬＧ // #MA.FLG // Purchase return flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.PURC_RTN_SORT_SEQ IS '仕入返品ソート順 // #MA.INT // Purchase return sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.XPNS_PURC_FLG IS '経費購買ＦＬＧ // #MA.FLG // Expenses purchasing flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.SLO_XPNS_PURC_FLG IS '受注紐付経費購買ＦＬＧ // #MA.FLG // Expense purchase (pegged to sales order) flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.PURC_DSCNT_FLG IS '仕入調整ＦＬＧ // #MA.FLG // Purchase adjustment flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.PURC_DSCNT_LOC_MNG_TYP IS '仕入調整管轄区分 // #MA.LOC_MNG_TYP // Purchase adjustment controlling site type';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.PURC_DSCNT_SORT_SEQ IS '仕入調整ソート順 // #MA.INT // Purchase adjustment sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.SLS_FLG IS '売上ＦＬＧ // #MA.FLG // Sales flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.SLS_SORT_SEQ IS '売上ソート順 // #MA.INT // Sales sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.SLS_RTN_FLG IS '売上返品ＦＬＧ // #MA.FLG // Sales return flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.SLS_RTN_SORT_SEQ IS '売上返品ソート順 // #MA.INT // Sales return sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.SLS_ACXFR_FLG IS '販売他勘定ＦＬＧ // #MA.FLG // Sales other accounting flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.SLS_DSCNT_FLG IS '売上調整ＦＬＧ // #MA.FLG // Sales adjustment flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.SLS_DSCNT_SORT_SEQ IS '売上調整ソート順 // #MA.INT // Sales adjustment sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.ACXFR_GR_FLG IS '他勘定入庫ＦＬＧ // #MA.FLG // Other accounting GR flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.ACXFR_GR_SORT_SEQ IS '他勘定入庫ソート順 // #MA.INT // Other accounting GR sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.ACXFR_GI_FLG IS '他勘定出庫ＦＬＧ // #MA.FLG // Other accounting GI flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.ACXFR_GI_SORT_SEQ IS '他勘定出庫ソート順 // #MA.INT // Other accounting GI sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.INPT_ACXFR_SORT_SEQ IS '投入他勘定ソート順 // #MA.INT // Input other accounting sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.DISP_FLG IS '廃棄ＦＬＧ // #MA.FLG // Disposal flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.DISP_SORT_SEQ IS '廃棄ソート順 // #MA.INT // Disposal sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.STK_XFR_FLG IS '在庫振替ＦＬＧ // #MA.FLG // Inventory transfer flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.STK_XFR_SORT_SEQ IS '在庫振替ソート順 // #MA.INT // Inventory transfer sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.XFR_FLG IS '移送ＦＬＧ // #MA.FLG // Transport flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.XFR_SORT_SEQ IS '移送ソート順 // #MA.INT // Transport sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.YIELD_FLG IS '出来高ＦＬＧ // #MA.FLG // Output flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.YIELD_TYP IS '出来高区分 // #MA.YIELD_TYP // Output type';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.YIELD_SORT_SEQ IS '出来高ソート順 // #MA.INT // Output sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.NOT_STK_FLG IS '非在庫ＦＬＧ // #MA.FLG // MRO supply flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.LOSS_FLG IS 'ロスＦＬＧ // #MA.FLG // Loss flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.FXD_LOSS_FLG IS '固定ロスＦＬＧ // #MA.FLG // Constant loss flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.NOT_LOT_TRACE_FLG IS 'ロットトレース対象外ＦＬＧ // #MA.FLG // Not for lot trace flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.INPT_FLG IS '投入ＦＬＧ // #MA.FLG // Input flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.INPT_SORT_SEQ IS '投入ソート順 // #MA.INT // Input sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.DFCT_FLG IS '検査不良ＦＬＧ // #MA.FLG // Inspection defective flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.DFCT_SORT_SEQ IS '検査不良ソート順 // #MA.INT // Inspection defective sort order';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.BIZ_RSN_NM_LCL1 IS '業務理由名（ロケール１） // #MA.BIZ_RSN_NM // Business reason name (Locale 1)';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.BIZ_RSN_NM_LCL2 IS '業務理由名（ロケール２） // #MA.BIZ_RSN_NM // Business reason name (Locale 2)';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.BIZ_RSN_NM_LCL3 IS '業務理由名（ロケール３） // #MA.BIZ_RSN_NM // Business reason name (Locale 3)';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.BIZ_RSN_NM_LCL4 IS '業務理由名（ロケール４） // #MA.BIZ_RSN_NM // Business reason name (Locale 4)';


COMMENT ON COLUMN MAVM_BIZ_RSN_MST.BIZ_RSN_NM_LCL5 IS '業務理由名（ロケール５） // #MA.BIZ_RSN_NM // Business reason name (Locale 5)';

