package mcframe.serverMGBB.MGBBL0010;

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
	 * Common data type 共通データ種類区分.<p>
	 *
	 */
	public static final String $ct_data_typ = "ct_data_typ";
	/**
	 * IF data details type ＩＦデータ詳細区分.<p>
	 *
	 */
	public static final String $if_dtl_typ = "if_dtl_typ";
	public static final String $is_enable = "is_enable";
	/**
	 * Last update date and time 最終更新日時.<p>
	 *
	 */
	public static final String $last_upd_dt = "last_upd_dt";
	/**
	 * Number of not imported sources 未取込件数.<p>
	 *
	 */
	public static final String $no_imp_cnt = "no_imp_cnt";
	/**
	 * Last update date and time (IF data) ＩＦデータ最終更新日時.<p>
	 *
	 */
	public static final String $if_last_upd_dt = "if_last_upd_dt";


	public static final MCMeta ct_data_typ_META = createCommonMeta($ct_data_typ, mcframe.commonMG.meta.MG_META.CT_DATA_TYP);
	public static final MCMeta if_dtl_typ_META = createCommonMeta($if_dtl_typ, mcframe.commonMG.meta.MG_META.IF_DTL_TYP);
	public static final MCMeta is_enable_META = createCommonMeta($is_enable, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_upd_dt_META = createCommonMeta($last_upd_dt, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta no_imp_cnt_META = createCommonMeta($no_imp_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta if_last_upd_dt_META = createCommonMeta($if_last_upd_dt, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ct_data_typ_META,
			if_dtl_typ_META,
			is_enable_META,
			last_upd_dt_META,
			no_imp_cnt_META,
			if_last_upd_dt_META
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
	 * Common data type 共通データ種類区分.<p>
	 *
	 */
	public String ct_data_typ() {
		return getConstString(offset + 0, $ct_data_typ);
	}

	/**
	 * Common data type 共通データ種類区分.<p>
	 *
	 */
	public void ct_data_typ(String value) {
		setConstString(offset + 0, $ct_data_typ, value);
	}


	/**
	 * IF data details type ＩＦデータ詳細区分.<p>
	 *
	 */
	public String if_dtl_typ() {
		return getConstString(offset + 1, $if_dtl_typ);
	}

	/**
	 * IF data details type ＩＦデータ詳細区分.<p>
	 *
	 */
	public void if_dtl_typ(String value) {
		setConstString(offset + 1, $if_dtl_typ, value);
	}


	public boolean is_enable() {
		return getConstBoolean(offset + 2, $is_enable);
	}

	public void is_enable(boolean value) {
		setConstBoolean(offset + 2, $is_enable, value);
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
	 * Number of not imported sources 未取込件数.<p>
	 *
	 */
	public MCNumber no_imp_cnt() {
		return getConstNumber(offset + 4, $no_imp_cnt);
	}

	/**
	 * Number of not imported sources 未取込件数.<p>
	 *
	 */
	public void no_imp_cnt(MCNumber value) {
		setConstNumber(offset + 4, $no_imp_cnt, value);
	}

	/**
	 * Number of not imported sources 未取込件数.<p>
	 *
	 */
	public void no_imp_cnt(int value) {
		setConstNumber(offset + 4, $no_imp_cnt, value);
	}

	/**
	 * Number of not imported sources 未取込件数.<p>
	 *
	 */
	public void no_imp_cnt(long value) {
		setConstNumber(offset + 4, $no_imp_cnt, value);
	}

	/**
	 * Number of not imported sources 未取込件数.<p>
	 *
	 */
	public void no_imp_cnt(float value) {
		setConstNumber(offset + 4, $no_imp_cnt, value);
	}

	/**
	 * Number of not imported sources 未取込件数.<p>
	 *
	 */
	public void no_imp_cnt(double value) {
		setConstNumber(offset + 4, $no_imp_cnt, value);
	}


	/**
	 * Last update date and time (IF data) ＩＦデータ最終更新日時.<p>
	 *
	 */
	public MCTimestamp if_last_upd_dt() {
		return getConstTimestamp(offset + 5, $if_last_upd_dt);
	}

	/**
	 * Last update date and time (IF data) ＩＦデータ最終更新日時.<p>
	 *
	 */
	public void if_last_upd_dt(MCTimestamp value) {
		setConstTimestamp(offset + 5, $if_last_upd_dt, value);
	}


	public String getString(String name) {
		if ($ct_data_typ.equalsIgnoreCase(name)) {
			return ct_data_typ();
		}
		if ($if_dtl_typ.equalsIgnoreCase(name)) {
			return if_dtl_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			return no_imp_cnt();
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
		if ($is_enable.equalsIgnoreCase(name)) {
			return is_enable();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ct_data_typ.equalsIgnoreCase(name)) {
			return ct_data_typ();
		}
		if ($if_dtl_typ.equalsIgnoreCase(name)) {
			return if_dtl_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			return no_imp_cnt();
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
		if ($is_enable.equalsIgnoreCase(name)) {
			return is_enable();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ct_data_typ.equalsIgnoreCase(name)) {
			ct_data_typ(value);
			return;
		}
		if ($if_dtl_typ.equalsIgnoreCase(name)) {
			if_dtl_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
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
		if ($is_enable.equalsIgnoreCase(name)) {
			is_enable(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ct_data_typ.equalsIgnoreCase(name)) {
			ct_data_typ(value);
			return;
		}
		if ($if_dtl_typ.equalsIgnoreCase(name)) {
			if_dtl_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($no_imp_cnt.equalsIgnoreCase(name)) {
			no_imp_cnt(value);
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
		if ($is_enable.equalsIgnoreCase(name)) {
			is_enable(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

