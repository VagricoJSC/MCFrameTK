package mcframe.serverMSLA.MSLAL6220;

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
 * ブロック"MfgActRecvIf_Upd02_ActLst"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActRecvIf_Upd02_ActLstR_MC_A extends MCConstRow {

	/**
	 * Error flg. エラーフラグ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public static final String $if_proc_typ = "if_proc_typ";
	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public static final String $data_lno = "data_lno";
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public static final String $exe_sts_typ = "exe_sts_typ";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public static final String $ext_data_no = "ext_data_no";
	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public static final String $ext_data_lno = "ext_data_lno";
	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public static final String $data_make_dt = "data_make_dt";
	/**
	 * To import 取込対象.<p>
	 *
	 */
	public static final String $imp_flg = "imp_flg";
	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public static final String $recv_dt = "recv_dt";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public static final String $mfg_inst_rev = "mfg_inst_rev";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * External operation result No. 外部工程実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_oper_act_no = "ext_oper_act_no";
	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Operation record sheet remarks 工程記録書備考.<p>
	 *
	 */
	public static final String $act_rpt_rmrks = "act_rpt_rmrks";
	/**
	 * Input internal remarks 投入内部備考.<p>
	 *
	 */
	public static final String $act_intr_rmrks = "act_intr_rmrks";
	/**
	 * Input record sheet remarks 投入記録書備考.<p>
	 *
	 */
	public static final String $inpt_act_rpt_rmrks = "inpt_act_rpt_rmrks";
	/**
	 * Input transaction remarks 投入取引備考.<p>
	 *
	 */
	public static final String $act_trd_rmrks = "act_trd_rmrks";
	/**
	 * Man-hour internal remarks 工数内部備考.<p>
	 *
	 */
	public static final String $wk_intr_rmrks = "wk_intr_rmrks";
	/**
	 * Mfg. internal remarks 製造内部備考.<p>
	 *
	 */
	public static final String $mfg_act_intr_rmrks = "mfg_act_intr_rmrks";
	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public static final String $mfg_act_rpt_rmrks = "mfg_act_rpt_rmrks";
	/**
	 * Output transaction remarks 出来高取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Output internal remarks 出来高内部備考.<p>
	 *
	 */
	public static final String $yield_act_intr_rmrks = "yield_act_intr_rmrks";
	/**
	 * Output record sheet remarks 出来高記録書備考.<p>
	 *
	 */
	public static final String $yield_act_rpt_rmrks = "yield_act_rpt_rmrks";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public static final String $not_cmpl_flg = "not_cmpl_flg";
	/**
	 * Actual start date and time 着手実績日時.<p>
	 *
	 */
	public static final String $st_act_tm = "st_act_tm";
	/**
	 * Actual end date and time 終了実績日時.<p>
	 *
	 */
	public static final String $end_act_tm = "end_act_tm";
	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public static final String $oper_unit_qty = "oper_unit_qty";
	/**
	 * Allow Operation backlash update 工程バックフラッシュ更新許可.<p>
	 *
	 */
	public static final String $bkf_ctl_flg = "bkf_ctl_flg";
	/**
	 * Allow update of operation man-hour auto-calculation 工程自動工数計算更新許可.<p>
	 *
	 */
	public static final String $wk_cost_calc_ctl_flg = "wk_cost_calc_ctl_flg";
	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public static final String $oper_yield = "oper_yield";
	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public static final String $wk_schd_no = "wk_schd_no";
	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public static final String $yield_schd_no = "yield_schd_no";
	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_inpt_act_no = "ext_inpt_act_no";
	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_wk_act_no = "ext_wk_act_no";
	/**
	 * External output result No. 外部出来高実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_yield_act_no = "ext_yield_act_no";
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
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public static final String $act_tm = "act_tm";
	/**
	 * IF input type ＩＦ投入区分.<p>
	 *
	 */
	public static final String $if_inpt_typ = "if_inpt_typ";
	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public static final String $inpt_rsn_cd = "inpt_rsn_cd";
	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public static final String $loss_rsn_cd = "loss_rsn_cd";
	/**
	 * Loss reason cd. before change 変更前ロス理由ＣＤ.<p>
	 *
	 */
	public static final String $old_loss_rsn_cd = "old_loss_rsn_cd";
	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public static final String $acxfr_qty = "acxfr_qty";
	/**
	 * Other accounting transfer reason cd. 他勘定振替理由ＣＤ.<p>
	 *
	 */
	public static final String $acxfr_rsn_cd = "acxfr_rsn_cd";
	/**
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public static final String $acxfr_bd_dpt_cd = "acxfr_bd_dpt_cd";
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_qty = "base_unit_inpt_qty";
	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public static final String $inpt_loc_cd = "inpt_loc_cd";
	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $inpt_str_ln_cd = "inpt_str_ln_cd";
	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public static final String $cont_qty = "cont_qty";
	/**
	 * No expiration check 期限チェックしない.<p>
	 *
	 */
	public static final String $not_pd_chk_flg = "not_pd_chk_flg";
	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public static final String $brk_pd = "brk_pd";
	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public static final String $wk_usr_dpt_cd = "wk_usr_dpt_cd";
	/**
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public static final String $wk_usr_cd = "wk_usr_cd";
	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public static final String $wk_day_cd = "wk_day_cd";
	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public static final String $wk_cost = "wk_cost";
	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public static final String $wk_rsn_cd = "wk_rsn_cd";
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	/**
	 * Equipment 設備.<p>
	 *
	 */
	public static final String $fclty = "fclty";
	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public static final String $st_hm = "st_hm";
	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public static final String $end_hm = "end_hm";
	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public static final String $wk_cost_calc_upd_flg = "wk_cost_calc_upd_flg";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Create all operation results 全工程実績作成.<p>
	 *
	 */
	public static final String $all_oper_act_reg_flg = "all_oper_act_reg_flg";
	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public static final String $yield_typ = "yield_typ";
	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public static final String $yield_rsn_cd = "yield_rsn_cd";
	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public static final String $yield_rate = "yield_rate";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public static final String $same_lot_flg = "same_lot_flg";
	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public static final String $itm_yield = "itm_yield";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $strg_str_ln_cd = "strg_str_ln_cd";
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public static final String $insp_cnt_rmrks = "insp_cnt_rmrks";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Mfg. result PIC cd. 製造実績責任者ＣＤ.<p>
	 *
	 */
	public static final String $mfg_act_usr_cd = "mfg_act_usr_cd";
	/**
	 * Mfg. result dept. cd. 製造実績部門ＣＤ.<p>
	 *
	 */
	public static final String $mfg_act_dpt_cd = "mfg_act_dpt_cd";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. item cd. 製造品目ＣＤ.<p>
	 *
	 */
	public static final String $mfg_itm_cd = "mfg_itm_cd";
	/**
	 * Mfg. item branch No. 1 製造品目枝番１.<p>
	 *
	 */
	public static final String $mfg_itm_sub1 = "mfg_itm_sub1";
	/**
	 * Mfg. item branch No. 2 製造品目枝番２.<p>
	 *
	 */
	public static final String $mfg_itm_sub2 = "mfg_itm_sub2";
	/**
	 * Mfg. item branch No. 3 製造品目枝番３.<p>
	 *
	 */
	public static final String $mfg_itm_sub3 = "mfg_itm_sub3";
	/**
	 * External operation results qty. 外部工程実績数.<p>
	 *
	 */
	public static final String $ext_oper_act_cnt = "ext_oper_act_cnt";
	/**
	 * External results qty. 外部実績数.<p>
	 *
	 */
	public static final String $ext_act_cnt = "ext_act_cnt";
	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $sub_char4 = "sub_char4";
	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $sub_char5 = "sub_char5";
	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public static final String $sub_char6 = "sub_char6";
	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public static final String $sub_char7 = "sub_char7";
	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public static final String $sub_char8 = "sub_char8";
	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public static final String $sub_char9 = "sub_char9";
	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public static final String $sub_char10 = "sub_char10";
	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public static final String $sub_char11 = "sub_char11";
	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public static final String $sub_char12 = "sub_char12";
	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public static final String $sub_char13 = "sub_char13";
	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public static final String $sub_char14 = "sub_char14";
	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public static final String $sub_char15 = "sub_char15";
	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public static final String $sub_char16 = "sub_char16";
	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public static final String $sub_char17 = "sub_char17";
	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public static final String $sub_char18 = "sub_char18";
	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public static final String $sub_char19 = "sub_char19";
	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public static final String $sub_char20 = "sub_char20";
	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public static final String $sub_char21 = "sub_char21";
	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public static final String $sub_char22 = "sub_char22";
	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public static final String $sub_char23 = "sub_char23";
	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public static final String $sub_char24 = "sub_char24";
	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public static final String $sub_char25 = "sub_char25";
	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public static final String $sub_char26 = "sub_char26";
	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public static final String $sub_char27 = "sub_char27";
	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public static final String $sub_char28 = "sub_char28";
	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public static final String $sub_char29 = "sub_char29";
	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public static final String $sub_char30 = "sub_char30";
	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $sub_num1 = "sub_num1";
	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public static final String $sub_num2 = "sub_num2";
	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public static final String $sub_num3 = "sub_num3";
	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public static final String $sub_num4 = "sub_num4";
	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public static final String $sub_num5 = "sub_num5";
	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $sub_dt1 = "sub_dt1";
	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public static final String $sub_dt2 = "sub_dt2";
	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public static final String $sub_dt3 = "sub_dt3";
	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public static final String $sub_dt4 = "sub_dt4";
	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public static final String $sub_dt5 = "sub_dt5";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public static final String $batch_log_no = "batch_log_no";
	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public static final String $log_sub_key1 = "log_sub_key1";
	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public static final String $log_sub_key2 = "log_sub_key2";
	/**
	 * Mfg. location cd. (Latest) 製造場所ＣＤ（最新）.<p>
	 *
	 */
	public static final String $mfg_loc_cd_lasted = "mfg_loc_cd_lasted";
	/**
	 * Factory/Distribution warehouse cd. (Latest) 工場・物流倉庫ＣＤ（最新）.<p>
	 *
	 */
	public static final String $site_cd_lasted = "site_cd_lasted";
	/**
	 * WG cd. (Latest) ワーキンググループＣＤ（最新）.<p>
	 *
	 */
	public static final String $wg_cd_lasted = "wg_cd_lasted";
	/**
	 * Production method type (Latest) 生産方法区分（最新）.<p>
	 *
	 */
	public static final String $mfg_mtd_typ_lasted = "mfg_mtd_typ_lasted";
	/**
	 * Mfg. rack/line cd. (Latest) 製造棚・ラインＣＤ（最新）.<p>
	 *
	 */
	public static final String $mfg_str_ln_cd_lasted = "mfg_str_ln_cd_lasted";
	/**
	 * Mfg. item cd. (Latest) 製造品目ＣＤ（最新）.<p>
	 *
	 */
	public static final String $mfg_itm_cd_lasted = "mfg_itm_cd_lasted";
	/**
	 * Mfg. item branch No. 1 (Latest) 製造品目枝番１（最新）.<p>
	 *
	 */
	public static final String $mfg_itm_sub1_lasted = "mfg_itm_sub1_lasted";
	/**
	 * Mfg. item branch No. 2 (Latest) 製造品目枝番２（最新）.<p>
	 *
	 */
	public static final String $mfg_itm_sub2_lasted = "mfg_itm_sub2_lasted";
	/**
	 * Mfg. item branch No. 3 (Latest) 製造品目枝番３（最新）.<p>
	 *
	 */
	public static final String $mfg_itm_sub3_lasted = "mfg_itm_sub3_lasted";
	/**
	 * Mfg. storage location cd. 製造格納先場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_strg_loc_cd = "mfg_strg_loc_cd";
	/**
	 * Mfg. storage rack/line cd. 製造格納棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $mfg_strg_str_ln_cd = "mfg_strg_str_ln_cd";
	/**
	 * Mfg. order No. (Latest) 製造指図ＮＯ（最新）.<p>
	 *
	 */
	public static final String $mfg_inst_no_lasted = "mfg_inst_no_lasted";
	/**
	 * Mfg. order rev. No. (Latest) 製造指図改訂番号（最新）.<p>
	 *
	 */
	public static final String $mfg_inst_rev_lasted = "mfg_inst_rev_lasted";
	/**
	 * Operation cd. (Latest) 工程ＣＤ（最新）.<p>
	 *
	 */
	public static final String $oper_cd_lasted = "oper_cd_lasted";
	/**
	 * Operation sequence No. (Latest) 工程連番（最新）.<p>
	 *
	 */
	public static final String $oper_seq_lasted = "oper_seq_lasted";
	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public static final String $inpt_act_no = "inpt_act_no";
	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public static final String $loss_act_no = "loss_act_no";
	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public static final String $wk_act_no = "wk_act_no";
	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public static final String $yield_act_no = "yield_act_no";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Do not allow duplicate import 重複取込不可.<p>
	 *
	 */
	public static final String $not_dup_imp_flg = "not_dup_imp_flg";
	/**
	 * IF auto-create (Input) ＩＦ自動作成（投入）.<p>
	 *
	 */
	public static final String $if_auto_reg_flg = "if_auto_reg_flg";
	/**
	 * IF control skip row ＩＦ制御スキップ行.<p>
	 *
	 */
	public static final String $skip_by_if_ctl_flg = "skip_by_if_ctl_flg";
	/**
	 * Added row for check チェック追加行.<p>
	 *
	 */
	public static final String $chk_add_flg = "chk_add_flg";
	/**
	 * Operation cancellation skip] row 工程取消スキップ行.<p>
	 *
	 */
	public static final String $skip_by_oper_del_flg = "skip_by_oper_del_flg";
	/**
	 * Receive SEIBAN No. 手配ＮＯ受信.<p>
	 *
	 */
	public static final String $sno_recv_flg = "sno_recv_flg";
	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public static final String $unschd_act_flg = "unschd_act_flg";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $mfg_str_ln_cd = "mfg_str_ln_cd";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";


	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta if_proc_typ_META = createCommonMeta($if_proc_typ, mcframe.commonMA.meta.MA_META.IF_PROC_TYP);
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_data_no_META = createCommonMeta($ext_data_no, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_NO);
	public static final MCMeta ext_data_lno_META = createCommonMeta($ext_data_lno, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_LNO);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta imp_flg_META = createCommonMeta($imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta recv_dt_META = createCommonMeta($recv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta mfg_inst_rev_META = createCommonMeta($mfg_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta ext_oper_act_no_META = createCommonMeta($ext_oper_act_no, mcframe.commonMA.meta.MA_META.EXT_OPER_ACT_NO);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.OPER_ACT_INTR_RMRKS);
	public static final MCMeta act_rpt_rmrks_META = createCommonMeta($act_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_ACT_RPT_RMRKS);
	public static final MCMeta act_intr_rmrks_META = createCommonMeta($act_intr_rmrks, mcframe.commonMS.meta.MS_META.INPT_ACT_INTR_RMRKS);
	public static final MCMeta inpt_act_rpt_rmrks_META = createCommonMeta($inpt_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.INPT_ACT_RPT_RMRKS);
	public static final MCMeta act_trd_rmrks_META = createCommonMeta($act_trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta wk_intr_rmrks_META = createCommonMeta($wk_intr_rmrks, mcframe.commonMS.meta.MS_META.WK_ACT_INTR_RMRKS);
	public static final MCMeta mfg_act_intr_rmrks_META = createCommonMeta($mfg_act_intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_INTR_RMRKS);
	public static final MCMeta mfg_act_rpt_rmrks_META = createCommonMeta($mfg_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_RPT_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta yield_act_intr_rmrks_META = createCommonMeta($yield_act_intr_rmrks, mcframe.commonMS.meta.MS_META.YIELD_ACT_INTR_RMRKS);
	public static final MCMeta yield_act_rpt_rmrks_META = createCommonMeta($yield_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.YIELD_ACT_RPT_RMRKS);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_cmpl_flg_META = createCommonMeta($not_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_act_tm_META = createCommonMeta($st_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_act_tm_META = createCommonMeta($end_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta oper_unit_qty_META = createCommonMeta($oper_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta bkf_ctl_flg_META = createCommonMeta($bkf_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_calc_ctl_flg_META = createCommonMeta($wk_cost_calc_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_yield_META = createCommonMeta($oper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta wk_schd_no_META = createCommonMeta($wk_schd_no, mcframe.commonMA.meta.MA_META.WK_SCHD_NO);
	public static final MCMeta yield_schd_no_META = createCommonMeta($yield_schd_no, mcframe.commonMA.meta.MA_META.YIELD_INST_NO);
	public static final MCMeta ext_inpt_act_no_META = createCommonMeta($ext_inpt_act_no, mcframe.commonMA.meta.MA_META.EXT_INPT_ACT_NO);
	public static final MCMeta ext_wk_act_no_META = createCommonMeta($ext_wk_act_no, mcframe.commonMA.meta.MA_META.EXT_WK_ACT_NO);
	public static final MCMeta ext_yield_act_no_META = createCommonMeta($ext_yield_act_no, mcframe.commonMA.meta.MA_META.EXT_YIELD_ACT_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta act_tm_META = createCommonMeta($act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta if_inpt_typ_META = createCommonMeta($if_inpt_typ, mcframe.commonMS.meta.MS_META.IF_INPT_TYP);
	public static final MCMeta inpt_rsn_cd_META = createCommonMeta($inpt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta loss_rsn_cd_META = createCommonMeta($loss_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta old_loss_rsn_cd_META = createCommonMeta($old_loss_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta acxfr_qty_META = createCommonMeta($acxfr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta acxfr_rsn_cd_META = createCommonMeta($acxfr_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta acxfr_bd_dpt_cd_META = createCommonMeta($acxfr_bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta base_unit_inpt_qty_META = createCommonMeta($base_unit_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta cont_qty_META = createCommonMeta($cont_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta not_pd_chk_flg_META = createCommonMeta($not_pd_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta brk_pd_META = createCommonMeta($brk_pd, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta wk_usr_dpt_cd_META = createCommonMeta($wk_usr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wk_usr_cd_META = createCommonMeta($wk_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta wk_day_cd_META = createCommonMeta($wk_day_cd, mcframe.commonMA.meta.MA_META.WK_DAY_CD);
	public static final MCMeta wk_cost_META = createCommonMeta($wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta wk_rsn_cd_META = createCommonMeta($wk_rsn_cd, mcframe.commonMA.meta.MA_META.WK_RSN_CD);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta fclty_META = createCommonMeta($fclty, mcframe.commonMA.meta.MA_META.FCLTY);
	public static final MCMeta st_hm_META = createCommonMeta($st_hm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_hm_META = createCommonMeta($end_hm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta wk_cost_calc_upd_flg_META = createCommonMeta($wk_cost_calc_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta all_oper_act_reg_flg_META = createCommonMeta($all_oper_act_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_typ_META = createCommonMeta($yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta yield_rsn_cd_META = createCommonMeta($yield_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta yield_rate_META = createCommonMeta($yield_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta same_lot_flg_META = createCommonMeta($same_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_yield_META = createCommonMeta($itm_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta insp_cnt_rmrks_META = createCommonMeta($insp_cnt_rmrks, mcframe.commonMS.meta.MS_META.INSP_CNT_RMRKS);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta mfg_act_usr_cd_META = createCommonMeta($mfg_act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta mfg_act_dpt_cd_META = createCommonMeta($mfg_act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_itm_cd_META = createCommonMeta($mfg_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta mfg_itm_sub1_META = createCommonMeta($mfg_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta mfg_itm_sub2_META = createCommonMeta($mfg_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta mfg_itm_sub3_META = createCommonMeta($mfg_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ext_oper_act_cnt_META = createCommonMeta($ext_oper_act_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ext_act_cnt_META = createCommonMeta($ext_act_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta sub_char4_META = createCommonMeta($sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta sub_char5_META = createCommonMeta($sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta sub_char6_META = createCommonMeta($sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta sub_char7_META = createCommonMeta($sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta sub_char8_META = createCommonMeta($sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta sub_char9_META = createCommonMeta($sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta sub_char10_META = createCommonMeta($sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta sub_char11_META = createCommonMeta($sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta sub_char12_META = createCommonMeta($sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta sub_char13_META = createCommonMeta($sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta sub_char14_META = createCommonMeta($sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta sub_char15_META = createCommonMeta($sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta sub_char16_META = createCommonMeta($sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta sub_char17_META = createCommonMeta($sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta sub_char18_META = createCommonMeta($sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta sub_char19_META = createCommonMeta($sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta sub_char20_META = createCommonMeta($sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta sub_char21_META = createCommonMeta($sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta sub_char22_META = createCommonMeta($sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta sub_char23_META = createCommonMeta($sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta sub_char24_META = createCommonMeta($sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta sub_char25_META = createCommonMeta($sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta sub_char26_META = createCommonMeta($sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta sub_char27_META = createCommonMeta($sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta sub_char28_META = createCommonMeta($sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta sub_char29_META = createCommonMeta($sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta sub_char30_META = createCommonMeta($sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta sub_num1_META = createCommonMeta($sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta sub_num2_META = createCommonMeta($sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta sub_num3_META = createCommonMeta($sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta sub_num4_META = createCommonMeta($sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta sub_num5_META = createCommonMeta($sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta sub_dt1_META = createCommonMeta($sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt2_META = createCommonMeta($sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt3_META = createCommonMeta($sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt4_META = createCommonMeta($sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt5_META = createCommonMeta($sub_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);
	public static final MCMeta log_sub_key1_META = createCommonMeta($log_sub_key1, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY1);
	public static final MCMeta log_sub_key2_META = createCommonMeta($log_sub_key2, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY2);
	public static final MCMeta mfg_loc_cd_lasted_META = createCommonMeta($mfg_loc_cd_lasted, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta site_cd_lasted_META = createCommonMeta($site_cd_lasted, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta wg_cd_lasted_META = createCommonMeta($wg_cd_lasted, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta mfg_mtd_typ_lasted_META = createCommonMeta($mfg_mtd_typ_lasted, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta mfg_str_ln_cd_lasted_META = createCommonMeta($mfg_str_ln_cd_lasted, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta mfg_itm_cd_lasted_META = createCommonMeta($mfg_itm_cd_lasted, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta mfg_itm_sub1_lasted_META = createCommonMeta($mfg_itm_sub1_lasted, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta mfg_itm_sub2_lasted_META = createCommonMeta($mfg_itm_sub2_lasted, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta mfg_itm_sub3_lasted_META = createCommonMeta($mfg_itm_sub3_lasted, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta mfg_strg_loc_cd_META = createCommonMeta($mfg_strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_strg_str_ln_cd_META = createCommonMeta($mfg_strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta mfg_inst_no_lasted_META = createCommonMeta($mfg_inst_no_lasted, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_inst_rev_lasted_META = createCommonMeta($mfg_inst_rev_lasted, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta oper_cd_lasted_META = createCommonMeta($oper_cd_lasted, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_lasted_META = createCommonMeta($oper_seq_lasted, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta inpt_act_no_META = createCommonMeta($inpt_act_no, mcframe.commonMA.meta.MA_META.INPT_ACT_NO);
	public static final MCMeta loss_act_no_META = createCommonMeta($loss_act_no, mcframe.commonMA.meta.MA_META.LOSS_ACT_NO);
	public static final MCMeta wk_act_no_META = createCommonMeta($wk_act_no, mcframe.commonMA.meta.MA_META.WK_ACT_NO);
	public static final MCMeta yield_act_no_META = createCommonMeta($yield_act_no, mcframe.commonMA.meta.MA_META.YIELD_ACT_NO);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta not_dup_imp_flg_META = createCommonMeta($not_dup_imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta if_auto_reg_flg_META = createCommonMeta($if_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta skip_by_if_ctl_flg_META = createCommonMeta($skip_by_if_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_add_flg_META = createCommonMeta($chk_add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta skip_by_oper_del_flg_META = createCommonMeta($skip_by_oper_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno_recv_flg_META = createCommonMeta($sno_recv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_act_flg_META = createCommonMeta($unschd_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta mfg_str_ln_cd_META = createCommonMeta($mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);

	protected static final ConstMetaList<MfgActRecvIf_Upd02_ActLstR> constMetas = new ConstMetaList<MfgActRecvIf_Upd02_ActLstR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			err_flg_META,
			if_proc_typ_META,
			data_lno_META,
			data_no_META,
			exe_sts_typ_META,
			data_crud_typ_META,
			ext_sys_cd_META,
			ext_data_no_META,
			ext_data_lno_META,
			data_make_dt_META,
			imp_flg_META,
			recv_dt_META,
			oper_inst_no_META,
			mfg_inst_no_META,
			oper_act_no_META,
			mfg_act_no_META,
			mfg_inst_rev_META,
			div_seq_META,
			oper_cd_META,
			oper_seq_META,
			ext_oper_act_no_META,
			intr_rmrks_META,
			act_rpt_rmrks_META,
			act_intr_rmrks_META,
			inpt_act_rpt_rmrks_META,
			act_trd_rmrks_META,
			wk_intr_rmrks_META,
			mfg_act_intr_rmrks_META,
			mfg_act_rpt_rmrks_META,
			trd_rmrks_META,
			yield_act_intr_rmrks_META,
			yield_act_rpt_rmrks_META,
			abort_flg_META,
			not_cmpl_flg_META,
			st_act_tm_META,
			end_act_tm_META,
			oper_unit_qty_META,
			bkf_ctl_flg_META,
			wk_cost_calc_ctl_flg_META,
			oper_yield_META,
			inpt_schd_no_META,
			wk_schd_no_META,
			yield_schd_no_META,
			ext_inpt_act_no_META,
			ext_wk_act_no_META,
			ext_yield_act_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			gd_cd_META,
			act_tm_META,
			if_inpt_typ_META,
			inpt_rsn_cd_META,
			loss_rsn_cd_META,
			old_loss_rsn_cd_META,
			acxfr_qty_META,
			acxfr_rsn_cd_META,
			acxfr_bd_dpt_cd_META,
			stk_bp_cd_META,
			stk_arrv_bp_cd_META,
			stk_id_typ_META,
			base_unit_inpt_qty_META,
			inpt_loc_cd_META,
			inpt_str_ln_cd_META,
			cont_qty_META,
			not_pd_chk_flg_META,
			brk_pd_META,
			wk_usr_dpt_cd_META,
			wk_usr_cd_META,
			wk_day_cd_META,
			wk_cost_META,
			wk_rsn_cd_META,
			wk_cost_cd_META,
			fclty_META,
			st_hm_META,
			end_hm_META,
			wk_cost_calc_upd_flg_META,
			ac_dt_META,
			dpt_cd_META,
			loc_cd_META,
			str_ln_cd_META,
			all_oper_act_reg_flg_META,
			yield_typ_META,
			yield_rsn_cd_META,
			yield_rate_META,
			trd_unit_qty_META,
			trd_unit_cd_META,
			base_unit_qty_META,
			base_unit_cd_META,
			same_lot_flg_META,
			itm_yield_META,
			strg_loc_cd_META,
			strg_str_ln_cd_META,
			insp_cnt_rmrks_META,
			quality_typ_META,
			mfg_act_usr_cd_META,
			mfg_act_dpt_cd_META,
			mfg_loc_cd_META,
			mfg_itm_cd_META,
			mfg_itm_sub1_META,
			mfg_itm_sub2_META,
			mfg_itm_sub3_META,
			ext_oper_act_cnt_META,
			ext_act_cnt_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sub_char4_META,
			sub_char5_META,
			sub_char6_META,
			sub_char7_META,
			sub_char8_META,
			sub_char9_META,
			sub_char10_META,
			sub_char11_META,
			sub_char12_META,
			sub_char13_META,
			sub_char14_META,
			sub_char15_META,
			sub_char16_META,
			sub_char17_META,
			sub_char18_META,
			sub_char19_META,
			sub_char20_META,
			sub_char21_META,
			sub_char22_META,
			sub_char23_META,
			sub_char24_META,
			sub_char25_META,
			sub_char26_META,
			sub_char27_META,
			sub_char28_META,
			sub_char29_META,
			sub_char30_META,
			sub_num1_META,
			sub_num2_META,
			sub_num3_META,
			sub_num4_META,
			sub_num5_META,
			sub_dt1_META,
			sub_dt2_META,
			sub_dt3_META,
			sub_dt4_META,
			sub_dt5_META,
			upd_cntr_META,
			upd_srv_req_no_META,
			batch_log_no_META,
			log_sub_key1_META,
			log_sub_key2_META,
			mfg_loc_cd_lasted_META,
			site_cd_lasted_META,
			wg_cd_lasted_META,
			mfg_mtd_typ_lasted_META,
			mfg_str_ln_cd_lasted_META,
			mfg_itm_cd_lasted_META,
			mfg_itm_sub1_lasted_META,
			mfg_itm_sub2_lasted_META,
			mfg_itm_sub3_lasted_META,
			mfg_strg_loc_cd_META,
			mfg_strg_str_ln_cd_META,
			mfg_inst_no_lasted_META,
			mfg_inst_rev_lasted_META,
			oper_cd_lasted_META,
			oper_seq_lasted_META,
			inpt_act_no_META,
			loss_act_no_META,
			wk_act_no_META,
			yield_act_no_META,
			can_ac_dt_META,
			ver_no_META,
			not_dup_imp_flg_META,
			if_auto_reg_flg_META,
			skip_by_if_ctl_flg_META,
			chk_add_flg_META,
			skip_by_oper_del_flg_META,
			sno_recv_flg_META,
			unschd_act_flg_META,
			bom_ptn_META,
			oper_ptn_META,
			mfg_str_ln_cd_META,
			peg_no_META,
			wg_cd_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected MfgActRecvIf_Upd02_ActLstR_MC_A(ConstMetaList<? extends MfgActRecvIf_Upd02_ActLstR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActRecvIf_Upd02_ActLstR clone() {
		return (MfgActRecvIf_Upd02_ActLstR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActRecvIf_Upd02_ActLstR createInstance() {
		return (MfgActRecvIf_Upd02_ActLstR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActRecvIf_Upd02_ActLstR getValues(String... names) {
		return (MfgActRecvIf_Upd02_ActLstR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Error flg. エラーフラグ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 0, $err_flg);
	}

	/**
	 * Error flg. エラーフラグ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 0, $err_flg, value);
	}


	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public String if_proc_typ() {
		return getConstString(offset + 1, $if_proc_typ);
	}

	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public void if_proc_typ(String value) {
		setConstString(offset + 1, $if_proc_typ, value);
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 2, $data_lno);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 2, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 2, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 2, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 2, $data_lno, value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 2, $data_lno, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 3, $data_no);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 3, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 3, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 3, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 3, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 3, $data_no, value);
	}


	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return getConstString(offset + 4, $exe_sts_typ);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		setConstString(offset + 4, $exe_sts_typ, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 5, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 5, $data_crud_typ, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 6, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 6, $ext_sys_cd, value);
	}


	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return getConstNumber(offset + 7, $ext_data_no);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		setConstNumber(offset + 7, $ext_data_no, value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		setConstNumber(offset + 7, $ext_data_no, value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		setConstNumber(offset + 7, $ext_data_no, value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		setConstNumber(offset + 7, $ext_data_no, value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		setConstNumber(offset + 7, $ext_data_no, value);
	}


	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return getConstNumber(offset + 8, $ext_data_lno);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		setConstNumber(offset + 8, $ext_data_lno, value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		setConstNumber(offset + 8, $ext_data_lno, value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		setConstNumber(offset + 8, $ext_data_lno, value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		setConstNumber(offset + 8, $ext_data_lno, value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		setConstNumber(offset + 8, $ext_data_lno, value);
	}


	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return getConstDate(offset + 9, $data_make_dt);
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		setConstDate(offset + 9, $data_make_dt, value);
	}


	/**
	 * To import 取込対象.<p>
	 *
	 */
	public boolean imp_flg() {
		return getConstBoolean(offset + 10, $imp_flg);
	}

	/**
	 * To import 取込対象.<p>
	 *
	 */
	public void imp_flg(boolean value) {
		setConstBoolean(offset + 10, $imp_flg, value);
	}


	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public MCDate recv_dt() {
		return getConstDate(offset + 11, $recv_dt);
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public void recv_dt(MCDate value) {
		setConstDate(offset + 11, $recv_dt, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 12, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 12, $oper_inst_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 13, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 13, $mfg_inst_no, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 14, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 14, $oper_act_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 15, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 15, $mfg_act_no, value);
	}


	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public MCNumber mfg_inst_rev() {
		return getConstNumber(offset + 16, $mfg_inst_rev);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(MCNumber value) {
		setConstNumber(offset + 16, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(int value) {
		setConstNumber(offset + 16, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(long value) {
		setConstNumber(offset + 16, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(float value) {
		setConstNumber(offset + 16, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(double value) {
		setConstNumber(offset + 16, $mfg_inst_rev, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 17, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 17, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 17, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 17, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 17, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 17, $div_seq, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 18, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 18, $oper_cd, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 19, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 19, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 19, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 19, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 19, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 19, $oper_seq, value);
	}


	/**
	 * External operation result No. 外部工程実績ＮＯ.<p>
	 *
	 */
	public String ext_oper_act_no() {
		return getConstString(offset + 20, $ext_oper_act_no);
	}

	/**
	 * External operation result No. 外部工程実績ＮＯ.<p>
	 *
	 */
	public void ext_oper_act_no(String value) {
		setConstString(offset + 20, $ext_oper_act_no, value);
	}


	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 21, $intr_rmrks);
	}

	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 21, $intr_rmrks, value);
	}


	/**
	 * Operation record sheet remarks 工程記録書備考.<p>
	 *
	 */
	public String act_rpt_rmrks() {
		return getConstString(offset + 22, $act_rpt_rmrks);
	}

	/**
	 * Operation record sheet remarks 工程記録書備考.<p>
	 *
	 */
	public void act_rpt_rmrks(String value) {
		setConstString(offset + 22, $act_rpt_rmrks, value);
	}


	/**
	 * Input internal remarks 投入内部備考.<p>
	 *
	 */
	public String act_intr_rmrks() {
		return getConstString(offset + 23, $act_intr_rmrks);
	}

	/**
	 * Input internal remarks 投入内部備考.<p>
	 *
	 */
	public void act_intr_rmrks(String value) {
		setConstString(offset + 23, $act_intr_rmrks, value);
	}


	/**
	 * Input record sheet remarks 投入記録書備考.<p>
	 *
	 */
	public String inpt_act_rpt_rmrks() {
		return getConstString(offset + 24, $inpt_act_rpt_rmrks);
	}

	/**
	 * Input record sheet remarks 投入記録書備考.<p>
	 *
	 */
	public void inpt_act_rpt_rmrks(String value) {
		setConstString(offset + 24, $inpt_act_rpt_rmrks, value);
	}


	/**
	 * Input transaction remarks 投入取引備考.<p>
	 *
	 */
	public String act_trd_rmrks() {
		return getConstString(offset + 25, $act_trd_rmrks);
	}

	/**
	 * Input transaction remarks 投入取引備考.<p>
	 *
	 */
	public void act_trd_rmrks(String value) {
		setConstString(offset + 25, $act_trd_rmrks, value);
	}


	/**
	 * Man-hour internal remarks 工数内部備考.<p>
	 *
	 */
	public String wk_intr_rmrks() {
		return getConstString(offset + 26, $wk_intr_rmrks);
	}

	/**
	 * Man-hour internal remarks 工数内部備考.<p>
	 *
	 */
	public void wk_intr_rmrks(String value) {
		setConstString(offset + 26, $wk_intr_rmrks, value);
	}


	/**
	 * Mfg. internal remarks 製造内部備考.<p>
	 *
	 */
	public String mfg_act_intr_rmrks() {
		return getConstString(offset + 27, $mfg_act_intr_rmrks);
	}

	/**
	 * Mfg. internal remarks 製造内部備考.<p>
	 *
	 */
	public void mfg_act_intr_rmrks(String value) {
		setConstString(offset + 27, $mfg_act_intr_rmrks, value);
	}


	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public String mfg_act_rpt_rmrks() {
		return getConstString(offset + 28, $mfg_act_rpt_rmrks);
	}

	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public void mfg_act_rpt_rmrks(String value) {
		setConstString(offset + 28, $mfg_act_rpt_rmrks, value);
	}


	/**
	 * Output transaction remarks 出来高取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 29, $trd_rmrks);
	}

	/**
	 * Output transaction remarks 出来高取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 29, $trd_rmrks, value);
	}


	/**
	 * Output internal remarks 出来高内部備考.<p>
	 *
	 */
	public String yield_act_intr_rmrks() {
		return getConstString(offset + 30, $yield_act_intr_rmrks);
	}

	/**
	 * Output internal remarks 出来高内部備考.<p>
	 *
	 */
	public void yield_act_intr_rmrks(String value) {
		setConstString(offset + 30, $yield_act_intr_rmrks, value);
	}


	/**
	 * Output record sheet remarks 出来高記録書備考.<p>
	 *
	 */
	public String yield_act_rpt_rmrks() {
		return getConstString(offset + 31, $yield_act_rpt_rmrks);
	}

	/**
	 * Output record sheet remarks 出来高記録書備考.<p>
	 *
	 */
	public void yield_act_rpt_rmrks(String value) {
		setConstString(offset + 31, $yield_act_rpt_rmrks, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 32, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 32, $abort_flg, value);
	}


	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public boolean not_cmpl_flg() {
		return getConstBoolean(offset + 33, $not_cmpl_flg);
	}

	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public void not_cmpl_flg(boolean value) {
		setConstBoolean(offset + 33, $not_cmpl_flg, value);
	}


	/**
	 * Actual start date and time 着手実績日時.<p>
	 *
	 */
	public MCDate st_act_tm() {
		return getConstDate(offset + 34, $st_act_tm);
	}

	/**
	 * Actual start date and time 着手実績日時.<p>
	 *
	 */
	public void st_act_tm(MCDate value) {
		setConstDate(offset + 34, $st_act_tm, value);
	}


	/**
	 * Actual end date and time 終了実績日時.<p>
	 *
	 */
	public MCDate end_act_tm() {
		return getConstDate(offset + 35, $end_act_tm);
	}

	/**
	 * Actual end date and time 終了実績日時.<p>
	 *
	 */
	public void end_act_tm(MCDate value) {
		setConstDate(offset + 35, $end_act_tm, value);
	}


	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public MCNumber oper_unit_qty() {
		return getConstNumber(offset + 36, $oper_unit_qty);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_qty(MCNumber value) {
		setConstNumber(offset + 36, $oper_unit_qty, value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_qty(int value) {
		setConstNumber(offset + 36, $oper_unit_qty, value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_qty(long value) {
		setConstNumber(offset + 36, $oper_unit_qty, value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_qty(float value) {
		setConstNumber(offset + 36, $oper_unit_qty, value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_qty(double value) {
		setConstNumber(offset + 36, $oper_unit_qty, value);
	}


	/**
	 * Allow Operation backlash update 工程バックフラッシュ更新許可.<p>
	 *
	 */
	public boolean bkf_ctl_flg() {
		return getConstBoolean(offset + 37, $bkf_ctl_flg);
	}

	/**
	 * Allow Operation backlash update 工程バックフラッシュ更新許可.<p>
	 *
	 */
	public void bkf_ctl_flg(boolean value) {
		setConstBoolean(offset + 37, $bkf_ctl_flg, value);
	}


	/**
	 * Allow update of operation man-hour auto-calculation 工程自動工数計算更新許可.<p>
	 *
	 */
	public boolean wk_cost_calc_ctl_flg() {
		return getConstBoolean(offset + 38, $wk_cost_calc_ctl_flg);
	}

	/**
	 * Allow update of operation man-hour auto-calculation 工程自動工数計算更新許可.<p>
	 *
	 */
	public void wk_cost_calc_ctl_flg(boolean value) {
		setConstBoolean(offset + 38, $wk_cost_calc_ctl_flg, value);
	}


	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public MCNumber oper_yield() {
		return getConstNumber(offset + 39, $oper_yield);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(MCNumber value) {
		setConstNumber(offset + 39, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(int value) {
		setConstNumber(offset + 39, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(long value) {
		setConstNumber(offset + 39, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(float value) {
		setConstNumber(offset + 39, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(double value) {
		setConstNumber(offset + 39, $oper_yield, value);
	}


	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 40, $inpt_schd_no);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 40, $inpt_schd_no, value);
	}


	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public String wk_schd_no() {
		return getConstString(offset + 41, $wk_schd_no);
	}

	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public void wk_schd_no(String value) {
		setConstString(offset + 41, $wk_schd_no, value);
	}


	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public String yield_schd_no() {
		return getConstString(offset + 42, $yield_schd_no);
	}

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public void yield_schd_no(String value) {
		setConstString(offset + 42, $yield_schd_no, value);
	}


	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public String ext_inpt_act_no() {
		return getConstString(offset + 43, $ext_inpt_act_no);
	}

	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public void ext_inpt_act_no(String value) {
		setConstString(offset + 43, $ext_inpt_act_no, value);
	}


	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public String ext_wk_act_no() {
		return getConstString(offset + 44, $ext_wk_act_no);
	}

	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public void ext_wk_act_no(String value) {
		setConstString(offset + 44, $ext_wk_act_no, value);
	}


	/**
	 * External output result No. 外部出来高実績ＮＯ.<p>
	 *
	 */
	public String ext_yield_act_no() {
		return getConstString(offset + 45, $ext_yield_act_no);
	}

	/**
	 * External output result No. 外部出来高実績ＮＯ.<p>
	 *
	 */
	public void ext_yield_act_no(String value) {
		setConstString(offset + 45, $ext_yield_act_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 46, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 46, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 47, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 47, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 48, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 48, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 49, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 49, $itm_sub3, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 50, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 50, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 51, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 51, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 52, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 52, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 53, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 53, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 54, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 54, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 55, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 55, $sno4, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 56, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 56, $gd_cd, value);
	}


	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public MCDate act_tm() {
		return getConstDate(offset + 57, $act_tm);
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public void act_tm(MCDate value) {
		setConstDate(offset + 57, $act_tm, value);
	}


	/**
	 * IF input type ＩＦ投入区分.<p>
	 *
	 */
	public String if_inpt_typ() {
		return getConstString(offset + 58, $if_inpt_typ);
	}

	/**
	 * IF input type ＩＦ投入区分.<p>
	 *
	 */
	public void if_inpt_typ(String value) {
		setConstString(offset + 58, $if_inpt_typ, value);
	}


	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public String inpt_rsn_cd() {
		return getConstString(offset + 59, $inpt_rsn_cd);
	}

	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public void inpt_rsn_cd(String value) {
		setConstString(offset + 59, $inpt_rsn_cd, value);
	}


	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public String loss_rsn_cd() {
		return getConstString(offset + 60, $loss_rsn_cd);
	}

	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public void loss_rsn_cd(String value) {
		setConstString(offset + 60, $loss_rsn_cd, value);
	}


	/**
	 * Loss reason cd. before change 変更前ロス理由ＣＤ.<p>
	 *
	 */
	public String old_loss_rsn_cd() {
		return getConstString(offset + 61, $old_loss_rsn_cd);
	}

	/**
	 * Loss reason cd. before change 変更前ロス理由ＣＤ.<p>
	 *
	 */
	public void old_loss_rsn_cd(String value) {
		setConstString(offset + 61, $old_loss_rsn_cd, value);
	}


	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public MCNumber acxfr_qty() {
		return getConstNumber(offset + 62, $acxfr_qty);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_qty(MCNumber value) {
		setConstNumber(offset + 62, $acxfr_qty, value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_qty(int value) {
		setConstNumber(offset + 62, $acxfr_qty, value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_qty(long value) {
		setConstNumber(offset + 62, $acxfr_qty, value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_qty(float value) {
		setConstNumber(offset + 62, $acxfr_qty, value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_qty(double value) {
		setConstNumber(offset + 62, $acxfr_qty, value);
	}


	/**
	 * Other accounting transfer reason cd. 他勘定振替理由ＣＤ.<p>
	 *
	 */
	public String acxfr_rsn_cd() {
		return getConstString(offset + 63, $acxfr_rsn_cd);
	}

	/**
	 * Other accounting transfer reason cd. 他勘定振替理由ＣＤ.<p>
	 *
	 */
	public void acxfr_rsn_cd(String value) {
		setConstString(offset + 63, $acxfr_rsn_cd, value);
	}


	/**
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public String acxfr_bd_dpt_cd() {
		return getConstString(offset + 64, $acxfr_bd_dpt_cd);
	}

	/**
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public void acxfr_bd_dpt_cd(String value) {
		setConstString(offset + 64, $acxfr_bd_dpt_cd, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 65, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 65, $stk_bp_cd, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 66, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 66, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 67, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 67, $stk_id_typ, value);
	}


	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty() {
		return getConstNumber(offset + 68, $base_unit_inpt_qty);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(MCNumber value) {
		setConstNumber(offset + 68, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(int value) {
		setConstNumber(offset + 68, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(long value) {
		setConstNumber(offset + 68, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(float value) {
		setConstNumber(offset + 68, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(double value) {
		setConstNumber(offset + 68, $base_unit_inpt_qty, value);
	}


	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 69, $inpt_loc_cd);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 69, $inpt_loc_cd, value);
	}


	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 70, $inpt_str_ln_cd);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 70, $inpt_str_ln_cd, value);
	}


	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return getConstNumber(offset + 71, $cont_qty);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		setConstNumber(offset + 71, $cont_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_qty(int value) {
		setConstNumber(offset + 71, $cont_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_qty(long value) {
		setConstNumber(offset + 71, $cont_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_qty(float value) {
		setConstNumber(offset + 71, $cont_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_qty(double value) {
		setConstNumber(offset + 71, $cont_qty, value);
	}


	/**
	 * No expiration check 期限チェックしない.<p>
	 *
	 */
	public boolean not_pd_chk_flg() {
		return getConstBoolean(offset + 72, $not_pd_chk_flg);
	}

	/**
	 * No expiration check 期限チェックしない.<p>
	 *
	 */
	public void not_pd_chk_flg(boolean value) {
		setConstBoolean(offset + 72, $not_pd_chk_flg, value);
	}


	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public MCNumber brk_pd() {
		return getConstNumber(offset + 73, $brk_pd);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(MCNumber value) {
		setConstNumber(offset + 73, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(int value) {
		setConstNumber(offset + 73, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(long value) {
		setConstNumber(offset + 73, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(float value) {
		setConstNumber(offset + 73, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(double value) {
		setConstNumber(offset + 73, $brk_pd, value);
	}


	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public String wk_usr_dpt_cd() {
		return getConstString(offset + 74, $wk_usr_dpt_cd);
	}

	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public void wk_usr_dpt_cd(String value) {
		setConstString(offset + 74, $wk_usr_dpt_cd, value);
	}


	/**
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public String wk_usr_cd() {
		return getConstString(offset + 75, $wk_usr_cd);
	}

	/**
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public void wk_usr_cd(String value) {
		setConstString(offset + 75, $wk_usr_cd, value);
	}


	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public String wk_day_cd() {
		return getConstString(offset + 76, $wk_day_cd);
	}

	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public void wk_day_cd(String value) {
		setConstString(offset + 76, $wk_day_cd, value);
	}


	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public MCNumber wk_cost() {
		return getConstNumber(offset + 77, $wk_cost);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void wk_cost(MCNumber value) {
		setConstNumber(offset + 77, $wk_cost, value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void wk_cost(int value) {
		setConstNumber(offset + 77, $wk_cost, value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void wk_cost(long value) {
		setConstNumber(offset + 77, $wk_cost, value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void wk_cost(float value) {
		setConstNumber(offset + 77, $wk_cost, value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void wk_cost(double value) {
		setConstNumber(offset + 77, $wk_cost, value);
	}


	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public String wk_rsn_cd() {
		return getConstString(offset + 78, $wk_rsn_cd);
	}

	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public void wk_rsn_cd(String value) {
		setConstString(offset + 78, $wk_rsn_cd, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 79, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 79, $wk_cost_cd, value);
	}


	/**
	 * Equipment 設備.<p>
	 *
	 */
	public String fclty() {
		return getConstString(offset + 80, $fclty);
	}

	/**
	 * Equipment 設備.<p>
	 *
	 */
	public void fclty(String value) {
		setConstString(offset + 80, $fclty, value);
	}


	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public MCDate st_hm() {
		return getConstDate(offset + 81, $st_hm);
	}

	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public void st_hm(MCDate value) {
		setConstDate(offset + 81, $st_hm, value);
	}


	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public MCDate end_hm() {
		return getConstDate(offset + 82, $end_hm);
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public void end_hm(MCDate value) {
		setConstDate(offset + 82, $end_hm, value);
	}


	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public boolean wk_cost_calc_upd_flg() {
		return getConstBoolean(offset + 83, $wk_cost_calc_upd_flg);
	}

	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public void wk_cost_calc_upd_flg(boolean value) {
		setConstBoolean(offset + 83, $wk_cost_calc_upd_flg, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 84, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 84, $ac_dt, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 85, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 85, $dpt_cd, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 86, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 86, $loc_cd, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 87, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 87, $str_ln_cd, value);
	}


	/**
	 * Create all operation results 全工程実績作成.<p>
	 *
	 */
	public boolean all_oper_act_reg_flg() {
		return getConstBoolean(offset + 88, $all_oper_act_reg_flg);
	}

	/**
	 * Create all operation results 全工程実績作成.<p>
	 *
	 */
	public void all_oper_act_reg_flg(boolean value) {
		setConstBoolean(offset + 88, $all_oper_act_reg_flg, value);
	}


	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public String yield_typ() {
		return getConstString(offset + 89, $yield_typ);
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public void yield_typ(String value) {
		setConstString(offset + 89, $yield_typ, value);
	}


	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public String yield_rsn_cd() {
		return getConstString(offset + 90, $yield_rsn_cd);
	}

	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public void yield_rsn_cd(String value) {
		setConstString(offset + 90, $yield_rsn_cd, value);
	}


	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public MCNumber yield_rate() {
		return getConstNumber(offset + 91, $yield_rate);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(MCNumber value) {
		setConstNumber(offset + 91, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(int value) {
		setConstNumber(offset + 91, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(long value) {
		setConstNumber(offset + 91, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(float value) {
		setConstNumber(offset + 91, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(double value) {
		setConstNumber(offset + 91, $yield_rate, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 92, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 92, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 92, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 92, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 92, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 92, $trd_unit_qty, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 93, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 93, $trd_unit_cd, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 94, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 94, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 94, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 94, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 94, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 94, $base_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 95, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 95, $base_unit_cd, value);
	}


	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public boolean same_lot_flg() {
		return getConstBoolean(offset + 96, $same_lot_flg);
	}

	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public void same_lot_flg(boolean value) {
		setConstBoolean(offset + 96, $same_lot_flg, value);
	}


	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public MCNumber itm_yield() {
		return getConstNumber(offset + 97, $itm_yield);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(MCNumber value) {
		setConstNumber(offset + 97, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(int value) {
		setConstNumber(offset + 97, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(long value) {
		setConstNumber(offset + 97, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(float value) {
		setConstNumber(offset + 97, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(double value) {
		setConstNumber(offset + 97, $itm_yield, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 98, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 98, $strg_loc_cd, value);
	}


	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 99, $strg_str_ln_cd);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 99, $strg_str_ln_cd, value);
	}


	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return getConstString(offset + 100, $insp_cnt_rmrks);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		setConstString(offset + 100, $insp_cnt_rmrks, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 101, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 101, $quality_typ, value);
	}


	/**
	 * Mfg. result PIC cd. 製造実績責任者ＣＤ.<p>
	 *
	 */
	public String mfg_act_usr_cd() {
		return getConstString(offset + 102, $mfg_act_usr_cd);
	}

	/**
	 * Mfg. result PIC cd. 製造実績責任者ＣＤ.<p>
	 *
	 */
	public void mfg_act_usr_cd(String value) {
		setConstString(offset + 102, $mfg_act_usr_cd, value);
	}


	/**
	 * Mfg. result dept. cd. 製造実績部門ＣＤ.<p>
	 *
	 */
	public String mfg_act_dpt_cd() {
		return getConstString(offset + 103, $mfg_act_dpt_cd);
	}

	/**
	 * Mfg. result dept. cd. 製造実績部門ＣＤ.<p>
	 *
	 */
	public void mfg_act_dpt_cd(String value) {
		setConstString(offset + 103, $mfg_act_dpt_cd, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 104, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 104, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. item cd. 製造品目ＣＤ.<p>
	 *
	 */
	public String mfg_itm_cd() {
		return getConstString(offset + 105, $mfg_itm_cd);
	}

	/**
	 * Mfg. item cd. 製造品目ＣＤ.<p>
	 *
	 */
	public void mfg_itm_cd(String value) {
		setConstString(offset + 105, $mfg_itm_cd, value);
	}


	/**
	 * Mfg. item branch No. 1 製造品目枝番１.<p>
	 *
	 */
	public String mfg_itm_sub1() {
		return getConstString(offset + 106, $mfg_itm_sub1);
	}

	/**
	 * Mfg. item branch No. 1 製造品目枝番１.<p>
	 *
	 */
	public void mfg_itm_sub1(String value) {
		setConstString(offset + 106, $mfg_itm_sub1, value);
	}


	/**
	 * Mfg. item branch No. 2 製造品目枝番２.<p>
	 *
	 */
	public String mfg_itm_sub2() {
		return getConstString(offset + 107, $mfg_itm_sub2);
	}

	/**
	 * Mfg. item branch No. 2 製造品目枝番２.<p>
	 *
	 */
	public void mfg_itm_sub2(String value) {
		setConstString(offset + 107, $mfg_itm_sub2, value);
	}


	/**
	 * Mfg. item branch No. 3 製造品目枝番３.<p>
	 *
	 */
	public String mfg_itm_sub3() {
		return getConstString(offset + 108, $mfg_itm_sub3);
	}

	/**
	 * Mfg. item branch No. 3 製造品目枝番３.<p>
	 *
	 */
	public void mfg_itm_sub3(String value) {
		setConstString(offset + 108, $mfg_itm_sub3, value);
	}


	/**
	 * External operation results qty. 外部工程実績数.<p>
	 *
	 */
	public MCNumber ext_oper_act_cnt() {
		return getConstNumber(offset + 109, $ext_oper_act_cnt);
	}

	/**
	 * External operation results qty. 外部工程実績数.<p>
	 *
	 */
	public void ext_oper_act_cnt(MCNumber value) {
		setConstNumber(offset + 109, $ext_oper_act_cnt, value);
	}

	/**
	 * External operation results qty. 外部工程実績数.<p>
	 *
	 */
	public void ext_oper_act_cnt(int value) {
		setConstNumber(offset + 109, $ext_oper_act_cnt, value);
	}

	/**
	 * External operation results qty. 外部工程実績数.<p>
	 *
	 */
	public void ext_oper_act_cnt(long value) {
		setConstNumber(offset + 109, $ext_oper_act_cnt, value);
	}

	/**
	 * External operation results qty. 外部工程実績数.<p>
	 *
	 */
	public void ext_oper_act_cnt(float value) {
		setConstNumber(offset + 109, $ext_oper_act_cnt, value);
	}

	/**
	 * External operation results qty. 外部工程実績数.<p>
	 *
	 */
	public void ext_oper_act_cnt(double value) {
		setConstNumber(offset + 109, $ext_oper_act_cnt, value);
	}


	/**
	 * External results qty. 外部実績数.<p>
	 *
	 */
	public MCNumber ext_act_cnt() {
		return getConstNumber(offset + 110, $ext_act_cnt);
	}

	/**
	 * External results qty. 外部実績数.<p>
	 *
	 */
	public void ext_act_cnt(MCNumber value) {
		setConstNumber(offset + 110, $ext_act_cnt, value);
	}

	/**
	 * External results qty. 外部実績数.<p>
	 *
	 */
	public void ext_act_cnt(int value) {
		setConstNumber(offset + 110, $ext_act_cnt, value);
	}

	/**
	 * External results qty. 外部実績数.<p>
	 *
	 */
	public void ext_act_cnt(long value) {
		setConstNumber(offset + 110, $ext_act_cnt, value);
	}

	/**
	 * External results qty. 外部実績数.<p>
	 *
	 */
	public void ext_act_cnt(float value) {
		setConstNumber(offset + 110, $ext_act_cnt, value);
	}

	/**
	 * External results qty. 外部実績数.<p>
	 *
	 */
	public void ext_act_cnt(double value) {
		setConstNumber(offset + 110, $ext_act_cnt, value);
	}


	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 111, $sub_char1);
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 111, $sub_char1, value);
	}


	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 112, $sub_char2);
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 112, $sub_char2, value);
	}


	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 113, $sub_char3);
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 113, $sub_char3, value);
	}


	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 114, $sub_char4);
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 114, $sub_char4, value);
	}


	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 115, $sub_char5);
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 115, $sub_char5, value);
	}


	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 116, $sub_char6);
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 116, $sub_char6, value);
	}


	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 117, $sub_char7);
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 117, $sub_char7, value);
	}


	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 118, $sub_char8);
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 118, $sub_char8, value);
	}


	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 119, $sub_char9);
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 119, $sub_char9, value);
	}


	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 120, $sub_char10);
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 120, $sub_char10, value);
	}


	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 121, $sub_char11);
	}

	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 121, $sub_char11, value);
	}


	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 122, $sub_char12);
	}

	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 122, $sub_char12, value);
	}


	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 123, $sub_char13);
	}

	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 123, $sub_char13, value);
	}


	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 124, $sub_char14);
	}

	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 124, $sub_char14, value);
	}


	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 125, $sub_char15);
	}

	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 125, $sub_char15, value);
	}


	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 126, $sub_char16);
	}

	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 126, $sub_char16, value);
	}


	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 127, $sub_char17);
	}

	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 127, $sub_char17, value);
	}


	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 128, $sub_char18);
	}

	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 128, $sub_char18, value);
	}


	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 129, $sub_char19);
	}

	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 129, $sub_char19, value);
	}


	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 130, $sub_char20);
	}

	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 130, $sub_char20, value);
	}


	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 131, $sub_char21);
	}

	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 131, $sub_char21, value);
	}


	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 132, $sub_char22);
	}

	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 132, $sub_char22, value);
	}


	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 133, $sub_char23);
	}

	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 133, $sub_char23, value);
	}


	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 134, $sub_char24);
	}

	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 134, $sub_char24, value);
	}


	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 135, $sub_char25);
	}

	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 135, $sub_char25, value);
	}


	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 136, $sub_char26);
	}

	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 136, $sub_char26, value);
	}


	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 137, $sub_char27);
	}

	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 137, $sub_char27, value);
	}


	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 138, $sub_char28);
	}

	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 138, $sub_char28, value);
	}


	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 139, $sub_char29);
	}

	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 139, $sub_char29, value);
	}


	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 140, $sub_char30);
	}

	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 140, $sub_char30, value);
	}


	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 141, $sub_num1);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 141, $sub_num1, value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 141, $sub_num1, value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 141, $sub_num1, value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 141, $sub_num1, value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 141, $sub_num1, value);
	}


	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 142, $sub_num2);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 142, $sub_num2, value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 142, $sub_num2, value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 142, $sub_num2, value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 142, $sub_num2, value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 142, $sub_num2, value);
	}


	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 143, $sub_num3);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 143, $sub_num3, value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 143, $sub_num3, value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 143, $sub_num3, value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 143, $sub_num3, value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 143, $sub_num3, value);
	}


	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 144, $sub_num4);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 144, $sub_num4, value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 144, $sub_num4, value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 144, $sub_num4, value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 144, $sub_num4, value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 144, $sub_num4, value);
	}


	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 145, $sub_num5);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 145, $sub_num5, value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 145, $sub_num5, value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 145, $sub_num5, value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 145, $sub_num5, value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 145, $sub_num5, value);
	}


	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 146, $sub_dt1);
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 146, $sub_dt1, value);
	}


	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 147, $sub_dt2);
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 147, $sub_dt2, value);
	}


	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 148, $sub_dt3);
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 148, $sub_dt3, value);
	}


	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 149, $sub_dt4);
	}

	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 149, $sub_dt4, value);
	}


	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 150, $sub_dt5);
	}

	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 150, $sub_dt5, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 151, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 151, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 151, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 151, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 151, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 151, $upd_cntr, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 152, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 152, $upd_srv_req_no, value);
	}


	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 153, $batch_log_no);
	}

	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 153, $batch_log_no, value);
	}


	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 154, $log_sub_key1);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 154, $log_sub_key1, value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 154, $log_sub_key1, value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 154, $log_sub_key1, value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 154, $log_sub_key1, value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 154, $log_sub_key1, value);
	}


	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 155, $log_sub_key2);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 155, $log_sub_key2, value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 155, $log_sub_key2, value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 155, $log_sub_key2, value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 155, $log_sub_key2, value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 155, $log_sub_key2, value);
	}


	/**
	 * Mfg. location cd. (Latest) 製造場所ＣＤ（最新）.<p>
	 *
	 */
	public String mfg_loc_cd_lasted() {
		return getConstString(offset + 156, $mfg_loc_cd_lasted);
	}

	/**
	 * Mfg. location cd. (Latest) 製造場所ＣＤ（最新）.<p>
	 *
	 */
	public void mfg_loc_cd_lasted(String value) {
		setConstString(offset + 156, $mfg_loc_cd_lasted, value);
	}


	/**
	 * Factory/Distribution warehouse cd. (Latest) 工場・物流倉庫ＣＤ（最新）.<p>
	 *
	 */
	public String site_cd_lasted() {
		return getConstString(offset + 157, $site_cd_lasted);
	}

	/**
	 * Factory/Distribution warehouse cd. (Latest) 工場・物流倉庫ＣＤ（最新）.<p>
	 *
	 */
	public void site_cd_lasted(String value) {
		setConstString(offset + 157, $site_cd_lasted, value);
	}


	/**
	 * WG cd. (Latest) ワーキンググループＣＤ（最新）.<p>
	 *
	 */
	public String wg_cd_lasted() {
		return getConstString(offset + 158, $wg_cd_lasted);
	}

	/**
	 * WG cd. (Latest) ワーキンググループＣＤ（最新）.<p>
	 *
	 */
	public void wg_cd_lasted(String value) {
		setConstString(offset + 158, $wg_cd_lasted, value);
	}


	/**
	 * Production method type (Latest) 生産方法区分（最新）.<p>
	 *
	 */
	public String mfg_mtd_typ_lasted() {
		return getConstString(offset + 159, $mfg_mtd_typ_lasted);
	}

	/**
	 * Production method type (Latest) 生産方法区分（最新）.<p>
	 *
	 */
	public void mfg_mtd_typ_lasted(String value) {
		setConstString(offset + 159, $mfg_mtd_typ_lasted, value);
	}


	/**
	 * Mfg. rack/line cd. (Latest) 製造棚・ラインＣＤ（最新）.<p>
	 *
	 */
	public String mfg_str_ln_cd_lasted() {
		return getConstString(offset + 160, $mfg_str_ln_cd_lasted);
	}

	/**
	 * Mfg. rack/line cd. (Latest) 製造棚・ラインＣＤ（最新）.<p>
	 *
	 */
	public void mfg_str_ln_cd_lasted(String value) {
		setConstString(offset + 160, $mfg_str_ln_cd_lasted, value);
	}


	/**
	 * Mfg. item cd. (Latest) 製造品目ＣＤ（最新）.<p>
	 *
	 */
	public String mfg_itm_cd_lasted() {
		return getConstString(offset + 161, $mfg_itm_cd_lasted);
	}

	/**
	 * Mfg. item cd. (Latest) 製造品目ＣＤ（最新）.<p>
	 *
	 */
	public void mfg_itm_cd_lasted(String value) {
		setConstString(offset + 161, $mfg_itm_cd_lasted, value);
	}


	/**
	 * Mfg. item branch No. 1 (Latest) 製造品目枝番１（最新）.<p>
	 *
	 */
	public String mfg_itm_sub1_lasted() {
		return getConstString(offset + 162, $mfg_itm_sub1_lasted);
	}

	/**
	 * Mfg. item branch No. 1 (Latest) 製造品目枝番１（最新）.<p>
	 *
	 */
	public void mfg_itm_sub1_lasted(String value) {
		setConstString(offset + 162, $mfg_itm_sub1_lasted, value);
	}


	/**
	 * Mfg. item branch No. 2 (Latest) 製造品目枝番２（最新）.<p>
	 *
	 */
	public String mfg_itm_sub2_lasted() {
		return getConstString(offset + 163, $mfg_itm_sub2_lasted);
	}

	/**
	 * Mfg. item branch No. 2 (Latest) 製造品目枝番２（最新）.<p>
	 *
	 */
	public void mfg_itm_sub2_lasted(String value) {
		setConstString(offset + 163, $mfg_itm_sub2_lasted, value);
	}


	/**
	 * Mfg. item branch No. 3 (Latest) 製造品目枝番３（最新）.<p>
	 *
	 */
	public String mfg_itm_sub3_lasted() {
		return getConstString(offset + 164, $mfg_itm_sub3_lasted);
	}

	/**
	 * Mfg. item branch No. 3 (Latest) 製造品目枝番３（最新）.<p>
	 *
	 */
	public void mfg_itm_sub3_lasted(String value) {
		setConstString(offset + 164, $mfg_itm_sub3_lasted, value);
	}


	/**
	 * Mfg. storage location cd. 製造格納先場所ＣＤ.<p>
	 *
	 */
	public String mfg_strg_loc_cd() {
		return getConstString(offset + 165, $mfg_strg_loc_cd);
	}

	/**
	 * Mfg. storage location cd. 製造格納先場所ＣＤ.<p>
	 *
	 */
	public void mfg_strg_loc_cd(String value) {
		setConstString(offset + 165, $mfg_strg_loc_cd, value);
	}


	/**
	 * Mfg. storage rack/line cd. 製造格納棚・ラインＣＤ.<p>
	 *
	 */
	public String mfg_strg_str_ln_cd() {
		return getConstString(offset + 166, $mfg_strg_str_ln_cd);
	}

	/**
	 * Mfg. storage rack/line cd. 製造格納棚・ラインＣＤ.<p>
	 *
	 */
	public void mfg_strg_str_ln_cd(String value) {
		setConstString(offset + 166, $mfg_strg_str_ln_cd, value);
	}


	/**
	 * Mfg. order No. (Latest) 製造指図ＮＯ（最新）.<p>
	 *
	 */
	public String mfg_inst_no_lasted() {
		return getConstString(offset + 167, $mfg_inst_no_lasted);
	}

	/**
	 * Mfg. order No. (Latest) 製造指図ＮＯ（最新）.<p>
	 *
	 */
	public void mfg_inst_no_lasted(String value) {
		setConstString(offset + 167, $mfg_inst_no_lasted, value);
	}


	/**
	 * Mfg. order rev. No. (Latest) 製造指図改訂番号（最新）.<p>
	 *
	 */
	public MCNumber mfg_inst_rev_lasted() {
		return getConstNumber(offset + 168, $mfg_inst_rev_lasted);
	}

	/**
	 * Mfg. order rev. No. (Latest) 製造指図改訂番号（最新）.<p>
	 *
	 */
	public void mfg_inst_rev_lasted(MCNumber value) {
		setConstNumber(offset + 168, $mfg_inst_rev_lasted, value);
	}

	/**
	 * Mfg. order rev. No. (Latest) 製造指図改訂番号（最新）.<p>
	 *
	 */
	public void mfg_inst_rev_lasted(int value) {
		setConstNumber(offset + 168, $mfg_inst_rev_lasted, value);
	}

	/**
	 * Mfg. order rev. No. (Latest) 製造指図改訂番号（最新）.<p>
	 *
	 */
	public void mfg_inst_rev_lasted(long value) {
		setConstNumber(offset + 168, $mfg_inst_rev_lasted, value);
	}

	/**
	 * Mfg. order rev. No. (Latest) 製造指図改訂番号（最新）.<p>
	 *
	 */
	public void mfg_inst_rev_lasted(float value) {
		setConstNumber(offset + 168, $mfg_inst_rev_lasted, value);
	}

	/**
	 * Mfg. order rev. No. (Latest) 製造指図改訂番号（最新）.<p>
	 *
	 */
	public void mfg_inst_rev_lasted(double value) {
		setConstNumber(offset + 168, $mfg_inst_rev_lasted, value);
	}


	/**
	 * Operation cd. (Latest) 工程ＣＤ（最新）.<p>
	 *
	 */
	public String oper_cd_lasted() {
		return getConstString(offset + 169, $oper_cd_lasted);
	}

	/**
	 * Operation cd. (Latest) 工程ＣＤ（最新）.<p>
	 *
	 */
	public void oper_cd_lasted(String value) {
		setConstString(offset + 169, $oper_cd_lasted, value);
	}


	/**
	 * Operation sequence No. (Latest) 工程連番（最新）.<p>
	 *
	 */
	public MCNumber oper_seq_lasted() {
		return getConstNumber(offset + 170, $oper_seq_lasted);
	}

	/**
	 * Operation sequence No. (Latest) 工程連番（最新）.<p>
	 *
	 */
	public void oper_seq_lasted(MCNumber value) {
		setConstNumber(offset + 170, $oper_seq_lasted, value);
	}

	/**
	 * Operation sequence No. (Latest) 工程連番（最新）.<p>
	 *
	 */
	public void oper_seq_lasted(int value) {
		setConstNumber(offset + 170, $oper_seq_lasted, value);
	}

	/**
	 * Operation sequence No. (Latest) 工程連番（最新）.<p>
	 *
	 */
	public void oper_seq_lasted(long value) {
		setConstNumber(offset + 170, $oper_seq_lasted, value);
	}

	/**
	 * Operation sequence No. (Latest) 工程連番（最新）.<p>
	 *
	 */
	public void oper_seq_lasted(float value) {
		setConstNumber(offset + 170, $oper_seq_lasted, value);
	}

	/**
	 * Operation sequence No. (Latest) 工程連番（最新）.<p>
	 *
	 */
	public void oper_seq_lasted(double value) {
		setConstNumber(offset + 170, $oper_seq_lasted, value);
	}


	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public String inpt_act_no() {
		return getConstString(offset + 171, $inpt_act_no);
	}

	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public void inpt_act_no(String value) {
		setConstString(offset + 171, $inpt_act_no, value);
	}


	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public String loss_act_no() {
		return getConstString(offset + 172, $loss_act_no);
	}

	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public void loss_act_no(String value) {
		setConstString(offset + 172, $loss_act_no, value);
	}


	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public String wk_act_no() {
		return getConstString(offset + 173, $wk_act_no);
	}

	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public void wk_act_no(String value) {
		setConstString(offset + 173, $wk_act_no, value);
	}


	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public String yield_act_no() {
		return getConstString(offset + 174, $yield_act_no);
	}

	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public void yield_act_no(String value) {
		setConstString(offset + 174, $yield_act_no, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 175, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 175, $can_ac_dt, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 176, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 176, $ver_no, value);
	}


	/**
	 * Do not allow duplicate import 重複取込不可.<p>
	 *
	 */
	public boolean not_dup_imp_flg() {
		return getConstBoolean(offset + 177, $not_dup_imp_flg);
	}

	/**
	 * Do not allow duplicate import 重複取込不可.<p>
	 *
	 */
	public void not_dup_imp_flg(boolean value) {
		setConstBoolean(offset + 177, $not_dup_imp_flg, value);
	}


	/**
	 * IF auto-create (Input) ＩＦ自動作成（投入）.<p>
	 *
	 */
	public boolean if_auto_reg_flg() {
		return getConstBoolean(offset + 178, $if_auto_reg_flg);
	}

	/**
	 * IF auto-create (Input) ＩＦ自動作成（投入）.<p>
	 *
	 */
	public void if_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 178, $if_auto_reg_flg, value);
	}


	/**
	 * IF control skip row ＩＦ制御スキップ行.<p>
	 *
	 */
	public boolean skip_by_if_ctl_flg() {
		return getConstBoolean(offset + 179, $skip_by_if_ctl_flg);
	}

	/**
	 * IF control skip row ＩＦ制御スキップ行.<p>
	 *
	 */
	public void skip_by_if_ctl_flg(boolean value) {
		setConstBoolean(offset + 179, $skip_by_if_ctl_flg, value);
	}


	/**
	 * Added row for check チェック追加行.<p>
	 *
	 */
	public boolean chk_add_flg() {
		return getConstBoolean(offset + 180, $chk_add_flg);
	}

	/**
	 * Added row for check チェック追加行.<p>
	 *
	 */
	public void chk_add_flg(boolean value) {
		setConstBoolean(offset + 180, $chk_add_flg, value);
	}


	/**
	 * Operation cancellation skip] row 工程取消スキップ行.<p>
	 *
	 */
	public boolean skip_by_oper_del_flg() {
		return getConstBoolean(offset + 181, $skip_by_oper_del_flg);
	}

	/**
	 * Operation cancellation skip] row 工程取消スキップ行.<p>
	 *
	 */
	public void skip_by_oper_del_flg(boolean value) {
		setConstBoolean(offset + 181, $skip_by_oper_del_flg, value);
	}


	/**
	 * Receive SEIBAN No. 手配ＮＯ受信.<p>
	 *
	 */
	public boolean sno_recv_flg() {
		return getConstBoolean(offset + 182, $sno_recv_flg);
	}

	/**
	 * Receive SEIBAN No. 手配ＮＯ受信.<p>
	 *
	 */
	public void sno_recv_flg(boolean value) {
		setConstBoolean(offset + 182, $sno_recv_flg, value);
	}


	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public boolean unschd_act_flg() {
		return getConstBoolean(offset + 183, $unschd_act_flg);
	}

	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public void unschd_act_flg(boolean value) {
		setConstBoolean(offset + 183, $unschd_act_flg, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 184, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 184, $bom_ptn, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 185, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 185, $oper_ptn, value);
	}


	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 186, $mfg_str_ln_cd);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 186, $mfg_str_ln_cd, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 187, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 187, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 187, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 187, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 187, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 187, $peg_no, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 188, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 188, $wg_cd, value);
	}


	public String getString(String name) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			return exe_sts_typ();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			return ext_oper_act_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			return act_rpt_rmrks();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_rpt_rmrks();
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			return act_trd_rmrks();
		}
		if ($wk_intr_rmrks.equalsIgnoreCase(name)) {
			return wk_intr_rmrks();
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_intr_rmrks();
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_rpt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			return yield_act_intr_rmrks();
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_act_rpt_rmrks();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			return ext_inpt_act_no();
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			return ext_wk_act_no();
		}
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			return ext_yield_act_no();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($if_inpt_typ.equalsIgnoreCase(name)) {
			return if_inpt_typ();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			return loss_rsn_cd();
		}
		if ($old_loss_rsn_cd.equalsIgnoreCase(name)) {
			return old_loss_rsn_cd();
		}
		if ($acxfr_rsn_cd.equalsIgnoreCase(name)) {
			return acxfr_rsn_cd();
		}
		if ($acxfr_bd_dpt_cd.equalsIgnoreCase(name)) {
			return acxfr_bd_dpt_cd();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($wk_usr_dpt_cd.equalsIgnoreCase(name)) {
			return wk_usr_dpt_cd();
		}
		if ($wk_usr_cd.equalsIgnoreCase(name)) {
			return wk_usr_cd();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($fclty.equalsIgnoreCase(name)) {
			return fclty();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			return yield_rsn_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($mfg_act_usr_cd.equalsIgnoreCase(name)) {
			return mfg_act_usr_cd();
		}
		if ($mfg_act_dpt_cd.equalsIgnoreCase(name)) {
			return mfg_act_dpt_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_itm_cd.equalsIgnoreCase(name)) {
			return mfg_itm_cd();
		}
		if ($mfg_itm_sub1.equalsIgnoreCase(name)) {
			return mfg_itm_sub1();
		}
		if ($mfg_itm_sub2.equalsIgnoreCase(name)) {
			return mfg_itm_sub2();
		}
		if ($mfg_itm_sub3.equalsIgnoreCase(name)) {
			return mfg_itm_sub3();
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($mfg_loc_cd_lasted.equalsIgnoreCase(name)) {
			return mfg_loc_cd_lasted();
		}
		if ($site_cd_lasted.equalsIgnoreCase(name)) {
			return site_cd_lasted();
		}
		if ($wg_cd_lasted.equalsIgnoreCase(name)) {
			return wg_cd_lasted();
		}
		if ($mfg_mtd_typ_lasted.equalsIgnoreCase(name)) {
			return mfg_mtd_typ_lasted();
		}
		if ($mfg_str_ln_cd_lasted.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd_lasted();
		}
		if ($mfg_itm_cd_lasted.equalsIgnoreCase(name)) {
			return mfg_itm_cd_lasted();
		}
		if ($mfg_itm_sub1_lasted.equalsIgnoreCase(name)) {
			return mfg_itm_sub1_lasted();
		}
		if ($mfg_itm_sub2_lasted.equalsIgnoreCase(name)) {
			return mfg_itm_sub2_lasted();
		}
		if ($mfg_itm_sub3_lasted.equalsIgnoreCase(name)) {
			return mfg_itm_sub3_lasted();
		}
		if ($mfg_strg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_strg_loc_cd();
		}
		if ($mfg_strg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_strg_str_ln_cd();
		}
		if ($mfg_inst_no_lasted.equalsIgnoreCase(name)) {
			return mfg_inst_no_lasted();
		}
		if ($oper_cd_lasted.equalsIgnoreCase(name)) {
			return oper_cd_lasted();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			return loss_act_no();
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			return wk_act_no();
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			return yield_act_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			return ext_data_no();
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			return ext_data_lno();
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			return oper_unit_qty();
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			return oper_yield();
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			return acxfr_qty();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			return brk_pd();
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			return wk_cost();
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			return yield_rate();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			return itm_yield();
		}
		if ($ext_oper_act_cnt.equalsIgnoreCase(name)) {
			return ext_oper_act_cnt();
		}
		if ($ext_act_cnt.equalsIgnoreCase(name)) {
			return ext_act_cnt();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($mfg_inst_rev_lasted.equalsIgnoreCase(name)) {
			return mfg_inst_rev_lasted();
		}
		if ($oper_seq_lasted.equalsIgnoreCase(name)) {
			return oper_seq_lasted();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			return recv_dt();
		}
		if ($st_act_tm.equalsIgnoreCase(name)) {
			return st_act_tm();
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			return end_act_tm();
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			return act_tm();
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			return st_hm();
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			return end_hm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			return not_cmpl_flg();
		}
		if ($bkf_ctl_flg.equalsIgnoreCase(name)) {
			return bkf_ctl_flg();
		}
		if ($wk_cost_calc_ctl_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_ctl_flg();
		}
		if ($not_pd_chk_flg.equalsIgnoreCase(name)) {
			return not_pd_chk_flg();
		}
		if ($wk_cost_calc_upd_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_upd_flg();
		}
		if ($all_oper_act_reg_flg.equalsIgnoreCase(name)) {
			return all_oper_act_reg_flg();
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($not_dup_imp_flg.equalsIgnoreCase(name)) {
			return not_dup_imp_flg();
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			return if_auto_reg_flg();
		}
		if ($skip_by_if_ctl_flg.equalsIgnoreCase(name)) {
			return skip_by_if_ctl_flg();
		}
		if ($chk_add_flg.equalsIgnoreCase(name)) {
			return chk_add_flg();
		}
		if ($skip_by_oper_del_flg.equalsIgnoreCase(name)) {
			return skip_by_oper_del_flg();
		}
		if ($sno_recv_flg.equalsIgnoreCase(name)) {
			return sno_recv_flg();
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			return unschd_act_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			return exe_sts_typ();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			return ext_oper_act_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			return act_rpt_rmrks();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_rpt_rmrks();
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			return act_trd_rmrks();
		}
		if ($wk_intr_rmrks.equalsIgnoreCase(name)) {
			return wk_intr_rmrks();
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_intr_rmrks();
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_rpt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			return yield_act_intr_rmrks();
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_act_rpt_rmrks();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			return ext_inpt_act_no();
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			return ext_wk_act_no();
		}
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			return ext_yield_act_no();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($if_inpt_typ.equalsIgnoreCase(name)) {
			return if_inpt_typ();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			return loss_rsn_cd();
		}
		if ($old_loss_rsn_cd.equalsIgnoreCase(name)) {
			return old_loss_rsn_cd();
		}
		if ($acxfr_rsn_cd.equalsIgnoreCase(name)) {
			return acxfr_rsn_cd();
		}
		if ($acxfr_bd_dpt_cd.equalsIgnoreCase(name)) {
			return acxfr_bd_dpt_cd();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($wk_usr_dpt_cd.equalsIgnoreCase(name)) {
			return wk_usr_dpt_cd();
		}
		if ($wk_usr_cd.equalsIgnoreCase(name)) {
			return wk_usr_cd();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($fclty.equalsIgnoreCase(name)) {
			return fclty();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			return yield_rsn_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($mfg_act_usr_cd.equalsIgnoreCase(name)) {
			return mfg_act_usr_cd();
		}
		if ($mfg_act_dpt_cd.equalsIgnoreCase(name)) {
			return mfg_act_dpt_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_itm_cd.equalsIgnoreCase(name)) {
			return mfg_itm_cd();
		}
		if ($mfg_itm_sub1.equalsIgnoreCase(name)) {
			return mfg_itm_sub1();
		}
		if ($mfg_itm_sub2.equalsIgnoreCase(name)) {
			return mfg_itm_sub2();
		}
		if ($mfg_itm_sub3.equalsIgnoreCase(name)) {
			return mfg_itm_sub3();
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($mfg_loc_cd_lasted.equalsIgnoreCase(name)) {
			return mfg_loc_cd_lasted();
		}
		if ($site_cd_lasted.equalsIgnoreCase(name)) {
			return site_cd_lasted();
		}
		if ($wg_cd_lasted.equalsIgnoreCase(name)) {
			return wg_cd_lasted();
		}
		if ($mfg_mtd_typ_lasted.equalsIgnoreCase(name)) {
			return mfg_mtd_typ_lasted();
		}
		if ($mfg_str_ln_cd_lasted.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd_lasted();
		}
		if ($mfg_itm_cd_lasted.equalsIgnoreCase(name)) {
			return mfg_itm_cd_lasted();
		}
		if ($mfg_itm_sub1_lasted.equalsIgnoreCase(name)) {
			return mfg_itm_sub1_lasted();
		}
		if ($mfg_itm_sub2_lasted.equalsIgnoreCase(name)) {
			return mfg_itm_sub2_lasted();
		}
		if ($mfg_itm_sub3_lasted.equalsIgnoreCase(name)) {
			return mfg_itm_sub3_lasted();
		}
		if ($mfg_strg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_strg_loc_cd();
		}
		if ($mfg_strg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_strg_str_ln_cd();
		}
		if ($mfg_inst_no_lasted.equalsIgnoreCase(name)) {
			return mfg_inst_no_lasted();
		}
		if ($oper_cd_lasted.equalsIgnoreCase(name)) {
			return oper_cd_lasted();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			return loss_act_no();
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			return wk_act_no();
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			return yield_act_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			return ext_data_no();
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			return ext_data_lno();
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			return oper_unit_qty();
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			return oper_yield();
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			return acxfr_qty();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			return brk_pd();
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			return wk_cost();
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			return yield_rate();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			return itm_yield();
		}
		if ($ext_oper_act_cnt.equalsIgnoreCase(name)) {
			return ext_oper_act_cnt();
		}
		if ($ext_act_cnt.equalsIgnoreCase(name)) {
			return ext_act_cnt();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($mfg_inst_rev_lasted.equalsIgnoreCase(name)) {
			return mfg_inst_rev_lasted();
		}
		if ($oper_seq_lasted.equalsIgnoreCase(name)) {
			return oper_seq_lasted();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			return recv_dt();
		}
		if ($st_act_tm.equalsIgnoreCase(name)) {
			return st_act_tm();
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			return end_act_tm();
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			return act_tm();
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			return st_hm();
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			return end_hm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			return not_cmpl_flg();
		}
		if ($bkf_ctl_flg.equalsIgnoreCase(name)) {
			return bkf_ctl_flg();
		}
		if ($wk_cost_calc_ctl_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_ctl_flg();
		}
		if ($not_pd_chk_flg.equalsIgnoreCase(name)) {
			return not_pd_chk_flg();
		}
		if ($wk_cost_calc_upd_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_upd_flg();
		}
		if ($all_oper_act_reg_flg.equalsIgnoreCase(name)) {
			return all_oper_act_reg_flg();
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($not_dup_imp_flg.equalsIgnoreCase(name)) {
			return not_dup_imp_flg();
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			return if_auto_reg_flg();
		}
		if ($skip_by_if_ctl_flg.equalsIgnoreCase(name)) {
			return skip_by_if_ctl_flg();
		}
		if ($chk_add_flg.equalsIgnoreCase(name)) {
			return chk_add_flg();
		}
		if ($skip_by_oper_del_flg.equalsIgnoreCase(name)) {
			return skip_by_oper_del_flg();
		}
		if ($sno_recv_flg.equalsIgnoreCase(name)) {
			return sno_recv_flg();
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			return unschd_act_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			exe_sts_typ(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			ext_oper_act_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			act_rpt_rmrks(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			inpt_act_rpt_rmrks(value);
			return;
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			act_trd_rmrks(value);
			return;
		}
		if ($wk_intr_rmrks.equalsIgnoreCase(name)) {
			wk_intr_rmrks(value);
			return;
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			mfg_act_intr_rmrks(value);
			return;
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_act_rpt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			yield_act_intr_rmrks(value);
			return;
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_act_rpt_rmrks(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			ext_inpt_act_no(value);
			return;
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			ext_wk_act_no(value);
			return;
		}
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			ext_yield_act_no(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($if_inpt_typ.equalsIgnoreCase(name)) {
			if_inpt_typ(value);
			return;
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			loss_rsn_cd(value);
			return;
		}
		if ($old_loss_rsn_cd.equalsIgnoreCase(name)) {
			old_loss_rsn_cd(value);
			return;
		}
		if ($acxfr_rsn_cd.equalsIgnoreCase(name)) {
			acxfr_rsn_cd(value);
			return;
		}
		if ($acxfr_bd_dpt_cd.equalsIgnoreCase(name)) {
			acxfr_bd_dpt_cd(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($wk_usr_dpt_cd.equalsIgnoreCase(name)) {
			wk_usr_dpt_cd(value);
			return;
		}
		if ($wk_usr_cd.equalsIgnoreCase(name)) {
			wk_usr_cd(value);
			return;
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			wk_day_cd(value);
			return;
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($fclty.equalsIgnoreCase(name)) {
			fclty(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
			return;
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			yield_rsn_cd(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($mfg_act_usr_cd.equalsIgnoreCase(name)) {
			mfg_act_usr_cd(value);
			return;
		}
		if ($mfg_act_dpt_cd.equalsIgnoreCase(name)) {
			mfg_act_dpt_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_itm_cd.equalsIgnoreCase(name)) {
			mfg_itm_cd(value);
			return;
		}
		if ($mfg_itm_sub1.equalsIgnoreCase(name)) {
			mfg_itm_sub1(value);
			return;
		}
		if ($mfg_itm_sub2.equalsIgnoreCase(name)) {
			mfg_itm_sub2(value);
			return;
		}
		if ($mfg_itm_sub3.equalsIgnoreCase(name)) {
			mfg_itm_sub3(value);
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($mfg_loc_cd_lasted.equalsIgnoreCase(name)) {
			mfg_loc_cd_lasted(value);
			return;
		}
		if ($site_cd_lasted.equalsIgnoreCase(name)) {
			site_cd_lasted(value);
			return;
		}
		if ($wg_cd_lasted.equalsIgnoreCase(name)) {
			wg_cd_lasted(value);
			return;
		}
		if ($mfg_mtd_typ_lasted.equalsIgnoreCase(name)) {
			mfg_mtd_typ_lasted(value);
			return;
		}
		if ($mfg_str_ln_cd_lasted.equalsIgnoreCase(name)) {
			mfg_str_ln_cd_lasted(value);
			return;
		}
		if ($mfg_itm_cd_lasted.equalsIgnoreCase(name)) {
			mfg_itm_cd_lasted(value);
			return;
		}
		if ($mfg_itm_sub1_lasted.equalsIgnoreCase(name)) {
			mfg_itm_sub1_lasted(value);
			return;
		}
		if ($mfg_itm_sub2_lasted.equalsIgnoreCase(name)) {
			mfg_itm_sub2_lasted(value);
			return;
		}
		if ($mfg_itm_sub3_lasted.equalsIgnoreCase(name)) {
			mfg_itm_sub3_lasted(value);
			return;
		}
		if ($mfg_strg_loc_cd.equalsIgnoreCase(name)) {
			mfg_strg_loc_cd(value);
			return;
		}
		if ($mfg_strg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_strg_str_ln_cd(value);
			return;
		}
		if ($mfg_inst_no_lasted.equalsIgnoreCase(name)) {
			mfg_inst_no_lasted(value);
			return;
		}
		if ($oper_cd_lasted.equalsIgnoreCase(name)) {
			oper_cd_lasted(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			loss_act_no(value);
			return;
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			wk_act_no(value);
			return;
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			yield_act_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($ext_oper_act_cnt.equalsIgnoreCase(name)) {
			ext_oper_act_cnt(value);
			return;
		}
		if ($ext_act_cnt.equalsIgnoreCase(name)) {
			ext_act_cnt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($mfg_inst_rev_lasted.equalsIgnoreCase(name)) {
			mfg_inst_rev_lasted(value);
			return;
		}
		if ($oper_seq_lasted.equalsIgnoreCase(name)) {
			oper_seq_lasted(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($ext_oper_act_cnt.equalsIgnoreCase(name)) {
			ext_oper_act_cnt(value);
			return;
		}
		if ($ext_act_cnt.equalsIgnoreCase(name)) {
			ext_act_cnt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($mfg_inst_rev_lasted.equalsIgnoreCase(name)) {
			mfg_inst_rev_lasted(value);
			return;
		}
		if ($oper_seq_lasted.equalsIgnoreCase(name)) {
			oper_seq_lasted(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($ext_oper_act_cnt.equalsIgnoreCase(name)) {
			ext_oper_act_cnt(value);
			return;
		}
		if ($ext_act_cnt.equalsIgnoreCase(name)) {
			ext_act_cnt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($mfg_inst_rev_lasted.equalsIgnoreCase(name)) {
			mfg_inst_rev_lasted(value);
			return;
		}
		if ($oper_seq_lasted.equalsIgnoreCase(name)) {
			oper_seq_lasted(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($ext_oper_act_cnt.equalsIgnoreCase(name)) {
			ext_oper_act_cnt(value);
			return;
		}
		if ($ext_act_cnt.equalsIgnoreCase(name)) {
			ext_act_cnt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($mfg_inst_rev_lasted.equalsIgnoreCase(name)) {
			mfg_inst_rev_lasted(value);
			return;
		}
		if ($oper_seq_lasted.equalsIgnoreCase(name)) {
			oper_seq_lasted(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($ext_oper_act_cnt.equalsIgnoreCase(name)) {
			ext_oper_act_cnt(value);
			return;
		}
		if ($ext_act_cnt.equalsIgnoreCase(name)) {
			ext_act_cnt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($mfg_inst_rev_lasted.equalsIgnoreCase(name)) {
			mfg_inst_rev_lasted(value);
			return;
		}
		if ($oper_seq_lasted.equalsIgnoreCase(name)) {
			oper_seq_lasted(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			recv_dt(value);
			return;
		}
		if ($st_act_tm.equalsIgnoreCase(name)) {
			st_act_tm(value);
			return;
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			end_act_tm(value);
			return;
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			act_tm(value);
			return;
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			st_hm(value);
			return;
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			end_hm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			not_cmpl_flg(value);
			return;
		}
		if ($bkf_ctl_flg.equalsIgnoreCase(name)) {
			bkf_ctl_flg(value);
			return;
		}
		if ($wk_cost_calc_ctl_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_ctl_flg(value);
			return;
		}
		if ($not_pd_chk_flg.equalsIgnoreCase(name)) {
			not_pd_chk_flg(value);
			return;
		}
		if ($wk_cost_calc_upd_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_upd_flg(value);
			return;
		}
		if ($all_oper_act_reg_flg.equalsIgnoreCase(name)) {
			all_oper_act_reg_flg(value);
			return;
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($not_dup_imp_flg.equalsIgnoreCase(name)) {
			not_dup_imp_flg(value);
			return;
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			if_auto_reg_flg(value);
			return;
		}
		if ($skip_by_if_ctl_flg.equalsIgnoreCase(name)) {
			skip_by_if_ctl_flg(value);
			return;
		}
		if ($chk_add_flg.equalsIgnoreCase(name)) {
			chk_add_flg(value);
			return;
		}
		if ($skip_by_oper_del_flg.equalsIgnoreCase(name)) {
			skip_by_oper_del_flg(value);
			return;
		}
		if ($sno_recv_flg.equalsIgnoreCase(name)) {
			sno_recv_flg(value);
			return;
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			unschd_act_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			exe_sts_typ(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			ext_oper_act_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			act_rpt_rmrks(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			inpt_act_rpt_rmrks(value);
			return;
		}
		if ($act_trd_rmrks.equalsIgnoreCase(name)) {
			act_trd_rmrks(value);
			return;
		}
		if ($wk_intr_rmrks.equalsIgnoreCase(name)) {
			wk_intr_rmrks(value);
			return;
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			mfg_act_intr_rmrks(value);
			return;
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_act_rpt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			yield_act_intr_rmrks(value);
			return;
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_act_rpt_rmrks(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			ext_inpt_act_no(value);
			return;
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			ext_wk_act_no(value);
			return;
		}
		if ($ext_yield_act_no.equalsIgnoreCase(name)) {
			ext_yield_act_no(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($if_inpt_typ.equalsIgnoreCase(name)) {
			if_inpt_typ(value);
			return;
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			loss_rsn_cd(value);
			return;
		}
		if ($old_loss_rsn_cd.equalsIgnoreCase(name)) {
			old_loss_rsn_cd(value);
			return;
		}
		if ($acxfr_rsn_cd.equalsIgnoreCase(name)) {
			acxfr_rsn_cd(value);
			return;
		}
		if ($acxfr_bd_dpt_cd.equalsIgnoreCase(name)) {
			acxfr_bd_dpt_cd(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($wk_usr_dpt_cd.equalsIgnoreCase(name)) {
			wk_usr_dpt_cd(value);
			return;
		}
		if ($wk_usr_cd.equalsIgnoreCase(name)) {
			wk_usr_cd(value);
			return;
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			wk_day_cd(value);
			return;
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($fclty.equalsIgnoreCase(name)) {
			fclty(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
			return;
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			yield_rsn_cd(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($mfg_act_usr_cd.equalsIgnoreCase(name)) {
			mfg_act_usr_cd(value);
			return;
		}
		if ($mfg_act_dpt_cd.equalsIgnoreCase(name)) {
			mfg_act_dpt_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_itm_cd.equalsIgnoreCase(name)) {
			mfg_itm_cd(value);
			return;
		}
		if ($mfg_itm_sub1.equalsIgnoreCase(name)) {
			mfg_itm_sub1(value);
			return;
		}
		if ($mfg_itm_sub2.equalsIgnoreCase(name)) {
			mfg_itm_sub2(value);
			return;
		}
		if ($mfg_itm_sub3.equalsIgnoreCase(name)) {
			mfg_itm_sub3(value);
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($mfg_loc_cd_lasted.equalsIgnoreCase(name)) {
			mfg_loc_cd_lasted(value);
			return;
		}
		if ($site_cd_lasted.equalsIgnoreCase(name)) {
			site_cd_lasted(value);
			return;
		}
		if ($wg_cd_lasted.equalsIgnoreCase(name)) {
			wg_cd_lasted(value);
			return;
		}
		if ($mfg_mtd_typ_lasted.equalsIgnoreCase(name)) {
			mfg_mtd_typ_lasted(value);
			return;
		}
		if ($mfg_str_ln_cd_lasted.equalsIgnoreCase(name)) {
			mfg_str_ln_cd_lasted(value);
			return;
		}
		if ($mfg_itm_cd_lasted.equalsIgnoreCase(name)) {
			mfg_itm_cd_lasted(value);
			return;
		}
		if ($mfg_itm_sub1_lasted.equalsIgnoreCase(name)) {
			mfg_itm_sub1_lasted(value);
			return;
		}
		if ($mfg_itm_sub2_lasted.equalsIgnoreCase(name)) {
			mfg_itm_sub2_lasted(value);
			return;
		}
		if ($mfg_itm_sub3_lasted.equalsIgnoreCase(name)) {
			mfg_itm_sub3_lasted(value);
			return;
		}
		if ($mfg_strg_loc_cd.equalsIgnoreCase(name)) {
			mfg_strg_loc_cd(value);
			return;
		}
		if ($mfg_strg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_strg_str_ln_cd(value);
			return;
		}
		if ($mfg_inst_no_lasted.equalsIgnoreCase(name)) {
			mfg_inst_no_lasted(value);
			return;
		}
		if ($oper_cd_lasted.equalsIgnoreCase(name)) {
			oper_cd_lasted(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			loss_act_no(value);
			return;
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			wk_act_no(value);
			return;
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			yield_act_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($ext_oper_act_cnt.equalsIgnoreCase(name)) {
			ext_oper_act_cnt(value);
			return;
		}
		if ($ext_act_cnt.equalsIgnoreCase(name)) {
			ext_act_cnt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($mfg_inst_rev_lasted.equalsIgnoreCase(name)) {
			mfg_inst_rev_lasted(value);
			return;
		}
		if ($oper_seq_lasted.equalsIgnoreCase(name)) {
			oper_seq_lasted(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($ext_oper_act_cnt.equalsIgnoreCase(name)) {
			ext_oper_act_cnt(value);
			return;
		}
		if ($ext_act_cnt.equalsIgnoreCase(name)) {
			ext_act_cnt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($mfg_inst_rev_lasted.equalsIgnoreCase(name)) {
			mfg_inst_rev_lasted(value);
			return;
		}
		if ($oper_seq_lasted.equalsIgnoreCase(name)) {
			oper_seq_lasted(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($ext_oper_act_cnt.equalsIgnoreCase(name)) {
			ext_oper_act_cnt(value);
			return;
		}
		if ($ext_act_cnt.equalsIgnoreCase(name)) {
			ext_act_cnt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($mfg_inst_rev_lasted.equalsIgnoreCase(name)) {
			mfg_inst_rev_lasted(value);
			return;
		}
		if ($oper_seq_lasted.equalsIgnoreCase(name)) {
			oper_seq_lasted(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($ext_oper_act_cnt.equalsIgnoreCase(name)) {
			ext_oper_act_cnt(value);
			return;
		}
		if ($ext_act_cnt.equalsIgnoreCase(name)) {
			ext_act_cnt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($mfg_inst_rev_lasted.equalsIgnoreCase(name)) {
			mfg_inst_rev_lasted(value);
			return;
		}
		if ($oper_seq_lasted.equalsIgnoreCase(name)) {
			oper_seq_lasted(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_unit_qty.equalsIgnoreCase(name)) {
			oper_unit_qty(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($acxfr_qty.equalsIgnoreCase(name)) {
			acxfr_qty(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($ext_oper_act_cnt.equalsIgnoreCase(name)) {
			ext_oper_act_cnt(value);
			return;
		}
		if ($ext_act_cnt.equalsIgnoreCase(name)) {
			ext_act_cnt(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($mfg_inst_rev_lasted.equalsIgnoreCase(name)) {
			mfg_inst_rev_lasted(value);
			return;
		}
		if ($oper_seq_lasted.equalsIgnoreCase(name)) {
			oper_seq_lasted(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			recv_dt(value);
			return;
		}
		if ($st_act_tm.equalsIgnoreCase(name)) {
			st_act_tm(value);
			return;
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			end_act_tm(value);
			return;
		}
		if ($act_tm.equalsIgnoreCase(name)) {
			act_tm(value);
			return;
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			st_hm(value);
			return;
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			end_hm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			not_cmpl_flg(value);
			return;
		}
		if ($bkf_ctl_flg.equalsIgnoreCase(name)) {
			bkf_ctl_flg(value);
			return;
		}
		if ($wk_cost_calc_ctl_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_ctl_flg(value);
			return;
		}
		if ($not_pd_chk_flg.equalsIgnoreCase(name)) {
			not_pd_chk_flg(value);
			return;
		}
		if ($wk_cost_calc_upd_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_upd_flg(value);
			return;
		}
		if ($all_oper_act_reg_flg.equalsIgnoreCase(name)) {
			all_oper_act_reg_flg(value);
			return;
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($not_dup_imp_flg.equalsIgnoreCase(name)) {
			not_dup_imp_flg(value);
			return;
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			if_auto_reg_flg(value);
			return;
		}
		if ($skip_by_if_ctl_flg.equalsIgnoreCase(name)) {
			skip_by_if_ctl_flg(value);
			return;
		}
		if ($chk_add_flg.equalsIgnoreCase(name)) {
			chk_add_flg(value);
			return;
		}
		if ($skip_by_oper_del_flg.equalsIgnoreCase(name)) {
			skip_by_oper_del_flg(value);
			return;
		}
		if ($sno_recv_flg.equalsIgnoreCase(name)) {
			sno_recv_flg(value);
			return;
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			unschd_act_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

