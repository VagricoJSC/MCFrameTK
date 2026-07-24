package mcframe.serverMGBB.MGBBL0020;

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
	 * IF data classification type ＩＦデータ種類区分.<p>
	 *
	 */
	public static final String $if_data_typ = "if_data_typ";
	/**
	 * Cost result classification type 原価実績種類区分.<p>
	 *
	 */
	public static final String $cost_act_typ = "cost_act_typ";
	/**
	 * Last update date and time (IF data) ＩＦデータ最終更新日時.<p>
	 *
	 */
	public static final String $if_last_upd_dt = "if_last_upd_dt";
	/**
	 * Last update date and time (Result data) 原価実績データ最終更新日時.<p>
	 *
	 */
	public static final String $last_upd_dt = "last_upd_dt";


	public static final MCMeta if_data_typ_META = createCommonMeta($if_data_typ, mcframe.commonMG.meta.MG_META.IF_DATA_TYP);
	public static final MCMeta cost_act_typ_META = createCommonMeta($cost_act_typ, mcframe.commonMG.meta.MG_META.COST_ACT_TYP);
	public static final MCMeta if_last_upd_dt_META = createCommonMeta($if_last_upd_dt, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta last_upd_dt_META = createCommonMeta($last_upd_dt, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			if_data_typ_META,
			cost_act_typ_META,
			if_last_upd_dt_META,
			last_upd_dt_META
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
	 * IF data classification type ＩＦデータ種類区分.<p>
	 *
	 */
	public String if_data_typ() {
		return getConstString(offset + 0, $if_data_typ);
	}

	/**
	 * IF data classification type ＩＦデータ種類区分.<p>
	 *
	 */
	public void if_data_typ(String value) {
		setConstString(offset + 0, $if_data_typ, value);
	}


	/**
	 * Cost result classification type 原価実績種類区分.<p>
	 *
	 */
	public String cost_act_typ() {
		return getConstString(offset + 1, $cost_act_typ);
	}

	/**
	 * Cost result classification type 原価実績種類区分.<p>
	 *
	 */
	public void cost_act_typ(String value) {
		setConstString(offset + 1, $cost_act_typ, value);
	}


	/**
	 * Last update date and time (IF data) ＩＦデータ最終更新日時.<p>
	 *
	 */
	public MCTimestamp if_last_upd_dt() {
		return getConstTimestamp(offset + 2, $if_last_upd_dt);
	}

	/**
	 * Last update date and time (IF data) ＩＦデータ最終更新日時.<p>
	 *
	 */
	public void if_last_upd_dt(MCTimestamp value) {
		setConstTimestamp(offset + 2, $if_last_upd_dt, value);
	}


	/**
	 * Last update date and time (Result data) 原価実績データ最終更新日時.<p>
	 *
	 */
	public MCTimestamp last_upd_dt() {
		return getConstTimestamp(offset + 3, $last_upd_dt);
	}

	/**
	 * Last update date and time (Result data) 原価実績データ最終更新日時.<p>
	 *
	 */
	public void last_upd_dt(MCTimestamp value) {
		setConstTimestamp(offset + 3, $last_upd_dt, value);
	}


	public String getString(String name) {
		if ($if_data_typ.equalsIgnoreCase(name)) {
			return if_data_typ();
		}
		if ($cost_act_typ.equalsIgnoreCase(name)) {
			return cost_act_typ();
		}
		return super.getString(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($if_last_upd_dt.equalsIgnoreCase(name)) {
			return if_last_upd_dt();
		}
		if ($last_upd_dt.equalsIgnoreCase(name)) {
			return last_upd_dt();
		}
		return super.getTimestamp(name);
	}

	public String getStringNE(String name) {
		if ($if_data_typ.equalsIgnoreCase(name)) {
			return if_data_typ();
		}
		if ($cost_act_typ.equalsIgnoreCase(name)) {
			return cost_act_typ();
		}
		return super.getStringNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($if_last_upd_dt.equalsIgnoreCase(name)) {
			return if_last_upd_dt();
		}
		if ($last_upd_dt.equalsIgnoreCase(name)) {
			return last_upd_dt();
		}
		return super.getTimestampNE(name);
	}

	public void setString(String name, String value) {
		if ($if_data_typ.equalsIgnoreCase(name)) {
			if_data_typ(value);
			return;
		}
		if ($cost_act_typ.equalsIgnoreCase(name)) {
			cost_act_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($if_last_upd_dt.equalsIgnoreCase(name)) {
			if_last_upd_dt(value);
			return;
		}
		if ($last_upd_dt.equalsIgnoreCase(name)) {
			last_upd_dt(value);
			return;
		}
		super.setTimestamp(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($if_data_typ.equalsIgnoreCase(name)) {
			if_data_typ(value);
			return;
		}
		if ($cost_act_typ.equalsIgnoreCase(name)) {
			cost_act_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($if_last_upd_dt.equalsIgnoreCase(name)) {
			if_last_upd_dt(value);
			return;
		}
		if ($last_upd_dt.equalsIgnoreCase(name)) {
			last_upd_dt(value);
			return;
		}
		super.setTimestampNE(name, value);
	}



}

