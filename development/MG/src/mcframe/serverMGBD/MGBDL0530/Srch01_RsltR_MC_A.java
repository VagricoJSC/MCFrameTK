package mcframe.serverMGBD.MGBDL0530;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Common (Dummy for join) 共通（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_cmn = "dummy_cmn";
	/**
	 * WG (Dummy for join) ＷＧ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_wg = "dummy_wg";
	/**
	 * Common/WG (Dummy for join) 共通・ＷＧ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_cmn_wg = "dummy_cmn_wg";
	/**
	 * Parent item classification master 1 (Dummy for join) 親品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_par_itm_grp1 = "dummy_par_itm_grp1";
	/**
	 * Parent item classification master 2 (Dummy for join) 親品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_par_itm_grp2 = "dummy_par_itm_grp2";
	/**
	 * Parent item classification master 3 (Dummy for join) 親品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_par_itm_grp3 = "dummy_par_itm_grp3";
	/**
	 * Parent item classification master 4 (Dummy for join) 親品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_par_itm_grp4 = "dummy_par_itm_grp4";
	/**
	 * Parent item classification master 5 (Dummy for join) 親品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_par_itm_grp5 = "dummy_par_itm_grp5";
	/**
	 * Parent item classification master 6 (Dummy for join) 親品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_par_itm_grp6 = "dummy_par_itm_grp6";
	/**
	 * Parent item classification master 7 (Dummy for join) 親品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_par_itm_grp7 = "dummy_par_itm_grp7";
	/**
	 * Parent item classification master 8 (Dummy for join) 親品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_par_itm_grp8 = "dummy_par_itm_grp8";
	/**
	 * Parent item classification master 9 (Dummy for join) 親品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_par_itm_grp9 = "dummy_par_itm_grp9";
	/**
	 * Parent item classification master 10 (Dummy for join) 親品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_par_itm_grp10 = "dummy_par_itm_grp10";
	/**
	 * Child item classification master 1 (Dummy for join) 子品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_chd_itm_grp1 = "dummy_chd_itm_grp1";
	/**
	 * Child item classification master 2 (Dummy for join) 子品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_chd_itm_grp2 = "dummy_chd_itm_grp2";
	/**
	 * Child item classification master 3 (Dummy for join) 子品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_chd_itm_grp3 = "dummy_chd_itm_grp3";
	/**
	 * Child item classification master 4 (Dummy for join) 子品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_chd_itm_grp4 = "dummy_chd_itm_grp4";
	/**
	 * Child item classification master 5 (Dummy for join) 子品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_chd_itm_grp5 = "dummy_chd_itm_grp5";
	/**
	 * Child item classification master 6 (Dummy for join) 子品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_chd_itm_grp6 = "dummy_chd_itm_grp6";
	/**
	 * Child item classification master 7 (Dummy for join) 子品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_chd_itm_grp7 = "dummy_chd_itm_grp7";
	/**
	 * Child item classification master 8 (Dummy for join) 子品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_chd_itm_grp8 = "dummy_chd_itm_grp8";
	/**
	 * Child item classification master 9 (Dummy for join) 子品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_chd_itm_grp9 = "dummy_chd_itm_grp9";
	/**
	 * Child item classification master 10 (Dummy for join) 子品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_chd_itm_grp10 = "dummy_chd_itm_grp10";
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
	 * Term 期.<p>
	 *
	 */
	public static final String $term = "term";
	/**
	 * Term name 期名称.<p>
	 *
	 */
	public static final String $term_nm = "term_nm";
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
	 * Parent item name 親品名.<p>
	 *
	 */
	public static final String $par_itm_nm = "par_itm_nm";
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
	 * Cost base qty. 原価基準数.<p>
	 *
	 */
	public static final String $cost_std_qty = "cost_std_qty";
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
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $chd_itm_jnl_cd = "chd_itm_jnl_cd";
	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public static final String $chd_itm_jnl_nm = "chd_itm_jnl_nm";
	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public static final String $par_rqmt_qty = "par_rqmt_qty";
	/**
	 * Parent item base unit cd. 親品目基準単位ＣＤ.<p>
	 *
	 */
	public static final String $par_base_unit_cd = "par_base_unit_cd";
	/**
	 * Parent item base unit name 親品目基準単位名.<p>
	 *
	 */
	public static final String $par_base_unit_nm = "par_base_unit_nm";
	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public static final String $par_dec_place = "par_dec_place";
	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public static final String $chd_rqmt_qty = "chd_rqmt_qty";
	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public static final String $chd_base_qty = "chd_base_qty";
	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public static final String $fxd_chd_rqmt_qty = "fxd_chd_rqmt_qty";
	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public static final String $chd_min_qty = "chd_min_qty";
	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public static final String $chd_batch_qty = "chd_batch_qty";
	/**
	 * Child item base unit cd. 子品目基準単位ＣＤ.<p>
	 *
	 */
	public static final String $chd_base_unit_cd = "chd_base_unit_cd";
	/**
	 * Child item base unit name 子品目基準単位名.<p>
	 *
	 */
	public static final String $chd_base_unit_nm = "chd_base_unit_nm";
	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public static final String $chd_dec_place = "chd_dec_place";
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public static final String $alt_itm_ratio = "alt_itm_ratio";
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public static final String $expns_nm = "expns_nm";
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
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
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public static final String $non_calc_flg = "non_calc_flg";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta dummy_cmn_META = createCommonMeta($dummy_cmn, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dummy_wg_META = createCommonMeta($dummy_wg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dummy_cmn_wg_META = createCommonMeta($dummy_cmn_wg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dummy_par_itm_grp1_META = createCommonMeta($dummy_par_itm_grp1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_par_itm_grp2_META = createCommonMeta($dummy_par_itm_grp2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_par_itm_grp3_META = createCommonMeta($dummy_par_itm_grp3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_par_itm_grp4_META = createCommonMeta($dummy_par_itm_grp4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_par_itm_grp5_META = createCommonMeta($dummy_par_itm_grp5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_par_itm_grp6_META = createCommonMeta($dummy_par_itm_grp6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_par_itm_grp7_META = createCommonMeta($dummy_par_itm_grp7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_par_itm_grp8_META = createCommonMeta($dummy_par_itm_grp8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_par_itm_grp9_META = createCommonMeta($dummy_par_itm_grp9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_par_itm_grp10_META = createCommonMeta($dummy_par_itm_grp10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_chd_itm_grp1_META = createCommonMeta($dummy_chd_itm_grp1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_chd_itm_grp2_META = createCommonMeta($dummy_chd_itm_grp2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_chd_itm_grp3_META = createCommonMeta($dummy_chd_itm_grp3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_chd_itm_grp4_META = createCommonMeta($dummy_chd_itm_grp4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_chd_itm_grp5_META = createCommonMeta($dummy_chd_itm_grp5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_chd_itm_grp6_META = createCommonMeta($dummy_chd_itm_grp6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_chd_itm_grp7_META = createCommonMeta($dummy_chd_itm_grp7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_chd_itm_grp8_META = createCommonMeta($dummy_chd_itm_grp8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_chd_itm_grp9_META = createCommonMeta($dummy_chd_itm_grp9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta dummy_chd_itm_grp10_META = createCommonMeta($dummy_chd_itm_grp10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta term_nm_META = createCommonMeta($term_nm, mcframe.commonMA.meta.MA_META.TERM_NM);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta par_itm_nm_META = createCommonMeta($par_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta par_itm_typ_META = createCommonMeta($par_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta par_itm_typ_nm_META = createCommonMeta($par_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta par_itm_typ_d_cd_META = createCommonMeta($par_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta par_itm_typ_d_nm_META = createCommonMeta($par_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta par_itm_jnl_cd_META = createCommonMeta($par_itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta par_itm_jnl_nm_META = createCommonMeta($par_itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta cost_std_qty_META = createCommonMeta($cost_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta chd_itm_cd_META = createCommonMeta($chd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta chd_itm_sub1_META = createCommonMeta($chd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta chd_itm_sub2_META = createCommonMeta($chd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta chd_itm_sub3_META = createCommonMeta($chd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta chd_itm_nm_META = createCommonMeta($chd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta chd_itm_typ_META = createCommonMeta($chd_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta chd_itm_typ_nm_META = createCommonMeta($chd_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta chd_itm_typ_d_cd_META = createCommonMeta($chd_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta chd_itm_typ_d_nm_META = createCommonMeta($chd_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta chd_itm_jnl_cd_META = createCommonMeta($chd_itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta chd_itm_jnl_nm_META = createCommonMeta($chd_itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta par_rqmt_qty_META = createCommonMeta($par_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta par_base_unit_cd_META = createCommonMeta($par_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta par_base_unit_nm_META = createCommonMeta($par_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta par_dec_place_META = createCommonMeta($par_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta chd_rqmt_qty_META = createCommonMeta($chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_base_qty_META = createCommonMeta($chd_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_chd_rqmt_qty_META = createCommonMeta($fxd_chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_min_qty_META = createCommonMeta($chd_min_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_batch_qty_META = createCommonMeta($chd_batch_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_base_unit_cd_META = createCommonMeta($chd_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta chd_base_unit_nm_META = createCommonMeta($chd_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta chd_dec_place_META = createCommonMeta($chd_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_itm_ratio_META = createCommonMeta($alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta expns_nm_META = createCommonMeta($expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMG.meta.MG_META.ITM_DTL_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMG.meta.MG_META.ITM_DTL_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMG.meta.MG_META.ITM_DTL_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMG.meta.MG_META.ITM_DTL_SUB_CHAR3);
	public static final MCMeta non_calc_flg_META = createCommonMeta($non_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dummy_cmn_META,
			dummy_wg_META,
			dummy_cmn_wg_META,
			dummy_par_itm_grp1_META,
			dummy_par_itm_grp2_META,
			dummy_par_itm_grp3_META,
			dummy_par_itm_grp4_META,
			dummy_par_itm_grp5_META,
			dummy_par_itm_grp6_META,
			dummy_par_itm_grp7_META,
			dummy_par_itm_grp8_META,
			dummy_par_itm_grp9_META,
			dummy_par_itm_grp10_META,
			dummy_chd_itm_grp1_META,
			dummy_chd_itm_grp2_META,
			dummy_chd_itm_grp3_META,
			dummy_chd_itm_grp4_META,
			dummy_chd_itm_grp5_META,
			dummy_chd_itm_grp6_META,
			dummy_chd_itm_grp7_META,
			dummy_chd_itm_grp8_META,
			dummy_chd_itm_grp9_META,
			dummy_chd_itm_grp10_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			term_META,
			term_nm_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			par_itm_nm_META,
			par_itm_typ_META,
			par_itm_typ_nm_META,
			par_itm_typ_d_cd_META,
			par_itm_typ_d_nm_META,
			par_itm_jnl_cd_META,
			par_itm_jnl_nm_META,
			cost_std_qty_META,
			bom_ptn_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			disp_seq_META,
			chd_itm_cd_META,
			chd_itm_sub1_META,
			chd_itm_sub2_META,
			chd_itm_sub3_META,
			chd_itm_nm_META,
			chd_itm_typ_META,
			chd_itm_typ_nm_META,
			chd_itm_typ_d_cd_META,
			chd_itm_typ_d_nm_META,
			chd_itm_jnl_cd_META,
			chd_itm_jnl_nm_META,
			par_rqmt_qty_META,
			par_base_unit_cd_META,
			par_base_unit_nm_META,
			par_dec_place_META,
			chd_rqmt_qty_META,
			chd_base_qty_META,
			fxd_chd_rqmt_qty_META,
			chd_min_qty_META,
			chd_batch_qty_META,
			chd_base_unit_cd_META,
			chd_base_unit_nm_META,
			chd_dec_place_META,
			alt_grp_cd_META,
			alt_itm_ratio_META,
			expns_cd_META,
			expns_nm_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			non_calc_flg_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			upd_cntr_META
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
				{$par_itm_typ, "MAC_ITM_TYP"},	// par_itm_typ
				{$chd_itm_typ, "MAC_ITM_TYP"}	// chd_itm_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Common (Dummy for join) 共通（結合用ダミー）.<p>
	 *
	 */
	public boolean dummy_cmn() {
		return getConstBoolean(offset + 0, $dummy_cmn);
	}

	/**
	 * Common (Dummy for join) 共通（結合用ダミー）.<p>
	 *
	 */
	public void dummy_cmn(boolean value) {
		setConstBoolean(offset + 0, $dummy_cmn, value);
	}


	/**
	 * WG (Dummy for join) ＷＧ（結合用ダミー）.<p>
	 *
	 */
	public boolean dummy_wg() {
		return getConstBoolean(offset + 1, $dummy_wg);
	}

	/**
	 * WG (Dummy for join) ＷＧ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_wg(boolean value) {
		setConstBoolean(offset + 1, $dummy_wg, value);
	}


	/**
	 * Common/WG (Dummy for join) 共通・ＷＧ（結合用ダミー）.<p>
	 *
	 */
	public boolean dummy_cmn_wg() {
		return getConstBoolean(offset + 2, $dummy_cmn_wg);
	}

	/**
	 * Common/WG (Dummy for join) 共通・ＷＧ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_cmn_wg(boolean value) {
		setConstBoolean(offset + 2, $dummy_cmn_wg, value);
	}


	/**
	 * Parent item classification master 1 (Dummy for join) 親品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public String dummy_par_itm_grp1() {
		return getConstString(offset + 3, $dummy_par_itm_grp1);
	}

	/**
	 * Parent item classification master 1 (Dummy for join) 親品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public void dummy_par_itm_grp1(String value) {
		setConstString(offset + 3, $dummy_par_itm_grp1, value);
	}


	/**
	 * Parent item classification master 2 (Dummy for join) 親品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public String dummy_par_itm_grp2() {
		return getConstString(offset + 4, $dummy_par_itm_grp2);
	}

	/**
	 * Parent item classification master 2 (Dummy for join) 親品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public void dummy_par_itm_grp2(String value) {
		setConstString(offset + 4, $dummy_par_itm_grp2, value);
	}


	/**
	 * Parent item classification master 3 (Dummy for join) 親品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public String dummy_par_itm_grp3() {
		return getConstString(offset + 5, $dummy_par_itm_grp3);
	}

	/**
	 * Parent item classification master 3 (Dummy for join) 親品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public void dummy_par_itm_grp3(String value) {
		setConstString(offset + 5, $dummy_par_itm_grp3, value);
	}


	/**
	 * Parent item classification master 4 (Dummy for join) 親品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public String dummy_par_itm_grp4() {
		return getConstString(offset + 6, $dummy_par_itm_grp4);
	}

	/**
	 * Parent item classification master 4 (Dummy for join) 親品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public void dummy_par_itm_grp4(String value) {
		setConstString(offset + 6, $dummy_par_itm_grp4, value);
	}


	/**
	 * Parent item classification master 5 (Dummy for join) 親品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public String dummy_par_itm_grp5() {
		return getConstString(offset + 7, $dummy_par_itm_grp5);
	}

	/**
	 * Parent item classification master 5 (Dummy for join) 親品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public void dummy_par_itm_grp5(String value) {
		setConstString(offset + 7, $dummy_par_itm_grp5, value);
	}


	/**
	 * Parent item classification master 6 (Dummy for join) 親品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public String dummy_par_itm_grp6() {
		return getConstString(offset + 8, $dummy_par_itm_grp6);
	}

	/**
	 * Parent item classification master 6 (Dummy for join) 親品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public void dummy_par_itm_grp6(String value) {
		setConstString(offset + 8, $dummy_par_itm_grp6, value);
	}


	/**
	 * Parent item classification master 7 (Dummy for join) 親品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public String dummy_par_itm_grp7() {
		return getConstString(offset + 9, $dummy_par_itm_grp7);
	}

	/**
	 * Parent item classification master 7 (Dummy for join) 親品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public void dummy_par_itm_grp7(String value) {
		setConstString(offset + 9, $dummy_par_itm_grp7, value);
	}


	/**
	 * Parent item classification master 8 (Dummy for join) 親品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public String dummy_par_itm_grp8() {
		return getConstString(offset + 10, $dummy_par_itm_grp8);
	}

	/**
	 * Parent item classification master 8 (Dummy for join) 親品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public void dummy_par_itm_grp8(String value) {
		setConstString(offset + 10, $dummy_par_itm_grp8, value);
	}


	/**
	 * Parent item classification master 9 (Dummy for join) 親品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public String dummy_par_itm_grp9() {
		return getConstString(offset + 11, $dummy_par_itm_grp9);
	}

	/**
	 * Parent item classification master 9 (Dummy for join) 親品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public void dummy_par_itm_grp9(String value) {
		setConstString(offset + 11, $dummy_par_itm_grp9, value);
	}


	/**
	 * Parent item classification master 10 (Dummy for join) 親品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public String dummy_par_itm_grp10() {
		return getConstString(offset + 12, $dummy_par_itm_grp10);
	}

	/**
	 * Parent item classification master 10 (Dummy for join) 親品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public void dummy_par_itm_grp10(String value) {
		setConstString(offset + 12, $dummy_par_itm_grp10, value);
	}


	/**
	 * Child item classification master 1 (Dummy for join) 子品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public String dummy_chd_itm_grp1() {
		return getConstString(offset + 13, $dummy_chd_itm_grp1);
	}

	/**
	 * Child item classification master 1 (Dummy for join) 子品目分類マスタ１（結合用ダミー）.<p>
	 *
	 */
	public void dummy_chd_itm_grp1(String value) {
		setConstString(offset + 13, $dummy_chd_itm_grp1, value);
	}


	/**
	 * Child item classification master 2 (Dummy for join) 子品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public String dummy_chd_itm_grp2() {
		return getConstString(offset + 14, $dummy_chd_itm_grp2);
	}

	/**
	 * Child item classification master 2 (Dummy for join) 子品目分類マスタ２（結合用ダミー）.<p>
	 *
	 */
	public void dummy_chd_itm_grp2(String value) {
		setConstString(offset + 14, $dummy_chd_itm_grp2, value);
	}


	/**
	 * Child item classification master 3 (Dummy for join) 子品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public String dummy_chd_itm_grp3() {
		return getConstString(offset + 15, $dummy_chd_itm_grp3);
	}

	/**
	 * Child item classification master 3 (Dummy for join) 子品目分類マスタ３（結合用ダミー）.<p>
	 *
	 */
	public void dummy_chd_itm_grp3(String value) {
		setConstString(offset + 15, $dummy_chd_itm_grp3, value);
	}


	/**
	 * Child item classification master 4 (Dummy for join) 子品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public String dummy_chd_itm_grp4() {
		return getConstString(offset + 16, $dummy_chd_itm_grp4);
	}

	/**
	 * Child item classification master 4 (Dummy for join) 子品目分類マスタ４（結合用ダミー）.<p>
	 *
	 */
	public void dummy_chd_itm_grp4(String value) {
		setConstString(offset + 16, $dummy_chd_itm_grp4, value);
	}


	/**
	 * Child item classification master 5 (Dummy for join) 子品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public String dummy_chd_itm_grp5() {
		return getConstString(offset + 17, $dummy_chd_itm_grp5);
	}

	/**
	 * Child item classification master 5 (Dummy for join) 子品目分類マスタ５（結合用ダミー）.<p>
	 *
	 */
	public void dummy_chd_itm_grp5(String value) {
		setConstString(offset + 17, $dummy_chd_itm_grp5, value);
	}


	/**
	 * Child item classification master 6 (Dummy for join) 子品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public String dummy_chd_itm_grp6() {
		return getConstString(offset + 18, $dummy_chd_itm_grp6);
	}

	/**
	 * Child item classification master 6 (Dummy for join) 子品目分類マスタ６（結合用ダミー）.<p>
	 *
	 */
	public void dummy_chd_itm_grp6(String value) {
		setConstString(offset + 18, $dummy_chd_itm_grp6, value);
	}


	/**
	 * Child item classification master 7 (Dummy for join) 子品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public String dummy_chd_itm_grp7() {
		return getConstString(offset + 19, $dummy_chd_itm_grp7);
	}

	/**
	 * Child item classification master 7 (Dummy for join) 子品目分類マスタ７（結合用ダミー）.<p>
	 *
	 */
	public void dummy_chd_itm_grp7(String value) {
		setConstString(offset + 19, $dummy_chd_itm_grp7, value);
	}


	/**
	 * Child item classification master 8 (Dummy for join) 子品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public String dummy_chd_itm_grp8() {
		return getConstString(offset + 20, $dummy_chd_itm_grp8);
	}

	/**
	 * Child item classification master 8 (Dummy for join) 子品目分類マスタ８（結合用ダミー）.<p>
	 *
	 */
	public void dummy_chd_itm_grp8(String value) {
		setConstString(offset + 20, $dummy_chd_itm_grp8, value);
	}


	/**
	 * Child item classification master 9 (Dummy for join) 子品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public String dummy_chd_itm_grp9() {
		return getConstString(offset + 21, $dummy_chd_itm_grp9);
	}

	/**
	 * Child item classification master 9 (Dummy for join) 子品目分類マスタ９（結合用ダミー）.<p>
	 *
	 */
	public void dummy_chd_itm_grp9(String value) {
		setConstString(offset + 21, $dummy_chd_itm_grp9, value);
	}


	/**
	 * Child item classification master 10 (Dummy for join) 子品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public String dummy_chd_itm_grp10() {
		return getConstString(offset + 22, $dummy_chd_itm_grp10);
	}

	/**
	 * Child item classification master 10 (Dummy for join) 子品目分類マスタ１０（結合用ダミー）.<p>
	 *
	 */
	public void dummy_chd_itm_grp10(String value) {
		setConstString(offset + 22, $dummy_chd_itm_grp10, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 23, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 23, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 24, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 24, $calc_ctg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 25, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 25, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 26, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 26, $wg_nm, value);
	}


	/**
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 27, $term);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 27, $term, value);
	}


	/**
	 * Term name 期名称.<p>
	 *
	 */
	public String term_nm() {
		return getConstString(offset + 28, $term_nm);
	}

	/**
	 * Term name 期名称.<p>
	 *
	 */
	public void term_nm(String value) {
		setConstString(offset + 28, $term_nm, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 29, $par_itm_cd);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 29, $par_itm_cd, value);
	}


	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 30, $par_itm_sub1);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 30, $par_itm_sub1, value);
	}


	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 31, $par_itm_sub2);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 31, $par_itm_sub2, value);
	}


	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 32, $par_itm_sub3);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 32, $par_itm_sub3, value);
	}


	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return getConstString(offset + 33, $par_itm_nm);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		setConstString(offset + 33, $par_itm_nm, value);
	}


	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public String par_itm_typ() {
		return getConstString(offset + 34, $par_itm_typ);
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ(String value) {
		setConstString(offset + 34, $par_itm_typ, value);
	}


	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public String par_itm_typ_nm() {
		return getConstString(offset + 35, $par_itm_typ_nm);
	}

	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public void par_itm_typ_nm(String value) {
		setConstString(offset + 35, $par_itm_typ_nm, value);
	}


	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public String par_itm_typ_d_cd() {
		return getConstString(offset + 36, $par_itm_typ_d_cd);
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public void par_itm_typ_d_cd(String value) {
		setConstString(offset + 36, $par_itm_typ_d_cd, value);
	}


	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public String par_itm_typ_d_nm() {
		return getConstString(offset + 37, $par_itm_typ_d_nm);
	}

	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public void par_itm_typ_d_nm(String value) {
		setConstString(offset + 37, $par_itm_typ_d_nm, value);
	}


	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public String par_itm_jnl_cd() {
		return getConstString(offset + 38, $par_itm_jnl_cd);
	}

	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public void par_itm_jnl_cd(String value) {
		setConstString(offset + 38, $par_itm_jnl_cd, value);
	}


	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public String par_itm_jnl_nm() {
		return getConstString(offset + 39, $par_itm_jnl_nm);
	}

	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public void par_itm_jnl_nm(String value) {
		setConstString(offset + 39, $par_itm_jnl_nm, value);
	}


	/**
	 * Cost base qty. 原価基準数.<p>
	 *
	 */
	public MCNumber cost_std_qty() {
		return getConstNumber(offset + 40, $cost_std_qty);
	}

	/**
	 * Cost base qty. 原価基準数.<p>
	 *
	 */
	public void cost_std_qty(MCNumber value) {
		setConstNumber(offset + 40, $cost_std_qty, value);
	}

	/**
	 * Cost base qty. 原価基準数.<p>
	 *
	 */
	public void cost_std_qty(int value) {
		setConstNumber(offset + 40, $cost_std_qty, value);
	}

	/**
	 * Cost base qty. 原価基準数.<p>
	 *
	 */
	public void cost_std_qty(long value) {
		setConstNumber(offset + 40, $cost_std_qty, value);
	}

	/**
	 * Cost base qty. 原価基準数.<p>
	 *
	 */
	public void cost_std_qty(float value) {
		setConstNumber(offset + 40, $cost_std_qty, value);
	}

	/**
	 * Cost base qty. 原価基準数.<p>
	 *
	 */
	public void cost_std_qty(double value) {
		setConstNumber(offset + 40, $cost_std_qty, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 41, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 41, $bom_ptn, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 42, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 42, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 43, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 43, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 44, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 44, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 44, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 44, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 44, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 44, $oper_seq, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 45, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 45, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 45, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 45, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 45, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 45, $disp_seq, value);
	}


	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return getConstString(offset + 46, $chd_itm_cd);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		setConstString(offset + 46, $chd_itm_cd, value);
	}


	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return getConstString(offset + 47, $chd_itm_sub1);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		setConstString(offset + 47, $chd_itm_sub1, value);
	}


	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return getConstString(offset + 48, $chd_itm_sub2);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		setConstString(offset + 48, $chd_itm_sub2, value);
	}


	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return getConstString(offset + 49, $chd_itm_sub3);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		setConstString(offset + 49, $chd_itm_sub3, value);
	}


	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public String chd_itm_nm() {
		return getConstString(offset + 50, $chd_itm_nm);
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		setConstString(offset + 50, $chd_itm_nm, value);
	}


	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public String chd_itm_typ() {
		return getConstString(offset + 51, $chd_itm_typ);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ(String value) {
		setConstString(offset + 51, $chd_itm_typ, value);
	}


	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public String chd_itm_typ_nm() {
		return getConstString(offset + 52, $chd_itm_typ_nm);
	}

	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public void chd_itm_typ_nm(String value) {
		setConstString(offset + 52, $chd_itm_typ_nm, value);
	}


	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public String chd_itm_typ_d_cd() {
		return getConstString(offset + 53, $chd_itm_typ_d_cd);
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public void chd_itm_typ_d_cd(String value) {
		setConstString(offset + 53, $chd_itm_typ_d_cd, value);
	}


	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public String chd_itm_typ_d_nm() {
		return getConstString(offset + 54, $chd_itm_typ_d_nm);
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public void chd_itm_typ_d_nm(String value) {
		setConstString(offset + 54, $chd_itm_typ_d_nm, value);
	}


	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public String chd_itm_jnl_cd() {
		return getConstString(offset + 55, $chd_itm_jnl_cd);
	}

	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public void chd_itm_jnl_cd(String value) {
		setConstString(offset + 55, $chd_itm_jnl_cd, value);
	}


	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public String chd_itm_jnl_nm() {
		return getConstString(offset + 56, $chd_itm_jnl_nm);
	}

	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public void chd_itm_jnl_nm(String value) {
		setConstString(offset + 56, $chd_itm_jnl_nm, value);
	}


	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public MCNumber par_rqmt_qty() {
		return getConstNumber(offset + 57, $par_rqmt_qty);
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 57, $par_rqmt_qty, value);
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(int value) {
		setConstNumber(offset + 57, $par_rqmt_qty, value);
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(long value) {
		setConstNumber(offset + 57, $par_rqmt_qty, value);
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(float value) {
		setConstNumber(offset + 57, $par_rqmt_qty, value);
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(double value) {
		setConstNumber(offset + 57, $par_rqmt_qty, value);
	}


	/**
	 * Parent item base unit cd. 親品目基準単位ＣＤ.<p>
	 *
	 */
	public String par_base_unit_cd() {
		return getConstString(offset + 58, $par_base_unit_cd);
	}

	/**
	 * Parent item base unit cd. 親品目基準単位ＣＤ.<p>
	 *
	 */
	public void par_base_unit_cd(String value) {
		setConstString(offset + 58, $par_base_unit_cd, value);
	}


	/**
	 * Parent item base unit name 親品目基準単位名.<p>
	 *
	 */
	public String par_base_unit_nm() {
		return getConstString(offset + 59, $par_base_unit_nm);
	}

	/**
	 * Parent item base unit name 親品目基準単位名.<p>
	 *
	 */
	public void par_base_unit_nm(String value) {
		setConstString(offset + 59, $par_base_unit_nm, value);
	}


	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public MCNumber par_dec_place() {
		return getConstNumber(offset + 60, $par_dec_place);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(MCNumber value) {
		setConstNumber(offset + 60, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(int value) {
		setConstNumber(offset + 60, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(long value) {
		setConstNumber(offset + 60, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(float value) {
		setConstNumber(offset + 60, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(double value) {
		setConstNumber(offset + 60, $par_dec_place, value);
	}


	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return getConstNumber(offset + 61, $chd_rqmt_qty);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 61, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		setConstNumber(offset + 61, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		setConstNumber(offset + 61, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		setConstNumber(offset + 61, $chd_rqmt_qty, value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		setConstNumber(offset + 61, $chd_rqmt_qty, value);
	}


	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public MCNumber chd_base_qty() {
		return getConstNumber(offset + 62, $chd_base_qty);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(MCNumber value) {
		setConstNumber(offset + 62, $chd_base_qty, value);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(int value) {
		setConstNumber(offset + 62, $chd_base_qty, value);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(long value) {
		setConstNumber(offset + 62, $chd_base_qty, value);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(float value) {
		setConstNumber(offset + 62, $chd_base_qty, value);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(double value) {
		setConstNumber(offset + 62, $chd_base_qty, value);
	}


	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return getConstNumber(offset + 63, $fxd_chd_rqmt_qty);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 63, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		setConstNumber(offset + 63, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		setConstNumber(offset + 63, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		setConstNumber(offset + 63, $fxd_chd_rqmt_qty, value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		setConstNumber(offset + 63, $fxd_chd_rqmt_qty, value);
	}


	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public MCNumber chd_min_qty() {
		return getConstNumber(offset + 64, $chd_min_qty);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(MCNumber value) {
		setConstNumber(offset + 64, $chd_min_qty, value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(int value) {
		setConstNumber(offset + 64, $chd_min_qty, value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(long value) {
		setConstNumber(offset + 64, $chd_min_qty, value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(float value) {
		setConstNumber(offset + 64, $chd_min_qty, value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(double value) {
		setConstNumber(offset + 64, $chd_min_qty, value);
	}


	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public MCNumber chd_batch_qty() {
		return getConstNumber(offset + 65, $chd_batch_qty);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(MCNumber value) {
		setConstNumber(offset + 65, $chd_batch_qty, value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(int value) {
		setConstNumber(offset + 65, $chd_batch_qty, value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(long value) {
		setConstNumber(offset + 65, $chd_batch_qty, value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(float value) {
		setConstNumber(offset + 65, $chd_batch_qty, value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(double value) {
		setConstNumber(offset + 65, $chd_batch_qty, value);
	}


	/**
	 * Child item base unit cd. 子品目基準単位ＣＤ.<p>
	 *
	 */
	public String chd_base_unit_cd() {
		return getConstString(offset + 66, $chd_base_unit_cd);
	}

	/**
	 * Child item base unit cd. 子品目基準単位ＣＤ.<p>
	 *
	 */
	public void chd_base_unit_cd(String value) {
		setConstString(offset + 66, $chd_base_unit_cd, value);
	}


	/**
	 * Child item base unit name 子品目基準単位名.<p>
	 *
	 */
	public String chd_base_unit_nm() {
		return getConstString(offset + 67, $chd_base_unit_nm);
	}

	/**
	 * Child item base unit name 子品目基準単位名.<p>
	 *
	 */
	public void chd_base_unit_nm(String value) {
		setConstString(offset + 67, $chd_base_unit_nm, value);
	}


	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public MCNumber chd_dec_place() {
		return getConstNumber(offset + 68, $chd_dec_place);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(MCNumber value) {
		setConstNumber(offset + 68, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(int value) {
		setConstNumber(offset + 68, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(long value) {
		setConstNumber(offset + 68, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(float value) {
		setConstNumber(offset + 68, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(double value) {
		setConstNumber(offset + 68, $chd_dec_place, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 69, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 69, $alt_grp_cd, value);
	}


	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 70, $alt_itm_ratio);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 70, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 70, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 70, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 70, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 70, $alt_itm_ratio, value);
	}


	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 71, $expns_cd);
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 71, $expns_cd, value);
	}


	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public String expns_nm() {
		return getConstString(offset + 72, $expns_nm);
	}

	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public void expns_nm(String value) {
		setConstString(offset + 72, $expns_nm, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 73, $rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 73, $rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 74, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 74, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 75, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 75, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 76, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 76, $sub_char3, value);
	}


	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public boolean non_calc_flg() {
		return getConstBoolean(offset + 77, $non_calc_flg);
	}

	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public void non_calc_flg(boolean value) {
		setConstBoolean(offset + 77, $non_calc_flg, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 78, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 78, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 79, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 79, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 80, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 80, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 81, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 81, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 82, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 82, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 83, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 83, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 84, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 84, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 85, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 85, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 86, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 86, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 87, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 87, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 88, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 88, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 89, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 89, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 89, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 89, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 89, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 89, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($dummy_par_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp1();
		}
		if ($dummy_par_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp2();
		}
		if ($dummy_par_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp3();
		}
		if ($dummy_par_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp4();
		}
		if ($dummy_par_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp5();
		}
		if ($dummy_par_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp6();
		}
		if ($dummy_par_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp7();
		}
		if ($dummy_par_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp8();
		}
		if ($dummy_par_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp9();
		}
		if ($dummy_par_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp10();
		}
		if ($dummy_chd_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp1();
		}
		if ($dummy_chd_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp2();
		}
		if ($dummy_chd_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp3();
		}
		if ($dummy_chd_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp4();
		}
		if ($dummy_chd_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp5();
		}
		if ($dummy_chd_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp6();
		}
		if ($dummy_chd_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp7();
		}
		if ($dummy_chd_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp8();
		}
		if ($dummy_chd_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp9();
		}
		if ($dummy_chd_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp10();
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
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
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
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
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
		if ($chd_itm_jnl_cd.equalsIgnoreCase(name)) {
			return chd_itm_jnl_cd();
		}
		if ($chd_itm_jnl_nm.equalsIgnoreCase(name)) {
			return chd_itm_jnl_nm();
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			return par_base_unit_cd();
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			return par_base_unit_nm();
		}
		if ($chd_base_unit_cd.equalsIgnoreCase(name)) {
			return chd_base_unit_cd();
		}
		if ($chd_base_unit_nm.equalsIgnoreCase(name)) {
			return chd_base_unit_nm();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			return cost_std_qty();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			return par_rqmt_qty();
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			return chd_base_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			return chd_min_qty();
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			return chd_batch_qty();
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			return chd_dec_place();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
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
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($dummy_cmn.equalsIgnoreCase(name)) {
			return dummy_cmn();
		}
		if ($dummy_wg.equalsIgnoreCase(name)) {
			return dummy_wg();
		}
		if ($dummy_cmn_wg.equalsIgnoreCase(name)) {
			return dummy_cmn_wg();
		}
		if ($non_calc_flg.equalsIgnoreCase(name)) {
			return non_calc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dummy_par_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp1();
		}
		if ($dummy_par_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp2();
		}
		if ($dummy_par_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp3();
		}
		if ($dummy_par_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp4();
		}
		if ($dummy_par_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp5();
		}
		if ($dummy_par_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp6();
		}
		if ($dummy_par_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp7();
		}
		if ($dummy_par_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp8();
		}
		if ($dummy_par_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp9();
		}
		if ($dummy_par_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_par_itm_grp10();
		}
		if ($dummy_chd_itm_grp1.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp1();
		}
		if ($dummy_chd_itm_grp2.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp2();
		}
		if ($dummy_chd_itm_grp3.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp3();
		}
		if ($dummy_chd_itm_grp4.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp4();
		}
		if ($dummy_chd_itm_grp5.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp5();
		}
		if ($dummy_chd_itm_grp6.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp6();
		}
		if ($dummy_chd_itm_grp7.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp7();
		}
		if ($dummy_chd_itm_grp8.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp8();
		}
		if ($dummy_chd_itm_grp9.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp9();
		}
		if ($dummy_chd_itm_grp10.equalsIgnoreCase(name)) {
			return dummy_chd_itm_grp10();
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
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
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
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
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
		if ($chd_itm_jnl_cd.equalsIgnoreCase(name)) {
			return chd_itm_jnl_cd();
		}
		if ($chd_itm_jnl_nm.equalsIgnoreCase(name)) {
			return chd_itm_jnl_nm();
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			return par_base_unit_cd();
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			return par_base_unit_nm();
		}
		if ($chd_base_unit_cd.equalsIgnoreCase(name)) {
			return chd_base_unit_cd();
		}
		if ($chd_base_unit_nm.equalsIgnoreCase(name)) {
			return chd_base_unit_nm();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			return cost_std_qty();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			return par_rqmt_qty();
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			return chd_base_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			return chd_min_qty();
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			return chd_batch_qty();
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			return chd_dec_place();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
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
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dummy_cmn.equalsIgnoreCase(name)) {
			return dummy_cmn();
		}
		if ($dummy_wg.equalsIgnoreCase(name)) {
			return dummy_wg();
		}
		if ($dummy_cmn_wg.equalsIgnoreCase(name)) {
			return dummy_cmn_wg();
		}
		if ($non_calc_flg.equalsIgnoreCase(name)) {
			return non_calc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dummy_par_itm_grp1.equalsIgnoreCase(name)) {
			dummy_par_itm_grp1(value);
			return;
		}
		if ($dummy_par_itm_grp2.equalsIgnoreCase(name)) {
			dummy_par_itm_grp2(value);
			return;
		}
		if ($dummy_par_itm_grp3.equalsIgnoreCase(name)) {
			dummy_par_itm_grp3(value);
			return;
		}
		if ($dummy_par_itm_grp4.equalsIgnoreCase(name)) {
			dummy_par_itm_grp4(value);
			return;
		}
		if ($dummy_par_itm_grp5.equalsIgnoreCase(name)) {
			dummy_par_itm_grp5(value);
			return;
		}
		if ($dummy_par_itm_grp6.equalsIgnoreCase(name)) {
			dummy_par_itm_grp6(value);
			return;
		}
		if ($dummy_par_itm_grp7.equalsIgnoreCase(name)) {
			dummy_par_itm_grp7(value);
			return;
		}
		if ($dummy_par_itm_grp8.equalsIgnoreCase(name)) {
			dummy_par_itm_grp8(value);
			return;
		}
		if ($dummy_par_itm_grp9.equalsIgnoreCase(name)) {
			dummy_par_itm_grp9(value);
			return;
		}
		if ($dummy_par_itm_grp10.equalsIgnoreCase(name)) {
			dummy_par_itm_grp10(value);
			return;
		}
		if ($dummy_chd_itm_grp1.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp1(value);
			return;
		}
		if ($dummy_chd_itm_grp2.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp2(value);
			return;
		}
		if ($dummy_chd_itm_grp3.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp3(value);
			return;
		}
		if ($dummy_chd_itm_grp4.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp4(value);
			return;
		}
		if ($dummy_chd_itm_grp5.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp5(value);
			return;
		}
		if ($dummy_chd_itm_grp6.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp6(value);
			return;
		}
		if ($dummy_chd_itm_grp7.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp7(value);
			return;
		}
		if ($dummy_chd_itm_grp8.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp8(value);
			return;
		}
		if ($dummy_chd_itm_grp9.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp9(value);
			return;
		}
		if ($dummy_chd_itm_grp10.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp10(value);
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
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
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
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
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
		if ($chd_itm_jnl_cd.equalsIgnoreCase(name)) {
			chd_itm_jnl_cd(value);
			return;
		}
		if ($chd_itm_jnl_nm.equalsIgnoreCase(name)) {
			chd_itm_jnl_nm(value);
			return;
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			par_base_unit_cd(value);
			return;
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			par_base_unit_nm(value);
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
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
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dummy_cmn.equalsIgnoreCase(name)) {
			dummy_cmn(value);
			return;
		}
		if ($dummy_wg.equalsIgnoreCase(name)) {
			dummy_wg(value);
			return;
		}
		if ($dummy_cmn_wg.equalsIgnoreCase(name)) {
			dummy_cmn_wg(value);
			return;
		}
		if ($non_calc_flg.equalsIgnoreCase(name)) {
			non_calc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dummy_par_itm_grp1.equalsIgnoreCase(name)) {
			dummy_par_itm_grp1(value);
			return;
		}
		if ($dummy_par_itm_grp2.equalsIgnoreCase(name)) {
			dummy_par_itm_grp2(value);
			return;
		}
		if ($dummy_par_itm_grp3.equalsIgnoreCase(name)) {
			dummy_par_itm_grp3(value);
			return;
		}
		if ($dummy_par_itm_grp4.equalsIgnoreCase(name)) {
			dummy_par_itm_grp4(value);
			return;
		}
		if ($dummy_par_itm_grp5.equalsIgnoreCase(name)) {
			dummy_par_itm_grp5(value);
			return;
		}
		if ($dummy_par_itm_grp6.equalsIgnoreCase(name)) {
			dummy_par_itm_grp6(value);
			return;
		}
		if ($dummy_par_itm_grp7.equalsIgnoreCase(name)) {
			dummy_par_itm_grp7(value);
			return;
		}
		if ($dummy_par_itm_grp8.equalsIgnoreCase(name)) {
			dummy_par_itm_grp8(value);
			return;
		}
		if ($dummy_par_itm_grp9.equalsIgnoreCase(name)) {
			dummy_par_itm_grp9(value);
			return;
		}
		if ($dummy_par_itm_grp10.equalsIgnoreCase(name)) {
			dummy_par_itm_grp10(value);
			return;
		}
		if ($dummy_chd_itm_grp1.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp1(value);
			return;
		}
		if ($dummy_chd_itm_grp2.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp2(value);
			return;
		}
		if ($dummy_chd_itm_grp3.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp3(value);
			return;
		}
		if ($dummy_chd_itm_grp4.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp4(value);
			return;
		}
		if ($dummy_chd_itm_grp5.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp5(value);
			return;
		}
		if ($dummy_chd_itm_grp6.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp6(value);
			return;
		}
		if ($dummy_chd_itm_grp7.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp7(value);
			return;
		}
		if ($dummy_chd_itm_grp8.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp8(value);
			return;
		}
		if ($dummy_chd_itm_grp9.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp9(value);
			return;
		}
		if ($dummy_chd_itm_grp10.equalsIgnoreCase(name)) {
			dummy_chd_itm_grp10(value);
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
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
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
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
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
		if ($chd_itm_jnl_cd.equalsIgnoreCase(name)) {
			chd_itm_jnl_cd(value);
			return;
		}
		if ($chd_itm_jnl_nm.equalsIgnoreCase(name)) {
			chd_itm_jnl_nm(value);
			return;
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			par_base_unit_cd(value);
			return;
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			par_base_unit_nm(value);
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
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
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dummy_cmn.equalsIgnoreCase(name)) {
			dummy_cmn(value);
			return;
		}
		if ($dummy_wg.equalsIgnoreCase(name)) {
			dummy_wg(value);
			return;
		}
		if ($dummy_cmn_wg.equalsIgnoreCase(name)) {
			dummy_cmn_wg(value);
			return;
		}
		if ($non_calc_flg.equalsIgnoreCase(name)) {
			non_calc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

