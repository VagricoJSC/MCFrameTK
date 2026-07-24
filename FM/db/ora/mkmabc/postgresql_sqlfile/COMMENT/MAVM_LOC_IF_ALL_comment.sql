\encoding UTF-8

COMMENT ON VIEW mavm_loc_if_all IS '場所マスタ送信ＩＦ // Location master export IF';


COMMENT ON COLUMN mavm_loc_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_loc_if_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mavm_loc_if_all.loc_nm IS '場所名 // #MA.LOC_NM // Location name';


COMMENT ON COLUMN mavm_loc_if_all.loc_nm_lcl1 IS '場所名（ロケール１） // #MA.LOC_NM // Location name (Locale 1)';


COMMENT ON COLUMN mavm_loc_if_all.loc_nm_lcl2 IS '場所名（ロケール２） // #MA.LOC_NM // Location name (Locale 2)';


COMMENT ON COLUMN mavm_loc_if_all.loc_nm_lcl3 IS '場所名（ロケール３） // #MA.LOC_NM // Location name (Locale 3)';


COMMENT ON COLUMN mavm_loc_if_all.loc_nm_lcl4 IS '場所名（ロケール４） // #MA.LOC_NM // Location name (Locale 4)';


COMMENT ON COLUMN mavm_loc_if_all.loc_nm_lcl5 IS '場所名（ロケール５） // #MA.LOC_NM // Location name (Locale 5)';


COMMENT ON COLUMN mavm_loc_if_all.wg_nm IS 'ワーキンググループ名 // #MA.WG_NM // WG name';


COMMENT ON COLUMN mavm_loc_if_all.wg_nm_lcl1 IS 'ワーキンググループ名（ロケール１） // #MA.WG_NM // WG name (Locale 1)';


COMMENT ON COLUMN mavm_loc_if_all.wg_nm_lcl2 IS 'ワーキンググループ名（ロケール２） // #MA.WG_NM // WG name (Locale 2)';


COMMENT ON COLUMN mavm_loc_if_all.wg_nm_lcl3 IS 'ワーキンググループ名（ロケール３） // #MA.WG_NM // WG name (Locale 3)';


COMMENT ON COLUMN mavm_loc_if_all.wg_nm_lcl4 IS 'ワーキンググループ名（ロケール４） // #MA.WG_NM // WG name (Locale 4)';


COMMENT ON COLUMN mavm_loc_if_all.wg_nm_lcl5 IS 'ワーキンググループ名（ロケール５） // #MA.WG_NM // WG name (Locale 5)';


COMMENT ON COLUMN mavm_loc_if_all.site_nm IS '工場・物流倉庫名 // #MA.SITE_NM // Factory/Distribution warehouse name';


COMMENT ON COLUMN mavm_loc_if_all.site_nm_lcl1 IS '工場・物流倉庫名（ロケール１） // #MA.SITE_NM // Factory/Distribution warehouse name (Locale 1)';


COMMENT ON COLUMN mavm_loc_if_all.site_nm_lcl2 IS '工場・物流倉庫名（ロケール２） // #MA.SITE_NM // Factory/Distribution warehouse name (Locale 2)';


COMMENT ON COLUMN mavm_loc_if_all.site_nm_lcl3 IS '工場・物流倉庫名（ロケール３） // #MA.SITE_NM // Factory/Distribution warehouse name (Locale 3)';


COMMENT ON COLUMN mavm_loc_if_all.site_nm_lcl4 IS '工場・物流倉庫名（ロケール４） // #MA.SITE_NM // Factory/Distribution warehouse name (Locale 4)';


COMMENT ON COLUMN mavm_loc_if_all.site_nm_lcl5 IS '工場・物流倉庫名（ロケール５） // #MA.SITE_NM // Factory/Distribution warehouse name (Locale 5)';


COMMENT ON COLUMN mavm_loc_if_all.lg_grp_nm IS '物流グループ名 // #MA.LG_GRP_NM // Distribution group name';


COMMENT ON COLUMN mavm_loc_if_all.lg_grp_nm_lcl1 IS '物流グループ名（ロケール１） // #MA.LG_GRP_NM // Distribution group name (Locale 1)';


