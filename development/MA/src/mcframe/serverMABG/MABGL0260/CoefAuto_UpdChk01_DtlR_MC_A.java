package mcframe.serverMABG.MABGL0260;

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
 * ブロック"CoefAuto_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CoefAuto_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_COEF_AUTO_R {

	/**
	 * Allocation coefficient structure type 配賦係数構成区分.<p>
	 *
	 */
	public static final String $coef_config_typ = "coef_config_typ";
	/**
	 * Quantity unit type 数量単位区分.<p>
	 *
	 */
	public static final String $qty_unit_typ = "qty_unit_typ";


	public static final MCMeta coef_config_typ_META = createCommonMeta($coef_config_typ, mcframe.commonMA.meta.MA_META.COEF_CONFIG_TYP);
	public static final MCMeta qty_unit_typ_META = createCommonMeta($qty_unit_typ, mcframe.commonMA.meta.MA_META.QTY_UNIT_TYP);

	protected static final ConstMetaList<CoefAuto_UpdChk01_DtlR> constMetas = new ConstMetaList<CoefAuto_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_COEF_AUTO_R.constMetas,
		new MCMeta[]{
			coef_config_typ_META,
			qty_unit_typ_META,
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
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$term, "E"},	// term
				{$alc_coef_cd, "E"},	// alc_coef_cd
				{$coef_val, "R"}	// coef_val
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$itm_grp_typ, "MAC_ITM_GRP_TYP"}	// itm_grp_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$term, "MA.MAUAL0010.Term"},	// term
				{$alc_coef_cd, "MA.MAUAL0010.AlcCoefAsNotConfig"},	// alc_coef_cd
				{$loc_cd, "MA.MAUAL0010.Loc"},	// loc_cd
				{$oper_cd, "MA.MAUAL0010.Oper"},	// oper_cd
				{$bp_cd, "MA.MAUAL0010.Bp"},	// bp_cd
				{$unit_cd, "MA.MAUAL0010.Unit"},	// unit_cd
				{$itm_jnl_cd, "MA.MAUAL0010.ItmJnl"},	// itm_jnl_cd
				{$itm_grp_cd, "MA.MAUAL0010.ItmGrp"}	// itm_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_grp_cd, "itm_grp_typ"}	// itm_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_grp_cd, "itm_grp_typ"}	// itm_grp_cd
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$coef_val, "0:"}	// coef_val
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
	protected CoefAuto_UpdChk01_DtlR_MC_A(ConstMetaList<? extends CoefAuto_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CoefAuto_UpdChk01_DtlR clone() {
		return (CoefAuto_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CoefAuto_UpdChk01_DtlR createInstance() {
		return (CoefAuto_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CoefAuto_UpdChk01_DtlR getValues(String... names) {
		return (CoefAuto_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Allocation coefficient structure type 配賦係数構成区分.<p>
	 *
	 */
	public String coef_config_typ() {
		return getConstString(offset + 0, $coef_config_typ);
	}

	/**
	 * Allocation coefficient structure type 配賦係数構成区分.<p>
	 *
	 */
	public void coef_config_typ(String value) {
		setConstString(offset + 0, $coef_config_typ, value);
	}


	/**
	 * Quantity unit type 数量単位区分.<p>
	 *
	 */
	public String qty_unit_typ() {
		return getConstString(offset + 1, $qty_unit_typ);
	}

	/**
	 * Quantity unit type 数量単位区分.<p>
	 *
	 */
	public void qty_unit_typ(String value) {
		setConstString(offset + 1, $qty_unit_typ, value);
	}


	public String getString(String name) {
		if ($coef_config_typ.equalsIgnoreCase(name)) {
			return coef_config_typ();
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			return qty_unit_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($coef_config_typ.equalsIgnoreCase(name)) {
			return coef_config_typ();
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			return qty_unit_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($coef_config_typ.equalsIgnoreCase(name)) {
			coef_config_typ(value);
			return;
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			qty_unit_typ(value);
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
	public void setBoolean(String name, boolean value) {
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($coef_config_typ.equalsIgnoreCase(name)) {
			coef_config_typ(value);
			return;
		}
		if ($qty_unit_typ.equalsIgnoreCase(name)) {
			qty_unit_typ(value);
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
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

