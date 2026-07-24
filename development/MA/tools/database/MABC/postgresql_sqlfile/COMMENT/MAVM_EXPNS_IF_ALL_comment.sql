\encoding UTF-8

COMMENT ON VIEW mavm_expns_if_all IS '原価費目マスタ送信ＩＦ // Cost element master export IF';


COMMENT ON COLUMN mavm_expns_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_expns_if_all.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mavm_expns_if_all.expns_nm IS '費目名 // #MA.EXPNS_NM // Cost element name';


COMMENT ON COLUMN mavm_expns_if_all.expns_nm_lcl1 IS '費目名（ロケール１） // #MA.EXPNS_NM // Cost element name (Locale 1)';


COMMENT ON COLUMN mavm_expns_if_all.expns_nm_lcl2 IS '費目名（ロケール２） // #MA.EXPNS_NM // Cost element name (Locale 2)';


COMMENT ON COLUMN mavm_expns_if_all.expns_nm_lcl3 IS '費目名（ロケール３） // #MA.EXPNS_NM // Cost element name (Locale 3)';


COMMENT ON COLUMN mavm_expns_if_all.expns_nm_lcl4 IS '費目名（ロケール４） // #MA.EXPNS_NM // Cost element name (Locale 4)';


COMMENT ON COLUMN mavm_expns_if_all.expns_nm_lcl5 IS '費目名（ロケール５） // #MA.EXPNS_NM // Cost element name (Locale 5)';


COMMENT ON COLUMN mavm_expns_if_all.expns_grp_nm IS '費目グループ名 // #MA.EXPNS_GRP_NM // Cost element group name';


COMMENT ON COLUMN mavm_expns_if_all.expns_grp_nm_lcl1 IS '費目グループ名（ロケール１） // #MA.EXPNS_GRP_NM // Cost element group name (Locale 1)';


COMMENT ON COLUMN mavm_expns_if_all.expns_grp_nm_lcl2 IS '費目グループ名（ロケール２） // #MA.EXPNS_GRP_NM // Cost element group name (Locale 2)';


COMMENT ON COLUMN mavm_expns_if_all.expns_grp_nm_lcl3 IS '費目グループ名（ロケール３） // #MA.EXPNS_GRP_NM // Cost element group name (Locale 3)';


COMMENT ON COLUMN mavm_expns_if_all.expns_grp_nm_lcl4 IS '費目グループ名（ロケール４） // #MA.EXPNS_GRP_NM // Cost element group name (Locale 4)';


COMMENT ON COLUMN mavm_expns_if_all.expns_grp_nm_lcl5 IS '費目グループ名（ロケール５） // #MA.EXPNS_GRP_NM // Cost element group name (Locale 5)';


COMMENT ON COLUMN mavm_expns_if_all.expns_grp_seq IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN mavm_expns_if_all.expns_typ IS '費目区分 // #MA.EXPNS_TYP // Cost element type';


COMMENT ON COLUMN mavm_expns_if_all.expns_typ_nm IS '費目区分名 // #MA.EXPNS_TYP_NM // Cost element type name';


COMMENT ON COLUMN mavm_expns_if_all.expns_typ_nm_lcl1 IS '費目区分名（ロケール１） // #MA.EXPNS_TYP_NM // Cost element type name (Locale 1)';


COMMENT ON COLUMN mavm_expns_if_all.expns_typ_nm_lcl2 IS '費目区分名（ロケール２） // #MA.EXPNS_TYP_NM // Cost element type name (Locale 2)';


COMMENT ON COLUMN mavm_expns_if_all.expns_typ_nm_lcl3 IS '費目区分名（ロケール３） // #MA.EXPNS_TYP_NM // Cost element type name (Locale 3)';


COMMENT ON COLUMN mavm_expns_if_all.expns_typ_nm_lcl4 IS '費目区分名（ロケール４） // #MA.EXPNS_TYP_NM // Cost element type name (Locale 4)';


COMMENT ON COLUMN mavm_expns_if_all.expns_typ_nm_lcl5 IS '費目区分名（ロケール５） // #MA.EXPNS_TYP_NM // Cost element type name (Locale 5)';


COMMENT ON COLUMN mavm_expns_if_all.direct_typ IS '直間区分 // #MA.DIRECT_TYP // Direct/Indirect type';


COMMENT ON COLUMN mavm_expns_if_all.direct_typ_nm IS '直間区分名 // #MA.DIRECT_TYP_NM // Direct/Indirect type name';


COMMENT ON COLUMN mavm_expns_if_all.direct_typ_nm_lcl1 IS '直間区分名（ロケール１） // #MA.DIRECT_TYP_NM // Direct/Indirect type name (Locale 1)';


COMMENT ON COLUMN mavm_expns_if_all.direct_typ_nm_lcl2 IS '直間区分名（ロケール２） // #MA.DIRECT_TYP_NM // Direct/Indirect type name (Locale 2)';


COMMENT ON COLUMN mavm_expns_if_all.direct_typ_nm_lcl3 IS '直間区分名（ロケール３） // #MA.DIRECT_TYP_NM // Direct/Indirect type name (Locale 3)';


COMMENT ON COLUMN mavm_expns_if_all.direct_typ_nm_lcl4 IS '直間区分名（ロケール４） // #MA.DIRECT_TYP_NM // Direct/Indirect type name (Locale 4)';


COMMENT ON COLUMN mavm_expns_if_all.direct_typ_nm_lcl5 IS '直間区分名（ロケール５） // #MA.DIRECT_TYP_NM // Direct/Indirect type name (Locale 5)';


COMMENT ON COLUMN mavm_expns_if_all.var_typ IS '固変区分 // #MA.VAR_TYP // Constant/variable type';


COMMENT ON COLUMN mavm_expns_if_all.var_typ_nm IS '固変区分名 // #MA.VAR_TYP_NM // Fixed/variable type name';


COMMENT ON COLUMN mavm_expns_if_all.var_typ_nm_lcl1 IS '固変区分名（ロケール１） // #MA.VAR_TYP_NM // Fixed/variable type name (Locale 1)';


COMMENT ON COLUMN mavm_expns_if_all.var_typ_nm_lcl2 IS '固変区分名（ロケール２） // #MA.VAR_TYP_NM // Fixed/variable type name (Locale 2)';


COMMENT ON COLUMN mavm_expns_if_all.var_typ_nm_lcl3 IS '固変区分名（ロケール３） // #MA.VAR_TYP_NM // Fixed/variable type name (Locale 3)';


COMMENT ON COLUMN mavm_expns_if_all.var_typ_nm_lcl4 IS '固変区分名（ロケール４） // #MA.VAR_TYP_NM // Fixed/variable type name (Locale 4)';


COMMENT ON COLUMN mavm_expns_if_all.var_typ_nm_lcl5 IS '固変区分名（ロケール５） // #MA.VAR_TYP_NM // Fixed/variable type name (Locale 5)';


COMMENT ON COLUMN mavm_expns_if_all.expns_seq IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN mavm_expns_if_all.seq IS '連番 // #MA.INT // Sequence number';


COMMENT ON COLUMN mavm_expns_if_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_expns_if_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_expns_if_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';

