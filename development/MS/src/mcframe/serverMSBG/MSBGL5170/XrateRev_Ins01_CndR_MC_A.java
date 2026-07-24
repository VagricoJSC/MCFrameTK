package mcframe.serverMSBG.MSBGL5170;

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
 * ブロック"XrateRev_Ins01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XrateRev_Ins01_CndR_MC_A extends MCConstRow {

	/**
	 * Month 対象年月.<p>
	 *
	 */
	public static final String $tgt_ym = "tgt_ym";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";


	public static final MCMeta tgt_ym_META = createCommonMeta($tgt_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);

	protected static final ConstMetaList<XrateRev_Ins01_CndR> constMetas = new ConstMetaList<XrateRev_Ins01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			tgt_ym_META,
			xrate_cd_META
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
		null
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
	protected XrateRev_Ins01_CndR_MC_A(ConstMetaList<? extends XrateRev_Ins01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XrateRev_Ins01_CndR clone() {
		return (XrateRev_Ins01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XrateRev_Ins01_CndR createInstance() {
		return (XrateRev_Ins01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XrateRev_Ins01_CndR getValues(String... names) {
		return (XrateRev_Ins01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Month 対象年月.<p>
	 *
	 */
	public MCDate tgt_ym() {
		return getConstDate(offset + 0, $tgt_ym);
	}

	/**
	 * Month 対象年月.<p>
	 *
	 */
	public void tgt_ym(MCDate value) {
		setConstDate(offset + 0, $tgt_ym, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 1, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 1, $xrate_cd, value);
	}


	public String getString(String name) {
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($tgt_ym.equalsIgnoreCase(name)) {
			return tgt_ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($tgt_ym.equalsIgnoreCase(name)) {
			return tgt_ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($tgt_ym.equalsIgnoreCase(name)) {
			tgt_ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($tgt_ym.equalsIgnoreCase(name)) {
			tgt_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

