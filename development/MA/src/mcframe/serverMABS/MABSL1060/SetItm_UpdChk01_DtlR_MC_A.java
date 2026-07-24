package mcframe.serverMABS.MABSL1060;

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
 * ブロック"SetItm_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SetItm_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_SET_ITM_R {

	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public static final String $main_itm_dec_place = "main_itm_dec_place";
	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public static final String $set_itm_dec_place = "set_itm_dec_place";


	public static final MCMeta main_itm_dec_place_META = createCommonMeta($main_itm_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta set_itm_dec_place_META = createCommonMeta($set_itm_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final ConstMetaList<SetItm_UpdChk01_DtlR> constMetas = new ConstMetaList<SetItm_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_SET_ITM_R.constMetas,
		new MCMeta[]{
			main_itm_dec_place_META,
			set_itm_dec_place_META,
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
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$set_grp_cd, "E"},	// set_grp_cd
				{$main_itm_cd, "E"},	// main_itm_cd
				{$set_itm_cd, "E"},	// set_itm_cd
				{$main_itm_unit_cd, "E"},	// main_itm_unit_cd
				{$main_itm_qty, "E"},	// main_itm_qty
				{$set_itm_unit_cd, "E"},	// set_itm_unit_cd
				{$set_itm_qty, "E"}	// set_itm_qty
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$main_itm_sub1, "E"},	// main_itm_sub1
				{$main_itm_sub2, "E"},	// main_itm_sub2
				{$main_itm_sub3, "E"},	// main_itm_sub3
				{$set_itm_sub1, "E"},	// set_itm_sub1
				{$set_itm_sub2, "E"},	// set_itm_sub2
				{$set_itm_sub3, "E"}	// set_itm_sub3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$set_grp_cd, "MA.MAUAL0010.SetGrp"},	// set_grp_cd
				{$main_itm_sub3, "MA.MAUAL0010.ItmSub3"},	// main_itm_sub3
				{$set_itm_sub3, "MA.MAUAL0010.ItmSub3"},	// set_itm_sub3
				{$main_itm_unit_cd, "MA.MAUAL0010.ItmUnit"},	// main_itm_unit_cd
				{$set_itm_unit_cd, "MA.MAUAL0010.ItmUnit"}	// set_itm_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$main_itm_sub3, "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;main_itm_cd;main_itm_sub1;main_itm_sub2;true;true"},	// main_itm_sub3
				{$set_itm_sub3, "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;set_itm_cd;set_itm_sub1;set_itm_sub2;true;true"},	// set_itm_sub3
				{$main_itm_unit_cd, "main_itm_cd;main_itm_sub1;main_itm_sub2;main_itm_sub3"},	// main_itm_unit_cd
				{$set_itm_unit_cd, "set_itm_cd;set_itm_sub1;set_itm_sub2;set_itm_sub3"}	// set_itm_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$main_itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// main_itm_sub3
				{$set_itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// set_itm_sub3
				{$main_itm_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// main_itm_unit_cd
				{$set_itm_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// set_itm_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$main_itm_sub3, "main_itm_dec_place"},	// main_itm_sub3
				{$set_itm_sub3, "set_itm_dec_place"}	// set_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$main_itm_sub3, "dec_place"},	// main_itm_sub3
				{$set_itm_sub3, "dec_place"}	// set_itm_sub3
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
	protected SetItm_UpdChk01_DtlR_MC_A(ConstMetaList<? extends SetItm_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SetItm_UpdChk01_DtlR clone() {
		return (SetItm_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SetItm_UpdChk01_DtlR createInstance() {
		return (SetItm_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SetItm_UpdChk01_DtlR getValues(String... names) {
		return (SetItm_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public MCNumber main_itm_dec_place() {
		return getConstNumber(offset + 0, $main_itm_dec_place);
	}

	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public void main_itm_dec_place(MCNumber value) {
		setConstNumber(offset + 0, $main_itm_dec_place, value);
	}

	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public void main_itm_dec_place(int value) {
		setConstNumber(offset + 0, $main_itm_dec_place, value);
	}

	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public void main_itm_dec_place(long value) {
		setConstNumber(offset + 0, $main_itm_dec_place, value);
	}

	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public void main_itm_dec_place(float value) {
		setConstNumber(offset + 0, $main_itm_dec_place, value);
	}

	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public void main_itm_dec_place(double value) {
		setConstNumber(offset + 0, $main_itm_dec_place, value);
	}


	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public MCNumber set_itm_dec_place() {
		return getConstNumber(offset + 1, $set_itm_dec_place);
	}

	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public void set_itm_dec_place(MCNumber value) {
		setConstNumber(offset + 1, $set_itm_dec_place, value);
	}

	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public void set_itm_dec_place(int value) {
		setConstNumber(offset + 1, $set_itm_dec_place, value);
	}

	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public void set_itm_dec_place(long value) {
		setConstNumber(offset + 1, $set_itm_dec_place, value);
	}

	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public void set_itm_dec_place(float value) {
		setConstNumber(offset + 1, $set_itm_dec_place, value);
	}

	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public void set_itm_dec_place(double value) {
		setConstNumber(offset + 1, $set_itm_dec_place, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			return main_itm_dec_place();
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			return set_itm_dec_place();
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
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			return main_itm_dec_place();
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			return set_itm_dec_place();
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
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
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
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

