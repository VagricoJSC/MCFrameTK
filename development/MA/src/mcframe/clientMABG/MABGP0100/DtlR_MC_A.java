package mcframe.clientMABG.MABGP0100;

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
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public static final String $calc_ptn_cd = "calc_ptn_cd";
	/**
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public static final String $calc_ptn_nm_lcl = "calc_ptn_nm_lcl";
	/**
	 * Standard calculation pattern name 標準計算パタン名.<p>
	 *
	 */
	public static final String $calc_ptn_nm = "calc_ptn_nm";
	/**
	 * Mfg. purchase type 製造購買区分.<p>
	 *
	 */
	public static final String $mfg_purc_typ = "mfg_purc_typ";
	/**
	 * Mfg. purchase type name 製造購買区分名.<p>
	 *
	 */
	public static final String $mfg_purc_typ_nm = "mfg_purc_typ_nm";
	/**
	 * Amount evaluation type 金額評価区分.<p>
	 *
	 */
	public static final String $eval_typ = "eval_typ";
	/**
	 * Amount evaluation type name 金額評価区分名.<p>
	 *
	 */
	public static final String $eval_typ_nm = "eval_typ_nm";
	/**
	 * Dept. calculation type 部門計算区分.<p>
	 *
	 */
	public static final String $dpt_typ = "dpt_typ";
	/**
	 * Dept. calculation type name 部門計算区分名.<p>
	 *
	 */
	public static final String $dpt_typ_nm = "dpt_typ_nm";
	/**
	 * Lot No. calculation type ロットＮＯ計算区分.<p>
	 *
	 */
	public static final String $lot_typ = "lot_typ";
	/**
	 * Lot No. calculation type name ロットＮＯ計算区分名.<p>
	 *
	 */
	public static final String $lot_typ_nm = "lot_typ_nm";
	/**
	 * Sublot No. calculation type サブロットＮＯ計算区分.<p>
	 *
	 */
	public static final String $sublot_typ = "sublot_typ";
	/**
	 * Sublot No. calculation type name サブロットＮＯ計算区分名.<p>
	 *
	 */
	public static final String $sublot_typ_nm = "sublot_typ_nm";
	/**
	 * SEIBAN No. 1 calculation type 手配ＮＯ１計算区分.<p>
	 *
	 */
	public static final String $sno1_typ = "sno1_typ";
	/**
	 * SEIBAN No. 1 calculation type name 手配ＮＯ１計算区分名.<p>
	 *
	 */
	public static final String $sno1_typ_nm = "sno1_typ_nm";
	/**
	 * SEIBAN No. 2 calculation type 手配ＮＯ２計算区分.<p>
	 *
	 */
	public static final String $sno2_typ = "sno2_typ";
	/**
	 * SEIBAN No. 2 calculation type name 手配ＮＯ２計算区分名.<p>
	 *
	 */
	public static final String $sno2_typ_nm = "sno2_typ_nm";
	/**
	 * SEIBAN No. 3 calculation type 手配ＮＯ３計算区分.<p>
	 *
	 */
	public static final String $sno3_typ = "sno3_typ";
	/**
	 * SEIBAN No. 3 calculation type name 手配ＮＯ３計算区分名.<p>
	 *
	 */
	public static final String $sno3_typ_nm = "sno3_typ_nm";
	/**
	 * SEIBAN No. 4 calculation type 手配ＮＯ４計算区分.<p>
	 *
	 */
	public static final String $sno4_typ = "sno4_typ";
	/**
	 * SEIBAN No. 4 calculation type name 手配ＮＯ４計算区分名.<p>
	 *
	 */
	public static final String $sno4_typ_nm = "sno4_typ_nm";
	/**
	 * Lot No. result type ロットＮＯ実績区分.<p>
	 *
	 */
	public static final String $lot_act_typ = "lot_act_typ";
	/**
	 * Lot No. result type name ロットＮＯ実績区分名.<p>
	 *
	 */
	public static final String $lot_act_typ_nm = "lot_act_typ_nm";
	/**
	 * Sublot No. result type サブロットＮＯ実績区分.<p>
	 *
	 */
	public static final String $sublot_act_typ = "sublot_act_typ";
	/**
	 * Sublot No. result type name サブロットＮＯ実績区分名.<p>
	 *
	 */
	public static final String $sublot_act_typ_nm = "sublot_act_typ_nm";
	/**
	 * SEIBAN No. 1 result type 手配ＮＯ１実績区分.<p>
	 *
	 */
	public static final String $sno1_act_typ = "sno1_act_typ";
	/**
	 * SEIBAN No. 1 result type name 手配ＮＯ１実績区分名.<p>
	 *
	 */
	public static final String $sno1_act_typ_nm = "sno1_act_typ_nm";
	/**
	 * SEIBAN No. 2 result type 手配ＮＯ２実績区分.<p>
	 *
	 */
	public static final String $sno2_act_typ = "sno2_act_typ";
	/**
	 * SEIBAN No. 2 result type name 手配ＮＯ２実績区分名.<p>
	 *
	 */
	public static final String $sno2_act_typ_nm = "sno2_act_typ_nm";
	/**
	 * SEIBAN No. 3 result type 手配ＮＯ３実績区分.<p>
	 *
	 */
	public static final String $sno3_act_typ = "sno3_act_typ";
	/**
	 * SEIBAN No. 3 result type name 手配ＮＯ３実績区分名.<p>
	 *
	 */
	public static final String $sno3_act_typ_nm = "sno3_act_typ_nm";
	/**
	 * SEIBAN No. 4 result type 手配ＮＯ４実績区分.<p>
	 *
	 */
	public static final String $sno4_act_typ = "sno4_act_typ";
	/**
	 * SEIBAN No. 4 result type name 手配ＮＯ４実績区分名.<p>
	 *
	 */
	public static final String $sno4_act_typ_nm = "sno4_act_typ_nm";
	/**
	 * Item mfg. order No. setting type 品目製造指図ＮＯ設定区分.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no_set_typ = "itm_mfg_inst_no_set_typ";
	/**
	 * Item mfg. order No. setting type name 品目製造指図ＮＯ設定区分名.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no_set_typ_nm = "itm_mfg_inst_no_set_typ_nm";
	/**
	 * Mfg. result No. setting type 製造実績ＮＯ設定区分.<p>
	 *
	 */
	public static final String $mfg_act_no_set_typ = "mfg_act_no_set_typ";
	/**
	 * Mfg. result No. setting type name 製造実績ＮＯ設定区分名.<p>
	 *
	 */
	public static final String $mfg_act_no_set_typ_nm = "mfg_act_no_set_typ_nm";
	/**
	 * Operation result No. setting type 工程実績ＮＯ設定区分.<p>
	 *
	 */
	public static final String $oper_act_no_set_typ = "oper_act_no_set_typ";
	/**
	 * Operation result No. setting type name 工程実績ＮＯ設定区分名.<p>
	 *
	 */
	public static final String $oper_act_no_set_typ_nm = "oper_act_no_set_typ_nm";
	/**
	 * Lot No. explosion type ロットＮＯ展開区分.<p>
	 *
	 */
	public static final String $lot_exp_typ = "lot_exp_typ";
	/**
	 * Lot No. explosion type name ロットＮＯ展開区分名.<p>
	 *
	 */
	public static final String $lot_exp_typ_nm = "lot_exp_typ_nm";
	/**
	 * Sublot No. explosion type サブロットＮＯ展開区分.<p>
	 *
	 */
	public static final String $sublot_exp_typ = "sublot_exp_typ";
	/**
	 * Sublot No. explosion type name サブロットＮＯ展開区分名.<p>
	 *
	 */
	public static final String $sublot_exp_typ_nm = "sublot_exp_typ_nm";
	/**
	 * SEIBAN No. 1 explosion type 手配ＮＯ１展開区分.<p>
	 *
	 */
	public static final String $sno1_exp_typ = "sno1_exp_typ";
	/**
	 * SEIBAN No. 1 explosion type name 手配ＮＯ１展開区分名.<p>
	 *
	 */
	public static final String $sno1_exp_typ_nm = "sno1_exp_typ_nm";
	/**
	 * SEIBAN No. 2 explosion type 手配ＮＯ２展開区分.<p>
	 *
	 */
	public static final String $sno2_exp_typ = "sno2_exp_typ";
	/**
	 * SEIBAN No. 2 explosion type name 手配ＮＯ２展開区分名.<p>
	 *
	 */
	public static final String $sno2_exp_typ_nm = "sno2_exp_typ_nm";
	/**
	 * SEIBAN No. 3 explosion type 手配ＮＯ３展開区分.<p>
	 *
	 */
	public static final String $sno3_exp_typ = "sno3_exp_typ";
	/**
	 * SEIBAN No. 3 explosion type name 手配ＮＯ３展開区分名.<p>
	 *
	 */
	public static final String $sno3_exp_typ_nm = "sno3_exp_typ_nm";
	/**
	 * SEIBAN No. 4 explosion type 手配ＮＯ４展開区分.<p>
	 *
	 */
	public static final String $sno4_exp_typ = "sno4_exp_typ";
	/**
	 * SEIBAN No. 4 explosion type name 手配ＮＯ４展開区分名.<p>
	 *
	 */
	public static final String $sno4_exp_typ_nm = "sno4_exp_typ_nm";
	/**
	 * Management dept. evaluation type 管理部門評価区分.<p>
	 *
	 */
	public static final String $dpt_loss_eval_typ = "dpt_loss_eval_typ";
	/**
	 * Management dept. evaluation type name 管理部門評価区分名.<p>
	 *
	 */
	public static final String $dpt_loss_eval_typ_nm = "dpt_loss_eval_typ_nm";
	/**
	 * Lot No. evaluation type ロットＮＯ評価区分.<p>
	 *
	 */
	public static final String $lot_loss_eval_typ = "lot_loss_eval_typ";
	/**
	 * Lot No. evaluation type name ロットＮＯ評価区分 名.<p>
	 *
	 */
	public static final String $lot_loss_eval_typ_nm = "lot_loss_eval_typ_nm";
	/**
	 * Sublot No. revaluation type サブロットＮＯ評価区分.<p>
	 *
	 */
	public static final String $sublot_loss_eval_typ = "sublot_loss_eval_typ";
	/**
	 * Sublot No. evaluation type name サブロットＮＯ評価区分名.<p>
	 *
	 */
	public static final String $sublot_loss_eval_typ_nm = "sublot_loss_eval_typ_nm";
	/**
	 * SEIBAN No. 1 evaluation type 手配ＮＯ１評価区分.<p>
	 *
	 */
	public static final String $sno1_loss_eval_typ = "sno1_loss_eval_typ";
	/**
	 * SEIBAN No. 1 evaluation type name 手配ＮＯ１評価区分名.<p>
	 *
	 */
	public static final String $sno1_loss_eval_typ_nm = "sno1_loss_eval_typ_nm";
	/**
	 * SEIBAN No. 2 evaluation type 手配ＮＯ２評価区分.<p>
	 *
	 */
	public static final String $sno2_loss_eval_typ = "sno2_loss_eval_typ";
	/**
	 * SEIBAN No. 2 evaluation type name 手配ＮＯ２評価区分名.<p>
	 *
	 */
	public static final String $sno2_loss_eval_typ_nm = "sno2_loss_eval_typ_nm";
	/**
	 * SEIBAN No. 3 evaluation type 手配ＮＯ３評価区分.<p>
	 *
	 */
	public static final String $sno3_loss_eval_typ = "sno3_loss_eval_typ";
	/**
	 * SEIBAN No. 3 evaluation type name 手配ＮＯ３評価区分名.<p>
	 *
	 */
	public static final String $sno3_loss_eval_typ_nm = "sno3_loss_eval_typ_nm";
	/**
	 * SEIBAN No. 4 evaluation type 手配ＮＯ４評価区分.<p>
	 *
	 */
	public static final String $sno4_loss_eval_typ = "sno4_loss_eval_typ";
	/**
	 * SEIBAN No. 4 evaluation type name 手配ＮＯ４評価区分名.<p>
	 *
	 */
	public static final String $sno4_loss_eval_typ_nm = "sno4_loss_eval_typ_nm";
	/**
	 * Asset type evaluation type 資産区分評価区分.<p>
	 *
	 */
	public static final String $asst_loss_eval_typ = "asst_loss_eval_typ";
	/**
	 * Asset type evaluation type name 資産区分評価区分名.<p>
	 *
	 */
	public static final String $asst_loss_eval_typ_nm = "asst_loss_eval_typ_nm";
	/**
	 * Rounding type (Standard) 標準端数処理区分.<p>
	 *
	 */
	public static final String $std_rnd_typ = "std_rnd_typ";
	/**
	 * Rounding type name (Standard) 標準端数処理区分名.<p>
	 *
	 */
	public static final String $std_rnd_typ_nm = "std_rnd_typ_nm";
	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public static final String $std_dec_place = "std_dec_place";
	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public static final String $ave_rnd_typ = "ave_rnd_typ";
	/**
	 * Rounding type name (Unit price) 単価端数処理区分名.<p>
	 *
	 */
	public static final String $ave_rnd_typ_nm = "ave_rnd_typ_nm";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $ave_dec_place = "ave_dec_place";
	/**
	 * Fraction adjustment type 端数調整区分.<p>
	 *
	 */
	public static final String $adj_typ = "adj_typ";
	/**
	 * Fraction adjustment type name 端数調整区分名.<p>
	 *
	 */
	public static final String $adj_typ_nm = "adj_typ_nm";
	/**
	 * WIP type 仕掛区分.<p>
	 *
	 */
	public static final String $wip_typ = "wip_typ";
	/**
	 * WIP type name 仕掛区分名.<p>
	 *
	 */
	public static final String $wip_typ_nm = "wip_typ_nm";
	/**
	 * Breakdown aggregated type 内訳集計区分.<p>
	 *
	 */
	public static final String $bd_agg_typ = "bd_agg_typ";
	/**
	 * Aggregated breakdown type name 内訳集計区分名.<p>
	 *
	 */
	public static final String $bd_agg_typ_nm = "bd_agg_typ_nm";
	/**
	 * Adjustment cost element cd. 調整費目ＣＤ.<p>
	 *
	 */
	public static final String $mrgn_expns_cd = "mrgn_expns_cd";
	/**
	 * Adjustment cost element name 調整費目名.<p>
	 *
	 */
	public static final String $mrgn_expns_nm = "mrgn_expns_nm";
	/**
	 * Purchase cost element item cd. 購買費目ＣＤ.<p>
	 *
	 */
	public static final String $purc_expns_cd = "purc_expns_cd";
	/**
	 * Purchase cost element name 購買費目名.<p>
	 *
	 */
	public static final String $purc_expns_nm = "purc_expns_nm";
	/**
	 * Subcontract cost element cd. 外注費目ＣＤ.<p>
	 *
	 */
	public static final String $out_expns_cd = "out_expns_cd";
	/**
	 * Subcontract cost element name 外注費目名.<p>
	 *
	 */
	public static final String $out_expns_nm = "out_expns_nm";
	/**
	 * Input cost element cd. 投入費目ＣＤ.<p>
	 *
	 */
	public static final String $inpt_expns_cd = "inpt_expns_cd";
	/**
	 * Input cost element name 投入費目名.<p>
	 *
	 */
	public static final String $inpt_expns_nm = "inpt_expns_nm";
	/**
	 * Self supply cost element cd. 自給費目ＣＤ.<p>
	 *
	 */
	public static final String $ss_expns_cd = "ss_expns_cd";
	/**
	 * Self supply cost element name 自給費目名.<p>
	 *
	 */
	public static final String $ss_expns_nm = "ss_expns_nm";
	/**
	 * Cost element cd. for gain or loss of chargeable item 有償差額費目ＣＤ.<p>
	 *
	 */
	public static final String $prov_expns_cd = "prov_expns_cd";
	/**
	 * Gain or loss of chargeable supply cost element name 有償差額費目名.<p>
	 *
	 */
	public static final String $prov_expns_nm = "prov_expns_nm";
	/**
	 * Explosion allocation type 展開割付区分.<p>
	 *
	 */
	public static final String $exp_alloc_typ = "exp_alloc_typ";
	/**
	 * Explosion allocation type name 展開割付区分名.<p>
	 *
	 */
	public static final String $exp_alloc_typ_nm = "exp_alloc_typ_nm";
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


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_ptn_cd_META = createCommonMeta($calc_ptn_cd, mcframe.commonMA.meta.MA_META.CALC_PTN_CD);
	public static final MCMeta calc_ptn_nm_lcl_META = createCommonMeta($calc_ptn_nm_lcl, mcframe.commonMA.meta.MA_META.CALC_PTN_NM);
	public static final MCMeta calc_ptn_nm_META = createCommonMeta($calc_ptn_nm, mcframe.commonMA.meta.MA_META.CALC_PTN_NM);
	public static final MCMeta mfg_purc_typ_META = createCommonMeta($mfg_purc_typ, mcframe.commonMA.meta.MA_META.MFG_PURC_TYP);
	public static final MCMeta mfg_purc_typ_nm_META = createCommonMeta($mfg_purc_typ_nm, mcframe.commonMA.meta.MA_META.MFG_PURC_TYP_NM);
	public static final MCMeta eval_typ_META = createCommonMeta($eval_typ, mcframe.commonMA.meta.MA_META.EVAL_TYP);
	public static final MCMeta eval_typ_nm_META = createCommonMeta($eval_typ_nm, mcframe.commonMA.meta.MA_META.EVAL_TYP_NM);
	public static final MCMeta dpt_typ_META = createCommonMeta($dpt_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta dpt_typ_nm_META = createCommonMeta($dpt_typ_nm, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP_NM);
	public static final MCMeta lot_typ_META = createCommonMeta($lot_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta lot_typ_nm_META = createCommonMeta($lot_typ_nm, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP_NM);
	public static final MCMeta sublot_typ_META = createCommonMeta($sublot_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sublot_typ_nm_META = createCommonMeta($sublot_typ_nm, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP_NM);
	public static final MCMeta sno1_typ_META = createCommonMeta($sno1_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sno1_typ_nm_META = createCommonMeta($sno1_typ_nm, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP_NM);
	public static final MCMeta sno2_typ_META = createCommonMeta($sno2_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sno2_typ_nm_META = createCommonMeta($sno2_typ_nm, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP_NM);
	public static final MCMeta sno3_typ_META = createCommonMeta($sno3_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sno3_typ_nm_META = createCommonMeta($sno3_typ_nm, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP_NM);
	public static final MCMeta sno4_typ_META = createCommonMeta($sno4_typ, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP);
	public static final MCMeta sno4_typ_nm_META = createCommonMeta($sno4_typ_nm, mcframe.commonMA.meta.MA_META.UNIT_CALC_TYP_NM);
	public static final MCMeta lot_act_typ_META = createCommonMeta($lot_act_typ, mcframe.commonMA.meta.MA_META.ACT_SET_TYP);
	public static final MCMeta lot_act_typ_nm_META = createCommonMeta($lot_act_typ_nm, mcframe.commonMA.meta.MA_META.ACT_SET_TYP_NM);
	public static final MCMeta sublot_act_typ_META = createCommonMeta($sublot_act_typ, mcframe.commonMA.meta.MA_META.ACT_SET_TYP);
	public static final MCMeta sublot_act_typ_nm_META = createCommonMeta($sublot_act_typ_nm, mcframe.commonMA.meta.MA_META.ACT_SET_TYP_NM);
	public static final MCMeta sno1_act_typ_META = createCommonMeta($sno1_act_typ, mcframe.commonMA.meta.MA_META.ACT_SET_TYP);
	public static final MCMeta sno1_act_typ_nm_META = createCommonMeta($sno1_act_typ_nm, mcframe.commonMA.meta.MA_META.ACT_SET_TYP_NM);
	public static final MCMeta sno2_act_typ_META = createCommonMeta($sno2_act_typ, mcframe.commonMA.meta.MA_META.ACT_SET_TYP);
	public static final MCMeta sno2_act_typ_nm_META = createCommonMeta($sno2_act_typ_nm, mcframe.commonMA.meta.MA_META.ACT_SET_TYP_NM);
	public static final MCMeta sno3_act_typ_META = createCommonMeta($sno3_act_typ, mcframe.commonMA.meta.MA_META.ACT_SET_TYP);
	public static final MCMeta sno3_act_typ_nm_META = createCommonMeta($sno3_act_typ_nm, mcframe.commonMA.meta.MA_META.ACT_SET_TYP_NM);
	public static final MCMeta sno4_act_typ_META = createCommonMeta($sno4_act_typ, mcframe.commonMA.meta.MA_META.ACT_SET_TYP);
	public static final MCMeta sno4_act_typ_nm_META = createCommonMeta($sno4_act_typ_nm, mcframe.commonMA.meta.MA_META.ACT_SET_TYP_NM);
	public static final MCMeta itm_mfg_inst_no_set_typ_META = createCommonMeta($itm_mfg_inst_no_set_typ, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO_SET_TYP);
	public static final MCMeta itm_mfg_inst_no_set_typ_nm_META = createCommonMeta($itm_mfg_inst_no_set_typ_nm, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO_SET_TYP_NM);
	public static final MCMeta mfg_act_no_set_typ_META = createCommonMeta($mfg_act_no_set_typ, mcframe.commonMA.meta.MA_META.MFG_ACT_NO_SET_TYP);
	public static final MCMeta mfg_act_no_set_typ_nm_META = createCommonMeta($mfg_act_no_set_typ_nm, mcframe.commonMA.meta.MA_META.MFG_ACT_NO_SET_TYP_NM);
	public static final MCMeta oper_act_no_set_typ_META = createCommonMeta($oper_act_no_set_typ, mcframe.commonMA.meta.MA_META.OPER_ACT_NO_SET_TYP);
	public static final MCMeta oper_act_no_set_typ_nm_META = createCommonMeta($oper_act_no_set_typ_nm, mcframe.commonMA.meta.MA_META.OPER_ACT_NO_SET_TYP_NM);
	public static final MCMeta lot_exp_typ_META = createCommonMeta($lot_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta lot_exp_typ_nm_META = createCommonMeta($lot_exp_typ_nm, mcframe.commonMA.meta.MA_META.EXP_SET_TYP_NM);
	public static final MCMeta sublot_exp_typ_META = createCommonMeta($sublot_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sublot_exp_typ_nm_META = createCommonMeta($sublot_exp_typ_nm, mcframe.commonMA.meta.MA_META.EXP_SET_TYP_NM);
	public static final MCMeta sno1_exp_typ_META = createCommonMeta($sno1_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sno1_exp_typ_nm_META = createCommonMeta($sno1_exp_typ_nm, mcframe.commonMA.meta.MA_META.EXP_SET_TYP_NM);
	public static final MCMeta sno2_exp_typ_META = createCommonMeta($sno2_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sno2_exp_typ_nm_META = createCommonMeta($sno2_exp_typ_nm, mcframe.commonMA.meta.MA_META.EXP_SET_TYP_NM);
	public static final MCMeta sno3_exp_typ_META = createCommonMeta($sno3_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sno3_exp_typ_nm_META = createCommonMeta($sno3_exp_typ_nm, mcframe.commonMA.meta.MA_META.EXP_SET_TYP_NM);
	public static final MCMeta sno4_exp_typ_META = createCommonMeta($sno4_exp_typ, mcframe.commonMA.meta.MA_META.EXP_SET_TYP);
	public static final MCMeta sno4_exp_typ_nm_META = createCommonMeta($sno4_exp_typ_nm, mcframe.commonMA.meta.MA_META.EXP_SET_TYP_NM);
	public static final MCMeta dpt_loss_eval_typ_META = createCommonMeta($dpt_loss_eval_typ, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP);
	public static final MCMeta dpt_loss_eval_typ_nm_META = createCommonMeta($dpt_loss_eval_typ_nm, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP_NM);
	public static final MCMeta lot_loss_eval_typ_META = createCommonMeta($lot_loss_eval_typ, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP);
	public static final MCMeta lot_loss_eval_typ_nm_META = createCommonMeta($lot_loss_eval_typ_nm, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP_NM);
	public static final MCMeta sublot_loss_eval_typ_META = createCommonMeta($sublot_loss_eval_typ, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP);
	public static final MCMeta sublot_loss_eval_typ_nm_META = createCommonMeta($sublot_loss_eval_typ_nm, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP_NM);
	public static final MCMeta sno1_loss_eval_typ_META = createCommonMeta($sno1_loss_eval_typ, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP);
	public static final MCMeta sno1_loss_eval_typ_nm_META = createCommonMeta($sno1_loss_eval_typ_nm, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP_NM);
	public static final MCMeta sno2_loss_eval_typ_META = createCommonMeta($sno2_loss_eval_typ, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP);
	public static final MCMeta sno2_loss_eval_typ_nm_META = createCommonMeta($sno2_loss_eval_typ_nm, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP_NM);
	public static final MCMeta sno3_loss_eval_typ_META = createCommonMeta($sno3_loss_eval_typ, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP);
	public static final MCMeta sno3_loss_eval_typ_nm_META = createCommonMeta($sno3_loss_eval_typ_nm, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP_NM);
	public static final MCMeta sno4_loss_eval_typ_META = createCommonMeta($sno4_loss_eval_typ, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP);
	public static final MCMeta sno4_loss_eval_typ_nm_META = createCommonMeta($sno4_loss_eval_typ_nm, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP_NM);
	public static final MCMeta asst_loss_eval_typ_META = createCommonMeta($asst_loss_eval_typ, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP);
	public static final MCMeta asst_loss_eval_typ_nm_META = createCommonMeta($asst_loss_eval_typ_nm, mcframe.commonMA.meta.MA_META.LOSS_EVAL_TYP_NM);
	public static final MCMeta std_rnd_typ_META = createCommonMeta($std_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta std_rnd_typ_nm_META = createCommonMeta($std_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta std_dec_place_META = createCommonMeta($std_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ave_rnd_typ_META = createCommonMeta($ave_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ave_rnd_typ_nm_META = createCommonMeta($ave_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta ave_dec_place_META = createCommonMeta($ave_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta adj_typ_META = createCommonMeta($adj_typ, mcframe.commonMA.meta.MA_META.ADJ_TYP);
	public static final MCMeta adj_typ_nm_META = createCommonMeta($adj_typ_nm, mcframe.commonMA.meta.MA_META.ADJ_TYP_NM);
	public static final MCMeta wip_typ_META = createCommonMeta($wip_typ, mcframe.commonMA.meta.MA_META.WIP_TYP);
	public static final MCMeta wip_typ_nm_META = createCommonMeta($wip_typ_nm, mcframe.commonMA.meta.MA_META.WIP_TYP_NM);
	public static final MCMeta bd_agg_typ_META = createCommonMeta($bd_agg_typ, mcframe.commonMA.meta.MA_META.BD_AGG_TYP);
	public static final MCMeta bd_agg_typ_nm_META = createCommonMeta($bd_agg_typ_nm, mcframe.commonMA.meta.MA_META.BD_AGG_TYP_NM);
	public static final MCMeta mrgn_expns_cd_META = createCommonMeta($mrgn_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta mrgn_expns_nm_META = createCommonMeta($mrgn_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta purc_expns_cd_META = createCommonMeta($purc_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta purc_expns_nm_META = createCommonMeta($purc_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta out_expns_cd_META = createCommonMeta($out_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta out_expns_nm_META = createCommonMeta($out_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta inpt_expns_cd_META = createCommonMeta($inpt_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta inpt_expns_nm_META = createCommonMeta($inpt_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta ss_expns_cd_META = createCommonMeta($ss_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta ss_expns_nm_META = createCommonMeta($ss_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta prov_expns_cd_META = createCommonMeta($prov_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta prov_expns_nm_META = createCommonMeta($prov_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta exp_alloc_typ_META = createCommonMeta($exp_alloc_typ, mcframe.commonMA.meta.MA_META.EXP_ALLOC_TYP);
	public static final MCMeta exp_alloc_typ_nm_META = createCommonMeta($exp_alloc_typ_nm, mcframe.commonMA.meta.MA_META.EXP_ALLOC_TYP_NM);
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

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			del_flg_META,
			calc_ptn_cd_META,
			calc_ptn_nm_lcl_META,
			calc_ptn_nm_META,
			mfg_purc_typ_META,
			mfg_purc_typ_nm_META,
			eval_typ_META,
			eval_typ_nm_META,
			dpt_typ_META,
			dpt_typ_nm_META,
			lot_typ_META,
			lot_typ_nm_META,
			sublot_typ_META,
			sublot_typ_nm_META,
			sno1_typ_META,
			sno1_typ_nm_META,
			sno2_typ_META,
			sno2_typ_nm_META,
			sno3_typ_META,
			sno3_typ_nm_META,
			sno4_typ_META,
			sno4_typ_nm_META,
			lot_act_typ_META,
			lot_act_typ_nm_META,
			sublot_act_typ_META,
			sublot_act_typ_nm_META,
			sno1_act_typ_META,
			sno1_act_typ_nm_META,
			sno2_act_typ_META,
			sno2_act_typ_nm_META,
			sno3_act_typ_META,
			sno3_act_typ_nm_META,
			sno4_act_typ_META,
			sno4_act_typ_nm_META,
			itm_mfg_inst_no_set_typ_META,
			itm_mfg_inst_no_set_typ_nm_META,
			mfg_act_no_set_typ_META,
			mfg_act_no_set_typ_nm_META,
			oper_act_no_set_typ_META,
			oper_act_no_set_typ_nm_META,
			lot_exp_typ_META,
			lot_exp_typ_nm_META,
			sublot_exp_typ_META,
			sublot_exp_typ_nm_META,
			sno1_exp_typ_META,
			sno1_exp_typ_nm_META,
			sno2_exp_typ_META,
			sno2_exp_typ_nm_META,
			sno3_exp_typ_META,
			sno3_exp_typ_nm_META,
			sno4_exp_typ_META,
			sno4_exp_typ_nm_META,
			dpt_loss_eval_typ_META,
			dpt_loss_eval_typ_nm_META,
			lot_loss_eval_typ_META,
			lot_loss_eval_typ_nm_META,
			sublot_loss_eval_typ_META,
			sublot_loss_eval_typ_nm_META,
			sno1_loss_eval_typ_META,
			sno1_loss_eval_typ_nm_META,
			sno2_loss_eval_typ_META,
			sno2_loss_eval_typ_nm_META,
			sno3_loss_eval_typ_META,
			sno3_loss_eval_typ_nm_META,
			sno4_loss_eval_typ_META,
			sno4_loss_eval_typ_nm_META,
			asst_loss_eval_typ_META,
			asst_loss_eval_typ_nm_META,
			std_rnd_typ_META,
			std_rnd_typ_nm_META,
			std_dec_place_META,
			ave_rnd_typ_META,
			ave_rnd_typ_nm_META,
			ave_dec_place_META,
			adj_typ_META,
			adj_typ_nm_META,
			wip_typ_META,
			wip_typ_nm_META,
			bd_agg_typ_META,
			bd_agg_typ_nm_META,
			mrgn_expns_cd_META,
			mrgn_expns_nm_META,
			purc_expns_cd_META,
			purc_expns_nm_META,
			out_expns_cd_META,
			out_expns_nm_META,
			inpt_expns_cd_META,
			inpt_expns_nm_META,
			ss_expns_cd_META,
			ss_expns_nm_META,
			prov_expns_cd_META,
			prov_expns_nm_META,
			exp_alloc_typ_META,
			exp_alloc_typ_nm_META,
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

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$calc_ptn_cd	// calc_ptn_cd
		}
	);

	/** 項目属性情報のグループ[FLG_GRP]のキー定数 */
	public static final String $$FLG_GRP = "FLG_GRP";
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
		new MCExtMap.Entry($$FLG_GRP, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$dpt_typ, "unit_calc_typ_nm"},	// dpt_typ
				{$lot_typ, "unit_calc_typ_nm"},	// lot_typ
				{$sublot_typ, "unit_calc_typ_nm"},	// sublot_typ
				{$sno1_typ, "unit_calc_typ_nm"},	// sno1_typ
				{$sno2_typ, "unit_calc_typ_nm"},	// sno2_typ
				{$sno3_typ, "unit_calc_typ_nm"},	// sno3_typ
				{$sno4_typ, "unit_calc_typ_nm"},	// sno4_typ
				{$lot_act_typ, "act_set_typ_nm"},	// lot_act_typ
				{$sublot_act_typ, "act_set_typ_nm"},	// sublot_act_typ
				{$sno1_act_typ, "act_set_typ_nm"},	// sno1_act_typ
				{$sno2_act_typ, "act_set_typ_nm"},	// sno2_act_typ
				{$sno3_act_typ, "act_set_typ_nm"},	// sno3_act_typ
				{$sno4_act_typ, "act_set_typ_nm"},	// sno4_act_typ
				{$lot_exp_typ, "exp_set_typ_nm"},	// lot_exp_typ
				{$sublot_exp_typ, "exp_set_typ_nm"},	// sublot_exp_typ
				{$sno1_exp_typ, "exp_set_typ_nm"},	// sno1_exp_typ
				{$sno2_exp_typ, "exp_set_typ_nm"},	// sno2_exp_typ
				{$sno3_exp_typ, "exp_set_typ_nm"},	// sno3_exp_typ
				{$sno4_exp_typ, "exp_set_typ_nm"},	// sno4_exp_typ
				{$dpt_loss_eval_typ, "loss_eval_typ_nm"},	// dpt_loss_eval_typ
				{$lot_loss_eval_typ, "loss_eval_typ_nm"},	// lot_loss_eval_typ
				{$sublot_loss_eval_typ, "loss_eval_typ_nm"},	// sublot_loss_eval_typ
				{$sno1_loss_eval_typ, "loss_eval_typ_nm"},	// sno1_loss_eval_typ
				{$sno2_loss_eval_typ, "loss_eval_typ_nm"},	// sno2_loss_eval_typ
				{$sno3_loss_eval_typ, "loss_eval_typ_nm"},	// sno3_loss_eval_typ
				{$sno4_loss_eval_typ, "loss_eval_typ_nm"},	// sno4_loss_eval_typ
				{$asst_loss_eval_typ, "loss_eval_typ_nm"},	// asst_loss_eval_typ
				{$std_rnd_typ, "rnd_typ_nm"},	// std_rnd_typ
				{$ave_rnd_typ, "rnd_typ_nm"},	// ave_rnd_typ
				{$mrgn_expns_cd, "expns_nm"},	// mrgn_expns_cd
				{$purc_expns_cd, "expns_nm"},	// purc_expns_cd
				{$out_expns_cd, "expns_nm"},	// out_expns_cd
				{$inpt_expns_cd, "expns_nm"},	// inpt_expns_cd
				{$ss_expns_cd, "expns_nm"},	// ss_expns_cd
				{$prov_expns_cd, "expns_nm"}	// prov_expns_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$mrgn_expns_cd, "MAC_EXPNS_TYP.PROD"},	// mrgn_expns_cd
				{$purc_expns_cd, "MAC_EXPNS_TYP.PROD"},	// purc_expns_cd
				{$out_expns_cd, "MAC_EXPNS_TYP.PROD"},	// out_expns_cd
				{$inpt_expns_cd, "MAC_EXPNS_TYP.PROD"},	// inpt_expns_cd
				{$ss_expns_cd, "MAC_EXPNS_TYP.PROD"},	// ss_expns_cd
				{$prov_expns_cd, "MAC_EXPNS_TYP.SPPL"}	// prov_expns_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$mrgn_expns_cd, "expns_typ"},	// mrgn_expns_cd
				{$purc_expns_cd, "expns_typ"},	// purc_expns_cd
				{$out_expns_cd, "expns_typ"},	// out_expns_cd
				{$inpt_expns_cd, "expns_typ"},	// inpt_expns_cd
				{$ss_expns_cd, "expns_typ"},	// ss_expns_cd
				{$prov_expns_cd, "expns_typ"}	// prov_expns_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$sno1_typ, "SNO1"},	// sno1_typ
				{$sno1_typ_nm, "SNO1"},	// sno1_typ_nm
				{$sno2_typ, "SNO2"},	// sno2_typ
				{$sno2_typ_nm, "SNO2"},	// sno2_typ_nm
				{$sno3_typ, "SNO3"},	// sno3_typ
				{$sno3_typ_nm, "SNO3"},	// sno3_typ_nm
				{$sno4_typ, "SNO4"},	// sno4_typ
				{$sno4_typ_nm, "SNO4"},	// sno4_typ_nm
				{$sno1_act_typ, "SNO1"},	// sno1_act_typ
				{$sno1_act_typ_nm, "SNO1"},	// sno1_act_typ_nm
				{$sno2_act_typ, "SNO2"},	// sno2_act_typ
				{$sno2_act_typ_nm, "SNO2"},	// sno2_act_typ_nm
				{$sno3_act_typ, "SNO3"},	// sno3_act_typ
				{$sno3_act_typ_nm, "SNO3"},	// sno3_act_typ_nm
				{$sno4_act_typ, "SNO4"},	// sno4_act_typ
				{$sno4_act_typ_nm, "SNO4"},	// sno4_act_typ_nm
				{$sno1_exp_typ, "SNO1"},	// sno1_exp_typ
				{$sno1_exp_typ_nm, "SNO1"},	// sno1_exp_typ_nm
				{$sno2_exp_typ, "SNO2"},	// sno2_exp_typ
				{$sno2_exp_typ_nm, "SNO2"},	// sno2_exp_typ_nm
				{$sno3_exp_typ, "SNO3"},	// sno3_exp_typ
				{$sno3_exp_typ_nm, "SNO3"},	// sno3_exp_typ_nm
				{$sno4_exp_typ, "SNO4"},	// sno4_exp_typ
				{$sno4_exp_typ_nm, "SNO4"},	// sno4_exp_typ_nm
				{$sno1_loss_eval_typ, "SNO1"},	// sno1_loss_eval_typ
				{$sno1_loss_eval_typ_nm, "SNO1"},	// sno1_loss_eval_typ_nm
				{$sno2_loss_eval_typ, "SNO2"},	// sno2_loss_eval_typ
				{$sno2_loss_eval_typ_nm, "SNO2"},	// sno2_loss_eval_typ_nm
				{$sno3_loss_eval_typ, "SNO3"},	// sno3_loss_eval_typ
				{$sno3_loss_eval_typ_nm, "SNO3"},	// sno3_loss_eval_typ_nm
				{$sno4_loss_eval_typ, "SNO4"},	// sno4_loss_eval_typ
				{$sno4_loss_eval_typ_nm, "SNO4"}	// sno4_loss_eval_typ_nm
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
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public String calc_ptn_cd() {
		return getConstString(offset + 2, $calc_ptn_cd);
	}

	/**
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public void calc_ptn_cd(String value) {
		setConstString(offset + 2, $calc_ptn_cd, value);
	}


	/**
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public String calc_ptn_nm_lcl() {
		return getConstString(offset + 3, $calc_ptn_nm_lcl);
	}

	/**
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public void calc_ptn_nm_lcl(String value) {
		setConstString(offset + 3, $calc_ptn_nm_lcl, value);
	}


	/**
	 * Standard calculation pattern name 標準計算パタン名.<p>
	 *
	 */
	public String calc_ptn_nm() {
		return getConstString(offset + 4, $calc_ptn_nm);
	}

	/**
	 * Standard calculation pattern name 標準計算パタン名.<p>
	 *
	 */
	public void calc_ptn_nm(String value) {
		setConstString(offset + 4, $calc_ptn_nm, value);
	}


	/**
	 * Mfg. purchase type 製造購買区分.<p>
	 *
	 */
	public String mfg_purc_typ() {
		return getConstString(offset + 5, $mfg_purc_typ);
	}

	/**
	 * Mfg. purchase type 製造購買区分.<p>
	 *
	 */
	public void mfg_purc_typ(String value) {
		setConstString(offset + 5, $mfg_purc_typ, value);
	}


	/**
	 * Mfg. purchase type name 製造購買区分名.<p>
	 *
	 */
	public String mfg_purc_typ_nm() {
		return getConstString(offset + 6, $mfg_purc_typ_nm);
	}

	/**
	 * Mfg. purchase type name 製造購買区分名.<p>
	 *
	 */
	public void mfg_purc_typ_nm(String value) {
		setConstString(offset + 6, $mfg_purc_typ_nm, value);
	}


	/**
	 * Amount evaluation type 金額評価区分.<p>
	 *
	 */
	public String eval_typ() {
		return getConstString(offset + 7, $eval_typ);
	}

	/**
	 * Amount evaluation type 金額評価区分.<p>
	 *
	 */
	public void eval_typ(String value) {
		setConstString(offset + 7, $eval_typ, value);
	}


	/**
	 * Amount evaluation type name 金額評価区分名.<p>
	 *
	 */
	public String eval_typ_nm() {
		return getConstString(offset + 8, $eval_typ_nm);
	}

	/**
	 * Amount evaluation type name 金額評価区分名.<p>
	 *
	 */
	public void eval_typ_nm(String value) {
		setConstString(offset + 8, $eval_typ_nm, value);
	}


	/**
	 * Dept. calculation type 部門計算区分.<p>
	 *
	 */
	public String dpt_typ() {
		return getConstString(offset + 9, $dpt_typ);
	}

	/**
	 * Dept. calculation type 部門計算区分.<p>
	 *
	 */
	public void dpt_typ(String value) {
		setConstString(offset + 9, $dpt_typ, value);
	}


	/**
	 * Dept. calculation type name 部門計算区分名.<p>
	 *
	 */
	public String dpt_typ_nm() {
		return getConstString(offset + 10, $dpt_typ_nm);
	}

	/**
	 * Dept. calculation type name 部門計算区分名.<p>
	 *
	 */
	public void dpt_typ_nm(String value) {
		setConstString(offset + 10, $dpt_typ_nm, value);
	}


	/**
	 * Lot No. calculation type ロットＮＯ計算区分.<p>
	 *
	 */
	public String lot_typ() {
		return getConstString(offset + 11, $lot_typ);
	}

	/**
	 * Lot No. calculation type ロットＮＯ計算区分.<p>
	 *
	 */
	public void lot_typ(String value) {
		setConstString(offset + 11, $lot_typ, value);
	}


	/**
	 * Lot No. calculation type name ロットＮＯ計算区分名.<p>
	 *
	 */
	public String lot_typ_nm() {
		return getConstString(offset + 12, $lot_typ_nm);
	}

	/**
	 * Lot No. calculation type name ロットＮＯ計算区分名.<p>
	 *
	 */
	public void lot_typ_nm(String value) {
		setConstString(offset + 12, $lot_typ_nm, value);
	}


	/**
	 * Sublot No. calculation type サブロットＮＯ計算区分.<p>
	 *
	 */
	public String sublot_typ() {
		return getConstString(offset + 13, $sublot_typ);
	}

	/**
	 * Sublot No. calculation type サブロットＮＯ計算区分.<p>
	 *
	 */
	public void sublot_typ(String value) {
		setConstString(offset + 13, $sublot_typ, value);
	}


	/**
	 * Sublot No. calculation type name サブロットＮＯ計算区分名.<p>
	 *
	 */
	public String sublot_typ_nm() {
		return getConstString(offset + 14, $sublot_typ_nm);
	}

	/**
	 * Sublot No. calculation type name サブロットＮＯ計算区分名.<p>
	 *
	 */
	public void sublot_typ_nm(String value) {
		setConstString(offset + 14, $sublot_typ_nm, value);
	}


	/**
	 * SEIBAN No. 1 calculation type 手配ＮＯ１計算区分.<p>
	 *
	 */
	public String sno1_typ() {
		return getConstString(offset + 15, $sno1_typ);
	}

	/**
	 * SEIBAN No. 1 calculation type 手配ＮＯ１計算区分.<p>
	 *
	 */
	public void sno1_typ(String value) {
		setConstString(offset + 15, $sno1_typ, value);
	}


	/**
	 * SEIBAN No. 1 calculation type name 手配ＮＯ１計算区分名.<p>
	 *
	 */
	public String sno1_typ_nm() {
		return getConstString(offset + 16, $sno1_typ_nm);
	}

	/**
	 * SEIBAN No. 1 calculation type name 手配ＮＯ１計算区分名.<p>
	 *
	 */
	public void sno1_typ_nm(String value) {
		setConstString(offset + 16, $sno1_typ_nm, value);
	}


	/**
	 * SEIBAN No. 2 calculation type 手配ＮＯ２計算区分.<p>
	 *
	 */
	public String sno2_typ() {
		return getConstString(offset + 17, $sno2_typ);
	}

	/**
	 * SEIBAN No. 2 calculation type 手配ＮＯ２計算区分.<p>
	 *
	 */
	public void sno2_typ(String value) {
		setConstString(offset + 17, $sno2_typ, value);
	}


	/**
	 * SEIBAN No. 2 calculation type name 手配ＮＯ２計算区分名.<p>
	 *
	 */
	public String sno2_typ_nm() {
		return getConstString(offset + 18, $sno2_typ_nm);
	}

	/**
	 * SEIBAN No. 2 calculation type name 手配ＮＯ２計算区分名.<p>
	 *
	 */
	public void sno2_typ_nm(String value) {
		setConstString(offset + 18, $sno2_typ_nm, value);
	}


	/**
	 * SEIBAN No. 3 calculation type 手配ＮＯ３計算区分.<p>
	 *
	 */
	public String sno3_typ() {
		return getConstString(offset + 19, $sno3_typ);
	}

	/**
	 * SEIBAN No. 3 calculation type 手配ＮＯ３計算区分.<p>
	 *
	 */
	public void sno3_typ(String value) {
		setConstString(offset + 19, $sno3_typ, value);
	}


	/**
	 * SEIBAN No. 3 calculation type name 手配ＮＯ３計算区分名.<p>
	 *
	 */
	public String sno3_typ_nm() {
		return getConstString(offset + 20, $sno3_typ_nm);
	}

	/**
	 * SEIBAN No. 3 calculation type name 手配ＮＯ３計算区分名.<p>
	 *
	 */
	public void sno3_typ_nm(String value) {
		setConstString(offset + 20, $sno3_typ_nm, value);
	}


	/**
	 * SEIBAN No. 4 calculation type 手配ＮＯ４計算区分.<p>
	 *
	 */
	public String sno4_typ() {
		return getConstString(offset + 21, $sno4_typ);
	}

	/**
	 * SEIBAN No. 4 calculation type 手配ＮＯ４計算区分.<p>
	 *
	 */
	public void sno4_typ(String value) {
		setConstString(offset + 21, $sno4_typ, value);
	}


	/**
	 * SEIBAN No. 4 calculation type name 手配ＮＯ４計算区分名.<p>
	 *
	 */
	public String sno4_typ_nm() {
		return getConstString(offset + 22, $sno4_typ_nm);
	}

	/**
	 * SEIBAN No. 4 calculation type name 手配ＮＯ４計算区分名.<p>
	 *
	 */
	public void sno4_typ_nm(String value) {
		setConstString(offset + 22, $sno4_typ_nm, value);
	}


	/**
	 * Lot No. result type ロットＮＯ実績区分.<p>
	 *
	 */
	public String lot_act_typ() {
		return getConstString(offset + 23, $lot_act_typ);
	}

	/**
	 * Lot No. result type ロットＮＯ実績区分.<p>
	 *
	 */
	public void lot_act_typ(String value) {
		setConstString(offset + 23, $lot_act_typ, value);
	}


	/**
	 * Lot No. result type name ロットＮＯ実績区分名.<p>
	 *
	 */
	public String lot_act_typ_nm() {
		return getConstString(offset + 24, $lot_act_typ_nm);
	}

	/**
	 * Lot No. result type name ロットＮＯ実績区分名.<p>
	 *
	 */
	public void lot_act_typ_nm(String value) {
		setConstString(offset + 24, $lot_act_typ_nm, value);
	}


	/**
	 * Sublot No. result type サブロットＮＯ実績区分.<p>
	 *
	 */
	public String sublot_act_typ() {
		return getConstString(offset + 25, $sublot_act_typ);
	}

	/**
	 * Sublot No. result type サブロットＮＯ実績区分.<p>
	 *
	 */
	public void sublot_act_typ(String value) {
		setConstString(offset + 25, $sublot_act_typ, value);
	}


	/**
	 * Sublot No. result type name サブロットＮＯ実績区分名.<p>
	 *
	 */
	public String sublot_act_typ_nm() {
		return getConstString(offset + 26, $sublot_act_typ_nm);
	}

	/**
	 * Sublot No. result type name サブロットＮＯ実績区分名.<p>
	 *
	 */
	public void sublot_act_typ_nm(String value) {
		setConstString(offset + 26, $sublot_act_typ_nm, value);
	}


	/**
	 * SEIBAN No. 1 result type 手配ＮＯ１実績区分.<p>
	 *
	 */
	public String sno1_act_typ() {
		return getConstString(offset + 27, $sno1_act_typ);
	}

	/**
	 * SEIBAN No. 1 result type 手配ＮＯ１実績区分.<p>
	 *
	 */
	public void sno1_act_typ(String value) {
		setConstString(offset + 27, $sno1_act_typ, value);
	}


	/**
	 * SEIBAN No. 1 result type name 手配ＮＯ１実績区分名.<p>
	 *
	 */
	public String sno1_act_typ_nm() {
		return getConstString(offset + 28, $sno1_act_typ_nm);
	}

	/**
	 * SEIBAN No. 1 result type name 手配ＮＯ１実績区分名.<p>
	 *
	 */
	public void sno1_act_typ_nm(String value) {
		setConstString(offset + 28, $sno1_act_typ_nm, value);
	}


	/**
	 * SEIBAN No. 2 result type 手配ＮＯ２実績区分.<p>
	 *
	 */
	public String sno2_act_typ() {
		return getConstString(offset + 29, $sno2_act_typ);
	}

	/**
	 * SEIBAN No. 2 result type 手配ＮＯ２実績区分.<p>
	 *
	 */
	public void sno2_act_typ(String value) {
		setConstString(offset + 29, $sno2_act_typ, value);
	}


	/**
	 * SEIBAN No. 2 result type name 手配ＮＯ２実績区分名.<p>
	 *
	 */
	public String sno2_act_typ_nm() {
		return getConstString(offset + 30, $sno2_act_typ_nm);
	}

	/**
	 * SEIBAN No. 2 result type name 手配ＮＯ２実績区分名.<p>
	 *
	 */
	public void sno2_act_typ_nm(String value) {
		setConstString(offset + 30, $sno2_act_typ_nm, value);
	}


	/**
	 * SEIBAN No. 3 result type 手配ＮＯ３実績区分.<p>
	 *
	 */
	public String sno3_act_typ() {
		return getConstString(offset + 31, $sno3_act_typ);
	}

	/**
	 * SEIBAN No. 3 result type 手配ＮＯ３実績区分.<p>
	 *
	 */
	public void sno3_act_typ(String value) {
		setConstString(offset + 31, $sno3_act_typ, value);
	}


	/**
	 * SEIBAN No. 3 result type name 手配ＮＯ３実績区分名.<p>
	 *
	 */
	public String sno3_act_typ_nm() {
		return getConstString(offset + 32, $sno3_act_typ_nm);
	}

	/**
	 * SEIBAN No. 3 result type name 手配ＮＯ３実績区分名.<p>
	 *
	 */
	public void sno3_act_typ_nm(String value) {
		setConstString(offset + 32, $sno3_act_typ_nm, value);
	}


	/**
	 * SEIBAN No. 4 result type 手配ＮＯ４実績区分.<p>
	 *
	 */
	public String sno4_act_typ() {
		return getConstString(offset + 33, $sno4_act_typ);
	}

	/**
	 * SEIBAN No. 4 result type 手配ＮＯ４実績区分.<p>
	 *
	 */
	public void sno4_act_typ(String value) {
		setConstString(offset + 33, $sno4_act_typ, value);
	}


	/**
	 * SEIBAN No. 4 result type name 手配ＮＯ４実績区分名.<p>
	 *
	 */
	public String sno4_act_typ_nm() {
		return getConstString(offset + 34, $sno4_act_typ_nm);
	}

	/**
	 * SEIBAN No. 4 result type name 手配ＮＯ４実績区分名.<p>
	 *
	 */
	public void sno4_act_typ_nm(String value) {
		setConstString(offset + 34, $sno4_act_typ_nm, value);
	}


	/**
	 * Item mfg. order No. setting type 品目製造指図ＮＯ設定区分.<p>
	 *
	 */
	public String itm_mfg_inst_no_set_typ() {
		return getConstString(offset + 35, $itm_mfg_inst_no_set_typ);
	}

	/**
	 * Item mfg. order No. setting type 品目製造指図ＮＯ設定区分.<p>
	 *
	 */
	public void itm_mfg_inst_no_set_typ(String value) {
		setConstString(offset + 35, $itm_mfg_inst_no_set_typ, value);
	}


	/**
	 * Item mfg. order No. setting type name 品目製造指図ＮＯ設定区分名.<p>
	 *
	 */
	public String itm_mfg_inst_no_set_typ_nm() {
		return getConstString(offset + 36, $itm_mfg_inst_no_set_typ_nm);
	}

	/**
	 * Item mfg. order No. setting type name 品目製造指図ＮＯ設定区分名.<p>
	 *
	 */
	public void itm_mfg_inst_no_set_typ_nm(String value) {
		setConstString(offset + 36, $itm_mfg_inst_no_set_typ_nm, value);
	}


	/**
	 * Mfg. result No. setting type 製造実績ＮＯ設定区分.<p>
	 *
	 */
	public String mfg_act_no_set_typ() {
		return getConstString(offset + 37, $mfg_act_no_set_typ);
	}

	/**
	 * Mfg. result No. setting type 製造実績ＮＯ設定区分.<p>
	 *
	 */
	public void mfg_act_no_set_typ(String value) {
		setConstString(offset + 37, $mfg_act_no_set_typ, value);
	}


	/**
	 * Mfg. result No. setting type name 製造実績ＮＯ設定区分名.<p>
	 *
	 */
	public String mfg_act_no_set_typ_nm() {
		return getConstString(offset + 38, $mfg_act_no_set_typ_nm);
	}

	/**
	 * Mfg. result No. setting type name 製造実績ＮＯ設定区分名.<p>
	 *
	 */
	public void mfg_act_no_set_typ_nm(String value) {
		setConstString(offset + 38, $mfg_act_no_set_typ_nm, value);
	}


	/**
	 * Operation result No. setting type 工程実績ＮＯ設定区分.<p>
	 *
	 */
	public String oper_act_no_set_typ() {
		return getConstString(offset + 39, $oper_act_no_set_typ);
	}

	/**
	 * Operation result No. setting type 工程実績ＮＯ設定区分.<p>
	 *
	 */
	public void oper_act_no_set_typ(String value) {
		setConstString(offset + 39, $oper_act_no_set_typ, value);
	}


	/**
	 * Operation result No. setting type name 工程実績ＮＯ設定区分名.<p>
	 *
	 */
	public String oper_act_no_set_typ_nm() {
		return getConstString(offset + 40, $oper_act_no_set_typ_nm);
	}

	/**
	 * Operation result No. setting type name 工程実績ＮＯ設定区分名.<p>
	 *
	 */
	public void oper_act_no_set_typ_nm(String value) {
		setConstString(offset + 40, $oper_act_no_set_typ_nm, value);
	}


	/**
	 * Lot No. explosion type ロットＮＯ展開区分.<p>
	 *
	 */
	public String lot_exp_typ() {
		return getConstString(offset + 41, $lot_exp_typ);
	}

	/**
	 * Lot No. explosion type ロットＮＯ展開区分.<p>
	 *
	 */
	public void lot_exp_typ(String value) {
		setConstString(offset + 41, $lot_exp_typ, value);
	}


	/**
	 * Lot No. explosion type name ロットＮＯ展開区分名.<p>
	 *
	 */
	public String lot_exp_typ_nm() {
		return getConstString(offset + 42, $lot_exp_typ_nm);
	}

	/**
	 * Lot No. explosion type name ロットＮＯ展開区分名.<p>
	 *
	 */
	public void lot_exp_typ_nm(String value) {
		setConstString(offset + 42, $lot_exp_typ_nm, value);
	}


	/**
	 * Sublot No. explosion type サブロットＮＯ展開区分.<p>
	 *
	 */
	public String sublot_exp_typ() {
		return getConstString(offset + 43, $sublot_exp_typ);
	}

	/**
	 * Sublot No. explosion type サブロットＮＯ展開区分.<p>
	 *
	 */
	public void sublot_exp_typ(String value) {
		setConstString(offset + 43, $sublot_exp_typ, value);
	}


	/**
	 * Sublot No. explosion type name サブロットＮＯ展開区分名.<p>
	 *
	 */
	public String sublot_exp_typ_nm() {
		return getConstString(offset + 44, $sublot_exp_typ_nm);
	}

	/**
	 * Sublot No. explosion type name サブロットＮＯ展開区分名.<p>
	 *
	 */
	public void sublot_exp_typ_nm(String value) {
		setConstString(offset + 44, $sublot_exp_typ_nm, value);
	}


	/**
	 * SEIBAN No. 1 explosion type 手配ＮＯ１展開区分.<p>
	 *
	 */
	public String sno1_exp_typ() {
		return getConstString(offset + 45, $sno1_exp_typ);
	}

	/**
	 * SEIBAN No. 1 explosion type 手配ＮＯ１展開区分.<p>
	 *
	 */
	public void sno1_exp_typ(String value) {
		setConstString(offset + 45, $sno1_exp_typ, value);
	}


	/**
	 * SEIBAN No. 1 explosion type name 手配ＮＯ１展開区分名.<p>
	 *
	 */
	public String sno1_exp_typ_nm() {
		return getConstString(offset + 46, $sno1_exp_typ_nm);
	}

	/**
	 * SEIBAN No. 1 explosion type name 手配ＮＯ１展開区分名.<p>
	 *
	 */
	public void sno1_exp_typ_nm(String value) {
		setConstString(offset + 46, $sno1_exp_typ_nm, value);
	}


	/**
	 * SEIBAN No. 2 explosion type 手配ＮＯ２展開区分.<p>
	 *
	 */
	public String sno2_exp_typ() {
		return getConstString(offset + 47, $sno2_exp_typ);
	}

	/**
	 * SEIBAN No. 2 explosion type 手配ＮＯ２展開区分.<p>
	 *
	 */
	public void sno2_exp_typ(String value) {
		setConstString(offset + 47, $sno2_exp_typ, value);
	}


	/**
	 * SEIBAN No. 2 explosion type name 手配ＮＯ２展開区分名.<p>
	 *
	 */
	public String sno2_exp_typ_nm() {
		return getConstString(offset + 48, $sno2_exp_typ_nm);
	}

	/**
	 * SEIBAN No. 2 explosion type name 手配ＮＯ２展開区分名.<p>
	 *
	 */
	public void sno2_exp_typ_nm(String value) {
		setConstString(offset + 48, $sno2_exp_typ_nm, value);
	}


	/**
	 * SEIBAN No. 3 explosion type 手配ＮＯ３展開区分.<p>
	 *
	 */
	public String sno3_exp_typ() {
		return getConstString(offset + 49, $sno3_exp_typ);
	}

	/**
	 * SEIBAN No. 3 explosion type 手配ＮＯ３展開区分.<p>
	 *
	 */
	public void sno3_exp_typ(String value) {
		setConstString(offset + 49, $sno3_exp_typ, value);
	}


	/**
	 * SEIBAN No. 3 explosion type name 手配ＮＯ３展開区分名.<p>
	 *
	 */
	public String sno3_exp_typ_nm() {
		return getConstString(offset + 50, $sno3_exp_typ_nm);
	}

	/**
	 * SEIBAN No. 3 explosion type name 手配ＮＯ３展開区分名.<p>
	 *
	 */
	public void sno3_exp_typ_nm(String value) {
		setConstString(offset + 50, $sno3_exp_typ_nm, value);
	}


	/**
	 * SEIBAN No. 4 explosion type 手配ＮＯ４展開区分.<p>
	 *
	 */
	public String sno4_exp_typ() {
		return getConstString(offset + 51, $sno4_exp_typ);
	}

	/**
	 * SEIBAN No. 4 explosion type 手配ＮＯ４展開区分.<p>
	 *
	 */
	public void sno4_exp_typ(String value) {
		setConstString(offset + 51, $sno4_exp_typ, value);
	}


	/**
	 * SEIBAN No. 4 explosion type name 手配ＮＯ４展開区分名.<p>
	 *
	 */
	public String sno4_exp_typ_nm() {
		return getConstString(offset + 52, $sno4_exp_typ_nm);
	}

	/**
	 * SEIBAN No. 4 explosion type name 手配ＮＯ４展開区分名.<p>
	 *
	 */
	public void sno4_exp_typ_nm(String value) {
		setConstString(offset + 52, $sno4_exp_typ_nm, value);
	}


	/**
	 * Management dept. evaluation type 管理部門評価区分.<p>
	 *
	 */
	public String dpt_loss_eval_typ() {
		return getConstString(offset + 53, $dpt_loss_eval_typ);
	}

	/**
	 * Management dept. evaluation type 管理部門評価区分.<p>
	 *
	 */
	public void dpt_loss_eval_typ(String value) {
		setConstString(offset + 53, $dpt_loss_eval_typ, value);
	}


	/**
	 * Management dept. evaluation type name 管理部門評価区分名.<p>
	 *
	 */
	public String dpt_loss_eval_typ_nm() {
		return getConstString(offset + 54, $dpt_loss_eval_typ_nm);
	}

	/**
	 * Management dept. evaluation type name 管理部門評価区分名.<p>
	 *
	 */
	public void dpt_loss_eval_typ_nm(String value) {
		setConstString(offset + 54, $dpt_loss_eval_typ_nm, value);
	}


	/**
	 * Lot No. evaluation type ロットＮＯ評価区分.<p>
	 *
	 */
	public String lot_loss_eval_typ() {
		return getConstString(offset + 55, $lot_loss_eval_typ);
	}

	/**
	 * Lot No. evaluation type ロットＮＯ評価区分.<p>
	 *
	 */
	public void lot_loss_eval_typ(String value) {
		setConstString(offset + 55, $lot_loss_eval_typ, value);
	}


	/**
	 * Lot No. evaluation type name ロットＮＯ評価区分 名.<p>
	 *
	 */
	public String lot_loss_eval_typ_nm() {
		return getConstString(offset + 56, $lot_loss_eval_typ_nm);
	}

	/**
	 * Lot No. evaluation type name ロットＮＯ評価区分 名.<p>
	 *
	 */
	public void lot_loss_eval_typ_nm(String value) {
		setConstString(offset + 56, $lot_loss_eval_typ_nm, value);
	}


	/**
	 * Sublot No. revaluation type サブロットＮＯ評価区分.<p>
	 *
	 */
	public String sublot_loss_eval_typ() {
		return getConstString(offset + 57, $sublot_loss_eval_typ);
	}

	/**
	 * Sublot No. revaluation type サブロットＮＯ評価区分.<p>
	 *
	 */
	public void sublot_loss_eval_typ(String value) {
		setConstString(offset + 57, $sublot_loss_eval_typ, value);
	}


	/**
	 * Sublot No. evaluation type name サブロットＮＯ評価区分名.<p>
	 *
	 */
	public String sublot_loss_eval_typ_nm() {
		return getConstString(offset + 58, $sublot_loss_eval_typ_nm);
	}

	/**
	 * Sublot No. evaluation type name サブロットＮＯ評価区分名.<p>
	 *
	 */
	public void sublot_loss_eval_typ_nm(String value) {
		setConstString(offset + 58, $sublot_loss_eval_typ_nm, value);
	}


	/**
	 * SEIBAN No. 1 evaluation type 手配ＮＯ１評価区分.<p>
	 *
	 */
	public String sno1_loss_eval_typ() {
		return getConstString(offset + 59, $sno1_loss_eval_typ);
	}

	/**
	 * SEIBAN No. 1 evaluation type 手配ＮＯ１評価区分.<p>
	 *
	 */
	public void sno1_loss_eval_typ(String value) {
		setConstString(offset + 59, $sno1_loss_eval_typ, value);
	}


	/**
	 * SEIBAN No. 1 evaluation type name 手配ＮＯ１評価区分名.<p>
	 *
	 */
	public String sno1_loss_eval_typ_nm() {
		return getConstString(offset + 60, $sno1_loss_eval_typ_nm);
	}

	/**
	 * SEIBAN No. 1 evaluation type name 手配ＮＯ１評価区分名.<p>
	 *
	 */
	public void sno1_loss_eval_typ_nm(String value) {
		setConstString(offset + 60, $sno1_loss_eval_typ_nm, value);
	}


	/**
	 * SEIBAN No. 2 evaluation type 手配ＮＯ２評価区分.<p>
	 *
	 */
	public String sno2_loss_eval_typ() {
		return getConstString(offset + 61, $sno2_loss_eval_typ);
	}

	/**
	 * SEIBAN No. 2 evaluation type 手配ＮＯ２評価区分.<p>
	 *
	 */
	public void sno2_loss_eval_typ(String value) {
		setConstString(offset + 61, $sno2_loss_eval_typ, value);
	}


	/**
	 * SEIBAN No. 2 evaluation type name 手配ＮＯ２評価区分名.<p>
	 *
	 */
	public String sno2_loss_eval_typ_nm() {
		return getConstString(offset + 62, $sno2_loss_eval_typ_nm);
	}

	/**
	 * SEIBAN No. 2 evaluation type name 手配ＮＯ２評価区分名.<p>
	 *
	 */
	public void sno2_loss_eval_typ_nm(String value) {
		setConstString(offset + 62, $sno2_loss_eval_typ_nm, value);
	}


	/**
	 * SEIBAN No. 3 evaluation type 手配ＮＯ３評価区分.<p>
	 *
	 */
	public String sno3_loss_eval_typ() {
		return getConstString(offset + 63, $sno3_loss_eval_typ);
	}

	/**
	 * SEIBAN No. 3 evaluation type 手配ＮＯ３評価区分.<p>
	 *
	 */
	public void sno3_loss_eval_typ(String value) {
		setConstString(offset + 63, $sno3_loss_eval_typ, value);
	}


	/**
	 * SEIBAN No. 3 evaluation type name 手配ＮＯ３評価区分名.<p>
	 *
	 */
	public String sno3_loss_eval_typ_nm() {
		return getConstString(offset + 64, $sno3_loss_eval_typ_nm);
	}

	/**
	 * SEIBAN No. 3 evaluation type name 手配ＮＯ３評価区分名.<p>
	 *
	 */
	public void sno3_loss_eval_typ_nm(String value) {
		setConstString(offset + 64, $sno3_loss_eval_typ_nm, value);
	}


	/**
	 * SEIBAN No. 4 evaluation type 手配ＮＯ４評価区分.<p>
	 *
	 */
	public String sno4_loss_eval_typ() {
		return getConstString(offset + 65, $sno4_loss_eval_typ);
	}

	/**
	 * SEIBAN No. 4 evaluation type 手配ＮＯ４評価区分.<p>
	 *
	 */
	public void sno4_loss_eval_typ(String value) {
		setConstString(offset + 65, $sno4_loss_eval_typ, value);
	}


	/**
	 * SEIBAN No. 4 evaluation type name 手配ＮＯ４評価区分名.<p>
	 *
	 */
	public String sno4_loss_eval_typ_nm() {
		return getConstString(offset + 66, $sno4_loss_eval_typ_nm);
	}

	/**
	 * SEIBAN No. 4 evaluation type name 手配ＮＯ４評価区分名.<p>
	 *
	 */
	public void sno4_loss_eval_typ_nm(String value) {
		setConstString(offset + 66, $sno4_loss_eval_typ_nm, value);
	}


	/**
	 * Asset type evaluation type 資産区分評価区分.<p>
	 *
	 */
	public String asst_loss_eval_typ() {
		return getConstString(offset + 67, $asst_loss_eval_typ);
	}

	/**
	 * Asset type evaluation type 資産区分評価区分.<p>
	 *
	 */
	public void asst_loss_eval_typ(String value) {
		setConstString(offset + 67, $asst_loss_eval_typ, value);
	}


	/**
	 * Asset type evaluation type name 資産区分評価区分名.<p>
	 *
	 */
	public String asst_loss_eval_typ_nm() {
		return getConstString(offset + 68, $asst_loss_eval_typ_nm);
	}

	/**
	 * Asset type evaluation type name 資産区分評価区分名.<p>
	 *
	 */
	public void asst_loss_eval_typ_nm(String value) {
		setConstString(offset + 68, $asst_loss_eval_typ_nm, value);
	}


	/**
	 * Rounding type (Standard) 標準端数処理区分.<p>
	 *
	 */
	public String std_rnd_typ() {
		return getConstString(offset + 69, $std_rnd_typ);
	}

	/**
	 * Rounding type (Standard) 標準端数処理区分.<p>
	 *
	 */
	public void std_rnd_typ(String value) {
		setConstString(offset + 69, $std_rnd_typ, value);
	}


	/**
	 * Rounding type name (Standard) 標準端数処理区分名.<p>
	 *
	 */
	public String std_rnd_typ_nm() {
		return getConstString(offset + 70, $std_rnd_typ_nm);
	}

	/**
	 * Rounding type name (Standard) 標準端数処理区分名.<p>
	 *
	 */
	public void std_rnd_typ_nm(String value) {
		setConstString(offset + 70, $std_rnd_typ_nm, value);
	}


	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public MCNumber std_dec_place() {
		return getConstNumber(offset + 71, $std_dec_place);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(MCNumber value) {
		setConstNumber(offset + 71, $std_dec_place, value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(int value) {
		setConstNumber(offset + 71, $std_dec_place, value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(long value) {
		setConstNumber(offset + 71, $std_dec_place, value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(float value) {
		setConstNumber(offset + 71, $std_dec_place, value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(double value) {
		setConstNumber(offset + 71, $std_dec_place, value);
	}


	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public String ave_rnd_typ() {
		return getConstString(offset + 72, $ave_rnd_typ);
	}

	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public void ave_rnd_typ(String value) {
		setConstString(offset + 72, $ave_rnd_typ, value);
	}


	/**
	 * Rounding type name (Unit price) 単価端数処理区分名.<p>
	 *
	 */
	public String ave_rnd_typ_nm() {
		return getConstString(offset + 73, $ave_rnd_typ_nm);
	}

	/**
	 * Rounding type name (Unit price) 単価端数処理区分名.<p>
	 *
	 */
	public void ave_rnd_typ_nm(String value) {
		setConstString(offset + 73, $ave_rnd_typ_nm, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber ave_dec_place() {
		return getConstNumber(offset + 74, $ave_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(MCNumber value) {
		setConstNumber(offset + 74, $ave_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(int value) {
		setConstNumber(offset + 74, $ave_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(long value) {
		setConstNumber(offset + 74, $ave_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(float value) {
		setConstNumber(offset + 74, $ave_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(double value) {
		setConstNumber(offset + 74, $ave_dec_place, value);
	}


	/**
	 * Fraction adjustment type 端数調整区分.<p>
	 *
	 */
	public String adj_typ() {
		return getConstString(offset + 75, $adj_typ);
	}

	/**
	 * Fraction adjustment type 端数調整区分.<p>
	 *
	 */
	public void adj_typ(String value) {
		setConstString(offset + 75, $adj_typ, value);
	}


	/**
	 * Fraction adjustment type name 端数調整区分名.<p>
	 *
	 */
	public String adj_typ_nm() {
		return getConstString(offset + 76, $adj_typ_nm);
	}

	/**
	 * Fraction adjustment type name 端数調整区分名.<p>
	 *
	 */
	public void adj_typ_nm(String value) {
		setConstString(offset + 76, $adj_typ_nm, value);
	}


	/**
	 * WIP type 仕掛区分.<p>
	 *
	 */
	public String wip_typ() {
		return getConstString(offset + 77, $wip_typ);
	}

	/**
	 * WIP type 仕掛区分.<p>
	 *
	 */
	public void wip_typ(String value) {
		setConstString(offset + 77, $wip_typ, value);
	}


	/**
	 * WIP type name 仕掛区分名.<p>
	 *
	 */
	public String wip_typ_nm() {
		return getConstString(offset + 78, $wip_typ_nm);
	}

	/**
	 * WIP type name 仕掛区分名.<p>
	 *
	 */
	public void wip_typ_nm(String value) {
		setConstString(offset + 78, $wip_typ_nm, value);
	}


	/**
	 * Breakdown aggregated type 内訳集計区分.<p>
	 *
	 */
	public String bd_agg_typ() {
		return getConstString(offset + 79, $bd_agg_typ);
	}

	/**
	 * Breakdown aggregated type 内訳集計区分.<p>
	 *
	 */
	public void bd_agg_typ(String value) {
		setConstString(offset + 79, $bd_agg_typ, value);
	}


	/**
	 * Aggregated breakdown type name 内訳集計区分名.<p>
	 *
	 */
	public String bd_agg_typ_nm() {
		return getConstString(offset + 80, $bd_agg_typ_nm);
	}

	/**
	 * Aggregated breakdown type name 内訳集計区分名.<p>
	 *
	 */
	public void bd_agg_typ_nm(String value) {
		setConstString(offset + 80, $bd_agg_typ_nm, value);
	}


	/**
	 * Adjustment cost element cd. 調整費目ＣＤ.<p>
	 *
	 */
	public String mrgn_expns_cd() {
		return getConstString(offset + 81, $mrgn_expns_cd);
	}

	/**
	 * Adjustment cost element cd. 調整費目ＣＤ.<p>
	 *
	 */
	public void mrgn_expns_cd(String value) {
		setConstString(offset + 81, $mrgn_expns_cd, value);
	}


	/**
	 * Adjustment cost element name 調整費目名.<p>
	 *
	 */
	public String mrgn_expns_nm() {
		return getConstString(offset + 82, $mrgn_expns_nm);
	}

	/**
	 * Adjustment cost element name 調整費目名.<p>
	 *
	 */
	public void mrgn_expns_nm(String value) {
		setConstString(offset + 82, $mrgn_expns_nm, value);
	}


	/**
	 * Purchase cost element item cd. 購買費目ＣＤ.<p>
	 *
	 */
	public String purc_expns_cd() {
		return getConstString(offset + 83, $purc_expns_cd);
	}

	/**
	 * Purchase cost element item cd. 購買費目ＣＤ.<p>
	 *
	 */
	public void purc_expns_cd(String value) {
		setConstString(offset + 83, $purc_expns_cd, value);
	}


	/**
	 * Purchase cost element name 購買費目名.<p>
	 *
	 */
	public String purc_expns_nm() {
		return getConstString(offset + 84, $purc_expns_nm);
	}

	/**
	 * Purchase cost element name 購買費目名.<p>
	 *
	 */
	public void purc_expns_nm(String value) {
		setConstString(offset + 84, $purc_expns_nm, value);
	}


	/**
	 * Subcontract cost element cd. 外注費目ＣＤ.<p>
	 *
	 */
	public String out_expns_cd() {
		return getConstString(offset + 85, $out_expns_cd);
	}

	/**
	 * Subcontract cost element cd. 外注費目ＣＤ.<p>
	 *
	 */
	public void out_expns_cd(String value) {
		setConstString(offset + 85, $out_expns_cd, value);
	}


	/**
	 * Subcontract cost element name 外注費目名.<p>
	 *
	 */
	public String out_expns_nm() {
		return getConstString(offset + 86, $out_expns_nm);
	}

	/**
	 * Subcontract cost element name 外注費目名.<p>
	 *
	 */
	public void out_expns_nm(String value) {
		setConstString(offset + 86, $out_expns_nm, value);
	}


	/**
	 * Input cost element cd. 投入費目ＣＤ.<p>
	 *
	 */
	public String inpt_expns_cd() {
		return getConstString(offset + 87, $inpt_expns_cd);
	}

	/**
	 * Input cost element cd. 投入費目ＣＤ.<p>
	 *
	 */
	public void inpt_expns_cd(String value) {
		setConstString(offset + 87, $inpt_expns_cd, value);
	}


	/**
	 * Input cost element name 投入費目名.<p>
	 *
	 */
	public String inpt_expns_nm() {
		return getConstString(offset + 88, $inpt_expns_nm);
	}

	/**
	 * Input cost element name 投入費目名.<p>
	 *
	 */
	public void inpt_expns_nm(String value) {
		setConstString(offset + 88, $inpt_expns_nm, value);
	}


	/**
	 * Self supply cost element cd. 自給費目ＣＤ.<p>
	 *
	 */
	public String ss_expns_cd() {
		return getConstString(offset + 89, $ss_expns_cd);
	}

	/**
	 * Self supply cost element cd. 自給費目ＣＤ.<p>
	 *
	 */
	public void ss_expns_cd(String value) {
		setConstString(offset + 89, $ss_expns_cd, value);
	}


	/**
	 * Self supply cost element name 自給費目名.<p>
	 *
	 */
	public String ss_expns_nm() {
		return getConstString(offset + 90, $ss_expns_nm);
	}

	/**
	 * Self supply cost element name 自給費目名.<p>
	 *
	 */
	public void ss_expns_nm(String value) {
		setConstString(offset + 90, $ss_expns_nm, value);
	}


	/**
	 * Cost element cd. for gain or loss of chargeable item 有償差額費目ＣＤ.<p>
	 *
	 */
	public String prov_expns_cd() {
		return getConstString(offset + 91, $prov_expns_cd);
	}

	/**
	 * Cost element cd. for gain or loss of chargeable item 有償差額費目ＣＤ.<p>
	 *
	 */
	public void prov_expns_cd(String value) {
		setConstString(offset + 91, $prov_expns_cd, value);
	}


	/**
	 * Gain or loss of chargeable supply cost element name 有償差額費目名.<p>
	 *
	 */
	public String prov_expns_nm() {
		return getConstString(offset + 92, $prov_expns_nm);
	}

	/**
	 * Gain or loss of chargeable supply cost element name 有償差額費目名.<p>
	 *
	 */
	public void prov_expns_nm(String value) {
		setConstString(offset + 92, $prov_expns_nm, value);
	}


	/**
	 * Explosion allocation type 展開割付区分.<p>
	 *
	 */
	public String exp_alloc_typ() {
		return getConstString(offset + 93, $exp_alloc_typ);
	}

	/**
	 * Explosion allocation type 展開割付区分.<p>
	 *
	 */
	public void exp_alloc_typ(String value) {
		setConstString(offset + 93, $exp_alloc_typ, value);
	}


	/**
	 * Explosion allocation type name 展開割付区分名.<p>
	 *
	 */
	public String exp_alloc_typ_nm() {
		return getConstString(offset + 94, $exp_alloc_typ_nm);
	}

	/**
	 * Explosion allocation type name 展開割付区分名.<p>
	 *
	 */
	public void exp_alloc_typ_nm(String value) {
		setConstString(offset + 94, $exp_alloc_typ_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 95, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 95, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 96, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 96, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 97, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 97, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 98, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 98, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 99, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 99, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 100, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 100, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 101, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 101, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 102, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 102, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 103, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 103, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 103, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 103, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 103, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 103, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 104, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 104, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 105, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 105, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 106, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 106, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 107, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 107, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 108, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 108, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 109, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 109, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 110, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 110, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 111, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 111, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 112, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 112, $del_ts, value);
	}


	public String getString(String name) {
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			return calc_ptn_cd();
		}
		if ($calc_ptn_nm_lcl.equalsIgnoreCase(name)) {
			return calc_ptn_nm_lcl();
		}
		if ($calc_ptn_nm.equalsIgnoreCase(name)) {
			return calc_ptn_nm();
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			return mfg_purc_typ();
		}
		if ($mfg_purc_typ_nm.equalsIgnoreCase(name)) {
			return mfg_purc_typ_nm();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($eval_typ_nm.equalsIgnoreCase(name)) {
			return eval_typ_nm();
		}
		if ($dpt_typ.equalsIgnoreCase(name)) {
			return dpt_typ();
		}
		if ($dpt_typ_nm.equalsIgnoreCase(name)) {
			return dpt_typ_nm();
		}
		if ($lot_typ.equalsIgnoreCase(name)) {
			return lot_typ();
		}
		if ($lot_typ_nm.equalsIgnoreCase(name)) {
			return lot_typ_nm();
		}
		if ($sublot_typ.equalsIgnoreCase(name)) {
			return sublot_typ();
		}
		if ($sublot_typ_nm.equalsIgnoreCase(name)) {
			return sublot_typ_nm();
		}
		if ($sno1_typ.equalsIgnoreCase(name)) {
			return sno1_typ();
		}
		if ($sno1_typ_nm.equalsIgnoreCase(name)) {
			return sno1_typ_nm();
		}
		if ($sno2_typ.equalsIgnoreCase(name)) {
			return sno2_typ();
		}
		if ($sno2_typ_nm.equalsIgnoreCase(name)) {
			return sno2_typ_nm();
		}
		if ($sno3_typ.equalsIgnoreCase(name)) {
			return sno3_typ();
		}
		if ($sno3_typ_nm.equalsIgnoreCase(name)) {
			return sno3_typ_nm();
		}
		if ($sno4_typ.equalsIgnoreCase(name)) {
			return sno4_typ();
		}
		if ($sno4_typ_nm.equalsIgnoreCase(name)) {
			return sno4_typ_nm();
		}
		if ($lot_act_typ.equalsIgnoreCase(name)) {
			return lot_act_typ();
		}
		if ($lot_act_typ_nm.equalsIgnoreCase(name)) {
			return lot_act_typ_nm();
		}
		if ($sublot_act_typ.equalsIgnoreCase(name)) {
			return sublot_act_typ();
		}
		if ($sublot_act_typ_nm.equalsIgnoreCase(name)) {
			return sublot_act_typ_nm();
		}
		if ($sno1_act_typ.equalsIgnoreCase(name)) {
			return sno1_act_typ();
		}
		if ($sno1_act_typ_nm.equalsIgnoreCase(name)) {
			return sno1_act_typ_nm();
		}
		if ($sno2_act_typ.equalsIgnoreCase(name)) {
			return sno2_act_typ();
		}
		if ($sno2_act_typ_nm.equalsIgnoreCase(name)) {
			return sno2_act_typ_nm();
		}
		if ($sno3_act_typ.equalsIgnoreCase(name)) {
			return sno3_act_typ();
		}
		if ($sno3_act_typ_nm.equalsIgnoreCase(name)) {
			return sno3_act_typ_nm();
		}
		if ($sno4_act_typ.equalsIgnoreCase(name)) {
			return sno4_act_typ();
		}
		if ($sno4_act_typ_nm.equalsIgnoreCase(name)) {
			return sno4_act_typ_nm();
		}
		if ($itm_mfg_inst_no_set_typ.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no_set_typ();
		}
		if ($itm_mfg_inst_no_set_typ_nm.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no_set_typ_nm();
		}
		if ($mfg_act_no_set_typ.equalsIgnoreCase(name)) {
			return mfg_act_no_set_typ();
		}
		if ($mfg_act_no_set_typ_nm.equalsIgnoreCase(name)) {
			return mfg_act_no_set_typ_nm();
		}
		if ($oper_act_no_set_typ.equalsIgnoreCase(name)) {
			return oper_act_no_set_typ();
		}
		if ($oper_act_no_set_typ_nm.equalsIgnoreCase(name)) {
			return oper_act_no_set_typ_nm();
		}
		if ($lot_exp_typ.equalsIgnoreCase(name)) {
			return lot_exp_typ();
		}
		if ($lot_exp_typ_nm.equalsIgnoreCase(name)) {
			return lot_exp_typ_nm();
		}
		if ($sublot_exp_typ.equalsIgnoreCase(name)) {
			return sublot_exp_typ();
		}
		if ($sublot_exp_typ_nm.equalsIgnoreCase(name)) {
			return sublot_exp_typ_nm();
		}
		if ($sno1_exp_typ.equalsIgnoreCase(name)) {
			return sno1_exp_typ();
		}
		if ($sno1_exp_typ_nm.equalsIgnoreCase(name)) {
			return sno1_exp_typ_nm();
		}
		if ($sno2_exp_typ.equalsIgnoreCase(name)) {
			return sno2_exp_typ();
		}
		if ($sno2_exp_typ_nm.equalsIgnoreCase(name)) {
			return sno2_exp_typ_nm();
		}
		if ($sno3_exp_typ.equalsIgnoreCase(name)) {
			return sno3_exp_typ();
		}
		if ($sno3_exp_typ_nm.equalsIgnoreCase(name)) {
			return sno3_exp_typ_nm();
		}
		if ($sno4_exp_typ.equalsIgnoreCase(name)) {
			return sno4_exp_typ();
		}
		if ($sno4_exp_typ_nm.equalsIgnoreCase(name)) {
			return sno4_exp_typ_nm();
		}
		if ($dpt_loss_eval_typ.equalsIgnoreCase(name)) {
			return dpt_loss_eval_typ();
		}
		if ($dpt_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return dpt_loss_eval_typ_nm();
		}
		if ($lot_loss_eval_typ.equalsIgnoreCase(name)) {
			return lot_loss_eval_typ();
		}
		if ($lot_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return lot_loss_eval_typ_nm();
		}
		if ($sublot_loss_eval_typ.equalsIgnoreCase(name)) {
			return sublot_loss_eval_typ();
		}
		if ($sublot_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return sublot_loss_eval_typ_nm();
		}
		if ($sno1_loss_eval_typ.equalsIgnoreCase(name)) {
			return sno1_loss_eval_typ();
		}
		if ($sno1_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return sno1_loss_eval_typ_nm();
		}
		if ($sno2_loss_eval_typ.equalsIgnoreCase(name)) {
			return sno2_loss_eval_typ();
		}
		if ($sno2_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return sno2_loss_eval_typ_nm();
		}
		if ($sno3_loss_eval_typ.equalsIgnoreCase(name)) {
			return sno3_loss_eval_typ();
		}
		if ($sno3_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return sno3_loss_eval_typ_nm();
		}
		if ($sno4_loss_eval_typ.equalsIgnoreCase(name)) {
			return sno4_loss_eval_typ();
		}
		if ($sno4_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return sno4_loss_eval_typ_nm();
		}
		if ($asst_loss_eval_typ.equalsIgnoreCase(name)) {
			return asst_loss_eval_typ();
		}
		if ($asst_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return asst_loss_eval_typ_nm();
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			return std_rnd_typ();
		}
		if ($std_rnd_typ_nm.equalsIgnoreCase(name)) {
			return std_rnd_typ_nm();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		if ($ave_rnd_typ_nm.equalsIgnoreCase(name)) {
			return ave_rnd_typ_nm();
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			return adj_typ();
		}
		if ($adj_typ_nm.equalsIgnoreCase(name)) {
			return adj_typ_nm();
		}
		if ($wip_typ.equalsIgnoreCase(name)) {
			return wip_typ();
		}
		if ($wip_typ_nm.equalsIgnoreCase(name)) {
			return wip_typ_nm();
		}
		if ($bd_agg_typ.equalsIgnoreCase(name)) {
			return bd_agg_typ();
		}
		if ($bd_agg_typ_nm.equalsIgnoreCase(name)) {
			return bd_agg_typ_nm();
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			return mrgn_expns_cd();
		}
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			return mrgn_expns_nm();
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			return purc_expns_cd();
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			return purc_expns_nm();
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			return out_expns_cd();
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			return out_expns_nm();
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			return inpt_expns_cd();
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			return inpt_expns_nm();
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			return ss_expns_cd();
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			return ss_expns_nm();
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			return prov_expns_cd();
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			return prov_expns_nm();
		}
		if ($exp_alloc_typ.equalsIgnoreCase(name)) {
			return exp_alloc_typ();
		}
		if ($exp_alloc_typ_nm.equalsIgnoreCase(name)) {
			return exp_alloc_typ_nm();
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
		if ($std_dec_place.equalsIgnoreCase(name)) {
			return std_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
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
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			return calc_ptn_cd();
		}
		if ($calc_ptn_nm_lcl.equalsIgnoreCase(name)) {
			return calc_ptn_nm_lcl();
		}
		if ($calc_ptn_nm.equalsIgnoreCase(name)) {
			return calc_ptn_nm();
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			return mfg_purc_typ();
		}
		if ($mfg_purc_typ_nm.equalsIgnoreCase(name)) {
			return mfg_purc_typ_nm();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($eval_typ_nm.equalsIgnoreCase(name)) {
			return eval_typ_nm();
		}
		if ($dpt_typ.equalsIgnoreCase(name)) {
			return dpt_typ();
		}
		if ($dpt_typ_nm.equalsIgnoreCase(name)) {
			return dpt_typ_nm();
		}
		if ($lot_typ.equalsIgnoreCase(name)) {
			return lot_typ();
		}
		if ($lot_typ_nm.equalsIgnoreCase(name)) {
			return lot_typ_nm();
		}
		if ($sublot_typ.equalsIgnoreCase(name)) {
			return sublot_typ();
		}
		if ($sublot_typ_nm.equalsIgnoreCase(name)) {
			return sublot_typ_nm();
		}
		if ($sno1_typ.equalsIgnoreCase(name)) {
			return sno1_typ();
		}
		if ($sno1_typ_nm.equalsIgnoreCase(name)) {
			return sno1_typ_nm();
		}
		if ($sno2_typ.equalsIgnoreCase(name)) {
			return sno2_typ();
		}
		if ($sno2_typ_nm.equalsIgnoreCase(name)) {
			return sno2_typ_nm();
		}
		if ($sno3_typ.equalsIgnoreCase(name)) {
			return sno3_typ();
		}
		if ($sno3_typ_nm.equalsIgnoreCase(name)) {
			return sno3_typ_nm();
		}
		if ($sno4_typ.equalsIgnoreCase(name)) {
			return sno4_typ();
		}
		if ($sno4_typ_nm.equalsIgnoreCase(name)) {
			return sno4_typ_nm();
		}
		if ($lot_act_typ.equalsIgnoreCase(name)) {
			return lot_act_typ();
		}
		if ($lot_act_typ_nm.equalsIgnoreCase(name)) {
			return lot_act_typ_nm();
		}
		if ($sublot_act_typ.equalsIgnoreCase(name)) {
			return sublot_act_typ();
		}
		if ($sublot_act_typ_nm.equalsIgnoreCase(name)) {
			return sublot_act_typ_nm();
		}
		if ($sno1_act_typ.equalsIgnoreCase(name)) {
			return sno1_act_typ();
		}
		if ($sno1_act_typ_nm.equalsIgnoreCase(name)) {
			return sno1_act_typ_nm();
		}
		if ($sno2_act_typ.equalsIgnoreCase(name)) {
			return sno2_act_typ();
		}
		if ($sno2_act_typ_nm.equalsIgnoreCase(name)) {
			return sno2_act_typ_nm();
		}
		if ($sno3_act_typ.equalsIgnoreCase(name)) {
			return sno3_act_typ();
		}
		if ($sno3_act_typ_nm.equalsIgnoreCase(name)) {
			return sno3_act_typ_nm();
		}
		if ($sno4_act_typ.equalsIgnoreCase(name)) {
			return sno4_act_typ();
		}
		if ($sno4_act_typ_nm.equalsIgnoreCase(name)) {
			return sno4_act_typ_nm();
		}
		if ($itm_mfg_inst_no_set_typ.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no_set_typ();
		}
		if ($itm_mfg_inst_no_set_typ_nm.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no_set_typ_nm();
		}
		if ($mfg_act_no_set_typ.equalsIgnoreCase(name)) {
			return mfg_act_no_set_typ();
		}
		if ($mfg_act_no_set_typ_nm.equalsIgnoreCase(name)) {
			return mfg_act_no_set_typ_nm();
		}
		if ($oper_act_no_set_typ.equalsIgnoreCase(name)) {
			return oper_act_no_set_typ();
		}
		if ($oper_act_no_set_typ_nm.equalsIgnoreCase(name)) {
			return oper_act_no_set_typ_nm();
		}
		if ($lot_exp_typ.equalsIgnoreCase(name)) {
			return lot_exp_typ();
		}
		if ($lot_exp_typ_nm.equalsIgnoreCase(name)) {
			return lot_exp_typ_nm();
		}
		if ($sublot_exp_typ.equalsIgnoreCase(name)) {
			return sublot_exp_typ();
		}
		if ($sublot_exp_typ_nm.equalsIgnoreCase(name)) {
			return sublot_exp_typ_nm();
		}
		if ($sno1_exp_typ.equalsIgnoreCase(name)) {
			return sno1_exp_typ();
		}
		if ($sno1_exp_typ_nm.equalsIgnoreCase(name)) {
			return sno1_exp_typ_nm();
		}
		if ($sno2_exp_typ.equalsIgnoreCase(name)) {
			return sno2_exp_typ();
		}
		if ($sno2_exp_typ_nm.equalsIgnoreCase(name)) {
			return sno2_exp_typ_nm();
		}
		if ($sno3_exp_typ.equalsIgnoreCase(name)) {
			return sno3_exp_typ();
		}
		if ($sno3_exp_typ_nm.equalsIgnoreCase(name)) {
			return sno3_exp_typ_nm();
		}
		if ($sno4_exp_typ.equalsIgnoreCase(name)) {
			return sno4_exp_typ();
		}
		if ($sno4_exp_typ_nm.equalsIgnoreCase(name)) {
			return sno4_exp_typ_nm();
		}
		if ($dpt_loss_eval_typ.equalsIgnoreCase(name)) {
			return dpt_loss_eval_typ();
		}
		if ($dpt_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return dpt_loss_eval_typ_nm();
		}
		if ($lot_loss_eval_typ.equalsIgnoreCase(name)) {
			return lot_loss_eval_typ();
		}
		if ($lot_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return lot_loss_eval_typ_nm();
		}
		if ($sublot_loss_eval_typ.equalsIgnoreCase(name)) {
			return sublot_loss_eval_typ();
		}
		if ($sublot_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return sublot_loss_eval_typ_nm();
		}
		if ($sno1_loss_eval_typ.equalsIgnoreCase(name)) {
			return sno1_loss_eval_typ();
		}
		if ($sno1_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return sno1_loss_eval_typ_nm();
		}
		if ($sno2_loss_eval_typ.equalsIgnoreCase(name)) {
			return sno2_loss_eval_typ();
		}
		if ($sno2_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return sno2_loss_eval_typ_nm();
		}
		if ($sno3_loss_eval_typ.equalsIgnoreCase(name)) {
			return sno3_loss_eval_typ();
		}
		if ($sno3_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return sno3_loss_eval_typ_nm();
		}
		if ($sno4_loss_eval_typ.equalsIgnoreCase(name)) {
			return sno4_loss_eval_typ();
		}
		if ($sno4_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return sno4_loss_eval_typ_nm();
		}
		if ($asst_loss_eval_typ.equalsIgnoreCase(name)) {
			return asst_loss_eval_typ();
		}
		if ($asst_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			return asst_loss_eval_typ_nm();
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			return std_rnd_typ();
		}
		if ($std_rnd_typ_nm.equalsIgnoreCase(name)) {
			return std_rnd_typ_nm();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		if ($ave_rnd_typ_nm.equalsIgnoreCase(name)) {
			return ave_rnd_typ_nm();
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			return adj_typ();
		}
		if ($adj_typ_nm.equalsIgnoreCase(name)) {
			return adj_typ_nm();
		}
		if ($wip_typ.equalsIgnoreCase(name)) {
			return wip_typ();
		}
		if ($wip_typ_nm.equalsIgnoreCase(name)) {
			return wip_typ_nm();
		}
		if ($bd_agg_typ.equalsIgnoreCase(name)) {
			return bd_agg_typ();
		}
		if ($bd_agg_typ_nm.equalsIgnoreCase(name)) {
			return bd_agg_typ_nm();
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			return mrgn_expns_cd();
		}
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			return mrgn_expns_nm();
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			return purc_expns_cd();
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			return purc_expns_nm();
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			return out_expns_cd();
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			return out_expns_nm();
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			return inpt_expns_cd();
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			return inpt_expns_nm();
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			return ss_expns_cd();
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			return ss_expns_nm();
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			return prov_expns_cd();
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			return prov_expns_nm();
		}
		if ($exp_alloc_typ.equalsIgnoreCase(name)) {
			return exp_alloc_typ();
		}
		if ($exp_alloc_typ_nm.equalsIgnoreCase(name)) {
			return exp_alloc_typ_nm();
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
		if ($std_dec_place.equalsIgnoreCase(name)) {
			return std_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
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
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			calc_ptn_cd(value);
			return;
		}
		if ($calc_ptn_nm_lcl.equalsIgnoreCase(name)) {
			calc_ptn_nm_lcl(value);
			return;
		}
		if ($calc_ptn_nm.equalsIgnoreCase(name)) {
			calc_ptn_nm(value);
			return;
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			mfg_purc_typ(value);
			return;
		}
		if ($mfg_purc_typ_nm.equalsIgnoreCase(name)) {
			mfg_purc_typ_nm(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($eval_typ_nm.equalsIgnoreCase(name)) {
			eval_typ_nm(value);
			return;
		}
		if ($dpt_typ.equalsIgnoreCase(name)) {
			dpt_typ(value);
			return;
		}
		if ($dpt_typ_nm.equalsIgnoreCase(name)) {
			dpt_typ_nm(value);
			return;
		}
		if ($lot_typ.equalsIgnoreCase(name)) {
			lot_typ(value);
			return;
		}
		if ($lot_typ_nm.equalsIgnoreCase(name)) {
			lot_typ_nm(value);
			return;
		}
		if ($sublot_typ.equalsIgnoreCase(name)) {
			sublot_typ(value);
			return;
		}
		if ($sublot_typ_nm.equalsIgnoreCase(name)) {
			sublot_typ_nm(value);
			return;
		}
		if ($sno1_typ.equalsIgnoreCase(name)) {
			sno1_typ(value);
			return;
		}
		if ($sno1_typ_nm.equalsIgnoreCase(name)) {
			sno1_typ_nm(value);
			return;
		}
		if ($sno2_typ.equalsIgnoreCase(name)) {
			sno2_typ(value);
			return;
		}
		if ($sno2_typ_nm.equalsIgnoreCase(name)) {
			sno2_typ_nm(value);
			return;
		}
		if ($sno3_typ.equalsIgnoreCase(name)) {
			sno3_typ(value);
			return;
		}
		if ($sno3_typ_nm.equalsIgnoreCase(name)) {
			sno3_typ_nm(value);
			return;
		}
		if ($sno4_typ.equalsIgnoreCase(name)) {
			sno4_typ(value);
			return;
		}
		if ($sno4_typ_nm.equalsIgnoreCase(name)) {
			sno4_typ_nm(value);
			return;
		}
		if ($lot_act_typ.equalsIgnoreCase(name)) {
			lot_act_typ(value);
			return;
		}
		if ($lot_act_typ_nm.equalsIgnoreCase(name)) {
			lot_act_typ_nm(value);
			return;
		}
		if ($sublot_act_typ.equalsIgnoreCase(name)) {
			sublot_act_typ(value);
			return;
		}
		if ($sublot_act_typ_nm.equalsIgnoreCase(name)) {
			sublot_act_typ_nm(value);
			return;
		}
		if ($sno1_act_typ.equalsIgnoreCase(name)) {
			sno1_act_typ(value);
			return;
		}
		if ($sno1_act_typ_nm.equalsIgnoreCase(name)) {
			sno1_act_typ_nm(value);
			return;
		}
		if ($sno2_act_typ.equalsIgnoreCase(name)) {
			sno2_act_typ(value);
			return;
		}
		if ($sno2_act_typ_nm.equalsIgnoreCase(name)) {
			sno2_act_typ_nm(value);
			return;
		}
		if ($sno3_act_typ.equalsIgnoreCase(name)) {
			sno3_act_typ(value);
			return;
		}
		if ($sno3_act_typ_nm.equalsIgnoreCase(name)) {
			sno3_act_typ_nm(value);
			return;
		}
		if ($sno4_act_typ.equalsIgnoreCase(name)) {
			sno4_act_typ(value);
			return;
		}
		if ($sno4_act_typ_nm.equalsIgnoreCase(name)) {
			sno4_act_typ_nm(value);
			return;
		}
		if ($itm_mfg_inst_no_set_typ.equalsIgnoreCase(name)) {
			itm_mfg_inst_no_set_typ(value);
			return;
		}
		if ($itm_mfg_inst_no_set_typ_nm.equalsIgnoreCase(name)) {
			itm_mfg_inst_no_set_typ_nm(value);
			return;
		}
		if ($mfg_act_no_set_typ.equalsIgnoreCase(name)) {
			mfg_act_no_set_typ(value);
			return;
		}
		if ($mfg_act_no_set_typ_nm.equalsIgnoreCase(name)) {
			mfg_act_no_set_typ_nm(value);
			return;
		}
		if ($oper_act_no_set_typ.equalsIgnoreCase(name)) {
			oper_act_no_set_typ(value);
			return;
		}
		if ($oper_act_no_set_typ_nm.equalsIgnoreCase(name)) {
			oper_act_no_set_typ_nm(value);
			return;
		}
		if ($lot_exp_typ.equalsIgnoreCase(name)) {
			lot_exp_typ(value);
			return;
		}
		if ($lot_exp_typ_nm.equalsIgnoreCase(name)) {
			lot_exp_typ_nm(value);
			return;
		}
		if ($sublot_exp_typ.equalsIgnoreCase(name)) {
			sublot_exp_typ(value);
			return;
		}
		if ($sublot_exp_typ_nm.equalsIgnoreCase(name)) {
			sublot_exp_typ_nm(value);
			return;
		}
		if ($sno1_exp_typ.equalsIgnoreCase(name)) {
			sno1_exp_typ(value);
			return;
		}
		if ($sno1_exp_typ_nm.equalsIgnoreCase(name)) {
			sno1_exp_typ_nm(value);
			return;
		}
		if ($sno2_exp_typ.equalsIgnoreCase(name)) {
			sno2_exp_typ(value);
			return;
		}
		if ($sno2_exp_typ_nm.equalsIgnoreCase(name)) {
			sno2_exp_typ_nm(value);
			return;
		}
		if ($sno3_exp_typ.equalsIgnoreCase(name)) {
			sno3_exp_typ(value);
			return;
		}
		if ($sno3_exp_typ_nm.equalsIgnoreCase(name)) {
			sno3_exp_typ_nm(value);
			return;
		}
		if ($sno4_exp_typ.equalsIgnoreCase(name)) {
			sno4_exp_typ(value);
			return;
		}
		if ($sno4_exp_typ_nm.equalsIgnoreCase(name)) {
			sno4_exp_typ_nm(value);
			return;
		}
		if ($dpt_loss_eval_typ.equalsIgnoreCase(name)) {
			dpt_loss_eval_typ(value);
			return;
		}
		if ($dpt_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			dpt_loss_eval_typ_nm(value);
			return;
		}
		if ($lot_loss_eval_typ.equalsIgnoreCase(name)) {
			lot_loss_eval_typ(value);
			return;
		}
		if ($lot_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			lot_loss_eval_typ_nm(value);
			return;
		}
		if ($sublot_loss_eval_typ.equalsIgnoreCase(name)) {
			sublot_loss_eval_typ(value);
			return;
		}
		if ($sublot_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			sublot_loss_eval_typ_nm(value);
			return;
		}
		if ($sno1_loss_eval_typ.equalsIgnoreCase(name)) {
			sno1_loss_eval_typ(value);
			return;
		}
		if ($sno1_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			sno1_loss_eval_typ_nm(value);
			return;
		}
		if ($sno2_loss_eval_typ.equalsIgnoreCase(name)) {
			sno2_loss_eval_typ(value);
			return;
		}
		if ($sno2_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			sno2_loss_eval_typ_nm(value);
			return;
		}
		if ($sno3_loss_eval_typ.equalsIgnoreCase(name)) {
			sno3_loss_eval_typ(value);
			return;
		}
		if ($sno3_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			sno3_loss_eval_typ_nm(value);
			return;
		}
		if ($sno4_loss_eval_typ.equalsIgnoreCase(name)) {
			sno4_loss_eval_typ(value);
			return;
		}
		if ($sno4_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			sno4_loss_eval_typ_nm(value);
			return;
		}
		if ($asst_loss_eval_typ.equalsIgnoreCase(name)) {
			asst_loss_eval_typ(value);
			return;
		}
		if ($asst_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			asst_loss_eval_typ_nm(value);
			return;
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			std_rnd_typ(value);
			return;
		}
		if ($std_rnd_typ_nm.equalsIgnoreCase(name)) {
			std_rnd_typ_nm(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ_nm.equalsIgnoreCase(name)) {
			ave_rnd_typ_nm(value);
			return;
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			adj_typ(value);
			return;
		}
		if ($adj_typ_nm.equalsIgnoreCase(name)) {
			adj_typ_nm(value);
			return;
		}
		if ($wip_typ.equalsIgnoreCase(name)) {
			wip_typ(value);
			return;
		}
		if ($wip_typ_nm.equalsIgnoreCase(name)) {
			wip_typ_nm(value);
			return;
		}
		if ($bd_agg_typ.equalsIgnoreCase(name)) {
			bd_agg_typ(value);
			return;
		}
		if ($bd_agg_typ_nm.equalsIgnoreCase(name)) {
			bd_agg_typ_nm(value);
			return;
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			mrgn_expns_cd(value);
			return;
		}
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			mrgn_expns_nm(value);
			return;
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			purc_expns_cd(value);
			return;
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			purc_expns_nm(value);
			return;
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			out_expns_cd(value);
			return;
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			out_expns_nm(value);
			return;
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			inpt_expns_cd(value);
			return;
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			inpt_expns_nm(value);
			return;
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			ss_expns_cd(value);
			return;
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			ss_expns_nm(value);
			return;
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			prov_expns_cd(value);
			return;
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			prov_expns_nm(value);
			return;
		}
		if ($exp_alloc_typ.equalsIgnoreCase(name)) {
			exp_alloc_typ(value);
			return;
		}
		if ($exp_alloc_typ_nm.equalsIgnoreCase(name)) {
			exp_alloc_typ_nm(value);
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
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			calc_ptn_cd(value);
			return;
		}
		if ($calc_ptn_nm_lcl.equalsIgnoreCase(name)) {
			calc_ptn_nm_lcl(value);
			return;
		}
		if ($calc_ptn_nm.equalsIgnoreCase(name)) {
			calc_ptn_nm(value);
			return;
		}
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			mfg_purc_typ(value);
			return;
		}
		if ($mfg_purc_typ_nm.equalsIgnoreCase(name)) {
			mfg_purc_typ_nm(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($eval_typ_nm.equalsIgnoreCase(name)) {
			eval_typ_nm(value);
			return;
		}
		if ($dpt_typ.equalsIgnoreCase(name)) {
			dpt_typ(value);
			return;
		}
		if ($dpt_typ_nm.equalsIgnoreCase(name)) {
			dpt_typ_nm(value);
			return;
		}
		if ($lot_typ.equalsIgnoreCase(name)) {
			lot_typ(value);
			return;
		}
		if ($lot_typ_nm.equalsIgnoreCase(name)) {
			lot_typ_nm(value);
			return;
		}
		if ($sublot_typ.equalsIgnoreCase(name)) {
			sublot_typ(value);
			return;
		}
		if ($sublot_typ_nm.equalsIgnoreCase(name)) {
			sublot_typ_nm(value);
			return;
		}
		if ($sno1_typ.equalsIgnoreCase(name)) {
			sno1_typ(value);
			return;
		}
		if ($sno1_typ_nm.equalsIgnoreCase(name)) {
			sno1_typ_nm(value);
			return;
		}
		if ($sno2_typ.equalsIgnoreCase(name)) {
			sno2_typ(value);
			return;
		}
		if ($sno2_typ_nm.equalsIgnoreCase(name)) {
			sno2_typ_nm(value);
			return;
		}
		if ($sno3_typ.equalsIgnoreCase(name)) {
			sno3_typ(value);
			return;
		}
		if ($sno3_typ_nm.equalsIgnoreCase(name)) {
			sno3_typ_nm(value);
			return;
		}
		if ($sno4_typ.equalsIgnoreCase(name)) {
			sno4_typ(value);
			return;
		}
		if ($sno4_typ_nm.equalsIgnoreCase(name)) {
			sno4_typ_nm(value);
			return;
		}
		if ($lot_act_typ.equalsIgnoreCase(name)) {
			lot_act_typ(value);
			return;
		}
		if ($lot_act_typ_nm.equalsIgnoreCase(name)) {
			lot_act_typ_nm(value);
			return;
		}
		if ($sublot_act_typ.equalsIgnoreCase(name)) {
			sublot_act_typ(value);
			return;
		}
		if ($sublot_act_typ_nm.equalsIgnoreCase(name)) {
			sublot_act_typ_nm(value);
			return;
		}
		if ($sno1_act_typ.equalsIgnoreCase(name)) {
			sno1_act_typ(value);
			return;
		}
		if ($sno1_act_typ_nm.equalsIgnoreCase(name)) {
			sno1_act_typ_nm(value);
			return;
		}
		if ($sno2_act_typ.equalsIgnoreCase(name)) {
			sno2_act_typ(value);
			return;
		}
		if ($sno2_act_typ_nm.equalsIgnoreCase(name)) {
			sno2_act_typ_nm(value);
			return;
		}
		if ($sno3_act_typ.equalsIgnoreCase(name)) {
			sno3_act_typ(value);
			return;
		}
		if ($sno3_act_typ_nm.equalsIgnoreCase(name)) {
			sno3_act_typ_nm(value);
			return;
		}
		if ($sno4_act_typ.equalsIgnoreCase(name)) {
			sno4_act_typ(value);
			return;
		}
		if ($sno4_act_typ_nm.equalsIgnoreCase(name)) {
			sno4_act_typ_nm(value);
			return;
		}
		if ($itm_mfg_inst_no_set_typ.equalsIgnoreCase(name)) {
			itm_mfg_inst_no_set_typ(value);
			return;
		}
		if ($itm_mfg_inst_no_set_typ_nm.equalsIgnoreCase(name)) {
			itm_mfg_inst_no_set_typ_nm(value);
			return;
		}
		if ($mfg_act_no_set_typ.equalsIgnoreCase(name)) {
			mfg_act_no_set_typ(value);
			return;
		}
		if ($mfg_act_no_set_typ_nm.equalsIgnoreCase(name)) {
			mfg_act_no_set_typ_nm(value);
			return;
		}
		if ($oper_act_no_set_typ.equalsIgnoreCase(name)) {
			oper_act_no_set_typ(value);
			return;
		}
		if ($oper_act_no_set_typ_nm.equalsIgnoreCase(name)) {
			oper_act_no_set_typ_nm(value);
			return;
		}
		if ($lot_exp_typ.equalsIgnoreCase(name)) {
			lot_exp_typ(value);
			return;
		}
		if ($lot_exp_typ_nm.equalsIgnoreCase(name)) {
			lot_exp_typ_nm(value);
			return;
		}
		if ($sublot_exp_typ.equalsIgnoreCase(name)) {
			sublot_exp_typ(value);
			return;
		}
		if ($sublot_exp_typ_nm.equalsIgnoreCase(name)) {
			sublot_exp_typ_nm(value);
			return;
		}
		if ($sno1_exp_typ.equalsIgnoreCase(name)) {
			sno1_exp_typ(value);
			return;
		}
		if ($sno1_exp_typ_nm.equalsIgnoreCase(name)) {
			sno1_exp_typ_nm(value);
			return;
		}
		if ($sno2_exp_typ.equalsIgnoreCase(name)) {
			sno2_exp_typ(value);
			return;
		}
		if ($sno2_exp_typ_nm.equalsIgnoreCase(name)) {
			sno2_exp_typ_nm(value);
			return;
		}
		if ($sno3_exp_typ.equalsIgnoreCase(name)) {
			sno3_exp_typ(value);
			return;
		}
		if ($sno3_exp_typ_nm.equalsIgnoreCase(name)) {
			sno3_exp_typ_nm(value);
			return;
		}
		if ($sno4_exp_typ.equalsIgnoreCase(name)) {
			sno4_exp_typ(value);
			return;
		}
		if ($sno4_exp_typ_nm.equalsIgnoreCase(name)) {
			sno4_exp_typ_nm(value);
			return;
		}
		if ($dpt_loss_eval_typ.equalsIgnoreCase(name)) {
			dpt_loss_eval_typ(value);
			return;
		}
		if ($dpt_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			dpt_loss_eval_typ_nm(value);
			return;
		}
		if ($lot_loss_eval_typ.equalsIgnoreCase(name)) {
			lot_loss_eval_typ(value);
			return;
		}
		if ($lot_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			lot_loss_eval_typ_nm(value);
			return;
		}
		if ($sublot_loss_eval_typ.equalsIgnoreCase(name)) {
			sublot_loss_eval_typ(value);
			return;
		}
		if ($sublot_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			sublot_loss_eval_typ_nm(value);
			return;
		}
		if ($sno1_loss_eval_typ.equalsIgnoreCase(name)) {
			sno1_loss_eval_typ(value);
			return;
		}
		if ($sno1_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			sno1_loss_eval_typ_nm(value);
			return;
		}
		if ($sno2_loss_eval_typ.equalsIgnoreCase(name)) {
			sno2_loss_eval_typ(value);
			return;
		}
		if ($sno2_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			sno2_loss_eval_typ_nm(value);
			return;
		}
		if ($sno3_loss_eval_typ.equalsIgnoreCase(name)) {
			sno3_loss_eval_typ(value);
			return;
		}
		if ($sno3_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			sno3_loss_eval_typ_nm(value);
			return;
		}
		if ($sno4_loss_eval_typ.equalsIgnoreCase(name)) {
			sno4_loss_eval_typ(value);
			return;
		}
		if ($sno4_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			sno4_loss_eval_typ_nm(value);
			return;
		}
		if ($asst_loss_eval_typ.equalsIgnoreCase(name)) {
			asst_loss_eval_typ(value);
			return;
		}
		if ($asst_loss_eval_typ_nm.equalsIgnoreCase(name)) {
			asst_loss_eval_typ_nm(value);
			return;
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			std_rnd_typ(value);
			return;
		}
		if ($std_rnd_typ_nm.equalsIgnoreCase(name)) {
			std_rnd_typ_nm(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ_nm.equalsIgnoreCase(name)) {
			ave_rnd_typ_nm(value);
			return;
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			adj_typ(value);
			return;
		}
		if ($adj_typ_nm.equalsIgnoreCase(name)) {
			adj_typ_nm(value);
			return;
		}
		if ($wip_typ.equalsIgnoreCase(name)) {
			wip_typ(value);
			return;
		}
		if ($wip_typ_nm.equalsIgnoreCase(name)) {
			wip_typ_nm(value);
			return;
		}
		if ($bd_agg_typ.equalsIgnoreCase(name)) {
			bd_agg_typ(value);
			return;
		}
		if ($bd_agg_typ_nm.equalsIgnoreCase(name)) {
			bd_agg_typ_nm(value);
			return;
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			mrgn_expns_cd(value);
			return;
		}
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			mrgn_expns_nm(value);
			return;
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			purc_expns_cd(value);
			return;
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			purc_expns_nm(value);
			return;
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			out_expns_cd(value);
			return;
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			out_expns_nm(value);
			return;
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			inpt_expns_cd(value);
			return;
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			inpt_expns_nm(value);
			return;
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			ss_expns_cd(value);
			return;
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			ss_expns_nm(value);
			return;
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			prov_expns_cd(value);
			return;
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			prov_expns_nm(value);
			return;
		}
		if ($exp_alloc_typ.equalsIgnoreCase(name)) {
			exp_alloc_typ(value);
			return;
		}
		if ($exp_alloc_typ_nm.equalsIgnoreCase(name)) {
			exp_alloc_typ_nm(value);
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
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
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
		super.setBooleanNE(name, value);
	}



}

