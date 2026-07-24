package mcframe.commonMSBE.MSBER0010;

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
 * ブロック"StkListDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class StkListDtlR_MC_A extends MCConstRow {

	/**
	 *  発注者名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 *  部品番号.<p>
	 *
	 */
	public static final String $dlv_slip_itm_cd = "dlv_slip_itm_cd";
	/**
	 *  部品番号識別１(表示用).<p>
	 *
	 */
	public static final String $lot_no_view = "lot_no_view";
	/**
	 *  部品番号識別１(データ用).<p>
	 *
	 */
	public static final String $lot_no_data = "lot_no_data";
	/**
	 *  部品番号識別２(表示用).<p>
	 *
	 */
	public static final String $sublot_no_view = "sublot_no_view";
	/**
	 *  部品番号識別２(データ用).<p>
	 *
	 */
	public static final String $sublot_no_data = "sublot_no_data";
	/**
	 *  収容数.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 *  収容数（文字列）.<p>
	 *
	 */
	public static final String $s_base_unit_qty = "s_base_unit_qty";
	/**
	 *  端数印字.<p>
	 *
	 */
	public static final String $cntnr_flg = "cntnr_flg";
	/**
	 *  部品名称.<p>
	 *
	 */
	public static final String $dlv_slip_itm_nm = "dlv_slip_itm_nm";
	/**
	 *  納入先ＣＤ（データ）.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 *  納入先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 *  納入先別名１.<p>
	 *
	 */
	public static final String $dlv_alt_nm1 = "dlv_alt_nm1";
	/**
	 *  納入先別名２.<p>
	 *
	 */
	public static final String $dlv_alt_nm2 = "dlv_alt_nm2";
	/**
	 *  納入先別名３.<p>
	 *
	 */
	public static final String $dlv_alt_nm3 = "dlv_alt_nm3";
	/**
	 *  納入先別名４.<p>
	 *
	 */
	public static final String $dlv_alt_nm4 = "dlv_alt_nm4";
	/**
	 *  指示数.<p>
	 *
	 */
	public static final String $dlv_inst_qty = "dlv_inst_qty";
	/**
	 *  指示数（文字列）.<p>
	 *
	 */
	public static final String $s_dlv_inst_qty = "s_dlv_inst_qty";
	/**
	 *  受注者名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	/**
	 *  受注者ＣＤ.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 *  QRコード.<p>
	 *
	 */
	public static final String $qr_cd = "qr_cd";
	/**
	 *  得意先注文ＮＯ（データ）.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 *  得意先注文明細ＮＯ（データ）.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	/**
	 *  得意先納入指示ＮＯ（データ）.<p>
	 *
	 */
	public static final String $cst_dlv_inst_no = "cst_dlv_inst_no";
	/**
	 *  発行番号.<p>
	 *
	 */
	public static final String $cst_dlv_inst_d_no = "cst_dlv_inst_d_no";
	/**
	 *  納入指示日.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 *  時刻.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	/**
	 *  部品メーカー備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 *  自社品番.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public static final String $itm_sub1_view = "itm_sub1_view";
	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public static final String $itm_sub2_view = "itm_sub2_view";
	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public static final String $itm_sub3_view = "itm_sub3_view";
	/**
	 *  枝番３(データ).<p>
	 *
	 */
	public static final String $itm_sub3_data = "itm_sub3_data";
	/**
	 *  自社品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 *  品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 *  品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 *  品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	/**
	 *  発行日.<p>
	 *
	 */
	public static final String $prnt_dt = "prnt_dt";
	/**
	 *  得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 *  得意先別名１.<p>
	 *
	 */
	public static final String $cst_alt_nm1 = "cst_alt_nm1";
	/**
	 *  得意先別名２.<p>
	 *
	 */
	public static final String $cst_alt_nm2 = "cst_alt_nm2";
	/**
	 *  得意先別名３.<p>
	 *
	 */
	public static final String $cst_alt_nm3 = "cst_alt_nm3";
	/**
	 *  得意先別名４.<p>
	 *
	 */
	public static final String $cst_alt_nm4 = "cst_alt_nm4";
	/**
	 *  納入先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	/**
	 *  納入先名.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
	/**
	 *  納入先別名１.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm1 = "dlv_id_alt_nm1";
	/**
	 *  納入先別名２.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm2 = "dlv_id_alt_nm2";
	/**
	 *  納入先別名３.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm3 = "dlv_id_alt_nm3";
	/**
	 *  納入先別名４.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm4 = "dlv_id_alt_nm4";
	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 *  版ＮＯラベル.<p>
	 *
	 */
	public static final String $ver_no_lbl = "ver_no_lbl";
	/**
	 *  手配ＮＯ１(表示用）.<p>
	 *
	 */
	public static final String $sno1_view = "sno1_view";
	/**
	 *  手配ＮＯ１(データ）.<p>
	 *
	 */
	public static final String $sno1_data = "sno1_data";
	/**
	 *  手配ＮＯ２(表示用）.<p>
	 *
	 */
	public static final String $sno2_view = "sno2_view";
	/**
	 *  手配ＮＯ２(データ）.<p>
	 *
	 */
	public static final String $sno2_data = "sno2_data";
	/**
	 *  手配ＮＯ３(表示用）.<p>
	 *
	 */
	public static final String $sno3_view = "sno3_view";
	/**
	 *  手配ＮＯ３(データ）.<p>
	 *
	 */
	public static final String $sno3_data = "sno3_data";
	/**
	 *  手配ＮＯ４(表示用）.<p>
	 *
	 */
	public static final String $sno4_view = "sno4_view";
	/**
	 *  手配ＮＯ４(データ）.<p>
	 *
	 */
	public static final String $sno4_data = "sno4_data";
	/**
	 *  手配ＮＯ１ラベル.<p>
	 *
	 */
	public static final String $sno1_lbl = "sno1_lbl";
	/**
	 *  手配ＮＯ２ラベル.<p>
	 *
	 */
	public static final String $sno2_lbl = "sno2_lbl";
	/**
	 *  手配ＮＯ３ラベル.<p>
	 *
	 */
	public static final String $sno3_lbl = "sno3_lbl";
	/**
	 *  手配ＮＯ４ラベル.<p>
	 *
	 */
	public static final String $sno4_lbl = "sno4_lbl";
	/**
	 *  梱包入数.<p>
	 *
	 */
	public static final String $cntnr_qty = "cntnr_qty";
	/**
	 *  梱包入数（文字列）.<p>
	 *
	 */
	public static final String $s_cntnr_qty = "s_cntnr_qty";
	/**
	 *  梱包入数単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 *  梱包入数単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 *  梱包単位ＣＤ.<p>
	 *
	 */
	public static final String $cntnr_unit_cd = "cntnr_unit_cd";
	/**
	 *  梱包単位名.<p>
	 *
	 */
	public static final String $cntnr_unit_nm = "cntnr_unit_nm";
	/**
	 *  有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 *  使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	/**
	 *  業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 *  製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 *  納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 *  入荷部門ＣＤ.<p>
	 *
	 */
	public static final String $arr_dpt_cd = "arr_dpt_cd";
	/**
	 *  入荷部門名.<p>
	 *
	 */
	public static final String $arr_dpt_nm = "arr_dpt_nm";
	/**
	 *  入荷担当者ＣＤ.<p>
	 *
	 */
	public static final String $arr_usr_cd = "arr_usr_cd";
	/**
	 *  入荷担当者名.<p>
	 *
	 */
	public static final String $arr_usr_nm = "arr_usr_nm";
	/**
	 *  受入部門ＣＤ.<p>
	 *
	 */
	public static final String $acpt_dpt_cd = "acpt_dpt_cd";
	/**
	 *  受入部門名.<p>
	 *
	 */
	public static final String $acpt_dpt_nm = "acpt_dpt_nm";
	/**
	 *  受入担当者ＣＤ.<p>
	 *
	 */
	public static final String $acpt_usr_cd = "acpt_usr_cd";
	/**
	 *  受入担当者名.<p>
	 *
	 */
	public static final String $acpt_usr_nm = "acpt_usr_nm";
	/**
	 *  ロット備考.<p>
	 *
	 */
	public static final String $lot_rmrks = "lot_rmrks";
	/**
	 *  備考１(出荷実績明細).<p>
	 *
	 */
	public static final String $ship_act_d_sub_char1 = "ship_act_d_sub_char1";
	/**
	 *  備考２(出荷実績明細).<p>
	 *
	 */
	public static final String $ship_act_d_sub_char2 = "ship_act_d_sub_char2";
	/**
	 *  備考３(出荷実績明細).<p>
	 *
	 */
	public static final String $ship_act_d_sub_char3 = "ship_act_d_sub_char3";
	/**
	 *  備考１(出荷引当状況).<p>
	 *
	 */
	public static final String $ship_alloc_sts_sub_char1 = "ship_alloc_sts_sub_char1";
	/**
	 *  備考２(出荷引当状況).<p>
	 *
	 */
	public static final String $ship_alloc_sts_sub_char2 = "ship_alloc_sts_sub_char2";
	/**
	 *  備考３(出荷引当状況).<p>
	 *
	 */
	public static final String $ship_alloc_sts_sub_char3 = "ship_alloc_sts_sub_char3";
	/**
	 *  備考１(入荷実績).<p>
	 *
	 */
	public static final String $arr_act_sub_char1 = "arr_act_sub_char1";
	/**
	 *  備考２(入荷実績).<p>
	 *
	 */
	public static final String $arr_act_sub_char2 = "arr_act_sub_char2";
	/**
	 *  備考３(入荷実績).<p>
	 *
	 */
	public static final String $arr_act_sub_char3 = "arr_act_sub_char3";
	/**
	 *  備考１(出来高予定).<p>
	 *
	 */
	public static final String $yield_schd_sub_char1 = "yield_schd_sub_char1";
	/**
	 *  備考２(出来高予定).<p>
	 *
	 */
	public static final String $yield_schd_sub_char2 = "yield_schd_sub_char2";
	/**
	 *  備考３(出来高予定).<p>
	 *
	 */
	public static final String $yield_schd_sub_char3 = "yield_schd_sub_char3";
	/**
	 *  備考１(出来高実績).<p>
	 *
	 */
	public static final String $yield_act_sub_char1 = "yield_act_sub_char1";
	/**
	 *  備考２(出来高実績).<p>
	 *
	 */
	public static final String $yield_act_sub_char2 = "yield_act_sub_char2";
	/**
	 *  備考３(出来高実績).<p>
	 *
	 */
	public static final String $yield_act_sub_char3 = "yield_act_sub_char3";
	/**
	 *  備考１(現状在庫).<p>
	 *
	 */
	public static final String $stk_sub_char1 = "stk_sub_char1";
	/**
	 *  備考２(現状在庫).<p>
	 *
	 */
	public static final String $stk_sub_char2 = "stk_sub_char2";
	/**
	 *  備考３(現状在庫).<p>
	 *
	 */
	public static final String $stk_sub_char3 = "stk_sub_char3";
	/**
	 *  発行ユーザＩＤ.<p>
	 *
	 */
	public static final String $prnt_user_id = "prnt_user_id";
	/**
	 *  場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 *  工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 *  クライアント区分.<p>
	 *
	 */
	public static final String $client_typ = "client_typ";
	/**
	 *  発行枚数.<p>
	 *
	 */
	public static final String $page_cnt = "page_cnt";
	/**
	 *  合計発行枚数.<p>
	 *
	 */
	public static final String $page_sum = "page_sum";


	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_slip_itm_cd_META = createCommonMeta($dlv_slip_itm_cd, mcframe.commonMS.meta.MS_META.DLV_SLIP_ITM_CD);
	public static final MCMeta lot_no_view_META = createCommonMeta($lot_no_view, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_no_data_META = createCommonMeta($lot_no_data, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_view_META = createCommonMeta($sublot_no_view, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_no_data_META = createCommonMeta($sublot_no_data, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_base_unit_qty_META = createStringMeta($s_base_unit_qty);
	public static final MCMeta cntnr_flg_META = createCommonMeta($cntnr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_itm_nm_META = createCommonMeta($dlv_slip_itm_nm, mcframe.commonMS.meta.MS_META.DLV_SLIP_ITM_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_alt_nm1_META = createCommonMeta($dlv_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta dlv_alt_nm2_META = createCommonMeta($dlv_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta dlv_alt_nm3_META = createCommonMeta($dlv_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta dlv_alt_nm4_META = createCommonMeta($dlv_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta dlv_inst_qty_META = createCommonMeta($dlv_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_dlv_inst_qty_META = createStringMeta($s_dlv_inst_qty);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.STD_CO_CD);
	public static final MCMeta qr_cd_META = createStringMeta($qr_cd);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta cst_dlv_inst_no_META = createCommonMeta($cst_dlv_inst_no, mcframe.commonMA.meta.MA_META.CST_DLV_INST_NO);
	public static final MCMeta cst_dlv_inst_d_no_META = createCommonMeta($cst_dlv_inst_d_no, mcframe.commonMA.meta.MA_META.CST_DLV_INST_D_NO);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_view_META = createCommonMeta($itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub1_data_META = createCommonMeta($itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view_META = createCommonMeta($itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub2_data_META = createCommonMeta($itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view_META = createCommonMeta($itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub3_data_META = createCommonMeta($itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta prnt_dt_META = createCommonMeta($prnt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_alt_nm1_META = createCommonMeta($cst_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta cst_alt_nm2_META = createCommonMeta($cst_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta cst_alt_nm3_META = createCommonMeta($cst_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta cst_alt_nm4_META = createCommonMeta($cst_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta dlv_id_alt_nm1_META = createCommonMeta($dlv_id_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta dlv_id_alt_nm2_META = createCommonMeta($dlv_id_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta dlv_id_alt_nm3_META = createCommonMeta($dlv_id_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta dlv_id_alt_nm4_META = createCommonMeta($dlv_id_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta ver_no_lbl_META = createStringMeta($ver_no_lbl);
	public static final MCMeta sno1_view_META = createCommonMeta($sno1_view, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_data_META = createCommonMeta($sno1_data, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_view_META = createCommonMeta($sno2_view, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_data_META = createCommonMeta($sno2_data, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_view_META = createCommonMeta($sno3_view, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_data_META = createCommonMeta($sno3_data, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_view_META = createCommonMeta($sno4_view, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_data_META = createCommonMeta($sno4_data, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno1_lbl_META = createStringMeta($sno1_lbl);
	public static final MCMeta sno2_lbl_META = createStringMeta($sno2_lbl);
	public static final MCMeta sno3_lbl_META = createStringMeta($sno3_lbl);
	public static final MCMeta sno4_lbl_META = createStringMeta($sno4_lbl);
	public static final MCMeta cntnr_qty_META = createCommonMeta($cntnr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_cntnr_qty_META = createStringMeta($s_cntnr_qty);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta cntnr_unit_cd_META = createCommonMeta($cntnr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cntnr_unit_nm_META = createCommonMeta($cntnr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta arr_dpt_cd_META = createCommonMeta($arr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta arr_dpt_nm_META = createCommonMeta($arr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta arr_usr_cd_META = createCommonMeta($arr_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta arr_usr_nm_META = createCommonMeta($arr_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta acpt_dpt_cd_META = createCommonMeta($acpt_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta acpt_dpt_nm_META = createCommonMeta($acpt_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta acpt_usr_cd_META = createCommonMeta($acpt_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta acpt_usr_nm_META = createCommonMeta($acpt_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta ship_act_d_sub_char1_META = createCommonMeta($ship_act_d_sub_char1, mcframe.commonMS.meta.MS_META.SHIP_ACT_D_SUB_CHAR1);
	public static final MCMeta ship_act_d_sub_char2_META = createCommonMeta($ship_act_d_sub_char2, mcframe.commonMS.meta.MS_META.SHIP_ACT_D_SUB_CHAR2);
	public static final MCMeta ship_act_d_sub_char3_META = createCommonMeta($ship_act_d_sub_char3, mcframe.commonMS.meta.MS_META.SHIP_ACT_D_SUB_CHAR3);
	public static final MCMeta ship_alloc_sts_sub_char1_META = createCommonMeta($ship_alloc_sts_sub_char1, mcframe.commonMS.meta.MS_META.SHIP_ALLOC_STS_SUB_CHAR1);
	public static final MCMeta ship_alloc_sts_sub_char2_META = createCommonMeta($ship_alloc_sts_sub_char2, mcframe.commonMS.meta.MS_META.SHIP_ALLOC_STS_SUB_CHAR2);
	public static final MCMeta ship_alloc_sts_sub_char3_META = createCommonMeta($ship_alloc_sts_sub_char3, mcframe.commonMS.meta.MS_META.SHIP_ALLOC_STS_SUB_CHAR3);
	public static final MCMeta arr_act_sub_char1_META = createCommonMeta($arr_act_sub_char1, mcframe.commonMS.meta.MS_META.ARR_ACT_SUB_CHAR1);
	public static final MCMeta arr_act_sub_char2_META = createCommonMeta($arr_act_sub_char2, mcframe.commonMS.meta.MS_META.ARR_ACT_SUB_CHAR2);
	public static final MCMeta arr_act_sub_char3_META = createCommonMeta($arr_act_sub_char3, mcframe.commonMS.meta.MS_META.ARR_ACT_SUB_CHAR3);
	public static final MCMeta yield_schd_sub_char1_META = createCommonMeta($yield_schd_sub_char1, mcframe.commonMS.meta.MS_META.YIELD_SCHD_SUB_CHAR1);
	public static final MCMeta yield_schd_sub_char2_META = createCommonMeta($yield_schd_sub_char2, mcframe.commonMS.meta.MS_META.YIELD_SCHD_SUB_CHAR2);
	public static final MCMeta yield_schd_sub_char3_META = createCommonMeta($yield_schd_sub_char3, mcframe.commonMS.meta.MS_META.YIELD_SCHD_SUB_CHAR3);
	public static final MCMeta yield_act_sub_char1_META = createCommonMeta($yield_act_sub_char1, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR1);
	public static final MCMeta yield_act_sub_char2_META = createCommonMeta($yield_act_sub_char2, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR2);
	public static final MCMeta yield_act_sub_char3_META = createCommonMeta($yield_act_sub_char3, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR3);
	public static final MCMeta stk_sub_char1_META = createCommonMeta($stk_sub_char1, mcframe.commonMS.meta.MS_META.STK_SUB_CHAR1);
	public static final MCMeta stk_sub_char2_META = createCommonMeta($stk_sub_char2, mcframe.commonMS.meta.MS_META.STK_SUB_CHAR2);
	public static final MCMeta stk_sub_char3_META = createCommonMeta($stk_sub_char3, mcframe.commonMS.meta.MS_META.STK_SUB_CHAR3);
	public static final MCMeta prnt_user_id_META = createCommonMeta($prnt_user_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta client_typ_META = createCommonMeta($client_typ, mcframe.commonMA.meta.MA_META.CLIENT_TYP);
	public static final MCMeta page_cnt_META = createCommonMeta($page_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta page_sum_META = createCommonMeta($page_sum, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<StkListDtlR> constMetas = new ConstMetaList<StkListDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bp_nm_META,
			dlv_slip_itm_cd_META,
			lot_no_view_META,
			lot_no_data_META,
			sublot_no_view_META,
			sublot_no_data_META,
			base_unit_qty_META,
			s_base_unit_qty_META,
			cntnr_flg_META,
			dlv_slip_itm_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			dlv_alt_nm1_META,
			dlv_alt_nm2_META,
			dlv_alt_nm3_META,
			dlv_alt_nm4_META,
			dlv_inst_qty_META,
			s_dlv_inst_qty_META,
			co_nm_META,
			co_cd_META,
			qr_cd_META,
			cst_po_no_META,
			cst_po_d_no_META,
			cst_dlv_inst_no_META,
			cst_dlv_inst_d_no_META,
			dlv_rqst_dt_META,
			dlv_rqst_tm_META,
			trd_d_rmrks_META,
			itm_cd_META,
			itm_sub1_view_META,
			itm_sub1_data_META,
			itm_sub2_view_META,
			itm_sub2_data_META,
			itm_sub3_view_META,
			itm_sub3_data_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			prnt_dt_META,
			cst_nm_META,
			cst_alt_nm1_META,
			cst_alt_nm2_META,
			cst_alt_nm3_META,
			cst_alt_nm4_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			dlv_id_alt_nm1_META,
			dlv_id_alt_nm2_META,
			dlv_id_alt_nm3_META,
			dlv_id_alt_nm4_META,
			ver_no_META,
			ver_no_lbl_META,
			sno1_view_META,
			sno1_data_META,
			sno2_view_META,
			sno2_data_META,
			sno3_view_META,
			sno3_data_META,
			sno4_view_META,
			sno4_data_META,
			sno1_lbl_META,
			sno2_lbl_META,
			sno3_lbl_META,
			sno4_lbl_META,
			cntnr_qty_META,
			s_cntnr_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			cntnr_unit_cd_META,
			cntnr_unit_nm_META,
			vld_dt_META,
			lmt_dt_META,
			bp_lot_no_META,
			mfg_inst_no_META,
			po_d_no_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			arr_dpt_cd_META,
			arr_dpt_nm_META,
			arr_usr_cd_META,
			arr_usr_nm_META,
			acpt_dpt_cd_META,
			acpt_dpt_nm_META,
			acpt_usr_cd_META,
			acpt_usr_nm_META,
			lot_rmrks_META,
			ship_act_d_sub_char1_META,
			ship_act_d_sub_char2_META,
			ship_act_d_sub_char3_META,
			ship_alloc_sts_sub_char1_META,
			ship_alloc_sts_sub_char2_META,
			ship_alloc_sts_sub_char3_META,
			arr_act_sub_char1_META,
			arr_act_sub_char2_META,
			arr_act_sub_char3_META,
			yield_schd_sub_char1_META,
			yield_schd_sub_char2_META,
			yield_schd_sub_char3_META,
			yield_act_sub_char1_META,
			yield_act_sub_char2_META,
			yield_act_sub_char3_META,
			stk_sub_char1_META,
			stk_sub_char2_META,
			stk_sub_char3_META,
			prnt_user_id_META,
			loc_cd_META,
			site_cd_META,
			client_typ_META,
			page_cnt_META,
			page_sum_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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
	 * コンストラクタです。
	 */
	protected StkListDtlR_MC_A(ConstMetaList<? extends StkListDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkListDtlR clone() {
		return (StkListDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkListDtlR createInstance() {
		return (StkListDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkListDtlR getValues(String... names) {
		return (StkListDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  発注者名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 0, $bp_nm);
	}

	/**
	 *  発注者名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 0, $bp_nm, value);
	}


	/**
	 *  部品番号.<p>
	 *
	 */
	public String dlv_slip_itm_cd() {
		return getConstString(offset + 1, $dlv_slip_itm_cd);
	}

	/**
	 *  部品番号.<p>
	 *
	 */
	public void dlv_slip_itm_cd(String value) {
		setConstString(offset + 1, $dlv_slip_itm_cd, value);
	}


	/**
	 *  部品番号識別１(表示用).<p>
	 *
	 */
	public String lot_no_view() {
		return getConstString(offset + 2, $lot_no_view);
	}

	/**
	 *  部品番号識別１(表示用).<p>
	 *
	 */
	public void lot_no_view(String value) {
		setConstString(offset + 2, $lot_no_view, value);
	}


	/**
	 *  部品番号識別１(データ用).<p>
	 *
	 */
	public String lot_no_data() {
		return getConstString(offset + 3, $lot_no_data);
	}

	/**
	 *  部品番号識別１(データ用).<p>
	 *
	 */
	public void lot_no_data(String value) {
		setConstString(offset + 3, $lot_no_data, value);
	}


	/**
	 *  部品番号識別２(表示用).<p>
	 *
	 */
	public String sublot_no_view() {
		return getConstString(offset + 4, $sublot_no_view);
	}

	/**
	 *  部品番号識別２(表示用).<p>
	 *
	 */
	public void sublot_no_view(String value) {
		setConstString(offset + 4, $sublot_no_view, value);
	}


	/**
	 *  部品番号識別２(データ用).<p>
	 *
	 */
	public String sublot_no_data() {
		return getConstString(offset + 5, $sublot_no_data);
	}

	/**
	 *  部品番号識別２(データ用).<p>
	 *
	 */
	public void sublot_no_data(String value) {
		setConstString(offset + 5, $sublot_no_data, value);
	}


	/**
	 *  収容数.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 6, $base_unit_qty);
	}

	/**
	 *  収容数.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 6, $base_unit_qty, value);
	}

	/**
	 *  収容数.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 6, $base_unit_qty, value);
	}

	/**
	 *  収容数.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 6, $base_unit_qty, value);
	}

	/**
	 *  収容数.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 6, $base_unit_qty, value);
	}

	/**
	 *  収容数.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 6, $base_unit_qty, value);
	}


	/**
	 *  収容数（文字列）.<p>
	 *
	 */
	public String s_base_unit_qty() {
		return getConstString(offset + 7, $s_base_unit_qty);
	}

	/**
	 *  収容数（文字列）.<p>
	 *
	 */
	public void s_base_unit_qty(String value) {
		setConstString(offset + 7, $s_base_unit_qty, value);
	}


	/**
	 *  端数印字.<p>
	 *
	 */
	public boolean cntnr_flg() {
		return getConstBoolean(offset + 8, $cntnr_flg);
	}

	/**
	 *  端数印字.<p>
	 *
	 */
	public void cntnr_flg(boolean value) {
		setConstBoolean(offset + 8, $cntnr_flg, value);
	}


	/**
	 *  部品名称.<p>
	 *
	 */
	public String dlv_slip_itm_nm() {
		return getConstString(offset + 9, $dlv_slip_itm_nm);
	}

	/**
	 *  部品名称.<p>
	 *
	 */
	public void dlv_slip_itm_nm(String value) {
		setConstString(offset + 9, $dlv_slip_itm_nm, value);
	}


	/**
	 *  納入先ＣＤ（データ）.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 10, $dlv_cd);
	}

	/**
	 *  納入先ＣＤ（データ）.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 10, $dlv_cd, value);
	}


	/**
	 *  納入先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 11, $dlv_nm);
	}

	/**
	 *  納入先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 11, $dlv_nm, value);
	}


	/**
	 *  納入先別名１.<p>
	 *
	 */
	public String dlv_alt_nm1() {
		return getConstString(offset + 12, $dlv_alt_nm1);
	}

	/**
	 *  納入先別名１.<p>
	 *
	 */
	public void dlv_alt_nm1(String value) {
		setConstString(offset + 12, $dlv_alt_nm1, value);
	}


	/**
	 *  納入先別名２.<p>
	 *
	 */
	public String dlv_alt_nm2() {
		return getConstString(offset + 13, $dlv_alt_nm2);
	}

	/**
	 *  納入先別名２.<p>
	 *
	 */
	public void dlv_alt_nm2(String value) {
		setConstString(offset + 13, $dlv_alt_nm2, value);
	}


	/**
	 *  納入先別名３.<p>
	 *
	 */
	public String dlv_alt_nm3() {
		return getConstString(offset + 14, $dlv_alt_nm3);
	}

	/**
	 *  納入先別名３.<p>
	 *
	 */
	public void dlv_alt_nm3(String value) {
		setConstString(offset + 14, $dlv_alt_nm3, value);
	}


	/**
	 *  納入先別名４.<p>
	 *
	 */
	public String dlv_alt_nm4() {
		return getConstString(offset + 15, $dlv_alt_nm4);
	}

	/**
	 *  納入先別名４.<p>
	 *
	 */
	public void dlv_alt_nm4(String value) {
		setConstString(offset + 15, $dlv_alt_nm4, value);
	}


	/**
	 *  指示数.<p>
	 *
	 */
	public MCNumber dlv_inst_qty() {
		return getConstNumber(offset + 16, $dlv_inst_qty);
	}

	/**
	 *  指示数.<p>
	 *
	 */
	public void dlv_inst_qty(MCNumber value) {
		setConstNumber(offset + 16, $dlv_inst_qty, value);
	}

	/**
	 *  指示数.<p>
	 *
	 */
	public void dlv_inst_qty(int value) {
		setConstNumber(offset + 16, $dlv_inst_qty, value);
	}

	/**
	 *  指示数.<p>
	 *
	 */
	public void dlv_inst_qty(long value) {
		setConstNumber(offset + 16, $dlv_inst_qty, value);
	}

	/**
	 *  指示数.<p>
	 *
	 */
	public void dlv_inst_qty(float value) {
		setConstNumber(offset + 16, $dlv_inst_qty, value);
	}

	/**
	 *  指示数.<p>
	 *
	 */
	public void dlv_inst_qty(double value) {
		setConstNumber(offset + 16, $dlv_inst_qty, value);
	}


	/**
	 *  指示数（文字列）.<p>
	 *
	 */
	public String s_dlv_inst_qty() {
		return getConstString(offset + 17, $s_dlv_inst_qty);
	}

	/**
	 *  指示数（文字列）.<p>
	 *
	 */
	public void s_dlv_inst_qty(String value) {
		setConstString(offset + 17, $s_dlv_inst_qty, value);
	}


	/**
	 *  受注者名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 18, $co_nm);
	}

	/**
	 *  受注者名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 18, $co_nm, value);
	}


	/**
	 *  受注者ＣＤ.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 19, $co_cd);
	}

	/**
	 *  受注者ＣＤ.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 19, $co_cd, value);
	}


	/**
	 *  QRコード.<p>
	 *
	 */
	public String qr_cd() {
		return getConstString(offset + 20, $qr_cd);
	}

	/**
	 *  QRコード.<p>
	 *
	 */
	public void qr_cd(String value) {
		setConstString(offset + 20, $qr_cd, value);
	}


	/**
	 *  得意先注文ＮＯ（データ）.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 21, $cst_po_no);
	}

	/**
	 *  得意先注文ＮＯ（データ）.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 21, $cst_po_no, value);
	}


	/**
	 *  得意先注文明細ＮＯ（データ）.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 22, $cst_po_d_no);
	}

	/**
	 *  得意先注文明細ＮＯ（データ）.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 22, $cst_po_d_no, value);
	}


	/**
	 *  得意先納入指示ＮＯ（データ）.<p>
	 *
	 */
	public String cst_dlv_inst_no() {
		return getConstString(offset + 23, $cst_dlv_inst_no);
	}

	/**
	 *  得意先納入指示ＮＯ（データ）.<p>
	 *
	 */
	public void cst_dlv_inst_no(String value) {
		setConstString(offset + 23, $cst_dlv_inst_no, value);
	}


	/**
	 *  発行番号.<p>
	 *
	 */
	public String cst_dlv_inst_d_no() {
		return getConstString(offset + 24, $cst_dlv_inst_d_no);
	}

	/**
	 *  発行番号.<p>
	 *
	 */
	public void cst_dlv_inst_d_no(String value) {
		setConstString(offset + 24, $cst_dlv_inst_d_no, value);
	}


	/**
	 *  納入指示日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 25, $dlv_rqst_dt);
	}

	/**
	 *  納入指示日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 25, $dlv_rqst_dt, value);
	}


	/**
	 *  時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 26, $dlv_rqst_tm);
	}

	/**
	 *  時刻.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 26, $dlv_rqst_tm, value);
	}


	/**
	 *  部品メーカー備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 27, $trd_d_rmrks);
	}

	/**
	 *  部品メーカー備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 27, $trd_d_rmrks, value);
	}


	/**
	 *  自社品番.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 28, $itm_cd);
	}

	/**
	 *  自社品番.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 28, $itm_cd, value);
	}


	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 29, $itm_sub1_view);
	}

	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 29, $itm_sub1_view, value);
	}


	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 30, $itm_sub1_data);
	}

	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 30, $itm_sub1_data, value);
	}


	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 31, $itm_sub2_view);
	}

	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 31, $itm_sub2_view, value);
	}


	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 32, $itm_sub2_data);
	}

	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 32, $itm_sub2_data, value);
	}


	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 33, $itm_sub3_view);
	}

	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 33, $itm_sub3_view, value);
	}


	/**
	 *  枝番３(データ).<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 34, $itm_sub3_data);
	}

	/**
	 *  枝番３(データ).<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 34, $itm_sub3_data, value);
	}


	/**
	 *  自社品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 35, $itm_nm);
	}

	/**
	 *  自社品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 35, $itm_nm, value);
	}


	/**
	 *  品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 36, $itm_alt_nm1);
	}

	/**
	 *  品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 36, $itm_alt_nm1, value);
	}


	/**
	 *  品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 37, $itm_alt_nm2);
	}

	/**
	 *  品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 37, $itm_alt_nm2, value);
	}


	/**
	 *  品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 38, $itm_alt_nm3);
	}

	/**
	 *  品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 38, $itm_alt_nm3, value);
	}


	/**
	 *  品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 39, $itm_alt_nm4);
	}

	/**
	 *  品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 39, $itm_alt_nm4, value);
	}


	/**
	 *  発行日.<p>
	 *
	 */
	public MCDate prnt_dt() {
		return getConstDate(offset + 40, $prnt_dt);
	}

	/**
	 *  発行日.<p>
	 *
	 */
	public void prnt_dt(MCDate value) {
		setConstDate(offset + 40, $prnt_dt, value);
	}


	/**
	 *  得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 41, $cst_nm);
	}

	/**
	 *  得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 41, $cst_nm, value);
	}


	/**
	 *  得意先別名１.<p>
	 *
	 */
	public String cst_alt_nm1() {
		return getConstString(offset + 42, $cst_alt_nm1);
	}

	/**
	 *  得意先別名１.<p>
	 *
	 */
	public void cst_alt_nm1(String value) {
		setConstString(offset + 42, $cst_alt_nm1, value);
	}


	/**
	 *  得意先別名２.<p>
	 *
	 */
	public String cst_alt_nm2() {
		return getConstString(offset + 43, $cst_alt_nm2);
	}

	/**
	 *  得意先別名２.<p>
	 *
	 */
	public void cst_alt_nm2(String value) {
		setConstString(offset + 43, $cst_alt_nm2, value);
	}


	/**
	 *  得意先別名３.<p>
	 *
	 */
	public String cst_alt_nm3() {
		return getConstString(offset + 44, $cst_alt_nm3);
	}

	/**
	 *  得意先別名３.<p>
	 *
	 */
	public void cst_alt_nm3(String value) {
		setConstString(offset + 44, $cst_alt_nm3, value);
	}


	/**
	 *  得意先別名４.<p>
	 *
	 */
	public String cst_alt_nm4() {
		return getConstString(offset + 45, $cst_alt_nm4);
	}

	/**
	 *  得意先別名４.<p>
	 *
	 */
	public void cst_alt_nm4(String value) {
		setConstString(offset + 45, $cst_alt_nm4, value);
	}


	/**
	 *  納入先ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 46, $dlv_id_cd);
	}

	/**
	 *  納入先ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 46, $dlv_id_cd, value);
	}


	/**
	 *  納入先名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 47, $dlv_id_nm);
	}

	/**
	 *  納入先名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 47, $dlv_id_nm, value);
	}


	/**
	 *  納入先別名１.<p>
	 *
	 */
	public String dlv_id_alt_nm1() {
		return getConstString(offset + 48, $dlv_id_alt_nm1);
	}

	/**
	 *  納入先別名１.<p>
	 *
	 */
	public void dlv_id_alt_nm1(String value) {
		setConstString(offset + 48, $dlv_id_alt_nm1, value);
	}


	/**
	 *  納入先別名２.<p>
	 *
	 */
	public String dlv_id_alt_nm2() {
		return getConstString(offset + 49, $dlv_id_alt_nm2);
	}

	/**
	 *  納入先別名２.<p>
	 *
	 */
	public void dlv_id_alt_nm2(String value) {
		setConstString(offset + 49, $dlv_id_alt_nm2, value);
	}


	/**
	 *  納入先別名３.<p>
	 *
	 */
	public String dlv_id_alt_nm3() {
		return getConstString(offset + 50, $dlv_id_alt_nm3);
	}

	/**
	 *  納入先別名３.<p>
	 *
	 */
	public void dlv_id_alt_nm3(String value) {
		setConstString(offset + 50, $dlv_id_alt_nm3, value);
	}


	/**
	 *  納入先別名４.<p>
	 *
	 */
	public String dlv_id_alt_nm4() {
		return getConstString(offset + 51, $dlv_id_alt_nm4);
	}

	/**
	 *  納入先別名４.<p>
	 *
	 */
	public void dlv_id_alt_nm4(String value) {
		setConstString(offset + 51, $dlv_id_alt_nm4, value);
	}


	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 52, $ver_no);
	}

	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 52, $ver_no, value);
	}


	/**
	 *  版ＮＯラベル.<p>
	 *
	 */
	public String ver_no_lbl() {
		return getConstString(offset + 53, $ver_no_lbl);
	}

	/**
	 *  版ＮＯラベル.<p>
	 *
	 */
	public void ver_no_lbl(String value) {
		setConstString(offset + 53, $ver_no_lbl, value);
	}


	/**
	 *  手配ＮＯ１(表示用）.<p>
	 *
	 */
	public String sno1_view() {
		return getConstString(offset + 54, $sno1_view);
	}

	/**
	 *  手配ＮＯ１(表示用）.<p>
	 *
	 */
	public void sno1_view(String value) {
		setConstString(offset + 54, $sno1_view, value);
	}


	/**
	 *  手配ＮＯ１(データ）.<p>
	 *
	 */
	public String sno1_data() {
		return getConstString(offset + 55, $sno1_data);
	}

	/**
	 *  手配ＮＯ１(データ）.<p>
	 *
	 */
	public void sno1_data(String value) {
		setConstString(offset + 55, $sno1_data, value);
	}


	/**
	 *  手配ＮＯ２(表示用）.<p>
	 *
	 */
	public String sno2_view() {
		return getConstString(offset + 56, $sno2_view);
	}

	/**
	 *  手配ＮＯ２(表示用）.<p>
	 *
	 */
	public void sno2_view(String value) {
		setConstString(offset + 56, $sno2_view, value);
	}


	/**
	 *  手配ＮＯ２(データ）.<p>
	 *
	 */
	public String sno2_data() {
		return getConstString(offset + 57, $sno2_data);
	}

	/**
	 *  手配ＮＯ２(データ）.<p>
	 *
	 */
	public void sno2_data(String value) {
		setConstString(offset + 57, $sno2_data, value);
	}


	/**
	 *  手配ＮＯ３(表示用）.<p>
	 *
	 */
	public String sno3_view() {
		return getConstString(offset + 58, $sno3_view);
	}

	/**
	 *  手配ＮＯ３(表示用）.<p>
	 *
	 */
	public void sno3_view(String value) {
		setConstString(offset + 58, $sno3_view, value);
	}


	/**
	 *  手配ＮＯ３(データ）.<p>
	 *
	 */
	public String sno3_data() {
		return getConstString(offset + 59, $sno3_data);
	}

	/**
	 *  手配ＮＯ３(データ）.<p>
	 *
	 */
	public void sno3_data(String value) {
		setConstString(offset + 59, $sno3_data, value);
	}


	/**
	 *  手配ＮＯ４(表示用）.<p>
	 *
	 */
	public String sno4_view() {
		return getConstString(offset + 60, $sno4_view);
	}

	/**
	 *  手配ＮＯ４(表示用）.<p>
	 *
	 */
	public void sno4_view(String value) {
		setConstString(offset + 60, $sno4_view, value);
	}


	/**
	 *  手配ＮＯ４(データ）.<p>
	 *
	 */
	public String sno4_data() {
		return getConstString(offset + 61, $sno4_data);
	}

	/**
	 *  手配ＮＯ４(データ）.<p>
	 *
	 */
	public void sno4_data(String value) {
		setConstString(offset + 61, $sno4_data, value);
	}


	/**
	 *  手配ＮＯ１ラベル.<p>
	 *
	 */
	public String sno1_lbl() {
		return getConstString(offset + 62, $sno1_lbl);
	}

	/**
	 *  手配ＮＯ１ラベル.<p>
	 *
	 */
	public void sno1_lbl(String value) {
		setConstString(offset + 62, $sno1_lbl, value);
	}


	/**
	 *  手配ＮＯ２ラベル.<p>
	 *
	 */
	public String sno2_lbl() {
		return getConstString(offset + 63, $sno2_lbl);
	}

	/**
	 *  手配ＮＯ２ラベル.<p>
	 *
	 */
	public void sno2_lbl(String value) {
		setConstString(offset + 63, $sno2_lbl, value);
	}


	/**
	 *  手配ＮＯ３ラベル.<p>
	 *
	 */
	public String sno3_lbl() {
		return getConstString(offset + 64, $sno3_lbl);
	}

	/**
	 *  手配ＮＯ３ラベル.<p>
	 *
	 */
	public void sno3_lbl(String value) {
		setConstString(offset + 64, $sno3_lbl, value);
	}


	/**
	 *  手配ＮＯ４ラベル.<p>
	 *
	 */
	public String sno4_lbl() {
		return getConstString(offset + 65, $sno4_lbl);
	}

	/**
	 *  手配ＮＯ４ラベル.<p>
	 *
	 */
	public void sno4_lbl(String value) {
		setConstString(offset + 65, $sno4_lbl, value);
	}


	/**
	 *  梱包入数.<p>
	 *
	 */
	public MCNumber cntnr_qty() {
		return getConstNumber(offset + 66, $cntnr_qty);
	}

	/**
	 *  梱包入数.<p>
	 *
	 */
	public void cntnr_qty(MCNumber value) {
		setConstNumber(offset + 66, $cntnr_qty, value);
	}

	/**
	 *  梱包入数.<p>
	 *
	 */
	public void cntnr_qty(int value) {
		setConstNumber(offset + 66, $cntnr_qty, value);
	}

	/**
	 *  梱包入数.<p>
	 *
	 */
	public void cntnr_qty(long value) {
		setConstNumber(offset + 66, $cntnr_qty, value);
	}

	/**
	 *  梱包入数.<p>
	 *
	 */
	public void cntnr_qty(float value) {
		setConstNumber(offset + 66, $cntnr_qty, value);
	}

	/**
	 *  梱包入数.<p>
	 *
	 */
	public void cntnr_qty(double value) {
		setConstNumber(offset + 66, $cntnr_qty, value);
	}


	/**
	 *  梱包入数（文字列）.<p>
	 *
	 */
	public String s_cntnr_qty() {
		return getConstString(offset + 67, $s_cntnr_qty);
	}

	/**
	 *  梱包入数（文字列）.<p>
	 *
	 */
	public void s_cntnr_qty(String value) {
		setConstString(offset + 67, $s_cntnr_qty, value);
	}


	/**
	 *  梱包入数単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 68, $base_unit_cd);
	}

	/**
	 *  梱包入数単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 68, $base_unit_cd, value);
	}


	/**
	 *  梱包入数単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 69, $base_unit_nm);
	}

	/**
	 *  梱包入数単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 69, $base_unit_nm, value);
	}


	/**
	 *  梱包単位ＣＤ.<p>
	 *
	 */
	public String cntnr_unit_cd() {
		return getConstString(offset + 70, $cntnr_unit_cd);
	}

	/**
	 *  梱包単位ＣＤ.<p>
	 *
	 */
	public void cntnr_unit_cd(String value) {
		setConstString(offset + 70, $cntnr_unit_cd, value);
	}


	/**
	 *  梱包単位名.<p>
	 *
	 */
	public String cntnr_unit_nm() {
		return getConstString(offset + 71, $cntnr_unit_nm);
	}

	/**
	 *  梱包単位名.<p>
	 *
	 */
	public void cntnr_unit_nm(String value) {
		setConstString(offset + 71, $cntnr_unit_nm, value);
	}


	/**
	 *  有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 72, $vld_dt);
	}

	/**
	 *  有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 72, $vld_dt, value);
	}


	/**
	 *  使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 73, $lmt_dt);
	}

	/**
	 *  使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 73, $lmt_dt, value);
	}


	/**
	 *  業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 74, $bp_lot_no);
	}

	/**
	 *  業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 74, $bp_lot_no, value);
	}


	/**
	 *  製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 75, $mfg_inst_no);
	}

	/**
	 *  製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 75, $mfg_inst_no, value);
	}


	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 76, $po_d_no);
	}

	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 76, $po_d_no, value);
	}


	/**
	 *  納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 77, $dlv_slip_no);
	}

	/**
	 *  納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 77, $dlv_slip_no, value);
	}


	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 78, $dlv_slip_d_no);
	}

	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 78, $dlv_slip_d_no, value);
	}


	/**
	 *  入荷部門ＣＤ.<p>
	 *
	 */
	public String arr_dpt_cd() {
		return getConstString(offset + 79, $arr_dpt_cd);
	}

	/**
	 *  入荷部門ＣＤ.<p>
	 *
	 */
	public void arr_dpt_cd(String value) {
		setConstString(offset + 79, $arr_dpt_cd, value);
	}


	/**
	 *  入荷部門名.<p>
	 *
	 */
	public String arr_dpt_nm() {
		return getConstString(offset + 80, $arr_dpt_nm);
	}

	/**
	 *  入荷部門名.<p>
	 *
	 */
	public void arr_dpt_nm(String value) {
		setConstString(offset + 80, $arr_dpt_nm, value);
	}


	/**
	 *  入荷担当者ＣＤ.<p>
	 *
	 */
	public String arr_usr_cd() {
		return getConstString(offset + 81, $arr_usr_cd);
	}

	/**
	 *  入荷担当者ＣＤ.<p>
	 *
	 */
	public void arr_usr_cd(String value) {
		setConstString(offset + 81, $arr_usr_cd, value);
	}


	/**
	 *  入荷担当者名.<p>
	 *
	 */
	public String arr_usr_nm() {
		return getConstString(offset + 82, $arr_usr_nm);
	}

	/**
	 *  入荷担当者名.<p>
	 *
	 */
	public void arr_usr_nm(String value) {
		setConstString(offset + 82, $arr_usr_nm, value);
	}


	/**
	 *  受入部門ＣＤ.<p>
	 *
	 */
	public String acpt_dpt_cd() {
		return getConstString(offset + 83, $acpt_dpt_cd);
	}

	/**
	 *  受入部門ＣＤ.<p>
	 *
	 */
	public void acpt_dpt_cd(String value) {
		setConstString(offset + 83, $acpt_dpt_cd, value);
	}


	/**
	 *  受入部門名.<p>
	 *
	 */
	public String acpt_dpt_nm() {
		return getConstString(offset + 84, $acpt_dpt_nm);
	}

	/**
	 *  受入部門名.<p>
	 *
	 */
	public void acpt_dpt_nm(String value) {
		setConstString(offset + 84, $acpt_dpt_nm, value);
	}


	/**
	 *  受入担当者ＣＤ.<p>
	 *
	 */
	public String acpt_usr_cd() {
		return getConstString(offset + 85, $acpt_usr_cd);
	}

	/**
	 *  受入担当者ＣＤ.<p>
	 *
	 */
	public void acpt_usr_cd(String value) {
		setConstString(offset + 85, $acpt_usr_cd, value);
	}


	/**
	 *  受入担当者名.<p>
	 *
	 */
	public String acpt_usr_nm() {
		return getConstString(offset + 86, $acpt_usr_nm);
	}

	/**
	 *  受入担当者名.<p>
	 *
	 */
	public void acpt_usr_nm(String value) {
		setConstString(offset + 86, $acpt_usr_nm, value);
	}


	/**
	 *  ロット備考.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 87, $lot_rmrks);
	}

	/**
	 *  ロット備考.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 87, $lot_rmrks, value);
	}


	/**
	 *  備考１(出荷実績明細).<p>
	 *
	 */
	public String ship_act_d_sub_char1() {
		return getConstString(offset + 88, $ship_act_d_sub_char1);
	}

	/**
	 *  備考１(出荷実績明細).<p>
	 *
	 */
	public void ship_act_d_sub_char1(String value) {
		setConstString(offset + 88, $ship_act_d_sub_char1, value);
	}


	/**
	 *  備考２(出荷実績明細).<p>
	 *
	 */
	public String ship_act_d_sub_char2() {
		return getConstString(offset + 89, $ship_act_d_sub_char2);
	}

	/**
	 *  備考２(出荷実績明細).<p>
	 *
	 */
	public void ship_act_d_sub_char2(String value) {
		setConstString(offset + 89, $ship_act_d_sub_char2, value);
	}


	/**
	 *  備考３(出荷実績明細).<p>
	 *
	 */
	public String ship_act_d_sub_char3() {
		return getConstString(offset + 90, $ship_act_d_sub_char3);
	}

	/**
	 *  備考３(出荷実績明細).<p>
	 *
	 */
	public void ship_act_d_sub_char3(String value) {
		setConstString(offset + 90, $ship_act_d_sub_char3, value);
	}


	/**
	 *  備考１(出荷引当状況).<p>
	 *
	 */
	public String ship_alloc_sts_sub_char1() {
		return getConstString(offset + 91, $ship_alloc_sts_sub_char1);
	}

	/**
	 *  備考１(出荷引当状況).<p>
	 *
	 */
	public void ship_alloc_sts_sub_char1(String value) {
		setConstString(offset + 91, $ship_alloc_sts_sub_char1, value);
	}


	/**
	 *  備考２(出荷引当状況).<p>
	 *
	 */
	public String ship_alloc_sts_sub_char2() {
		return getConstString(offset + 92, $ship_alloc_sts_sub_char2);
	}

	/**
	 *  備考２(出荷引当状況).<p>
	 *
	 */
	public void ship_alloc_sts_sub_char2(String value) {
		setConstString(offset + 92, $ship_alloc_sts_sub_char2, value);
	}


	/**
	 *  備考３(出荷引当状況).<p>
	 *
	 */
	public String ship_alloc_sts_sub_char3() {
		return getConstString(offset + 93, $ship_alloc_sts_sub_char3);
	}

	/**
	 *  備考３(出荷引当状況).<p>
	 *
	 */
	public void ship_alloc_sts_sub_char3(String value) {
		setConstString(offset + 93, $ship_alloc_sts_sub_char3, value);
	}


	/**
	 *  備考１(入荷実績).<p>
	 *
	 */
	public String arr_act_sub_char1() {
		return getConstString(offset + 94, $arr_act_sub_char1);
	}

	/**
	 *  備考１(入荷実績).<p>
	 *
	 */
	public void arr_act_sub_char1(String value) {
		setConstString(offset + 94, $arr_act_sub_char1, value);
	}


	/**
	 *  備考２(入荷実績).<p>
	 *
	 */
	public String arr_act_sub_char2() {
		return getConstString(offset + 95, $arr_act_sub_char2);
	}

	/**
	 *  備考２(入荷実績).<p>
	 *
	 */
	public void arr_act_sub_char2(String value) {
		setConstString(offset + 95, $arr_act_sub_char2, value);
	}


	/**
	 *  備考３(入荷実績).<p>
	 *
	 */
	public String arr_act_sub_char3() {
		return getConstString(offset + 96, $arr_act_sub_char3);
	}

	/**
	 *  備考３(入荷実績).<p>
	 *
	 */
	public void arr_act_sub_char3(String value) {
		setConstString(offset + 96, $arr_act_sub_char3, value);
	}


	/**
	 *  備考１(出来高予定).<p>
	 *
	 */
	public String yield_schd_sub_char1() {
		return getConstString(offset + 97, $yield_schd_sub_char1);
	}

	/**
	 *  備考１(出来高予定).<p>
	 *
	 */
	public void yield_schd_sub_char1(String value) {
		setConstString(offset + 97, $yield_schd_sub_char1, value);
	}


	/**
	 *  備考２(出来高予定).<p>
	 *
	 */
	public String yield_schd_sub_char2() {
		return getConstString(offset + 98, $yield_schd_sub_char2);
	}

	/**
	 *  備考２(出来高予定).<p>
	 *
	 */
	public void yield_schd_sub_char2(String value) {
		setConstString(offset + 98, $yield_schd_sub_char2, value);
	}


	/**
	 *  備考３(出来高予定).<p>
	 *
	 */
	public String yield_schd_sub_char3() {
		return getConstString(offset + 99, $yield_schd_sub_char3);
	}

	/**
	 *  備考３(出来高予定).<p>
	 *
	 */
	public void yield_schd_sub_char3(String value) {
		setConstString(offset + 99, $yield_schd_sub_char3, value);
	}


	/**
	 *  備考１(出来高実績).<p>
	 *
	 */
	public String yield_act_sub_char1() {
		return getConstString(offset + 100, $yield_act_sub_char1);
	}

	/**
	 *  備考１(出来高実績).<p>
	 *
	 */
	public void yield_act_sub_char1(String value) {
		setConstString(offset + 100, $yield_act_sub_char1, value);
	}


	/**
	 *  備考２(出来高実績).<p>
	 *
	 */
	public String yield_act_sub_char2() {
		return getConstString(offset + 101, $yield_act_sub_char2);
	}

	/**
	 *  備考２(出来高実績).<p>
	 *
	 */
	public void yield_act_sub_char2(String value) {
		setConstString(offset + 101, $yield_act_sub_char2, value);
	}


	/**
	 *  備考３(出来高実績).<p>
	 *
	 */
	public String yield_act_sub_char3() {
		return getConstString(offset + 102, $yield_act_sub_char3);
	}

	/**
	 *  備考３(出来高実績).<p>
	 *
	 */
	public void yield_act_sub_char3(String value) {
		setConstString(offset + 102, $yield_act_sub_char3, value);
	}


	/**
	 *  備考１(現状在庫).<p>
	 *
	 */
	public String stk_sub_char1() {
		return getConstString(offset + 103, $stk_sub_char1);
	}

	/**
	 *  備考１(現状在庫).<p>
	 *
	 */
	public void stk_sub_char1(String value) {
		setConstString(offset + 103, $stk_sub_char1, value);
	}


	/**
	 *  備考２(現状在庫).<p>
	 *
	 */
	public String stk_sub_char2() {
		return getConstString(offset + 104, $stk_sub_char2);
	}

	/**
	 *  備考２(現状在庫).<p>
	 *
	 */
	public void stk_sub_char2(String value) {
		setConstString(offset + 104, $stk_sub_char2, value);
	}


	/**
	 *  備考３(現状在庫).<p>
	 *
	 */
	public String stk_sub_char3() {
		return getConstString(offset + 105, $stk_sub_char3);
	}

	/**
	 *  備考３(現状在庫).<p>
	 *
	 */
	public void stk_sub_char3(String value) {
		setConstString(offset + 105, $stk_sub_char3, value);
	}


	/**
	 *  発行ユーザＩＤ.<p>
	 *
	 */
	public String prnt_user_id() {
		return getConstString(offset + 106, $prnt_user_id);
	}

	/**
	 *  発行ユーザＩＤ.<p>
	 *
	 */
	public void prnt_user_id(String value) {
		setConstString(offset + 106, $prnt_user_id, value);
	}


	/**
	 *  場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 107, $loc_cd);
	}

	/**
	 *  場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 107, $loc_cd, value);
	}


	/**
	 *  工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 108, $site_cd);
	}

	/**
	 *  工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 108, $site_cd, value);
	}


	/**
	 *  クライアント区分.<p>
	 *
	 */
	public String client_typ() {
		return getConstString(offset + 109, $client_typ);
	}

	/**
	 *  クライアント区分.<p>
	 *
	 */
	public void client_typ(String value) {
		setConstString(offset + 109, $client_typ, value);
	}


	/**
	 *  発行枚数.<p>
	 *
	 */
	public MCNumber page_cnt() {
		return getConstNumber(offset + 110, $page_cnt);
	}

	/**
	 *  発行枚数.<p>
	 *
	 */
	public void page_cnt(MCNumber value) {
		setConstNumber(offset + 110, $page_cnt, value);
	}

	/**
	 *  発行枚数.<p>
	 *
	 */
	public void page_cnt(int value) {
		setConstNumber(offset + 110, $page_cnt, value);
	}

	/**
	 *  発行枚数.<p>
	 *
	 */
	public void page_cnt(long value) {
		setConstNumber(offset + 110, $page_cnt, value);
	}

	/**
	 *  発行枚数.<p>
	 *
	 */
	public void page_cnt(float value) {
		setConstNumber(offset + 110, $page_cnt, value);
	}

	/**
	 *  発行枚数.<p>
	 *
	 */
	public void page_cnt(double value) {
		setConstNumber(offset + 110, $page_cnt, value);
	}


	/**
	 *  合計発行枚数.<p>
	 *
	 */
	public MCNumber page_sum() {
		return getConstNumber(offset + 111, $page_sum);
	}

	/**
	 *  合計発行枚数.<p>
	 *
	 */
	public void page_sum(MCNumber value) {
		setConstNumber(offset + 111, $page_sum, value);
	}

	/**
	 *  合計発行枚数.<p>
	 *
	 */
	public void page_sum(int value) {
		setConstNumber(offset + 111, $page_sum, value);
	}

	/**
	 *  合計発行枚数.<p>
	 *
	 */
	public void page_sum(long value) {
		setConstNumber(offset + 111, $page_sum, value);
	}

	/**
	 *  合計発行枚数.<p>
	 *
	 */
	public void page_sum(float value) {
		setConstNumber(offset + 111, $page_sum, value);
	}

	/**
	 *  合計発行枚数.<p>
	 *
	 */
	public void page_sum(double value) {
		setConstNumber(offset + 111, $page_sum, value);
	}


	public String getString(String name) {
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($dlv_slip_itm_cd.equalsIgnoreCase(name)) {
			return dlv_slip_itm_cd();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			return s_base_unit_qty();
		}
		if ($dlv_slip_itm_nm.equalsIgnoreCase(name)) {
			return dlv_slip_itm_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_alt_nm1();
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_alt_nm2();
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_alt_nm3();
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_alt_nm4();
		}
		if ($s_dlv_inst_qty.equalsIgnoreCase(name)) {
			return s_dlv_inst_qty();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($qr_cd.equalsIgnoreCase(name)) {
			return qr_cd();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_no();
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_d_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			return cst_alt_nm1();
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			return cst_alt_nm2();
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			return cst_alt_nm3();
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			return cst_alt_nm4();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm1();
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm2();
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm3();
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm4();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			return ver_no_lbl();
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			return sno1_view();
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			return sno1_data();
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			return sno2_view();
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			return sno2_data();
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			return sno3_view();
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			return sno3_data();
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			return sno4_view();
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			return sno4_data();
		}
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			return sno1_lbl();
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			return sno2_lbl();
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			return sno3_lbl();
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			return sno4_lbl();
		}
		if ($s_cntnr_qty.equalsIgnoreCase(name)) {
			return s_cntnr_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($cntnr_unit_cd.equalsIgnoreCase(name)) {
			return cntnr_unit_cd();
		}
		if ($cntnr_unit_nm.equalsIgnoreCase(name)) {
			return cntnr_unit_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			return arr_dpt_cd();
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			return arr_dpt_nm();
		}
		if ($arr_usr_cd.equalsIgnoreCase(name)) {
			return arr_usr_cd();
		}
		if ($arr_usr_nm.equalsIgnoreCase(name)) {
			return arr_usr_nm();
		}
		if ($acpt_dpt_cd.equalsIgnoreCase(name)) {
			return acpt_dpt_cd();
		}
		if ($acpt_dpt_nm.equalsIgnoreCase(name)) {
			return acpt_dpt_nm();
		}
		if ($acpt_usr_cd.equalsIgnoreCase(name)) {
			return acpt_usr_cd();
		}
		if ($acpt_usr_nm.equalsIgnoreCase(name)) {
			return acpt_usr_nm();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char1();
		}
		if ($ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char2();
		}
		if ($ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char3();
		}
		if ($ship_alloc_sts_sub_char1.equalsIgnoreCase(name)) {
			return ship_alloc_sts_sub_char1();
		}
		if ($ship_alloc_sts_sub_char2.equalsIgnoreCase(name)) {
			return ship_alloc_sts_sub_char2();
		}
		if ($ship_alloc_sts_sub_char3.equalsIgnoreCase(name)) {
			return ship_alloc_sts_sub_char3();
		}
		if ($arr_act_sub_char1.equalsIgnoreCase(name)) {
			return arr_act_sub_char1();
		}
		if ($arr_act_sub_char2.equalsIgnoreCase(name)) {
			return arr_act_sub_char2();
		}
		if ($arr_act_sub_char3.equalsIgnoreCase(name)) {
			return arr_act_sub_char3();
		}
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			return yield_schd_sub_char1();
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			return yield_schd_sub_char2();
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			return yield_schd_sub_char3();
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			return yield_act_sub_char1();
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			return yield_act_sub_char2();
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			return yield_act_sub_char3();
		}
		if ($stk_sub_char1.equalsIgnoreCase(name)) {
			return stk_sub_char1();
		}
		if ($stk_sub_char2.equalsIgnoreCase(name)) {
			return stk_sub_char2();
		}
		if ($stk_sub_char3.equalsIgnoreCase(name)) {
			return stk_sub_char3();
		}
		if ($prnt_user_id.equalsIgnoreCase(name)) {
			return prnt_user_id();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			return client_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			return dlv_inst_qty();
		}
		if ($cntnr_qty.equalsIgnoreCase(name)) {
			return cntnr_qty();
		}
		if ($page_cnt.equalsIgnoreCase(name)) {
			return page_cnt();
		}
		if ($page_sum.equalsIgnoreCase(name)) {
			return page_sum();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($prnt_dt.equalsIgnoreCase(name)) {
			return prnt_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($cntnr_flg.equalsIgnoreCase(name)) {
			return cntnr_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($dlv_slip_itm_cd.equalsIgnoreCase(name)) {
			return dlv_slip_itm_cd();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			return s_base_unit_qty();
		}
		if ($dlv_slip_itm_nm.equalsIgnoreCase(name)) {
			return dlv_slip_itm_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_alt_nm1();
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_alt_nm2();
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_alt_nm3();
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_alt_nm4();
		}
		if ($s_dlv_inst_qty.equalsIgnoreCase(name)) {
			return s_dlv_inst_qty();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($qr_cd.equalsIgnoreCase(name)) {
			return qr_cd();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_no();
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_d_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			return cst_alt_nm1();
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			return cst_alt_nm2();
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			return cst_alt_nm3();
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			return cst_alt_nm4();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm1();
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm2();
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm3();
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm4();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			return ver_no_lbl();
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			return sno1_view();
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			return sno1_data();
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			return sno2_view();
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			return sno2_data();
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			return sno3_view();
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			return sno3_data();
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			return sno4_view();
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			return sno4_data();
		}
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			return sno1_lbl();
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			return sno2_lbl();
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			return sno3_lbl();
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			return sno4_lbl();
		}
		if ($s_cntnr_qty.equalsIgnoreCase(name)) {
			return s_cntnr_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($cntnr_unit_cd.equalsIgnoreCase(name)) {
			return cntnr_unit_cd();
		}
		if ($cntnr_unit_nm.equalsIgnoreCase(name)) {
			return cntnr_unit_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			return arr_dpt_cd();
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			return arr_dpt_nm();
		}
		if ($arr_usr_cd.equalsIgnoreCase(name)) {
			return arr_usr_cd();
		}
		if ($arr_usr_nm.equalsIgnoreCase(name)) {
			return arr_usr_nm();
		}
		if ($acpt_dpt_cd.equalsIgnoreCase(name)) {
			return acpt_dpt_cd();
		}
		if ($acpt_dpt_nm.equalsIgnoreCase(name)) {
			return acpt_dpt_nm();
		}
		if ($acpt_usr_cd.equalsIgnoreCase(name)) {
			return acpt_usr_cd();
		}
		if ($acpt_usr_nm.equalsIgnoreCase(name)) {
			return acpt_usr_nm();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char1();
		}
		if ($ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char2();
		}
		if ($ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char3();
		}
		if ($ship_alloc_sts_sub_char1.equalsIgnoreCase(name)) {
			return ship_alloc_sts_sub_char1();
		}
		if ($ship_alloc_sts_sub_char2.equalsIgnoreCase(name)) {
			return ship_alloc_sts_sub_char2();
		}
		if ($ship_alloc_sts_sub_char3.equalsIgnoreCase(name)) {
			return ship_alloc_sts_sub_char3();
		}
		if ($arr_act_sub_char1.equalsIgnoreCase(name)) {
			return arr_act_sub_char1();
		}
		if ($arr_act_sub_char2.equalsIgnoreCase(name)) {
			return arr_act_sub_char2();
		}
		if ($arr_act_sub_char3.equalsIgnoreCase(name)) {
			return arr_act_sub_char3();
		}
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			return yield_schd_sub_char1();
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			return yield_schd_sub_char2();
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			return yield_schd_sub_char3();
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			return yield_act_sub_char1();
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			return yield_act_sub_char2();
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			return yield_act_sub_char3();
		}
		if ($stk_sub_char1.equalsIgnoreCase(name)) {
			return stk_sub_char1();
		}
		if ($stk_sub_char2.equalsIgnoreCase(name)) {
			return stk_sub_char2();
		}
		if ($stk_sub_char3.equalsIgnoreCase(name)) {
			return stk_sub_char3();
		}
		if ($prnt_user_id.equalsIgnoreCase(name)) {
			return prnt_user_id();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			return client_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			return dlv_inst_qty();
		}
		if ($cntnr_qty.equalsIgnoreCase(name)) {
			return cntnr_qty();
		}
		if ($page_cnt.equalsIgnoreCase(name)) {
			return page_cnt();
		}
		if ($page_sum.equalsIgnoreCase(name)) {
			return page_sum();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($prnt_dt.equalsIgnoreCase(name)) {
			return prnt_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cntnr_flg.equalsIgnoreCase(name)) {
			return cntnr_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($dlv_slip_itm_cd.equalsIgnoreCase(name)) {
			dlv_slip_itm_cd(value);
			return;
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			lot_no_view(value);
			return;
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			lot_no_data(value);
			return;
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			sublot_no_view(value);
			return;
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			sublot_no_data(value);
			return;
		}
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			s_base_unit_qty(value);
			return;
		}
		if ($dlv_slip_itm_nm.equalsIgnoreCase(name)) {
			dlv_slip_itm_nm(value);
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
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			dlv_alt_nm1(value);
			return;
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			dlv_alt_nm2(value);
			return;
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			dlv_alt_nm3(value);
			return;
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			dlv_alt_nm4(value);
			return;
		}
		if ($s_dlv_inst_qty.equalsIgnoreCase(name)) {
			s_dlv_inst_qty(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($qr_cd.equalsIgnoreCase(name)) {
			qr_cd(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_no(value);
			return;
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_d_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			cst_alt_nm1(value);
			return;
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			cst_alt_nm2(value);
			return;
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			cst_alt_nm3(value);
			return;
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			cst_alt_nm4(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			dlv_id_alt_nm1(value);
			return;
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			dlv_id_alt_nm2(value);
			return;
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			dlv_id_alt_nm3(value);
			return;
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			dlv_id_alt_nm4(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			ver_no_lbl(value);
			return;
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			sno1_view(value);
			return;
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			sno1_data(value);
			return;
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			sno2_view(value);
			return;
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			sno2_data(value);
			return;
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			sno3_view(value);
			return;
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			sno3_data(value);
			return;
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			sno4_view(value);
			return;
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			sno4_data(value);
			return;
		}
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			sno1_lbl(value);
			return;
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			sno2_lbl(value);
			return;
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			sno3_lbl(value);
			return;
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			sno4_lbl(value);
			return;
		}
		if ($s_cntnr_qty.equalsIgnoreCase(name)) {
			s_cntnr_qty(value);
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
		if ($cntnr_unit_cd.equalsIgnoreCase(name)) {
			cntnr_unit_cd(value);
			return;
		}
		if ($cntnr_unit_nm.equalsIgnoreCase(name)) {
			cntnr_unit_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			arr_dpt_cd(value);
			return;
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			arr_dpt_nm(value);
			return;
		}
		if ($arr_usr_cd.equalsIgnoreCase(name)) {
			arr_usr_cd(value);
			return;
		}
		if ($arr_usr_nm.equalsIgnoreCase(name)) {
			arr_usr_nm(value);
			return;
		}
		if ($acpt_dpt_cd.equalsIgnoreCase(name)) {
			acpt_dpt_cd(value);
			return;
		}
		if ($acpt_dpt_nm.equalsIgnoreCase(name)) {
			acpt_dpt_nm(value);
			return;
		}
		if ($acpt_usr_cd.equalsIgnoreCase(name)) {
			acpt_usr_cd(value);
			return;
		}
		if ($acpt_usr_nm.equalsIgnoreCase(name)) {
			acpt_usr_nm(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			ship_act_d_sub_char1(value);
			return;
		}
		if ($ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			ship_act_d_sub_char2(value);
			return;
		}
		if ($ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			ship_act_d_sub_char3(value);
			return;
		}
		if ($ship_alloc_sts_sub_char1.equalsIgnoreCase(name)) {
			ship_alloc_sts_sub_char1(value);
			return;
		}
		if ($ship_alloc_sts_sub_char2.equalsIgnoreCase(name)) {
			ship_alloc_sts_sub_char2(value);
			return;
		}
		if ($ship_alloc_sts_sub_char3.equalsIgnoreCase(name)) {
			ship_alloc_sts_sub_char3(value);
			return;
		}
		if ($arr_act_sub_char1.equalsIgnoreCase(name)) {
			arr_act_sub_char1(value);
			return;
		}
		if ($arr_act_sub_char2.equalsIgnoreCase(name)) {
			arr_act_sub_char2(value);
			return;
		}
		if ($arr_act_sub_char3.equalsIgnoreCase(name)) {
			arr_act_sub_char3(value);
			return;
		}
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			yield_schd_sub_char1(value);
			return;
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			yield_schd_sub_char2(value);
			return;
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			yield_schd_sub_char3(value);
			return;
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			yield_act_sub_char1(value);
			return;
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			yield_act_sub_char2(value);
			return;
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			yield_act_sub_char3(value);
			return;
		}
		if ($stk_sub_char1.equalsIgnoreCase(name)) {
			stk_sub_char1(value);
			return;
		}
		if ($stk_sub_char2.equalsIgnoreCase(name)) {
			stk_sub_char2(value);
			return;
		}
		if ($stk_sub_char3.equalsIgnoreCase(name)) {
			stk_sub_char3(value);
			return;
		}
		if ($prnt_user_id.equalsIgnoreCase(name)) {
			prnt_user_id(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			client_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($cntnr_qty.equalsIgnoreCase(name)) {
			cntnr_qty(value);
			return;
		}
		if ($page_cnt.equalsIgnoreCase(name)) {
			page_cnt(value);
			return;
		}
		if ($page_sum.equalsIgnoreCase(name)) {
			page_sum(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($cntnr_qty.equalsIgnoreCase(name)) {
			cntnr_qty(value);
			return;
		}
		if ($page_cnt.equalsIgnoreCase(name)) {
			page_cnt(value);
			return;
		}
		if ($page_sum.equalsIgnoreCase(name)) {
			page_sum(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($cntnr_qty.equalsIgnoreCase(name)) {
			cntnr_qty(value);
			return;
		}
		if ($page_cnt.equalsIgnoreCase(name)) {
			page_cnt(value);
			return;
		}
		if ($page_sum.equalsIgnoreCase(name)) {
			page_sum(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($cntnr_qty.equalsIgnoreCase(name)) {
			cntnr_qty(value);
			return;
		}
		if ($page_cnt.equalsIgnoreCase(name)) {
			page_cnt(value);
			return;
		}
		if ($page_sum.equalsIgnoreCase(name)) {
			page_sum(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($cntnr_qty.equalsIgnoreCase(name)) {
			cntnr_qty(value);
			return;
		}
		if ($page_cnt.equalsIgnoreCase(name)) {
			page_cnt(value);
			return;
		}
		if ($page_sum.equalsIgnoreCase(name)) {
			page_sum(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($prnt_dt.equalsIgnoreCase(name)) {
			prnt_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cntnr_flg.equalsIgnoreCase(name)) {
			cntnr_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($dlv_slip_itm_cd.equalsIgnoreCase(name)) {
			dlv_slip_itm_cd(value);
			return;
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			lot_no_view(value);
			return;
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			lot_no_data(value);
			return;
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			sublot_no_view(value);
			return;
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			sublot_no_data(value);
			return;
		}
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			s_base_unit_qty(value);
			return;
		}
		if ($dlv_slip_itm_nm.equalsIgnoreCase(name)) {
			dlv_slip_itm_nm(value);
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
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			dlv_alt_nm1(value);
			return;
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			dlv_alt_nm2(value);
			return;
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			dlv_alt_nm3(value);
			return;
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			dlv_alt_nm4(value);
			return;
		}
		if ($s_dlv_inst_qty.equalsIgnoreCase(name)) {
			s_dlv_inst_qty(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($qr_cd.equalsIgnoreCase(name)) {
			qr_cd(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_no(value);
			return;
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_d_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			cst_alt_nm1(value);
			return;
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			cst_alt_nm2(value);
			return;
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			cst_alt_nm3(value);
			return;
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			cst_alt_nm4(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			dlv_id_alt_nm1(value);
			return;
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			dlv_id_alt_nm2(value);
			return;
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			dlv_id_alt_nm3(value);
			return;
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			dlv_id_alt_nm4(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			ver_no_lbl(value);
			return;
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			sno1_view(value);
			return;
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			sno1_data(value);
			return;
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			sno2_view(value);
			return;
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			sno2_data(value);
			return;
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			sno3_view(value);
			return;
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			sno3_data(value);
			return;
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			sno4_view(value);
			return;
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			sno4_data(value);
			return;
		}
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			sno1_lbl(value);
			return;
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			sno2_lbl(value);
			return;
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			sno3_lbl(value);
			return;
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			sno4_lbl(value);
			return;
		}
		if ($s_cntnr_qty.equalsIgnoreCase(name)) {
			s_cntnr_qty(value);
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
		if ($cntnr_unit_cd.equalsIgnoreCase(name)) {
			cntnr_unit_cd(value);
			return;
		}
		if ($cntnr_unit_nm.equalsIgnoreCase(name)) {
			cntnr_unit_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			arr_dpt_cd(value);
			return;
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			arr_dpt_nm(value);
			return;
		}
		if ($arr_usr_cd.equalsIgnoreCase(name)) {
			arr_usr_cd(value);
			return;
		}
		if ($arr_usr_nm.equalsIgnoreCase(name)) {
			arr_usr_nm(value);
			return;
		}
		if ($acpt_dpt_cd.equalsIgnoreCase(name)) {
			acpt_dpt_cd(value);
			return;
		}
		if ($acpt_dpt_nm.equalsIgnoreCase(name)) {
			acpt_dpt_nm(value);
			return;
		}
		if ($acpt_usr_cd.equalsIgnoreCase(name)) {
			acpt_usr_cd(value);
			return;
		}
		if ($acpt_usr_nm.equalsIgnoreCase(name)) {
			acpt_usr_nm(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			ship_act_d_sub_char1(value);
			return;
		}
		if ($ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			ship_act_d_sub_char2(value);
			return;
		}
		if ($ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			ship_act_d_sub_char3(value);
			return;
		}
		if ($ship_alloc_sts_sub_char1.equalsIgnoreCase(name)) {
			ship_alloc_sts_sub_char1(value);
			return;
		}
		if ($ship_alloc_sts_sub_char2.equalsIgnoreCase(name)) {
			ship_alloc_sts_sub_char2(value);
			return;
		}
		if ($ship_alloc_sts_sub_char3.equalsIgnoreCase(name)) {
			ship_alloc_sts_sub_char3(value);
			return;
		}
		if ($arr_act_sub_char1.equalsIgnoreCase(name)) {
			arr_act_sub_char1(value);
			return;
		}
		if ($arr_act_sub_char2.equalsIgnoreCase(name)) {
			arr_act_sub_char2(value);
			return;
		}
		if ($arr_act_sub_char3.equalsIgnoreCase(name)) {
			arr_act_sub_char3(value);
			return;
		}
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			yield_schd_sub_char1(value);
			return;
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			yield_schd_sub_char2(value);
			return;
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			yield_schd_sub_char3(value);
			return;
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			yield_act_sub_char1(value);
			return;
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			yield_act_sub_char2(value);
			return;
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			yield_act_sub_char3(value);
			return;
		}
		if ($stk_sub_char1.equalsIgnoreCase(name)) {
			stk_sub_char1(value);
			return;
		}
		if ($stk_sub_char2.equalsIgnoreCase(name)) {
			stk_sub_char2(value);
			return;
		}
		if ($stk_sub_char3.equalsIgnoreCase(name)) {
			stk_sub_char3(value);
			return;
		}
		if ($prnt_user_id.equalsIgnoreCase(name)) {
			prnt_user_id(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($client_typ.equalsIgnoreCase(name)) {
			client_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($cntnr_qty.equalsIgnoreCase(name)) {
			cntnr_qty(value);
			return;
		}
		if ($page_cnt.equalsIgnoreCase(name)) {
			page_cnt(value);
			return;
		}
		if ($page_sum.equalsIgnoreCase(name)) {
			page_sum(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($cntnr_qty.equalsIgnoreCase(name)) {
			cntnr_qty(value);
			return;
		}
		if ($page_cnt.equalsIgnoreCase(name)) {
			page_cnt(value);
			return;
		}
		if ($page_sum.equalsIgnoreCase(name)) {
			page_sum(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($cntnr_qty.equalsIgnoreCase(name)) {
			cntnr_qty(value);
			return;
		}
		if ($page_cnt.equalsIgnoreCase(name)) {
			page_cnt(value);
			return;
		}
		if ($page_sum.equalsIgnoreCase(name)) {
			page_sum(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($cntnr_qty.equalsIgnoreCase(name)) {
			cntnr_qty(value);
			return;
		}
		if ($page_cnt.equalsIgnoreCase(name)) {
			page_cnt(value);
			return;
		}
		if ($page_sum.equalsIgnoreCase(name)) {
			page_sum(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($cntnr_qty.equalsIgnoreCase(name)) {
			cntnr_qty(value);
			return;
		}
		if ($page_cnt.equalsIgnoreCase(name)) {
			page_cnt(value);
			return;
		}
		if ($page_sum.equalsIgnoreCase(name)) {
			page_sum(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($prnt_dt.equalsIgnoreCase(name)) {
			prnt_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cntnr_flg.equalsIgnoreCase(name)) {
			cntnr_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

