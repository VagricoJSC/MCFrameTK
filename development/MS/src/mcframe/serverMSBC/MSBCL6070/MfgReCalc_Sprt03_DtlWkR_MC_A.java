package mcframe.serverMSBC.MSBCL6070;

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
 * ブロック"MfgReCalc_Sprt03_DtlWk"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgReCalc_Sprt03_DtlWkR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public static final String $oper_peg_no = "oper_peg_no";
	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public static final String $wk_schd_no = "wk_schd_no";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Start man-hour before update (Constant) 更新前着手工数（固定）.<p>
	 *
	 */
	public static final String $old_st_fxd_wk_cost = "old_st_fxd_wk_cost";
	/**
	 * Start man-hour before update (Qty.-dependent) 更新前着手工数（数量依存）.<p>
	 *
	 */
	public static final String $old_st_wk_cost = "old_st_wk_cost";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Number of started man-hours (Constant) 着手工数（固定）.<p>
	 *
	 */
	public static final String $st_fxd_wk_cost = "st_fxd_wk_cost";
	/**
	 * Number of started man-hours (Qty.-dependent) 着手工数（数量依存）.<p>
	 *
	 */
	public static final String $st_wk_cost = "st_wk_cost";
	/**
	 * Number of started man-hours (Total) 着手工数（合計）.<p>
	 *
	 */
	public static final String $st_sum_wk_cost = "st_sum_wk_cost";


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wk_schd_no_META = createCommonMeta($wk_schd_no, mcframe.commonMA.meta.MA_META.WK_SCHD_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta old_st_fxd_wk_cost_META = createCommonMeta($old_st_fxd_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta old_st_wk_cost_META = createCommonMeta($old_st_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta st_fxd_wk_cost_META = createCommonMeta($st_fxd_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta st_wk_cost_META = createCommonMeta($st_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta st_sum_wk_cost_META = createCommonMeta($st_sum_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);

	protected static final ConstMetaList<MfgReCalc_Sprt03_DtlWkR> constMetas = new ConstMetaList<MfgReCalc_Sprt03_DtlWkR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			oper_peg_no_META,
			peg_no_META,
			wk_schd_no_META,
			div_seq_META,
			old_st_fxd_wk_cost_META,
			old_st_wk_cost_META,
			dec_place_META,
			st_fxd_wk_cost_META,
			st_wk_cost_META,
			st_sum_wk_cost_META
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
	protected MfgReCalc_Sprt03_DtlWkR_MC_A(ConstMetaList<? extends MfgReCalc_Sprt03_DtlWkR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt03_DtlWkR clone() {
		return (MfgReCalc_Sprt03_DtlWkR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt03_DtlWkR createInstance() {
		return (MfgReCalc_Sprt03_DtlWkR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt03_DtlWkR getValues(String... names) {
		return (MfgReCalc_Sprt03_DtlWkR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 1, $oper_peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(int value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(long value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(float value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(double value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}


	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 2, $peg_no);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 2, $peg_no, value);
	}


	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public String wk_schd_no() {
		return getConstString(offset + 3, $wk_schd_no);
	}

	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public void wk_schd_no(String value) {
		setConstString(offset + 3, $wk_schd_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 4, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 4, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 4, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 4, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 4, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 4, $div_seq, value);
	}


	/**
	 * Start man-hour before update (Constant) 更新前着手工数（固定）.<p>
	 *
	 */
	public MCNumber old_st_fxd_wk_cost() {
		return getConstNumber(offset + 5, $old_st_fxd_wk_cost);
	}

	/**
	 * Start man-hour before update (Constant) 更新前着手工数（固定）.<p>
	 *
	 */
	public void old_st_fxd_wk_cost(MCNumber value) {
		setConstNumber(offset + 5, $old_st_fxd_wk_cost, value);
	}

	/**
	 * Start man-hour before update (Constant) 更新前着手工数（固定）.<p>
	 *
	 */
	public void old_st_fxd_wk_cost(int value) {
		setConstNumber(offset + 5, $old_st_fxd_wk_cost, value);
	}

	/**
	 * Start man-hour before update (Constant) 更新前着手工数（固定）.<p>
	 *
	 */
	public void old_st_fxd_wk_cost(long value) {
		setConstNumber(offset + 5, $old_st_fxd_wk_cost, value);
	}

	/**
	 * Start man-hour before update (Constant) 更新前着手工数（固定）.<p>
	 *
	 */
	public void old_st_fxd_wk_cost(float value) {
		setConstNumber(offset + 5, $old_st_fxd_wk_cost, value);
	}

	/**
	 * Start man-hour before update (Constant) 更新前着手工数（固定）.<p>
	 *
	 */
	public void old_st_fxd_wk_cost(double value) {
		setConstNumber(offset + 5, $old_st_fxd_wk_cost, value);
	}


	/**
	 * Start man-hour before update (Qty.-dependent) 更新前着手工数（数量依存）.<p>
	 *
	 */
	public MCNumber old_st_wk_cost() {
		return getConstNumber(offset + 6, $old_st_wk_cost);
	}

	/**
	 * Start man-hour before update (Qty.-dependent) 更新前着手工数（数量依存）.<p>
	 *
	 */
	public void old_st_wk_cost(MCNumber value) {
		setConstNumber(offset + 6, $old_st_wk_cost, value);
	}

	/**
	 * Start man-hour before update (Qty.-dependent) 更新前着手工数（数量依存）.<p>
	 *
	 */
	public void old_st_wk_cost(int value) {
		setConstNumber(offset + 6, $old_st_wk_cost, value);
	}

	/**
	 * Start man-hour before update (Qty.-dependent) 更新前着手工数（数量依存）.<p>
	 *
	 */
	public void old_st_wk_cost(long value) {
		setConstNumber(offset + 6, $old_st_wk_cost, value);
	}

	/**
	 * Start man-hour before update (Qty.-dependent) 更新前着手工数（数量依存）.<p>
	 *
	 */
	public void old_st_wk_cost(float value) {
		setConstNumber(offset + 6, $old_st_wk_cost, value);
	}

	/**
	 * Start man-hour before update (Qty.-dependent) 更新前着手工数（数量依存）.<p>
	 *
	 */
	public void old_st_wk_cost(double value) {
		setConstNumber(offset + 6, $old_st_wk_cost, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 7, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 7, $dec_place, value);
	}


	/**
	 * Number of started man-hours (Constant) 着手工数（固定）.<p>
	 *
	 */
	public MCNumber st_fxd_wk_cost() {
		return getConstNumber(offset + 8, $st_fxd_wk_cost);
	}

	/**
	 * Number of started man-hours (Constant) 着手工数（固定）.<p>
	 *
	 */
	public void st_fxd_wk_cost(MCNumber value) {
		setConstNumber(offset + 8, $st_fxd_wk_cost, value);
	}

	/**
	 * Number of started man-hours (Constant) 着手工数（固定）.<p>
	 *
	 */
	public void st_fxd_wk_cost(int value) {
		setConstNumber(offset + 8, $st_fxd_wk_cost, value);
	}

	/**
	 * Number of started man-hours (Constant) 着手工数（固定）.<p>
	 *
	 */
	public void st_fxd_wk_cost(long value) {
		setConstNumber(offset + 8, $st_fxd_wk_cost, value);
	}

	/**
	 * Number of started man-hours (Constant) 着手工数（固定）.<p>
	 *
	 */
	public void st_fxd_wk_cost(float value) {
		setConstNumber(offset + 8, $st_fxd_wk_cost, value);
	}

	/**
	 * Number of started man-hours (Constant) 着手工数（固定）.<p>
	 *
	 */
	public void st_fxd_wk_cost(double value) {
		setConstNumber(offset + 8, $st_fxd_wk_cost, value);
	}


	/**
	 * Number of started man-hours (Qty.-dependent) 着手工数（数量依存）.<p>
	 *
	 */
	public MCNumber st_wk_cost() {
		return getConstNumber(offset + 9, $st_wk_cost);
	}

	/**
	 * Number of started man-hours (Qty.-dependent) 着手工数（数量依存）.<p>
	 *
	 */
	public void st_wk_cost(MCNumber value) {
		setConstNumber(offset + 9, $st_wk_cost, value);
	}

	/**
	 * Number of started man-hours (Qty.-dependent) 着手工数（数量依存）.<p>
	 *
	 */
	public void st_wk_cost(int value) {
		setConstNumber(offset + 9, $st_wk_cost, value);
	}

	/**
	 * Number of started man-hours (Qty.-dependent) 着手工数（数量依存）.<p>
	 *
	 */
	public void st_wk_cost(long value) {
		setConstNumber(offset + 9, $st_wk_cost, value);
	}

	/**
	 * Number of started man-hours (Qty.-dependent) 着手工数（数量依存）.<p>
	 *
	 */
	public void st_wk_cost(float value) {
		setConstNumber(offset + 9, $st_wk_cost, value);
	}

	/**
	 * Number of started man-hours (Qty.-dependent) 着手工数（数量依存）.<p>
	 *
	 */
	public void st_wk_cost(double value) {
		setConstNumber(offset + 9, $st_wk_cost, value);
	}


	/**
	 * Number of started man-hours (Total) 着手工数（合計）.<p>
	 *
	 */
	public MCNumber st_sum_wk_cost() {
		return getConstNumber(offset + 10, $st_sum_wk_cost);
	}

	/**
	 * Number of started man-hours (Total) 着手工数（合計）.<p>
	 *
	 */
	public void st_sum_wk_cost(MCNumber value) {
		setConstNumber(offset + 10, $st_sum_wk_cost, value);
	}

	/**
	 * Number of started man-hours (Total) 着手工数（合計）.<p>
	 *
	 */
	public void st_sum_wk_cost(int value) {
		setConstNumber(offset + 10, $st_sum_wk_cost, value);
	}

	/**
	 * Number of started man-hours (Total) 着手工数（合計）.<p>
	 *
	 */
	public void st_sum_wk_cost(long value) {
		setConstNumber(offset + 10, $st_sum_wk_cost, value);
	}

	/**
	 * Number of started man-hours (Total) 着手工数（合計）.<p>
	 *
	 */
	public void st_sum_wk_cost(float value) {
		setConstNumber(offset + 10, $st_sum_wk_cost, value);
	}

	/**
	 * Number of started man-hours (Total) 着手工数（合計）.<p>
	 *
	 */
	public void st_sum_wk_cost(double value) {
		setConstNumber(offset + 10, $st_sum_wk_cost, value);
	}


	public String getString(String name) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($old_st_fxd_wk_cost.equalsIgnoreCase(name)) {
			return old_st_fxd_wk_cost();
		}
		if ($old_st_wk_cost.equalsIgnoreCase(name)) {
			return old_st_wk_cost();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($st_fxd_wk_cost.equalsIgnoreCase(name)) {
			return st_fxd_wk_cost();
		}
		if ($st_wk_cost.equalsIgnoreCase(name)) {
			return st_wk_cost();
		}
		if ($st_sum_wk_cost.equalsIgnoreCase(name)) {
			return st_sum_wk_cost();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($old_st_fxd_wk_cost.equalsIgnoreCase(name)) {
			return old_st_fxd_wk_cost();
		}
		if ($old_st_wk_cost.equalsIgnoreCase(name)) {
			return old_st_wk_cost();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($st_fxd_wk_cost.equalsIgnoreCase(name)) {
			return st_fxd_wk_cost();
		}
		if ($st_wk_cost.equalsIgnoreCase(name)) {
			return st_wk_cost();
		}
		if ($st_sum_wk_cost.equalsIgnoreCase(name)) {
			return st_sum_wk_cost();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_st_fxd_wk_cost.equalsIgnoreCase(name)) {
			old_st_fxd_wk_cost(value);
			return;
		}
		if ($old_st_wk_cost.equalsIgnoreCase(name)) {
			old_st_wk_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_wk_cost.equalsIgnoreCase(name)) {
			st_fxd_wk_cost(value);
			return;
		}
		if ($st_wk_cost.equalsIgnoreCase(name)) {
			st_wk_cost(value);
			return;
		}
		if ($st_sum_wk_cost.equalsIgnoreCase(name)) {
			st_sum_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_st_fxd_wk_cost.equalsIgnoreCase(name)) {
			old_st_fxd_wk_cost(value);
			return;
		}
		if ($old_st_wk_cost.equalsIgnoreCase(name)) {
			old_st_wk_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_wk_cost.equalsIgnoreCase(name)) {
			st_fxd_wk_cost(value);
			return;
		}
		if ($st_wk_cost.equalsIgnoreCase(name)) {
			st_wk_cost(value);
			return;
		}
		if ($st_sum_wk_cost.equalsIgnoreCase(name)) {
			st_sum_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_st_fxd_wk_cost.equalsIgnoreCase(name)) {
			old_st_fxd_wk_cost(value);
			return;
		}
		if ($old_st_wk_cost.equalsIgnoreCase(name)) {
			old_st_wk_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_wk_cost.equalsIgnoreCase(name)) {
			st_fxd_wk_cost(value);
			return;
		}
		if ($st_wk_cost.equalsIgnoreCase(name)) {
			st_wk_cost(value);
			return;
		}
		if ($st_sum_wk_cost.equalsIgnoreCase(name)) {
			st_sum_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_st_fxd_wk_cost.equalsIgnoreCase(name)) {
			old_st_fxd_wk_cost(value);
			return;
		}
		if ($old_st_wk_cost.equalsIgnoreCase(name)) {
			old_st_wk_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_wk_cost.equalsIgnoreCase(name)) {
			st_fxd_wk_cost(value);
			return;
		}
		if ($st_wk_cost.equalsIgnoreCase(name)) {
			st_wk_cost(value);
			return;
		}
		if ($st_sum_wk_cost.equalsIgnoreCase(name)) {
			st_sum_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_st_fxd_wk_cost.equalsIgnoreCase(name)) {
			old_st_fxd_wk_cost(value);
			return;
		}
		if ($old_st_wk_cost.equalsIgnoreCase(name)) {
			old_st_wk_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_wk_cost.equalsIgnoreCase(name)) {
			st_fxd_wk_cost(value);
			return;
		}
		if ($st_wk_cost.equalsIgnoreCase(name)) {
			st_wk_cost(value);
			return;
		}
		if ($st_sum_wk_cost.equalsIgnoreCase(name)) {
			st_sum_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_st_fxd_wk_cost.equalsIgnoreCase(name)) {
			old_st_fxd_wk_cost(value);
			return;
		}
		if ($old_st_wk_cost.equalsIgnoreCase(name)) {
			old_st_wk_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_wk_cost.equalsIgnoreCase(name)) {
			st_fxd_wk_cost(value);
			return;
		}
		if ($st_wk_cost.equalsIgnoreCase(name)) {
			st_wk_cost(value);
			return;
		}
		if ($st_sum_wk_cost.equalsIgnoreCase(name)) {
			st_sum_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_st_fxd_wk_cost.equalsIgnoreCase(name)) {
			old_st_fxd_wk_cost(value);
			return;
		}
		if ($old_st_wk_cost.equalsIgnoreCase(name)) {
			old_st_wk_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_wk_cost.equalsIgnoreCase(name)) {
			st_fxd_wk_cost(value);
			return;
		}
		if ($st_wk_cost.equalsIgnoreCase(name)) {
			st_wk_cost(value);
			return;
		}
		if ($st_sum_wk_cost.equalsIgnoreCase(name)) {
			st_sum_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_st_fxd_wk_cost.equalsIgnoreCase(name)) {
			old_st_fxd_wk_cost(value);
			return;
		}
		if ($old_st_wk_cost.equalsIgnoreCase(name)) {
			old_st_wk_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_wk_cost.equalsIgnoreCase(name)) {
			st_fxd_wk_cost(value);
			return;
		}
		if ($st_wk_cost.equalsIgnoreCase(name)) {
			st_wk_cost(value);
			return;
		}
		if ($st_sum_wk_cost.equalsIgnoreCase(name)) {
			st_sum_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_st_fxd_wk_cost.equalsIgnoreCase(name)) {
			old_st_fxd_wk_cost(value);
			return;
		}
		if ($old_st_wk_cost.equalsIgnoreCase(name)) {
			old_st_wk_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_wk_cost.equalsIgnoreCase(name)) {
			st_fxd_wk_cost(value);
			return;
		}
		if ($st_wk_cost.equalsIgnoreCase(name)) {
			st_wk_cost(value);
			return;
		}
		if ($st_sum_wk_cost.equalsIgnoreCase(name)) {
			st_sum_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_st_fxd_wk_cost.equalsIgnoreCase(name)) {
			old_st_fxd_wk_cost(value);
			return;
		}
		if ($old_st_wk_cost.equalsIgnoreCase(name)) {
			old_st_wk_cost(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($st_fxd_wk_cost.equalsIgnoreCase(name)) {
			st_fxd_wk_cost(value);
			return;
		}
		if ($st_wk_cost.equalsIgnoreCase(name)) {
			st_wk_cost(value);
			return;
		}
		if ($st_sum_wk_cost.equalsIgnoreCase(name)) {
			st_sum_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

