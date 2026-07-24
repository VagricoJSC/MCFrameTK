package mcframe.serverMSBB.MSBBL1360;

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
 * ブロック"Srch01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlR_MC_A extends MCConstRow {

	/**
	 * Simultaneous recording (Before change) 同時計上(変更前).<p>
	 *
	 */
	public static final String $org_sync_flg = "org_sync_flg";
	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public static final String $dlv_schd_dt = "dlv_schd_dt";
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
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public static final String $asset_mng_typ_nm = "asset_mng_typ_nm";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
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
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public static final String $dlv_zip_cd = "dlv_zip_cd";
	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public static final String $dlv_addr1 = "dlv_addr1";
	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public static final String $dlv_addr2 = "dlv_addr2";
	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public static final String $dlv_addr3 = "dlv_addr3";
	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public static final String $dlv_addr4 = "dlv_addr4";
	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public static final String $dlv_cntct_dpt = "dlv_cntct_dpt";
	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public static final String $dlv_cntct_psn = "dlv_cntct_psn";
	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public static final String $dlv_tel = "dlv_tel";
	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public static final String $dlv_fax = "dlv_fax";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Country name 国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public static final String $dest_nm1 = "dest_nm1";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public static final String $dest_nm2 = "dest_nm2";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public static final String $dest_nm3 = "dest_nm3";
	public static final String $dtl1 = "dtl1";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
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
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Sales scheduled qty. 売上予定数量.<p>
	 *
	 */
	public static final String $sls_schd_qty = "sls_schd_qty";
	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public static final String $sls_qty = "sls_qty";
	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public static final String $upri_not_tgt_flg = "upri_not_tgt_flg";
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public static final String $trd_cur_inc_tax_amt = "trd_cur_inc_tax_amt";
	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public static final String $tax_fix_flg = "tax_fix_flg";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public static final String $tax_typ = "tax_typ";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public static final String $dscnt_rsn_cd = "dscnt_rsn_cd";
	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public static final String $dscnt_rsn_nm = "dscnt_rsn_nm";
	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public static final String $cost_upri = "cost_upri";
	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public static final String $cost_amt = "cost_amt";
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public static final String $prof_rate = "prof_rate";
	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public static final String $base_cur_upri = "base_cur_upri";
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public static final String $base_cur_inc_tax_amt = "base_cur_inc_tax_amt";
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public static final String $base_cur_dscnt_amt = "base_cur_dscnt_amt";
	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public static final String $ptax_cur_upri = "ptax_cur_upri";
	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public static final String $ptax_cur_amt = "ptax_cur_amt";
	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public static final String $ptax_cur_inc_tax_amt = "ptax_cur_inc_tax_amt";
	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public static final String $ptax_cur_tax_amt = "ptax_cur_tax_amt";
	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public static final String $ptax_cur_dscnt_amt = "ptax_cur_dscnt_amt";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public static final String $sls_rsn_cd = "sls_rsn_cd";
	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public static final String $sls_rsn_nm = "sls_rsn_nm";
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
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public static final String $ext_sys_nm = "ext_sys_nm";
	/**
	 * External purchase result details No. 外部仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $ext_purc_act_d_no = "ext_purc_act_d_no";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_d_no = "sls_act_d_no";
	/**
	 * Purchase recording month 仕入計上年月.<p>
	 *
	 */
	public static final String $purc_ac_ym = "purc_ac_ym";
	/**
	 * Purchase recording date 仕入計上日.<p>
	 *
	 */
	public static final String $purc_ac_dt = "purc_ac_dt";
	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public static final String $purc_dt = "purc_dt";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
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
	 * For invoice transaction インボイス取引対象.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
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
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_no = "bp_dlv_slip_no";
	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_d_no = "bp_dlv_slip_d_no";
	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public static final String $crt_lot_flg = "crt_lot_flg";
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
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public static final String $ship_fr_valid_dt = "ship_fr_valid_dt";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public static final String $purc_cont_qty = "purc_cont_qty";
	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public static final String $purc_cont_fctr = "purc_cont_fctr";
	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public static final String $std_cont_qty = "std_cont_qty";
	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public static final String $cont_fctr_unit_cd = "cont_fctr_unit_cd";
	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public static final String $cont_fctr_unit_nm = "cont_fctr_unit_nm";
	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
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
	 * Purchase currency cd. 仕入通貨ＣＤ.<p>
	 *
	 */
	public static final String $purc_trd_cur_cd = "purc_trd_cur_cd";
	/**
	 * Purchase currency name 仕入通貨名.<p>
	 *
	 */
	public static final String $purc_trd_cur_nm = "purc_trd_cur_nm";
	/**
	 * Specify scheduled purchase rate 仕入予定レート指定.<p>
	 *
	 */
	public static final String $purc_xrate_inpt_flg = "purc_xrate_inpt_flg";
	/**
	 * Purchase exchange rate 仕入為替レート.<p>
	 *
	 */
	public static final String $purc_xrate = "purc_xrate";
	/**
	 * Purchase tax schedule rate specified 仕入納税予定レート指定.<p>
	 *
	 */
	public static final String $purc_ptax_xrate_inpt_flg = "purc_ptax_xrate_inpt_flg";
	/**
	 * Purchase tax exchange rate 仕入納税為替レート.<p>
	 *
	 */
	public static final String $purc_ptax_xrate = "purc_ptax_xrate";
	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public static final String $ptax_dt = "ptax_dt";
	/**
	 * Not for purchase unit price re-acquisition 仕入単価再取得対象外.<p>
	 *
	 */
	public static final String $purc_upri_not_tgt_flg = "purc_upri_not_tgt_flg";
	/**
	 * Purchase transaction currency unit price 仕入取引通貨単価.<p>
	 *
	 */
	public static final String $purc_trd_cur_upri = "purc_trd_cur_upri";
	/**
	 * Purchase temporary unit price 仕入仮単価.<p>
	 *
	 */
	public static final String $purc_interim_flg = "purc_interim_flg";
	/**
	 * Purchase transaction currency amount 仕入取引通貨金額.<p>
	 *
	 */
	public static final String $purc_trd_cur_amt = "purc_trd_cur_amt";
	/**
	 * Tax included purchase amount (Transaction currency) 仕入取引通貨税込金額.<p>
	 *
	 */
	public static final String $purc_trd_cur_inc_tax_amt = "purc_trd_cur_inc_tax_amt";
	/**
	 * Specify purchase tax 仕入税指定.<p>
	 *
	 */
	public static final String $purc_tax_fix_flg = "purc_tax_fix_flg";
	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public static final String $purc_tax_cd = "purc_tax_cd";
	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public static final String $purc_tax_nm = "purc_tax_nm";
	/**
	 * Purchase tax rate 仕入税率.<p>
	 *
	 */
	public static final String $purc_tax_rate = "purc_tax_rate";
	/**
	 * Purchase tax type 仕入税区分.<p>
	 *
	 */
	public static final String $purc_tax_typ = "purc_tax_typ";
	/**
	 * Purchase tax inclusive 仕入内税.<p>
	 *
	 */
	public static final String $purc_inc_tax_flg = "purc_inc_tax_flg";
	/**
	 * Purchase transaction currency tax amount 仕入取引通貨税額.<p>
	 *
	 */
	public static final String $purc_trd_cur_tax_amt = "purc_trd_cur_tax_amt";
	/**
	 * Purchase transaction currency discount amount 仕入取引通貨値引額.<p>
	 *
	 */
	public static final String $purc_trd_cur_dscnt_amt = "purc_trd_cur_dscnt_amt";
	/**
	 * Purchase discount reason cd. 仕入値引理由ＣＤ.<p>
	 *
	 */
	public static final String $purc_dscnt_rsn_cd = "purc_dscnt_rsn_cd";
	/**
	 * Purchase discount reason name 仕入値引理由名.<p>
	 *
	 */
	public static final String $purc_dscnt_rsn_nm = "purc_dscnt_rsn_nm";
	/**
	 * Purchase unit price (Base currency) 仕入基準通貨単価.<p>
	 *
	 */
	public static final String $purc_base_cur_upri = "purc_base_cur_upri";
	/**
	 * Purchase amount (Base currency) 仕入基準通貨金額.<p>
	 *
	 */
	public static final String $purc_base_cur_amt = "purc_base_cur_amt";
	/**
	 * Tax included purchase amount (Base currency) 仕入基準通貨税込金額.<p>
	 *
	 */
	public static final String $purc_base_cur_inc_tax_amt = "purc_base_cur_inc_tax_amt";
	/**
	 * Purchase tax amount (Base currency) 仕入基準通貨税額.<p>
	 *
	 */
	public static final String $purc_base_cur_tax_amt = "purc_base_cur_tax_amt";
	/**
	 * Purchase discount amount (Base currency) 仕入基準通貨値引額.<p>
	 *
	 */
	public static final String $purc_base_cur_dscnt_amt = "purc_base_cur_dscnt_amt";
	/**
	 * Purchase unit price (Tax currency) 仕入納税通貨単価.<p>
	 *
	 */
	public static final String $purc_ptax_cur_upri = "purc_ptax_cur_upri";
	/**
	 * Purchase amount (Tax currency) 仕入納税通貨金額.<p>
	 *
	 */
	public static final String $purc_ptax_cur_amt = "purc_ptax_cur_amt";
	/**
	 * Tax included purchase amount (Tax currency) 仕入納税通貨税込金額.<p>
	 *
	 */
	public static final String $purc_ptax_cur_inc_tax_amt = "purc_ptax_cur_inc_tax_amt";
	/**
	 * Purchase tax amount (Tax currency) 仕入納税通貨税額.<p>
	 *
	 */
	public static final String $purc_ptax_cur_tax_amt = "purc_ptax_cur_tax_amt";
	/**
	 * Purchase discount amount (Tax currency) 仕入納税通貨値引額.<p>
	 *
	 */
	public static final String $purc_ptax_cur_dscnt_amt = "purc_ptax_cur_dscnt_amt";
	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public static final String $purc_rsn_cd = "purc_rsn_cd";
	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public static final String $purc_rsn_nm = "purc_rsn_nm";
	/**
	 * Purchase charged dept. cd. 仕入負担部門ＣＤ.<p>
	 *
	 */
	public static final String $purc_bd_dpt_cd = "purc_bd_dpt_cd";
	/**
	 * Purchase charged dept. name 仕入負担部門名.<p>
	 *
	 */
	public static final String $purc_bd_dpt_nm = "purc_bd_dpt_nm";
	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public static final String $purc_wtax_rate = "purc_wtax_rate";
	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public static final String $purc_wtax_amt = "purc_wtax_amt";
	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public static final String $purc_qty = "purc_qty";
	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public static final String $base_unit_purc_schd_qty = "base_unit_purc_schd_qty";
	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public static final String $po_print_rmrks = "po_print_rmrks";
	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public static final String $po_print_d_rmrks = "po_print_d_rmrks";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public static final String $lot_no_typ = "lot_no_typ";
	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public static final String $sublot_no_typ = "sublot_no_typ";
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
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $itm_bill_crryovr_times = "itm_bill_crryovr_times";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Version control 版管理.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public static final String $sls_acxfr_flg = "sls_acxfr_flg";
	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_no = "sls_act_no";
	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public static final String $sls_act_seq = "sls_act_seq";
	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public static final String $sls_act_d_seq = "sls_act_d_seq";
	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public static final String $sls_schd_no = "sls_schd_no";
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public static final String $dtl_row_id = "dtl_row_id";
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	public static final String $outsrc_flg = "outsrc_flg";
	/**
	 * Set lot to be received 入荷予定ロット指定.<p>
	 *
	 */
	public static final String $arr_schd_lot_fix_flg = "arr_schd_lot_fix_flg";
	/**
	 * For market release decision 市場出荷判定対象.<p>
	 *
	 */
	public static final String $mrkt_judg_flg = "mrkt_judg_flg";
	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public static final String $init_schd_qty = "init_schd_qty";
	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public static final String $init_schd_dscnt_amt = "init_schd_dscnt_amt";
	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public static final String $arr_pr_upd_cntr = "arr_pr_upd_cntr";
	/**
	 * Update counter (Shipping progress) 更新カウンタ(出荷進捗).<p>
	 *
	 */
	public static final String $ship_pr_upd_cntr = "ship_pr_upd_cntr";
	/**
	 * Initial sales cd. 当初売上税ＣＤ.<p>
	 *
	 */
	public static final String $schd_tax_cd = "schd_tax_cd";
	/**
	 * Initial scheduled amount 当初予定金額.<p>
	 *
	 */
	public static final String $init_schd_amt = "init_schd_amt";
	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public static final String $schd_trd_unit_conv_base_qty = "schd_trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public static final String $schd_trd_unit_conv_qty = "schd_trd_unit_conv_qty";
	public static final String $hdr = "hdr";
	/**
	 * Initial purchase tax cd. 当初仕入税ＣＤ.<p>
	 *
	 */
	public static final String $purc_schd_tax_cd = "purc_schd_tax_cd";
	/**
	 * Initial purchase tax rate 当初仕入税率.<p>
	 *
	 */
	public static final String $purc_schd_tax_rate = "purc_schd_tax_rate";
	/**
	 * Initial purchase tax inclusive 当初仕入内税.<p>
	 *
	 */
	public static final String $purc_schd_inc_tax_flg = "purc_schd_inc_tax_flg";
	/**
	 * Purchase transaction unit cd. 仕入取引単位ＣＤ.<p>
	 *
	 */
	public static final String $purc_trd_unit_cd = "purc_trd_unit_cd";
	/**
	 * Initial purchase scheduled qty. (Transaction unit) 当初仕入予定数量（取引単位）.<p>
	 *
	 */
	public static final String $purc_trd_unit_qty = "purc_trd_unit_qty";
	/**
	 * Initial purchase scheduled qty. (Base unit) 当初仕入予定数量（基準単位）.<p>
	 *
	 */
	public static final String $purc_schd_init_qty = "purc_schd_init_qty";
	/**
	 * Initial purchase scheduled discount amount 当初仕入予定値引額.<p>
	 *
	 */
	public static final String $purc_schd_init_dscnt_amt = "purc_schd_init_dscnt_amt";
	/**
	 * Initial purchase scheduled amount 当初仕入予定金額.<p>
	 *
	 */
	public static final String $purc_schd_init_amt = "purc_schd_init_amt";
	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	/**
	 * Purchase unit price rounding type 仕入単価端数処理区分.<p>
	 *
	 */
	public static final String $purc_upri_rnd_typ = "purc_upri_rnd_typ";
	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 * Purchase transaction currency amount number of decimal places 仕入取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $purc_trd_cur_amt_dec_place = "purc_trd_cur_amt_dec_place";
	/**
	 * Purchase transaction currency unit price number of decimal places 仕入取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public static final String $purc_trd_cur_upri_dec_place = "purc_trd_cur_upri_dec_place";
	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public static final String $purc_s_trd_unit_conv_base_qty = "purc_s_trd_unit_conv_base_qty";
	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public static final String $purc_s_trd_unit_conv_qty = "purc_s_trd_unit_conv_qty";
	/**
	 * Tax cd. (Latest/sales) 税ＣＤ（最新・売上）.<p>
	 *
	 */
	public static final String $new_tax_cd = "new_tax_cd";
	/**
	 * Tax name (Latest/sales) 税名（最新・売上）.<p>
	 *
	 */
	public static final String $new_tax_nm = "new_tax_nm";
	/**
	 * Tax rate (Latest/sales) 税率（最新・売上）.<p>
	 *
	 */
	public static final String $new_tax_rate = "new_tax_rate";
	/**
	 * Tax type (Latest/sales) 税区分（最新・売上）.<p>
	 *
	 */
	public static final String $new_tax_typ = "new_tax_typ";
	/**
	 * Tax inclusive (Latest/sales) 内税（最新・売上）.<p>
	 *
	 */
	public static final String $new_inc_tax_flg = "new_inc_tax_flg";
	/**
	 * Purchase tax cd. (Latest/purchase) 仕入税ＣＤ（最新・仕入）.<p>
	 *
	 */
	public static final String $new_purc_tax_cd = "new_purc_tax_cd";
	/**
	 * Purchase tax name (Latest/purchase) 仕入税名（最新・仕入）.<p>
	 *
	 */
	public static final String $new_purc_tax_nm = "new_purc_tax_nm";
	/**
	 * Purchase tax rate (Latest/purchase) 仕入税率（最新・仕入）.<p>
	 *
	 */
	public static final String $new_purc_tax_rate = "new_purc_tax_rate";
	/**
	 * Purchase tax type (Latest/purchase) 仕入税区分（最新・仕入）.<p>
	 *
	 */
	public static final String $new_purc_tax_typ = "new_purc_tax_typ";
	/**
	 * Purchase tax inclusive (Latest/purchase) 仕入内税（最新・仕入）.<p>
	 *
	 */
	public static final String $new_purc_inc_tax_flg = "new_purc_inc_tax_flg";
	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public static final String $sls_dtl_upd_flg = "sls_dtl_upd_flg";
	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public static final String $init_trd_cur_tax_amt = "init_trd_cur_tax_amt";
	/**
	 * Initial transaction unit cd. 当初取引単位ＣＤ.<p>
	 *
	 */
	public static final String $init_trd_unit_cd = "init_trd_unit_cd";
	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public static final String $init_trd_unit_qty = "init_trd_unit_qty";
	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public static final String $init_trd_cur_upri = "init_trd_cur_upri";
	/**
	 * Initial tax inclusive 当初内税.<p>
	 *
	 */
	public static final String $init_inc_tax_flg = "init_inc_tax_flg";
	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public static final String $init_tax_rate = "init_tax_rate";
	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public static final String $init_trd_cur_dscnt_amt = "init_trd_cur_dscnt_amt";
	/**
	 * Purchase details correction 仕入明細訂正.<p>
	 *
	 */
	public static final String $purc_dtl_upd_flg = "purc_dtl_upd_flg";
	/**
	 * Initial purchase transaction currency tax amount 仕入当初取引通貨税額.<p>
	 *
	 */
	public static final String $purc_init_trd_cur_tax_amt = "purc_init_trd_cur_tax_amt";
	/**
	 * Initial purchase transaction unit cd. 仕入当初取引単位ＣＤ.<p>
	 *
	 */
	public static final String $purc_init_trd_unit_cd = "purc_init_trd_unit_cd";
	/**
	 * Initial purchase transaction unit qty. 仕入当初取引単位数量.<p>
	 *
	 */
	public static final String $purc_init_trd_unit_qty = "purc_init_trd_unit_qty";
	/**
	 * Initial purchase transaction currency unit price 仕入当初取引通貨単価.<p>
	 *
	 */
	public static final String $purc_init_trd_cur_upri = "purc_init_trd_cur_upri";
	/**
	 * Initial purchase tax inclusive 仕入当初内税.<p>
	 *
	 */
	public static final String $purc_init_inc_tax_flg = "purc_init_inc_tax_flg";
	/**
	 * Initial purchase tax rate 仕入当初税率.<p>
	 *
	 */
	public static final String $purc_init_tax_rate = "purc_init_tax_rate";
	/**
	 * Initial purchase transaction currency discount amount 仕入当初取引通貨値引額.<p>
	 *
	 */
	public static final String $purc_init_trd_cur_dscnt_amt = "purc_init_trd_cur_dscnt_amt";
	public static final String $purc_schd_init_ex_amt = "purc_schd_init_ex_amt";
	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty_bef = "base_unit_qty_bef";
	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public static final String $base_unit_purc_qty = "base_unit_purc_qty";

	public static final String $peg_no = $dtl1 + ".peg_no";
	public static final String $trd_unit_cd = $dtl1 + ".trd_unit_cd";
	public static final String $trd_unit_qty = $dtl1 + ".trd_unit_qty";
	public static final String $trd_unit_conv_base_qty = $dtl1 + ".trd_unit_conv_base_qty";
	public static final String $trd_unit_conv_qty = $dtl1 + ".trd_unit_conv_qty";
	public static final String $schd_unit_cd = $hdr + ".trd_unit_cd";
	public static final String $schd_qty = $hdr + ".trd_unit_qty";
	public static final String $schd_upri = $hdr + ".trd_cur_upri";
	public static final String $schd_dscnt_amt = $hdr + ".trd_cur_dscnt_amt";
	public static final String $schd_amt = $hdr + ".trd_cur_amt";
	public static final String $schd_tax_amt = $hdr + ".trd_cur_tax_amt";
	public static final String $schd_inc_tax_amt = $hdr + ".trd_cur_inc_tax_amt";
	public static final String $schd_dec_place = $hdr + ".base_unit_dec_place";
	public static final String $schd_rnd_typ = $hdr + ".base_unit_rnd_typ";
	public static final String $schd_conv_qty = $hdr + ".trd_unit_conv_qty";
	public static final String $schd_conv_base_qty = $hdr + ".trd_unit_conv_base_qty";
	public static final String $schd_tax_rate = $hdr + ".tax_rate";
	public static final String $schd_inc_tax_flg = $hdr + ".inc_tax_flg";
	public static final String $schd_cur_cd = $hdr + ".trd_cur_cd";
	public static final String $schd_amt_dec_place = $hdr + ".amt_dec_place";
	public static final String $schd_upri_dec_place = $hdr + ".upri_dec_place";
	public static final String $schd_amt_rnd_typ = $hdr + ".amt_rnd_typ";
	public static final String $schd_tax_rnd_typ = $hdr + ".tax_rnd_typ";

	public static final MCMeta org_sync_flg_META = createCommonMeta($org_sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_schd_dt_META = createCommonMeta($dlv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dtl1_META = createInnerRowMeta($dtl1, mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_schd_qty_META = createCommonMeta($sls_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_qty_META = createCommonMeta($sls_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta upri_not_tgt_flg_META = createCommonMeta($upri_not_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_inc_tax_amt_META = createCommonMeta($trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_fix_flg_META = createCommonMeta($tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta dscnt_rsn_nm_META = createCommonMeta($dscnt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta cost_upri_META = createCommonMeta($cost_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cost_amt_META = createCommonMeta($cost_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prof_rate_META = createCommonMeta($prof_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta base_cur_upri_META = createCommonMeta($base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_inc_tax_amt_META = createCommonMeta($base_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_dscnt_amt_META = createCommonMeta($base_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_upri_META = createCommonMeta($ptax_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_amt_META = createCommonMeta($ptax_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_inc_tax_amt_META = createCommonMeta($ptax_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_tax_amt_META = createCommonMeta($ptax_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_dscnt_amt_META = createCommonMeta($ptax_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta sls_rsn_cd_META = createCommonMeta($sls_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta sls_rsn_nm_META = createCommonMeta($sls_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_purc_act_d_no_META = createCommonMeta($ext_purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SLS_ACT_D_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR3);
	public static final MCMeta sls_act_d_no_META = createCommonMeta($sls_act_d_no, mcframe.commonMA.meta.MA_META.SLS_ACT_D_NO);
	public static final MCMeta purc_ac_ym_META = createCommonMeta($purc_ac_ym, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_ac_dt_META = createCommonMeta($purc_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_dt_META = createCommonMeta($purc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_dlv_slip_no_META = createCommonMeta($bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_NO);
	public static final MCMeta bp_dlv_slip_d_no_META = createCommonMeta($bp_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_D_NO);
	public static final MCMeta crt_lot_flg_META = createCommonMeta($crt_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta ship_fr_valid_dt_META = createCommonMeta($ship_fr_valid_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta purc_cont_qty_META = createCommonMeta($purc_cont_qty, mcframe.commonMA.meta.MA_META.PURC_CONT_QTY);
	public static final MCMeta purc_cont_fctr_META = createCommonMeta($purc_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta std_cont_qty_META = createCommonMeta($std_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta purc_trd_cur_cd_META = createCommonMeta($purc_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta purc_trd_cur_nm_META = createCommonMeta($purc_trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta purc_xrate_inpt_flg_META = createCommonMeta($purc_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_xrate_META = createCommonMeta($purc_xrate, mcframe.commonMA.meta.MA_META.XRATE);
	public static final MCMeta purc_ptax_xrate_inpt_flg_META = createCommonMeta($purc_ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ptax_xrate_META = createCommonMeta($purc_ptax_xrate, mcframe.commonMA.meta.MA_META.XRATE);
	public static final MCMeta ptax_dt_META = createCommonMeta($ptax_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_upri_not_tgt_flg_META = createCommonMeta($purc_upri_not_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_trd_cur_upri_META = createCommonMeta($purc_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_interim_flg_META = createCommonMeta($purc_interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_trd_cur_amt_META = createCommonMeta($purc_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_trd_cur_inc_tax_amt_META = createCommonMeta($purc_trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_tax_fix_flg_META = createCommonMeta($purc_tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_tax_cd_META = createCommonMeta($purc_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta purc_tax_nm_META = createCommonMeta($purc_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta purc_tax_rate_META = createCommonMeta($purc_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta purc_tax_typ_META = createCommonMeta($purc_tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta purc_inc_tax_flg_META = createCommonMeta($purc_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_trd_cur_tax_amt_META = createCommonMeta($purc_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_trd_cur_dscnt_amt_META = createCommonMeta($purc_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_dscnt_rsn_cd_META = createCommonMeta($purc_dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta purc_dscnt_rsn_nm_META = createCommonMeta($purc_dscnt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta purc_base_cur_upri_META = createCommonMeta($purc_base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_base_cur_amt_META = createCommonMeta($purc_base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_base_cur_inc_tax_amt_META = createCommonMeta($purc_base_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_base_cur_tax_amt_META = createCommonMeta($purc_base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_base_cur_dscnt_amt_META = createCommonMeta($purc_base_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_ptax_cur_upri_META = createCommonMeta($purc_ptax_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_ptax_cur_amt_META = createCommonMeta($purc_ptax_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_ptax_cur_inc_tax_amt_META = createCommonMeta($purc_ptax_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_ptax_cur_tax_amt_META = createCommonMeta($purc_ptax_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_ptax_cur_dscnt_amt_META = createCommonMeta($purc_ptax_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_rsn_cd_META = createCommonMeta($purc_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta purc_rsn_nm_META = createCommonMeta($purc_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta purc_bd_dpt_cd_META = createCommonMeta($purc_bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_bd_dpt_nm_META = createCommonMeta($purc_bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta purc_wtax_rate_META = createCommonMeta($purc_wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta purc_wtax_amt_META = createCommonMeta($purc_wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_qty_META = createCommonMeta($purc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_purc_schd_qty_META = createCommonMeta($base_unit_purc_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta po_print_rmrks_META = createCommonMeta($po_print_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_RMRKS);
	public static final MCMeta po_print_d_rmrks_META = createCommonMeta($po_print_d_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_D_RMRKS);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_bill_crryovr_times_META = createCommonMeta($itm_bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_acxfr_flg_META = createCommonMeta($sls_acxfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_act_no_META = createCommonMeta($sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta sls_act_seq_META = createCommonMeta($sls_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta sls_act_d_seq_META = createCommonMeta($sls_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta sls_schd_no_META = createCommonMeta($sls_schd_no, mcframe.commonMA.meta.MA_META.SLS_SCHD_NO);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta dtl_row_id_META = createCommonMeta($dtl_row_id, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_schd_lot_fix_flg_META = createCommonMeta($arr_schd_lot_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_flg_META = createCommonMeta($mrkt_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta init_schd_qty_META = createCommonMeta($init_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta init_schd_dscnt_amt_META = createCommonMeta($init_schd_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta arr_pr_upd_cntr_META = createCommonMeta($arr_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta ship_pr_upd_cntr_META = createCommonMeta($ship_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta schd_tax_cd_META = createCommonMeta($schd_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta init_schd_amt_META = createCommonMeta($init_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_unit_conv_base_qty_META = createCommonMeta($schd_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_trd_unit_conv_qty_META = createCommonMeta($schd_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta hdr_META = createInnerRowMeta($hdr, mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.class);
	public static final MCMeta purc_schd_tax_cd_META = createCommonMeta($purc_schd_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta purc_schd_tax_rate_META = createCommonMeta($purc_schd_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta purc_schd_inc_tax_flg_META = createCommonMeta($purc_schd_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_trd_unit_cd_META = createCommonMeta($purc_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta purc_trd_unit_qty_META = createCommonMeta($purc_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_schd_init_qty_META = createCommonMeta($purc_schd_init_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_schd_init_dscnt_amt_META = createCommonMeta($purc_schd_init_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_schd_init_amt_META = createCommonMeta($purc_schd_init_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_upri_rnd_typ_META = createCommonMeta($purc_upri_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_trd_cur_amt_dec_place_META = createCommonMeta($purc_trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta purc_trd_cur_upri_dec_place_META = createCommonMeta($purc_trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta purc_s_trd_unit_conv_base_qty_META = createCommonMeta($purc_s_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_s_trd_unit_conv_qty_META = createCommonMeta($purc_s_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta new_tax_cd_META = createCommonMeta($new_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta new_tax_nm_META = createCommonMeta($new_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta new_tax_rate_META = createCommonMeta($new_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta new_tax_typ_META = createCommonMeta($new_tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta new_inc_tax_flg_META = createCommonMeta($new_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta new_purc_tax_cd_META = createCommonMeta($new_purc_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta new_purc_tax_nm_META = createCommonMeta($new_purc_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta new_purc_tax_rate_META = createCommonMeta($new_purc_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta new_purc_tax_typ_META = createCommonMeta($new_purc_tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta new_purc_inc_tax_flg_META = createCommonMeta($new_purc_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dtl_upd_flg_META = createCommonMeta($sls_dtl_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta init_trd_cur_tax_amt_META = createCommonMeta($init_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta init_trd_unit_cd_META = createCommonMeta($init_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta init_trd_unit_qty_META = createCommonMeta($init_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta init_trd_cur_upri_META = createCommonMeta($init_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta init_inc_tax_flg_META = createCommonMeta($init_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta init_tax_rate_META = createCommonMeta($init_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta init_trd_cur_dscnt_amt_META = createCommonMeta($init_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_dtl_upd_flg_META = createCommonMeta($purc_dtl_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_init_trd_cur_tax_amt_META = createCommonMeta($purc_init_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_init_trd_unit_cd_META = createCommonMeta($purc_init_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta purc_init_trd_unit_qty_META = createCommonMeta($purc_init_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_init_trd_cur_upri_META = createCommonMeta($purc_init_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_init_inc_tax_flg_META = createCommonMeta($purc_init_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_init_tax_rate_META = createCommonMeta($purc_init_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta purc_init_trd_cur_dscnt_amt_META = createCommonMeta($purc_init_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_schd_init_ex_amt_META = createCommonMeta($purc_schd_init_ex_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_unit_qty_bef_META = createCommonMeta($base_unit_qty_bef, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_purc_qty_META = createCommonMeta($base_unit_purc_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<Srch01_DtlR> constMetas = new ConstMetaList<Srch01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			org_sync_flg_META,
			sync_flg_META,
			abort_flg_META,
			dlv_schd_dt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			sundry_itm_flg_META,
			dlv_cd_META,
			dlv_nm_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_tel_META,
			dlv_fax_META,
			cntry_cd_META,
			cntry_nm_META,
			pri_prnt_flg_META,
			dlv_sundry_flg_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			dtl1_META,
			trd_unit_nm_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_qty_META,
			sls_schd_qty_META,
			sls_qty_META,
			upri_not_tgt_flg_META,
			trd_cur_upri_META,
			interim_flg_META,
			trd_cur_amt_META,
			trd_cur_inc_tax_amt_META,
			tax_fix_flg_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			tax_typ_META,
			inc_tax_flg_META,
			trd_cur_tax_amt_META,
			trd_cur_dscnt_amt_META,
			dscnt_rsn_cd_META,
			dscnt_rsn_nm_META,
			cost_upri_META,
			cost_amt_META,
			prof_rate_META,
			base_cur_upri_META,
			base_cur_amt_META,
			base_cur_inc_tax_amt_META,
			base_cur_tax_amt_META,
			base_cur_dscnt_amt_META,
			ptax_cur_upri_META,
			ptax_cur_amt_META,
			ptax_cur_inc_tax_amt_META,
			ptax_cur_tax_amt_META,
			ptax_cur_dscnt_amt_META,
			bill_crryovr_times_META,
			gd_cd_META,
			gd_nm_META,
			cst_po_d_no_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			sls_rsn_cd_META,
			sls_rsn_nm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			wtax_rate_META,
			wtax_amt_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_purc_act_d_no_META,
			trd_d_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sls_act_d_no_META,
			purc_ac_ym_META,
			purc_ac_dt_META,
			purc_dt_META,
			purc_act_no_META,
			purc_act_d_no_META,
			po_no_META,
			po_d_no_META,
			sppl_cd_META,
			sppl_nm_META,
			sppl_iv_flg_META,
			subcon_flg_META,
			maker_cd_META,
			maker_nm_META,
			bp_dlv_slip_no_META,
			bp_dlv_slip_d_no_META,
			crt_lot_flg_META,
			lot_no_META,
			sublot_no_META,
			bp_lot_no_META,
			ship_fr_valid_dt_META,
			ver_no_META,
			purc_cont_qty_META,
			purc_cont_fctr_META,
			std_cont_qty_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
			std_cont_fctr_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			purc_trd_cur_cd_META,
			purc_trd_cur_nm_META,
			purc_xrate_inpt_flg_META,
			purc_xrate_META,
			purc_ptax_xrate_inpt_flg_META,
			purc_ptax_xrate_META,
			ptax_dt_META,
			purc_upri_not_tgt_flg_META,
			purc_trd_cur_upri_META,
			purc_interim_flg_META,
			purc_trd_cur_amt_META,
			purc_trd_cur_inc_tax_amt_META,
			purc_tax_fix_flg_META,
			purc_tax_cd_META,
			purc_tax_nm_META,
			purc_tax_rate_META,
			purc_tax_typ_META,
			purc_inc_tax_flg_META,
			purc_trd_cur_tax_amt_META,
			purc_trd_cur_dscnt_amt_META,
			purc_dscnt_rsn_cd_META,
			purc_dscnt_rsn_nm_META,
			purc_base_cur_upri_META,
			purc_base_cur_amt_META,
			purc_base_cur_inc_tax_amt_META,
			purc_base_cur_tax_amt_META,
			purc_base_cur_dscnt_amt_META,
			purc_ptax_cur_upri_META,
			purc_ptax_cur_amt_META,
			purc_ptax_cur_inc_tax_amt_META,
			purc_ptax_cur_tax_amt_META,
			purc_ptax_cur_dscnt_amt_META,
			purc_rsn_cd_META,
			purc_rsn_nm_META,
			purc_bd_dpt_cd_META,
			purc_bd_dpt_nm_META,
			purc_wtax_rate_META,
			purc_wtax_amt_META,
			purc_qty_META,
			base_unit_purc_schd_qty_META,
			po_print_rmrks_META,
			po_print_d_rmrks_META,
			slo_d_no_META,
			disp_seq_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			lot_no_typ_META,
			sublot_no_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			stk_mng_typ_META,
			dscnt_itm_flg_META,
			itm_bill_crryovr_times_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			cont_fctr_flg_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			ver_flg_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			sls_acxfr_flg_META,
			xpns_purc_flg_META,
			sls_act_no_META,
			sls_act_seq_META,
			sls_act_d_seq_META,
			sls_schd_no_META,
			purc_schd_no_META,
			dtl_row_id_META,
			arr_pr_no_META,
			ship_pr_no_META,
			outsrc_flg_META,
			arr_schd_lot_fix_flg_META,
			mrkt_judg_flg_META,
			init_schd_qty_META,
			init_schd_dscnt_amt_META,
			arr_pr_upd_cntr_META,
			ship_pr_upd_cntr_META,
			schd_tax_cd_META,
			init_schd_amt_META,
			schd_trd_unit_conv_base_qty_META,
			schd_trd_unit_conv_qty_META,
			hdr_META,
			purc_schd_tax_cd_META,
			purc_schd_tax_rate_META,
			purc_schd_inc_tax_flg_META,
			purc_trd_unit_cd_META,
			purc_trd_unit_qty_META,
			purc_schd_init_qty_META,
			purc_schd_init_dscnt_amt_META,
			purc_schd_init_amt_META,
			purc_amt_rnd_typ_META,
			purc_upri_rnd_typ_META,
			purc_tax_rnd_typ_META,
			purc_trd_cur_amt_dec_place_META,
			purc_trd_cur_upri_dec_place_META,
			purc_s_trd_unit_conv_base_qty_META,
			purc_s_trd_unit_conv_qty_META,
			new_tax_cd_META,
			new_tax_nm_META,
			new_tax_rate_META,
			new_tax_typ_META,
			new_inc_tax_flg_META,
			new_purc_tax_cd_META,
			new_purc_tax_nm_META,
			new_purc_tax_rate_META,
			new_purc_tax_typ_META,
			new_purc_inc_tax_flg_META,
			sls_dtl_upd_flg_META,
			init_trd_cur_tax_amt_META,
			init_trd_unit_cd_META,
			init_trd_unit_qty_META,
			init_trd_cur_upri_META,
			init_inc_tax_flg_META,
			init_tax_rate_META,
			init_trd_cur_dscnt_amt_META,
			purc_dtl_upd_flg_META,
			purc_init_trd_cur_tax_amt_META,
			purc_init_trd_unit_cd_META,
			purc_init_trd_unit_qty_META,
			purc_init_trd_cur_upri_META,
			purc_init_inc_tax_flg_META,
			purc_init_tax_rate_META,
			purc_init_trd_cur_dscnt_amt_META,
			purc_schd_init_ex_amt_META,
			base_unit_qty_bef_META,
			base_unit_purc_qty_META
		},
		new String[][]{
			{
				"peg_no",
				"trd_unit_cd",
				"trd_unit_qty",
				"trd_unit_conv_base_qty",
				"trd_unit_conv_qty",
				"schd_unit_cd",
				"schd_qty",
				"schd_upri",
				"schd_dscnt_amt",
				"schd_amt",
				"schd_tax_amt",
				"schd_inc_tax_amt",
				"schd_dec_place",
				"schd_rnd_typ",
				"schd_conv_qty",
				"schd_conv_base_qty",
				"schd_tax_rate",
				"schd_inc_tax_flg",
				"schd_cur_cd",
				"schd_amt_dec_place",
				"schd_upri_dec_place",
				"schd_amt_rnd_typ",
				"schd_tax_rnd_typ"
			},
			{
				$peg_no,
				$trd_unit_cd,
				$trd_unit_qty,
				$trd_unit_conv_base_qty,
				$trd_unit_conv_qty,
				$schd_unit_cd,
				$schd_qty,
				$schd_upri,
				$schd_dscnt_amt,
				$schd_amt,
				$schd_tax_amt,
				$schd_inc_tax_amt,
				$schd_dec_place,
				$schd_rnd_typ,
				$schd_conv_qty,
				$schd_conv_base_qty,
				$schd_tax_rate,
				$schd_inc_tax_flg,
				$schd_cur_cd,
				$schd_amt_dec_place,
				$schd_upri_dec_place,
				$schd_amt_rnd_typ,
				$schd_tax_rnd_typ
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
				{$asset_mng_typ, "MAC_ASSET_MNG_TYP"}	// asset_mng_typ
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
	protected Srch01_DtlR_MC_A(ConstMetaList<? extends Srch01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR clone() {
		return (Srch01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR createInstance() {
		return (Srch01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR getValues(String... names) {
		return (Srch01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Simultaneous recording (Before change) 同時計上(変更前).<p>
	 *
	 */
	public boolean org_sync_flg() {
		return getConstBoolean(offset + 0, $org_sync_flg);
	}

	/**
	 * Simultaneous recording (Before change) 同時計上(変更前).<p>
	 *
	 */
	public void org_sync_flg(boolean value) {
		setConstBoolean(offset + 0, $org_sync_flg, value);
	}


	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 1, $sync_flg);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 1, $sync_flg, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 2, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 2, $abort_flg, value);
	}


	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public MCDate dlv_schd_dt() {
		return getConstDate(offset + 3, $dlv_schd_dt);
	}

	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public void dlv_schd_dt(MCDate value) {
		setConstDate(offset + 3, $dlv_schd_dt, value);
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
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 9, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 9, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 10, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 10, $asset_mng_typ_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 11, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 11, $sundry_itm_flg, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 12, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 12, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 13, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 13, $dlv_nm, value);
	}


	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 14, $dlv_zip_cd);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 14, $dlv_zip_cd, value);
	}


	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 15, $dlv_addr1);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 15, $dlv_addr1, value);
	}


	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 16, $dlv_addr2);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 16, $dlv_addr2, value);
	}


	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 17, $dlv_addr3);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 17, $dlv_addr3, value);
	}


	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 18, $dlv_addr4);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 18, $dlv_addr4, value);
	}


	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 19, $dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 19, $dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 20, $dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 20, $dlv_cntct_psn, value);
	}


	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 21, $dlv_tel);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 21, $dlv_tel, value);
	}


	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 22, $dlv_fax);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 22, $dlv_fax, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 23, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 23, $cntry_cd, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 24, $cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 24, $cntry_nm, value);
	}


	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 25, $pri_prnt_flg);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 25, $pri_prnt_flg, value);
	}


	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 26, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 26, $dlv_sundry_flg, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 27, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 27, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 28, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 28, $dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 29, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 29, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 30, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 30, $dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 31, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 31, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 32, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 32, $dest_nm3, value);
	}


	public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R dtl1(){
		return (mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R) getConstInnerRow(offset + 33, $dtl1);
	}
	
	public void dtl1(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R row){
		setConstInnerRow(offset + 33, $dtl1, row);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 34, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 34, $trd_unit_nm, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 35, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 35, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 36, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 36, $base_unit_nm, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 37, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 37, $base_unit_qty, value);
	}


	/**
	 * Sales scheduled qty. 売上予定数量.<p>
	 *
	 */
	public MCNumber sls_schd_qty() {
		return getConstNumber(offset + 38, $sls_schd_qty);
	}

	/**
	 * Sales scheduled qty. 売上予定数量.<p>
	 *
	 */
	public void sls_schd_qty(MCNumber value) {
		setConstNumber(offset + 38, $sls_schd_qty, value);
	}

	/**
	 * Sales scheduled qty. 売上予定数量.<p>
	 *
	 */
	public void sls_schd_qty(int value) {
		setConstNumber(offset + 38, $sls_schd_qty, value);
	}

	/**
	 * Sales scheduled qty. 売上予定数量.<p>
	 *
	 */
	public void sls_schd_qty(long value) {
		setConstNumber(offset + 38, $sls_schd_qty, value);
	}

	/**
	 * Sales scheduled qty. 売上予定数量.<p>
	 *
	 */
	public void sls_schd_qty(float value) {
		setConstNumber(offset + 38, $sls_schd_qty, value);
	}

	/**
	 * Sales scheduled qty. 売上予定数量.<p>
	 *
	 */
	public void sls_schd_qty(double value) {
		setConstNumber(offset + 38, $sls_schd_qty, value);
	}


	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public MCNumber sls_qty() {
		return getConstNumber(offset + 39, $sls_qty);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(MCNumber value) {
		setConstNumber(offset + 39, $sls_qty, value);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(int value) {
		setConstNumber(offset + 39, $sls_qty, value);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(long value) {
		setConstNumber(offset + 39, $sls_qty, value);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(float value) {
		setConstNumber(offset + 39, $sls_qty, value);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(double value) {
		setConstNumber(offset + 39, $sls_qty, value);
	}


	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return getConstBoolean(offset + 40, $upri_not_tgt_flg);
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		setConstBoolean(offset + 40, $upri_not_tgt_flg, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 41, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 41, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 41, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 41, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 41, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 41, $trd_cur_upri, value);
	}


	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 42, $interim_flg);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 42, $interim_flg, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 43, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 43, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 43, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 43, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 43, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 43, $trd_cur_amt, value);
	}


	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 44, $trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 44, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 44, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 44, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 44, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 44, $trd_cur_inc_tax_amt, value);
	}


	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return getConstBoolean(offset + 45, $tax_fix_flg);
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		setConstBoolean(offset + 45, $tax_fix_flg, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 46, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 46, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 47, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 47, $tax_nm, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 48, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 48, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 48, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 48, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 48, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 48, $tax_rate, value);
	}


	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 49, $tax_typ);
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 49, $tax_typ, value);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 50, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 50, $inc_tax_flg, value);
	}


	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 51, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 51, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 51, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 51, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 51, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 51, $trd_cur_tax_amt, value);
	}


	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 52, $trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 52, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 52, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 52, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 52, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 52, $trd_cur_dscnt_amt, value);
	}


	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 53, $dscnt_rsn_cd);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 53, $dscnt_rsn_cd, value);
	}


	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public String dscnt_rsn_nm() {
		return getConstString(offset + 54, $dscnt_rsn_nm);
	}

	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public void dscnt_rsn_nm(String value) {
		setConstString(offset + 54, $dscnt_rsn_nm, value);
	}


	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public MCNumber cost_upri() {
		return getConstNumber(offset + 55, $cost_upri);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(MCNumber value) {
		setConstNumber(offset + 55, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(int value) {
		setConstNumber(offset + 55, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(long value) {
		setConstNumber(offset + 55, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(float value) {
		setConstNumber(offset + 55, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(double value) {
		setConstNumber(offset + 55, $cost_upri, value);
	}


	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public MCNumber cost_amt() {
		return getConstNumber(offset + 56, $cost_amt);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(MCNumber value) {
		setConstNumber(offset + 56, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(int value) {
		setConstNumber(offset + 56, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(long value) {
		setConstNumber(offset + 56, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(float value) {
		setConstNumber(offset + 56, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(double value) {
		setConstNumber(offset + 56, $cost_amt, value);
	}


	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCNumber prof_rate() {
		return getConstNumber(offset + 57, $prof_rate);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(MCNumber value) {
		setConstNumber(offset + 57, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(int value) {
		setConstNumber(offset + 57, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(long value) {
		setConstNumber(offset + 57, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(float value) {
		setConstNumber(offset + 57, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(double value) {
		setConstNumber(offset + 57, $prof_rate, value);
	}


	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return getConstNumber(offset + 58, $base_cur_upri);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		setConstNumber(offset + 58, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		setConstNumber(offset + 58, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		setConstNumber(offset + 58, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		setConstNumber(offset + 58, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		setConstNumber(offset + 58, $base_cur_upri, value);
	}


	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 59, $base_cur_amt);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 59, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 59, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 59, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 59, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 59, $base_cur_amt, value);
	}


	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCNumber base_cur_inc_tax_amt() {
		return getConstNumber(offset + 60, $base_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 60, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 60, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 60, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 60, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 60, $base_cur_inc_tax_amt, value);
	}


	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 61, $base_cur_tax_amt);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 61, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 61, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 61, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 61, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 61, $base_cur_tax_amt, value);
	}


	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return getConstNumber(offset + 62, $base_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 62, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		setConstNumber(offset + 62, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		setConstNumber(offset + 62, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		setConstNumber(offset + 62, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		setConstNumber(offset + 62, $base_cur_dscnt_amt, value);
	}


	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return getConstNumber(offset + 63, $ptax_cur_upri);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		setConstNumber(offset + 63, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		setConstNumber(offset + 63, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		setConstNumber(offset + 63, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		setConstNumber(offset + 63, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		setConstNumber(offset + 63, $ptax_cur_upri, value);
	}


	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return getConstNumber(offset + 64, $ptax_cur_amt);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		setConstNumber(offset + 64, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		setConstNumber(offset + 64, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		setConstNumber(offset + 64, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		setConstNumber(offset + 64, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		setConstNumber(offset + 64, $ptax_cur_amt, value);
	}


	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public MCNumber ptax_cur_inc_tax_amt() {
		return getConstNumber(offset + 65, $ptax_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 65, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 65, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 65, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 65, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 65, $ptax_cur_inc_tax_amt, value);
	}


	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return getConstNumber(offset + 66, $ptax_cur_tax_amt);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 66, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		setConstNumber(offset + 66, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		setConstNumber(offset + 66, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		setConstNumber(offset + 66, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		setConstNumber(offset + 66, $ptax_cur_tax_amt, value);
	}


	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public MCNumber ptax_cur_dscnt_amt() {
		return getConstNumber(offset + 67, $ptax_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 67, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(int value) {
		setConstNumber(offset + 67, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(long value) {
		setConstNumber(offset + 67, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(float value) {
		setConstNumber(offset + 67, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(double value) {
		setConstNumber(offset + 67, $ptax_cur_dscnt_amt, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 68, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 68, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 68, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 68, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 68, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 68, $bill_crryovr_times, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 69, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 69, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 70, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 70, $gd_nm, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 71, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 71, $cst_po_d_no, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 72, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 72, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 73, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 73, $cst_itm_nm, value);
	}


	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public String sls_rsn_cd() {
		return getConstString(offset + 74, $sls_rsn_cd);
	}

	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public void sls_rsn_cd(String value) {
		setConstString(offset + 74, $sls_rsn_cd, value);
	}


	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public String sls_rsn_nm() {
		return getConstString(offset + 75, $sls_rsn_nm);
	}

	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public void sls_rsn_nm(String value) {
		setConstString(offset + 75, $sls_rsn_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 76, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 76, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 77, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 77, $bd_dpt_nm, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 78, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 78, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 78, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 78, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 78, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 78, $wtax_rate, value);
	}


	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 79, $wtax_amt);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 79, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 79, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 79, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 79, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 79, $wtax_amt, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 80, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 80, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 81, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 81, $ext_sys_nm, value);
	}


	/**
	 * External purchase result details No. 外部仕入実績明細ＮＯ.<p>
	 *
	 */
	public String ext_purc_act_d_no() {
		return getConstString(offset + 82, $ext_purc_act_d_no);
	}

	/**
	 * External purchase result details No. 外部仕入実績明細ＮＯ.<p>
	 *
	 */
	public void ext_purc_act_d_no(String value) {
		setConstString(offset + 82, $ext_purc_act_d_no, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 83, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 83, $trd_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 84, $intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 84, $intr_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 85, $sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 85, $sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 86, $sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 86, $sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 87, $sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 87, $sub_char3, value);
	}


	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public String sls_act_d_no() {
		return getConstString(offset + 88, $sls_act_d_no);
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		setConstString(offset + 88, $sls_act_d_no, value);
	}


	/**
	 * Purchase recording month 仕入計上年月.<p>
	 *
	 */
	public MCDate purc_ac_ym() {
		return getConstDate(offset + 89, $purc_ac_ym);
	}

	/**
	 * Purchase recording month 仕入計上年月.<p>
	 *
	 */
	public void purc_ac_ym(MCDate value) {
		setConstDate(offset + 89, $purc_ac_ym, value);
	}


	/**
	 * Purchase recording date 仕入計上日.<p>
	 *
	 */
	public MCDate purc_ac_dt() {
		return getConstDate(offset + 90, $purc_ac_dt);
	}

	/**
	 * Purchase recording date 仕入計上日.<p>
	 *
	 */
	public void purc_ac_dt(MCDate value) {
		setConstDate(offset + 90, $purc_ac_dt, value);
	}


	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public MCDate purc_dt() {
		return getConstDate(offset + 91, $purc_dt);
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public void purc_dt(MCDate value) {
		setConstDate(offset + 91, $purc_dt, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 92, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 92, $purc_act_no, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 93, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 93, $purc_act_d_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 94, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 94, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 95, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 95, $po_d_no, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 96, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 96, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 97, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 97, $sppl_nm, value);
	}


	/**
	 * For invoice transaction インボイス取引対象.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 98, $sppl_iv_flg);
	}

	/**
	 * For invoice transaction インボイス取引対象.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 98, $sppl_iv_flg, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 99, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 99, $subcon_flg, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 100, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 100, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 101, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 101, $maker_nm, value);
	}


	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return getConstString(offset + 102, $bp_dlv_slip_no);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		setConstString(offset + 102, $bp_dlv_slip_no, value);
	}


	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return getConstString(offset + 103, $bp_dlv_slip_d_no);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		setConstString(offset + 103, $bp_dlv_slip_d_no, value);
	}


	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public boolean crt_lot_flg() {
		return getConstBoolean(offset + 104, $crt_lot_flg);
	}

	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public void crt_lot_flg(boolean value) {
		setConstBoolean(offset + 104, $crt_lot_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 105, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 105, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 106, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 106, $sublot_no, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 107, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 107, $bp_lot_no, value);
	}


	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCDate ship_fr_valid_dt() {
		return getConstDate(offset + 108, $ship_fr_valid_dt);
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public void ship_fr_valid_dt(MCDate value) {
		setConstDate(offset + 108, $ship_fr_valid_dt, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 109, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 109, $ver_no, value);
	}


	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public MCNumber purc_cont_qty() {
		return getConstNumber(offset + 110, $purc_cont_qty);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(MCNumber value) {
		setConstNumber(offset + 110, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(int value) {
		setConstNumber(offset + 110, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(long value) {
		setConstNumber(offset + 110, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(float value) {
		setConstNumber(offset + 110, $purc_cont_qty, value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(double value) {
		setConstNumber(offset + 110, $purc_cont_qty, value);
	}


	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public MCNumber purc_cont_fctr() {
		return getConstNumber(offset + 111, $purc_cont_fctr);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(MCNumber value) {
		setConstNumber(offset + 111, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(int value) {
		setConstNumber(offset + 111, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(long value) {
		setConstNumber(offset + 111, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(float value) {
		setConstNumber(offset + 111, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(double value) {
		setConstNumber(offset + 111, $purc_cont_fctr, value);
	}


	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_qty() {
		return getConstNumber(offset + 112, $std_cont_qty);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		setConstNumber(offset + 112, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		setConstNumber(offset + 112, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		setConstNumber(offset + 112, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		setConstNumber(offset + 112, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		setConstNumber(offset + 112, $std_cont_qty, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 113, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 113, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 114, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 114, $cont_fctr_unit_nm, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 115, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 115, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 115, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 115, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 115, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 115, $std_cont_fctr, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 116, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 116, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 117, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 117, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 118, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 118, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 119, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 119, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 120, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 120, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 121, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 121, $wrk_nm, value);
	}


	/**
	 * Purchase currency cd. 仕入通貨ＣＤ.<p>
	 *
	 */
	public String purc_trd_cur_cd() {
		return getConstString(offset + 122, $purc_trd_cur_cd);
	}

	/**
	 * Purchase currency cd. 仕入通貨ＣＤ.<p>
	 *
	 */
	public void purc_trd_cur_cd(String value) {
		setConstString(offset + 122, $purc_trd_cur_cd, value);
	}


	/**
	 * Purchase currency name 仕入通貨名.<p>
	 *
	 */
	public String purc_trd_cur_nm() {
		return getConstString(offset + 123, $purc_trd_cur_nm);
	}

	/**
	 * Purchase currency name 仕入通貨名.<p>
	 *
	 */
	public void purc_trd_cur_nm(String value) {
		setConstString(offset + 123, $purc_trd_cur_nm, value);
	}


	/**
	 * Specify scheduled purchase rate 仕入予定レート指定.<p>
	 *
	 */
	public boolean purc_xrate_inpt_flg() {
		return getConstBoolean(offset + 124, $purc_xrate_inpt_flg);
	}

	/**
	 * Specify scheduled purchase rate 仕入予定レート指定.<p>
	 *
	 */
	public void purc_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 124, $purc_xrate_inpt_flg, value);
	}


	/**
	 * Purchase exchange rate 仕入為替レート.<p>
	 *
	 */
	public MCNumber purc_xrate() {
		return getConstNumber(offset + 125, $purc_xrate);
	}

	/**
	 * Purchase exchange rate 仕入為替レート.<p>
	 *
	 */
	public void purc_xrate(MCNumber value) {
		setConstNumber(offset + 125, $purc_xrate, value);
	}

	/**
	 * Purchase exchange rate 仕入為替レート.<p>
	 *
	 */
	public void purc_xrate(int value) {
		setConstNumber(offset + 125, $purc_xrate, value);
	}

	/**
	 * Purchase exchange rate 仕入為替レート.<p>
	 *
	 */
	public void purc_xrate(long value) {
		setConstNumber(offset + 125, $purc_xrate, value);
	}

	/**
	 * Purchase exchange rate 仕入為替レート.<p>
	 *
	 */
	public void purc_xrate(float value) {
		setConstNumber(offset + 125, $purc_xrate, value);
	}

	/**
	 * Purchase exchange rate 仕入為替レート.<p>
	 *
	 */
	public void purc_xrate(double value) {
		setConstNumber(offset + 125, $purc_xrate, value);
	}


	/**
	 * Purchase tax schedule rate specified 仕入納税予定レート指定.<p>
	 *
	 */
	public boolean purc_ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 126, $purc_ptax_xrate_inpt_flg);
	}

	/**
	 * Purchase tax schedule rate specified 仕入納税予定レート指定.<p>
	 *
	 */
	public void purc_ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 126, $purc_ptax_xrate_inpt_flg, value);
	}


	/**
	 * Purchase tax exchange rate 仕入納税為替レート.<p>
	 *
	 */
	public MCNumber purc_ptax_xrate() {
		return getConstNumber(offset + 127, $purc_ptax_xrate);
	}

	/**
	 * Purchase tax exchange rate 仕入納税為替レート.<p>
	 *
	 */
	public void purc_ptax_xrate(MCNumber value) {
		setConstNumber(offset + 127, $purc_ptax_xrate, value);
	}

	/**
	 * Purchase tax exchange rate 仕入納税為替レート.<p>
	 *
	 */
	public void purc_ptax_xrate(int value) {
		setConstNumber(offset + 127, $purc_ptax_xrate, value);
	}

	/**
	 * Purchase tax exchange rate 仕入納税為替レート.<p>
	 *
	 */
	public void purc_ptax_xrate(long value) {
		setConstNumber(offset + 127, $purc_ptax_xrate, value);
	}

	/**
	 * Purchase tax exchange rate 仕入納税為替レート.<p>
	 *
	 */
	public void purc_ptax_xrate(float value) {
		setConstNumber(offset + 127, $purc_ptax_xrate, value);
	}

	/**
	 * Purchase tax exchange rate 仕入納税為替レート.<p>
	 *
	 */
	public void purc_ptax_xrate(double value) {
		setConstNumber(offset + 127, $purc_ptax_xrate, value);
	}


	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public MCDate ptax_dt() {
		return getConstDate(offset + 128, $ptax_dt);
	}

	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public void ptax_dt(MCDate value) {
		setConstDate(offset + 128, $ptax_dt, value);
	}


	/**
	 * Not for purchase unit price re-acquisition 仕入単価再取得対象外.<p>
	 *
	 */
	public boolean purc_upri_not_tgt_flg() {
		return getConstBoolean(offset + 129, $purc_upri_not_tgt_flg);
	}

	/**
	 * Not for purchase unit price re-acquisition 仕入単価再取得対象外.<p>
	 *
	 */
	public void purc_upri_not_tgt_flg(boolean value) {
		setConstBoolean(offset + 129, $purc_upri_not_tgt_flg, value);
	}


	/**
	 * Purchase transaction currency unit price 仕入取引通貨単価.<p>
	 *
	 */
	public MCNumber purc_trd_cur_upri() {
		return getConstNumber(offset + 130, $purc_trd_cur_upri);
	}

	/**
	 * Purchase transaction currency unit price 仕入取引通貨単価.<p>
	 *
	 */
	public void purc_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 130, $purc_trd_cur_upri, value);
	}

	/**
	 * Purchase transaction currency unit price 仕入取引通貨単価.<p>
	 *
	 */
	public void purc_trd_cur_upri(int value) {
		setConstNumber(offset + 130, $purc_trd_cur_upri, value);
	}

	/**
	 * Purchase transaction currency unit price 仕入取引通貨単価.<p>
	 *
	 */
	public void purc_trd_cur_upri(long value) {
		setConstNumber(offset + 130, $purc_trd_cur_upri, value);
	}

	/**
	 * Purchase transaction currency unit price 仕入取引通貨単価.<p>
	 *
	 */
	public void purc_trd_cur_upri(float value) {
		setConstNumber(offset + 130, $purc_trd_cur_upri, value);
	}

	/**
	 * Purchase transaction currency unit price 仕入取引通貨単価.<p>
	 *
	 */
	public void purc_trd_cur_upri(double value) {
		setConstNumber(offset + 130, $purc_trd_cur_upri, value);
	}


	/**
	 * Purchase temporary unit price 仕入仮単価.<p>
	 *
	 */
	public boolean purc_interim_flg() {
		return getConstBoolean(offset + 131, $purc_interim_flg);
	}

	/**
	 * Purchase temporary unit price 仕入仮単価.<p>
	 *
	 */
	public void purc_interim_flg(boolean value) {
		setConstBoolean(offset + 131, $purc_interim_flg, value);
	}


	/**
	 * Purchase transaction currency amount 仕入取引通貨金額.<p>
	 *
	 */
	public MCNumber purc_trd_cur_amt() {
		return getConstNumber(offset + 132, $purc_trd_cur_amt);
	}

	/**
	 * Purchase transaction currency amount 仕入取引通貨金額.<p>
	 *
	 */
	public void purc_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 132, $purc_trd_cur_amt, value);
	}

	/**
	 * Purchase transaction currency amount 仕入取引通貨金額.<p>
	 *
	 */
	public void purc_trd_cur_amt(int value) {
		setConstNumber(offset + 132, $purc_trd_cur_amt, value);
	}

	/**
	 * Purchase transaction currency amount 仕入取引通貨金額.<p>
	 *
	 */
	public void purc_trd_cur_amt(long value) {
		setConstNumber(offset + 132, $purc_trd_cur_amt, value);
	}

	/**
	 * Purchase transaction currency amount 仕入取引通貨金額.<p>
	 *
	 */
	public void purc_trd_cur_amt(float value) {
		setConstNumber(offset + 132, $purc_trd_cur_amt, value);
	}

	/**
	 * Purchase transaction currency amount 仕入取引通貨金額.<p>
	 *
	 */
	public void purc_trd_cur_amt(double value) {
		setConstNumber(offset + 132, $purc_trd_cur_amt, value);
	}


	/**
	 * Tax included purchase amount (Transaction currency) 仕入取引通貨税込金額.<p>
	 *
	 */
	public MCNumber purc_trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 133, $purc_trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included purchase amount (Transaction currency) 仕入取引通貨税込金額.<p>
	 *
	 */
	public void purc_trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 133, $purc_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included purchase amount (Transaction currency) 仕入取引通貨税込金額.<p>
	 *
	 */
	public void purc_trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 133, $purc_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included purchase amount (Transaction currency) 仕入取引通貨税込金額.<p>
	 *
	 */
	public void purc_trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 133, $purc_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included purchase amount (Transaction currency) 仕入取引通貨税込金額.<p>
	 *
	 */
	public void purc_trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 133, $purc_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included purchase amount (Transaction currency) 仕入取引通貨税込金額.<p>
	 *
	 */
	public void purc_trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 133, $purc_trd_cur_inc_tax_amt, value);
	}


	/**
	 * Specify purchase tax 仕入税指定.<p>
	 *
	 */
	public boolean purc_tax_fix_flg() {
		return getConstBoolean(offset + 134, $purc_tax_fix_flg);
	}

	/**
	 * Specify purchase tax 仕入税指定.<p>
	 *
	 */
	public void purc_tax_fix_flg(boolean value) {
		setConstBoolean(offset + 134, $purc_tax_fix_flg, value);
	}


	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public String purc_tax_cd() {
		return getConstString(offset + 135, $purc_tax_cd);
	}

	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public void purc_tax_cd(String value) {
		setConstString(offset + 135, $purc_tax_cd, value);
	}


	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public String purc_tax_nm() {
		return getConstString(offset + 136, $purc_tax_nm);
	}

	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public void purc_tax_nm(String value) {
		setConstString(offset + 136, $purc_tax_nm, value);
	}


	/**
	 * Purchase tax rate 仕入税率.<p>
	 *
	 */
	public MCNumber purc_tax_rate() {
		return getConstNumber(offset + 137, $purc_tax_rate);
	}

	/**
	 * Purchase tax rate 仕入税率.<p>
	 *
	 */
	public void purc_tax_rate(MCNumber value) {
		setConstNumber(offset + 137, $purc_tax_rate, value);
	}

	/**
	 * Purchase tax rate 仕入税率.<p>
	 *
	 */
	public void purc_tax_rate(int value) {
		setConstNumber(offset + 137, $purc_tax_rate, value);
	}

	/**
	 * Purchase tax rate 仕入税率.<p>
	 *
	 */
	public void purc_tax_rate(long value) {
		setConstNumber(offset + 137, $purc_tax_rate, value);
	}

	/**
	 * Purchase tax rate 仕入税率.<p>
	 *
	 */
	public void purc_tax_rate(float value) {
		setConstNumber(offset + 137, $purc_tax_rate, value);
	}

	/**
	 * Purchase tax rate 仕入税率.<p>
	 *
	 */
	public void purc_tax_rate(double value) {
		setConstNumber(offset + 137, $purc_tax_rate, value);
	}


	/**
	 * Purchase tax type 仕入税区分.<p>
	 *
	 */
	public String purc_tax_typ() {
		return getConstString(offset + 138, $purc_tax_typ);
	}

	/**
	 * Purchase tax type 仕入税区分.<p>
	 *
	 */
	public void purc_tax_typ(String value) {
		setConstString(offset + 138, $purc_tax_typ, value);
	}


	/**
	 * Purchase tax inclusive 仕入内税.<p>
	 *
	 */
	public boolean purc_inc_tax_flg() {
		return getConstBoolean(offset + 139, $purc_inc_tax_flg);
	}

	/**
	 * Purchase tax inclusive 仕入内税.<p>
	 *
	 */
	public void purc_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 139, $purc_inc_tax_flg, value);
	}


	/**
	 * Purchase transaction currency tax amount 仕入取引通貨税額.<p>
	 *
	 */
	public MCNumber purc_trd_cur_tax_amt() {
		return getConstNumber(offset + 140, $purc_trd_cur_tax_amt);
	}

	/**
	 * Purchase transaction currency tax amount 仕入取引通貨税額.<p>
	 *
	 */
	public void purc_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 140, $purc_trd_cur_tax_amt, value);
	}

	/**
	 * Purchase transaction currency tax amount 仕入取引通貨税額.<p>
	 *
	 */
	public void purc_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 140, $purc_trd_cur_tax_amt, value);
	}

	/**
	 * Purchase transaction currency tax amount 仕入取引通貨税額.<p>
	 *
	 */
	public void purc_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 140, $purc_trd_cur_tax_amt, value);
	}

	/**
	 * Purchase transaction currency tax amount 仕入取引通貨税額.<p>
	 *
	 */
	public void purc_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 140, $purc_trd_cur_tax_amt, value);
	}

	/**
	 * Purchase transaction currency tax amount 仕入取引通貨税額.<p>
	 *
	 */
	public void purc_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 140, $purc_trd_cur_tax_amt, value);
	}


	/**
	 * Purchase transaction currency discount amount 仕入取引通貨値引額.<p>
	 *
	 */
	public MCNumber purc_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 141, $purc_trd_cur_dscnt_amt);
	}

	/**
	 * Purchase transaction currency discount amount 仕入取引通貨値引額.<p>
	 *
	 */
	public void purc_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 141, $purc_trd_cur_dscnt_amt, value);
	}

	/**
	 * Purchase transaction currency discount amount 仕入取引通貨値引額.<p>
	 *
	 */
	public void purc_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 141, $purc_trd_cur_dscnt_amt, value);
	}

	/**
	 * Purchase transaction currency discount amount 仕入取引通貨値引額.<p>
	 *
	 */
	public void purc_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 141, $purc_trd_cur_dscnt_amt, value);
	}

	/**
	 * Purchase transaction currency discount amount 仕入取引通貨値引額.<p>
	 *
	 */
	public void purc_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 141, $purc_trd_cur_dscnt_amt, value);
	}

	/**
	 * Purchase transaction currency discount amount 仕入取引通貨値引額.<p>
	 *
	 */
	public void purc_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 141, $purc_trd_cur_dscnt_amt, value);
	}


	/**
	 * Purchase discount reason cd. 仕入値引理由ＣＤ.<p>
	 *
	 */
	public String purc_dscnt_rsn_cd() {
		return getConstString(offset + 142, $purc_dscnt_rsn_cd);
	}

	/**
	 * Purchase discount reason cd. 仕入値引理由ＣＤ.<p>
	 *
	 */
	public void purc_dscnt_rsn_cd(String value) {
		setConstString(offset + 142, $purc_dscnt_rsn_cd, value);
	}


	/**
	 * Purchase discount reason name 仕入値引理由名.<p>
	 *
	 */
	public String purc_dscnt_rsn_nm() {
		return getConstString(offset + 143, $purc_dscnt_rsn_nm);
	}

	/**
	 * Purchase discount reason name 仕入値引理由名.<p>
	 *
	 */
	public void purc_dscnt_rsn_nm(String value) {
		setConstString(offset + 143, $purc_dscnt_rsn_nm, value);
	}


	/**
	 * Purchase unit price (Base currency) 仕入基準通貨単価.<p>
	 *
	 */
	public MCNumber purc_base_cur_upri() {
		return getConstNumber(offset + 144, $purc_base_cur_upri);
	}

	/**
	 * Purchase unit price (Base currency) 仕入基準通貨単価.<p>
	 *
	 */
	public void purc_base_cur_upri(MCNumber value) {
		setConstNumber(offset + 144, $purc_base_cur_upri, value);
	}

	/**
	 * Purchase unit price (Base currency) 仕入基準通貨単価.<p>
	 *
	 */
	public void purc_base_cur_upri(int value) {
		setConstNumber(offset + 144, $purc_base_cur_upri, value);
	}

	/**
	 * Purchase unit price (Base currency) 仕入基準通貨単価.<p>
	 *
	 */
	public void purc_base_cur_upri(long value) {
		setConstNumber(offset + 144, $purc_base_cur_upri, value);
	}

	/**
	 * Purchase unit price (Base currency) 仕入基準通貨単価.<p>
	 *
	 */
	public void purc_base_cur_upri(float value) {
		setConstNumber(offset + 144, $purc_base_cur_upri, value);
	}

	/**
	 * Purchase unit price (Base currency) 仕入基準通貨単価.<p>
	 *
	 */
	public void purc_base_cur_upri(double value) {
		setConstNumber(offset + 144, $purc_base_cur_upri, value);
	}


	/**
	 * Purchase amount (Base currency) 仕入基準通貨金額.<p>
	 *
	 */
	public MCNumber purc_base_cur_amt() {
		return getConstNumber(offset + 145, $purc_base_cur_amt);
	}

	/**
	 * Purchase amount (Base currency) 仕入基準通貨金額.<p>
	 *
	 */
	public void purc_base_cur_amt(MCNumber value) {
		setConstNumber(offset + 145, $purc_base_cur_amt, value);
	}

	/**
	 * Purchase amount (Base currency) 仕入基準通貨金額.<p>
	 *
	 */
	public void purc_base_cur_amt(int value) {
		setConstNumber(offset + 145, $purc_base_cur_amt, value);
	}

	/**
	 * Purchase amount (Base currency) 仕入基準通貨金額.<p>
	 *
	 */
	public void purc_base_cur_amt(long value) {
		setConstNumber(offset + 145, $purc_base_cur_amt, value);
	}

	/**
	 * Purchase amount (Base currency) 仕入基準通貨金額.<p>
	 *
	 */
	public void purc_base_cur_amt(float value) {
		setConstNumber(offset + 145, $purc_base_cur_amt, value);
	}

	/**
	 * Purchase amount (Base currency) 仕入基準通貨金額.<p>
	 *
	 */
	public void purc_base_cur_amt(double value) {
		setConstNumber(offset + 145, $purc_base_cur_amt, value);
	}


	/**
	 * Tax included purchase amount (Base currency) 仕入基準通貨税込金額.<p>
	 *
	 */
	public MCNumber purc_base_cur_inc_tax_amt() {
		return getConstNumber(offset + 146, $purc_base_cur_inc_tax_amt);
	}

	/**
	 * Tax included purchase amount (Base currency) 仕入基準通貨税込金額.<p>
	 *
	 */
	public void purc_base_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 146, $purc_base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included purchase amount (Base currency) 仕入基準通貨税込金額.<p>
	 *
	 */
	public void purc_base_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 146, $purc_base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included purchase amount (Base currency) 仕入基準通貨税込金額.<p>
	 *
	 */
	public void purc_base_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 146, $purc_base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included purchase amount (Base currency) 仕入基準通貨税込金額.<p>
	 *
	 */
	public void purc_base_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 146, $purc_base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included purchase amount (Base currency) 仕入基準通貨税込金額.<p>
	 *
	 */
	public void purc_base_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 146, $purc_base_cur_inc_tax_amt, value);
	}


	/**
	 * Purchase tax amount (Base currency) 仕入基準通貨税額.<p>
	 *
	 */
	public MCNumber purc_base_cur_tax_amt() {
		return getConstNumber(offset + 147, $purc_base_cur_tax_amt);
	}

	/**
	 * Purchase tax amount (Base currency) 仕入基準通貨税額.<p>
	 *
	 */
	public void purc_base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 147, $purc_base_cur_tax_amt, value);
	}

	/**
	 * Purchase tax amount (Base currency) 仕入基準通貨税額.<p>
	 *
	 */
	public void purc_base_cur_tax_amt(int value) {
		setConstNumber(offset + 147, $purc_base_cur_tax_amt, value);
	}

	/**
	 * Purchase tax amount (Base currency) 仕入基準通貨税額.<p>
	 *
	 */
	public void purc_base_cur_tax_amt(long value) {
		setConstNumber(offset + 147, $purc_base_cur_tax_amt, value);
	}

	/**
	 * Purchase tax amount (Base currency) 仕入基準通貨税額.<p>
	 *
	 */
	public void purc_base_cur_tax_amt(float value) {
		setConstNumber(offset + 147, $purc_base_cur_tax_amt, value);
	}

	/**
	 * Purchase tax amount (Base currency) 仕入基準通貨税額.<p>
	 *
	 */
	public void purc_base_cur_tax_amt(double value) {
		setConstNumber(offset + 147, $purc_base_cur_tax_amt, value);
	}


	/**
	 * Purchase discount amount (Base currency) 仕入基準通貨値引額.<p>
	 *
	 */
	public MCNumber purc_base_cur_dscnt_amt() {
		return getConstNumber(offset + 148, $purc_base_cur_dscnt_amt);
	}

	/**
	 * Purchase discount amount (Base currency) 仕入基準通貨値引額.<p>
	 *
	 */
	public void purc_base_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 148, $purc_base_cur_dscnt_amt, value);
	}

	/**
	 * Purchase discount amount (Base currency) 仕入基準通貨値引額.<p>
	 *
	 */
	public void purc_base_cur_dscnt_amt(int value) {
		setConstNumber(offset + 148, $purc_base_cur_dscnt_amt, value);
	}

	/**
	 * Purchase discount amount (Base currency) 仕入基準通貨値引額.<p>
	 *
	 */
	public void purc_base_cur_dscnt_amt(long value) {
		setConstNumber(offset + 148, $purc_base_cur_dscnt_amt, value);
	}

	/**
	 * Purchase discount amount (Base currency) 仕入基準通貨値引額.<p>
	 *
	 */
	public void purc_base_cur_dscnt_amt(float value) {
		setConstNumber(offset + 148, $purc_base_cur_dscnt_amt, value);
	}

	/**
	 * Purchase discount amount (Base currency) 仕入基準通貨値引額.<p>
	 *
	 */
	public void purc_base_cur_dscnt_amt(double value) {
		setConstNumber(offset + 148, $purc_base_cur_dscnt_amt, value);
	}


	/**
	 * Purchase unit price (Tax currency) 仕入納税通貨単価.<p>
	 *
	 */
	public MCNumber purc_ptax_cur_upri() {
		return getConstNumber(offset + 149, $purc_ptax_cur_upri);
	}

	/**
	 * Purchase unit price (Tax currency) 仕入納税通貨単価.<p>
	 *
	 */
	public void purc_ptax_cur_upri(MCNumber value) {
		setConstNumber(offset + 149, $purc_ptax_cur_upri, value);
	}

	/**
	 * Purchase unit price (Tax currency) 仕入納税通貨単価.<p>
	 *
	 */
	public void purc_ptax_cur_upri(int value) {
		setConstNumber(offset + 149, $purc_ptax_cur_upri, value);
	}

	/**
	 * Purchase unit price (Tax currency) 仕入納税通貨単価.<p>
	 *
	 */
	public void purc_ptax_cur_upri(long value) {
		setConstNumber(offset + 149, $purc_ptax_cur_upri, value);
	}

	/**
	 * Purchase unit price (Tax currency) 仕入納税通貨単価.<p>
	 *
	 */
	public void purc_ptax_cur_upri(float value) {
		setConstNumber(offset + 149, $purc_ptax_cur_upri, value);
	}

	/**
	 * Purchase unit price (Tax currency) 仕入納税通貨単価.<p>
	 *
	 */
	public void purc_ptax_cur_upri(double value) {
		setConstNumber(offset + 149, $purc_ptax_cur_upri, value);
	}


	/**
	 * Purchase amount (Tax currency) 仕入納税通貨金額.<p>
	 *
	 */
	public MCNumber purc_ptax_cur_amt() {
		return getConstNumber(offset + 150, $purc_ptax_cur_amt);
	}

	/**
	 * Purchase amount (Tax currency) 仕入納税通貨金額.<p>
	 *
	 */
	public void purc_ptax_cur_amt(MCNumber value) {
		setConstNumber(offset + 150, $purc_ptax_cur_amt, value);
	}

	/**
	 * Purchase amount (Tax currency) 仕入納税通貨金額.<p>
	 *
	 */
	public void purc_ptax_cur_amt(int value) {
		setConstNumber(offset + 150, $purc_ptax_cur_amt, value);
	}

	/**
	 * Purchase amount (Tax currency) 仕入納税通貨金額.<p>
	 *
	 */
	public void purc_ptax_cur_amt(long value) {
		setConstNumber(offset + 150, $purc_ptax_cur_amt, value);
	}

	/**
	 * Purchase amount (Tax currency) 仕入納税通貨金額.<p>
	 *
	 */
	public void purc_ptax_cur_amt(float value) {
		setConstNumber(offset + 150, $purc_ptax_cur_amt, value);
	}

	/**
	 * Purchase amount (Tax currency) 仕入納税通貨金額.<p>
	 *
	 */
	public void purc_ptax_cur_amt(double value) {
		setConstNumber(offset + 150, $purc_ptax_cur_amt, value);
	}


	/**
	 * Tax included purchase amount (Tax currency) 仕入納税通貨税込金額.<p>
	 *
	 */
	public MCNumber purc_ptax_cur_inc_tax_amt() {
		return getConstNumber(offset + 151, $purc_ptax_cur_inc_tax_amt);
	}

	/**
	 * Tax included purchase amount (Tax currency) 仕入納税通貨税込金額.<p>
	 *
	 */
	public void purc_ptax_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 151, $purc_ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included purchase amount (Tax currency) 仕入納税通貨税込金額.<p>
	 *
	 */
	public void purc_ptax_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 151, $purc_ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included purchase amount (Tax currency) 仕入納税通貨税込金額.<p>
	 *
	 */
	public void purc_ptax_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 151, $purc_ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included purchase amount (Tax currency) 仕入納税通貨税込金額.<p>
	 *
	 */
	public void purc_ptax_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 151, $purc_ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included purchase amount (Tax currency) 仕入納税通貨税込金額.<p>
	 *
	 */
	public void purc_ptax_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 151, $purc_ptax_cur_inc_tax_amt, value);
	}


	/**
	 * Purchase tax amount (Tax currency) 仕入納税通貨税額.<p>
	 *
	 */
	public MCNumber purc_ptax_cur_tax_amt() {
		return getConstNumber(offset + 152, $purc_ptax_cur_tax_amt);
	}

	/**
	 * Purchase tax amount (Tax currency) 仕入納税通貨税額.<p>
	 *
	 */
	public void purc_ptax_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 152, $purc_ptax_cur_tax_amt, value);
	}

	/**
	 * Purchase tax amount (Tax currency) 仕入納税通貨税額.<p>
	 *
	 */
	public void purc_ptax_cur_tax_amt(int value) {
		setConstNumber(offset + 152, $purc_ptax_cur_tax_amt, value);
	}

	/**
	 * Purchase tax amount (Tax currency) 仕入納税通貨税額.<p>
	 *
	 */
	public void purc_ptax_cur_tax_amt(long value) {
		setConstNumber(offset + 152, $purc_ptax_cur_tax_amt, value);
	}

	/**
	 * Purchase tax amount (Tax currency) 仕入納税通貨税額.<p>
	 *
	 */
	public void purc_ptax_cur_tax_amt(float value) {
		setConstNumber(offset + 152, $purc_ptax_cur_tax_amt, value);
	}

	/**
	 * Purchase tax amount (Tax currency) 仕入納税通貨税額.<p>
	 *
	 */
	public void purc_ptax_cur_tax_amt(double value) {
		setConstNumber(offset + 152, $purc_ptax_cur_tax_amt, value);
	}


	/**
	 * Purchase discount amount (Tax currency) 仕入納税通貨値引額.<p>
	 *
	 */
	public MCNumber purc_ptax_cur_dscnt_amt() {
		return getConstNumber(offset + 153, $purc_ptax_cur_dscnt_amt);
	}

	/**
	 * Purchase discount amount (Tax currency) 仕入納税通貨値引額.<p>
	 *
	 */
	public void purc_ptax_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 153, $purc_ptax_cur_dscnt_amt, value);
	}

	/**
	 * Purchase discount amount (Tax currency) 仕入納税通貨値引額.<p>
	 *
	 */
	public void purc_ptax_cur_dscnt_amt(int value) {
		setConstNumber(offset + 153, $purc_ptax_cur_dscnt_amt, value);
	}

	/**
	 * Purchase discount amount (Tax currency) 仕入納税通貨値引額.<p>
	 *
	 */
	public void purc_ptax_cur_dscnt_amt(long value) {
		setConstNumber(offset + 153, $purc_ptax_cur_dscnt_amt, value);
	}

	/**
	 * Purchase discount amount (Tax currency) 仕入納税通貨値引額.<p>
	 *
	 */
	public void purc_ptax_cur_dscnt_amt(float value) {
		setConstNumber(offset + 153, $purc_ptax_cur_dscnt_amt, value);
	}

	/**
	 * Purchase discount amount (Tax currency) 仕入納税通貨値引額.<p>
	 *
	 */
	public void purc_ptax_cur_dscnt_amt(double value) {
		setConstNumber(offset + 153, $purc_ptax_cur_dscnt_amt, value);
	}


	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return getConstString(offset + 154, $purc_rsn_cd);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		setConstString(offset + 154, $purc_rsn_cd, value);
	}


	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public String purc_rsn_nm() {
		return getConstString(offset + 155, $purc_rsn_nm);
	}

	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public void purc_rsn_nm(String value) {
		setConstString(offset + 155, $purc_rsn_nm, value);
	}


	/**
	 * Purchase charged dept. cd. 仕入負担部門ＣＤ.<p>
	 *
	 */
	public String purc_bd_dpt_cd() {
		return getConstString(offset + 156, $purc_bd_dpt_cd);
	}

	/**
	 * Purchase charged dept. cd. 仕入負担部門ＣＤ.<p>
	 *
	 */
	public void purc_bd_dpt_cd(String value) {
		setConstString(offset + 156, $purc_bd_dpt_cd, value);
	}


	/**
	 * Purchase charged dept. name 仕入負担部門名.<p>
	 *
	 */
	public String purc_bd_dpt_nm() {
		return getConstString(offset + 157, $purc_bd_dpt_nm);
	}

	/**
	 * Purchase charged dept. name 仕入負担部門名.<p>
	 *
	 */
	public void purc_bd_dpt_nm(String value) {
		setConstString(offset + 157, $purc_bd_dpt_nm, value);
	}


	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public MCNumber purc_wtax_rate() {
		return getConstNumber(offset + 158, $purc_wtax_rate);
	}

	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public void purc_wtax_rate(MCNumber value) {
		setConstNumber(offset + 158, $purc_wtax_rate, value);
	}

	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public void purc_wtax_rate(int value) {
		setConstNumber(offset + 158, $purc_wtax_rate, value);
	}

	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public void purc_wtax_rate(long value) {
		setConstNumber(offset + 158, $purc_wtax_rate, value);
	}

	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public void purc_wtax_rate(float value) {
		setConstNumber(offset + 158, $purc_wtax_rate, value);
	}

	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public void purc_wtax_rate(double value) {
		setConstNumber(offset + 158, $purc_wtax_rate, value);
	}


	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public MCNumber purc_wtax_amt() {
		return getConstNumber(offset + 159, $purc_wtax_amt);
	}

	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public void purc_wtax_amt(MCNumber value) {
		setConstNumber(offset + 159, $purc_wtax_amt, value);
	}

	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public void purc_wtax_amt(int value) {
		setConstNumber(offset + 159, $purc_wtax_amt, value);
	}

	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public void purc_wtax_amt(long value) {
		setConstNumber(offset + 159, $purc_wtax_amt, value);
	}

	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public void purc_wtax_amt(float value) {
		setConstNumber(offset + 159, $purc_wtax_amt, value);
	}

	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public void purc_wtax_amt(double value) {
		setConstNumber(offset + 159, $purc_wtax_amt, value);
	}


	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public MCNumber purc_qty() {
		return getConstNumber(offset + 160, $purc_qty);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(MCNumber value) {
		setConstNumber(offset + 160, $purc_qty, value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(int value) {
		setConstNumber(offset + 160, $purc_qty, value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(long value) {
		setConstNumber(offset + 160, $purc_qty, value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(float value) {
		setConstNumber(offset + 160, $purc_qty, value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(double value) {
		setConstNumber(offset + 160, $purc_qty, value);
	}


	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public MCNumber base_unit_purc_schd_qty() {
		return getConstNumber(offset + 161, $base_unit_purc_schd_qty);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(MCNumber value) {
		setConstNumber(offset + 161, $base_unit_purc_schd_qty, value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(int value) {
		setConstNumber(offset + 161, $base_unit_purc_schd_qty, value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(long value) {
		setConstNumber(offset + 161, $base_unit_purc_schd_qty, value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(float value) {
		setConstNumber(offset + 161, $base_unit_purc_schd_qty, value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(double value) {
		setConstNumber(offset + 161, $base_unit_purc_schd_qty, value);
	}


	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public String po_print_rmrks() {
		return getConstString(offset + 162, $po_print_rmrks);
	}

	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public void po_print_rmrks(String value) {
		setConstString(offset + 162, $po_print_rmrks, value);
	}


	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public String po_print_d_rmrks() {
		return getConstString(offset + 163, $po_print_d_rmrks);
	}

	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public void po_print_d_rmrks(String value) {
		setConstString(offset + 163, $po_print_d_rmrks, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 164, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 164, $slo_d_no, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 165, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 165, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 165, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 165, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 165, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 165, $disp_seq, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 166, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 166, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 167, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 167, $sublot_mng_typ, value);
	}


	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 168, $lot_no_typ);
	}

	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 168, $lot_no_typ, value);
	}


	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 169, $sublot_no_typ);
	}

	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 169, $sublot_no_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 170, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 170, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 171, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 171, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 172, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 172, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 173, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 173, $sno4_mng_typ, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 174, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 174, $stk_mng_typ, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 175, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 175, $dscnt_itm_flg, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber itm_bill_crryovr_times() {
		return getConstNumber(offset + 176, $itm_bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 176, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(int value) {
		setConstNumber(offset + 176, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(long value) {
		setConstNumber(offset + 176, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(float value) {
		setConstNumber(offset + 176, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(double value) {
		setConstNumber(offset + 176, $itm_bill_crryovr_times, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 177, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 177, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 177, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 177, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 177, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 177, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 178, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 178, $base_unit_rnd_typ, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 179, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 179, $cont_fctr_flg, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 180, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 180, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 181, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 181, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 181, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 181, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 181, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 181, $cont_fctr_dec_place, value);
	}


	/**
	 * Version control 版管理.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 182, $ver_flg);
	}

	/**
	 * Version control 版管理.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 182, $ver_flg, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 183, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 183, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 183, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 183, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 183, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 183, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 184, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 184, $trd_unit_rnd_typ, value);
	}


	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public boolean sls_acxfr_flg() {
		return getConstBoolean(offset + 185, $sls_acxfr_flg);
	}

	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public void sls_acxfr_flg(boolean value) {
		setConstBoolean(offset + 185, $sls_acxfr_flg, value);
	}


	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 186, $xpns_purc_flg);
	}

	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 186, $xpns_purc_flg, value);
	}


	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public String sls_act_no() {
		return getConstString(offset + 187, $sls_act_no);
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public void sls_act_no(String value) {
		setConstString(offset + 187, $sls_act_no, value);
	}


	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public MCNumber sls_act_seq() {
		return getConstNumber(offset + 188, $sls_act_seq);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(MCNumber value) {
		setConstNumber(offset + 188, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(int value) {
		setConstNumber(offset + 188, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(long value) {
		setConstNumber(offset + 188, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(float value) {
		setConstNumber(offset + 188, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(double value) {
		setConstNumber(offset + 188, $sls_act_seq, value);
	}


	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public MCNumber sls_act_d_seq() {
		return getConstNumber(offset + 189, $sls_act_d_seq);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(MCNumber value) {
		setConstNumber(offset + 189, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(int value) {
		setConstNumber(offset + 189, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(long value) {
		setConstNumber(offset + 189, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(float value) {
		setConstNumber(offset + 189, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(double value) {
		setConstNumber(offset + 189, $sls_act_d_seq, value);
	}


	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public String sls_schd_no() {
		return getConstString(offset + 190, $sls_schd_no);
	}

	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public void sls_schd_no(String value) {
		setConstString(offset + 190, $sls_schd_no, value);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 191, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 191, $purc_schd_no, value);
	}


	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public MCNumber dtl_row_id() {
		return getConstNumber(offset + 192, $dtl_row_id);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(MCNumber value) {
		setConstNumber(offset + 192, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(int value) {
		setConstNumber(offset + 192, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(long value) {
		setConstNumber(offset + 192, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(float value) {
		setConstNumber(offset + 192, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(double value) {
		setConstNumber(offset + 192, $dtl_row_id, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 193, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 193, $arr_pr_no, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 194, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 194, $ship_pr_no, value);
	}


	public boolean outsrc_flg() {
		return getConstBoolean(offset + 195, $outsrc_flg);
	}

	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 195, $outsrc_flg, value);
	}


	/**
	 * Set lot to be received 入荷予定ロット指定.<p>
	 *
	 */
	public boolean arr_schd_lot_fix_flg() {
		return getConstBoolean(offset + 196, $arr_schd_lot_fix_flg);
	}

	/**
	 * Set lot to be received 入荷予定ロット指定.<p>
	 *
	 */
	public void arr_schd_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 196, $arr_schd_lot_fix_flg, value);
	}


	/**
	 * For market release decision 市場出荷判定対象.<p>
	 *
	 */
	public boolean mrkt_judg_flg() {
		return getConstBoolean(offset + 197, $mrkt_judg_flg);
	}

	/**
	 * For market release decision 市場出荷判定対象.<p>
	 *
	 */
	public void mrkt_judg_flg(boolean value) {
		setConstBoolean(offset + 197, $mrkt_judg_flg, value);
	}


	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public MCNumber init_schd_qty() {
		return getConstNumber(offset + 198, $init_schd_qty);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(MCNumber value) {
		setConstNumber(offset + 198, $init_schd_qty, value);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(int value) {
		setConstNumber(offset + 198, $init_schd_qty, value);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(long value) {
		setConstNumber(offset + 198, $init_schd_qty, value);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(float value) {
		setConstNumber(offset + 198, $init_schd_qty, value);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(double value) {
		setConstNumber(offset + 198, $init_schd_qty, value);
	}


	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public MCNumber init_schd_dscnt_amt() {
		return getConstNumber(offset + 199, $init_schd_dscnt_amt);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 199, $init_schd_dscnt_amt, value);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(int value) {
		setConstNumber(offset + 199, $init_schd_dscnt_amt, value);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(long value) {
		setConstNumber(offset + 199, $init_schd_dscnt_amt, value);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(float value) {
		setConstNumber(offset + 199, $init_schd_dscnt_amt, value);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(double value) {
		setConstNumber(offset + 199, $init_schd_dscnt_amt, value);
	}


	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public MCNumber arr_pr_upd_cntr() {
		return getConstNumber(offset + 200, $arr_pr_upd_cntr);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 200, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(int value) {
		setConstNumber(offset + 200, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(long value) {
		setConstNumber(offset + 200, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(float value) {
		setConstNumber(offset + 200, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(double value) {
		setConstNumber(offset + 200, $arr_pr_upd_cntr, value);
	}


	/**
	 * Update counter (Shipping progress) 更新カウンタ(出荷進捗).<p>
	 *
	 */
	public MCNumber ship_pr_upd_cntr() {
		return getConstNumber(offset + 201, $ship_pr_upd_cntr);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ(出荷進捗).<p>
	 *
	 */
	public void ship_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 201, $ship_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ(出荷進捗).<p>
	 *
	 */
	public void ship_pr_upd_cntr(int value) {
		setConstNumber(offset + 201, $ship_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ(出荷進捗).<p>
	 *
	 */
	public void ship_pr_upd_cntr(long value) {
		setConstNumber(offset + 201, $ship_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ(出荷進捗).<p>
	 *
	 */
	public void ship_pr_upd_cntr(float value) {
		setConstNumber(offset + 201, $ship_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ(出荷進捗).<p>
	 *
	 */
	public void ship_pr_upd_cntr(double value) {
		setConstNumber(offset + 201, $ship_pr_upd_cntr, value);
	}


	/**
	 * Initial sales cd. 当初売上税ＣＤ.<p>
	 *
	 */
	public String schd_tax_cd() {
		return getConstString(offset + 202, $schd_tax_cd);
	}

	/**
	 * Initial sales cd. 当初売上税ＣＤ.<p>
	 *
	 */
	public void schd_tax_cd(String value) {
		setConstString(offset + 202, $schd_tax_cd, value);
	}


	/**
	 * Initial scheduled amount 当初予定金額.<p>
	 *
	 */
	public MCNumber init_schd_amt() {
		return getConstNumber(offset + 203, $init_schd_amt);
	}

	/**
	 * Initial scheduled amount 当初予定金額.<p>
	 *
	 */
	public void init_schd_amt(MCNumber value) {
		setConstNumber(offset + 203, $init_schd_amt, value);
	}

	/**
	 * Initial scheduled amount 当初予定金額.<p>
	 *
	 */
	public void init_schd_amt(int value) {
		setConstNumber(offset + 203, $init_schd_amt, value);
	}

	/**
	 * Initial scheduled amount 当初予定金額.<p>
	 *
	 */
	public void init_schd_amt(long value) {
		setConstNumber(offset + 203, $init_schd_amt, value);
	}

	/**
	 * Initial scheduled amount 当初予定金額.<p>
	 *
	 */
	public void init_schd_amt(float value) {
		setConstNumber(offset + 203, $init_schd_amt, value);
	}

	/**
	 * Initial scheduled amount 当初予定金額.<p>
	 *
	 */
	public void init_schd_amt(double value) {
		setConstNumber(offset + 203, $init_schd_amt, value);
	}


	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public MCNumber schd_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 204, $schd_trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 204, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 204, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 204, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 204, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 204, $schd_trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public MCNumber schd_trd_unit_conv_qty() {
		return getConstNumber(offset + 205, $schd_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 205, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 205, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 205, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 205, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 205, $schd_trd_unit_conv_qty, value);
	}


	public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR hdr(){
		return (mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR) getConstInnerRow(offset + 206, $hdr);
	}
	
	public void hdr(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR row){
		setConstInnerRow(offset + 206, $hdr, row);
	}


	/**
	 * Initial purchase tax cd. 当初仕入税ＣＤ.<p>
	 *
	 */
	public String purc_schd_tax_cd() {
		return getConstString(offset + 207, $purc_schd_tax_cd);
	}

	/**
	 * Initial purchase tax cd. 当初仕入税ＣＤ.<p>
	 *
	 */
	public void purc_schd_tax_cd(String value) {
		setConstString(offset + 207, $purc_schd_tax_cd, value);
	}


	/**
	 * Initial purchase tax rate 当初仕入税率.<p>
	 *
	 */
	public MCNumber purc_schd_tax_rate() {
		return getConstNumber(offset + 208, $purc_schd_tax_rate);
	}

	/**
	 * Initial purchase tax rate 当初仕入税率.<p>
	 *
	 */
	public void purc_schd_tax_rate(MCNumber value) {
		setConstNumber(offset + 208, $purc_schd_tax_rate, value);
	}

	/**
	 * Initial purchase tax rate 当初仕入税率.<p>
	 *
	 */
	public void purc_schd_tax_rate(int value) {
		setConstNumber(offset + 208, $purc_schd_tax_rate, value);
	}

	/**
	 * Initial purchase tax rate 当初仕入税率.<p>
	 *
	 */
	public void purc_schd_tax_rate(long value) {
		setConstNumber(offset + 208, $purc_schd_tax_rate, value);
	}

	/**
	 * Initial purchase tax rate 当初仕入税率.<p>
	 *
	 */
	public void purc_schd_tax_rate(float value) {
		setConstNumber(offset + 208, $purc_schd_tax_rate, value);
	}

	/**
	 * Initial purchase tax rate 当初仕入税率.<p>
	 *
	 */
	public void purc_schd_tax_rate(double value) {
		setConstNumber(offset + 208, $purc_schd_tax_rate, value);
	}


	/**
	 * Initial purchase tax inclusive 当初仕入内税.<p>
	 *
	 */
	public boolean purc_schd_inc_tax_flg() {
		return getConstBoolean(offset + 209, $purc_schd_inc_tax_flg);
	}

	/**
	 * Initial purchase tax inclusive 当初仕入内税.<p>
	 *
	 */
	public void purc_schd_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 209, $purc_schd_inc_tax_flg, value);
	}


	/**
	 * Purchase transaction unit cd. 仕入取引単位ＣＤ.<p>
	 *
	 */
	public String purc_trd_unit_cd() {
		return getConstString(offset + 210, $purc_trd_unit_cd);
	}

	/**
	 * Purchase transaction unit cd. 仕入取引単位ＣＤ.<p>
	 *
	 */
	public void purc_trd_unit_cd(String value) {
		setConstString(offset + 210, $purc_trd_unit_cd, value);
	}


	/**
	 * Initial purchase scheduled qty. (Transaction unit) 当初仕入予定数量（取引単位）.<p>
	 *
	 */
	public MCNumber purc_trd_unit_qty() {
		return getConstNumber(offset + 211, $purc_trd_unit_qty);
	}

	/**
	 * Initial purchase scheduled qty. (Transaction unit) 当初仕入予定数量（取引単位）.<p>
	 *
	 */
	public void purc_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 211, $purc_trd_unit_qty, value);
	}

	/**
	 * Initial purchase scheduled qty. (Transaction unit) 当初仕入予定数量（取引単位）.<p>
	 *
	 */
	public void purc_trd_unit_qty(int value) {
		setConstNumber(offset + 211, $purc_trd_unit_qty, value);
	}

	/**
	 * Initial purchase scheduled qty. (Transaction unit) 当初仕入予定数量（取引単位）.<p>
	 *
	 */
	public void purc_trd_unit_qty(long value) {
		setConstNumber(offset + 211, $purc_trd_unit_qty, value);
	}

	/**
	 * Initial purchase scheduled qty. (Transaction unit) 当初仕入予定数量（取引単位）.<p>
	 *
	 */
	public void purc_trd_unit_qty(float value) {
		setConstNumber(offset + 211, $purc_trd_unit_qty, value);
	}

	/**
	 * Initial purchase scheduled qty. (Transaction unit) 当初仕入予定数量（取引単位）.<p>
	 *
	 */
	public void purc_trd_unit_qty(double value) {
		setConstNumber(offset + 211, $purc_trd_unit_qty, value);
	}


	/**
	 * Initial purchase scheduled qty. (Base unit) 当初仕入予定数量（基準単位）.<p>
	 *
	 */
	public MCNumber purc_schd_init_qty() {
		return getConstNumber(offset + 212, $purc_schd_init_qty);
	}

	/**
	 * Initial purchase scheduled qty. (Base unit) 当初仕入予定数量（基準単位）.<p>
	 *
	 */
	public void purc_schd_init_qty(MCNumber value) {
		setConstNumber(offset + 212, $purc_schd_init_qty, value);
	}

	/**
	 * Initial purchase scheduled qty. (Base unit) 当初仕入予定数量（基準単位）.<p>
	 *
	 */
	public void purc_schd_init_qty(int value) {
		setConstNumber(offset + 212, $purc_schd_init_qty, value);
	}

	/**
	 * Initial purchase scheduled qty. (Base unit) 当初仕入予定数量（基準単位）.<p>
	 *
	 */
	public void purc_schd_init_qty(long value) {
		setConstNumber(offset + 212, $purc_schd_init_qty, value);
	}

	/**
	 * Initial purchase scheduled qty. (Base unit) 当初仕入予定数量（基準単位）.<p>
	 *
	 */
	public void purc_schd_init_qty(float value) {
		setConstNumber(offset + 212, $purc_schd_init_qty, value);
	}

	/**
	 * Initial purchase scheduled qty. (Base unit) 当初仕入予定数量（基準単位）.<p>
	 *
	 */
	public void purc_schd_init_qty(double value) {
		setConstNumber(offset + 212, $purc_schd_init_qty, value);
	}


	/**
	 * Initial purchase scheduled discount amount 当初仕入予定値引額.<p>
	 *
	 */
	public MCNumber purc_schd_init_dscnt_amt() {
		return getConstNumber(offset + 213, $purc_schd_init_dscnt_amt);
	}

	/**
	 * Initial purchase scheduled discount amount 当初仕入予定値引額.<p>
	 *
	 */
	public void purc_schd_init_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 213, $purc_schd_init_dscnt_amt, value);
	}

	/**
	 * Initial purchase scheduled discount amount 当初仕入予定値引額.<p>
	 *
	 */
	public void purc_schd_init_dscnt_amt(int value) {
		setConstNumber(offset + 213, $purc_schd_init_dscnt_amt, value);
	}

	/**
	 * Initial purchase scheduled discount amount 当初仕入予定値引額.<p>
	 *
	 */
	public void purc_schd_init_dscnt_amt(long value) {
		setConstNumber(offset + 213, $purc_schd_init_dscnt_amt, value);
	}

	/**
	 * Initial purchase scheduled discount amount 当初仕入予定値引額.<p>
	 *
	 */
	public void purc_schd_init_dscnt_amt(float value) {
		setConstNumber(offset + 213, $purc_schd_init_dscnt_amt, value);
	}

	/**
	 * Initial purchase scheduled discount amount 当初仕入予定値引額.<p>
	 *
	 */
	public void purc_schd_init_dscnt_amt(double value) {
		setConstNumber(offset + 213, $purc_schd_init_dscnt_amt, value);
	}


	/**
	 * Initial purchase scheduled amount 当初仕入予定金額.<p>
	 *
	 */
	public MCNumber purc_schd_init_amt() {
		return getConstNumber(offset + 214, $purc_schd_init_amt);
	}

	/**
	 * Initial purchase scheduled amount 当初仕入予定金額.<p>
	 *
	 */
	public void purc_schd_init_amt(MCNumber value) {
		setConstNumber(offset + 214, $purc_schd_init_amt, value);
	}

	/**
	 * Initial purchase scheduled amount 当初仕入予定金額.<p>
	 *
	 */
	public void purc_schd_init_amt(int value) {
		setConstNumber(offset + 214, $purc_schd_init_amt, value);
	}

	/**
	 * Initial purchase scheduled amount 当初仕入予定金額.<p>
	 *
	 */
	public void purc_schd_init_amt(long value) {
		setConstNumber(offset + 214, $purc_schd_init_amt, value);
	}

	/**
	 * Initial purchase scheduled amount 当初仕入予定金額.<p>
	 *
	 */
	public void purc_schd_init_amt(float value) {
		setConstNumber(offset + 214, $purc_schd_init_amt, value);
	}

	/**
	 * Initial purchase scheduled amount 当初仕入予定金額.<p>
	 *
	 */
	public void purc_schd_init_amt(double value) {
		setConstNumber(offset + 214, $purc_schd_init_amt, value);
	}


	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 215, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 215, $purc_amt_rnd_typ, value);
	}


	/**
	 * Purchase unit price rounding type 仕入単価端数処理区分.<p>
	 *
	 */
	public String purc_upri_rnd_typ() {
		return getConstString(offset + 216, $purc_upri_rnd_typ);
	}

	/**
	 * Purchase unit price rounding type 仕入単価端数処理区分.<p>
	 *
	 */
	public void purc_upri_rnd_typ(String value) {
		setConstString(offset + 216, $purc_upri_rnd_typ, value);
	}


	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 217, $purc_tax_rnd_typ);
	}

	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 217, $purc_tax_rnd_typ, value);
	}


	/**
	 * Purchase transaction currency amount number of decimal places 仕入取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber purc_trd_cur_amt_dec_place() {
		return getConstNumber(offset + 218, $purc_trd_cur_amt_dec_place);
	}

	/**
	 * Purchase transaction currency amount number of decimal places 仕入取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 218, $purc_trd_cur_amt_dec_place, value);
	}

	/**
	 * Purchase transaction currency amount number of decimal places 仕入取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 218, $purc_trd_cur_amt_dec_place, value);
	}

	/**
	 * Purchase transaction currency amount number of decimal places 仕入取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 218, $purc_trd_cur_amt_dec_place, value);
	}

	/**
	 * Purchase transaction currency amount number of decimal places 仕入取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 218, $purc_trd_cur_amt_dec_place, value);
	}

	/**
	 * Purchase transaction currency amount number of decimal places 仕入取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 218, $purc_trd_cur_amt_dec_place, value);
	}


	/**
	 * Purchase transaction currency unit price number of decimal places 仕入取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber purc_trd_cur_upri_dec_place() {
		return getConstNumber(offset + 219, $purc_trd_cur_upri_dec_place);
	}

	/**
	 * Purchase transaction currency unit price number of decimal places 仕入取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 219, $purc_trd_cur_upri_dec_place, value);
	}

	/**
	 * Purchase transaction currency unit price number of decimal places 仕入取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 219, $purc_trd_cur_upri_dec_place, value);
	}

	/**
	 * Purchase transaction currency unit price number of decimal places 仕入取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 219, $purc_trd_cur_upri_dec_place, value);
	}

	/**
	 * Purchase transaction currency unit price number of decimal places 仕入取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 219, $purc_trd_cur_upri_dec_place, value);
	}

	/**
	 * Purchase transaction currency unit price number of decimal places 仕入取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 219, $purc_trd_cur_upri_dec_place, value);
	}


	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public MCNumber purc_s_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 220, $purc_s_trd_unit_conv_base_qty);
	}

	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 220, $purc_s_trd_unit_conv_base_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 220, $purc_s_trd_unit_conv_base_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 220, $purc_s_trd_unit_conv_base_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 220, $purc_s_trd_unit_conv_base_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 220, $purc_s_trd_unit_conv_base_qty, value);
	}


	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public MCNumber purc_s_trd_unit_conv_qty() {
		return getConstNumber(offset + 221, $purc_s_trd_unit_conv_qty);
	}

	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 221, $purc_s_trd_unit_conv_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 221, $purc_s_trd_unit_conv_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 221, $purc_s_trd_unit_conv_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 221, $purc_s_trd_unit_conv_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 221, $purc_s_trd_unit_conv_qty, value);
	}


	/**
	 * Tax cd. (Latest/sales) 税ＣＤ（最新・売上）.<p>
	 *
	 */
	public String new_tax_cd() {
		return getConstString(offset + 222, $new_tax_cd);
	}

	/**
	 * Tax cd. (Latest/sales) 税ＣＤ（最新・売上）.<p>
	 *
	 */
	public void new_tax_cd(String value) {
		setConstString(offset + 222, $new_tax_cd, value);
	}


	/**
	 * Tax name (Latest/sales) 税名（最新・売上）.<p>
	 *
	 */
	public String new_tax_nm() {
		return getConstString(offset + 223, $new_tax_nm);
	}

	/**
	 * Tax name (Latest/sales) 税名（最新・売上）.<p>
	 *
	 */
	public void new_tax_nm(String value) {
		setConstString(offset + 223, $new_tax_nm, value);
	}


	/**
	 * Tax rate (Latest/sales) 税率（最新・売上）.<p>
	 *
	 */
	public MCNumber new_tax_rate() {
		return getConstNumber(offset + 224, $new_tax_rate);
	}

	/**
	 * Tax rate (Latest/sales) 税率（最新・売上）.<p>
	 *
	 */
	public void new_tax_rate(MCNumber value) {
		setConstNumber(offset + 224, $new_tax_rate, value);
	}

	/**
	 * Tax rate (Latest/sales) 税率（最新・売上）.<p>
	 *
	 */
	public void new_tax_rate(int value) {
		setConstNumber(offset + 224, $new_tax_rate, value);
	}

	/**
	 * Tax rate (Latest/sales) 税率（最新・売上）.<p>
	 *
	 */
	public void new_tax_rate(long value) {
		setConstNumber(offset + 224, $new_tax_rate, value);
	}

	/**
	 * Tax rate (Latest/sales) 税率（最新・売上）.<p>
	 *
	 */
	public void new_tax_rate(float value) {
		setConstNumber(offset + 224, $new_tax_rate, value);
	}

	/**
	 * Tax rate (Latest/sales) 税率（最新・売上）.<p>
	 *
	 */
	public void new_tax_rate(double value) {
		setConstNumber(offset + 224, $new_tax_rate, value);
	}


	/**
	 * Tax type (Latest/sales) 税区分（最新・売上）.<p>
	 *
	 */
	public String new_tax_typ() {
		return getConstString(offset + 225, $new_tax_typ);
	}

	/**
	 * Tax type (Latest/sales) 税区分（最新・売上）.<p>
	 *
	 */
	public void new_tax_typ(String value) {
		setConstString(offset + 225, $new_tax_typ, value);
	}


	/**
	 * Tax inclusive (Latest/sales) 内税（最新・売上）.<p>
	 *
	 */
	public boolean new_inc_tax_flg() {
		return getConstBoolean(offset + 226, $new_inc_tax_flg);
	}

	/**
	 * Tax inclusive (Latest/sales) 内税（最新・売上）.<p>
	 *
	 */
	public void new_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 226, $new_inc_tax_flg, value);
	}


	/**
	 * Purchase tax cd. (Latest/purchase) 仕入税ＣＤ（最新・仕入）.<p>
	 *
	 */
	public String new_purc_tax_cd() {
		return getConstString(offset + 227, $new_purc_tax_cd);
	}

	/**
	 * Purchase tax cd. (Latest/purchase) 仕入税ＣＤ（最新・仕入）.<p>
	 *
	 */
	public void new_purc_tax_cd(String value) {
		setConstString(offset + 227, $new_purc_tax_cd, value);
	}


	/**
	 * Purchase tax name (Latest/purchase) 仕入税名（最新・仕入）.<p>
	 *
	 */
	public String new_purc_tax_nm() {
		return getConstString(offset + 228, $new_purc_tax_nm);
	}

	/**
	 * Purchase tax name (Latest/purchase) 仕入税名（最新・仕入）.<p>
	 *
	 */
	public void new_purc_tax_nm(String value) {
		setConstString(offset + 228, $new_purc_tax_nm, value);
	}


	/**
	 * Purchase tax rate (Latest/purchase) 仕入税率（最新・仕入）.<p>
	 *
	 */
	public MCNumber new_purc_tax_rate() {
		return getConstNumber(offset + 229, $new_purc_tax_rate);
	}

	/**
	 * Purchase tax rate (Latest/purchase) 仕入税率（最新・仕入）.<p>
	 *
	 */
	public void new_purc_tax_rate(MCNumber value) {
		setConstNumber(offset + 229, $new_purc_tax_rate, value);
	}

	/**
	 * Purchase tax rate (Latest/purchase) 仕入税率（最新・仕入）.<p>
	 *
	 */
	public void new_purc_tax_rate(int value) {
		setConstNumber(offset + 229, $new_purc_tax_rate, value);
	}

	/**
	 * Purchase tax rate (Latest/purchase) 仕入税率（最新・仕入）.<p>
	 *
	 */
	public void new_purc_tax_rate(long value) {
		setConstNumber(offset + 229, $new_purc_tax_rate, value);
	}

	/**
	 * Purchase tax rate (Latest/purchase) 仕入税率（最新・仕入）.<p>
	 *
	 */
	public void new_purc_tax_rate(float value) {
		setConstNumber(offset + 229, $new_purc_tax_rate, value);
	}

	/**
	 * Purchase tax rate (Latest/purchase) 仕入税率（最新・仕入）.<p>
	 *
	 */
	public void new_purc_tax_rate(double value) {
		setConstNumber(offset + 229, $new_purc_tax_rate, value);
	}


	/**
	 * Purchase tax type (Latest/purchase) 仕入税区分（最新・仕入）.<p>
	 *
	 */
	public String new_purc_tax_typ() {
		return getConstString(offset + 230, $new_purc_tax_typ);
	}

	/**
	 * Purchase tax type (Latest/purchase) 仕入税区分（最新・仕入）.<p>
	 *
	 */
	public void new_purc_tax_typ(String value) {
		setConstString(offset + 230, $new_purc_tax_typ, value);
	}


	/**
	 * Purchase tax inclusive (Latest/purchase) 仕入内税（最新・仕入）.<p>
	 *
	 */
	public boolean new_purc_inc_tax_flg() {
		return getConstBoolean(offset + 231, $new_purc_inc_tax_flg);
	}

	/**
	 * Purchase tax inclusive (Latest/purchase) 仕入内税（最新・仕入）.<p>
	 *
	 */
	public void new_purc_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 231, $new_purc_inc_tax_flg, value);
	}


	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public boolean sls_dtl_upd_flg() {
		return getConstBoolean(offset + 232, $sls_dtl_upd_flg);
	}

	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public void sls_dtl_upd_flg(boolean value) {
		setConstBoolean(offset + 232, $sls_dtl_upd_flg, value);
	}


	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public MCNumber init_trd_cur_tax_amt() {
		return getConstNumber(offset + 233, $init_trd_cur_tax_amt);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 233, $init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 233, $init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 233, $init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 233, $init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 233, $init_trd_cur_tax_amt, value);
	}


	/**
	 * Initial transaction unit cd. 当初取引単位ＣＤ.<p>
	 *
	 */
	public String init_trd_unit_cd() {
		return getConstString(offset + 234, $init_trd_unit_cd);
	}

	/**
	 * Initial transaction unit cd. 当初取引単位ＣＤ.<p>
	 *
	 */
	public void init_trd_unit_cd(String value) {
		setConstString(offset + 234, $init_trd_unit_cd, value);
	}


	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public MCNumber init_trd_unit_qty() {
		return getConstNumber(offset + 235, $init_trd_unit_qty);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 235, $init_trd_unit_qty, value);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(int value) {
		setConstNumber(offset + 235, $init_trd_unit_qty, value);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(long value) {
		setConstNumber(offset + 235, $init_trd_unit_qty, value);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(float value) {
		setConstNumber(offset + 235, $init_trd_unit_qty, value);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(double value) {
		setConstNumber(offset + 235, $init_trd_unit_qty, value);
	}


	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public MCNumber init_trd_cur_upri() {
		return getConstNumber(offset + 236, $init_trd_cur_upri);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 236, $init_trd_cur_upri, value);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(int value) {
		setConstNumber(offset + 236, $init_trd_cur_upri, value);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(long value) {
		setConstNumber(offset + 236, $init_trd_cur_upri, value);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(float value) {
		setConstNumber(offset + 236, $init_trd_cur_upri, value);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(double value) {
		setConstNumber(offset + 236, $init_trd_cur_upri, value);
	}


	/**
	 * Initial tax inclusive 当初内税.<p>
	 *
	 */
	public boolean init_inc_tax_flg() {
		return getConstBoolean(offset + 237, $init_inc_tax_flg);
	}

	/**
	 * Initial tax inclusive 当初内税.<p>
	 *
	 */
	public void init_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 237, $init_inc_tax_flg, value);
	}


	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public MCNumber init_tax_rate() {
		return getConstNumber(offset + 238, $init_tax_rate);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(MCNumber value) {
		setConstNumber(offset + 238, $init_tax_rate, value);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(int value) {
		setConstNumber(offset + 238, $init_tax_rate, value);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(long value) {
		setConstNumber(offset + 238, $init_tax_rate, value);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(float value) {
		setConstNumber(offset + 238, $init_tax_rate, value);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(double value) {
		setConstNumber(offset + 238, $init_tax_rate, value);
	}


	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public MCNumber init_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 239, $init_trd_cur_dscnt_amt);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 239, $init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 239, $init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 239, $init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 239, $init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 239, $init_trd_cur_dscnt_amt, value);
	}


	/**
	 * Purchase details correction 仕入明細訂正.<p>
	 *
	 */
	public boolean purc_dtl_upd_flg() {
		return getConstBoolean(offset + 240, $purc_dtl_upd_flg);
	}

	/**
	 * Purchase details correction 仕入明細訂正.<p>
	 *
	 */
	public void purc_dtl_upd_flg(boolean value) {
		setConstBoolean(offset + 240, $purc_dtl_upd_flg, value);
	}


	/**
	 * Initial purchase transaction currency tax amount 仕入当初取引通貨税額.<p>
	 *
	 */
	public MCNumber purc_init_trd_cur_tax_amt() {
		return getConstNumber(offset + 241, $purc_init_trd_cur_tax_amt);
	}

	/**
	 * Initial purchase transaction currency tax amount 仕入当初取引通貨税額.<p>
	 *
	 */
	public void purc_init_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 241, $purc_init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial purchase transaction currency tax amount 仕入当初取引通貨税額.<p>
	 *
	 */
	public void purc_init_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 241, $purc_init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial purchase transaction currency tax amount 仕入当初取引通貨税額.<p>
	 *
	 */
	public void purc_init_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 241, $purc_init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial purchase transaction currency tax amount 仕入当初取引通貨税額.<p>
	 *
	 */
	public void purc_init_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 241, $purc_init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial purchase transaction currency tax amount 仕入当初取引通貨税額.<p>
	 *
	 */
	public void purc_init_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 241, $purc_init_trd_cur_tax_amt, value);
	}


	/**
	 * Initial purchase transaction unit cd. 仕入当初取引単位ＣＤ.<p>
	 *
	 */
	public String purc_init_trd_unit_cd() {
		return getConstString(offset + 242, $purc_init_trd_unit_cd);
	}

	/**
	 * Initial purchase transaction unit cd. 仕入当初取引単位ＣＤ.<p>
	 *
	 */
	public void purc_init_trd_unit_cd(String value) {
		setConstString(offset + 242, $purc_init_trd_unit_cd, value);
	}


	/**
	 * Initial purchase transaction unit qty. 仕入当初取引単位数量.<p>
	 *
	 */
	public MCNumber purc_init_trd_unit_qty() {
		return getConstNumber(offset + 243, $purc_init_trd_unit_qty);
	}

	/**
	 * Initial purchase transaction unit qty. 仕入当初取引単位数量.<p>
	 *
	 */
	public void purc_init_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 243, $purc_init_trd_unit_qty, value);
	}

	/**
	 * Initial purchase transaction unit qty. 仕入当初取引単位数量.<p>
	 *
	 */
	public void purc_init_trd_unit_qty(int value) {
		setConstNumber(offset + 243, $purc_init_trd_unit_qty, value);
	}

	/**
	 * Initial purchase transaction unit qty. 仕入当初取引単位数量.<p>
	 *
	 */
	public void purc_init_trd_unit_qty(long value) {
		setConstNumber(offset + 243, $purc_init_trd_unit_qty, value);
	}

	/**
	 * Initial purchase transaction unit qty. 仕入当初取引単位数量.<p>
	 *
	 */
	public void purc_init_trd_unit_qty(float value) {
		setConstNumber(offset + 243, $purc_init_trd_unit_qty, value);
	}

	/**
	 * Initial purchase transaction unit qty. 仕入当初取引単位数量.<p>
	 *
	 */
	public void purc_init_trd_unit_qty(double value) {
		setConstNumber(offset + 243, $purc_init_trd_unit_qty, value);
	}


	/**
	 * Initial purchase transaction currency unit price 仕入当初取引通貨単価.<p>
	 *
	 */
	public MCNumber purc_init_trd_cur_upri() {
		return getConstNumber(offset + 244, $purc_init_trd_cur_upri);
	}

	/**
	 * Initial purchase transaction currency unit price 仕入当初取引通貨単価.<p>
	 *
	 */
	public void purc_init_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 244, $purc_init_trd_cur_upri, value);
	}

	/**
	 * Initial purchase transaction currency unit price 仕入当初取引通貨単価.<p>
	 *
	 */
	public void purc_init_trd_cur_upri(int value) {
		setConstNumber(offset + 244, $purc_init_trd_cur_upri, value);
	}

	/**
	 * Initial purchase transaction currency unit price 仕入当初取引通貨単価.<p>
	 *
	 */
	public void purc_init_trd_cur_upri(long value) {
		setConstNumber(offset + 244, $purc_init_trd_cur_upri, value);
	}

	/**
	 * Initial purchase transaction currency unit price 仕入当初取引通貨単価.<p>
	 *
	 */
	public void purc_init_trd_cur_upri(float value) {
		setConstNumber(offset + 244, $purc_init_trd_cur_upri, value);
	}

	/**
	 * Initial purchase transaction currency unit price 仕入当初取引通貨単価.<p>
	 *
	 */
	public void purc_init_trd_cur_upri(double value) {
		setConstNumber(offset + 244, $purc_init_trd_cur_upri, value);
	}


	/**
	 * Initial purchase tax inclusive 仕入当初内税.<p>
	 *
	 */
	public boolean purc_init_inc_tax_flg() {
		return getConstBoolean(offset + 245, $purc_init_inc_tax_flg);
	}

	/**
	 * Initial purchase tax inclusive 仕入当初内税.<p>
	 *
	 */
	public void purc_init_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 245, $purc_init_inc_tax_flg, value);
	}


	/**
	 * Initial purchase tax rate 仕入当初税率.<p>
	 *
	 */
	public MCNumber purc_init_tax_rate() {
		return getConstNumber(offset + 246, $purc_init_tax_rate);
	}

	/**
	 * Initial purchase tax rate 仕入当初税率.<p>
	 *
	 */
	public void purc_init_tax_rate(MCNumber value) {
		setConstNumber(offset + 246, $purc_init_tax_rate, value);
	}

	/**
	 * Initial purchase tax rate 仕入当初税率.<p>
	 *
	 */
	public void purc_init_tax_rate(int value) {
		setConstNumber(offset + 246, $purc_init_tax_rate, value);
	}

	/**
	 * Initial purchase tax rate 仕入当初税率.<p>
	 *
	 */
	public void purc_init_tax_rate(long value) {
		setConstNumber(offset + 246, $purc_init_tax_rate, value);
	}

	/**
	 * Initial purchase tax rate 仕入当初税率.<p>
	 *
	 */
	public void purc_init_tax_rate(float value) {
		setConstNumber(offset + 246, $purc_init_tax_rate, value);
	}

	/**
	 * Initial purchase tax rate 仕入当初税率.<p>
	 *
	 */
	public void purc_init_tax_rate(double value) {
		setConstNumber(offset + 246, $purc_init_tax_rate, value);
	}


	/**
	 * Initial purchase transaction currency discount amount 仕入当初取引通貨値引額.<p>
	 *
	 */
	public MCNumber purc_init_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 247, $purc_init_trd_cur_dscnt_amt);
	}

	/**
	 * Initial purchase transaction currency discount amount 仕入当初取引通貨値引額.<p>
	 *
	 */
	public void purc_init_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 247, $purc_init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial purchase transaction currency discount amount 仕入当初取引通貨値引額.<p>
	 *
	 */
	public void purc_init_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 247, $purc_init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial purchase transaction currency discount amount 仕入当初取引通貨値引額.<p>
	 *
	 */
	public void purc_init_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 247, $purc_init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial purchase transaction currency discount amount 仕入当初取引通貨値引額.<p>
	 *
	 */
	public void purc_init_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 247, $purc_init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial purchase transaction currency discount amount 仕入当初取引通貨値引額.<p>
	 *
	 */
	public void purc_init_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 247, $purc_init_trd_cur_dscnt_amt, value);
	}


	public MCNumber purc_schd_init_ex_amt() {
		return getConstNumber(offset + 248, $purc_schd_init_ex_amt);
	}

	public void purc_schd_init_ex_amt(MCNumber value) {
		setConstNumber(offset + 248, $purc_schd_init_ex_amt, value);
	}

	public void purc_schd_init_ex_amt(int value) {
		setConstNumber(offset + 248, $purc_schd_init_ex_amt, value);
	}

	public void purc_schd_init_ex_amt(long value) {
		setConstNumber(offset + 248, $purc_schd_init_ex_amt, value);
	}

	public void purc_schd_init_ex_amt(float value) {
		setConstNumber(offset + 248, $purc_schd_init_ex_amt, value);
	}

	public void purc_schd_init_ex_amt(double value) {
		setConstNumber(offset + 248, $purc_schd_init_ex_amt, value);
	}


	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty_bef() {
		return getConstNumber(offset + 249, $base_unit_qty_bef);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(MCNumber value) {
		setConstNumber(offset + 249, $base_unit_qty_bef, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(int value) {
		setConstNumber(offset + 249, $base_unit_qty_bef, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(long value) {
		setConstNumber(offset + 249, $base_unit_qty_bef, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(float value) {
		setConstNumber(offset + 249, $base_unit_qty_bef, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(double value) {
		setConstNumber(offset + 249, $base_unit_qty_bef, value);
	}


	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public MCNumber base_unit_purc_qty() {
		return getConstNumber(offset + 250, $base_unit_purc_qty);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_qty(MCNumber value) {
		setConstNumber(offset + 250, $base_unit_purc_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_qty(int value) {
		setConstNumber(offset + 250, $base_unit_purc_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_qty(long value) {
		setConstNumber(offset + 250, $base_unit_purc_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_qty(float value) {
		setConstNumber(offset + 250, $base_unit_purc_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_qty(double value) {
		setConstNumber(offset + 250, $base_unit_purc_qty, value);
	}


	public String getString(String name) {
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			return sls_rsn_cd();
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			return sls_rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_purc_act_d_no.equalsIgnoreCase(name)) {
			return ext_purc_act_d_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
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
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
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
		if ($purc_trd_cur_cd.equalsIgnoreCase(name)) {
			return purc_trd_cur_cd();
		}
		if ($purc_trd_cur_nm.equalsIgnoreCase(name)) {
			return purc_trd_cur_nm();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			return purc_tax_nm();
		}
		if ($purc_tax_typ.equalsIgnoreCase(name)) {
			return purc_tax_typ();
		}
		if ($purc_dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return purc_dscnt_rsn_cd();
		}
		if ($purc_dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return purc_dscnt_rsn_nm();
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			return purc_rsn_nm();
		}
		if ($purc_bd_dpt_cd.equalsIgnoreCase(name)) {
			return purc_bd_dpt_cd();
		}
		if ($purc_bd_dpt_nm.equalsIgnoreCase(name)) {
			return purc_bd_dpt_nm();
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			return sls_schd_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($schd_tax_cd.equalsIgnoreCase(name)) {
			return schd_tax_cd();
		}
		if ($purc_schd_tax_cd.equalsIgnoreCase(name)) {
			return purc_schd_tax_cd();
		}
		if ($purc_trd_unit_cd.equalsIgnoreCase(name)) {
			return purc_trd_unit_cd();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_upri_rnd_typ.equalsIgnoreCase(name)) {
			return purc_upri_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($new_tax_cd.equalsIgnoreCase(name)) {
			return new_tax_cd();
		}
		if ($new_tax_nm.equalsIgnoreCase(name)) {
			return new_tax_nm();
		}
		if ($new_tax_typ.equalsIgnoreCase(name)) {
			return new_tax_typ();
		}
		if ($new_purc_tax_cd.equalsIgnoreCase(name)) {
			return new_purc_tax_cd();
		}
		if ($new_purc_tax_nm.equalsIgnoreCase(name)) {
			return new_purc_tax_nm();
		}
		if ($new_purc_tax_typ.equalsIgnoreCase(name)) {
			return new_purc_tax_typ();
		}
		if ($init_trd_unit_cd.equalsIgnoreCase(name)) {
			return init_trd_unit_cd();
		}
		if ($purc_init_trd_unit_cd.equalsIgnoreCase(name)) {
			return purc_init_trd_unit_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($sls_schd_qty.equalsIgnoreCase(name)) {
			return sls_schd_qty();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			return cost_amt();
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			return ptax_cur_upri();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_inc_tax_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return ptax_cur_dscnt_amt();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			return purc_cont_qty();
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			return purc_cont_fctr();
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			return std_cont_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($purc_xrate.equalsIgnoreCase(name)) {
			return purc_xrate();
		}
		if ($purc_ptax_xrate.equalsIgnoreCase(name)) {
			return purc_ptax_xrate();
		}
		if ($purc_trd_cur_upri.equalsIgnoreCase(name)) {
			return purc_trd_cur_upri();
		}
		if ($purc_trd_cur_amt.equalsIgnoreCase(name)) {
			return purc_trd_cur_amt();
		}
		if ($purc_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return purc_trd_cur_inc_tax_amt();
		}
		if ($purc_tax_rate.equalsIgnoreCase(name)) {
			return purc_tax_rate();
		}
		if ($purc_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return purc_trd_cur_tax_amt();
		}
		if ($purc_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_trd_cur_dscnt_amt();
		}
		if ($purc_base_cur_upri.equalsIgnoreCase(name)) {
			return purc_base_cur_upri();
		}
		if ($purc_base_cur_amt.equalsIgnoreCase(name)) {
			return purc_base_cur_amt();
		}
		if ($purc_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return purc_base_cur_inc_tax_amt();
		}
		if ($purc_base_cur_tax_amt.equalsIgnoreCase(name)) {
			return purc_base_cur_tax_amt();
		}
		if ($purc_base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_base_cur_dscnt_amt();
		}
		if ($purc_ptax_cur_upri.equalsIgnoreCase(name)) {
			return purc_ptax_cur_upri();
		}
		if ($purc_ptax_cur_amt.equalsIgnoreCase(name)) {
			return purc_ptax_cur_amt();
		}
		if ($purc_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return purc_ptax_cur_inc_tax_amt();
		}
		if ($purc_ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return purc_ptax_cur_tax_amt();
		}
		if ($purc_ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_ptax_cur_dscnt_amt();
		}
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			return purc_wtax_rate();
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			return purc_wtax_amt();
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			return purc_qty();
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_schd_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			return itm_bill_crryovr_times();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			return sls_act_seq();
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			return sls_act_d_seq();
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			return dtl_row_id();
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			return init_schd_qty();
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			return init_schd_dscnt_amt();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			return init_schd_amt();
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_base_qty();
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_qty();
		}
		if ($purc_schd_tax_rate.equalsIgnoreCase(name)) {
			return purc_schd_tax_rate();
		}
		if ($purc_trd_unit_qty.equalsIgnoreCase(name)) {
			return purc_trd_unit_qty();
		}
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			return purc_schd_init_qty();
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_schd_init_dscnt_amt();
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			return purc_schd_init_amt();
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return purc_trd_cur_amt_dec_place();
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return purc_trd_cur_upri_dec_place();
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return purc_s_trd_unit_conv_base_qty();
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return purc_s_trd_unit_conv_qty();
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			return new_tax_rate();
		}
		if ($new_purc_tax_rate.equalsIgnoreCase(name)) {
			return new_purc_tax_rate();
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return init_trd_cur_tax_amt();
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			return init_trd_unit_qty();
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			return init_trd_cur_upri();
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			return init_tax_rate();
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return init_trd_cur_dscnt_amt();
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return purc_init_trd_cur_tax_amt();
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			return purc_init_trd_unit_qty();
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			return purc_init_trd_cur_upri();
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			return purc_init_tax_rate();
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_init_trd_cur_dscnt_amt();
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			return purc_schd_init_ex_amt();
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			return base_unit_qty_bef();
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			return dlv_schd_dt();
		}
		if ($purc_ac_ym.equalsIgnoreCase(name)) {
			return purc_ac_ym();
		}
		if ($purc_ac_dt.equalsIgnoreCase(name)) {
			return purc_ac_dt();
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			return ptax_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($org_sync_flg.equalsIgnoreCase(name)) {
			return org_sync_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		if ($purc_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return purc_xrate_inpt_flg();
		}
		if ($purc_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return purc_ptax_xrate_inpt_flg();
		}
		if ($purc_upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return purc_upri_not_tgt_flg();
		}
		if ($purc_interim_flg.equalsIgnoreCase(name)) {
			return purc_interim_flg();
		}
		if ($purc_tax_fix_flg.equalsIgnoreCase(name)) {
			return purc_tax_fix_flg();
		}
		if ($purc_inc_tax_flg.equalsIgnoreCase(name)) {
			return purc_inc_tax_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($arr_schd_lot_fix_flg.equalsIgnoreCase(name)) {
			return arr_schd_lot_fix_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		if ($purc_schd_inc_tax_flg.equalsIgnoreCase(name)) {
			return purc_schd_inc_tax_flg();
		}
		if ($new_inc_tax_flg.equalsIgnoreCase(name)) {
			return new_inc_tax_flg();
		}
		if ($new_purc_inc_tax_flg.equalsIgnoreCase(name)) {
			return new_purc_inc_tax_flg();
		}
		if ($sls_dtl_upd_flg.equalsIgnoreCase(name)) {
			return sls_dtl_upd_flg();
		}
		if ($init_inc_tax_flg.equalsIgnoreCase(name)) {
			return init_inc_tax_flg();
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			return purc_dtl_upd_flg();
		}
		if ($purc_init_inc_tax_flg.equalsIgnoreCase(name)) {
			return purc_init_inc_tax_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			return sls_rsn_cd();
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			return sls_rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_purc_act_d_no.equalsIgnoreCase(name)) {
			return ext_purc_act_d_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
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
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
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
		if ($purc_trd_cur_cd.equalsIgnoreCase(name)) {
			return purc_trd_cur_cd();
		}
		if ($purc_trd_cur_nm.equalsIgnoreCase(name)) {
			return purc_trd_cur_nm();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			return purc_tax_nm();
		}
		if ($purc_tax_typ.equalsIgnoreCase(name)) {
			return purc_tax_typ();
		}
		if ($purc_dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return purc_dscnt_rsn_cd();
		}
		if ($purc_dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return purc_dscnt_rsn_nm();
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			return purc_rsn_nm();
		}
		if ($purc_bd_dpt_cd.equalsIgnoreCase(name)) {
			return purc_bd_dpt_cd();
		}
		if ($purc_bd_dpt_nm.equalsIgnoreCase(name)) {
			return purc_bd_dpt_nm();
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			return sls_schd_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($schd_tax_cd.equalsIgnoreCase(name)) {
			return schd_tax_cd();
		}
		if ($purc_schd_tax_cd.equalsIgnoreCase(name)) {
			return purc_schd_tax_cd();
		}
		if ($purc_trd_unit_cd.equalsIgnoreCase(name)) {
			return purc_trd_unit_cd();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_upri_rnd_typ.equalsIgnoreCase(name)) {
			return purc_upri_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($new_tax_cd.equalsIgnoreCase(name)) {
			return new_tax_cd();
		}
		if ($new_tax_nm.equalsIgnoreCase(name)) {
			return new_tax_nm();
		}
		if ($new_tax_typ.equalsIgnoreCase(name)) {
			return new_tax_typ();
		}
		if ($new_purc_tax_cd.equalsIgnoreCase(name)) {
			return new_purc_tax_cd();
		}
		if ($new_purc_tax_nm.equalsIgnoreCase(name)) {
			return new_purc_tax_nm();
		}
		if ($new_purc_tax_typ.equalsIgnoreCase(name)) {
			return new_purc_tax_typ();
		}
		if ($init_trd_unit_cd.equalsIgnoreCase(name)) {
			return init_trd_unit_cd();
		}
		if ($purc_init_trd_unit_cd.equalsIgnoreCase(name)) {
			return purc_init_trd_unit_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($sls_schd_qty.equalsIgnoreCase(name)) {
			return sls_schd_qty();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			return cost_amt();
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			return ptax_cur_upri();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_inc_tax_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return ptax_cur_dscnt_amt();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			return purc_cont_qty();
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			return purc_cont_fctr();
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			return std_cont_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($purc_xrate.equalsIgnoreCase(name)) {
			return purc_xrate();
		}
		if ($purc_ptax_xrate.equalsIgnoreCase(name)) {
			return purc_ptax_xrate();
		}
		if ($purc_trd_cur_upri.equalsIgnoreCase(name)) {
			return purc_trd_cur_upri();
		}
		if ($purc_trd_cur_amt.equalsIgnoreCase(name)) {
			return purc_trd_cur_amt();
		}
		if ($purc_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return purc_trd_cur_inc_tax_amt();
		}
		if ($purc_tax_rate.equalsIgnoreCase(name)) {
			return purc_tax_rate();
		}
		if ($purc_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return purc_trd_cur_tax_amt();
		}
		if ($purc_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_trd_cur_dscnt_amt();
		}
		if ($purc_base_cur_upri.equalsIgnoreCase(name)) {
			return purc_base_cur_upri();
		}
		if ($purc_base_cur_amt.equalsIgnoreCase(name)) {
			return purc_base_cur_amt();
		}
		if ($purc_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return purc_base_cur_inc_tax_amt();
		}
		if ($purc_base_cur_tax_amt.equalsIgnoreCase(name)) {
			return purc_base_cur_tax_amt();
		}
		if ($purc_base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_base_cur_dscnt_amt();
		}
		if ($purc_ptax_cur_upri.equalsIgnoreCase(name)) {
			return purc_ptax_cur_upri();
		}
		if ($purc_ptax_cur_amt.equalsIgnoreCase(name)) {
			return purc_ptax_cur_amt();
		}
		if ($purc_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return purc_ptax_cur_inc_tax_amt();
		}
		if ($purc_ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return purc_ptax_cur_tax_amt();
		}
		if ($purc_ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_ptax_cur_dscnt_amt();
		}
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			return purc_wtax_rate();
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			return purc_wtax_amt();
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			return purc_qty();
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_schd_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			return itm_bill_crryovr_times();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			return sls_act_seq();
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			return sls_act_d_seq();
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			return dtl_row_id();
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			return init_schd_qty();
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			return init_schd_dscnt_amt();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			return init_schd_amt();
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_base_qty();
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_qty();
		}
		if ($purc_schd_tax_rate.equalsIgnoreCase(name)) {
			return purc_schd_tax_rate();
		}
		if ($purc_trd_unit_qty.equalsIgnoreCase(name)) {
			return purc_trd_unit_qty();
		}
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			return purc_schd_init_qty();
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_schd_init_dscnt_amt();
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			return purc_schd_init_amt();
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return purc_trd_cur_amt_dec_place();
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return purc_trd_cur_upri_dec_place();
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return purc_s_trd_unit_conv_base_qty();
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return purc_s_trd_unit_conv_qty();
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			return new_tax_rate();
		}
		if ($new_purc_tax_rate.equalsIgnoreCase(name)) {
			return new_purc_tax_rate();
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return init_trd_cur_tax_amt();
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			return init_trd_unit_qty();
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			return init_trd_cur_upri();
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			return init_tax_rate();
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return init_trd_cur_dscnt_amt();
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return purc_init_trd_cur_tax_amt();
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			return purc_init_trd_unit_qty();
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			return purc_init_trd_cur_upri();
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			return purc_init_tax_rate();
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_init_trd_cur_dscnt_amt();
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			return purc_schd_init_ex_amt();
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			return base_unit_qty_bef();
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			return dlv_schd_dt();
		}
		if ($purc_ac_ym.equalsIgnoreCase(name)) {
			return purc_ac_ym();
		}
		if ($purc_ac_dt.equalsIgnoreCase(name)) {
			return purc_ac_dt();
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			return ptax_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($org_sync_flg.equalsIgnoreCase(name)) {
			return org_sync_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		if ($purc_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return purc_xrate_inpt_flg();
		}
		if ($purc_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return purc_ptax_xrate_inpt_flg();
		}
		if ($purc_upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return purc_upri_not_tgt_flg();
		}
		if ($purc_interim_flg.equalsIgnoreCase(name)) {
			return purc_interim_flg();
		}
		if ($purc_tax_fix_flg.equalsIgnoreCase(name)) {
			return purc_tax_fix_flg();
		}
		if ($purc_inc_tax_flg.equalsIgnoreCase(name)) {
			return purc_inc_tax_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($arr_schd_lot_fix_flg.equalsIgnoreCase(name)) {
			return arr_schd_lot_fix_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		if ($purc_schd_inc_tax_flg.equalsIgnoreCase(name)) {
			return purc_schd_inc_tax_flg();
		}
		if ($new_inc_tax_flg.equalsIgnoreCase(name)) {
			return new_inc_tax_flg();
		}
		if ($new_purc_inc_tax_flg.equalsIgnoreCase(name)) {
			return new_purc_inc_tax_flg();
		}
		if ($sls_dtl_upd_flg.equalsIgnoreCase(name)) {
			return sls_dtl_upd_flg();
		}
		if ($init_inc_tax_flg.equalsIgnoreCase(name)) {
			return init_inc_tax_flg();
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			return purc_dtl_upd_flg();
		}
		if ($purc_init_inc_tax_flg.equalsIgnoreCase(name)) {
			return purc_init_inc_tax_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
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
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			sls_rsn_cd(value);
			return;
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			sls_rsn_nm(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_purc_act_d_no.equalsIgnoreCase(name)) {
			ext_purc_act_d_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
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
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
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
		if ($purc_trd_cur_cd.equalsIgnoreCase(name)) {
			purc_trd_cur_cd(value);
			return;
		}
		if ($purc_trd_cur_nm.equalsIgnoreCase(name)) {
			purc_trd_cur_nm(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			purc_tax_nm(value);
			return;
		}
		if ($purc_tax_typ.equalsIgnoreCase(name)) {
			purc_tax_typ(value);
			return;
		}
		if ($purc_dscnt_rsn_cd.equalsIgnoreCase(name)) {
			purc_dscnt_rsn_cd(value);
			return;
		}
		if ($purc_dscnt_rsn_nm.equalsIgnoreCase(name)) {
			purc_dscnt_rsn_nm(value);
			return;
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			purc_rsn_cd(value);
			return;
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			purc_rsn_nm(value);
			return;
		}
		if ($purc_bd_dpt_cd.equalsIgnoreCase(name)) {
			purc_bd_dpt_cd(value);
			return;
		}
		if ($purc_bd_dpt_nm.equalsIgnoreCase(name)) {
			purc_bd_dpt_nm(value);
			return;
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
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
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			sls_schd_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($schd_tax_cd.equalsIgnoreCase(name)) {
			schd_tax_cd(value);
			return;
		}
		if ($purc_schd_tax_cd.equalsIgnoreCase(name)) {
			purc_schd_tax_cd(value);
			return;
		}
		if ($purc_trd_unit_cd.equalsIgnoreCase(name)) {
			purc_trd_unit_cd(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_upri_rnd_typ.equalsIgnoreCase(name)) {
			purc_upri_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($new_tax_cd.equalsIgnoreCase(name)) {
			new_tax_cd(value);
			return;
		}
		if ($new_tax_nm.equalsIgnoreCase(name)) {
			new_tax_nm(value);
			return;
		}
		if ($new_tax_typ.equalsIgnoreCase(name)) {
			new_tax_typ(value);
			return;
		}
		if ($new_purc_tax_cd.equalsIgnoreCase(name)) {
			new_purc_tax_cd(value);
			return;
		}
		if ($new_purc_tax_nm.equalsIgnoreCase(name)) {
			new_purc_tax_nm(value);
			return;
		}
		if ($new_purc_tax_typ.equalsIgnoreCase(name)) {
			new_purc_tax_typ(value);
			return;
		}
		if ($init_trd_unit_cd.equalsIgnoreCase(name)) {
			init_trd_unit_cd(value);
			return;
		}
		if ($purc_init_trd_unit_cd.equalsIgnoreCase(name)) {
			purc_init_trd_unit_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sls_schd_qty.equalsIgnoreCase(name)) {
			sls_schd_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($purc_xrate.equalsIgnoreCase(name)) {
			purc_xrate(value);
			return;
		}
		if ($purc_ptax_xrate.equalsIgnoreCase(name)) {
			purc_ptax_xrate(value);
			return;
		}
		if ($purc_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_trd_cur_upri(value);
			return;
		}
		if ($purc_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_amt(value);
			return;
		}
		if ($purc_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_tax_rate.equalsIgnoreCase(name)) {
			purc_tax_rate(value);
			return;
		}
		if ($purc_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_base_cur_upri.equalsIgnoreCase(name)) {
			purc_base_cur_upri(value);
			return;
		}
		if ($purc_base_cur_amt.equalsIgnoreCase(name)) {
			purc_base_cur_amt(value);
			return;
		}
		if ($purc_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_base_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_tax_amt(value);
			return;
		}
		if ($purc_base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_base_cur_dscnt_amt(value);
			return;
		}
		if ($purc_ptax_cur_upri.equalsIgnoreCase(name)) {
			purc_ptax_cur_upri(value);
			return;
		}
		if ($purc_ptax_cur_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_amt(value);
			return;
		}
		if ($purc_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_dscnt_amt(value);
			return;
		}
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_schd_tax_rate.equalsIgnoreCase(name)) {
			purc_schd_tax_rate(value);
			return;
		}
		if ($purc_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_qty(value);
			return;
		}
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($new_purc_tax_rate.equalsIgnoreCase(name)) {
			new_purc_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sls_schd_qty.equalsIgnoreCase(name)) {
			sls_schd_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($purc_xrate.equalsIgnoreCase(name)) {
			purc_xrate(value);
			return;
		}
		if ($purc_ptax_xrate.equalsIgnoreCase(name)) {
			purc_ptax_xrate(value);
			return;
		}
		if ($purc_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_trd_cur_upri(value);
			return;
		}
		if ($purc_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_amt(value);
			return;
		}
		if ($purc_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_tax_rate.equalsIgnoreCase(name)) {
			purc_tax_rate(value);
			return;
		}
		if ($purc_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_base_cur_upri.equalsIgnoreCase(name)) {
			purc_base_cur_upri(value);
			return;
		}
		if ($purc_base_cur_amt.equalsIgnoreCase(name)) {
			purc_base_cur_amt(value);
			return;
		}
		if ($purc_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_base_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_tax_amt(value);
			return;
		}
		if ($purc_base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_base_cur_dscnt_amt(value);
			return;
		}
		if ($purc_ptax_cur_upri.equalsIgnoreCase(name)) {
			purc_ptax_cur_upri(value);
			return;
		}
		if ($purc_ptax_cur_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_amt(value);
			return;
		}
		if ($purc_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_dscnt_amt(value);
			return;
		}
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_schd_tax_rate.equalsIgnoreCase(name)) {
			purc_schd_tax_rate(value);
			return;
		}
		if ($purc_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_qty(value);
			return;
		}
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($new_purc_tax_rate.equalsIgnoreCase(name)) {
			new_purc_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sls_schd_qty.equalsIgnoreCase(name)) {
			sls_schd_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($purc_xrate.equalsIgnoreCase(name)) {
			purc_xrate(value);
			return;
		}
		if ($purc_ptax_xrate.equalsIgnoreCase(name)) {
			purc_ptax_xrate(value);
			return;
		}
		if ($purc_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_trd_cur_upri(value);
			return;
		}
		if ($purc_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_amt(value);
			return;
		}
		if ($purc_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_tax_rate.equalsIgnoreCase(name)) {
			purc_tax_rate(value);
			return;
		}
		if ($purc_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_base_cur_upri.equalsIgnoreCase(name)) {
			purc_base_cur_upri(value);
			return;
		}
		if ($purc_base_cur_amt.equalsIgnoreCase(name)) {
			purc_base_cur_amt(value);
			return;
		}
		if ($purc_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_base_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_tax_amt(value);
			return;
		}
		if ($purc_base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_base_cur_dscnt_amt(value);
			return;
		}
		if ($purc_ptax_cur_upri.equalsIgnoreCase(name)) {
			purc_ptax_cur_upri(value);
			return;
		}
		if ($purc_ptax_cur_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_amt(value);
			return;
		}
		if ($purc_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_dscnt_amt(value);
			return;
		}
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_schd_tax_rate.equalsIgnoreCase(name)) {
			purc_schd_tax_rate(value);
			return;
		}
		if ($purc_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_qty(value);
			return;
		}
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($new_purc_tax_rate.equalsIgnoreCase(name)) {
			new_purc_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sls_schd_qty.equalsIgnoreCase(name)) {
			sls_schd_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($purc_xrate.equalsIgnoreCase(name)) {
			purc_xrate(value);
			return;
		}
		if ($purc_ptax_xrate.equalsIgnoreCase(name)) {
			purc_ptax_xrate(value);
			return;
		}
		if ($purc_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_trd_cur_upri(value);
			return;
		}
		if ($purc_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_amt(value);
			return;
		}
		if ($purc_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_tax_rate.equalsIgnoreCase(name)) {
			purc_tax_rate(value);
			return;
		}
		if ($purc_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_base_cur_upri.equalsIgnoreCase(name)) {
			purc_base_cur_upri(value);
			return;
		}
		if ($purc_base_cur_amt.equalsIgnoreCase(name)) {
			purc_base_cur_amt(value);
			return;
		}
		if ($purc_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_base_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_tax_amt(value);
			return;
		}
		if ($purc_base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_base_cur_dscnt_amt(value);
			return;
		}
		if ($purc_ptax_cur_upri.equalsIgnoreCase(name)) {
			purc_ptax_cur_upri(value);
			return;
		}
		if ($purc_ptax_cur_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_amt(value);
			return;
		}
		if ($purc_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_dscnt_amt(value);
			return;
		}
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_schd_tax_rate.equalsIgnoreCase(name)) {
			purc_schd_tax_rate(value);
			return;
		}
		if ($purc_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_qty(value);
			return;
		}
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($new_purc_tax_rate.equalsIgnoreCase(name)) {
			new_purc_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sls_schd_qty.equalsIgnoreCase(name)) {
			sls_schd_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($purc_xrate.equalsIgnoreCase(name)) {
			purc_xrate(value);
			return;
		}
		if ($purc_ptax_xrate.equalsIgnoreCase(name)) {
			purc_ptax_xrate(value);
			return;
		}
		if ($purc_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_trd_cur_upri(value);
			return;
		}
		if ($purc_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_amt(value);
			return;
		}
		if ($purc_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_tax_rate.equalsIgnoreCase(name)) {
			purc_tax_rate(value);
			return;
		}
		if ($purc_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_base_cur_upri.equalsIgnoreCase(name)) {
			purc_base_cur_upri(value);
			return;
		}
		if ($purc_base_cur_amt.equalsIgnoreCase(name)) {
			purc_base_cur_amt(value);
			return;
		}
		if ($purc_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_base_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_tax_amt(value);
			return;
		}
		if ($purc_base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_base_cur_dscnt_amt(value);
			return;
		}
		if ($purc_ptax_cur_upri.equalsIgnoreCase(name)) {
			purc_ptax_cur_upri(value);
			return;
		}
		if ($purc_ptax_cur_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_amt(value);
			return;
		}
		if ($purc_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_dscnt_amt(value);
			return;
		}
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_schd_tax_rate.equalsIgnoreCase(name)) {
			purc_schd_tax_rate(value);
			return;
		}
		if ($purc_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_qty(value);
			return;
		}
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($new_purc_tax_rate.equalsIgnoreCase(name)) {
			new_purc_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			dlv_schd_dt(value);
			return;
		}
		if ($purc_ac_ym.equalsIgnoreCase(name)) {
			purc_ac_ym(value);
			return;
		}
		if ($purc_ac_dt.equalsIgnoreCase(name)) {
			purc_ac_dt(value);
			return;
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
			return;
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
			return;
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			ptax_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($org_sync_flg.equalsIgnoreCase(name)) {
			org_sync_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		if ($purc_xrate_inpt_flg.equalsIgnoreCase(name)) {
			purc_xrate_inpt_flg(value);
			return;
		}
		if ($purc_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			purc_ptax_xrate_inpt_flg(value);
			return;
		}
		if ($purc_upri_not_tgt_flg.equalsIgnoreCase(name)) {
			purc_upri_not_tgt_flg(value);
			return;
		}
		if ($purc_interim_flg.equalsIgnoreCase(name)) {
			purc_interim_flg(value);
			return;
		}
		if ($purc_tax_fix_flg.equalsIgnoreCase(name)) {
			purc_tax_fix_flg(value);
			return;
		}
		if ($purc_inc_tax_flg.equalsIgnoreCase(name)) {
			purc_inc_tax_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($arr_schd_lot_fix_flg.equalsIgnoreCase(name)) {
			arr_schd_lot_fix_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		if ($purc_schd_inc_tax_flg.equalsIgnoreCase(name)) {
			purc_schd_inc_tax_flg(value);
			return;
		}
		if ($new_inc_tax_flg.equalsIgnoreCase(name)) {
			new_inc_tax_flg(value);
			return;
		}
		if ($new_purc_inc_tax_flg.equalsIgnoreCase(name)) {
			new_purc_inc_tax_flg(value);
			return;
		}
		if ($sls_dtl_upd_flg.equalsIgnoreCase(name)) {
			sls_dtl_upd_flg(value);
			return;
		}
		if ($init_inc_tax_flg.equalsIgnoreCase(name)) {
			init_inc_tax_flg(value);
			return;
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			purc_dtl_upd_flg(value);
			return;
		}
		if ($purc_init_inc_tax_flg.equalsIgnoreCase(name)) {
			purc_init_inc_tax_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
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
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			sls_rsn_cd(value);
			return;
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			sls_rsn_nm(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_purc_act_d_no.equalsIgnoreCase(name)) {
			ext_purc_act_d_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
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
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
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
		if ($purc_trd_cur_cd.equalsIgnoreCase(name)) {
			purc_trd_cur_cd(value);
			return;
		}
		if ($purc_trd_cur_nm.equalsIgnoreCase(name)) {
			purc_trd_cur_nm(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			purc_tax_nm(value);
			return;
		}
		if ($purc_tax_typ.equalsIgnoreCase(name)) {
			purc_tax_typ(value);
			return;
		}
		if ($purc_dscnt_rsn_cd.equalsIgnoreCase(name)) {
			purc_dscnt_rsn_cd(value);
			return;
		}
		if ($purc_dscnt_rsn_nm.equalsIgnoreCase(name)) {
			purc_dscnt_rsn_nm(value);
			return;
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			purc_rsn_cd(value);
			return;
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			purc_rsn_nm(value);
			return;
		}
		if ($purc_bd_dpt_cd.equalsIgnoreCase(name)) {
			purc_bd_dpt_cd(value);
			return;
		}
		if ($purc_bd_dpt_nm.equalsIgnoreCase(name)) {
			purc_bd_dpt_nm(value);
			return;
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
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
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			sls_schd_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($schd_tax_cd.equalsIgnoreCase(name)) {
			schd_tax_cd(value);
			return;
		}
		if ($purc_schd_tax_cd.equalsIgnoreCase(name)) {
			purc_schd_tax_cd(value);
			return;
		}
		if ($purc_trd_unit_cd.equalsIgnoreCase(name)) {
			purc_trd_unit_cd(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_upri_rnd_typ.equalsIgnoreCase(name)) {
			purc_upri_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($new_tax_cd.equalsIgnoreCase(name)) {
			new_tax_cd(value);
			return;
		}
		if ($new_tax_nm.equalsIgnoreCase(name)) {
			new_tax_nm(value);
			return;
		}
		if ($new_tax_typ.equalsIgnoreCase(name)) {
			new_tax_typ(value);
			return;
		}
		if ($new_purc_tax_cd.equalsIgnoreCase(name)) {
			new_purc_tax_cd(value);
			return;
		}
		if ($new_purc_tax_nm.equalsIgnoreCase(name)) {
			new_purc_tax_nm(value);
			return;
		}
		if ($new_purc_tax_typ.equalsIgnoreCase(name)) {
			new_purc_tax_typ(value);
			return;
		}
		if ($init_trd_unit_cd.equalsIgnoreCase(name)) {
			init_trd_unit_cd(value);
			return;
		}
		if ($purc_init_trd_unit_cd.equalsIgnoreCase(name)) {
			purc_init_trd_unit_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sls_schd_qty.equalsIgnoreCase(name)) {
			sls_schd_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($purc_xrate.equalsIgnoreCase(name)) {
			purc_xrate(value);
			return;
		}
		if ($purc_ptax_xrate.equalsIgnoreCase(name)) {
			purc_ptax_xrate(value);
			return;
		}
		if ($purc_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_trd_cur_upri(value);
			return;
		}
		if ($purc_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_amt(value);
			return;
		}
		if ($purc_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_tax_rate.equalsIgnoreCase(name)) {
			purc_tax_rate(value);
			return;
		}
		if ($purc_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_base_cur_upri.equalsIgnoreCase(name)) {
			purc_base_cur_upri(value);
			return;
		}
		if ($purc_base_cur_amt.equalsIgnoreCase(name)) {
			purc_base_cur_amt(value);
			return;
		}
		if ($purc_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_base_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_tax_amt(value);
			return;
		}
		if ($purc_base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_base_cur_dscnt_amt(value);
			return;
		}
		if ($purc_ptax_cur_upri.equalsIgnoreCase(name)) {
			purc_ptax_cur_upri(value);
			return;
		}
		if ($purc_ptax_cur_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_amt(value);
			return;
		}
		if ($purc_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_dscnt_amt(value);
			return;
		}
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_schd_tax_rate.equalsIgnoreCase(name)) {
			purc_schd_tax_rate(value);
			return;
		}
		if ($purc_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_qty(value);
			return;
		}
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($new_purc_tax_rate.equalsIgnoreCase(name)) {
			new_purc_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sls_schd_qty.equalsIgnoreCase(name)) {
			sls_schd_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($purc_xrate.equalsIgnoreCase(name)) {
			purc_xrate(value);
			return;
		}
		if ($purc_ptax_xrate.equalsIgnoreCase(name)) {
			purc_ptax_xrate(value);
			return;
		}
		if ($purc_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_trd_cur_upri(value);
			return;
		}
		if ($purc_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_amt(value);
			return;
		}
		if ($purc_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_tax_rate.equalsIgnoreCase(name)) {
			purc_tax_rate(value);
			return;
		}
		if ($purc_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_base_cur_upri.equalsIgnoreCase(name)) {
			purc_base_cur_upri(value);
			return;
		}
		if ($purc_base_cur_amt.equalsIgnoreCase(name)) {
			purc_base_cur_amt(value);
			return;
		}
		if ($purc_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_base_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_tax_amt(value);
			return;
		}
		if ($purc_base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_base_cur_dscnt_amt(value);
			return;
		}
		if ($purc_ptax_cur_upri.equalsIgnoreCase(name)) {
			purc_ptax_cur_upri(value);
			return;
		}
		if ($purc_ptax_cur_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_amt(value);
			return;
		}
		if ($purc_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_dscnt_amt(value);
			return;
		}
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_schd_tax_rate.equalsIgnoreCase(name)) {
			purc_schd_tax_rate(value);
			return;
		}
		if ($purc_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_qty(value);
			return;
		}
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($new_purc_tax_rate.equalsIgnoreCase(name)) {
			new_purc_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sls_schd_qty.equalsIgnoreCase(name)) {
			sls_schd_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($purc_xrate.equalsIgnoreCase(name)) {
			purc_xrate(value);
			return;
		}
		if ($purc_ptax_xrate.equalsIgnoreCase(name)) {
			purc_ptax_xrate(value);
			return;
		}
		if ($purc_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_trd_cur_upri(value);
			return;
		}
		if ($purc_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_amt(value);
			return;
		}
		if ($purc_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_tax_rate.equalsIgnoreCase(name)) {
			purc_tax_rate(value);
			return;
		}
		if ($purc_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_base_cur_upri.equalsIgnoreCase(name)) {
			purc_base_cur_upri(value);
			return;
		}
		if ($purc_base_cur_amt.equalsIgnoreCase(name)) {
			purc_base_cur_amt(value);
			return;
		}
		if ($purc_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_base_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_tax_amt(value);
			return;
		}
		if ($purc_base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_base_cur_dscnt_amt(value);
			return;
		}
		if ($purc_ptax_cur_upri.equalsIgnoreCase(name)) {
			purc_ptax_cur_upri(value);
			return;
		}
		if ($purc_ptax_cur_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_amt(value);
			return;
		}
		if ($purc_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_dscnt_amt(value);
			return;
		}
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_schd_tax_rate.equalsIgnoreCase(name)) {
			purc_schd_tax_rate(value);
			return;
		}
		if ($purc_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_qty(value);
			return;
		}
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($new_purc_tax_rate.equalsIgnoreCase(name)) {
			new_purc_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sls_schd_qty.equalsIgnoreCase(name)) {
			sls_schd_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($purc_xrate.equalsIgnoreCase(name)) {
			purc_xrate(value);
			return;
		}
		if ($purc_ptax_xrate.equalsIgnoreCase(name)) {
			purc_ptax_xrate(value);
			return;
		}
		if ($purc_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_trd_cur_upri(value);
			return;
		}
		if ($purc_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_amt(value);
			return;
		}
		if ($purc_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_tax_rate.equalsIgnoreCase(name)) {
			purc_tax_rate(value);
			return;
		}
		if ($purc_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_base_cur_upri.equalsIgnoreCase(name)) {
			purc_base_cur_upri(value);
			return;
		}
		if ($purc_base_cur_amt.equalsIgnoreCase(name)) {
			purc_base_cur_amt(value);
			return;
		}
		if ($purc_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_base_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_tax_amt(value);
			return;
		}
		if ($purc_base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_base_cur_dscnt_amt(value);
			return;
		}
		if ($purc_ptax_cur_upri.equalsIgnoreCase(name)) {
			purc_ptax_cur_upri(value);
			return;
		}
		if ($purc_ptax_cur_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_amt(value);
			return;
		}
		if ($purc_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_dscnt_amt(value);
			return;
		}
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_schd_tax_rate.equalsIgnoreCase(name)) {
			purc_schd_tax_rate(value);
			return;
		}
		if ($purc_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_qty(value);
			return;
		}
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($new_purc_tax_rate.equalsIgnoreCase(name)) {
			new_purc_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sls_schd_qty.equalsIgnoreCase(name)) {
			sls_schd_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_cont_qty.equalsIgnoreCase(name)) {
			purc_cont_qty(value);
			return;
		}
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($purc_xrate.equalsIgnoreCase(name)) {
			purc_xrate(value);
			return;
		}
		if ($purc_ptax_xrate.equalsIgnoreCase(name)) {
			purc_ptax_xrate(value);
			return;
		}
		if ($purc_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_trd_cur_upri(value);
			return;
		}
		if ($purc_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_amt(value);
			return;
		}
		if ($purc_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_tax_rate.equalsIgnoreCase(name)) {
			purc_tax_rate(value);
			return;
		}
		if ($purc_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_base_cur_upri.equalsIgnoreCase(name)) {
			purc_base_cur_upri(value);
			return;
		}
		if ($purc_base_cur_amt.equalsIgnoreCase(name)) {
			purc_base_cur_amt(value);
			return;
		}
		if ($purc_base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_base_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_base_cur_tax_amt(value);
			return;
		}
		if ($purc_base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_base_cur_dscnt_amt(value);
			return;
		}
		if ($purc_ptax_cur_upri.equalsIgnoreCase(name)) {
			purc_ptax_cur_upri(value);
			return;
		}
		if ($purc_ptax_cur_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_amt(value);
			return;
		}
		if ($purc_ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_tax_amt(value);
			return;
		}
		if ($purc_ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_ptax_cur_dscnt_amt(value);
			return;
		}
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_schd_tax_rate.equalsIgnoreCase(name)) {
			purc_schd_tax_rate(value);
			return;
		}
		if ($purc_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_qty(value);
			return;
		}
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($new_purc_tax_rate.equalsIgnoreCase(name)) {
			new_purc_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			dlv_schd_dt(value);
			return;
		}
		if ($purc_ac_ym.equalsIgnoreCase(name)) {
			purc_ac_ym(value);
			return;
		}
		if ($purc_ac_dt.equalsIgnoreCase(name)) {
			purc_ac_dt(value);
			return;
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
			return;
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
			return;
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			ptax_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($org_sync_flg.equalsIgnoreCase(name)) {
			org_sync_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		if ($purc_xrate_inpt_flg.equalsIgnoreCase(name)) {
			purc_xrate_inpt_flg(value);
			return;
		}
		if ($purc_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			purc_ptax_xrate_inpt_flg(value);
			return;
		}
		if ($purc_upri_not_tgt_flg.equalsIgnoreCase(name)) {
			purc_upri_not_tgt_flg(value);
			return;
		}
		if ($purc_interim_flg.equalsIgnoreCase(name)) {
			purc_interim_flg(value);
			return;
		}
		if ($purc_tax_fix_flg.equalsIgnoreCase(name)) {
			purc_tax_fix_flg(value);
			return;
		}
		if ($purc_inc_tax_flg.equalsIgnoreCase(name)) {
			purc_inc_tax_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($arr_schd_lot_fix_flg.equalsIgnoreCase(name)) {
			arr_schd_lot_fix_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		if ($purc_schd_inc_tax_flg.equalsIgnoreCase(name)) {
			purc_schd_inc_tax_flg(value);
			return;
		}
		if ($new_inc_tax_flg.equalsIgnoreCase(name)) {
			new_inc_tax_flg(value);
			return;
		}
		if ($new_purc_inc_tax_flg.equalsIgnoreCase(name)) {
			new_purc_inc_tax_flg(value);
			return;
		}
		if ($sls_dtl_upd_flg.equalsIgnoreCase(name)) {
			sls_dtl_upd_flg(value);
			return;
		}
		if ($init_inc_tax_flg.equalsIgnoreCase(name)) {
			init_inc_tax_flg(value);
			return;
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			purc_dtl_upd_flg(value);
			return;
		}
		if ($purc_init_inc_tax_flg.equalsIgnoreCase(name)) {
			purc_init_inc_tax_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dtl1.equalsIgnoreCase(name)) {
			return dtl1();
		}
		if ($hdr.equalsIgnoreCase(name)) {
			return hdr();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dtl1.equalsIgnoreCase(name)) {
			dtl1(
				((MCContainerMeta) dtl1_META).castInnerRow(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class, value)
			);
			return;
		}
		if ($hdr.equalsIgnoreCase(name)) {
			hdr(
				((MCContainerMeta) hdr_META).castInnerRow(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCNumber peg_no() {
		return dtl1().peg_no();
	}

	public void peg_no(MCNumber value) {
		dtl1().peg_no(value);
	}

	public void peg_no(int value) {
		dtl1().peg_no(value);
	}

	public void peg_no(long value) {
		dtl1().peg_no(value);
	}

	public void peg_no(float value) {
		dtl1().peg_no(value);
	}

	public void peg_no(double value) {
		dtl1().peg_no(value);
	}

	public String trd_unit_cd() {
		return dtl1().trd_unit_cd();
	}

	public void trd_unit_cd(String value) {
		dtl1().trd_unit_cd(value);
	}

	public MCNumber trd_unit_qty() {
		return dtl1().trd_unit_qty();
	}

	public void trd_unit_qty(MCNumber value) {
		dtl1().trd_unit_qty(value);
	}

	public void trd_unit_qty(int value) {
		dtl1().trd_unit_qty(value);
	}

	public void trd_unit_qty(long value) {
		dtl1().trd_unit_qty(value);
	}

	public void trd_unit_qty(float value) {
		dtl1().trd_unit_qty(value);
	}

	public void trd_unit_qty(double value) {
		dtl1().trd_unit_qty(value);
	}

	public MCNumber trd_unit_conv_base_qty() {
		return dtl1().trd_unit_conv_base_qty();
	}

	public void trd_unit_conv_base_qty(MCNumber value) {
		dtl1().trd_unit_conv_base_qty(value);
	}

	public void trd_unit_conv_base_qty(int value) {
		dtl1().trd_unit_conv_base_qty(value);
	}

	public void trd_unit_conv_base_qty(long value) {
		dtl1().trd_unit_conv_base_qty(value);
	}

	public void trd_unit_conv_base_qty(float value) {
		dtl1().trd_unit_conv_base_qty(value);
	}

	public void trd_unit_conv_base_qty(double value) {
		dtl1().trd_unit_conv_base_qty(value);
	}

	public MCNumber trd_unit_conv_qty() {
		return dtl1().trd_unit_conv_qty();
	}

	public void trd_unit_conv_qty(MCNumber value) {
		dtl1().trd_unit_conv_qty(value);
	}

	public void trd_unit_conv_qty(int value) {
		dtl1().trd_unit_conv_qty(value);
	}

	public void trd_unit_conv_qty(long value) {
		dtl1().trd_unit_conv_qty(value);
	}

	public void trd_unit_conv_qty(float value) {
		dtl1().trd_unit_conv_qty(value);
	}

	public void trd_unit_conv_qty(double value) {
		dtl1().trd_unit_conv_qty(value);
	}

	public String schd_unit_cd() {
		return hdr().trd_unit_cd();
	}

	public void schd_unit_cd(String value) {
		hdr().trd_unit_cd(value);
	}

	public MCNumber schd_qty() {
		return hdr().trd_unit_qty();
	}

	public void schd_qty(MCNumber value) {
		hdr().trd_unit_qty(value);
	}

	public void schd_qty(int value) {
		hdr().trd_unit_qty(value);
	}

	public void schd_qty(long value) {
		hdr().trd_unit_qty(value);
	}

	public void schd_qty(float value) {
		hdr().trd_unit_qty(value);
	}

	public void schd_qty(double value) {
		hdr().trd_unit_qty(value);
	}

	public MCNumber schd_upri() {
		return hdr().trd_cur_upri();
	}

	public void schd_upri(MCNumber value) {
		hdr().trd_cur_upri(value);
	}

	public void schd_upri(int value) {
		hdr().trd_cur_upri(value);
	}

	public void schd_upri(long value) {
		hdr().trd_cur_upri(value);
	}

	public void schd_upri(float value) {
		hdr().trd_cur_upri(value);
	}

	public void schd_upri(double value) {
		hdr().trd_cur_upri(value);
	}

	public MCNumber schd_dscnt_amt() {
		return hdr().trd_cur_dscnt_amt();
	}

	public void schd_dscnt_amt(MCNumber value) {
		hdr().trd_cur_dscnt_amt(value);
	}

	public void schd_dscnt_amt(int value) {
		hdr().trd_cur_dscnt_amt(value);
	}

	public void schd_dscnt_amt(long value) {
		hdr().trd_cur_dscnt_amt(value);
	}

	public void schd_dscnt_amt(float value) {
		hdr().trd_cur_dscnt_amt(value);
	}

	public void schd_dscnt_amt(double value) {
		hdr().trd_cur_dscnt_amt(value);
	}

	public MCNumber schd_amt() {
		return hdr().trd_cur_amt();
	}

	public void schd_amt(MCNumber value) {
		hdr().trd_cur_amt(value);
	}

	public void schd_amt(int value) {
		hdr().trd_cur_amt(value);
	}

	public void schd_amt(long value) {
		hdr().trd_cur_amt(value);
	}

	public void schd_amt(float value) {
		hdr().trd_cur_amt(value);
	}

	public void schd_amt(double value) {
		hdr().trd_cur_amt(value);
	}

	public MCNumber schd_tax_amt() {
		return hdr().trd_cur_tax_amt();
	}

	public void schd_tax_amt(MCNumber value) {
		hdr().trd_cur_tax_amt(value);
	}

	public void schd_tax_amt(int value) {
		hdr().trd_cur_tax_amt(value);
	}

	public void schd_tax_amt(long value) {
		hdr().trd_cur_tax_amt(value);
	}

	public void schd_tax_amt(float value) {
		hdr().trd_cur_tax_amt(value);
	}

	public void schd_tax_amt(double value) {
		hdr().trd_cur_tax_amt(value);
	}

	public MCNumber schd_inc_tax_amt() {
		return hdr().trd_cur_inc_tax_amt();
	}

	public void schd_inc_tax_amt(MCNumber value) {
		hdr().trd_cur_inc_tax_amt(value);
	}

	public void schd_inc_tax_amt(int value) {
		hdr().trd_cur_inc_tax_amt(value);
	}

	public void schd_inc_tax_amt(long value) {
		hdr().trd_cur_inc_tax_amt(value);
	}

	public void schd_inc_tax_amt(float value) {
		hdr().trd_cur_inc_tax_amt(value);
	}

	public void schd_inc_tax_amt(double value) {
		hdr().trd_cur_inc_tax_amt(value);
	}

	public MCNumber schd_dec_place() {
		return hdr().base_unit_dec_place();
	}

	public void schd_dec_place(MCNumber value) {
		hdr().base_unit_dec_place(value);
	}

	public void schd_dec_place(int value) {
		hdr().base_unit_dec_place(value);
	}

	public void schd_dec_place(long value) {
		hdr().base_unit_dec_place(value);
	}

	public void schd_dec_place(float value) {
		hdr().base_unit_dec_place(value);
	}

	public void schd_dec_place(double value) {
		hdr().base_unit_dec_place(value);
	}

	public String schd_rnd_typ() {
		return hdr().base_unit_rnd_typ();
	}

	public void schd_rnd_typ(String value) {
		hdr().base_unit_rnd_typ(value);
	}

	public MCNumber schd_conv_qty() {
		return hdr().trd_unit_conv_qty();
	}

	public void schd_conv_qty(MCNumber value) {
		hdr().trd_unit_conv_qty(value);
	}

	public void schd_conv_qty(int value) {
		hdr().trd_unit_conv_qty(value);
	}

	public void schd_conv_qty(long value) {
		hdr().trd_unit_conv_qty(value);
	}

	public void schd_conv_qty(float value) {
		hdr().trd_unit_conv_qty(value);
	}

	public void schd_conv_qty(double value) {
		hdr().trd_unit_conv_qty(value);
	}

	public MCNumber schd_conv_base_qty() {
		return hdr().trd_unit_conv_base_qty();
	}

	public void schd_conv_base_qty(MCNumber value) {
		hdr().trd_unit_conv_base_qty(value);
	}

	public void schd_conv_base_qty(int value) {
		hdr().trd_unit_conv_base_qty(value);
	}

	public void schd_conv_base_qty(long value) {
		hdr().trd_unit_conv_base_qty(value);
	}

	public void schd_conv_base_qty(float value) {
		hdr().trd_unit_conv_base_qty(value);
	}

	public void schd_conv_base_qty(double value) {
		hdr().trd_unit_conv_base_qty(value);
	}

	public MCNumber schd_tax_rate() {
		return hdr().tax_rate();
	}

	public void schd_tax_rate(MCNumber value) {
		hdr().tax_rate(value);
	}

	public void schd_tax_rate(int value) {
		hdr().tax_rate(value);
	}

	public void schd_tax_rate(long value) {
		hdr().tax_rate(value);
	}

	public void schd_tax_rate(float value) {
		hdr().tax_rate(value);
	}

	public void schd_tax_rate(double value) {
		hdr().tax_rate(value);
	}

	public boolean schd_inc_tax_flg() {
		return hdr().inc_tax_flg();
	}

	public void schd_inc_tax_flg(boolean value) {
		hdr().inc_tax_flg(value);
	}

	public String schd_cur_cd() {
		return hdr().trd_cur_cd();
	}

	public void schd_cur_cd(String value) {
		hdr().trd_cur_cd(value);
	}

	public MCNumber schd_amt_dec_place() {
		return hdr().amt_dec_place();
	}

	public void schd_amt_dec_place(MCNumber value) {
		hdr().amt_dec_place(value);
	}

	public void schd_amt_dec_place(int value) {
		hdr().amt_dec_place(value);
	}

	public void schd_amt_dec_place(long value) {
		hdr().amt_dec_place(value);
	}

	public void schd_amt_dec_place(float value) {
		hdr().amt_dec_place(value);
	}

	public void schd_amt_dec_place(double value) {
		hdr().amt_dec_place(value);
	}

	public MCNumber schd_upri_dec_place() {
		return hdr().upri_dec_place();
	}

	public void schd_upri_dec_place(MCNumber value) {
		hdr().upri_dec_place(value);
	}

	public void schd_upri_dec_place(int value) {
		hdr().upri_dec_place(value);
	}

	public void schd_upri_dec_place(long value) {
		hdr().upri_dec_place(value);
	}

	public void schd_upri_dec_place(float value) {
		hdr().upri_dec_place(value);
	}

	public void schd_upri_dec_place(double value) {
		hdr().upri_dec_place(value);
	}

	public String schd_amt_rnd_typ() {
		return hdr().amt_rnd_typ();
	}

	public void schd_amt_rnd_typ(String value) {
		hdr().amt_rnd_typ(value);
	}

	public String schd_tax_rnd_typ() {
		return hdr().tax_rnd_typ();
	}

	public void schd_tax_rnd_typ(String value) {
		hdr().tax_rnd_typ(value);
	}

}

