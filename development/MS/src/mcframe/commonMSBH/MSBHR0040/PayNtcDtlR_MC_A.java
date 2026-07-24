package mcframe.commonMSBH.MSBHR0040;

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
 * ブロック"PayNtcDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PayNtcDtlR_MC_A extends MCConstRow {

	/**
	 *  仕入計上日.<p>
	 *
	 */
	public static final String $purc_ac_dt = "purc_ac_dt";
	/**
	 *  仕入計上日（基）.<p>
	 *
	 */
	public static final String $base_purc_ac_dt = "base_purc_ac_dt";
	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
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
	 *  ヘッダ実績ＮＯ.<p>
	 *
	 */
	public static final String $act_no = "act_no";
	/**
	 *  ヘッダ実績改訂番号.<p>
	 *
	 */
	public static final String $act_rev = "act_rev";
	/**
	 *  明細実績ＮＯ.<p>
	 *
	 */
	public static final String $act_d_no = "act_d_no";
	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 *  伝票状況区分名.<p>
	 *
	 */
	public static final String $slip_sts_typ_nm = "slip_sts_typ_nm";
	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public static final String $itm_sub1_view = "itm_sub1_view";
	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public static final String $itm_sub2_view = "itm_sub2_view";
	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public static final String $itm_sub3_view = "itm_sub3_view";
	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public static final String $itm_sub3_data = "itm_sub3_data";
	/**
	 *  発注先品目ＣＤ.<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	/**
	 *  一部支払明細用ラベル１.<p>
	 *
	 */
	public static final String $part_pay_d_label1 = "part_pay_d_label1";
	/**
	 *  一部支払明細用ラベル２.<p>
	 *
	 */
	public static final String $part_pay_d_label2 = "part_pay_d_label2";
	/**
	 *  品名.<p>
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
	 *  発注先品名.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
	/**
	 *  支払方式区分.<p>
	 *
	 */
	public static final String $pay_mtd_typ = "pay_mtd_typ";
	/**
	 *  一部支払明細用金額１.<p>
	 *
	 */
	public static final String $part_pay_d_amt1 = "part_pay_d_amt1";
	/**
	 *  一部支払明細用金額１(整数部).<p>
	 *
	 */
	public static final String $s_part_pay_d_amt1_int = "s_part_pay_d_amt1_int";
	/**
	 *  一部支払明細用金額１(小数部).<p>
	 *
	 */
	public static final String $s_part_pay_d_amt1_dec = "s_part_pay_d_amt1_dec";
	/**
	 *  一部支払明細用金額２.<p>
	 *
	 */
	public static final String $part_pay_d_amt2 = "part_pay_d_amt2";
	/**
	 *  一部支払明細用金額２(整数部).<p>
	 *
	 */
	public static final String $s_part_pay_d_amt2_int = "s_part_pay_d_amt2_int";
	/**
	 *  一部支払明細用金額２(小数部).<p>
	 *
	 */
	public static final String $s_part_pay_d_amt2_dec = "s_part_pay_d_amt2_dec";
	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 *  取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 *  数量(数量).<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 *  数量(数量)(整数部).<p>
	 *
	 */
	public static final String $s_trd_unit_qty_int = "s_trd_unit_qty_int";
	/**
	 *  数量(数量)(小数部).<p>
	 *
	 */
	public static final String $s_trd_unit_qty_dec = "s_trd_unit_qty_dec";
	/**
	 *  数量(単位名).<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 *  数量(単位名).<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 *  単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 *  単価(整数部).<p>
	 *
	 */
	public static final String $s_trd_cur_upri_int = "s_trd_cur_upri_int";
	/**
	 *  単価(小数部).<p>
	 *
	 */
	public static final String $s_trd_cur_upri_dec = "s_trd_cur_upri_dec";
	/**
	 *  内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 *  内税.<p>
	 *
	 */
	public static final String $s_inc_tax_flg = "s_inc_tax_flg";
	/**
	 *  仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 *  仮単価文字列.<p>
	 *
	 */
	public static final String $s_interim_flg = "s_interim_flg";
	/**
	 *  金額(税抜).<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 *  金額(税抜)(整数部).<p>
	 *
	 */
	public static final String $s_trd_cur_amt_int = "s_trd_cur_amt_int";
	/**
	 *  金額(税抜)(小数部).<p>
	 *
	 */
	public static final String $s_trd_cur_amt_dec = "s_trd_cur_amt_dec";
	/**
	 *  値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 *  値引額(整数部).<p>
	 *
	 */
	public static final String $s_trd_cur_dscnt_amt_int = "s_trd_cur_dscnt_amt_int";
	/**
	 *  値引額(小数部).<p>
	 *
	 */
	public static final String $s_trd_cur_dscnt_amt_dec = "s_trd_cur_dscnt_amt_dec";
	/**
	 *  消費税.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 *  消費税(整数部).<p>
	 *
	 */
	public static final String $s_trd_cur_tax_amt_int = "s_trd_cur_tax_amt_int";
	/**
	 *  消費税(小数部).<p>
	 *
	 */
	public static final String $s_trd_cur_tax_amt_dec = "s_trd_cur_tax_amt_dec";
	/**
	 *  消費税(税率).<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 *  消費税(税率)文字列.<p>
	 *
	 */
	public static final String $s_tax_rate = "s_tax_rate";
	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 *  税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 *  明細備考.<p>
	 *
	 */
	public static final String $pay_ntc_d_print_rmrks = "pay_ntc_d_print_rmrks";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $d_sub_char1 = "d_sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $d_sub_char2 = "d_sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $d_sub_char3 = "d_sub_char3";


	public static final MCMeta purc_ac_dt_META = createCommonMeta($purc_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_purc_ac_dt_META = createCommonMeta($base_purc_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta act_no_META = createCommonMeta($act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta act_rev_META = createCommonMeta($act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta act_d_no_META = createCommonMeta($act_d_no, mcframe.commonMA.meta.MA_META.ACT_D_NO);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta slip_sts_typ_nm_META = createCommonMeta($slip_sts_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_view_META = createCommonMeta($itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view_META = createCommonMeta($itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view_META = createCommonMeta($itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub1_data_META = createCommonMeta($itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_data_META = createCommonMeta($itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_data_META = createCommonMeta($itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta part_pay_d_label1_META = createStringMeta($part_pay_d_label1);
	public static final MCMeta part_pay_d_label2_META = createStringMeta($part_pay_d_label2);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta pay_mtd_typ_META = createCommonMeta($pay_mtd_typ, mcframe.commonMS.meta.MS_META.PAY_MTD_TYP);
	public static final MCMeta part_pay_d_amt1_META = createCommonMeta($part_pay_d_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_part_pay_d_amt1_int_META = createStringMeta($s_part_pay_d_amt1_int);
	public static final MCMeta s_part_pay_d_amt1_dec_META = createStringMeta($s_part_pay_d_amt1_dec);
	public static final MCMeta part_pay_d_amt2_META = createCommonMeta($part_pay_d_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_part_pay_d_amt2_int_META = createStringMeta($s_part_pay_d_amt2_int);
	public static final MCMeta s_part_pay_d_amt2_dec_META = createStringMeta($s_part_pay_d_amt2_dec);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_trd_unit_qty_int_META = createStringMeta($s_trd_unit_qty_int);
	public static final MCMeta s_trd_unit_qty_dec_META = createStringMeta($s_trd_unit_qty_dec);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_trd_cur_upri_int_META = createStringMeta($s_trd_cur_upri_int);
	public static final MCMeta s_trd_cur_upri_dec_META = createStringMeta($s_trd_cur_upri_dec);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta s_inc_tax_flg_META = createStringMeta($s_inc_tax_flg);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta s_interim_flg_META = createStringMeta($s_interim_flg);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_trd_cur_amt_int_META = createStringMeta($s_trd_cur_amt_int);
	public static final MCMeta s_trd_cur_amt_dec_META = createStringMeta($s_trd_cur_amt_dec);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_trd_cur_dscnt_amt_int_META = createStringMeta($s_trd_cur_dscnt_amt_int);
	public static final MCMeta s_trd_cur_dscnt_amt_dec_META = createStringMeta($s_trd_cur_dscnt_amt_dec);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_trd_cur_tax_amt_int_META = createStringMeta($s_trd_cur_tax_amt_int);
	public static final MCMeta s_trd_cur_tax_amt_dec_META = createStringMeta($s_trd_cur_tax_amt_dec);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate_META = createStringMeta($s_tax_rate);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta pay_ntc_d_print_rmrks_META = createCommonMeta($pay_ntc_d_print_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta d_sub_char1_META = createCommonMeta($d_sub_char1, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR1);
	public static final MCMeta d_sub_char2_META = createCommonMeta($d_sub_char2, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR2);
	public static final MCMeta d_sub_char3_META = createCommonMeta($d_sub_char3, mcframe.commonMS.meta.MS_META.AP_D_SUB_CHAR3);

	protected static final ConstMetaList<PayNtcDtlR> constMetas = new ConstMetaList<PayNtcDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			purc_ac_dt_META,
			base_purc_ac_dt_META,
			po_no_META,
			po_d_no_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			act_no_META,
			act_rev_META,
			act_d_no_META,
			slip_sts_typ_META,
			slip_sts_typ_nm_META,
			itm_cd_META,
			itm_sub1_view_META,
			itm_sub2_view_META,
			itm_sub3_view_META,
			itm_sub1_data_META,
			itm_sub2_data_META,
			itm_sub3_data_META,
			sppl_itm_cd_META,
			part_pay_d_label1_META,
			part_pay_d_label2_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			sppl_itm_nm_META,
			pay_mtd_typ_META,
			part_pay_d_amt1_META,
			s_part_pay_d_amt1_int_META,
			s_part_pay_d_amt1_dec_META,
			part_pay_d_amt2_META,
			s_part_pay_d_amt2_int_META,
			s_part_pay_d_amt2_dec_META,
			trd_cd_META,
			trd_nm_META,
			trd_unit_qty_META,
			s_trd_unit_qty_int_META,
			s_trd_unit_qty_dec_META,
			trd_unit_cd_META,
			unit_nm_META,
			trd_cur_upri_META,
			s_trd_cur_upri_int_META,
			s_trd_cur_upri_dec_META,
			inc_tax_flg_META,
			s_inc_tax_flg_META,
			interim_flg_META,
			s_interim_flg_META,
			trd_cur_amt_META,
			s_trd_cur_amt_int_META,
			s_trd_cur_amt_dec_META,
			trd_cur_dscnt_amt_META,
			s_trd_cur_dscnt_amt_int_META,
			s_trd_cur_dscnt_amt_dec_META,
			trd_cur_tax_amt_META,
			s_trd_cur_tax_amt_int_META,
			s_trd_cur_tax_amt_dec_META,
			tax_rate_META,
			s_tax_rate_META,
			tax_cd_META,
			tax_nm_META,
			pay_ntc_d_print_rmrks_META,
			d_sub_char1_META,
			d_sub_char2_META,
			d_sub_char3_META
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
	protected PayNtcDtlR_MC_A(ConstMetaList<? extends PayNtcDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayNtcDtlR clone() {
		return (PayNtcDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayNtcDtlR createInstance() {
		return (PayNtcDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayNtcDtlR getValues(String... names) {
		return (PayNtcDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  仕入計上日.<p>
	 *
	 */
	public MCDate purc_ac_dt() {
		return getConstDate(offset + 0, $purc_ac_dt);
	}

	/**
	 *  仕入計上日.<p>
	 *
	 */
	public void purc_ac_dt(MCDate value) {
		setConstDate(offset + 0, $purc_ac_dt, value);
	}


	/**
	 *  仕入計上日（基）.<p>
	 *
	 */
	public MCDate base_purc_ac_dt() {
		return getConstDate(offset + 1, $base_purc_ac_dt);
	}

	/**
	 *  仕入計上日（基）.<p>
	 *
	 */
	public void base_purc_ac_dt(MCDate value) {
		setConstDate(offset + 1, $base_purc_ac_dt, value);
	}


	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 2, $po_no);
	}

	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 2, $po_no, value);
	}


	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 3, $po_d_no);
	}

	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 3, $po_d_no, value);
	}


	/**
	 *  納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 4, $dlv_slip_no);
	}

	/**
	 *  納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 4, $dlv_slip_no, value);
	}


	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 5, $dlv_slip_d_no);
	}

	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 5, $dlv_slip_d_no, value);
	}


	/**
	 *  ヘッダ実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return getConstString(offset + 6, $act_no);
	}

	/**
	 *  ヘッダ実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		setConstString(offset + 6, $act_no, value);
	}


	/**
	 *  ヘッダ実績改訂番号.<p>
	 *
	 */
	public MCNumber act_rev() {
		return getConstNumber(offset + 7, $act_rev);
	}

	/**
	 *  ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(MCNumber value) {
		setConstNumber(offset + 7, $act_rev, value);
	}

	/**
	 *  ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(int value) {
		setConstNumber(offset + 7, $act_rev, value);
	}

	/**
	 *  ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(long value) {
		setConstNumber(offset + 7, $act_rev, value);
	}

	/**
	 *  ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(float value) {
		setConstNumber(offset + 7, $act_rev, value);
	}

	/**
	 *  ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(double value) {
		setConstNumber(offset + 7, $act_rev, value);
	}


	/**
	 *  明細実績ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return getConstString(offset + 8, $act_d_no);
	}

	/**
	 *  明細実績ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		setConstString(offset + 8, $act_d_no, value);
	}


	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 9, $slip_sts_typ);
	}

	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 9, $slip_sts_typ, value);
	}


	/**
	 *  伝票状況区分名.<p>
	 *
	 */
	public String slip_sts_typ_nm() {
		return getConstString(offset + 10, $slip_sts_typ_nm);
	}

	/**
	 *  伝票状況区分名.<p>
	 *
	 */
	public void slip_sts_typ_nm(String value) {
		setConstString(offset + 10, $slip_sts_typ_nm, value);
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 11, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 11, $itm_cd, value);
	}


	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 12, $itm_sub1_view);
	}

	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 12, $itm_sub1_view, value);
	}


	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 13, $itm_sub2_view);
	}

	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 13, $itm_sub2_view, value);
	}


	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 14, $itm_sub3_view);
	}

	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 14, $itm_sub3_view, value);
	}


	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 15, $itm_sub1_data);
	}

	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 15, $itm_sub1_data, value);
	}


	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 16, $itm_sub2_data);
	}

	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 16, $itm_sub2_data, value);
	}


	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 17, $itm_sub3_data);
	}

	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 17, $itm_sub3_data, value);
	}


	/**
	 *  発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 18, $sppl_itm_cd);
	}

	/**
	 *  発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 18, $sppl_itm_cd, value);
	}


	/**
	 *  一部支払明細用ラベル１.<p>
	 *
	 */
	public String part_pay_d_label1() {
		return getConstString(offset + 19, $part_pay_d_label1);
	}

	/**
	 *  一部支払明細用ラベル１.<p>
	 *
	 */
	public void part_pay_d_label1(String value) {
		setConstString(offset + 19, $part_pay_d_label1, value);
	}


	/**
	 *  一部支払明細用ラベル２.<p>
	 *
	 */
	public String part_pay_d_label2() {
		return getConstString(offset + 20, $part_pay_d_label2);
	}

	/**
	 *  一部支払明細用ラベル２.<p>
	 *
	 */
	public void part_pay_d_label2(String value) {
		setConstString(offset + 20, $part_pay_d_label2, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 21, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 21, $itm_nm, value);
	}


	/**
	 *  品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 22, $itm_alt_nm1);
	}

	/**
	 *  品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 22, $itm_alt_nm1, value);
	}


	/**
	 *  品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 23, $itm_alt_nm2);
	}

	/**
	 *  品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 23, $itm_alt_nm2, value);
	}


	/**
	 *  品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 24, $itm_alt_nm3);
	}

	/**
	 *  品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 24, $itm_alt_nm3, value);
	}


	/**
	 *  品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 25, $itm_alt_nm4);
	}

	/**
	 *  品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 25, $itm_alt_nm4, value);
	}


	/**
	 *  発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 26, $sppl_itm_nm);
	}

	/**
	 *  発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 26, $sppl_itm_nm, value);
	}


	/**
	 *  支払方式区分.<p>
	 *
	 */
	public String pay_mtd_typ() {
		return getConstString(offset + 27, $pay_mtd_typ);
	}

	/**
	 *  支払方式区分.<p>
	 *
	 */
	public void pay_mtd_typ(String value) {
		setConstString(offset + 27, $pay_mtd_typ, value);
	}


	/**
	 *  一部支払明細用金額１.<p>
	 *
	 */
	public MCNumber part_pay_d_amt1() {
		return getConstNumber(offset + 28, $part_pay_d_amt1);
	}

	/**
	 *  一部支払明細用金額１.<p>
	 *
	 */
	public void part_pay_d_amt1(MCNumber value) {
		setConstNumber(offset + 28, $part_pay_d_amt1, value);
	}

	/**
	 *  一部支払明細用金額１.<p>
	 *
	 */
	public void part_pay_d_amt1(int value) {
		setConstNumber(offset + 28, $part_pay_d_amt1, value);
	}

	/**
	 *  一部支払明細用金額１.<p>
	 *
	 */
	public void part_pay_d_amt1(long value) {
		setConstNumber(offset + 28, $part_pay_d_amt1, value);
	}

	/**
	 *  一部支払明細用金額１.<p>
	 *
	 */
	public void part_pay_d_amt1(float value) {
		setConstNumber(offset + 28, $part_pay_d_amt1, value);
	}

	/**
	 *  一部支払明細用金額１.<p>
	 *
	 */
	public void part_pay_d_amt1(double value) {
		setConstNumber(offset + 28, $part_pay_d_amt1, value);
	}


	/**
	 *  一部支払明細用金額１(整数部).<p>
	 *
	 */
	public String s_part_pay_d_amt1_int() {
		return getConstString(offset + 29, $s_part_pay_d_amt1_int);
	}

	/**
	 *  一部支払明細用金額１(整数部).<p>
	 *
	 */
	public void s_part_pay_d_amt1_int(String value) {
		setConstString(offset + 29, $s_part_pay_d_amt1_int, value);
	}


	/**
	 *  一部支払明細用金額１(小数部).<p>
	 *
	 */
	public String s_part_pay_d_amt1_dec() {
		return getConstString(offset + 30, $s_part_pay_d_amt1_dec);
	}

	/**
	 *  一部支払明細用金額１(小数部).<p>
	 *
	 */
	public void s_part_pay_d_amt1_dec(String value) {
		setConstString(offset + 30, $s_part_pay_d_amt1_dec, value);
	}


	/**
	 *  一部支払明細用金額２.<p>
	 *
	 */
	public MCNumber part_pay_d_amt2() {
		return getConstNumber(offset + 31, $part_pay_d_amt2);
	}

	/**
	 *  一部支払明細用金額２.<p>
	 *
	 */
	public void part_pay_d_amt2(MCNumber value) {
		setConstNumber(offset + 31, $part_pay_d_amt2, value);
	}

	/**
	 *  一部支払明細用金額２.<p>
	 *
	 */
	public void part_pay_d_amt2(int value) {
		setConstNumber(offset + 31, $part_pay_d_amt2, value);
	}

	/**
	 *  一部支払明細用金額２.<p>
	 *
	 */
	public void part_pay_d_amt2(long value) {
		setConstNumber(offset + 31, $part_pay_d_amt2, value);
	}

	/**
	 *  一部支払明細用金額２.<p>
	 *
	 */
	public void part_pay_d_amt2(float value) {
		setConstNumber(offset + 31, $part_pay_d_amt2, value);
	}

	/**
	 *  一部支払明細用金額２.<p>
	 *
	 */
	public void part_pay_d_amt2(double value) {
		setConstNumber(offset + 31, $part_pay_d_amt2, value);
	}


	/**
	 *  一部支払明細用金額２(整数部).<p>
	 *
	 */
	public String s_part_pay_d_amt2_int() {
		return getConstString(offset + 32, $s_part_pay_d_amt2_int);
	}

	/**
	 *  一部支払明細用金額２(整数部).<p>
	 *
	 */
	public void s_part_pay_d_amt2_int(String value) {
		setConstString(offset + 32, $s_part_pay_d_amt2_int, value);
	}


	/**
	 *  一部支払明細用金額２(小数部).<p>
	 *
	 */
	public String s_part_pay_d_amt2_dec() {
		return getConstString(offset + 33, $s_part_pay_d_amt2_dec);
	}

	/**
	 *  一部支払明細用金額２(小数部).<p>
	 *
	 */
	public void s_part_pay_d_amt2_dec(String value) {
		setConstString(offset + 33, $s_part_pay_d_amt2_dec, value);
	}


	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 34, $trd_cd);
	}

	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 34, $trd_cd, value);
	}


	/**
	 *  取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 35, $trd_nm);
	}

	/**
	 *  取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 35, $trd_nm, value);
	}


	/**
	 *  数量(数量).<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 36, $trd_unit_qty);
	}

	/**
	 *  数量(数量).<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 36, $trd_unit_qty, value);
	}

	/**
	 *  数量(数量).<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 36, $trd_unit_qty, value);
	}

	/**
	 *  数量(数量).<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 36, $trd_unit_qty, value);
	}

	/**
	 *  数量(数量).<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 36, $trd_unit_qty, value);
	}

	/**
	 *  数量(数量).<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 36, $trd_unit_qty, value);
	}


	/**
	 *  数量(数量)(整数部).<p>
	 *
	 */
	public String s_trd_unit_qty_int() {
		return getConstString(offset + 37, $s_trd_unit_qty_int);
	}

	/**
	 *  数量(数量)(整数部).<p>
	 *
	 */
	public void s_trd_unit_qty_int(String value) {
		setConstString(offset + 37, $s_trd_unit_qty_int, value);
	}


	/**
	 *  数量(数量)(小数部).<p>
	 *
	 */
	public String s_trd_unit_qty_dec() {
		return getConstString(offset + 38, $s_trd_unit_qty_dec);
	}

	/**
	 *  数量(数量)(小数部).<p>
	 *
	 */
	public void s_trd_unit_qty_dec(String value) {
		setConstString(offset + 38, $s_trd_unit_qty_dec, value);
	}


	/**
	 *  数量(単位名).<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 39, $trd_unit_cd);
	}

	/**
	 *  数量(単位名).<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 39, $trd_unit_cd, value);
	}


	/**
	 *  数量(単位名).<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 40, $unit_nm);
	}

	/**
	 *  数量(単位名).<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 40, $unit_nm, value);
	}


	/**
	 *  単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 41, $trd_cur_upri);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 41, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 41, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 41, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 41, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 41, $trd_cur_upri, value);
	}


	/**
	 *  単価(整数部).<p>
	 *
	 */
	public String s_trd_cur_upri_int() {
		return getConstString(offset + 42, $s_trd_cur_upri_int);
	}

	/**
	 *  単価(整数部).<p>
	 *
	 */
	public void s_trd_cur_upri_int(String value) {
		setConstString(offset + 42, $s_trd_cur_upri_int, value);
	}


	/**
	 *  単価(小数部).<p>
	 *
	 */
	public String s_trd_cur_upri_dec() {
		return getConstString(offset + 43, $s_trd_cur_upri_dec);
	}

	/**
	 *  単価(小数部).<p>
	 *
	 */
	public void s_trd_cur_upri_dec(String value) {
		setConstString(offset + 43, $s_trd_cur_upri_dec, value);
	}


	/**
	 *  内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 44, $inc_tax_flg);
	}

	/**
	 *  内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 44, $inc_tax_flg, value);
	}


	/**
	 *  内税.<p>
	 *
	 */
	public String s_inc_tax_flg() {
		return getConstString(offset + 45, $s_inc_tax_flg);
	}

	/**
	 *  内税.<p>
	 *
	 */
	public void s_inc_tax_flg(String value) {
		setConstString(offset + 45, $s_inc_tax_flg, value);
	}


	/**
	 *  仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 46, $interim_flg);
	}

	/**
	 *  仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 46, $interim_flg, value);
	}


	/**
	 *  仮単価文字列.<p>
	 *
	 */
	public String s_interim_flg() {
		return getConstString(offset + 47, $s_interim_flg);
	}

	/**
	 *  仮単価文字列.<p>
	 *
	 */
	public void s_interim_flg(String value) {
		setConstString(offset + 47, $s_interim_flg, value);
	}


	/**
	 *  金額(税抜).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 48, $trd_cur_amt);
	}

	/**
	 *  金額(税抜).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 48, $trd_cur_amt, value);
	}

	/**
	 *  金額(税抜).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 48, $trd_cur_amt, value);
	}

	/**
	 *  金額(税抜).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 48, $trd_cur_amt, value);
	}

	/**
	 *  金額(税抜).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 48, $trd_cur_amt, value);
	}

	/**
	 *  金額(税抜).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 48, $trd_cur_amt, value);
	}


	/**
	 *  金額(税抜)(整数部).<p>
	 *
	 */
	public String s_trd_cur_amt_int() {
		return getConstString(offset + 49, $s_trd_cur_amt_int);
	}

	/**
	 *  金額(税抜)(整数部).<p>
	 *
	 */
	public void s_trd_cur_amt_int(String value) {
		setConstString(offset + 49, $s_trd_cur_amt_int, value);
	}


	/**
	 *  金額(税抜)(小数部).<p>
	 *
	 */
	public String s_trd_cur_amt_dec() {
		return getConstString(offset + 50, $s_trd_cur_amt_dec);
	}

	/**
	 *  金額(税抜)(小数部).<p>
	 *
	 */
	public void s_trd_cur_amt_dec(String value) {
		setConstString(offset + 50, $s_trd_cur_amt_dec, value);
	}


	/**
	 *  値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 51, $trd_cur_dscnt_amt);
	}

	/**
	 *  値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 51, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 51, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 51, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 51, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 51, $trd_cur_dscnt_amt, value);
	}


	/**
	 *  値引額(整数部).<p>
	 *
	 */
	public String s_trd_cur_dscnt_amt_int() {
		return getConstString(offset + 52, $s_trd_cur_dscnt_amt_int);
	}

	/**
	 *  値引額(整数部).<p>
	 *
	 */
	public void s_trd_cur_dscnt_amt_int(String value) {
		setConstString(offset + 52, $s_trd_cur_dscnt_amt_int, value);
	}


	/**
	 *  値引額(小数部).<p>
	 *
	 */
	public String s_trd_cur_dscnt_amt_dec() {
		return getConstString(offset + 53, $s_trd_cur_dscnt_amt_dec);
	}

	/**
	 *  値引額(小数部).<p>
	 *
	 */
	public void s_trd_cur_dscnt_amt_dec(String value) {
		setConstString(offset + 53, $s_trd_cur_dscnt_amt_dec, value);
	}


	/**
	 *  消費税.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 54, $trd_cur_tax_amt);
	}

	/**
	 *  消費税.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 54, $trd_cur_tax_amt, value);
	}

	/**
	 *  消費税.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 54, $trd_cur_tax_amt, value);
	}

	/**
	 *  消費税.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 54, $trd_cur_tax_amt, value);
	}

	/**
	 *  消費税.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 54, $trd_cur_tax_amt, value);
	}

	/**
	 *  消費税.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 54, $trd_cur_tax_amt, value);
	}


	/**
	 *  消費税(整数部).<p>
	 *
	 */
	public String s_trd_cur_tax_amt_int() {
		return getConstString(offset + 55, $s_trd_cur_tax_amt_int);
	}

	/**
	 *  消費税(整数部).<p>
	 *
	 */
	public void s_trd_cur_tax_amt_int(String value) {
		setConstString(offset + 55, $s_trd_cur_tax_amt_int, value);
	}


	/**
	 *  消費税(小数部).<p>
	 *
	 */
	public String s_trd_cur_tax_amt_dec() {
		return getConstString(offset + 56, $s_trd_cur_tax_amt_dec);
	}

	/**
	 *  消費税(小数部).<p>
	 *
	 */
	public void s_trd_cur_tax_amt_dec(String value) {
		setConstString(offset + 56, $s_trd_cur_tax_amt_dec, value);
	}


	/**
	 *  消費税(税率).<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 57, $tax_rate);
	}

	/**
	 *  消費税(税率).<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 57, $tax_rate, value);
	}

	/**
	 *  消費税(税率).<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 57, $tax_rate, value);
	}

	/**
	 *  消費税(税率).<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 57, $tax_rate, value);
	}

	/**
	 *  消費税(税率).<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 57, $tax_rate, value);
	}

	/**
	 *  消費税(税率).<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 57, $tax_rate, value);
	}


	/**
	 *  消費税(税率)文字列.<p>
	 *
	 */
	public String s_tax_rate() {
		return getConstString(offset + 58, $s_tax_rate);
	}

	/**
	 *  消費税(税率)文字列.<p>
	 *
	 */
	public void s_tax_rate(String value) {
		setConstString(offset + 58, $s_tax_rate, value);
	}


	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 59, $tax_cd);
	}

	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 59, $tax_cd, value);
	}


	/**
	 *  税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 60, $tax_nm);
	}

	/**
	 *  税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 60, $tax_nm, value);
	}


	/**
	 *  明細備考.<p>
	 *
	 */
	public String pay_ntc_d_print_rmrks() {
		return getConstString(offset + 61, $pay_ntc_d_print_rmrks);
	}

	/**
	 *  明細備考.<p>
	 *
	 */
	public void pay_ntc_d_print_rmrks(String value) {
		setConstString(offset + 61, $pay_ntc_d_print_rmrks, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String d_sub_char1() {
		return getConstString(offset + 62, $d_sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void d_sub_char1(String value) {
		setConstString(offset + 62, $d_sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String d_sub_char2() {
		return getConstString(offset + 63, $d_sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void d_sub_char2(String value) {
		setConstString(offset + 63, $d_sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String d_sub_char3() {
		return getConstString(offset + 64, $d_sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void d_sub_char3(String value) {
		setConstString(offset + 64, $d_sub_char3, value);
	}


	public String getString(String name) {
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
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
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($part_pay_d_label1.equalsIgnoreCase(name)) {
			return part_pay_d_label1();
		}
		if ($part_pay_d_label2.equalsIgnoreCase(name)) {
			return part_pay_d_label2();
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
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
		}
		if ($s_part_pay_d_amt1_int.equalsIgnoreCase(name)) {
			return s_part_pay_d_amt1_int();
		}
		if ($s_part_pay_d_amt1_dec.equalsIgnoreCase(name)) {
			return s_part_pay_d_amt1_dec();
		}
		if ($s_part_pay_d_amt2_int.equalsIgnoreCase(name)) {
			return s_part_pay_d_amt2_int();
		}
		if ($s_part_pay_d_amt2_dec.equalsIgnoreCase(name)) {
			return s_part_pay_d_amt2_dec();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($s_trd_unit_qty_int.equalsIgnoreCase(name)) {
			return s_trd_unit_qty_int();
		}
		if ($s_trd_unit_qty_dec.equalsIgnoreCase(name)) {
			return s_trd_unit_qty_dec();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($s_trd_cur_upri_int.equalsIgnoreCase(name)) {
			return s_trd_cur_upri_int();
		}
		if ($s_trd_cur_upri_dec.equalsIgnoreCase(name)) {
			return s_trd_cur_upri_dec();
		}
		if ($s_inc_tax_flg.equalsIgnoreCase(name)) {
			return s_inc_tax_flg();
		}
		if ($s_interim_flg.equalsIgnoreCase(name)) {
			return s_interim_flg();
		}
		if ($s_trd_cur_amt_int.equalsIgnoreCase(name)) {
			return s_trd_cur_amt_int();
		}
		if ($s_trd_cur_amt_dec.equalsIgnoreCase(name)) {
			return s_trd_cur_amt_dec();
		}
		if ($s_trd_cur_dscnt_amt_int.equalsIgnoreCase(name)) {
			return s_trd_cur_dscnt_amt_int();
		}
		if ($s_trd_cur_dscnt_amt_dec.equalsIgnoreCase(name)) {
			return s_trd_cur_dscnt_amt_dec();
		}
		if ($s_trd_cur_tax_amt_int.equalsIgnoreCase(name)) {
			return s_trd_cur_tax_amt_int();
		}
		if ($s_trd_cur_tax_amt_dec.equalsIgnoreCase(name)) {
			return s_trd_cur_tax_amt_dec();
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			return s_tax_rate();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			return d_sub_char1();
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			return d_sub_char2();
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			return d_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($part_pay_d_amt1.equalsIgnoreCase(name)) {
			return part_pay_d_amt1();
		}
		if ($part_pay_d_amt2.equalsIgnoreCase(name)) {
			return part_pay_d_amt2();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($purc_ac_dt.equalsIgnoreCase(name)) {
			return purc_ac_dt();
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			return base_purc_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
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
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($part_pay_d_label1.equalsIgnoreCase(name)) {
			return part_pay_d_label1();
		}
		if ($part_pay_d_label2.equalsIgnoreCase(name)) {
			return part_pay_d_label2();
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
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
		}
		if ($s_part_pay_d_amt1_int.equalsIgnoreCase(name)) {
			return s_part_pay_d_amt1_int();
		}
		if ($s_part_pay_d_amt1_dec.equalsIgnoreCase(name)) {
			return s_part_pay_d_amt1_dec();
		}
		if ($s_part_pay_d_amt2_int.equalsIgnoreCase(name)) {
			return s_part_pay_d_amt2_int();
		}
		if ($s_part_pay_d_amt2_dec.equalsIgnoreCase(name)) {
			return s_part_pay_d_amt2_dec();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($s_trd_unit_qty_int.equalsIgnoreCase(name)) {
			return s_trd_unit_qty_int();
		}
		if ($s_trd_unit_qty_dec.equalsIgnoreCase(name)) {
			return s_trd_unit_qty_dec();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($s_trd_cur_upri_int.equalsIgnoreCase(name)) {
			return s_trd_cur_upri_int();
		}
		if ($s_trd_cur_upri_dec.equalsIgnoreCase(name)) {
			return s_trd_cur_upri_dec();
		}
		if ($s_inc_tax_flg.equalsIgnoreCase(name)) {
			return s_inc_tax_flg();
		}
		if ($s_interim_flg.equalsIgnoreCase(name)) {
			return s_interim_flg();
		}
		if ($s_trd_cur_amt_int.equalsIgnoreCase(name)) {
			return s_trd_cur_amt_int();
		}
		if ($s_trd_cur_amt_dec.equalsIgnoreCase(name)) {
			return s_trd_cur_amt_dec();
		}
		if ($s_trd_cur_dscnt_amt_int.equalsIgnoreCase(name)) {
			return s_trd_cur_dscnt_amt_int();
		}
		if ($s_trd_cur_dscnt_amt_dec.equalsIgnoreCase(name)) {
			return s_trd_cur_dscnt_amt_dec();
		}
		if ($s_trd_cur_tax_amt_int.equalsIgnoreCase(name)) {
			return s_trd_cur_tax_amt_int();
		}
		if ($s_trd_cur_tax_amt_dec.equalsIgnoreCase(name)) {
			return s_trd_cur_tax_amt_dec();
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			return s_tax_rate();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_ntc_d_print_rmrks();
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			return d_sub_char1();
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			return d_sub_char2();
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			return d_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($part_pay_d_amt1.equalsIgnoreCase(name)) {
			return part_pay_d_amt1();
		}
		if ($part_pay_d_amt2.equalsIgnoreCase(name)) {
			return part_pay_d_amt2();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($purc_ac_dt.equalsIgnoreCase(name)) {
			return purc_ac_dt();
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			return base_purc_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
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
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
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
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($part_pay_d_label1.equalsIgnoreCase(name)) {
			part_pay_d_label1(value);
			return;
		}
		if ($part_pay_d_label2.equalsIgnoreCase(name)) {
			part_pay_d_label2(value);
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
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
			return;
		}
		if ($s_part_pay_d_amt1_int.equalsIgnoreCase(name)) {
			s_part_pay_d_amt1_int(value);
			return;
		}
		if ($s_part_pay_d_amt1_dec.equalsIgnoreCase(name)) {
			s_part_pay_d_amt1_dec(value);
			return;
		}
		if ($s_part_pay_d_amt2_int.equalsIgnoreCase(name)) {
			s_part_pay_d_amt2_int(value);
			return;
		}
		if ($s_part_pay_d_amt2_dec.equalsIgnoreCase(name)) {
			s_part_pay_d_amt2_dec(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($s_trd_unit_qty_int.equalsIgnoreCase(name)) {
			s_trd_unit_qty_int(value);
			return;
		}
		if ($s_trd_unit_qty_dec.equalsIgnoreCase(name)) {
			s_trd_unit_qty_dec(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($s_trd_cur_upri_int.equalsIgnoreCase(name)) {
			s_trd_cur_upri_int(value);
			return;
		}
		if ($s_trd_cur_upri_dec.equalsIgnoreCase(name)) {
			s_trd_cur_upri_dec(value);
			return;
		}
		if ($s_inc_tax_flg.equalsIgnoreCase(name)) {
			s_inc_tax_flg(value);
			return;
		}
		if ($s_interim_flg.equalsIgnoreCase(name)) {
			s_interim_flg(value);
			return;
		}
		if ($s_trd_cur_amt_int.equalsIgnoreCase(name)) {
			s_trd_cur_amt_int(value);
			return;
		}
		if ($s_trd_cur_amt_dec.equalsIgnoreCase(name)) {
			s_trd_cur_amt_dec(value);
			return;
		}
		if ($s_trd_cur_dscnt_amt_int.equalsIgnoreCase(name)) {
			s_trd_cur_dscnt_amt_int(value);
			return;
		}
		if ($s_trd_cur_dscnt_amt_dec.equalsIgnoreCase(name)) {
			s_trd_cur_dscnt_amt_dec(value);
			return;
		}
		if ($s_trd_cur_tax_amt_int.equalsIgnoreCase(name)) {
			s_trd_cur_tax_amt_int(value);
			return;
		}
		if ($s_trd_cur_tax_amt_dec.equalsIgnoreCase(name)) {
			s_trd_cur_tax_amt_dec(value);
			return;
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			s_tax_rate(value);
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
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
			return;
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			d_sub_char1(value);
			return;
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			d_sub_char2(value);
			return;
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			d_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($part_pay_d_amt1.equalsIgnoreCase(name)) {
			part_pay_d_amt1(value);
			return;
		}
		if ($part_pay_d_amt2.equalsIgnoreCase(name)) {
			part_pay_d_amt2(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($part_pay_d_amt1.equalsIgnoreCase(name)) {
			part_pay_d_amt1(value);
			return;
		}
		if ($part_pay_d_amt2.equalsIgnoreCase(name)) {
			part_pay_d_amt2(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($part_pay_d_amt1.equalsIgnoreCase(name)) {
			part_pay_d_amt1(value);
			return;
		}
		if ($part_pay_d_amt2.equalsIgnoreCase(name)) {
			part_pay_d_amt2(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($part_pay_d_amt1.equalsIgnoreCase(name)) {
			part_pay_d_amt1(value);
			return;
		}
		if ($part_pay_d_amt2.equalsIgnoreCase(name)) {
			part_pay_d_amt2(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($part_pay_d_amt1.equalsIgnoreCase(name)) {
			part_pay_d_amt1(value);
			return;
		}
		if ($part_pay_d_amt2.equalsIgnoreCase(name)) {
			part_pay_d_amt2(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($purc_ac_dt.equalsIgnoreCase(name)) {
			purc_ac_dt(value);
			return;
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			base_purc_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
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
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
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
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($part_pay_d_label1.equalsIgnoreCase(name)) {
			part_pay_d_label1(value);
			return;
		}
		if ($part_pay_d_label2.equalsIgnoreCase(name)) {
			part_pay_d_label2(value);
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
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
			return;
		}
		if ($s_part_pay_d_amt1_int.equalsIgnoreCase(name)) {
			s_part_pay_d_amt1_int(value);
			return;
		}
		if ($s_part_pay_d_amt1_dec.equalsIgnoreCase(name)) {
			s_part_pay_d_amt1_dec(value);
			return;
		}
		if ($s_part_pay_d_amt2_int.equalsIgnoreCase(name)) {
			s_part_pay_d_amt2_int(value);
			return;
		}
		if ($s_part_pay_d_amt2_dec.equalsIgnoreCase(name)) {
			s_part_pay_d_amt2_dec(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($s_trd_unit_qty_int.equalsIgnoreCase(name)) {
			s_trd_unit_qty_int(value);
			return;
		}
		if ($s_trd_unit_qty_dec.equalsIgnoreCase(name)) {
			s_trd_unit_qty_dec(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($s_trd_cur_upri_int.equalsIgnoreCase(name)) {
			s_trd_cur_upri_int(value);
			return;
		}
		if ($s_trd_cur_upri_dec.equalsIgnoreCase(name)) {
			s_trd_cur_upri_dec(value);
			return;
		}
		if ($s_inc_tax_flg.equalsIgnoreCase(name)) {
			s_inc_tax_flg(value);
			return;
		}
		if ($s_interim_flg.equalsIgnoreCase(name)) {
			s_interim_flg(value);
			return;
		}
		if ($s_trd_cur_amt_int.equalsIgnoreCase(name)) {
			s_trd_cur_amt_int(value);
			return;
		}
		if ($s_trd_cur_amt_dec.equalsIgnoreCase(name)) {
			s_trd_cur_amt_dec(value);
			return;
		}
		if ($s_trd_cur_dscnt_amt_int.equalsIgnoreCase(name)) {
			s_trd_cur_dscnt_amt_int(value);
			return;
		}
		if ($s_trd_cur_dscnt_amt_dec.equalsIgnoreCase(name)) {
			s_trd_cur_dscnt_amt_dec(value);
			return;
		}
		if ($s_trd_cur_tax_amt_int.equalsIgnoreCase(name)) {
			s_trd_cur_tax_amt_int(value);
			return;
		}
		if ($s_trd_cur_tax_amt_dec.equalsIgnoreCase(name)) {
			s_trd_cur_tax_amt_dec(value);
			return;
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			s_tax_rate(value);
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
		if ($pay_ntc_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_ntc_d_print_rmrks(value);
			return;
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			d_sub_char1(value);
			return;
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			d_sub_char2(value);
			return;
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			d_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($part_pay_d_amt1.equalsIgnoreCase(name)) {
			part_pay_d_amt1(value);
			return;
		}
		if ($part_pay_d_amt2.equalsIgnoreCase(name)) {
			part_pay_d_amt2(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($part_pay_d_amt1.equalsIgnoreCase(name)) {
			part_pay_d_amt1(value);
			return;
		}
		if ($part_pay_d_amt2.equalsIgnoreCase(name)) {
			part_pay_d_amt2(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($part_pay_d_amt1.equalsIgnoreCase(name)) {
			part_pay_d_amt1(value);
			return;
		}
		if ($part_pay_d_amt2.equalsIgnoreCase(name)) {
			part_pay_d_amt2(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($part_pay_d_amt1.equalsIgnoreCase(name)) {
			part_pay_d_amt1(value);
			return;
		}
		if ($part_pay_d_amt2.equalsIgnoreCase(name)) {
			part_pay_d_amt2(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($part_pay_d_amt1.equalsIgnoreCase(name)) {
			part_pay_d_amt1(value);
			return;
		}
		if ($part_pay_d_amt2.equalsIgnoreCase(name)) {
			part_pay_d_amt2(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($purc_ac_dt.equalsIgnoreCase(name)) {
			purc_ac_dt(value);
			return;
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			base_purc_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

