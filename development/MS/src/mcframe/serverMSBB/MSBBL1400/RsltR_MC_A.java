package mcframe.serverMSBB.MSBBL1400;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Data type データタイプ.<p>
	 *
	 */
	public static final String $data_typ = "data_typ";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public static final String $dpt_lvl_cd = "dpt_lvl_cd";
	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public static final String $dpt_lvl_nm = "dpt_lvl_nm";
	/**
	 * Dept. cd. 1 部門ＣＤ１.<p>
	 *
	 */
	public static final String $dpt1 = "dpt1";
	/**
	 * Dept. name 1 部門名１.<p>
	 *
	 */
	public static final String $dpt_nm1 = "dpt_nm1";
	/**
	 * Dept. cd. 2 部門ＣＤ２.<p>
	 *
	 */
	public static final String $dpt2 = "dpt2";
	/**
	 * Dept. name 2 部門名２.<p>
	 *
	 */
	public static final String $dpt_nm2 = "dpt_nm2";
	/**
	 * Item system cd. 1 品目体系ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp1 = "itm_grp1";
	/**
	 * Item system name 1 品目体系名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item system cd. 2 品目体系ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp2 = "itm_grp2";
	/**
	 * Item system name 2 品目体系名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public static final String $sls_usr_nm = "sls_usr_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
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
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public static final String $slo_qty = "slo_qty";
	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public static final String $slo_amt = "slo_amt";
	/**
	 * Sales order gross profit amount 受注粗利額.<p>
	 *
	 */
	public static final String $slo_prof_amt = "slo_prof_amt";
	/**
	 * Sales order gross profit rate 受注粗利率.<p>
	 *
	 */
	public static final String $slo_prof_rate = "slo_prof_rate";
	/**
	 * Sales order qty. progress rate (Plan) 受注数量進捗率（計画）.<p>
	 *
	 */
	public static final String $spln_per_cmpl_slo_qty = "spln_per_cmpl_slo_qty";
	/**
	 * Sales order amount progress rate (Plan) 受注金額進捗率（計画）.<p>
	 *
	 */
	public static final String $spln_per_cmpl_slo_amt = "spln_per_cmpl_slo_amt";
	/**
	 * Sales order amount progress rate (Budget) 受注金額進捗率（予算）.<p>
	 *
	 */
	public static final String $bdg_per_cmpl_slo_amt = "bdg_per_cmpl_slo_amt";
	/**
	 * Sales order gross profit progress rate (Budget) 受注粗利進捗率（予算）.<p>
	 *
	 */
	public static final String $bdg_per_cmpl_slo_prof_amt = "bdg_per_cmpl_slo_prof_amt";
	/**
	 * Sales order backlog qty. 受注残数量.<p>
	 *
	 */
	public static final String $slo_bl_qty = "slo_bl_qty";
	/**
	 * Sales order backlog amount 受注残金額.<p>
	 *
	 */
	public static final String $slo_bl_amt = "slo_bl_amt";
	/**
	 * Sales order backlog gross profit amount 受注残粗利額.<p>
	 *
	 */
	public static final String $slo_bl_prof_amt = "slo_bl_prof_amt";
	/**
	 * Sales order backlog gross profit rate 受注残粗利率.<p>
	 *
	 */
	public static final String $slo_bl_prof_rate = "slo_bl_prof_rate";
	/**
	 * Sales order backlog qty. progress rate (Plan) 受注残数量進捗率（計画）.<p>
	 *
	 */
	public static final String $spln_per_cmpl_slo_bl_qty = "spln_per_cmpl_slo_bl_qty";
	/**
	 * Sales order backlog amount progress rate (Plan) 受注残金額進捗率（計画）.<p>
	 *
	 */
	public static final String $spln_per_cmpl_slo_bl_amt = "spln_per_cmpl_slo_bl_amt";
	/**
	 * Sales order backlog amount progress rate (Budget) 受注残金額進捗率（予算）.<p>
	 *
	 */
	public static final String $bdg_per_cmpl_slo_bl_amt = "bdg_per_cmpl_slo_bl_amt";
	/**
	 * Sales order backlog gross profit progress rate (Budget) 受注残粗利進捗率（予算）.<p>
	 *
	 */
	public static final String $bdg_per_cmpl_slo_bl_prof_amt = "bdg_per_cmpl_slo_bl_prof_amt";
	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public static final String $sls_qty = "sls_qty";
	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	/**
	 * Gross profit 売上粗利額.<p>
	 *
	 */
	public static final String $sls_prof_amt = "sls_prof_amt";
	/**
	 * Gross margin 売上粗利率.<p>
	 *
	 */
	public static final String $sls_prof_rate = "sls_prof_rate";
	/**
	 * Total qty. 合計数量.<p>
	 *
	 */
	public static final String $sum_qty = "sum_qty";
	/**
	 * Total amount 合計金額.<p>
	 *
	 */
	public static final String $sum_amt = "sum_amt";
	/**
	 * Total gross profit amount 合計粗利額.<p>
	 *
	 */
	public static final String $sum_prof_amt = "sum_prof_amt";
	/**
	 * Total gross profit rate 合計粗利率.<p>
	 *
	 */
	public static final String $sum_prof_rate = "sum_prof_rate";
	/**
	 * Total qty. progress rate (Plan) 合計数量進捗率（計画）.<p>
	 *
	 */
	public static final String $spln_per_cmpl_sum_qty = "spln_per_cmpl_sum_qty";
	/**
	 * Total amount progress rate (Plan) 合計金額進捗率（計画）.<p>
	 *
	 */
	public static final String $spln_per_cmpl_sum_amt = "spln_per_cmpl_sum_amt";
	/**
	 * Total amount progress rate (Budget) 合計金額進捗率（予算）.<p>
	 *
	 */
	public static final String $bdg_per_cmpl_sum_amt = "bdg_per_cmpl_sum_amt";
	/**
	 * Total gross profit progress rate (Budget) 合計粗利進捗率（予算）.<p>
	 *
	 */
	public static final String $bdg_per_cmpl_sum_prof_amt = "bdg_per_cmpl_sum_prof_amt";
	/**
	 * Sales plan qty. 販売計画数量.<p>
	 *
	 */
	public static final String $spln_qty = "spln_qty";
	/**
	 * Sales plan amount 販売計画金額.<p>
	 *
	 */
	public static final String $spln_amt = "spln_amt";
	/**
	 * Sales volume progress rate (plan) 売上数量進捗率（計画）.<p>
	 *
	 */
	public static final String $spln_per_cmpl_sls_qty = "spln_per_cmpl_sls_qty";
	/**
	 * Sales amount Progress rate (plan) 売上金額進捗率（計画）.<p>
	 *
	 */
	public static final String $spln_per_cmpl_sls_amt = "spln_per_cmpl_sls_amt";
	/**
	 * Budget sales amount 予算売上金額.<p>
	 *
	 */
	public static final String $bdg_sls_amt = "bdg_sls_amt";
	/**
	 * Budget sales gross profit 予算売上粗利額.<p>
	 *
	 */
	public static final String $bdg_sls_prof_amt = "bdg_sls_prof_amt";
	/**
	 * Budget sales gross profit rate 予算売上粗利率.<p>
	 *
	 */
	public static final String $bdg_sls_prof_rate = "bdg_sls_prof_rate";
	/**
	 * Sales amount Progress rate (budget) 売上金額進捗率（予算）.<p>
	 *
	 */
	public static final String $bdg_per_cmpl_sls_amt = "bdg_per_cmpl_sls_amt";
	/**
	 * Gross profit progress rate (budget) 売上粗利進捗率（予算）.<p>
	 *
	 */
	public static final String $bdg_per_cmpl_sls_prof_amt = "bdg_per_cmpl_sls_prof_amt";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Rate number of decimal places 率小数部有効桁数.<p>
	 *
	 */
	public static final String $rate_dec_place = "rate_dec_place";


	public static final MCMeta data_typ_META = createStringMeta($data_typ);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dpt_lvl_cd_META = createCommonMeta($dpt_lvl_cd, mcframe.commonMA.meta.MA_META.DPT_LVL_CD);
	public static final MCMeta dpt_lvl_nm_META = createCommonMeta($dpt_lvl_nm, mcframe.commonMA.meta.MA_META.DPT_LVL_NM);
	public static final MCMeta dpt1_META = createCommonMeta($dpt1, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm1_META = createCommonMeta($dpt_nm1, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt2_META = createCommonMeta($dpt2, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm2_META = createCommonMeta($dpt_nm2, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta itm_grp1_META = createCommonMeta($itm_grp1, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_NM);
	public static final MCMeta itm_grp2_META = createCommonMeta($itm_grp2, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_NM);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_usr_nm_META = createCommonMeta($sls_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta slo_qty_META = createCommonMeta($slo_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta slo_amt_META = createCommonMeta($slo_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_prof_amt_META = createCommonMeta($slo_prof_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_prof_rate_META = createCommonMeta($slo_prof_rate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta spln_per_cmpl_slo_qty_META = createCommonMeta($spln_per_cmpl_slo_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta spln_per_cmpl_slo_amt_META = createCommonMeta($spln_per_cmpl_slo_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bdg_per_cmpl_slo_amt_META = createCommonMeta($bdg_per_cmpl_slo_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bdg_per_cmpl_slo_prof_amt_META = createCommonMeta($bdg_per_cmpl_slo_prof_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_bl_qty_META = createCommonMeta($slo_bl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta slo_bl_amt_META = createCommonMeta($slo_bl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_bl_prof_amt_META = createCommonMeta($slo_bl_prof_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_bl_prof_rate_META = createCommonMeta($slo_bl_prof_rate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta spln_per_cmpl_slo_bl_qty_META = createCommonMeta($spln_per_cmpl_slo_bl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta spln_per_cmpl_slo_bl_amt_META = createCommonMeta($spln_per_cmpl_slo_bl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bdg_per_cmpl_slo_bl_amt_META = createCommonMeta($bdg_per_cmpl_slo_bl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bdg_per_cmpl_slo_bl_prof_amt_META = createCommonMeta($bdg_per_cmpl_slo_bl_prof_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_qty_META = createCommonMeta($sls_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_prof_amt_META = createCommonMeta($sls_prof_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_prof_rate_META = createCommonMeta($sls_prof_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta sum_qty_META = createCommonMeta($sum_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_amt_META = createCommonMeta($sum_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sum_prof_amt_META = createCommonMeta($sum_prof_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sum_prof_rate_META = createCommonMeta($sum_prof_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta spln_per_cmpl_sum_qty_META = createCommonMeta($spln_per_cmpl_sum_qty, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta spln_per_cmpl_sum_amt_META = createCommonMeta($spln_per_cmpl_sum_amt, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta bdg_per_cmpl_sum_amt_META = createCommonMeta($bdg_per_cmpl_sum_amt, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta bdg_per_cmpl_sum_prof_amt_META = createCommonMeta($bdg_per_cmpl_sum_prof_amt, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta spln_qty_META = createCommonMeta($spln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta spln_amt_META = createCommonMeta($spln_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta spln_per_cmpl_sls_qty_META = createCommonMeta($spln_per_cmpl_sls_qty, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta spln_per_cmpl_sls_amt_META = createCommonMeta($spln_per_cmpl_sls_amt, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta bdg_sls_amt_META = createCommonMeta($bdg_sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bdg_sls_prof_amt_META = createCommonMeta($bdg_sls_prof_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bdg_sls_prof_rate_META = createCommonMeta($bdg_sls_prof_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta bdg_per_cmpl_sls_amt_META = createCommonMeta($bdg_per_cmpl_sls_amt, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta bdg_per_cmpl_sls_prof_amt_META = createCommonMeta($bdg_per_cmpl_sls_prof_amt, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rate_dec_place_META = createCommonMeta($rate_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_typ_META,
			ym_META,
			dpt_lvl_cd_META,
			dpt_lvl_nm_META,
			dpt1_META,
			dpt_nm1_META,
			dpt2_META,
			dpt_nm2_META,
			itm_grp1_META,
			itm_grp_nm1_META,
			itm_grp2_META,
			itm_grp_nm2_META,
			sls_usr_cd_META,
			sls_usr_nm_META,
			cst_cd_META,
			cst_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			slo_qty_META,
			slo_amt_META,
			slo_prof_amt_META,
			slo_prof_rate_META,
			spln_per_cmpl_slo_qty_META,
			spln_per_cmpl_slo_amt_META,
			bdg_per_cmpl_slo_amt_META,
			bdg_per_cmpl_slo_prof_amt_META,
			slo_bl_qty_META,
			slo_bl_amt_META,
			slo_bl_prof_amt_META,
			slo_bl_prof_rate_META,
			spln_per_cmpl_slo_bl_qty_META,
			spln_per_cmpl_slo_bl_amt_META,
			bdg_per_cmpl_slo_bl_amt_META,
			bdg_per_cmpl_slo_bl_prof_amt_META,
			sls_qty_META,
			sls_amt_META,
			sls_prof_amt_META,
			sls_prof_rate_META,
			sum_qty_META,
			sum_amt_META,
			sum_prof_amt_META,
			sum_prof_rate_META,
			spln_per_cmpl_sum_qty_META,
			spln_per_cmpl_sum_amt_META,
			bdg_per_cmpl_sum_amt_META,
			bdg_per_cmpl_sum_prof_amt_META,
			spln_qty_META,
			spln_amt_META,
			spln_per_cmpl_sls_qty_META,
			spln_per_cmpl_sls_amt_META,
			bdg_sls_amt_META,
			bdg_sls_prof_amt_META,
			bdg_sls_prof_rate_META,
			bdg_per_cmpl_sls_amt_META,
			bdg_per_cmpl_sls_prof_amt_META,
			base_unit_dec_place_META,
			amt_dec_place_META,
			rate_dec_place_META
		},
		new String[][]{
			{
			},
			{
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data type データタイプ.<p>
	 *
	 */
	public String data_typ() {
		return getConstString(offset + 0, $data_typ);
	}

	/**
	 * Data type データタイプ.<p>
	 *
	 */
	public void data_typ(String value) {
		setConstString(offset + 0, $data_typ, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 1, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 1, $ym, value);
	}


	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public String dpt_lvl_cd() {
		return getConstString(offset + 2, $dpt_lvl_cd);
	}

	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public void dpt_lvl_cd(String value) {
		setConstString(offset + 2, $dpt_lvl_cd, value);
	}


	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public String dpt_lvl_nm() {
		return getConstString(offset + 3, $dpt_lvl_nm);
	}

	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public void dpt_lvl_nm(String value) {
		setConstString(offset + 3, $dpt_lvl_nm, value);
	}


	/**
	 * Dept. cd. 1 部門ＣＤ１.<p>
	 *
	 */
	public String dpt1() {
		return getConstString(offset + 4, $dpt1);
	}

	/**
	 * Dept. cd. 1 部門ＣＤ１.<p>
	 *
	 */
	public void dpt1(String value) {
		setConstString(offset + 4, $dpt1, value);
	}


	/**
	 * Dept. name 1 部門名１.<p>
	 *
	 */
	public String dpt_nm1() {
		return getConstString(offset + 5, $dpt_nm1);
	}

	/**
	 * Dept. name 1 部門名１.<p>
	 *
	 */
	public void dpt_nm1(String value) {
		setConstString(offset + 5, $dpt_nm1, value);
	}


	/**
	 * Dept. cd. 2 部門ＣＤ２.<p>
	 *
	 */
	public String dpt2() {
		return getConstString(offset + 6, $dpt2);
	}

	/**
	 * Dept. cd. 2 部門ＣＤ２.<p>
	 *
	 */
	public void dpt2(String value) {
		setConstString(offset + 6, $dpt2, value);
	}


	/**
	 * Dept. name 2 部門名２.<p>
	 *
	 */
	public String dpt_nm2() {
		return getConstString(offset + 7, $dpt_nm2);
	}

	/**
	 * Dept. name 2 部門名２.<p>
	 *
	 */
	public void dpt_nm2(String value) {
		setConstString(offset + 7, $dpt_nm2, value);
	}


	/**
	 * Item system cd. 1 品目体系ＣＤ１.<p>
	 *
	 */
	public String itm_grp1() {
		return getConstString(offset + 8, $itm_grp1);
	}

	/**
	 * Item system cd. 1 品目体系ＣＤ１.<p>
	 *
	 */
	public void itm_grp1(String value) {
		setConstString(offset + 8, $itm_grp1, value);
	}


	/**
	 * Item system name 1 品目体系名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 9, $itm_grp_nm1);
	}

	/**
	 * Item system name 1 品目体系名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 9, $itm_grp_nm1, value);
	}


	/**
	 * Item system cd. 2 品目体系ＣＤ２.<p>
	 *
	 */
	public String itm_grp2() {
		return getConstString(offset + 10, $itm_grp2);
	}

	/**
	 * Item system cd. 2 品目体系ＣＤ２.<p>
	 *
	 */
	public void itm_grp2(String value) {
		setConstString(offset + 10, $itm_grp2, value);
	}


	/**
	 * Item system name 2 品目体系名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 11, $itm_grp_nm2);
	}

	/**
	 * Item system name 2 品目体系名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 11, $itm_grp_nm2, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 12, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 12, $sls_usr_cd, value);
	}


	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 13, $sls_usr_nm);
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 13, $sls_usr_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 14, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 14, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 15, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 15, $cst_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 16, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 16, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 17, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 17, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 18, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 18, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 19, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 19, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 20, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 20, $itm_nm, value);
	}


	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public MCNumber slo_qty() {
		return getConstNumber(offset + 21, $slo_qty);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(MCNumber value) {
		setConstNumber(offset + 21, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(int value) {
		setConstNumber(offset + 21, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(long value) {
		setConstNumber(offset + 21, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(float value) {
		setConstNumber(offset + 21, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(double value) {
		setConstNumber(offset + 21, $slo_qty, value);
	}


	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public MCNumber slo_amt() {
		return getConstNumber(offset + 22, $slo_amt);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(MCNumber value) {
		setConstNumber(offset + 22, $slo_amt, value);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(int value) {
		setConstNumber(offset + 22, $slo_amt, value);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(long value) {
		setConstNumber(offset + 22, $slo_amt, value);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(float value) {
		setConstNumber(offset + 22, $slo_amt, value);
	}

	/**
	 * Sales order amount 受注金額.<p>
	 *
	 */
	public void slo_amt(double value) {
		setConstNumber(offset + 22, $slo_amt, value);
	}


	/**
	 * Sales order gross profit amount 受注粗利額.<p>
	 *
	 */
	public MCNumber slo_prof_amt() {
		return getConstNumber(offset + 23, $slo_prof_amt);
	}

	/**
	 * Sales order gross profit amount 受注粗利額.<p>
	 *
	 */
	public void slo_prof_amt(MCNumber value) {
		setConstNumber(offset + 23, $slo_prof_amt, value);
	}

	/**
	 * Sales order gross profit amount 受注粗利額.<p>
	 *
	 */
	public void slo_prof_amt(int value) {
		setConstNumber(offset + 23, $slo_prof_amt, value);
	}

	/**
	 * Sales order gross profit amount 受注粗利額.<p>
	 *
	 */
	public void slo_prof_amt(long value) {
		setConstNumber(offset + 23, $slo_prof_amt, value);
	}

	/**
	 * Sales order gross profit amount 受注粗利額.<p>
	 *
	 */
	public void slo_prof_amt(float value) {
		setConstNumber(offset + 23, $slo_prof_amt, value);
	}

	/**
	 * Sales order gross profit amount 受注粗利額.<p>
	 *
	 */
	public void slo_prof_amt(double value) {
		setConstNumber(offset + 23, $slo_prof_amt, value);
	}


	/**
	 * Sales order gross profit rate 受注粗利率.<p>
	 *
	 */
	public MCNumber slo_prof_rate() {
		return getConstNumber(offset + 24, $slo_prof_rate);
	}

	/**
	 * Sales order gross profit rate 受注粗利率.<p>
	 *
	 */
	public void slo_prof_rate(MCNumber value) {
		setConstNumber(offset + 24, $slo_prof_rate, value);
	}

	/**
	 * Sales order gross profit rate 受注粗利率.<p>
	 *
	 */
	public void slo_prof_rate(int value) {
		setConstNumber(offset + 24, $slo_prof_rate, value);
	}

	/**
	 * Sales order gross profit rate 受注粗利率.<p>
	 *
	 */
	public void slo_prof_rate(long value) {
		setConstNumber(offset + 24, $slo_prof_rate, value);
	}

	/**
	 * Sales order gross profit rate 受注粗利率.<p>
	 *
	 */
	public void slo_prof_rate(float value) {
		setConstNumber(offset + 24, $slo_prof_rate, value);
	}

	/**
	 * Sales order gross profit rate 受注粗利率.<p>
	 *
	 */
	public void slo_prof_rate(double value) {
		setConstNumber(offset + 24, $slo_prof_rate, value);
	}


	/**
	 * Sales order qty. progress rate (Plan) 受注数量進捗率（計画）.<p>
	 *
	 */
	public MCNumber spln_per_cmpl_slo_qty() {
		return getConstNumber(offset + 25, $spln_per_cmpl_slo_qty);
	}

	/**
	 * Sales order qty. progress rate (Plan) 受注数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_qty(MCNumber value) {
		setConstNumber(offset + 25, $spln_per_cmpl_slo_qty, value);
	}

	/**
	 * Sales order qty. progress rate (Plan) 受注数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_qty(int value) {
		setConstNumber(offset + 25, $spln_per_cmpl_slo_qty, value);
	}

	/**
	 * Sales order qty. progress rate (Plan) 受注数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_qty(long value) {
		setConstNumber(offset + 25, $spln_per_cmpl_slo_qty, value);
	}

	/**
	 * Sales order qty. progress rate (Plan) 受注数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_qty(float value) {
		setConstNumber(offset + 25, $spln_per_cmpl_slo_qty, value);
	}

	/**
	 * Sales order qty. progress rate (Plan) 受注数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_qty(double value) {
		setConstNumber(offset + 25, $spln_per_cmpl_slo_qty, value);
	}


	/**
	 * Sales order amount progress rate (Plan) 受注金額進捗率（計画）.<p>
	 *
	 */
	public MCNumber spln_per_cmpl_slo_amt() {
		return getConstNumber(offset + 26, $spln_per_cmpl_slo_amt);
	}

	/**
	 * Sales order amount progress rate (Plan) 受注金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_amt(MCNumber value) {
		setConstNumber(offset + 26, $spln_per_cmpl_slo_amt, value);
	}

	/**
	 * Sales order amount progress rate (Plan) 受注金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_amt(int value) {
		setConstNumber(offset + 26, $spln_per_cmpl_slo_amt, value);
	}

	/**
	 * Sales order amount progress rate (Plan) 受注金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_amt(long value) {
		setConstNumber(offset + 26, $spln_per_cmpl_slo_amt, value);
	}

	/**
	 * Sales order amount progress rate (Plan) 受注金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_amt(float value) {
		setConstNumber(offset + 26, $spln_per_cmpl_slo_amt, value);
	}

	/**
	 * Sales order amount progress rate (Plan) 受注金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_amt(double value) {
		setConstNumber(offset + 26, $spln_per_cmpl_slo_amt, value);
	}


	/**
	 * Sales order amount progress rate (Budget) 受注金額進捗率（予算）.<p>
	 *
	 */
	public MCNumber bdg_per_cmpl_slo_amt() {
		return getConstNumber(offset + 27, $bdg_per_cmpl_slo_amt);
	}

	/**
	 * Sales order amount progress rate (Budget) 受注金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_amt(MCNumber value) {
		setConstNumber(offset + 27, $bdg_per_cmpl_slo_amt, value);
	}

	/**
	 * Sales order amount progress rate (Budget) 受注金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_amt(int value) {
		setConstNumber(offset + 27, $bdg_per_cmpl_slo_amt, value);
	}

	/**
	 * Sales order amount progress rate (Budget) 受注金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_amt(long value) {
		setConstNumber(offset + 27, $bdg_per_cmpl_slo_amt, value);
	}

	/**
	 * Sales order amount progress rate (Budget) 受注金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_amt(float value) {
		setConstNumber(offset + 27, $bdg_per_cmpl_slo_amt, value);
	}

	/**
	 * Sales order amount progress rate (Budget) 受注金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_amt(double value) {
		setConstNumber(offset + 27, $bdg_per_cmpl_slo_amt, value);
	}


	/**
	 * Sales order gross profit progress rate (Budget) 受注粗利進捗率（予算）.<p>
	 *
	 */
	public MCNumber bdg_per_cmpl_slo_prof_amt() {
		return getConstNumber(offset + 28, $bdg_per_cmpl_slo_prof_amt);
	}

	/**
	 * Sales order gross profit progress rate (Budget) 受注粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_prof_amt(MCNumber value) {
		setConstNumber(offset + 28, $bdg_per_cmpl_slo_prof_amt, value);
	}

	/**
	 * Sales order gross profit progress rate (Budget) 受注粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_prof_amt(int value) {
		setConstNumber(offset + 28, $bdg_per_cmpl_slo_prof_amt, value);
	}

	/**
	 * Sales order gross profit progress rate (Budget) 受注粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_prof_amt(long value) {
		setConstNumber(offset + 28, $bdg_per_cmpl_slo_prof_amt, value);
	}

	/**
	 * Sales order gross profit progress rate (Budget) 受注粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_prof_amt(float value) {
		setConstNumber(offset + 28, $bdg_per_cmpl_slo_prof_amt, value);
	}

	/**
	 * Sales order gross profit progress rate (Budget) 受注粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_prof_amt(double value) {
		setConstNumber(offset + 28, $bdg_per_cmpl_slo_prof_amt, value);
	}


	/**
	 * Sales order backlog qty. 受注残数量.<p>
	 *
	 */
	public MCNumber slo_bl_qty() {
		return getConstNumber(offset + 29, $slo_bl_qty);
	}

	/**
	 * Sales order backlog qty. 受注残数量.<p>
	 *
	 */
	public void slo_bl_qty(MCNumber value) {
		setConstNumber(offset + 29, $slo_bl_qty, value);
	}

	/**
	 * Sales order backlog qty. 受注残数量.<p>
	 *
	 */
	public void slo_bl_qty(int value) {
		setConstNumber(offset + 29, $slo_bl_qty, value);
	}

	/**
	 * Sales order backlog qty. 受注残数量.<p>
	 *
	 */
	public void slo_bl_qty(long value) {
		setConstNumber(offset + 29, $slo_bl_qty, value);
	}

	/**
	 * Sales order backlog qty. 受注残数量.<p>
	 *
	 */
	public void slo_bl_qty(float value) {
		setConstNumber(offset + 29, $slo_bl_qty, value);
	}

	/**
	 * Sales order backlog qty. 受注残数量.<p>
	 *
	 */
	public void slo_bl_qty(double value) {
		setConstNumber(offset + 29, $slo_bl_qty, value);
	}


	/**
	 * Sales order backlog amount 受注残金額.<p>
	 *
	 */
	public MCNumber slo_bl_amt() {
		return getConstNumber(offset + 30, $slo_bl_amt);
	}

	/**
	 * Sales order backlog amount 受注残金額.<p>
	 *
	 */
	public void slo_bl_amt(MCNumber value) {
		setConstNumber(offset + 30, $slo_bl_amt, value);
	}

	/**
	 * Sales order backlog amount 受注残金額.<p>
	 *
	 */
	public void slo_bl_amt(int value) {
		setConstNumber(offset + 30, $slo_bl_amt, value);
	}

	/**
	 * Sales order backlog amount 受注残金額.<p>
	 *
	 */
	public void slo_bl_amt(long value) {
		setConstNumber(offset + 30, $slo_bl_amt, value);
	}

	/**
	 * Sales order backlog amount 受注残金額.<p>
	 *
	 */
	public void slo_bl_amt(float value) {
		setConstNumber(offset + 30, $slo_bl_amt, value);
	}

	/**
	 * Sales order backlog amount 受注残金額.<p>
	 *
	 */
	public void slo_bl_amt(double value) {
		setConstNumber(offset + 30, $slo_bl_amt, value);
	}


	/**
	 * Sales order backlog gross profit amount 受注残粗利額.<p>
	 *
	 */
	public MCNumber slo_bl_prof_amt() {
		return getConstNumber(offset + 31, $slo_bl_prof_amt);
	}

	/**
	 * Sales order backlog gross profit amount 受注残粗利額.<p>
	 *
	 */
	public void slo_bl_prof_amt(MCNumber value) {
		setConstNumber(offset + 31, $slo_bl_prof_amt, value);
	}

	/**
	 * Sales order backlog gross profit amount 受注残粗利額.<p>
	 *
	 */
	public void slo_bl_prof_amt(int value) {
		setConstNumber(offset + 31, $slo_bl_prof_amt, value);
	}

	/**
	 * Sales order backlog gross profit amount 受注残粗利額.<p>
	 *
	 */
	public void slo_bl_prof_amt(long value) {
		setConstNumber(offset + 31, $slo_bl_prof_amt, value);
	}

	/**
	 * Sales order backlog gross profit amount 受注残粗利額.<p>
	 *
	 */
	public void slo_bl_prof_amt(float value) {
		setConstNumber(offset + 31, $slo_bl_prof_amt, value);
	}

	/**
	 * Sales order backlog gross profit amount 受注残粗利額.<p>
	 *
	 */
	public void slo_bl_prof_amt(double value) {
		setConstNumber(offset + 31, $slo_bl_prof_amt, value);
	}


	/**
	 * Sales order backlog gross profit rate 受注残粗利率.<p>
	 *
	 */
	public MCNumber slo_bl_prof_rate() {
		return getConstNumber(offset + 32, $slo_bl_prof_rate);
	}

	/**
	 * Sales order backlog gross profit rate 受注残粗利率.<p>
	 *
	 */
	public void slo_bl_prof_rate(MCNumber value) {
		setConstNumber(offset + 32, $slo_bl_prof_rate, value);
	}

	/**
	 * Sales order backlog gross profit rate 受注残粗利率.<p>
	 *
	 */
	public void slo_bl_prof_rate(int value) {
		setConstNumber(offset + 32, $slo_bl_prof_rate, value);
	}

	/**
	 * Sales order backlog gross profit rate 受注残粗利率.<p>
	 *
	 */
	public void slo_bl_prof_rate(long value) {
		setConstNumber(offset + 32, $slo_bl_prof_rate, value);
	}

	/**
	 * Sales order backlog gross profit rate 受注残粗利率.<p>
	 *
	 */
	public void slo_bl_prof_rate(float value) {
		setConstNumber(offset + 32, $slo_bl_prof_rate, value);
	}

	/**
	 * Sales order backlog gross profit rate 受注残粗利率.<p>
	 *
	 */
	public void slo_bl_prof_rate(double value) {
		setConstNumber(offset + 32, $slo_bl_prof_rate, value);
	}


	/**
	 * Sales order backlog qty. progress rate (Plan) 受注残数量進捗率（計画）.<p>
	 *
	 */
	public MCNumber spln_per_cmpl_slo_bl_qty() {
		return getConstNumber(offset + 33, $spln_per_cmpl_slo_bl_qty);
	}

	/**
	 * Sales order backlog qty. progress rate (Plan) 受注残数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_bl_qty(MCNumber value) {
		setConstNumber(offset + 33, $spln_per_cmpl_slo_bl_qty, value);
	}

	/**
	 * Sales order backlog qty. progress rate (Plan) 受注残数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_bl_qty(int value) {
		setConstNumber(offset + 33, $spln_per_cmpl_slo_bl_qty, value);
	}

	/**
	 * Sales order backlog qty. progress rate (Plan) 受注残数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_bl_qty(long value) {
		setConstNumber(offset + 33, $spln_per_cmpl_slo_bl_qty, value);
	}

	/**
	 * Sales order backlog qty. progress rate (Plan) 受注残数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_bl_qty(float value) {
		setConstNumber(offset + 33, $spln_per_cmpl_slo_bl_qty, value);
	}

	/**
	 * Sales order backlog qty. progress rate (Plan) 受注残数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_bl_qty(double value) {
		setConstNumber(offset + 33, $spln_per_cmpl_slo_bl_qty, value);
	}


	/**
	 * Sales order backlog amount progress rate (Plan) 受注残金額進捗率（計画）.<p>
	 *
	 */
	public MCNumber spln_per_cmpl_slo_bl_amt() {
		return getConstNumber(offset + 34, $spln_per_cmpl_slo_bl_amt);
	}

	/**
	 * Sales order backlog amount progress rate (Plan) 受注残金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_bl_amt(MCNumber value) {
		setConstNumber(offset + 34, $spln_per_cmpl_slo_bl_amt, value);
	}

	/**
	 * Sales order backlog amount progress rate (Plan) 受注残金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_bl_amt(int value) {
		setConstNumber(offset + 34, $spln_per_cmpl_slo_bl_amt, value);
	}

	/**
	 * Sales order backlog amount progress rate (Plan) 受注残金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_bl_amt(long value) {
		setConstNumber(offset + 34, $spln_per_cmpl_slo_bl_amt, value);
	}

	/**
	 * Sales order backlog amount progress rate (Plan) 受注残金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_bl_amt(float value) {
		setConstNumber(offset + 34, $spln_per_cmpl_slo_bl_amt, value);
	}

	/**
	 * Sales order backlog amount progress rate (Plan) 受注残金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_slo_bl_amt(double value) {
		setConstNumber(offset + 34, $spln_per_cmpl_slo_bl_amt, value);
	}


	/**
	 * Sales order backlog amount progress rate (Budget) 受注残金額進捗率（予算）.<p>
	 *
	 */
	public MCNumber bdg_per_cmpl_slo_bl_amt() {
		return getConstNumber(offset + 35, $bdg_per_cmpl_slo_bl_amt);
	}

	/**
	 * Sales order backlog amount progress rate (Budget) 受注残金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_bl_amt(MCNumber value) {
		setConstNumber(offset + 35, $bdg_per_cmpl_slo_bl_amt, value);
	}

	/**
	 * Sales order backlog amount progress rate (Budget) 受注残金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_bl_amt(int value) {
		setConstNumber(offset + 35, $bdg_per_cmpl_slo_bl_amt, value);
	}

	/**
	 * Sales order backlog amount progress rate (Budget) 受注残金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_bl_amt(long value) {
		setConstNumber(offset + 35, $bdg_per_cmpl_slo_bl_amt, value);
	}

	/**
	 * Sales order backlog amount progress rate (Budget) 受注残金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_bl_amt(float value) {
		setConstNumber(offset + 35, $bdg_per_cmpl_slo_bl_amt, value);
	}

	/**
	 * Sales order backlog amount progress rate (Budget) 受注残金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_bl_amt(double value) {
		setConstNumber(offset + 35, $bdg_per_cmpl_slo_bl_amt, value);
	}


	/**
	 * Sales order backlog gross profit progress rate (Budget) 受注残粗利進捗率（予算）.<p>
	 *
	 */
	public MCNumber bdg_per_cmpl_slo_bl_prof_amt() {
		return getConstNumber(offset + 36, $bdg_per_cmpl_slo_bl_prof_amt);
	}

	/**
	 * Sales order backlog gross profit progress rate (Budget) 受注残粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_bl_prof_amt(MCNumber value) {
		setConstNumber(offset + 36, $bdg_per_cmpl_slo_bl_prof_amt, value);
	}

	/**
	 * Sales order backlog gross profit progress rate (Budget) 受注残粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_bl_prof_amt(int value) {
		setConstNumber(offset + 36, $bdg_per_cmpl_slo_bl_prof_amt, value);
	}

	/**
	 * Sales order backlog gross profit progress rate (Budget) 受注残粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_bl_prof_amt(long value) {
		setConstNumber(offset + 36, $bdg_per_cmpl_slo_bl_prof_amt, value);
	}

	/**
	 * Sales order backlog gross profit progress rate (Budget) 受注残粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_bl_prof_amt(float value) {
		setConstNumber(offset + 36, $bdg_per_cmpl_slo_bl_prof_amt, value);
	}

	/**
	 * Sales order backlog gross profit progress rate (Budget) 受注残粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_slo_bl_prof_amt(double value) {
		setConstNumber(offset + 36, $bdg_per_cmpl_slo_bl_prof_amt, value);
	}


	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public MCNumber sls_qty() {
		return getConstNumber(offset + 37, $sls_qty);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(MCNumber value) {
		setConstNumber(offset + 37, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(int value) {
		setConstNumber(offset + 37, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(long value) {
		setConstNumber(offset + 37, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(float value) {
		setConstNumber(offset + 37, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(double value) {
		setConstNumber(offset + 37, $sls_qty, value);
	}


	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 38, $sls_amt);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 38, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 38, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 38, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 38, $sls_amt, value);
	}

	/**
	 * Sales amount 売上金額.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 38, $sls_amt, value);
	}


	/**
	 * Gross profit 売上粗利額.<p>
	 *
	 */
	public MCNumber sls_prof_amt() {
		return getConstNumber(offset + 39, $sls_prof_amt);
	}

	/**
	 * Gross profit 売上粗利額.<p>
	 *
	 */
	public void sls_prof_amt(MCNumber value) {
		setConstNumber(offset + 39, $sls_prof_amt, value);
	}

	/**
	 * Gross profit 売上粗利額.<p>
	 *
	 */
	public void sls_prof_amt(int value) {
		setConstNumber(offset + 39, $sls_prof_amt, value);
	}

	/**
	 * Gross profit 売上粗利額.<p>
	 *
	 */
	public void sls_prof_amt(long value) {
		setConstNumber(offset + 39, $sls_prof_amt, value);
	}

	/**
	 * Gross profit 売上粗利額.<p>
	 *
	 */
	public void sls_prof_amt(float value) {
		setConstNumber(offset + 39, $sls_prof_amt, value);
	}

	/**
	 * Gross profit 売上粗利額.<p>
	 *
	 */
	public void sls_prof_amt(double value) {
		setConstNumber(offset + 39, $sls_prof_amt, value);
	}


	/**
	 * Gross margin 売上粗利率.<p>
	 *
	 */
	public MCNumber sls_prof_rate() {
		return getConstNumber(offset + 40, $sls_prof_rate);
	}

	/**
	 * Gross margin 売上粗利率.<p>
	 *
	 */
	public void sls_prof_rate(MCNumber value) {
		setConstNumber(offset + 40, $sls_prof_rate, value);
	}

	/**
	 * Gross margin 売上粗利率.<p>
	 *
	 */
	public void sls_prof_rate(int value) {
		setConstNumber(offset + 40, $sls_prof_rate, value);
	}

	/**
	 * Gross margin 売上粗利率.<p>
	 *
	 */
	public void sls_prof_rate(long value) {
		setConstNumber(offset + 40, $sls_prof_rate, value);
	}

	/**
	 * Gross margin 売上粗利率.<p>
	 *
	 */
	public void sls_prof_rate(float value) {
		setConstNumber(offset + 40, $sls_prof_rate, value);
	}

	/**
	 * Gross margin 売上粗利率.<p>
	 *
	 */
	public void sls_prof_rate(double value) {
		setConstNumber(offset + 40, $sls_prof_rate, value);
	}


	/**
	 * Total qty. 合計数量.<p>
	 *
	 */
	public MCNumber sum_qty() {
		return getConstNumber(offset + 41, $sum_qty);
	}

	/**
	 * Total qty. 合計数量.<p>
	 *
	 */
	public void sum_qty(MCNumber value) {
		setConstNumber(offset + 41, $sum_qty, value);
	}

	/**
	 * Total qty. 合計数量.<p>
	 *
	 */
	public void sum_qty(int value) {
		setConstNumber(offset + 41, $sum_qty, value);
	}

	/**
	 * Total qty. 合計数量.<p>
	 *
	 */
	public void sum_qty(long value) {
		setConstNumber(offset + 41, $sum_qty, value);
	}

	/**
	 * Total qty. 合計数量.<p>
	 *
	 */
	public void sum_qty(float value) {
		setConstNumber(offset + 41, $sum_qty, value);
	}

	/**
	 * Total qty. 合計数量.<p>
	 *
	 */
	public void sum_qty(double value) {
		setConstNumber(offset + 41, $sum_qty, value);
	}


	/**
	 * Total amount 合計金額.<p>
	 *
	 */
	public MCNumber sum_amt() {
		return getConstNumber(offset + 42, $sum_amt);
	}

	/**
	 * Total amount 合計金額.<p>
	 *
	 */
	public void sum_amt(MCNumber value) {
		setConstNumber(offset + 42, $sum_amt, value);
	}

	/**
	 * Total amount 合計金額.<p>
	 *
	 */
	public void sum_amt(int value) {
		setConstNumber(offset + 42, $sum_amt, value);
	}

	/**
	 * Total amount 合計金額.<p>
	 *
	 */
	public void sum_amt(long value) {
		setConstNumber(offset + 42, $sum_amt, value);
	}

	/**
	 * Total amount 合計金額.<p>
	 *
	 */
	public void sum_amt(float value) {
		setConstNumber(offset + 42, $sum_amt, value);
	}

	/**
	 * Total amount 合計金額.<p>
	 *
	 */
	public void sum_amt(double value) {
		setConstNumber(offset + 42, $sum_amt, value);
	}


	/**
	 * Total gross profit amount 合計粗利額.<p>
	 *
	 */
	public MCNumber sum_prof_amt() {
		return getConstNumber(offset + 43, $sum_prof_amt);
	}

	/**
	 * Total gross profit amount 合計粗利額.<p>
	 *
	 */
	public void sum_prof_amt(MCNumber value) {
		setConstNumber(offset + 43, $sum_prof_amt, value);
	}

	/**
	 * Total gross profit amount 合計粗利額.<p>
	 *
	 */
	public void sum_prof_amt(int value) {
		setConstNumber(offset + 43, $sum_prof_amt, value);
	}

	/**
	 * Total gross profit amount 合計粗利額.<p>
	 *
	 */
	public void sum_prof_amt(long value) {
		setConstNumber(offset + 43, $sum_prof_amt, value);
	}

	/**
	 * Total gross profit amount 合計粗利額.<p>
	 *
	 */
	public void sum_prof_amt(float value) {
		setConstNumber(offset + 43, $sum_prof_amt, value);
	}

	/**
	 * Total gross profit amount 合計粗利額.<p>
	 *
	 */
	public void sum_prof_amt(double value) {
		setConstNumber(offset + 43, $sum_prof_amt, value);
	}


	/**
	 * Total gross profit rate 合計粗利率.<p>
	 *
	 */
	public MCNumber sum_prof_rate() {
		return getConstNumber(offset + 44, $sum_prof_rate);
	}

	/**
	 * Total gross profit rate 合計粗利率.<p>
	 *
	 */
	public void sum_prof_rate(MCNumber value) {
		setConstNumber(offset + 44, $sum_prof_rate, value);
	}

	/**
	 * Total gross profit rate 合計粗利率.<p>
	 *
	 */
	public void sum_prof_rate(int value) {
		setConstNumber(offset + 44, $sum_prof_rate, value);
	}

	/**
	 * Total gross profit rate 合計粗利率.<p>
	 *
	 */
	public void sum_prof_rate(long value) {
		setConstNumber(offset + 44, $sum_prof_rate, value);
	}

	/**
	 * Total gross profit rate 合計粗利率.<p>
	 *
	 */
	public void sum_prof_rate(float value) {
		setConstNumber(offset + 44, $sum_prof_rate, value);
	}

	/**
	 * Total gross profit rate 合計粗利率.<p>
	 *
	 */
	public void sum_prof_rate(double value) {
		setConstNumber(offset + 44, $sum_prof_rate, value);
	}


	/**
	 * Total qty. progress rate (Plan) 合計数量進捗率（計画）.<p>
	 *
	 */
	public MCNumber spln_per_cmpl_sum_qty() {
		return getConstNumber(offset + 45, $spln_per_cmpl_sum_qty);
	}

	/**
	 * Total qty. progress rate (Plan) 合計数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sum_qty(MCNumber value) {
		setConstNumber(offset + 45, $spln_per_cmpl_sum_qty, value);
	}

	/**
	 * Total qty. progress rate (Plan) 合計数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sum_qty(int value) {
		setConstNumber(offset + 45, $spln_per_cmpl_sum_qty, value);
	}

	/**
	 * Total qty. progress rate (Plan) 合計数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sum_qty(long value) {
		setConstNumber(offset + 45, $spln_per_cmpl_sum_qty, value);
	}

	/**
	 * Total qty. progress rate (Plan) 合計数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sum_qty(float value) {
		setConstNumber(offset + 45, $spln_per_cmpl_sum_qty, value);
	}

	/**
	 * Total qty. progress rate (Plan) 合計数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sum_qty(double value) {
		setConstNumber(offset + 45, $spln_per_cmpl_sum_qty, value);
	}


	/**
	 * Total amount progress rate (Plan) 合計金額進捗率（計画）.<p>
	 *
	 */
	public MCNumber spln_per_cmpl_sum_amt() {
		return getConstNumber(offset + 46, $spln_per_cmpl_sum_amt);
	}

	/**
	 * Total amount progress rate (Plan) 合計金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sum_amt(MCNumber value) {
		setConstNumber(offset + 46, $spln_per_cmpl_sum_amt, value);
	}

	/**
	 * Total amount progress rate (Plan) 合計金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sum_amt(int value) {
		setConstNumber(offset + 46, $spln_per_cmpl_sum_amt, value);
	}

	/**
	 * Total amount progress rate (Plan) 合計金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sum_amt(long value) {
		setConstNumber(offset + 46, $spln_per_cmpl_sum_amt, value);
	}

	/**
	 * Total amount progress rate (Plan) 合計金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sum_amt(float value) {
		setConstNumber(offset + 46, $spln_per_cmpl_sum_amt, value);
	}

	/**
	 * Total amount progress rate (Plan) 合計金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sum_amt(double value) {
		setConstNumber(offset + 46, $spln_per_cmpl_sum_amt, value);
	}


	/**
	 * Total amount progress rate (Budget) 合計金額進捗率（予算）.<p>
	 *
	 */
	public MCNumber bdg_per_cmpl_sum_amt() {
		return getConstNumber(offset + 47, $bdg_per_cmpl_sum_amt);
	}

	/**
	 * Total amount progress rate (Budget) 合計金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sum_amt(MCNumber value) {
		setConstNumber(offset + 47, $bdg_per_cmpl_sum_amt, value);
	}

	/**
	 * Total amount progress rate (Budget) 合計金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sum_amt(int value) {
		setConstNumber(offset + 47, $bdg_per_cmpl_sum_amt, value);
	}

	/**
	 * Total amount progress rate (Budget) 合計金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sum_amt(long value) {
		setConstNumber(offset + 47, $bdg_per_cmpl_sum_amt, value);
	}

	/**
	 * Total amount progress rate (Budget) 合計金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sum_amt(float value) {
		setConstNumber(offset + 47, $bdg_per_cmpl_sum_amt, value);
	}

	/**
	 * Total amount progress rate (Budget) 合計金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sum_amt(double value) {
		setConstNumber(offset + 47, $bdg_per_cmpl_sum_amt, value);
	}


	/**
	 * Total gross profit progress rate (Budget) 合計粗利進捗率（予算）.<p>
	 *
	 */
	public MCNumber bdg_per_cmpl_sum_prof_amt() {
		return getConstNumber(offset + 48, $bdg_per_cmpl_sum_prof_amt);
	}

	/**
	 * Total gross profit progress rate (Budget) 合計粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sum_prof_amt(MCNumber value) {
		setConstNumber(offset + 48, $bdg_per_cmpl_sum_prof_amt, value);
	}

	/**
	 * Total gross profit progress rate (Budget) 合計粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sum_prof_amt(int value) {
		setConstNumber(offset + 48, $bdg_per_cmpl_sum_prof_amt, value);
	}

	/**
	 * Total gross profit progress rate (Budget) 合計粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sum_prof_amt(long value) {
		setConstNumber(offset + 48, $bdg_per_cmpl_sum_prof_amt, value);
	}

	/**
	 * Total gross profit progress rate (Budget) 合計粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sum_prof_amt(float value) {
		setConstNumber(offset + 48, $bdg_per_cmpl_sum_prof_amt, value);
	}

	/**
	 * Total gross profit progress rate (Budget) 合計粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sum_prof_amt(double value) {
		setConstNumber(offset + 48, $bdg_per_cmpl_sum_prof_amt, value);
	}


	/**
	 * Sales plan qty. 販売計画数量.<p>
	 *
	 */
	public MCNumber spln_qty() {
		return getConstNumber(offset + 49, $spln_qty);
	}

	/**
	 * Sales plan qty. 販売計画数量.<p>
	 *
	 */
	public void spln_qty(MCNumber value) {
		setConstNumber(offset + 49, $spln_qty, value);
	}

	/**
	 * Sales plan qty. 販売計画数量.<p>
	 *
	 */
	public void spln_qty(int value) {
		setConstNumber(offset + 49, $spln_qty, value);
	}

	/**
	 * Sales plan qty. 販売計画数量.<p>
	 *
	 */
	public void spln_qty(long value) {
		setConstNumber(offset + 49, $spln_qty, value);
	}

	/**
	 * Sales plan qty. 販売計画数量.<p>
	 *
	 */
	public void spln_qty(float value) {
		setConstNumber(offset + 49, $spln_qty, value);
	}

	/**
	 * Sales plan qty. 販売計画数量.<p>
	 *
	 */
	public void spln_qty(double value) {
		setConstNumber(offset + 49, $spln_qty, value);
	}


	/**
	 * Sales plan amount 販売計画金額.<p>
	 *
	 */
	public MCNumber spln_amt() {
		return getConstNumber(offset + 50, $spln_amt);
	}

	/**
	 * Sales plan amount 販売計画金額.<p>
	 *
	 */
	public void spln_amt(MCNumber value) {
		setConstNumber(offset + 50, $spln_amt, value);
	}

	/**
	 * Sales plan amount 販売計画金額.<p>
	 *
	 */
	public void spln_amt(int value) {
		setConstNumber(offset + 50, $spln_amt, value);
	}

	/**
	 * Sales plan amount 販売計画金額.<p>
	 *
	 */
	public void spln_amt(long value) {
		setConstNumber(offset + 50, $spln_amt, value);
	}

	/**
	 * Sales plan amount 販売計画金額.<p>
	 *
	 */
	public void spln_amt(float value) {
		setConstNumber(offset + 50, $spln_amt, value);
	}

	/**
	 * Sales plan amount 販売計画金額.<p>
	 *
	 */
	public void spln_amt(double value) {
		setConstNumber(offset + 50, $spln_amt, value);
	}


	/**
	 * Sales volume progress rate (plan) 売上数量進捗率（計画）.<p>
	 *
	 */
	public MCNumber spln_per_cmpl_sls_qty() {
		return getConstNumber(offset + 51, $spln_per_cmpl_sls_qty);
	}

	/**
	 * Sales volume progress rate (plan) 売上数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sls_qty(MCNumber value) {
		setConstNumber(offset + 51, $spln_per_cmpl_sls_qty, value);
	}

	/**
	 * Sales volume progress rate (plan) 売上数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sls_qty(int value) {
		setConstNumber(offset + 51, $spln_per_cmpl_sls_qty, value);
	}

	/**
	 * Sales volume progress rate (plan) 売上数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sls_qty(long value) {
		setConstNumber(offset + 51, $spln_per_cmpl_sls_qty, value);
	}

	/**
	 * Sales volume progress rate (plan) 売上数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sls_qty(float value) {
		setConstNumber(offset + 51, $spln_per_cmpl_sls_qty, value);
	}

	/**
	 * Sales volume progress rate (plan) 売上数量進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sls_qty(double value) {
		setConstNumber(offset + 51, $spln_per_cmpl_sls_qty, value);
	}


	/**
	 * Sales amount Progress rate (plan) 売上金額進捗率（計画）.<p>
	 *
	 */
	public MCNumber spln_per_cmpl_sls_amt() {
		return getConstNumber(offset + 52, $spln_per_cmpl_sls_amt);
	}

	/**
	 * Sales amount Progress rate (plan) 売上金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sls_amt(MCNumber value) {
		setConstNumber(offset + 52, $spln_per_cmpl_sls_amt, value);
	}

	/**
	 * Sales amount Progress rate (plan) 売上金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sls_amt(int value) {
		setConstNumber(offset + 52, $spln_per_cmpl_sls_amt, value);
	}

	/**
	 * Sales amount Progress rate (plan) 売上金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sls_amt(long value) {
		setConstNumber(offset + 52, $spln_per_cmpl_sls_amt, value);
	}

	/**
	 * Sales amount Progress rate (plan) 売上金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sls_amt(float value) {
		setConstNumber(offset + 52, $spln_per_cmpl_sls_amt, value);
	}

	/**
	 * Sales amount Progress rate (plan) 売上金額進捗率（計画）.<p>
	 *
	 */
	public void spln_per_cmpl_sls_amt(double value) {
		setConstNumber(offset + 52, $spln_per_cmpl_sls_amt, value);
	}


	/**
	 * Budget sales amount 予算売上金額.<p>
	 *
	 */
	public MCNumber bdg_sls_amt() {
		return getConstNumber(offset + 53, $bdg_sls_amt);
	}

	/**
	 * Budget sales amount 予算売上金額.<p>
	 *
	 */
	public void bdg_sls_amt(MCNumber value) {
		setConstNumber(offset + 53, $bdg_sls_amt, value);
	}

	/**
	 * Budget sales amount 予算売上金額.<p>
	 *
	 */
	public void bdg_sls_amt(int value) {
		setConstNumber(offset + 53, $bdg_sls_amt, value);
	}

	/**
	 * Budget sales amount 予算売上金額.<p>
	 *
	 */
	public void bdg_sls_amt(long value) {
		setConstNumber(offset + 53, $bdg_sls_amt, value);
	}

	/**
	 * Budget sales amount 予算売上金額.<p>
	 *
	 */
	public void bdg_sls_amt(float value) {
		setConstNumber(offset + 53, $bdg_sls_amt, value);
	}

	/**
	 * Budget sales amount 予算売上金額.<p>
	 *
	 */
	public void bdg_sls_amt(double value) {
		setConstNumber(offset + 53, $bdg_sls_amt, value);
	}


	/**
	 * Budget sales gross profit 予算売上粗利額.<p>
	 *
	 */
	public MCNumber bdg_sls_prof_amt() {
		return getConstNumber(offset + 54, $bdg_sls_prof_amt);
	}

	/**
	 * Budget sales gross profit 予算売上粗利額.<p>
	 *
	 */
	public void bdg_sls_prof_amt(MCNumber value) {
		setConstNumber(offset + 54, $bdg_sls_prof_amt, value);
	}

	/**
	 * Budget sales gross profit 予算売上粗利額.<p>
	 *
	 */
	public void bdg_sls_prof_amt(int value) {
		setConstNumber(offset + 54, $bdg_sls_prof_amt, value);
	}

	/**
	 * Budget sales gross profit 予算売上粗利額.<p>
	 *
	 */
	public void bdg_sls_prof_amt(long value) {
		setConstNumber(offset + 54, $bdg_sls_prof_amt, value);
	}

	/**
	 * Budget sales gross profit 予算売上粗利額.<p>
	 *
	 */
	public void bdg_sls_prof_amt(float value) {
		setConstNumber(offset + 54, $bdg_sls_prof_amt, value);
	}

	/**
	 * Budget sales gross profit 予算売上粗利額.<p>
	 *
	 */
	public void bdg_sls_prof_amt(double value) {
		setConstNumber(offset + 54, $bdg_sls_prof_amt, value);
	}


	/**
	 * Budget sales gross profit rate 予算売上粗利率.<p>
	 *
	 */
	public MCNumber bdg_sls_prof_rate() {
		return getConstNumber(offset + 55, $bdg_sls_prof_rate);
	}

	/**
	 * Budget sales gross profit rate 予算売上粗利率.<p>
	 *
	 */
	public void bdg_sls_prof_rate(MCNumber value) {
		setConstNumber(offset + 55, $bdg_sls_prof_rate, value);
	}

	/**
	 * Budget sales gross profit rate 予算売上粗利率.<p>
	 *
	 */
	public void bdg_sls_prof_rate(int value) {
		setConstNumber(offset + 55, $bdg_sls_prof_rate, value);
	}

	/**
	 * Budget sales gross profit rate 予算売上粗利率.<p>
	 *
	 */
	public void bdg_sls_prof_rate(long value) {
		setConstNumber(offset + 55, $bdg_sls_prof_rate, value);
	}

	/**
	 * Budget sales gross profit rate 予算売上粗利率.<p>
	 *
	 */
	public void bdg_sls_prof_rate(float value) {
		setConstNumber(offset + 55, $bdg_sls_prof_rate, value);
	}

	/**
	 * Budget sales gross profit rate 予算売上粗利率.<p>
	 *
	 */
	public void bdg_sls_prof_rate(double value) {
		setConstNumber(offset + 55, $bdg_sls_prof_rate, value);
	}


	/**
	 * Sales amount Progress rate (budget) 売上金額進捗率（予算）.<p>
	 *
	 */
	public MCNumber bdg_per_cmpl_sls_amt() {
		return getConstNumber(offset + 56, $bdg_per_cmpl_sls_amt);
	}

	/**
	 * Sales amount Progress rate (budget) 売上金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sls_amt(MCNumber value) {
		setConstNumber(offset + 56, $bdg_per_cmpl_sls_amt, value);
	}

	/**
	 * Sales amount Progress rate (budget) 売上金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sls_amt(int value) {
		setConstNumber(offset + 56, $bdg_per_cmpl_sls_amt, value);
	}

	/**
	 * Sales amount Progress rate (budget) 売上金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sls_amt(long value) {
		setConstNumber(offset + 56, $bdg_per_cmpl_sls_amt, value);
	}

	/**
	 * Sales amount Progress rate (budget) 売上金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sls_amt(float value) {
		setConstNumber(offset + 56, $bdg_per_cmpl_sls_amt, value);
	}

	/**
	 * Sales amount Progress rate (budget) 売上金額進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sls_amt(double value) {
		setConstNumber(offset + 56, $bdg_per_cmpl_sls_amt, value);
	}


	/**
	 * Gross profit progress rate (budget) 売上粗利進捗率（予算）.<p>
	 *
	 */
	public MCNumber bdg_per_cmpl_sls_prof_amt() {
		return getConstNumber(offset + 57, $bdg_per_cmpl_sls_prof_amt);
	}

	/**
	 * Gross profit progress rate (budget) 売上粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sls_prof_amt(MCNumber value) {
		setConstNumber(offset + 57, $bdg_per_cmpl_sls_prof_amt, value);
	}

	/**
	 * Gross profit progress rate (budget) 売上粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sls_prof_amt(int value) {
		setConstNumber(offset + 57, $bdg_per_cmpl_sls_prof_amt, value);
	}

	/**
	 * Gross profit progress rate (budget) 売上粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sls_prof_amt(long value) {
		setConstNumber(offset + 57, $bdg_per_cmpl_sls_prof_amt, value);
	}

	/**
	 * Gross profit progress rate (budget) 売上粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sls_prof_amt(float value) {
		setConstNumber(offset + 57, $bdg_per_cmpl_sls_prof_amt, value);
	}

	/**
	 * Gross profit progress rate (budget) 売上粗利進捗率（予算）.<p>
	 *
	 */
	public void bdg_per_cmpl_sls_prof_amt(double value) {
		setConstNumber(offset + 57, $bdg_per_cmpl_sls_prof_amt, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 58, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 58, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 58, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 58, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 58, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 58, $base_unit_dec_place, value);
	}


	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 59, $amt_dec_place);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 59, $amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 59, $amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 59, $amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 59, $amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 59, $amt_dec_place, value);
	}


	/**
	 * Rate number of decimal places 率小数部有効桁数.<p>
	 *
	 */
	public MCNumber rate_dec_place() {
		return getConstNumber(offset + 60, $rate_dec_place);
	}

	/**
	 * Rate number of decimal places 率小数部有効桁数.<p>
	 *
	 */
	public void rate_dec_place(MCNumber value) {
		setConstNumber(offset + 60, $rate_dec_place, value);
	}

	/**
	 * Rate number of decimal places 率小数部有効桁数.<p>
	 *
	 */
	public void rate_dec_place(int value) {
		setConstNumber(offset + 60, $rate_dec_place, value);
	}

	/**
	 * Rate number of decimal places 率小数部有効桁数.<p>
	 *
	 */
	public void rate_dec_place(long value) {
		setConstNumber(offset + 60, $rate_dec_place, value);
	}

	/**
	 * Rate number of decimal places 率小数部有効桁数.<p>
	 *
	 */
	public void rate_dec_place(float value) {
		setConstNumber(offset + 60, $rate_dec_place, value);
	}

	/**
	 * Rate number of decimal places 率小数部有効桁数.<p>
	 *
	 */
	public void rate_dec_place(double value) {
		setConstNumber(offset + 60, $rate_dec_place, value);
	}


	public String getString(String name) {
		if ($data_typ.equalsIgnoreCase(name)) {
			return data_typ();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($dpt1.equalsIgnoreCase(name)) {
			return dpt1();
		}
		if ($dpt_nm1.equalsIgnoreCase(name)) {
			return dpt_nm1();
		}
		if ($dpt2.equalsIgnoreCase(name)) {
			return dpt2();
		}
		if ($dpt_nm2.equalsIgnoreCase(name)) {
			return dpt_nm2();
		}
		if ($itm_grp1.equalsIgnoreCase(name)) {
			return itm_grp1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp2.equalsIgnoreCase(name)) {
			return itm_grp2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($slo_qty.equalsIgnoreCase(name)) {
			return slo_qty();
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			return slo_amt();
		}
		if ($slo_prof_amt.equalsIgnoreCase(name)) {
			return slo_prof_amt();
		}
		if ($slo_prof_rate.equalsIgnoreCase(name)) {
			return slo_prof_rate();
		}
		if ($spln_per_cmpl_slo_qty.equalsIgnoreCase(name)) {
			return spln_per_cmpl_slo_qty();
		}
		if ($spln_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			return spln_per_cmpl_slo_amt();
		}
		if ($bdg_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_slo_amt();
		}
		if ($bdg_per_cmpl_slo_prof_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_slo_prof_amt();
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			return slo_bl_qty();
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			return slo_bl_amt();
		}
		if ($slo_bl_prof_amt.equalsIgnoreCase(name)) {
			return slo_bl_prof_amt();
		}
		if ($slo_bl_prof_rate.equalsIgnoreCase(name)) {
			return slo_bl_prof_rate();
		}
		if ($spln_per_cmpl_slo_bl_qty.equalsIgnoreCase(name)) {
			return spln_per_cmpl_slo_bl_qty();
		}
		if ($spln_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			return spln_per_cmpl_slo_bl_amt();
		}
		if ($bdg_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_slo_bl_amt();
		}
		if ($bdg_per_cmpl_slo_bl_prof_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_slo_bl_prof_amt();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($sls_prof_amt.equalsIgnoreCase(name)) {
			return sls_prof_amt();
		}
		if ($sls_prof_rate.equalsIgnoreCase(name)) {
			return sls_prof_rate();
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			return sum_qty();
		}
		if ($sum_amt.equalsIgnoreCase(name)) {
			return sum_amt();
		}
		if ($sum_prof_amt.equalsIgnoreCase(name)) {
			return sum_prof_amt();
		}
		if ($sum_prof_rate.equalsIgnoreCase(name)) {
			return sum_prof_rate();
		}
		if ($spln_per_cmpl_sum_qty.equalsIgnoreCase(name)) {
			return spln_per_cmpl_sum_qty();
		}
		if ($spln_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			return spln_per_cmpl_sum_amt();
		}
		if ($bdg_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_sum_amt();
		}
		if ($bdg_per_cmpl_sum_prof_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_sum_prof_amt();
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			return spln_qty();
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			return spln_amt();
		}
		if ($spln_per_cmpl_sls_qty.equalsIgnoreCase(name)) {
			return spln_per_cmpl_sls_qty();
		}
		if ($spln_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			return spln_per_cmpl_sls_amt();
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			return bdg_sls_amt();
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			return bdg_sls_prof_amt();
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			return bdg_sls_prof_rate();
		}
		if ($bdg_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_sls_amt();
		}
		if ($bdg_per_cmpl_sls_prof_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_sls_prof_amt();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			return rate_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($data_typ.equalsIgnoreCase(name)) {
			return data_typ();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($dpt1.equalsIgnoreCase(name)) {
			return dpt1();
		}
		if ($dpt_nm1.equalsIgnoreCase(name)) {
			return dpt_nm1();
		}
		if ($dpt2.equalsIgnoreCase(name)) {
			return dpt2();
		}
		if ($dpt_nm2.equalsIgnoreCase(name)) {
			return dpt_nm2();
		}
		if ($itm_grp1.equalsIgnoreCase(name)) {
			return itm_grp1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp2.equalsIgnoreCase(name)) {
			return itm_grp2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($slo_qty.equalsIgnoreCase(name)) {
			return slo_qty();
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			return slo_amt();
		}
		if ($slo_prof_amt.equalsIgnoreCase(name)) {
			return slo_prof_amt();
		}
		if ($slo_prof_rate.equalsIgnoreCase(name)) {
			return slo_prof_rate();
		}
		if ($spln_per_cmpl_slo_qty.equalsIgnoreCase(name)) {
			return spln_per_cmpl_slo_qty();
		}
		if ($spln_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			return spln_per_cmpl_slo_amt();
		}
		if ($bdg_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_slo_amt();
		}
		if ($bdg_per_cmpl_slo_prof_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_slo_prof_amt();
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			return slo_bl_qty();
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			return slo_bl_amt();
		}
		if ($slo_bl_prof_amt.equalsIgnoreCase(name)) {
			return slo_bl_prof_amt();
		}
		if ($slo_bl_prof_rate.equalsIgnoreCase(name)) {
			return slo_bl_prof_rate();
		}
		if ($spln_per_cmpl_slo_bl_qty.equalsIgnoreCase(name)) {
			return spln_per_cmpl_slo_bl_qty();
		}
		if ($spln_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			return spln_per_cmpl_slo_bl_amt();
		}
		if ($bdg_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_slo_bl_amt();
		}
		if ($bdg_per_cmpl_slo_bl_prof_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_slo_bl_prof_amt();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($sls_prof_amt.equalsIgnoreCase(name)) {
			return sls_prof_amt();
		}
		if ($sls_prof_rate.equalsIgnoreCase(name)) {
			return sls_prof_rate();
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			return sum_qty();
		}
		if ($sum_amt.equalsIgnoreCase(name)) {
			return sum_amt();
		}
		if ($sum_prof_amt.equalsIgnoreCase(name)) {
			return sum_prof_amt();
		}
		if ($sum_prof_rate.equalsIgnoreCase(name)) {
			return sum_prof_rate();
		}
		if ($spln_per_cmpl_sum_qty.equalsIgnoreCase(name)) {
			return spln_per_cmpl_sum_qty();
		}
		if ($spln_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			return spln_per_cmpl_sum_amt();
		}
		if ($bdg_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_sum_amt();
		}
		if ($bdg_per_cmpl_sum_prof_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_sum_prof_amt();
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			return spln_qty();
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			return spln_amt();
		}
		if ($spln_per_cmpl_sls_qty.equalsIgnoreCase(name)) {
			return spln_per_cmpl_sls_qty();
		}
		if ($spln_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			return spln_per_cmpl_sls_amt();
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			return bdg_sls_amt();
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			return bdg_sls_prof_amt();
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			return bdg_sls_prof_rate();
		}
		if ($bdg_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_sls_amt();
		}
		if ($bdg_per_cmpl_sls_prof_amt.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_sls_prof_amt();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			return rate_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($data_typ.equalsIgnoreCase(name)) {
			data_typ(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($dpt1.equalsIgnoreCase(name)) {
			dpt1(value);
			return;
		}
		if ($dpt_nm1.equalsIgnoreCase(name)) {
			dpt_nm1(value);
			return;
		}
		if ($dpt2.equalsIgnoreCase(name)) {
			dpt2(value);
			return;
		}
		if ($dpt_nm2.equalsIgnoreCase(name)) {
			dpt_nm2(value);
			return;
		}
		if ($itm_grp1.equalsIgnoreCase(name)) {
			itm_grp1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp2.equalsIgnoreCase(name)) {
			itm_grp2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			sls_usr_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_prof_amt.equalsIgnoreCase(name)) {
			slo_prof_amt(value);
			return;
		}
		if ($slo_prof_rate.equalsIgnoreCase(name)) {
			slo_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_prof_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_prof_amt.equalsIgnoreCase(name)) {
			slo_bl_prof_amt(value);
			return;
		}
		if ($slo_bl_prof_rate.equalsIgnoreCase(name)) {
			slo_bl_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_prof_amt(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($sls_prof_amt.equalsIgnoreCase(name)) {
			sls_prof_amt(value);
			return;
		}
		if ($sls_prof_rate.equalsIgnoreCase(name)) {
			sls_prof_rate(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($sum_prof_amt.equalsIgnoreCase(name)) {
			sum_prof_amt(value);
			return;
		}
		if ($sum_prof_rate.equalsIgnoreCase(name)) {
			sum_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_sum_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_qty(value);
			return;
		}
		if ($spln_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_prof_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($spln_per_cmpl_sls_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_qty(value);
			return;
		}
		if ($spln_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($bdg_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_prof_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_prof_amt.equalsIgnoreCase(name)) {
			slo_prof_amt(value);
			return;
		}
		if ($slo_prof_rate.equalsIgnoreCase(name)) {
			slo_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_prof_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_prof_amt.equalsIgnoreCase(name)) {
			slo_bl_prof_amt(value);
			return;
		}
		if ($slo_bl_prof_rate.equalsIgnoreCase(name)) {
			slo_bl_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_prof_amt(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($sls_prof_amt.equalsIgnoreCase(name)) {
			sls_prof_amt(value);
			return;
		}
		if ($sls_prof_rate.equalsIgnoreCase(name)) {
			sls_prof_rate(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($sum_prof_amt.equalsIgnoreCase(name)) {
			sum_prof_amt(value);
			return;
		}
		if ($sum_prof_rate.equalsIgnoreCase(name)) {
			sum_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_sum_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_qty(value);
			return;
		}
		if ($spln_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_prof_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($spln_per_cmpl_sls_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_qty(value);
			return;
		}
		if ($spln_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($bdg_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_prof_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_prof_amt.equalsIgnoreCase(name)) {
			slo_prof_amt(value);
			return;
		}
		if ($slo_prof_rate.equalsIgnoreCase(name)) {
			slo_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_prof_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_prof_amt.equalsIgnoreCase(name)) {
			slo_bl_prof_amt(value);
			return;
		}
		if ($slo_bl_prof_rate.equalsIgnoreCase(name)) {
			slo_bl_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_prof_amt(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($sls_prof_amt.equalsIgnoreCase(name)) {
			sls_prof_amt(value);
			return;
		}
		if ($sls_prof_rate.equalsIgnoreCase(name)) {
			sls_prof_rate(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($sum_prof_amt.equalsIgnoreCase(name)) {
			sum_prof_amt(value);
			return;
		}
		if ($sum_prof_rate.equalsIgnoreCase(name)) {
			sum_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_sum_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_qty(value);
			return;
		}
		if ($spln_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_prof_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($spln_per_cmpl_sls_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_qty(value);
			return;
		}
		if ($spln_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($bdg_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_prof_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_prof_amt.equalsIgnoreCase(name)) {
			slo_prof_amt(value);
			return;
		}
		if ($slo_prof_rate.equalsIgnoreCase(name)) {
			slo_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_prof_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_prof_amt.equalsIgnoreCase(name)) {
			slo_bl_prof_amt(value);
			return;
		}
		if ($slo_bl_prof_rate.equalsIgnoreCase(name)) {
			slo_bl_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_prof_amt(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($sls_prof_amt.equalsIgnoreCase(name)) {
			sls_prof_amt(value);
			return;
		}
		if ($sls_prof_rate.equalsIgnoreCase(name)) {
			sls_prof_rate(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($sum_prof_amt.equalsIgnoreCase(name)) {
			sum_prof_amt(value);
			return;
		}
		if ($sum_prof_rate.equalsIgnoreCase(name)) {
			sum_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_sum_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_qty(value);
			return;
		}
		if ($spln_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_prof_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($spln_per_cmpl_sls_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_qty(value);
			return;
		}
		if ($spln_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($bdg_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_prof_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_prof_amt.equalsIgnoreCase(name)) {
			slo_prof_amt(value);
			return;
		}
		if ($slo_prof_rate.equalsIgnoreCase(name)) {
			slo_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_prof_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_prof_amt.equalsIgnoreCase(name)) {
			slo_bl_prof_amt(value);
			return;
		}
		if ($slo_bl_prof_rate.equalsIgnoreCase(name)) {
			slo_bl_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_prof_amt(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($sls_prof_amt.equalsIgnoreCase(name)) {
			sls_prof_amt(value);
			return;
		}
		if ($sls_prof_rate.equalsIgnoreCase(name)) {
			sls_prof_rate(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($sum_prof_amt.equalsIgnoreCase(name)) {
			sum_prof_amt(value);
			return;
		}
		if ($sum_prof_rate.equalsIgnoreCase(name)) {
			sum_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_sum_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_qty(value);
			return;
		}
		if ($spln_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_prof_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($spln_per_cmpl_sls_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_qty(value);
			return;
		}
		if ($spln_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($bdg_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_prof_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_typ.equalsIgnoreCase(name)) {
			data_typ(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($dpt1.equalsIgnoreCase(name)) {
			dpt1(value);
			return;
		}
		if ($dpt_nm1.equalsIgnoreCase(name)) {
			dpt_nm1(value);
			return;
		}
		if ($dpt2.equalsIgnoreCase(name)) {
			dpt2(value);
			return;
		}
		if ($dpt_nm2.equalsIgnoreCase(name)) {
			dpt_nm2(value);
			return;
		}
		if ($itm_grp1.equalsIgnoreCase(name)) {
			itm_grp1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp2.equalsIgnoreCase(name)) {
			itm_grp2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			sls_usr_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_prof_amt.equalsIgnoreCase(name)) {
			slo_prof_amt(value);
			return;
		}
		if ($slo_prof_rate.equalsIgnoreCase(name)) {
			slo_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_prof_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_prof_amt.equalsIgnoreCase(name)) {
			slo_bl_prof_amt(value);
			return;
		}
		if ($slo_bl_prof_rate.equalsIgnoreCase(name)) {
			slo_bl_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_prof_amt(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($sls_prof_amt.equalsIgnoreCase(name)) {
			sls_prof_amt(value);
			return;
		}
		if ($sls_prof_rate.equalsIgnoreCase(name)) {
			sls_prof_rate(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($sum_prof_amt.equalsIgnoreCase(name)) {
			sum_prof_amt(value);
			return;
		}
		if ($sum_prof_rate.equalsIgnoreCase(name)) {
			sum_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_sum_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_qty(value);
			return;
		}
		if ($spln_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_prof_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($spln_per_cmpl_sls_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_qty(value);
			return;
		}
		if ($spln_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($bdg_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_prof_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_prof_amt.equalsIgnoreCase(name)) {
			slo_prof_amt(value);
			return;
		}
		if ($slo_prof_rate.equalsIgnoreCase(name)) {
			slo_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_prof_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_prof_amt.equalsIgnoreCase(name)) {
			slo_bl_prof_amt(value);
			return;
		}
		if ($slo_bl_prof_rate.equalsIgnoreCase(name)) {
			slo_bl_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_prof_amt(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($sls_prof_amt.equalsIgnoreCase(name)) {
			sls_prof_amt(value);
			return;
		}
		if ($sls_prof_rate.equalsIgnoreCase(name)) {
			sls_prof_rate(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($sum_prof_amt.equalsIgnoreCase(name)) {
			sum_prof_amt(value);
			return;
		}
		if ($sum_prof_rate.equalsIgnoreCase(name)) {
			sum_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_sum_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_qty(value);
			return;
		}
		if ($spln_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_prof_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($spln_per_cmpl_sls_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_qty(value);
			return;
		}
		if ($spln_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($bdg_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_prof_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_prof_amt.equalsIgnoreCase(name)) {
			slo_prof_amt(value);
			return;
		}
		if ($slo_prof_rate.equalsIgnoreCase(name)) {
			slo_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_prof_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_prof_amt.equalsIgnoreCase(name)) {
			slo_bl_prof_amt(value);
			return;
		}
		if ($slo_bl_prof_rate.equalsIgnoreCase(name)) {
			slo_bl_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_prof_amt(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($sls_prof_amt.equalsIgnoreCase(name)) {
			sls_prof_amt(value);
			return;
		}
		if ($sls_prof_rate.equalsIgnoreCase(name)) {
			sls_prof_rate(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($sum_prof_amt.equalsIgnoreCase(name)) {
			sum_prof_amt(value);
			return;
		}
		if ($sum_prof_rate.equalsIgnoreCase(name)) {
			sum_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_sum_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_qty(value);
			return;
		}
		if ($spln_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_prof_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($spln_per_cmpl_sls_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_qty(value);
			return;
		}
		if ($spln_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($bdg_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_prof_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_prof_amt.equalsIgnoreCase(name)) {
			slo_prof_amt(value);
			return;
		}
		if ($slo_prof_rate.equalsIgnoreCase(name)) {
			slo_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_prof_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_prof_amt.equalsIgnoreCase(name)) {
			slo_bl_prof_amt(value);
			return;
		}
		if ($slo_bl_prof_rate.equalsIgnoreCase(name)) {
			slo_bl_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_prof_amt(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($sls_prof_amt.equalsIgnoreCase(name)) {
			sls_prof_amt(value);
			return;
		}
		if ($sls_prof_rate.equalsIgnoreCase(name)) {
			sls_prof_rate(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($sum_prof_amt.equalsIgnoreCase(name)) {
			sum_prof_amt(value);
			return;
		}
		if ($sum_prof_rate.equalsIgnoreCase(name)) {
			sum_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_sum_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_qty(value);
			return;
		}
		if ($spln_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_prof_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($spln_per_cmpl_sls_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_qty(value);
			return;
		}
		if ($spln_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($bdg_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_prof_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_prof_amt.equalsIgnoreCase(name)) {
			slo_prof_amt(value);
			return;
		}
		if ($slo_prof_rate.equalsIgnoreCase(name)) {
			slo_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_prof_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_prof_amt.equalsIgnoreCase(name)) {
			slo_bl_prof_amt(value);
			return;
		}
		if ($slo_bl_prof_rate.equalsIgnoreCase(name)) {
			slo_bl_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_qty(value);
			return;
		}
		if ($spln_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_amt(value);
			return;
		}
		if ($bdg_per_cmpl_slo_bl_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo_bl_prof_amt(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($sls_prof_amt.equalsIgnoreCase(name)) {
			sls_prof_amt(value);
			return;
		}
		if ($sls_prof_rate.equalsIgnoreCase(name)) {
			sls_prof_rate(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_amt.equalsIgnoreCase(name)) {
			sum_amt(value);
			return;
		}
		if ($sum_prof_amt.equalsIgnoreCase(name)) {
			sum_prof_amt(value);
			return;
		}
		if ($sum_prof_rate.equalsIgnoreCase(name)) {
			sum_prof_rate(value);
			return;
		}
		if ($spln_per_cmpl_sum_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_qty(value);
			return;
		}
		if ($spln_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sum_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sum_prof_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($spln_per_cmpl_sls_qty.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_qty(value);
			return;
		}
		if ($spln_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		if ($bdg_sls_prof_rate.equalsIgnoreCase(name)) {
			bdg_sls_prof_rate(value);
			return;
		}
		if ($bdg_per_cmpl_sls_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_amt(value);
			return;
		}
		if ($bdg_per_cmpl_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_prof_amt(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

