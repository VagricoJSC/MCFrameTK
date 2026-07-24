package mcframe.serverMABG.MABGL0100;

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
 * ブロック"CalcPtn_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CalcPtn_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_CALC_PTN_R {




	protected static final ConstMetaList<CalcPtn_UpdChk01_DtlR> constMetas = new ConstMetaList<CalcPtn_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_CALC_PTN_R.constMetas,
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
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$calc_ptn_cd, "E"},	// calc_ptn_cd
				{$calc_ptn_nm, "E"},	// calc_ptn_nm
				{$mfg_purc_typ, "E"}	// mfg_purc_typ
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$mfg_purc_typ, "MAC_MFG_PURC_TYP"},	// mfg_purc_typ
				{$eval_typ, "MAC_EVAL_TYP"},	// eval_typ
				{$dpt_typ, "MAC_UNIT_CALC_TYP"},	// dpt_typ
				{$lot_typ, "MAC_UNIT_CALC_TYP"},	// lot_typ
				{$sublot_typ, "MAC_UNIT_CALC_TYP"},	// sublot_typ
				{$sno1_typ, "MAC_UNIT_CALC_TYP"},	// sno1_typ
				{$sno2_typ, "MAC_UNIT_CALC_TYP"},	// sno2_typ
				{$sno3_typ, "MAC_UNIT_CALC_TYP"},	// sno3_typ
				{$sno4_typ, "MAC_UNIT_CALC_TYP"},	// sno4_typ
				{$lot_act_typ, "MAC_ACT_SET_TYP"},	// lot_act_typ
				{$sublot_act_typ, "MAC_ACT_SET_TYP"},	// sublot_act_typ
				{$sno1_act_typ, "MAC_ACT_SET_TYP"},	// sno1_act_typ
				{$sno2_act_typ, "MAC_ACT_SET_TYP"},	// sno2_act_typ
				{$sno3_act_typ, "MAC_ACT_SET_TYP"},	// sno3_act_typ
				{$sno4_act_typ, "MAC_ACT_SET_TYP"},	// sno4_act_typ
				{$itm_mfg_inst_no_set_typ, "MAC_ITM_MFG_INST_NO_SET_TYP"},	// itm_mfg_inst_no_set_typ
				{$mfg_act_no_set_typ, "MAC_MFG_ACT_NO_SET_TYP"},	// mfg_act_no_set_typ
				{$oper_act_no_set_typ, "MAC_OPER_ACT_NO_SET_TYP"},	// oper_act_no_set_typ
				{$lot_exp_typ, "MAC_EXP_SET_TYP"},	// lot_exp_typ
				{$sublot_exp_typ, "MAC_EXP_SET_TYP"},	// sublot_exp_typ
				{$sno1_exp_typ, "MAC_EXP_SET_TYP"},	// sno1_exp_typ
				{$sno2_exp_typ, "MAC_EXP_SET_TYP"},	// sno2_exp_typ
				{$sno3_exp_typ, "MAC_EXP_SET_TYP"},	// sno3_exp_typ
				{$sno4_exp_typ, "MAC_EXP_SET_TYP"},	// sno4_exp_typ
				{$dpt_loss_eval_typ, "MAC_LOSS_EVAL_TYP"},	// dpt_loss_eval_typ
				{$lot_loss_eval_typ, "MAC_LOSS_EVAL_TYP"},	// lot_loss_eval_typ
				{$sublot_loss_eval_typ, "MAC_LOSS_EVAL_TYP"},	// sublot_loss_eval_typ
				{$sno1_loss_eval_typ, "MAC_LOSS_EVAL_TYP"},	// sno1_loss_eval_typ
				{$sno2_loss_eval_typ, "MAC_LOSS_EVAL_TYP"},	// sno2_loss_eval_typ
				{$sno3_loss_eval_typ, "MAC_LOSS_EVAL_TYP"},	// sno3_loss_eval_typ
				{$sno4_loss_eval_typ, "MAC_LOSS_EVAL_TYP"},	// sno4_loss_eval_typ
				{$asst_loss_eval_typ, "MAC_LOSS_EVAL_TYP"},	// asst_loss_eval_typ
				{$std_rnd_typ, "MAC_RND_TYP"},	// std_rnd_typ
				{$ave_rnd_typ, "MAC_RND_TYP"},	// ave_rnd_typ
				{$adj_typ, "MAC_ADJ_TYP"},	// adj_typ
				{$wip_typ, "MAC_WIP_TYP"},	// wip_typ
				{$bd_agg_typ, "MAC_BD_AGG_TYP"},	// bd_agg_typ
				{$exp_alloc_typ, "MAC_EXP_ALLOC_TYP"}	// exp_alloc_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$mrgn_expns_cd, "MA.MAUAL0010.Expns"},	// mrgn_expns_cd
				{$purc_expns_cd, "MA.MAUAL0010.Expns"},	// purc_expns_cd
				{$out_expns_cd, "MA.MAUAL0010.Expns"},	// out_expns_cd
				{$inpt_expns_cd, "MA.MAUAL0010.Expns"},	// inpt_expns_cd
				{$ss_expns_cd, "MA.MAUAL0010.Expns"},	// ss_expns_cd
				{$prov_expns_cd, "MA.MAUAL0010.Expns"}	// prov_expns_cd
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$std_dec_place, "0:8"},	// std_dec_place
				{$ave_dec_place, "0:8"}	// ave_dec_place
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$mrgn_expns_cd, "MAC_EXPNS_TYP.PROD"},	// mrgn_expns_cd
				{$purc_expns_cd, "MAC_EXPNS_TYP.PROD"},	// purc_expns_cd
				{$out_expns_cd, "MAC_EXPNS_TYP.PROD"},	// out_expns_cd
				{$inpt_expns_cd, "MAC_EXPNS_TYP.PROD"},	// inpt_expns_cd
				{$ss_expns_cd, "MAC_EXPNS_TYP.PROD"},	// ss_expns_cd
				{$prov_expns_cd, "MAC_EXPNS_TYP.SPPL"}	// prov_expns_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$mrgn_expns_cd, "expns_typ"},	// mrgn_expns_cd
				{$purc_expns_cd, "expns_typ"},	// purc_expns_cd
				{$out_expns_cd, "expns_typ"},	// out_expns_cd
				{$inpt_expns_cd, "expns_typ"},	// inpt_expns_cd
				{$ss_expns_cd, "expns_typ"},	// ss_expns_cd
				{$prov_expns_cd, "expns_typ"}	// prov_expns_cd
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
	protected CalcPtn_UpdChk01_DtlR_MC_A(ConstMetaList<? extends CalcPtn_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CalcPtn_UpdChk01_DtlR clone() {
		return (CalcPtn_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CalcPtn_UpdChk01_DtlR createInstance() {
		return (CalcPtn_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CalcPtn_UpdChk01_DtlR getValues(String... names) {
		return (CalcPtn_UpdChk01_DtlR) super.getValues(names);
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

