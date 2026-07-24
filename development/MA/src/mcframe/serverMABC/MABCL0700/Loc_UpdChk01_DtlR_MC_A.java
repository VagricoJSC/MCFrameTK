package mcframe.serverMABC.MABCL0700;

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
 * ブロック"Loc_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Loc_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_LOC_R {

	/**
	 * Asset management dept. cd. 資産管理部門ＣＤ.<p>
	 *
	 */
	public static final String $check_asst_dpt_cd = "check_asst_dpt_cd";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $check_sls_dpt_cd = "check_sls_dpt_cd";


	public static final MCMeta check_asst_dpt_cd_META = createCommonMeta($check_asst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta check_sls_dpt_cd_META = createCommonMeta($check_sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);

	protected static final ConstMetaList<Loc_UpdChk01_DtlR> constMetas = new ConstMetaList<Loc_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_LOC_R.constMetas,
		new MCMeta[]{
			check_asst_dpt_cd_META,
			check_sls_dpt_cd_META,
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
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
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
				{$loc_cd, "E"},	// loc_cd
				{$loc_nm, "E"},	// loc_nm
				{$asst_dpt_cd, "E"},	// asst_dpt_cd
				{$wg_cd, "E"},	// wg_cd
				{$site_cd, "E"},	// site_cd
				{$lg_grp_cd, "E"},	// lg_grp_cd
				{$loc_grp_cd, "E"},	// loc_grp_cd
				{$loc_mng_typ, "E"}	// loc_mng_typ
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$loc_mng_typ, "MAC_LOC_MNG_TYP"},	// loc_mng_typ
				{$ext_sys_loc_typ, "MAC_EXT_SYS_LOC_TYP"}	// ext_sys_loc_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$check_asst_dpt_cd, "MA.MAUAL0010.Dpt"},	// check_asst_dpt_cd
				{$check_sls_dpt_cd, "MA.MAUAL0010.Dpt"},	// check_sls_dpt_cd
				{$wg_cd, "MA.MAUAL0010.LgOrMfgWg"},	// wg_cd
				{$site_cd, "MA.MAUAL0010.Site"},	// site_cd
				{$lg_grp_cd, "MA.MAUAL0010.LgGrpForLoc"},	// lg_grp_cd
				{$loc_grp_cd, "MA.MAUAL0010.LocGrp"},	// loc_grp_cd
				{$alloc_grp_cd, "MA.MAUAL0010.AllocGrp"},	// alloc_grp_cd
				{$sppl_cd, "MA.MAUAL0010.Bp"},	// sppl_cd
				{$maker_cd, "MA.MAUAL0010.Bp"},	// maker_cd
				{$cal_cd, "MA.MAUAL0010.CalBase"},	// cal_cd
				{$cntry_cd, "MA.MAUAL0010.Cntry"},	// cntry_cd
				{$rsrc_cd1, "MA.MAUAL0010.Rsrc"},	// rsrc_cd1
				{$rsrc_cd2, "MA.MAUAL0010.Rsrc"}	// rsrc_cd2
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
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$check_asst_dpt_cd, "MAC_DPT_IS_SRCH_TYP.ASST;true"},	// check_asst_dpt_cd
				{$check_sls_dpt_cd, "MAC_DPT_IS_SRCH_TYP.SLS;true"},	// check_sls_dpt_cd
				{$loc_grp_cd, "wg_cd"},	// loc_grp_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$check_asst_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// check_asst_dpt_cd
				{$check_sls_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// check_sls_dpt_cd
				{$loc_grp_cd, "wg_cd"},	// loc_grp_cd
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$maker_cd, "bp_is_srch_typ"}	// maker_cd
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
	protected Loc_UpdChk01_DtlR_MC_A(ConstMetaList<? extends Loc_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Loc_UpdChk01_DtlR clone() {
		return (Loc_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Loc_UpdChk01_DtlR createInstance() {
		return (Loc_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Loc_UpdChk01_DtlR getValues(String... names) {
		return (Loc_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Asset management dept. cd. 資産管理部門ＣＤ.<p>
	 *
	 */
	public String check_asst_dpt_cd() {
		return getConstString(offset + 0, $check_asst_dpt_cd);
	}

	/**
	 * Asset management dept. cd. 資産管理部門ＣＤ.<p>
	 *
	 */
	public void check_asst_dpt_cd(String value) {
		setConstString(offset + 0, $check_asst_dpt_cd, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String check_sls_dpt_cd() {
		return getConstString(offset + 1, $check_sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void check_sls_dpt_cd(String value) {
		setConstString(offset + 1, $check_sls_dpt_cd, value);
	}


	public String getString(String name) {
		if ($check_asst_dpt_cd.equalsIgnoreCase(name)) {
			return check_asst_dpt_cd();
		}
		if ($check_sls_dpt_cd.equalsIgnoreCase(name)) {
			return check_sls_dpt_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($check_asst_dpt_cd.equalsIgnoreCase(name)) {
			return check_asst_dpt_cd();
		}
		if ($check_sls_dpt_cd.equalsIgnoreCase(name)) {
			return check_sls_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($check_asst_dpt_cd.equalsIgnoreCase(name)) {
			check_asst_dpt_cd(value);
			return;
		}
		if ($check_sls_dpt_cd.equalsIgnoreCase(name)) {
			check_sls_dpt_cd(value);
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
	public void setBoolean(String name, boolean value) {
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($check_asst_dpt_cd.equalsIgnoreCase(name)) {
			check_asst_dpt_cd(value);
			return;
		}
		if ($check_sls_dpt_cd.equalsIgnoreCase(name)) {
			check_sls_dpt_cd(value);
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
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

