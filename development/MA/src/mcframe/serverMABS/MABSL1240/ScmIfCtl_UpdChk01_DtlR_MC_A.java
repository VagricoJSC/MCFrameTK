package mcframe.serverMABS.MABSL1240;

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
 * ブロック"ScmIfCtl_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ScmIfCtl_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_SCM_IF_CTL_R {

	/**
	 * Distribution group cd. (Location) 物流グループＣＤ（場所）.<p>
	 *
	 */
	public static final String $loc_lg_grp_cd = "loc_lg_grp_cd";
	/**
	 * Distribution group cd. (GR location) 物流グループＣＤ（入庫場所）.<p>
	 *
	 */
	public static final String $gr_loc_lg_grp_cd = "gr_loc_lg_grp_cd";
	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public static final String $st_dt_key = "st_dt_key";


	public static final MCMeta loc_lg_grp_cd_META = createCommonMeta($loc_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gr_loc_lg_grp_cd_META = createCommonMeta($gr_loc_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta st_dt_key_META = createCommonMeta($st_dt_key, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<ScmIfCtl_UpdChk01_DtlR> constMetas = new ConstMetaList<ScmIfCtl_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_SCM_IF_CTL_R.constMetas,
		new MCMeta[]{
			loc_lg_grp_cd_META,
			gr_loc_lg_grp_cd_META,
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
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$if_proc_typ, "E"},	// if_proc_typ
				{$loc_cd, "E"},	// loc_cd
				{$st_dt, "E"},	// st_dt
				{$end_dt, "E"},	// end_dt
				{$ext_sys_cd, "E"}	// ext_sys_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$if_proc_typ, "MAC_IF_PROC_TYP"}	// if_proc_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$loc_cd, "MA.MAUAL0010.Loc"},	// loc_cd
				{$lg_grp_cd, "MA.MAUAL0010.LgGrpForLoc"},	// lg_grp_cd
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$oper_cd, "MA.MAUAL0010.Oper"},	// oper_cd
				{$wk_cost_cd, "MA.MAUAL0010.WkCost"},	// wk_cost_cd
				{$dlv_cd, "MA.MAUAL0010.Bp"},	// dlv_cd
				{$gr_loc_cd, "MA.MAUAL0010.Loc"},	// gr_loc_cd
				{$ext_sys_cd, "MA.MAUAL0010.ExtSysScm"}	// ext_sys_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2;true;true"},	// itm_sub3
				{$dlv_cd, "MAC_BP_IS_SRCH_TYP.DLV"}	// dlv_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// itm_sub3
				{$dlv_cd, "bp_is_srch_typ"}	// dlv_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$loc_cd, "loc_lg_grp_cd"},	// loc_cd
				{$gr_loc_cd, "gr_loc_lg_grp_cd"}	// gr_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$loc_cd, "lg_grp_cd"},	// loc_cd
				{$gr_loc_cd, "lg_grp_cd"}	// gr_loc_cd
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$st_dt, "E1:BF"},	// st_dt
				{$end_dt, "E1:AF"}	// end_dt
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
				{$loc_cd, "E1"},	// loc_cd
				{$lg_grp_cd, "E1"}	// lg_grp_cd
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
				{$itm_cd, "E1"},	// itm_cd
				{$oper_cd, "E1"},	// oper_cd
				{$dlv_cd, "E2"},	// dlv_cd
				{$gr_loc_cd, "E2"}	// gr_loc_cd
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
	protected ScmIfCtl_UpdChk01_DtlR_MC_A(ConstMetaList<? extends ScmIfCtl_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ScmIfCtl_UpdChk01_DtlR clone() {
		return (ScmIfCtl_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ScmIfCtl_UpdChk01_DtlR createInstance() {
		return (ScmIfCtl_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ScmIfCtl_UpdChk01_DtlR getValues(String... names) {
		return (ScmIfCtl_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Distribution group cd. (Location) 物流グループＣＤ（場所）.<p>
	 *
	 */
	public String loc_lg_grp_cd() {
		return getConstString(offset + 0, $loc_lg_grp_cd);
	}

	/**
	 * Distribution group cd. (Location) 物流グループＣＤ（場所）.<p>
	 *
	 */
	public void loc_lg_grp_cd(String value) {
		setConstString(offset + 0, $loc_lg_grp_cd, value);
	}


	/**
	 * Distribution group cd. (GR location) 物流グループＣＤ（入庫場所）.<p>
	 *
	 */
	public String gr_loc_lg_grp_cd() {
		return getConstString(offset + 1, $gr_loc_lg_grp_cd);
	}

	/**
	 * Distribution group cd. (GR location) 物流グループＣＤ（入庫場所）.<p>
	 *
	 */
	public void gr_loc_lg_grp_cd(String value) {
		setConstString(offset + 1, $gr_loc_lg_grp_cd, value);
	}


	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public MCDate st_dt_key() {
		return getConstDate(offset + 2, $st_dt_key);
	}

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public void st_dt_key(MCDate value) {
		setConstDate(offset + 2, $st_dt_key, value);
	}


	public String getString(String name) {
		if ($loc_lg_grp_cd.equalsIgnoreCase(name)) {
			return loc_lg_grp_cd();
		}
		if ($gr_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			return gr_loc_lg_grp_cd();
		}
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
		if ($loc_lg_grp_cd.equalsIgnoreCase(name)) {
			return loc_lg_grp_cd();
		}
		if ($gr_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			return gr_loc_lg_grp_cd();
		}
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
		if ($loc_lg_grp_cd.equalsIgnoreCase(name)) {
			loc_lg_grp_cd(value);
			return;
		}
		if ($gr_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			gr_loc_lg_grp_cd(value);
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
		if ($loc_lg_grp_cd.equalsIgnoreCase(name)) {
			loc_lg_grp_cd(value);
			return;
		}
		if ($gr_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			gr_loc_lg_grp_cd(value);
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

