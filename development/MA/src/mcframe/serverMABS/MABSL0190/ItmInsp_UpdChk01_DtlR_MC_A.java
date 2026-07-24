package mcframe.serverMABS.MABSL0190;

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
 * ブロック"ItmInsp_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ItmInsp_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_ITM_INSP_R {

	/**
	 * Application start date_[Before update] 適用開始日_[更新前].<p>
	 *
	 */
	public static final String $st_dt_key = "st_dt_key";


	public static final MCMeta st_dt_key_META = createCommonMeta($st_dt_key, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<ItmInsp_UpdChk01_DtlR> constMetas = new ConstMetaList<ItmInsp_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_ITM_INSP_R.constMetas,
		new MCMeta[]{
			st_dt_key_META,
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
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
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
				{$itm_cd, "E"},	// itm_cd
				{$st_dt, "E"},	// st_dt
				{$end_dt, "E"}	// end_dt
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$mfg_loc_cd, "E"},	// mfg_loc_cd
				{$sppl_cd, "E"},	// sppl_cd
				{$maker_cd, "E"},	// maker_cd
				{$from_site_cd, "E"},	// from_site_cd
				{$to_site_cd, "E"}	// to_site_cd
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$mfg_loc_cd, "MA.MAUAL0010.Loc"},	// mfg_loc_cd
				{$sppl_cd, "MA.MAUAL0010.Bp"},	// sppl_cd
				{$maker_cd, "MA.MAUAL0010.Bp"},	// maker_cd
				{$from_site_cd, "MA.MAUAL0010.Site"},	// from_site_cd
				{$to_site_cd, "MA.MAUAL0010.Site"},	// to_site_cd
				{$insp_ptn_cd, "MA.MAUAL0010.ItmInspPtn"}	// insp_ptn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "lmt_ctl_flg"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "lmt_ctl_flg"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$lmt_dt_frm_typ, "MAC_LMT_DT_FRM_TYP"},	// lmt_dt_frm_typ
				{$calc_pd_typ, "MAC_CALC_PD_TYP"},	// calc_pd_typ
				{$lot_insp_lmt_dt_frm_typ, "MAC_LMT_DT_FRM_TYP"},	// lot_insp_lmt_dt_frm_typ
				{$insp_inst_issue_typ, "MAC_INSP_INST_ISSUE_TYP"}	// insp_inst_issue_typ
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
				{$mfg_loc_cd, "E1"},	// mfg_loc_cd
				{$sppl_cd, "E1"},	// sppl_cd
				{$from_site_cd, "E1"}	// from_site_cd
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$vld_pd, "E1:S,0:"},	// vld_pd
				{$lmt_pd, "E1:L,E2:L,0:"},	// lmt_pd
				{$lot_insp_vld_pd, "E2:S,0:"}	// lot_insp_vld_pd
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$st_dt, "E1:BF"},	// st_dt
				{$end_dt, "E1:AF"}	// end_dt
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2;true;true"},	// itm_sub3
				{$mfg_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE;true"},	// mfg_loc_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL;true"},	// sppl_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER;true"},	// maker_cd
				{$from_site_cd, "true"},	// from_site_cd
				{$to_site_cd, "true"},	// to_site_cd
				{$insp_ptn_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3;st_dt"}	// insp_ptn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// itm_sub3
				{$mfg_loc_cd, "loc_is_srch_typ;mode_nullval_flg"},	// mfg_loc_cd
				{$sppl_cd, "bp_is_srch_typ;mode_nullval_flg"},	// sppl_cd
				{$maker_cd, "bp_is_srch_typ;mode_nullval_flg"},	// maker_cd
				{$from_site_cd, "mode_nullval_flg"},	// from_site_cd
				{$to_site_cd, "mode_nullval_flg"},	// to_site_cd
				{$insp_ptn_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3;dt"}	// insp_ptn_cd
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
	protected ItmInsp_UpdChk01_DtlR_MC_A(ConstMetaList<? extends ItmInsp_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmInsp_UpdChk01_DtlR clone() {
		return (ItmInsp_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmInsp_UpdChk01_DtlR createInstance() {
		return (ItmInsp_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmInsp_UpdChk01_DtlR getValues(String... names) {
		return (ItmInsp_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Application start date_[Before update] 適用開始日_[更新前].<p>
	 *
	 */
	public MCDate st_dt_key() {
		return getConstDate(offset + 0, $st_dt_key);
	}

	/**
	 * Application start date_[Before update] 適用開始日_[更新前].<p>
	 *
	 */
	public void st_dt_key(MCDate value) {
		setConstDate(offset + 0, $st_dt_key, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
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

