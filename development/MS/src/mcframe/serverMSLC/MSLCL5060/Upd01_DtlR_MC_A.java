package mcframe.serverMSLC.MSLCL5060;

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
 * ブロック"Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd01_DtlR_MC_A extends mcframe.serverMAUD.MAUDL1030.Upd01_DtlR {

	/**
	 * Non-moving comparison date 滞留比較日.<p>
	 *
	 */
	public static final String $non_mov_cmp_dt = "non_mov_cmp_dt";
	/**
	 * Number of non-moving base days 滞留基準日数.<p>
	 *
	 */
	public static final String $non_mov_base_days = "non_mov_base_days";


	public static final MCMeta non_mov_cmp_dt_META = createCommonMeta($non_mov_cmp_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta non_mov_base_days_META = createCommonMeta($non_mov_base_days, mcframe.commonMA.meta.MA_META.DAYS);

	protected static final ConstMetaList<Upd01_DtlR> constMetas = new ConstMetaList<Upd01_DtlR>(
		mcframe.serverMAUD.MAUDL1030.Upd01_DtlR.constMetas,
		new MCMeta[]{
			non_mov_cmp_dt_META,
			non_mov_base_days_META,
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
		mcframe.serverMAUD.MAUDL1030.Upd01_DtlR.EXTMAP
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
	protected Upd01_DtlR_MC_A(ConstMetaList<? extends Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_DtlR clone() {
		return (Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_DtlR createInstance() {
		return (Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_DtlR getValues(String... names) {
		return (Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Non-moving comparison date 滞留比較日.<p>
	 *
	 */
	public MCDate non_mov_cmp_dt() {
		return getConstDate(offset + 0, $non_mov_cmp_dt);
	}

	/**
	 * Non-moving comparison date 滞留比較日.<p>
	 *
	 */
	public void non_mov_cmp_dt(MCDate value) {
		setConstDate(offset + 0, $non_mov_cmp_dt, value);
	}


	/**
	 * Number of non-moving base days 滞留基準日数.<p>
	 *
	 */
	public MCNumber non_mov_base_days() {
		return getConstNumber(offset + 1, $non_mov_base_days);
	}

	/**
	 * Number of non-moving base days 滞留基準日数.<p>
	 *
	 */
	public void non_mov_base_days(MCNumber value) {
		setConstNumber(offset + 1, $non_mov_base_days, value);
	}

	/**
	 * Number of non-moving base days 滞留基準日数.<p>
	 *
	 */
	public void non_mov_base_days(int value) {
		setConstNumber(offset + 1, $non_mov_base_days, value);
	}

	/**
	 * Number of non-moving base days 滞留基準日数.<p>
	 *
	 */
	public void non_mov_base_days(long value) {
		setConstNumber(offset + 1, $non_mov_base_days, value);
	}

	/**
	 * Number of non-moving base days 滞留基準日数.<p>
	 *
	 */
	public void non_mov_base_days(float value) {
		setConstNumber(offset + 1, $non_mov_base_days, value);
	}

	/**
	 * Number of non-moving base days 滞留基準日数.<p>
	 *
	 */
	public void non_mov_base_days(double value) {
		setConstNumber(offset + 1, $non_mov_base_days, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			return non_mov_base_days();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($non_mov_cmp_dt.equalsIgnoreCase(name)) {
			return non_mov_cmp_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			return non_mov_base_days();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($non_mov_cmp_dt.equalsIgnoreCase(name)) {
			return non_mov_cmp_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($non_mov_cmp_dt.equalsIgnoreCase(name)) {
			non_mov_cmp_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($non_mov_base_days.equalsIgnoreCase(name)) {
			non_mov_base_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($non_mov_cmp_dt.equalsIgnoreCase(name)) {
			non_mov_cmp_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

