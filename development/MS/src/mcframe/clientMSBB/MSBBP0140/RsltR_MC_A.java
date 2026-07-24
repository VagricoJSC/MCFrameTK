package mcframe.clientMSBB.MSBBP0140;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Version バージョン.<p>
	 *
	 */
	public static final String $spln_vers = "spln_vers";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
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
	 * Sales start month 販売開始年月.<p>
	 *
	 */
	public static final String $spln_st_ym = "spln_st_ym";
	/**
	 * Sales end month 販売終了年月.<p>
	 *
	 */
	public static final String $spln_end_ym = "spln_end_ym";
	/**
	 * Edited 編集済.<p>
	 *
	 */
	public static final String $edited_flg = "edited_flg";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Adopt 採用.<p>
	 *
	 */
	public static final String $adopted_flg = "adopted_flg";
	/**
	 * Uncorrectable 訂正不可.<p>
	 *
	 */
	public static final String $locked_flg = "locked_flg";
	/**
	 * Comparison version 比較バージョン.<p>
	 *
	 */
	public static final String $ref_vers = "ref_vers";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $usr_intr_rmrks = "usr_intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $usr_sub_char1 = "usr_sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $usr_sub_char2 = "usr_sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $usr_sub_char3 = "usr_sub_char3";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $sum_intr_rmrks = "sum_intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sum_sub_char1 = "sum_sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sum_sub_char2 = "sum_sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sum_sub_char3 = "sum_sub_char3";
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


	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta spln_vers_META = createCommonMeta($spln_vers, mcframe.commonMS.meta.MS_META.SPLN_VERS);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta spln_st_ym_META = createCommonMeta($spln_st_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta spln_end_ym_META = createCommonMeta($spln_end_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta edited_flg_META = createCommonMeta($edited_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adopted_flg_META = createCommonMeta($adopted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta locked_flg_META = createCommonMeta($locked_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ref_vers_META = createCommonMeta($ref_vers, mcframe.commonMS.meta.MS_META.SPLN_VERS);
	public static final MCMeta usr_intr_rmrks_META = createCommonMeta($usr_intr_rmrks, mcframe.commonMS.meta.MS_META.SPLN_USR_INTR_RMRKS);
	public static final MCMeta usr_sub_char1_META = createCommonMeta($usr_sub_char1, mcframe.commonMS.meta.MS_META.SPLN_USR_SUB_CHAR1);
	public static final MCMeta usr_sub_char2_META = createCommonMeta($usr_sub_char2, mcframe.commonMS.meta.MS_META.SPLN_USR_SUB_CHAR2);
	public static final MCMeta usr_sub_char3_META = createCommonMeta($usr_sub_char3, mcframe.commonMS.meta.MS_META.SPLN_USR_SUB_CHAR3);
	public static final MCMeta sum_intr_rmrks_META = createCommonMeta($sum_intr_rmrks, mcframe.commonMS.meta.MS_META.SPLN_SUM_INTR_RMRKS);
	public static final MCMeta sum_sub_char1_META = createCommonMeta($sum_sub_char1, mcframe.commonMS.meta.MS_META.SPLN_SUM_SUB_CHAR1);
	public static final MCMeta sum_sub_char2_META = createCommonMeta($sum_sub_char2, mcframe.commonMS.meta.MS_META.SPLN_SUM_SUB_CHAR2);
	public static final MCMeta sum_sub_char3_META = createCommonMeta($sum_sub_char3, mcframe.commonMS.meta.MS_META.SPLN_SUM_SUB_CHAR3);
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

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ym_META,
			spln_vers_META,
			usr_cd_META,
			usr_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			cst_cd_META,
			cst_nm_META,
			wrk_no_META,
			wrk_nm_META,
			spln_st_ym_META,
			spln_end_ym_META,
			edited_flg_META,
			fix_flg_META,
			adopted_flg_META,
			locked_flg_META,
			ref_vers_META,
			usr_intr_rmrks_META,
			usr_sub_char1_META,
			usr_sub_char2_META,
			usr_sub_char3_META,
			sum_intr_rmrks_META,
			sum_sub_char1_META,
			sum_sub_char2_META,
			sum_sub_char3_META,
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
			upd_srv_req_no_META
		},
		new String[][]{
			{
			},
			{
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
				{$wrk_no, "WRK"},	// wrk_no
				{$wrk_nm, "WRK"}	// wrk_nm
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 0, $ym);
	}

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 0, $ym, value);
	}


	/**
	 * Version バージョン.<p>
	 *
	 */
	public String spln_vers() {
		return getConstString(offset + 1, $spln_vers);
	}

	/**
	 * Version バージョン.<p>
	 *
	 */
	public void spln_vers(String value) {
		setConstString(offset + 1, $spln_vers, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 2, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 2, $usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 3, $usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 3, $usr_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 4, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 4, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 5, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 5, $dpt_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 6, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 6, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 7, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 7, $cst_nm, value);
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
	 * Sales start month 販売開始年月.<p>
	 *
	 */
	public MCDate spln_st_ym() {
		return getConstDate(offset + 10, $spln_st_ym);
	}

	/**
	 * Sales start month 販売開始年月.<p>
	 *
	 */
	public void spln_st_ym(MCDate value) {
		setConstDate(offset + 10, $spln_st_ym, value);
	}


	/**
	 * Sales end month 販売終了年月.<p>
	 *
	 */
	public MCDate spln_end_ym() {
		return getConstDate(offset + 11, $spln_end_ym);
	}

	/**
	 * Sales end month 販売終了年月.<p>
	 *
	 */
	public void spln_end_ym(MCDate value) {
		setConstDate(offset + 11, $spln_end_ym, value);
	}


	/**
	 * Edited 編集済.<p>
	 *
	 */
	public boolean edited_flg() {
		return getConstBoolean(offset + 12, $edited_flg);
	}

	/**
	 * Edited 編集済.<p>
	 *
	 */
	public void edited_flg(boolean value) {
		setConstBoolean(offset + 12, $edited_flg, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 13, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 13, $fix_flg, value);
	}


	/**
	 * Adopt 採用.<p>
	 *
	 */
	public boolean adopted_flg() {
		return getConstBoolean(offset + 14, $adopted_flg);
	}

	/**
	 * Adopt 採用.<p>
	 *
	 */
	public void adopted_flg(boolean value) {
		setConstBoolean(offset + 14, $adopted_flg, value);
	}


	/**
	 * Uncorrectable 訂正不可.<p>
	 *
	 */
	public boolean locked_flg() {
		return getConstBoolean(offset + 15, $locked_flg);
	}

	/**
	 * Uncorrectable 訂正不可.<p>
	 *
	 */
	public void locked_flg(boolean value) {
		setConstBoolean(offset + 15, $locked_flg, value);
	}


	/**
	 * Comparison version 比較バージョン.<p>
	 *
	 */
	public String ref_vers() {
		return getConstString(offset + 16, $ref_vers);
	}

	/**
	 * Comparison version 比較バージョン.<p>
	 *
	 */
	public void ref_vers(String value) {
		setConstString(offset + 16, $ref_vers, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String usr_intr_rmrks() {
		return getConstString(offset + 17, $usr_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void usr_intr_rmrks(String value) {
		setConstString(offset + 17, $usr_intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String usr_sub_char1() {
		return getConstString(offset + 18, $usr_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void usr_sub_char1(String value) {
		setConstString(offset + 18, $usr_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String usr_sub_char2() {
		return getConstString(offset + 19, $usr_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void usr_sub_char2(String value) {
		setConstString(offset + 19, $usr_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String usr_sub_char3() {
		return getConstString(offset + 20, $usr_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void usr_sub_char3(String value) {
		setConstString(offset + 20, $usr_sub_char3, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String sum_intr_rmrks() {
		return getConstString(offset + 21, $sum_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void sum_intr_rmrks(String value) {
		setConstString(offset + 21, $sum_intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sum_sub_char1() {
		return getConstString(offset + 22, $sum_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sum_sub_char1(String value) {
		setConstString(offset + 22, $sum_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sum_sub_char2() {
		return getConstString(offset + 23, $sum_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sum_sub_char2(String value) {
		setConstString(offset + 23, $sum_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sum_sub_char3() {
		return getConstString(offset + 24, $sum_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sum_sub_char3(String value) {
		setConstString(offset + 24, $sum_sub_char3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 25, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 25, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 26, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 26, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 27, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 27, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 28, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 28, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 29, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 29, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 30, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 30, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 31, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 31, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 32, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 32, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 33, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 33, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 34, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 34, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 35, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 35, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($spln_vers.equalsIgnoreCase(name)) {
			return spln_vers();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($ref_vers.equalsIgnoreCase(name)) {
			return ref_vers();
		}
		if ($usr_intr_rmrks.equalsIgnoreCase(name)) {
			return usr_intr_rmrks();
		}
		if ($usr_sub_char1.equalsIgnoreCase(name)) {
			return usr_sub_char1();
		}
		if ($usr_sub_char2.equalsIgnoreCase(name)) {
			return usr_sub_char2();
		}
		if ($usr_sub_char3.equalsIgnoreCase(name)) {
			return usr_sub_char3();
		}
		if ($sum_intr_rmrks.equalsIgnoreCase(name)) {
			return sum_intr_rmrks();
		}
		if ($sum_sub_char1.equalsIgnoreCase(name)) {
			return sum_sub_char1();
		}
		if ($sum_sub_char2.equalsIgnoreCase(name)) {
			return sum_sub_char2();
		}
		if ($sum_sub_char3.equalsIgnoreCase(name)) {
			return sum_sub_char3();
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
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($spln_st_ym.equalsIgnoreCase(name)) {
			return spln_st_ym();
		}
		if ($spln_end_ym.equalsIgnoreCase(name)) {
			return spln_end_ym();
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
		if ($edited_flg.equalsIgnoreCase(name)) {
			return edited_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($adopted_flg.equalsIgnoreCase(name)) {
			return adopted_flg();
		}
		if ($locked_flg.equalsIgnoreCase(name)) {
			return locked_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($spln_vers.equalsIgnoreCase(name)) {
			return spln_vers();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($ref_vers.equalsIgnoreCase(name)) {
			return ref_vers();
		}
		if ($usr_intr_rmrks.equalsIgnoreCase(name)) {
			return usr_intr_rmrks();
		}
		if ($usr_sub_char1.equalsIgnoreCase(name)) {
			return usr_sub_char1();
		}
		if ($usr_sub_char2.equalsIgnoreCase(name)) {
			return usr_sub_char2();
		}
		if ($usr_sub_char3.equalsIgnoreCase(name)) {
			return usr_sub_char3();
		}
		if ($sum_intr_rmrks.equalsIgnoreCase(name)) {
			return sum_intr_rmrks();
		}
		if ($sum_sub_char1.equalsIgnoreCase(name)) {
			return sum_sub_char1();
		}
		if ($sum_sub_char2.equalsIgnoreCase(name)) {
			return sum_sub_char2();
		}
		if ($sum_sub_char3.equalsIgnoreCase(name)) {
			return sum_sub_char3();
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
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($spln_st_ym.equalsIgnoreCase(name)) {
			return spln_st_ym();
		}
		if ($spln_end_ym.equalsIgnoreCase(name)) {
			return spln_end_ym();
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
		if ($edited_flg.equalsIgnoreCase(name)) {
			return edited_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($adopted_flg.equalsIgnoreCase(name)) {
			return adopted_flg();
		}
		if ($locked_flg.equalsIgnoreCase(name)) {
			return locked_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($spln_vers.equalsIgnoreCase(name)) {
			spln_vers(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($ref_vers.equalsIgnoreCase(name)) {
			ref_vers(value);
			return;
		}
		if ($usr_intr_rmrks.equalsIgnoreCase(name)) {
			usr_intr_rmrks(value);
			return;
		}
		if ($usr_sub_char1.equalsIgnoreCase(name)) {
			usr_sub_char1(value);
			return;
		}
		if ($usr_sub_char2.equalsIgnoreCase(name)) {
			usr_sub_char2(value);
			return;
		}
		if ($usr_sub_char3.equalsIgnoreCase(name)) {
			usr_sub_char3(value);
			return;
		}
		if ($sum_intr_rmrks.equalsIgnoreCase(name)) {
			sum_intr_rmrks(value);
			return;
		}
		if ($sum_sub_char1.equalsIgnoreCase(name)) {
			sum_sub_char1(value);
			return;
		}
		if ($sum_sub_char2.equalsIgnoreCase(name)) {
			sum_sub_char2(value);
			return;
		}
		if ($sum_sub_char3.equalsIgnoreCase(name)) {
			sum_sub_char3(value);
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
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($spln_st_ym.equalsIgnoreCase(name)) {
			spln_st_ym(value);
			return;
		}
		if ($spln_end_ym.equalsIgnoreCase(name)) {
			spln_end_ym(value);
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
		if ($edited_flg.equalsIgnoreCase(name)) {
			edited_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($adopted_flg.equalsIgnoreCase(name)) {
			adopted_flg(value);
			return;
		}
		if ($locked_flg.equalsIgnoreCase(name)) {
			locked_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($spln_vers.equalsIgnoreCase(name)) {
			spln_vers(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($ref_vers.equalsIgnoreCase(name)) {
			ref_vers(value);
			return;
		}
		if ($usr_intr_rmrks.equalsIgnoreCase(name)) {
			usr_intr_rmrks(value);
			return;
		}
		if ($usr_sub_char1.equalsIgnoreCase(name)) {
			usr_sub_char1(value);
			return;
		}
		if ($usr_sub_char2.equalsIgnoreCase(name)) {
			usr_sub_char2(value);
			return;
		}
		if ($usr_sub_char3.equalsIgnoreCase(name)) {
			usr_sub_char3(value);
			return;
		}
		if ($sum_intr_rmrks.equalsIgnoreCase(name)) {
			sum_intr_rmrks(value);
			return;
		}
		if ($sum_sub_char1.equalsIgnoreCase(name)) {
			sum_sub_char1(value);
			return;
		}
		if ($sum_sub_char2.equalsIgnoreCase(name)) {
			sum_sub_char2(value);
			return;
		}
		if ($sum_sub_char3.equalsIgnoreCase(name)) {
			sum_sub_char3(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($spln_st_ym.equalsIgnoreCase(name)) {
			spln_st_ym(value);
			return;
		}
		if ($spln_end_ym.equalsIgnoreCase(name)) {
			spln_end_ym(value);
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
		if ($edited_flg.equalsIgnoreCase(name)) {
			edited_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($adopted_flg.equalsIgnoreCase(name)) {
			adopted_flg(value);
			return;
		}
		if ($locked_flg.equalsIgnoreCase(name)) {
			locked_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

