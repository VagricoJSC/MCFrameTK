package mcframe.serverMSBE.MSBEL2520;

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
 * ブロック"Chk01_DtlGi"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_DtlGiR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_dtl_peg_no = "hdr_dtl_peg_no";
	public static final String $stk_xfr_d = "stk_xfr_d";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
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
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public static final String $lot_no_typ = "lot_no_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public static final String $sublot_no_typ = "sublot_no_typ";
	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $lot_no_ptn_cd = "lot_no_ptn_cd";
	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sublot_no_ptn_cd = "sublot_no_ptn_cd";
	/**
	 * NULL character used flg. for inventory arriving point cd. 在庫着荷先ＣＤのＮＵＬＬ文字使用ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd_mode_nullval_flg = "stk_arrv_bp_cd_mode_nullval_flg";
	/**
	 * BP for inventory arriving point cd. Input assist search type 在庫着荷先ＣＤの取引先入力補助検索区分.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd_srch_typ = "stk_arrv_bp_cd_srch_typ";
	/**
	 * BP for Inventory BP cd. input assist search type 在庫取引先ＣＤの取引先入力補助検索区分.<p>
	 *
	 */
	public static final String $stk_bp_cd_srch_typ = "stk_bp_cd_srch_typ";
	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Base conversion qty. 基準換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_conv_rnd_typ = "base_unit_conv_rnd_typ";
	/**
	 * Update GR/GI result 受払実績更新.<p>
	 *
	 */
	public static final String $io_upd_flg = "io_upd_flg";
	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public static final String $crt_lot_flg = "crt_lot_flg";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";

	public static final String $stk_xfr_act_no = $stk_xfr_d + ".stk_xfr_act_no";
	public static final String $stk_xfr_act_d_no = $stk_xfr_d + ".stk_xfr_act_d_no";
	public static final String $itm_cd = $stk_xfr_d + ".itm_cd";
	public static final String $itm_sub1 = $stk_xfr_d + ".itm_sub1";
	public static final String $itm_sub2 = $stk_xfr_d + ".itm_sub2";
	public static final String $itm_sub3 = $stk_xfr_d + ".itm_sub3";
	public static final String $sno1_mng_typ = $stk_xfr_d + ".sno1_mng_typ";
	public static final String $sno2_mng_typ = $stk_xfr_d + ".sno2_mng_typ";
	public static final String $sno3_mng_typ = $stk_xfr_d + ".sno3_mng_typ";
	public static final String $sno4_mng_typ = $stk_xfr_d + ".sno4_mng_typ";
	public static final String $str_ln_cd = $stk_xfr_d + ".str_ln_cd";
	public static final String $fix_no_typ = $stk_xfr_d + ".fix_no_typ";
	public static final String $fix_no = $stk_xfr_d + ".fix_no";
	public static final String $stk_arrv_bp_cd = $stk_xfr_d + ".stk_arrv_bp_cd";
	public static final String $lot_no = $stk_xfr_d + ".lot_no";
	public static final String $sublot_no = $stk_xfr_d + ".sublot_no";
	public static final String $sno1 = $stk_xfr_d + ".sno1";
	public static final String $sno2 = $stk_xfr_d + ".sno2";
	public static final String $sno3 = $stk_xfr_d + ".sno3";
	public static final String $sno4 = $stk_xfr_d + ".sno4";
	public static final String $gd_cd = $stk_xfr_d + ".gd_cd";
	public static final String $quality_typ = $stk_xfr_d + ".quality_typ";
	public static final String $stk_id_typ = $stk_xfr_d + ".stk_id_typ";
	public static final String $stk_bp_cd = $stk_xfr_d + ".stk_bp_cd";
	public static final String $trd_unit_qty = $stk_xfr_d + ".trd_unit_qty";
	public static final String $trd_unit_cd = $stk_xfr_d + ".trd_unit_cd";
	public static final String $base_unit_qty = $stk_xfr_d + ".base_unit_qty";
	public static final String $base_unit_cd = $stk_xfr_d + ".base_unit_cd";
	public static final String $pack_unit_qty = $stk_xfr_d + ".pack_unit_qty";
	public static final String $pack_unit_cd = $stk_xfr_d + ".pack_unit_cd";
	public static final String $intr_d_rmrks = $stk_xfr_d + ".intr_d_rmrks";
	public static final String $trd_d_rmrks = $stk_xfr_d + ".trd_d_rmrks";
	public static final String $sub_char1 = $stk_xfr_d + ".sub_char1";
	public static final String $sub_char2 = $stk_xfr_d + ".sub_char2";
	public static final String $sub_char3 = $stk_xfr_d + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_dtl_peg_no_META = createCommonMeta($hdr_dtl_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta stk_xfr_d_META = createInnerRowMeta($stk_xfr_d, mcframe.serverMS.dbc.MST_STK_XFR_ACT_D_R.class);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta lot_no_ptn_cd_META = createCommonMeta($lot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sublot_no_ptn_cd_META = createCommonMeta($sublot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta stk_arrv_bp_cd_mode_nullval_flg_META = createCommonMeta($stk_arrv_bp_cd_mode_nullval_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_arrv_bp_cd_srch_typ_META = createStringMeta($stk_arrv_bp_cd_srch_typ);
	public static final MCMeta stk_bp_cd_srch_typ_META = createStringMeta($stk_bp_cd_srch_typ);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_conv_rnd_typ_META = createCommonMeta($base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta io_upd_flg_META = createCommonMeta($io_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta crt_lot_flg_META = createCommonMeta($crt_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);

	protected static final ConstMetaList<Chk01_DtlGiR> constMetas = new ConstMetaList<Chk01_DtlGiR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			hdr_dtl_peg_no_META,
			stk_xfr_d_META,
			sundry_itm_flg_META,
			itm_nm_META,
			stk_mng_typ_META,
			lot_mng_typ_META,
			lot_no_typ_META,
			sublot_mng_typ_META,
			sublot_no_typ_META,
			lot_no_ptn_cd_META,
			sublot_no_ptn_cd_META,
			stk_arrv_bp_cd_mode_nullval_flg_META,
			stk_arrv_bp_cd_srch_typ_META,
			stk_bp_cd_srch_typ_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_dec_place_META,
			base_unit_dec_place_META,
			base_unit_conv_rnd_typ_META,
			io_upd_flg_META,
			crt_lot_flg_META,
			err_flg_META,
			dlv_slip_no_META,
			data_crud_typ_META
		},
		new String[][]{
			{
				"stk_xfr_act_no",
				"stk_xfr_act_d_no",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"sno1_mng_typ",
				"sno2_mng_typ",
				"sno3_mng_typ",
				"sno4_mng_typ",
				"str_ln_cd",
				"fix_no_typ",
				"fix_no",
				"stk_arrv_bp_cd",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"gd_cd",
				"quality_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"pack_unit_qty",
				"pack_unit_cd",
				"intr_d_rmrks",
				"trd_d_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$stk_xfr_act_no,
				$stk_xfr_act_d_no,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$sno1_mng_typ,
				$sno2_mng_typ,
				$sno3_mng_typ,
				$sno4_mng_typ,
				$str_ln_cd,
				$fix_no_typ,
				$fix_no,
				$stk_arrv_bp_cd,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$gd_cd,
				$quality_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$pack_unit_qty,
				$pack_unit_cd,
				$intr_d_rmrks,
				$trd_d_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$stk_xfr_d + ".itm_sub1", "E"},	// stk_xfr_d.itm_sub1
				{$stk_xfr_d + ".itm_sub2", "E"},	// stk_xfr_d.itm_sub2
				{$stk_xfr_d + ".itm_sub3", "E"},	// stk_xfr_d.itm_sub3
				{$stk_xfr_d + ".str_ln_cd", "E"},	// stk_xfr_d.str_ln_cd
				{$stk_xfr_d + ".stk_arrv_bp_cd", "E"},	// stk_xfr_d.stk_arrv_bp_cd
				{$stk_xfr_d + ".lot_no", "E"},	// stk_xfr_d.lot_no
				{$stk_xfr_d + ".sublot_no", "E"},	// stk_xfr_d.sublot_no
				{$stk_xfr_d + ".sno1", "E"},	// stk_xfr_d.sno1
				{$stk_xfr_d + ".sno2", "E"},	// stk_xfr_d.sno2
				{$stk_xfr_d + ".sno3", "E"},	// stk_xfr_d.sno3
				{$stk_xfr_d + ".sno4", "E"},	// stk_xfr_d.sno4
				{$stk_xfr_d + ".stk_bp_cd", "E"}	// stk_xfr_d.stk_bp_cd
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$peg_no, "E"},	// peg_no
				{$hdr_dtl_peg_no, "E"},	// hdr_dtl_peg_no
				{$stk_xfr_d + ".itm_cd", "E"},	// stk_xfr_d.itm_cd
				{$stk_xfr_d + ".fix_no_typ", "E"},	// stk_xfr_d.fix_no_typ
				{$stk_xfr_d + ".gd_cd", "E"},	// stk_xfr_d.gd_cd
				{$stk_xfr_d + ".quality_typ", "E"},	// stk_xfr_d.quality_typ
				{$stk_xfr_d + ".trd_unit_qty", "E"},	// stk_xfr_d.trd_unit_qty
				{$stk_xfr_d + ".trd_unit_cd", "E"}	// stk_xfr_d.trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$stk_xfr_d + ".trd_unit_qty", "positive"}	// stk_xfr_d.trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$stk_xfr_d + ".fix_no_typ", "MSC_FIX_NO_TYP"},	// stk_xfr_d.fix_no_typ
				{$stk_xfr_d + ".quality_typ", "MAC_QUALITY_TYP"},	// stk_xfr_d.quality_typ
				{$stk_xfr_d + ".stk_id_typ", "MSC_STK_ID_TYP"}	// stk_xfr_d.stk_id_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$stk_xfr_d + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// stk_xfr_d.itm_sub3
				{$stk_xfr_d + ".str_ln_cd", "MA.MAUAL0010.StrLn"},	// stk_xfr_d.str_ln_cd
				{$stk_xfr_d + ".stk_arrv_bp_cd", "MA.MAUAL0010.Bp"},	// stk_xfr_d.stk_arrv_bp_cd
				{$stk_xfr_d + ".gd_cd", "MA.MAUAL0010.StkGd"},	// stk_xfr_d.gd_cd
				{$stk_xfr_d + ".stk_bp_cd", "MA.MAUAL0010.Bp"},	// stk_xfr_d.stk_bp_cd
				{$stk_xfr_d + ".trd_unit_cd", "MA.MAUAL0010.ItmUnit"},	// stk_xfr_d.trd_unit_cd
				{$stk_xfr_d + ".base_unit_cd", "MA.MAUAL0010.ItmUnit"}	// stk_xfr_d.base_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$stk_xfr_d + ".itm_sub3", "lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;base_unit_cd;stk_mng_typ;sundry_itm_flg"},	// stk_xfr_d.itm_sub3
				{$stk_xfr_d + ".trd_unit_cd", "trd_unit_conv_base_qty;trd_unit_conv_qty;trd_unit_dec_place"},	// stk_xfr_d.trd_unit_cd
				{$stk_xfr_d + ".base_unit_cd", "base_unit_dec_place;base_unit_conv_rnd_typ"}	// stk_xfr_d.base_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$stk_xfr_d + ".itm_sub3", "lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;stk_mng_typ;sundry_itm_flg"},	// stk_xfr_d.itm_sub3
				{$stk_xfr_d + ".trd_unit_cd", "conv_base_qty;conv_qty;dec_place"},	// stk_xfr_d.trd_unit_cd
				{$stk_xfr_d + ".base_unit_cd", "dec_place;rnd_typ"}	// stk_xfr_d.base_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$stk_xfr_d + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// stk_xfr_d.itm_sub3
				{$stk_xfr_d + ".stk_arrv_bp_cd", "true"},	// stk_xfr_d.stk_arrv_bp_cd
				{$stk_xfr_d + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// stk_xfr_d.trd_unit_cd
				{$stk_xfr_d + ".base_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// stk_xfr_d.base_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$stk_xfr_d + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// stk_xfr_d.itm_sub3
				{$stk_xfr_d + ".stk_arrv_bp_cd", "mode_nullval_flg"},	// stk_xfr_d.stk_arrv_bp_cd
				{$stk_xfr_d + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// stk_xfr_d.trd_unit_cd
				{$stk_xfr_d + ".base_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// stk_xfr_d.base_unit_cd
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
	protected Chk01_DtlGiR_MC_A(ConstMetaList<? extends Chk01_DtlGiR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlGiR clone() {
		return (Chk01_DtlGiR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlGiR createInstance() {
		return (Chk01_DtlGiR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlGiR getValues(String... names) {
		return (Chk01_DtlGiR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_dtl_peg_no() {
		return getConstNumber(offset + 1, $hdr_dtl_peg_no);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(int value) {
		setConstNumber(offset + 1, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(long value) {
		setConstNumber(offset + 1, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(float value) {
		setConstNumber(offset + 1, $hdr_dtl_peg_no, value);
	}

	/**
	 * Header details pegging No. ヘッダ明細紐付けＮＯ.<p>
	 *
	 */
	public void hdr_dtl_peg_no(double value) {
		setConstNumber(offset + 1, $hdr_dtl_peg_no, value);
	}


	public mcframe.serverMS.dbc.MST_STK_XFR_ACT_D_R stk_xfr_d(){
		return (mcframe.serverMS.dbc.MST_STK_XFR_ACT_D_R) getConstInnerRow(offset + 2, $stk_xfr_d);
	}
	
	public void stk_xfr_d(mcframe.serverMS.dbc.MST_STK_XFR_ACT_D_R row){
		setConstInnerRow(offset + 2, $stk_xfr_d, row);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 3, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 3, $sundry_itm_flg, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 4, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 4, $itm_nm, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 5, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 5, $stk_mng_typ, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 6, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 6, $lot_mng_typ, value);
	}


	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 7, $lot_no_typ);
	}

	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 7, $lot_no_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 8, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 8, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 9, $sublot_no_typ);
	}

	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 9, $sublot_no_typ, value);
	}


	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String lot_no_ptn_cd() {
		return getConstString(offset + 10, $lot_no_ptn_cd);
	}

	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void lot_no_ptn_cd(String value) {
		setConstString(offset + 10, $lot_no_ptn_cd, value);
	}


	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String sublot_no_ptn_cd() {
		return getConstString(offset + 11, $sublot_no_ptn_cd);
	}

	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void sublot_no_ptn_cd(String value) {
		setConstString(offset + 11, $sublot_no_ptn_cd, value);
	}


	/**
	 * NULL character used flg. for inventory arriving point cd. 在庫着荷先ＣＤのＮＵＬＬ文字使用ＦＬＧ.<p>
	 *
	 */
	public boolean stk_arrv_bp_cd_mode_nullval_flg() {
		return getConstBoolean(offset + 12, $stk_arrv_bp_cd_mode_nullval_flg);
	}

	/**
	 * NULL character used flg. for inventory arriving point cd. 在庫着荷先ＣＤのＮＵＬＬ文字使用ＦＬＧ.<p>
	 *
	 */
	public void stk_arrv_bp_cd_mode_nullval_flg(boolean value) {
		setConstBoolean(offset + 12, $stk_arrv_bp_cd_mode_nullval_flg, value);
	}


	/**
	 * BP for inventory arriving point cd. Input assist search type 在庫着荷先ＣＤの取引先入力補助検索区分.<p>
	 *
	 */
	public String stk_arrv_bp_cd_srch_typ() {
		return getConstString(offset + 13, $stk_arrv_bp_cd_srch_typ);
	}

	/**
	 * BP for inventory arriving point cd. Input assist search type 在庫着荷先ＣＤの取引先入力補助検索区分.<p>
	 *
	 */
	public void stk_arrv_bp_cd_srch_typ(String value) {
		setConstString(offset + 13, $stk_arrv_bp_cd_srch_typ, value);
	}


	/**
	 * BP for Inventory BP cd. input assist search type 在庫取引先ＣＤの取引先入力補助検索区分.<p>
	 *
	 */
	public String stk_bp_cd_srch_typ() {
		return getConstString(offset + 14, $stk_bp_cd_srch_typ);
	}

	/**
	 * BP for Inventory BP cd. input assist search type 在庫取引先ＣＤの取引先入力補助検索区分.<p>
	 *
	 */
	public void stk_bp_cd_srch_typ(String value) {
		setConstString(offset + 14, $stk_bp_cd_srch_typ, value);
	}


	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 15, $trd_unit_conv_base_qty);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 15, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 15, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 15, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 15, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 15, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Base conversion qty. 基準換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 16, $trd_unit_conv_qty);
	}

	/**
	 * Base conversion qty. 基準換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 16, $trd_unit_conv_qty, value);
	}

	/**
	 * Base conversion qty. 基準換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 16, $trd_unit_conv_qty, value);
	}

	/**
	 * Base conversion qty. 基準換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 16, $trd_unit_conv_qty, value);
	}

	/**
	 * Base conversion qty. 基準換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 16, $trd_unit_conv_qty, value);
	}

	/**
	 * Base conversion qty. 基準換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 16, $trd_unit_conv_qty, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 17, $trd_unit_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 17, $trd_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 17, $trd_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 17, $trd_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 17, $trd_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 17, $trd_unit_dec_place, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 18, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 18, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_conv_rnd_typ() {
		return getConstString(offset + 19, $base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 19, $base_unit_conv_rnd_typ, value);
	}


	/**
	 * Update GR/GI result 受払実績更新.<p>
	 *
	 */
	public boolean io_upd_flg() {
		return getConstBoolean(offset + 20, $io_upd_flg);
	}

	/**
	 * Update GR/GI result 受払実績更新.<p>
	 *
	 */
	public void io_upd_flg(boolean value) {
		setConstBoolean(offset + 20, $io_upd_flg, value);
	}


	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public boolean crt_lot_flg() {
		return getConstBoolean(offset + 21, $crt_lot_flg);
	}

	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public void crt_lot_flg(boolean value) {
		setConstBoolean(offset + 21, $crt_lot_flg, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 22, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 22, $err_flg, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 23, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 23, $dlv_slip_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 24, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 24, $data_crud_typ, value);
	}


	public String getString(String name) {
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return lot_no_ptn_cd();
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return sublot_no_ptn_cd();
		}
		if ($stk_arrv_bp_cd_srch_typ.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd_srch_typ();
		}
		if ($stk_bp_cd_srch_typ.equalsIgnoreCase(name)) {
			return stk_bp_cd_srch_typ();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			return hdr_dtl_peg_no();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($stk_arrv_bp_cd_mode_nullval_flg.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd_mode_nullval_flg();
		}
		if ($io_upd_flg.equalsIgnoreCase(name)) {
			return io_upd_flg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return lot_no_ptn_cd();
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return sublot_no_ptn_cd();
		}
		if ($stk_arrv_bp_cd_srch_typ.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd_srch_typ();
		}
		if ($stk_bp_cd_srch_typ.equalsIgnoreCase(name)) {
			return stk_bp_cd_srch_typ();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			return hdr_dtl_peg_no();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($stk_arrv_bp_cd_mode_nullval_flg.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd_mode_nullval_flg();
		}
		if ($io_upd_flg.equalsIgnoreCase(name)) {
			return io_upd_flg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
			return;
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			lot_no_ptn_cd(value);
			return;
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			sublot_no_ptn_cd(value);
			return;
		}
		if ($stk_arrv_bp_cd_srch_typ.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd_srch_typ(value);
			return;
		}
		if ($stk_bp_cd_srch_typ.equalsIgnoreCase(name)) {
			stk_bp_cd_srch_typ(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($stk_arrv_bp_cd_mode_nullval_flg.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd_mode_nullval_flg(value);
			return;
		}
		if ($io_upd_flg.equalsIgnoreCase(name)) {
			io_upd_flg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
			return;
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			lot_no_ptn_cd(value);
			return;
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			sublot_no_ptn_cd(value);
			return;
		}
		if ($stk_arrv_bp_cd_srch_typ.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd_srch_typ(value);
			return;
		}
		if ($stk_bp_cd_srch_typ.equalsIgnoreCase(name)) {
			stk_bp_cd_srch_typ(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_dtl_peg_no.equalsIgnoreCase(name)) {
			hdr_dtl_peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($stk_arrv_bp_cd_mode_nullval_flg.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd_mode_nullval_flg(value);
			return;
		}
		if ($io_upd_flg.equalsIgnoreCase(name)) {
			io_upd_flg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($stk_xfr_d.equalsIgnoreCase(name)) {
			return stk_xfr_d();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($stk_xfr_d.equalsIgnoreCase(name)) {
			stk_xfr_d(
				((MCContainerMeta) stk_xfr_d_META).castInnerRow(mcframe.serverMS.dbc.MST_STK_XFR_ACT_D_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Inventory transfer result No. 在庫振替実績ＮＯ.<p>
	 *
	 */
	public String stk_xfr_act_no() {
		return stk_xfr_d().stk_xfr_act_no();
	}

	/**
	 * Inventory transfer result No. 在庫振替実績ＮＯ.<p>
	 *
	 */
	public void stk_xfr_act_no(String value) {
		stk_xfr_d().stk_xfr_act_no(value);
	}

	/**
	 * Inventory transfer result details No. 在庫振替実績明細ＮＯ.<p>
	 *
	 */
	public String stk_xfr_act_d_no() {
		return stk_xfr_d().stk_xfr_act_d_no();
	}

	/**
	 * Inventory transfer result details No. 在庫振替実績明細ＮＯ.<p>
	 *
	 */
	public void stk_xfr_act_d_no(String value) {
		stk_xfr_d().stk_xfr_act_d_no(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return stk_xfr_d().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		stk_xfr_d().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return stk_xfr_d().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		stk_xfr_d().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return stk_xfr_d().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		stk_xfr_d().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return stk_xfr_d().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		stk_xfr_d().itm_sub3(value);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return stk_xfr_d().sno1_mng_typ();
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		stk_xfr_d().sno1_mng_typ(value);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return stk_xfr_d().sno2_mng_typ();
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		stk_xfr_d().sno2_mng_typ(value);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return stk_xfr_d().sno3_mng_typ();
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		stk_xfr_d().sno3_mng_typ(value);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return stk_xfr_d().sno4_mng_typ();
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		stk_xfr_d().sno4_mng_typ(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return stk_xfr_d().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		stk_xfr_d().str_ln_cd(value);
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public String fix_no_typ() {
		return stk_xfr_d().fix_no_typ();
	}

	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public void fix_no_typ(String value) {
		stk_xfr_d().fix_no_typ(value);
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public String fix_no() {
		return stk_xfr_d().fix_no();
	}

	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public void fix_no(String value) {
		stk_xfr_d().fix_no(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return stk_xfr_d().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		stk_xfr_d().stk_arrv_bp_cd(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return stk_xfr_d().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		stk_xfr_d().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return stk_xfr_d().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		stk_xfr_d().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return stk_xfr_d().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		stk_xfr_d().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return stk_xfr_d().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		stk_xfr_d().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return stk_xfr_d().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		stk_xfr_d().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return stk_xfr_d().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		stk_xfr_d().sno4(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return stk_xfr_d().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		stk_xfr_d().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return stk_xfr_d().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		stk_xfr_d().quality_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return stk_xfr_d().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		stk_xfr_d().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return stk_xfr_d().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		stk_xfr_d().stk_bp_cd(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return stk_xfr_d().trd_unit_qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		stk_xfr_d().trd_unit_qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		stk_xfr_d().trd_unit_qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		stk_xfr_d().trd_unit_qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		stk_xfr_d().trd_unit_qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		stk_xfr_d().trd_unit_qty(value);
	}

	/**
	 * Unit cd. 単位CD.<p>
	 *
	 */
	public String trd_unit_cd() {
		return stk_xfr_d().trd_unit_cd();
	}

	/**
	 * Unit cd. 単位CD.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		stk_xfr_d().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return stk_xfr_d().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		stk_xfr_d().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		stk_xfr_d().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		stk_xfr_d().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		stk_xfr_d().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		stk_xfr_d().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return stk_xfr_d().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		stk_xfr_d().base_unit_cd(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return stk_xfr_d().pack_unit_qty();
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		stk_xfr_d().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		stk_xfr_d().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		stk_xfr_d().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		stk_xfr_d().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		stk_xfr_d().pack_unit_qty(value);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return stk_xfr_d().pack_unit_cd();
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		stk_xfr_d().pack_unit_cd(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return stk_xfr_d().intr_d_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		stk_xfr_d().intr_d_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return stk_xfr_d().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		stk_xfr_d().trd_d_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return stk_xfr_d().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		stk_xfr_d().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return stk_xfr_d().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		stk_xfr_d().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return stk_xfr_d().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		stk_xfr_d().sub_char3(value);
	}

}

