package mcframe.serverMSBB.MSBBL1310;

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
 * ブロック"Chk02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk02_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public static final String $dtl_peg_no = "dtl_peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public static final String $sls_cststk_flg = "sls_cststk_flg";
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
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_d_no = "sls_act_d_no";
	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public static final String $sls_act_d_seq = "sls_act_d_seq";
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
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public static final String $sls_schd_no = "sls_schd_no";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	/**
	 * Update counter (Sales schedule) 更新カウンタ（売上予定）.<p>
	 *
	 */
	public static final String $sls_schd_upd_cntr = "sls_schd_upd_cntr";
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
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public static final String $iv_d_no = "iv_d_no";
	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
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
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
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
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public static final String $ship_pr_upd_cntr = "ship_pr_upd_cntr";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Update counter (Quotation header) 更新カウンタ（見積ヘッダ）.<p>
	 *
	 */
	public static final String $qtn_upd_cntr = "qtn_upd_cntr";
	/**
	 * Update counter (Sales order header) 更新カウンタ（受注ヘッダ）.<p>
	 *
	 */
	public static final String $slo_upd_cntr = "slo_upd_cntr";
	/**
	 * Transaction currency cd. (At amount specification) 取引通貨ＣＤ(金額指定時).<p>
	 *
	 */
	public static final String $src_trd_unit_cd = "src_trd_unit_cd";
	/**
	 * Transaction unit qty. (At amount specification) 取引単位数量(金額指定時).<p>
	 *
	 */
	public static final String $src_trd_unit_qty = "src_trd_unit_qty";
	/**
	 * Unit price at amount specification (Transaction currency) 取引通貨単価(金額指定時).<p>
	 *
	 */
	public static final String $src_trd_cur_upri = "src_trd_cur_upri";
	/**
	 * Amount at amount specification (Transaction currency) 取引通貨金額(金額指定時).<p>
	 *
	 */
	public static final String $src_trd_cur_amt = "src_trd_cur_amt";
	/**
	 * Tax amount at amount specification (Transaction currency) 取引通貨税額(金額指定時).<p>
	 *
	 */
	public static final String $src_trd_cur_tax_amt = "src_trd_cur_tax_amt";
	/**
	 * Tax included amount at amount specification (Transaction currency) 取引通貨税込金額(金額指定時).<p>
	 *
	 */
	public static final String $src_trd_cur_inc_tax_amt = "src_trd_cur_inc_tax_amt";
	/**
	 * Discount amount at amount specification (Transaction currency) 取引通貨値引額(金額指定時).<p>
	 *
	 */
	public static final String $src_trd_cur_dscnt_amt = "src_trd_cur_dscnt_amt";
	/**
	 * Transaction unit number of decimal places (At amount specification) 取引単位小数部有効桁数(金額指定時).<p>
	 *
	 */
	public static final String $src_trd_unit_dec_place = "src_trd_unit_dec_place";
	/**
	 * Transaction unit conversion base qty. (At amount specification) 取引単位分母数量(金額指定時).<p>
	 *
	 */
	public static final String $src_trd_unit_conv_base_qty = "src_trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. (At amount specification) 取引単位換算数量(金額指定時).<p>
	 *
	 */
	public static final String $src_trd_unit_conv_qty = "src_trd_unit_conv_qty";
	/**
	 * Transaction unit rounding type (At amount specification) 取引単位端数処理区分(金額指定時).<p>
	 *
	 */
	public static final String $src_trd_unit_rnd_typ = "src_trd_unit_rnd_typ";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dtl_peg_no_META = createCommonMeta($dtl_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cststk_flg_META = createCommonMeta($sls_cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_act_no_META = createCommonMeta($sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta sls_act_seq_META = createCommonMeta($sls_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta sls_act_d_no_META = createCommonMeta($sls_act_d_no, mcframe.commonMA.meta.MA_META.SLIP_NO);
	public static final MCMeta sls_act_d_seq_META = createCommonMeta($sls_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_schd_no_META = createCommonMeta($sls_schd_no, mcframe.commonMA.meta.MA_META.SLS_SCHD_NO);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta sls_schd_upd_cntr_META = createCommonMeta($sls_schd_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta qtn_d_no_META = createCommonMeta($qtn_d_no, mcframe.commonMA.meta.MA_META.QTN_D_NO);
	public static final MCMeta iv_d_no_META = createCommonMeta($iv_d_no, mcframe.commonMA.meta.MA_META.IV_D_NO);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ship_pr_upd_cntr_META = createCommonMeta($ship_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta qtn_upd_cntr_META = createCommonMeta($qtn_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta slo_upd_cntr_META = createCommonMeta($slo_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta src_trd_unit_cd_META = createCommonMeta($src_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta src_trd_unit_qty_META = createCommonMeta($src_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta src_trd_cur_upri_META = createCommonMeta($src_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_amt_META = createCommonMeta($src_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_tax_amt_META = createCommonMeta($src_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_inc_tax_amt_META = createCommonMeta($src_trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_dscnt_amt_META = createCommonMeta($src_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_unit_dec_place_META = createCommonMeta($src_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta src_trd_unit_conv_base_qty_META = createCommonMeta($src_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta src_trd_unit_conv_qty_META = createCommonMeta($src_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta src_trd_unit_rnd_typ_META = createCommonMeta($src_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Chk02_DtlR> constMetas = new ConstMetaList<Chk02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			dtl_peg_no_META,
			err_flg_META,
			abort_flg_META,
			sls_cststk_flg_META,
			sls_act_no_META,
			sls_act_seq_META,
			sls_act_d_no_META,
			sls_act_d_seq_META,
			trd_unit_cd_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_qty_META,
			trd_cur_upri_META,
			sls_schd_no_META,
			ship_schd_no_META,
			ship_pr_no_META,
			sls_schd_upd_cntr_META,
			slo_d_no_META,
			qtn_d_no_META,
			iv_d_no_META,
			trd_cur_dscnt_amt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			tax_cd_META,
			tax_rate_META,
			inc_tax_flg_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			ship_pr_upd_cntr_META,
			upd_cntr_META,
			qtn_upd_cntr_META,
			slo_upd_cntr_META,
			src_trd_unit_cd_META,
			src_trd_unit_qty_META,
			src_trd_cur_upri_META,
			src_trd_cur_amt_META,
			src_trd_cur_tax_amt_META,
			src_trd_cur_inc_tax_amt_META,
			src_trd_cur_dscnt_amt_META,
			src_trd_unit_dec_place_META,
			src_trd_unit_conv_base_qty_META,
			src_trd_unit_conv_qty_META,
			src_trd_unit_rnd_typ_META,
			dscnt_itm_flg_META
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
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
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
				{$tax_cd, "MA.MAUAL0010.SlsTax"}	// tax_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "base_unit_cd;base_unit_dec_place;base_unit_rnd_typ"},	// itm_sub3
				{$tax_cd, "tax_rate;inc_tax_flg;tax_typ"}	// tax_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "unit_cd;dec_place;rnd_typ"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
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
	protected Chk02_DtlR_MC_A(ConstMetaList<? extends Chk02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR clone() {
		return (Chk02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR createInstance() {
		return (Chk02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR getValues(String... names) {
		return (Chk02_DtlR) super.getValues(names);
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
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public MCNumber dtl_peg_no() {
		return getConstNumber(offset + 1, $dtl_peg_no);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $dtl_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(int value) {
		setConstNumber(offset + 1, $dtl_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(long value) {
		setConstNumber(offset + 1, $dtl_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(float value) {
		setConstNumber(offset + 1, $dtl_peg_no, value);
	}

	/**
	 * Details pegging No. 明細紐付けＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(double value) {
		setConstNumber(offset + 1, $dtl_peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 3, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 3, $abort_flg, value);
	}


	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public boolean sls_cststk_flg() {
		return getConstBoolean(offset + 4, $sls_cststk_flg);
	}

	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public void sls_cststk_flg(boolean value) {
		setConstBoolean(offset + 4, $sls_cststk_flg, value);
	}


	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public String sls_act_no() {
		return getConstString(offset + 5, $sls_act_no);
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public void sls_act_no(String value) {
		setConstString(offset + 5, $sls_act_no, value);
	}


	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public MCNumber sls_act_seq() {
		return getConstNumber(offset + 6, $sls_act_seq);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(MCNumber value) {
		setConstNumber(offset + 6, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(int value) {
		setConstNumber(offset + 6, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(long value) {
		setConstNumber(offset + 6, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(float value) {
		setConstNumber(offset + 6, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(double value) {
		setConstNumber(offset + 6, $sls_act_seq, value);
	}


	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public String sls_act_d_no() {
		return getConstString(offset + 7, $sls_act_d_no);
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		setConstString(offset + 7, $sls_act_d_no, value);
	}


	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public MCNumber sls_act_d_seq() {
		return getConstNumber(offset + 8, $sls_act_d_seq);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(MCNumber value) {
		setConstNumber(offset + 8, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(int value) {
		setConstNumber(offset + 8, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(long value) {
		setConstNumber(offset + 8, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(float value) {
		setConstNumber(offset + 8, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(double value) {
		setConstNumber(offset + 8, $sls_act_d_seq, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 9, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 9, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 10, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 10, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 10, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 10, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 10, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 10, $trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 11, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 11, $base_unit_cd, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 12, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 12, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 12, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 12, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 12, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 12, $base_unit_qty, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 13, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 13, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 13, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 13, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 13, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 13, $trd_cur_upri, value);
	}


	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public String sls_schd_no() {
		return getConstString(offset + 14, $sls_schd_no);
	}

	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public void sls_schd_no(String value) {
		setConstString(offset + 14, $sls_schd_no, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 15, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 15, $ship_schd_no, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 16, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 16, $ship_pr_no, value);
	}


	/**
	 * Update counter (Sales schedule) 更新カウンタ（売上予定）.<p>
	 *
	 */
	public MCNumber sls_schd_upd_cntr() {
		return getConstNumber(offset + 17, $sls_schd_upd_cntr);
	}

	/**
	 * Update counter (Sales schedule) 更新カウンタ（売上予定）.<p>
	 *
	 */
	public void sls_schd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 17, $sls_schd_upd_cntr, value);
	}

	/**
	 * Update counter (Sales schedule) 更新カウンタ（売上予定）.<p>
	 *
	 */
	public void sls_schd_upd_cntr(int value) {
		setConstNumber(offset + 17, $sls_schd_upd_cntr, value);
	}

	/**
	 * Update counter (Sales schedule) 更新カウンタ（売上予定）.<p>
	 *
	 */
	public void sls_schd_upd_cntr(long value) {
		setConstNumber(offset + 17, $sls_schd_upd_cntr, value);
	}

	/**
	 * Update counter (Sales schedule) 更新カウンタ（売上予定）.<p>
	 *
	 */
	public void sls_schd_upd_cntr(float value) {
		setConstNumber(offset + 17, $sls_schd_upd_cntr, value);
	}

	/**
	 * Update counter (Sales schedule) 更新カウンタ（売上予定）.<p>
	 *
	 */
	public void sls_schd_upd_cntr(double value) {
		setConstNumber(offset + 17, $sls_schd_upd_cntr, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 18, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 18, $slo_d_no, value);
	}


	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public String qtn_d_no() {
		return getConstString(offset + 19, $qtn_d_no);
	}

	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public void qtn_d_no(String value) {
		setConstString(offset + 19, $qtn_d_no, value);
	}


	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return getConstString(offset + 20, $iv_d_no);
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		setConstString(offset + 20, $iv_d_no, value);
	}


	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 21, $trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 21, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 21, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 21, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 21, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 21, $trd_cur_dscnt_amt, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 22, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 22, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 23, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 23, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 24, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 24, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 25, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 25, $itm_sub3, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 26, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 26, $tax_cd, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 27, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 27, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 27, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 27, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 27, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 27, $tax_rate, value);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 28, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 28, $inc_tax_flg, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 29, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 30, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 30, $base_unit_rnd_typ, value);
	}


	/**
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public MCNumber ship_pr_upd_cntr() {
		return getConstNumber(offset + 31, $ship_pr_upd_cntr);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public void ship_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 31, $ship_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public void ship_pr_upd_cntr(int value) {
		setConstNumber(offset + 31, $ship_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public void ship_pr_upd_cntr(long value) {
		setConstNumber(offset + 31, $ship_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public void ship_pr_upd_cntr(float value) {
		setConstNumber(offset + 31, $ship_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public void ship_pr_upd_cntr(double value) {
		setConstNumber(offset + 31, $ship_pr_upd_cntr, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 32, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}


	/**
	 * Update counter (Quotation header) 更新カウンタ（見積ヘッダ）.<p>
	 *
	 */
	public MCNumber qtn_upd_cntr() {
		return getConstNumber(offset + 33, $qtn_upd_cntr);
	}

	/**
	 * Update counter (Quotation header) 更新カウンタ（見積ヘッダ）.<p>
	 *
	 */
	public void qtn_upd_cntr(MCNumber value) {
		setConstNumber(offset + 33, $qtn_upd_cntr, value);
	}

	/**
	 * Update counter (Quotation header) 更新カウンタ（見積ヘッダ）.<p>
	 *
	 */
	public void qtn_upd_cntr(int value) {
		setConstNumber(offset + 33, $qtn_upd_cntr, value);
	}

	/**
	 * Update counter (Quotation header) 更新カウンタ（見積ヘッダ）.<p>
	 *
	 */
	public void qtn_upd_cntr(long value) {
		setConstNumber(offset + 33, $qtn_upd_cntr, value);
	}

	/**
	 * Update counter (Quotation header) 更新カウンタ（見積ヘッダ）.<p>
	 *
	 */
	public void qtn_upd_cntr(float value) {
		setConstNumber(offset + 33, $qtn_upd_cntr, value);
	}

	/**
	 * Update counter (Quotation header) 更新カウンタ（見積ヘッダ）.<p>
	 *
	 */
	public void qtn_upd_cntr(double value) {
		setConstNumber(offset + 33, $qtn_upd_cntr, value);
	}


	/**
	 * Update counter (Sales order header) 更新カウンタ（受注ヘッダ）.<p>
	 *
	 */
	public MCNumber slo_upd_cntr() {
		return getConstNumber(offset + 34, $slo_upd_cntr);
	}

	/**
	 * Update counter (Sales order header) 更新カウンタ（受注ヘッダ）.<p>
	 *
	 */
	public void slo_upd_cntr(MCNumber value) {
		setConstNumber(offset + 34, $slo_upd_cntr, value);
	}

	/**
	 * Update counter (Sales order header) 更新カウンタ（受注ヘッダ）.<p>
	 *
	 */
	public void slo_upd_cntr(int value) {
		setConstNumber(offset + 34, $slo_upd_cntr, value);
	}

	/**
	 * Update counter (Sales order header) 更新カウンタ（受注ヘッダ）.<p>
	 *
	 */
	public void slo_upd_cntr(long value) {
		setConstNumber(offset + 34, $slo_upd_cntr, value);
	}

	/**
	 * Update counter (Sales order header) 更新カウンタ（受注ヘッダ）.<p>
	 *
	 */
	public void slo_upd_cntr(float value) {
		setConstNumber(offset + 34, $slo_upd_cntr, value);
	}

	/**
	 * Update counter (Sales order header) 更新カウンタ（受注ヘッダ）.<p>
	 *
	 */
	public void slo_upd_cntr(double value) {
		setConstNumber(offset + 34, $slo_upd_cntr, value);
	}


	/**
	 * Transaction currency cd. (At amount specification) 取引通貨ＣＤ(金額指定時).<p>
	 *
	 */
	public String src_trd_unit_cd() {
		return getConstString(offset + 35, $src_trd_unit_cd);
	}

	/**
	 * Transaction currency cd. (At amount specification) 取引通貨ＣＤ(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_cd(String value) {
		setConstString(offset + 35, $src_trd_unit_cd, value);
	}


	/**
	 * Transaction unit qty. (At amount specification) 取引単位数量(金額指定時).<p>
	 *
	 */
	public MCNumber src_trd_unit_qty() {
		return getConstNumber(offset + 36, $src_trd_unit_qty);
	}

	/**
	 * Transaction unit qty. (At amount specification) 取引単位数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 36, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. (At amount specification) 取引単位数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_qty(int value) {
		setConstNumber(offset + 36, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. (At amount specification) 取引単位数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_qty(long value) {
		setConstNumber(offset + 36, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. (At amount specification) 取引単位数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_qty(float value) {
		setConstNumber(offset + 36, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. (At amount specification) 取引単位数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_qty(double value) {
		setConstNumber(offset + 36, $src_trd_unit_qty, value);
	}


	/**
	 * Unit price at amount specification (Transaction currency) 取引通貨単価(金額指定時).<p>
	 *
	 */
	public MCNumber src_trd_cur_upri() {
		return getConstNumber(offset + 37, $src_trd_cur_upri);
	}

	/**
	 * Unit price at amount specification (Transaction currency) 取引通貨単価(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 37, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at amount specification (Transaction currency) 取引通貨単価(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_upri(int value) {
		setConstNumber(offset + 37, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at amount specification (Transaction currency) 取引通貨単価(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_upri(long value) {
		setConstNumber(offset + 37, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at amount specification (Transaction currency) 取引通貨単価(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_upri(float value) {
		setConstNumber(offset + 37, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at amount specification (Transaction currency) 取引通貨単価(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_upri(double value) {
		setConstNumber(offset + 37, $src_trd_cur_upri, value);
	}


	/**
	 * Amount at amount specification (Transaction currency) 取引通貨金額(金額指定時).<p>
	 *
	 */
	public MCNumber src_trd_cur_amt() {
		return getConstNumber(offset + 38, $src_trd_cur_amt);
	}

	/**
	 * Amount at amount specification (Transaction currency) 取引通貨金額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 38, $src_trd_cur_amt, value);
	}

	/**
	 * Amount at amount specification (Transaction currency) 取引通貨金額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_amt(int value) {
		setConstNumber(offset + 38, $src_trd_cur_amt, value);
	}

	/**
	 * Amount at amount specification (Transaction currency) 取引通貨金額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_amt(long value) {
		setConstNumber(offset + 38, $src_trd_cur_amt, value);
	}

	/**
	 * Amount at amount specification (Transaction currency) 取引通貨金額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_amt(float value) {
		setConstNumber(offset + 38, $src_trd_cur_amt, value);
	}

	/**
	 * Amount at amount specification (Transaction currency) 取引通貨金額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_amt(double value) {
		setConstNumber(offset + 38, $src_trd_cur_amt, value);
	}


	/**
	 * Tax amount at amount specification (Transaction currency) 取引通貨税額(金額指定時).<p>
	 *
	 */
	public MCNumber src_trd_cur_tax_amt() {
		return getConstNumber(offset + 39, $src_trd_cur_tax_amt);
	}

	/**
	 * Tax amount at amount specification (Transaction currency) 取引通貨税額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 39, $src_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount at amount specification (Transaction currency) 取引通貨税額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 39, $src_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount at amount specification (Transaction currency) 取引通貨税額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 39, $src_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount at amount specification (Transaction currency) 取引通貨税額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 39, $src_trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount at amount specification (Transaction currency) 取引通貨税額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 39, $src_trd_cur_tax_amt, value);
	}


	/**
	 * Tax included amount at amount specification (Transaction currency) 取引通貨税込金額(金額指定時).<p>
	 *
	 */
	public MCNumber src_trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 40, $src_trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount at amount specification (Transaction currency) 取引通貨税込金額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 40, $src_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount at amount specification (Transaction currency) 取引通貨税込金額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 40, $src_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount at amount specification (Transaction currency) 取引通貨税込金額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 40, $src_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount at amount specification (Transaction currency) 取引通貨税込金額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 40, $src_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount at amount specification (Transaction currency) 取引通貨税込金額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 40, $src_trd_cur_inc_tax_amt, value);
	}


	/**
	 * Discount amount at amount specification (Transaction currency) 取引通貨値引額(金額指定時).<p>
	 *
	 */
	public MCNumber src_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 41, $src_trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount at amount specification (Transaction currency) 取引通貨値引額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 41, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at amount specification (Transaction currency) 取引通貨値引額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 41, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at amount specification (Transaction currency) 取引通貨値引額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 41, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at amount specification (Transaction currency) 取引通貨値引額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 41, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at amount specification (Transaction currency) 取引通貨値引額(金額指定時).<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 41, $src_trd_cur_dscnt_amt, value);
	}


	/**
	 * Transaction unit number of decimal places (At amount specification) 取引単位小数部有効桁数(金額指定時).<p>
	 *
	 */
	public MCNumber src_trd_unit_dec_place() {
		return getConstNumber(offset + 42, $src_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places (At amount specification) 取引単位小数部有効桁数(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 42, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places (At amount specification) 取引単位小数部有効桁数(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_dec_place(int value) {
		setConstNumber(offset + 42, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places (At amount specification) 取引単位小数部有効桁数(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_dec_place(long value) {
		setConstNumber(offset + 42, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places (At amount specification) 取引単位小数部有効桁数(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_dec_place(float value) {
		setConstNumber(offset + 42, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places (At amount specification) 取引単位小数部有効桁数(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_dec_place(double value) {
		setConstNumber(offset + 42, $src_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit conversion base qty. (At amount specification) 取引単位分母数量(金額指定時).<p>
	 *
	 */
	public MCNumber src_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 43, $src_trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. (At amount specification) 取引単位分母数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 43, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. (At amount specification) 取引単位分母数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 43, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. (At amount specification) 取引単位分母数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 43, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. (At amount specification) 取引単位分母数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 43, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. (At amount specification) 取引単位分母数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 43, $src_trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. (At amount specification) 取引単位換算数量(金額指定時).<p>
	 *
	 */
	public MCNumber src_trd_unit_conv_qty() {
		return getConstNumber(offset + 44, $src_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. (At amount specification) 取引単位換算数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 44, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. (At amount specification) 取引単位換算数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 44, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. (At amount specification) 取引単位換算数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 44, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. (At amount specification) 取引単位換算数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 44, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. (At amount specification) 取引単位換算数量(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 44, $src_trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit rounding type (At amount specification) 取引単位端数処理区分(金額指定時).<p>
	 *
	 */
	public String src_trd_unit_rnd_typ() {
		return getConstString(offset + 45, $src_trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type (At amount specification) 取引単位端数処理区分(金額指定時).<p>
	 *
	 */
	public void src_trd_unit_rnd_typ(String value) {
		setConstString(offset + 45, $src_trd_unit_rnd_typ, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 46, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 46, $dscnt_itm_flg, value);
	}


	public String getString(String name) {
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			return sls_schd_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			return src_trd_unit_cd();
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return src_trd_unit_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			return sls_act_seq();
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			return sls_act_d_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($sls_schd_upd_cntr.equalsIgnoreCase(name)) {
			return sls_schd_upd_cntr();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			return qtn_upd_cntr();
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			return slo_upd_cntr();
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_qty();
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_upri();
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_amt();
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_tax_amt();
		}
		if ($src_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_inc_tax_amt();
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_dscnt_amt();
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return src_trd_unit_dec_place();
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_base_qty();
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_qty();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			return sls_schd_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			return src_trd_unit_cd();
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return src_trd_unit_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			return sls_act_seq();
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			return sls_act_d_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($sls_schd_upd_cntr.equalsIgnoreCase(name)) {
			return sls_schd_upd_cntr();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			return qtn_upd_cntr();
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			return slo_upd_cntr();
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_qty();
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_upri();
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_amt();
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_tax_amt();
		}
		if ($src_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_inc_tax_amt();
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_dscnt_amt();
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return src_trd_unit_dec_place();
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_base_qty();
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_qty();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
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
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			sls_schd_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
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
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			src_trd_unit_cd(value);
			return;
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			src_trd_unit_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($sls_schd_upd_cntr.equalsIgnoreCase(name)) {
			sls_schd_upd_cntr(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($sls_schd_upd_cntr.equalsIgnoreCase(name)) {
			sls_schd_upd_cntr(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($sls_schd_upd_cntr.equalsIgnoreCase(name)) {
			sls_schd_upd_cntr(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($sls_schd_upd_cntr.equalsIgnoreCase(name)) {
			sls_schd_upd_cntr(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($sls_schd_upd_cntr.equalsIgnoreCase(name)) {
			sls_schd_upd_cntr(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
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
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			sls_schd_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
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
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			src_trd_unit_cd(value);
			return;
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			src_trd_unit_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($sls_schd_upd_cntr.equalsIgnoreCase(name)) {
			sls_schd_upd_cntr(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($sls_schd_upd_cntr.equalsIgnoreCase(name)) {
			sls_schd_upd_cntr(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($sls_schd_upd_cntr.equalsIgnoreCase(name)) {
			sls_schd_upd_cntr(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($sls_schd_upd_cntr.equalsIgnoreCase(name)) {
			sls_schd_upd_cntr(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($sls_schd_upd_cntr.equalsIgnoreCase(name)) {
			sls_schd_upd_cntr(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
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
		super.setBooleanNE(name, value);
	}



}

