package mcframe.serverMABG.MABGL0420;

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
 * ブロック"RptConf_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RptConf_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_RPT_CONF_R {




	protected static final ConstMetaList<RptConf_UpdChk01_DtlR> constMetas = new ConstMetaList<RptConf_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_RPT_CONF_R.constMetas,
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
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
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
				{$rpt_ptn_cd, "E"},	// rpt_ptn_cd
				{$rpt_row_cd, "E"},	// rpt_row_cd
				{$rpt_row_nm, "E"},	// rpt_row_nm
				{$rpt_seq, "E"}	// rpt_seq
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$rpt_tgt_typ, "MAC_RPT_TGT_TYP"},	// rpt_tgt_typ
				{$cost_io_typ, "MAC_COST_IO_TYP"},	// cost_io_typ
				{$asst_typ, "MAC_ASST_TYP"},	// asst_typ
				{$qty_unit_typ, "MAC_QTY_UNIT_TYP"},	// qty_unit_typ
				{$ac_slip_typ, "MAC_AC_SLIP_TYP"},	// ac_slip_typ
				{$expns_typ, "MAC_EXPNS_TYP"},	// expns_typ
				{$direct_typ, "MAC_DIRECT_TYP"},	// direct_typ
				{$var_typ, "MAC_VAR_TYP"}	// var_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$rpt_ptn_cd, "MA.MAUAL0010.RptPtn"},	// rpt_ptn_cd
				{$alc_ac_grp_cd1, "MA.MAUAL0010.AlcAcGrp1"},	// alc_ac_grp_cd1
				{$alc_ac_grp_cd2, "MA.MAUAL0010.AlcAcGrp2"},	// alc_ac_grp_cd2
				{$alc_ac_grp_cd3, "MA.MAUAL0010.AlcAcGrp3"},	// alc_ac_grp_cd3
				{$alc_ac_cd, "MA.MAUAL0010.AlcAc"},	// alc_ac_cd
				{$ac_rsn_cd, "MA.MAUAL0010.AcRsn"},	// ac_rsn_cd
				{$itm_jnl_cd, "MA.MAUAL0010.ItmJnl"},	// itm_jnl_cd
				{$itm_grp_cd1, "MA.MAUAL0010.ItmGrp1"},	// itm_grp_cd1
				{$itm_grp_cd2, "MA.MAUAL0010.ItmGrp2"},	// itm_grp_cd2
				{$itm_grp_cd3, "MA.MAUAL0010.ItmGrp3"},	// itm_grp_cd3
				{$itm_grp_cd4, "MA.MAUAL0010.ItmGrp4"},	// itm_grp_cd4
				{$itm_grp_cd5, "MA.MAUAL0010.ItmGrp5"},	// itm_grp_cd5
				{$itm_grp_cd6, "MA.MAUAL0010.ItmGrp6"},	// itm_grp_cd6
				{$itm_grp_cd7, "MA.MAUAL0010.ItmGrp7"},	// itm_grp_cd7
				{$itm_grp_cd8, "MA.MAUAL0010.ItmGrp8"},	// itm_grp_cd8
				{$itm_grp_cd9, "MA.MAUAL0010.ItmGrp9"},	// itm_grp_cd9
				{$itm_grp_cd10, "MA.MAUAL0010.ItmGrp10"},	// itm_grp_cd10
				{$expns_grp_cd, "MA.MAUAL0010.ExpnsGrp"},	// expns_grp_cd
				{$expns_cd, "MA.MAUAL0010.Expns"}	// expns_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$alc_ac_grp_cd1, "alc_ac_grp_nm1"},	// alc_ac_grp_cd1
				{$alc_ac_grp_cd2, "alc_ac_grp_nm2"},	// alc_ac_grp_cd2
				{$alc_ac_grp_cd3, "alc_ac_grp_nm3"},	// alc_ac_grp_cd3
				{$itm_grp_cd1, "itm_grp_nm1"},	// itm_grp_cd1
				{$itm_grp_cd2, "itm_grp_nm2"},	// itm_grp_cd2
				{$itm_grp_cd3, "itm_grp_nm3"},	// itm_grp_cd3
				{$itm_grp_cd4, "itm_grp_nm4"},	// itm_grp_cd4
				{$itm_grp_cd5, "itm_grp_nm5"},	// itm_grp_cd5
				{$itm_grp_cd6, "itm_grp_nm6"},	// itm_grp_cd6
				{$itm_grp_cd7, "itm_grp_nm7"},	// itm_grp_cd7
				{$itm_grp_cd8, "itm_grp_nm8"},	// itm_grp_cd8
				{$itm_grp_cd9, "itm_grp_nm9"},	// itm_grp_cd9
				{$itm_grp_cd10, "itm_grp_nm10"}	// itm_grp_cd10
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$alc_ac_grp_cd1, "alc_ac_grp_nm"},	// alc_ac_grp_cd1
				{$alc_ac_grp_cd2, "alc_ac_grp_nm"},	// alc_ac_grp_cd2
				{$alc_ac_grp_cd3, "alc_ac_grp_nm"},	// alc_ac_grp_cd3
				{$itm_grp_cd1, "itm_grp_nm"},	// itm_grp_cd1
				{$itm_grp_cd2, "itm_grp_nm"},	// itm_grp_cd2
				{$itm_grp_cd3, "itm_grp_nm"},	// itm_grp_cd3
				{$itm_grp_cd4, "itm_grp_nm"},	// itm_grp_cd4
				{$itm_grp_cd5, "itm_grp_nm"},	// itm_grp_cd5
				{$itm_grp_cd6, "itm_grp_nm"},	// itm_grp_cd6
				{$itm_grp_cd7, "itm_grp_nm"},	// itm_grp_cd7
				{$itm_grp_cd8, "itm_grp_nm"},	// itm_grp_cd8
				{$itm_grp_cd9, "itm_grp_nm"},	// itm_grp_cd9
				{$itm_grp_cd10, "itm_grp_nm"}	// itm_grp_cd10
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
	protected RptConf_UpdChk01_DtlR_MC_A(ConstMetaList<? extends RptConf_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RptConf_UpdChk01_DtlR clone() {
		return (RptConf_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RptConf_UpdChk01_DtlR createInstance() {
		return (RptConf_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RptConf_UpdChk01_DtlR getValues(String... names) {
		return (RptConf_UpdChk01_DtlR) super.getValues(names);
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

