package mcframe.serverMGBF.MGBFL0220;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public static final String $dummy_term = "dummy_term";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
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
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
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
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public static final String $std_qty = "std_qty";
	/**
	 * Weighted average unit price 総平均単価.<p>
	 *
	 */
	public static final String $ave_upri = "ave_upri";
	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public static final String $st_stk_qty = "st_stk_qty";
	/**
	 * Beginning inventory cost 月初在庫原価.<p>
	 *
	 */
	public static final String $st_stk_amt = "st_stk_amt";
	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public static final String $mfg_qty = "mfg_qty";
	/**
	 * Mfg. cost 製造原価.<p>
	 *
	 */
	public static final String $mfg_amt = "mfg_amt";
	/**
	 * Purchase qty. 購買数量.<p>
	 *
	 */
	public static final String $purc_qty = "purc_qty";
	/**
	 * Purchase cost 購買原価.<p>
	 *
	 */
	public static final String $purc_amt = "purc_amt";
	/**
	 * Mfg. receipt qty. 製造受入数量.<p>
	 *
	 */
	public static final String $mfg_gr_qty = "mfg_gr_qty";
	/**
	 * Mfg. receipt cost 製造受入原価.<p>
	 *
	 */
	public static final String $mfg_gr_amt = "mfg_gr_amt";
	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public static final String $othr_gr_qty = "othr_gr_qty";
	/**
	 * GR cost 入庫原価.<p>
	 *
	 */
	public static final String $othr_gr_amt = "othr_gr_amt";
	/**
	 * General purpose allocation amount 汎用配賦金額.<p>
	 *
	 */
	public static final String $alc_amt = "alc_amt";
	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public static final String $inpt_qty = "inpt_qty";
	/**
	 * Input cost 投入原価.<p>
	 *
	 */
	public static final String $inpt_amt = "inpt_amt";
	/**
	 * Sales warehousing qty. 販売倉入数量.<p>
	 *
	 */
	public static final String $plnt_gi_qty = "plnt_gi_qty";
	/**
	 * Sales warehousing cost 販売倉入原価.<p>
	 *
	 */
	public static final String $plnt_gi_amt = "plnt_gi_amt";
	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public static final String $othr_gi_qty = "othr_gi_qty";
	/**
	 * GI cost 出庫原価.<p>
	 *
	 */
	public static final String $othr_gi_amt = "othr_gi_amt";
	/**
	 * Chargeable supply qty. 有償支給数量.<p>
	 *
	 */
	public static final String $prov_qty = "prov_qty";
	/**
	 * Chargeable supply cost 有償支給原価.<p>
	 *
	 */
	public static final String $prov_amt = "prov_amt";
	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public static final String $sls_qty = "sls_qty";
	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public static final String $end_stk_qty = "end_stk_qty";
	/**
	 * Ending inventory cost 月末在庫原価.<p>
	 *
	 */
	public static final String $end_stk_amt = "end_stk_amt";
	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public static final String $diff_qty = "diff_qty";
	/**
	 * Amount variance 金額差.<p>
	 *
	 */
	public static final String $diff_amt = "diff_amt";
	/**
	 * Expenses input qty. 経費投入数量.<p>
	 *
	 */
	public static final String $xpns_inpt_qty = "xpns_inpt_qty";
	/**
	 * Expenses input costs 経費投入原価.<p>
	 *
	 */
	public static final String $xpns_inpt_amt = "xpns_inpt_amt";


	public static final MCMeta dummy_term_META = createCommonMeta($dummy_term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta std_qty_META = createCommonMeta($std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ave_upri_META = createCommonMeta($ave_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta st_stk_qty_META = createCommonMeta($st_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta st_stk_amt_META = createCommonMeta($st_stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta mfg_qty_META = createCommonMeta($mfg_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_amt_META = createCommonMeta($mfg_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_qty_META = createCommonMeta($purc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_amt_META = createCommonMeta($purc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta mfg_gr_qty_META = createCommonMeta($mfg_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_gr_amt_META = createCommonMeta($mfg_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta othr_gr_qty_META = createCommonMeta($othr_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta othr_gr_amt_META = createCommonMeta($othr_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta alc_amt_META = createCommonMeta($alc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inpt_qty_META = createCommonMeta($inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inpt_amt_META = createCommonMeta($inpt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta plnt_gi_qty_META = createCommonMeta($plnt_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta plnt_gi_amt_META = createCommonMeta($plnt_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta othr_gi_qty_META = createCommonMeta($othr_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta othr_gi_amt_META = createCommonMeta($othr_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prov_qty_META = createCommonMeta($prov_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prov_amt_META = createCommonMeta($prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_qty_META = createCommonMeta($sls_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_stk_qty_META = createCommonMeta($end_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta end_stk_amt_META = createCommonMeta($end_stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_qty_META = createCommonMeta($diff_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta diff_amt_META = createCommonMeta($diff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xpns_inpt_qty_META = createCommonMeta($xpns_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xpns_inpt_amt_META = createCommonMeta($xpns_inpt_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dummy_term_META,
			wg_cd_META,
			wg_nm_META,
			ym_META,
			dpt_cd_META,
			dpt_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			asst_typ_META,
			asst_typ_nm_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			std_qty_META,
			ave_upri_META,
			st_stk_qty_META,
			st_stk_amt_META,
			mfg_qty_META,
			mfg_amt_META,
			purc_qty_META,
			purc_amt_META,
			mfg_gr_qty_META,
			mfg_gr_amt_META,
			othr_gr_qty_META,
			othr_gr_amt_META,
			alc_amt_META,
			inpt_qty_META,
			inpt_amt_META,
			plnt_gi_qty_META,
			plnt_gi_amt_META,
			othr_gi_qty_META,
			othr_gi_amt_META,
			prov_qty_META,
			prov_amt_META,
			sls_qty_META,
			sls_amt_META,
			end_stk_qty_META,
			end_stk_amt_META,
			diff_qty_META,
			diff_amt_META,
			xpns_inpt_qty_META,
			xpns_inpt_amt_META
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
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$asst_typ, "MAC_ASST_TYP"}	// asst_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public MCDate dummy_term() {
		return getConstDate(offset + 0, $dummy_term);
	}

	/**
	 * Term master (Dummy for join) 期マスタ（結合用ダミー）.<p>
	 *
	 */
	public void dummy_term(MCDate value) {
		setConstDate(offset + 0, $dummy_term, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 2, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 2, $wg_nm, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 3, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 3, $ym, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 4, $dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 4, $dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 5, $dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 5, $dpt_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 6, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 6, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 7, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 7, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 8, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 8, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 9, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 9, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 10, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 10, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 11, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 11, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 12, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 12, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 13, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 13, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 14, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 14, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 15, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 15, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 16, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 16, $itm_jnl_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 17, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 17, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 18, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 18, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 19, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 19, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 20, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 20, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 21, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 21, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 22, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 22, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 23, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 23, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 24, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 24, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 25, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 25, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 26, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 26, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 27, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 27, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 28, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 28, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 29, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 29, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 30, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 30, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 31, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 31, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 32, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 32, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 33, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 33, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 34, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 34, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 35, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 35, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 36, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 36, $itm_grp_nm10, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 37, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 37, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 38, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 38, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 39, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 39, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 40, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 40, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 41, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 41, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 42, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 42, $sno4, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 43, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 43, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 44, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 44, $asst_typ_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 45, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 45, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 46, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 46, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 47, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 47, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 47, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 47, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 47, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 47, $dec_place, value);
	}


	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public MCNumber std_qty() {
		return getConstNumber(offset + 48, $std_qty);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void std_qty(MCNumber value) {
		setConstNumber(offset + 48, $std_qty, value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void std_qty(int value) {
		setConstNumber(offset + 48, $std_qty, value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void std_qty(long value) {
		setConstNumber(offset + 48, $std_qty, value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void std_qty(float value) {
		setConstNumber(offset + 48, $std_qty, value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void std_qty(double value) {
		setConstNumber(offset + 48, $std_qty, value);
	}


	/**
	 * Weighted average unit price 総平均単価.<p>
	 *
	 */
	public MCNumber ave_upri() {
		return getConstNumber(offset + 49, $ave_upri);
	}

	/**
	 * Weighted average unit price 総平均単価.<p>
	 *
	 */
	public void ave_upri(MCNumber value) {
		setConstNumber(offset + 49, $ave_upri, value);
	}

	/**
	 * Weighted average unit price 総平均単価.<p>
	 *
	 */
	public void ave_upri(int value) {
		setConstNumber(offset + 49, $ave_upri, value);
	}

	/**
	 * Weighted average unit price 総平均単価.<p>
	 *
	 */
	public void ave_upri(long value) {
		setConstNumber(offset + 49, $ave_upri, value);
	}

	/**
	 * Weighted average unit price 総平均単価.<p>
	 *
	 */
	public void ave_upri(float value) {
		setConstNumber(offset + 49, $ave_upri, value);
	}

	/**
	 * Weighted average unit price 総平均単価.<p>
	 *
	 */
	public void ave_upri(double value) {
		setConstNumber(offset + 49, $ave_upri, value);
	}


	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public MCNumber st_stk_qty() {
		return getConstNumber(offset + 50, $st_stk_qty);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void st_stk_qty(MCNumber value) {
		setConstNumber(offset + 50, $st_stk_qty, value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void st_stk_qty(int value) {
		setConstNumber(offset + 50, $st_stk_qty, value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void st_stk_qty(long value) {
		setConstNumber(offset + 50, $st_stk_qty, value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void st_stk_qty(float value) {
		setConstNumber(offset + 50, $st_stk_qty, value);
	}

	/**
	 * Beginning inventory qty. 月初在庫数量.<p>
	 *
	 */
	public void st_stk_qty(double value) {
		setConstNumber(offset + 50, $st_stk_qty, value);
	}


	/**
	 * Beginning inventory cost 月初在庫原価.<p>
	 *
	 */
	public MCNumber st_stk_amt() {
		return getConstNumber(offset + 51, $st_stk_amt);
	}

	/**
	 * Beginning inventory cost 月初在庫原価.<p>
	 *
	 */
	public void st_stk_amt(MCNumber value) {
		setConstNumber(offset + 51, $st_stk_amt, value);
	}

	/**
	 * Beginning inventory cost 月初在庫原価.<p>
	 *
	 */
	public void st_stk_amt(int value) {
		setConstNumber(offset + 51, $st_stk_amt, value);
	}

	/**
	 * Beginning inventory cost 月初在庫原価.<p>
	 *
	 */
	public void st_stk_amt(long value) {
		setConstNumber(offset + 51, $st_stk_amt, value);
	}

	/**
	 * Beginning inventory cost 月初在庫原価.<p>
	 *
	 */
	public void st_stk_amt(float value) {
		setConstNumber(offset + 51, $st_stk_amt, value);
	}

	/**
	 * Beginning inventory cost 月初在庫原価.<p>
	 *
	 */
	public void st_stk_amt(double value) {
		setConstNumber(offset + 51, $st_stk_amt, value);
	}


	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public MCNumber mfg_qty() {
		return getConstNumber(offset + 52, $mfg_qty);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(MCNumber value) {
		setConstNumber(offset + 52, $mfg_qty, value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(int value) {
		setConstNumber(offset + 52, $mfg_qty, value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(long value) {
		setConstNumber(offset + 52, $mfg_qty, value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(float value) {
		setConstNumber(offset + 52, $mfg_qty, value);
	}

	/**
	 * Mfg. qty. 製造数量.<p>
	 *
	 */
	public void mfg_qty(double value) {
		setConstNumber(offset + 52, $mfg_qty, value);
	}


	/**
	 * Mfg. cost 製造原価.<p>
	 *
	 */
	public MCNumber mfg_amt() {
		return getConstNumber(offset + 53, $mfg_amt);
	}

	/**
	 * Mfg. cost 製造原価.<p>
	 *
	 */
	public void mfg_amt(MCNumber value) {
		setConstNumber(offset + 53, $mfg_amt, value);
	}

	/**
	 * Mfg. cost 製造原価.<p>
	 *
	 */
	public void mfg_amt(int value) {
		setConstNumber(offset + 53, $mfg_amt, value);
	}

	/**
	 * Mfg. cost 製造原価.<p>
	 *
	 */
	public void mfg_amt(long value) {
		setConstNumber(offset + 53, $mfg_amt, value);
	}

	/**
	 * Mfg. cost 製造原価.<p>
	 *
	 */
	public void mfg_amt(float value) {
		setConstNumber(offset + 53, $mfg_amt, value);
	}

	/**
	 * Mfg. cost 製造原価.<p>
	 *
	 */
	public void mfg_amt(double value) {
		setConstNumber(offset + 53, $mfg_amt, value);
	}


	/**
	 * Purchase qty. 購買数量.<p>
	 *
	 */
	public MCNumber purc_qty() {
		return getConstNumber(offset + 54, $purc_qty);
	}

	/**
	 * Purchase qty. 購買数量.<p>
	 *
	 */
	public void purc_qty(MCNumber value) {
		setConstNumber(offset + 54, $purc_qty, value);
	}

	/**
	 * Purchase qty. 購買数量.<p>
	 *
	 */
	public void purc_qty(int value) {
		setConstNumber(offset + 54, $purc_qty, value);
	}

	/**
	 * Purchase qty. 購買数量.<p>
	 *
	 */
	public void purc_qty(long value) {
		setConstNumber(offset + 54, $purc_qty, value);
	}

	/**
	 * Purchase qty. 購買数量.<p>
	 *
	 */
	public void purc_qty(float value) {
		setConstNumber(offset + 54, $purc_qty, value);
	}

	/**
	 * Purchase qty. 購買数量.<p>
	 *
	 */
	public void purc_qty(double value) {
		setConstNumber(offset + 54, $purc_qty, value);
	}


	/**
	 * Purchase cost 購買原価.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return getConstNumber(offset + 55, $purc_amt);
	}

	/**
	 * Purchase cost 購買原価.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		setConstNumber(offset + 55, $purc_amt, value);
	}

	/**
	 * Purchase cost 購買原価.<p>
	 *
	 */
	public void purc_amt(int value) {
		setConstNumber(offset + 55, $purc_amt, value);
	}

	/**
	 * Purchase cost 購買原価.<p>
	 *
	 */
	public void purc_amt(long value) {
		setConstNumber(offset + 55, $purc_amt, value);
	}

	/**
	 * Purchase cost 購買原価.<p>
	 *
	 */
	public void purc_amt(float value) {
		setConstNumber(offset + 55, $purc_amt, value);
	}

	/**
	 * Purchase cost 購買原価.<p>
	 *
	 */
	public void purc_amt(double value) {
		setConstNumber(offset + 55, $purc_amt, value);
	}


	/**
	 * Mfg. receipt qty. 製造受入数量.<p>
	 *
	 */
	public MCNumber mfg_gr_qty() {
		return getConstNumber(offset + 56, $mfg_gr_qty);
	}

	/**
	 * Mfg. receipt qty. 製造受入数量.<p>
	 *
	 */
	public void mfg_gr_qty(MCNumber value) {
		setConstNumber(offset + 56, $mfg_gr_qty, value);
	}

	/**
	 * Mfg. receipt qty. 製造受入数量.<p>
	 *
	 */
	public void mfg_gr_qty(int value) {
		setConstNumber(offset + 56, $mfg_gr_qty, value);
	}

	/**
	 * Mfg. receipt qty. 製造受入数量.<p>
	 *
	 */
	public void mfg_gr_qty(long value) {
		setConstNumber(offset + 56, $mfg_gr_qty, value);
	}

	/**
	 * Mfg. receipt qty. 製造受入数量.<p>
	 *
	 */
	public void mfg_gr_qty(float value) {
		setConstNumber(offset + 56, $mfg_gr_qty, value);
	}

	/**
	 * Mfg. receipt qty. 製造受入数量.<p>
	 *
	 */
	public void mfg_gr_qty(double value) {
		setConstNumber(offset + 56, $mfg_gr_qty, value);
	}


	/**
	 * Mfg. receipt cost 製造受入原価.<p>
	 *
	 */
	public MCNumber mfg_gr_amt() {
		return getConstNumber(offset + 57, $mfg_gr_amt);
	}

	/**
	 * Mfg. receipt cost 製造受入原価.<p>
	 *
	 */
	public void mfg_gr_amt(MCNumber value) {
		setConstNumber(offset + 57, $mfg_gr_amt, value);
	}

	/**
	 * Mfg. receipt cost 製造受入原価.<p>
	 *
	 */
	public void mfg_gr_amt(int value) {
		setConstNumber(offset + 57, $mfg_gr_amt, value);
	}

	/**
	 * Mfg. receipt cost 製造受入原価.<p>
	 *
	 */
	public void mfg_gr_amt(long value) {
		setConstNumber(offset + 57, $mfg_gr_amt, value);
	}

	/**
	 * Mfg. receipt cost 製造受入原価.<p>
	 *
	 */
	public void mfg_gr_amt(float value) {
		setConstNumber(offset + 57, $mfg_gr_amt, value);
	}

	/**
	 * Mfg. receipt cost 製造受入原価.<p>
	 *
	 */
	public void mfg_gr_amt(double value) {
		setConstNumber(offset + 57, $mfg_gr_amt, value);
	}


	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public MCNumber othr_gr_qty() {
		return getConstNumber(offset + 58, $othr_gr_qty);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void othr_gr_qty(MCNumber value) {
		setConstNumber(offset + 58, $othr_gr_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void othr_gr_qty(int value) {
		setConstNumber(offset + 58, $othr_gr_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void othr_gr_qty(long value) {
		setConstNumber(offset + 58, $othr_gr_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void othr_gr_qty(float value) {
		setConstNumber(offset + 58, $othr_gr_qty, value);
	}

	/**
	 * GR qty. 入庫数量.<p>
	 *
	 */
	public void othr_gr_qty(double value) {
		setConstNumber(offset + 58, $othr_gr_qty, value);
	}


	/**
	 * GR cost 入庫原価.<p>
	 *
	 */
	public MCNumber othr_gr_amt() {
		return getConstNumber(offset + 59, $othr_gr_amt);
	}

	/**
	 * GR cost 入庫原価.<p>
	 *
	 */
	public void othr_gr_amt(MCNumber value) {
		setConstNumber(offset + 59, $othr_gr_amt, value);
	}

	/**
	 * GR cost 入庫原価.<p>
	 *
	 */
	public void othr_gr_amt(int value) {
		setConstNumber(offset + 59, $othr_gr_amt, value);
	}

	/**
	 * GR cost 入庫原価.<p>
	 *
	 */
	public void othr_gr_amt(long value) {
		setConstNumber(offset + 59, $othr_gr_amt, value);
	}

	/**
	 * GR cost 入庫原価.<p>
	 *
	 */
	public void othr_gr_amt(float value) {
		setConstNumber(offset + 59, $othr_gr_amt, value);
	}

	/**
	 * GR cost 入庫原価.<p>
	 *
	 */
	public void othr_gr_amt(double value) {
		setConstNumber(offset + 59, $othr_gr_amt, value);
	}


	/**
	 * General purpose allocation amount 汎用配賦金額.<p>
	 *
	 */
	public MCNumber alc_amt() {
		return getConstNumber(offset + 60, $alc_amt);
	}

	/**
	 * General purpose allocation amount 汎用配賦金額.<p>
	 *
	 */
	public void alc_amt(MCNumber value) {
		setConstNumber(offset + 60, $alc_amt, value);
	}

	/**
	 * General purpose allocation amount 汎用配賦金額.<p>
	 *
	 */
	public void alc_amt(int value) {
		setConstNumber(offset + 60, $alc_amt, value);
	}

	/**
	 * General purpose allocation amount 汎用配賦金額.<p>
	 *
	 */
	public void alc_amt(long value) {
		setConstNumber(offset + 60, $alc_amt, value);
	}

	/**
	 * General purpose allocation amount 汎用配賦金額.<p>
	 *
	 */
	public void alc_amt(float value) {
		setConstNumber(offset + 60, $alc_amt, value);
	}

	/**
	 * General purpose allocation amount 汎用配賦金額.<p>
	 *
	 */
	public void alc_amt(double value) {
		setConstNumber(offset + 60, $alc_amt, value);
	}


	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public MCNumber inpt_qty() {
		return getConstNumber(offset + 61, $inpt_qty);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(MCNumber value) {
		setConstNumber(offset + 61, $inpt_qty, value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(int value) {
		setConstNumber(offset + 61, $inpt_qty, value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(long value) {
		setConstNumber(offset + 61, $inpt_qty, value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(float value) {
		setConstNumber(offset + 61, $inpt_qty, value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void inpt_qty(double value) {
		setConstNumber(offset + 61, $inpt_qty, value);
	}


	/**
	 * Input cost 投入原価.<p>
	 *
	 */
	public MCNumber inpt_amt() {
		return getConstNumber(offset + 62, $inpt_amt);
	}

	/**
	 * Input cost 投入原価.<p>
	 *
	 */
	public void inpt_amt(MCNumber value) {
		setConstNumber(offset + 62, $inpt_amt, value);
	}

	/**
	 * Input cost 投入原価.<p>
	 *
	 */
	public void inpt_amt(int value) {
		setConstNumber(offset + 62, $inpt_amt, value);
	}

	/**
	 * Input cost 投入原価.<p>
	 *
	 */
	public void inpt_amt(long value) {
		setConstNumber(offset + 62, $inpt_amt, value);
	}

	/**
	 * Input cost 投入原価.<p>
	 *
	 */
	public void inpt_amt(float value) {
		setConstNumber(offset + 62, $inpt_amt, value);
	}

	/**
	 * Input cost 投入原価.<p>
	 *
	 */
	public void inpt_amt(double value) {
		setConstNumber(offset + 62, $inpt_amt, value);
	}


	/**
	 * Sales warehousing qty. 販売倉入数量.<p>
	 *
	 */
	public MCNumber plnt_gi_qty() {
		return getConstNumber(offset + 63, $plnt_gi_qty);
	}

	/**
	 * Sales warehousing qty. 販売倉入数量.<p>
	 *
	 */
	public void plnt_gi_qty(MCNumber value) {
		setConstNumber(offset + 63, $plnt_gi_qty, value);
	}

	/**
	 * Sales warehousing qty. 販売倉入数量.<p>
	 *
	 */
	public void plnt_gi_qty(int value) {
		setConstNumber(offset + 63, $plnt_gi_qty, value);
	}

	/**
	 * Sales warehousing qty. 販売倉入数量.<p>
	 *
	 */
	public void plnt_gi_qty(long value) {
		setConstNumber(offset + 63, $plnt_gi_qty, value);
	}

	/**
	 * Sales warehousing qty. 販売倉入数量.<p>
	 *
	 */
	public void plnt_gi_qty(float value) {
		setConstNumber(offset + 63, $plnt_gi_qty, value);
	}

	/**
	 * Sales warehousing qty. 販売倉入数量.<p>
	 *
	 */
	public void plnt_gi_qty(double value) {
		setConstNumber(offset + 63, $plnt_gi_qty, value);
	}


	/**
	 * Sales warehousing cost 販売倉入原価.<p>
	 *
	 */
	public MCNumber plnt_gi_amt() {
		return getConstNumber(offset + 64, $plnt_gi_amt);
	}

	/**
	 * Sales warehousing cost 販売倉入原価.<p>
	 *
	 */
	public void plnt_gi_amt(MCNumber value) {
		setConstNumber(offset + 64, $plnt_gi_amt, value);
	}

	/**
	 * Sales warehousing cost 販売倉入原価.<p>
	 *
	 */
	public void plnt_gi_amt(int value) {
		setConstNumber(offset + 64, $plnt_gi_amt, value);
	}

	/**
	 * Sales warehousing cost 販売倉入原価.<p>
	 *
	 */
	public void plnt_gi_amt(long value) {
		setConstNumber(offset + 64, $plnt_gi_amt, value);
	}

	/**
	 * Sales warehousing cost 販売倉入原価.<p>
	 *
	 */
	public void plnt_gi_amt(float value) {
		setConstNumber(offset + 64, $plnt_gi_amt, value);
	}

	/**
	 * Sales warehousing cost 販売倉入原価.<p>
	 *
	 */
	public void plnt_gi_amt(double value) {
		setConstNumber(offset + 64, $plnt_gi_amt, value);
	}


	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public MCNumber othr_gi_qty() {
		return getConstNumber(offset + 65, $othr_gi_qty);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void othr_gi_qty(MCNumber value) {
		setConstNumber(offset + 65, $othr_gi_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void othr_gi_qty(int value) {
		setConstNumber(offset + 65, $othr_gi_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void othr_gi_qty(long value) {
		setConstNumber(offset + 65, $othr_gi_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void othr_gi_qty(float value) {
		setConstNumber(offset + 65, $othr_gi_qty, value);
	}

	/**
	 * GI qty. 出庫数量.<p>
	 *
	 */
	public void othr_gi_qty(double value) {
		setConstNumber(offset + 65, $othr_gi_qty, value);
	}


	/**
	 * GI cost 出庫原価.<p>
	 *
	 */
	public MCNumber othr_gi_amt() {
		return getConstNumber(offset + 66, $othr_gi_amt);
	}

	/**
	 * GI cost 出庫原価.<p>
	 *
	 */
	public void othr_gi_amt(MCNumber value) {
		setConstNumber(offset + 66, $othr_gi_amt, value);
	}

	/**
	 * GI cost 出庫原価.<p>
	 *
	 */
	public void othr_gi_amt(int value) {
		setConstNumber(offset + 66, $othr_gi_amt, value);
	}

	/**
	 * GI cost 出庫原価.<p>
	 *
	 */
	public void othr_gi_amt(long value) {
		setConstNumber(offset + 66, $othr_gi_amt, value);
	}

	/**
	 * GI cost 出庫原価.<p>
	 *
	 */
	public void othr_gi_amt(float value) {
		setConstNumber(offset + 66, $othr_gi_amt, value);
	}

	/**
	 * GI cost 出庫原価.<p>
	 *
	 */
	public void othr_gi_amt(double value) {
		setConstNumber(offset + 66, $othr_gi_amt, value);
	}


	/**
	 * Chargeable supply qty. 有償支給数量.<p>
	 *
	 */
	public MCNumber prov_qty() {
		return getConstNumber(offset + 67, $prov_qty);
	}

	/**
	 * Chargeable supply qty. 有償支給数量.<p>
	 *
	 */
	public void prov_qty(MCNumber value) {
		setConstNumber(offset + 67, $prov_qty, value);
	}

	/**
	 * Chargeable supply qty. 有償支給数量.<p>
	 *
	 */
	public void prov_qty(int value) {
		setConstNumber(offset + 67, $prov_qty, value);
	}

	/**
	 * Chargeable supply qty. 有償支給数量.<p>
	 *
	 */
	public void prov_qty(long value) {
		setConstNumber(offset + 67, $prov_qty, value);
	}

	/**
	 * Chargeable supply qty. 有償支給数量.<p>
	 *
	 */
	public void prov_qty(float value) {
		setConstNumber(offset + 67, $prov_qty, value);
	}

	/**
	 * Chargeable supply qty. 有償支給数量.<p>
	 *
	 */
	public void prov_qty(double value) {
		setConstNumber(offset + 67, $prov_qty, value);
	}


	/**
	 * Chargeable supply cost 有償支給原価.<p>
	 *
	 */
	public MCNumber prov_amt() {
		return getConstNumber(offset + 68, $prov_amt);
	}

	/**
	 * Chargeable supply cost 有償支給原価.<p>
	 *
	 */
	public void prov_amt(MCNumber value) {
		setConstNumber(offset + 68, $prov_amt, value);
	}

	/**
	 * Chargeable supply cost 有償支給原価.<p>
	 *
	 */
	public void prov_amt(int value) {
		setConstNumber(offset + 68, $prov_amt, value);
	}

	/**
	 * Chargeable supply cost 有償支給原価.<p>
	 *
	 */
	public void prov_amt(long value) {
		setConstNumber(offset + 68, $prov_amt, value);
	}

	/**
	 * Chargeable supply cost 有償支給原価.<p>
	 *
	 */
	public void prov_amt(float value) {
		setConstNumber(offset + 68, $prov_amt, value);
	}

	/**
	 * Chargeable supply cost 有償支給原価.<p>
	 *
	 */
	public void prov_amt(double value) {
		setConstNumber(offset + 68, $prov_amt, value);
	}


	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public MCNumber sls_qty() {
		return getConstNumber(offset + 69, $sls_qty);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(MCNumber value) {
		setConstNumber(offset + 69, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(int value) {
		setConstNumber(offset + 69, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(long value) {
		setConstNumber(offset + 69, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(float value) {
		setConstNumber(offset + 69, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(double value) {
		setConstNumber(offset + 69, $sls_qty, value);
	}


	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 70, $sls_amt);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 70, $sls_amt, value);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 70, $sls_amt, value);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 70, $sls_amt, value);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 70, $sls_amt, value);
	}

	/**
	 * Cost of goods sold 売上原価.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 70, $sls_amt, value);
	}


	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public MCNumber end_stk_qty() {
		return getConstNumber(offset + 71, $end_stk_qty);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(MCNumber value) {
		setConstNumber(offset + 71, $end_stk_qty, value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(int value) {
		setConstNumber(offset + 71, $end_stk_qty, value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(long value) {
		setConstNumber(offset + 71, $end_stk_qty, value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(float value) {
		setConstNumber(offset + 71, $end_stk_qty, value);
	}

	/**
	 * Ending inventory qty. 月末在庫数量.<p>
	 *
	 */
	public void end_stk_qty(double value) {
		setConstNumber(offset + 71, $end_stk_qty, value);
	}


	/**
	 * Ending inventory cost 月末在庫原価.<p>
	 *
	 */
	public MCNumber end_stk_amt() {
		return getConstNumber(offset + 72, $end_stk_amt);
	}

	/**
	 * Ending inventory cost 月末在庫原価.<p>
	 *
	 */
	public void end_stk_amt(MCNumber value) {
		setConstNumber(offset + 72, $end_stk_amt, value);
	}

	/**
	 * Ending inventory cost 月末在庫原価.<p>
	 *
	 */
	public void end_stk_amt(int value) {
		setConstNumber(offset + 72, $end_stk_amt, value);
	}

	/**
	 * Ending inventory cost 月末在庫原価.<p>
	 *
	 */
	public void end_stk_amt(long value) {
		setConstNumber(offset + 72, $end_stk_amt, value);
	}

	/**
	 * Ending inventory cost 月末在庫原価.<p>
	 *
	 */
	public void end_stk_amt(float value) {
		setConstNumber(offset + 72, $end_stk_amt, value);
	}

	/**
	 * Ending inventory cost 月末在庫原価.<p>
	 *
	 */
	public void end_stk_amt(double value) {
		setConstNumber(offset + 72, $end_stk_amt, value);
	}


	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public MCNumber diff_qty() {
		return getConstNumber(offset + 73, $diff_qty);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void diff_qty(MCNumber value) {
		setConstNumber(offset + 73, $diff_qty, value);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void diff_qty(int value) {
		setConstNumber(offset + 73, $diff_qty, value);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void diff_qty(long value) {
		setConstNumber(offset + 73, $diff_qty, value);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void diff_qty(float value) {
		setConstNumber(offset + 73, $diff_qty, value);
	}

	/**
	 * Quantity difference 数量差.<p>
	 *
	 */
	public void diff_qty(double value) {
		setConstNumber(offset + 73, $diff_qty, value);
	}


	/**
	 * Amount variance 金額差.<p>
	 *
	 */
	public MCNumber diff_amt() {
		return getConstNumber(offset + 74, $diff_amt);
	}

	/**
	 * Amount variance 金額差.<p>
	 *
	 */
	public void diff_amt(MCNumber value) {
		setConstNumber(offset + 74, $diff_amt, value);
	}

	/**
	 * Amount variance 金額差.<p>
	 *
	 */
	public void diff_amt(int value) {
		setConstNumber(offset + 74, $diff_amt, value);
	}

	/**
	 * Amount variance 金額差.<p>
	 *
	 */
	public void diff_amt(long value) {
		setConstNumber(offset + 74, $diff_amt, value);
	}

	/**
	 * Amount variance 金額差.<p>
	 *
	 */
	public void diff_amt(float value) {
		setConstNumber(offset + 74, $diff_amt, value);
	}

	/**
	 * Amount variance 金額差.<p>
	 *
	 */
	public void diff_amt(double value) {
		setConstNumber(offset + 74, $diff_amt, value);
	}


	/**
	 * Expenses input qty. 経費投入数量.<p>
	 *
	 */
	public MCNumber xpns_inpt_qty() {
		return getConstNumber(offset + 75, $xpns_inpt_qty);
	}

	/**
	 * Expenses input qty. 経費投入数量.<p>
	 *
	 */
	public void xpns_inpt_qty(MCNumber value) {
		setConstNumber(offset + 75, $xpns_inpt_qty, value);
	}

	/**
	 * Expenses input qty. 経費投入数量.<p>
	 *
	 */
	public void xpns_inpt_qty(int value) {
		setConstNumber(offset + 75, $xpns_inpt_qty, value);
	}

	/**
	 * Expenses input qty. 経費投入数量.<p>
	 *
	 */
	public void xpns_inpt_qty(long value) {
		setConstNumber(offset + 75, $xpns_inpt_qty, value);
	}

	/**
	 * Expenses input qty. 経費投入数量.<p>
	 *
	 */
	public void xpns_inpt_qty(float value) {
		setConstNumber(offset + 75, $xpns_inpt_qty, value);
	}

	/**
	 * Expenses input qty. 経費投入数量.<p>
	 *
	 */
	public void xpns_inpt_qty(double value) {
		setConstNumber(offset + 75, $xpns_inpt_qty, value);
	}


	/**
	 * Expenses input costs 経費投入原価.<p>
	 *
	 */
	public MCNumber xpns_inpt_amt() {
		return getConstNumber(offset + 76, $xpns_inpt_amt);
	}

	/**
	 * Expenses input costs 経費投入原価.<p>
	 *
	 */
	public void xpns_inpt_amt(MCNumber value) {
		setConstNumber(offset + 76, $xpns_inpt_amt, value);
	}

	/**
	 * Expenses input costs 経費投入原価.<p>
	 *
	 */
	public void xpns_inpt_amt(int value) {
		setConstNumber(offset + 76, $xpns_inpt_amt, value);
	}

	/**
	 * Expenses input costs 経費投入原価.<p>
	 *
	 */
	public void xpns_inpt_amt(long value) {
		setConstNumber(offset + 76, $xpns_inpt_amt, value);
	}

	/**
	 * Expenses input costs 経費投入原価.<p>
	 *
	 */
	public void xpns_inpt_amt(float value) {
		setConstNumber(offset + 76, $xpns_inpt_amt, value);
	}

	/**
	 * Expenses input costs 経費投入原価.<p>
	 *
	 */
	public void xpns_inpt_amt(double value) {
		setConstNumber(offset + 76, $xpns_inpt_amt, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			return ave_upri();
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			return st_stk_qty();
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			return st_stk_amt();
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			return mfg_qty();
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			return mfg_amt();
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			return purc_qty();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			return mfg_gr_qty();
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			return mfg_gr_amt();
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			return othr_gr_qty();
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			return othr_gr_amt();
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			return alc_amt();
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			return inpt_qty();
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			return inpt_amt();
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			return plnt_gi_qty();
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			return plnt_gi_amt();
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			return othr_gi_qty();
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			return othr_gi_amt();
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			return prov_qty();
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			return prov_amt();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			return end_stk_qty();
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			return end_stk_amt();
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			return diff_qty();
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			return diff_amt();
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			return xpns_inpt_qty();
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			return xpns_inpt_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			return dummy_term();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			return ave_upri();
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			return st_stk_qty();
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			return st_stk_amt();
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			return mfg_qty();
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			return mfg_amt();
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			return purc_qty();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			return mfg_gr_qty();
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			return mfg_gr_amt();
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			return othr_gr_qty();
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			return othr_gr_amt();
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			return alc_amt();
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			return inpt_qty();
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			return inpt_amt();
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			return plnt_gi_qty();
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			return plnt_gi_amt();
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			return othr_gi_qty();
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			return othr_gi_amt();
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			return prov_qty();
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			return prov_amt();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			return end_stk_qty();
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			return end_stk_amt();
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			return diff_qty();
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			return diff_amt();
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			return xpns_inpt_qty();
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			return xpns_inpt_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			return dummy_term();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			dummy_term(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dummy_term.equalsIgnoreCase(name)) {
			dummy_term(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

