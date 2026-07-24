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
 * ブロック"Alloc_Avl_Srch02_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Alloc_Avl_Srch02_CndR_MC_A extends MCConstRow {

	/**
	 * Calculation per distribution group flg. 物流グループ毎計算ＦＬＧ.<p>
	 *
	 */
	public static final String $lg_flg = "lg_flg";
	/**
	 * Zero exclusion flg. ゼロ除外ＦＬＧ.<p>
	 *
	 */
	public static final String $except_zero_flg = "except_zero_flg";
	/**
	 * Details calculation flg. 詳細計算ＦＬＧ.<p>
	 *
	 */
	public static final String $dtl_calc_flg = "dtl_calc_flg";
	/**
	 * Date to ignore surplus 余裕無視日付.<p>
	 *
	 */
	public static final String $ignore_margin_dt = "ignore_margin_dt";


	public static final MCMeta lg_flg_META = createCommonMeta($lg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta except_zero_flg_META = createCommonMeta($except_zero_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dtl_calc_flg_META = createCommonMeta($dtl_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ignore_margin_dt_META = createCommonMeta($ignore_margin_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Alloc_Avl_Srch02_CndR> constMetas = new ConstMetaList<Alloc_Avl_Srch02_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			lg_flg_META,
			except_zero_flg_META,
			dtl_calc_flg_META,
			ignore_margin_dt_META
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
	protected Alloc_Avl_Srch02_CndR_MC_A(ConstMetaList<? extends Alloc_Avl_Srch02_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_Avl_Srch02_CndR clone() {
		return (Alloc_Avl_Srch02_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_Avl_Srch02_CndR createInstance() {
		return (Alloc_Avl_Srch02_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Alloc_Avl_Srch02_CndR getValues(String... names) {
		return (Alloc_Avl_Srch02_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Calculation per distribution group flg. 物流グループ毎計算ＦＬＧ.<p>
	 *
	 */
	public boolean lg_flg() {
		return getConstBoolean(offset + 0, $lg_flg);
	}

	/**
	 * Calculation per distribution group flg. 物流グループ毎計算ＦＬＧ.<p>
	 *
	 */
	public void lg_flg(boolean value) {
		setConstBoolean(offset + 0, $lg_flg, value);
	}


	/**
	 * Zero exclusion flg. ゼロ除外ＦＬＧ.<p>
	 *
	 */
	public boolean except_zero_flg() {
		return getConstBoolean(offset + 1, $except_zero_flg);
	}

	/**
	 * Zero exclusion flg. ゼロ除外ＦＬＧ.<p>
	 *
	 */
	public void except_zero_flg(boolean value) {
		setConstBoolean(offset + 1, $except_zero_flg, value);
	}


	/**
	 * Details calculation flg. 詳細計算ＦＬＧ.<p>
	 *
	 */
	public boolean dtl_calc_flg() {
		return getConstBoolean(offset + 2, $dtl_calc_flg);
	}

	/**
	 * Details calculation flg. 詳細計算ＦＬＧ.<p>
	 *
	 */
	public void dtl_calc_flg(boolean value) {
		setConstBoolean(offset + 2, $dtl_calc_flg, value);
	}


	/**
	 * Date to ignore surplus 余裕無視日付.<p>
	 *
	 */
	public MCDate ignore_margin_dt() {
		return getConstDate(offset + 3, $ignore_margin_dt);
	}

	/**
	 * Date to ignore surplus 余裕無視日付.<p>
	 *
	 */
	public void ignore_margin_dt(MCDate value) {
		setConstDate(offset + 3, $ignore_margin_dt, value);
	}


	public MCDate getDate(String name) {
		if ($ignore_margin_dt.equalsIgnoreCase(name)) {
			return ignore_margin_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($lg_flg.equalsIgnoreCase(name)) {
			return lg_flg();
		}
		if ($except_zero_flg.equalsIgnoreCase(name)) {
			return except_zero_flg();
		}
		if ($dtl_calc_flg.equalsIgnoreCase(name)) {
			return dtl_calc_flg();
		}
		return super.getBoolean(name);
	}

	public MCDate getDateNE(String name) {
		if ($ignore_margin_dt.equalsIgnoreCase(name)) {
			return ignore_margin_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($lg_flg.equalsIgnoreCase(name)) {
			return lg_flg();
		}
		if ($except_zero_flg.equalsIgnoreCase(name)) {
			return except_zero_flg();
		}
		if ($dtl_calc_flg.equalsIgnoreCase(name)) {
			return dtl_calc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($ignore_margin_dt.equalsIgnoreCase(name)) {
			ignore_margin_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($lg_flg.equalsIgnoreCase(name)) {
			lg_flg(value);
			return;
		}
		if ($except_zero_flg.equalsIgnoreCase(name)) {
			except_zero_flg(value);
			return;
		}
		if ($dtl_calc_flg.equalsIgnoreCase(name)) {
			dtl_calc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ignore_margin_dt.equalsIgnoreCase(name)) {
			ignore_margin_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($lg_flg.equalsIgnoreCase(name)) {
			lg_flg(value);
			return;
		}
		if ($except_zero_flg.equalsIgnoreCase(name)) {
			except_zero_flg(value);
			return;
		}
		if ($dtl_calc_flg.equalsIgnoreCase(name)) {
			dtl_calc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

