package mcframe.clientMABS.MABSP0290;

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
	public static final String $core_itm_typ_p = "core_itm_typ_p";
	public static final String $core_itm_p = "core_itm_p";
	public static final String $comp_itm_typ_p = "comp_itm_typ_p";
	public static final String $comp_itm_p = "comp_itm_p";
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
	 * Main item classification cd. 1 主品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $core_itm_grp_cd1 = "core_itm_grp_cd1";
	/**
	 * Main item classification name 1 主品目分類名１.<p>
	 *
	 */
	public static final String $core_itm_grp_nm1 = "core_itm_grp_nm1";
	/**
	 * Main item classification cd. 2 主品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $core_itm_grp_cd2 = "core_itm_grp_cd2";
	/**
	 * Main item classification name 2 主品目分類名２.<p>
	 *
	 */
	public static final String $core_itm_grp_nm2 = "core_itm_grp_nm2";
	/**
	 * Main item classification cd. 3 主品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $core_itm_grp_cd3 = "core_itm_grp_cd3";
	/**
	 * Main item classification name 3 主品目分類名３.<p>
	 *
	 */
	public static final String $core_itm_grp_nm3 = "core_itm_grp_nm3";
	/**
	 * Main item classification cd. 4 主品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $core_itm_grp_cd4 = "core_itm_grp_cd4";
	/**
	 * Main item classification name 4 主品目分類名４.<p>
	 *
	 */
	public static final String $core_itm_grp_nm4 = "core_itm_grp_nm4";
	/**
	 * Main item classification cd. 5 主品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $core_itm_grp_cd5 = "core_itm_grp_cd5";
	/**
	 * Main item classification name 5 主品目分類名５.<p>
	 *
	 */
	public static final String $core_itm_grp_nm5 = "core_itm_grp_nm5";
	/**
	 * Main item classification cd. 6 主品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $core_itm_grp_cd6 = "core_itm_grp_cd6";
	/**
	 * Main item classification name 6 主品目分類名６.<p>
	 *
	 */
	public static final String $core_itm_grp_nm6 = "core_itm_grp_nm6";
	/**
	 * Main item classification cd. 7 主品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $core_itm_grp_cd7 = "core_itm_grp_cd7";
	/**
	 * Main item classification name 7 主品目分類名７.<p>
	 *
	 */
	public static final String $core_itm_grp_nm7 = "core_itm_grp_nm7";
	/**
	 * Main item classification cd. 8 主品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $core_itm_grp_cd8 = "core_itm_grp_cd8";
	/**
	 * Main item classification name 8 主品目分類名８.<p>
	 *
	 */
	public static final String $core_itm_grp_nm8 = "core_itm_grp_nm8";
	/**
	 * Main item classification cd. 9 主品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $core_itm_grp_cd9 = "core_itm_grp_cd9";
	/**
	 * Main item classification name 9 主品目分類名９.<p>
	 *
	 */
	public static final String $core_itm_grp_nm9 = "core_itm_grp_nm9";
	/**
	 * Main item classification cd. 10 主品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $core_itm_grp_cd10 = "core_itm_grp_cd10";
	/**
	 * Main item classification name 10 主品目分類名１０.<p>
	 *
	 */
	public static final String $core_itm_grp_nm10 = "core_itm_grp_nm10";
	/**
	 * Component item classification cd. 1 構成品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $comp_itm_grp_cd1 = "comp_itm_grp_cd1";
	/**
	 * Component item classification name 1 構成品目分類名１.<p>
	 *
	 */
	public static final String $comp_itm_grp_nm1 = "comp_itm_grp_nm1";
	/**
	 * Component item classification cd. 2 構成品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $comp_itm_grp_cd2 = "comp_itm_grp_cd2";
	/**
	 * Component item classification name 1 構成品目分類名２.<p>
	 *
	 */
	public static final String $comp_itm_grp_nm2 = "comp_itm_grp_nm2";
	/**
	 * Component item classification cd. 3 構成品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $comp_itm_grp_cd3 = "comp_itm_grp_cd3";
	/**
	 * Component item classification name 3 構成品目分類名３.<p>
	 *
	 */
	public static final String $comp_itm_grp_nm3 = "comp_itm_grp_nm3";
	/**
	 * Component item classification cd. 4 構成品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $comp_itm_grp_cd4 = "comp_itm_grp_cd4";
	/**
	 * Component item classification name 4 構成品目分類名４.<p>
	 *
	 */
	public static final String $comp_itm_grp_nm4 = "comp_itm_grp_nm4";
	/**
	 * Component item classification cd. 5 構成品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $comp_itm_grp_cd5 = "comp_itm_grp_cd5";
	/**
	 * Component item classification name 5 構成品目分類名５.<p>
	 *
	 */
	public static final String $comp_itm_grp_nm5 = "comp_itm_grp_nm5";
	/**
	 * Component item classification cd. 6 構成品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $comp_itm_grp_cd6 = "comp_itm_grp_cd6";
	/**
	 * Component item classification name 6 構成品目分類名６.<p>
	 *
	 */
	public static final String $comp_itm_grp_nm6 = "comp_itm_grp_nm6";
	/**
	 * Component item classification cd. 7 構成品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $comp_itm_grp_cd7 = "comp_itm_grp_cd7";
	/**
	 * Component item classification name 7 構成品目分類名７.<p>
	 *
	 */
	public static final String $comp_itm_grp_nm7 = "comp_itm_grp_nm7";
	/**
	 * Component item classification cd. 8 構成品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $comp_itm_grp_cd8 = "comp_itm_grp_cd8";
	/**
	 * Component item classification name 8 構成品目分類名８.<p>
	 *
	 */
	public static final String $comp_itm_grp_nm8 = "comp_itm_grp_nm8";
	/**
	 * Component item classification cd. 9 構成品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $comp_itm_grp_cd9 = "comp_itm_grp_cd9";
	/**
	 * Component item classification name 9 構成品目分類名９.<p>
	 *
	 */
	public static final String $comp_itm_grp_nm9 = "comp_itm_grp_nm9";
	/**
	 * Component item classification cd. 10 構成品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $comp_itm_grp_cd10 = "comp_itm_grp_cd10";
	/**
	 * Component item classification name 10 構成品目分類名１０.<p>
	 *
	 */
	public static final String $comp_itm_grp_nm10 = "comp_itm_grp_nm10";

	public static final String $core_itm_typ = $core_itm_typ_p + ".itm_typ";
	public static final String $core_itm_typ_nm = $core_itm_typ_p + ".itm_typ_nm";
	public static final String $core_itm_typ_d_cd = $core_itm_typ_p + ".itm_typ_d_cd";
	public static final String $core_itm_typ_d_nm = $core_itm_typ_p + ".itm_typ_d_nm";
	public static final String $core_itm_cd = $core_itm_p + ".itm_cd";
	public static final String $core_itm_sub1 = $core_itm_p + ".itm_sub1";
	public static final String $core_itm_sub2 = $core_itm_p + ".itm_sub2";
	public static final String $core_itm_sub3 = $core_itm_p + ".itm_sub3";
	public static final String $core_itm_nm = $core_itm_p + ".itm_nm";
	public static final String $comp_itm_typ = $comp_itm_typ_p + ".itm_typ";
	public static final String $comp_itm_typ_nm = $comp_itm_typ_p + ".itm_typ_nm";
	public static final String $comp_itm_typ_d_cd = $comp_itm_typ_p + ".itm_typ_d_cd";
	public static final String $comp_itm_typ_d_nm = $comp_itm_typ_p + ".itm_typ_d_nm";
	public static final String $comp_itm_cd = $comp_itm_p + ".itm_cd";
	public static final String $comp_itm_sub1 = $comp_itm_p + ".itm_sub1";
	public static final String $comp_itm_sub2 = $comp_itm_p + ".itm_sub2";
	public static final String $comp_itm_sub3 = $comp_itm_p + ".itm_sub3";
	public static final String $comp_itm_nm = $comp_itm_p + ".itm_nm";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta core_itm_typ_p_META = createInnerRowMeta($core_itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta core_itm_p_META = createInnerRowMeta($core_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta comp_itm_typ_p_META = createInnerRowMeta($comp_itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta comp_itm_p_META = createInnerRowMeta($comp_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta core_itm_grp_cd1_META = createCommonMeta($core_itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta core_itm_grp_nm1_META = createCommonMeta($core_itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta core_itm_grp_cd2_META = createCommonMeta($core_itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta core_itm_grp_nm2_META = createCommonMeta($core_itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta core_itm_grp_cd3_META = createCommonMeta($core_itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta core_itm_grp_nm3_META = createCommonMeta($core_itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta core_itm_grp_cd4_META = createCommonMeta($core_itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta core_itm_grp_nm4_META = createCommonMeta($core_itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta core_itm_grp_cd5_META = createCommonMeta($core_itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta core_itm_grp_nm5_META = createCommonMeta($core_itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta core_itm_grp_cd6_META = createCommonMeta($core_itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta core_itm_grp_nm6_META = createCommonMeta($core_itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta core_itm_grp_cd7_META = createCommonMeta($core_itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta core_itm_grp_nm7_META = createCommonMeta($core_itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta core_itm_grp_cd8_META = createCommonMeta($core_itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta core_itm_grp_nm8_META = createCommonMeta($core_itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta core_itm_grp_cd9_META = createCommonMeta($core_itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta core_itm_grp_nm9_META = createCommonMeta($core_itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta core_itm_grp_cd10_META = createCommonMeta($core_itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta core_itm_grp_nm10_META = createCommonMeta($core_itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta comp_itm_grp_cd1_META = createCommonMeta($comp_itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta comp_itm_grp_nm1_META = createCommonMeta($comp_itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta comp_itm_grp_cd2_META = createCommonMeta($comp_itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta comp_itm_grp_nm2_META = createCommonMeta($comp_itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta comp_itm_grp_cd3_META = createCommonMeta($comp_itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta comp_itm_grp_nm3_META = createCommonMeta($comp_itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta comp_itm_grp_cd4_META = createCommonMeta($comp_itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta comp_itm_grp_nm4_META = createCommonMeta($comp_itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta comp_itm_grp_cd5_META = createCommonMeta($comp_itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta comp_itm_grp_nm5_META = createCommonMeta($comp_itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta comp_itm_grp_cd6_META = createCommonMeta($comp_itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta comp_itm_grp_nm6_META = createCommonMeta($comp_itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta comp_itm_grp_cd7_META = createCommonMeta($comp_itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta comp_itm_grp_nm7_META = createCommonMeta($comp_itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta comp_itm_grp_cd8_META = createCommonMeta($comp_itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta comp_itm_grp_nm8_META = createCommonMeta($comp_itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta comp_itm_grp_cd9_META = createCommonMeta($comp_itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta comp_itm_grp_nm9_META = createCommonMeta($comp_itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta comp_itm_grp_cd10_META = createCommonMeta($comp_itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta comp_itm_grp_nm10_META = createCommonMeta($comp_itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			core_itm_typ_p_META,
			core_itm_p_META,
			comp_itm_typ_p_META,
			comp_itm_p_META,
			memo1_META,
			memo2_META,
			memo3_META,
			off_del_flg_META,
			on_del_flg_META,
			core_itm_grp_cd1_META,
			core_itm_grp_nm1_META,
			core_itm_grp_cd2_META,
			core_itm_grp_nm2_META,
			core_itm_grp_cd3_META,
			core_itm_grp_nm3_META,
			core_itm_grp_cd4_META,
			core_itm_grp_nm4_META,
			core_itm_grp_cd5_META,
			core_itm_grp_nm5_META,
			core_itm_grp_cd6_META,
			core_itm_grp_nm6_META,
			core_itm_grp_cd7_META,
			core_itm_grp_nm7_META,
			core_itm_grp_cd8_META,
			core_itm_grp_nm8_META,
			core_itm_grp_cd9_META,
			core_itm_grp_nm9_META,
			core_itm_grp_cd10_META,
			core_itm_grp_nm10_META,
			comp_itm_grp_cd1_META,
			comp_itm_grp_nm1_META,
			comp_itm_grp_cd2_META,
			comp_itm_grp_nm2_META,
			comp_itm_grp_cd3_META,
			comp_itm_grp_nm3_META,
			comp_itm_grp_cd4_META,
			comp_itm_grp_nm4_META,
			comp_itm_grp_cd5_META,
			comp_itm_grp_nm5_META,
			comp_itm_grp_cd6_META,
			comp_itm_grp_nm6_META,
			comp_itm_grp_cd7_META,
			comp_itm_grp_nm7_META,
			comp_itm_grp_cd8_META,
			comp_itm_grp_nm8_META,
			comp_itm_grp_cd9_META,
			comp_itm_grp_nm9_META,
			comp_itm_grp_cd10_META,
			comp_itm_grp_nm10_META
		},
		new String[][]{
			{
				"core_itm_typ",
				"core_itm_typ_nm",
				"core_itm_typ_d_cd",
				"core_itm_typ_d_nm",
				"core_itm_cd",
				"core_itm_sub1",
				"core_itm_sub2",
				"core_itm_sub3",
				"core_itm_nm",
				"comp_itm_typ",
				"comp_itm_typ_nm",
				"comp_itm_typ_d_cd",
				"comp_itm_typ_d_nm",
				"comp_itm_cd",
				"comp_itm_sub1",
				"comp_itm_sub2",
				"comp_itm_sub3",
				"comp_itm_nm"
			},
			{
				$core_itm_typ,
				$core_itm_typ_nm,
				$core_itm_typ_d_cd,
				$core_itm_typ_d_nm,
				$core_itm_cd,
				$core_itm_sub1,
				$core_itm_sub2,
				$core_itm_sub3,
				$core_itm_nm,
				$comp_itm_typ,
				$comp_itm_typ_nm,
				$comp_itm_typ_d_cd,
				$comp_itm_typ_d_nm,
				$comp_itm_cd,
				$comp_itm_sub1,
				$comp_itm_sub2,
				$comp_itm_sub3,
				$comp_itm_nm
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
				{$core_itm_grp_cd1, "itm_grp_nm"},	// core_itm_grp_cd1
				{$core_itm_grp_cd2, "itm_grp_nm"},	// core_itm_grp_cd2
				{$core_itm_grp_cd3, "itm_grp_nm"},	// core_itm_grp_cd3
				{$core_itm_grp_cd4, "itm_grp_nm"},	// core_itm_grp_cd4
				{$core_itm_grp_cd5, "itm_grp_nm"},	// core_itm_grp_cd5
				{$core_itm_grp_cd6, "itm_grp_nm"},	// core_itm_grp_cd6
				{$core_itm_grp_cd7, "itm_grp_nm"},	// core_itm_grp_cd7
				{$core_itm_grp_cd8, "itm_grp_nm"},	// core_itm_grp_cd8
				{$core_itm_grp_cd9, "itm_grp_nm"},	// core_itm_grp_cd9
				{$core_itm_grp_cd10, "itm_grp_nm"},	// core_itm_grp_cd10
				{$comp_itm_grp_cd1, "itm_grp_nm"},	// comp_itm_grp_cd1
				{$comp_itm_grp_cd2, "itm_grp_nm"},	// comp_itm_grp_cd2
				{$comp_itm_grp_cd3, "itm_grp_nm"},	// comp_itm_grp_cd3
				{$comp_itm_grp_cd4, "itm_grp_nm"},	// comp_itm_grp_cd4
				{$comp_itm_grp_cd5, "itm_grp_nm"},	// comp_itm_grp_cd5
				{$comp_itm_grp_cd6, "itm_grp_nm"},	// comp_itm_grp_cd6
				{$comp_itm_grp_cd7, "itm_grp_nm"},	// comp_itm_grp_cd7
				{$comp_itm_grp_cd8, "itm_grp_nm"},	// comp_itm_grp_cd8
				{$comp_itm_grp_cd9, "itm_grp_nm"},	// comp_itm_grp_cd9
				{$comp_itm_grp_cd10, "itm_grp_nm"}	// comp_itm_grp_cd10
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$core_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.COMP_CORE_ITM"},	// core_itm_p.itm_cd
				{$comp_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"}	// comp_itm_p.itm_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$core_itm_p + ".itm_cd", "itm_is_srch_typ"},	// core_itm_p.itm_cd
				{$comp_itm_p + ".itm_cd", "itm_is_srch_typ"}	// comp_itm_p.itm_cd
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


	public mcframe.clientMAUB.MAUBP0100.ItmTypR core_itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 1, $core_itm_typ_p);
	}
	
	public void core_itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 1, $core_itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR core_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 2, $core_itm_p);
	}
	
	public void core_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 2, $core_itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR comp_itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 3, $comp_itm_typ_p);
	}
	
	public void comp_itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 3, $comp_itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR comp_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 4, $comp_itm_p);
	}
	
	public void comp_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 4, $comp_itm_p, row);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 5, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 5, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 6, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 6, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 7, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 7, $memo3, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 8, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 8, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 9, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 9, $on_del_flg, value);
	}


	/**
	 * Main item classification cd. 1 主品目分類ＣＤ１.<p>
	 *
	 */
	public String core_itm_grp_cd1() {
		return getConstString(offset + 10, $core_itm_grp_cd1);
	}

	/**
	 * Main item classification cd. 1 主品目分類ＣＤ１.<p>
	 *
	 */
	public void core_itm_grp_cd1(String value) {
		setConstString(offset + 10, $core_itm_grp_cd1, value);
	}


	/**
	 * Main item classification name 1 主品目分類名１.<p>
	 *
	 */
	public String core_itm_grp_nm1() {
		return getConstString(offset + 11, $core_itm_grp_nm1);
	}

	/**
	 * Main item classification name 1 主品目分類名１.<p>
	 *
	 */
	public void core_itm_grp_nm1(String value) {
		setConstString(offset + 11, $core_itm_grp_nm1, value);
	}


	/**
	 * Main item classification cd. 2 主品目分類ＣＤ２.<p>
	 *
	 */
	public String core_itm_grp_cd2() {
		return getConstString(offset + 12, $core_itm_grp_cd2);
	}

	/**
	 * Main item classification cd. 2 主品目分類ＣＤ２.<p>
	 *
	 */
	public void core_itm_grp_cd2(String value) {
		setConstString(offset + 12, $core_itm_grp_cd2, value);
	}


	/**
	 * Main item classification name 2 主品目分類名２.<p>
	 *
	 */
	public String core_itm_grp_nm2() {
		return getConstString(offset + 13, $core_itm_grp_nm2);
	}

	/**
	 * Main item classification name 2 主品目分類名２.<p>
	 *
	 */
	public void core_itm_grp_nm2(String value) {
		setConstString(offset + 13, $core_itm_grp_nm2, value);
	}


	/**
	 * Main item classification cd. 3 主品目分類ＣＤ３.<p>
	 *
	 */
	public String core_itm_grp_cd3() {
		return getConstString(offset + 14, $core_itm_grp_cd3);
	}

	/**
	 * Main item classification cd. 3 主品目分類ＣＤ３.<p>
	 *
	 */
	public void core_itm_grp_cd3(String value) {
		setConstString(offset + 14, $core_itm_grp_cd3, value);
	}


	/**
	 * Main item classification name 3 主品目分類名３.<p>
	 *
	 */
	public String core_itm_grp_nm3() {
		return getConstString(offset + 15, $core_itm_grp_nm3);
	}

	/**
	 * Main item classification name 3 主品目分類名３.<p>
	 *
	 */
	public void core_itm_grp_nm3(String value) {
		setConstString(offset + 15, $core_itm_grp_nm3, value);
	}


	/**
	 * Main item classification cd. 4 主品目分類ＣＤ４.<p>
	 *
	 */
	public String core_itm_grp_cd4() {
		return getConstString(offset + 16, $core_itm_grp_cd4);
	}

	/**
	 * Main item classification cd. 4 主品目分類ＣＤ４.<p>
	 *
	 */
	public void core_itm_grp_cd4(String value) {
		setConstString(offset + 16, $core_itm_grp_cd4, value);
	}


	/**
	 * Main item classification name 4 主品目分類名４.<p>
	 *
	 */
	public String core_itm_grp_nm4() {
		return getConstString(offset + 17, $core_itm_grp_nm4);
	}

	/**
	 * Main item classification name 4 主品目分類名４.<p>
	 *
	 */
	public void core_itm_grp_nm4(String value) {
		setConstString(offset + 17, $core_itm_grp_nm4, value);
	}


	/**
	 * Main item classification cd. 5 主品目分類ＣＤ５.<p>
	 *
	 */
	public String core_itm_grp_cd5() {
		return getConstString(offset + 18, $core_itm_grp_cd5);
	}

	/**
	 * Main item classification cd. 5 主品目分類ＣＤ５.<p>
	 *
	 */
	public void core_itm_grp_cd5(String value) {
		setConstString(offset + 18, $core_itm_grp_cd5, value);
	}


	/**
	 * Main item classification name 5 主品目分類名５.<p>
	 *
	 */
	public String core_itm_grp_nm5() {
		return getConstString(offset + 19, $core_itm_grp_nm5);
	}

	/**
	 * Main item classification name 5 主品目分類名５.<p>
	 *
	 */
	public void core_itm_grp_nm5(String value) {
		setConstString(offset + 19, $core_itm_grp_nm5, value);
	}


	/**
	 * Main item classification cd. 6 主品目分類ＣＤ６.<p>
	 *
	 */
	public String core_itm_grp_cd6() {
		return getConstString(offset + 20, $core_itm_grp_cd6);
	}

	/**
	 * Main item classification cd. 6 主品目分類ＣＤ６.<p>
	 *
	 */
	public void core_itm_grp_cd6(String value) {
		setConstString(offset + 20, $core_itm_grp_cd6, value);
	}


	/**
	 * Main item classification name 6 主品目分類名６.<p>
	 *
	 */
	public String core_itm_grp_nm6() {
		return getConstString(offset + 21, $core_itm_grp_nm6);
	}

	/**
	 * Main item classification name 6 主品目分類名６.<p>
	 *
	 */
	public void core_itm_grp_nm6(String value) {
		setConstString(offset + 21, $core_itm_grp_nm6, value);
	}


	/**
	 * Main item classification cd. 7 主品目分類ＣＤ７.<p>
	 *
	 */
	public String core_itm_grp_cd7() {
		return getConstString(offset + 22, $core_itm_grp_cd7);
	}

	/**
	 * Main item classification cd. 7 主品目分類ＣＤ７.<p>
	 *
	 */
	public void core_itm_grp_cd7(String value) {
		setConstString(offset + 22, $core_itm_grp_cd7, value);
	}


	/**
	 * Main item classification name 7 主品目分類名７.<p>
	 *
	 */
	public String core_itm_grp_nm7() {
		return getConstString(offset + 23, $core_itm_grp_nm7);
	}

	/**
	 * Main item classification name 7 主品目分類名７.<p>
	 *
	 */
	public void core_itm_grp_nm7(String value) {
		setConstString(offset + 23, $core_itm_grp_nm7, value);
	}


	/**
	 * Main item classification cd. 8 主品目分類ＣＤ８.<p>
	 *
	 */
	public String core_itm_grp_cd8() {
		return getConstString(offset + 24, $core_itm_grp_cd8);
	}

	/**
	 * Main item classification cd. 8 主品目分類ＣＤ８.<p>
	 *
	 */
	public void core_itm_grp_cd8(String value) {
		setConstString(offset + 24, $core_itm_grp_cd8, value);
	}


	/**
	 * Main item classification name 8 主品目分類名８.<p>
	 *
	 */
	public String core_itm_grp_nm8() {
		return getConstString(offset + 25, $core_itm_grp_nm8);
	}

	/**
	 * Main item classification name 8 主品目分類名８.<p>
	 *
	 */
	public void core_itm_grp_nm8(String value) {
		setConstString(offset + 25, $core_itm_grp_nm8, value);
	}


	/**
	 * Main item classification cd. 9 主品目分類ＣＤ９.<p>
	 *
	 */
	public String core_itm_grp_cd9() {
		return getConstString(offset + 26, $core_itm_grp_cd9);
	}

	/**
	 * Main item classification cd. 9 主品目分類ＣＤ９.<p>
	 *
	 */
	public void core_itm_grp_cd9(String value) {
		setConstString(offset + 26, $core_itm_grp_cd9, value);
	}


	/**
	 * Main item classification name 9 主品目分類名９.<p>
	 *
	 */
	public String core_itm_grp_nm9() {
		return getConstString(offset + 27, $core_itm_grp_nm9);
	}

	/**
	 * Main item classification name 9 主品目分類名９.<p>
	 *
	 */
	public void core_itm_grp_nm9(String value) {
		setConstString(offset + 27, $core_itm_grp_nm9, value);
	}


	/**
	 * Main item classification cd. 10 主品目分類ＣＤ１０.<p>
	 *
	 */
	public String core_itm_grp_cd10() {
		return getConstString(offset + 28, $core_itm_grp_cd10);
	}

	/**
	 * Main item classification cd. 10 主品目分類ＣＤ１０.<p>
	 *
	 */
	public void core_itm_grp_cd10(String value) {
		setConstString(offset + 28, $core_itm_grp_cd10, value);
	}


	/**
	 * Main item classification name 10 主品目分類名１０.<p>
	 *
	 */
	public String core_itm_grp_nm10() {
		return getConstString(offset + 29, $core_itm_grp_nm10);
	}

	/**
	 * Main item classification name 10 主品目分類名１０.<p>
	 *
	 */
	public void core_itm_grp_nm10(String value) {
		setConstString(offset + 29, $core_itm_grp_nm10, value);
	}


	/**
	 * Component item classification cd. 1 構成品目分類ＣＤ１.<p>
	 *
	 */
	public String comp_itm_grp_cd1() {
		return getConstString(offset + 30, $comp_itm_grp_cd1);
	}

	/**
	 * Component item classification cd. 1 構成品目分類ＣＤ１.<p>
	 *
	 */
	public void comp_itm_grp_cd1(String value) {
		setConstString(offset + 30, $comp_itm_grp_cd1, value);
	}


	/**
	 * Component item classification name 1 構成品目分類名１.<p>
	 *
	 */
	public String comp_itm_grp_nm1() {
		return getConstString(offset + 31, $comp_itm_grp_nm1);
	}

	/**
	 * Component item classification name 1 構成品目分類名１.<p>
	 *
	 */
	public void comp_itm_grp_nm1(String value) {
		setConstString(offset + 31, $comp_itm_grp_nm1, value);
	}


	/**
	 * Component item classification cd. 2 構成品目分類ＣＤ２.<p>
	 *
	 */
	public String comp_itm_grp_cd2() {
		return getConstString(offset + 32, $comp_itm_grp_cd2);
	}

	/**
	 * Component item classification cd. 2 構成品目分類ＣＤ２.<p>
	 *
	 */
	public void comp_itm_grp_cd2(String value) {
		setConstString(offset + 32, $comp_itm_grp_cd2, value);
	}


	/**
	 * Component item classification name 1 構成品目分類名２.<p>
	 *
	 */
	public String comp_itm_grp_nm2() {
		return getConstString(offset + 33, $comp_itm_grp_nm2);
	}

	/**
	 * Component item classification name 1 構成品目分類名２.<p>
	 *
	 */
	public void comp_itm_grp_nm2(String value) {
		setConstString(offset + 33, $comp_itm_grp_nm2, value);
	}


	/**
	 * Component item classification cd. 3 構成品目分類ＣＤ３.<p>
	 *
	 */
	public String comp_itm_grp_cd3() {
		return getConstString(offset + 34, $comp_itm_grp_cd3);
	}

	/**
	 * Component item classification cd. 3 構成品目分類ＣＤ３.<p>
	 *
	 */
	public void comp_itm_grp_cd3(String value) {
		setConstString(offset + 34, $comp_itm_grp_cd3, value);
	}


	/**
	 * Component item classification name 3 構成品目分類名３.<p>
	 *
	 */
	public String comp_itm_grp_nm3() {
		return getConstString(offset + 35, $comp_itm_grp_nm3);
	}

	/**
	 * Component item classification name 3 構成品目分類名３.<p>
	 *
	 */
	public void comp_itm_grp_nm3(String value) {
		setConstString(offset + 35, $comp_itm_grp_nm3, value);
	}


	/**
	 * Component item classification cd. 4 構成品目分類ＣＤ４.<p>
	 *
	 */
	public String comp_itm_grp_cd4() {
		return getConstString(offset + 36, $comp_itm_grp_cd4);
	}

	/**
	 * Component item classification cd. 4 構成品目分類ＣＤ４.<p>
	 *
	 */
	public void comp_itm_grp_cd4(String value) {
		setConstString(offset + 36, $comp_itm_grp_cd4, value);
	}


	/**
	 * Component item classification name 4 構成品目分類名４.<p>
	 *
	 */
	public String comp_itm_grp_nm4() {
		return getConstString(offset + 37, $comp_itm_grp_nm4);
	}

	/**
	 * Component item classification name 4 構成品目分類名４.<p>
	 *
	 */
	public void comp_itm_grp_nm4(String value) {
		setConstString(offset + 37, $comp_itm_grp_nm4, value);
	}


	/**
	 * Component item classification cd. 5 構成品目分類ＣＤ５.<p>
	 *
	 */
	public String comp_itm_grp_cd5() {
		return getConstString(offset + 38, $comp_itm_grp_cd5);
	}

	/**
	 * Component item classification cd. 5 構成品目分類ＣＤ５.<p>
	 *
	 */
	public void comp_itm_grp_cd5(String value) {
		setConstString(offset + 38, $comp_itm_grp_cd5, value);
	}


	/**
	 * Component item classification name 5 構成品目分類名５.<p>
	 *
	 */
	public String comp_itm_grp_nm5() {
		return getConstString(offset + 39, $comp_itm_grp_nm5);
	}

	/**
	 * Component item classification name 5 構成品目分類名５.<p>
	 *
	 */
	public void comp_itm_grp_nm5(String value) {
		setConstString(offset + 39, $comp_itm_grp_nm5, value);
	}


	/**
	 * Component item classification cd. 6 構成品目分類ＣＤ６.<p>
	 *
	 */
	public String comp_itm_grp_cd6() {
		return getConstString(offset + 40, $comp_itm_grp_cd6);
	}

	/**
	 * Component item classification cd. 6 構成品目分類ＣＤ６.<p>
	 *
	 */
	public void comp_itm_grp_cd6(String value) {
		setConstString(offset + 40, $comp_itm_grp_cd6, value);
	}


	/**
	 * Component item classification name 6 構成品目分類名６.<p>
	 *
	 */
	public String comp_itm_grp_nm6() {
		return getConstString(offset + 41, $comp_itm_grp_nm6);
	}

	/**
	 * Component item classification name 6 構成品目分類名６.<p>
	 *
	 */
	public void comp_itm_grp_nm6(String value) {
		setConstString(offset + 41, $comp_itm_grp_nm6, value);
	}


	/**
	 * Component item classification cd. 7 構成品目分類ＣＤ７.<p>
	 *
	 */
	public String comp_itm_grp_cd7() {
		return getConstString(offset + 42, $comp_itm_grp_cd7);
	}

	/**
	 * Component item classification cd. 7 構成品目分類ＣＤ７.<p>
	 *
	 */
	public void comp_itm_grp_cd7(String value) {
		setConstString(offset + 42, $comp_itm_grp_cd7, value);
	}


	/**
	 * Component item classification name 7 構成品目分類名７.<p>
	 *
	 */
	public String comp_itm_grp_nm7() {
		return getConstString(offset + 43, $comp_itm_grp_nm7);
	}

	/**
	 * Component item classification name 7 構成品目分類名７.<p>
	 *
	 */
	public void comp_itm_grp_nm7(String value) {
		setConstString(offset + 43, $comp_itm_grp_nm7, value);
	}


	/**
	 * Component item classification cd. 8 構成品目分類ＣＤ８.<p>
	 *
	 */
	public String comp_itm_grp_cd8() {
		return getConstString(offset + 44, $comp_itm_grp_cd8);
	}

	/**
	 * Component item classification cd. 8 構成品目分類ＣＤ８.<p>
	 *
	 */
	public void comp_itm_grp_cd8(String value) {
		setConstString(offset + 44, $comp_itm_grp_cd8, value);
	}


	/**
	 * Component item classification name 8 構成品目分類名８.<p>
	 *
	 */
	public String comp_itm_grp_nm8() {
		return getConstString(offset + 45, $comp_itm_grp_nm8);
	}

	/**
	 * Component item classification name 8 構成品目分類名８.<p>
	 *
	 */
	public void comp_itm_grp_nm8(String value) {
		setConstString(offset + 45, $comp_itm_grp_nm8, value);
	}


	/**
	 * Component item classification cd. 9 構成品目分類ＣＤ９.<p>
	 *
	 */
	public String comp_itm_grp_cd9() {
		return getConstString(offset + 46, $comp_itm_grp_cd9);
	}

	/**
	 * Component item classification cd. 9 構成品目分類ＣＤ９.<p>
	 *
	 */
	public void comp_itm_grp_cd9(String value) {
		setConstString(offset + 46, $comp_itm_grp_cd9, value);
	}


	/**
	 * Component item classification name 9 構成品目分類名９.<p>
	 *
	 */
	public String comp_itm_grp_nm9() {
		return getConstString(offset + 47, $comp_itm_grp_nm9);
	}

	/**
	 * Component item classification name 9 構成品目分類名９.<p>
	 *
	 */
	public void comp_itm_grp_nm9(String value) {
		setConstString(offset + 47, $comp_itm_grp_nm9, value);
	}


	/**
	 * Component item classification cd. 10 構成品目分類ＣＤ１０.<p>
	 *
	 */
	public String comp_itm_grp_cd10() {
		return getConstString(offset + 48, $comp_itm_grp_cd10);
	}

	/**
	 * Component item classification cd. 10 構成品目分類ＣＤ１０.<p>
	 *
	 */
	public void comp_itm_grp_cd10(String value) {
		setConstString(offset + 48, $comp_itm_grp_cd10, value);
	}


	/**
	 * Component item classification name 10 構成品目分類名１０.<p>
	 *
	 */
	public String comp_itm_grp_nm10() {
		return getConstString(offset + 49, $comp_itm_grp_nm10);
	}

	/**
	 * Component item classification name 10 構成品目分類名１０.<p>
	 *
	 */
	public void comp_itm_grp_nm10(String value) {
		setConstString(offset + 49, $comp_itm_grp_nm10, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
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
		if ($core_itm_grp_cd1.equalsIgnoreCase(name)) {
			return core_itm_grp_cd1();
		}
		if ($core_itm_grp_nm1.equalsIgnoreCase(name)) {
			return core_itm_grp_nm1();
		}
		if ($core_itm_grp_cd2.equalsIgnoreCase(name)) {
			return core_itm_grp_cd2();
		}
		if ($core_itm_grp_nm2.equalsIgnoreCase(name)) {
			return core_itm_grp_nm2();
		}
		if ($core_itm_grp_cd3.equalsIgnoreCase(name)) {
			return core_itm_grp_cd3();
		}
		if ($core_itm_grp_nm3.equalsIgnoreCase(name)) {
			return core_itm_grp_nm3();
		}
		if ($core_itm_grp_cd4.equalsIgnoreCase(name)) {
			return core_itm_grp_cd4();
		}
		if ($core_itm_grp_nm4.equalsIgnoreCase(name)) {
			return core_itm_grp_nm4();
		}
		if ($core_itm_grp_cd5.equalsIgnoreCase(name)) {
			return core_itm_grp_cd5();
		}
		if ($core_itm_grp_nm5.equalsIgnoreCase(name)) {
			return core_itm_grp_nm5();
		}
		if ($core_itm_grp_cd6.equalsIgnoreCase(name)) {
			return core_itm_grp_cd6();
		}
		if ($core_itm_grp_nm6.equalsIgnoreCase(name)) {
			return core_itm_grp_nm6();
		}
		if ($core_itm_grp_cd7.equalsIgnoreCase(name)) {
			return core_itm_grp_cd7();
		}
		if ($core_itm_grp_nm7.equalsIgnoreCase(name)) {
			return core_itm_grp_nm7();
		}
		if ($core_itm_grp_cd8.equalsIgnoreCase(name)) {
			return core_itm_grp_cd8();
		}
		if ($core_itm_grp_nm8.equalsIgnoreCase(name)) {
			return core_itm_grp_nm8();
		}
		if ($core_itm_grp_cd9.equalsIgnoreCase(name)) {
			return core_itm_grp_cd9();
		}
		if ($core_itm_grp_nm9.equalsIgnoreCase(name)) {
			return core_itm_grp_nm9();
		}
		if ($core_itm_grp_cd10.equalsIgnoreCase(name)) {
			return core_itm_grp_cd10();
		}
		if ($core_itm_grp_nm10.equalsIgnoreCase(name)) {
			return core_itm_grp_nm10();
		}
		if ($comp_itm_grp_cd1.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd1();
		}
		if ($comp_itm_grp_nm1.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm1();
		}
		if ($comp_itm_grp_cd2.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd2();
		}
		if ($comp_itm_grp_nm2.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm2();
		}
		if ($comp_itm_grp_cd3.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd3();
		}
		if ($comp_itm_grp_nm3.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm3();
		}
		if ($comp_itm_grp_cd4.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd4();
		}
		if ($comp_itm_grp_nm4.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm4();
		}
		if ($comp_itm_grp_cd5.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd5();
		}
		if ($comp_itm_grp_nm5.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm5();
		}
		if ($comp_itm_grp_cd6.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd6();
		}
		if ($comp_itm_grp_nm6.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm6();
		}
		if ($comp_itm_grp_cd7.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd7();
		}
		if ($comp_itm_grp_nm7.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm7();
		}
		if ($comp_itm_grp_cd8.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd8();
		}
		if ($comp_itm_grp_nm8.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm8();
		}
		if ($comp_itm_grp_cd9.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd9();
		}
		if ($comp_itm_grp_nm9.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm9();
		}
		if ($comp_itm_grp_cd10.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd10();
		}
		if ($comp_itm_grp_nm10.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm10();
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
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($core_itm_grp_cd1.equalsIgnoreCase(name)) {
			return core_itm_grp_cd1();
		}
		if ($core_itm_grp_nm1.equalsIgnoreCase(name)) {
			return core_itm_grp_nm1();
		}
		if ($core_itm_grp_cd2.equalsIgnoreCase(name)) {
			return core_itm_grp_cd2();
		}
		if ($core_itm_grp_nm2.equalsIgnoreCase(name)) {
			return core_itm_grp_nm2();
		}
		if ($core_itm_grp_cd3.equalsIgnoreCase(name)) {
			return core_itm_grp_cd3();
		}
		if ($core_itm_grp_nm3.equalsIgnoreCase(name)) {
			return core_itm_grp_nm3();
		}
		if ($core_itm_grp_cd4.equalsIgnoreCase(name)) {
			return core_itm_grp_cd4();
		}
		if ($core_itm_grp_nm4.equalsIgnoreCase(name)) {
			return core_itm_grp_nm4();
		}
		if ($core_itm_grp_cd5.equalsIgnoreCase(name)) {
			return core_itm_grp_cd5();
		}
		if ($core_itm_grp_nm5.equalsIgnoreCase(name)) {
			return core_itm_grp_nm5();
		}
		if ($core_itm_grp_cd6.equalsIgnoreCase(name)) {
			return core_itm_grp_cd6();
		}
		if ($core_itm_grp_nm6.equalsIgnoreCase(name)) {
			return core_itm_grp_nm6();
		}
		if ($core_itm_grp_cd7.equalsIgnoreCase(name)) {
			return core_itm_grp_cd7();
		}
		if ($core_itm_grp_nm7.equalsIgnoreCase(name)) {
			return core_itm_grp_nm7();
		}
		if ($core_itm_grp_cd8.equalsIgnoreCase(name)) {
			return core_itm_grp_cd8();
		}
		if ($core_itm_grp_nm8.equalsIgnoreCase(name)) {
			return core_itm_grp_nm8();
		}
		if ($core_itm_grp_cd9.equalsIgnoreCase(name)) {
			return core_itm_grp_cd9();
		}
		if ($core_itm_grp_nm9.equalsIgnoreCase(name)) {
			return core_itm_grp_nm9();
		}
		if ($core_itm_grp_cd10.equalsIgnoreCase(name)) {
			return core_itm_grp_cd10();
		}
		if ($core_itm_grp_nm10.equalsIgnoreCase(name)) {
			return core_itm_grp_nm10();
		}
		if ($comp_itm_grp_cd1.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd1();
		}
		if ($comp_itm_grp_nm1.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm1();
		}
		if ($comp_itm_grp_cd2.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd2();
		}
		if ($comp_itm_grp_nm2.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm2();
		}
		if ($comp_itm_grp_cd3.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd3();
		}
		if ($comp_itm_grp_nm3.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm3();
		}
		if ($comp_itm_grp_cd4.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd4();
		}
		if ($comp_itm_grp_nm4.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm4();
		}
		if ($comp_itm_grp_cd5.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd5();
		}
		if ($comp_itm_grp_nm5.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm5();
		}
		if ($comp_itm_grp_cd6.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd6();
		}
		if ($comp_itm_grp_nm6.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm6();
		}
		if ($comp_itm_grp_cd7.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd7();
		}
		if ($comp_itm_grp_nm7.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm7();
		}
		if ($comp_itm_grp_cd8.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd8();
		}
		if ($comp_itm_grp_nm8.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm8();
		}
		if ($comp_itm_grp_cd9.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd9();
		}
		if ($comp_itm_grp_nm9.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm9();
		}
		if ($comp_itm_grp_cd10.equalsIgnoreCase(name)) {
			return comp_itm_grp_cd10();
		}
		if ($comp_itm_grp_nm10.equalsIgnoreCase(name)) {
			return comp_itm_grp_nm10();
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
		if ($core_itm_grp_cd1.equalsIgnoreCase(name)) {
			core_itm_grp_cd1(value);
			return;
		}
		if ($core_itm_grp_nm1.equalsIgnoreCase(name)) {
			core_itm_grp_nm1(value);
			return;
		}
		if ($core_itm_grp_cd2.equalsIgnoreCase(name)) {
			core_itm_grp_cd2(value);
			return;
		}
		if ($core_itm_grp_nm2.equalsIgnoreCase(name)) {
			core_itm_grp_nm2(value);
			return;
		}
		if ($core_itm_grp_cd3.equalsIgnoreCase(name)) {
			core_itm_grp_cd3(value);
			return;
		}
		if ($core_itm_grp_nm3.equalsIgnoreCase(name)) {
			core_itm_grp_nm3(value);
			return;
		}
		if ($core_itm_grp_cd4.equalsIgnoreCase(name)) {
			core_itm_grp_cd4(value);
			return;
		}
		if ($core_itm_grp_nm4.equalsIgnoreCase(name)) {
			core_itm_grp_nm4(value);
			return;
		}
		if ($core_itm_grp_cd5.equalsIgnoreCase(name)) {
			core_itm_grp_cd5(value);
			return;
		}
		if ($core_itm_grp_nm5.equalsIgnoreCase(name)) {
			core_itm_grp_nm5(value);
			return;
		}
		if ($core_itm_grp_cd6.equalsIgnoreCase(name)) {
			core_itm_grp_cd6(value);
			return;
		}
		if ($core_itm_grp_nm6.equalsIgnoreCase(name)) {
			core_itm_grp_nm6(value);
			return;
		}
		if ($core_itm_grp_cd7.equalsIgnoreCase(name)) {
			core_itm_grp_cd7(value);
			return;
		}
		if ($core_itm_grp_nm7.equalsIgnoreCase(name)) {
			core_itm_grp_nm7(value);
			return;
		}
		if ($core_itm_grp_cd8.equalsIgnoreCase(name)) {
			core_itm_grp_cd8(value);
			return;
		}
		if ($core_itm_grp_nm8.equalsIgnoreCase(name)) {
			core_itm_grp_nm8(value);
			return;
		}
		if ($core_itm_grp_cd9.equalsIgnoreCase(name)) {
			core_itm_grp_cd9(value);
			return;
		}
		if ($core_itm_grp_nm9.equalsIgnoreCase(name)) {
			core_itm_grp_nm9(value);
			return;
		}
		if ($core_itm_grp_cd10.equalsIgnoreCase(name)) {
			core_itm_grp_cd10(value);
			return;
		}
		if ($core_itm_grp_nm10.equalsIgnoreCase(name)) {
			core_itm_grp_nm10(value);
			return;
		}
		if ($comp_itm_grp_cd1.equalsIgnoreCase(name)) {
			comp_itm_grp_cd1(value);
			return;
		}
		if ($comp_itm_grp_nm1.equalsIgnoreCase(name)) {
			comp_itm_grp_nm1(value);
			return;
		}
		if ($comp_itm_grp_cd2.equalsIgnoreCase(name)) {
			comp_itm_grp_cd2(value);
			return;
		}
		if ($comp_itm_grp_nm2.equalsIgnoreCase(name)) {
			comp_itm_grp_nm2(value);
			return;
		}
		if ($comp_itm_grp_cd3.equalsIgnoreCase(name)) {
			comp_itm_grp_cd3(value);
			return;
		}
		if ($comp_itm_grp_nm3.equalsIgnoreCase(name)) {
			comp_itm_grp_nm3(value);
			return;
		}
		if ($comp_itm_grp_cd4.equalsIgnoreCase(name)) {
			comp_itm_grp_cd4(value);
			return;
		}
		if ($comp_itm_grp_nm4.equalsIgnoreCase(name)) {
			comp_itm_grp_nm4(value);
			return;
		}
		if ($comp_itm_grp_cd5.equalsIgnoreCase(name)) {
			comp_itm_grp_cd5(value);
			return;
		}
		if ($comp_itm_grp_nm5.equalsIgnoreCase(name)) {
			comp_itm_grp_nm5(value);
			return;
		}
		if ($comp_itm_grp_cd6.equalsIgnoreCase(name)) {
			comp_itm_grp_cd6(value);
			return;
		}
		if ($comp_itm_grp_nm6.equalsIgnoreCase(name)) {
			comp_itm_grp_nm6(value);
			return;
		}
		if ($comp_itm_grp_cd7.equalsIgnoreCase(name)) {
			comp_itm_grp_cd7(value);
			return;
		}
		if ($comp_itm_grp_nm7.equalsIgnoreCase(name)) {
			comp_itm_grp_nm7(value);
			return;
		}
		if ($comp_itm_grp_cd8.equalsIgnoreCase(name)) {
			comp_itm_grp_cd8(value);
			return;
		}
		if ($comp_itm_grp_nm8.equalsIgnoreCase(name)) {
			comp_itm_grp_nm8(value);
			return;
		}
		if ($comp_itm_grp_cd9.equalsIgnoreCase(name)) {
			comp_itm_grp_cd9(value);
			return;
		}
		if ($comp_itm_grp_nm9.equalsIgnoreCase(name)) {
			comp_itm_grp_nm9(value);
			return;
		}
		if ($comp_itm_grp_cd10.equalsIgnoreCase(name)) {
			comp_itm_grp_cd10(value);
			return;
		}
		if ($comp_itm_grp_nm10.equalsIgnoreCase(name)) {
			comp_itm_grp_nm10(value);
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
		if ($core_itm_grp_cd1.equalsIgnoreCase(name)) {
			core_itm_grp_cd1(value);
			return;
		}
		if ($core_itm_grp_nm1.equalsIgnoreCase(name)) {
			core_itm_grp_nm1(value);
			return;
		}
		if ($core_itm_grp_cd2.equalsIgnoreCase(name)) {
			core_itm_grp_cd2(value);
			return;
		}
		if ($core_itm_grp_nm2.equalsIgnoreCase(name)) {
			core_itm_grp_nm2(value);
			return;
		}
		if ($core_itm_grp_cd3.equalsIgnoreCase(name)) {
			core_itm_grp_cd3(value);
			return;
		}
		if ($core_itm_grp_nm3.equalsIgnoreCase(name)) {
			core_itm_grp_nm3(value);
			return;
		}
		if ($core_itm_grp_cd4.equalsIgnoreCase(name)) {
			core_itm_grp_cd4(value);
			return;
		}
		if ($core_itm_grp_nm4.equalsIgnoreCase(name)) {
			core_itm_grp_nm4(value);
			return;
		}
		if ($core_itm_grp_cd5.equalsIgnoreCase(name)) {
			core_itm_grp_cd5(value);
			return;
		}
		if ($core_itm_grp_nm5.equalsIgnoreCase(name)) {
			core_itm_grp_nm5(value);
			return;
		}
		if ($core_itm_grp_cd6.equalsIgnoreCase(name)) {
			core_itm_grp_cd6(value);
			return;
		}
		if ($core_itm_grp_nm6.equalsIgnoreCase(name)) {
			core_itm_grp_nm6(value);
			return;
		}
		if ($core_itm_grp_cd7.equalsIgnoreCase(name)) {
			core_itm_grp_cd7(value);
			return;
		}
		if ($core_itm_grp_nm7.equalsIgnoreCase(name)) {
			core_itm_grp_nm7(value);
			return;
		}
		if ($core_itm_grp_cd8.equalsIgnoreCase(name)) {
			core_itm_grp_cd8(value);
			return;
		}
		if ($core_itm_grp_nm8.equalsIgnoreCase(name)) {
			core_itm_grp_nm8(value);
			return;
		}
		if ($core_itm_grp_cd9.equalsIgnoreCase(name)) {
			core_itm_grp_cd9(value);
			return;
		}
		if ($core_itm_grp_nm9.equalsIgnoreCase(name)) {
			core_itm_grp_nm9(value);
			return;
		}
		if ($core_itm_grp_cd10.equalsIgnoreCase(name)) {
			core_itm_grp_cd10(value);
			return;
		}
		if ($core_itm_grp_nm10.equalsIgnoreCase(name)) {
			core_itm_grp_nm10(value);
			return;
		}
		if ($comp_itm_grp_cd1.equalsIgnoreCase(name)) {
			comp_itm_grp_cd1(value);
			return;
		}
		if ($comp_itm_grp_nm1.equalsIgnoreCase(name)) {
			comp_itm_grp_nm1(value);
			return;
		}
		if ($comp_itm_grp_cd2.equalsIgnoreCase(name)) {
			comp_itm_grp_cd2(value);
			return;
		}
		if ($comp_itm_grp_nm2.equalsIgnoreCase(name)) {
			comp_itm_grp_nm2(value);
			return;
		}
		if ($comp_itm_grp_cd3.equalsIgnoreCase(name)) {
			comp_itm_grp_cd3(value);
			return;
		}
		if ($comp_itm_grp_nm3.equalsIgnoreCase(name)) {
			comp_itm_grp_nm3(value);
			return;
		}
		if ($comp_itm_grp_cd4.equalsIgnoreCase(name)) {
			comp_itm_grp_cd4(value);
			return;
		}
		if ($comp_itm_grp_nm4.equalsIgnoreCase(name)) {
			comp_itm_grp_nm4(value);
			return;
		}
		if ($comp_itm_grp_cd5.equalsIgnoreCase(name)) {
			comp_itm_grp_cd5(value);
			return;
		}
		if ($comp_itm_grp_nm5.equalsIgnoreCase(name)) {
			comp_itm_grp_nm5(value);
			return;
		}
		if ($comp_itm_grp_cd6.equalsIgnoreCase(name)) {
			comp_itm_grp_cd6(value);
			return;
		}
		if ($comp_itm_grp_nm6.equalsIgnoreCase(name)) {
			comp_itm_grp_nm6(value);
			return;
		}
		if ($comp_itm_grp_cd7.equalsIgnoreCase(name)) {
			comp_itm_grp_cd7(value);
			return;
		}
		if ($comp_itm_grp_nm7.equalsIgnoreCase(name)) {
			comp_itm_grp_nm7(value);
			return;
		}
		if ($comp_itm_grp_cd8.equalsIgnoreCase(name)) {
			comp_itm_grp_cd8(value);
			return;
		}
		if ($comp_itm_grp_nm8.equalsIgnoreCase(name)) {
			comp_itm_grp_nm8(value);
			return;
		}
		if ($comp_itm_grp_cd9.equalsIgnoreCase(name)) {
			comp_itm_grp_cd9(value);
			return;
		}
		if ($comp_itm_grp_nm9.equalsIgnoreCase(name)) {
			comp_itm_grp_nm9(value);
			return;
		}
		if ($comp_itm_grp_cd10.equalsIgnoreCase(name)) {
			comp_itm_grp_cd10(value);
			return;
		}
		if ($comp_itm_grp_nm10.equalsIgnoreCase(name)) {
			comp_itm_grp_nm10(value);
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
		if ($core_itm_typ_p.equalsIgnoreCase(name)) {
			return core_itm_typ_p();
		}
		if ($core_itm_p.equalsIgnoreCase(name)) {
			return core_itm_p();
		}
		if ($comp_itm_typ_p.equalsIgnoreCase(name)) {
			return comp_itm_typ_p();
		}
		if ($comp_itm_p.equalsIgnoreCase(name)) {
			return comp_itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($core_itm_typ_p.equalsIgnoreCase(name)) {
			core_itm_typ_p(
				((MCContainerMeta) core_itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($core_itm_p.equalsIgnoreCase(name)) {
			core_itm_p(
				((MCContainerMeta) core_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($comp_itm_typ_p.equalsIgnoreCase(name)) {
			comp_itm_typ_p(
				((MCContainerMeta) comp_itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($comp_itm_p.equalsIgnoreCase(name)) {
			comp_itm_p(
				((MCContainerMeta) comp_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Main item type 主品目区分.<p>
	 *
	 */
	public String core_itm_typ() {
		return core_itm_typ_p().itm_typ();
	}

	/**
	 * Main item type 主品目区分.<p>
	 *
	 */
	public void core_itm_typ(String value) {
		core_itm_typ_p().itm_typ(value);
	}

	/**
	 * Main item type name 主品目区分名.<p>
	 *
	 */
	public String core_itm_typ_nm() {
		return core_itm_typ_p().itm_typ_nm();
	}

	/**
	 * Main item type name 主品目区分名.<p>
	 *
	 */
	public void core_itm_typ_nm(String value) {
		core_itm_typ_p().itm_typ_nm(value);
	}

	/**
	 * Main item type details cd. 主品目区分詳細ＣＤ.<p>
	 *
	 */
	public String core_itm_typ_d_cd() {
		return core_itm_typ_p().itm_typ_d_cd();
	}

	/**
	 * Main item type details cd. 主品目区分詳細ＣＤ.<p>
	 *
	 */
	public void core_itm_typ_d_cd(String value) {
		core_itm_typ_p().itm_typ_d_cd(value);
	}

	/**
	 * Main item type details name 主品目区分詳細名.<p>
	 *
	 */
	public String core_itm_typ_d_nm() {
		return core_itm_typ_p().itm_typ_d_nm();
	}

	/**
	 * Main item type details name 主品目区分詳細名.<p>
	 *
	 */
	public void core_itm_typ_d_nm(String value) {
		core_itm_typ_p().itm_typ_d_nm(value);
	}

	/**
	 * Main item cd. 主品目ＣＤ.<p>
	 *
	 */
	public String core_itm_cd() {
		return core_itm_p().itm_cd();
	}

	/**
	 * Main item cd. 主品目ＣＤ.<p>
	 *
	 */
	public void core_itm_cd(String value) {
		core_itm_p().itm_cd(value);
	}

	/**
	 * Main branch No. 1 主枝番１.<p>
	 *
	 */
	public String core_itm_sub1() {
		return core_itm_p().itm_sub1();
	}

	/**
	 * Main branch No. 1 主枝番１.<p>
	 *
	 */
	public void core_itm_sub1(String value) {
		core_itm_p().itm_sub1(value);
	}

	/**
	 * Main branch No. 2 主枝番２.<p>
	 *
	 */
	public String core_itm_sub2() {
		return core_itm_p().itm_sub2();
	}

	/**
	 * Main branch No. 2 主枝番２.<p>
	 *
	 */
	public void core_itm_sub2(String value) {
		core_itm_p().itm_sub2(value);
	}

	/**
	 * Main branch No. 3 主枝番３.<p>
	 *
	 */
	public String core_itm_sub3() {
		return core_itm_p().itm_sub3();
	}

	/**
	 * Main branch No. 3 主枝番３.<p>
	 *
	 */
	public void core_itm_sub3(String value) {
		core_itm_p().itm_sub3(value);
	}

	/**
	 * Main item name 主品名.<p>
	 *
	 */
	public String core_itm_nm() {
		return core_itm_p().itm_nm();
	}

	/**
	 * Main item name 主品名.<p>
	 *
	 */
	public void core_itm_nm(String value) {
		core_itm_p().itm_nm(value);
	}

	/**
	 * Component item type 構成品目区分.<p>
	 *
	 */
	public String comp_itm_typ() {
		return comp_itm_typ_p().itm_typ();
	}

	/**
	 * Component item type 構成品目区分.<p>
	 *
	 */
	public void comp_itm_typ(String value) {
		comp_itm_typ_p().itm_typ(value);
	}

	/**
	 * Component item type name 構成品目区分名.<p>
	 *
	 */
	public String comp_itm_typ_nm() {
		return comp_itm_typ_p().itm_typ_nm();
	}

	/**
	 * Component item type name 構成品目区分名.<p>
	 *
	 */
	public void comp_itm_typ_nm(String value) {
		comp_itm_typ_p().itm_typ_nm(value);
	}

	/**
	 * Component item type details cd. 構成品目区分詳細ＣＤ.<p>
	 *
	 */
	public String comp_itm_typ_d_cd() {
		return comp_itm_typ_p().itm_typ_d_cd();
	}

	/**
	 * Component item type details cd. 構成品目区分詳細ＣＤ.<p>
	 *
	 */
	public void comp_itm_typ_d_cd(String value) {
		comp_itm_typ_p().itm_typ_d_cd(value);
	}

	/**
	 * Component item type details name 構成品目区分詳細名.<p>
	 *
	 */
	public String comp_itm_typ_d_nm() {
		return comp_itm_typ_p().itm_typ_d_nm();
	}

	/**
	 * Component item type details name 構成品目区分詳細名.<p>
	 *
	 */
	public void comp_itm_typ_d_nm(String value) {
		comp_itm_typ_p().itm_typ_d_nm(value);
	}

	/**
	 * Component item cd. 構成品目ＣＤ.<p>
	 *
	 */
	public String comp_itm_cd() {
		return comp_itm_p().itm_cd();
	}

	/**
	 * Component item cd. 構成品目ＣＤ.<p>
	 *
	 */
	public void comp_itm_cd(String value) {
		comp_itm_p().itm_cd(value);
	}

	/**
	 * Configuration branch 1 構成枝番１.<p>
	 *
	 */
	public String comp_itm_sub1() {
		return comp_itm_p().itm_sub1();
	}

	/**
	 * Configuration branch 1 構成枝番１.<p>
	 *
	 */
	public void comp_itm_sub1(String value) {
		comp_itm_p().itm_sub1(value);
	}

	/**
	 * Configuration branch 2 構成枝番２.<p>
	 *
	 */
	public String comp_itm_sub2() {
		return comp_itm_p().itm_sub2();
	}

	/**
	 * Configuration branch 2 構成枝番２.<p>
	 *
	 */
	public void comp_itm_sub2(String value) {
		comp_itm_p().itm_sub2(value);
	}

	/**
	 * Configuration branch 3 構成枝番３.<p>
	 *
	 */
	public String comp_itm_sub3() {
		return comp_itm_p().itm_sub3();
	}

	/**
	 * Configuration branch 3 構成枝番３.<p>
	 *
	 */
	public void comp_itm_sub3(String value) {
		comp_itm_p().itm_sub3(value);
	}

	/**
	 * Component item name 構成品目名.<p>
	 *
	 */
	public String comp_itm_nm() {
		return comp_itm_p().itm_nm();
	}

	/**
	 * Component item name 構成品目名.<p>
	 *
	 */
	public void comp_itm_nm(String value) {
		comp_itm_p().itm_nm(value);
	}

}

