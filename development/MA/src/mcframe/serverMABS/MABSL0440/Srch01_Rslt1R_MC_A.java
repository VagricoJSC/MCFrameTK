package mcframe.serverMABS.MABSL0440;

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
 * ブロック"Srch01_Rslt1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt1R_MC_A extends MCConstRow {

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public static final String $fr_lg_grp_cd = "fr_lg_grp_cd";
	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public static final String $fr_lg_grp_nm = "fr_lg_grp_nm";
	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public static final String $to_lg_grp_cd = "to_lg_grp_cd";
	/**
	 * Receiving point distribution group name 出荷先物流グループ名.<p>
	 *
	 */
	public static final String $to_lg_grp_nm = "to_lg_grp_nm";
	/**
	 * Set location (Receiving point distribution group) 場所設定（出荷先物流グループ）.<p>
	 *
	 */
	public static final String $to_lg_grp_loc_flg = "to_lg_grp_loc_flg";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public static final String $ship_term_nm = "ship_term_nm";
	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public static final String $xfr_lt = "xfr_lt";
	/**
	 * Shipping closing time 出荷締時刻.<p>
	 *
	 */
	public static final String $fin_cl_time = "fin_cl_time";
	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public static final String $early_ship_dt_add_days = "early_ship_dt_add_days";
	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public static final String $alloc_days = "alloc_days";
	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public static final String $iv_trd_flg = "iv_trd_flg";
	/**
	 * Standard receiving point cd. 標準配送先ＣＤ.<p>
	 *
	 */
	public static final String $def_tdlv_cd = "def_tdlv_cd";
	/**
	 * Standard receiving point name 標準配送先名.<p>
	 *
	 */
	public static final String $def_tdlv_nm = "def_tdlv_nm";
	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_grp_cd = "ship_wk_grp_cd";
	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public static final String $ship_wk_grp_nm = "ship_wk_grp_nm";
	/**
	 * Without demand LT 需要情報ＬＴ無し.<p>
	 *
	 */
	public static final String $non_dmnd_lt_flg = "non_dmnd_lt_flg";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";


	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fr_lg_grp_cd_META = createCommonMeta($fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta fr_lg_grp_nm_META = createCommonMeta($fr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta to_lg_grp_cd_META = createCommonMeta($to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta to_lg_grp_nm_META = createCommonMeta($to_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta to_lg_grp_loc_flg_META = createCommonMeta($to_lg_grp_loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_term_nm_META = createCommonMeta($ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta xfr_lt_META = createCommonMeta($xfr_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta fin_cl_time_META = createCommonMeta($fin_cl_time, mcframe.commonMA.meta.MA_META.CHAR_HM);
	public static final MCMeta early_ship_dt_add_days_META = createCommonMeta($early_ship_dt_add_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta alloc_days_META = createCommonMeta($alloc_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta iv_trd_flg_META = createCommonMeta($iv_trd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_tdlv_cd_META = createCommonMeta($def_tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta def_tdlv_nm_META = createCommonMeta($def_tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ship_wk_grp_cd_META = createCommonMeta($ship_wk_grp_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_GRP_CD);
	public static final MCMeta ship_wk_grp_nm_META = createCommonMeta($ship_wk_grp_nm, mcframe.commonMA.meta.MA_META.SHIP_WK_GRP_NM);
	public static final MCMeta non_dmnd_lt_flg_META = createCommonMeta($non_dmnd_lt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<Srch01_Rslt1R> constMetas = new ConstMetaList<Srch01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			fr_lg_grp_cd_META,
			fr_lg_grp_nm_META,
			to_lg_grp_cd_META,
			to_lg_grp_nm_META,
			to_lg_grp_loc_flg_META,
			ship_term_cd_META,
			ship_term_nm_META,
			xfr_lt_META,
			fin_cl_time_META,
			early_ship_dt_add_days_META,
			alloc_days_META,
			iv_trd_flg_META,
			def_tdlv_cd_META,
			def_tdlv_nm_META,
			ship_wk_grp_cd_META,
			ship_wk_grp_nm_META,
			non_dmnd_lt_flg_META,
			memo1_META,
			memo2_META,
			memo3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META
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
	protected Srch01_Rslt1R_MC_A(ConstMetaList<? extends Srch01_Rslt1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R clone() {
		return (Srch01_Rslt1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R createInstance() {
		return (Srch01_Rslt1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R getValues(String... names) {
		return (Srch01_Rslt1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 0, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 0, $del_flg, value);
	}


	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String fr_lg_grp_cd() {
		return getConstString(offset + 1, $fr_lg_grp_cd);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void fr_lg_grp_cd(String value) {
		setConstString(offset + 1, $fr_lg_grp_cd, value);
	}


	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public String fr_lg_grp_nm() {
		return getConstString(offset + 2, $fr_lg_grp_nm);
	}

	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public void fr_lg_grp_nm(String value) {
		setConstString(offset + 2, $fr_lg_grp_nm, value);
	}


	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public String to_lg_grp_cd() {
		return getConstString(offset + 3, $to_lg_grp_cd);
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public void to_lg_grp_cd(String value) {
		setConstString(offset + 3, $to_lg_grp_cd, value);
	}


	/**
	 * Receiving point distribution group name 出荷先物流グループ名.<p>
	 *
	 */
	public String to_lg_grp_nm() {
		return getConstString(offset + 4, $to_lg_grp_nm);
	}

	/**
	 * Receiving point distribution group name 出荷先物流グループ名.<p>
	 *
	 */
	public void to_lg_grp_nm(String value) {
		setConstString(offset + 4, $to_lg_grp_nm, value);
	}


	/**
	 * Set location (Receiving point distribution group) 場所設定（出荷先物流グループ）.<p>
	 *
	 */
	public boolean to_lg_grp_loc_flg() {
		return getConstBoolean(offset + 5, $to_lg_grp_loc_flg);
	}

	/**
	 * Set location (Receiving point distribution group) 場所設定（出荷先物流グループ）.<p>
	 *
	 */
	public void to_lg_grp_loc_flg(boolean value) {
		setConstBoolean(offset + 5, $to_lg_grp_loc_flg, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 6, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 6, $ship_term_cd, value);
	}


	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public String ship_term_nm() {
		return getConstString(offset + 7, $ship_term_nm);
	}

	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public void ship_term_nm(String value) {
		setConstString(offset + 7, $ship_term_nm, value);
	}


	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return getConstNumber(offset + 8, $xfr_lt);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		setConstNumber(offset + 8, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(int value) {
		setConstNumber(offset + 8, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(long value) {
		setConstNumber(offset + 8, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(float value) {
		setConstNumber(offset + 8, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(double value) {
		setConstNumber(offset + 8, $xfr_lt, value);
	}


	/**
	 * Shipping closing time 出荷締時刻.<p>
	 *
	 */
	public String fin_cl_time() {
		return getConstString(offset + 9, $fin_cl_time);
	}

	/**
	 * Shipping closing time 出荷締時刻.<p>
	 *
	 */
	public void fin_cl_time(String value) {
		setConstString(offset + 9, $fin_cl_time, value);
	}


	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public MCNumber early_ship_dt_add_days() {
		return getConstNumber(offset + 10, $early_ship_dt_add_days);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(MCNumber value) {
		setConstNumber(offset + 10, $early_ship_dt_add_days, value);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(int value) {
		setConstNumber(offset + 10, $early_ship_dt_add_days, value);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(long value) {
		setConstNumber(offset + 10, $early_ship_dt_add_days, value);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(float value) {
		setConstNumber(offset + 10, $early_ship_dt_add_days, value);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(double value) {
		setConstNumber(offset + 10, $early_ship_dt_add_days, value);
	}


	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public MCNumber alloc_days() {
		return getConstNumber(offset + 11, $alloc_days);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(MCNumber value) {
		setConstNumber(offset + 11, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(int value) {
		setConstNumber(offset + 11, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(long value) {
		setConstNumber(offset + 11, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(float value) {
		setConstNumber(offset + 11, $alloc_days, value);
	}

	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public void alloc_days(double value) {
		setConstNumber(offset + 11, $alloc_days, value);
	}


	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public boolean iv_trd_flg() {
		return getConstBoolean(offset + 12, $iv_trd_flg);
	}

	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public void iv_trd_flg(boolean value) {
		setConstBoolean(offset + 12, $iv_trd_flg, value);
	}


	/**
	 * Standard receiving point cd. 標準配送先ＣＤ.<p>
	 *
	 */
	public String def_tdlv_cd() {
		return getConstString(offset + 13, $def_tdlv_cd);
	}

	/**
	 * Standard receiving point cd. 標準配送先ＣＤ.<p>
	 *
	 */
	public void def_tdlv_cd(String value) {
		setConstString(offset + 13, $def_tdlv_cd, value);
	}


	/**
	 * Standard receiving point name 標準配送先名.<p>
	 *
	 */
	public String def_tdlv_nm() {
		return getConstString(offset + 14, $def_tdlv_nm);
	}

	/**
	 * Standard receiving point name 標準配送先名.<p>
	 *
	 */
	public void def_tdlv_nm(String value) {
		setConstString(offset + 14, $def_tdlv_nm, value);
	}


	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public String ship_wk_grp_cd() {
		return getConstString(offset + 15, $ship_wk_grp_cd);
	}

	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public void ship_wk_grp_cd(String value) {
		setConstString(offset + 15, $ship_wk_grp_cd, value);
	}


	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public String ship_wk_grp_nm() {
		return getConstString(offset + 16, $ship_wk_grp_nm);
	}

	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public void ship_wk_grp_nm(String value) {
		setConstString(offset + 16, $ship_wk_grp_nm, value);
	}


	/**
	 * Without demand LT 需要情報ＬＴ無し.<p>
	 *
	 */
	public boolean non_dmnd_lt_flg() {
		return getConstBoolean(offset + 17, $non_dmnd_lt_flg);
	}

	/**
	 * Without demand LT 需要情報ＬＴ無し.<p>
	 *
	 */
	public void non_dmnd_lt_flg(boolean value) {
		setConstBoolean(offset + 17, $non_dmnd_lt_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 18, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 18, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 19, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 19, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 20, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 20, $memo3, value);
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 23, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 23, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 24, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 24, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 25, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 25, $ins_func_nm, value);
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 29, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 29, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 30, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 30, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 31, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 31, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 32, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 32, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 33, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 33, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 34, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 34, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 35, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 35, $del_ts, value);
	}


	public String getString(String name) {
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return fr_lg_grp_cd();
		}
		if ($fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return fr_lg_grp_nm();
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			return to_lg_grp_cd();
		}
		if ($to_lg_grp_nm.equalsIgnoreCase(name)) {
			return to_lg_grp_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($fin_cl_time.equalsIgnoreCase(name)) {
			return fin_cl_time();
		}
		if ($def_tdlv_cd.equalsIgnoreCase(name)) {
			return def_tdlv_cd();
		}
		if ($def_tdlv_nm.equalsIgnoreCase(name)) {
			return def_tdlv_nm();
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			return ship_wk_grp_cd();
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			return ship_wk_grp_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			return early_ship_dt_add_days();
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			return alloc_days();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($to_lg_grp_loc_flg.equalsIgnoreCase(name)) {
			return to_lg_grp_loc_flg();
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			return iv_trd_flg();
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			return non_dmnd_lt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return fr_lg_grp_cd();
		}
		if ($fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return fr_lg_grp_nm();
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			return to_lg_grp_cd();
		}
		if ($to_lg_grp_nm.equalsIgnoreCase(name)) {
			return to_lg_grp_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($fin_cl_time.equalsIgnoreCase(name)) {
			return fin_cl_time();
		}
		if ($def_tdlv_cd.equalsIgnoreCase(name)) {
			return def_tdlv_cd();
		}
		if ($def_tdlv_nm.equalsIgnoreCase(name)) {
			return def_tdlv_nm();
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			return ship_wk_grp_cd();
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			return ship_wk_grp_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			return early_ship_dt_add_days();
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			return alloc_days();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($to_lg_grp_loc_flg.equalsIgnoreCase(name)) {
			return to_lg_grp_loc_flg();
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			return iv_trd_flg();
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			return non_dmnd_lt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			fr_lg_grp_cd(value);
			return;
		}
		if ($fr_lg_grp_nm.equalsIgnoreCase(name)) {
			fr_lg_grp_nm(value);
			return;
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			to_lg_grp_cd(value);
			return;
		}
		if ($to_lg_grp_nm.equalsIgnoreCase(name)) {
			to_lg_grp_nm(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($fin_cl_time.equalsIgnoreCase(name)) {
			fin_cl_time(value);
			return;
		}
		if ($def_tdlv_cd.equalsIgnoreCase(name)) {
			def_tdlv_cd(value);
			return;
		}
		if ($def_tdlv_nm.equalsIgnoreCase(name)) {
			def_tdlv_nm(value);
			return;
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			ship_wk_grp_cd(value);
			return;
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			ship_wk_grp_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($to_lg_grp_loc_flg.equalsIgnoreCase(name)) {
			to_lg_grp_loc_flg(value);
			return;
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			iv_trd_flg(value);
			return;
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			non_dmnd_lt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			fr_lg_grp_cd(value);
			return;
		}
		if ($fr_lg_grp_nm.equalsIgnoreCase(name)) {
			fr_lg_grp_nm(value);
			return;
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			to_lg_grp_cd(value);
			return;
		}
		if ($to_lg_grp_nm.equalsIgnoreCase(name)) {
			to_lg_grp_nm(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($fin_cl_time.equalsIgnoreCase(name)) {
			fin_cl_time(value);
			return;
		}
		if ($def_tdlv_cd.equalsIgnoreCase(name)) {
			def_tdlv_cd(value);
			return;
		}
		if ($def_tdlv_nm.equalsIgnoreCase(name)) {
			def_tdlv_nm(value);
			return;
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			ship_wk_grp_cd(value);
			return;
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			ship_wk_grp_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($to_lg_grp_loc_flg.equalsIgnoreCase(name)) {
			to_lg_grp_loc_flg(value);
			return;
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			iv_trd_flg(value);
			return;
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			non_dmnd_lt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

