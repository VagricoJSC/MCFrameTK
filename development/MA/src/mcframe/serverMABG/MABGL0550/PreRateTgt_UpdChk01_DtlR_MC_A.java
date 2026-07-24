package mcframe.serverMABG.MABGL0550;

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
 * ブロック"PreRateTgt_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PreRateTgt_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_PRE_RATE_TGT_R {

	/**
	 * Calculation monthly ratio 計算月次比率.<p>
	 *
	 */
	public static final String $pln_mly_flg = "pln_mly_flg";
	/**
	 * Monthly ratio (Result) 実績月次比率.<p>
	 *
	 */
	public static final String $act_mly_flg = "act_mly_flg";


	public static final MCMeta pln_mly_flg_META = createCommonMeta($pln_mly_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_mly_flg_META = createCommonMeta($act_mly_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<PreRateTgt_UpdChk01_DtlR> constMetas = new ConstMetaList<PreRateTgt_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_PRE_RATE_TGT_R.constMetas,
		new MCMeta[]{
			pln_mly_flg_META,
			act_mly_flg_META,
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
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$calc_ctg_cd, "E"},	// calc_ctg_cd
				{$wg_cd, "E"},	// wg_cd
				{$term, "E"},	// term
				{$pre_alc_rate_cd, "E"},	// pre_alc_rate_cd
				{$sa_typ, "E"},	// sa_typ
				{$data_calc_ctg_cd, "E"},	// data_calc_ctg_cd
				{$data_wg_cd, "E"}	// data_wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$calc_ctg_cd, "MA.MAUAL0010.CalcCtg"},	// calc_ctg_cd
				{$wg_cd, "MA.MAUAL0010.CostWg"},	// wg_cd
				{$term, "MA.MAUAL0010.Term"},	// term
				{$pre_alc_rate_cd, "MA.MAUAL0010.PreAlcRateInPreAlcCtg"},	// pre_alc_rate_cd
				{$data_calc_ctg_cd, "MA.MAUAL0010.CalcCtg"},	// data_calc_ctg_cd
				{$data_wg_cd, "MA.MAUAL0010.CostWg"}	// data_wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$pre_alc_rate_cd, "calc_ctg_cd;term;wg_cd;pln_mly_flg;act_mly_flg"}	// pre_alc_rate_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$pre_alc_rate_cd, "calc_ctg_cd;term;wg_cd;pln_mly_flg_str;act_mly_flg_str"}	// pre_alc_rate_cd
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$sa_typ, "MAC_SA_TYP"}	// sa_typ
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
	protected PreRateTgt_UpdChk01_DtlR_MC_A(ConstMetaList<? extends PreRateTgt_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PreRateTgt_UpdChk01_DtlR clone() {
		return (PreRateTgt_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PreRateTgt_UpdChk01_DtlR createInstance() {
		return (PreRateTgt_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PreRateTgt_UpdChk01_DtlR getValues(String... names) {
		return (PreRateTgt_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Calculation monthly ratio 計算月次比率.<p>
	 *
	 */
	public boolean pln_mly_flg() {
		return getConstBoolean(offset + 0, $pln_mly_flg);
	}

	/**
	 * Calculation monthly ratio 計算月次比率.<p>
	 *
	 */
	public void pln_mly_flg(boolean value) {
		setConstBoolean(offset + 0, $pln_mly_flg, value);
	}


	/**
	 * Monthly ratio (Result) 実績月次比率.<p>
	 *
	 */
	public boolean act_mly_flg() {
		return getConstBoolean(offset + 1, $act_mly_flg);
	}

	/**
	 * Monthly ratio (Result) 実績月次比率.<p>
	 *
	 */
	public void act_mly_flg(boolean value) {
		setConstBoolean(offset + 1, $act_mly_flg, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($pln_mly_flg.equalsIgnoreCase(name)) {
			return pln_mly_flg();
		}
		if ($act_mly_flg.equalsIgnoreCase(name)) {
			return act_mly_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($pln_mly_flg.equalsIgnoreCase(name)) {
			return pln_mly_flg();
		}
		if ($act_mly_flg.equalsIgnoreCase(name)) {
			return act_mly_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($pln_mly_flg.equalsIgnoreCase(name)) {
			pln_mly_flg(value);
			return;
		}
		if ($act_mly_flg.equalsIgnoreCase(name)) {
			act_mly_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($pln_mly_flg.equalsIgnoreCase(name)) {
			pln_mly_flg(value);
			return;
		}
		if ($act_mly_flg.equalsIgnoreCase(name)) {
			act_mly_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

