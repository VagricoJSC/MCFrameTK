package mcframe.serverMSBB.MSBBL1400;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Specified month 指定年月.<p>
	 *
	 */
	public static final String $inpt_ym = "inpt_ym";
	/**
	 * Display sales forecasting 売上推移表示.<p>
	 *
	 */
	public static final String $sls_trnst_disp = "sls_trnst_disp";
	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public static final String $sls_disp_term = "sls_disp_term";
	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public static final String $sum_term = "sum_term";
	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public static final String $sls_bdg_grp = "sls_bdg_grp";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Convert result by rate at sales 実績を売上時レートで換算.<p>
	 *
	 */
	public static final String $use_act_xrate_flg = "use_act_xrate_flg";
	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public static final String $dpt_lvl_cd = "dpt_lvl_cd";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public static final String $sls_itm_grp_lvl = "sls_itm_grp_lvl";
	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public static final String $sls_itm_grp_cd = "sls_itm_grp_cd";
	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public static final String $sls_itm_grp_nm = "sls_itm_grp_nm";


	public static final MCMeta inpt_ym_META = createCommonMeta($inpt_ym, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_trnst_disp_META = createCommonMeta($sls_trnst_disp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_disp_term_META = createCommonMeta($sls_disp_term, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sum_term_META = createCommonMeta($sum_term, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sls_bdg_grp_META = createCommonMeta($sls_bdg_grp, mcframe.commonMS.meta.MS_META.SLS_BDG_GRP);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta use_act_xrate_flg_META = createCommonMeta($use_act_xrate_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_lvl_cd_META = createCommonMeta($dpt_lvl_cd, mcframe.commonMA.meta.MA_META.DPT_LVL_CD);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta sls_itm_grp_lvl_META = createCommonMeta($sls_itm_grp_lvl, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta sls_itm_grp_cd_META = createCommonMeta($sls_itm_grp_cd, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta sls_itm_grp_nm_META = createCommonMeta($sls_itm_grp_nm, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_NM);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inpt_ym_META,
			sls_trnst_disp_META,
			sls_disp_term_META,
			sum_term_META,
			sls_bdg_grp_META,
			xrate_cd_META,
			use_act_xrate_flg_META,
			dpt_lvl_cd_META,
			dpt_cd_META,
			dpt_nm_META,
			sls_itm_grp_lvl_META,
			sls_itm_grp_cd_META,
			sls_itm_grp_nm_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Specified month 指定年月.<p>
	 *
	 */
	public MCDate inpt_ym() {
		return getConstDate(offset + 0, $inpt_ym);
	}

	/**
	 * Specified month 指定年月.<p>
	 *
	 */
	public void inpt_ym(MCDate value) {
		setConstDate(offset + 0, $inpt_ym, value);
	}


	/**
	 * Display sales forecasting 売上推移表示.<p>
	 *
	 */
	public boolean sls_trnst_disp() {
		return getConstBoolean(offset + 1, $sls_trnst_disp);
	}

	/**
	 * Display sales forecasting 売上推移表示.<p>
	 *
	 */
	public void sls_trnst_disp(boolean value) {
		setConstBoolean(offset + 1, $sls_trnst_disp, value);
	}


	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public MCNumber sls_disp_term() {
		return getConstNumber(offset + 2, $sls_disp_term);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term(MCNumber value) {
		setConstNumber(offset + 2, $sls_disp_term, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term(int value) {
		setConstNumber(offset + 2, $sls_disp_term, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term(long value) {
		setConstNumber(offset + 2, $sls_disp_term, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term(float value) {
		setConstNumber(offset + 2, $sls_disp_term, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term(double value) {
		setConstNumber(offset + 2, $sls_disp_term, value);
	}


	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public MCNumber sum_term() {
		return getConstNumber(offset + 3, $sum_term);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term(MCNumber value) {
		setConstNumber(offset + 3, $sum_term, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term(int value) {
		setConstNumber(offset + 3, $sum_term, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term(long value) {
		setConstNumber(offset + 3, $sum_term, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term(float value) {
		setConstNumber(offset + 3, $sum_term, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term(double value) {
		setConstNumber(offset + 3, $sum_term, value);
	}


	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public String sls_bdg_grp() {
		return getConstString(offset + 4, $sls_bdg_grp);
	}

	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public void sls_bdg_grp(String value) {
		setConstString(offset + 4, $sls_bdg_grp, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 5, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 5, $xrate_cd, value);
	}


	/**
	 * Convert result by rate at sales 実績を売上時レートで換算.<p>
	 *
	 */
	public boolean use_act_xrate_flg() {
		return getConstBoolean(offset + 6, $use_act_xrate_flg);
	}

	/**
	 * Convert result by rate at sales 実績を売上時レートで換算.<p>
	 *
	 */
	public void use_act_xrate_flg(boolean value) {
		setConstBoolean(offset + 6, $use_act_xrate_flg, value);
	}


	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public String dpt_lvl_cd() {
		return getConstString(offset + 7, $dpt_lvl_cd);
	}

	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public void dpt_lvl_cd(String value) {
		setConstString(offset + 7, $dpt_lvl_cd, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 8, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 8, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 9, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 9, $dpt_nm, value);
	}


	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public MCNumber sls_itm_grp_lvl() {
		return getConstNumber(offset + 10, $sls_itm_grp_lvl);
	}

	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(MCNumber value) {
		setConstNumber(offset + 10, $sls_itm_grp_lvl, value);
	}

	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(int value) {
		setConstNumber(offset + 10, $sls_itm_grp_lvl, value);
	}

	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(long value) {
		setConstNumber(offset + 10, $sls_itm_grp_lvl, value);
	}

	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(float value) {
		setConstNumber(offset + 10, $sls_itm_grp_lvl, value);
	}

	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(double value) {
		setConstNumber(offset + 10, $sls_itm_grp_lvl, value);
	}


	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public String sls_itm_grp_cd() {
		return getConstString(offset + 11, $sls_itm_grp_cd);
	}

	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public void sls_itm_grp_cd(String value) {
		setConstString(offset + 11, $sls_itm_grp_cd, value);
	}


	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public String sls_itm_grp_nm() {
		return getConstString(offset + 12, $sls_itm_grp_nm);
	}

	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public void sls_itm_grp_nm(String value) {
		setConstString(offset + 12, $sls_itm_grp_nm, value);
	}


	public String getString(String name) {
		if ($sls_bdg_grp.equalsIgnoreCase(name)) {
			return sls_bdg_grp();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			return sls_itm_grp_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			return sls_disp_term();
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			return sum_term();
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			return sls_itm_grp_lvl();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($inpt_ym.equalsIgnoreCase(name)) {
			return inpt_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sls_trnst_disp.equalsIgnoreCase(name)) {
			return sls_trnst_disp();
		}
		if ($use_act_xrate_flg.equalsIgnoreCase(name)) {
			return use_act_xrate_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sls_bdg_grp.equalsIgnoreCase(name)) {
			return sls_bdg_grp();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			return sls_itm_grp_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			return sls_disp_term();
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			return sum_term();
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			return sls_itm_grp_lvl();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($inpt_ym.equalsIgnoreCase(name)) {
			return inpt_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sls_trnst_disp.equalsIgnoreCase(name)) {
			return sls_trnst_disp();
		}
		if ($use_act_xrate_flg.equalsIgnoreCase(name)) {
			return use_act_xrate_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sls_bdg_grp.equalsIgnoreCase(name)) {
			sls_bdg_grp(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
			return;
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			sls_itm_grp_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($inpt_ym.equalsIgnoreCase(name)) {
			inpt_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sls_trnst_disp.equalsIgnoreCase(name)) {
			sls_trnst_disp(value);
			return;
		}
		if ($use_act_xrate_flg.equalsIgnoreCase(name)) {
			use_act_xrate_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sls_bdg_grp.equalsIgnoreCase(name)) {
			sls_bdg_grp(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
			return;
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			sls_itm_grp_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($inpt_ym.equalsIgnoreCase(name)) {
			inpt_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sls_trnst_disp.equalsIgnoreCase(name)) {
			sls_trnst_disp(value);
			return;
		}
		if ($use_act_xrate_flg.equalsIgnoreCase(name)) {
			use_act_xrate_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

