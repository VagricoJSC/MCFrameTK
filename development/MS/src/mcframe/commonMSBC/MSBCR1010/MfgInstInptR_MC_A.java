package mcframe.commonMSBC.MSBCR1010;

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
 * ブロック"MfgInstInpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstInptR_MC_A extends MCConstRow {

	/**
	 *  投入品目.<p>
	 *
	 */
	public static final String $s_inpt_itm_cd = "s_inpt_itm_cd";
	/**
	 *  枝番１(表示).<p>
	 *
	 */
	public static final String $s_inpt_itm_sub1_view = "s_inpt_itm_sub1_view";
	/**
	 *  枝番２(表示).<p>
	 *
	 */
	public static final String $s_inpt_itm_sub2_view = "s_inpt_itm_sub2_view";
	/**
	 *  枝番３(表示).<p>
	 *
	 */
	public static final String $s_inpt_itm_sub3_view = "s_inpt_itm_sub3_view";
	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public static final String $s_inpt_itm_sub1_data = "s_inpt_itm_sub1_data";
	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public static final String $s_inpt_itm_sub2_data = "s_inpt_itm_sub2_data";
	/**
	 *  枝番３.<p>
	 *
	 */
	public static final String $s_inpt_itm_sub3_data = "s_inpt_itm_sub3_data";
	/**
	 *  投入品名.<p>
	 *
	 */
	public static final String $s_inpt_itm_nm = "s_inpt_itm_nm";
	/**
	 *  投入品目別名１.<p>
	 *
	 */
	public static final String $s_inpt_itm_alt_nm1 = "s_inpt_itm_alt_nm1";
	/**
	 *  投入品目別名２.<p>
	 *
	 */
	public static final String $s_inpt_itm_alt_nm2 = "s_inpt_itm_alt_nm2";
	/**
	 *  投入品目別名３.<p>
	 *
	 */
	public static final String $s_inpt_itm_alt_nm3 = "s_inpt_itm_alt_nm3";
	/**
	 *  投入品目別名４.<p>
	 *
	 */
	public static final String $s_inpt_itm_alt_nm4 = "s_inpt_itm_alt_nm4";
	/**
	 *  代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 *  代替グループ名.<p>
	 *
	 */
	public static final String $alt_grp_nm = "alt_grp_nm";
	/**
	 *  手配ＮＯ１(表示).<p>
	 *
	 */
	public static final String $inpt_sno1_view = "inpt_sno1_view";
	/**
	 *  手配ＮＯ２(表示).<p>
	 *
	 */
	public static final String $inpt_sno2_view = "inpt_sno2_view";
	/**
	 *  手配ＮＯ３(表示).<p>
	 *
	 */
	public static final String $inpt_sno3_view = "inpt_sno3_view";
	/**
	 *  手配ＮＯ４(表示).<p>
	 *
	 */
	public static final String $inpt_sno4_view = "inpt_sno4_view";
	/**
	 *  手配ＮＯ１(データ).<p>
	 *
	 */
	public static final String $inpt_sno1_data = "inpt_sno1_data";
	/**
	 *  手配ＮＯ２(データ).<p>
	 *
	 */
	public static final String $inpt_sno2_data = "inpt_sno2_data";
	/**
	 *  手配ＮＯ３(データ).<p>
	 *
	 */
	public static final String $inpt_sno3_data = "inpt_sno3_data";
	/**
	 *  手配ＮＯ４(データ).<p>
	 *
	 */
	public static final String $inpt_sno4_data = "inpt_sno4_data";
	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public static final String $inpt_lot_no_view = "inpt_lot_no_view";
	/**
	 *  サブロットＮＯ(表示用).<p>
	 *
	 */
	public static final String $inpt_sublot_no_view = "inpt_sublot_no_view";
	/**
	 *  ロットＮＯ(データ用).<p>
	 *
	 */
	public static final String $inpt_lot_no_data = "inpt_lot_no_data";
	/**
	 *  サブロットＮＯ(データ用).<p>
	 *
	 */
	public static final String $inpt_sublot_no_data = "inpt_sublot_no_data";
	/**
	 *  投入数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_qty = "base_unit_inpt_qty";
	/**
	 *  必要数量.<p>
	 *
	 */
	public static final String $base_unit_rqmt_qty = "base_unit_rqmt_qty";
	/**
	 *  固定必要数量.<p>
	 *
	 */
	public static final String $base_unit_fxd_rqmt_qty = "base_unit_fxd_rqmt_qty";
	/**
	 *  投入数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_unit_inpt_qty = "s_int_base_unit_inpt_qty";
	/**
	 *  投入数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_unit_inpt_qty = "s_dec_base_unit_inpt_qty";
	/**
	 *  必要数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_unit_rqmt_qty = "s_int_base_unit_rqmt_qty";
	/**
	 *  必要数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_unit_rqmt_qty = "s_dec_base_unit_rqmt_qty";
	/**
	 *  固定必要数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_unit_fxd_rqmt_qty = "s_int_base_unit_fxd_rqmt_qty";
	/**
	 *  固定必要数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_unit_fxd_rqmt_qty = "s_dec_base_unit_fxd_rqmt_qty";
	/**
	 *  有効成分（投入数量）（左括弧）.<p>
	 *
	 */
	public static final String $left_qty_inpt = "left_qty_inpt";
	/**
	 *  有効成分（投入数量）.<p>
	 *
	 */
	public static final String $cont_inpt_qty = "cont_inpt_qty";
	/**
	 *  有効成分（投入数量）文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_cont_qty_inpt = "s_int_cont_qty_inpt";
	/**
	 *  有効成分（投入数量）文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_cont_qty_inpt = "s_dec_cont_qty_inpt";
	/**
	 *  有効成分（投入数量）（右括弧）.<p>
	 *
	 */
	public static final String $right_qty_inpt = "right_qty_inpt";
	/**
	 *  有効成分（必要数量）（左括弧）.<p>
	 *
	 */
	public static final String $left_qty_rqmt = "left_qty_rqmt";
	/**
	 *  有効成分（必要数量）.<p>
	 *
	 */
	public static final String $cont_rqmt_qty = "cont_rqmt_qty";
	/**
	 *  有効成分（必要数量）文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_cont_qty_rqmt = "s_int_cont_qty_rqmt";
	/**
	 *  有効成分（必要数量）文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_cont_qty_rqmt = "s_dec_cont_qty_rqmt";
	/**
	 *  有効成分（必要数量）（右括弧）.<p>
	 *
	 */
	public static final String $right_qty_rqmt = "right_qty_rqmt";
	/**
	 *  有効成分（固定必要数量）（左括弧）.<p>
	 *
	 */
	public static final String $left_qty_fxd_rqmt = "left_qty_fxd_rqmt";
	/**
	 *  有効成分（固定必要数量）.<p>
	 *
	 */
	public static final String $cont_fxd_rqmt_qty = "cont_fxd_rqmt_qty";
	/**
	 *  有効成分（固定必要数量）文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_cont_qty_fxd_rqmt = "s_int_cont_qty_fxd_rqmt";
	/**
	 *  有効成分（固定必要数量）文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_cont_qty_fxd_rqmt = "s_dec_cont_qty_fxd_rqmt";
	/**
	 *  有効成分（固定必要数量）（右括弧）.<p>
	 *
	 */
	public static final String $right_qty_fxd_rqmt = "right_qty_fxd_rqmt";
	/**
	 *  単位（投入予定）.<p>
	 *
	 */
	public static final String $d_base_unit_cd = "d_base_unit_cd";
	/**
	 *  単位名（投入予定）.<p>
	 *
	 */
	public static final String $d_base_unit_nm = "d_base_unit_nm";
	/**
	 *  単位（有効成分）.<p>
	 *
	 */
	public static final String $cont_fctr_unit_cd = "cont_fctr_unit_cd";
	/**
	 *  単位名（左括弧）.<p>
	 *
	 */
	public static final String $left_nm = "left_nm";
	/**
	 *  単位名（有効成分）.<p>
	 *
	 */
	public static final String $cont_fctr_unit_nm = "cont_fctr_unit_nm";
	/**
	 *  単位名（右括弧）.<p>
	 *
	 */
	public static final String $right_nm = "right_nm";
	/**
	 *  投入予定備考.<p>
	 *
	 */
	public static final String $inpt_inst_rmrks = "inpt_inst_rmrks";
	/**
	 *  投入予定日.<p>
	 *
	 */
	public static final String $inpt_inst_dt = "inpt_inst_dt";
	/**
	 *  投入予定時刻.<p>
	 *
	 */
	public static final String $inpt_inst_hm = "inpt_inst_hm";
	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public static final String $inpt_ver_no_lbl = "inpt_ver_no_lbl";
	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public static final String $inpt_ver_no = "inpt_ver_no";
	/**
	 *  引当ＦＬＧ.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	/**
	 *  引当.<p>
	 *
	 */
	public static final String $s_alloc = "s_alloc";
	/**
	 *  表示順.<p>
	 *
	 */
	public static final String $inpt_schd_disp_seq = "inpt_schd_disp_seq";
	/**
	 *  投入予定予備１.<p>
	 *
	 */
	public static final String $inpt_schd_sub_char1 = "inpt_schd_sub_char1";
	/**
	 *  投入予定予備２.<p>
	 *
	 */
	public static final String $inpt_schd_sub_char2 = "inpt_schd_sub_char2";
	/**
	 *  投入予定予備３.<p>
	 *
	 */
	public static final String $inpt_schd_sub_char3 = "inpt_schd_sub_char3";


	public static final MCMeta s_inpt_itm_cd_META = createStringMeta($s_inpt_itm_cd);
	public static final MCMeta s_inpt_itm_sub1_view_META = createCommonMeta($s_inpt_itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta s_inpt_itm_sub2_view_META = createCommonMeta($s_inpt_itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta s_inpt_itm_sub3_view_META = createCommonMeta($s_inpt_itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta s_inpt_itm_sub1_data_META = createCommonMeta($s_inpt_itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta s_inpt_itm_sub2_data_META = createCommonMeta($s_inpt_itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta s_inpt_itm_sub3_data_META = createCommonMeta($s_inpt_itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta s_inpt_itm_nm_META = createCommonMeta($s_inpt_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta s_inpt_itm_alt_nm1_META = createCommonMeta($s_inpt_itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta s_inpt_itm_alt_nm2_META = createCommonMeta($s_inpt_itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta s_inpt_itm_alt_nm3_META = createCommonMeta($s_inpt_itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta s_inpt_itm_alt_nm4_META = createCommonMeta($s_inpt_itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_nm_META = createCommonMeta($alt_grp_nm, mcframe.commonMA.meta.MA_META.ALT_GRP_NM);
	public static final MCMeta inpt_sno1_view_META = createCommonMeta($inpt_sno1_view, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta inpt_sno2_view_META = createCommonMeta($inpt_sno2_view, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta inpt_sno3_view_META = createCommonMeta($inpt_sno3_view, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta inpt_sno4_view_META = createCommonMeta($inpt_sno4_view, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta inpt_sno1_data_META = createCommonMeta($inpt_sno1_data, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta inpt_sno2_data_META = createCommonMeta($inpt_sno2_data, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta inpt_sno3_data_META = createCommonMeta($inpt_sno3_data, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta inpt_sno4_data_META = createCommonMeta($inpt_sno4_data, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta inpt_lot_no_view_META = createCommonMeta($inpt_lot_no_view, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta inpt_sublot_no_view_META = createCommonMeta($inpt_sublot_no_view, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta inpt_lot_no_data_META = createCommonMeta($inpt_lot_no_data, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta inpt_sublot_no_data_META = createCommonMeta($inpt_sublot_no_data, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta base_unit_inpt_qty_META = createCommonMeta($base_unit_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_rqmt_qty_META = createCommonMeta($base_unit_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_rqmt_qty_META = createCommonMeta($base_unit_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_base_unit_inpt_qty_META = createStringMeta($s_int_base_unit_inpt_qty);
	public static final MCMeta s_dec_base_unit_inpt_qty_META = createStringMeta($s_dec_base_unit_inpt_qty);
	public static final MCMeta s_int_base_unit_rqmt_qty_META = createStringMeta($s_int_base_unit_rqmt_qty);
	public static final MCMeta s_dec_base_unit_rqmt_qty_META = createStringMeta($s_dec_base_unit_rqmt_qty);
	public static final MCMeta s_int_base_unit_fxd_rqmt_qty_META = createStringMeta($s_int_base_unit_fxd_rqmt_qty);
	public static final MCMeta s_dec_base_unit_fxd_rqmt_qty_META = createStringMeta($s_dec_base_unit_fxd_rqmt_qty);
	public static final MCMeta left_qty_inpt_META = createStringMeta($left_qty_inpt);
	public static final MCMeta cont_inpt_qty_META = createCommonMeta($cont_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_cont_qty_inpt_META = createStringMeta($s_int_cont_qty_inpt);
	public static final MCMeta s_dec_cont_qty_inpt_META = createStringMeta($s_dec_cont_qty_inpt);
	public static final MCMeta right_qty_inpt_META = createStringMeta($right_qty_inpt);
	public static final MCMeta left_qty_rqmt_META = createStringMeta($left_qty_rqmt);
	public static final MCMeta cont_rqmt_qty_META = createCommonMeta($cont_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_cont_qty_rqmt_META = createStringMeta($s_int_cont_qty_rqmt);
	public static final MCMeta s_dec_cont_qty_rqmt_META = createStringMeta($s_dec_cont_qty_rqmt);
	public static final MCMeta right_qty_rqmt_META = createStringMeta($right_qty_rqmt);
	public static final MCMeta left_qty_fxd_rqmt_META = createStringMeta($left_qty_fxd_rqmt);
	public static final MCMeta cont_fxd_rqmt_qty_META = createCommonMeta($cont_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_cont_qty_fxd_rqmt_META = createStringMeta($s_int_cont_qty_fxd_rqmt);
	public static final MCMeta s_dec_cont_qty_fxd_rqmt_META = createStringMeta($s_dec_cont_qty_fxd_rqmt);
	public static final MCMeta right_qty_fxd_rqmt_META = createStringMeta($right_qty_fxd_rqmt);
	public static final MCMeta d_base_unit_cd_META = createCommonMeta($d_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta d_base_unit_nm_META = createCommonMeta($d_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta left_nm_META = createStringMeta($left_nm);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta right_nm_META = createStringMeta($right_nm);
	public static final MCMeta inpt_inst_rmrks_META = createCommonMeta($inpt_inst_rmrks, mcframe.commonMS.meta.MS_META.INPT_SCHD_RPT_RMRKS);
	public static final MCMeta inpt_inst_dt_META = createCommonMeta($inpt_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inpt_inst_hm_META = createCommonMeta($inpt_inst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta inpt_ver_no_lbl_META = createStringMeta($inpt_ver_no_lbl);
	public static final MCMeta inpt_ver_no_META = createCommonMeta($inpt_ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta s_alloc_META = createStringMeta($s_alloc);
	public static final MCMeta inpt_schd_disp_seq_META = createCommonMeta($inpt_schd_disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inpt_schd_sub_char1_META = createCommonMeta($inpt_schd_sub_char1, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR1);
	public static final MCMeta inpt_schd_sub_char2_META = createCommonMeta($inpt_schd_sub_char2, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR2);
	public static final MCMeta inpt_schd_sub_char3_META = createCommonMeta($inpt_schd_sub_char3, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR3);

	protected static final ConstMetaList<MfgInstInptR> constMetas = new ConstMetaList<MfgInstInptR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			s_inpt_itm_cd_META,
			s_inpt_itm_sub1_view_META,
			s_inpt_itm_sub2_view_META,
			s_inpt_itm_sub3_view_META,
			s_inpt_itm_sub1_data_META,
			s_inpt_itm_sub2_data_META,
			s_inpt_itm_sub3_data_META,
			s_inpt_itm_nm_META,
			s_inpt_itm_alt_nm1_META,
			s_inpt_itm_alt_nm2_META,
			s_inpt_itm_alt_nm3_META,
			s_inpt_itm_alt_nm4_META,
			alt_grp_cd_META,
			alt_grp_nm_META,
			inpt_sno1_view_META,
			inpt_sno2_view_META,
			inpt_sno3_view_META,
			inpt_sno4_view_META,
			inpt_sno1_data_META,
			inpt_sno2_data_META,
			inpt_sno3_data_META,
			inpt_sno4_data_META,
			inpt_lot_no_view_META,
			inpt_sublot_no_view_META,
			inpt_lot_no_data_META,
			inpt_sublot_no_data_META,
			base_unit_inpt_qty_META,
			base_unit_rqmt_qty_META,
			base_unit_fxd_rqmt_qty_META,
			s_int_base_unit_inpt_qty_META,
			s_dec_base_unit_inpt_qty_META,
			s_int_base_unit_rqmt_qty_META,
			s_dec_base_unit_rqmt_qty_META,
			s_int_base_unit_fxd_rqmt_qty_META,
			s_dec_base_unit_fxd_rqmt_qty_META,
			left_qty_inpt_META,
			cont_inpt_qty_META,
			s_int_cont_qty_inpt_META,
			s_dec_cont_qty_inpt_META,
			right_qty_inpt_META,
			left_qty_rqmt_META,
			cont_rqmt_qty_META,
			s_int_cont_qty_rqmt_META,
			s_dec_cont_qty_rqmt_META,
			right_qty_rqmt_META,
			left_qty_fxd_rqmt_META,
			cont_fxd_rqmt_qty_META,
			s_int_cont_qty_fxd_rqmt_META,
			s_dec_cont_qty_fxd_rqmt_META,
			right_qty_fxd_rqmt_META,
			d_base_unit_cd_META,
			d_base_unit_nm_META,
			cont_fctr_unit_cd_META,
			left_nm_META,
			cont_fctr_unit_nm_META,
			right_nm_META,
			inpt_inst_rmrks_META,
			inpt_inst_dt_META,
			inpt_inst_hm_META,
			inpt_ver_no_lbl_META,
			inpt_ver_no_META,
			alloc_flg_META,
			s_alloc_META,
			inpt_schd_disp_seq_META,
			inpt_schd_sub_char1_META,
			inpt_schd_sub_char2_META,
			inpt_schd_sub_char3_META
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
	protected MfgInstInptR_MC_A(ConstMetaList<? extends MfgInstInptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstInptR clone() {
		return (MfgInstInptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstInptR createInstance() {
		return (MfgInstInptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstInptR getValues(String... names) {
		return (MfgInstInptR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  投入品目.<p>
	 *
	 */
	public String s_inpt_itm_cd() {
		return getConstString(offset + 0, $s_inpt_itm_cd);
	}

	/**
	 *  投入品目.<p>
	 *
	 */
	public void s_inpt_itm_cd(String value) {
		setConstString(offset + 0, $s_inpt_itm_cd, value);
	}


	/**
	 *  枝番１(表示).<p>
	 *
	 */
	public String s_inpt_itm_sub1_view() {
		return getConstString(offset + 1, $s_inpt_itm_sub1_view);
	}

	/**
	 *  枝番１(表示).<p>
	 *
	 */
	public void s_inpt_itm_sub1_view(String value) {
		setConstString(offset + 1, $s_inpt_itm_sub1_view, value);
	}


	/**
	 *  枝番２(表示).<p>
	 *
	 */
	public String s_inpt_itm_sub2_view() {
		return getConstString(offset + 2, $s_inpt_itm_sub2_view);
	}

	/**
	 *  枝番２(表示).<p>
	 *
	 */
	public void s_inpt_itm_sub2_view(String value) {
		setConstString(offset + 2, $s_inpt_itm_sub2_view, value);
	}


	/**
	 *  枝番３(表示).<p>
	 *
	 */
	public String s_inpt_itm_sub3_view() {
		return getConstString(offset + 3, $s_inpt_itm_sub3_view);
	}

	/**
	 *  枝番３(表示).<p>
	 *
	 */
	public void s_inpt_itm_sub3_view(String value) {
		setConstString(offset + 3, $s_inpt_itm_sub3_view, value);
	}


	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public String s_inpt_itm_sub1_data() {
		return getConstString(offset + 4, $s_inpt_itm_sub1_data);
	}

	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public void s_inpt_itm_sub1_data(String value) {
		setConstString(offset + 4, $s_inpt_itm_sub1_data, value);
	}


	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public String s_inpt_itm_sub2_data() {
		return getConstString(offset + 5, $s_inpt_itm_sub2_data);
	}

	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public void s_inpt_itm_sub2_data(String value) {
		setConstString(offset + 5, $s_inpt_itm_sub2_data, value);
	}


	/**
	 *  枝番３.<p>
	 *
	 */
	public String s_inpt_itm_sub3_data() {
		return getConstString(offset + 6, $s_inpt_itm_sub3_data);
	}

	/**
	 *  枝番３.<p>
	 *
	 */
	public void s_inpt_itm_sub3_data(String value) {
		setConstString(offset + 6, $s_inpt_itm_sub3_data, value);
	}


	/**
	 *  投入品名.<p>
	 *
	 */
	public String s_inpt_itm_nm() {
		return getConstString(offset + 7, $s_inpt_itm_nm);
	}

	/**
	 *  投入品名.<p>
	 *
	 */
	public void s_inpt_itm_nm(String value) {
		setConstString(offset + 7, $s_inpt_itm_nm, value);
	}


	/**
	 *  投入品目別名１.<p>
	 *
	 */
	public String s_inpt_itm_alt_nm1() {
		return getConstString(offset + 8, $s_inpt_itm_alt_nm1);
	}

	/**
	 *  投入品目別名１.<p>
	 *
	 */
	public void s_inpt_itm_alt_nm1(String value) {
		setConstString(offset + 8, $s_inpt_itm_alt_nm1, value);
	}


	/**
	 *  投入品目別名２.<p>
	 *
	 */
	public String s_inpt_itm_alt_nm2() {
		return getConstString(offset + 9, $s_inpt_itm_alt_nm2);
	}

	/**
	 *  投入品目別名２.<p>
	 *
	 */
	public void s_inpt_itm_alt_nm2(String value) {
		setConstString(offset + 9, $s_inpt_itm_alt_nm2, value);
	}


	/**
	 *  投入品目別名３.<p>
	 *
	 */
	public String s_inpt_itm_alt_nm3() {
		return getConstString(offset + 10, $s_inpt_itm_alt_nm3);
	}

	/**
	 *  投入品目別名３.<p>
	 *
	 */
	public void s_inpt_itm_alt_nm3(String value) {
		setConstString(offset + 10, $s_inpt_itm_alt_nm3, value);
	}


	/**
	 *  投入品目別名４.<p>
	 *
	 */
	public String s_inpt_itm_alt_nm4() {
		return getConstString(offset + 11, $s_inpt_itm_alt_nm4);
	}

	/**
	 *  投入品目別名４.<p>
	 *
	 */
	public void s_inpt_itm_alt_nm4(String value) {
		setConstString(offset + 11, $s_inpt_itm_alt_nm4, value);
	}


	/**
	 *  代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 12, $alt_grp_cd);
	}

	/**
	 *  代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 12, $alt_grp_cd, value);
	}


	/**
	 *  代替グループ名.<p>
	 *
	 */
	public String alt_grp_nm() {
		return getConstString(offset + 13, $alt_grp_nm);
	}

	/**
	 *  代替グループ名.<p>
	 *
	 */
	public void alt_grp_nm(String value) {
		setConstString(offset + 13, $alt_grp_nm, value);
	}


	/**
	 *  手配ＮＯ１(表示).<p>
	 *
	 */
	public String inpt_sno1_view() {
		return getConstString(offset + 14, $inpt_sno1_view);
	}

	/**
	 *  手配ＮＯ１(表示).<p>
	 *
	 */
	public void inpt_sno1_view(String value) {
		setConstString(offset + 14, $inpt_sno1_view, value);
	}


	/**
	 *  手配ＮＯ２(表示).<p>
	 *
	 */
	public String inpt_sno2_view() {
		return getConstString(offset + 15, $inpt_sno2_view);
	}

	/**
	 *  手配ＮＯ２(表示).<p>
	 *
	 */
	public void inpt_sno2_view(String value) {
		setConstString(offset + 15, $inpt_sno2_view, value);
	}


	/**
	 *  手配ＮＯ３(表示).<p>
	 *
	 */
	public String inpt_sno3_view() {
		return getConstString(offset + 16, $inpt_sno3_view);
	}

	/**
	 *  手配ＮＯ３(表示).<p>
	 *
	 */
	public void inpt_sno3_view(String value) {
		setConstString(offset + 16, $inpt_sno3_view, value);
	}


	/**
	 *  手配ＮＯ４(表示).<p>
	 *
	 */
	public String inpt_sno4_view() {
		return getConstString(offset + 17, $inpt_sno4_view);
	}

	/**
	 *  手配ＮＯ４(表示).<p>
	 *
	 */
	public void inpt_sno4_view(String value) {
		setConstString(offset + 17, $inpt_sno4_view, value);
	}


	/**
	 *  手配ＮＯ１(データ).<p>
	 *
	 */
	public String inpt_sno1_data() {
		return getConstString(offset + 18, $inpt_sno1_data);
	}

	/**
	 *  手配ＮＯ１(データ).<p>
	 *
	 */
	public void inpt_sno1_data(String value) {
		setConstString(offset + 18, $inpt_sno1_data, value);
	}


	/**
	 *  手配ＮＯ２(データ).<p>
	 *
	 */
	public String inpt_sno2_data() {
		return getConstString(offset + 19, $inpt_sno2_data);
	}

	/**
	 *  手配ＮＯ２(データ).<p>
	 *
	 */
	public void inpt_sno2_data(String value) {
		setConstString(offset + 19, $inpt_sno2_data, value);
	}


	/**
	 *  手配ＮＯ３(データ).<p>
	 *
	 */
	public String inpt_sno3_data() {
		return getConstString(offset + 20, $inpt_sno3_data);
	}

	/**
	 *  手配ＮＯ３(データ).<p>
	 *
	 */
	public void inpt_sno3_data(String value) {
		setConstString(offset + 20, $inpt_sno3_data, value);
	}


	/**
	 *  手配ＮＯ４(データ).<p>
	 *
	 */
	public String inpt_sno4_data() {
		return getConstString(offset + 21, $inpt_sno4_data);
	}

	/**
	 *  手配ＮＯ４(データ).<p>
	 *
	 */
	public void inpt_sno4_data(String value) {
		setConstString(offset + 21, $inpt_sno4_data, value);
	}


	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public String inpt_lot_no_view() {
		return getConstString(offset + 22, $inpt_lot_no_view);
	}

	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public void inpt_lot_no_view(String value) {
		setConstString(offset + 22, $inpt_lot_no_view, value);
	}


	/**
	 *  サブロットＮＯ(表示用).<p>
	 *
	 */
	public String inpt_sublot_no_view() {
		return getConstString(offset + 23, $inpt_sublot_no_view);
	}

	/**
	 *  サブロットＮＯ(表示用).<p>
	 *
	 */
	public void inpt_sublot_no_view(String value) {
		setConstString(offset + 23, $inpt_sublot_no_view, value);
	}


	/**
	 *  ロットＮＯ(データ用).<p>
	 *
	 */
	public String inpt_lot_no_data() {
		return getConstString(offset + 24, $inpt_lot_no_data);
	}

	/**
	 *  ロットＮＯ(データ用).<p>
	 *
	 */
	public void inpt_lot_no_data(String value) {
		setConstString(offset + 24, $inpt_lot_no_data, value);
	}


	/**
	 *  サブロットＮＯ(データ用).<p>
	 *
	 */
	public String inpt_sublot_no_data() {
		return getConstString(offset + 25, $inpt_sublot_no_data);
	}

	/**
	 *  サブロットＮＯ(データ用).<p>
	 *
	 */
	public void inpt_sublot_no_data(String value) {
		setConstString(offset + 25, $inpt_sublot_no_data, value);
	}


	/**
	 *  投入数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty() {
		return getConstNumber(offset + 26, $base_unit_inpt_qty);
	}

	/**
	 *  投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(MCNumber value) {
		setConstNumber(offset + 26, $base_unit_inpt_qty, value);
	}

	/**
	 *  投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(int value) {
		setConstNumber(offset + 26, $base_unit_inpt_qty, value);
	}

	/**
	 *  投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(long value) {
		setConstNumber(offset + 26, $base_unit_inpt_qty, value);
	}

	/**
	 *  投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(float value) {
		setConstNumber(offset + 26, $base_unit_inpt_qty, value);
	}

	/**
	 *  投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(double value) {
		setConstNumber(offset + 26, $base_unit_inpt_qty, value);
	}


	/**
	 *  必要数量.<p>
	 *
	 */
	public MCNumber base_unit_rqmt_qty() {
		return getConstNumber(offset + 27, $base_unit_rqmt_qty);
	}

	/**
	 *  必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 27, $base_unit_rqmt_qty, value);
	}

	/**
	 *  必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(int value) {
		setConstNumber(offset + 27, $base_unit_rqmt_qty, value);
	}

	/**
	 *  必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(long value) {
		setConstNumber(offset + 27, $base_unit_rqmt_qty, value);
	}

	/**
	 *  必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(float value) {
		setConstNumber(offset + 27, $base_unit_rqmt_qty, value);
	}

	/**
	 *  必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(double value) {
		setConstNumber(offset + 27, $base_unit_rqmt_qty, value);
	}


	/**
	 *  固定必要数量.<p>
	 *
	 */
	public MCNumber base_unit_fxd_rqmt_qty() {
		return getConstNumber(offset + 28, $base_unit_fxd_rqmt_qty);
	}

	/**
	 *  固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 28, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 *  固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 28, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 *  固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 28, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 *  固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 28, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 *  固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 28, $base_unit_fxd_rqmt_qty, value);
	}


	/**
	 *  投入数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_inpt_qty() {
		return getConstString(offset + 29, $s_int_base_unit_inpt_qty);
	}

	/**
	 *  投入数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_inpt_qty(String value) {
		setConstString(offset + 29, $s_int_base_unit_inpt_qty, value);
	}


	/**
	 *  投入数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_inpt_qty() {
		return getConstString(offset + 30, $s_dec_base_unit_inpt_qty);
	}

	/**
	 *  投入数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_inpt_qty(String value) {
		setConstString(offset + 30, $s_dec_base_unit_inpt_qty, value);
	}


	/**
	 *  必要数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_rqmt_qty() {
		return getConstString(offset + 31, $s_int_base_unit_rqmt_qty);
	}

	/**
	 *  必要数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_rqmt_qty(String value) {
		setConstString(offset + 31, $s_int_base_unit_rqmt_qty, value);
	}


	/**
	 *  必要数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_rqmt_qty() {
		return getConstString(offset + 32, $s_dec_base_unit_rqmt_qty);
	}

	/**
	 *  必要数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_rqmt_qty(String value) {
		setConstString(offset + 32, $s_dec_base_unit_rqmt_qty, value);
	}


	/**
	 *  固定必要数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_base_unit_fxd_rqmt_qty() {
		return getConstString(offset + 33, $s_int_base_unit_fxd_rqmt_qty);
	}

	/**
	 *  固定必要数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_base_unit_fxd_rqmt_qty(String value) {
		setConstString(offset + 33, $s_int_base_unit_fxd_rqmt_qty, value);
	}


	/**
	 *  固定必要数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_base_unit_fxd_rqmt_qty() {
		return getConstString(offset + 34, $s_dec_base_unit_fxd_rqmt_qty);
	}

	/**
	 *  固定必要数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_base_unit_fxd_rqmt_qty(String value) {
		setConstString(offset + 34, $s_dec_base_unit_fxd_rqmt_qty, value);
	}


	/**
	 *  有効成分（投入数量）（左括弧）.<p>
	 *
	 */
	public String left_qty_inpt() {
		return getConstString(offset + 35, $left_qty_inpt);
	}

	/**
	 *  有効成分（投入数量）（左括弧）.<p>
	 *
	 */
	public void left_qty_inpt(String value) {
		setConstString(offset + 35, $left_qty_inpt, value);
	}


	/**
	 *  有効成分（投入数量）.<p>
	 *
	 */
	public MCNumber cont_inpt_qty() {
		return getConstNumber(offset + 36, $cont_inpt_qty);
	}

	/**
	 *  有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(MCNumber value) {
		setConstNumber(offset + 36, $cont_inpt_qty, value);
	}

	/**
	 *  有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(int value) {
		setConstNumber(offset + 36, $cont_inpt_qty, value);
	}

	/**
	 *  有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(long value) {
		setConstNumber(offset + 36, $cont_inpt_qty, value);
	}

	/**
	 *  有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(float value) {
		setConstNumber(offset + 36, $cont_inpt_qty, value);
	}

	/**
	 *  有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(double value) {
		setConstNumber(offset + 36, $cont_inpt_qty, value);
	}


	/**
	 *  有効成分（投入数量）文字列（整数部）.<p>
	 *
	 */
	public String s_int_cont_qty_inpt() {
		return getConstString(offset + 37, $s_int_cont_qty_inpt);
	}

	/**
	 *  有効成分（投入数量）文字列（整数部）.<p>
	 *
	 */
	public void s_int_cont_qty_inpt(String value) {
		setConstString(offset + 37, $s_int_cont_qty_inpt, value);
	}


	/**
	 *  有効成分（投入数量）文字列（小数部）.<p>
	 *
	 */
	public String s_dec_cont_qty_inpt() {
		return getConstString(offset + 38, $s_dec_cont_qty_inpt);
	}

	/**
	 *  有効成分（投入数量）文字列（小数部）.<p>
	 *
	 */
	public void s_dec_cont_qty_inpt(String value) {
		setConstString(offset + 38, $s_dec_cont_qty_inpt, value);
	}


	/**
	 *  有効成分（投入数量）（右括弧）.<p>
	 *
	 */
	public String right_qty_inpt() {
		return getConstString(offset + 39, $right_qty_inpt);
	}

	/**
	 *  有効成分（投入数量）（右括弧）.<p>
	 *
	 */
	public void right_qty_inpt(String value) {
		setConstString(offset + 39, $right_qty_inpt, value);
	}


	/**
	 *  有効成分（必要数量）（左括弧）.<p>
	 *
	 */
	public String left_qty_rqmt() {
		return getConstString(offset + 40, $left_qty_rqmt);
	}

	/**
	 *  有効成分（必要数量）（左括弧）.<p>
	 *
	 */
	public void left_qty_rqmt(String value) {
		setConstString(offset + 40, $left_qty_rqmt, value);
	}


	/**
	 *  有効成分（必要数量）.<p>
	 *
	 */
	public MCNumber cont_rqmt_qty() {
		return getConstNumber(offset + 41, $cont_rqmt_qty);
	}

	/**
	 *  有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 41, $cont_rqmt_qty, value);
	}

	/**
	 *  有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(int value) {
		setConstNumber(offset + 41, $cont_rqmt_qty, value);
	}

	/**
	 *  有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(long value) {
		setConstNumber(offset + 41, $cont_rqmt_qty, value);
	}

	/**
	 *  有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(float value) {
		setConstNumber(offset + 41, $cont_rqmt_qty, value);
	}

	/**
	 *  有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(double value) {
		setConstNumber(offset + 41, $cont_rqmt_qty, value);
	}


	/**
	 *  有効成分（必要数量）文字列（整数部）.<p>
	 *
	 */
	public String s_int_cont_qty_rqmt() {
		return getConstString(offset + 42, $s_int_cont_qty_rqmt);
	}

	/**
	 *  有効成分（必要数量）文字列（整数部）.<p>
	 *
	 */
	public void s_int_cont_qty_rqmt(String value) {
		setConstString(offset + 42, $s_int_cont_qty_rqmt, value);
	}


	/**
	 *  有効成分（必要数量）文字列（小数部）.<p>
	 *
	 */
	public String s_dec_cont_qty_rqmt() {
		return getConstString(offset + 43, $s_dec_cont_qty_rqmt);
	}

	/**
	 *  有効成分（必要数量）文字列（小数部）.<p>
	 *
	 */
	public void s_dec_cont_qty_rqmt(String value) {
		setConstString(offset + 43, $s_dec_cont_qty_rqmt, value);
	}


	/**
	 *  有効成分（必要数量）（右括弧）.<p>
	 *
	 */
	public String right_qty_rqmt() {
		return getConstString(offset + 44, $right_qty_rqmt);
	}

	/**
	 *  有効成分（必要数量）（右括弧）.<p>
	 *
	 */
	public void right_qty_rqmt(String value) {
		setConstString(offset + 44, $right_qty_rqmt, value);
	}


	/**
	 *  有効成分（固定必要数量）（左括弧）.<p>
	 *
	 */
	public String left_qty_fxd_rqmt() {
		return getConstString(offset + 45, $left_qty_fxd_rqmt);
	}

	/**
	 *  有効成分（固定必要数量）（左括弧）.<p>
	 *
	 */
	public void left_qty_fxd_rqmt(String value) {
		setConstString(offset + 45, $left_qty_fxd_rqmt, value);
	}


	/**
	 *  有効成分（固定必要数量）.<p>
	 *
	 */
	public MCNumber cont_fxd_rqmt_qty() {
		return getConstNumber(offset + 46, $cont_fxd_rqmt_qty);
	}

	/**
	 *  有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 46, $cont_fxd_rqmt_qty, value);
	}

	/**
	 *  有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 46, $cont_fxd_rqmt_qty, value);
	}

	/**
	 *  有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 46, $cont_fxd_rqmt_qty, value);
	}

	/**
	 *  有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 46, $cont_fxd_rqmt_qty, value);
	}

	/**
	 *  有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 46, $cont_fxd_rqmt_qty, value);
	}


	/**
	 *  有効成分（固定必要数量）文字列（整数部）.<p>
	 *
	 */
	public String s_int_cont_qty_fxd_rqmt() {
		return getConstString(offset + 47, $s_int_cont_qty_fxd_rqmt);
	}

	/**
	 *  有効成分（固定必要数量）文字列（整数部）.<p>
	 *
	 */
	public void s_int_cont_qty_fxd_rqmt(String value) {
		setConstString(offset + 47, $s_int_cont_qty_fxd_rqmt, value);
	}


	/**
	 *  有効成分（固定必要数量）文字列（小数部）.<p>
	 *
	 */
	public String s_dec_cont_qty_fxd_rqmt() {
		return getConstString(offset + 48, $s_dec_cont_qty_fxd_rqmt);
	}

	/**
	 *  有効成分（固定必要数量）文字列（小数部）.<p>
	 *
	 */
	public void s_dec_cont_qty_fxd_rqmt(String value) {
		setConstString(offset + 48, $s_dec_cont_qty_fxd_rqmt, value);
	}


	/**
	 *  有効成分（固定必要数量）（右括弧）.<p>
	 *
	 */
	public String right_qty_fxd_rqmt() {
		return getConstString(offset + 49, $right_qty_fxd_rqmt);
	}

	/**
	 *  有効成分（固定必要数量）（右括弧）.<p>
	 *
	 */
	public void right_qty_fxd_rqmt(String value) {
		setConstString(offset + 49, $right_qty_fxd_rqmt, value);
	}


	/**
	 *  単位（投入予定）.<p>
	 *
	 */
	public String d_base_unit_cd() {
		return getConstString(offset + 50, $d_base_unit_cd);
	}

	/**
	 *  単位（投入予定）.<p>
	 *
	 */
	public void d_base_unit_cd(String value) {
		setConstString(offset + 50, $d_base_unit_cd, value);
	}


	/**
	 *  単位名（投入予定）.<p>
	 *
	 */
	public String d_base_unit_nm() {
		return getConstString(offset + 51, $d_base_unit_nm);
	}

	/**
	 *  単位名（投入予定）.<p>
	 *
	 */
	public void d_base_unit_nm(String value) {
		setConstString(offset + 51, $d_base_unit_nm, value);
	}


	/**
	 *  単位（有効成分）.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 52, $cont_fctr_unit_cd);
	}

	/**
	 *  単位（有効成分）.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 52, $cont_fctr_unit_cd, value);
	}


	/**
	 *  単位名（左括弧）.<p>
	 *
	 */
	public String left_nm() {
		return getConstString(offset + 53, $left_nm);
	}

	/**
	 *  単位名（左括弧）.<p>
	 *
	 */
	public void left_nm(String value) {
		setConstString(offset + 53, $left_nm, value);
	}


	/**
	 *  単位名（有効成分）.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 54, $cont_fctr_unit_nm);
	}

	/**
	 *  単位名（有効成分）.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 54, $cont_fctr_unit_nm, value);
	}


	/**
	 *  単位名（右括弧）.<p>
	 *
	 */
	public String right_nm() {
		return getConstString(offset + 55, $right_nm);
	}

	/**
	 *  単位名（右括弧）.<p>
	 *
	 */
	public void right_nm(String value) {
		setConstString(offset + 55, $right_nm, value);
	}


	/**
	 *  投入予定備考.<p>
	 *
	 */
	public String inpt_inst_rmrks() {
		return getConstString(offset + 56, $inpt_inst_rmrks);
	}

	/**
	 *  投入予定備考.<p>
	 *
	 */
	public void inpt_inst_rmrks(String value) {
		setConstString(offset + 56, $inpt_inst_rmrks, value);
	}


	/**
	 *  投入予定日.<p>
	 *
	 */
	public MCDate inpt_inst_dt() {
		return getConstDate(offset + 57, $inpt_inst_dt);
	}

	/**
	 *  投入予定日.<p>
	 *
	 */
	public void inpt_inst_dt(MCDate value) {
		setConstDate(offset + 57, $inpt_inst_dt, value);
	}


	/**
	 *  投入予定時刻.<p>
	 *
	 */
	public MCDate inpt_inst_hm() {
		return getConstDate(offset + 58, $inpt_inst_hm);
	}

	/**
	 *  投入予定時刻.<p>
	 *
	 */
	public void inpt_inst_hm(MCDate value) {
		setConstDate(offset + 58, $inpt_inst_hm, value);
	}


	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public String inpt_ver_no_lbl() {
		return getConstString(offset + 59, $inpt_ver_no_lbl);
	}

	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public void inpt_ver_no_lbl(String value) {
		setConstString(offset + 59, $inpt_ver_no_lbl, value);
	}


	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public String inpt_ver_no() {
		return getConstString(offset + 60, $inpt_ver_no);
	}

	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public void inpt_ver_no(String value) {
		setConstString(offset + 60, $inpt_ver_no, value);
	}


	/**
	 *  引当ＦＬＧ.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 61, $alloc_flg);
	}

	/**
	 *  引当ＦＬＧ.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 61, $alloc_flg, value);
	}


	/**
	 *  引当.<p>
	 *
	 */
	public String s_alloc() {
		return getConstString(offset + 62, $s_alloc);
	}

	/**
	 *  引当.<p>
	 *
	 */
	public void s_alloc(String value) {
		setConstString(offset + 62, $s_alloc, value);
	}


	/**
	 *  表示順.<p>
	 *
	 */
	public MCNumber inpt_schd_disp_seq() {
		return getConstNumber(offset + 63, $inpt_schd_disp_seq);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void inpt_schd_disp_seq(MCNumber value) {
		setConstNumber(offset + 63, $inpt_schd_disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void inpt_schd_disp_seq(int value) {
		setConstNumber(offset + 63, $inpt_schd_disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void inpt_schd_disp_seq(long value) {
		setConstNumber(offset + 63, $inpt_schd_disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void inpt_schd_disp_seq(float value) {
		setConstNumber(offset + 63, $inpt_schd_disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void inpt_schd_disp_seq(double value) {
		setConstNumber(offset + 63, $inpt_schd_disp_seq, value);
	}


	/**
	 *  投入予定予備１.<p>
	 *
	 */
	public String inpt_schd_sub_char1() {
		return getConstString(offset + 64, $inpt_schd_sub_char1);
	}

	/**
	 *  投入予定予備１.<p>
	 *
	 */
	public void inpt_schd_sub_char1(String value) {
		setConstString(offset + 64, $inpt_schd_sub_char1, value);
	}


	/**
	 *  投入予定予備２.<p>
	 *
	 */
	public String inpt_schd_sub_char2() {
		return getConstString(offset + 65, $inpt_schd_sub_char2);
	}

	/**
	 *  投入予定予備２.<p>
	 *
	 */
	public void inpt_schd_sub_char2(String value) {
		setConstString(offset + 65, $inpt_schd_sub_char2, value);
	}


	/**
	 *  投入予定予備３.<p>
	 *
	 */
	public String inpt_schd_sub_char3() {
		return getConstString(offset + 66, $inpt_schd_sub_char3);
	}

	/**
	 *  投入予定予備３.<p>
	 *
	 */
	public void inpt_schd_sub_char3(String value) {
		setConstString(offset + 66, $inpt_schd_sub_char3, value);
	}


	public String getString(String name) {
		if ($s_inpt_itm_cd.equalsIgnoreCase(name)) {
			return s_inpt_itm_cd();
		}
		if ($s_inpt_itm_sub1_view.equalsIgnoreCase(name)) {
			return s_inpt_itm_sub1_view();
		}
		if ($s_inpt_itm_sub2_view.equalsIgnoreCase(name)) {
			return s_inpt_itm_sub2_view();
		}
		if ($s_inpt_itm_sub3_view.equalsIgnoreCase(name)) {
			return s_inpt_itm_sub3_view();
		}
		if ($s_inpt_itm_sub1_data.equalsIgnoreCase(name)) {
			return s_inpt_itm_sub1_data();
		}
		if ($s_inpt_itm_sub2_data.equalsIgnoreCase(name)) {
			return s_inpt_itm_sub2_data();
		}
		if ($s_inpt_itm_sub3_data.equalsIgnoreCase(name)) {
			return s_inpt_itm_sub3_data();
		}
		if ($s_inpt_itm_nm.equalsIgnoreCase(name)) {
			return s_inpt_itm_nm();
		}
		if ($s_inpt_itm_alt_nm1.equalsIgnoreCase(name)) {
			return s_inpt_itm_alt_nm1();
		}
		if ($s_inpt_itm_alt_nm2.equalsIgnoreCase(name)) {
			return s_inpt_itm_alt_nm2();
		}
		if ($s_inpt_itm_alt_nm3.equalsIgnoreCase(name)) {
			return s_inpt_itm_alt_nm3();
		}
		if ($s_inpt_itm_alt_nm4.equalsIgnoreCase(name)) {
			return s_inpt_itm_alt_nm4();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($inpt_sno1_view.equalsIgnoreCase(name)) {
			return inpt_sno1_view();
		}
		if ($inpt_sno2_view.equalsIgnoreCase(name)) {
			return inpt_sno2_view();
		}
		if ($inpt_sno3_view.equalsIgnoreCase(name)) {
			return inpt_sno3_view();
		}
		if ($inpt_sno4_view.equalsIgnoreCase(name)) {
			return inpt_sno4_view();
		}
		if ($inpt_sno1_data.equalsIgnoreCase(name)) {
			return inpt_sno1_data();
		}
		if ($inpt_sno2_data.equalsIgnoreCase(name)) {
			return inpt_sno2_data();
		}
		if ($inpt_sno3_data.equalsIgnoreCase(name)) {
			return inpt_sno3_data();
		}
		if ($inpt_sno4_data.equalsIgnoreCase(name)) {
			return inpt_sno4_data();
		}
		if ($inpt_lot_no_view.equalsIgnoreCase(name)) {
			return inpt_lot_no_view();
		}
		if ($inpt_sublot_no_view.equalsIgnoreCase(name)) {
			return inpt_sublot_no_view();
		}
		if ($inpt_lot_no_data.equalsIgnoreCase(name)) {
			return inpt_lot_no_data();
		}
		if ($inpt_sublot_no_data.equalsIgnoreCase(name)) {
			return inpt_sublot_no_data();
		}
		if ($s_int_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_inpt_qty();
		}
		if ($s_dec_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_inpt_qty();
		}
		if ($s_int_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_rqmt_qty();
		}
		if ($s_dec_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_rqmt_qty();
		}
		if ($s_int_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_fxd_rqmt_qty();
		}
		if ($s_dec_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_fxd_rqmt_qty();
		}
		if ($left_qty_inpt.equalsIgnoreCase(name)) {
			return left_qty_inpt();
		}
		if ($s_int_cont_qty_inpt.equalsIgnoreCase(name)) {
			return s_int_cont_qty_inpt();
		}
		if ($s_dec_cont_qty_inpt.equalsIgnoreCase(name)) {
			return s_dec_cont_qty_inpt();
		}
		if ($right_qty_inpt.equalsIgnoreCase(name)) {
			return right_qty_inpt();
		}
		if ($left_qty_rqmt.equalsIgnoreCase(name)) {
			return left_qty_rqmt();
		}
		if ($s_int_cont_qty_rqmt.equalsIgnoreCase(name)) {
			return s_int_cont_qty_rqmt();
		}
		if ($s_dec_cont_qty_rqmt.equalsIgnoreCase(name)) {
			return s_dec_cont_qty_rqmt();
		}
		if ($right_qty_rqmt.equalsIgnoreCase(name)) {
			return right_qty_rqmt();
		}
		if ($left_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			return left_qty_fxd_rqmt();
		}
		if ($s_int_cont_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			return s_int_cont_qty_fxd_rqmt();
		}
		if ($s_dec_cont_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			return s_dec_cont_qty_fxd_rqmt();
		}
		if ($right_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			return right_qty_fxd_rqmt();
		}
		if ($d_base_unit_cd.equalsIgnoreCase(name)) {
			return d_base_unit_cd();
		}
		if ($d_base_unit_nm.equalsIgnoreCase(name)) {
			return d_base_unit_nm();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($left_nm.equalsIgnoreCase(name)) {
			return left_nm();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($right_nm.equalsIgnoreCase(name)) {
			return right_nm();
		}
		if ($inpt_inst_rmrks.equalsIgnoreCase(name)) {
			return inpt_inst_rmrks();
		}
		if ($inpt_ver_no_lbl.equalsIgnoreCase(name)) {
			return inpt_ver_no_lbl();
		}
		if ($inpt_ver_no.equalsIgnoreCase(name)) {
			return inpt_ver_no();
		}
		if ($s_alloc.equalsIgnoreCase(name)) {
			return s_alloc();
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char1();
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char2();
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_qty();
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_qty();
		}
		if ($inpt_schd_disp_seq.equalsIgnoreCase(name)) {
			return inpt_schd_disp_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($inpt_inst_dt.equalsIgnoreCase(name)) {
			return inpt_inst_dt();
		}
		if ($inpt_inst_hm.equalsIgnoreCase(name)) {
			return inpt_inst_hm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($s_inpt_itm_cd.equalsIgnoreCase(name)) {
			return s_inpt_itm_cd();
		}
		if ($s_inpt_itm_sub1_view.equalsIgnoreCase(name)) {
			return s_inpt_itm_sub1_view();
		}
		if ($s_inpt_itm_sub2_view.equalsIgnoreCase(name)) {
			return s_inpt_itm_sub2_view();
		}
		if ($s_inpt_itm_sub3_view.equalsIgnoreCase(name)) {
			return s_inpt_itm_sub3_view();
		}
		if ($s_inpt_itm_sub1_data.equalsIgnoreCase(name)) {
			return s_inpt_itm_sub1_data();
		}
		if ($s_inpt_itm_sub2_data.equalsIgnoreCase(name)) {
			return s_inpt_itm_sub2_data();
		}
		if ($s_inpt_itm_sub3_data.equalsIgnoreCase(name)) {
			return s_inpt_itm_sub3_data();
		}
		if ($s_inpt_itm_nm.equalsIgnoreCase(name)) {
			return s_inpt_itm_nm();
		}
		if ($s_inpt_itm_alt_nm1.equalsIgnoreCase(name)) {
			return s_inpt_itm_alt_nm1();
		}
		if ($s_inpt_itm_alt_nm2.equalsIgnoreCase(name)) {
			return s_inpt_itm_alt_nm2();
		}
		if ($s_inpt_itm_alt_nm3.equalsIgnoreCase(name)) {
			return s_inpt_itm_alt_nm3();
		}
		if ($s_inpt_itm_alt_nm4.equalsIgnoreCase(name)) {
			return s_inpt_itm_alt_nm4();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($inpt_sno1_view.equalsIgnoreCase(name)) {
			return inpt_sno1_view();
		}
		if ($inpt_sno2_view.equalsIgnoreCase(name)) {
			return inpt_sno2_view();
		}
		if ($inpt_sno3_view.equalsIgnoreCase(name)) {
			return inpt_sno3_view();
		}
		if ($inpt_sno4_view.equalsIgnoreCase(name)) {
			return inpt_sno4_view();
		}
		if ($inpt_sno1_data.equalsIgnoreCase(name)) {
			return inpt_sno1_data();
		}
		if ($inpt_sno2_data.equalsIgnoreCase(name)) {
			return inpt_sno2_data();
		}
		if ($inpt_sno3_data.equalsIgnoreCase(name)) {
			return inpt_sno3_data();
		}
		if ($inpt_sno4_data.equalsIgnoreCase(name)) {
			return inpt_sno4_data();
		}
		if ($inpt_lot_no_view.equalsIgnoreCase(name)) {
			return inpt_lot_no_view();
		}
		if ($inpt_sublot_no_view.equalsIgnoreCase(name)) {
			return inpt_sublot_no_view();
		}
		if ($inpt_lot_no_data.equalsIgnoreCase(name)) {
			return inpt_lot_no_data();
		}
		if ($inpt_sublot_no_data.equalsIgnoreCase(name)) {
			return inpt_sublot_no_data();
		}
		if ($s_int_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_inpt_qty();
		}
		if ($s_dec_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_inpt_qty();
		}
		if ($s_int_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_rqmt_qty();
		}
		if ($s_dec_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_rqmt_qty();
		}
		if ($s_int_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_fxd_rqmt_qty();
		}
		if ($s_dec_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_fxd_rqmt_qty();
		}
		if ($left_qty_inpt.equalsIgnoreCase(name)) {
			return left_qty_inpt();
		}
		if ($s_int_cont_qty_inpt.equalsIgnoreCase(name)) {
			return s_int_cont_qty_inpt();
		}
		if ($s_dec_cont_qty_inpt.equalsIgnoreCase(name)) {
			return s_dec_cont_qty_inpt();
		}
		if ($right_qty_inpt.equalsIgnoreCase(name)) {
			return right_qty_inpt();
		}
		if ($left_qty_rqmt.equalsIgnoreCase(name)) {
			return left_qty_rqmt();
		}
		if ($s_int_cont_qty_rqmt.equalsIgnoreCase(name)) {
			return s_int_cont_qty_rqmt();
		}
		if ($s_dec_cont_qty_rqmt.equalsIgnoreCase(name)) {
			return s_dec_cont_qty_rqmt();
		}
		if ($right_qty_rqmt.equalsIgnoreCase(name)) {
			return right_qty_rqmt();
		}
		if ($left_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			return left_qty_fxd_rqmt();
		}
		if ($s_int_cont_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			return s_int_cont_qty_fxd_rqmt();
		}
		if ($s_dec_cont_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			return s_dec_cont_qty_fxd_rqmt();
		}
		if ($right_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			return right_qty_fxd_rqmt();
		}
		if ($d_base_unit_cd.equalsIgnoreCase(name)) {
			return d_base_unit_cd();
		}
		if ($d_base_unit_nm.equalsIgnoreCase(name)) {
			return d_base_unit_nm();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($left_nm.equalsIgnoreCase(name)) {
			return left_nm();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($right_nm.equalsIgnoreCase(name)) {
			return right_nm();
		}
		if ($inpt_inst_rmrks.equalsIgnoreCase(name)) {
			return inpt_inst_rmrks();
		}
		if ($inpt_ver_no_lbl.equalsIgnoreCase(name)) {
			return inpt_ver_no_lbl();
		}
		if ($inpt_ver_no.equalsIgnoreCase(name)) {
			return inpt_ver_no();
		}
		if ($s_alloc.equalsIgnoreCase(name)) {
			return s_alloc();
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char1();
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char2();
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_qty();
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_qty();
		}
		if ($inpt_schd_disp_seq.equalsIgnoreCase(name)) {
			return inpt_schd_disp_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($inpt_inst_dt.equalsIgnoreCase(name)) {
			return inpt_inst_dt();
		}
		if ($inpt_inst_hm.equalsIgnoreCase(name)) {
			return inpt_inst_hm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($s_inpt_itm_cd.equalsIgnoreCase(name)) {
			s_inpt_itm_cd(value);
			return;
		}
		if ($s_inpt_itm_sub1_view.equalsIgnoreCase(name)) {
			s_inpt_itm_sub1_view(value);
			return;
		}
		if ($s_inpt_itm_sub2_view.equalsIgnoreCase(name)) {
			s_inpt_itm_sub2_view(value);
			return;
		}
		if ($s_inpt_itm_sub3_view.equalsIgnoreCase(name)) {
			s_inpt_itm_sub3_view(value);
			return;
		}
		if ($s_inpt_itm_sub1_data.equalsIgnoreCase(name)) {
			s_inpt_itm_sub1_data(value);
			return;
		}
		if ($s_inpt_itm_sub2_data.equalsIgnoreCase(name)) {
			s_inpt_itm_sub2_data(value);
			return;
		}
		if ($s_inpt_itm_sub3_data.equalsIgnoreCase(name)) {
			s_inpt_itm_sub3_data(value);
			return;
		}
		if ($s_inpt_itm_nm.equalsIgnoreCase(name)) {
			s_inpt_itm_nm(value);
			return;
		}
		if ($s_inpt_itm_alt_nm1.equalsIgnoreCase(name)) {
			s_inpt_itm_alt_nm1(value);
			return;
		}
		if ($s_inpt_itm_alt_nm2.equalsIgnoreCase(name)) {
			s_inpt_itm_alt_nm2(value);
			return;
		}
		if ($s_inpt_itm_alt_nm3.equalsIgnoreCase(name)) {
			s_inpt_itm_alt_nm3(value);
			return;
		}
		if ($s_inpt_itm_alt_nm4.equalsIgnoreCase(name)) {
			s_inpt_itm_alt_nm4(value);
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
		if ($inpt_sno1_view.equalsIgnoreCase(name)) {
			inpt_sno1_view(value);
			return;
		}
		if ($inpt_sno2_view.equalsIgnoreCase(name)) {
			inpt_sno2_view(value);
			return;
		}
		if ($inpt_sno3_view.equalsIgnoreCase(name)) {
			inpt_sno3_view(value);
			return;
		}
		if ($inpt_sno4_view.equalsIgnoreCase(name)) {
			inpt_sno4_view(value);
			return;
		}
		if ($inpt_sno1_data.equalsIgnoreCase(name)) {
			inpt_sno1_data(value);
			return;
		}
		if ($inpt_sno2_data.equalsIgnoreCase(name)) {
			inpt_sno2_data(value);
			return;
		}
		if ($inpt_sno3_data.equalsIgnoreCase(name)) {
			inpt_sno3_data(value);
			return;
		}
		if ($inpt_sno4_data.equalsIgnoreCase(name)) {
			inpt_sno4_data(value);
			return;
		}
		if ($inpt_lot_no_view.equalsIgnoreCase(name)) {
			inpt_lot_no_view(value);
			return;
		}
		if ($inpt_sublot_no_view.equalsIgnoreCase(name)) {
			inpt_sublot_no_view(value);
			return;
		}
		if ($inpt_lot_no_data.equalsIgnoreCase(name)) {
			inpt_lot_no_data(value);
			return;
		}
		if ($inpt_sublot_no_data.equalsIgnoreCase(name)) {
			inpt_sublot_no_data(value);
			return;
		}
		if ($s_int_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_inpt_qty(value);
			return;
		}
		if ($s_dec_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_inpt_qty(value);
			return;
		}
		if ($s_int_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_rqmt_qty(value);
			return;
		}
		if ($s_dec_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_rqmt_qty(value);
			return;
		}
		if ($s_int_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($s_dec_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($left_qty_inpt.equalsIgnoreCase(name)) {
			left_qty_inpt(value);
			return;
		}
		if ($s_int_cont_qty_inpt.equalsIgnoreCase(name)) {
			s_int_cont_qty_inpt(value);
			return;
		}
		if ($s_dec_cont_qty_inpt.equalsIgnoreCase(name)) {
			s_dec_cont_qty_inpt(value);
			return;
		}
		if ($right_qty_inpt.equalsIgnoreCase(name)) {
			right_qty_inpt(value);
			return;
		}
		if ($left_qty_rqmt.equalsIgnoreCase(name)) {
			left_qty_rqmt(value);
			return;
		}
		if ($s_int_cont_qty_rqmt.equalsIgnoreCase(name)) {
			s_int_cont_qty_rqmt(value);
			return;
		}
		if ($s_dec_cont_qty_rqmt.equalsIgnoreCase(name)) {
			s_dec_cont_qty_rqmt(value);
			return;
		}
		if ($right_qty_rqmt.equalsIgnoreCase(name)) {
			right_qty_rqmt(value);
			return;
		}
		if ($left_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			left_qty_fxd_rqmt(value);
			return;
		}
		if ($s_int_cont_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			s_int_cont_qty_fxd_rqmt(value);
			return;
		}
		if ($s_dec_cont_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			s_dec_cont_qty_fxd_rqmt(value);
			return;
		}
		if ($right_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			right_qty_fxd_rqmt(value);
			return;
		}
		if ($d_base_unit_cd.equalsIgnoreCase(name)) {
			d_base_unit_cd(value);
			return;
		}
		if ($d_base_unit_nm.equalsIgnoreCase(name)) {
			d_base_unit_nm(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($left_nm.equalsIgnoreCase(name)) {
			left_nm(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
			return;
		}
		if ($right_nm.equalsIgnoreCase(name)) {
			right_nm(value);
			return;
		}
		if ($inpt_inst_rmrks.equalsIgnoreCase(name)) {
			inpt_inst_rmrks(value);
			return;
		}
		if ($inpt_ver_no_lbl.equalsIgnoreCase(name)) {
			inpt_ver_no_lbl(value);
			return;
		}
		if ($inpt_ver_no.equalsIgnoreCase(name)) {
			inpt_ver_no(value);
			return;
		}
		if ($s_alloc.equalsIgnoreCase(name)) {
			s_alloc(value);
			return;
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			inpt_schd_sub_char1(value);
			return;
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			inpt_schd_sub_char2(value);
			return;
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			inpt_schd_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($inpt_schd_disp_seq.equalsIgnoreCase(name)) {
			inpt_schd_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($inpt_schd_disp_seq.equalsIgnoreCase(name)) {
			inpt_schd_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($inpt_schd_disp_seq.equalsIgnoreCase(name)) {
			inpt_schd_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($inpt_schd_disp_seq.equalsIgnoreCase(name)) {
			inpt_schd_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($inpt_schd_disp_seq.equalsIgnoreCase(name)) {
			inpt_schd_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($inpt_inst_dt.equalsIgnoreCase(name)) {
			inpt_inst_dt(value);
			return;
		}
		if ($inpt_inst_hm.equalsIgnoreCase(name)) {
			inpt_inst_hm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($s_inpt_itm_cd.equalsIgnoreCase(name)) {
			s_inpt_itm_cd(value);
			return;
		}
		if ($s_inpt_itm_sub1_view.equalsIgnoreCase(name)) {
			s_inpt_itm_sub1_view(value);
			return;
		}
		if ($s_inpt_itm_sub2_view.equalsIgnoreCase(name)) {
			s_inpt_itm_sub2_view(value);
			return;
		}
		if ($s_inpt_itm_sub3_view.equalsIgnoreCase(name)) {
			s_inpt_itm_sub3_view(value);
			return;
		}
		if ($s_inpt_itm_sub1_data.equalsIgnoreCase(name)) {
			s_inpt_itm_sub1_data(value);
			return;
		}
		if ($s_inpt_itm_sub2_data.equalsIgnoreCase(name)) {
			s_inpt_itm_sub2_data(value);
			return;
		}
		if ($s_inpt_itm_sub3_data.equalsIgnoreCase(name)) {
			s_inpt_itm_sub3_data(value);
			return;
		}
		if ($s_inpt_itm_nm.equalsIgnoreCase(name)) {
			s_inpt_itm_nm(value);
			return;
		}
		if ($s_inpt_itm_alt_nm1.equalsIgnoreCase(name)) {
			s_inpt_itm_alt_nm1(value);
			return;
		}
		if ($s_inpt_itm_alt_nm2.equalsIgnoreCase(name)) {
			s_inpt_itm_alt_nm2(value);
			return;
		}
		if ($s_inpt_itm_alt_nm3.equalsIgnoreCase(name)) {
			s_inpt_itm_alt_nm3(value);
			return;
		}
		if ($s_inpt_itm_alt_nm4.equalsIgnoreCase(name)) {
			s_inpt_itm_alt_nm4(value);
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
		if ($inpt_sno1_view.equalsIgnoreCase(name)) {
			inpt_sno1_view(value);
			return;
		}
		if ($inpt_sno2_view.equalsIgnoreCase(name)) {
			inpt_sno2_view(value);
			return;
		}
		if ($inpt_sno3_view.equalsIgnoreCase(name)) {
			inpt_sno3_view(value);
			return;
		}
		if ($inpt_sno4_view.equalsIgnoreCase(name)) {
			inpt_sno4_view(value);
			return;
		}
		if ($inpt_sno1_data.equalsIgnoreCase(name)) {
			inpt_sno1_data(value);
			return;
		}
		if ($inpt_sno2_data.equalsIgnoreCase(name)) {
			inpt_sno2_data(value);
			return;
		}
		if ($inpt_sno3_data.equalsIgnoreCase(name)) {
			inpt_sno3_data(value);
			return;
		}
		if ($inpt_sno4_data.equalsIgnoreCase(name)) {
			inpt_sno4_data(value);
			return;
		}
		if ($inpt_lot_no_view.equalsIgnoreCase(name)) {
			inpt_lot_no_view(value);
			return;
		}
		if ($inpt_sublot_no_view.equalsIgnoreCase(name)) {
			inpt_sublot_no_view(value);
			return;
		}
		if ($inpt_lot_no_data.equalsIgnoreCase(name)) {
			inpt_lot_no_data(value);
			return;
		}
		if ($inpt_sublot_no_data.equalsIgnoreCase(name)) {
			inpt_sublot_no_data(value);
			return;
		}
		if ($s_int_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_inpt_qty(value);
			return;
		}
		if ($s_dec_base_unit_inpt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_inpt_qty(value);
			return;
		}
		if ($s_int_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_rqmt_qty(value);
			return;
		}
		if ($s_dec_base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_rqmt_qty(value);
			return;
		}
		if ($s_int_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($s_dec_base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($left_qty_inpt.equalsIgnoreCase(name)) {
			left_qty_inpt(value);
			return;
		}
		if ($s_int_cont_qty_inpt.equalsIgnoreCase(name)) {
			s_int_cont_qty_inpt(value);
			return;
		}
		if ($s_dec_cont_qty_inpt.equalsIgnoreCase(name)) {
			s_dec_cont_qty_inpt(value);
			return;
		}
		if ($right_qty_inpt.equalsIgnoreCase(name)) {
			right_qty_inpt(value);
			return;
		}
		if ($left_qty_rqmt.equalsIgnoreCase(name)) {
			left_qty_rqmt(value);
			return;
		}
		if ($s_int_cont_qty_rqmt.equalsIgnoreCase(name)) {
			s_int_cont_qty_rqmt(value);
			return;
		}
		if ($s_dec_cont_qty_rqmt.equalsIgnoreCase(name)) {
			s_dec_cont_qty_rqmt(value);
			return;
		}
		if ($right_qty_rqmt.equalsIgnoreCase(name)) {
			right_qty_rqmt(value);
			return;
		}
		if ($left_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			left_qty_fxd_rqmt(value);
			return;
		}
		if ($s_int_cont_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			s_int_cont_qty_fxd_rqmt(value);
			return;
		}
		if ($s_dec_cont_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			s_dec_cont_qty_fxd_rqmt(value);
			return;
		}
		if ($right_qty_fxd_rqmt.equalsIgnoreCase(name)) {
			right_qty_fxd_rqmt(value);
			return;
		}
		if ($d_base_unit_cd.equalsIgnoreCase(name)) {
			d_base_unit_cd(value);
			return;
		}
		if ($d_base_unit_nm.equalsIgnoreCase(name)) {
			d_base_unit_nm(value);
			return;
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($left_nm.equalsIgnoreCase(name)) {
			left_nm(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
			return;
		}
		if ($right_nm.equalsIgnoreCase(name)) {
			right_nm(value);
			return;
		}
		if ($inpt_inst_rmrks.equalsIgnoreCase(name)) {
			inpt_inst_rmrks(value);
			return;
		}
		if ($inpt_ver_no_lbl.equalsIgnoreCase(name)) {
			inpt_ver_no_lbl(value);
			return;
		}
		if ($inpt_ver_no.equalsIgnoreCase(name)) {
			inpt_ver_no(value);
			return;
		}
		if ($s_alloc.equalsIgnoreCase(name)) {
			s_alloc(value);
			return;
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			inpt_schd_sub_char1(value);
			return;
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			inpt_schd_sub_char2(value);
			return;
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			inpt_schd_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($inpt_schd_disp_seq.equalsIgnoreCase(name)) {
			inpt_schd_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($inpt_schd_disp_seq.equalsIgnoreCase(name)) {
			inpt_schd_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($inpt_schd_disp_seq.equalsIgnoreCase(name)) {
			inpt_schd_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($inpt_schd_disp_seq.equalsIgnoreCase(name)) {
			inpt_schd_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($inpt_schd_disp_seq.equalsIgnoreCase(name)) {
			inpt_schd_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($inpt_inst_dt.equalsIgnoreCase(name)) {
			inpt_inst_dt(value);
			return;
		}
		if ($inpt_inst_hm.equalsIgnoreCase(name)) {
			inpt_inst_hm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

