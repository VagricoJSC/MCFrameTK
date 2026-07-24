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
 * ブロック"Alloc_Avl_Sprt01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Alloc_Avl_Sprt01_CndR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public static final String $dlv_lg_grp_cd = "dlv_lg_grp_cd";
	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gi_lg_grp_cd = "gi_lg_grp_cd";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public static final String $gi_schd_dt = "gi_schd_dt";
	/**
	 * Operation date 運用日付.<p>
	 *
	 */
	public static final String $today = "today";
	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public static final String $alloc_days = "alloc_days";
	/**
	 * Number of days before shipping 出荷までの日数.<p>
	 *
	 */
	public static final String $ship_days = "ship_days";
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	/**
	 * Number of allocatable days exceeded 引当可能日数を超過.<p>
	 *
	 */
	public static final String $exceed_alloc_days_flg = "exceed_alloc_days_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dlv_lg_grp_cd_META = createCommonMeta($dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gi_lg_grp_cd_META = createCommonMeta($gi_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta gi_schd_dt_META = createCommonMeta($gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta today_META = createCommonMeta($today, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta alloc_days_META = createCommonMeta($alloc_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta ship_days_META = createCommonMeta($ship_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta exceed_alloc_days_flg_META = createCommonMeta($exceed_alloc_days_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Alloc_Avl_Sprt01_CndR> constMetas = new ConstMetaList<Alloc_Avl_Sprt01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			dlv_lg_grp_cd_META,
			gi_lg_grp_cd_META,
			ship_term_cd_META,
			gi_schd_dt_META,
			today_META,
			alloc_days_META,
			ship_days_META,
			cal_cd_META,
			exceed_alloc_days_flg_META
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
	protected Alloc_Avl_Sprt01_CndR_MC_A(ConstMetaList<? extends Alloc_Avl_Sprt01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_Avl_Sprt01_CndR clone() {
		return (Alloc_Avl_Sprt01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_Avl_Sprt01_CndR createInstance() {
		return (Alloc_Avl_Sprt01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_Avl_Sprt01_CndR getValues(String... names) {
		return (Alloc_Avl_Sprt01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return getConstString(offset + 1, $dlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		setConstString(offset + 1, $dlv_lg_grp_cd, value);
	}


	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return getConstString(offset + 2, $gi_lg_grp_cd);
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		setConstString(offset + 2, $gi_lg_grp_cd, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 3, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 3, $ship_term_cd, value);
	}


	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return getConstDate(offset + 4, $gi_schd_dt);
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		setConstDate(offset + 4, $gi_schd_dt, value);
	}


	/**
	 * Operation date 運用日付.<p>
	 *
	 */
	public MCDate today() {
		return getConstDate(offset + 5, $today);
	}

	/**
	 * Operation date 運用日付.<p>
	 *
	 */
	public void today(MCDate value) {
		setConstDate(offset + 5, $today, value);
	}


	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public MCNumber alloc_days() {
		return getConstNumber(offset + 6, $alloc_days);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(MCNumber value) {
		setConstNumber(offset + 6, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(int value) {
		setConstNumber(offset + 6, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(long value) {
		setConstNumber(offset + 6, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(float value) {
		setConstNumber(offset + 6, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(double value) {
		setConstNumber(offset + 6, $alloc_days, value);
	}


	/**
	 * Number of days before shipping 出荷までの日数.<p>
	 *
	 */
	public MCNumber ship_days() {
		return getConstNumber(offset + 7, $ship_days);
	}

	/**
	 * Number of days before shipping 出荷までの日数.<p>
	 *
	 */
	public void ship_days(MCNumber value) {
		setConstNumber(offset + 7, $ship_days, value);
	}

	/**
	 * Number of days before shipping 出荷までの日数.<p>
	 *
	 */
	public void ship_days(int value) {
		setConstNumber(offset + 7, $ship_days, value);
	}

	/**
	 * Number of days before shipping 出荷までの日数.<p>
	 *
	 */
	public void ship_days(long value) {
		setConstNumber(offset + 7, $ship_days, value);
	}

	/**
	 * Number of days before shipping 出荷までの日数.<p>
	 *
	 */
	public void ship_days(float value) {
		setConstNumber(offset + 7, $ship_days, value);
	}

	/**
	 * Number of days before shipping 出荷までの日数.<p>
	 *
	 */
	public void ship_days(double value) {
		setConstNumber(offset + 7, $ship_days, value);
	}


	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 8, $cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 8, $cal_cd, value);
	}


	/**
	 * Number of allocatable days exceeded 引当可能日数を超過.<p>
	 *
	 */
	public boolean exceed_alloc_days_flg() {
		return getConstBoolean(offset + 9, $exceed_alloc_days_flg);
	}

	/**
	 * Number of allocatable days exceeded 引当可能日数を超過.<p>
	 *
	 */
	public void exceed_alloc_days_flg(boolean value) {
		setConstBoolean(offset + 9, $exceed_alloc_days_flg, value);
	}


	public String getString(String name) {
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			return alloc_days();
		}
		if ($ship_days.equalsIgnoreCase(name)) {
			return ship_days();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($today.equalsIgnoreCase(name)) {
			return today();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($exceed_alloc_days_flg.equalsIgnoreCase(name)) {
			return exceed_alloc_days_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			return alloc_days();
		}
		if ($ship_days.equalsIgnoreCase(name)) {
			return ship_days();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($today.equalsIgnoreCase(name)) {
			return today();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($exceed_alloc_days_flg.equalsIgnoreCase(name)) {
			return exceed_alloc_days_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($ship_days.equalsIgnoreCase(name)) {
			ship_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($ship_days.equalsIgnoreCase(name)) {
			ship_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($ship_days.equalsIgnoreCase(name)) {
			ship_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($ship_days.equalsIgnoreCase(name)) {
			ship_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($ship_days.equalsIgnoreCase(name)) {
			ship_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($today.equalsIgnoreCase(name)) {
			today(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($exceed_alloc_days_flg.equalsIgnoreCase(name)) {
			exceed_alloc_days_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($ship_days.equalsIgnoreCase(name)) {
			ship_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($ship_days.equalsIgnoreCase(name)) {
			ship_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($ship_days.equalsIgnoreCase(name)) {
			ship_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($ship_days.equalsIgnoreCase(name)) {
			ship_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($ship_days.equalsIgnoreCase(name)) {
			ship_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($today.equalsIgnoreCase(name)) {
			today(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($exceed_alloc_days_flg.equalsIgnoreCase(name)) {
			exceed_alloc_days_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

