package mcframe.serverMSBD.MSBDL5280;

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
 * ブロック"PurcFrcst_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PurcFrcst_Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Purchase forecast details No. 購買内示明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_frcst_d_no = "purc_frcst_d_no";
	/**
	 * Purchase forecast firm No. 購買内示確定ＮＯ.<p>
	 *
	 */
	public static final String $purc_frcst_fix_no = "purc_frcst_fix_no";
	/**
	 * Purchase forecast No. 購買内示ＮＯ.<p>
	 *
	 */
	public static final String $purc_frcst_no = "purc_frcst_no";
	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public static final String $pf_period_typ = "pf_period_typ";
	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public static final String $pf_period_st_dt = "pf_period_st_dt";
	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public static final String $pf_period_end_dt = "pf_period_end_dt";
	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public static final String $fix_period_flg = "fix_period_flg";
	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public static final String $trd_unit_schd_qty = "trd_unit_schd_qty";
	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public static final String $base_unit_schd_qty = "base_unit_schd_qty";
	/**
	 * Transaction unit forecast qty. 取引単位内示数量.<p>
	 *
	 */
	public static final String $trd_unit_pf_qty = "trd_unit_pf_qty";
	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public static final String $base_unit_pf_qty = "base_unit_pf_qty";
	/**
	 * Transaction unit replied qty. 取引単位回答数量.<p>
	 *
	 */
	public static final String $trd_unit_prms_qty = "trd_unit_prms_qty";
	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public static final String $base_unit_prms_qty = "base_unit_prms_qty";
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta purc_frcst_d_no_META = createCommonMeta($purc_frcst_d_no, mcframe.commonMA.meta.MA_META.PURC_FRCST_D_NO);
	public static final MCMeta purc_frcst_fix_no_META = createCommonMeta($purc_frcst_fix_no, mcframe.commonMA.meta.MA_META.PURC_FRCST_FIX_NO);
	public static final MCMeta purc_frcst_no_META = createCommonMeta($purc_frcst_no, mcframe.commonMA.meta.MA_META.PURC_FRCST_NO);
	public static final MCMeta pf_period_typ_META = createCommonMeta($pf_period_typ, mcframe.commonMA.meta.MA_META.PERIOD_TYP);
	public static final MCMeta pf_period_st_dt_META = createCommonMeta($pf_period_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pf_period_end_dt_META = createCommonMeta($pf_period_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta fix_period_flg_META = createCommonMeta($fix_period_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_schd_qty_META = createCommonMeta($trd_unit_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_schd_qty_META = createCommonMeta($base_unit_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_pf_qty_META = createCommonMeta($trd_unit_pf_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_pf_qty_META = createCommonMeta($base_unit_pf_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_prms_qty_META = createCommonMeta($trd_unit_prms_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_prms_qty_META = createCommonMeta($base_unit_prms_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<PurcFrcst_Chk01_DtlR> constMetas = new ConstMetaList<PurcFrcst_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			purc_frcst_d_no_META,
			purc_frcst_fix_no_META,
			purc_frcst_no_META,
			pf_period_typ_META,
			pf_period_st_dt_META,
			pf_period_end_dt_META,
			fix_period_flg_META,
			trd_unit_schd_qty_META,
			base_unit_schd_qty_META,
			trd_unit_pf_qty_META,
			base_unit_pf_qty_META,
			trd_unit_prms_qty_META,
			base_unit_prms_qty_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_dec_place_META,
			err_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$purc_frcst_d_no, "E"},	// purc_frcst_d_no
				{$purc_frcst_fix_no, "E"},	// purc_frcst_fix_no
				{$purc_frcst_no, "E"},	// purc_frcst_no
				{$trd_unit_pf_qty, "E"}	// trd_unit_pf_qty
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$trd_unit_pf_qty, "0:"},	// trd_unit_pf_qty
				{$trd_unit_prms_qty, "0:"}	// trd_unit_prms_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected PurcFrcst_Chk01_DtlR_MC_A(ConstMetaList<? extends PurcFrcst_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcFrcst_Chk01_DtlR clone() {
		return (PurcFrcst_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcFrcst_Chk01_DtlR createInstance() {
		return (PurcFrcst_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcFrcst_Chk01_DtlR getValues(String... names) {
		return (PurcFrcst_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Purchase forecast details No. 購買内示明細ＮＯ.<p>
	 *
	 */
	public String purc_frcst_d_no() {
		return getConstString(offset + 1, $purc_frcst_d_no);
	}

	/**
	 * Purchase forecast details No. 購買内示明細ＮＯ.<p>
	 *
	 */
	public void purc_frcst_d_no(String value) {
		setConstString(offset + 1, $purc_frcst_d_no, value);
	}


	/**
	 * Purchase forecast firm No. 購買内示確定ＮＯ.<p>
	 *
	 */
	public String purc_frcst_fix_no() {
		return getConstString(offset + 2, $purc_frcst_fix_no);
	}

	/**
	 * Purchase forecast firm No. 購買内示確定ＮＯ.<p>
	 *
	 */
	public void purc_frcst_fix_no(String value) {
		setConstString(offset + 2, $purc_frcst_fix_no, value);
	}


	/**
	 * Purchase forecast No. 購買内示ＮＯ.<p>
	 *
	 */
	public String purc_frcst_no() {
		return getConstString(offset + 3, $purc_frcst_no);
	}

	/**
	 * Purchase forecast No. 購買内示ＮＯ.<p>
	 *
	 */
	public void purc_frcst_no(String value) {
		setConstString(offset + 3, $purc_frcst_no, value);
	}


	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public String pf_period_typ() {
		return getConstString(offset + 4, $pf_period_typ);
	}

	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public void pf_period_typ(String value) {
		setConstString(offset + 4, $pf_period_typ, value);
	}


	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public MCDate pf_period_st_dt() {
		return getConstDate(offset + 5, $pf_period_st_dt);
	}

	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public void pf_period_st_dt(MCDate value) {
		setConstDate(offset + 5, $pf_period_st_dt, value);
	}


	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public MCDate pf_period_end_dt() {
		return getConstDate(offset + 6, $pf_period_end_dt);
	}

	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public void pf_period_end_dt(MCDate value) {
		setConstDate(offset + 6, $pf_period_end_dt, value);
	}


	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public boolean fix_period_flg() {
		return getConstBoolean(offset + 7, $fix_period_flg);
	}

	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public void fix_period_flg(boolean value) {
		setConstBoolean(offset + 7, $fix_period_flg, value);
	}


	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public MCNumber trd_unit_schd_qty() {
		return getConstNumber(offset + 8, $trd_unit_schd_qty);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(MCNumber value) {
		setConstNumber(offset + 8, $trd_unit_schd_qty, value);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(int value) {
		setConstNumber(offset + 8, $trd_unit_schd_qty, value);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(long value) {
		setConstNumber(offset + 8, $trd_unit_schd_qty, value);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(float value) {
		setConstNumber(offset + 8, $trd_unit_schd_qty, value);
	}

	/**
	 * Transaction unit scheduled qty. 取引単位予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(double value) {
		setConstNumber(offset + 8, $trd_unit_schd_qty, value);
	}


	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public MCNumber base_unit_schd_qty() {
		return getConstNumber(offset + 9, $base_unit_schd_qty);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(MCNumber value) {
		setConstNumber(offset + 9, $base_unit_schd_qty, value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(int value) {
		setConstNumber(offset + 9, $base_unit_schd_qty, value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(long value) {
		setConstNumber(offset + 9, $base_unit_schd_qty, value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(float value) {
		setConstNumber(offset + 9, $base_unit_schd_qty, value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(double value) {
		setConstNumber(offset + 9, $base_unit_schd_qty, value);
	}


	/**
	 * Transaction unit forecast qty. 取引単位内示数量.<p>
	 *
	 */
	public MCNumber trd_unit_pf_qty() {
		return getConstNumber(offset + 10, $trd_unit_pf_qty);
	}

	/**
	 * Transaction unit forecast qty. 取引単位内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(MCNumber value) {
		setConstNumber(offset + 10, $trd_unit_pf_qty, value);
	}

	/**
	 * Transaction unit forecast qty. 取引単位内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(int value) {
		setConstNumber(offset + 10, $trd_unit_pf_qty, value);
	}

	/**
	 * Transaction unit forecast qty. 取引単位内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(long value) {
		setConstNumber(offset + 10, $trd_unit_pf_qty, value);
	}

	/**
	 * Transaction unit forecast qty. 取引単位内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(float value) {
		setConstNumber(offset + 10, $trd_unit_pf_qty, value);
	}

	/**
	 * Transaction unit forecast qty. 取引単位内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(double value) {
		setConstNumber(offset + 10, $trd_unit_pf_qty, value);
	}


	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public MCNumber base_unit_pf_qty() {
		return getConstNumber(offset + 11, $base_unit_pf_qty);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(MCNumber value) {
		setConstNumber(offset + 11, $base_unit_pf_qty, value);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(int value) {
		setConstNumber(offset + 11, $base_unit_pf_qty, value);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(long value) {
		setConstNumber(offset + 11, $base_unit_pf_qty, value);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(float value) {
		setConstNumber(offset + 11, $base_unit_pf_qty, value);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(double value) {
		setConstNumber(offset + 11, $base_unit_pf_qty, value);
	}


	/**
	 * Transaction unit replied qty. 取引単位回答数量.<p>
	 *
	 */
	public MCNumber trd_unit_prms_qty() {
		return getConstNumber(offset + 12, $trd_unit_prms_qty);
	}

	/**
	 * Transaction unit replied qty. 取引単位回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(MCNumber value) {
		setConstNumber(offset + 12, $trd_unit_prms_qty, value);
	}

	/**
	 * Transaction unit replied qty. 取引単位回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(int value) {
		setConstNumber(offset + 12, $trd_unit_prms_qty, value);
	}

	/**
	 * Transaction unit replied qty. 取引単位回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(long value) {
		setConstNumber(offset + 12, $trd_unit_prms_qty, value);
	}

	/**
	 * Transaction unit replied qty. 取引単位回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(float value) {
		setConstNumber(offset + 12, $trd_unit_prms_qty, value);
	}

	/**
	 * Transaction unit replied qty. 取引単位回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(double value) {
		setConstNumber(offset + 12, $trd_unit_prms_qty, value);
	}


	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public MCNumber base_unit_prms_qty() {
		return getConstNumber(offset + 13, $base_unit_prms_qty);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(MCNumber value) {
		setConstNumber(offset + 13, $base_unit_prms_qty, value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(int value) {
		setConstNumber(offset + 13, $base_unit_prms_qty, value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(long value) {
		setConstNumber(offset + 13, $base_unit_prms_qty, value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(float value) {
		setConstNumber(offset + 13, $base_unit_prms_qty, value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(double value) {
		setConstNumber(offset + 13, $base_unit_prms_qty, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 14, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 14, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 14, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 14, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 14, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 14, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 15, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 15, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 15, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 15, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 15, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 15, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 16, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 16, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 16, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 16, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 16, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 16, $trd_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 17, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 17, $base_unit_rnd_typ, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 18, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 19, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 19, $err_flg, value);
	}


	public String getString(String name) {
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			return purc_frcst_d_no();
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			return purc_frcst_fix_no();
		}
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			return purc_frcst_no();
		}
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			return pf_period_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			return trd_unit_schd_qty();
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_schd_qty();
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			return trd_unit_pf_qty();
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			return base_unit_pf_qty();
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			return trd_unit_prms_qty();
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			return base_unit_prms_qty();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			return pf_period_st_dt();
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			return pf_period_end_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			return fix_period_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			return purc_frcst_d_no();
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			return purc_frcst_fix_no();
		}
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			return purc_frcst_no();
		}
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			return pf_period_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			return trd_unit_schd_qty();
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_schd_qty();
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			return trd_unit_pf_qty();
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			return base_unit_pf_qty();
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			return trd_unit_prms_qty();
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			return base_unit_prms_qty();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			return pf_period_st_dt();
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			return pf_period_end_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			return fix_period_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			purc_frcst_d_no(value);
			return;
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			purc_frcst_fix_no(value);
			return;
		}
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			purc_frcst_no(value);
			return;
		}
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			pf_period_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			pf_period_st_dt(value);
			return;
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			pf_period_end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			fix_period_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			purc_frcst_d_no(value);
			return;
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			purc_frcst_fix_no(value);
			return;
		}
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			purc_frcst_no(value);
			return;
		}
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			pf_period_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			pf_period_st_dt(value);
			return;
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			pf_period_end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			fix_period_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

