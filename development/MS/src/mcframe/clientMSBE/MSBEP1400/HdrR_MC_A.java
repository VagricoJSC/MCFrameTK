package mcframe.clientMSBE.MSBEP1400;

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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_nm = "ship_fr_lg_grp_nm";
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public static final String $ship_inst_rev = "ship_inst_rev";
	/**
	 * Latest 最新.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * I/V No. Ｉ／ＶＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	public static final String $ship_inst_ymd_hm_p = "ship_inst_ymd_hm_p";
	public static final String $ship_schd_ymd_hm_p = "ship_schd_ymd_hm_p";
	/**
	 * Shipping schedule time 出荷予定時間.<p>
	 *
	 */
	public static final String $ship_schd_time = "ship_schd_time";
	public static final String $dlv_schd_ymd_hm_p = "dlv_schd_ymd_hm_p";
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public static final String $ship_to_id_typ = "ship_to_id_typ";
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public static final String $ship_to_id_typ_nm = "ship_to_id_typ_nm";
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public static final String $ship_to_id_cd = "ship_to_id_cd";
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public static final String $ship_to_id_nm = "ship_to_id_nm";
	public static final String $ship_to_addr_p = "ship_to_addr_p";
	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public static final String $ship_to_sundry_flg = "ship_to_sundry_flg";
	public static final String $inst_usr_dpt_p = "inst_usr_dpt_p";
	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public static final String $lot_chk_off_flg = "lot_chk_off_flg";
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
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_cd = "ship_wk_cd";
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public static final String $ship_wk_nm = "ship_wk_nm";
	/**
	 * Weight 重量.<p>
	 *
	 */
	public static final String $ship_wt = "ship_wt";
	/**
	 * Volume 容積.<p>
	 *
	 */
	public static final String $ship_dim = "ship_dim";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public static final String $inst_rmrks = "inst_rmrks";
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
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public static final String $immd_pick_prnt_flg = "immd_pick_prnt_flg";
	/**
	 * Shipping order sheet immediate issue 出荷指図書即時発行.<p>
	 *
	 */
	public static final String $immd_ship_inst_prnt_flg = "immd_ship_inst_prnt_flg";
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public static final String $immd_dlv_prnt_flg = "immd_dlv_prnt_flg";
	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public static final String $immd_ship_adv_prnt_flg = "immd_ship_adv_prnt_flg";
	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public static final String $pick_prnt_flg = "pick_prnt_flg";
	/**
	 * Shipping order sheet issued 出荷指図書発行済.<p>
	 *
	 */
	public static final String $ship_inst_prnt_flg = "ship_inst_prnt_flg";
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public static final String $dlv_prnt_flg = "dlv_prnt_flg";
	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public static final String $ship_adv_prnt_flg = "ship_adv_prnt_flg";
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
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public static final String $ship_inst_upd_cntr = "ship_inst_upd_cntr";
	/**
	 * Issue delivery slip 納品伝票発行.<p>
	 *
	 */
	public static final String $dlv_prnt_btn_flg = "dlv_prnt_btn_flg";
	/**
	 * Issue order sheet 指図書発行.<p>
	 *
	 */
	public static final String $inst_prnt_btn_flg = "inst_prnt_btn_flg";
	/**
	 * Issue picking ピッキング発行.<p>
	 *
	 */
	public static final String $pick_prnt_btn_flg = "pick_prnt_btn_flg";
	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public static final String $adv_prnt_btn_flg = "adv_prnt_btn_flg";
	/**
	 * Consolidated shipping schedule No. 連結出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $linked_ship_schd_no = "linked_ship_schd_no";
	/**
	 * Do not allow delivery note issue 納品書発行不可.<p>
	 *
	 */
	public static final String $non_dlv_prnt_flg = "non_dlv_prnt_flg";
	/**
	 * Do not allow shipping guide issue 出荷案内書発行不可.<p>
	 *
	 */
	public static final String $non_adv_prnt_flg = "non_adv_prnt_flg";

	public static final String $ship_inst_dt = $ship_inst_ymd_hm_p + ".ymd";
	public static final String $ship_inst_hm = $ship_inst_ymd_hm_p + ".hm";
	public static final String $ship_schd_dt = $ship_schd_ymd_hm_p + ".ymd";
	public static final String $ship_schd_hm = $ship_schd_ymd_hm_p + ".hm";
	public static final String $dlv_schd_dt = $dlv_schd_ymd_hm_p + ".ymd";
	public static final String $dlv_schd_hm = $dlv_schd_ymd_hm_p + ".hm";
	public static final String $ship_to_lg_grp_cd = $ship_to_addr_p + ".lg_grp_cd";
	public static final String $ship_to_lg_grp_nm = $ship_to_addr_p + ".lg_grp_nm";
	public static final String $ship_to_cntry_cd = $ship_to_addr_p + ".cntry_cd";
	public static final String $ship_to_cntry_nm = $ship_to_addr_p + ".cntry_nm";
	public static final String $ship_to_zip_cd = $ship_to_addr_p + ".zip_cd";
	public static final String $ship_to_addr1 = $ship_to_addr_p + ".addr1";
	public static final String $ship_to_addr2 = $ship_to_addr_p + ".addr2";
	public static final String $ship_to_addr3 = $ship_to_addr_p + ".addr3";
	public static final String $ship_to_addr4 = $ship_to_addr_p + ".addr4";
	public static final String $ship_to_cntct_dpt = $ship_to_addr_p + ".cntct_dpt";
	public static final String $ship_to_cntct_psn = $ship_to_addr_p + ".cntct_psn";
	public static final String $ship_to_tel = $ship_to_addr_p + ".tel";
	public static final String $ship_to_fax = $ship_to_addr_p + ".fax";
	public static final String $inst_usr_cd = $inst_usr_dpt_p + ".usr_cd";
	public static final String $inst_usr_nm = $inst_usr_dpt_p + ".usr_nm";
	public static final String $inst_dpt_cd = $inst_usr_dpt_p + ".dpt_cd";
	public static final String $inst_dpt_nm = $inst_usr_dpt_p + ".dpt_nm";

	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_fr_lg_grp_nm_META = createCommonMeta($ship_fr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta ship_inst_rev_META = createCommonMeta($ship_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta ship_inst_ymd_hm_p_META = createInnerRowMeta($ship_inst_ymd_hm_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta ship_schd_ymd_hm_p_META = createInnerRowMeta($ship_schd_ymd_hm_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta ship_schd_time_META = createCommonMeta($ship_schd_time, mcframe.commonMA.meta.MA_META.CHAR_HM);
	public static final MCMeta dlv_schd_ymd_hm_p_META = createInnerRowMeta($dlv_schd_ymd_hm_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_typ_nm_META = createCommonMeta($ship_to_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP_NM);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_id_nm_META = createCommonMeta($ship_to_id_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta ship_to_addr_p_META = createInnerRowMeta($ship_to_addr_p, mcframe.clientMAUB.MAUBP0410.AddrR.class);
	public static final MCMeta ship_to_sundry_flg_META = createCommonMeta($ship_to_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_usr_dpt_p_META = createInnerRowMeta($inst_usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta lot_chk_off_flg_META = createCommonMeta($lot_chk_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_term_nm_META = createCommonMeta($ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta ship_wk_grp_cd_META = createCommonMeta($ship_wk_grp_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_GRP_CD);
	public static final MCMeta ship_wk_grp_nm_META = createCommonMeta($ship_wk_grp_nm, mcframe.commonMA.meta.MA_META.SHIP_WK_GRP_NM);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta ship_wk_nm_META = createCommonMeta($ship_wk_nm, mcframe.commonMA.meta.MA_META.SHIP_WK_NM);
	public static final MCMeta ship_wt_META = createCommonMeta($ship_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta ship_dim_META = createCommonMeta($ship_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_INTR_RMRKS);
	public static final MCMeta inst_rmrks_META = createCommonMeta($inst_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR3);
	public static final MCMeta immd_pick_prnt_flg_META = createCommonMeta($immd_pick_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta immd_ship_inst_prnt_flg_META = createCommonMeta($immd_ship_inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta immd_dlv_prnt_flg_META = createCommonMeta($immd_dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta immd_ship_adv_prnt_flg_META = createCommonMeta($immd_ship_adv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pick_prnt_flg_META = createCommonMeta($pick_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_inst_prnt_flg_META = createCommonMeta($ship_inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_prnt_flg_META = createCommonMeta($dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_adv_prnt_flg_META = createCommonMeta($ship_adv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta ship_inst_upd_cntr_META = createCommonMeta($ship_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta dlv_prnt_btn_flg_META = createCommonMeta($dlv_prnt_btn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_prnt_btn_flg_META = createCommonMeta($inst_prnt_btn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pick_prnt_btn_flg_META = createCommonMeta($pick_prnt_btn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adv_prnt_btn_flg_META = createCommonMeta($adv_prnt_btn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta linked_ship_schd_no_META = createCommonMeta($linked_ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta non_dlv_prnt_flg_META = createCommonMeta($non_dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_adv_prnt_flg_META = createCommonMeta($non_adv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ship_fr_lg_grp_cd_META,
			ship_fr_lg_grp_nm_META,
			ship_inst_no_META,
			ship_inst_rev_META,
			latest_flg_META,
			can_flg_META,
			iv_no_META,
			ship_inst_ymd_hm_p_META,
			ship_schd_ymd_hm_p_META,
			ship_schd_time_META,
			dlv_schd_ymd_hm_p_META,
			ship_to_id_typ_META,
			ship_to_id_typ_nm_META,
			ship_to_id_cd_META,
			ship_to_id_nm_META,
			ship_to_addr_p_META,
			ship_to_sundry_flg_META,
			inst_usr_dpt_p_META,
			lot_chk_off_flg_META,
			ship_term_cd_META,
			ship_term_nm_META,
			ship_wk_grp_cd_META,
			ship_wk_grp_nm_META,
			ship_wk_cd_META,
			ship_wk_nm_META,
			ship_wt_META,
			ship_dim_META,
			intr_rmrks_META,
			inst_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			immd_pick_prnt_flg_META,
			immd_ship_inst_prnt_flg_META,
			immd_dlv_prnt_flg_META,
			immd_ship_adv_prnt_flg_META,
			pick_prnt_flg_META,
			ship_inst_prnt_flg_META,
			dlv_prnt_flg_META,
			ship_adv_prnt_flg_META,
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
			ship_inst_upd_cntr_META,
			dlv_prnt_btn_flg_META,
			inst_prnt_btn_flg_META,
			pick_prnt_btn_flg_META,
			adv_prnt_btn_flg_META,
			linked_ship_schd_no_META,
			non_dlv_prnt_flg_META,
			non_adv_prnt_flg_META
		},
		new String[][]{
			{
				"ship_inst_dt",
				"ship_inst_hm",
				"ship_schd_dt",
				"ship_schd_hm",
				"dlv_schd_dt",
				"dlv_schd_hm",
				"ship_to_lg_grp_cd",
				"ship_to_lg_grp_nm",
				"ship_to_cntry_cd",
				"ship_to_cntry_nm",
				"ship_to_zip_cd",
				"ship_to_addr1",
				"ship_to_addr2",
				"ship_to_addr3",
				"ship_to_addr4",
				"ship_to_cntct_dpt",
				"ship_to_cntct_psn",
				"ship_to_tel",
				"ship_to_fax",
				"inst_usr_cd",
				"inst_usr_nm",
				"inst_dpt_cd",
				"inst_dpt_nm"
			},
			{
				$ship_inst_dt,
				$ship_inst_hm,
				$ship_schd_dt,
				$ship_schd_hm,
				$dlv_schd_dt,
				$dlv_schd_hm,
				$ship_to_lg_grp_cd,
				$ship_to_lg_grp_nm,
				$ship_to_cntry_cd,
				$ship_to_cntry_nm,
				$ship_to_zip_cd,
				$ship_to_addr1,
				$ship_to_addr2,
				$ship_to_addr3,
				$ship_to_addr4,
				$ship_to_cntct_dpt,
				$ship_to_cntct_psn,
				$ship_to_tel,
				$ship_to_fax,
				$inst_usr_cd,
				$inst_usr_nm,
				$inst_dpt_cd,
				$inst_dpt_nm
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
				{$inst_usr_dpt_p + ".dpt_cd", "dpt_nm"},	// inst_usr_dpt_p.dpt_cd
				{$ship_term_cd, "ship_term_nm;ship_wk_grp_cd;ship_wk_grp_nm"},	// ship_term_cd
				{$ship_wk_cd, "ship_wk_nm"}	// ship_wk_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$inst_usr_dpt_p + ".dpt_cd", "inst_usr_cd;ship_inst_dt;MAC_DPT_IS_SRCH_TYP.SHIP"},	// inst_usr_dpt_p.dpt_cd
				{$ship_term_cd, "ship_fr_lg_grp_cd;ship_to_lg_grp_cd"},	// ship_term_cd
				{$ship_wk_cd, "ship_wk_grp_cd;ship_schd_time"}	// ship_wk_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$inst_usr_dpt_p + ".dpt_cd", "usr_cd;dt;dpt_is_srch_typ"},	// inst_usr_dpt_p.dpt_cd
				{$ship_term_cd, "fr_lg_grp_cd;to_lg_grp_cd"},	// ship_term_cd
				{$ship_wk_cd, "ship_wk_grp_cd;ship_schd_time"}	// ship_wk_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$ship_fr_lg_grp_cd, "LG_GRP"},	// ship_fr_lg_grp_cd
				{$ship_fr_lg_grp_nm, "LG_GRP"}	// ship_fr_lg_grp_nm
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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 0, $ship_fr_lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 0, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String ship_fr_lg_grp_nm() {
		return getConstString(offset + 1, $ship_fr_lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void ship_fr_lg_grp_nm(String value) {
		setConstString(offset + 1, $ship_fr_lg_grp_nm, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 2, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 2, $ship_inst_no, value);
	}


	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public MCNumber ship_inst_rev() {
		return getConstNumber(offset + 3, $ship_inst_rev);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void ship_inst_rev(MCNumber value) {
		setConstNumber(offset + 3, $ship_inst_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void ship_inst_rev(int value) {
		setConstNumber(offset + 3, $ship_inst_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void ship_inst_rev(long value) {
		setConstNumber(offset + 3, $ship_inst_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void ship_inst_rev(float value) {
		setConstNumber(offset + 3, $ship_inst_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void ship_inst_rev(double value) {
		setConstNumber(offset + 3, $ship_inst_rev, value);
	}


	/**
	 * Latest 最新.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 4, $latest_flg);
	}

	/**
	 * Latest 最新.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 4, $latest_flg, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 5, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 5, $can_flg, value);
	}


	/**
	 * I/V No. Ｉ／ＶＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 6, $iv_no);
	}

	/**
	 * I/V No. Ｉ／ＶＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 6, $iv_no, value);
	}


	public mcframe.clientMAUB.MAUBP0110.YmdHmR ship_inst_ymd_hm_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 7, $ship_inst_ymd_hm_p);
	}
	
	public void ship_inst_ymd_hm_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 7, $ship_inst_ymd_hm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0110.YmdHmR ship_schd_ymd_hm_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 8, $ship_schd_ymd_hm_p);
	}
	
	public void ship_schd_ymd_hm_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 8, $ship_schd_ymd_hm_p, row);
	}


	/**
	 * Shipping schedule time 出荷予定時間.<p>
	 *
	 */
	public String ship_schd_time() {
		return getConstString(offset + 9, $ship_schd_time);
	}

	/**
	 * Shipping schedule time 出荷予定時間.<p>
	 *
	 */
	public void ship_schd_time(String value) {
		setConstString(offset + 9, $ship_schd_time, value);
	}


	public mcframe.clientMAUB.MAUBP0110.YmdHmR dlv_schd_ymd_hm_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 10, $dlv_schd_ymd_hm_p);
	}
	
	public void dlv_schd_ymd_hm_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 10, $dlv_schd_ymd_hm_p, row);
	}


	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 11, $ship_to_id_typ);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 11, $ship_to_id_typ, value);
	}


	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public String ship_to_id_typ_nm() {
		return getConstString(offset + 12, $ship_to_id_typ_nm);
	}

	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public void ship_to_id_typ_nm(String value) {
		setConstString(offset + 12, $ship_to_id_typ_nm, value);
	}


	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 13, $ship_to_id_cd);
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 13, $ship_to_id_cd, value);
	}


	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 14, $ship_to_id_nm);
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 14, $ship_to_id_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0410.AddrR ship_to_addr_p(){
		return (mcframe.clientMAUB.MAUBP0410.AddrR) getConstInnerRow(offset + 15, $ship_to_addr_p);
	}
	
	public void ship_to_addr_p(mcframe.clientMAUB.MAUBP0410.AddrR row){
		setConstInnerRow(offset + 15, $ship_to_addr_p, row);
	}


	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return getConstBoolean(offset + 16, $ship_to_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 16, $ship_to_sundry_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR inst_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 17, $inst_usr_dpt_p);
	}
	
	public void inst_usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 17, $inst_usr_dpt_p, row);
	}


	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public boolean lot_chk_off_flg() {
		return getConstBoolean(offset + 18, $lot_chk_off_flg);
	}

	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public void lot_chk_off_flg(boolean value) {
		setConstBoolean(offset + 18, $lot_chk_off_flg, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 19, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 19, $ship_term_cd, value);
	}


	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public String ship_term_nm() {
		return getConstString(offset + 20, $ship_term_nm);
	}

	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public void ship_term_nm(String value) {
		setConstString(offset + 20, $ship_term_nm, value);
	}


	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public String ship_wk_grp_cd() {
		return getConstString(offset + 21, $ship_wk_grp_cd);
	}

	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public void ship_wk_grp_cd(String value) {
		setConstString(offset + 21, $ship_wk_grp_cd, value);
	}


	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public String ship_wk_grp_nm() {
		return getConstString(offset + 22, $ship_wk_grp_nm);
	}

	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public void ship_wk_grp_nm(String value) {
		setConstString(offset + 22, $ship_wk_grp_nm, value);
	}


	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 23, $ship_wk_cd);
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 23, $ship_wk_cd, value);
	}


	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public String ship_wk_nm() {
		return getConstString(offset + 24, $ship_wk_nm);
	}

	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public void ship_wk_nm(String value) {
		setConstString(offset + 24, $ship_wk_nm, value);
	}


	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCNumber ship_wt() {
		return getConstNumber(offset + 25, $ship_wt);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(MCNumber value) {
		setConstNumber(offset + 25, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(int value) {
		setConstNumber(offset + 25, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(long value) {
		setConstNumber(offset + 25, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(float value) {
		setConstNumber(offset + 25, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(double value) {
		setConstNumber(offset + 25, $ship_wt, value);
	}


	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCNumber ship_dim() {
		return getConstNumber(offset + 26, $ship_dim);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(MCNumber value) {
		setConstNumber(offset + 26, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(int value) {
		setConstNumber(offset + 26, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(long value) {
		setConstNumber(offset + 26, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(float value) {
		setConstNumber(offset + 26, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(double value) {
		setConstNumber(offset + 26, $ship_dim, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 27, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 27, $intr_rmrks, value);
	}


	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public String inst_rmrks() {
		return getConstString(offset + 28, $inst_rmrks);
	}

	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public void inst_rmrks(String value) {
		setConstString(offset + 28, $inst_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 29, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 29, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 30, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 30, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 31, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 31, $sub_char3, value);
	}


	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public boolean immd_pick_prnt_flg() {
		return getConstBoolean(offset + 32, $immd_pick_prnt_flg);
	}

	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public void immd_pick_prnt_flg(boolean value) {
		setConstBoolean(offset + 32, $immd_pick_prnt_flg, value);
	}


	/**
	 * Shipping order sheet immediate issue 出荷指図書即時発行.<p>
	 *
	 */
	public boolean immd_ship_inst_prnt_flg() {
		return getConstBoolean(offset + 33, $immd_ship_inst_prnt_flg);
	}

	/**
	 * Shipping order sheet immediate issue 出荷指図書即時発行.<p>
	 *
	 */
	public void immd_ship_inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 33, $immd_ship_inst_prnt_flg, value);
	}


	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public boolean immd_dlv_prnt_flg() {
		return getConstBoolean(offset + 34, $immd_dlv_prnt_flg);
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public void immd_dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 34, $immd_dlv_prnt_flg, value);
	}


	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public boolean immd_ship_adv_prnt_flg() {
		return getConstBoolean(offset + 35, $immd_ship_adv_prnt_flg);
	}

	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public void immd_ship_adv_prnt_flg(boolean value) {
		setConstBoolean(offset + 35, $immd_ship_adv_prnt_flg, value);
	}


	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public boolean pick_prnt_flg() {
		return getConstBoolean(offset + 36, $pick_prnt_flg);
	}

	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public void pick_prnt_flg(boolean value) {
		setConstBoolean(offset + 36, $pick_prnt_flg, value);
	}


	/**
	 * Shipping order sheet issued 出荷指図書発行済.<p>
	 *
	 */
	public boolean ship_inst_prnt_flg() {
		return getConstBoolean(offset + 37, $ship_inst_prnt_flg);
	}

	/**
	 * Shipping order sheet issued 出荷指図書発行済.<p>
	 *
	 */
	public void ship_inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 37, $ship_inst_prnt_flg, value);
	}


	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public boolean dlv_prnt_flg() {
		return getConstBoolean(offset + 38, $dlv_prnt_flg);
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public void dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 38, $dlv_prnt_flg, value);
	}


	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public boolean ship_adv_prnt_flg() {
		return getConstBoolean(offset + 39, $ship_adv_prnt_flg);
	}

	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public void ship_adv_prnt_flg(boolean value) {
		setConstBoolean(offset + 39, $ship_adv_prnt_flg, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 40, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 40, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 41, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 41, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 42, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 42, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 43, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 43, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 44, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 44, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 45, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 45, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 46, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 46, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 47, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 47, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 48, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 48, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 49, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 49, $upd_ts, value);
	}


	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 50, $upd_srv_req_no);
	}

	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 50, $upd_srv_req_no, value);
	}


	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_inst_upd_cntr() {
		return getConstNumber(offset + 51, $ship_inst_upd_cntr);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 51, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(int value) {
		setConstNumber(offset + 51, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(long value) {
		setConstNumber(offset + 51, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(float value) {
		setConstNumber(offset + 51, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(double value) {
		setConstNumber(offset + 51, $ship_inst_upd_cntr, value);
	}


	/**
	 * Issue delivery slip 納品伝票発行.<p>
	 *
	 */
	public boolean dlv_prnt_btn_flg() {
		return getConstBoolean(offset + 52, $dlv_prnt_btn_flg);
	}

	/**
	 * Issue delivery slip 納品伝票発行.<p>
	 *
	 */
	public void dlv_prnt_btn_flg(boolean value) {
		setConstBoolean(offset + 52, $dlv_prnt_btn_flg, value);
	}


	/**
	 * Issue order sheet 指図書発行.<p>
	 *
	 */
	public boolean inst_prnt_btn_flg() {
		return getConstBoolean(offset + 53, $inst_prnt_btn_flg);
	}

	/**
	 * Issue order sheet 指図書発行.<p>
	 *
	 */
	public void inst_prnt_btn_flg(boolean value) {
		setConstBoolean(offset + 53, $inst_prnt_btn_flg, value);
	}


	/**
	 * Issue picking ピッキング発行.<p>
	 *
	 */
	public boolean pick_prnt_btn_flg() {
		return getConstBoolean(offset + 54, $pick_prnt_btn_flg);
	}

	/**
	 * Issue picking ピッキング発行.<p>
	 *
	 */
	public void pick_prnt_btn_flg(boolean value) {
		setConstBoolean(offset + 54, $pick_prnt_btn_flg, value);
	}


	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public boolean adv_prnt_btn_flg() {
		return getConstBoolean(offset + 55, $adv_prnt_btn_flg);
	}

	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public void adv_prnt_btn_flg(boolean value) {
		setConstBoolean(offset + 55, $adv_prnt_btn_flg, value);
	}


	/**
	 * Consolidated shipping schedule No. 連結出荷予定ＮＯ.<p>
	 *
	 */
	public String linked_ship_schd_no() {
		return getConstString(offset + 56, $linked_ship_schd_no);
	}

	/**
	 * Consolidated shipping schedule No. 連結出荷予定ＮＯ.<p>
	 *
	 */
	public void linked_ship_schd_no(String value) {
		setConstString(offset + 56, $linked_ship_schd_no, value);
	}


	/**
	 * Do not allow delivery note issue 納品書発行不可.<p>
	 *
	 */
	public boolean non_dlv_prnt_flg() {
		return getConstBoolean(offset + 57, $non_dlv_prnt_flg);
	}

	/**
	 * Do not allow delivery note issue 納品書発行不可.<p>
	 *
	 */
	public void non_dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 57, $non_dlv_prnt_flg, value);
	}


	/**
	 * Do not allow shipping guide issue 出荷案内書発行不可.<p>
	 *
	 */
	public boolean non_adv_prnt_flg() {
		return getConstBoolean(offset + 58, $non_adv_prnt_flg);
	}

	/**
	 * Do not allow shipping guide issue 出荷案内書発行不可.<p>
	 *
	 */
	public void non_adv_prnt_flg(boolean value) {
		setConstBoolean(offset + 58, $non_adv_prnt_flg, value);
	}


	public String getString(String name) {
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($ship_schd_time.equalsIgnoreCase(name)) {
			return ship_schd_time();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			return ship_wk_grp_cd();
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			return ship_wk_grp_nm();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
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
		if ($linked_ship_schd_no.equalsIgnoreCase(name)) {
			return linked_ship_schd_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			return ship_inst_rev();
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			return ship_wt();
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			return ship_dim();
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			return ship_inst_upd_cntr();
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
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			return lot_chk_off_flg();
		}
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			return immd_pick_prnt_flg();
		}
		if ($immd_ship_inst_prnt_flg.equalsIgnoreCase(name)) {
			return immd_ship_inst_prnt_flg();
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return immd_dlv_prnt_flg();
		}
		if ($immd_ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			return immd_ship_adv_prnt_flg();
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			return pick_prnt_flg();
		}
		if ($ship_inst_prnt_flg.equalsIgnoreCase(name)) {
			return ship_inst_prnt_flg();
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_flg();
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnt_flg();
		}
		if ($dlv_prnt_btn_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_btn_flg();
		}
		if ($inst_prnt_btn_flg.equalsIgnoreCase(name)) {
			return inst_prnt_btn_flg();
		}
		if ($pick_prnt_btn_flg.equalsIgnoreCase(name)) {
			return pick_prnt_btn_flg();
		}
		if ($adv_prnt_btn_flg.equalsIgnoreCase(name)) {
			return adv_prnt_btn_flg();
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return non_dlv_prnt_flg();
		}
		if ($non_adv_prnt_flg.equalsIgnoreCase(name)) {
			return non_adv_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($ship_schd_time.equalsIgnoreCase(name)) {
			return ship_schd_time();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			return ship_wk_grp_cd();
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			return ship_wk_grp_nm();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
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
		if ($linked_ship_schd_no.equalsIgnoreCase(name)) {
			return linked_ship_schd_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			return ship_inst_rev();
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			return ship_wt();
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			return ship_dim();
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			return ship_inst_upd_cntr();
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
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			return lot_chk_off_flg();
		}
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			return immd_pick_prnt_flg();
		}
		if ($immd_ship_inst_prnt_flg.equalsIgnoreCase(name)) {
			return immd_ship_inst_prnt_flg();
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return immd_dlv_prnt_flg();
		}
		if ($immd_ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			return immd_ship_adv_prnt_flg();
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			return pick_prnt_flg();
		}
		if ($ship_inst_prnt_flg.equalsIgnoreCase(name)) {
			return ship_inst_prnt_flg();
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_flg();
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnt_flg();
		}
		if ($dlv_prnt_btn_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_btn_flg();
		}
		if ($inst_prnt_btn_flg.equalsIgnoreCase(name)) {
			return inst_prnt_btn_flg();
		}
		if ($pick_prnt_btn_flg.equalsIgnoreCase(name)) {
			return pick_prnt_btn_flg();
		}
		if ($adv_prnt_btn_flg.equalsIgnoreCase(name)) {
			return adv_prnt_btn_flg();
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return non_dlv_prnt_flg();
		}
		if ($non_adv_prnt_flg.equalsIgnoreCase(name)) {
			return non_adv_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($ship_schd_time.equalsIgnoreCase(name)) {
			ship_schd_time(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
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
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			ship_wk_grp_cd(value);
			return;
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			ship_wk_grp_nm(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
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
		if ($linked_ship_schd_no.equalsIgnoreCase(name)) {
			linked_ship_schd_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
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
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			lot_chk_off_flg(value);
			return;
		}
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			immd_pick_prnt_flg(value);
			return;
		}
		if ($immd_ship_inst_prnt_flg.equalsIgnoreCase(name)) {
			immd_ship_inst_prnt_flg(value);
			return;
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			immd_dlv_prnt_flg(value);
			return;
		}
		if ($immd_ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			immd_ship_adv_prnt_flg(value);
			return;
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			pick_prnt_flg(value);
			return;
		}
		if ($ship_inst_prnt_flg.equalsIgnoreCase(name)) {
			ship_inst_prnt_flg(value);
			return;
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			dlv_prnt_flg(value);
			return;
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			ship_adv_prnt_flg(value);
			return;
		}
		if ($dlv_prnt_btn_flg.equalsIgnoreCase(name)) {
			dlv_prnt_btn_flg(value);
			return;
		}
		if ($inst_prnt_btn_flg.equalsIgnoreCase(name)) {
			inst_prnt_btn_flg(value);
			return;
		}
		if ($pick_prnt_btn_flg.equalsIgnoreCase(name)) {
			pick_prnt_btn_flg(value);
			return;
		}
		if ($adv_prnt_btn_flg.equalsIgnoreCase(name)) {
			adv_prnt_btn_flg(value);
			return;
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			non_dlv_prnt_flg(value);
			return;
		}
		if ($non_adv_prnt_flg.equalsIgnoreCase(name)) {
			non_adv_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($ship_schd_time.equalsIgnoreCase(name)) {
			ship_schd_time(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
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
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			ship_wk_grp_cd(value);
			return;
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			ship_wk_grp_nm(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
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
		if ($linked_ship_schd_no.equalsIgnoreCase(name)) {
			linked_ship_schd_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ship_inst_rev.equalsIgnoreCase(name)) {
			ship_inst_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
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
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			lot_chk_off_flg(value);
			return;
		}
		if ($immd_pick_prnt_flg.equalsIgnoreCase(name)) {
			immd_pick_prnt_flg(value);
			return;
		}
		if ($immd_ship_inst_prnt_flg.equalsIgnoreCase(name)) {
			immd_ship_inst_prnt_flg(value);
			return;
		}
		if ($immd_dlv_prnt_flg.equalsIgnoreCase(name)) {
			immd_dlv_prnt_flg(value);
			return;
		}
		if ($immd_ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			immd_ship_adv_prnt_flg(value);
			return;
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			pick_prnt_flg(value);
			return;
		}
		if ($ship_inst_prnt_flg.equalsIgnoreCase(name)) {
			ship_inst_prnt_flg(value);
			return;
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			dlv_prnt_flg(value);
			return;
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			ship_adv_prnt_flg(value);
			return;
		}
		if ($dlv_prnt_btn_flg.equalsIgnoreCase(name)) {
			dlv_prnt_btn_flg(value);
			return;
		}
		if ($inst_prnt_btn_flg.equalsIgnoreCase(name)) {
			inst_prnt_btn_flg(value);
			return;
		}
		if ($pick_prnt_btn_flg.equalsIgnoreCase(name)) {
			pick_prnt_btn_flg(value);
			return;
		}
		if ($adv_prnt_btn_flg.equalsIgnoreCase(name)) {
			adv_prnt_btn_flg(value);
			return;
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			non_dlv_prnt_flg(value);
			return;
		}
		if ($non_adv_prnt_flg.equalsIgnoreCase(name)) {
			non_adv_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ship_inst_ymd_hm_p.equalsIgnoreCase(name)) {
			return ship_inst_ymd_hm_p();
		}
		if ($ship_schd_ymd_hm_p.equalsIgnoreCase(name)) {
			return ship_schd_ymd_hm_p();
		}
		if ($dlv_schd_ymd_hm_p.equalsIgnoreCase(name)) {
			return dlv_schd_ymd_hm_p();
		}
		if ($ship_to_addr_p.equalsIgnoreCase(name)) {
			return ship_to_addr_p();
		}
		if ($inst_usr_dpt_p.equalsIgnoreCase(name)) {
			return inst_usr_dpt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ship_inst_ymd_hm_p.equalsIgnoreCase(name)) {
			ship_inst_ymd_hm_p(
				((MCContainerMeta) ship_inst_ymd_hm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($ship_schd_ymd_hm_p.equalsIgnoreCase(name)) {
			ship_schd_ymd_hm_p(
				((MCContainerMeta) ship_schd_ymd_hm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($dlv_schd_ymd_hm_p.equalsIgnoreCase(name)) {
			dlv_schd_ymd_hm_p(
				((MCContainerMeta) dlv_schd_ymd_hm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($ship_to_addr_p.equalsIgnoreCase(name)) {
			ship_to_addr_p(
				((MCContainerMeta) ship_to_addr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0410.AddrR.class, value)
			);
			return;
		}
		if ($inst_usr_dpt_p.equalsIgnoreCase(name)) {
			inst_usr_dpt_p(
				((MCContainerMeta) inst_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Shipping order date 出荷指図日.<p>
	 *
	 */
	public MCDate ship_inst_dt() {
		return ship_inst_ymd_hm_p().ymd();
	}

	/**
	 * Shipping order date 出荷指図日.<p>
	 *
	 */
	public void ship_inst_dt(MCDate value) {
		ship_inst_ymd_hm_p().ymd(value);
	}

	/**
	 * Shipping order time 出荷指図時刻.<p>
	 *
	 */
	public MCDate ship_inst_hm() {
		return ship_inst_ymd_hm_p().hm();
	}

	/**
	 * Shipping order time 出荷指図時刻.<p>
	 *
	 */
	public void ship_inst_hm(MCDate value) {
		ship_inst_ymd_hm_p().hm(value);
	}

	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCDate ship_schd_dt() {
		return ship_schd_ymd_hm_p().ymd();
	}

	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public void ship_schd_dt(MCDate value) {
		ship_schd_ymd_hm_p().ymd(value);
	}

	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCDate ship_schd_hm() {
		return ship_schd_ymd_hm_p().hm();
	}

	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public void ship_schd_hm(MCDate value) {
		ship_schd_ymd_hm_p().hm(value);
	}

	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public MCDate dlv_schd_dt() {
		return dlv_schd_ymd_hm_p().ymd();
	}

	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public void dlv_schd_dt(MCDate value) {
		dlv_schd_ymd_hm_p().ymd(value);
	}

	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public MCDate dlv_schd_hm() {
		return dlv_schd_ymd_hm_p().hm();
	}

	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public void dlv_schd_hm(MCDate value) {
		dlv_schd_ymd_hm_p().hm(value);
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public String ship_to_lg_grp_cd() {
		return ship_to_addr_p().lg_grp_cd();
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public void ship_to_lg_grp_cd(String value) {
		ship_to_addr_p().lg_grp_cd(value);
	}

	/**
	 * Receiving point distribution group name 出荷先物流グループ名.<p>
	 *
	 */
	public String ship_to_lg_grp_nm() {
		return ship_to_addr_p().lg_grp_nm();
	}

	/**
	 * Receiving point distribution group name 出荷先物流グループ名.<p>
	 *
	 */
	public void ship_to_lg_grp_nm(String value) {
		ship_to_addr_p().lg_grp_nm(value);
	}

	public String ship_to_cntry_cd() {
		return ship_to_addr_p().cntry_cd();
	}

	public void ship_to_cntry_cd(String value) {
		ship_to_addr_p().cntry_cd(value);
	}

	public String ship_to_cntry_nm() {
		return ship_to_addr_p().cntry_nm();
	}

	public void ship_to_cntry_nm(String value) {
		ship_to_addr_p().cntry_nm(value);
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return ship_to_addr_p().zip_cd();
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		ship_to_addr_p().zip_cd(value);
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public String ship_to_addr1() {
		return ship_to_addr_p().addr1();
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		ship_to_addr_p().addr1(value);
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public String ship_to_addr2() {
		return ship_to_addr_p().addr2();
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		ship_to_addr_p().addr2(value);
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public String ship_to_addr3() {
		return ship_to_addr_p().addr3();
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		ship_to_addr_p().addr3(value);
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public String ship_to_addr4() {
		return ship_to_addr_p().addr4();
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		ship_to_addr_p().addr4(value);
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return ship_to_addr_p().cntct_dpt();
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		ship_to_addr_p().cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return ship_to_addr_p().cntct_psn();
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		ship_to_addr_p().cntct_psn(value);
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public String ship_to_tel() {
		return ship_to_addr_p().tel();
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		ship_to_addr_p().tel(value);
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public String ship_to_fax() {
		return ship_to_addr_p().fax();
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		ship_to_addr_p().fax(value);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return inst_usr_dpt_p().usr_cd();
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		inst_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return inst_usr_dpt_p().usr_nm();
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		inst_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return inst_usr_dpt_p().dpt_cd();
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		inst_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return inst_usr_dpt_p().dpt_nm();
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		inst_usr_dpt_p().dpt_nm(value);
	}

}