COMMENT ON COLUMN mavm_loc_if_all.lg_grp_nm_lcl2 IS '物流グループ名（ロケール２） // #MA.LG_GRP_NM // Distribution group name (Locale 2)';


COMMENT ON COLUMN mavm_loc_if_all.lg_grp_nm_lcl3 IS '物流グループ名（ロケール３） // #MA.LG_GRP_NM // Distribution group name (Locale 3)';


COMMENT ON COLUMN mavm_loc_if_all.lg_grp_nm_lcl4 IS '物流グループ名（ロケール４） // #MA.LG_GRP_NM // Distribution group name (Locale 4)';


COMMENT ON COLUMN mavm_loc_if_all.lg_grp_nm_lcl5 IS '物流グループ名（ロケール５） // #MA.LG_GRP_NM // Distribution group name (Locale 5)';


COMMENT ON COLUMN mavm_loc_if_all.loc_grp_nm IS '製造場所グループ名 // #MA.LOC_GRP_NM // Mfg. location group name';


COMMENT ON COLUMN mavm_loc_if_all.loc_grp_nm_lcl1 IS '製造場所グループ名（ロケール１） // #MA.LOC_GRP_NM // Mfg. location group name (Locale 1)';


COMMENT ON COLUMN mavm_loc_if_all.loc_grp_nm_lcl2 IS '製造場所グループ名（ロケール２） // #MA.LOC_GRP_NM // Mfg. location group name (Locale 2)';


COMMENT ON COLUMN mavm_loc_if_all.loc_grp_nm_lcl3 IS '製造場所グループ名（ロケール３） // #MA.LOC_GRP_NM // Mfg. location group name (Locale 3)';


COMMENT ON COLUMN mavm_loc_if_all.loc_grp_nm_lcl4 IS '製造場所グループ名（ロケール４） // #MA.LOC_GRP_NM // Mfg. location group name (Locale 4)';


COMMENT ON COLUMN mavm_loc_if_all.loc_grp_nm_lcl5 IS '製造場所グループ名（ロケール５） // #MA.LOC_GRP_NM // Mfg. location group name (Locale 5)';


COMMENT ON COLUMN mavm_loc_if_all.alloc_grp_nm IS '総量引当場所グループ名 // #MA.ALLOC_GRP_NM // Gross allocation location group name';


COMMENT ON COLUMN mavm_loc_if_all.alloc_grp_nm_lcl1 IS '総量引当場所グループ名（ロケール１） // #MA.ALLOC_GRP_NM // Gross allocation location group name (Locale 1)';


COMMENT ON COLUMN mavm_loc_if_all.alloc_grp_nm_lcl2 IS '総量引当場所グループ名（ロケール２） // #MA.ALLOC_GRP_NM // Gross allocation location group name (Locale 2)';


COMMENT ON COLUMN mavm_loc_if_all.alloc_grp_nm_lcl3 IS '総量引当場所グループ名（ロケール３） // #MA.ALLOC_GRP_NM // Gross allocation location group name (Locale 3)';


COMMENT ON COLUMN mavm_loc_if_all.alloc_grp_nm_lcl4 IS '総量引当場所グループ名（ロケール４） // #MA.ALLOC_GRP_NM // Gross allocation location group name (Locale 4)';


COMMENT ON COLUMN mavm_loc_if_all.alloc_grp_nm_lcl5 IS '総量引当場所グループ名（ロケール５） // #MA.ALLOC_GRP_NM // Gross allocation location group name (Locale 5)';


COMMENT ON COLUMN mavm_loc_if_all.sppl_nm IS '発注先名 // #MA.BP_NM // Supplier name';


COMMENT ON COLUMN mavm_loc_if_all.sppl_nm_lcl1 IS '発注先名（ロケール１） // #MA.BP_NM // Supplier name (Locale 1)';


COMMENT ON COLUMN mavm_loc_if_all.sppl_nm_lcl2 IS '発注先名（ロケール２） // #MA.BP_NM // Supplier name (Locale 2)';


