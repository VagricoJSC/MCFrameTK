package mcframe.serverMSBB.MSBBL6020;

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
 * ブロック"Slo_Upd01_DtlComp"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Slo_Upd01_DtlCompR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Sales order item configuration No. 受注品目構成ＮＯ.<p>
	 *
	 */
	public static final String $slo_itm_comp_no = "slo_itm_comp_no";
	/**
	 * Sales item No. 販売品目ＮＯ.<p>
	 *
	 */
	public static final String $sls_itm_no = "sls_itm_no";
	/**
	 * Sales item configuration No. 販売品目構成ＮＯ.<p>
	 *
	 */
	public static final String $sls_itm_comp_no = "sls_itm_comp_no";
	/**
	 * Item configuration row No. 品目構成行ＮＯ.<p>
	 *
	 */
	public static final String $slo_itm_comp_lno = "slo_itm_comp_lno";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public static final String $qtn_d_no = "qtn_d_no";
	/**
	 * Quotation item configuration No. 見積品目構成ＮＯ.<p>
	 *
	 */
	public static final String $qtn_itm_comp_no = "qtn_itm_comp_no";
	/**
	 * Main item 主品目.<p>
	 *
	 */
	public static final String $core_itm_flg = "core_itm_flg";
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
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
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
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * Standard cost unit price 標準原価単価.<p>
	 *
	 */
	public static final String $std_cost = "std_cost";
	/**
	 * Standard cost value Amount 標準原価金額.<p>
	 *
	 */
	public static final String $std_cost_amt = "std_cost_amt";
	/**
	 * Master reference マスタ参照.<p>
	 *
	 */
	public static final String $mst_flg = "mst_flg";
	/**
	 * Standard structure 標準構成.<p>
	 *
	 */
	public static final String $std_comp_flg = "std_comp_flg";
	/**
	 * Sales order configuration remarks 受注構成備考.<p>
	 *
	 */
	public static final String $slo_comp_rmrks = "slo_comp_rmrks";
	/**
	 * Sales order configuration spare 1 受注構成予備１.<p>
	 *
	 */
	public static final String $slo_comp_sub_char1 = "slo_comp_sub_char1";
	/**
	 * Sales order configuration spare 2 受注構成予備２.<p>
	 *
	 */
	public static final String $slo_comp_sub_char2 = "slo_comp_sub_char2";
	/**
	 * Sales order configuration spare 3 受注構成予備３.<p>
	 *
	 */
	public static final String $slo_comp_sub_char3 = "slo_comp_sub_char3";
	/**
	 * Quotation terms remarks 見積構成備考.<p>
	 *
	 */
	public static final String $qtn_comp_rmrks = "qtn_comp_rmrks";
	/**
	 * Quotation configuration spare 1 見積構成予備１.<p>
	 *
	 */
	public static final String $qtn_comp_sub_char1 = "qtn_comp_sub_char1";
	/**
	 * Quotation configuration spare 2 見積構成予備２.<p>
	 *
	 */
	public static final String $qtn_comp_sub_char2 = "qtn_comp_sub_char2";
	/**
	 * Quotation configuration spare 3 見積構成予備３.<p>
	 *
	 */
	public static final String $qtn_comp_sub_char3 = "qtn_comp_sub_char3";
	/**
	 * Configuration remarks 構成備考.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
	/**
	 * Configuration spare 1 構成予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Configuration spare 2 構成予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Configuration spare 3 構成予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Numbering 発番済.<p>
	 *
	 */
	public static final String $seq_flg = "seq_flg";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta slo_itm_comp_no_META = createCommonMeta($slo_itm_comp_no, mcframe.commonMA.meta.MA_META.SLO_ITM_COMP_NO);
	public static final MCMeta sls_itm_no_META = createCommonMeta($sls_itm_no, mcframe.commonMA.meta.MA_META.SLS_ITM_NO);
	public static final MCMeta sls_itm_comp_no_META = createCommonMeta($sls_itm_comp_no, mcframe.commonMA.meta.MA_META.SLS_ITM_COMP_NO);
	public static final MCMeta slo_itm_comp_lno_META = createCommonMeta($slo_itm_comp_lno, mcframe.commonMA.meta.MA_META.ITM_COMP_LNO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta qtn_d_no_META = createCommonMeta($qtn_d_no, mcframe.commonMA.meta.MA_META.QTN_D_NO);
	public static final MCMeta qtn_itm_comp_no_META = createCommonMeta($qtn_itm_comp_no, mcframe.commonMA.meta.MA_META.QTN_ITM_COMP_NO);
	public static final MCMeta core_itm_flg_META = createCommonMeta($core_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta std_cost_META = createCommonMeta($std_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost_amt_META = createCommonMeta($std_cost_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta mst_flg_META = createCommonMeta($mst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_comp_flg_META = createCommonMeta($std_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_comp_rmrks_META = createCommonMeta($slo_comp_rmrks, mcframe.commonMS.meta.MS_META.ITM_COMP_RMRKS);
	public static final MCMeta slo_comp_sub_char1_META = createCommonMeta($slo_comp_sub_char1, mcframe.commonMS.meta.MS_META.SLS_ITM_COMP_SUB_CHAR1);
	public static final MCMeta slo_comp_sub_char2_META = createCommonMeta($slo_comp_sub_char2, mcframe.commonMS.meta.MS_META.SLS_ITM_COMP_SUB_CHAR2);
	public static final MCMeta slo_comp_sub_char3_META = createCommonMeta($slo_comp_sub_char3, mcframe.commonMS.meta.MS_META.SLS_ITM_COMP_SUB_CHAR3);
	public static final MCMeta qtn_comp_rmrks_META = createCommonMeta($qtn_comp_rmrks, mcframe.commonMS.meta.MS_META.ITM_COMP_RMRKS);
	public static final MCMeta qtn_comp_sub_char1_META = createCommonMeta($qtn_comp_sub_char1, mcframe.commonMS.meta.MS_META.SLS_ITM_COMP_SUB_CHAR1);
	public static final MCMeta qtn_comp_sub_char2_META = createCommonMeta($qtn_comp_sub_char2, mcframe.commonMS.meta.MS_META.SLS_ITM_COMP_SUB_CHAR2);
	public static final MCMeta qtn_comp_sub_char3_META = createCommonMeta($qtn_comp_sub_char3, mcframe.commonMS.meta.MS_META.SLS_ITM_COMP_SUB_CHAR3);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMS.meta.MS_META.ITM_COMP_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLS_ITM_COMP_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLS_ITM_COMP_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLS_ITM_COMP_SUB_CHAR3);
	public static final MCMeta seq_flg_META = createCommonMeta($seq_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<Slo_Upd01_DtlCompR> constMetas = new ConstMetaList<Slo_Upd01_DtlCompR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			slo_itm_comp_no_META,
			sls_itm_no_META,
			sls_itm_comp_no_META,
			slo_itm_comp_lno_META,
			slo_d_no_META,
			qtn_d_no_META,
			qtn_itm_comp_no_META,
			core_itm_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			stk_mng_typ_META,
			sundry_itm_flg_META,
			trd_unit_cd_META,
			trd_unit_qty_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			base_unit_cd_META,
			base_unit_qty_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			std_cost_META,
			std_cost_amt_META,
			mst_flg_META,
			std_comp_flg_META,
			slo_comp_rmrks_META,
			slo_comp_sub_char1_META,
			slo_comp_sub_char2_META,
			slo_comp_sub_char3_META,
			qtn_comp_rmrks_META,
			qtn_comp_sub_char1_META,
			qtn_comp_sub_char2_META,
			qtn_comp_sub_char3_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			seq_flg_META,
			err_flg_META,
			peg_no_META,
			hdr_peg_no_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
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
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$slo_d_no, "E"},	// slo_d_no
				{$itm_cd, "E"},	// itm_cd
				{$trd_unit_cd, "E"},	// trd_unit_cd
				{$trd_unit_qty, "E"},	// trd_unit_qty
				{$trd_cur_upri, "E"}	// trd_cur_upri
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$trd_unit_qty, "positive"}	// trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$trd_cur_upri, "0:"}	// trd_cur_upri
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
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
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$trd_unit_cd, "MA.MAUAL0010.ItmUnit"}	// trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_nm;stk_mng_typ;sundry_itm_flg;base_unit_cd;base_unit_dec_place;base_unit_rnd_typ"},	// itm_sub3
				{$trd_unit_cd, "trd_unit_conv_base_qty;trd_unit_conv_qty"}	// trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_nm;stk_mng_typ;sundry_itm_flg;unit_cd;dec_place;rnd_typ"},	// itm_sub3
				{$trd_unit_cd, "conv_base_qty;conv_qty"}	// trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.COMM;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"}	// itm_sub3
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
	protected Slo_Upd01_DtlCompR_MC_A(ConstMetaList<? extends Slo_Upd01_DtlCompR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_DtlCompR clone() {
		return (Slo_Upd01_DtlCompR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_DtlCompR createInstance() {
		return (Slo_Upd01_DtlCompR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_DtlCompR getValues(String... names) {
		return (Slo_Upd01_DtlCompR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 * Sales order item configuration No. 受注品目構成ＮＯ.<p>
	 *
	 */
	public String slo_itm_comp_no() {
		return getConstString(offset + 1, $slo_itm_comp_no);
	}

	/**
	 * Sales order item configuration No. 受注品目構成ＮＯ.<p>
	 *
	 */
	public void slo_itm_comp_no(String value) {
		setConstString(offset + 1, $slo_itm_comp_no, value);
	}


	/**
	 * Sales item No. 販売品目ＮＯ.<p>
	 *
	 */
	public String sls_itm_no() {
		return getConstString(offset + 2, $sls_itm_no);
	}

	/**
	 * Sales item No. 販売品目ＮＯ.<p>
	 *
	 */
	public void sls_itm_no(String value) {
		setConstString(offset + 2, $sls_itm_no, value);
	}


	/**
	 * Sales item configuration No. 販売品目構成ＮＯ.<p>
	 *
	 */
	public String sls_itm_comp_no() {
		return getConstString(offset + 3, $sls_itm_comp_no);
	}

	/**
	 * Sales item configuration No. 販売品目構成ＮＯ.<p>
	 *
	 */
	public void sls_itm_comp_no(String value) {
		setConstString(offset + 3, $sls_itm_comp_no, value);
	}


	/**
	 * Item configuration row No. 品目構成行ＮＯ.<p>
	 *
	 */
	public String slo_itm_comp_lno() {
		return getConstString(offset + 4, $slo_itm_comp_lno);
	}

	/**
	 * Item configuration row No. 品目構成行ＮＯ.<p>
	 *
	 */
	public void slo_itm_comp_lno(String value) {
		setConstString(offset + 4, $slo_itm_comp_lno, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 5, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 5, $slo_d_no, value);
	}


	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public String qtn_d_no() {
		return getConstString(offset + 6, $qtn_d_no);
	}

	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public void qtn_d_no(String value) {
		setConstString(offset + 6, $qtn_d_no, value);
	}


	/**
	 * Quotation item configuration No. 見積品目構成ＮＯ.<p>
	 *
	 */
	public String qtn_itm_comp_no() {
		return getConstString(offset + 7, $qtn_itm_comp_no);
	}

	/**
	 * Quotation item configuration No. 見積品目構成ＮＯ.<p>
	 *
	 */
	public void qtn_itm_comp_no(String value) {
		setConstString(offset + 7, $qtn_itm_comp_no, value);
	}


	/**
	 * Main item 主品目.<p>
	 *
	 */
	public boolean core_itm_flg() {
		return getConstBoolean(offset + 8, $core_itm_flg);
	}

	/**
	 * Main item 主品目.<p>
	 *
	 */
	public void core_itm_flg(boolean value) {
		setConstBoolean(offset + 8, $core_itm_flg, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 9, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 9, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 10, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 10, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 11, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 11, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 12, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 12, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 13, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 13, $itm_nm, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 14, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 14, $stk_mng_typ, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 15, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 15, $sundry_itm_flg, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 16, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 16, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 17, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 17, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 17, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 17, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 17, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 17, $trd_unit_qty, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 18, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 18, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 18, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 18, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 18, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 18, $trd_cur_upri, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 19, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 19, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 19, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 19, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 19, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 19, $trd_cur_amt, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 20, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 20, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 20, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 20, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 20, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 20, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 21, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 21, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 21, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 21, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 21, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 21, $trd_unit_conv_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 22, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 22, $base_unit_cd, value);
	}


	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 23, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 23, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 23, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 23, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 23, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 23, $base_unit_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 24, $base_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 25, $base_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 25, $base_unit_rnd_typ, value);
	}


	/**
	 * Standard cost unit price 標準原価単価.<p>
	 *
	 */
	public MCNumber std_cost() {
		return getConstNumber(offset + 26, $std_cost);
	}

	/**
	 * Standard cost unit price 標準原価単価.<p>
	 *
	 */
	public void std_cost(MCNumber value) {
		setConstNumber(offset + 26, $std_cost, value);
	}

	/**
	 * Standard cost unit price 標準原価単価.<p>
	 *
	 */
	public void std_cost(int value) {
		setConstNumber(offset + 26, $std_cost, value);
	}

	/**
	 * Standard cost unit price 標準原価単価.<p>
	 *
	 */
	public void std_cost(long value) {
		setConstNumber(offset + 26, $std_cost, value);
	}

	/**
	 * Standard cost unit price 標準原価単価.<p>
	 *
	 */
	public void std_cost(float value) {
		setConstNumber(offset + 26, $std_cost, value);
	}

	/**
	 * Standard cost unit price 標準原価単価.<p>
	 *
	 */
	public void std_cost(double value) {
		setConstNumber(offset + 26, $std_cost, value);
	}


	/**
	 * Standard cost value Amount 標準原価金額.<p>
	 *
	 */
	public MCNumber std_cost_amt() {
		return getConstNumber(offset + 27, $std_cost_amt);
	}

	/**
	 * Standard cost value Amount 標準原価金額.<p>
	 *
	 */
	public void std_cost_amt(MCNumber value) {
		setConstNumber(offset + 27, $std_cost_amt, value);
	}

	/**
	 * Standard cost value Amount 標準原価金額.<p>
	 *
	 */
	public void std_cost_amt(int value) {
		setConstNumber(offset + 27, $std_cost_amt, value);
	}

	/**
	 * Standard cost value Amount 標準原価金額.<p>
	 *
	 */
	public void std_cost_amt(long value) {
		setConstNumber(offset + 27, $std_cost_amt, value);
	}

	/**
	 * Standard cost value Amount 標準原価金額.<p>
	 *
	 */
	public void std_cost_amt(float value) {
		setConstNumber(offset + 27, $std_cost_amt, value);
	}

	/**
	 * Standard cost value Amount 標準原価金額.<p>
	 *
	 */
	public void std_cost_amt(double value) {
		setConstNumber(offset + 27, $std_cost_amt, value);
	}


	/**
	 * Master reference マスタ参照.<p>
	 *
	 */
	public boolean mst_flg() {
		return getConstBoolean(offset + 28, $mst_flg);
	}

	/**
	 * Master reference マスタ参照.<p>
	 *
	 */
	public void mst_flg(boolean value) {
		setConstBoolean(offset + 28, $mst_flg, value);
	}


	/**
	 * Standard structure 標準構成.<p>
	 *
	 */
	public boolean std_comp_flg() {
		return getConstBoolean(offset + 29, $std_comp_flg);
	}

	/**
	 * Standard structure 標準構成.<p>
	 *
	 */
	public void std_comp_flg(boolean value) {
		setConstBoolean(offset + 29, $std_comp_flg, value);
	}


	/**
	 * Sales order configuration remarks 受注構成備考.<p>
	 *
	 */
	public String slo_comp_rmrks() {
		return getConstString(offset + 30, $slo_comp_rmrks);
	}

	/**
	 * Sales order configuration remarks 受注構成備考.<p>
	 *
	 */
	public void slo_comp_rmrks(String value) {
		setConstString(offset + 30, $slo_comp_rmrks, value);
	}


	/**
	 * Sales order configuration spare 1 受注構成予備１.<p>
	 *
	 */
	public String slo_comp_sub_char1() {
		return getConstString(offset + 31, $slo_comp_sub_char1);
	}

	/**
	 * Sales order configuration spare 1 受注構成予備１.<p>
	 *
	 */
	public void slo_comp_sub_char1(String value) {
		setConstString(offset + 31, $slo_comp_sub_char1, value);
	}


	/**
	 * Sales order configuration spare 2 受注構成予備２.<p>
	 *
	 */
	public String slo_comp_sub_char2() {
		return getConstString(offset + 32, $slo_comp_sub_char2);
	}

	/**
	 * Sales order configuration spare 2 受注構成予備２.<p>
	 *
	 */
	public void slo_comp_sub_char2(String value) {
		setConstString(offset + 32, $slo_comp_sub_char2, value);
	}


	/**
	 * Sales order configuration spare 3 受注構成予備３.<p>
	 *
	 */
	public String slo_comp_sub_char3() {
		return getConstString(offset + 33, $slo_comp_sub_char3);
	}

	/**
	 * Sales order configuration spare 3 受注構成予備３.<p>
	 *
	 */
	public void slo_comp_sub_char3(String value) {
		setConstString(offset + 33, $slo_comp_sub_char3, value);
	}


	/**
	 * Quotation terms remarks 見積構成備考.<p>
	 *
	 */
	public String qtn_comp_rmrks() {
		return getConstString(offset + 34, $qtn_comp_rmrks);
	}

	/**
	 * Quotation terms remarks 見積構成備考.<p>
	 *
	 */
	public void qtn_comp_rmrks(String value) {
		setConstString(offset + 34, $qtn_comp_rmrks, value);
	}


	/**
	 * Quotation configuration spare 1 見積構成予備１.<p>
	 *
	 */
	public String qtn_comp_sub_char1() {
		return getConstString(offset + 35, $qtn_comp_sub_char1);
	}

	/**
	 * Quotation configuration spare 1 見積構成予備１.<p>
	 *
	 */
	public void qtn_comp_sub_char1(String value) {
		setConstString(offset + 35, $qtn_comp_sub_char1, value);
	}


	/**
	 * Quotation configuration spare 2 見積構成予備２.<p>
	 *
	 */
	public String qtn_comp_sub_char2() {
		return getConstString(offset + 36, $qtn_comp_sub_char2);
	}

	/**
	 * Quotation configuration spare 2 見積構成予備２.<p>
	 *
	 */
	public void qtn_comp_sub_char2(String value) {
		setConstString(offset + 36, $qtn_comp_sub_char2, value);
	}


	/**
	 * Quotation configuration spare 3 見積構成予備３.<p>
	 *
	 */
	public String qtn_comp_sub_char3() {
		return getConstString(offset + 37, $qtn_comp_sub_char3);
	}

	/**
	 * Quotation configuration spare 3 見積構成予備３.<p>
	 *
	 */
	public void qtn_comp_sub_char3(String value) {
		setConstString(offset + 37, $qtn_comp_sub_char3, value);
	}


	/**
	 * Configuration remarks 構成備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 38, $rmrks);
	}

	/**
	 * Configuration remarks 構成備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 38, $rmrks, value);
	}


	/**
	 * Configuration spare 1 構成予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 39, $sub_char1);
	}

	/**
	 * Configuration spare 1 構成予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 39, $sub_char1, value);
	}


	/**
	 * Configuration spare 2 構成予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 40, $sub_char2);
	}

	/**
	 * Configuration spare 2 構成予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 40, $sub_char2, value);
	}


	/**
	 * Configuration spare 3 構成予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 41, $sub_char3);
	}

	/**
	 * Configuration spare 3 構成予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 41, $sub_char3, value);
	}


	/**
	 * Numbering 発番済.<p>
	 *
	 */
	public boolean seq_flg() {
		return getConstBoolean(offset + 42, $seq_flg);
	}

	/**
	 * Numbering 発番済.<p>
	 *
	 */
	public void seq_flg(boolean value) {
		setConstBoolean(offset + 42, $seq_flg, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 43, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 43, $err_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 44, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 44, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 44, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 44, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 44, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 44, $peg_no, value);
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 45, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 45, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 45, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 45, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 45, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 45, $hdr_peg_no, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($slo_itm_comp_no.equalsIgnoreCase(name)) {
			return slo_itm_comp_no();
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			return sls_itm_no();
		}
		if ($sls_itm_comp_no.equalsIgnoreCase(name)) {
			return sls_itm_comp_no();
		}
		if ($slo_itm_comp_lno.equalsIgnoreCase(name)) {
			return slo_itm_comp_lno();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($qtn_itm_comp_no.equalsIgnoreCase(name)) {
			return qtn_itm_comp_no();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($slo_comp_rmrks.equalsIgnoreCase(name)) {
			return slo_comp_rmrks();
		}
		if ($slo_comp_sub_char1.equalsIgnoreCase(name)) {
			return slo_comp_sub_char1();
		}
		if ($slo_comp_sub_char2.equalsIgnoreCase(name)) {
			return slo_comp_sub_char2();
		}
		if ($slo_comp_sub_char3.equalsIgnoreCase(name)) {
			return slo_comp_sub_char3();
		}
		if ($qtn_comp_rmrks.equalsIgnoreCase(name)) {
			return qtn_comp_rmrks();
		}
		if ($qtn_comp_sub_char1.equalsIgnoreCase(name)) {
			return qtn_comp_sub_char1();
		}
		if ($qtn_comp_sub_char2.equalsIgnoreCase(name)) {
			return qtn_comp_sub_char2();
		}
		if ($qtn_comp_sub_char3.equalsIgnoreCase(name)) {
			return qtn_comp_sub_char3();
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
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			return std_cost();
		}
		if ($std_cost_amt.equalsIgnoreCase(name)) {
			return std_cost_amt();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($core_itm_flg.equalsIgnoreCase(name)) {
			return core_itm_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($mst_flg.equalsIgnoreCase(name)) {
			return mst_flg();
		}
		if ($std_comp_flg.equalsIgnoreCase(name)) {
			return std_comp_flg();
		}
		if ($seq_flg.equalsIgnoreCase(name)) {
			return seq_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($slo_itm_comp_no.equalsIgnoreCase(name)) {
			return slo_itm_comp_no();
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			return sls_itm_no();
		}
		if ($sls_itm_comp_no.equalsIgnoreCase(name)) {
			return sls_itm_comp_no();
		}
		if ($slo_itm_comp_lno.equalsIgnoreCase(name)) {
			return slo_itm_comp_lno();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($qtn_itm_comp_no.equalsIgnoreCase(name)) {
			return qtn_itm_comp_no();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($slo_comp_rmrks.equalsIgnoreCase(name)) {
			return slo_comp_rmrks();
		}
		if ($slo_comp_sub_char1.equalsIgnoreCase(name)) {
			return slo_comp_sub_char1();
		}
		if ($slo_comp_sub_char2.equalsIgnoreCase(name)) {
			return slo_comp_sub_char2();
		}
		if ($slo_comp_sub_char3.equalsIgnoreCase(name)) {
			return slo_comp_sub_char3();
		}
		if ($qtn_comp_rmrks.equalsIgnoreCase(name)) {
			return qtn_comp_rmrks();
		}
		if ($qtn_comp_sub_char1.equalsIgnoreCase(name)) {
			return qtn_comp_sub_char1();
		}
		if ($qtn_comp_sub_char2.equalsIgnoreCase(name)) {
			return qtn_comp_sub_char2();
		}
		if ($qtn_comp_sub_char3.equalsIgnoreCase(name)) {
			return qtn_comp_sub_char3();
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
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			return std_cost();
		}
		if ($std_cost_amt.equalsIgnoreCase(name)) {
			return std_cost_amt();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($core_itm_flg.equalsIgnoreCase(name)) {
			return core_itm_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($mst_flg.equalsIgnoreCase(name)) {
			return mst_flg();
		}
		if ($std_comp_flg.equalsIgnoreCase(name)) {
			return std_comp_flg();
		}
		if ($seq_flg.equalsIgnoreCase(name)) {
			return seq_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($slo_itm_comp_no.equalsIgnoreCase(name)) {
			slo_itm_comp_no(value);
			return;
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			sls_itm_no(value);
			return;
		}
		if ($sls_itm_comp_no.equalsIgnoreCase(name)) {
			sls_itm_comp_no(value);
			return;
		}
		if ($slo_itm_comp_lno.equalsIgnoreCase(name)) {
			slo_itm_comp_lno(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
			return;
		}
		if ($qtn_itm_comp_no.equalsIgnoreCase(name)) {
			qtn_itm_comp_no(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($slo_comp_rmrks.equalsIgnoreCase(name)) {
			slo_comp_rmrks(value);
			return;
		}
		if ($slo_comp_sub_char1.equalsIgnoreCase(name)) {
			slo_comp_sub_char1(value);
			return;
		}
		if ($slo_comp_sub_char2.equalsIgnoreCase(name)) {
			slo_comp_sub_char2(value);
			return;
		}
		if ($slo_comp_sub_char3.equalsIgnoreCase(name)) {
			slo_comp_sub_char3(value);
			return;
		}
		if ($qtn_comp_rmrks.equalsIgnoreCase(name)) {
			qtn_comp_rmrks(value);
			return;
		}
		if ($qtn_comp_sub_char1.equalsIgnoreCase(name)) {
			qtn_comp_sub_char1(value);
			return;
		}
		if ($qtn_comp_sub_char2.equalsIgnoreCase(name)) {
			qtn_comp_sub_char2(value);
			return;
		}
		if ($qtn_comp_sub_char3.equalsIgnoreCase(name)) {
			qtn_comp_sub_char3(value);
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
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost_amt.equalsIgnoreCase(name)) {
			std_cost_amt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost_amt.equalsIgnoreCase(name)) {
			std_cost_amt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost_amt.equalsIgnoreCase(name)) {
			std_cost_amt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost_amt.equalsIgnoreCase(name)) {
			std_cost_amt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost_amt.equalsIgnoreCase(name)) {
			std_cost_amt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($core_itm_flg.equalsIgnoreCase(name)) {
			core_itm_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($mst_flg.equalsIgnoreCase(name)) {
			mst_flg(value);
			return;
		}
		if ($std_comp_flg.equalsIgnoreCase(name)) {
			std_comp_flg(value);
			return;
		}
		if ($seq_flg.equalsIgnoreCase(name)) {
			seq_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($slo_itm_comp_no.equalsIgnoreCase(name)) {
			slo_itm_comp_no(value);
			return;
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			sls_itm_no(value);
			return;
		}
		if ($sls_itm_comp_no.equalsIgnoreCase(name)) {
			sls_itm_comp_no(value);
			return;
		}
		if ($slo_itm_comp_lno.equalsIgnoreCase(name)) {
			slo_itm_comp_lno(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
			return;
		}
		if ($qtn_itm_comp_no.equalsIgnoreCase(name)) {
			qtn_itm_comp_no(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($slo_comp_rmrks.equalsIgnoreCase(name)) {
			slo_comp_rmrks(value);
			return;
		}
		if ($slo_comp_sub_char1.equalsIgnoreCase(name)) {
			slo_comp_sub_char1(value);
			return;
		}
		if ($slo_comp_sub_char2.equalsIgnoreCase(name)) {
			slo_comp_sub_char2(value);
			return;
		}
		if ($slo_comp_sub_char3.equalsIgnoreCase(name)) {
			slo_comp_sub_char3(value);
			return;
		}
		if ($qtn_comp_rmrks.equalsIgnoreCase(name)) {
			qtn_comp_rmrks(value);
			return;
		}
		if ($qtn_comp_sub_char1.equalsIgnoreCase(name)) {
			qtn_comp_sub_char1(value);
			return;
		}
		if ($qtn_comp_sub_char2.equalsIgnoreCase(name)) {
			qtn_comp_sub_char2(value);
			return;
		}
		if ($qtn_comp_sub_char3.equalsIgnoreCase(name)) {
			qtn_comp_sub_char3(value);
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
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost_amt.equalsIgnoreCase(name)) {
			std_cost_amt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost_amt.equalsIgnoreCase(name)) {
			std_cost_amt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost_amt.equalsIgnoreCase(name)) {
			std_cost_amt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost_amt.equalsIgnoreCase(name)) {
			std_cost_amt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($std_cost_amt.equalsIgnoreCase(name)) {
			std_cost_amt(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($core_itm_flg.equalsIgnoreCase(name)) {
			core_itm_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($mst_flg.equalsIgnoreCase(name)) {
			mst_flg(value);
			return;
		}
		if ($std_comp_flg.equalsIgnoreCase(name)) {
			std_comp_flg(value);
			return;
		}
		if ($seq_flg.equalsIgnoreCase(name)) {
			seq_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

