
COMMENT ON TABLE MAVM_BIZ_RSN_IF_ALL IS '業務理由マスタ送信ＩＦ // Business reason master export IF';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.BIZ_RSN_CD IS '業務理由ＣＤ // #MA.BIZ_RSN_CD // Business reason cd.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.BIZ_RSN_NM IS '業務理由名 // #MA.BIZ_RSN_NM // Business reason name';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.BIZ_RSN_NM_LCL1 IS '業務理由名（ロケール１） // #MA.BIZ_RSN_NM // Business reason name (Locale 1)';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.BIZ_RSN_NM_LCL2 IS '業務理由名（ロケール２） // #MA.BIZ_RSN_NM // Business reason name (Locale 2)';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.BIZ_RSN_NM_LCL3 IS '業務理由名（ロケール３） // #MA.BIZ_RSN_NM // Business reason name (Locale 3)';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.BIZ_RSN_NM_LCL4 IS '業務理由名（ロケール４） // #MA.BIZ_RSN_NM // Business reason name (Locale 4)';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.BIZ_RSN_NM_LCL5 IS '業務理由名（ロケール５） // #MA.BIZ_RSN_NM // Business reason name (Locale 5)';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.AC_RSN_NM IS '会計理由名 // #MA.AC_RSN_NM // Accounting reason name';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.AC_RSN_NM_LCL1 IS '会計理由名（ロケール１） // #MA.AC_RSN_NM // Accounting reason name (Locale 1)';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.AC_RSN_NM_LCL2 IS '会計理由名（ロケール２） // #MA.AC_RSN_NM // Accounting reason name (Locale 2)';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.AC_RSN_NM_LCL3 IS '会計理由名（ロケール３） // #MA.AC_RSN_NM // Accounting reason name (Locale 3)';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.AC_RSN_NM_LCL4 IS '会計理由名（ロケール４） // #MA.AC_RSN_NM // Accounting reason name (Locale 4)';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.AC_RSN_NM_LCL5 IS '会計理由名（ロケール５） // #MA.AC_RSN_NM // Accounting reason name (Locale 5)';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.PURC_FLG IS '仕入ＦＬＧ // #MA.FLG // Purchase flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.PURC_RTN_FLG IS '仕入返品ＦＬＧ // #MA.FLG // Purchase return flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.XPNS_PURC_FLG IS '経費購買ＦＬＧ // #MA.FLG // Expenses purchasing flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.SLO_XPNS_PURC_FLG IS '受注紐付経費購買ＦＬＧ // #MA.FLG // Expense purchase (pegged to sales order) flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.PURC_DSCNT_FLG IS '仕入調整ＦＬＧ // #MA.FLG // Purchase adjustment flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.PURC_DSCNT_LOC_MNG_TYP IS '仕入調整管轄区分 // #MA.LOC_MNG_TYP // Purchase adjustment controlling site type';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.SLS_FLG IS '売上ＦＬＧ // #MA.FLG // Sales flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.SLS_RTN_FLG IS '売上返品ＦＬＧ // #MA.FLG // Sales return flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.SLS_ACXFR_FLG IS '販売他勘定ＦＬＧ // #MA.FLG // Sales other accounting flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.SLS_DSCNT_FLG IS '売上調整ＦＬＧ // #MA.FLG // Sales adjustment flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.ACXFR_GR_FLG IS '他勘定入庫ＦＬＧ // #MA.FLG // Other accounting GR flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.ACXFR_GI_FLG IS '他勘定出庫ＦＬＧ // #MA.FLG // Other accounting GI flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.DISP_FLG IS '廃棄ＦＬＧ // #MA.FLG // Disposal flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.STK_XFR_FLG IS '在庫振替ＦＬＧ // #MA.FLG // Inventory transfer flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.XFR_FLG IS '移送ＦＬＧ // #MA.FLG // Transport flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.YIELD_FLG IS '出来高ＦＬＧ // #MA.FLG // Output flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.YIELD_TYP IS '出来高区分 // #MA.YIELD_TYP // Output type';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.NOT_STK_FLG IS '非在庫ＦＬＧ // #MA.FLG // MRO supply flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.LOSS_FLG IS 'ロスＦＬＧ // #MA.FLG // Loss flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.FXD_LOSS_FLG IS '固定ロスＦＬＧ // #MA.FLG // Constant loss flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.NOT_LOT_TRACE_FLG IS 'ロットトレース対象外ＦＬＧ // #MA.FLG // Not for lot trace flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.DFCT_FLG IS '検査不良ＦＬＧ // #MA.FLG // Inspection defective flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.INPT_FLG IS '投入ＦＬＧ // #MA.FLG // Input flg.';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAVM_BIZ_RSN_IF_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';

