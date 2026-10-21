package mcframe.serverMSBB.MSBBLA0020;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Product item cd. 製品ＣＤ.<p>
	 *
	 */
	public static final String $prod_itm_cd = "prod_itm_cd";
	/**
	 * Product branch no 1 製品枝番１.<p>
	 *
	 */
	public static final String $prod_itm_sub1 = "prod_itm_sub1";
	/**
	 * Product branch no 2 製品枝番２.<p>
	 *
	 */
	public static final String $prod_itm_sub2 = "prod_itm_sub2";
	/**
	 * Product branch no 3 製品枝番３.<p>
	 *
	 */
	public static final String $prod_itm_sub3 = "prod_itm_sub3";
	/**
	 * Product name 製品名.<p>
	 *
	 */
	public static final String $prod_itm_nm = "prod_itm_nm";
	/**
	 * Diameter 口径.<p>
	 *
	 */
	public static final String $diameter = "diameter";
	/**
	 * Item cd. 構成品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Item branch no 1 構成品目枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Item branch no 2 構成品目枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Item branch no 3 構成品目枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Product name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";


	public static final MCMeta prod_itm_cd_META = createCommonMeta($prod_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta prod_itm_sub1_META = createCommonMeta($prod_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta prod_itm_sub2_META = createCommonMeta($prod_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta prod_itm_sub3_META = createCommonMeta($prod_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta prod_itm_nm_META = createCommonMeta($prod_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta diameter_META = createCommonMeta($diameter, mcframe.commonMA.meta.MA_META.DIAMETER);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			prod_itm_cd_META,
			prod_itm_sub1_META,
			prod_itm_sub2_META,
			prod_itm_sub3_META,
			prod_itm_nm_META,
			diameter_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Product item cd. 製品ＣＤ.<p>
	 *
	 */
	public String prod_itm_cd() {
		return getConstString(offset + 0, $prod_itm_cd);
	}

	/**
	 * Product item cd. 製品ＣＤ.<p>
	 *
	 */
	public void prod_itm_cd(String value) {
		setConstString(offset + 0, $prod_itm_cd, value);
	}


	/**
	 * Product branch no 1 製品枝番１.<p>
	 *
	 */
	public String prod_itm_sub1() {
		return getConstString(offset + 1, $prod_itm_sub1);
	}

	/**
	 * Product branch no 1 製品枝番１.<p>
	 *
	 */
	public void prod_itm_sub1(String value) {
		setConstString(offset + 1, $prod_itm_sub1, value);
	}


	/**
	 * Product branch no 2 製品枝番２.<p>
	 *
	 */
	public String prod_itm_sub2() {
		return getConstString(offset + 2, $prod_itm_sub2);
	}

	/**
	 * Product branch no 2 製品枝番２.<p>
	 *
	 */
	public void prod_itm_sub2(String value) {
		setConstString(offset + 2, $prod_itm_sub2, value);
	}


	/**
	 * Product branch no 3 製品枝番３.<p>
	 *
	 */
	public String prod_itm_sub3() {
		return getConstString(offset + 3, $prod_itm_sub3);
	}

	/**
	 * Product branch no 3 製品枝番３.<p>
	 *
	 */
	public void prod_itm_sub3(String value) {
		setConstString(offset + 3, $prod_itm_sub3, value);
	}


	/**
	 * Product name 製品名.<p>
	 *
	 */
	public String prod_itm_nm() {
		return getConstString(offset + 4, $prod_itm_nm);
	}

	/**
	 * Product name 製品名.<p>
	 *
	 */
	public void prod_itm_nm(String value) {
		setConstString(offset + 4, $prod_itm_nm, value);
	}


	/**
	 * Diameter 口径.<p>
	 *
	 */
	public String diameter() {
		return getConstString(offset + 5, $diameter);
	}

	/**
	 * Diameter 口径.<p>
	 *
	 */
	public void diameter(String value) {
		setConstString(offset + 5, $diameter, value);
	}


	/**
	 * Item cd. 構成品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 6, $itm_cd);
	}

	/**
	 * Item cd. 構成品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 6, $itm_cd, value);
	}


	/**
	 * Item branch no 1 構成品目枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 7, $itm_sub1);
	}

	/**
	 * Item branch no 1 構成品目枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 7, $itm_sub1, value);
	}


	/**
	 * Item branch no 2 構成品目枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 8, $itm_sub2);
	}

	/**
	 * Item branch no 2 構成品目枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 8, $itm_sub2, value);
	}


	/**
	 * Item branch no 3 構成品目枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 9, $itm_sub3);
	}

	/**
	 * Item branch no 3 構成品目枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 9, $itm_sub3, value);
	}


	/**
	 * Product name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 10, $itm_nm);
	}

	/**
	 * Product name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 10, $itm_nm, value);
	}


	public String getString(String name) {
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			return prod_itm_cd();
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			return prod_itm_sub1();
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			return prod_itm_sub2();
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			return prod_itm_sub3();
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			return prod_itm_nm();
		}
		if ($diameter.equalsIgnoreCase(name)) {
			return diameter();
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
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			return prod_itm_cd();
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			return prod_itm_sub1();
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			return prod_itm_sub2();
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			return prod_itm_sub3();
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			return prod_itm_nm();
		}
		if ($diameter.equalsIgnoreCase(name)) {
			return diameter();
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
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			prod_itm_cd(value);
			return;
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			prod_itm_sub1(value);
			return;
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			prod_itm_sub2(value);
			return;
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			prod_itm_sub3(value);
			return;
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			prod_itm_nm(value);
			return;
		}
		if ($diameter.equalsIgnoreCase(name)) {
			diameter(value);
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
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			prod_itm_cd(value);
			return;
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			prod_itm_sub1(value);
			return;
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			prod_itm_sub2(value);
			return;
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			prod_itm_sub3(value);
			return;
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			prod_itm_nm(value);
			return;
		}
		if ($diameter.equalsIgnoreCase(name)) {
			diameter(value);
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
		super.setStringNE(name, value);
	}



}

