package mcframe.serverMABC.MABCL0870;

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
 * ブロック"ItmCopy_DelChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ItmCopy_DelChk01_DtlR_MC_A extends MCConstRow {

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
	 * Item 品目.<p>
	 *
	 */
	public static final String $itm_flg = "itm_flg";
	/**
	 * Item auxiliary 品目補助.<p>
	 *
	 */
	public static final String $itm_sub_flg = "itm_sub_flg";
	/**
	 * Item unit 品目単位.<p>
	 *
	 */
	public static final String $itm_unit_flg = "itm_unit_flg";
	/**
	 * Item additional info. 品目付加情報.<p>
	 *
	 */
	public static final String $attach_info_flg = "attach_info_flg";
	/**
	 * Item prohibit 品目禁止.<p>
	 *
	 */
	public static final String $itm_stop_flg = "itm_stop_flg";
	/**
	 * Item procurement disapproval 品目手配不許可.<p>
	 *
	 */
	public static final String $itm_not_fix_flg = "itm_not_fix_flg";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $stdcost_flg = "stdcost_flg";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Item storage 品目格納先.<p>
	 *
	 */
	public static final String $itm_strg_flg = "itm_strg_flg";
	/**
	 * Mfg. allocation control 製造引当制御.<p>
	 *
	 */
	public static final String $alloc_ctl_flg = "alloc_ctl_flg";
	/**
	 * Inventory replenishment 在庫補充.<p>
	 *
	 */
	public static final String $stk_rpl_flg = "stk_rpl_flg";
	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public static final String $alt_itm_flg = "alt_itm_flg";
	/**
	 * Item (WG) 品目（ＷＧ）.<p>
	 *
	 */
	public static final String $itm_wg_flg = "itm_wg_flg";
	/**
	 * Item details 品目詳細.<p>
	 *
	 */
	public static final String $itm_dtl_flg = "itm_dtl_flg";
	/**
	 * Item operation 品目工程.<p>
	 *
	 */
	public static final String $itm_oper_flg = "itm_oper_flg";
	/**
	 * BOM (Parent) ＢＯＭ（親）.<p>
	 *
	 */
	public static final String $bom_par_flg = "bom_par_flg";
	/**
	 * BOM (Child) ＢＯＭ（子）.<p>
	 *
	 */
	public static final String $bom_chd_flg = "bom_chd_flg";
	/**
	 * Operation man-hour 工程工数.<p>
	 *
	 */
	public static final String $oper_wk_cost_flg = "oper_wk_cost_flg";
	/**
	 * Item inspection pattern 品目検査パタン.<p>
	 *
	 */
	public static final String $itm_insp_ptn_flg = "itm_insp_ptn_flg";
	/**
	 * Item inspection 品目品管.<p>
	 *
	 */
	public static final String $itm_insp_flg = "itm_insp_flg";
	/**
	 * Item inspection specific 品目検査規格.<p>
	 *
	 */
	public static final String $insp_spec_flg = "insp_spec_flg";
	/**
	 * Item (Factory/Distribution warehouse) 品目（工場・物流倉庫）.<p>
	 *
	 */
	public static final String $itm_site_flg = "itm_site_flg";
	/**
	 * Version 版.<p>
	 *
	 */
	public static final String $itm_ver_flg = "itm_ver_flg";
	/**
	 * Lot copy (To) ロット継承先.<p>
	 *
	 */
	public static final String $lot_inh_dest_flg = "lot_inh_dest_flg";
	/**
	 * Lot copy (From) ロット継承元.<p>
	 *
	 */
	public static final String $lot_inh_src_flg = "lot_inh_src_flg";
	/**
	 * Item specification 品目仕様.<p>
	 *
	 */
	public static final String $itm_spec_flg = "itm_spec_flg";
	/**
	 * Item specification detail 品目仕様項目.<p>
	 *
	 */
	public static final String $itm_spec_desc_flg = "itm_spec_desc_flg";
	/**
	 * Item structure (Main item) 品目構成（主品目）.<p>
	 *
	 */
	public static final String $itm_comp_core_flg = "itm_comp_core_flg";
	/**
	 * Item structure (Component) 品目構成（構成品目）.<p>
	 *
	 */
	public static final String $itm_comp_comp_flg = "itm_comp_comp_flg";
	/**
	 * MPS item ＭＰＳ品目.<p>
	 *
	 */
	public static final String $mps_itm_flg = "mps_itm_flg";
	/**
	 * Sales plan item configuration 販売計画品目構成.<p>
	 *
	 */
	public static final String $spln_itm_conf_flg = "spln_itm_conf_flg";
	/**
	 * Direct delivery LT 仕入直送ＬＴ.<p>
	 *
	 */
	public static final String $purc_ddlv_lt_flg = "purc_ddlv_lt_flg";
	/**
	 * BP item 取引先品目.<p>
	 *
	 */
	public static final String $bp_itm_flg = "bp_itm_flg";
	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public static final String $proc_upri_flg = "proc_upri_flg";
	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public static final String $prov_upri_flg = "prov_upri_flg";
	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public static final String $purc_upri_flg = "purc_upri_flg";
	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public static final String $std_sls_upri_flg = "std_sls_upri_flg";
	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public static final String $itm_sls_upri_flg = "itm_sls_upri_flg";
	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public static final String $cst_sls_upri_flg = "cst_sls_upri_flg";
	/**
	 * Assortment (Representative item) 品揃（代表品目）.<p>
	 *
	 */
	public static final String $set_itm_main_flg = "set_itm_main_flg";
	/**
	 * Assortment (Assortment item) 品揃（品揃品目）.<p>
	 *
	 */
	public static final String $set_itm_set_flg = "set_itm_set_flg";
	/**
	 * IF code conversion ＩＦコード変換.<p>
	 *
	 */
	public static final String $if_x_flg = "if_x_flg";
	/**
	 * Cost item category structure 原価品群構成.<p>
	 *
	 */
	public static final String $ctg_config_flg = "ctg_config_flg";
	/**
	 * Auto-journal pattern 自動仕訳パタン.<p>
	 *
	 */
	public static final String $jnl_ptn_flg = "jnl_ptn_flg";
	/**
	 * Allocation coefficient structure 配賦係数構成.<p>
	 *
	 */
	public static final String $coef_config_flg = "coef_config_flg";
	/**
	 * Cost element allocation 費目配賦.<p>
	 *
	 */
	public static final String $alc_expns_flg = "alc_expns_flg";
	/**
	 * Input allocation 投入配賦.<p>
	 *
	 */
	public static final String $alc_inpt_flg = "alc_inpt_flg";
	/**
	 * Not costing item 原価対象外品目.<p>
	 *
	 */
	public static final String $cost_itm_out_flg = "cost_itm_out_flg";
	/**
	 * Expenses allocation transfer 経費配賦振替.<p>
	 *
	 */
	public static final String $xpns_purc_alc_flg = "xpns_purc_alc_flg";
	/**
	 * Item (Distribution group) 品目（物流グループ）.<p>
	 *
	 */
	public static final String $itm_lg_grp_flg = "itm_lg_grp_flg";
	/**
	 * Item rack/line 品目棚・ライン.<p>
	 *
	 */
	public static final String $itm_str_ln_flg = "itm_str_ln_flg";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_flg_META = createCommonMeta($itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_sub_flg_META = createCommonMeta($itm_sub_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_unit_flg_META = createCommonMeta($itm_unit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta attach_info_flg_META = createCommonMeta($attach_info_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_stop_flg_META = createCommonMeta($itm_stop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_not_fix_flg_META = createCommonMeta($itm_not_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stdcost_flg_META = createCommonMeta($stdcost_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_strg_flg_META = createCommonMeta($itm_strg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_ctl_flg_META = createCommonMeta($alloc_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_rpl_flg_META = createCommonMeta($stk_rpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alt_itm_flg_META = createCommonMeta($alt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_wg_flg_META = createCommonMeta($itm_wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_dtl_flg_META = createCommonMeta($itm_dtl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_oper_flg_META = createCommonMeta($itm_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bom_par_flg_META = createCommonMeta($bom_par_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bom_chd_flg_META = createCommonMeta($bom_chd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_wk_cost_flg_META = createCommonMeta($oper_wk_cost_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_insp_ptn_flg_META = createCommonMeta($itm_insp_ptn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_insp_flg_META = createCommonMeta($itm_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_spec_flg_META = createCommonMeta($insp_spec_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_site_flg_META = createCommonMeta($itm_site_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_ver_flg_META = createCommonMeta($itm_ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_inh_dest_flg_META = createCommonMeta($lot_inh_dest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_inh_src_flg_META = createCommonMeta($lot_inh_src_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_spec_flg_META = createCommonMeta($itm_spec_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_spec_desc_flg_META = createCommonMeta($itm_spec_desc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_comp_core_flg_META = createCommonMeta($itm_comp_core_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_comp_comp_flg_META = createCommonMeta($itm_comp_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mps_itm_flg_META = createCommonMeta($mps_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spln_itm_conf_flg_META = createCommonMeta($spln_itm_conf_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ddlv_lt_flg_META = createCommonMeta($purc_ddlv_lt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_itm_flg_META = createCommonMeta($bp_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta proc_upri_flg_META = createCommonMeta($proc_upri_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_upri_flg_META = createCommonMeta($prov_upri_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_upri_flg_META = createCommonMeta($purc_upri_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_sls_upri_flg_META = createCommonMeta($std_sls_upri_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_sls_upri_flg_META = createCommonMeta($itm_sls_upri_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_sls_upri_flg_META = createCommonMeta($cst_sls_upri_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta set_itm_main_flg_META = createCommonMeta($set_itm_main_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta set_itm_set_flg_META = createCommonMeta($set_itm_set_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta if_x_flg_META = createCommonMeta($if_x_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ctg_config_flg_META = createCommonMeta($ctg_config_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta jnl_ptn_flg_META = createCommonMeta($jnl_ptn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta coef_config_flg_META = createCommonMeta($coef_config_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alc_expns_flg_META = createCommonMeta($alc_expns_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alc_inpt_flg_META = createCommonMeta($alc_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cost_itm_out_flg_META = createCommonMeta($cost_itm_out_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xpns_purc_alc_flg_META = createCommonMeta($xpns_purc_alc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_lg_grp_flg_META = createCommonMeta($itm_lg_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_str_ln_flg_META = createCommonMeta($itm_str_ln_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ItmCopy_DelChk01_DtlR> constMetas = new ConstMetaList<ItmCopy_DelChk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_flg_META,
			itm_sub_flg_META,
			itm_unit_flg_META,
			attach_info_flg_META,
			itm_stop_flg_META,
			itm_not_fix_flg_META,
			stdcost_flg_META,
			sundry_itm_flg_META,
			itm_strg_flg_META,
			alloc_ctl_flg_META,
			stk_rpl_flg_META,
			alt_itm_flg_META,
			itm_wg_flg_META,
			itm_dtl_flg_META,
			itm_oper_flg_META,
			bom_par_flg_META,
			bom_chd_flg_META,
			oper_wk_cost_flg_META,
			itm_insp_ptn_flg_META,
			itm_insp_flg_META,
			insp_spec_flg_META,
			itm_site_flg_META,
			itm_ver_flg_META,
			lot_inh_dest_flg_META,
			lot_inh_src_flg_META,
			itm_spec_flg_META,
			itm_spec_desc_flg_META,
			itm_comp_core_flg_META,
			itm_comp_comp_flg_META,
			mps_itm_flg_META,
			spln_itm_conf_flg_META,
			purc_ddlv_lt_flg_META,
			bp_itm_flg_META,
			proc_upri_flg_META,
			prov_upri_flg_META,
			purc_upri_flg_META,
			std_sls_upri_flg_META,
			itm_sls_upri_flg_META,
			cst_sls_upri_flg_META,
			set_itm_main_flg_META,
			set_itm_set_flg_META,
			if_x_flg_META,
			ctg_config_flg_META,
			jnl_ptn_flg_META,
			coef_config_flg_META,
			alc_expns_flg_META,
			alc_inpt_flg_META,
			cost_itm_out_flg_META,
			xpns_purc_alc_flg_META,
			itm_lg_grp_flg_META,
			itm_str_ln_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[TNAME]のキー定数 */
	public static final String $$TNAME = "TNAME";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$TNAME, new MCExtList(
			new String[][]{
				{$itm_flg, "MAM_ITM_"},	// itm_flg
				{$itm_sub_flg, "MAM_ITM_SUB"},	// itm_sub_flg
				{$itm_unit_flg, "MAM_ITM_UNIT_"},	// itm_unit_flg
				{$attach_info_flg, "MAM_ATTACH_INFO"},	// attach_info_flg
				{$itm_stop_flg, "MAM_ITM_STOP"},	// itm_stop_flg
				{$itm_not_fix_flg, "MAM_ITM_NOT_FIX"},	// itm_not_fix_flg
				{$stdcost_flg, "MAM_STDCOST_"},	// stdcost_flg
				{$sundry_itm_flg, "MAM_SUNDRY_ITM"},	// sundry_itm_flg
				{$itm_strg_flg, "MAM_ITM_STRG"},	// itm_strg_flg
				{$alloc_ctl_flg, "MAM_ALLOC_CTL"},	// alloc_ctl_flg
				{$stk_rpl_flg, "MAM_STK_RPL"},	// stk_rpl_flg
				{$alt_itm_flg, "MAM_ALT_ITM"},	// alt_itm_flg
				{$itm_wg_flg, "MAM_ITM_WG_"},	// itm_wg_flg
				{$itm_dtl_flg, "MAM_ITM_DTL_"},	// itm_dtl_flg
				{$itm_oper_flg, "MAM_ITM_OPER"},	// itm_oper_flg
				{$bom_par_flg, "MAM_BOM"},	// bom_par_flg
				{$bom_chd_flg, "MAM_BOM"},	// bom_chd_flg
				{$oper_wk_cost_flg, "MAM_OPER_WK_COST"},	// oper_wk_cost_flg
				{$itm_insp_ptn_flg, "MAM_ITM_INSP_PTN"},	// itm_insp_ptn_flg
				{$itm_insp_flg, "MAM_ITM_INSP"},	// itm_insp_flg
				{$insp_spec_flg, "MAM_INSP_SPEC"},	// insp_spec_flg
				{$itm_site_flg, "MAM_ITM_SITE"},	// itm_site_flg
				{$itm_ver_flg, "MAM_ITM_VER"},	// itm_ver_flg
				{$lot_inh_dest_flg, "MAM_LOT_INH_DEST"},	// lot_inh_dest_flg
				{$lot_inh_src_flg, "MAM_LOT_INH_SRC"},	// lot_inh_src_flg
				{$itm_spec_flg, "MAM_ITM_SPEC"},	// itm_spec_flg
				{$itm_spec_desc_flg, "MAM_ITM_SPEC_DESC"},	// itm_spec_desc_flg
				{$itm_comp_core_flg, "MAM_ITM_COMP"},	// itm_comp_core_flg
				{$itm_comp_comp_flg, "MAM_ITM_COMP"},	// itm_comp_comp_flg
				{$mps_itm_flg, "MAM_MPS_ITM_"},	// mps_itm_flg
				{$spln_itm_conf_flg, "MAM_SPLN_ITM_CONF"},	// spln_itm_conf_flg
				{$purc_ddlv_lt_flg, "MAM_PURC_DDLV_LT"},	// purc_ddlv_lt_flg
				{$bp_itm_flg, "MAM_BP_ITM"},	// bp_itm_flg
				{$proc_upri_flg, "MAM_PROC_UPRI_"},	// proc_upri_flg
				{$prov_upri_flg, "MAM_PROV_UPRI_"},	// prov_upri_flg
				{$purc_upri_flg, "MAM_PURC_UPRI_"},	// purc_upri_flg
				{$std_sls_upri_flg, "MAM_STD_SLS_UPRI_"},	// std_sls_upri_flg
				{$itm_sls_upri_flg, "MAM_ITM_SLS_UPRI_"},	// itm_sls_upri_flg
				{$cst_sls_upri_flg, "MAM_CST_SLS_UPRI_"},	// cst_sls_upri_flg
				{$set_itm_main_flg, "MAM_SET_ITM"},	// set_itm_main_flg
				{$set_itm_set_flg, "MAM_SET_ITM"},	// set_itm_set_flg
				{$if_x_flg, "MAM_IF_X"},	// if_x_flg
				{$ctg_config_flg, "MAM_CTG_CONFIG"},	// ctg_config_flg
				{$jnl_ptn_flg, "MAM_JNL_PTN"},	// jnl_ptn_flg
				{$coef_config_flg, "MAM_COEF_CONFIG"},	// coef_config_flg
				{$alc_expns_flg, "MAM_ALC_EXPNS"},	// alc_expns_flg
				{$alc_inpt_flg, "MAM_ALC_INPT"},	// alc_inpt_flg
				{$cost_itm_out_flg, "MAM_COST_ITM_OUT"},	// cost_itm_out_flg
				{$xpns_purc_alc_flg, "MAM_XPNS_PURC_ALC"},	// xpns_purc_alc_flg
				{$itm_lg_grp_flg, "MAM_ITM_LG_GRP"},	// itm_lg_grp_flg
				{$itm_str_ln_flg, "MAM_ITM_STR_LN"}	// itm_str_ln_flg
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$itm_cd, "E"},	// itm_cd
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
	protected ItmCopy_DelChk01_DtlR_MC_A(ConstMetaList<? extends ItmCopy_DelChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmCopy_DelChk01_DtlR clone() {
		return (ItmCopy_DelChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmCopy_DelChk01_DtlR createInstance() {
		return (ItmCopy_DelChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmCopy_DelChk01_DtlR getValues(String... names) {
		return (ItmCopy_DelChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public boolean itm_flg() {
		return getConstBoolean(offset + 4, $itm_flg);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_flg(boolean value) {
		setConstBoolean(offset + 4, $itm_flg, value);
	}


	/**
	 * Item auxiliary 品目補助.<p>
	 *
	 */
	public boolean itm_sub_flg() {
		return getConstBoolean(offset + 5, $itm_sub_flg);
	}

	/**
	 * Item auxiliary 品目補助.<p>
	 *
	 */
	public void itm_sub_flg(boolean value) {
		setConstBoolean(offset + 5, $itm_sub_flg, value);
	}


	/**
	 * Item unit 品目単位.<p>
	 *
	 */
	public boolean itm_unit_flg() {
		return getConstBoolean(offset + 6, $itm_unit_flg);
	}

	/**
	 * Item unit 品目単位.<p>
	 *
	 */
	public void itm_unit_flg(boolean value) {
		setConstBoolean(offset + 6, $itm_unit_flg, value);
	}


	/**
	 * Item additional info. 品目付加情報.<p>
	 *
	 */
	public boolean attach_info_flg() {
		return getConstBoolean(offset + 7, $attach_info_flg);
	}

	/**
	 * Item additional info. 品目付加情報.<p>
	 *
	 */
	public void attach_info_flg(boolean value) {
		setConstBoolean(offset + 7, $attach_info_flg, value);
	}


	/**
	 * Item prohibit 品目禁止.<p>
	 *
	 */
	public boolean itm_stop_flg() {
		return getConstBoolean(offset + 8, $itm_stop_flg);
	}

	/**
	 * Item prohibit 品目禁止.<p>
	 *
	 */
	public void itm_stop_flg(boolean value) {
		setConstBoolean(offset + 8, $itm_stop_flg, value);
	}


	/**
	 * Item procurement disapproval 品目手配不許可.<p>
	 *
	 */
	public boolean itm_not_fix_flg() {
		return getConstBoolean(offset + 9, $itm_not_fix_flg);
	}

	/**
	 * Item procurement disapproval 品目手配不許可.<p>
	 *
	 */
	public void itm_not_fix_flg(boolean value) {
		setConstBoolean(offset + 9, $itm_not_fix_flg, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public boolean stdcost_flg() {
		return getConstBoolean(offset + 10, $stdcost_flg);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void stdcost_flg(boolean value) {
		setConstBoolean(offset + 10, $stdcost_flg, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 11, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 11, $sundry_itm_flg, value);
	}


	/**
	 * Item storage 品目格納先.<p>
	 *
	 */
	public boolean itm_strg_flg() {
		return getConstBoolean(offset + 12, $itm_strg_flg);
	}

	/**
	 * Item storage 品目格納先.<p>
	 *
	 */
	public void itm_strg_flg(boolean value) {
		setConstBoolean(offset + 12, $itm_strg_flg, value);
	}


	/**
	 * Mfg. allocation control 製造引当制御.<p>
	 *
	 */
	public boolean alloc_ctl_flg() {
		return getConstBoolean(offset + 13, $alloc_ctl_flg);
	}

	/**
	 * Mfg. allocation control 製造引当制御.<p>
	 *
	 */
	public void alloc_ctl_flg(boolean value) {
		setConstBoolean(offset + 13, $alloc_ctl_flg, value);
	}


	/**
	 * Inventory replenishment 在庫補充.<p>
	 *
	 */
	public boolean stk_rpl_flg() {
		return getConstBoolean(offset + 14, $stk_rpl_flg);
	}

	/**
	 * Inventory replenishment 在庫補充.<p>
	 *
	 */
	public void stk_rpl_flg(boolean value) {
		setConstBoolean(offset + 14, $stk_rpl_flg, value);
	}


	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public boolean alt_itm_flg() {
		return getConstBoolean(offset + 15, $alt_itm_flg);
	}

	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public void alt_itm_flg(boolean value) {
		setConstBoolean(offset + 15, $alt_itm_flg, value);
	}


	/**
	 * Item (WG) 品目（ＷＧ）.<p>
	 *
	 */
	public boolean itm_wg_flg() {
		return getConstBoolean(offset + 16, $itm_wg_flg);
	}

	/**
	 * Item (WG) 品目（ＷＧ）.<p>
	 *
	 */
	public void itm_wg_flg(boolean value) {
		setConstBoolean(offset + 16, $itm_wg_flg, value);
	}


	/**
	 * Item details 品目詳細.<p>
	 *
	 */
	public boolean itm_dtl_flg() {
		return getConstBoolean(offset + 17, $itm_dtl_flg);
	}

	/**
	 * Item details 品目詳細.<p>
	 *
	 */
	public void itm_dtl_flg(boolean value) {
		setConstBoolean(offset + 17, $itm_dtl_flg, value);
	}


	/**
	 * Item operation 品目工程.<p>
	 *
	 */
	public boolean itm_oper_flg() {
		return getConstBoolean(offset + 18, $itm_oper_flg);
	}

	/**
	 * Item operation 品目工程.<p>
	 *
	 */
	public void itm_oper_flg(boolean value) {
		setConstBoolean(offset + 18, $itm_oper_flg, value);
	}


	/**
	 * BOM (Parent) ＢＯＭ（親）.<p>
	 *
	 */
	public boolean bom_par_flg() {
		return getConstBoolean(offset + 19, $bom_par_flg);
	}

	/**
	 * BOM (Parent) ＢＯＭ（親）.<p>
	 *
	 */
	public void bom_par_flg(boolean value) {
		setConstBoolean(offset + 19, $bom_par_flg, value);
	}


	/**
	 * BOM (Child) ＢＯＭ（子）.<p>
	 *
	 */
	public boolean bom_chd_flg() {
		return getConstBoolean(offset + 20, $bom_chd_flg);
	}

	/**
	 * BOM (Child) ＢＯＭ（子）.<p>
	 *
	 */
	public void bom_chd_flg(boolean value) {
		setConstBoolean(offset + 20, $bom_chd_flg, value);
	}


	/**
	 * Operation man-hour 工程工数.<p>
	 *
	 */
	public boolean oper_wk_cost_flg() {
		return getConstBoolean(offset + 21, $oper_wk_cost_flg);
	}

	/**
	 * Operation man-hour 工程工数.<p>
	 *
	 */
	public void oper_wk_cost_flg(boolean value) {
		setConstBoolean(offset + 21, $oper_wk_cost_flg, value);
	}


	/**
	 * Item inspection pattern 品目検査パタン.<p>
	 *
	 */
	public boolean itm_insp_ptn_flg() {
		return getConstBoolean(offset + 22, $itm_insp_ptn_flg);
	}

	/**
	 * Item inspection pattern 品目検査パタン.<p>
	 *
	 */
	public void itm_insp_ptn_flg(boolean value) {
		setConstBoolean(offset + 22, $itm_insp_ptn_flg, value);
	}


	/**
	 * Item inspection 品目品管.<p>
	 *
	 */
	public boolean itm_insp_flg() {
		return getConstBoolean(offset + 23, $itm_insp_flg);
	}

	/**
	 * Item inspection 品目品管.<p>
	 *
	 */
	public void itm_insp_flg(boolean value) {
		setConstBoolean(offset + 23, $itm_insp_flg, value);
	}


	/**
	 * Item inspection specific 品目検査規格.<p>
	 *
	 */
	public boolean insp_spec_flg() {
		return getConstBoolean(offset + 24, $insp_spec_flg);
	}

	/**
	 * Item inspection specific 品目検査規格.<p>
	 *
	 */
	public void insp_spec_flg(boolean value) {
		setConstBoolean(offset + 24, $insp_spec_flg, value);
	}


	/**
	 * Item (Factory/Distribution warehouse) 品目（工場・物流倉庫）.<p>
	 *
	 */
	public boolean itm_site_flg() {
		return getConstBoolean(offset + 25, $itm_site_flg);
	}

	/**
	 * Item (Factory/Distribution warehouse) 品目（工場・物流倉庫）.<p>
	 *
	 */
	public void itm_site_flg(boolean value) {
		setConstBoolean(offset + 25, $itm_site_flg, value);
	}


	/**
	 * Version 版.<p>
	 *
	 */
	public boolean itm_ver_flg() {
		return getConstBoolean(offset + 26, $itm_ver_flg);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void itm_ver_flg(boolean value) {
		setConstBoolean(offset + 26, $itm_ver_flg, value);
	}


	/**
	 * Lot copy (To) ロット継承先.<p>
	 *
	 */
	public boolean lot_inh_dest_flg() {
		return getConstBoolean(offset + 27, $lot_inh_dest_flg);
	}

	/**
	 * Lot copy (To) ロット継承先.<p>
	 *
	 */
	public void lot_inh_dest_flg(boolean value) {
		setConstBoolean(offset + 27, $lot_inh_dest_flg, value);
	}


	/**
	 * Lot copy (From) ロット継承元.<p>
	 *
	 */
	public boolean lot_inh_src_flg() {
		return getConstBoolean(offset + 28, $lot_inh_src_flg);
	}

	/**
	 * Lot copy (From) ロット継承元.<p>
	 *
	 */
	public void lot_inh_src_flg(boolean value) {
		setConstBoolean(offset + 28, $lot_inh_src_flg, value);
	}


	/**
	 * Item specification 品目仕様.<p>
	 *
	 */
	public boolean itm_spec_flg() {
		return getConstBoolean(offset + 29, $itm_spec_flg);
	}

	/**
	 * Item specification 品目仕様.<p>
	 *
	 */
	public void itm_spec_flg(boolean value) {
		setConstBoolean(offset + 29, $itm_spec_flg, value);
	}


	/**
	 * Item specification detail 品目仕様項目.<p>
	 *
	 */
	public boolean itm_spec_desc_flg() {
		return getConstBoolean(offset + 30, $itm_spec_desc_flg);
	}

	/**
	 * Item specification detail 品目仕様項目.<p>
	 *
	 */
	public void itm_spec_desc_flg(boolean value) {
		setConstBoolean(offset + 30, $itm_spec_desc_flg, value);
	}


	/**
	 * Item structure (Main item) 品目構成（主品目）.<p>
	 *
	 */
	public boolean itm_comp_core_flg() {
		return getConstBoolean(offset + 31, $itm_comp_core_flg);
	}

	/**
	 * Item structure (Main item) 品目構成（主品目）.<p>
	 *
	 */
	public void itm_comp_core_flg(boolean value) {
		setConstBoolean(offset + 31, $itm_comp_core_flg, value);
	}


	/**
	 * Item structure (Component) 品目構成（構成品目）.<p>
	 *
	 */
	public boolean itm_comp_comp_flg() {
		return getConstBoolean(offset + 32, $itm_comp_comp_flg);
	}

	/**
	 * Item structure (Component) 品目構成（構成品目）.<p>
	 *
	 */
	public void itm_comp_comp_flg(boolean value) {
		setConstBoolean(offset + 32, $itm_comp_comp_flg, value);
	}


	/**
	 * MPS item ＭＰＳ品目.<p>
	 *
	 */
	public boolean mps_itm_flg() {
		return getConstBoolean(offset + 33, $mps_itm_flg);
	}

	/**
	 * MPS item ＭＰＳ品目.<p>
	 *
	 */
	public void mps_itm_flg(boolean value) {
		setConstBoolean(offset + 33, $mps_itm_flg, value);
	}


	/**
	 * Sales plan item configuration 販売計画品目構成.<p>
	 *
	 */
	public boolean spln_itm_conf_flg() {
		return getConstBoolean(offset + 34, $spln_itm_conf_flg);
	}

	/**
	 * Sales plan item configuration 販売計画品目構成.<p>
	 *
	 */
	public void spln_itm_conf_flg(boolean value) {
		setConstBoolean(offset + 34, $spln_itm_conf_flg, value);
	}


	/**
	 * Direct delivery LT 仕入直送ＬＴ.<p>
	 *
	 */
	public boolean purc_ddlv_lt_flg() {
		return getConstBoolean(offset + 35, $purc_ddlv_lt_flg);
	}

	/**
	 * Direct delivery LT 仕入直送ＬＴ.<p>
	 *
	 */
	public void purc_ddlv_lt_flg(boolean value) {
		setConstBoolean(offset + 35, $purc_ddlv_lt_flg, value);
	}


	/**
	 * BP item 取引先品目.<p>
	 *
	 */
	public boolean bp_itm_flg() {
		return getConstBoolean(offset + 36, $bp_itm_flg);
	}

	/**
	 * BP item 取引先品目.<p>
	 *
	 */
	public void bp_itm_flg(boolean value) {
		setConstBoolean(offset + 36, $bp_itm_flg, value);
	}


	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public boolean proc_upri_flg() {
		return getConstBoolean(offset + 37, $proc_upri_flg);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri_flg(boolean value) {
		setConstBoolean(offset + 37, $proc_upri_flg, value);
	}


	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public boolean prov_upri_flg() {
		return getConstBoolean(offset + 38, $prov_upri_flg);
	}

	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public void prov_upri_flg(boolean value) {
		setConstBoolean(offset + 38, $prov_upri_flg, value);
	}


	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public boolean purc_upri_flg() {
		return getConstBoolean(offset + 39, $purc_upri_flg);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void purc_upri_flg(boolean value) {
		setConstBoolean(offset + 39, $purc_upri_flg, value);
	}


	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public boolean std_sls_upri_flg() {
		return getConstBoolean(offset + 40, $std_sls_upri_flg);
	}

	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public void std_sls_upri_flg(boolean value) {
		setConstBoolean(offset + 40, $std_sls_upri_flg, value);
	}


	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public boolean itm_sls_upri_flg() {
		return getConstBoolean(offset + 41, $itm_sls_upri_flg);
	}

	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public void itm_sls_upri_flg(boolean value) {
		setConstBoolean(offset + 41, $itm_sls_upri_flg, value);
	}


	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public boolean cst_sls_upri_flg() {
		return getConstBoolean(offset + 42, $cst_sls_upri_flg);
	}

	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public void cst_sls_upri_flg(boolean value) {
		setConstBoolean(offset + 42, $cst_sls_upri_flg, value);
	}


	/**
	 * Assortment (Representative item) 品揃（代表品目）.<p>
	 *
	 */
	public boolean set_itm_main_flg() {
		return getConstBoolean(offset + 43, $set_itm_main_flg);
	}

	/**
	 * Assortment (Representative item) 品揃（代表品目）.<p>
	 *
	 */
	public void set_itm_main_flg(boolean value) {
		setConstBoolean(offset + 43, $set_itm_main_flg, value);
	}


	/**
	 * Assortment (Assortment item) 品揃（品揃品目）.<p>
	 *
	 */
	public boolean set_itm_set_flg() {
		return getConstBoolean(offset + 44, $set_itm_set_flg);
	}

	/**
	 * Assortment (Assortment item) 品揃（品揃品目）.<p>
	 *
	 */
	public void set_itm_set_flg(boolean value) {
		setConstBoolean(offset + 44, $set_itm_set_flg, value);
	}


	/**
	 * IF code conversion ＩＦコード変換.<p>
	 *
	 */
	public boolean if_x_flg() {
		return getConstBoolean(offset + 45, $if_x_flg);
	}

	/**
	 * IF code conversion ＩＦコード変換.<p>
	 *
	 */
	public void if_x_flg(boolean value) {
		setConstBoolean(offset + 45, $if_x_flg, value);
	}


	/**
	 * Cost item category structure 原価品群構成.<p>
	 *
	 */
	public boolean ctg_config_flg() {
		return getConstBoolean(offset + 46, $ctg_config_flg);
	}

	/**
	 * Cost item category structure 原価品群構成.<p>
	 *
	 */
	public void ctg_config_flg(boolean value) {
		setConstBoolean(offset + 46, $ctg_config_flg, value);
	}


	/**
	 * Auto-journal pattern 自動仕訳パタン.<p>
	 *
	 */
	public boolean jnl_ptn_flg() {
		return getConstBoolean(offset + 47, $jnl_ptn_flg);
	}

	/**
	 * Auto-journal pattern 自動仕訳パタン.<p>
	 *
	 */
	public void jnl_ptn_flg(boolean value) {
		setConstBoolean(offset + 47, $jnl_ptn_flg, value);
	}


	/**
	 * Allocation coefficient structure 配賦係数構成.<p>
	 *
	 */
	public boolean coef_config_flg() {
		return getConstBoolean(offset + 48, $coef_config_flg);
	}

	/**
	 * Allocation coefficient structure 配賦係数構成.<p>
	 *
	 */
	public void coef_config_flg(boolean value) {
		setConstBoolean(offset + 48, $coef_config_flg, value);
	}


	/**
	 * Cost element allocation 費目配賦.<p>
	 *
	 */
	public boolean alc_expns_flg() {
		return getConstBoolean(offset + 49, $alc_expns_flg);
	}

	/**
	 * Cost element allocation 費目配賦.<p>
	 *
	 */
	public void alc_expns_flg(boolean value) {
		setConstBoolean(offset + 49, $alc_expns_flg, value);
	}


	/**
	 * Input allocation 投入配賦.<p>
	 *
	 */
	public boolean alc_inpt_flg() {
		return getConstBoolean(offset + 50, $alc_inpt_flg);
	}

	/**
	 * Input allocation 投入配賦.<p>
	 *
	 */
	public void alc_inpt_flg(boolean value) {
		setConstBoolean(offset + 50, $alc_inpt_flg, value);
	}


	/**
	 * Not costing item 原価対象外品目.<p>
	 *
	 */
	public boolean cost_itm_out_flg() {
		return getConstBoolean(offset + 51, $cost_itm_out_flg);
	}

	/**
	 * Not costing item 原価対象外品目.<p>
	 *
	 */
	public void cost_itm_out_flg(boolean value) {
		setConstBoolean(offset + 51, $cost_itm_out_flg, value);
	}


	/**
	 * Expenses allocation transfer 経費配賦振替.<p>
	 *
	 */
	public boolean xpns_purc_alc_flg() {
		return getConstBoolean(offset + 52, $xpns_purc_alc_flg);
	}

	/**
	 * Expenses allocation transfer 経費配賦振替.<p>
	 *
	 */
	public void xpns_purc_alc_flg(boolean value) {
		setConstBoolean(offset + 52, $xpns_purc_alc_flg, value);
	}


	/**
	 * Item (Distribution group) 品目（物流グループ）.<p>
	 *
	 */
	public boolean itm_lg_grp_flg() {
		return getConstBoolean(offset + 53, $itm_lg_grp_flg);
	}

	/**
	 * Item (Distribution group) 品目（物流グループ）.<p>
	 *
	 */
	public void itm_lg_grp_flg(boolean value) {
		setConstBoolean(offset + 53, $itm_lg_grp_flg, value);
	}


	/**
	 * Item rack/line 品目棚・ライン.<p>
	 *
	 */
	public boolean itm_str_ln_flg() {
		return getConstBoolean(offset + 54, $itm_str_ln_flg);
	}

	/**
	 * Item rack/line 品目棚・ライン.<p>
	 *
	 */
	public void itm_str_ln_flg(boolean value) {
		setConstBoolean(offset + 54, $itm_str_ln_flg, value);
	}


	public String getString(String name) {
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
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($itm_flg.equalsIgnoreCase(name)) {
			return itm_flg();
		}
		if ($itm_sub_flg.equalsIgnoreCase(name)) {
			return itm_sub_flg();
		}
		if ($itm_unit_flg.equalsIgnoreCase(name)) {
			return itm_unit_flg();
		}
		if ($attach_info_flg.equalsIgnoreCase(name)) {
			return attach_info_flg();
		}
		if ($itm_stop_flg.equalsIgnoreCase(name)) {
			return itm_stop_flg();
		}
		if ($itm_not_fix_flg.equalsIgnoreCase(name)) {
			return itm_not_fix_flg();
		}
		if ($stdcost_flg.equalsIgnoreCase(name)) {
			return stdcost_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($itm_strg_flg.equalsIgnoreCase(name)) {
			return itm_strg_flg();
		}
		if ($alloc_ctl_flg.equalsIgnoreCase(name)) {
			return alloc_ctl_flg();
		}
		if ($stk_rpl_flg.equalsIgnoreCase(name)) {
			return stk_rpl_flg();
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			return alt_itm_flg();
		}
		if ($itm_wg_flg.equalsIgnoreCase(name)) {
			return itm_wg_flg();
		}
		if ($itm_dtl_flg.equalsIgnoreCase(name)) {
			return itm_dtl_flg();
		}
		if ($itm_oper_flg.equalsIgnoreCase(name)) {
			return itm_oper_flg();
		}
		if ($bom_par_flg.equalsIgnoreCase(name)) {
			return bom_par_flg();
		}
		if ($bom_chd_flg.equalsIgnoreCase(name)) {
			return bom_chd_flg();
		}
		if ($oper_wk_cost_flg.equalsIgnoreCase(name)) {
			return oper_wk_cost_flg();
		}
		if ($itm_insp_ptn_flg.equalsIgnoreCase(name)) {
			return itm_insp_ptn_flg();
		}
		if ($itm_insp_flg.equalsIgnoreCase(name)) {
			return itm_insp_flg();
		}
		if ($insp_spec_flg.equalsIgnoreCase(name)) {
			return insp_spec_flg();
		}
		if ($itm_site_flg.equalsIgnoreCase(name)) {
			return itm_site_flg();
		}
		if ($itm_ver_flg.equalsIgnoreCase(name)) {
			return itm_ver_flg();
		}
		if ($lot_inh_dest_flg.equalsIgnoreCase(name)) {
			return lot_inh_dest_flg();
		}
		if ($lot_inh_src_flg.equalsIgnoreCase(name)) {
			return lot_inh_src_flg();
		}
		if ($itm_spec_flg.equalsIgnoreCase(name)) {
			return itm_spec_flg();
		}
		if ($itm_spec_desc_flg.equalsIgnoreCase(name)) {
			return itm_spec_desc_flg();
		}
		if ($itm_comp_core_flg.equalsIgnoreCase(name)) {
			return itm_comp_core_flg();
		}
		if ($itm_comp_comp_flg.equalsIgnoreCase(name)) {
			return itm_comp_comp_flg();
		}
		if ($mps_itm_flg.equalsIgnoreCase(name)) {
			return mps_itm_flg();
		}
		if ($spln_itm_conf_flg.equalsIgnoreCase(name)) {
			return spln_itm_conf_flg();
		}
		if ($purc_ddlv_lt_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_lt_flg();
		}
		if ($bp_itm_flg.equalsIgnoreCase(name)) {
			return bp_itm_flg();
		}
		if ($proc_upri_flg.equalsIgnoreCase(name)) {
			return proc_upri_flg();
		}
		if ($prov_upri_flg.equalsIgnoreCase(name)) {
			return prov_upri_flg();
		}
		if ($purc_upri_flg.equalsIgnoreCase(name)) {
			return purc_upri_flg();
		}
		if ($std_sls_upri_flg.equalsIgnoreCase(name)) {
			return std_sls_upri_flg();
		}
		if ($itm_sls_upri_flg.equalsIgnoreCase(name)) {
			return itm_sls_upri_flg();
		}
		if ($cst_sls_upri_flg.equalsIgnoreCase(name)) {
			return cst_sls_upri_flg();
		}
		if ($set_itm_main_flg.equalsIgnoreCase(name)) {
			return set_itm_main_flg();
		}
		if ($set_itm_set_flg.equalsIgnoreCase(name)) {
			return set_itm_set_flg();
		}
		if ($if_x_flg.equalsIgnoreCase(name)) {
			return if_x_flg();
		}
		if ($ctg_config_flg.equalsIgnoreCase(name)) {
			return ctg_config_flg();
		}
		if ($jnl_ptn_flg.equalsIgnoreCase(name)) {
			return jnl_ptn_flg();
		}
		if ($coef_config_flg.equalsIgnoreCase(name)) {
			return coef_config_flg();
		}
		if ($alc_expns_flg.equalsIgnoreCase(name)) {
			return alc_expns_flg();
		}
		if ($alc_inpt_flg.equalsIgnoreCase(name)) {
			return alc_inpt_flg();
		}
		if ($cost_itm_out_flg.equalsIgnoreCase(name)) {
			return cost_itm_out_flg();
		}
		if ($xpns_purc_alc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_alc_flg();
		}
		if ($itm_lg_grp_flg.equalsIgnoreCase(name)) {
			return itm_lg_grp_flg();
		}
		if ($itm_str_ln_flg.equalsIgnoreCase(name)) {
			return itm_str_ln_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($itm_flg.equalsIgnoreCase(name)) {
			return itm_flg();
		}
		if ($itm_sub_flg.equalsIgnoreCase(name)) {
			return itm_sub_flg();
		}
		if ($itm_unit_flg.equalsIgnoreCase(name)) {
			return itm_unit_flg();
		}
		if ($attach_info_flg.equalsIgnoreCase(name)) {
			return attach_info_flg();
		}
		if ($itm_stop_flg.equalsIgnoreCase(name)) {
			return itm_stop_flg();
		}
		if ($itm_not_fix_flg.equalsIgnoreCase(name)) {
			return itm_not_fix_flg();
		}
		if ($stdcost_flg.equalsIgnoreCase(name)) {
			return stdcost_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($itm_strg_flg.equalsIgnoreCase(name)) {
			return itm_strg_flg();
		}
		if ($alloc_ctl_flg.equalsIgnoreCase(name)) {
			return alloc_ctl_flg();
		}
		if ($stk_rpl_flg.equalsIgnoreCase(name)) {
			return stk_rpl_flg();
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			return alt_itm_flg();
		}
		if ($itm_wg_flg.equalsIgnoreCase(name)) {
			return itm_wg_flg();
		}
		if ($itm_dtl_flg.equalsIgnoreCase(name)) {
			return itm_dtl_flg();
		}
		if ($itm_oper_flg.equalsIgnoreCase(name)) {
			return itm_oper_flg();
		}
		if ($bom_par_flg.equalsIgnoreCase(name)) {
			return bom_par_flg();
		}
		if ($bom_chd_flg.equalsIgnoreCase(name)) {
			return bom_chd_flg();
		}
		if ($oper_wk_cost_flg.equalsIgnoreCase(name)) {
			return oper_wk_cost_flg();
		}
		if ($itm_insp_ptn_flg.equalsIgnoreCase(name)) {
			return itm_insp_ptn_flg();
		}
		if ($itm_insp_flg.equalsIgnoreCase(name)) {
			return itm_insp_flg();
		}
		if ($insp_spec_flg.equalsIgnoreCase(name)) {
			return insp_spec_flg();
		}
		if ($itm_site_flg.equalsIgnoreCase(name)) {
			return itm_site_flg();
		}
		if ($itm_ver_flg.equalsIgnoreCase(name)) {
			return itm_ver_flg();
		}
		if ($lot_inh_dest_flg.equalsIgnoreCase(name)) {
			return lot_inh_dest_flg();
		}
		if ($lot_inh_src_flg.equalsIgnoreCase(name)) {
			return lot_inh_src_flg();
		}
		if ($itm_spec_flg.equalsIgnoreCase(name)) {
			return itm_spec_flg();
		}
		if ($itm_spec_desc_flg.equalsIgnoreCase(name)) {
			return itm_spec_desc_flg();
		}
		if ($itm_comp_core_flg.equalsIgnoreCase(name)) {
			return itm_comp_core_flg();
		}
		if ($itm_comp_comp_flg.equalsIgnoreCase(name)) {
			return itm_comp_comp_flg();
		}
		if ($mps_itm_flg.equalsIgnoreCase(name)) {
			return mps_itm_flg();
		}
		if ($spln_itm_conf_flg.equalsIgnoreCase(name)) {
			return spln_itm_conf_flg();
		}
		if ($purc_ddlv_lt_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_lt_flg();
		}
		if ($bp_itm_flg.equalsIgnoreCase(name)) {
			return bp_itm_flg();
		}
		if ($proc_upri_flg.equalsIgnoreCase(name)) {
			return proc_upri_flg();
		}
		if ($prov_upri_flg.equalsIgnoreCase(name)) {
			return prov_upri_flg();
		}
		if ($purc_upri_flg.equalsIgnoreCase(name)) {
			return purc_upri_flg();
		}
		if ($std_sls_upri_flg.equalsIgnoreCase(name)) {
			return std_sls_upri_flg();
		}
		if ($itm_sls_upri_flg.equalsIgnoreCase(name)) {
			return itm_sls_upri_flg();
		}
		if ($cst_sls_upri_flg.equalsIgnoreCase(name)) {
			return cst_sls_upri_flg();
		}
		if ($set_itm_main_flg.equalsIgnoreCase(name)) {
			return set_itm_main_flg();
		}
		if ($set_itm_set_flg.equalsIgnoreCase(name)) {
			return set_itm_set_flg();
		}
		if ($if_x_flg.equalsIgnoreCase(name)) {
			return if_x_flg();
		}
		if ($ctg_config_flg.equalsIgnoreCase(name)) {
			return ctg_config_flg();
		}
		if ($jnl_ptn_flg.equalsIgnoreCase(name)) {
			return jnl_ptn_flg();
		}
		if ($coef_config_flg.equalsIgnoreCase(name)) {
			return coef_config_flg();
		}
		if ($alc_expns_flg.equalsIgnoreCase(name)) {
			return alc_expns_flg();
		}
		if ($alc_inpt_flg.equalsIgnoreCase(name)) {
			return alc_inpt_flg();
		}
		if ($cost_itm_out_flg.equalsIgnoreCase(name)) {
			return cost_itm_out_flg();
		}
		if ($xpns_purc_alc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_alc_flg();
		}
		if ($itm_lg_grp_flg.equalsIgnoreCase(name)) {
			return itm_lg_grp_flg();
		}
		if ($itm_str_ln_flg.equalsIgnoreCase(name)) {
			return itm_str_ln_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($itm_flg.equalsIgnoreCase(name)) {
			itm_flg(value);
			return;
		}
		if ($itm_sub_flg.equalsIgnoreCase(name)) {
			itm_sub_flg(value);
			return;
		}
		if ($itm_unit_flg.equalsIgnoreCase(name)) {
			itm_unit_flg(value);
			return;
		}
		if ($attach_info_flg.equalsIgnoreCase(name)) {
			attach_info_flg(value);
			return;
		}
		if ($itm_stop_flg.equalsIgnoreCase(name)) {
			itm_stop_flg(value);
			return;
		}
		if ($itm_not_fix_flg.equalsIgnoreCase(name)) {
			itm_not_fix_flg(value);
			return;
		}
		if ($stdcost_flg.equalsIgnoreCase(name)) {
			stdcost_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($itm_strg_flg.equalsIgnoreCase(name)) {
			itm_strg_flg(value);
			return;
		}
		if ($alloc_ctl_flg.equalsIgnoreCase(name)) {
			alloc_ctl_flg(value);
			return;
		}
		if ($stk_rpl_flg.equalsIgnoreCase(name)) {
			stk_rpl_flg(value);
			return;
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			alt_itm_flg(value);
			return;
		}
		if ($itm_wg_flg.equalsIgnoreCase(name)) {
			itm_wg_flg(value);
			return;
		}
		if ($itm_dtl_flg.equalsIgnoreCase(name)) {
			itm_dtl_flg(value);
			return;
		}
		if ($itm_oper_flg.equalsIgnoreCase(name)) {
			itm_oper_flg(value);
			return;
		}
		if ($bom_par_flg.equalsIgnoreCase(name)) {
			bom_par_flg(value);
			return;
		}
		if ($bom_chd_flg.equalsIgnoreCase(name)) {
			bom_chd_flg(value);
			return;
		}
		if ($oper_wk_cost_flg.equalsIgnoreCase(name)) {
			oper_wk_cost_flg(value);
			return;
		}
		if ($itm_insp_ptn_flg.equalsIgnoreCase(name)) {
			itm_insp_ptn_flg(value);
			return;
		}
		if ($itm_insp_flg.equalsIgnoreCase(name)) {
			itm_insp_flg(value);
			return;
		}
		if ($insp_spec_flg.equalsIgnoreCase(name)) {
			insp_spec_flg(value);
			return;
		}
		if ($itm_site_flg.equalsIgnoreCase(name)) {
			itm_site_flg(value);
			return;
		}
		if ($itm_ver_flg.equalsIgnoreCase(name)) {
			itm_ver_flg(value);
			return;
		}
		if ($lot_inh_dest_flg.equalsIgnoreCase(name)) {
			lot_inh_dest_flg(value);
			return;
		}
		if ($lot_inh_src_flg.equalsIgnoreCase(name)) {
			lot_inh_src_flg(value);
			return;
		}
		if ($itm_spec_flg.equalsIgnoreCase(name)) {
			itm_spec_flg(value);
			return;
		}
		if ($itm_spec_desc_flg.equalsIgnoreCase(name)) {
			itm_spec_desc_flg(value);
			return;
		}
		if ($itm_comp_core_flg.equalsIgnoreCase(name)) {
			itm_comp_core_flg(value);
			return;
		}
		if ($itm_comp_comp_flg.equalsIgnoreCase(name)) {
			itm_comp_comp_flg(value);
			return;
		}
		if ($mps_itm_flg.equalsIgnoreCase(name)) {
			mps_itm_flg(value);
			return;
		}
		if ($spln_itm_conf_flg.equalsIgnoreCase(name)) {
			spln_itm_conf_flg(value);
			return;
		}
		if ($purc_ddlv_lt_flg.equalsIgnoreCase(name)) {
			purc_ddlv_lt_flg(value);
			return;
		}
		if ($bp_itm_flg.equalsIgnoreCase(name)) {
			bp_itm_flg(value);
			return;
		}
		if ($proc_upri_flg.equalsIgnoreCase(name)) {
			proc_upri_flg(value);
			return;
		}
		if ($prov_upri_flg.equalsIgnoreCase(name)) {
			prov_upri_flg(value);
			return;
		}
		if ($purc_upri_flg.equalsIgnoreCase(name)) {
			purc_upri_flg(value);
			return;
		}
		if ($std_sls_upri_flg.equalsIgnoreCase(name)) {
			std_sls_upri_flg(value);
			return;
		}
		if ($itm_sls_upri_flg.equalsIgnoreCase(name)) {
			itm_sls_upri_flg(value);
			return;
		}
		if ($cst_sls_upri_flg.equalsIgnoreCase(name)) {
			cst_sls_upri_flg(value);
			return;
		}
		if ($set_itm_main_flg.equalsIgnoreCase(name)) {
			set_itm_main_flg(value);
			return;
		}
		if ($set_itm_set_flg.equalsIgnoreCase(name)) {
			set_itm_set_flg(value);
			return;
		}
		if ($if_x_flg.equalsIgnoreCase(name)) {
			if_x_flg(value);
			return;
		}
		if ($ctg_config_flg.equalsIgnoreCase(name)) {
			ctg_config_flg(value);
			return;
		}
		if ($jnl_ptn_flg.equalsIgnoreCase(name)) {
			jnl_ptn_flg(value);
			return;
		}
		if ($coef_config_flg.equalsIgnoreCase(name)) {
			coef_config_flg(value);
			return;
		}
		if ($alc_expns_flg.equalsIgnoreCase(name)) {
			alc_expns_flg(value);
			return;
		}
		if ($alc_inpt_flg.equalsIgnoreCase(name)) {
			alc_inpt_flg(value);
			return;
		}
		if ($cost_itm_out_flg.equalsIgnoreCase(name)) {
			cost_itm_out_flg(value);
			return;
		}
		if ($xpns_purc_alc_flg.equalsIgnoreCase(name)) {
			xpns_purc_alc_flg(value);
			return;
		}
		if ($itm_lg_grp_flg.equalsIgnoreCase(name)) {
			itm_lg_grp_flg(value);
			return;
		}
		if ($itm_str_ln_flg.equalsIgnoreCase(name)) {
			itm_str_ln_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($itm_flg.equalsIgnoreCase(name)) {
			itm_flg(value);
			return;
		}
		if ($itm_sub_flg.equalsIgnoreCase(name)) {
			itm_sub_flg(value);
			return;
		}
		if ($itm_unit_flg.equalsIgnoreCase(name)) {
			itm_unit_flg(value);
			return;
		}
		if ($attach_info_flg.equalsIgnoreCase(name)) {
			attach_info_flg(value);
			return;
		}
		if ($itm_stop_flg.equalsIgnoreCase(name)) {
			itm_stop_flg(value);
			return;
		}
		if ($itm_not_fix_flg.equalsIgnoreCase(name)) {
			itm_not_fix_flg(value);
			return;
		}
		if ($stdcost_flg.equalsIgnoreCase(name)) {
			stdcost_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($itm_strg_flg.equalsIgnoreCase(name)) {
			itm_strg_flg(value);
			return;
		}
		if ($alloc_ctl_flg.equalsIgnoreCase(name)) {
			alloc_ctl_flg(value);
			return;
		}
		if ($stk_rpl_flg.equalsIgnoreCase(name)) {
			stk_rpl_flg(value);
			return;
		}
		if ($alt_itm_flg.equalsIgnoreCase(name)) {
			alt_itm_flg(value);
			return;
		}
		if ($itm_wg_flg.equalsIgnoreCase(name)) {
			itm_wg_flg(value);
			return;
		}
		if ($itm_dtl_flg.equalsIgnoreCase(name)) {
			itm_dtl_flg(value);
			return;
		}
		if ($itm_oper_flg.equalsIgnoreCase(name)) {
			itm_oper_flg(value);
			return;
		}
		if ($bom_par_flg.equalsIgnoreCase(name)) {
			bom_par_flg(value);
			return;
		}
		if ($bom_chd_flg.equalsIgnoreCase(name)) {
			bom_chd_flg(value);
			return;
		}
		if ($oper_wk_cost_flg.equalsIgnoreCase(name)) {
			oper_wk_cost_flg(value);
			return;
		}
		if ($itm_insp_ptn_flg.equalsIgnoreCase(name)) {
			itm_insp_ptn_flg(value);
			return;
		}
		if ($itm_insp_flg.equalsIgnoreCase(name)) {
			itm_insp_flg(value);
			return;
		}
		if ($insp_spec_flg.equalsIgnoreCase(name)) {
			insp_spec_flg(value);
			return;
		}
		if ($itm_site_flg.equalsIgnoreCase(name)) {
			itm_site_flg(value);
			return;
		}
		if ($itm_ver_flg.equalsIgnoreCase(name)) {
			itm_ver_flg(value);
			return;
		}
		if ($lot_inh_dest_flg.equalsIgnoreCase(name)) {
			lot_inh_dest_flg(value);
			return;
		}
		if ($lot_inh_src_flg.equalsIgnoreCase(name)) {
			lot_inh_src_flg(value);
			return;
		}
		if ($itm_spec_flg.equalsIgnoreCase(name)) {
			itm_spec_flg(value);
			return;
		}
		if ($itm_spec_desc_flg.equalsIgnoreCase(name)) {
			itm_spec_desc_flg(value);
			return;
		}
		if ($itm_comp_core_flg.equalsIgnoreCase(name)) {
			itm_comp_core_flg(value);
			return;
		}
		if ($itm_comp_comp_flg.equalsIgnoreCase(name)) {
			itm_comp_comp_flg(value);
			return;
		}
		if ($mps_itm_flg.equalsIgnoreCase(name)) {
			mps_itm_flg(value);
			return;
		}
		if ($spln_itm_conf_flg.equalsIgnoreCase(name)) {
			spln_itm_conf_flg(value);
			return;
		}
		if ($purc_ddlv_lt_flg.equalsIgnoreCase(name)) {
			purc_ddlv_lt_flg(value);
			return;
		}
		if ($bp_itm_flg.equalsIgnoreCase(name)) {
			bp_itm_flg(value);
			return;
		}
		if ($proc_upri_flg.equalsIgnoreCase(name)) {
			proc_upri_flg(value);
			return;
		}
		if ($prov_upri_flg.equalsIgnoreCase(name)) {
			prov_upri_flg(value);
			return;
		}
		if ($purc_upri_flg.equalsIgnoreCase(name)) {
			purc_upri_flg(value);
			return;
		}
		if ($std_sls_upri_flg.equalsIgnoreCase(name)) {
			std_sls_upri_flg(value);
			return;
		}
		if ($itm_sls_upri_flg.equalsIgnoreCase(name)) {
			itm_sls_upri_flg(value);
			return;
		}
		if ($cst_sls_upri_flg.equalsIgnoreCase(name)) {
			cst_sls_upri_flg(value);
			return;
		}
		if ($set_itm_main_flg.equalsIgnoreCase(name)) {
			set_itm_main_flg(value);
			return;
		}
		if ($set_itm_set_flg.equalsIgnoreCase(name)) {
			set_itm_set_flg(value);
			return;
		}
		if ($if_x_flg.equalsIgnoreCase(name)) {
			if_x_flg(value);
			return;
		}
		if ($ctg_config_flg.equalsIgnoreCase(name)) {
			ctg_config_flg(value);
			return;
		}
		if ($jnl_ptn_flg.equalsIgnoreCase(name)) {
			jnl_ptn_flg(value);
			return;
		}
		if ($coef_config_flg.equalsIgnoreCase(name)) {
			coef_config_flg(value);
			return;
		}
		if ($alc_expns_flg.equalsIgnoreCase(name)) {
			alc_expns_flg(value);
			return;
		}
		if ($alc_inpt_flg.equalsIgnoreCase(name)) {
			alc_inpt_flg(value);
			return;
		}
		if ($cost_itm_out_flg.equalsIgnoreCase(name)) {
			cost_itm_out_flg(value);
			return;
		}
		if ($xpns_purc_alc_flg.equalsIgnoreCase(name)) {
			xpns_purc_alc_flg(value);
			return;
		}
		if ($itm_lg_grp_flg.equalsIgnoreCase(name)) {
			itm_lg_grp_flg(value);
			return;
		}
		if ($itm_str_ln_flg.equalsIgnoreCase(name)) {
			itm_str_ln_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

