package mcframe.serverMSBB.MSBBL0110;

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
 * ブロック"Chk02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk02_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public static final String $spln_itm_cd = "spln_itm_cd";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public static final String $spln_ym = "spln_ym";
	/**
	 * Aggregate 集計する.<p>
	 *
	 */
	public static final String $sum_flg = "sum_flg";
	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public static final String $spln_qty = "spln_qty";
	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public static final String $spln_amt = "spln_amt";
	/**
	 * Planned qty. (Calculation result) 計画数量（計算結果）.<p>
	 *
	 */
	public static final String $calc_spln_qty = "calc_spln_qty";
	/**
	 * Planning amount (Calculation result) 計画金額（計算結果）.<p>
	 *
	 */
	public static final String $calc_spln_amt = "calc_spln_amt";
	/**
	 * Planned schedule qty. (Before update) 計画数量（更新前）.<p>
	 *
	 */
	public static final String $old_spln_qty = "old_spln_qty";
	/**
	 * Plan amount (Before update) 計画金額（更新前）.<p>
	 *
	 */
	public static final String $old_spln_amt = "old_spln_amt";
	/**
	 * Planned qty. number of decimal places 計画数量小数部有効桁数.<p>
	 *
	 */
	public static final String $qty_dec_place = "qty_dec_place";
	/**
	 * Plan amount number of decimal places 計画金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public static final String $spln_set_typ = "spln_set_typ";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public static final String $grp_peg_no = "grp_peg_no";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spln_itm_cd_META = createCommonMeta($spln_itm_cd, mcframe.commonMA.meta.MA_META.SPLN_ITM_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta spln_ym_META = createCommonMeta($spln_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sum_flg_META = createCommonMeta($sum_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spln_qty_META = createCommonMeta($spln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta spln_amt_META = createCommonMeta($spln_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta calc_spln_qty_META = createCommonMeta($calc_spln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta calc_spln_amt_META = createCommonMeta($calc_spln_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_spln_qty_META = createCommonMeta($old_spln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta old_spln_amt_META = createCommonMeta($old_spln_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_dec_place_META = createCommonMeta($qty_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta spln_set_typ_META = createCommonMeta($spln_set_typ, mcframe.commonMA.meta.MA_META.SPLN_SET_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta grp_peg_no_META = createCommonMeta($grp_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);

	protected static final ConstMetaList<Chk02_DtlR> constMetas = new ConstMetaList<Chk02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			fix_flg_META,
			spln_itm_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			cur_cd_META,
			spln_ym_META,
			sum_flg_META,
			spln_qty_META,
			spln_amt_META,
			calc_spln_qty_META,
			calc_spln_amt_META,
			old_spln_qty_META,
			old_spln_amt_META,
			qty_dec_place_META,
			amt_dec_place_META,
			spln_set_typ_META,
			err_flg_META,
			grp_peg_no_META,
			dpt_cd_META,
			cst_cd_META,
			wrk_no_META
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
				{$cur_cd, "E"},	// cur_cd
				{$spln_ym, "E"}	// spln_ym
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$spln_qty, "0:"},	// spln_qty
				{$spln_amt, "0:"}	// spln_amt
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
				{$spln_itm_cd, "SPLN_ITM_INPT_CHK1"},	// spln_itm_cd
				{$itm_cd, "SPLN_ITM_INPT_CHK1"}	// itm_cd
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
				{$spln_itm_cd, "SPLN_ITM_INPT_CHK2"},	// spln_itm_cd
				{$itm_cd, "SPLN_ITM_INPT_CHK2"}	// itm_cd
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$spln_itm_cd, "MA.MAUAL0010.SplnItm"},	// spln_itm_cd
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$cur_cd, "MA.MAUAL0010.Cur"}	// cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "qty_dec_place"},	// itm_sub3
				{$cur_cd, "amt_dec_place"}	// cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "dec_place"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$spln_itm_cd, "true"},	// spln_itm_cd
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2;true;MAC_ITM_IS_SRCH_TYP.COMM"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$spln_itm_cd, "mode_nullval_flg"},	// spln_itm_cd
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2;mode_nullval_flg;itm_is_srch_typ"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$spln_itm_cd, "E"},	// spln_itm_cd
				{$itm_cd, "E"},	// itm_cd
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"}	// itm_sub3
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
	protected Chk02_DtlR_MC_A(ConstMetaList<? extends Chk02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR clone() {
		return (Chk02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR createInstance() {
		return (Chk02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR getValues(String... names) {
		return (Chk02_DtlR) super.getValues(names);
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
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 1, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 1, $fix_flg, value);
	}


	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public String spln_itm_cd() {
		return getConstString(offset + 2, $spln_itm_cd);
	}

	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public void spln_itm_cd(String value) {
		setConstString(offset + 2, $spln_itm_cd, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 3, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 3, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 4, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 4, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 5, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 5, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 6, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 6, $itm_sub3, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 7, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 7, $cur_cd, value);
	}


	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public MCDate spln_ym() {
		return getConstDate(offset + 8, $spln_ym);
	}

	/**
	 * Sales month 販売年月.<p>
	 *
	 */
	public void spln_ym(MCDate value) {
		setConstDate(offset + 8, $spln_ym, value);
	}


	/**
	 * Aggregate 集計する.<p>
	 *
	 */
	public boolean sum_flg() {
		return getConstBoolean(offset + 9, $sum_flg);
	}

	/**
	 * Aggregate 集計する.<p>
	 *
	 */
	public void sum_flg(boolean value) {
		setConstBoolean(offset + 9, $sum_flg, value);
	}


	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public MCNumber spln_qty() {
		return getConstNumber(offset + 10, $spln_qty);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void spln_qty(MCNumber value) {
		setConstNumber(offset + 10, $spln_qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void spln_qty(int value) {
		setConstNumber(offset + 10, $spln_qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void spln_qty(long value) {
		setConstNumber(offset + 10, $spln_qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void spln_qty(float value) {
		setConstNumber(offset + 10, $spln_qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void spln_qty(double value) {
		setConstNumber(offset + 10, $spln_qty, value);
	}


	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public MCNumber spln_amt() {
		return getConstNumber(offset + 11, $spln_amt);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void spln_amt(MCNumber value) {
		setConstNumber(offset + 11, $spln_amt, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void spln_amt(int value) {
		setConstNumber(offset + 11, $spln_amt, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void spln_amt(long value) {
		setConstNumber(offset + 11, $spln_amt, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void spln_amt(float value) {
		setConstNumber(offset + 11, $spln_amt, value);
	}

	/**
	 * Plan amount 計画金額.<p>
	 *
	 */
	public void spln_amt(double value) {
		setConstNumber(offset + 11, $spln_amt, value);
	}


	/**
	 * Planned qty. (Calculation result) 計画数量（計算結果）.<p>
	 *
	 */
	public MCNumber calc_spln_qty() {
		return getConstNumber(offset + 12, $calc_spln_qty);
	}

	/**
	 * Planned qty. (Calculation result) 計画数量（計算結果）.<p>
	 *
	 */
	public void calc_spln_qty(MCNumber value) {
		setConstNumber(offset + 12, $calc_spln_qty, value);
	}

	/**
	 * Planned qty. (Calculation result) 計画数量（計算結果）.<p>
	 *
	 */
	public void calc_spln_qty(int value) {
		setConstNumber(offset + 12, $calc_spln_qty, value);
	}

	/**
	 * Planned qty. (Calculation result) 計画数量（計算結果）.<p>
	 *
	 */
	public void calc_spln_qty(long value) {
		setConstNumber(offset + 12, $calc_spln_qty, value);
	}

	/**
	 * Planned qty. (Calculation result) 計画数量（計算結果）.<p>
	 *
	 */
	public void calc_spln_qty(float value) {
		setConstNumber(offset + 12, $calc_spln_qty, value);
	}

	/**
	 * Planned qty. (Calculation result) 計画数量（計算結果）.<p>
	 *
	 */
	public void calc_spln_qty(double value) {
		setConstNumber(offset + 12, $calc_spln_qty, value);
	}


	/**
	 * Planning amount (Calculation result) 計画金額（計算結果）.<p>
	 *
	 */
	public MCNumber calc_spln_amt() {
		return getConstNumber(offset + 13, $calc_spln_amt);
	}

	/**
	 * Planning amount (Calculation result) 計画金額（計算結果）.<p>
	 *
	 */
	public void calc_spln_amt(MCNumber value) {
		setConstNumber(offset + 13, $calc_spln_amt, value);
	}

	/**
	 * Planning amount (Calculation result) 計画金額（計算結果）.<p>
	 *
	 */
	public void calc_spln_amt(int value) {
		setConstNumber(offset + 13, $calc_spln_amt, value);
	}

	/**
	 * Planning amount (Calculation result) 計画金額（計算結果）.<p>
	 *
	 */
	public void calc_spln_amt(long value) {
		setConstNumber(offset + 13, $calc_spln_amt, value);
	}

	/**
	 * Planning amount (Calculation result) 計画金額（計算結果）.<p>
	 *
	 */
	public void calc_spln_amt(float value) {
		setConstNumber(offset + 13, $calc_spln_amt, value);
	}

	/**
	 * Planning amount (Calculation result) 計画金額（計算結果）.<p>
	 *
	 */
	public void calc_spln_amt(double value) {
		setConstNumber(offset + 13, $calc_spln_amt, value);
	}


	/**
	 * Planned schedule qty. (Before update) 計画数量（更新前）.<p>
	 *
	 */
	public MCNumber old_spln_qty() {
		return getConstNumber(offset + 14, $old_spln_qty);
	}

	/**
	 * Planned schedule qty. (Before update) 計画数量（更新前）.<p>
	 *
	 */
	public void old_spln_qty(MCNumber value) {
		setConstNumber(offset + 14, $old_spln_qty, value);
	}

	/**
	 * Planned schedule qty. (Before update) 計画数量（更新前）.<p>
	 *
	 */
	public void old_spln_qty(int value) {
		setConstNumber(offset + 14, $old_spln_qty, value);
	}

	/**
	 * Planned schedule qty. (Before update) 計画数量（更新前）.<p>
	 *
	 */
	public void old_spln_qty(long value) {
		setConstNumber(offset + 14, $old_spln_qty, value);
	}

	/**
	 * Planned schedule qty. (Before update) 計画数量（更新前）.<p>
	 *
	 */
	public void old_spln_qty(float value) {
		setConstNumber(offset + 14, $old_spln_qty, value);
	}

	/**
	 * Planned schedule qty. (Before update) 計画数量（更新前）.<p>
	 *
	 */
	public void old_spln_qty(double value) {
		setConstNumber(offset + 14, $old_spln_qty, value);
	}


	/**
	 * Plan amount (Before update) 計画金額（更新前）.<p>
	 *
	 */
	public MCNumber old_spln_amt() {
		return getConstNumber(offset + 15, $old_spln_amt);
	}

	/**
	 * Plan amount (Before update) 計画金額（更新前）.<p>
	 *
	 */
	public void old_spln_amt(MCNumber value) {
		setConstNumber(offset + 15, $old_spln_amt, value);
	}

	/**
	 * Plan amount (Before update) 計画金額（更新前）.<p>
	 *
	 */
	public void old_spln_amt(int value) {
		setConstNumber(offset + 15, $old_spln_amt, value);
	}

	/**
	 * Plan amount (Before update) 計画金額（更新前）.<p>
	 *
	 */
	public void old_spln_amt(long value) {
		setConstNumber(offset + 15, $old_spln_amt, value);
	}

	/**
	 * Plan amount (Before update) 計画金額（更新前）.<p>
	 *
	 */
	public void old_spln_amt(float value) {
		setConstNumber(offset + 15, $old_spln_amt, value);
	}

	/**
	 * Plan amount (Before update) 計画金額（更新前）.<p>
	 *
	 */
	public void old_spln_amt(double value) {
		setConstNumber(offset + 15, $old_spln_amt, value);
	}


	/**
	 * Planned qty. number of decimal places 計画数量小数部有効桁数.<p>
	 *
	 */
	public MCNumber qty_dec_place() {
		return getConstNumber(offset + 16, $qty_dec_place);
	}

	/**
	 * Planned qty. number of decimal places 計画数量小数部有効桁数.<p>
	 *
	 */
	public void qty_dec_place(MCNumber value) {
		setConstNumber(offset + 16, $qty_dec_place, value);
	}

	/**
	 * Planned qty. number of decimal places 計画数量小数部有効桁数.<p>
	 *
	 */
	public void qty_dec_place(int value) {
		setConstNumber(offset + 16, $qty_dec_place, value);
	}

	/**
	 * Planned qty. number of decimal places 計画数量小数部有効桁数.<p>
	 *
	 */
	public void qty_dec_place(long value) {
		setConstNumber(offset + 16, $qty_dec_place, value);
	}

	/**
	 * Planned qty. number of decimal places 計画数量小数部有効桁数.<p>
	 *
	 */
	public void qty_dec_place(float value) {
		setConstNumber(offset + 16, $qty_dec_place, value);
	}

	/**
	 * Planned qty. number of decimal places 計画数量小数部有効桁数.<p>
	 *
	 */
	public void qty_dec_place(double value) {
		setConstNumber(offset + 16, $qty_dec_place, value);
	}


	/**
	 * Plan amount number of decimal places 計画金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 17, $amt_dec_place);
	}

	/**
	 * Plan amount number of decimal places 計画金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 17, $amt_dec_place, value);
	}

	/**
	 * Plan amount number of decimal places 計画金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 17, $amt_dec_place, value);
	}

	/**
	 * Plan amount number of decimal places 計画金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 17, $amt_dec_place, value);
	}

	/**
	 * Plan amount number of decimal places 計画金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 17, $amt_dec_place, value);
	}

	/**
	 * Plan amount number of decimal places 計画金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 17, $amt_dec_place, value);
	}


	/**
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public String spln_set_typ() {
		return getConstString(offset + 18, $spln_set_typ);
	}

	/**
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public void spln_set_typ(String value) {
		setConstString(offset + 18, $spln_set_typ, value);
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


	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public MCNumber grp_peg_no() {
		return getConstNumber(offset + 20, $grp_peg_no);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(MCNumber value) {
		setConstNumber(offset + 20, $grp_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(int value) {
		setConstNumber(offset + 20, $grp_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(long value) {
		setConstNumber(offset + 20, $grp_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(float value) {
		setConstNumber(offset + 20, $grp_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(double value) {
		setConstNumber(offset + 20, $grp_peg_no, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 21, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 21, $dpt_cd, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 22, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 22, $cst_cd, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 23, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 23, $wrk_no, value);
	}


	public String getString(String name) {
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			return spln_set_typ();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			return spln_qty();
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			return spln_amt();
		}
		if ($calc_spln_qty.equalsIgnoreCase(name)) {
			return calc_spln_qty();
		}
		if ($calc_spln_amt.equalsIgnoreCase(name)) {
			return calc_spln_amt();
		}
		if ($old_spln_qty.equalsIgnoreCase(name)) {
			return old_spln_qty();
		}
		if ($old_spln_amt.equalsIgnoreCase(name)) {
			return old_spln_amt();
		}
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			return qty_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			return grp_peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			return spln_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($sum_flg.equalsIgnoreCase(name)) {
			return sum_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			return spln_set_typ();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			return spln_qty();
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			return spln_amt();
		}
		if ($calc_spln_qty.equalsIgnoreCase(name)) {
			return calc_spln_qty();
		}
		if ($calc_spln_amt.equalsIgnoreCase(name)) {
			return calc_spln_amt();
		}
		if ($old_spln_qty.equalsIgnoreCase(name)) {
			return old_spln_qty();
		}
		if ($old_spln_amt.equalsIgnoreCase(name)) {
			return old_spln_amt();
		}
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			return qty_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			return grp_peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			return spln_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($sum_flg.equalsIgnoreCase(name)) {
			return sum_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			spln_set_typ(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($calc_spln_qty.equalsIgnoreCase(name)) {
			calc_spln_qty(value);
			return;
		}
		if ($calc_spln_amt.equalsIgnoreCase(name)) {
			calc_spln_amt(value);
			return;
		}
		if ($old_spln_qty.equalsIgnoreCase(name)) {
			old_spln_qty(value);
			return;
		}
		if ($old_spln_amt.equalsIgnoreCase(name)) {
			old_spln_amt(value);
			return;
		}
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($calc_spln_qty.equalsIgnoreCase(name)) {
			calc_spln_qty(value);
			return;
		}
		if ($calc_spln_amt.equalsIgnoreCase(name)) {
			calc_spln_amt(value);
			return;
		}
		if ($old_spln_qty.equalsIgnoreCase(name)) {
			old_spln_qty(value);
			return;
		}
		if ($old_spln_amt.equalsIgnoreCase(name)) {
			old_spln_amt(value);
			return;
		}
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($calc_spln_qty.equalsIgnoreCase(name)) {
			calc_spln_qty(value);
			return;
		}
		if ($calc_spln_amt.equalsIgnoreCase(name)) {
			calc_spln_amt(value);
			return;
		}
		if ($old_spln_qty.equalsIgnoreCase(name)) {
			old_spln_qty(value);
			return;
		}
		if ($old_spln_amt.equalsIgnoreCase(name)) {
			old_spln_amt(value);
			return;
		}
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($calc_spln_qty.equalsIgnoreCase(name)) {
			calc_spln_qty(value);
			return;
		}
		if ($calc_spln_amt.equalsIgnoreCase(name)) {
			calc_spln_amt(value);
			return;
		}
		if ($old_spln_qty.equalsIgnoreCase(name)) {
			old_spln_qty(value);
			return;
		}
		if ($old_spln_amt.equalsIgnoreCase(name)) {
			old_spln_amt(value);
			return;
		}
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($calc_spln_qty.equalsIgnoreCase(name)) {
			calc_spln_qty(value);
			return;
		}
		if ($calc_spln_amt.equalsIgnoreCase(name)) {
			calc_spln_amt(value);
			return;
		}
		if ($old_spln_qty.equalsIgnoreCase(name)) {
			old_spln_qty(value);
			return;
		}
		if ($old_spln_amt.equalsIgnoreCase(name)) {
			old_spln_amt(value);
			return;
		}
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			spln_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($sum_flg.equalsIgnoreCase(name)) {
			sum_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			spln_set_typ(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($calc_spln_qty.equalsIgnoreCase(name)) {
			calc_spln_qty(value);
			return;
		}
		if ($calc_spln_amt.equalsIgnoreCase(name)) {
			calc_spln_amt(value);
			return;
		}
		if ($old_spln_qty.equalsIgnoreCase(name)) {
			old_spln_qty(value);
			return;
		}
		if ($old_spln_amt.equalsIgnoreCase(name)) {
			old_spln_amt(value);
			return;
		}
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($calc_spln_qty.equalsIgnoreCase(name)) {
			calc_spln_qty(value);
			return;
		}
		if ($calc_spln_amt.equalsIgnoreCase(name)) {
			calc_spln_amt(value);
			return;
		}
		if ($old_spln_qty.equalsIgnoreCase(name)) {
			old_spln_qty(value);
			return;
		}
		if ($old_spln_amt.equalsIgnoreCase(name)) {
			old_spln_amt(value);
			return;
		}
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($calc_spln_qty.equalsIgnoreCase(name)) {
			calc_spln_qty(value);
			return;
		}
		if ($calc_spln_amt.equalsIgnoreCase(name)) {
			calc_spln_amt(value);
			return;
		}
		if ($old_spln_qty.equalsIgnoreCase(name)) {
			old_spln_qty(value);
			return;
		}
		if ($old_spln_amt.equalsIgnoreCase(name)) {
			old_spln_amt(value);
			return;
		}
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($calc_spln_qty.equalsIgnoreCase(name)) {
			calc_spln_qty(value);
			return;
		}
		if ($calc_spln_amt.equalsIgnoreCase(name)) {
			calc_spln_amt(value);
			return;
		}
		if ($old_spln_qty.equalsIgnoreCase(name)) {
			old_spln_qty(value);
			return;
		}
		if ($old_spln_amt.equalsIgnoreCase(name)) {
			old_spln_amt(value);
			return;
		}
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($calc_spln_qty.equalsIgnoreCase(name)) {
			calc_spln_qty(value);
			return;
		}
		if ($calc_spln_amt.equalsIgnoreCase(name)) {
			calc_spln_amt(value);
			return;
		}
		if ($old_spln_qty.equalsIgnoreCase(name)) {
			old_spln_qty(value);
			return;
		}
		if ($old_spln_amt.equalsIgnoreCase(name)) {
			old_spln_amt(value);
			return;
		}
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($spln_ym.equalsIgnoreCase(name)) {
			spln_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($sum_flg.equalsIgnoreCase(name)) {
			sum_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

