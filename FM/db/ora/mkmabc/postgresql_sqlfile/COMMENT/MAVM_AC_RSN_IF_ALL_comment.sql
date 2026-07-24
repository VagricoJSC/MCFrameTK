\encoding UTF-8

COMMENT ON VIEW mavm_ac_rsn_if_all IS '会計理由マスタ送信ＩＦ // Accounting reason master';


COMMENT ON COLUMN mavm_ac_rsn_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_ac_rsn_if_all.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mavm_ac_rsn_if_all.ac_rsn_nm IS '会計理由名 // #MA.AC_RSN_NM // Accounting reason name';


COMMENT ON COLUMN mavm_ac_rsn_if_all.ac_rsn_nm_lcl1 IS '会計理由名（ロケール１） // #MA.AC_RSN_NM // Accounting reason name (Locale 1)';


COMMENT ON COLUMN mavm_ac_rsn_if_all.ac_rsn_nm_lcl2 IS '会計理由名（ロケール２） // #MA.AC_RSN_NM // Accounting reason name (Locale 2)';


COMMENT ON COLUMN mavm_ac_rsn_if_all.ac_rsn_nm_lcl3 IS '会計理由名（ロケール３） // #MA.AC_RSN_NM // Accounting reason name (Locale 3)';


COMMENT ON COLUMN mavm_ac_rsn_if_all.ac_rsn_nm_lcl4 IS '会計理由名（ロケール４） // #MA.AC_RSN_NM // Accounting reason name (Locale 4)';


COMMENT ON COLUMN mavm_ac_rsn_if_all.ac_rsn_nm_lcl5 IS '会計理由名（ロケール５） // #MA.AC_RSN_NM // Accounting reason name (Locale 5)';


COMMENT ON COLUMN mavm_ac_rsn_if_all.ar_typ IS '債権区分 // #MA.AR_TYP // AR type';


COMMENT ON COLUMN mavm_ac_rsn_if_all.ap_typ IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN mavm_ac_rsn_if_all.ac_invalid_flg IS '仕訳対象外ＦＬＧ // #MA.FLG // Not for journal flg.';


COMMENT ON COLUMN mavm_ac_rsn_if_all.cost_invalid_flg IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN mavm_ac_rsn_if_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_ac_rsn_if_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_ac_rsn_if_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';

