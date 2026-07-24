\encoding UTF-8

COMMENT ON VIEW mavm_itm_if_all IS '品目マスタ送信ＩＦ // Item master export IF';


COMMENT ON COLUMN mavm_itm_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_itm_if_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mavm_itm_if_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mavm_itm_if_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mavm_itm_if_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mavm_itm_if_all.itm_nm IS '品目名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mavm_itm_if_all.itm_nm_lcl1 IS '品目名（ロケール１） // #MA.ITM_NM // Item name (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.itm_nm_lcl2 IS '品目名（ロケール２） // #MA.ITM_NM // Item name (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.itm_nm_lcl3 IS '品目名（ロケール３） // #MA.ITM_NM // Item name (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.itm_nm_lcl4 IS '品目名（ロケール４） // #MA.ITM_NM // Item name (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.itm_nm_lcl5 IS '品目名（ロケール５） // #MA.ITM_NM // Item name (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.unit_nm IS '単位名 // #MA.UNIT_NM // Unit name';


COMMENT ON COLUMN mavm_itm_if_all.unit_nm_lcl1 IS '単位名（ロケール１） // #MA.UNIT_NM // Unit name (Locale 1)';


COMMENT ON COLUMN mavm_itm_if_all.unit_nm_lcl2 IS '単位名（ロケール２） // #MA.UNIT_NM // Unit name (Locale 2)';


COMMENT ON COLUMN mavm_itm_if_all.unit_nm_lcl3 IS '単位名（ロケール３） // #MA.UNIT_NM // Unit name (Locale 3)';


COMMENT ON COLUMN mavm_itm_if_all.unit_nm_lcl4 IS '単位名（ロケール４） // #MA.UNIT_NM // Unit name (Locale 4)';


COMMENT ON COLUMN mavm_itm_if_all.unit_nm_lcl5 IS '単位名（ロケール５） // #MA.UNIT_NM // Unit name (Locale 5)';


COMMENT ON COLUMN mavm_itm_if_all.itm_typ_nm IS '品目区分名 // #MA.ITM_TYP_NM // Item type name';


COMMENT ON COLUMN mavm_itm_if_all.itm_typ_nm_lcl1 IS '品目区分名（ロケール１） // #MA.ITM_TYP_NM // Item type name (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.itm_typ_nm_lcl2 IS '品目区分名（ロケール２） // #MA.ITM_TYP_NM // Item type name (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.itm_typ_nm_lcl3 IS '品目区分名（ロケール３） // #MA.ITM_TYP_NM // Item type name (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.itm_typ_nm_lcl4 IS '品目区分名（ロケール４） // #MA.ITM_TYP_NM // Item type name (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.itm_typ_nm_lcl5 IS '品目区分名（ロケール５） // #MA.ITM_TYP_NM // Item type name (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.itm_typ_d_nm IS '品目区分詳細名 // #MA.ITM_TYP_D_NM // Item type details name';


COMMENT ON COLUMN mavm_itm_if_all.itm_typ_d_nm_lcl1 IS '品目区分詳細名（ロケール１） // #MA.ITM_TYP_D_NM // Item type details name (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.itm_typ_d_nm_lcl2 IS '品目区分詳細名（ロケール２） // #MA.ITM_TYP_D_NM // Item type details name (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.itm_typ_d_nm_lcl3 IS '品目区分詳細名（ロケール３） // #MA.ITM_TYP_D_NM // Item type details name (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.itm_typ_d_nm_lcl4 IS '品目区分詳細名（ロケール４） // #MA.ITM_TYP_D_NM // Item type details name (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.itm_typ_d_nm_lcl5 IS '品目区分詳細名（ロケール５） // #MA.ITM_TYP_D_NM // Item type details name (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.itm_jnl_nm IS '品目仕訳名 // #MA.ITM_JNL_NM // Item journal name';


COMMENT ON COLUMN mavm_itm_if_all.itm_jnl_nm_lcl1 IS '品目仕訳名（ロケール１） // #MA.ITM_JNL_NM // Item journal name (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.itm_jnl_nm_lcl2 IS '品目仕訳名（ロケール２） // #MA.ITM_JNL_NM // Item journal name (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.itm_jnl_nm_lcl3 IS '品目仕訳名（ロケール３） // #MA.ITM_JNL_NM // Item journal name (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.itm_jnl_nm_lcl4 IS '品目仕訳名（ロケール４） // #MA.ITM_JNL_NM // Item journal name (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.itm_jnl_nm_lcl5 IS '品目仕訳名（ロケール５） // #MA.ITM_JNL_NM // Item journal name (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.ac_itm_grp_nm IS '会計品目分類名 // #MA.AC_ITM_GRP_NM // Accounting item classification name';


