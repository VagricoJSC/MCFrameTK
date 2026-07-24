package mcframe.serverMSBC.MSBCL5040;

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
 * ブロック"ItmOrdLd_Srch01_SubRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ItmOrdLd_Srch01_SubRsltR_MC_A extends mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SumRsltR {

	/**
	 * Load breakdown cd. 負荷内訳ＣＤ.<p>
	 *
	 */
	public static final String $ld_sub_cd = "ld_sub_cd";
	/**
	 * Load breakdown name 負荷内訳名.<p>
	 *
	 */
	public static final String $ld_sub_nm = "ld_sub_nm";


	public static final MCMeta ld_sub_cd_META = createCommonMeta($ld_sub_cd, mcframe.commonMS.meta.MS_META.LD_SUB_CD);
	public static final MCMeta ld_sub_nm_META = createCommonMeta($ld_sub_nm, mcframe.commonMS.meta.MS_META.LD_SUB_NM);

	protected static final ConstMetaList<ItmOrdLd_Srch01_SubRsltR> constMetas = new ConstMetaList<ItmOrdLd_Srch01_SubRsltR>(
		mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SumRsltR.constMetas,
		new MCMeta[]{
			ld_sub_cd_META,
			ld_sub_nm_META,
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		mcframe.serverMSBC.MSBCL5040.ItmOrdLd_Srch01_SumRsltR.EXTMAP
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
	protected ItmOrdLd_Srch01_SubRsltR_MC_A(ConstMetaList<? extends ItmOrdLd_Srch01_SubRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOrdLd_Srch01_SubRsltR clone() {
		return (ItmOrdLd_Srch01_SubRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOrdLd_Srch01_SubRsltR createInstance() {
		return (ItmOrdLd_Srch01_SubRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOrdLd_Srch01_SubRsltR getValues(String... names) {
		return (ItmOrdLd_Srch01_SubRsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Load breakdown cd. 負荷内訳ＣＤ.<p>
	 *
	 */
	public String ld_sub_cd() {
		return getConstString(offset + 0, $ld_sub_cd);
	}

	/**
	 * Load breakdown cd. 負荷内訳ＣＤ.<p>
	 *
	 */
	public void ld_sub_cd(String value) {
		setConstString(offset + 0, $ld_sub_cd, value);
	}


	/**
	 * Load breakdown name 負荷内訳名.<p>
	 *
	 */
	public String ld_sub_nm() {
		return getConstString(offset + 1, $ld_sub_nm);
	}

	/**
	 * Load breakdown name 負荷内訳名.<p>
	 *
	 */
	public void ld_sub_nm(String value) {
		setConstString(offset + 1, $ld_sub_nm, value);
	}


	public String getString(String name) {
		if ($ld_sub_cd.equalsIgnoreCase(name)) {
			return ld_sub_cd();
		}
		if ($ld_sub_nm.equalsIgnoreCase(name)) {
			return ld_sub_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($ld_sub_cd.equalsIgnoreCase(name)) {
			return ld_sub_cd();
		}
		if ($ld_sub_nm.equalsIgnoreCase(name)) {
			return ld_sub_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($ld_sub_cd.equalsIgnoreCase(name)) {
			ld_sub_cd(value);
			return;
		}
		if ($ld_sub_nm.equalsIgnoreCase(name)) {
			ld_sub_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ld_sub_cd.equalsIgnoreCase(name)) {
			ld_sub_cd(value);
			return;
		}
		if ($ld_sub_nm.equalsIgnoreCase(name)) {
			ld_sub_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		super.setDateNE(name, value);
	}



}

