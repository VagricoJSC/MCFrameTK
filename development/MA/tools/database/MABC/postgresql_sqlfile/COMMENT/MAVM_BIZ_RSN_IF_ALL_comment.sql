\encoding UTF-8

COMMENT ON VIEW mavm_biz_rsn_if_all IS '業務理由マスタ送信ＩＦ // Business reason master export IF';


COMMENT ON COLUMN mavm_biz_rsn_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.biz_rsn_cd IS '業務理由ＣＤ // #MA.BIZ_RSN_CD // Business reason cd.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.biz_rsn_nm IS '業務理由名 // #MA.BIZ_RSN_NM // Business reason name';


COMMENT ON COLUMN mavm_biz_rsn_if_all.biz_rsn_nm_lcl1 IS '業務理由名（ロケール１） // #MA.BIZ_RSN_NM // Business reason name (Locale 1)';


COMMENT ON COLUMN mavm_biz_rsn_if_all.biz_rsn_nm_lcl2 IS '業務理由名（ロケール２） // #MA.BIZ_RSN_NM // Business reason name (Locale 2)';


COMMENT ON COLUMN mavm_biz_rsn_if_all.biz_rsn_nm_lcl3 IS '業務理由名（ロケール３） // #MA.BIZ_RSN_NM // Business reason name (Locale 3)';


COMMENT ON COLUMN mavm_biz_rsn_if_all.biz_rsn_nm_lcl4 IS '業務理由名（ロケール４） // #MA.BIZ_RSN_NM // Business reason name (Locale 4)';


COMMENT ON COLUMN mavm_biz_rsn_if_all.biz_rsn_nm_lcl5 IS '業務理由名（ロケール５） // #MA.BIZ_RSN_NM // Business reason name (Locale 5)';


COMMENT ON COLUMN mavm_biz_rsn_if_all.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.ac_rsn_nm IS '会計理由名 // #MA.AC_RSN_NM // Accounting reason name';


COMMENT ON COLUMN mavm_biz_rsn_if_all.ac_rsn_nm_lcl1 IS '会計理由名（ロケール１） // #MA.AC_RSN_NM // Accounting reason name (Locale 1)';


COMMENT ON COLUMN mavm_biz_rsn_if_all.ac_rsn_nm_lcl2 IS '会計理由名（ロケール２） // #MA.AC_RSN_NM // Accounting reason name (Locale 2)';


COMMENT ON COLUMN mavm_biz_rsn_if_all.ac_rsn_nm_lcl3 IS '会計理由名（ロケール３） // #MA.AC_RSN_NM // Accounting reason name (Locale 3)';


COMMENT ON COLUMN mavm_biz_rsn_if_all.ac_rsn_nm_lcl4 IS '会計理由名（ロケール４） // #MA.AC_RSN_NM // Accounting reason name (Locale 4)';


COMMENT ON COLUMN mavm_biz_rsn_if_all.ac_rsn_nm_lcl5 IS '会計理由名（ロケール５） // #MA.AC_RSN_NM // Accounting reason name (Locale 5)';


COMMENT ON COLUMN mavm_biz_rsn_if_all.purc_flg IS '仕入ＦＬＧ // #MA.FLG // Purchase flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.purc_rtn_flg IS '仕入返品ＦＬＧ // #MA.FLG // Purchase return flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.xpns_purc_flg IS '経費購買ＦＬＧ // #MA.FLG // Expenses purchasing flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.slo_xpns_purc_flg IS '受注紐付経費購買ＦＬＧ // #MA.FLG // Expense purchase (pegged to sales order) flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.purc_dscnt_flg IS '仕入調整ＦＬＧ // #MA.FLG // Purchase adjustment flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.purc_dscnt_loc_mng_typ IS '仕入調整管轄区分 // #MA.LOC_MNG_TYP // Purchase adjustment controlling site type';


COMMENT ON COLUMN mavm_biz_rsn_if_all.sls_flg IS '売上ＦＬＧ // #MA.FLG // Sales flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.sls_rtn_flg IS '売上返品ＦＬＧ // #MA.FLG // Sales return flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.sls_acxfr_flg IS '販売他勘定ＦＬＧ // #MA.FLG // Sales other accounting flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.sls_dscnt_flg IS '売上調整ＦＬＧ // #MA.FLG // Sales adjustment flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.acxfr_gr_flg IS '他勘定入庫ＦＬＧ // #MA.FLG // Other accounting GR flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.acxfr_gi_flg IS '他勘定出庫ＦＬＧ // #MA.FLG // Other accounting GI flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.disp_flg IS '廃棄ＦＬＧ // #MA.FLG // Disposal flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.stk_xfr_flg IS '在庫振替ＦＬＧ // #MA.FLG // Inventory transfer flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.xfr_flg IS '移送ＦＬＧ // #MA.FLG // Transport flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.yield_flg IS '出来高ＦＬＧ // #MA.FLG // Output flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.yield_typ IS '出来高区分 // #MA.YIELD_TYP // Output type';


COMMENT ON COLUMN mavm_biz_rsn_if_all.not_stk_flg IS '非在庫ＦＬＧ // #MA.FLG // MRO supply flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.loss_flg IS 'ロスＦＬＧ // #MA.FLG // Loss flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.fxd_loss_flg IS '固定ロスＦＬＧ // #MA.FLG // Constant loss flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.not_lot_trace_flg IS 'ロットトレース対象外ＦＬＧ // #MA.FLG // Not for lot trace flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.dfct_flg IS '検査不良ＦＬＧ // #MA.FLG // Inspection defective flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.inpt_flg IS '投入ＦＬＧ // #MA.FLG // Input flg.';


COMMENT ON COLUMN mavm_biz_rsn_if_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_biz_rsn_if_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_biz_rsn_if_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';

