\encoding UTF-8

COMMENT ON VIEW mavm_bp_if_all IS '取引先マスタ送信ＩＦ // BP master export IF';


COMMENT ON COLUMN mavm_bp_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_bp_if_all.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mavm_bp_if_all.bp_nm IS '取引先名 // #MA.BP_NM // BP name';


COMMENT ON COLUMN mavm_bp_if_all.bp_nm_lcl1 IS '取引先名（ロケール１） // #MA.BP_NM // BP name (Locale 1)';


COMMENT ON COLUMN mavm_bp_if_all.bp_nm_lcl2 IS '取引先名（ロケール２） // #MA.BP_NM // BP name (Locale 2)';


COMMENT ON COLUMN mavm_bp_if_all.bp_nm_lcl3 IS '取引先名（ロケール３） // #MA.BP_NM // BP name (Locale 3)';


COMMENT ON COLUMN mavm_bp_if_all.bp_nm_lcl4 IS '取引先名（ロケール４） // #MA.BP_NM // BP name (Locale 4)';


COMMENT ON COLUMN mavm_bp_if_all.bp_nm_lcl5 IS '取引先名（ロケール５） // #MA.BP_NM // BP name (Locale 5)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm1 IS '取引先分類名１ // #MA.BP_GRP_NM // BP classification name 1';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm1_lcl1 IS '取引先分類名１（ロケール１） // #MA.BP_GRP_NM // BP classification name 1 (Locale 1)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm1_lcl2 IS '取引先分類名１（ロケール２） // #MA.BP_GRP_NM // BP classification name 1 (Locale 2)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm1_lcl3 IS '取引先分類名１（ロケール３） // #MA.BP_GRP_NM // BP classification name 1 (Locale 3)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm1_lcl4 IS '取引先分類名１（ロケール４） // #MA.BP_GRP_NM // BP classification name 1 (Locale 4)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm1_lcl5 IS '取引先分類名１（ロケール５） // #MA.BP_GRP_NM // BP classification name 1 (Locale 5)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm2 IS '取引先分類名２ // #MA.BP_GRP_NM // BP classification name 2';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm2_lcl1 IS '取引先分類名２（ロケール１） // #MA.BP_GRP_NM // BP classification name 2 (Locale 1)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm2_lcl2 IS '取引先分類名２（ロケール２） // #MA.BP_GRP_NM // BP classification name 2 (Locale 2)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm2_lcl3 IS '取引先分類名２（ロケール３） // #MA.BP_GRP_NM // BP classification name 2 (Locale 3)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm2_lcl4 IS '取引先分類名２（ロケール４） // #MA.BP_GRP_NM // BP classification name 2 (Locale 4)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm2_lcl5 IS '取引先分類名２（ロケール５） // #MA.BP_GRP_NM // BP classification name 2 (Locale 5)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm3 IS '取引先分類名３ // #MA.BP_GRP_NM // BP classification name 3';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm3_lcl1 IS '取引先分類名３（ロケール１） // #MA.BP_GRP_NM // BP classification name 3 (Locale 1)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm3_lcl2 IS '取引先分類名３（ロケール２） // #MA.BP_GRP_NM // BP classification name 3 (Locale 2)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm3_lcl3 IS '取引先分類名３（ロケール３） // #MA.BP_GRP_NM // BP classification name 3 (Locale 3)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm3_lcl4 IS '取引先分類名３（ロケール４） // #MA.BP_GRP_NM // BP classification name 3 (Locale 4)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm3_lcl5 IS '取引先分類名３（ロケール５） // #MA.BP_GRP_NM // BP classification name 3 (Locale 5)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm4 IS '取引先分類名４ // #MA.BP_GRP_NM // BP classification name 4';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm4_lcl1 IS '取引先分類名４（ロケール１） // #MA.BP_GRP_NM // BP classification name 4 (Locale 1)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm4_lcl2 IS '取引先分類名４（ロケール２） // #MA.BP_GRP_NM // BP classification name 4 (Locale 2)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm4_lcl3 IS '取引先分類名４（ロケール３） // #MA.BP_GRP_NM // BP classification name 4 (Locale 3)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm4_lcl4 IS '取引先分類名４（ロケール４） // #MA.BP_GRP_NM // BP classification name 4 (Locale 4)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm4_lcl5 IS '取引先分類名４（ロケール５） // #MA.BP_GRP_NM // BP classification name 4 (Locale 5)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm5 IS '取引先分類名５ // #MA.BP_GRP_NM // BP classification name 5';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm5_lcl1 IS '取引先分類名５（ロケール１） // #MA.BP_GRP_NM // BP classification name 5 (Locale 1)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm5_lcl2 IS '取引先分類名５（ロケール２） // #MA.BP_GRP_NM // BP classification name 5 (Locale 2)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm5_lcl3 IS '取引先分類名５（ロケール３） // #MA.BP_GRP_NM // BP classification name 5 (Locale 3)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm5_lcl4 IS '取引先分類名５（ロケール４） // #MA.BP_GRP_NM // BP classification name 5 (Locale 4)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm5_lcl5 IS '取引先分類名５（ロケール５） // #MA.BP_GRP_NM // BP classification name 5 (Locale 5)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm6 IS '取引先分類名６ // #MA.BP_GRP_NM // BP classification name 6';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm6_lcl1 IS '取引先分類名６（ロケール１） // #MA.BP_GRP_NM // BP classification name 6 (Locale 1)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm6_lcl2 IS '取引先分類名６（ロケール２） // #MA.BP_GRP_NM // BP classification name 6 (Locale 2)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm6_lcl3 IS '取引先分類名６（ロケール３） // #MA.BP_GRP_NM // BP classification name 6 (Locale 3)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm6_lcl4 IS '取引先分類名６（ロケール４） // #MA.BP_GRP_NM // BP classification name 6 (Locale 4)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm6_lcl5 IS '取引先分類名６（ロケール５） // #MA.BP_GRP_NM // BP classification name 6 (Locale 5)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm7 IS '取引先分類名７ // #MA.BP_GRP_NM // BP classification name 7';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm7_lcl1 IS '取引先分類名７（ロケール１） // #MA.BP_GRP_NM // BP classification name 7 (Locale 1)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm7_lcl2 IS '取引先分類名７（ロケール２） // #MA.BP_GRP_NM // BP classification name 7 (Locale 2)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm7_lcl3 IS '取引先分類名７（ロケール３） // #MA.BP_GRP_NM // BP classification name 7 (Locale 3)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm7_lcl4 IS '取引先分類名７（ロケール４） // #MA.BP_GRP_NM // BP classification name 7 (Locale 4)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm7_lcl5 IS '取引先分類名７（ロケール５） // #MA.BP_GRP_NM // BP classification name 7 (Locale 5)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm8 IS '取引先分類名８ // #MA.BP_GRP_NM // BP classification name 8';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm8_lcl1 IS '取引先分類名８（ロケール１） // #MA.BP_GRP_NM // BP classification name 8 (Locale 1)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm8_lcl2 IS '取引先分類名８（ロケール２） // #MA.BP_GRP_NM // BP classification name 8 (Locale 2)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm8_lcl3 IS '取引先分類名８（ロケール３） // #MA.BP_GRP_NM // BP classification name 8 (Locale 3)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm8_lcl4 IS '取引先分類名８（ロケール４） // #MA.BP_GRP_NM // BP classification name 8 (Locale 4)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm8_lcl5 IS '取引先分類名８（ロケール５） // #MA.BP_GRP_NM // BP classification name 8 (Locale 5)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm9 IS '取引先分類名９ // #MA.BP_GRP_NM // BP classification name 9';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm9_lcl1 IS '取引先分類名９（ロケール１） // #MA.BP_GRP_NM // BP classification name 9 (Locale 1)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm9_lcl2 IS '取引先分類名９（ロケール２） // #MA.BP_GRP_NM // BP classification name 9 (Locale 2)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm9_lcl3 IS '取引先分類名９（ロケール３） // #MA.BP_GRP_NM // BP classification name 9 (Locale 3)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm9_lcl4 IS '取引先分類名９（ロケール４） // #MA.BP_GRP_NM // BP classification name 9 (Locale 4)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm9_lcl5 IS '取引先分類名９（ロケール５） // #MA.BP_GRP_NM // BP classification name 9 (Locale 5)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm10 IS '取引先分類名１０ // #MA.BP_GRP_NM // BP classification name 10';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm10_lcl1 IS '取引先分類名１０（ロケール１） // #MA.BP_GRP_NM // BP classification name 10 (Locale 1)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm10_lcl2 IS '取引先分類名１０（ロケール２） // #MA.BP_GRP_NM // BP classification name 10 (Locale 2)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm10_lcl3 IS '取引先分類名１０（ロケール３） // #MA.BP_GRP_NM // BP classification name 10 (Locale 3)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm10_lcl4 IS '取引先分類名１０（ロケール４） // #MA.BP_GRP_NM // BP classification name 10 (Locale 4)';


