package mcframe.clientMABS.MABSP1100;

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
 * ブロック"Wrk4Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Wrk4DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
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
	public static final String $itm_p = "itm_p";
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
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	public static final String $chd_itm_p = "chd_itm_p";
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
	 * By-product 副産品.<p>
	 *
	 */
	public static final String $byprod_flg = "byprod_flg";
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
	public static final String $ver_no_p = "ver_no_p";
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
	public static final String $min_sno_p = "min_sno_p";
	public static final String $max_sno_p = "max_sno_p";
	public static final String $dt_p = "dt_p";
	public static final String $qty1_p = "qty1_p";
	public static final String $qty3_p = "qty3_p";
	public static final String $qty2_p = "qty2_p";
	public static final String $qty4_p = "qty4_p";
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

	public static final String $par_itm_cd = $itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $chd_itm_cd = $chd_itm_p + ".itm_cd";
	public static final String $chd_itm_sub1 = $chd_itm_p + ".itm_sub1";
	public static final String $chd_itm_sub2 = $chd_itm_p + ".itm_sub2";
	public static final String $chd_itm_sub3 = $chd_itm_p + ".itm_sub3";
	public static final String $chd_itm_nm = $chd_itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $min_sno1 = $min_sno_p + ".sno1";
	public static final String $min_sno2 = $min_sno_p + ".sno2";
	public static final String $min_sno3 = $min_sno_p + ".sno3";
	public static final String $min_sno4 = $min_sno_p + ".sno4";
	public static final String $max_sno1 = $max_sno_p + ".sno1";
	public static final String $max_sno2 = $max_sno_p + ".sno2";
	public static final String $max_sno3 = $max_sno_p + ".sno3";
	public static final String $max_sno4 = $max_sno_p + ".sno4";
	public static final String $st_dt = $dt_p + ".st_dt";
	public static final String $end_dt = $dt_p + ".end_dt";
	public static final String $par_inst_qty = $qty1_p + ".qty";
	public static final String $chd_inpt_qty = $qty3_p + ".qty";
	public static final String $chd_rqmt_qty = $qty2_p + ".qty";
	public static final String $fxd_chd_rqmt_qty = $qty4_p + ".qty";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bom_key_META = createCommonMeta($bom_key, mcframe.commonMA.meta.MA_META.BOM_KEY);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta chd_itm_p_META = createInnerRowMeta($chd_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta chd_itm_typ_META = createCommonMeta($chd_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta chd_itm_typ_nm_META = createCommonMeta($chd_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta chd_itm_typ_d_cd_META = createCommonMeta($chd_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta chd_itm_typ_d_nm_META = createCommonMeta($chd_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta chd_stk_mng_typ_META = createCommonMeta($chd_stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta chd_asset_mng_typ_META = createCommonMeta($chd_asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta chd_dec_place_META = createCommonMeta($chd_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta chd_sno1_mng_typ_META = createCommonMeta($chd_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chd_sno2_mng_typ_META = createCommonMeta($chd_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chd_sno3_mng_typ_META = createCommonMeta($chd_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chd_sno4_mng_typ_META = createCommonMeta($chd_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chd_def_bom_ptn_META = createCommonMeta($chd_def_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta byprod_flg_META = createCommonMeta($byprod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ph_flg_META = createCommonMeta($ph_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ph_bom_ptn_META = createCommonMeta($ph_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
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
	public static final MCMeta min_sno_p_META = createInnerRowMeta($min_sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta max_sno_p_META = createInnerRowMeta($max_sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta dt_p_META = createInnerRowMeta($dt_p, mcframe.clientMAUB.MAUBP5010.DtR.class);
	public static final MCMeta qty1_p_META = createInnerRowMeta($qty1_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty3_p_META = createInnerRowMeta($qty3_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty2_p_META = createInnerRowMeta($qty2_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty4_p_META = createInnerRowMeta($qty4_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta chd_base_unit_cd_META = createCommonMeta($chd_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta chd_base_unit_nm_META = createCommonMeta($chd_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
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

	protected static final ConstMetaList<Wrk4DtlR> constMetas = new ConstMetaList<Wrk4DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			bom_key_META,
			del_flg_META,
			itm_p_META,
			wg_cd_META,
			wg_nm_META,
			bom_ptn_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			disp_seq_META,
			chd_itm_p_META,
			chd_itm_typ_META,
			chd_itm_typ_nm_META,
			chd_itm_typ_d_cd_META,
			chd_itm_typ_d_nm_META,
			chd_stk_mng_typ_META,
			chd_asset_mng_typ_META,
			chd_dec_place_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			chd_sno1_mng_typ_META,
			chd_sno2_mng_typ_META,
			chd_sno3_mng_typ_META,
			chd_sno4_mng_typ_META,
			chd_def_bom_ptn_META,
			ver_flg_META,
			byprod_flg_META,
			ph_flg_META,
			ph_bom_ptn_META,
			ver_no_p_META,
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
			min_sno_p_META,
			max_sno_p_META,
			dt_p_META,
			qty1_p_META,
			qty3_p_META,
			qty2_p_META,
			qty4_p_META,
			chd_base_unit_cd_META,
			chd_base_unit_nm_META,
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
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"chd_itm_cd",
				"chd_itm_sub1",
				"chd_itm_sub2",
				"chd_itm_sub3",
				"chd_itm_nm",
				"ver_no",
				"min_sno1",
				"min_sno2",
				"min_sno3",
				"min_sno4",
				"max_sno1",
				"max_sno2",
				"max_sno3",
				"max_sno4",
				"st_dt",
				"end_dt",
				"par_inst_qty",
				"chd_inpt_qty",
				"chd_rqmt_qty",
				"fxd_chd_rqmt_qty"
			},
			{
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$chd_itm_cd,
				$chd_itm_sub1,
				$chd_itm_sub2,
				$chd_itm_sub3,
				$chd_itm_nm,
				$ver_no,
				$min_sno1,
				$min_sno2,
				$min_sno3,
				$min_sno4,
				$max_sno1,
				$max_sno2,
				$max_sno3,
				$max_sno4,
				$st_dt,
				$end_dt,
				$par_inst_qty,
				$chd_inpt_qty,
				$chd_rqmt_qty,
				$fxd_chd_rqmt_qty
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$bom_key	// bom_key
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
				{$wg_cd, "wg_nm"},	// wg_cd
				{$chd_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3;unit_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm;stk_mng_typ;asset_mng_typ;dec_place;lot_mng_typ;sublot_mng_typ;ver_flg;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;def_bom_ptn;unit_nm"},	// chd_itm_p.itm_cd
				{$chd_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3;unit_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm;stk_mng_typ;asset_mng_typ;dec_place;lot_mng_typ;sublot_mng_typ;ver_flg;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;def_bom_ptn;unit_nm"},	// chd_itm_p.itm_sub1
				{$chd_itm_p + ".itm_sub2", "itm_nm;itm_sub3;unit_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm;stk_mng_typ;asset_mng_typ;dec_place;lot_mng_typ;sublot_mng_typ;ver_flg;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;def_bom_ptn;unit_nm"},	// chd_itm_p.itm_sub2
				{$chd_itm_p + ".itm_sub3", "itm_nm;unit_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm;stk_mng_typ;asset_mng_typ;dec_place;lot_mng_typ;sublot_mng_typ;ver_flg;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;def_bom_ptn;unit_nm"},	// chd_itm_p.itm_sub3
				{$chd_itm_typ_d_cd, "def_sno_typ1;def_sno_typ2;def_sno_typ3;def_sno_typ4;def_inst_lot_fix_flg;def_lot_mix_flg;def_sublot_mix_flg;def_alloc_ctl_typ;def_inpt_ctl_typ;def_bkf_typ;def_main_itm_flg;def_byprod_flg;def_not_cost_bom_flg"},	// chd_itm_typ_d_cd
				{$sno_typ1, "sno_typ_nm"},	// sno_typ1
				{$sno_typ2, "sno_typ_nm"},	// sno_typ2
				{$sno_typ3, "sno_typ_nm"},	// sno_typ3
				{$sno_typ4, "sno_typ_nm"},	// sno_typ4
				{$in_offst_typ, "offst_typ_nm"}	// in_offst_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"},	// wg_cd
				{$chd_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.COMM"},	// chd_itm_p.itm_cd
				{$chd_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.COMM;chd_itm_cd"},	// chd_itm_p.itm_sub1
				{$chd_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.COMM;chd_itm_cd;chd_itm_sub1"},	// chd_itm_p.itm_sub2
				{$chd_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.COMM;chd_itm_cd;chd_itm_sub1;chd_itm_sub2"},	// chd_itm_p.itm_sub3
				{$chd_itm_typ_d_cd, "chd_itm_typ"},	// chd_itm_typ_d_cd
				{$ver_no_p + ".ver_no", "chd_itm_cd;chd_itm_sub1;chd_itm_sub2;chd_itm_sub3"},	// ver_no_p.ver_no
				{$alt_grp_cd, "wg_cd"}	// alt_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "wr_flg"},	// wg_cd
				{$chd_itm_p + ".itm_cd", "itm_is_srch_typ"},	// chd_itm_p.itm_cd
				{$chd_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// chd_itm_p.itm_sub1
				{$chd_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// chd_itm_p.itm_sub2
				{$chd_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// chd_itm_p.itm_sub3
				{$chd_itm_typ_d_cd, "itm_typ"},	// chd_itm_typ_d_cd
				{$ver_no_p + ".ver_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// ver_no_p.ver_no
				{$alt_grp_cd, "wg_cd"}	// alt_grp_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$sno_typ1, "SNO1"},	// sno_typ1
				{$sno_typ_nm1, "SNO1"},	// sno_typ_nm1
				{$sno_typ2, "SNO2"},	// sno_typ2
				{$sno_typ_nm2, "SNO2"},	// sno_typ_nm2
				{$sno_typ3, "SNO3"},	// sno_typ3
				{$sno_typ_nm3, "SNO3"},	// sno_typ_nm3
				{$sno_typ4, "SNO4"},	// sno_typ4
				{$sno_typ_nm4, "SNO4"}	// sno_typ_nm4
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
	protected Wrk4DtlR_MC_A(ConstMetaList<? extends Wrk4DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk4DtlR clone() {
		return (Wrk4DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk4DtlR createInstance() {
		return (Wrk4DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk4DtlR getValues(String... names) {
		return (Wrk4DtlR) super.getValues(names);
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
	 * BOM key ＢＯＭキー.<p>
	 *
	 */
	public String bom_key() {
		return getConstString(offset + 1, $bom_key);
	}

	/**
	 * BOM key ＢＯＭキー.<p>
	 *
	 */
	public void bom_key(String value) {
		setConstString(offset + 1, $bom_key, value);
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 2, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 2, $del_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 3, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 3, $itm_p, row);
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 6, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 6, $bom_ptn, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 7, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 7, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 8, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 8, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 9, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 10, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR chd_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 11, $chd_itm_p);
	}
	
	public void chd_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 11, $chd_itm_p, row);
	}


	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public String chd_itm_typ() {
		return getConstString(offset + 12, $chd_itm_typ);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ(String value) {
		setConstString(offset + 12, $chd_itm_typ, value);
	}


	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public String chd_itm_typ_nm() {
		return getConstString(offset + 13, $chd_itm_typ_nm);
	}

	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public void chd_itm_typ_nm(String value) {
		setConstString(offset + 13, $chd_itm_typ_nm, value);
	}


	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public String chd_itm_typ_d_cd() {
		return getConstString(offset + 14, $chd_itm_typ_d_cd);
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public void chd_itm_typ_d_cd(String value) {
		setConstString(offset + 14, $chd_itm_typ_d_cd, value);
	}


	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public String chd_itm_typ_d_nm() {
		return getConstString(offset + 15, $chd_itm_typ_d_nm);
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public void chd_itm_typ_d_nm(String value) {
		setConstString(offset + 15, $chd_itm_typ_d_nm, value);
	}


	/**
	 * Inventory management type (Child) 在庫管理区分（子）.<p>
	 *
	 */
	public String chd_stk_mng_typ() {
		return getConstString(offset + 16, $chd_stk_mng_typ);
	}

	/**
	 * Inventory management type (Child) 在庫管理区分（子）.<p>
	 *
	 */
	public void chd_stk_mng_typ(String value) {
		setConstString(offset + 16, $chd_stk_mng_typ, value);
	}


	/**
	 * Asset management type (Child) 資産管理区分（子）.<p>
	 *
	 */
	public String chd_asset_mng_typ() {
		return getConstString(offset + 17, $chd_asset_mng_typ);
	}

	/**
	 * Asset management type (Child) 資産管理区分（子）.<p>
	 *
	 */
	public void chd_asset_mng_typ(String value) {
		setConstString(offset + 17, $chd_asset_mng_typ, value);
	}


	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public MCNumber chd_dec_place() {
		return getConstNumber(offset + 18, $chd_dec_place);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(MCNumber value) {
		setConstNumber(offset + 18, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(int value) {
		setConstNumber(offset + 18, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(long value) {
		setConstNumber(offset + 18, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(float value) {
		setConstNumber(offset + 18, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(double value) {
		setConstNumber(offset + 18, $chd_dec_place, value);
	}


	/**
	 * Lot No. management type (Child) ロット管理区分（子）.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 19, $lot_mng_typ);
	}

	/**
	 * Lot No. management type (Child) ロット管理区分（子）.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 19, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type (Child) サブロット管理区分（子）.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 20, $sublot_mng_typ);
	}

	/**
	 * Sublot management type (Child) サブロット管理区分（子）.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 20, $sublot_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type (Child) 手配ＮＯ１管理区分（子）.<p>
	 *
	 */
	public String chd_sno1_mng_typ() {
		return getConstString(offset + 21, $chd_sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type (Child) 手配ＮＯ１管理区分（子）.<p>
	 *
	 */
	public void chd_sno1_mng_typ(String value) {
		setConstString(offset + 21, $chd_sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type (Child) 手配ＮＯ２管理区分（子）.<p>
	 *
	 */
	public String chd_sno2_mng_typ() {
		return getConstString(offset + 22, $chd_sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type (Child) 手配ＮＯ２管理区分（子）.<p>
	 *
	 */
	public void chd_sno2_mng_typ(String value) {
		setConstString(offset + 22, $chd_sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type (Child) 手配ＮＯ３管理区分（子）.<p>
	 *
	 */
	public String chd_sno3_mng_typ() {
		return getConstString(offset + 23, $chd_sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type (Child) 手配ＮＯ３管理区分（子）.<p>
	 *
	 */
	public void chd_sno3_mng_typ(String value) {
		setConstString(offset + 23, $chd_sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type (Child) 手配ＮＯ４管理区分（子）.<p>
	 *
	 */
	public String chd_sno4_mng_typ() {
		return getConstString(offset + 24, $chd_sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type (Child) 手配ＮＯ４管理区分（子）.<p>
	 *
	 */
	public void chd_sno4_mng_typ(String value) {
		setConstString(offset + 24, $chd_sno4_mng_typ, value);
	}


	/**
	 * BOM pattern (Child) 構成パタン（子）.<p>
	 *
	 */
	public String chd_def_bom_ptn() {
		return getConstString(offset + 25, $chd_def_bom_ptn);
	}

	/**
	 * BOM pattern (Child) 構成パタン（子）.<p>
	 *
	 */
	public void chd_def_bom_ptn(String value) {
		setConstString(offset + 25, $chd_def_bom_ptn, value);
	}


	/**
	 * For version control (Child) 版管理対象（子）.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 26, $ver_flg);
	}

	/**
	 * For version control (Child) 版管理対象（子）.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 26, $ver_flg, value);
	}


	/**
	 * By-product 副産品.<p>
	 *
	 */
	public boolean byprod_flg() {
		return getConstBoolean(offset + 27, $byprod_flg);
	}

	/**
	 * By-product 副産品.<p>
	 *
	 */
	public void byprod_flg(boolean value) {
		setConstBoolean(offset + 27, $byprod_flg, value);
	}


	/**
	 * Phantom 架空.<p>
	 *
	 */
	public boolean ph_flg() {
		return getConstBoolean(offset + 28, $ph_flg);
	}

	/**
	 * Phantom 架空.<p>
	 *
	 */
	public void ph_flg(boolean value) {
		setConstBoolean(offset + 28, $ph_flg, value);
	}


	/**
	 * Phantom BOM pattern 架空構成パタン.<p>
	 *
	 */
	public String ph_bom_ptn() {
		return getConstString(offset + 29, $ph_bom_ptn);
	}

	/**
	 * Phantom BOM pattern 架空構成パタン.<p>
	 *
	 */
	public void ph_bom_ptn(String value) {
		setConstString(offset + 29, $ph_bom_ptn, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 30, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 30, $ver_no_p, row);
	}


	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public boolean alt_itm_flg() {
		return getConstBoolean(offset + 31, $alt_itm_flg);
	}

	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public void alt_itm_flg(boolean value) {
		setConstBoolean(offset + 31, $alt_itm_flg, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 32, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 32, $alt_grp_cd, value);
	}


	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public String alt_grp_nm() {
		return getConstString(offset + 33, $alt_grp_nm);
	}

	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public void alt_grp_nm(String value) {
		setConstString(offset + 33, $alt_grp_nm, value);
	}


	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 34, $alt_itm_typ);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 34, $alt_itm_typ, value);
	}


	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public String alt_itm_typ_nm() {
		return getConstString(offset + 35, $alt_itm_typ_nm);
	}

	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public void alt_itm_typ_nm(String value) {
		setConstString(offset + 35, $alt_itm_typ_nm, value);
	}


	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 36, $alt_itm_ratio);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 36, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 36, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 36, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 36, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 36, $alt_itm_ratio, value);
	}


	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 37, $alt_alloc_prio);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 37, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 37, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 37, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 37, $alt_alloc_prio, value);
	}

	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 37, $alt_alloc_prio, value);
	}


	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public String sno_typ1() {
		return getConstString(offset + 38, $sno_typ1);
	}

	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public void sno_typ1(String value) {
		setConstString(offset + 38, $sno_typ1, value);
	}


	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public String sno_typ_nm1() {
		return getConstString(offset + 39, $sno_typ_nm1);
	}

	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public void sno_typ_nm1(String value) {
		setConstString(offset + 39, $sno_typ_nm1, value);
	}


	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public String sno_typ2() {
		return getConstString(offset + 40, $sno_typ2);
	}

	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public void sno_typ2(String value) {
		setConstString(offset + 40, $sno_typ2, value);
	}


	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public String sno_typ_nm2() {
		return getConstString(offset + 41, $sno_typ_nm2);
	}

	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public void sno_typ_nm2(String value) {
		setConstString(offset + 41, $sno_typ_nm2, value);
	}


	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public String sno_typ3() {
		return getConstString(offset + 42, $sno_typ3);
	}

	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public void sno_typ3(String value) {
		setConstString(offset + 42, $sno_typ3, value);
	}


	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public String sno_typ_nm3() {
		return getConstString(offset + 43, $sno_typ_nm3);
	}

	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public void sno_typ_nm3(String value) {
		setConstString(offset + 43, $sno_typ_nm3, value);
	}


	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public String sno_typ4() {
		return getConstString(offset + 44, $sno_typ4);
	}

	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public void sno_typ4(String value) {
		setConstString(offset + 44, $sno_typ4, value);
	}


	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public String sno_typ_nm4() {
		return getConstString(offset + 45, $sno_typ_nm4);
	}

	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public void sno_typ_nm4(String value) {
		setConstString(offset + 45, $sno_typ_nm4, value);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR min_sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 46, $min_sno_p);
	}
	
	public void min_sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 46, $min_sno_p, row);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR max_sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 47, $max_sno_p);
	}
	
	public void max_sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 47, $max_sno_p, row);
	}


	public mcframe.clientMAUB.MAUBP5010.DtR dt_p(){
		return (mcframe.clientMAUB.MAUBP5010.DtR) getConstInnerRow(offset + 48, $dt_p);
	}
	
	public void dt_p(mcframe.clientMAUB.MAUBP5010.DtR row){
		setConstInnerRow(offset + 48, $dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty1_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 49, $qty1_p);
	}
	
	public void qty1_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 49, $qty1_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty3_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 50, $qty3_p);
	}
	
	public void qty3_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 50, $qty3_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty2_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 51, $qty2_p);
	}
	
	public void qty2_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 51, $qty2_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty4_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 52, $qty4_p);
	}
	
	public void qty4_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 52, $qty4_p, row);
	}


	/**
	 * Child base unit cd. 子基準単位ＣＤ.<p>
	 *
	 */
	public String chd_base_unit_cd() {
		return getConstString(offset + 53, $chd_base_unit_cd);
	}

	/**
	 * Child base unit cd. 子基準単位ＣＤ.<p>
	 *
	 */
	public void chd_base_unit_cd(String value) {
		setConstString(offset + 53, $chd_base_unit_cd, value);
	}


	/**
	 * Child base unit name 子基準単位名.<p>
	 *
	 */
	public String chd_base_unit_nm() {
		return getConstString(offset + 54, $chd_base_unit_nm);
	}

	/**
	 * Child base unit name 子基準単位名.<p>
	 *
	 */
	public void chd_base_unit_nm(String value) {
		setConstString(offset + 54, $chd_base_unit_nm, value);
	}


	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public String in_offst_typ() {
		return getConstString(offset + 55, $in_offst_typ);
	}

	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public void in_offst_typ(String value) {
		setConstString(offset + 55, $in_offst_typ, value);
	}


	/**
	 * Input offset type name 投入オフセット区分名.<p>
	 *
	 */
	public String in_offst_typ_nm() {
		return getConstString(offset + 56, $in_offst_typ_nm);
	}

	/**
	 * Input offset type name 投入オフセット区分名.<p>
	 *
	 */
	public void in_offst_typ_nm(String value) {
		setConstString(offset + 56, $in_offst_typ_nm, value);
	}


	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public MCNumber in_offst() {
		return getConstNumber(offset + 57, $in_offst);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(MCNumber value) {
		setConstNumber(offset + 57, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(int value) {
		setConstNumber(offset + 57, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(long value) {
		setConstNumber(offset + 57, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(float value) {
		setConstNumber(offset + 57, $in_offst, value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(double value) {
		setConstNumber(offset + 57, $in_offst, value);
	}


	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public String bkf_typ() {
		return getConstString(offset + 58, $bkf_typ);
	}

	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public void bkf_typ(String value) {
		setConstString(offset + 58, $bkf_typ, value);
	}


	/**
	 * Backflush type name バックフラッシュ区分名.<p>
	 *
	 */
	public String bkf_typ_nm() {
		return getConstString(offset + 59, $bkf_typ_nm);
	}

	/**
	 * Backflush type name バックフラッシュ区分名.<p>
	 *
	 */
	public void bkf_typ_nm(String value) {
		setConstString(offset + 59, $bkf_typ_nm, value);
	}


	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public boolean inst_lot_fix_flg() {
		return getConstBoolean(offset + 60, $inst_lot_fix_flg);
	}

	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public void inst_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 60, $inst_lot_fix_flg, value);
	}


	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public boolean lot_mix_flg() {
		return getConstBoolean(offset + 61, $lot_mix_flg);
	}

	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public void lot_mix_flg(boolean value) {
		setConstBoolean(offset + 61, $lot_mix_flg, value);
	}


	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public boolean sublot_mix_flg() {
		return getConstBoolean(offset + 62, $sublot_mix_flg);
	}

	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public void sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 62, $sublot_mix_flg, value);
	}


	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public String alloc_ctl_typ() {
		return getConstString(offset + 63, $alloc_ctl_typ);
	}

	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public void alloc_ctl_typ(String value) {
		setConstString(offset + 63, $alloc_ctl_typ, value);
	}


	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public String alloc_ctl_typ_nm() {
		return getConstString(offset + 64, $alloc_ctl_typ_nm);
	}

	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public void alloc_ctl_typ_nm(String value) {
		setConstString(offset + 64, $alloc_ctl_typ_nm, value);
	}


	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public boolean main_itm_flg() {
		return getConstBoolean(offset + 65, $main_itm_flg);
	}

	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public void main_itm_flg(boolean value) {
		setConstBoolean(offset + 65, $main_itm_flg, value);
	}


	/**
	 * For yield calculation 収率計算用.<p>
	 *
	 */
	public boolean yield_calc_flg() {
		return getConstBoolean(offset + 66, $yield_calc_flg);
	}

	/**
	 * For yield calculation 収率計算用.<p>
	 *
	 */
	public void yield_calc_flg(boolean value) {
		setConstBoolean(offset + 66, $yield_calc_flg, value);
	}


	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public String inpt_ctl_typ() {
		return getConstString(offset + 67, $inpt_ctl_typ);
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public void inpt_ctl_typ(String value) {
		setConstString(offset + 67, $inpt_ctl_typ, value);
	}


	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public String inpt_ctl_typ_nm() {
		return getConstString(offset + 68, $inpt_ctl_typ_nm);
	}

	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public void inpt_ctl_typ_nm(String value) {
		setConstString(offset + 68, $inpt_ctl_typ_nm, value);
	}


	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public String chng_no() {
		return getConstString(offset + 69, $chng_no);
	}

	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public void chng_no(String value) {
		setConstString(offset + 69, $chng_no, value);
	}


	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public String ext_sys_no_bom() {
		return getConstString(offset + 70, $ext_sys_no_bom);
	}

	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public void ext_sys_no_bom(String value) {
		setConstString(offset + 70, $ext_sys_no_bom, value);
	}


	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public boolean not_cost_flg() {
		return getConstBoolean(offset + 71, $not_cost_flg);
	}

	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public void not_cost_flg(boolean value) {
		setConstBoolean(offset + 71, $not_cost_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 72, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 72, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 73, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 73, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 74, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 74, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 75, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 75, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 76, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 76, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 77, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 77, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 78, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 78, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 79, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 79, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 80, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 81, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 81, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 82, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 82, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 83, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 83, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 84, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 84, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 85, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 85, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 86, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 86, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 87, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 87, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 88, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 88, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 89, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 89, $del_ts, value);
	}


	public String getString(String name) {
		if ($bom_key.equalsIgnoreCase(name)) {
			return bom_key();
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
		if ($chd_base_unit_cd.equalsIgnoreCase(name)) {
			return chd_base_unit_cd();
		}
		if ($chd_base_unit_nm.equalsIgnoreCase(name)) {
			return chd_base_unit_nm();
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
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
		if ($in_offst.equalsIgnoreCase(name)) {
			return in_offst();
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
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			return byprod_flg();
		}
		if ($ph_flg.equalsIgnoreCase(name)) {
			return ph_flg();
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			return alt_itm_flg();
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
		if ($chd_base_unit_cd.equalsIgnoreCase(name)) {
			return chd_base_unit_cd();
		}
		if ($chd_base_unit_nm.equalsIgnoreCase(name)) {
			return chd_base_unit_nm();
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
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
		if ($in_offst.equalsIgnoreCase(name)) {
			return in_offst();
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
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			return byprod_flg();
		}
		if ($ph_flg.equalsIgnoreCase(name)) {
			return ph_flg();
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			return alt_itm_flg();
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
		if ($chd_base_unit_cd.equalsIgnoreCase(name)) {
			chd_base_unit_cd(value);
			return;
		}
		if ($chd_base_unit_nm.equalsIgnoreCase(name)) {
			chd_base_unit_nm(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
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
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			byprod_flg(value);
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
		if ($chd_base_unit_cd.equalsIgnoreCase(name)) {
			chd_base_unit_cd(value);
			return;
		}
		if ($chd_base_unit_nm.equalsIgnoreCase(name)) {
			chd_base_unit_nm(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($in_offst.equalsIgnoreCase(name)) {
			in_offst(value);
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
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($byprod_flg.equalsIgnoreCase(name)) {
			byprod_flg(value);
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

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			return chd_itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($min_sno_p.equalsIgnoreCase(name)) {
			return min_sno_p();
		}
		if ($max_sno_p.equalsIgnoreCase(name)) {
			return max_sno_p();
		}
		if ($dt_p.equalsIgnoreCase(name)) {
			return dt_p();
		}
		if ($qty1_p.equalsIgnoreCase(name)) {
			return qty1_p();
		}
		if ($qty3_p.equalsIgnoreCase(name)) {
			return qty3_p();
		}
		if ($qty2_p.equalsIgnoreCase(name)) {
			return qty2_p();
		}
		if ($qty4_p.equalsIgnoreCase(name)) {
			return qty4_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			chd_itm_p(
				((MCContainerMeta) chd_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($min_sno_p.equalsIgnoreCase(name)) {
			min_sno_p(
				((MCContainerMeta) min_sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
			);
			return;
		}
		if ($max_sno_p.equalsIgnoreCase(name)) {
			max_sno_p(
				((MCContainerMeta) max_sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
			);
			return;
		}
		if ($dt_p.equalsIgnoreCase(name)) {
			dt_p(
				((MCContainerMeta) dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5010.DtR.class, value)
			);
			return;
		}
		if ($qty1_p.equalsIgnoreCase(name)) {
			qty1_p(
				((MCContainerMeta) qty1_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty3_p.equalsIgnoreCase(name)) {
			qty3_p(
				((MCContainerMeta) qty3_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty2_p.equalsIgnoreCase(name)) {
			qty2_p(
				((MCContainerMeta) qty2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty4_p.equalsIgnoreCase(name)) {
			qty4_p(
				((MCContainerMeta) qty4_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String par_itm_cd() {
		return itm_p().itm_cd();
	}

	public void par_itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String par_itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void par_itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String par_itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void par_itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String par_itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void par_itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return chd_itm_p().itm_cd();
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		chd_itm_p().itm_cd(value);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return chd_itm_p().itm_sub1();
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		chd_itm_p().itm_sub1(value);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return chd_itm_p().itm_sub2();
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		chd_itm_p().itm_sub2(value);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return chd_itm_p().itm_sub3();
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		chd_itm_p().itm_sub3(value);
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public String chd_itm_nm() {
		return chd_itm_p().itm_nm();
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		chd_itm_p().itm_nm(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	/**
	 * Min. SEIBAN No. 1 下限手配ＮＯ１.<p>
	 *
	 */
	public String min_sno1() {
		return min_sno_p().sno1();
	}

	/**
	 * Min. SEIBAN No. 1 下限手配ＮＯ１.<p>
	 *
	 */
	public void min_sno1(String value) {
		min_sno_p().sno1(value);
	}

	/**
	 * Min. SEIBAN No. 2 下限手配ＮＯ２.<p>
	 *
	 */
	public String min_sno2() {
		return min_sno_p().sno2();
	}

	/**
	 * Min. SEIBAN No. 2 下限手配ＮＯ２.<p>
	 *
	 */
	public void min_sno2(String value) {
		min_sno_p().sno2(value);
	}

	/**
	 * Min. SEIBAN No. 3 下限手配ＮＯ３.<p>
	 *
	 */
	public String min_sno3() {
		return min_sno_p().sno3();
	}

	/**
	 * Min. SEIBAN No. 3 下限手配ＮＯ３.<p>
	 *
	 */
	public void min_sno3(String value) {
		min_sno_p().sno3(value);
	}

	/**
	 * Min. SEIBAN No. 4 下限手配ＮＯ４.<p>
	 *
	 */
	public String min_sno4() {
		return min_sno_p().sno4();
	}

	/**
	 * Min. SEIBAN No. 4 下限手配ＮＯ４.<p>
	 *
	 */
	public void min_sno4(String value) {
		min_sno_p().sno4(value);
	}

	/**
	 * Max. SEIBAN No. 1 上限手配ＮＯ１.<p>
	 *
	 */
	public String max_sno1() {
		return max_sno_p().sno1();
	}

	/**
	 * Max. SEIBAN No. 1 上限手配ＮＯ１.<p>
	 *
	 */
	public void max_sno1(String value) {
		max_sno_p().sno1(value);
	}

	/**
	 * Max. SEIBAN No. 2 上限手配ＮＯ２.<p>
	 *
	 */
	public String max_sno2() {
		return max_sno_p().sno2();
	}

	/**
	 * Max. SEIBAN No. 2 上限手配ＮＯ２.<p>
	 *
	 */
	public void max_sno2(String value) {
		max_sno_p().sno2(value);
	}

	/**
	 * Max. SEIBAN No. 3 上限手配ＮＯ３.<p>
	 *
	 */
	public String max_sno3() {
		return max_sno_p().sno3();
	}

	/**
	 * Max. SEIBAN No. 3 上限手配ＮＯ３.<p>
	 *
	 */
	public void max_sno3(String value) {
		max_sno_p().sno3(value);
	}

	/**
	 * Max. SEIBAN No. 4 上限手配ＮＯ４.<p>
	 *
	 */
	public String max_sno4() {
		return max_sno_p().sno4();
	}

	/**
	 * Max. SEIBAN No. 4 上限手配ＮＯ４.<p>
	 *
	 */
	public void max_sno4(String value) {
		max_sno_p().sno4(value);
	}

	public MCDate st_dt() {
		return dt_p().st_dt();
	}

	public void st_dt(MCDate value) {
		dt_p().st_dt(value);
	}

	public MCDate end_dt() {
		return dt_p().end_dt();
	}

	public void end_dt(MCDate value) {
		dt_p().end_dt(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public MCNumber par_inst_qty() {
		return qty1_p().qty();
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(MCNumber value) {
		qty1_p().qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(int value) {
		qty1_p().qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(long value) {
		qty1_p().qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(float value) {
		qty1_p().qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(double value) {
		qty1_p().qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public MCNumber chd_inpt_qty() {
		return qty3_p().qty();
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(MCNumber value) {
		qty3_p().qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(int value) {
		qty3_p().qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(long value) {
		qty3_p().qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(float value) {
		qty3_p().qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(double value) {
		qty3_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return qty2_p().qty();
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		qty2_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		qty2_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		qty2_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		qty2_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		qty2_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return qty4_p().qty();
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		qty4_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		qty4_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		qty4_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		qty4_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		qty4_p().qty(value);
	}

}

