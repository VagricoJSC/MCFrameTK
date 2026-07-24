package mcframe.serverMABS.MABSL0290;

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
 * ブロック"ItmComp_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ItmComp_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_ITM_COMP_R {

	/**
	 * Main item unit cd. 主品目単位ＣＤ.<p>
	 *
	 */
	public static final String $core_itm_unit_cd = "core_itm_unit_cd";
	/**
	 * Main item unit number of decimal places 主品目単位小数部有効桁数.<p>
	 *
	 */
	public static final String $core_itm_dec_place = "core_itm_dec_place";
	/**
	 * Component item unit number of decimal places 構成品目単位小数部有効桁数.<p>
	 *
	 */
	public static final String $comp_itm_dec_place = "comp_itm_dec_place";


	public static final MCMeta core_itm_unit_cd_META = createCommonMeta($core_itm_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta core_itm_dec_place_META = createCommonMeta($core_itm_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta comp_itm_dec_place_META = createCommonMeta($comp_itm_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final ConstMetaList<ItmComp_UpdChk01_DtlR> constMetas = new ConstMetaList<ItmComp_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_ITM_COMP_R.constMetas,
		new MCMeta[]{
			core_itm_unit_cd_META,
			core_itm_dec_place_META,
			comp_itm_dec_place_META,
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
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$core_itm_cd, "E"},	// core_itm_cd
				{$core_itm_qty, "E"},	// core_itm_qty
				{$comp_itm_cd, "E"},	// comp_itm_cd
				{$comp_itm_unit_cd, "E"},	// comp_itm_unit_cd
				{$comp_itm_qty, "E"}	// comp_itm_qty
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$core_itm_sub1, "E"},	// core_itm_sub1
				{$core_itm_sub2, "E"},	// core_itm_sub2
				{$core_itm_sub3, "E"},	// core_itm_sub3
				{$comp_itm_sub1, "E"},	// comp_itm_sub1
				{$comp_itm_sub2, "E"},	// comp_itm_sub2
				{$comp_itm_sub3, "E"}	// comp_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$core_itm_sub3, "MA.MAUAL0010.ItmSub3"},	// core_itm_sub3
				{$core_itm_unit_cd, "MA.MAUAL0010.ItmUnit"},	// core_itm_unit_cd
				{$comp_itm_sub3, "MA.MAUAL0010.ItmSub3"},	// comp_itm_sub3
				{$comp_itm_unit_cd, "MA.MAUAL0010.ItmUnit"},	// comp_itm_unit_cd
				{$itm_comp_grp_cd, "MA.MAUAL0010.ItmCompGrp"}	// itm_comp_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$core_itm_sub3, "core_itm_unit_cd"},	// core_itm_sub3
				{$core_itm_unit_cd, "core_itm_dec_place"},	// core_itm_unit_cd
				{$comp_itm_unit_cd, "comp_itm_dec_place"}	// comp_itm_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$core_itm_sub3, "ship_unit_cd"},	// core_itm_sub3
				{$core_itm_unit_cd, "dec_place"},	// core_itm_unit_cd
				{$comp_itm_unit_cd, "dec_place"}	// comp_itm_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$core_itm_sub3, "MAC_ITM_IS_SRCH_TYP.COMP_CORE_ITM;core_itm_cd;core_itm_sub1;core_itm_sub2;true;true"},	// core_itm_sub3
				{$core_itm_unit_cd, "core_itm_cd;core_itm_sub1;core_itm_sub2;core_itm_sub3"},	// core_itm_unit_cd
				{$comp_itm_sub3, "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;comp_itm_cd;comp_itm_sub1;comp_itm_sub2;true;true"},	// comp_itm_sub3
				{$comp_itm_unit_cd, "comp_itm_cd;comp_itm_sub1;comp_itm_sub2;comp_itm_sub3"}	// comp_itm_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$core_itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// core_itm_sub3
				{$core_itm_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// core_itm_unit_cd
				{$comp_itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// comp_itm_sub3
				{$comp_itm_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// comp_itm_unit_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$core_itm_qty, "positive"},	// core_itm_qty
				{$comp_itm_qty, "positive"}	// comp_itm_qty
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
	protected ItmComp_UpdChk01_DtlR_MC_A(ConstMetaList<? extends ItmComp_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmComp_UpdChk01_DtlR clone() {
		return (ItmComp_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmComp_UpdChk01_DtlR createInstance() {
		return (ItmComp_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmComp_UpdChk01_DtlR getValues(String... names) {
		return (ItmComp_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Main item unit cd. 主品目単位ＣＤ.<p>
	 *
	 */
	public String core_itm_unit_cd() {
		return getConstString(offset + 0, $core_itm_unit_cd);
	}

	/**
	 * Main item unit cd. 主品目単位ＣＤ.<p>
	 *
	 */
	public void core_itm_unit_cd(String value) {
		setConstString(offset + 0, $core_itm_unit_cd, value);
	}


	/**
	 * Main item unit number of decimal places 主品目単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber core_itm_dec_place() {
		return getConstNumber(offset + 1, $core_itm_dec_place);
	}

	/**
	 * Main item unit number of decimal places 主品目単位小数部有効桁数.<p>
	 *
	 */
	public void core_itm_dec_place(MCNumber value) {
		setConstNumber(offset + 1, $core_itm_dec_place, value);
	}

	/**
	 * Main item unit number of decimal places 主品目単位小数部有効桁数.<p>
	 *
	 */
	public void core_itm_dec_place(int value) {
		setConstNumber(offset + 1, $core_itm_dec_place, value);
	}

	/**
	 * Main item unit number of decimal places 主品目単位小数部有効桁数.<p>
	 *
	 */
	public void core_itm_dec_place(long value) {
		setConstNumber(offset + 1, $core_itm_dec_place, value);
	}

	/**
	 * Main item unit number of decimal places 主品目単位小数部有効桁数.<p>
	 *
	 */
	public void core_itm_dec_place(float value) {
		setConstNumber(offset + 1, $core_itm_dec_place, value);
	}

	/**
	 * Main item unit number of decimal places 主品目単位小数部有効桁数.<p>
	 *
	 */
	public void core_itm_dec_place(double value) {
		setConstNumber(offset + 1, $core_itm_dec_place, value);
	}


	/**
	 * Component item unit number of decimal places 構成品目単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber comp_itm_dec_place() {
		return getConstNumber(offset + 2, $comp_itm_dec_place);
	}

	/**
	 * Component item unit number of decimal places 構成品目単位小数部有効桁数.<p>
	 *
	 */
	public void comp_itm_dec_place(MCNumber value) {
		setConstNumber(offset + 2, $comp_itm_dec_place, value);
	}

	/**
	 * Component item unit number of decimal places 構成品目単位小数部有効桁数.<p>
	 *
	 */
	public void comp_itm_dec_place(int value) {
		setConstNumber(offset + 2, $comp_itm_dec_place, value);
	}

	/**
	 * Component item unit number of decimal places 構成品目単位小数部有効桁数.<p>
	 *
	 */
	public void comp_itm_dec_place(long value) {
		setConstNumber(offset + 2, $comp_itm_dec_place, value);
	}

	/**
	 * Component item unit number of decimal places 構成品目単位小数部有効桁数.<p>
	 *
	 */
	public void comp_itm_dec_place(float value) {
		setConstNumber(offset + 2, $comp_itm_dec_place, value);
	}

	/**
	 * Component item unit number of decimal places 構成品目単位小数部有効桁数.<p>
	 *
	 */
	public void comp_itm_dec_place(double value) {
		setConstNumber(offset + 2, $comp_itm_dec_place, value);
	}


	public String getString(String name) {
		if ($core_itm_unit_cd.equalsIgnoreCase(name)) {
			return core_itm_unit_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			return core_itm_dec_place();
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			return comp_itm_dec_place();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($core_itm_unit_cd.equalsIgnoreCase(name)) {
			return core_itm_unit_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			return core_itm_dec_place();
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			return comp_itm_dec_place();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($core_itm_unit_cd.equalsIgnoreCase(name)) {
			core_itm_unit_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($core_itm_unit_cd.equalsIgnoreCase(name)) {
			core_itm_unit_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

