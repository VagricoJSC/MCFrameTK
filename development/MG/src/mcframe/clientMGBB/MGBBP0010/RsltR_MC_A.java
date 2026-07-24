package mcframe.clientMGBB.MGBBP0010;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	public static final String $ct_data_typ = "ct_data_typ";
	/**
	 * Data types データ種類.<p>
	 *
	 */
	public static final String $ct_data_typ_nm = "ct_data_typ_nm";
	/**
	 * Last update date and time 最終更新日時.<p>
	 *
	 */
	public static final String $last_upd_dt = "last_upd_dt";
	/**
	 * Number of importing source 取込対象件数.<p>
	 *
	 */
	public static final String $no_imp_cnt = "no_imp_cnt";
	public static final String $if_dtl_typ = "if_dtl_typ";
	/**
	 * IF data details ＩＦデータ詳細.<p>
	 *
	 */
	public static final String $if_dtl_typ_nm = "if_dtl_typ_nm";
	/**
	 * Last update date and time (IF data) ＩＦデータ最終更新日時.<p>
	 *
	 */
	public static final String $if_last_upd_dt = "if_last_upd_dt";
	public static final String $list_sort = "list_sort";
	public static final String $is_enable = "is_enable";
	public static final String $is_visible = "is_visible";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ct_data_typ_META = createCommonMeta($ct_data_typ, mcframe.commonMG.meta.MG_META.CT_DATA_TYP);
	public static final MCMeta ct_data_typ_nm_META = createCommonMeta($ct_data_typ_nm, mcframe.commonMG.meta.MG_META.CT_DATA_TYP_NM);
	public static final MCMeta last_upd_dt_META = createCommonMeta($last_upd_dt, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta no_imp_cnt_META = createCommonMeta($no_imp_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta if_dtl_typ_META = createCommonMeta($if_dtl_typ, mcframe.commonMG.meta.MG_META.IF_DTL_TYP);
	public static final MCMeta if_dtl_typ_nm_META = createCommonMeta($if_dtl_typ_nm, mcframe.commonMG.meta.MG_META.IF_DTL_TYP_NM);
	public static final MCMeta if_last_upd_dt_META = createCommonMeta($if_last_upd_dt, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta list_sort_META = createCommonMeta($list_sort, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta is_enable_META = createCommonMeta($is_enable, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_visible_META = createCommonMeta($is_visible, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			ct_data_typ_META,
			ct_data_typ_nm_META,
			last_upd_dt_META,
			no_imp_cnt_META,
			if_dtl_typ_META,
			if_dtl_typ_nm_META,
			if_last_upd_dt_META,
			list_sort_META,
			is_enable_META,
			is_visible_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	public String ct_data_typ() {
		return getConstString(offset + 1, $ct_data_typ);
	}

	public void ct_data_typ(String value) {
		setConstString(offset + 1, $ct_data_typ, value);
	}


	/**
	 * Data types データ種類.<p>
	 *
	 */
	public String ct_data_typ_nm() {
		return getConstString(offset + 2, $ct_data_typ_nm);
	}

	/**
	 * Data types データ種類.<p>
	 *
	 */
	public void ct_data_typ_nm(String value) {
		setConstString(offset + 2, $ct_data_typ_nm, value);
	}


	/**
	 * Last update date and time 最終更新日時.<p>
	 *
	 */
	public MCTimestamp last_upd_dt() {
		return getConstTimestamp(offset + 3, $last_upd_dt);
	}

	/**
	 * Last update date and time 最終更新日時.<p>
	 *
	 */
	public void last_upd_dt(MCTimestamp value) {
		setConstTimestamp(offset + 3, $last_upd_dt, value);
	}


	/**
	 * Number of importing source 取込対象件数.<p>
	 *
	 */
	public MCNumber no_imp_cnt() {
		return getConstNumber(offset + 4, $no_imp_cnt);
	}

	/**
	 * Number of importing source 取込対象件数.<p>
	 *
	 */
	public void no_imp_cnt(MCNumber value) {
		setConstNumber(offset + 4, $no_imp_cnt, value);
	}

	/**
	 * Number of importing source 取込対象件数.<p>
	 *
	 */
	public void no_imp_cnt(int value) {
		setConstNumber(offset + 4, $no_imp_cnt, value);
	}

	/**
	 * Number of importing source 取込対象件数.<p>
	 *
	 */
	public void no_imp_cnt(long value) {
		setConstNumber(offset + 4, $no_imp_cnt, value);
	}

	/**
	 * Number of importing source 取込対象件数.<p>
	 *
	 */
	public void no_imp_cnt(float value) {
		setConstNumber(offset + 4, $no_imp_cnt, value);
	}

	/**
	 * Number of importing source 取込対象件数.<p>
	 *
	 */
	public void no_imp_cnt(double value) {
		setConstNumber(offset + 4, $no_imp_cnt, value);
	}


	public String if_dtl_typ() {
		return getConstString(offset + 5, $if_dtl_typ);
	}

	public void if_dtl_typ(String value) {
		setConstString(offset + 5, $if_dtl_typ, value);
	}


	/**
	 * IF data details ＩＦデータ詳細.<p>
	 *
	 */
	public String if_dtl_typ_nm() {
		return getConstString(offset + 6, $if_dtl_typ_nm);
	}

	/**
	 * IF data details ＩＦデータ詳細.<p>
	 *
	 */
	public void if_dtl_typ_nm(String value) {
		setConstString(offset + 6, $if_dtl_typ_nm, value);
	}


	/**
	 * Last update date and time (IF data) ＩＦデータ最終更新日時.<p>
	 *
	 */
	public MCTimestamp if_last_upd_dt() {
		return getConstTimestamp(offset + 7, $if_last_upd_dt);
	}

	/**
	 * Last update date and time (IF data) ＩＦデータ最終更新日時.<p>
	 *
	 */
	public void if_last_upd_dt(MCTimestamp value) {
		setConstTimestamp(offset + 7, $if_last_upd_dt, value);
	}


	public MCNumber list_sort() {
		return getConstNumber(offset + 8, $list_sort);
	}

	public void list_sort(MCNumber value) {
		setConstNumber(offset + 8, $list_sort, value);
	}

	public void list_sort(int value) {
		setConstNumber(offset + 8, $list_sort, value);
	}

	public void list_sort(long value) {
		setConstNumber(offset + 8, $list_sort, value);
	}

	public void list_sort(float value) {
		setConstNumber(offset + 8, $list_sort, value);
	}

	public void list_sort(double value) {
		setConstNumber(offset + 8, $list_sort, value);
	}


	public boolean is_enable() {
		return getConstBoolean(offset + 9, $is_enable);
	}

	public void is_enable(boolean value) {
		setConstBoolean(offset + 9, $is_enable, value);
	}


	public boolean is_visible() {
		return getConstBoolean(offset + 10, $is_visible);
	}

	public void is_visible(boolean value) {
		setConstBoolean(offset + 10, $is_visible, value);
	}


	public String getString(String name) {
		if ($ct_data_typ.equalsIgnoreCase(name)) {
			return ct_data_typ();
		}
		if ($ct_data_typ_nm.equalsIgnoreCase(name)) {
			return ct_data_typ_nm();
		}
		if ($if_dtl_typ.equalsIgnoreCase(name)) {
			return if_dtl_typ();
		}
		if ($if_dtl_typ_nm.equalsIgnoreCase(name)) {
			return if_dtl_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			return no_imp_cnt();
		}
		if ($list_sort.equalsIgnoreCase(name)) {
			return list_sort();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($last_upd_dt.equalsIgnoreCase(name)) {
			return last_upd_dt();
		}
		if ($if_last_upd_dt.equalsIgnoreCase(name)) {
			return if_last_upd_dt();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($is_enable.equalsIgnoreCase(name)) {
			return is_enable();
		}
		if ($is_visible.equalsIgnoreCase(name)) {
			return is_visible();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ct_data_typ.equalsIgnoreCase(name)) {
			return ct_data_typ();
		}
		if ($ct_data_typ_nm.equalsIgnoreCase(name)) {
			return ct_data_typ_nm();
		}
		if ($if_dtl_typ.equalsIgnoreCase(name)) {
			return if_dtl_typ();
		}
		if ($if_dtl_typ_nm.equalsIgnoreCase(name)) {
			return if_dtl_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			return no_imp_cnt();
		}
		if ($list_sort.equalsIgnoreCase(name)) {
			return list_sort();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($last_upd_dt.equalsIgnoreCase(name)) {
			return last_upd_dt();
		}
		if ($if_last_upd_dt.equalsIgnoreCase(name)) {
			return if_last_upd_dt();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($is_enable.equalsIgnoreCase(name)) {
			return is_enable();
		}
		if ($is_visible.equalsIgnoreCase(name)) {
			return is_visible();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ct_data_typ.equalsIgnoreCase(name)) {
			ct_data_typ(value);
			return;
		}
		if ($ct_data_typ_nm.equalsIgnoreCase(name)) {
			ct_data_typ_nm(value);
			return;
		}
		if ($if_dtl_typ.equalsIgnoreCase(name)) {
			if_dtl_typ(value);
			return;
		}
		if ($if_dtl_typ_nm.equalsIgnoreCase(name)) {
			if_dtl_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($last_upd_dt.equalsIgnoreCase(name)) {
			last_upd_dt(value);
			return;
		}
		if ($if_last_upd_dt.equalsIgnoreCase(name)) {
			if_last_upd_dt(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($is_enable.equalsIgnoreCase(name)) {
			is_enable(value);
			return;
		}
		if ($is_visible.equalsIgnoreCase(name)) {
			is_visible(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ct_data_typ.equalsIgnoreCase(name)) {
			ct_data_typ(value);
			return;
		}
		if ($ct_data_typ_nm.equalsIgnoreCase(name)) {
			ct_data_typ_nm(value);
			return;
		}
		if ($if_dtl_typ.equalsIgnoreCase(name)) {
			if_dtl_typ(value);
			return;
		}
		if ($if_dtl_typ_nm.equalsIgnoreCase(name)) {
			if_dtl_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		if ($list_sort.equalsIgnoreCase(name)) {
			list_sort(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($last_upd_dt.equalsIgnoreCase(name)) {
			last_upd_dt(value);
			return;
		}
		if ($if_last_upd_dt.equalsIgnoreCase(name)) {
			if_last_upd_dt(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($is_enable.equalsIgnoreCase(name)) {
			is_enable(value);
			return;
		}
		if ($is_visible.equalsIgnoreCase(name)) {
			is_visible(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

