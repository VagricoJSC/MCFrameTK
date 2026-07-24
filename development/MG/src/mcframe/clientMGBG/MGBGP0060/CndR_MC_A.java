package mcframe.clientMGBG.MGBGP0060;

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
	 * BEFORE,View data before departmental alloc.;AFTER,View data after departmental alloc. BEFORE,一次配賦処理前のデータを参照する;AFTER,一次配賦処理後のデータを参照する.<p>
	 *
	 */
	public static final String $pre_alc_typ = "pre_alc_typ";
	/**
	 * Plan calculation category cd. 計画計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $pln_calc_ctg_cd = "pln_calc_ctg_cd";
	/**
	 * Plan calculation category name 計画計算カテゴリ名.<p>
	 *
	 */
	public static final String $pln_calc_ctg_nm = "pln_calc_ctg_nm";
	/**
	 * Result calculation category cd. 実績計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $act_calc_ctg_cd = "act_calc_ctg_cd";
	/**
	 * Result calculation category name 実績計算カテゴリ名.<p>
	 *
	 */
	public static final String $act_calc_ctg_nm = "act_calc_ctg_nm";
	public static final String $term_p = "term_p";
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ym_fr = "ym_fr";
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public static final String $ym_to = "ym_to";
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
	 * Expense incurred type 費用発生区分.<p>
	 *
	 */
	public static final String $alc_rec_typ = "alc_rec_typ";
	/**
	 * Expense incurred type name 費用発生区分名.<p>
	 *
	 */
	public static final String $alc_rec_typ_nm = "alc_rec_typ_nm";
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public static final String $alc_ac_nm = "alc_ac_nm";
	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd1 = "alc_ac_grp_cd1";
	/**
	 * Allocation account group name 1 配賦科目グループ名１.<p>
	 *
	 */
	public static final String $alc_ac_grp_nm1 = "alc_ac_grp_nm1";
	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd2 = "alc_ac_grp_cd2";
	/**
	 * Allocation account group name 2 配賦科目グループ名２.<p>
	 *
	 */
	public static final String $alc_ac_grp_nm2 = "alc_ac_grp_nm2";
	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd3 = "alc_ac_grp_cd3";
	/**
	 * Allocation account group name 3 配賦科目グループ名３.<p>
	 *
	 */
	public static final String $alc_ac_grp_nm3 = "alc_ac_grp_nm3";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
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
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public static final String $ctg_cd = "ctg_cd";
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public static final String $ctg_nm = "ctg_nm";
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
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
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public static final String $bp_grp_cd1 = "bp_grp_cd1";
	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public static final String $bp_grp_nm1 = "bp_grp_nm1";
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public static final String $bp_grp_cd2 = "bp_grp_cd2";
	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public static final String $bp_grp_nm2 = "bp_grp_nm2";
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public static final String $bp_grp_cd3 = "bp_grp_cd3";
	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public static final String $bp_grp_nm3 = "bp_grp_nm3";
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public static final String $bp_grp_cd4 = "bp_grp_cd4";
	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public static final String $bp_grp_nm4 = "bp_grp_nm4";
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public static final String $bp_grp_cd5 = "bp_grp_cd5";
	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public static final String $bp_grp_nm5 = "bp_grp_nm5";
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public static final String $bp_grp_cd6 = "bp_grp_cd6";
	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public static final String $bp_grp_nm6 = "bp_grp_nm6";
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public static final String $bp_grp_cd7 = "bp_grp_cd7";
	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public static final String $bp_grp_nm7 = "bp_grp_nm7";
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public static final String $bp_grp_cd8 = "bp_grp_cd8";
	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public static final String $bp_grp_nm8 = "bp_grp_nm8";
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public static final String $bp_grp_cd9 = "bp_grp_cd9";
	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public static final String $bp_grp_nm9 = "bp_grp_nm9";
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $bp_grp_cd10 = "bp_grp_cd10";
	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public static final String $bp_grp_nm10 = "bp_grp_nm10";
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public static final String $wg_flg = "wg_flg";
	/**
	 * Expense incurred type 費用発生区分.<p>
	 *
	 */
	public static final String $alc_rec_typ_flg = "alc_rec_typ_flg";
	/**
	 * Allocation account 配賦科目.<p>
	 *
	 */
	public static final String $alc_ac_flg = "alc_ac_flg";
	/**
	 * Allocation account G 1 配賦科目Ｇ１.<p>
	 *
	 */
	public static final String $alc_ac_grp1_flg = "alc_ac_grp1_flg";
	/**
	 * Allocation account G 2 配賦科目Ｇ２.<p>
	 *
	 */
	public static final String $alc_ac_grp2_flg = "alc_ac_grp2_flg";
	/**
	 * Allocation account G 3 配賦科目Ｇ３.<p>
	 *
	 */
	public static final String $alc_ac_grp3_flg = "alc_ac_grp3_flg";
	/**
	 * Dept. 部門.<p>
	 *
	 */
	public static final String $dpt_flg = "dpt_flg";
	/**
	 * Location 場所.<p>
	 *
	 */
	public static final String $loc_flg = "loc_flg";
	/**
	 * Operation 工程.<p>
	 *
	 */
	public static final String $oper_flg = "oper_flg";
	/**
	 * BP 取引先.<p>
	 *
	 */
	public static final String $bp_flg = "bp_flg";
	/**
	 * Item category 品群.<p>
	 *
	 */
	public static final String $ctg_flg = "ctg_flg";
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
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public static final String $itm_grp_flg1 = "itm_grp_flg1";
	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public static final String $itm_grp_flg2 = "itm_grp_flg2";
	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public static final String $itm_grp_flg3 = "itm_grp_flg3";
	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public static final String $itm_grp_flg4 = "itm_grp_flg4";
	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public static final String $itm_grp_flg5 = "itm_grp_flg5";
	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public static final String $itm_grp_flg6 = "itm_grp_flg6";
	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public static final String $itm_grp_flg7 = "itm_grp_flg7";
	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public static final String $itm_grp_flg8 = "itm_grp_flg8";
	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public static final String $itm_grp_flg9 = "itm_grp_flg9";
	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public static final String $itm_grp_flg10 = "itm_grp_flg10";
	/**
	 * BP classification 1 取引先分類１.<p>
	 *
	 */
	public static final String $bp_grp_flg1 = "bp_grp_flg1";
	/**
	 * BP classification 2 取引先分類２.<p>
	 *
	 */
	public static final String $bp_grp_flg2 = "bp_grp_flg2";
	/**
	 * BP classification 3 取引先分類３.<p>
	 *
	 */
	public static final String $bp_grp_flg3 = "bp_grp_flg3";
	/**
	 * BP classification 4 取引先分類４.<p>
	 *
	 */
	public static final String $bp_grp_flg4 = "bp_grp_flg4";
	/**
	 * BP classification 5 取引先分類５.<p>
	 *
	 */
	public static final String $bp_grp_flg5 = "bp_grp_flg5";
	/**
	 * BP classification 6 取引先分類６.<p>
	 *
	 */
	public static final String $bp_grp_flg6 = "bp_grp_flg6";
	/**
	 * BP classification 7 取引先分類７.<p>
	 *
	 */
	public static final String $bp_grp_flg7 = "bp_grp_flg7";
	/**
	 * BP classification 8 取引先分類８.<p>
	 *
	 */
	public static final String $bp_grp_flg8 = "bp_grp_flg8";
	/**
	 * BP classification 9 取引先分類９.<p>
	 *
	 */
	public static final String $bp_grp_flg9 = "bp_grp_flg9";
	/**
	 * BP classification 10 取引先分類１０.<p>
	 *
	 */
	public static final String $bp_grp_flg10 = "bp_grp_flg10";
	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public static final String $disp_key = "disp_key";
	/**
	 * Exclude own working group 自ワーキンググループ除く.<p>
	 *
	 */
	public static final String $not_my_wg_flg = "not_my_wg_flg";
	/**
	 * Exclude departmental alloc. performed 一次配賦処理済除く.<p>
	 *
	 */
	public static final String $not_pre_alc_fin_flg = "not_pre_alc_fin_flg";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";

	public static final String $term = $term_p + ".term";
	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta pre_alc_typ_META = createStringMeta($pre_alc_typ);
	public static final MCMeta pln_calc_ctg_cd_META = createCommonMeta($pln_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta pln_calc_ctg_nm_META = createCommonMeta($pln_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta act_calc_ctg_cd_META = createCommonMeta($act_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta act_calc_ctg_nm_META = createCommonMeta($act_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta term_p_META = createInnerRowMeta($term_p, mcframe.clientMAUB.MAUBP0230.TermR.class);
	public static final MCMeta ym_fr_META = createCommonMeta($ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_to_META = createCommonMeta($ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta alc_rec_typ_META = createCommonMeta($alc_rec_typ, mcframe.commonMG.meta.MG_META.ALC_REC_TYP);
	public static final MCMeta alc_rec_typ_nm_META = createCommonMeta($alc_rec_typ_nm, mcframe.commonMG.meta.MG_META.ALC_REC_TYP_NM);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta alc_ac_grp_cd1_META = createCommonMeta($alc_ac_grp_cd1, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_grp_nm1_META = createCommonMeta($alc_ac_grp_nm1, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta alc_ac_grp_cd2_META = createCommonMeta($alc_ac_grp_cd2, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_grp_nm2_META = createCommonMeta($alc_ac_grp_nm2, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta alc_ac_grp_cd3_META = createCommonMeta($alc_ac_grp_cd3, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta alc_ac_grp_nm3_META = createCommonMeta($alc_ac_grp_nm3, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ctg_cd_META = createCommonMeta($ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta ctg_nm_META = createCommonMeta($ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
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
	public static final MCMeta bp_grp_cd1_META = createCommonMeta($bp_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm1_META = createCommonMeta($bp_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd2_META = createCommonMeta($bp_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm2_META = createCommonMeta($bp_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd3_META = createCommonMeta($bp_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm3_META = createCommonMeta($bp_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd4_META = createCommonMeta($bp_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm4_META = createCommonMeta($bp_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd5_META = createCommonMeta($bp_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm5_META = createCommonMeta($bp_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd6_META = createCommonMeta($bp_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm6_META = createCommonMeta($bp_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd7_META = createCommonMeta($bp_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm7_META = createCommonMeta($bp_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd8_META = createCommonMeta($bp_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm8_META = createCommonMeta($bp_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd9_META = createCommonMeta($bp_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm9_META = createCommonMeta($bp_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_cd10_META = createCommonMeta($bp_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm10_META = createCommonMeta($bp_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta wg_flg_META = createCommonMeta($wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alc_rec_typ_flg_META = createCommonMeta($alc_rec_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alc_ac_flg_META = createCommonMeta($alc_ac_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alc_ac_grp1_flg_META = createCommonMeta($alc_ac_grp1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alc_ac_grp2_flg_META = createCommonMeta($alc_ac_grp2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alc_ac_grp3_flg_META = createCommonMeta($alc_ac_grp3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_flg_META = createCommonMeta($dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_flg_META = createCommonMeta($loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_flg_META = createCommonMeta($oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_flg_META = createCommonMeta($bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ctg_flg_META = createCommonMeta($ctg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_flg_META = createCommonMeta($itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_typ_flg_META = createCommonMeta($itm_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_typ_d_flg_META = createCommonMeta($itm_typ_d_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_flg_META = createCommonMeta($lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_flg_META = createCommonMeta($sublot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_flg_META = createCommonMeta($sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_flg_META = createCommonMeta($sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_flg_META = createCommonMeta($sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_flg_META = createCommonMeta($sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg1_META = createCommonMeta($itm_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg2_META = createCommonMeta($itm_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg3_META = createCommonMeta($itm_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg4_META = createCommonMeta($itm_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg5_META = createCommonMeta($itm_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg6_META = createCommonMeta($itm_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg7_META = createCommonMeta($itm_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg8_META = createCommonMeta($itm_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg9_META = createCommonMeta($itm_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_flg10_META = createCommonMeta($itm_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg1_META = createCommonMeta($bp_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg2_META = createCommonMeta($bp_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg3_META = createCommonMeta($bp_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg4_META = createCommonMeta($bp_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg5_META = createCommonMeta($bp_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg6_META = createCommonMeta($bp_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg7_META = createCommonMeta($bp_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg8_META = createCommonMeta($bp_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg9_META = createCommonMeta($bp_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_flg10_META = createCommonMeta($bp_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_key_META = createCommonMeta($disp_key, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_my_wg_flg_META = createCommonMeta($not_my_wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_pre_alc_fin_flg_META = createCommonMeta($not_pre_alc_fin_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pre_alc_typ_META,
			pln_calc_ctg_cd_META,
			pln_calc_ctg_nm_META,
			act_calc_ctg_cd_META,
			act_calc_ctg_nm_META,
			term_p_META,
			ym_fr_META,
			ym_to_META,
			wg_cd_META,
			wg_nm_META,
			alc_rec_typ_META,
			alc_rec_typ_nm_META,
			alc_ac_cd_META,
			alc_ac_nm_META,
			alc_ac_grp_cd1_META,
			alc_ac_grp_nm1_META,
			alc_ac_grp_cd2_META,
			alc_ac_grp_nm2_META,
			alc_ac_grp_cd3_META,
			alc_ac_grp_nm3_META,
			dpt_cd_META,
			dpt_nm_META,
			loc_cd_META,
			loc_nm_META,
			oper_cd_META,
			oper_nm_META,
			bp_cd_META,
			bp_nm_META,
			ctg_cd_META,
			ctg_nm_META,
			itm_typ_p_META,
			itm_p_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
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
			bp_grp_cd1_META,
			bp_grp_nm1_META,
			bp_grp_cd2_META,
			bp_grp_nm2_META,
			bp_grp_cd3_META,
			bp_grp_nm3_META,
			bp_grp_cd4_META,
			bp_grp_nm4_META,
			bp_grp_cd5_META,
			bp_grp_nm5_META,
			bp_grp_cd6_META,
			bp_grp_nm6_META,
			bp_grp_cd7_META,
			bp_grp_nm7_META,
			bp_grp_cd8_META,
			bp_grp_nm8_META,
			bp_grp_cd9_META,
			bp_grp_nm9_META,
			bp_grp_cd10_META,
			bp_grp_nm10_META,
			wg_flg_META,
			alc_rec_typ_flg_META,
			alc_ac_flg_META,
			alc_ac_grp1_flg_META,
			alc_ac_grp2_flg_META,
			alc_ac_grp3_flg_META,
			dpt_flg_META,
			loc_flg_META,
			oper_flg_META,
			bp_flg_META,
			ctg_flg_META,
			itm_flg_META,
			itm_typ_flg_META,
			itm_typ_d_flg_META,
			lot_flg_META,
			sublot_flg_META,
			sno1_flg_META,
			sno2_flg_META,
			sno3_flg_META,
			sno4_flg_META,
			itm_grp_flg1_META,
			itm_grp_flg2_META,
			itm_grp_flg3_META,
			itm_grp_flg4_META,
			itm_grp_flg5_META,
			itm_grp_flg6_META,
			itm_grp_flg7_META,
			itm_grp_flg8_META,
			itm_grp_flg9_META,
			itm_grp_flg10_META,
			bp_grp_flg1_META,
			bp_grp_flg2_META,
			bp_grp_flg3_META,
			bp_grp_flg4_META,
			bp_grp_flg5_META,
			bp_grp_flg6_META,
			bp_grp_flg7_META,
			bp_grp_flg8_META,
			bp_grp_flg9_META,
			bp_grp_flg10_META,
			disp_key_META,
			not_my_wg_flg_META,
			not_pre_alc_fin_flg_META,
			cur_cd_META,
			amt_dec_place_META
		},
		new String[][]{
			{
				"term",
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
				$term,
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

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CLEAR]のキー定数 */
	public static final String $$CLEAR = "CLEAR";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[HKEY]のキー定数 */
	public static final String $$HKEY = "HKEY";
	/** 項目属性情報のグループ[OTHER]のキー定数 */
	public static final String $$OTHER = "OTHER";
	/** 項目属性情報のグループ[HVAL]のキー定数 */
	public static final String $$HVAL = "HVAL";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$sno1, "SNO1"},	// sno1
				{$sno2, "SNO2"},	// sno2
				{$sno3, "SNO3"},	// sno3
				{$sno4, "SNO4"},	// sno4
				{$wg_flg, "WG"},	// wg_flg
				{$sno1_flg, "SNO1"},	// sno1_flg
				{$sno2_flg, "SNO2"},	// sno2_flg
				{$sno3_flg, "SNO3"},	// sno3_flg
				{$sno4_flg, "SNO4"}	// sno4_flg
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$pln_calc_ctg_cd, "calc_ctg_nm"},	// pln_calc_ctg_cd
				{$act_calc_ctg_cd, "calc_ctg_nm"},	// act_calc_ctg_cd
				{$alc_ac_grp_cd1, "alc_ac_grp_nm"},	// alc_ac_grp_cd1
				{$alc_ac_grp_cd2, "alc_ac_grp_nm"},	// alc_ac_grp_cd2
				{$alc_ac_grp_cd3, "alc_ac_grp_nm"},	// alc_ac_grp_cd3
				{$itm_grp_cd1, "itm_grp_nm"},	// itm_grp_cd1
				{$itm_grp_cd2, "itm_grp_nm"},	// itm_grp_cd2
				{$itm_grp_cd3, "itm_grp_nm"},	// itm_grp_cd3
				{$itm_grp_cd4, "itm_grp_nm"},	// itm_grp_cd4
				{$itm_grp_cd5, "itm_grp_nm"},	// itm_grp_cd5
				{$itm_grp_cd6, "itm_grp_nm"},	// itm_grp_cd6
				{$itm_grp_cd7, "itm_grp_nm"},	// itm_grp_cd7
				{$itm_grp_cd8, "itm_grp_nm"},	// itm_grp_cd8
				{$itm_grp_cd9, "itm_grp_nm"},	// itm_grp_cd9
				{$itm_grp_cd10, "itm_grp_nm"},	// itm_grp_cd10
				{$bp_grp_cd1, "bp_grp_nm"},	// bp_grp_cd1
				{$bp_grp_cd2, "bp_grp_nm"},	// bp_grp_cd2
				{$bp_grp_cd3, "bp_grp_nm"},	// bp_grp_cd3
				{$bp_grp_cd4, "bp_grp_nm"},	// bp_grp_cd4
				{$bp_grp_cd5, "bp_grp_nm"},	// bp_grp_cd5
				{$bp_grp_cd6, "bp_grp_nm"},	// bp_grp_cd6
				{$bp_grp_cd7, "bp_grp_nm"},	// bp_grp_cd7
				{$bp_grp_cd8, "bp_grp_nm"},	// bp_grp_cd8
				{$bp_grp_cd9, "bp_grp_nm"},	// bp_grp_cd9
				{$bp_grp_cd10, "bp_grp_nm"}	// bp_grp_cd10
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"},	// wg_cd
				{$dpt_cd, "term"},	// dpt_cd
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG_ALL"},	// loc_cd
				{$bp_cd, "MAC_BP_IS_SRCH_TYP.COMM"},	// bp_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "rd_flg"},	// wg_cd
				{$dpt_cd, "ym"},	// dpt_cd
				{$loc_cd, "loc_is_srch_typ"},	// loc_cd
				{$bp_cd, "bp_is_srch_typ"},	// bp_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$CLEAR, new MCExtList(
			new String[][]{
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
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
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
	 * BEFORE,View data before departmental alloc.;AFTER,View data after departmental alloc. BEFORE,一次配賦処理前のデータを参照する;AFTER,一次配賦処理後のデータを参照する.<p>
	 *
	 */
	public String pre_alc_typ() {
		return getConstString(offset + 0, $pre_alc_typ);
	}

	/**
	 * BEFORE,View data before departmental alloc.;AFTER,View data after departmental alloc. BEFORE,一次配賦処理前のデータを参照する;AFTER,一次配賦処理後のデータを参照する.<p>
	 *
	 */
	public void pre_alc_typ(String value) {
		setConstString(offset + 0, $pre_alc_typ, value);
	}


	/**
	 * Plan calculation category cd. 計画計算カテゴリＣＤ.<p>
	 *
	 */
	public String pln_calc_ctg_cd() {
		return getConstString(offset + 1, $pln_calc_ctg_cd);
	}

	/**
	 * Plan calculation category cd. 計画計算カテゴリＣＤ.<p>
	 *
	 */
	public void pln_calc_ctg_cd(String value) {
		setConstString(offset + 1, $pln_calc_ctg_cd, value);
	}


	/**
	 * Plan calculation category name 計画計算カテゴリ名.<p>
	 *
	 */
	public String pln_calc_ctg_nm() {
		return getConstString(offset + 2, $pln_calc_ctg_nm);
	}

	/**
	 * Plan calculation category name 計画計算カテゴリ名.<p>
	 *
	 */
	public void pln_calc_ctg_nm(String value) {
		setConstString(offset + 2, $pln_calc_ctg_nm, value);
	}


	/**
	 * Result calculation category cd. 実績計算カテゴリＣＤ.<p>
	 *
	 */
	public String act_calc_ctg_cd() {
		return getConstString(offset + 3, $act_calc_ctg_cd);
	}

	/**
	 * Result calculation category cd. 実績計算カテゴリＣＤ.<p>
	 *
	 */
	public void act_calc_ctg_cd(String value) {
		setConstString(offset + 3, $act_calc_ctg_cd, value);
	}


	/**
	 * Result calculation category name 実績計算カテゴリ名.<p>
	 *
	 */
	public String act_calc_ctg_nm() {
		return getConstString(offset + 4, $act_calc_ctg_nm);
	}

	/**
	 * Result calculation category name 実績計算カテゴリ名.<p>
	 *
	 */
	public void act_calc_ctg_nm(String value) {
		setConstString(offset + 4, $act_calc_ctg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0230.TermR term_p(){
		return (mcframe.clientMAUB.MAUBP0230.TermR) getConstInnerRow(offset + 5, $term_p);
	}
	
	public void term_p(mcframe.clientMAUB.MAUBP0230.TermR row){
		setConstInnerRow(offset + 5, $term_p, row);
	}


	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ym_fr() {
		return getConstDate(offset + 6, $ym_fr);
	}

	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public void ym_fr(MCDate value) {
		setConstDate(offset + 6, $ym_fr, value);
	}


	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDate ym_to() {
		return getConstDate(offset + 7, $ym_to);
	}

	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public void ym_to(MCDate value) {
		setConstDate(offset + 7, $ym_to, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 9, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 9, $wg_nm, value);
	}


	/**
	 * Expense incurred type 費用発生区分.<p>
	 *
	 */
	public String alc_rec_typ() {
		return getConstString(offset + 10, $alc_rec_typ);
	}

	/**
	 * Expense incurred type 費用発生区分.<p>
	 *
	 */
	public void alc_rec_typ(String value) {
		setConstString(offset + 10, $alc_rec_typ, value);
	}


	/**
	 * Expense incurred type name 費用発生区分名.<p>
	 *
	 */
	public String alc_rec_typ_nm() {
		return getConstString(offset + 11, $alc_rec_typ_nm);
	}

	/**
	 * Expense incurred type name 費用発生区分名.<p>
	 *
	 */
	public void alc_rec_typ_nm(String value) {
		setConstString(offset + 11, $alc_rec_typ_nm, value);
	}


	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 12, $alc_ac_cd);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 12, $alc_ac_cd, value);
	}


	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 13, $alc_ac_nm);
	}

	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 13, $alc_ac_nm, value);
	}


	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public String alc_ac_grp_cd1() {
		return getConstString(offset + 14, $alc_ac_grp_cd1);
	}

	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public void alc_ac_grp_cd1(String value) {
		setConstString(offset + 14, $alc_ac_grp_cd1, value);
	}


	/**
	 * Allocation account group name 1 配賦科目グループ名１.<p>
	 *
	 */
	public String alc_ac_grp_nm1() {
		return getConstString(offset + 15, $alc_ac_grp_nm1);
	}

	/**
	 * Allocation account group name 1 配賦科目グループ名１.<p>
	 *
	 */
	public void alc_ac_grp_nm1(String value) {
		setConstString(offset + 15, $alc_ac_grp_nm1, value);
	}


	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public String alc_ac_grp_cd2() {
		return getConstString(offset + 16, $alc_ac_grp_cd2);
	}

	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public void alc_ac_grp_cd2(String value) {
		setConstString(offset + 16, $alc_ac_grp_cd2, value);
	}


	/**
	 * Allocation account group name 2 配賦科目グループ名２.<p>
	 *
	 */
	public String alc_ac_grp_nm2() {
		return getConstString(offset + 17, $alc_ac_grp_nm2);
	}

	/**
	 * Allocation account group name 2 配賦科目グループ名２.<p>
	 *
	 */
	public void alc_ac_grp_nm2(String value) {
		setConstString(offset + 17, $alc_ac_grp_nm2, value);
	}


	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public String alc_ac_grp_cd3() {
		return getConstString(offset + 18, $alc_ac_grp_cd3);
	}

	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public void alc_ac_grp_cd3(String value) {
		setConstString(offset + 18, $alc_ac_grp_cd3, value);
	}


	/**
	 * Allocation account group name 3 配賦科目グループ名３.<p>
	 *
	 */
	public String alc_ac_grp_nm3() {
		return getConstString(offset + 19, $alc_ac_grp_nm3);
	}

	/**
	 * Allocation account group name 3 配賦科目グループ名３.<p>
	 *
	 */
	public void alc_ac_grp_nm3(String value) {
		setConstString(offset + 19, $alc_ac_grp_nm3, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 20, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 20, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 21, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 21, $dpt_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 22, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 22, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 23, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 23, $loc_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 24, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 24, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 25, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 25, $oper_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 26, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 26, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 27, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 27, $bp_nm, value);
	}


	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 28, $ctg_cd);
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 28, $ctg_cd, value);
	}


	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public String ctg_nm() {
		return getConstString(offset + 29, $ctg_nm);
	}

	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public void ctg_nm(String value) {
		setConstString(offset + 29, $ctg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 30, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 30, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 31, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 31, $itm_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 32, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 32, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 33, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 33, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 34, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 34, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 35, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 35, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 36, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 36, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 37, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 37, $sno4, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 38, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 38, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 39, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 39, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 40, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 40, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 41, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 41, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 42, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 42, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 43, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 43, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 44, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 44, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 45, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 45, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 46, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 46, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 47, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 47, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 48, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 48, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 49, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 49, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 50, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 50, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 51, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 51, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 52, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 52, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 53, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 53, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 54, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 54, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 55, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 55, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 56, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 56, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 57, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 57, $itm_grp_nm10, value);
	}


	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return getConstString(offset + 58, $bp_grp_cd1);
	}

	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		setConstString(offset + 58, $bp_grp_cd1, value);
	}


	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return getConstString(offset + 59, $bp_grp_nm1);
	}

	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		setConstString(offset + 59, $bp_grp_nm1, value);
	}


	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return getConstString(offset + 60, $bp_grp_cd2);
	}

	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		setConstString(offset + 60, $bp_grp_cd2, value);
	}


	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return getConstString(offset + 61, $bp_grp_nm2);
	}

	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		setConstString(offset + 61, $bp_grp_nm2, value);
	}


	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return getConstString(offset + 62, $bp_grp_cd3);
	}

	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		setConstString(offset + 62, $bp_grp_cd3, value);
	}


	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return getConstString(offset + 63, $bp_grp_nm3);
	}

	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		setConstString(offset + 63, $bp_grp_nm3, value);
	}


	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return getConstString(offset + 64, $bp_grp_cd4);
	}

	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		setConstString(offset + 64, $bp_grp_cd4, value);
	}


	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return getConstString(offset + 65, $bp_grp_nm4);
	}

	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		setConstString(offset + 65, $bp_grp_nm4, value);
	}


	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return getConstString(offset + 66, $bp_grp_cd5);
	}

	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		setConstString(offset + 66, $bp_grp_cd5, value);
	}


	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return getConstString(offset + 67, $bp_grp_nm5);
	}

	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		setConstString(offset + 67, $bp_grp_nm5, value);
	}


	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return getConstString(offset + 68, $bp_grp_cd6);
	}

	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		setConstString(offset + 68, $bp_grp_cd6, value);
	}


	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return getConstString(offset + 69, $bp_grp_nm6);
	}

	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		setConstString(offset + 69, $bp_grp_nm6, value);
	}


	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return getConstString(offset + 70, $bp_grp_cd7);
	}

	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		setConstString(offset + 70, $bp_grp_cd7, value);
	}


	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return getConstString(offset + 71, $bp_grp_nm7);
	}

	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		setConstString(offset + 71, $bp_grp_nm7, value);
	}


	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return getConstString(offset + 72, $bp_grp_cd8);
	}

	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		setConstString(offset + 72, $bp_grp_cd8, value);
	}


	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return getConstString(offset + 73, $bp_grp_nm8);
	}

	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		setConstString(offset + 73, $bp_grp_nm8, value);
	}


	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return getConstString(offset + 74, $bp_grp_cd9);
	}

	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		setConstString(offset + 74, $bp_grp_cd9, value);
	}


	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return getConstString(offset + 75, $bp_grp_nm9);
	}

	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		setConstString(offset + 75, $bp_grp_nm9, value);
	}


	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return getConstString(offset + 76, $bp_grp_cd10);
	}

	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		setConstString(offset + 76, $bp_grp_cd10, value);
	}


	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return getConstString(offset + 77, $bp_grp_nm10);
	}

	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		setConstString(offset + 77, $bp_grp_nm10, value);
	}


	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public boolean wg_flg() {
		return getConstBoolean(offset + 78, $wg_flg);
	}

	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public void wg_flg(boolean value) {
		setConstBoolean(offset + 78, $wg_flg, value);
	}


	/**
	 * Expense incurred type 費用発生区分.<p>
	 *
	 */
	public boolean alc_rec_typ_flg() {
		return getConstBoolean(offset + 79, $alc_rec_typ_flg);
	}

	/**
	 * Expense incurred type 費用発生区分.<p>
	 *
	 */
	public void alc_rec_typ_flg(boolean value) {
		setConstBoolean(offset + 79, $alc_rec_typ_flg, value);
	}


	/**
	 * Allocation account 配賦科目.<p>
	 *
	 */
	public boolean alc_ac_flg() {
		return getConstBoolean(offset + 80, $alc_ac_flg);
	}

	/**
	 * Allocation account 配賦科目.<p>
	 *
	 */
	public void alc_ac_flg(boolean value) {
		setConstBoolean(offset + 80, $alc_ac_flg, value);
	}


	/**
	 * Allocation account G 1 配賦科目Ｇ１.<p>
	 *
	 */
	public boolean alc_ac_grp1_flg() {
		return getConstBoolean(offset + 81, $alc_ac_grp1_flg);
	}

	/**
	 * Allocation account G 1 配賦科目Ｇ１.<p>
	 *
	 */
	public void alc_ac_grp1_flg(boolean value) {
		setConstBoolean(offset + 81, $alc_ac_grp1_flg, value);
	}


	/**
	 * Allocation account G 2 配賦科目Ｇ２.<p>
	 *
	 */
	public boolean alc_ac_grp2_flg() {
		return getConstBoolean(offset + 82, $alc_ac_grp2_flg);
	}

	/**
	 * Allocation account G 2 配賦科目Ｇ２.<p>
	 *
	 */
	public void alc_ac_grp2_flg(boolean value) {
		setConstBoolean(offset + 82, $alc_ac_grp2_flg, value);
	}


	/**
	 * Allocation account G 3 配賦科目Ｇ３.<p>
	 *
	 */
	public boolean alc_ac_grp3_flg() {
		return getConstBoolean(offset + 83, $alc_ac_grp3_flg);
	}

	/**
	 * Allocation account G 3 配賦科目Ｇ３.<p>
	 *
	 */
	public void alc_ac_grp3_flg(boolean value) {
		setConstBoolean(offset + 83, $alc_ac_grp3_flg, value);
	}


	/**
	 * Dept. 部門.<p>
	 *
	 */
	public boolean dpt_flg() {
		return getConstBoolean(offset + 84, $dpt_flg);
	}

	/**
	 * Dept. 部門.<p>
	 *
	 */
	public void dpt_flg(boolean value) {
		setConstBoolean(offset + 84, $dpt_flg, value);
	}


	/**
	 * Location 場所.<p>
	 *
	 */
	public boolean loc_flg() {
		return getConstBoolean(offset + 85, $loc_flg);
	}

	/**
	 * Location 場所.<p>
	 *
	 */
	public void loc_flg(boolean value) {
		setConstBoolean(offset + 85, $loc_flg, value);
	}


	/**
	 * Operation 工程.<p>
	 *
	 */
	public boolean oper_flg() {
		return getConstBoolean(offset + 86, $oper_flg);
	}

	/**
	 * Operation 工程.<p>
	 *
	 */
	public void oper_flg(boolean value) {
		setConstBoolean(offset + 86, $oper_flg, value);
	}


	/**
	 * BP 取引先.<p>
	 *
	 */
	public boolean bp_flg() {
		return getConstBoolean(offset + 87, $bp_flg);
	}

	/**
	 * BP 取引先.<p>
	 *
	 */
	public void bp_flg(boolean value) {
		setConstBoolean(offset + 87, $bp_flg, value);
	}


	/**
	 * Item category 品群.<p>
	 *
	 */
	public boolean ctg_flg() {
		return getConstBoolean(offset + 88, $ctg_flg);
	}

	/**
	 * Item category 品群.<p>
	 *
	 */
	public void ctg_flg(boolean value) {
		setConstBoolean(offset + 88, $ctg_flg, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public boolean itm_flg() {
		return getConstBoolean(offset + 89, $itm_flg);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_flg(boolean value) {
		setConstBoolean(offset + 89, $itm_flg, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public boolean itm_typ_flg() {
		return getConstBoolean(offset + 90, $itm_typ_flg);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ_flg(boolean value) {
		setConstBoolean(offset + 90, $itm_typ_flg, value);
	}


	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public boolean itm_typ_d_flg() {
		return getConstBoolean(offset + 91, $itm_typ_d_flg);
	}

	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public void itm_typ_d_flg(boolean value) {
		setConstBoolean(offset + 91, $itm_typ_d_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public boolean lot_flg() {
		return getConstBoolean(offset + 92, $lot_flg);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_flg(boolean value) {
		setConstBoolean(offset + 92, $lot_flg, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public boolean sublot_flg() {
		return getConstBoolean(offset + 93, $sublot_flg);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_flg(boolean value) {
		setConstBoolean(offset + 93, $sublot_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public boolean sno1_flg() {
		return getConstBoolean(offset + 94, $sno1_flg);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1_flg(boolean value) {
		setConstBoolean(offset + 94, $sno1_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public boolean sno2_flg() {
		return getConstBoolean(offset + 95, $sno2_flg);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2_flg(boolean value) {
		setConstBoolean(offset + 95, $sno2_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public boolean sno3_flg() {
		return getConstBoolean(offset + 96, $sno3_flg);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3_flg(boolean value) {
		setConstBoolean(offset + 96, $sno3_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public boolean sno4_flg() {
		return getConstBoolean(offset + 97, $sno4_flg);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4_flg(boolean value) {
		setConstBoolean(offset + 97, $sno4_flg, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 98, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 98, $itm_grp_flg1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 99, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 99, $itm_grp_flg2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 100, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 100, $itm_grp_flg3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 101, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 101, $itm_grp_flg4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 102, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 102, $itm_grp_flg5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 103, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 103, $itm_grp_flg6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 104, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 104, $itm_grp_flg7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 105, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 105, $itm_grp_flg8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 106, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 106, $itm_grp_flg9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 107, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 107, $itm_grp_flg10, value);
	}


	/**
	 * BP classification 1 取引先分類１.<p>
	 *
	 */
	public boolean bp_grp_flg1() {
		return getConstBoolean(offset + 108, $bp_grp_flg1);
	}

	/**
	 * BP classification 1 取引先分類１.<p>
	 *
	 */
	public void bp_grp_flg1(boolean value) {
		setConstBoolean(offset + 108, $bp_grp_flg1, value);
	}


	/**
	 * BP classification 2 取引先分類２.<p>
	 *
	 */
	public boolean bp_grp_flg2() {
		return getConstBoolean(offset + 109, $bp_grp_flg2);
	}

	/**
	 * BP classification 2 取引先分類２.<p>
	 *
	 */
	public void bp_grp_flg2(boolean value) {
		setConstBoolean(offset + 109, $bp_grp_flg2, value);
	}


	/**
	 * BP classification 3 取引先分類３.<p>
	 *
	 */
	public boolean bp_grp_flg3() {
		return getConstBoolean(offset + 110, $bp_grp_flg3);
	}

	/**
	 * BP classification 3 取引先分類３.<p>
	 *
	 */
	public void bp_grp_flg3(boolean value) {
		setConstBoolean(offset + 110, $bp_grp_flg3, value);
	}


	/**
	 * BP classification 4 取引先分類４.<p>
	 *
	 */
	public boolean bp_grp_flg4() {
		return getConstBoolean(offset + 111, $bp_grp_flg4);
	}

	/**
	 * BP classification 4 取引先分類４.<p>
	 *
	 */
	public void bp_grp_flg4(boolean value) {
		setConstBoolean(offset + 111, $bp_grp_flg4, value);
	}


	/**
	 * BP classification 5 取引先分類５.<p>
	 *
	 */
	public boolean bp_grp_flg5() {
		return getConstBoolean(offset + 112, $bp_grp_flg5);
	}

	/**
	 * BP classification 5 取引先分類５.<p>
	 *
	 */
	public void bp_grp_flg5(boolean value) {
		setConstBoolean(offset + 112, $bp_grp_flg5, value);
	}


	/**
	 * BP classification 6 取引先分類６.<p>
	 *
	 */
	public boolean bp_grp_flg6() {
		return getConstBoolean(offset + 113, $bp_grp_flg6);
	}

	/**
	 * BP classification 6 取引先分類６.<p>
	 *
	 */
	public void bp_grp_flg6(boolean value) {
		setConstBoolean(offset + 113, $bp_grp_flg6, value);
	}


	/**
	 * BP classification 7 取引先分類７.<p>
	 *
	 */
	public boolean bp_grp_flg7() {
		return getConstBoolean(offset + 114, $bp_grp_flg7);
	}

	/**
	 * BP classification 7 取引先分類７.<p>
	 *
	 */
	public void bp_grp_flg7(boolean value) {
		setConstBoolean(offset + 114, $bp_grp_flg7, value);
	}


	/**
	 * BP classification 8 取引先分類８.<p>
	 *
	 */
	public boolean bp_grp_flg8() {
		return getConstBoolean(offset + 115, $bp_grp_flg8);
	}

	/**
	 * BP classification 8 取引先分類８.<p>
	 *
	 */
	public void bp_grp_flg8(boolean value) {
		setConstBoolean(offset + 115, $bp_grp_flg8, value);
	}


	/**
	 * BP classification 9 取引先分類９.<p>
	 *
	 */
	public boolean bp_grp_flg9() {
		return getConstBoolean(offset + 116, $bp_grp_flg9);
	}

	/**
	 * BP classification 9 取引先分類９.<p>
	 *
	 */
	public void bp_grp_flg9(boolean value) {
		setConstBoolean(offset + 116, $bp_grp_flg9, value);
	}


	/**
	 * BP classification 10 取引先分類１０.<p>
	 *
	 */
	public boolean bp_grp_flg10() {
		return getConstBoolean(offset + 117, $bp_grp_flg10);
	}

	/**
	 * BP classification 10 取引先分類１０.<p>
	 *
	 */
	public void bp_grp_flg10(boolean value) {
		setConstBoolean(offset + 117, $bp_grp_flg10, value);
	}


	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public boolean disp_key() {
		return getConstBoolean(offset + 118, $disp_key);
	}

	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public void disp_key(boolean value) {
		setConstBoolean(offset + 118, $disp_key, value);
	}


	/**
	 * Exclude own working group 自ワーキンググループ除く.<p>
	 *
	 */
	public boolean not_my_wg_flg() {
		return getConstBoolean(offset + 119, $not_my_wg_flg);
	}

	/**
	 * Exclude own working group 自ワーキンググループ除く.<p>
	 *
	 */
	public void not_my_wg_flg(boolean value) {
		setConstBoolean(offset + 119, $not_my_wg_flg, value);
	}


	/**
	 * Exclude departmental alloc. performed 一次配賦処理済除く.<p>
	 *
	 */
	public boolean not_pre_alc_fin_flg() {
		return getConstBoolean(offset + 120, $not_pre_alc_fin_flg);
	}

	/**
	 * Exclude departmental alloc. performed 一次配賦処理済除く.<p>
	 *
	 */
	public void not_pre_alc_fin_flg(boolean value) {
		setConstBoolean(offset + 120, $not_pre_alc_fin_flg, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 121, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 121, $cur_cd, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 122, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 122, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 122, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 122, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 122, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 122, $amt_dec_place, value);
	}


	public String getString(String name) {
		if ($pre_alc_typ.equalsIgnoreCase(name)) {
			return pre_alc_typ();
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			return pln_calc_ctg_cd();
		}
		if ($pln_calc_ctg_nm.equalsIgnoreCase(name)) {
			return pln_calc_ctg_nm();
		}
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_calc_ctg_cd();
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			return act_calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($alc_rec_typ.equalsIgnoreCase(name)) {
			return alc_rec_typ();
		}
		if ($alc_rec_typ_nm.equalsIgnoreCase(name)) {
			return alc_rec_typ_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd1();
		}
		if ($alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm1();
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd2();
		}
		if ($alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm2();
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd3();
		}
		if ($alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm3();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($alc_rec_typ_flg.equalsIgnoreCase(name)) {
			return alc_rec_typ_flg();
		}
		if ($alc_ac_flg.equalsIgnoreCase(name)) {
			return alc_ac_flg();
		}
		if ($alc_ac_grp1_flg.equalsIgnoreCase(name)) {
			return alc_ac_grp1_flg();
		}
		if ($alc_ac_grp2_flg.equalsIgnoreCase(name)) {
			return alc_ac_grp2_flg();
		}
		if ($alc_ac_grp3_flg.equalsIgnoreCase(name)) {
			return alc_ac_grp3_flg();
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			return dpt_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			return oper_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			return ctg_flg();
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
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
		}
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			return bp_grp_flg1();
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			return bp_grp_flg2();
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			return bp_grp_flg3();
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			return bp_grp_flg4();
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			return bp_grp_flg5();
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			return bp_grp_flg6();
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			return bp_grp_flg7();
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			return bp_grp_flg8();
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			return bp_grp_flg9();
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			return bp_grp_flg10();
		}
		if ($disp_key.equalsIgnoreCase(name)) {
			return disp_key();
		}
		if ($not_my_wg_flg.equalsIgnoreCase(name)) {
			return not_my_wg_flg();
		}
		if ($not_pre_alc_fin_flg.equalsIgnoreCase(name)) {
			return not_pre_alc_fin_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pre_alc_typ.equalsIgnoreCase(name)) {
			return pre_alc_typ();
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			return pln_calc_ctg_cd();
		}
		if ($pln_calc_ctg_nm.equalsIgnoreCase(name)) {
			return pln_calc_ctg_nm();
		}
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_calc_ctg_cd();
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			return act_calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($alc_rec_typ.equalsIgnoreCase(name)) {
			return alc_rec_typ();
		}
		if ($alc_rec_typ_nm.equalsIgnoreCase(name)) {
			return alc_rec_typ_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd1();
		}
		if ($alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm1();
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd2();
		}
		if ($alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm2();
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd3();
		}
		if ($alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			return alc_ac_grp_nm3();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($alc_rec_typ_flg.equalsIgnoreCase(name)) {
			return alc_rec_typ_flg();
		}
		if ($alc_ac_flg.equalsIgnoreCase(name)) {
			return alc_ac_flg();
		}
		if ($alc_ac_grp1_flg.equalsIgnoreCase(name)) {
			return alc_ac_grp1_flg();
		}
		if ($alc_ac_grp2_flg.equalsIgnoreCase(name)) {
			return alc_ac_grp2_flg();
		}
		if ($alc_ac_grp3_flg.equalsIgnoreCase(name)) {
			return alc_ac_grp3_flg();
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			return dpt_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			return oper_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			return ctg_flg();
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
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
		}
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			return bp_grp_flg1();
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			return bp_grp_flg2();
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			return bp_grp_flg3();
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			return bp_grp_flg4();
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			return bp_grp_flg5();
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			return bp_grp_flg6();
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			return bp_grp_flg7();
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			return bp_grp_flg8();
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			return bp_grp_flg9();
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			return bp_grp_flg10();
		}
		if ($disp_key.equalsIgnoreCase(name)) {
			return disp_key();
		}
		if ($not_my_wg_flg.equalsIgnoreCase(name)) {
			return not_my_wg_flg();
		}
		if ($not_pre_alc_fin_flg.equalsIgnoreCase(name)) {
			return not_pre_alc_fin_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pre_alc_typ.equalsIgnoreCase(name)) {
			pre_alc_typ(value);
			return;
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			pln_calc_ctg_cd(value);
			return;
		}
		if ($pln_calc_ctg_nm.equalsIgnoreCase(name)) {
			pln_calc_ctg_nm(value);
			return;
		}
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			act_calc_ctg_cd(value);
			return;
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			act_calc_ctg_nm(value);
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
		if ($alc_rec_typ.equalsIgnoreCase(name)) {
			alc_rec_typ(value);
			return;
		}
		if ($alc_rec_typ_nm.equalsIgnoreCase(name)) {
			alc_rec_typ_nm(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			alc_ac_grp_cd1(value);
			return;
		}
		if ($alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			alc_ac_grp_nm1(value);
			return;
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			alc_ac_grp_cd2(value);
			return;
		}
		if ($alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			alc_ac_grp_nm2(value);
			return;
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			alc_ac_grp_cd3(value);
			return;
		}
		if ($alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			alc_ac_grp_nm3(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($alc_rec_typ_flg.equalsIgnoreCase(name)) {
			alc_rec_typ_flg(value);
			return;
		}
		if ($alc_ac_flg.equalsIgnoreCase(name)) {
			alc_ac_flg(value);
			return;
		}
		if ($alc_ac_grp1_flg.equalsIgnoreCase(name)) {
			alc_ac_grp1_flg(value);
			return;
		}
		if ($alc_ac_grp2_flg.equalsIgnoreCase(name)) {
			alc_ac_grp2_flg(value);
			return;
		}
		if ($alc_ac_grp3_flg.equalsIgnoreCase(name)) {
			alc_ac_grp3_flg(value);
			return;
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			dpt_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			oper_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			ctg_flg(value);
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
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			bp_grp_flg1(value);
			return;
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			bp_grp_flg2(value);
			return;
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			bp_grp_flg3(value);
			return;
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			bp_grp_flg4(value);
			return;
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			bp_grp_flg5(value);
			return;
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			bp_grp_flg6(value);
			return;
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			bp_grp_flg7(value);
			return;
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			bp_grp_flg8(value);
			return;
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			bp_grp_flg9(value);
			return;
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			bp_grp_flg10(value);
			return;
		}
		if ($disp_key.equalsIgnoreCase(name)) {
			disp_key(value);
			return;
		}
		if ($not_my_wg_flg.equalsIgnoreCase(name)) {
			not_my_wg_flg(value);
			return;
		}
		if ($not_pre_alc_fin_flg.equalsIgnoreCase(name)) {
			not_pre_alc_fin_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pre_alc_typ.equalsIgnoreCase(name)) {
			pre_alc_typ(value);
			return;
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			pln_calc_ctg_cd(value);
			return;
		}
		if ($pln_calc_ctg_nm.equalsIgnoreCase(name)) {
			pln_calc_ctg_nm(value);
			return;
		}
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			act_calc_ctg_cd(value);
			return;
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			act_calc_ctg_nm(value);
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
		if ($alc_rec_typ.equalsIgnoreCase(name)) {
			alc_rec_typ(value);
			return;
		}
		if ($alc_rec_typ_nm.equalsIgnoreCase(name)) {
			alc_rec_typ_nm(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			alc_ac_grp_cd1(value);
			return;
		}
		if ($alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			alc_ac_grp_nm1(value);
			return;
		}
		if ($alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			alc_ac_grp_cd2(value);
			return;
		}
		if ($alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			alc_ac_grp_nm2(value);
			return;
		}
		if ($alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			alc_ac_grp_cd3(value);
			return;
		}
		if ($alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			alc_ac_grp_nm3(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($alc_rec_typ_flg.equalsIgnoreCase(name)) {
			alc_rec_typ_flg(value);
			return;
		}
		if ($alc_ac_flg.equalsIgnoreCase(name)) {
			alc_ac_flg(value);
			return;
		}
		if ($alc_ac_grp1_flg.equalsIgnoreCase(name)) {
			alc_ac_grp1_flg(value);
			return;
		}
		if ($alc_ac_grp2_flg.equalsIgnoreCase(name)) {
			alc_ac_grp2_flg(value);
			return;
		}
		if ($alc_ac_grp3_flg.equalsIgnoreCase(name)) {
			alc_ac_grp3_flg(value);
			return;
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			dpt_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			oper_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			ctg_flg(value);
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
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			bp_grp_flg1(value);
			return;
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			bp_grp_flg2(value);
			return;
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			bp_grp_flg3(value);
			return;
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			bp_grp_flg4(value);
			return;
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			bp_grp_flg5(value);
			return;
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			bp_grp_flg6(value);
			return;
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			bp_grp_flg7(value);
			return;
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			bp_grp_flg8(value);
			return;
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			bp_grp_flg9(value);
			return;
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			bp_grp_flg10(value);
			return;
		}
		if ($disp_key.equalsIgnoreCase(name)) {
			disp_key(value);
			return;
		}
		if ($not_my_wg_flg.equalsIgnoreCase(name)) {
			not_my_wg_flg(value);
			return;
		}
		if ($not_pre_alc_fin_flg.equalsIgnoreCase(name)) {
			not_pre_alc_fin_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($term_p.equalsIgnoreCase(name)) {
			return term_p();
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
		if ($term_p.equalsIgnoreCase(name)) {
			term_p(
				((MCContainerMeta) term_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0230.TermR.class, value)
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


	public MCDate term() {
		return term_p().term();
	}

	public void term(MCDate value) {
		term_p().term(value);
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

