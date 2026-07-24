package mcframe.serverMABC.MABCL0600;

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
 * ブロック"Bp_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Bp_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_BP_R {




	protected static final ConstMetaList<Bp_UpdChk01_DtlR> constMetas = new ConstMetaList<Bp_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_BP_R.constMetas,
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
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$bp_cd, "E"},	// bp_cd
				{$bp_nm, "E"},	// bp_nm
				{$cntry_cd, "E"},	// cntry_cd
				{$cur_cd, "E"},	// cur_cd
				{$dlv_prnt_typ, "MAC_PRNT_TYP"}	// dlv_prnt_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$cntry_cd, "MA.MAUAL0010.Cntry"},	// cntry_cd
				{$area_cd, "MA.MAUAL0010.Area"},	// area_cd
				{$cur_cd, "MA.MAUAL0010.Cur"},	// cur_cd
				{$lg_grp_cd, "MA.MAUAL0010.LgGrpNotForLoc"},	// lg_grp_cd
				{$dlv_cal_cd, "MA.MAUAL0010.CalBase"},	// dlv_cal_cd
				{$bp_grp_cd1, "MA.MAUAL0010.BpGrp1"},	// bp_grp_cd1
				{$bp_grp_cd2, "MA.MAUAL0010.BpGrp2"},	// bp_grp_cd2
				{$bp_grp_cd3, "MA.MAUAL0010.BpGrp3"},	// bp_grp_cd3
				{$bp_grp_cd4, "MA.MAUAL0010.BpGrp4"},	// bp_grp_cd4
				{$bp_grp_cd5, "MA.MAUAL0010.BpGrp5"},	// bp_grp_cd5
				{$bp_grp_cd6, "MA.MAUAL0010.BpGrp6"},	// bp_grp_cd6
				{$bp_grp_cd7, "MA.MAUAL0010.BpGrp7"},	// bp_grp_cd7
				{$bp_grp_cd8, "MA.MAUAL0010.BpGrp8"},	// bp_grp_cd8
				{$bp_grp_cd9, "MA.MAUAL0010.BpGrp9"},	// bp_grp_cd9
				{$bp_grp_cd10, "MA.MAUAL0010.BpGrp10"}	// bp_grp_cd10
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
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
				{$zip_cd, "ZIP"},	// zip_cd
				{$tel, "TEL"},	// tel
				{$fax, "TEL"}	// fax
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
				{$tdlv_flg, "E1"},	// tdlv_flg
				{$tdlv_req_flg, "E1"}	// tdlv_req_flg
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
	protected Bp_UpdChk01_DtlR_MC_A(ConstMetaList<? extends Bp_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Bp_UpdChk01_DtlR clone() {
		return (Bp_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Bp_UpdChk01_DtlR createInstance() {
		return (Bp_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Bp_UpdChk01_DtlR getValues(String... names) {
		return (Bp_UpdChk01_DtlR) super.getValues(names);
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

