package mcframe.clientMABS.MABSP1070;

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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public static final String $set_grp_cd = "set_grp_cd";
	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public static final String $set_grp_nm = "set_grp_nm";
	public static final String $main_itm_typ_p = "main_itm_typ_p";
	public static final String $main_itm_p = "main_itm_p";
	public static final String $set_itm_typ_p = "set_itm_typ_p";
	public static final String $set_itm_p = "set_itm_p";
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
	 * Representative item classification cd. 1 代表品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $main_itm_grp_cd1 = "main_itm_grp_cd1";
	/**
	 * Representative item classification name 1 代表品目分類名１.<p>
	 *
	 */
	public static final String $main_itm_grp_nm1 = "main_itm_grp_nm1";
	/**
	 * Representative item classification cd. 2 代表品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $main_itm_grp_cd2 = "main_itm_grp_cd2";
	/**
	 * Representative item classification name 2 代表品目分類名２.<p>
	 *
	 */
	public static final String $main_itm_grp_nm2 = "main_itm_grp_nm2";
	/**
	 * Representative item classification cd. 3 代表品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $main_itm_grp_cd3 = "main_itm_grp_cd3";
	/**
	 * Representative item classification name 3 代表品目分類名３.<p>
	 *
	 */
	public static final String $main_itm_grp_nm3 = "main_itm_grp_nm3";
	/**
	 * Representative item classification cd. 4 代表品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $main_itm_grp_cd4 = "main_itm_grp_cd4";
	/**
	 * Representative item classification name 4 代表品目分類名４.<p>
	 *
	 */
	public static final String $main_itm_grp_nm4 = "main_itm_grp_nm4";
	/**
	 * Representative item classification cd. 5 代表品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $main_itm_grp_cd5 = "main_itm_grp_cd5";
	/**
	 * Representative item classification name 5 代表品目分類名５.<p>
	 *
	 */
	public static final String $main_itm_grp_nm5 = "main_itm_grp_nm5";
	/**
	 * Representative item classification cd. 6 代表品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $main_itm_grp_cd6 = "main_itm_grp_cd6";
	/**
	 * Representative item classification name 6 代表品目分類名６.<p>
	 *
	 */
	public static final String $main_itm_grp_nm6 = "main_itm_grp_nm6";
	/**
	 * Representative item classification cd. 7 代表品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $main_itm_grp_cd7 = "main_itm_grp_cd7";
	/**
	 * Representative item classification name 7 代表品目分類名７.<p>
	 *
	 */
	public static final String $main_itm_grp_nm7 = "main_itm_grp_nm7";
	/**
	 * Representative item classification cd. 8 代表品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $main_itm_grp_cd8 = "main_itm_grp_cd8";
	/**
	 * Representative item classification name 8 代表品目分類名８.<p>
	 *
	 */
	public static final String $main_itm_grp_nm8 = "main_itm_grp_nm8";
	/**
	 * Representative item classification cd. 9 代表品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $main_itm_grp_cd9 = "main_itm_grp_cd9";
	/**
	 * Representative item classification name 9 代表品目分類名９.<p>
	 *
	 */
	public static final String $main_itm_grp_nm9 = "main_itm_grp_nm9";
	/**
	 * Representative item classification cd. 10 代表品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $main_itm_grp_cd10 = "main_itm_grp_cd10";
	/**
	 * Representative item classification name 10 代表品目分類名１０.<p>
	 *
	 */
	public static final String $main_itm_grp_nm10 = "main_itm_grp_nm10";
	/**
	 * Assortment item classification cd. 1 品揃品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $set_itm_grp_cd1 = "set_itm_grp_cd1";
	/**
	 * Assortment item classification name 1 品揃品目分類名１.<p>
	 *
	 */
	public static final String $set_itm_grp_nm1 = "set_itm_grp_nm1";
	/**
	 * Assortment item classification cd. 2 品揃品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $set_itm_grp_cd2 = "set_itm_grp_cd2";
	/**
	 * Assortment item classification name 2 品揃品目分類名２.<p>
	 *
	 */
	public static final String $set_itm_grp_nm2 = "set_itm_grp_nm2";
	/**
	 * Assortment item classification cd. 3 品揃品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $set_itm_grp_cd3 = "set_itm_grp_cd3";
	/**
	 * Assortment item classification name 3 品揃品目分類名３.<p>
	 *
	 */
	public static final String $set_itm_grp_nm3 = "set_itm_grp_nm3";
	/**
	 * Assortment item classification cd. 4 品揃品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $set_itm_grp_cd4 = "set_itm_grp_cd4";
	/**
	 * Assortment item classification name 4 品揃品目分類名４.<p>
	 *
	 */
	public static final String $set_itm_grp_nm4 = "set_itm_grp_nm4";
	/**
	 * Assortment item classification cd. 5 品揃品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $set_itm_grp_cd5 = "set_itm_grp_cd5";
	/**
	 * Assortment item classification name 5 品揃品目分類名５.<p>
	 *
	 */
	public static final String $set_itm_grp_nm5 = "set_itm_grp_nm5";
	/**
	 * Assortment item classification cd. 6 品揃品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $set_itm_grp_cd6 = "set_itm_grp_cd6";
	/**
	 * Assortment item classification name 6 品揃品目分類名６.<p>
	 *
	 */
	public static final String $set_itm_grp_nm6 = "set_itm_grp_nm6";
	/**
	 * Assortment item classification cd. 7 品揃品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $set_itm_grp_cd7 = "set_itm_grp_cd7";
	/**
	 * Assortment item classification name 7 品揃品目分類名７.<p>
	 *
	 */
	public static final String $set_itm_grp_nm7 = "set_itm_grp_nm7";
	/**
	 * Assortment item classification cd. 8 品揃品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $set_itm_grp_cd8 = "set_itm_grp_cd8";
	/**
	 * Assortment item classification name 8 品揃品目分類名８.<p>
	 *
	 */
	public static final String $set_itm_grp_nm8 = "set_itm_grp_nm8";
	/**
	 * Assortment item classification cd. 9 品揃品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $set_itm_grp_cd9 = "set_itm_grp_cd9";
	/**
	 * Assortment item classification name 9 品揃品目分類名９.<p>
	 *
	 */
	public static final String $set_itm_grp_nm9 = "set_itm_grp_nm9";
	/**
	 * Assortment item classification cd. 10 品揃品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $set_itm_grp_cd10 = "set_itm_grp_cd10";
	/**
	 * Assortment item classification name 10 品揃品目分類名１０.<p>
	 *
	 */
	public static final String $set_itm_grp_nm10 = "set_itm_grp_nm10";

	public static final String $main_itm_typ = $main_itm_typ_p + ".itm_typ";
	public static final String $main_itm_typ_nm = $main_itm_typ_p + ".itm_typ_nm";
	public static final String $main_itm_typ_d_cd = $main_itm_typ_p + ".itm_typ_d_cd";
	public static final String $main_itm_typ_d_nm = $main_itm_typ_p + ".itm_typ_d_nm";
	public static final String $main_itm_cd = $main_itm_p + ".itm_cd";
	public static final String $main_itm_sub1 = $main_itm_p + ".itm_sub1";
	public static final String $main_itm_sub2 = $main_itm_p + ".itm_sub2";
	public static final String $main_itm_sub3 = $main_itm_p + ".itm_sub3";
	public static final String $main_itm_nm = $main_itm_p + ".itm_nm";
	public static final String $set_itm_typ = $set_itm_typ_p + ".itm_typ";
	public static final String $set_itm_typ_nm = $set_itm_typ_p + ".itm_typ_nm";
	public static final String $set_itm_typ_d_cd = $set_itm_typ_p + ".itm_typ_d_cd";
	public static final String $set_itm_typ_d_nm = $set_itm_typ_p + ".itm_typ_d_nm";
	public static final String $set_itm_cd = $set_itm_p + ".itm_cd";
	public static final String $set_itm_sub1 = $set_itm_p + ".itm_sub1";
	public static final String $set_itm_sub2 = $set_itm_p + ".itm_sub2";
	public static final String $set_itm_sub3 = $set_itm_p + ".itm_sub3";
	public static final String $set_itm_nm = $set_itm_p + ".itm_nm";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta set_grp_cd_META = createCommonMeta($set_grp_cd, mcframe.commonMA.meta.MA_META.SET_GRP_CD);
	public static final MCMeta set_grp_nm_META = createCommonMeta($set_grp_nm, mcframe.commonMA.meta.MA_META.SET_GRP_NM);
	public static final MCMeta main_itm_typ_p_META = createInnerRowMeta($main_itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta main_itm_p_META = createInnerRowMeta($main_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta set_itm_typ_p_META = createInnerRowMeta($set_itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta set_itm_p_META = createInnerRowMeta($set_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta main_itm_grp_cd1_META = createCommonMeta($main_itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta main_itm_grp_nm1_META = createCommonMeta($main_itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta main_itm_grp_cd2_META = createCommonMeta($main_itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta main_itm_grp_nm2_META = createCommonMeta($main_itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta main_itm_grp_cd3_META = createCommonMeta($main_itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta main_itm_grp_nm3_META = createCommonMeta($main_itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta main_itm_grp_cd4_META = createCommonMeta($main_itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta main_itm_grp_nm4_META = createCommonMeta($main_itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta main_itm_grp_cd5_META = createCommonMeta($main_itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta main_itm_grp_nm5_META = createCommonMeta($main_itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta main_itm_grp_cd6_META = createCommonMeta($main_itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta main_itm_grp_nm6_META = createCommonMeta($main_itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta main_itm_grp_cd7_META = createCommonMeta($main_itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta main_itm_grp_nm7_META = createCommonMeta($main_itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta main_itm_grp_cd8_META = createCommonMeta($main_itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta main_itm_grp_nm8_META = createCommonMeta($main_itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta main_itm_grp_cd9_META = createCommonMeta($main_itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta main_itm_grp_nm9_META = createCommonMeta($main_itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta main_itm_grp_cd10_META = createCommonMeta($main_itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta main_itm_grp_nm10_META = createCommonMeta($main_itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta set_itm_grp_cd1_META = createCommonMeta($set_itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta set_itm_grp_nm1_META = createCommonMeta($set_itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta set_itm_grp_cd2_META = createCommonMeta($set_itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta set_itm_grp_nm2_META = createCommonMeta($set_itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta set_itm_grp_cd3_META = createCommonMeta($set_itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta set_itm_grp_nm3_META = createCommonMeta($set_itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta set_itm_grp_cd4_META = createCommonMeta($set_itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta set_itm_grp_nm4_META = createCommonMeta($set_itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta set_itm_grp_cd5_META = createCommonMeta($set_itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta set_itm_grp_nm5_META = createCommonMeta($set_itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta set_itm_grp_cd6_META = createCommonMeta($set_itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta set_itm_grp_nm6_META = createCommonMeta($set_itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta set_itm_grp_cd7_META = createCommonMeta($set_itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta set_itm_grp_nm7_META = createCommonMeta($set_itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta set_itm_grp_cd8_META = createCommonMeta($set_itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta set_itm_grp_nm8_META = createCommonMeta($set_itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta set_itm_grp_cd9_META = createCommonMeta($set_itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta set_itm_grp_nm9_META = createCommonMeta($set_itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta set_itm_grp_cd10_META = createCommonMeta($set_itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta set_itm_grp_nm10_META = createCommonMeta($set_itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			set_grp_cd_META,
			set_grp_nm_META,
			main_itm_typ_p_META,
			main_itm_p_META,
			set_itm_typ_p_META,
			set_itm_p_META,
			memo1_META,
			memo2_META,
			memo3_META,
			off_del_flg_META,
			on_del_flg_META,
			main_itm_grp_cd1_META,
			main_itm_grp_nm1_META,
			main_itm_grp_cd2_META,
			main_itm_grp_nm2_META,
			main_itm_grp_cd3_META,
			main_itm_grp_nm3_META,
			main_itm_grp_cd4_META,
			main_itm_grp_nm4_META,
			main_itm_grp_cd5_META,
			main_itm_grp_nm5_META,
			main_itm_grp_cd6_META,
			main_itm_grp_nm6_META,
			main_itm_grp_cd7_META,
			main_itm_grp_nm7_META,
			main_itm_grp_cd8_META,
			main_itm_grp_nm8_META,
			main_itm_grp_cd9_META,
			main_itm_grp_nm9_META,
			main_itm_grp_cd10_META,
			main_itm_grp_nm10_META,
			set_itm_grp_cd1_META,
			set_itm_grp_nm1_META,
			set_itm_grp_cd2_META,
			set_itm_grp_nm2_META,
			set_itm_grp_cd3_META,
			set_itm_grp_nm3_META,
			set_itm_grp_cd4_META,
			set_itm_grp_nm4_META,
			set_itm_grp_cd5_META,
			set_itm_grp_nm5_META,
			set_itm_grp_cd6_META,
			set_itm_grp_nm6_META,
			set_itm_grp_cd7_META,
			set_itm_grp_nm7_META,
			set_itm_grp_cd8_META,
			set_itm_grp_nm8_META,
			set_itm_grp_cd9_META,
			set_itm_grp_nm9_META,
			set_itm_grp_cd10_META,
			set_itm_grp_nm10_META
		},
		new String[][]{
			{
				"main_itm_typ",
				"main_itm_typ_nm",
				"main_itm_typ_d_cd",
				"main_itm_typ_d_nm",
				"main_itm_cd",
				"main_itm_sub1",
				"main_itm_sub2",
				"main_itm_sub3",
				"main_itm_nm",
				"set_itm_typ",
				"set_itm_typ_nm",
				"set_itm_typ_d_cd",
				"set_itm_typ_d_nm",
				"set_itm_cd",
				"set_itm_sub1",
				"set_itm_sub2",
				"set_itm_sub3",
				"set_itm_nm"
			},
			{
				$main_itm_typ,
				$main_itm_typ_nm,
				$main_itm_typ_d_cd,
				$main_itm_typ_d_nm,
				$main_itm_cd,
				$main_itm_sub1,
				$main_itm_sub2,
				$main_itm_sub3,
				$main_itm_nm,
				$set_itm_typ,
				$set_itm_typ_nm,
				$set_itm_typ_d_cd,
				$set_itm_typ_d_nm,
				$set_itm_cd,
				$set_itm_sub1,
				$set_itm_sub2,
				$set_itm_sub3,
				$set_itm_nm
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$main_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3"},	// main_itm_p.itm_cd
				{$main_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3"},	// main_itm_p.itm_sub1
				{$main_itm_p + ".itm_sub2", "itm_nm;itm_sub3"},	// main_itm_p.itm_sub2
				{$main_itm_p + ".itm_sub3", "itm_nm"},	// main_itm_p.itm_sub3
				{$set_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3"},	// set_itm_p.itm_cd
				{$set_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3"},	// set_itm_p.itm_sub1
				{$set_itm_p + ".itm_sub2", "itm_nm;itm_sub3"},	// set_itm_p.itm_sub2
				{$set_itm_p + ".itm_sub3", "itm_nm"},	// set_itm_p.itm_sub3
				{$main_itm_grp_cd1, "itm_grp_nm"},	// main_itm_grp_cd1
				{$main_itm_grp_cd2, "itm_grp_nm"},	// main_itm_grp_cd2
				{$main_itm_grp_cd3, "itm_grp_nm"},	// main_itm_grp_cd3
				{$main_itm_grp_cd4, "itm_grp_nm"},	// main_itm_grp_cd4
				{$main_itm_grp_cd5, "itm_grp_nm"},	// main_itm_grp_cd5
				{$main_itm_grp_cd6, "itm_grp_nm"},	// main_itm_grp_cd6
				{$main_itm_grp_cd7, "itm_grp_nm"},	// main_itm_grp_cd7
				{$main_itm_grp_cd8, "itm_grp_nm"},	// main_itm_grp_cd8
				{$main_itm_grp_cd9, "itm_grp_nm"},	// main_itm_grp_cd9
				{$main_itm_grp_cd10, "itm_grp_nm"},	// main_itm_grp_cd10
				{$set_itm_grp_cd1, "itm_grp_nm"},	// set_itm_grp_cd1
				{$set_itm_grp_cd2, "itm_grp_nm"},	// set_itm_grp_cd2
				{$set_itm_grp_cd3, "itm_grp_nm"},	// set_itm_grp_cd3
				{$set_itm_grp_cd4, "itm_grp_nm"},	// set_itm_grp_cd4
				{$set_itm_grp_cd5, "itm_grp_nm"},	// set_itm_grp_cd5
				{$set_itm_grp_cd6, "itm_grp_nm"},	// set_itm_grp_cd6
				{$set_itm_grp_cd7, "itm_grp_nm"},	// set_itm_grp_cd7
				{$set_itm_grp_cd8, "itm_grp_nm"},	// set_itm_grp_cd8
				{$set_itm_grp_cd9, "itm_grp_nm"},	// set_itm_grp_cd9
				{$set_itm_grp_cd10, "itm_grp_nm"}	// set_itm_grp_cd10
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$main_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// main_itm_p.itm_cd
				{$main_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;main_itm_cd"},	// main_itm_p.itm_sub1
				{$main_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;main_itm_cd;main_itm_sub1"},	// main_itm_p.itm_sub2
				{$main_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;main_itm_cd;main_itm_sub1;main_itm_sub2"},	// main_itm_p.itm_sub3
				{$set_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// set_itm_p.itm_cd
				{$set_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;set_itm_cd"},	// set_itm_p.itm_sub1
				{$set_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;set_itm_cd;set_itm_sub1"},	// set_itm_p.itm_sub2
				{$set_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;set_itm_cd;set_itm_sub1;set_itm_sub2"}	// set_itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$main_itm_p + ".itm_cd", "itm_is_srch_typ"},	// main_itm_p.itm_cd
				{$main_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// main_itm_p.itm_sub1
				{$main_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// main_itm_p.itm_sub2
				{$main_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// main_itm_p.itm_sub3
				{$set_itm_p + ".itm_cd", "itm_is_srch_typ"},	// set_itm_p.itm_cd
				{$set_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// set_itm_p.itm_sub1
				{$set_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// set_itm_p.itm_sub2
				{$set_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// set_itm_p.itm_sub3
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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public String set_grp_cd() {
		return getConstString(offset + 1, $set_grp_cd);
	}

	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public void set_grp_cd(String value) {
		setConstString(offset + 1, $set_grp_cd, value);
	}


	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public String set_grp_nm() {
		return getConstString(offset + 2, $set_grp_nm);
	}

	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public void set_grp_nm(String value) {
		setConstString(offset + 2, $set_grp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR main_itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 3, $main_itm_typ_p);
	}
	
	public void main_itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 3, $main_itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR main_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 4, $main_itm_p);
	}
	
	public void main_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 4, $main_itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR set_itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 5, $set_itm_typ_p);
	}
	
	public void set_itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 5, $set_itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR set_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 6, $set_itm_p);
	}
	
	public void set_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 6, $set_itm_p, row);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 7, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 7, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 8, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 8, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 9, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 9, $memo3, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 10, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 10, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 11, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 11, $on_del_flg, value);
	}


	/**
	 * Representative item classification cd. 1 代表品目分類ＣＤ１.<p>
	 *
	 */
	public String main_itm_grp_cd1() {
		return getConstString(offset + 12, $main_itm_grp_cd1);
	}

	/**
	 * Representative item classification cd. 1 代表品目分類ＣＤ１.<p>
	 *
	 */
	public void main_itm_grp_cd1(String value) {
		setConstString(offset + 12, $main_itm_grp_cd1, value);
	}


	/**
	 * Representative item classification name 1 代表品目分類名１.<p>
	 *
	 */
	public String main_itm_grp_nm1() {
		return getConstString(offset + 13, $main_itm_grp_nm1);
	}

	/**
	 * Representative item classification name 1 代表品目分類名１.<p>
	 *
	 */
	public void main_itm_grp_nm1(String value) {
		setConstString(offset + 13, $main_itm_grp_nm1, value);
	}


	/**
	 * Representative item classification cd. 2 代表品目分類ＣＤ２.<p>
	 *
	 */
	public String main_itm_grp_cd2() {
		return getConstString(offset + 14, $main_itm_grp_cd2);
	}

	/**
	 * Representative item classification cd. 2 代表品目分類ＣＤ２.<p>
	 *
	 */
	public void main_itm_grp_cd2(String value) {
		setConstString(offset + 14, $main_itm_grp_cd2, value);
	}


	/**
	 * Representative item classification name 2 代表品目分類名２.<p>
	 *
	 */
	public String main_itm_grp_nm2() {
		return getConstString(offset + 15, $main_itm_grp_nm2);
	}

	/**
	 * Representative item classification name 2 代表品目分類名２.<p>
	 *
	 */
	public void main_itm_grp_nm2(String value) {
		setConstString(offset + 15, $main_itm_grp_nm2, value);
	}


	/**
	 * Representative item classification cd. 3 代表品目分類ＣＤ３.<p>
	 *
	 */
	public String main_itm_grp_cd3() {
		return getConstString(offset + 16, $main_itm_grp_cd3);
	}

	/**
	 * Representative item classification cd. 3 代表品目分類ＣＤ３.<p>
	 *
	 */
	public void main_itm_grp_cd3(String value) {
		setConstString(offset + 16, $main_itm_grp_cd3, value);
	}


	/**
	 * Representative item classification name 3 代表品目分類名３.<p>
	 *
	 */
	public String main_itm_grp_nm3() {
		return getConstString(offset + 17, $main_itm_grp_nm3);
	}

	/**
	 * Representative item classification name 3 代表品目分類名３.<p>
	 *
	 */
	public void main_itm_grp_nm3(String value) {
		setConstString(offset + 17, $main_itm_grp_nm3, value);
	}


	/**
	 * Representative item classification cd. 4 代表品目分類ＣＤ４.<p>
	 *
	 */
	public String main_itm_grp_cd4() {
		return getConstString(offset + 18, $main_itm_grp_cd4);
	}

	/**
	 * Representative item classification cd. 4 代表品目分類ＣＤ４.<p>
	 *
	 */
	public void main_itm_grp_cd4(String value) {
		setConstString(offset + 18, $main_itm_grp_cd4, value);
	}


	/**
	 * Representative item classification name 4 代表品目分類名４.<p>
	 *
	 */
	public String main_itm_grp_nm4() {
		return getConstString(offset + 19, $main_itm_grp_nm4);
	}

	/**
	 * Representative item classification name 4 代表品目分類名４.<p>
	 *
	 */
	public void main_itm_grp_nm4(String value) {
		setConstString(offset + 19, $main_itm_grp_nm4, value);
	}


	/**
	 * Representative item classification cd. 5 代表品目分類ＣＤ５.<p>
	 *
	 */
	public String main_itm_grp_cd5() {
		return getConstString(offset + 20, $main_itm_grp_cd5);
	}

	/**
	 * Representative item classification cd. 5 代表品目分類ＣＤ５.<p>
	 *
	 */
	public void main_itm_grp_cd5(String value) {
		setConstString(offset + 20, $main_itm_grp_cd5, value);
	}


	/**
	 * Representative item classification name 5 代表品目分類名５.<p>
	 *
	 */
	public String main_itm_grp_nm5() {
		return getConstString(offset + 21, $main_itm_grp_nm5);
	}

	/**
	 * Representative item classification name 5 代表品目分類名５.<p>
	 *
	 */
	public void main_itm_grp_nm5(String value) {
		setConstString(offset + 21, $main_itm_grp_nm5, value);
	}


	/**
	 * Representative item classification cd. 6 代表品目分類ＣＤ６.<p>
	 *
	 */
	public String main_itm_grp_cd6() {
		return getConstString(offset + 22, $main_itm_grp_cd6);
	}

	/**
	 * Representative item classification cd. 6 代表品目分類ＣＤ６.<p>
	 *
	 */
	public void main_itm_grp_cd6(String value) {
		setConstString(offset + 22, $main_itm_grp_cd6, value);
	}


	/**
	 * Representative item classification name 6 代表品目分類名６.<p>
	 *
	 */
	public String main_itm_grp_nm6() {
		return getConstString(offset + 23, $main_itm_grp_nm6);
	}

	/**
	 * Representative item classification name 6 代表品目分類名６.<p>
	 *
	 */
	public void main_itm_grp_nm6(String value) {
		setConstString(offset + 23, $main_itm_grp_nm6, value);
	}


	/**
	 * Representative item classification cd. 7 代表品目分類ＣＤ７.<p>
	 *
	 */
	public String main_itm_grp_cd7() {
		return getConstString(offset + 24, $main_itm_grp_cd7);
	}

	/**
	 * Representative item classification cd. 7 代表品目分類ＣＤ７.<p>
	 *
	 */
	public void main_itm_grp_cd7(String value) {
		setConstString(offset + 24, $main_itm_grp_cd7, value);
	}


	/**
	 * Representative item classification name 7 代表品目分類名７.<p>
	 *
	 */
	public String main_itm_grp_nm7() {
		return getConstString(offset + 25, $main_itm_grp_nm7);
	}

	/**
	 * Representative item classification name 7 代表品目分類名７.<p>
	 *
	 */
	public void main_itm_grp_nm7(String value) {
		setConstString(offset + 25, $main_itm_grp_nm7, value);
	}


	/**
	 * Representative item classification cd. 8 代表品目分類ＣＤ８.<p>
	 *
	 */
	public String main_itm_grp_cd8() {
		return getConstString(offset + 26, $main_itm_grp_cd8);
	}

	/**
	 * Representative item classification cd. 8 代表品目分類ＣＤ８.<p>
	 *
	 */
	public void main_itm_grp_cd8(String value) {
		setConstString(offset + 26, $main_itm_grp_cd8, value);
	}


	/**
	 * Representative item classification name 8 代表品目分類名８.<p>
	 *
	 */
	public String main_itm_grp_nm8() {
		return getConstString(offset + 27, $main_itm_grp_nm8);
	}

	/**
	 * Representative item classification name 8 代表品目分類名８.<p>
	 *
	 */
	public void main_itm_grp_nm8(String value) {
		setConstString(offset + 27, $main_itm_grp_nm8, value);
	}


	/**
	 * Representative item classification cd. 9 代表品目分類ＣＤ９.<p>
	 *
	 */
	public String main_itm_grp_cd9() {
		return getConstString(offset + 28, $main_itm_grp_cd9);
	}

	/**
	 * Representative item classification cd. 9 代表品目分類ＣＤ９.<p>
	 *
	 */
	public void main_itm_grp_cd9(String value) {
		setConstString(offset + 28, $main_itm_grp_cd9, value);
	}


	/**
	 * Representative item classification name 9 代表品目分類名９.<p>
	 *
	 */
	public String main_itm_grp_nm9() {
		return getConstString(offset + 29, $main_itm_grp_nm9);
	}

	/**
	 * Representative item classification name 9 代表品目分類名９.<p>
	 *
	 */
	public void main_itm_grp_nm9(String value) {
		setConstString(offset + 29, $main_itm_grp_nm9, value);
	}


	/**
	 * Representative item classification cd. 10 代表品目分類ＣＤ１０.<p>
	 *
	 */
	public String main_itm_grp_cd10() {
		return getConstString(offset + 30, $main_itm_grp_cd10);
	}

	/**
	 * Representative item classification cd. 10 代表品目分類ＣＤ１０.<p>
	 *
	 */
	public void main_itm_grp_cd10(String value) {
		setConstString(offset + 30, $main_itm_grp_cd10, value);
	}


	/**
	 * Representative item classification name 10 代表品目分類名１０.<p>
	 *
	 */
	public String main_itm_grp_nm10() {
		return getConstString(offset + 31, $main_itm_grp_nm10);
	}

	/**
	 * Representative item classification name 10 代表品目分類名１０.<p>
	 *
	 */
	public void main_itm_grp_nm10(String value) {
		setConstString(offset + 31, $main_itm_grp_nm10, value);
	}


	/**
	 * Assortment item classification cd. 1 品揃品目分類ＣＤ１.<p>
	 *
	 */
	public String set_itm_grp_cd1() {
		return getConstString(offset + 32, $set_itm_grp_cd1);
	}

	/**
	 * Assortment item classification cd. 1 品揃品目分類ＣＤ１.<p>
	 *
	 */
	public void set_itm_grp_cd1(String value) {
		setConstString(offset + 32, $set_itm_grp_cd1, value);
	}


	/**
	 * Assortment item classification name 1 品揃品目分類名１.<p>
	 *
	 */
	public String set_itm_grp_nm1() {
		return getConstString(offset + 33, $set_itm_grp_nm1);
	}

	/**
	 * Assortment item classification name 1 品揃品目分類名１.<p>
	 *
	 */
	public void set_itm_grp_nm1(String value) {
		setConstString(offset + 33, $set_itm_grp_nm1, value);
	}


	/**
	 * Assortment item classification cd. 2 品揃品目分類ＣＤ２.<p>
	 *
	 */
	public String set_itm_grp_cd2() {
		return getConstString(offset + 34, $set_itm_grp_cd2);
	}

	/**
	 * Assortment item classification cd. 2 品揃品目分類ＣＤ２.<p>
	 *
	 */
	public void set_itm_grp_cd2(String value) {
		setConstString(offset + 34, $set_itm_grp_cd2, value);
	}


	/**
	 * Assortment item classification name 2 品揃品目分類名２.<p>
	 *
	 */
	public String set_itm_grp_nm2() {
		return getConstString(offset + 35, $set_itm_grp_nm2);
	}

	/**
	 * Assortment item classification name 2 品揃品目分類名２.<p>
	 *
	 */
	public void set_itm_grp_nm2(String value) {
		setConstString(offset + 35, $set_itm_grp_nm2, value);
	}


	/**
	 * Assortment item classification cd. 3 品揃品目分類ＣＤ３.<p>
	 *
	 */
	public String set_itm_grp_cd3() {
		return getConstString(offset + 36, $set_itm_grp_cd3);
	}

	/**
	 * Assortment item classification cd. 3 品揃品目分類ＣＤ３.<p>
	 *
	 */
	public void set_itm_grp_cd3(String value) {
		setConstString(offset + 36, $set_itm_grp_cd3, value);
	}


	/**
	 * Assortment item classification name 3 品揃品目分類名３.<p>
	 *
	 */
	public String set_itm_grp_nm3() {
		return getConstString(offset + 37, $set_itm_grp_nm3);
	}

	/**
	 * Assortment item classification name 3 品揃品目分類名３.<p>
	 *
	 */
	public void set_itm_grp_nm3(String value) {
		setConstString(offset + 37, $set_itm_grp_nm3, value);
	}


	/**
	 * Assortment item classification cd. 4 品揃品目分類ＣＤ４.<p>
	 *
	 */
	public String set_itm_grp_cd4() {
		return getConstString(offset + 38, $set_itm_grp_cd4);
	}

	/**
	 * Assortment item classification cd. 4 品揃品目分類ＣＤ４.<p>
	 *
	 */
	public void set_itm_grp_cd4(String value) {
		setConstString(offset + 38, $set_itm_grp_cd4, value);
	}


	/**
	 * Assortment item classification name 4 品揃品目分類名４.<p>
	 *
	 */
	public String set_itm_grp_nm4() {
		return getConstString(offset + 39, $set_itm_grp_nm4);
	}

	/**
	 * Assortment item classification name 4 品揃品目分類名４.<p>
	 *
	 */
	public void set_itm_grp_nm4(String value) {
		setConstString(offset + 39, $set_itm_grp_nm4, value);
	}


	/**
	 * Assortment item classification cd. 5 品揃品目分類ＣＤ５.<p>
	 *
	 */
	public String set_itm_grp_cd5() {
		return getConstString(offset + 40, $set_itm_grp_cd5);
	}

	/**
	 * Assortment item classification cd. 5 品揃品目分類ＣＤ５.<p>
	 *
	 */
	public void set_itm_grp_cd5(String value) {
		setConstString(offset + 40, $set_itm_grp_cd5, value);
	}


	/**
	 * Assortment item classification name 5 品揃品目分類名５.<p>
	 *
	 */
	public String set_itm_grp_nm5() {
		return getConstString(offset + 41, $set_itm_grp_nm5);
	}

	/**
	 * Assortment item classification name 5 品揃品目分類名５.<p>
	 *
	 */
	public void set_itm_grp_nm5(String value) {
		setConstString(offset + 41, $set_itm_grp_nm5, value);
	}


	/**
	 * Assortment item classification cd. 6 品揃品目分類ＣＤ６.<p>
	 *
	 */
	public String set_itm_grp_cd6() {
		return getConstString(offset + 42, $set_itm_grp_cd6);
	}

	/**
	 * Assortment item classification cd. 6 品揃品目分類ＣＤ６.<p>
	 *
	 */
	public void set_itm_grp_cd6(String value) {
		setConstString(offset + 42, $set_itm_grp_cd6, value);
	}


	/**
	 * Assortment item classification name 6 品揃品目分類名６.<p>
	 *
	 */
	public String set_itm_grp_nm6() {
		return getConstString(offset + 43, $set_itm_grp_nm6);
	}

	/**
	 * Assortment item classification name 6 品揃品目分類名６.<p>
	 *
	 */
	public void set_itm_grp_nm6(String value) {
		setConstString(offset + 43, $set_itm_grp_nm6, value);
	}


	/**
	 * Assortment item classification cd. 7 品揃品目分類ＣＤ７.<p>
	 *
	 */
	public String set_itm_grp_cd7() {
		return getConstString(offset + 44, $set_itm_grp_cd7);
	}

	/**
	 * Assortment item classification cd. 7 品揃品目分類ＣＤ７.<p>
	 *
	 */
	public void set_itm_grp_cd7(String value) {
		setConstString(offset + 44, $set_itm_grp_cd7, value);
	}


	/**
	 * Assortment item classification name 7 品揃品目分類名７.<p>
	 *
	 */
	public String set_itm_grp_nm7() {
		return getConstString(offset + 45, $set_itm_grp_nm7);
	}

	/**
	 * Assortment item classification name 7 品揃品目分類名７.<p>
	 *
	 */
	public void set_itm_grp_nm7(String value) {
		setConstString(offset + 45, $set_itm_grp_nm7, value);
	}


	/**
	 * Assortment item classification cd. 8 品揃品目分類ＣＤ８.<p>
	 *
	 */
	public String set_itm_grp_cd8() {
		return getConstString(offset + 46, $set_itm_grp_cd8);
	}

	/**
	 * Assortment item classification cd. 8 品揃品目分類ＣＤ８.<p>
	 *
	 */
	public void set_itm_grp_cd8(String value) {
		setConstString(offset + 46, $set_itm_grp_cd8, value);
	}


	/**
	 * Assortment item classification name 8 品揃品目分類名８.<p>
	 *
	 */
	public String set_itm_grp_nm8() {
		return getConstString(offset + 47, $set_itm_grp_nm8);
	}

	/**
	 * Assortment item classification name 8 品揃品目分類名８.<p>
	 *
	 */
	public void set_itm_grp_nm8(String value) {
		setConstString(offset + 47, $set_itm_grp_nm8, value);
	}


	/**
	 * Assortment item classification cd. 9 品揃品目分類ＣＤ９.<p>
	 *
	 */
	public String set_itm_grp_cd9() {
		return getConstString(offset + 48, $set_itm_grp_cd9);
	}

	/**
	 * Assortment item classification cd. 9 品揃品目分類ＣＤ９.<p>
	 *
	 */
	public void set_itm_grp_cd9(String value) {
		setConstString(offset + 48, $set_itm_grp_cd9, value);
	}


	/**
	 * Assortment item classification name 9 品揃品目分類名９.<p>
	 *
	 */
	public String set_itm_grp_nm9() {
		return getConstString(offset + 49, $set_itm_grp_nm9);
	}

	/**
	 * Assortment item classification name 9 品揃品目分類名９.<p>
	 *
	 */
	public void set_itm_grp_nm9(String value) {
		setConstString(offset + 49, $set_itm_grp_nm9, value);
	}


	/**
	 * Assortment item classification cd. 10 品揃品目分類ＣＤ１０.<p>
	 *
	 */
	public String set_itm_grp_cd10() {
		return getConstString(offset + 50, $set_itm_grp_cd10);
	}

	/**
	 * Assortment item classification cd. 10 品揃品目分類ＣＤ１０.<p>
	 *
	 */
	public void set_itm_grp_cd10(String value) {
		setConstString(offset + 50, $set_itm_grp_cd10, value);
	}


	/**
	 * Assortment item classification name 10 品揃品目分類名１０.<p>
	 *
	 */
	public String set_itm_grp_nm10() {
		return getConstString(offset + 51, $set_itm_grp_nm10);
	}

	/**
	 * Assortment item classification name 10 品揃品目分類名１０.<p>
	 *
	 */
	public void set_itm_grp_nm10(String value) {
		setConstString(offset + 51, $set_itm_grp_nm10, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			return set_grp_nm();
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
		if ($main_itm_grp_cd1.equalsIgnoreCase(name)) {
			return main_itm_grp_cd1();
		}
		if ($main_itm_grp_nm1.equalsIgnoreCase(name)) {
			return main_itm_grp_nm1();
		}
		if ($main_itm_grp_cd2.equalsIgnoreCase(name)) {
			return main_itm_grp_cd2();
		}
		if ($main_itm_grp_nm2.equalsIgnoreCase(name)) {
			return main_itm_grp_nm2();
		}
		if ($main_itm_grp_cd3.equalsIgnoreCase(name)) {
			return main_itm_grp_cd3();
		}
		if ($main_itm_grp_nm3.equalsIgnoreCase(name)) {
			return main_itm_grp_nm3();
		}
		if ($main_itm_grp_cd4.equalsIgnoreCase(name)) {
			return main_itm_grp_cd4();
		}
		if ($main_itm_grp_nm4.equalsIgnoreCase(name)) {
			return main_itm_grp_nm4();
		}
		if ($main_itm_grp_cd5.equalsIgnoreCase(name)) {
			return main_itm_grp_cd5();
		}
		if ($main_itm_grp_nm5.equalsIgnoreCase(name)) {
			return main_itm_grp_nm5();
		}
		if ($main_itm_grp_cd6.equalsIgnoreCase(name)) {
			return main_itm_grp_cd6();
		}
		if ($main_itm_grp_nm6.equalsIgnoreCase(name)) {
			return main_itm_grp_nm6();
		}
		if ($main_itm_grp_cd7.equalsIgnoreCase(name)) {
			return main_itm_grp_cd7();
		}
		if ($main_itm_grp_nm7.equalsIgnoreCase(name)) {
			return main_itm_grp_nm7();
		}
		if ($main_itm_grp_cd8.equalsIgnoreCase(name)) {
			return main_itm_grp_cd8();
		}
		if ($main_itm_grp_nm8.equalsIgnoreCase(name)) {
			return main_itm_grp_nm8();
		}
		if ($main_itm_grp_cd9.equalsIgnoreCase(name)) {
			return main_itm_grp_cd9();
		}
		if ($main_itm_grp_nm9.equalsIgnoreCase(name)) {
			return main_itm_grp_nm9();
		}
		if ($main_itm_grp_cd10.equalsIgnoreCase(name)) {
			return main_itm_grp_cd10();
		}
		if ($main_itm_grp_nm10.equalsIgnoreCase(name)) {
			return main_itm_grp_nm10();
		}
		if ($set_itm_grp_cd1.equalsIgnoreCase(name)) {
			return set_itm_grp_cd1();
		}
		if ($set_itm_grp_nm1.equalsIgnoreCase(name)) {
			return set_itm_grp_nm1();
		}
		if ($set_itm_grp_cd2.equalsIgnoreCase(name)) {
			return set_itm_grp_cd2();
		}
		if ($set_itm_grp_nm2.equalsIgnoreCase(name)) {
			return set_itm_grp_nm2();
		}
		if ($set_itm_grp_cd3.equalsIgnoreCase(name)) {
			return set_itm_grp_cd3();
		}
		if ($set_itm_grp_nm3.equalsIgnoreCase(name)) {
			return set_itm_grp_nm3();
		}
		if ($set_itm_grp_cd4.equalsIgnoreCase(name)) {
			return set_itm_grp_cd4();
		}
		if ($set_itm_grp_nm4.equalsIgnoreCase(name)) {
			return set_itm_grp_nm4();
		}
		if ($set_itm_grp_cd5.equalsIgnoreCase(name)) {
			return set_itm_grp_cd5();
		}
		if ($set_itm_grp_nm5.equalsIgnoreCase(name)) {
			return set_itm_grp_nm5();
		}
		if ($set_itm_grp_cd6.equalsIgnoreCase(name)) {
			return set_itm_grp_cd6();
		}
		if ($set_itm_grp_nm6.equalsIgnoreCase(name)) {
			return set_itm_grp_nm6();
		}
		if ($set_itm_grp_cd7.equalsIgnoreCase(name)) {
			return set_itm_grp_cd7();
		}
		if ($set_itm_grp_nm7.equalsIgnoreCase(name)) {
			return set_itm_grp_nm7();
		}
		if ($set_itm_grp_cd8.equalsIgnoreCase(name)) {
			return set_itm_grp_cd8();
		}
		if ($set_itm_grp_nm8.equalsIgnoreCase(name)) {
			return set_itm_grp_nm8();
		}
		if ($set_itm_grp_cd9.equalsIgnoreCase(name)) {
			return set_itm_grp_cd9();
		}
		if ($set_itm_grp_nm9.equalsIgnoreCase(name)) {
			return set_itm_grp_nm9();
		}
		if ($set_itm_grp_cd10.equalsIgnoreCase(name)) {
			return set_itm_grp_cd10();
		}
		if ($set_itm_grp_nm10.equalsIgnoreCase(name)) {
			return set_itm_grp_nm10();
		}
		return super.getString(name);
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
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			return set_grp_nm();
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
		if ($main_itm_grp_cd1.equalsIgnoreCase(name)) {
			return main_itm_grp_cd1();
		}
		if ($main_itm_grp_nm1.equalsIgnoreCase(name)) {
			return main_itm_grp_nm1();
		}
		if ($main_itm_grp_cd2.equalsIgnoreCase(name)) {
			return main_itm_grp_cd2();
		}
		if ($main_itm_grp_nm2.equalsIgnoreCase(name)) {
			return main_itm_grp_nm2();
		}
		if ($main_itm_grp_cd3.equalsIgnoreCase(name)) {
			return main_itm_grp_cd3();
		}
		if ($main_itm_grp_nm3.equalsIgnoreCase(name)) {
			return main_itm_grp_nm3();
		}
		if ($main_itm_grp_cd4.equalsIgnoreCase(name)) {
			return main_itm_grp_cd4();
		}
		if ($main_itm_grp_nm4.equalsIgnoreCase(name)) {
			return main_itm_grp_nm4();
		}
		if ($main_itm_grp_cd5.equalsIgnoreCase(name)) {
			return main_itm_grp_cd5();
		}
		if ($main_itm_grp_nm5.equalsIgnoreCase(name)) {
			return main_itm_grp_nm5();
		}
		if ($main_itm_grp_cd6.equalsIgnoreCase(name)) {
			return main_itm_grp_cd6();
		}
		if ($main_itm_grp_nm6.equalsIgnoreCase(name)) {
			return main_itm_grp_nm6();
		}
		if ($main_itm_grp_cd7.equalsIgnoreCase(name)) {
			return main_itm_grp_cd7();
		}
		if ($main_itm_grp_nm7.equalsIgnoreCase(name)) {
			return main_itm_grp_nm7();
		}
		if ($main_itm_grp_cd8.equalsIgnoreCase(name)) {
			return main_itm_grp_cd8();
		}
		if ($main_itm_grp_nm8.equalsIgnoreCase(name)) {
			return main_itm_grp_nm8();
		}
		if ($main_itm_grp_cd9.equalsIgnoreCase(name)) {
			return main_itm_grp_cd9();
		}
		if ($main_itm_grp_nm9.equalsIgnoreCase(name)) {
			return main_itm_grp_nm9();
		}
		if ($main_itm_grp_cd10.equalsIgnoreCase(name)) {
			return main_itm_grp_cd10();
		}
		if ($main_itm_grp_nm10.equalsIgnoreCase(name)) {
			return main_itm_grp_nm10();
		}
		if ($set_itm_grp_cd1.equalsIgnoreCase(name)) {
			return set_itm_grp_cd1();
		}
		if ($set_itm_grp_nm1.equalsIgnoreCase(name)) {
			return set_itm_grp_nm1();
		}
		if ($set_itm_grp_cd2.equalsIgnoreCase(name)) {
			return set_itm_grp_cd2();
		}
		if ($set_itm_grp_nm2.equalsIgnoreCase(name)) {
			return set_itm_grp_nm2();
		}
		if ($set_itm_grp_cd3.equalsIgnoreCase(name)) {
			return set_itm_grp_cd3();
		}
		if ($set_itm_grp_nm3.equalsIgnoreCase(name)) {
			return set_itm_grp_nm3();
		}
		if ($set_itm_grp_cd4.equalsIgnoreCase(name)) {
			return set_itm_grp_cd4();
		}
		if ($set_itm_grp_nm4.equalsIgnoreCase(name)) {
			return set_itm_grp_nm4();
		}
		if ($set_itm_grp_cd5.equalsIgnoreCase(name)) {
			return set_itm_grp_cd5();
		}
		if ($set_itm_grp_nm5.equalsIgnoreCase(name)) {
			return set_itm_grp_nm5();
		}
		if ($set_itm_grp_cd6.equalsIgnoreCase(name)) {
			return set_itm_grp_cd6();
		}
		if ($set_itm_grp_nm6.equalsIgnoreCase(name)) {
			return set_itm_grp_nm6();
		}
		if ($set_itm_grp_cd7.equalsIgnoreCase(name)) {
			return set_itm_grp_cd7();
		}
		if ($set_itm_grp_nm7.equalsIgnoreCase(name)) {
			return set_itm_grp_nm7();
		}
		if ($set_itm_grp_cd8.equalsIgnoreCase(name)) {
			return set_itm_grp_cd8();
		}
		if ($set_itm_grp_nm8.equalsIgnoreCase(name)) {
			return set_itm_grp_nm8();
		}
		if ($set_itm_grp_cd9.equalsIgnoreCase(name)) {
			return set_itm_grp_cd9();
		}
		if ($set_itm_grp_nm9.equalsIgnoreCase(name)) {
			return set_itm_grp_nm9();
		}
		if ($set_itm_grp_cd10.equalsIgnoreCase(name)) {
			return set_itm_grp_cd10();
		}
		if ($set_itm_grp_nm10.equalsIgnoreCase(name)) {
			return set_itm_grp_nm10();
		}
		return super.getStringNE(name);
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
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			set_grp_nm(value);
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
		if ($main_itm_grp_cd1.equalsIgnoreCase(name)) {
			main_itm_grp_cd1(value);
			return;
		}
		if ($main_itm_grp_nm1.equalsIgnoreCase(name)) {
			main_itm_grp_nm1(value);
			return;
		}
		if ($main_itm_grp_cd2.equalsIgnoreCase(name)) {
			main_itm_grp_cd2(value);
			return;
		}
		if ($main_itm_grp_nm2.equalsIgnoreCase(name)) {
			main_itm_grp_nm2(value);
			return;
		}
		if ($main_itm_grp_cd3.equalsIgnoreCase(name)) {
			main_itm_grp_cd3(value);
			return;
		}
		if ($main_itm_grp_nm3.equalsIgnoreCase(name)) {
			main_itm_grp_nm3(value);
			return;
		}
		if ($main_itm_grp_cd4.equalsIgnoreCase(name)) {
			main_itm_grp_cd4(value);
			return;
		}
		if ($main_itm_grp_nm4.equalsIgnoreCase(name)) {
			main_itm_grp_nm4(value);
			return;
		}
		if ($main_itm_grp_cd5.equalsIgnoreCase(name)) {
			main_itm_grp_cd5(value);
			return;
		}
		if ($main_itm_grp_nm5.equalsIgnoreCase(name)) {
			main_itm_grp_nm5(value);
			return;
		}
		if ($main_itm_grp_cd6.equalsIgnoreCase(name)) {
			main_itm_grp_cd6(value);
			return;
		}
		if ($main_itm_grp_nm6.equalsIgnoreCase(name)) {
			main_itm_grp_nm6(value);
			return;
		}
		if ($main_itm_grp_cd7.equalsIgnoreCase(name)) {
			main_itm_grp_cd7(value);
			return;
		}
		if ($main_itm_grp_nm7.equalsIgnoreCase(name)) {
			main_itm_grp_nm7(value);
			return;
		}
		if ($main_itm_grp_cd8.equalsIgnoreCase(name)) {
			main_itm_grp_cd8(value);
			return;
		}
		if ($main_itm_grp_nm8.equalsIgnoreCase(name)) {
			main_itm_grp_nm8(value);
			return;
		}
		if ($main_itm_grp_cd9.equalsIgnoreCase(name)) {
			main_itm_grp_cd9(value);
			return;
		}
		if ($main_itm_grp_nm9.equalsIgnoreCase(name)) {
			main_itm_grp_nm9(value);
			return;
		}
		if ($main_itm_grp_cd10.equalsIgnoreCase(name)) {
			main_itm_grp_cd10(value);
			return;
		}
		if ($main_itm_grp_nm10.equalsIgnoreCase(name)) {
			main_itm_grp_nm10(value);
			return;
		}
		if ($set_itm_grp_cd1.equalsIgnoreCase(name)) {
			set_itm_grp_cd1(value);
			return;
		}
		if ($set_itm_grp_nm1.equalsIgnoreCase(name)) {
			set_itm_grp_nm1(value);
			return;
		}
		if ($set_itm_grp_cd2.equalsIgnoreCase(name)) {
			set_itm_grp_cd2(value);
			return;
		}
		if ($set_itm_grp_nm2.equalsIgnoreCase(name)) {
			set_itm_grp_nm2(value);
			return;
		}
		if ($set_itm_grp_cd3.equalsIgnoreCase(name)) {
			set_itm_grp_cd3(value);
			return;
		}
		if ($set_itm_grp_nm3.equalsIgnoreCase(name)) {
			set_itm_grp_nm3(value);
			return;
		}
		if ($set_itm_grp_cd4.equalsIgnoreCase(name)) {
			set_itm_grp_cd4(value);
			return;
		}
		if ($set_itm_grp_nm4.equalsIgnoreCase(name)) {
			set_itm_grp_nm4(value);
			return;
		}
		if ($set_itm_grp_cd5.equalsIgnoreCase(name)) {
			set_itm_grp_cd5(value);
			return;
		}
		if ($set_itm_grp_nm5.equalsIgnoreCase(name)) {
			set_itm_grp_nm5(value);
			return;
		}
		if ($set_itm_grp_cd6.equalsIgnoreCase(name)) {
			set_itm_grp_cd6(value);
			return;
		}
		if ($set_itm_grp_nm6.equalsIgnoreCase(name)) {
			set_itm_grp_nm6(value);
			return;
		}
		if ($set_itm_grp_cd7.equalsIgnoreCase(name)) {
			set_itm_grp_cd7(value);
			return;
		}
		if ($set_itm_grp_nm7.equalsIgnoreCase(name)) {
			set_itm_grp_nm7(value);
			return;
		}
		if ($set_itm_grp_cd8.equalsIgnoreCase(name)) {
			set_itm_grp_cd8(value);
			return;
		}
		if ($set_itm_grp_nm8.equalsIgnoreCase(name)) {
			set_itm_grp_nm8(value);
			return;
		}
		if ($set_itm_grp_cd9.equalsIgnoreCase(name)) {
			set_itm_grp_cd9(value);
			return;
		}
		if ($set_itm_grp_nm9.equalsIgnoreCase(name)) {
			set_itm_grp_nm9(value);
			return;
		}
		if ($set_itm_grp_cd10.equalsIgnoreCase(name)) {
			set_itm_grp_cd10(value);
			return;
		}
		if ($set_itm_grp_nm10.equalsIgnoreCase(name)) {
			set_itm_grp_nm10(value);
			return;
		}
		super.setString(name, value);
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
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			set_grp_nm(value);
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
		if ($main_itm_grp_cd1.equalsIgnoreCase(name)) {
			main_itm_grp_cd1(value);
			return;
		}
		if ($main_itm_grp_nm1.equalsIgnoreCase(name)) {
			main_itm_grp_nm1(value);
			return;
		}
		if ($main_itm_grp_cd2.equalsIgnoreCase(name)) {
			main_itm_grp_cd2(value);
			return;
		}
		if ($main_itm_grp_nm2.equalsIgnoreCase(name)) {
			main_itm_grp_nm2(value);
			return;
		}
		if ($main_itm_grp_cd3.equalsIgnoreCase(name)) {
			main_itm_grp_cd3(value);
			return;
		}
		if ($main_itm_grp_nm3.equalsIgnoreCase(name)) {
			main_itm_grp_nm3(value);
			return;
		}
		if ($main_itm_grp_cd4.equalsIgnoreCase(name)) {
			main_itm_grp_cd4(value);
			return;
		}
		if ($main_itm_grp_nm4.equalsIgnoreCase(name)) {
			main_itm_grp_nm4(value);
			return;
		}
		if ($main_itm_grp_cd5.equalsIgnoreCase(name)) {
			main_itm_grp_cd5(value);
			return;
		}
		if ($main_itm_grp_nm5.equalsIgnoreCase(name)) {
			main_itm_grp_nm5(value);
			return;
		}
		if ($main_itm_grp_cd6.equalsIgnoreCase(name)) {
			main_itm_grp_cd6(value);
			return;
		}
		if ($main_itm_grp_nm6.equalsIgnoreCase(name)) {
			main_itm_grp_nm6(value);
			return;
		}
		if ($main_itm_grp_cd7.equalsIgnoreCase(name)) {
			main_itm_grp_cd7(value);
			return;
		}
		if ($main_itm_grp_nm7.equalsIgnoreCase(name)) {
			main_itm_grp_nm7(value);
			return;
		}
		if ($main_itm_grp_cd8.equalsIgnoreCase(name)) {
			main_itm_grp_cd8(value);
			return;
		}
		if ($main_itm_grp_nm8.equalsIgnoreCase(name)) {
			main_itm_grp_nm8(value);
			return;
		}
		if ($main_itm_grp_cd9.equalsIgnoreCase(name)) {
			main_itm_grp_cd9(value);
			return;
		}
		if ($main_itm_grp_nm9.equalsIgnoreCase(name)) {
			main_itm_grp_nm9(value);
			return;
		}
		if ($main_itm_grp_cd10.equalsIgnoreCase(name)) {
			main_itm_grp_cd10(value);
			return;
		}
		if ($main_itm_grp_nm10.equalsIgnoreCase(name)) {
			main_itm_grp_nm10(value);
			return;
		}
		if ($set_itm_grp_cd1.equalsIgnoreCase(name)) {
			set_itm_grp_cd1(value);
			return;
		}
		if ($set_itm_grp_nm1.equalsIgnoreCase(name)) {
			set_itm_grp_nm1(value);
			return;
		}
		if ($set_itm_grp_cd2.equalsIgnoreCase(name)) {
			set_itm_grp_cd2(value);
			return;
		}
		if ($set_itm_grp_nm2.equalsIgnoreCase(name)) {
			set_itm_grp_nm2(value);
			return;
		}
		if ($set_itm_grp_cd3.equalsIgnoreCase(name)) {
			set_itm_grp_cd3(value);
			return;
		}
		if ($set_itm_grp_nm3.equalsIgnoreCase(name)) {
			set_itm_grp_nm3(value);
			return;
		}
		if ($set_itm_grp_cd4.equalsIgnoreCase(name)) {
			set_itm_grp_cd4(value);
			return;
		}
		if ($set_itm_grp_nm4.equalsIgnoreCase(name)) {
			set_itm_grp_nm4(value);
			return;
		}
		if ($set_itm_grp_cd5.equalsIgnoreCase(name)) {
			set_itm_grp_cd5(value);
			return;
		}
		if ($set_itm_grp_nm5.equalsIgnoreCase(name)) {
			set_itm_grp_nm5(value);
			return;
		}
		if ($set_itm_grp_cd6.equalsIgnoreCase(name)) {
			set_itm_grp_cd6(value);
			return;
		}
		if ($set_itm_grp_nm6.equalsIgnoreCase(name)) {
			set_itm_grp_nm6(value);
			return;
		}
		if ($set_itm_grp_cd7.equalsIgnoreCase(name)) {
			set_itm_grp_cd7(value);
			return;
		}
		if ($set_itm_grp_nm7.equalsIgnoreCase(name)) {
			set_itm_grp_nm7(value);
			return;
		}
		if ($set_itm_grp_cd8.equalsIgnoreCase(name)) {
			set_itm_grp_cd8(value);
			return;
		}
		if ($set_itm_grp_nm8.equalsIgnoreCase(name)) {
			set_itm_grp_nm8(value);
			return;
		}
		if ($set_itm_grp_cd9.equalsIgnoreCase(name)) {
			set_itm_grp_cd9(value);
			return;
		}
		if ($set_itm_grp_nm9.equalsIgnoreCase(name)) {
			set_itm_grp_nm9(value);
			return;
		}
		if ($set_itm_grp_cd10.equalsIgnoreCase(name)) {
			set_itm_grp_cd10(value);
			return;
		}
		if ($set_itm_grp_nm10.equalsIgnoreCase(name)) {
			set_itm_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
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

	public MCRow getInnerRow(String name) {
		if ($main_itm_typ_p.equalsIgnoreCase(name)) {
			return main_itm_typ_p();
		}
		if ($main_itm_p.equalsIgnoreCase(name)) {
			return main_itm_p();
		}
		if ($set_itm_typ_p.equalsIgnoreCase(name)) {
			return set_itm_typ_p();
		}
		if ($set_itm_p.equalsIgnoreCase(name)) {
			return set_itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($main_itm_typ_p.equalsIgnoreCase(name)) {
			main_itm_typ_p(
				((MCContainerMeta) main_itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($main_itm_p.equalsIgnoreCase(name)) {
			main_itm_p(
				((MCContainerMeta) main_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($set_itm_typ_p.equalsIgnoreCase(name)) {
			set_itm_typ_p(
				((MCContainerMeta) set_itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($set_itm_p.equalsIgnoreCase(name)) {
			set_itm_p(
				((MCContainerMeta) set_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Representative item type 代表品目区分.<p>
	 *
	 */
	public String main_itm_typ() {
		return main_itm_typ_p().itm_typ();
	}

	/**
	 * Representative item type 代表品目区分.<p>
	 *
	 */
	public void main_itm_typ(String value) {
		main_itm_typ_p().itm_typ(value);
	}

	/**
	 * Representative item type name 代表品目区分名.<p>
	 *
	 */
	public String main_itm_typ_nm() {
		return main_itm_typ_p().itm_typ_nm();
	}

	/**
	 * Representative item type name 代表品目区分名.<p>
	 *
	 */
	public void main_itm_typ_nm(String value) {
		main_itm_typ_p().itm_typ_nm(value);
	}

	/**
	 * Representative item type details cd. 代表品目区分詳細ＣＤ.<p>
	 *
	 */
	public String main_itm_typ_d_cd() {
		return main_itm_typ_p().itm_typ_d_cd();
	}

	/**
	 * Representative item type details cd. 代表品目区分詳細ＣＤ.<p>
	 *
	 */
	public void main_itm_typ_d_cd(String value) {
		main_itm_typ_p().itm_typ_d_cd(value);
	}

	/**
	 * Representative item type details name 代表品目区分詳細名.<p>
	 *
	 */
	public String main_itm_typ_d_nm() {
		return main_itm_typ_p().itm_typ_d_nm();
	}

	/**
	 * Representative item type details name 代表品目区分詳細名.<p>
	 *
	 */
	public void main_itm_typ_d_nm(String value) {
		main_itm_typ_p().itm_typ_d_nm(value);
	}

	/**
	 * Representative item cd. 代表品目ＣＤ.<p>
	 *
	 */
	public String main_itm_cd() {
		return main_itm_p().itm_cd();
	}

	/**
	 * Representative item cd. 代表品目ＣＤ.<p>
	 *
	 */
	public void main_itm_cd(String value) {
		main_itm_p().itm_cd(value);
	}

	/**
	 * Representative branch No. 1 代表枝番１.<p>
	 *
	 */
	public String main_itm_sub1() {
		return main_itm_p().itm_sub1();
	}

	/**
	 * Representative branch No. 1 代表枝番１.<p>
	 *
	 */
	public void main_itm_sub1(String value) {
		main_itm_p().itm_sub1(value);
	}

	/**
	 * Representative branch No. 2 代表枝番２.<p>
	 *
	 */
	public String main_itm_sub2() {
		return main_itm_p().itm_sub2();
	}

	/**
	 * Representative branch No. 2 代表枝番２.<p>
	 *
	 */
	public void main_itm_sub2(String value) {
		main_itm_p().itm_sub2(value);
	}

	/**
	 * Representative branch No. 3 代表枝番３.<p>
	 *
	 */
	public String main_itm_sub3() {
		return main_itm_p().itm_sub3();
	}

	/**
	 * Representative branch No. 3 代表枝番３.<p>
	 *
	 */
	public void main_itm_sub3(String value) {
		main_itm_p().itm_sub3(value);
	}

	/**
	 * Representative item name 代表品名.<p>
	 *
	 */
	public String main_itm_nm() {
		return main_itm_p().itm_nm();
	}

	/**
	 * Representative item name 代表品名.<p>
	 *
	 */
	public void main_itm_nm(String value) {
		main_itm_p().itm_nm(value);
	}

	/**
	 * Assortment item type 品揃品目区分.<p>
	 *
	 */
	public String set_itm_typ() {
		return set_itm_typ_p().itm_typ();
	}

	/**
	 * Assortment item type 品揃品目区分.<p>
	 *
	 */
	public void set_itm_typ(String value) {
		set_itm_typ_p().itm_typ(value);
	}

	/**
	 * Assortment item type name 品揃品目区分名.<p>
	 *
	 */
	public String set_itm_typ_nm() {
		return set_itm_typ_p().itm_typ_nm();
	}

	/**
	 * Assortment item type name 品揃品目区分名.<p>
	 *
	 */
	public void set_itm_typ_nm(String value) {
		set_itm_typ_p().itm_typ_nm(value);
	}

	/**
	 * Assortment item type details cd. 品揃品目区分詳細ＣＤ.<p>
	 *
	 */
	public String set_itm_typ_d_cd() {
		return set_itm_typ_p().itm_typ_d_cd();
	}

	/**
	 * Assortment item type details cd. 品揃品目区分詳細ＣＤ.<p>
	 *
	 */
	public void set_itm_typ_d_cd(String value) {
		set_itm_typ_p().itm_typ_d_cd(value);
	}

	/**
	 * Assortment item type details name 品揃品目区分詳細名.<p>
	 *
	 */
	public String set_itm_typ_d_nm() {
		return set_itm_typ_p().itm_typ_d_nm();
	}

	/**
	 * Assortment item type details name 品揃品目区分詳細名.<p>
	 *
	 */
	public void set_itm_typ_d_nm(String value) {
		set_itm_typ_p().itm_typ_d_nm(value);
	}

	/**
	 * Assortment item cd. 品揃品目ＣＤ.<p>
	 *
	 */
	public String set_itm_cd() {
		return set_itm_p().itm_cd();
	}

	/**
	 * Assortment item cd. 品揃品目ＣＤ.<p>
	 *
	 */
	public void set_itm_cd(String value) {
		set_itm_p().itm_cd(value);
	}

	/**
	 * Assortment branch No. 1 品揃枝番１.<p>
	 *
	 */
	public String set_itm_sub1() {
		return set_itm_p().itm_sub1();
	}

	/**
	 * Assortment branch No. 1 品揃枝番１.<p>
	 *
	 */
	public void set_itm_sub1(String value) {
		set_itm_p().itm_sub1(value);
	}

	/**
	 * Assortment branch No. 2 品揃枝番２.<p>
	 *
	 */
	public String set_itm_sub2() {
		return set_itm_p().itm_sub2();
	}

	/**
	 * Assortment branch No. 2 品揃枝番２.<p>
	 *
	 */
	public void set_itm_sub2(String value) {
		set_itm_p().itm_sub2(value);
	}

	/**
	 * Assortment branch No. 3 品揃枝番３.<p>
	 *
	 */
	public String set_itm_sub3() {
		return set_itm_p().itm_sub3();
	}

	/**
	 * Assortment branch No. 3 品揃枝番３.<p>
	 *
	 */
	public void set_itm_sub3(String value) {
		set_itm_p().itm_sub3(value);
	}

	/**
	 * Assortment item name 品揃品名.<p>
	 *
	 */
	public String set_itm_nm() {
		return set_itm_p().itm_nm();
	}

	/**
	 * Assortment item name 品揃品名.<p>
	 *
	 */
	public void set_itm_nm(String value) {
		set_itm_p().itm_nm(value);
	}

}

