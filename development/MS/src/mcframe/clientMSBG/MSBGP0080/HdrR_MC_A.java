package mcframe.clientMSBG.MSBGP0080;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public static final String $bill_ym = "bill_ym";
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public static final String $bill_cl_day = "bill_cl_day";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * Display payment receipt schedule in invoice details 請求書明細入金予定表示.<p>
	 *
	 */
	public static final String $bfw_bal_disp_flg = "bfw_bal_disp_flg";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public static final String $bill_dpt_nm = "bill_dpt_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $upri_dec_place = "upri_dec_place";
	public static final String $wrk_no_p = "wrk_no_p";
	public static final String $sls_amt_p = "sls_amt_p";
	public static final String $ret_amt_p = "ret_amt_p";
	public static final String $dscnt_amt_p = "dscnt_amt_p";
	public static final String $tax_amt_p = "tax_amt_p";
	public static final String $sw_to_amt_p = "sw_to_amt_p";
	public static final String $rcv_schd_amt_total_p = "rcv_schd_amt_total_p";
	public static final String $rcv_act_amt_total_p = "rcv_act_amt_total_p";
	public static final String $rcv_schd_amt_bal_p = "rcv_schd_amt_bal_p";
	/**
	 * Payment receipt schedule adjusted 入金予定調整済.<p>
	 *
	 */
	public static final String $rcv_schd_adjst_flg = "rcv_schd_adjst_flg";
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";

	public static final String $wrk_no = $wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $wrk_no_p + ".wrk_nm";
	public static final String $sls_amt = $sls_amt_p + ".amt";
	public static final String $ret_amt = $ret_amt_p + ".amt";
	public static final String $dscnt_amt = $dscnt_amt_p + ".amt";
	public static final String $tax_amt = $tax_amt_p + ".amt";
	public static final String $sw_to_amt = $sw_to_amt_p + ".amt";
	public static final String $rcv_schd_amt_total = $rcv_schd_amt_total_p + ".amt";
	public static final String $rcv_act_amt_total = $rcv_act_amt_total_p + ".amt";
	public static final String $rcv_schd_amt_bal = $rcv_schd_amt_bal_p + ".amt";

	public static final MCMeta bill_ym_META = createCommonMeta($bill_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bill_cl_day_META = createCommonMeta($bill_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bfw_bal_disp_flg_META = createCommonMeta($bfw_bal_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri_dec_place_META = createCommonMeta($upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta sls_amt_p_META = createInnerRowMeta($sls_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ret_amt_p_META = createInnerRowMeta($ret_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta dscnt_amt_p_META = createInnerRowMeta($dscnt_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta tax_amt_p_META = createInnerRowMeta($tax_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta sw_to_amt_p_META = createInnerRowMeta($sw_to_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta rcv_schd_amt_total_p_META = createInnerRowMeta($rcv_schd_amt_total_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta rcv_act_amt_total_p_META = createInnerRowMeta($rcv_act_amt_total_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta rcv_schd_amt_bal_p_META = createInnerRowMeta($rcv_schd_amt_bal_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta rcv_schd_adjst_flg_META = createCommonMeta($rcv_schd_adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_ym_META,
			bill_cl_day_META,
			iv_no_META,
			prnt_flg_META,
			bfw_bal_disp_flg_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			bcst_cd_META,
			bcst_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			amt_dec_place_META,
			upri_dec_place_META,
			wrk_no_p_META,
			sls_amt_p_META,
			ret_amt_p_META,
			dscnt_amt_p_META,
			tax_amt_p_META,
			sw_to_amt_p_META,
			rcv_schd_amt_total_p_META,
			rcv_act_amt_total_p_META,
			rcv_schd_amt_bal_p_META,
			rcv_schd_adjst_flg_META,
			bill_mng_no_META,
			upd_cntr_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			ins_ts_META,
			upd_ts_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"wrk_no",
				"wrk_nm",
				"sls_amt",
				"ret_amt",
				"dscnt_amt",
				"tax_amt",
				"sw_to_amt",
				"rcv_schd_amt_total",
				"rcv_act_amt_total",
				"rcv_schd_amt_bal"
			},
			{
				$wrk_no,
				$wrk_nm,
				$sls_amt,
				$ret_amt,
				$dscnt_amt,
				$tax_amt,
				$sw_to_amt,
				$rcv_schd_amt_total,
				$rcv_act_amt_total,
				$rcv_schd_amt_bal
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
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
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCDate bill_ym() {
		return getConstDate(offset + 0, $bill_ym);
	}

	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public void bill_ym(MCDate value) {
		setConstDate(offset + 0, $bill_ym, value);
	}


	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumber bill_cl_day() {
		return getConstNumber(offset + 1, $bill_cl_day);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(MCNumber value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(int value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(long value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(float value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(double value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 2, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 2, $iv_no, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 3, $prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 3, $prnt_flg, value);
	}


	/**
	 * Display payment receipt schedule in invoice details 請求書明細入金予定表示.<p>
	 *
	 */
	public boolean bfw_bal_disp_flg() {
		return getConstBoolean(offset + 4, $bfw_bal_disp_flg);
	}

	/**
	 * Display payment receipt schedule in invoice details 請求書明細入金予定表示.<p>
	 *
	 */
	public void bfw_bal_disp_flg(boolean value) {
		setConstBoolean(offset + 4, $bfw_bal_disp_flg, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 5, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 5, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 6, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 6, $bill_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 7, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 7, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 8, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 8, $wg_nm, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 9, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 9, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 10, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 10, $bcst_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 11, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 11, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 12, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 12, $trd_cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 13, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 13, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 13, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 13, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 13, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 13, $amt_dec_place, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return getConstNumber(offset + 14, $upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		setConstNumber(offset + 14, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		setConstNumber(offset + 14, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		setConstNumber(offset + 14, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		setConstNumber(offset + 14, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		setConstNumber(offset + 14, $upri_dec_place, value);
	}


	public mcframe.clientMSUB.MSUBP0010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 15, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 15, $wrk_no_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR sls_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 16, $sls_amt_p);
	}
	
	public void sls_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 16, $sls_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ret_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 17, $ret_amt_p);
	}
	
	public void ret_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 17, $ret_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 18, $dscnt_amt_p);
	}
	
	public void dscnt_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 18, $dscnt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 19, $tax_amt_p);
	}
	
	public void tax_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 19, $tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR sw_to_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 20, $sw_to_amt_p);
	}
	
	public void sw_to_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 20, $sw_to_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR rcv_schd_amt_total_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 21, $rcv_schd_amt_total_p);
	}
	
	public void rcv_schd_amt_total_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 21, $rcv_schd_amt_total_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR rcv_act_amt_total_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 22, $rcv_act_amt_total_p);
	}
	
	public void rcv_act_amt_total_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 22, $rcv_act_amt_total_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR rcv_schd_amt_bal_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 23, $rcv_schd_amt_bal_p);
	}
	
	public void rcv_schd_amt_bal_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 23, $rcv_schd_amt_bal_p, row);
	}


	/**
	 * Payment receipt schedule adjusted 入金予定調整済.<p>
	 *
	 */
	public boolean rcv_schd_adjst_flg() {
		return getConstBoolean(offset + 24, $rcv_schd_adjst_flg);
	}

	/**
	 * Payment receipt schedule adjusted 入金予定調整済.<p>
	 *
	 */
	public void rcv_schd_adjst_flg(boolean value) {
		setConstBoolean(offset + 24, $rcv_schd_adjst_flg, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 25, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 25, $bill_mng_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 26, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 27, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 27, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 28, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 28, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 29, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 29, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 30, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 30, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 31, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 31, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 32, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 32, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 33, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 33, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 34, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 34, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 35, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 35, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 36, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 36, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 37, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 37, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			return rcv_schd_adjst_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			return rcv_schd_adjst_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			rcv_schd_adjst_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			rcv_schd_adjst_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			return wrk_no_p();
		}
		if ($sls_amt_p.equalsIgnoreCase(name)) {
			return sls_amt_p();
		}
		if ($ret_amt_p.equalsIgnoreCase(name)) {
			return ret_amt_p();
		}
		if ($dscnt_amt_p.equalsIgnoreCase(name)) {
			return dscnt_amt_p();
		}
		if ($tax_amt_p.equalsIgnoreCase(name)) {
			return tax_amt_p();
		}
		if ($sw_to_amt_p.equalsIgnoreCase(name)) {
			return sw_to_amt_p();
		}
		if ($rcv_schd_amt_total_p.equalsIgnoreCase(name)) {
			return rcv_schd_amt_total_p();
		}
		if ($rcv_act_amt_total_p.equalsIgnoreCase(name)) {
			return rcv_act_amt_total_p();
		}
		if ($rcv_schd_amt_bal_p.equalsIgnoreCase(name)) {
			return rcv_schd_amt_bal_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			wrk_no_p(
				((MCContainerMeta) wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0010.WrkNoR.class, value)
			);
			return;
		}
		if ($sls_amt_p.equalsIgnoreCase(name)) {
			sls_amt_p(
				((MCContainerMeta) sls_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ret_amt_p.equalsIgnoreCase(name)) {
			ret_amt_p(
				((MCContainerMeta) ret_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($dscnt_amt_p.equalsIgnoreCase(name)) {
			dscnt_amt_p(
				((MCContainerMeta) dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($tax_amt_p.equalsIgnoreCase(name)) {
			tax_amt_p(
				((MCContainerMeta) tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($sw_to_amt_p.equalsIgnoreCase(name)) {
			sw_to_amt_p(
				((MCContainerMeta) sw_to_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($rcv_schd_amt_total_p.equalsIgnoreCase(name)) {
			rcv_schd_amt_total_p(
				((MCContainerMeta) rcv_schd_amt_total_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($rcv_act_amt_total_p.equalsIgnoreCase(name)) {
			rcv_act_amt_total_p(
				((MCContainerMeta) rcv_act_amt_total_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($rcv_schd_amt_bal_p.equalsIgnoreCase(name)) {
			rcv_schd_amt_bal_p(
				((MCContainerMeta) rcv_schd_amt_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String wrk_no() {
		return wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		wrk_no_p().wrk_nm(value);
	}

	/**
	 * Sales amount 売上額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return sls_amt_p().amt();
	}

	/**
	 * Sales amount 売上額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Sales amount 売上額.<p>
	 *
	 */
	public void sls_amt(int value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Sales amount 売上額.<p>
	 *
	 */
	public void sls_amt(long value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Sales amount 売上額.<p>
	 *
	 */
	public void sls_amt(float value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Sales amount 売上額.<p>
	 *
	 */
	public void sls_amt(double value) {
		sls_amt_p().amt(value);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return ret_amt_p().amt();
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Return amount 返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		ret_amt_p().amt(value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return dscnt_amt_p().amt();
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount 値引額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		dscnt_amt_p().amt(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return tax_amt_p().amt();
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		tax_amt_p().amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return sw_to_amt_p().amt();
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		sw_to_amt_p().amt(value);
	}

	/**
	 * Total amount of payment receipt schedules 入金予定額計.<p>
	 *
	 */
	public MCNumber rcv_schd_amt_total() {
		return rcv_schd_amt_total_p().amt();
	}

	/**
	 * Total amount of payment receipt schedules 入金予定額計.<p>
	 *
	 */
	public void rcv_schd_amt_total(MCNumber value) {
		rcv_schd_amt_total_p().amt(value);
	}

	/**
	 * Total amount of payment receipt schedules 入金予定額計.<p>
	 *
	 */
	public void rcv_schd_amt_total(int value) {
		rcv_schd_amt_total_p().amt(value);
	}

	/**
	 * Total amount of payment receipt schedules 入金予定額計.<p>
	 *
	 */
	public void rcv_schd_amt_total(long value) {
		rcv_schd_amt_total_p().amt(value);
	}

	/**
	 * Total amount of payment receipt schedules 入金予定額計.<p>
	 *
	 */
	public void rcv_schd_amt_total(float value) {
		rcv_schd_amt_total_p().amt(value);
	}

	/**
	 * Total amount of payment receipt schedules 入金予定額計.<p>
	 *
	 */
	public void rcv_schd_amt_total(double value) {
		rcv_schd_amt_total_p().amt(value);
	}

	/**
	 * Payment received result total amount 入金実績額計.<p>
	 *
	 */
	public MCNumber rcv_act_amt_total() {
		return rcv_act_amt_total_p().amt();
	}

	/**
	 * Payment received result total amount 入金実績額計.<p>
	 *
	 */
	public void rcv_act_amt_total(MCNumber value) {
		rcv_act_amt_total_p().amt(value);
	}

	/**
	 * Payment received result total amount 入金実績額計.<p>
	 *
	 */
	public void rcv_act_amt_total(int value) {
		rcv_act_amt_total_p().amt(value);
	}

	/**
	 * Payment received result total amount 入金実績額計.<p>
	 *
	 */
	public void rcv_act_amt_total(long value) {
		rcv_act_amt_total_p().amt(value);
	}

	/**
	 * Payment received result total amount 入金実績額計.<p>
	 *
	 */
	public void rcv_act_amt_total(float value) {
		rcv_act_amt_total_p().amt(value);
	}

	/**
	 * Payment received result total amount 入金実績額計.<p>
	 *
	 */
	public void rcv_act_amt_total(double value) {
		rcv_act_amt_total_p().amt(value);
	}

	/**
	 * Balance of payment receipt schedule 入金予定残高.<p>
	 *
	 */
	public MCNumber rcv_schd_amt_bal() {
		return rcv_schd_amt_bal_p().amt();
	}

	/**
	 * Balance of payment receipt schedule 入金予定残高.<p>
	 *
	 */
	public void rcv_schd_amt_bal(MCNumber value) {
		rcv_schd_amt_bal_p().amt(value);
	}

	/**
	 * Balance of payment receipt schedule 入金予定残高.<p>
	 *
	 */
	public void rcv_schd_amt_bal(int value) {
		rcv_schd_amt_bal_p().amt(value);
	}

	/**
	 * Balance of payment receipt schedule 入金予定残高.<p>
	 *
	 */
	public void rcv_schd_amt_bal(long value) {
		rcv_schd_amt_bal_p().amt(value);
	}

	/**
	 * Balance of payment receipt schedule 入金予定残高.<p>
	 *
	 */
	public void rcv_schd_amt_bal(float value) {
		rcv_schd_amt_bal_p().amt(value);
	}

	/**
	 * Balance of payment receipt schedule 入金予定残高.<p>
	 *
	 */
	public void rcv_schd_amt_bal(double value) {
		rcv_schd_amt_bal_p().amt(value);
	}

}

