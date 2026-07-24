package mcframe.serverMABC.MABCL0090;

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
 * ブロック"UnitConv_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class UnitConv_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_UNIT_CONV_R {

	/**
	 * Conversion source unit number of decimal places 換算元単位小数部有効桁数.<p>
	 *
	 */
	public static final String $unit_dec_place = "unit_dec_place";
	/**
	 * Conversion destination unit number of decimal places 換算先単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";


	public static final MCMeta unit_dec_place_META = createCommonMeta($unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final ConstMetaList<UnitConv_UpdChk01_DtlR> constMetas = new ConstMetaList<UnitConv_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_UNIT_CONV_R.constMetas,
		new MCMeta[]{
			unit_dec_place_META,
			base_unit_dec_place_META,
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$unit_cd, "E"},	// unit_cd
				{$base_unit_cd, "E"},	// base_unit_cd
				{$qty, "E"},	// qty
				{$conv_qty, "E"}	// conv_qty
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$unit_cd, "MA.MAUAL0010.Unit"},	// unit_cd
				{$base_unit_cd, "MA.MAUAL0010.Unit"}	// base_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$unit_cd, "unit_dec_place"},	// unit_cd
				{$base_unit_cd, "base_unit_dec_place"}	// base_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$unit_cd, "dec_place"},	// unit_cd
				{$base_unit_cd, "dec_place"}	// base_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$unit_cd, "unit_cd"},	// unit_cd
				{$base_unit_cd, "base_unit_cd"}	// base_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$unit_cd, "unit_cd"},	// unit_cd
				{$base_unit_cd, "unit_cd"}	// base_unit_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$qty, "positive"},	// qty
				{$conv_qty, "positive"}	// conv_qty
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
	protected UnitConv_UpdChk01_DtlR_MC_A(ConstMetaList<? extends UnitConv_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public UnitConv_UpdChk01_DtlR clone() {
		return (UnitConv_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public UnitConv_UpdChk01_DtlR createInstance() {
		return (UnitConv_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public UnitConv_UpdChk01_DtlR getValues(String... names) {
		return (UnitConv_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Conversion source unit number of decimal places 換算元単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber unit_dec_place() {
		return getConstNumber(offset + 0, $unit_dec_place);
	}

	/**
	 * Conversion source unit number of decimal places 換算元単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(MCNumber value) {
		setConstNumber(offset + 0, $unit_dec_place, value);
	}

	/**
	 * Conversion source unit number of decimal places 換算元単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(int value) {
		setConstNumber(offset + 0, $unit_dec_place, value);
	}

	/**
	 * Conversion source unit number of decimal places 換算元単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(long value) {
		setConstNumber(offset + 0, $unit_dec_place, value);
	}

	/**
	 * Conversion source unit number of decimal places 換算元単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(float value) {
		setConstNumber(offset + 0, $unit_dec_place, value);
	}

	/**
	 * Conversion source unit number of decimal places 換算元単位小数部有効桁数.<p>
	 *
	 */
	public void unit_dec_place(double value) {
		setConstNumber(offset + 0, $unit_dec_place, value);
	}


	/**
	 * Conversion destination unit number of decimal places 換算先単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 1, $base_unit_dec_place);
	}

	/**
	 * Conversion destination unit number of decimal places 換算先単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 1, $base_unit_dec_place, value);
	}

	/**
	 * Conversion destination unit number of decimal places 換算先単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 1, $base_unit_dec_place, value);
	}

	/**
	 * Conversion destination unit number of decimal places 換算先単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 1, $base_unit_dec_place, value);
	}

	/**
	 * Conversion destination unit number of decimal places 換算先単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 1, $base_unit_dec_place, value);
	}

	/**
	 * Conversion destination unit number of decimal places 換算先単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 1, $base_unit_dec_place, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			return unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			return unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($unit_dec_place.equalsIgnoreCase(name)) {
			unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

