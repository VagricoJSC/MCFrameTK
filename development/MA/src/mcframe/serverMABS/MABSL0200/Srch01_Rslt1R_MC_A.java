package mcframe.serverMABS.MABSL0200;

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
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_cd = "par_itm_cd";
	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public static final String $par_itm_sub1 = "par_itm_sub1";
	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public static final String $par_itm_sub2 = "par_itm_sub2";
	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public static final String $par_itm_sub3 = "par_itm_sub3";
	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public static final String $par_itm_nm = "par_itm_nm";
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public static final String $par_itm_typ = "par_itm_typ";
	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public static final String $par_itm_typ_nm = "par_itm_typ_nm";
	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_typ_d_cd = "par_itm_typ_d_cd";
	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public static final String $par_itm_typ_d_nm = "par_itm_typ_d_nm";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Copy column type 継承項目区分.<p>
	 *
	 */
	public static final String $lot_inh_col_typ = "lot_inh_col_typ";
	/**
	 * Copy column type name 継承項目区分名.<p>
	 *
	 */
	public static final String $lot_inh_col_typ_nm = "lot_inh_col_typ_nm";
	/**
	 * Copy method type 継承方法区分.<p>
	 *
	 */
	public static final String $lot_inh_typ = "lot_inh_typ";
	/**
	 * Copy method type name 継承方法区分名.<p>
	 *
	 */
	public static final String $lot_inh_typ_nm = "lot_inh_typ_nm";
	/**
	 * Additional join column type 追加結合項目区分.<p>
	 *
	 */
	public static final String $add_concat_col = "add_concat_col";
	/**
	 * Additional join column type name 追加結合項目区分名.<p>
	 *
	 */
	public static final String $add_concat_col_nm = "add_concat_col_nm";
	/**
	 * Error when number of digits exceeded 桁数超過時エラー.<p>
	 *
	 */
	public static final String $overflow_err_flg = "overflow_err_flg";
	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public static final String $chd_itm_cd = "chd_itm_cd";
	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public static final String $chd_itm_sub1 = "chd_itm_sub1";
	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public static final String $chd_itm_sub2 = "chd_itm_sub2";
	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public static final String $chd_itm_sub3 = "chd_itm_sub3";
	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public static final String $chd_itm_nm = "chd_itm_nm";
	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public static final String $chd_itm_typ = "chd_itm_typ";
	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public static final String $chd_itm_typ_nm = "chd_itm_typ_nm";
	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $chd_itm_typ_d_cd = "chd_itm_typ_d_cd";
	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public static final String $chd_itm_typ_d_nm = "chd_itm_typ_d_nm";
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public static final String $prio = "prio";
	/**
	 * Application start date (BOM) 適用開始日（ＢＯＭ）.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Application end date (BOM) 適用終了日（ＢＯＭ）.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * Memo 1 (Copy-to) メモ１（継承先）.<p>
	 *
	 */
	public static final String $dest_memo1 = "dest_memo1";
	/**
	 * Memo 2 (Copy-to) メモ２（継承先）.<p>
	 *
	 */
	public static final String $dest_memo2 = "dest_memo2";
	/**
	 * Memo 3 (Copy-to) メモ３（継承先）.<p>
	 *
	 */
	public static final String $dest_memo3 = "dest_memo3";
	/**
	 * Memo 1 (Copy-from) メモ１（継承元）.<p>
	 *
	 */
	public static final String $src_memo1 = "src_memo1";
	/**
	 * Memo 2 (Copy-from) メモ２（継承元）.<p>
	 *
	 */
	public static final String $src_memo2 = "src_memo2";
	/**
	 * Memo 3 (Copy-from) メモ３（継承元）.<p>
	 *
	 */
	public static final String $src_memo3 = "src_memo3";
	/**
	 * Entry user ID (Copy-to) 登録ユーザＩＤ（継承先）.<p>
	 *
	 */
	public static final String $dest_ins_usr_id = "dest_ins_usr_id";
	/**
	 * Entry user name (Copy-to) 登録ユーザ名（継承先）.<p>
	 *
	 */
	public static final String $dest_ins_usr_nm = "dest_ins_usr_nm";
	/**
	 * Entry date and time (Copy-to) 登録日時（継承先）.<p>
	 *
	 */
	public static final String $dest_ins_ts = "dest_ins_ts";
	/**
	 * Entry function ID (Copy-to) 登録機能ＩＤ（継承先）.<p>
	 *
	 */
	public static final String $dest_ins_func_id = "dest_ins_func_id";
	/**
	 * Entry function name (Copy-to) 登録機能名（継承先）.<p>
	 *
	 */
	public static final String $dest_ins_func_nm = "dest_ins_func_nm";
	/**
	 * Update counter (Copy-to) 更新カウンタ（継承先）.<p>
	 *
	 */
	public static final String $dest_upd_cntr = "dest_upd_cntr";
	/**
	 * Update user ID (Copy-to) 更新ユーザＩＤ（継承先）.<p>
	 *
	 */
	public static final String $dest_upd_usr_id = "dest_upd_usr_id";
	/**
	 * Update user name (Copy-to) 更新ユーザ名（継承先）.<p>
	 *
	 */
	public static final String $dest_upd_usr_nm = "dest_upd_usr_nm";
	/**
	 * Update date and time (Copy-to) 更新日時（継承先）.<p>
	 *
	 */
	public static final String $dest_upd_ts = "dest_upd_ts";
	/**
	 * Update function ID (Copy-to) 更新機能ＩＤ（継承先）.<p>
	 *
	 */
	public static final String $dest_upd_func_id = "dest_upd_func_id";
	/**
	 * Update function name (Copy-to) 更新機能名（継承先）.<p>
	 *
	 */
	public static final String $dest_upd_func_nm = "dest_upd_func_nm";
	/**
	 * Update request No. (Copy-to) 更新リクエストＮＯ（継承先）.<p>
	 *
	 */
	public static final String $dest_upd_srv_req_no = "dest_upd_srv_req_no";
	/**
	 * Logical delete user ID (Copy-to) 論理削除ユーザＩＤ（継承先）.<p>
	 *
	 */
	public static final String $dest_del_usr_id = "dest_del_usr_id";
	/**
	 * Logical delete user name (Copy-to) 論理削除ユーザ名（継承先）.<p>
	 *
	 */
	public static final String $dest_del_usr_nm = "dest_del_usr_nm";
	/**
	 * Logical delete date and time (Copy-to) 論理削除日時（継承先）.<p>
	 *
	 */
	public static final String $dest_del_ts = "dest_del_ts";
	/**
	 * Entry user ID (Copy-from) 登録ユーザＩＤ（継承元）.<p>
	 *
	 */
	public static final String $src_ins_usr_id = "src_ins_usr_id";
	/**
	 * Entry user name (Copy-from) 登録ユーザ名（継承元）.<p>
	 *
	 */
	public static final String $src_ins_usr_nm = "src_ins_usr_nm";
	/**
	 * Entry date and time (Copy-from) 登録日時（継承元）.<p>
	 *
	 */
	public static final String $src_ins_ts = "src_ins_ts";
	/**
	 * Entry function ID (Copy-from) 登録機能ＩＤ（継承元）.<p>
	 *
	 */
	public static final String $src_ins_func_id = "src_ins_func_id";
	/**
	 * Entry function name (Copy-from) 登録機能名（継承元）.<p>
	 *
	 */
	public static final String $src_ins_func_nm = "src_ins_func_nm";
	/**
	 * Update counter (Copy-from) 更新カウンタ（継承元）.<p>
	 *
	 */
	public static final String $src_upd_cntr = "src_upd_cntr";
	/**
	 * Update user ID (Copy-from) 更新ユーザＩＤ（継承元）.<p>
	 *
	 */
	public static final String $src_upd_usr_id = "src_upd_usr_id";
	/**
	 * Update user name (Copy-from) 更新ユーザ名（継承元）.<p>
	 *
	 */
	public static final String $src_upd_usr_nm = "src_upd_usr_nm";
	/**
	 * Update date and time (Copy-from) 更新日時（継承元）.<p>
	 *
	 */
	public static final String $src_upd_ts = "src_upd_ts";
	/**
	 * Update function ID (Copy-from) 更新機能ＩＤ（継承元）.<p>
	 *
	 */
	public static final String $src_upd_func_id = "src_upd_func_id";
	/**
	 * Update function name (Copy-from) 更新機能名（継承元）.<p>
	 *
	 */
	public static final String $src_upd_func_nm = "src_upd_func_nm";
	/**
	 * Update request No. (Copy-from) 更新リクエストＮＯ（継承元）.<p>
	 *
	 */
	public static final String $src_upd_srv_req_no = "src_upd_srv_req_no";
	/**
	 * Logical delete user ID (Copy-from) 論理削除ユーザＩＤ（継承元）.<p>
	 *
	 */
	public static final String $src_del_usr_id = "src_del_usr_id";
	/**
	 * Logical delete user name (Copy-from) 論理削除ユーザ名（継承元）.<p>
	 *
	 */
	public static final String $src_del_usr_nm = "src_del_usr_nm";
	/**
	 * Logical delete date and time (Copy-from) 論理削除日時（継承元）.<p>
	 *
	 */
	public static final String $src_del_ts = "src_del_ts";


	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta par_itm_nm_META = createCommonMeta($par_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta par_itm_typ_META = createCommonMeta($par_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta par_itm_typ_nm_META = createCommonMeta($par_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta par_itm_typ_d_cd_META = createCommonMeta($par_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta par_itm_typ_d_nm_META = createCommonMeta($par_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta lot_inh_col_typ_META = createCommonMeta($lot_inh_col_typ, mcframe.commonMA.meta.MA_META.LOT_INH_COL_TYP);
	public static final MCMeta lot_inh_col_typ_nm_META = createCommonMeta($lot_inh_col_typ_nm, mcframe.commonMA.meta.MA_META.LOT_INH_COL_TYP_NM);
	public static final MCMeta lot_inh_typ_META = createCommonMeta($lot_inh_typ, mcframe.commonMA.meta.MA_META.LOT_INH_TYP);
	public static final MCMeta lot_inh_typ_nm_META = createCommonMeta($lot_inh_typ_nm, mcframe.commonMA.meta.MA_META.LOT_INH_TYP_NM);
	public static final MCMeta add_concat_col_META = createCommonMeta($add_concat_col, mcframe.commonMA.meta.MA_META.LOT_INH_COL_TYP);
	public static final MCMeta add_concat_col_nm_META = createCommonMeta($add_concat_col_nm, mcframe.commonMA.meta.MA_META.LOT_INH_COL_TYP_NM);
	public static final MCMeta overflow_err_flg_META = createCommonMeta($overflow_err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_cd_META = createCommonMeta($chd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta chd_itm_sub1_META = createCommonMeta($chd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta chd_itm_sub2_META = createCommonMeta($chd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta chd_itm_sub3_META = createCommonMeta($chd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta chd_itm_nm_META = createCommonMeta($chd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta chd_itm_typ_META = createCommonMeta($chd_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta chd_itm_typ_nm_META = createCommonMeta($chd_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta chd_itm_typ_d_cd_META = createCommonMeta($chd_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta chd_itm_typ_d_nm_META = createCommonMeta($chd_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dest_memo1_META = createCommonMeta($dest_memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta dest_memo2_META = createCommonMeta($dest_memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta dest_memo3_META = createCommonMeta($dest_memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta src_memo1_META = createCommonMeta($src_memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta src_memo2_META = createCommonMeta($src_memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta src_memo3_META = createCommonMeta($src_memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta dest_ins_usr_id_META = createCommonMeta($dest_ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta dest_ins_usr_nm_META = createCommonMeta($dest_ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta dest_ins_ts_META = createCommonMeta($dest_ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta dest_ins_func_id_META = createCommonMeta($dest_ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta dest_ins_func_nm_META = createCommonMeta($dest_ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta dest_upd_cntr_META = createCommonMeta($dest_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta dest_upd_usr_id_META = createCommonMeta($dest_upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta dest_upd_usr_nm_META = createCommonMeta($dest_upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta dest_upd_ts_META = createCommonMeta($dest_upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta dest_upd_func_id_META = createCommonMeta($dest_upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta dest_upd_func_nm_META = createCommonMeta($dest_upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta dest_upd_srv_req_no_META = createCommonMeta($dest_upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta dest_del_usr_id_META = createCommonMeta($dest_del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta dest_del_usr_nm_META = createCommonMeta($dest_del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta dest_del_ts_META = createCommonMeta($dest_del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta src_ins_usr_id_META = createCommonMeta($src_ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta src_ins_usr_nm_META = createCommonMeta($src_ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta src_ins_ts_META = createCommonMeta($src_ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta src_ins_func_id_META = createCommonMeta($src_ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta src_ins_func_nm_META = createCommonMeta($src_ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta src_upd_cntr_META = createCommonMeta($src_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta src_upd_usr_id_META = createCommonMeta($src_upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta src_upd_usr_nm_META = createCommonMeta($src_upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta src_upd_ts_META = createCommonMeta($src_upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta src_upd_func_id_META = createCommonMeta($src_upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta src_upd_func_nm_META = createCommonMeta($src_upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta src_upd_srv_req_no_META = createCommonMeta($src_upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta src_del_usr_id_META = createCommonMeta($src_del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta src_del_usr_nm_META = createCommonMeta($src_del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta src_del_ts_META = createCommonMeta($src_del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<Srch01_Rslt1R> constMetas = new ConstMetaList<Srch01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			wg_cd_META,
			wg_nm_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			par_itm_nm_META,
			par_itm_typ_META,
			par_itm_typ_nm_META,
			par_itm_typ_d_cd_META,
			par_itm_typ_d_nm_META,
			bom_ptn_META,
			lot_inh_col_typ_META,
			lot_inh_col_typ_nm_META,
			lot_inh_typ_META,
			lot_inh_typ_nm_META,
			add_concat_col_META,
			add_concat_col_nm_META,
			overflow_err_flg_META,
			chd_itm_cd_META,
			chd_itm_sub1_META,
			chd_itm_sub2_META,
			chd_itm_sub3_META,
			chd_itm_nm_META,
			chd_itm_typ_META,
			chd_itm_typ_nm_META,
			chd_itm_typ_d_cd_META,
			chd_itm_typ_d_nm_META,
			prio_META,
			st_dt_META,
			end_dt_META,
			dest_memo1_META,
			dest_memo2_META,
			dest_memo3_META,
			src_memo1_META,
			src_memo2_META,
			src_memo3_META,
			dest_ins_usr_id_META,
			dest_ins_usr_nm_META,
			dest_ins_ts_META,
			dest_ins_func_id_META,
			dest_ins_func_nm_META,
			dest_upd_cntr_META,
			dest_upd_usr_id_META,
			dest_upd_usr_nm_META,
			dest_upd_ts_META,
			dest_upd_func_id_META,
			dest_upd_func_nm_META,
			dest_upd_srv_req_no_META,
			dest_del_usr_id_META,
			dest_del_usr_nm_META,
			dest_del_ts_META,
			src_ins_usr_id_META,
			src_ins_usr_nm_META,
			src_ins_ts_META,
			src_ins_func_id_META,
			src_ins_func_nm_META,
			src_upd_cntr_META,
			src_upd_usr_id_META,
			src_upd_usr_nm_META,
			src_upd_ts_META,
			src_upd_func_id_META,
			src_upd_func_nm_META,
			src_upd_srv_req_no_META,
			src_del_usr_id_META,
			src_del_usr_nm_META,
			src_del_ts_META
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
				{$par_itm_typ, "MAC_ITM_TYP"},	// par_itm_typ
				{$lot_inh_col_typ, "MAC_LOT_INH_COL_TYP"},	// lot_inh_col_typ
				{$lot_inh_typ, "MAC_LOT_INH_TYP"},	// lot_inh_typ
				{$add_concat_col, "MAC_LOT_INH_COL_TYP"},	// add_concat_col
				{$chd_itm_typ, "MAC_ITM_TYP"}	// chd_itm_typ
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 2, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 2, $wg_nm, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 3, $par_itm_cd);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 3, $par_itm_cd, value);
	}


	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 4, $par_itm_sub1);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 4, $par_itm_sub1, value);
	}


	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 5, $par_itm_sub2);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 5, $par_itm_sub2, value);
	}


	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 6, $par_itm_sub3);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 6, $par_itm_sub3, value);
	}


	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return getConstString(offset + 7, $par_itm_nm);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		setConstString(offset + 7, $par_itm_nm, value);
	}


	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public String par_itm_typ() {
		return getConstString(offset + 8, $par_itm_typ);
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ(String value) {
		setConstString(offset + 8, $par_itm_typ, value);
	}


	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public String par_itm_typ_nm() {
		return getConstString(offset + 9, $par_itm_typ_nm);
	}

	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public void par_itm_typ_nm(String value) {
		setConstString(offset + 9, $par_itm_typ_nm, value);
	}


	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public String par_itm_typ_d_cd() {
		return getConstString(offset + 10, $par_itm_typ_d_cd);
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public void par_itm_typ_d_cd(String value) {
		setConstString(offset + 10, $par_itm_typ_d_cd, value);
	}


	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public String par_itm_typ_d_nm() {
		return getConstString(offset + 11, $par_itm_typ_d_nm);
	}

	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public void par_itm_typ_d_nm(String value) {
		setConstString(offset + 11, $par_itm_typ_d_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 12, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 12, $bom_ptn, value);
	}


	/**
	 * Copy column type 継承項目区分.<p>
	 *
	 */
	public String lot_inh_col_typ() {
		return getConstString(offset + 13, $lot_inh_col_typ);
	}

	/**
	 * Copy column type 継承項目区分.<p>
	 *
	 */
	public void lot_inh_col_typ(String value) {
		setConstString(offset + 13, $lot_inh_col_typ, value);
	}


	/**
	 * Copy column type name 継承項目区分名.<p>
	 *
	 */
	public String lot_inh_col_typ_nm() {
		return getConstString(offset + 14, $lot_inh_col_typ_nm);
	}

	/**
	 * Copy column type name 継承項目区分名.<p>
	 *
	 */
	public void lot_inh_col_typ_nm(String value) {
		setConstString(offset + 14, $lot_inh_col_typ_nm, value);
	}


	/**
	 * Copy method type 継承方法区分.<p>
	 *
	 */
	public String lot_inh_typ() {
		return getConstString(offset + 15, $lot_inh_typ);
	}

	/**
	 * Copy method type 継承方法区分.<p>
	 *
	 */
	public void lot_inh_typ(String value) {
		setConstString(offset + 15, $lot_inh_typ, value);
	}


	/**
	 * Copy method type name 継承方法区分名.<p>
	 *
	 */
	public String lot_inh_typ_nm() {
		return getConstString(offset + 16, $lot_inh_typ_nm);
	}

	/**
	 * Copy method type name 継承方法区分名.<p>
	 *
	 */
	public void lot_inh_typ_nm(String value) {
		setConstString(offset + 16, $lot_inh_typ_nm, value);
	}


	/**
	 * Additional join column type 追加結合項目区分.<p>
	 *
	 */
	public String add_concat_col() {
		return getConstString(offset + 17, $add_concat_col);
	}

	/**
	 * Additional join column type 追加結合項目区分.<p>
	 *
	 */
	public void add_concat_col(String value) {
		setConstString(offset + 17, $add_concat_col, value);
	}


	/**
	 * Additional join column type name 追加結合項目区分名.<p>
	 *
	 */
	public String add_concat_col_nm() {
		return getConstString(offset + 18, $add_concat_col_nm);
	}

	/**
	 * Additional join column type name 追加結合項目区分名.<p>
	 *
	 */
	public void add_concat_col_nm(String value) {
		setConstString(offset + 18, $add_concat_col_nm, value);
	}


	/**
	 * Error when number of digits exceeded 桁数超過時エラー.<p>
	 *
	 */
	public boolean overflow_err_flg() {
		return getConstBoolean(offset + 19, $overflow_err_flg);
	}

	/**
	 * Error when number of digits exceeded 桁数超過時エラー.<p>
	 *
	 */
	public void overflow_err_flg(boolean value) {
		setConstBoolean(offset + 19, $overflow_err_flg, value);
	}


	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return getConstString(offset + 20, $chd_itm_cd);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		setConstString(offset + 20, $chd_itm_cd, value);
	}


	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return getConstString(offset + 21, $chd_itm_sub1);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		setConstString(offset + 21, $chd_itm_sub1, value);
	}


	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return getConstString(offset + 22, $chd_itm_sub2);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		setConstString(offset + 22, $chd_itm_sub2, value);
	}


	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return getConstString(offset + 23, $chd_itm_sub3);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		setConstString(offset + 23, $chd_itm_sub3, value);
	}


	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public String chd_itm_nm() {
		return getConstString(offset + 24, $chd_itm_nm);
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		setConstString(offset + 24, $chd_itm_nm, value);
	}


	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public String chd_itm_typ() {
		return getConstString(offset + 25, $chd_itm_typ);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ(String value) {
		setConstString(offset + 25, $chd_itm_typ, value);
	}


	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public String chd_itm_typ_nm() {
		return getConstString(offset + 26, $chd_itm_typ_nm);
	}

	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public void chd_itm_typ_nm(String value) {
		setConstString(offset + 26, $chd_itm_typ_nm, value);
	}


	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public String chd_itm_typ_d_cd() {
		return getConstString(offset + 27, $chd_itm_typ_d_cd);
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public void chd_itm_typ_d_cd(String value) {
		setConstString(offset + 27, $chd_itm_typ_d_cd, value);
	}


	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public String chd_itm_typ_d_nm() {
		return getConstString(offset + 28, $chd_itm_typ_d_nm);
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public void chd_itm_typ_d_nm(String value) {
		setConstString(offset + 28, $chd_itm_typ_d_nm, value);
	}


	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 29, $prio);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 29, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 29, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 29, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 29, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 29, $prio, value);
	}


	/**
	 * Application start date (BOM) 適用開始日（ＢＯＭ）.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 30, $st_dt);
	}

	/**
	 * Application start date (BOM) 適用開始日（ＢＯＭ）.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 30, $st_dt, value);
	}


	/**
	 * Application end date (BOM) 適用終了日（ＢＯＭ）.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 31, $end_dt);
	}

	/**
	 * Application end date (BOM) 適用終了日（ＢＯＭ）.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 31, $end_dt, value);
	}


	/**
	 * Memo 1 (Copy-to) メモ１（継承先）.<p>
	 *
	 */
	public String dest_memo1() {
		return getConstString(offset + 32, $dest_memo1);
	}

	/**
	 * Memo 1 (Copy-to) メモ１（継承先）.<p>
	 *
	 */
	public void dest_memo1(String value) {
		setConstString(offset + 32, $dest_memo1, value);
	}


	/**
	 * Memo 2 (Copy-to) メモ２（継承先）.<p>
	 *
	 */
	public String dest_memo2() {
		return getConstString(offset + 33, $dest_memo2);
	}

	/**
	 * Memo 2 (Copy-to) メモ２（継承先）.<p>
	 *
	 */
	public void dest_memo2(String value) {
		setConstString(offset + 33, $dest_memo2, value);
	}


	/**
	 * Memo 3 (Copy-to) メモ３（継承先）.<p>
	 *
	 */
	public String dest_memo3() {
		return getConstString(offset + 34, $dest_memo3);
	}

	/**
	 * Memo 3 (Copy-to) メモ３（継承先）.<p>
	 *
	 */
	public void dest_memo3(String value) {
		setConstString(offset + 34, $dest_memo3, value);
	}


	/**
	 * Memo 1 (Copy-from) メモ１（継承元）.<p>
	 *
	 */
	public String src_memo1() {
		return getConstString(offset + 35, $src_memo1);
	}

	/**
	 * Memo 1 (Copy-from) メモ１（継承元）.<p>
	 *
	 */
	public void src_memo1(String value) {
		setConstString(offset + 35, $src_memo1, value);
	}


	/**
	 * Memo 2 (Copy-from) メモ２（継承元）.<p>
	 *
	 */
	public String src_memo2() {
		return getConstString(offset + 36, $src_memo2);
	}

	/**
	 * Memo 2 (Copy-from) メモ２（継承元）.<p>
	 *
	 */
	public void src_memo2(String value) {
		setConstString(offset + 36, $src_memo2, value);
	}


	/**
	 * Memo 3 (Copy-from) メモ３（継承元）.<p>
	 *
	 */
	public String src_memo3() {
		return getConstString(offset + 37, $src_memo3);
	}

	/**
	 * Memo 3 (Copy-from) メモ３（継承元）.<p>
	 *
	 */
	public void src_memo3(String value) {
		setConstString(offset + 37, $src_memo3, value);
	}


	/**
	 * Entry user ID (Copy-to) 登録ユーザＩＤ（継承先）.<p>
	 *
	 */
	public String dest_ins_usr_id() {
		return getConstString(offset + 38, $dest_ins_usr_id);
	}

	/**
	 * Entry user ID (Copy-to) 登録ユーザＩＤ（継承先）.<p>
	 *
	 */
	public void dest_ins_usr_id(String value) {
		setConstString(offset + 38, $dest_ins_usr_id, value);
	}


	/**
	 * Entry user name (Copy-to) 登録ユーザ名（継承先）.<p>
	 *
	 */
	public String dest_ins_usr_nm() {
		return getConstString(offset + 39, $dest_ins_usr_nm);
	}

	/**
	 * Entry user name (Copy-to) 登録ユーザ名（継承先）.<p>
	 *
	 */
	public void dest_ins_usr_nm(String value) {
		setConstString(offset + 39, $dest_ins_usr_nm, value);
	}


	/**
	 * Entry date and time (Copy-to) 登録日時（継承先）.<p>
	 *
	 */
	public MCTimestamp dest_ins_ts() {
		return getConstTimestamp(offset + 40, $dest_ins_ts);
	}

	/**
	 * Entry date and time (Copy-to) 登録日時（継承先）.<p>
	 *
	 */
	public void dest_ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 40, $dest_ins_ts, value);
	}


	/**
	 * Entry function ID (Copy-to) 登録機能ＩＤ（継承先）.<p>
	 *
	 */
	public String dest_ins_func_id() {
		return getConstString(offset + 41, $dest_ins_func_id);
	}

	/**
	 * Entry function ID (Copy-to) 登録機能ＩＤ（継承先）.<p>
	 *
	 */
	public void dest_ins_func_id(String value) {
		setConstString(offset + 41, $dest_ins_func_id, value);
	}


	/**
	 * Entry function name (Copy-to) 登録機能名（継承先）.<p>
	 *
	 */
	public String dest_ins_func_nm() {
		return getConstString(offset + 42, $dest_ins_func_nm);
	}

	/**
	 * Entry function name (Copy-to) 登録機能名（継承先）.<p>
	 *
	 */
	public void dest_ins_func_nm(String value) {
		setConstString(offset + 42, $dest_ins_func_nm, value);
	}


	/**
	 * Update counter (Copy-to) 更新カウンタ（継承先）.<p>
	 *
	 */
	public MCNumber dest_upd_cntr() {
		return getConstNumber(offset + 43, $dest_upd_cntr);
	}

	/**
	 * Update counter (Copy-to) 更新カウンタ（継承先）.<p>
	 *
	 */
	public void dest_upd_cntr(MCNumber value) {
		setConstNumber(offset + 43, $dest_upd_cntr, value);
	}

	/**
	 * Update counter (Copy-to) 更新カウンタ（継承先）.<p>
	 *
	 */
	public void dest_upd_cntr(int value) {
		setConstNumber(offset + 43, $dest_upd_cntr, value);
	}

	/**
	 * Update counter (Copy-to) 更新カウンタ（継承先）.<p>
	 *
	 */
	public void dest_upd_cntr(long value) {
		setConstNumber(offset + 43, $dest_upd_cntr, value);
	}

	/**
	 * Update counter (Copy-to) 更新カウンタ（継承先）.<p>
	 *
	 */
	public void dest_upd_cntr(float value) {
		setConstNumber(offset + 43, $dest_upd_cntr, value);
	}

	/**
	 * Update counter (Copy-to) 更新カウンタ（継承先）.<p>
	 *
	 */
	public void dest_upd_cntr(double value) {
		setConstNumber(offset + 43, $dest_upd_cntr, value);
	}


	/**
	 * Update user ID (Copy-to) 更新ユーザＩＤ（継承先）.<p>
	 *
	 */
	public String dest_upd_usr_id() {
		return getConstString(offset + 44, $dest_upd_usr_id);
	}

	/**
	 * Update user ID (Copy-to) 更新ユーザＩＤ（継承先）.<p>
	 *
	 */
	public void dest_upd_usr_id(String value) {
		setConstString(offset + 44, $dest_upd_usr_id, value);
	}


	/**
	 * Update user name (Copy-to) 更新ユーザ名（継承先）.<p>
	 *
	 */
	public String dest_upd_usr_nm() {
		return getConstString(offset + 45, $dest_upd_usr_nm);
	}

	/**
	 * Update user name (Copy-to) 更新ユーザ名（継承先）.<p>
	 *
	 */
	public void dest_upd_usr_nm(String value) {
		setConstString(offset + 45, $dest_upd_usr_nm, value);
	}


	/**
	 * Update date and time (Copy-to) 更新日時（継承先）.<p>
	 *
	 */
	public MCTimestamp dest_upd_ts() {
		return getConstTimestamp(offset + 46, $dest_upd_ts);
	}

	/**
	 * Update date and time (Copy-to) 更新日時（継承先）.<p>
	 *
	 */
	public void dest_upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 46, $dest_upd_ts, value);
	}


	/**
	 * Update function ID (Copy-to) 更新機能ＩＤ（継承先）.<p>
	 *
	 */
	public String dest_upd_func_id() {
		return getConstString(offset + 47, $dest_upd_func_id);
	}

	/**
	 * Update function ID (Copy-to) 更新機能ＩＤ（継承先）.<p>
	 *
	 */
	public void dest_upd_func_id(String value) {
		setConstString(offset + 47, $dest_upd_func_id, value);
	}


	/**
	 * Update function name (Copy-to) 更新機能名（継承先）.<p>
	 *
	 */
	public String dest_upd_func_nm() {
		return getConstString(offset + 48, $dest_upd_func_nm);
	}

	/**
	 * Update function name (Copy-to) 更新機能名（継承先）.<p>
	 *
	 */
	public void dest_upd_func_nm(String value) {
		setConstString(offset + 48, $dest_upd_func_nm, value);
	}


	/**
	 * Update request No. (Copy-to) 更新リクエストＮＯ（継承先）.<p>
	 *
	 */
	public String dest_upd_srv_req_no() {
		return getConstString(offset + 49, $dest_upd_srv_req_no);
	}

	/**
	 * Update request No. (Copy-to) 更新リクエストＮＯ（継承先）.<p>
	 *
	 */
	public void dest_upd_srv_req_no(String value) {
		setConstString(offset + 49, $dest_upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID (Copy-to) 論理削除ユーザＩＤ（継承先）.<p>
	 *
	 */
	public String dest_del_usr_id() {
		return getConstString(offset + 50, $dest_del_usr_id);
	}

	/**
	 * Logical delete user ID (Copy-to) 論理削除ユーザＩＤ（継承先）.<p>
	 *
	 */
	public void dest_del_usr_id(String value) {
		setConstString(offset + 50, $dest_del_usr_id, value);
	}


	/**
	 * Logical delete user name (Copy-to) 論理削除ユーザ名（継承先）.<p>
	 *
	 */
	public String dest_del_usr_nm() {
		return getConstString(offset + 51, $dest_del_usr_nm);
	}

	/**
	 * Logical delete user name (Copy-to) 論理削除ユーザ名（継承先）.<p>
	 *
	 */
	public void dest_del_usr_nm(String value) {
		setConstString(offset + 51, $dest_del_usr_nm, value);
	}


	/**
	 * Logical delete date and time (Copy-to) 論理削除日時（継承先）.<p>
	 *
	 */
	public MCTimestamp dest_del_ts() {
		return getConstTimestamp(offset + 52, $dest_del_ts);
	}

	/**
	 * Logical delete date and time (Copy-to) 論理削除日時（継承先）.<p>
	 *
	 */
	public void dest_del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 52, $dest_del_ts, value);
	}


	/**
	 * Entry user ID (Copy-from) 登録ユーザＩＤ（継承元）.<p>
	 *
	 */
	public String src_ins_usr_id() {
		return getConstString(offset + 53, $src_ins_usr_id);
	}

	/**
	 * Entry user ID (Copy-from) 登録ユーザＩＤ（継承元）.<p>
	 *
	 */
	public void src_ins_usr_id(String value) {
		setConstString(offset + 53, $src_ins_usr_id, value);
	}


	/**
	 * Entry user name (Copy-from) 登録ユーザ名（継承元）.<p>
	 *
	 */
	public String src_ins_usr_nm() {
		return getConstString(offset + 54, $src_ins_usr_nm);
	}

	/**
	 * Entry user name (Copy-from) 登録ユーザ名（継承元）.<p>
	 *
	 */
	public void src_ins_usr_nm(String value) {
		setConstString(offset + 54, $src_ins_usr_nm, value);
	}


	/**
	 * Entry date and time (Copy-from) 登録日時（継承元）.<p>
	 *
	 */
	public MCTimestamp src_ins_ts() {
		return getConstTimestamp(offset + 55, $src_ins_ts);
	}

	/**
	 * Entry date and time (Copy-from) 登録日時（継承元）.<p>
	 *
	 */
	public void src_ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 55, $src_ins_ts, value);
	}


	/**
	 * Entry function ID (Copy-from) 登録機能ＩＤ（継承元）.<p>
	 *
	 */
	public String src_ins_func_id() {
		return getConstString(offset + 56, $src_ins_func_id);
	}

	/**
	 * Entry function ID (Copy-from) 登録機能ＩＤ（継承元）.<p>
	 *
	 */
	public void src_ins_func_id(String value) {
		setConstString(offset + 56, $src_ins_func_id, value);
	}


	/**
	 * Entry function name (Copy-from) 登録機能名（継承元）.<p>
	 *
	 */
	public String src_ins_func_nm() {
		return getConstString(offset + 57, $src_ins_func_nm);
	}

	/**
	 * Entry function name (Copy-from) 登録機能名（継承元）.<p>
	 *
	 */
	public void src_ins_func_nm(String value) {
		setConstString(offset + 57, $src_ins_func_nm, value);
	}


	/**
	 * Update counter (Copy-from) 更新カウンタ（継承元）.<p>
	 *
	 */
	public MCNumber src_upd_cntr() {
		return getConstNumber(offset + 58, $src_upd_cntr);
	}

	/**
	 * Update counter (Copy-from) 更新カウンタ（継承元）.<p>
	 *
	 */
	public void src_upd_cntr(MCNumber value) {
		setConstNumber(offset + 58, $src_upd_cntr, value);
	}

	/**
	 * Update counter (Copy-from) 更新カウンタ（継承元）.<p>
	 *
	 */
	public void src_upd_cntr(int value) {
		setConstNumber(offset + 58, $src_upd_cntr, value);
	}

	/**
	 * Update counter (Copy-from) 更新カウンタ（継承元）.<p>
	 *
	 */
	public void src_upd_cntr(long value) {
		setConstNumber(offset + 58, $src_upd_cntr, value);
	}

	/**
	 * Update counter (Copy-from) 更新カウンタ（継承元）.<p>
	 *
	 */
	public void src_upd_cntr(float value) {
		setConstNumber(offset + 58, $src_upd_cntr, value);
	}

	/**
	 * Update counter (Copy-from) 更新カウンタ（継承元）.<p>
	 *
	 */
	public void src_upd_cntr(double value) {
		setConstNumber(offset + 58, $src_upd_cntr, value);
	}


	/**
	 * Update user ID (Copy-from) 更新ユーザＩＤ（継承元）.<p>
	 *
	 */
	public String src_upd_usr_id() {
		return getConstString(offset + 59, $src_upd_usr_id);
	}

	/**
	 * Update user ID (Copy-from) 更新ユーザＩＤ（継承元）.<p>
	 *
	 */
	public void src_upd_usr_id(String value) {
		setConstString(offset + 59, $src_upd_usr_id, value);
	}


	/**
	 * Update user name (Copy-from) 更新ユーザ名（継承元）.<p>
	 *
	 */
	public String src_upd_usr_nm() {
		return getConstString(offset + 60, $src_upd_usr_nm);
	}

	/**
	 * Update user name (Copy-from) 更新ユーザ名（継承元）.<p>
	 *
	 */
	public void src_upd_usr_nm(String value) {
		setConstString(offset + 60, $src_upd_usr_nm, value);
	}


	/**
	 * Update date and time (Copy-from) 更新日時（継承元）.<p>
	 *
	 */
	public MCTimestamp src_upd_ts() {
		return getConstTimestamp(offset + 61, $src_upd_ts);
	}

	/**
	 * Update date and time (Copy-from) 更新日時（継承元）.<p>
	 *
	 */
	public void src_upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 61, $src_upd_ts, value);
	}


	/**
	 * Update function ID (Copy-from) 更新機能ＩＤ（継承元）.<p>
	 *
	 */
	public String src_upd_func_id() {
		return getConstString(offset + 62, $src_upd_func_id);
	}

	/**
	 * Update function ID (Copy-from) 更新機能ＩＤ（継承元）.<p>
	 *
	 */
	public void src_upd_func_id(String value) {
		setConstString(offset + 62, $src_upd_func_id, value);
	}


	/**
	 * Update function name (Copy-from) 更新機能名（継承元）.<p>
	 *
	 */
	public String src_upd_func_nm() {
		return getConstString(offset + 63, $src_upd_func_nm);
	}

	/**
	 * Update function name (Copy-from) 更新機能名（継承元）.<p>
	 *
	 */
	public void src_upd_func_nm(String value) {
		setConstString(offset + 63, $src_upd_func_nm, value);
	}


	/**
	 * Update request No. (Copy-from) 更新リクエストＮＯ（継承元）.<p>
	 *
	 */
	public String src_upd_srv_req_no() {
		return getConstString(offset + 64, $src_upd_srv_req_no);
	}

	/**
	 * Update request No. (Copy-from) 更新リクエストＮＯ（継承元）.<p>
	 *
	 */
	public void src_upd_srv_req_no(String value) {
		setConstString(offset + 64, $src_upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID (Copy-from) 論理削除ユーザＩＤ（継承元）.<p>
	 *
	 */
	public String src_del_usr_id() {
		return getConstString(offset + 65, $src_del_usr_id);
	}

	/**
	 * Logical delete user ID (Copy-from) 論理削除ユーザＩＤ（継承元）.<p>
	 *
	 */
	public void src_del_usr_id(String value) {
		setConstString(offset + 65, $src_del_usr_id, value);
	}


	/**
	 * Logical delete user name (Copy-from) 論理削除ユーザ名（継承元）.<p>
	 *
	 */
	public String src_del_usr_nm() {
		return getConstString(offset + 66, $src_del_usr_nm);
	}

	/**
	 * Logical delete user name (Copy-from) 論理削除ユーザ名（継承元）.<p>
	 *
	 */
	public void src_del_usr_nm(String value) {
		setConstString(offset + 66, $src_del_usr_nm, value);
	}


	/**
	 * Logical delete date and time (Copy-from) 論理削除日時（継承元）.<p>
	 *
	 */
	public MCTimestamp src_del_ts() {
		return getConstTimestamp(offset + 67, $src_del_ts);
	}

	/**
	 * Logical delete date and time (Copy-from) 論理削除日時（継承元）.<p>
	 *
	 */
	public void src_del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 67, $src_del_ts, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_nm();
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return par_itm_typ_d_cd();
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_d_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($lot_inh_col_typ.equalsIgnoreCase(name)) {
			return lot_inh_col_typ();
		}
		if ($lot_inh_col_typ_nm.equalsIgnoreCase(name)) {
			return lot_inh_col_typ_nm();
		}
		if ($lot_inh_typ.equalsIgnoreCase(name)) {
			return lot_inh_typ();
		}
		if ($lot_inh_typ_nm.equalsIgnoreCase(name)) {
			return lot_inh_typ_nm();
		}
		if ($add_concat_col.equalsIgnoreCase(name)) {
			return add_concat_col();
		}
		if ($add_concat_col_nm.equalsIgnoreCase(name)) {
			return add_concat_col_nm();
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			return chd_itm_cd();
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			return chd_itm_sub1();
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			return chd_itm_sub2();
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			return chd_itm_sub3();
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			return chd_itm_nm();
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			return chd_itm_typ();
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_nm();
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_cd();
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_nm();
		}
		if ($dest_memo1.equalsIgnoreCase(name)) {
			return dest_memo1();
		}
		if ($dest_memo2.equalsIgnoreCase(name)) {
			return dest_memo2();
		}
		if ($dest_memo3.equalsIgnoreCase(name)) {
			return dest_memo3();
		}
		if ($src_memo1.equalsIgnoreCase(name)) {
			return src_memo1();
		}
		if ($src_memo2.equalsIgnoreCase(name)) {
			return src_memo2();
		}
		if ($src_memo3.equalsIgnoreCase(name)) {
			return src_memo3();
		}
		if ($dest_ins_usr_id.equalsIgnoreCase(name)) {
			return dest_ins_usr_id();
		}
		if ($dest_ins_usr_nm.equalsIgnoreCase(name)) {
			return dest_ins_usr_nm();
		}
		if ($dest_ins_func_id.equalsIgnoreCase(name)) {
			return dest_ins_func_id();
		}
		if ($dest_ins_func_nm.equalsIgnoreCase(name)) {
			return dest_ins_func_nm();
		}
		if ($dest_upd_usr_id.equalsIgnoreCase(name)) {
			return dest_upd_usr_id();
		}
		if ($dest_upd_usr_nm.equalsIgnoreCase(name)) {
			return dest_upd_usr_nm();
		}
		if ($dest_upd_func_id.equalsIgnoreCase(name)) {
			return dest_upd_func_id();
		}
		if ($dest_upd_func_nm.equalsIgnoreCase(name)) {
			return dest_upd_func_nm();
		}
		if ($dest_upd_srv_req_no.equalsIgnoreCase(name)) {
			return dest_upd_srv_req_no();
		}
		if ($dest_del_usr_id.equalsIgnoreCase(name)) {
			return dest_del_usr_id();
		}
		if ($dest_del_usr_nm.equalsIgnoreCase(name)) {
			return dest_del_usr_nm();
		}
		if ($src_ins_usr_id.equalsIgnoreCase(name)) {
			return src_ins_usr_id();
		}
		if ($src_ins_usr_nm.equalsIgnoreCase(name)) {
			return src_ins_usr_nm();
		}
		if ($src_ins_func_id.equalsIgnoreCase(name)) {
			return src_ins_func_id();
		}
		if ($src_ins_func_nm.equalsIgnoreCase(name)) {
			return src_ins_func_nm();
		}
		if ($src_upd_usr_id.equalsIgnoreCase(name)) {
			return src_upd_usr_id();
		}
		if ($src_upd_usr_nm.equalsIgnoreCase(name)) {
			return src_upd_usr_nm();
		}
		if ($src_upd_func_id.equalsIgnoreCase(name)) {
			return src_upd_func_id();
		}
		if ($src_upd_func_nm.equalsIgnoreCase(name)) {
			return src_upd_func_nm();
		}
		if ($src_upd_srv_req_no.equalsIgnoreCase(name)) {
			return src_upd_srv_req_no();
		}
		if ($src_del_usr_id.equalsIgnoreCase(name)) {
			return src_del_usr_id();
		}
		if ($src_del_usr_nm.equalsIgnoreCase(name)) {
			return src_del_usr_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($dest_upd_cntr.equalsIgnoreCase(name)) {
			return dest_upd_cntr();
		}
		if ($src_upd_cntr.equalsIgnoreCase(name)) {
			return src_upd_cntr();
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
		if ($dest_ins_ts.equalsIgnoreCase(name)) {
			return dest_ins_ts();
		}
		if ($dest_upd_ts.equalsIgnoreCase(name)) {
			return dest_upd_ts();
		}
		if ($dest_del_ts.equalsIgnoreCase(name)) {
			return dest_del_ts();
		}
		if ($src_ins_ts.equalsIgnoreCase(name)) {
			return src_ins_ts();
		}
		if ($src_upd_ts.equalsIgnoreCase(name)) {
			return src_upd_ts();
		}
		if ($src_del_ts.equalsIgnoreCase(name)) {
			return src_del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($overflow_err_flg.equalsIgnoreCase(name)) {
			return overflow_err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_nm();
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return par_itm_typ_d_cd();
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_d_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($lot_inh_col_typ.equalsIgnoreCase(name)) {
			return lot_inh_col_typ();
		}
		if ($lot_inh_col_typ_nm.equalsIgnoreCase(name)) {
			return lot_inh_col_typ_nm();
		}
		if ($lot_inh_typ.equalsIgnoreCase(name)) {
			return lot_inh_typ();
		}
		if ($lot_inh_typ_nm.equalsIgnoreCase(name)) {
			return lot_inh_typ_nm();
		}
		if ($add_concat_col.equalsIgnoreCase(name)) {
			return add_concat_col();
		}
		if ($add_concat_col_nm.equalsIgnoreCase(name)) {
			return add_concat_col_nm();
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			return chd_itm_cd();
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			return chd_itm_sub1();
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			return chd_itm_sub2();
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			return chd_itm_sub3();
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			return chd_itm_nm();
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			return chd_itm_typ();
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_nm();
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_cd();
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_nm();
		}
		if ($dest_memo1.equalsIgnoreCase(name)) {
			return dest_memo1();
		}
		if ($dest_memo2.equalsIgnoreCase(name)) {
			return dest_memo2();
		}
		if ($dest_memo3.equalsIgnoreCase(name)) {
			return dest_memo3();
		}
		if ($src_memo1.equalsIgnoreCase(name)) {
			return src_memo1();
		}
		if ($src_memo2.equalsIgnoreCase(name)) {
			return src_memo2();
		}
		if ($src_memo3.equalsIgnoreCase(name)) {
			return src_memo3();
		}
		if ($dest_ins_usr_id.equalsIgnoreCase(name)) {
			return dest_ins_usr_id();
		}
		if ($dest_ins_usr_nm.equalsIgnoreCase(name)) {
			return dest_ins_usr_nm();
		}
		if ($dest_ins_func_id.equalsIgnoreCase(name)) {
			return dest_ins_func_id();
		}
		if ($dest_ins_func_nm.equalsIgnoreCase(name)) {
			return dest_ins_func_nm();
		}
		if ($dest_upd_usr_id.equalsIgnoreCase(name)) {
			return dest_upd_usr_id();
		}
		if ($dest_upd_usr_nm.equalsIgnoreCase(name)) {
			return dest_upd_usr_nm();
		}
		if ($dest_upd_func_id.equalsIgnoreCase(name)) {
			return dest_upd_func_id();
		}
		if ($dest_upd_func_nm.equalsIgnoreCase(name)) {
			return dest_upd_func_nm();
		}
		if ($dest_upd_srv_req_no.equalsIgnoreCase(name)) {
			return dest_upd_srv_req_no();
		}
		if ($dest_del_usr_id.equalsIgnoreCase(name)) {
			return dest_del_usr_id();
		}
		if ($dest_del_usr_nm.equalsIgnoreCase(name)) {
			return dest_del_usr_nm();
		}
		if ($src_ins_usr_id.equalsIgnoreCase(name)) {
			return src_ins_usr_id();
		}
		if ($src_ins_usr_nm.equalsIgnoreCase(name)) {
			return src_ins_usr_nm();
		}
		if ($src_ins_func_id.equalsIgnoreCase(name)) {
			return src_ins_func_id();
		}
		if ($src_ins_func_nm.equalsIgnoreCase(name)) {
			return src_ins_func_nm();
		}
		if ($src_upd_usr_id.equalsIgnoreCase(name)) {
			return src_upd_usr_id();
		}
		if ($src_upd_usr_nm.equalsIgnoreCase(name)) {
			return src_upd_usr_nm();
		}
		if ($src_upd_func_id.equalsIgnoreCase(name)) {
			return src_upd_func_id();
		}
		if ($src_upd_func_nm.equalsIgnoreCase(name)) {
			return src_upd_func_nm();
		}
		if ($src_upd_srv_req_no.equalsIgnoreCase(name)) {
			return src_upd_srv_req_no();
		}
		if ($src_del_usr_id.equalsIgnoreCase(name)) {
			return src_del_usr_id();
		}
		if ($src_del_usr_nm.equalsIgnoreCase(name)) {
			return src_del_usr_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($dest_upd_cntr.equalsIgnoreCase(name)) {
			return dest_upd_cntr();
		}
		if ($src_upd_cntr.equalsIgnoreCase(name)) {
			return src_upd_cntr();
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
		if ($dest_ins_ts.equalsIgnoreCase(name)) {
			return dest_ins_ts();
		}
		if ($dest_upd_ts.equalsIgnoreCase(name)) {
			return dest_upd_ts();
		}
		if ($dest_del_ts.equalsIgnoreCase(name)) {
			return dest_del_ts();
		}
		if ($src_ins_ts.equalsIgnoreCase(name)) {
			return src_ins_ts();
		}
		if ($src_upd_ts.equalsIgnoreCase(name)) {
			return src_upd_ts();
		}
		if ($src_del_ts.equalsIgnoreCase(name)) {
			return src_del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($overflow_err_flg.equalsIgnoreCase(name)) {
			return overflow_err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
			return;
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
			return;
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			par_itm_typ_nm(value);
			return;
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			par_itm_typ_d_cd(value);
			return;
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			par_itm_typ_d_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($lot_inh_col_typ.equalsIgnoreCase(name)) {
			lot_inh_col_typ(value);
			return;
		}
		if ($lot_inh_col_typ_nm.equalsIgnoreCase(name)) {
			lot_inh_col_typ_nm(value);
			return;
		}
		if ($lot_inh_typ.equalsIgnoreCase(name)) {
			lot_inh_typ(value);
			return;
		}
		if ($lot_inh_typ_nm.equalsIgnoreCase(name)) {
			lot_inh_typ_nm(value);
			return;
		}
		if ($add_concat_col.equalsIgnoreCase(name)) {
			add_concat_col(value);
			return;
		}
		if ($add_concat_col_nm.equalsIgnoreCase(name)) {
			add_concat_col_nm(value);
			return;
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			chd_itm_cd(value);
			return;
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			chd_itm_sub1(value);
			return;
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			chd_itm_sub2(value);
			return;
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			chd_itm_sub3(value);
			return;
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			chd_itm_nm(value);
			return;
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			chd_itm_typ(value);
			return;
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_nm(value);
			return;
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			chd_itm_typ_d_cd(value);
			return;
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_d_nm(value);
			return;
		}
		if ($dest_memo1.equalsIgnoreCase(name)) {
			dest_memo1(value);
			return;
		}
		if ($dest_memo2.equalsIgnoreCase(name)) {
			dest_memo2(value);
			return;
		}
		if ($dest_memo3.equalsIgnoreCase(name)) {
			dest_memo3(value);
			return;
		}
		if ($src_memo1.equalsIgnoreCase(name)) {
			src_memo1(value);
			return;
		}
		if ($src_memo2.equalsIgnoreCase(name)) {
			src_memo2(value);
			return;
		}
		if ($src_memo3.equalsIgnoreCase(name)) {
			src_memo3(value);
			return;
		}
		if ($dest_ins_usr_id.equalsIgnoreCase(name)) {
			dest_ins_usr_id(value);
			return;
		}
		if ($dest_ins_usr_nm.equalsIgnoreCase(name)) {
			dest_ins_usr_nm(value);
			return;
		}
		if ($dest_ins_func_id.equalsIgnoreCase(name)) {
			dest_ins_func_id(value);
			return;
		}
		if ($dest_ins_func_nm.equalsIgnoreCase(name)) {
			dest_ins_func_nm(value);
			return;
		}
		if ($dest_upd_usr_id.equalsIgnoreCase(name)) {
			dest_upd_usr_id(value);
			return;
		}
		if ($dest_upd_usr_nm.equalsIgnoreCase(name)) {
			dest_upd_usr_nm(value);
			return;
		}
		if ($dest_upd_func_id.equalsIgnoreCase(name)) {
			dest_upd_func_id(value);
			return;
		}
		if ($dest_upd_func_nm.equalsIgnoreCase(name)) {
			dest_upd_func_nm(value);
			return;
		}
		if ($dest_upd_srv_req_no.equalsIgnoreCase(name)) {
			dest_upd_srv_req_no(value);
			return;
		}
		if ($dest_del_usr_id.equalsIgnoreCase(name)) {
			dest_del_usr_id(value);
			return;
		}
		if ($dest_del_usr_nm.equalsIgnoreCase(name)) {
			dest_del_usr_nm(value);
			return;
		}
		if ($src_ins_usr_id.equalsIgnoreCase(name)) {
			src_ins_usr_id(value);
			return;
		}
		if ($src_ins_usr_nm.equalsIgnoreCase(name)) {
			src_ins_usr_nm(value);
			return;
		}
		if ($src_ins_func_id.equalsIgnoreCase(name)) {
			src_ins_func_id(value);
			return;
		}
		if ($src_ins_func_nm.equalsIgnoreCase(name)) {
			src_ins_func_nm(value);
			return;
		}
		if ($src_upd_usr_id.equalsIgnoreCase(name)) {
			src_upd_usr_id(value);
			return;
		}
		if ($src_upd_usr_nm.equalsIgnoreCase(name)) {
			src_upd_usr_nm(value);
			return;
		}
		if ($src_upd_func_id.equalsIgnoreCase(name)) {
			src_upd_func_id(value);
			return;
		}
		if ($src_upd_func_nm.equalsIgnoreCase(name)) {
			src_upd_func_nm(value);
			return;
		}
		if ($src_upd_srv_req_no.equalsIgnoreCase(name)) {
			src_upd_srv_req_no(value);
			return;
		}
		if ($src_del_usr_id.equalsIgnoreCase(name)) {
			src_del_usr_id(value);
			return;
		}
		if ($src_del_usr_nm.equalsIgnoreCase(name)) {
			src_del_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($dest_upd_cntr.equalsIgnoreCase(name)) {
			dest_upd_cntr(value);
			return;
		}
		if ($src_upd_cntr.equalsIgnoreCase(name)) {
			src_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($dest_upd_cntr.equalsIgnoreCase(name)) {
			dest_upd_cntr(value);
			return;
		}
		if ($src_upd_cntr.equalsIgnoreCase(name)) {
			src_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($dest_upd_cntr.equalsIgnoreCase(name)) {
			dest_upd_cntr(value);
			return;
		}
		if ($src_upd_cntr.equalsIgnoreCase(name)) {
			src_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($dest_upd_cntr.equalsIgnoreCase(name)) {
			dest_upd_cntr(value);
			return;
		}
		if ($src_upd_cntr.equalsIgnoreCase(name)) {
			src_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($dest_upd_cntr.equalsIgnoreCase(name)) {
			dest_upd_cntr(value);
			return;
		}
		if ($src_upd_cntr.equalsIgnoreCase(name)) {
			src_upd_cntr(value);
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
		if ($dest_ins_ts.equalsIgnoreCase(name)) {
			dest_ins_ts(value);
			return;
		}
		if ($dest_upd_ts.equalsIgnoreCase(name)) {
			dest_upd_ts(value);
			return;
		}
		if ($dest_del_ts.equalsIgnoreCase(name)) {
			dest_del_ts(value);
			return;
		}
		if ($src_ins_ts.equalsIgnoreCase(name)) {
			src_ins_ts(value);
			return;
		}
		if ($src_upd_ts.equalsIgnoreCase(name)) {
			src_upd_ts(value);
			return;
		}
		if ($src_del_ts.equalsIgnoreCase(name)) {
			src_del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($overflow_err_flg.equalsIgnoreCase(name)) {
			overflow_err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
			return;
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
			return;
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			par_itm_typ_nm(value);
			return;
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			par_itm_typ_d_cd(value);
			return;
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			par_itm_typ_d_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($lot_inh_col_typ.equalsIgnoreCase(name)) {
			lot_inh_col_typ(value);
			return;
		}
		if ($lot_inh_col_typ_nm.equalsIgnoreCase(name)) {
			lot_inh_col_typ_nm(value);
			return;
		}
		if ($lot_inh_typ.equalsIgnoreCase(name)) {
			lot_inh_typ(value);
			return;
		}
		if ($lot_inh_typ_nm.equalsIgnoreCase(name)) {
			lot_inh_typ_nm(value);
			return;
		}
		if ($add_concat_col.equalsIgnoreCase(name)) {
			add_concat_col(value);
			return;
		}
		if ($add_concat_col_nm.equalsIgnoreCase(name)) {
			add_concat_col_nm(value);
			return;
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			chd_itm_cd(value);
			return;
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			chd_itm_sub1(value);
			return;
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			chd_itm_sub2(value);
			return;
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			chd_itm_sub3(value);
			return;
		}
		if ($chd_itm_nm.equalsIgnoreCase(name)) {
			chd_itm_nm(value);
			return;
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			chd_itm_typ(value);
			return;
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_nm(value);
			return;
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			chd_itm_typ_d_cd(value);
			return;
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_d_nm(value);
			return;
		}
		if ($dest_memo1.equalsIgnoreCase(name)) {
			dest_memo1(value);
			return;
		}
		if ($dest_memo2.equalsIgnoreCase(name)) {
			dest_memo2(value);
			return;
		}
		if ($dest_memo3.equalsIgnoreCase(name)) {
			dest_memo3(value);
			return;
		}
		if ($src_memo1.equalsIgnoreCase(name)) {
			src_memo1(value);
			return;
		}
		if ($src_memo2.equalsIgnoreCase(name)) {
			src_memo2(value);
			return;
		}
		if ($src_memo3.equalsIgnoreCase(name)) {
			src_memo3(value);
			return;
		}
		if ($dest_ins_usr_id.equalsIgnoreCase(name)) {
			dest_ins_usr_id(value);
			return;
		}
		if ($dest_ins_usr_nm.equalsIgnoreCase(name)) {
			dest_ins_usr_nm(value);
			return;
		}
		if ($dest_ins_func_id.equalsIgnoreCase(name)) {
			dest_ins_func_id(value);
			return;
		}
		if ($dest_ins_func_nm.equalsIgnoreCase(name)) {
			dest_ins_func_nm(value);
			return;
		}
		if ($dest_upd_usr_id.equalsIgnoreCase(name)) {
			dest_upd_usr_id(value);
			return;
		}
		if ($dest_upd_usr_nm.equalsIgnoreCase(name)) {
			dest_upd_usr_nm(value);
			return;
		}
		if ($dest_upd_func_id.equalsIgnoreCase(name)) {
			dest_upd_func_id(value);
			return;
		}
		if ($dest_upd_func_nm.equalsIgnoreCase(name)) {
			dest_upd_func_nm(value);
			return;
		}
		if ($dest_upd_srv_req_no.equalsIgnoreCase(name)) {
			dest_upd_srv_req_no(value);
			return;
		}
		if ($dest_del_usr_id.equalsIgnoreCase(name)) {
			dest_del_usr_id(value);
			return;
		}
		if ($dest_del_usr_nm.equalsIgnoreCase(name)) {
			dest_del_usr_nm(value);
			return;
		}
		if ($src_ins_usr_id.equalsIgnoreCase(name)) {
			src_ins_usr_id(value);
			return;
		}
		if ($src_ins_usr_nm.equalsIgnoreCase(name)) {
			src_ins_usr_nm(value);
			return;
		}
		if ($src_ins_func_id.equalsIgnoreCase(name)) {
			src_ins_func_id(value);
			return;
		}
		if ($src_ins_func_nm.equalsIgnoreCase(name)) {
			src_ins_func_nm(value);
			return;
		}
		if ($src_upd_usr_id.equalsIgnoreCase(name)) {
			src_upd_usr_id(value);
			return;
		}
		if ($src_upd_usr_nm.equalsIgnoreCase(name)) {
			src_upd_usr_nm(value);
			return;
		}
		if ($src_upd_func_id.equalsIgnoreCase(name)) {
			src_upd_func_id(value);
			return;
		}
		if ($src_upd_func_nm.equalsIgnoreCase(name)) {
			src_upd_func_nm(value);
			return;
		}
		if ($src_upd_srv_req_no.equalsIgnoreCase(name)) {
			src_upd_srv_req_no(value);
			return;
		}
		if ($src_del_usr_id.equalsIgnoreCase(name)) {
			src_del_usr_id(value);
			return;
		}
		if ($src_del_usr_nm.equalsIgnoreCase(name)) {
			src_del_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($dest_upd_cntr.equalsIgnoreCase(name)) {
			dest_upd_cntr(value);
			return;
		}
		if ($src_upd_cntr.equalsIgnoreCase(name)) {
			src_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($dest_upd_cntr.equalsIgnoreCase(name)) {
			dest_upd_cntr(value);
			return;
		}
		if ($src_upd_cntr.equalsIgnoreCase(name)) {
			src_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($dest_upd_cntr.equalsIgnoreCase(name)) {
			dest_upd_cntr(value);
			return;
		}
		if ($src_upd_cntr.equalsIgnoreCase(name)) {
			src_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($dest_upd_cntr.equalsIgnoreCase(name)) {
			dest_upd_cntr(value);
			return;
		}
		if ($src_upd_cntr.equalsIgnoreCase(name)) {
			src_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($dest_upd_cntr.equalsIgnoreCase(name)) {
			dest_upd_cntr(value);
			return;
		}
		if ($src_upd_cntr.equalsIgnoreCase(name)) {
			src_upd_cntr(value);
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
		if ($dest_ins_ts.equalsIgnoreCase(name)) {
			dest_ins_ts(value);
			return;
		}
		if ($dest_upd_ts.equalsIgnoreCase(name)) {
			dest_upd_ts(value);
			return;
		}
		if ($dest_del_ts.equalsIgnoreCase(name)) {
			dest_del_ts(value);
			return;
		}
		if ($src_ins_ts.equalsIgnoreCase(name)) {
			src_ins_ts(value);
			return;
		}
		if ($src_upd_ts.equalsIgnoreCase(name)) {
			src_upd_ts(value);
			return;
		}
		if ($src_del_ts.equalsIgnoreCase(name)) {
			src_del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($overflow_err_flg.equalsIgnoreCase(name)) {
			overflow_err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

