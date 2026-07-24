package mcframe.serverMSBB.MSBBL1030;

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
 * ブロック"Chk01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_HdrR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Sales project overview 案件概要.<p>
	 *
	 */
	public static final String $wrk_desc = "wrk_desc";
	/**
	 * Sales project start date 案件開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Sales project end date 案件終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * Contract terms 契約条件.<p>
	 *
	 */
	public static final String $term_cond = "term_cond";
	/**
	 * Sales project status cd. 案件状況ＣＤ.<p>
	 *
	 */
	public static final String $wrk_sts_cd = "wrk_sts_cd";
	/**
	 * Sales order accuracy cd. 受注確度ＣＤ.<p>
	 *
	 */
	public static final String $slo_acc_cd = "slo_acc_cd";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Budget 予算.<p>
	 *
	 */
	public static final String $budget = "budget";
	/**
	 * AR management by sales project 案件別債権管理.<p>
	 *
	 */
	public static final String $wrk_ar_flg = "wrk_ar_flg";
	/**
	 * AP management by sales project 案件別債務管理.<p>
	 *
	 */
	public static final String $wrk_ap_flg = "wrk_ap_flg";
	/**
	 * Sales order reason 受注理由.<p>
	 *
	 */
	public static final String $slo_rsn = "slo_rsn";
	/**
	 * Failed order reason 失注理由.<p>
	 *
	 */
	public static final String $fail_rsn = "fail_rsn";
	/**
	 * Sales project remarks 案件備考.<p>
	 *
	 */
	public static final String $wrk_rmrks = "wrk_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta wrk_desc_META = createCommonMeta($wrk_desc, mcframe.commonMS.meta.MS_META.WRK_DESC);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta term_cond_META = createCommonMeta($term_cond, mcframe.commonMS.meta.MS_META.WRK_TERM_COND);
	public static final MCMeta wrk_sts_cd_META = createCommonMeta($wrk_sts_cd, mcframe.commonMS.meta.MS_META.WRK_MNG_CD);
	public static final MCMeta slo_acc_cd_META = createCommonMeta($slo_acc_cd, mcframe.commonMS.meta.MS_META.WRK_MNG_CD);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta budget_META = createCommonMeta($budget, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wrk_ar_flg_META = createCommonMeta($wrk_ar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_ap_flg_META = createCommonMeta($wrk_ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_rsn_META = createCommonMeta($slo_rsn, mcframe.commonMS.meta.MS_META.WRK_SLO_RSN);
	public static final MCMeta fail_rsn_META = createCommonMeta($fail_rsn, mcframe.commonMS.meta.MS_META.WRK_FAIL_RSN);
	public static final MCMeta wrk_rmrks_META = createCommonMeta($wrk_rmrks, mcframe.commonMS.meta.MS_META.WRK_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.WRK_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.WRK_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.WRK_SUB_CHAR3);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Chk01_HdrR> constMetas = new ConstMetaList<Chk01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			wrk_no_META,
			wrk_nm_META,
			wrk_desc_META,
			st_dt_META,
			end_dt_META,
			term_cond_META,
			wrk_sts_cd_META,
			slo_acc_cd_META,
			cur_cd_META,
			amt_dec_place_META,
			budget_META,
			wrk_ar_flg_META,
			wrk_ap_flg_META,
			slo_rsn_META,
			fail_rsn_META,
			wrk_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			upd_cntr_META
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
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
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
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";

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
				{$wrk_no, "E"},	// wrk_no
				{$wrk_nm, "E"},	// wrk_nm
				{$st_dt, "E"}	// st_dt
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$budget, "0:"}	// budget
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$st_dt, "E1:BF"},	// st_dt
				{$end_dt, "E1:AF"}	// end_dt
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$wrk_sts_cd, "MS.MSUAL0030.WrkSts"},	// wrk_sts_cd
				{$slo_acc_cd, "MS.MSUAL0030.SloAcc"},	// slo_acc_cd
				{$cur_cd, "MA.MAUAL0010.Cur"}	// cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$cur_cd, "cur_nm;amt_dec_place"}	// cur_cd
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
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
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
	protected Chk01_HdrR_MC_A(ConstMetaList<? extends Chk01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR clone() {
		return (Chk01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR createInstance() {
		return (Chk01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR getValues(String... names) {
		return (Chk01_HdrR) super.getValues(names);
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
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 2, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 2, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 3, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 3, $wrk_nm, value);
	}


	/**
	 * Sales project overview 案件概要.<p>
	 *
	 */
	public String wrk_desc() {
		return getConstString(offset + 4, $wrk_desc);
	}

	/**
	 * Sales project overview 案件概要.<p>
	 *
	 */
	public void wrk_desc(String value) {
		setConstString(offset + 4, $wrk_desc, value);
	}


	/**
	 * Sales project start date 案件開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 5, $st_dt);
	}

	/**
	 * Sales project start date 案件開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 5, $st_dt, value);
	}


	/**
	 * Sales project end date 案件終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 6, $end_dt);
	}

	/**
	 * Sales project end date 案件終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 6, $end_dt, value);
	}


	/**
	 * Contract terms 契約条件.<p>
	 *
	 */
	public String term_cond() {
		return getConstString(offset + 7, $term_cond);
	}

	/**
	 * Contract terms 契約条件.<p>
	 *
	 */
	public void term_cond(String value) {
		setConstString(offset + 7, $term_cond, value);
	}


	/**
	 * Sales project status cd. 案件状況ＣＤ.<p>
	 *
	 */
	public String wrk_sts_cd() {
		return getConstString(offset + 8, $wrk_sts_cd);
	}

	/**
	 * Sales project status cd. 案件状況ＣＤ.<p>
	 *
	 */
	public void wrk_sts_cd(String value) {
		setConstString(offset + 8, $wrk_sts_cd, value);
	}


	/**
	 * Sales order accuracy cd. 受注確度ＣＤ.<p>
	 *
	 */
	public String slo_acc_cd() {
		return getConstString(offset + 9, $slo_acc_cd);
	}

	/**
	 * Sales order accuracy cd. 受注確度ＣＤ.<p>
	 *
	 */
	public void slo_acc_cd(String value) {
		setConstString(offset + 9, $slo_acc_cd, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 10, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 10, $cur_cd, value);
	}


	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 11, $amt_dec_place);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 11, $amt_dec_place, value);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 11, $amt_dec_place, value);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 11, $amt_dec_place, value);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 11, $amt_dec_place, value);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 11, $amt_dec_place, value);
	}


	/**
	 * Budget 予算.<p>
	 *
	 */
	public MCNumber budget() {
		return getConstNumber(offset + 12, $budget);
	}

	/**
	 * Budget 予算.<p>
	 *
	 */
	public void budget(MCNumber value) {
		setConstNumber(offset + 12, $budget, value);
	}

	/**
	 * Budget 予算.<p>
	 *
	 */
	public void budget(int value) {
		setConstNumber(offset + 12, $budget, value);
	}

	/**
	 * Budget 予算.<p>
	 *
	 */
	public void budget(long value) {
		setConstNumber(offset + 12, $budget, value);
	}

	/**
	 * Budget 予算.<p>
	 *
	 */
	public void budget(float value) {
		setConstNumber(offset + 12, $budget, value);
	}

	/**
	 * Budget 予算.<p>
	 *
	 */
	public void budget(double value) {
		setConstNumber(offset + 12, $budget, value);
	}


	/**
	 * AR management by sales project 案件別債権管理.<p>
	 *
	 */
	public boolean wrk_ar_flg() {
		return getConstBoolean(offset + 13, $wrk_ar_flg);
	}

	/**
	 * AR management by sales project 案件別債権管理.<p>
	 *
	 */
	public void wrk_ar_flg(boolean value) {
		setConstBoolean(offset + 13, $wrk_ar_flg, value);
	}


	/**
	 * AP management by sales project 案件別債務管理.<p>
	 *
	 */
	public boolean wrk_ap_flg() {
		return getConstBoolean(offset + 14, $wrk_ap_flg);
	}

	/**
	 * AP management by sales project 案件別債務管理.<p>
	 *
	 */
	public void wrk_ap_flg(boolean value) {
		setConstBoolean(offset + 14, $wrk_ap_flg, value);
	}


	/**
	 * Sales order reason 受注理由.<p>
	 *
	 */
	public String slo_rsn() {
		return getConstString(offset + 15, $slo_rsn);
	}

	/**
	 * Sales order reason 受注理由.<p>
	 *
	 */
	public void slo_rsn(String value) {
		setConstString(offset + 15, $slo_rsn, value);
	}


	/**
	 * Failed order reason 失注理由.<p>
	 *
	 */
	public String fail_rsn() {
		return getConstString(offset + 16, $fail_rsn);
	}

	/**
	 * Failed order reason 失注理由.<p>
	 *
	 */
	public void fail_rsn(String value) {
		setConstString(offset + 16, $fail_rsn, value);
	}


	/**
	 * Sales project remarks 案件備考.<p>
	 *
	 */
	public String wrk_rmrks() {
		return getConstString(offset + 17, $wrk_rmrks);
	}

	/**
	 * Sales project remarks 案件備考.<p>
	 *
	 */
	public void wrk_rmrks(String value) {
		setConstString(offset + 17, $wrk_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 18, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 18, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 19, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 19, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 20, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 20, $sub_char3, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 21, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($wrk_desc.equalsIgnoreCase(name)) {
			return wrk_desc();
		}
		if ($term_cond.equalsIgnoreCase(name)) {
			return term_cond();
		}
		if ($wrk_sts_cd.equalsIgnoreCase(name)) {
			return wrk_sts_cd();
		}
		if ($slo_acc_cd.equalsIgnoreCase(name)) {
			return slo_acc_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($slo_rsn.equalsIgnoreCase(name)) {
			return slo_rsn();
		}
		if ($fail_rsn.equalsIgnoreCase(name)) {
			return fail_rsn();
		}
		if ($wrk_rmrks.equalsIgnoreCase(name)) {
			return wrk_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($budget.equalsIgnoreCase(name)) {
			return budget();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($wrk_desc.equalsIgnoreCase(name)) {
			return wrk_desc();
		}
		if ($term_cond.equalsIgnoreCase(name)) {
			return term_cond();
		}
		if ($wrk_sts_cd.equalsIgnoreCase(name)) {
			return wrk_sts_cd();
		}
		if ($slo_acc_cd.equalsIgnoreCase(name)) {
			return slo_acc_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($slo_rsn.equalsIgnoreCase(name)) {
			return slo_rsn();
		}
		if ($fail_rsn.equalsIgnoreCase(name)) {
			return fail_rsn();
		}
		if ($wrk_rmrks.equalsIgnoreCase(name)) {
			return wrk_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($budget.equalsIgnoreCase(name)) {
			return budget();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($wrk_desc.equalsIgnoreCase(name)) {
			wrk_desc(value);
			return;
		}
		if ($term_cond.equalsIgnoreCase(name)) {
			term_cond(value);
			return;
		}
		if ($wrk_sts_cd.equalsIgnoreCase(name)) {
			wrk_sts_cd(value);
			return;
		}
		if ($slo_acc_cd.equalsIgnoreCase(name)) {
			slo_acc_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($slo_rsn.equalsIgnoreCase(name)) {
			slo_rsn(value);
			return;
		}
		if ($fail_rsn.equalsIgnoreCase(name)) {
			fail_rsn(value);
			return;
		}
		if ($wrk_rmrks.equalsIgnoreCase(name)) {
			wrk_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($budget.equalsIgnoreCase(name)) {
			budget(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($budget.equalsIgnoreCase(name)) {
			budget(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($budget.equalsIgnoreCase(name)) {
			budget(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($budget.equalsIgnoreCase(name)) {
			budget(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($budget.equalsIgnoreCase(name)) {
			budget(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			wrk_ar_flg(value);
			return;
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			wrk_ap_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($wrk_desc.equalsIgnoreCase(name)) {
			wrk_desc(value);
			return;
		}
		if ($term_cond.equalsIgnoreCase(name)) {
			term_cond(value);
			return;
		}
		if ($wrk_sts_cd.equalsIgnoreCase(name)) {
			wrk_sts_cd(value);
			return;
		}
		if ($slo_acc_cd.equalsIgnoreCase(name)) {
			slo_acc_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($slo_rsn.equalsIgnoreCase(name)) {
			slo_rsn(value);
			return;
		}
		if ($fail_rsn.equalsIgnoreCase(name)) {
			fail_rsn(value);
			return;
		}
		if ($wrk_rmrks.equalsIgnoreCase(name)) {
			wrk_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($budget.equalsIgnoreCase(name)) {
			budget(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($budget.equalsIgnoreCase(name)) {
			budget(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($budget.equalsIgnoreCase(name)) {
			budget(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($budget.equalsIgnoreCase(name)) {
			budget(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($budget.equalsIgnoreCase(name)) {
			budget(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			wrk_ar_flg(value);
			return;
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			wrk_ap_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

