package mcframe.serverMBBB.MBBBL5030;

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
 * ブロック"AutoJnl_Upd02_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AutoJnl_Upd02_CndR_MC_A extends MCConstRow {

	/**
	 * Journal group No. 仕訳グループＮＯ.<p>
	 *
	 */
	public static final String $jnl_grp_no = "jnl_grp_no";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Next month of recording month 計上年月翌月.<p>
	 *
	 */
	public static final String $ac_ym_next = "ac_ym_next";
	/**
	 * Last day of the month 月度末日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * Month 月.<p>
	 *
	 */
	public static final String $mon = "mon";
	/**
	 * Return value 戻り値.<p>
	 *
	 */
	public static final String $rc = "rc";


	public static final MCMeta jnl_grp_no_META = createCommonMeta($jnl_grp_no, mcframe.commonMA.meta.MA_META.JNL_GRP_NO);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_ym_next_META = createCommonMeta($ac_ym_next, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta mon_META = createNumberMeta($mon);
	public static final MCMeta rc_META = createNumberMeta($rc);

	protected static final ConstMetaList<AutoJnl_Upd02_CndR> constMetas = new ConstMetaList<AutoJnl_Upd02_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			jnl_grp_no_META,
			ac_ym_META,
			ac_ym_next_META,
			end_dt_META,
			mon_META,
			rc_META
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
	protected AutoJnl_Upd02_CndR_MC_A(ConstMetaList<? extends AutoJnl_Upd02_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AutoJnl_Upd02_CndR clone() {
		return (AutoJnl_Upd02_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AutoJnl_Upd02_CndR createInstance() {
		return (AutoJnl_Upd02_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AutoJnl_Upd02_CndR getValues(String... names) {
		return (AutoJnl_Upd02_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Journal group No. 仕訳グループＮＯ.<p>
	 *
	 */
	public String jnl_grp_no() {
		return getConstString(offset + 0, $jnl_grp_no);
	}

	/**
	 * Journal group No. 仕訳グループＮＯ.<p>
	 *
	 */
	public void jnl_grp_no(String value) {
		setConstString(offset + 0, $jnl_grp_no, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 1, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 1, $ac_ym, value);
	}


	/**
	 * Next month of recording month 計上年月翌月.<p>
	 *
	 */
	public MCDate ac_ym_next() {
		return getConstDate(offset + 2, $ac_ym_next);
	}

	/**
	 * Next month of recording month 計上年月翌月.<p>
	 *
	 */
	public void ac_ym_next(MCDate value) {
		setConstDate(offset + 2, $ac_ym_next, value);
	}


	/**
	 * Last day of the month 月度末日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 3, $end_dt);
	}

	/**
	 * Last day of the month 月度末日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 3, $end_dt, value);
	}


	/**
	 * Month 月.<p>
	 *
	 */
	public MCNumber mon() {
		return getConstNumber(offset + 4, $mon);
	}

	/**
	 * Month 月.<p>
	 *
	 */
	public void mon(MCNumber value) {
		setConstNumber(offset + 4, $mon, value);
	}

	/**
	 * Month 月.<p>
	 *
	 */
	public void mon(int value) {
		setConstNumber(offset + 4, $mon, value);
	}

	/**
	 * Month 月.<p>
	 *
	 */
	public void mon(long value) {
		setConstNumber(offset + 4, $mon, value);
	}

	/**
	 * Month 月.<p>
	 *
	 */
	public void mon(float value) {
		setConstNumber(offset + 4, $mon, value);
	}

	/**
	 * Month 月.<p>
	 *
	 */
	public void mon(double value) {
		setConstNumber(offset + 4, $mon, value);
	}


	/**
	 * Return value 戻り値.<p>
	 *
	 */
	public MCNumber rc() {
		return getConstNumber(offset + 5, $rc);
	}

	/**
	 * Return value 戻り値.<p>
	 *
	 */
	public void rc(MCNumber value) {
		setConstNumber(offset + 5, $rc, value);
	}

	/**
	 * Return value 戻り値.<p>
	 *
	 */
	public void rc(int value) {
		setConstNumber(offset + 5, $rc, value);
	}

	/**
	 * Return value 戻り値.<p>
	 *
	 */
	public void rc(long value) {
		setConstNumber(offset + 5, $rc, value);
	}

	/**
	 * Return value 戻り値.<p>
	 *
	 */
	public void rc(float value) {
		setConstNumber(offset + 5, $rc, value);
	}

	/**
	 * Return value 戻り値.<p>
	 *
	 */
	public void rc(double value) {
		setConstNumber(offset + 5, $rc, value);
	}


	public String getString(String name) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($mon.equalsIgnoreCase(name)) {
			return mon();
		}
		if ($rc.equalsIgnoreCase(name)) {
			return rc();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_ym_next.equalsIgnoreCase(name)) {
			return ac_ym_next();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($mon.equalsIgnoreCase(name)) {
			return mon();
		}
		if ($rc.equalsIgnoreCase(name)) {
			return rc();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_ym_next.equalsIgnoreCase(name)) {
			return ac_ym_next();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			jnl_grp_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($mon.equalsIgnoreCase(name)) {
			mon(value);
			return;
		}
		if ($rc.equalsIgnoreCase(name)) {
			rc(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($mon.equalsIgnoreCase(name)) {
			mon(value);
			return;
		}
		if ($rc.equalsIgnoreCase(name)) {
			rc(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($mon.equalsIgnoreCase(name)) {
			mon(value);
			return;
		}
		if ($rc.equalsIgnoreCase(name)) {
			rc(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($mon.equalsIgnoreCase(name)) {
			mon(value);
			return;
		}
		if ($rc.equalsIgnoreCase(name)) {
			rc(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($mon.equalsIgnoreCase(name)) {
			mon(value);
			return;
		}
		if ($rc.equalsIgnoreCase(name)) {
			rc(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_ym_next.equalsIgnoreCase(name)) {
			ac_ym_next(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			jnl_grp_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($mon.equalsIgnoreCase(name)) {
			mon(value);
			return;
		}
		if ($rc.equalsIgnoreCase(name)) {
			rc(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($mon.equalsIgnoreCase(name)) {
			mon(value);
			return;
		}
		if ($rc.equalsIgnoreCase(name)) {
			rc(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($mon.equalsIgnoreCase(name)) {
			mon(value);
			return;
		}
		if ($rc.equalsIgnoreCase(name)) {
			rc(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($mon.equalsIgnoreCase(name)) {
			mon(value);
			return;
		}
		if ($rc.equalsIgnoreCase(name)) {
			rc(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($mon.equalsIgnoreCase(name)) {
			mon(value);
			return;
		}
		if ($rc.equalsIgnoreCase(name)) {
			rc(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_ym_next.equalsIgnoreCase(name)) {
			ac_ym_next(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

