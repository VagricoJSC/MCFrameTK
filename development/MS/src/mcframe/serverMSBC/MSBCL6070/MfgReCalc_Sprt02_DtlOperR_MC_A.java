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
 * ブロック"MfgReCalc_Sprt02_DtlOper"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgReCalc_Sprt02_DtlOperR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Actual operation start date and time 工程着手実績日時.<p>
	 *
	 */
	public static final String $st_act_tm = "st_act_tm";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public static final String $base_unit_st_qty = "base_unit_st_qty";
	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public static final String $base_unit_act_qty = "base_unit_act_qty";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Numerator for calculation (Operation) 計算用分子（工程）.<p>
	 *
	 */
	public static final String $oper_numerator = "oper_numerator";
	/**
	 * Denominator for calculation (Operation) 計算用分母（工程）.<p>
	 *
	 */
	public static final String $oper_denominator = "oper_denominator";
	/**
	 * Numerator for calculation (Output) 計算用分子（出来高）.<p>
	 *
	 */
	public static final String $yield_numerator = "yield_numerator";
	/**
	 * Denominator for calculation (Output) 計算用分母（出来高）.<p>
	 *
	 */
	public static final String $yield_denominator = "yield_denominator";
	/**
	 * Same operation order allocation ratio 同一工程指図割当比率.<p>
	 *
	 */
	public static final String $prop_col = "prop_col";
	public static final String $yield_oper_flg = "yield_oper_flg";


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta st_act_tm_META = createCommonMeta($st_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta base_unit_st_qty_META = createCommonMeta($base_unit_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_act_qty_META = createCommonMeta($base_unit_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta oper_numerator_META = createNumberMeta($oper_numerator);
	public static final MCMeta oper_denominator_META = createNumberMeta($oper_denominator);
	public static final MCMeta yield_numerator_META = createNumberMeta($yield_numerator);
	public static final MCMeta yield_denominator_META = createNumberMeta($yield_denominator);
	public static final MCMeta prop_col_META = createNumberMeta($prop_col);
	public static final MCMeta yield_oper_flg_META = createCommonMeta($yield_oper_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MfgReCalc_Sprt02_DtlOperR> constMetas = new ConstMetaList<MfgReCalc_Sprt02_DtlOperR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			peg_no_META,
			oper_inst_no_META,
			st_act_tm_META,
			oper_act_no_META,
			base_unit_st_qty_META,
			base_unit_act_qty_META,
			mfg_inst_no_META,
			div_seq_META,
			oper_numerator_META,
			oper_denominator_META,
			yield_numerator_META,
			yield_denominator_META,
			prop_col_META,
			yield_oper_flg_META
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
	protected MfgReCalc_Sprt02_DtlOperR_MC_A(ConstMetaList<? extends MfgReCalc_Sprt02_DtlOperR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt02_DtlOperR clone() {
		return (MfgReCalc_Sprt02_DtlOperR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt02_DtlOperR createInstance() {
		return (MfgReCalc_Sprt02_DtlOperR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt02_DtlOperR getValues(String... names) {
		return (MfgReCalc_Sprt02_DtlOperR) super.getValues(names);
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
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 2, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 2, $oper_inst_no, value);
	}


	/**
	 * Actual operation start date and time 工程着手実績日時.<p>
	 *
	 */
	public MCDate st_act_tm() {
		return getConstDate(offset + 3, $st_act_tm);
	}

	/**
	 * Actual operation start date and time 工程着手実績日時.<p>
	 *
	 */
	public void st_act_tm(MCDate value) {
		setConstDate(offset + 3, $st_act_tm, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 4, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 4, $oper_act_no, value);
	}


	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public MCNumber base_unit_st_qty() {
		return getConstNumber(offset + 5, $base_unit_st_qty);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(MCNumber value) {
		setConstNumber(offset + 5, $base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(int value) {
		setConstNumber(offset + 5, $base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(long value) {
		setConstNumber(offset + 5, $base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(float value) {
		setConstNumber(offset + 5, $base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(double value) {
		setConstNumber(offset + 5, $base_unit_st_qty, value);
	}


	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public MCNumber base_unit_act_qty() {
		return getConstNumber(offset + 6, $base_unit_act_qty);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(MCNumber value) {
		setConstNumber(offset + 6, $base_unit_act_qty, value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(int value) {
		setConstNumber(offset + 6, $base_unit_act_qty, value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(long value) {
		setConstNumber(offset + 6, $base_unit_act_qty, value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(float value) {
		setConstNumber(offset + 6, $base_unit_act_qty, value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(double value) {
		setConstNumber(offset + 6, $base_unit_act_qty, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 7, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 7, $mfg_inst_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 8, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 8, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 8, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 8, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 8, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 8, $div_seq, value);
	}


	/**
	 * Numerator for calculation (Operation) 計算用分子（工程）.<p>
	 *
	 */
	public MCNumber oper_numerator() {
		return getConstNumber(offset + 9, $oper_numerator);
	}

	/**
	 * Numerator for calculation (Operation) 計算用分子（工程）.<p>
	 *
	 */
	public void oper_numerator(MCNumber value) {
		setConstNumber(offset + 9, $oper_numerator, value);
	}

	/**
	 * Numerator for calculation (Operation) 計算用分子（工程）.<p>
	 *
	 */
	public void oper_numerator(int value) {
		setConstNumber(offset + 9, $oper_numerator, value);
	}

	/**
	 * Numerator for calculation (Operation) 計算用分子（工程）.<p>
	 *
	 */
	public void oper_numerator(long value) {
		setConstNumber(offset + 9, $oper_numerator, value);
	}

	/**
	 * Numerator for calculation (Operation) 計算用分子（工程）.<p>
	 *
	 */
	public void oper_numerator(float value) {
		setConstNumber(offset + 9, $oper_numerator, value);
	}

	/**
	 * Numerator for calculation (Operation) 計算用分子（工程）.<p>
	 *
	 */
	public void oper_numerator(double value) {
		setConstNumber(offset + 9, $oper_numerator, value);
	}


	/**
	 * Denominator for calculation (Operation) 計算用分母（工程）.<p>
	 *
	 */
	public MCNumber oper_denominator() {
		return getConstNumber(offset + 10, $oper_denominator);
	}

	/**
	 * Denominator for calculation (Operation) 計算用分母（工程）.<p>
	 *
	 */
	public void oper_denominator(MCNumber value) {
		setConstNumber(offset + 10, $oper_denominator, value);
	}

	/**
	 * Denominator for calculation (Operation) 計算用分母（工程）.<p>
	 *
	 */
	public void oper_denominator(int value) {
		setConstNumber(offset + 10, $oper_denominator, value);
	}

	/**
	 * Denominator for calculation (Operation) 計算用分母（工程）.<p>
	 *
	 */
	public void oper_denominator(long value) {
		setConstNumber(offset + 10, $oper_denominator, value);
	}

	/**
	 * Denominator for calculation (Operation) 計算用分母（工程）.<p>
	 *
	 */
	public void oper_denominator(float value) {
		setConstNumber(offset + 10, $oper_denominator, value);
	}

	/**
	 * Denominator for calculation (Operation) 計算用分母（工程）.<p>
	 *
	 */
	public void oper_denominator(double value) {
		setConstNumber(offset + 10, $oper_denominator, value);
	}


	/**
	 * Numerator for calculation (Output) 計算用分子（出来高）.<p>
	 *
	 */
	public MCNumber yield_numerator() {
		return getConstNumber(offset + 11, $yield_numerator);
	}

	/**
	 * Numerator for calculation (Output) 計算用分子（出来高）.<p>
	 *
	 */
	public void yield_numerator(MCNumber value) {
		setConstNumber(offset + 11, $yield_numerator, value);
	}

	/**
	 * Numerator for calculation (Output) 計算用分子（出来高）.<p>
	 *
	 */
	public void yield_numerator(int value) {
		setConstNumber(offset + 11, $yield_numerator, value);
	}

	/**
	 * Numerator for calculation (Output) 計算用分子（出来高）.<p>
	 *
	 */
	public void yield_numerator(long value) {
		setConstNumber(offset + 11, $yield_numerator, value);
	}

	/**
	 * Numerator for calculation (Output) 計算用分子（出来高）.<p>
	 *
	 */
	public void yield_numerator(float value) {
		setConstNumber(offset + 11, $yield_numerator, value);
	}

	/**
	 * Numerator for calculation (Output) 計算用分子（出来高）.<p>
	 *
	 */
	public void yield_numerator(double value) {
		setConstNumber(offset + 11, $yield_numerator, value);
	}


	/**
	 * Denominator for calculation (Output) 計算用分母（出来高）.<p>
	 *
	 */
	public MCNumber yield_denominator() {
		return getConstNumber(offset + 12, $yield_denominator);
	}

	/**
	 * Denominator for calculation (Output) 計算用分母（出来高）.<p>
	 *
	 */
	public void yield_denominator(MCNumber value) {
		setConstNumber(offset + 12, $yield_denominator, value);
	}

	/**
	 * Denominator for calculation (Output) 計算用分母（出来高）.<p>
	 *
	 */
	public void yield_denominator(int value) {
		setConstNumber(offset + 12, $yield_denominator, value);
	}

	/**
	 * Denominator for calculation (Output) 計算用分母（出来高）.<p>
	 *
	 */
	public void yield_denominator(long value) {
		setConstNumber(offset + 12, $yield_denominator, value);
	}

	/**
	 * Denominator for calculation (Output) 計算用分母（出来高）.<p>
	 *
	 */
	public void yield_denominator(float value) {
		setConstNumber(offset + 12, $yield_denominator, value);
	}

	/**
	 * Denominator for calculation (Output) 計算用分母（出来高）.<p>
	 *
	 */
	public void yield_denominator(double value) {
		setConstNumber(offset + 12, $yield_denominator, value);
	}


	/**
	 * Same operation order allocation ratio 同一工程指図割当比率.<p>
	 *
	 */
	public MCNumber prop_col() {
		return getConstNumber(offset + 13, $prop_col);
	}

	/**
	 * Same operation order allocation ratio 同一工程指図割当比率.<p>
	 *
	 */
	public void prop_col(MCNumber value) {
		setConstNumber(offset + 13, $prop_col, value);
	}

	/**
	 * Same operation order allocation ratio 同一工程指図割当比率.<p>
	 *
	 */
	public void prop_col(int value) {
		setConstNumber(offset + 13, $prop_col, value);
	}

	/**
	 * Same operation order allocation ratio 同一工程指図割当比率.<p>
	 *
	 */
	public void prop_col(long value) {
		setConstNumber(offset + 13, $prop_col, value);
	}

	/**
	 * Same operation order allocation ratio 同一工程指図割当比率.<p>
	 *
	 */
	public void prop_col(float value) {
		setConstNumber(offset + 13, $prop_col, value);
	}

	/**
	 * Same operation order allocation ratio 同一工程指図割当比率.<p>
	 *
	 */
	public void prop_col(double value) {
		setConstNumber(offset + 13, $prop_col, value);
	}


	public boolean yield_oper_flg() {
		return getConstBoolean(offset + 14, $yield_oper_flg);
	}

	public void yield_oper_flg(boolean value) {
		setConstBoolean(offset + 14, $yield_oper_flg, value);
	}


	public String getString(String name) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			return base_unit_st_qty();
		}
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			return base_unit_act_qty();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($oper_numerator.equalsIgnoreCase(name)) {
			return oper_numerator();
		}
		if ($oper_denominator.equalsIgnoreCase(name)) {
			return oper_denominator();
		}
		if ($yield_numerator.equalsIgnoreCase(name)) {
			return yield_numerator();
		}
		if ($yield_denominator.equalsIgnoreCase(name)) {
			return yield_denominator();
		}
		if ($prop_col.equalsIgnoreCase(name)) {
			return prop_col();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			return st_act_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			return base_unit_st_qty();
		}
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			return base_unit_act_qty();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($oper_numerator.equalsIgnoreCase(name)) {
			return oper_numerator();
		}
		if ($oper_denominator.equalsIgnoreCase(name)) {
			return oper_denominator();
		}
		if ($yield_numerator.equalsIgnoreCase(name)) {
			return yield_numerator();
		}
		if ($yield_denominator.equalsIgnoreCase(name)) {
			return yield_denominator();
		}
		if ($prop_col.equalsIgnoreCase(name)) {
			return prop_col();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			return st_act_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_numerator.equalsIgnoreCase(name)) {
			oper_numerator(value);
			return;
		}
		if ($oper_denominator.equalsIgnoreCase(name)) {
			oper_denominator(value);
			return;
		}
		if ($yield_numerator.equalsIgnoreCase(name)) {
			yield_numerator(value);
			return;
		}
		if ($yield_denominator.equalsIgnoreCase(name)) {
			yield_denominator(value);
			return;
		}
		if ($prop_col.equalsIgnoreCase(name)) {
			prop_col(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_numerator.equalsIgnoreCase(name)) {
			oper_numerator(value);
			return;
		}
		if ($oper_denominator.equalsIgnoreCase(name)) {
			oper_denominator(value);
			return;
		}
		if ($yield_numerator.equalsIgnoreCase(name)) {
			yield_numerator(value);
			return;
		}
		if ($yield_denominator.equalsIgnoreCase(name)) {
			yield_denominator(value);
			return;
		}
		if ($prop_col.equalsIgnoreCase(name)) {
			prop_col(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_numerator.equalsIgnoreCase(name)) {
			oper_numerator(value);
			return;
		}
		if ($oper_denominator.equalsIgnoreCase(name)) {
			oper_denominator(value);
			return;
		}
		if ($yield_numerator.equalsIgnoreCase(name)) {
			yield_numerator(value);
			return;
		}
		if ($yield_denominator.equalsIgnoreCase(name)) {
			yield_denominator(value);
			return;
		}
		if ($prop_col.equalsIgnoreCase(name)) {
			prop_col(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_numerator.equalsIgnoreCase(name)) {
			oper_numerator(value);
			return;
		}
		if ($oper_denominator.equalsIgnoreCase(name)) {
			oper_denominator(value);
			return;
		}
		if ($yield_numerator.equalsIgnoreCase(name)) {
			yield_numerator(value);
			return;
		}
		if ($yield_denominator.equalsIgnoreCase(name)) {
			yield_denominator(value);
			return;
		}
		if ($prop_col.equalsIgnoreCase(name)) {
			prop_col(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_numerator.equalsIgnoreCase(name)) {
			oper_numerator(value);
			return;
		}
		if ($oper_denominator.equalsIgnoreCase(name)) {
			oper_denominator(value);
			return;
		}
		if ($yield_numerator.equalsIgnoreCase(name)) {
			yield_numerator(value);
			return;
		}
		if ($yield_denominator.equalsIgnoreCase(name)) {
			yield_denominator(value);
			return;
		}
		if ($prop_col.equalsIgnoreCase(name)) {
			prop_col(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			st_act_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_numerator.equalsIgnoreCase(name)) {
			oper_numerator(value);
			return;
		}
		if ($oper_denominator.equalsIgnoreCase(name)) {
			oper_denominator(value);
			return;
		}
		if ($yield_numerator.equalsIgnoreCase(name)) {
			yield_numerator(value);
			return;
		}
		if ($yield_denominator.equalsIgnoreCase(name)) {
			yield_denominator(value);
			return;
		}
		if ($prop_col.equalsIgnoreCase(name)) {
			prop_col(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_numerator.equalsIgnoreCase(name)) {
			oper_numerator(value);
			return;
		}
		if ($oper_denominator.equalsIgnoreCase(name)) {
			oper_denominator(value);
			return;
		}
		if ($yield_numerator.equalsIgnoreCase(name)) {
			yield_numerator(value);
			return;
		}
		if ($yield_denominator.equalsIgnoreCase(name)) {
			yield_denominator(value);
			return;
		}
		if ($prop_col.equalsIgnoreCase(name)) {
			prop_col(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_numerator.equalsIgnoreCase(name)) {
			oper_numerator(value);
			return;
		}
		if ($oper_denominator.equalsIgnoreCase(name)) {
			oper_denominator(value);
			return;
		}
		if ($yield_numerator.equalsIgnoreCase(name)) {
			yield_numerator(value);
			return;
		}
		if ($yield_denominator.equalsIgnoreCase(name)) {
			yield_denominator(value);
			return;
		}
		if ($prop_col.equalsIgnoreCase(name)) {
			prop_col(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_numerator.equalsIgnoreCase(name)) {
			oper_numerator(value);
			return;
		}
		if ($oper_denominator.equalsIgnoreCase(name)) {
			oper_denominator(value);
			return;
		}
		if ($yield_numerator.equalsIgnoreCase(name)) {
			yield_numerator(value);
			return;
		}
		if ($yield_denominator.equalsIgnoreCase(name)) {
			yield_denominator(value);
			return;
		}
		if ($prop_col.equalsIgnoreCase(name)) {
			prop_col(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_numerator.equalsIgnoreCase(name)) {
			oper_numerator(value);
			return;
		}
		if ($oper_denominator.equalsIgnoreCase(name)) {
			oper_denominator(value);
			return;
		}
		if ($yield_numerator.equalsIgnoreCase(name)) {
			yield_numerator(value);
			return;
		}
		if ($yield_denominator.equalsIgnoreCase(name)) {
			yield_denominator(value);
			return;
		}
		if ($prop_col.equalsIgnoreCase(name)) {
			prop_col(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			st_act_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

