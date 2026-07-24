package mcframe.serverMABG.MABGL0500;

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
 * ブロック"PreAlcPtn_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PreAlcPtn_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_PRE_ALC_PTN_R {




	protected static final ConstMetaList<PreAlcPtn_UpdChk01_DtlR> constMetas = new ConstMetaList<PreAlcPtn_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_PRE_ALC_PTN_R.constMetas,
		new MCMeta[]{
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$pre_alc_ptn_cd, "E"},	// pre_alc_ptn_cd
				{$pre_alc_ptn_nm, "E"}	// pre_alc_ptn_nm
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$dpt_alc_typ, "MAC_PRE_ALC_TYP"},	// dpt_alc_typ
				{$loc_alc_typ, "MAC_PRE_ALC_TYP"},	// loc_alc_typ
				{$oper_alc_typ, "MAC_PRE_ALC_TYP"},	// oper_alc_typ
				{$bp_alc_typ, "MAC_PRE_ALC_TYP"},	// bp_alc_typ
				{$ctg_alc_typ, "MAC_PRE_ALC_TYP"},	// ctg_alc_typ
				{$itm_alc_typ, "MAC_PRE_ALC_TYP"},	// itm_alc_typ
				{$lot_alc_typ, "MAC_PRE_ALC_TYP"},	// lot_alc_typ
				{$sublot_alc_typ, "MAC_PRE_ALC_TYP"},	// sublot_alc_typ
				{$sno1_alc_typ, "MAC_PRE_ALC_TYP"},	// sno1_alc_typ
				{$sno2_alc_typ, "MAC_PRE_ALC_TYP"},	// sno2_alc_typ
				{$sno3_alc_typ, "MAC_PRE_ALC_TYP"},	// sno3_alc_typ
				{$sno4_alc_typ, "MAC_PRE_ALC_TYP"},	// sno4_alc_typ
				{$inst_alc_typ, "MAC_PRE_ALC_TYP"},	// inst_alc_typ
				{$iv_alc_typ, "MAC_PRE_ALC_TYP"},	// iv_alc_typ
				{$po_alc_typ, "MAC_PRE_ALC_TYP"},	// po_alc_typ
				{$slo_alc_typ, "MAC_PRE_ALC_TYP"},	// slo_alc_typ
				{$alc_ac_alc_typ, "MAC_PRE_ALC_TYP"},	// alc_ac_alc_typ
				{$wg_alc_typ, "MAC_PRE_ALC_TYP"}	// wg_alc_typ
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
	protected PreAlcPtn_UpdChk01_DtlR_MC_A(ConstMetaList<? extends PreAlcPtn_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PreAlcPtn_UpdChk01_DtlR clone() {
		return (PreAlcPtn_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PreAlcPtn_UpdChk01_DtlR createInstance() {
		return (PreAlcPtn_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PreAlcPtn_UpdChk01_DtlR getValues(String... names) {
		return (PreAlcPtn_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
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
	public void setBoolean(String name, boolean value) {
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
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

