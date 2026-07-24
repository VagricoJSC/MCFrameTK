package mcframe.clientMSBF.MSBFP0100;

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
 * ブロック"RsltTyp"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltTypR_MC_A extends MCConstRow {

	/**
	 * Row No. 行ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
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
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Shipping approval result type from mfg. site 製造所出荷承認結果区分.<p>
	 *
	 */
	public static final String $mfg_so_aprv_typ = "mfg_so_aprv_typ";
	/**
	 * Name of Shipping approval result type from mfg. site 製造所出荷承認結果区分名.<p>
	 *
	 */
	public static final String $mfg_so_aprv_typ_nm = "mfg_so_aprv_typ_nm";
	/**
	 * Inspection management result type 品質管理結果区分.<p>
	 *
	 */
	public static final String $quality_mng_typ = "quality_mng_typ";
	/**
	 * Inspection management result type name 品質管理結果区分名.<p>
	 *
	 */
	public static final String $quality_mng_typ_nm = "quality_mng_typ_nm";
	/**
	 * Mfg. management result type 製造管理結果区分.<p>
	 *
	 */
	public static final String $mfg_mng_typ = "mfg_mng_typ";
	/**
	 * Mfg. management result type name 製造管理結果区分名.<p>
	 *
	 */
	public static final String $mfg_mng_typ_nm = "mfg_mng_typ_nm";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta mfg_so_aprv_typ_META = createCommonMeta($mfg_so_aprv_typ, mcframe.commonMS.meta.MS_META.MFG_SO_APRV_TYP);
	public static final MCMeta mfg_so_aprv_typ_nm_META = createCommonMeta($mfg_so_aprv_typ_nm, mcframe.commonMS.meta.MS_META.MFG_SO_APRV_TYP_NM);
	public static final MCMeta quality_mng_typ_META = createCommonMeta($quality_mng_typ, mcframe.commonMS.meta.MS_META.QUALITY_MNG_TYP);
	public static final MCMeta quality_mng_typ_nm_META = createCommonMeta($quality_mng_typ_nm, mcframe.commonMS.meta.MS_META.QUALITY_MNG_TYP_NM);
	public static final MCMeta mfg_mng_typ_META = createCommonMeta($mfg_mng_typ, mcframe.commonMS.meta.MS_META.MFG_MNG_TYP);
	public static final MCMeta mfg_mng_typ_nm_META = createCommonMeta($mfg_mng_typ_nm, mcframe.commonMS.meta.MS_META.MFG_MNG_TYP_NM);

	protected static final ConstMetaList<RsltTypR> constMetas = new ConstMetaList<RsltTypR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lot_no_META,
			mfg_so_aprv_typ_META,
			mfg_so_aprv_typ_nm_META,
			quality_mng_typ_META,
			quality_mng_typ_nm_META,
			mfg_mng_typ_META,
			mfg_mng_typ_nm_META
		},
		new String[][]{
			{
			},
			{
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	protected RsltTypR_MC_A(ConstMetaList<? extends RsltTypR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltTypR clone() {
		return (RsltTypR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltTypR createInstance() {
		return (RsltTypR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltTypR getValues(String... names) {
		return (RsltTypR) super.getValues(names);
	}



	/**
	 * Row No. 行ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Row No. 行ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Row No. 行ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Row No. 行ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Row No. 行ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Row No. 行ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 5, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 5, $lot_no, value);
	}


	/**
	 * Shipping approval result type from mfg. site 製造所出荷承認結果区分.<p>
	 *
	 */
	public String mfg_so_aprv_typ() {
		return getConstString(offset + 6, $mfg_so_aprv_typ);
	}

	/**
	 * Shipping approval result type from mfg. site 製造所出荷承認結果区分.<p>
	 *
	 */
	public void mfg_so_aprv_typ(String value) {
		setConstString(offset + 6, $mfg_so_aprv_typ, value);
	}


	/**
	 * Name of Shipping approval result type from mfg. site 製造所出荷承認結果区分名.<p>
	 *
	 */
	public String mfg_so_aprv_typ_nm() {
		return getConstString(offset + 7, $mfg_so_aprv_typ_nm);
	}

	/**
	 * Name of Shipping approval result type from mfg. site 製造所出荷承認結果区分名.<p>
	 *
	 */
	public void mfg_so_aprv_typ_nm(String value) {
		setConstString(offset + 7, $mfg_so_aprv_typ_nm, value);
	}


	/**
	 * Inspection management result type 品質管理結果区分.<p>
	 *
	 */
	public String quality_mng_typ() {
		return getConstString(offset + 8, $quality_mng_typ);
	}

	/**
	 * Inspection management result type 品質管理結果区分.<p>
	 *
	 */
	public void quality_mng_typ(String value) {
		setConstString(offset + 8, $quality_mng_typ, value);
	}


	/**
	 * Inspection management result type name 品質管理結果区分名.<p>
	 *
	 */
	public String quality_mng_typ_nm() {
		return getConstString(offset + 9, $quality_mng_typ_nm);
	}

	/**
	 * Inspection management result type name 品質管理結果区分名.<p>
	 *
	 */
	public void quality_mng_typ_nm(String value) {
		setConstString(offset + 9, $quality_mng_typ_nm, value);
	}


	/**
	 * Mfg. management result type 製造管理結果区分.<p>
	 *
	 */
	public String mfg_mng_typ() {
		return getConstString(offset + 10, $mfg_mng_typ);
	}

	/**
	 * Mfg. management result type 製造管理結果区分.<p>
	 *
	 */
	public void mfg_mng_typ(String value) {
		setConstString(offset + 10, $mfg_mng_typ, value);
	}


	/**
	 * Mfg. management result type name 製造管理結果区分名.<p>
	 *
	 */
	public String mfg_mng_typ_nm() {
		return getConstString(offset + 11, $mfg_mng_typ_nm);
	}

	/**
	 * Mfg. management result type name 製造管理結果区分名.<p>
	 *
	 */
	public void mfg_mng_typ_nm(String value) {
		setConstString(offset + 11, $mfg_mng_typ_nm, value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ();
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ_nm();
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			return quality_mng_typ();
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			return quality_mng_typ_nm();
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			return mfg_mng_typ();
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mng_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ();
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ_nm();
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			return quality_mng_typ();
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			return quality_mng_typ_nm();
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			return mfg_mng_typ();
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mng_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ(value);
			return;
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ_nm(value);
			return;
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			quality_mng_typ(value);
			return;
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			quality_mng_typ_nm(value);
			return;
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			mfg_mng_typ(value);
			return;
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			mfg_mng_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ(value);
			return;
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ_nm(value);
			return;
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			quality_mng_typ(value);
			return;
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			quality_mng_typ_nm(value);
			return;
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			mfg_mng_typ(value);
			return;
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			mfg_mng_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

