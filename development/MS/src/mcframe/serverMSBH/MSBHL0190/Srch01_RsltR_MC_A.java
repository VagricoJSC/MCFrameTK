package mcframe.serverMSBH.MSBHL0190;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public static final String $pay_ntc_rev = "pay_ntc_rev";
	/**
	 * Latest flg. 最新ＦＬＧ.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";
	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public static final String $bsppl_cl_dt = "bsppl_cl_dt";
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public static final String $reg_dt = "reg_dt";
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
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
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public static final String $bsppl_nm = "bsppl_nm";
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public static final String $bsppl_dpt_nm = "bsppl_dpt_nm";
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
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public static final String $pay_xrate = "pay_xrate";
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
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public static final String $last_pay_schd_amt = "last_pay_schd_amt";
	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public static final String $pay_amt = "pay_amt";
	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public static final String $sw_amt = "sw_amt";
	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public static final String $bfw_amt = "bfw_amt";
	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public static final String $purc_amt = "purc_amt";
	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public static final String $purc_dscnt_amt = "purc_dscnt_amt";
	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public static final String $purc_ret_amt = "purc_ret_amt";
	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public static final String $sw_to_amt = "sw_to_amt";
	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public static final String $schd_pay_amt = "schd_pay_amt";
	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public static final String $adv_pay_bal = "adv_pay_bal";
	/**
	 * Advance payment amount 前渡金支払額.<p>
	 *
	 */
	public static final String $adv_pay_amt = "adv_pay_amt";
	/**
	 * Advance payment offset amount 前渡金相殺額.<p>
	 *
	 */
	public static final String $adv_pay_setoff_amt = "adv_pay_setoff_amt";
	/**
	 * Advance payment offset tax amount 前渡金相殺税額.<p>
	 *
	 */
	public static final String $adv_pay_setoff_tax_amt = "adv_pay_setoff_tax_amt";
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


	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta pay_ntc_rev_META = createCommonMeta($pay_ntc_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_cl_dt_META = createCommonMeta($bsppl_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta reg_dt_META = createCommonMeta($reg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_META = createCommonMeta($bsppl_dpt_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta pay_xrate_META = createCommonMeta($pay_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta last_pay_schd_amt_META = createCommonMeta($last_pay_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_amt_META = createCommonMeta($pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bfw_amt_META = createCommonMeta($bfw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_amt_META = createCommonMeta($purc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_dscnt_amt_META = createCommonMeta($purc_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_ret_amt_META = createCommonMeta($purc_ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_pay_amt_META = createCommonMeta($schd_pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_pay_bal_META = createCommonMeta($adv_pay_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_pay_amt_META = createCommonMeta($adv_pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_pay_setoff_amt_META = createCommonMeta($adv_pay_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_pay_setoff_tax_amt_META = createCommonMeta($adv_pay_setoff_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR3);
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

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pay_chk_no_META,
			pay_ntc_rev_META,
			latest_flg_META,
			can_flg_META,
			bsppl_cl_dt_META,
			reg_dt_META,
			pay_spot_flg_META,
			rcpt_iv_no_META,
			wrk_no_META,
			wrk_nm_META,
			bsppl_cd_META,
			bsppl_nm_META,
			bsppl_dpt_cd_META,
			bsppl_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			pay_xrate_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			base_cur_cd_META,
			base_cur_nm_META,
			last_pay_schd_amt_META,
			pay_amt_META,
			sw_amt_META,
			bfw_amt_META,
			purc_amt_META,
			purc_dscnt_amt_META,
			purc_ret_amt_META,
			setoff_amt_META,
			tax_amt_META,
			sw_to_amt_META,
			schd_pay_amt_META,
			adv_pay_bal_META,
			adv_pay_amt_META,
			adv_pay_setoff_amt_META,
			adv_pay_setoff_tax_amt_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
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
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 0, $pay_chk_no);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 0, $pay_chk_no, value);
	}


	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public MCNumber pay_ntc_rev() {
		return getConstNumber(offset + 1, $pay_ntc_rev);
	}

	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(MCNumber value) {
		setConstNumber(offset + 1, $pay_ntc_rev, value);
	}

	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(int value) {
		setConstNumber(offset + 1, $pay_ntc_rev, value);
	}

	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(long value) {
		setConstNumber(offset + 1, $pay_ntc_rev, value);
	}

	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(float value) {
		setConstNumber(offset + 1, $pay_ntc_rev, value);
	}

	/**
	 * Payment notice rev. number 支払通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(double value) {
		setConstNumber(offset + 1, $pay_ntc_rev, value);
	}


	/**
	 * Latest flg. 最新ＦＬＧ.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 2, $latest_flg);
	}

	/**
	 * Latest flg. 最新ＦＬＧ.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 2, $latest_flg, value);
	}


	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 3, $can_flg);
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 3, $can_flg, value);
	}


	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public MCDate bsppl_cl_dt() {
		return getConstDate(offset + 4, $bsppl_cl_dt);
	}

	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public void bsppl_cl_dt(MCDate value) {
		setConstDate(offset + 4, $bsppl_cl_dt, value);
	}


	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return getConstDate(offset + 5, $reg_dt);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		setConstDate(offset + 5, $reg_dt, value);
	}


	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 6, $pay_spot_flg);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 6, $pay_spot_flg, value);
	}


	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 7, $rcpt_iv_no);
	}

	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 7, $rcpt_iv_no, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 8, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 8, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 9, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 9, $wrk_nm, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 10, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 10, $bsppl_cd, value);
	}


	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 11, $bsppl_nm);
	}

	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 11, $bsppl_nm, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 12, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 12, $bsppl_dpt_cd, value);
	}


	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public String bsppl_dpt_nm() {
		return getConstString(offset + 13, $bsppl_dpt_nm);
	}

	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public void bsppl_dpt_nm(String value) {
		setConstString(offset + 13, $bsppl_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 14, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 14, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 15, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 15, $wg_nm, value);
	}


	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public MCNumber pay_xrate() {
		return getConstNumber(offset + 16, $pay_xrate);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(MCNumber value) {
		setConstNumber(offset + 16, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(int value) {
		setConstNumber(offset + 16, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(long value) {
		setConstNumber(offset + 16, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(float value) {
		setConstNumber(offset + 16, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(double value) {
		setConstNumber(offset + 16, $pay_xrate, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 17, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 17, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 18, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 18, $trd_cur_nm, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 19, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 19, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 20, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 20, $base_cur_nm, value);
	}


	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public MCNumber last_pay_schd_amt() {
		return getConstNumber(offset + 21, $last_pay_schd_amt);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(MCNumber value) {
		setConstNumber(offset + 21, $last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(int value) {
		setConstNumber(offset + 21, $last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(long value) {
		setConstNumber(offset + 21, $last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(float value) {
		setConstNumber(offset + 21, $last_pay_schd_amt, value);
	}

	/**
	 * Last payment schedule amount 前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(double value) {
		setConstNumber(offset + 21, $last_pay_schd_amt, value);
	}


	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public MCNumber pay_amt() {
		return getConstNumber(offset + 22, $pay_amt);
	}

	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public void pay_amt(MCNumber value) {
		setConstNumber(offset + 22, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public void pay_amt(int value) {
		setConstNumber(offset + 22, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public void pay_amt(long value) {
		setConstNumber(offset + 22, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public void pay_amt(float value) {
		setConstNumber(offset + 22, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払額.<p>
	 *
	 */
	public void pay_amt(double value) {
		setConstNumber(offset + 22, $pay_amt, value);
	}


	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 23, $sw_amt);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 23, $sw_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 23, $sw_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 23, $sw_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 23, $sw_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 23, $sw_amt, value);
	}


	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return getConstNumber(offset + 24, $bfw_amt);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		setConstNumber(offset + 24, $bfw_amt, value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(int value) {
		setConstNumber(offset + 24, $bfw_amt, value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(long value) {
		setConstNumber(offset + 24, $bfw_amt, value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(float value) {
		setConstNumber(offset + 24, $bfw_amt, value);
	}

	/**
	 * Current carry-over amount 今回繰越額.<p>
	 *
	 */
	public void bfw_amt(double value) {
		setConstNumber(offset + 24, $bfw_amt, value);
	}


	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return getConstNumber(offset + 25, $purc_amt);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		setConstNumber(offset + 25, $purc_amt, value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(int value) {
		setConstNumber(offset + 25, $purc_amt, value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(long value) {
		setConstNumber(offset + 25, $purc_amt, value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(float value) {
		setConstNumber(offset + 25, $purc_amt, value);
	}

	/**
	 * Current purchase amount 今回仕入額.<p>
	 *
	 */
	public void purc_amt(double value) {
		setConstNumber(offset + 25, $purc_amt, value);
	}


	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public MCNumber purc_dscnt_amt() {
		return getConstNumber(offset + 26, $purc_dscnt_amt);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 26, $purc_dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(int value) {
		setConstNumber(offset + 26, $purc_dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(long value) {
		setConstNumber(offset + 26, $purc_dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(float value) {
		setConstNumber(offset + 26, $purc_dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void purc_dscnt_amt(double value) {
		setConstNumber(offset + 26, $purc_dscnt_amt, value);
	}


	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public MCNumber purc_ret_amt() {
		return getConstNumber(offset + 27, $purc_ret_amt);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void purc_ret_amt(MCNumber value) {
		setConstNumber(offset + 27, $purc_ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void purc_ret_amt(int value) {
		setConstNumber(offset + 27, $purc_ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void purc_ret_amt(long value) {
		setConstNumber(offset + 27, $purc_ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void purc_ret_amt(float value) {
		setConstNumber(offset + 27, $purc_ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void purc_ret_amt(double value) {
		setConstNumber(offset + 27, $purc_ret_amt, value);
	}


	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 28, $setoff_amt);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 28, $setoff_amt, value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 28, $setoff_amt, value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 28, $setoff_amt, value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 28, $setoff_amt, value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 28, $setoff_amt, value);
	}


	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 29, $tax_amt);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 29, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 29, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 29, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 29, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 29, $tax_amt, value);
	}


	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 30, $sw_to_amt);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 30, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 30, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 30, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 30, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount (Transfer destination) 今回振替額（振替先）.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 30, $sw_to_amt, value);
	}


	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public MCNumber schd_pay_amt() {
		return getConstNumber(offset + 31, $schd_pay_amt);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(MCNumber value) {
		setConstNumber(offset + 31, $schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(int value) {
		setConstNumber(offset + 31, $schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(long value) {
		setConstNumber(offset + 31, $schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(float value) {
		setConstNumber(offset + 31, $schd_pay_amt, value);
	}

	/**
	 * Current scheduled payment amount 今回支払予定額.<p>
	 *
	 */
	public void schd_pay_amt(double value) {
		setConstNumber(offset + 31, $schd_pay_amt, value);
	}


	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public MCNumber adv_pay_bal() {
		return getConstNumber(offset + 32, $adv_pay_bal);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(MCNumber value) {
		setConstNumber(offset + 32, $adv_pay_bal, value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(int value) {
		setConstNumber(offset + 32, $adv_pay_bal, value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(long value) {
		setConstNumber(offset + 32, $adv_pay_bal, value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(float value) {
		setConstNumber(offset + 32, $adv_pay_bal, value);
	}

	/**
	 * Advance payment balance 前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(double value) {
		setConstNumber(offset + 32, $adv_pay_bal, value);
	}


	/**
	 * Advance payment amount 前渡金支払額.<p>
	 *
	 */
	public MCNumber adv_pay_amt() {
		return getConstNumber(offset + 33, $adv_pay_amt);
	}

	/**
	 * Advance payment amount 前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(MCNumber value) {
		setConstNumber(offset + 33, $adv_pay_amt, value);
	}

	/**
	 * Advance payment amount 前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(int value) {
		setConstNumber(offset + 33, $adv_pay_amt, value);
	}

	/**
	 * Advance payment amount 前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(long value) {
		setConstNumber(offset + 33, $adv_pay_amt, value);
	}

	/**
	 * Advance payment amount 前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(float value) {
		setConstNumber(offset + 33, $adv_pay_amt, value);
	}

	/**
	 * Advance payment amount 前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(double value) {
		setConstNumber(offset + 33, $adv_pay_amt, value);
	}


	/**
	 * Advance payment offset amount 前渡金相殺額.<p>
	 *
	 */
	public MCNumber adv_pay_setoff_amt() {
		return getConstNumber(offset + 34, $adv_pay_setoff_amt);
	}

	/**
	 * Advance payment offset amount 前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(MCNumber value) {
		setConstNumber(offset + 34, $adv_pay_setoff_amt, value);
	}

	/**
	 * Advance payment offset amount 前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(int value) {
		setConstNumber(offset + 34, $adv_pay_setoff_amt, value);
	}

	/**
	 * Advance payment offset amount 前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(long value) {
		setConstNumber(offset + 34, $adv_pay_setoff_amt, value);
	}

	/**
	 * Advance payment offset amount 前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(float value) {
		setConstNumber(offset + 34, $adv_pay_setoff_amt, value);
	}

	/**
	 * Advance payment offset amount 前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(double value) {
		setConstNumber(offset + 34, $adv_pay_setoff_amt, value);
	}


	/**
	 * Advance payment offset tax amount 前渡金相殺税額.<p>
	 *
	 */
	public MCNumber adv_pay_setoff_tax_amt() {
		return getConstNumber(offset + 35, $adv_pay_setoff_tax_amt);
	}

	/**
	 * Advance payment offset tax amount 前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 35, $adv_pay_setoff_tax_amt, value);
	}

	/**
	 * Advance payment offset tax amount 前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(int value) {
		setConstNumber(offset + 35, $adv_pay_setoff_tax_amt, value);
	}

	/**
	 * Advance payment offset tax amount 前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(long value) {
		setConstNumber(offset + 35, $adv_pay_setoff_tax_amt, value);
	}

	/**
	 * Advance payment offset tax amount 前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(float value) {
		setConstNumber(offset + 35, $adv_pay_setoff_tax_amt, value);
	}

	/**
	 * Advance payment offset tax amount 前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(double value) {
		setConstNumber(offset + 35, $adv_pay_setoff_tax_amt, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 36, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 36, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 37, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 37, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 38, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 38, $sub_char3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 39, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 39, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 40, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 40, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 41, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 41, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 42, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 42, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 43, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 43, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 44, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 44, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 45, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 45, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 46, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 46, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 47, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 47, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 48, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 48, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 49, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 49, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
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
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			return pay_ntc_rev();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			return last_pay_schd_amt();
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			return pay_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_dscnt_amt();
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			return purc_ret_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			return schd_pay_amt();
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			return adv_pay_bal();
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			return adv_pay_amt();
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			return adv_pay_setoff_amt();
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			return adv_pay_setoff_tax_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			return bsppl_cl_dt();
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
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
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			return pay_ntc_rev();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			return last_pay_schd_amt();
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			return pay_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_dscnt_amt();
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			return purc_ret_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			return schd_pay_amt();
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			return adv_pay_bal();
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			return adv_pay_amt();
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			return adv_pay_setoff_amt();
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			return adv_pay_setoff_tax_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			return bsppl_cl_dt();
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
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
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			bsppl_cl_dt(value);
			return;
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_nm.equalsIgnoreCase(name)) {
			bsppl_dpt_nm(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
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
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			bsppl_cl_dt(value);
			return;
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