COMMENT ON COLUMN mavm_bp_if_all.bp_grp_nm10_lcl5 IS '取引先分類名１０（ロケール５） // #MA.BP_GRP_NM // BP classification name 10 (Locale 5)';


COMMENT ON COLUMN mavm_bp_if_all.cntry_nm IS '国名 // #MA.CNTRY_NM // Country name';


COMMENT ON COLUMN mavm_bp_if_all.cntry_nm_lcl1 IS '国名（ロケール１） // #MA.CNTRY_NM // Country name (Locale 1)';


COMMENT ON COLUMN mavm_bp_if_all.cntry_nm_lcl2 IS '国名（ロケール２） // #MA.CNTRY_NM // Country name (Locale 2)';


COMMENT ON COLUMN mavm_bp_if_all.cntry_nm_lcl3 IS '国名（ロケール３） // #MA.CNTRY_NM // Country name (Locale 3)';


COMMENT ON COLUMN mavm_bp_if_all.cntry_nm_lcl4 IS '国名（ロケール４） // #MA.CNTRY_NM // Country name (Locale 4)';


COMMENT ON COLUMN mavm_bp_if_all.cntry_nm_lcl5 IS '国名（ロケール５） // #MA.CNTRY_NM // Country name (Locale 5)';


COMMENT ON COLUMN mavm_bp_if_all.area_nm IS '地域名 // #MA.AREA_NM // Region name';


