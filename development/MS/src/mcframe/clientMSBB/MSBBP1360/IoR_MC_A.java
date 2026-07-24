package mcframe.clientMSBB.MSBBP1360;

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
 * ブロック"Io"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class IoR_MC_A extends MCConstRow {

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	public static final String $trd_unit_qty_p = "trd_unit_qty_p";
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
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	public static final String $purc_qty_p = "purc_qty_p";
	public static final String $sls_qty_p = "sls_qty_p";
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
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_no = "bp_dlv_slip_no";
	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_d_no = "bp_dlv_slip_d_no";
	public static final String $lot_no_p = "lot_no_p";
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
	public static final String $ver_no_p = "ver_no_p";
	public static final String $purc_base_unit_qty_p = "purc_base_unit_qty_p";
	public static final String $purc_cont_qty_p = "purc_cont_qty_p";
	public static final String $purc_cont_fctr_p = "purc_cont_fctr_p";
	public static final String $std_cont_qty_p = "std_cont_qty_p";
	public static final String $cont_fctr_unit_p = "cont_fctr_unit_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_io_no = "purc_act_io_no";
	/**
	 * Sales result GR/GI No. 売上実績受払ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_io_no = "sls_act_io_no";
	/**
	 * Details spare 1 詳細予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Details spare 2 詳細予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Details spare 3 詳細予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
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
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public static final String $sls_act_io_seq = "sls_act_io_seq";
	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public static final String $purc_act_io_seq = "purc_act_io_seq";
	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public static final String $dtl_row_id = "dtl_row_id";

	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $purc_qty = $purc_qty_p + ".qty";
	public static final String $sls_qty = $sls_qty_p + ".qty";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $purc_base_unit_qty = $purc_base_unit_qty_p + ".qty";
	public static final String $purc_cont_qty = $purc_cont_qty_p + ".purc_cont_qty";
	public static final String $purc_cont_fctr = $purc_cont_fctr_p + ".purc_cont_fctr";
	public static final String $std_cont_qty = $std_cont_qty_p + ".cont_qty";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_p + ".cont_fctr_unit_nm";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";

	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_qty_p_META = createInnerRowMeta($trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_qty_p_META = createInnerRowMeta($purc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta sls_qty_p_META = createInnerRowMeta($sls_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta bp_dlv_slip_no_META = createCommonMeta($bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_NO);
	public static final MCMeta bp_dlv_slip_d_no_META = createCommonMeta($bp_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_D_NO);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta ship_fr_valid_dt_META = createCommonMeta($ship_fr_valid_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta purc_base_unit_qty_p_META = createInnerRowMeta($purc_base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_cont_qty_p_META = createInnerRowMeta($purc_cont_qty_p, mcframe.clientMAUB.MAUBP5300.PurcContQtyR.class);
	public static final MCMeta purc_cont_fctr_p_META = createInnerRowMeta($purc_cont_fctr_p, mcframe.clientMAUB.MAUBP5330.PurcContFctrR.class);
	public static final MCMeta std_cont_qty_p_META = createInnerRowMeta($std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_fctr_unit_p_META = createInnerRowMeta($cont_fctr_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta purc_act_io_no_META = createCommonMeta($purc_act_io_no, mcframe.commonMA.meta.MA_META.PURC_ACT_IO_NO);
	public static final MCMeta sls_act_io_no_META = createCommonMeta($sls_act_io_no, mcframe.commonMA.meta.MA_META.SLS_ACT_IO_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLS_ACT_IO_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLS_ACT_IO_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLS_ACT_IO_SUB_CHAR3);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_act_io_seq_META = createCommonMeta($sls_act_io_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta purc_act_io_seq_META = createCommonMeta($purc_act_io_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dtl_row_id_META = createCommonMeta($dtl_row_id, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<IoR> constMetas = new ConstMetaList<IoR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_qty_p_META,
			purc_qty_p_META,
			sls_qty_p_META,
			gd_cd_META,
			gd_nm_META,
			bp_dlv_slip_no_META,
			bp_dlv_slip_d_no_META,
			lot_no_p_META,
			bp_lot_no_META,
			ship_fr_valid_dt_META,
			ver_no_p_META,
			purc_base_unit_qty_p_META,
			purc_cont_qty_p_META,
			purc_cont_fctr_p_META,
			std_cont_qty_p_META,
			cont_fctr_unit_p_META,
			std_cont_fctr_p_META,
			sno_wrk_no_p_META,
			purc_act_io_no_META,
			sls_act_io_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			trd_unit_dec_place_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_rnd_typ_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			lot_no_typ_META,
			sublot_no_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			stk_mng_typ_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			cont_fctr_flg_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			ver_flg_META,
			sls_act_io_seq_META,
			purc_act_io_seq_META,
			dtl_row_id_META
		},
		new String[][]{
			{
				"trd_unit_qty",
				"base_unit_qty",
				"purc_qty",
				"sls_qty",
				"crt_lot_flg",
				"lot_no",
				"sublot_no",
				"ver_no",
				"purc_base_unit_qty",
				"purc_cont_qty",
				"purc_cont_fctr",
				"std_cont_qty",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"std_cont_fctr",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm"
			},
			{
				$trd_unit_qty,
				$base_unit_qty,
				$purc_qty,
				$sls_qty,
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$ver_no,
				$purc_base_unit_qty,
				$purc_cont_qty,
				$purc_cont_fctr,
				$std_cont_qty,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$std_cont_fctr,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
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
				{$trd_unit_cd, "unit_nm;dec_place;conv_base_qty;conv_qty;rnd_typ"}	// trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$purc_base_unit_qty_p + ".qty", "BASE_UNIT"},	// purc_base_unit_qty_p.qty
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"}	// base_unit_rnd_typ
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
	protected IoR_MC_A(ConstMetaList<? extends IoR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IoR clone() {
		return (IoR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IoR createInstance() {
		return (IoR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IoR getValues(String... names) {
		return (IoR) super.getValues(names);
	}



	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 0, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 0, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 1, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 1, $trd_unit_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 2, $trd_unit_qty_p);
	}
	
	public void trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 2, $trd_unit_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 3, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 3, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 4, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 4, $base_unit_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 5, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 5, $base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 6, $purc_qty_p);
	}
	
	public void purc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 6, $purc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR sls_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 7, $sls_qty_p);
	}
	
	public void sls_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 7, $sls_qty_p, row);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 8, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 8, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 9, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 9, $gd_nm, value);
	}


	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return getConstString(offset + 10, $bp_dlv_slip_no);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		setConstString(offset + 10, $bp_dlv_slip_no, value);
	}


	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return getConstString(offset + 11, $bp_dlv_slip_d_no);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		setConstString(offset + 11, $bp_dlv_slip_d_no, value);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 12, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 12, $lot_no_p, row);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 13, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 13, $bp_lot_no, value);
	}


	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCDate ship_fr_valid_dt() {
		return getConstDate(offset + 14, $ship_fr_valid_dt);
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public void ship_fr_valid_dt(MCDate value) {
		setConstDate(offset + 14, $ship_fr_valid_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 15, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 15, $ver_no_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 16, $purc_base_unit_qty_p);
	}
	
	public void purc_base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 16, $purc_base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5300.PurcContQtyR purc_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5300.PurcContQtyR) getConstInnerRow(offset + 17, $purc_cont_qty_p);
	}
	
	public void purc_cont_qty_p(mcframe.clientMAUB.MAUBP5300.PurcContQtyR row){
		setConstInnerRow(offset + 17, $purc_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5330.PurcContFctrR purc_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5330.PurcContFctrR) getConstInnerRow(offset + 18, $purc_cont_fctr_p);
	}
	
	public void purc_cont_fctr_p(mcframe.clientMAUB.MAUBP5330.PurcContFctrR row){
		setConstInnerRow(offset + 18, $purc_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 19, $std_cont_qty_p);
	}
	
	public void std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 19, $std_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_fctr_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 20, $cont_fctr_unit_p);
	}
	
	public void cont_fctr_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 20, $cont_fctr_unit_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 21, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 21, $std_cont_fctr_p, row);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 22, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 22, $sno_wrk_no_p, row);
	}


	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public String purc_act_io_no() {
		return getConstString(offset + 23, $purc_act_io_no);
	}

	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public void purc_act_io_no(String value) {
		setConstString(offset + 23, $purc_act_io_no, value);
	}


	/**
	 * Sales result GR/GI No. 売上実績受払ＮＯ.<p>
	 *
	 */
	public String sls_act_io_no() {
		return getConstString(offset + 24, $sls_act_io_no);
	}

	/**
	 * Sales result GR/GI No. 売上実績受払ＮＯ.<p>
	 *
	 */
	public void sls_act_io_no(String value) {
		setConstString(offset + 24, $sls_act_io_no, value);
	}


	/**
	 * Details spare 1 詳細予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 25, $sub_char1);
	}

	/**
	 * Details spare 1 詳細予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 25, $sub_char1, value);
	}


	/**
	 * Details spare 2 詳細予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 26, $sub_char2);
	}

	/**
	 * Details spare 2 詳細予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 26, $sub_char2, value);
	}


	/**
	 * Details spare 3 詳細予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 27, $sub_char3);
	}

	/**
	 * Details spare 3 詳細予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 27, $sub_char3, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 28, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 28, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 29, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 29, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 29, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 29, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 29, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 29, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 30, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 30, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 30, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 30, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 30, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 30, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 31, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 31, $trd_unit_rnd_typ, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 32, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 32, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 33, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 33, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 34, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 34, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 35, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 35, $itm_sub3, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 36, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 36, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 37, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 37, $sublot_mng_typ, value);
	}


	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 38, $lot_no_typ);
	}

	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 38, $lot_no_typ, value);
	}


	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 39, $sublot_no_typ);
	}

	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 39, $sublot_no_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 40, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 40, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 41, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 41, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 42, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 42, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 43, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 43, $sno4_mng_typ, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 44, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 44, $stk_mng_typ, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 45, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 46, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 46, $base_unit_rnd_typ, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 47, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 47, $cont_fctr_flg, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 48, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 48, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 49, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 49, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 49, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 49, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 49, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 49, $cont_fctr_dec_place, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 50, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 50, $ver_flg, value);
	}


	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public MCNumber sls_act_io_seq() {
		return getConstNumber(offset + 51, $sls_act_io_seq);
	}

	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public void sls_act_io_seq(MCNumber value) {
		setConstNumber(offset + 51, $sls_act_io_seq, value);
	}

	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public void sls_act_io_seq(int value) {
		setConstNumber(offset + 51, $sls_act_io_seq, value);
	}

	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public void sls_act_io_seq(long value) {
		setConstNumber(offset + 51, $sls_act_io_seq, value);
	}

	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public void sls_act_io_seq(float value) {
		setConstNumber(offset + 51, $sls_act_io_seq, value);
	}

	/**
	 * Sales result GR/GI sequence number 売上実績受払連番.<p>
	 *
	 */
	public void sls_act_io_seq(double value) {
		setConstNumber(offset + 51, $sls_act_io_seq, value);
	}


	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public MCNumber purc_act_io_seq() {
		return getConstNumber(offset + 52, $purc_act_io_seq);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(MCNumber value) {
		setConstNumber(offset + 52, $purc_act_io_seq, value);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(int value) {
		setConstNumber(offset + 52, $purc_act_io_seq, value);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(long value) {
		setConstNumber(offset + 52, $purc_act_io_seq, value);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(float value) {
		setConstNumber(offset + 52, $purc_act_io_seq, value);
	}

	/**
	 * Purchase result GR/GI sequence number 仕入実績受払連番.<p>
	 *
	 */
	public void purc_act_io_seq(double value) {
		setConstNumber(offset + 52, $purc_act_io_seq, value);
	}


	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public MCNumber dtl_row_id() {
		return getConstNumber(offset + 53, $dtl_row_id);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(MCNumber value) {
		setConstNumber(offset + 53, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(int value) {
		setConstNumber(offset + 53, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(long value) {
		setConstNumber(offset + 53, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(float value) {
		setConstNumber(offset + 53, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(double value) {
		setConstNumber(offset + 53, $dtl_row_id, value);
	}


	public String getString(String name) {
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			return purc_act_io_no();
		}
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			return sls_act_io_no();
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
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			return sls_act_io_seq();
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			return purc_act_io_seq();
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			return dtl_row_id();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			return purc_act_io_no();
		}
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			return sls_act_io_no();
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
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			return sls_act_io_seq();
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			return purc_act_io_seq();
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			return dtl_row_id();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			purc_act_io_no(value);
			return;
		}
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			sls_act_io_no(value);
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
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
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
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
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
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
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
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
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
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
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
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($purc_act_io_no.equalsIgnoreCase(name)) {
			purc_act_io_no(value);
			return;
		}
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			sls_act_io_no(value);
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
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
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
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
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
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
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
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
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
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
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
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		if ($purc_act_io_seq.equalsIgnoreCase(name)) {
			purc_act_io_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($purc_qty_p.equalsIgnoreCase(name)) {
			return purc_qty_p();
		}
		if ($sls_qty_p.equalsIgnoreCase(name)) {
			return sls_qty_p();
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			return lot_no_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($purc_base_unit_qty_p.equalsIgnoreCase(name)) {
			return purc_base_unit_qty_p();
		}
		if ($purc_cont_qty_p.equalsIgnoreCase(name)) {
			return purc_cont_qty_p();
		}
		if ($purc_cont_fctr_p.equalsIgnoreCase(name)) {
			return purc_cont_fctr_p();
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			return std_cont_qty_p();
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			return cont_fctr_unit_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			trd_unit_qty_p(
				((MCContainerMeta) trd_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_qty_p.equalsIgnoreCase(name)) {
			purc_qty_p(
				((MCContainerMeta) purc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($sls_qty_p.equalsIgnoreCase(name)) {
			sls_qty_p(
				((MCContainerMeta) sls_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			lot_no_p(
				((MCContainerMeta) lot_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5030.LotNoR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($purc_base_unit_qty_p.equalsIgnoreCase(name)) {
			purc_base_unit_qty_p(
				((MCContainerMeta) purc_base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_cont_qty_p.equalsIgnoreCase(name)) {
			purc_cont_qty_p(
				((MCContainerMeta) purc_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5300.PurcContQtyR.class, value)
			);
			return;
		}
		if ($purc_cont_fctr_p.equalsIgnoreCase(name)) {
			purc_cont_fctr_p(
				((MCContainerMeta) purc_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5330.PurcContFctrR.class, value)
			);
			return;
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			std_cont_qty_p(
				((MCContainerMeta) std_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			cont_fctr_unit_p(
				((MCContainerMeta) cont_fctr_unit_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class, value)
			);
			return;
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return trd_unit_qty_p().qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public MCNumber purc_qty() {
		return purc_qty_p().qty();
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(MCNumber value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(int value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(long value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(float value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(double value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public MCNumber sls_qty() {
		return sls_qty_p().qty();
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(MCNumber value) {
		sls_qty_p().qty(value);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(int value) {
		sls_qty_p().qty(value);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(long value) {
		sls_qty_p().qty(value);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(float value) {
		sls_qty_p().qty(value);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(double value) {
		sls_qty_p().qty(value);
	}

	public boolean crt_lot_flg() {
		return lot_no_p().crt_lot_flg();
	}

	public void crt_lot_flg(boolean value) {
		lot_no_p().crt_lot_flg(value);
	}

	public String lot_no() {
		return lot_no_p().lot_no();
	}

	public void lot_no(String value) {
		lot_no_p().lot_no(value);
	}

	public String sublot_no() {
		return lot_no_p().sublot_no();
	}

	public void sublot_no(String value) {
		lot_no_p().sublot_no(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	/**
	 * Purchase base unit qty. 仕入基準単位数量.<p>
	 *
	 */
	public MCNumber purc_base_unit_qty() {
		return purc_base_unit_qty_p().qty();
	}

	/**
	 * Purchase base unit qty. 仕入基準単位数量.<p>
	 *
	 */
	public void purc_base_unit_qty(MCNumber value) {
		purc_base_unit_qty_p().qty(value);
	}

	/**
	 * Purchase base unit qty. 仕入基準単位数量.<p>
	 *
	 */
	public void purc_base_unit_qty(int value) {
		purc_base_unit_qty_p().qty(value);
	}

	/**
	 * Purchase base unit qty. 仕入基準単位数量.<p>
	 *
	 */
	public void purc_base_unit_qty(long value) {
		purc_base_unit_qty_p().qty(value);
	}

	/**
	 * Purchase base unit qty. 仕入基準単位数量.<p>
	 *
	 */
	public void purc_base_unit_qty(float value) {
		purc_base_unit_qty_p().qty(value);
	}

	/**
	 * Purchase base unit qty. 仕入基準単位数量.<p>
	 *
	 */
	public void purc_base_unit_qty(double value) {
		purc_base_unit_qty_p().qty(value);
	}

	public MCNumber purc_cont_qty() {
		return purc_cont_qty_p().purc_cont_qty();
	}

	public void purc_cont_qty(MCNumber value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public void purc_cont_qty(int value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public void purc_cont_qty(long value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public void purc_cont_qty(float value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public void purc_cont_qty(double value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public MCNumber purc_cont_fctr() {
		return purc_cont_fctr_p().purc_cont_fctr();
	}

	public void purc_cont_fctr(MCNumber value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	public void purc_cont_fctr(int value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	public void purc_cont_fctr(long value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	public void purc_cont_fctr(float value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	public void purc_cont_fctr(double value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_qty() {
		return std_cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return cont_fctr_unit_p().cont_fctr_unit_cd();
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		cont_fctr_unit_p().cont_fctr_unit_cd(value);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return cont_fctr_unit_p().cont_fctr_unit_nm();
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		cont_fctr_unit_p().cont_fctr_unit_nm(value);
	}

	public MCNumber std_cont_fctr() {
		return std_cont_fctr_p().std_cont_fctr();
	}

	public void std_cont_fctr(MCNumber value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(int value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(long value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(float value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(double value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public String sno1() {
		return sno_wrk_no_p().sno1();
	}

	public void sno1(String value) {
		sno_wrk_no_p().sno1(value);
	}

	public String sno2() {
		return sno_wrk_no_p().sno2();
	}

	public void sno2(String value) {
		sno_wrk_no_p().sno2(value);
	}

	public String sno3() {
		return sno_wrk_no_p().sno3();
	}

	public void sno3(String value) {
		sno_wrk_no_p().sno3(value);
	}

	public String sno4() {
		return sno_wrk_no_p().sno4();
	}

	public void sno4(String value) {
		sno_wrk_no_p().sno4(value);
	}

	public String wrk_no() {
		return sno_wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_wrk_no_p().wrk_nm(value);
	}

}

