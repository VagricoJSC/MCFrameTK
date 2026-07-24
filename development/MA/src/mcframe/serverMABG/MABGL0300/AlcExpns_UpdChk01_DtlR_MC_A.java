package mcframe.serverMABG.MABGL0300;

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
 * ブロック"AlcExpns_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AlcExpns_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_ALC_EXPNS_R {

	/**
	 * Allocation target type 配賦対象区分.<p>
	 *
	 */
	public static final String $alc_tgt_typ = "alc_tgt_typ";


	public static final MCMeta alc_tgt_typ_META = createCommonMeta($alc_tgt_typ, mcframe.commonMA.meta.MA_META.ALC_TGT_TYP);

	protected static final ConstMetaList<AlcExpns_UpdChk01_DtlR> constMetas = new ConstMetaList<AlcExpns_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_ALC_EXPNS_R.constMetas,
		new MCMeta[]{
			alc_tgt_typ_META,
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
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$term, "E"},	// term
				{$alc_ptn_cd, "E"},	// alc_ptn_cd
				{$expns_cd, "E"}	// expns_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$inpt_itm_typ, "MAC_INPT_ITM_TYP"}	// inpt_itm_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$term, "MA.MAUAL0010.Term"},	// term
				{$alc_ptn_cd, "MA.MAUAL0010.AlcRuleAlcPtnAsExpnsCostOrProfit"},	// alc_ptn_cd
				{$expns_cd, "MA.MAUAL0010.Expns"},	// expns_cd
				{$ctg_cd, "MA.MAUAL0010.CostCtg"},	// ctg_cd
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$alc_ptn_cd, "term"},	// alc_ptn_cd
				{$expns_cd, "MAC_EXPNS_TYP.PROD"},	// expns_cd
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2;true;true;MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$alc_ptn_cd, "term"},	// alc_ptn_cd
				{$expns_cd, "expns_typ"},	// expns_cd
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off;itm_is_srch_typ"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
				{$ctg_cd, "E1"},	// ctg_cd
				{$itm_cd, "E1"}	// itm_cd
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
	protected AlcExpns_UpdChk01_DtlR_MC_A(ConstMetaList<? extends AlcExpns_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AlcExpns_UpdChk01_DtlR clone() {
		return (AlcExpns_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AlcExpns_UpdChk01_DtlR createInstance() {
		return (AlcExpns_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AlcExpns_UpdChk01_DtlR getValues(String... names) {
		return (AlcExpns_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Allocation target type 配賦対象区分.<p>
	 *
	 */
	public String alc_tgt_typ() {
		return getConstString(offset + 0, $alc_tgt_typ);
	}

	/**
	 * Allocation target type 配賦対象区分.<p>
	 *
	 */
	public void alc_tgt_typ(String value) {
		setConstString(offset + 0, $alc_tgt_typ, value);
	}


	public String getString(String name) {
		if ($alc_tgt_typ.equalsIgnoreCase(name)) {
			return alc_tgt_typ();
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
		if ($alc_tgt_typ.equalsIgnoreCase(name)) {
			return alc_tgt_typ();
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
		if ($alc_tgt_typ.equalsIgnoreCase(name)) {
			alc_tgt_typ(value);
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
		if ($alc_tgt_typ.equalsIgnoreCase(name)) {
			alc_tgt_typ(value);
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

