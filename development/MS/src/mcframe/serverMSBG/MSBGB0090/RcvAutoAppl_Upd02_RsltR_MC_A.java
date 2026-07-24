package mcframe.serverMSBG.MSBGB0090;

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
 * ブロック"RcvAutoAppl_Upd02_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcvAutoAppl_Upd02_RsltR_MC_A extends MCConstRow {

	/**
	 * Total number of processes 全処理件数.<p>
	 *
	 */
	public static final String $total_cnt = "total_cnt";
	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public static final String $error_cnt = "error_cnt";
	/**
	 * Number of match amount completed 金額一致完了件数.<p>
	 *
	 */
	public static final String $cmpl_cnt = "cmpl_cnt";
	/**
	 * Number of completed with transfer fee 手数料込完了件数.<p>
	 *
	 */
	public static final String $cmpl_inc_comp_cnt = "cmpl_inc_comp_cnt";
	/**
	 * Number of Completed excess payment received 過入金完了件数.<p>
	 *
	 */
	public static final String $cmpl_over_cnt = "cmpl_over_cnt";
	/**
	 * Number of completed due to payment received amount deficit) 入金額不足完了件数.<p>
	 *
	 */
	public static final String $cmpl_short_cnt = "cmpl_short_cnt";
	/**
	 * Number of auto-reconciliation 自動消込件数.<p>
	 *
	 */
	public static final String $not_appl_cnt = "not_appl_cnt";


	public static final MCMeta total_cnt_META = createCommonMeta($total_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta error_cnt_META = createCommonMeta($error_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta cmpl_cnt_META = createCommonMeta($cmpl_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta cmpl_inc_comp_cnt_META = createCommonMeta($cmpl_inc_comp_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta cmpl_over_cnt_META = createCommonMeta($cmpl_over_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta cmpl_short_cnt_META = createCommonMeta($cmpl_short_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta not_appl_cnt_META = createCommonMeta($not_appl_cnt, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<RcvAutoAppl_Upd02_RsltR> constMetas = new ConstMetaList<RcvAutoAppl_Upd02_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			total_cnt_META,
			error_cnt_META,
			cmpl_cnt_META,
			cmpl_inc_comp_cnt_META,
			cmpl_over_cnt_META,
			cmpl_short_cnt_META,
			not_appl_cnt_META
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
	protected RcvAutoAppl_Upd02_RsltR_MC_A(ConstMetaList<? extends RcvAutoAppl_Upd02_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvAutoAppl_Upd02_RsltR clone() {
		return (RcvAutoAppl_Upd02_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvAutoAppl_Upd02_RsltR createInstance() {
		return (RcvAutoAppl_Upd02_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvAutoAppl_Upd02_RsltR getValues(String... names) {
		return (RcvAutoAppl_Upd02_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Total number of processes 全処理件数.<p>
	 *
	 */
	public MCNumber total_cnt() {
		return getConstNumber(offset + 0, $total_cnt);
	}

	/**
	 * Total number of processes 全処理件数.<p>
	 *
	 */
	public void total_cnt(MCNumber value) {
		setConstNumber(offset + 0, $total_cnt, value);
	}

	/**
	 * Total number of processes 全処理件数.<p>
	 *
	 */
	public void total_cnt(int value) {
		setConstNumber(offset + 0, $total_cnt, value);
	}

	/**
	 * Total number of processes 全処理件数.<p>
	 *
	 */
	public void total_cnt(long value) {
		setConstNumber(offset + 0, $total_cnt, value);
	}

	/**
	 * Total number of processes 全処理件数.<p>
	 *
	 */
	public void total_cnt(float value) {
		setConstNumber(offset + 0, $total_cnt, value);
	}

	/**
	 * Total number of processes 全処理件数.<p>
	 *
	 */
	public void total_cnt(double value) {
		setConstNumber(offset + 0, $total_cnt, value);
	}


	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public MCNumber error_cnt() {
		return getConstNumber(offset + 1, $error_cnt);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void error_cnt(MCNumber value) {
		setConstNumber(offset + 1, $error_cnt, value);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void error_cnt(int value) {
		setConstNumber(offset + 1, $error_cnt, value);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void error_cnt(long value) {
		setConstNumber(offset + 1, $error_cnt, value);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void error_cnt(float value) {
		setConstNumber(offset + 1, $error_cnt, value);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void error_cnt(double value) {
		setConstNumber(offset + 1, $error_cnt, value);
	}


	/**
	 * Number of match amount completed 金額一致完了件数.<p>
	 *
	 */
	public MCNumber cmpl_cnt() {
		return getConstNumber(offset + 2, $cmpl_cnt);
	}

	/**
	 * Number of match amount completed 金額一致完了件数.<p>
	 *
	 */
	public void cmpl_cnt(MCNumber value) {
		setConstNumber(offset + 2, $cmpl_cnt, value);
	}

	/**
	 * Number of match amount completed 金額一致完了件数.<p>
	 *
	 */
	public void cmpl_cnt(int value) {
		setConstNumber(offset + 2, $cmpl_cnt, value);
	}

	/**
	 * Number of match amount completed 金額一致完了件数.<p>
	 *
	 */
	public void cmpl_cnt(long value) {
		setConstNumber(offset + 2, $cmpl_cnt, value);
	}

	/**
	 * Number of match amount completed 金額一致完了件数.<p>
	 *
	 */
	public void cmpl_cnt(float value) {
		setConstNumber(offset + 2, $cmpl_cnt, value);
	}

	/**
	 * Number of match amount completed 金額一致完了件数.<p>
	 *
	 */
	public void cmpl_cnt(double value) {
		setConstNumber(offset + 2, $cmpl_cnt, value);
	}


	/**
	 * Number of completed with transfer fee 手数料込完了件数.<p>
	 *
	 */
	public MCNumber cmpl_inc_comp_cnt() {
		return getConstNumber(offset + 3, $cmpl_inc_comp_cnt);
	}

	/**
	 * Number of completed with transfer fee 手数料込完了件数.<p>
	 *
	 */
	public void cmpl_inc_comp_cnt(MCNumber value) {
		setConstNumber(offset + 3, $cmpl_inc_comp_cnt, value);
	}

	/**
	 * Number of completed with transfer fee 手数料込完了件数.<p>
	 *
	 */
	public void cmpl_inc_comp_cnt(int value) {
		setConstNumber(offset + 3, $cmpl_inc_comp_cnt, value);
	}

	/**
	 * Number of completed with transfer fee 手数料込完了件数.<p>
	 *
	 */
	public void cmpl_inc_comp_cnt(long value) {
		setConstNumber(offset + 3, $cmpl_inc_comp_cnt, value);
	}

	/**
	 * Number of completed with transfer fee 手数料込完了件数.<p>
	 *
	 */
	public void cmpl_inc_comp_cnt(float value) {
		setConstNumber(offset + 3, $cmpl_inc_comp_cnt, value);
	}

	/**
	 * Number of completed with transfer fee 手数料込完了件数.<p>
	 *
	 */
	public void cmpl_inc_comp_cnt(double value) {
		setConstNumber(offset + 3, $cmpl_inc_comp_cnt, value);
	}


	/**
	 * Number of Completed excess payment received 過入金完了件数.<p>
	 *
	 */
	public MCNumber cmpl_over_cnt() {
		return getConstNumber(offset + 4, $cmpl_over_cnt);
	}

	/**
	 * Number of Completed excess payment received 過入金完了件数.<p>
	 *
	 */
	public void cmpl_over_cnt(MCNumber value) {
		setConstNumber(offset + 4, $cmpl_over_cnt, value);
	}

	/**
	 * Number of Completed excess payment received 過入金完了件数.<p>
	 *
	 */
	public void cmpl_over_cnt(int value) {
		setConstNumber(offset + 4, $cmpl_over_cnt, value);
	}

	/**
	 * Number of Completed excess payment received 過入金完了件数.<p>
	 *
	 */
	public void cmpl_over_cnt(long value) {
		setConstNumber(offset + 4, $cmpl_over_cnt, value);
	}

	/**
	 * Number of Completed excess payment received 過入金完了件数.<p>
	 *
	 */
	public void cmpl_over_cnt(float value) {
		setConstNumber(offset + 4, $cmpl_over_cnt, value);
	}

	/**
	 * Number of Completed excess payment received 過入金完了件数.<p>
	 *
	 */
	public void cmpl_over_cnt(double value) {
		setConstNumber(offset + 4, $cmpl_over_cnt, value);
	}


	/**
	 * Number of completed due to payment received amount deficit) 入金額不足完了件数.<p>
	 *
	 */
	public MCNumber cmpl_short_cnt() {
		return getConstNumber(offset + 5, $cmpl_short_cnt);
	}

	/**
	 * Number of completed due to payment received amount deficit) 入金額不足完了件数.<p>
	 *
	 */
	public void cmpl_short_cnt(MCNumber value) {
		setConstNumber(offset + 5, $cmpl_short_cnt, value);
	}

	/**
	 * Number of completed due to payment received amount deficit) 入金額不足完了件数.<p>
	 *
	 */
	public void cmpl_short_cnt(int value) {
		setConstNumber(offset + 5, $cmpl_short_cnt, value);
	}

	/**
	 * Number of completed due to payment received amount deficit) 入金額不足完了件数.<p>
	 *
	 */
	public void cmpl_short_cnt(long value) {
		setConstNumber(offset + 5, $cmpl_short_cnt, value);
	}

	/**
	 * Number of completed due to payment received amount deficit) 入金額不足完了件数.<p>
	 *
	 */
	public void cmpl_short_cnt(float value) {
		setConstNumber(offset + 5, $cmpl_short_cnt, value);
	}

	/**
	 * Number of completed due to payment received amount deficit) 入金額不足完了件数.<p>
	 *
	 */
	public void cmpl_short_cnt(double value) {
		setConstNumber(offset + 5, $cmpl_short_cnt, value);
	}


	/**
	 * Number of auto-reconciliation 自動消込件数.<p>
	 *
	 */
	public MCNumber not_appl_cnt() {
		return getConstNumber(offset + 6, $not_appl_cnt);
	}

	/**
	 * Number of auto-reconciliation 自動消込件数.<p>
	 *
	 */
	public void not_appl_cnt(MCNumber value) {
		setConstNumber(offset + 6, $not_appl_cnt, value);
	}

	/**
	 * Number of auto-reconciliation 自動消込件数.<p>
	 *
	 */
	public void not_appl_cnt(int value) {
		setConstNumber(offset + 6, $not_appl_cnt, value);
	}

	/**
	 * Number of auto-reconciliation 自動消込件数.<p>
	 *
	 */
	public void not_appl_cnt(long value) {
		setConstNumber(offset + 6, $not_appl_cnt, value);
	}

	/**
	 * Number of auto-reconciliation 自動消込件数.<p>
	 *
	 */
	public void not_appl_cnt(float value) {
		setConstNumber(offset + 6, $not_appl_cnt, value);
	}

	/**
	 * Number of auto-reconciliation 自動消込件数.<p>
	 *
	 */
	public void not_appl_cnt(double value) {
		setConstNumber(offset + 6, $not_appl_cnt, value);
	}


	public MCNumber getNumber(String name) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			return total_cnt();
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			return error_cnt();
		}
		if ($cmpl_cnt.equalsIgnoreCase(name)) {
			return cmpl_cnt();
		}
		if ($cmpl_inc_comp_cnt.equalsIgnoreCase(name)) {
			return cmpl_inc_comp_cnt();
		}
		if ($cmpl_over_cnt.equalsIgnoreCase(name)) {
			return cmpl_over_cnt();
		}
		if ($cmpl_short_cnt.equalsIgnoreCase(name)) {
			return cmpl_short_cnt();
		}
		if ($not_appl_cnt.equalsIgnoreCase(name)) {
			return not_appl_cnt();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			return total_cnt();
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			return error_cnt();
		}
		if ($cmpl_cnt.equalsIgnoreCase(name)) {
			return cmpl_cnt();
		}
		if ($cmpl_inc_comp_cnt.equalsIgnoreCase(name)) {
			return cmpl_inc_comp_cnt();
		}
		if ($cmpl_over_cnt.equalsIgnoreCase(name)) {
			return cmpl_over_cnt();
		}
		if ($cmpl_short_cnt.equalsIgnoreCase(name)) {
			return cmpl_short_cnt();
		}
		if ($not_appl_cnt.equalsIgnoreCase(name)) {
			return not_appl_cnt();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		if ($cmpl_cnt.equalsIgnoreCase(name)) {
			cmpl_cnt(value);
			return;
		}
		if ($cmpl_inc_comp_cnt.equalsIgnoreCase(name)) {
			cmpl_inc_comp_cnt(value);
			return;
		}
		if ($cmpl_over_cnt.equalsIgnoreCase(name)) {
			cmpl_over_cnt(value);
			return;
		}
		if ($cmpl_short_cnt.equalsIgnoreCase(name)) {
			cmpl_short_cnt(value);
			return;
		}
		if ($not_appl_cnt.equalsIgnoreCase(name)) {
			not_appl_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		if ($cmpl_cnt.equalsIgnoreCase(name)) {
			cmpl_cnt(value);
			return;
		}
		if ($cmpl_inc_comp_cnt.equalsIgnoreCase(name)) {
			cmpl_inc_comp_cnt(value);
			return;
		}
		if ($cmpl_over_cnt.equalsIgnoreCase(name)) {
			cmpl_over_cnt(value);
			return;
		}
		if ($cmpl_short_cnt.equalsIgnoreCase(name)) {
			cmpl_short_cnt(value);
			return;
		}
		if ($not_appl_cnt.equalsIgnoreCase(name)) {
			not_appl_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		if ($cmpl_cnt.equalsIgnoreCase(name)) {
			cmpl_cnt(value);
			return;
		}
		if ($cmpl_inc_comp_cnt.equalsIgnoreCase(name)) {
			cmpl_inc_comp_cnt(value);
			return;
		}
		if ($cmpl_over_cnt.equalsIgnoreCase(name)) {
			cmpl_over_cnt(value);
			return;
		}
		if ($cmpl_short_cnt.equalsIgnoreCase(name)) {
			cmpl_short_cnt(value);
			return;
		}
		if ($not_appl_cnt.equalsIgnoreCase(name)) {
			not_appl_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		if ($cmpl_cnt.equalsIgnoreCase(name)) {
			cmpl_cnt(value);
			return;
		}
		if ($cmpl_inc_comp_cnt.equalsIgnoreCase(name)) {
			cmpl_inc_comp_cnt(value);
			return;
		}
		if ($cmpl_over_cnt.equalsIgnoreCase(name)) {
			cmpl_over_cnt(value);
			return;
		}
		if ($cmpl_short_cnt.equalsIgnoreCase(name)) {
			cmpl_short_cnt(value);
			return;
		}
		if ($not_appl_cnt.equalsIgnoreCase(name)) {
			not_appl_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		if ($cmpl_cnt.equalsIgnoreCase(name)) {
			cmpl_cnt(value);
			return;
		}
		if ($cmpl_inc_comp_cnt.equalsIgnoreCase(name)) {
			cmpl_inc_comp_cnt(value);
			return;
		}
		if ($cmpl_over_cnt.equalsIgnoreCase(name)) {
			cmpl_over_cnt(value);
			return;
		}
		if ($cmpl_short_cnt.equalsIgnoreCase(name)) {
			cmpl_short_cnt(value);
			return;
		}
		if ($not_appl_cnt.equalsIgnoreCase(name)) {
			not_appl_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		if ($cmpl_cnt.equalsIgnoreCase(name)) {
			cmpl_cnt(value);
			return;
		}
		if ($cmpl_inc_comp_cnt.equalsIgnoreCase(name)) {
			cmpl_inc_comp_cnt(value);
			return;
		}
		if ($cmpl_over_cnt.equalsIgnoreCase(name)) {
			cmpl_over_cnt(value);
			return;
		}
		if ($cmpl_short_cnt.equalsIgnoreCase(name)) {
			cmpl_short_cnt(value);
			return;
		}
		if ($not_appl_cnt.equalsIgnoreCase(name)) {
			not_appl_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		if ($cmpl_cnt.equalsIgnoreCase(name)) {
			cmpl_cnt(value);
			return;
		}
		if ($cmpl_inc_comp_cnt.equalsIgnoreCase(name)) {
			cmpl_inc_comp_cnt(value);
			return;
		}
		if ($cmpl_over_cnt.equalsIgnoreCase(name)) {
			cmpl_over_cnt(value);
			return;
		}
		if ($cmpl_short_cnt.equalsIgnoreCase(name)) {
			cmpl_short_cnt(value);
			return;
		}
		if ($not_appl_cnt.equalsIgnoreCase(name)) {
			not_appl_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		if ($cmpl_cnt.equalsIgnoreCase(name)) {
			cmpl_cnt(value);
			return;
		}
		if ($cmpl_inc_comp_cnt.equalsIgnoreCase(name)) {
			cmpl_inc_comp_cnt(value);
			return;
		}
		if ($cmpl_over_cnt.equalsIgnoreCase(name)) {
			cmpl_over_cnt(value);
			return;
		}
		if ($cmpl_short_cnt.equalsIgnoreCase(name)) {
			cmpl_short_cnt(value);
			return;
		}
		if ($not_appl_cnt.equalsIgnoreCase(name)) {
			not_appl_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		if ($cmpl_cnt.equalsIgnoreCase(name)) {
			cmpl_cnt(value);
			return;
		}
		if ($cmpl_inc_comp_cnt.equalsIgnoreCase(name)) {
			cmpl_inc_comp_cnt(value);
			return;
		}
		if ($cmpl_over_cnt.equalsIgnoreCase(name)) {
			cmpl_over_cnt(value);
			return;
		}
		if ($cmpl_short_cnt.equalsIgnoreCase(name)) {
			cmpl_short_cnt(value);
			return;
		}
		if ($not_appl_cnt.equalsIgnoreCase(name)) {
			not_appl_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		if ($cmpl_cnt.equalsIgnoreCase(name)) {
			cmpl_cnt(value);
			return;
		}
		if ($cmpl_inc_comp_cnt.equalsIgnoreCase(name)) {
			cmpl_inc_comp_cnt(value);
			return;
		}
		if ($cmpl_over_cnt.equalsIgnoreCase(name)) {
			cmpl_over_cnt(value);
			return;
		}
		if ($cmpl_short_cnt.equalsIgnoreCase(name)) {
			cmpl_short_cnt(value);
			return;
		}
		if ($not_appl_cnt.equalsIgnoreCase(name)) {
			not_appl_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

