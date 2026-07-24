package mcframe.serverMSBC.MSBCL5080;

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
 * ブロック"RqmtCrt_Calc01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RqmtCrt_Calc01_CndR_MC_A extends MCConstRow {

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public static final String $ac_cl_day = "ac_cl_day";
	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public static final String $ac_cl_mon_base = "ac_cl_mon_base";


	public static final MCMeta ac_cl_day_META = createCommonMeta($ac_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta ac_cl_mon_base_META = createCommonMeta($ac_cl_mon_base, mcframe.commonMA.meta.MA_META.CL_MON_BASE);

	protected static final ConstMetaList<RqmtCrt_Calc01_CndR> constMetas = new ConstMetaList<RqmtCrt_Calc01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_cl_day_META,
			ac_cl_mon_base_META
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
	protected RqmtCrt_Calc01_CndR_MC_A(ConstMetaList<? extends RqmtCrt_Calc01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RqmtCrt_Calc01_CndR clone() {
		return (RqmtCrt_Calc01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RqmtCrt_Calc01_CndR createInstance() {
		return (RqmtCrt_Calc01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RqmtCrt_Calc01_CndR getValues(String... names) {
		return (RqmtCrt_Calc01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public MCNumber ac_cl_day() {
		return getConstNumber(offset + 0, $ac_cl_day);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(MCNumber value) {
		setConstNumber(offset + 0, $ac_cl_day, value);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(int value) {
		setConstNumber(offset + 0, $ac_cl_day, value);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(long value) {
		setConstNumber(offset + 0, $ac_cl_day, value);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(float value) {
		setConstNumber(offset + 0, $ac_cl_day, value);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(double value) {
		setConstNumber(offset + 0, $ac_cl_day, value);
	}


	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public MCNumber ac_cl_mon_base() {
		return getConstNumber(offset + 1, $ac_cl_mon_base);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(MCNumber value) {
		setConstNumber(offset + 1, $ac_cl_mon_base, value);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(int value) {
		setConstNumber(offset + 1, $ac_cl_mon_base, value);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(long value) {
		setConstNumber(offset + 1, $ac_cl_mon_base, value);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(float value) {
		setConstNumber(offset + 1, $ac_cl_mon_base, value);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(double value) {
		setConstNumber(offset + 1, $ac_cl_mon_base, value);
	}


	public MCNumber getNumber(String name) {
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			return ac_cl_day();
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			return ac_cl_mon_base();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			return ac_cl_day();
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			return ac_cl_mon_base();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

