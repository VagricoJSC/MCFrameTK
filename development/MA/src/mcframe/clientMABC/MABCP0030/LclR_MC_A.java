package mcframe.clientMABC.MABCP0030;

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
 * ブロック"Lcl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class LclR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * CD ＣＤ.<p>
	 *
	 */
	public static final String $cd = "cd";
	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public static final String $da_cd = "da_cd";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public static final String $dpt_lvl_cd = "dpt_lvl_cd";
	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public static final String $aprv_role_cd = "aprv_role_cd";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public static final String $area_cd = "area_cd";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public static final String $bank_cd = "bank_cd";
	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public static final String $bank_branch_bank_cd = "bank_branch_bank_cd";
	/**
	 * Bank branch cd. 銀行支店ＣＤ.<p>
	 *
	 */
	public static final String $branch_cd = "branch_cd";
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public static final String $ac_itm_grp_cd = "ac_itm_grp_cd";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public static final String $wk_rsn_cd = "wk_rsn_cd";
	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public static final String $sls_upri_grp_cd = "sls_upri_grp_cd";
	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public static final String $sls_upri_rank_cd = "sls_upri_rank_cd";
	/**
	 * Offset group cd. 相殺グループＣＤ.<p>
	 *
	 */
	public static final String $setoff_grp_cd = "setoff_grp_cd";
	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public static final String $ship_valid_grp_cd = "ship_valid_grp_cd";
	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public static final String $itm_ship_grp_cd = "itm_ship_grp_cd";
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
	/**
	 * Packing container cd. 梱包容器ＣＤ.<p>
	 *
	 */
	public static final String $cntnr_cd = "cntnr_cd";
	/**
	 * Harbor cd. 港ＣＤ.<p>
	 *
	 */
	public static final String $port_cd = "port_cd";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public static final String $slip_form_cd = "slip_form_cd";
	/**
	 * Purchase forecast group cd. 購買内示グループＣＤ.<p>
	 *
	 */
	public static final String $pf_grp_cd = "pf_grp_cd";
	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public static final String $itm_spec_grp_cd = "itm_spec_grp_cd";
	/**
	 * Item configuration group cd. 品目構成グループＣＤ.<p>
	 *
	 */
	public static final String $itm_comp_grp_cd = "itm_comp_grp_cd";
	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public static final String $jnl_act_cd = "jnl_act_cd";
	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public static final String $jnl_grp_cd = "jnl_grp_cd";
	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public static final String $jnl_ptn_cd = "jnl_ptn_cd";
	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public static final String $auto_jnl_key_cd = "auto_jnl_key_cd";
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public static final String $wk_day_cd = "wk_day_cd";
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
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public static final String $rsrc_cd = "rsrc_cd";
	/**
	 * HS classification cd. ＨＳ分類ＣＤ.<p>
	 *
	 */
	public static final String $hs_grp_cd = "hs_grp_cd";
	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public static final String $alc_ptn_cd = "alc_ptn_cd";
	/**
	 * Item category group cd. 品群グループＣＤ.<p>
	 *
	 */
	public static final String $ctg_grp_cd = "ctg_grp_cd";
	/**
	 * Calculation run pattern cd. 計算実行パタンＣＤ.<p>
	 *
	 */
	public static final String $act_ptn_cd = "act_ptn_cd";
	/**
	 * General purpose allocation classification cd. 汎用配賦分類ＣＤ.<p>
	 *
	 */
	public static final String $gp_alc_cd = "gp_alc_cd";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public static final String $rpt_ptn_cd = "rpt_ptn_cd";
	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public static final String $menu_cd = "menu_cd";
	/**
	 * Warehousing business cd. 倉庫事業者ＣＤ.<p>
	 *
	 */
	public static final String $site_co_cd = "site_co_cd";
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public static final String $lcl_cd = "lcl_cd";
	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public static final String $lcl_nm = "lcl_nm";
	/**
	 * Data access name データアクセス名.<p>
	 *
	 */
	public static final String $da_nm = "da_nm";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $def_dpt_nm = "def_dpt_nm";
	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public static final String $dpt_lvl_nm = "dpt_lvl_nm";
	/**
	 * Approval role name 承認役割名.<p>
	 *
	 */
	public static final String $aprv_role_nm = "aprv_role_nm";
	/**
	 * Country name 国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public static final String $area_nm = "area_nm";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Bank name 銀行名.<p>
	 *
	 */
	public static final String $bank_nm = "bank_nm";
	/**
	 * Bank branch name 銀行支店名.<p>
	 *
	 */
	public static final String $branch_nm = "branch_nm";
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public static final String $bank_ac_nm = "bank_ac_nm";
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public static final String $xrate_nm = "xrate_nm";
	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public static final String $cal_nm = "cal_nm";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Accounting item classification name 会計品目分類名.<p>
	 *
	 */
	public static final String $ac_itm_grp_nm = "ac_itm_grp_nm";
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public static final String $tel = "tel";
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public static final String $fax = "fax";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public static final String $wk_cost_nm = "wk_cost_nm";
	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public static final String $wk_cost_unit_nm = "wk_cost_unit_nm";
	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public static final String $wk_rsn_nm = "wk_rsn_nm";
	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public static final String $sls_upri_grp_nm = "sls_upri_grp_nm";
	/**
	 * Sales unit price rank name 販売単価ランク名.<p>
	 *
	 */
	public static final String $sls_upri_rank_nm = "sls_upri_rank_nm";
	/**
	 * Offset group name 相殺グループ名.<p>
	 *
	 */
	public static final String $setoff_grp_nm = "setoff_grp_nm";
	/**
	 * Shipping expiration date group name 出荷有効期限グループ名.<p>
	 *
	 */
	public static final String $ship_valid_grp_nm = "ship_valid_grp_nm";
	/**
	 * Item shipping group name 品目出荷グループ名.<p>
	 *
	 */
	public static final String $itm_ship_grp_nm = "itm_ship_grp_nm";
	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public static final String $trnspt_nm = "trnspt_nm";
	/**
	 * Packing container name 梱包容器名.<p>
	 *
	 */
	public static final String $cntnr_nm = "cntnr_nm";
	/**
	 * Harbor name 港名.<p>
	 *
	 */
	public static final String $port_nm = "port_nm";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Slip report name 伝票帳票名.<p>
	 *
	 */
	public static final String $slip_form_nm = "slip_form_nm";
	/**
	 * Purchase forecast group name 購買内示グループ名.<p>
	 *
	 */
	public static final String $pf_grp_nm = "pf_grp_nm";
	/**
	 * Item specification classification name 品目仕様分類名.<p>
	 *
	 */
	public static final String $itm_spec_grp_nm = "itm_spec_grp_nm";
	/**
	 * Item configuration group name 品目構成グループ名.<p>
	 *
	 */
	public static final String $itm_comp_grp_nm = "itm_comp_grp_nm";
	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public static final String $jnl_act_nm = "jnl_act_nm";
	/**
	 * Journal group name 仕訳グループ名.<p>
	 *
	 */
	public static final String $jnl_grp_nm = "jnl_grp_nm";
	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public static final String $jnl_ptn_nm = "jnl_ptn_nm";
	/**
	 * Auto-journal key name 自動仕訳キー名.<p>
	 *
	 */
	public static final String $auto_jnl_key_nm = "auto_jnl_key_nm";
	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public static final String $insp_ptn_nm = "insp_ptn_nm";
	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public static final String $wk_day_nm = "wk_day_nm";
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public static final String $ship_term_nm = "ship_term_nm";
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public static final String $ship_wk_nm = "ship_wk_nm";
	/**
	 * Resource name 資源名.<p>
	 *
	 */
	public static final String $rsrc_nm = "rsrc_nm";
	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public static final String $rsrc_unit_nm = "rsrc_unit_nm";
	/**
	 * HS classification name ＨＳ分類名.<p>
	 *
	 */
	public static final String $hs_grp_nm = "hs_grp_nm";
	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public static final String $alc_ptn_nm = "alc_ptn_nm";
	/**
	 * Item category group name 品群グループ名.<p>
	 *
	 */
	public static final String $ctg_grp_nm = "ctg_grp_nm";
	/**
	 * Calculation run pattern name 計算実行パタン名.<p>
	 *
	 */
	public static final String $act_ptn_nm = "act_ptn_nm";
	/**
	 * General purpose allocation classification name 汎用配賦分類名.<p>
	 *
	 */
	public static final String $gp_alc_nm = "gp_alc_nm";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public static final String $rpt_ptn_nm = "rpt_ptn_nm";
	/**
	 * Menu name メニュー名.<p>
	 *
	 */
	public static final String $menu_nm = "menu_nm";
	/**
	 * Warehousing business name 倉庫事業者名.<p>
	 *
	 */
	public static final String $site_co_nm = "site_co_nm";
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


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cd_META = createStringMeta($cd);
	public static final MCMeta da_cd_META = createCommonMeta($da_cd, mcframe.commonMA.meta.MA_META.DA_CD);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_lvl_cd_META = createCommonMeta($dpt_lvl_cd, mcframe.commonMA.meta.MA_META.DPT_LVL_CD);
	public static final MCMeta aprv_role_cd_META = createCommonMeta($aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta area_cd_META = createCommonMeta($area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_branch_bank_cd_META = createCommonMeta($bank_branch_bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta branch_cd_META = createCommonMeta($branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta ac_itm_grp_cd_META = createCommonMeta($ac_itm_grp_cd, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_CD);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wk_rsn_cd_META = createCommonMeta($wk_rsn_cd, mcframe.commonMA.meta.MA_META.WK_RSN_CD);
	public static final MCMeta sls_upri_grp_cd_META = createCommonMeta($sls_upri_grp_cd, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_CD);
	public static final MCMeta sls_upri_rank_cd_META = createCommonMeta($sls_upri_rank_cd, mcframe.commonMA.meta.MA_META.SLS_UPRI_RANK_CD);
	public static final MCMeta setoff_grp_cd_META = createCommonMeta($setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta ship_valid_grp_cd_META = createCommonMeta($ship_valid_grp_cd, mcframe.commonMA.meta.MA_META.SHIP_VALID_GRP_CD);
	public static final MCMeta itm_ship_grp_cd_META = createCommonMeta($itm_ship_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SHIP_GRP_CD);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta cntnr_cd_META = createCommonMeta($cntnr_cd, mcframe.commonMA.meta.MA_META.CNTNR_CD);
	public static final MCMeta port_cd_META = createCommonMeta($port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta slip_form_cd_META = createCommonMeta($slip_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta pf_grp_cd_META = createCommonMeta($pf_grp_cd, mcframe.commonMA.meta.MA_META.PF_GRP_CD);
	public static final MCMeta itm_spec_grp_cd_META = createCommonMeta($itm_spec_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SPEC_GRP_CD);
	public static final MCMeta itm_comp_grp_cd_META = createCommonMeta($itm_comp_grp_cd, mcframe.commonMA.meta.MA_META.ITM_COMP_GRP_CD);
	public static final MCMeta jnl_act_cd_META = createCommonMeta($jnl_act_cd, mcframe.commonMA.meta.MA_META.JNL_ACT_CD);
	public static final MCMeta jnl_grp_cd_META = createCommonMeta($jnl_grp_cd, mcframe.commonMA.meta.MA_META.JNL_GRP_CD);
	public static final MCMeta jnl_ptn_cd_META = createCommonMeta($jnl_ptn_cd, mcframe.commonMA.meta.MA_META.JNL_PTN_CD);
	public static final MCMeta auto_jnl_key_cd_META = createCommonMeta($auto_jnl_key_cd, mcframe.commonMA.meta.MA_META.AUTO_JNL_KEY_CD);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta wk_day_cd_META = createCommonMeta($wk_day_cd, mcframe.commonMA.meta.MA_META.WK_DAY_CD);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta rsrc_cd_META = createCommonMeta($rsrc_cd, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta hs_grp_cd_META = createCommonMeta($hs_grp_cd, mcframe.commonMA.meta.MA_META.HS_GRP_CD);
	public static final MCMeta alc_ptn_cd_META = createCommonMeta($alc_ptn_cd, mcframe.commonMA.meta.MA_META.ALC_PTN_CD);
	public static final MCMeta ctg_grp_cd_META = createCommonMeta($ctg_grp_cd, mcframe.commonMA.meta.MA_META.CTG_GRP_CD);
	public static final MCMeta act_ptn_cd_META = createCommonMeta($act_ptn_cd, mcframe.commonMA.meta.MA_META.ACT_PTN_CD);
	public static final MCMeta gp_alc_cd_META = createCommonMeta($gp_alc_cd, mcframe.commonMA.meta.MA_META.GP_ALC_CD);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta rpt_ptn_cd_META = createCommonMeta($rpt_ptn_cd, mcframe.commonMA.meta.MA_META.RPT_PTN_CD);
	public static final MCMeta menu_cd_META = createCommonMeta($menu_cd, mcframe.commonMA.meta.MA_META.MENU_CD);
	public static final MCMeta site_co_cd_META = createCommonMeta($site_co_cd, mcframe.commonMA.meta.MA_META.SITE_CO_CD);
	public static final MCMeta lcl_cd_META = createCommonMeta($lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta lcl_nm_META = createCommonMeta($lcl_nm, mcframe.commonMA.meta.MA_META.LCL_NM);
	public static final MCMeta da_nm_META = createCommonMeta($da_nm, mcframe.commonMA.meta.MA_META.DA_NM);
	public static final MCMeta def_dpt_nm_META = createCommonMeta($def_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_lvl_nm_META = createCommonMeta($dpt_lvl_nm, mcframe.commonMA.meta.MA_META.DPT_LVL_NM);
	public static final MCMeta aprv_role_nm_META = createCommonMeta($aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta area_nm_META = createCommonMeta($area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta bank_nm_META = createCommonMeta($bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta branch_nm_META = createCommonMeta($branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta xrate_nm_META = createCommonMeta($xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta cal_nm_META = createCommonMeta($cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta ac_itm_grp_nm_META = createCommonMeta($ac_itm_grp_nm, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_NM);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta wk_cost_nm_META = createCommonMeta($wk_cost_nm, mcframe.commonMA.meta.MA_META.WK_COST_NM);
	public static final MCMeta wk_cost_unit_nm_META = createCommonMeta($wk_cost_unit_nm, mcframe.commonMA.meta.MA_META.WK_COST_UNIT_NM);
	public static final MCMeta wk_rsn_nm_META = createCommonMeta($wk_rsn_nm, mcframe.commonMA.meta.MA_META.WK_RSN_NM);
	public static final MCMeta sls_upri_grp_nm_META = createCommonMeta($sls_upri_grp_nm, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_NM);
	public static final MCMeta sls_upri_rank_nm_META = createCommonMeta($sls_upri_rank_nm, mcframe.commonMA.meta.MA_META.SLS_UPRI_RANK_NM);
	public static final MCMeta setoff_grp_nm_META = createCommonMeta($setoff_grp_nm, mcframe.commonMA.meta.MA_META.SETOFF_GRP_NM);
	public static final MCMeta ship_valid_grp_nm_META = createCommonMeta($ship_valid_grp_nm, mcframe.commonMA.meta.MA_META.SHIP_VALID_GRP_NM);
	public static final MCMeta itm_ship_grp_nm_META = createCommonMeta($itm_ship_grp_nm, mcframe.commonMA.meta.MA_META.ITM_SHIP_GRP_NM);
	public static final MCMeta trnspt_nm_META = createCommonMeta($trnspt_nm, mcframe.commonMA.meta.MA_META.TRNSPT_NM);
	public static final MCMeta cntnr_nm_META = createCommonMeta($cntnr_nm, mcframe.commonMA.meta.MA_META.CNTNR_NM);
	public static final MCMeta port_nm_META = createCommonMeta($port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta slip_form_nm_META = createCommonMeta($slip_form_nm, mcframe.commonMA.meta.MA_META.SLIP_FORM_NM);
	public static final MCMeta pf_grp_nm_META = createCommonMeta($pf_grp_nm, mcframe.commonMA.meta.MA_META.PF_GRP_NM);
	public static final MCMeta itm_spec_grp_nm_META = createCommonMeta($itm_spec_grp_nm, mcframe.commonMA.meta.MA_META.ITM_SPEC_GRP_NM);
	public static final MCMeta itm_comp_grp_nm_META = createCommonMeta($itm_comp_grp_nm, mcframe.commonMA.meta.MA_META.ITM_COMP_GRP_NM);
	public static final MCMeta jnl_act_nm_META = createCommonMeta($jnl_act_nm, mcframe.commonMA.meta.MA_META.JNL_ACT_NM);
	public static final MCMeta jnl_grp_nm_META = createCommonMeta($jnl_grp_nm, mcframe.commonMA.meta.MA_META.JNL_GRP_NM);
	public static final MCMeta jnl_ptn_nm_META = createCommonMeta($jnl_ptn_nm, mcframe.commonMA.meta.MA_META.JNL_PTN_NM);
	public static final MCMeta auto_jnl_key_nm_META = createCommonMeta($auto_jnl_key_nm, mcframe.commonMA.meta.MA_META.AUTO_JNL_KEY_NM);
	public static final MCMeta insp_ptn_nm_META = createCommonMeta($insp_ptn_nm, mcframe.commonMA.meta.MA_META.INSP_PTN_NM);
	public static final MCMeta wk_day_nm_META = createCommonMeta($wk_day_nm, mcframe.commonMA.meta.MA_META.WK_DAY_NM);
	public static final MCMeta ship_term_nm_META = createCommonMeta($ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta ship_wk_nm_META = createCommonMeta($ship_wk_nm, mcframe.commonMA.meta.MA_META.SHIP_WK_NM);
	public static final MCMeta rsrc_nm_META = createCommonMeta($rsrc_nm, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_unit_nm_META = createCommonMeta($rsrc_unit_nm, mcframe.commonMA.meta.MA_META.RSRC_UNIT_NM);
	public static final MCMeta hs_grp_nm_META = createCommonMeta($hs_grp_nm, mcframe.commonMA.meta.MA_META.HS_GRP_NM);
	public static final MCMeta alc_ptn_nm_META = createCommonMeta($alc_ptn_nm, mcframe.commonMA.meta.MA_META.ALC_PTN_NM);
	public static final MCMeta ctg_grp_nm_META = createCommonMeta($ctg_grp_nm, mcframe.commonMA.meta.MA_META.CTG_GRP_NM);
	public static final MCMeta act_ptn_nm_META = createCommonMeta($act_ptn_nm, mcframe.commonMA.meta.MA_META.ACT_PTN_NM);
	public static final MCMeta gp_alc_nm_META = createCommonMeta($gp_alc_nm, mcframe.commonMA.meta.MA_META.GP_ALC_NM);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta rpt_ptn_nm_META = createCommonMeta($rpt_ptn_nm, mcframe.commonMA.meta.MA_META.RPT_PTN_NM);
	public static final MCMeta menu_nm_META = createCommonMeta($menu_nm, mcframe.commonMA.meta.MA_META.MENU_NM);
	public static final MCMeta site_co_nm_META = createCommonMeta($site_co_nm, mcframe.commonMA.meta.MA_META.SITE_CO_NM);
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

	protected static final ConstMetaList<LclR> constMetas = new ConstMetaList<LclR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			cd_META,
			da_cd_META,
			dpt_cd_META,
			dpt_lvl_cd_META,
			aprv_role_cd_META,
			cntry_cd_META,
			area_cd_META,
			cur_cd_META,
			unit_cd_META,
			bank_cd_META,
			bank_branch_bank_cd_META,
			branch_cd_META,
			bank_ac_cd_META,
			xrate_cd_META,
			cal_cd_META,
			itm_jnl_cd_META,
			ac_itm_grp_cd_META,
			ac_rsn_cd_META,
			site_cd_META,
			loc_grp_cd_META,
			lg_grp_cd_META,
			alloc_grp_cd_META,
			wg_cd_META,
			oper_cd_META,
			wk_cost_cd_META,
			wk_rsn_cd_META,
			sls_upri_grp_cd_META,
			sls_upri_rank_cd_META,
			setoff_grp_cd_META,
			ship_valid_grp_cd_META,
			itm_ship_grp_cd_META,
			trnspt_cd_META,
			cntnr_cd_META,
			port_cd_META,
			gd_cd_META,
			trd_cd_META,
			slip_form_cd_META,
			pf_grp_cd_META,
			itm_spec_grp_cd_META,
			itm_comp_grp_cd_META,
			jnl_act_cd_META,
			jnl_grp_cd_META,
			jnl_ptn_cd_META,
			auto_jnl_key_cd_META,
			insp_ptn_cd_META,
			wk_day_cd_META,
			ship_term_cd_META,
			ship_wk_cd_META,
			rsrc_cd_META,
			hs_grp_cd_META,
			alc_ptn_cd_META,
			ctg_grp_cd_META,
			act_ptn_cd_META,
			gp_alc_cd_META,
			calc_ctg_cd_META,
			rpt_ptn_cd_META,
			menu_cd_META,
			site_co_cd_META,
			lcl_cd_META,
			lcl_nm_META,
			da_nm_META,
			def_dpt_nm_META,
			dpt_lvl_nm_META,
			aprv_role_nm_META,
			cntry_nm_META,
			area_nm_META,
			cur_nm_META,
			unit_nm_META,
			bank_nm_META,
			branch_nm_META,
			bank_ac_nm_META,
			xrate_nm_META,
			cal_nm_META,
			itm_jnl_nm_META,
			ac_itm_grp_nm_META,
			ac_rsn_nm_META,
			site_nm_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			tel_META,
			fax_META,
			loc_grp_nm_META,
			lg_grp_nm_META,
			alloc_grp_nm_META,
			wg_nm_META,
			oper_nm_META,
			wk_cost_nm_META,
			wk_cost_unit_nm_META,
			wk_rsn_nm_META,
			sls_upri_grp_nm_META,
			sls_upri_rank_nm_META,
			setoff_grp_nm_META,
			ship_valid_grp_nm_META,
			itm_ship_grp_nm_META,
			trnspt_nm_META,
			cntnr_nm_META,
			port_nm_META,
			gd_nm_META,
			trd_nm_META,
			slip_form_nm_META,
			pf_grp_nm_META,
			itm_spec_grp_nm_META,
			itm_comp_grp_nm_META,
			jnl_act_nm_META,
			jnl_grp_nm_META,
			jnl_ptn_nm_META,
			auto_jnl_key_nm_META,
			insp_ptn_nm_META,
			wk_day_nm_META,
			ship_term_nm_META,
			ship_wk_nm_META,
			rsrc_nm_META,
			rsrc_unit_nm_META,
			hs_grp_nm_META,
			alc_ptn_nm_META,
			ctg_grp_nm_META,
			act_ptn_nm_META,
			gp_alc_nm_META,
			calc_ctg_nm_META,
			rpt_ptn_nm_META,
			menu_nm_META,
			site_co_nm_META,
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
			$cd,	// cd
			$da_cd,	// da_cd
			$dpt_cd,	// dpt_cd
			$dpt_lvl_cd,	// dpt_lvl_cd
			$aprv_role_cd,	// aprv_role_cd
			$cntry_cd,	// cntry_cd
			$area_cd,	// area_cd
			$cur_cd,	// cur_cd
			$unit_cd,	// unit_cd
			$bank_cd,	// bank_cd
			$bank_branch_bank_cd,	// bank_branch_bank_cd
			$branch_cd,	// branch_cd
			$bank_ac_cd,	// bank_ac_cd
			$xrate_cd,	// xrate_cd
			$cal_cd,	// cal_cd
			$itm_jnl_cd,	// itm_jnl_cd
			$ac_itm_grp_cd,	// ac_itm_grp_cd
			$ac_rsn_cd,	// ac_rsn_cd
			$site_cd,	// site_cd
			$loc_grp_cd,	// loc_grp_cd
			$lg_grp_cd,	// lg_grp_cd
			$alloc_grp_cd,	// alloc_grp_cd
			$wg_cd,	// wg_cd
			$oper_cd,	// oper_cd
			$wk_cost_cd,	// wk_cost_cd
			$wk_rsn_cd,	// wk_rsn_cd
			$sls_upri_grp_cd,	// sls_upri_grp_cd
			$sls_upri_rank_cd,	// sls_upri_rank_cd
			$setoff_grp_cd,	// setoff_grp_cd
			$ship_valid_grp_cd,	// ship_valid_grp_cd
			$itm_ship_grp_cd,	// itm_ship_grp_cd
			$trnspt_cd,	// trnspt_cd
			$cntnr_cd,	// cntnr_cd
			$port_cd,	// port_cd
			$gd_cd,	// gd_cd
			$trd_cd,	// trd_cd
			$slip_form_cd,	// slip_form_cd
			$pf_grp_cd,	// pf_grp_cd
			$itm_spec_grp_cd,	// itm_spec_grp_cd
			$itm_comp_grp_cd,	// itm_comp_grp_cd
			$jnl_act_cd,	// jnl_act_cd
			$jnl_grp_cd,	// jnl_grp_cd
			$jnl_ptn_cd,	// jnl_ptn_cd
			$auto_jnl_key_cd,	// auto_jnl_key_cd
			$insp_ptn_cd,	// insp_ptn_cd
			$wk_day_cd,	// wk_day_cd
			$ship_term_cd,	// ship_term_cd
			$ship_wk_cd,	// ship_wk_cd
			$rsrc_cd,	// rsrc_cd
			$hs_grp_cd,	// hs_grp_cd
			$alc_ptn_cd,	// alc_ptn_cd
			$ctg_grp_cd,	// ctg_grp_cd
			$act_ptn_cd,	// act_ptn_cd
			$gp_alc_cd,	// gp_alc_cd
			$calc_ctg_cd,	// calc_ctg_cd
			$rpt_ptn_cd,	// rpt_ptn_cd
			$menu_cd,	// menu_cd
			$site_co_cd,	// site_co_cd
			$lcl_cd	// lcl_cd
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[VISIBLE]のキー定数 */
	public static final String $$VISIBLE = "VISIBLE";
	/** 項目属性情報のグループ[ADMIN]のキー定数 */
	public static final String $$ADMIN = "ADMIN";
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
		new MCExtMap.Entry($$VISIBLE, new MCExtList(
			new String[][]{
				{$da_cd, "DA"},	// da_cd
				{$dpt_cd, "DPT_BASE"},	// dpt_cd
				{$dpt_lvl_cd, "DPT_LVL"},	// dpt_lvl_cd
				{$aprv_role_cd, "APRV_ROLE"},	// aprv_role_cd
				{$cntry_cd, "CNTRY"},	// cntry_cd
				{$area_cd, "AREA"},	// area_cd
				{$cur_cd, "CUR"},	// cur_cd
				{$unit_cd, "UNIT"},	// unit_cd
				{$bank_cd, "BANK"},	// bank_cd
				{$bank_branch_bank_cd, "BANK_BRANCH"},	// bank_branch_bank_cd
				{$branch_cd, "BANK_BRANCH"},	// branch_cd
				{$bank_ac_cd, "BANK_AC"},	// bank_ac_cd
				{$xrate_cd, "XRATE"},	// xrate_cd
				{$cal_cd, "CAL_BASE"},	// cal_cd
				{$itm_jnl_cd, "ITM_JNL"},	// itm_jnl_cd
				{$ac_itm_grp_cd, "AC_ITM_GRP"},	// ac_itm_grp_cd
				{$ac_rsn_cd, "AC_RSN"},	// ac_rsn_cd
				{$site_cd, "SITE"},	// site_cd
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$alloc_grp_cd, "ALLOC_GRP"},	// alloc_grp_cd
				{$wg_cd, "WG"},	// wg_cd
				{$oper_cd, "OPER"},	// oper_cd
				{$wk_cost_cd, "WK_COST"},	// wk_cost_cd
				{$wk_rsn_cd, "WK_RSN"},	// wk_rsn_cd
				{$sls_upri_grp_cd, "SLS_UPRI_GRP"},	// sls_upri_grp_cd
				{$sls_upri_rank_cd, "SLS_UPRI_RANK"},	// sls_upri_rank_cd
				{$setoff_grp_cd, "SETOFF_GRP"},	// setoff_grp_cd
				{$ship_valid_grp_cd, "SHIP_VALID"},	// ship_valid_grp_cd
				{$itm_ship_grp_cd, "ITM_SHIP_GRP"},	// itm_ship_grp_cd
				{$trnspt_cd, "TRNSPT"},	// trnspt_cd
				{$cntnr_cd, "EX_CNTNR"},	// cntnr_cd
				{$port_cd, "EXIM_PORT"},	// port_cd
				{$gd_cd, "STK_GD"},	// gd_cd
				{$trd_cd, "TRD"},	// trd_cd
				{$slip_form_cd, "SLIP_FORM"},	// slip_form_cd
				{$pf_grp_cd, "PF_GRP"},	// pf_grp_cd
				{$itm_spec_grp_cd, "ITM_SPEC_GRP"},	// itm_spec_grp_cd
				{$itm_comp_grp_cd, "ITM_COMP_GRP"},	// itm_comp_grp_cd
				{$jnl_act_cd, "JNL_ACT"},	// jnl_act_cd
				{$jnl_grp_cd, "JNL_GRP"},	// jnl_grp_cd
				{$jnl_ptn_cd, "JNL_PTN_BASE"},	// jnl_ptn_cd
				{$auto_jnl_key_cd, "AUTO_JNL_KEY"},	// auto_jnl_key_cd
				{$insp_ptn_cd, "INSP_PTN"},	// insp_ptn_cd
				{$wk_day_cd, "WK_DAY"},	// wk_day_cd
				{$ship_term_cd, "SHIP_TERM"},	// ship_term_cd
				{$ship_wk_cd, "SHIP_WK"},	// ship_wk_cd
				{$rsrc_cd, "RSRC"},	// rsrc_cd
				{$hs_grp_cd, "HS_GRP"},	// hs_grp_cd
				{$alc_ptn_cd, "ALC_PTN"},	// alc_ptn_cd
				{$ctg_grp_cd, "CTG_GRP"},	// ctg_grp_cd
				{$act_ptn_cd, "ACT_PTN"},	// act_ptn_cd
				{$gp_alc_cd, "GP_ALC"},	// gp_alc_cd
				{$calc_ctg_cd, "CALC_CTG"},	// calc_ctg_cd
				{$rpt_ptn_cd, "RPT_PTN"},	// rpt_ptn_cd
				{$menu_cd, "COST_MENU"},	// menu_cd
				{$site_co_cd, "SITE_CO"},	// site_co_cd
				{$da_nm, "DA"},	// da_nm
				{$def_dpt_nm, "DPT_BASE"},	// def_dpt_nm
				{$dpt_lvl_nm, "DPT_LVL"},	// dpt_lvl_nm
				{$aprv_role_nm, "APRV_ROLE"},	// aprv_role_nm
				{$cntry_nm, "CNTRY"},	// cntry_nm
				{$area_nm, "AREA"},	// area_nm
				{$cur_nm, "CUR"},	// cur_nm
				{$unit_nm, "UNIT"},	// unit_nm
				{$bank_nm, "BANK"},	// bank_nm
				{$branch_nm, "BANK_BRANCH"},	// branch_nm
				{$bank_ac_nm, "BANK_AC"},	// bank_ac_nm
				{$xrate_nm, "XRATE"},	// xrate_nm
				{$cal_nm, "CAL_BASE"},	// cal_nm
				{$itm_jnl_nm, "ITM_JNL"},	// itm_jnl_nm
				{$ac_itm_grp_nm, "AC_ITM_GRP"},	// ac_itm_grp_nm
				{$ac_rsn_nm, "AC_RSN"},	// ac_rsn_nm
				{$site_nm, "SITE"},	// site_nm
				{$zip_cd, "SITE"},	// zip_cd
				{$addr1, "SITE"},	// addr1
				{$addr2, "SITE"},	// addr2
				{$addr3, "SITE"},	// addr3
				{$addr4, "SITE"},	// addr4
				{$tel, "SITE"},	// tel
				{$fax, "SITE"},	// fax
				{$loc_grp_nm, "LOC_GRP"},	// loc_grp_nm
				{$lg_grp_nm, "LG_GRP"},	// lg_grp_nm
				{$alloc_grp_nm, "ALLOC_GRP"},	// alloc_grp_nm
				{$wg_nm, "WG"},	// wg_nm
				{$oper_nm, "OPER"},	// oper_nm
				{$wk_cost_nm, "WK_COST"},	// wk_cost_nm
				{$wk_cost_unit_nm, "WK_COST"},	// wk_cost_unit_nm
				{$wk_rsn_nm, "WK_RSN"},	// wk_rsn_nm
				{$sls_upri_grp_nm, "SLS_UPRI_GRP"},	// sls_upri_grp_nm
				{$sls_upri_rank_nm, "SLS_UPRI_RANK"},	// sls_upri_rank_nm
				{$setoff_grp_nm, "SETOFF_GRP"},	// setoff_grp_nm
				{$ship_valid_grp_nm, "SHIP_VALID"},	// ship_valid_grp_nm
				{$itm_ship_grp_nm, "ITM_SHIP_GRP"},	// itm_ship_grp_nm
				{$trnspt_nm, "TRNSPT"},	// trnspt_nm
				{$cntnr_nm, "EX_CNTNR"},	// cntnr_nm
				{$port_nm, "EXIM_PORT"},	// port_nm
				{$gd_nm, "STK_GD"},	// gd_nm
				{$trd_nm, "TRD"},	// trd_nm
				{$slip_form_nm, "SLIP_FORM"},	// slip_form_nm
				{$pf_grp_nm, "PF_GRP"},	// pf_grp_nm
				{$itm_spec_grp_nm, "ITM_SPEC_GRP"},	// itm_spec_grp_nm
				{$itm_comp_grp_nm, "ITM_COMP_GRP"},	// itm_comp_grp_nm
				{$jnl_act_nm, "JNL_ACT"},	// jnl_act_nm
				{$jnl_grp_nm, "JNL_GRP"},	// jnl_grp_nm
				{$jnl_ptn_nm, "JNL_PTN_BASE"},	// jnl_ptn_nm
				{$auto_jnl_key_nm, "AUTO_JNL_KEY"},	// auto_jnl_key_nm
				{$insp_ptn_nm, "INSP_PTN"},	// insp_ptn_nm
				{$wk_day_nm, "WK_DAY"},	// wk_day_nm
				{$ship_term_nm, "SHIP_TERM"},	// ship_term_nm
				{$ship_wk_nm, "SHIP_WK"},	// ship_wk_nm
				{$rsrc_nm, "RSRC"},	// rsrc_nm
				{$rsrc_unit_nm, "RSRC"},	// rsrc_unit_nm
				{$hs_grp_nm, "HS_GRP"},	// hs_grp_nm
				{$alc_ptn_nm, "ALC_PTN"},	// alc_ptn_nm
				{$ctg_grp_nm, "CTG_GRP"},	// ctg_grp_nm
				{$act_ptn_nm, "ACT_PTN"},	// act_ptn_nm
				{$gp_alc_nm, "GP_ALC"},	// gp_alc_nm
				{$calc_ctg_nm, "CALC_CTG"},	// calc_ctg_nm
				{$rpt_ptn_nm, "RPT_PTN"},	// rpt_ptn_nm
				{$menu_nm, "COST_MENU"},	// menu_nm
				{$site_co_nm, "SITE_CO"}	// site_co_nm
			}
		)),
		new MCExtMap.Entry($$ADMIN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$addr1, "ADDR1"},	// addr1
				{$addr2, "ADDR2"},	// addr2
				{$addr3, "ADDR3"},	// addr3
				{$addr4, "ADDR4"}	// addr4
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
	protected LclR_MC_A(ConstMetaList<? extends LclR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LclR clone() {
		return (LclR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LclR createInstance() {
		return (LclR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LclR getValues(String... names) {
		return (LclR) super.getValues(names);
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
	 * CD ＣＤ.<p>
	 *
	 */
	public String cd() {
		return getConstString(offset + 1, $cd);
	}

	/**
	 * CD ＣＤ.<p>
	 *
	 */
	public void cd(String value) {
		setConstString(offset + 1, $cd, value);
	}


	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public String da_cd() {
		return getConstString(offset + 2, $da_cd);
	}

	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public void da_cd(String value) {
		setConstString(offset + 2, $da_cd, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 3, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 3, $dpt_cd, value);
	}


	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public String dpt_lvl_cd() {
		return getConstString(offset + 4, $dpt_lvl_cd);
	}

	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public void dpt_lvl_cd(String value) {
		setConstString(offset + 4, $dpt_lvl_cd, value);
	}


	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public String aprv_role_cd() {
		return getConstString(offset + 5, $aprv_role_cd);
	}

	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public void aprv_role_cd(String value) {
		setConstString(offset + 5, $aprv_role_cd, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 6, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 6, $cntry_cd, value);
	}


	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 7, $area_cd);
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 7, $area_cd, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 8, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 8, $cur_cd, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 9, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 9, $unit_cd, value);
	}


	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 10, $bank_cd);
	}

	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 10, $bank_cd, value);
	}


	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public String bank_branch_bank_cd() {
		return getConstString(offset + 11, $bank_branch_bank_cd);
	}

	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public void bank_branch_bank_cd(String value) {
		setConstString(offset + 11, $bank_branch_bank_cd, value);
	}


	/**
	 * Bank branch cd. 銀行支店ＣＤ.<p>
	 *
	 */
	public String branch_cd() {
		return getConstString(offset + 12, $branch_cd);
	}

	/**
	 * Bank branch cd. 銀行支店ＣＤ.<p>
	 *
	 */
	public void branch_cd(String value) {
		setConstString(offset + 12, $branch_cd, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 13, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 13, $bank_ac_cd, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 14, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 14, $xrate_cd, value);
	}


	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 15, $cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 15, $cal_cd, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 16, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 16, $itm_jnl_cd, value);
	}


	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public String ac_itm_grp_cd() {
		return getConstString(offset + 17, $ac_itm_grp_cd);
	}

	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public void ac_itm_grp_cd(String value) {
		setConstString(offset + 17, $ac_itm_grp_cd, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 18, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 18, $ac_rsn_cd, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 19, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 19, $site_cd, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 20, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 20, $loc_grp_cd, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 21, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 21, $lg_grp_cd, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 22, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 22, $alloc_grp_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 23, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 23, $wg_cd, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 24, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 24, $oper_cd, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 25, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 25, $wk_cost_cd, value);
	}


	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public String wk_rsn_cd() {
		return getConstString(offset + 26, $wk_rsn_cd);
	}

	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public void wk_rsn_cd(String value) {
		setConstString(offset + 26, $wk_rsn_cd, value);
	}


	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public String sls_upri_grp_cd() {
		return getConstString(offset + 27, $sls_upri_grp_cd);
	}

	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public void sls_upri_grp_cd(String value) {
		setConstString(offset + 27, $sls_upri_grp_cd, value);
	}


	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public String sls_upri_rank_cd() {
		return getConstString(offset + 28, $sls_upri_rank_cd);
	}

	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public void sls_upri_rank_cd(String value) {
		setConstString(offset + 28, $sls_upri_rank_cd, value);
	}


	/**
	 * Offset group cd. 相殺グループＣＤ.<p>
	 *
	 */
	public String setoff_grp_cd() {
		return getConstString(offset + 29, $setoff_grp_cd);
	}

	/**
	 * Offset group cd. 相殺グループＣＤ.<p>
	 *
	 */
	public void setoff_grp_cd(String value) {
		setConstString(offset + 29, $setoff_grp_cd, value);
	}


	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public String ship_valid_grp_cd() {
		return getConstString(offset + 30, $ship_valid_grp_cd);
	}

	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public void ship_valid_grp_cd(String value) {
		setConstString(offset + 30, $ship_valid_grp_cd, value);
	}


	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public String itm_ship_grp_cd() {
		return getConstString(offset + 31, $itm_ship_grp_cd);
	}

	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public void itm_ship_grp_cd(String value) {
		setConstString(offset + 31, $itm_ship_grp_cd, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 32, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 32, $trnspt_cd, value);
	}


	/**
	 * Packing container cd. 梱包容器ＣＤ.<p>
	 *
	 */
	public String cntnr_cd() {
		return getConstString(offset + 33, $cntnr_cd);
	}

	/**
	 * Packing container cd. 梱包容器ＣＤ.<p>
	 *
	 */
	public void cntnr_cd(String value) {
		setConstString(offset + 33, $cntnr_cd, value);
	}


	/**
	 * Harbor cd. 港ＣＤ.<p>
	 *
	 */
	public String port_cd() {
		return getConstString(offset + 34, $port_cd);
	}

	/**
	 * Harbor cd. 港ＣＤ.<p>
	 *
	 */
	public void port_cd(String value) {
		setConstString(offset + 34, $port_cd, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 35, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 35, $gd_cd, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 36, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 36, $trd_cd, value);
	}


	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public String slip_form_cd() {
		return getConstString(offset + 37, $slip_form_cd);
	}

	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public void slip_form_cd(String value) {
		setConstString(offset + 37, $slip_form_cd, value);
	}


	/**
	 * Purchase forecast group cd. 購買内示グループＣＤ.<p>
	 *
	 */
	public String pf_grp_cd() {
		return getConstString(offset + 38, $pf_grp_cd);
	}

	/**
	 * Purchase forecast group cd. 購買内示グループＣＤ.<p>
	 *
	 */
	public void pf_grp_cd(String value) {
		setConstString(offset + 38, $pf_grp_cd, value);
	}


	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public String itm_spec_grp_cd() {
		return getConstString(offset + 39, $itm_spec_grp_cd);
	}

	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public void itm_spec_grp_cd(String value) {
		setConstString(offset + 39, $itm_spec_grp_cd, value);
	}


	/**
	 * Item configuration group cd. 品目構成グループＣＤ.<p>
	 *
	 */
	public String itm_comp_grp_cd() {
		return getConstString(offset + 40, $itm_comp_grp_cd);
	}

	/**
	 * Item configuration group cd. 品目構成グループＣＤ.<p>
	 *
	 */
	public void itm_comp_grp_cd(String value) {
		setConstString(offset + 40, $itm_comp_grp_cd, value);
	}


	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public String jnl_act_cd() {
		return getConstString(offset + 41, $jnl_act_cd);
	}

	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public void jnl_act_cd(String value) {
		setConstString(offset + 41, $jnl_act_cd, value);
	}


	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public String jnl_grp_cd() {
		return getConstString(offset + 42, $jnl_grp_cd);
	}

	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public void jnl_grp_cd(String value) {
		setConstString(offset + 42, $jnl_grp_cd, value);
	}


	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public String jnl_ptn_cd() {
		return getConstString(offset + 43, $jnl_ptn_cd);
	}

	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public void jnl_ptn_cd(String value) {
		setConstString(offset + 43, $jnl_ptn_cd, value);
	}


	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public String auto_jnl_key_cd() {
		return getConstString(offset + 44, $auto_jnl_key_cd);
	}

	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public void auto_jnl_key_cd(String value) {
		setConstString(offset + 44, $auto_jnl_key_cd, value);
	}


	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 45, $insp_ptn_cd);
	}

	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 45, $insp_ptn_cd, value);
	}


	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public String wk_day_cd() {
		return getConstString(offset + 46, $wk_day_cd);
	}

	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public void wk_day_cd(String value) {
		setConstString(offset + 46, $wk_day_cd, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 47, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 47, $ship_term_cd, value);
	}


	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 48, $ship_wk_cd);
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 48, $ship_wk_cd, value);
	}


	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public String rsrc_cd() {
		return getConstString(offset + 49, $rsrc_cd);
	}

	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public void rsrc_cd(String value) {
		setConstString(offset + 49, $rsrc_cd, value);
	}


	/**
	 * HS classification cd. ＨＳ分類ＣＤ.<p>
	 *
	 */
	public String hs_grp_cd() {
		return getConstString(offset + 50, $hs_grp_cd);
	}

	/**
	 * HS classification cd. ＨＳ分類ＣＤ.<p>
	 *
	 */
	public void hs_grp_cd(String value) {
		setConstString(offset + 50, $hs_grp_cd, value);
	}


	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public String alc_ptn_cd() {
		return getConstString(offset + 51, $alc_ptn_cd);
	}

	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public void alc_ptn_cd(String value) {
		setConstString(offset + 51, $alc_ptn_cd, value);
	}


	/**
	 * Item category group cd. 品群グループＣＤ.<p>
	 *
	 */
	public String ctg_grp_cd() {
		return getConstString(offset + 52, $ctg_grp_cd);
	}

	/**
	 * Item category group cd. 品群グループＣＤ.<p>
	 *
	 */
	public void ctg_grp_cd(String value) {
		setConstString(offset + 52, $ctg_grp_cd, value);
	}


	/**
	 * Calculation run pattern cd. 計算実行パタンＣＤ.<p>
	 *
	 */
	public String act_ptn_cd() {
		return getConstString(offset + 53, $act_ptn_cd);
	}

	/**
	 * Calculation run pattern cd. 計算実行パタンＣＤ.<p>
	 *
	 */
	public void act_ptn_cd(String value) {
		setConstString(offset + 53, $act_ptn_cd, value);
	}


	/**
	 * General purpose allocation classification cd. 汎用配賦分類ＣＤ.<p>
	 *
	 */
	public String gp_alc_cd() {
		return getConstString(offset + 54, $gp_alc_cd);
	}

	/**
	 * General purpose allocation classification cd. 汎用配賦分類ＣＤ.<p>
	 *
	 */
	public void gp_alc_cd(String value) {
		setConstString(offset + 54, $gp_alc_cd, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 55, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 55, $calc_ctg_cd, value);
	}


	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public String rpt_ptn_cd() {
		return getConstString(offset + 56, $rpt_ptn_cd);
	}

	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public void rpt_ptn_cd(String value) {
		setConstString(offset + 56, $rpt_ptn_cd, value);
	}


	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public String menu_cd() {
		return getConstString(offset + 57, $menu_cd);
	}

	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public void menu_cd(String value) {
		setConstString(offset + 57, $menu_cd, value);
	}


	/**
	 * Warehousing business cd. 倉庫事業者ＣＤ.<p>
	 *
	 */
	public String site_co_cd() {
		return getConstString(offset + 58, $site_co_cd);
	}

	/**
	 * Warehousing business cd. 倉庫事業者ＣＤ.<p>
	 *
	 */
	public void site_co_cd(String value) {
		setConstString(offset + 58, $site_co_cd, value);
	}


	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public String lcl_cd() {
		return getConstString(offset + 59, $lcl_cd);
	}

	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public void lcl_cd(String value) {
		setConstString(offset + 59, $lcl_cd, value);
	}


	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public String lcl_nm() {
		return getConstString(offset + 60, $lcl_nm);
	}

	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public void lcl_nm(String value) {
		setConstString(offset + 60, $lcl_nm, value);
	}


	/**
	 * Data access name データアクセス名.<p>
	 *
	 */
	public String da_nm() {
		return getConstString(offset + 61, $da_nm);
	}

	/**
	 * Data access name データアクセス名.<p>
	 *
	 */
	public void da_nm(String value) {
		setConstString(offset + 61, $da_nm, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String def_dpt_nm() {
		return getConstString(offset + 62, $def_dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void def_dpt_nm(String value) {
		setConstString(offset + 62, $def_dpt_nm, value);
	}


	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public String dpt_lvl_nm() {
		return getConstString(offset + 63, $dpt_lvl_nm);
	}

	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public void dpt_lvl_nm(String value) {
		setConstString(offset + 63, $dpt_lvl_nm, value);
	}


	/**
	 * Approval role name 承認役割名.<p>
	 *
	 */
	public String aprv_role_nm() {
		return getConstString(offset + 64, $aprv_role_nm);
	}

	/**
	 * Approval role name 承認役割名.<p>
	 *
	 */
	public void aprv_role_nm(String value) {
		setConstString(offset + 64, $aprv_role_nm, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 65, $cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 65, $cntry_nm, value);
	}


	/**
	 * Region name 地域名.<p>
	 *
	 */
	public String area_nm() {
		return getConstString(offset + 66, $area_nm);
	}

	/**
	 * Region name 地域名.<p>
	 *
	 */
	public void area_nm(String value) {
		setConstString(offset + 66, $area_nm, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 67, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 67, $cur_nm, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 68, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 68, $unit_nm, value);
	}


	/**
	 * Bank name 銀行名.<p>
	 *
	 */
	public String bank_nm() {
		return getConstString(offset + 69, $bank_nm);
	}

	/**
	 * Bank name 銀行名.<p>
	 *
	 */
	public void bank_nm(String value) {
		setConstString(offset + 69, $bank_nm, value);
	}


	/**
	 * Bank branch name 銀行支店名.<p>
	 *
	 */
	public String branch_nm() {
		return getConstString(offset + 70, $branch_nm);
	}

	/**
	 * Bank branch name 銀行支店名.<p>
	 *
	 */
	public void branch_nm(String value) {
		setConstString(offset + 70, $branch_nm, value);
	}


	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 71, $bank_ac_nm);
	}

	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 71, $bank_ac_nm, value);
	}


	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public String xrate_nm() {
		return getConstString(offset + 72, $xrate_nm);
	}

	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public void xrate_nm(String value) {
		setConstString(offset + 72, $xrate_nm, value);
	}


	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public String cal_nm() {
		return getConstString(offset + 73, $cal_nm);
	}

	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public void cal_nm(String value) {
		setConstString(offset + 73, $cal_nm, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 74, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 74, $itm_jnl_nm, value);
	}


	/**
	 * Accounting item classification name 会計品目分類名.<p>
	 *
	 */
	public String ac_itm_grp_nm() {
		return getConstString(offset + 75, $ac_itm_grp_nm);
	}

	/**
	 * Accounting item classification name 会計品目分類名.<p>
	 *
	 */
	public void ac_itm_grp_nm(String value) {
		setConstString(offset + 75, $ac_itm_grp_nm, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 76, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 76, $ac_rsn_nm, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 77, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 77, $site_nm, value);
	}


	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 78, $zip_cd);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 78, $zip_cd, value);
	}


	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 79, $addr1);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 79, $addr1, value);
	}


	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 80, $addr2);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 80, $addr2, value);
	}


	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 81, $addr3);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 81, $addr3, value);
	}


	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 82, $addr4);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 82, $addr4, value);
	}


	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 83, $tel);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 83, $tel, value);
	}


	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 84, $fax);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 84, $fax, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 85, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 85, $loc_grp_nm, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 86, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 86, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 87, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 87, $alloc_grp_nm, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 88, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 88, $wg_nm, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 89, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 89, $oper_nm, value);
	}


	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public String wk_cost_nm() {
		return getConstString(offset + 90, $wk_cost_nm);
	}

	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public void wk_cost_nm(String value) {
		setConstString(offset + 90, $wk_cost_nm, value);
	}


	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public String wk_cost_unit_nm() {
		return getConstString(offset + 91, $wk_cost_unit_nm);
	}

	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public void wk_cost_unit_nm(String value) {
		setConstString(offset + 91, $wk_cost_unit_nm, value);
	}


	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public String wk_rsn_nm() {
		return getConstString(offset + 92, $wk_rsn_nm);
	}

	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public void wk_rsn_nm(String value) {
		setConstString(offset + 92, $wk_rsn_nm, value);
	}


	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public String sls_upri_grp_nm() {
		return getConstString(offset + 93, $sls_upri_grp_nm);
	}

	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public void sls_upri_grp_nm(String value) {
		setConstString(offset + 93, $sls_upri_grp_nm, value);
	}


	/**
	 * Sales unit price rank name 販売単価ランク名.<p>
	 *
	 */
	public String sls_upri_rank_nm() {
		return getConstString(offset + 94, $sls_upri_rank_nm);
	}

	/**
	 * Sales unit price rank name 販売単価ランク名.<p>
	 *
	 */
	public void sls_upri_rank_nm(String value) {
		setConstString(offset + 94, $sls_upri_rank_nm, value);
	}


	/**
	 * Offset group name 相殺グループ名.<p>
	 *
	 */
	public String setoff_grp_nm() {
		return getConstString(offset + 95, $setoff_grp_nm);
	}

	/**
	 * Offset group name 相殺グループ名.<p>
	 *
	 */
	public void setoff_grp_nm(String value) {
		setConstString(offset + 95, $setoff_grp_nm, value);
	}


	/**
	 * Shipping expiration date group name 出荷有効期限グループ名.<p>
	 *
	 */
	public String ship_valid_grp_nm() {
		return getConstString(offset + 96, $ship_valid_grp_nm);
	}

	/**
	 * Shipping expiration date group name 出荷有効期限グループ名.<p>
	 *
	 */
	public void ship_valid_grp_nm(String value) {
		setConstString(offset + 96, $ship_valid_grp_nm, value);
	}


	/**
	 * Item shipping group name 品目出荷グループ名.<p>
	 *
	 */
	public String itm_ship_grp_nm() {
		return getConstString(offset + 97, $itm_ship_grp_nm);
	}

	/**
	 * Item shipping group name 品目出荷グループ名.<p>
	 *
	 */
	public void itm_ship_grp_nm(String value) {
		setConstString(offset + 97, $itm_ship_grp_nm, value);
	}


	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 98, $trnspt_nm);
	}

	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 98, $trnspt_nm, value);
	}


	/**
	 * Packing container name 梱包容器名.<p>
	 *
	 */
	public String cntnr_nm() {
		return getConstString(offset + 99, $cntnr_nm);
	}

	/**
	 * Packing container name 梱包容器名.<p>
	 *
	 */
	public void cntnr_nm(String value) {
		setConstString(offset + 99, $cntnr_nm, value);
	}


	/**
	 * Harbor name 港名.<p>
	 *
	 */
	public String port_nm() {
		return getConstString(offset + 100, $port_nm);
	}

	/**
	 * Harbor name 港名.<p>
	 *
	 */
	public void port_nm(String value) {
		setConstString(offset + 100, $port_nm, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 101, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 101, $gd_nm, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 102, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 102, $trd_nm, value);
	}


	/**
	 * Slip report name 伝票帳票名.<p>
	 *
	 */
	public String slip_form_nm() {
		return getConstString(offset + 103, $slip_form_nm);
	}

	/**
	 * Slip report name 伝票帳票名.<p>
	 *
	 */
	public void slip_form_nm(String value) {
		setConstString(offset + 103, $slip_form_nm, value);
	}


	/**
	 * Purchase forecast group name 購買内示グループ名.<p>
	 *
	 */
	public String pf_grp_nm() {
		return getConstString(offset + 104, $pf_grp_nm);
	}

	/**
	 * Purchase forecast group name 購買内示グループ名.<p>
	 *
	 */
	public void pf_grp_nm(String value) {
		setConstString(offset + 104, $pf_grp_nm, value);
	}


	/**
	 * Item specification classification name 品目仕様分類名.<p>
	 *
	 */
	public String itm_spec_grp_nm() {
		return getConstString(offset + 105, $itm_spec_grp_nm);
	}

	/**
	 * Item specification classification name 品目仕様分類名.<p>
	 *
	 */
	public void itm_spec_grp_nm(String value) {
		setConstString(offset + 105, $itm_spec_grp_nm, value);
	}


	/**
	 * Item configuration group name 品目構成グループ名.<p>
	 *
	 */
	public String itm_comp_grp_nm() {
		return getConstString(offset + 106, $itm_comp_grp_nm);
	}

	/**
	 * Item configuration group name 品目構成グループ名.<p>
	 *
	 */
	public void itm_comp_grp_nm(String value) {
		setConstString(offset + 106, $itm_comp_grp_nm, value);
	}


	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public String jnl_act_nm() {
		return getConstString(offset + 107, $jnl_act_nm);
	}

	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public void jnl_act_nm(String value) {
		setConstString(offset + 107, $jnl_act_nm, value);
	}


	/**
	 * Journal group name 仕訳グループ名.<p>
	 *
	 */
	public String jnl_grp_nm() {
		return getConstString(offset + 108, $jnl_grp_nm);
	}

	/**
	 * Journal group name 仕訳グループ名.<p>
	 *
	 */
	public void jnl_grp_nm(String value) {
		setConstString(offset + 108, $jnl_grp_nm, value);
	}


	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public String jnl_ptn_nm() {
		return getConstString(offset + 109, $jnl_ptn_nm);
	}

	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public void jnl_ptn_nm(String value) {
		setConstString(offset + 109, $jnl_ptn_nm, value);
	}


	/**
	 * Auto-journal key name 自動仕訳キー名.<p>
	 *
	 */
	public String auto_jnl_key_nm() {
		return getConstString(offset + 110, $auto_jnl_key_nm);
	}

	/**
	 * Auto-journal key name 自動仕訳キー名.<p>
	 *
	 */
	public void auto_jnl_key_nm(String value) {
		setConstString(offset + 110, $auto_jnl_key_nm, value);
	}


	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public String insp_ptn_nm() {
		return getConstString(offset + 111, $insp_ptn_nm);
	}

	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public void insp_ptn_nm(String value) {
		setConstString(offset + 111, $insp_ptn_nm, value);
	}


	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public String wk_day_nm() {
		return getConstString(offset + 112, $wk_day_nm);
	}

	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public void wk_day_nm(String value) {
		setConstString(offset + 112, $wk_day_nm, value);
	}


	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public String ship_term_nm() {
		return getConstString(offset + 113, $ship_term_nm);
	}

	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public void ship_term_nm(String value) {
		setConstString(offset + 113, $ship_term_nm, value);
	}


	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public String ship_wk_nm() {
		return getConstString(offset + 114, $ship_wk_nm);
	}

	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public void ship_wk_nm(String value) {
		setConstString(offset + 114, $ship_wk_nm, value);
	}


	/**
	 * Resource name 資源名.<p>
	 *
	 */
	public String rsrc_nm() {
		return getConstString(offset + 115, $rsrc_nm);
	}

	/**
	 * Resource name 資源名.<p>
	 *
	 */
	public void rsrc_nm(String value) {
		setConstString(offset + 115, $rsrc_nm, value);
	}


	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public String rsrc_unit_nm() {
		return getConstString(offset + 116, $rsrc_unit_nm);
	}

	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public void rsrc_unit_nm(String value) {
		setConstString(offset + 116, $rsrc_unit_nm, value);
	}


	/**
	 * HS classification name ＨＳ分類名.<p>
	 *
	 */
	public String hs_grp_nm() {
		return getConstString(offset + 117, $hs_grp_nm);
	}

	/**
	 * HS classification name ＨＳ分類名.<p>
	 *
	 */
	public void hs_grp_nm(String value) {
		setConstString(offset + 117, $hs_grp_nm, value);
	}


	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public String alc_ptn_nm() {
		return getConstString(offset + 118, $alc_ptn_nm);
	}

	/**
	 * Allocation pattern name 配賦パタン名.<p>
	 *
	 */
	public void alc_ptn_nm(String value) {
		setConstString(offset + 118, $alc_ptn_nm, value);
	}


	/**
	 * Item category group name 品群グループ名.<p>
	 *
	 */
	public String ctg_grp_nm() {
		return getConstString(offset + 119, $ctg_grp_nm);
	}

	/**
	 * Item category group name 品群グループ名.<p>
	 *
	 */
	public void ctg_grp_nm(String value) {
		setConstString(offset + 119, $ctg_grp_nm, value);
	}


	/**
	 * Calculation run pattern name 計算実行パタン名.<p>
	 *
	 */
	public String act_ptn_nm() {
		return getConstString(offset + 120, $act_ptn_nm);
	}

	/**
	 * Calculation run pattern name 計算実行パタン名.<p>
	 *
	 */
	public void act_ptn_nm(String value) {
		setConstString(offset + 120, $act_ptn_nm, value);
	}


	/**
	 * General purpose allocation classification name 汎用配賦分類名.<p>
	 *
	 */
	public String gp_alc_nm() {
		return getConstString(offset + 121, $gp_alc_nm);
	}

	/**
	 * General purpose allocation classification name 汎用配賦分類名.<p>
	 *
	 */
	public void gp_alc_nm(String value) {
		setConstString(offset + 121, $gp_alc_nm, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 122, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 122, $calc_ctg_nm, value);
	}


	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public String rpt_ptn_nm() {
		return getConstString(offset + 123, $rpt_ptn_nm);
	}

	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public void rpt_ptn_nm(String value) {
		setConstString(offset + 123, $rpt_ptn_nm, value);
	}


	/**
	 * Menu name メニュー名.<p>
	 *
	 */
	public String menu_nm() {
		return getConstString(offset + 124, $menu_nm);
	}

	/**
	 * Menu name メニュー名.<p>
	 *
	 */
	public void menu_nm(String value) {
		setConstString(offset + 124, $menu_nm, value);
	}


	/**
	 * Warehousing business name 倉庫事業者名.<p>
	 *
	 */
	public String site_co_nm() {
		return getConstString(offset + 125, $site_co_nm);
	}

	/**
	 * Warehousing business name 倉庫事業者名.<p>
	 *
	 */
	public void site_co_nm(String value) {
		setConstString(offset + 125, $site_co_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 126, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 126, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 127, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 127, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 128, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 128, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 129, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 129, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 130, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 130, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 131, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 131, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 132, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 132, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 133, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 133, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 134, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 135, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 135, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 136, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 136, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 137, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 137, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 138, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 138, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 139, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 139, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 140, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 140, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($cd.equalsIgnoreCase(name)) {
			return cd();
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			return da_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_branch_bank_cd.equalsIgnoreCase(name)) {
			return bank_branch_bank_cd();
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			return branch_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return ac_itm_grp_cd();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return sls_upri_grp_cd();
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			return sls_upri_rank_cd();
		}
		if ($setoff_grp_cd.equalsIgnoreCase(name)) {
			return setoff_grp_cd();
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return ship_valid_grp_cd();
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($cntnr_cd.equalsIgnoreCase(name)) {
			return cntnr_cd();
		}
		if ($port_cd.equalsIgnoreCase(name)) {
			return port_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			return slip_form_cd();
		}
		if ($pf_grp_cd.equalsIgnoreCase(name)) {
			return pf_grp_cd();
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			return itm_spec_grp_cd();
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			return itm_comp_grp_cd();
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			return jnl_act_cd();
		}
		if ($jnl_grp_cd.equalsIgnoreCase(name)) {
			return jnl_grp_cd();
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			return auto_jnl_key_cd();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			return rsrc_cd();
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			return hs_grp_cd();
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($ctg_grp_cd.equalsIgnoreCase(name)) {
			return ctg_grp_cd();
		}
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			return act_ptn_cd();
		}
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			return gp_alc_cd();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			return rpt_ptn_cd();
		}
		if ($menu_cd.equalsIgnoreCase(name)) {
			return menu_cd();
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			return site_co_cd();
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			return lcl_cd();
		}
		if ($lcl_nm.equalsIgnoreCase(name)) {
			return lcl_nm();
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			return da_nm();
		}
		if ($def_dpt_nm.equalsIgnoreCase(name)) {
			return def_dpt_nm();
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			return aprv_role_nm();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			return branch_nm();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			return wk_cost_unit_nm();
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			return wk_rsn_nm();
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			return sls_upri_grp_nm();
		}
		if ($sls_upri_rank_nm.equalsIgnoreCase(name)) {
			return sls_upri_rank_nm();
		}
		if ($setoff_grp_nm.equalsIgnoreCase(name)) {
			return setoff_grp_nm();
		}
		if ($ship_valid_grp_nm.equalsIgnoreCase(name)) {
			return ship_valid_grp_nm();
		}
		if ($itm_ship_grp_nm.equalsIgnoreCase(name)) {
			return itm_ship_grp_nm();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($cntnr_nm.equalsIgnoreCase(name)) {
			return cntnr_nm();
		}
		if ($port_nm.equalsIgnoreCase(name)) {
			return port_nm();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($slip_form_nm.equalsIgnoreCase(name)) {
			return slip_form_nm();
		}
		if ($pf_grp_nm.equalsIgnoreCase(name)) {
			return pf_grp_nm();
		}
		if ($itm_spec_grp_nm.equalsIgnoreCase(name)) {
			return itm_spec_grp_nm();
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			return itm_comp_grp_nm();
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			return jnl_act_nm();
		}
		if ($jnl_grp_nm.equalsIgnoreCase(name)) {
			return jnl_grp_nm();
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			return jnl_ptn_nm();
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			return auto_jnl_key_nm();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			return wk_day_nm();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			return rsrc_nm();
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			return rsrc_unit_nm();
		}
		if ($hs_grp_nm.equalsIgnoreCase(name)) {
			return hs_grp_nm();
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			return alc_ptn_nm();
		}
		if ($ctg_grp_nm.equalsIgnoreCase(name)) {
			return ctg_grp_nm();
		}
		if ($act_ptn_nm.equalsIgnoreCase(name)) {
			return act_ptn_nm();
		}
		if ($gp_alc_nm.equalsIgnoreCase(name)) {
			return gp_alc_nm();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			return rpt_ptn_nm();
		}
		if ($menu_nm.equalsIgnoreCase(name)) {
			return menu_nm();
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			return site_co_nm();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
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
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($cd.equalsIgnoreCase(name)) {
			return cd();
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			return da_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_branch_bank_cd.equalsIgnoreCase(name)) {
			return bank_branch_bank_cd();
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			return branch_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			return ac_itm_grp_cd();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return sls_upri_grp_cd();
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			return sls_upri_rank_cd();
		}
		if ($setoff_grp_cd.equalsIgnoreCase(name)) {
			return setoff_grp_cd();
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return ship_valid_grp_cd();
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($cntnr_cd.equalsIgnoreCase(name)) {
			return cntnr_cd();
		}
		if ($port_cd.equalsIgnoreCase(name)) {
			return port_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			return slip_form_cd();
		}
		if ($pf_grp_cd.equalsIgnoreCase(name)) {
			return pf_grp_cd();
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			return itm_spec_grp_cd();
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			return itm_comp_grp_cd();
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			return jnl_act_cd();
		}
		if ($jnl_grp_cd.equalsIgnoreCase(name)) {
			return jnl_grp_cd();
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			return auto_jnl_key_cd();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			return rsrc_cd();
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			return hs_grp_cd();
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($ctg_grp_cd.equalsIgnoreCase(name)) {
			return ctg_grp_cd();
		}
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			return act_ptn_cd();
		}
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			return gp_alc_cd();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			return rpt_ptn_cd();
		}
		if ($menu_cd.equalsIgnoreCase(name)) {
			return menu_cd();
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			return site_co_cd();
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			return lcl_cd();
		}
		if ($lcl_nm.equalsIgnoreCase(name)) {
			return lcl_nm();
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			return da_nm();
		}
		if ($def_dpt_nm.equalsIgnoreCase(name)) {
			return def_dpt_nm();
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			return aprv_role_nm();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			return branch_nm();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			return wk_cost_unit_nm();
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			return wk_rsn_nm();
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			return sls_upri_grp_nm();
		}
		if ($sls_upri_rank_nm.equalsIgnoreCase(name)) {
			return sls_upri_rank_nm();
		}
		if ($setoff_grp_nm.equalsIgnoreCase(name)) {
			return setoff_grp_nm();
		}
		if ($ship_valid_grp_nm.equalsIgnoreCase(name)) {
			return ship_valid_grp_nm();
		}
		if ($itm_ship_grp_nm.equalsIgnoreCase(name)) {
			return itm_ship_grp_nm();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($cntnr_nm.equalsIgnoreCase(name)) {
			return cntnr_nm();
		}
		if ($port_nm.equalsIgnoreCase(name)) {
			return port_nm();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($slip_form_nm.equalsIgnoreCase(name)) {
			return slip_form_nm();
		}
		if ($pf_grp_nm.equalsIgnoreCase(name)) {
			return pf_grp_nm();
		}
		if ($itm_spec_grp_nm.equalsIgnoreCase(name)) {
			return itm_spec_grp_nm();
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			return itm_comp_grp_nm();
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			return jnl_act_nm();
		}
		if ($jnl_grp_nm.equalsIgnoreCase(name)) {
			return jnl_grp_nm();
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			return jnl_ptn_nm();
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			return auto_jnl_key_nm();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			return wk_day_nm();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			return rsrc_nm();
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			return rsrc_unit_nm();
		}
		if ($hs_grp_nm.equalsIgnoreCase(name)) {
			return hs_grp_nm();
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			return alc_ptn_nm();
		}
		if ($ctg_grp_nm.equalsIgnoreCase(name)) {
			return ctg_grp_nm();
		}
		if ($act_ptn_nm.equalsIgnoreCase(name)) {
			return act_ptn_nm();
		}
		if ($gp_alc_nm.equalsIgnoreCase(name)) {
			return gp_alc_nm();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			return rpt_ptn_nm();
		}
		if ($menu_nm.equalsIgnoreCase(name)) {
			return menu_nm();
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			return site_co_nm();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
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
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($cd.equalsIgnoreCase(name)) {
			cd(value);
			return;
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			da_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_branch_bank_cd.equalsIgnoreCase(name)) {
			bank_branch_bank_cd(value);
			return;
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			branch_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			ac_itm_grp_cd(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			sls_upri_grp_cd(value);
			return;
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			sls_upri_rank_cd(value);
			return;
		}
		if ($setoff_grp_cd.equalsIgnoreCase(name)) {
			setoff_grp_cd(value);
			return;
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			ship_valid_grp_cd(value);
			return;
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($cntnr_cd.equalsIgnoreCase(name)) {
			cntnr_cd(value);
			return;
		}
		if ($port_cd.equalsIgnoreCase(name)) {
			port_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			slip_form_cd(value);
			return;
		}
		if ($pf_grp_cd.equalsIgnoreCase(name)) {
			pf_grp_cd(value);
			return;
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			itm_spec_grp_cd(value);
			return;
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			itm_comp_grp_cd(value);
			return;
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			jnl_act_cd(value);
			return;
		}
		if ($jnl_grp_cd.equalsIgnoreCase(name)) {
			jnl_grp_cd(value);
			return;
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			auto_jnl_key_cd(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			wk_day_cd(value);
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
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			rsrc_cd(value);
			return;
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			hs_grp_cd(value);
			return;
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($ctg_grp_cd.equalsIgnoreCase(name)) {
			ctg_grp_cd(value);
			return;
		}
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			act_ptn_cd(value);
			return;
		}
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			gp_alc_cd(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			rpt_ptn_cd(value);
			return;
		}
		if ($menu_cd.equalsIgnoreCase(name)) {
			menu_cd(value);
			return;
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			site_co_cd(value);
			return;
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			lcl_cd(value);
			return;
		}
		if ($lcl_nm.equalsIgnoreCase(name)) {
			lcl_nm(value);
			return;
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			da_nm(value);
			return;
		}
		if ($def_dpt_nm.equalsIgnoreCase(name)) {
			def_dpt_nm(value);
			return;
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			aprv_role_nm(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			bank_nm(value);
			return;
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			branch_nm(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
			return;
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			cal_nm(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			ac_itm_grp_nm(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			wk_cost_unit_nm(value);
			return;
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			wk_rsn_nm(value);
			return;
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			sls_upri_grp_nm(value);
			return;
		}
		if ($sls_upri_rank_nm.equalsIgnoreCase(name)) {
			sls_upri_rank_nm(value);
			return;
		}
		if ($setoff_grp_nm.equalsIgnoreCase(name)) {
			setoff_grp_nm(value);
			return;
		}
		if ($ship_valid_grp_nm.equalsIgnoreCase(name)) {
			ship_valid_grp_nm(value);
			return;
		}
		if ($itm_ship_grp_nm.equalsIgnoreCase(name)) {
			itm_ship_grp_nm(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($cntnr_nm.equalsIgnoreCase(name)) {
			cntnr_nm(value);
			return;
		}
		if ($port_nm.equalsIgnoreCase(name)) {
			port_nm(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($slip_form_nm.equalsIgnoreCase(name)) {
			slip_form_nm(value);
			return;
		}
		if ($pf_grp_nm.equalsIgnoreCase(name)) {
			pf_grp_nm(value);
			return;
		}
		if ($itm_spec_grp_nm.equalsIgnoreCase(name)) {
			itm_spec_grp_nm(value);
			return;
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			itm_comp_grp_nm(value);
			return;
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			jnl_act_nm(value);
			return;
		}
		if ($jnl_grp_nm.equalsIgnoreCase(name)) {
			jnl_grp_nm(value);
			return;
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			jnl_ptn_nm(value);
			return;
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			auto_jnl_key_nm(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			wk_day_nm(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
			return;
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			rsrc_nm(value);
			return;
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			rsrc_unit_nm(value);
			return;
		}
		if ($hs_grp_nm.equalsIgnoreCase(name)) {
			hs_grp_nm(value);
			return;
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			alc_ptn_nm(value);
			return;
		}
		if ($ctg_grp_nm.equalsIgnoreCase(name)) {
			ctg_grp_nm(value);
			return;
		}
		if ($act_ptn_nm.equalsIgnoreCase(name)) {
			act_ptn_nm(value);
			return;
		}
		if ($gp_alc_nm.equalsIgnoreCase(name)) {
			gp_alc_nm(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			rpt_ptn_nm(value);
			return;
		}
		if ($menu_nm.equalsIgnoreCase(name)) {
			menu_nm(value);
			return;
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			site_co_nm(value);
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cd.equalsIgnoreCase(name)) {
			cd(value);
			return;
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			da_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_branch_bank_cd.equalsIgnoreCase(name)) {
			bank_branch_bank_cd(value);
			return;
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			branch_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($ac_itm_grp_cd.equalsIgnoreCase(name)) {
			ac_itm_grp_cd(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			sls_upri_grp_cd(value);
			return;
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			sls_upri_rank_cd(value);
			return;
		}
		if ($setoff_grp_cd.equalsIgnoreCase(name)) {
			setoff_grp_cd(value);
			return;
		}
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			ship_valid_grp_cd(value);
			return;
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($cntnr_cd.equalsIgnoreCase(name)) {
			cntnr_cd(value);
			return;
		}
		if ($port_cd.equalsIgnoreCase(name)) {
			port_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			slip_form_cd(value);
			return;
		}
		if ($pf_grp_cd.equalsIgnoreCase(name)) {
			pf_grp_cd(value);
			return;
		}
		if ($itm_spec_grp_cd.equalsIgnoreCase(name)) {
			itm_spec_grp_cd(value);
			return;
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			itm_comp_grp_cd(value);
			return;
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			jnl_act_cd(value);
			return;
		}
		if ($jnl_grp_cd.equalsIgnoreCase(name)) {
			jnl_grp_cd(value);
			return;
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			auto_jnl_key_cd(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			wk_day_cd(value);
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
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			rsrc_cd(value);
			return;
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			hs_grp_cd(value);
			return;
		}
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($ctg_grp_cd.equalsIgnoreCase(name)) {
			ctg_grp_cd(value);
			return;
		}
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			act_ptn_cd(value);
			return;
		}
		if ($gp_alc_cd.equalsIgnoreCase(name)) {
			gp_alc_cd(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			rpt_ptn_cd(value);
			return;
		}
		if ($menu_cd.equalsIgnoreCase(name)) {
			menu_cd(value);
			return;
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			site_co_cd(value);
			return;
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			lcl_cd(value);
			return;
		}
		if ($lcl_nm.equalsIgnoreCase(name)) {
			lcl_nm(value);
			return;
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			da_nm(value);
			return;
		}
		if ($def_dpt_nm.equalsIgnoreCase(name)) {
			def_dpt_nm(value);
			return;
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			aprv_role_nm(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			bank_nm(value);
			return;
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			branch_nm(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
			return;
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			cal_nm(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			ac_itm_grp_nm(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			wk_cost_unit_nm(value);
			return;
		}
		if ($wk_rsn_nm.equalsIgnoreCase(name)) {
			wk_rsn_nm(value);
			return;
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			sls_upri_grp_nm(value);
			return;
		}
		if ($sls_upri_rank_nm.equalsIgnoreCase(name)) {
			sls_upri_rank_nm(value);
			return;
		}
		if ($setoff_grp_nm.equalsIgnoreCase(name)) {
			setoff_grp_nm(value);
			return;
		}
		if ($ship_valid_grp_nm.equalsIgnoreCase(name)) {
			ship_valid_grp_nm(value);
			return;
		}
		if ($itm_ship_grp_nm.equalsIgnoreCase(name)) {
			itm_ship_grp_nm(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($cntnr_nm.equalsIgnoreCase(name)) {
			cntnr_nm(value);
			return;
		}
		if ($port_nm.equalsIgnoreCase(name)) {
			port_nm(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($slip_form_nm.equalsIgnoreCase(name)) {
			slip_form_nm(value);
			return;
		}
		if ($pf_grp_nm.equalsIgnoreCase(name)) {
			pf_grp_nm(value);
			return;
		}
		if ($itm_spec_grp_nm.equalsIgnoreCase(name)) {
			itm_spec_grp_nm(value);
			return;
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			itm_comp_grp_nm(value);
			return;
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			jnl_act_nm(value);
			return;
		}
		if ($jnl_grp_nm.equalsIgnoreCase(name)) {
			jnl_grp_nm(value);
			return;
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			jnl_ptn_nm(value);
			return;
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			auto_jnl_key_nm(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($wk_day_nm.equalsIgnoreCase(name)) {
			wk_day_nm(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
			return;
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			rsrc_nm(value);
			return;
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			rsrc_unit_nm(value);
			return;
		}
		if ($hs_grp_nm.equalsIgnoreCase(name)) {
			hs_grp_nm(value);
			return;
		}
		if ($alc_ptn_nm.equalsIgnoreCase(name)) {
			alc_ptn_nm(value);
			return;
		}
		if ($ctg_grp_nm.equalsIgnoreCase(name)) {
			ctg_grp_nm(value);
			return;
		}
		if ($act_ptn_nm.equalsIgnoreCase(name)) {
			act_ptn_nm(value);
			return;
		}
		if ($gp_alc_nm.equalsIgnoreCase(name)) {
			gp_alc_nm(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			rpt_ptn_nm(value);
			return;
		}
		if ($menu_nm.equalsIgnoreCase(name)) {
			menu_nm(value);
			return;
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			site_co_nm(value);
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
		super.setBooleanNE(name, value);
	}



}

