package mcframe.serverMSBE.MSBEL2430;

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
 * ブロック"Srch03_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch03_CndR_MC_A extends MCConstRow {

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public static final String $not_inst_flg = "not_inst_flg";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $inst_flg = "inst_flg";
	/**
	 * Partially completed 一部完了.<p>
	 *
	 */
	public static final String $part_comp_flg = "part_comp_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $comp_flg = "comp_flg";
	/**
	 * For WMS ＷＭＳ対象.<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";
	/**
	 * Not for WMS ＷＭＳ対象外.<p>
	 *
	 */
	public static final String $not_wms_flg = "not_wms_flg";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Other accounting transfer schedule No. 他勘定振替予定ＮＯ.<p>
	 *
	 */
	public static final String $acxfr_schd_no = "acxfr_schd_no";
	/**
	 * Other accounting transfer order No. 他勘定振替指図ＮＯ.<p>
	 *
	 */
	public static final String $acxfr_inst_no = "acxfr_inst_no";
	/**
	 * Other accounting transfer order details No. 他勘定振替指図明細ＮＯ.<p>
	 *
	 */
	public static final String $acxfr_inst_d_no = "acxfr_inst_d_no";
	/**
	 * Other accounting transfer result No. 他勘定振替実績ＮＯ.<p>
	 *
	 */
	public static final String $acxfr_act_no = "acxfr_act_no";
	/**
	 * Other accounting transfer result details No. 他勘定振替実績明細ＮＯ.<p>
	 *
	 */
	public static final String $acxfr_act_d_no = "acxfr_act_d_no";
	/**
	 * External other accounting transfer result No. 外部他勘定振替実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_acxfr_act_no = "ext_acxfr_act_no";
	/**
	 * Revision リビジョン.<p>
	 *
	 */
	public static final String $acxfr_rev = "acxfr_rev";
	/**
	 * Latest 最新.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
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
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
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
	 * Location G cd. 場所ＧＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Location G name 場所Ｇ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public static final String $bd_dpt_nm = "bd_dpt_nm";
	/**
	 * Transfer requested date 振替依頼日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $rqst_dt_fr = "rqst_dt_fr";
	/**
	 * Transfer request date TO 振替依頼日ＴＯ.<p>
	 *
	 */
	public static final String $rqst_dt_to = "rqst_dt_to";
	/**
	 * Scheduled transfer date FROM 振替予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $acxfr_schd_dt_fr = "acxfr_schd_dt_fr";
	/**
	 * Scheduled transfer date TO 振替予定日ＴＯ.<p>
	 *
	 */
	public static final String $acxfr_schd_dt_to = "acxfr_schd_dt_to";
	/**
	 * Transfer order date FROM 振替指図日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $acxfr_inst_dt_fr = "acxfr_inst_dt_fr";
	/**
	 * Transfer order date TO 振替指図日ＴＯ.<p>
	 *
	 */
	public static final String $acxfr_inst_dt_to = "acxfr_inst_dt_to";
	/**
	 * Actual transfer date FROM 振替実績日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $acxfr_act_dt_fr = "acxfr_act_dt_fr";
	/**
	 * Actual transfer time FROM 振替実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $acxfr_act_hm_fr = "acxfr_act_hm_fr";
	/**
	 * Actual transfer date TO 振替実績日ＴＯ.<p>
	 *
	 */
	public static final String $acxfr_act_dt_to = "acxfr_act_dt_to";
	/**
	 * Actual transfer time TO 振替実績時刻ＴＯ.<p>
	 *
	 */
	public static final String $acxfr_act_hm_to = "acxfr_act_hm_to";
	/**
	 * Transfer recording date FROM 振替計上日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ac_dt_fr = "ac_dt_fr";
	/**
	 * Transfer recording date TO 振替計上日ＴＯ.<p>
	 *
	 */
	public static final String $ac_dt_to = "ac_dt_to";
	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public static final String $rsn_nm = "rsn_nm";
	/**
	 * Disposal application No. 廃棄申請ＮＯ.<p>
	 *
	 */
	public static final String $dspsl_no = "dspsl_no";
	/**
	 * Include scheduled unapproved 予定未承認含む.<p>
	 *
	 */
	public static final String $schd_no_aprv_flg = "schd_no_aprv_flg";
	/**
	 * Transaction details remarks (Schedule) 取引明細備考（予定）.<p>
	 *
	 */
	public static final String $schd_trd_d_rmrks = "schd_trd_d_rmrks";
	/**
	 * Disposal request remarks (schedule) 廃棄申請備考（予定）.<p>
	 *
	 */
	public static final String $schd_dspsl_rmrks = "schd_dspsl_rmrks";
	/**
	 * Spare 1 (Schedule) 予備１（予定）.<p>
	 *
	 */
	public static final String $schd_sub_char1 = "schd_sub_char1";
	/**
	 * Spare 2 (Schedule) 予備２（予定）.<p>
	 *
	 */
	public static final String $schd_sub_char2 = "schd_sub_char2";
	/**
	 * Spare 3 (Schedule) 予備３（予定）.<p>
	 *
	 */
	public static final String $schd_sub_char3 = "schd_sub_char3";
	/**
	 * Internal remarks (Order header) 内部備考（指図ヘッダ）.<p>
	 *
	 */
	public static final String $inst_intr_rmrks = "inst_intr_rmrks";
	/**
	 * Transaction remarks (Order header) 取引備考（指図ヘッダ）.<p>
	 *
	 */
	public static final String $inst_trd_rmrks = "inst_trd_rmrks";
	/**
	 * Order remarks (Order header) 指図備考（指図ヘッダ）.<p>
	 *
	 */
	public static final String $inst_rmrks = "inst_rmrks";
	/**
	 * Spare 1 (Order header) 予備１（指図ヘッダ）.<p>
	 *
	 */
	public static final String $inst_sub_char1 = "inst_sub_char1";
	/**
	 * Spare 2 (Order header) 予備２（指図ヘッダ）.<p>
	 *
	 */
	public static final String $inst_sub_char2 = "inst_sub_char2";
	/**
	 * Spare 3 (Order header) 予備３（指図ヘッダ）.<p>
	 *
	 */
	public static final String $inst_sub_char3 = "inst_sub_char3";
	/**
	 * Internal details remarks (Order details) 内部明細備考（指図明細）.<p>
	 *
	 */
	public static final String $inst_intr_d_rmrks = "inst_intr_d_rmrks";
	/**
	 * Transaction details remarks (Order details) 取引明細備考（指図明細）.<p>
	 *
	 */
	public static final String $inst_trd_d_rmrks = "inst_trd_d_rmrks";
	/**
	 * Order details remarks (Details) 指図明細備考（指図明細）.<p>
	 *
	 */
	public static final String $inst_d_rmrks = "inst_d_rmrks";
	/**
	 * Spare 1 (Order details) 予備１（指図明細）.<p>
	 *
	 */
	public static final String $inst_d_sub_char1 = "inst_d_sub_char1";
	/**
	 * Spare 2 (Order details) 予備２（指図明細）.<p>
	 *
	 */
	public static final String $inst_d_sub_char2 = "inst_d_sub_char2";
	/**
	 * Spare 3 (Order details) 予備３（指図明細）.<p>
	 *
	 */
	public static final String $inst_d_sub_char3 = "inst_d_sub_char3";
	/**
	 * Internal remarks (Result header) 内部備考（実績ヘッダ）.<p>
	 *
	 */
	public static final String $act_intr_rmrks = "act_intr_rmrks";
	/**
	 * Transaction remarks (Result header) 取引備考（実績ヘッダ）.<p>
	 *
	 */
	public static final String $act_trd_rmrks = "act_trd_rmrks";
	/**
	 * Spare 1 (Result header) 予備１（実績ヘッダ）.<p>
	 *
	 */
	public static final String $act_sub_char1 = "act_sub_char1";
	/**
	 * Spare 2 (Result header) 予備２（実績ヘッダ）.<p>
	 *
	 */
	public static final String $act_sub_char2 = "act_sub_char2";
	/**
	 * Spare 3 (Result header) 予備３（実績ヘッダ）.<p>
	 *
	 */
	public static final String $act_sub_char3 = "act_sub_char3";
	/**
	 * Internal details remarks (Result details) 内部明細備考（実績明細）.<p>
	 *
	 */
	public static final String $act_intr_d_rmrks = "act_intr_d_rmrks";
	/**
	 * Transaction details remarks (Result details) 取引明細備考（実績明細）.<p>
	 *
	 */
	public static final String $act_trd_d_rmrks = "act_trd_d_rmrks";
	/**
	 * Spare 1 (Result details) 予備１（実績明細）.<p>
	 *
	 */
	public static final String $act_d_sub_char1 = "act_d_sub_char1";
	/**
	 * Spare 2 (Result details) 予備２（実績明細）.<p>
	 *
	 */
	public static final String $act_d_sub_char2 = "act_d_sub_char2";
	/**
	 * Spare 3 (Result details) 予備３（実績明細）.<p>
	 *
	 */
	public static final String $act_d_sub_char3 = "act_d_sub_char3";
	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public static final String $itm_grp_flg1 = "itm_grp_flg1";
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public static final String $itm_grp_flg2 = "itm_grp_flg2";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public static final String $itm_grp_flg3 = "itm_grp_flg3";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public static final String $itm_grp_flg4 = "itm_grp_flg4";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public static final String $itm_grp_flg5 = "itm_grp_flg5";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public static final String $itm_grp_flg6 = "itm_grp_flg6";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public static final String $itm_grp_flg7 = "itm_grp_flg7";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public static final String $itm_grp_flg8 = "itm_grp_flg8";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public static final String $itm_grp_flg9 = "itm_grp_flg9";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public static final String $itm_grp_flg10 = "itm_grp_flg10";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public static final String $rqst_usr_cd = "rqst_usr_cd";
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public static final String $rqst_usr_nm = "rqst_usr_nm";
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public static final String $rqst_dpt_cd = "rqst_dpt_cd";
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public static final String $rqst_dpt_nm = "rqst_dpt_nm";
	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public static final String $inst_usr_nm = "inst_usr_nm";
	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public static final String $inst_dpt_nm = "inst_dpt_nm";
	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public static final String $act_usr_nm = "act_usr_nm";
	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public static final String $act_dpt_nm = "act_dpt_nm";
	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta not_inst_flg_META = createCommonMeta($not_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_flg_META = createCommonMeta($inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_comp_flg_META = createCommonMeta($part_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_flg_META = createCommonMeta($comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_wms_flg_META = createCommonMeta($not_wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta acxfr_schd_no_META = createCommonMeta($acxfr_schd_no, mcframe.commonMA.meta.MA_META.ACXFR_SCHD_NO);
	public static final MCMeta acxfr_inst_no_META = createCommonMeta($acxfr_inst_no, mcframe.commonMA.meta.MA_META.ACXFR_INST_NO);
	public static final MCMeta acxfr_inst_d_no_META = createCommonMeta($acxfr_inst_d_no, mcframe.commonMA.meta.MA_META.ACXFR_INST_D_NO);
	public static final MCMeta acxfr_act_no_META = createCommonMeta($acxfr_act_no, mcframe.commonMA.meta.MA_META.ACXFR_ACT_NO);
	public static final MCMeta acxfr_act_d_no_META = createCommonMeta($acxfr_act_d_no, mcframe.commonMA.meta.MA_META.ACXFR_ACT_D_NO);
	public static final MCMeta ext_acxfr_act_no_META = createCommonMeta($ext_acxfr_act_no, mcframe.commonMA.meta.MA_META.EXT_ACXFR_ACT_NO);
	public static final MCMeta acxfr_rev_META = createCommonMeta($acxfr_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rqst_dt_fr_META = createCommonMeta($rqst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_dt_to_META = createCommonMeta($rqst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta acxfr_schd_dt_fr_META = createCommonMeta($acxfr_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta acxfr_schd_dt_to_META = createCommonMeta($acxfr_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta acxfr_inst_dt_fr_META = createCommonMeta($acxfr_inst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta acxfr_inst_dt_to_META = createCommonMeta($acxfr_inst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta acxfr_act_dt_fr_META = createCommonMeta($acxfr_act_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta acxfr_act_hm_fr_META = createCommonMeta($acxfr_act_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta acxfr_act_dt_to_META = createCommonMeta($acxfr_act_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta acxfr_act_hm_to_META = createCommonMeta($acxfr_act_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta dspsl_no_META = createCommonMeta($dspsl_no, mcframe.commonMA.meta.MA_META.DSPSL_NO);
	public static final MCMeta schd_no_aprv_flg_META = createCommonMeta($schd_no_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_trd_d_rmrks_META = createCommonMeta($schd_trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta schd_dspsl_rmrks_META = createCommonMeta($schd_dspsl_rmrks, mcframe.commonMS.meta.MS_META.DSPSL_RMRKS);
	public static final MCMeta schd_sub_char1_META = createCommonMeta($schd_sub_char1, mcframe.commonMS.meta.MS_META.ACXFR_SCHD_SUB_CHAR1);
	public static final MCMeta schd_sub_char2_META = createCommonMeta($schd_sub_char2, mcframe.commonMS.meta.MS_META.ACXFR_SCHD_SUB_CHAR2);
	public static final MCMeta schd_sub_char3_META = createCommonMeta($schd_sub_char3, mcframe.commonMS.meta.MS_META.ACXFR_SCHD_SUB_CHAR3);
	public static final MCMeta inst_intr_rmrks_META = createCommonMeta($inst_intr_rmrks, mcframe.commonMS.meta.MS_META.ACXFR_INST_INTR_RMRKS);
	public static final MCMeta inst_trd_rmrks_META = createCommonMeta($inst_trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta inst_rmrks_META = createCommonMeta($inst_rmrks, mcframe.commonMS.meta.MS_META.ACXFR_INST_RMRKS);
	public static final MCMeta inst_sub_char1_META = createCommonMeta($inst_sub_char1, mcframe.commonMS.meta.MS_META.ACXFR_INST_SUB_CHAR1);
	public static final MCMeta inst_sub_char2_META = createCommonMeta($inst_sub_char2, mcframe.commonMS.meta.MS_META.ACXFR_INST_SUB_CHAR2);
	public static final MCMeta inst_sub_char3_META = createCommonMeta($inst_sub_char3, mcframe.commonMS.meta.MS_META.ACXFR_INST_SUB_CHAR3);
	public static final MCMeta inst_intr_d_rmrks_META = createCommonMeta($inst_intr_d_rmrks, mcframe.commonMS.meta.MS_META.ACXFR_INST_INTR_D_RMRKS);
	public static final MCMeta inst_trd_d_rmrks_META = createCommonMeta($inst_trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta inst_d_rmrks_META = createCommonMeta($inst_d_rmrks, mcframe.commonMS.meta.MS_META.ACXFR_INST_D_RMRKS);
	public static final MCMeta inst_d_sub_char1_META = createCommonMeta($inst_d_sub_char1, mcframe.commonMS.meta.MS_META.ACXFR_INST_D_SUB_CHAR1);
	public static final MCMeta inst_d_sub_char2_META = createCommonMeta($inst_d_sub_char2, mcframe.commonMS.meta.MS_META.ACXFR_INST_D_SUB_CHAR2);
	public static final MCMeta inst_d_sub_char3_META = createCommonMeta($inst_d_sub_char3, mcframe.commonMS.meta.MS_META.ACXFR_INST_D_SUB_CHAR3);
	public static final MCMeta act_intr_rmrks_META = createCommonMeta($act_intr_rmrks, mcframe.commonMS.meta.MS_META.ACXFR_ACT_INTR_RMRKS);
	public static final MCMeta act_trd_rmrks_META = createCommonMeta($act_trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta act_sub_char1_META = createCommonMeta($act_sub_char1, mcframe.commonMS.meta.MS_META.ACXFR_ACT_SUB_CHAR1);
	public static final MCMeta act_sub_char2_META = createCommonMeta($act_sub_char2, mcframe.commonMS.meta.MS_META.ACXFR_ACT_SUB_CHAR2);
	public static final MCMeta act_sub_char3_META = createCommonMeta($act_sub_char3, mcframe.commonMS.meta.MS_META.ACXFR_ACT_SUB_CHAR3);
	public static final MCMeta act_intr_d_rmrks_META = createCommonMeta($act_intr_d_rmrks, mcframe.commonMS.meta.MS_META.ACXFR_ACT_INTR_D_RMRKS);
	public static final MCMeta act_trd_d_rmrks_META = createCommonMeta($act_trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta act_d_sub_char1_META = createCommonMeta($act_d_sub_char1, mcframe.commonMS.meta.MS_META.ACXFR_ACT_D_SUB_CHAR1);
	public static final MCMeta act_d_sub_char2_META = createCommonMeta($act_d_sub_char2, mcframe.commonMS.meta.MS_META.ACXFR_ACT_D_SUB_CHAR2);
	public static final MCMeta act_d_sub_char3_META = createCommonMeta($act_d_sub_char3, mcframe.commonMS.meta.MS_META.ACXFR_ACT_D_SUB_CHAR3);
	public static final MCMeta itm_grp_flg1_META = createCommonMeta($itm_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg2_META = createCommonMeta($itm_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg3_META = createCommonMeta($itm_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg4_META = createCommonMeta($itm_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg5_META = createCommonMeta($itm_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg6_META = createCommonMeta($itm_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg7_META = createCommonMeta($itm_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg8_META = createCommonMeta($itm_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg9_META = createCommonMeta($itm_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg10_META = createCommonMeta($itm_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta rqst_usr_cd_META = createCommonMeta($rqst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_usr_nm_META = createCommonMeta($rqst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_dpt_nm_META = createCommonMeta($rqst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta act_usr_nm_META = createCommonMeta($act_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_dpt_nm_META = createCommonMeta($act_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch03_CndR> constMetas = new ConstMetaList<Srch03_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			not_inst_flg_META,
			inst_flg_META,
			part_comp_flg_META,
			comp_flg_META,
			wms_flg_META,
			not_wms_flg_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			wg_cd_META,
			wg_nm_META,
			acxfr_schd_no_META,
			acxfr_inst_no_META,
			acxfr_inst_d_no_META,
			acxfr_act_no_META,
			acxfr_act_d_no_META,
			ext_acxfr_act_no_META,
			acxfr_rev_META,
			latest_flg_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			ver_no_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			rqst_dt_fr_META,
			rqst_dt_to_META,
			acxfr_schd_dt_fr_META,
			acxfr_schd_dt_to_META,
			acxfr_inst_dt_fr_META,
			acxfr_inst_dt_to_META,
			acxfr_act_dt_fr_META,
			acxfr_act_hm_fr_META,
			acxfr_act_dt_to_META,
			acxfr_act_hm_to_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			rsn_cd_META,
			rsn_nm_META,
			dspsl_no_META,
			schd_no_aprv_flg_META,
			schd_trd_d_rmrks_META,
			schd_dspsl_rmrks_META,
			schd_sub_char1_META,
			schd_sub_char2_META,
			schd_sub_char3_META,
			inst_intr_rmrks_META,
			inst_trd_rmrks_META,
			inst_rmrks_META,
			inst_sub_char1_META,
			inst_sub_char2_META,
			inst_sub_char3_META,
			inst_intr_d_rmrks_META,
			inst_trd_d_rmrks_META,
			inst_d_rmrks_META,
			inst_d_sub_char1_META,
			inst_d_sub_char2_META,
			inst_d_sub_char3_META,
			act_intr_rmrks_META,
			act_trd_rmrks_META,
			act_sub_char1_META,
			act_sub_char2_META,
			act_sub_char3_META,
			act_intr_d_rmrks_META,
			act_trd_d_rmrks_META,
			act_d_sub_char1_META,
			act_d_sub_char2_META,
			act_d_sub_char3_META,
			itm_grp_flg1_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_flg2_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_flg3_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_flg4_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_flg5_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_flg6_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_flg7_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_flg8_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_flg9_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_flg10_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META,
			rqst_usr_cd_META,
			rqst_usr_nm_META,
			rqst_dpt_cd_META,
			rqst_dpt_nm_META,
			inst_usr_cd_META,
			inst_usr_nm_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			act_usr_cd_META,
			act_usr_nm_META,
			act_dpt_cd_META,
			act_dpt_nm_META,
			abort_flg_META
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
	protected Srch03_CndR_MC_A(ConstMetaList<? extends Srch03_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_CndR clone() {
		return (Srch03_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_CndR createInstance() {
		return (Srch03_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_CndR getValues(String... names) {
		return (Srch03_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public boolean not_inst_flg() {
		return getConstBoolean(offset + 1, $not_inst_flg);
	}

	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public void not_inst_flg(boolean value) {
		setConstBoolean(offset + 1, $not_inst_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean inst_flg() {
		return getConstBoolean(offset + 2, $inst_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void inst_flg(boolean value) {
		setConstBoolean(offset + 2, $inst_flg, value);
	}


	/**
	 * Partially completed 一部完了.<p>
	 *
	 */
	public boolean part_comp_flg() {
		return getConstBoolean(offset + 3, $part_comp_flg);
	}

	/**
	 * Partially completed 一部完了.<p>
	 *
	 */
	public void part_comp_flg(boolean value) {
		setConstBoolean(offset + 3, $part_comp_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean comp_flg() {
		return getConstBoolean(offset + 4, $comp_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void comp_flg(boolean value) {
		setConstBoolean(offset + 4, $comp_flg, value);
	}


	/**
	 * For WMS ＷＭＳ対象.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 5, $wms_flg);
	}

	/**
	 * For WMS ＷＭＳ対象.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 5, $wms_flg, value);
	}


	/**
	 * Not for WMS ＷＭＳ対象外.<p>
	 *
	 */
	public boolean not_wms_flg() {
		return getConstBoolean(offset + 6, $not_wms_flg);
	}

	/**
	 * Not for WMS ＷＭＳ対象外.<p>
	 *
	 */
	public void not_wms_flg(boolean value) {
		setConstBoolean(offset + 6, $not_wms_flg, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 7, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 7, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 8, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 8, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 9, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 9, $trd_ptn_typ, value);
	}


	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 10, $wg_cd);
	}

	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 10, $wg_cd, value);
	}


	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 11, $wg_nm);
	}

	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 11, $wg_nm, value);
	}


	/**
	 * Other accounting transfer schedule No. 他勘定振替予定ＮＯ.<p>
	 *
	 */
	public String acxfr_schd_no() {
		return getConstString(offset + 12, $acxfr_schd_no);
	}

	/**
	 * Other accounting transfer schedule No. 他勘定振替予定ＮＯ.<p>
	 *
	 */
	public void acxfr_schd_no(String value) {
		setConstString(offset + 12, $acxfr_schd_no, value);
	}


	/**
	 * Other accounting transfer order No. 他勘定振替指図ＮＯ.<p>
	 *
	 */
	public String acxfr_inst_no() {
		return getConstString(offset + 13, $acxfr_inst_no);
	}

	/**
	 * Other accounting transfer order No. 他勘定振替指図ＮＯ.<p>
	 *
	 */
	public void acxfr_inst_no(String value) {
		setConstString(offset + 13, $acxfr_inst_no, value);
	}


	/**
	 * Other accounting transfer order details No. 他勘定振替指図明細ＮＯ.<p>
	 *
	 */
	public String acxfr_inst_d_no() {
		return getConstString(offset + 14, $acxfr_inst_d_no);
	}

	/**
	 * Other accounting transfer order details No. 他勘定振替指図明細ＮＯ.<p>
	 *
	 */
	public void acxfr_inst_d_no(String value) {
		setConstString(offset + 14, $acxfr_inst_d_no, value);
	}


	/**
	 * Other accounting transfer result No. 他勘定振替実績ＮＯ.<p>
	 *
	 */
	public String acxfr_act_no() {
		return getConstString(offset + 15, $acxfr_act_no);
	}

	/**
	 * Other accounting transfer result No. 他勘定振替実績ＮＯ.<p>
	 *
	 */
	public void acxfr_act_no(String value) {
		setConstString(offset + 15, $acxfr_act_no, value);
	}


	/**
	 * Other accounting transfer result details No. 他勘定振替実績明細ＮＯ.<p>
	 *
	 */
	public String acxfr_act_d_no() {
		return getConstString(offset + 16, $acxfr_act_d_no);
	}

	/**
	 * Other accounting transfer result details No. 他勘定振替実績明細ＮＯ.<p>
	 *
	 */
	public void acxfr_act_d_no(String value) {
		setConstString(offset + 16, $acxfr_act_d_no, value);
	}


	/**
	 * External other accounting transfer result No. 外部他勘定振替実績ＮＯ.<p>
	 *
	 */
	public String ext_acxfr_act_no() {
		return getConstString(offset + 17, $ext_acxfr_act_no);
	}

	/**
	 * External other accounting transfer result No. 外部他勘定振替実績ＮＯ.<p>
	 *
	 */
	public void ext_acxfr_act_no(String value) {
		setConstString(offset + 17, $ext_acxfr_act_no, value);
	}


	/**
	 * Revision リビジョン.<p>
	 *
	 */
	public MCNumber acxfr_rev() {
		return getConstNumber(offset + 18, $acxfr_rev);
	}

	/**
	 * Revision リビジョン.<p>
	 *
	 */
	public void acxfr_rev(MCNumber value) {
		setConstNumber(offset + 18, $acxfr_rev, value);
	}

	/**
	 * Revision リビジョン.<p>
	 *
	 */
	public void acxfr_rev(int value) {
		setConstNumber(offset + 18, $acxfr_rev, value);
	}

	/**
	 * Revision リビジョン.<p>
	 *
	 */
	public void acxfr_rev(long value) {
		setConstNumber(offset + 18, $acxfr_rev, value);
	}

	/**
	 * Revision リビジョン.<p>
	 *
	 */
	public void acxfr_rev(float value) {
		setConstNumber(offset + 18, $acxfr_rev, value);
	}

	/**
	 * Revision リビジョン.<p>
	 *
	 */
	public void acxfr_rev(double value) {
		setConstNumber(offset + 18, $acxfr_rev, value);
	}


	/**
	 * Latest 最新.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 19, $latest_flg);
	}

	/**
	 * Latest 最新.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 19, $latest_flg, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 20, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 20, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 21, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 21, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 22, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 22, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 23, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 23, $str_ln_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 24, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 24, $itm_typ, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 25, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 25, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 26, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 26, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 27, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 27, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 28, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 28, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 29, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 29, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 30, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 30, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 31, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 31, $itm_nm, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 32, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 32, $ver_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 33, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 33, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 34, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 34, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 35, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 35, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 36, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 36, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 37, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 37, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 38, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 38, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 39, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 39, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 40, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 40, $wrk_nm, value);
	}


	/**
	 * Location G cd. 場所ＧＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 41, $loc_grp_cd);
	}

	/**
	 * Location G cd. 場所ＧＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 41, $loc_grp_cd, value);
	}


	/**
	 * Location G name 場所Ｇ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 42, $loc_grp_nm);
	}

	/**
	 * Location G name 場所Ｇ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 42, $loc_grp_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 43, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 43, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 44, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 44, $bd_dpt_nm, value);
	}


	/**
	 * Transfer requested date 振替依頼日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rqst_dt_fr() {
		return getConstDate(offset + 45, $rqst_dt_fr);
	}

	/**
	 * Transfer requested date 振替依頼日ＦＲＯＭ.<p>
	 *
	 */
	public void rqst_dt_fr(MCDate value) {
		setConstDate(offset + 45, $rqst_dt_fr, value);
	}


	/**
	 * Transfer request date TO 振替依頼日ＴＯ.<p>
	 *
	 */
	public MCDate rqst_dt_to() {
		return getConstDate(offset + 46, $rqst_dt_to);
	}

	/**
	 * Transfer request date TO 振替依頼日ＴＯ.<p>
	 *
	 */
	public void rqst_dt_to(MCDate value) {
		setConstDate(offset + 46, $rqst_dt_to, value);
	}


	/**
	 * Scheduled transfer date FROM 振替予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate acxfr_schd_dt_fr() {
		return getConstDate(offset + 47, $acxfr_schd_dt_fr);
	}

	/**
	 * Scheduled transfer date FROM 振替予定日ＦＲＯＭ.<p>
	 *
	 */
	public void acxfr_schd_dt_fr(MCDate value) {
		setConstDate(offset + 47, $acxfr_schd_dt_fr, value);
	}


	/**
	 * Scheduled transfer date TO 振替予定日ＴＯ.<p>
	 *
	 */
	public MCDate acxfr_schd_dt_to() {
		return getConstDate(offset + 48, $acxfr_schd_dt_to);
	}

	/**
	 * Scheduled transfer date TO 振替予定日ＴＯ.<p>
	 *
	 */
	public void acxfr_schd_dt_to(MCDate value) {
		setConstDate(offset + 48, $acxfr_schd_dt_to, value);
	}


	/**
	 * Transfer order date FROM 振替指図日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate acxfr_inst_dt_fr() {
		return getConstDate(offset + 49, $acxfr_inst_dt_fr);
	}

	/**
	 * Transfer order date FROM 振替指図日ＦＲＯＭ.<p>
	 *
	 */
	public void acxfr_inst_dt_fr(MCDate value) {
		setConstDate(offset + 49, $acxfr_inst_dt_fr, value);
	}


	/**
	 * Transfer order date TO 振替指図日ＴＯ.<p>
	 *
	 */
	public MCDate acxfr_inst_dt_to() {
		return getConstDate(offset + 50, $acxfr_inst_dt_to);
	}

	/**
	 * Transfer order date TO 振替指図日ＴＯ.<p>
	 *
	 */
	public void acxfr_inst_dt_to(MCDate value) {
		setConstDate(offset + 50, $acxfr_inst_dt_to, value);
	}


	/**
	 * Actual transfer date FROM 振替実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate acxfr_act_dt_fr() {
		return getConstDate(offset + 51, $acxfr_act_dt_fr);
	}

	/**
	 * Actual transfer date FROM 振替実績日ＦＲＯＭ.<p>
	 *
	 */
	public void acxfr_act_dt_fr(MCDate value) {
		setConstDate(offset + 51, $acxfr_act_dt_fr, value);
	}


	/**
	 * Actual transfer time FROM 振替実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate acxfr_act_hm_fr() {
		return getConstDate(offset + 52, $acxfr_act_hm_fr);
	}

	/**
	 * Actual transfer time FROM 振替実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public void acxfr_act_hm_fr(MCDate value) {
		setConstDate(offset + 52, $acxfr_act_hm_fr, value);
	}


	/**
	 * Actual transfer date TO 振替実績日ＴＯ.<p>
	 *
	 */
	public MCDate acxfr_act_dt_to() {
		return getConstDate(offset + 53, $acxfr_act_dt_to);
	}

	/**
	 * Actual transfer date TO 振替実績日ＴＯ.<p>
	 *
	 */
	public void acxfr_act_dt_to(MCDate value) {
		setConstDate(offset + 53, $acxfr_act_dt_to, value);
	}


	/**
	 * Actual transfer time TO 振替実績時刻ＴＯ.<p>
	 *
	 */
	public MCDate acxfr_act_hm_to() {
		return getConstDate(offset + 54, $acxfr_act_hm_to);
	}

	/**
	 * Actual transfer time TO 振替実績時刻ＴＯ.<p>
	 *
	 */
	public void acxfr_act_hm_to(MCDate value) {
		setConstDate(offset + 54, $acxfr_act_hm_to, value);
	}


	/**
	 * Transfer recording date FROM 振替計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_dt_fr() {
		return getConstDate(offset + 55, $ac_dt_fr);
	}

	/**
	 * Transfer recording date FROM 振替計上日ＦＲＯＭ.<p>
	 *
	 */
	public void ac_dt_fr(MCDate value) {
		setConstDate(offset + 55, $ac_dt_fr, value);
	}


	/**
	 * Transfer recording date TO 振替計上日ＴＯ.<p>
	 *
	 */
	public MCDate ac_dt_to() {
		return getConstDate(offset + 56, $ac_dt_to);
	}

	/**
	 * Transfer recording date TO 振替計上日ＴＯ.<p>
	 *
	 */
	public void ac_dt_to(MCDate value) {
		setConstDate(offset + 56, $ac_dt_to, value);
	}


	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 57, $rsn_cd);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 57, $rsn_cd, value);
	}


	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 58, $rsn_nm);
	}

	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 58, $rsn_nm, value);
	}


	/**
	 * Disposal application No. 廃棄申請ＮＯ.<p>
	 *
	 */
	public String dspsl_no() {
		return getConstString(offset + 59, $dspsl_no);
	}

	/**
	 * Disposal application No. 廃棄申請ＮＯ.<p>
	 *
	 */
	public void dspsl_no(String value) {
		setConstString(offset + 59, $dspsl_no, value);
	}


	/**
	 * Include scheduled unapproved 予定未承認含む.<p>
	 *
	 */
	public boolean schd_no_aprv_flg() {
		return getConstBoolean(offset + 60, $schd_no_aprv_flg);
	}

	/**
	 * Include scheduled unapproved 予定未承認含む.<p>
	 *
	 */
	public void schd_no_aprv_flg(boolean value) {
		setConstBoolean(offset + 60, $schd_no_aprv_flg, value);
	}


	/**
	 * Transaction details remarks (Schedule) 取引明細備考（予定）.<p>
	 *
	 */
	public String schd_trd_d_rmrks() {
		return getConstString(offset + 61, $schd_trd_d_rmrks);
	}

	/**
	 * Transaction details remarks (Schedule) 取引明細備考（予定）.<p>
	 *
	 */
	public void schd_trd_d_rmrks(String value) {
		setConstString(offset + 61, $schd_trd_d_rmrks, value);
	}


	/**
	 * Disposal request remarks (schedule) 廃棄申請備考（予定）.<p>
	 *
	 */
	public String schd_dspsl_rmrks() {
		return getConstString(offset + 62, $schd_dspsl_rmrks);
	}

	/**
	 * Disposal request remarks (schedule) 廃棄申請備考（予定）.<p>
	 *
	 */
	public void schd_dspsl_rmrks(String value) {
		setConstString(offset + 62, $schd_dspsl_rmrks, value);
	}


	/**
	 * Spare 1 (Schedule) 予備１（予定）.<p>
	 *
	 */
	public String schd_sub_char1() {
		return getConstString(offset + 63, $schd_sub_char1);
	}

	/**
	 * Spare 1 (Schedule) 予備１（予定）.<p>
	 *
	 */
	public void schd_sub_char1(String value) {
		setConstString(offset + 63, $schd_sub_char1, value);
	}


	/**
	 * Spare 2 (Schedule) 予備２（予定）.<p>
	 *
	 */
	public String schd_sub_char2() {
		return getConstString(offset + 64, $schd_sub_char2);
	}

	/**
	 * Spare 2 (Schedule) 予備２（予定）.<p>
	 *
	 */
	public void schd_sub_char2(String value) {
		setConstString(offset + 64, $schd_sub_char2, value);
	}


	/**
	 * Spare 3 (Schedule) 予備３（予定）.<p>
	 *
	 */
	public String schd_sub_char3() {
		return getConstString(offset + 65, $schd_sub_char3);
	}

	/**
	 * Spare 3 (Schedule) 予備３（予定）.<p>
	 *
	 */
	public void schd_sub_char3(String value) {
		setConstString(offset + 65, $schd_sub_char3, value);
	}


	/**
	 * Internal remarks (Order header) 内部備考（指図ヘッダ）.<p>
	 *
	 */
	public String inst_intr_rmrks() {
		return getConstString(offset + 66, $inst_intr_rmrks);
	}

	/**
	 * Internal remarks (Order header) 内部備考（指図ヘッダ）.<p>
	 *
	 */
	public void inst_intr_rmrks(String value) {
		setConstString(offset + 66, $inst_intr_rmrks, value);
	}


	/**
	 * Transaction remarks (Order header) 取引備考（指図ヘッダ）.<p>
	 *
	 */
	public String inst_trd_rmrks() {
		return getConstString(offset + 67, $inst_trd_rmrks);
	}

	/**
	 * Transaction remarks (Order header) 取引備考（指図ヘッダ）.<p>
	 *
	 */
	public void inst_trd_rmrks(String value) {
		setConstString(offset + 67, $inst_trd_rmrks, value);
	}


	/**
	 * Order remarks (Order header) 指図備考（指図ヘッダ）.<p>
	 *
	 */
	public String inst_rmrks() {
		return getConstString(offset + 68, $inst_rmrks);
	}

	/**
	 * Order remarks (Order header) 指図備考（指図ヘッダ）.<p>
	 *
	 */
	public void inst_rmrks(String value) {
		setConstString(offset + 68, $inst_rmrks, value);
	}


	/**
	 * Spare 1 (Order header) 予備１（指図ヘッダ）.<p>
	 *
	 */
	public String inst_sub_char1() {
		return getConstString(offset + 69, $inst_sub_char1);
	}

	/**
	 * Spare 1 (Order header) 予備１（指図ヘッダ）.<p>
	 *
	 */
	public void inst_sub_char1(String value) {
		setConstString(offset + 69, $inst_sub_char1, value);
	}


	/**
	 * Spare 2 (Order header) 予備２（指図ヘッダ）.<p>
	 *
	 */
	public String inst_sub_char2() {
		return getConstString(offset + 70, $inst_sub_char2);
	}

	/**
	 * Spare 2 (Order header) 予備２（指図ヘッダ）.<p>
	 *
	 */
	public void inst_sub_char2(String value) {
		setConstString(offset + 70, $inst_sub_char2, value);
	}


	/**
	 * Spare 3 (Order header) 予備３（指図ヘッダ）.<p>
	 *
	 */
	public String inst_sub_char3() {
		return getConstString(offset + 71, $inst_sub_char3);
	}

	/**
	 * Spare 3 (Order header) 予備３（指図ヘッダ）.<p>
	 *
	 */
	public void inst_sub_char3(String value) {
		setConstString(offset + 71, $inst_sub_char3, value);
	}


	/**
	 * Internal details remarks (Order details) 内部明細備考（指図明細）.<p>
	 *
	 */
	public String inst_intr_d_rmrks() {
		return getConstString(offset + 72, $inst_intr_d_rmrks);
	}

	/**
	 * Internal details remarks (Order details) 内部明細備考（指図明細）.<p>
	 *
	 */
	public void inst_intr_d_rmrks(String value) {
		setConstString(offset + 72, $inst_intr_d_rmrks, value);
	}


	/**
	 * Transaction details remarks (Order details) 取引明細備考（指図明細）.<p>
	 *
	 */
	public String inst_trd_d_rmrks() {
		return getConstString(offset + 73, $inst_trd_d_rmrks);
	}

	/**
	 * Transaction details remarks (Order details) 取引明細備考（指図明細）.<p>
	 *
	 */
	public void inst_trd_d_rmrks(String value) {
		setConstString(offset + 73, $inst_trd_d_rmrks, value);
	}


	/**
	 * Order details remarks (Details) 指図明細備考（指図明細）.<p>
	 *
	 */
	public String inst_d_rmrks() {
		return getConstString(offset + 74, $inst_d_rmrks);
	}

	/**
	 * Order details remarks (Details) 指図明細備考（指図明細）.<p>
	 *
	 */
	public void inst_d_rmrks(String value) {
		setConstString(offset + 74, $inst_d_rmrks, value);
	}


	/**
	 * Spare 1 (Order details) 予備１（指図明細）.<p>
	 *
	 */
	public String inst_d_sub_char1() {
		return getConstString(offset + 75, $inst_d_sub_char1);
	}

	/**
	 * Spare 1 (Order details) 予備１（指図明細）.<p>
	 *
	 */
	public void inst_d_sub_char1(String value) {
		setConstString(offset + 75, $inst_d_sub_char1, value);
	}


	/**
	 * Spare 2 (Order details) 予備２（指図明細）.<p>
	 *
	 */
	public String inst_d_sub_char2() {
		return getConstString(offset + 76, $inst_d_sub_char2);
	}

	/**
	 * Spare 2 (Order details) 予備２（指図明細）.<p>
	 *
	 */
	public void inst_d_sub_char2(String value) {
		setConstString(offset + 76, $inst_d_sub_char2, value);
	}


	/**
	 * Spare 3 (Order details) 予備３（指図明細）.<p>
	 *
	 */
	public String inst_d_sub_char3() {
		return getConstString(offset + 77, $inst_d_sub_char3);
	}

	/**
	 * Spare 3 (Order details) 予備３（指図明細）.<p>
	 *
	 */
	public void inst_d_sub_char3(String value) {
		setConstString(offset + 77, $inst_d_sub_char3, value);
	}


	/**
	 * Internal remarks (Result header) 内部備考（実績ヘッダ）.<p>
	 *
	 */
	public String act_intr_rmrks() {
		return getConstString(offset + 78, $act_intr_rmrks);
	}

	/**
	 * Internal remarks (Result header) 内部備考（実績ヘッダ）.<p>
	 *
	 */
	public void act_intr_rmrks(String value) {
		setConstString(offset + 78, $act_intr_rmrks, value);
	}


	/**
	 * Transaction remarks (Result header) 取引備考（実績ヘッダ）.<p>
	 *
	 */
	public String act_trd_rmrks() {
		return getConstString(offset + 79, $act_trd_rmrks);
	}

	/**
	 * Transaction remarks (Result header) 取引備考（実績ヘッダ）.<p>
	 *
	 */
	public void act_trd_rmrks(String value) {
		setConstString(offset + 79, $act_trd_rmrks, value);
	}


	/**
	 * Spare 1 (Result header) 予備１（実績ヘッダ）.<p>
	 *
	 */
	public String act_sub_char1() {
		return getConstString(offset + 80, $act_sub_char1);
	}

	/**
	 * Spare 1 (Result header) 予備１（実績ヘッダ）.<p>
	 *
	 */
	public void act_sub_char1(String value) {
		setConstString(offset + 80, $act_sub_char1, value);
	}


	/**
	 * Spare 2 (Result header) 予備２（実績ヘッダ）.<p>
	 *
	 */
	public String act_sub_char2() {
		return getConstString(offset + 81, $act_sub_char2);
	}

	/**
	 * Spare 2 (Result header) 予備２（実績ヘッダ）.<p>
	 *
	 */
	public void act_sub_char2(String value) {
		setConstString(offset + 81, $act_sub_char2, value);
	}


	/**
	 * Spare 3 (Result header) 予備３（実績ヘッダ）.<p>
	 *
	 */
	public String act_sub_char3() {
		return getConstString(offset + 82, $act_sub_char3);
	}

	/**
	 * Spare 3 (Result header) 予備３（実績ヘッダ）.<p>
	 *
	 */
	public void act_sub_char3(String value) {
		setConstString(offset + 82, $act_sub_char3, value);
	}


	/**
	 * Internal details remarks (Result details) 内部明細備考（実績明細）.<p>
	 *
	 */
	public String act_intr_d_rmrks() {
		return getConstString(offset + 83, $act_intr_d_rmrks);
	}

	/**
	 * Internal details remarks (Result details) 内部明細備考（実績明細）.<p>
	 *
	 */
	public void act_intr_d_rmrks(String value) {
		setConstString(offset + 83, $act_intr_d_rmrks, value);
	}


	/**
	 * Transaction details remarks (Result details) 取引明細備考（実績明細）.<p>
	 *
	 */
	public String act_trd_d_rmrks() {
		return getConstString(offset + 84, $act_trd_d_rmrks);
	}

	/**
	 * Transaction details remarks (Result details) 取引明細備考（実績明細）.<p>
	 *
	 */
	public void act_trd_d_rmrks(String value) {
		setConstString(offset + 84, $act_trd_d_rmrks, value);
	}


	/**
	 * Spare 1 (Result details) 予備１（実績明細）.<p>
	 *
	 */
	public String act_d_sub_char1() {
		return getConstString(offset + 85, $act_d_sub_char1);
	}

	/**
	 * Spare 1 (Result details) 予備１（実績明細）.<p>
	 *
	 */
	public void act_d_sub_char1(String value) {
		setConstString(offset + 85, $act_d_sub_char1, value);
	}


	/**
	 * Spare 2 (Result details) 予備２（実績明細）.<p>
	 *
	 */
	public String act_d_sub_char2() {
		return getConstString(offset + 86, $act_d_sub_char2);
	}

	/**
	 * Spare 2 (Result details) 予備２（実績明細）.<p>
	 *
	 */
	public void act_d_sub_char2(String value) {
		setConstString(offset + 86, $act_d_sub_char2, value);
	}


	/**
	 * Spare 3 (Result details) 予備３（実績明細）.<p>
	 *
	 */
	public String act_d_sub_char3() {
		return getConstString(offset + 87, $act_d_sub_char3);
	}

	/**
	 * Spare 3 (Result details) 予備３（実績明細）.<p>
	 *
	 */
	public void act_d_sub_char3(String value) {
		setConstString(offset + 87, $act_d_sub_char3, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 88, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 88, $itm_grp_flg1, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 89, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 89, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 90, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 90, $itm_grp_nm1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 91, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 91, $itm_grp_flg2, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 92, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 92, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 93, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 93, $itm_grp_nm2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 94, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 94, $itm_grp_flg3, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 95, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 95, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 96, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 96, $itm_grp_nm3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 97, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 97, $itm_grp_flg4, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 98, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 98, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 99, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 99, $itm_grp_nm4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 100, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 100, $itm_grp_flg5, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 101, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 101, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 102, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 102, $itm_grp_nm5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 103, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 103, $itm_grp_flg6, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 104, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 104, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 105, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 105, $itm_grp_nm6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 106, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 106, $itm_grp_flg7, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 107, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 107, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 108, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 108, $itm_grp_nm7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 109, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 109, $itm_grp_flg8, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 110, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 110, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 111, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 111, $itm_grp_nm8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 112, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 112, $itm_grp_flg9, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 113, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 113, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 114, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 114, $itm_grp_nm9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 115, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 115, $itm_grp_flg10, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 116, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 116, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 117, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 117, $itm_grp_nm10, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 118, $rqst_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 118, $rqst_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_usr_nm() {
		return getConstString(offset + 119, $rqst_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_usr_nm(String value) {
		setConstString(offset + 119, $rqst_usr_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 120, $rqst_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 120, $rqst_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_dpt_nm() {
		return getConstString(offset + 121, $rqst_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_dpt_nm(String value) {
		setConstString(offset + 121, $rqst_dpt_nm, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 122, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 122, $inst_usr_cd, value);
	}


	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 123, $inst_usr_nm);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 123, $inst_usr_nm, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 124, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 124, $inst_dpt_cd, value);
	}


	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 125, $inst_dpt_nm);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 125, $inst_dpt_nm, value);
	}


	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 126, $act_usr_cd);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 126, $act_usr_cd, value);
	}


	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return getConstString(offset + 127, $act_usr_nm);
	}

	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		setConstString(offset + 127, $act_usr_nm, value);
	}


	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 128, $act_dpt_cd);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 128, $act_dpt_cd, value);
	}


	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return getConstString(offset + 129, $act_dpt_nm);
	}

	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		setConstString(offset + 129, $act_dpt_nm, value);
	}


	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 130, $abort_flg);
	}

	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 130, $abort_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($acxfr_schd_no.equalsIgnoreCase(name)) {
			return acxfr_schd_no();
		}
		if ($acxfr_inst_no.equalsIgnoreCase(name)) {
			return acxfr_inst_no();
		}
		if ($acxfr_inst_d_no.equalsIgnoreCase(name)) {
			return acxfr_inst_d_no();
		}
		if ($acxfr_act_no.equalsIgnoreCase(name)) {
			return acxfr_act_no();
		}
		if ($acxfr_act_d_no.equalsIgnoreCase(name)) {
			return acxfr_act_d_no();
		}
		if ($ext_acxfr_act_no.equalsIgnoreCase(name)) {
			return ext_acxfr_act_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($dspsl_no.equalsIgnoreCase(name)) {
			return dspsl_no();
		}
		if ($schd_trd_d_rmrks.equalsIgnoreCase(name)) {
			return schd_trd_d_rmrks();
		}
		if ($schd_dspsl_rmrks.equalsIgnoreCase(name)) {
			return schd_dspsl_rmrks();
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			return schd_sub_char1();
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			return schd_sub_char2();
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			return schd_sub_char3();
		}
		if ($inst_intr_rmrks.equalsIgnoreCase(name)) {
			return inst_intr_rmrks();
		}
		if ($inst_trd_rmrks.equalsIgnoreCase(name)) {
			return inst_trd_rmrks();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			return inst_sub_char1();
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			return inst_sub_char2();
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			return inst_sub_char3();
		}
		if ($inst_intr_d_rmrks.equalsIgnoreCase(name)) {
			return inst_intr_d_rmrks();
		}
		if ($inst_trd_d_rmrks.equalsIgnoreCase(name)) {
			return inst_trd_d_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
		}
		if ($inst_d_sub_char1.equalsIgnoreCase(name)) {
			return inst_d_sub_char1();
		}
		if ($inst_d_sub_char2.equalsIgnoreCase(name)) {
			return inst_d_sub_char2();
		}
		if ($inst_d_sub_char3.equalsIgnoreCase(name)) {
			return inst_d_sub_char3();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			return act_trd_rmrks();
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			return act_sub_char1();
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			return act_sub_char2();
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			return act_sub_char3();
		}
		if ($act_intr_d_rmrks.equalsIgnoreCase(name)) {
			return act_intr_d_rmrks();
		}
		if ($act_trd_d_rmrks.equalsIgnoreCase(name)) {
			return act_trd_d_rmrks();
		}
		if ($act_d_sub_char1.equalsIgnoreCase(name)) {
			return act_d_sub_char1();
		}
		if ($act_d_sub_char2.equalsIgnoreCase(name)) {
			return act_d_sub_char2();
		}
		if ($act_d_sub_char3.equalsIgnoreCase(name)) {
			return act_d_sub_char3();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($acxfr_rev.equalsIgnoreCase(name)) {
			return acxfr_rev();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rqst_dt_fr.equalsIgnoreCase(name)) {
			return rqst_dt_fr();
		}
		if ($rqst_dt_to.equalsIgnoreCase(name)) {
			return rqst_dt_to();
		}
		if ($acxfr_schd_dt_fr.equalsIgnoreCase(name)) {
			return acxfr_schd_dt_fr();
		}
		if ($acxfr_schd_dt_to.equalsIgnoreCase(name)) {
			return acxfr_schd_dt_to();
		}
		if ($acxfr_inst_dt_fr.equalsIgnoreCase(name)) {
			return acxfr_inst_dt_fr();
		}
		if ($acxfr_inst_dt_to.equalsIgnoreCase(name)) {
			return acxfr_inst_dt_to();
		}
		if ($acxfr_act_dt_fr.equalsIgnoreCase(name)) {
			return acxfr_act_dt_fr();
		}
		if ($acxfr_act_hm_fr.equalsIgnoreCase(name)) {
			return acxfr_act_hm_fr();
		}
		if ($acxfr_act_dt_to.equalsIgnoreCase(name)) {
			return acxfr_act_dt_to();
		}
		if ($acxfr_act_hm_to.equalsIgnoreCase(name)) {
			return acxfr_act_hm_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			return not_inst_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($part_comp_flg.equalsIgnoreCase(name)) {
			return part_comp_flg();
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			return comp_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			return not_wms_flg();
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($schd_no_aprv_flg.equalsIgnoreCase(name)) {
			return schd_no_aprv_flg();
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($acxfr_schd_no.equalsIgnoreCase(name)) {
			return acxfr_schd_no();
		}
		if ($acxfr_inst_no.equalsIgnoreCase(name)) {
			return acxfr_inst_no();
		}
		if ($acxfr_inst_d_no.equalsIgnoreCase(name)) {
			return acxfr_inst_d_no();
		}
		if ($acxfr_act_no.equalsIgnoreCase(name)) {
			return acxfr_act_no();
		}
		if ($acxfr_act_d_no.equalsIgnoreCase(name)) {
			return acxfr_act_d_no();
		}
		if ($ext_acxfr_act_no.equalsIgnoreCase(name)) {
			return ext_acxfr_act_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($dspsl_no.equalsIgnoreCase(name)) {
			return dspsl_no();
		}
		if ($schd_trd_d_rmrks.equalsIgnoreCase(name)) {
			return schd_trd_d_rmrks();
		}
		if ($schd_dspsl_rmrks.equalsIgnoreCase(name)) {
			return schd_dspsl_rmrks();
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			return schd_sub_char1();
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			return schd_sub_char2();
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			return schd_sub_char3();
		}
		if ($inst_intr_rmrks.equalsIgnoreCase(name)) {
			return inst_intr_rmrks();
		}
		if ($inst_trd_rmrks.equalsIgnoreCase(name)) {
			return inst_trd_rmrks();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			return inst_sub_char1();
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			return inst_sub_char2();
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			return inst_sub_char3();
		}
		if ($inst_intr_d_rmrks.equalsIgnoreCase(name)) {
			return inst_intr_d_rmrks();
		}
		if ($inst_trd_d_rmrks.equalsIgnoreCase(name)) {
			return inst_trd_d_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
		}
		if ($inst_d_sub_char1.equalsIgnoreCase(name)) {
			return inst_d_sub_char1();
		}
		if ($inst_d_sub_char2.equalsIgnoreCase(name)) {
			return inst_d_sub_char2();
		}
		if ($inst_d_sub_char3.equalsIgnoreCase(name)) {
			return inst_d_sub_char3();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			return act_trd_rmrks();
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			return act_sub_char1();
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			return act_sub_char2();
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			return act_sub_char3();
		}
		if ($act_intr_d_rmrks.equalsIgnoreCase(name)) {
			return act_intr_d_rmrks();
		}
		if ($act_trd_d_rmrks.equalsIgnoreCase(name)) {
			return act_trd_d_rmrks();
		}
		if ($act_d_sub_char1.equalsIgnoreCase(name)) {
			return act_d_sub_char1();
		}
		if ($act_d_sub_char2.equalsIgnoreCase(name)) {
			return act_d_sub_char2();
		}
		if ($act_d_sub_char3.equalsIgnoreCase(name)) {
			return act_d_sub_char3();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($acxfr_rev.equalsIgnoreCase(name)) {
			return acxfr_rev();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rqst_dt_fr.equalsIgnoreCase(name)) {
			return rqst_dt_fr();
		}
		if ($rqst_dt_to.equalsIgnoreCase(name)) {
			return rqst_dt_to();
		}
		if ($acxfr_schd_dt_fr.equalsIgnoreCase(name)) {
			return acxfr_schd_dt_fr();
		}
		if ($acxfr_schd_dt_to.equalsIgnoreCase(name)) {
			return acxfr_schd_dt_to();
		}
		if ($acxfr_inst_dt_fr.equalsIgnoreCase(name)) {
			return acxfr_inst_dt_fr();
		}
		if ($acxfr_inst_dt_to.equalsIgnoreCase(name)) {
			return acxfr_inst_dt_to();
		}
		if ($acxfr_act_dt_fr.equalsIgnoreCase(name)) {
			return acxfr_act_dt_fr();
		}
		if ($acxfr_act_hm_fr.equalsIgnoreCase(name)) {
			return acxfr_act_hm_fr();
		}
		if ($acxfr_act_dt_to.equalsIgnoreCase(name)) {
			return acxfr_act_dt_to();
		}
		if ($acxfr_act_hm_to.equalsIgnoreCase(name)) {
			return acxfr_act_hm_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			return not_inst_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($part_comp_flg.equalsIgnoreCase(name)) {
			return part_comp_flg();
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			return comp_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			return not_wms_flg();
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($schd_no_aprv_flg.equalsIgnoreCase(name)) {
			return schd_no_aprv_flg();
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
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
		if ($acxfr_schd_no.equalsIgnoreCase(name)) {
			acxfr_schd_no(value);
			return;
		}
		if ($acxfr_inst_no.equalsIgnoreCase(name)) {
			acxfr_inst_no(value);
			return;
		}
		if ($acxfr_inst_d_no.equalsIgnoreCase(name)) {
			acxfr_inst_d_no(value);
			return;
		}
		if ($acxfr_act_no.equalsIgnoreCase(name)) {
			acxfr_act_no(value);
			return;
		}
		if ($acxfr_act_d_no.equalsIgnoreCase(name)) {
			acxfr_act_d_no(value);
			return;
		}
		if ($ext_acxfr_act_no.equalsIgnoreCase(name)) {
			ext_acxfr_act_no(value);
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
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
			return;
		}
		if ($dspsl_no.equalsIgnoreCase(name)) {
			dspsl_no(value);
			return;
		}
		if ($schd_trd_d_rmrks.equalsIgnoreCase(name)) {
			schd_trd_d_rmrks(value);
			return;
		}
		if ($schd_dspsl_rmrks.equalsIgnoreCase(name)) {
			schd_dspsl_rmrks(value);
			return;
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			schd_sub_char1(value);
			return;
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			schd_sub_char2(value);
			return;
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			schd_sub_char3(value);
			return;
		}
		if ($inst_intr_rmrks.equalsIgnoreCase(name)) {
			inst_intr_rmrks(value);
			return;
		}
		if ($inst_trd_rmrks.equalsIgnoreCase(name)) {
			inst_trd_rmrks(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			inst_sub_char1(value);
			return;
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			inst_sub_char2(value);
			return;
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			inst_sub_char3(value);
			return;
		}
		if ($inst_intr_d_rmrks.equalsIgnoreCase(name)) {
			inst_intr_d_rmrks(value);
			return;
		}
		if ($inst_trd_d_rmrks.equalsIgnoreCase(name)) {
			inst_trd_d_rmrks(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
			return;
		}
		if ($inst_d_sub_char1.equalsIgnoreCase(name)) {
			inst_d_sub_char1(value);
			return;
		}
		if ($inst_d_sub_char2.equalsIgnoreCase(name)) {
			inst_d_sub_char2(value);
			return;
		}
		if ($inst_d_sub_char3.equalsIgnoreCase(name)) {
			inst_d_sub_char3(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			act_trd_rmrks(value);
			return;
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			act_sub_char1(value);
			return;
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			act_sub_char2(value);
			return;
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			act_sub_char3(value);
			return;
		}
		if ($act_intr_d_rmrks.equalsIgnoreCase(name)) {
			act_intr_d_rmrks(value);
			return;
		}
		if ($act_trd_d_rmrks.equalsIgnoreCase(name)) {
			act_trd_d_rmrks(value);
			return;
		}
		if ($act_d_sub_char1.equalsIgnoreCase(name)) {
			act_d_sub_char1(value);
			return;
		}
		if ($act_d_sub_char2.equalsIgnoreCase(name)) {
			act_d_sub_char2(value);
			return;
		}
		if ($act_d_sub_char3.equalsIgnoreCase(name)) {
			act_d_sub_char3(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			rqst_usr_nm(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			rqst_dpt_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($acxfr_rev.equalsIgnoreCase(name)) {
			acxfr_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($acxfr_rev.equalsIgnoreCase(name)) {
			acxfr_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($acxfr_rev.equalsIgnoreCase(name)) {
			acxfr_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($acxfr_rev.equalsIgnoreCase(name)) {
			acxfr_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($acxfr_rev.equalsIgnoreCase(name)) {
			acxfr_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rqst_dt_fr.equalsIgnoreCase(name)) {
			rqst_dt_fr(value);
			return;
		}
		if ($rqst_dt_to.equalsIgnoreCase(name)) {
			rqst_dt_to(value);
			return;
		}
		if ($acxfr_schd_dt_fr.equalsIgnoreCase(name)) {
			acxfr_schd_dt_fr(value);
			return;
		}
		if ($acxfr_schd_dt_to.equalsIgnoreCase(name)) {
			acxfr_schd_dt_to(value);
			return;
		}
		if ($acxfr_inst_dt_fr.equalsIgnoreCase(name)) {
			acxfr_inst_dt_fr(value);
			return;
		}
		if ($acxfr_inst_dt_to.equalsIgnoreCase(name)) {
			acxfr_inst_dt_to(value);
			return;
		}
		if ($acxfr_act_dt_fr.equalsIgnoreCase(name)) {
			acxfr_act_dt_fr(value);
			return;
		}
		if ($acxfr_act_hm_fr.equalsIgnoreCase(name)) {
			acxfr_act_hm_fr(value);
			return;
		}
		if ($acxfr_act_dt_to.equalsIgnoreCase(name)) {
			acxfr_act_dt_to(value);
			return;
		}
		if ($acxfr_act_hm_to.equalsIgnoreCase(name)) {
			acxfr_act_hm_to(value);
			return;
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			ac_dt_fr(value);
			return;
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			ac_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			not_inst_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($part_comp_flg.equalsIgnoreCase(name)) {
			part_comp_flg(value);
			return;
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			comp_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			not_wms_flg(value);
			return;
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($schd_no_aprv_flg.equalsIgnoreCase(name)) {
			schd_no_aprv_flg(value);
			return;
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
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
		if ($acxfr_schd_no.equalsIgnoreCase(name)) {
			acxfr_schd_no(value);
			return;
		}
		if ($acxfr_inst_no.equalsIgnoreCase(name)) {
			acxfr_inst_no(value);
			return;
		}
		if ($acxfr_inst_d_no.equalsIgnoreCase(name)) {
			acxfr_inst_d_no(value);
			return;
		}
		if ($acxfr_act_no.equalsIgnoreCase(name)) {
			acxfr_act_no(value);
			return;
		}
		if ($acxfr_act_d_no.equalsIgnoreCase(name)) {
			acxfr_act_d_no(value);
			return;
		}
		if ($ext_acxfr_act_no.equalsIgnoreCase(name)) {
			ext_acxfr_act_no(value);
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
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
			return;
		}
		if ($dspsl_no.equalsIgnoreCase(name)) {
			dspsl_no(value);
			return;
		}
		if ($schd_trd_d_rmrks.equalsIgnoreCase(name)) {
			schd_trd_d_rmrks(value);
			return;
		}
		if ($schd_dspsl_rmrks.equalsIgnoreCase(name)) {
			schd_dspsl_rmrks(value);
			return;
		}
		if ($schd_sub_char1.equalsIgnoreCase(name)) {
			schd_sub_char1(value);
			return;
		}
		if ($schd_sub_char2.equalsIgnoreCase(name)) {
			schd_sub_char2(value);
			return;
		}
		if ($schd_sub_char3.equalsIgnoreCase(name)) {
			schd_sub_char3(value);
			return;
		}
		if ($inst_intr_rmrks.equalsIgnoreCase(name)) {
			inst_intr_rmrks(value);
			return;
		}
		if ($inst_trd_rmrks.equalsIgnoreCase(name)) {
			inst_trd_rmrks(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			inst_sub_char1(value);
			return;
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			inst_sub_char2(value);
			return;
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			inst_sub_char3(value);
			return;
		}
		if ($inst_intr_d_rmrks.equalsIgnoreCase(name)) {
			inst_intr_d_rmrks(value);
			return;
		}
		if ($inst_trd_d_rmrks.equalsIgnoreCase(name)) {
			inst_trd_d_rmrks(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
			return;
		}
		if ($inst_d_sub_char1.equalsIgnoreCase(name)) {
			inst_d_sub_char1(value);
			return;
		}
		if ($inst_d_sub_char2.equalsIgnoreCase(name)) {
			inst_d_sub_char2(value);
			return;
		}
		if ($inst_d_sub_char3.equalsIgnoreCase(name)) {
			inst_d_sub_char3(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			act_trd_rmrks(value);
			return;
		}
		if ($act_sub_char1.equalsIgnoreCase(name)) {
			act_sub_char1(value);
			return;
		}
		if ($act_sub_char2.equalsIgnoreCase(name)) {
			act_sub_char2(value);
			return;
		}
		if ($act_sub_char3.equalsIgnoreCase(name)) {
			act_sub_char3(value);
			return;
		}
		if ($act_intr_d_rmrks.equalsIgnoreCase(name)) {
			act_intr_d_rmrks(value);
			return;
		}
		if ($act_trd_d_rmrks.equalsIgnoreCase(name)) {
			act_trd_d_rmrks(value);
			return;
		}
		if ($act_d_sub_char1.equalsIgnoreCase(name)) {
			act_d_sub_char1(value);
			return;
		}
		if ($act_d_sub_char2.equalsIgnoreCase(name)) {
			act_d_sub_char2(value);
			return;
		}
		if ($act_d_sub_char3.equalsIgnoreCase(name)) {
			act_d_sub_char3(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			rqst_usr_nm(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			rqst_dpt_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($acxfr_rev.equalsIgnoreCase(name)) {
			acxfr_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($acxfr_rev.equalsIgnoreCase(name)) {
			acxfr_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($acxfr_rev.equalsIgnoreCase(name)) {
			acxfr_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($acxfr_rev.equalsIgnoreCase(name)) {
			acxfr_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($acxfr_rev.equalsIgnoreCase(name)) {
			acxfr_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rqst_dt_fr.equalsIgnoreCase(name)) {
			rqst_dt_fr(value);
			return;
		}
		if ($rqst_dt_to.equalsIgnoreCase(name)) {
			rqst_dt_to(value);
			return;
		}
		if ($acxfr_schd_dt_fr.equalsIgnoreCase(name)) {
			acxfr_schd_dt_fr(value);
			return;
		}
		if ($acxfr_schd_dt_to.equalsIgnoreCase(name)) {
			acxfr_schd_dt_to(value);
			return;
		}
		if ($acxfr_inst_dt_fr.equalsIgnoreCase(name)) {
			acxfr_inst_dt_fr(value);
			return;
		}
		if ($acxfr_inst_dt_to.equalsIgnoreCase(name)) {
			acxfr_inst_dt_to(value);
			return;
		}
		if ($acxfr_act_dt_fr.equalsIgnoreCase(name)) {
			acxfr_act_dt_fr(value);
			return;
		}
		if ($acxfr_act_hm_fr.equalsIgnoreCase(name)) {
			acxfr_act_hm_fr(value);
			return;
		}
		if ($acxfr_act_dt_to.equalsIgnoreCase(name)) {
			acxfr_act_dt_to(value);
			return;
		}
		if ($acxfr_act_hm_to.equalsIgnoreCase(name)) {
			acxfr_act_hm_to(value);
			return;
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			ac_dt_fr(value);
			return;
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			ac_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			not_inst_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($part_comp_flg.equalsIgnoreCase(name)) {
			part_comp_flg(value);
			return;
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			comp_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			not_wms_flg(value);
			return;
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($schd_no_aprv_flg.equalsIgnoreCase(name)) {
			schd_no_aprv_flg(value);
			return;
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

