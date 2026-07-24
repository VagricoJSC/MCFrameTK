package mcframe.clientMABC.MABCP0940;

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
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public static final String $biz_rsn_cd = "biz_rsn_cd";
	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public static final String $biz_rsn_nm_lcl = "biz_rsn_nm_lcl";
	/**
	 * Standard business reason name 標準業務理由名.<p>
	 *
	 */
	public static final String $biz_rsn_nm = "biz_rsn_nm";
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
	 * Purchase 仕入.<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	/**
	 * Purchase sort order 仕入ソート順.<p>
	 *
	 */
	public static final String $purc_sort_seq = "purc_sort_seq";
	/**
	 * Purchase return 仕入返品.<p>
	 *
	 */
	public static final String $purc_rtn_flg = "purc_rtn_flg";
	/**
	 * Purchase return sort order 仕入返品ソート順.<p>
	 *
	 */
	public static final String $purc_rtn_sort_seq = "purc_rtn_sort_seq";
	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
	/**
	 * Expense purchase (pegged to sales order) 受注紐付経費購買.<p>
	 *
	 */
	public static final String $slo_xpns_purc_flg = "slo_xpns_purc_flg";
	/**
	 * Purchase adjustment 仕入調整.<p>
	 *
	 */
	public static final String $purc_dscnt_flg = "purc_dscnt_flg";
	/**
	 * Purchase adjustment controlling site type 仕入調整管轄区分.<p>
	 *
	 */
	public static final String $purc_dscnt_loc_mng_typ = "purc_dscnt_loc_mng_typ";
	/**
	 * Purchase adjustment controlling site type name 仕入調整管轄区分名.<p>
	 *
	 */
	public static final String $purc_dscnt_loc_mng_typ_nm = "purc_dscnt_loc_mng_typ_nm";
	/**
	 * Purchase adjustment sort order 仕入調整ソート順.<p>
	 *
	 */
	public static final String $purc_dscnt_sort_seq = "purc_dscnt_sort_seq";
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	/**
	 * Sales sort order 売上ソート順.<p>
	 *
	 */
	public static final String $sls_sort_seq = "sls_sort_seq";
	/**
	 * Sales return 売上返品.<p>
	 *
	 */
	public static final String $sls_rtn_flg = "sls_rtn_flg";
	/**
	 * Sales return sort order 売上返品ソート順.<p>
	 *
	 */
	public static final String $sls_rtn_sort_seq = "sls_rtn_sort_seq";
	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public static final String $sls_acxfr_flg = "sls_acxfr_flg";
	/**
	 * Sales adjustment 売上調整.<p>
	 *
	 */
	public static final String $sls_dscnt_flg = "sls_dscnt_flg";
	/**
	 * Sales adjustment sort order 売上調整ソート順.<p>
	 *
	 */
	public static final String $sls_dscnt_sort_seq = "sls_dscnt_sort_seq";
	/**
	 * Other accounting GR 他勘定入庫.<p>
	 *
	 */
	public static final String $acxfr_gr_flg = "acxfr_gr_flg";
	/**
	 * Other accounting GR sort order 他勘定入庫ソート順.<p>
	 *
	 */
	public static final String $acxfr_gr_sort_seq = "acxfr_gr_sort_seq";
	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public static final String $acxfr_gi_flg = "acxfr_gi_flg";
	/**
	 * Other accounting GI sort order 他勘定出庫ソート順.<p>
	 *
	 */
	public static final String $acxfr_gi_sort_seq = "acxfr_gi_sort_seq";
	/**
	 * Input other accounting sort order 投入他勘定ソート順.<p>
	 *
	 */
	public static final String $inpt_acxfr_sort_seq = "inpt_acxfr_sort_seq";
	/**
	 * Disposal 廃棄.<p>
	 *
	 */
	public static final String $disp_flg = "disp_flg";
	/**
	 * Disposal sort order 廃棄ソート順.<p>
	 *
	 */
	public static final String $disp_sort_seq = "disp_sort_seq";
	/**
	 * Inventory transfer 在庫振替.<p>
	 *
	 */
	public static final String $stk_xfr_flg = "stk_xfr_flg";
	/**
	 * Inventory transfer sort order 在庫振替ソート順.<p>
	 *
	 */
	public static final String $stk_xfr_sort_seq = "stk_xfr_sort_seq";
	/**
	 * Transport 移送.<p>
	 *
	 */
	public static final String $xfr_flg = "xfr_flg";
	/**
	 * Transport sort order 移送ソート順.<p>
	 *
	 */
	public static final String $xfr_sort_seq = "xfr_sort_seq";
	/**
	 * Output 出来高.<p>
	 *
	 */
	public static final String $yield_flg = "yield_flg";
	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public static final String $yield_typ = "yield_typ";
	/**
	 * Output type name 出来高区分名.<p>
	 *
	 */
	public static final String $yield_typ_nm = "yield_typ_nm";
	/**
	 * Output sort order 出来高ソート順.<p>
	 *
	 */
	public static final String $yield_sort_seq = "yield_sort_seq";
	/**
	 * MRO supply 非在庫.<p>
	 *
	 */
	public static final String $not_stk_flg = "not_stk_flg";
	/**
	 * Loss ロス.<p>
	 *
	 */
	public static final String $loss_flg = "loss_flg";
	/**
	 * Constant loss 固定ロス.<p>
	 *
	 */
	public static final String $fxd_loss_flg = "fxd_loss_flg";
	/**
	 * Not for lot trace ロットトレース対象外.<p>
	 *
	 */
	public static final String $not_lot_trace_flg = "not_lot_trace_flg";
	/**
	 * Input 投入.<p>
	 *
	 */
	public static final String $inpt_flg = "inpt_flg";
	/**
	 * Input sort order 投入ソート順.<p>
	 *
	 */
	public static final String $inpt_sort_seq = "inpt_sort_seq";
	/**
	 * Inspection defective 検査不良.<p>
	 *
	 */
	public static final String $dfct_flg = "dfct_flg";
	/**
	 * Inspection defective sort order 検査不良ソート順.<p>
	 *
	 */
	public static final String $dfct_sort_seq = "dfct_sort_seq";
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
	/**
	 * Before change_Purchase 変更前_仕入.<p>
	 *
	 */
	public static final String $old_purc_flg = "old_purc_flg";
	/**
	 * Before change_Purchase return 変更前_仕入返品.<p>
	 *
	 */
	public static final String $old_purc_rtn_flg = "old_purc_rtn_flg";
	/**
	 * Before change_Expense purchase 変更前_経費購買.<p>
	 *
	 */
	public static final String $old_xpns_purc_flg = "old_xpns_purc_flg";
	/**
	 * Before change_Purchase adjustment 変更前_仕入調整.<p>
	 *
	 */
	public static final String $old_purc_dscnt_flg = "old_purc_dscnt_flg";
	/**
	 * Before change_Sales 変更前_売上.<p>
	 *
	 */
	public static final String $old_sls_flg = "old_sls_flg";
	/**
	 * Before change_Sales return 変更前_売上返品.<p>
	 *
	 */
	public static final String $old_sls_rtn_flg = "old_sls_rtn_flg";
	/**
	 * Before change _ Sales and other accounting 変更前_販売他勘定.<p>
	 *
	 */
	public static final String $old_sls_acxfr_flg = "old_sls_acxfr_flg";
	/**
	 * Before change_Sales adjustment 変更前_売上調整.<p>
	 *
	 */
	public static final String $old_sls_dscnt_flg = "old_sls_dscnt_flg";
	/**
	 * Before change_Other accounting GR 変更前_他勘定入庫.<p>
	 *
	 */
	public static final String $old_acxfr_gr_flg = "old_acxfr_gr_flg";
	/**
	 * Before change_Other accounting GI 変更前_他勘定出庫.<p>
	 *
	 */
	public static final String $old_acxfr_gi_flg = "old_acxfr_gi_flg";
	/**
	 * Before change_Disposal 変更前_廃棄.<p>
	 *
	 */
	public static final String $old_disp_flg = "old_disp_flg";
	/**
	 * Before change_Inventory transfer 変更前_在庫振替.<p>
	 *
	 */
	public static final String $old_stk_xfr_flg = "old_stk_xfr_flg";
	/**
	 * Before change_Transfer 変更前_移送.<p>
	 *
	 */
	public static final String $old_xfr_flg = "old_xfr_flg";
	/**
	 * Before change_Output 変更前_出来高.<p>
	 *
	 */
	public static final String $old_yield_flg = "old_yield_flg";
	/**
	 * Before change_Loss 変更前_ロス.<p>
	 *
	 */
	public static final String $old_loss_flg = "old_loss_flg";
	/**
	 * Before change_Fixed loss 変更前_固定ロス.<p>
	 *
	 */
	public static final String $old_fxd_loss_flg = "old_fxd_loss_flg";
	/**
	 * Before change_Input 変更前_投入.<p>
	 *
	 */
	public static final String $old_inpt_flg = "old_inpt_flg";
	/**
	 * Before change_Inspection defective 変更前_検査不良.<p>
	 *
	 */
	public static final String $old_dfct_flg = "old_dfct_flg";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta biz_rsn_cd_META = createCommonMeta($biz_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta biz_rsn_nm_lcl_META = createCommonMeta($biz_rsn_nm_lcl, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta biz_rsn_nm_META = createCommonMeta($biz_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_sort_seq_META = createCommonMeta($purc_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta purc_rtn_flg_META = createCommonMeta($purc_rtn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_rtn_sort_seq_META = createCommonMeta($purc_rtn_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_xpns_purc_flg_META = createCommonMeta($slo_xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dscnt_flg_META = createCommonMeta($purc_dscnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dscnt_loc_mng_typ_META = createCommonMeta($purc_dscnt_loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta purc_dscnt_loc_mng_typ_nm_META = createCommonMeta($purc_dscnt_loc_mng_typ_nm, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP_NM);
	public static final MCMeta purc_dscnt_sort_seq_META = createCommonMeta($purc_dscnt_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_sort_seq_META = createCommonMeta($sls_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sls_rtn_flg_META = createCommonMeta($sls_rtn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_rtn_sort_seq_META = createCommonMeta($sls_rtn_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sls_acxfr_flg_META = createCommonMeta($sls_acxfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dscnt_flg_META = createCommonMeta($sls_dscnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dscnt_sort_seq_META = createCommonMeta($sls_dscnt_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta acxfr_gr_flg_META = createCommonMeta($acxfr_gr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acxfr_gr_sort_seq_META = createCommonMeta($acxfr_gr_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta acxfr_gi_flg_META = createCommonMeta($acxfr_gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acxfr_gi_sort_seq_META = createCommonMeta($acxfr_gi_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inpt_acxfr_sort_seq_META = createCommonMeta($inpt_acxfr_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta disp_flg_META = createCommonMeta($disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_sort_seq_META = createCommonMeta($disp_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta stk_xfr_flg_META = createCommonMeta($stk_xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_xfr_sort_seq_META = createCommonMeta($stk_xfr_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta xfr_flg_META = createCommonMeta($xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_sort_seq_META = createCommonMeta($xfr_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta yield_flg_META = createCommonMeta($yield_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_typ_META = createCommonMeta($yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta yield_typ_nm_META = createCommonMeta($yield_typ_nm, mcframe.commonMA.meta.MA_META.YIELD_TYP_NM);
	public static final MCMeta yield_sort_seq_META = createCommonMeta($yield_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta not_stk_flg_META = createCommonMeta($not_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loss_flg_META = createCommonMeta($loss_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fxd_loss_flg_META = createCommonMeta($fxd_loss_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lot_trace_flg_META = createCommonMeta($not_lot_trace_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_flg_META = createCommonMeta($inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_sort_seq_META = createCommonMeta($inpt_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dfct_flg_META = createCommonMeta($dfct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dfct_sort_seq_META = createCommonMeta($dfct_sort_seq, mcframe.commonMA.meta.MA_META.INT);
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
	public static final MCMeta old_purc_flg_META = createCommonMeta($old_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_purc_rtn_flg_META = createCommonMeta($old_purc_rtn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_xpns_purc_flg_META = createCommonMeta($old_xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_purc_dscnt_flg_META = createCommonMeta($old_purc_dscnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_sls_flg_META = createCommonMeta($old_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_sls_rtn_flg_META = createCommonMeta($old_sls_rtn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_sls_acxfr_flg_META = createCommonMeta($old_sls_acxfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_sls_dscnt_flg_META = createCommonMeta($old_sls_dscnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_acxfr_gr_flg_META = createCommonMeta($old_acxfr_gr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_acxfr_gi_flg_META = createCommonMeta($old_acxfr_gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_disp_flg_META = createCommonMeta($old_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_stk_xfr_flg_META = createCommonMeta($old_stk_xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_xfr_flg_META = createCommonMeta($old_xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_yield_flg_META = createCommonMeta($old_yield_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_loss_flg_META = createCommonMeta($old_loss_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_fxd_loss_flg_META = createCommonMeta($old_fxd_loss_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_inpt_flg_META = createCommonMeta($old_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_dfct_flg_META = createCommonMeta($old_dfct_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			del_flg_META,
			biz_rsn_cd_META,
			biz_rsn_nm_lcl_META,
			biz_rsn_nm_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			purc_flg_META,
			purc_sort_seq_META,
			purc_rtn_flg_META,
			purc_rtn_sort_seq_META,
			xpns_purc_flg_META,
			slo_xpns_purc_flg_META,
			purc_dscnt_flg_META,
			purc_dscnt_loc_mng_typ_META,
			purc_dscnt_loc_mng_typ_nm_META,
			purc_dscnt_sort_seq_META,
			sls_flg_META,
			sls_sort_seq_META,
			sls_rtn_flg_META,
			sls_rtn_sort_seq_META,
			sls_acxfr_flg_META,
			sls_dscnt_flg_META,
			sls_dscnt_sort_seq_META,
			acxfr_gr_flg_META,
			acxfr_gr_sort_seq_META,
			acxfr_gi_flg_META,
			acxfr_gi_sort_seq_META,
			inpt_acxfr_sort_seq_META,
			disp_flg_META,
			disp_sort_seq_META,
			stk_xfr_flg_META,
			stk_xfr_sort_seq_META,
			xfr_flg_META,
			xfr_sort_seq_META,
			yield_flg_META,
			yield_typ_META,
			yield_typ_nm_META,
			yield_sort_seq_META,
			not_stk_flg_META,
			loss_flg_META,
			fxd_loss_flg_META,
			not_lot_trace_flg_META,
			inpt_flg_META,
			inpt_sort_seq_META,
			dfct_flg_META,
			dfct_sort_seq_META,
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
			del_ts_META,
			old_purc_flg_META,
			old_purc_rtn_flg_META,
			old_xpns_purc_flg_META,
			old_purc_dscnt_flg_META,
			old_sls_flg_META,
			old_sls_rtn_flg_META,
			old_sls_acxfr_flg_META,
			old_sls_dscnt_flg_META,
			old_acxfr_gr_flg_META,
			old_acxfr_gi_flg_META,
			old_disp_flg_META,
			old_stk_xfr_flg_META,
			old_xfr_flg_META,
			old_yield_flg_META,
			old_loss_flg_META,
			old_fxd_loss_flg_META,
			old_inpt_flg_META,
			old_dfct_flg_META
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
			$biz_rsn_cd	// biz_rsn_cd
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$purc_dscnt_loc_mng_typ, "loc_mng_typ_nm"}	// purc_dscnt_loc_mng_typ
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
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public String biz_rsn_cd() {
		return getConstString(offset + 2, $biz_rsn_cd);
	}

	/**
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public void biz_rsn_cd(String value) {
		setConstString(offset + 2, $biz_rsn_cd, value);
	}


	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public String biz_rsn_nm_lcl() {
		return getConstString(offset + 3, $biz_rsn_nm_lcl);
	}

	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public void biz_rsn_nm_lcl(String value) {
		setConstString(offset + 3, $biz_rsn_nm_lcl, value);
	}


	/**
	 * Standard business reason name 標準業務理由名.<p>
	 *
	 */
	public String biz_rsn_nm() {
		return getConstString(offset + 4, $biz_rsn_nm);
	}

	/**
	 * Standard business reason name 標準業務理由名.<p>
	 *
	 */
	public void biz_rsn_nm(String value) {
		setConstString(offset + 4, $biz_rsn_nm, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 5, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 5, $ac_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 6, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 6, $ac_rsn_nm, value);
	}


	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 7, $purc_flg);
	}

	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 7, $purc_flg, value);
	}


	/**
	 * Purchase sort order 仕入ソート順.<p>
	 *
	 */
	public MCNumber purc_sort_seq() {
		return getConstNumber(offset + 8, $purc_sort_seq);
	}

	/**
	 * Purchase sort order 仕入ソート順.<p>
	 *
	 */
	public void purc_sort_seq(MCNumber value) {
		setConstNumber(offset + 8, $purc_sort_seq, value);
	}

	/**
	 * Purchase sort order 仕入ソート順.<p>
	 *
	 */
	public void purc_sort_seq(int value) {
		setConstNumber(offset + 8, $purc_sort_seq, value);
	}

	/**
	 * Purchase sort order 仕入ソート順.<p>
	 *
	 */
	public void purc_sort_seq(long value) {
		setConstNumber(offset + 8, $purc_sort_seq, value);
	}

	/**
	 * Purchase sort order 仕入ソート順.<p>
	 *
	 */
	public void purc_sort_seq(float value) {
		setConstNumber(offset + 8, $purc_sort_seq, value);
	}

	/**
	 * Purchase sort order 仕入ソート順.<p>
	 *
	 */
	public void purc_sort_seq(double value) {
		setConstNumber(offset + 8, $purc_sort_seq, value);
	}


	/**
	 * Purchase return 仕入返品.<p>
	 *
	 */
	public boolean purc_rtn_flg() {
		return getConstBoolean(offset + 9, $purc_rtn_flg);
	}

	/**
	 * Purchase return 仕入返品.<p>
	 *
	 */
	public void purc_rtn_flg(boolean value) {
		setConstBoolean(offset + 9, $purc_rtn_flg, value);
	}


	/**
	 * Purchase return sort order 仕入返品ソート順.<p>
	 *
	 */
	public MCNumber purc_rtn_sort_seq() {
		return getConstNumber(offset + 10, $purc_rtn_sort_seq);
	}

	/**
	 * Purchase return sort order 仕入返品ソート順.<p>
	 *
	 */
	public void purc_rtn_sort_seq(MCNumber value) {
		setConstNumber(offset + 10, $purc_rtn_sort_seq, value);
	}

	/**
	 * Purchase return sort order 仕入返品ソート順.<p>
	 *
	 */
	public void purc_rtn_sort_seq(int value) {
		setConstNumber(offset + 10, $purc_rtn_sort_seq, value);
	}

	/**
	 * Purchase return sort order 仕入返品ソート順.<p>
	 *
	 */
	public void purc_rtn_sort_seq(long value) {
		setConstNumber(offset + 10, $purc_rtn_sort_seq, value);
	}

	/**
	 * Purchase return sort order 仕入返品ソート順.<p>
	 *
	 */
	public void purc_rtn_sort_seq(float value) {
		setConstNumber(offset + 10, $purc_rtn_sort_seq, value);
	}

	/**
	 * Purchase return sort order 仕入返品ソート順.<p>
	 *
	 */
	public void purc_rtn_sort_seq(double value) {
		setConstNumber(offset + 10, $purc_rtn_sort_seq, value);
	}


	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 11, $xpns_purc_flg);
	}

	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 11, $xpns_purc_flg, value);
	}


	/**
	 * Expense purchase (pegged to sales order) 受注紐付経費購買.<p>
	 *
	 */
	public boolean slo_xpns_purc_flg() {
		return getConstBoolean(offset + 12, $slo_xpns_purc_flg);
	}

	/**
	 * Expense purchase (pegged to sales order) 受注紐付経費購買.<p>
	 *
	 */
	public void slo_xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 12, $slo_xpns_purc_flg, value);
	}


	/**
	 * Purchase adjustment 仕入調整.<p>
	 *
	 */
	public boolean purc_dscnt_flg() {
		return getConstBoolean(offset + 13, $purc_dscnt_flg);
	}

	/**
	 * Purchase adjustment 仕入調整.<p>
	 *
	 */
	public void purc_dscnt_flg(boolean value) {
		setConstBoolean(offset + 13, $purc_dscnt_flg, value);
	}


	/**
	 * Purchase adjustment controlling site type 仕入調整管轄区分.<p>
	 *
	 */
	public String purc_dscnt_loc_mng_typ() {
		return getConstString(offset + 14, $purc_dscnt_loc_mng_typ);
	}

	/**
	 * Purchase adjustment controlling site type 仕入調整管轄区分.<p>
	 *
	 */
	public void purc_dscnt_loc_mng_typ(String value) {
		setConstString(offset + 14, $purc_dscnt_loc_mng_typ, value);
	}


	/**
	 * Purchase adjustment controlling site type name 仕入調整管轄区分名.<p>
	 *
	 */
	public String purc_dscnt_loc_mng_typ_nm() {
		return getConstString(offset + 15, $purc_dscnt_loc_mng_typ_nm);
	}

	/**
	 * Purchase adjustment controlling site type name 仕入調整管轄区分名.<p>
	 *
	 */
	public void purc_dscnt_loc_mng_typ_nm(String value) {
		setConstString(offset + 15, $purc_dscnt_loc_mng_typ_nm, value);
	}


	/**
	 * Purchase adjustment sort order 仕入調整ソート順.<p>
	 *
	 */
	public MCNumber purc_dscnt_sort_seq() {
		return getConstNumber(offset + 16, $purc_dscnt_sort_seq);
	}

	/**
	 * Purchase adjustment sort order 仕入調整ソート順.<p>
	 *
	 */
	public void purc_dscnt_sort_seq(MCNumber value) {
		setConstNumber(offset + 16, $purc_dscnt_sort_seq, value);
	}

	/**
	 * Purchase adjustment sort order 仕入調整ソート順.<p>
	 *
	 */
	public void purc_dscnt_sort_seq(int value) {
		setConstNumber(offset + 16, $purc_dscnt_sort_seq, value);
	}

	/**
	 * Purchase adjustment sort order 仕入調整ソート順.<p>
	 *
	 */
	public void purc_dscnt_sort_seq(long value) {
		setConstNumber(offset + 16, $purc_dscnt_sort_seq, value);
	}

	/**
	 * Purchase adjustment sort order 仕入調整ソート順.<p>
	 *
	 */
	public void purc_dscnt_sort_seq(float value) {
		setConstNumber(offset + 16, $purc_dscnt_sort_seq, value);
	}

	/**
	 * Purchase adjustment sort order 仕入調整ソート順.<p>
	 *
	 */
	public void purc_dscnt_sort_seq(double value) {
		setConstNumber(offset + 16, $purc_dscnt_sort_seq, value);
	}


	/**
	 * Sales result 売上.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 17, $sls_flg);
	}

	/**
	 * Sales result 売上.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 17, $sls_flg, value);
	}


	/**
	 * Sales sort order 売上ソート順.<p>
	 *
	 */
	public MCNumber sls_sort_seq() {
		return getConstNumber(offset + 18, $sls_sort_seq);
	}

	/**
	 * Sales sort order 売上ソート順.<p>
	 *
	 */
	public void sls_sort_seq(MCNumber value) {
		setConstNumber(offset + 18, $sls_sort_seq, value);
	}

	/**
	 * Sales sort order 売上ソート順.<p>
	 *
	 */
	public void sls_sort_seq(int value) {
		setConstNumber(offset + 18, $sls_sort_seq, value);
	}

	/**
	 * Sales sort order 売上ソート順.<p>
	 *
	 */
	public void sls_sort_seq(long value) {
		setConstNumber(offset + 18, $sls_sort_seq, value);
	}

	/**
	 * Sales sort order 売上ソート順.<p>
	 *
	 */
	public void sls_sort_seq(float value) {
		setConstNumber(offset + 18, $sls_sort_seq, value);
	}

	/**
	 * Sales sort order 売上ソート順.<p>
	 *
	 */
	public void sls_sort_seq(double value) {
		setConstNumber(offset + 18, $sls_sort_seq, value);
	}


	/**
	 * Sales return 売上返品.<p>
	 *
	 */
	public boolean sls_rtn_flg() {
		return getConstBoolean(offset + 19, $sls_rtn_flg);
	}

	/**
	 * Sales return 売上返品.<p>
	 *
	 */
	public void sls_rtn_flg(boolean value) {
		setConstBoolean(offset + 19, $sls_rtn_flg, value);
	}


	/**
	 * Sales return sort order 売上返品ソート順.<p>
	 *
	 */
	public MCNumber sls_rtn_sort_seq() {
		return getConstNumber(offset + 20, $sls_rtn_sort_seq);
	}

	/**
	 * Sales return sort order 売上返品ソート順.<p>
	 *
	 */
	public void sls_rtn_sort_seq(MCNumber value) {
		setConstNumber(offset + 20, $sls_rtn_sort_seq, value);
	}

	/**
	 * Sales return sort order 売上返品ソート順.<p>
	 *
	 */
	public void sls_rtn_sort_seq(int value) {
		setConstNumber(offset + 20, $sls_rtn_sort_seq, value);
	}

	/**
	 * Sales return sort order 売上返品ソート順.<p>
	 *
	 */
	public void sls_rtn_sort_seq(long value) {
		setConstNumber(offset + 20, $sls_rtn_sort_seq, value);
	}

	/**
	 * Sales return sort order 売上返品ソート順.<p>
	 *
	 */
	public void sls_rtn_sort_seq(float value) {
		setConstNumber(offset + 20, $sls_rtn_sort_seq, value);
	}

	/**
	 * Sales return sort order 売上返品ソート順.<p>
	 *
	 */
	public void sls_rtn_sort_seq(double value) {
		setConstNumber(offset + 20, $sls_rtn_sort_seq, value);
	}


	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public boolean sls_acxfr_flg() {
		return getConstBoolean(offset + 21, $sls_acxfr_flg);
	}

	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public void sls_acxfr_flg(boolean value) {
		setConstBoolean(offset + 21, $sls_acxfr_flg, value);
	}


	/**
	 * Sales adjustment 売上調整.<p>
	 *
	 */
	public boolean sls_dscnt_flg() {
		return getConstBoolean(offset + 22, $sls_dscnt_flg);
	}

	/**
	 * Sales adjustment 売上調整.<p>
	 *
	 */
	public void sls_dscnt_flg(boolean value) {
		setConstBoolean(offset + 22, $sls_dscnt_flg, value);
	}


	/**
	 * Sales adjustment sort order 売上調整ソート順.<p>
	 *
	 */
	public MCNumber sls_dscnt_sort_seq() {
		return getConstNumber(offset + 23, $sls_dscnt_sort_seq);
	}

	/**
	 * Sales adjustment sort order 売上調整ソート順.<p>
	 *
	 */
	public void sls_dscnt_sort_seq(MCNumber value) {
		setConstNumber(offset + 23, $sls_dscnt_sort_seq, value);
	}

	/**
	 * Sales adjustment sort order 売上調整ソート順.<p>
	 *
	 */
	public void sls_dscnt_sort_seq(int value) {
		setConstNumber(offset + 23, $sls_dscnt_sort_seq, value);
	}

	/**
	 * Sales adjustment sort order 売上調整ソート順.<p>
	 *
	 */
	public void sls_dscnt_sort_seq(long value) {
		setConstNumber(offset + 23, $sls_dscnt_sort_seq, value);
	}

	/**
	 * Sales adjustment sort order 売上調整ソート順.<p>
	 *
	 */
	public void sls_dscnt_sort_seq(float value) {
		setConstNumber(offset + 23, $sls_dscnt_sort_seq, value);
	}

	/**
	 * Sales adjustment sort order 売上調整ソート順.<p>
	 *
	 */
	public void sls_dscnt_sort_seq(double value) {
		setConstNumber(offset + 23, $sls_dscnt_sort_seq, value);
	}


	/**
	 * Other accounting GR 他勘定入庫.<p>
	 *
	 */
	public boolean acxfr_gr_flg() {
		return getConstBoolean(offset + 24, $acxfr_gr_flg);
	}

	/**
	 * Other accounting GR 他勘定入庫.<p>
	 *
	 */
	public void acxfr_gr_flg(boolean value) {
		setConstBoolean(offset + 24, $acxfr_gr_flg, value);
	}


	/**
	 * Other accounting GR sort order 他勘定入庫ソート順.<p>
	 *
	 */
	public MCNumber acxfr_gr_sort_seq() {
		return getConstNumber(offset + 25, $acxfr_gr_sort_seq);
	}

	/**
	 * Other accounting GR sort order 他勘定入庫ソート順.<p>
	 *
	 */
	public void acxfr_gr_sort_seq(MCNumber value) {
		setConstNumber(offset + 25, $acxfr_gr_sort_seq, value);
	}

	/**
	 * Other accounting GR sort order 他勘定入庫ソート順.<p>
	 *
	 */
	public void acxfr_gr_sort_seq(int value) {
		setConstNumber(offset + 25, $acxfr_gr_sort_seq, value);
	}

	/**
	 * Other accounting GR sort order 他勘定入庫ソート順.<p>
	 *
	 */
	public void acxfr_gr_sort_seq(long value) {
		setConstNumber(offset + 25, $acxfr_gr_sort_seq, value);
	}

	/**
	 * Other accounting GR sort order 他勘定入庫ソート順.<p>
	 *
	 */
	public void acxfr_gr_sort_seq(float value) {
		setConstNumber(offset + 25, $acxfr_gr_sort_seq, value);
	}

	/**
	 * Other accounting GR sort order 他勘定入庫ソート順.<p>
	 *
	 */
	public void acxfr_gr_sort_seq(double value) {
		setConstNumber(offset + 25, $acxfr_gr_sort_seq, value);
	}


	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public boolean acxfr_gi_flg() {
		return getConstBoolean(offset + 26, $acxfr_gi_flg);
	}

	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public void acxfr_gi_flg(boolean value) {
		setConstBoolean(offset + 26, $acxfr_gi_flg, value);
	}


	/**
	 * Other accounting GI sort order 他勘定出庫ソート順.<p>
	 *
	 */
	public MCNumber acxfr_gi_sort_seq() {
		return getConstNumber(offset + 27, $acxfr_gi_sort_seq);
	}

	/**
	 * Other accounting GI sort order 他勘定出庫ソート順.<p>
	 *
	 */
	public void acxfr_gi_sort_seq(MCNumber value) {
		setConstNumber(offset + 27, $acxfr_gi_sort_seq, value);
	}

	/**
	 * Other accounting GI sort order 他勘定出庫ソート順.<p>
	 *
	 */
	public void acxfr_gi_sort_seq(int value) {
		setConstNumber(offset + 27, $acxfr_gi_sort_seq, value);
	}

	/**
	 * Other accounting GI sort order 他勘定出庫ソート順.<p>
	 *
	 */
	public void acxfr_gi_sort_seq(long value) {
		setConstNumber(offset + 27, $acxfr_gi_sort_seq, value);
	}

	/**
	 * Other accounting GI sort order 他勘定出庫ソート順.<p>
	 *
	 */
	public void acxfr_gi_sort_seq(float value) {
		setConstNumber(offset + 27, $acxfr_gi_sort_seq, value);
	}

	/**
	 * Other accounting GI sort order 他勘定出庫ソート順.<p>
	 *
	 */
	public void acxfr_gi_sort_seq(double value) {
		setConstNumber(offset + 27, $acxfr_gi_sort_seq, value);
	}


	/**
	 * Input other accounting sort order 投入他勘定ソート順.<p>
	 *
	 */
	public MCNumber inpt_acxfr_sort_seq() {
		return getConstNumber(offset + 28, $inpt_acxfr_sort_seq);
	}

	/**
	 * Input other accounting sort order 投入他勘定ソート順.<p>
	 *
	 */
	public void inpt_acxfr_sort_seq(MCNumber value) {
		setConstNumber(offset + 28, $inpt_acxfr_sort_seq, value);
	}

	/**
	 * Input other accounting sort order 投入他勘定ソート順.<p>
	 *
	 */
	public void inpt_acxfr_sort_seq(int value) {
		setConstNumber(offset + 28, $inpt_acxfr_sort_seq, value);
	}

	/**
	 * Input other accounting sort order 投入他勘定ソート順.<p>
	 *
	 */
	public void inpt_acxfr_sort_seq(long value) {
		setConstNumber(offset + 28, $inpt_acxfr_sort_seq, value);
	}

	/**
	 * Input other accounting sort order 投入他勘定ソート順.<p>
	 *
	 */
	public void inpt_acxfr_sort_seq(float value) {
		setConstNumber(offset + 28, $inpt_acxfr_sort_seq, value);
	}

	/**
	 * Input other accounting sort order 投入他勘定ソート順.<p>
	 *
	 */
	public void inpt_acxfr_sort_seq(double value) {
		setConstNumber(offset + 28, $inpt_acxfr_sort_seq, value);
	}


	/**
	 * Disposal 廃棄.<p>
	 *
	 */
	public boolean disp_flg() {
		return getConstBoolean(offset + 29, $disp_flg);
	}

	/**
	 * Disposal 廃棄.<p>
	 *
	 */
	public void disp_flg(boolean value) {
		setConstBoolean(offset + 29, $disp_flg, value);
	}


	/**
	 * Disposal sort order 廃棄ソート順.<p>
	 *
	 */
	public MCNumber disp_sort_seq() {
		return getConstNumber(offset + 30, $disp_sort_seq);
	}

	/**
	 * Disposal sort order 廃棄ソート順.<p>
	 *
	 */
	public void disp_sort_seq(MCNumber value) {
		setConstNumber(offset + 30, $disp_sort_seq, value);
	}

	/**
	 * Disposal sort order 廃棄ソート順.<p>
	 *
	 */
	public void disp_sort_seq(int value) {
		setConstNumber(offset + 30, $disp_sort_seq, value);
	}

	/**
	 * Disposal sort order 廃棄ソート順.<p>
	 *
	 */
	public void disp_sort_seq(long value) {
		setConstNumber(offset + 30, $disp_sort_seq, value);
	}

	/**
	 * Disposal sort order 廃棄ソート順.<p>
	 *
	 */
	public void disp_sort_seq(float value) {
		setConstNumber(offset + 30, $disp_sort_seq, value);
	}

	/**
	 * Disposal sort order 廃棄ソート順.<p>
	 *
	 */
	public void disp_sort_seq(double value) {
		setConstNumber(offset + 30, $disp_sort_seq, value);
	}


	/**
	 * Inventory transfer 在庫振替.<p>
	 *
	 */
	public boolean stk_xfr_flg() {
		return getConstBoolean(offset + 31, $stk_xfr_flg);
	}

	/**
	 * Inventory transfer 在庫振替.<p>
	 *
	 */
	public void stk_xfr_flg(boolean value) {
		setConstBoolean(offset + 31, $stk_xfr_flg, value);
	}


	/**
	 * Inventory transfer sort order 在庫振替ソート順.<p>
	 *
	 */
	public MCNumber stk_xfr_sort_seq() {
		return getConstNumber(offset + 32, $stk_xfr_sort_seq);
	}

	/**
	 * Inventory transfer sort order 在庫振替ソート順.<p>
	 *
	 */
	public void stk_xfr_sort_seq(MCNumber value) {
		setConstNumber(offset + 32, $stk_xfr_sort_seq, value);
	}

	/**
	 * Inventory transfer sort order 在庫振替ソート順.<p>
	 *
	 */
	public void stk_xfr_sort_seq(int value) {
		setConstNumber(offset + 32, $stk_xfr_sort_seq, value);
	}

	/**
	 * Inventory transfer sort order 在庫振替ソート順.<p>
	 *
	 */
	public void stk_xfr_sort_seq(long value) {
		setConstNumber(offset + 32, $stk_xfr_sort_seq, value);
	}

	/**
	 * Inventory transfer sort order 在庫振替ソート順.<p>
	 *
	 */
	public void stk_xfr_sort_seq(float value) {
		setConstNumber(offset + 32, $stk_xfr_sort_seq, value);
	}

	/**
	 * Inventory transfer sort order 在庫振替ソート順.<p>
	 *
	 */
	public void stk_xfr_sort_seq(double value) {
		setConstNumber(offset + 32, $stk_xfr_sort_seq, value);
	}


	/**
	 * Transport 移送.<p>
	 *
	 */
	public boolean xfr_flg() {
		return getConstBoolean(offset + 33, $xfr_flg);
	}

	/**
	 * Transport 移送.<p>
	 *
	 */
	public void xfr_flg(boolean value) {
		setConstBoolean(offset + 33, $xfr_flg, value);
	}


	/**
	 * Transport sort order 移送ソート順.<p>
	 *
	 */
	public MCNumber xfr_sort_seq() {
		return getConstNumber(offset + 34, $xfr_sort_seq);
	}

	/**
	 * Transport sort order 移送ソート順.<p>
	 *
	 */
	public void xfr_sort_seq(MCNumber value) {
		setConstNumber(offset + 34, $xfr_sort_seq, value);
	}

	/**
	 * Transport sort order 移送ソート順.<p>
	 *
	 */
	public void xfr_sort_seq(int value) {
		setConstNumber(offset + 34, $xfr_sort_seq, value);
	}

	/**
	 * Transport sort order 移送ソート順.<p>
	 *
	 */
	public void xfr_sort_seq(long value) {
		setConstNumber(offset + 34, $xfr_sort_seq, value);
	}

	/**
	 * Transport sort order 移送ソート順.<p>
	 *
	 */
	public void xfr_sort_seq(float value) {
		setConstNumber(offset + 34, $xfr_sort_seq, value);
	}

	/**
	 * Transport sort order 移送ソート順.<p>
	 *
	 */
	public void xfr_sort_seq(double value) {
		setConstNumber(offset + 34, $xfr_sort_seq, value);
	}


	/**
	 * Output 出来高.<p>
	 *
	 */
	public boolean yield_flg() {
		return getConstBoolean(offset + 35, $yield_flg);
	}

	/**
	 * Output 出来高.<p>
	 *
	 */
	public void yield_flg(boolean value) {
		setConstBoolean(offset + 35, $yield_flg, value);
	}


	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public String yield_typ() {
		return getConstString(offset + 36, $yield_typ);
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public void yield_typ(String value) {
		setConstString(offset + 36, $yield_typ, value);
	}


	/**
	 * Output type name 出来高区分名.<p>
	 *
	 */
	public String yield_typ_nm() {
		return getConstString(offset + 37, $yield_typ_nm);
	}

	/**
	 * Output type name 出来高区分名.<p>
	 *
	 */
	public void yield_typ_nm(String value) {
		setConstString(offset + 37, $yield_typ_nm, value);
	}


	/**
	 * Output sort order 出来高ソート順.<p>
	 *
	 */
	public MCNumber yield_sort_seq() {
		return getConstNumber(offset + 38, $yield_sort_seq);
	}

	/**
	 * Output sort order 出来高ソート順.<p>
	 *
	 */
	public void yield_sort_seq(MCNumber value) {
		setConstNumber(offset + 38, $yield_sort_seq, value);
	}

	/**
	 * Output sort order 出来高ソート順.<p>
	 *
	 */
	public void yield_sort_seq(int value) {
		setConstNumber(offset + 38, $yield_sort_seq, value);
	}

	/**
	 * Output sort order 出来高ソート順.<p>
	 *
	 */
	public void yield_sort_seq(long value) {
		setConstNumber(offset + 38, $yield_sort_seq, value);
	}

	/**
	 * Output sort order 出来高ソート順.<p>
	 *
	 */
	public void yield_sort_seq(float value) {
		setConstNumber(offset + 38, $yield_sort_seq, value);
	}

	/**
	 * Output sort order 出来高ソート順.<p>
	 *
	 */
	public void yield_sort_seq(double value) {
		setConstNumber(offset + 38, $yield_sort_seq, value);
	}


	/**
	 * MRO supply 非在庫.<p>
	 *
	 */
	public boolean not_stk_flg() {
		return getConstBoolean(offset + 39, $not_stk_flg);
	}

	/**
	 * MRO supply 非在庫.<p>
	 *
	 */
	public void not_stk_flg(boolean value) {
		setConstBoolean(offset + 39, $not_stk_flg, value);
	}


	/**
	 * Loss ロス.<p>
	 *
	 */
	public boolean loss_flg() {
		return getConstBoolean(offset + 40, $loss_flg);
	}

	/**
	 * Loss ロス.<p>
	 *
	 */
	public void loss_flg(boolean value) {
		setConstBoolean(offset + 40, $loss_flg, value);
	}


	/**
	 * Constant loss 固定ロス.<p>
	 *
	 */
	public boolean fxd_loss_flg() {
		return getConstBoolean(offset + 41, $fxd_loss_flg);
	}

	/**
	 * Constant loss 固定ロス.<p>
	 *
	 */
	public void fxd_loss_flg(boolean value) {
		setConstBoolean(offset + 41, $fxd_loss_flg, value);
	}


	/**
	 * Not for lot trace ロットトレース対象外.<p>
	 *
	 */
	public boolean not_lot_trace_flg() {
		return getConstBoolean(offset + 42, $not_lot_trace_flg);
	}

	/**
	 * Not for lot trace ロットトレース対象外.<p>
	 *
	 */
	public void not_lot_trace_flg(boolean value) {
		setConstBoolean(offset + 42, $not_lot_trace_flg, value);
	}


	/**
	 * Input 投入.<p>
	 *
	 */
	public boolean inpt_flg() {
		return getConstBoolean(offset + 43, $inpt_flg);
	}

	/**
	 * Input 投入.<p>
	 *
	 */
	public void inpt_flg(boolean value) {
		setConstBoolean(offset + 43, $inpt_flg, value);
	}


	/**
	 * Input sort order 投入ソート順.<p>
	 *
	 */
	public MCNumber inpt_sort_seq() {
		return getConstNumber(offset + 44, $inpt_sort_seq);
	}

	/**
	 * Input sort order 投入ソート順.<p>
	 *
	 */
	public void inpt_sort_seq(MCNumber value) {
		setConstNumber(offset + 44, $inpt_sort_seq, value);
	}

	/**
	 * Input sort order 投入ソート順.<p>
	 *
	 */
	public void inpt_sort_seq(int value) {
		setConstNumber(offset + 44, $inpt_sort_seq, value);
	}

	/**
	 * Input sort order 投入ソート順.<p>
	 *
	 */
	public void inpt_sort_seq(long value) {
		setConstNumber(offset + 44, $inpt_sort_seq, value);
	}

	/**
	 * Input sort order 投入ソート順.<p>
	 *
	 */
	public void inpt_sort_seq(float value) {
		setConstNumber(offset + 44, $inpt_sort_seq, value);
	}

	/**
	 * Input sort order 投入ソート順.<p>
	 *
	 */
	public void inpt_sort_seq(double value) {
		setConstNumber(offset + 44, $inpt_sort_seq, value);
	}


	/**
	 * Inspection defective 検査不良.<p>
	 *
	 */
	public boolean dfct_flg() {
		return getConstBoolean(offset + 45, $dfct_flg);
	}

	/**
	 * Inspection defective 検査不良.<p>
	 *
	 */
	public void dfct_flg(boolean value) {
		setConstBoolean(offset + 45, $dfct_flg, value);
	}


	/**
	 * Inspection defective sort order 検査不良ソート順.<p>
	 *
	 */
	public MCNumber dfct_sort_seq() {
		return getConstNumber(offset + 46, $dfct_sort_seq);
	}

	/**
	 * Inspection defective sort order 検査不良ソート順.<p>
	 *
	 */
	public void dfct_sort_seq(MCNumber value) {
		setConstNumber(offset + 46, $dfct_sort_seq, value);
	}

	/**
	 * Inspection defective sort order 検査不良ソート順.<p>
	 *
	 */
	public void dfct_sort_seq(int value) {
		setConstNumber(offset + 46, $dfct_sort_seq, value);
	}

	/**
	 * Inspection defective sort order 検査不良ソート順.<p>
	 *
	 */
	public void dfct_sort_seq(long value) {
		setConstNumber(offset + 46, $dfct_sort_seq, value);
	}

	/**
	 * Inspection defective sort order 検査不良ソート順.<p>
	 *
	 */
	public void dfct_sort_seq(float value) {
		setConstNumber(offset + 46, $dfct_sort_seq, value);
	}

	/**
	 * Inspection defective sort order 検査不良ソート順.<p>
	 *
	 */
	public void dfct_sort_seq(double value) {
		setConstNumber(offset + 46, $dfct_sort_seq, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 47, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 47, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 48, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 48, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 49, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 49, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 50, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 50, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 51, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 51, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 52, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 52, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 53, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 53, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 54, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 54, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 55, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 56, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 56, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 57, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 57, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 58, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 58, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 59, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 59, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 60, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 60, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 61, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 61, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 62, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 62, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 63, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 63, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 64, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 64, $del_ts, value);
	}


	/**
	 * Before change_Purchase 変更前_仕入.<p>
	 *
	 */
	public boolean old_purc_flg() {
		return getConstBoolean(offset + 65, $old_purc_flg);
	}

	/**
	 * Before change_Purchase 変更前_仕入.<p>
	 *
	 */
	public void old_purc_flg(boolean value) {
		setConstBoolean(offset + 65, $old_purc_flg, value);
	}


	/**
	 * Before change_Purchase return 変更前_仕入返品.<p>
	 *
	 */
	public boolean old_purc_rtn_flg() {
		return getConstBoolean(offset + 66, $old_purc_rtn_flg);
	}

	/**
	 * Before change_Purchase return 変更前_仕入返品.<p>
	 *
	 */
	public void old_purc_rtn_flg(boolean value) {
		setConstBoolean(offset + 66, $old_purc_rtn_flg, value);
	}


	/**
	 * Before change_Expense purchase 変更前_経費購買.<p>
	 *
	 */
	public boolean old_xpns_purc_flg() {
		return getConstBoolean(offset + 67, $old_xpns_purc_flg);
	}

	/**
	 * Before change_Expense purchase 変更前_経費購買.<p>
	 *
	 */
	public void old_xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 67, $old_xpns_purc_flg, value);
	}


	/**
	 * Before change_Purchase adjustment 変更前_仕入調整.<p>
	 *
	 */
	public boolean old_purc_dscnt_flg() {
		return getConstBoolean(offset + 68, $old_purc_dscnt_flg);
	}

	/**
	 * Before change_Purchase adjustment 変更前_仕入調整.<p>
	 *
	 */
	public void old_purc_dscnt_flg(boolean value) {
		setConstBoolean(offset + 68, $old_purc_dscnt_flg, value);
	}


	/**
	 * Before change_Sales 変更前_売上.<p>
	 *
	 */
	public boolean old_sls_flg() {
		return getConstBoolean(offset + 69, $old_sls_flg);
	}

	/**
	 * Before change_Sales 変更前_売上.<p>
	 *
	 */
	public void old_sls_flg(boolean value) {
		setConstBoolean(offset + 69, $old_sls_flg, value);
	}


	/**
	 * Before change_Sales return 変更前_売上返品.<p>
	 *
	 */
	public boolean old_sls_rtn_flg() {
		return getConstBoolean(offset + 70, $old_sls_rtn_flg);
	}

	/**
	 * Before change_Sales return 変更前_売上返品.<p>
	 *
	 */
	public void old_sls_rtn_flg(boolean value) {
		setConstBoolean(offset + 70, $old_sls_rtn_flg, value);
	}


	/**
	 * Before change _ Sales and other accounting 変更前_販売他勘定.<p>
	 *
	 */
	public boolean old_sls_acxfr_flg() {
		return getConstBoolean(offset + 71, $old_sls_acxfr_flg);
	}

	/**
	 * Before change _ Sales and other accounting 変更前_販売他勘定.<p>
	 *
	 */
	public void old_sls_acxfr_flg(boolean value) {
		setConstBoolean(offset + 71, $old_sls_acxfr_flg, value);
	}


	/**
	 * Before change_Sales adjustment 変更前_売上調整.<p>
	 *
	 */
	public boolean old_sls_dscnt_flg() {
		return getConstBoolean(offset + 72, $old_sls_dscnt_flg);
	}

	/**
	 * Before change_Sales adjustment 変更前_売上調整.<p>
	 *
	 */
	public void old_sls_dscnt_flg(boolean value) {
		setConstBoolean(offset + 72, $old_sls_dscnt_flg, value);
	}


	/**
	 * Before change_Other accounting GR 変更前_他勘定入庫.<p>
	 *
	 */
	public boolean old_acxfr_gr_flg() {
		return getConstBoolean(offset + 73, $old_acxfr_gr_flg);
	}

	/**
	 * Before change_Other accounting GR 変更前_他勘定入庫.<p>
	 *
	 */
	public void old_acxfr_gr_flg(boolean value) {
		setConstBoolean(offset + 73, $old_acxfr_gr_flg, value);
	}


	/**
	 * Before change_Other accounting GI 変更前_他勘定出庫.<p>
	 *
	 */
	public boolean old_acxfr_gi_flg() {
		return getConstBoolean(offset + 74, $old_acxfr_gi_flg);
	}

	/**
	 * Before change_Other accounting GI 変更前_他勘定出庫.<p>
	 *
	 */
	public void old_acxfr_gi_flg(boolean value) {
		setConstBoolean(offset + 74, $old_acxfr_gi_flg, value);
	}


	/**
	 * Before change_Disposal 変更前_廃棄.<p>
	 *
	 */
	public boolean old_disp_flg() {
		return getConstBoolean(offset + 75, $old_disp_flg);
	}

	/**
	 * Before change_Disposal 変更前_廃棄.<p>
	 *
	 */
	public void old_disp_flg(boolean value) {
		setConstBoolean(offset + 75, $old_disp_flg, value);
	}


	/**
	 * Before change_Inventory transfer 変更前_在庫振替.<p>
	 *
	 */
	public boolean old_stk_xfr_flg() {
		return getConstBoolean(offset + 76, $old_stk_xfr_flg);
	}

	/**
	 * Before change_Inventory transfer 変更前_在庫振替.<p>
	 *
	 */
	public void old_stk_xfr_flg(boolean value) {
		setConstBoolean(offset + 76, $old_stk_xfr_flg, value);
	}


	/**
	 * Before change_Transfer 変更前_移送.<p>
	 *
	 */
	public boolean old_xfr_flg() {
		return getConstBoolean(offset + 77, $old_xfr_flg);
	}

	/**
	 * Before change_Transfer 変更前_移送.<p>
	 *
	 */
	public void old_xfr_flg(boolean value) {
		setConstBoolean(offset + 77, $old_xfr_flg, value);
	}


	/**
	 * Before change_Output 変更前_出来高.<p>
	 *
	 */
	public boolean old_yield_flg() {
		return getConstBoolean(offset + 78, $old_yield_flg);
	}

	/**
	 * Before change_Output 変更前_出来高.<p>
	 *
	 */
	public void old_yield_flg(boolean value) {
		setConstBoolean(offset + 78, $old_yield_flg, value);
	}


	/**
	 * Before change_Loss 変更前_ロス.<p>
	 *
	 */
	public boolean old_loss_flg() {
		return getConstBoolean(offset + 79, $old_loss_flg);
	}

	/**
	 * Before change_Loss 変更前_ロス.<p>
	 *
	 */
	public void old_loss_flg(boolean value) {
		setConstBoolean(offset + 79, $old_loss_flg, value);
	}


	/**
	 * Before change_Fixed loss 変更前_固定ロス.<p>
	 *
	 */
	public boolean old_fxd_loss_flg() {
		return getConstBoolean(offset + 80, $old_fxd_loss_flg);
	}

	/**
	 * Before change_Fixed loss 変更前_固定ロス.<p>
	 *
	 */
	public void old_fxd_loss_flg(boolean value) {
		setConstBoolean(offset + 80, $old_fxd_loss_flg, value);
	}


	/**
	 * Before change_Input 変更前_投入.<p>
	 *
	 */
	public boolean old_inpt_flg() {
		return getConstBoolean(offset + 81, $old_inpt_flg);
	}

	/**
	 * Before change_Input 変更前_投入.<p>
	 *
	 */
	public void old_inpt_flg(boolean value) {
		setConstBoolean(offset + 81, $old_inpt_flg, value);
	}


	/**
	 * Before change_Inspection defective 変更前_検査不良.<p>
	 *
	 */
	public boolean old_dfct_flg() {
		return getConstBoolean(offset + 82, $old_dfct_flg);
	}

	/**
	 * Before change_Inspection defective 変更前_検査不良.<p>
	 *
	 */
	public void old_dfct_flg(boolean value) {
		setConstBoolean(offset + 82, $old_dfct_flg, value);
	}


	public String getString(String name) {
		if ($biz_rsn_cd.equalsIgnoreCase(name)) {
			return biz_rsn_cd();
		}
		if ($biz_rsn_nm_lcl.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl();
		}
		if ($biz_rsn_nm.equalsIgnoreCase(name)) {
			return biz_rsn_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($purc_dscnt_loc_mng_typ.equalsIgnoreCase(name)) {
			return purc_dscnt_loc_mng_typ();
		}
		if ($purc_dscnt_loc_mng_typ_nm.equalsIgnoreCase(name)) {
			return purc_dscnt_loc_mng_typ_nm();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
		}
		if ($yield_typ_nm.equalsIgnoreCase(name)) {
			return yield_typ_nm();
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
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			return purc_sort_seq();
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			return purc_rtn_sort_seq();
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			return purc_dscnt_sort_seq();
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			return sls_sort_seq();
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			return sls_rtn_sort_seq();
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			return sls_dscnt_sort_seq();
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			return acxfr_gr_sort_seq();
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			return acxfr_gi_sort_seq();
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			return inpt_acxfr_sort_seq();
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			return disp_sort_seq();
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			return stk_xfr_sort_seq();
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			return xfr_sort_seq();
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			return yield_sort_seq();
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			return inpt_sort_seq();
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			return dfct_sort_seq();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($purc_rtn_flg.equalsIgnoreCase(name)) {
			return purc_rtn_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($slo_xpns_purc_flg.equalsIgnoreCase(name)) {
			return slo_xpns_purc_flg();
		}
		if ($purc_dscnt_flg.equalsIgnoreCase(name)) {
			return purc_dscnt_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			return sls_rtn_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($sls_dscnt_flg.equalsIgnoreCase(name)) {
			return sls_dscnt_flg();
		}
		if ($acxfr_gr_flg.equalsIgnoreCase(name)) {
			return acxfr_gr_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($disp_flg.equalsIgnoreCase(name)) {
			return disp_flg();
		}
		if ($stk_xfr_flg.equalsIgnoreCase(name)) {
			return stk_xfr_flg();
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			return xfr_flg();
		}
		if ($yield_flg.equalsIgnoreCase(name)) {
			return yield_flg();
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			return not_stk_flg();
		}
		if ($loss_flg.equalsIgnoreCase(name)) {
			return loss_flg();
		}
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			return fxd_loss_flg();
		}
		if ($not_lot_trace_flg.equalsIgnoreCase(name)) {
			return not_lot_trace_flg();
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			return inpt_flg();
		}
		if ($dfct_flg.equalsIgnoreCase(name)) {
			return dfct_flg();
		}
		if ($old_purc_flg.equalsIgnoreCase(name)) {
			return old_purc_flg();
		}
		if ($old_purc_rtn_flg.equalsIgnoreCase(name)) {
			return old_purc_rtn_flg();
		}
		if ($old_xpns_purc_flg.equalsIgnoreCase(name)) {
			return old_xpns_purc_flg();
		}
		if ($old_purc_dscnt_flg.equalsIgnoreCase(name)) {
			return old_purc_dscnt_flg();
		}
		if ($old_sls_flg.equalsIgnoreCase(name)) {
			return old_sls_flg();
		}
		if ($old_sls_rtn_flg.equalsIgnoreCase(name)) {
			return old_sls_rtn_flg();
		}
		if ($old_sls_acxfr_flg.equalsIgnoreCase(name)) {
			return old_sls_acxfr_flg();
		}
		if ($old_sls_dscnt_flg.equalsIgnoreCase(name)) {
			return old_sls_dscnt_flg();
		}
		if ($old_acxfr_gr_flg.equalsIgnoreCase(name)) {
			return old_acxfr_gr_flg();
		}
		if ($old_acxfr_gi_flg.equalsIgnoreCase(name)) {
			return old_acxfr_gi_flg();
		}
		if ($old_disp_flg.equalsIgnoreCase(name)) {
			return old_disp_flg();
		}
		if ($old_stk_xfr_flg.equalsIgnoreCase(name)) {
			return old_stk_xfr_flg();
		}
		if ($old_xfr_flg.equalsIgnoreCase(name)) {
			return old_xfr_flg();
		}
		if ($old_yield_flg.equalsIgnoreCase(name)) {
			return old_yield_flg();
		}
		if ($old_loss_flg.equalsIgnoreCase(name)) {
			return old_loss_flg();
		}
		if ($old_fxd_loss_flg.equalsIgnoreCase(name)) {
			return old_fxd_loss_flg();
		}
		if ($old_inpt_flg.equalsIgnoreCase(name)) {
			return old_inpt_flg();
		}
		if ($old_dfct_flg.equalsIgnoreCase(name)) {
			return old_dfct_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($biz_rsn_cd.equalsIgnoreCase(name)) {
			return biz_rsn_cd();
		}
		if ($biz_rsn_nm_lcl.equalsIgnoreCase(name)) {
			return biz_rsn_nm_lcl();
		}
		if ($biz_rsn_nm.equalsIgnoreCase(name)) {
			return biz_rsn_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($purc_dscnt_loc_mng_typ.equalsIgnoreCase(name)) {
			return purc_dscnt_loc_mng_typ();
		}
		if ($purc_dscnt_loc_mng_typ_nm.equalsIgnoreCase(name)) {
			return purc_dscnt_loc_mng_typ_nm();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
		}
		if ($yield_typ_nm.equalsIgnoreCase(name)) {
			return yield_typ_nm();
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
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			return purc_sort_seq();
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			return purc_rtn_sort_seq();
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			return purc_dscnt_sort_seq();
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			return sls_sort_seq();
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			return sls_rtn_sort_seq();
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			return sls_dscnt_sort_seq();
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			return acxfr_gr_sort_seq();
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			return acxfr_gi_sort_seq();
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			return inpt_acxfr_sort_seq();
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			return disp_sort_seq();
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			return stk_xfr_sort_seq();
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			return xfr_sort_seq();
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			return yield_sort_seq();
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			return inpt_sort_seq();
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			return dfct_sort_seq();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($purc_rtn_flg.equalsIgnoreCase(name)) {
			return purc_rtn_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($slo_xpns_purc_flg.equalsIgnoreCase(name)) {
			return slo_xpns_purc_flg();
		}
		if ($purc_dscnt_flg.equalsIgnoreCase(name)) {
			return purc_dscnt_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			return sls_rtn_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($sls_dscnt_flg.equalsIgnoreCase(name)) {
			return sls_dscnt_flg();
		}
		if ($acxfr_gr_flg.equalsIgnoreCase(name)) {
			return acxfr_gr_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($disp_flg.equalsIgnoreCase(name)) {
			return disp_flg();
		}
		if ($stk_xfr_flg.equalsIgnoreCase(name)) {
			return stk_xfr_flg();
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			return xfr_flg();
		}
		if ($yield_flg.equalsIgnoreCase(name)) {
			return yield_flg();
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			return not_stk_flg();
		}
		if ($loss_flg.equalsIgnoreCase(name)) {
			return loss_flg();
		}
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			return fxd_loss_flg();
		}
		if ($not_lot_trace_flg.equalsIgnoreCase(name)) {
			return not_lot_trace_flg();
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			return inpt_flg();
		}
		if ($dfct_flg.equalsIgnoreCase(name)) {
			return dfct_flg();
		}
		if ($old_purc_flg.equalsIgnoreCase(name)) {
			return old_purc_flg();
		}
		if ($old_purc_rtn_flg.equalsIgnoreCase(name)) {
			return old_purc_rtn_flg();
		}
		if ($old_xpns_purc_flg.equalsIgnoreCase(name)) {
			return old_xpns_purc_flg();
		}
		if ($old_purc_dscnt_flg.equalsIgnoreCase(name)) {
			return old_purc_dscnt_flg();
		}
		if ($old_sls_flg.equalsIgnoreCase(name)) {
			return old_sls_flg();
		}
		if ($old_sls_rtn_flg.equalsIgnoreCase(name)) {
			return old_sls_rtn_flg();
		}
		if ($old_sls_acxfr_flg.equalsIgnoreCase(name)) {
			return old_sls_acxfr_flg();
		}
		if ($old_sls_dscnt_flg.equalsIgnoreCase(name)) {
			return old_sls_dscnt_flg();
		}
		if ($old_acxfr_gr_flg.equalsIgnoreCase(name)) {
			return old_acxfr_gr_flg();
		}
		if ($old_acxfr_gi_flg.equalsIgnoreCase(name)) {
			return old_acxfr_gi_flg();
		}
		if ($old_disp_flg.equalsIgnoreCase(name)) {
			return old_disp_flg();
		}
		if ($old_stk_xfr_flg.equalsIgnoreCase(name)) {
			return old_stk_xfr_flg();
		}
		if ($old_xfr_flg.equalsIgnoreCase(name)) {
			return old_xfr_flg();
		}
		if ($old_yield_flg.equalsIgnoreCase(name)) {
			return old_yield_flg();
		}
		if ($old_loss_flg.equalsIgnoreCase(name)) {
			return old_loss_flg();
		}
		if ($old_fxd_loss_flg.equalsIgnoreCase(name)) {
			return old_fxd_loss_flg();
		}
		if ($old_inpt_flg.equalsIgnoreCase(name)) {
			return old_inpt_flg();
		}
		if ($old_dfct_flg.equalsIgnoreCase(name)) {
			return old_dfct_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_rsn_cd.equalsIgnoreCase(name)) {
			biz_rsn_cd(value);
			return;
		}
		if ($biz_rsn_nm_lcl.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl(value);
			return;
		}
		if ($biz_rsn_nm.equalsIgnoreCase(name)) {
			biz_rsn_nm(value);
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
		if ($purc_dscnt_loc_mng_typ.equalsIgnoreCase(name)) {
			purc_dscnt_loc_mng_typ(value);
			return;
		}
		if ($purc_dscnt_loc_mng_typ_nm.equalsIgnoreCase(name)) {
			purc_dscnt_loc_mng_typ_nm(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
			return;
		}
		if ($yield_typ_nm.equalsIgnoreCase(name)) {
			yield_typ_nm(value);
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
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($purc_rtn_flg.equalsIgnoreCase(name)) {
			purc_rtn_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($slo_xpns_purc_flg.equalsIgnoreCase(name)) {
			slo_xpns_purc_flg(value);
			return;
		}
		if ($purc_dscnt_flg.equalsIgnoreCase(name)) {
			purc_dscnt_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			sls_rtn_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($sls_dscnt_flg.equalsIgnoreCase(name)) {
			sls_dscnt_flg(value);
			return;
		}
		if ($acxfr_gr_flg.equalsIgnoreCase(name)) {
			acxfr_gr_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		if ($disp_flg.equalsIgnoreCase(name)) {
			disp_flg(value);
			return;
		}
		if ($stk_xfr_flg.equalsIgnoreCase(name)) {
			stk_xfr_flg(value);
			return;
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			xfr_flg(value);
			return;
		}
		if ($yield_flg.equalsIgnoreCase(name)) {
			yield_flg(value);
			return;
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			not_stk_flg(value);
			return;
		}
		if ($loss_flg.equalsIgnoreCase(name)) {
			loss_flg(value);
			return;
		}
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			fxd_loss_flg(value);
			return;
		}
		if ($not_lot_trace_flg.equalsIgnoreCase(name)) {
			not_lot_trace_flg(value);
			return;
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			inpt_flg(value);
			return;
		}
		if ($dfct_flg.equalsIgnoreCase(name)) {
			dfct_flg(value);
			return;
		}
		if ($old_purc_flg.equalsIgnoreCase(name)) {
			old_purc_flg(value);
			return;
		}
		if ($old_purc_rtn_flg.equalsIgnoreCase(name)) {
			old_purc_rtn_flg(value);
			return;
		}
		if ($old_xpns_purc_flg.equalsIgnoreCase(name)) {
			old_xpns_purc_flg(value);
			return;
		}
		if ($old_purc_dscnt_flg.equalsIgnoreCase(name)) {
			old_purc_dscnt_flg(value);
			return;
		}
		if ($old_sls_flg.equalsIgnoreCase(name)) {
			old_sls_flg(value);
			return;
		}
		if ($old_sls_rtn_flg.equalsIgnoreCase(name)) {
			old_sls_rtn_flg(value);
			return;
		}
		if ($old_sls_acxfr_flg.equalsIgnoreCase(name)) {
			old_sls_acxfr_flg(value);
			return;
		}
		if ($old_sls_dscnt_flg.equalsIgnoreCase(name)) {
			old_sls_dscnt_flg(value);
			return;
		}
		if ($old_acxfr_gr_flg.equalsIgnoreCase(name)) {
			old_acxfr_gr_flg(value);
			return;
		}
		if ($old_acxfr_gi_flg.equalsIgnoreCase(name)) {
			old_acxfr_gi_flg(value);
			return;
		}
		if ($old_disp_flg.equalsIgnoreCase(name)) {
			old_disp_flg(value);
			return;
		}
		if ($old_stk_xfr_flg.equalsIgnoreCase(name)) {
			old_stk_xfr_flg(value);
			return;
		}
		if ($old_xfr_flg.equalsIgnoreCase(name)) {
			old_xfr_flg(value);
			return;
		}
		if ($old_yield_flg.equalsIgnoreCase(name)) {
			old_yield_flg(value);
			return;
		}
		if ($old_loss_flg.equalsIgnoreCase(name)) {
			old_loss_flg(value);
			return;
		}
		if ($old_fxd_loss_flg.equalsIgnoreCase(name)) {
			old_fxd_loss_flg(value);
			return;
		}
		if ($old_inpt_flg.equalsIgnoreCase(name)) {
			old_inpt_flg(value);
			return;
		}
		if ($old_dfct_flg.equalsIgnoreCase(name)) {
			old_dfct_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_rsn_cd.equalsIgnoreCase(name)) {
			biz_rsn_cd(value);
			return;
		}
		if ($biz_rsn_nm_lcl.equalsIgnoreCase(name)) {
			biz_rsn_nm_lcl(value);
			return;
		}
		if ($biz_rsn_nm.equalsIgnoreCase(name)) {
			biz_rsn_nm(value);
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
		if ($purc_dscnt_loc_mng_typ.equalsIgnoreCase(name)) {
			purc_dscnt_loc_mng_typ(value);
			return;
		}
		if ($purc_dscnt_loc_mng_typ_nm.equalsIgnoreCase(name)) {
			purc_dscnt_loc_mng_typ_nm(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
			return;
		}
		if ($yield_typ_nm.equalsIgnoreCase(name)) {
			yield_typ_nm(value);
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
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($purc_sort_seq.equalsIgnoreCase(name)) {
			purc_sort_seq(value);
			return;
		}
		if ($purc_rtn_sort_seq.equalsIgnoreCase(name)) {
			purc_rtn_sort_seq(value);
			return;
		}
		if ($purc_dscnt_sort_seq.equalsIgnoreCase(name)) {
			purc_dscnt_sort_seq(value);
			return;
		}
		if ($sls_sort_seq.equalsIgnoreCase(name)) {
			sls_sort_seq(value);
			return;
		}
		if ($sls_rtn_sort_seq.equalsIgnoreCase(name)) {
			sls_rtn_sort_seq(value);
			return;
		}
		if ($sls_dscnt_sort_seq.equalsIgnoreCase(name)) {
			sls_dscnt_sort_seq(value);
			return;
		}
		if ($acxfr_gr_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gr_sort_seq(value);
			return;
		}
		if ($acxfr_gi_sort_seq.equalsIgnoreCase(name)) {
			acxfr_gi_sort_seq(value);
			return;
		}
		if ($inpt_acxfr_sort_seq.equalsIgnoreCase(name)) {
			inpt_acxfr_sort_seq(value);
			return;
		}
		if ($disp_sort_seq.equalsIgnoreCase(name)) {
			disp_sort_seq(value);
			return;
		}
		if ($stk_xfr_sort_seq.equalsIgnoreCase(name)) {
			stk_xfr_sort_seq(value);
			return;
		}
		if ($xfr_sort_seq.equalsIgnoreCase(name)) {
			xfr_sort_seq(value);
			return;
		}
		if ($yield_sort_seq.equalsIgnoreCase(name)) {
			yield_sort_seq(value);
			return;
		}
		if ($inpt_sort_seq.equalsIgnoreCase(name)) {
			inpt_sort_seq(value);
			return;
		}
		if ($dfct_sort_seq.equalsIgnoreCase(name)) {
			dfct_sort_seq(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($purc_rtn_flg.equalsIgnoreCase(name)) {
			purc_rtn_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($slo_xpns_purc_flg.equalsIgnoreCase(name)) {
			slo_xpns_purc_flg(value);
			return;
		}
		if ($purc_dscnt_flg.equalsIgnoreCase(name)) {
			purc_dscnt_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			sls_rtn_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($sls_dscnt_flg.equalsIgnoreCase(name)) {
			sls_dscnt_flg(value);
			return;
		}
		if ($acxfr_gr_flg.equalsIgnoreCase(name)) {
			acxfr_gr_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		if ($disp_flg.equalsIgnoreCase(name)) {
			disp_flg(value);
			return;
		}
		if ($stk_xfr_flg.equalsIgnoreCase(name)) {
			stk_xfr_flg(value);
			return;
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			xfr_flg(value);
			return;
		}
		if ($yield_flg.equalsIgnoreCase(name)) {
			yield_flg(value);
			return;
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			not_stk_flg(value);
			return;
		}
		if ($loss_flg.equalsIgnoreCase(name)) {
			loss_flg(value);
			return;
		}
		if ($fxd_loss_flg.equalsIgnoreCase(name)) {
			fxd_loss_flg(value);
			return;
		}
		if ($not_lot_trace_flg.equalsIgnoreCase(name)) {
			not_lot_trace_flg(value);
			return;
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			inpt_flg(value);
			return;
		}
		if ($dfct_flg.equalsIgnoreCase(name)) {
			dfct_flg(value);
			return;
		}
		if ($old_purc_flg.equalsIgnoreCase(name)) {
			old_purc_flg(value);
			return;
		}
		if ($old_purc_rtn_flg.equalsIgnoreCase(name)) {
			old_purc_rtn_flg(value);
			return;
		}
		if ($old_xpns_purc_flg.equalsIgnoreCase(name)) {
			old_xpns_purc_flg(value);
			return;
		}
		if ($old_purc_dscnt_flg.equalsIgnoreCase(name)) {
			old_purc_dscnt_flg(value);
			return;
		}
		if ($old_sls_flg.equalsIgnoreCase(name)) {
			old_sls_flg(value);
			return;
		}
		if ($old_sls_rtn_flg.equalsIgnoreCase(name)) {
			old_sls_rtn_flg(value);
			return;
		}
		if ($old_sls_acxfr_flg.equalsIgnoreCase(name)) {
			old_sls_acxfr_flg(value);
			return;
		}
		if ($old_sls_dscnt_flg.equalsIgnoreCase(name)) {
			old_sls_dscnt_flg(value);
			return;
		}
		if ($old_acxfr_gr_flg.equalsIgnoreCase(name)) {
			old_acxfr_gr_flg(value);
			return;
		}
		if ($old_acxfr_gi_flg.equalsIgnoreCase(name)) {
			old_acxfr_gi_flg(value);
			return;
		}
		if ($old_disp_flg.equalsIgnoreCase(name)) {
			old_disp_flg(value);
			return;
		}
		if ($old_stk_xfr_flg.equalsIgnoreCase(name)) {
			old_stk_xfr_flg(value);
			return;
		}
		if ($old_xfr_flg.equalsIgnoreCase(name)) {
			old_xfr_flg(value);
			return;
		}
		if ($old_yield_flg.equalsIgnoreCase(name)) {
			old_yield_flg(value);
			return;
		}
		if ($old_loss_flg.equalsIgnoreCase(name)) {
			old_loss_flg(value);
			return;
		}
		if ($old_fxd_loss_flg.equalsIgnoreCase(name)) {
			old_fxd_loss_flg(value);
			return;
		}
		if ($old_inpt_flg.equalsIgnoreCase(name)) {
			old_inpt_flg(value);
			return;
		}
		if ($old_dfct_flg.equalsIgnoreCase(name)) {
			old_dfct_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

