package mcframe.clientMABC.MABCP0400;

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
	 * UPD,Release,0;DEL,Cancel,1;REF,View,3;COST,Apply to cost,5 UPD,リリースする,0;DEL,取り消す,1;REF,参照する,3;COST,原価へ反映する,5.<p>
	 *
	 */
	public static final String $ope = "ope";
	public static final String $itmtyp_p = "itmtyp_p";
	/**
	 * Release. Off リリース.オフ.<p>
	 *
	 */
	public static final String $release_flg_off = "release_flg_off";
	/**
	 * Release. On リリース.オン.<p>
	 *
	 */
	public static final String $release_flg_on = "release_flg_on";
	public static final String $itm_p = "itm_p";
	/**
	 * Memo 1 (Common) メモ１(共通）.<p>
	 *
	 */
	public static final String $memo1_c = "memo1_c";
	/**
	 * Memo 2 (Common) メモ２(共通）.<p>
	 *
	 */
	public static final String $memo2_c = "memo2_c";
	/**
	 * Memo 3 (Common) メモ３(共通）.<p>
	 *
	 */
	public static final String $memo3_c = "memo3_c";
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
	 * Not for sales 販売.対象外.<p>
	 *
	 */
	public static final String $sls_tar_out_flg = "sls_tar_out_flg";
	/**
	 * For sales 販売.対象.<p>
	 *
	 */
	public static final String $sls_tar_flg = "sls_tar_flg";
	/**
	 * Sales. not set 販売.未設定.<p>
	 *
	 */
	public static final String $sls_no_input_flg = "sls_no_input_flg";
	/**
	 * Sales. configured 販売.設定済.<p>
	 *
	 */
	public static final String $sls_input_flg = "sls_input_flg";
	/**
	 * Not for mfg. 製造.対象外.<p>
	 *
	 */
	public static final String $mfg_tar_out_flg = "mfg_tar_out_flg";
	/**
	 * For mfg. 製造.対象.<p>
	 *
	 */
	public static final String $mfg_tar_flg = "mfg_tar_flg";
	/**
	 * Manufacture not configured 製造.未設定.<p>
	 *
	 */
	public static final String $mfg_no_input_flg = "mfg_no_input_flg";
	/**
	 * Mfg. configured 製造.設定済.<p>
	 *
	 */
	public static final String $mfg_input_flg = "mfg_input_flg";
	/**
	 * Not for purchasing 購買.対象外.<p>
	 *
	 */
	public static final String $purc_tar_out_flg = "purc_tar_out_flg";
	/**
	 * For purchasing 購買.対象.<p>
	 *
	 */
	public static final String $purc_tar_flg = "purc_tar_flg";
	/**
	 * Purchasing. not set 購買.未設定.<p>
	 *
	 */
	public static final String $purc_no_input_flg = "purc_no_input_flg";
	/**
	 * Purchasing configured 購買.設定済.<p>
	 *
	 */
	public static final String $purc_input_flg = "purc_input_flg";
	/**
	 * Not for inspection 検査.対象外.<p>
	 *
	 */
	public static final String $insp_tar_out_flg = "insp_tar_out_flg";
	/**
	 * For inspection 検査.対象.<p>
	 *
	 */
	public static final String $insp_tar_flg = "insp_tar_flg";
	/**
	 * Inspection not configured 検査.未設定.<p>
	 *
	 */
	public static final String $insp_no_input_flg = "insp_no_input_flg";
	/**
	 * Inspection configured 検査.設定済.<p>
	 *
	 */
	public static final String $insp_input_flg = "insp_input_flg";
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

	public static final String $itm_typ = $itmtyp_p + ".itm_typ";
	public static final String $itm_typ_nm = $itmtyp_p + ".itm_typ_nm";
	public static final String $itm_typ_d_cd = $itmtyp_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itmtyp_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta itmtyp_p_META = createInnerRowMeta($itmtyp_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta release_flg_off_META = createCommonMeta($release_flg_off, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta release_flg_on_META = createCommonMeta($release_flg_on, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta memo1_c_META = createCommonMeta($memo1_c, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_c_META = createCommonMeta($memo2_c, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_c_META = createCommonMeta($memo3_c, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta sls_tar_out_flg_META = createCommonMeta($sls_tar_out_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_tar_flg_META = createCommonMeta($sls_tar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_no_input_flg_META = createCommonMeta($sls_no_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_input_flg_META = createCommonMeta($sls_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_tar_out_flg_META = createCommonMeta($mfg_tar_out_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_tar_flg_META = createCommonMeta($mfg_tar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_no_input_flg_META = createCommonMeta($mfg_no_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_input_flg_META = createCommonMeta($mfg_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_tar_out_flg_META = createCommonMeta($purc_tar_out_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_tar_flg_META = createCommonMeta($purc_tar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_no_input_flg_META = createCommonMeta($purc_no_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_input_flg_META = createCommonMeta($purc_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_tar_out_flg_META = createCommonMeta($insp_tar_out_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_tar_flg_META = createCommonMeta($insp_tar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_no_input_flg_META = createCommonMeta($insp_no_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_input_flg_META = createCommonMeta($insp_input_flg, mcframe.commonMA.meta.MA_META.FLG);
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

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			itmtyp_p_META,
			release_flg_off_META,
			release_flg_on_META,
			itm_p_META,
			memo1_c_META,
			memo2_c_META,
			memo3_c_META,
			memo1_META,
			memo2_META,
			memo3_META,
			sls_tar_out_flg_META,
			sls_tar_flg_META,
			sls_no_input_flg_META,
			sls_input_flg_META,
			mfg_tar_out_flg_META,
			mfg_tar_flg_META,
			mfg_no_input_flg_META,
			mfg_input_flg_META,
			purc_tar_out_flg_META,
			purc_tar_flg_META,
			purc_no_input_flg_META,
			purc_input_flg_META,
			insp_tar_out_flg_META,
			insp_tar_flg_META,
			insp_no_input_flg_META,
			insp_input_flg_META,
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
			itm_grp_nm10_META
		},
		new String[][]{
			{
				"itm_typ",
				"itm_typ_nm",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$itm_typ,
				$itm_typ_nm,
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_nm;itm_sub3"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_nm"},	// itm_p.itm_sub3
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
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.COMM"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.COMM;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.COMM;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.COMM;itm_cd;itm_sub1;itm_sub2"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// itm_p.itm_sub3
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
	 * UPD,Release,0;DEL,Cancel,1;REF,View,3;COST,Apply to cost,5 UPD,リリースする,0;DEL,取り消す,1;REF,参照する,3;COST,原価へ反映する,5.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Release,0;DEL,Cancel,1;REF,View,3;COST,Apply to cost,5 UPD,リリースする,0;DEL,取り消す,1;REF,参照する,3;COST,原価へ反映する,5.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itmtyp_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 1, $itmtyp_p);
	}
	
	public void itmtyp_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 1, $itmtyp_p, row);
	}


	/**
	 * Release. Off リリース.オフ.<p>
	 *
	 */
	public boolean release_flg_off() {
		return getConstBoolean(offset + 2, $release_flg_off);
	}

	/**
	 * Release. Off リリース.オフ.<p>
	 *
	 */
	public void release_flg_off(boolean value) {
		setConstBoolean(offset + 2, $release_flg_off, value);
	}


	/**
	 * Release. On リリース.オン.<p>
	 *
	 */
	public boolean release_flg_on() {
		return getConstBoolean(offset + 3, $release_flg_on);
	}

	/**
	 * Release. On リリース.オン.<p>
	 *
	 */
	public void release_flg_on(boolean value) {
		setConstBoolean(offset + 3, $release_flg_on, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 4, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 4, $itm_p, row);
	}


	/**
	 * Memo 1 (Common) メモ１(共通）.<p>
	 *
	 */
	public String memo1_c() {
		return getConstString(offset + 5, $memo1_c);
	}

	/**
	 * Memo 1 (Common) メモ１(共通）.<p>
	 *
	 */
	public void memo1_c(String value) {
		setConstString(offset + 5, $memo1_c, value);
	}


	/**
	 * Memo 2 (Common) メモ２(共通）.<p>
	 *
	 */
	public String memo2_c() {
		return getConstString(offset + 6, $memo2_c);
	}

	/**
	 * Memo 2 (Common) メモ２(共通）.<p>
	 *
	 */
	public void memo2_c(String value) {
		setConstString(offset + 6, $memo2_c, value);
	}


	/**
	 * Memo 3 (Common) メモ３(共通）.<p>
	 *
	 */
	public String memo3_c() {
		return getConstString(offset + 7, $memo3_c);
	}

	/**
	 * Memo 3 (Common) メモ３(共通）.<p>
	 *
	 */
	public void memo3_c(String value) {
		setConstString(offset + 7, $memo3_c, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 8, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 8, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 9, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 9, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 10, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 10, $memo3, value);
	}


	/**
	 * Not for sales 販売.対象外.<p>
	 *
	 */
	public boolean sls_tar_out_flg() {
		return getConstBoolean(offset + 11, $sls_tar_out_flg);
	}

	/**
	 * Not for sales 販売.対象外.<p>
	 *
	 */
	public void sls_tar_out_flg(boolean value) {
		setConstBoolean(offset + 11, $sls_tar_out_flg, value);
	}


	/**
	 * For sales 販売.対象.<p>
	 *
	 */
	public boolean sls_tar_flg() {
		return getConstBoolean(offset + 12, $sls_tar_flg);
	}

	/**
	 * For sales 販売.対象.<p>
	 *
	 */
	public void sls_tar_flg(boolean value) {
		setConstBoolean(offset + 12, $sls_tar_flg, value);
	}


	/**
	 * Sales. not set 販売.未設定.<p>
	 *
	 */
	public boolean sls_no_input_flg() {
		return getConstBoolean(offset + 13, $sls_no_input_flg);
	}

	/**
	 * Sales. not set 販売.未設定.<p>
	 *
	 */
	public void sls_no_input_flg(boolean value) {
		setConstBoolean(offset + 13, $sls_no_input_flg, value);
	}


	/**
	 * Sales. configured 販売.設定済.<p>
	 *
	 */
	public boolean sls_input_flg() {
		return getConstBoolean(offset + 14, $sls_input_flg);
	}

	/**
	 * Sales. configured 販売.設定済.<p>
	 *
	 */
	public void sls_input_flg(boolean value) {
		setConstBoolean(offset + 14, $sls_input_flg, value);
	}


	/**
	 * Not for mfg. 製造.対象外.<p>
	 *
	 */
	public boolean mfg_tar_out_flg() {
		return getConstBoolean(offset + 15, $mfg_tar_out_flg);
	}

	/**
	 * Not for mfg. 製造.対象外.<p>
	 *
	 */
	public void mfg_tar_out_flg(boolean value) {
		setConstBoolean(offset + 15, $mfg_tar_out_flg, value);
	}


	/**
	 * For mfg. 製造.対象.<p>
	 *
	 */
	public boolean mfg_tar_flg() {
		return getConstBoolean(offset + 16, $mfg_tar_flg);
	}

	/**
	 * For mfg. 製造.対象.<p>
	 *
	 */
	public void mfg_tar_flg(boolean value) {
		setConstBoolean(offset + 16, $mfg_tar_flg, value);
	}


	/**
	 * Manufacture not configured 製造.未設定.<p>
	 *
	 */
	public boolean mfg_no_input_flg() {
		return getConstBoolean(offset + 17, $mfg_no_input_flg);
	}

	/**
	 * Manufacture not configured 製造.未設定.<p>
	 *
	 */
	public void mfg_no_input_flg(boolean value) {
		setConstBoolean(offset + 17, $mfg_no_input_flg, value);
	}


	/**
	 * Mfg. configured 製造.設定済.<p>
	 *
	 */
	public boolean mfg_input_flg() {
		return getConstBoolean(offset + 18, $mfg_input_flg);
	}

	/**
	 * Mfg. configured 製造.設定済.<p>
	 *
	 */
	public void mfg_input_flg(boolean value) {
		setConstBoolean(offset + 18, $mfg_input_flg, value);
	}


	/**
	 * Not for purchasing 購買.対象外.<p>
	 *
	 */
	public boolean purc_tar_out_flg() {
		return getConstBoolean(offset + 19, $purc_tar_out_flg);
	}

	/**
	 * Not for purchasing 購買.対象外.<p>
	 *
	 */
	public void purc_tar_out_flg(boolean value) {
		setConstBoolean(offset + 19, $purc_tar_out_flg, value);
	}


	/**
	 * For purchasing 購買.対象.<p>
	 *
	 */
	public boolean purc_tar_flg() {
		return getConstBoolean(offset + 20, $purc_tar_flg);
	}

	/**
	 * For purchasing 購買.対象.<p>
	 *
	 */
	public void purc_tar_flg(boolean value) {
		setConstBoolean(offset + 20, $purc_tar_flg, value);
	}


	/**
	 * Purchasing. not set 購買.未設定.<p>
	 *
	 */
	public boolean purc_no_input_flg() {
		return getConstBoolean(offset + 21, $purc_no_input_flg);
	}

	/**
	 * Purchasing. not set 購買.未設定.<p>
	 *
	 */
	public void purc_no_input_flg(boolean value) {
		setConstBoolean(offset + 21, $purc_no_input_flg, value);
	}


	/**
	 * Purchasing configured 購買.設定済.<p>
	 *
	 */
	public boolean purc_input_flg() {
		return getConstBoolean(offset + 22, $purc_input_flg);
	}

	/**
	 * Purchasing configured 購買.設定済.<p>
	 *
	 */
	public void purc_input_flg(boolean value) {
		setConstBoolean(offset + 22, $purc_input_flg, value);
	}


	/**
	 * Not for inspection 検査.対象外.<p>
	 *
	 */
	public boolean insp_tar_out_flg() {
		return getConstBoolean(offset + 23, $insp_tar_out_flg);
	}

	/**
	 * Not for inspection 検査.対象外.<p>
	 *
	 */
	public void insp_tar_out_flg(boolean value) {
		setConstBoolean(offset + 23, $insp_tar_out_flg, value);
	}


	/**
	 * For inspection 検査.対象.<p>
	 *
	 */
	public boolean insp_tar_flg() {
		return getConstBoolean(offset + 24, $insp_tar_flg);
	}

	/**
	 * For inspection 検査.対象.<p>
	 *
	 */
	public void insp_tar_flg(boolean value) {
		setConstBoolean(offset + 24, $insp_tar_flg, value);
	}


	/**
	 * Inspection not configured 検査.未設定.<p>
	 *
	 */
	public boolean insp_no_input_flg() {
		return getConstBoolean(offset + 25, $insp_no_input_flg);
	}

	/**
	 * Inspection not configured 検査.未設定.<p>
	 *
	 */
	public void insp_no_input_flg(boolean value) {
		setConstBoolean(offset + 25, $insp_no_input_flg, value);
	}


	/**
	 * Inspection configured 検査.設定済.<p>
	 *
	 */
	public boolean insp_input_flg() {
		return getConstBoolean(offset + 26, $insp_input_flg);
	}

	/**
	 * Inspection configured 検査.設定済.<p>
	 *
	 */
	public void insp_input_flg(boolean value) {
		setConstBoolean(offset + 26, $insp_input_flg, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 27, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 27, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 28, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 28, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 29, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 29, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 30, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 30, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 31, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 31, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 32, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 32, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 33, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 33, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 34, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 34, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 35, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 35, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 36, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 36, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 37, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 37, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 38, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 38, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 39, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 39, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 40, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 40, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 41, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 41, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 42, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 42, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 43, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 43, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 44, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 44, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 45, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 45, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 46, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 46, $itm_grp_nm10, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($memo1_c.equalsIgnoreCase(name)) {
			return memo1_c();
		}
		if ($memo2_c.equalsIgnoreCase(name)) {
			return memo2_c();
		}
		if ($memo3_c.equalsIgnoreCase(name)) {
			return memo3_c();
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
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($release_flg_off.equalsIgnoreCase(name)) {
			return release_flg_off();
		}
		if ($release_flg_on.equalsIgnoreCase(name)) {
			return release_flg_on();
		}
		if ($sls_tar_out_flg.equalsIgnoreCase(name)) {
			return sls_tar_out_flg();
		}
		if ($sls_tar_flg.equalsIgnoreCase(name)) {
			return sls_tar_flg();
		}
		if ($sls_no_input_flg.equalsIgnoreCase(name)) {
			return sls_no_input_flg();
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			return sls_input_flg();
		}
		if ($mfg_tar_out_flg.equalsIgnoreCase(name)) {
			return mfg_tar_out_flg();
		}
		if ($mfg_tar_flg.equalsIgnoreCase(name)) {
			return mfg_tar_flg();
		}
		if ($mfg_no_input_flg.equalsIgnoreCase(name)) {
			return mfg_no_input_flg();
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			return mfg_input_flg();
		}
		if ($purc_tar_out_flg.equalsIgnoreCase(name)) {
			return purc_tar_out_flg();
		}
		if ($purc_tar_flg.equalsIgnoreCase(name)) {
			return purc_tar_flg();
		}
		if ($purc_no_input_flg.equalsIgnoreCase(name)) {
			return purc_no_input_flg();
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			return purc_input_flg();
		}
		if ($insp_tar_out_flg.equalsIgnoreCase(name)) {
			return insp_tar_out_flg();
		}
		if ($insp_tar_flg.equalsIgnoreCase(name)) {
			return insp_tar_flg();
		}
		if ($insp_no_input_flg.equalsIgnoreCase(name)) {
			return insp_no_input_flg();
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			return insp_input_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($memo1_c.equalsIgnoreCase(name)) {
			return memo1_c();
		}
		if ($memo2_c.equalsIgnoreCase(name)) {
			return memo2_c();
		}
		if ($memo3_c.equalsIgnoreCase(name)) {
			return memo3_c();
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
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($release_flg_off.equalsIgnoreCase(name)) {
			return release_flg_off();
		}
		if ($release_flg_on.equalsIgnoreCase(name)) {
			return release_flg_on();
		}
		if ($sls_tar_out_flg.equalsIgnoreCase(name)) {
			return sls_tar_out_flg();
		}
		if ($sls_tar_flg.equalsIgnoreCase(name)) {
			return sls_tar_flg();
		}
		if ($sls_no_input_flg.equalsIgnoreCase(name)) {
			return sls_no_input_flg();
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			return sls_input_flg();
		}
		if ($mfg_tar_out_flg.equalsIgnoreCase(name)) {
			return mfg_tar_out_flg();
		}
		if ($mfg_tar_flg.equalsIgnoreCase(name)) {
			return mfg_tar_flg();
		}
		if ($mfg_no_input_flg.equalsIgnoreCase(name)) {
			return mfg_no_input_flg();
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			return mfg_input_flg();
		}
		if ($purc_tar_out_flg.equalsIgnoreCase(name)) {
			return purc_tar_out_flg();
		}
		if ($purc_tar_flg.equalsIgnoreCase(name)) {
			return purc_tar_flg();
		}
		if ($purc_no_input_flg.equalsIgnoreCase(name)) {
			return purc_no_input_flg();
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			return purc_input_flg();
		}
		if ($insp_tar_out_flg.equalsIgnoreCase(name)) {
			return insp_tar_out_flg();
		}
		if ($insp_tar_flg.equalsIgnoreCase(name)) {
			return insp_tar_flg();
		}
		if ($insp_no_input_flg.equalsIgnoreCase(name)) {
			return insp_no_input_flg();
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			return insp_input_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($memo1_c.equalsIgnoreCase(name)) {
			memo1_c(value);
			return;
		}
		if ($memo2_c.equalsIgnoreCase(name)) {
			memo2_c(value);
			return;
		}
		if ($memo3_c.equalsIgnoreCase(name)) {
			memo3_c(value);
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
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($release_flg_off.equalsIgnoreCase(name)) {
			release_flg_off(value);
			return;
		}
		if ($release_flg_on.equalsIgnoreCase(name)) {
			release_flg_on(value);
			return;
		}
		if ($sls_tar_out_flg.equalsIgnoreCase(name)) {
			sls_tar_out_flg(value);
			return;
		}
		if ($sls_tar_flg.equalsIgnoreCase(name)) {
			sls_tar_flg(value);
			return;
		}
		if ($sls_no_input_flg.equalsIgnoreCase(name)) {
			sls_no_input_flg(value);
			return;
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			sls_input_flg(value);
			return;
		}
		if ($mfg_tar_out_flg.equalsIgnoreCase(name)) {
			mfg_tar_out_flg(value);
			return;
		}
		if ($mfg_tar_flg.equalsIgnoreCase(name)) {
			mfg_tar_flg(value);
			return;
		}
		if ($mfg_no_input_flg.equalsIgnoreCase(name)) {
			mfg_no_input_flg(value);
			return;
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			mfg_input_flg(value);
			return;
		}
		if ($purc_tar_out_flg.equalsIgnoreCase(name)) {
			purc_tar_out_flg(value);
			return;
		}
		if ($purc_tar_flg.equalsIgnoreCase(name)) {
			purc_tar_flg(value);
			return;
		}
		if ($purc_no_input_flg.equalsIgnoreCase(name)) {
			purc_no_input_flg(value);
			return;
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			purc_input_flg(value);
			return;
		}
		if ($insp_tar_out_flg.equalsIgnoreCase(name)) {
			insp_tar_out_flg(value);
			return;
		}
		if ($insp_tar_flg.equalsIgnoreCase(name)) {
			insp_tar_flg(value);
			return;
		}
		if ($insp_no_input_flg.equalsIgnoreCase(name)) {
			insp_no_input_flg(value);
			return;
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			insp_input_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($memo1_c.equalsIgnoreCase(name)) {
			memo1_c(value);
			return;
		}
		if ($memo2_c.equalsIgnoreCase(name)) {
			memo2_c(value);
			return;
		}
		if ($memo3_c.equalsIgnoreCase(name)) {
			memo3_c(value);
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
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($release_flg_off.equalsIgnoreCase(name)) {
			release_flg_off(value);
			return;
		}
		if ($release_flg_on.equalsIgnoreCase(name)) {
			release_flg_on(value);
			return;
		}
		if ($sls_tar_out_flg.equalsIgnoreCase(name)) {
			sls_tar_out_flg(value);
			return;
		}
		if ($sls_tar_flg.equalsIgnoreCase(name)) {
			sls_tar_flg(value);
			return;
		}
		if ($sls_no_input_flg.equalsIgnoreCase(name)) {
			sls_no_input_flg(value);
			return;
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			sls_input_flg(value);
			return;
		}
		if ($mfg_tar_out_flg.equalsIgnoreCase(name)) {
			mfg_tar_out_flg(value);
			return;
		}
		if ($mfg_tar_flg.equalsIgnoreCase(name)) {
			mfg_tar_flg(value);
			return;
		}
		if ($mfg_no_input_flg.equalsIgnoreCase(name)) {
			mfg_no_input_flg(value);
			return;
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			mfg_input_flg(value);
			return;
		}
		if ($purc_tar_out_flg.equalsIgnoreCase(name)) {
			purc_tar_out_flg(value);
			return;
		}
		if ($purc_tar_flg.equalsIgnoreCase(name)) {
			purc_tar_flg(value);
			return;
		}
		if ($purc_no_input_flg.equalsIgnoreCase(name)) {
			purc_no_input_flg(value);
			return;
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			purc_input_flg(value);
			return;
		}
		if ($insp_tar_out_flg.equalsIgnoreCase(name)) {
			insp_tar_out_flg(value);
			return;
		}
		if ($insp_tar_flg.equalsIgnoreCase(name)) {
			insp_tar_flg(value);
			return;
		}
		if ($insp_no_input_flg.equalsIgnoreCase(name)) {
			insp_no_input_flg(value);
			return;
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			insp_input_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itmtyp_p.equalsIgnoreCase(name)) {
			return itmtyp_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itmtyp_p.equalsIgnoreCase(name)) {
			itmtyp_p(
				((MCContainerMeta) itmtyp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
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


	public String itm_typ() {
		return itmtyp_p().itm_typ();
	}

	public void itm_typ(String value) {
		itmtyp_p().itm_typ(value);
	}

	public String itm_typ_nm() {
		return itmtyp_p().itm_typ_nm();
	}

	public void itm_typ_nm(String value) {
		itmtyp_p().itm_typ_nm(value);
	}

	public String itm_typ_d_cd() {
		return itmtyp_p().itm_typ_d_cd();
	}

	public void itm_typ_d_cd(String value) {
		itmtyp_p().itm_typ_d_cd(value);
	}

	public String itm_typ_d_nm() {
		return itmtyp_p().itm_typ_d_nm();
	}

	public void itm_typ_d_nm(String value) {
		itmtyp_p().itm_typ_d_nm(value);
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

