package mcframe.clientMABS.MABSP0030;

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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;CHNG,Change,5;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;CHNG,切り替える,5;REF,参照する,3.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Common 共通.<p>
	 *
	 */
	public static final String $cmn_flg = "cmn_flg";
	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public static final String $wg_flg = "wg_flg";
	public static final String $dt = "dt";
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
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public static final String $chng_no = "chng_no";
	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public static final String $ext_sys_no_bom = "ext_sys_no_bom";
	public static final String $par_itm_typ_p = "par_itm_typ_p";
	public static final String $par_itm_p = "par_itm_p";
	public static final String $chd_itm_typ_p = "chd_itm_typ_p";
	public static final String $chd_itm_p = "chd_itm_p";
	public static final String $ver_no_p = "ver_no_p";
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public static final String $off_del_flg = "off_del_flg";
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public static final String $on_del_flg = "on_del_flg";
	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $par_itm_grp_cd1 = "par_itm_grp_cd1";
	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public static final String $par_itm_grp_nm1 = "par_itm_grp_nm1";
	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $par_itm_grp_cd2 = "par_itm_grp_cd2";
	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public static final String $par_itm_grp_nm2 = "par_itm_grp_nm2";
	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $par_itm_grp_cd3 = "par_itm_grp_cd3";
	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public static final String $par_itm_grp_nm3 = "par_itm_grp_nm3";
	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $par_itm_grp_cd4 = "par_itm_grp_cd4";
	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public static final String $par_itm_grp_nm4 = "par_itm_grp_nm4";
	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $par_itm_grp_cd5 = "par_itm_grp_cd5";
	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public static final String $par_itm_grp_nm5 = "par_itm_grp_nm5";
	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $par_itm_grp_cd6 = "par_itm_grp_cd6";
	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public static final String $par_itm_grp_nm6 = "par_itm_grp_nm6";
	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $par_itm_grp_cd7 = "par_itm_grp_cd7";
	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public static final String $par_itm_grp_nm7 = "par_itm_grp_nm7";
	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $par_itm_grp_cd8 = "par_itm_grp_cd8";
	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public static final String $par_itm_grp_nm8 = "par_itm_grp_nm8";
	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $par_itm_grp_cd9 = "par_itm_grp_cd9";
	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public static final String $par_itm_grp_nm9 = "par_itm_grp_nm9";
	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $par_itm_grp_cd10 = "par_itm_grp_cd10";
	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public static final String $par_itm_grp_nm10 = "par_itm_grp_nm10";
	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd1 = "chd_itm_grp_cd1";
	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm1 = "chd_itm_grp_nm1";
	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd2 = "chd_itm_grp_cd2";
	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm2 = "chd_itm_grp_nm2";
	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd3 = "chd_itm_grp_cd3";
	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm3 = "chd_itm_grp_nm3";
	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd4 = "chd_itm_grp_cd4";
	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm4 = "chd_itm_grp_nm4";
	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd5 = "chd_itm_grp_cd5";
	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm5 = "chd_itm_grp_nm5";
	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd6 = "chd_itm_grp_cd6";
	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm6 = "chd_itm_grp_nm6";
	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd7 = "chd_itm_grp_cd7";
	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm7 = "chd_itm_grp_nm7";
	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd8 = "chd_itm_grp_cd8";
	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm8 = "chd_itm_grp_nm8";
	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd9 = "chd_itm_grp_cd9";
	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm9 = "chd_itm_grp_nm9";
	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $chd_itm_grp_cd10 = "chd_itm_grp_cd10";
	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public static final String $chd_itm_grp_nm10 = "chd_itm_grp_nm10";
	/**
	 * BOM switching type ＢＯＭ切替区分.<p>
	 *
	 */
	public static final String $bom_chng_typ = "bom_chng_typ";
	/**
	 * BOM switching type name ＢＯＭ切替区分名.<p>
	 *
	 */
	public static final String $bom_chng_typ_nm = "bom_chng_typ_nm";
	/**
	 * Change start date 切替開始日.<p>
	 *
	 */
	public static final String $chng_st_dt = "chng_st_dt";
	/**
	 * End date after change 切替後終了日.<p>
	 *
	 */
	public static final String $chng_end_dt = "chng_end_dt";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $chng_wg_cd = "chng_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $chng_wg_nm = "chng_wg_nm";
	public static final String $old_itm_p = "old_itm_p";
	public static final String $old_ver_no_p = "old_ver_no_p";
	/**
	 * Old alternative item ratio 旧代替品目比率.<p>
	 *
	 */
	public static final String $old_alt_itm_ratio = "old_alt_itm_ratio";
	/**
	 * Old allocation priority 旧引当優先順.<p>
	 *
	 */
	public static final String $old_alt_alloc_prio = "old_alt_alloc_prio";
	/**
	 * Old inventory management type 旧在庫管理区分.<p>
	 *
	 */
	public static final String $old_stk_mng_typ = "old_stk_mng_typ";
	/**
	 * Old inventory management type name 旧在庫管理区分名.<p>
	 *
	 */
	public static final String $old_stk_mng_typ_nm = "old_stk_mng_typ_nm";
	/**
	 * Old asset management type 旧資産管理区分.<p>
	 *
	 */
	public static final String $old_asset_mng_typ = "old_asset_mng_typ";
	/**
	 * Old asset management type name 旧資産管理区分名.<p>
	 *
	 */
	public static final String $old_asset_mng_typ_nm = "old_asset_mng_typ_nm";
	/**
	 * Old alternative group cd. 旧代替グループＣＤ.<p>
	 *
	 */
	public static final String $old_alt_grp_cd = "old_alt_grp_cd";
	/**
	 * Old alternative group name 旧代替グループ名.<p>
	 *
	 */
	public static final String $old_alt_grp_nm = "old_alt_grp_nm";
	/**
	 * Old alternative item selection type 旧代替品目選択区分.<p>
	 *
	 */
	public static final String $old_alt_itm_typ = "old_alt_itm_typ";
	/**
	 * Old alternative item selection type name 旧代替品目選択区分名.<p>
	 *
	 */
	public static final String $old_alt_itm_typ_nm = "old_alt_itm_typ_nm";
	public static final String $new_itm_p = "new_itm_p";
	public static final String $new_ver_no_p = "new_ver_no_p";
	/**
	 * New alternative item ratio 新代替品目比率.<p>
	 *
	 */
	public static final String $new_alt_itm_ratio = "new_alt_itm_ratio";
	/**
	 * New allocation priority 新引当優先順.<p>
	 *
	 */
	public static final String $new_alt_alloc_prio = "new_alt_alloc_prio";
	/**
	 * New inventory management type 新在庫管理区分.<p>
	 *
	 */
	public static final String $new_stk_mng_typ = "new_stk_mng_typ";
	/**
	 * New inventory management type name 新在庫管理区分名.<p>
	 *
	 */
	public static final String $new_stk_mng_typ_nm = "new_stk_mng_typ_nm";
	/**
	 * New asset management type 新資産管理区分.<p>
	 *
	 */
	public static final String $new_asset_mng_typ = "new_asset_mng_typ";
	/**
	 * New asset management type name 新資産管理区分名.<p>
	 *
	 */
	public static final String $new_asset_mng_typ_nm = "new_asset_mng_typ_nm";
	/**
	 * New alternative group cd. 新代替グループＣＤ.<p>
	 *
	 */
	public static final String $new_alt_grp_cd = "new_alt_grp_cd";
	/**
	 * New alternative group name 新代替グループ名.<p>
	 *
	 */
	public static final String $new_alt_grp_nm = "new_alt_grp_nm";
	/**
	 * New alternative item selection type 新代替品目選択区分.<p>
	 *
	 */
	public static final String $new_alt_itm_typ = "new_alt_itm_typ";
	/**
	 * New alternative item selection type name 新代替品目選択区分名.<p>
	 *
	 */
	public static final String $new_alt_itm_typ_nm = "new_alt_itm_typ_nm";

	public static final String $st_dt_fr = $dt + ".st_dt_fr";
	public static final String $st_dt_to = $dt + ".st_dt_to";
	public static final String $end_dt_fr = $dt + ".end_dt_fr";
	public static final String $end_dt_to = $dt + ".end_dt_to";
	public static final String $par_itm_typ = $par_itm_typ_p + ".itm_typ";
	public static final String $par_itm_typ_nm = $par_itm_typ_p + ".itm_typ_nm";
	public static final String $par_itm_typ_d_cd = $par_itm_typ_p + ".itm_typ_d_cd";
	public static final String $par_itm_typ_d_nm = $par_itm_typ_p + ".itm_typ_d_nm";
	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_itm_nm = $par_itm_p + ".itm_nm";
	public static final String $chd_itm_typ = $chd_itm_typ_p + ".itm_typ";
	public static final String $chd_itm_typ_nm = $chd_itm_typ_p + ".itm_typ_nm";
	public static final String $chd_itm_typ_d_cd = $chd_itm_typ_p + ".itm_typ_d_cd";
	public static final String $chd_itm_typ_d_nm = $chd_itm_typ_p + ".itm_typ_d_nm";
	public static final String $chd_itm_cd = $chd_itm_p + ".itm_cd";
	public static final String $chd_itm_sub1 = $chd_itm_p + ".itm_sub1";
	public static final String $chd_itm_sub2 = $chd_itm_p + ".itm_sub2";
	public static final String $chd_itm_sub3 = $chd_itm_p + ".itm_sub3";
	public static final String $chd_itm_nm = $chd_itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $old_itm_cd = $old_itm_p + ".itm_cd";
	public static final String $old_itm_sub1 = $old_itm_p + ".itm_sub1";
	public static final String $old_itm_sub2 = $old_itm_p + ".itm_sub2";
	public static final String $old_itm_sub3 = $old_itm_p + ".itm_sub3";
	public static final String $old_itm_nm = $old_itm_p + ".itm_nm";
	public static final String $old_ver_no = $old_ver_no_p + ".ver_no";
	public static final String $new_itm_cd = $new_itm_p + ".itm_cd";
	public static final String $new_itm_sub1 = $new_itm_p + ".itm_sub1";
	public static final String $new_itm_sub2 = $new_itm_p + ".itm_sub2";
	public static final String $new_itm_sub3 = $new_itm_p + ".itm_sub3";
	public static final String $new_itm_nm = $new_itm_p + ".itm_nm";
	public static final String $new_ver_no = $new_ver_no_p + ".ver_no";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta cmn_flg_META = createCommonMeta($cmn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_flg_META = createCommonMeta($wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dt_META = createInnerRowMeta($dt, mcframe.clientMAUB.MAUBP0020.StEndDtR.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta chng_no_META = createCommonMeta($chng_no, mcframe.commonMA.meta.MA_META.CHNG_NO);
	public static final MCMeta ext_sys_no_bom_META = createCommonMeta($ext_sys_no_bom, mcframe.commonMA.meta.MA_META.EXT_SYS_NO_BOM);
	public static final MCMeta par_itm_typ_p_META = createInnerRowMeta($par_itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta chd_itm_typ_p_META = createInnerRowMeta($chd_itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta chd_itm_p_META = createInnerRowMeta($chd_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_grp_cd1_META = createCommonMeta($par_itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm1_META = createCommonMeta($par_itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd2_META = createCommonMeta($par_itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm2_META = createCommonMeta($par_itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd3_META = createCommonMeta($par_itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm3_META = createCommonMeta($par_itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd4_META = createCommonMeta($par_itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm4_META = createCommonMeta($par_itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd5_META = createCommonMeta($par_itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm5_META = createCommonMeta($par_itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd6_META = createCommonMeta($par_itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm6_META = createCommonMeta($par_itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd7_META = createCommonMeta($par_itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm7_META = createCommonMeta($par_itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd8_META = createCommonMeta($par_itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm8_META = createCommonMeta($par_itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd9_META = createCommonMeta($par_itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm9_META = createCommonMeta($par_itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta par_itm_grp_cd10_META = createCommonMeta($par_itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta par_itm_grp_nm10_META = createCommonMeta($par_itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd1_META = createCommonMeta($chd_itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm1_META = createCommonMeta($chd_itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd2_META = createCommonMeta($chd_itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm2_META = createCommonMeta($chd_itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd3_META = createCommonMeta($chd_itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm3_META = createCommonMeta($chd_itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd4_META = createCommonMeta($chd_itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm4_META = createCommonMeta($chd_itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd5_META = createCommonMeta($chd_itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm5_META = createCommonMeta($chd_itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd6_META = createCommonMeta($chd_itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm6_META = createCommonMeta($chd_itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd7_META = createCommonMeta($chd_itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm7_META = createCommonMeta($chd_itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd8_META = createCommonMeta($chd_itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm8_META = createCommonMeta($chd_itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd9_META = createCommonMeta($chd_itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm9_META = createCommonMeta($chd_itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta chd_itm_grp_cd10_META = createCommonMeta($chd_itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta chd_itm_grp_nm10_META = createCommonMeta($chd_itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta bom_chng_typ_META = createCommonMeta($bom_chng_typ, mcframe.commonMA.meta.MA_META.BOM_CHNG_TYP);
	public static final MCMeta bom_chng_typ_nm_META = createCommonMeta($bom_chng_typ_nm, mcframe.commonMA.meta.MA_META.BOM_CHNG_TYP_NM);
	public static final MCMeta chng_st_dt_META = createCommonMeta($chng_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta chng_end_dt_META = createCommonMeta($chng_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta chng_wg_cd_META = createCommonMeta($chng_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta chng_wg_nm_META = createCommonMeta($chng_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta old_itm_p_META = createInnerRowMeta($old_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta old_ver_no_p_META = createInnerRowMeta($old_ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta old_alt_itm_ratio_META = createCommonMeta($old_alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta old_alt_alloc_prio_META = createCommonMeta($old_alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta old_stk_mng_typ_META = createCommonMeta($old_stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta old_stk_mng_typ_nm_META = createCommonMeta($old_stk_mng_typ_nm, mcframe.commonMA.meta.MA_META.STK_MNG_TYP_NM);
	public static final MCMeta old_asset_mng_typ_META = createCommonMeta($old_asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta old_asset_mng_typ_nm_META = createCommonMeta($old_asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta old_alt_grp_cd_META = createCommonMeta($old_alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta old_alt_grp_nm_META = createCommonMeta($old_alt_grp_nm, mcframe.commonMA.meta.MA_META.ALT_GRP_NM);
	public static final MCMeta old_alt_itm_typ_META = createCommonMeta($old_alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta old_alt_itm_typ_nm_META = createCommonMeta($old_alt_itm_typ_nm, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP_NM);
	public static final MCMeta new_itm_p_META = createInnerRowMeta($new_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta new_ver_no_p_META = createInnerRowMeta($new_ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta new_alt_itm_ratio_META = createCommonMeta($new_alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta new_alt_alloc_prio_META = createCommonMeta($new_alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta new_stk_mng_typ_META = createCommonMeta($new_stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta new_stk_mng_typ_nm_META = createCommonMeta($new_stk_mng_typ_nm, mcframe.commonMA.meta.MA_META.STK_MNG_TYP_NM);
	public static final MCMeta new_asset_mng_typ_META = createCommonMeta($new_asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta new_asset_mng_typ_nm_META = createCommonMeta($new_asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta new_alt_grp_cd_META = createCommonMeta($new_alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta new_alt_grp_nm_META = createCommonMeta($new_alt_grp_nm, mcframe.commonMA.meta.MA_META.ALT_GRP_NM);
	public static final MCMeta new_alt_itm_typ_META = createCommonMeta($new_alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta new_alt_itm_typ_nm_META = createCommonMeta($new_alt_itm_typ_nm, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP_NM);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			cmn_flg_META,
			wg_flg_META,
			dt_META,
			wg_cd_META,
			wg_nm_META,
			chng_no_META,
			ext_sys_no_bom_META,
			par_itm_typ_p_META,
			par_itm_p_META,
			chd_itm_typ_p_META,
			chd_itm_p_META,
			ver_no_p_META,
			alt_grp_cd_META,
			oper_cd_META,
			oper_nm_META,
			bom_ptn_META,
			memo1_META,
			memo2_META,
			memo3_META,
			off_del_flg_META,
			on_del_flg_META,
			par_itm_grp_cd1_META,
			par_itm_grp_nm1_META,
			par_itm_grp_cd2_META,
			par_itm_grp_nm2_META,
			par_itm_grp_cd3_META,
			par_itm_grp_nm3_META,
			par_itm_grp_cd4_META,
			par_itm_grp_nm4_META,
			par_itm_grp_cd5_META,
			par_itm_grp_nm5_META,
			par_itm_grp_cd6_META,
			par_itm_grp_nm6_META,
			par_itm_grp_cd7_META,
			par_itm_grp_nm7_META,
			par_itm_grp_cd8_META,
			par_itm_grp_nm8_META,
			par_itm_grp_cd9_META,
			par_itm_grp_nm9_META,
			par_itm_grp_cd10_META,
			par_itm_grp_nm10_META,
			chd_itm_grp_cd1_META,
			chd_itm_grp_nm1_META,
			chd_itm_grp_cd2_META,
			chd_itm_grp_nm2_META,
			chd_itm_grp_cd3_META,
			chd_itm_grp_nm3_META,
			chd_itm_grp_cd4_META,
			chd_itm_grp_nm4_META,
			chd_itm_grp_cd5_META,
			chd_itm_grp_nm5_META,
			chd_itm_grp_cd6_META,
			chd_itm_grp_nm6_META,
			chd_itm_grp_cd7_META,
			chd_itm_grp_nm7_META,
			chd_itm_grp_cd8_META,
			chd_itm_grp_nm8_META,
			chd_itm_grp_cd9_META,
			chd_itm_grp_nm9_META,
			chd_itm_grp_cd10_META,
			chd_itm_grp_nm10_META,
			bom_chng_typ_META,
			bom_chng_typ_nm_META,
			chng_st_dt_META,
			chng_end_dt_META,
			chng_wg_cd_META,
			chng_wg_nm_META,
			old_itm_p_META,
			old_ver_no_p_META,
			old_alt_itm_ratio_META,
			old_alt_alloc_prio_META,
			old_stk_mng_typ_META,
			old_stk_mng_typ_nm_META,
			old_asset_mng_typ_META,
			old_asset_mng_typ_nm_META,
			old_alt_grp_cd_META,
			old_alt_grp_nm_META,
			old_alt_itm_typ_META,
			old_alt_itm_typ_nm_META,
			new_itm_p_META,
			new_ver_no_p_META,
			new_alt_itm_ratio_META,
			new_alt_alloc_prio_META,
			new_stk_mng_typ_META,
			new_stk_mng_typ_nm_META,
			new_asset_mng_typ_META,
			new_asset_mng_typ_nm_META,
			new_alt_grp_cd_META,
			new_alt_grp_nm_META,
			new_alt_itm_typ_META,
			new_alt_itm_typ_nm_META
		},
		new String[][]{
			{
				"st_dt_fr",
				"st_dt_to",
				"end_dt_fr",
				"end_dt_to",
				"par_itm_typ",
				"par_itm_typ_nm",
				"par_itm_typ_d_cd",
				"par_itm_typ_d_nm",
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm",
				"chd_itm_typ",
				"chd_itm_typ_nm",
				"chd_itm_typ_d_cd",
				"chd_itm_typ_d_nm",
				"chd_itm_cd",
				"chd_itm_sub1",
				"chd_itm_sub2",
				"chd_itm_sub3",
				"chd_itm_nm",
				"ver_no",
				"old_itm_cd",
				"old_itm_sub1",
				"old_itm_sub2",
				"old_itm_sub3",
				"old_itm_nm",
				"old_ver_no",
				"new_itm_cd",
				"new_itm_sub1",
				"new_itm_sub2",
				"new_itm_sub3",
				"new_itm_nm",
				"new_ver_no"
			},
			{
				$st_dt_fr,
				$st_dt_to,
				$end_dt_fr,
				$end_dt_to,
				$par_itm_typ,
				$par_itm_typ_nm,
				$par_itm_typ_d_cd,
				$par_itm_typ_d_nm,
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm,
				$chd_itm_typ,
				$chd_itm_typ_nm,
				$chd_itm_typ_d_cd,
				$chd_itm_typ_d_nm,
				$chd_itm_cd,
				$chd_itm_sub1,
				$chd_itm_sub2,
				$chd_itm_sub3,
				$chd_itm_nm,
				$ver_no,
				$old_itm_cd,
				$old_itm_sub1,
				$old_itm_sub2,
				$old_itm_sub3,
				$old_itm_nm,
				$old_ver_no,
				$new_itm_cd,
				$new_itm_sub1,
				$new_itm_sub2,
				$new_itm_sub3,
				$new_itm_nm,
				$new_ver_no
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$par_itm_grp_cd1, "itm_grp_nm"},	// par_itm_grp_cd1
				{$par_itm_grp_cd2, "itm_grp_nm"},	// par_itm_grp_cd2
				{$par_itm_grp_cd3, "itm_grp_nm"},	// par_itm_grp_cd3
				{$par_itm_grp_cd4, "itm_grp_nm"},	// par_itm_grp_cd4
				{$par_itm_grp_cd5, "itm_grp_nm"},	// par_itm_grp_cd5
				{$par_itm_grp_cd6, "itm_grp_nm"},	// par_itm_grp_cd6
				{$par_itm_grp_cd7, "itm_grp_nm"},	// par_itm_grp_cd7
				{$par_itm_grp_cd8, "itm_grp_nm"},	// par_itm_grp_cd8
				{$par_itm_grp_cd9, "itm_grp_nm"},	// par_itm_grp_cd9
				{$par_itm_grp_cd10, "itm_grp_nm"},	// par_itm_grp_cd10
				{$chd_itm_grp_cd1, "itm_grp_nm"},	// chd_itm_grp_cd1
				{$chd_itm_grp_cd2, "itm_grp_nm"},	// chd_itm_grp_cd2
				{$chd_itm_grp_cd3, "itm_grp_nm"},	// chd_itm_grp_cd3
				{$chd_itm_grp_cd4, "itm_grp_nm"},	// chd_itm_grp_cd4
				{$chd_itm_grp_cd5, "itm_grp_nm"},	// chd_itm_grp_cd5
				{$chd_itm_grp_cd6, "itm_grp_nm"},	// chd_itm_grp_cd6
				{$chd_itm_grp_cd7, "itm_grp_nm"},	// chd_itm_grp_cd7
				{$chd_itm_grp_cd8, "itm_grp_nm"},	// chd_itm_grp_cd8
				{$chd_itm_grp_cd9, "itm_grp_nm"},	// chd_itm_grp_cd9
				{$chd_itm_grp_cd10, "itm_grp_nm"},	// chd_itm_grp_cd10
				{$chng_wg_cd, "wg_nm"},	// chng_wg_cd
				{$old_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3;stk_mng_typ;stk_mng_typ_nm;asset_mng_typ;asset_mng_typ_nm"},	// old_itm_p.itm_cd
				{$old_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3;stk_mng_typ;stk_mng_typ_nm;asset_mng_typ;asset_mng_typ_nm"},	// old_itm_p.itm_sub1
				{$old_itm_p + ".itm_sub2", "itm_nm;itm_sub3;stk_mng_typ;stk_mng_typ_nm;asset_mng_typ;asset_mng_typ_nm"},	// old_itm_p.itm_sub2
				{$old_itm_p + ".itm_sub3", "itm_nm;stk_mng_typ;stk_mng_typ_nm;asset_mng_typ;asset_mng_typ_nm"},	// old_itm_p.itm_sub3
				{$old_alt_grp_cd, "alt_grp_nm;alt_itm_typ"},	// old_alt_grp_cd
				{$old_alt_itm_typ, "alt_itm_typ_nm"},	// old_alt_itm_typ
				{$new_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3;stk_mng_typ;stk_mng_typ_nm;asset_mng_typ;asset_mng_typ_nm"},	// new_itm_p.itm_cd
				{$new_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3;stk_mng_typ;stk_mng_typ_nm;asset_mng_typ;asset_mng_typ_nm"},	// new_itm_p.itm_sub1
				{$new_itm_p + ".itm_sub2", "itm_nm;itm_sub3;stk_mng_typ;stk_mng_typ_nm;asset_mng_typ;asset_mng_typ_nm"},	// new_itm_p.itm_sub2
				{$new_itm_p + ".itm_sub3", "itm_nm;stk_mng_typ;stk_mng_typ_nm;asset_mng_typ;asset_mng_typ_nm"},	// new_itm_p.itm_sub3
				{$new_alt_grp_cd, "alt_grp_nm;alt_itm_typ"},	// new_alt_grp_cd
				{$new_alt_itm_typ, "alt_itm_typ_nm"}	// new_alt_itm_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$par_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.PAR_ITM_BOM"},	// par_itm_p.itm_cd
				{$chd_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.COMM"},	// chd_itm_p.itm_cd
				{$ver_no_p + ".ver_no", "chd_itm_cd;chd_itm_sub1;chd_itm_sub2;chd_itm_sub3"},	// ver_no_p.ver_no
				{$chng_wg_cd, "true"},	// chng_wg_cd
				{$old_itm_p + ".itm_sub1", "old_itm_cd"},	// old_itm_p.itm_sub1
				{$old_itm_p + ".itm_sub2", "old_itm_cd;old_itm_sub1"},	// old_itm_p.itm_sub2
				{$old_itm_p + ".itm_sub3", "old_itm_cd;old_itm_sub1;old_itm_sub2"},	// old_itm_p.itm_sub3
				{$old_alt_grp_cd, "chng_wg_cd"},	// old_alt_grp_cd
				{$new_itm_p + ".itm_sub1", "new_itm_cd"},	// new_itm_p.itm_sub1
				{$new_itm_p + ".itm_sub2", "new_itm_cd;new_itm_sub1"},	// new_itm_p.itm_sub2
				{$new_itm_p + ".itm_sub3", "new_itm_cd;new_itm_sub1;new_itm_sub2"},	// new_itm_p.itm_sub3
				{$new_alt_grp_cd, "chng_wg_cd"}	// new_alt_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$par_itm_p + ".itm_cd", "itm_is_srch_typ"},	// par_itm_p.itm_cd
				{$chd_itm_p + ".itm_cd", "itm_is_srch_typ"},	// chd_itm_p.itm_cd
				{$ver_no_p + ".ver_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// ver_no_p.ver_no
				{$chng_wg_cd, "wr_flg"},	// chng_wg_cd
				{$old_itm_p + ".itm_sub1", "itm_cd"},	// old_itm_p.itm_sub1
				{$old_itm_p + ".itm_sub2", "itm_cd;itm_sub1"},	// old_itm_p.itm_sub2
				{$old_itm_p + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2"},	// old_itm_p.itm_sub3
				{$old_alt_grp_cd, "wg_cd"},	// old_alt_grp_cd
				{$new_itm_p + ".itm_sub1", "itm_cd"},	// new_itm_p.itm_sub1
				{$new_itm_p + ".itm_sub2", "itm_cd;itm_sub1"},	// new_itm_p.itm_sub2
				{$new_itm_p + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2"},	// new_itm_p.itm_sub3
				{$new_alt_grp_cd, "wg_cd"}	// new_alt_grp_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$chng_wg_cd, "WG"},	// chng_wg_cd
				{$chng_wg_nm, "WG"}	// chng_wg_nm
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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;CHNG,Change,5;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;CHNG,切り替える,5;REF,参照する,3.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;CHNG,Change,5;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;CHNG,切り替える,5;REF,参照する,3.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Common 共通.<p>
	 *
	 */
	public boolean cmn_flg() {
		return getConstBoolean(offset + 1, $cmn_flg);
	}

	/**
	 * Common 共通.<p>
	 *
	 */
	public void cmn_flg(boolean value) {
		setConstBoolean(offset + 1, $cmn_flg, value);
	}


	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public boolean wg_flg() {
		return getConstBoolean(offset + 2, $wg_flg);
	}

	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public void wg_flg(boolean value) {
		setConstBoolean(offset + 2, $wg_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0020.StEndDtR dt(){
		return (mcframe.clientMAUB.MAUBP0020.StEndDtR) getConstInnerRow(offset + 3, $dt);
	}
	
	public void dt(mcframe.clientMAUB.MAUBP0020.StEndDtR row){
		setConstInnerRow(offset + 3, $dt, row);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 4, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 4, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 5, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 5, $wg_nm, value);
	}


	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public String chng_no() {
		return getConstString(offset + 6, $chng_no);
	}

	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public void chng_no(String value) {
		setConstString(offset + 6, $chng_no, value);
	}


	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public String ext_sys_no_bom() {
		return getConstString(offset + 7, $ext_sys_no_bom);
	}

	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public void ext_sys_no_bom(String value) {
		setConstString(offset + 7, $ext_sys_no_bom, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR par_itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 8, $par_itm_typ_p);
	}
	
	public void par_itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 8, $par_itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 9, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 9, $par_itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR chd_itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 10, $chd_itm_typ_p);
	}
	
	public void chd_itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 10, $chd_itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR chd_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 11, $chd_itm_p);
	}
	
	public void chd_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 11, $chd_itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 12, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 12, $ver_no_p, row);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 13, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 13, $alt_grp_cd, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 14, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 14, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 15, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 15, $oper_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 16, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 16, $bom_ptn, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 17, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 17, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 18, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 18, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 19, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 19, $memo3, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 20, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 20, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 21, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 21, $on_del_flg, value);
	}


	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public String par_itm_grp_cd1() {
		return getConstString(offset + 22, $par_itm_grp_cd1);
	}

	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public void par_itm_grp_cd1(String value) {
		setConstString(offset + 22, $par_itm_grp_cd1, value);
	}


	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public String par_itm_grp_nm1() {
		return getConstString(offset + 23, $par_itm_grp_nm1);
	}

	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public void par_itm_grp_nm1(String value) {
		setConstString(offset + 23, $par_itm_grp_nm1, value);
	}


	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public String par_itm_grp_cd2() {
		return getConstString(offset + 24, $par_itm_grp_cd2);
	}

	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public void par_itm_grp_cd2(String value) {
		setConstString(offset + 24, $par_itm_grp_cd2, value);
	}


	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public String par_itm_grp_nm2() {
		return getConstString(offset + 25, $par_itm_grp_nm2);
	}

	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public void par_itm_grp_nm2(String value) {
		setConstString(offset + 25, $par_itm_grp_nm2, value);
	}


	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public String par_itm_grp_cd3() {
		return getConstString(offset + 26, $par_itm_grp_cd3);
	}

	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public void par_itm_grp_cd3(String value) {
		setConstString(offset + 26, $par_itm_grp_cd3, value);
	}


	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public String par_itm_grp_nm3() {
		return getConstString(offset + 27, $par_itm_grp_nm3);
	}

	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public void par_itm_grp_nm3(String value) {
		setConstString(offset + 27, $par_itm_grp_nm3, value);
	}


	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public String par_itm_grp_cd4() {
		return getConstString(offset + 28, $par_itm_grp_cd4);
	}

	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public void par_itm_grp_cd4(String value) {
		setConstString(offset + 28, $par_itm_grp_cd4, value);
	}


	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public String par_itm_grp_nm4() {
		return getConstString(offset + 29, $par_itm_grp_nm4);
	}

	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public void par_itm_grp_nm4(String value) {
		setConstString(offset + 29, $par_itm_grp_nm4, value);
	}


	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public String par_itm_grp_cd5() {
		return getConstString(offset + 30, $par_itm_grp_cd5);
	}

	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public void par_itm_grp_cd5(String value) {
		setConstString(offset + 30, $par_itm_grp_cd5, value);
	}


	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public String par_itm_grp_nm5() {
		return getConstString(offset + 31, $par_itm_grp_nm5);
	}

	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public void par_itm_grp_nm5(String value) {
		setConstString(offset + 31, $par_itm_grp_nm5, value);
	}


	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public String par_itm_grp_cd6() {
		return getConstString(offset + 32, $par_itm_grp_cd6);
	}

	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public void par_itm_grp_cd6(String value) {
		setConstString(offset + 32, $par_itm_grp_cd6, value);
	}


	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public String par_itm_grp_nm6() {
		return getConstString(offset + 33, $par_itm_grp_nm6);
	}

	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public void par_itm_grp_nm6(String value) {
		setConstString(offset + 33, $par_itm_grp_nm6, value);
	}


	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public String par_itm_grp_cd7() {
		return getConstString(offset + 34, $par_itm_grp_cd7);
	}

	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public void par_itm_grp_cd7(String value) {
		setConstString(offset + 34, $par_itm_grp_cd7, value);
	}


	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public String par_itm_grp_nm7() {
		return getConstString(offset + 35, $par_itm_grp_nm7);
	}

	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public void par_itm_grp_nm7(String value) {
		setConstString(offset + 35, $par_itm_grp_nm7, value);
	}


	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public String par_itm_grp_cd8() {
		return getConstString(offset + 36, $par_itm_grp_cd8);
	}

	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public void par_itm_grp_cd8(String value) {
		setConstString(offset + 36, $par_itm_grp_cd8, value);
	}


	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public String par_itm_grp_nm8() {
		return getConstString(offset + 37, $par_itm_grp_nm8);
	}

	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public void par_itm_grp_nm8(String value) {
		setConstString(offset + 37, $par_itm_grp_nm8, value);
	}


	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public String par_itm_grp_cd9() {
		return getConstString(offset + 38, $par_itm_grp_cd9);
	}

	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public void par_itm_grp_cd9(String value) {
		setConstString(offset + 38, $par_itm_grp_cd9, value);
	}


	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public String par_itm_grp_nm9() {
		return getConstString(offset + 39, $par_itm_grp_nm9);
	}

	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public void par_itm_grp_nm9(String value) {
		setConstString(offset + 39, $par_itm_grp_nm9, value);
	}


	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public String par_itm_grp_cd10() {
		return getConstString(offset + 40, $par_itm_grp_cd10);
	}

	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public void par_itm_grp_cd10(String value) {
		setConstString(offset + 40, $par_itm_grp_cd10, value);
	}


	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public String par_itm_grp_nm10() {
		return getConstString(offset + 41, $par_itm_grp_nm10);
	}

	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public void par_itm_grp_nm10(String value) {
		setConstString(offset + 41, $par_itm_grp_nm10, value);
	}


	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public String chd_itm_grp_cd1() {
		return getConstString(offset + 42, $chd_itm_grp_cd1);
	}

	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public void chd_itm_grp_cd1(String value) {
		setConstString(offset + 42, $chd_itm_grp_cd1, value);
	}


	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public String chd_itm_grp_nm1() {
		return getConstString(offset + 43, $chd_itm_grp_nm1);
	}

	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public void chd_itm_grp_nm1(String value) {
		setConstString(offset + 43, $chd_itm_grp_nm1, value);
	}


	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public String chd_itm_grp_cd2() {
		return getConstString(offset + 44, $chd_itm_grp_cd2);
	}

	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public void chd_itm_grp_cd2(String value) {
		setConstString(offset + 44, $chd_itm_grp_cd2, value);
	}


	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public String chd_itm_grp_nm2() {
		return getConstString(offset + 45, $chd_itm_grp_nm2);
	}

	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public void chd_itm_grp_nm2(String value) {
		setConstString(offset + 45, $chd_itm_grp_nm2, value);
	}


	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public String chd_itm_grp_cd3() {
		return getConstString(offset + 46, $chd_itm_grp_cd3);
	}

	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public void chd_itm_grp_cd3(String value) {
		setConstString(offset + 46, $chd_itm_grp_cd3, value);
	}


	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public String chd_itm_grp_nm3() {
		return getConstString(offset + 47, $chd_itm_grp_nm3);
	}

	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public void chd_itm_grp_nm3(String value) {
		setConstString(offset + 47, $chd_itm_grp_nm3, value);
	}


	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public String chd_itm_grp_cd4() {
		return getConstString(offset + 48, $chd_itm_grp_cd4);
	}

	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public void chd_itm_grp_cd4(String value) {
		setConstString(offset + 48, $chd_itm_grp_cd4, value);
	}


	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public String chd_itm_grp_nm4() {
		return getConstString(offset + 49, $chd_itm_grp_nm4);
	}

	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public void chd_itm_grp_nm4(String value) {
		setConstString(offset + 49, $chd_itm_grp_nm4, value);
	}


	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public String chd_itm_grp_cd5() {
		return getConstString(offset + 50, $chd_itm_grp_cd5);
	}

	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public void chd_itm_grp_cd5(String value) {
		setConstString(offset + 50, $chd_itm_grp_cd5, value);
	}


	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public String chd_itm_grp_nm5() {
		return getConstString(offset + 51, $chd_itm_grp_nm5);
	}

	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public void chd_itm_grp_nm5(String value) {
		setConstString(offset + 51, $chd_itm_grp_nm5, value);
	}


	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public String chd_itm_grp_cd6() {
		return getConstString(offset + 52, $chd_itm_grp_cd6);
	}

	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public void chd_itm_grp_cd6(String value) {
		setConstString(offset + 52, $chd_itm_grp_cd6, value);
	}


	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public String chd_itm_grp_nm6() {
		return getConstString(offset + 53, $chd_itm_grp_nm6);
	}

	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public void chd_itm_grp_nm6(String value) {
		setConstString(offset + 53, $chd_itm_grp_nm6, value);
	}


	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public String chd_itm_grp_cd7() {
		return getConstString(offset + 54, $chd_itm_grp_cd7);
	}

	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public void chd_itm_grp_cd7(String value) {
		setConstString(offset + 54, $chd_itm_grp_cd7, value);
	}


	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public String chd_itm_grp_nm7() {
		return getConstString(offset + 55, $chd_itm_grp_nm7);
	}

	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public void chd_itm_grp_nm7(String value) {
		setConstString(offset + 55, $chd_itm_grp_nm7, value);
	}


	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public String chd_itm_grp_cd8() {
		return getConstString(offset + 56, $chd_itm_grp_cd8);
	}

	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public void chd_itm_grp_cd8(String value) {
		setConstString(offset + 56, $chd_itm_grp_cd8, value);
	}


	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public String chd_itm_grp_nm8() {
		return getConstString(offset + 57, $chd_itm_grp_nm8);
	}

	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public void chd_itm_grp_nm8(String value) {
		setConstString(offset + 57, $chd_itm_grp_nm8, value);
	}


	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public String chd_itm_grp_cd9() {
		return getConstString(offset + 58, $chd_itm_grp_cd9);
	}

	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public void chd_itm_grp_cd9(String value) {
		setConstString(offset + 58, $chd_itm_grp_cd9, value);
	}


	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public String chd_itm_grp_nm9() {
		return getConstString(offset + 59, $chd_itm_grp_nm9);
	}

	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public void chd_itm_grp_nm9(String value) {
		setConstString(offset + 59, $chd_itm_grp_nm9, value);
	}


	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public String chd_itm_grp_cd10() {
		return getConstString(offset + 60, $chd_itm_grp_cd10);
	}

	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public void chd_itm_grp_cd10(String value) {
		setConstString(offset + 60, $chd_itm_grp_cd10, value);
	}


	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public String chd_itm_grp_nm10() {
		return getConstString(offset + 61, $chd_itm_grp_nm10);
	}

	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public void chd_itm_grp_nm10(String value) {
		setConstString(offset + 61, $chd_itm_grp_nm10, value);
	}


	/**
	 * BOM switching type ＢＯＭ切替区分.<p>
	 *
	 */
	public String bom_chng_typ() {
		return getConstString(offset + 62, $bom_chng_typ);
	}

	/**
	 * BOM switching type ＢＯＭ切替区分.<p>
	 *
	 */
	public void bom_chng_typ(String value) {
		setConstString(offset + 62, $bom_chng_typ, value);
	}


	/**
	 * BOM switching type name ＢＯＭ切替区分名.<p>
	 *
	 */
	public String bom_chng_typ_nm() {
		return getConstString(offset + 63, $bom_chng_typ_nm);
	}

	/**
	 * BOM switching type name ＢＯＭ切替区分名.<p>
	 *
	 */
	public void bom_chng_typ_nm(String value) {
		setConstString(offset + 63, $bom_chng_typ_nm, value);
	}


	/**
	 * Change start date 切替開始日.<p>
	 *
	 */
	public MCDate chng_st_dt() {
		return getConstDate(offset + 64, $chng_st_dt);
	}

	/**
	 * Change start date 切替開始日.<p>
	 *
	 */
	public void chng_st_dt(MCDate value) {
		setConstDate(offset + 64, $chng_st_dt, value);
	}


	/**
	 * End date after change 切替後終了日.<p>
	 *
	 */
	public MCDate chng_end_dt() {
		return getConstDate(offset + 65, $chng_end_dt);
	}

	/**
	 * End date after change 切替後終了日.<p>
	 *
	 */
	public void chng_end_dt(MCDate value) {
		setConstDate(offset + 65, $chng_end_dt, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String chng_wg_cd() {
		return getConstString(offset + 66, $chng_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void chng_wg_cd(String value) {
		setConstString(offset + 66, $chng_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String chng_wg_nm() {
		return getConstString(offset + 67, $chng_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void chng_wg_nm(String value) {
		setConstString(offset + 67, $chng_wg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR old_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 68, $old_itm_p);
	}
	
	public void old_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 68, $old_itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR old_ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 69, $old_ver_no_p);
	}
	
	public void old_ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 69, $old_ver_no_p, row);
	}


	/**
	 * Old alternative item ratio 旧代替品目比率.<p>
	 *
	 */
	public MCNumber old_alt_itm_ratio() {
		return getConstNumber(offset + 70, $old_alt_itm_ratio);
	}

	/**
	 * Old alternative item ratio 旧代替品目比率.<p>
	 *
	 */
	public void old_alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 70, $old_alt_itm_ratio, value);
	}

	/**
	 * Old alternative item ratio 旧代替品目比率.<p>
	 *
	 */
	public void old_alt_itm_ratio(int value) {
		setConstNumber(offset + 70, $old_alt_itm_ratio, value);
	}

	/**
	 * Old alternative item ratio 旧代替品目比率.<p>
	 *
	 */
	public void old_alt_itm_ratio(long value) {
		setConstNumber(offset + 70, $old_alt_itm_ratio, value);
	}

	/**
	 * Old alternative item ratio 旧代替品目比率.<p>
	 *
	 */
	public void old_alt_itm_ratio(float value) {
		setConstNumber(offset + 70, $old_alt_itm_ratio, value);
	}

	/**
	 * Old alternative item ratio 旧代替品目比率.<p>
	 *
	 */
	public void old_alt_itm_ratio(double value) {
		setConstNumber(offset + 70, $old_alt_itm_ratio, value);
	}


	/**
	 * Old allocation priority 旧引当優先順.<p>
	 *
	 */
	public MCNumber old_alt_alloc_prio() {
		return getConstNumber(offset + 71, $old_alt_alloc_prio);
	}

	/**
	 * Old allocation priority 旧引当優先順.<p>
	 *
	 */
	public void old_alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 71, $old_alt_alloc_prio, value);
	}

	/**
	 * Old allocation priority 旧引当優先順.<p>
	 *
	 */
	public void old_alt_alloc_prio(int value) {
		setConstNumber(offset + 71, $old_alt_alloc_prio, value);
	}

	/**
	 * Old allocation priority 旧引当優先順.<p>
	 *
	 */
	public void old_alt_alloc_prio(long value) {
		setConstNumber(offset + 71, $old_alt_alloc_prio, value);
	}

	/**
	 * Old allocation priority 旧引当優先順.<p>
	 *
	 */
	public void old_alt_alloc_prio(float value) {
		setConstNumber(offset + 71, $old_alt_alloc_prio, value);
	}

	/**
	 * Old allocation priority 旧引当優先順.<p>
	 *
	 */
	public void old_alt_alloc_prio(double value) {
		setConstNumber(offset + 71, $old_alt_alloc_prio, value);
	}


	/**
	 * Old inventory management type 旧在庫管理区分.<p>
	 *
	 */
	public String old_stk_mng_typ() {
		return getConstString(offset + 72, $old_stk_mng_typ);
	}

	/**
	 * Old inventory management type 旧在庫管理区分.<p>
	 *
	 */
	public void old_stk_mng_typ(String value) {
		setConstString(offset + 72, $old_stk_mng_typ, value);
	}


	/**
	 * Old inventory management type name 旧在庫管理区分名.<p>
	 *
	 */
	public String old_stk_mng_typ_nm() {
		return getConstString(offset + 73, $old_stk_mng_typ_nm);
	}

	/**
	 * Old inventory management type name 旧在庫管理区分名.<p>
	 *
	 */
	public void old_stk_mng_typ_nm(String value) {
		setConstString(offset + 73, $old_stk_mng_typ_nm, value);
	}


	/**
	 * Old asset management type 旧資産管理区分.<p>
	 *
	 */
	public String old_asset_mng_typ() {
		return getConstString(offset + 74, $old_asset_mng_typ);
	}

	/**
	 * Old asset management type 旧資産管理区分.<p>
	 *
	 */
	public void old_asset_mng_typ(String value) {
		setConstString(offset + 74, $old_asset_mng_typ, value);
	}


	/**
	 * Old asset management type name 旧資産管理区分名.<p>
	 *
	 */
	public String old_asset_mng_typ_nm() {
		return getConstString(offset + 75, $old_asset_mng_typ_nm);
	}

	/**
	 * Old asset management type name 旧資産管理区分名.<p>
	 *
	 */
	public void old_asset_mng_typ_nm(String value) {
		setConstString(offset + 75, $old_asset_mng_typ_nm, value);
	}


	/**
	 * Old alternative group cd. 旧代替グループＣＤ.<p>
	 *
	 */
	public String old_alt_grp_cd() {
		return getConstString(offset + 76, $old_alt_grp_cd);
	}

	/**
	 * Old alternative group cd. 旧代替グループＣＤ.<p>
	 *
	 */
	public void old_alt_grp_cd(String value) {
		setConstString(offset + 76, $old_alt_grp_cd, value);
	}


	/**
	 * Old alternative group name 旧代替グループ名.<p>
	 *
	 */
	public String old_alt_grp_nm() {
		return getConstString(offset + 77, $old_alt_grp_nm);
	}

	/**
	 * Old alternative group name 旧代替グループ名.<p>
	 *
	 */
	public void old_alt_grp_nm(String value) {
		setConstString(offset + 77, $old_alt_grp_nm, value);
	}


	/**
	 * Old alternative item selection type 旧代替品目選択区分.<p>
	 *
	 */
	public String old_alt_itm_typ() {
		return getConstString(offset + 78, $old_alt_itm_typ);
	}

	/**
	 * Old alternative item selection type 旧代替品目選択区分.<p>
	 *
	 */
	public void old_alt_itm_typ(String value) {
		setConstString(offset + 78, $old_alt_itm_typ, value);
	}


	/**
	 * Old alternative item selection type name 旧代替品目選択区分名.<p>
	 *
	 */
	public String old_alt_itm_typ_nm() {
		return getConstString(offset + 79, $old_alt_itm_typ_nm);
	}

	/**
	 * Old alternative item selection type name 旧代替品目選択区分名.<p>
	 *
	 */
	public void old_alt_itm_typ_nm(String value) {
		setConstString(offset + 79, $old_alt_itm_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR new_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 80, $new_itm_p);
	}
	
	public void new_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 80, $new_itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR new_ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 81, $new_ver_no_p);
	}
	
	public void new_ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 81, $new_ver_no_p, row);
	}


	/**
	 * New alternative item ratio 新代替品目比率.<p>
	 *
	 */
	public MCNumber new_alt_itm_ratio() {
		return getConstNumber(offset + 82, $new_alt_itm_ratio);
	}

	/**
	 * New alternative item ratio 新代替品目比率.<p>
	 *
	 */
	public void new_alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 82, $new_alt_itm_ratio, value);
	}

	/**
	 * New alternative item ratio 新代替品目比率.<p>
	 *
	 */
	public void new_alt_itm_ratio(int value) {
		setConstNumber(offset + 82, $new_alt_itm_ratio, value);
	}

	/**
	 * New alternative item ratio 新代替品目比率.<p>
	 *
	 */
	public void new_alt_itm_ratio(long value) {
		setConstNumber(offset + 82, $new_alt_itm_ratio, value);
	}

	/**
	 * New alternative item ratio 新代替品目比率.<p>
	 *
	 */
	public void new_alt_itm_ratio(float value) {
		setConstNumber(offset + 82, $new_alt_itm_ratio, value);
	}

	/**
	 * New alternative item ratio 新代替品目比率.<p>
	 *
	 */
	public void new_alt_itm_ratio(double value) {
		setConstNumber(offset + 82, $new_alt_itm_ratio, value);
	}


	/**
	 * New allocation priority 新引当優先順.<p>
	 *
	 */
	public MCNumber new_alt_alloc_prio() {
		return getConstNumber(offset + 83, $new_alt_alloc_prio);
	}

	/**
	 * New allocation priority 新引当優先順.<p>
	 *
	 */
	public void new_alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 83, $new_alt_alloc_prio, value);
	}

	/**
	 * New allocation priority 新引当優先順.<p>
	 *
	 */
	public void new_alt_alloc_prio(int value) {
		setConstNumber(offset + 83, $new_alt_alloc_prio, value);
	}

	/**
	 * New allocation priority 新引当優先順.<p>
	 *
	 */
	public void new_alt_alloc_prio(long value) {
		setConstNumber(offset + 83, $new_alt_alloc_prio, value);
	}

	/**
	 * New allocation priority 新引当優先順.<p>
	 *
	 */
	public void new_alt_alloc_prio(float value) {
		setConstNumber(offset + 83, $new_alt_alloc_prio, value);
	}

	/**
	 * New allocation priority 新引当優先順.<p>
	 *
	 */
	public void new_alt_alloc_prio(double value) {
		setConstNumber(offset + 83, $new_alt_alloc_prio, value);
	}


	/**
	 * New inventory management type 新在庫管理区分.<p>
	 *
	 */
	public String new_stk_mng_typ() {
		return getConstString(offset + 84, $new_stk_mng_typ);
	}

	/**
	 * New inventory management type 新在庫管理区分.<p>
	 *
	 */
	public void new_stk_mng_typ(String value) {
		setConstString(offset + 84, $new_stk_mng_typ, value);
	}


	/**
	 * New inventory management type name 新在庫管理区分名.<p>
	 *
	 */
	public String new_stk_mng_typ_nm() {
		return getConstString(offset + 85, $new_stk_mng_typ_nm);
	}

	/**
	 * New inventory management type name 新在庫管理区分名.<p>
	 *
	 */
	public void new_stk_mng_typ_nm(String value) {
		setConstString(offset + 85, $new_stk_mng_typ_nm, value);
	}


	/**
	 * New asset management type 新資産管理区分.<p>
	 *
	 */
	public String new_asset_mng_typ() {
		return getConstString(offset + 86, $new_asset_mng_typ);
	}

	/**
	 * New asset management type 新資産管理区分.<p>
	 *
	 */
	public void new_asset_mng_typ(String value) {
		setConstString(offset + 86, $new_asset_mng_typ, value);
	}


	/**
	 * New asset management type name 新資産管理区分名.<p>
	 *
	 */
	public String new_asset_mng_typ_nm() {
		return getConstString(offset + 87, $new_asset_mng_typ_nm);
	}

	/**
	 * New asset management type name 新資産管理区分名.<p>
	 *
	 */
	public void new_asset_mng_typ_nm(String value) {
		setConstString(offset + 87, $new_asset_mng_typ_nm, value);
	}


	/**
	 * New alternative group cd. 新代替グループＣＤ.<p>
	 *
	 */
	public String new_alt_grp_cd() {
		return getConstString(offset + 88, $new_alt_grp_cd);
	}

	/**
	 * New alternative group cd. 新代替グループＣＤ.<p>
	 *
	 */
	public void new_alt_grp_cd(String value) {
		setConstString(offset + 88, $new_alt_grp_cd, value);
	}


	/**
	 * New alternative group name 新代替グループ名.<p>
	 *
	 */
	public String new_alt_grp_nm() {
		return getConstString(offset + 89, $new_alt_grp_nm);
	}

	/**
	 * New alternative group name 新代替グループ名.<p>
	 *
	 */
	public void new_alt_grp_nm(String value) {
		setConstString(offset + 89, $new_alt_grp_nm, value);
	}


	/**
	 * New alternative item selection type 新代替品目選択区分.<p>
	 *
	 */
	public String new_alt_itm_typ() {
		return getConstString(offset + 90, $new_alt_itm_typ);
	}

	/**
	 * New alternative item selection type 新代替品目選択区分.<p>
	 *
	 */
	public void new_alt_itm_typ(String value) {
		setConstString(offset + 90, $new_alt_itm_typ, value);
	}


	/**
	 * New alternative item selection type name 新代替品目選択区分名.<p>
	 *
	 */
	public String new_alt_itm_typ_nm() {
		return getConstString(offset + 91, $new_alt_itm_typ_nm);
	}

	/**
	 * New alternative item selection type name 新代替品目選択区分名.<p>
	 *
	 */
	public void new_alt_itm_typ_nm(String value) {
		setConstString(offset + 91, $new_alt_itm_typ_nm, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			return ext_sys_no_bom();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($par_itm_grp_cd1.equalsIgnoreCase(name)) {
			return par_itm_grp_cd1();
		}
		if ($par_itm_grp_nm1.equalsIgnoreCase(name)) {
			return par_itm_grp_nm1();
		}
		if ($par_itm_grp_cd2.equalsIgnoreCase(name)) {
			return par_itm_grp_cd2();
		}
		if ($par_itm_grp_nm2.equalsIgnoreCase(name)) {
			return par_itm_grp_nm2();
		}
		if ($par_itm_grp_cd3.equalsIgnoreCase(name)) {
			return par_itm_grp_cd3();
		}
		if ($par_itm_grp_nm3.equalsIgnoreCase(name)) {
			return par_itm_grp_nm3();
		}
		if ($par_itm_grp_cd4.equalsIgnoreCase(name)) {
			return par_itm_grp_cd4();
		}
		if ($par_itm_grp_nm4.equalsIgnoreCase(name)) {
			return par_itm_grp_nm4();
		}
		if ($par_itm_grp_cd5.equalsIgnoreCase(name)) {
			return par_itm_grp_cd5();
		}
		if ($par_itm_grp_nm5.equalsIgnoreCase(name)) {
			return par_itm_grp_nm5();
		}
		if ($par_itm_grp_cd6.equalsIgnoreCase(name)) {
			return par_itm_grp_cd6();
		}
		if ($par_itm_grp_nm6.equalsIgnoreCase(name)) {
			return par_itm_grp_nm6();
		}
		if ($par_itm_grp_cd7.equalsIgnoreCase(name)) {
			return par_itm_grp_cd7();
		}
		if ($par_itm_grp_nm7.equalsIgnoreCase(name)) {
			return par_itm_grp_nm7();
		}
		if ($par_itm_grp_cd8.equalsIgnoreCase(name)) {
			return par_itm_grp_cd8();
		}
		if ($par_itm_grp_nm8.equalsIgnoreCase(name)) {
			return par_itm_grp_nm8();
		}
		if ($par_itm_grp_cd9.equalsIgnoreCase(name)) {
			return par_itm_grp_cd9();
		}
		if ($par_itm_grp_nm9.equalsIgnoreCase(name)) {
			return par_itm_grp_nm9();
		}
		if ($par_itm_grp_cd10.equalsIgnoreCase(name)) {
			return par_itm_grp_cd10();
		}
		if ($par_itm_grp_nm10.equalsIgnoreCase(name)) {
			return par_itm_grp_nm10();
		}
		if ($chd_itm_grp_cd1.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd1();
		}
		if ($chd_itm_grp_nm1.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm1();
		}
		if ($chd_itm_grp_cd2.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd2();
		}
		if ($chd_itm_grp_nm2.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm2();
		}
		if ($chd_itm_grp_cd3.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd3();
		}
		if ($chd_itm_grp_nm3.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm3();
		}
		if ($chd_itm_grp_cd4.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd4();
		}
		if ($chd_itm_grp_nm4.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm4();
		}
		if ($chd_itm_grp_cd5.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd5();
		}
		if ($chd_itm_grp_nm5.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm5();
		}
		if ($chd_itm_grp_cd6.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd6();
		}
		if ($chd_itm_grp_nm6.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm6();
		}
		if ($chd_itm_grp_cd7.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd7();
		}
		if ($chd_itm_grp_nm7.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm7();
		}
		if ($chd_itm_grp_cd8.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd8();
		}
		if ($chd_itm_grp_nm8.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm8();
		}
		if ($chd_itm_grp_cd9.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd9();
		}
		if ($chd_itm_grp_nm9.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm9();
		}
		if ($chd_itm_grp_cd10.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd10();
		}
		if ($chd_itm_grp_nm10.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm10();
		}
		if ($bom_chng_typ.equalsIgnoreCase(name)) {
			return bom_chng_typ();
		}
		if ($bom_chng_typ_nm.equalsIgnoreCase(name)) {
			return bom_chng_typ_nm();
		}
		if ($chng_wg_cd.equalsIgnoreCase(name)) {
			return chng_wg_cd();
		}
		if ($chng_wg_nm.equalsIgnoreCase(name)) {
			return chng_wg_nm();
		}
		if ($old_stk_mng_typ.equalsIgnoreCase(name)) {
			return old_stk_mng_typ();
		}
		if ($old_stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return old_stk_mng_typ_nm();
		}
		if ($old_asset_mng_typ.equalsIgnoreCase(name)) {
			return old_asset_mng_typ();
		}
		if ($old_asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return old_asset_mng_typ_nm();
		}
		if ($old_alt_grp_cd.equalsIgnoreCase(name)) {
			return old_alt_grp_cd();
		}
		if ($old_alt_grp_nm.equalsIgnoreCase(name)) {
			return old_alt_grp_nm();
		}
		if ($old_alt_itm_typ.equalsIgnoreCase(name)) {
			return old_alt_itm_typ();
		}
		if ($old_alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return old_alt_itm_typ_nm();
		}
		if ($new_stk_mng_typ.equalsIgnoreCase(name)) {
			return new_stk_mng_typ();
		}
		if ($new_stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return new_stk_mng_typ_nm();
		}
		if ($new_asset_mng_typ.equalsIgnoreCase(name)) {
			return new_asset_mng_typ();
		}
		if ($new_asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return new_asset_mng_typ_nm();
		}
		if ($new_alt_grp_cd.equalsIgnoreCase(name)) {
			return new_alt_grp_cd();
		}
		if ($new_alt_grp_nm.equalsIgnoreCase(name)) {
			return new_alt_grp_nm();
		}
		if ($new_alt_itm_typ.equalsIgnoreCase(name)) {
			return new_alt_itm_typ();
		}
		if ($new_alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return new_alt_itm_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($old_alt_itm_ratio.equalsIgnoreCase(name)) {
			return old_alt_itm_ratio();
		}
		if ($old_alt_alloc_prio.equalsIgnoreCase(name)) {
			return old_alt_alloc_prio();
		}
		if ($new_alt_itm_ratio.equalsIgnoreCase(name)) {
			return new_alt_itm_ratio();
		}
		if ($new_alt_alloc_prio.equalsIgnoreCase(name)) {
			return new_alt_alloc_prio();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($chng_st_dt.equalsIgnoreCase(name)) {
			return chng_st_dt();
		}
		if ($chng_end_dt.equalsIgnoreCase(name)) {
			return chng_end_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($cmn_flg.equalsIgnoreCase(name)) {
			return cmn_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			return ext_sys_no_bom();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($par_itm_grp_cd1.equalsIgnoreCase(name)) {
			return par_itm_grp_cd1();
		}
		if ($par_itm_grp_nm1.equalsIgnoreCase(name)) {
			return par_itm_grp_nm1();
		}
		if ($par_itm_grp_cd2.equalsIgnoreCase(name)) {
			return par_itm_grp_cd2();
		}
		if ($par_itm_grp_nm2.equalsIgnoreCase(name)) {
			return par_itm_grp_nm2();
		}
		if ($par_itm_grp_cd3.equalsIgnoreCase(name)) {
			return par_itm_grp_cd3();
		}
		if ($par_itm_grp_nm3.equalsIgnoreCase(name)) {
			return par_itm_grp_nm3();
		}
		if ($par_itm_grp_cd4.equalsIgnoreCase(name)) {
			return par_itm_grp_cd4();
		}
		if ($par_itm_grp_nm4.equalsIgnoreCase(name)) {
			return par_itm_grp_nm4();
		}
		if ($par_itm_grp_cd5.equalsIgnoreCase(name)) {
			return par_itm_grp_cd5();
		}
		if ($par_itm_grp_nm5.equalsIgnoreCase(name)) {
			return par_itm_grp_nm5();
		}
		if ($par_itm_grp_cd6.equalsIgnoreCase(name)) {
			return par_itm_grp_cd6();
		}
		if ($par_itm_grp_nm6.equalsIgnoreCase(name)) {
			return par_itm_grp_nm6();
		}
		if ($par_itm_grp_cd7.equalsIgnoreCase(name)) {
			return par_itm_grp_cd7();
		}
		if ($par_itm_grp_nm7.equalsIgnoreCase(name)) {
			return par_itm_grp_nm7();
		}
		if ($par_itm_grp_cd8.equalsIgnoreCase(name)) {
			return par_itm_grp_cd8();
		}
		if ($par_itm_grp_nm8.equalsIgnoreCase(name)) {
			return par_itm_grp_nm8();
		}
		if ($par_itm_grp_cd9.equalsIgnoreCase(name)) {
			return par_itm_grp_cd9();
		}
		if ($par_itm_grp_nm9.equalsIgnoreCase(name)) {
			return par_itm_grp_nm9();
		}
		if ($par_itm_grp_cd10.equalsIgnoreCase(name)) {
			return par_itm_grp_cd10();
		}
		if ($par_itm_grp_nm10.equalsIgnoreCase(name)) {
			return par_itm_grp_nm10();
		}
		if ($chd_itm_grp_cd1.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd1();
		}
		if ($chd_itm_grp_nm1.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm1();
		}
		if ($chd_itm_grp_cd2.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd2();
		}
		if ($chd_itm_grp_nm2.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm2();
		}
		if ($chd_itm_grp_cd3.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd3();
		}
		if ($chd_itm_grp_nm3.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm3();
		}
		if ($chd_itm_grp_cd4.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd4();
		}
		if ($chd_itm_grp_nm4.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm4();
		}
		if ($chd_itm_grp_cd5.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd5();
		}
		if ($chd_itm_grp_nm5.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm5();
		}
		if ($chd_itm_grp_cd6.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd6();
		}
		if ($chd_itm_grp_nm6.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm6();
		}
		if ($chd_itm_grp_cd7.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd7();
		}
		if ($chd_itm_grp_nm7.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm7();
		}
		if ($chd_itm_grp_cd8.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd8();
		}
		if ($chd_itm_grp_nm8.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm8();
		}
		if ($chd_itm_grp_cd9.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd9();
		}
		if ($chd_itm_grp_nm9.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm9();
		}
		if ($chd_itm_grp_cd10.equalsIgnoreCase(name)) {
			return chd_itm_grp_cd10();
		}
		if ($chd_itm_grp_nm10.equalsIgnoreCase(name)) {
			return chd_itm_grp_nm10();
		}
		if ($bom_chng_typ.equalsIgnoreCase(name)) {
			return bom_chng_typ();
		}
		if ($bom_chng_typ_nm.equalsIgnoreCase(name)) {
			return bom_chng_typ_nm();
		}
		if ($chng_wg_cd.equalsIgnoreCase(name)) {
			return chng_wg_cd();
		}
		if ($chng_wg_nm.equalsIgnoreCase(name)) {
			return chng_wg_nm();
		}
		if ($old_stk_mng_typ.equalsIgnoreCase(name)) {
			return old_stk_mng_typ();
		}
		if ($old_stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return old_stk_mng_typ_nm();
		}
		if ($old_asset_mng_typ.equalsIgnoreCase(name)) {
			return old_asset_mng_typ();
		}
		if ($old_asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return old_asset_mng_typ_nm();
		}
		if ($old_alt_grp_cd.equalsIgnoreCase(name)) {
			return old_alt_grp_cd();
		}
		if ($old_alt_grp_nm.equalsIgnoreCase(name)) {
			return old_alt_grp_nm();
		}
		if ($old_alt_itm_typ.equalsIgnoreCase(name)) {
			return old_alt_itm_typ();
		}
		if ($old_alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return old_alt_itm_typ_nm();
		}
		if ($new_stk_mng_typ.equalsIgnoreCase(name)) {
			return new_stk_mng_typ();
		}
		if ($new_stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return new_stk_mng_typ_nm();
		}
		if ($new_asset_mng_typ.equalsIgnoreCase(name)) {
			return new_asset_mng_typ();
		}
		if ($new_asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return new_asset_mng_typ_nm();
		}
		if ($new_alt_grp_cd.equalsIgnoreCase(name)) {
			return new_alt_grp_cd();
		}
		if ($new_alt_grp_nm.equalsIgnoreCase(name)) {
			return new_alt_grp_nm();
		}
		if ($new_alt_itm_typ.equalsIgnoreCase(name)) {
			return new_alt_itm_typ();
		}
		if ($new_alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return new_alt_itm_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($old_alt_itm_ratio.equalsIgnoreCase(name)) {
			return old_alt_itm_ratio();
		}
		if ($old_alt_alloc_prio.equalsIgnoreCase(name)) {
			return old_alt_alloc_prio();
		}
		if ($new_alt_itm_ratio.equalsIgnoreCase(name)) {
			return new_alt_itm_ratio();
		}
		if ($new_alt_alloc_prio.equalsIgnoreCase(name)) {
			return new_alt_alloc_prio();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($chng_st_dt.equalsIgnoreCase(name)) {
			return chng_st_dt();
		}
		if ($chng_end_dt.equalsIgnoreCase(name)) {
			return chng_end_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cmn_flg.equalsIgnoreCase(name)) {
			return cmn_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			ext_sys_no_bom(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($par_itm_grp_cd1.equalsIgnoreCase(name)) {
			par_itm_grp_cd1(value);
			return;
		}
		if ($par_itm_grp_nm1.equalsIgnoreCase(name)) {
			par_itm_grp_nm1(value);
			return;
		}
		if ($par_itm_grp_cd2.equalsIgnoreCase(name)) {
			par_itm_grp_cd2(value);
			return;
		}
		if ($par_itm_grp_nm2.equalsIgnoreCase(name)) {
			par_itm_grp_nm2(value);
			return;
		}
		if ($par_itm_grp_cd3.equalsIgnoreCase(name)) {
			par_itm_grp_cd3(value);
			return;
		}
		if ($par_itm_grp_nm3.equalsIgnoreCase(name)) {
			par_itm_grp_nm3(value);
			return;
		}
		if ($par_itm_grp_cd4.equalsIgnoreCase(name)) {
			par_itm_grp_cd4(value);
			return;
		}
		if ($par_itm_grp_nm4.equalsIgnoreCase(name)) {
			par_itm_grp_nm4(value);
			return;
		}
		if ($par_itm_grp_cd5.equalsIgnoreCase(name)) {
			par_itm_grp_cd5(value);
			return;
		}
		if ($par_itm_grp_nm5.equalsIgnoreCase(name)) {
			par_itm_grp_nm5(value);
			return;
		}
		if ($par_itm_grp_cd6.equalsIgnoreCase(name)) {
			par_itm_grp_cd6(value);
			return;
		}
		if ($par_itm_grp_nm6.equalsIgnoreCase(name)) {
			par_itm_grp_nm6(value);
			return;
		}
		if ($par_itm_grp_cd7.equalsIgnoreCase(name)) {
			par_itm_grp_cd7(value);
			return;
		}
		if ($par_itm_grp_nm7.equalsIgnoreCase(name)) {
			par_itm_grp_nm7(value);
			return;
		}
		if ($par_itm_grp_cd8.equalsIgnoreCase(name)) {
			par_itm_grp_cd8(value);
			return;
		}
		if ($par_itm_grp_nm8.equalsIgnoreCase(name)) {
			par_itm_grp_nm8(value);
			return;
		}
		if ($par_itm_grp_cd9.equalsIgnoreCase(name)) {
			par_itm_grp_cd9(value);
			return;
		}
		if ($par_itm_grp_nm9.equalsIgnoreCase(name)) {
			par_itm_grp_nm9(value);
			return;
		}
		if ($par_itm_grp_cd10.equalsIgnoreCase(name)) {
			par_itm_grp_cd10(value);
			return;
		}
		if ($par_itm_grp_nm10.equalsIgnoreCase(name)) {
			par_itm_grp_nm10(value);
			return;
		}
		if ($chd_itm_grp_cd1.equalsIgnoreCase(name)) {
			chd_itm_grp_cd1(value);
			return;
		}
		if ($chd_itm_grp_nm1.equalsIgnoreCase(name)) {
			chd_itm_grp_nm1(value);
			return;
		}
		if ($chd_itm_grp_cd2.equalsIgnoreCase(name)) {
			chd_itm_grp_cd2(value);
			return;
		}
		if ($chd_itm_grp_nm2.equalsIgnoreCase(name)) {
			chd_itm_grp_nm2(value);
			return;
		}
		if ($chd_itm_grp_cd3.equalsIgnoreCase(name)) {
			chd_itm_grp_cd3(value);
			return;
		}
		if ($chd_itm_grp_nm3.equalsIgnoreCase(name)) {
			chd_itm_grp_nm3(value);
			return;
		}
		if ($chd_itm_grp_cd4.equalsIgnoreCase(name)) {
			chd_itm_grp_cd4(value);
			return;
		}
		if ($chd_itm_grp_nm4.equalsIgnoreCase(name)) {
			chd_itm_grp_nm4(value);
			return;
		}
		if ($chd_itm_grp_cd5.equalsIgnoreCase(name)) {
			chd_itm_grp_cd5(value);
			return;
		}
		if ($chd_itm_grp_nm5.equalsIgnoreCase(name)) {
			chd_itm_grp_nm5(value);
			return;
		}
		if ($chd_itm_grp_cd6.equalsIgnoreCase(name)) {
			chd_itm_grp_cd6(value);
			return;
		}
		if ($chd_itm_grp_nm6.equalsIgnoreCase(name)) {
			chd_itm_grp_nm6(value);
			return;
		}
		if ($chd_itm_grp_cd7.equalsIgnoreCase(name)) {
			chd_itm_grp_cd7(value);
			return;
		}
		if ($chd_itm_grp_nm7.equalsIgnoreCase(name)) {
			chd_itm_grp_nm7(value);
			return;
		}
		if ($chd_itm_grp_cd8.equalsIgnoreCase(name)) {
			chd_itm_grp_cd8(value);
			return;
		}
		if ($chd_itm_grp_nm8.equalsIgnoreCase(name)) {
			chd_itm_grp_nm8(value);
			return;
		}
		if ($chd_itm_grp_cd9.equalsIgnoreCase(name)) {
			chd_itm_grp_cd9(value);
			return;
		}
		if ($chd_itm_grp_nm9.equalsIgnoreCase(name)) {
			chd_itm_grp_nm9(value);
			return;
		}
		if ($chd_itm_grp_cd10.equalsIgnoreCase(name)) {
			chd_itm_grp_cd10(value);
			return;
		}
		if ($chd_itm_grp_nm10.equalsIgnoreCase(name)) {
			chd_itm_grp_nm10(value);
			return;
		}
		if ($bom_chng_typ.equalsIgnoreCase(name)) {
			bom_chng_typ(value);
			return;
		}
		if ($bom_chng_typ_nm.equalsIgnoreCase(name)) {
			bom_chng_typ_nm(value);
			return;
		}
		if ($chng_wg_cd.equalsIgnoreCase(name)) {
			chng_wg_cd(value);
			return;
		}
		if ($chng_wg_nm.equalsIgnoreCase(name)) {
			chng_wg_nm(value);
			return;
		}
		if ($old_stk_mng_typ.equalsIgnoreCase(name)) {
			old_stk_mng_typ(value);
			return;
		}
		if ($old_stk_mng_typ_nm.equalsIgnoreCase(name)) {
			old_stk_mng_typ_nm(value);
			return;
		}
		if ($old_asset_mng_typ.equalsIgnoreCase(name)) {
			old_asset_mng_typ(value);
			return;
		}
		if ($old_asset_mng_typ_nm.equalsIgnoreCase(name)) {
			old_asset_mng_typ_nm(value);
			return;
		}
		if ($old_alt_grp_cd.equalsIgnoreCase(name)) {
			old_alt_grp_cd(value);
			return;
		}
		if ($old_alt_grp_nm.equalsIgnoreCase(name)) {
			old_alt_grp_nm(value);
			return;
		}
		if ($old_alt_itm_typ.equalsIgnoreCase(name)) {
			old_alt_itm_typ(value);
			return;
		}
		if ($old_alt_itm_typ_nm.equalsIgnoreCase(name)) {
			old_alt_itm_typ_nm(value);
			return;
		}
		if ($new_stk_mng_typ.equalsIgnoreCase(name)) {
			new_stk_mng_typ(value);
			return;
		}
		if ($new_stk_mng_typ_nm.equalsIgnoreCase(name)) {
			new_stk_mng_typ_nm(value);
			return;
		}
		if ($new_asset_mng_typ.equalsIgnoreCase(name)) {
			new_asset_mng_typ(value);
			return;
		}
		if ($new_asset_mng_typ_nm.equalsIgnoreCase(name)) {
			new_asset_mng_typ_nm(value);
			return;
		}
		if ($new_alt_grp_cd.equalsIgnoreCase(name)) {
			new_alt_grp_cd(value);
			return;
		}
		if ($new_alt_grp_nm.equalsIgnoreCase(name)) {
			new_alt_grp_nm(value);
			return;
		}
		if ($new_alt_itm_typ.equalsIgnoreCase(name)) {
			new_alt_itm_typ(value);
			return;
		}
		if ($new_alt_itm_typ_nm.equalsIgnoreCase(name)) {
			new_alt_itm_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($old_alt_itm_ratio.equalsIgnoreCase(name)) {
			old_alt_itm_ratio(value);
			return;
		}
		if ($old_alt_alloc_prio.equalsIgnoreCase(name)) {
			old_alt_alloc_prio(value);
			return;
		}
		if ($new_alt_itm_ratio.equalsIgnoreCase(name)) {
			new_alt_itm_ratio(value);
			return;
		}
		if ($new_alt_alloc_prio.equalsIgnoreCase(name)) {
			new_alt_alloc_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($old_alt_itm_ratio.equalsIgnoreCase(name)) {
			old_alt_itm_ratio(value);
			return;
		}
		if ($old_alt_alloc_prio.equalsIgnoreCase(name)) {
			old_alt_alloc_prio(value);
			return;
		}
		if ($new_alt_itm_ratio.equalsIgnoreCase(name)) {
			new_alt_itm_ratio(value);
			return;
		}
		if ($new_alt_alloc_prio.equalsIgnoreCase(name)) {
			new_alt_alloc_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($old_alt_itm_ratio.equalsIgnoreCase(name)) {
			old_alt_itm_ratio(value);
			return;
		}
		if ($old_alt_alloc_prio.equalsIgnoreCase(name)) {
			old_alt_alloc_prio(value);
			return;
		}
		if ($new_alt_itm_ratio.equalsIgnoreCase(name)) {
			new_alt_itm_ratio(value);
			return;
		}
		if ($new_alt_alloc_prio.equalsIgnoreCase(name)) {
			new_alt_alloc_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($old_alt_itm_ratio.equalsIgnoreCase(name)) {
			old_alt_itm_ratio(value);
			return;
		}
		if ($old_alt_alloc_prio.equalsIgnoreCase(name)) {
			old_alt_alloc_prio(value);
			return;
		}
		if ($new_alt_itm_ratio.equalsIgnoreCase(name)) {
			new_alt_itm_ratio(value);
			return;
		}
		if ($new_alt_alloc_prio.equalsIgnoreCase(name)) {
			new_alt_alloc_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($old_alt_itm_ratio.equalsIgnoreCase(name)) {
			old_alt_itm_ratio(value);
			return;
		}
		if ($old_alt_alloc_prio.equalsIgnoreCase(name)) {
			old_alt_alloc_prio(value);
			return;
		}
		if ($new_alt_itm_ratio.equalsIgnoreCase(name)) {
			new_alt_itm_ratio(value);
			return;
		}
		if ($new_alt_alloc_prio.equalsIgnoreCase(name)) {
			new_alt_alloc_prio(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($chng_st_dt.equalsIgnoreCase(name)) {
			chng_st_dt(value);
			return;
		}
		if ($chng_end_dt.equalsIgnoreCase(name)) {
			chng_end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cmn_flg.equalsIgnoreCase(name)) {
			cmn_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			ext_sys_no_bom(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($par_itm_grp_cd1.equalsIgnoreCase(name)) {
			par_itm_grp_cd1(value);
			return;
		}
		if ($par_itm_grp_nm1.equalsIgnoreCase(name)) {
			par_itm_grp_nm1(value);
			return;
		}
		if ($par_itm_grp_cd2.equalsIgnoreCase(name)) {
			par_itm_grp_cd2(value);
			return;
		}
		if ($par_itm_grp_nm2.equalsIgnoreCase(name)) {
			par_itm_grp_nm2(value);
			return;
		}
		if ($par_itm_grp_cd3.equalsIgnoreCase(name)) {
			par_itm_grp_cd3(value);
			return;
		}
		if ($par_itm_grp_nm3.equalsIgnoreCase(name)) {
			par_itm_grp_nm3(value);
			return;
		}
		if ($par_itm_grp_cd4.equalsIgnoreCase(name)) {
			par_itm_grp_cd4(value);
			return;
		}
		if ($par_itm_grp_nm4.equalsIgnoreCase(name)) {
			par_itm_grp_nm4(value);
			return;
		}
		if ($par_itm_grp_cd5.equalsIgnoreCase(name)) {
			par_itm_grp_cd5(value);
			return;
		}
		if ($par_itm_grp_nm5.equalsIgnoreCase(name)) {
			par_itm_grp_nm5(value);
			return;
		}
		if ($par_itm_grp_cd6.equalsIgnoreCase(name)) {
			par_itm_grp_cd6(value);
			return;
		}
		if ($par_itm_grp_nm6.equalsIgnoreCase(name)) {
			par_itm_grp_nm6(value);
			return;
		}
		if ($par_itm_grp_cd7.equalsIgnoreCase(name)) {
			par_itm_grp_cd7(value);
			return;
		}
		if ($par_itm_grp_nm7.equalsIgnoreCase(name)) {
			par_itm_grp_nm7(value);
			return;
		}
		if ($par_itm_grp_cd8.equalsIgnoreCase(name)) {
			par_itm_grp_cd8(value);
			return;
		}
		if ($par_itm_grp_nm8.equalsIgnoreCase(name)) {
			par_itm_grp_nm8(value);
			return;
		}
		if ($par_itm_grp_cd9.equalsIgnoreCase(name)) {
			par_itm_grp_cd9(value);
			return;
		}
		if ($par_itm_grp_nm9.equalsIgnoreCase(name)) {
			par_itm_grp_nm9(value);
			return;
		}
		if ($par_itm_grp_cd10.equalsIgnoreCase(name)) {
			par_itm_grp_cd10(value);
			return;
		}
		if ($par_itm_grp_nm10.equalsIgnoreCase(name)) {
			par_itm_grp_nm10(value);
			return;
		}
		if ($chd_itm_grp_cd1.equalsIgnoreCase(name)) {
			chd_itm_grp_cd1(value);
			return;
		}
		if ($chd_itm_grp_nm1.equalsIgnoreCase(name)) {
			chd_itm_grp_nm1(value);
			return;
		}
		if ($chd_itm_grp_cd2.equalsIgnoreCase(name)) {
			chd_itm_grp_cd2(value);
			return;
		}
		if ($chd_itm_grp_nm2.equalsIgnoreCase(name)) {
			chd_itm_grp_nm2(value);
			return;
		}
		if ($chd_itm_grp_cd3.equalsIgnoreCase(name)) {
			chd_itm_grp_cd3(value);
			return;
		}
		if ($chd_itm_grp_nm3.equalsIgnoreCase(name)) {
			chd_itm_grp_nm3(value);
			return;
		}
		if ($chd_itm_grp_cd4.equalsIgnoreCase(name)) {
			chd_itm_grp_cd4(value);
			return;
		}
		if ($chd_itm_grp_nm4.equalsIgnoreCase(name)) {
			chd_itm_grp_nm4(value);
			return;
		}
		if ($chd_itm_grp_cd5.equalsIgnoreCase(name)) {
			chd_itm_grp_cd5(value);
			return;
		}
		if ($chd_itm_grp_nm5.equalsIgnoreCase(name)) {
			chd_itm_grp_nm5(value);
			return;
		}
		if ($chd_itm_grp_cd6.equalsIgnoreCase(name)) {
			chd_itm_grp_cd6(value);
			return;
		}
		if ($chd_itm_grp_nm6.equalsIgnoreCase(name)) {
			chd_itm_grp_nm6(value);
			return;
		}
		if ($chd_itm_grp_cd7.equalsIgnoreCase(name)) {
			chd_itm_grp_cd7(value);
			return;
		}
		if ($chd_itm_grp_nm7.equalsIgnoreCase(name)) {
			chd_itm_grp_nm7(value);
			return;
		}
		if ($chd_itm_grp_cd8.equalsIgnoreCase(name)) {
			chd_itm_grp_cd8(value);
			return;
		}
		if ($chd_itm_grp_nm8.equalsIgnoreCase(name)) {
			chd_itm_grp_nm8(value);
			return;
		}
		if ($chd_itm_grp_cd9.equalsIgnoreCase(name)) {
			chd_itm_grp_cd9(value);
			return;
		}
		if ($chd_itm_grp_nm9.equalsIgnoreCase(name)) {
			chd_itm_grp_nm9(value);
			return;
		}
		if ($chd_itm_grp_cd10.equalsIgnoreCase(name)) {
			chd_itm_grp_cd10(value);
			return;
		}
		if ($chd_itm_grp_nm10.equalsIgnoreCase(name)) {
			chd_itm_grp_nm10(value);
			return;
		}
		if ($bom_chng_typ.equalsIgnoreCase(name)) {
			bom_chng_typ(value);
			return;
		}
		if ($bom_chng_typ_nm.equalsIgnoreCase(name)) {
			bom_chng_typ_nm(value);
			return;
		}
		if ($chng_wg_cd.equalsIgnoreCase(name)) {
			chng_wg_cd(value);
			return;
		}
		if ($chng_wg_nm.equalsIgnoreCase(name)) {
			chng_wg_nm(value);
			return;
		}
		if ($old_stk_mng_typ.equalsIgnoreCase(name)) {
			old_stk_mng_typ(value);
			return;
		}
		if ($old_stk_mng_typ_nm.equalsIgnoreCase(name)) {
			old_stk_mng_typ_nm(value);
			return;
		}
		if ($old_asset_mng_typ.equalsIgnoreCase(name)) {
			old_asset_mng_typ(value);
			return;
		}
		if ($old_asset_mng_typ_nm.equalsIgnoreCase(name)) {
			old_asset_mng_typ_nm(value);
			return;
		}
		if ($old_alt_grp_cd.equalsIgnoreCase(name)) {
			old_alt_grp_cd(value);
			return;
		}
		if ($old_alt_grp_nm.equalsIgnoreCase(name)) {
			old_alt_grp_nm(value);
			return;
		}
		if ($old_alt_itm_typ.equalsIgnoreCase(name)) {
			old_alt_itm_typ(value);
			return;
		}
		if ($old_alt_itm_typ_nm.equalsIgnoreCase(name)) {
			old_alt_itm_typ_nm(value);
			return;
		}
		if ($new_stk_mng_typ.equalsIgnoreCase(name)) {
			new_stk_mng_typ(value);
			return;
		}
		if ($new_stk_mng_typ_nm.equalsIgnoreCase(name)) {
			new_stk_mng_typ_nm(value);
			return;
		}
		if ($new_asset_mng_typ.equalsIgnoreCase(name)) {
			new_asset_mng_typ(value);
			return;
		}
		if ($new_asset_mng_typ_nm.equalsIgnoreCase(name)) {
			new_asset_mng_typ_nm(value);
			return;
		}
		if ($new_alt_grp_cd.equalsIgnoreCase(name)) {
			new_alt_grp_cd(value);
			return;
		}
		if ($new_alt_grp_nm.equalsIgnoreCase(name)) {
			new_alt_grp_nm(value);
			return;
		}
		if ($new_alt_itm_typ.equalsIgnoreCase(name)) {
			new_alt_itm_typ(value);
			return;
		}
		if ($new_alt_itm_typ_nm.equalsIgnoreCase(name)) {
			new_alt_itm_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($old_alt_itm_ratio.equalsIgnoreCase(name)) {
			old_alt_itm_ratio(value);
			return;
		}
		if ($old_alt_alloc_prio.equalsIgnoreCase(name)) {
			old_alt_alloc_prio(value);
			return;
		}
		if ($new_alt_itm_ratio.equalsIgnoreCase(name)) {
			new_alt_itm_ratio(value);
			return;
		}
		if ($new_alt_alloc_prio.equalsIgnoreCase(name)) {
			new_alt_alloc_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($old_alt_itm_ratio.equalsIgnoreCase(name)) {
			old_alt_itm_ratio(value);
			return;
		}
		if ($old_alt_alloc_prio.equalsIgnoreCase(name)) {
			old_alt_alloc_prio(value);
			return;
		}
		if ($new_alt_itm_ratio.equalsIgnoreCase(name)) {
			new_alt_itm_ratio(value);
			return;
		}
		if ($new_alt_alloc_prio.equalsIgnoreCase(name)) {
			new_alt_alloc_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($old_alt_itm_ratio.equalsIgnoreCase(name)) {
			old_alt_itm_ratio(value);
			return;
		}
		if ($old_alt_alloc_prio.equalsIgnoreCase(name)) {
			old_alt_alloc_prio(value);
			return;
		}
		if ($new_alt_itm_ratio.equalsIgnoreCase(name)) {
			new_alt_itm_ratio(value);
			return;
		}
		if ($new_alt_alloc_prio.equalsIgnoreCase(name)) {
			new_alt_alloc_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($old_alt_itm_ratio.equalsIgnoreCase(name)) {
			old_alt_itm_ratio(value);
			return;
		}
		if ($old_alt_alloc_prio.equalsIgnoreCase(name)) {
			old_alt_alloc_prio(value);
			return;
		}
		if ($new_alt_itm_ratio.equalsIgnoreCase(name)) {
			new_alt_itm_ratio(value);
			return;
		}
		if ($new_alt_alloc_prio.equalsIgnoreCase(name)) {
			new_alt_alloc_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($old_alt_itm_ratio.equalsIgnoreCase(name)) {
			old_alt_itm_ratio(value);
			return;
		}
		if ($old_alt_alloc_prio.equalsIgnoreCase(name)) {
			old_alt_alloc_prio(value);
			return;
		}
		if ($new_alt_itm_ratio.equalsIgnoreCase(name)) {
			new_alt_itm_ratio(value);
			return;
		}
		if ($new_alt_alloc_prio.equalsIgnoreCase(name)) {
			new_alt_alloc_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($chng_st_dt.equalsIgnoreCase(name)) {
			chng_st_dt(value);
			return;
		}
		if ($chng_end_dt.equalsIgnoreCase(name)) {
			chng_end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cmn_flg.equalsIgnoreCase(name)) {
			cmn_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		if ($par_itm_typ_p.equalsIgnoreCase(name)) {
			return par_itm_typ_p();
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		if ($chd_itm_typ_p.equalsIgnoreCase(name)) {
			return chd_itm_typ_p();
		}
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			return chd_itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($old_itm_p.equalsIgnoreCase(name)) {
			return old_itm_p();
		}
		if ($old_ver_no_p.equalsIgnoreCase(name)) {
			return old_ver_no_p();
		}
		if ($new_itm_p.equalsIgnoreCase(name)) {
			return new_itm_p();
		}
		if ($new_ver_no_p.equalsIgnoreCase(name)) {
			return new_ver_no_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(
				((MCContainerMeta) dt_META).castInnerRow(mcframe.clientMAUB.MAUBP0020.StEndDtR.class, value)
			);
			return;
		}
		if ($par_itm_typ_p.equalsIgnoreCase(name)) {
			par_itm_typ_p(
				((MCContainerMeta) par_itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($chd_itm_typ_p.equalsIgnoreCase(name)) {
			chd_itm_typ_p(
				((MCContainerMeta) chd_itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			chd_itm_p(
				((MCContainerMeta) chd_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0340.VerNoR.class, value)
			);
			return;
		}
		if ($old_itm_p.equalsIgnoreCase(name)) {
			old_itm_p(
				((MCContainerMeta) old_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($old_ver_no_p.equalsIgnoreCase(name)) {
			old_ver_no_p(
				((MCContainerMeta) old_ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0340.VerNoR.class, value)
			);
			return;
		}
		if ($new_itm_p.equalsIgnoreCase(name)) {
			new_itm_p(
				((MCContainerMeta) new_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($new_ver_no_p.equalsIgnoreCase(name)) {
			new_ver_no_p(
				((MCContainerMeta) new_ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0340.VerNoR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate st_dt_fr() {
		return dt().st_dt_fr();
	}

	public void st_dt_fr(MCDate value) {
		dt().st_dt_fr(value);
	}

	public MCDate st_dt_to() {
		return dt().st_dt_to();
	}

	public void st_dt_to(MCDate value) {
		dt().st_dt_to(value);
	}

	public MCDate end_dt_fr() {
		return dt().end_dt_fr();
	}

	public void end_dt_fr(MCDate value) {
		dt().end_dt_fr(value);
	}

	public MCDate end_dt_to() {
		return dt().end_dt_to();
	}

	public void end_dt_to(MCDate value) {
		dt().end_dt_to(value);
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public String par_itm_typ() {
		return par_itm_typ_p().itm_typ();
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ(String value) {
		par_itm_typ_p().itm_typ(value);
	}

	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public String par_itm_typ_nm() {
		return par_itm_typ_p().itm_typ_nm();
	}

	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public void par_itm_typ_nm(String value) {
		par_itm_typ_p().itm_typ_nm(value);
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public String par_itm_typ_d_cd() {
		return par_itm_typ_p().itm_typ_d_cd();
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public void par_itm_typ_d_cd(String value) {
		par_itm_typ_p().itm_typ_d_cd(value);
	}

	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public String par_itm_typ_d_nm() {
		return par_itm_typ_p().itm_typ_d_nm();
	}

	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public void par_itm_typ_d_nm(String value) {
		par_itm_typ_p().itm_typ_d_nm(value);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return par_itm_p().itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		par_itm_p().itm_cd(value);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return par_itm_p().itm_sub1();
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		par_itm_p().itm_sub1(value);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return par_itm_p().itm_sub2();
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		par_itm_p().itm_sub2(value);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return par_itm_p().itm_sub3();
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		par_itm_p().itm_sub3(value);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return par_itm_p().itm_nm();
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		par_itm_p().itm_nm(value);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public String chd_itm_typ() {
		return chd_itm_typ_p().itm_typ();
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ(String value) {
		chd_itm_typ_p().itm_typ(value);
	}

	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public String chd_itm_typ_nm() {
		return chd_itm_typ_p().itm_typ_nm();
	}

	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public void chd_itm_typ_nm(String value) {
		chd_itm_typ_p().itm_typ_nm(value);
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public String chd_itm_typ_d_cd() {
		return chd_itm_typ_p().itm_typ_d_cd();
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public void chd_itm_typ_d_cd(String value) {
		chd_itm_typ_p().itm_typ_d_cd(value);
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public String chd_itm_typ_d_nm() {
		return chd_itm_typ_p().itm_typ_d_nm();
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public void chd_itm_typ_d_nm(String value) {
		chd_itm_typ_p().itm_typ_d_nm(value);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return chd_itm_p().itm_cd();
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		chd_itm_p().itm_cd(value);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return chd_itm_p().itm_sub1();
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		chd_itm_p().itm_sub1(value);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return chd_itm_p().itm_sub2();
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		chd_itm_p().itm_sub2(value);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return chd_itm_p().itm_sub3();
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		chd_itm_p().itm_sub3(value);
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public String chd_itm_nm() {
		return chd_itm_p().itm_nm();
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		chd_itm_p().itm_nm(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	/**
	 * Old item cd. 旧品目ＣＤ.<p>
	 *
	 */
	public String old_itm_cd() {
		return old_itm_p().itm_cd();
	}

	/**
	 * Old item cd. 旧品目ＣＤ.<p>
	 *
	 */
	public void old_itm_cd(String value) {
		old_itm_p().itm_cd(value);
	}

	/**
	 * Old branch No. 1 旧枝番１.<p>
	 *
	 */
	public String old_itm_sub1() {
		return old_itm_p().itm_sub1();
	}

	/**
	 * Old branch No. 1 旧枝番１.<p>
	 *
	 */
	public void old_itm_sub1(String value) {
		old_itm_p().itm_sub1(value);
	}

	/**
	 * Old branch No. 2 旧枝番２.<p>
	 *
	 */
	public String old_itm_sub2() {
		return old_itm_p().itm_sub2();
	}

	/**
	 * Old branch No. 2 旧枝番２.<p>
	 *
	 */
	public void old_itm_sub2(String value) {
		old_itm_p().itm_sub2(value);
	}

	/**
	 * Old branch No. 3 旧枝番３.<p>
	 *
	 */
	public String old_itm_sub3() {
		return old_itm_p().itm_sub3();
	}

	/**
	 * Old branch No. 3 旧枝番３.<p>
	 *
	 */
	public void old_itm_sub3(String value) {
		old_itm_p().itm_sub3(value);
	}

	/**
	 * Old item name 旧品名.<p>
	 *
	 */
	public String old_itm_nm() {
		return old_itm_p().itm_nm();
	}

	/**
	 * Old item name 旧品名.<p>
	 *
	 */
	public void old_itm_nm(String value) {
		old_itm_p().itm_nm(value);
	}

	/**
	 * Old Version No. 旧版ＮＯ.<p>
	 *
	 */
	public String old_ver_no() {
		return old_ver_no_p().ver_no();
	}

	/**
	 * Old Version No. 旧版ＮＯ.<p>
	 *
	 */
	public void old_ver_no(String value) {
		old_ver_no_p().ver_no(value);
	}

	/**
	 * New Item cd. 新品目ＣＤ.<p>
	 *
	 */
	public String new_itm_cd() {
		return new_itm_p().itm_cd();
	}

	/**
	 * New Item cd. 新品目ＣＤ.<p>
	 *
	 */
	public void new_itm_cd(String value) {
		new_itm_p().itm_cd(value);
	}

	/**
	 * New branch No. 1 新枝番１.<p>
	 *
	 */
	public String new_itm_sub1() {
		return new_itm_p().itm_sub1();
	}

	/**
	 * New branch No. 1 新枝番１.<p>
	 *
	 */
	public void new_itm_sub1(String value) {
		new_itm_p().itm_sub1(value);
	}

	/**
	 * New branch No. 2 新枝番２.<p>
	 *
	 */
	public String new_itm_sub2() {
		return new_itm_p().itm_sub2();
	}

	/**
	 * New branch No. 2 新枝番２.<p>
	 *
	 */
	public void new_itm_sub2(String value) {
		new_itm_p().itm_sub2(value);
	}

	/**
	 * New branch No. 3 新枝番３.<p>
	 *
	 */
	public String new_itm_sub3() {
		return new_itm_p().itm_sub3();
	}

	/**
	 * New branch No. 3 新枝番３.<p>
	 *
	 */
	public void new_itm_sub3(String value) {
		new_itm_p().itm_sub3(value);
	}

	/**
	 * New Item name 新品名.<p>
	 *
	 */
	public String new_itm_nm() {
		return new_itm_p().itm_nm();
	}

	/**
	 * New Item name 新品名.<p>
	 *
	 */
	public void new_itm_nm(String value) {
		new_itm_p().itm_nm(value);
	}

	/**
	 * New version No. 新版ＮＯ.<p>
	 *
	 */
	public String new_ver_no() {
		return new_ver_no_p().ver_no();
	}

	/**
	 * New version No. 新版ＮＯ.<p>
	 *
	 */
	public void new_ver_no(String value) {
		new_ver_no_p().ver_no(value);
	}

}

