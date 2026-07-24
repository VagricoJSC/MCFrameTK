package mcframe.serverMABS.MABSL1100;

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
 * ブロック"Srch01_Rslt4"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt4R_MC_A extends MCConstRow {

	/**
	 * BOM key ＢＯＭキー.<p>
	 *
	 */
	public static final String $bom_key = "bom_key";
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
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
	 * Inventory management type (Child) 在庫管理区分（子）.<p>
	 *
	 */
	public static final String $chd_stk_mng_typ = "chd_stk_mng_typ";
	/**
	 * Asset management type (Child) 資産管理区分（子）.<p>
	 *
	 */
	public static final String $chd_asset_mng_typ = "chd_asset_mng_typ";
	/**
	 * Child base unit cd. 子基準単位ＣＤ.<p>
	 *
	 */
	public static final String $chd_base_unit_cd = "chd_base_unit_cd";
	/**
	 * Child base unit name 子基準単位名.<p>
	 *
	 */
	public static final String $chd_base_unit_nm = "chd_base_unit_nm";
	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public static final String $chd_dec_place = "chd_dec_place";
	/**
	 * Lot No. management type (Child) ロット管理区分（子）.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Sublot management type (Child) サブロット管理区分（子）.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * SEIBAN No. 1 management type (Child) 手配ＮＯ１管理区分（子）.<p>
	 *
	 */
	public static final String $chd_sno1_mng_typ = "chd_sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type (Child) 手配ＮＯ２管理区分（子）.<p>
	 *
	 */
	public static final String $chd_sno2_mng_typ = "chd_sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type (Child) 手配ＮＯ３管理区分（子）.<p>
	 *
	 */
	public static final String $chd_sno3_mng_typ = "chd_sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type (Child) 手配ＮＯ４管理区分（子）.<p>
	 *
	 */
	public static final String $chd_sno4_mng_typ = "chd_sno4_mng_typ";
	/**
	 * BOM pattern (Child) 構成パタン（子）.<p>
	 *
	 */
	public static final String $chd_def_bom_ptn = "chd_def_bom_ptn";
	/**
	 * For version control (Child) 版管理対象（子）.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Phantom 架空.<p>
	 *
	 */
	public static final String $ph_flg = "ph_flg";
	/**
	 * Phantom BOM pattern 架空構成パタン.<p>
	 *
	 */
	public static final String $ph_bom_ptn = "ph_bom_ptn";
	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public static final String $alt_itm_flg = "alt_itm_flg";
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public static final String $alt_grp_nm = "alt_grp_nm";
	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public static final String $alt_itm_typ = "alt_itm_typ";
	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public static final String $alt_itm_typ_nm = "alt_itm_typ_nm";
	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public static final String $alt_itm_ratio = "alt_itm_ratio";
	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public static final String $alt_alloc_prio = "alt_alloc_prio";
	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public static final String $sno_typ1 = "sno_typ1";
	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public static final String $sno_typ_nm1 = "sno_typ_nm1";
	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public static final String $sno_typ2 = "sno_typ2";
	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public static final String $sno_typ_nm2 = "sno_typ_nm2";
	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public static final String $sno_typ3 = "sno_typ3";
	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public static final String $sno_typ_nm3 = "sno_typ_nm3";
	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public static final String $sno_typ4 = "sno_typ4";
	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public static final String $sno_typ_nm4 = "sno_typ_nm4";
	/**
	 * Min. SEIBAN No. 1 下限手配ＮＯ１.<p>
	 *
	 */
	public static final String $min_sno1 = "min_sno1";
	/**
	 * Min. SEIBAN No. 2 下限手配ＮＯ２.<p>
	 *
	 */
	public static final String $min_sno2 = "min_sno2";
	/**
	 * Min. SEIBAN No. 3 下限手配ＮＯ３.<p>
	 *
	 */
	public static final String $min_sno3 = "min_sno3";
	/**
	 * Min. SEIBAN No. 4 下限手配ＮＯ４.<p>
	 *
	 */
	public static final String $min_sno4 = "min_sno4";
	/**
	 * Max. SEIBAN No. 1 上限手配ＮＯ１.<p>
	 *
	 */
	public static final String $max_sno1 = "max_sno1";
	/**
	 * Max. SEIBAN No. 2 上限手配ＮＯ２.<p>
	 *
	 */
	public static final String $max_sno2 = "max_sno2";
	/**
	 * Max. SEIBAN No. 3 上限手配ＮＯ３.<p>
	 *
	 */
	public static final String $max_sno3 = "max_sno3";
	/**
	 * Max. SEIBAN No. 4 上限手配ＮＯ４.<p>
	 *
	 */
	public static final String $max_sno4 = "max_sno4";
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
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public static final String $par_inst_qty = "par_inst_qty";
	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public static final String $chd_rqmt_qty = "chd_rqmt_qty";
	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public static final String $chd_inpt_qty = "chd_inpt_qty";
	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public static final String $fxd_chd_rqmt_qty = "fxd_chd_rqmt_qty";
	/**
	 * By-product 副産品.<p>
	 *
	 */
	public static final String $byprod_flg = "byprod_flg";
	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public static final String $in_offst_typ = "in_offst_typ";
	/**
	 * Input offset type name 投入オフセット区分名.<p>
	 *
	 */
	public static final String $in_offst_typ_nm = "in_offst_typ_nm";
	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public static final String $in_offst = "in_offst";
	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public static final String $bkf_typ = "bkf_typ";
	/**
	 * Backflush type name バックフラッシュ区分名.<p>
	 *
	 */
	public static final String $bkf_typ_nm = "bkf_typ_nm";
	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public static final String $inst_lot_fix_flg = "inst_lot_fix_flg";
	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public static final String $lot_mix_flg = "lot_mix_flg";
	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public static final String $sublot_mix_flg = "sublot_mix_flg";
	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public static final String $alloc_ctl_typ = "alloc_ctl_typ";
	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public static final String $alloc_ctl_typ_nm = "alloc_ctl_typ_nm";
	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public static final String $main_itm_flg = "main_itm_flg";
	/**
	 * For yield calculation 収率計算用.<p>
	 *
	 */
	public static final String $yield_calc_flg = "yield_calc_flg";
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public static final String $inpt_ctl_typ = "inpt_ctl_typ";
	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public static final String $inpt_ctl_typ_nm = "inpt_ctl_typ_nm";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public static final String $chng_no = "chng_no";
	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public static final String $ext_sys_no_bom = "ext_sys_no_bom";
	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public static final String $not_cost_flg = "not_cost_flg";
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


	public static final MCMeta bom_key_META = createCommonMeta($bom_key, mcframe.commonMA.meta.MA_META.BOM_KEY);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta chd_itm_cd_META = createCommonMeta($chd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta chd_itm_sub1_META = createCommonMeta($chd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta chd_itm_sub2_META = createCommonMeta($chd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta chd_itm_sub3_META = createCommonMeta($chd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta chd_itm_nm_META = createCommonMeta($chd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta chd_itm_typ_META = createCommonMeta($chd_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta chd_itm_typ_nm_META = createCommonMeta($chd_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta chd_itm_typ_d_cd_META = createCommonMeta($chd_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta chd_itm_typ_d_nm_META = createCommonMeta($chd_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta chd_stk_mng_typ_META = createCommonMeta($chd_stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta chd_asset_mng_typ_META = createCommonMeta($chd_asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta chd_base_unit_cd_META = createCommonMeta($chd_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta chd_base_unit_nm_META = createCommonMeta($chd_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta chd_dec_place_META = createCommonMeta($chd_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta chd_sno1_mng_typ_META = createCommonMeta($chd_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chd_sno2_mng_typ_META = createCommonMeta($chd_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chd_sno3_mng_typ_META = createCommonMeta($chd_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chd_sno4_mng_typ_META = createCommonMeta($chd_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chd_def_bom_ptn_META = createCommonMeta($chd_def_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta ph_flg_META = createCommonMeta($ph_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ph_bom_ptn_META = createCommonMeta($ph_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta alt_itm_flg_META = createCommonMeta($alt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_nm_META = createCommonMeta($alt_grp_nm, mcframe.commonMA.meta.MA_META.ALT_GRP_NM);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_itm_typ_nm_META = createCommonMeta($alt_itm_typ_nm, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP_NM);
	public static final MCMeta alt_itm_ratio_META = createCommonMeta($alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta alt_alloc_prio_META = createCommonMeta($alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sno_typ1_META = createCommonMeta($sno_typ1, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno_typ_nm1_META = createCommonMeta($sno_typ_nm1, mcframe.commonMA.meta.MA_META.SNO_TYP_NM);
	public static final MCMeta sno_typ2_META = createCommonMeta($sno_typ2, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno_typ_nm2_META = createCommonMeta($sno_typ_nm2, mcframe.commonMA.meta.MA_META.SNO_TYP_NM);
	public static final MCMeta sno_typ3_META = createCommonMeta($sno_typ3, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno_typ_nm3_META = createCommonMeta($sno_typ_nm3, mcframe.commonMA.meta.MA_META.SNO_TYP_NM);
	public static final MCMeta sno_typ4_META = createCommonMeta($sno_typ4, mcframe.commonMA.meta.MA_META.SNO_TYP);
	public static final MCMeta sno_typ_nm4_META = createCommonMeta($sno_typ_nm4, mcframe.commonMA.meta.MA_META.SNO_TYP_NM);
	public static final MCMeta min_sno1_META = createCommonMeta($min_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta min_sno2_META = createCommonMeta($min_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta min_sno3_META = createCommonMeta($min_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta min_sno4_META = createCommonMeta($min_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta max_sno1_META = createCommonMeta($max_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta max_sno2_META = createCommonMeta($max_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta max_sno3_META = createCommonMeta($max_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta max_sno4_META = createCommonMeta($max_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta par_inst_qty_META = createCommonMeta($par_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_rqmt_qty_META = createCommonMeta($chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_inpt_qty_META = createCommonMeta($chd_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_chd_rqmt_qty_META = createCommonMeta($fxd_chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta byprod_flg_META = createCommonMeta($byprod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_offst_typ_META = createCommonMeta($in_offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta in_offst_typ_nm_META = createCommonMeta($in_offst_typ_nm, mcframe.commonMA.meta.MA_META.OFFST_TYP_NM);
	public static final MCMeta in_offst_META = createCommonMeta($in_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta bkf_typ_META = createCommonMeta($bkf_typ, mcframe.commonMA.meta.MA_META.BKF_TYP);
	public static final MCMeta bkf_typ_nm_META = createCommonMeta($bkf_typ_nm, mcframe.commonMA.meta.MA_META.BKF_TYP_NM);
	public static final MCMeta inst_lot_fix_flg_META = createCommonMeta($inst_lot_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mix_flg_META = createCommonMeta($lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_mix_flg_META = createCommonMeta($sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_ctl_typ_META = createCommonMeta($alloc_ctl_typ, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP);
	public static final MCMeta alloc_ctl_typ_nm_META = createCommonMeta($alloc_ctl_typ_nm, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP_NM);
	public static final MCMeta main_itm_flg_META = createCommonMeta($main_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_calc_flg_META = createCommonMeta($yield_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_ctl_typ_META = createCommonMeta($inpt_ctl_typ, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP);
	public static final MCMeta inpt_ctl_typ_nm_META = createCommonMeta($inpt_ctl_typ_nm, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP_NM);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta chng_no_META = createCommonMeta($chng_no, mcframe.commonMA.meta.MA_META.CHNG_NO);
	public static final MCMeta ext_sys_no_bom_META = createCommonMeta($ext_sys_no_bom, mcframe.commonMA.meta.MA_META.EXT_SYS_NO_BOM);
	public static final MCMeta not_cost_flg_META = createCommonMeta($not_cost_flg, mcframe.commonMA.meta.MA_META.FLG);
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

	protected static final ConstMetaList<Srch01_Rslt4R> constMetas = new ConstMetaList<Srch01_Rslt4R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bom_key_META,
			del_flg_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			wg_cd_META,
			wg_nm_META,
			bom_ptn_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			chd_itm_cd_META,
			chd_itm_sub1_META,
			chd_itm_sub2_META,
			chd_itm_sub3_META,
			chd_itm_nm_META,
			chd_itm_typ_META,
			chd_itm_typ_nm_META,
			chd_itm_typ_d_cd_META,
			chd_itm_typ_d_nm_META,
			chd_stk_mng_typ_META,
			chd_asset_mng_typ_META,
			chd_base_unit_cd_META,
			chd_base_unit_nm_META,
			chd_dec_place_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			chd_sno1_mng_typ_META,
			chd_sno2_mng_typ_META,
			chd_sno3_mng_typ_META,
			chd_sno4_mng_typ_META,
			chd_def_bom_ptn_META,
			ver_flg_META,
			ver_no_META,
			ph_flg_META,
			ph_bom_ptn_META,
			alt_itm_flg_META,
			alt_grp_cd_META,
			alt_grp_nm_META,
			alt_itm_typ_META,
			alt_itm_typ_nm_META,
			alt_itm_ratio_META,
			alt_alloc_prio_META,
			sno_typ1_META,
			sno_typ_nm1_META,
			sno_typ2_META,
			sno_typ_nm2_META,
			sno_typ3_META,
			sno_typ_nm3_META,
			sno_typ4_META,
			sno_typ_nm4_META,
			min_sno1_META,
			min_sno2_META,
			min_sno3_META,
			min_sno4_META,
			max_sno1_META,
			max_sno2_META,
			max_sno3_META,
			max_sno4_META,
			st_dt_META,
			end_dt_META,
			par_inst_qty_META,
			chd_rqmt_qty_META,
			chd_inpt_qty_META,
			fxd_chd_rqmt_qty_META,
			byprod_flg_META,
			in_offst_typ_META,
			in_offst_typ_nm_META,
			in_offst_META,
			bkf_typ_META,
			bkf_typ_nm_META,
			inst_lot_fix_flg_META,
			lot_mix_flg_META,
			sublot_mix_flg_META,
			alloc_ctl_typ_META,
			alloc_ctl_typ_nm_META,
			main_itm_flg_META,
			yield_calc_flg_META,
			inpt_ctl_typ_META,
			inpt_ctl_typ_nm_META,
			disp_seq_META,
			chng_no_META,
			ext_sys_no_bom_META,
			not_cost_flg_META,
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$chd_itm_typ, "MAC_ITM_TYP"},	// chd_itm_typ
				{$alt_itm_typ, "MAC_ALT_ITM_TYP"},	// alt_itm_typ
				{$sno_typ1, "MAC_SNO_TYP"},	// sno_typ1
				{$sno_typ2, "MAC_SNO_TYP"},	// sno_typ2
				{$sno_typ3, "MAC_SNO_TYP"},	// sno_typ3
				{$sno_typ4, "MAC_SNO_TYP"},	// sno_typ4
				{$in_offst_typ, "MAC_OFFST_TYP"},	// in_offst_typ
				{$bkf_typ, "MAC_BKF_TYP"},	// bkf_typ
				{$alloc_ctl_typ, "MAC_ALLOC_CTL_TYP"},	// alloc_ctl_typ
				{$inpt_ctl_typ, "MAC_INPT_CTL_TYP"}	// inpt_ctl_typ
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
	protected Srch01_Rslt4R_MC_A(ConstMetaList<? extends Srch01_Rslt4R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt4R clone() {
		return (Srch01_Rslt4R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt4R createInstance() {
		return (Srch01_Rslt4R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt4R getValues(String... names) {
		return (Srch01_Rslt4R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * BOM key ＢＯＭキー.<p>
	 *
	 */
	public String bom_key() {
		return getConstString(offset + 0, $bom_key);
	}

	/**
	 * BOM key ＢＯＭキー.<p>
	 *
	 */
	public void bom_key(String value) {
		setConstString(offset + 0, $bom_key, value);
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
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 2, $par_itm_cd);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 2, $par_itm_cd, value);
	}


	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 3, $par_itm_sub1);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 3, $par_itm_sub1, value);
	}


	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 4, $par_itm_sub2);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 4, $par_itm_sub2, value);
	}


	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 5, $par_itm_sub3);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 5, $par_itm_sub3, value);
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 8, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 8, $bom_ptn, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 9, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 9, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 10, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 10, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 11, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 11, $oper_seq, value);
	}


	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return getConstString(offset + 12, $chd_itm_cd);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		setConstString(offset + 12, $chd_itm_cd, value);
	}


	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return getConstString(offset + 13, $chd_itm_sub1);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		setConstString(offset + 13, $chd_itm_sub1, value);
	}


	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return getConstString(offset + 14, $chd_itm_sub2);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		setConstString(offset + 14, $chd_itm_sub2, value);
	}


	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return getConstString(offset + 15, $chd_itm_sub3);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		setConstString(offset + 15, $chd_itm_sub3, value);
	}


	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public String chd_itm_nm() {
		return getConstString(offset + 16, $chd_itm_nm);
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		setConstString(offset + 16, $chd_itm_nm, value);
	}


	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public String chd_itm_typ() {
		return getConstString(offset + 17, $chd_itm_typ);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ(String value) {
		setConstString(offset + 17, $chd_itm_typ, value);
	}


	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public String chd_itm_typ_nm() {
		return getConstString(offset + 18, $chd_itm_typ_nm);
	}

	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public void chd_itm_typ_nm(String value) {
		setConstString(offset + 18, $chd_itm_typ_nm, value);
	}


	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public String chd_itm_typ_d_cd() {
		return getConstString(offset + 19, $chd_itm_typ_d_cd);
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public void chd_itm_typ_d_cd(String value) {
		setConstString(offset + 19, $chd_itm_typ_d_cd, value);
	}


	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public String chd_itm_typ_d_nm() {
		return getConstString(offset + 20, $chd_itm_typ_d_nm);
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public void chd_itm_typ_d_nm(String value) {
		setConstString(offset + 20, $chd_itm_typ_d_nm, value);
	}


	/**
	 * Inventory management type (Child) 在庫管理区分（子）.<p>
	 *
	 */
	public String chd_stk_mng_typ() {
		return getConstString(offset + 21, $chd_stk_mng_typ);
	}

	/**
	 * Inventory management type (Child) 在庫管理区分（子）.<p>
	 *
	 */
	public void chd_stk_mng_typ(String value) {
		setConstString(offset + 21, $chd_stk_mng_typ, value);
	}


	/**
	 * Asset management type (Child) 資産管理区分（子）.<p>
	 *
	 */
	public String chd_asset_mng_typ() {
		return getConstString(offset + 22, $chd_asset_mng_typ);
	}

	/**
	 * Asset management type (Child) 資産管理区分（子）.<p>
	 *
	 */
	public void chd_asset_mng_typ(String value) {
		setConstString(offset + 22, $chd_asset_mng_typ, value);
	}


	/**
	 * Child base unit cd. 子基準単位ＣＤ.<p>
	 *
	 */
	public String chd_base_unit_cd() {
		return getConstString(offset + 23, $chd_base_unit_cd);
	}

	/**
	 * Child base unit cd. 子基準単位ＣＤ.<p>
	 *
	 */
	public void chd_base_unit_cd(String value) {
		setConstString(offset + 23, $chd_base_unit_cd, value);
	}


	/**
	 * Child base unit name 子基準単位名.<p>
	 *
	 */
	public String chd_base_unit_nm() {
		return getConstString(offset + 24, $chd_base_unit_nm);
	}

	/**
	 * Child base unit name 子基準単位名.<p>
	 *
	 */
	public void chd_base_unit_nm(String value) {
		setConstString(offset + 24, $chd_base_unit_nm, value);
	}


	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public MCNumber chd_dec_place() {
		return getConstNumber(offset + 25, $chd_dec_place);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(MCNumber value) {
		setConstNumber(offset + 25, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(int value) {
		setConstNumber(offset + 25, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(long value) {
		setConstNumber(offset + 25, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(float value) {
		setConstNumber(offset + 25, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(double value) {
		setConstNumber(offset + 25, $chd_dec_place, value);
	}


	/**
	 * Lot No. management type (Child) ロット管理区分（子）.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 26, $lot_mng_typ);
	}

	/**
	 * Lot No. management type (Child) ロット管理区分（子）.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 26, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type (Child) サブロット管理区分（子）.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 27, $sublot_mng_typ);
	}

	/**
	 * Sublot management type (Child) サブロット管理区分（子）.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 27, $sublot_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type (Child) 手配ＮＯ１管理区分（子）.<p>
	 *
	 */
	public String chd_sno1_mng_typ() {
		return getConstString(offset + 28, $chd_sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type (Child) 手配ＮＯ１管理区分（子）.<p>
	 *
	 */
	public void chd_sno1_mng_typ(String value) {
		setConstString(offset + 28, $chd_sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type (Child) 手配ＮＯ２管理区分（子）.<p>
	 *
	 */
	public String chd_sno2_mng_typ() {
		return getConstString(offset + 29, $chd_sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type (Child) 手配ＮＯ２管理区分（子）.<p>
	 *
	 */
	public void chd_sno2_mng_typ(String value) {
		setConstString(offset + 29, $chd_sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type (Child) 手配ＮＯ３管理区分（子）.<p>
	 *
	 */
	public String chd_sno3_mng_typ() {
		return getConstString(offset + 30, $chd_sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type (Child) 手配ＮＯ３管理区分（子）.<p>
	 *
	 */
	public void chd_sno3_mng_typ(String value) {
		setConstString(offset + 30, $chd_sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type (Child) 手配ＮＯ４管理区分（子）.<p>
	 *
	 */
	public String chd_sno4_mng_typ() {
		return getConstString(offset + 31, $chd_sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type (Child) 手配ＮＯ４管理区分（子）.<p>
	 *
	 */
	public void chd_sno4_mng_typ(String value) {
		setConstString(offset + 31, $chd_sno4_mng_typ, value);
	}


	/**
	 * BOM pattern (Child) 構成パタン（子）.<p>
	 *
	 */
	public String chd_def_bom_ptn() {
		return getConstString(offset + 32, $chd_def_bom_ptn);
	}

	/**
	 * BOM pattern (Child) 構成パタン（子）.<p>
	 *
	 */
	public void chd_def_bom_ptn(String value) {
		setConstString(offset + 32, $chd_def_bom_ptn, value);
	}


	/**
	 * For version control (Child) 版管理対象（子）.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 33, $ver_flg);
	}

	/**
	 * For version control (Child) 版管理対象（子）.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 33, $ver_flg, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 34, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 34, $ver_no, value);
	}


	/**
	 * Phantom 架空.<p>
	 *
	 */
	public boolean ph_flg() {
		return getConstBoolean(offset + 35, $ph_flg);
	}

	/**
	 * Phantom 架空.<p>
	 *
	 */
	public void ph_flg(boolean value) {
		setConstBoolean(offset + 35, $ph_flg, value);
	}


	/**
	 * Phantom BOM pattern 架空構成パタン.<p>
	 *
	 */
	public String ph_bom_ptn() {
		return getConstString(offset + 36, $ph_bom_ptn);
	}

	/**
	 * Phantom BOM pattern 架空構成パタン.<p>
	 *
	 */
	public void ph_bom_ptn(String value) {
		setConstString(offset + 36, $ph_bom_ptn, value);
	}


	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public boolean alt_itm_flg() {
		return getConstBoolean(offset + 37, $alt_itm_flg);
	}

	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public void alt_itm_flg(boolean value) {
		setConstBoolean(offset + 37, $alt_itm_flg, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 38, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 38, $alt_grp_cd, value);
	}


	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public String alt_grp_nm() {
		return getConstString(offset + 39, $alt_grp_nm);
	}

	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public void alt_grp_nm(String value) {
		setConstString(offset + 39, $alt_grp_nm, value);
	}


	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 40, $alt_itm_typ);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 40, $alt_itm_typ, value);
	}


	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public String alt_itm_typ_nm() {
		return getConstString(offset + 41, $alt_itm_typ_nm);
	}

	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public void alt_itm_typ_nm(String value) {
		setConstString(offset + 41, $alt_itm_typ_nm, value);
	}


	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 42, $alt_itm_ratio);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 42, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 42, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 42, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 42, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 42, $alt_itm_ratio, value);
	}


	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 43, $alt_alloc_prio);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 43, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 43, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 43, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 43, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 43, $alt_alloc_prio, value);
	}


	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public String sno_typ1() {
		return getConstString(offset + 44, $sno_typ1);
	}

	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public void sno_typ1(String value) {
		setConstString(offset + 44, $sno_typ1, value);
	}


	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public String sno_typ_nm1() {
		return getConstString(offset + 45, $sno_typ_nm1);
	}

	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public void sno_typ_nm1(String value) {
		setConstString(offset + 45, $sno_typ_nm1, value);
	}


	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public String sno_typ2() {
		return getConstString(offset + 46, $sno_typ2);
	}

	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public void sno_typ2(String value) {
		setConstString(offset + 46, $sno_typ2, value);
	}


	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public String sno_typ_nm2() {
		return getConstString(offset + 47, $sno_typ_nm2);
	}

	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public void sno_typ_nm2(String value) {
		setConstString(offset + 47, $sno_typ_nm2, value);
	}


	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public String sno_typ3() {
		return getConstString(offset + 48, $sno_typ3);
	}

	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public void sno_typ3(String value) {
		setConstString(offset + 48, $sno_typ3, value);
	}


	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public String sno_typ_nm3() {
		return getConstString(offset + 49, $sno_typ_nm3);
	}

	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public void sno_typ_nm3(String value) {
		setConstString(offset + 49, $sno_typ_nm3, value);
	}


	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public String sno_typ4() {
		return getConstString(offset + 50, $sno_typ4);
	}

	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public void sno_typ4(String value) {
		setConstString(offset + 50, $sno_typ4, value);
	}


	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public String sno_typ_nm4() {
		return getConstString(offset + 51, $sno_typ_nm4);
	}

	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public void sno_typ_nm4(String value) {
		setConstString(offset + 51, $sno_typ_nm4, value);
	}


	/**
	 * Min. SEIBAN No. 1 下限手配ＮＯ１.<p>
	 *
	 */
	public String min_sno1() {
		return getConstString(offset + 52, $min_sno1);
	}

	/**
	 * Min. SEIBAN No. 1 下限手配ＮＯ１.<p>
	 *
	 */
	public void min_sno1(String value) {
		setConstString(offset + 52, $min_sno1, value);
	}


	/**
	 * Min. SEIBAN No. 2 下限手配ＮＯ２.<p>
	 *
	 */
	public String min_sno2() {
		return getConstString(offset + 53, $min_sno2);
	}

	/**
	 * Min. SEIBAN No. 2 下限手配ＮＯ２.<p>
	 *
	 */
	public void min_sno2(String value) {
		setConstString(offset + 53, $min_sno2, value);
	}


	/**
	 * Min. SEIBAN No. 3 下限手配ＮＯ３.<p>
	 *
	 */
	public String min_sno3() {
		return getConstString(offset + 54, $min_sno3);
	}

	/**
	 * Min. SEIBAN No. 3 下限手配ＮＯ３.<p>
	 *
	 */
	public void min_sno3(String value) {
		setConstString(offset + 54, $min_sno3, value);
	}


	/**
	 * Min. SEIBAN No. 4 下限手配ＮＯ４.<p>
	 *
	 */
	public String min_sno4() {
		return getConstString(offset + 55, $min_sno4);
	}

	/**
	 * Min. SEIBAN No. 4 下限手配ＮＯ４.<p>
	 *
	 */
	public void min_sno4(String value) {
		setConstString(offset + 55, $min_sno4, value);
	}


	/**
	 * Max. SEIBAN No. 1 上限手配ＮＯ１.<p>
	 *
	 */
	public String max_sno1() {
		return getConstString(offset + 56, $max_sno1);
	}

	/**
	 * Max. SEIBAN No. 1 上限手配ＮＯ１.<p>
	 *
	 */
	public void max_sno1(String value) {
		setConstString(offset + 56, $max_sno1, value);
	}


	/**
	 * Max. SEIBAN No. 2 上限手配ＮＯ２.<p>
	 *
	 */
	public String max_sno2() {
		return getConstString(offset + 57, $max_sno2);
	}

	/**
	 * Max. SEIBAN No. 2 上限手配ＮＯ２.<p>
	 *
	 */
	public void max_sno2(String value) {
		setConstString(offset + 57, $max_sno2, value);
	}


	/**
	 * Max. SEIBAN No. 3 上限手配ＮＯ３.<p>
	 *
	 */
	public String max_sno3() {
		return getConstString(offset + 58, $max_sno3);
	}

	/**
	 * Max. SEIBAN No. 3 上限手配ＮＯ３.<p>
	 *
	 */
	public void max_sno3(String value) {
		setConstString(offset + 58, $max_sno3, value);
	}


	/**
	 * Max. SEIBAN No. 4 上限手配ＮＯ４.<p>
	 *
	 */
	public String max_sno4() {
		return getConstString(offset + 59, $max_sno4);
	}

	/**
	 * Max. SEIBAN No. 4 上限手配ＮＯ４.<p>
	 *
	 */
	public void max_sno4(String value) {
		setConstString(offset + 59, $max_sno4, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 60, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 60, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 61, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 61, $end_dt, value);
	}


	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public MCNumber par_inst_qty() {
		return getConstNumber(offset + 62, $par_inst_qty);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(MCNumber value) {
		setConstNumber(offset + 62, $par_inst_qty, value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(int value) {
		setConstNumber(offset + 62, $par_inst_qty, value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(long value) {
		setConstNumber(offset + 62, $par_inst_qty, value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(float value) {
		setConstNumber(offset + 62, $par_inst_qty, value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(double value) {
		setConstNumber(offset + 62, $par_inst_qty, value);
	}


	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return getConstNumber(offset + 63, $chd_rqmt_qty);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 63, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		setConstNumber(offset + 63, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		setConstNumber(offset + 63, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		setConstNumber(offset + 63, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		setConstNumber(offset + 63, $chd_rqmt_qty, value);
	}


	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public MCNumber chd_inpt_qty() {
		return getConstNumber(offset + 64, $chd_inpt_qty);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(MCNumber value) {
		setConstNumber(offset + 64, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(int value) {
		setConstNumber(offset + 64, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(long value) {
		setConstNumber(offset + 64, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(float value) {
		setConstNumber(offset + 64, $chd_inpt_qty, value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(double value) {
		setConstNumber(offset + 64, $chd_inpt_qty, value);
	}


	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return getConstNumber(offset + 65, $fxd_chd_rqmt_qty);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 65, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		setConstNumber(offset + 65, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		setConstNumber(offset + 65, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		setConstNumber(offset + 65, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		setConstNumber(offset + 65, $fxd_chd_rqmt_qty, value);
	}


	/**
	 * By-product 副産品.<p>
	 *
	 */
	public boolean byprod_flg() {
		return getConstBoolean(offset + 66, $byprod_flg);
	}

	/**
	 * By-product 副産品.<p>
	 *
	 */
	public void byprod_flg(boolean value) {
		setConstBoolean(offset + 66, $byprod_flg, value);
	}


	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public String in_offst_typ() {
		return getConstString(offset + 67, $in_offst_typ);
	}

	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public void in_offst_typ(String value) {
		setConstString(offset + 67, $in_offst_typ, value);
	}


	/**
	 * Input offset type name 投入オフセット区分名.<p>
	 *
	 */
	public String in_offst_typ_nm() {
		return getConstString(offset + 68, $in_offst_typ_nm);
	}

	/**
	 * Input offset type name 投入オフセット区分名.<p>
	 *
	 */
	public void in_offst_typ_nm(String value) {
		setConstString(offset + 68, $in_offst_typ_nm, value);
	}


	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public MCNumber in_offst() {
		return getConstNumber(offset + 69, $in_offst);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(MCNumber value) {
		setConstNumber(offset + 69, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(int value) {
		setConstNumber(offset + 69, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(long value) {
		setConstNumber(offset + 69, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(float value) {
		setConstNumber(offset + 69, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(double value) {
		setConstNumber(offset + 69, $in_offst, value);
	}


	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public String bkf_typ() {
		return getConstString(offset + 70, $bkf_typ);
	}

	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public void bkf_typ(String value) {
		setConstString(offset + 70, $bkf_typ, value);
	}


	/**
	 * Backflush type name バックフラッシュ区分名.<p>
	 *
	 */
	public String bkf_typ_nm() {
		return getConstString(offset + 71, $bkf_typ_nm);
	}

	/**
	 * Backflush type name バックフラッシュ区分名.<p>
	 *
	 */
	public void bkf_typ_nm(String value) {
		setConstString(offset + 71, $bkf_typ_nm, value);
	}


	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public boolean inst_lot_fix_flg() {
		return getConstBoolean(offset + 72, $inst_lot_fix_flg);
	}

	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public void inst_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 72, $inst_lot_fix_flg, value);
	}


	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public boolean lot_mix_flg() {
		return getConstBoolean(offset + 73, $lot_mix_flg);
	}

	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public void lot_mix_flg(boolean value) {
		setConstBoolean(offset + 73, $lot_mix_flg, value);
	}


	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public boolean sublot_mix_flg() {
		return getConstBoolean(offset + 74, $sublot_mix_flg);
	}

	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public void sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 74, $sublot_mix_flg, value);
	}


	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public String alloc_ctl_typ() {
		return getConstString(offset + 75, $alloc_ctl_typ);
	}

	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public void alloc_ctl_typ(String value) {
		setConstString(offset + 75, $alloc_ctl_typ, value);
	}


	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public String alloc_ctl_typ_nm() {
		return getConstString(offset + 76, $alloc_ctl_typ_nm);
	}

	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public void alloc_ctl_typ_nm(String value) {
		setConstString(offset + 76, $alloc_ctl_typ_nm, value);
	}


	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public boolean main_itm_flg() {
		return getConstBoolean(offset + 77, $main_itm_flg);
	}

	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public void main_itm_flg(boolean value) {
		setConstBoolean(offset + 77, $main_itm_flg, value);
	}


	/**
	 * For yield calculation 収率計算用.<p>
	 *
	 */
	public boolean yield_calc_flg() {
		return getConstBoolean(offset + 78, $yield_calc_flg);
	}

	/**
	 * For yield calculation 収率計算用.<p>
	 *
	 */
	public void yield_calc_flg(boolean value) {
		setConstBoolean(offset + 78, $yield_calc_flg, value);
	}


	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public String inpt_ctl_typ() {
		return getConstString(offset + 79, $inpt_ctl_typ);
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public void inpt_ctl_typ(String value) {
		setConstString(offset + 79, $inpt_ctl_typ, value);
	}


	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public String inpt_ctl_typ_nm() {
		return getConstString(offset + 80, $inpt_ctl_typ_nm);
	}

	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public void inpt_ctl_typ_nm(String value) {
		setConstString(offset + 80, $inpt_ctl_typ_nm, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 81, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 81, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 81, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 81, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 81, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 81, $disp_seq, value);
	}


	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public String chng_no() {
		return getConstString(offset + 82, $chng_no);
	}

	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public void chng_no(String value) {
		setConstString(offset + 82, $chng_no, value);
	}


	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public String ext_sys_no_bom() {
		return getConstString(offset + 83, $ext_sys_no_bom);
	}

	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public void ext_sys_no_bom(String value) {
		setConstString(offset + 83, $ext_sys_no_bom, value);
	}


	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public boolean not_cost_flg() {
		return getConstBoolean(offset + 84, $not_cost_flg);
	}

	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public void not_cost_flg(boolean value) {
		setConstBoolean(offset + 84, $not_cost_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 85, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 85, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 86, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 86, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 87, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 87, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 88, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 88, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 89, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 89, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 90, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 90, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 91, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 91, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 92, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 92, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 93, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 93, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 93, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 93, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 93, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 93, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 94, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 94, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 95, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 95, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 96, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 96, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 97, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 97, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 98, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 98, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 99, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 99, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 100, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 100, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 101, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 101, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 102, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 102, $del_ts, value);
	}


	public String getString(String name) {
		if ($bom_key.equalsIgnoreCase(name)) {
			return bom_key();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
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
		if ($chd_stk_mng_typ.equalsIgnoreCase(name)) {
			return chd_stk_mng_typ();
		}
		if ($chd_asset_mng_typ.equalsIgnoreCase(name)) {
			return chd_asset_mng_typ();
		}
		if ($chd_base_unit_cd.equalsIgnoreCase(name)) {
			return chd_base_unit_cd();
		}
		if ($chd_base_unit_nm.equalsIgnoreCase(name)) {
			return chd_base_unit_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($chd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno1_mng_typ();
		}
		if ($chd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno2_mng_typ();
		}
		if ($chd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno3_mng_typ();
		}
		if ($chd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno4_mng_typ();
		}
		if ($chd_def_bom_ptn.equalsIgnoreCase(name)) {
			return chd_def_bom_ptn();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($ph_bom_ptn.equalsIgnoreCase(name)) {
			return ph_bom_ptn();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return alt_itm_typ_nm();
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			return sno_typ1();
		}
		if ($sno_typ_nm1.equalsIgnoreCase(name)) {
			return sno_typ_nm1();
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			return sno_typ2();
		}
		if ($sno_typ_nm2.equalsIgnoreCase(name)) {
			return sno_typ_nm2();
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			return sno_typ3();
		}
		if ($sno_typ_nm3.equalsIgnoreCase(name)) {
			return sno_typ_nm3();
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			return sno_typ4();
		}
		if ($sno_typ_nm4.equalsIgnoreCase(name)) {
			return sno_typ_nm4();
		}
		if ($min_sno1.equalsIgnoreCase(name)) {
			return min_sno1();
		}
		if ($min_sno2.equalsIgnoreCase(name)) {
			return min_sno2();
		}
		if ($min_sno3.equalsIgnoreCase(name)) {
			return min_sno3();
		}
		if ($min_sno4.equalsIgnoreCase(name)) {
			return min_sno4();
		}
		if ($max_sno1.equalsIgnoreCase(name)) {
			return max_sno1();
		}
		if ($max_sno2.equalsIgnoreCase(name)) {
			return max_sno2();
		}
		if ($max_sno3.equalsIgnoreCase(name)) {
			return max_sno3();
		}
		if ($max_sno4.equalsIgnoreCase(name)) {
			return max_sno4();
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			return in_offst_typ();
		}
		if ($in_offst_typ_nm.equalsIgnoreCase(name)) {
			return in_offst_typ_nm();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			return bkf_typ_nm();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			return alloc_ctl_typ_nm();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			return inpt_ctl_typ_nm();
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			return ext_sys_no_bom();
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			return chd_dec_place();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			return par_inst_qty();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			return chd_inpt_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			return in_offst();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($ph_flg.equalsIgnoreCase(name)) {
			return ph_flg();
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			return alt_itm_flg();
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			return byprod_flg();
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			return inst_lot_fix_flg();
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			return lot_mix_flg();
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			return sublot_mix_flg();
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			return yield_calc_flg();
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			return not_cost_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bom_key.equalsIgnoreCase(name)) {
			return bom_key();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
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
		if ($chd_stk_mng_typ.equalsIgnoreCase(name)) {
			return chd_stk_mng_typ();
		}
		if ($chd_asset_mng_typ.equalsIgnoreCase(name)) {
			return chd_asset_mng_typ();
		}
		if ($chd_base_unit_cd.equalsIgnoreCase(name)) {
			return chd_base_unit_cd();
		}
		if ($chd_base_unit_nm.equalsIgnoreCase(name)) {
			return chd_base_unit_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($chd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno1_mng_typ();
		}
		if ($chd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno2_mng_typ();
		}
		if ($chd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno3_mng_typ();
		}
		if ($chd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno4_mng_typ();
		}
		if ($chd_def_bom_ptn.equalsIgnoreCase(name)) {
			return chd_def_bom_ptn();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($ph_bom_ptn.equalsIgnoreCase(name)) {
			return ph_bom_ptn();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return alt_itm_typ_nm();
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			return sno_typ1();
		}
		if ($sno_typ_nm1.equalsIgnoreCase(name)) {
			return sno_typ_nm1();
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			return sno_typ2();
		}
		if ($sno_typ_nm2.equalsIgnoreCase(name)) {
			return sno_typ_nm2();
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			return sno_typ3();
		}
		if ($sno_typ_nm3.equalsIgnoreCase(name)) {
			return sno_typ_nm3();
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			return sno_typ4();
		}
		if ($sno_typ_nm4.equalsIgnoreCase(name)) {
			return sno_typ_nm4();
		}
		if ($min_sno1.equalsIgnoreCase(name)) {
			return min_sno1();
		}
		if ($min_sno2.equalsIgnoreCase(name)) {
			return min_sno2();
		}
		if ($min_sno3.equalsIgnoreCase(name)) {
			return min_sno3();
		}
		if ($min_sno4.equalsIgnoreCase(name)) {
			return min_sno4();
		}
		if ($max_sno1.equalsIgnoreCase(name)) {
			return max_sno1();
		}
		if ($max_sno2.equalsIgnoreCase(name)) {
			return max_sno2();
		}
		if ($max_sno3.equalsIgnoreCase(name)) {
			return max_sno3();
		}
		if ($max_sno4.equalsIgnoreCase(name)) {
			return max_sno4();
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			return in_offst_typ();
		}
		if ($in_offst_typ_nm.equalsIgnoreCase(name)) {
			return in_offst_typ_nm();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			return bkf_typ_nm();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			return alloc_ctl_typ_nm();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			return inpt_ctl_typ_nm();
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			return ext_sys_no_bom();
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			return chd_dec_place();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			return par_inst_qty();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			return chd_inpt_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			return in_offst();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($ph_flg.equalsIgnoreCase(name)) {
			return ph_flg();
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			return alt_itm_flg();
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			return byprod_flg();
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			return inst_lot_fix_flg();
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			return lot_mix_flg();
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			return sublot_mix_flg();
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			return yield_calc_flg();
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			return not_cost_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bom_key.equalsIgnoreCase(name)) {
			bom_key(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($chd_stk_mng_typ.equalsIgnoreCase(name)) {
			chd_stk_mng_typ(value);
			return;
		}
		if ($chd_asset_mng_typ.equalsIgnoreCase(name)) {
			chd_asset_mng_typ(value);
			return;
		}
		if ($chd_base_unit_cd.equalsIgnoreCase(name)) {
			chd_base_unit_cd(value);
			return;
		}
		if ($chd_base_unit_nm.equalsIgnoreCase(name)) {
			chd_base_unit_nm(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($chd_sno1_mng_typ.equalsIgnoreCase(name)) {
			chd_sno1_mng_typ(value);
			return;
		}
		if ($chd_sno2_mng_typ.equalsIgnoreCase(name)) {
			chd_sno2_mng_typ(value);
			return;
		}
		if ($chd_sno3_mng_typ.equalsIgnoreCase(name)) {
			chd_sno3_mng_typ(value);
			return;
		}
		if ($chd_sno4_mng_typ.equalsIgnoreCase(name)) {
			chd_sno4_mng_typ(value);
			return;
		}
		if ($chd_def_bom_ptn.equalsIgnoreCase(name)) {
			chd_def_bom_ptn(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($ph_bom_ptn.equalsIgnoreCase(name)) {
			ph_bom_ptn(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			alt_itm_typ_nm(value);
			return;
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			sno_typ1(value);
			return;
		}
		if ($sno_typ_nm1.equalsIgnoreCase(name)) {
			sno_typ_nm1(value);
			return;
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			sno_typ2(value);
			return;
		}
		if ($sno_typ_nm2.equalsIgnoreCase(name)) {
			sno_typ_nm2(value);
			return;
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			sno_typ3(value);
			return;
		}
		if ($sno_typ_nm3.equalsIgnoreCase(name)) {
			sno_typ_nm3(value);
			return;
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			sno_typ4(value);
			return;
		}
		if ($sno_typ_nm4.equalsIgnoreCase(name)) {
			sno_typ_nm4(value);
			return;
		}
		if ($min_sno1.equalsIgnoreCase(name)) {
			min_sno1(value);
			return;
		}
		if ($min_sno2.equalsIgnoreCase(name)) {
			min_sno2(value);
			return;
		}
		if ($min_sno3.equalsIgnoreCase(name)) {
			min_sno3(value);
			return;
		}
		if ($min_sno4.equalsIgnoreCase(name)) {
			min_sno4(value);
			return;
		}
		if ($max_sno1.equalsIgnoreCase(name)) {
			max_sno1(value);
			return;
		}
		if ($max_sno2.equalsIgnoreCase(name)) {
			max_sno2(value);
			return;
		}
		if ($max_sno3.equalsIgnoreCase(name)) {
			max_sno3(value);
			return;
		}
		if ($max_sno4.equalsIgnoreCase(name)) {
			max_sno4(value);
			return;
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			in_offst_typ(value);
			return;
		}
		if ($in_offst_typ_nm.equalsIgnoreCase(name)) {
			in_offst_typ_nm(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			bkf_typ_nm(value);
			return;
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			alloc_ctl_typ_nm(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			inpt_ctl_typ_nm(value);
			return;
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			ext_sys_no_bom(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($ph_flg.equalsIgnoreCase(name)) {
			ph_flg(value);
			return;
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			alt_itm_flg(value);
			return;
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			byprod_flg(value);
			return;
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			inst_lot_fix_flg(value);
			return;
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			lot_mix_flg(value);
			return;
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			sublot_mix_flg(value);
			return;
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			yield_calc_flg(value);
			return;
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			not_cost_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bom_key.equalsIgnoreCase(name)) {
			bom_key(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($chd_stk_mng_typ.equalsIgnoreCase(name)) {
			chd_stk_mng_typ(value);
			return;
		}
		if ($chd_asset_mng_typ.equalsIgnoreCase(name)) {
			chd_asset_mng_typ(value);
			return;
		}
		if ($chd_base_unit_cd.equalsIgnoreCase(name)) {
			chd_base_unit_cd(value);
			return;
		}
		if ($chd_base_unit_nm.equalsIgnoreCase(name)) {
			chd_base_unit_nm(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($chd_sno1_mng_typ.equalsIgnoreCase(name)) {
			chd_sno1_mng_typ(value);
			return;
		}
		if ($chd_sno2_mng_typ.equalsIgnoreCase(name)) {
			chd_sno2_mng_typ(value);
			return;
		}
		if ($chd_sno3_mng_typ.equalsIgnoreCase(name)) {
			chd_sno3_mng_typ(value);
			return;
		}
		if ($chd_sno4_mng_typ.equalsIgnoreCase(name)) {
			chd_sno4_mng_typ(value);
			return;
		}
		if ($chd_def_bom_ptn.equalsIgnoreCase(name)) {
			chd_def_bom_ptn(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($ph_bom_ptn.equalsIgnoreCase(name)) {
			ph_bom_ptn(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			alt_itm_typ_nm(value);
			return;
		}
		if ($sno_typ1.equalsIgnoreCase(name)) {
			sno_typ1(value);
			return;
		}
		if ($sno_typ_nm1.equalsIgnoreCase(name)) {
			sno_typ_nm1(value);
			return;
		}
		if ($sno_typ2.equalsIgnoreCase(name)) {
			sno_typ2(value);
			return;
		}
		if ($sno_typ_nm2.equalsIgnoreCase(name)) {
			sno_typ_nm2(value);
			return;
		}
		if ($sno_typ3.equalsIgnoreCase(name)) {
			sno_typ3(value);
			return;
		}
		if ($sno_typ_nm3.equalsIgnoreCase(name)) {
			sno_typ_nm3(value);
			return;
		}
		if ($sno_typ4.equalsIgnoreCase(name)) {
			sno_typ4(value);
			return;
		}
		if ($sno_typ_nm4.equalsIgnoreCase(name)) {
			sno_typ_nm4(value);
			return;
		}
		if ($min_sno1.equalsIgnoreCase(name)) {
			min_sno1(value);
			return;
		}
		if ($min_sno2.equalsIgnoreCase(name)) {
			min_sno2(value);
			return;
		}
		if ($min_sno3.equalsIgnoreCase(name)) {
			min_sno3(value);
			return;
		}
		if ($min_sno4.equalsIgnoreCase(name)) {
			min_sno4(value);
			return;
		}
		if ($max_sno1.equalsIgnoreCase(name)) {
			max_sno1(value);
			return;
		}
		if ($max_sno2.equalsIgnoreCase(name)) {
			max_sno2(value);
			return;
		}
		if ($max_sno3.equalsIgnoreCase(name)) {
			max_sno3(value);
			return;
		}
		if ($max_sno4.equalsIgnoreCase(name)) {
			max_sno4(value);
			return;
		}
		if ($in_offst_typ.equalsIgnoreCase(name)) {
			in_offst_typ(value);
			return;
		}
		if ($in_offst_typ_nm.equalsIgnoreCase(name)) {
			in_offst_typ_nm(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			bkf_typ_nm(value);
			return;
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			alloc_ctl_typ_nm(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			inpt_ctl_typ_nm(value);
			return;
		}
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		if ($ext_sys_no_bom.equalsIgnoreCase(name)) {
			ext_sys_no_bom(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($par_inst_qty.equalsIgnoreCase(name)) {
			par_inst_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_inpt_qty.equalsIgnoreCase(name)) {
			chd_inpt_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($ph_flg.equalsIgnoreCase(name)) {
			ph_flg(value);
			return;
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			alt_itm_flg(value);
			return;
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			byprod_flg(value);
			return;
		}
		if ($inst_lot_fix_flg.equalsIgnoreCase(name)) {
			inst_lot_fix_flg(value);
			return;
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			lot_mix_flg(value);
			return;
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			sublot_mix_flg(value);
			return;
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			yield_calc_flg(value);
			return;
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			not_cost_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

