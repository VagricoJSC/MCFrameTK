package mcframe.serverPFBA.PFBAL5830;

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
 * ブロック"CostCenter_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CostCenter_DtlR_MC_A extends MCConstRow {

	/**
	 * Cost center 原価センタ.<p>
	 *
	 */
	public static final String $cost_center = "cost_center";
	/**
	 * Expiration start date 有効期限開始日.<p>
	 *
	 */
	public static final String $validity_start_date = "validity_start_date";
	/**
	 * Expiration end date 有効期限終了日.<p>
	 *
	 */
	public static final String $validity_end_date = "validity_end_date";
	/**
	 * Profit center 利益センタ.<p>
	 *
	 */
	public static final String $profit_center = "profit_center";


	public static final MCMeta cost_center_META = createCommonMeta($cost_center, mcframe.commonMA.meta.MA_META.COST_CENTER);
	public static final MCMeta validity_start_date_META = createCommonMeta($validity_start_date, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta validity_end_date_META = createCommonMeta($validity_end_date, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta profit_center_META = createCommonMeta($profit_center, mcframe.commonMA.meta.MA_META.PROFIT_CENTER);

	protected static final ConstMetaList<CostCenter_DtlR> constMetas = new ConstMetaList<CostCenter_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cost_center_META,
			validity_start_date_META,
			validity_end_date_META,
			profit_center_META
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
	protected CostCenter_DtlR_MC_A(ConstMetaList<? extends CostCenter_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CostCenter_DtlR clone() {
		return (CostCenter_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CostCenter_DtlR createInstance() {
		return (CostCenter_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CostCenter_DtlR getValues(String... names) {
		return (CostCenter_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Cost center 原価センタ.<p>
	 *
	 */
	public String cost_center() {
		return getConstString(offset + 0, $cost_center);
	}

	/**
	 * Cost center 原価センタ.<p>
	 *
	 */
	public void cost_center(String value) {
		setConstString(offset + 0, $cost_center, value);
	}


	/**
	 * Expiration start date 有効期限開始日.<p>
	 *
	 */
	public MCDate validity_start_date() {
		return getConstDate(offset + 1, $validity_start_date);
	}

	/**
	 * Expiration start date 有効期限開始日.<p>
	 *
	 */
	public void validity_start_date(MCDate value) {
		setConstDate(offset + 1, $validity_start_date, value);
	}


	/**
	 * Expiration end date 有効期限終了日.<p>
	 *
	 */
	public MCDate validity_end_date() {
		return getConstDate(offset + 2, $validity_end_date);
	}

	/**
	 * Expiration end date 有効期限終了日.<p>
	 *
	 */
	public void validity_end_date(MCDate value) {
		setConstDate(offset + 2, $validity_end_date, value);
	}


	/**
	 * Profit center 利益センタ.<p>
	 *
	 */
	public String profit_center() {
		return getConstString(offset + 3, $profit_center);
	}

	/**
	 * Profit center 利益センタ.<p>
	 *
	 */
	public void profit_center(String value) {
		setConstString(offset + 3, $profit_center, value);
	}


	public String getString(String name) {
		if ($cost_center.equalsIgnoreCase(name)) {
			return cost_center();
		}
		if ($profit_center.equalsIgnoreCase(name)) {
			return profit_center();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($validity_start_date.equalsIgnoreCase(name)) {
			return validity_start_date();
		}
		if ($validity_end_date.equalsIgnoreCase(name)) {
			return validity_end_date();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($cost_center.equalsIgnoreCase(name)) {
			return cost_center();
		}
		if ($profit_center.equalsIgnoreCase(name)) {
			return profit_center();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($validity_start_date.equalsIgnoreCase(name)) {
			return validity_start_date();
		}
		if ($validity_end_date.equalsIgnoreCase(name)) {
			return validity_end_date();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($cost_center.equalsIgnoreCase(name)) {
			cost_center(value);
			return;
		}
		if ($profit_center.equalsIgnoreCase(name)) {
			profit_center(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($validity_start_date.equalsIgnoreCase(name)) {
			validity_start_date(value);
			return;
		}
		if ($validity_end_date.equalsIgnoreCase(name)) {
			validity_end_date(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cost_center.equalsIgnoreCase(name)) {
			cost_center(value);
			return;
		}
		if ($profit_center.equalsIgnoreCase(name)) {
			profit_center(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($validity_start_date.equalsIgnoreCase(name)) {
			validity_start_date(value);
			return;
		}
		if ($validity_end_date.equalsIgnoreCase(name)) {
			validity_end_date(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

