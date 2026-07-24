package mcframe.clientMGBD.MGBDP0130;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * REF,View,0;INS,Apply to planning data,1 REF,参照する,0;INS,計画データに反映する,1.<p>
	 *
	 */
	public static final String $ope = "ope";
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
	public static final String $calc_no_p = "calc_no_p";
	/**
	 * Term 期.<p>
	 *
	 */
	public static final String $term = "term";
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
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
	public static final String $itm_typ_p = "itm_typ_p";
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
	public static final String $itm_p = "itm_p";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
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
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Line name ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public static final String $wk_cost_nm = "wk_cost_nm";
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public static final String $wg_flg = "wg_flg";
	/**
	 * Management dept. 管理部門.<p>
	 *
	 */
	public static final String $mng_dpt_flg = "mng_dpt_flg";
	/**
	 * Item 品目.<p>
	 *
	 */
	public static final String $itm_flg = "itm_flg";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ_flg = "itm_typ_flg";
	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public static final String $itm_typ_d_flg = "itm_typ_d_flg";
	/**
	 * Item journal 品目仕訳.<p>
	 *
	 */
	public static final String $itm_jnl_flg = "itm_jnl_flg";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_flg = "itm_mfg_inst_flg";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_flg = "mfg_act_flg";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_flg = "lot_flg";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_flg = "sublot_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1_flg = "sno1_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2_flg = "sno2_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3_flg = "sno3_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4_flg = "sno4_flg";
	/**
	 * Location 場所.<p>
	 *
	 */
	public static final String $loc_flg = "loc_flg";
	/**
	 * Line ライン.<p>
	 *
	 */
	public static final String $str_ln_flg = "str_ln_flg";
	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public static final String $site_flg = "site_flg";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ_flg = "asst_typ_flg";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $disp_seq_flg = "disp_seq_flg";
	/**
	 * Operation 工程.<p>
	 *
	 */
	public static final String $oper_flg = "oper_flg";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq_flg = "oper_seq_flg";

	public static final String $calc_no = $calc_no_p + ".calc_no";
	public static final String $rmrks = $calc_no_p + ".rmrks";
	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta calc_no_p_META = createInnerRowMeta($calc_no_p, mcframe.clientMGUB.MGUBP0010.CalcNoR.class);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wk_cost_nm_META = createCommonMeta($wk_cost_nm, mcframe.commonMA.meta.MA_META.WK_COST_NM);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta wg_flg_META = createCommonMeta($wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mng_dpt_flg_META = createCommonMeta($mng_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_flg_META = createCommonMeta($itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_typ_flg_META = createCommonMeta($itm_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_typ_d_flg_META = createCommonMeta($itm_typ_d_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_jnl_flg_META = createCommonMeta($itm_jnl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_mfg_inst_flg_META = createCommonMeta($itm_mfg_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_act_flg_META = createCommonMeta($mfg_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_flg_META = createCommonMeta($lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_flg_META = createCommonMeta($sublot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_flg_META = createCommonMeta($sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_flg_META = createCommonMeta($sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_flg_META = createCommonMeta($sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_flg_META = createCommonMeta($sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_flg_META = createCommonMeta($loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_flg_META = createCommonMeta($str_ln_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_flg_META = createCommonMeta($site_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asst_typ_flg_META = createCommonMeta($asst_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_seq_flg_META = createCommonMeta($disp_seq_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_flg_META = createCommonMeta($oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_seq_flg_META = createCommonMeta($oper_seq_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			calc_grp_cd_META,
			calc_grp_nm_META,
			calc_no_p_META,
			term_META,
			wg_cd_META,
			wg_nm_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_typ_p_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			itm_p_META,
			itm_mfg_inst_no_META,
			mfg_act_no_META,
			asst_typ_META,
			asst_typ_nm_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			site_cd_META,
			site_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			oper_cd_META,
			oper_nm_META,
			wk_cost_cd_META,
			wk_cost_nm_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META,
			wg_flg_META,
			mng_dpt_flg_META,
			itm_flg_META,
			itm_typ_flg_META,
			itm_typ_d_flg_META,
			itm_jnl_flg_META,
			itm_mfg_inst_flg_META,
			mfg_act_flg_META,
			lot_flg_META,
			sublot_flg_META,
			sno1_flg_META,
			sno2_flg_META,
			sno3_flg_META,
			sno4_flg_META,
			loc_flg_META,
			str_ln_flg_META,
			site_flg_META,
			asst_typ_flg_META,
			disp_seq_flg_META,
			oper_flg_META,
			oper_seq_flg_META
		},
		new String[][]{
			{
				"calc_no",
				"rmrks",
				"itm_typ",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$calc_no,
				$rmrks,
				$itm_typ,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[HKEY]のキー定数 */
	public static final String $$HKEY = "HKEY";
	/** 項目属性情報のグループ[OTHER]のキー定数 */
	public static final String $$OTHER = "OTHER";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";
	/** 項目属性情報のグループ[HVAL]のキー定数 */
	public static final String $$HVAL = "HVAL";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$mng_dpt_cd, "dpt_nm"},	// mng_dpt_cd
				{$itm_grp_cd1, "itm_grp_nm"},	// itm_grp_cd1
				{$itm_grp_cd2, "itm_grp_nm"},	// itm_grp_cd2
				{$itm_grp_cd3, "itm_grp_nm"},	// itm_grp_cd3
				{$itm_grp_cd4, "itm_grp_nm"},	// itm_grp_cd4
				{$itm_grp_cd5, "itm_grp_nm"},	// itm_grp_cd5
				{$itm_grp_cd6, "itm_grp_nm"},	// itm_grp_cd6
				{$itm_grp_cd7, "itm_grp_nm"},	// itm_grp_cd7
				{$itm_grp_cd8, "itm_grp_nm"},	// itm_grp_cd8
				{$itm_grp_cd9, "itm_grp_nm"},	// itm_grp_cd9
				{$itm_grp_cd10, "itm_grp_nm"}	// itm_grp_cd10
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "true"},	// calc_grp_cd
				{$calc_no_p + ".calc_no", "calc_grp_cd"},	// calc_no_p.calc_no
				{$wg_cd, "true"},	// wg_cd
				{$mng_dpt_cd, "term"},	// mng_dpt_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG_ALL"},	// loc_cd
				{$str_ln_cd, "loc_cd;true"}	// str_ln_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "wk_calc_flg"},	// calc_grp_cd
				{$wg_cd, "rd_flg"},	// wg_cd
				{$mng_dpt_cd, "ym"},	// mng_dpt_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$loc_cd, "loc_is_srch_typ"},	// loc_cd
				{$str_ln_cd, "loc_cd;mode_nullval_flg"}	// str_ln_cd
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HKEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$OTHER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$sno1, "SNO1"},	// sno1
				{$sno2, "SNO2"},	// sno2
				{$sno3, "SNO3"},	// sno3
				{$sno4, "SNO4"},	// sno4
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"},	// str_ln_nm
				{$wg_flg, "WG"},	// wg_flg
				{$sno1_flg, "SNO1"},	// sno1_flg
				{$sno2_flg, "SNO2"},	// sno2_flg
				{$sno3_flg, "SNO3"},	// sno3_flg
				{$sno4_flg, "SNO4"},	// sno4_flg
				{$str_ln_flg, "STR_LN"},	// str_ln_flg
				{$site_flg, "SITE"}	// site_flg
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * REF,View,0;INS,Apply to planning data,1 REF,参照する,0;INS,計画データに反映する,1.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * REF,View,0;INS,Apply to planning data,1 REF,参照する,0;INS,計画データに反映する,1.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 2, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 2, $calc_grp_nm, value);
	}


	public mcframe.clientMGUB.MGUBP0010.CalcNoR calc_no_p(){
		return (mcframe.clientMGUB.MGUBP0010.CalcNoR) getConstInnerRow(offset + 3, $calc_no_p);
	}
	
	public void calc_no_p(mcframe.clientMGUB.MGUBP0010.CalcNoR row){
		setConstInnerRow(offset + 3, $calc_no_p, row);
	}


	/**
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 4, $term);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 4, $term, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 5, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 5, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 6, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 6, $wg_nm, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 7, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 7, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 8, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 8, $mng_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 9, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 9, $itm_typ_p, row);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 10, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 10, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 11, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 11, $itm_jnl_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 12, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 12, $itm_p, row);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 13, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 13, $itm_mfg_inst_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 14, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 14, $mfg_act_no, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 15, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 15, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 16, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 16, $asst_typ_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 17, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 17, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 18, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 18, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 19, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 19, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 20, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 20, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 21, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 21, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 22, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 22, $sno4, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 23, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 23, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 24, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 24, $site_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 25, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 25, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 26, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 26, $loc_nm, value);
	}


	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 27, $str_ln_cd);
	}

	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 27, $str_ln_cd, value);
	}


	/**
	 * Line name ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 28, $str_ln_nm);
	}

	/**
	 * Line name ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 28, $str_ln_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 29, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 29, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 30, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 30, $oper_nm, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 31, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 31, $wk_cost_cd, value);
	}


	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public String wk_cost_nm() {
		return getConstString(offset + 32, $wk_cost_nm);
	}

	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public void wk_cost_nm(String value) {
		setConstString(offset + 32, $wk_cost_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 33, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 33, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 34, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 34, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 35, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 35, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 36, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 36, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 37, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 37, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 38, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 38, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 39, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 39, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 40, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 40, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 41, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 41, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 42, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 42, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 43, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 43, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 44, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 44, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 45, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 45, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 46, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 46, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 47, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 47, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 48, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 48, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 49, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 49, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 50, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 50, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 51, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 51, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 52, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 52, $itm_grp_nm10, value);
	}


	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public boolean wg_flg() {
		return getConstBoolean(offset + 53, $wg_flg);
	}

	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public void wg_flg(boolean value) {
		setConstBoolean(offset + 53, $wg_flg, value);
	}


	/**
	 * Management dept. 管理部門.<p>
	 *
	 */
	public boolean mng_dpt_flg() {
		return getConstBoolean(offset + 54, $mng_dpt_flg);
	}

	/**
	 * Management dept. 管理部門.<p>
	 *
	 */
	public void mng_dpt_flg(boolean value) {
		setConstBoolean(offset + 54, $mng_dpt_flg, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public boolean itm_flg() {
		return getConstBoolean(offset + 55, $itm_flg);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_flg(boolean value) {
		setConstBoolean(offset + 55, $itm_flg, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public boolean itm_typ_flg() {
		return getConstBoolean(offset + 56, $itm_typ_flg);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ_flg(boolean value) {
		setConstBoolean(offset + 56, $itm_typ_flg, value);
	}


	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public boolean itm_typ_d_flg() {
		return getConstBoolean(offset + 57, $itm_typ_d_flg);
	}

	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public void itm_typ_d_flg(boolean value) {
		setConstBoolean(offset + 57, $itm_typ_d_flg, value);
	}


	/**
	 * Item journal 品目仕訳.<p>
	 *
	 */
	public boolean itm_jnl_flg() {
		return getConstBoolean(offset + 58, $itm_jnl_flg);
	}

	/**
	 * Item journal 品目仕訳.<p>
	 *
	 */
	public void itm_jnl_flg(boolean value) {
		setConstBoolean(offset + 58, $itm_jnl_flg, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public boolean itm_mfg_inst_flg() {
		return getConstBoolean(offset + 59, $itm_mfg_inst_flg);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_flg(boolean value) {
		setConstBoolean(offset + 59, $itm_mfg_inst_flg, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public boolean mfg_act_flg() {
		return getConstBoolean(offset + 60, $mfg_act_flg);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_flg(boolean value) {
		setConstBoolean(offset + 60, $mfg_act_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public boolean lot_flg() {
		return getConstBoolean(offset + 61, $lot_flg);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_flg(boolean value) {
		setConstBoolean(offset + 61, $lot_flg, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public boolean sublot_flg() {
		return getConstBoolean(offset + 62, $sublot_flg);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_flg(boolean value) {
		setConstBoolean(offset + 62, $sublot_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public boolean sno1_flg() {
		return getConstBoolean(offset + 63, $sno1_flg);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1_flg(boolean value) {
		setConstBoolean(offset + 63, $sno1_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public boolean sno2_flg() {
		return getConstBoolean(offset + 64, $sno2_flg);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2_flg(boolean value) {
		setConstBoolean(offset + 64, $sno2_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public boolean sno3_flg() {
		return getConstBoolean(offset + 65, $sno3_flg);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3_flg(boolean value) {
		setConstBoolean(offset + 65, $sno3_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public boolean sno4_flg() {
		return getConstBoolean(offset + 66, $sno4_flg);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4_flg(boolean value) {
		setConstBoolean(offset + 66, $sno4_flg, value);
	}


	/**
	 * Location 場所.<p>
	 *
	 */
	public boolean loc_flg() {
		return getConstBoolean(offset + 67, $loc_flg);
	}

	/**
	 * Location 場所.<p>
	 *
	 */
	public void loc_flg(boolean value) {
		setConstBoolean(offset + 67, $loc_flg, value);
	}


	/**
	 * Line ライン.<p>
	 *
	 */
	public boolean str_ln_flg() {
		return getConstBoolean(offset + 68, $str_ln_flg);
	}

	/**
	 * Line ライン.<p>
	 *
	 */
	public void str_ln_flg(boolean value) {
		setConstBoolean(offset + 68, $str_ln_flg, value);
	}


	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public boolean site_flg() {
		return getConstBoolean(offset + 69, $site_flg);
	}

	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public void site_flg(boolean value) {
		setConstBoolean(offset + 69, $site_flg, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public boolean asst_typ_flg() {
		return getConstBoolean(offset + 70, $asst_typ_flg);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ_flg(boolean value) {
		setConstBoolean(offset + 70, $asst_typ_flg, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public boolean disp_seq_flg() {
		return getConstBoolean(offset + 71, $disp_seq_flg);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq_flg(boolean value) {
		setConstBoolean(offset + 71, $disp_seq_flg, value);
	}


	/**
	 * Operation 工程.<p>
	 *
	 */
	public boolean oper_flg() {
		return getConstBoolean(offset + 72, $oper_flg);
	}

	/**
	 * Operation 工程.<p>
	 *
	 */
	public void oper_flg(boolean value) {
		setConstBoolean(offset + 72, $oper_flg, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public boolean oper_seq_flg() {
		return getConstBoolean(offset + 73, $oper_seq_flg);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq_flg(boolean value) {
		setConstBoolean(offset + 73, $oper_seq_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($mng_dpt_flg.equalsIgnoreCase(name)) {
			return mng_dpt_flg();
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			return itm_flg();
		}
		if ($itm_typ_flg.equalsIgnoreCase(name)) {
			return itm_typ_flg();
		}
		if ($itm_typ_d_flg.equalsIgnoreCase(name)) {
			return itm_typ_d_flg();
		}
		if ($itm_jnl_flg.equalsIgnoreCase(name)) {
			return itm_jnl_flg();
		}
		if ($itm_mfg_inst_flg.equalsIgnoreCase(name)) {
			return itm_mfg_inst_flg();
		}
		if ($mfg_act_flg.equalsIgnoreCase(name)) {
			return mfg_act_flg();
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			return lot_flg();
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			return sublot_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($str_ln_flg.equalsIgnoreCase(name)) {
			return str_ln_flg();
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			return site_flg();
		}
		if ($asst_typ_flg.equalsIgnoreCase(name)) {
			return asst_typ_flg();
		}
		if ($disp_seq_flg.equalsIgnoreCase(name)) {
			return disp_seq_flg();
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			return oper_flg();
		}
		if ($oper_seq_flg.equalsIgnoreCase(name)) {
			return oper_seq_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($mng_dpt_flg.equalsIgnoreCase(name)) {
			return mng_dpt_flg();
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			return itm_flg();
		}
		if ($itm_typ_flg.equalsIgnoreCase(name)) {
			return itm_typ_flg();
		}
		if ($itm_typ_d_flg.equalsIgnoreCase(name)) {
			return itm_typ_d_flg();
		}
		if ($itm_jnl_flg.equalsIgnoreCase(name)) {
			return itm_jnl_flg();
		}
		if ($itm_mfg_inst_flg.equalsIgnoreCase(name)) {
			return itm_mfg_inst_flg();
		}
		if ($mfg_act_flg.equalsIgnoreCase(name)) {
			return mfg_act_flg();
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			return lot_flg();
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			return sublot_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($str_ln_flg.equalsIgnoreCase(name)) {
			return str_ln_flg();
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			return site_flg();
		}
		if ($asst_typ_flg.equalsIgnoreCase(name)) {
			return asst_typ_flg();
		}
		if ($disp_seq_flg.equalsIgnoreCase(name)) {
			return disp_seq_flg();
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			return oper_flg();
		}
		if ($oper_seq_flg.equalsIgnoreCase(name)) {
			return oper_seq_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($mng_dpt_flg.equalsIgnoreCase(name)) {
			mng_dpt_flg(value);
			return;
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			itm_flg(value);
			return;
		}
		if ($itm_typ_flg.equalsIgnoreCase(name)) {
			itm_typ_flg(value);
			return;
		}
		if ($itm_typ_d_flg.equalsIgnoreCase(name)) {
			itm_typ_d_flg(value);
			return;
		}
		if ($itm_jnl_flg.equalsIgnoreCase(name)) {
			itm_jnl_flg(value);
			return;
		}
		if ($itm_mfg_inst_flg.equalsIgnoreCase(name)) {
			itm_mfg_inst_flg(value);
			return;
		}
		if ($mfg_act_flg.equalsIgnoreCase(name)) {
			mfg_act_flg(value);
			return;
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			lot_flg(value);
			return;
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			sublot_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($str_ln_flg.equalsIgnoreCase(name)) {
			str_ln_flg(value);
			return;
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			site_flg(value);
			return;
		}
		if ($asst_typ_flg.equalsIgnoreCase(name)) {
			asst_typ_flg(value);
			return;
		}
		if ($disp_seq_flg.equalsIgnoreCase(name)) {
			disp_seq_flg(value);
			return;
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			oper_flg(value);
			return;
		}
		if ($oper_seq_flg.equalsIgnoreCase(name)) {
			oper_seq_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($mng_dpt_flg.equalsIgnoreCase(name)) {
			mng_dpt_flg(value);
			return;
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			itm_flg(value);
			return;
		}
		if ($itm_typ_flg.equalsIgnoreCase(name)) {
			itm_typ_flg(value);
			return;
		}
		if ($itm_typ_d_flg.equalsIgnoreCase(name)) {
			itm_typ_d_flg(value);
			return;
		}
		if ($itm_jnl_flg.equalsIgnoreCase(name)) {
			itm_jnl_flg(value);
			return;
		}
		if ($itm_mfg_inst_flg.equalsIgnoreCase(name)) {
			itm_mfg_inst_flg(value);
			return;
		}
		if ($mfg_act_flg.equalsIgnoreCase(name)) {
			mfg_act_flg(value);
			return;
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			lot_flg(value);
			return;
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			sublot_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($str_ln_flg.equalsIgnoreCase(name)) {
			str_ln_flg(value);
			return;
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			site_flg(value);
			return;
		}
		if ($asst_typ_flg.equalsIgnoreCase(name)) {
			asst_typ_flg(value);
			return;
		}
		if ($disp_seq_flg.equalsIgnoreCase(name)) {
			disp_seq_flg(value);
			return;
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			oper_flg(value);
			return;
		}
		if ($oper_seq_flg.equalsIgnoreCase(name)) {
			oper_seq_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($calc_no_p.equalsIgnoreCase(name)) {
			return calc_no_p();
		}
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($calc_no_p.equalsIgnoreCase(name)) {
			calc_no_p(
				((MCContainerMeta) calc_no_p_META).castInnerRow(mcframe.clientMGUB.MGUBP0010.CalcNoR.class, value)
			);
			return;
		}
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			itm_typ_p(
				((MCContainerMeta) itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String calc_no() {
		return calc_no_p().calc_no();
	}

	public void calc_no(String value) {
		calc_no_p().calc_no(value);
	}

	public String rmrks() {
		return calc_no_p().rmrks();
	}

	public void rmrks(String value) {
		calc_no_p().rmrks(value);
	}

	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	public String itm_typ_d_cd() {
		return itm_typ_p().itm_typ_d_cd();
	}

	public void itm_typ_d_cd(String value) {
		itm_typ_p().itm_typ_d_cd(value);
	}

	public String itm_typ_d_nm() {
		return itm_typ_p().itm_typ_d_nm();
	}

	public void itm_typ_d_nm(String value) {
		itm_typ_p().itm_typ_d_nm(value);
	}

	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

}

