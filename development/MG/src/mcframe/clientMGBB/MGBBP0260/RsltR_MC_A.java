package mcframe.clientMGBB.MGBBP0260;

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
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Result ID 実績ＩＤ.<p>
	 *
	 */
	public static final String $act_id = "act_id";
	/**
	 * Result ID branch No. 実績ＩＤ枝番.<p>
	 *
	 */
	public static final String $act_id_sub = "act_id_sub";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
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
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	public static final String $par_itm_p = "par_itm_p";
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
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_jnl_cd = "par_itm_jnl_cd";
	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public static final String $par_itm_jnl_nm = "par_itm_jnl_nm";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Input dept. cd. 投入部門ＣＤ.<p>
	 *
	 */
	public static final String $inpt_dpt_cd = "inpt_dpt_cd";
	/**
	 * Input dept. name 投入部門名.<p>
	 *
	 */
	public static final String $inpt_dpt_nm = "inpt_dpt_nm";
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
	public static final String $itm_p = "itm_p";
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
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
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
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
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
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Line name ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Without line ライン無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * Cost GR/GI type 原価入出庫区分.<p>
	 *
	 */
	public static final String $cost_io_typ = "cost_io_typ";
	/**
	 * Cost GR/GI type name 原価入出庫区分名.<p>
	 *
	 */
	public static final String $cost_io_typ_nm = "cost_io_typ_nm";
	/**
	 * Counterpart WG cd. 相手ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $other_wg_cd = "other_wg_cd";
	/**
	 * Counterpart WG name 相手ワーキンググループ名.<p>
	 *
	 */
	public static final String $other_wg_nm = "other_wg_nm";
	/**
	 * Counterpart dept. cd. 相手部門ＣＤ.<p>
	 *
	 */
	public static final String $other_dpt_cd = "other_dpt_cd";
	/**
	 * Counterpart dept. name 相手部門名.<p>
	 *
	 */
	public static final String $other_dpt_nm = "other_dpt_nm";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
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
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $sls_trd_cur_cd = "sls_trd_cur_cd";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $sls_trd_cur_nm = "sls_trd_cur_nm";
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $sls_trd_amt_dec_place = "sls_trd_amt_dec_place";
	public static final String $trd_amt_p = "trd_amt_p";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	public static final String $amt_p = "amt_p";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public static final String $sls_dpt_nm = "sls_dpt_nm";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $sls_usr_nm = "sls_usr_nm";
	/**
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	/**
	 * Transfer group 振替グループ.<p>
	 *
	 */
	public static final String $trd_grp = "trd_grp";
	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public static final String $trd_ratio = "trd_ratio";
	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public static final String $alc_dpt_cd = "alc_dpt_cd";
	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public static final String $alc_dpt_nm = "alc_dpt_nm";
	/**
	 * Sales classification cd. 1 売上分類ＣＤ１.<p>
	 *
	 */
	public static final String $cost_sls_cd1 = "cost_sls_cd1";
	/**
	 * Sales classification name 1 売上分類名１.<p>
	 *
	 */
	public static final String $cost_sls_nm1 = "cost_sls_nm1";
	/**
	 * Sales classification cd. 2 売上分類ＣＤ２.<p>
	 *
	 */
	public static final String $cost_sls_cd2 = "cost_sls_cd2";
	/**
	 * Sales classification name 2 売上分類名２.<p>
	 *
	 */
	public static final String $cost_sls_nm2 = "cost_sls_nm2";
	/**
	 * Sales classification cd. 3 売上分類ＣＤ３.<p>
	 *
	 */
	public static final String $cost_sls_cd3 = "cost_sls_cd3";
	/**
	 * Sales classification name 3 売上分類名３.<p>
	 *
	 */
	public static final String $cost_sls_nm3 = "cost_sls_nm3";
	/**
	 * Sales classification cd. 4 売上分類ＣＤ４.<p>
	 *
	 */
	public static final String $cost_sls_cd4 = "cost_sls_cd4";
	/**
	 * Sales classification name 4 売上分類名４.<p>
	 *
	 */
	public static final String $cost_sls_nm4 = "cost_sls_nm4";
	/**
	 * Sales classification cd. 5 売上分類ＣＤ５.<p>
	 *
	 */
	public static final String $cost_sls_cd5 = "cost_sls_cd5";
	/**
	 * Sales classification name 5 売上分類名５.<p>
	 *
	 */
	public static final String $cost_sls_nm5 = "cost_sls_nm5";
	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public static final String $alc_val1 = "alc_val1";
	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public static final String $alc_val2 = "alc_val2";
	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public static final String $alc_val3 = "alc_val3";
	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public static final String $alc_val4 = "alc_val4";
	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public static final String $alc_val5 = "alc_val5";
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public static final String $ac_slip_typ_nm = "ac_slip_typ_nm";
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
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public static final String $rec_eval_typ = "rec_eval_typ";
	/**
	 * Individual evaluation type name 個別評価区分名.<p>
	 *
	 */
	public static final String $rec_eval_typ_nm = "rec_eval_typ_nm";
	/**
	 * Individual evaluation loop 個別評価ループ.<p>
	 *
	 */
	public static final String $eval_loop_flg = "eval_loop_flg";
	public static final String $qty_p = "qty_p";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri = "upri";
	/**
	 * Total 合計.<p>
	 *
	 */
	public static final String $ttl = "ttl";
	public static final String $col_000 = "col_000";
	public static final String $col_001 = "col_001";
	public static final String $col_002 = "col_002";
	public static final String $col_003 = "col_003";
	public static final String $col_004 = "col_004";
	public static final String $col_005 = "col_005";
	public static final String $col_006 = "col_006";
	public static final String $col_007 = "col_007";
	public static final String $col_008 = "col_008";
	public static final String $col_009 = "col_009";
	public static final String $col_010 = "col_010";
	public static final String $col_011 = "col_011";
	public static final String $col_012 = "col_012";
	public static final String $col_013 = "col_013";
	public static final String $col_014 = "col_014";
	public static final String $col_015 = "col_015";
	public static final String $col_016 = "col_016";
	public static final String $col_017 = "col_017";
	public static final String $col_018 = "col_018";
	public static final String $col_019 = "col_019";
	public static final String $col_020 = "col_020";
	public static final String $col_021 = "col_021";
	public static final String $col_022 = "col_022";
	public static final String $col_023 = "col_023";
	public static final String $col_024 = "col_024";
	public static final String $col_025 = "col_025";
	public static final String $col_026 = "col_026";
	public static final String $col_027 = "col_027";
	public static final String $col_028 = "col_028";
	public static final String $col_029 = "col_029";
	public static final String $col_030 = "col_030";
	public static final String $col_031 = "col_031";
	public static final String $col_032 = "col_032";
	public static final String $col_033 = "col_033";
	public static final String $col_034 = "col_034";
	public static final String $col_035 = "col_035";
	public static final String $col_036 = "col_036";
	public static final String $col_037 = "col_037";
	public static final String $col_038 = "col_038";
	public static final String $col_039 = "col_039";
	public static final String $col_040 = "col_040";
	public static final String $col_041 = "col_041";
	public static final String $col_042 = "col_042";
	public static final String $col_043 = "col_043";
	public static final String $col_044 = "col_044";
	public static final String $col_045 = "col_045";
	public static final String $col_046 = "col_046";
	public static final String $col_047 = "col_047";
	public static final String $col_048 = "col_048";
	public static final String $col_049 = "col_049";
	public static final String $col_050 = "col_050";
	public static final String $col_051 = "col_051";
	public static final String $col_052 = "col_052";
	public static final String $col_053 = "col_053";
	public static final String $col_054 = "col_054";
	public static final String $col_055 = "col_055";
	public static final String $col_056 = "col_056";
	public static final String $col_057 = "col_057";
	public static final String $col_058 = "col_058";
	public static final String $col_059 = "col_059";
	public static final String $col_060 = "col_060";
	public static final String $col_061 = "col_061";
	public static final String $col_062 = "col_062";
	public static final String $col_063 = "col_063";
	public static final String $col_064 = "col_064";
	public static final String $col_065 = "col_065";
	public static final String $col_066 = "col_066";
	public static final String $col_067 = "col_067";
	public static final String $col_068 = "col_068";
	public static final String $col_069 = "col_069";
	public static final String $col_070 = "col_070";
	public static final String $col_071 = "col_071";
	public static final String $col_072 = "col_072";
	public static final String $col_073 = "col_073";
	public static final String $col_074 = "col_074";
	public static final String $col_075 = "col_075";
	public static final String $col_076 = "col_076";
	public static final String $col_077 = "col_077";
	public static final String $col_078 = "col_078";
	public static final String $col_079 = "col_079";
	public static final String $col_080 = "col_080";
	public static final String $col_081 = "col_081";
	public static final String $col_082 = "col_082";
	public static final String $col_083 = "col_083";
	public static final String $col_084 = "col_084";
	public static final String $col_085 = "col_085";
	public static final String $col_086 = "col_086";
	public static final String $col_087 = "col_087";
	public static final String $col_088 = "col_088";
	public static final String $col_089 = "col_089";
	public static final String $col_090 = "col_090";
	public static final String $col_091 = "col_091";
	public static final String $col_092 = "col_092";
	public static final String $col_093 = "col_093";
	public static final String $col_094 = "col_094";
	public static final String $col_095 = "col_095";
	public static final String $col_096 = "col_096";
	public static final String $col_097 = "col_097";
	public static final String $col_098 = "col_098";
	public static final String $col_099 = "col_099";
	public static final String $rts_msg_p = "rts_msg_p";

	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_itm_nm = $par_itm_p + ".itm_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $sls_trd_cur_amt = $trd_amt_p + ".amt";
	public static final String $sls_amt = $amt_p + ".amt";
	public static final String $qty = $qty_p + ".qty";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_id_META = createCommonMeta($act_id, mcframe.commonMG.meta.MG_META.ACT_ID);
	public static final MCMeta act_id_sub_META = createCommonMeta($act_id_sub, mcframe.commonMG.meta.MG_META.ACT_ID_SUB);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta par_itm_typ_META = createCommonMeta($par_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta par_itm_typ_nm_META = createCommonMeta($par_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta par_itm_typ_d_cd_META = createCommonMeta($par_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta par_itm_typ_d_nm_META = createCommonMeta($par_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta par_itm_jnl_cd_META = createCommonMeta($par_itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta par_itm_jnl_nm_META = createCommonMeta($par_itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta inpt_dpt_cd_META = createCommonMeta($inpt_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta inpt_dpt_nm_META = createCommonMeta($inpt_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta cost_io_typ_META = createCommonMeta($cost_io_typ, mcframe.commonMA.meta.MA_META.COST_IO_TYP);
	public static final MCMeta cost_io_typ_nm_META = createCommonMeta($cost_io_typ_nm, mcframe.commonMA.meta.MA_META.COST_IO_TYP_NM);
	public static final MCMeta other_wg_cd_META = createCommonMeta($other_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta other_wg_nm_META = createCommonMeta($other_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta other_dpt_cd_META = createCommonMeta($other_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta other_dpt_nm_META = createCommonMeta($other_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta sls_trd_cur_cd_META = createCommonMeta($sls_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta sls_trd_cur_nm_META = createCommonMeta($sls_trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta sls_trd_amt_dec_place_META = createCommonMeta($sls_trd_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_amt_p_META = createInnerRowMeta($trd_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt_p_META = createInnerRowMeta($amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_usr_nm_META = createCommonMeta($sls_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta trd_grp_META = createCommonMeta($trd_grp, mcframe.commonMA.meta.MA_META.TRD_GRP);
	public static final MCMeta trd_ratio_META = createCommonMeta($trd_ratio, mcframe.commonMG.meta.MG_META.TRD_RATIO);
	public static final MCMeta alc_dpt_cd_META = createCommonMeta($alc_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta alc_dpt_nm_META = createCommonMeta($alc_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta cost_sls_cd1_META = createCommonMeta($cost_sls_cd1, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta cost_sls_nm1_META = createCommonMeta($cost_sls_nm1, mcframe.commonMA.meta.MA_META.COST_SLS_NM);
	public static final MCMeta cost_sls_cd2_META = createCommonMeta($cost_sls_cd2, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta cost_sls_nm2_META = createCommonMeta($cost_sls_nm2, mcframe.commonMA.meta.MA_META.COST_SLS_NM);
	public static final MCMeta cost_sls_cd3_META = createCommonMeta($cost_sls_cd3, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta cost_sls_nm3_META = createCommonMeta($cost_sls_nm3, mcframe.commonMA.meta.MA_META.COST_SLS_NM);
	public static final MCMeta cost_sls_cd4_META = createCommonMeta($cost_sls_cd4, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta cost_sls_nm4_META = createCommonMeta($cost_sls_nm4, mcframe.commonMA.meta.MA_META.COST_SLS_NM);
	public static final MCMeta cost_sls_cd5_META = createCommonMeta($cost_sls_cd5, mcframe.commonMA.meta.MA_META.COST_SLS_CD);
	public static final MCMeta cost_sls_nm5_META = createCommonMeta($cost_sls_nm5, mcframe.commonMA.meta.MA_META.COST_SLS_NM);
	public static final MCMeta alc_val1_META = createCommonMeta($alc_val1, mcframe.commonMA.meta.MA_META.ALC_VAL1);
	public static final MCMeta alc_val2_META = createCommonMeta($alc_val2, mcframe.commonMA.meta.MA_META.ALC_VAL2);
	public static final MCMeta alc_val3_META = createCommonMeta($alc_val3, mcframe.commonMA.meta.MA_META.ALC_VAL3);
	public static final MCMeta alc_val4_META = createCommonMeta($alc_val4, mcframe.commonMA.meta.MA_META.ALC_VAL4);
	public static final MCMeta alc_val5_META = createCommonMeta($alc_val5, mcframe.commonMA.meta.MA_META.ALC_VAL5);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_slip_typ_nm_META = createCommonMeta($ac_slip_typ_nm, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP_NM);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta rec_eval_typ_META = createCommonMeta($rec_eval_typ, mcframe.commonMG.meta.MG_META.REC_EVAL_TYP);
	public static final MCMeta rec_eval_typ_nm_META = createCommonMeta($rec_eval_typ_nm, mcframe.commonMG.meta.MG_META.REC_EVAL_TYP_NM);
	public static final MCMeta eval_loop_flg_META = createCommonMeta($eval_loop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qty_p_META = createInnerRowMeta($qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri_META = createCommonMeta($upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_META = createCommonMeta($ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_000_META = createCommonMeta($col_000, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_001_META = createCommonMeta($col_001, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_002_META = createCommonMeta($col_002, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_003_META = createCommonMeta($col_003, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_004_META = createCommonMeta($col_004, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_005_META = createCommonMeta($col_005, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_006_META = createCommonMeta($col_006, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_007_META = createCommonMeta($col_007, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_008_META = createCommonMeta($col_008, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_009_META = createCommonMeta($col_009, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_010_META = createCommonMeta($col_010, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_011_META = createCommonMeta($col_011, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_012_META = createCommonMeta($col_012, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_013_META = createCommonMeta($col_013, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_014_META = createCommonMeta($col_014, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_015_META = createCommonMeta($col_015, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_016_META = createCommonMeta($col_016, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_017_META = createCommonMeta($col_017, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_018_META = createCommonMeta($col_018, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_019_META = createCommonMeta($col_019, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_020_META = createCommonMeta($col_020, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_021_META = createCommonMeta($col_021, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_022_META = createCommonMeta($col_022, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_023_META = createCommonMeta($col_023, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_024_META = createCommonMeta($col_024, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_025_META = createCommonMeta($col_025, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_026_META = createCommonMeta($col_026, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_027_META = createCommonMeta($col_027, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_028_META = createCommonMeta($col_028, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_029_META = createCommonMeta($col_029, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_030_META = createCommonMeta($col_030, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_031_META = createCommonMeta($col_031, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_032_META = createCommonMeta($col_032, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_033_META = createCommonMeta($col_033, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_034_META = createCommonMeta($col_034, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_035_META = createCommonMeta($col_035, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_036_META = createCommonMeta($col_036, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_037_META = createCommonMeta($col_037, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_038_META = createCommonMeta($col_038, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_039_META = createCommonMeta($col_039, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_040_META = createCommonMeta($col_040, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_041_META = createCommonMeta($col_041, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_042_META = createCommonMeta($col_042, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_043_META = createCommonMeta($col_043, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_044_META = createCommonMeta($col_044, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_045_META = createCommonMeta($col_045, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_046_META = createCommonMeta($col_046, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_047_META = createCommonMeta($col_047, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_048_META = createCommonMeta($col_048, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_049_META = createCommonMeta($col_049, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_050_META = createCommonMeta($col_050, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_051_META = createCommonMeta($col_051, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_052_META = createCommonMeta($col_052, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_053_META = createCommonMeta($col_053, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_054_META = createCommonMeta($col_054, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_055_META = createCommonMeta($col_055, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_056_META = createCommonMeta($col_056, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_057_META = createCommonMeta($col_057, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_058_META = createCommonMeta($col_058, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_059_META = createCommonMeta($col_059, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_060_META = createCommonMeta($col_060, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_061_META = createCommonMeta($col_061, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_062_META = createCommonMeta($col_062, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_063_META = createCommonMeta($col_063, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_064_META = createCommonMeta($col_064, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_065_META = createCommonMeta($col_065, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_066_META = createCommonMeta($col_066, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_067_META = createCommonMeta($col_067, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_068_META = createCommonMeta($col_068, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_069_META = createCommonMeta($col_069, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_070_META = createCommonMeta($col_070, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_071_META = createCommonMeta($col_071, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_072_META = createCommonMeta($col_072, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_073_META = createCommonMeta($col_073, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_074_META = createCommonMeta($col_074, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_075_META = createCommonMeta($col_075, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_076_META = createCommonMeta($col_076, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_077_META = createCommonMeta($col_077, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_078_META = createCommonMeta($col_078, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_079_META = createCommonMeta($col_079, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_080_META = createCommonMeta($col_080, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_081_META = createCommonMeta($col_081, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_082_META = createCommonMeta($col_082, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_083_META = createCommonMeta($col_083, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_084_META = createCommonMeta($col_084, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_085_META = createCommonMeta($col_085, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_086_META = createCommonMeta($col_086, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_087_META = createCommonMeta($col_087, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_088_META = createCommonMeta($col_088, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_089_META = createCommonMeta($col_089, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_090_META = createCommonMeta($col_090, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_091_META = createCommonMeta($col_091, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_092_META = createCommonMeta($col_092, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_093_META = createCommonMeta($col_093, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_094_META = createCommonMeta($col_094, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_095_META = createCommonMeta($col_095, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_096_META = createCommonMeta($col_096, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_097_META = createCommonMeta($col_097, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_098_META = createCommonMeta($col_098, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta col_099_META = createCommonMeta($col_099, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			act_id_META,
			act_id_sub_META,
			upd_cntr_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			ym_META,
			ac_dt_META,
			par_itm_p_META,
			par_itm_typ_META,
			par_itm_typ_nm_META,
			par_itm_typ_d_cd_META,
			par_itm_typ_d_nm_META,
			par_itm_jnl_cd_META,
			par_itm_jnl_nm_META,
			itm_mfg_inst_no_META,
			mfg_act_no_META,
			inpt_dpt_cd_META,
			inpt_dpt_nm_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			asst_typ_META,
			asst_typ_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			site_cd_META,
			site_nm_META,
			oper_act_no_META,
			disp_seq_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			cost_io_typ_META,
			cost_io_typ_nm_META,
			other_wg_cd_META,
			other_wg_nm_META,
			other_dpt_cd_META,
			other_dpt_nm_META,
			bp_cd_META,
			bp_nm_META,
			cst_cd_META,
			cst_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			slo_no_META,
			iv_no_META,
			sls_trd_cur_cd_META,
			sls_trd_cur_nm_META,
			sls_trd_amt_dec_place_META,
			trd_amt_p_META,
			xrate_META,
			amt_p_META,
			sls_dpt_cd_META,
			sls_dpt_nm_META,
			sls_usr_cd_META,
			sls_usr_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			trd_grp_META,
			trd_ratio_META,
			alc_dpt_cd_META,
			alc_dpt_nm_META,
			cost_sls_cd1_META,
			cost_sls_nm1_META,
			cost_sls_cd2_META,
			cost_sls_nm2_META,
			cost_sls_cd3_META,
			cost_sls_nm3_META,
			cost_sls_cd4_META,
			cost_sls_nm4_META,
			cost_sls_cd5_META,
			cost_sls_nm5_META,
			alc_val1_META,
			alc_val2_META,
			alc_val3_META,
			alc_val4_META,
			alc_val5_META,
			ac_slip_typ_META,
			ac_slip_typ_nm_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			rec_eval_typ_META,
			rec_eval_typ_nm_META,
			eval_loop_flg_META,
			qty_p_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			upri_META,
			ttl_META,
			col_000_META,
			col_001_META,
			col_002_META,
			col_003_META,
			col_004_META,
			col_005_META,
			col_006_META,
			col_007_META,
			col_008_META,
			col_009_META,
			col_010_META,
			col_011_META,
			col_012_META,
			col_013_META,
			col_014_META,
			col_015_META,
			col_016_META,
			col_017_META,
			col_018_META,
			col_019_META,
			col_020_META,
			col_021_META,
			col_022_META,
			col_023_META,
			col_024_META,
			col_025_META,
			col_026_META,
			col_027_META,
			col_028_META,
			col_029_META,
			col_030_META,
			col_031_META,
			col_032_META,
			col_033_META,
			col_034_META,
			col_035_META,
			col_036_META,
			col_037_META,
			col_038_META,
			col_039_META,
			col_040_META,
			col_041_META,
			col_042_META,
			col_043_META,
			col_044_META,
			col_045_META,
			col_046_META,
			col_047_META,
			col_048_META,
			col_049_META,
			col_050_META,
			col_051_META,
			col_052_META,
			col_053_META,
			col_054_META,
			col_055_META,
			col_056_META,
			col_057_META,
			col_058_META,
			col_059_META,
			col_060_META,
			col_061_META,
			col_062_META,
			col_063_META,
			col_064_META,
			col_065_META,
			col_066_META,
			col_067_META,
			col_068_META,
			col_069_META,
			col_070_META,
			col_071_META,
			col_072_META,
			col_073_META,
			col_074_META,
			col_075_META,
			col_076_META,
			col_077_META,
			col_078_META,
			col_079_META,
			col_080_META,
			col_081_META,
			col_082_META,
			col_083_META,
			col_084_META,
			col_085_META,
			col_086_META,
			col_087_META,
			col_088_META,
			col_089_META,
			col_090_META,
			col_091_META,
			col_092_META,
			col_093_META,
			col_094_META,
			col_095_META,
			col_096_META,
			col_097_META,
			col_098_META,
			col_099_META,
			rts_msg_p_META
		},
		new String[][]{
			{
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"sls_trd_cur_amt",
				"sls_amt",
				"qty",
				"rtn_sts_typ"
			},
			{
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$sls_trd_cur_amt,
				$sls_amt,
				$qty,
				$rtn_sts_typ
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
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
	/** 項目属性情報のグループ[HKEY]のキー定数 */
	public static final String $$HKEY = "HKEY";
	/** 項目属性情報のグループ[OTHER]のキー定数 */
	public static final String $$OTHER = "OTHER";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";
	/** 項目属性情報のグループ[HVAL]のキー定数 */
	public static final String $$HVAL = "HVAL";
	/** 項目属性情報のグループ[SUM]のキー定数 */
	public static final String $$SUM = "SUM";

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
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
				{$col_000, "ELM"},	// col_000
				{$col_001, "ELM"},	// col_001
				{$col_002, "ELM"},	// col_002
				{$col_003, "ELM"},	// col_003
				{$col_004, "ELM"},	// col_004
				{$col_005, "ELM"},	// col_005
				{$col_006, "ELM"},	// col_006
				{$col_007, "ELM"},	// col_007
				{$col_008, "ELM"},	// col_008
				{$col_009, "ELM"},	// col_009
				{$col_010, "ELM"},	// col_010
				{$col_011, "ELM"},	// col_011
				{$col_012, "ELM"},	// col_012
				{$col_013, "ELM"},	// col_013
				{$col_014, "ELM"},	// col_014
				{$col_015, "ELM"},	// col_015
				{$col_016, "ELM"},	// col_016
				{$col_017, "ELM"},	// col_017
				{$col_018, "ELM"},	// col_018
				{$col_019, "ELM"},	// col_019
				{$col_020, "ELM"},	// col_020
				{$col_021, "ELM"},	// col_021
				{$col_022, "ELM"},	// col_022
				{$col_023, "ELM"},	// col_023
				{$col_024, "ELM"},	// col_024
				{$col_025, "ELM"},	// col_025
				{$col_026, "ELM"},	// col_026
				{$col_027, "ELM"},	// col_027
				{$col_028, "ELM"},	// col_028
				{$col_029, "ELM"},	// col_029
				{$col_030, "ELM"},	// col_030
				{$col_031, "ELM"},	// col_031
				{$col_032, "ELM"},	// col_032
				{$col_033, "ELM"},	// col_033
				{$col_034, "ELM"},	// col_034
				{$col_035, "ELM"},	// col_035
				{$col_036, "ELM"},	// col_036
				{$col_037, "ELM"},	// col_037
				{$col_038, "ELM"},	// col_038
				{$col_039, "ELM"},	// col_039
				{$col_040, "ELM"},	// col_040
				{$col_041, "ELM"},	// col_041
				{$col_042, "ELM"},	// col_042
				{$col_043, "ELM"},	// col_043
				{$col_044, "ELM"},	// col_044
				{$col_045, "ELM"},	// col_045
				{$col_046, "ELM"},	// col_046
				{$col_047, "ELM"},	// col_047
				{$col_048, "ELM"},	// col_048
				{$col_049, "ELM"},	// col_049
				{$col_050, "ELM"},	// col_050
				{$col_051, "ELM"},	// col_051
				{$col_052, "ELM"},	// col_052
				{$col_053, "ELM"},	// col_053
				{$col_054, "ELM"},	// col_054
				{$col_055, "ELM"},	// col_055
				{$col_056, "ELM"},	// col_056
				{$col_057, "ELM"},	// col_057
				{$col_058, "ELM"},	// col_058
				{$col_059, "ELM"},	// col_059
				{$col_060, "ELM"},	// col_060
				{$col_061, "ELM"},	// col_061
				{$col_062, "ELM"},	// col_062
				{$col_063, "ELM"},	// col_063
				{$col_064, "ELM"},	// col_064
				{$col_065, "ELM"},	// col_065
				{$col_066, "ELM"},	// col_066
				{$col_067, "ELM"},	// col_067
				{$col_068, "ELM"},	// col_068
				{$col_069, "ELM"},	// col_069
				{$col_070, "ELM"},	// col_070
				{$col_071, "ELM"},	// col_071
				{$col_072, "ELM"},	// col_072
				{$col_073, "ELM"},	// col_073
				{$col_074, "ELM"},	// col_074
				{$col_075, "ELM"},	// col_075
				{$col_076, "ELM"},	// col_076
				{$col_077, "ELM"},	// col_077
				{$col_078, "ELM"},	// col_078
				{$col_079, "ELM"},	// col_079
				{$col_080, "ELM"},	// col_080
				{$col_081, "ELM"},	// col_081
				{$col_082, "ELM"},	// col_082
				{$col_083, "ELM"},	// col_083
				{$col_084, "ELM"},	// col_084
				{$col_085, "ELM"},	// col_085
				{$col_086, "ELM"},	// col_086
				{$col_087, "ELM"},	// col_087
				{$col_088, "ELM"},	// col_088
				{$col_089, "ELM"},	// col_089
				{$col_090, "ELM"},	// col_090
				{$col_091, "ELM"},	// col_091
				{$col_092, "ELM"},	// col_092
				{$col_093, "ELM"},	// col_093
				{$col_094, "ELM"},	// col_094
				{$col_095, "ELM"},	// col_095
				{$col_096, "ELM"},	// col_096
				{$col_097, "ELM"},	// col_097
				{$col_098, "ELM"},	// col_098
				{$col_099, "ELM"}	// col_099
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$sno1, "SNO1"},	// sno1
				{$sno2, "SNO2"},	// sno2
				{$sno3, "SNO3"},	// sno3
				{$sno4, "SNO4"},	// sno4
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"},	// str_ln_nm
				{$str_ln_cd_none_flg, "STR_LN"},	// str_ln_cd_none_flg
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$other_wg_cd, "WG"},	// other_wg_cd
				{$other_wg_nm, "WG"}	// other_wg_nm
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
				{$upri, "UNIT"}	// upri
			}
		)),
		new MCExtMap.Entry($$HKEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$OTHER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
				{$col_000, "Key"},	// col_000
				{$col_001, "Key"},	// col_001
				{$col_002, "Key"},	// col_002
				{$col_003, "Key"},	// col_003
				{$col_004, "Key"},	// col_004
				{$col_005, "Key"},	// col_005
				{$col_006, "Key"},	// col_006
				{$col_007, "Key"},	// col_007
				{$col_008, "Key"},	// col_008
				{$col_009, "Key"},	// col_009
				{$col_010, "Key"},	// col_010
				{$col_011, "Key"},	// col_011
				{$col_012, "Key"},	// col_012
				{$col_013, "Key"},	// col_013
				{$col_014, "Key"},	// col_014
				{$col_015, "Key"},	// col_015
				{$col_016, "Key"},	// col_016
				{$col_017, "Key"},	// col_017
				{$col_018, "Key"},	// col_018
				{$col_019, "Key"},	// col_019
				{$col_020, "Key"},	// col_020
				{$col_021, "Key"},	// col_021
				{$col_022, "Key"},	// col_022
				{$col_023, "Key"},	// col_023
				{$col_024, "Key"},	// col_024
				{$col_025, "Key"},	// col_025
				{$col_026, "Key"},	// col_026
				{$col_027, "Key"},	// col_027
				{$col_028, "Key"},	// col_028
				{$col_029, "Key"},	// col_029
				{$col_030, "Key"},	// col_030
				{$col_031, "Key"},	// col_031
				{$col_032, "Key"},	// col_032
				{$col_033, "Key"},	// col_033
				{$col_034, "Key"},	// col_034
				{$col_035, "Key"},	// col_035
				{$col_036, "Key"},	// col_036
				{$col_037, "Key"},	// col_037
				{$col_038, "Key"},	// col_038
				{$col_039, "Key"},	// col_039
				{$col_040, "Key"},	// col_040
				{$col_041, "Key"},	// col_041
				{$col_042, "Key"},	// col_042
				{$col_043, "Key"},	// col_043
				{$col_044, "Key"},	// col_044
				{$col_045, "Key"},	// col_045
				{$col_046, "Key"},	// col_046
				{$col_047, "Key"},	// col_047
				{$col_048, "Key"},	// col_048
				{$col_049, "Key"},	// col_049
				{$col_050, "Key"},	// col_050
				{$col_051, "Key"},	// col_051
				{$col_052, "Key"},	// col_052
				{$col_053, "Key"},	// col_053
				{$col_054, "Key"},	// col_054
				{$col_055, "Key"},	// col_055
				{$col_056, "Key"},	// col_056
				{$col_057, "Key"},	// col_057
				{$col_058, "Key"},	// col_058
				{$col_059, "Key"},	// col_059
				{$col_060, "Key"},	// col_060
				{$col_061, "Key"},	// col_061
				{$col_062, "Key"},	// col_062
				{$col_063, "Key"},	// col_063
				{$col_064, "Key"},	// col_064
				{$col_065, "Key"},	// col_065
				{$col_066, "Key"},	// col_066
				{$col_067, "Key"},	// col_067
				{$col_068, "Key"},	// col_068
				{$col_069, "Key"},	// col_069
				{$col_070, "Key"},	// col_070
				{$col_071, "Key"},	// col_071
				{$col_072, "Key"},	// col_072
				{$col_073, "Key"},	// col_073
				{$col_074, "Key"},	// col_074
				{$col_075, "Key"},	// col_075
				{$col_076, "Key"},	// col_076
				{$col_077, "Key"},	// col_077
				{$col_078, "Key"},	// col_078
				{$col_079, "Key"},	// col_079
				{$col_080, "Key"},	// col_080
				{$col_081, "Key"},	// col_081
				{$col_082, "Key"},	// col_082
				{$col_083, "Key"},	// col_083
				{$col_084, "Key"},	// col_084
				{$col_085, "Key"},	// col_085
				{$col_086, "Key"},	// col_086
				{$col_087, "Key"},	// col_087
				{$col_088, "Key"},	// col_088
				{$col_089, "Key"},	// col_089
				{$col_090, "Key"},	// col_090
				{$col_091, "Key"},	// col_091
				{$col_092, "Key"},	// col_092
				{$col_093, "Key"},	// col_093
				{$col_094, "Key"},	// col_094
				{$col_095, "Key"},	// col_095
				{$col_096, "Key"},	// col_096
				{$col_097, "Key"},	// col_097
				{$col_098, "Key"},	// col_098
				{$col_099, "Key"}	// col_099
			}
		)),
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SUM, new MCExtList(
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
	 * Result ID 実績ＩＤ.<p>
	 *
	 */
	public String act_id() {
		return getConstString(offset + 1, $act_id);
	}

	/**
	 * Result ID 実績ＩＤ.<p>
	 *
	 */
	public void act_id(String value) {
		setConstString(offset + 1, $act_id, value);
	}


	/**
	 * Result ID branch No. 実績ＩＤ枝番.<p>
	 *
	 */
	public String act_id_sub() {
		return getConstString(offset + 2, $act_id_sub);
	}

	/**
	 * Result ID branch No. 実績ＩＤ枝番.<p>
	 *
	 */
	public void act_id_sub(String value) {
		setConstString(offset + 2, $act_id_sub, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 3, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 4, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 4, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 5, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 5, $calc_ctg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 6, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 6, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 7, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 7, $wg_nm, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 8, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 8, $ym, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 9, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 9, $ac_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 10, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 10, $par_itm_p, row);
	}


	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public String par_itm_typ() {
		return getConstString(offset + 11, $par_itm_typ);
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ(String value) {
		setConstString(offset + 11, $par_itm_typ, value);
	}


	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public String par_itm_typ_nm() {
		return getConstString(offset + 12, $par_itm_typ_nm);
	}

	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public void par_itm_typ_nm(String value) {
		setConstString(offset + 12, $par_itm_typ_nm, value);
	}


	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public String par_itm_typ_d_cd() {
		return getConstString(offset + 13, $par_itm_typ_d_cd);
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public void par_itm_typ_d_cd(String value) {
		setConstString(offset + 13, $par_itm_typ_d_cd, value);
	}


	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public String par_itm_typ_d_nm() {
		return getConstString(offset + 14, $par_itm_typ_d_nm);
	}

	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public void par_itm_typ_d_nm(String value) {
		setConstString(offset + 14, $par_itm_typ_d_nm, value);
	}


	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public String par_itm_jnl_cd() {
		return getConstString(offset + 15, $par_itm_jnl_cd);
	}

	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public void par_itm_jnl_cd(String value) {
		setConstString(offset + 15, $par_itm_jnl_cd, value);
	}


	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public String par_itm_jnl_nm() {
		return getConstString(offset + 16, $par_itm_jnl_nm);
	}

	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public void par_itm_jnl_nm(String value) {
		setConstString(offset + 16, $par_itm_jnl_nm, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 17, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 17, $itm_mfg_inst_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 18, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 18, $mfg_act_no, value);
	}


	/**
	 * Input dept. cd. 投入部門ＣＤ.<p>
	 *
	 */
	public String inpt_dpt_cd() {
		return getConstString(offset + 19, $inpt_dpt_cd);
	}

	/**
	 * Input dept. cd. 投入部門ＣＤ.<p>
	 *
	 */
	public void inpt_dpt_cd(String value) {
		setConstString(offset + 19, $inpt_dpt_cd, value);
	}


	/**
	 * Input dept. name 投入部門名.<p>
	 *
	 */
	public String inpt_dpt_nm() {
		return getConstString(offset + 20, $inpt_dpt_nm);
	}

	/**
	 * Input dept. name 投入部門名.<p>
	 *
	 */
	public void inpt_dpt_nm(String value) {
		setConstString(offset + 20, $inpt_dpt_nm, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 21, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 21, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 22, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 22, $mng_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 23, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 23, $itm_p, row);
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
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 25, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 25, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 26, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 26, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 27, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 27, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 28, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 28, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 29, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 29, $itm_jnl_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 30, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 30, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 31, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 31, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 32, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 32, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 33, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 33, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 34, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 34, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 35, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 35, $sno4, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 36, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 36, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 37, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 37, $asst_typ_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 38, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 38, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 39, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 39, $loc_nm, value);
	}


	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 40, $str_ln_cd);
	}

	/**
	 * Line cd. ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 40, $str_ln_cd, value);
	}


	/**
	 * Line name ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 41, $str_ln_nm);
	}

	/**
	 * Line name ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 41, $str_ln_nm, value);
	}


	/**
	 * Without line ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 42, $str_ln_cd_none_flg);
	}

	/**
	 * Without line ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 42, $str_ln_cd_none_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 43, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 43, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 44, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 44, $site_nm, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 45, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 45, $oper_act_no, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 46, $disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 46, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 46, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 46, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 46, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 46, $disp_seq, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 47, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 47, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 48, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 48, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 49, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 49, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 49, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 49, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 49, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 49, $oper_seq, value);
	}


	/**
	 * Cost GR/GI type 原価入出庫区分.<p>
	 *
	 */
	public String cost_io_typ() {
		return getConstString(offset + 50, $cost_io_typ);
	}

	/**
	 * Cost GR/GI type 原価入出庫区分.<p>
	 *
	 */
	public void cost_io_typ(String value) {
		setConstString(offset + 50, $cost_io_typ, value);
	}


	/**
	 * Cost GR/GI type name 原価入出庫区分名.<p>
	 *
	 */
	public String cost_io_typ_nm() {
		return getConstString(offset + 51, $cost_io_typ_nm);
	}

	/**
	 * Cost GR/GI type name 原価入出庫区分名.<p>
	 *
	 */
	public void cost_io_typ_nm(String value) {
		setConstString(offset + 51, $cost_io_typ_nm, value);
	}


	/**
	 * Counterpart WG cd. 相手ワーキンググループＣＤ.<p>
	 *
	 */
	public String other_wg_cd() {
		return getConstString(offset + 52, $other_wg_cd);
	}

	/**
	 * Counterpart WG cd. 相手ワーキンググループＣＤ.<p>
	 *
	 */
	public void other_wg_cd(String value) {
		setConstString(offset + 52, $other_wg_cd, value);
	}


	/**
	 * Counterpart WG name 相手ワーキンググループ名.<p>
	 *
	 */
	public String other_wg_nm() {
		return getConstString(offset + 53, $other_wg_nm);
	}

	/**
	 * Counterpart WG name 相手ワーキンググループ名.<p>
	 *
	 */
	public void other_wg_nm(String value) {
		setConstString(offset + 53, $other_wg_nm, value);
	}


	/**
	 * Counterpart dept. cd. 相手部門ＣＤ.<p>
	 *
	 */
	public String other_dpt_cd() {
		return getConstString(offset + 54, $other_dpt_cd);
	}

	/**
	 * Counterpart dept. cd. 相手部門ＣＤ.<p>
	 *
	 */
	public void other_dpt_cd(String value) {
		setConstString(offset + 54, $other_dpt_cd, value);
	}


	/**
	 * Counterpart dept. name 相手部門名.<p>
	 *
	 */
	public String other_dpt_nm() {
		return getConstString(offset + 55, $other_dpt_nm);
	}

	/**
	 * Counterpart dept. name 相手部門名.<p>
	 *
	 */
	public void other_dpt_nm(String value) {
		setConstString(offset + 55, $other_dpt_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 56, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 56, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 57, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 57, $bp_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 58, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 58, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 59, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 59, $cst_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 60, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 60, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 61, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 61, $dlv_nm, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 62, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 62, $slo_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 63, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 63, $iv_no, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String sls_trd_cur_cd() {
		return getConstString(offset + 64, $sls_trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void sls_trd_cur_cd(String value) {
		setConstString(offset + 64, $sls_trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String sls_trd_cur_nm() {
		return getConstString(offset + 65, $sls_trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void sls_trd_cur_nm(String value) {
		setConstString(offset + 65, $sls_trd_cur_nm, value);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber sls_trd_amt_dec_place() {
		return getConstNumber(offset + 66, $sls_trd_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void sls_trd_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 66, $sls_trd_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void sls_trd_amt_dec_place(int value) {
		setConstNumber(offset + 66, $sls_trd_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void sls_trd_amt_dec_place(long value) {
		setConstNumber(offset + 66, $sls_trd_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void sls_trd_amt_dec_place(float value) {
		setConstNumber(offset + 66, $sls_trd_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void sls_trd_amt_dec_place(double value) {
		setConstNumber(offset + 66, $sls_trd_amt_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 67, $trd_amt_p);
	}
	
	public void trd_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 67, $trd_amt_p, row);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 68, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 68, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 68, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 68, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 68, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 68, $xrate, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 69, $amt_p);
	}
	
	public void amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 69, $amt_p, row);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 70, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 70, $sls_dpt_cd, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 71, $sls_dpt_nm);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 71, $sls_dpt_nm, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 72, $sls_usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 72, $sls_usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 73, $sls_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 73, $sls_usr_nm, value);
	}


	/**
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 74, $stk_bp_cd);
	}

	/**
	 * Company holding inventory cd. 在庫先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 74, $stk_bp_cd, value);
	}


	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 75, $stk_bp_nm);
	}

	/**
	 * Company holding inventory 在庫先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 75, $stk_bp_nm, value);
	}


	/**
	 * Transfer group 振替グループ.<p>
	 *
	 */
	public String trd_grp() {
		return getConstString(offset + 76, $trd_grp);
	}

	/**
	 * Transfer group 振替グループ.<p>
	 *
	 */
	public void trd_grp(String value) {
		setConstString(offset + 76, $trd_grp, value);
	}


	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public MCNumber trd_ratio() {
		return getConstNumber(offset + 77, $trd_ratio);
	}

	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public void trd_ratio(MCNumber value) {
		setConstNumber(offset + 77, $trd_ratio, value);
	}

	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public void trd_ratio(int value) {
		setConstNumber(offset + 77, $trd_ratio, value);
	}

	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public void trd_ratio(long value) {
		setConstNumber(offset + 77, $trd_ratio, value);
	}

	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public void trd_ratio(float value) {
		setConstNumber(offset + 77, $trd_ratio, value);
	}

	/**
	 * Transfer ratio 振替比率.<p>
	 *
	 */
	public void trd_ratio(double value) {
		setConstNumber(offset + 77, $trd_ratio, value);
	}


	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public String alc_dpt_cd() {
		return getConstString(offset + 78, $alc_dpt_cd);
	}

	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public void alc_dpt_cd(String value) {
		setConstString(offset + 78, $alc_dpt_cd, value);
	}


	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public String alc_dpt_nm() {
		return getConstString(offset + 79, $alc_dpt_nm);
	}

	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public void alc_dpt_nm(String value) {
		setConstString(offset + 79, $alc_dpt_nm, value);
	}


	/**
	 * Sales classification cd. 1 売上分類ＣＤ１.<p>
	 *
	 */
	public String cost_sls_cd1() {
		return getConstString(offset + 80, $cost_sls_cd1);
	}

	/**
	 * Sales classification cd. 1 売上分類ＣＤ１.<p>
	 *
	 */
	public void cost_sls_cd1(String value) {
		setConstString(offset + 80, $cost_sls_cd1, value);
	}


	/**
	 * Sales classification name 1 売上分類名１.<p>
	 *
	 */
	public String cost_sls_nm1() {
		return getConstString(offset + 81, $cost_sls_nm1);
	}

	/**
	 * Sales classification name 1 売上分類名１.<p>
	 *
	 */
	public void cost_sls_nm1(String value) {
		setConstString(offset + 81, $cost_sls_nm1, value);
	}


	/**
	 * Sales classification cd. 2 売上分類ＣＤ２.<p>
	 *
	 */
	public String cost_sls_cd2() {
		return getConstString(offset + 82, $cost_sls_cd2);
	}

	/**
	 * Sales classification cd. 2 売上分類ＣＤ２.<p>
	 *
	 */
	public void cost_sls_cd2(String value) {
		setConstString(offset + 82, $cost_sls_cd2, value);
	}


	/**
	 * Sales classification name 2 売上分類名２.<p>
	 *
	 */
	public String cost_sls_nm2() {
		return getConstString(offset + 83, $cost_sls_nm2);
	}

	/**
	 * Sales classification name 2 売上分類名２.<p>
	 *
	 */
	public void cost_sls_nm2(String value) {
		setConstString(offset + 83, $cost_sls_nm2, value);
	}


	/**
	 * Sales classification cd. 3 売上分類ＣＤ３.<p>
	 *
	 */
	public String cost_sls_cd3() {
		return getConstString(offset + 84, $cost_sls_cd3);
	}

	/**
	 * Sales classification cd. 3 売上分類ＣＤ３.<p>
	 *
	 */
	public void cost_sls_cd3(String value) {
		setConstString(offset + 84, $cost_sls_cd3, value);
	}


	/**
	 * Sales classification name 3 売上分類名３.<p>
	 *
	 */
	public String cost_sls_nm3() {
		return getConstString(offset + 85, $cost_sls_nm3);
	}

	/**
	 * Sales classification name 3 売上分類名３.<p>
	 *
	 */
	public void cost_sls_nm3(String value) {
		setConstString(offset + 85, $cost_sls_nm3, value);
	}


	/**
	 * Sales classification cd. 4 売上分類ＣＤ４.<p>
	 *
	 */
	public String cost_sls_cd4() {
		return getConstString(offset + 86, $cost_sls_cd4);
	}

	/**
	 * Sales classification cd. 4 売上分類ＣＤ４.<p>
	 *
	 */
	public void cost_sls_cd4(String value) {
		setConstString(offset + 86, $cost_sls_cd4, value);
	}


	/**
	 * Sales classification name 4 売上分類名４.<p>
	 *
	 */
	public String cost_sls_nm4() {
		return getConstString(offset + 87, $cost_sls_nm4);
	}

	/**
	 * Sales classification name 4 売上分類名４.<p>
	 *
	 */
	public void cost_sls_nm4(String value) {
		setConstString(offset + 87, $cost_sls_nm4, value);
	}


	/**
	 * Sales classification cd. 5 売上分類ＣＤ５.<p>
	 *
	 */
	public String cost_sls_cd5() {
		return getConstString(offset + 88, $cost_sls_cd5);
	}

	/**
	 * Sales classification cd. 5 売上分類ＣＤ５.<p>
	 *
	 */
	public void cost_sls_cd5(String value) {
		setConstString(offset + 88, $cost_sls_cd5, value);
	}


	/**
	 * Sales classification name 5 売上分類名５.<p>
	 *
	 */
	public String cost_sls_nm5() {
		return getConstString(offset + 89, $cost_sls_nm5);
	}

	/**
	 * Sales classification name 5 売上分類名５.<p>
	 *
	 */
	public void cost_sls_nm5(String value) {
		setConstString(offset + 89, $cost_sls_nm5, value);
	}


	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public MCNumber alc_val1() {
		return getConstNumber(offset + 90, $alc_val1);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(MCNumber value) {
		setConstNumber(offset + 90, $alc_val1, value);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(int value) {
		setConstNumber(offset + 90, $alc_val1, value);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(long value) {
		setConstNumber(offset + 90, $alc_val1, value);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(float value) {
		setConstNumber(offset + 90, $alc_val1, value);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(double value) {
		setConstNumber(offset + 90, $alc_val1, value);
	}


	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public MCNumber alc_val2() {
		return getConstNumber(offset + 91, $alc_val2);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(MCNumber value) {
		setConstNumber(offset + 91, $alc_val2, value);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(int value) {
		setConstNumber(offset + 91, $alc_val2, value);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(long value) {
		setConstNumber(offset + 91, $alc_val2, value);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(float value) {
		setConstNumber(offset + 91, $alc_val2, value);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(double value) {
		setConstNumber(offset + 91, $alc_val2, value);
	}


	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public MCNumber alc_val3() {
		return getConstNumber(offset + 92, $alc_val3);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(MCNumber value) {
		setConstNumber(offset + 92, $alc_val3, value);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(int value) {
		setConstNumber(offset + 92, $alc_val3, value);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(long value) {
		setConstNumber(offset + 92, $alc_val3, value);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(float value) {
		setConstNumber(offset + 92, $alc_val3, value);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(double value) {
		setConstNumber(offset + 92, $alc_val3, value);
	}


	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public MCNumber alc_val4() {
		return getConstNumber(offset + 93, $alc_val4);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(MCNumber value) {
		setConstNumber(offset + 93, $alc_val4, value);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(int value) {
		setConstNumber(offset + 93, $alc_val4, value);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(long value) {
		setConstNumber(offset + 93, $alc_val4, value);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(float value) {
		setConstNumber(offset + 93, $alc_val4, value);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(double value) {
		setConstNumber(offset + 93, $alc_val4, value);
	}


	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public MCNumber alc_val5() {
		return getConstNumber(offset + 94, $alc_val5);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(MCNumber value) {
		setConstNumber(offset + 94, $alc_val5, value);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(int value) {
		setConstNumber(offset + 94, $alc_val5, value);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(long value) {
		setConstNumber(offset + 94, $alc_val5, value);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(float value) {
		setConstNumber(offset + 94, $alc_val5, value);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(double value) {
		setConstNumber(offset + 94, $alc_val5, value);
	}


	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 95, $ac_slip_typ);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 95, $ac_slip_typ, value);
	}


	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public String ac_slip_typ_nm() {
		return getConstString(offset + 96, $ac_slip_typ_nm);
	}

	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public void ac_slip_typ_nm(String value) {
		setConstString(offset + 96, $ac_slip_typ_nm, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 97, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 97, $ac_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 98, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 98, $ac_rsn_nm, value);
	}


	/**
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public String rec_eval_typ() {
		return getConstString(offset + 99, $rec_eval_typ);
	}

	/**
	 * Individual evaluation type 個別評価区分.<p>
	 *
	 */
	public void rec_eval_typ(String value) {
		setConstString(offset + 99, $rec_eval_typ, value);
	}


	/**
	 * Individual evaluation type name 個別評価区分名.<p>
	 *
	 */
	public String rec_eval_typ_nm() {
		return getConstString(offset + 100, $rec_eval_typ_nm);
	}

	/**
	 * Individual evaluation type name 個別評価区分名.<p>
	 *
	 */
	public void rec_eval_typ_nm(String value) {
		setConstString(offset + 100, $rec_eval_typ_nm, value);
	}


	/**
	 * Individual evaluation loop 個別評価ループ.<p>
	 *
	 */
	public boolean eval_loop_flg() {
		return getConstBoolean(offset + 101, $eval_loop_flg);
	}

	/**
	 * Individual evaluation loop 個別評価ループ.<p>
	 *
	 */
	public void eval_loop_flg(boolean value) {
		setConstBoolean(offset + 101, $eval_loop_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 102, $qty_p);
	}
	
	public void qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 102, $qty_p, row);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 103, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 103, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 104, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 104, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 105, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 105, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 105, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 105, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 105, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 105, $dec_place, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri() {
		return getConstNumber(offset + 106, $upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(MCNumber value) {
		setConstNumber(offset + 106, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(int value) {
		setConstNumber(offset + 106, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(long value) {
		setConstNumber(offset + 106, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(float value) {
		setConstNumber(offset + 106, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(double value) {
		setConstNumber(offset + 106, $upri, value);
	}


	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl() {
		return getConstNumber(offset + 107, $ttl);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		setConstNumber(offset + 107, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(int value) {
		setConstNumber(offset + 107, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(long value) {
		setConstNumber(offset + 107, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(float value) {
		setConstNumber(offset + 107, $ttl, value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(double value) {
		setConstNumber(offset + 107, $ttl, value);
	}


	public MCNumber col_000() {
		return getConstNumber(offset + 108, $col_000);
	}

	public void col_000(MCNumber value) {
		setConstNumber(offset + 108, $col_000, value);
	}

	public void col_000(int value) {
		setConstNumber(offset + 108, $col_000, value);
	}

	public void col_000(long value) {
		setConstNumber(offset + 108, $col_000, value);
	}

	public void col_000(float value) {
		setConstNumber(offset + 108, $col_000, value);
	}

	public void col_000(double value) {
		setConstNumber(offset + 108, $col_000, value);
	}


	public MCNumber col_001() {
		return getConstNumber(offset + 109, $col_001);
	}

	public void col_001(MCNumber value) {
		setConstNumber(offset + 109, $col_001, value);
	}

	public void col_001(int value) {
		setConstNumber(offset + 109, $col_001, value);
	}

	public void col_001(long value) {
		setConstNumber(offset + 109, $col_001, value);
	}

	public void col_001(float value) {
		setConstNumber(offset + 109, $col_001, value);
	}

	public void col_001(double value) {
		setConstNumber(offset + 109, $col_001, value);
	}


	public MCNumber col_002() {
		return getConstNumber(offset + 110, $col_002);
	}

	public void col_002(MCNumber value) {
		setConstNumber(offset + 110, $col_002, value);
	}

	public void col_002(int value) {
		setConstNumber(offset + 110, $col_002, value);
	}

	public void col_002(long value) {
		setConstNumber(offset + 110, $col_002, value);
	}

	public void col_002(float value) {
		setConstNumber(offset + 110, $col_002, value);
	}

	public void col_002(double value) {
		setConstNumber(offset + 110, $col_002, value);
	}


	public MCNumber col_003() {
		return getConstNumber(offset + 111, $col_003);
	}

	public void col_003(MCNumber value) {
		setConstNumber(offset + 111, $col_003, value);
	}

	public void col_003(int value) {
		setConstNumber(offset + 111, $col_003, value);
	}

	public void col_003(long value) {
		setConstNumber(offset + 111, $col_003, value);
	}

	public void col_003(float value) {
		setConstNumber(offset + 111, $col_003, value);
	}

	public void col_003(double value) {
		setConstNumber(offset + 111, $col_003, value);
	}


	public MCNumber col_004() {
		return getConstNumber(offset + 112, $col_004);
	}

	public void col_004(MCNumber value) {
		setConstNumber(offset + 112, $col_004, value);
	}

	public void col_004(int value) {
		setConstNumber(offset + 112, $col_004, value);
	}

	public void col_004(long value) {
		setConstNumber(offset + 112, $col_004, value);
	}

	public void col_004(float value) {
		setConstNumber(offset + 112, $col_004, value);
	}

	public void col_004(double value) {
		setConstNumber(offset + 112, $col_004, value);
	}


	public MCNumber col_005() {
		return getConstNumber(offset + 113, $col_005);
	}

	public void col_005(MCNumber value) {
		setConstNumber(offset + 113, $col_005, value);
	}

	public void col_005(int value) {
		setConstNumber(offset + 113, $col_005, value);
	}

	public void col_005(long value) {
		setConstNumber(offset + 113, $col_005, value);
	}

	public void col_005(float value) {
		setConstNumber(offset + 113, $col_005, value);
	}

	public void col_005(double value) {
		setConstNumber(offset + 113, $col_005, value);
	}


	public MCNumber col_006() {
		return getConstNumber(offset + 114, $col_006);
	}

	public void col_006(MCNumber value) {
		setConstNumber(offset + 114, $col_006, value);
	}

	public void col_006(int value) {
		setConstNumber(offset + 114, $col_006, value);
	}

	public void col_006(long value) {
		setConstNumber(offset + 114, $col_006, value);
	}

	public void col_006(float value) {
		setConstNumber(offset + 114, $col_006, value);
	}

	public void col_006(double value) {
		setConstNumber(offset + 114, $col_006, value);
	}


	public MCNumber col_007() {
		return getConstNumber(offset + 115, $col_007);
	}

	public void col_007(MCNumber value) {
		setConstNumber(offset + 115, $col_007, value);
	}

	public void col_007(int value) {
		setConstNumber(offset + 115, $col_007, value);
	}

	public void col_007(long value) {
		setConstNumber(offset + 115, $col_007, value);
	}

	public void col_007(float value) {
		setConstNumber(offset + 115, $col_007, value);
	}

	public void col_007(double value) {
		setConstNumber(offset + 115, $col_007, value);
	}


	public MCNumber col_008() {
		return getConstNumber(offset + 116, $col_008);
	}

	public void col_008(MCNumber value) {
		setConstNumber(offset + 116, $col_008, value);
	}

	public void col_008(int value) {
		setConstNumber(offset + 116, $col_008, value);
	}

	public void col_008(long value) {
		setConstNumber(offset + 116, $col_008, value);
	}

	public void col_008(float value) {
		setConstNumber(offset + 116, $col_008, value);
	}

	public void col_008(double value) {
		setConstNumber(offset + 116, $col_008, value);
	}


	public MCNumber col_009() {
		return getConstNumber(offset + 117, $col_009);
	}

	public void col_009(MCNumber value) {
		setConstNumber(offset + 117, $col_009, value);
	}

	public void col_009(int value) {
		setConstNumber(offset + 117, $col_009, value);
	}

	public void col_009(long value) {
		setConstNumber(offset + 117, $col_009, value);
	}

	public void col_009(float value) {
		setConstNumber(offset + 117, $col_009, value);
	}

	public void col_009(double value) {
		setConstNumber(offset + 117, $col_009, value);
	}


	public MCNumber col_010() {
		return getConstNumber(offset + 118, $col_010);
	}

	public void col_010(MCNumber value) {
		setConstNumber(offset + 118, $col_010, value);
	}

	public void col_010(int value) {
		setConstNumber(offset + 118, $col_010, value);
	}

	public void col_010(long value) {
		setConstNumber(offset + 118, $col_010, value);
	}

	public void col_010(float value) {
		setConstNumber(offset + 118, $col_010, value);
	}

	public void col_010(double value) {
		setConstNumber(offset + 118, $col_010, value);
	}


	public MCNumber col_011() {
		return getConstNumber(offset + 119, $col_011);
	}

	public void col_011(MCNumber value) {
		setConstNumber(offset + 119, $col_011, value);
	}

	public void col_011(int value) {
		setConstNumber(offset + 119, $col_011, value);
	}

	public void col_011(long value) {
		setConstNumber(offset + 119, $col_011, value);
	}

	public void col_011(float value) {
		setConstNumber(offset + 119, $col_011, value);
	}

	public void col_011(double value) {
		setConstNumber(offset + 119, $col_011, value);
	}


	public MCNumber col_012() {
		return getConstNumber(offset + 120, $col_012);
	}

	public void col_012(MCNumber value) {
		setConstNumber(offset + 120, $col_012, value);
	}

	public void col_012(int value) {
		setConstNumber(offset + 120, $col_012, value);
	}

	public void col_012(long value) {
		setConstNumber(offset + 120, $col_012, value);
	}

	public void col_012(float value) {
		setConstNumber(offset + 120, $col_012, value);
	}

	public void col_012(double value) {
		setConstNumber(offset + 120, $col_012, value);
	}


	public MCNumber col_013() {
		return getConstNumber(offset + 121, $col_013);
	}

	public void col_013(MCNumber value) {
		setConstNumber(offset + 121, $col_013, value);
	}

	public void col_013(int value) {
		setConstNumber(offset + 121, $col_013, value);
	}

	public void col_013(long value) {
		setConstNumber(offset + 121, $col_013, value);
	}

	public void col_013(float value) {
		setConstNumber(offset + 121, $col_013, value);
	}

	public void col_013(double value) {
		setConstNumber(offset + 121, $col_013, value);
	}


	public MCNumber col_014() {
		return getConstNumber(offset + 122, $col_014);
	}

	public void col_014(MCNumber value) {
		setConstNumber(offset + 122, $col_014, value);
	}

	public void col_014(int value) {
		setConstNumber(offset + 122, $col_014, value);
	}

	public void col_014(long value) {
		setConstNumber(offset + 122, $col_014, value);
	}

	public void col_014(float value) {
		setConstNumber(offset + 122, $col_014, value);
	}

	public void col_014(double value) {
		setConstNumber(offset + 122, $col_014, value);
	}


	public MCNumber col_015() {
		return getConstNumber(offset + 123, $col_015);
	}

	public void col_015(MCNumber value) {
		setConstNumber(offset + 123, $col_015, value);
	}

	public void col_015(int value) {
		setConstNumber(offset + 123, $col_015, value);
	}

	public void col_015(long value) {
		setConstNumber(offset + 123, $col_015, value);
	}

	public void col_015(float value) {
		setConstNumber(offset + 123, $col_015, value);
	}

	public void col_015(double value) {
		setConstNumber(offset + 123, $col_015, value);
	}


	public MCNumber col_016() {
		return getConstNumber(offset + 124, $col_016);
	}

	public void col_016(MCNumber value) {
		setConstNumber(offset + 124, $col_016, value);
	}

	public void col_016(int value) {
		setConstNumber(offset + 124, $col_016, value);
	}

	public void col_016(long value) {
		setConstNumber(offset + 124, $col_016, value);
	}

	public void col_016(float value) {
		setConstNumber(offset + 124, $col_016, value);
	}

	public void col_016(double value) {
		setConstNumber(offset + 124, $col_016, value);
	}


	public MCNumber col_017() {
		return getConstNumber(offset + 125, $col_017);
	}

	public void col_017(MCNumber value) {
		setConstNumber(offset + 125, $col_017, value);
	}

	public void col_017(int value) {
		setConstNumber(offset + 125, $col_017, value);
	}

	public void col_017(long value) {
		setConstNumber(offset + 125, $col_017, value);
	}

	public void col_017(float value) {
		setConstNumber(offset + 125, $col_017, value);
	}

	public void col_017(double value) {
		setConstNumber(offset + 125, $col_017, value);
	}


	public MCNumber col_018() {
		return getConstNumber(offset + 126, $col_018);
	}

	public void col_018(MCNumber value) {
		setConstNumber(offset + 126, $col_018, value);
	}

	public void col_018(int value) {
		setConstNumber(offset + 126, $col_018, value);
	}

	public void col_018(long value) {
		setConstNumber(offset + 126, $col_018, value);
	}

	public void col_018(float value) {
		setConstNumber(offset + 126, $col_018, value);
	}

	public void col_018(double value) {
		setConstNumber(offset + 126, $col_018, value);
	}


	public MCNumber col_019() {
		return getConstNumber(offset + 127, $col_019);
	}

	public void col_019(MCNumber value) {
		setConstNumber(offset + 127, $col_019, value);
	}

	public void col_019(int value) {
		setConstNumber(offset + 127, $col_019, value);
	}

	public void col_019(long value) {
		setConstNumber(offset + 127, $col_019, value);
	}

	public void col_019(float value) {
		setConstNumber(offset + 127, $col_019, value);
	}

	public void col_019(double value) {
		setConstNumber(offset + 127, $col_019, value);
	}


	public MCNumber col_020() {
		return getConstNumber(offset + 128, $col_020);
	}

	public void col_020(MCNumber value) {
		setConstNumber(offset + 128, $col_020, value);
	}

	public void col_020(int value) {
		setConstNumber(offset + 128, $col_020, value);
	}

	public void col_020(long value) {
		setConstNumber(offset + 128, $col_020, value);
	}

	public void col_020(float value) {
		setConstNumber(offset + 128, $col_020, value);
	}

	public void col_020(double value) {
		setConstNumber(offset + 128, $col_020, value);
	}


	public MCNumber col_021() {
		return getConstNumber(offset + 129, $col_021);
	}

	public void col_021(MCNumber value) {
		setConstNumber(offset + 129, $col_021, value);
	}

	public void col_021(int value) {
		setConstNumber(offset + 129, $col_021, value);
	}

	public void col_021(long value) {
		setConstNumber(offset + 129, $col_021, value);
	}

	public void col_021(float value) {
		setConstNumber(offset + 129, $col_021, value);
	}

	public void col_021(double value) {
		setConstNumber(offset + 129, $col_021, value);
	}


	public MCNumber col_022() {
		return getConstNumber(offset + 130, $col_022);
	}

	public void col_022(MCNumber value) {
		setConstNumber(offset + 130, $col_022, value);
	}

	public void col_022(int value) {
		setConstNumber(offset + 130, $col_022, value);
	}

	public void col_022(long value) {
		setConstNumber(offset + 130, $col_022, value);
	}

	public void col_022(float value) {
		setConstNumber(offset + 130, $col_022, value);
	}

	public void col_022(double value) {
		setConstNumber(offset + 130, $col_022, value);
	}


	public MCNumber col_023() {
		return getConstNumber(offset + 131, $col_023);
	}

	public void col_023(MCNumber value) {
		setConstNumber(offset + 131, $col_023, value);
	}

	public void col_023(int value) {
		setConstNumber(offset + 131, $col_023, value);
	}

	public void col_023(long value) {
		setConstNumber(offset + 131, $col_023, value);
	}

	public void col_023(float value) {
		setConstNumber(offset + 131, $col_023, value);
	}

	public void col_023(double value) {
		setConstNumber(offset + 131, $col_023, value);
	}


	public MCNumber col_024() {
		return getConstNumber(offset + 132, $col_024);
	}

	public void col_024(MCNumber value) {
		setConstNumber(offset + 132, $col_024, value);
	}

	public void col_024(int value) {
		setConstNumber(offset + 132, $col_024, value);
	}

	public void col_024(long value) {
		setConstNumber(offset + 132, $col_024, value);
	}

	public void col_024(float value) {
		setConstNumber(offset + 132, $col_024, value);
	}

	public void col_024(double value) {
		setConstNumber(offset + 132, $col_024, value);
	}


	public MCNumber col_025() {
		return getConstNumber(offset + 133, $col_025);
	}

	public void col_025(MCNumber value) {
		setConstNumber(offset + 133, $col_025, value);
	}

	public void col_025(int value) {
		setConstNumber(offset + 133, $col_025, value);
	}

	public void col_025(long value) {
		setConstNumber(offset + 133, $col_025, value);
	}

	public void col_025(float value) {
		setConstNumber(offset + 133, $col_025, value);
	}

	public void col_025(double value) {
		setConstNumber(offset + 133, $col_025, value);
	}


	public MCNumber col_026() {
		return getConstNumber(offset + 134, $col_026);
	}

	public void col_026(MCNumber value) {
		setConstNumber(offset + 134, $col_026, value);
	}

	public void col_026(int value) {
		setConstNumber(offset + 134, $col_026, value);
	}

	public void col_026(long value) {
		setConstNumber(offset + 134, $col_026, value);
	}

	public void col_026(float value) {
		setConstNumber(offset + 134, $col_026, value);
	}

	public void col_026(double value) {
		setConstNumber(offset + 134, $col_026, value);
	}


	public MCNumber col_027() {
		return getConstNumber(offset + 135, $col_027);
	}

	public void col_027(MCNumber value) {
		setConstNumber(offset + 135, $col_027, value);
	}

	public void col_027(int value) {
		setConstNumber(offset + 135, $col_027, value);
	}

	public void col_027(long value) {
		setConstNumber(offset + 135, $col_027, value);
	}

	public void col_027(float value) {
		setConstNumber(offset + 135, $col_027, value);
	}

	public void col_027(double value) {
		setConstNumber(offset + 135, $col_027, value);
	}


	public MCNumber col_028() {
		return getConstNumber(offset + 136, $col_028);
	}

	public void col_028(MCNumber value) {
		setConstNumber(offset + 136, $col_028, value);
	}

	public void col_028(int value) {
		setConstNumber(offset + 136, $col_028, value);
	}

	public void col_028(long value) {
		setConstNumber(offset + 136, $col_028, value);
	}

	public void col_028(float value) {
		setConstNumber(offset + 136, $col_028, value);
	}

	public void col_028(double value) {
		setConstNumber(offset + 136, $col_028, value);
	}


	public MCNumber col_029() {
		return getConstNumber(offset + 137, $col_029);
	}

	public void col_029(MCNumber value) {
		setConstNumber(offset + 137, $col_029, value);
	}

	public void col_029(int value) {
		setConstNumber(offset + 137, $col_029, value);
	}

	public void col_029(long value) {
		setConstNumber(offset + 137, $col_029, value);
	}

	public void col_029(float value) {
		setConstNumber(offset + 137, $col_029, value);
	}

	public void col_029(double value) {
		setConstNumber(offset + 137, $col_029, value);
	}


	public MCNumber col_030() {
		return getConstNumber(offset + 138, $col_030);
	}

	public void col_030(MCNumber value) {
		setConstNumber(offset + 138, $col_030, value);
	}

	public void col_030(int value) {
		setConstNumber(offset + 138, $col_030, value);
	}

	public void col_030(long value) {
		setConstNumber(offset + 138, $col_030, value);
	}

	public void col_030(float value) {
		setConstNumber(offset + 138, $col_030, value);
	}

	public void col_030(double value) {
		setConstNumber(offset + 138, $col_030, value);
	}


	public MCNumber col_031() {
		return getConstNumber(offset + 139, $col_031);
	}

	public void col_031(MCNumber value) {
		setConstNumber(offset + 139, $col_031, value);
	}

	public void col_031(int value) {
		setConstNumber(offset + 139, $col_031, value);
	}

	public void col_031(long value) {
		setConstNumber(offset + 139, $col_031, value);
	}

	public void col_031(float value) {
		setConstNumber(offset + 139, $col_031, value);
	}

	public void col_031(double value) {
		setConstNumber(offset + 139, $col_031, value);
	}


	public MCNumber col_032() {
		return getConstNumber(offset + 140, $col_032);
	}

	public void col_032(MCNumber value) {
		setConstNumber(offset + 140, $col_032, value);
	}

	public void col_032(int value) {
		setConstNumber(offset + 140, $col_032, value);
	}

	public void col_032(long value) {
		setConstNumber(offset + 140, $col_032, value);
	}

	public void col_032(float value) {
		setConstNumber(offset + 140, $col_032, value);
	}

	public void col_032(double value) {
		setConstNumber(offset + 140, $col_032, value);
	}


	public MCNumber col_033() {
		return getConstNumber(offset + 141, $col_033);
	}

	public void col_033(MCNumber value) {
		setConstNumber(offset + 141, $col_033, value);
	}

	public void col_033(int value) {
		setConstNumber(offset + 141, $col_033, value);
	}

	public void col_033(long value) {
		setConstNumber(offset + 141, $col_033, value);
	}

	public void col_033(float value) {
		setConstNumber(offset + 141, $col_033, value);
	}

	public void col_033(double value) {
		setConstNumber(offset + 141, $col_033, value);
	}


	public MCNumber col_034() {
		return getConstNumber(offset + 142, $col_034);
	}

	public void col_034(MCNumber value) {
		setConstNumber(offset + 142, $col_034, value);
	}

	public void col_034(int value) {
		setConstNumber(offset + 142, $col_034, value);
	}

	public void col_034(long value) {
		setConstNumber(offset + 142, $col_034, value);
	}

	public void col_034(float value) {
		setConstNumber(offset + 142, $col_034, value);
	}

	public void col_034(double value) {
		setConstNumber(offset + 142, $col_034, value);
	}


	public MCNumber col_035() {
		return getConstNumber(offset + 143, $col_035);
	}

	public void col_035(MCNumber value) {
		setConstNumber(offset + 143, $col_035, value);
	}

	public void col_035(int value) {
		setConstNumber(offset + 143, $col_035, value);
	}

	public void col_035(long value) {
		setConstNumber(offset + 143, $col_035, value);
	}

	public void col_035(float value) {
		setConstNumber(offset + 143, $col_035, value);
	}

	public void col_035(double value) {
		setConstNumber(offset + 143, $col_035, value);
	}


	public MCNumber col_036() {
		return getConstNumber(offset + 144, $col_036);
	}

	public void col_036(MCNumber value) {
		setConstNumber(offset + 144, $col_036, value);
	}

	public void col_036(int value) {
		setConstNumber(offset + 144, $col_036, value);
	}

	public void col_036(long value) {
		setConstNumber(offset + 144, $col_036, value);
	}

	public void col_036(float value) {
		setConstNumber(offset + 144, $col_036, value);
	}

	public void col_036(double value) {
		setConstNumber(offset + 144, $col_036, value);
	}


	public MCNumber col_037() {
		return getConstNumber(offset + 145, $col_037);
	}

	public void col_037(MCNumber value) {
		setConstNumber(offset + 145, $col_037, value);
	}

	public void col_037(int value) {
		setConstNumber(offset + 145, $col_037, value);
	}

	public void col_037(long value) {
		setConstNumber(offset + 145, $col_037, value);
	}

	public void col_037(float value) {
		setConstNumber(offset + 145, $col_037, value);
	}

	public void col_037(double value) {
		setConstNumber(offset + 145, $col_037, value);
	}


	public MCNumber col_038() {
		return getConstNumber(offset + 146, $col_038);
	}

	public void col_038(MCNumber value) {
		setConstNumber(offset + 146, $col_038, value);
	}

	public void col_038(int value) {
		setConstNumber(offset + 146, $col_038, value);
	}

	public void col_038(long value) {
		setConstNumber(offset + 146, $col_038, value);
	}

	public void col_038(float value) {
		setConstNumber(offset + 146, $col_038, value);
	}

	public void col_038(double value) {
		setConstNumber(offset + 146, $col_038, value);
	}


	public MCNumber col_039() {
		return getConstNumber(offset + 147, $col_039);
	}

	public void col_039(MCNumber value) {
		setConstNumber(offset + 147, $col_039, value);
	}

	public void col_039(int value) {
		setConstNumber(offset + 147, $col_039, value);
	}

	public void col_039(long value) {
		setConstNumber(offset + 147, $col_039, value);
	}

	public void col_039(float value) {
		setConstNumber(offset + 147, $col_039, value);
	}

	public void col_039(double value) {
		setConstNumber(offset + 147, $col_039, value);
	}


	public MCNumber col_040() {
		return getConstNumber(offset + 148, $col_040);
	}

	public void col_040(MCNumber value) {
		setConstNumber(offset + 148, $col_040, value);
	}

	public void col_040(int value) {
		setConstNumber(offset + 148, $col_040, value);
	}

	public void col_040(long value) {
		setConstNumber(offset + 148, $col_040, value);
	}

	public void col_040(float value) {
		setConstNumber(offset + 148, $col_040, value);
	}

	public void col_040(double value) {
		setConstNumber(offset + 148, $col_040, value);
	}


	public MCNumber col_041() {
		return getConstNumber(offset + 149, $col_041);
	}

	public void col_041(MCNumber value) {
		setConstNumber(offset + 149, $col_041, value);
	}

	public void col_041(int value) {
		setConstNumber(offset + 149, $col_041, value);
	}

	public void col_041(long value) {
		setConstNumber(offset + 149, $col_041, value);
	}

	public void col_041(float value) {
		setConstNumber(offset + 149, $col_041, value);
	}

	public void col_041(double value) {
		setConstNumber(offset + 149, $col_041, value);
	}


	public MCNumber col_042() {
		return getConstNumber(offset + 150, $col_042);
	}

	public void col_042(MCNumber value) {
		setConstNumber(offset + 150, $col_042, value);
	}

	public void col_042(int value) {
		setConstNumber(offset + 150, $col_042, value);
	}

	public void col_042(long value) {
		setConstNumber(offset + 150, $col_042, value);
	}

	public void col_042(float value) {
		setConstNumber(offset + 150, $col_042, value);
	}

	public void col_042(double value) {
		setConstNumber(offset + 150, $col_042, value);
	}


	public MCNumber col_043() {
		return getConstNumber(offset + 151, $col_043);
	}

	public void col_043(MCNumber value) {
		setConstNumber(offset + 151, $col_043, value);
	}

	public void col_043(int value) {
		setConstNumber(offset + 151, $col_043, value);
	}

	public void col_043(long value) {
		setConstNumber(offset + 151, $col_043, value);
	}

	public void col_043(float value) {
		setConstNumber(offset + 151, $col_043, value);
	}

	public void col_043(double value) {
		setConstNumber(offset + 151, $col_043, value);
	}


	public MCNumber col_044() {
		return getConstNumber(offset + 152, $col_044);
	}

	public void col_044(MCNumber value) {
		setConstNumber(offset + 152, $col_044, value);
	}

	public void col_044(int value) {
		setConstNumber(offset + 152, $col_044, value);
	}

	public void col_044(long value) {
		setConstNumber(offset + 152, $col_044, value);
	}

	public void col_044(float value) {
		setConstNumber(offset + 152, $col_044, value);
	}

	public void col_044(double value) {
		setConstNumber(offset + 152, $col_044, value);
	}


	public MCNumber col_045() {
		return getConstNumber(offset + 153, $col_045);
	}

	public void col_045(MCNumber value) {
		setConstNumber(offset + 153, $col_045, value);
	}

	public void col_045(int value) {
		setConstNumber(offset + 153, $col_045, value);
	}

	public void col_045(long value) {
		setConstNumber(offset + 153, $col_045, value);
	}

	public void col_045(float value) {
		setConstNumber(offset + 153, $col_045, value);
	}

	public void col_045(double value) {
		setConstNumber(offset + 153, $col_045, value);
	}


	public MCNumber col_046() {
		return getConstNumber(offset + 154, $col_046);
	}

	public void col_046(MCNumber value) {
		setConstNumber(offset + 154, $col_046, value);
	}

	public void col_046(int value) {
		setConstNumber(offset + 154, $col_046, value);
	}

	public void col_046(long value) {
		setConstNumber(offset + 154, $col_046, value);
	}

	public void col_046(float value) {
		setConstNumber(offset + 154, $col_046, value);
	}

	public void col_046(double value) {
		setConstNumber(offset + 154, $col_046, value);
	}


	public MCNumber col_047() {
		return getConstNumber(offset + 155, $col_047);
	}

	public void col_047(MCNumber value) {
		setConstNumber(offset + 155, $col_047, value);
	}

	public void col_047(int value) {
		setConstNumber(offset + 155, $col_047, value);
	}

	public void col_047(long value) {
		setConstNumber(offset + 155, $col_047, value);
	}

	public void col_047(float value) {
		setConstNumber(offset + 155, $col_047, value);
	}

	public void col_047(double value) {
		setConstNumber(offset + 155, $col_047, value);
	}


	public MCNumber col_048() {
		return getConstNumber(offset + 156, $col_048);
	}

	public void col_048(MCNumber value) {
		setConstNumber(offset + 156, $col_048, value);
	}

	public void col_048(int value) {
		setConstNumber(offset + 156, $col_048, value);
	}

	public void col_048(long value) {
		setConstNumber(offset + 156, $col_048, value);
	}

	public void col_048(float value) {
		setConstNumber(offset + 156, $col_048, value);
	}

	public void col_048(double value) {
		setConstNumber(offset + 156, $col_048, value);
	}


	public MCNumber col_049() {
		return getConstNumber(offset + 157, $col_049);
	}

	public void col_049(MCNumber value) {
		setConstNumber(offset + 157, $col_049, value);
	}

	public void col_049(int value) {
		setConstNumber(offset + 157, $col_049, value);
	}

	public void col_049(long value) {
		setConstNumber(offset + 157, $col_049, value);
	}

	public void col_049(float value) {
		setConstNumber(offset + 157, $col_049, value);
	}

	public void col_049(double value) {
		setConstNumber(offset + 157, $col_049, value);
	}


	public MCNumber col_050() {
		return getConstNumber(offset + 158, $col_050);
	}

	public void col_050(MCNumber value) {
		setConstNumber(offset + 158, $col_050, value);
	}

	public void col_050(int value) {
		setConstNumber(offset + 158, $col_050, value);
	}

	public void col_050(long value) {
		setConstNumber(offset + 158, $col_050, value);
	}

	public void col_050(float value) {
		setConstNumber(offset + 158, $col_050, value);
	}

	public void col_050(double value) {
		setConstNumber(offset + 158, $col_050, value);
	}


	public MCNumber col_051() {
		return getConstNumber(offset + 159, $col_051);
	}

	public void col_051(MCNumber value) {
		setConstNumber(offset + 159, $col_051, value);
	}

	public void col_051(int value) {
		setConstNumber(offset + 159, $col_051, value);
	}

	public void col_051(long value) {
		setConstNumber(offset + 159, $col_051, value);
	}

	public void col_051(float value) {
		setConstNumber(offset + 159, $col_051, value);
	}

	public void col_051(double value) {
		setConstNumber(offset + 159, $col_051, value);
	}


	public MCNumber col_052() {
		return getConstNumber(offset + 160, $col_052);
	}

	public void col_052(MCNumber value) {
		setConstNumber(offset + 160, $col_052, value);
	}

	public void col_052(int value) {
		setConstNumber(offset + 160, $col_052, value);
	}

	public void col_052(long value) {
		setConstNumber(offset + 160, $col_052, value);
	}

	public void col_052(float value) {
		setConstNumber(offset + 160, $col_052, value);
	}

	public void col_052(double value) {
		setConstNumber(offset + 160, $col_052, value);
	}


	public MCNumber col_053() {
		return getConstNumber(offset + 161, $col_053);
	}

	public void col_053(MCNumber value) {
		setConstNumber(offset + 161, $col_053, value);
	}

	public void col_053(int value) {
		setConstNumber(offset + 161, $col_053, value);
	}

	public void col_053(long value) {
		setConstNumber(offset + 161, $col_053, value);
	}

	public void col_053(float value) {
		setConstNumber(offset + 161, $col_053, value);
	}

	public void col_053(double value) {
		setConstNumber(offset + 161, $col_053, value);
	}


	public MCNumber col_054() {
		return getConstNumber(offset + 162, $col_054);
	}

	public void col_054(MCNumber value) {
		setConstNumber(offset + 162, $col_054, value);
	}

	public void col_054(int value) {
		setConstNumber(offset + 162, $col_054, value);
	}

	public void col_054(long value) {
		setConstNumber(offset + 162, $col_054, value);
	}

	public void col_054(float value) {
		setConstNumber(offset + 162, $col_054, value);
	}

	public void col_054(double value) {
		setConstNumber(offset + 162, $col_054, value);
	}


	public MCNumber col_055() {
		return getConstNumber(offset + 163, $col_055);
	}

	public void col_055(MCNumber value) {
		setConstNumber(offset + 163, $col_055, value);
	}

	public void col_055(int value) {
		setConstNumber(offset + 163, $col_055, value);
	}

	public void col_055(long value) {
		setConstNumber(offset + 163, $col_055, value);
	}

	public void col_055(float value) {
		setConstNumber(offset + 163, $col_055, value);
	}

	public void col_055(double value) {
		setConstNumber(offset + 163, $col_055, value);
	}


	public MCNumber col_056() {
		return getConstNumber(offset + 164, $col_056);
	}

	public void col_056(MCNumber value) {
		setConstNumber(offset + 164, $col_056, value);
	}

	public void col_056(int value) {
		setConstNumber(offset + 164, $col_056, value);
	}

	public void col_056(long value) {
		setConstNumber(offset + 164, $col_056, value);
	}

	public void col_056(float value) {
		setConstNumber(offset + 164, $col_056, value);
	}

	public void col_056(double value) {
		setConstNumber(offset + 164, $col_056, value);
	}


	public MCNumber col_057() {
		return getConstNumber(offset + 165, $col_057);
	}

	public void col_057(MCNumber value) {
		setConstNumber(offset + 165, $col_057, value);
	}

	public void col_057(int value) {
		setConstNumber(offset + 165, $col_057, value);
	}

	public void col_057(long value) {
		setConstNumber(offset + 165, $col_057, value);
	}

	public void col_057(float value) {
		setConstNumber(offset + 165, $col_057, value);
	}

	public void col_057(double value) {
		setConstNumber(offset + 165, $col_057, value);
	}


	public MCNumber col_058() {
		return getConstNumber(offset + 166, $col_058);
	}

	public void col_058(MCNumber value) {
		setConstNumber(offset + 166, $col_058, value);
	}

	public void col_058(int value) {
		setConstNumber(offset + 166, $col_058, value);
	}

	public void col_058(long value) {
		setConstNumber(offset + 166, $col_058, value);
	}

	public void col_058(float value) {
		setConstNumber(offset + 166, $col_058, value);
	}

	public void col_058(double value) {
		setConstNumber(offset + 166, $col_058, value);
	}


	public MCNumber col_059() {
		return getConstNumber(offset + 167, $col_059);
	}

	public void col_059(MCNumber value) {
		setConstNumber(offset + 167, $col_059, value);
	}

	public void col_059(int value) {
		setConstNumber(offset + 167, $col_059, value);
	}

	public void col_059(long value) {
		setConstNumber(offset + 167, $col_059, value);
	}

	public void col_059(float value) {
		setConstNumber(offset + 167, $col_059, value);
	}

	public void col_059(double value) {
		setConstNumber(offset + 167, $col_059, value);
	}


	public MCNumber col_060() {
		return getConstNumber(offset + 168, $col_060);
	}

	public void col_060(MCNumber value) {
		setConstNumber(offset + 168, $col_060, value);
	}

	public void col_060(int value) {
		setConstNumber(offset + 168, $col_060, value);
	}

	public void col_060(long value) {
		setConstNumber(offset + 168, $col_060, value);
	}

	public void col_060(float value) {
		setConstNumber(offset + 168, $col_060, value);
	}

	public void col_060(double value) {
		setConstNumber(offset + 168, $col_060, value);
	}


	public MCNumber col_061() {
		return getConstNumber(offset + 169, $col_061);
	}

	public void col_061(MCNumber value) {
		setConstNumber(offset + 169, $col_061, value);
	}

	public void col_061(int value) {
		setConstNumber(offset + 169, $col_061, value);
	}

	public void col_061(long value) {
		setConstNumber(offset + 169, $col_061, value);
	}

	public void col_061(float value) {
		setConstNumber(offset + 169, $col_061, value);
	}

	public void col_061(double value) {
		setConstNumber(offset + 169, $col_061, value);
	}


	public MCNumber col_062() {
		return getConstNumber(offset + 170, $col_062);
	}

	public void col_062(MCNumber value) {
		setConstNumber(offset + 170, $col_062, value);
	}

	public void col_062(int value) {
		setConstNumber(offset + 170, $col_062, value);
	}

	public void col_062(long value) {
		setConstNumber(offset + 170, $col_062, value);
	}

	public void col_062(float value) {
		setConstNumber(offset + 170, $col_062, value);
	}

	public void col_062(double value) {
		setConstNumber(offset + 170, $col_062, value);
	}


	public MCNumber col_063() {
		return getConstNumber(offset + 171, $col_063);
	}

	public void col_063(MCNumber value) {
		setConstNumber(offset + 171, $col_063, value);
	}

	public void col_063(int value) {
		setConstNumber(offset + 171, $col_063, value);
	}

	public void col_063(long value) {
		setConstNumber(offset + 171, $col_063, value);
	}

	public void col_063(float value) {
		setConstNumber(offset + 171, $col_063, value);
	}

	public void col_063(double value) {
		setConstNumber(offset + 171, $col_063, value);
	}


	public MCNumber col_064() {
		return getConstNumber(offset + 172, $col_064);
	}

	public void col_064(MCNumber value) {
		setConstNumber(offset + 172, $col_064, value);
	}

	public void col_064(int value) {
		setConstNumber(offset + 172, $col_064, value);
	}

	public void col_064(long value) {
		setConstNumber(offset + 172, $col_064, value);
	}

	public void col_064(float value) {
		setConstNumber(offset + 172, $col_064, value);
	}

	public void col_064(double value) {
		setConstNumber(offset + 172, $col_064, value);
	}


	public MCNumber col_065() {
		return getConstNumber(offset + 173, $col_065);
	}

	public void col_065(MCNumber value) {
		setConstNumber(offset + 173, $col_065, value);
	}

	public void col_065(int value) {
		setConstNumber(offset + 173, $col_065, value);
	}

	public void col_065(long value) {
		setConstNumber(offset + 173, $col_065, value);
	}

	public void col_065(float value) {
		setConstNumber(offset + 173, $col_065, value);
	}

	public void col_065(double value) {
		setConstNumber(offset + 173, $col_065, value);
	}


	public MCNumber col_066() {
		return getConstNumber(offset + 174, $col_066);
	}

	public void col_066(MCNumber value) {
		setConstNumber(offset + 174, $col_066, value);
	}

	public void col_066(int value) {
		setConstNumber(offset + 174, $col_066, value);
	}

	public void col_066(long value) {
		setConstNumber(offset + 174, $col_066, value);
	}

	public void col_066(float value) {
		setConstNumber(offset + 174, $col_066, value);
	}

	public void col_066(double value) {
		setConstNumber(offset + 174, $col_066, value);
	}


	public MCNumber col_067() {
		return getConstNumber(offset + 175, $col_067);
	}

	public void col_067(MCNumber value) {
		setConstNumber(offset + 175, $col_067, value);
	}

	public void col_067(int value) {
		setConstNumber(offset + 175, $col_067, value);
	}

	public void col_067(long value) {
		setConstNumber(offset + 175, $col_067, value);
	}

	public void col_067(float value) {
		setConstNumber(offset + 175, $col_067, value);
	}

	public void col_067(double value) {
		setConstNumber(offset + 175, $col_067, value);
	}


	public MCNumber col_068() {
		return getConstNumber(offset + 176, $col_068);
	}

	public void col_068(MCNumber value) {
		setConstNumber(offset + 176, $col_068, value);
	}

	public void col_068(int value) {
		setConstNumber(offset + 176, $col_068, value);
	}

	public void col_068(long value) {
		setConstNumber(offset + 176, $col_068, value);
	}

	public void col_068(float value) {
		setConstNumber(offset + 176, $col_068, value);
	}

	public void col_068(double value) {
		setConstNumber(offset + 176, $col_068, value);
	}


	public MCNumber col_069() {
		return getConstNumber(offset + 177, $col_069);
	}

	public void col_069(MCNumber value) {
		setConstNumber(offset + 177, $col_069, value);
	}

	public void col_069(int value) {
		setConstNumber(offset + 177, $col_069, value);
	}

	public void col_069(long value) {
		setConstNumber(offset + 177, $col_069, value);
	}

	public void col_069(float value) {
		setConstNumber(offset + 177, $col_069, value);
	}

	public void col_069(double value) {
		setConstNumber(offset + 177, $col_069, value);
	}


	public MCNumber col_070() {
		return getConstNumber(offset + 178, $col_070);
	}

	public void col_070(MCNumber value) {
		setConstNumber(offset + 178, $col_070, value);
	}

	public void col_070(int value) {
		setConstNumber(offset + 178, $col_070, value);
	}

	public void col_070(long value) {
		setConstNumber(offset + 178, $col_070, value);
	}

	public void col_070(float value) {
		setConstNumber(offset + 178, $col_070, value);
	}

	public void col_070(double value) {
		setConstNumber(offset + 178, $col_070, value);
	}


	public MCNumber col_071() {
		return getConstNumber(offset + 179, $col_071);
	}

	public void col_071(MCNumber value) {
		setConstNumber(offset + 179, $col_071, value);
	}

	public void col_071(int value) {
		setConstNumber(offset + 179, $col_071, value);
	}

	public void col_071(long value) {
		setConstNumber(offset + 179, $col_071, value);
	}

	public void col_071(float value) {
		setConstNumber(offset + 179, $col_071, value);
	}

	public void col_071(double value) {
		setConstNumber(offset + 179, $col_071, value);
	}


	public MCNumber col_072() {
		return getConstNumber(offset + 180, $col_072);
	}

	public void col_072(MCNumber value) {
		setConstNumber(offset + 180, $col_072, value);
	}

	public void col_072(int value) {
		setConstNumber(offset + 180, $col_072, value);
	}

	public void col_072(long value) {
		setConstNumber(offset + 180, $col_072, value);
	}

	public void col_072(float value) {
		setConstNumber(offset + 180, $col_072, value);
	}

	public void col_072(double value) {
		setConstNumber(offset + 180, $col_072, value);
	}


	public MCNumber col_073() {
		return getConstNumber(offset + 181, $col_073);
	}

	public void col_073(MCNumber value) {
		setConstNumber(offset + 181, $col_073, value);
	}

	public void col_073(int value) {
		setConstNumber(offset + 181, $col_073, value);
	}

	public void col_073(long value) {
		setConstNumber(offset + 181, $col_073, value);
	}

	public void col_073(float value) {
		setConstNumber(offset + 181, $col_073, value);
	}

	public void col_073(double value) {
		setConstNumber(offset + 181, $col_073, value);
	}


	public MCNumber col_074() {
		return getConstNumber(offset + 182, $col_074);
	}

	public void col_074(MCNumber value) {
		setConstNumber(offset + 182, $col_074, value);
	}

	public void col_074(int value) {
		setConstNumber(offset + 182, $col_074, value);
	}

	public void col_074(long value) {
		setConstNumber(offset + 182, $col_074, value);
	}

	public void col_074(float value) {
		setConstNumber(offset + 182, $col_074, value);
	}

	public void col_074(double value) {
		setConstNumber(offset + 182, $col_074, value);
	}


	public MCNumber col_075() {
		return getConstNumber(offset + 183, $col_075);
	}

	public void col_075(MCNumber value) {
		setConstNumber(offset + 183, $col_075, value);
	}

	public void col_075(int value) {
		setConstNumber(offset + 183, $col_075, value);
	}

	public void col_075(long value) {
		setConstNumber(offset + 183, $col_075, value);
	}

	public void col_075(float value) {
		setConstNumber(offset + 183, $col_075, value);
	}

	public void col_075(double value) {
		setConstNumber(offset + 183, $col_075, value);
	}


	public MCNumber col_076() {
		return getConstNumber(offset + 184, $col_076);
	}

	public void col_076(MCNumber value) {
		setConstNumber(offset + 184, $col_076, value);
	}

	public void col_076(int value) {
		setConstNumber(offset + 184, $col_076, value);
	}

	public void col_076(long value) {
		setConstNumber(offset + 184, $col_076, value);
	}

	public void col_076(float value) {
		setConstNumber(offset + 184, $col_076, value);
	}

	public void col_076(double value) {
		setConstNumber(offset + 184, $col_076, value);
	}


	public MCNumber col_077() {
		return getConstNumber(offset + 185, $col_077);
	}

	public void col_077(MCNumber value) {
		setConstNumber(offset + 185, $col_077, value);
	}

	public void col_077(int value) {
		setConstNumber(offset + 185, $col_077, value);
	}

	public void col_077(long value) {
		setConstNumber(offset + 185, $col_077, value);
	}

	public void col_077(float value) {
		setConstNumber(offset + 185, $col_077, value);
	}

	public void col_077(double value) {
		setConstNumber(offset + 185, $col_077, value);
	}


	public MCNumber col_078() {
		return getConstNumber(offset + 186, $col_078);
	}

	public void col_078(MCNumber value) {
		setConstNumber(offset + 186, $col_078, value);
	}

	public void col_078(int value) {
		setConstNumber(offset + 186, $col_078, value);
	}

	public void col_078(long value) {
		setConstNumber(offset + 186, $col_078, value);
	}

	public void col_078(float value) {
		setConstNumber(offset + 186, $col_078, value);
	}

	public void col_078(double value) {
		setConstNumber(offset + 186, $col_078, value);
	}


	public MCNumber col_079() {
		return getConstNumber(offset + 187, $col_079);
	}

	public void col_079(MCNumber value) {
		setConstNumber(offset + 187, $col_079, value);
	}

	public void col_079(int value) {
		setConstNumber(offset + 187, $col_079, value);
	}

	public void col_079(long value) {
		setConstNumber(offset + 187, $col_079, value);
	}

	public void col_079(float value) {
		setConstNumber(offset + 187, $col_079, value);
	}

	public void col_079(double value) {
		setConstNumber(offset + 187, $col_079, value);
	}


	public MCNumber col_080() {
		return getConstNumber(offset + 188, $col_080);
	}

	public void col_080(MCNumber value) {
		setConstNumber(offset + 188, $col_080, value);
	}

	public void col_080(int value) {
		setConstNumber(offset + 188, $col_080, value);
	}

	public void col_080(long value) {
		setConstNumber(offset + 188, $col_080, value);
	}

	public void col_080(float value) {
		setConstNumber(offset + 188, $col_080, value);
	}

	public void col_080(double value) {
		setConstNumber(offset + 188, $col_080, value);
	}


	public MCNumber col_081() {
		return getConstNumber(offset + 189, $col_081);
	}

	public void col_081(MCNumber value) {
		setConstNumber(offset + 189, $col_081, value);
	}

	public void col_081(int value) {
		setConstNumber(offset + 189, $col_081, value);
	}

	public void col_081(long value) {
		setConstNumber(offset + 189, $col_081, value);
	}

	public void col_081(float value) {
		setConstNumber(offset + 189, $col_081, value);
	}

	public void col_081(double value) {
		setConstNumber(offset + 189, $col_081, value);
	}


	public MCNumber col_082() {
		return getConstNumber(offset + 190, $col_082);
	}

	public void col_082(MCNumber value) {
		setConstNumber(offset + 190, $col_082, value);
	}

	public void col_082(int value) {
		setConstNumber(offset + 190, $col_082, value);
	}

	public void col_082(long value) {
		setConstNumber(offset + 190, $col_082, value);
	}

	public void col_082(float value) {
		setConstNumber(offset + 190, $col_082, value);
	}

	public void col_082(double value) {
		setConstNumber(offset + 190, $col_082, value);
	}


	public MCNumber col_083() {
		return getConstNumber(offset + 191, $col_083);
	}

	public void col_083(MCNumber value) {
		setConstNumber(offset + 191, $col_083, value);
	}

	public void col_083(int value) {
		setConstNumber(offset + 191, $col_083, value);
	}

	public void col_083(long value) {
		setConstNumber(offset + 191, $col_083, value);
	}

	public void col_083(float value) {
		setConstNumber(offset + 191, $col_083, value);
	}

	public void col_083(double value) {
		setConstNumber(offset + 191, $col_083, value);
	}


	public MCNumber col_084() {
		return getConstNumber(offset + 192, $col_084);
	}

	public void col_084(MCNumber value) {
		setConstNumber(offset + 192, $col_084, value);
	}

	public void col_084(int value) {
		setConstNumber(offset + 192, $col_084, value);
	}

	public void col_084(long value) {
		setConstNumber(offset + 192, $col_084, value);
	}

	public void col_084(float value) {
		setConstNumber(offset + 192, $col_084, value);
	}

	public void col_084(double value) {
		setConstNumber(offset + 192, $col_084, value);
	}


	public MCNumber col_085() {
		return getConstNumber(offset + 193, $col_085);
	}

	public void col_085(MCNumber value) {
		setConstNumber(offset + 193, $col_085, value);
	}

	public void col_085(int value) {
		setConstNumber(offset + 193, $col_085, value);
	}

	public void col_085(long value) {
		setConstNumber(offset + 193, $col_085, value);
	}

	public void col_085(float value) {
		setConstNumber(offset + 193, $col_085, value);
	}

	public void col_085(double value) {
		setConstNumber(offset + 193, $col_085, value);
	}


	public MCNumber col_086() {
		return getConstNumber(offset + 194, $col_086);
	}

	public void col_086(MCNumber value) {
		setConstNumber(offset + 194, $col_086, value);
	}

	public void col_086(int value) {
		setConstNumber(offset + 194, $col_086, value);
	}

	public void col_086(long value) {
		setConstNumber(offset + 194, $col_086, value);
	}

	public void col_086(float value) {
		setConstNumber(offset + 194, $col_086, value);
	}

	public void col_086(double value) {
		setConstNumber(offset + 194, $col_086, value);
	}


	public MCNumber col_087() {
		return getConstNumber(offset + 195, $col_087);
	}

	public void col_087(MCNumber value) {
		setConstNumber(offset + 195, $col_087, value);
	}

	public void col_087(int value) {
		setConstNumber(offset + 195, $col_087, value);
	}

	public void col_087(long value) {
		setConstNumber(offset + 195, $col_087, value);
	}

	public void col_087(float value) {
		setConstNumber(offset + 195, $col_087, value);
	}

	public void col_087(double value) {
		setConstNumber(offset + 195, $col_087, value);
	}


	public MCNumber col_088() {
		return getConstNumber(offset + 196, $col_088);
	}

	public void col_088(MCNumber value) {
		setConstNumber(offset + 196, $col_088, value);
	}

	public void col_088(int value) {
		setConstNumber(offset + 196, $col_088, value);
	}

	public void col_088(long value) {
		setConstNumber(offset + 196, $col_088, value);
	}

	public void col_088(float value) {
		setConstNumber(offset + 196, $col_088, value);
	}

	public void col_088(double value) {
		setConstNumber(offset + 196, $col_088, value);
	}


	public MCNumber col_089() {
		return getConstNumber(offset + 197, $col_089);
	}

	public void col_089(MCNumber value) {
		setConstNumber(offset + 197, $col_089, value);
	}

	public void col_089(int value) {
		setConstNumber(offset + 197, $col_089, value);
	}

	public void col_089(long value) {
		setConstNumber(offset + 197, $col_089, value);
	}

	public void col_089(float value) {
		setConstNumber(offset + 197, $col_089, value);
	}

	public void col_089(double value) {
		setConstNumber(offset + 197, $col_089, value);
	}


	public MCNumber col_090() {
		return getConstNumber(offset + 198, $col_090);
	}

	public void col_090(MCNumber value) {
		setConstNumber(offset + 198, $col_090, value);
	}

	public void col_090(int value) {
		setConstNumber(offset + 198, $col_090, value);
	}

	public void col_090(long value) {
		setConstNumber(offset + 198, $col_090, value);
	}

	public void col_090(float value) {
		setConstNumber(offset + 198, $col_090, value);
	}

	public void col_090(double value) {
		setConstNumber(offset + 198, $col_090, value);
	}


	public MCNumber col_091() {
		return getConstNumber(offset + 199, $col_091);
	}

	public void col_091(MCNumber value) {
		setConstNumber(offset + 199, $col_091, value);
	}

	public void col_091(int value) {
		setConstNumber(offset + 199, $col_091, value);
	}

	public void col_091(long value) {
		setConstNumber(offset + 199, $col_091, value);
	}

	public void col_091(float value) {
		setConstNumber(offset + 199, $col_091, value);
	}

	public void col_091(double value) {
		setConstNumber(offset + 199, $col_091, value);
	}


	public MCNumber col_092() {
		return getConstNumber(offset + 200, $col_092);
	}

	public void col_092(MCNumber value) {
		setConstNumber(offset + 200, $col_092, value);
	}

	public void col_092(int value) {
		setConstNumber(offset + 200, $col_092, value);
	}

	public void col_092(long value) {
		setConstNumber(offset + 200, $col_092, value);
	}

	public void col_092(float value) {
		setConstNumber(offset + 200, $col_092, value);
	}

	public void col_092(double value) {
		setConstNumber(offset + 200, $col_092, value);
	}


	public MCNumber col_093() {
		return getConstNumber(offset + 201, $col_093);
	}

	public void col_093(MCNumber value) {
		setConstNumber(offset + 201, $col_093, value);
	}

	public void col_093(int value) {
		setConstNumber(offset + 201, $col_093, value);
	}

	public void col_093(long value) {
		setConstNumber(offset + 201, $col_093, value);
	}

	public void col_093(float value) {
		setConstNumber(offset + 201, $col_093, value);
	}

	public void col_093(double value) {
		setConstNumber(offset + 201, $col_093, value);
	}


	public MCNumber col_094() {
		return getConstNumber(offset + 202, $col_094);
	}

	public void col_094(MCNumber value) {
		setConstNumber(offset + 202, $col_094, value);
	}

	public void col_094(int value) {
		setConstNumber(offset + 202, $col_094, value);
	}

	public void col_094(long value) {
		setConstNumber(offset + 202, $col_094, value);
	}

	public void col_094(float value) {
		setConstNumber(offset + 202, $col_094, value);
	}

	public void col_094(double value) {
		setConstNumber(offset + 202, $col_094, value);
	}


	public MCNumber col_095() {
		return getConstNumber(offset + 203, $col_095);
	}

	public void col_095(MCNumber value) {
		setConstNumber(offset + 203, $col_095, value);
	}

	public void col_095(int value) {
		setConstNumber(offset + 203, $col_095, value);
	}

	public void col_095(long value) {
		setConstNumber(offset + 203, $col_095, value);
	}

	public void col_095(float value) {
		setConstNumber(offset + 203, $col_095, value);
	}

	public void col_095(double value) {
		setConstNumber(offset + 203, $col_095, value);
	}


	public MCNumber col_096() {
		return getConstNumber(offset + 204, $col_096);
	}

	public void col_096(MCNumber value) {
		setConstNumber(offset + 204, $col_096, value);
	}

	public void col_096(int value) {
		setConstNumber(offset + 204, $col_096, value);
	}

	public void col_096(long value) {
		setConstNumber(offset + 204, $col_096, value);
	}

	public void col_096(float value) {
		setConstNumber(offset + 204, $col_096, value);
	}

	public void col_096(double value) {
		setConstNumber(offset + 204, $col_096, value);
	}


	public MCNumber col_097() {
		return getConstNumber(offset + 205, $col_097);
	}

	public void col_097(MCNumber value) {
		setConstNumber(offset + 205, $col_097, value);
	}

	public void col_097(int value) {
		setConstNumber(offset + 205, $col_097, value);
	}

	public void col_097(long value) {
		setConstNumber(offset + 205, $col_097, value);
	}

	public void col_097(float value) {
		setConstNumber(offset + 205, $col_097, value);
	}

	public void col_097(double value) {
		setConstNumber(offset + 205, $col_097, value);
	}


	public MCNumber col_098() {
		return getConstNumber(offset + 206, $col_098);
	}

	public void col_098(MCNumber value) {
		setConstNumber(offset + 206, $col_098, value);
	}

	public void col_098(int value) {
		setConstNumber(offset + 206, $col_098, value);
	}

	public void col_098(long value) {
		setConstNumber(offset + 206, $col_098, value);
	}

	public void col_098(float value) {
		setConstNumber(offset + 206, $col_098, value);
	}

	public void col_098(double value) {
		setConstNumber(offset + 206, $col_098, value);
	}


	public MCNumber col_099() {
		return getConstNumber(offset + 207, $col_099);
	}

	public void col_099(MCNumber value) {
		setConstNumber(offset + 207, $col_099, value);
	}

	public void col_099(int value) {
		setConstNumber(offset + 207, $col_099, value);
	}

	public void col_099(long value) {
		setConstNumber(offset + 207, $col_099, value);
	}

	public void col_099(float value) {
		setConstNumber(offset + 207, $col_099, value);
	}

	public void col_099(double value) {
		setConstNumber(offset + 207, $col_099, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 208, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 208, $rts_msg_p, row);
	}


	public String getString(String name) {
		if ($act_id.equalsIgnoreCase(name)) {
			return act_id();
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			return act_id_sub();
		}
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
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			return par_itm_jnl_cd();
		}
		if ($par_itm_jnl_nm.equalsIgnoreCase(name)) {
			return par_itm_jnl_nm();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($inpt_dpt_cd.equalsIgnoreCase(name)) {
			return inpt_dpt_cd();
		}
		if ($inpt_dpt_nm.equalsIgnoreCase(name)) {
			return inpt_dpt_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			return cost_io_typ();
		}
		if ($cost_io_typ_nm.equalsIgnoreCase(name)) {
			return cost_io_typ_nm();
		}
		if ($other_wg_cd.equalsIgnoreCase(name)) {
			return other_wg_cd();
		}
		if ($other_wg_nm.equalsIgnoreCase(name)) {
			return other_wg_nm();
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			return other_dpt_cd();
		}
		if ($other_dpt_nm.equalsIgnoreCase(name)) {
			return other_dpt_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($sls_trd_cur_cd.equalsIgnoreCase(name)) {
			return sls_trd_cur_cd();
		}
		if ($sls_trd_cur_nm.equalsIgnoreCase(name)) {
			return sls_trd_cur_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($trd_grp.equalsIgnoreCase(name)) {
			return trd_grp();
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			return alc_dpt_nm();
		}
		if ($cost_sls_cd1.equalsIgnoreCase(name)) {
			return cost_sls_cd1();
		}
		if ($cost_sls_nm1.equalsIgnoreCase(name)) {
			return cost_sls_nm1();
		}
		if ($cost_sls_cd2.equalsIgnoreCase(name)) {
			return cost_sls_cd2();
		}
		if ($cost_sls_nm2.equalsIgnoreCase(name)) {
			return cost_sls_nm2();
		}
		if ($cost_sls_cd3.equalsIgnoreCase(name)) {
			return cost_sls_cd3();
		}
		if ($cost_sls_nm3.equalsIgnoreCase(name)) {
			return cost_sls_nm3();
		}
		if ($cost_sls_cd4.equalsIgnoreCase(name)) {
			return cost_sls_cd4();
		}
		if ($cost_sls_nm4.equalsIgnoreCase(name)) {
			return cost_sls_nm4();
		}
		if ($cost_sls_cd5.equalsIgnoreCase(name)) {
			return cost_sls_cd5();
		}
		if ($cost_sls_nm5.equalsIgnoreCase(name)) {
			return cost_sls_nm5();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			return ac_slip_typ_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			return rec_eval_typ();
		}
		if ($rec_eval_typ_nm.equalsIgnoreCase(name)) {
			return rec_eval_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($sls_trd_amt_dec_place.equalsIgnoreCase(name)) {
			return sls_trd_amt_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			return trd_ratio();
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			return alc_val1();
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			return alc_val2();
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			return alc_val3();
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			return alc_val4();
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			return alc_val5();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($upri.equalsIgnoreCase(name)) {
			return upri();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($col_000.equalsIgnoreCase(name)) {
			return col_000();
		}
		if ($col_001.equalsIgnoreCase(name)) {
			return col_001();
		}
		if ($col_002.equalsIgnoreCase(name)) {
			return col_002();
		}
		if ($col_003.equalsIgnoreCase(name)) {
			return col_003();
		}
		if ($col_004.equalsIgnoreCase(name)) {
			return col_004();
		}
		if ($col_005.equalsIgnoreCase(name)) {
			return col_005();
		}
		if ($col_006.equalsIgnoreCase(name)) {
			return col_006();
		}
		if ($col_007.equalsIgnoreCase(name)) {
			return col_007();
		}
		if ($col_008.equalsIgnoreCase(name)) {
			return col_008();
		}
		if ($col_009.equalsIgnoreCase(name)) {
			return col_009();
		}
		if ($col_010.equalsIgnoreCase(name)) {
			return col_010();
		}
		if ($col_011.equalsIgnoreCase(name)) {
			return col_011();
		}
		if ($col_012.equalsIgnoreCase(name)) {
			return col_012();
		}
		if ($col_013.equalsIgnoreCase(name)) {
			return col_013();
		}
		if ($col_014.equalsIgnoreCase(name)) {
			return col_014();
		}
		if ($col_015.equalsIgnoreCase(name)) {
			return col_015();
		}
		if ($col_016.equalsIgnoreCase(name)) {
			return col_016();
		}
		if ($col_017.equalsIgnoreCase(name)) {
			return col_017();
		}
		if ($col_018.equalsIgnoreCase(name)) {
			return col_018();
		}
		if ($col_019.equalsIgnoreCase(name)) {
			return col_019();
		}
		if ($col_020.equalsIgnoreCase(name)) {
			return col_020();
		}
		if ($col_021.equalsIgnoreCase(name)) {
			return col_021();
		}
		if ($col_022.equalsIgnoreCase(name)) {
			return col_022();
		}
		if ($col_023.equalsIgnoreCase(name)) {
			return col_023();
		}
		if ($col_024.equalsIgnoreCase(name)) {
			return col_024();
		}
		if ($col_025.equalsIgnoreCase(name)) {
			return col_025();
		}
		if ($col_026.equalsIgnoreCase(name)) {
			return col_026();
		}
		if ($col_027.equalsIgnoreCase(name)) {
			return col_027();
		}
		if ($col_028.equalsIgnoreCase(name)) {
			return col_028();
		}
		if ($col_029.equalsIgnoreCase(name)) {
			return col_029();
		}
		if ($col_030.equalsIgnoreCase(name)) {
			return col_030();
		}
		if ($col_031.equalsIgnoreCase(name)) {
			return col_031();
		}
		if ($col_032.equalsIgnoreCase(name)) {
			return col_032();
		}
		if ($col_033.equalsIgnoreCase(name)) {
			return col_033();
		}
		if ($col_034.equalsIgnoreCase(name)) {
			return col_034();
		}
		if ($col_035.equalsIgnoreCase(name)) {
			return col_035();
		}
		if ($col_036.equalsIgnoreCase(name)) {
			return col_036();
		}
		if ($col_037.equalsIgnoreCase(name)) {
			return col_037();
		}
		if ($col_038.equalsIgnoreCase(name)) {
			return col_038();
		}
		if ($col_039.equalsIgnoreCase(name)) {
			return col_039();
		}
		if ($col_040.equalsIgnoreCase(name)) {
			return col_040();
		}
		if ($col_041.equalsIgnoreCase(name)) {
			return col_041();
		}
		if ($col_042.equalsIgnoreCase(name)) {
			return col_042();
		}
		if ($col_043.equalsIgnoreCase(name)) {
			return col_043();
		}
		if ($col_044.equalsIgnoreCase(name)) {
			return col_044();
		}
		if ($col_045.equalsIgnoreCase(name)) {
			return col_045();
		}
		if ($col_046.equalsIgnoreCase(name)) {
			return col_046();
		}
		if ($col_047.equalsIgnoreCase(name)) {
			return col_047();
		}
		if ($col_048.equalsIgnoreCase(name)) {
			return col_048();
		}
		if ($col_049.equalsIgnoreCase(name)) {
			return col_049();
		}
		if ($col_050.equalsIgnoreCase(name)) {
			return col_050();
		}
		if ($col_051.equalsIgnoreCase(name)) {
			return col_051();
		}
		if ($col_052.equalsIgnoreCase(name)) {
			return col_052();
		}
		if ($col_053.equalsIgnoreCase(name)) {
			return col_053();
		}
		if ($col_054.equalsIgnoreCase(name)) {
			return col_054();
		}
		if ($col_055.equalsIgnoreCase(name)) {
			return col_055();
		}
		if ($col_056.equalsIgnoreCase(name)) {
			return col_056();
		}
		if ($col_057.equalsIgnoreCase(name)) {
			return col_057();
		}
		if ($col_058.equalsIgnoreCase(name)) {
			return col_058();
		}
		if ($col_059.equalsIgnoreCase(name)) {
			return col_059();
		}
		if ($col_060.equalsIgnoreCase(name)) {
			return col_060();
		}
		if ($col_061.equalsIgnoreCase(name)) {
			return col_061();
		}
		if ($col_062.equalsIgnoreCase(name)) {
			return col_062();
		}
		if ($col_063.equalsIgnoreCase(name)) {
			return col_063();
		}
		if ($col_064.equalsIgnoreCase(name)) {
			return col_064();
		}
		if ($col_065.equalsIgnoreCase(name)) {
			return col_065();
		}
		if ($col_066.equalsIgnoreCase(name)) {
			return col_066();
		}
		if ($col_067.equalsIgnoreCase(name)) {
			return col_067();
		}
		if ($col_068.equalsIgnoreCase(name)) {
			return col_068();
		}
		if ($col_069.equalsIgnoreCase(name)) {
			return col_069();
		}
		if ($col_070.equalsIgnoreCase(name)) {
			return col_070();
		}
		if ($col_071.equalsIgnoreCase(name)) {
			return col_071();
		}
		if ($col_072.equalsIgnoreCase(name)) {
			return col_072();
		}
		if ($col_073.equalsIgnoreCase(name)) {
			return col_073();
		}
		if ($col_074.equalsIgnoreCase(name)) {
			return col_074();
		}
		if ($col_075.equalsIgnoreCase(name)) {
			return col_075();
		}
		if ($col_076.equalsIgnoreCase(name)) {
			return col_076();
		}
		if ($col_077.equalsIgnoreCase(name)) {
			return col_077();
		}
		if ($col_078.equalsIgnoreCase(name)) {
			return col_078();
		}
		if ($col_079.equalsIgnoreCase(name)) {
			return col_079();
		}
		if ($col_080.equalsIgnoreCase(name)) {
			return col_080();
		}
		if ($col_081.equalsIgnoreCase(name)) {
			return col_081();
		}
		if ($col_082.equalsIgnoreCase(name)) {
			return col_082();
		}
		if ($col_083.equalsIgnoreCase(name)) {
			return col_083();
		}
		if ($col_084.equalsIgnoreCase(name)) {
			return col_084();
		}
		if ($col_085.equalsIgnoreCase(name)) {
			return col_085();
		}
		if ($col_086.equalsIgnoreCase(name)) {
			return col_086();
		}
		if ($col_087.equalsIgnoreCase(name)) {
			return col_087();
		}
		if ($col_088.equalsIgnoreCase(name)) {
			return col_088();
		}
		if ($col_089.equalsIgnoreCase(name)) {
			return col_089();
		}
		if ($col_090.equalsIgnoreCase(name)) {
			return col_090();
		}
		if ($col_091.equalsIgnoreCase(name)) {
			return col_091();
		}
		if ($col_092.equalsIgnoreCase(name)) {
			return col_092();
		}
		if ($col_093.equalsIgnoreCase(name)) {
			return col_093();
		}
		if ($col_094.equalsIgnoreCase(name)) {
			return col_094();
		}
		if ($col_095.equalsIgnoreCase(name)) {
			return col_095();
		}
		if ($col_096.equalsIgnoreCase(name)) {
			return col_096();
		}
		if ($col_097.equalsIgnoreCase(name)) {
			return col_097();
		}
		if ($col_098.equalsIgnoreCase(name)) {
			return col_098();
		}
		if ($col_099.equalsIgnoreCase(name)) {
			return col_099();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($eval_loop_flg.equalsIgnoreCase(name)) {
			return eval_loop_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($act_id.equalsIgnoreCase(name)) {
			return act_id();
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			return act_id_sub();
		}
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
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			return par_itm_jnl_cd();
		}
		if ($par_itm_jnl_nm.equalsIgnoreCase(name)) {
			return par_itm_jnl_nm();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($inpt_dpt_cd.equalsIgnoreCase(name)) {
			return inpt_dpt_cd();
		}
		if ($inpt_dpt_nm.equalsIgnoreCase(name)) {
			return inpt_dpt_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			return cost_io_typ();
		}
		if ($cost_io_typ_nm.equalsIgnoreCase(name)) {
			return cost_io_typ_nm();
		}
		if ($other_wg_cd.equalsIgnoreCase(name)) {
			return other_wg_cd();
		}
		if ($other_wg_nm.equalsIgnoreCase(name)) {
			return other_wg_nm();
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			return other_dpt_cd();
		}
		if ($other_dpt_nm.equalsIgnoreCase(name)) {
			return other_dpt_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($sls_trd_cur_cd.equalsIgnoreCase(name)) {
			return sls_trd_cur_cd();
		}
		if ($sls_trd_cur_nm.equalsIgnoreCase(name)) {
			return sls_trd_cur_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($trd_grp.equalsIgnoreCase(name)) {
			return trd_grp();
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			return alc_dpt_nm();
		}
		if ($cost_sls_cd1.equalsIgnoreCase(name)) {
			return cost_sls_cd1();
		}
		if ($cost_sls_nm1.equalsIgnoreCase(name)) {
			return cost_sls_nm1();
		}
		if ($cost_sls_cd2.equalsIgnoreCase(name)) {
			return cost_sls_cd2();
		}
		if ($cost_sls_nm2.equalsIgnoreCase(name)) {
			return cost_sls_nm2();
		}
		if ($cost_sls_cd3.equalsIgnoreCase(name)) {
			return cost_sls_cd3();
		}
		if ($cost_sls_nm3.equalsIgnoreCase(name)) {
			return cost_sls_nm3();
		}
		if ($cost_sls_cd4.equalsIgnoreCase(name)) {
			return cost_sls_cd4();
		}
		if ($cost_sls_nm4.equalsIgnoreCase(name)) {
			return cost_sls_nm4();
		}
		if ($cost_sls_cd5.equalsIgnoreCase(name)) {
			return cost_sls_cd5();
		}
		if ($cost_sls_nm5.equalsIgnoreCase(name)) {
			return cost_sls_nm5();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			return ac_slip_typ_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			return rec_eval_typ();
		}
		if ($rec_eval_typ_nm.equalsIgnoreCase(name)) {
			return rec_eval_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($sls_trd_amt_dec_place.equalsIgnoreCase(name)) {
			return sls_trd_amt_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			return trd_ratio();
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			return alc_val1();
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			return alc_val2();
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			return alc_val3();
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			return alc_val4();
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			return alc_val5();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($upri.equalsIgnoreCase(name)) {
			return upri();
		}
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($col_000.equalsIgnoreCase(name)) {
			return col_000();
		}
		if ($col_001.equalsIgnoreCase(name)) {
			return col_001();
		}
		if ($col_002.equalsIgnoreCase(name)) {
			return col_002();
		}
		if ($col_003.equalsIgnoreCase(name)) {
			return col_003();
		}
		if ($col_004.equalsIgnoreCase(name)) {
			return col_004();
		}
		if ($col_005.equalsIgnoreCase(name)) {
			return col_005();
		}
		if ($col_006.equalsIgnoreCase(name)) {
			return col_006();
		}
		if ($col_007.equalsIgnoreCase(name)) {
			return col_007();
		}
		if ($col_008.equalsIgnoreCase(name)) {
			return col_008();
		}
		if ($col_009.equalsIgnoreCase(name)) {
			return col_009();
		}
		if ($col_010.equalsIgnoreCase(name)) {
			return col_010();
		}
		if ($col_011.equalsIgnoreCase(name)) {
			return col_011();
		}
		if ($col_012.equalsIgnoreCase(name)) {
			return col_012();
		}
		if ($col_013.equalsIgnoreCase(name)) {
			return col_013();
		}
		if ($col_014.equalsIgnoreCase(name)) {
			return col_014();
		}
		if ($col_015.equalsIgnoreCase(name)) {
			return col_015();
		}
		if ($col_016.equalsIgnoreCase(name)) {
			return col_016();
		}
		if ($col_017.equalsIgnoreCase(name)) {
			return col_017();
		}
		if ($col_018.equalsIgnoreCase(name)) {
			return col_018();
		}
		if ($col_019.equalsIgnoreCase(name)) {
			return col_019();
		}
		if ($col_020.equalsIgnoreCase(name)) {
			return col_020();
		}
		if ($col_021.equalsIgnoreCase(name)) {
			return col_021();
		}
		if ($col_022.equalsIgnoreCase(name)) {
			return col_022();
		}
		if ($col_023.equalsIgnoreCase(name)) {
			return col_023();
		}
		if ($col_024.equalsIgnoreCase(name)) {
			return col_024();
		}
		if ($col_025.equalsIgnoreCase(name)) {
			return col_025();
		}
		if ($col_026.equalsIgnoreCase(name)) {
			return col_026();
		}
		if ($col_027.equalsIgnoreCase(name)) {
			return col_027();
		}
		if ($col_028.equalsIgnoreCase(name)) {
			return col_028();
		}
		if ($col_029.equalsIgnoreCase(name)) {
			return col_029();
		}
		if ($col_030.equalsIgnoreCase(name)) {
			return col_030();
		}
		if ($col_031.equalsIgnoreCase(name)) {
			return col_031();
		}
		if ($col_032.equalsIgnoreCase(name)) {
			return col_032();
		}
		if ($col_033.equalsIgnoreCase(name)) {
			return col_033();
		}
		if ($col_034.equalsIgnoreCase(name)) {
			return col_034();
		}
		if ($col_035.equalsIgnoreCase(name)) {
			return col_035();
		}
		if ($col_036.equalsIgnoreCase(name)) {
			return col_036();
		}
		if ($col_037.equalsIgnoreCase(name)) {
			return col_037();
		}
		if ($col_038.equalsIgnoreCase(name)) {
			return col_038();
		}
		if ($col_039.equalsIgnoreCase(name)) {
			return col_039();
		}
		if ($col_040.equalsIgnoreCase(name)) {
			return col_040();
		}
		if ($col_041.equalsIgnoreCase(name)) {
			return col_041();
		}
		if ($col_042.equalsIgnoreCase(name)) {
			return col_042();
		}
		if ($col_043.equalsIgnoreCase(name)) {
			return col_043();
		}
		if ($col_044.equalsIgnoreCase(name)) {
			return col_044();
		}
		if ($col_045.equalsIgnoreCase(name)) {
			return col_045();
		}
		if ($col_046.equalsIgnoreCase(name)) {
			return col_046();
		}
		if ($col_047.equalsIgnoreCase(name)) {
			return col_047();
		}
		if ($col_048.equalsIgnoreCase(name)) {
			return col_048();
		}
		if ($col_049.equalsIgnoreCase(name)) {
			return col_049();
		}
		if ($col_050.equalsIgnoreCase(name)) {
			return col_050();
		}
		if ($col_051.equalsIgnoreCase(name)) {
			return col_051();
		}
		if ($col_052.equalsIgnoreCase(name)) {
			return col_052();
		}
		if ($col_053.equalsIgnoreCase(name)) {
			return col_053();
		}
		if ($col_054.equalsIgnoreCase(name)) {
			return col_054();
		}
		if ($col_055.equalsIgnoreCase(name)) {
			return col_055();
		}
		if ($col_056.equalsIgnoreCase(name)) {
			return col_056();
		}
		if ($col_057.equalsIgnoreCase(name)) {
			return col_057();
		}
		if ($col_058.equalsIgnoreCase(name)) {
			return col_058();
		}
		if ($col_059.equalsIgnoreCase(name)) {
			return col_059();
		}
		if ($col_060.equalsIgnoreCase(name)) {
			return col_060();
		}
		if ($col_061.equalsIgnoreCase(name)) {
			return col_061();
		}
		if ($col_062.equalsIgnoreCase(name)) {
			return col_062();
		}
		if ($col_063.equalsIgnoreCase(name)) {
			return col_063();
		}
		if ($col_064.equalsIgnoreCase(name)) {
			return col_064();
		}
		if ($col_065.equalsIgnoreCase(name)) {
			return col_065();
		}
		if ($col_066.equalsIgnoreCase(name)) {
			return col_066();
		}
		if ($col_067.equalsIgnoreCase(name)) {
			return col_067();
		}
		if ($col_068.equalsIgnoreCase(name)) {
			return col_068();
		}
		if ($col_069.equalsIgnoreCase(name)) {
			return col_069();
		}
		if ($col_070.equalsIgnoreCase(name)) {
			return col_070();
		}
		if ($col_071.equalsIgnoreCase(name)) {
			return col_071();
		}
		if ($col_072.equalsIgnoreCase(name)) {
			return col_072();
		}
		if ($col_073.equalsIgnoreCase(name)) {
			return col_073();
		}
		if ($col_074.equalsIgnoreCase(name)) {
			return col_074();
		}
		if ($col_075.equalsIgnoreCase(name)) {
			return col_075();
		}
		if ($col_076.equalsIgnoreCase(name)) {
			return col_076();
		}
		if ($col_077.equalsIgnoreCase(name)) {
			return col_077();
		}
		if ($col_078.equalsIgnoreCase(name)) {
			return col_078();
		}
		if ($col_079.equalsIgnoreCase(name)) {
			return col_079();
		}
		if ($col_080.equalsIgnoreCase(name)) {
			return col_080();
		}
		if ($col_081.equalsIgnoreCase(name)) {
			return col_081();
		}
		if ($col_082.equalsIgnoreCase(name)) {
			return col_082();
		}
		if ($col_083.equalsIgnoreCase(name)) {
			return col_083();
		}
		if ($col_084.equalsIgnoreCase(name)) {
			return col_084();
		}
		if ($col_085.equalsIgnoreCase(name)) {
			return col_085();
		}
		if ($col_086.equalsIgnoreCase(name)) {
			return col_086();
		}
		if ($col_087.equalsIgnoreCase(name)) {
			return col_087();
		}
		if ($col_088.equalsIgnoreCase(name)) {
			return col_088();
		}
		if ($col_089.equalsIgnoreCase(name)) {
			return col_089();
		}
		if ($col_090.equalsIgnoreCase(name)) {
			return col_090();
		}
		if ($col_091.equalsIgnoreCase(name)) {
			return col_091();
		}
		if ($col_092.equalsIgnoreCase(name)) {
			return col_092();
		}
		if ($col_093.equalsIgnoreCase(name)) {
			return col_093();
		}
		if ($col_094.equalsIgnoreCase(name)) {
			return col_094();
		}
		if ($col_095.equalsIgnoreCase(name)) {
			return col_095();
		}
		if ($col_096.equalsIgnoreCase(name)) {
			return col_096();
		}
		if ($col_097.equalsIgnoreCase(name)) {
			return col_097();
		}
		if ($col_098.equalsIgnoreCase(name)) {
			return col_098();
		}
		if ($col_099.equalsIgnoreCase(name)) {
			return col_099();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($eval_loop_flg.equalsIgnoreCase(name)) {
			return eval_loop_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($act_id.equalsIgnoreCase(name)) {
			act_id(value);
			return;
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			act_id_sub(value);
			return;
		}
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
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			par_itm_jnl_cd(value);
			return;
		}
		if ($par_itm_jnl_nm.equalsIgnoreCase(name)) {
			par_itm_jnl_nm(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($inpt_dpt_cd.equalsIgnoreCase(name)) {
			inpt_dpt_cd(value);
			return;
		}
		if ($inpt_dpt_nm.equalsIgnoreCase(name)) {
			inpt_dpt_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
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
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			cost_io_typ(value);
			return;
		}
		if ($cost_io_typ_nm.equalsIgnoreCase(name)) {
			cost_io_typ_nm(value);
			return;
		}
		if ($other_wg_cd.equalsIgnoreCase(name)) {
			other_wg_cd(value);
			return;
		}
		if ($other_wg_nm.equalsIgnoreCase(name)) {
			other_wg_nm(value);
			return;
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			other_dpt_cd(value);
			return;
		}
		if ($other_dpt_nm.equalsIgnoreCase(name)) {
			other_dpt_nm(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($sls_trd_cur_cd.equalsIgnoreCase(name)) {
			sls_trd_cur_cd(value);
			return;
		}
		if ($sls_trd_cur_nm.equalsIgnoreCase(name)) {
			sls_trd_cur_nm(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			sls_usr_nm(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($trd_grp.equalsIgnoreCase(name)) {
			trd_grp(value);
			return;
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			alc_dpt_nm(value);
			return;
		}
		if ($cost_sls_cd1.equalsIgnoreCase(name)) {
			cost_sls_cd1(value);
			return;
		}
		if ($cost_sls_nm1.equalsIgnoreCase(name)) {
			cost_sls_nm1(value);
			return;
		}
		if ($cost_sls_cd2.equalsIgnoreCase(name)) {
			cost_sls_cd2(value);
			return;
		}
		if ($cost_sls_nm2.equalsIgnoreCase(name)) {
			cost_sls_nm2(value);
			return;
		}
		if ($cost_sls_cd3.equalsIgnoreCase(name)) {
			cost_sls_cd3(value);
			return;
		}
		if ($cost_sls_nm3.equalsIgnoreCase(name)) {
			cost_sls_nm3(value);
			return;
		}
		if ($cost_sls_cd4.equalsIgnoreCase(name)) {
			cost_sls_cd4(value);
			return;
		}
		if ($cost_sls_nm4.equalsIgnoreCase(name)) {
			cost_sls_nm4(value);
			return;
		}
		if ($cost_sls_cd5.equalsIgnoreCase(name)) {
			cost_sls_cd5(value);
			return;
		}
		if ($cost_sls_nm5.equalsIgnoreCase(name)) {
			cost_sls_nm5(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			ac_slip_typ_nm(value);
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
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			rec_eval_typ(value);
			return;
		}
		if ($rec_eval_typ_nm.equalsIgnoreCase(name)) {
			rec_eval_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($sls_trd_amt_dec_place.equalsIgnoreCase(name)) {
			sls_trd_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($sls_trd_amt_dec_place.equalsIgnoreCase(name)) {
			sls_trd_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($sls_trd_amt_dec_place.equalsIgnoreCase(name)) {
			sls_trd_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($sls_trd_amt_dec_place.equalsIgnoreCase(name)) {
			sls_trd_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($sls_trd_amt_dec_place.equalsIgnoreCase(name)) {
			sls_trd_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($eval_loop_flg.equalsIgnoreCase(name)) {
			eval_loop_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($act_id.equalsIgnoreCase(name)) {
			act_id(value);
			return;
		}
		if ($act_id_sub.equalsIgnoreCase(name)) {
			act_id_sub(value);
			return;
		}
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
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			par_itm_jnl_cd(value);
			return;
		}
		if ($par_itm_jnl_nm.equalsIgnoreCase(name)) {
			par_itm_jnl_nm(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($inpt_dpt_cd.equalsIgnoreCase(name)) {
			inpt_dpt_cd(value);
			return;
		}
		if ($inpt_dpt_nm.equalsIgnoreCase(name)) {
			inpt_dpt_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
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
		if ($cost_io_typ.equalsIgnoreCase(name)) {
			cost_io_typ(value);
			return;
		}
		if ($cost_io_typ_nm.equalsIgnoreCase(name)) {
			cost_io_typ_nm(value);
			return;
		}
		if ($other_wg_cd.equalsIgnoreCase(name)) {
			other_wg_cd(value);
			return;
		}
		if ($other_wg_nm.equalsIgnoreCase(name)) {
			other_wg_nm(value);
			return;
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			other_dpt_cd(value);
			return;
		}
		if ($other_dpt_nm.equalsIgnoreCase(name)) {
			other_dpt_nm(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($sls_trd_cur_cd.equalsIgnoreCase(name)) {
			sls_trd_cur_cd(value);
			return;
		}
		if ($sls_trd_cur_nm.equalsIgnoreCase(name)) {
			sls_trd_cur_nm(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			sls_usr_nm(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($trd_grp.equalsIgnoreCase(name)) {
			trd_grp(value);
			return;
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			alc_dpt_nm(value);
			return;
		}
		if ($cost_sls_cd1.equalsIgnoreCase(name)) {
			cost_sls_cd1(value);
			return;
		}
		if ($cost_sls_nm1.equalsIgnoreCase(name)) {
			cost_sls_nm1(value);
			return;
		}
		if ($cost_sls_cd2.equalsIgnoreCase(name)) {
			cost_sls_cd2(value);
			return;
		}
		if ($cost_sls_nm2.equalsIgnoreCase(name)) {
			cost_sls_nm2(value);
			return;
		}
		if ($cost_sls_cd3.equalsIgnoreCase(name)) {
			cost_sls_cd3(value);
			return;
		}
		if ($cost_sls_nm3.equalsIgnoreCase(name)) {
			cost_sls_nm3(value);
			return;
		}
		if ($cost_sls_cd4.equalsIgnoreCase(name)) {
			cost_sls_cd4(value);
			return;
		}
		if ($cost_sls_nm4.equalsIgnoreCase(name)) {
			cost_sls_nm4(value);
			return;
		}
		if ($cost_sls_cd5.equalsIgnoreCase(name)) {
			cost_sls_cd5(value);
			return;
		}
		if ($cost_sls_nm5.equalsIgnoreCase(name)) {
			cost_sls_nm5(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			ac_slip_typ_nm(value);
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
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			rec_eval_typ(value);
			return;
		}
		if ($rec_eval_typ_nm.equalsIgnoreCase(name)) {
			rec_eval_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($sls_trd_amt_dec_place.equalsIgnoreCase(name)) {
			sls_trd_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($sls_trd_amt_dec_place.equalsIgnoreCase(name)) {
			sls_trd_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($sls_trd_amt_dec_place.equalsIgnoreCase(name)) {
			sls_trd_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($sls_trd_amt_dec_place.equalsIgnoreCase(name)) {
			sls_trd_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($sls_trd_amt_dec_place.equalsIgnoreCase(name)) {
			sls_trd_amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($trd_ratio.equalsIgnoreCase(name)) {
			trd_ratio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_000.equalsIgnoreCase(name)) {
			col_000(value);
			return;
		}
		if ($col_001.equalsIgnoreCase(name)) {
			col_001(value);
			return;
		}
		if ($col_002.equalsIgnoreCase(name)) {
			col_002(value);
			return;
		}
		if ($col_003.equalsIgnoreCase(name)) {
			col_003(value);
			return;
		}
		if ($col_004.equalsIgnoreCase(name)) {
			col_004(value);
			return;
		}
		if ($col_005.equalsIgnoreCase(name)) {
			col_005(value);
			return;
		}
		if ($col_006.equalsIgnoreCase(name)) {
			col_006(value);
			return;
		}
		if ($col_007.equalsIgnoreCase(name)) {
			col_007(value);
			return;
		}
		if ($col_008.equalsIgnoreCase(name)) {
			col_008(value);
			return;
		}
		if ($col_009.equalsIgnoreCase(name)) {
			col_009(value);
			return;
		}
		if ($col_010.equalsIgnoreCase(name)) {
			col_010(value);
			return;
		}
		if ($col_011.equalsIgnoreCase(name)) {
			col_011(value);
			return;
		}
		if ($col_012.equalsIgnoreCase(name)) {
			col_012(value);
			return;
		}
		if ($col_013.equalsIgnoreCase(name)) {
			col_013(value);
			return;
		}
		if ($col_014.equalsIgnoreCase(name)) {
			col_014(value);
			return;
		}
		if ($col_015.equalsIgnoreCase(name)) {
			col_015(value);
			return;
		}
		if ($col_016.equalsIgnoreCase(name)) {
			col_016(value);
			return;
		}
		if ($col_017.equalsIgnoreCase(name)) {
			col_017(value);
			return;
		}
		if ($col_018.equalsIgnoreCase(name)) {
			col_018(value);
			return;
		}
		if ($col_019.equalsIgnoreCase(name)) {
			col_019(value);
			return;
		}
		if ($col_020.equalsIgnoreCase(name)) {
			col_020(value);
			return;
		}
		if ($col_021.equalsIgnoreCase(name)) {
			col_021(value);
			return;
		}
		if ($col_022.equalsIgnoreCase(name)) {
			col_022(value);
			return;
		}
		if ($col_023.equalsIgnoreCase(name)) {
			col_023(value);
			return;
		}
		if ($col_024.equalsIgnoreCase(name)) {
			col_024(value);
			return;
		}
		if ($col_025.equalsIgnoreCase(name)) {
			col_025(value);
			return;
		}
		if ($col_026.equalsIgnoreCase(name)) {
			col_026(value);
			return;
		}
		if ($col_027.equalsIgnoreCase(name)) {
			col_027(value);
			return;
		}
		if ($col_028.equalsIgnoreCase(name)) {
			col_028(value);
			return;
		}
		if ($col_029.equalsIgnoreCase(name)) {
			col_029(value);
			return;
		}
		if ($col_030.equalsIgnoreCase(name)) {
			col_030(value);
			return;
		}
		if ($col_031.equalsIgnoreCase(name)) {
			col_031(value);
			return;
		}
		if ($col_032.equalsIgnoreCase(name)) {
			col_032(value);
			return;
		}
		if ($col_033.equalsIgnoreCase(name)) {
			col_033(value);
			return;
		}
		if ($col_034.equalsIgnoreCase(name)) {
			col_034(value);
			return;
		}
		if ($col_035.equalsIgnoreCase(name)) {
			col_035(value);
			return;
		}
		if ($col_036.equalsIgnoreCase(name)) {
			col_036(value);
			return;
		}
		if ($col_037.equalsIgnoreCase(name)) {
			col_037(value);
			return;
		}
		if ($col_038.equalsIgnoreCase(name)) {
			col_038(value);
			return;
		}
		if ($col_039.equalsIgnoreCase(name)) {
			col_039(value);
			return;
		}
		if ($col_040.equalsIgnoreCase(name)) {
			col_040(value);
			return;
		}
		if ($col_041.equalsIgnoreCase(name)) {
			col_041(value);
			return;
		}
		if ($col_042.equalsIgnoreCase(name)) {
			col_042(value);
			return;
		}
		if ($col_043.equalsIgnoreCase(name)) {
			col_043(value);
			return;
		}
		if ($col_044.equalsIgnoreCase(name)) {
			col_044(value);
			return;
		}
		if ($col_045.equalsIgnoreCase(name)) {
			col_045(value);
			return;
		}
		if ($col_046.equalsIgnoreCase(name)) {
			col_046(value);
			return;
		}
		if ($col_047.equalsIgnoreCase(name)) {
			col_047(value);
			return;
		}
		if ($col_048.equalsIgnoreCase(name)) {
			col_048(value);
			return;
		}
		if ($col_049.equalsIgnoreCase(name)) {
			col_049(value);
			return;
		}
		if ($col_050.equalsIgnoreCase(name)) {
			col_050(value);
			return;
		}
		if ($col_051.equalsIgnoreCase(name)) {
			col_051(value);
			return;
		}
		if ($col_052.equalsIgnoreCase(name)) {
			col_052(value);
			return;
		}
		if ($col_053.equalsIgnoreCase(name)) {
			col_053(value);
			return;
		}
		if ($col_054.equalsIgnoreCase(name)) {
			col_054(value);
			return;
		}
		if ($col_055.equalsIgnoreCase(name)) {
			col_055(value);
			return;
		}
		if ($col_056.equalsIgnoreCase(name)) {
			col_056(value);
			return;
		}
		if ($col_057.equalsIgnoreCase(name)) {
			col_057(value);
			return;
		}
		if ($col_058.equalsIgnoreCase(name)) {
			col_058(value);
			return;
		}
		if ($col_059.equalsIgnoreCase(name)) {
			col_059(value);
			return;
		}
		if ($col_060.equalsIgnoreCase(name)) {
			col_060(value);
			return;
		}
		if ($col_061.equalsIgnoreCase(name)) {
			col_061(value);
			return;
		}
		if ($col_062.equalsIgnoreCase(name)) {
			col_062(value);
			return;
		}
		if ($col_063.equalsIgnoreCase(name)) {
			col_063(value);
			return;
		}
		if ($col_064.equalsIgnoreCase(name)) {
			col_064(value);
			return;
		}
		if ($col_065.equalsIgnoreCase(name)) {
			col_065(value);
			return;
		}
		if ($col_066.equalsIgnoreCase(name)) {
			col_066(value);
			return;
		}
		if ($col_067.equalsIgnoreCase(name)) {
			col_067(value);
			return;
		}
		if ($col_068.equalsIgnoreCase(name)) {
			col_068(value);
			return;
		}
		if ($col_069.equalsIgnoreCase(name)) {
			col_069(value);
			return;
		}
		if ($col_070.equalsIgnoreCase(name)) {
			col_070(value);
			return;
		}
		if ($col_071.equalsIgnoreCase(name)) {
			col_071(value);
			return;
		}
		if ($col_072.equalsIgnoreCase(name)) {
			col_072(value);
			return;
		}
		if ($col_073.equalsIgnoreCase(name)) {
			col_073(value);
			return;
		}
		if ($col_074.equalsIgnoreCase(name)) {
			col_074(value);
			return;
		}
		if ($col_075.equalsIgnoreCase(name)) {
			col_075(value);
			return;
		}
		if ($col_076.equalsIgnoreCase(name)) {
			col_076(value);
			return;
		}
		if ($col_077.equalsIgnoreCase(name)) {
			col_077(value);
			return;
		}
		if ($col_078.equalsIgnoreCase(name)) {
			col_078(value);
			return;
		}
		if ($col_079.equalsIgnoreCase(name)) {
			col_079(value);
			return;
		}
		if ($col_080.equalsIgnoreCase(name)) {
			col_080(value);
			return;
		}
		if ($col_081.equalsIgnoreCase(name)) {
			col_081(value);
			return;
		}
		if ($col_082.equalsIgnoreCase(name)) {
			col_082(value);
			return;
		}
		if ($col_083.equalsIgnoreCase(name)) {
			col_083(value);
			return;
		}
		if ($col_084.equalsIgnoreCase(name)) {
			col_084(value);
			return;
		}
		if ($col_085.equalsIgnoreCase(name)) {
			col_085(value);
			return;
		}
		if ($col_086.equalsIgnoreCase(name)) {
			col_086(value);
			return;
		}
		if ($col_087.equalsIgnoreCase(name)) {
			col_087(value);
			return;
		}
		if ($col_088.equalsIgnoreCase(name)) {
			col_088(value);
			return;
		}
		if ($col_089.equalsIgnoreCase(name)) {
			col_089(value);
			return;
		}
		if ($col_090.equalsIgnoreCase(name)) {
			col_090(value);
			return;
		}
		if ($col_091.equalsIgnoreCase(name)) {
			col_091(value);
			return;
		}
		if ($col_092.equalsIgnoreCase(name)) {
			col_092(value);
			return;
		}
		if ($col_093.equalsIgnoreCase(name)) {
			col_093(value);
			return;
		}
		if ($col_094.equalsIgnoreCase(name)) {
			col_094(value);
			return;
		}
		if ($col_095.equalsIgnoreCase(name)) {
			col_095(value);
			return;
		}
		if ($col_096.equalsIgnoreCase(name)) {
			col_096(value);
			return;
		}
		if ($col_097.equalsIgnoreCase(name)) {
			col_097(value);
			return;
		}
		if ($col_098.equalsIgnoreCase(name)) {
			col_098(value);
			return;
		}
		if ($col_099.equalsIgnoreCase(name)) {
			col_099(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($eval_loop_flg.equalsIgnoreCase(name)) {
			eval_loop_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($trd_amt_p.equalsIgnoreCase(name)) {
			return trd_amt_p();
		}
		if ($amt_p.equalsIgnoreCase(name)) {
			return amt_p();
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			return qty_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($trd_amt_p.equalsIgnoreCase(name)) {
			trd_amt_p(
				((MCContainerMeta) trd_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($amt_p.equalsIgnoreCase(name)) {
			amt_p(
				((MCContainerMeta) amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			qty_p(
				((MCContainerMeta) qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return par_itm_p().itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		par_itm_p().itm_cd(value);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return par_itm_p().itm_sub1();
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		par_itm_p().itm_sub1(value);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return par_itm_p().itm_sub2();
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		par_itm_p().itm_sub2(value);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return par_itm_p().itm_sub3();
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		par_itm_p().itm_sub3(value);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return par_itm_p().itm_nm();
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		par_itm_p().itm_nm(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return itm_p().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return itm_p().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber sls_trd_cur_amt() {
		return trd_amt_p().amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void sls_trd_cur_amt(MCNumber value) {
		trd_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void sls_trd_cur_amt(int value) {
		trd_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void sls_trd_cur_amt(long value) {
		trd_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void sls_trd_cur_amt(float value) {
		trd_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void sls_trd_cur_amt(double value) {
		trd_amt_p().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return amt_p().amt();
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		amt_p().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void sls_amt(int value) {
		amt_p().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void sls_amt(long value) {
		amt_p().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void sls_amt(float value) {
		amt_p().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void sls_amt(double value) {
		amt_p().amt(value);
	}

	public MCNumber qty() {
		return qty_p().qty();
	}

	public void qty(MCNumber value) {
		qty_p().qty(value);
	}

	public void qty(int value) {
		qty_p().qty(value);
	}

	public void qty(long value) {
		qty_p().qty(value);
	}

	public void qty(float value) {
		qty_p().qty(value);
	}

	public void qty(double value) {
		qty_p().qty(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

}

