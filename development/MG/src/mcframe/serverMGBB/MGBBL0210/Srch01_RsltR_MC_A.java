package mcframe.serverMGBB.MGBBL0210;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Country master (BP) (Dummy for join) 国マスタ（取引先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_cntry = "dummy_bp_cntry";
	/**
	 * Region master (BP) (Dummy for join) 地域マスタ（取引先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_area = "dummy_bp_area";
	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp1 = "dummy_itm_grp1";
	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp2 = "dummy_itm_grp2";
	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp3 = "dummy_itm_grp3";
	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp4 = "dummy_itm_grp4";
	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp5 = "dummy_itm_grp5";
	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp6 = "dummy_itm_grp6";
	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp7 = "dummy_itm_grp7";
	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp8 = "dummy_itm_grp8";
	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp9 = "dummy_itm_grp9";
	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_itm_grp10 = "dummy_itm_grp10";
	/**
	 * BP classification master 1 (BP) (Dummy for Join) 取引先分類マスタ１（取引先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp1 = "dummy_bp_grp1";
	/**
	 * BP classification master 2 (BP) (Dummy for Join) 取引先分類マスタ２（取引先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp2 = "dummy_bp_grp2";
	/**
	 * BP classification master 3 (BP) (Dummy for Join) 取引先分類マスタ３（取引先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp3 = "dummy_bp_grp3";
	/**
	 * BP classification master 4 (BP) (Dummy for Join) 取引先分類マスタ４（取引先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp4 = "dummy_bp_grp4";
	/**
	 * BP classification master 5 (BP) (Dummy for Join) 取引先分類マスタ５（取引先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp5 = "dummy_bp_grp5";
	/**
	 * BP classification master 6 (BP) (Dummy for Join) 取引先分類マスタ６（取引先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp6 = "dummy_bp_grp6";
	/**
	 * BP classification master 7 (BP) (Dummy for Join) 取引先分類マスタ７（取引先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp7 = "dummy_bp_grp7";
	/**
	 * BP classification master 8 (BP) (Dummy for Join) 取引先分類マスタ８（取引先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp8 = "dummy_bp_grp8";
	/**
	 * BP classification master 9 (BP) (Dummy for Join) 取引先分類マスタ９（取引先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp9 = "dummy_bp_grp9";
	/**
	 * BP classification master 10 (BP) (Dummy for Join) 取引先分類マスタ１０（取引先）（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_bp_grp10 = "dummy_bp_grp10";
	/**
	 * Beginning inventory key 月初在庫キー.<p>
	 *
	 */
	public static final String $st_stk_key = "st_stk_key";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * After standard evaluation 標準評価後.<p>
	 *
	 */
	public static final String $std_flg = "std_flg";
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public static final String $gr_dt = "gr_dt";
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Total 合計.<p>
	 *
	 */
	public static final String $ttl = "ttl";
	public static final String $col_000 = "col_000";
	public static final String $col_001 = "col_001";
	public static final String $col_002 = "col_002";
	public static final String $col_003 = "col_003";
	public static final String $col_004 = "col_004";
	public static final String $col_005 = "col_005";
	public static final String $col_006 = "col_006";
	public static final String $col_007 = "col_007";
	public static final String $col_008 = "col_008";
	public static final String $col_009 = "col_009";
	public static final String $col_010 = "col_010";
	public static final String $col_011 = "col_011";
	public static final String $col_012 = "col_012";
	public static final String $col_013 = "col_013";
	public static final String $col_014 = "col_014";
	public static final String $col_015 = "col_015";
	public static final String $col_016 = "col_016";
	public static final String $col_017 = "col_017";
	public static final String $col_018 = "col_018";
	public static final String $col_019 = "col_019";
	public static final String $col_020 = "col_020";
	public static final String $col_021 = "col_021";
	public static final String $col_022 = "col_022";
	public static final String $col_023 = "col_023";
	public static final String $col_024 = "col_024";
	public static final String $col_025 = "col_025";
	public static final String $col_026 = "col_026";
	public static final String $col_027 = "col_027";
	public static final String $col_028 = "col_028";
	public static final String $col_029 = "col_029";
	public static final String $col_030 = "col_030";
	public static final String $col_031 = "col_031";
	public static final String $col_032 = "col_032";
	public static final String $col_033 = "col_033";
	public static final String $col_034 = "col_034";
	public static final String $col_035 = "col_035";
	public static final String $col_036 = "col_036";
	public static final String $col_037 = "col_037";
	public static final String $col_038 = "col_038";
	public static final String $col_039 = "col_039";
	public static final String $col_040 = "col_040";
	public static final String $col_041 = "col_041";
	public static final String $col_042 = "col_042";
	public static final String $col_043 = "col_043";
	public static final String $col_044 = "col_044";
	public static final String $col_045 = "col_045";
	public static final String $col_046 = "col_046";
	public static final String $col_047 = "col_047";
	public static final String $col_048 = "col_048";
	public static final String $col_049 = "col_049";
	public static final String $col_050 = "col_050";
	public static final String $col_051 = "col_051";
	public static final String $col_052 = "col_052";
	public static final String $col_053 = "col_053";
	public static final String $col_054 = "col_054";
	public static final String $col_055 = "col_055";
	public static final String $col_056 = "col_056";
	public static final String $col_057 = "col_057";
	public static final String $col_058 = "col_058";
	public static final String $col_059 = "col_059";
	public static final String $col_060 = "col_060";
	public static final String $col_061 = "col_061";
	public static final String $col_062 = "col_062";
	public static final String $col_063 = "col_063";
	public static final String $col_064 = "col_064";
	public static final String $col_065 = "col_065";
	public static final String $col_066 = "col_066";
	public static final String $col_067 = "col_067";
	public static final String $col_068 = "col_068";
	public static final String $col_069 = "col_069";
	public static final String $col_070 = "col_070";
	public static final String $col_071 = "col_071";
	public static final String $col_072 = "col_072";
	public static final String $col_073 = "col_073";
	public static final String $col_074 = "col_074";
	public static final String $col_075 = "col_075";
	public static final String $col_076 = "col_076";
	public static final String $col_077 = "col_077";
	public static final String $col_078 = "col_078";
	public static final String $col_079 = "col_079";
	public static final String $col_080 = "col_080";
	public static final String $col_081 = "col_081";
	public static final String $col_082 = "col_082";
	public static final String $col_083 = "col_083";
	public static final String $col_084 = "col_084";
	public static final String $col_085 = "col_085";
	public static final String $col_086 = "col_086";
	public static final String $col_087 = "col_087";
	public static final String $col_088 = "col_088";
	public static final String $col_089 = "col_089";
	public static final String $col_090 = "col_090";
	public static final String $col_091 = "col_091";
	public static final String $col_092 = "col_092";
	public static final String $col_093 = "col_093";
	public static final String $col_094 = "col_094";
	public static final String $col_095 = "col_095";
	public static final String $col_096 = "col_096";
	public static final String $col_097 = "col_097";
	public static final String $col_098 = "col_098";
	public static final String $col_099 = "col_099";


	public static final MCMeta dummy_bp_cntry_META = createCommonMeta($dummy_bp_cntry, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dummy_bp_area_META = createCommonMeta($dummy_bp_area, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta dummy_itm_grp1_META = createCommonMeta($dummy_itm_grp1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp2_META = createCommonMeta($dummy_itm_grp2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp3_META = createCommonMeta($dummy_itm_grp3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp4_META = createCommonMeta($dummy_itm_grp4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp5_META = createCommonMeta($dummy_itm_grp5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp6_META = createCommonMeta($dummy_itm_grp6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp7_META = createCommonMeta($dummy_itm_grp7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp8_META = createCommonMeta($dummy_itm_grp8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp9_META = createCommonMeta($dummy_itm_grp9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_itm_grp10_META = createCommonMeta($dummy_itm_grp10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_bp_grp1_META = createCommonMeta($dummy_bp_grp1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp2_META = createCommonMeta($dummy_bp_grp2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp3_META = createCommonMeta($dummy_bp_grp3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp4_META = createCommonMeta($dummy_bp_grp4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp5_META = createCommonMeta($dummy_bp_grp5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp6_META = createCommonMeta($dummy_bp_grp6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp7_META = createCommonMeta($dummy_bp_grp7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp8_META = createCommonMeta($dummy_bp_grp8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp9_META = createCommonMeta($dummy_bp_grp9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dummy_bp_grp10_META = createCommonMeta($dummy_bp_grp10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta st_stk_key_META = createCommonMeta($st_stk_key, mcframe.commonMG.meta.MG_META.ROW_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta std_flg_META = createCommonMeta($std_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta gr_dt_META = createCommonMeta($gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ttl_META = createCommonMeta($ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_000_META = createCommonMeta($col_000, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_001_META = createCommonMeta($col_001, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_002_META = createCommonMeta($col_002, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_003_META = createCommonMeta($col_003, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_004_META = createCommonMeta($col_004, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_005_META = createCommonMeta($col_005, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_006_META = createCommonMeta($col_006, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_007_META = createCommonMeta($col_007, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_008_META = createCommonMeta($col_008, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_009_META = createCommonMeta($col_009, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_010_META = createCommonMeta($col_010, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_011_META = createCommonMeta($col_011, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_012_META = createCommonMeta($col_012, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_013_META = createCommonMeta($col_013, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_014_META = createCommonMeta($col_014, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_015_META = createCommonMeta($col_015, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_016_META = createCommonMeta($col_016, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_017_META = createCommonMeta($col_017, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_018_META = createCommonMeta($col_018, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_019_META = createCommonMeta($col_019, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_020_META = createCommonMeta($col_020, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_021_META = createCommonMeta($col_021, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_022_META = createCommonMeta($col_022, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_023_META = createCommonMeta($col_023, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_024_META = createCommonMeta($col_024, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_025_META = createCommonMeta($col_025, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_026_META = createCommonMeta($col_026, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_027_META = createCommonMeta($col_027, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_028_META = createCommonMeta($col_028, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_029_META = createCommonMeta($col_029, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_030_META = createCommonMeta($col_030, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_031_META = createCommonMeta($col_031, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_032_META = createCommonMeta($col_032, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_033_META = createCommonMeta($col_033, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_034_META = createCommonMeta($col_034, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_035_META = createCommonMeta($col_035, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_036_META = createCommonMeta($col_036, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_037_META = createCommonMeta($col_037, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_038_META = createCommonMeta($col_038, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_039_META = createCommonMeta($col_039, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_040_META = createCommonMeta($col_040, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_041_META = createCommonMeta($col_041, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_042_META = createCommonMeta($col_042, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_043_META = createCommonMeta($col_043, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_044_META = createCommonMeta($col_044, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_045_META = createCommonMeta($col_045, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_046_META = createCommonMeta($col_046, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_047_META = createCommonMeta($col_047, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_048_META = createCommonMeta($col_048, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_049_META = createCommonMeta($col_049, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_050_META = createCommonMeta($col_050, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_051_META = createCommonMeta($col_051, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_052_META = createCommonMeta($col_052, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_053_META = createCommonMeta($col_053, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_054_META = createCommonMeta($col_054, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_055_META = createCommonMeta($col_055, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_056_META = createCommonMeta($col_056, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_057_META = createCommonMeta($col_057, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_058_META = createCommonMeta($col_058, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_059_META = createCommonMeta($col_059, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_060_META = createCommonMeta($col_060, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_061_META = createCommonMeta($col_061, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_062_META = createCommonMeta($col_062, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_063_META = createCommonMeta($col_063, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_064_META = createCommonMeta($col_064, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_065_META = createCommonMeta($col_065, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_066_META = createCommonMeta($col_066, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_067_META = createCommonMeta($col_067, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_068_META = createCommonMeta($col_068, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_069_META = createCommonMeta($col_069, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_070_META = createCommonMeta($col_070, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_071_META = createCommonMeta($col_071, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_072_META = createCommonMeta($col_072, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_073_META = createCommonMeta($col_073, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_074_META = createCommonMeta($col_074, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_075_META = createCommonMeta($col_075, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_076_META = createCommonMeta($col_076, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_077_META = createCommonMeta($col_077, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_078_META = createCommonMeta($col_078, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_079_META = createCommonMeta($col_079, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_080_META = createCommonMeta($col_080, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_081_META = createCommonMeta($col_081, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_082_META = createCommonMeta($col_082, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_083_META = createCommonMeta($col_083, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_084_META = createCommonMeta($col_084, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_085_META = createCommonMeta($col_085, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_086_META = createCommonMeta($col_086, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_087_META = createCommonMeta($col_087, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_088_META = createCommonMeta($col_088, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_089_META = createCommonMeta($col_089, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_090_META = createCommonMeta($col_090, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_091_META = createCommonMeta($col_091, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_092_META = createCommonMeta($col_092, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_093_META = createCommonMeta($col_093, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_094_META = createCommonMeta($col_094, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_095_META = createCommonMeta($col_095, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_096_META = createCommonMeta($col_096, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_097_META = createCommonMeta($col_097, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_098_META = createCommonMeta($col_098, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_099_META = createCommonMeta($col_099, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dummy_bp_cntry_META,
			dummy_bp_area_META,
			dummy_itm_grp1_META,
			dummy_itm_grp2_META,
			dummy_itm_grp3_META,
			dummy_itm_grp4_META,
			dummy_itm_grp5_META,
			dummy_itm_grp6_META,
			dummy_itm_grp7_META,
			dummy_itm_grp8_META,
			dummy_itm_grp9_META,
			dummy_itm_grp10_META,
			dummy_bp_grp1_META,
			dummy_bp_grp2_META,
			dummy_bp_grp3_META,
			dummy_bp_grp4_META,
			dummy_bp_grp5_META,
			dummy_bp_grp6_META,
			dummy_bp_grp7_META,
			dummy_bp_grp8_META,
			dummy_bp_grp9_META,
			dummy_bp_grp10_META,
			st_stk_key_META,
			upd_cntr_META,
			std_flg_META,
			calc_grp_cd_META,
			calc_grp_nm_META,
			wg_cd_META,
			wg_nm_META,
			ym_META,
			gr_dt_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			bp_cd_META,
			bp_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			repurc_obli_flg_META,
			qty_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			ttl_META,
			col_000_META,
			col_001_META,
			col_002_META,
			col_003_META,
			col_004_META,
			col_005_META,
			col_006_META,
			col_007_META,
			col_008_META,
			col_009_META,
			col_010_META,
			col_011_META,
			col_012_META,
			col_013_META,
			col_014_META,
			col_015_META,
			col_016_META,
			col_017_META,
			col_018_META,
			col_019_META,
			col_020_META,
			col_021_META,
			col_022_META,
			col_023_META,
			col_024_META,
			col_025_META,
			col_026_META,
			col_027_META,
			col_028_META,
			col_029_META,
			col_030_META,
			col_031_META,
			col_032_META,
			col_033_META,
			col_034_META,
			col_035_META,
			col_036_META,
			col_037_META,
			col_038_META,
			col_039_META,
			col_040_META,
			col_041_META,
			col_042_META,
			col_043_META,
			col_044_META,
			col_045_META,
			col_046_META,
			col_047_META,
			col_048_META,
			col_049_META,
			col_050_META,
			col_051_META,
			col_052_META,
			col_053_META,
			col_054_META,
			col_055_META,
			col_056_META,
			col_057_META,
			col_058_META,
			col_059_META,
			col_060_META,
			col_061_META,
			col_062_META,
			col_063_META,
			col_064_META,
			col_065_META,
			col_066_META,
			col_067_META,
			col_068_META,
			col_069_META,
			col_070_META,
			col_071_META,
			col_072_META,
			col_073_META,
			col_074_META,
			col_075_META,
			col_076_META,
			col_077_META,
			col_078_META,
			col_079_META,
			col_080_META,
			col_081_META,
			col_082_META,
			col_083_META,
			col_084_META,
			col_085_META,
			col_086_META,
			col_087_META,
			col_088_META,
			col_089_META,
			col_090_META,
			col_091_META,
			col_092_META,
			col_093_META,
			col_094_META,
			col_095_META,
			col_096_META,
			col_097_META,
			col_098_META,
			col_099_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[FLG_COL]のキー定数 */
	public static final String $$FLG_COL = "FLG_COL";
	/** 項目属性情報のグループ[COL_SQL]のキー定数 */
	public static final String $$COL_SQL = "COL_SQL";
	/** 項目属性情報のグループ[SUM_SQL]のキー定数 */
	public static final String $$SUM_SQL = "SUM_SQL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$asst_typ, "MAC_ASST_TYP"}	// asst_typ
			}
		)),
		new MCExtMap.Entry($$FLG_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$COL_SQL, new MCExtList(
			new String[][]{
				{$st_stk_key, "T.ST_STK_KEY"},	// st_stk_key
				{$upd_cntr, "T.UPD_CNTR"},	// upd_cntr
				{$std_flg, "T.STD_FLG"},	// std_flg
				{$calc_grp_cd, "T.CALC_GRP_CD"},	// calc_grp_cd
				{$calc_grp_nm, "T.CALC_GRP_NM"},	// calc_grp_nm
				{$wg_cd, "T.WG_CD"},	// wg_cd
				{$wg_nm, "T.WG_NM"},	// wg_nm
				{$ym, "T.YM"},	// ym
				{$gr_dt, "T.GR_DT"},	// gr_dt
				{$mng_dpt_cd, "T.MNG_DPT_CD"},	// mng_dpt_cd
				{$mng_dpt_nm, "T.MNG_DPT_NM"},	// mng_dpt_nm
				{$itm_cd, "T.ITM_CD"},	// itm_cd
				{$itm_sub1, "T.ITM_SUB1"},	// itm_sub1
				{$itm_sub2, "T.ITM_SUB2"},	// itm_sub2
				{$itm_sub3, "T.ITM_SUB3"},	// itm_sub3
				{$itm_nm, "T.ITM_NM"},	// itm_nm
				{$itm_typ, "T.ITM_TYP"},	// itm_typ
				{$itm_typ_d_cd, "T.ITM_TYP_D_CD"},	// itm_typ_d_cd
				{$itm_typ_d_nm, "T.ITM_TYP_D_NM"},	// itm_typ_d_nm
				{$itm_jnl_cd, "T.ITM_JNL_CD"},	// itm_jnl_cd
				{$itm_jnl_nm, "T.ITM_JNL_NM"},	// itm_jnl_nm
				{$lot_no, "T.LOT_NO"},	// lot_no
				{$sublot_no, "T.SUBLOT_NO"},	// sublot_no
				{$sno1, "T.SNO1"},	// sno1
				{$sno2, "T.SNO2"},	// sno2
				{$sno3, "T.SNO3"},	// sno3
				{$sno4, "T.SNO4"},	// sno4
				{$bp_cd, "T.BP_CD"},	// bp_cd
				{$bp_nm, "T.BP_NM"},	// bp_nm
				{$asst_typ, "T.ASST_TYP"},	// asst_typ
				{$repurc_obli_flg, "T.REPURC_OBLI_FLG"},	// repurc_obli_flg
				{$qty, "T.QTY"},	// qty
				{$unit_cd, "T.UNIT_CD"},	// unit_cd
				{$unit_nm, "T.UNIT_NM"},	// unit_nm
				{$dec_place, "T.DEC_PLACE"}	// dec_place
			}
		)),
		new MCExtMap.Entry($$SUM_SQL, new MCExtList(
			new String[][]{
				{$ttl, "NVL(SUM(T.AMT),0)"},	// ttl
				{$col_000, "CUSTOM_SUM_COL"},	// col_000
				{$col_001, "CUSTOM_SUM_COL"},	// col_001
				{$col_002, "CUSTOM_SUM_COL"},	// col_002
				{$col_003, "CUSTOM_SUM_COL"},	// col_003
				{$col_004, "CUSTOM_SUM_COL"},	// col_004
				{$col_005, "CUSTOM_SUM_COL"},	// col_005
				{$col_006, "CUSTOM_SUM_COL"},	// col_006
				{$col_007, "CUSTOM_SUM_COL"},	// col_007
				{$col_008, "CUSTOM_SUM_COL"},	// col_008
				{$col_009, "CUSTOM_SUM_COL"},	// col_009
				{$col_010, "CUSTOM_SUM_COL"},	// col_010
				{$col_011, "CUSTOM_SUM_COL"},	// col_011
				{$col_012, "CUSTOM_SUM_COL"},	// col_012
				{$col_013, "CUSTOM_SUM_COL"},	// col_013
				{$col_014, "CUSTOM_SUM_COL"},	// col_014
				{$col_015, "CUSTOM_SUM_COL"},	// col_015
				{$col_016, "CUSTOM_SUM_COL"},	// col_016
				{$col_017, "CUSTOM_SUM_COL"},	// col_017
				{$col_018, "CUSTOM_SUM_COL"},	// col_018
				{$col_019, "CUSTOM_SUM_COL"},	// col_019
				{$col_020, "CUSTOM_SUM_COL"},	// col_020
				{$col_021, "CUSTOM_SUM_COL"},	// col_021
				{$col_022, "CUSTOM_SUM_COL"},	// col_022
				{$col_023, "CUSTOM_SUM_COL"},	// col_023
				{$col_024, "CUSTOM_SUM_COL"},	// col_024
				{$col_025, "CUSTOM_SUM_COL"},	// col_025
				{$col_026, "CUSTOM_SUM_COL"},	// col_026
				{$col_027, "CUSTOM_SUM_COL"},	// col_027
				{$col_028, "CUSTOM_SUM_COL"},	// col_028
				{$col_029, "CUSTOM_SUM_COL"},	// col_029
				{$col_030, "CUSTOM_SUM_COL"},	// col_030
				{$col_031, "CUSTOM_SUM_COL"},	// col_031
				{$col_032, "CUSTOM_SUM_COL"},	// col_032
				{$col_033, "CUSTOM_SUM_COL"},	// col_033
				{$col_034, "CUSTOM_SUM_COL"},	// col_034
				{$col_035, "CUSTOM_SUM_COL"},	// col_035
				{$col_036, "CUSTOM_SUM_COL"},	// col_036
				{$col_037, "CUSTOM_SUM_COL"},	// col_037
				{$col_038, "CUSTOM_SUM_COL"},	// col_038
				{$col_039, "CUSTOM_SUM_COL"},	// col_039
				{$col_040, "CUSTOM_SUM_COL"},	// col_040
				{$col_041, "CUSTOM_SUM_COL"},	// col_041
				{$col_042, "CUSTOM_SUM_COL"},	// col_042
				{$col_043, "CUSTOM_SUM_COL"},	// col_043
				{$col_044, "CUSTOM_SUM_COL"},	// col_044
				{$col_045, "CUSTOM_SUM_COL"},	// col_045
				{$col_046, "CUSTOM_SUM_COL"},	// col_046
				{$col_047, "CUSTOM_SUM_COL"},	// col_047
				{$col_048, "CUSTOM_SUM_COL"},	// col_048
				{$col_049, "CUSTOM_SUM_COL"},	// col_049
				{$col_050, "CUSTOM_SUM_COL"},	// col_050
				{$col_051, "CUSTOM_SUM_COL"},	// col_051
				{$col_052, "CUSTOM_SUM_COL"},	// col_052
				{$col_053, "CUSTOM_SUM_COL"},	// col_053
				{$col_054, "CUSTOM_SUM_COL"},	// col_054
				{$col_055, "CUSTOM_SUM_COL"},	// col_055
				{$col_056, "CUSTOM_SUM_COL"},	// col_056
				{$col_057, "CUSTOM_SUM_COL"},	// col_057
				{$col_058, "CUSTOM_SUM_COL"},	// col_058
				{$col_059, "CUSTOM_SUM_COL"},	// col_059
				{$col_060, "CUSTOM_SUM_COL"},	// col_060
				{$col_061, "CUSTOM_SUM_COL"},	// col_061
				{$col_062, "CUSTOM_SUM_COL"},	// col_062
				{$col_063, "CUSTOM_SUM_COL"},	// col_063
				{$col_064, "CUSTOM_SUM_COL"},	// col_064
				{$col_065, "CUSTOM_SUM_COL"},	// col_065
				{$col_066, "CUSTOM_SUM_COL"},	// col_066
				{$col_067, "CUSTOM_SUM_COL"},	// col_067
				{$col_068, "CUSTOM_SUM_COL"},	// col_068
				{$col_069, "CUSTOM_SUM_COL"},	// col_069
				{$col_070, "CUSTOM_SUM_COL"},	// col_070
				{$col_071, "CUSTOM_SUM_COL"},	// col_071
				{$col_072, "CUSTOM_SUM_COL"},	// col_072
				{$col_073, "CUSTOM_SUM_COL"},	// col_073
				{$col_074, "CUSTOM_SUM_COL"},	// col_074
				{$col_075, "CUSTOM_SUM_COL"},	// col_075
				{$col_076, "CUSTOM_SUM_COL"},	// col_076
				{$col_077, "CUSTOM_SUM_COL"},	// col_077
				{$col_078, "CUSTOM_SUM_COL"},	// col_078
				{$col_079, "CUSTOM_SUM_COL"},	// col_079
				{$col_080, "CUSTOM_SUM_COL"},	// col_080
				{$col_081, "CUSTOM_SUM_COL"},	// col_081
				{$col_082, "CUSTOM_SUM_COL"},	// col_082
				{$col_083, "CUSTOM_SUM_COL"},	// col_083
				{$col_084, "CUSTOM_SUM_COL"},	// col_084
				{$col_085, "CUSTOM_SUM_COL"},	// col_085
				{$col_086, "CUSTOM_SUM_COL"},	// col_086
				{$col_087, "CUSTOM_SUM_COL"},	// col_087
				{$col_088, "CUSTOM_SUM_COL"},	// col_088
				{$col_089, "CUSTOM_SUM_COL"},	// col_089
				{$col_090, "CUSTOM_SUM_COL"},	// col_090
				{$col_091, "CUSTOM_SUM_COL"},	// col_091
				{$col_092, "CUSTOM_SUM_COL"},	// col_092
				{$col_093, "CUSTOM_SUM_COL"},	// col_093
				{$col_094, "CUSTOM_SUM_COL"},	// col_094
				{$col_095, "CUSTOM_SUM_COL"},	// col_095
				{$col_096, "CUSTOM_SUM_COL"},	// col_096
				{$col_097, "CUSTOM_SUM_COL"},	// col_097
				{$col_098, "CUSTOM_SUM_COL"},	// col_098
				{$col_099, "CUSTOM_SUM_COL"}	// col_099
			}
		))
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Country master (BP) (Dummy for join) 国マスタ（取引先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_cntry() {
		return getConstString(offset + 0, $dummy_bp_cntry);
	}

	/**
	 * Country master (BP) (Dummy for join) 国マスタ（取引先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_cntry(String value) {
		setConstString(offset + 0, $dummy_bp_cntry, value);
	}


	/**
	 * Region master (BP) (Dummy for join) 地域マスタ（取引先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_area() {
		return getConstString(offset + 1, $dummy_bp_area);
	}

	/**
	 * Region master (BP) (Dummy for join) 地域マスタ（取引先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_area(String value) {
		setConstString(offset + 1, $dummy_bp_area, value);
	}


	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp1() {
		return getConstString(offset + 2, $dummy_itm_grp1);
	}

	/**
	 * Item classification master 1 (Dummy for join) 品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp1(String value) {
		setConstString(offset + 2, $dummy_itm_grp1, value);
	}


	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp2() {
		return getConstString(offset + 3, $dummy_itm_grp2);
	}

	/**
	 * Item classification master 2 (Dummy for join) 品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp2(String value) {
		setConstString(offset + 3, $dummy_itm_grp2, value);
	}


	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp3() {
		return getConstString(offset + 4, $dummy_itm_grp3);
	}

	/**
	 * Item classification master 3 (Dummy for join) 品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp3(String value) {
		setConstString(offset + 4, $dummy_itm_grp3, value);
	}


	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp4() {
		return getConstString(offset + 5, $dummy_itm_grp4);
	}

	/**
	 * Item classification master 4 (Dummy for join) 品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp4(String value) {
		setConstString(offset + 5, $dummy_itm_grp4, value);
	}


	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp5() {
		return getConstString(offset + 6, $dummy_itm_grp5);
	}

	/**
	 * Item classification master 5 (Dummy for join) 品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp5(String value) {
		setConstString(offset + 6, $dummy_itm_grp5, value);
	}


	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp6() {
		return getConstString(offset + 7, $dummy_itm_grp6);
	}

	/**
	 * Item classification master 6 (Dummy for join) 品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp6(String value) {
		setConstString(offset + 7, $dummy_itm_grp6, value);
	}


	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp7() {
		return getConstString(offset + 8, $dummy_itm_grp7);
	}

	/**
	 * Item classification master 7 (Dummy for join) 品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp7(String value) {
		setConstString(offset + 8, $dummy_itm_grp7, value);
	}


	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp8() {
		return getConstString(offset + 9, $dummy_itm_grp8);
	}

	/**
	 * Item classification master 8 (Dummy for join) 品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp8(String value) {
		setConstString(offset + 9, $dummy_itm_grp8, value);
	}


	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp9() {
		return getConstString(offset + 10, $dummy_itm_grp9);
	}

	/**
	 * Item classification master 9 (Dummy for join) 品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp9(String value) {
		setConstString(offset + 10, $dummy_itm_grp9, value);
	}


	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public String dummy_itm_grp10() {
		return getConstString(offset + 11, $dummy_itm_grp10);
	}

	/**
	 * Item classification master 10 (Dummy for join) 品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public void dummy_itm_grp10(String value) {
		setConstString(offset + 11, $dummy_itm_grp10, value);
	}


	/**
	 * BP classification master 1 (BP) (Dummy for Join) 取引先分類マスタ１（取引先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp1() {
		return getConstString(offset + 12, $dummy_bp_grp1);
	}

	/**
	 * BP classification master 1 (BP) (Dummy for Join) 取引先分類マスタ１（取引先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp1(String value) {
		setConstString(offset + 12, $dummy_bp_grp1, value);
	}


	/**
	 * BP classification master 2 (BP) (Dummy for Join) 取引先分類マスタ２（取引先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp2() {
		return getConstString(offset + 13, $dummy_bp_grp2);
	}

	/**
	 * BP classification master 2 (BP) (Dummy for Join) 取引先分類マスタ２（取引先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp2(String value) {
		setConstString(offset + 13, $dummy_bp_grp2, value);
	}


	/**
	 * BP classification master 3 (BP) (Dummy for Join) 取引先分類マスタ３（取引先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp3() {
		return getConstString(offset + 14, $dummy_bp_grp3);
	}

	/**
	 * BP classification master 3 (BP) (Dummy for Join) 取引先分類マスタ３（取引先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp3(String value) {
		setConstString(offset + 14, $dummy_bp_grp3, value);
	}


	/**
	 * BP classification master 4 (BP) (Dummy for Join) 取引先分類マスタ４（取引先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp4() {
		return getConstString(offset + 15, $dummy_bp_grp4);
	}

	/**
	 * BP classification master 4 (BP) (Dummy for Join) 取引先分類マスタ４（取引先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp4(String value) {
		setConstString(offset + 15, $dummy_bp_grp4, value);
	}


	/**
	 * BP classification master 5 (BP) (Dummy for Join) 取引先分類マスタ５（取引先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp5() {
		return getConstString(offset + 16, $dummy_bp_grp5);
	}

	/**
	 * BP classification master 5 (BP) (Dummy for Join) 取引先分類マスタ５（取引先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp5(String value) {
		setConstString(offset + 16, $dummy_bp_grp5, value);
	}


	/**
	 * BP classification master 6 (BP) (Dummy for Join) 取引先分類マスタ６（取引先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp6() {
		return getConstString(offset + 17, $dummy_bp_grp6);
	}

	/**
	 * BP classification master 6 (BP) (Dummy for Join) 取引先分類マスタ６（取引先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp6(String value) {
		setConstString(offset + 17, $dummy_bp_grp6, value);
	}


	/**
	 * BP classification master 7 (BP) (Dummy for Join) 取引先分類マスタ７（取引先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp7() {
		return getConstString(offset + 18, $dummy_bp_grp7);
	}

	/**
	 * BP classification master 7 (BP) (Dummy for Join) 取引先分類マスタ７（取引先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp7(String value) {
		setConstString(offset + 18, $dummy_bp_grp7, value);
	}


	/**
	 * BP classification master 8 (BP) (Dummy for Join) 取引先分類マスタ８（取引先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp8() {
		return getConstString(offset + 19, $dummy_bp_grp8);
	}

	/**
	 * BP classification master 8 (BP) (Dummy for Join) 取引先分類マスタ８（取引先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp8(String value) {
		setConstString(offset + 19, $dummy_bp_grp8, value);
	}


	/**
	 * BP classification master 9 (BP) (Dummy for Join) 取引先分類マスタ９（取引先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp9() {
		return getConstString(offset + 20, $dummy_bp_grp9);
	}

	/**
	 * BP classification master 9 (BP) (Dummy for Join) 取引先分類マスタ９（取引先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp9(String value) {
		setConstString(offset + 20, $dummy_bp_grp9, value);
	}


	/**
	 * BP classification master 10 (BP) (Dummy for Join) 取引先分類マスタ１０（取引先）（結合用ダミー）.<p>
	 *
	 */
	public String dummy_bp_grp10() {
		return getConstString(offset + 21, $dummy_bp_grp10);
	}

	/**
	 * BP classification master 10 (BP) (Dummy for Join) 取引先分類マスタ１０（取引先）（結合用ダミー）.<p>
	 *
	 */
	public void dummy_bp_grp10(String value) {
		setConstString(offset + 21, $dummy_bp_grp10, value);
	}


	/**
	 * Beginning inventory key 月初在庫キー.<p>
	 *
	 */
	public MCNumber st_stk_key() {
		return getConstNumber(offset + 22, $st_stk_key);
	}

	/**
	 * Beginning inventory key 月初在庫キー.<p>
	 *
	 */
	public void st_stk_key(MCNumber value) {
		setConstNumber(offset + 22, $st_stk_key, value);
	}

	/**
	 * Beginning inventory key 月初在庫キー.<p>
	 *
	 */
	public void st_stk_key(int value) {
		setConstNumber(offset + 22, $st_stk_key, value);
	}

	/**
	 * Beginning inventory key 月初在庫キー.<p>
	 *
	 */
	public void st_stk_key(long value) {
		setConstNumber(offset + 22, $st_stk_key, value);
	}

	/**
	 * Beginning inventory key 月初在庫キー.<p>
	 *
	 */
	public void st_stk_key(float value) {
		setConstNumber(offset + 22, $st_stk_key, value);
	}

	/**
	 * Beginning inventory key 月初在庫キー.<p>
	 *
	 */
	public void st_stk_key(double value) {
		setConstNumber(offset + 22, $st_stk_key, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 23, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}


	/**
	 * After standard evaluation 標準評価後.<p>
	 *
	 */
	public boolean std_flg() {
		return getConstBoolean(offset + 24, $std_flg);
	}

	/**
	 * After standard evaluation 標準評価後.<p>
	 *
	 */
	public void std_flg(boolean value) {
		setConstBoolean(offset + 24, $std_flg, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 25, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 25, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 26, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 26, $calc_grp_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 27, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 27, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 28, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 28, $wg_nm, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 29, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 29, $ym, value);
	}


	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public MCDate gr_dt() {
		return getConstDate(offset + 30, $gr_dt);
	}

	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public void gr_dt(MCDate value) {
		setConstDate(offset + 30, $gr_dt, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 31, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 31, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 32, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 32, $mng_dpt_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 33, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 33, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 34, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 34, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 35, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 35, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 36, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 36, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 37, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 37, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 38, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 38, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 39, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 39, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 40, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 40, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 41, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 41, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 42, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 42, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 43, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 43, $itm_jnl_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 44, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 44, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 45, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 45, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 46, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 46, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 47, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 47, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 48, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 48, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 49, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 49, $sno4, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 50, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 50, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 51, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 51, $bp_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 52, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 52, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 53, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 53, $asst_typ_nm, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 54, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 54, $repurc_obli_flg, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 55, $qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 55, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 55, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 55, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 55, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 55, $qty, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 56, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 56, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 57, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 57, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 58, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 58, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 58, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 58, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 58, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 58, $dec_place, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl() {
		return getConstNumber(offset + 59, $ttl);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		setConstNumber(offset + 59, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(int value) {
		setConstNumber(offset + 59, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(long value) {
		setConstNumber(offset + 59, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(float value) {
		setConstNumber(offset + 59, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(double value) {
		setConstNumber(offset + 59, $ttl, value);
	}


	public MCNumber col_000() {
		return getConstNumber(offset + 60, $col_000);
	}

	public void col_000(MCNumber value) {
		setConstNumber(offset + 60, $col_000, value);
	}

	public void col_000(int value) {
		setConstNumber(offset + 60, $col_000, value);
	}

	public void col_000(long value) {
		setConstNumber(offset + 60, $col_000, value);
	}

	public void col_000(float value) {
		setConstNumber(offset + 60, $col_000, value);
	}

	public void col_000(double value) {
		setConstNumber(offset + 60, $col_000, value);
	}


	public MCNumber col_001() {
		return getConstNumber(offset + 61, $col_001);
	}

	public void col_001(MCNumber value) {
		setConstNumber(offset + 61, $col_001, value);
	}

	public void col_001(int value) {
		setConstNumber(offset + 61, $col_001, value);
	}

	public void col_001(long value) {
		setConstNumber(offset + 61, $col_001, value);
	}

	public void col_001(float value) {
		setConstNumber(offset + 61, $col_001, value);
	}

	public void col_001(double value) {
		setConstNumber(offset + 61, $col_001, value);
	}


	public MCNumber col_002() {
		return getConstNumber(offset + 62, $col_002);
	}

	public void col_002(MCNumber value) {
		setConstNumber(offset + 62, $col_002, value);
	}

	public void col_002(int value) {
		setConstNumber(offset + 62, $col_002, value);
	}

	public void col_002(long value) {
		setConstNumber(offset + 62, $col_002, value);
	}

	public void col_002(float value) {
		setConstNumber(offset + 62, $col_002, value);
	}

	public void col_002(double value) {
		setConstNumber(offset + 62, $col_002, value);
	}


	public MCNumber col_003() {
		return getConstNumber(offset + 63, $col_003);
	}

	public void col_003(MCNumber value) {
		setConstNumber(offset + 63, $col_003, value);
	}

	public void col_003(int value) {
		setConstNumber(offset + 63, $col_003, value);
	}

	public void col_003(long value) {
		setConstNumber(offset + 63, $col_003, value);
	}

	public void col_003(float value) {
		setConstNumber(offset + 63, $col_003, value);
	}

	public void col_003(double value) {
		setConstNumber(offset + 63, $col_003, value);
	}


	public MCNumber col_004() {
		return getConstNumber(offset + 64, $col_004);
	}

	public void col_004(MCNumber value) {
		setConstNumber(offset + 64, $col_004, value);
	}

	public void col_004(int value) {
		setConstNumber(offset + 64, $col_004, value);
	}

	public void col_004(long value) {
		setConstNumber(offset + 64, $col_004, value);
	}

	public void col_004(float value) {
		setConstNumber(offset + 64, $col_004, value);
	}

	public void col_004(double value) {
		setConstNumber(offset + 64, $col_004, value);
	}


	public MCNumber col_005() {
		return getConstNumber(offset + 65, $col_005);
	}

	public void col_005(MCNumber value) {
		setConstNumber(offset + 65, $col_005, value);
	}

	public void col_005(int value) {
		setConstNumber(offset + 65, $col_005, value);
	}

	public void col_005(long value) {
		setConstNumber(offset + 65, $col_005, value);
	}

	public void col_005(float value) {
		setConstNumber(offset + 65, $col_005, value);
	}

	public void col_005(double value) {
		setConstNumber(offset + 65, $col_005, value);
	}


	public MCNumber col_006() {
		return getConstNumber(offset + 66, $col_006);
	}

	public void col_006(MCNumber value) {
		setConstNumber(offset + 66, $col_006, value);
	}

	public void col_006(int value) {
		setConstNumber(offset + 66, $col_006, value);
	}

	public void col_006(long value) {
		setConstNumber(offset + 66, $col_006, value);
	}

	public void col_006(float value) {
		setConstNumber(offset + 66, $col_006, value);
	}

	public void col_006(double value) {
		setConstNumber(offset + 66, $col_006, value);
	}


	public MCNumber col_007() {
		return getConstNumber(offset + 67, $col_007);
	}

	public void col_007(MCNumber value) {
		setConstNumber(offset + 67, $col_007, value);
	}

	public void col_007(int value) {
		setConstNumber(offset + 67, $col_007, value);
	}

	public void col_007(long value) {
		setConstNumber(offset + 67, $col_007, value);
	}

	public void col_007(float value) {
		setConstNumber(offset + 67, $col_007, value);
	}

	public void col_007(double value) {
		setConstNumber(offset + 67, $col_007, value);
	}


	public MCNumber col_008() {
		return getConstNumber(offset + 68, $col_008);
	}

	public void col_008(MCNumber value) {
		setConstNumber(offset + 68, $col_008, value);
	}

	public void col_008(int value) {
		setConstNumber(offset + 68, $col_008, value);
	}

	public void col_008(long value) {
		setConstNumber(offset + 68, $col_008, value);
	}

	public void col_008(float value) {
		setConstNumber(offset + 68, $col_008, value);
	}

	public void col_008(double value) {
		setConstNumber(offset + 68, $col_008, value);
	}


	public MCNumber col_009() {
		return getConstNumber(offset + 69, $col_009);
	}

	public void col_009(MCNumber value) {
		setConstNumber(offset + 69, $col_009, value);
	}

	public void col_009(int value) {
		setConstNumber(offset + 69, $col_009, value);
	}

	public void col_009(long value) {
		setConstNumber(offset + 69, $col_009, value);
	}

	public void col_009(float value) {
		setConstNumber(offset + 69, $col_009, value);
	}

	public void col_009(double value) {
		setConstNumber(offset + 69, $col_009, value);
	}


	public MCNumber col_010() {
		return getConstNumber(offset + 70, $col_010);
	}

	public void col_010(MCNumber value) {
		setConstNumber(offset + 70, $col_010, value);
	}

	public void col_010(int value) {
		setConstNumber(offset + 70, $col_010, value);
	}

	public void col_010(long value) {
		setConstNumber(offset + 70, $col_010, value);
	}

	public void col_010(float value) {
		setConstNumber(offset + 70, $col_010, value);
	}

	public void col_010(double value) {
		setConstNumber(offset + 70, $col_010, value);
	}


	public MCNumber col_011() {
		return getConstNumber(offset + 71, $col_011);
	}

	public void col_011(MCNumber value) {
		setConstNumber(offset + 71, $col_011, value);
	}

	public void col_011(int value) {
		setConstNumber(offset + 71, $col_011, value);
	}

	public void col_011(long value) {
		setConstNumber(offset + 71, $col_011, value);
	}

	public void col_011(float value) {
		setConstNumber(offset + 71, $col_011, value);
	}

	public void col_011(double value) {
		setConstNumber(offset + 71, $col_011, value);
	}


	public MCNumber col_012() {
		return getConstNumber(offset + 72, $col_012);
	}

	public void col_012(MCNumber value) {
		setConstNumber(offset + 72, $col_012, value);
	}

	public void col_012(int value) {
		setConstNumber(offset + 72, $col_012, value);
	}

	public void col_012(long value) {
		setConstNumber(offset + 72, $col_012, value);
	}

	public void col_012(float value) {
		setConstNumber(offset + 72, $col_012, value);
	}

	public void col_012(double value) {
		setConstNumber(offset + 72, $col_012, value);
	}


	public MCNumber col_013() {
		return getConstNumber(offset + 73, $col_013);
	}

	public void col_013(MCNumber value) {
		setConstNumber(offset + 73, $col_013, value);
	}

	public void col_013(int value) {
		setConstNumber(offset + 73, $col_013, value);
	}

	public void col_013(long value) {
		setConstNumber(offset + 73, $col_013, value);
	}

	public void col_013(float value) {
		setConstNumber(offset + 73, $col_013, value);
	}

	public void col_013(double value) {
		setConstNumber(offset + 73, $col_013, value);
	}


	public MCNumber col_014() {
		return getConstNumber(offset + 74, $col_014);
	}

	public void col_014(MCNumber value) {
		setConstNumber(offset + 74, $col_014, value);
	}

	public void col_014(int value) {
		setConstNumber(offset + 74, $col_014, value);
	}

	public void col_014(long value) {
		setConstNumber(offset + 74, $col_014, value);
	}

	public void col_014(float value) {
		setConstNumber(offset + 74, $col_014, value);
	}

	public void col_014(double value) {
		setConstNumber(offset + 74, $col_014, value);
	}


	public MCNumber col_015() {
		return getConstNumber(offset + 75, $col_015);
	}

	public void col_015(MCNumber value) {
		setConstNumber(offset + 75, $col_015, value);
	}

	public void col_015(int value) {
		setConstNumber(offset + 75, $col_015, value);
	}

	public void col_015(long value) {
		setConstNumber(offset + 75, $col_015, value);
	}

	public void col_015(float value) {
		setConstNumber(offset + 75, $col_015, value);
	}

	public void col_015(double value) {
		setConstNumber(offset + 75, $col_015, value);
	}


	public MCNumber col_016() {
		return getConstNumber(offset + 76, $col_016);
	}

	public void col_016(MCNumber value) {
		setConstNumber(offset + 76, $col_016, value);
	}

	public void col_016(int value) {
		setConstNumber(offset + 76, $col_016, value);
	}

	public void col_016(long value) {
		setConstNumber(offset + 76, $col_016, value);
	}

	public void col_016(float value) {
		setConstNumber(offset + 76, $col_016, value);
	}

	public void col_016(double value) {
		setConstNumber(offset + 76, $col_016, value);
	}


	public MCNumber col_017() {
		return getConstNumber(offset + 77, $col_017);
	}

	public void col_017(MCNumber value) {
		setConstNumber(offset + 77, $col_017, value);
	}

	public void col_017(int value) {
		setConstNumber(offset + 77, $col_017, value);
	}

	public void col_017(long value) {
		setConstNumber(offset + 77, $col_017, value);
	}

	public void col_017(float value) {
		setConstNumber(offset + 77, $col_017, value);
	}

	public void col_017(double value) {
		setConstNumber(offset + 77, $col_017, value);
	}


	public MCNumber col_018() {
		return getConstNumber(offset + 78, $col_018);
	}

	public void col_018(MCNumber value) {
		setConstNumber(offset + 78, $col_018, value);
	}

	public void col_018(int value) {
		setConstNumber(offset + 78, $col_018, value);
	}

	public void col_018(long value) {
		setConstNumber(offset + 78, $col_018, value);
	}

	public void col_018(float value) {
		setConstNumber(offset + 78, $col_018, value);
	}

	public void col_018(double value) {
		setConstNumber(offset + 78, $col_018, value);
	}


	public MCNumber col_019() {
		return getConstNumber(offset + 79, $col_019);
	}

	public void col_019(MCNumber value) {
		setConstNumber(offset + 79, $col_019, value);
	}

	public void col_019(int value) {
		setConstNumber(offset + 79, $col_019, value);
	}

	public void col_019(long value) {
		setConstNumber(offset + 79, $col_019, value);
	}

	public void col_019(float value) {
		setConstNumber(offset + 79, $col_019, value);
	}

	public void col_019(double value) {
		setConstNumber(offset + 79, $col_019, value);
	}


	public MCNumber col_020() {
		return getConstNumber(offset + 80, $col_020);
	}

	public void col_020(MCNumber value) {
		setConstNumber(offset + 80, $col_020, value);
	}

	public void col_020(int value) {
		setConstNumber(offset + 80, $col_020, value);
	}

	public void col_020(long value) {
		setConstNumber(offset + 80, $col_020, value);
	}

	public void col_020(float value) {
		setConstNumber(offset + 80, $col_020, value);
	}

	public void col_020(double value) {
		setConstNumber(offset + 80, $col_020, value);
	}


	public MCNumber col_021() {
		return getConstNumber(offset + 81, $col_021);
	}

	public void col_021(MCNumber value) {
		setConstNumber(offset + 81, $col_021, value);
	}

	public void col_021(int value) {
		setConstNumber(offset + 81, $col_021, value);
	}

	public void col_021(long value) {
		setConstNumber(offset + 81, $col_021, value);
	}

	public void col_021(float value) {
		setConstNumber(offset + 81, $col_021, value);
	}

	public void col_021(double value) {
		setConstNumber(offset + 81, $col_021, value);
	}


	public MCNumber col_022() {
		return getConstNumber(offset + 82, $col_022);
	}

	public void col_022(MCNumber value) {
		setConstNumber(offset + 82, $col_022, value);
	}

	public void col_022(int value) {
		setConstNumber(offset + 82, $col_022, value);
	}

	public void col_022(long value) {
		setConstNumber(offset + 82, $col_022, value);
	}

	public void col_022(float value) {
		setConstNumber(offset + 82, $col_022, value);
	}

	public void col_022(double value) {
		setConstNumber(offset + 82, $col_022, value);
	}


	public MCNumber col_023() {
		return getConstNumber(offset + 83, $col_023);
	}

	public void col_023(MCNumber value) {
		setConstNumber(offset + 83, $col_023, value);
	}

	public void col_023(int value) {
		setConstNumber(offset + 83, $col_023, value);
	}

	public void col_023(long value) {
		setConstNumber(offset + 83, $col_023, value);
	}

	public void col_023(float value) {
		setConstNumber(offset + 83, $col_023, value);
	}

	public void col_023(double value) {
		setConstNumber(offset + 83, $col_023, value);
	}


	public MCNumber col_024() {
		return getConstNumber(offset + 84, $col_024);
	}

	public void col_024(MCNumber value) {
		setConstNumber(offset + 84, $col_024, value);
	}

	public void col_024(int value) {
		setConstNumber(offset + 84, $col_024, value);
	}

	public void col_024(long value) {
		setConstNumber(offset + 84, $col_024, value);
	}

	public void col_024(float value) {
		setConstNumber(offset + 84, $col_024, value);
	}

	public void col_024(double value) {
		setConstNumber(offset + 84, $col_024, value);
	}


	public MCNumber col_025() {
		return getConstNumber(offset + 85, $col_025);
	}

	public void col_025(MCNumber value) {
		setConstNumber(offset + 85, $col_025, value);
	}

	public void col_025(int value) {
		setConstNumber(offset + 85, $col_025, value);
	}

	public void col_025(long value) {
		setConstNumber(offset + 85, $col_025, value);
	}

	public void col_025(float value) {
		setConstNumber(offset + 85, $col_025, value);
	}

	public void col_025(double value) {
		setConstNumber(offset + 85, $col_025, value);
	}


	public MCNumber col_026() {
		return getConstNumber(offset + 86, $col_026);
	}

	public void col_026(MCNumber value) {
		setConstNumber(offset + 86, $col_026, value);
	}

	public void col_026(int value) {
		setConstNumber(offset + 86, $col_026, value);
	}

	public void col_026(long value) {
		setConstNumber(offset + 86, $col_026, value);
	}

	public void col_026(float value) {
		setConstNumber(offset + 86, $col_026, value);
	}

	public void col_026(double value) {
		setConstNumber(offset + 86, $col_026, value);
	}


	public MCNumber col_027() {
		return getConstNumber(offset + 87, $col_027);
	}

	public void col_027(MCNumber value) {
		setConstNumber(offset + 87, $col_027, value);
	}

	public void col_027(int value) {
		setConstNumber(offset + 87, $col_027, value);
	}

	public void col_027(long value) {
		setConstNumber(offset + 87, $col_027, value);
	}

	public void col_027(float value) {
		setConstNumber(offset + 87, $col_027, value);
	}

	public void col_027(double value) {
		setConstNumber(offset + 87, $col_027, value);
	}


	public MCNumber col_028() {
		return getConstNumber(offset + 88, $col_028);
	}

	public void col_028(MCNumber value) {
		setConstNumber(offset + 88, $col_028, value);
	}

	public void col_028(int value) {
		setConstNumber(offset + 88, $col_028, value);
	}

	public void col_028(long value) {
		setConstNumber(offset + 88, $col_028, value);
	}

	public void col_028(float value) {
		setConstNumber(offset + 88, $col_028, value);
	}

	public void col_028(double value) {
		setConstNumber(offset + 88, $col_028, value);
	}


	public MCNumber col_029() {
		return getConstNumber(offset + 89, $col_029);
	}

	public void col_029(MCNumber value) {
		setConstNumber(offset + 89, $col_029, value);
	}

	public void col_029(int value) {
		setConstNumber(offset + 89, $col_029, value);
	}

	public void col_029(long value) {
		setConstNumber(offset + 89, $col_029, value);
	}

	public void col_029(float value) {
		setConstNumber(offset + 89, $col_029, value);
	}

	public void col_029(double value) {
		setConstNumber(offset + 89, $col_029, value);
	}


	public MCNumber col_030() {
		return getConstNumber(offset + 90, $col_030);
	}

	public void col_030(MCNumber value) {
		setConstNumber(offset + 90, $col_030, value);
	}

	public void col_030(int value) {
		setConstNumber(offset + 90, $col_030, value);
	}

	public void col_030(long value) {
		setConstNumber(offset + 90, $col_030, value);
	}

	public void col_030(float value) {
		setConstNumber(offset + 90, $col_030, value);
	}

	public void col_030(double value) {
		setConstNumber(offset + 90, $col_030, value);
	}


	public MCNumber col_031() {
		return getConstNumber(offset + 91, $col_031);
	}

	public void col_031(MCNumber value) {
		setConstNumber(offset + 91, $col_031, value);
	}

	public void col_031(int value) {
		setConstNumber(offset + 91, $col_031, value);
	}

	public void col_031(long value) {
		setConstNumber(offset + 91, $col_031, value);
	}

	public void col_031(float value) {
		setConstNumber(offset + 91, $col_031, value);
	}

	public void col_031(double value) {
		setConstNumber(offset + 91, $col_031, value);
	}


	public MCNumber col_032() {
		return getConstNumber(offset + 92, $col_032);
	}

	public void col_032(MCNumber value) {
		setConstNumber(offset + 92, $col_032, value);
	}

	public void col_032(int value) {
		setConstNumber(offset + 92, $col_032, value);
	}

	public void col_032(long value) {
		setConstNumber(offset + 92, $col_032, value);
	}

	public void col_032(float value) {
		setConstNumber(offset + 92, $col_032, value);
	}

	public void col_032(double value) {
		setConstNumber(offset + 92, $col_032, value);
	}


	public MCNumber col_033() {
		return getConstNumber(offset + 93, $col_033);
	}

	public void col_033(MCNumber value) {
		setConstNumber(offset + 93, $col_033, value);
	}

	public void col_033(int value) {
		setConstNumber(offset + 93, $col_033, value);
	}

	public void col_033(long value) {
		setConstNumber(offset + 93, $col_033, value);
	}

	public void col_033(float value) {
		setConstNumber(offset + 93, $col_033, value);
	}

	public void col_033(double value) {
		setConstNumber(offset + 93, $col_033, value);
	}


	public MCNumber col_034() {
		return getConstNumber(offset + 94, $col_034);
	}

	public void col_034(MCNumber value) {
		setConstNumber(offset + 94, $col_034, value);
	}

	public void col_034(int value) {
		setConstNumber(offset + 94, $col_034, value);
	}

	public void col_034(long value) {
		setConstNumber(offset + 94, $col_034, value);
	}

	public void col_034(float value) {
		setConstNumber(offset + 94, $col_034, value);
	}

	public void col_034(double value) {
		setConstNumber(offset + 94, $col_034, value);
	}


	public MCNumber col_035() {
		return getConstNumber(offset + 95, $col_035);
	}

	public void col_035(MCNumber value) {
		setConstNumber(offset + 95, $col_035, value);
	}

	public void col_035(int value) {
		setConstNumber(offset + 95, $col_035, value);
	}

	public void col_035(long value) {
		setConstNumber(offset + 95, $col_035, value);
	}

	public void col_035(float value) {
		setConstNumber(offset + 95, $col_035, value);
	}

	public void col_035(double value) {
		setConstNumber(offset + 95, $col_035, value);
	}


	public MCNumber col_036() {
		return getConstNumber(offset + 96, $col_036);
	}

	public void col_036(MCNumber value) {
		setConstNumber(offset + 96, $col_036, value);
	}

	public void col_036(int value) {
		setConstNumber(offset + 96, $col_036, value);
	}

	public void col_036(long value) {
		setConstNumber(offset + 96, $col_036, value);
	}

	public void col_036(float value) {
		setConstNumber(offset + 96, $col_036, value);
	}

	public void col_036(double value) {
		setConstNumber(offset + 96, $col_036, value);
	}


	public MCNumber col_037() {
		return getConstNumber(offset + 97, $col_037);
	}

	public void col_037(MCNumber value) {
		setConstNumber(offset + 97, $col_037, value);
	}

	public void col_037(int value) {
		setConstNumber(offset + 97, $col_037, value);
	}

	public void col_037(long value) {
		setConstNumber(offset + 97, $col_037, value);
	}

	public void col_037(float value) {
		setConstNumber(offset + 97, $col_037, value);
	}

	public void col_037(double value) {
		setConstNumber(offset + 97, $col_037, value);
	}


	public MCNumber col_038() {
		return getConstNumber(offset + 98, $col_038);
	}

	public void col_038(MCNumber value) {
		setConstNumber(offset + 98, $col_038, value);
	}

	public void col_038(int value) {
		setConstNumber(offset + 98, $col_038, value);
	}

	public void col_038(long value) {
		setConstNumber(offset + 98, $col_038, value);
	}

	public void col_038(float value) {
		setConstNumber(offset + 98, $col_038, value);
	}

	public void col_038(double value) {
		setConstNumber(offset + 98, $col_038, value);
	}


	public MCNumber col_039() {
		return getConstNumber(offset + 99, $col_039);
	}

	public void col_039(MCNumber value) {
		setConstNumber(offset + 99, $col_039, value);
	}

	public void col_039(int value) {
		setConstNumber(offset + 99, $col_039, value);
	}

	public void col_039(long value) {
		setConstNumber(offset + 99, $col_039, value);
	}

	public void col_039(float value) {
		setConstNumber(offset + 99, $col_039, value);
	}

	public void col_039(double value) {
		setConstNumber(offset + 99, $col_039, value);
	}


	public MCNumber col_040() {
		return getConstNumber(offset + 100, $col_040);
	}

	public void col_040(MCNumber value) {
		setConstNumber(offset + 100, $col_040, value);
	}

	public void col_040(int value) {
		setConstNumber(offset + 100, $col_040, value);
	}

	public void col_040(long value) {
		setConstNumber(offset + 100, $col_040, value);
	}

	public void col_040(float value) {
		setConstNumber(offset + 100, $col_040, value);
	}

	public void col_040(double value) {
		setConstNumber(offset + 100, $col_040, value);
	}


	public MCNumber col_041() {
		return getConstNumber(offset + 101, $col_041);
	}

	public void col_041(MCNumber value) {
		setConstNumber(offset + 101, $col_041, value);
	}

	public void col_041(int value) {
		setConstNumber(offset + 101, $col_041, value);
	}

	public void col_041(long value) {
		setConstNumber(offset + 101, $col_041, value);
	}

	public void col_041(float value) {
		setConstNumber(offset + 101, $col_041, value);
	}

	public void col_041(double value) {
		setConstNumber(offset + 101, $col_041, value);
	}


	public MCNumber col_042() {
		return getConstNumber(offset + 102, $col_042);
	}

	public void col_042(MCNumber value) {
		setConstNumber(offset + 102, $col_042, value);
	}

	public void col_042(int value) {
		setConstNumber(offset + 102, $col_042, value);
	}

	public void col_042(long value) {
		setConstNumber(offset + 102, $col_042, value);
	}

	public void col_042(float value) {
		setConstNumber(offset + 102, $col_042, value);
	}

	public void col_042(double value) {
		setConstNumber(offset + 102, $col_042, value);
	}


	public MCNumber col_043() {
		return getConstNumber(offset + 103, $col_043);
	}

	public void col_043(MCNumber value) {
		setConstNumber(offset + 103, $col_043, value);
	}

	public void col_043(int value) {
		setConstNumber(offset + 103, $col_043, value);
	}

	public void col_043(long value) {
		setConstNumber(offset + 103, $col_043, value);
	}

	public void col_043(float value) {
		setConstNumber(offset + 103, $col_043, value);
	}

	public void col_043(double value) {
		setConstNumber(offset + 103, $col_043, value);
	}


	public MCNumber col_044() {
		return getConstNumber(offset + 104, $col_044);
	}

	public void col_044(MCNumber value) {
		setConstNumber(offset + 104, $col_044, value);
	}

	public void col_044(int value) {
		setConstNumber(offset + 104, $col_044, value);
	}

	public void col_044(long value) {
		setConstNumber(offset + 104, $col_044, value);
	}

	public void col_044(float value) {
		setConstNumber(offset + 104, $col_044, value);
	}

	public void col_044(double value) {
		setConstNumber(offset + 104, $col_044, value);
	}


	public MCNumber col_045() {
		return getConstNumber(offset + 105, $col_045);
	}

	public void col_045(MCNumber value) {
		setConstNumber(offset + 105, $col_045, value);
	}

	public void col_045(int value) {
		setConstNumber(offset + 105, $col_045, value);
	}

	public void col_045(long value) {
		setConstNumber(offset + 105, $col_045, value);
	}

	public void col_045(float value) {
		setConstNumber(offset + 105, $col_045, value);
	}

	public void col_045(double value) {
		setConstNumber(offset + 105, $col_045, value);
	}


	public MCNumber col_046() {
		return getConstNumber(offset + 106, $col_046);
	}

	public void col_046(MCNumber value) {
		setConstNumber(offset + 106, $col_046, value);
	}

	public void col_046(int value) {
		setConstNumber(offset + 106, $col_046, value);
	}

	public void col_046(long value) {
		setConstNumber(offset + 106, $col_046, value);
	}

	public void col_046(float value) {
		setConstNumber(offset + 106, $col_046, value);
	}

	public void col_046(double value) {
		setConstNumber(offset + 106, $col_046, value);
	}


	public MCNumber col_047() {
		return getConstNumber(offset + 107, $col_047);
	}

	public void col_047(MCNumber value) {
		setConstNumber(offset + 107, $col_047, value);
	}

	public void col_047(int value) {
		setConstNumber(offset + 107, $col_047, value);
	}

	public void col_047(long value) {
		setConstNumber(offset + 107, $col_047, value);
	}

	public void col_047(float value) {
		setConstNumber(offset + 107, $col_047, value);
	}

	public void col_047(double value) {
		setConstNumber(offset + 107, $col_047, value);
	}


	public MCNumber col_048() {
		return getConstNumber(offset + 108, $col_048);
	}

	public void col_048(MCNumber value) {
		setConstNumber(offset + 108, $col_048, value);
	}

	public void col_048(int value) {
		setConstNumber(offset + 108, $col_048, value);
	}

	public void col_048(long value) {
		setConstNumber(offset + 108, $col_048, value);
	}

	public void col_048(float value) {
		setConstNumber(offset + 108, $col_048, value);
	}

	public void col_048(double value) {
		setConstNumber(offset + 108, $col_048, value);
	}


	public MCNumber col_049() {
		return getConstNumber(offset + 109, $col_049);
	}

	public void col_049(MCNumber value) {
		setConstNumber(offset + 109, $col_049, value);
	}

	public void col_049(int value) {
		setConstNumber(offset + 109, $col_049, value);
	}

	public void col_049(long value) {
		setConstNumber(offset + 109, $col_049, value);
	}

	public void col_049(float value) {
		setConstNumber(offset + 109, $col_049, value);
	}

	public void col_049(double value) {
		setConstNumber(offset + 109, $col_049, value);
	}


	public MCNumber col_050() {
		return getConstNumber(offset + 110, $col_050);
	}

	public void col_050(MCNumber value) {
		setConstNumber(offset + 110, $col_050, value);
	}

	public void col_050(int value) {
		setConstNumber(offset + 110, $col_050, value);
	}

	public void col_050(long value) {
		setConstNumber(offset + 110, $col_050, value);
	}

	public void col_050(float value) {
		setConstNumber(offset + 110, $col_050, value);
	}

	public void col_050(double value) {
		setConstNumber(offset + 110, $col_050, value);
	}


	public MCNumber col_051() {
		return getConstNumber(offset + 111, $col_051);
	}

	public void col_051(MCNumber value) {
		setConstNumber(offset + 111, $col_051, value);
	}

	public void col_051(int value) {
		setConstNumber(offset + 111, $col_051, value);
	}

	public void col_051(long value) {
		setConstNumber(offset + 111, $col_051, value);
	}

	public void col_051(float value) {
		setConstNumber(offset + 111, $col_051, value);
	}

	public void col_051(double value) {
		setConstNumber(offset + 111, $col_051, value);
	}


	public MCNumber col_052() {
		return getConstNumber(offset + 112, $col_052);
	}

	public void col_052(MCNumber value) {
		setConstNumber(offset + 112, $col_052, value);
	}

	public void col_052(int value) {
		setConstNumber(offset + 112, $col_052, value);
	}

	public void col_052(long value) {
		setConstNumber(offset + 112, $col_052, value);
	}

	public void col_052(float value) {
		setConstNumber(offset + 112, $col_052, value);
	}

	public void col_052(double value) {
		setConstNumber(offset + 112, $col_052, value);
	}


	public MCNumber col_053() {
		return getConstNumber(offset + 113, $col_053);
	}

	public void col_053(MCNumber value) {
		setConstNumber(offset + 113, $col_053, value);
	}

	public void col_053(int value) {
		setConstNumber(offset + 113, $col_053, value);
	}

	public void col_053(long value) {
		setConstNumber(offset + 113, $col_053, value);
	}

	public void col_053(float value) {
		setConstNumber(offset + 113, $col_053, value);
	}

	public void col_053(double value) {
		setConstNumber(offset + 113, $col_053, value);
	}


	public MCNumber col_054() {
		return getConstNumber(offset + 114, $col_054);
	}

	public void col_054(MCNumber value) {
		setConstNumber(offset + 114, $col_054, value);
	}

	public void col_054(int value) {
		setConstNumber(offset + 114, $col_054, value);
	}

	public void col_054(long value) {
		setConstNumber(offset + 114, $col_054, value);
	}

	public void col_054(float value) {
		setConstNumber(offset + 114, $col_054, value);
	}

	public void col_054(double value) {
		setConstNumber(offset + 114, $col_054, value);
	}


	public MCNumber col_055() {
		return getConstNumber(offset + 115, $col_055);
	}

	public void col_055(MCNumber value) {
		setConstNumber(offset + 115, $col_055, value);
	}

	public void col_055(int value) {
		setConstNumber(offset + 115, $col_055, value);
	}

	public void col_055(long value) {
		setConstNumber(offset + 115, $col_055, value);
	}

	public void col_055(float value) {
		setConstNumber(offset + 115, $col_055, value);
	}

	public void col_055(double value) {
		setConstNumber(offset + 115, $col_055, value);
	}


	public MCNumber col_056() {
		return getConstNumber(offset + 116, $col_056);
	}

	public void col_056(MCNumber value) {
		setConstNumber(offset + 116, $col_056, value);
	}

	public void col_056(int value) {
		setConstNumber(offset + 116, $col_056, value);
	}

	public void col_056(long value) {
		setConstNumber(offset + 116, $col_056, value);
	}

	public void col_056(float value) {
		setConstNumber(offset + 116, $col_056, value);
	}

	public void col_056(double value) {
		setConstNumber(offset + 116, $col_056, value);
	}


	public MCNumber col_057() {
		return getConstNumber(offset + 117, $col_057);
	}

	public void col_057(MCNumber value) {
		setConstNumber(offset + 117, $col_057, value);
	}

	public void col_057(int value) {
		setConstNumber(offset + 117, $col_057, value);
	}

	public void col_057(long value) {
		setConstNumber(offset + 117, $col_057, value);
	}

	public void col_057(float value) {
		setConstNumber(offset + 117, $col_057, value);
	}

	public void col_057(double value) {
		setConstNumber(offset + 117, $col_057, value);
	}


	public MCNumber col_058() {
		return getConstNumber(offset + 118, $col_058);
	}

	public void col_058(MCNumber value) {
		setConstNumber(offset + 118, $col_058, value);
	}

	public void col_058(int value) {
		setConstNumber(offset + 118, $col_058, value);
	}

	public void col_058(long value) {
		setConstNumber(offset + 118, $col_058, value);
	}

	public void col_058(float value) {
		setConstNumber(offset + 118, $col_058, value);
	}

	public void col_058(double value) {
		setConstNumber(offset + 118, $col_058, value);
	}


	public MCNumber col_059() {
		return getConstNumber(offset + 119, $col_059);
	}

	public void col_059(MCNumber value) {
		setConstNumber(offset + 119, $col_059, value);
	}

	public void col_059(int value) {
		setConstNumber(offset + 119, $col_059, value);
	}

	public void col_059(long value) {
		setConstNumber(offset + 119, $col_059, value);
	}

	public void col_059(float value) {
		setConstNumber(offset + 119, $col_059, value);
	}

	public void col_059(double value) {
		setConstNumber(offset + 119, $col_059, value);
	}


	public MCNumber col_060() {
		return getConstNumber(offset + 120, $col_060);
	}

	public void col_060(MCNumber value) {
		setConstNumber(offset + 120, $col_060, value);
	}

	public void col_060(int value) {
		setConstNumber(offset + 120, $col_060, value);
	}

	public void col_060(long value) {
		setConstNumber(offset + 120, $col_060, value);
	}

	public void col_060(float value) {
		setConstNumber(offset + 120, $col_060, value);
	}

	public void col_060(double value) {
		setConstNumber(offset + 120, $col_060, value);
	}


	public MCNumber col_061() {
		return getConstNumber(offset + 121, $col_061);
	}

	public void col_061(MCNumber value) {
		setConstNumber(offset + 121, $col_061, value);
	}

	public void col_061(int value) {
		setConstNumber(offset + 121, $col_061, value);
	}

	public void col_061(long value) {
		setConstNumber(offset + 121, $col_061, value);
	}

	public void col_061(float value) {
		setConstNumber(offset + 121, $col_061, value);
	}

	public void col_061(double value) {
		setConstNumber(offset + 121, $col_061, value);
	}


	public MCNumber col_062() {
		return getConstNumber(offset + 122, $col_062);
	}

	public void col_062(MCNumber value) {
		setConstNumber(offset + 122, $col_062, value);
	}

	public void col_062(int value) {
		setConstNumber(offset + 122, $col_062, value);
	}

	public void col_062(long value) {
		setConstNumber(offset + 122, $col_062, value);
	}

	public void col_062(float value) {
		setConstNumber(offset + 122, $col_062, value);
	}

	public void col_062(double value) {
		setConstNumber(offset + 122, $col_062, value);
	}


	public MCNumber col_063() {
		return getConstNumber(offset + 123, $col_063);
	}

	public void col_063(MCNumber value) {
		setConstNumber(offset + 123, $col_063, value);
	}

	public void col_063(int value) {
		setConstNumber(offset + 123, $col_063, value);
	}

	public void col_063(long value) {
		setConstNumber(offset + 123, $col_063, value);
	}

	public void col_063(float value) {
		setConstNumber(offset + 123, $col_063, value);
	}

	public void col_063(double value) {
		setConstNumber(offset + 123, $col_063, value);
	}


	public MCNumber col_064() {
		return getConstNumber(offset + 124, $col_064);
	}

	public void col_064(MCNumber value) {
		setConstNumber(offset + 124, $col_064, value);
	}

	public void col_064(int value) {
		setConstNumber(offset + 124, $col_064, value);
	}

	public void col_064(long value) {
		setConstNumber(offset + 124, $col_064, value);
	}

	public void col_064(float value) {
		setConstNumber(offset + 124, $col_064, value);
	}

	public void col_064(double value) {
		setConstNumber(offset + 124, $col_064, value);
	}


	public MCNumber col_065() {
		return getConstNumber(offset + 125, $col_065);
	}

	public void col_065(MCNumber value) {
		setConstNumber(offset + 125, $col_065, value);
	}

	public void col_065(int value) {
		setConstNumber(offset + 125, $col_065, value);
	}

	public void col_065(long value) {
		setConstNumber(offset + 125, $col_065, value);
	}

	public void col_065(float value) {
		setConstNumber(offset + 125, $col_065, value);
	}

	public void col_065(double value) {
		setConstNumber(offset + 125, $col_065, value);
	}


	public MCNumber col_066() {
		return getConstNumber(offset + 126, $col_066);
	}

	public void col_066(MCNumber value) {
		setConstNumber(offset + 126, $col_066, value);
	}

	public void col_066(int value) {
		setConstNumber(offset + 126, $col_066, value);
	}

	public void col_066(long value) {
		setConstNumber(offset + 126, $col_066, value);
	}

	public void col_066(float value) {
		setConstNumber(offset + 126, $col_066, value);
	}

	public void col_066(double value) {
		setConstNumber(offset + 126, $col_066, value);
	}


	public MCNumber col_067() {
		return getConstNumber(offset + 127, $col_067);
	}

	public void col_067(MCNumber value) {
		setConstNumber(offset + 127, $col_067, value);
	}

	public void col_067(int value) {
		setConstNumber(offset + 127, $col_067, value);
	}

	public void col_067(long value) {
		setConstNumber(offset + 127, $col_067, value);
	}

	public void col_067(float value) {
		setConstNumber(offset + 127, $col_067, value);
	}

	public void col_067(double value) {
		setConstNumber(offset + 127, $col_067, value);
	}


	public MCNumber col_068() {
		return getConstNumber(offset + 128, $col_068);
	}

	public void col_068(MCNumber value) {
		setConstNumber(offset + 128, $col_068, value);
	}

	public void col_068(int value) {
		setConstNumber(offset + 128, $col_068, value);
	}

	public void col_068(long value) {
		setConstNumber(offset + 128, $col_068, value);
	}

	public void col_068(float value) {
		setConstNumber(offset + 128, $col_068, value);
	}

	public void col_068(double value) {
		setConstNumber(offset + 128, $col_068, value);
	}


	public MCNumber col_069() {
		return getConstNumber(offset + 129, $col_069);
	}

	public void col_069(MCNumber value) {
		setConstNumber(offset + 129, $col_069, value);
	}

	public void col_069(int value) {
		setConstNumber(offset + 129, $col_069, value);
	}

	public void col_069(long value) {
		setConstNumber(offset + 129, $col_069, value);
	}

	public void col_069(float value) {
		setConstNumber(offset + 129, $col_069, value);
	}

	public void col_069(double value) {
		setConstNumber(offset + 129, $col_069, value);
	}


	public MCNumber col_070() {
		return getConstNumber(offset + 130, $col_070);
	}

	public void col_070(MCNumber value) {
		setConstNumber(offset + 130, $col_070, value);
	}

	public void col_070(int value) {
		setConstNumber(offset + 130, $col_070, value);
	}

	public void col_070(long value) {
		setConstNumber(offset + 130, $col_070, value);
	}

	public void col_070(float value) {
		setConstNumber(offset + 130, $col_070, value);
	}

	public void col_070(double value) {
		setConstNumber(offset + 130, $col_070, value);
	}


	public MCNumber col_071() {
		return getConstNumber(offset + 131, $col_071);
	}

	public void col_071(MCNumber value) {
		setConstNumber(offset + 131, $col_071, value);
	}

	public void col_071(int value) {
		setConstNumber(offset + 131, $col_071, value);
	}

	public void col_071(long value) {
		setConstNumber(offset + 131, $col_071, value);
	}

	public void col_071(float value) {
		setConstNumber(offset + 131, $col_071, value);
	}

	public void col_071(double value) {
		setConstNumber(offset + 131, $col_071, value);
	}


	public MCNumber col_072() {
		return getConstNumber(offset + 132, $col_072);
	}

	public void col_072(MCNumber value) {
		setConstNumber(offset + 132, $col_072, value);
	}

	public void col_072(int value) {
		setConstNumber(offset + 132, $col_072, value);
	}

	public void col_072(long value) {
		setConstNumber(offset + 132, $col_072, value);
	}

	public void col_072(float value) {
		setConstNumber(offset + 132, $col_072, value);
	}

	public void col_072(double value) {
		setConstNumber(offset + 132, $col_072, value);
	}


	public MCNumber col_073() {
		return getConstNumber(offset + 133, $col_073);
	}

	public void col_073(MCNumber value) {
		setConstNumber(offset + 133, $col_073, value);
	}

	public void col_073(int value) {
		setConstNumber(offset + 133, $col_073, value);
	}

	public void col_073(long value) {
		setConstNumber(offset + 133, $col_073, value);
	}

	public void col_073(float value) {
		setConstNumber(offset + 133, $col_073, value);
	}

	public void col_073(double value) {
		setConstNumber(offset + 133, $col_073, value);
	}


	public MCNumber col_074() {
		return getConstNumber(offset + 134, $col_074);
	}

	public void col_074(MCNumber value) {
		setConstNumber(offset + 134, $col_074, value);
	}

	public void col_074(int value) {
		setConstNumber(offset + 134, $col_074, value);
	}

	public void col_074(long value) {
		setConstNumber(offset + 134, $col_074, value);
	}

	public void col_074(float value) {
		setConstNumber(offset + 134, $col_074, value);
	}

	public void col_074(double value) {
		setConstNumber(offset + 134, $col_074, value);
	}


	public MCNumber col_075() {
		return getConstNumber(offset + 135, $col_075);
	}

	public void col_075(MCNumber value) {
		setConstNumber(offset + 135, $col_075, value);
	}

	public void col_075(int value) {
		setConstNumber(offset + 135, $col_075, value);
	}

	public void col_075(long value) {
		setConstNumber(offset + 135, $col_075, value);
	}

	public void col_075(float value) {
		setConstNumber(offset + 135, $col_075, value);
	}

	public void col_075(double value) {
		setConstNumber(offset + 135, $col_075, value);
	}


	public MCNumber col_076() {
		return getConstNumber(offset + 136, $col_076);
	}

	public void col_076(MCNumber value) {
		setConstNumber(offset + 136, $col_076, value);
	}

	public void col_076(int value) {
		setConstNumber(offset + 136, $col_076, value);
	}

	public void col_076(long value) {
		setConstNumber(offset + 136, $col_076, value);
	}

	public void col_076(float value) {
		setConstNumber(offset + 136, $col_076, value);
	}

	public void col_076(double value) {
		setConstNumber(offset + 136, $col_076, value);
	}


	public MCNumber col_077() {
		return getConstNumber(offset + 137, $col_077);
	}

	public void col_077(MCNumber value) {
		setConstNumber(offset + 137, $col_077, value);
	}

	public void col_077(int value) {
		setConstNumber(offset + 137, $col_077, value);
	}

	public void col_077(long value) {
		setConstNumber(offset + 137, $col_077, value);
	}

	public void col_077(float value) {
		setConstNumber(offset + 137, $col_077, value);
	}

	public void col_077(double value) {
		setConstNumber(offset + 137, $col_077, value);
	}


	public MCNumber col_078() {
		return getConstNumber(offset + 138, $col_078);
	}

	public void col_078(MCNumber value) {
		setConstNumber(offset + 138, $col_078, value);
	}

	public void col_078(int value) {
		setConstNumber(offset + 138, $col_078, value);
	}

	public void col_078(long value) {
		setConstNumber(offset + 138, $col_078, value);
	}

	public void col_078(float value) {
		setConstNumber(offset + 138, $col_078, value);
	}

	public void col_078(double value) {
		setConstNumber(offset + 138, $col_078, value);
	}


	public MCNumber col_079() {
		return getConstNumber(offset + 139, $col_079);
	}

	public void col_079(MCNumber value) {
		setConstNumber(offset + 139, $col_079, value);
	}

	public void col_079(int value) {
		setConstNumber(offset + 139, $col_079, value);
	}

	public void col_079(long value) {
		setConstNumber(offset + 139, $col_079, value);
	}

	public void col_079(float value) {
		setConstNumber(offset + 139, $col_079, value);
	}

	public void col_079(double value) {
		setConstNumber(offset + 139, $col_079, value);
	}


	public MCNumber col_080() {
		return getConstNumber(offset + 140, $col_080);
	}

	public void col_080(MCNumber value) {
		setConstNumber(offset + 140, $col_080, value);
	}

	public void col_080(int value) {
		setConstNumber(offset + 140, $col_080, value);
	}

	public void col_080(long value) {
		setConstNumber(offset + 140, $col_080, value);
	}

	public void col_080(float value) {
		setConstNumber(offset + 140, $col_080, value);
	}

	public void col_080(double value) {
		setConstNumber(offset + 140, $col_080, value);
	}


	public MCNumber col_081() {
		return getConstNumber(offset + 141, $col_081);
	}

	public void col_081(MCNumber value) {
		setConstNumber(offset + 141, $col_081, value);
	}

	public void col_081(int value) {
		setConstNumber(offset + 141, $col_081, value);
	}

	public void col_081(long value) {
		setConstNumber(offset + 141, $col_081, value);
	}

	public void col_081(float value) {
		setConstNumber(offset + 141, $col_081, value);
	}

	public void col_081(double value) {
		setConstNumber(offset + 141, $col_081, value);
	}


	public MCNumber col_082() {
		return getConstNumber(offset + 142, $col_082);
	}

	public void col_082(MCNumber value) {
		setConstNumber(offset + 142, $col_082, value);
	}

	public void col_082(int value) {
		setConstNumber(offset + 142, $col_082, value);
	}

	public void col_082(long value) {
		setConstNumber(offset + 142, $col_082, value);
	}

	public void col_082(float value) {
		setConstNumber(offset + 142, $col_082, value);
	}

	public void col_082(double value) {
		setConstNumber(offset + 142, $col_082, value);
	}


	public MCNumber col_083() {
		return getConstNumber(offset + 143, $col_083);
	}

	public void col_083(MCNumber value) {
		setConstNumber(offset + 143, $col_083, value);
	}

	public void col_083(int value) {
		setConstNumber(offset + 143, $col_083, value);
	}

	public void col_083(long value) {
		setConstNumber(offset + 143, $col_083, value);
	}

	public void col_083(float value) {
		setConstNumber(offset + 143, $col_083, value);
	}

	public void col_083(double value) {
		setConstNumber(offset + 143, $col_083, value);
	}


	public MCNumber col_084() {
		return getConstNumber(offset + 144, $col_084);
	}

	public void col_084(MCNumber value) {
		setConstNumber(offset + 144, $col_084, value);
	}

	public void col_084(int value) {
		setConstNumber(offset + 144, $col_084, value);
	}

	public void col_084(long value) {
		setConstNumber(offset + 144, $col_084, value);
	}

	public void col_084(float value) {
		setConstNumber(offset + 144, $col_084, value);
	}

	public void col_084(double value) {
		setConstNumber(offset + 144, $col_084, value);
	}


	public MCNumber col_085() {
		return getConstNumber(offset + 145, $col_085);
	}

	public void col_085(MCNumber value) {
		setConstNumber(offset + 145, $col_085, value);
	}

	public void col_085(int value) {
		setConstNumber(offset + 145, $col_085, value);
	}

	public void col_085(long value) {
		setConstNumber(offset + 145, $col_085, value);
	}

	public void col_085(float value) {
		setConstNumber(offset + 145, $col_085, value);
	}

	public void col_085(double value) {
		setConstNumber(offset + 145, $col_085, value);
	}


	public MCNumber col_086() {
		return getConstNumber(offset + 146, $col_086);
	}

	public void col_086(MCNumber value) {
		setConstNumber(offset + 146, $col_086, value);
	}

	public void col_086(int value) {
		setConstNumber(offset + 146, $col_086, value);
	}

	public void col_086(long value) {
		setConstNumber(offset + 146, $col_086, value);
	}

	public void col_086(float value) {
		setConstNumber(offset + 146, $col_086, value);
	}

	public void col_086(double value) {
		setConstNumber(offset + 146, $col_086, value);
	}


	public MCNumber col_087() {
		return getConstNumber(offset + 147, $col_087);
	}

	public void col_087(MCNumber value) {
		setConstNumber(offset + 147, $col_087, value);
	}

	public void col_087(int value) {
		setConstNumber(offset + 147, $col_087, value);
	}

	public void col_087(long value) {
		setConstNumber(offset + 147, $col_087, value);
	}

	public void col_087(float value) {
		setConstNumber(offset + 147, $col_087, value);
	}

	public void col_087(double value) {
		setConstNumber(offset + 147, $col_087, value);
	}


	public MCNumber col_088() {
		return getConstNumber(offset + 148, $col_088);
	}

	public void col_088(MCNumber value) {
		setConstNumber(offset + 148, $col_088, value);
	}

	public void col_088(int value) {
		setConstNumber(offset + 148, $col_088, value);
	}

	public void col_088(long value) {
		setConstNumber(offset + 148, $col_088, value);
	}

	public void col_088(float value) {
		setConstNumber(offset + 148, $col_088, value);
	}

	public void col_088(double value) {
		setConstNumber(offset + 148, $col_088, value);
	}


	public MCNumber col_089() {
		return getConstNumber(offset + 149, $col_089);
	}

	public void col_089(MCNumber value) {
		setConstNumber(offset + 149, $col_089, value);
	}

	public void col_089(int value) {
		setConstNumber(offset + 149, $col_089, value);
	}

	public void col_089(long value) {
		setConstNumber(offset + 149, $col_089, value);
	}

	public void col_089(float value) {
		setConstNumber(offset + 149, $col_089, value);
	}

	public void col_089(double value) {
		setConstNumber(offset + 149, $col_089, value);
	}


	public MCNumber col_090() {
		return getConstNumber(offset + 150, $col_090);
	}

	public void col_090(MCNumber value) {
		setConstNumber(offset + 150, $col_090, value);
	}

	public void col_090(int value) {
		setConstNumber(offset + 150, $col_090, value);
	}

	public void col_090(long value) {
		setConstNumber(offset + 150, $col_090, value);
	}

	public void col_090(float value) {
		setConstNumber(offset + 150, $col_090, value);
	}

	public void col_090(double value) {
		setConstNumber(offset + 150, $col_090, value);
	}


	public MCNumber col_091() {
		return getConstNumber(offset + 151, $col_091);
	}

	public void col_091(MCNumber value) {
		setConstNumber(offset + 151, $col_091, value);
	}

	public void col_091(int value) {
		setConstNumber(offset + 151, $col_091, value);
	}

	public void col_091(long value) {
		setConstNumber(offset + 151, $col_091, value);
	}

	public void col_091(float value) {
		setConstNumber(offset + 151, $col_091, value);
	}

	public void col_091(double value) {
		setConstNumber(offset + 151, $col_091, value);
	}


	public MCNumber col_092() {
		return getConstNumber(offset + 152, $col_092);
	}

	public void col_092(MCNumber value) {
		setConstNumber(offset + 152, $col_092, value);
	}

	public void col_092(int value) {
		setConstNumber(offset + 152, $col_092, value);
	}

	public void col_092(long value) {
		setConstNumber(offset + 152, $col_092, value);
	}

	public void col_092(float value) {
		setConstNumber(offset + 152, $col_092, value);
	}

	public void col_092(double value) {
		setConstNumber(offset + 152, $col_092, value);
	}


	public MCNumber col_093() {
		return getConstNumber(offset + 153, $col_093);
	}

	public void col_093(MCNumber value) {
		setConstNumber(offset + 153, $col_093, value);
	}

	public void col_093(int value) {
		setConstNumber(offset + 153, $col_093, value);
	}

	public void col_093(long value) {
		setConstNumber(offset + 153, $col_093, value);
	}

	public void col_093(float value) {
		setConstNumber(offset + 153, $col_093, value);
	}

	public void col_093(double value) {
		setConstNumber(offset + 153, $col_093, value);
	}


	public MCNumber col_094() {
		return getConstNumber(offset + 154, $col_094);
	}

	public void col_094(MCNumber value) {
		setConstNumber(offset + 154, $col_094, value);
	}

	public void col_094(int value) {
		setConstNumber(offset + 154, $col_094, value);
	}

	public void col_094(long value) {
		setConstNumber(offset + 154, $col_094, value);
	}

	public void col_094(float value) {
		setConstNumber(offset + 154, $col_094, value);
	}

	public void col_094(double value) {
		setConstNumber(offset + 154, $col_094, value);
	}


	public MCNumber col_095() {
		return getConstNumber(offset + 155, $col_095);
	}

	public void col_095(MCNumber value) {
		setConstNumber(offset + 155, $col_095, value);
	}

	public void col_095(int value) {
		setConstNumber(offset + 155, $col_095, value);
	}

	public void col_095(long value) {
		setConstNumber(offset + 155, $col_095, value);
	}

	public void col_095(float value) {
		setConstNumber(offset + 155, $col_095, value);
	}

	public void col_095(double value) {
		setConstNumber(offset + 155, $col_095, value);
	}


	public MCNumber col_096() {
		return getConstNumber(offset + 156, $col_096);
	}

	public void col_096(MCNumber value) {
		setConstNumber(offset + 156, $col_096, value);
	}

	public void col_096(int value) {
		setConstNumber(offset + 156, $col_096, value);
	}

	public void col_096(long value) {
		setConstNumber(offset + 156, $col_096, value);
	}

	public void col_096(float value) {
		setConstNumber(offset + 156, $col_096, value);
	}

	public void col_096(double value) {
		setConstNumber(offset + 156, $col_096, value);
	}


	public MCNumber col_097() {
		return getConstNumber(offset + 157, $col_097);
	}

	public void col_097(MCNumber value) {
		setConstNumber(offset + 157, $col_097, value);
	}

	public void col_097(int value) {
		setConstNumber(offset + 157, $col_097, value);
	}

	public void col_097(long value) {
		setConstNumber(offset + 157, $col_097, value);
	}

	public void col_097(float value) {
		setConstNumber(offset + 157, $col_097, value);
	}

	public void col_097(double value) {
		setConstNumber(offset + 157, $col_097, value);
	}


	public MCNumber col_098() {
		return getConstNumber(offset + 158, $col_098);
	}

	public void col_098(MCNumber value) {
		setConstNumber(offset + 158, $col_098, value);
	}

	public void col_098(int value) {
		setConstNumber(offset + 158, $col_098, value);
	}

	public void col_098(long value) {
		setConstNumber(offset + 158, $col_098, value);
	}

	public void col_098(float value) {
		setConstNumber(offset + 158, $col_098, value);
	}

	public void col_098(double value) {
		setConstNumber(offset + 158, $col_098, value);
	}


	public MCNumber col_099() {
		return getConstNumber(offset + 159, $col_099);
	}

	public void col_099(MCNumber value) {
		setConstNumber(offset + 159, $col_099, value);
	}

	public void col_099(int value) {
		setConstNumber(offset + 159, $col_099, value);
	}

	public void col_099(long value) {
		setConstNumber(offset + 159, $col_099, value);
	}

	public void col_099(float value) {
		setConstNumber(offset + 159, $col_099, value);
	}

	public void col_099(double value) {
		setConstNumber(offset + 159, $col_099, value);
	}


	public String getString(String name) {
		if ($dummy_bp_cntry.equalsIgnoreCase(name)) {
			return dummy_bp_cntry();
		}
		if ($dummy_bp_area.equalsIgnoreCase(name)) {
			return dummy_bp_area();
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_itm_grp1();
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_itm_grp2();
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_itm_grp3();
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_itm_grp4();
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_itm_grp5();
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_itm_grp6();
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_itm_grp7();
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_itm_grp8();
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_itm_grp9();
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_itm_grp10();
		}
		if ($dummy_bp_grp1.equalsIgnoreCase(name)) {
			return dummy_bp_grp1();
		}
		if ($dummy_bp_grp2.equalsIgnoreCase(name)) {
			return dummy_bp_grp2();
		}
		if ($dummy_bp_grp3.equalsIgnoreCase(name)) {
			return dummy_bp_grp3();
		}
		if ($dummy_bp_grp4.equalsIgnoreCase(name)) {
			return dummy_bp_grp4();
		}
		if ($dummy_bp_grp5.equalsIgnoreCase(name)) {
			return dummy_bp_grp5();
		}
		if ($dummy_bp_grp6.equalsIgnoreCase(name)) {
			return dummy_bp_grp6();
		}
		if ($dummy_bp_grp7.equalsIgnoreCase(name)) {
			return dummy_bp_grp7();
		}
		if ($dummy_bp_grp8.equalsIgnoreCase(name)) {
			return dummy_bp_grp8();
		}
		if ($dummy_bp_grp9.equalsIgnoreCase(name)) {
			return dummy_bp_grp9();
		}
		if ($dummy_bp_grp10.equalsIgnoreCase(name)) {
			return dummy_bp_grp10();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			return st_stk_key();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($col_000.equalsIgnoreCase(name)) {
			return col_000();
		}
		if ($col_001.equalsIgnoreCase(name)) {
			return col_001();
		}
		if ($col_002.equalsIgnoreCase(name)) {
			return col_002();
		}
		if ($col_003.equalsIgnoreCase(name)) {
			return col_003();
		}
		if ($col_004.equalsIgnoreCase(name)) {
			return col_004();
		}
		if ($col_005.equalsIgnoreCase(name)) {
			return col_005();
		}
		if ($col_006.equalsIgnoreCase(name)) {
			return col_006();
		}
		if ($col_007.equalsIgnoreCase(name)) {
			return col_007();
		}
		if ($col_008.equalsIgnoreCase(name)) {
			return col_008();
		}
		if ($col_009.equalsIgnoreCase(name)) {
			return col_009();
		}
		if ($col_010.equalsIgnoreCase(name)) {
			return col_010();
		}
		if ($col_011.equalsIgnoreCase(name)) {
			return col_011();
		}
		if ($col_012.equalsIgnoreCase(name)) {
			return col_012();
		}
		if ($col_013.equalsIgnoreCase(name)) {
			return col_013();
		}
		if ($col_014.equalsIgnoreCase(name)) {
			return col_014();
		}
		if ($col_015.equalsIgnoreCase(name)) {
			return col_015();
		}
		if ($col_016.equalsIgnoreCase(name)) {
			return col_016();
		}
		if ($col_017.equalsIgnoreCase(name)) {
			return col_017();
		}
		if ($col_018.equalsIgnoreCase(name)) {
			return col_018();
		}
		if ($col_019.equalsIgnoreCase(name)) {
			return col_019();
		}
		if ($col_020.equalsIgnoreCase(name)) {
			return col_020();
		}
		if ($col_021.equalsIgnoreCase(name)) {
			return col_021();
		}
		if ($col_022.equalsIgnoreCase(name)) {
			return col_022();
		}
		if ($col_023.equalsIgnoreCase(name)) {
			return col_023();
		}
		if ($col_024.equalsIgnoreCase(name)) {
			return col_024();
		}
		if ($col_025.equalsIgnoreCase(name)) {
			return col_025();
		}
		if ($col_026.equalsIgnoreCase(name)) {
			return col_026();
		}
		if ($col_027.equalsIgnoreCase(name)) {
			return col_027();
		}
		if ($col_028.equalsIgnoreCase(name)) {
			return col_028();
		}
		if ($col_029.equalsIgnoreCase(name)) {
			return col_029();
		}
		if ($col_030.equalsIgnoreCase(name)) {
			return col_030();
		}
		if ($col_031.equalsIgnoreCase(name)) {
			return col_031();
		}
		if ($col_032.equalsIgnoreCase(name)) {
			return col_032();
		}
		if ($col_033.equalsIgnoreCase(name)) {
			return col_033();
		}
		if ($col_034.equalsIgnoreCase(name)) {
			return col_034();
		}
		if ($col_035.equalsIgnoreCase(name)) {
			return col_035();
		}
		if ($col_036.equalsIgnoreCase(name)) {
			return col_036();
		}
		if ($col_037.equalsIgnoreCase(name)) {
			return col_037();
		}
		if ($col_038.equalsIgnoreCase(name)) {
			return col_038();
		}
		if ($col_039.equalsIgnoreCase(name)) {
			return col_039();
		}
		if ($col_040.equalsIgnoreCase(name)) {
			return col_040();
		}
		if ($col_041.equalsIgnoreCase(name)) {
			return col_041();
		}
		if ($col_042.equalsIgnoreCase(name)) {
			return col_042();
		}
		if ($col_043.equalsIgnoreCase(name)) {
			return col_043();
		}
		if ($col_044.equalsIgnoreCase(name)) {
			return col_044();
		}
		if ($col_045.equalsIgnoreCase(name)) {
			return col_045();
		}
		if ($col_046.equalsIgnoreCase(name)) {
			return col_046();
		}
		if ($col_047.equalsIgnoreCase(name)) {
			return col_047();
		}
		if ($col_048.equalsIgnoreCase(name)) {
			return col_048();
		}
		if ($col_049.equalsIgnoreCase(name)) {
			return col_049();
		}
		if ($col_050.equalsIgnoreCase(name)) {
			return col_050();
		}
		if ($col_051.equalsIgnoreCase(name)) {
			return col_051();
		}
		if ($col_052.equalsIgnoreCase(name)) {
			return col_052();
		}
		if ($col_053.equalsIgnoreCase(name)) {
			return col_053();
		}
		if ($col_054.equalsIgnoreCase(name)) {
			return col_054();
		}
		if ($col_055.equalsIgnoreCase(name)) {
			return col_055();
		}
		if ($col_056.equalsIgnoreCase(name)) {
			return col_056();
		}
		if ($col_057.equalsIgnoreCase(name)) {
			return col_057();
		}
		if ($col_058.equalsIgnoreCase(name)) {
			return col_058();
		}
		if ($col_059.equalsIgnoreCase(name)) {
			return col_059();
		}
		if ($col_060.equalsIgnoreCase(name)) {
			return col_060();
		}
		if ($col_061.equalsIgnoreCase(name)) {
			return col_061();
		}
		if ($col_062.equalsIgnoreCase(name)) {
			return col_062();
		}
		if ($col_063.equalsIgnoreCase(name)) {
			return col_063();
		}
		if ($col_064.equalsIgnoreCase(name)) {
			return col_064();
		}
		if ($col_065.equalsIgnoreCase(name)) {
			return col_065();
		}
		if ($col_066.equalsIgnoreCase(name)) {
			return col_066();
		}
		if ($col_067.equalsIgnoreCase(name)) {
			return col_067();
		}
		if ($col_068.equalsIgnoreCase(name)) {
			return col_068();
		}
		if ($col_069.equalsIgnoreCase(name)) {
			return col_069();
		}
		if ($col_070.equalsIgnoreCase(name)) {
			return col_070();
		}
		if ($col_071.equalsIgnoreCase(name)) {
			return col_071();
		}
		if ($col_072.equalsIgnoreCase(name)) {
			return col_072();
		}
		if ($col_073.equalsIgnoreCase(name)) {
			return col_073();
		}
		if ($col_074.equalsIgnoreCase(name)) {
			return col_074();
		}
		if ($col_075.equalsIgnoreCase(name)) {
			return col_075();
		}
		if ($col_076.equalsIgnoreCase(name)) {
			return col_076();
		}
		if ($col_077.equalsIgnoreCase(name)) {
			return col_077();
		}
		if ($col_078.equalsIgnoreCase(name)) {
			return col_078();
		}
		if ($col_079.equalsIgnoreCase(name)) {
			return col_079();
		}
		if ($col_080.equalsIgnoreCase(name)) {
			return col_080();
		}
		if ($col_081.equalsIgnoreCase(name)) {
			return col_081();
		}
		if ($col_082.equalsIgnoreCase(name)) {
			return col_082();
		}
		if ($col_083.equalsIgnoreCase(name)) {
			return col_083();
		}
		if ($col_084.equalsIgnoreCase(name)) {
			return col_084();
		}
		if ($col_085.equalsIgnoreCase(name)) {
			return col_085();
		}
		if ($col_086.equalsIgnoreCase(name)) {
			return col_086();
		}
		if ($col_087.equalsIgnoreCase(name)) {
			return col_087();
		}
		if ($col_088.equalsIgnoreCase(name)) {
			return col_088();
		}
		if ($col_089.equalsIgnoreCase(name)) {
			return col_089();
		}
		if ($col_090.equalsIgnoreCase(name)) {
			return col_090();
		}
		if ($col_091.equalsIgnoreCase(name)) {
			return col_091();
		}
		if ($col_092.equalsIgnoreCase(name)) {
			return col_092();
		}
		if ($col_093.equalsIgnoreCase(name)) {
			return col_093();
		}
		if ($col_094.equalsIgnoreCase(name)) {
			return col_094();
		}
		if ($col_095.equalsIgnoreCase(name)) {
			return col_095();
		}
		if ($col_096.equalsIgnoreCase(name)) {
			return col_096();
		}
		if ($col_097.equalsIgnoreCase(name)) {
			return col_097();
		}
		if ($col_098.equalsIgnoreCase(name)) {
			return col_098();
		}
		if ($col_099.equalsIgnoreCase(name)) {
			return col_099();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($gr_dt.equalsIgnoreCase(name)) {
			return gr_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($std_flg.equalsIgnoreCase(name)) {
			return std_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dummy_bp_cntry.equalsIgnoreCase(name)) {
			return dummy_bp_cntry();
		}
		if ($dummy_bp_area.equalsIgnoreCase(name)) {
			return dummy_bp_area();
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_itm_grp1();
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_itm_grp2();
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_itm_grp3();
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_itm_grp4();
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_itm_grp5();
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_itm_grp6();
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_itm_grp7();
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_itm_grp8();
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_itm_grp9();
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_itm_grp10();
		}
		if ($dummy_bp_grp1.equalsIgnoreCase(name)) {
			return dummy_bp_grp1();
		}
		if ($dummy_bp_grp2.equalsIgnoreCase(name)) {
			return dummy_bp_grp2();
		}
		if ($dummy_bp_grp3.equalsIgnoreCase(name)) {
			return dummy_bp_grp3();
		}
		if ($dummy_bp_grp4.equalsIgnoreCase(name)) {
			return dummy_bp_grp4();
		}
		if ($dummy_bp_grp5.equalsIgnoreCase(name)) {
			return dummy_bp_grp5();
		}
		if ($dummy_bp_grp6.equalsIgnoreCase(name)) {
			return dummy_bp_grp6();
		}
		if ($dummy_bp_grp7.equalsIgnoreCase(name)) {
			return dummy_bp_grp7();
		}
		if ($dummy_bp_grp8.equalsIgnoreCase(name)) {
			return dummy_bp_grp8();
		}
		if ($dummy_bp_grp9.equalsIgnoreCase(name)) {
			return dummy_bp_grp9();
		}
		if ($dummy_bp_grp10.equalsIgnoreCase(name)) {
			return dummy_bp_grp10();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			return st_stk_key();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($col_000.equalsIgnoreCase(name)) {
			return col_000();
		}
		if ($col_001.equalsIgnoreCase(name)) {
			return col_001();
		}
		if ($col_002.equalsIgnoreCase(name)) {
			return col_002();
		}
		if ($col_003.equalsIgnoreCase(name)) {
			return col_003();
		}
		if ($col_004.equalsIgnoreCase(name)) {
			return col_004();
		}
		if ($col_005.equalsIgnoreCase(name)) {
			return col_005();
		}
		if ($col_006.equalsIgnoreCase(name)) {
			return col_006();
		}
		if ($col_007.equalsIgnoreCase(name)) {
			return col_007();
		}
		if ($col_008.equalsIgnoreCase(name)) {
			return col_008();
		}
		if ($col_009.equalsIgnoreCase(name)) {
			return col_009();
		}
		if ($col_010.equalsIgnoreCase(name)) {
			return col_010();
		}
		if ($col_011.equalsIgnoreCase(name)) {
			return col_011();
		}
		if ($col_012.equalsIgnoreCase(name)) {
			return col_012();
		}
		if ($col_013.equalsIgnoreCase(name)) {
			return col_013();
		}
		if ($col_014.equalsIgnoreCase(name)) {
			return col_014();
		}
		if ($col_015.equalsIgnoreCase(name)) {
			return col_015();
		}
		if ($col_016.equalsIgnoreCase(name)) {
			return col_016();
		}
		if ($col_017.equalsIgnoreCase(name)) {
			return col_017();
		}
		if ($col_018.equalsIgnoreCase(name)) {
			return col_018();
		}
		if ($col_019.equalsIgnoreCase(name)) {
			return col_019();
		}
		if ($col_020.equalsIgnoreCase(name)) {
			return col_020();
		}
		if ($col_021.equalsIgnoreCase(name)) {
			return col_021();
		}
		if ($col_022.equalsIgnoreCase(name)) {
			return col_022();
		}
		if ($col_023.equalsIgnoreCase(name)) {
			return col_023();
		}
		if ($col_024.equalsIgnoreCase(name)) {
			return col_024();
		}
		if ($col_025.equalsIgnoreCase(name)) {
			return col_025();
		}
		if ($col_026.equalsIgnoreCase(name)) {
			return col_026();
		}
		if ($col_027.equalsIgnoreCase(name)) {
			return col_027();
		}
		if ($col_028.equalsIgnoreCase(name)) {
			return col_028();
		}
		if ($col_029.equalsIgnoreCase(name)) {
			return col_029();
		}
		if ($col_030.equalsIgnoreCase(name)) {
			return col_030();
		}
		if ($col_031.equalsIgnoreCase(name)) {
			return col_031();
		}
		if ($col_032.equalsIgnoreCase(name)) {
			return col_032();
		}
		if ($col_033.equalsIgnoreCase(name)) {
			return col_033();
		}
		if ($col_034.equalsIgnoreCase(name)) {
			return col_034();
		}
		if ($col_035.equalsIgnoreCase(name)) {
			return col_035();
		}
		if ($col_036.equalsIgnoreCase(name)) {
			return col_036();
		}
		if ($col_037.equalsIgnoreCase(name)) {
			return col_037();
		}
		if ($col_038.equalsIgnoreCase(name)) {
			return col_038();
		}
		if ($col_039.equalsIgnoreCase(name)) {
			return col_039();
		}
		if ($col_040.equalsIgnoreCase(name)) {
			return col_040();
		}
		if ($col_041.equalsIgnoreCase(name)) {
			return col_041();
		}
		if ($col_042.equalsIgnoreCase(name)) {
			return col_042();
		}
		if ($col_043.equalsIgnoreCase(name)) {
			return col_043();
		}
		if ($col_044.equalsIgnoreCase(name)) {
			return col_044();
		}
		if ($col_045.equalsIgnoreCase(name)) {
			return col_045();
		}
		if ($col_046.equalsIgnoreCase(name)) {
			return col_046();
		}
		if ($col_047.equalsIgnoreCase(name)) {
			return col_047();
		}
		if ($col_048.equalsIgnoreCase(name)) {
			return col_048();
		}
		if ($col_049.equalsIgnoreCase(name)) {
			return col_049();
		}
		if ($col_050.equalsIgnoreCase(name)) {
			return col_050();
		}
		if ($col_051.equalsIgnoreCase(name)) {
			return col_051();
		}
		if ($col_052.equalsIgnoreCase(name)) {
			return col_052();
		}
		if ($col_053.equalsIgnoreCase(name)) {
			return col_053();
		}
		if ($col_054.equalsIgnoreCase(name)) {
			return col_054();
		}
		if ($col_055.equalsIgnoreCase(name)) {
			return col_055();
		}
		if ($col_056.equalsIgnoreCase(name)) {
			return col_056();
		}
		if ($col_057.equalsIgnoreCase(name)) {
			return col_057();
		}
		if ($col_058.equalsIgnoreCase(name)) {
			return col_058();
		}
		if ($col_059.equalsIgnoreCase(name)) {
			return col_059();
		}
		if ($col_060.equalsIgnoreCase(name)) {
			return col_060();
		}
		if ($col_061.equalsIgnoreCase(name)) {
			return col_061();
		}
		if ($col_062.equalsIgnoreCase(name)) {
			return col_062();
		}
		if ($col_063.equalsIgnoreCase(name)) {
			return col_063();
		}
		if ($col_064.equalsIgnoreCase(name)) {
			return col_064();
		}
		if ($col_065.equalsIgnoreCase(name)) {
			return col_065();
		}
		if ($col_066.equalsIgnoreCase(name)) {
			return col_066();
		}
		if ($col_067.equalsIgnoreCase(name)) {
			return col_067();
		}
		if ($col_068.equalsIgnoreCase(name)) {
			return col_068();
		}
		if ($col_069.equalsIgnoreCase(name)) {
			return col_069();
		}
		if ($col_070.equalsIgnoreCase(name)) {
			return col_070();
		}
		if ($col_071.equalsIgnoreCase(name)) {
			return col_071();
		}
		if ($col_072.equalsIgnoreCase(name)) {
			return col_072();
		}
		if ($col_073.equalsIgnoreCase(name)) {
			return col_073();
		}
		if ($col_074.equalsIgnoreCase(name)) {
			return col_074();
		}
		if ($col_075.equalsIgnoreCase(name)) {
			return col_075();
		}
		if ($col_076.equalsIgnoreCase(name)) {
			return col_076();
		}
		if ($col_077.equalsIgnoreCase(name)) {
			return col_077();
		}
		if ($col_078.equalsIgnoreCase(name)) {
			return col_078();
		}
		if ($col_079.equalsIgnoreCase(name)) {
			return col_079();
		}
		if ($col_080.equalsIgnoreCase(name)) {
			return col_080();
		}
		if ($col_081.equalsIgnoreCase(name)) {
			return col_081();
		}
		if ($col_082.equalsIgnoreCase(name)) {
			return col_082();
		}
		if ($col_083.equalsIgnoreCase(name)) {
			return col_083();
		}
		if ($col_084.equalsIgnoreCase(name)) {
			return col_084();
		}
		if ($col_085.equalsIgnoreCase(name)) {
			return col_085();
		}
		if ($col_086.equalsIgnoreCase(name)) {
			return col_086();
		}
		if ($col_087.equalsIgnoreCase(name)) {
			return col_087();
		}
		if ($col_088.equalsIgnoreCase(name)) {
			return col_088();
		}
		if ($col_089.equalsIgnoreCase(name)) {
			return col_089();
		}
		if ($col_090.equalsIgnoreCase(name)) {
			return col_090();
		}
		if ($col_091.equalsIgnoreCase(name)) {
			return col_091();
		}
		if ($col_092.equalsIgnoreCase(name)) {
			return col_092();
		}
		if ($col_093.equalsIgnoreCase(name)) {
			return col_093();
		}
		if ($col_094.equalsIgnoreCase(name)) {
			return col_094();
		}
		if ($col_095.equalsIgnoreCase(name)) {
			return col_095();
		}
		if ($col_096.equalsIgnoreCase(name)) {
			return col_096();
		}
		if ($col_097.equalsIgnoreCase(name)) {
			return col_097();
		}
		if ($col_098.equalsIgnoreCase(name)) {
			return col_098();
		}
		if ($col_099.equalsIgnoreCase(name)) {
			return col_099();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($gr_dt.equalsIgnoreCase(name)) {
			return gr_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($std_flg.equalsIgnoreCase(name)) {
			return std_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dummy_bp_cntry.equalsIgnoreCase(name)) {
			dummy_bp_cntry(value);
			return;
		}
		if ($dummy_bp_area.equalsIgnoreCase(name)) {
			dummy_bp_area(value);
			return;
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			dummy_itm_grp1(value);
			return;
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			dummy_itm_grp2(value);
			return;
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			dummy_itm_grp3(value);
			return;
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			dummy_itm_grp4(value);
			return;
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			dummy_itm_grp5(value);
			return;
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			dummy_itm_grp6(value);
			return;
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			dummy_itm_grp7(value);
			return;
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			dummy_itm_grp8(value);
			return;
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			dummy_itm_grp9(value);
			return;
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			dummy_itm_grp10(value);
			return;
		}
		if ($dummy_bp_grp1.equalsIgnoreCase(name)) {
			dummy_bp_grp1(value);
			return;
		}
		if ($dummy_bp_grp2.equalsIgnoreCase(name)) {
			dummy_bp_grp2(value);
			return;
		}
		if ($dummy_bp_grp3.equalsIgnoreCase(name)) {
			dummy_bp_grp3(value);
			return;
		}
		if ($dummy_bp_grp4.equalsIgnoreCase(name)) {
			dummy_bp_grp4(value);
			return;
		}
		if ($dummy_bp_grp5.equalsIgnoreCase(name)) {
			dummy_bp_grp5(value);
			return;
		}
		if ($dummy_bp_grp6.equalsIgnoreCase(name)) {
			dummy_bp_grp6(value);
			return;
		}
		if ($dummy_bp_grp7.equalsIgnoreCase(name)) {
			dummy_bp_grp7(value);
			return;
		}
		if ($dummy_bp_grp8.equalsIgnoreCase(name)) {
			dummy_bp_grp8(value);
			return;
		}
		if ($dummy_bp_grp9.equalsIgnoreCase(name)) {
			dummy_bp_grp9(value);
			return;
		}
		if ($dummy_bp_grp10.equalsIgnoreCase(name)) {
			dummy_bp_grp10(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($gr_dt.equalsIgnoreCase(name)) {
			gr_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($std_flg.equalsIgnoreCase(name)) {
			std_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dummy_bp_cntry.equalsIgnoreCase(name)) {
			dummy_bp_cntry(value);
			return;
		}
		if ($dummy_bp_area.equalsIgnoreCase(name)) {
			dummy_bp_area(value);
			return;
		}
		if ($dummy_itm_grp1.equalsIgnoreCase(name)) {
			dummy_itm_grp1(value);
			return;
		}
		if ($dummy_itm_grp2.equalsIgnoreCase(name)) {
			dummy_itm_grp2(value);
			return;
		}
		if ($dummy_itm_grp3.equalsIgnoreCase(name)) {
			dummy_itm_grp3(value);
			return;
		}
		if ($dummy_itm_grp4.equalsIgnoreCase(name)) {
			dummy_itm_grp4(value);
			return;
		}
		if ($dummy_itm_grp5.equalsIgnoreCase(name)) {
			dummy_itm_grp5(value);
			return;
		}
		if ($dummy_itm_grp6.equalsIgnoreCase(name)) {
			dummy_itm_grp6(value);
			return;
		}
		if ($dummy_itm_grp7.equalsIgnoreCase(name)) {
			dummy_itm_grp7(value);
			return;
		}
		if ($dummy_itm_grp8.equalsIgnoreCase(name)) {
			dummy_itm_grp8(value);
			return;
		}
		if ($dummy_itm_grp9.equalsIgnoreCase(name)) {
			dummy_itm_grp9(value);
			return;
		}
		if ($dummy_itm_grp10.equalsIgnoreCase(name)) {
			dummy_itm_grp10(value);
			return;
		}
		if ($dummy_bp_grp1.equalsIgnoreCase(name)) {
			dummy_bp_grp1(value);
			return;
		}
		if ($dummy_bp_grp2.equalsIgnoreCase(name)) {
			dummy_bp_grp2(value);
			return;
		}
		if ($dummy_bp_grp3.equalsIgnoreCase(name)) {
			dummy_bp_grp3(value);
			return;
		}
		if ($dummy_bp_grp4.equalsIgnoreCase(name)) {
			dummy_bp_grp4(value);
			return;
		}
		if ($dummy_bp_grp5.equalsIgnoreCase(name)) {
			dummy_bp_grp5(value);
			return;
		}
		if ($dummy_bp_grp6.equalsIgnoreCase(name)) {
			dummy_bp_grp6(value);
			return;
		}
		if ($dummy_bp_grp7.equalsIgnoreCase(name)) {
			dummy_bp_grp7(value);
			return;
		}
		if ($dummy_bp_grp8.equalsIgnoreCase(name)) {
			dummy_bp_grp8(value);
			return;
		}
		if ($dummy_bp_grp9.equalsIgnoreCase(name)) {
			dummy_bp_grp9(value);
			return;
		}
		if ($dummy_bp_grp10.equalsIgnoreCase(name)) {
			dummy_bp_grp10(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($gr_dt.equalsIgnoreCase(name)) {
			gr_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($std_flg.equalsIgnoreCase(name)) {
			std_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

