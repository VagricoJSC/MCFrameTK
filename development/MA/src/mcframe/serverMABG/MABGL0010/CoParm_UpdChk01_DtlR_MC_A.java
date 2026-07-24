package mcframe.serverMABG.MABGL0010;

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
 * ブロック"CoParm_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CoParm_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_CO_PARM_R {




	protected static final ConstMetaList<CoParm_UpdChk01_DtlR> constMetas = new ConstMetaList<CoParm_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_CO_PARM_R.constMetas,
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
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$co_cd, "E"},	// co_cd
				{$std_rnd_typ, "E"},	// std_rnd_typ
				{$std_dec_place, "E"},	// std_dec_place
				{$amt_rnd_typ, "E"},	// amt_rnd_typ
				{$amt_dec_place, "E"},	// amt_dec_place
				{$ave_rnd_typ, "E"},	// ave_rnd_typ
				{$ave_dec_place, "E"},	// ave_dec_place
				{$adj_typ, "E"},	// adj_typ
				{$mrgn_expns_cd, "E"},	// mrgn_expns_cd
				{$std_disp_digit, "E"},	// std_disp_digit
				{$amt_disp_digit, "E"},	// amt_disp_digit
				{$unit_disp_digit, "E"}	// unit_disp_digit
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$std_rnd_typ, "MAC_RND_TYP"},	// std_rnd_typ
				{$amt_rnd_typ, "MAC_RND_TYP"},	// amt_rnd_typ
				{$ave_rnd_typ, "MAC_RND_TYP"},	// ave_rnd_typ
				{$adj_typ, "MAC_ADJ_TYP"},	// adj_typ
				{$diff_use_typ, "MAC_DIFF_USE_TYP"},	// diff_use_typ
				{$lot_use_typ, "MAC_PS_USE_TYP"},	// lot_use_typ
				{$sublot_use_typ, "MAC_PS_USE_TYP"},	// sublot_use_typ
				{$sno1_use_typ, "MAC_PS_USE_TYP"},	// sno1_use_typ
				{$sno2_use_typ, "MAC_PS_USE_TYP"},	// sno2_use_typ
				{$sno3_use_typ, "MAC_PS_USE_TYP"},	// sno3_use_typ
				{$sno4_use_typ, "MAC_PS_USE_TYP"}	// sno4_use_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$mrgn_expns_cd, "MA.MAUAL0010.Expns"},	// mrgn_expns_cd
				{$purc_expns_cd, "MA.MAUAL0010.Expns"},	// purc_expns_cd
				{$out_expns_cd, "MA.MAUAL0010.Expns"},	// out_expns_cd
				{$inpt_expns_cd, "MA.MAUAL0010.Expns"},	// inpt_expns_cd
				{$ss_expns_cd, "MA.MAUAL0010.Expns"},	// ss_expns_cd
				{$prov_expns_cd, "MA.MAUAL0010.Expns"},	// prov_expns_cd
				{$def_calc_ctg_cd, "MA.MAUAL0010.CalcCtg"},	// def_calc_ctg_cd
				{$fix_dpt_cd, "MA.MAUAL0010.CostDpt"},	// fix_dpt_cd
				{$tmp_dpt_cd, "MA.MAUAL0010.CostDpt"},	// tmp_dpt_cd
				{$act_trd_calc_ctg_cd, "MA.MAUAL0010.CalcCtg"}	// act_trd_calc_ctg_cd
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
				{$mrgn_expns_cd, "MAC_EXPNS_TYP.PROD"},	// mrgn_expns_cd
				{$purc_expns_cd, "MAC_EXPNS_TYP.PROD"},	// purc_expns_cd
				{$out_expns_cd, "MAC_EXPNS_TYP.PROD"},	// out_expns_cd
				{$inpt_expns_cd, "MAC_EXPNS_TYP.PROD"},	// inpt_expns_cd
				{$ss_expns_cd, "MAC_EXPNS_TYP.PROD"},	// ss_expns_cd
				{$prov_expns_cd, "MAC_EXPNS_TYP.SPPL"},	// prov_expns_cd
				{$fix_dpt_cd, "true"},	// fix_dpt_cd
				{$tmp_dpt_cd, "true"}	// tmp_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$mrgn_expns_cd, "expns_typ"},	// mrgn_expns_cd
				{$purc_expns_cd, "expns_typ"},	// purc_expns_cd
				{$out_expns_cd, "expns_typ"},	// out_expns_cd
				{$inpt_expns_cd, "expns_typ"},	// inpt_expns_cd
				{$ss_expns_cd, "expns_typ"},	// ss_expns_cd
				{$prov_expns_cd, "expns_typ"},	// prov_expns_cd
				{$fix_dpt_cd, "ignore_ym_flg"},	// fix_dpt_cd
				{$tmp_dpt_cd, "ignore_ym_flg"}	// tmp_dpt_cd
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$std_dec_place, "0:8"},	// std_dec_place
				{$amt_dec_place, "0:8"},	// amt_dec_place
				{$ave_dec_place, "0:8"},	// ave_dec_place
				{$pre_alc_max_lvl, "0:999"},	// pre_alc_max_lvl
				{$pre_alc_max_rec, "0:999999999"},	// pre_alc_max_rec
				{$std_disp_digit, "0:9"},	// std_disp_digit
				{$amt_disp_digit, "0:9"},	// amt_disp_digit
				{$unit_disp_digit, "0:9"},	// unit_disp_digit
				{$rate_disp_digit, "0:9"}	// rate_disp_digit
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
	protected CoParm_UpdChk01_DtlR_MC_A(ConstMetaList<? extends CoParm_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CoParm_UpdChk01_DtlR clone() {
		return (CoParm_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CoParm_UpdChk01_DtlR createInstance() {
		return (CoParm_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CoParm_UpdChk01_DtlR getValues(String... names) {
		return (CoParm_UpdChk01_DtlR) super.getValues(names);
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

