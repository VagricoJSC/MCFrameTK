package mcframe.serverMSBB.MSBBL1230;

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
 * ブロック"Upd01_Ship_Schd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd01_Ship_SchdR_MC_A extends MCConstRow {

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_no = "dlv_inst_rcpt_no";
	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public static final String $slo_prms_no = "slo_prms_no";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Re-shipment 再出荷.<p>
	 *
	 */
	public static final String $re_ship_schd_flg = "re_ship_schd_flg";
	/**
	 * Desired shipping date and time 出荷希望日時.<p>
	 *
	 */
	public static final String $ship_rqst_tm = "ship_rqst_tm";
	/**
	 * Delivery request date and time 納品依頼日時.<p>
	 *
	 */
	public static final String $pd_inst_dlv_tm = "pd_inst_dlv_tm";
	/**
	 * Not auto-calculate 自動計算しない.<p>
	 *
	 */
	public static final String $not_dt_calc_flg = "not_dt_calc_flg";
	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public static final String $ship_schd_tm = "ship_schd_tm";
	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public static final String $dlv_schd_tm = "dlv_schd_tm";
	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public static final String $ship_schd_dt = "ship_schd_dt";
	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public static final String $ship_schd_hm = "ship_schd_hm";
	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public static final String $dlv_schd_dt = "dlv_schd_dt";
	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public static final String $dlv_schd_hm = "dlv_schd_hm";
	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public static final String $ship_block_flg = "ship_block_flg";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
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
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Cancel remaining before change 変更前打切.<p>
	 *
	 */
	public static final String $org_abort_flg = "org_abort_flg";
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * Shipping distribution group WG cd. 出荷物流グループワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_wg_cd = "ship_fr_lg_grp_wg_cd";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public static final String $ship_cnt_rmrks = "ship_cnt_rmrks";
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_d_no = "sls_act_d_no";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public static final String $dlv_cntct_dpt = "dlv_cntct_dpt";
	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public static final String $dlv_cntct_psn = "dlv_cntct_psn";
	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public static final String $dlv_zip_cd = "dlv_zip_cd";
	/**
	 * Address 1 (Delivery destination) 納品先住所1.<p>
	 *
	 */
	public static final String $dlv_addr1 = "dlv_addr1";
	/**
	 * Address 2 (Delivery destination) 納品先住所2.<p>
	 *
	 */
	public static final String $dlv_addr2 = "dlv_addr2";
	/**
	 * Address 3 (Delivery destination) 納品先住所3.<p>
	 *
	 */
	public static final String $dlv_addr3 = "dlv_addr3";
	/**
	 * Address 4 (Delivery destination) 納品先住所4.<p>
	 *
	 */
	public static final String $dlv_addr4 = "dlv_addr4";
	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public static final String $dlv_tel = "dlv_tel";
	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public static final String $dlv_fax = "dlv_fax";
	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public static final String $dlv_lg_grp_cd = "dlv_lg_grp_cd";
	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cntry_cd = "dlv_cntry_cd";
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public static final String $tdlv_sundry_flg = "tdlv_sundry_flg";
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public static final String $tdlv_cntct_dpt = "tdlv_cntct_dpt";
	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public static final String $tdlv_cntct_psn = "tdlv_cntct_psn";
	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public static final String $tdlv_zip_cd = "tdlv_zip_cd";
	/**
	 * Receiving point address 1 配送先住所1.<p>
	 *
	 */
	public static final String $tdlv_addr1 = "tdlv_addr1";
	/**
	 * Receiving point address 2 配送先住所2.<p>
	 *
	 */
	public static final String $tdlv_addr2 = "tdlv_addr2";
	/**
	 * Receiving point address 3 配送先住所3.<p>
	 *
	 */
	public static final String $tdlv_addr3 = "tdlv_addr3";
	/**
	 * Receiving point address 4 配送先住所4.<p>
	 *
	 */
	public static final String $tdlv_addr4 = "tdlv_addr4";
	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public static final String $tdlv_tel = "tdlv_tel";
	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public static final String $tdlv_fax = "tdlv_fax";
	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public static final String $tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public static final String $dlv_day_week_typ = "dlv_day_week_typ";
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
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Order promising row index 納期回答行インデックス.<p>
	 *
	 */
	public static final String $slo_prms_index = "slo_prms_index";
	/**
	 * Parameter row index パラメータ行インデックス.<p>
	 *
	 */
	public static final String $param_row_index = "param_row_index";
	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public static final String $valid_dt_fr = "valid_dt_fr";
	/**
	 * Expiration date (Lower limit) copy group 有効期限（下限）継承グループ.<p>
	 *
	 */
	public static final String $valid_dt_fr_grp = "valid_dt_fr_grp";
	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public static final String $valid_dt_to = "valid_dt_to";
	/**
	 * Release allocation 引当解除.<p>
	 *
	 */
	public static final String $alloc_rel_flg = "alloc_rel_flg";


	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta dlv_inst_rcpt_no_META = createCommonMeta($dlv_inst_rcpt_no, mcframe.commonMA.meta.MA_META.DLV_INST_RCPT_NO);
	public static final MCMeta slo_prms_no_META = createCommonMeta($slo_prms_no, mcframe.commonMA.meta.MA_META.SLO_PRMS_NO);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_ship_schd_flg_META = createCommonMeta($re_ship_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_rqst_tm_META = createCommonMeta($ship_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta pd_inst_dlv_tm_META = createCommonMeta($pd_inst_dlv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta not_dt_calc_flg_META = createCommonMeta($not_dt_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_schd_tm_META = createCommonMeta($ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_schd_tm_META = createCommonMeta($dlv_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_schd_dt_META = createCommonMeta($ship_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_schd_hm_META = createCommonMeta($ship_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_schd_dt_META = createCommonMeta($dlv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_schd_hm_META = createCommonMeta($dlv_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ship_block_flg_META = createCommonMeta($ship_block_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta ship_wk_nm_META = createCommonMeta($ship_wk_nm, mcframe.commonMA.meta.MA_META.SHIP_WK_NM);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta org_abort_flg_META = createCommonMeta($org_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_fr_lg_grp_wg_cd_META = createCommonMeta($ship_fr_lg_grp_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta ship_cnt_rmrks_META = createCommonMeta($ship_cnt_rmrks, mcframe.commonMS.meta.MS_META.SHIP_CNT_RMRKS);
	public static final MCMeta sls_act_d_no_META = createCommonMeta($sls_act_d_no, mcframe.commonMA.meta.MA_META.SLS_ACT_D_NO);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_lg_grp_cd_META = createCommonMeta($dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_cntry_cd_META = createCommonMeta($dlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_lg_grp_cd_META = createCommonMeta($tdlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_day_week_typ_META = createCommonMeta($dlv_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SHIP_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SHIP_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SHIP_SCHD_SUB_CHAR3);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta slo_prms_index_META = createCommonMeta($slo_prms_index, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta param_row_index_META = createCommonMeta($param_row_index, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta valid_dt_fr_META = createCommonMeta($valid_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta valid_dt_fr_grp_META = createCommonMeta($valid_dt_fr_grp, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta valid_dt_to_META = createCommonMeta($valid_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta alloc_rel_flg_META = createCommonMeta($alloc_rel_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Upd01_Ship_SchdR> constMetas = new ConstMetaList<Upd01_Ship_SchdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			slo_d_no_META,
			data_crud_typ_META,
			ship_schd_no_META,
			ship_pr_no_META,
			dlv_inst_rcpt_no_META,
			slo_prms_no_META,
			trd_unit_cd_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_qty_META,
			fix_flg_META,
			re_ship_schd_flg_META,
			ship_rqst_tm_META,
			pd_inst_dlv_tm_META,
			not_dt_calc_flg_META,
			ship_schd_tm_META,
			dlv_schd_tm_META,
			ship_schd_dt_META,
			ship_schd_hm_META,
			dlv_schd_dt_META,
			dlv_schd_hm_META,
			ship_block_flg_META,
			ship_term_cd_META,
			ship_wk_cd_META,
			ship_wk_nm_META,
			abort_flg_META,
			org_abort_flg_META,
			ship_fr_lg_grp_cd_META,
			ship_fr_lg_grp_wg_cd_META,
			trd_d_rmrks_META,
			ship_cnt_rmrks_META,
			sls_act_d_no_META,
			dlv_cd_META,
			dlv_sundry_flg_META,
			dlv_nm_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_tel_META,
			dlv_fax_META,
			dlv_lg_grp_cd_META,
			dlv_cntry_cd_META,
			pri_prnt_flg_META,
			tdlv_cd_META,
			tdlv_sundry_flg_META,
			tdlv_nm_META,
			via_dlv_typ_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_tel_META,
			tdlv_fax_META,
			tdlv_lg_grp_cd_META,
			dlv_day_week_typ_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			err_flg_META,
			peg_no_META,
			slo_prms_index_META,
			param_row_index_META,
			valid_dt_fr_META,
			valid_dt_fr_grp_META,
			valid_dt_to_META,
			alloc_rel_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$trd_unit_qty, "E"}	// trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$trd_unit_qty, "positive"}	// trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$trd_unit_qty, "0:"}	// trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$ship_schd_tm, "ship_schd_hm:BF"},	// ship_schd_tm
				{$dlv_schd_tm, "ship_schd_hm:AF"}	// dlv_schd_tm
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$ship_term_cd, "MA.MAUAL0010.ShipTerm"},	// ship_term_cd
				{$ship_wk_cd, "MA.MAUAL0010.ShipWk"},	// ship_wk_cd
				{$ship_wk_nm, "MA.MAUAL0010.ShipWk"},	// ship_wk_nm
				{$ship_fr_lg_grp_cd, "MA.MAUAL0010.LgGrpForLoc"},	// ship_fr_lg_grp_cd
				{$dlv_cd, "MA.MAUAL0010.Bp"},	// dlv_cd
				{$dlv_lg_grp_cd, "MA.MAUAL0010.LgGrp"},	// dlv_lg_grp_cd
				{$tdlv_cd, "MA.MAUAL0010.Bp"},	// tdlv_cd
				{$tdlv_lg_grp_cd, "MA.MAUAL0010.LgGrp"}	// tdlv_lg_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$ship_fr_lg_grp_cd, "ship_fr_lg_grp_wg_cd"},	// ship_fr_lg_grp_cd
				{$dlv_cd, "dlv_sundry_flg;dlv_cntry_cd;tdlv_req_flg"},	// dlv_cd
				{$tdlv_cd, "tdlv_sundry_flg"}	// tdlv_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$ship_fr_lg_grp_cd, "wg_cd"},	// ship_fr_lg_grp_cd
				{$dlv_cd, "dlv_sundry_flg;cntry_cd;tdlv_req_flg"},	// dlv_cd
				{$tdlv_cd, "dlv_sundry_flg"}	// tdlv_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dlv_cd, "MAC_BP_IS_SRCH_TYP.DLV"},	// dlv_cd
				{$tdlv_cd, "MAC_BP_IS_SRCH_TYP.TDLV"}	// tdlv_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dlv_cd, "bp_is_srch_typ"},	// dlv_cd
				{$tdlv_cd, "bp_is_srch_typ"}	// tdlv_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$via_dlv_typ, "MAC_VIA_DLV_TYP"},	// via_dlv_typ
				{$dlv_day_week_typ, "MAC_DAY_WEEK_TYP"}	// dlv_day_week_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected Upd01_Ship_SchdR_MC_A(ConstMetaList<? extends Upd01_Ship_SchdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Ship_SchdR clone() {
		return (Upd01_Ship_SchdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Ship_SchdR createInstance() {
		return (Upd01_Ship_SchdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Ship_SchdR getValues(String... names) {
		return (Upd01_Ship_SchdR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 0, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 0, $slo_d_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 2, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 2, $ship_schd_no, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 3, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 3, $ship_pr_no, value);
	}


	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public String dlv_inst_rcpt_no() {
		return getConstString(offset + 4, $dlv_inst_rcpt_no);
	}

	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public void dlv_inst_rcpt_no(String value) {
		setConstString(offset + 4, $dlv_inst_rcpt_no, value);
	}


	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public String slo_prms_no() {
		return getConstString(offset + 5, $slo_prms_no);
	}

	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public void slo_prms_no(String value) {
		setConstString(offset + 5, $slo_prms_no, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 6, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 6, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 7, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 7, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 7, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 7, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 7, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 7, $trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 8, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 8, $base_unit_cd, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 9, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 9, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 9, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 9, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 9, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 9, $base_unit_qty, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 10, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 10, $fix_flg, value);
	}


	/**
	 * Re-shipment 再出荷.<p>
	 *
	 */
	public boolean re_ship_schd_flg() {
		return getConstBoolean(offset + 11, $re_ship_schd_flg);
	}

	/**
	 * Re-shipment 再出荷.<p>
	 *
	 */
	public void re_ship_schd_flg(boolean value) {
		setConstBoolean(offset + 11, $re_ship_schd_flg, value);
	}


	/**
	 * Desired shipping date and time 出荷希望日時.<p>
	 *
	 */
	public MCDate ship_rqst_tm() {
		return getConstDate(offset + 12, $ship_rqst_tm);
	}

	/**
	 * Desired shipping date and time 出荷希望日時.<p>
	 *
	 */
	public void ship_rqst_tm(MCDate value) {
		setConstDate(offset + 12, $ship_rqst_tm, value);
	}


	/**
	 * Delivery request date and time 納品依頼日時.<p>
	 *
	 */
	public MCDate pd_inst_dlv_tm() {
		return getConstDate(offset + 13, $pd_inst_dlv_tm);
	}

	/**
	 * Delivery request date and time 納品依頼日時.<p>
	 *
	 */
	public void pd_inst_dlv_tm(MCDate value) {
		setConstDate(offset + 13, $pd_inst_dlv_tm, value);
	}


	/**
	 * Not auto-calculate 自動計算しない.<p>
	 *
	 */
	public boolean not_dt_calc_flg() {
		return getConstBoolean(offset + 14, $not_dt_calc_flg);
	}

	/**
	 * Not auto-calculate 自動計算しない.<p>
	 *
	 */
	public void not_dt_calc_flg(boolean value) {
		setConstBoolean(offset + 14, $not_dt_calc_flg, value);
	}


	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public MCDate ship_schd_tm() {
		return getConstDate(offset + 15, $ship_schd_tm);
	}

	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public void ship_schd_tm(MCDate value) {
		setConstDate(offset + 15, $ship_schd_tm, value);
	}


	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public MCDate dlv_schd_tm() {
		return getConstDate(offset + 16, $dlv_schd_tm);
	}

	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public void dlv_schd_tm(MCDate value) {
		setConstDate(offset + 16, $dlv_schd_tm, value);
	}


	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCDate ship_schd_dt() {
		return getConstDate(offset + 17, $ship_schd_dt);
	}

	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public void ship_schd_dt(MCDate value) {
		setConstDate(offset + 17, $ship_schd_dt, value);
	}


	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCDate ship_schd_hm() {
		return getConstDate(offset + 18, $ship_schd_hm);
	}

	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public void ship_schd_hm(MCDate value) {
		setConstDate(offset + 18, $ship_schd_hm, value);
	}


	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public MCDate dlv_schd_dt() {
		return getConstDate(offset + 19, $dlv_schd_dt);
	}

	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public void dlv_schd_dt(MCDate value) {
		setConstDate(offset + 19, $dlv_schd_dt, value);
	}


	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public MCDate dlv_schd_hm() {
		return getConstDate(offset + 20, $dlv_schd_hm);
	}

	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public void dlv_schd_hm(MCDate value) {
		setConstDate(offset + 20, $dlv_schd_hm, value);
	}


	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public boolean ship_block_flg() {
		return getConstBoolean(offset + 21, $ship_block_flg);
	}

	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public void ship_block_flg(boolean value) {
		setConstBoolean(offset + 21, $ship_block_flg, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 22, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 22, $ship_term_cd, value);
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
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 25, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 25, $abort_flg, value);
	}


	/**
	 * Cancel remaining before change 変更前打切.<p>
	 *
	 */
	public boolean org_abort_flg() {
		return getConstBoolean(offset + 26, $org_abort_flg);
	}

	/**
	 * Cancel remaining before change 変更前打切.<p>
	 *
	 */
	public void org_abort_flg(boolean value) {
		setConstBoolean(offset + 26, $org_abort_flg, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 27, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 27, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Shipping distribution group WG cd. 出荷物流グループワーキンググループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_wg_cd() {
		return getConstString(offset + 28, $ship_fr_lg_grp_wg_cd);
	}

	/**
	 * Shipping distribution group WG cd. 出荷物流グループワーキンググループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_wg_cd(String value) {
		setConstString(offset + 28, $ship_fr_lg_grp_wg_cd, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 29, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 29, $trd_d_rmrks, value);
	}


	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public String ship_cnt_rmrks() {
		return getConstString(offset + 30, $ship_cnt_rmrks);
	}

	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public void ship_cnt_rmrks(String value) {
		setConstString(offset + 30, $ship_cnt_rmrks, value);
	}


	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public String sls_act_d_no() {
		return getConstString(offset + 31, $sls_act_d_no);
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		setConstString(offset + 31, $sls_act_d_no, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 32, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 32, $dlv_cd, value);
	}


	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 33, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 33, $dlv_sundry_flg, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 34, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 34, $dlv_nm, value);
	}


	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 35, $dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 35, $dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 36, $dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 36, $dlv_cntct_psn, value);
	}


	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 37, $dlv_zip_cd);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 37, $dlv_zip_cd, value);
	}


	/**
	 * Address 1 (Delivery destination) 納品先住所1.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 38, $dlv_addr1);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所1.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 38, $dlv_addr1, value);
	}


	/**
	 * Address 2 (Delivery destination) 納品先住所2.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 39, $dlv_addr2);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所2.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 39, $dlv_addr2, value);
	}


	/**
	 * Address 3 (Delivery destination) 納品先住所3.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 40, $dlv_addr3);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所3.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 40, $dlv_addr3, value);
	}


	/**
	 * Address 4 (Delivery destination) 納品先住所4.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 41, $dlv_addr4);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所4.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 41, $dlv_addr4, value);
	}


	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 42, $dlv_tel);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 42, $dlv_tel, value);
	}


	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 43, $dlv_fax);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 43, $dlv_fax, value);
	}


	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return getConstString(offset + 44, $dlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		setConstString(offset + 44, $dlv_lg_grp_cd, value);
	}


	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return getConstString(offset + 45, $dlv_cntry_cd);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		setConstString(offset + 45, $dlv_cntry_cd, value);
	}


	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 46, $pri_prnt_flg);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 46, $pri_prnt_flg, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 47, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 47, $tdlv_cd, value);
	}


	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 48, $tdlv_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 48, $tdlv_sundry_flg, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 49, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 49, $tdlv_nm, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 50, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 50, $via_dlv_typ, value);
	}


	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 51, $tdlv_cntct_dpt);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 51, $tdlv_cntct_dpt, value);
	}


	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 52, $tdlv_cntct_psn);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 52, $tdlv_cntct_psn, value);
	}


	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 53, $tdlv_zip_cd);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 53, $tdlv_zip_cd, value);
	}


	/**
	 * Receiving point address 1 配送先住所1.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 54, $tdlv_addr1);
	}

	/**
	 * Receiving point address 1 配送先住所1.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 54, $tdlv_addr1, value);
	}


	/**
	 * Receiving point address 2 配送先住所2.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 55, $tdlv_addr2);
	}

	/**
	 * Receiving point address 2 配送先住所2.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 55, $tdlv_addr2, value);
	}


	/**
	 * Receiving point address 3 配送先住所3.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 56, $tdlv_addr3);
	}

	/**
	 * Receiving point address 3 配送先住所3.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 56, $tdlv_addr3, value);
	}


	/**
	 * Receiving point address 4 配送先住所4.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 57, $tdlv_addr4);
	}

	/**
	 * Receiving point address 4 配送先住所4.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 57, $tdlv_addr4, value);
	}


	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 58, $tdlv_tel);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 58, $tdlv_tel, value);
	}


	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 59, $tdlv_fax);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 59, $tdlv_fax, value);
	}


	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public String tdlv_lg_grp_cd() {
		return getConstString(offset + 60, $tdlv_lg_grp_cd);
	}

	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public void tdlv_lg_grp_cd(String value) {
		setConstString(offset + 60, $tdlv_lg_grp_cd, value);
	}


	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public String dlv_day_week_typ() {
		return getConstString(offset + 61, $dlv_day_week_typ);
	}

	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public void dlv_day_week_typ(String value) {
		setConstString(offset + 61, $dlv_day_week_typ, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 62, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 62, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 63, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 63, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 64, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 64, $sub_char3, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 65, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 65, $err_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 66, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 66, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 66, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 66, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 66, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 66, $peg_no, value);
	}


	/**
	 * Order promising row index 納期回答行インデックス.<p>
	 *
	 */
	public MCNumber slo_prms_index() {
		return getConstNumber(offset + 67, $slo_prms_index);
	}

	/**
	 * Order promising row index 納期回答行インデックス.<p>
	 *
	 */
	public void slo_prms_index(MCNumber value) {
		setConstNumber(offset + 67, $slo_prms_index, value);
	}

	/**
	 * Order promising row index 納期回答行インデックス.<p>
	 *
	 */
	public void slo_prms_index(int value) {
		setConstNumber(offset + 67, $slo_prms_index, value);
	}

	/**
	 * Order promising row index 納期回答行インデックス.<p>
	 *
	 */
	public void slo_prms_index(long value) {
		setConstNumber(offset + 67, $slo_prms_index, value);
	}

	/**
	 * Order promising row index 納期回答行インデックス.<p>
	 *
	 */
	public void slo_prms_index(float value) {
		setConstNumber(offset + 67, $slo_prms_index, value);
	}

	/**
	 * Order promising row index 納期回答行インデックス.<p>
	 *
	 */
	public void slo_prms_index(double value) {
		setConstNumber(offset + 67, $slo_prms_index, value);
	}


	/**
	 * Parameter row index パラメータ行インデックス.<p>
	 *
	 */
	public MCNumber param_row_index() {
		return getConstNumber(offset + 68, $param_row_index);
	}

	/**
	 * Parameter row index パラメータ行インデックス.<p>
	 *
	 */
	public void param_row_index(MCNumber value) {
		setConstNumber(offset + 68, $param_row_index, value);
	}

	/**
	 * Parameter row index パラメータ行インデックス.<p>
	 *
	 */
	public void param_row_index(int value) {
		setConstNumber(offset + 68, $param_row_index, value);
	}

	/**
	 * Parameter row index パラメータ行インデックス.<p>
	 *
	 */
	public void param_row_index(long value) {
		setConstNumber(offset + 68, $param_row_index, value);
	}

	/**
	 * Parameter row index パラメータ行インデックス.<p>
	 *
	 */
	public void param_row_index(float value) {
		setConstNumber(offset + 68, $param_row_index, value);
	}

	/**
	 * Parameter row index パラメータ行インデックス.<p>
	 *
	 */
	public void param_row_index(double value) {
		setConstNumber(offset + 68, $param_row_index, value);
	}


	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public MCDate valid_dt_fr() {
		return getConstDate(offset + 69, $valid_dt_fr);
	}

	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public void valid_dt_fr(MCDate value) {
		setConstDate(offset + 69, $valid_dt_fr, value);
	}


	/**
	 * Expiration date (Lower limit) copy group 有効期限（下限）継承グループ.<p>
	 *
	 */
	public MCNumber valid_dt_fr_grp() {
		return getConstNumber(offset + 70, $valid_dt_fr_grp);
	}

	/**
	 * Expiration date (Lower limit) copy group 有効期限（下限）継承グループ.<p>
	 *
	 */
	public void valid_dt_fr_grp(MCNumber value) {
		setConstNumber(offset + 70, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy group 有効期限（下限）継承グループ.<p>
	 *
	 */
	public void valid_dt_fr_grp(int value) {
		setConstNumber(offset + 70, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy group 有効期限（下限）継承グループ.<p>
	 *
	 */
	public void valid_dt_fr_grp(long value) {
		setConstNumber(offset + 70, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy group 有効期限（下限）継承グループ.<p>
	 *
	 */
	public void valid_dt_fr_grp(float value) {
		setConstNumber(offset + 70, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy group 有効期限（下限）継承グループ.<p>
	 *
	 */
	public void valid_dt_fr_grp(double value) {
		setConstNumber(offset + 70, $valid_dt_fr_grp, value);
	}


	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public MCDate valid_dt_to() {
		return getConstDate(offset + 71, $valid_dt_to);
	}

	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public void valid_dt_to(MCDate value) {
		setConstDate(offset + 71, $valid_dt_to, value);
	}


	/**
	 * Release allocation 引当解除.<p>
	 *
	 */
	public boolean alloc_rel_flg() {
		return getConstBoolean(offset + 72, $alloc_rel_flg);
	}

	/**
	 * Release allocation 引当解除.<p>
	 *
	 */
	public void alloc_rel_flg(boolean value) {
		setConstBoolean(offset + 72, $alloc_rel_flg, value);
	}


	public String getString(String name) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_no();
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			return slo_prms_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_wg_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_wg_cd();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			return slo_prms_index();
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			return param_row_index();
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			return valid_dt_fr_grp();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		if ($pd_inst_dlv_tm.equalsIgnoreCase(name)) {
			return pd_inst_dlv_tm();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			return ship_schd_dt();
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			return ship_schd_hm();
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			return dlv_schd_dt();
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			return dlv_schd_hm();
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			return valid_dt_fr();
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			return valid_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($re_ship_schd_flg.equalsIgnoreCase(name)) {
			return re_ship_schd_flg();
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			return not_dt_calc_flg();
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($org_abort_flg.equalsIgnoreCase(name)) {
			return org_abort_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($alloc_rel_flg.equalsIgnoreCase(name)) {
			return alloc_rel_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_no();
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			return slo_prms_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_wg_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_wg_cd();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			return slo_prms_index();
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			return param_row_index();
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			return valid_dt_fr_grp();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		if ($pd_inst_dlv_tm.equalsIgnoreCase(name)) {
			return pd_inst_dlv_tm();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			return ship_schd_dt();
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			return ship_schd_hm();
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			return dlv_schd_dt();
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			return dlv_schd_hm();
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			return valid_dt_fr();
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			return valid_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($re_ship_schd_flg.equalsIgnoreCase(name)) {
			return re_ship_schd_flg();
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			return not_dt_calc_flg();
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($org_abort_flg.equalsIgnoreCase(name)) {
			return org_abort_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($alloc_rel_flg.equalsIgnoreCase(name)) {
			return alloc_rel_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_no(value);
			return;
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			slo_prms_no(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
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
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_wg_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_wg_cd(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
			return;
		}
		if ($pd_inst_dlv_tm.equalsIgnoreCase(name)) {
			pd_inst_dlv_tm(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			ship_schd_dt(value);
			return;
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			ship_schd_hm(value);
			return;
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			dlv_schd_dt(value);
			return;
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			dlv_schd_hm(value);
			return;
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			valid_dt_fr(value);
			return;
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			valid_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($re_ship_schd_flg.equalsIgnoreCase(name)) {
			re_ship_schd_flg(value);
			return;
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			not_dt_calc_flg(value);
			return;
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($org_abort_flg.equalsIgnoreCase(name)) {
			org_abort_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($alloc_rel_flg.equalsIgnoreCase(name)) {
			alloc_rel_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_no(value);
			return;
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			slo_prms_no(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
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
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_wg_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_wg_cd(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
			return;
		}
		if ($pd_inst_dlv_tm.equalsIgnoreCase(name)) {
			pd_inst_dlv_tm(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			ship_schd_dt(value);
			return;
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			ship_schd_hm(value);
			return;
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			dlv_schd_dt(value);
			return;
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			dlv_schd_hm(value);
			return;
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			valid_dt_fr(value);
			return;
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			valid_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($re_ship_schd_flg.equalsIgnoreCase(name)) {
			re_ship_schd_flg(value);
			return;
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			not_dt_calc_flg(value);
			return;
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($org_abort_flg.equalsIgnoreCase(name)) {
			org_abort_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($alloc_rel_flg.equalsIgnoreCase(name)) {
			alloc_rel_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

