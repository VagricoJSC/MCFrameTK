package mcframe.clientMSBB.MSBBP1030;

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
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	public static final String $budget_p = "budget_p";
	/**
	 * Sales project status cd. 案件状況ＣＤ.<p>
	 *
	 */
	public static final String $wrk_sts_cd = "wrk_sts_cd";
	/**
	 * Sales project status name 案件状況名.<p>
	 *
	 */
	public static final String $wrk_sts_nm = "wrk_sts_nm";
	/**
	 * Sales order accuracy cd. 受注確度ＣＤ.<p>
	 *
	 */
	public static final String $slo_acc_cd = "slo_acc_cd";
	/**
	 * Sales order accuracy name 受注確度名.<p>
	 *
	 */
	public static final String $slo_acc_nm = "slo_acc_nm";
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
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * Sales project overview 案件概要.<p>
	 *
	 */
	public static final String $wrk_desc = "wrk_desc";
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
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";

	public static final String $budget = $budget_p + ".amt";

	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta term_cond_META = createCommonMeta($term_cond, mcframe.commonMS.meta.MS_META.WRK_TERM_COND);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta budget_p_META = createInnerRowMeta($budget_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta wrk_sts_cd_META = createCommonMeta($wrk_sts_cd, mcframe.commonMS.meta.MS_META.WRK_MNG_CD);
	public static final MCMeta wrk_sts_nm_META = createCommonMeta($wrk_sts_nm, mcframe.commonMS.meta.MS_META.WRK_MNG_NM);
	public static final MCMeta slo_acc_cd_META = createCommonMeta($slo_acc_cd, mcframe.commonMS.meta.MS_META.WRK_MNG_CD);
	public static final MCMeta slo_acc_nm_META = createCommonMeta($slo_acc_nm, mcframe.commonMS.meta.MS_META.WRK_MNG_NM);
	public static final MCMeta wrk_ar_flg_META = createCommonMeta($wrk_ar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_ap_flg_META = createCommonMeta($wrk_ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_rsn_META = createCommonMeta($slo_rsn, mcframe.commonMS.meta.MS_META.WRK_SLO_RSN);
	public static final MCMeta fail_rsn_META = createCommonMeta($fail_rsn, mcframe.commonMS.meta.MS_META.WRK_FAIL_RSN);
	public static final MCMeta wrk_rmrks_META = createCommonMeta($wrk_rmrks, mcframe.commonMS.meta.MS_META.WRK_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.WRK_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.WRK_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.WRK_SUB_CHAR3);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_desc_META = createCommonMeta($wrk_desc, mcframe.commonMS.meta.MS_META.WRK_DESC);
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
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wrk_no_META,
			wrk_nm_META,
			st_dt_META,
			end_dt_META,
			term_cond_META,
			cur_cd_META,
			cur_nm_META,
			amt_dec_place_META,
			budget_p_META,
			wrk_sts_cd_META,
			wrk_sts_nm_META,
			slo_acc_cd_META,
			slo_acc_nm_META,
			wrk_ar_flg_META,
			wrk_ap_flg_META,
			slo_rsn_META,
			fail_rsn_META,
			wrk_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			can_flg_META,
			wrk_desc_META,
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
			upd_srv_req_no_META,
			upd_cntr_META
		},
		new String[][]{
			{
				"budget"
			},
			{
				$budget
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$wrk_sts_cd, "wrk_mng_nm"},	// wrk_sts_cd
				{$slo_acc_cd, "wrk_mng_nm"}	// slo_acc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
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
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 0, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 0, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 1, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 1, $wrk_nm, value);
	}


	/**
	 * Sales project start date 案件開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 2, $st_dt);
	}

	/**
	 * Sales project start date 案件開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 2, $st_dt, value);
	}


	/**
	 * Sales project end date 案件終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 3, $end_dt);
	}

	/**
	 * Sales project end date 案件終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 3, $end_dt, value);
	}


	/**
	 * Contract terms 契約条件.<p>
	 *
	 */
	public String term_cond() {
		return getConstString(offset + 4, $term_cond);
	}

	/**
	 * Contract terms 契約条件.<p>
	 *
	 */
	public void term_cond(String value) {
		setConstString(offset + 4, $term_cond, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 5, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 5, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 6, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 6, $cur_nm, value);
	}


	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 7, $amt_dec_place);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount decimal places 金額小数部桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR budget_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 8, $budget_p);
	}
	
	public void budget_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 8, $budget_p, row);
	}


	/**
	 * Sales project status cd. 案件状況ＣＤ.<p>
	 *
	 */
	public String wrk_sts_cd() {
		return getConstString(offset + 9, $wrk_sts_cd);
	}

	/**
	 * Sales project status cd. 案件状況ＣＤ.<p>
	 *
	 */
	public void wrk_sts_cd(String value) {
		setConstString(offset + 9, $wrk_sts_cd, value);
	}


	/**
	 * Sales project status name 案件状況名.<p>
	 *
	 */
	public String wrk_sts_nm() {
		return getConstString(offset + 10, $wrk_sts_nm);
	}

	/**
	 * Sales project status name 案件状況名.<p>
	 *
	 */
	public void wrk_sts_nm(String value) {
		setConstString(offset + 10, $wrk_sts_nm, value);
	}


	/**
	 * Sales order accuracy cd. 受注確度ＣＤ.<p>
	 *
	 */
	public String slo_acc_cd() {
		return getConstString(offset + 11, $slo_acc_cd);
	}

	/**
	 * Sales order accuracy cd. 受注確度ＣＤ.<p>
	 *
	 */
	public void slo_acc_cd(String value) {
		setConstString(offset + 11, $slo_acc_cd, value);
	}


	/**
	 * Sales order accuracy name 受注確度名.<p>
	 *
	 */
	public String slo_acc_nm() {
		return getConstString(offset + 12, $slo_acc_nm);
	}

	/**
	 * Sales order accuracy name 受注確度名.<p>
	 *
	 */
	public void slo_acc_nm(String value) {
		setConstString(offset + 12, $slo_acc_nm, value);
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
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 21, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 21, $can_flg, value);
	}


	/**
	 * Sales project overview 案件概要.<p>
	 *
	 */
	public String wrk_desc() {
		return getConstString(offset + 22, $wrk_desc);
	}

	/**
	 * Sales project overview 案件概要.<p>
	 *
	 */
	public void wrk_desc(String value) {
		setConstString(offset + 22, $wrk_desc, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 23, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 23, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 24, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 24, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 25, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 25, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 26, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 26, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 27, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 27, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 28, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 28, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 29, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 29, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 30, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 30, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 31, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 31, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 32, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 32, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 33, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 33, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 34, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($term_cond.equalsIgnoreCase(name)) {
			return term_cond();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($wrk_sts_cd.equalsIgnoreCase(name)) {
			return wrk_sts_cd();
		}
		if ($wrk_sts_nm.equalsIgnoreCase(name)) {
			return wrk_sts_nm();
		}
		if ($slo_acc_cd.equalsIgnoreCase(name)) {
			return slo_acc_cd();
		}
		if ($slo_acc_nm.equalsIgnoreCase(name)) {
			return slo_acc_nm();
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
		if ($wrk_desc.equalsIgnoreCase(name)) {
			return wrk_desc();
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
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
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
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
		if ($term_cond.equalsIgnoreCase(name)) {
			return term_cond();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($wrk_sts_cd.equalsIgnoreCase(name)) {
			return wrk_sts_cd();
		}
		if ($wrk_sts_nm.equalsIgnoreCase(name)) {
			return wrk_sts_nm();
		}
		if ($slo_acc_cd.equalsIgnoreCase(name)) {
			return slo_acc_cd();
		}
		if ($slo_acc_nm.equalsIgnoreCase(name)) {
			return slo_acc_nm();
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
		if ($wrk_desc.equalsIgnoreCase(name)) {
			return wrk_desc();
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
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
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
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
		if ($term_cond.equalsIgnoreCase(name)) {
			term_cond(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($wrk_sts_cd.equalsIgnoreCase(name)) {
			wrk_sts_cd(value);
			return;
		}
		if ($wrk_sts_nm.equalsIgnoreCase(name)) {
			wrk_sts_nm(value);
			return;
		}
		if ($slo_acc_cd.equalsIgnoreCase(name)) {
			slo_acc_cd(value);
			return;
		}
		if ($slo_acc_nm.equalsIgnoreCase(name)) {
			slo_acc_nm(value);
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
		if ($wrk_desc.equalsIgnoreCase(name)) {
			wrk_desc(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
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
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			wrk_ar_flg(value);
			return;
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			wrk_ap_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
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
		if ($term_cond.equalsIgnoreCase(name)) {
			term_cond(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($wrk_sts_cd.equalsIgnoreCase(name)) {
			wrk_sts_cd(value);
			return;
		}
		if ($wrk_sts_nm.equalsIgnoreCase(name)) {
			wrk_sts_nm(value);
			return;
		}
		if ($slo_acc_cd.equalsIgnoreCase(name)) {
			slo_acc_cd(value);
			return;
		}
		if ($slo_acc_nm.equalsIgnoreCase(name)) {
			slo_acc_nm(value);
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
		if ($wrk_desc.equalsIgnoreCase(name)) {
			wrk_desc(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
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
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			wrk_ar_flg(value);
			return;
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			wrk_ap_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($budget_p.equalsIgnoreCase(name)) {
			return budget_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($budget_p.equalsIgnoreCase(name)) {
			budget_p(
				((MCContainerMeta) budget_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Budget 予算.<p>
	 *
	 */
	public MCNumber budget() {
		return budget_p().amt();
	}

	/**
	 * Budget 予算.<p>
	 *
	 */
	public void budget(MCNumber value) {
		budget_p().amt(value);
	}

	/**
	 * Budget 予算.<p>
	 *
	 */
	public void budget(int value) {
		budget_p().amt(value);
	}

	/**
	 * Budget 予算.<p>
	 *
	 */
	public void budget(long value) {
		budget_p().amt(value);
	}

	/**
	 * Budget 予算.<p>
	 *
	 */
	public void budget(float value) {
		budget_p().amt(value);
	}

	/**
	 * Budget 予算.<p>
	 *
	 */
	public void budget(double value) {
		budget_p().amt(value);
	}

}

