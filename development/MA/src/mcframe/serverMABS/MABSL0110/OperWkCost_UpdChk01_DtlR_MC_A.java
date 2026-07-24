package mcframe.serverMABS.MABSL0110;

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
 * ブロック"OperWkCost_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OperWkCost_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_OPER_WK_COST_R {

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public static final String $wk_cost_unit_dec_place = "wk_cost_unit_dec_place";
	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public static final String $st_dt_key = "st_dt_key";
	/**
	 * Item base unit number of decimal places 品目基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $itm_dec_place = "itm_dec_place";


	public static final MCMeta wk_cost_unit_dec_place_META = createCommonMeta($wk_cost_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta st_dt_key_META = createCommonMeta($st_dt_key, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_dec_place_META = createCommonMeta($itm_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final ConstMetaList<OperWkCost_UpdChk01_DtlR> constMetas = new ConstMetaList<OperWkCost_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_OPER_WK_COST_R.constMetas,
		new MCMeta[]{
			wk_cost_unit_dec_place_META,
			st_dt_key_META,
			itm_dec_place_META,
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
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
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$loc_cd, "E"},	// loc_cd
				{$oper_ptn, "E"},	// oper_ptn
				{$oper_cd, "E"}	// oper_cd
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$itm_cd, "E"},	// itm_cd
				{$loc_cd, "E"},	// loc_cd
				{$wk_cost_cd, "E"},	// wk_cost_cd
				{$st_dt, "E"},	// st_dt
				{$end_dt, "E"},	// end_dt
				{$fxd_wk_cost, "E"},	// fxd_wk_cost
				{$wk_cost, "E"},	// wk_cost
				{$base_qty, "E"},	// base_qty
				{$disp_seq, "E"}	// disp_seq
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$st_dt, "E1:BF"},	// st_dt
				{$end_dt, "E1:AF"}	// end_dt
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$base_qty, "positive"}	// base_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$oper_seq, "0:"},	// oper_seq
				{$fxd_wk_cost, "0:"},	// fxd_wk_cost
				{$wk_cost, "0:"},	// wk_cost
				{$disp_seq, "0:"}	// disp_seq
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$loc_cd, "MA.MAUAL0010.Loc"},	// loc_cd
				{$oper_cd, "MA.MAUAL0010.Oper"},	// oper_cd
				{$wk_cost_cd, "MA.MAUAL0010.WkCost"}	// wk_cost_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.ASSET1;itm_cd;itm_sub1;itm_sub2;true;true"},	// itm_sub3
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG_HOUSE;true"},	// loc_cd
				{$oper_cd, "true"}	// oper_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// itm_sub3
				{$loc_cd, "loc_is_srch_typ;mode_nullval_flg"},	// loc_cd
				{$oper_cd, "mode_nullval_flg"}	// oper_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_dec_place"},	// itm_sub3
				{$wk_cost_cd, "wk_cost_unit_dec_place"}	// wk_cost_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "dec_place"},	// itm_sub3
				{$wk_cost_cd, "dec_place"}	// wk_cost_cd
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
	protected OperWkCost_UpdChk01_DtlR_MC_A(ConstMetaList<? extends OperWkCost_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperWkCost_UpdChk01_DtlR clone() {
		return (OperWkCost_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperWkCost_UpdChk01_DtlR createInstance() {
		return (OperWkCost_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperWkCost_UpdChk01_DtlR getValues(String... names) {
		return (OperWkCost_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber wk_cost_unit_dec_place() {
		return getConstNumber(offset + 0, $wk_cost_unit_dec_place);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 0, $wk_cost_unit_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_unit_dec_place(int value) {
		setConstNumber(offset + 0, $wk_cost_unit_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_unit_dec_place(long value) {
		setConstNumber(offset + 0, $wk_cost_unit_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_unit_dec_place(float value) {
		setConstNumber(offset + 0, $wk_cost_unit_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_unit_dec_place(double value) {
		setConstNumber(offset + 0, $wk_cost_unit_dec_place, value);
	}


	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public MCDate st_dt_key() {
		return getConstDate(offset + 1, $st_dt_key);
	}

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public void st_dt_key(MCDate value) {
		setConstDate(offset + 1, $st_dt_key, value);
	}


	/**
	 * Item base unit number of decimal places 品目基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber itm_dec_place() {
		return getConstNumber(offset + 2, $itm_dec_place);
	}

	/**
	 * Item base unit number of decimal places 品目基準単位小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(MCNumber value) {
		setConstNumber(offset + 2, $itm_dec_place, value);
	}

	/**
	 * Item base unit number of decimal places 品目基準単位小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(int value) {
		setConstNumber(offset + 2, $itm_dec_place, value);
	}

	/**
	 * Item base unit number of decimal places 品目基準単位小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(long value) {
		setConstNumber(offset + 2, $itm_dec_place, value);
	}

	/**
	 * Item base unit number of decimal places 品目基準単位小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(float value) {
		setConstNumber(offset + 2, $itm_dec_place, value);
	}

	/**
	 * Item base unit number of decimal places 品目基準単位小数部有効桁数.<p>
	 *
	 */
	public void itm_dec_place(double value) {
		setConstNumber(offset + 2, $itm_dec_place, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($wk_cost_unit_dec_place.equalsIgnoreCase(name)) {
			return wk_cost_unit_dec_place();
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			return itm_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($wk_cost_unit_dec_place.equalsIgnoreCase(name)) {
			return wk_cost_unit_dec_place();
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			return itm_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($wk_cost_unit_dec_place.equalsIgnoreCase(name)) {
			wk_cost_unit_dec_place(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($wk_cost_unit_dec_place.equalsIgnoreCase(name)) {
			wk_cost_unit_dec_place(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($wk_cost_unit_dec_place.equalsIgnoreCase(name)) {
			wk_cost_unit_dec_place(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($wk_cost_unit_dec_place.equalsIgnoreCase(name)) {
			wk_cost_unit_dec_place(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($wk_cost_unit_dec_place.equalsIgnoreCase(name)) {
			wk_cost_unit_dec_place(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($wk_cost_unit_dec_place.equalsIgnoreCase(name)) {
			wk_cost_unit_dec_place(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($wk_cost_unit_dec_place.equalsIgnoreCase(name)) {
			wk_cost_unit_dec_place(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($wk_cost_unit_dec_place.equalsIgnoreCase(name)) {
			wk_cost_unit_dec_place(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($wk_cost_unit_dec_place.equalsIgnoreCase(name)) {
			wk_cost_unit_dec_place(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($wk_cost_unit_dec_place.equalsIgnoreCase(name)) {
			wk_cost_unit_dec_place(value);
			return;
		}
		if ($itm_dec_place.equalsIgnoreCase(name)) {
			itm_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

