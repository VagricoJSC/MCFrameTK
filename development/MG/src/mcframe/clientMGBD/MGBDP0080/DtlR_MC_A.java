package mcframe.clientMGBD.MGBDP0080;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	public static final String $term_p = "term_p";
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $calc_err_flg = "calc_err_flg";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Undeletable 削除不可.<p>
	 *
	 */
	public static final String $non_del_flg = "non_del_flg";
	/**
	 * Calculation first month 計算対象先頭月.<p>
	 *
	 */
	public static final String $st_ym = "st_ym";
	/**
	 * Calculation last month 計算対象末尾月.<p>
	 *
	 */
	public static final String $end_ym = "end_ym";
	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public static final String $calc_usr_cd = "calc_usr_cd";
	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public static final String $calc_usr_nm = "calc_usr_nm";
	/**
	 * Calculation start time 計算開始時刻.<p>
	 *
	 */
	public static final String $calc_st = "calc_st";
	/**
	 * Calculation end time 計算終了時刻.<p>
	 *
	 */
	public static final String $calc_fin = "calc_fin";
	/**
	 * Calculation time (Hour:minute:second) 計算時間（時：分：秒）.<p>
	 *
	 */
	public static final String $calc_time = "calc_time";
	/**
	 * Entry request No. 登録リクエストＮＯ.<p>
	 *
	 */
	public static final String $ins_srv_req_no = "ins_srv_req_no";
	/**
	 * Batch log No. バッチログＮＯ.<p>
	 *
	 */
	public static final String $batch_log_no = "batch_log_no";
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	public static final String $upd_cntr = "upd_cntr";

	public static final String $term = $term_p + ".term";
	public static final String $term_nm = $term_p + ".term_nm";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta term_p_META = createInnerRowMeta($term_p, mcframe.clientMAUB.MAUBP5160.TermR.class);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta calc_err_flg_META = createCommonMeta($calc_err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_del_flg_META = createCommonMeta($non_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_ym_META = createCommonMeta($st_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta end_ym_META = createCommonMeta($end_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_usr_cd_META = createCommonMeta($calc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta calc_usr_nm_META = createCommonMeta($calc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta calc_st_META = createCommonMeta($calc_st, mcframe.commonMA.meta.MA_META.YMDHMS);
	public static final MCMeta calc_fin_META = createCommonMeta($calc_fin, mcframe.commonMA.meta.MA_META.YMDHMS);
	public static final MCMeta calc_time_META = createStringMeta($calc_time);
	public static final MCMeta ins_srv_req_no_META = createCommonMeta($ins_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMG.meta.MG_META.CALC_ARG_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			term_p_META,
			calc_grp_cd_META,
			calc_grp_nm_META,
			calc_no_META,
			calc_err_flg_META,
			fix_flg_META,
			non_del_flg_META,
			st_ym_META,
			end_ym_META,
			calc_usr_cd_META,
			calc_usr_nm_META,
			calc_st_META,
			calc_fin_META,
			calc_time_META,
			ins_srv_req_no_META,
			batch_log_no_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			upd_cntr_META
		},
		new String[][]{
			{
				"term",
				"term_nm"
			},
			{
				$term,
				$term_nm
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	public mcframe.clientMAUB.MAUBP5160.TermR term_p(){
		return (mcframe.clientMAUB.MAUBP5160.TermR) getConstInnerRow(offset + 1, $term_p);
	}
	
	public void term_p(mcframe.clientMAUB.MAUBP5160.TermR row){
		setConstInnerRow(offset + 1, $term_p, row);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 2, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 2, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 3, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 3, $calc_grp_nm, value);
	}


	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 4, $calc_no);
	}

	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 4, $calc_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean calc_err_flg() {
		return getConstBoolean(offset + 5, $calc_err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void calc_err_flg(boolean value) {
		setConstBoolean(offset + 5, $calc_err_flg, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 6, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 6, $fix_flg, value);
	}


	/**
	 * Undeletable 削除不可.<p>
	 *
	 */
	public boolean non_del_flg() {
		return getConstBoolean(offset + 7, $non_del_flg);
	}

	/**
	 * Undeletable 削除不可.<p>
	 *
	 */
	public void non_del_flg(boolean value) {
		setConstBoolean(offset + 7, $non_del_flg, value);
	}


	/**
	 * Calculation first month 計算対象先頭月.<p>
	 *
	 */
	public MCDate st_ym() {
		return getConstDate(offset + 8, $st_ym);
	}

	/**
	 * Calculation first month 計算対象先頭月.<p>
	 *
	 */
	public void st_ym(MCDate value) {
		setConstDate(offset + 8, $st_ym, value);
	}


	/**
	 * Calculation last month 計算対象末尾月.<p>
	 *
	 */
	public MCDate end_ym() {
		return getConstDate(offset + 9, $end_ym);
	}

	/**
	 * Calculation last month 計算対象末尾月.<p>
	 *
	 */
	public void end_ym(MCDate value) {
		setConstDate(offset + 9, $end_ym, value);
	}


	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public String calc_usr_cd() {
		return getConstString(offset + 10, $calc_usr_cd);
	}

	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public void calc_usr_cd(String value) {
		setConstString(offset + 10, $calc_usr_cd, value);
	}


	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public String calc_usr_nm() {
		return getConstString(offset + 11, $calc_usr_nm);
	}

	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public void calc_usr_nm(String value) {
		setConstString(offset + 11, $calc_usr_nm, value);
	}


	/**
	 * Calculation start time 計算開始時刻.<p>
	 *
	 */
	public MCDate calc_st() {
		return getConstDate(offset + 12, $calc_st);
	}

	/**
	 * Calculation start time 計算開始時刻.<p>
	 *
	 */
	public void calc_st(MCDate value) {
		setConstDate(offset + 12, $calc_st, value);
	}


	/**
	 * Calculation end time 計算終了時刻.<p>
	 *
	 */
	public MCDate calc_fin() {
		return getConstDate(offset + 13, $calc_fin);
	}

	/**
	 * Calculation end time 計算終了時刻.<p>
	 *
	 */
	public void calc_fin(MCDate value) {
		setConstDate(offset + 13, $calc_fin, value);
	}


	/**
	 * Calculation time (Hour:minute:second) 計算時間（時：分：秒）.<p>
	 *
	 */
	public String calc_time() {
		return getConstString(offset + 14, $calc_time);
	}

	/**
	 * Calculation time (Hour:minute:second) 計算時間（時：分：秒）.<p>
	 *
	 */
	public void calc_time(String value) {
		setConstString(offset + 14, $calc_time, value);
	}


	/**
	 * Entry request No. 登録リクエストＮＯ.<p>
	 *
	 */
	public String ins_srv_req_no() {
		return getConstString(offset + 15, $ins_srv_req_no);
	}

	/**
	 * Entry request No. 登録リクエストＮＯ.<p>
	 *
	 */
	public void ins_srv_req_no(String value) {
		setConstString(offset + 15, $ins_srv_req_no, value);
	}


	/**
	 * Batch log No. バッチログＮＯ.<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 16, $batch_log_no);
	}

	/**
	 * Batch log No. バッチログＮＯ.<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 16, $batch_log_no, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 17, $rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 17, $rmrks, value);
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
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 21, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 21, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 22, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 22, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 23, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 23, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 24, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 24, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 25, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 25, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 26, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 26, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 27, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 27, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 28, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 28, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 29, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 29, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 30, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 31, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 31, $upd_srv_req_no, value);
	}


	public MCNumber upd_cntr() {
		return getConstNumber(offset + 32, $upd_cntr);
	}

	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}

	public void upd_cntr(int value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}

	public void upd_cntr(long value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}

	public void upd_cntr(float value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}

	public void upd_cntr(double value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			return calc_usr_cd();
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			return calc_usr_nm();
		}
		if ($calc_time.equalsIgnoreCase(name)) {
			return calc_time();
		}
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			return ins_srv_req_no();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_ym.equalsIgnoreCase(name)) {
			return st_ym();
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			return end_ym();
		}
		if ($calc_st.equalsIgnoreCase(name)) {
			return calc_st();
		}
		if ($calc_fin.equalsIgnoreCase(name)) {
			return calc_fin();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($calc_err_flg.equalsIgnoreCase(name)) {
			return calc_err_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($non_del_flg.equalsIgnoreCase(name)) {
			return non_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			return calc_usr_cd();
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			return calc_usr_nm();
		}
		if ($calc_time.equalsIgnoreCase(name)) {
			return calc_time();
		}
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			return ins_srv_req_no();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_ym.equalsIgnoreCase(name)) {
			return st_ym();
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			return end_ym();
		}
		if ($calc_st.equalsIgnoreCase(name)) {
			return calc_st();
		}
		if ($calc_fin.equalsIgnoreCase(name)) {
			return calc_fin();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($calc_err_flg.equalsIgnoreCase(name)) {
			return calc_err_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($non_del_flg.equalsIgnoreCase(name)) {
			return non_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			calc_usr_cd(value);
			return;
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			calc_usr_nm(value);
			return;
		}
		if ($calc_time.equalsIgnoreCase(name)) {
			calc_time(value);
			return;
		}
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			ins_srv_req_no(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_ym.equalsIgnoreCase(name)) {
			st_ym(value);
			return;
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			end_ym(value);
			return;
		}
		if ($calc_st.equalsIgnoreCase(name)) {
			calc_st(value);
			return;
		}
		if ($calc_fin.equalsIgnoreCase(name)) {
			calc_fin(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($calc_err_flg.equalsIgnoreCase(name)) {
			calc_err_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($non_del_flg.equalsIgnoreCase(name)) {
			non_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			calc_usr_cd(value);
			return;
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			calc_usr_nm(value);
			return;
		}
		if ($calc_time.equalsIgnoreCase(name)) {
			calc_time(value);
			return;
		}
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			ins_srv_req_no(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_ym.equalsIgnoreCase(name)) {
			st_ym(value);
			return;
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			end_ym(value);
			return;
		}
		if ($calc_st.equalsIgnoreCase(name)) {
			calc_st(value);
			return;
		}
		if ($calc_fin.equalsIgnoreCase(name)) {
			calc_fin(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($calc_err_flg.equalsIgnoreCase(name)) {
			calc_err_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($non_del_flg.equalsIgnoreCase(name)) {
			non_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($term_p.equalsIgnoreCase(name)) {
			return term_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($term_p.equalsIgnoreCase(name)) {
			term_p(
				((MCContainerMeta) term_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5160.TermR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate term() {
		return term_p().term();
	}

	public void term(MCDate value) {
		term_p().term(value);
	}

	public String term_nm() {
		return term_p().term_nm();
	}

	public void term_nm(String value) {
		term_p().term_nm(value);
	}

}

