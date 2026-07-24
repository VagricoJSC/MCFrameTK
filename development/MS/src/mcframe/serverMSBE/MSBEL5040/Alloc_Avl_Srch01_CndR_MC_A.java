package mcframe.serverMSBE.MSBEL5040;

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
 * ブロック"Alloc_Avl_Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Alloc_Avl_Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Process type at shortage 不足時処理区分.<p>
	 *
	 */
	public static final String $short_ope_typ = "short_ope_typ";
	/**
	 * GI allocation check flg. 出庫引当確認フラグ.<p>
	 *
	 */
	public static final String $gi_alloc_flg = "gi_alloc_flg";
	/**
	 * Prior allocation only flg. 優先引当のみＦＬＧ.<p>
	 *
	 */
	public static final String $all_pri_flg = "all_pri_flg";
	/**
	 * Allocation pending exclusion flg. 引当保留除外ＦＬＧ.<p>
	 *
	 */
	public static final String $except_alloc_wait_flg = "except_alloc_wait_flg";
	/**
	 * Zero exclusion flg. ゼロ除外ＦＬＧ.<p>
	 *
	 */
	public static final String $except_zero_flg = "except_zero_flg";
	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dt_fr = "dt_fr";
	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public static final String $dt_to = "dt_to";
	/**
	 * Scheduled date to use 使用予定日.<p>
	 *
	 */
	public static final String $avl_schd_dt = "avl_schd_dt";
	/**
	 * Expired lot exclusion flg. 有効期限切れロット除外ＦＬＧ.<p>
	 *
	 */
	public static final String $except_invld_lot_flg = "except_invld_lot_flg";
	/**
	 * Active ingredient calculation flg. 有効成分計算ＦＬＧ.<p>
	 *
	 */
	public static final String $cont_fctr_calc_flg = "cont_fctr_calc_flg";
	/**
	 * Search with gross allocation specification flg. 総量引当指定検索ＦＬＧ.<p>
	 *
	 */
	public static final String $alloc_grp_srch_flg = "alloc_grp_srch_flg";
	/**
	 * Details calculation flg. 詳細計算ＦＬＧ.<p>
	 *
	 */
	public static final String $dtl_calc_flg = "dtl_calc_flg";
	/**
	 * Ignore surplus number of days 余裕無視日数.<p>
	 *
	 */
	public static final String $ignore_margin_days = "ignore_margin_days";
	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public static final String $xfr_src_typ = "xfr_src_typ";


	public static final MCMeta short_ope_typ_META = createCommonMeta($short_ope_typ, mcframe.commonMS.meta.MS_META.SHORT_OPE_TYP);
	public static final MCMeta gi_alloc_flg_META = createCommonMeta($gi_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta all_pri_flg_META = createCommonMeta($all_pri_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta except_alloc_wait_flg_META = createCommonMeta($except_alloc_wait_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta except_zero_flg_META = createCommonMeta($except_zero_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dt_fr_META = createCommonMeta($dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt_to_META = createCommonMeta($dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta avl_schd_dt_META = createCommonMeta($avl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta except_invld_lot_flg_META = createCommonMeta($except_invld_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_calc_flg_META = createCommonMeta($cont_fctr_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_grp_srch_flg_META = createCommonMeta($alloc_grp_srch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dtl_calc_flg_META = createCommonMeta($dtl_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ignore_margin_days_META = createCommonMeta($ignore_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta xfr_src_typ_META = createCommonMeta($xfr_src_typ, mcframe.commonMS.meta.MS_META.XFR_SRC_TYP);

	protected static final ConstMetaList<Alloc_Avl_Srch01_CndR> constMetas = new ConstMetaList<Alloc_Avl_Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			short_ope_typ_META,
			gi_alloc_flg_META,
			all_pri_flg_META,
			except_alloc_wait_flg_META,
			except_zero_flg_META,
			dt_fr_META,
			dt_to_META,
			avl_schd_dt_META,
			except_invld_lot_flg_META,
			cont_fctr_calc_flg_META,
			alloc_grp_srch_flg_META,
			dtl_calc_flg_META,
			ignore_margin_days_META,
			xfr_src_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected Alloc_Avl_Srch01_CndR_MC_A(ConstMetaList<? extends Alloc_Avl_Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_Avl_Srch01_CndR clone() {
		return (Alloc_Avl_Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_Avl_Srch01_CndR createInstance() {
		return (Alloc_Avl_Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_Avl_Srch01_CndR getValues(String... names) {
		return (Alloc_Avl_Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Process type at shortage 不足時処理区分.<p>
	 *
	 */
	public String short_ope_typ() {
		return getConstString(offset + 0, $short_ope_typ);
	}

	/**
	 * Process type at shortage 不足時処理区分.<p>
	 *
	 */
	public void short_ope_typ(String value) {
		setConstString(offset + 0, $short_ope_typ, value);
	}


	/**
	 * GI allocation check flg. 出庫引当確認フラグ.<p>
	 *
	 */
	public boolean gi_alloc_flg() {
		return getConstBoolean(offset + 1, $gi_alloc_flg);
	}

	/**
	 * GI allocation check flg. 出庫引当確認フラグ.<p>
	 *
	 */
	public void gi_alloc_flg(boolean value) {
		setConstBoolean(offset + 1, $gi_alloc_flg, value);
	}


	/**
	 * Prior allocation only flg. 優先引当のみＦＬＧ.<p>
	 *
	 */
	public boolean all_pri_flg() {
		return getConstBoolean(offset + 2, $all_pri_flg);
	}

	/**
	 * Prior allocation only flg. 優先引当のみＦＬＧ.<p>
	 *
	 */
	public void all_pri_flg(boolean value) {
		setConstBoolean(offset + 2, $all_pri_flg, value);
	}


	/**
	 * Allocation pending exclusion flg. 引当保留除外ＦＬＧ.<p>
	 *
	 */
	public boolean except_alloc_wait_flg() {
		return getConstBoolean(offset + 3, $except_alloc_wait_flg);
	}

	/**
	 * Allocation pending exclusion flg. 引当保留除外ＦＬＧ.<p>
	 *
	 */
	public void except_alloc_wait_flg(boolean value) {
		setConstBoolean(offset + 3, $except_alloc_wait_flg, value);
	}


	/**
	 * Zero exclusion flg. ゼロ除外ＦＬＧ.<p>
	 *
	 */
	public boolean except_zero_flg() {
		return getConstBoolean(offset + 4, $except_zero_flg);
	}

	/**
	 * Zero exclusion flg. ゼロ除外ＦＬＧ.<p>
	 *
	 */
	public void except_zero_flg(boolean value) {
		setConstBoolean(offset + 4, $except_zero_flg, value);
	}


	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dt_fr() {
		return getConstDate(offset + 5, $dt_fr);
	}

	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public void dt_fr(MCDate value) {
		setConstDate(offset + 5, $dt_fr, value);
	}


	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public MCDate dt_to() {
		return getConstDate(offset + 6, $dt_to);
	}

	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public void dt_to(MCDate value) {
		setConstDate(offset + 6, $dt_to, value);
	}


	/**
	 * Scheduled date to use 使用予定日.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return getConstDate(offset + 7, $avl_schd_dt);
	}

	/**
	 * Scheduled date to use 使用予定日.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		setConstDate(offset + 7, $avl_schd_dt, value);
	}


	/**
	 * Expired lot exclusion flg. 有効期限切れロット除外ＦＬＧ.<p>
	 *
	 */
	public boolean except_invld_lot_flg() {
		return getConstBoolean(offset + 8, $except_invld_lot_flg);
	}

	/**
	 * Expired lot exclusion flg. 有効期限切れロット除外ＦＬＧ.<p>
	 *
	 */
	public void except_invld_lot_flg(boolean value) {
		setConstBoolean(offset + 8, $except_invld_lot_flg, value);
	}


	/**
	 * Active ingredient calculation flg. 有効成分計算ＦＬＧ.<p>
	 *
	 */
	public boolean cont_fctr_calc_flg() {
		return getConstBoolean(offset + 9, $cont_fctr_calc_flg);
	}

	/**
	 * Active ingredient calculation flg. 有効成分計算ＦＬＧ.<p>
	 *
	 */
	public void cont_fctr_calc_flg(boolean value) {
		setConstBoolean(offset + 9, $cont_fctr_calc_flg, value);
	}


	/**
	 * Search with gross allocation specification flg. 総量引当指定検索ＦＬＧ.<p>
	 *
	 */
	public boolean alloc_grp_srch_flg() {
		return getConstBoolean(offset + 10, $alloc_grp_srch_flg);
	}

	/**
	 * Search with gross allocation specification flg. 総量引当指定検索ＦＬＧ.<p>
	 *
	 */
	public void alloc_grp_srch_flg(boolean value) {
		setConstBoolean(offset + 10, $alloc_grp_srch_flg, value);
	}


	/**
	 * Details calculation flg. 詳細計算ＦＬＧ.<p>
	 *
	 */
	public boolean dtl_calc_flg() {
		return getConstBoolean(offset + 11, $dtl_calc_flg);
	}

	/**
	 * Details calculation flg. 詳細計算ＦＬＧ.<p>
	 *
	 */
	public void dtl_calc_flg(boolean value) {
		setConstBoolean(offset + 11, $dtl_calc_flg, value);
	}


	/**
	 * Ignore surplus number of days 余裕無視日数.<p>
	 *
	 */
	public MCNumber ignore_margin_days() {
		return getConstNumber(offset + 12, $ignore_margin_days);
	}

	/**
	 * Ignore surplus number of days 余裕無視日数.<p>
	 *
	 */
	public void ignore_margin_days(MCNumber value) {
		setConstNumber(offset + 12, $ignore_margin_days, value);
	}

	/**
	 * Ignore surplus number of days 余裕無視日数.<p>
	 *
	 */
	public void ignore_margin_days(int value) {
		setConstNumber(offset + 12, $ignore_margin_days, value);
	}

	/**
	 * Ignore surplus number of days 余裕無視日数.<p>
	 *
	 */
	public void ignore_margin_days(long value) {
		setConstNumber(offset + 12, $ignore_margin_days, value);
	}

	/**
	 * Ignore surplus number of days 余裕無視日数.<p>
	 *
	 */
	public void ignore_margin_days(float value) {
		setConstNumber(offset + 12, $ignore_margin_days, value);
	}

	/**
	 * Ignore surplus number of days 余裕無視日数.<p>
	 *
	 */
	public void ignore_margin_days(double value) {
		setConstNumber(offset + 12, $ignore_margin_days, value);
	}


	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public String xfr_src_typ() {
		return getConstString(offset + 13, $xfr_src_typ);
	}

	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public void xfr_src_typ(String value) {
		setConstString(offset + 13, $xfr_src_typ, value);
	}


	public String getString(String name) {
		if ($short_ope_typ.equalsIgnoreCase(name)) {
			return short_ope_typ();
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ignore_margin_days.equalsIgnoreCase(name)) {
			return ignore_margin_days();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			return gi_alloc_flg();
		}
		if ($all_pri_flg.equalsIgnoreCase(name)) {
			return all_pri_flg();
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			return except_alloc_wait_flg();
		}
		if ($except_zero_flg.equalsIgnoreCase(name)) {
			return except_zero_flg();
		}
		if ($except_invld_lot_flg.equalsIgnoreCase(name)) {
			return except_invld_lot_flg();
		}
		if ($cont_fctr_calc_flg.equalsIgnoreCase(name)) {
			return cont_fctr_calc_flg();
		}
		if ($alloc_grp_srch_flg.equalsIgnoreCase(name)) {
			return alloc_grp_srch_flg();
		}
		if ($dtl_calc_flg.equalsIgnoreCase(name)) {
			return dtl_calc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($short_ope_typ.equalsIgnoreCase(name)) {
			return short_ope_typ();
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ignore_margin_days.equalsIgnoreCase(name)) {
			return ignore_margin_days();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			return gi_alloc_flg();
		}
		if ($all_pri_flg.equalsIgnoreCase(name)) {
			return all_pri_flg();
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			return except_alloc_wait_flg();
		}
		if ($except_zero_flg.equalsIgnoreCase(name)) {
			return except_zero_flg();
		}
		if ($except_invld_lot_flg.equalsIgnoreCase(name)) {
			return except_invld_lot_flg();
		}
		if ($cont_fctr_calc_flg.equalsIgnoreCase(name)) {
			return cont_fctr_calc_flg();
		}
		if ($alloc_grp_srch_flg.equalsIgnoreCase(name)) {
			return alloc_grp_srch_flg();
		}
		if ($dtl_calc_flg.equalsIgnoreCase(name)) {
			return dtl_calc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($short_ope_typ.equalsIgnoreCase(name)) {
			short_ope_typ(value);
			return;
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ignore_margin_days.equalsIgnoreCase(name)) {
			ignore_margin_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ignore_margin_days.equalsIgnoreCase(name)) {
			ignore_margin_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ignore_margin_days.equalsIgnoreCase(name)) {
			ignore_margin_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ignore_margin_days.equalsIgnoreCase(name)) {
			ignore_margin_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ignore_margin_days.equalsIgnoreCase(name)) {
			ignore_margin_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			gi_alloc_flg(value);
			return;
		}
		if ($all_pri_flg.equalsIgnoreCase(name)) {
			all_pri_flg(value);
			return;
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			except_alloc_wait_flg(value);
			return;
		}
		if ($except_zero_flg.equalsIgnoreCase(name)) {
			except_zero_flg(value);
			return;
		}
		if ($except_invld_lot_flg.equalsIgnoreCase(name)) {
			except_invld_lot_flg(value);
			return;
		}
		if ($cont_fctr_calc_flg.equalsIgnoreCase(name)) {
			cont_fctr_calc_flg(value);
			return;
		}
		if ($alloc_grp_srch_flg.equalsIgnoreCase(name)) {
			alloc_grp_srch_flg(value);
			return;
		}
		if ($dtl_calc_flg.equalsIgnoreCase(name)) {
			dtl_calc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($short_ope_typ.equalsIgnoreCase(name)) {
			short_ope_typ(value);
			return;
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ignore_margin_days.equalsIgnoreCase(name)) {
			ignore_margin_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ignore_margin_days.equalsIgnoreCase(name)) {
			ignore_margin_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ignore_margin_days.equalsIgnoreCase(name)) {
			ignore_margin_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ignore_margin_days.equalsIgnoreCase(name)) {
			ignore_margin_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ignore_margin_days.equalsIgnoreCase(name)) {
			ignore_margin_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			gi_alloc_flg(value);
			return;
		}
		if ($all_pri_flg.equalsIgnoreCase(name)) {
			all_pri_flg(value);
			return;
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			except_alloc_wait_flg(value);
			return;
		}
		if ($except_zero_flg.equalsIgnoreCase(name)) {
			except_zero_flg(value);
			return;
		}
		if ($except_invld_lot_flg.equalsIgnoreCase(name)) {
			except_invld_lot_flg(value);
			return;
		}
		if ($cont_fctr_calc_flg.equalsIgnoreCase(name)) {
			cont_fctr_calc_flg(value);
			return;
		}
		if ($alloc_grp_srch_flg.equalsIgnoreCase(name)) {
			alloc_grp_srch_flg(value);
			return;
		}
		if ($dtl_calc_flg.equalsIgnoreCase(name)) {
			dtl_calc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

