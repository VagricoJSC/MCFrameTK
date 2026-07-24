package mcframe.commonPFBA.PFBAR5810;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 *  会社ＣＤ.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 *  仕訳グループＮＯ.<p>
	 *
	 */
	public static final String $jnl_grp_no = "jnl_grp_no";
	/**
	 *  計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 *  会計ＩＦ区分.<p>
	 *
	 */
	public static final String $ac_if_typ = "ac_if_typ";
	/**
	 *  伝票グループＩＤ.<p>
	 *
	 */
	public static final String $slip_cnt_id = "slip_cnt_id";
	/**
	 *  仕訳伝票ＮＯ.<p>
	 *
	 */
	public static final String $jnl_no = "jnl_no";
	/**
	 *  仕訳伝票明細番号.<p>
	 *
	 */
	public static final String $jnl_no_seq = "jnl_no_seq";
	/**
	 *  貸借区分.<p>
	 *
	 */
	public static final String $dc_typ = "dc_typ";
	/**
	 *  会計伝票日付.<p>
	 *
	 */
	public static final String $ac_slip_dt = "ac_slip_dt";
	/**
	 *  計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 *  伝票ＮＯ.<p>
	 *
	 */
	public static final String $slip_no = "slip_no";
	/**
	 *  伝票連番.<p>
	 *
	 */
	public static final String $slip_seq_no = "slip_seq_no";
	/**
	 *  部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 *  勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $ac_cd = "ac_cd";
	/**
	 *  補助勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $sub_ac_cd = "sub_ac_cd";
	/**
	 *  プロジェクトＣＤ.<p>
	 *
	 */
	public static final String $project_cd = "project_cd";
	/**
	 *  集計ＣＤ０.<p>
	 *
	 */
	public static final String $summary_cd0 = "summary_cd0";
	/**
	 *  集計ＣＤ１.<p>
	 *
	 */
	public static final String $summary_cd1 = "summary_cd1";
	/**
	 *  集計ＣＤ２.<p>
	 *
	 */
	public static final String $summary_cd2 = "summary_cd2";
	/**
	 *  集計ＣＤ３.<p>
	 *
	 */
	public static final String $summary_cd3 = "summary_cd3";
	/**
	 *  集計ＣＤ４.<p>
	 *
	 */
	public static final String $summary_cd4 = "summary_cd4";
	/**
	 *  集計ＣＤ５.<p>
	 *
	 */
	public static final String $summary_cd5 = "summary_cd5";
	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 *  枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 *  枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 *  品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  取引先区分.<p>
	 *
	 */
	public static final String $bp_typ = "bp_typ";
	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 *  基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 *  基準通貨単価.<p>
	 *
	 */
	public static final String $base_cur_upri = "base_cur_upri";
	/**
	 *  基準通貨税込金額.<p>
	 *
	 */
	public static final String $base_cur_sum_amt = "base_cur_sum_amt";
	/**
	 *  基準通貨金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 *  基準通貨税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 *  基準通貨税額計算基準金額.<p>
	 *
	 */
	public static final String $base_cur_tax_base_amt = "base_cur_tax_base_amt";
	/**
	 *  基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public static final String $trd_cur_sum_amt = "trd_cur_sum_amt";
	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 *  取引通貨税額計算基準金額.<p>
	 *
	 */
	public static final String $trd_cur_tax_base_amt = "trd_cur_tax_base_amt";
	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 *  納税通貨単価.<p>
	 *
	 */
	public static final String $ptax_cur_upri = "ptax_cur_upri";
	/**
	 *  納税通貨税込金額.<p>
	 *
	 */
	public static final String $ptax_cur_sum_amt = "ptax_cur_sum_amt";
	/**
	 *  納税通貨金額.<p>
	 *
	 */
	public static final String $ptax_cur_amt = "ptax_cur_amt";
	/**
	 *  納税通貨税額.<p>
	 *
	 */
	public static final String $ptax_cur_tax_amt = "ptax_cur_tax_amt";
	/**
	 *  納税通貨税額計算基準金額.<p>
	 *
	 */
	public static final String $ptax_cur_tax_base_amt = "ptax_cur_tax_base_amt";
	/**
	 *  納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 *  税区分.<p>
	 *
	 */
	public static final String $tax_typ = "tax_typ";
	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 *  外貨ＦＬＧ.<p>
	 *
	 */
	public static final String $foreign_flg = "foreign_flg";
	/**
	 *  為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 *  為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 *  納税為替レート.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	/**
	 *  納税為替レートＣＤ.<p>
	 *
	 */
	public static final String $ptax_xrate_cd = "ptax_xrate_cd";
	/**
	 *  インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 *  請求／支払ＮＯ.<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	/**
	 *  受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 *  担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 *  決算仕訳区分.<p>
	 *
	 */
	public static final String $cls_jnl_typ = "cls_jnl_typ";
	/**
	 *  配賦仕訳ＦＬＧ.<p>
	 *
	 */
	public static final String $alloc_jnl_flg = "alloc_jnl_flg";
	/**
	 *  都度精算ＦＬＧ.<p>
	 *
	 */
	public static final String $spot_flg = "spot_flg";
	/**
	 *  決済予定日.<p>
	 *
	 */
	public static final String $sttl_schd_dt = "sttl_schd_dt";
	/**
	 *  決済方法ＣＤ.<p>
	 *
	 */
	public static final String $sttl_cd = "sttl_cd";
	/**
	 *  口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public static final String $bank_cd = "bank_cd";
	/**
	 *  相手勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $other_ac_cd = "other_ac_cd";
	/**
	 *  相手補助勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $other_sub_ac_cd = "other_sub_ac_cd";
	/**
	 *  相手部門ＣＤ.<p>
	 *
	 */
	public static final String $other_dpt_cd = "other_dpt_cd";
	/**
	 *  摘要１.<p>
	 *
	 */
	public static final String $abstract1 = "abstract1";
	/**
	 *  摘要２.<p>
	 *
	 */
	public static final String $abstract2 = "abstract2";
	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $sub_char4 = "sub_char4";
	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $sub_char5 = "sub_char5";
	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public static final String $sub_char6 = "sub_char6";
	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public static final String $sub_char7 = "sub_char7";
	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public static final String $sub_char8 = "sub_char8";
	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public static final String $sub_char9 = "sub_char9";
	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public static final String $sub_char10 = "sub_char10";
	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $sub_num1 = "sub_num1";
	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public static final String $sub_num2 = "sub_num2";
	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public static final String $sub_num3 = "sub_num3";
	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $sub_dt1 = "sub_dt1";
	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public static final String $sub_dt2 = "sub_dt2";
	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public static final String $sub_dt3 = "sub_dt3";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $if_sub_char1 = "if_sub_char1";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $if_sub_char2 = "if_sub_char2";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $if_sub_char3 = "if_sub_char3";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $if_sub_char4 = "if_sub_char4";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $if_sub_char5 = "if_sub_char5";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public static final String $if_sub_char6 = "if_sub_char6";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public static final String $if_sub_char7 = "if_sub_char7";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public static final String $if_sub_char8 = "if_sub_char8";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public static final String $if_sub_char9 = "if_sub_char9";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public static final String $if_sub_char10 = "if_sub_char10";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public static final String $if_sub_char11 = "if_sub_char11";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public static final String $if_sub_char12 = "if_sub_char12";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public static final String $if_sub_char13 = "if_sub_char13";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public static final String $if_sub_char14 = "if_sub_char14";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public static final String $if_sub_char15 = "if_sub_char15";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public static final String $if_sub_char16 = "if_sub_char16";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public static final String $if_sub_char17 = "if_sub_char17";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public static final String $if_sub_char18 = "if_sub_char18";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public static final String $if_sub_char19 = "if_sub_char19";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public static final String $if_sub_char20 = "if_sub_char20";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public static final String $if_sub_char21 = "if_sub_char21";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public static final String $if_sub_char22 = "if_sub_char22";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public static final String $if_sub_char23 = "if_sub_char23";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public static final String $if_sub_char24 = "if_sub_char24";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public static final String $if_sub_char25 = "if_sub_char25";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public static final String $if_sub_char26 = "if_sub_char26";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public static final String $if_sub_char27 = "if_sub_char27";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public static final String $if_sub_char28 = "if_sub_char28";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public static final String $if_sub_char29 = "if_sub_char29";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public static final String $if_sub_char30 = "if_sub_char30";
	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $if_sub_num1 = "if_sub_num1";
	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public static final String $if_sub_num2 = "if_sub_num2";
	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public static final String $if_sub_num3 = "if_sub_num3";
	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public static final String $if_sub_num4 = "if_sub_num4";
	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public static final String $if_sub_num5 = "if_sub_num5";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $if_sub_dt1 = "if_sub_dt1";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public static final String $if_sub_dt2 = "if_sub_dt2";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public static final String $if_sub_dt3 = "if_sub_dt3";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public static final String $if_sub_dt4 = "if_sub_dt4";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public static final String $if_sub_dt5 = "if_sub_dt5";


	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta jnl_grp_no_META = createCommonMeta($jnl_grp_no, mcframe.commonMA.meta.MA_META.JNL_GRP_NO);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_if_typ_META = createCommonMeta($ac_if_typ, mcframe.commonMA.meta.MA_META.AC_IF_TYP);
	public static final MCMeta slip_cnt_id_META = createCommonMeta($slip_cnt_id, mcframe.commonMA.meta.MA_META.SLIP_CNT_ID);
	public static final MCMeta jnl_no_META = createCommonMeta($jnl_no, mcframe.commonMA.meta.MA_META.JNL_NO);
	public static final MCMeta jnl_no_seq_META = createCommonMeta($jnl_no_seq, mcframe.commonMA.meta.MA_META.JNL_NO_SEQ);
	public static final MCMeta dc_typ_META = createCommonMeta($dc_typ, mcframe.commonMA.meta.MA_META.DC_TYP);
	public static final MCMeta ac_slip_dt_META = createCommonMeta($ac_slip_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slip_no_META = createCommonMeta($slip_no, mcframe.commonMA.meta.MA_META.SLIP_NO);
	public static final MCMeta slip_seq_no_META = createCommonMeta($slip_seq_no, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta ac_cd_META = createCommonMeta($ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta sub_ac_cd_META = createCommonMeta($sub_ac_cd, mcframe.commonMA.meta.MA_META.SUB_AC_CD);
	public static final MCMeta project_cd_META = createCommonMeta($project_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta summary_cd0_META = createCommonMeta($summary_cd0, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta summary_cd1_META = createCommonMeta($summary_cd1, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta summary_cd2_META = createCommonMeta($summary_cd2, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta summary_cd3_META = createCommonMeta($summary_cd3, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta summary_cd4_META = createCommonMeta($summary_cd4, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta summary_cd5_META = createCommonMeta($summary_cd5, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta bp_typ_META = createCommonMeta($bp_typ, mcframe.commonMA.meta.MA_META.MASTER_TYP);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta base_cur_upri_META = createCommonMeta($base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_sum_amt_META = createCommonMeta($base_cur_sum_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_base_amt_META = createCommonMeta($base_cur_tax_base_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_sum_amt_META = createCommonMeta($trd_cur_sum_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_base_amt_META = createCommonMeta($trd_cur_tax_base_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta ptax_cur_upri_META = createCommonMeta($ptax_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_sum_amt_META = createCommonMeta($ptax_cur_sum_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_amt_META = createCommonMeta($ptax_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_tax_amt_META = createCommonMeta($ptax_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_tax_base_amt_META = createCommonMeta($ptax_cur_tax_base_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta foreign_flg_META = createCommonMeta($foreign_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_xrate_cd_META = createCommonMeta($ptax_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_PAY_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta cls_jnl_typ_META = createCommonMeta($cls_jnl_typ, mcframe.commonMA.meta.MA_META.CLS_JNL_TYP);
	public static final MCMeta alloc_jnl_flg_META = createCommonMeta($alloc_jnl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spot_flg_META = createCommonMeta($spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sttl_schd_dt_META = createCommonMeta($sttl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sttl_cd_META = createCommonMeta($sttl_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta other_ac_cd_META = createCommonMeta($other_ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta other_sub_ac_cd_META = createCommonMeta($other_sub_ac_cd, mcframe.commonMA.meta.MA_META.SUB_AC_CD);
	public static final MCMeta other_dpt_cd_META = createCommonMeta($other_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta abstract1_META = createCommonMeta($abstract1, mcframe.commonMA.meta.MA_META.ABSTRACT_T);
	public static final MCMeta abstract2_META = createCommonMeta($abstract2, mcframe.commonMA.meta.MA_META.ABSTRACT_T);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.SUB_CHAR3);
	public static final MCMeta sub_char4_META = createCommonMeta($sub_char4, mcframe.commonMA.meta.MA_META.SUB_CHAR4);
	public static final MCMeta sub_char5_META = createCommonMeta($sub_char5, mcframe.commonMA.meta.MA_META.SUB_CHAR5);
	public static final MCMeta sub_char6_META = createCommonMeta($sub_char6, mcframe.commonMA.meta.MA_META.SUB_CHAR6);
	public static final MCMeta sub_char7_META = createCommonMeta($sub_char7, mcframe.commonMA.meta.MA_META.SUB_CHAR7);
	public static final MCMeta sub_char8_META = createCommonMeta($sub_char8, mcframe.commonMA.meta.MA_META.SUB_CHAR8);
	public static final MCMeta sub_char9_META = createCommonMeta($sub_char9, mcframe.commonMA.meta.MA_META.SUB_CHAR9);
	public static final MCMeta sub_char10_META = createCommonMeta($sub_char10, mcframe.commonMA.meta.MA_META.SUB_CHAR10);
	public static final MCMeta sub_num1_META = createCommonMeta($sub_num1, mcframe.commonMA.meta.MA_META.SUB_NUM1);
	public static final MCMeta sub_num2_META = createCommonMeta($sub_num2, mcframe.commonMA.meta.MA_META.SUB_NUM2);
	public static final MCMeta sub_num3_META = createCommonMeta($sub_num3, mcframe.commonMA.meta.MA_META.SUB_NUM3);
	public static final MCMeta sub_dt1_META = createCommonMeta($sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt2_META = createCommonMeta($sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt3_META = createCommonMeta($sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_char1_META = createCommonMeta($if_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta if_sub_char2_META = createCommonMeta($if_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta if_sub_char3_META = createCommonMeta($if_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta if_sub_char4_META = createCommonMeta($if_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta if_sub_char5_META = createCommonMeta($if_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta if_sub_char6_META = createCommonMeta($if_sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta if_sub_char7_META = createCommonMeta($if_sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta if_sub_char8_META = createCommonMeta($if_sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta if_sub_char9_META = createCommonMeta($if_sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta if_sub_char10_META = createCommonMeta($if_sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta if_sub_char11_META = createCommonMeta($if_sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta if_sub_char12_META = createCommonMeta($if_sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta if_sub_char13_META = createCommonMeta($if_sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta if_sub_char14_META = createCommonMeta($if_sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta if_sub_char15_META = createCommonMeta($if_sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta if_sub_char16_META = createCommonMeta($if_sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta if_sub_char17_META = createCommonMeta($if_sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta if_sub_char18_META = createCommonMeta($if_sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta if_sub_char19_META = createCommonMeta($if_sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta if_sub_char20_META = createCommonMeta($if_sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta if_sub_char21_META = createCommonMeta($if_sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta if_sub_char22_META = createCommonMeta($if_sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta if_sub_char23_META = createCommonMeta($if_sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta if_sub_char24_META = createCommonMeta($if_sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta if_sub_char25_META = createCommonMeta($if_sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta if_sub_char26_META = createCommonMeta($if_sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta if_sub_char27_META = createCommonMeta($if_sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta if_sub_char28_META = createCommonMeta($if_sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta if_sub_char29_META = createCommonMeta($if_sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta if_sub_char30_META = createCommonMeta($if_sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta if_sub_num1_META = createCommonMeta($if_sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta if_sub_num2_META = createCommonMeta($if_sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta if_sub_num3_META = createCommonMeta($if_sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta if_sub_num4_META = createCommonMeta($if_sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta if_sub_num5_META = createCommonMeta($if_sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta if_sub_dt1_META = createCommonMeta($if_sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt2_META = createCommonMeta($if_sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt3_META = createCommonMeta($if_sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt4_META = createCommonMeta($if_sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt5_META = createCommonMeta($if_sub_dt5, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			co_cd_META,
			jnl_grp_no_META,
			ac_ym_META,
			ac_if_typ_META,
			slip_cnt_id_META,
			jnl_no_META,
			jnl_no_seq_META,
			dc_typ_META,
			ac_slip_dt_META,
			ac_dt_META,
			slip_no_META,
			slip_seq_no_META,
			dpt_cd_META,
			ac_cd_META,
			sub_ac_cd_META,
			project_cd_META,
			summary_cd0_META,
			summary_cd1_META,
			summary_cd2_META,
			summary_cd3_META,
			summary_cd4_META,
			summary_cd5_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			bp_typ_META,
			bp_cd_META,
			base_unit_qty_META,
			base_unit_cd_META,
			base_cur_upri_META,
			base_cur_sum_amt_META,
			base_cur_amt_META,
			base_cur_tax_amt_META,
			base_cur_tax_base_amt_META,
			base_cur_cd_META,
			trd_cur_upri_META,
			trd_cur_sum_amt_META,
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			trd_cur_tax_base_amt_META,
			trd_cur_cd_META,
			ptax_cur_upri_META,
			ptax_cur_sum_amt_META,
			ptax_cur_amt_META,
			ptax_cur_tax_amt_META,
			ptax_cur_tax_base_amt_META,
			ptax_cur_cd_META,
			tax_typ_META,
			tax_cd_META,
			foreign_flg_META,
			xrate_META,
			xrate_cd_META,
			ptax_xrate_META,
			ptax_xrate_cd_META,
			iv_no_META,
			bill_no_META,
			slo_no_META,
			po_no_META,
			usr_cd_META,
			cls_jnl_typ_META,
			alloc_jnl_flg_META,
			spot_flg_META,
			sttl_schd_dt_META,
			sttl_cd_META,
			bank_ac_cd_META,
			bank_cd_META,
			other_ac_cd_META,
			other_sub_ac_cd_META,
			other_dpt_cd_META,
			abstract1_META,
			abstract2_META,
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
			sub_num1_META,
			sub_num2_META,
			sub_num3_META,
			sub_dt1_META,
			sub_dt2_META,
			sub_dt3_META,
			if_sub_char1_META,
			if_sub_char2_META,
			if_sub_char3_META,
			if_sub_char4_META,
			if_sub_char5_META,
			if_sub_char6_META,
			if_sub_char7_META,
			if_sub_char8_META,
			if_sub_char9_META,
			if_sub_char10_META,
			if_sub_char11_META,
			if_sub_char12_META,
			if_sub_char13_META,
			if_sub_char14_META,
			if_sub_char15_META,
			if_sub_char16_META,
			if_sub_char17_META,
			if_sub_char18_META,
			if_sub_char19_META,
			if_sub_char20_META,
			if_sub_char21_META,
			if_sub_char22_META,
			if_sub_char23_META,
			if_sub_char24_META,
			if_sub_char25_META,
			if_sub_char26_META,
			if_sub_char27_META,
			if_sub_char28_META,
			if_sub_char29_META,
			if_sub_char30_META,
			if_sub_num1_META,
			if_sub_num2_META,
			if_sub_num3_META,
			if_sub_num4_META,
			if_sub_num5_META,
			if_sub_dt1_META,
			if_sub_dt2_META,
			if_sub_dt3_META,
			if_sub_dt4_META,
			if_sub_dt5_META
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  会社ＣＤ.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 0, $co_cd);
	}

	/**
	 *  会社ＣＤ.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 0, $co_cd, value);
	}


	/**
	 *  仕訳グループＮＯ.<p>
	 *
	 */
	public String jnl_grp_no() {
		return getConstString(offset + 1, $jnl_grp_no);
	}

	/**
	 *  仕訳グループＮＯ.<p>
	 *
	 */
	public void jnl_grp_no(String value) {
		setConstString(offset + 1, $jnl_grp_no, value);
	}


	/**
	 *  計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 2, $ac_ym);
	}

	/**
	 *  計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 2, $ac_ym, value);
	}


	/**
	 *  会計ＩＦ区分.<p>
	 *
	 */
	public String ac_if_typ() {
		return getConstString(offset + 3, $ac_if_typ);
	}

	/**
	 *  会計ＩＦ区分.<p>
	 *
	 */
	public void ac_if_typ(String value) {
		setConstString(offset + 3, $ac_if_typ, value);
	}


	/**
	 *  伝票グループＩＤ.<p>
	 *
	 */
	public String slip_cnt_id() {
		return getConstString(offset + 4, $slip_cnt_id);
	}

	/**
	 *  伝票グループＩＤ.<p>
	 *
	 */
	public void slip_cnt_id(String value) {
		setConstString(offset + 4, $slip_cnt_id, value);
	}


	/**
	 *  仕訳伝票ＮＯ.<p>
	 *
	 */
	public String jnl_no() {
		return getConstString(offset + 5, $jnl_no);
	}

	/**
	 *  仕訳伝票ＮＯ.<p>
	 *
	 */
	public void jnl_no(String value) {
		setConstString(offset + 5, $jnl_no, value);
	}


	/**
	 *  仕訳伝票明細番号.<p>
	 *
	 */
	public MCNumber jnl_no_seq() {
		return getConstNumber(offset + 6, $jnl_no_seq);
	}

	/**
	 *  仕訳伝票明細番号.<p>
	 *
	 */
	public void jnl_no_seq(MCNumber value) {
		setConstNumber(offset + 6, $jnl_no_seq, value);
	}

	/**
	 *  仕訳伝票明細番号.<p>
	 *
	 */
	public void jnl_no_seq(int value) {
		setConstNumber(offset + 6, $jnl_no_seq, value);
	}

	/**
	 *  仕訳伝票明細番号.<p>
	 *
	 */
	public void jnl_no_seq(long value) {
		setConstNumber(offset + 6, $jnl_no_seq, value);
	}

	/**
	 *  仕訳伝票明細番号.<p>
	 *
	 */
	public void jnl_no_seq(float value) {
		setConstNumber(offset + 6, $jnl_no_seq, value);
	}

	/**
	 *  仕訳伝票明細番号.<p>
	 *
	 */
	public void jnl_no_seq(double value) {
		setConstNumber(offset + 6, $jnl_no_seq, value);
	}


	/**
	 *  貸借区分.<p>
	 *
	 */
	public String dc_typ() {
		return getConstString(offset + 7, $dc_typ);
	}

	/**
	 *  貸借区分.<p>
	 *
	 */
	public void dc_typ(String value) {
		setConstString(offset + 7, $dc_typ, value);
	}


	/**
	 *  会計伝票日付.<p>
	 *
	 */
	public MCDate ac_slip_dt() {
		return getConstDate(offset + 8, $ac_slip_dt);
	}

	/**
	 *  会計伝票日付.<p>
	 *
	 */
	public void ac_slip_dt(MCDate value) {
		setConstDate(offset + 8, $ac_slip_dt, value);
	}


	/**
	 *  計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 9, $ac_dt);
	}

	/**
	 *  計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 9, $ac_dt, value);
	}


	/**
	 *  伝票ＮＯ.<p>
	 *
	 */
	public String slip_no() {
		return getConstString(offset + 10, $slip_no);
	}

	/**
	 *  伝票ＮＯ.<p>
	 *
	 */
	public void slip_no(String value) {
		setConstString(offset + 10, $slip_no, value);
	}


	/**
	 *  伝票連番.<p>
	 *
	 */
	public MCNumber slip_seq_no() {
		return getConstNumber(offset + 11, $slip_seq_no);
	}

	/**
	 *  伝票連番.<p>
	 *
	 */
	public void slip_seq_no(MCNumber value) {
		setConstNumber(offset + 11, $slip_seq_no, value);
	}

	/**
	 *  伝票連番.<p>
	 *
	 */
	public void slip_seq_no(int value) {
		setConstNumber(offset + 11, $slip_seq_no, value);
	}

	/**
	 *  伝票連番.<p>
	 *
	 */
	public void slip_seq_no(long value) {
		setConstNumber(offset + 11, $slip_seq_no, value);
	}

	/**
	 *  伝票連番.<p>
	 *
	 */
	public void slip_seq_no(float value) {
		setConstNumber(offset + 11, $slip_seq_no, value);
	}

	/**
	 *  伝票連番.<p>
	 *
	 */
	public void slip_seq_no(double value) {
		setConstNumber(offset + 11, $slip_seq_no, value);
	}


	/**
	 *  部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 12, $dpt_cd);
	}

	/**
	 *  部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 12, $dpt_cd, value);
	}


	/**
	 *  勘定科目ＣＤ.<p>
	 *
	 */
	public String ac_cd() {
		return getConstString(offset + 13, $ac_cd);
	}

	/**
	 *  勘定科目ＣＤ.<p>
	 *
	 */
	public void ac_cd(String value) {
		setConstString(offset + 13, $ac_cd, value);
	}


	/**
	 *  補助勘定科目ＣＤ.<p>
	 *
	 */
	public String sub_ac_cd() {
		return getConstString(offset + 14, $sub_ac_cd);
	}

	/**
	 *  補助勘定科目ＣＤ.<p>
	 *
	 */
	public void sub_ac_cd(String value) {
		setConstString(offset + 14, $sub_ac_cd, value);
	}


	/**
	 *  プロジェクトＣＤ.<p>
	 *
	 */
	public String project_cd() {
		return getConstString(offset + 15, $project_cd);
	}

	/**
	 *  プロジェクトＣＤ.<p>
	 *
	 */
	public void project_cd(String value) {
		setConstString(offset + 15, $project_cd, value);
	}


	/**
	 *  集計ＣＤ０.<p>
	 *
	 */
	public String summary_cd0() {
		return getConstString(offset + 16, $summary_cd0);
	}

	/**
	 *  集計ＣＤ０.<p>
	 *
	 */
	public void summary_cd0(String value) {
		setConstString(offset + 16, $summary_cd0, value);
	}


	/**
	 *  集計ＣＤ１.<p>
	 *
	 */
	public String summary_cd1() {
		return getConstString(offset + 17, $summary_cd1);
	}

	/**
	 *  集計ＣＤ１.<p>
	 *
	 */
	public void summary_cd1(String value) {
		setConstString(offset + 17, $summary_cd1, value);
	}


	/**
	 *  集計ＣＤ２.<p>
	 *
	 */
	public String summary_cd2() {
		return getConstString(offset + 18, $summary_cd2);
	}

	/**
	 *  集計ＣＤ２.<p>
	 *
	 */
	public void summary_cd2(String value) {
		setConstString(offset + 18, $summary_cd2, value);
	}


	/**
	 *  集計ＣＤ３.<p>
	 *
	 */
	public String summary_cd3() {
		return getConstString(offset + 19, $summary_cd3);
	}

	/**
	 *  集計ＣＤ３.<p>
	 *
	 */
	public void summary_cd3(String value) {
		setConstString(offset + 19, $summary_cd3, value);
	}


	/**
	 *  集計ＣＤ４.<p>
	 *
	 */
	public String summary_cd4() {
		return getConstString(offset + 20, $summary_cd4);
	}

	/**
	 *  集計ＣＤ４.<p>
	 *
	 */
	public void summary_cd4(String value) {
		setConstString(offset + 20, $summary_cd4, value);
	}


	/**
	 *  集計ＣＤ５.<p>
	 *
	 */
	public String summary_cd5() {
		return getConstString(offset + 21, $summary_cd5);
	}

	/**
	 *  集計ＣＤ５.<p>
	 *
	 */
	public void summary_cd5(String value) {
		setConstString(offset + 21, $summary_cd5, value);
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 22, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 22, $itm_cd, value);
	}


	/**
	 *  枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 23, $itm_sub1);
	}

	/**
	 *  枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 23, $itm_sub1, value);
	}


	/**
	 *  枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 24, $itm_sub2);
	}

	/**
	 *  枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 24, $itm_sub2, value);
	}


	/**
	 *  枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 25, $itm_sub3);
	}

	/**
	 *  枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 25, $itm_sub3, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 26, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 26, $itm_nm, value);
	}


	/**
	 *  取引先区分.<p>
	 *
	 */
	public String bp_typ() {
		return getConstString(offset + 27, $bp_typ);
	}

	/**
	 *  取引先区分.<p>
	 *
	 */
	public void bp_typ(String value) {
		setConstString(offset + 27, $bp_typ, value);
	}


	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 28, $bp_cd);
	}

	/**
	 *  取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 28, $bp_cd, value);
	}


	/**
	 *  基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 29, $base_unit_qty);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 29, $base_unit_qty, value);
	}


	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 30, $base_unit_cd);
	}

	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 30, $base_unit_cd, value);
	}


	/**
	 *  基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return getConstNumber(offset + 31, $base_cur_upri);
	}

	/**
	 *  基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		setConstNumber(offset + 31, $base_cur_upri, value);
	}

	/**
	 *  基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		setConstNumber(offset + 31, $base_cur_upri, value);
	}

	/**
	 *  基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		setConstNumber(offset + 31, $base_cur_upri, value);
	}

	/**
	 *  基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		setConstNumber(offset + 31, $base_cur_upri, value);
	}

	/**
	 *  基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		setConstNumber(offset + 31, $base_cur_upri, value);
	}


	/**
	 *  基準通貨税込金額.<p>
	 *
	 */
	public MCNumber base_cur_sum_amt() {
		return getConstNumber(offset + 32, $base_cur_sum_amt);
	}

	/**
	 *  基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_sum_amt(MCNumber value) {
		setConstNumber(offset + 32, $base_cur_sum_amt, value);
	}

	/**
	 *  基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_sum_amt(int value) {
		setConstNumber(offset + 32, $base_cur_sum_amt, value);
	}

	/**
	 *  基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_sum_amt(long value) {
		setConstNumber(offset + 32, $base_cur_sum_amt, value);
	}

	/**
	 *  基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_sum_amt(float value) {
		setConstNumber(offset + 32, $base_cur_sum_amt, value);
	}

	/**
	 *  基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_sum_amt(double value) {
		setConstNumber(offset + 32, $base_cur_sum_amt, value);
	}


	/**
	 *  基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 33, $base_cur_amt);
	}

	/**
	 *  基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 33, $base_cur_amt, value);
	}

	/**
	 *  基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 33, $base_cur_amt, value);
	}

	/**
	 *  基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 33, $base_cur_amt, value);
	}

	/**
	 *  基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 33, $base_cur_amt, value);
	}

	/**
	 *  基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 33, $base_cur_amt, value);
	}


	/**
	 *  基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 34, $base_cur_tax_amt);
	}

	/**
	 *  基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 34, $base_cur_tax_amt, value);
	}

	/**
	 *  基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 34, $base_cur_tax_amt, value);
	}

	/**
	 *  基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 34, $base_cur_tax_amt, value);
	}

	/**
	 *  基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 34, $base_cur_tax_amt, value);
	}

	/**
	 *  基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 34, $base_cur_tax_amt, value);
	}


	/**
	 *  基準通貨税額計算基準金額.<p>
	 *
	 */
	public MCNumber base_cur_tax_base_amt() {
		return getConstNumber(offset + 35, $base_cur_tax_base_amt);
	}

	/**
	 *  基準通貨税額計算基準金額.<p>
	 *
	 */
	public void base_cur_tax_base_amt(MCNumber value) {
		setConstNumber(offset + 35, $base_cur_tax_base_amt, value);
	}

	/**
	 *  基準通貨税額計算基準金額.<p>
	 *
	 */
	public void base_cur_tax_base_amt(int value) {
		setConstNumber(offset + 35, $base_cur_tax_base_amt, value);
	}

	/**
	 *  基準通貨税額計算基準金額.<p>
	 *
	 */
	public void base_cur_tax_base_amt(long value) {
		setConstNumber(offset + 35, $base_cur_tax_base_amt, value);
	}

	/**
	 *  基準通貨税額計算基準金額.<p>
	 *
	 */
	public void base_cur_tax_base_amt(float value) {
		setConstNumber(offset + 35, $base_cur_tax_base_amt, value);
	}

	/**
	 *  基準通貨税額計算基準金額.<p>
	 *
	 */
	public void base_cur_tax_base_amt(double value) {
		setConstNumber(offset + 35, $base_cur_tax_base_amt, value);
	}


	/**
	 *  基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 36, $base_cur_cd);
	}

	/**
	 *  基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 36, $base_cur_cd, value);
	}


	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 37, $trd_cur_upri);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 37, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 37, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 37, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 37, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 37, $trd_cur_upri, value);
	}


	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_sum_amt() {
		return getConstNumber(offset + 38, $trd_cur_sum_amt);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_sum_amt(MCNumber value) {
		setConstNumber(offset + 38, $trd_cur_sum_amt, value);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_sum_amt(int value) {
		setConstNumber(offset + 38, $trd_cur_sum_amt, value);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_sum_amt(long value) {
		setConstNumber(offset + 38, $trd_cur_sum_amt, value);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_sum_amt(float value) {
		setConstNumber(offset + 38, $trd_cur_sum_amt, value);
	}

	/**
	 *  取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_sum_amt(double value) {
		setConstNumber(offset + 38, $trd_cur_sum_amt, value);
	}


	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 39, $trd_cur_amt);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 39, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 39, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 39, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 39, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 39, $trd_cur_amt, value);
	}


	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 40, $trd_cur_tax_amt);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt, value);
	}


	/**
	 *  取引通貨税額計算基準金額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_base_amt() {
		return getConstNumber(offset + 41, $trd_cur_tax_base_amt);
	}

	/**
	 *  取引通貨税額計算基準金額.<p>
	 *
	 */
	public void trd_cur_tax_base_amt(MCNumber value) {
		setConstNumber(offset + 41, $trd_cur_tax_base_amt, value);
	}

	/**
	 *  取引通貨税額計算基準金額.<p>
	 *
	 */
	public void trd_cur_tax_base_amt(int value) {
		setConstNumber(offset + 41, $trd_cur_tax_base_amt, value);
	}

	/**
	 *  取引通貨税額計算基準金額.<p>
	 *
	 */
	public void trd_cur_tax_base_amt(long value) {
		setConstNumber(offset + 41, $trd_cur_tax_base_amt, value);
	}

	/**
	 *  取引通貨税額計算基準金額.<p>
	 *
	 */
	public void trd_cur_tax_base_amt(float value) {
		setConstNumber(offset + 41, $trd_cur_tax_base_amt, value);
	}

	/**
	 *  取引通貨税額計算基準金額.<p>
	 *
	 */
	public void trd_cur_tax_base_amt(double value) {
		setConstNumber(offset + 41, $trd_cur_tax_base_amt, value);
	}


	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 42, $trd_cur_cd);
	}

	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 42, $trd_cur_cd, value);
	}


	/**
	 *  納税通貨単価.<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return getConstNumber(offset + 43, $ptax_cur_upri);
	}

	/**
	 *  納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		setConstNumber(offset + 43, $ptax_cur_upri, value);
	}

	/**
	 *  納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		setConstNumber(offset + 43, $ptax_cur_upri, value);
	}

	/**
	 *  納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		setConstNumber(offset + 43, $ptax_cur_upri, value);
	}

	/**
	 *  納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		setConstNumber(offset + 43, $ptax_cur_upri, value);
	}

	/**
	 *  納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		setConstNumber(offset + 43, $ptax_cur_upri, value);
	}


	/**
	 *  納税通貨税込金額.<p>
	 *
	 */
	public MCNumber ptax_cur_sum_amt() {
		return getConstNumber(offset + 44, $ptax_cur_sum_amt);
	}

	/**
	 *  納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_sum_amt(MCNumber value) {
		setConstNumber(offset + 44, $ptax_cur_sum_amt, value);
	}

	/**
	 *  納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_sum_amt(int value) {
		setConstNumber(offset + 44, $ptax_cur_sum_amt, value);
	}

	/**
	 *  納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_sum_amt(long value) {
		setConstNumber(offset + 44, $ptax_cur_sum_amt, value);
	}

	/**
	 *  納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_sum_amt(float value) {
		setConstNumber(offset + 44, $ptax_cur_sum_amt, value);
	}

	/**
	 *  納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_sum_amt(double value) {
		setConstNumber(offset + 44, $ptax_cur_sum_amt, value);
	}


	/**
	 *  納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return getConstNumber(offset + 45, $ptax_cur_amt);
	}

	/**
	 *  納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		setConstNumber(offset + 45, $ptax_cur_amt, value);
	}

	/**
	 *  納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		setConstNumber(offset + 45, $ptax_cur_amt, value);
	}

	/**
	 *  納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		setConstNumber(offset + 45, $ptax_cur_amt, value);
	}

	/**
	 *  納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		setConstNumber(offset + 45, $ptax_cur_amt, value);
	}

	/**
	 *  納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		setConstNumber(offset + 45, $ptax_cur_amt, value);
	}


	/**
	 *  納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return getConstNumber(offset + 46, $ptax_cur_tax_amt);
	}

	/**
	 *  納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 46, $ptax_cur_tax_amt, value);
	}

	/**
	 *  納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		setConstNumber(offset + 46, $ptax_cur_tax_amt, value);
	}

	/**
	 *  納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		setConstNumber(offset + 46, $ptax_cur_tax_amt, value);
	}

	/**
	 *  納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		setConstNumber(offset + 46, $ptax_cur_tax_amt, value);
	}

	/**
	 *  納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		setConstNumber(offset + 46, $ptax_cur_tax_amt, value);
	}


	/**
	 *  納税通貨税額計算基準金額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_base_amt() {
		return getConstNumber(offset + 47, $ptax_cur_tax_base_amt);
	}

	/**
	 *  納税通貨税額計算基準金額.<p>
	 *
	 */
	public void ptax_cur_tax_base_amt(MCNumber value) {
		setConstNumber(offset + 47, $ptax_cur_tax_base_amt, value);
	}

	/**
	 *  納税通貨税額計算基準金額.<p>
	 *
	 */
	public void ptax_cur_tax_base_amt(int value) {
		setConstNumber(offset + 47, $ptax_cur_tax_base_amt, value);
	}

	/**
	 *  納税通貨税額計算基準金額.<p>
	 *
	 */
	public void ptax_cur_tax_base_amt(long value) {
		setConstNumber(offset + 47, $ptax_cur_tax_base_amt, value);
	}

	/**
	 *  納税通貨税額計算基準金額.<p>
	 *
	 */
	public void ptax_cur_tax_base_amt(float value) {
		setConstNumber(offset + 47, $ptax_cur_tax_base_amt, value);
	}

	/**
	 *  納税通貨税額計算基準金額.<p>
	 *
	 */
	public void ptax_cur_tax_base_amt(double value) {
		setConstNumber(offset + 47, $ptax_cur_tax_base_amt, value);
	}


	/**
	 *  納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 48, $ptax_cur_cd);
	}

	/**
	 *  納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 48, $ptax_cur_cd, value);
	}


	/**
	 *  税区分.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 49, $tax_typ);
	}

	/**
	 *  税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 49, $tax_typ, value);
	}


	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 50, $tax_cd);
	}

	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 50, $tax_cd, value);
	}


	/**
	 *  外貨ＦＬＧ.<p>
	 *
	 */
	public boolean foreign_flg() {
		return getConstBoolean(offset + 51, $foreign_flg);
	}

	/**
	 *  外貨ＦＬＧ.<p>
	 *
	 */
	public void foreign_flg(boolean value) {
		setConstBoolean(offset + 51, $foreign_flg, value);
	}


	/**
	 *  為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 52, $xrate);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 52, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 52, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 52, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 52, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 52, $xrate, value);
	}


	/**
	 *  為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 53, $xrate_cd);
	}

	/**
	 *  為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 53, $xrate_cd, value);
	}


	/**
	 *  納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 54, $ptax_xrate);
	}

	/**
	 *  納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 54, $ptax_xrate, value);
	}

	/**
	 *  納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 54, $ptax_xrate, value);
	}

	/**
	 *  納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 54, $ptax_xrate, value);
	}

	/**
	 *  納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 54, $ptax_xrate, value);
	}

	/**
	 *  納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 54, $ptax_xrate, value);
	}


	/**
	 *  納税為替レートＣＤ.<p>
	 *
	 */
	public String ptax_xrate_cd() {
		return getConstString(offset + 55, $ptax_xrate_cd);
	}

	/**
	 *  納税為替レートＣＤ.<p>
	 *
	 */
	public void ptax_xrate_cd(String value) {
		setConstString(offset + 55, $ptax_xrate_cd, value);
	}


	/**
	 *  インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 56, $iv_no);
	}

	/**
	 *  インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 56, $iv_no, value);
	}


	/**
	 *  請求／支払ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 57, $bill_no);
	}

	/**
	 *  請求／支払ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 57, $bill_no, value);
	}


	/**
	 *  受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 58, $slo_no);
	}

	/**
	 *  受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 58, $slo_no, value);
	}


	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 59, $po_no);
	}

	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 59, $po_no, value);
	}


	/**
	 *  担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 60, $usr_cd);
	}

	/**
	 *  担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 60, $usr_cd, value);
	}


	/**
	 *  決算仕訳区分.<p>
	 *
	 */
	public String cls_jnl_typ() {
		return getConstString(offset + 61, $cls_jnl_typ);
	}

	/**
	 *  決算仕訳区分.<p>
	 *
	 */
	public void cls_jnl_typ(String value) {
		setConstString(offset + 61, $cls_jnl_typ, value);
	}


	/**
	 *  配賦仕訳ＦＬＧ.<p>
	 *
	 */
	public boolean alloc_jnl_flg() {
		return getConstBoolean(offset + 62, $alloc_jnl_flg);
	}

	/**
	 *  配賦仕訳ＦＬＧ.<p>
	 *
	 */
	public void alloc_jnl_flg(boolean value) {
		setConstBoolean(offset + 62, $alloc_jnl_flg, value);
	}


	/**
	 *  都度精算ＦＬＧ.<p>
	 *
	 */
	public boolean spot_flg() {
		return getConstBoolean(offset + 63, $spot_flg);
	}

	/**
	 *  都度精算ＦＬＧ.<p>
	 *
	 */
	public void spot_flg(boolean value) {
		setConstBoolean(offset + 63, $spot_flg, value);
	}


	/**
	 *  決済予定日.<p>
	 *
	 */
	public MCDate sttl_schd_dt() {
		return getConstDate(offset + 64, $sttl_schd_dt);
	}

	/**
	 *  決済予定日.<p>
	 *
	 */
	public void sttl_schd_dt(MCDate value) {
		setConstDate(offset + 64, $sttl_schd_dt, value);
	}


	/**
	 *  決済方法ＣＤ.<p>
	 *
	 */
	public String sttl_cd() {
		return getConstString(offset + 65, $sttl_cd);
	}

	/**
	 *  決済方法ＣＤ.<p>
	 *
	 */
	public void sttl_cd(String value) {
		setConstString(offset + 65, $sttl_cd, value);
	}


	/**
	 *  口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 66, $bank_ac_cd);
	}

	/**
	 *  口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 66, $bank_ac_cd, value);
	}


	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 67, $bank_cd);
	}

	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 67, $bank_cd, value);
	}


	/**
	 *  相手勘定科目ＣＤ.<p>
	 *
	 */
	public String other_ac_cd() {
		return getConstString(offset + 68, $other_ac_cd);
	}

	/**
	 *  相手勘定科目ＣＤ.<p>
	 *
	 */
	public void other_ac_cd(String value) {
		setConstString(offset + 68, $other_ac_cd, value);
	}


	/**
	 *  相手補助勘定科目ＣＤ.<p>
	 *
	 */
	public String other_sub_ac_cd() {
		return getConstString(offset + 69, $other_sub_ac_cd);
	}

	/**
	 *  相手補助勘定科目ＣＤ.<p>
	 *
	 */
	public void other_sub_ac_cd(String value) {
		setConstString(offset + 69, $other_sub_ac_cd, value);
	}


	/**
	 *  相手部門ＣＤ.<p>
	 *
	 */
	public String other_dpt_cd() {
		return getConstString(offset + 70, $other_dpt_cd);
	}

	/**
	 *  相手部門ＣＤ.<p>
	 *
	 */
	public void other_dpt_cd(String value) {
		setConstString(offset + 70, $other_dpt_cd, value);
	}


	/**
	 *  摘要１.<p>
	 *
	 */
	public String abstract1() {
		return getConstString(offset + 71, $abstract1);
	}

	/**
	 *  摘要１.<p>
	 *
	 */
	public void abstract1(String value) {
		setConstString(offset + 71, $abstract1, value);
	}


	/**
	 *  摘要２.<p>
	 *
	 */
	public String abstract2() {
		return getConstString(offset + 72, $abstract2);
	}

	/**
	 *  摘要２.<p>
	 *
	 */
	public void abstract2(String value) {
		setConstString(offset + 72, $abstract2, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 73, $sub_char1);
	}

	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 73, $sub_char1, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 74, $sub_char2);
	}

	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 74, $sub_char2, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 75, $sub_char3);
	}

	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 75, $sub_char3, value);
	}


	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 76, $sub_char4);
	}

	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 76, $sub_char4, value);
	}


	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 77, $sub_char5);
	}

	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 77, $sub_char5, value);
	}


	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 78, $sub_char6);
	}

	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 78, $sub_char6, value);
	}


	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 79, $sub_char7);
	}

	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 79, $sub_char7, value);
	}


	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 80, $sub_char8);
	}

	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 80, $sub_char8, value);
	}


	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 81, $sub_char9);
	}

	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 81, $sub_char9, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 82, $sub_char10);
	}

	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 82, $sub_char10, value);
	}


	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 83, $sub_num1);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 83, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 83, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 83, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 83, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 83, $sub_num1, value);
	}


	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 84, $sub_num2);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 84, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 84, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 84, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 84, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 84, $sub_num2, value);
	}


	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 85, $sub_num3);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 85, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 85, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 85, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 85, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 85, $sub_num3, value);
	}


	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 86, $sub_dt1);
	}

	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 86, $sub_dt1, value);
	}


	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 87, $sub_dt2);
	}

	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 87, $sub_dt2, value);
	}


	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 88, $sub_dt3);
	}

	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 88, $sub_dt3, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String if_sub_char1() {
		return getConstString(offset + 89, $if_sub_char1);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void if_sub_char1(String value) {
		setConstString(offset + 89, $if_sub_char1, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String if_sub_char2() {
		return getConstString(offset + 90, $if_sub_char2);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void if_sub_char2(String value) {
		setConstString(offset + 90, $if_sub_char2, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String if_sub_char3() {
		return getConstString(offset + 91, $if_sub_char3);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void if_sub_char3(String value) {
		setConstString(offset + 91, $if_sub_char3, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String if_sub_char4() {
		return getConstString(offset + 92, $if_sub_char4);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void if_sub_char4(String value) {
		setConstString(offset + 92, $if_sub_char4, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String if_sub_char5() {
		return getConstString(offset + 93, $if_sub_char5);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void if_sub_char5(String value) {
		setConstString(offset + 93, $if_sub_char5, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String if_sub_char6() {
		return getConstString(offset + 94, $if_sub_char6);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void if_sub_char6(String value) {
		setConstString(offset + 94, $if_sub_char6, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String if_sub_char7() {
		return getConstString(offset + 95, $if_sub_char7);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void if_sub_char7(String value) {
		setConstString(offset + 95, $if_sub_char7, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String if_sub_char8() {
		return getConstString(offset + 96, $if_sub_char8);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void if_sub_char8(String value) {
		setConstString(offset + 96, $if_sub_char8, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String if_sub_char9() {
		return getConstString(offset + 97, $if_sub_char9);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void if_sub_char9(String value) {
		setConstString(offset + 97, $if_sub_char9, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String if_sub_char10() {
		return getConstString(offset + 98, $if_sub_char10);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void if_sub_char10(String value) {
		setConstString(offset + 98, $if_sub_char10, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String if_sub_char11() {
		return getConstString(offset + 99, $if_sub_char11);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void if_sub_char11(String value) {
		setConstString(offset + 99, $if_sub_char11, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String if_sub_char12() {
		return getConstString(offset + 100, $if_sub_char12);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void if_sub_char12(String value) {
		setConstString(offset + 100, $if_sub_char12, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String if_sub_char13() {
		return getConstString(offset + 101, $if_sub_char13);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void if_sub_char13(String value) {
		setConstString(offset + 101, $if_sub_char13, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String if_sub_char14() {
		return getConstString(offset + 102, $if_sub_char14);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void if_sub_char14(String value) {
		setConstString(offset + 102, $if_sub_char14, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String if_sub_char15() {
		return getConstString(offset + 103, $if_sub_char15);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void if_sub_char15(String value) {
		setConstString(offset + 103, $if_sub_char15, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String if_sub_char16() {
		return getConstString(offset + 104, $if_sub_char16);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void if_sub_char16(String value) {
		setConstString(offset + 104, $if_sub_char16, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String if_sub_char17() {
		return getConstString(offset + 105, $if_sub_char17);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void if_sub_char17(String value) {
		setConstString(offset + 105, $if_sub_char17, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String if_sub_char18() {
		return getConstString(offset + 106, $if_sub_char18);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void if_sub_char18(String value) {
		setConstString(offset + 106, $if_sub_char18, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String if_sub_char19() {
		return getConstString(offset + 107, $if_sub_char19);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void if_sub_char19(String value) {
		setConstString(offset + 107, $if_sub_char19, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String if_sub_char20() {
		return getConstString(offset + 108, $if_sub_char20);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void if_sub_char20(String value) {
		setConstString(offset + 108, $if_sub_char20, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String if_sub_char21() {
		return getConstString(offset + 109, $if_sub_char21);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void if_sub_char21(String value) {
		setConstString(offset + 109, $if_sub_char21, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String if_sub_char22() {
		return getConstString(offset + 110, $if_sub_char22);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void if_sub_char22(String value) {
		setConstString(offset + 110, $if_sub_char22, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String if_sub_char23() {
		return getConstString(offset + 111, $if_sub_char23);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void if_sub_char23(String value) {
		setConstString(offset + 111, $if_sub_char23, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String if_sub_char24() {
		return getConstString(offset + 112, $if_sub_char24);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void if_sub_char24(String value) {
		setConstString(offset + 112, $if_sub_char24, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String if_sub_char25() {
		return getConstString(offset + 113, $if_sub_char25);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void if_sub_char25(String value) {
		setConstString(offset + 113, $if_sub_char25, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String if_sub_char26() {
		return getConstString(offset + 114, $if_sub_char26);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void if_sub_char26(String value) {
		setConstString(offset + 114, $if_sub_char26, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String if_sub_char27() {
		return getConstString(offset + 115, $if_sub_char27);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void if_sub_char27(String value) {
		setConstString(offset + 115, $if_sub_char27, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String if_sub_char28() {
		return getConstString(offset + 116, $if_sub_char28);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void if_sub_char28(String value) {
		setConstString(offset + 116, $if_sub_char28, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String if_sub_char29() {
		return getConstString(offset + 117, $if_sub_char29);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void if_sub_char29(String value) {
		setConstString(offset + 117, $if_sub_char29, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String if_sub_char30() {
		return getConstString(offset + 118, $if_sub_char30);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void if_sub_char30(String value) {
		setConstString(offset + 118, $if_sub_char30, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber if_sub_num1() {
		return getConstNumber(offset + 119, $if_sub_num1);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(MCNumber value) {
		setConstNumber(offset + 119, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(int value) {
		setConstNumber(offset + 119, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(long value) {
		setConstNumber(offset + 119, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(float value) {
		setConstNumber(offset + 119, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(double value) {
		setConstNumber(offset + 119, $if_sub_num1, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber if_sub_num2() {
		return getConstNumber(offset + 120, $if_sub_num2);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(MCNumber value) {
		setConstNumber(offset + 120, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(int value) {
		setConstNumber(offset + 120, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(long value) {
		setConstNumber(offset + 120, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(float value) {
		setConstNumber(offset + 120, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(double value) {
		setConstNumber(offset + 120, $if_sub_num2, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber if_sub_num3() {
		return getConstNumber(offset + 121, $if_sub_num3);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(MCNumber value) {
		setConstNumber(offset + 121, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(int value) {
		setConstNumber(offset + 121, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(long value) {
		setConstNumber(offset + 121, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(float value) {
		setConstNumber(offset + 121, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(double value) {
		setConstNumber(offset + 121, $if_sub_num3, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber if_sub_num4() {
		return getConstNumber(offset + 122, $if_sub_num4);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(MCNumber value) {
		setConstNumber(offset + 122, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(int value) {
		setConstNumber(offset + 122, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(long value) {
		setConstNumber(offset + 122, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(float value) {
		setConstNumber(offset + 122, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(double value) {
		setConstNumber(offset + 122, $if_sub_num4, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber if_sub_num5() {
		return getConstNumber(offset + 123, $if_sub_num5);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(MCNumber value) {
		setConstNumber(offset + 123, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(int value) {
		setConstNumber(offset + 123, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(long value) {
		setConstNumber(offset + 123, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(float value) {
		setConstNumber(offset + 123, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(double value) {
		setConstNumber(offset + 123, $if_sub_num5, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate if_sub_dt1() {
		return getConstDate(offset + 124, $if_sub_dt1);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void if_sub_dt1(MCDate value) {
		setConstDate(offset + 124, $if_sub_dt1, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate if_sub_dt2() {
		return getConstDate(offset + 125, $if_sub_dt2);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void if_sub_dt2(MCDate value) {
		setConstDate(offset + 125, $if_sub_dt2, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate if_sub_dt3() {
		return getConstDate(offset + 126, $if_sub_dt3);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void if_sub_dt3(MCDate value) {
		setConstDate(offset + 126, $if_sub_dt3, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate if_sub_dt4() {
		return getConstDate(offset + 127, $if_sub_dt4);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void if_sub_dt4(MCDate value) {
		setConstDate(offset + 127, $if_sub_dt4, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate if_sub_dt5() {
		return getConstDate(offset + 128, $if_sub_dt5);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void if_sub_dt5(MCDate value) {
		setConstDate(offset + 128, $if_sub_dt5, value);
	}


	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			return ac_if_typ();
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			return slip_cnt_id();
		}
		if ($jnl_no.equalsIgnoreCase(name)) {
			return jnl_no();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			return slip_no();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($sub_ac_cd.equalsIgnoreCase(name)) {
			return sub_ac_cd();
		}
		if ($project_cd.equalsIgnoreCase(name)) {
			return project_cd();
		}
		if ($summary_cd0.equalsIgnoreCase(name)) {
			return summary_cd0();
		}
		if ($summary_cd1.equalsIgnoreCase(name)) {
			return summary_cd1();
		}
		if ($summary_cd2.equalsIgnoreCase(name)) {
			return summary_cd2();
		}
		if ($summary_cd3.equalsIgnoreCase(name)) {
			return summary_cd3();
		}
		if ($summary_cd4.equalsIgnoreCase(name)) {
			return summary_cd4();
		}
		if ($summary_cd5.equalsIgnoreCase(name)) {
			return summary_cd5();
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
		if ($bp_typ.equalsIgnoreCase(name)) {
			return bp_typ();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($ptax_xrate_cd.equalsIgnoreCase(name)) {
			return ptax_xrate_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($cls_jnl_typ.equalsIgnoreCase(name)) {
			return cls_jnl_typ();
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			return sttl_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($other_ac_cd.equalsIgnoreCase(name)) {
			return other_ac_cd();
		}
		if ($other_sub_ac_cd.equalsIgnoreCase(name)) {
			return other_sub_ac_cd();
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			return other_dpt_cd();
		}
		if ($abstract1.equalsIgnoreCase(name)) {
			return abstract1();
		}
		if ($abstract2.equalsIgnoreCase(name)) {
			return abstract2();
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
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			return if_sub_char1();
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			return if_sub_char2();
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			return if_sub_char3();
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			return if_sub_char4();
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			return if_sub_char5();
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			return if_sub_char6();
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			return if_sub_char7();
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			return if_sub_char8();
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			return if_sub_char9();
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			return if_sub_char10();
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			return if_sub_char11();
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			return if_sub_char12();
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			return if_sub_char13();
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			return if_sub_char14();
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			return if_sub_char15();
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			return if_sub_char16();
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			return if_sub_char17();
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			return if_sub_char18();
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			return if_sub_char19();
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			return if_sub_char20();
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			return if_sub_char21();
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			return if_sub_char22();
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			return if_sub_char23();
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			return if_sub_char24();
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			return if_sub_char25();
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			return if_sub_char26();
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			return if_sub_char27();
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			return if_sub_char28();
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			return if_sub_char29();
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			return if_sub_char30();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			return jnl_no_seq();
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			return slip_seq_no();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_sum_amt.equalsIgnoreCase(name)) {
			return base_cur_sum_amt();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_tax_base_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_base_amt();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_sum_amt.equalsIgnoreCase(name)) {
			return trd_cur_sum_amt();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_tax_base_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_base_amt();
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			return ptax_cur_upri();
		}
		if ($ptax_cur_sum_amt.equalsIgnoreCase(name)) {
			return ptax_cur_sum_amt();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($ptax_cur_tax_base_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_base_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			return if_sub_num1();
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			return if_sub_num2();
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			return if_sub_num3();
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			return if_sub_num4();
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			return if_sub_num5();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			return ac_slip_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($sttl_schd_dt.equalsIgnoreCase(name)) {
			return sttl_schd_dt();
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
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			return if_sub_dt1();
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			return if_sub_dt2();
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			return if_sub_dt3();
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			return if_sub_dt4();
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			return if_sub_dt5();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($alloc_jnl_flg.equalsIgnoreCase(name)) {
			return alloc_jnl_flg();
		}
		if ($spot_flg.equalsIgnoreCase(name)) {
			return spot_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			return ac_if_typ();
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			return slip_cnt_id();
		}
		if ($jnl_no.equalsIgnoreCase(name)) {
			return jnl_no();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			return slip_no();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($sub_ac_cd.equalsIgnoreCase(name)) {
			return sub_ac_cd();
		}
		if ($project_cd.equalsIgnoreCase(name)) {
			return project_cd();
		}
		if ($summary_cd0.equalsIgnoreCase(name)) {
			return summary_cd0();
		}
		if ($summary_cd1.equalsIgnoreCase(name)) {
			return summary_cd1();
		}
		if ($summary_cd2.equalsIgnoreCase(name)) {
			return summary_cd2();
		}
		if ($summary_cd3.equalsIgnoreCase(name)) {
			return summary_cd3();
		}
		if ($summary_cd4.equalsIgnoreCase(name)) {
			return summary_cd4();
		}
		if ($summary_cd5.equalsIgnoreCase(name)) {
			return summary_cd5();
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
		if ($bp_typ.equalsIgnoreCase(name)) {
			return bp_typ();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($ptax_xrate_cd.equalsIgnoreCase(name)) {
			return ptax_xrate_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($cls_jnl_typ.equalsIgnoreCase(name)) {
			return cls_jnl_typ();
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			return sttl_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($other_ac_cd.equalsIgnoreCase(name)) {
			return other_ac_cd();
		}
		if ($other_sub_ac_cd.equalsIgnoreCase(name)) {
			return other_sub_ac_cd();
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			return other_dpt_cd();
		}
		if ($abstract1.equalsIgnoreCase(name)) {
			return abstract1();
		}
		if ($abstract2.equalsIgnoreCase(name)) {
			return abstract2();
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
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			return if_sub_char1();
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			return if_sub_char2();
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			return if_sub_char3();
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			return if_sub_char4();
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			return if_sub_char5();
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			return if_sub_char6();
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			return if_sub_char7();
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			return if_sub_char8();
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			return if_sub_char9();
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			return if_sub_char10();
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			return if_sub_char11();
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			return if_sub_char12();
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			return if_sub_char13();
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			return if_sub_char14();
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			return if_sub_char15();
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			return if_sub_char16();
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			return if_sub_char17();
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			return if_sub_char18();
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			return if_sub_char19();
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			return if_sub_char20();
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			return if_sub_char21();
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			return if_sub_char22();
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			return if_sub_char23();
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			return if_sub_char24();
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			return if_sub_char25();
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			return if_sub_char26();
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			return if_sub_char27();
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			return if_sub_char28();
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			return if_sub_char29();
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			return if_sub_char30();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			return jnl_no_seq();
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			return slip_seq_no();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_sum_amt.equalsIgnoreCase(name)) {
			return base_cur_sum_amt();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_tax_base_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_base_amt();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_sum_amt.equalsIgnoreCase(name)) {
			return trd_cur_sum_amt();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_tax_base_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_base_amt();
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			return ptax_cur_upri();
		}
		if ($ptax_cur_sum_amt.equalsIgnoreCase(name)) {
			return ptax_cur_sum_amt();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($ptax_cur_tax_base_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_base_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			return if_sub_num1();
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			return if_sub_num2();
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			return if_sub_num3();
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			return if_sub_num4();
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			return if_sub_num5();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			return ac_slip_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($sttl_schd_dt.equalsIgnoreCase(name)) {
			return sttl_schd_dt();
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
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			return if_sub_dt1();
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			return if_sub_dt2();
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			return if_sub_dt3();
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			return if_sub_dt4();
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			return if_sub_dt5();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($alloc_jnl_flg.equalsIgnoreCase(name)) {
			return alloc_jnl_flg();
		}
		if ($spot_flg.equalsIgnoreCase(name)) {
			return spot_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			jnl_grp_no(value);
			return;
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			ac_if_typ(value);
			return;
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			slip_cnt_id(value);
			return;
		}
		if ($jnl_no.equalsIgnoreCase(name)) {
			jnl_no(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			slip_no(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($sub_ac_cd.equalsIgnoreCase(name)) {
			sub_ac_cd(value);
			return;
		}
		if ($project_cd.equalsIgnoreCase(name)) {
			project_cd(value);
			return;
		}
		if ($summary_cd0.equalsIgnoreCase(name)) {
			summary_cd0(value);
			return;
		}
		if ($summary_cd1.equalsIgnoreCase(name)) {
			summary_cd1(value);
			return;
		}
		if ($summary_cd2.equalsIgnoreCase(name)) {
			summary_cd2(value);
			return;
		}
		if ($summary_cd3.equalsIgnoreCase(name)) {
			summary_cd3(value);
			return;
		}
		if ($summary_cd4.equalsIgnoreCase(name)) {
			summary_cd4(value);
			return;
		}
		if ($summary_cd5.equalsIgnoreCase(name)) {
			summary_cd5(value);
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
		if ($bp_typ.equalsIgnoreCase(name)) {
			bp_typ(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($ptax_xrate_cd.equalsIgnoreCase(name)) {
			ptax_xrate_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($cls_jnl_typ.equalsIgnoreCase(name)) {
			cls_jnl_typ(value);
			return;
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			sttl_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($other_ac_cd.equalsIgnoreCase(name)) {
			other_ac_cd(value);
			return;
		}
		if ($other_sub_ac_cd.equalsIgnoreCase(name)) {
			other_sub_ac_cd(value);
			return;
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			other_dpt_cd(value);
			return;
		}
		if ($abstract1.equalsIgnoreCase(name)) {
			abstract1(value);
			return;
		}
		if ($abstract2.equalsIgnoreCase(name)) {
			abstract2(value);
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
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			if_sub_char1(value);
			return;
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			if_sub_char2(value);
			return;
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			if_sub_char3(value);
			return;
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			if_sub_char4(value);
			return;
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			if_sub_char5(value);
			return;
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			if_sub_char6(value);
			return;
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			if_sub_char7(value);
			return;
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			if_sub_char8(value);
			return;
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			if_sub_char9(value);
			return;
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			if_sub_char10(value);
			return;
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			if_sub_char11(value);
			return;
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			if_sub_char12(value);
			return;
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			if_sub_char13(value);
			return;
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			if_sub_char14(value);
			return;
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			if_sub_char15(value);
			return;
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			if_sub_char16(value);
			return;
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			if_sub_char17(value);
			return;
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			if_sub_char18(value);
			return;
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			if_sub_char19(value);
			return;
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			if_sub_char20(value);
			return;
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			if_sub_char21(value);
			return;
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			if_sub_char22(value);
			return;
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			if_sub_char23(value);
			return;
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			if_sub_char24(value);
			return;
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			if_sub_char25(value);
			return;
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			if_sub_char26(value);
			return;
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			if_sub_char27(value);
			return;
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			if_sub_char28(value);
			return;
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			if_sub_char29(value);
			return;
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			if_sub_char30(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_sum_amt.equalsIgnoreCase(name)) {
			base_cur_sum_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_base_amt.equalsIgnoreCase(name)) {
			base_cur_tax_base_amt(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_sum_amt.equalsIgnoreCase(name)) {
			trd_cur_sum_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_base_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_base_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_sum_amt.equalsIgnoreCase(name)) {
			ptax_cur_sum_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_base_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_base_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_sum_amt.equalsIgnoreCase(name)) {
			base_cur_sum_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_base_amt.equalsIgnoreCase(name)) {
			base_cur_tax_base_amt(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_sum_amt.equalsIgnoreCase(name)) {
			trd_cur_sum_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_base_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_base_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_sum_amt.equalsIgnoreCase(name)) {
			ptax_cur_sum_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_base_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_base_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_sum_amt.equalsIgnoreCase(name)) {
			base_cur_sum_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_base_amt.equalsIgnoreCase(name)) {
			base_cur_tax_base_amt(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_sum_amt.equalsIgnoreCase(name)) {
			trd_cur_sum_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_base_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_base_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_sum_amt.equalsIgnoreCase(name)) {
			ptax_cur_sum_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_base_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_base_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_sum_amt.equalsIgnoreCase(name)) {
			base_cur_sum_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_base_amt.equalsIgnoreCase(name)) {
			base_cur_tax_base_amt(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_sum_amt.equalsIgnoreCase(name)) {
			trd_cur_sum_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_base_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_base_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_sum_amt.equalsIgnoreCase(name)) {
			ptax_cur_sum_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_base_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_base_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_sum_amt.equalsIgnoreCase(name)) {
			base_cur_sum_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_base_amt.equalsIgnoreCase(name)) {
			base_cur_tax_base_amt(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_sum_amt.equalsIgnoreCase(name)) {
			trd_cur_sum_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_base_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_base_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_sum_amt.equalsIgnoreCase(name)) {
			ptax_cur_sum_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_base_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_base_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			ac_slip_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($sttl_schd_dt.equalsIgnoreCase(name)) {
			sttl_schd_dt(value);
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
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			if_sub_dt1(value);
			return;
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			if_sub_dt2(value);
			return;
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			if_sub_dt3(value);
			return;
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			if_sub_dt4(value);
			return;
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			if_sub_dt5(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($alloc_jnl_flg.equalsIgnoreCase(name)) {
			alloc_jnl_flg(value);
			return;
		}
		if ($spot_flg.equalsIgnoreCase(name)) {
			spot_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			jnl_grp_no(value);
			return;
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			ac_if_typ(value);
			return;
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			slip_cnt_id(value);
			return;
		}
		if ($jnl_no.equalsIgnoreCase(name)) {
			jnl_no(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			slip_no(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($sub_ac_cd.equalsIgnoreCase(name)) {
			sub_ac_cd(value);
			return;
		}
		if ($project_cd.equalsIgnoreCase(name)) {
			project_cd(value);
			return;
		}
		if ($summary_cd0.equalsIgnoreCase(name)) {
			summary_cd0(value);
			return;
		}
		if ($summary_cd1.equalsIgnoreCase(name)) {
			summary_cd1(value);
			return;
		}
		if ($summary_cd2.equalsIgnoreCase(name)) {
			summary_cd2(value);
			return;
		}
		if ($summary_cd3.equalsIgnoreCase(name)) {
			summary_cd3(value);
			return;
		}
		if ($summary_cd4.equalsIgnoreCase(name)) {
			summary_cd4(value);
			return;
		}
		if ($summary_cd5.equalsIgnoreCase(name)) {
			summary_cd5(value);
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
		if ($bp_typ.equalsIgnoreCase(name)) {
			bp_typ(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($ptax_xrate_cd.equalsIgnoreCase(name)) {
			ptax_xrate_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($cls_jnl_typ.equalsIgnoreCase(name)) {
			cls_jnl_typ(value);
			return;
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			sttl_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($other_ac_cd.equalsIgnoreCase(name)) {
			other_ac_cd(value);
			return;
		}
		if ($other_sub_ac_cd.equalsIgnoreCase(name)) {
			other_sub_ac_cd(value);
			return;
		}
		if ($other_dpt_cd.equalsIgnoreCase(name)) {
			other_dpt_cd(value);
			return;
		}
		if ($abstract1.equalsIgnoreCase(name)) {
			abstract1(value);
			return;
		}
		if ($abstract2.equalsIgnoreCase(name)) {
			abstract2(value);
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
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			if_sub_char1(value);
			return;
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			if_sub_char2(value);
			return;
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			if_sub_char3(value);
			return;
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			if_sub_char4(value);
			return;
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			if_sub_char5(value);
			return;
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			if_sub_char6(value);
			return;
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			if_sub_char7(value);
			return;
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			if_sub_char8(value);
			return;
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			if_sub_char9(value);
			return;
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			if_sub_char10(value);
			return;
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			if_sub_char11(value);
			return;
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			if_sub_char12(value);
			return;
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			if_sub_char13(value);
			return;
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			if_sub_char14(value);
			return;
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			if_sub_char15(value);
			return;
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			if_sub_char16(value);
			return;
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			if_sub_char17(value);
			return;
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			if_sub_char18(value);
			return;
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			if_sub_char19(value);
			return;
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			if_sub_char20(value);
			return;
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			if_sub_char21(value);
			return;
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			if_sub_char22(value);
			return;
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			if_sub_char23(value);
			return;
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			if_sub_char24(value);
			return;
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			if_sub_char25(value);
			return;
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			if_sub_char26(value);
			return;
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			if_sub_char27(value);
			return;
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			if_sub_char28(value);
			return;
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			if_sub_char29(value);
			return;
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			if_sub_char30(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_sum_amt.equalsIgnoreCase(name)) {
			base_cur_sum_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_base_amt.equalsIgnoreCase(name)) {
			base_cur_tax_base_amt(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_sum_amt.equalsIgnoreCase(name)) {
			trd_cur_sum_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_base_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_base_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_sum_amt.equalsIgnoreCase(name)) {
			ptax_cur_sum_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_base_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_base_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_sum_amt.equalsIgnoreCase(name)) {
			base_cur_sum_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_base_amt.equalsIgnoreCase(name)) {
			base_cur_tax_base_amt(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_sum_amt.equalsIgnoreCase(name)) {
			trd_cur_sum_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_base_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_base_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_sum_amt.equalsIgnoreCase(name)) {
			ptax_cur_sum_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_base_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_base_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_sum_amt.equalsIgnoreCase(name)) {
			base_cur_sum_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_base_amt.equalsIgnoreCase(name)) {
			base_cur_tax_base_amt(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_sum_amt.equalsIgnoreCase(name)) {
			trd_cur_sum_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_base_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_base_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_sum_amt.equalsIgnoreCase(name)) {
			ptax_cur_sum_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_base_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_base_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_sum_amt.equalsIgnoreCase(name)) {
			base_cur_sum_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_base_amt.equalsIgnoreCase(name)) {
			base_cur_tax_base_amt(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_sum_amt.equalsIgnoreCase(name)) {
			trd_cur_sum_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_base_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_base_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_sum_amt.equalsIgnoreCase(name)) {
			ptax_cur_sum_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_base_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_base_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($jnl_no_seq.equalsIgnoreCase(name)) {
			jnl_no_seq(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_sum_amt.equalsIgnoreCase(name)) {
			base_cur_sum_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_base_amt.equalsIgnoreCase(name)) {
			base_cur_tax_base_amt(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_sum_amt.equalsIgnoreCase(name)) {
			trd_cur_sum_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_tax_base_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_base_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_sum_amt.equalsIgnoreCase(name)) {
			ptax_cur_sum_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_base_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_base_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
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
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			ac_slip_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($sttl_schd_dt.equalsIgnoreCase(name)) {
			sttl_schd_dt(value);
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
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			if_sub_dt1(value);
			return;
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			if_sub_dt2(value);
			return;
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			if_sub_dt3(value);
			return;
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			if_sub_dt4(value);
			return;
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			if_sub_dt5(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($alloc_jnl_flg.equalsIgnoreCase(name)) {
			alloc_jnl_flg(value);
			return;
		}
		if ($spot_flg.equalsIgnoreCase(name)) {
			spot_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

