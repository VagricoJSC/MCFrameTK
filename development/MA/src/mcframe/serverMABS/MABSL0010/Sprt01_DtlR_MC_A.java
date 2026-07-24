package mcframe.serverMABS.MABSL0010;

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
 * ブロック"Sprt01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sprt01_DtlR_MC_A extends MCConstRow {

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public static final String $st_dt_key = "st_dt_key";
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
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
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $def_bom_ptn = "def_bom_ptn";
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
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public static final String $rqst_loc_cd = "rqst_loc_cd";
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public static final String $rqst_loc_nm = "rqst_loc_nm";
	/**
	 * Requested location WG cd. 依頼先場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_loc_wg_cd = "rqst_loc_wg_cd";
	/**
	 * Requested location WG name 依頼先場所ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_loc_wg_nm = "rqst_loc_wg_nm";
	/**
	 * Subcontractor master cd. (Location master) 外注先ＣＤ（場所マスタ）.<p>
	 *
	 */
	public static final String $loc_sppl_cd = "loc_sppl_cd";
	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public static final String $rsrc_cd1 = "rsrc_cd1";
	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public static final String $rsrc_nm1 = "rsrc_nm1";
	/**
	 * Resource unit name 1 資源単位名１.<p>
	 *
	 */
	public static final String $rsrc_unit_nm1 = "rsrc_unit_nm1";
	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public static final String $rsrc_cd2 = "rsrc_cd2";
	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public static final String $rsrc_nm2 = "rsrc_nm2";
	/**
	 * Resource unit name 2 資源単位名２.<p>
	 *
	 */
	public static final String $rsrc_unit_nm2 = "rsrc_unit_nm2";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
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
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public static final String $mfg_lt = "mfg_lt";
	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public static final String $mfg_lt_add_qty = "mfg_lt_add_qty";
	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public static final String $purc_lt = "purc_lt";
	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public static final String $purc_lt_add_qty = "purc_lt_add_qty";
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public static final String $purc_basis_typ = "purc_basis_typ";
	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public static final String $purc_basis_typ_nm = "purc_basis_typ_nm";
	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public static final String $accpt_insp_lt = "accpt_insp_lt";
	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public static final String $buf_lt = "buf_lt";
	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public static final String $ord_fix_pd = "ord_fix_pd";
	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public static final String $sz_day_week_typ = "sz_day_week_typ";
	/**
	 * Aggregation (by day of week) type name 曜日まとめ区分名.<p>
	 *
	 */
	public static final String $sz_day_week_typ_nm = "sz_day_week_typ_nm";
	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public static final String $sz_week = "sz_week";
	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public static final String $lot_sz_pd = "lot_sz_pd";
	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public static final String $min_lot_qty = "min_lot_qty";
	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public static final String $batch_lot_qty = "batch_lot_qty";
	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public static final String $max_lot_qty = "max_lot_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public static final String $max_order = "max_order";
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public static final String $prio = "prio";
	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public static final String $order_ratio = "order_ratio";
	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public static final String $yield_schd_qty = "yield_schd_qty";
	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public static final String $mfg_inst_qty = "mfg_inst_qty";
	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public static final String $fxd_rqmt_qty = "fxd_rqmt_qty";
	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public static final String $lot_issue_typ = "lot_issue_typ";
	/**
	 * Lot numbering timing type name ロット発番タイミング区分名.<p>
	 *
	 */
	public static final String $lot_issue_typ_nm = "lot_issue_typ_nm";
	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public static final String $bkf_flg = "bkf_flg";
	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public static final String $ln_stk_flg = "ln_stk_flg";
	/**
	 * For long LT 先行手配対象.<p>
	 *
	 */
	public static final String $pre_po_tgt_flg = "pre_po_tgt_flg";
	/**
	 * Issue record sheet at mfg. order 製造指図時記録書発行.<p>
	 *
	 */
	public static final String $inst_rec_issue_flg = "inst_rec_issue_flg";
	/**
	 * Not for mfg. approval 製造承認対象外.<p>
	 *
	 */
	public static final String $no_mfg_aprv_flg = "no_mfg_aprv_flg";
	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public static final String $itm_lower_yield = "itm_lower_yield";
	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public static final String $itm_std_yield = "itm_std_yield";
	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public static final String $itm_upper_yield = "itm_upper_yield";
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public static final String $purc_id_typ_nm = "purc_id_typ_nm";
	/**
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_wg_nm = "rqst_wg_nm";
	/**
	 * PO batch 発注バッチ.<p>
	 *
	 */
	public static final String $po_batch_flg = "po_batch_flg";
	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public static final String $rsrc_std_qty1 = "rsrc_std_qty1";
	/**
	 * Resource unit qty. 1 資源単位数量１.<p>
	 *
	 */
	public static final String $rsrc_unit_qty1 = "rsrc_unit_qty1";
	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public static final String $rsrc_std_qty2 = "rsrc_std_qty2";
	/**
	 * Resource unit qty. 2 資源単位数量２.<p>
	 *
	 */
	public static final String $rsrc_unit_qty2 = "rsrc_unit_qty2";
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
	 * Not for MRP ＭＲＰ対象外.<p>
	 *
	 */
	public static final String $not_mrp_flg = "not_mrp_flg";
	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public static final String $cost_ratio = "cost_ratio";
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


	public static final MCMeta st_dt_key_META = createCommonMeta($st_dt_key, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta def_bom_ptn_META = createCommonMeta($def_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_loc_nm_META = createCommonMeta($rqst_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_loc_wg_cd_META = createCommonMeta($rqst_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_loc_wg_nm_META = createCommonMeta($rqst_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta loc_sppl_cd_META = createCommonMeta($loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rsrc_cd1_META = createCommonMeta($rsrc_cd1, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_nm1_META = createCommonMeta($rsrc_nm1, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_unit_nm1_META = createCommonMeta($rsrc_unit_nm1, mcframe.commonMA.meta.MA_META.RSRC_UNIT_NM);
	public static final MCMeta rsrc_cd2_META = createCommonMeta($rsrc_cd2, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_nm2_META = createCommonMeta($rsrc_nm2, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_unit_nm2_META = createCommonMeta($rsrc_unit_nm2, mcframe.commonMA.meta.MA_META.RSRC_UNIT_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta mfg_lt_META = createCommonMeta($mfg_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta mfg_lt_add_qty_META = createCommonMeta($mfg_lt_add_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_lt_META = createCommonMeta($purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta purc_lt_add_qty_META = createCommonMeta($purc_lt_add_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta purc_basis_typ_nm_META = createCommonMeta($purc_basis_typ_nm, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP_NM);
	public static final MCMeta accpt_insp_lt_META = createCommonMeta($accpt_insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta buf_lt_META = createCommonMeta($buf_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta ord_fix_pd_META = createCommonMeta($ord_fix_pd, mcframe.commonMA.meta.MA_META.ORD_FIX_PD);
	public static final MCMeta sz_day_week_typ_META = createCommonMeta($sz_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta sz_day_week_typ_nm_META = createCommonMeta($sz_day_week_typ_nm, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP_NM);
	public static final MCMeta sz_week_META = createCommonMeta($sz_week, mcframe.commonMA.meta.MA_META.SZ_WEEK);
	public static final MCMeta lot_sz_pd_META = createCommonMeta($lot_sz_pd, mcframe.commonMA.meta.MA_META.LOT_SZ_PD);
	public static final MCMeta min_lot_qty_META = createCommonMeta($min_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta batch_lot_qty_META = createCommonMeta($batch_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta max_lot_qty_META = createCommonMeta($max_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta max_order_META = createCommonMeta($max_order, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta order_ratio_META = createCommonMeta($order_ratio, mcframe.commonMA.meta.MA_META.ORDER_RATIO);
	public static final MCMeta yield_schd_qty_META = createCommonMeta($yield_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_inst_qty_META = createCommonMeta($mfg_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_rqmt_qty_META = createCommonMeta($fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lot_issue_typ_META = createCommonMeta($lot_issue_typ, mcframe.commonMA.meta.MA_META.LOT_ISSUE_TYP);
	public static final MCMeta lot_issue_typ_nm_META = createCommonMeta($lot_issue_typ_nm, mcframe.commonMA.meta.MA_META.LOT_ISSUE_TYP_NM);
	public static final MCMeta bkf_flg_META = createCommonMeta($bkf_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ln_stk_flg_META = createCommonMeta($ln_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_po_tgt_flg_META = createCommonMeta($pre_po_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_rec_issue_flg_META = createCommonMeta($inst_rec_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_mfg_aprv_flg_META = createCommonMeta($no_mfg_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_lower_yield_META = createCommonMeta($itm_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_std_yield_META = createCommonMeta($itm_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_upper_yield_META = createCommonMeta($itm_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta purc_id_typ_nm_META = createCommonMeta($purc_id_typ_nm, mcframe.commonMA.meta.MA_META.PURC_ID_TYP_NM);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta po_batch_flg_META = createCommonMeta($po_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rsrc_std_qty1_META = createCommonMeta($rsrc_std_qty1, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rsrc_unit_qty1_META = createCommonMeta($rsrc_unit_qty1, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rsrc_std_qty2_META = createCommonMeta($rsrc_std_qty2, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rsrc_unit_qty2_META = createCommonMeta($rsrc_unit_qty2, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta not_mrp_flg_META = createCommonMeta($not_mrp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cost_ratio_META = createCommonMeta($cost_ratio, mcframe.commonMA.meta.MA_META.COST_RATIO);
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

	protected static final ConstMetaList<Sprt01_DtlR> constMetas = new ConstMetaList<Sprt01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			st_dt_key_META,
			del_flg_META,
			wg_cd_META,
			wg_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			stk_mng_typ_META,
			asset_mng_typ_META,
			unit_cd_META,
			dec_place_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			lot_mng_typ_META,
			def_bom_ptn_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			site_cd_META,
			site_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			rqst_loc_cd_META,
			rqst_loc_nm_META,
			rqst_loc_wg_cd_META,
			rqst_loc_wg_nm_META,
			loc_sppl_cd_META,
			rsrc_cd1_META,
			rsrc_nm1_META,
			rsrc_unit_nm1_META,
			rsrc_cd2_META,
			rsrc_nm2_META,
			rsrc_unit_nm2_META,
			bom_ptn_META,
			st_dt_META,
			end_dt_META,
			oper_ptn_META,
			mfg_lt_META,
			mfg_lt_add_qty_META,
			purc_lt_META,
			purc_lt_add_qty_META,
			purc_basis_typ_META,
			purc_basis_typ_nm_META,
			accpt_insp_lt_META,
			buf_lt_META,
			ord_fix_pd_META,
			sz_day_week_typ_META,
			sz_day_week_typ_nm_META,
			sz_week_META,
			lot_sz_pd_META,
			min_lot_qty_META,
			batch_lot_qty_META,
			max_lot_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			max_order_META,
			prio_META,
			order_ratio_META,
			yield_schd_qty_META,
			mfg_inst_qty_META,
			fxd_rqmt_qty_META,
			lot_issue_typ_META,
			lot_issue_typ_nm_META,
			bkf_flg_META,
			ln_stk_flg_META,
			pre_po_tgt_flg_META,
			inst_rec_issue_flg_META,
			no_mfg_aprv_flg_META,
			itm_lower_yield_META,
			itm_std_yield_META,
			itm_upper_yield_META,
			purc_id_typ_META,
			purc_id_typ_nm_META,
			rqst_wg_cd_META,
			rqst_wg_nm_META,
			po_batch_flg_META,
			rsrc_std_qty1_META,
			rsrc_unit_qty1_META,
			rsrc_std_qty2_META,
			rsrc_unit_qty2_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			not_mrp_flg_META,
			cost_ratio_META,
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
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$purc_basis_typ, "MAC_PURC_BASIS_TYP"},	// purc_basis_typ
				{$sz_day_week_typ, "MAC_DAY_WEEK_TYP"},	// sz_day_week_typ
				{$lot_issue_typ, "MAC_LOT_ISSUE_TYP"},	// lot_issue_typ
				{$purc_id_typ, "MAC_PURC_ID_TYP"}	// purc_id_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$wg_cd, "E"},	// wg_cd
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$mfg_loc_cd, "E"},	// mfg_loc_cd
				{$sppl_cd, "E"},	// sppl_cd
				{$maker_cd, "E"},	// maker_cd
				{$rqst_loc_cd, "E"},	// rqst_loc_cd
				{$bom_ptn, "E"}	// bom_ptn
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
	protected Sprt01_DtlR_MC_A(ConstMetaList<? extends Sprt01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR clone() {
		return (Sprt01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR createInstance() {
		return (Sprt01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR getValues(String... names) {
		return (Sprt01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public MCDate st_dt_key() {
		return getConstDate(offset + 0, $st_dt_key);
	}

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public void st_dt_key(MCDate value) {
		setConstDate(offset + 0, $st_dt_key, value);
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 3, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 3, $wg_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 4, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 4, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 5, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 5, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 6, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 6, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 7, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 7, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 8, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 8, $itm_nm, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 9, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 9, $stk_mng_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 10, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 10, $asset_mng_typ, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 11, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 11, $unit_cd, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 12, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 12, $dec_place, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 13, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 13, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 14, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 14, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 15, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 15, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 16, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 16, $sno4_mng_typ, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 17, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 17, $lot_mng_typ, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String def_bom_ptn() {
		return getConstString(offset + 18, $def_bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void def_bom_ptn(String value) {
		setConstString(offset + 18, $def_bom_ptn, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 19, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 19, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 20, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 20, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 21, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 21, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 22, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 22, $itm_typ_d_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 23, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 23, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 24, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 24, $site_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 25, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 25, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 26, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 26, $mfg_loc_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 27, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 27, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 28, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 28, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 29, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 29, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 30, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 30, $maker_nm, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 31, $rqst_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 31, $rqst_loc_cd, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 32, $rqst_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 32, $rqst_loc_nm, value);
	}


	/**
	 * Requested location WG cd. 依頼先場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_loc_wg_cd() {
		return getConstString(offset + 33, $rqst_loc_wg_cd);
	}

	/**
	 * Requested location WG cd. 依頼先場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_loc_wg_cd(String value) {
		setConstString(offset + 33, $rqst_loc_wg_cd, value);
	}


	/**
	 * Requested location WG name 依頼先場所ワーキンググループ名.<p>
	 *
	 */
	public String rqst_loc_wg_nm() {
		return getConstString(offset + 34, $rqst_loc_wg_nm);
	}

	/**
	 * Requested location WG name 依頼先場所ワーキンググループ名.<p>
	 *
	 */
	public void rqst_loc_wg_nm(String value) {
		setConstString(offset + 34, $rqst_loc_wg_nm, value);
	}


	/**
	 * Subcontractor master cd. (Location master) 外注先ＣＤ（場所マスタ）.<p>
	 *
	 */
	public String loc_sppl_cd() {
		return getConstString(offset + 35, $loc_sppl_cd);
	}

	/**
	 * Subcontractor master cd. (Location master) 外注先ＣＤ（場所マスタ）.<p>
	 *
	 */
	public void loc_sppl_cd(String value) {
		setConstString(offset + 35, $loc_sppl_cd, value);
	}


	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public String rsrc_cd1() {
		return getConstString(offset + 36, $rsrc_cd1);
	}

	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public void rsrc_cd1(String value) {
		setConstString(offset + 36, $rsrc_cd1, value);
	}


	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public String rsrc_nm1() {
		return getConstString(offset + 37, $rsrc_nm1);
	}

	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public void rsrc_nm1(String value) {
		setConstString(offset + 37, $rsrc_nm1, value);
	}


	/**
	 * Resource unit name 1 資源単位名１.<p>
	 *
	 */
	public String rsrc_unit_nm1() {
		return getConstString(offset + 38, $rsrc_unit_nm1);
	}

	/**
	 * Resource unit name 1 資源単位名１.<p>
	 *
	 */
	public void rsrc_unit_nm1(String value) {
		setConstString(offset + 38, $rsrc_unit_nm1, value);
	}


	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public String rsrc_cd2() {
		return getConstString(offset + 39, $rsrc_cd2);
	}

	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public void rsrc_cd2(String value) {
		setConstString(offset + 39, $rsrc_cd2, value);
	}


	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public String rsrc_nm2() {
		return getConstString(offset + 40, $rsrc_nm2);
	}

	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public void rsrc_nm2(String value) {
		setConstString(offset + 40, $rsrc_nm2, value);
	}


	/**
	 * Resource unit name 2 資源単位名２.<p>
	 *
	 */
	public String rsrc_unit_nm2() {
		return getConstString(offset + 41, $rsrc_unit_nm2);
	}

	/**
	 * Resource unit name 2 資源単位名２.<p>
	 *
	 */
	public void rsrc_unit_nm2(String value) {
		setConstString(offset + 41, $rsrc_unit_nm2, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 42, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 42, $bom_ptn, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 43, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 43, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 44, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 44, $end_dt, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 45, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 45, $oper_ptn, value);
	}


	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return getConstNumber(offset + 46, $mfg_lt);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		setConstNumber(offset + 46, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(int value) {
		setConstNumber(offset + 46, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(long value) {
		setConstNumber(offset + 46, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(float value) {
		setConstNumber(offset + 46, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(double value) {
		setConstNumber(offset + 46, $mfg_lt, value);
	}


	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public MCNumber mfg_lt_add_qty() {
		return getConstNumber(offset + 47, $mfg_lt_add_qty);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(MCNumber value) {
		setConstNumber(offset + 47, $mfg_lt_add_qty, value);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(int value) {
		setConstNumber(offset + 47, $mfg_lt_add_qty, value);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(long value) {
		setConstNumber(offset + 47, $mfg_lt_add_qty, value);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(float value) {
		setConstNumber(offset + 47, $mfg_lt_add_qty, value);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(double value) {
		setConstNumber(offset + 47, $mfg_lt_add_qty, value);
	}


	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return getConstNumber(offset + 48, $purc_lt);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		setConstNumber(offset + 48, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		setConstNumber(offset + 48, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		setConstNumber(offset + 48, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		setConstNumber(offset + 48, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		setConstNumber(offset + 48, $purc_lt, value);
	}


	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public MCNumber purc_lt_add_qty() {
		return getConstNumber(offset + 49, $purc_lt_add_qty);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(MCNumber value) {
		setConstNumber(offset + 49, $purc_lt_add_qty, value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(int value) {
		setConstNumber(offset + 49, $purc_lt_add_qty, value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(long value) {
		setConstNumber(offset + 49, $purc_lt_add_qty, value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(float value) {
		setConstNumber(offset + 49, $purc_lt_add_qty, value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(double value) {
		setConstNumber(offset + 49, $purc_lt_add_qty, value);
	}


	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 50, $purc_basis_typ);
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 50, $purc_basis_typ, value);
	}


	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public String purc_basis_typ_nm() {
		return getConstString(offset + 51, $purc_basis_typ_nm);
	}

	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public void purc_basis_typ_nm(String value) {
		setConstString(offset + 51, $purc_basis_typ_nm, value);
	}


	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return getConstNumber(offset + 52, $accpt_insp_lt);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		setConstNumber(offset + 52, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		setConstNumber(offset + 52, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		setConstNumber(offset + 52, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		setConstNumber(offset + 52, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		setConstNumber(offset + 52, $accpt_insp_lt, value);
	}


	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public MCNumber buf_lt() {
		return getConstNumber(offset + 53, $buf_lt);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(MCNumber value) {
		setConstNumber(offset + 53, $buf_lt, value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(int value) {
		setConstNumber(offset + 53, $buf_lt, value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(long value) {
		setConstNumber(offset + 53, $buf_lt, value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(float value) {
		setConstNumber(offset + 53, $buf_lt, value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(double value) {
		setConstNumber(offset + 53, $buf_lt, value);
	}


	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public MCNumber ord_fix_pd() {
		return getConstNumber(offset + 54, $ord_fix_pd);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(MCNumber value) {
		setConstNumber(offset + 54, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(int value) {
		setConstNumber(offset + 54, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(long value) {
		setConstNumber(offset + 54, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(float value) {
		setConstNumber(offset + 54, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(double value) {
		setConstNumber(offset + 54, $ord_fix_pd, value);
	}


	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public String sz_day_week_typ() {
		return getConstString(offset + 55, $sz_day_week_typ);
	}

	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public void sz_day_week_typ(String value) {
		setConstString(offset + 55, $sz_day_week_typ, value);
	}


	/**
	 * Aggregation (by day of week) type name 曜日まとめ区分名.<p>
	 *
	 */
	public String sz_day_week_typ_nm() {
		return getConstString(offset + 56, $sz_day_week_typ_nm);
	}

	/**
	 * Aggregation (by day of week) type name 曜日まとめ区分名.<p>
	 *
	 */
	public void sz_day_week_typ_nm(String value) {
		setConstString(offset + 56, $sz_day_week_typ_nm, value);
	}


	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public MCNumber sz_week() {
		return getConstNumber(offset + 57, $sz_week);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(MCNumber value) {
		setConstNumber(offset + 57, $sz_week, value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(int value) {
		setConstNumber(offset + 57, $sz_week, value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(long value) {
		setConstNumber(offset + 57, $sz_week, value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(float value) {
		setConstNumber(offset + 57, $sz_week, value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(double value) {
		setConstNumber(offset + 57, $sz_week, value);
	}


	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public MCNumber lot_sz_pd() {
		return getConstNumber(offset + 58, $lot_sz_pd);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(MCNumber value) {
		setConstNumber(offset + 58, $lot_sz_pd, value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(int value) {
		setConstNumber(offset + 58, $lot_sz_pd, value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(long value) {
		setConstNumber(offset + 58, $lot_sz_pd, value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(float value) {
		setConstNumber(offset + 58, $lot_sz_pd, value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(double value) {
		setConstNumber(offset + 58, $lot_sz_pd, value);
	}


	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public MCNumber min_lot_qty() {
		return getConstNumber(offset + 59, $min_lot_qty);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(MCNumber value) {
		setConstNumber(offset + 59, $min_lot_qty, value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(int value) {
		setConstNumber(offset + 59, $min_lot_qty, value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(long value) {
		setConstNumber(offset + 59, $min_lot_qty, value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(float value) {
		setConstNumber(offset + 59, $min_lot_qty, value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(double value) {
		setConstNumber(offset + 59, $min_lot_qty, value);
	}


	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public MCNumber batch_lot_qty() {
		return getConstNumber(offset + 60, $batch_lot_qty);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(MCNumber value) {
		setConstNumber(offset + 60, $batch_lot_qty, value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(int value) {
		setConstNumber(offset + 60, $batch_lot_qty, value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(long value) {
		setConstNumber(offset + 60, $batch_lot_qty, value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(float value) {
		setConstNumber(offset + 60, $batch_lot_qty, value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(double value) {
		setConstNumber(offset + 60, $batch_lot_qty, value);
	}


	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public MCNumber max_lot_qty() {
		return getConstNumber(offset + 61, $max_lot_qty);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(MCNumber value) {
		setConstNumber(offset + 61, $max_lot_qty, value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(int value) {
		setConstNumber(offset + 61, $max_lot_qty, value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(long value) {
		setConstNumber(offset + 61, $max_lot_qty, value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(float value) {
		setConstNumber(offset + 61, $max_lot_qty, value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(double value) {
		setConstNumber(offset + 61, $max_lot_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 62, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 62, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 63, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 63, $base_unit_nm, value);
	}


	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public MCNumber max_order() {
		return getConstNumber(offset + 64, $max_order);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(MCNumber value) {
		setConstNumber(offset + 64, $max_order, value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(int value) {
		setConstNumber(offset + 64, $max_order, value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(long value) {
		setConstNumber(offset + 64, $max_order, value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(float value) {
		setConstNumber(offset + 64, $max_order, value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(double value) {
		setConstNumber(offset + 64, $max_order, value);
	}


	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 65, $prio);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 65, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 65, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 65, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 65, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 65, $prio, value);
	}


	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public MCNumber order_ratio() {
		return getConstNumber(offset + 66, $order_ratio);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(MCNumber value) {
		setConstNumber(offset + 66, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(int value) {
		setConstNumber(offset + 66, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(long value) {
		setConstNumber(offset + 66, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(float value) {
		setConstNumber(offset + 66, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(double value) {
		setConstNumber(offset + 66, $order_ratio, value);
	}


	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return getConstNumber(offset + 67, $yield_schd_qty);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		setConstNumber(offset + 67, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		setConstNumber(offset + 67, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		setConstNumber(offset + 67, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		setConstNumber(offset + 67, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		setConstNumber(offset + 67, $yield_schd_qty, value);
	}


	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public MCNumber mfg_inst_qty() {
		return getConstNumber(offset + 68, $mfg_inst_qty);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(MCNumber value) {
		setConstNumber(offset + 68, $mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(int value) {
		setConstNumber(offset + 68, $mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(long value) {
		setConstNumber(offset + 68, $mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(float value) {
		setConstNumber(offset + 68, $mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(double value) {
		setConstNumber(offset + 68, $mfg_inst_qty, value);
	}


	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_rqmt_qty() {
		return getConstNumber(offset + 69, $fxd_rqmt_qty);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 69, $fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(int value) {
		setConstNumber(offset + 69, $fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(long value) {
		setConstNumber(offset + 69, $fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(float value) {
		setConstNumber(offset + 69, $fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(double value) {
		setConstNumber(offset + 69, $fxd_rqmt_qty, value);
	}


	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public String lot_issue_typ() {
		return getConstString(offset + 70, $lot_issue_typ);
	}

	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public void lot_issue_typ(String value) {
		setConstString(offset + 70, $lot_issue_typ, value);
	}


	/**
	 * Lot numbering timing type name ロット発番タイミング区分名.<p>
	 *
	 */
	public String lot_issue_typ_nm() {
		return getConstString(offset + 71, $lot_issue_typ_nm);
	}

	/**
	 * Lot numbering timing type name ロット発番タイミング区分名.<p>
	 *
	 */
	public void lot_issue_typ_nm(String value) {
		setConstString(offset + 71, $lot_issue_typ_nm, value);
	}


	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public boolean bkf_flg() {
		return getConstBoolean(offset + 72, $bkf_flg);
	}

	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public void bkf_flg(boolean value) {
		setConstBoolean(offset + 72, $bkf_flg, value);
	}


	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public boolean ln_stk_flg() {
		return getConstBoolean(offset + 73, $ln_stk_flg);
	}

	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public void ln_stk_flg(boolean value) {
		setConstBoolean(offset + 73, $ln_stk_flg, value);
	}


	/**
	 * For long LT 先行手配対象.<p>
	 *
	 */
	public boolean pre_po_tgt_flg() {
		return getConstBoolean(offset + 74, $pre_po_tgt_flg);
	}

	/**
	 * For long LT 先行手配対象.<p>
	 *
	 */
	public void pre_po_tgt_flg(boolean value) {
		setConstBoolean(offset + 74, $pre_po_tgt_flg, value);
	}


	/**
	 * Issue record sheet at mfg. order 製造指図時記録書発行.<p>
	 *
	 */
	public boolean inst_rec_issue_flg() {
		return getConstBoolean(offset + 75, $inst_rec_issue_flg);
	}

	/**
	 * Issue record sheet at mfg. order 製造指図時記録書発行.<p>
	 *
	 */
	public void inst_rec_issue_flg(boolean value) {
		setConstBoolean(offset + 75, $inst_rec_issue_flg, value);
	}


	/**
	 * Not for mfg. approval 製造承認対象外.<p>
	 *
	 */
	public boolean no_mfg_aprv_flg() {
		return getConstBoolean(offset + 76, $no_mfg_aprv_flg);
	}

	/**
	 * Not for mfg. approval 製造承認対象外.<p>
	 *
	 */
	public void no_mfg_aprv_flg(boolean value) {
		setConstBoolean(offset + 76, $no_mfg_aprv_flg, value);
	}


	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public MCNumber itm_lower_yield() {
		return getConstNumber(offset + 77, $itm_lower_yield);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(MCNumber value) {
		setConstNumber(offset + 77, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(int value) {
		setConstNumber(offset + 77, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(long value) {
		setConstNumber(offset + 77, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(float value) {
		setConstNumber(offset + 77, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(double value) {
		setConstNumber(offset + 77, $itm_lower_yield, value);
	}


	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public MCNumber itm_std_yield() {
		return getConstNumber(offset + 78, $itm_std_yield);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(MCNumber value) {
		setConstNumber(offset + 78, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(int value) {
		setConstNumber(offset + 78, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(long value) {
		setConstNumber(offset + 78, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(float value) {
		setConstNumber(offset + 78, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(double value) {
		setConstNumber(offset + 78, $itm_std_yield, value);
	}


	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public MCNumber itm_upper_yield() {
		return getConstNumber(offset + 79, $itm_upper_yield);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(MCNumber value) {
		setConstNumber(offset + 79, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(int value) {
		setConstNumber(offset + 79, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(long value) {
		setConstNumber(offset + 79, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(float value) {
		setConstNumber(offset + 79, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(double value) {
		setConstNumber(offset + 79, $itm_upper_yield, value);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 80, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 80, $purc_id_typ, value);
	}


	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public String purc_id_typ_nm() {
		return getConstString(offset + 81, $purc_id_typ_nm);
	}

	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public void purc_id_typ_nm(String value) {
		setConstString(offset + 81, $purc_id_typ_nm, value);
	}


	/**
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 82, $rqst_wg_cd);
	}

	/**
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 82, $rqst_wg_cd, value);
	}


	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 83, $rqst_wg_nm);
	}

	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 83, $rqst_wg_nm, value);
	}


	/**
	 * PO batch 発注バッチ.<p>
	 *
	 */
	public boolean po_batch_flg() {
		return getConstBoolean(offset + 84, $po_batch_flg);
	}

	/**
	 * PO batch 発注バッチ.<p>
	 *
	 */
	public void po_batch_flg(boolean value) {
		setConstBoolean(offset + 84, $po_batch_flg, value);
	}


	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public MCNumber rsrc_std_qty1() {
		return getConstNumber(offset + 85, $rsrc_std_qty1);
	}

	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public void rsrc_std_qty1(MCNumber value) {
		setConstNumber(offset + 85, $rsrc_std_qty1, value);
	}

	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public void rsrc_std_qty1(int value) {
		setConstNumber(offset + 85, $rsrc_std_qty1, value);
	}

	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public void rsrc_std_qty1(long value) {
		setConstNumber(offset + 85, $rsrc_std_qty1, value);
	}

	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public void rsrc_std_qty1(float value) {
		setConstNumber(offset + 85, $rsrc_std_qty1, value);
	}

	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public void rsrc_std_qty1(double value) {
		setConstNumber(offset + 85, $rsrc_std_qty1, value);
	}


	/**
	 * Resource unit qty. 1 資源単位数量１.<p>
	 *
	 */
	public MCNumber rsrc_unit_qty1() {
		return getConstNumber(offset + 86, $rsrc_unit_qty1);
	}

	/**
	 * Resource unit qty. 1 資源単位数量１.<p>
	 *
	 */
	public void rsrc_unit_qty1(MCNumber value) {
		setConstNumber(offset + 86, $rsrc_unit_qty1, value);
	}

	/**
	 * Resource unit qty. 1 資源単位数量１.<p>
	 *
	 */
	public void rsrc_unit_qty1(int value) {
		setConstNumber(offset + 86, $rsrc_unit_qty1, value);
	}

	/**
	 * Resource unit qty. 1 資源単位数量１.<p>
	 *
	 */
	public void rsrc_unit_qty1(long value) {
		setConstNumber(offset + 86, $rsrc_unit_qty1, value);
	}

	/**
	 * Resource unit qty. 1 資源単位数量１.<p>
	 *
	 */
	public void rsrc_unit_qty1(float value) {
		setConstNumber(offset + 86, $rsrc_unit_qty1, value);
	}

	/**
	 * Resource unit qty. 1 資源単位数量１.<p>
	 *
	 */
	public void rsrc_unit_qty1(double value) {
		setConstNumber(offset + 86, $rsrc_unit_qty1, value);
	}


	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public MCNumber rsrc_std_qty2() {
		return getConstNumber(offset + 87, $rsrc_std_qty2);
	}

	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public void rsrc_std_qty2(MCNumber value) {
		setConstNumber(offset + 87, $rsrc_std_qty2, value);
	}

	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public void rsrc_std_qty2(int value) {
		setConstNumber(offset + 87, $rsrc_std_qty2, value);
	}

	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public void rsrc_std_qty2(long value) {
		setConstNumber(offset + 87, $rsrc_std_qty2, value);
	}

	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public void rsrc_std_qty2(float value) {
		setConstNumber(offset + 87, $rsrc_std_qty2, value);
	}

	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public void rsrc_std_qty2(double value) {
		setConstNumber(offset + 87, $rsrc_std_qty2, value);
	}


	/**
	 * Resource unit qty. 2 資源単位数量２.<p>
	 *
	 */
	public MCNumber rsrc_unit_qty2() {
		return getConstNumber(offset + 88, $rsrc_unit_qty2);
	}

	/**
	 * Resource unit qty. 2 資源単位数量２.<p>
	 *
	 */
	public void rsrc_unit_qty2(MCNumber value) {
		setConstNumber(offset + 88, $rsrc_unit_qty2, value);
	}

	/**
	 * Resource unit qty. 2 資源単位数量２.<p>
	 *
	 */
	public void rsrc_unit_qty2(int value) {
		setConstNumber(offset + 88, $rsrc_unit_qty2, value);
	}

	/**
	 * Resource unit qty. 2 資源単位数量２.<p>
	 *
	 */
	public void rsrc_unit_qty2(long value) {
		setConstNumber(offset + 88, $rsrc_unit_qty2, value);
	}

	/**
	 * Resource unit qty. 2 資源単位数量２.<p>
	 *
	 */
	public void rsrc_unit_qty2(float value) {
		setConstNumber(offset + 88, $rsrc_unit_qty2, value);
	}

	/**
	 * Resource unit qty. 2 資源単位数量２.<p>
	 *
	 */
	public void rsrc_unit_qty2(double value) {
		setConstNumber(offset + 88, $rsrc_unit_qty2, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 89, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 89, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 90, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 90, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 91, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 91, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 92, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 92, $sno4, value);
	}


	/**
	 * Not for MRP ＭＲＰ対象外.<p>
	 *
	 */
	public boolean not_mrp_flg() {
		return getConstBoolean(offset + 93, $not_mrp_flg);
	}

	/**
	 * Not for MRP ＭＲＰ対象外.<p>
	 *
	 */
	public void not_mrp_flg(boolean value) {
		setConstBoolean(offset + 93, $not_mrp_flg, value);
	}


	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public MCNumber cost_ratio() {
		return getConstNumber(offset + 94, $cost_ratio);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(MCNumber value) {
		setConstNumber(offset + 94, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(int value) {
		setConstNumber(offset + 94, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(long value) {
		setConstNumber(offset + 94, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(float value) {
		setConstNumber(offset + 94, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(double value) {
		setConstNumber(offset + 94, $cost_ratio, value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($def_bom_ptn.equalsIgnoreCase(name)) {
			return def_bom_ptn();
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_loc_wg_cd.equalsIgnoreCase(name)) {
			return rqst_loc_wg_cd();
		}
		if ($rqst_loc_wg_nm.equalsIgnoreCase(name)) {
			return rqst_loc_wg_nm();
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			return loc_sppl_cd();
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			return rsrc_cd1();
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			return rsrc_nm1();
		}
		if ($rsrc_unit_nm1.equalsIgnoreCase(name)) {
			return rsrc_unit_nm1();
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			return rsrc_cd2();
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			return rsrc_nm2();
		}
		if ($rsrc_unit_nm2.equalsIgnoreCase(name)) {
			return rsrc_unit_nm2();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			return sz_day_week_typ();
		}
		if ($sz_day_week_typ_nm.equalsIgnoreCase(name)) {
			return sz_day_week_typ_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			return lot_issue_typ();
		}
		if ($lot_issue_typ_nm.equalsIgnoreCase(name)) {
			return lot_issue_typ_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
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
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			return mfg_lt_add_qty();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			return purc_lt_add_qty();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			return buf_lt();
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			return ord_fix_pd();
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			return sz_week();
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			return lot_sz_pd();
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			return min_lot_qty();
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			return batch_lot_qty();
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			return max_lot_qty();
		}
		if ($max_order.equalsIgnoreCase(name)) {
			return max_order();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			return order_ratio();
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			return yield_schd_qty();
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			return mfg_inst_qty();
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_rqmt_qty();
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			return itm_lower_yield();
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			return itm_std_yield();
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			return itm_upper_yield();
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			return rsrc_std_qty1();
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			return rsrc_unit_qty1();
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			return rsrc_std_qty2();
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			return rsrc_unit_qty2();
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			return cost_ratio();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
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
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			return ln_stk_flg();
		}
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			return pre_po_tgt_flg();
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			return inst_rec_issue_flg();
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return no_mfg_aprv_flg();
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			return po_batch_flg();
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			return not_mrp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($def_bom_ptn.equalsIgnoreCase(name)) {
			return def_bom_ptn();
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_loc_wg_cd.equalsIgnoreCase(name)) {
			return rqst_loc_wg_cd();
		}
		if ($rqst_loc_wg_nm.equalsIgnoreCase(name)) {
			return rqst_loc_wg_nm();
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			return loc_sppl_cd();
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			return rsrc_cd1();
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			return rsrc_nm1();
		}
		if ($rsrc_unit_nm1.equalsIgnoreCase(name)) {
			return rsrc_unit_nm1();
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			return rsrc_cd2();
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			return rsrc_nm2();
		}
		if ($rsrc_unit_nm2.equalsIgnoreCase(name)) {
			return rsrc_unit_nm2();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			return sz_day_week_typ();
		}
		if ($sz_day_week_typ_nm.equalsIgnoreCase(name)) {
			return sz_day_week_typ_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			return lot_issue_typ();
		}
		if ($lot_issue_typ_nm.equalsIgnoreCase(name)) {
			return lot_issue_typ_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
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
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			return mfg_lt_add_qty();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			return purc_lt_add_qty();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			return buf_lt();
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			return ord_fix_pd();
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			return sz_week();
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			return lot_sz_pd();
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			return min_lot_qty();
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			return batch_lot_qty();
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			return max_lot_qty();
		}
		if ($max_order.equalsIgnoreCase(name)) {
			return max_order();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			return order_ratio();
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			return yield_schd_qty();
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			return mfg_inst_qty();
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_rqmt_qty();
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			return itm_lower_yield();
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			return itm_std_yield();
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			return itm_upper_yield();
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			return rsrc_std_qty1();
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			return rsrc_unit_qty1();
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			return rsrc_std_qty2();
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			return rsrc_unit_qty2();
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			return cost_ratio();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
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
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			return ln_stk_flg();
		}
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			return pre_po_tgt_flg();
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			return inst_rec_issue_flg();
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return no_mfg_aprv_flg();
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			return po_batch_flg();
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			return not_mrp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($def_bom_ptn.equalsIgnoreCase(name)) {
			def_bom_ptn(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_loc_wg_cd.equalsIgnoreCase(name)) {
			rqst_loc_wg_cd(value);
			return;
		}
		if ($rqst_loc_wg_nm.equalsIgnoreCase(name)) {
			rqst_loc_wg_nm(value);
			return;
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			loc_sppl_cd(value);
			return;
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			rsrc_cd1(value);
			return;
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			rsrc_nm1(value);
			return;
		}
		if ($rsrc_unit_nm1.equalsIgnoreCase(name)) {
			rsrc_unit_nm1(value);
			return;
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			rsrc_cd2(value);
			return;
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			rsrc_nm2(value);
			return;
		}
		if ($rsrc_unit_nm2.equalsIgnoreCase(name)) {
			rsrc_unit_nm2(value);
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
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
			return;
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			sz_day_week_typ(value);
			return;
		}
		if ($sz_day_week_typ_nm.equalsIgnoreCase(name)) {
			sz_day_week_typ_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			lot_issue_typ(value);
			return;
		}
		if ($lot_issue_typ_nm.equalsIgnoreCase(name)) {
			lot_issue_typ_nm(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
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
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			ln_stk_flg(value);
			return;
		}
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			pre_po_tgt_flg(value);
			return;
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			inst_rec_issue_flg(value);
			return;
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			no_mfg_aprv_flg(value);
			return;
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			po_batch_flg(value);
			return;
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			not_mrp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($def_bom_ptn.equalsIgnoreCase(name)) {
			def_bom_ptn(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_loc_wg_cd.equalsIgnoreCase(name)) {
			rqst_loc_wg_cd(value);
			return;
		}
		if ($rqst_loc_wg_nm.equalsIgnoreCase(name)) {
			rqst_loc_wg_nm(value);
			return;
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			loc_sppl_cd(value);
			return;
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			rsrc_cd1(value);
			return;
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			rsrc_nm1(value);
			return;
		}
		if ($rsrc_unit_nm1.equalsIgnoreCase(name)) {
			rsrc_unit_nm1(value);
			return;
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			rsrc_cd2(value);
			return;
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			rsrc_nm2(value);
			return;
		}
		if ($rsrc_unit_nm2.equalsIgnoreCase(name)) {
			rsrc_unit_nm2(value);
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
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
			return;
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			sz_day_week_typ(value);
			return;
		}
		if ($sz_day_week_typ_nm.equalsIgnoreCase(name)) {
			sz_day_week_typ_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			lot_issue_typ(value);
			return;
		}
		if ($lot_issue_typ_nm.equalsIgnoreCase(name)) {
			lot_issue_typ_nm(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($mfg_lt_add_qty.equalsIgnoreCase(name)) {
			mfg_lt_add_qty(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($purc_lt_add_qty.equalsIgnoreCase(name)) {
			purc_lt_add_qty(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_unit_qty1.equalsIgnoreCase(name)) {
			rsrc_unit_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($rsrc_unit_qty2.equalsIgnoreCase(name)) {
			rsrc_unit_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
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
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			ln_stk_flg(value);
			return;
		}
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			pre_po_tgt_flg(value);
			return;
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			inst_rec_issue_flg(value);
			return;
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			no_mfg_aprv_flg(value);
			return;
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			po_batch_flg(value);
			return;
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			not_mrp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

