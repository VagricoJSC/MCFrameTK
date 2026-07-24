package mcframe.serverMSBG.MSBGL5020;

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
 * ブロック"RcvActCmn_Upd02_SwBase"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcvActCmn_Upd02_SwBaseR_MC_A extends MCConstRow {

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	/**
	 * Parent slip recording month 親伝計上年月.<p>
	 *
	 */
	public static final String $par_act_ac_ym = "par_act_ac_ym";
	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public static final String $parent_bill_d_no = "parent_bill_d_no";
	/**
	 * Transfer source billing details No. 振替元請求明細ＮＯ.<p>
	 *
	 */
	public static final String $sw_src_bill_d_no = "sw_src_bill_d_no";
	/**
	 * New billing details exchange rate 新規請求明細為替レート.<p>
	 *
	 */
	public static final String $crt_bill_d_xrate = "crt_bill_d_xrate";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Payment received result pegging No. 入金実績紐付けＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_peg = "rcv_act_peg";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Transfer date 振替日.<p>
	 *
	 */
	public static final String $sw_dt = "sw_dt";
	/**
	 * Billing closing status type 請求締状況区分.<p>
	 *
	 */
	public static final String $bill_cl_sts_typ = "bill_cl_sts_typ";
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public static final String $sw_amt = "sw_amt";
	/**
	 * Base transfer amount 基準振替額.<p>
	 *
	 */
	public static final String $base_cur_sw_amt = "base_cur_sw_amt";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Billing invoice No. 請求インボイスＮＯ.<p>
	 *
	 */
	public static final String $bill_iv_no = "bill_iv_no";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Additional amount (Base currency) 基準通貨加算額.<p>
	 *
	 */
	public static final String $base_cur_amt_add = "base_cur_amt_add";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";


	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta par_act_ac_ym_META = createCommonMeta($par_act_ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta parent_bill_d_no_META = createCommonMeta($parent_bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta sw_src_bill_d_no_META = createCommonMeta($sw_src_bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta crt_bill_d_xrate_META = createCommonMeta($crt_bill_d_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta rcv_act_peg_META = createCommonMeta($rcv_act_peg, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sw_dt_META = createCommonMeta($sw_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_cl_sts_typ_META = createCommonMeta($bill_cl_sts_typ, mcframe.commonMS.meta.MS_META.BILL_CL_STS_TYP);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_sw_amt_META = createCommonMeta($base_cur_sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bill_iv_no_META = createCommonMeta($bill_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_add_META = createCommonMeta($base_cur_amt_add, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);

	protected static final ConstMetaList<RcvActCmn_Upd02_SwBaseR> constMetas = new ConstMetaList<RcvActCmn_Upd02_SwBaseR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_ym_META,
			bill_d_no_META,
			par_act_ac_ym_META,
			parent_bill_d_no_META,
			sw_src_bill_d_no_META,
			crt_bill_d_xrate_META,
			trd_ptn_typ_META,
			rcv_act_peg_META,
			ac_dt_META,
			sw_dt_META,
			bill_cl_sts_typ_META,
			bill_mng_no_META,
			trd_cur_cd_META,
			sw_amt_META,
			base_cur_sw_amt_META,
			acst_cd_META,
			bcst_cd_META,
			ar_dpt_cd_META,
			wg_cd_META,
			bill_dpt_cd_META,
			iv_no_META,
			bill_iv_no_META,
			xrate_META,
			base_cur_amt_add_META,
			wrk_no_META,
			ar_typ_META
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
	protected RcvActCmn_Upd02_SwBaseR_MC_A(ConstMetaList<? extends RcvActCmn_Upd02_SwBaseR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvActCmn_Upd02_SwBaseR clone() {
		return (RcvActCmn_Upd02_SwBaseR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvActCmn_Upd02_SwBaseR createInstance() {
		return (RcvActCmn_Upd02_SwBaseR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvActCmn_Upd02_SwBaseR getValues(String... names) {
		return (RcvActCmn_Upd02_SwBaseR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 0, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 0, $ac_ym, value);
	}


	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 1, $bill_d_no);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 1, $bill_d_no, value);
	}


	/**
	 * Parent slip recording month 親伝計上年月.<p>
	 *
	 */
	public MCDate par_act_ac_ym() {
		return getConstDate(offset + 2, $par_act_ac_ym);
	}

	/**
	 * Parent slip recording month 親伝計上年月.<p>
	 *
	 */
	public void par_act_ac_ym(MCDate value) {
		setConstDate(offset + 2, $par_act_ac_ym, value);
	}


	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public String parent_bill_d_no() {
		return getConstString(offset + 3, $parent_bill_d_no);
	}

	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public void parent_bill_d_no(String value) {
		setConstString(offset + 3, $parent_bill_d_no, value);
	}


	/**
	 * Transfer source billing details No. 振替元請求明細ＮＯ.<p>
	 *
	 */
	public String sw_src_bill_d_no() {
		return getConstString(offset + 4, $sw_src_bill_d_no);
	}

	/**
	 * Transfer source billing details No. 振替元請求明細ＮＯ.<p>
	 *
	 */
	public void sw_src_bill_d_no(String value) {
		setConstString(offset + 4, $sw_src_bill_d_no, value);
	}


	/**
	 * New billing details exchange rate 新規請求明細為替レート.<p>
	 *
	 */
	public MCNumber crt_bill_d_xrate() {
		return getConstNumber(offset + 5, $crt_bill_d_xrate);
	}

	/**
	 * New billing details exchange rate 新規請求明細為替レート.<p>
	 *
	 */
	public void crt_bill_d_xrate(MCNumber value) {
		setConstNumber(offset + 5, $crt_bill_d_xrate, value);
	}

	/**
	 * New billing details exchange rate 新規請求明細為替レート.<p>
	 *
	 */
	public void crt_bill_d_xrate(int value) {
		setConstNumber(offset + 5, $crt_bill_d_xrate, value);
	}

	/**
	 * New billing details exchange rate 新規請求明細為替レート.<p>
	 *
	 */
	public void crt_bill_d_xrate(long value) {
		setConstNumber(offset + 5, $crt_bill_d_xrate, value);
	}

	/**
	 * New billing details exchange rate 新規請求明細為替レート.<p>
	 *
	 */
	public void crt_bill_d_xrate(float value) {
		setConstNumber(offset + 5, $crt_bill_d_xrate, value);
	}

	/**
	 * New billing details exchange rate 新規請求明細為替レート.<p>
	 *
	 */
	public void crt_bill_d_xrate(double value) {
		setConstNumber(offset + 5, $crt_bill_d_xrate, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 6, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 6, $trd_ptn_typ, value);
	}


	/**
	 * Payment received result pegging No. 入金実績紐付けＮＯ.<p>
	 *
	 */
	public MCNumber rcv_act_peg() {
		return getConstNumber(offset + 7, $rcv_act_peg);
	}

	/**
	 * Payment received result pegging No. 入金実績紐付けＮＯ.<p>
	 *
	 */
	public void rcv_act_peg(MCNumber value) {
		setConstNumber(offset + 7, $rcv_act_peg, value);
	}

	/**
	 * Payment received result pegging No. 入金実績紐付けＮＯ.<p>
	 *
	 */
	public void rcv_act_peg(int value) {
		setConstNumber(offset + 7, $rcv_act_peg, value);
	}

	/**
	 * Payment received result pegging No. 入金実績紐付けＮＯ.<p>
	 *
	 */
	public void rcv_act_peg(long value) {
		setConstNumber(offset + 7, $rcv_act_peg, value);
	}

	/**
	 * Payment received result pegging No. 入金実績紐付けＮＯ.<p>
	 *
	 */
	public void rcv_act_peg(float value) {
		setConstNumber(offset + 7, $rcv_act_peg, value);
	}

	/**
	 * Payment received result pegging No. 入金実績紐付けＮＯ.<p>
	 *
	 */
	public void rcv_act_peg(double value) {
		setConstNumber(offset + 7, $rcv_act_peg, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 8, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 8, $ac_dt, value);
	}


	/**
	 * Transfer date 振替日.<p>
	 *
	 */
	public MCDate sw_dt() {
		return getConstDate(offset + 9, $sw_dt);
	}

	/**
	 * Transfer date 振替日.<p>
	 *
	 */
	public void sw_dt(MCDate value) {
		setConstDate(offset + 9, $sw_dt, value);
	}


	/**
	 * Billing closing status type 請求締状況区分.<p>
	 *
	 */
	public String bill_cl_sts_typ() {
		return getConstString(offset + 10, $bill_cl_sts_typ);
	}

	/**
	 * Billing closing status type 請求締状況区分.<p>
	 *
	 */
	public void bill_cl_sts_typ(String value) {
		setConstString(offset + 10, $bill_cl_sts_typ, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 11, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 11, $bill_mng_no, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 12, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 12, $trd_cur_cd, value);
	}


	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 13, $sw_amt);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 13, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 13, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 13, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 13, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 13, $sw_amt, value);
	}


	/**
	 * Base transfer amount 基準振替額.<p>
	 *
	 */
	public MCNumber base_cur_sw_amt() {
		return getConstNumber(offset + 14, $base_cur_sw_amt);
	}

	/**
	 * Base transfer amount 基準振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(MCNumber value) {
		setConstNumber(offset + 14, $base_cur_sw_amt, value);
	}

	/**
	 * Base transfer amount 基準振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(int value) {
		setConstNumber(offset + 14, $base_cur_sw_amt, value);
	}

	/**
	 * Base transfer amount 基準振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(long value) {
		setConstNumber(offset + 14, $base_cur_sw_amt, value);
	}

	/**
	 * Base transfer amount 基準振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(float value) {
		setConstNumber(offset + 14, $base_cur_sw_amt, value);
	}

	/**
	 * Base transfer amount 基準振替額.<p>
	 *
	 */
	public void base_cur_sw_amt(double value) {
		setConstNumber(offset + 14, $base_cur_sw_amt, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 15, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 15, $acst_cd, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 16, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 16, $bcst_cd, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 17, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 17, $ar_dpt_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 18, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 18, $wg_cd, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 19, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 19, $bill_dpt_cd, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 20, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 20, $iv_no, value);
	}


	/**
	 * Billing invoice No. 請求インボイスＮＯ.<p>
	 *
	 */
	public String bill_iv_no() {
		return getConstString(offset + 21, $bill_iv_no);
	}

	/**
	 * Billing invoice No. 請求インボイスＮＯ.<p>
	 *
	 */
	public void bill_iv_no(String value) {
		setConstString(offset + 21, $bill_iv_no, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 22, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 22, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 22, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 22, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 22, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 22, $xrate, value);
	}


	/**
	 * Additional amount (Base currency) 基準通貨加算額.<p>
	 *
	 */
	public MCNumber base_cur_amt_add() {
		return getConstNumber(offset + 23, $base_cur_amt_add);
	}

	/**
	 * Additional amount (Base currency) 基準通貨加算額.<p>
	 *
	 */
	public void base_cur_amt_add(MCNumber value) {
		setConstNumber(offset + 23, $base_cur_amt_add, value);
	}

	/**
	 * Additional amount (Base currency) 基準通貨加算額.<p>
	 *
	 */
	public void base_cur_amt_add(int value) {
		setConstNumber(offset + 23, $base_cur_amt_add, value);
	}

	/**
	 * Additional amount (Base currency) 基準通貨加算額.<p>
	 *
	 */
	public void base_cur_amt_add(long value) {
		setConstNumber(offset + 23, $base_cur_amt_add, value);
	}

	/**
	 * Additional amount (Base currency) 基準通貨加算額.<p>
	 *
	 */
	public void base_cur_amt_add(float value) {
		setConstNumber(offset + 23, $base_cur_amt_add, value);
	}

	/**
	 * Additional amount (Base currency) 基準通貨加算額.<p>
	 *
	 */
	public void base_cur_amt_add(double value) {
		setConstNumber(offset + 23, $base_cur_amt_add, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 24, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 24, $wrk_no, value);
	}


	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 25, $ar_typ);
	}

	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 25, $ar_typ, value);
	}


	public String getString(String name) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			return parent_bill_d_no();
		}
		if ($sw_src_bill_d_no.equalsIgnoreCase(name)) {
			return sw_src_bill_d_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($bill_cl_sts_typ.equalsIgnoreCase(name)) {
			return bill_cl_sts_typ();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			return bill_iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($crt_bill_d_xrate.equalsIgnoreCase(name)) {
			return crt_bill_d_xrate();
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			return rcv_act_peg();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			return base_cur_sw_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($base_cur_amt_add.equalsIgnoreCase(name)) {
			return base_cur_amt_add();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($par_act_ac_ym.equalsIgnoreCase(name)) {
			return par_act_ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($sw_dt.equalsIgnoreCase(name)) {
			return sw_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			return parent_bill_d_no();
		}
		if ($sw_src_bill_d_no.equalsIgnoreCase(name)) {
			return sw_src_bill_d_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($bill_cl_sts_typ.equalsIgnoreCase(name)) {
			return bill_cl_sts_typ();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			return bill_iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($crt_bill_d_xrate.equalsIgnoreCase(name)) {
			return crt_bill_d_xrate();
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			return rcv_act_peg();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			return base_cur_sw_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($base_cur_amt_add.equalsIgnoreCase(name)) {
			return base_cur_amt_add();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($par_act_ac_ym.equalsIgnoreCase(name)) {
			return par_act_ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($sw_dt.equalsIgnoreCase(name)) {
			return sw_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			parent_bill_d_no(value);
			return;
		}
		if ($sw_src_bill_d_no.equalsIgnoreCase(name)) {
			sw_src_bill_d_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($bill_cl_sts_typ.equalsIgnoreCase(name)) {
			bill_cl_sts_typ(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			bill_iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($crt_bill_d_xrate.equalsIgnoreCase(name)) {
			crt_bill_d_xrate(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_add.equalsIgnoreCase(name)) {
			base_cur_amt_add(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($crt_bill_d_xrate.equalsIgnoreCase(name)) {
			crt_bill_d_xrate(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_add.equalsIgnoreCase(name)) {
			base_cur_amt_add(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($crt_bill_d_xrate.equalsIgnoreCase(name)) {
			crt_bill_d_xrate(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_add.equalsIgnoreCase(name)) {
			base_cur_amt_add(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($crt_bill_d_xrate.equalsIgnoreCase(name)) {
			crt_bill_d_xrate(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_add.equalsIgnoreCase(name)) {
			base_cur_amt_add(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($crt_bill_d_xrate.equalsIgnoreCase(name)) {
			crt_bill_d_xrate(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_add.equalsIgnoreCase(name)) {
			base_cur_amt_add(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($par_act_ac_ym.equalsIgnoreCase(name)) {
			par_act_ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($sw_dt.equalsIgnoreCase(name)) {
			sw_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			parent_bill_d_no(value);
			return;
		}
		if ($sw_src_bill_d_no.equalsIgnoreCase(name)) {
			sw_src_bill_d_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($bill_cl_sts_typ.equalsIgnoreCase(name)) {
			bill_cl_sts_typ(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_iv_no.equalsIgnoreCase(name)) {
			bill_iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($crt_bill_d_xrate.equalsIgnoreCase(name)) {
			crt_bill_d_xrate(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_add.equalsIgnoreCase(name)) {
			base_cur_amt_add(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($crt_bill_d_xrate.equalsIgnoreCase(name)) {
			crt_bill_d_xrate(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_add.equalsIgnoreCase(name)) {
			base_cur_amt_add(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($crt_bill_d_xrate.equalsIgnoreCase(name)) {
			crt_bill_d_xrate(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_add.equalsIgnoreCase(name)) {
			base_cur_amt_add(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($crt_bill_d_xrate.equalsIgnoreCase(name)) {
			crt_bill_d_xrate(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_add.equalsIgnoreCase(name)) {
			base_cur_amt_add(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($crt_bill_d_xrate.equalsIgnoreCase(name)) {
			crt_bill_d_xrate(value);
			return;
		}
		if ($rcv_act_peg.equalsIgnoreCase(name)) {
			rcv_act_peg(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($base_cur_sw_amt.equalsIgnoreCase(name)) {
			base_cur_sw_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_amt_add.equalsIgnoreCase(name)) {
			base_cur_amt_add(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($par_act_ac_ym.equalsIgnoreCase(name)) {
			par_act_ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($sw_dt.equalsIgnoreCase(name)) {
			sw_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

