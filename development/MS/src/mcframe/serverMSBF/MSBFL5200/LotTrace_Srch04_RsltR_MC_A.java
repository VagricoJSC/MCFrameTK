package mcframe.serverMSBF.MSBFL5200;

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
 * ブロック"LotTrace_Srch04_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class LotTrace_Srch04_RsltR_MC_A extends mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR {

	/**
	 *  並び順.<p>
	 *
	 */
	public static final String $sort_no = "sort_no";


	public static final MCMeta sort_no_META = createCommonMeta($sort_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<LotTrace_Srch04_RsltR> constMetas = new ConstMetaList<LotTrace_Srch04_RsltR>(
		mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR.constMetas,
		new MCMeta[]{
			sort_no_META
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
		mcframe.serverMSBF.MSBFL5200.LotTrace_Srch02_RsltR.EXTMAP,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$stk_insp_typ, "MSC_STK_INSP_TYP"},	// stk_insp_typ
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$mfg_aprv_sts_typ, "MSC_MFG_APRV_STS_TYP"},	// mfg_aprv_sts_typ
				{$lot_mng_typ, "MAC_LOT_MNG_TYP"},	// lot_mng_typ
				{$sublot_mng_typ, "MAC_SUBLOT_MNG_TYP"}	// sublot_mng_typ
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
	protected LotTrace_Srch04_RsltR_MC_A(ConstMetaList<? extends LotTrace_Srch04_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotTrace_Srch04_RsltR clone() {
		return (LotTrace_Srch04_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotTrace_Srch04_RsltR createInstance() {
		return (LotTrace_Srch04_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotTrace_Srch04_RsltR getValues(String... names) {
		return (LotTrace_Srch04_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  並び順.<p>
	 *
	 */
	public MCNumber sort_no() {
		return getConstNumber(offset + 0, $sort_no);
	}

	/**
	 *  並び順.<p>
	 *
	 */
	public void sort_no(MCNumber value) {
		setConstNumber(offset + 0, $sort_no, value);
	}

	/**
	 *  並び順.<p>
	 *
	 */
	public void sort_no(int value) {
		setConstNumber(offset + 0, $sort_no, value);
	}

	/**
	 *  並び順.<p>
	 *
	 */
	public void sort_no(long value) {
		setConstNumber(offset + 0, $sort_no, value);
	}

	/**
	 *  並び順.<p>
	 *
	 */
	public void sort_no(float value) {
		setConstNumber(offset + 0, $sort_no, value);
	}

	/**
	 *  並び順.<p>
	 *
	 */
	public void sort_no(double value) {
		setConstNumber(offset + 0, $sort_no, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($sort_no.equalsIgnoreCase(name)) {
			return sort_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}
	public MCBinary getBinary(String name) {
		return super.getBinary(name);
	}

	public String getStringNE(String name) {
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($sort_no.equalsIgnoreCase(name)) {
			return sort_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		return super.getBooleanNE(name);
	}
	public MCBinary getBinaryNE(String name) {
		return super.getBinaryNE(name);
	}

	public void setString(String name, String value) {
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		super.setBoolean(name, value);
	}
	public void setBinary(String name, MCBinary value) {
		super.setBinary(name, value);
	}

	public void setStringNE(String name, String value) {
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}
	public void setBinaryNE(String name, MCBinary value) {
		super.setBinaryNE(name, value);
	}



}

