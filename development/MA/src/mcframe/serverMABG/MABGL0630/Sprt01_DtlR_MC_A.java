package mcframe.serverMABG.MABGL0630;

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
 * ブロック"Sprt01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sprt01_DtlR_MC_A extends MCConstRow {

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public static final String $st_dt_key = "st_dt_key";
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
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
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $xpns_itm_cd = "xpns_itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $xpns_itm_sub1 = "xpns_itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $xpns_itm_sub2 = "xpns_itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $xpns_itm_sub3 = "xpns_itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $xpns_itm_nm = "xpns_itm_nm";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public static final String $alc_ac_nm = "alc_ac_nm";
	/**
	 * Allocation WG cd. 配賦ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $alc_wg_cd = "alc_wg_cd";
	/**
	 * Allocation WG name 配賦ワーキンググループ名.<p>
	 *
	 */
	public static final String $alc_wg_nm = "alc_wg_nm";
	/**
	 * Dept. copy flg. 部門引継ＦＬＧ.<p>
	 *
	 */
	public static final String $dpt_flg = "dpt_flg";
	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Allocation destination dept. name 配賦先部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * BP copy flg. 取引先引継ＦＬＧ.<p>
	 *
	 */
	public static final String $bp_flg = "bp_flg";
	/**
	 * Allocation destination BP cd. 配賦先取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * Allocation destination BP name 配賦先取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Lot No. copy flg. ロットＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public static final String $lot_no_flg = "lot_no_flg";
	/**
	 * Allocation destination lot No. 配賦先ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. copy flg. サブロットＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public static final String $sublot_no_flg = "sublot_no_flg";
	/**
	 * Allocation destination sublot No. 配賦先サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * SEIBAN No. 1 copy flg. 手配ＮＯ１引継ＦＬＧ.<p>
	 *
	 */
	public static final String $sno1_flg = "sno1_flg";
	/**
	 * Allocation destination SEIBAN No. 1 配賦先手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 copy flg. 手配ＮＯ２引継ＦＬＧ.<p>
	 *
	 */
	public static final String $sno2_flg = "sno2_flg";
	/**
	 * Allocation destination SEIBAN No. 2 配賦先手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 copy flg. 手配ＮＯ３引継ＦＬＧ.<p>
	 *
	 */
	public static final String $sno3_flg = "sno3_flg";
	/**
	 * Allocation destination SEIBAN No. 3 配賦先手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 copy flg. 手配ＮＯ４引継ＦＬＧ.<p>
	 *
	 */
	public static final String $sno4_flg = "sno4_flg";
	/**
	 * Allocation destination SEIBAN No. 4 配賦先手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Allocation destination item category cd. 配賦先品群ＣＤ.<p>
	 *
	 */
	public static final String $ctg_cd = "ctg_cd";
	/**
	 * Allocation destination item category name 配賦先品群名.<p>
	 *
	 */
	public static final String $ctg_nm = "ctg_nm";
	/**
	 * Allocation destination item cd. 配賦先品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Allocation destination branch No. 1 配賦先枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Allocation destination branch No. 2 配賦先枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Allocation destination branch No. 3 配賦先枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Allocation destination item name 配賦先品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Allocation destination location cd. 配賦先場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Allocation destination location name 配賦先場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Allocation destination operation cd. 配賦先工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Allocation destination operation name 配賦先工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * PO No. copy flg. 発注ＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public static final String $po_no_flg = "po_no_flg";
	/**
	 * Sales order No. copy flg. 受注ＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public static final String $slo_no_flg = "slo_no_flg";
	/**
	 * Invoice No. copy flg. インボイスＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public static final String $iv_no_flg = "iv_no_flg";
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


	public static final MCMeta st_dt_key_META = createCommonMeta($st_dt_key, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta xpns_itm_cd_META = createCommonMeta($xpns_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta xpns_itm_sub1_META = createCommonMeta($xpns_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta xpns_itm_sub2_META = createCommonMeta($xpns_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta xpns_itm_sub3_META = createCommonMeta($xpns_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta xpns_itm_nm_META = createCommonMeta($xpns_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta alc_wg_cd_META = createCommonMeta($alc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta alc_wg_nm_META = createCommonMeta($alc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_flg_META = createCommonMeta($dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta bp_flg_META = createCommonMeta($bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta lot_no_flg_META = createCommonMeta($lot_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_flg_META = createCommonMeta($sublot_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_flg_META = createCommonMeta($sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_flg_META = createCommonMeta($sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_flg_META = createCommonMeta($sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_flg_META = createCommonMeta($sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta ctg_cd_META = createCommonMeta($ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta ctg_nm_META = createCommonMeta($ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta po_no_flg_META = createCommonMeta($po_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_no_flg_META = createCommonMeta($slo_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_no_flg_META = createCommonMeta($iv_no_flg, mcframe.commonMA.meta.MA_META.FLG);
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

	protected static final ConstMetaList<Sprt01_DtlR> constMetas = new ConstMetaList<Sprt01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			st_dt_key_META,
			del_flg_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			xpns_itm_cd_META,
			xpns_itm_sub1_META,
			xpns_itm_sub2_META,
			xpns_itm_sub3_META,
			xpns_itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			st_dt_META,
			end_dt_META,
			alc_ac_cd_META,
			alc_ac_nm_META,
			alc_wg_cd_META,
			alc_wg_nm_META,
			dpt_flg_META,
			dpt_cd_META,
			dpt_nm_META,
			bp_flg_META,
			bp_cd_META,
			bp_nm_META,
			lot_no_flg_META,
			lot_no_META,
			sublot_no_flg_META,
			sublot_no_META,
			sno1_flg_META,
			sno1_META,
			sno2_flg_META,
			sno2_META,
			sno3_flg_META,
			sno3_META,
			sno4_flg_META,
			sno4_META,
			ctg_cd_META,
			ctg_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			loc_cd_META,
			loc_nm_META,
			oper_cd_META,
			oper_nm_META,
			po_no_flg_META,
			slo_no_flg_META,
			iv_no_flg_META,
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
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$xpns_itm_sub1, "E"},	// xpns_itm_sub1
				{$xpns_itm_sub2, "E"},	// xpns_itm_sub2
				{$xpns_itm_sub3, "E"}	// xpns_itm_sub3
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
	protected Sprt01_DtlR_MC_A(ConstMetaList<? extends Sprt01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR clone() {
		return (Sprt01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR createInstance() {
		return (Sprt01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR getValues(String... names) {
		return (Sprt01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public MCDate st_dt_key() {
		return getConstDate(offset + 0, $st_dt_key);
	}

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public void st_dt_key(MCDate value) {
		setConstDate(offset + 0, $st_dt_key, value);
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 1, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 1, $del_flg, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 2, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 2, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 3, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 3, $calc_ctg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 4, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 4, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 5, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 5, $wg_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String xpns_itm_cd() {
		return getConstString(offset + 6, $xpns_itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void xpns_itm_cd(String value) {
		setConstString(offset + 6, $xpns_itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String xpns_itm_sub1() {
		return getConstString(offset + 7, $xpns_itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void xpns_itm_sub1(String value) {
		setConstString(offset + 7, $xpns_itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String xpns_itm_sub2() {
		return getConstString(offset + 8, $xpns_itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void xpns_itm_sub2(String value) {
		setConstString(offset + 8, $xpns_itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String xpns_itm_sub3() {
		return getConstString(offset + 9, $xpns_itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void xpns_itm_sub3(String value) {
		setConstString(offset + 9, $xpns_itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String xpns_itm_nm() {
		return getConstString(offset + 10, $xpns_itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void xpns_itm_nm(String value) {
		setConstString(offset + 10, $xpns_itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 11, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 11, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 12, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 12, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 13, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 13, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 14, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 14, $itm_typ_d_nm, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 15, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 15, $ac_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 16, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 16, $ac_rsn_nm, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 17, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 17, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 18, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 18, $end_dt, value);
	}


	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 19, $alc_ac_cd);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 19, $alc_ac_cd, value);
	}


	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 20, $alc_ac_nm);
	}

	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 20, $alc_ac_nm, value);
	}


	/**
	 * Allocation WG cd. 配賦ワーキンググループＣＤ.<p>
	 *
	 */
	public String alc_wg_cd() {
		return getConstString(offset + 21, $alc_wg_cd);
	}

	/**
	 * Allocation WG cd. 配賦ワーキンググループＣＤ.<p>
	 *
	 */
	public void alc_wg_cd(String value) {
		setConstString(offset + 21, $alc_wg_cd, value);
	}


	/**
	 * Allocation WG name 配賦ワーキンググループ名.<p>
	 *
	 */
	public String alc_wg_nm() {
		return getConstString(offset + 22, $alc_wg_nm);
	}

	/**
	 * Allocation WG name 配賦ワーキンググループ名.<p>
	 *
	 */
	public void alc_wg_nm(String value) {
		setConstString(offset + 22, $alc_wg_nm, value);
	}


	/**
	 * Dept. copy flg. 部門引継ＦＬＧ.<p>
	 *
	 */
	public boolean dpt_flg() {
		return getConstBoolean(offset + 23, $dpt_flg);
	}

	/**
	 * Dept. copy flg. 部門引継ＦＬＧ.<p>
	 *
	 */
	public void dpt_flg(boolean value) {
		setConstBoolean(offset + 23, $dpt_flg, value);
	}


	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 24, $dpt_cd);
	}

	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 24, $dpt_cd, value);
	}


	/**
	 * Allocation destination dept. name 配賦先部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 25, $dpt_nm);
	}

	/**
	 * Allocation destination dept. name 配賦先部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 25, $dpt_nm, value);
	}


	/**
	 * BP copy flg. 取引先引継ＦＬＧ.<p>
	 *
	 */
	public boolean bp_flg() {
		return getConstBoolean(offset + 26, $bp_flg);
	}

	/**
	 * BP copy flg. 取引先引継ＦＬＧ.<p>
	 *
	 */
	public void bp_flg(boolean value) {
		setConstBoolean(offset + 26, $bp_flg, value);
	}


	/**
	 * Allocation destination BP cd. 配賦先取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 27, $bp_cd);
	}

	/**
	 * Allocation destination BP cd. 配賦先取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 27, $bp_cd, value);
	}


	/**
	 * Allocation destination BP name 配賦先取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 28, $bp_nm);
	}

	/**
	 * Allocation destination BP name 配賦先取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 28, $bp_nm, value);
	}


	/**
	 * Lot No. copy flg. ロットＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public boolean lot_no_flg() {
		return getConstBoolean(offset + 29, $lot_no_flg);
	}

	/**
	 * Lot No. copy flg. ロットＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public void lot_no_flg(boolean value) {
		setConstBoolean(offset + 29, $lot_no_flg, value);
	}


	/**
	 * Allocation destination lot No. 配賦先ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 30, $lot_no);
	}

	/**
	 * Allocation destination lot No. 配賦先ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 30, $lot_no, value);
	}


	/**
	 * Sublot No. copy flg. サブロットＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public boolean sublot_no_flg() {
		return getConstBoolean(offset + 31, $sublot_no_flg);
	}

	/**
	 * Sublot No. copy flg. サブロットＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public void sublot_no_flg(boolean value) {
		setConstBoolean(offset + 31, $sublot_no_flg, value);
	}


	/**
	 * Allocation destination sublot No. 配賦先サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 32, $sublot_no);
	}

	/**
	 * Allocation destination sublot No. 配賦先サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 32, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 copy flg. 手配ＮＯ１引継ＦＬＧ.<p>
	 *
	 */
	public boolean sno1_flg() {
		return getConstBoolean(offset + 33, $sno1_flg);
	}

	/**
	 * SEIBAN No. 1 copy flg. 手配ＮＯ１引継ＦＬＧ.<p>
	 *
	 */
	public void sno1_flg(boolean value) {
		setConstBoolean(offset + 33, $sno1_flg, value);
	}


	/**
	 * Allocation destination SEIBAN No. 1 配賦先手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 34, $sno1);
	}

	/**
	 * Allocation destination SEIBAN No. 1 配賦先手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 34, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 copy flg. 手配ＮＯ２引継ＦＬＧ.<p>
	 *
	 */
	public boolean sno2_flg() {
		return getConstBoolean(offset + 35, $sno2_flg);
	}

	/**
	 * SEIBAN No. 2 copy flg. 手配ＮＯ２引継ＦＬＧ.<p>
	 *
	 */
	public void sno2_flg(boolean value) {
		setConstBoolean(offset + 35, $sno2_flg, value);
	}


	/**
	 * Allocation destination SEIBAN No. 2 配賦先手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 36, $sno2);
	}

	/**
	 * Allocation destination SEIBAN No. 2 配賦先手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 36, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 copy flg. 手配ＮＯ３引継ＦＬＧ.<p>
	 *
	 */
	public boolean sno3_flg() {
		return getConstBoolean(offset + 37, $sno3_flg);
	}

	/**
	 * SEIBAN No. 3 copy flg. 手配ＮＯ３引継ＦＬＧ.<p>
	 *
	 */
	public void sno3_flg(boolean value) {
		setConstBoolean(offset + 37, $sno3_flg, value);
	}


	/**
	 * Allocation destination SEIBAN No. 3 配賦先手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 38, $sno3);
	}

	/**
	 * Allocation destination SEIBAN No. 3 配賦先手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 38, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 copy flg. 手配ＮＯ４引継ＦＬＧ.<p>
	 *
	 */
	public boolean sno4_flg() {
		return getConstBoolean(offset + 39, $sno4_flg);
	}

	/**
	 * SEIBAN No. 4 copy flg. 手配ＮＯ４引継ＦＬＧ.<p>
	 *
	 */
	public void sno4_flg(boolean value) {
		setConstBoolean(offset + 39, $sno4_flg, value);
	}


	/**
	 * Allocation destination SEIBAN No. 4 配賦先手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 40, $sno4);
	}

	/**
	 * Allocation destination SEIBAN No. 4 配賦先手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 40, $sno4, value);
	}


	/**
	 * Allocation destination item category cd. 配賦先品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 41, $ctg_cd);
	}

	/**
	 * Allocation destination item category cd. 配賦先品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 41, $ctg_cd, value);
	}


	/**
	 * Allocation destination item category name 配賦先品群名.<p>
	 *
	 */
	public String ctg_nm() {
		return getConstString(offset + 42, $ctg_nm);
	}

	/**
	 * Allocation destination item category name 配賦先品群名.<p>
	 *
	 */
	public void ctg_nm(String value) {
		setConstString(offset + 42, $ctg_nm, value);
	}


	/**
	 * Allocation destination item cd. 配賦先品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 43, $itm_cd);
	}

	/**
	 * Allocation destination item cd. 配賦先品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 43, $itm_cd, value);
	}


	/**
	 * Allocation destination branch No. 1 配賦先枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 44, $itm_sub1);
	}

	/**
	 * Allocation destination branch No. 1 配賦先枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 44, $itm_sub1, value);
	}


	/**
	 * Allocation destination branch No. 2 配賦先枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 45, $itm_sub2);
	}

	/**
	 * Allocation destination branch No. 2 配賦先枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 45, $itm_sub2, value);
	}


	/**
	 * Allocation destination branch No. 3 配賦先枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 46, $itm_sub3);
	}

	/**
	 * Allocation destination branch No. 3 配賦先枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 46, $itm_sub3, value);
	}


	/**
	 * Allocation destination item name 配賦先品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 47, $itm_nm);
	}

	/**
	 * Allocation destination item name 配賦先品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 47, $itm_nm, value);
	}


	/**
	 * Allocation destination location cd. 配賦先場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 48, $loc_cd);
	}

	/**
	 * Allocation destination location cd. 配賦先場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 48, $loc_cd, value);
	}


	/**
	 * Allocation destination location name 配賦先場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 49, $loc_nm);
	}

	/**
	 * Allocation destination location name 配賦先場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 49, $loc_nm, value);
	}


	/**
	 * Allocation destination operation cd. 配賦先工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 50, $oper_cd);
	}

	/**
	 * Allocation destination operation cd. 配賦先工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 50, $oper_cd, value);
	}


	/**
	 * Allocation destination operation name 配賦先工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 51, $oper_nm);
	}

	/**
	 * Allocation destination operation name 配賦先工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 51, $oper_nm, value);
	}


	/**
	 * PO No. copy flg. 発注ＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public boolean po_no_flg() {
		return getConstBoolean(offset + 52, $po_no_flg);
	}

	/**
	 * PO No. copy flg. 発注ＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public void po_no_flg(boolean value) {
		setConstBoolean(offset + 52, $po_no_flg, value);
	}


	/**
	 * Sales order No. copy flg. 受注ＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public boolean slo_no_flg() {
		return getConstBoolean(offset + 53, $slo_no_flg);
	}

	/**
	 * Sales order No. copy flg. 受注ＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public void slo_no_flg(boolean value) {
		setConstBoolean(offset + 53, $slo_no_flg, value);
	}


	/**
	 * Invoice No. copy flg. インボイスＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public boolean iv_no_flg() {
		return getConstBoolean(offset + 54, $iv_no_flg);
	}

	/**
	 * Invoice No. copy flg. インボイスＮＯ引継ＦＬＧ.<p>
	 *
	 */
	public void iv_no_flg(boolean value) {
		setConstBoolean(offset + 54, $iv_no_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 55, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 55, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 56, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 56, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 57, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 57, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 58, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 58, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 59, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 59, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 60, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 60, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 61, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 61, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 62, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 62, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 63, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 64, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 64, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 65, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 65, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 66, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 66, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 67, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 67, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 68, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 68, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 69, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 69, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 70, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 70, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 71, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 71, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 72, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 72, $del_ts, value);
	}


	public String getString(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($xpns_itm_cd.equalsIgnoreCase(name)) {
			return xpns_itm_cd();
		}
		if ($xpns_itm_sub1.equalsIgnoreCase(name)) {
			return xpns_itm_sub1();
		}
		if ($xpns_itm_sub2.equalsIgnoreCase(name)) {
			return xpns_itm_sub2();
		}
		if ($xpns_itm_sub3.equalsIgnoreCase(name)) {
			return xpns_itm_sub3();
		}
		if ($xpns_itm_nm.equalsIgnoreCase(name)) {
			return xpns_itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			return alc_wg_cd();
		}
		if ($alc_wg_nm.equalsIgnoreCase(name)) {
			return alc_wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
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
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			return dpt_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			return lot_no_flg();
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			return sublot_no_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			return po_no_flg();
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			return slo_no_flg();
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			return iv_no_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($xpns_itm_cd.equalsIgnoreCase(name)) {
			return xpns_itm_cd();
		}
		if ($xpns_itm_sub1.equalsIgnoreCase(name)) {
			return xpns_itm_sub1();
		}
		if ($xpns_itm_sub2.equalsIgnoreCase(name)) {
			return xpns_itm_sub2();
		}
		if ($xpns_itm_sub3.equalsIgnoreCase(name)) {
			return xpns_itm_sub3();
		}
		if ($xpns_itm_nm.equalsIgnoreCase(name)) {
			return xpns_itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			return alc_wg_cd();
		}
		if ($alc_wg_nm.equalsIgnoreCase(name)) {
			return alc_wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
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
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			return dpt_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			return lot_no_flg();
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			return sublot_no_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			return po_no_flg();
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			return slo_no_flg();
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			return iv_no_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
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
		if ($xpns_itm_cd.equalsIgnoreCase(name)) {
			xpns_itm_cd(value);
			return;
		}
		if ($xpns_itm_sub1.equalsIgnoreCase(name)) {
			xpns_itm_sub1(value);
			return;
		}
		if ($xpns_itm_sub2.equalsIgnoreCase(name)) {
			xpns_itm_sub2(value);
			return;
		}
		if ($xpns_itm_sub3.equalsIgnoreCase(name)) {
			xpns_itm_sub3(value);
			return;
		}
		if ($xpns_itm_nm.equalsIgnoreCase(name)) {
			xpns_itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			alc_wg_cd(value);
			return;
		}
		if ($alc_wg_nm.equalsIgnoreCase(name)) {
			alc_wg_nm(value);
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
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
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
		if ($dpt_flg.equalsIgnoreCase(name)) {
			dpt_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			lot_no_flg(value);
			return;
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			sublot_no_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			po_no_flg(value);
			return;
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			slo_no_flg(value);
			return;
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			iv_no_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
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
		if ($xpns_itm_cd.equalsIgnoreCase(name)) {
			xpns_itm_cd(value);
			return;
		}
		if ($xpns_itm_sub1.equalsIgnoreCase(name)) {
			xpns_itm_sub1(value);
			return;
		}
		if ($xpns_itm_sub2.equalsIgnoreCase(name)) {
			xpns_itm_sub2(value);
			return;
		}
		if ($xpns_itm_sub3.equalsIgnoreCase(name)) {
			xpns_itm_sub3(value);
			return;
		}
		if ($xpns_itm_nm.equalsIgnoreCase(name)) {
			xpns_itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($alc_wg_cd.equalsIgnoreCase(name)) {
			alc_wg_cd(value);
			return;
		}
		if ($alc_wg_nm.equalsIgnoreCase(name)) {
			alc_wg_nm(value);
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
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
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
		if ($dpt_flg.equalsIgnoreCase(name)) {
			dpt_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			lot_no_flg(value);
			return;
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			sublot_no_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($po_no_flg.equalsIgnoreCase(name)) {
			po_no_flg(value);
			return;
		}
		if ($slo_no_flg.equalsIgnoreCase(name)) {
			slo_no_flg(value);
			return;
		}
		if ($iv_no_flg.equalsIgnoreCase(name)) {
			iv_no_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