COMMENT ON COLUMN mavm_bp_if_all.area_nm_lcl1 IS '地域名（ロケール１） // #MA.AREA_NM // Region name (Locale 1)';


COMMENT ON COLUMN mavm_bp_if_all.area_nm_lcl2 IS '地域名（ロケール２） // #MA.AREA_NM // Region name (Locale 2)';


COMMENT ON COLUMN mavm_bp_if_all.area_nm_lcl3 IS '地域名（ロケール３） // #MA.AREA_NM // Region name (Locale 3)';


COMMENT ON COLUMN mavm_bp_if_all.area_nm_lcl4 IS '地域名（ロケール４） // #MA.AREA_NM // Region name (Locale 4)';


COMMENT ON COLUMN mavm_bp_if_all.area_nm_lcl5 IS '地域名（ロケール５） // #MA.AREA_NM // Region name (Locale 5)';


COMMENT ON COLUMN mavm_bp_if_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_bp_if_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_bp_if_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mavm_bp_if_all.memo4 IS 'メモ４ // #MA.MST_MEMO4 // Memo 4';


COMMENT ON COLUMN mavm_bp_if_all.memo5 IS 'メモ５ // #MA.MST_MEMO5 // Memo 5';


COMMENT ON COLUMN mavm_bp_if_all.memo6 IS 'メモ６ // #MA.MST_MEMO6 // Memo 6';


COMMENT ON COLUMN mavm_bp_if_all.memo7 IS 'メモ７ // #MA.MST_MEMO7 // Memo 7';


COMMENT ON COLUMN mavm_bp_if_all.memo8 IS 'メモ８ // #MA.MST_MEMO8 // Memo 8';


COMMENT ON COLUMN mavm_bp_if_all.memo9 IS 'メモ９ // #MA.MST_MEMO9 // Memo 9';


COMMENT ON COLUMN mavm_bp_if_all.memo10 IS 'メモ１０ // #MA.MST_MEMO10 // Memo 10';


COMMENT ON COLUMN mavm_bp_if_all.memo11 IS 'メモ１１ // #MA.MST_MEMO11 // Memo 11';


COMMENT ON COLUMN mavm_bp_if_all.memo12 IS 'メモ１２ // #MA.MST_MEMO12 // Memo 12';


COMMENT ON COLUMN mavm_bp_if_all.memo13 IS 'メモ１３ // #MA.MST_MEMO13 // Memo 13';


COMMENT ON COLUMN mavm_bp_if_all.memo14 IS 'メモ１４ // #MA.MST_MEMO14 // Memo 14';


COMMENT ON COLUMN mavm_bp_if_all.memo15 IS 'メモ１５ // #MA.MST_MEMO15 // Memo 15';


COMMENT ON COLUMN mavm_bp_if_all.memo16 IS 'メモ１６ // #MA.MST_MEMO16 // Memo 16';


COMMENT ON COLUMN mavm_bp_if_all.memo17 IS 'メモ１７ // #MA.MST_MEMO17 // Memo 17';


COMMENT ON COLUMN mavm_bp_if_all.memo18 IS 'メモ１８ // #MA.MST_MEMO18 // Memo 18';


COMMENT ON COLUMN mavm_bp_if_all.memo19 IS 'メモ１９ // #MA.MST_MEMO19 // Memo 19';


COMMENT ON COLUMN mavm_bp_if_all.memo20 IS 'メモ２０ // #MA.MST_MEMO20 // Memo 20';

