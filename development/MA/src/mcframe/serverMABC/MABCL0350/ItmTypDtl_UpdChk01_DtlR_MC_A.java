package mcframe.serverMABC.MABCL0350;

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
 * ブロック"ItmTypDtl_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ItmTypDtl_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_ITM_TYP_D_R {




	protected static final ConstMetaList<ItmTypDtl_UpdChk01_DtlR> constMetas = new ConstMetaList<ItmTypDtl_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_ITM_TYP_D_R.constMetas,
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
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$itm_typ, "E"},	// itm_typ
				{$itm_typ_d_cd, "E"},	// itm_typ_d_cd
				{$itm_typ_d_nm, "E"}	// itm_typ_d_nm
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$def_comp_spec_typ, "MAC_COMP_SPEC_TYP"},	// def_comp_spec_typ
				{$def_insp_bind_typ, "MAC_INSP_BIND_TYP"},	// def_insp_bind_typ
				{$def_slo_proc_typ, "MAC_SLO_PROC_TYP"},	// def_slo_proc_typ
				{$def_ship_inst_typ, "MAC_SHIP_INST_TYP"},	// def_ship_inst_typ
				{$def_mfg_inst_unit_typ, "MAC_MFG_INST_UNIT_TYP"},	// def_mfg_inst_unit_typ
				{$def_mrp_proc_typ, "MAC_MRP_PROC_TYP"},	// def_mrp_proc_typ
				{$def_rqmt_typ, "MAC_RQMT_TYP"},	// def_rqmt_typ
				{$def_prod_pln_typ, "MAC_PROD_PLN_TYP"},	// def_prod_pln_typ
				{$def_lot_mng_typ, "MAC_LOT_MNG_TYP"},	// def_lot_mng_typ
				{$def_lot_no_typ, "MAC_LOT_NO_TYP"},	// def_lot_no_typ
				{$def_sublot_mng_typ, "MAC_SUBLOT_MNG_TYP"},	// def_sublot_mng_typ
				{$def_sublot_no_typ, "MAC_LOT_NO_TYP"},	// def_sublot_no_typ
				{$def_sno1_mng_typ, "MAC_SNO_MNG_TYP"},	// def_sno1_mng_typ
				{$def_sno1_num_typ, "MAC_SNO_NO_TYP"},	// def_sno1_num_typ
				{$def_sno2_mng_typ, "MAC_SNO_MNG_TYP"},	// def_sno2_mng_typ
				{$def_sno2_num_typ, "MAC_SNO_NO_TYP"},	// def_sno2_num_typ
				{$def_sno3_mng_typ, "MAC_SNO_MNG_TYP"},	// def_sno3_mng_typ
				{$def_sno3_num_typ, "MAC_SNO_NO_TYP"},	// def_sno3_num_typ
				{$def_sno4_mng_typ, "MAC_SNO_MNG_TYP"},	// def_sno4_mng_typ
				{$def_sno4_num_typ, "MAC_SNO_NO_TYP"},	// def_sno4_num_typ
				{$def_sno_typ1, "MAC_SNO_TYP"},	// def_sno_typ1
				{$def_sno_typ2, "MAC_SNO_TYP"},	// def_sno_typ2
				{$def_sno_typ3, "MAC_SNO_TYP"},	// def_sno_typ3
				{$def_sno_typ4, "MAC_SNO_TYP"},	// def_sno_typ4
				{$def_alloc_ctl_typ, "MAC_ALLOC_CTL_TYP"},	// def_alloc_ctl_typ
				{$def_inpt_ctl_typ, "MAC_INPT_CTL_TYP"},	// def_inpt_ctl_typ
				{$def_bkf_typ, "MAC_BKF_TYP"}	// def_bkf_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$def_itm_jnl_cd, "MA.MAUAL0010.ItmJnl"},	// def_itm_jnl_cd
				{$def_ac_itm_grp_cd, "MA.MAUAL0010.AcItmGrp"},	// def_ac_itm_grp_cd
				{$def_itm_spec_grp_cd, "MA.MAUAL0010.ItmSpecGrp"},	// def_itm_spec_grp_cd
				{$def_sls_upri_grp_cd, "MA.MAUAL0010.SlsUpriGrp"},	// def_sls_upri_grp_cd
				{$def_itm_ship_grp_cd, "MA.MAUAL0010.ItmShipGrp"},	// def_itm_ship_grp_cd
				{$def_ship_valid_grp_cd, "MA.MAUAL0010.ShipValid"},	// def_ship_valid_grp_cd
				{$def_ship_term_cd, "MA.MAUAL0010.ShipTerm"},	// def_ship_term_cd
				{$def_lot_no_ptn_cd, "MA.MAUAL0010.NumPtn"},	// def_lot_no_ptn_cd
				{$def_sublot_no_ptn_cd, "MA.MAUAL0010.NumPtn"},	// def_sublot_no_ptn_cd
				{$def_sno1_ptn_cd, "MA.MAUAL0010.NumPtn"},	// def_sno1_ptn_cd
				{$def_sno2_ptn_cd, "MA.MAUAL0010.NumPtn"},	// def_sno2_ptn_cd
				{$def_sno3_ptn_cd, "MA.MAUAL0010.NumPtn"},	// def_sno3_ptn_cd
				{$def_sno4_ptn_cd, "MA.MAUAL0010.NumPtn"},	// def_sno4_ptn_cd
				{$def_mrkt_judg_role_cd, "MA.MAUAL0010.AprvRole"},	// def_mrkt_judg_role_cd
				{$def_mrkt_judg_upd_role_cd, "MA.MAUAL0010.AprvRole"},	// def_mrkt_judg_upd_role_cd
				{$def_plnt_aprv_role_cd, "MA.MAUAL0010.AprvRole"},	// def_plnt_aprv_role_cd
				{$def_insp_aprv_role_cd, "MA.MAUAL0010.AprvRole"},	// def_insp_aprv_role_cd
				{$def_mfg_aprv_role_cd, "MA.MAUAL0010.AprvRole"},	// def_mfg_aprv_role_cd
				{$def_calc_ptn_cd, "MA.MAUAL0010.CalcPtn"}	// def_calc_ptn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$def_lot_no_ptn_cd, "MAC_NUM_BIZ_TYP.LOT"},	// def_lot_no_ptn_cd
				{$def_sublot_no_ptn_cd, "MAC_NUM_BIZ_TYP.SUBLOT"},	// def_sublot_no_ptn_cd
				{$def_sno1_ptn_cd, "MAC_NUM_BIZ_TYP.SNO"},	// def_sno1_ptn_cd
				{$def_sno2_ptn_cd, "MAC_NUM_BIZ_TYP.SNO"},	// def_sno2_ptn_cd
				{$def_sno3_ptn_cd, "MAC_NUM_BIZ_TYP.SNO"},	// def_sno3_ptn_cd
				{$def_sno4_ptn_cd, "MAC_NUM_BIZ_TYP.SNO"}	// def_sno4_ptn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$def_lot_no_ptn_cd, "num_biz_typ"},	// def_lot_no_ptn_cd
				{$def_sublot_no_ptn_cd, "num_biz_typ"},	// def_sublot_no_ptn_cd
				{$def_sno1_ptn_cd, "num_biz_typ"},	// def_sno1_ptn_cd
				{$def_sno2_ptn_cd, "num_biz_typ"},	// def_sno2_ptn_cd
				{$def_sno3_ptn_cd, "num_biz_typ"},	// def_sno3_ptn_cd
				{$def_sno4_ptn_cd, "num_biz_typ"}	// def_sno4_ptn_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$def_dmnd_date_div_mons, "0:"},	// def_dmnd_date_div_mons
				{$def_mrp_alloc_margin_days, "1:"},	// def_mrp_alloc_margin_days
				{$def_mrp_opn_xfr_days, "0:"}	// def_mrp_opn_xfr_days
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
	protected ItmTypDtl_UpdChk01_DtlR_MC_A(ConstMetaList<? extends ItmTypDtl_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmTypDtl_UpdChk01_DtlR clone() {
		return (ItmTypDtl_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmTypDtl_UpdChk01_DtlR createInstance() {
		return (ItmTypDtl_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmTypDtl_UpdChk01_DtlR getValues(String... names) {
		return (ItmTypDtl_UpdChk01_DtlR) super.getValues(names);
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