COMMENT ON COLUMN mavm_itm_if_all.ac_itm_grp_nm_lcl1 IS '会計品目分類名（ロケール１） // #MA.AC_ITM_GRP_NM // Accounting item classification name (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.ac_itm_grp_nm_lcl2 IS '会計品目分類名（ロケール２） // #MA.AC_ITM_GRP_NM // Accounting item classification name (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.ac_itm_grp_nm_lcl3 IS '会計品目分類名（ロケール３） // #MA.AC_ITM_GRP_NM // Accounting item classification name (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.ac_itm_grp_nm_lcl4 IS '会計品目分類名（ロケール４） // #MA.AC_ITM_GRP_NM // Accounting item classification name (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.ac_itm_grp_nm_lcl5 IS '会計品目分類名（ロケール５） // #MA.AC_ITM_GRP_NM // Accounting item classification name (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_cd1 IS '品目分類ＣＤ１ // #MA.ITM_GRP_CD // Item classification cd. 1';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm1 IS '品目分類名１ // #MA.ITM_GRP_NM // Item classification name 1';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm1_lcl1 IS '品目分類名１（ロケール１） // #MA.ITM_GRP_NM // Item classification name 1 (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm1_lcl2 IS '品目分類名１（ロケール２） // #MA.ITM_GRP_NM // Item classification name 1 (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm1_lcl3 IS '品目分類名１（ロケール３） // #MA.ITM_GRP_NM // Item classification name 1 (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm1_lcl4 IS '品目分類名１（ロケール４） // #MA.ITM_GRP_NM // Item classification name 1 (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm1_lcl5 IS '品目分類名１（ロケール５） // #MA.ITM_GRP_NM // Item classification name 1 (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_cd2 IS '品目分類ＣＤ２ // #MA.ITM_GRP_CD // Item classification cd. 2';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm2 IS '品目分類名２ // #MA.ITM_GRP_NM // Item classification name 2';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm2_lcl1 IS '品目分類名２（ロケール１） // #MA.ITM_GRP_NM // Item classification name 2 (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm2_lcl2 IS '品目分類名２（ロケール２） // #MA.ITM_GRP_NM // Item classification name 2 (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm2_lcl3 IS '品目分類名２（ロケール３） // #MA.ITM_GRP_NM // Item classification name 2 (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm2_lcl4 IS '品目分類名２（ロケール４） // #MA.ITM_GRP_NM // Item classification name 2 (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm2_lcl5 IS '品目分類名２（ロケール５） // #MA.ITM_GRP_NM // Item classification name 2 (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_cd3 IS '品目分類ＣＤ３ // #MA.ITM_GRP_CD // Item classification cd. 3';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm3 IS '品目分類名３ // #MA.ITM_GRP_NM // Item classification name 3';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm3_lcl1 IS '品目分類名３（ロケール１） // #MA.ITM_GRP_NM // Item classification name 3 (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm3_lcl2 IS '品目分類名３（ロケール２） // #MA.ITM_GRP_NM // Item classification name 3 (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm3_lcl3 IS '品目分類名３（ロケール３） // #MA.ITM_GRP_NM // Item classification name 3 (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm3_lcl4 IS '品目分類名３（ロケール４） // #MA.ITM_GRP_NM // Item classification name 3 (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm3_lcl5 IS '品目分類名３（ロケール５） // #MA.ITM_GRP_NM // Item classification name 3 (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_cd4 IS '品目分類ＣＤ４ // #MA.ITM_GRP_CD // Item classification cd. 4';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm4 IS '品目分類名４ // #MA.ITM_GRP_NM // Item classification name 4';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm4_lcl1 IS '品目分類名４（ロケール１） // #MA.ITM_GRP_NM // Item classification name 4 (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm4_lcl2 IS '品目分類名４（ロケール２） // #MA.ITM_GRP_NM // Item classification name 4 (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm4_lcl3 IS '品目分類名４（ロケール３） // #MA.ITM_GRP_NM // Item classification name 4 (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm4_lcl4 IS '品目分類名４（ロケール４） // #MA.ITM_GRP_NM // Item classification name 4 (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm4_lcl5 IS '品目分類名４（ロケール５） // #MA.ITM_GRP_NM // Item classification name 4 (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_cd5 IS '品目分類ＣＤ５ // #MA.ITM_GRP_CD // Item classification cd. 5';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm5 IS '品目分類名５ // #MA.ITM_GRP_NM // Item classification name 5';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm5_lcl1 IS '品目分類名５（ロケール１） // #MA.ITM_GRP_NM // Item classification name 5 (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm5_lcl2 IS '品目分類名５（ロケール２） // #MA.ITM_GRP_NM // Item classification name 5 (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm5_lcl3 IS '品目分類名５（ロケール３） // #MA.ITM_GRP_NM // Item classification name 5 (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm5_lcl4 IS '品目分類名５（ロケール４） // #MA.ITM_GRP_NM // Item classification name 5 (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm5_lcl5 IS '品目分類名５（ロケール５） // #MA.ITM_GRP_NM // Item classification name 5 (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_cd6 IS '品目分類ＣＤ６ // #MA.ITM_GRP_CD // Item classification cd. 6';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm6 IS '品目分類名６ // #MA.ITM_GRP_NM // Item classification name 6';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm6_lcl1 IS '品目分類名６（ロケール１） // #MA.ITM_GRP_NM // Item classification name 6 (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm6_lcl2 IS '品目分類名６（ロケール２） // #MA.ITM_GRP_NM // Item classification name 6 (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm6_lcl3 IS '品目分類名６（ロケール３） // #MA.ITM_GRP_NM // Item classification name 6 (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm6_lcl4 IS '品目分類名６（ロケール４） // #MA.ITM_GRP_NM // Item classification name 6 (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm6_lcl5 IS '品目分類名６（ロケール５） // #MA.ITM_GRP_NM // Item classification name 6 (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_cd7 IS '品目分類ＣＤ７ // #MA.ITM_GRP_CD // Item classification cd. 7';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm7 IS '品目分類名７ // #MA.ITM_GRP_NM // Item classification name 7';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm7_lcl1 IS '品目分類名７（ロケール１） // #MA.ITM_GRP_NM // Item classification name 7 (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm7_lcl2 IS '品目分類名７（ロケール２） // #MA.ITM_GRP_NM // Item classification name 7 (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm7_lcl3 IS '品目分類名７（ロケール３） // #MA.ITM_GRP_NM // Item classification name 7 (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm7_lcl4 IS '品目分類名７（ロケール４） // #MA.ITM_GRP_NM // Item classification name 7 (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm7_lcl5 IS '品目分類名７（ロケール５） // #MA.ITM_GRP_NM // Item classification name 7 (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_cd8 IS '品目分類ＣＤ８ // #MA.ITM_GRP_CD // Item classification cd. 8';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm8 IS '品目分類名８ // #MA.ITM_GRP_NM // Item classification name 8';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm8_lcl1 IS '品目分類名８（ロケール１） // #MA.ITM_GRP_NM // Item classification name 8 (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm8_lcl2 IS '品目分類名８（ロケール２） // #MA.ITM_GRP_NM // Item classification name 8 (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm8_lcl3 IS '品目分類名８（ロケール３） // #MA.ITM_GRP_NM // Item classification name 8 (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm8_lcl4 IS '品目分類名８（ロケール４） // #MA.ITM_GRP_NM // Item classification name 8 (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm8_lcl5 IS '品目分類名８（ロケール５） // #MA.ITM_GRP_NM // Item classification name 8 (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_cd9 IS '品目分類ＣＤ９ // #MA.ITM_GRP_CD // Item classification cd. 9';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm9 IS '品目分類名９ // #MA.ITM_GRP_NM // Item classification name 9';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm9_lcl1 IS '品目分類名９（ロケール１） // #MA.ITM_GRP_NM // Item classification name 9 (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm9_lcl2 IS '品目分類名９（ロケール２） // #MA.ITM_GRP_NM // Item classification name 9 (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm9_lcl3 IS '品目分類名９（ロケール３） // #MA.ITM_GRP_NM // Item classification name 9 (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm9_lcl4 IS '品目分類名９（ロケール４） // #MA.ITM_GRP_NM // Item classification name 9 (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm9_lcl5 IS '品目分類名９（ロケール５） // #MA.ITM_GRP_NM // Item classification name 9 (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_cd10 IS '品目分類ＣＤ１０ // #MA.ITM_GRP_CD // Item classification cd. 10';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm10 IS '品目分類名１０ // #MA.ITM_GRP_NM // Item classification name 10';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm10_lcl1 IS '品目分類名１０（ロケール１） // #MA.ITM_GRP_NM // Item classification name 10 (Locale1)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm10_lcl2 IS '品目分類名１０（ロケール２） // #MA.ITM_GRP_NM // Item classification name 10 (Locale2)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm10_lcl3 IS '品目分類名１０（ロケール３） // #MA.ITM_GRP_NM // Item classification name 10 (Locale3)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm10_lcl4 IS '品目分類名１０（ロケール４） // #MA.ITM_GRP_NM // Item classification name 10 (Locale4)';


COMMENT ON COLUMN mavm_itm_if_all.itm_grp_nm10_lcl5 IS '品目分類名１０（ロケール５） // #MA.ITM_GRP_NM // Item classification name 10 (Locale5)';


COMMENT ON COLUMN mavm_itm_if_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_itm_if_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_itm_if_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';