COMMENT ON COLUMN mavm_loc_if_all.sppl_nm_lcl3 IS '発注先名（ロケール３） // #MA.BP_NM // Supplier name (Locale 3)';


COMMENT ON COLUMN mavm_loc_if_all.sppl_nm_lcl4 IS '発注先名（ロケール４） // #MA.BP_NM // Supplier name (Locale 4)';


COMMENT ON COLUMN mavm_loc_if_all.sppl_nm_lcl5 IS '発注先名（ロケール５） // #MA.BP_NM // Supplier name (Locale 5)';


COMMENT ON COLUMN mavm_loc_if_all.cntry_nm IS '国名 // #MA.CNTRY_NM // Country name';


COMMENT ON COLUMN mavm_loc_if_all.cntry_nm_lcl1 IS '国名（ロケール１） // #MA.CNTRY_NM // Country name (Locale 1)';


COMMENT ON COLUMN mavm_loc_if_all.cntry_nm_lcl2 IS '国名（ロケール２） // #MA.CNTRY_NM // Country name (Locale 2)';


COMMENT ON COLUMN mavm_loc_if_all.cntry_nm_lcl3 IS '国名（ロケール３） // #MA.CNTRY_NM // Country name (Locale 3)';


COMMENT ON COLUMN mavm_loc_if_all.cntry_nm_lcl4 IS '国名（ロケール４） // #MA.CNTRY_NM // Country name (Locale 4)';


COMMENT ON COLUMN mavm_loc_if_all.cntry_nm_lcl5 IS '国名（ロケール５） // #MA.CNTRY_NM // Country name (Locale 5)';


COMMENT ON COLUMN mavm_loc_if_all.rsrc_nm1 IS '資源名１ // #MA.RSRC_NM // Resource name 1';


COMMENT ON COLUMN mavm_loc_if_all.rsrc_nm1_lcl1 IS '資源名１（ロケール１） // #MA.RSRC_NM // Resource name 1 (Locale 1)';


COMMENT ON COLUMN mavm_loc_if_all.rsrc_nm1_lcl2 IS '資源名１（ロケール２） // #MA.RSRC_NM // Resource name 1 (Locale 2)';


COMMENT ON COLUMN mavm_loc_if_all.rsrc_nm1_lcl3 IS '資源名１（ロケール３） // #MA.RSRC_NM // Resource name 1 (Locale 3)';


COMMENT ON COLUMN mavm_loc_if_all.rsrc_nm1_lcl4 IS '資源名１（ロケール４） // #MA.RSRC_NM // Resource name 1 (Locale 4)';


COMMENT ON COLUMN mavm_loc_if_all.rsrc_nm1_lcl5 IS '資源名１（ロケール５） // #MA.RSRC_NM // Resource name 1 (Locale 5)';


COMMENT ON COLUMN mavm_loc_if_all.rsrc_nm2 IS '資源名２ // #MA.RSRC_NM // Resource name 2';


COMMENT ON COLUMN mavm_loc_if_all.rsrc_nm2_lcl1 IS '資源名２（ロケール１） // #MA.RSRC_NM // Resource name 2 (Locale 1)';


COMMENT ON COLUMN mavm_loc_if_all.rsrc_nm2_lcl2 IS '資源名２（ロケール２） // #MA.RSRC_NM // Resource name 2 (Locale 2)';


COMMENT ON COLUMN mavm_loc_if_all.rsrc_nm2_lcl3 IS '資源名２（ロケール３） // #MA.RSRC_NM // Resource name 2 (Locale 3)';


COMMENT ON COLUMN mavm_loc_if_all.rsrc_nm2_lcl4 IS '資源名２（ロケール４） // #MA.RSRC_NM // Resource name 2 (Locale 4)';


COMMENT ON COLUMN mavm_loc_if_all.rsrc_nm2_lcl5 IS '資源名２（ロケール５） // #MA.RSRC_NM // Resource name 2 (Locale 5)';


COMMENT ON COLUMN mavm_loc_if_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_loc_if_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_loc_if_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';

