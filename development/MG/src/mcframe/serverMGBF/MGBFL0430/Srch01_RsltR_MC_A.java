package mcframe.serverMGBF.MGBFL0430;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_term = "dummy_term";
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Line name ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Beginning WIP cost 月初仕掛原価.<p>
	 *
	 */
	public static final String $st_wip_amt = "st_wip_amt";
	/**
	 * Incurred cost 発生原価.<p>
	 *
	 */
	public static final String $prod_amt = "prod_amt";
	/**
	 * Mfg. item input cost 製造品投入原価.<p>
	 *
	 */
	public static final String $inpt_amt = "inpt_amt";
	/**
	 * Cost of completed item 完成原価.<p>
	 *
	 */
	public static final String $comp_amt = "comp_amt";
	/**
	 * Ending WIP cost 月末仕掛原価.<p>
	 *
	 */
	public static final String $end_wip_amt = "end_wip_amt";


	public static final MCMeta dummy_term_META = createCommonMeta($dummy_term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta st_wip_amt_META = createCommonMeta($st_wip_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prod_amt_META = createCommonMeta($prod_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inpt_amt_META = createCommonMeta($inpt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta comp_amt_META = createCommonMeta($comp_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_wip_amt_META = createCommonMeta($end_wip_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dummy_term_META,
			calc_grp_cd_META,
			calc_grp_nm_META,
			wg_cd_META,
			wg_nm_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			site_cd_META,
			site_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			ym_META,
			st_wip_amt_META,
			prod_amt_META,
			inpt_amt_META,
			comp_amt_META,
			end_wip_amt_META
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public MCDate dummy_term() {
		return getConstDate(offset + 0, $dummy_term);
	}

	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_term(MCDate value) {
		setConstDate(offset + 0, $dummy_term, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 2, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 2, $calc_grp_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 3, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 3, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 4, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 4, $wg_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 5, $mng_dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 5, $mng_dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 6, $mng_dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 6, $mng_dpt_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 7, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 7, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 8, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 8, $site_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 9, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 9, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 10, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 10, $loc_nm, value);
	}


	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 11, $str_ln_cd);
	}

	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 11, $str_ln_cd, value);
	}


	/**
	 * Line name ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 12, $str_ln_nm);
	}

	/**
	 * Line name ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 12, $str_ln_nm, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 13, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 13, $ym, value);
	}


	/**
	 * Beginning WIP cost 月初仕掛原価.<p>
	 *
	 */
	public MCNumber st_wip_amt() {
		return getConstNumber(offset + 14, $st_wip_amt);
	}

	/**
	 * Beginning WIP cost 月初仕掛原価.<p>
	 *
	 */
	public void st_wip_amt(MCNumber value) {
		setConstNumber(offset + 14, $st_wip_amt, value);
	}

	/**
	 * Beginning WIP cost 月初仕掛原価.<p>
	 *
	 */
	public void st_wip_amt(int value) {
		setConstNumber(offset + 14, $st_wip_amt, value);
	}

	/**
	 * Beginning WIP cost 月初仕掛原価.<p>
	 *
	 */
	public void st_wip_amt(long value) {
		setConstNumber(offset + 14, $st_wip_amt, value);
	}

	/**
	 * Beginning WIP cost 月初仕掛原価.<p>
	 *
	 */
	public void st_wip_amt(float value) {
		setConstNumber(offset + 14, $st_wip_amt, value);
	}

	/**
	 * Beginning WIP cost 月初仕掛原価.<p>
	 *
	 */
	public void st_wip_amt(double value) {
		setConstNumber(offset + 14, $st_wip_amt, value);
	}


	/**
	 * Incurred cost 発生原価.<p>
	 *
	 */
	public MCNumber prod_amt() {
		return getConstNumber(offset + 15, $prod_amt);
	}

	/**
	 * Incurred cost 発生原価.<p>
	 *
	 */
	public void prod_amt(MCNumber value) {
		setConstNumber(offset + 15, $prod_amt, value);
	}

	/**
	 * Incurred cost 発生原価.<p>
	 *
	 */
	public void prod_amt(int value) {
		setConstNumber(offset + 15, $prod_amt, value);
	}

	/**
	 * Incurred cost 発生原価.<p>
	 *
	 */
	public void prod_amt(long value) {
		setConstNumber(offset + 15, $prod_amt, value);
	}

	/**
	 * Incurred cost 発生原価.<p>
	 *
	 */
	public void prod_amt(float value) {
		setConstNumber(offset + 15, $prod_amt, value);
	}

	/**
	 * Incurred cost 発生原価.<p>
	 *
	 */
	public void prod_amt(double value) {
		setConstNumber(offset + 15, $prod_amt, value);
	}


	/**
	 * Mfg. item input cost 製造品投入原価.<p>
	 *
	 */
	public MCNumber inpt_amt() {
		return getConstNumber(offset + 16, $inpt_amt);
	}

	/**
	 * Mfg. item input cost 製造品投入原価.<p>
	 *
	 */
	public void inpt_amt(MCNumber value) {
		setConstNumber(offset + 16, $inpt_amt, value);
	}

	/**
	 * Mfg. item input cost 製造品投入原価.<p>
	 *
	 */
	public void inpt_amt(int value) {
		setConstNumber(offset + 16, $inpt_amt, value);
	}

	/**
	 * Mfg. item input cost 製造品投入原価.<p>
	 *
	 */
	public void inpt_amt(long value) {
		setConstNumber(offset + 16, $inpt_amt, value);
	}

	/**
	 * Mfg. item input cost 製造品投入原価.<p>
	 *
	 */
	public void inpt_amt(float value) {
		setConstNumber(offset + 16, $inpt_amt, value);
	}

	/**
	 * Mfg. item input cost 製造品投入原価.<p>
	 *
	 */
	public void inpt_amt(double value) {
		setConstNumber(offset + 16, $inpt_amt, value);
	}


	/**
	 * Cost of completed item 完成原価.<p>
	 *
	 */
	public MCNumber comp_amt() {
		return getConstNumber(offset + 17, $comp_amt);
	}

	/**
	 * Cost of completed item 完成原価.<p>
	 *
	 */
	public void comp_amt(MCNumber value) {
		setConstNumber(offset + 17, $comp_amt, value);
	}

	/**
	 * Cost of completed item 完成原価.<p>
	 *
	 */
	public void comp_amt(int value) {
		setConstNumber(offset + 17, $comp_amt, value);
	}

	/**
	 * Cost of completed item 完成原価.<p>
	 *
	 */
	public void comp_amt(long value) {
		setConstNumber(offset + 17, $comp_amt, value);
	}

	/**
	 * Cost of completed item 完成原価.<p>
	 *
	 */
	public void comp_amt(float value) {
		setConstNumber(offset + 17, $comp_amt, value);
	}

	/**
	 * Cost of completed item 完成原価.<p>
	 *
	 */
	public void comp_amt(double value) {
		setConstNumber(offset + 17, $comp_amt, value);
	}


	/**
	 * Ending WIP cost 月末仕掛原価.<p>
	 *
	 */
	public MCNumber end_wip_amt() {
		return getConstNumber(offset + 18, $end_wip_amt);
	}

	/**
	 * Ending WIP cost 月末仕掛原価.<p>
	 *
	 */
	public void end_wip_amt(MCNumber value) {
		setConstNumber(offset + 18, $end_wip_amt, value);
	}

	/**
	 * Ending WIP cost 月末仕掛原価.<p>
	 *
	 */
	public void end_wip_amt(int value) {
		setConstNumber(offset + 18, $end_wip_amt, value);
	}

	/**
	 * Ending WIP cost 月末仕掛原価.<p>
	 *
	 */
	public void end_wip_amt(long value) {
		setConstNumber(offset + 18, $end_wip_amt, value);
	}

	/**
	 * Ending WIP cost 月末仕掛原価.<p>
	 *
	 */
	public void end_wip_amt(float value) {
		setConstNumber(offset + 18, $end_wip_amt, value);
	}

	/**
	 * Ending WIP cost 月末仕掛原価.<p>
	 *
	 */
	public void end_wip_amt(double value) {
		setConstNumber(offset + 18, $end_wip_amt, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			return st_wip_amt();
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			return prod_amt();
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			return inpt_amt();
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			return comp_amt();
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			return end_wip_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			return dummy_term();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			return st_wip_amt();
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			return prod_amt();
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			return inpt_amt();
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			return comp_amt();
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			return end_wip_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			return dummy_term();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			dummy_term(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			dummy_term(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

