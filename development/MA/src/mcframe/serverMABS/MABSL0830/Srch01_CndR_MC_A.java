package mcframe.serverMABS.MABSL0830;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Application month 適用年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Application start month FROM 適用開始年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $st_ym_fr = "st_ym_fr";
	/**
	 * Application start month TO 適用開始年月ＴＯ.<p>
	 *
	 */
	public static final String $st_ym_to = "st_ym_to";
	/**
	 * Application end month FROM 適用終了年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $end_ym_fr = "end_ym_fr";
	/**
	 * Application end date TO 適用終了年月ＴＯ.<p>
	 *
	 */
	public static final String $end_ym_to = "end_ym_to";
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
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public static final String $spln_itm_cd = "spln_itm_cd";
	/**
	 * Plan item name 計画品目名.<p>
	 *
	 */
	public static final String $spln_itm_nm = "spln_itm_nm";
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
	 * Plan item classification cd. 1 計画品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $spln_itm_grp_cd1 = "spln_itm_grp_cd1";
	/**
	 * Plan item classification name 1 計画品目分類名１.<p>
	 *
	 */
	public static final String $spln_itm_grp_nm1 = "spln_itm_grp_nm1";
	/**
	 * Plan item classification cd. 2 計画品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $spln_itm_grp_cd2 = "spln_itm_grp_cd2";
	/**
	 * Plan item classification name 2 計画品目分類名２.<p>
	 *
	 */
	public static final String $spln_itm_grp_nm2 = "spln_itm_grp_nm2";
	/**
	 * Plan item classification cd. 3 計画品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $spln_itm_grp_cd3 = "spln_itm_grp_cd3";
	/**
	 * Plan item classification name 3 計画品目分類名３.<p>
	 *
	 */
	public static final String $spln_itm_grp_nm3 = "spln_itm_grp_nm3";
	/**
	 * Plan item classification cd. 4 計画品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $spln_itm_grp_cd4 = "spln_itm_grp_cd4";
	/**
	 * Plan item classification name 4 計画品目分類名４.<p>
	 *
	 */
	public static final String $spln_itm_grp_nm4 = "spln_itm_grp_nm4";
	/**
	 * Plan item classification cd. 5 計画品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $spln_itm_grp_cd5 = "spln_itm_grp_cd5";
	/**
	 * Plan item classification name 5 計画品目分類名５.<p>
	 *
	 */
	public static final String $spln_itm_grp_nm5 = "spln_itm_grp_nm5";
	/**
	 * Plan item classification cd. 6 計画品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $spln_itm_grp_cd6 = "spln_itm_grp_cd6";
	/**
	 * Plan item classification name 6 計画品目分類名６.<p>
	 *
	 */
	public static final String $spln_itm_grp_nm6 = "spln_itm_grp_nm6";
	/**
	 * Plan item classification cd. 7 計画品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $spln_itm_grp_cd7 = "spln_itm_grp_cd7";
	/**
	 * Plan item classification name 7 計画品目分類名７.<p>
	 *
	 */
	public static final String $spln_itm_grp_nm7 = "spln_itm_grp_nm7";
	/**
	 * Plan item classification cd. 8 計画品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $spln_itm_grp_cd8 = "spln_itm_grp_cd8";
	/**
	 * Plan item classification name 8 計画品目分類名８.<p>
	 *
	 */
	public static final String $spln_itm_grp_nm8 = "spln_itm_grp_nm8";
	/**
	 * Plan item classification cd. 9 計画品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $spln_itm_grp_cd9 = "spln_itm_grp_cd9";
	/**
	 * Plan item classification name 9 計画品目分類名９.<p>
	 *
	 */
	public static final String $spln_itm_grp_nm9 = "spln_itm_grp_nm9";
	/**
	 * Plan item classification cd. 10 計画品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $spln_itm_grp_cd10 = "spln_itm_grp_cd10";
	/**
	 * Plan item classification name 10 計画品目分類名１０.<p>
	 *
	 */
	public static final String $spln_itm_grp_nm10 = "spln_itm_grp_nm10";


	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta st_ym_fr_META = createCommonMeta($st_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta st_ym_to_META = createCommonMeta($st_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta end_ym_fr_META = createCommonMeta($end_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta end_ym_to_META = createCommonMeta($end_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta spln_itm_cd_META = createCommonMeta($spln_itm_cd, mcframe.commonMA.meta.MA_META.SPLN_ITM_CD);
	public static final MCMeta spln_itm_nm_META = createCommonMeta($spln_itm_nm, mcframe.commonMA.meta.MA_META.SPLN_ITM_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
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
	public static final MCMeta spln_itm_grp_cd1_META = createCommonMeta($spln_itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta spln_itm_grp_nm1_META = createCommonMeta($spln_itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta spln_itm_grp_cd2_META = createCommonMeta($spln_itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta spln_itm_grp_nm2_META = createCommonMeta($spln_itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta spln_itm_grp_cd3_META = createCommonMeta($spln_itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta spln_itm_grp_nm3_META = createCommonMeta($spln_itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta spln_itm_grp_cd4_META = createCommonMeta($spln_itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta spln_itm_grp_nm4_META = createCommonMeta($spln_itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta spln_itm_grp_cd5_META = createCommonMeta($spln_itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta spln_itm_grp_nm5_META = createCommonMeta($spln_itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta spln_itm_grp_cd6_META = createCommonMeta($spln_itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta spln_itm_grp_nm6_META = createCommonMeta($spln_itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta spln_itm_grp_cd7_META = createCommonMeta($spln_itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta spln_itm_grp_nm7_META = createCommonMeta($spln_itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta spln_itm_grp_cd8_META = createCommonMeta($spln_itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta spln_itm_grp_nm8_META = createCommonMeta($spln_itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta spln_itm_grp_cd9_META = createCommonMeta($spln_itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta spln_itm_grp_nm9_META = createCommonMeta($spln_itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta spln_itm_grp_cd10_META = createCommonMeta($spln_itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta spln_itm_grp_nm10_META = createCommonMeta($spln_itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ym_META,
			st_ym_fr_META,
			st_ym_to_META,
			end_ym_fr_META,
			end_ym_to_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			spln_itm_cd_META,
			spln_itm_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			off_del_flg_META,
			on_del_flg_META,
			memo1_META,
			memo2_META,
			memo3_META,
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
			spln_itm_grp_cd1_META,
			spln_itm_grp_nm1_META,
			spln_itm_grp_cd2_META,
			spln_itm_grp_nm2_META,
			spln_itm_grp_cd3_META,
			spln_itm_grp_nm3_META,
			spln_itm_grp_cd4_META,
			spln_itm_grp_nm4_META,
			spln_itm_grp_cd5_META,
			spln_itm_grp_nm5_META,
			spln_itm_grp_cd6_META,
			spln_itm_grp_nm6_META,
			spln_itm_grp_cd7_META,
			spln_itm_grp_nm7_META,
			spln_itm_grp_cd8_META,
			spln_itm_grp_nm8_META,
			spln_itm_grp_cd9_META,
			spln_itm_grp_nm9_META,
			spln_itm_grp_cd10_META,
			spln_itm_grp_nm10_META
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Application month 適用年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 0, $ym);
	}

	/**
	 * Application month 適用年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 0, $ym, value);
	}


	/**
	 * Application start month FROM 適用開始年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_ym_fr() {
		return getConstDate(offset + 1, $st_ym_fr);
	}

	/**
	 * Application start month FROM 適用開始年月ＦＲＯＭ.<p>
	 *
	 */
	public void st_ym_fr(MCDate value) {
		setConstDate(offset + 1, $st_ym_fr, value);
	}


	/**
	 * Application start month TO 適用開始年月ＴＯ.<p>
	 *
	 */
	public MCDate st_ym_to() {
		return getConstDate(offset + 2, $st_ym_to);
	}

	/**
	 * Application start month TO 適用開始年月ＴＯ.<p>
	 *
	 */
	public void st_ym_to(MCDate value) {
		setConstDate(offset + 2, $st_ym_to, value);
	}


	/**
	 * Application end month FROM 適用終了年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_ym_fr() {
		return getConstDate(offset + 3, $end_ym_fr);
	}

	/**
	 * Application end month FROM 適用終了年月ＦＲＯＭ.<p>
	 *
	 */
	public void end_ym_fr(MCDate value) {
		setConstDate(offset + 3, $end_ym_fr, value);
	}


	/**
	 * Application end date TO 適用終了年月ＴＯ.<p>
	 *
	 */
	public MCDate end_ym_to() {
		return getConstDate(offset + 4, $end_ym_to);
	}

	/**
	 * Application end date TO 適用終了年月ＴＯ.<p>
	 *
	 */
	public void end_ym_to(MCDate value) {
		setConstDate(offset + 4, $end_ym_to, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 5, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 5, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 6, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 6, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 7, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 7, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 8, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 8, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 9, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 9, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 10, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 10, $itm_typ, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 11, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 11, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 12, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 12, $itm_typ_d_nm, value);
	}


	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public String spln_itm_cd() {
		return getConstString(offset + 13, $spln_itm_cd);
	}

	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public void spln_itm_cd(String value) {
		setConstString(offset + 13, $spln_itm_cd, value);
	}


	/**
	 * Plan item name 計画品目名.<p>
	 *
	 */
	public String spln_itm_nm() {
		return getConstString(offset + 14, $spln_itm_nm);
	}

	/**
	 * Plan item name 計画品目名.<p>
	 *
	 */
	public void spln_itm_nm(String value) {
		setConstString(offset + 14, $spln_itm_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 15, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 15, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 16, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 16, $dpt_nm, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 17, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 17, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 18, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 18, $on_del_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 19, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 19, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 20, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 20, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 21, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 21, $memo3, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 22, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 22, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 23, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 23, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 24, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 24, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 25, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 25, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 26, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 26, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 27, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 27, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 28, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 28, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 29, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 29, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 30, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 30, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 31, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 31, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 32, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 32, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 33, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 33, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 34, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 34, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 35, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 35, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 36, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 36, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 37, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 37, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 38, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 38, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 39, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 39, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 40, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 40, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 41, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 41, $itm_grp_nm10, value);
	}


	/**
	 * Plan item classification cd. 1 計画品目分類ＣＤ１.<p>
	 *
	 */
	public String spln_itm_grp_cd1() {
		return getConstString(offset + 42, $spln_itm_grp_cd1);
	}

	/**
	 * Plan item classification cd. 1 計画品目分類ＣＤ１.<p>
	 *
	 */
	public void spln_itm_grp_cd1(String value) {
		setConstString(offset + 42, $spln_itm_grp_cd1, value);
	}


	/**
	 * Plan item classification name 1 計画品目分類名１.<p>
	 *
	 */
	public String spln_itm_grp_nm1() {
		return getConstString(offset + 43, $spln_itm_grp_nm1);
	}

	/**
	 * Plan item classification name 1 計画品目分類名１.<p>
	 *
	 */
	public void spln_itm_grp_nm1(String value) {
		setConstString(offset + 43, $spln_itm_grp_nm1, value);
	}


	/**
	 * Plan item classification cd. 2 計画品目分類ＣＤ２.<p>
	 *
	 */
	public String spln_itm_grp_cd2() {
		return getConstString(offset + 44, $spln_itm_grp_cd2);
	}

	/**
	 * Plan item classification cd. 2 計画品目分類ＣＤ２.<p>
	 *
	 */
	public void spln_itm_grp_cd2(String value) {
		setConstString(offset + 44, $spln_itm_grp_cd2, value);
	}


	/**
	 * Plan item classification name 2 計画品目分類名２.<p>
	 *
	 */
	public String spln_itm_grp_nm2() {
		return getConstString(offset + 45, $spln_itm_grp_nm2);
	}

	/**
	 * Plan item classification name 2 計画品目分類名２.<p>
	 *
	 */
	public void spln_itm_grp_nm2(String value) {
		setConstString(offset + 45, $spln_itm_grp_nm2, value);
	}


	/**
	 * Plan item classification cd. 3 計画品目分類ＣＤ３.<p>
	 *
	 */
	public String spln_itm_grp_cd3() {
		return getConstString(offset + 46, $spln_itm_grp_cd3);
	}

	/**
	 * Plan item classification cd. 3 計画品目分類ＣＤ３.<p>
	 *
	 */
	public void spln_itm_grp_cd3(String value) {
		setConstString(offset + 46, $spln_itm_grp_cd3, value);
	}


	/**
	 * Plan item classification name 3 計画品目分類名３.<p>
	 *
	 */
	public String spln_itm_grp_nm3() {
		return getConstString(offset + 47, $spln_itm_grp_nm3);
	}

	/**
	 * Plan item classification name 3 計画品目分類名３.<p>
	 *
	 */
	public void spln_itm_grp_nm3(String value) {
		setConstString(offset + 47, $spln_itm_grp_nm3, value);
	}


	/**
	 * Plan item classification cd. 4 計画品目分類ＣＤ４.<p>
	 *
	 */
	public String spln_itm_grp_cd4() {
		return getConstString(offset + 48, $spln_itm_grp_cd4);
	}

	/**
	 * Plan item classification cd. 4 計画品目分類ＣＤ４.<p>
	 *
	 */
	public void spln_itm_grp_cd4(String value) {
		setConstString(offset + 48, $spln_itm_grp_cd4, value);
	}


	/**
	 * Plan item classification name 4 計画品目分類名４.<p>
	 *
	 */
	public String spln_itm_grp_nm4() {
		return getConstString(offset + 49, $spln_itm_grp_nm4);
	}

	/**
	 * Plan item classification name 4 計画品目分類名４.<p>
	 *
	 */
	public void spln_itm_grp_nm4(String value) {
		setConstString(offset + 49, $spln_itm_grp_nm4, value);
	}


	/**
	 * Plan item classification cd. 5 計画品目分類ＣＤ５.<p>
	 *
	 */
	public String spln_itm_grp_cd5() {
		return getConstString(offset + 50, $spln_itm_grp_cd5);
	}

	/**
	 * Plan item classification cd. 5 計画品目分類ＣＤ５.<p>
	 *
	 */
	public void spln_itm_grp_cd5(String value) {
		setConstString(offset + 50, $spln_itm_grp_cd5, value);
	}


	/**
	 * Plan item classification name 5 計画品目分類名５.<p>
	 *
	 */
	public String spln_itm_grp_nm5() {
		return getConstString(offset + 51, $spln_itm_grp_nm5);
	}

	/**
	 * Plan item classification name 5 計画品目分類名５.<p>
	 *
	 */
	public void spln_itm_grp_nm5(String value) {
		setConstString(offset + 51, $spln_itm_grp_nm5, value);
	}


	/**
	 * Plan item classification cd. 6 計画品目分類ＣＤ６.<p>
	 *
	 */
	public String spln_itm_grp_cd6() {
		return getConstString(offset + 52, $spln_itm_grp_cd6);
	}

	/**
	 * Plan item classification cd. 6 計画品目分類ＣＤ６.<p>
	 *
	 */
	public void spln_itm_grp_cd6(String value) {
		setConstString(offset + 52, $spln_itm_grp_cd6, value);
	}


	/**
	 * Plan item classification name 6 計画品目分類名６.<p>
	 *
	 */
	public String spln_itm_grp_nm6() {
		return getConstString(offset + 53, $spln_itm_grp_nm6);
	}

	/**
	 * Plan item classification name 6 計画品目分類名６.<p>
	 *
	 */
	public void spln_itm_grp_nm6(String value) {
		setConstString(offset + 53, $spln_itm_grp_nm6, value);
	}


	/**
	 * Plan item classification cd. 7 計画品目分類ＣＤ７.<p>
	 *
	 */
	public String spln_itm_grp_cd7() {
		return getConstString(offset + 54, $spln_itm_grp_cd7);
	}

	/**
	 * Plan item classification cd. 7 計画品目分類ＣＤ７.<p>
	 *
	 */
	public void spln_itm_grp_cd7(String value) {
		setConstString(offset + 54, $spln_itm_grp_cd7, value);
	}


	/**
	 * Plan item classification name 7 計画品目分類名７.<p>
	 *
	 */
	public String spln_itm_grp_nm7() {
		return getConstString(offset + 55, $spln_itm_grp_nm7);
	}

	/**
	 * Plan item classification name 7 計画品目分類名７.<p>
	 *
	 */
	public void spln_itm_grp_nm7(String value) {
		setConstString(offset + 55, $spln_itm_grp_nm7, value);
	}


	/**
	 * Plan item classification cd. 8 計画品目分類ＣＤ８.<p>
	 *
	 */
	public String spln_itm_grp_cd8() {
		return getConstString(offset + 56, $spln_itm_grp_cd8);
	}

	/**
	 * Plan item classification cd. 8 計画品目分類ＣＤ８.<p>
	 *
	 */
	public void spln_itm_grp_cd8(String value) {
		setConstString(offset + 56, $spln_itm_grp_cd8, value);
	}


	/**
	 * Plan item classification name 8 計画品目分類名８.<p>
	 *
	 */
	public String spln_itm_grp_nm8() {
		return getConstString(offset + 57, $spln_itm_grp_nm8);
	}

	/**
	 * Plan item classification name 8 計画品目分類名８.<p>
	 *
	 */
	public void spln_itm_grp_nm8(String value) {
		setConstString(offset + 57, $spln_itm_grp_nm8, value);
	}


	/**
	 * Plan item classification cd. 9 計画品目分類ＣＤ９.<p>
	 *
	 */
	public String spln_itm_grp_cd9() {
		return getConstString(offset + 58, $spln_itm_grp_cd9);
	}

	/**
	 * Plan item classification cd. 9 計画品目分類ＣＤ９.<p>
	 *
	 */
	public void spln_itm_grp_cd9(String value) {
		setConstString(offset + 58, $spln_itm_grp_cd9, value);
	}


	/**
	 * Plan item classification name 9 計画品目分類名９.<p>
	 *
	 */
	public String spln_itm_grp_nm9() {
		return getConstString(offset + 59, $spln_itm_grp_nm9);
	}

	/**
	 * Plan item classification name 9 計画品目分類名９.<p>
	 *
	 */
	public void spln_itm_grp_nm9(String value) {
		setConstString(offset + 59, $spln_itm_grp_nm9, value);
	}


	/**
	 * Plan item classification cd. 10 計画品目分類ＣＤ１０.<p>
	 *
	 */
	public String spln_itm_grp_cd10() {
		return getConstString(offset + 60, $spln_itm_grp_cd10);
	}

	/**
	 * Plan item classification cd. 10 計画品目分類ＣＤ１０.<p>
	 *
	 */
	public void spln_itm_grp_cd10(String value) {
		setConstString(offset + 60, $spln_itm_grp_cd10, value);
	}


	/**
	 * Plan item classification name 10 計画品目分類名１０.<p>
	 *
	 */
	public String spln_itm_grp_nm10() {
		return getConstString(offset + 61, $spln_itm_grp_nm10);
	}

	/**
	 * Plan item classification name 10 計画品目分類名１０.<p>
	 *
	 */
	public void spln_itm_grp_nm10(String value) {
		setConstString(offset + 61, $spln_itm_grp_nm10, value);
	}


	public String getString(String name) {
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
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			return spln_itm_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
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
		if ($spln_itm_grp_cd1.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd1();
		}
		if ($spln_itm_grp_nm1.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm1();
		}
		if ($spln_itm_grp_cd2.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd2();
		}
		if ($spln_itm_grp_nm2.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm2();
		}
		if ($spln_itm_grp_cd3.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd3();
		}
		if ($spln_itm_grp_nm3.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm3();
		}
		if ($spln_itm_grp_cd4.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd4();
		}
		if ($spln_itm_grp_nm4.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm4();
		}
		if ($spln_itm_grp_cd5.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd5();
		}
		if ($spln_itm_grp_nm5.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm5();
		}
		if ($spln_itm_grp_cd6.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd6();
		}
		if ($spln_itm_grp_nm6.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm6();
		}
		if ($spln_itm_grp_cd7.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd7();
		}
		if ($spln_itm_grp_nm7.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm7();
		}
		if ($spln_itm_grp_cd8.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd8();
		}
		if ($spln_itm_grp_nm8.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm8();
		}
		if ($spln_itm_grp_cd9.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd9();
		}
		if ($spln_itm_grp_nm9.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm9();
		}
		if ($spln_itm_grp_cd10.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd10();
		}
		if ($spln_itm_grp_nm10.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm10();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($st_ym_fr.equalsIgnoreCase(name)) {
			return st_ym_fr();
		}
		if ($st_ym_to.equalsIgnoreCase(name)) {
			return st_ym_to();
		}
		if ($end_ym_fr.equalsIgnoreCase(name)) {
			return end_ym_fr();
		}
		if ($end_ym_to.equalsIgnoreCase(name)) {
			return end_ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			return spln_itm_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
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
		if ($spln_itm_grp_cd1.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd1();
		}
		if ($spln_itm_grp_nm1.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm1();
		}
		if ($spln_itm_grp_cd2.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd2();
		}
		if ($spln_itm_grp_nm2.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm2();
		}
		if ($spln_itm_grp_cd3.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd3();
		}
		if ($spln_itm_grp_nm3.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm3();
		}
		if ($spln_itm_grp_cd4.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd4();
		}
		if ($spln_itm_grp_nm4.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm4();
		}
		if ($spln_itm_grp_cd5.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd5();
		}
		if ($spln_itm_grp_nm5.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm5();
		}
		if ($spln_itm_grp_cd6.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd6();
		}
		if ($spln_itm_grp_nm6.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm6();
		}
		if ($spln_itm_grp_cd7.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd7();
		}
		if ($spln_itm_grp_nm7.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm7();
		}
		if ($spln_itm_grp_cd8.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd8();
		}
		if ($spln_itm_grp_nm8.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm8();
		}
		if ($spln_itm_grp_cd9.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd9();
		}
		if ($spln_itm_grp_nm9.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm9();
		}
		if ($spln_itm_grp_cd10.equalsIgnoreCase(name)) {
			return spln_itm_grp_cd10();
		}
		if ($spln_itm_grp_nm10.equalsIgnoreCase(name)) {
			return spln_itm_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($st_ym_fr.equalsIgnoreCase(name)) {
			return st_ym_fr();
		}
		if ($st_ym_to.equalsIgnoreCase(name)) {
			return st_ym_to();
		}
		if ($end_ym_fr.equalsIgnoreCase(name)) {
			return end_ym_fr();
		}
		if ($end_ym_to.equalsIgnoreCase(name)) {
			return end_ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			spln_itm_nm(value);
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
		if ($spln_itm_grp_cd1.equalsIgnoreCase(name)) {
			spln_itm_grp_cd1(value);
			return;
		}
		if ($spln_itm_grp_nm1.equalsIgnoreCase(name)) {
			spln_itm_grp_nm1(value);
			return;
		}
		if ($spln_itm_grp_cd2.equalsIgnoreCase(name)) {
			spln_itm_grp_cd2(value);
			return;
		}
		if ($spln_itm_grp_nm2.equalsIgnoreCase(name)) {
			spln_itm_grp_nm2(value);
			return;
		}
		if ($spln_itm_grp_cd3.equalsIgnoreCase(name)) {
			spln_itm_grp_cd3(value);
			return;
		}
		if ($spln_itm_grp_nm3.equalsIgnoreCase(name)) {
			spln_itm_grp_nm3(value);
			return;
		}
		if ($spln_itm_grp_cd4.equalsIgnoreCase(name)) {
			spln_itm_grp_cd4(value);
			return;
		}
		if ($spln_itm_grp_nm4.equalsIgnoreCase(name)) {
			spln_itm_grp_nm4(value);
			return;
		}
		if ($spln_itm_grp_cd5.equalsIgnoreCase(name)) {
			spln_itm_grp_cd5(value);
			return;
		}
		if ($spln_itm_grp_nm5.equalsIgnoreCase(name)) {
			spln_itm_grp_nm5(value);
			return;
		}
		if ($spln_itm_grp_cd6.equalsIgnoreCase(name)) {
			spln_itm_grp_cd6(value);
			return;
		}
		if ($spln_itm_grp_nm6.equalsIgnoreCase(name)) {
			spln_itm_grp_nm6(value);
			return;
		}
		if ($spln_itm_grp_cd7.equalsIgnoreCase(name)) {
			spln_itm_grp_cd7(value);
			return;
		}
		if ($spln_itm_grp_nm7.equalsIgnoreCase(name)) {
			spln_itm_grp_nm7(value);
			return;
		}
		if ($spln_itm_grp_cd8.equalsIgnoreCase(name)) {
			spln_itm_grp_cd8(value);
			return;
		}
		if ($spln_itm_grp_nm8.equalsIgnoreCase(name)) {
			spln_itm_grp_nm8(value);
			return;
		}
		if ($spln_itm_grp_cd9.equalsIgnoreCase(name)) {
			spln_itm_grp_cd9(value);
			return;
		}
		if ($spln_itm_grp_nm9.equalsIgnoreCase(name)) {
			spln_itm_grp_nm9(value);
			return;
		}
		if ($spln_itm_grp_cd10.equalsIgnoreCase(name)) {
			spln_itm_grp_cd10(value);
			return;
		}
		if ($spln_itm_grp_nm10.equalsIgnoreCase(name)) {
			spln_itm_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($st_ym_fr.equalsIgnoreCase(name)) {
			st_ym_fr(value);
			return;
		}
		if ($st_ym_to.equalsIgnoreCase(name)) {
			st_ym_to(value);
			return;
		}
		if ($end_ym_fr.equalsIgnoreCase(name)) {
			end_ym_fr(value);
			return;
		}
		if ($end_ym_to.equalsIgnoreCase(name)) {
			end_ym_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
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
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			spln_itm_nm(value);
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
		if ($spln_itm_grp_cd1.equalsIgnoreCase(name)) {
			spln_itm_grp_cd1(value);
			return;
		}
		if ($spln_itm_grp_nm1.equalsIgnoreCase(name)) {
			spln_itm_grp_nm1(value);
			return;
		}
		if ($spln_itm_grp_cd2.equalsIgnoreCase(name)) {
			spln_itm_grp_cd2(value);
			return;
		}
		if ($spln_itm_grp_nm2.equalsIgnoreCase(name)) {
			spln_itm_grp_nm2(value);
			return;
		}
		if ($spln_itm_grp_cd3.equalsIgnoreCase(name)) {
			spln_itm_grp_cd3(value);
			return;
		}
		if ($spln_itm_grp_nm3.equalsIgnoreCase(name)) {
			spln_itm_grp_nm3(value);
			return;
		}
		if ($spln_itm_grp_cd4.equalsIgnoreCase(name)) {
			spln_itm_grp_cd4(value);
			return;
		}
		if ($spln_itm_grp_nm4.equalsIgnoreCase(name)) {
			spln_itm_grp_nm4(value);
			return;
		}
		if ($spln_itm_grp_cd5.equalsIgnoreCase(name)) {
			spln_itm_grp_cd5(value);
			return;
		}
		if ($spln_itm_grp_nm5.equalsIgnoreCase(name)) {
			spln_itm_grp_nm5(value);
			return;
		}
		if ($spln_itm_grp_cd6.equalsIgnoreCase(name)) {
			spln_itm_grp_cd6(value);
			return;
		}
		if ($spln_itm_grp_nm6.equalsIgnoreCase(name)) {
			spln_itm_grp_nm6(value);
			return;
		}
		if ($spln_itm_grp_cd7.equalsIgnoreCase(name)) {
			spln_itm_grp_cd7(value);
			return;
		}
		if ($spln_itm_grp_nm7.equalsIgnoreCase(name)) {
			spln_itm_grp_nm7(value);
			return;
		}
		if ($spln_itm_grp_cd8.equalsIgnoreCase(name)) {
			spln_itm_grp_cd8(value);
			return;
		}
		if ($spln_itm_grp_nm8.equalsIgnoreCase(name)) {
			spln_itm_grp_nm8(value);
			return;
		}
		if ($spln_itm_grp_cd9.equalsIgnoreCase(name)) {
			spln_itm_grp_cd9(value);
			return;
		}
		if ($spln_itm_grp_nm9.equalsIgnoreCase(name)) {
			spln_itm_grp_nm9(value);
			return;
		}
		if ($spln_itm_grp_cd10.equalsIgnoreCase(name)) {
			spln_itm_grp_cd10(value);
			return;
		}
		if ($spln_itm_grp_nm10.equalsIgnoreCase(name)) {
			spln_itm_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($st_ym_fr.equalsIgnoreCase(name)) {
			st_ym_fr(value);
			return;
		}
		if ($st_ym_to.equalsIgnoreCase(name)) {
			st_ym_to(value);
			return;
		}
		if ($end_ym_fr.equalsIgnoreCase(name)) {
			end_ym_fr(value);
			return;
		}
		if ($end_ym_to.equalsIgnoreCase(name)) {
			end_ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
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



}

