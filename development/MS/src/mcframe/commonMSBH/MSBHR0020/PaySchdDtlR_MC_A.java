package mcframe.commonMSBH.MSBHR0020;

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
 * ブロック"PaySchdDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PaySchdDtlR_MC_A extends MCConstRow {

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
	 *  数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 *  数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_unit_qty = "s_int_unit_qty";
	/**
	 *  数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_unit_qty = "s_dec_unit_qty";
	/**
	 *  単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 *  発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 *  発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 *  発注先別名１.<p>
	 *
	 */
	public static final String $sppl_alt_nm1 = "sppl_alt_nm1";
	/**
	 *  発注先別名２.<p>
	 *
	 */
	public static final String $sppl_alt_nm2 = "sppl_alt_nm2";
	/**
	 *  発注先別名３.<p>
	 *
	 */
	public static final String $sppl_alt_nm3 = "sppl_alt_nm3";
	/**
	 *  発注先別名４.<p>
	 *
	 */
	public static final String $sppl_alt_nm4 = "sppl_alt_nm4";
	/**
	 *  単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 *  単価文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_upri = "s_int_upri";
	/**
	 *  単価文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_upri = "s_dec_upri";
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
	 *  金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 *  金額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_amt = "s_int_amt";
	/**
	 *  金額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_amt = "s_dec_amt";
	/**
	 *  納品書ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_no = "bp_dlv_slip_no";
	/**
	 *  税金額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 *  税金額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_tax_amt = "s_int_tax_amt";
	/**
	 *  税金額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_tax_amt = "s_dec_tax_amt";
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
	 *  税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 *  税率文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_tax_rate = "s_int_tax_rate";
	/**
	 *  税率文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_tax_rate = "s_dec_tax_rate";
	/**
	 *  実績日.<p>
	 *
	 */
	public static final String $act_dt = "act_dt";
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
	 *  明細備考.<p>
	 *
	 */
	public static final String $pay_schd_d_print_rmrks = "pay_schd_d_print_rmrks";
	/**
	 *  支払方式区分.<p>
	 *
	 */
	public static final String $pay_mtd_typ = "pay_mtd_typ";
	/**
	 *  支払方式名.<p>
	 *
	 */
	public static final String $pay_mtd_typ_nm = "pay_mtd_typ_nm";
	/**
	 *  繰越分ＦＬＧ.<p>
	 *
	 */
	public static final String $crryovr_flg = "crryovr_flg";
	/**
	 *  一部支払マーク.<p>
	 *
	 */
	public static final String $part_pay_mark = "part_pay_mark";
	/**
	 *  単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_upri_dec_place = "trd_cur_upri_dec_place";
	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 *  内税文字列.<p>
	 *
	 */
	public static final String $s_inc_tax_flg = "s_inc_tax_flg";
	/**
	 *  取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 *  値引品目ＦＬＧ.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 *  加工単価.<p>
	 *
	 */
	public static final String $trd_cur_proc_upri = "trd_cur_proc_upri";
	/**
	 *  加工単価文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_proc_upri = "s_int_proc_upri";
	/**
	 *  加工単価文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_proc_upri = "s_dec_proc_upri";
	/**
	 *  加工金額.<p>
	 *
	 */
	public static final String $trd_cur_proc_amt = "trd_cur_proc_amt";
	/**
	 *  加工金額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_proc_amt = "s_int_proc_amt";
	/**
	 *  加工金額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_proc_amt = "s_dec_proc_amt";
	/**
	 *  有償支給単価.<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_upri = "trd_cur_onr_prov_upri";
	/**
	 *  有償支給単価文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_onr_prov_upri = "s_int_onr_prov_upri";
	/**
	 *  有償支給単価文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_onr_prov_upri = "s_dec_onr_prov_upri";
	/**
	 *  有償支給金額.<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_amt = "trd_cur_onr_prov_amt";
	/**
	 *  有償支給金額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_onr_prov_amt = "s_int_onr_prov_amt";
	/**
	 *  有償支給金額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_onr_prov_amt = "s_dec_onr_prov_amt";
	/**
	 *  買戻義務ＦＬＧ.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_view_META = createCommonMeta($itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view_META = createCommonMeta($itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view_META = createCommonMeta($itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub1_data_META = createCommonMeta($itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_data_META = createCommonMeta($itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_data_META = createCommonMeta($itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_unit_qty_META = createStringMeta($s_int_unit_qty);
	public static final MCMeta s_dec_unit_qty_META = createStringMeta($s_dec_unit_qty);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_alt_nm1_META = createCommonMeta($sppl_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta sppl_alt_nm2_META = createCommonMeta($sppl_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta sppl_alt_nm3_META = createCommonMeta($sppl_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta sppl_alt_nm4_META = createCommonMeta($sppl_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_upri_META = createStringMeta($s_int_upri);
	public static final MCMeta s_dec_upri_META = createStringMeta($s_dec_upri);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_amt_META = createStringMeta($s_int_amt);
	public static final MCMeta s_dec_amt_META = createStringMeta($s_dec_amt);
	public static final MCMeta bp_dlv_slip_no_META = createCommonMeta($bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_tax_amt_META = createStringMeta($s_int_tax_amt);
	public static final MCMeta s_dec_tax_amt_META = createStringMeta($s_dec_tax_amt);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_tax_rate_META = createStringMeta($s_int_tax_rate);
	public static final MCMeta s_dec_tax_rate_META = createStringMeta($s_dec_tax_rate);
	public static final MCMeta act_dt_META = createCommonMeta($act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta pay_schd_d_print_rmrks_META = createCommonMeta($pay_schd_d_print_rmrks, mcframe.commonMS.meta.MS_META.PAY_SCHD_D_PRINT_RMRKS);
	public static final MCMeta pay_mtd_typ_META = createCommonMeta($pay_mtd_typ, mcframe.commonMS.meta.MS_META.PAY_MTD_TYP);
	public static final MCMeta pay_mtd_typ_nm_META = createCommonMeta($pay_mtd_typ_nm, mcframe.commonMS.meta.MS_META.PAY_MTD_TYP_NM);
	public static final MCMeta crryovr_flg_META = createCommonMeta($crryovr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_pay_mark_META = createStringMeta($part_pay_mark);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta s_inc_tax_flg_META = createStringMeta($s_inc_tax_flg);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_proc_upri_META = createCommonMeta($trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_proc_upri_META = createStringMeta($s_int_proc_upri);
	public static final MCMeta s_dec_proc_upri_META = createStringMeta($s_dec_proc_upri);
	public static final MCMeta trd_cur_proc_amt_META = createCommonMeta($trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_proc_amt_META = createStringMeta($s_int_proc_amt);
	public static final MCMeta s_dec_proc_amt_META = createStringMeta($s_dec_proc_amt);
	public static final MCMeta trd_cur_onr_prov_upri_META = createCommonMeta($trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_onr_prov_upri_META = createStringMeta($s_int_onr_prov_upri);
	public static final MCMeta s_dec_onr_prov_upri_META = createStringMeta($s_dec_onr_prov_upri);
	public static final MCMeta trd_cur_onr_prov_amt_META = createCommonMeta($trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_onr_prov_amt_META = createStringMeta($s_int_onr_prov_amt);
	public static final MCMeta s_dec_onr_prov_amt_META = createStringMeta($s_dec_onr_prov_amt);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<PaySchdDtlR> constMetas = new ConstMetaList<PaySchdDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_view_META,
			itm_sub2_view_META,
			itm_sub3_view_META,
			itm_sub1_data_META,
			itm_sub2_data_META,
			itm_sub3_data_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			trd_unit_qty_META,
			s_int_unit_qty_META,
			s_dec_unit_qty_META,
			trd_unit_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			sppl_alt_nm1_META,
			sppl_alt_nm2_META,
			sppl_alt_nm3_META,
			sppl_alt_nm4_META,
			trd_cur_upri_META,
			s_int_upri_META,
			s_dec_upri_META,
			po_no_META,
			po_d_no_META,
			trd_cur_amt_META,
			s_int_amt_META,
			s_dec_amt_META,
			bp_dlv_slip_no_META,
			trd_cur_tax_amt_META,
			s_int_tax_amt_META,
			s_dec_tax_amt_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			s_int_tax_rate_META,
			s_dec_tax_rate_META,
			act_dt_META,
			trd_cd_META,
			trd_nm_META,
			pay_schd_d_print_rmrks_META,
			pay_mtd_typ_META,
			pay_mtd_typ_nm_META,
			crryovr_flg_META,
			part_pay_mark_META,
			trd_unit_dec_place_META,
			trd_cur_upri_dec_place_META,
			trd_cur_amt_dec_place_META,
			inc_tax_flg_META,
			s_inc_tax_flg_META,
			trd_ptn_typ_META,
			dscnt_itm_flg_META,
			trd_cur_proc_upri_META,
			s_int_proc_upri_META,
			s_dec_proc_upri_META,
			trd_cur_proc_amt_META,
			s_int_proc_amt_META,
			s_dec_proc_amt_META,
			trd_cur_onr_prov_upri_META,
			s_int_onr_prov_upri_META,
			s_dec_onr_prov_upri_META,
			trd_cur_onr_prov_amt_META,
			s_int_onr_prov_amt_META,
			s_dec_onr_prov_amt_META,
			repurc_obli_flg_META
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
	protected PaySchdDtlR_MC_A(ConstMetaList<? extends PaySchdDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchdDtlR clone() {
		return (PaySchdDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchdDtlR createInstance() {
		return (PaySchdDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchdDtlR getValues(String... names) {
		return (PaySchdDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 1, $itm_sub1_view);
	}

	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 1, $itm_sub1_view, value);
	}


	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 2, $itm_sub2_view);
	}

	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 2, $itm_sub2_view, value);
	}


	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 3, $itm_sub3_view);
	}

	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 3, $itm_sub3_view, value);
	}


	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 4, $itm_sub1_data);
	}

	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 4, $itm_sub1_data, value);
	}


	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 5, $itm_sub2_data);
	}

	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 5, $itm_sub2_data, value);
	}


	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 6, $itm_sub3_data);
	}

	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 6, $itm_sub3_data, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 7, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 7, $itm_nm, value);
	}


	/**
	 *  品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 8, $itm_alt_nm1);
	}

	/**
	 *  品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 8, $itm_alt_nm1, value);
	}


	/**
	 *  品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 9, $itm_alt_nm2);
	}

	/**
	 *  品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 9, $itm_alt_nm2, value);
	}


	/**
	 *  品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 10, $itm_alt_nm3);
	}

	/**
	 *  品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 10, $itm_alt_nm3, value);
	}


	/**
	 *  品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 11, $itm_alt_nm4);
	}

	/**
	 *  品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 11, $itm_alt_nm4, value);
	}


	/**
	 *  数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 12, $trd_unit_qty);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 12, $trd_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 12, $trd_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 12, $trd_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 12, $trd_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 12, $trd_unit_qty, value);
	}


	/**
	 *  数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_unit_qty() {
		return getConstString(offset + 13, $s_int_unit_qty);
	}

	/**
	 *  数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_unit_qty(String value) {
		setConstString(offset + 13, $s_int_unit_qty, value);
	}


	/**
	 *  数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_unit_qty() {
		return getConstString(offset + 14, $s_dec_unit_qty);
	}

	/**
	 *  数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_unit_qty(String value) {
		setConstString(offset + 14, $s_dec_unit_qty, value);
	}


	/**
	 *  単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 15, $trd_unit_nm);
	}

	/**
	 *  単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 15, $trd_unit_nm, value);
	}


	/**
	 *  発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 16, $sppl_cd);
	}

	/**
	 *  発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 16, $sppl_cd, value);
	}


	/**
	 *  発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 17, $sppl_nm);
	}

	/**
	 *  発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 17, $sppl_nm, value);
	}


	/**
	 *  発注先別名１.<p>
	 *
	 */
	public String sppl_alt_nm1() {
		return getConstString(offset + 18, $sppl_alt_nm1);
	}

	/**
	 *  発注先別名１.<p>
	 *
	 */
	public void sppl_alt_nm1(String value) {
		setConstString(offset + 18, $sppl_alt_nm1, value);
	}


	/**
	 *  発注先別名２.<p>
	 *
	 */
	public String sppl_alt_nm2() {
		return getConstString(offset + 19, $sppl_alt_nm2);
	}

	/**
	 *  発注先別名２.<p>
	 *
	 */
	public void sppl_alt_nm2(String value) {
		setConstString(offset + 19, $sppl_alt_nm2, value);
	}


	/**
	 *  発注先別名３.<p>
	 *
	 */
	public String sppl_alt_nm3() {
		return getConstString(offset + 20, $sppl_alt_nm3);
	}

	/**
	 *  発注先別名３.<p>
	 *
	 */
	public void sppl_alt_nm3(String value) {
		setConstString(offset + 20, $sppl_alt_nm3, value);
	}


	/**
	 *  発注先別名４.<p>
	 *
	 */
	public String sppl_alt_nm4() {
		return getConstString(offset + 21, $sppl_alt_nm4);
	}

	/**
	 *  発注先別名４.<p>
	 *
	 */
	public void sppl_alt_nm4(String value) {
		setConstString(offset + 21, $sppl_alt_nm4, value);
	}


	/**
	 *  単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 22, $trd_cur_upri);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 22, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 22, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 22, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 22, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 22, $trd_cur_upri, value);
	}


	/**
	 *  単価文字列（整数部）.<p>
	 *
	 */
	public String s_int_upri() {
		return getConstString(offset + 23, $s_int_upri);
	}

	/**
	 *  単価文字列（整数部）.<p>
	 *
	 */
	public void s_int_upri(String value) {
		setConstString(offset + 23, $s_int_upri, value);
	}


	/**
	 *  単価文字列（小数部）.<p>
	 *
	 */
	public String s_dec_upri() {
		return getConstString(offset + 24, $s_dec_upri);
	}

	/**
	 *  単価文字列（小数部）.<p>
	 *
	 */
	public void s_dec_upri(String value) {
		setConstString(offset + 24, $s_dec_upri, value);
	}


	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 25, $po_no);
	}

	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 25, $po_no, value);
	}


	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 26, $po_d_no);
	}

	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 26, $po_d_no, value);
	}


	/**
	 *  金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 27, $trd_cur_amt);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}


	/**
	 *  金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_amt() {
		return getConstString(offset + 28, $s_int_amt);
	}

	/**
	 *  金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_amt(String value) {
		setConstString(offset + 28, $s_int_amt, value);
	}


	/**
	 *  金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_amt() {
		return getConstString(offset + 29, $s_dec_amt);
	}

	/**
	 *  金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_amt(String value) {
		setConstString(offset + 29, $s_dec_amt, value);
	}


	/**
	 *  納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return getConstString(offset + 30, $bp_dlv_slip_no);
	}

	/**
	 *  納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		setConstString(offset + 30, $bp_dlv_slip_no, value);
	}


	/**
	 *  税金額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 31, $trd_cur_tax_amt);
	}

	/**
	 *  税金額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 31, $trd_cur_tax_amt, value);
	}

	/**
	 *  税金額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 31, $trd_cur_tax_amt, value);
	}

	/**
	 *  税金額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 31, $trd_cur_tax_amt, value);
	}

	/**
	 *  税金額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 31, $trd_cur_tax_amt, value);
	}

	/**
	 *  税金額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 31, $trd_cur_tax_amt, value);
	}


	/**
	 *  税金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_tax_amt() {
		return getConstString(offset + 32, $s_int_tax_amt);
	}

	/**
	 *  税金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_tax_amt(String value) {
		setConstString(offset + 32, $s_int_tax_amt, value);
	}


	/**
	 *  税金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_tax_amt() {
		return getConstString(offset + 33, $s_dec_tax_amt);
	}

	/**
	 *  税金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_tax_amt(String value) {
		setConstString(offset + 33, $s_dec_tax_amt, value);
	}


	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 34, $tax_cd);
	}

	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 34, $tax_cd, value);
	}


	/**
	 *  税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 35, $tax_nm);
	}

	/**
	 *  税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 35, $tax_nm, value);
	}


	/**
	 *  税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 36, $tax_rate);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 36, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 36, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 36, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 36, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 36, $tax_rate, value);
	}


	/**
	 *  税率文字列（整数部）.<p>
	 *
	 */
	public String s_int_tax_rate() {
		return getConstString(offset + 37, $s_int_tax_rate);
	}

	/**
	 *  税率文字列（整数部）.<p>
	 *
	 */
	public void s_int_tax_rate(String value) {
		setConstString(offset + 37, $s_int_tax_rate, value);
	}


	/**
	 *  税率文字列（小数部）.<p>
	 *
	 */
	public String s_dec_tax_rate() {
		return getConstString(offset + 38, $s_dec_tax_rate);
	}

	/**
	 *  税率文字列（小数部）.<p>
	 *
	 */
	public void s_dec_tax_rate(String value) {
		setConstString(offset + 38, $s_dec_tax_rate, value);
	}


	/**
	 *  実績日.<p>
	 *
	 */
	public MCDate act_dt() {
		return getConstDate(offset + 39, $act_dt);
	}

	/**
	 *  実績日.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		setConstDate(offset + 39, $act_dt, value);
	}


	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 40, $trd_cd);
	}

	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 40, $trd_cd, value);
	}


	/**
	 *  取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 41, $trd_nm);
	}

	/**
	 *  取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 41, $trd_nm, value);
	}


	/**
	 *  明細備考.<p>
	 *
	 */
	public String pay_schd_d_print_rmrks() {
		return getConstString(offset + 42, $pay_schd_d_print_rmrks);
	}

	/**
	 *  明細備考.<p>
	 *
	 */
	public void pay_schd_d_print_rmrks(String value) {
		setConstString(offset + 42, $pay_schd_d_print_rmrks, value);
	}


	/**
	 *  支払方式区分.<p>
	 *
	 */
	public String pay_mtd_typ() {
		return getConstString(offset + 43, $pay_mtd_typ);
	}

	/**
	 *  支払方式区分.<p>
	 *
	 */
	public void pay_mtd_typ(String value) {
		setConstString(offset + 43, $pay_mtd_typ, value);
	}


	/**
	 *  支払方式名.<p>
	 *
	 */
	public String pay_mtd_typ_nm() {
		return getConstString(offset + 44, $pay_mtd_typ_nm);
	}

	/**
	 *  支払方式名.<p>
	 *
	 */
	public void pay_mtd_typ_nm(String value) {
		setConstString(offset + 44, $pay_mtd_typ_nm, value);
	}


	/**
	 *  繰越分ＦＬＧ.<p>
	 *
	 */
	public boolean crryovr_flg() {
		return getConstBoolean(offset + 45, $crryovr_flg);
	}

	/**
	 *  繰越分ＦＬＧ.<p>
	 *
	 */
	public void crryovr_flg(boolean value) {
		setConstBoolean(offset + 45, $crryovr_flg, value);
	}


	/**
	 *  一部支払マーク.<p>
	 *
	 */
	public String part_pay_mark() {
		return getConstString(offset + 46, $part_pay_mark);
	}

	/**
	 *  一部支払マーク.<p>
	 *
	 */
	public void part_pay_mark(String value) {
		setConstString(offset + 46, $part_pay_mark, value);
	}


	/**
	 *  単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 47, $trd_unit_dec_place);
	}

	/**
	 *  単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 47, $trd_unit_dec_place, value);
	}

	/**
	 *  単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 47, $trd_unit_dec_place, value);
	}

	/**
	 *  単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 47, $trd_unit_dec_place, value);
	}

	/**
	 *  単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 47, $trd_unit_dec_place, value);
	}

	/**
	 *  単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 47, $trd_unit_dec_place, value);
	}


	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 48, $trd_cur_upri_dec_place);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 48, $trd_cur_upri_dec_place, value);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 48, $trd_cur_upri_dec_place, value);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 48, $trd_cur_upri_dec_place, value);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 48, $trd_cur_upri_dec_place, value);
	}

	/**
	 *  単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 48, $trd_cur_upri_dec_place, value);
	}


	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 49, $trd_cur_amt_dec_place);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 49, $trd_cur_amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 49, $trd_cur_amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 49, $trd_cur_amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 49, $trd_cur_amt_dec_place, value);
	}

	/**
	 *  金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 49, $trd_cur_amt_dec_place, value);
	}


	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 50, $inc_tax_flg);
	}

	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 50, $inc_tax_flg, value);
	}


	/**
	 *  内税文字列.<p>
	 *
	 */
	public String s_inc_tax_flg() {
		return getConstString(offset + 51, $s_inc_tax_flg);
	}

	/**
	 *  内税文字列.<p>
	 *
	 */
	public void s_inc_tax_flg(String value) {
		setConstString(offset + 51, $s_inc_tax_flg, value);
	}


	/**
	 *  取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 52, $trd_ptn_typ);
	}

	/**
	 *  取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 52, $trd_ptn_typ, value);
	}


	/**
	 *  値引品目ＦＬＧ.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 53, $dscnt_itm_flg);
	}

	/**
	 *  値引品目ＦＬＧ.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 53, $dscnt_itm_flg, value);
	}


	/**
	 *  加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return getConstNumber(offset + 54, $trd_cur_proc_upri);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 54, $trd_cur_proc_upri, value);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		setConstNumber(offset + 54, $trd_cur_proc_upri, value);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		setConstNumber(offset + 54, $trd_cur_proc_upri, value);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		setConstNumber(offset + 54, $trd_cur_proc_upri, value);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		setConstNumber(offset + 54, $trd_cur_proc_upri, value);
	}


	/**
	 *  加工単価文字列（整数部）.<p>
	 *
	 */
	public String s_int_proc_upri() {
		return getConstString(offset + 55, $s_int_proc_upri);
	}

	/**
	 *  加工単価文字列（整数部）.<p>
	 *
	 */
	public void s_int_proc_upri(String value) {
		setConstString(offset + 55, $s_int_proc_upri, value);
	}


	/**
	 *  加工単価文字列（小数部）.<p>
	 *
	 */
	public String s_dec_proc_upri() {
		return getConstString(offset + 56, $s_dec_proc_upri);
	}

	/**
	 *  加工単価文字列（小数部）.<p>
	 *
	 */
	public void s_dec_proc_upri(String value) {
		setConstString(offset + 56, $s_dec_proc_upri, value);
	}


	/**
	 *  加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return getConstNumber(offset + 57, $trd_cur_proc_amt);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 57, $trd_cur_proc_amt, value);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		setConstNumber(offset + 57, $trd_cur_proc_amt, value);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		setConstNumber(offset + 57, $trd_cur_proc_amt, value);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		setConstNumber(offset + 57, $trd_cur_proc_amt, value);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		setConstNumber(offset + 57, $trd_cur_proc_amt, value);
	}


	/**
	 *  加工金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_proc_amt() {
		return getConstString(offset + 58, $s_int_proc_amt);
	}

	/**
	 *  加工金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_proc_amt(String value) {
		setConstString(offset + 58, $s_int_proc_amt, value);
	}


	/**
	 *  加工金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_proc_amt() {
		return getConstString(offset + 59, $s_dec_proc_amt);
	}

	/**
	 *  加工金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_proc_amt(String value) {
		setConstString(offset + 59, $s_dec_proc_amt, value);
	}


	/**
	 *  有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 60, $trd_cur_onr_prov_upri);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 60, $trd_cur_onr_prov_upri, value);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 60, $trd_cur_onr_prov_upri, value);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 60, $trd_cur_onr_prov_upri, value);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 60, $trd_cur_onr_prov_upri, value);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 60, $trd_cur_onr_prov_upri, value);
	}


	/**
	 *  有償支給単価文字列（整数部）.<p>
	 *
	 */
	public String s_int_onr_prov_upri() {
		return getConstString(offset + 61, $s_int_onr_prov_upri);
	}

	/**
	 *  有償支給単価文字列（整数部）.<p>
	 *
	 */
	public void s_int_onr_prov_upri(String value) {
		setConstString(offset + 61, $s_int_onr_prov_upri, value);
	}


	/**
	 *  有償支給単価文字列（小数部）.<p>
	 *
	 */
	public String s_dec_onr_prov_upri() {
		return getConstString(offset + 62, $s_dec_onr_prov_upri);
	}

	/**
	 *  有償支給単価文字列（小数部）.<p>
	 *
	 */
	public void s_dec_onr_prov_upri(String value) {
		setConstString(offset + 62, $s_dec_onr_prov_upri, value);
	}


	/**
	 *  有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 63, $trd_cur_onr_prov_amt);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 63, $trd_cur_onr_prov_amt, value);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 63, $trd_cur_onr_prov_amt, value);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 63, $trd_cur_onr_prov_amt, value);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 63, $trd_cur_onr_prov_amt, value);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 63, $trd_cur_onr_prov_amt, value);
	}


	/**
	 *  有償支給金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_onr_prov_amt() {
		return getConstString(offset + 64, $s_int_onr_prov_amt);
	}

	/**
	 *  有償支給金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_onr_prov_amt(String value) {
		setConstString(offset + 64, $s_int_onr_prov_amt, value);
	}


	/**
	 *  有償支給金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_onr_prov_amt() {
		return getConstString(offset + 65, $s_dec_onr_prov_amt);
	}

	/**
	 *  有償支給金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_onr_prov_amt(String value) {
		setConstString(offset + 65, $s_dec_onr_prov_amt, value);
	}


	/**
	 *  買戻義務ＦＬＧ.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 66, $repurc_obli_flg);
	}

	/**
	 *  買戻義務ＦＬＧ.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 66, $repurc_obli_flg, value);
	}


	public String getString(String name) {
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
		if ($s_int_unit_qty.equalsIgnoreCase(name)) {
			return s_int_unit_qty();
		}
		if ($s_dec_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_unit_qty();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			return sppl_alt_nm1();
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			return sppl_alt_nm2();
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			return sppl_alt_nm3();
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			return sppl_alt_nm4();
		}
		if ($s_int_upri.equalsIgnoreCase(name)) {
			return s_int_upri();
		}
		if ($s_dec_upri.equalsIgnoreCase(name)) {
			return s_dec_upri();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($s_int_amt.equalsIgnoreCase(name)) {
			return s_int_amt();
		}
		if ($s_dec_amt.equalsIgnoreCase(name)) {
			return s_dec_amt();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($s_int_tax_amt.equalsIgnoreCase(name)) {
			return s_int_tax_amt();
		}
		if ($s_dec_tax_amt.equalsIgnoreCase(name)) {
			return s_dec_tax_amt();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($s_int_tax_rate.equalsIgnoreCase(name)) {
			return s_int_tax_rate();
		}
		if ($s_dec_tax_rate.equalsIgnoreCase(name)) {
			return s_dec_tax_rate();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_d_print_rmrks();
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
		}
		if ($pay_mtd_typ_nm.equalsIgnoreCase(name)) {
			return pay_mtd_typ_nm();
		}
		if ($part_pay_mark.equalsIgnoreCase(name)) {
			return part_pay_mark();
		}
		if ($s_inc_tax_flg.equalsIgnoreCase(name)) {
			return s_inc_tax_flg();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($s_int_proc_upri.equalsIgnoreCase(name)) {
			return s_int_proc_upri();
		}
		if ($s_dec_proc_upri.equalsIgnoreCase(name)) {
			return s_dec_proc_upri();
		}
		if ($s_int_proc_amt.equalsIgnoreCase(name)) {
			return s_int_proc_amt();
		}
		if ($s_dec_proc_amt.equalsIgnoreCase(name)) {
			return s_dec_proc_amt();
		}
		if ($s_int_onr_prov_upri.equalsIgnoreCase(name)) {
			return s_int_onr_prov_upri();
		}
		if ($s_dec_onr_prov_upri.equalsIgnoreCase(name)) {
			return s_dec_onr_prov_upri();
		}
		if ($s_int_onr_prov_amt.equalsIgnoreCase(name)) {
			return s_int_onr_prov_amt();
		}
		if ($s_dec_onr_prov_amt.equalsIgnoreCase(name)) {
			return s_dec_onr_prov_amt();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return trd_cur_proc_upri();
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt();
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_upri();
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($crryovr_flg.equalsIgnoreCase(name)) {
			return crryovr_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($s_int_unit_qty.equalsIgnoreCase(name)) {
			return s_int_unit_qty();
		}
		if ($s_dec_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_unit_qty();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			return sppl_alt_nm1();
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			return sppl_alt_nm2();
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			return sppl_alt_nm3();
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			return sppl_alt_nm4();
		}
		if ($s_int_upri.equalsIgnoreCase(name)) {
			return s_int_upri();
		}
		if ($s_dec_upri.equalsIgnoreCase(name)) {
			return s_dec_upri();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($s_int_amt.equalsIgnoreCase(name)) {
			return s_int_amt();
		}
		if ($s_dec_amt.equalsIgnoreCase(name)) {
			return s_dec_amt();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($s_int_tax_amt.equalsIgnoreCase(name)) {
			return s_int_tax_amt();
		}
		if ($s_dec_tax_amt.equalsIgnoreCase(name)) {
			return s_dec_tax_amt();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($s_int_tax_rate.equalsIgnoreCase(name)) {
			return s_int_tax_rate();
		}
		if ($s_dec_tax_rate.equalsIgnoreCase(name)) {
			return s_dec_tax_rate();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			return pay_schd_d_print_rmrks();
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
		}
		if ($pay_mtd_typ_nm.equalsIgnoreCase(name)) {
			return pay_mtd_typ_nm();
		}
		if ($part_pay_mark.equalsIgnoreCase(name)) {
			return part_pay_mark();
		}
		if ($s_inc_tax_flg.equalsIgnoreCase(name)) {
			return s_inc_tax_flg();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($s_int_proc_upri.equalsIgnoreCase(name)) {
			return s_int_proc_upri();
		}
		if ($s_dec_proc_upri.equalsIgnoreCase(name)) {
			return s_dec_proc_upri();
		}
		if ($s_int_proc_amt.equalsIgnoreCase(name)) {
			return s_int_proc_amt();
		}
		if ($s_dec_proc_amt.equalsIgnoreCase(name)) {
			return s_dec_proc_amt();
		}
		if ($s_int_onr_prov_upri.equalsIgnoreCase(name)) {
			return s_int_onr_prov_upri();
		}
		if ($s_dec_onr_prov_upri.equalsIgnoreCase(name)) {
			return s_dec_onr_prov_upri();
		}
		if ($s_int_onr_prov_amt.equalsIgnoreCase(name)) {
			return s_int_onr_prov_amt();
		}
		if ($s_dec_onr_prov_amt.equalsIgnoreCase(name)) {
			return s_dec_onr_prov_amt();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return trd_cur_proc_upri();
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt();
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_upri();
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($crryovr_flg.equalsIgnoreCase(name)) {
			return crryovr_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($s_int_unit_qty.equalsIgnoreCase(name)) {
			s_int_unit_qty(value);
			return;
		}
		if ($s_dec_unit_qty.equalsIgnoreCase(name)) {
			s_dec_unit_qty(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			sppl_alt_nm1(value);
			return;
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			sppl_alt_nm2(value);
			return;
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			sppl_alt_nm3(value);
			return;
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			sppl_alt_nm4(value);
			return;
		}
		if ($s_int_upri.equalsIgnoreCase(name)) {
			s_int_upri(value);
			return;
		}
		if ($s_dec_upri.equalsIgnoreCase(name)) {
			s_dec_upri(value);
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
		if ($s_int_amt.equalsIgnoreCase(name)) {
			s_int_amt(value);
			return;
		}
		if ($s_dec_amt.equalsIgnoreCase(name)) {
			s_dec_amt(value);
			return;
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($s_int_tax_amt.equalsIgnoreCase(name)) {
			s_int_tax_amt(value);
			return;
		}
		if ($s_dec_tax_amt.equalsIgnoreCase(name)) {
			s_dec_tax_amt(value);
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
		if ($s_int_tax_rate.equalsIgnoreCase(name)) {
			s_int_tax_rate(value);
			return;
		}
		if ($s_dec_tax_rate.equalsIgnoreCase(name)) {
			s_dec_tax_rate(value);
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
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_d_print_rmrks(value);
			return;
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
			return;
		}
		if ($pay_mtd_typ_nm.equalsIgnoreCase(name)) {
			pay_mtd_typ_nm(value);
			return;
		}
		if ($part_pay_mark.equalsIgnoreCase(name)) {
			part_pay_mark(value);
			return;
		}
		if ($s_inc_tax_flg.equalsIgnoreCase(name)) {
			s_inc_tax_flg(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($s_int_proc_upri.equalsIgnoreCase(name)) {
			s_int_proc_upri(value);
			return;
		}
		if ($s_dec_proc_upri.equalsIgnoreCase(name)) {
			s_dec_proc_upri(value);
			return;
		}
		if ($s_int_proc_amt.equalsIgnoreCase(name)) {
			s_int_proc_amt(value);
			return;
		}
		if ($s_dec_proc_amt.equalsIgnoreCase(name)) {
			s_dec_proc_amt(value);
			return;
		}
		if ($s_int_onr_prov_upri.equalsIgnoreCase(name)) {
			s_int_onr_prov_upri(value);
			return;
		}
		if ($s_dec_onr_prov_upri.equalsIgnoreCase(name)) {
			s_dec_onr_prov_upri(value);
			return;
		}
		if ($s_int_onr_prov_amt.equalsIgnoreCase(name)) {
			s_int_onr_prov_amt(value);
			return;
		}
		if ($s_dec_onr_prov_amt.equalsIgnoreCase(name)) {
			s_dec_onr_prov_amt(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
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
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
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
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
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
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
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
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
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
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($crryovr_flg.equalsIgnoreCase(name)) {
			crryovr_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($s_int_unit_qty.equalsIgnoreCase(name)) {
			s_int_unit_qty(value);
			return;
		}
		if ($s_dec_unit_qty.equalsIgnoreCase(name)) {
			s_dec_unit_qty(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			sppl_alt_nm1(value);
			return;
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			sppl_alt_nm2(value);
			return;
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			sppl_alt_nm3(value);
			return;
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			sppl_alt_nm4(value);
			return;
		}
		if ($s_int_upri.equalsIgnoreCase(name)) {
			s_int_upri(value);
			return;
		}
		if ($s_dec_upri.equalsIgnoreCase(name)) {
			s_dec_upri(value);
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
		if ($s_int_amt.equalsIgnoreCase(name)) {
			s_int_amt(value);
			return;
		}
		if ($s_dec_amt.equalsIgnoreCase(name)) {
			s_dec_amt(value);
			return;
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($s_int_tax_amt.equalsIgnoreCase(name)) {
			s_int_tax_amt(value);
			return;
		}
		if ($s_dec_tax_amt.equalsIgnoreCase(name)) {
			s_dec_tax_amt(value);
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
		if ($s_int_tax_rate.equalsIgnoreCase(name)) {
			s_int_tax_rate(value);
			return;
		}
		if ($s_dec_tax_rate.equalsIgnoreCase(name)) {
			s_dec_tax_rate(value);
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
		if ($pay_schd_d_print_rmrks.equalsIgnoreCase(name)) {
			pay_schd_d_print_rmrks(value);
			return;
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
			return;
		}
		if ($pay_mtd_typ_nm.equalsIgnoreCase(name)) {
			pay_mtd_typ_nm(value);
			return;
		}
		if ($part_pay_mark.equalsIgnoreCase(name)) {
			part_pay_mark(value);
			return;
		}
		if ($s_inc_tax_flg.equalsIgnoreCase(name)) {
			s_inc_tax_flg(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($s_int_proc_upri.equalsIgnoreCase(name)) {
			s_int_proc_upri(value);
			return;
		}
		if ($s_dec_proc_upri.equalsIgnoreCase(name)) {
			s_dec_proc_upri(value);
			return;
		}
		if ($s_int_proc_amt.equalsIgnoreCase(name)) {
			s_int_proc_amt(value);
			return;
		}
		if ($s_dec_proc_amt.equalsIgnoreCase(name)) {
			s_dec_proc_amt(value);
			return;
		}
		if ($s_int_onr_prov_upri.equalsIgnoreCase(name)) {
			s_int_onr_prov_upri(value);
			return;
		}
		if ($s_dec_onr_prov_upri.equalsIgnoreCase(name)) {
			s_dec_onr_prov_upri(value);
			return;
		}
		if ($s_int_onr_prov_amt.equalsIgnoreCase(name)) {
			s_int_onr_prov_amt(value);
			return;
		}
		if ($s_dec_onr_prov_amt.equalsIgnoreCase(name)) {
			s_dec_onr_prov_amt(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
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
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
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
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
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
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
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
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
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
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($crryovr_flg.equalsIgnoreCase(name)) {
			crryovr_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

