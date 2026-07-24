package mcframe.serverMABC.MABCL0020;

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
 * ブロック"Co_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Co_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_CO_R {




	protected static final ConstMetaList<Co_UpdChk01_DtlR> constMetas = new ConstMetaList<Co_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_CO_R.constMetas,
		new MCMeta[]{
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
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$cntry_cd, "E"},	// cntry_cd
				{$base_cur_cd, "E"},	// base_cur_cd
				{$ac_cl_day, "E"},	// ac_cl_day
				{$ac_cl_mon_base, "E"},	// ac_cl_mon_base
				{$std_cal_cd, "E"},	// std_cal_cd
				{$sls_xrate_cd, "E"},	// sls_xrate_cd
				{$purc_xrate_cd, "E"},	// purc_xrate_cd
				{$prov_xrate_cd, "E"},	// prov_xrate_cd
				{$sls_upri_req_typ, "E"},	// sls_upri_req_typ
				{$purc_upri_req_typ, "E"},	// purc_upri_req_typ
				{$outsrc_upri_typ, "E"},	// outsrc_upri_typ
				{$sls_basis_typ, "E"},	// sls_basis_typ
				{$bill_basis_typ, "E"},	// bill_basis_typ
				{$ship_schd_split_typ, "E"},	// ship_schd_split_typ
				{$xfr_stk_mng_typ, "E"},	// xfr_stk_mng_typ
				{$setoff_tax_rnd_typ, "E"},	// setoff_tax_rnd_typ
				{$xrate_rnd_typ, "E"},	// xrate_rnd_typ
				{$com_paid_tax_rnd_typ, "E"},	// com_paid_tax_rnd_typ
				{$wtax_rnd_typ, "E"},	// wtax_rnd_typ
				{$stk_amt_rnd_typ, "E"},	// stk_amt_rnd_typ
				{$stk_amt_dec_place, "E"},	// stk_amt_dec_place
				{$cst_prnt_typ, "E"},	// cst_prnt_typ
				{$acst_prnt_typ, "E"},	// acst_prnt_typ
				{$bcst_prnt_typ, "E"},	// bcst_prnt_typ
				{$rcst_prnt_typ, "E"},	// rcst_prnt_typ
				{$dlv_prnt_typ, "E"},	// dlv_prnt_typ
				{$sppl_prnt_typ, "E"},	// sppl_prnt_typ
				{$asppl_prnt_typ, "E"},	// asppl_prnt_typ
				{$bsppl_prnt_typ, "E"},	// bsppl_prnt_typ
				{$psppl_prnt_typ, "E"}	// psppl_prnt_typ
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$stk_cl_ba_typ, "MAC_BA_TYP"},	// stk_cl_ba_typ
				{$sls_cl_ba_typ, "MAC_BA_TYP"},	// sls_cl_ba_typ
				{$rcv_cl_ba_typ, "MAC_BA_TYP"},	// rcv_cl_ba_typ
				{$purc_cl_ba_typ, "MAC_BA_TYP"},	// purc_cl_ba_typ
				{$pay_cl_ba_typ, "MAC_BA_TYP"},	// pay_cl_ba_typ
				{$sls_upri_req_typ, "MAC_SLS_UPRI_REQ_TYP"},	// sls_upri_req_typ
				{$purc_upri_req_typ, "MAC_PURC_UPRI_REQ_TYP"},	// purc_upri_req_typ
				{$outsrc_upri_typ, "MAC_OUTSRC_UPRI_TYP"},	// outsrc_upri_typ
				{$sls_basis_typ, "MAC_SLS_BASIS_TYP"},	// sls_basis_typ
				{$bill_basis_typ, "MAC_BILL_BASIS_TYP"},	// bill_basis_typ
				{$ship_schd_split_typ, "MAC_SHIP_SCHD_SPLIT_TYP"},	// ship_schd_split_typ
				{$xfr_stk_mng_typ, "MAC_XFR_STK_MNG_TYP"},	// xfr_stk_mng_typ
				{$setoff_tax_rnd_typ, "MAC_RND_TYP"},	// setoff_tax_rnd_typ
				{$xrate_rnd_typ, "MAC_RND_TYP"},	// xrate_rnd_typ
				{$com_paid_tax_rnd_typ, "MAC_RND_TYP"},	// com_paid_tax_rnd_typ
				{$wtax_rnd_typ, "MAC_RND_TYP"},	// wtax_rnd_typ
				{$stk_amt_rnd_typ, "MAC_RND_TYP"},	// stk_amt_rnd_typ
				{$sls_bdj_rnd_typ, "MAC_BIG_NUM_RND_TYP"},	// sls_bdj_rnd_typ
				{$gm_std_upri_typ, "MAC_STD_UPRI_SEL_TYP"},	// gm_std_upri_typ
				{$stk_std_upri_typ, "MAC_STD_UPRI_SEL_TYP"},	// stk_std_upri_typ
				{$cst_prnt_typ, "MAC_PRNT_TYP"},	// cst_prnt_typ
				{$acst_prnt_typ, "MAC_PRNT_TYP"},	// acst_prnt_typ
				{$bcst_prnt_typ, "MAC_PRNT_TYP"},	// bcst_prnt_typ
				{$rcst_prnt_typ, "MAC_PRNT_TYP"},	// rcst_prnt_typ
				{$dlv_prnt_typ, "MAC_PRNT_TYP"},	// dlv_prnt_typ
				{$sppl_prnt_typ, "MAC_PRNT_TYP"},	// sppl_prnt_typ
				{$asppl_prnt_typ, "MAC_PRNT_TYP"},	// asppl_prnt_typ
				{$bsppl_prnt_typ, "MAC_PRNT_TYP"},	// bsppl_prnt_typ
				{$psppl_prnt_typ, "MAC_PRNT_TYP"}	// psppl_prnt_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$rpt_strg_ext_sys_cd, "MAC_EXT_SYS_TYP.DOC"}	// rpt_strg_ext_sys_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$rpt_strg_ext_sys_cd, "ext_sys_typ"}	// rpt_strg_ext_sys_cd
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$cntry_cd, "MA.MAUAL0010.Cntry"},	// cntry_cd
				{$area_cd, "MA.MAUAL0010.Area"},	// area_cd
				{$base_cur_cd, "MA.MAUAL0010.Cur"},	// base_cur_cd
				{$ptax_cur_cd, "MA.MAUAL0010.Cur"},	// ptax_cur_cd
				{$std_cal_cd, "MA.MAUAL0010.CalBase"},	// std_cal_cd
				{$bill_cl_cal_cd, "MA.MAUAL0010.CalBase"},	// bill_cl_cal_cd
				{$stk_cl_cal_cd, "MA.MAUAL0010.CalBase"},	// stk_cl_cal_cd
				{$sls_cl_cal_cd, "MA.MAUAL0010.CalBase"},	// sls_cl_cal_cd
				{$rcv_cl_cal_cd, "MA.MAUAL0010.CalBase"},	// rcv_cl_cal_cd
				{$purc_cl_cal_cd, "MA.MAUAL0010.CalBase"},	// purc_cl_cal_cd
				{$pay_cl_cal_cd, "MA.MAUAL0010.CalBase"},	// pay_cl_cal_cd
				{$pay_schd_cl_cal_cd, "MA.MAUAL0010.CalBase"},	// pay_schd_cl_cal_cd
				{$sls_xrate_cd, "MA.MAUAL0010.Xrate"},	// sls_xrate_cd
				{$purc_xrate_cd, "MA.MAUAL0010.Xrate"},	// purc_xrate_cd
				{$prov_xrate_cd, "MA.MAUAL0010.Xrate"},	// prov_xrate_cd
				{$bill_xrate_cd, "MA.MAUAL0010.Xrate"},	// bill_xrate_cd
				{$pay_xrate_cd, "MA.MAUAL0010.Xrate"},	// pay_xrate_cd
				{$po_print_cd, "MA.MAUAL0010.PoPrint"},	// po_print_cd
				{$rpt_strg_ext_sys_cd, "MA.MAUAL0010.ExtSys"}	// rpt_strg_ext_sys_cd
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
				{$zip_cd, "ZIP"},	// zip_cd
				{$tel, "TEL"},	// tel
				{$fax, "TEL"}	// fax
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$st_mon, "1:12"},	// st_mon
				{$dt_switch_time, "-24:24"},	// dt_switch_time
				{$ac_cl_mon_base, "-1:0"},	// ac_cl_mon_base
				{$stk_cl_delay_days, "0:"},	// stk_cl_delay_days
				{$sls_cl_delay_days, "0:"},	// sls_cl_delay_days
				{$rcv_cl_delay_days, "0:"},	// rcv_cl_delay_days
				{$purc_cl_delay_days, "0:"},	// purc_cl_delay_days
				{$pay_cl_delay_days, "0:"},	// pay_cl_delay_days
				{$stk_amt_dec_place, "0:8"},	// stk_amt_dec_place
				{$early_ship_dt_add_days, "0:"},	// early_ship_dt_add_days
				{$ac_slip_digit, "5:20"}	// ac_slip_digit
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
	protected Co_UpdChk01_DtlR_MC_A(ConstMetaList<? extends Co_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Co_UpdChk01_DtlR clone() {
		return (Co_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Co_UpdChk01_DtlR createInstance() {
		return (Co_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Co_UpdChk01_DtlR getValues(String... names) {
		return (Co_UpdChk01_DtlR) super.getValues(names);
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

