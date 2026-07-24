\encoding UTF-8

COMMENT ON VIEW mavm_cost_dpt_if_all IS '原価部門マスタ送信ＩＦ // Cost dept. master export IF';


COMMENT ON COLUMN mavm_cost_dpt_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_cost_dpt_if_all.dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mavm_cost_dpt_if_all.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mavm_cost_dpt_if_all.dpt_nm IS '部門名 // #MA.COST_DPT_NM // Dept. name';


COMMENT ON COLUMN mavm_cost_dpt_if_all.dpt_nm_lcl1 IS '部門名（ロケール１） // #MA.COST_DPT_NM // Dept. name';


COMMENT ON COLUMN mavm_cost_dpt_if_all.dpt_nm_lcl2 IS '部門名（ロケール２） // #MA.COST_DPT_NM // Dept. name';


COMMENT ON COLUMN mavm_cost_dpt_if_all.dpt_nm_lcl3 IS '部門名（ロケール３） // #MA.COST_DPT_NM // Dept. name';


COMMENT ON COLUMN mavm_cost_dpt_if_all.dpt_nm_lcl4 IS '部門名（ロケール４） // #MA.COST_DPT_NM // Dept. name';


COMMENT ON COLUMN mavm_cost_dpt_if_all.dpt_nm_lcl5 IS '部門名（ロケール５） // #MA.COST_DPT_NM // Dept. name';


COMMENT ON COLUMN mavm_cost_dpt_if_all.lg_grp_nm IS '物流グループ名 // #MA.LG_GRP_NM // Distribution group name';


COMMENT ON COLUMN mavm_cost_dpt_if_all.lg_grp_nm_lcl1 IS '物流グループ名（ロケール１） // #MA.LG_GRP_NM // Distribution group name (Locale 1)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.lg_grp_nm_lcl2 IS '物流グループ名（ロケール２） // #MA.LG_GRP_NM // Distribution group name (Locale 2)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.lg_grp_nm_lcl3 IS '物流グループ名（ロケール３） // #MA.LG_GRP_NM // Distribution group name (Locale 3)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.lg_grp_nm_lcl4 IS '物流グループ名（ロケール４） // #MA.LG_GRP_NM // Distribution group name (Locale 4)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.lg_grp_nm_lcl5 IS '物流グループ名（ロケール５） // #MA.LG_GRP_NM // Distribution group name (Locale 5)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.loc_grp_nm IS '製造場所グループ名 // #MA.LOC_GRP_NM // Mfg. location group name';


COMMENT ON COLUMN mavm_cost_dpt_if_all.loc_grp_nm_lcl1 IS '製造場所グループ名（ロケール１） // #MA.LOC_GRP_NM // Mfg. location group name (Locale 1)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.loc_grp_nm_lcl2 IS '製造場所グループ名（ロケール２） // #MA.LOC_GRP_NM // Mfg. location group name (Locale 2)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.loc_grp_nm_lcl3 IS '製造場所グループ名（ロケール３） // #MA.LOC_GRP_NM // Mfg. location group name (Locale 3)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.loc_grp_nm_lcl4 IS '製造場所グループ名（ロケール４） // #MA.LOC_GRP_NM // Mfg. location group name (Locale 4)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.loc_grp_nm_lcl5 IS '製造場所グループ名（ロケール５） // #MA.LOC_GRP_NM // Mfg. location group name (Locale 5)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.wg_nm IS 'ワーキンググループ名 // #MA.WG_NM // WG name';


COMMENT ON COLUMN mavm_cost_dpt_if_all.wg_nm_lcl1 IS 'ワーキンググループ名（ロケール１） // #MA.WG_NM // WG name (Locale 1)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.wg_nm_lcl2 IS 'ワーキンググループ名（ロケール２） // #MA.WG_NM // WG name (Locale 2)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.wg_nm_lcl3 IS 'ワーキンググループ名（ロケール３） // #MA.WG_NM // WG name (Locale 3)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.wg_nm_lcl4 IS 'ワーキンググループ名（ロケール４） // #MA.WG_NM // WG name (Locale 4)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.wg_nm_lcl5 IS 'ワーキンググループ名（ロケール５） // #MA.WG_NM // WG name (Locale 5)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.site_nm IS '工場・物流倉庫名 // #MA.SITE_NM // Factory/Distribution warehouse name';


COMMENT ON COLUMN mavm_cost_dpt_if_all.site_nm_lcl1 IS '工場・物流倉庫名（ロケール１） // #MA.SITE_NM // Factory/Distribution warehouse name (Locale 1)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.site_nm_lcl2 IS '工場・物流倉庫名（ロケール２） // #MA.SITE_NM // Factory/Distribution warehouse name (Locale 2)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.site_nm_lcl3 IS '工場・物流倉庫名（ロケール３） // #MA.SITE_NM // Factory/Distribution warehouse name (Locale 3)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.site_nm_lcl4 IS '工場・物流倉庫名（ロケール４） // #MA.SITE_NM // Factory/Distribution warehouse name (Locale 4)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.site_nm_lcl5 IS '工場・物流倉庫名（ロケール５） // #MA.SITE_NM // Factory/Distribution warehouse name (Locale 5)';


COMMENT ON COLUMN mavm_cost_dpt_if_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_cost_dpt_if_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_cost_dpt_if_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';

