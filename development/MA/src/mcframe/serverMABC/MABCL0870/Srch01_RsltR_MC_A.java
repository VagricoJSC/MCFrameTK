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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
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
	 * Standard Item name 標準品名.<p>
	 *
	 */
	public static final String $base_itm_nm = "base_itm_nm";
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
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public static final String $chng_no = "chng_no";
	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public static final String $itm_cnt = "itm_cnt";
	/**
	 * Item auxiliary master 品目補助マスタ.<p>
	 *
	 */
	public static final String $itm_sub_cnt = "itm_sub_cnt";
	/**
	 * Item unit master 品目単位マスタ.<p>
	 *
	 */
	public static final String $itm_unit_cnt = "itm_unit_cnt";
	/**
	 * Item additional info. master 品目付加情報マスタ.<p>
	 *
	 */
	public static final String $attach_info_cnt = "attach_info_cnt";
	/**
	 * Item prohibit master 品目禁止マスタ.<p>
	 *
	 */
	public static final String $itm_stop_cnt = "itm_stop_cnt";
	/**
	 * Item procurement disapproval master 品目手配不許可マスタ.<p>
	 *
	 */
	public static final String $itm_not_fix_cnt = "itm_not_fix_cnt";
	/**
	 * Standard unit cost master 標準単価マスタ.<p>
	 *
	 */
	public static final String $stdcost_cnt = "stdcost_cnt";
	/**
	 * Miscellaneous item master 諸口品マスタ.<p>
	 *
	 */
	public static final String $sundry_itm_cnt = "sundry_itm_cnt";
	/**
	 * Item storage master 品目格納先マスタ.<p>
	 *
	 */
	public static final String $itm_strg_cnt = "itm_strg_cnt";
	/**
	 * Mfg. allocation control master 製造引当制御マスタ.<p>
	 *
	 */
	public static final String $alloc_ctl_cnt = "alloc_ctl_cnt";
	/**
	 * Inventory replenishment master 在庫補充マスタ.<p>
	 *
	 */
	public static final String $stk_rpl_cnt = "stk_rpl_cnt";
	/**
	 * Alternative item master 代替品目マスタ.<p>
	 *
	 */
	public static final String $alt_itm_cnt = "alt_itm_cnt";
	/**
	 * Item master (WG) 品目マスタ（ＷＧ）.<p>
	 *
	 */
	public static final String $itm_wg_cnt = "itm_wg_cnt";
	/**
	 * Item details master 品目詳細マスタ.<p>
	 *
	 */
	public static final String $itm_dtl_cnt = "itm_dtl_cnt";
	/**
	 * Item operation master 品目工程マスタ.<p>
	 *
	 */
	public static final String $itm_oper_cnt = "itm_oper_cnt";
	/**
	 * BOM master (Parent) ＢＯＭマスタ（親）.<p>
	 *
	 */
	public static final String $bom_par_cnt = "bom_par_cnt";
	/**
	 * BOM master (Child) ＢＯＭマスタ（子）.<p>
	 *
	 */
	public static final String $bom_chd_cnt = "bom_chd_cnt";
	/**
	 * Operation man-hour master 工程工数マスタ.<p>
	 *
	 */
	public static final String $oper_wk_cost_cnt = "oper_wk_cost_cnt";
	/**
	 * Item inspection pattern master 品目検査パタンマスタ.<p>
	 *
	 */
	public static final String $itm_insp_ptn_cnt = "itm_insp_ptn_cnt";
	/**
	 * Item inspection master 品目品管マスタ.<p>
	 *
	 */
	public static final String $itm_insp_cnt = "itm_insp_cnt";
	/**
	 * Item inspection specific master 品目検査規格マスタ.<p>
	 *
	 */
	public static final String $insp_spec_cnt = "insp_spec_cnt";
	/**
	 * Item master (Factory/Distribution warehouse) 品目マスタ（工場・物流倉庫）.<p>
	 *
	 */
	public static final String $itm_site_cnt = "itm_site_cnt";
	/**
	 * Version master 版マスタ.<p>
	 *
	 */
	public static final String $itm_ver_cnt = "itm_ver_cnt";
	/**
	 * Lot copy master (To) ロット継承先マスタ.<p>
	 *
	 */
	public static final String $lot_inh_dest_cnt = "lot_inh_dest_cnt";
	/**
	 * Lot copy master (From) ロット継承元マスタ.<p>
	 *
	 */
	public static final String $lot_inh_src_cnt = "lot_inh_src_cnt";
	/**
	 * Item specification master 品目仕様マスタ.<p>
	 *
	 */
	public static final String $itm_spec_cnt = "itm_spec_cnt";
	/**
	 * Item specification detail master 品目仕様項目マスタ.<p>
	 *
	 */
	public static final String $itm_spec_desc_cnt = "itm_spec_desc_cnt";
	/**
	 * Item configuration master (Main item) 品目構成マスタ（主品目）.<p>
	 *
	 */
	public static final String $itm_comp_core_cnt = "itm_comp_core_cnt";
	/**
	 * Item structure master (Component) 品目構成マスタ（構成品目）.<p>
	 *
	 */
	public static final String $itm_comp_comp_cnt = "itm_comp_comp_cnt";
	/**
	 * MPS item master ＭＰＳ品目マスタ.<p>
	 *
	 */
	public static final String $mps_itm_cnt = "mps_itm_cnt";
	/**
	 * Sales plan item configuration master 販売計画品目構成マスタ.<p>
	 *
	 */
	public static final String $spln_itm_conf_cnt = "spln_itm_conf_cnt";
	/**
	 * Direct delivery LT master 仕入直送ＬＴマスタ.<p>
	 *
	 */
	public static final String $purc_ddlv_lt_cnt = "purc_ddlv_lt_cnt";
	/**
	 * BP item master 取引先品目マスタ.<p>
	 *
	 */
	public static final String $bp_itm_cnt = "bp_itm_cnt";
	/**
	 * Subcontracting unit price master 加工単価マスタ.<p>
	 *
	 */
	public static final String $proc_upri_cnt = "proc_upri_cnt";
	/**
	 * Supply unit price master 支給単価マスタ.<p>
	 *
	 */
	public static final String $prov_upri_cnt = "prov_upri_cnt";
	/**
	 * Purchase unit price master 購買単価マスタ.<p>
	 *
	 */
	public static final String $purc_upri_cnt = "purc_upri_cnt";
	/**
	 * Standard sales unit price master 標準販売単価マスタ.<p>
	 *
	 */
	public static final String $std_sls_upri_cnt = "std_sls_upri_cnt";
	/**
	 * Item sales unit price master 品目販売単価マスタ.<p>
	 *
	 */
	public static final String $itm_sls_upri_cnt = "itm_sls_upri_cnt";
	/**
	 * Customer sales unit price master 得意先販売単価マスタ.<p>
	 *
	 */
	public static final String $cst_sls_upri_cnt = "cst_sls_upri_cnt";
	/**
	 * Assortment master (Representative item) 品揃マスタ（代表品目）.<p>
	 *
	 */
	public static final String $set_itm_main_cnt = "set_itm_main_cnt";
	/**
	 * Assortment master (Assortment item) 品揃マスタ（品揃品目）.<p>
	 *
	 */
	public static final String $set_itm_set_cnt = "set_itm_set_cnt";
	/**
	 * IF code conversion master ＩＦコード変換マスタ.<p>
	 *
	 */
	public static final String $if_x_cnt = "if_x_cnt";
	/**
	 * Cost item category structure master 原価品群構成マスタ.<p>
	 *
	 */
	public static final String $ctg_config_cnt = "ctg_config_cnt";
	/**
	 * Auto-journal pattern master 自動仕訳パタンマスタ.<p>
	 *
	 */
	public static final String $jnl_ptn_cnt = "jnl_ptn_cnt";
	/**
	 * Allocation coefficient structure master 配賦係数構成マスタ.<p>
	 *
	 */
	public static final String $coef_config_cnt = "coef_config_cnt";
	/**
	 * Cost element allocation master 費目配賦マスタ.<p>
	 *
	 */
	public static final String $alc_expns_cnt = "alc_expns_cnt";
	/**
	 * Input allocation master 投入配賦マスタ.<p>
	 *
	 */
	public static final String $alc_inpt_cnt = "alc_inpt_cnt";
	/**
	 * Not costing item master 原価対象外品目マスタ.<p>
	 *
	 */
	public static final String $cost_itm_out_cnt = "cost_itm_out_cnt";
	/**
	 * Expenses allocation transfer master 経費配賦振替マスタ.<p>
	 *
	 */
	public static final String $xpns_purc_alc_cnt = "xpns_purc_alc_cnt";
	/**
	 * Item (Distribution group) 品目（物流グループ）.<p>
	 *
	 */
	public static final String $itm_lg_grp_cnt = "itm_lg_grp_cnt";
	/**
	 * Item rack/line 品目棚・ライン.<p>
	 *
	 */
	public static final String $itm_str_ln_cnt = "itm_str_ln_cnt";
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
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";


	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta base_itm_nm_META = createCommonMeta($base_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta chng_no_META = createCommonMeta($chng_no, mcframe.commonMA.meta.MA_META.CHNG_NO);
	public static final MCMeta itm_cnt_META = createCommonMeta($itm_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_sub_cnt_META = createCommonMeta($itm_sub_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_unit_cnt_META = createCommonMeta($itm_unit_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta attach_info_cnt_META = createCommonMeta($attach_info_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_stop_cnt_META = createCommonMeta($itm_stop_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_not_fix_cnt_META = createCommonMeta($itm_not_fix_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta stdcost_cnt_META = createCommonMeta($stdcost_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sundry_itm_cnt_META = createCommonMeta($sundry_itm_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_strg_cnt_META = createCommonMeta($itm_strg_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alloc_ctl_cnt_META = createCommonMeta($alloc_ctl_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta stk_rpl_cnt_META = createCommonMeta($stk_rpl_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alt_itm_cnt_META = createCommonMeta($alt_itm_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_wg_cnt_META = createCommonMeta($itm_wg_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_dtl_cnt_META = createCommonMeta($itm_dtl_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_oper_cnt_META = createCommonMeta($itm_oper_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bom_par_cnt_META = createCommonMeta($bom_par_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bom_chd_cnt_META = createCommonMeta($bom_chd_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_wk_cost_cnt_META = createCommonMeta($oper_wk_cost_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_insp_ptn_cnt_META = createCommonMeta($itm_insp_ptn_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_insp_cnt_META = createCommonMeta($itm_insp_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta insp_spec_cnt_META = createCommonMeta($insp_spec_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_site_cnt_META = createCommonMeta($itm_site_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_ver_cnt_META = createCommonMeta($itm_ver_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta lot_inh_dest_cnt_META = createCommonMeta($lot_inh_dest_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta lot_inh_src_cnt_META = createCommonMeta($lot_inh_src_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_spec_cnt_META = createCommonMeta($itm_spec_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_spec_desc_cnt_META = createCommonMeta($itm_spec_desc_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_comp_core_cnt_META = createCommonMeta($itm_comp_core_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_comp_comp_cnt_META = createCommonMeta($itm_comp_comp_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mps_itm_cnt_META = createCommonMeta($mps_itm_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta spln_itm_conf_cnt_META = createCommonMeta($spln_itm_conf_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta purc_ddlv_lt_cnt_META = createCommonMeta($purc_ddlv_lt_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bp_itm_cnt_META = createCommonMeta($bp_itm_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta proc_upri_cnt_META = createCommonMeta($proc_upri_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta prov_upri_cnt_META = createCommonMeta($prov_upri_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta purc_upri_cnt_META = createCommonMeta($purc_upri_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta std_sls_upri_cnt_META = createCommonMeta($std_sls_upri_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_sls_upri_cnt_META = createCommonMeta($itm_sls_upri_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta cst_sls_upri_cnt_META = createCommonMeta($cst_sls_upri_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta set_itm_main_cnt_META = createCommonMeta($set_itm_main_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta set_itm_set_cnt_META = createCommonMeta($set_itm_set_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta if_x_cnt_META = createCommonMeta($if_x_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ctg_config_cnt_META = createCommonMeta($ctg_config_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta jnl_ptn_cnt_META = createCommonMeta($jnl_ptn_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta coef_config_cnt_META = createCommonMeta($coef_config_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alc_expns_cnt_META = createCommonMeta($alc_expns_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alc_inpt_cnt_META = createCommonMeta($alc_inpt_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta cost_itm_out_cnt_META = createCommonMeta($cost_itm_out_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta xpns_purc_alc_cnt_META = createCommonMeta($xpns_purc_alc_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_lg_grp_cnt_META = createCommonMeta($itm_lg_grp_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_str_ln_cnt_META = createCommonMeta($itm_str_ln_cnt, mcframe.commonMA.meta.MA_META.INT);
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
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			base_itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			chng_no_META,
			itm_cnt_META,
			itm_sub_cnt_META,
			itm_unit_cnt_META,
			attach_info_cnt_META,
			itm_stop_cnt_META,
			itm_not_fix_cnt_META,
			stdcost_cnt_META,
			sundry_itm_cnt_META,
			itm_strg_cnt_META,
			alloc_ctl_cnt_META,
			stk_rpl_cnt_META,
			alt_itm_cnt_META,
			itm_wg_cnt_META,
			itm_dtl_cnt_META,
			itm_oper_cnt_META,
			bom_par_cnt_META,
			bom_chd_cnt_META,
			oper_wk_cost_cnt_META,
			itm_insp_ptn_cnt_META,
			itm_insp_cnt_META,
			insp_spec_cnt_META,
			itm_site_cnt_META,
			itm_ver_cnt_META,
			lot_inh_dest_cnt_META,
			lot_inh_src_cnt_META,
			itm_spec_cnt_META,
			itm_spec_desc_cnt_META,
			itm_comp_core_cnt_META,
			itm_comp_comp_cnt_META,
			mps_itm_cnt_META,
			spln_itm_conf_cnt_META,
			purc_ddlv_lt_cnt_META,
			bp_itm_cnt_META,
			proc_upri_cnt_META,
			prov_upri_cnt_META,
			purc_upri_cnt_META,
			std_sls_upri_cnt_META,
			itm_sls_upri_cnt_META,
			cst_sls_upri_cnt_META,
			set_itm_main_cnt_META,
			set_itm_set_cnt_META,
			if_x_cnt_META,
			ctg_config_cnt_META,
			jnl_ptn_cnt_META,
			coef_config_cnt_META,
			alc_expns_cnt_META,
			alc_inpt_cnt_META,
			cost_itm_out_cnt_META,
			xpns_purc_alc_cnt_META,
			itm_lg_grp_cnt_META,
			itm_str_ln_cnt_META,
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
			itm_str_ln_flg_META,
			upd_ts_META
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
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
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
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 0, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 0, $del_flg, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 5, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 5, $itm_nm, value);
	}


	/**
	 * Standard Item name 標準品名.<p>
	 *
	 */
	public String base_itm_nm() {
		return getConstString(offset + 6, $base_itm_nm);
	}

	/**
	 * Standard Item name 標準品名.<p>
	 *
	 */
	public void base_itm_nm(String value) {
		setConstString(offset + 6, $base_itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 7, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 7, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 8, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 8, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 9, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 9, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 10, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 10, $itm_typ_d_nm, value);
	}


	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public String chng_no() {
		return getConstString(offset + 11, $chng_no);
	}

	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public void chng_no(String value) {
		setConstString(offset + 11, $chng_no, value);
	}


	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public MCNumber itm_cnt() {
		return getConstNumber(offset + 12, $itm_cnt);
	}

	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public void itm_cnt(MCNumber value) {
		setConstNumber(offset + 12, $itm_cnt, value);
	}

	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public void itm_cnt(int value) {
		setConstNumber(offset + 12, $itm_cnt, value);
	}

	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public void itm_cnt(long value) {
		setConstNumber(offset + 12, $itm_cnt, value);
	}

	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public void itm_cnt(float value) {
		setConstNumber(offset + 12, $itm_cnt, value);
	}

	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public void itm_cnt(double value) {
		setConstNumber(offset + 12, $itm_cnt, value);
	}


	/**
	 * Item auxiliary master 品目補助マスタ.<p>
	 *
	 */
	public MCNumber itm_sub_cnt() {
		return getConstNumber(offset + 13, $itm_sub_cnt);
	}

	/**
	 * Item auxiliary master 品目補助マスタ.<p>
	 *
	 */
	public void itm_sub_cnt(MCNumber value) {
		setConstNumber(offset + 13, $itm_sub_cnt, value);
	}

	/**
	 * Item auxiliary master 品目補助マスタ.<p>
	 *
	 */
	public void itm_sub_cnt(int value) {
		setConstNumber(offset + 13, $itm_sub_cnt, value);
	}

	/**
	 * Item auxiliary master 品目補助マスタ.<p>
	 *
	 */
	public void itm_sub_cnt(long value) {
		setConstNumber(offset + 13, $itm_sub_cnt, value);
	}

	/**
	 * Item auxiliary master 品目補助マスタ.<p>
	 *
	 */
	public void itm_sub_cnt(float value) {
		setConstNumber(offset + 13, $itm_sub_cnt, value);
	}

	/**
	 * Item auxiliary master 品目補助マスタ.<p>
	 *
	 */
	public void itm_sub_cnt(double value) {
		setConstNumber(offset + 13, $itm_sub_cnt, value);
	}


	/**
	 * Item unit master 品目単位マスタ.<p>
	 *
	 */
	public MCNumber itm_unit_cnt() {
		return getConstNumber(offset + 14, $itm_unit_cnt);
	}

	/**
	 * Item unit master 品目単位マスタ.<p>
	 *
	 */
	public void itm_unit_cnt(MCNumber value) {
		setConstNumber(offset + 14, $itm_unit_cnt, value);
	}

	/**
	 * Item unit master 品目単位マスタ.<p>
	 *
	 */
	public void itm_unit_cnt(int value) {
		setConstNumber(offset + 14, $itm_unit_cnt, value);
	}

	/**
	 * Item unit master 品目単位マスタ.<p>
	 *
	 */
	public void itm_unit_cnt(long value) {
		setConstNumber(offset + 14, $itm_unit_cnt, value);
	}

	/**
	 * Item unit master 品目単位マスタ.<p>
	 *
	 */
	public void itm_unit_cnt(float value) {
		setConstNumber(offset + 14, $itm_unit_cnt, value);
	}

	/**
	 * Item unit master 品目単位マスタ.<p>
	 *
	 */
	public void itm_unit_cnt(double value) {
		setConstNumber(offset + 14, $itm_unit_cnt, value);
	}


	/**
	 * Item additional info. master 品目付加情報マスタ.<p>
	 *
	 */
	public MCNumber attach_info_cnt() {
		return getConstNumber(offset + 15, $attach_info_cnt);
	}

	/**
	 * Item additional info. master 品目付加情報マスタ.<p>
	 *
	 */
	public void attach_info_cnt(MCNumber value) {
		setConstNumber(offset + 15, $attach_info_cnt, value);
	}

	/**
	 * Item additional info. master 品目付加情報マスタ.<p>
	 *
	 */
	public void attach_info_cnt(int value) {
		setConstNumber(offset + 15, $attach_info_cnt, value);
	}

	/**
	 * Item additional info. master 品目付加情報マスタ.<p>
	 *
	 */
	public void attach_info_cnt(long value) {
		setConstNumber(offset + 15, $attach_info_cnt, value);
	}

	/**
	 * Item additional info. master 品目付加情報マスタ.<p>
	 *
	 */
	public void attach_info_cnt(float value) {
		setConstNumber(offset + 15, $attach_info_cnt, value);
	}

	/**
	 * Item additional info. master 品目付加情報マスタ.<p>
	 *
	 */
	public void attach_info_cnt(double value) {
		setConstNumber(offset + 15, $attach_info_cnt, value);
	}


	/**
	 * Item prohibit master 品目禁止マスタ.<p>
	 *
	 */
	public MCNumber itm_stop_cnt() {
		return getConstNumber(offset + 16, $itm_stop_cnt);
	}

	/**
	 * Item prohibit master 品目禁止マスタ.<p>
	 *
	 */
	public void itm_stop_cnt(MCNumber value) {
		setConstNumber(offset + 16, $itm_stop_cnt, value);
	}

	/**
	 * Item prohibit master 品目禁止マスタ.<p>
	 *
	 */
	public void itm_stop_cnt(int value) {
		setConstNumber(offset + 16, $itm_stop_cnt, value);
	}

	/**
	 * Item prohibit master 品目禁止マスタ.<p>
	 *
	 */
	public void itm_stop_cnt(long value) {
		setConstNumber(offset + 16, $itm_stop_cnt, value);
	}

	/**
	 * Item prohibit master 品目禁止マスタ.<p>
	 *
	 */
	public void itm_stop_cnt(float value) {
		setConstNumber(offset + 16, $itm_stop_cnt, value);
	}

	/**
	 * Item prohibit master 品目禁止マスタ.<p>
	 *
	 */
	public void itm_stop_cnt(double value) {
		setConstNumber(offset + 16, $itm_stop_cnt, value);
	}


	/**
	 * Item procurement disapproval master 品目手配不許可マスタ.<p>
	 *
	 */
	public MCNumber itm_not_fix_cnt() {
		return getConstNumber(offset + 17, $itm_not_fix_cnt);
	}

	/**
	 * Item procurement disapproval master 品目手配不許可マスタ.<p>
	 *
	 */
	public void itm_not_fix_cnt(MCNumber value) {
		setConstNumber(offset + 17, $itm_not_fix_cnt, value);
	}

	/**
	 * Item procurement disapproval master 品目手配不許可マスタ.<p>
	 *
	 */
	public void itm_not_fix_cnt(int value) {
		setConstNumber(offset + 17, $itm_not_fix_cnt, value);
	}

	/**
	 * Item procurement disapproval master 品目手配不許可マスタ.<p>
	 *
	 */
	public void itm_not_fix_cnt(long value) {
		setConstNumber(offset + 17, $itm_not_fix_cnt, value);
	}

	/**
	 * Item procurement disapproval master 品目手配不許可マスタ.<p>
	 *
	 */
	public void itm_not_fix_cnt(float value) {
		setConstNumber(offset + 17, $itm_not_fix_cnt, value);
	}

	/**
	 * Item procurement disapproval master 品目手配不許可マスタ.<p>
	 *
	 */
	public void itm_not_fix_cnt(double value) {
		setConstNumber(offset + 17, $itm_not_fix_cnt, value);
	}


	/**
	 * Standard unit cost master 標準単価マスタ.<p>
	 *
	 */
	public MCNumber stdcost_cnt() {
		return getConstNumber(offset + 18, $stdcost_cnt);
	}

	/**
	 * Standard unit cost master 標準単価マスタ.<p>
	 *
	 */
	public void stdcost_cnt(MCNumber value) {
		setConstNumber(offset + 18, $stdcost_cnt, value);
	}

	/**
	 * Standard unit cost master 標準単価マスタ.<p>
	 *
	 */
	public void stdcost_cnt(int value) {
		setConstNumber(offset + 18, $stdcost_cnt, value);
	}

	/**
	 * Standard unit cost master 標準単価マスタ.<p>
	 *
	 */
	public void stdcost_cnt(long value) {
		setConstNumber(offset + 18, $stdcost_cnt, value);
	}

	/**
	 * Standard unit cost master 標準単価マスタ.<p>
	 *
	 */
	public void stdcost_cnt(float value) {
		setConstNumber(offset + 18, $stdcost_cnt, value);
	}

	/**
	 * Standard unit cost master 標準単価マスタ.<p>
	 *
	 */
	public void stdcost_cnt(double value) {
		setConstNumber(offset + 18, $stdcost_cnt, value);
	}


	/**
	 * Miscellaneous item master 諸口品マスタ.<p>
	 *
	 */
	public MCNumber sundry_itm_cnt() {
		return getConstNumber(offset + 19, $sundry_itm_cnt);
	}

	/**
	 * Miscellaneous item master 諸口品マスタ.<p>
	 *
	 */
	public void sundry_itm_cnt(MCNumber value) {
		setConstNumber(offset + 19, $sundry_itm_cnt, value);
	}

	/**
	 * Miscellaneous item master 諸口品マスタ.<p>
	 *
	 */
	public void sundry_itm_cnt(int value) {
		setConstNumber(offset + 19, $sundry_itm_cnt, value);
	}

	/**
	 * Miscellaneous item master 諸口品マスタ.<p>
	 *
	 */
	public void sundry_itm_cnt(long value) {
		setConstNumber(offset + 19, $sundry_itm_cnt, value);
	}

	/**
	 * Miscellaneous item master 諸口品マスタ.<p>
	 *
	 */
	public void sundry_itm_cnt(float value) {
		setConstNumber(offset + 19, $sundry_itm_cnt, value);
	}

	/**
	 * Miscellaneous item master 諸口品マスタ.<p>
	 *
	 */
	public void sundry_itm_cnt(double value) {
		setConstNumber(offset + 19, $sundry_itm_cnt, value);
	}


	/**
	 * Item storage master 品目格納先マスタ.<p>
	 *
	 */
	public MCNumber itm_strg_cnt() {
		return getConstNumber(offset + 20, $itm_strg_cnt);
	}

	/**
	 * Item storage master 品目格納先マスタ.<p>
	 *
	 */
	public void itm_strg_cnt(MCNumber value) {
		setConstNumber(offset + 20, $itm_strg_cnt, value);
	}

	/**
	 * Item storage master 品目格納先マスタ.<p>
	 *
	 */
	public void itm_strg_cnt(int value) {
		setConstNumber(offset + 20, $itm_strg_cnt, value);
	}

	/**
	 * Item storage master 品目格納先マスタ.<p>
	 *
	 */
	public void itm_strg_cnt(long value) {
		setConstNumber(offset + 20, $itm_strg_cnt, value);
	}

	/**
	 * Item storage master 品目格納先マスタ.<p>
	 *
	 */
	public void itm_strg_cnt(float value) {
		setConstNumber(offset + 20, $itm_strg_cnt, value);
	}

	/**
	 * Item storage master 品目格納先マスタ.<p>
	 *
	 */
	public void itm_strg_cnt(double value) {
		setConstNumber(offset + 20, $itm_strg_cnt, value);
	}


	/**
	 * Mfg. allocation control master 製造引当制御マスタ.<p>
	 *
	 */
	public MCNumber alloc_ctl_cnt() {
		return getConstNumber(offset + 21, $alloc_ctl_cnt);
	}

	/**
	 * Mfg. allocation control master 製造引当制御マスタ.<p>
	 *
	 */
	public void alloc_ctl_cnt(MCNumber value) {
		setConstNumber(offset + 21, $alloc_ctl_cnt, value);
	}

	/**
	 * Mfg. allocation control master 製造引当制御マスタ.<p>
	 *
	 */
	public void alloc_ctl_cnt(int value) {
		setConstNumber(offset + 21, $alloc_ctl_cnt, value);
	}

	/**
	 * Mfg. allocation control master 製造引当制御マスタ.<p>
	 *
	 */
	public void alloc_ctl_cnt(long value) {
		setConstNumber(offset + 21, $alloc_ctl_cnt, value);
	}

	/**
	 * Mfg. allocation control master 製造引当制御マスタ.<p>
	 *
	 */
	public void alloc_ctl_cnt(float value) {
		setConstNumber(offset + 21, $alloc_ctl_cnt, value);
	}

	/**
	 * Mfg. allocation control master 製造引当制御マスタ.<p>
	 *
	 */
	public void alloc_ctl_cnt(double value) {
		setConstNumber(offset + 21, $alloc_ctl_cnt, value);
	}


	/**
	 * Inventory replenishment master 在庫補充マスタ.<p>
	 *
	 */
	public MCNumber stk_rpl_cnt() {
		return getConstNumber(offset + 22, $stk_rpl_cnt);
	}

	/**
	 * Inventory replenishment master 在庫補充マスタ.<p>
	 *
	 */
	public void stk_rpl_cnt(MCNumber value) {
		setConstNumber(offset + 22, $stk_rpl_cnt, value);
	}

	/**
	 * Inventory replenishment master 在庫補充マスタ.<p>
	 *
	 */
	public void stk_rpl_cnt(int value) {
		setConstNumber(offset + 22, $stk_rpl_cnt, value);
	}

	/**
	 * Inventory replenishment master 在庫補充マスタ.<p>
	 *
	 */
	public void stk_rpl_cnt(long value) {
		setConstNumber(offset + 22, $stk_rpl_cnt, value);
	}

	/**
	 * Inventory replenishment master 在庫補充マスタ.<p>
	 *
	 */
	public void stk_rpl_cnt(float value) {
		setConstNumber(offset + 22, $stk_rpl_cnt, value);
	}

	/**
	 * Inventory replenishment master 在庫補充マスタ.<p>
	 *
	 */
	public void stk_rpl_cnt(double value) {
		setConstNumber(offset + 22, $stk_rpl_cnt, value);
	}


	/**
	 * Alternative item master 代替品目マスタ.<p>
	 *
	 */
	public MCNumber alt_itm_cnt() {
		return getConstNumber(offset + 23, $alt_itm_cnt);
	}

	/**
	 * Alternative item master 代替品目マスタ.<p>
	 *
	 */
	public void alt_itm_cnt(MCNumber value) {
		setConstNumber(offset + 23, $alt_itm_cnt, value);
	}

	/**
	 * Alternative item master 代替品目マスタ.<p>
	 *
	 */
	public void alt_itm_cnt(int value) {
		setConstNumber(offset + 23, $alt_itm_cnt, value);
	}

	/**
	 * Alternative item master 代替品目マスタ.<p>
	 *
	 */
	public void alt_itm_cnt(long value) {
		setConstNumber(offset + 23, $alt_itm_cnt, value);
	}

	/**
	 * Alternative item master 代替品目マスタ.<p>
	 *
	 */
	public void alt_itm_cnt(float value) {
		setConstNumber(offset + 23, $alt_itm_cnt, value);
	}

	/**
	 * Alternative item master 代替品目マスタ.<p>
	 *
	 */
	public void alt_itm_cnt(double value) {
		setConstNumber(offset + 23, $alt_itm_cnt, value);
	}


	/**
	 * Item master (WG) 品目マスタ（ＷＧ）.<p>
	 *
	 */
	public MCNumber itm_wg_cnt() {
		return getConstNumber(offset + 24, $itm_wg_cnt);
	}

	/**
	 * Item master (WG) 品目マスタ（ＷＧ）.<p>
	 *
	 */
	public void itm_wg_cnt(MCNumber value) {
		setConstNumber(offset + 24, $itm_wg_cnt, value);
	}

	/**
	 * Item master (WG) 品目マスタ（ＷＧ）.<p>
	 *
	 */
	public void itm_wg_cnt(int value) {
		setConstNumber(offset + 24, $itm_wg_cnt, value);
	}

	/**
	 * Item master (WG) 品目マスタ（ＷＧ）.<p>
	 *
	 */
	public void itm_wg_cnt(long value) {
		setConstNumber(offset + 24, $itm_wg_cnt, value);
	}

	/**
	 * Item master (WG) 品目マスタ（ＷＧ）.<p>
	 *
	 */
	public void itm_wg_cnt(float value) {
		setConstNumber(offset + 24, $itm_wg_cnt, value);
	}

	/**
	 * Item master (WG) 品目マスタ（ＷＧ）.<p>
	 *
	 */
	public void itm_wg_cnt(double value) {
		setConstNumber(offset + 24, $itm_wg_cnt, value);
	}


	/**
	 * Item details master 品目詳細マスタ.<p>
	 *
	 */
	public MCNumber itm_dtl_cnt() {
		return getConstNumber(offset + 25, $itm_dtl_cnt);
	}

	/**
	 * Item details master 品目詳細マスタ.<p>
	 *
	 */
	public void itm_dtl_cnt(MCNumber value) {
		setConstNumber(offset + 25, $itm_dtl_cnt, value);
	}

	/**
	 * Item details master 品目詳細マスタ.<p>
	 *
	 */
	public void itm_dtl_cnt(int value) {
		setConstNumber(offset + 25, $itm_dtl_cnt, value);
	}

	/**
	 * Item details master 品目詳細マスタ.<p>
	 *
	 */
	public void itm_dtl_cnt(long value) {
		setConstNumber(offset + 25, $itm_dtl_cnt, value);
	}

	/**
	 * Item details master 品目詳細マスタ.<p>
	 *
	 */
	public void itm_dtl_cnt(float value) {
		setConstNumber(offset + 25, $itm_dtl_cnt, value);
	}

	/**
	 * Item details master 品目詳細マスタ.<p>
	 *
	 */
	public void itm_dtl_cnt(double value) {
		setConstNumber(offset + 25, $itm_dtl_cnt, value);
	}


	/**
	 * Item operation master 品目工程マスタ.<p>
	 *
	 */
	public MCNumber itm_oper_cnt() {
		return getConstNumber(offset + 26, $itm_oper_cnt);
	}

	/**
	 * Item operation master 品目工程マスタ.<p>
	 *
	 */
	public void itm_oper_cnt(MCNumber value) {
		setConstNumber(offset + 26, $itm_oper_cnt, value);
	}

	/**
	 * Item operation master 品目工程マスタ.<p>
	 *
	 */
	public void itm_oper_cnt(int value) {
		setConstNumber(offset + 26, $itm_oper_cnt, value);
	}

	/**
	 * Item operation master 品目工程マスタ.<p>
	 *
	 */
	public void itm_oper_cnt(long value) {
		setConstNumber(offset + 26, $itm_oper_cnt, value);
	}

	/**
	 * Item operation master 品目工程マスタ.<p>
	 *
	 */
	public void itm_oper_cnt(float value) {
		setConstNumber(offset + 26, $itm_oper_cnt, value);
	}

	/**
	 * Item operation master 品目工程マスタ.<p>
	 *
	 */
	public void itm_oper_cnt(double value) {
		setConstNumber(offset + 26, $itm_oper_cnt, value);
	}


	/**
	 * BOM master (Parent) ＢＯＭマスタ（親）.<p>
	 *
	 */
	public MCNumber bom_par_cnt() {
		return getConstNumber(offset + 27, $bom_par_cnt);
	}

	/**
	 * BOM master (Parent) ＢＯＭマスタ（親）.<p>
	 *
	 */
	public void bom_par_cnt(MCNumber value) {
		setConstNumber(offset + 27, $bom_par_cnt, value);
	}

	/**
	 * BOM master (Parent) ＢＯＭマスタ（親）.<p>
	 *
	 */
	public void bom_par_cnt(int value) {
		setConstNumber(offset + 27, $bom_par_cnt, value);
	}

	/**
	 * BOM master (Parent) ＢＯＭマスタ（親）.<p>
	 *
	 */
	public void bom_par_cnt(long value) {
		setConstNumber(offset + 27, $bom_par_cnt, value);
	}

	/**
	 * BOM master (Parent) ＢＯＭマスタ（親）.<p>
	 *
	 */
	public void bom_par_cnt(float value) {
		setConstNumber(offset + 27, $bom_par_cnt, value);
	}

	/**
	 * BOM master (Parent) ＢＯＭマスタ（親）.<p>
	 *
	 */
	public void bom_par_cnt(double value) {
		setConstNumber(offset + 27, $bom_par_cnt, value);
	}


	/**
	 * BOM master (Child) ＢＯＭマスタ（子）.<p>
	 *
	 */
	public MCNumber bom_chd_cnt() {
		return getConstNumber(offset + 28, $bom_chd_cnt);
	}

	/**
	 * BOM master (Child) ＢＯＭマスタ（子）.<p>
	 *
	 */
	public void bom_chd_cnt(MCNumber value) {
		setConstNumber(offset + 28, $bom_chd_cnt, value);
	}

	/**
	 * BOM master (Child) ＢＯＭマスタ（子）.<p>
	 *
	 */
	public void bom_chd_cnt(int value) {
		setConstNumber(offset + 28, $bom_chd_cnt, value);
	}

	/**
	 * BOM master (Child) ＢＯＭマスタ（子）.<p>
	 *
	 */
	public void bom_chd_cnt(long value) {
		setConstNumber(offset + 28, $bom_chd_cnt, value);
	}

	/**
	 * BOM master (Child) ＢＯＭマスタ（子）.<p>
	 *
	 */
	public void bom_chd_cnt(float value) {
		setConstNumber(offset + 28, $bom_chd_cnt, value);
	}

	/**
	 * BOM master (Child) ＢＯＭマスタ（子）.<p>
	 *
	 */
	public void bom_chd_cnt(double value) {
		setConstNumber(offset + 28, $bom_chd_cnt, value);
	}


	/**
	 * Operation man-hour master 工程工数マスタ.<p>
	 *
	 */
	public MCNumber oper_wk_cost_cnt() {
		return getConstNumber(offset + 29, $oper_wk_cost_cnt);
	}

	/**
	 * Operation man-hour master 工程工数マスタ.<p>
	 *
	 */
	public void oper_wk_cost_cnt(MCNumber value) {
		setConstNumber(offset + 29, $oper_wk_cost_cnt, value);
	}

	/**
	 * Operation man-hour master 工程工数マスタ.<p>
	 *
	 */
	public void oper_wk_cost_cnt(int value) {
		setConstNumber(offset + 29, $oper_wk_cost_cnt, value);
	}

	/**
	 * Operation man-hour master 工程工数マスタ.<p>
	 *
	 */
	public void oper_wk_cost_cnt(long value) {
		setConstNumber(offset + 29, $oper_wk_cost_cnt, value);
	}

	/**
	 * Operation man-hour master 工程工数マスタ.<p>
	 *
	 */
	public void oper_wk_cost_cnt(float value) {
		setConstNumber(offset + 29, $oper_wk_cost_cnt, value);
	}

	/**
	 * Operation man-hour master 工程工数マスタ.<p>
	 *
	 */
	public void oper_wk_cost_cnt(double value) {
		setConstNumber(offset + 29, $oper_wk_cost_cnt, value);
	}


	/**
	 * Item inspection pattern master 品目検査パタンマスタ.<p>
	 *
	 */
	public MCNumber itm_insp_ptn_cnt() {
		return getConstNumber(offset + 30, $itm_insp_ptn_cnt);
	}

	/**
	 * Item inspection pattern master 品目検査パタンマスタ.<p>
	 *
	 */
	public void itm_insp_ptn_cnt(MCNumber value) {
		setConstNumber(offset + 30, $itm_insp_ptn_cnt, value);
	}

	/**
	 * Item inspection pattern master 品目検査パタンマスタ.<p>
	 *
	 */
	public void itm_insp_ptn_cnt(int value) {
		setConstNumber(offset + 30, $itm_insp_ptn_cnt, value);
	}

	/**
	 * Item inspection pattern master 品目検査パタンマスタ.<p>
	 *
	 */
	public void itm_insp_ptn_cnt(long value) {
		setConstNumber(offset + 30, $itm_insp_ptn_cnt, value);
	}

	/**
	 * Item inspection pattern master 品目検査パタンマスタ.<p>
	 *
	 */
	public void itm_insp_ptn_cnt(float value) {
		setConstNumber(offset + 30, $itm_insp_ptn_cnt, value);
	}

	/**
	 * Item inspection pattern master 品目検査パタンマスタ.<p>
	 *
	 */
	public void itm_insp_ptn_cnt(double value) {
		setConstNumber(offset + 30, $itm_insp_ptn_cnt, value);
	}


	/**
	 * Item inspection master 品目品管マスタ.<p>
	 *
	 */
	public MCNumber itm_insp_cnt() {
		return getConstNumber(offset + 31, $itm_insp_cnt);
	}

	/**
	 * Item inspection master 品目品管マスタ.<p>
	 *
	 */
	public void itm_insp_cnt(MCNumber value) {
		setConstNumber(offset + 31, $itm_insp_cnt, value);
	}

	/**
	 * Item inspection master 品目品管マスタ.<p>
	 *
	 */
	public void itm_insp_cnt(int value) {
		setConstNumber(offset + 31, $itm_insp_cnt, value);
	}

	/**
	 * Item inspection master 品目品管マスタ.<p>
	 *
	 */
	public void itm_insp_cnt(long value) {
		setConstNumber(offset + 31, $itm_insp_cnt, value);
	}

	/**
	 * Item inspection master 品目品管マスタ.<p>
	 *
	 */
	public void itm_insp_cnt(float value) {
		setConstNumber(offset + 31, $itm_insp_cnt, value);
	}

	/**
	 * Item inspection master 品目品管マスタ.<p>
	 *
	 */
	public void itm_insp_cnt(double value) {
		setConstNumber(offset + 31, $itm_insp_cnt, value);
	}


	/**
	 * Item inspection specific master 品目検査規格マスタ.<p>
	 *
	 */
	public MCNumber insp_spec_cnt() {
		return getConstNumber(offset + 32, $insp_spec_cnt);
	}

	/**
	 * Item inspection specific master 品目検査規格マスタ.<p>
	 *
	 */
	public void insp_spec_cnt(MCNumber value) {
		setConstNumber(offset + 32, $insp_spec_cnt, value);
	}

	/**
	 * Item inspection specific master 品目検査規格マスタ.<p>
	 *
	 */
	public void insp_spec_cnt(int value) {
		setConstNumber(offset + 32, $insp_spec_cnt, value);
	}

	/**
	 * Item inspection specific master 品目検査規格マスタ.<p>
	 *
	 */
	public void insp_spec_cnt(long value) {
		setConstNumber(offset + 32, $insp_spec_cnt, value);
	}

	/**
	 * Item inspection specific master 品目検査規格マスタ.<p>
	 *
	 */
	public void insp_spec_cnt(float value) {
		setConstNumber(offset + 32, $insp_spec_cnt, value);
	}

	/**
	 * Item inspection specific master 品目検査規格マスタ.<p>
	 *
	 */
	public void insp_spec_cnt(double value) {
		setConstNumber(offset + 32, $insp_spec_cnt, value);
	}


	/**
	 * Item master (Factory/Distribution warehouse) 品目マスタ（工場・物流倉庫）.<p>
	 *
	 */
	public MCNumber itm_site_cnt() {
		return getConstNumber(offset + 33, $itm_site_cnt);
	}

	/**
	 * Item master (Factory/Distribution warehouse) 品目マスタ（工場・物流倉庫）.<p>
	 *
	 */
	public void itm_site_cnt(MCNumber value) {
		setConstNumber(offset + 33, $itm_site_cnt, value);
	}

	/**
	 * Item master (Factory/Distribution warehouse) 品目マスタ（工場・物流倉庫）.<p>
	 *
	 */
	public void itm_site_cnt(int value) {
		setConstNumber(offset + 33, $itm_site_cnt, value);
	}

	/**
	 * Item master (Factory/Distribution warehouse) 品目マスタ（工場・物流倉庫）.<p>
	 *
	 */
	public void itm_site_cnt(long value) {
		setConstNumber(offset + 33, $itm_site_cnt, value);
	}

	/**
	 * Item master (Factory/Distribution warehouse) 品目マスタ（工場・物流倉庫）.<p>
	 *
	 */
	public void itm_site_cnt(float value) {
		setConstNumber(offset + 33, $itm_site_cnt, value);
	}

	/**
	 * Item master (Factory/Distribution warehouse) 品目マスタ（工場・物流倉庫）.<p>
	 *
	 */
	public void itm_site_cnt(double value) {
		setConstNumber(offset + 33, $itm_site_cnt, value);
	}


	/**
	 * Version master 版マスタ.<p>
	 *
	 */
	public MCNumber itm_ver_cnt() {
		return getConstNumber(offset + 34, $itm_ver_cnt);
	}

	/**
	 * Version master 版マスタ.<p>
	 *
	 */
	public void itm_ver_cnt(MCNumber value) {
		setConstNumber(offset + 34, $itm_ver_cnt, value);
	}

	/**
	 * Version master 版マスタ.<p>
	 *
	 */
	public void itm_ver_cnt(int value) {
		setConstNumber(offset + 34, $itm_ver_cnt, value);
	}

	/**
	 * Version master 版マスタ.<p>
	 *
	 */
	public void itm_ver_cnt(long value) {
		setConstNumber(offset + 34, $itm_ver_cnt, value);
	}

	/**
	 * Version master 版マスタ.<p>
	 *
	 */
	public void itm_ver_cnt(float value) {
		setConstNumber(offset + 34, $itm_ver_cnt, value);
	}

	/**
	 * Version master 版マスタ.<p>
	 *
	 */
	public void itm_ver_cnt(double value) {
		setConstNumber(offset + 34, $itm_ver_cnt, value);
	}


	/**
	 * Lot copy master (To) ロット継承先マスタ.<p>
	 *
	 */
	public MCNumber lot_inh_dest_cnt() {
		return getConstNumber(offset + 35, $lot_inh_dest_cnt);
	}

	/**
	 * Lot copy master (To) ロット継承先マスタ.<p>
	 *
	 */
	public void lot_inh_dest_cnt(MCNumber value) {
		setConstNumber(offset + 35, $lot_inh_dest_cnt, value);
	}

	/**
	 * Lot copy master (To) ロット継承先マスタ.<p>
	 *
	 */
	public void lot_inh_dest_cnt(int value) {
		setConstNumber(offset + 35, $lot_inh_dest_cnt, value);
	}

	/**
	 * Lot copy master (To) ロット継承先マスタ.<p>
	 *
	 */
	public void lot_inh_dest_cnt(long value) {
		setConstNumber(offset + 35, $lot_inh_dest_cnt, value);
	}

	/**
	 * Lot copy master (To) ロット継承先マスタ.<p>
	 *
	 */
	public void lot_inh_dest_cnt(float value) {
		setConstNumber(offset + 35, $lot_inh_dest_cnt, value);
	}

	/**
	 * Lot copy master (To) ロット継承先マスタ.<p>
	 *
	 */
	public void lot_inh_dest_cnt(double value) {
		setConstNumber(offset + 35, $lot_inh_dest_cnt, value);
	}


	/**
	 * Lot copy master (From) ロット継承元マスタ.<p>
	 *
	 */
	public MCNumber lot_inh_src_cnt() {
		return getConstNumber(offset + 36, $lot_inh_src_cnt);
	}

	/**
	 * Lot copy master (From) ロット継承元マスタ.<p>
	 *
	 */
	public void lot_inh_src_cnt(MCNumber value) {
		setConstNumber(offset + 36, $lot_inh_src_cnt, value);
	}

	/**
	 * Lot copy master (From) ロット継承元マスタ.<p>
	 *
	 */
	public void lot_inh_src_cnt(int value) {
		setConstNumber(offset + 36, $lot_inh_src_cnt, value);
	}

	/**
	 * Lot copy master (From) ロット継承元マスタ.<p>
	 *
	 */
	public void lot_inh_src_cnt(long value) {
		setConstNumber(offset + 36, $lot_inh_src_cnt, value);
	}

	/**
	 * Lot copy master (From) ロット継承元マスタ.<p>
	 *
	 */
	public void lot_inh_src_cnt(float value) {
		setConstNumber(offset + 36, $lot_inh_src_cnt, value);
	}

	/**
	 * Lot copy master (From) ロット継承元マスタ.<p>
	 *
	 */
	public void lot_inh_src_cnt(double value) {
		setConstNumber(offset + 36, $lot_inh_src_cnt, value);
	}


	/**
	 * Item specification master 品目仕様マスタ.<p>
	 *
	 */
	public MCNumber itm_spec_cnt() {
		return getConstNumber(offset + 37, $itm_spec_cnt);
	}

	/**
	 * Item specification master 品目仕様マスタ.<p>
	 *
	 */
	public void itm_spec_cnt(MCNumber value) {
		setConstNumber(offset + 37, $itm_spec_cnt, value);
	}

	/**
	 * Item specification master 品目仕様マスタ.<p>
	 *
	 */
	public void itm_spec_cnt(int value) {
		setConstNumber(offset + 37, $itm_spec_cnt, value);
	}

	/**
	 * Item specification master 品目仕様マスタ.<p>
	 *
	 */
	public void itm_spec_cnt(long value) {
		setConstNumber(offset + 37, $itm_spec_cnt, value);
	}

	/**
	 * Item specification master 品目仕様マスタ.<p>
	 *
	 */
	public void itm_spec_cnt(float value) {
		setConstNumber(offset + 37, $itm_spec_cnt, value);
	}

	/**
	 * Item specification master 品目仕様マスタ.<p>
	 *
	 */
	public void itm_spec_cnt(double value) {
		setConstNumber(offset + 37, $itm_spec_cnt, value);
	}


	/**
	 * Item specification detail master 品目仕様項目マスタ.<p>
	 *
	 */
	public MCNumber itm_spec_desc_cnt() {
		return getConstNumber(offset + 38, $itm_spec_desc_cnt);
	}

	/**
	 * Item specification detail master 品目仕様項目マスタ.<p>
	 *
	 */
	public void itm_spec_desc_cnt(MCNumber value) {
		setConstNumber(offset + 38, $itm_spec_desc_cnt, value);
	}

	/**
	 * Item specification detail master 品目仕様項目マスタ.<p>
	 *
	 */
	public void itm_spec_desc_cnt(int value) {
		setConstNumber(offset + 38, $itm_spec_desc_cnt, value);
	}

	/**
	 * Item specification detail master 品目仕様項目マスタ.<p>
	 *
	 */
	public void itm_spec_desc_cnt(long value) {
		setConstNumber(offset + 38, $itm_spec_desc_cnt, value);
	}

	/**
	 * Item specification detail master 品目仕様項目マスタ.<p>
	 *
	 */
	public void itm_spec_desc_cnt(float value) {
		setConstNumber(offset + 38, $itm_spec_desc_cnt, value);
	}

	/**
	 * Item specification detail master 品目仕様項目マスタ.<p>
	 *
	 */
	public void itm_spec_desc_cnt(double value) {
		setConstNumber(offset + 38, $itm_spec_desc_cnt, value);
	}


	/**
	 * Item configuration master (Main item) 品目構成マスタ（主品目）.<p>
	 *
	 */
	public MCNumber itm_comp_core_cnt() {
		return getConstNumber(offset + 39, $itm_comp_core_cnt);
	}

	/**
	 * Item configuration master (Main item) 品目構成マスタ（主品目）.<p>
	 *
	 */
	public void itm_comp_core_cnt(MCNumber value) {
		setConstNumber(offset + 39, $itm_comp_core_cnt, value);
	}

	/**
	 * Item configuration master (Main item) 品目構成マスタ（主品目）.<p>
	 *
	 */
	public void itm_comp_core_cnt(int value) {
		setConstNumber(offset + 39, $itm_comp_core_cnt, value);
	}

	/**
	 * Item configuration master (Main item) 品目構成マスタ（主品目）.<p>
	 *
	 */
	public void itm_comp_core_cnt(long value) {
		setConstNumber(offset + 39, $itm_comp_core_cnt, value);
	}

	/**
	 * Item configuration master (Main item) 品目構成マスタ（主品目）.<p>
	 *
	 */
	public void itm_comp_core_cnt(float value) {
		setConstNumber(offset + 39, $itm_comp_core_cnt, value);
	}

	/**
	 * Item configuration master (Main item) 品目構成マスタ（主品目）.<p>
	 *
	 */
	public void itm_comp_core_cnt(double value) {
		setConstNumber(offset + 39, $itm_comp_core_cnt, value);
	}


	/**
	 * Item structure master (Component) 品目構成マスタ（構成品目）.<p>
	 *
	 */
	public MCNumber itm_comp_comp_cnt() {
		return getConstNumber(offset + 40, $itm_comp_comp_cnt);
	}

	/**
	 * Item structure master (Component) 品目構成マスタ（構成品目）.<p>
	 *
	 */
	public void itm_comp_comp_cnt(MCNumber value) {
		setConstNumber(offset + 40, $itm_comp_comp_cnt, value);
	}

	/**
	 * Item structure master (Component) 品目構成マスタ（構成品目）.<p>
	 *
	 */
	public void itm_comp_comp_cnt(int value) {
		setConstNumber(offset + 40, $itm_comp_comp_cnt, value);
	}

	/**
	 * Item structure master (Component) 品目構成マスタ（構成品目）.<p>
	 *
	 */
	public void itm_comp_comp_cnt(long value) {
		setConstNumber(offset + 40, $itm_comp_comp_cnt, value);
	}

	/**
	 * Item structure master (Component) 品目構成マスタ（構成品目）.<p>
	 *
	 */
	public void itm_comp_comp_cnt(float value) {
		setConstNumber(offset + 40, $itm_comp_comp_cnt, value);
	}

	/**
	 * Item structure master (Component) 品目構成マスタ（構成品目）.<p>
	 *
	 */
	public void itm_comp_comp_cnt(double value) {
		setConstNumber(offset + 40, $itm_comp_comp_cnt, value);
	}


	/**
	 * MPS item master ＭＰＳ品目マスタ.<p>
	 *
	 */
	public MCNumber mps_itm_cnt() {
		return getConstNumber(offset + 41, $mps_itm_cnt);
	}

	/**
	 * MPS item master ＭＰＳ品目マスタ.<p>
	 *
	 */
	public void mps_itm_cnt(MCNumber value) {
		setConstNumber(offset + 41, $mps_itm_cnt, value);
	}

	/**
	 * MPS item master ＭＰＳ品目マスタ.<p>
	 *
	 */
	public void mps_itm_cnt(int value) {
		setConstNumber(offset + 41, $mps_itm_cnt, value);
	}

	/**
	 * MPS item master ＭＰＳ品目マスタ.<p>
	 *
	 */
	public void mps_itm_cnt(long value) {
		setConstNumber(offset + 41, $mps_itm_cnt, value);
	}

	/**
	 * MPS item master ＭＰＳ品目マスタ.<p>
	 *
	 */
	public void mps_itm_cnt(float value) {
		setConstNumber(offset + 41, $mps_itm_cnt, value);
	}

	/**
	 * MPS item master ＭＰＳ品目マスタ.<p>
	 *
	 */
	public void mps_itm_cnt(double value) {
		setConstNumber(offset + 41, $mps_itm_cnt, value);
	}


	/**
	 * Sales plan item configuration master 販売計画品目構成マスタ.<p>
	 *
	 */
	public MCNumber spln_itm_conf_cnt() {
		return getConstNumber(offset + 42, $spln_itm_conf_cnt);
	}

	/**
	 * Sales plan item configuration master 販売計画品目構成マスタ.<p>
	 *
	 */
	public void spln_itm_conf_cnt(MCNumber value) {
		setConstNumber(offset + 42, $spln_itm_conf_cnt, value);
	}

	/**
	 * Sales plan item configuration master 販売計画品目構成マスタ.<p>
	 *
	 */
	public void spln_itm_conf_cnt(int value) {
		setConstNumber(offset + 42, $spln_itm_conf_cnt, value);
	}

	/**
	 * Sales plan item configuration master 販売計画品目構成マスタ.<p>
	 *
	 */
	public void spln_itm_conf_cnt(long value) {
		setConstNumber(offset + 42, $spln_itm_conf_cnt, value);
	}

	/**
	 * Sales plan item configuration master 販売計画品目構成マスタ.<p>
	 *
	 */
	public void spln_itm_conf_cnt(float value) {
		setConstNumber(offset + 42, $spln_itm_conf_cnt, value);
	}

	/**
	 * Sales plan item configuration master 販売計画品目構成マスタ.<p>
	 *
	 */
	public void spln_itm_conf_cnt(double value) {
		setConstNumber(offset + 42, $spln_itm_conf_cnt, value);
	}


	/**
	 * Direct delivery LT master 仕入直送ＬＴマスタ.<p>
	 *
	 */
	public MCNumber purc_ddlv_lt_cnt() {
		return getConstNumber(offset + 43, $purc_ddlv_lt_cnt);
	}

	/**
	 * Direct delivery LT master 仕入直送ＬＴマスタ.<p>
	 *
	 */
	public void purc_ddlv_lt_cnt(MCNumber value) {
		setConstNumber(offset + 43, $purc_ddlv_lt_cnt, value);
	}

	/**
	 * Direct delivery LT master 仕入直送ＬＴマスタ.<p>
	 *
	 */
	public void purc_ddlv_lt_cnt(int value) {
		setConstNumber(offset + 43, $purc_ddlv_lt_cnt, value);
	}

	/**
	 * Direct delivery LT master 仕入直送ＬＴマスタ.<p>
	 *
	 */
	public void purc_ddlv_lt_cnt(long value) {
		setConstNumber(offset + 43, $purc_ddlv_lt_cnt, value);
	}

	/**
	 * Direct delivery LT master 仕入直送ＬＴマスタ.<p>
	 *
	 */
	public void purc_ddlv_lt_cnt(float value) {
		setConstNumber(offset + 43, $purc_ddlv_lt_cnt, value);
	}

	/**
	 * Direct delivery LT master 仕入直送ＬＴマスタ.<p>
	 *
	 */
	public void purc_ddlv_lt_cnt(double value) {
		setConstNumber(offset + 43, $purc_ddlv_lt_cnt, value);
	}


	/**
	 * BP item master 取引先品目マスタ.<p>
	 *
	 */
	public MCNumber bp_itm_cnt() {
		return getConstNumber(offset + 44, $bp_itm_cnt);
	}

	/**
	 * BP item master 取引先品目マスタ.<p>
	 *
	 */
	public void bp_itm_cnt(MCNumber value) {
		setConstNumber(offset + 44, $bp_itm_cnt, value);
	}

	/**
	 * BP item master 取引先品目マスタ.<p>
	 *
	 */
	public void bp_itm_cnt(int value) {
		setConstNumber(offset + 44, $bp_itm_cnt, value);
	}

	/**
	 * BP item master 取引先品目マスタ.<p>
	 *
	 */
	public void bp_itm_cnt(long value) {
		setConstNumber(offset + 44, $bp_itm_cnt, value);
	}

	/**
	 * BP item master 取引先品目マスタ.<p>
	 *
	 */
	public void bp_itm_cnt(float value) {
		setConstNumber(offset + 44, $bp_itm_cnt, value);
	}

	/**
	 * BP item master 取引先品目マスタ.<p>
	 *
	 */
	public void bp_itm_cnt(double value) {
		setConstNumber(offset + 44, $bp_itm_cnt, value);
	}


	/**
	 * Subcontracting unit price master 加工単価マスタ.<p>
	 *
	 */
	public MCNumber proc_upri_cnt() {
		return getConstNumber(offset + 45, $proc_upri_cnt);
	}

	/**
	 * Subcontracting unit price master 加工単価マスタ.<p>
	 *
	 */
	public void proc_upri_cnt(MCNumber value) {
		setConstNumber(offset + 45, $proc_upri_cnt, value);
	}

	/**
	 * Subcontracting unit price master 加工単価マスタ.<p>
	 *
	 */
	public void proc_upri_cnt(int value) {
		setConstNumber(offset + 45, $proc_upri_cnt, value);
	}

	/**
	 * Subcontracting unit price master 加工単価マスタ.<p>
	 *
	 */
	public void proc_upri_cnt(long value) {
		setConstNumber(offset + 45, $proc_upri_cnt, value);
	}

	/**
	 * Subcontracting unit price master 加工単価マスタ.<p>
	 *
	 */
	public void proc_upri_cnt(float value) {
		setConstNumber(offset + 45, $proc_upri_cnt, value);
	}

	/**
	 * Subcontracting unit price master 加工単価マスタ.<p>
	 *
	 */
	public void proc_upri_cnt(double value) {
		setConstNumber(offset + 45, $proc_upri_cnt, value);
	}


	/**
	 * Supply unit price master 支給単価マスタ.<p>
	 *
	 */
	public MCNumber prov_upri_cnt() {
		return getConstNumber(offset + 46, $prov_upri_cnt);
	}

	/**
	 * Supply unit price master 支給単価マスタ.<p>
	 *
	 */
	public void prov_upri_cnt(MCNumber value) {
		setConstNumber(offset + 46, $prov_upri_cnt, value);
	}

	/**
	 * Supply unit price master 支給単価マスタ.<p>
	 *
	 */
	public void prov_upri_cnt(int value) {
		setConstNumber(offset + 46, $prov_upri_cnt, value);
	}

	/**
	 * Supply unit price master 支給単価マスタ.<p>
	 *
	 */
	public void prov_upri_cnt(long value) {
		setConstNumber(offset + 46, $prov_upri_cnt, value);
	}

	/**
	 * Supply unit price master 支給単価マスタ.<p>
	 *
	 */
	public void prov_upri_cnt(float value) {
		setConstNumber(offset + 46, $prov_upri_cnt, value);
	}

	/**
	 * Supply unit price master 支給単価マスタ.<p>
	 *
	 */
	public void prov_upri_cnt(double value) {
		setConstNumber(offset + 46, $prov_upri_cnt, value);
	}


	/**
	 * Purchase unit price master 購買単価マスタ.<p>
	 *
	 */
	public MCNumber purc_upri_cnt() {
		return getConstNumber(offset + 47, $purc_upri_cnt);
	}

	/**
	 * Purchase unit price master 購買単価マスタ.<p>
	 *
	 */
	public void purc_upri_cnt(MCNumber value) {
		setConstNumber(offset + 47, $purc_upri_cnt, value);
	}

	/**
	 * Purchase unit price master 購買単価マスタ.<p>
	 *
	 */
	public void purc_upri_cnt(int value) {
		setConstNumber(offset + 47, $purc_upri_cnt, value);
	}

	/**
	 * Purchase unit price master 購買単価マスタ.<p>
	 *
	 */
	public void purc_upri_cnt(long value) {
		setConstNumber(offset + 47, $purc_upri_cnt, value);
	}

	/**
	 * Purchase unit price master 購買単価マスタ.<p>
	 *
	 */
	public void purc_upri_cnt(float value) {
		setConstNumber(offset + 47, $purc_upri_cnt, value);
	}

	/**
	 * Purchase unit price master 購買単価マスタ.<p>
	 *
	 */
	public void purc_upri_cnt(double value) {
		setConstNumber(offset + 47, $purc_upri_cnt, value);
	}


	/**
	 * Standard sales unit price master 標準販売単価マスタ.<p>
	 *
	 */
	public MCNumber std_sls_upri_cnt() {
		return getConstNumber(offset + 48, $std_sls_upri_cnt);
	}

	/**
	 * Standard sales unit price master 標準販売単価マスタ.<p>
	 *
	 */
	public void std_sls_upri_cnt(MCNumber value) {
		setConstNumber(offset + 48, $std_sls_upri_cnt, value);
	}

	/**
	 * Standard sales unit price master 標準販売単価マスタ.<p>
	 *
	 */
	public void std_sls_upri_cnt(int value) {
		setConstNumber(offset + 48, $std_sls_upri_cnt, value);
	}

	/**
	 * Standard sales unit price master 標準販売単価マスタ.<p>
	 *
	 */
	public void std_sls_upri_cnt(long value) {
		setConstNumber(offset + 48, $std_sls_upri_cnt, value);
	}

	/**
	 * Standard sales unit price master 標準販売単価マスタ.<p>
	 *
	 */
	public void std_sls_upri_cnt(float value) {
		setConstNumber(offset + 48, $std_sls_upri_cnt, value);
	}

	/**
	 * Standard sales unit price master 標準販売単価マスタ.<p>
	 *
	 */
	public void std_sls_upri_cnt(double value) {
		setConstNumber(offset + 48, $std_sls_upri_cnt, value);
	}


	/**
	 * Item sales unit price master 品目販売単価マスタ.<p>
	 *
	 */
	public MCNumber itm_sls_upri_cnt() {
		return getConstNumber(offset + 49, $itm_sls_upri_cnt);
	}

	/**
	 * Item sales unit price master 品目販売単価マスタ.<p>
	 *
	 */
	public void itm_sls_upri_cnt(MCNumber value) {
		setConstNumber(offset + 49, $itm_sls_upri_cnt, value);
	}

	/**
	 * Item sales unit price master 品目販売単価マスタ.<p>
	 *
	 */
	public void itm_sls_upri_cnt(int value) {
		setConstNumber(offset + 49, $itm_sls_upri_cnt, value);
	}

	/**
	 * Item sales unit price master 品目販売単価マスタ.<p>
	 *
	 */
	public void itm_sls_upri_cnt(long value) {
		setConstNumber(offset + 49, $itm_sls_upri_cnt, value);
	}

	/**
	 * Item sales unit price master 品目販売単価マスタ.<p>
	 *
	 */
	public void itm_sls_upri_cnt(float value) {
		setConstNumber(offset + 49, $itm_sls_upri_cnt, value);
	}

	/**
	 * Item sales unit price master 品目販売単価マスタ.<p>
	 *
	 */
	public void itm_sls_upri_cnt(double value) {
		setConstNumber(offset + 49, $itm_sls_upri_cnt, value);
	}


	/**
	 * Customer sales unit price master 得意先販売単価マスタ.<p>
	 *
	 */
	public MCNumber cst_sls_upri_cnt() {
		return getConstNumber(offset + 50, $cst_sls_upri_cnt);
	}

	/**
	 * Customer sales unit price master 得意先販売単価マスタ.<p>
	 *
	 */
	public void cst_sls_upri_cnt(MCNumber value) {
		setConstNumber(offset + 50, $cst_sls_upri_cnt, value);
	}

	/**
	 * Customer sales unit price master 得意先販売単価マスタ.<p>
	 *
	 */
	public void cst_sls_upri_cnt(int value) {
		setConstNumber(offset + 50, $cst_sls_upri_cnt, value);
	}

	/**
	 * Customer sales unit price master 得意先販売単価マスタ.<p>
	 *
	 */
	public void cst_sls_upri_cnt(long value) {
		setConstNumber(offset + 50, $cst_sls_upri_cnt, value);
	}

	/**
	 * Customer sales unit price master 得意先販売単価マスタ.<p>
	 *
	 */
	public void cst_sls_upri_cnt(float value) {
		setConstNumber(offset + 50, $cst_sls_upri_cnt, value);
	}

	/**
	 * Customer sales unit price master 得意先販売単価マスタ.<p>
	 *
	 */
	public void cst_sls_upri_cnt(double value) {
		setConstNumber(offset + 50, $cst_sls_upri_cnt, value);
	}


	/**
	 * Assortment master (Representative item) 品揃マスタ（代表品目）.<p>
	 *
	 */
	public MCNumber set_itm_main_cnt() {
		return getConstNumber(offset + 51, $set_itm_main_cnt);
	}

	/**
	 * Assortment master (Representative item) 品揃マスタ（代表品目）.<p>
	 *
	 */
	public void set_itm_main_cnt(MCNumber value) {
		setConstNumber(offset + 51, $set_itm_main_cnt, value);
	}

	/**
	 * Assortment master (Representative item) 品揃マスタ（代表品目）.<p>
	 *
	 */
	public void set_itm_main_cnt(int value) {
		setConstNumber(offset + 51, $set_itm_main_cnt, value);
	}

	/**
	 * Assortment master (Representative item) 品揃マスタ（代表品目）.<p>
	 *
	 */
	public void set_itm_main_cnt(long value) {
		setConstNumber(offset + 51, $set_itm_main_cnt, value);
	}

	/**
	 * Assortment master (Representative item) 品揃マスタ（代表品目）.<p>
	 *
	 */
	public void set_itm_main_cnt(float value) {
		setConstNumber(offset + 51, $set_itm_main_cnt, value);
	}

	/**
	 * Assortment master (Representative item) 品揃マスタ（代表品目）.<p>
	 *
	 */
	public void set_itm_main_cnt(double value) {
		setConstNumber(offset + 51, $set_itm_main_cnt, value);
	}


	/**
	 * Assortment master (Assortment item) 品揃マスタ（品揃品目）.<p>
	 *
	 */
	public MCNumber set_itm_set_cnt() {
		return getConstNumber(offset + 52, $set_itm_set_cnt);
	}

	/**
	 * Assortment master (Assortment item) 品揃マスタ（品揃品目）.<p>
	 *
	 */
	public void set_itm_set_cnt(MCNumber value) {
		setConstNumber(offset + 52, $set_itm_set_cnt, value);
	}

	/**
	 * Assortment master (Assortment item) 品揃マスタ（品揃品目）.<p>
	 *
	 */
	public void set_itm_set_cnt(int value) {
		setConstNumber(offset + 52, $set_itm_set_cnt, value);
	}

	/**
	 * Assortment master (Assortment item) 品揃マスタ（品揃品目）.<p>
	 *
	 */
	public void set_itm_set_cnt(long value) {
		setConstNumber(offset + 52, $set_itm_set_cnt, value);
	}

	/**
	 * Assortment master (Assortment item) 品揃マスタ（品揃品目）.<p>
	 *
	 */
	public void set_itm_set_cnt(float value) {
		setConstNumber(offset + 52, $set_itm_set_cnt, value);
	}

	/**
	 * Assortment master (Assortment item) 品揃マスタ（品揃品目）.<p>
	 *
	 */
	public void set_itm_set_cnt(double value) {
		setConstNumber(offset + 52, $set_itm_set_cnt, value);
	}


	/**
	 * IF code conversion master ＩＦコード変換マスタ.<p>
	 *
	 */
	public MCNumber if_x_cnt() {
		return getConstNumber(offset + 53, $if_x_cnt);
	}

	/**
	 * IF code conversion master ＩＦコード変換マスタ.<p>
	 *
	 */
	public void if_x_cnt(MCNumber value) {
		setConstNumber(offset + 53, $if_x_cnt, value);
	}

	/**
	 * IF code conversion master ＩＦコード変換マスタ.<p>
	 *
	 */
	public void if_x_cnt(int value) {
		setConstNumber(offset + 53, $if_x_cnt, value);
	}

	/**
	 * IF code conversion master ＩＦコード変換マスタ.<p>
	 *
	 */
	public void if_x_cnt(long value) {
		setConstNumber(offset + 53, $if_x_cnt, value);
	}

	/**
	 * IF code conversion master ＩＦコード変換マスタ.<p>
	 *
	 */
	public void if_x_cnt(float value) {
		setConstNumber(offset + 53, $if_x_cnt, value);
	}

	/**
	 * IF code conversion master ＩＦコード変換マスタ.<p>
	 *
	 */
	public void if_x_cnt(double value) {
		setConstNumber(offset + 53, $if_x_cnt, value);
	}


	/**
	 * Cost item category structure master 原価品群構成マスタ.<p>
	 *
	 */
	public MCNumber ctg_config_cnt() {
		return getConstNumber(offset + 54, $ctg_config_cnt);
	}

	/**
	 * Cost item category structure master 原価品群構成マスタ.<p>
	 *
	 */
	public void ctg_config_cnt(MCNumber value) {
		setConstNumber(offset + 54, $ctg_config_cnt, value);
	}

	/**
	 * Cost item category structure master 原価品群構成マスタ.<p>
	 *
	 */
	public void ctg_config_cnt(int value) {
		setConstNumber(offset + 54, $ctg_config_cnt, value);
	}

	/**
	 * Cost item category structure master 原価品群構成マスタ.<p>
	 *
	 */
	public void ctg_config_cnt(long value) {
		setConstNumber(offset + 54, $ctg_config_cnt, value);
	}

	/**
	 * Cost item category structure master 原価品群構成マスタ.<p>
	 *
	 */
	public void ctg_config_cnt(float value) {
		setConstNumber(offset + 54, $ctg_config_cnt, value);
	}

	/**
	 * Cost item category structure master 原価品群構成マスタ.<p>
	 *
	 */
	public void ctg_config_cnt(double value) {
		setConstNumber(offset + 54, $ctg_config_cnt, value);
	}


	/**
	 * Auto-journal pattern master 自動仕訳パタンマスタ.<p>
	 *
	 */
	public MCNumber jnl_ptn_cnt() {
		return getConstNumber(offset + 55, $jnl_ptn_cnt);
	}

	/**
	 * Auto-journal pattern master 自動仕訳パタンマスタ.<p>
	 *
	 */
	public void jnl_ptn_cnt(MCNumber value) {
		setConstNumber(offset + 55, $jnl_ptn_cnt, value);
	}

	/**
	 * Auto-journal pattern master 自動仕訳パタンマスタ.<p>
	 *
	 */
	public void jnl_ptn_cnt(int value) {
		setConstNumber(offset + 55, $jnl_ptn_cnt, value);
	}

	/**
	 * Auto-journal pattern master 自動仕訳パタンマスタ.<p>
	 *
	 */
	public void jnl_ptn_cnt(long value) {
		setConstNumber(offset + 55, $jnl_ptn_cnt, value);
	}

	/**
	 * Auto-journal pattern master 自動仕訳パタンマスタ.<p>
	 *
	 */
	public void jnl_ptn_cnt(float value) {
		setConstNumber(offset + 55, $jnl_ptn_cnt, value);
	}

	/**
	 * Auto-journal pattern master 自動仕訳パタンマスタ.<p>
	 *
	 */
	public void jnl_ptn_cnt(double value) {
		setConstNumber(offset + 55, $jnl_ptn_cnt, value);
	}


	/**
	 * Allocation coefficient structure master 配賦係数構成マスタ.<p>
	 *
	 */
	public MCNumber coef_config_cnt() {
		return getConstNumber(offset + 56, $coef_config_cnt);
	}

	/**
	 * Allocation coefficient structure master 配賦係数構成マスタ.<p>
	 *
	 */
	public void coef_config_cnt(MCNumber value) {
		setConstNumber(offset + 56, $coef_config_cnt, value);
	}

	/**
	 * Allocation coefficient structure master 配賦係数構成マスタ.<p>
	 *
	 */
	public void coef_config_cnt(int value) {
		setConstNumber(offset + 56, $coef_config_cnt, value);
	}

	/**
	 * Allocation coefficient structure master 配賦係数構成マスタ.<p>
	 *
	 */
	public void coef_config_cnt(long value) {
		setConstNumber(offset + 56, $coef_config_cnt, value);
	}

	/**
	 * Allocation coefficient structure master 配賦係数構成マスタ.<p>
	 *
	 */
	public void coef_config_cnt(float value) {
		setConstNumber(offset + 56, $coef_config_cnt, value);
	}

	/**
	 * Allocation coefficient structure master 配賦係数構成マスタ.<p>
	 *
	 */
	public void coef_config_cnt(double value) {
		setConstNumber(offset + 56, $coef_config_cnt, value);
	}


	/**
	 * Cost element allocation master 費目配賦マスタ.<p>
	 *
	 */
	public MCNumber alc_expns_cnt() {
		return getConstNumber(offset + 57, $alc_expns_cnt);
	}

	/**
	 * Cost element allocation master 費目配賦マスタ.<p>
	 *
	 */
	public void alc_expns_cnt(MCNumber value) {
		setConstNumber(offset + 57, $alc_expns_cnt, value);
	}

	/**
	 * Cost element allocation master 費目配賦マスタ.<p>
	 *
	 */
	public void alc_expns_cnt(int value) {
		setConstNumber(offset + 57, $alc_expns_cnt, value);
	}

	/**
	 * Cost element allocation master 費目配賦マスタ.<p>
	 *
	 */
	public void alc_expns_cnt(long value) {
		setConstNumber(offset + 57, $alc_expns_cnt, value);
	}

	/**
	 * Cost element allocation master 費目配賦マスタ.<p>
	 *
	 */
	public void alc_expns_cnt(float value) {
		setConstNumber(offset + 57, $alc_expns_cnt, value);
	}

	/**
	 * Cost element allocation master 費目配賦マスタ.<p>
	 *
	 */
	public void alc_expns_cnt(double value) {
		setConstNumber(offset + 57, $alc_expns_cnt, value);
	}


	/**
	 * Input allocation master 投入配賦マスタ.<p>
	 *
	 */
	public MCNumber alc_inpt_cnt() {
		return getConstNumber(offset + 58, $alc_inpt_cnt);
	}

	/**
	 * Input allocation master 投入配賦マスタ.<p>
	 *
	 */
	public void alc_inpt_cnt(MCNumber value) {
		setConstNumber(offset + 58, $alc_inpt_cnt, value);
	}

	/**
	 * Input allocation master 投入配賦マスタ.<p>
	 *
	 */
	public void alc_inpt_cnt(int value) {
		setConstNumber(offset + 58, $alc_inpt_cnt, value);
	}

	/**
	 * Input allocation master 投入配賦マスタ.<p>
	 *
	 */
	public void alc_inpt_cnt(long value) {
		setConstNumber(offset + 58, $alc_inpt_cnt, value);
	}

	/**
	 * Input allocation master 投入配賦マスタ.<p>
	 *
	 */
	public void alc_inpt_cnt(float value) {
		setConstNumber(offset + 58, $alc_inpt_cnt, value);
	}

	/**
	 * Input allocation master 投入配賦マスタ.<p>
	 *
	 */
	public void alc_inpt_cnt(double value) {
		setConstNumber(offset + 58, $alc_inpt_cnt, value);
	}


	/**
	 * Not costing item master 原価対象外品目マスタ.<p>
	 *
	 */
	public MCNumber cost_itm_out_cnt() {
		return getConstNumber(offset + 59, $cost_itm_out_cnt);
	}

	/**
	 * Not costing item master 原価対象外品目マスタ.<p>
	 *
	 */
	public void cost_itm_out_cnt(MCNumber value) {
		setConstNumber(offset + 59, $cost_itm_out_cnt, value);
	}

	/**
	 * Not costing item master 原価対象外品目マスタ.<p>
	 *
	 */
	public void cost_itm_out_cnt(int value) {
		setConstNumber(offset + 59, $cost_itm_out_cnt, value);
	}

	/**
	 * Not costing item master 原価対象外品目マスタ.<p>
	 *
	 */
	public void cost_itm_out_cnt(long value) {
		setConstNumber(offset + 59, $cost_itm_out_cnt, value);
	}

	/**
	 * Not costing item master 原価対象外品目マスタ.<p>
	 *
	 */
	public void cost_itm_out_cnt(float value) {
		setConstNumber(offset + 59, $cost_itm_out_cnt, value);
	}

	/**
	 * Not costing item master 原価対象外品目マスタ.<p>
	 *
	 */
	public void cost_itm_out_cnt(double value) {
		setConstNumber(offset + 59, $cost_itm_out_cnt, value);
	}


	/**
	 * Expenses allocation transfer master 経費配賦振替マスタ.<p>
	 *
	 */
	public MCNumber xpns_purc_alc_cnt() {
		return getConstNumber(offset + 60, $xpns_purc_alc_cnt);
	}

	/**
	 * Expenses allocation transfer master 経費配賦振替マスタ.<p>
	 *
	 */
	public void xpns_purc_alc_cnt(MCNumber value) {
		setConstNumber(offset + 60, $xpns_purc_alc_cnt, value);
	}

	/**
	 * Expenses allocation transfer master 経費配賦振替マスタ.<p>
	 *
	 */
	public void xpns_purc_alc_cnt(int value) {
		setConstNumber(offset + 60, $xpns_purc_alc_cnt, value);
	}

	/**
	 * Expenses allocation transfer master 経費配賦振替マスタ.<p>
	 *
	 */
	public void xpns_purc_alc_cnt(long value) {
		setConstNumber(offset + 60, $xpns_purc_alc_cnt, value);
	}

	/**
	 * Expenses allocation transfer master 経費配賦振替マスタ.<p>
	 *
	 */
	public void xpns_purc_alc_cnt(float value) {
		setConstNumber(offset + 60, $xpns_purc_alc_cnt, value);
	}

	/**
	 * Expenses allocation transfer master 経費配賦振替マスタ.<p>
	 *
	 */
	public void xpns_purc_alc_cnt(double value) {
		setConstNumber(offset + 60, $xpns_purc_alc_cnt, value);
	}


	/**
	 * Item (Distribution group) 品目（物流グループ）.<p>
	 *
	 */
	public MCNumber itm_lg_grp_cnt() {
		return getConstNumber(offset + 61, $itm_lg_grp_cnt);
	}

	/**
	 * Item (Distribution group) 品目（物流グループ）.<p>
	 *
	 */
	public void itm_lg_grp_cnt(MCNumber value) {
		setConstNumber(offset + 61, $itm_lg_grp_cnt, value);
	}

	/**
	 * Item (Distribution group) 品目（物流グループ）.<p>
	 *
	 */
	public void itm_lg_grp_cnt(int value) {
		setConstNumber(offset + 61, $itm_lg_grp_cnt, value);
	}

	/**
	 * Item (Distribution group) 品目（物流グループ）.<p>
	 *
	 */
	public void itm_lg_grp_cnt(long value) {
		setConstNumber(offset + 61, $itm_lg_grp_cnt, value);
	}

	/**
	 * Item (Distribution group) 品目（物流グループ）.<p>
	 *
	 */
	public void itm_lg_grp_cnt(float value) {
		setConstNumber(offset + 61, $itm_lg_grp_cnt, value);
	}

	/**
	 * Item (Distribution group) 品目（物流グループ）.<p>
	 *
	 */
	public void itm_lg_grp_cnt(double value) {
		setConstNumber(offset + 61, $itm_lg_grp_cnt, value);
	}


	/**
	 * Item rack/line 品目棚・ライン.<p>
	 *
	 */
	public MCNumber itm_str_ln_cnt() {
		return getConstNumber(offset + 62, $itm_str_ln_cnt);
	}

	/**
	 * Item rack/line 品目棚・ライン.<p>
	 *
	 */
	public void itm_str_ln_cnt(MCNumber value) {
		setConstNumber(offset + 62, $itm_str_ln_cnt, value);
	}

	/**
	 * Item rack/line 品目棚・ライン.<p>
	 *
	 */
	public void itm_str_ln_cnt(int value) {
		setConstNumber(offset + 62, $itm_str_ln_cnt, value);
	}

	/**
	 * Item rack/line 品目棚・ライン.<p>
	 *
	 */
	public void itm_str_ln_cnt(long value) {
		setConstNumber(offset + 62, $itm_str_ln_cnt, value);
	}

	/**
	 * Item rack/line 品目棚・ライン.<p>
	 *
	 */
	public void itm_str_ln_cnt(float value) {
		setConstNumber(offset + 62, $itm_str_ln_cnt, value);
	}

	/**
	 * Item rack/line 品目棚・ライン.<p>
	 *
	 */
	public void itm_str_ln_cnt(double value) {
		setConstNumber(offset + 62, $itm_str_ln_cnt, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public boolean itm_flg() {
		return getConstBoolean(offset + 63, $itm_flg);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_flg(boolean value) {
		setConstBoolean(offset + 63, $itm_flg, value);
	}


	/**
	 * Item auxiliary 品目補助.<p>
	 *
	 */
	public boolean itm_sub_flg() {
		return getConstBoolean(offset + 64, $itm_sub_flg);
	}

	/**
	 * Item auxiliary 品目補助.<p>
	 *
	 */
	public void itm_sub_flg(boolean value) {
		setConstBoolean(offset + 64, $itm_sub_flg, value);
	}


	/**
	 * Item unit 品目単位.<p>
	 *
	 */
	public boolean itm_unit_flg() {
		return getConstBoolean(offset + 65, $itm_unit_flg);
	}

	/**
	 * Item unit 品目単位.<p>
	 *
	 */
	public void itm_unit_flg(boolean value) {
		setConstBoolean(offset + 65, $itm_unit_flg, value);
	}


	/**
	 * Item additional info. 品目付加情報.<p>
	 *
	 */
	public boolean attach_info_flg() {
		return getConstBoolean(offset + 66, $attach_info_flg);
	}

	/**
	 * Item additional info. 品目付加情報.<p>
	 *
	 */
	public void attach_info_flg(boolean value) {
		setConstBoolean(offset + 66, $attach_info_flg, value);
	}


	/**
	 * Item prohibit 品目禁止.<p>
	 *
	 */
	public boolean itm_stop_flg() {
		return getConstBoolean(offset + 67, $itm_stop_flg);
	}

	/**
	 * Item prohibit 品目禁止.<p>
	 *
	 */
	public void itm_stop_flg(boolean value) {
		setConstBoolean(offset + 67, $itm_stop_flg, value);
	}


	/**
	 * Item procurement disapproval 品目手配不許可.<p>
	 *
	 */
	public boolean itm_not_fix_flg() {
		return getConstBoolean(offset + 68, $itm_not_fix_flg);
	}

	/**
	 * Item procurement disapproval 品目手配不許可.<p>
	 *
	 */
	public void itm_not_fix_flg(boolean value) {
		setConstBoolean(offset + 68, $itm_not_fix_flg, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public boolean stdcost_flg() {
		return getConstBoolean(offset + 69, $stdcost_flg);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void stdcost_flg(boolean value) {
		setConstBoolean(offset + 69, $stdcost_flg, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 70, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 70, $sundry_itm_flg, value);
	}


	/**
	 * Item storage 品目格納先.<p>
	 *
	 */
	public boolean itm_strg_flg() {
		return getConstBoolean(offset + 71, $itm_strg_flg);
	}

	/**
	 * Item storage 品目格納先.<p>
	 *
	 */
	public void itm_strg_flg(boolean value) {
		setConstBoolean(offset + 71, $itm_strg_flg, value);
	}


	/**
	 * Mfg. allocation control 製造引当制御.<p>
	 *
	 */
	public boolean alloc_ctl_flg() {
		return getConstBoolean(offset + 72, $alloc_ctl_flg);
	}

	/**
	 * Mfg. allocation control 製造引当制御.<p>
	 *
	 */
	public void alloc_ctl_flg(boolean value) {
		setConstBoolean(offset + 72, $alloc_ctl_flg, value);
	}


	/**
	 * Inventory replenishment 在庫補充.<p>
	 *
	 */
	public boolean stk_rpl_flg() {
		return getConstBoolean(offset + 73, $stk_rpl_flg);
	}

	/**
	 * Inventory replenishment 在庫補充.<p>
	 *
	 */
	public void stk_rpl_flg(boolean value) {
		setConstBoolean(offset + 73, $stk_rpl_flg, value);
	}


	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public boolean alt_itm_flg() {
		return getConstBoolean(offset + 74, $alt_itm_flg);
	}

	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public void alt_itm_flg(boolean value) {
		setConstBoolean(offset + 74, $alt_itm_flg, value);
	}


	/**
	 * Item (WG) 品目（ＷＧ）.<p>
	 *
	 */
	public boolean itm_wg_flg() {
		return getConstBoolean(offset + 75, $itm_wg_flg);
	}

	/**
	 * Item (WG) 品目（ＷＧ）.<p>
	 *
	 */
	public void itm_wg_flg(boolean value) {
		setConstBoolean(offset + 75, $itm_wg_flg, value);
	}


	/**
	 * Item details 品目詳細.<p>
	 *
	 */
	public boolean itm_dtl_flg() {
		return getConstBoolean(offset + 76, $itm_dtl_flg);
	}

	/**
	 * Item details 品目詳細.<p>
	 *
	 */
	public void itm_dtl_flg(boolean value) {
		setConstBoolean(offset + 76, $itm_dtl_flg, value);
	}


	/**
	 * Item operation 品目工程.<p>
	 *
	 */
	public boolean itm_oper_flg() {
		return getConstBoolean(offset + 77, $itm_oper_flg);
	}

	/**
	 * Item operation 品目工程.<p>
	 *
	 */
	public void itm_oper_flg(boolean value) {
		setConstBoolean(offset + 77, $itm_oper_flg, value);
	}


	/**
	 * BOM (Parent) ＢＯＭ（親）.<p>
	 *
	 */
	public boolean bom_par_flg() {
		return getConstBoolean(offset + 78, $bom_par_flg);
	}

	/**
	 * BOM (Parent) ＢＯＭ（親）.<p>
	 *
	 */
	public void bom_par_flg(boolean value) {
		setConstBoolean(offset + 78, $bom_par_flg, value);
	}


	/**
	 * BOM (Child) ＢＯＭ（子）.<p>
	 *
	 */
	public boolean bom_chd_flg() {
		return getConstBoolean(offset + 79, $bom_chd_flg);
	}

	/**
	 * BOM (Child) ＢＯＭ（子）.<p>
	 *
	 */
	public void bom_chd_flg(boolean value) {
		setConstBoolean(offset + 79, $bom_chd_flg, value);
	}


	/**
	 * Operation man-hour 工程工数.<p>
	 *
	 */
	public boolean oper_wk_cost_flg() {
		return getConstBoolean(offset + 80, $oper_wk_cost_flg);
	}

	/**
	 * Operation man-hour 工程工数.<p>
	 *
	 */
	public void oper_wk_cost_flg(boolean value) {
		setConstBoolean(offset + 80, $oper_wk_cost_flg, value);
	}


	/**
	 * Item inspection pattern 品目検査パタン.<p>
	 *
	 */
	public boolean itm_insp_ptn_flg() {
		return getConstBoolean(offset + 81, $itm_insp_ptn_flg);
	}

	/**
	 * Item inspection pattern 品目検査パタン.<p>
	 *
	 */
	public void itm_insp_ptn_flg(boolean value) {
		setConstBoolean(offset + 81, $itm_insp_ptn_flg, value);
	}


	/**
	 * Item inspection 品目品管.<p>
	 *
	 */
	public boolean itm_insp_flg() {
		return getConstBoolean(offset + 82, $itm_insp_flg);
	}

	/**
	 * Item inspection 品目品管.<p>
	 *
	 */
	public void itm_insp_flg(boolean value) {
		setConstBoolean(offset + 82, $itm_insp_flg, value);
	}


	/**
	 * Item inspection specific 品目検査規格.<p>
	 *
	 */
	public boolean insp_spec_flg() {
		return getConstBoolean(offset + 83, $insp_spec_flg);
	}

	/**
	 * Item inspection specific 品目検査規格.<p>
	 *
	 */
	public void insp_spec_flg(boolean value) {
		setConstBoolean(offset + 83, $insp_spec_flg, value);
	}


	/**
	 * Item (Factory/Distribution warehouse) 品目（工場・物流倉庫）.<p>
	 *
	 */
	public boolean itm_site_flg() {
		return getConstBoolean(offset + 84, $itm_site_flg);
	}

	/**
	 * Item (Factory/Distribution warehouse) 品目（工場・物流倉庫）.<p>
	 *
	 */
	public void itm_site_flg(boolean value) {
		setConstBoolean(offset + 84, $itm_site_flg, value);
	}


	/**
	 * Version 版.<p>
	 *
	 */
	public boolean itm_ver_flg() {
		return getConstBoolean(offset + 85, $itm_ver_flg);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void itm_ver_flg(boolean value) {
		setConstBoolean(offset + 85, $itm_ver_flg, value);
	}


	/**
	 * Lot copy (To) ロット継承先.<p>
	 *
	 */
	public boolean lot_inh_dest_flg() {
		return getConstBoolean(offset + 86, $lot_inh_dest_flg);
	}

	/**
	 * Lot copy (To) ロット継承先.<p>
	 *
	 */
	public void lot_inh_dest_flg(boolean value) {
		setConstBoolean(offset + 86, $lot_inh_dest_flg, value);
	}


	/**
	 * Lot copy (From) ロット継承元.<p>
	 *
	 */
	public boolean lot_inh_src_flg() {
		return getConstBoolean(offset + 87, $lot_inh_src_flg);
	}

	/**
	 * Lot copy (From) ロット継承元.<p>
	 *
	 */
	public void lot_inh_src_flg(boolean value) {
		setConstBoolean(offset + 87, $lot_inh_src_flg, value);
	}


	/**
	 * Item specification 品目仕様.<p>
	 *
	 */
	public boolean itm_spec_flg() {
		return getConstBoolean(offset + 88, $itm_spec_flg);
	}

	/**
	 * Item specification 品目仕様.<p>
	 *
	 */
	public void itm_spec_flg(boolean value) {
		setConstBoolean(offset + 88, $itm_spec_flg, value);
	}


	/**
	 * Item specification detail 品目仕様項目.<p>
	 *
	 */
	public boolean itm_spec_desc_flg() {
		return getConstBoolean(offset + 89, $itm_spec_desc_flg);
	}

	/**
	 * Item specification detail 品目仕様項目.<p>
	 *
	 */
	public void itm_spec_desc_flg(boolean value) {
		setConstBoolean(offset + 89, $itm_spec_desc_flg, value);
	}


	/**
	 * Item structure (Main item) 品目構成（主品目）.<p>
	 *
	 */
	public boolean itm_comp_core_flg() {
		return getConstBoolean(offset + 90, $itm_comp_core_flg);
	}

	/**
	 * Item structure (Main item) 品目構成（主品目）.<p>
	 *
	 */
	public void itm_comp_core_flg(boolean value) {
		setConstBoolean(offset + 90, $itm_comp_core_flg, value);
	}


	/**
	 * Item structure (Component) 品目構成（構成品目）.<p>
	 *
	 */
	public boolean itm_comp_comp_flg() {
		return getConstBoolean(offset + 91, $itm_comp_comp_flg);
	}

	/**
	 * Item structure (Component) 品目構成（構成品目）.<p>
	 *
	 */
	public void itm_comp_comp_flg(boolean value) {
		setConstBoolean(offset + 91, $itm_comp_comp_flg, value);
	}


	/**
	 * MPS item ＭＰＳ品目.<p>
	 *
	 */
	public boolean mps_itm_flg() {
		return getConstBoolean(offset + 92, $mps_itm_flg);
	}

	/**
	 * MPS item ＭＰＳ品目.<p>
	 *
	 */
	public void mps_itm_flg(boolean value) {
		setConstBoolean(offset + 92, $mps_itm_flg, value);
	}


	/**
	 * Sales plan item configuration 販売計画品目構成.<p>
	 *
	 */
	public boolean spln_itm_conf_flg() {
		return getConstBoolean(offset + 93, $spln_itm_conf_flg);
	}

	/**
	 * Sales plan item configuration 販売計画品目構成.<p>
	 *
	 */
	public void spln_itm_conf_flg(boolean value) {
		setConstBoolean(offset + 93, $spln_itm_conf_flg, value);
	}


	/**
	 * Direct delivery LT 仕入直送ＬＴ.<p>
	 *
	 */
	public boolean purc_ddlv_lt_flg() {
		return getConstBoolean(offset + 94, $purc_ddlv_lt_flg);
	}

	/**
	 * Direct delivery LT 仕入直送ＬＴ.<p>
	 *
	 */
	public void purc_ddlv_lt_flg(boolean value) {
		setConstBoolean(offset + 94, $purc_ddlv_lt_flg, value);
	}


	/**
	 * BP item 取引先品目.<p>
	 *
	 */
	public boolean bp_itm_flg() {
		return getConstBoolean(offset + 95, $bp_itm_flg);
	}

	/**
	 * BP item 取引先品目.<p>
	 *
	 */
	public void bp_itm_flg(boolean value) {
		setConstBoolean(offset + 95, $bp_itm_flg, value);
	}


	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public boolean proc_upri_flg() {
		return getConstBoolean(offset + 96, $proc_upri_flg);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri_flg(boolean value) {
		setConstBoolean(offset + 96, $proc_upri_flg, value);
	}


	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public boolean prov_upri_flg() {
		return getConstBoolean(offset + 97, $prov_upri_flg);
	}

	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public void prov_upri_flg(boolean value) {
		setConstBoolean(offset + 97, $prov_upri_flg, value);
	}


	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public boolean purc_upri_flg() {
		return getConstBoolean(offset + 98, $purc_upri_flg);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void purc_upri_flg(boolean value) {
		setConstBoolean(offset + 98, $purc_upri_flg, value);
	}


	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public boolean std_sls_upri_flg() {
		return getConstBoolean(offset + 99, $std_sls_upri_flg);
	}

	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public void std_sls_upri_flg(boolean value) {
		setConstBoolean(offset + 99, $std_sls_upri_flg, value);
	}


	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public boolean itm_sls_upri_flg() {
		return getConstBoolean(offset + 100, $itm_sls_upri_flg);
	}

	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public void itm_sls_upri_flg(boolean value) {
		setConstBoolean(offset + 100, $itm_sls_upri_flg, value);
	}


	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public boolean cst_sls_upri_flg() {
		return getConstBoolean(offset + 101, $cst_sls_upri_flg);
	}

	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public void cst_sls_upri_flg(boolean value) {
		setConstBoolean(offset + 101, $cst_sls_upri_flg, value);
	}


	/**
	 * Assortment (Representative item) 品揃（代表品目）.<p>
	 *
	 */
	public boolean set_itm_main_flg() {
		return getConstBoolean(offset + 102, $set_itm_main_flg);
	}

	/**
	 * Assortment (Representative item) 品揃（代表品目）.<p>
	 *
	 */
	public void set_itm_main_flg(boolean value) {
		setConstBoolean(offset + 102, $set_itm_main_flg, value);
	}


	/**
	 * Assortment (Assortment item) 品揃（品揃品目）.<p>
	 *
	 */
	public boolean set_itm_set_flg() {
		return getConstBoolean(offset + 103, $set_itm_set_flg);
	}

	/**
	 * Assortment (Assortment item) 品揃（品揃品目）.<p>
	 *
	 */
	public void set_itm_set_flg(boolean value) {
		setConstBoolean(offset + 103, $set_itm_set_flg, value);
	}


	/**
	 * IF code conversion ＩＦコード変換.<p>
	 *
	 */
	public boolean if_x_flg() {
		return getConstBoolean(offset + 104, $if_x_flg);
	}

	/**
	 * IF code conversion ＩＦコード変換.<p>
	 *
	 */
	public void if_x_flg(boolean value) {
		setConstBoolean(offset + 104, $if_x_flg, value);
	}


	/**
	 * Cost item category structure 原価品群構成.<p>
	 *
	 */
	public boolean ctg_config_flg() {
		return getConstBoolean(offset + 105, $ctg_config_flg);
	}

	/**
	 * Cost item category structure 原価品群構成.<p>
	 *
	 */
	public void ctg_config_flg(boolean value) {
		setConstBoolean(offset + 105, $ctg_config_flg, value);
	}


	/**
	 * Auto-journal pattern 自動仕訳パタン.<p>
	 *
	 */
	public boolean jnl_ptn_flg() {
		return getConstBoolean(offset + 106, $jnl_ptn_flg);
	}

	/**
	 * Auto-journal pattern 自動仕訳パタン.<p>
	 *
	 */
	public void jnl_ptn_flg(boolean value) {
		setConstBoolean(offset + 106, $jnl_ptn_flg, value);
	}


	/**
	 * Allocation coefficient structure 配賦係数構成.<p>
	 *
	 */
	public boolean coef_config_flg() {
		return getConstBoolean(offset + 107, $coef_config_flg);
	}

	/**
	 * Allocation coefficient structure 配賦係数構成.<p>
	 *
	 */
	public void coef_config_flg(boolean value) {
		setConstBoolean(offset + 107, $coef_config_flg, value);
	}


	/**
	 * Cost element allocation 費目配賦.<p>
	 *
	 */
	public boolean alc_expns_flg() {
		return getConstBoolean(offset + 108, $alc_expns_flg);
	}

	/**
	 * Cost element allocation 費目配賦.<p>
	 *
	 */
	public void alc_expns_flg(boolean value) {
		setConstBoolean(offset + 108, $alc_expns_flg, value);
	}


	/**
	 * Input allocation 投入配賦.<p>
	 *
	 */
	public boolean alc_inpt_flg() {
		return getConstBoolean(offset + 109, $alc_inpt_flg);
	}

	/**
	 * Input allocation 投入配賦.<p>
	 *
	 */
	public void alc_inpt_flg(boolean value) {
		setConstBoolean(offset + 109, $alc_inpt_flg, value);
	}


	/**
	 * Not costing item 原価対象外品目.<p>
	 *
	 */
	public boolean cost_itm_out_flg() {
		return getConstBoolean(offset + 110, $cost_itm_out_flg);
	}

	/**
	 * Not costing item 原価対象外品目.<p>
	 *
	 */
	public void cost_itm_out_flg(boolean value) {
		setConstBoolean(offset + 110, $cost_itm_out_flg, value);
	}


	/**
	 * Expenses allocation transfer 経費配賦振替.<p>
	 *
	 */
	public boolean xpns_purc_alc_flg() {
		return getConstBoolean(offset + 111, $xpns_purc_alc_flg);
	}

	/**
	 * Expenses allocation transfer 経費配賦振替.<p>
	 *
	 */
	public void xpns_purc_alc_flg(boolean value) {
		setConstBoolean(offset + 111, $xpns_purc_alc_flg, value);
	}


	/**
	 * Item (Distribution group) 品目（物流グループ）.<p>
	 *
	 */
	public boolean itm_lg_grp_flg() {
		return getConstBoolean(offset + 112, $itm_lg_grp_flg);
	}

	/**
	 * Item (Distribution group) 品目（物流グループ）.<p>
	 *
	 */
	public void itm_lg_grp_flg(boolean value) {
		setConstBoolean(offset + 112, $itm_lg_grp_flg, value);
	}


	/**
	 * Item rack/line 品目棚・ライン.<p>
	 *
	 */
	public boolean itm_str_ln_flg() {
		return getConstBoolean(offset + 113, $itm_str_ln_flg);
	}

	/**
	 * Item rack/line 品目棚・ライン.<p>
	 *
	 */
	public void itm_str_ln_flg(boolean value) {
		setConstBoolean(offset + 113, $itm_str_ln_flg, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 114, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 114, $upd_ts, value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			return base_itm_nm();
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
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($itm_cnt.equalsIgnoreCase(name)) {
			return itm_cnt();
		}
		if ($itm_sub_cnt.equalsIgnoreCase(name)) {
			return itm_sub_cnt();
		}
		if ($itm_unit_cnt.equalsIgnoreCase(name)) {
			return itm_unit_cnt();
		}
		if ($attach_info_cnt.equalsIgnoreCase(name)) {
			return attach_info_cnt();
		}
		if ($itm_stop_cnt.equalsIgnoreCase(name)) {
			return itm_stop_cnt();
		}
		if ($itm_not_fix_cnt.equalsIgnoreCase(name)) {
			return itm_not_fix_cnt();
		}
		if ($stdcost_cnt.equalsIgnoreCase(name)) {
			return stdcost_cnt();
		}
		if ($sundry_itm_cnt.equalsIgnoreCase(name)) {
			return sundry_itm_cnt();
		}
		if ($itm_strg_cnt.equalsIgnoreCase(name)) {
			return itm_strg_cnt();
		}
		if ($alloc_ctl_cnt.equalsIgnoreCase(name)) {
			return alloc_ctl_cnt();
		}
		if ($stk_rpl_cnt.equalsIgnoreCase(name)) {
			return stk_rpl_cnt();
		}
		if ($alt_itm_cnt.equalsIgnoreCase(name)) {
			return alt_itm_cnt();
		}
		if ($itm_wg_cnt.equalsIgnoreCase(name)) {
			return itm_wg_cnt();
		}
		if ($itm_dtl_cnt.equalsIgnoreCase(name)) {
			return itm_dtl_cnt();
		}
		if ($itm_oper_cnt.equalsIgnoreCase(name)) {
			return itm_oper_cnt();
		}
		if ($bom_par_cnt.equalsIgnoreCase(name)) {
			return bom_par_cnt();
		}
		if ($bom_chd_cnt.equalsIgnoreCase(name)) {
			return bom_chd_cnt();
		}
		if ($oper_wk_cost_cnt.equalsIgnoreCase(name)) {
			return oper_wk_cost_cnt();
		}
		if ($itm_insp_ptn_cnt.equalsIgnoreCase(name)) {
			return itm_insp_ptn_cnt();
		}
		if ($itm_insp_cnt.equalsIgnoreCase(name)) {
			return itm_insp_cnt();
		}
		if ($insp_spec_cnt.equalsIgnoreCase(name)) {
			return insp_spec_cnt();
		}
		if ($itm_site_cnt.equalsIgnoreCase(name)) {
			return itm_site_cnt();
		}
		if ($itm_ver_cnt.equalsIgnoreCase(name)) {
			return itm_ver_cnt();
		}
		if ($lot_inh_dest_cnt.equalsIgnoreCase(name)) {
			return lot_inh_dest_cnt();
		}
		if ($lot_inh_src_cnt.equalsIgnoreCase(name)) {
			return lot_inh_src_cnt();
		}
		if ($itm_spec_cnt.equalsIgnoreCase(name)) {
			return itm_spec_cnt();
		}
		if ($itm_spec_desc_cnt.equalsIgnoreCase(name)) {
			return itm_spec_desc_cnt();
		}
		if ($itm_comp_core_cnt.equalsIgnoreCase(name)) {
			return itm_comp_core_cnt();
		}
		if ($itm_comp_comp_cnt.equalsIgnoreCase(name)) {
			return itm_comp_comp_cnt();
		}
		if ($mps_itm_cnt.equalsIgnoreCase(name)) {
			return mps_itm_cnt();
		}
		if ($spln_itm_conf_cnt.equalsIgnoreCase(name)) {
			return spln_itm_conf_cnt();
		}
		if ($purc_ddlv_lt_cnt.equalsIgnoreCase(name)) {
			return purc_ddlv_lt_cnt();
		}
		if ($bp_itm_cnt.equalsIgnoreCase(name)) {
			return bp_itm_cnt();
		}
		if ($proc_upri_cnt.equalsIgnoreCase(name)) {
			return proc_upri_cnt();
		}
		if ($prov_upri_cnt.equalsIgnoreCase(name)) {
			return prov_upri_cnt();
		}
		if ($purc_upri_cnt.equalsIgnoreCase(name)) {
			return purc_upri_cnt();
		}
		if ($std_sls_upri_cnt.equalsIgnoreCase(name)) {
			return std_sls_upri_cnt();
		}
		if ($itm_sls_upri_cnt.equalsIgnoreCase(name)) {
			return itm_sls_upri_cnt();
		}
		if ($cst_sls_upri_cnt.equalsIgnoreCase(name)) {
			return cst_sls_upri_cnt();
		}
		if ($set_itm_main_cnt.equalsIgnoreCase(name)) {
			return set_itm_main_cnt();
		}
		if ($set_itm_set_cnt.equalsIgnoreCase(name)) {
			return set_itm_set_cnt();
		}
		if ($if_x_cnt.equalsIgnoreCase(name)) {
			return if_x_cnt();
		}
		if ($ctg_config_cnt.equalsIgnoreCase(name)) {
			return ctg_config_cnt();
		}
		if ($jnl_ptn_cnt.equalsIgnoreCase(name)) {
			return jnl_ptn_cnt();
		}
		if ($coef_config_cnt.equalsIgnoreCase(name)) {
			return coef_config_cnt();
		}
		if ($alc_expns_cnt.equalsIgnoreCase(name)) {
			return alc_expns_cnt();
		}
		if ($alc_inpt_cnt.equalsIgnoreCase(name)) {
			return alc_inpt_cnt();
		}
		if ($cost_itm_out_cnt.equalsIgnoreCase(name)) {
			return cost_itm_out_cnt();
		}
		if ($xpns_purc_alc_cnt.equalsIgnoreCase(name)) {
			return xpns_purc_alc_cnt();
		}
		if ($itm_lg_grp_cnt.equalsIgnoreCase(name)) {
			return itm_lg_grp_cnt();
		}
		if ($itm_str_ln_cnt.equalsIgnoreCase(name)) {
			return itm_str_ln_cnt();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			return base_itm_nm();
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
		if ($chng_no.equalsIgnoreCase(name)) {
			return chng_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($itm_cnt.equalsIgnoreCase(name)) {
			return itm_cnt();
		}
		if ($itm_sub_cnt.equalsIgnoreCase(name)) {
			return itm_sub_cnt();
		}
		if ($itm_unit_cnt.equalsIgnoreCase(name)) {
			return itm_unit_cnt();
		}
		if ($attach_info_cnt.equalsIgnoreCase(name)) {
			return attach_info_cnt();
		}
		if ($itm_stop_cnt.equalsIgnoreCase(name)) {
			return itm_stop_cnt();
		}
		if ($itm_not_fix_cnt.equalsIgnoreCase(name)) {
			return itm_not_fix_cnt();
		}
		if ($stdcost_cnt.equalsIgnoreCase(name)) {
			return stdcost_cnt();
		}
		if ($sundry_itm_cnt.equalsIgnoreCase(name)) {
			return sundry_itm_cnt();
		}
		if ($itm_strg_cnt.equalsIgnoreCase(name)) {
			return itm_strg_cnt();
		}
		if ($alloc_ctl_cnt.equalsIgnoreCase(name)) {
			return alloc_ctl_cnt();
		}
		if ($stk_rpl_cnt.equalsIgnoreCase(name)) {
			return stk_rpl_cnt();
		}
		if ($alt_itm_cnt.equalsIgnoreCase(name)) {
			return alt_itm_cnt();
		}
		if ($itm_wg_cnt.equalsIgnoreCase(name)) {
			return itm_wg_cnt();
		}
		if ($itm_dtl_cnt.equalsIgnoreCase(name)) {
			return itm_dtl_cnt();
		}
		if ($itm_oper_cnt.equalsIgnoreCase(name)) {
			return itm_oper_cnt();
		}
		if ($bom_par_cnt.equalsIgnoreCase(name)) {
			return bom_par_cnt();
		}
		if ($bom_chd_cnt.equalsIgnoreCase(name)) {
			return bom_chd_cnt();
		}
		if ($oper_wk_cost_cnt.equalsIgnoreCase(name)) {
			return oper_wk_cost_cnt();
		}
		if ($itm_insp_ptn_cnt.equalsIgnoreCase(name)) {
			return itm_insp_ptn_cnt();
		}
		if ($itm_insp_cnt.equalsIgnoreCase(name)) {
			return itm_insp_cnt();
		}
		if ($insp_spec_cnt.equalsIgnoreCase(name)) {
			return insp_spec_cnt();
		}
		if ($itm_site_cnt.equalsIgnoreCase(name)) {
			return itm_site_cnt();
		}
		if ($itm_ver_cnt.equalsIgnoreCase(name)) {
			return itm_ver_cnt();
		}
		if ($lot_inh_dest_cnt.equalsIgnoreCase(name)) {
			return lot_inh_dest_cnt();
		}
		if ($lot_inh_src_cnt.equalsIgnoreCase(name)) {
			return lot_inh_src_cnt();
		}
		if ($itm_spec_cnt.equalsIgnoreCase(name)) {
			return itm_spec_cnt();
		}
		if ($itm_spec_desc_cnt.equalsIgnoreCase(name)) {
			return itm_spec_desc_cnt();
		}
		if ($itm_comp_core_cnt.equalsIgnoreCase(name)) {
			return itm_comp_core_cnt();
		}
		if ($itm_comp_comp_cnt.equalsIgnoreCase(name)) {
			return itm_comp_comp_cnt();
		}
		if ($mps_itm_cnt.equalsIgnoreCase(name)) {
			return mps_itm_cnt();
		}
		if ($spln_itm_conf_cnt.equalsIgnoreCase(name)) {
			return spln_itm_conf_cnt();
		}
		if ($purc_ddlv_lt_cnt.equalsIgnoreCase(name)) {
			return purc_ddlv_lt_cnt();
		}
		if ($bp_itm_cnt.equalsIgnoreCase(name)) {
			return bp_itm_cnt();
		}
		if ($proc_upri_cnt.equalsIgnoreCase(name)) {
			return proc_upri_cnt();
		}
		if ($prov_upri_cnt.equalsIgnoreCase(name)) {
			return prov_upri_cnt();
		}
		if ($purc_upri_cnt.equalsIgnoreCase(name)) {
			return purc_upri_cnt();
		}
		if ($std_sls_upri_cnt.equalsIgnoreCase(name)) {
			return std_sls_upri_cnt();
		}
		if ($itm_sls_upri_cnt.equalsIgnoreCase(name)) {
			return itm_sls_upri_cnt();
		}
		if ($cst_sls_upri_cnt.equalsIgnoreCase(name)) {
			return cst_sls_upri_cnt();
		}
		if ($set_itm_main_cnt.equalsIgnoreCase(name)) {
			return set_itm_main_cnt();
		}
		if ($set_itm_set_cnt.equalsIgnoreCase(name)) {
			return set_itm_set_cnt();
		}
		if ($if_x_cnt.equalsIgnoreCase(name)) {
			return if_x_cnt();
		}
		if ($ctg_config_cnt.equalsIgnoreCase(name)) {
			return ctg_config_cnt();
		}
		if ($jnl_ptn_cnt.equalsIgnoreCase(name)) {
			return jnl_ptn_cnt();
		}
		if ($coef_config_cnt.equalsIgnoreCase(name)) {
			return coef_config_cnt();
		}
		if ($alc_expns_cnt.equalsIgnoreCase(name)) {
			return alc_expns_cnt();
		}
		if ($alc_inpt_cnt.equalsIgnoreCase(name)) {
			return alc_inpt_cnt();
		}
		if ($cost_itm_out_cnt.equalsIgnoreCase(name)) {
			return cost_itm_out_cnt();
		}
		if ($xpns_purc_alc_cnt.equalsIgnoreCase(name)) {
			return xpns_purc_alc_cnt();
		}
		if ($itm_lg_grp_cnt.equalsIgnoreCase(name)) {
			return itm_lg_grp_cnt();
		}
		if ($itm_str_ln_cnt.equalsIgnoreCase(name)) {
			return itm_str_ln_cnt();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			base_itm_nm(value);
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
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($itm_cnt.equalsIgnoreCase(name)) {
			itm_cnt(value);
			return;
		}
		if ($itm_sub_cnt.equalsIgnoreCase(name)) {
			itm_sub_cnt(value);
			return;
		}
		if ($itm_unit_cnt.equalsIgnoreCase(name)) {
			itm_unit_cnt(value);
			return;
		}
		if ($attach_info_cnt.equalsIgnoreCase(name)) {
			attach_info_cnt(value);
			return;
		}
		if ($itm_stop_cnt.equalsIgnoreCase(name)) {
			itm_stop_cnt(value);
			return;
		}
		if ($itm_not_fix_cnt.equalsIgnoreCase(name)) {
			itm_not_fix_cnt(value);
			return;
		}
		if ($stdcost_cnt.equalsIgnoreCase(name)) {
			stdcost_cnt(value);
			return;
		}
		if ($sundry_itm_cnt.equalsIgnoreCase(name)) {
			sundry_itm_cnt(value);
			return;
		}
		if ($itm_strg_cnt.equalsIgnoreCase(name)) {
			itm_strg_cnt(value);
			return;
		}
		if ($alloc_ctl_cnt.equalsIgnoreCase(name)) {
			alloc_ctl_cnt(value);
			return;
		}
		if ($stk_rpl_cnt.equalsIgnoreCase(name)) {
			stk_rpl_cnt(value);
			return;
		}
		if ($alt_itm_cnt.equalsIgnoreCase(name)) {
			alt_itm_cnt(value);
			return;
		}
		if ($itm_wg_cnt.equalsIgnoreCase(name)) {
			itm_wg_cnt(value);
			return;
		}
		if ($itm_dtl_cnt.equalsIgnoreCase(name)) {
			itm_dtl_cnt(value);
			return;
		}
		if ($itm_oper_cnt.equalsIgnoreCase(name)) {
			itm_oper_cnt(value);
			return;
		}
		if ($bom_par_cnt.equalsIgnoreCase(name)) {
			bom_par_cnt(value);
			return;
		}
		if ($bom_chd_cnt.equalsIgnoreCase(name)) {
			bom_chd_cnt(value);
			return;
		}
		if ($oper_wk_cost_cnt.equalsIgnoreCase(name)) {
			oper_wk_cost_cnt(value);
			return;
		}
		if ($itm_insp_ptn_cnt.equalsIgnoreCase(name)) {
			itm_insp_ptn_cnt(value);
			return;
		}
		if ($itm_insp_cnt.equalsIgnoreCase(name)) {
			itm_insp_cnt(value);
			return;
		}
		if ($insp_spec_cnt.equalsIgnoreCase(name)) {
			insp_spec_cnt(value);
			return;
		}
		if ($itm_site_cnt.equalsIgnoreCase(name)) {
			itm_site_cnt(value);
			return;
		}
		if ($itm_ver_cnt.equalsIgnoreCase(name)) {
			itm_ver_cnt(value);
			return;
		}
		if ($lot_inh_dest_cnt.equalsIgnoreCase(name)) {
			lot_inh_dest_cnt(value);
			return;
		}
		if ($lot_inh_src_cnt.equalsIgnoreCase(name)) {
			lot_inh_src_cnt(value);
			return;
		}
		if ($itm_spec_cnt.equalsIgnoreCase(name)) {
			itm_spec_cnt(value);
			return;
		}
		if ($itm_spec_desc_cnt.equalsIgnoreCase(name)) {
			itm_spec_desc_cnt(value);
			return;
		}
		if ($itm_comp_core_cnt.equalsIgnoreCase(name)) {
			itm_comp_core_cnt(value);
			return;
		}
		if ($itm_comp_comp_cnt.equalsIgnoreCase(name)) {
			itm_comp_comp_cnt(value);
			return;
		}
		if ($mps_itm_cnt.equalsIgnoreCase(name)) {
			mps_itm_cnt(value);
			return;
		}
		if ($spln_itm_conf_cnt.equalsIgnoreCase(name)) {
			spln_itm_conf_cnt(value);
			return;
		}
		if ($purc_ddlv_lt_cnt.equalsIgnoreCase(name)) {
			purc_ddlv_lt_cnt(value);
			return;
		}
		if ($bp_itm_cnt.equalsIgnoreCase(name)) {
			bp_itm_cnt(value);
			return;
		}
		if ($proc_upri_cnt.equalsIgnoreCase(name)) {
			proc_upri_cnt(value);
			return;
		}
		if ($prov_upri_cnt.equalsIgnoreCase(name)) {
			prov_upri_cnt(value);
			return;
		}
		if ($purc_upri_cnt.equalsIgnoreCase(name)) {
			purc_upri_cnt(value);
			return;
		}
		if ($std_sls_upri_cnt.equalsIgnoreCase(name)) {
			std_sls_upri_cnt(value);
			return;
		}
		if ($itm_sls_upri_cnt.equalsIgnoreCase(name)) {
			itm_sls_upri_cnt(value);
			return;
		}
		if ($cst_sls_upri_cnt.equalsIgnoreCase(name)) {
			cst_sls_upri_cnt(value);
			return;
		}
		if ($set_itm_main_cnt.equalsIgnoreCase(name)) {
			set_itm_main_cnt(value);
			return;
		}
		if ($set_itm_set_cnt.equalsIgnoreCase(name)) {
			set_itm_set_cnt(value);
			return;
		}
		if ($if_x_cnt.equalsIgnoreCase(name)) {
			if_x_cnt(value);
			return;
		}
		if ($ctg_config_cnt.equalsIgnoreCase(name)) {
			ctg_config_cnt(value);
			return;
		}
		if ($jnl_ptn_cnt.equalsIgnoreCase(name)) {
			jnl_ptn_cnt(value);
			return;
		}
		if ($coef_config_cnt.equalsIgnoreCase(name)) {
			coef_config_cnt(value);
			return;
		}
		if ($alc_expns_cnt.equalsIgnoreCase(name)) {
			alc_expns_cnt(value);
			return;
		}
		if ($alc_inpt_cnt.equalsIgnoreCase(name)) {
			alc_inpt_cnt(value);
			return;
		}
		if ($cost_itm_out_cnt.equalsIgnoreCase(name)) {
			cost_itm_out_cnt(value);
			return;
		}
		if ($xpns_purc_alc_cnt.equalsIgnoreCase(name)) {
			xpns_purc_alc_cnt(value);
			return;
		}
		if ($itm_lg_grp_cnt.equalsIgnoreCase(name)) {
			itm_lg_grp_cnt(value);
			return;
		}
		if ($itm_str_ln_cnt.equalsIgnoreCase(name)) {
			itm_str_ln_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($itm_cnt.equalsIgnoreCase(name)) {
			itm_cnt(value);
			return;
		}
		if ($itm_sub_cnt.equalsIgnoreCase(name)) {
			itm_sub_cnt(value);
			return;
		}
		if ($itm_unit_cnt.equalsIgnoreCase(name)) {
			itm_unit_cnt(value);
			return;
		}
		if ($attach_info_cnt.equalsIgnoreCase(name)) {
			attach_info_cnt(value);
			return;
		}
		if ($itm_stop_cnt.equalsIgnoreCase(name)) {
			itm_stop_cnt(value);
			return;
		}
		if ($itm_not_fix_cnt.equalsIgnoreCase(name)) {
			itm_not_fix_cnt(value);
			return;
		}
		if ($stdcost_cnt.equalsIgnoreCase(name)) {
			stdcost_cnt(value);
			return;
		}
		if ($sundry_itm_cnt.equalsIgnoreCase(name)) {
			sundry_itm_cnt(value);
			return;
		}
		if ($itm_strg_cnt.equalsIgnoreCase(name)) {
			itm_strg_cnt(value);
			return;
		}
		if ($alloc_ctl_cnt.equalsIgnoreCase(name)) {
			alloc_ctl_cnt(value);
			return;
		}
		if ($stk_rpl_cnt.equalsIgnoreCase(name)) {
			stk_rpl_cnt(value);
			return;
		}
		if ($alt_itm_cnt.equalsIgnoreCase(name)) {
			alt_itm_cnt(value);
			return;
		}
		if ($itm_wg_cnt.equalsIgnoreCase(name)) {
			itm_wg_cnt(value);
			return;
		}
		if ($itm_dtl_cnt.equalsIgnoreCase(name)) {
			itm_dtl_cnt(value);
			return;
		}
		if ($itm_oper_cnt.equalsIgnoreCase(name)) {
			itm_oper_cnt(value);
			return;
		}
		if ($bom_par_cnt.equalsIgnoreCase(name)) {
			bom_par_cnt(value);
			return;
		}
		if ($bom_chd_cnt.equalsIgnoreCase(name)) {
			bom_chd_cnt(value);
			return;
		}
		if ($oper_wk_cost_cnt.equalsIgnoreCase(name)) {
			oper_wk_cost_cnt(value);
			return;
		}
		if ($itm_insp_ptn_cnt.equalsIgnoreCase(name)) {
			itm_insp_ptn_cnt(value);
			return;
		}
		if ($itm_insp_cnt.equalsIgnoreCase(name)) {
			itm_insp_cnt(value);
			return;
		}
		if ($insp_spec_cnt.equalsIgnoreCase(name)) {
			insp_spec_cnt(value);
			return;
		}
		if ($itm_site_cnt.equalsIgnoreCase(name)) {
			itm_site_cnt(value);
			return;
		}
		if ($itm_ver_cnt.equalsIgnoreCase(name)) {
			itm_ver_cnt(value);
			return;
		}
		if ($lot_inh_dest_cnt.equalsIgnoreCase(name)) {
			lot_inh_dest_cnt(value);
			return;
		}
		if ($lot_inh_src_cnt.equalsIgnoreCase(name)) {
			lot_inh_src_cnt(value);
			return;
		}
		if ($itm_spec_cnt.equalsIgnoreCase(name)) {
			itm_spec_cnt(value);
			return;
		}
		if ($itm_spec_desc_cnt.equalsIgnoreCase(name)) {
			itm_spec_desc_cnt(value);
			return;
		}
		if ($itm_comp_core_cnt.equalsIgnoreCase(name)) {
			itm_comp_core_cnt(value);
			return;
		}
		if ($itm_comp_comp_cnt.equalsIgnoreCase(name)) {
			itm_comp_comp_cnt(value);
			return;
		}
		if ($mps_itm_cnt.equalsIgnoreCase(name)) {
			mps_itm_cnt(value);
			return;
		}
		if ($spln_itm_conf_cnt.equalsIgnoreCase(name)) {
			spln_itm_conf_cnt(value);
			return;
		}
		if ($purc_ddlv_lt_cnt.equalsIgnoreCase(name)) {
			purc_ddlv_lt_cnt(value);
			return;
		}
		if ($bp_itm_cnt.equalsIgnoreCase(name)) {
			bp_itm_cnt(value);
			return;
		}
		if ($proc_upri_cnt.equalsIgnoreCase(name)) {
			proc_upri_cnt(value);
			return;
		}
		if ($prov_upri_cnt.equalsIgnoreCase(name)) {
			prov_upri_cnt(value);
			return;
		}
		if ($purc_upri_cnt.equalsIgnoreCase(name)) {
			purc_upri_cnt(value);
			return;
		}
		if ($std_sls_upri_cnt.equalsIgnoreCase(name)) {
			std_sls_upri_cnt(value);
			return;
		}
		if ($itm_sls_upri_cnt.equalsIgnoreCase(name)) {
			itm_sls_upri_cnt(value);
			return;
		}
		if ($cst_sls_upri_cnt.equalsIgnoreCase(name)) {
			cst_sls_upri_cnt(value);
			return;
		}
		if ($set_itm_main_cnt.equalsIgnoreCase(name)) {
			set_itm_main_cnt(value);
			return;
		}
		if ($set_itm_set_cnt.equalsIgnoreCase(name)) {
			set_itm_set_cnt(value);
			return;
		}
		if ($if_x_cnt.equalsIgnoreCase(name)) {
			if_x_cnt(value);
			return;
		}
		if ($ctg_config_cnt.equalsIgnoreCase(name)) {
			ctg_config_cnt(value);
			return;
		}
		if ($jnl_ptn_cnt.equalsIgnoreCase(name)) {
			jnl_ptn_cnt(value);
			return;
		}
		if ($coef_config_cnt.equalsIgnoreCase(name)) {
			coef_config_cnt(value);
			return;
		}
		if ($alc_expns_cnt.equalsIgnoreCase(name)) {
			alc_expns_cnt(value);
			return;
		}
		if ($alc_inpt_cnt.equalsIgnoreCase(name)) {
			alc_inpt_cnt(value);
			return;
		}
		if ($cost_itm_out_cnt.equalsIgnoreCase(name)) {
			cost_itm_out_cnt(value);
			return;
		}
		if ($xpns_purc_alc_cnt.equalsIgnoreCase(name)) {
			xpns_purc_alc_cnt(value);
			return;
		}
		if ($itm_lg_grp_cnt.equalsIgnoreCase(name)) {
			itm_lg_grp_cnt(value);
			return;
		}
		if ($itm_str_ln_cnt.equalsIgnoreCase(name)) {
			itm_str_ln_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($itm_cnt.equalsIgnoreCase(name)) {
			itm_cnt(value);
			return;
		}
		if ($itm_sub_cnt.equalsIgnoreCase(name)) {
			itm_sub_cnt(value);
			return;
		}
		if ($itm_unit_cnt.equalsIgnoreCase(name)) {
			itm_unit_cnt(value);
			return;
		}
		if ($attach_info_cnt.equalsIgnoreCase(name)) {
			attach_info_cnt(value);
			return;
		}
		if ($itm_stop_cnt.equalsIgnoreCase(name)) {
			itm_stop_cnt(value);
			return;
		}
		if ($itm_not_fix_cnt.equalsIgnoreCase(name)) {
			itm_not_fix_cnt(value);
			return;
		}
		if ($stdcost_cnt.equalsIgnoreCase(name)) {
			stdcost_cnt(value);
			return;
		}
		if ($sundry_itm_cnt.equalsIgnoreCase(name)) {
			sundry_itm_cnt(value);
			return;
		}
		if ($itm_strg_cnt.equalsIgnoreCase(name)) {
			itm_strg_cnt(value);
			return;
		}
		if ($alloc_ctl_cnt.equalsIgnoreCase(name)) {
			alloc_ctl_cnt(value);
			return;
		}
		if ($stk_rpl_cnt.equalsIgnoreCase(name)) {
			stk_rpl_cnt(value);
			return;
		}
		if ($alt_itm_cnt.equalsIgnoreCase(name)) {
			alt_itm_cnt(value);
			return;
		}
		if ($itm_wg_cnt.equalsIgnoreCase(name)) {
			itm_wg_cnt(value);
			return;
		}
		if ($itm_dtl_cnt.equalsIgnoreCase(name)) {
			itm_dtl_cnt(value);
			return;
		}
		if ($itm_oper_cnt.equalsIgnoreCase(name)) {
			itm_oper_cnt(value);
			return;
		}
		if ($bom_par_cnt.equalsIgnoreCase(name)) {
			bom_par_cnt(value);
			return;
		}
		if ($bom_chd_cnt.equalsIgnoreCase(name)) {
			bom_chd_cnt(value);
			return;
		}
		if ($oper_wk_cost_cnt.equalsIgnoreCase(name)) {
			oper_wk_cost_cnt(value);
			return;
		}
		if ($itm_insp_ptn_cnt.equalsIgnoreCase(name)) {
			itm_insp_ptn_cnt(value);
			return;
		}
		if ($itm_insp_cnt.equalsIgnoreCase(name)) {
			itm_insp_cnt(value);
			return;
		}
		if ($insp_spec_cnt.equalsIgnoreCase(name)) {
			insp_spec_cnt(value);
			return;
		}
		if ($itm_site_cnt.equalsIgnoreCase(name)) {
			itm_site_cnt(value);
			return;
		}
		if ($itm_ver_cnt.equalsIgnoreCase(name)) {
			itm_ver_cnt(value);
			return;
		}
		if ($lot_inh_dest_cnt.equalsIgnoreCase(name)) {
			lot_inh_dest_cnt(value);
			return;
		}
		if ($lot_inh_src_cnt.equalsIgnoreCase(name)) {
			lot_inh_src_cnt(value);
			return;
		}
		if ($itm_spec_cnt.equalsIgnoreCase(name)) {
			itm_spec_cnt(value);
			return;
		}
		if ($itm_spec_desc_cnt.equalsIgnoreCase(name)) {
			itm_spec_desc_cnt(value);
			return;
		}
		if ($itm_comp_core_cnt.equalsIgnoreCase(name)) {
			itm_comp_core_cnt(value);
			return;
		}
		if ($itm_comp_comp_cnt.equalsIgnoreCase(name)) {
			itm_comp_comp_cnt(value);
			return;
		}
		if ($mps_itm_cnt.equalsIgnoreCase(name)) {
			mps_itm_cnt(value);
			return;
		}
		if ($spln_itm_conf_cnt.equalsIgnoreCase(name)) {
			spln_itm_conf_cnt(value);
			return;
		}
		if ($purc_ddlv_lt_cnt.equalsIgnoreCase(name)) {
			purc_ddlv_lt_cnt(value);
			return;
		}
		if ($bp_itm_cnt.equalsIgnoreCase(name)) {
			bp_itm_cnt(value);
			return;
		}
		if ($proc_upri_cnt.equalsIgnoreCase(name)) {
			proc_upri_cnt(value);
			return;
		}
		if ($prov_upri_cnt.equalsIgnoreCase(name)) {
			prov_upri_cnt(value);
			return;
		}
		if ($purc_upri_cnt.equalsIgnoreCase(name)) {
			purc_upri_cnt(value);
			return;
		}
		if ($std_sls_upri_cnt.equalsIgnoreCase(name)) {
			std_sls_upri_cnt(value);
			return;
		}
		if ($itm_sls_upri_cnt.equalsIgnoreCase(name)) {
			itm_sls_upri_cnt(value);
			return;
		}
		if ($cst_sls_upri_cnt.equalsIgnoreCase(name)) {
			cst_sls_upri_cnt(value);
			return;
		}
		if ($set_itm_main_cnt.equalsIgnoreCase(name)) {
			set_itm_main_cnt(value);
			return;
		}
		if ($set_itm_set_cnt.equalsIgnoreCase(name)) {
			set_itm_set_cnt(value);
			return;
		}
		if ($if_x_cnt.equalsIgnoreCase(name)) {
			if_x_cnt(value);
			return;
		}
		if ($ctg_config_cnt.equalsIgnoreCase(name)) {
			ctg_config_cnt(value);
			return;
		}
		if ($jnl_ptn_cnt.equalsIgnoreCase(name)) {
			jnl_ptn_cnt(value);
			return;
		}
		if ($coef_config_cnt.equalsIgnoreCase(name)) {
			coef_config_cnt(value);
			return;
		}
		if ($alc_expns_cnt.equalsIgnoreCase(name)) {
			alc_expns_cnt(value);
			return;
		}
		if ($alc_inpt_cnt.equalsIgnoreCase(name)) {
			alc_inpt_cnt(value);
			return;
		}
		if ($cost_itm_out_cnt.equalsIgnoreCase(name)) {
			cost_itm_out_cnt(value);
			return;
		}
		if ($xpns_purc_alc_cnt.equalsIgnoreCase(name)) {
			xpns_purc_alc_cnt(value);
			return;
		}
		if ($itm_lg_grp_cnt.equalsIgnoreCase(name)) {
			itm_lg_grp_cnt(value);
			return;
		}
		if ($itm_str_ln_cnt.equalsIgnoreCase(name)) {
			itm_str_ln_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($itm_cnt.equalsIgnoreCase(name)) {
			itm_cnt(value);
			return;
		}
		if ($itm_sub_cnt.equalsIgnoreCase(name)) {
			itm_sub_cnt(value);
			return;
		}
		if ($itm_unit_cnt.equalsIgnoreCase(name)) {
			itm_unit_cnt(value);
			return;
		}
		if ($attach_info_cnt.equalsIgnoreCase(name)) {
			attach_info_cnt(value);
			return;
		}
		if ($itm_stop_cnt.equalsIgnoreCase(name)) {
			itm_stop_cnt(value);
			return;
		}
		if ($itm_not_fix_cnt.equalsIgnoreCase(name)) {
			itm_not_fix_cnt(value);
			return;
		}
		if ($stdcost_cnt.equalsIgnoreCase(name)) {
			stdcost_cnt(value);
			return;
		}
		if ($sundry_itm_cnt.equalsIgnoreCase(name)) {
			sundry_itm_cnt(value);
			return;
		}
		if ($itm_strg_cnt.equalsIgnoreCase(name)) {
			itm_strg_cnt(value);
			return;
		}
		if ($alloc_ctl_cnt.equalsIgnoreCase(name)) {
			alloc_ctl_cnt(value);
			return;
		}
		if ($stk_rpl_cnt.equalsIgnoreCase(name)) {
			stk_rpl_cnt(value);
			return;
		}
		if ($alt_itm_cnt.equalsIgnoreCase(name)) {
			alt_itm_cnt(value);
			return;
		}
		if ($itm_wg_cnt.equalsIgnoreCase(name)) {
			itm_wg_cnt(value);
			return;
		}
		if ($itm_dtl_cnt.equalsIgnoreCase(name)) {
			itm_dtl_cnt(value);
			return;
		}
		if ($itm_oper_cnt.equalsIgnoreCase(name)) {
			itm_oper_cnt(value);
			return;
		}
		if ($bom_par_cnt.equalsIgnoreCase(name)) {
			bom_par_cnt(value);
			return;
		}
		if ($bom_chd_cnt.equalsIgnoreCase(name)) {
			bom_chd_cnt(value);
			return;
		}
		if ($oper_wk_cost_cnt.equalsIgnoreCase(name)) {
			oper_wk_cost_cnt(value);
			return;
		}
		if ($itm_insp_ptn_cnt.equalsIgnoreCase(name)) {
			itm_insp_ptn_cnt(value);
			return;
		}
		if ($itm_insp_cnt.equalsIgnoreCase(name)) {
			itm_insp_cnt(value);
			return;
		}
		if ($insp_spec_cnt.equalsIgnoreCase(name)) {
			insp_spec_cnt(value);
			return;
		}
		if ($itm_site_cnt.equalsIgnoreCase(name)) {
			itm_site_cnt(value);
			return;
		}
		if ($itm_ver_cnt.equalsIgnoreCase(name)) {
			itm_ver_cnt(value);
			return;
		}
		if ($lot_inh_dest_cnt.equalsIgnoreCase(name)) {
			lot_inh_dest_cnt(value);
			return;
		}
		if ($lot_inh_src_cnt.equalsIgnoreCase(name)) {
			lot_inh_src_cnt(value);
			return;
		}
		if ($itm_spec_cnt.equalsIgnoreCase(name)) {
			itm_spec_cnt(value);
			return;
		}
		if ($itm_spec_desc_cnt.equalsIgnoreCase(name)) {
			itm_spec_desc_cnt(value);
			return;
		}
		if ($itm_comp_core_cnt.equalsIgnoreCase(name)) {
			itm_comp_core_cnt(value);
			return;
		}
		if ($itm_comp_comp_cnt.equalsIgnoreCase(name)) {
			itm_comp_comp_cnt(value);
			return;
		}
		if ($mps_itm_cnt.equalsIgnoreCase(name)) {
			mps_itm_cnt(value);
			return;
		}
		if ($spln_itm_conf_cnt.equalsIgnoreCase(name)) {
			spln_itm_conf_cnt(value);
			return;
		}
		if ($purc_ddlv_lt_cnt.equalsIgnoreCase(name)) {
			purc_ddlv_lt_cnt(value);
			return;
		}
		if ($bp_itm_cnt.equalsIgnoreCase(name)) {
			bp_itm_cnt(value);
			return;
		}
		if ($proc_upri_cnt.equalsIgnoreCase(name)) {
			proc_upri_cnt(value);
			return;
		}
		if ($prov_upri_cnt.equalsIgnoreCase(name)) {
			prov_upri_cnt(value);
			return;
		}
		if ($purc_upri_cnt.equalsIgnoreCase(name)) {
			purc_upri_cnt(value);
			return;
		}
		if ($std_sls_upri_cnt.equalsIgnoreCase(name)) {
			std_sls_upri_cnt(value);
			return;
		}
		if ($itm_sls_upri_cnt.equalsIgnoreCase(name)) {
			itm_sls_upri_cnt(value);
			return;
		}
		if ($cst_sls_upri_cnt.equalsIgnoreCase(name)) {
			cst_sls_upri_cnt(value);
			return;
		}
		if ($set_itm_main_cnt.equalsIgnoreCase(name)) {
			set_itm_main_cnt(value);
			return;
		}
		if ($set_itm_set_cnt.equalsIgnoreCase(name)) {
			set_itm_set_cnt(value);
			return;
		}
		if ($if_x_cnt.equalsIgnoreCase(name)) {
			if_x_cnt(value);
			return;
		}
		if ($ctg_config_cnt.equalsIgnoreCase(name)) {
			ctg_config_cnt(value);
			return;
		}
		if ($jnl_ptn_cnt.equalsIgnoreCase(name)) {
			jnl_ptn_cnt(value);
			return;
		}
		if ($coef_config_cnt.equalsIgnoreCase(name)) {
			coef_config_cnt(value);
			return;
		}
		if ($alc_expns_cnt.equalsIgnoreCase(name)) {
			alc_expns_cnt(value);
			return;
		}
		if ($alc_inpt_cnt.equalsIgnoreCase(name)) {
			alc_inpt_cnt(value);
			return;
		}
		if ($cost_itm_out_cnt.equalsIgnoreCase(name)) {
			cost_itm_out_cnt(value);
			return;
		}
		if ($xpns_purc_alc_cnt.equalsIgnoreCase(name)) {
			xpns_purc_alc_cnt(value);
			return;
		}
		if ($itm_lg_grp_cnt.equalsIgnoreCase(name)) {
			itm_lg_grp_cnt(value);
			return;
		}
		if ($itm_str_ln_cnt.equalsIgnoreCase(name)) {
			itm_str_ln_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($itm_cnt.equalsIgnoreCase(name)) {
			itm_cnt(value);
			return;
		}
		if ($itm_sub_cnt.equalsIgnoreCase(name)) {
			itm_sub_cnt(value);
			return;
		}
		if ($itm_unit_cnt.equalsIgnoreCase(name)) {
			itm_unit_cnt(value);
			return;
		}
		if ($attach_info_cnt.equalsIgnoreCase(name)) {
			attach_info_cnt(value);
			return;
		}
		if ($itm_stop_cnt.equalsIgnoreCase(name)) {
			itm_stop_cnt(value);
			return;
		}
		if ($itm_not_fix_cnt.equalsIgnoreCase(name)) {
			itm_not_fix_cnt(value);
			return;
		}
		if ($stdcost_cnt.equalsIgnoreCase(name)) {
			stdcost_cnt(value);
			return;
		}
		if ($sundry_itm_cnt.equalsIgnoreCase(name)) {
			sundry_itm_cnt(value);
			return;
		}
		if ($itm_strg_cnt.equalsIgnoreCase(name)) {
			itm_strg_cnt(value);
			return;
		}
		if ($alloc_ctl_cnt.equalsIgnoreCase(name)) {
			alloc_ctl_cnt(value);
			return;
		}
		if ($stk_rpl_cnt.equalsIgnoreCase(name)) {
			stk_rpl_cnt(value);
			return;
		}
		if ($alt_itm_cnt.equalsIgnoreCase(name)) {
			alt_itm_cnt(value);
			return;
		}
		if ($itm_wg_cnt.equalsIgnoreCase(name)) {
			itm_wg_cnt(value);
			return;
		}
		if ($itm_dtl_cnt.equalsIgnoreCase(name)) {
			itm_dtl_cnt(value);
			return;
		}
		if ($itm_oper_cnt.equalsIgnoreCase(name)) {
			itm_oper_cnt(value);
			return;
		}
		if ($bom_par_cnt.equalsIgnoreCase(name)) {
			bom_par_cnt(value);
			return;
		}
		if ($bom_chd_cnt.equalsIgnoreCase(name)) {
			bom_chd_cnt(value);
			return;
		}
		if ($oper_wk_cost_cnt.equalsIgnoreCase(name)) {
			oper_wk_cost_cnt(value);
			return;
		}
		if ($itm_insp_ptn_cnt.equalsIgnoreCase(name)) {
			itm_insp_ptn_cnt(value);
			return;
		}
		if ($itm_insp_cnt.equalsIgnoreCase(name)) {
			itm_insp_cnt(value);
			return;
		}
		if ($insp_spec_cnt.equalsIgnoreCase(name)) {
			insp_spec_cnt(value);
			return;
		}
		if ($itm_site_cnt.equalsIgnoreCase(name)) {
			itm_site_cnt(value);
			return;
		}
		if ($itm_ver_cnt.equalsIgnoreCase(name)) {
			itm_ver_cnt(value);
			return;
		}
		if ($lot_inh_dest_cnt.equalsIgnoreCase(name)) {
			lot_inh_dest_cnt(value);
			return;
		}
		if ($lot_inh_src_cnt.equalsIgnoreCase(name)) {
			lot_inh_src_cnt(value);
			return;
		}
		if ($itm_spec_cnt.equalsIgnoreCase(name)) {
			itm_spec_cnt(value);
			return;
		}
		if ($itm_spec_desc_cnt.equalsIgnoreCase(name)) {
			itm_spec_desc_cnt(value);
			return;
		}
		if ($itm_comp_core_cnt.equalsIgnoreCase(name)) {
			itm_comp_core_cnt(value);
			return;
		}
		if ($itm_comp_comp_cnt.equalsIgnoreCase(name)) {
			itm_comp_comp_cnt(value);
			return;
		}
		if ($mps_itm_cnt.equalsIgnoreCase(name)) {
			mps_itm_cnt(value);
			return;
		}
		if ($spln_itm_conf_cnt.equalsIgnoreCase(name)) {
			spln_itm_conf_cnt(value);
			return;
		}
		if ($purc_ddlv_lt_cnt.equalsIgnoreCase(name)) {
			purc_ddlv_lt_cnt(value);
			return;
		}
		if ($bp_itm_cnt.equalsIgnoreCase(name)) {
			bp_itm_cnt(value);
			return;
		}
		if ($proc_upri_cnt.equalsIgnoreCase(name)) {
			proc_upri_cnt(value);
			return;
		}
		if ($prov_upri_cnt.equalsIgnoreCase(name)) {
			prov_upri_cnt(value);
			return;
		}
		if ($purc_upri_cnt.equalsIgnoreCase(name)) {
			purc_upri_cnt(value);
			return;
		}
		if ($std_sls_upri_cnt.equalsIgnoreCase(name)) {
			std_sls_upri_cnt(value);
			return;
		}
		if ($itm_sls_upri_cnt.equalsIgnoreCase(name)) {
			itm_sls_upri_cnt(value);
			return;
		}
		if ($cst_sls_upri_cnt.equalsIgnoreCase(name)) {
			cst_sls_upri_cnt(value);
			return;
		}
		if ($set_itm_main_cnt.equalsIgnoreCase(name)) {
			set_itm_main_cnt(value);
			return;
		}
		if ($set_itm_set_cnt.equalsIgnoreCase(name)) {
			set_itm_set_cnt(value);
			return;
		}
		if ($if_x_cnt.equalsIgnoreCase(name)) {
			if_x_cnt(value);
			return;
		}
		if ($ctg_config_cnt.equalsIgnoreCase(name)) {
			ctg_config_cnt(value);
			return;
		}
		if ($jnl_ptn_cnt.equalsIgnoreCase(name)) {
			jnl_ptn_cnt(value);
			return;
		}
		if ($coef_config_cnt.equalsIgnoreCase(name)) {
			coef_config_cnt(value);
			return;
		}
		if ($alc_expns_cnt.equalsIgnoreCase(name)) {
			alc_expns_cnt(value);
			return;
		}
		if ($alc_inpt_cnt.equalsIgnoreCase(name)) {
			alc_inpt_cnt(value);
			return;
		}
		if ($cost_itm_out_cnt.equalsIgnoreCase(name)) {
			cost_itm_out_cnt(value);
			return;
		}
		if ($xpns_purc_alc_cnt.equalsIgnoreCase(name)) {
			xpns_purc_alc_cnt(value);
			return;
		}
		if ($itm_lg_grp_cnt.equalsIgnoreCase(name)) {
			itm_lg_grp_cnt(value);
			return;
		}
		if ($itm_str_ln_cnt.equalsIgnoreCase(name)) {
			itm_str_ln_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($base_itm_nm.equalsIgnoreCase(name)) {
			base_itm_nm(value);
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
		if ($chng_no.equalsIgnoreCase(name)) {
			chng_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($itm_cnt.equalsIgnoreCase(name)) {
			itm_cnt(value);
			return;
		}
		if ($itm_sub_cnt.equalsIgnoreCase(name)) {
			itm_sub_cnt(value);
			return;
		}
		if ($itm_unit_cnt.equalsIgnoreCase(name)) {
			itm_unit_cnt(value);
			return;
		}
		if ($attach_info_cnt.equalsIgnoreCase(name)) {
			attach_info_cnt(value);
			return;
		}
		if ($itm_stop_cnt.equalsIgnoreCase(name)) {
			itm_stop_cnt(value);
			return;
		}
		if ($itm_not_fix_cnt.equalsIgnoreCase(name)) {
			itm_not_fix_cnt(value);
			return;
		}
		if ($stdcost_cnt.equalsIgnoreCase(name)) {
			stdcost_cnt(value);
			return;
		}
		if ($sundry_itm_cnt.equalsIgnoreCase(name)) {
			sundry_itm_cnt(value);
			return;
		}
		if ($itm_strg_cnt.equalsIgnoreCase(name)) {
			itm_strg_cnt(value);
			return;
		}
		if ($alloc_ctl_cnt.equalsIgnoreCase(name)) {
			alloc_ctl_cnt(value);
			return;
		}
		if ($stk_rpl_cnt.equalsIgnoreCase(name)) {
			stk_rpl_cnt(value);
			return;
		}
		if ($alt_itm_cnt.equalsIgnoreCase(name)) {
			alt_itm_cnt(value);
			return;
		}
		if ($itm_wg_cnt.equalsIgnoreCase(name)) {
			itm_wg_cnt(value);
			return;
		}
		if ($itm_dtl_cnt.equalsIgnoreCase(name)) {
			itm_dtl_cnt(value);
			return;
		}
		if ($itm_oper_cnt.equalsIgnoreCase(name)) {
			itm_oper_cnt(value);
			return;
		}
		if ($bom_par_cnt.equalsIgnoreCase(name)) {
			bom_par_cnt(value);
			return;
		}
		if ($bom_chd_cnt.equalsIgnoreCase(name)) {
			bom_chd_cnt(value);
			return;
		}
		if ($oper_wk_cost_cnt.equalsIgnoreCase(name)) {
			oper_wk_cost_cnt(value);
			return;
		}
		if ($itm_insp_ptn_cnt.equalsIgnoreCase(name)) {
			itm_insp_ptn_cnt(value);
			return;
		}
		if ($itm_insp_cnt.equalsIgnoreCase(name)) {
			itm_insp_cnt(value);
			return;
		}
		if ($insp_spec_cnt.equalsIgnoreCase(name)) {
			insp_spec_cnt(value);
			return;
		}
		if ($itm_site_cnt.equalsIgnoreCase(name)) {
			itm_site_cnt(value);
			return;
		}
		if ($itm_ver_cnt.equalsIgnoreCase(name)) {
			itm_ver_cnt(value);
			return;
		}
		if ($lot_inh_dest_cnt.equalsIgnoreCase(name)) {
			lot_inh_dest_cnt(value);
			return;
		}
		if ($lot_inh_src_cnt.equalsIgnoreCase(name)) {
			lot_inh_src_cnt(value);
			return;
		}
		if ($itm_spec_cnt.equalsIgnoreCase(name)) {
			itm_spec_cnt(value);
			return;
		}
		if ($itm_spec_desc_cnt.equalsIgnoreCase(name)) {
			itm_spec_desc_cnt(value);
			return;
		}
		if ($itm_comp_core_cnt.equalsIgnoreCase(name)) {
			itm_comp_core_cnt(value);
			return;
		}
		if ($itm_comp_comp_cnt.equalsIgnoreCase(name)) {
			itm_comp_comp_cnt(value);
			return;
		}
		if ($mps_itm_cnt.equalsIgnoreCase(name)) {
			mps_itm_cnt(value);
			return;
		}
		if ($spln_itm_conf_cnt.equalsIgnoreCase(name)) {
			spln_itm_conf_cnt(value);
			return;
		}
		if ($purc_ddlv_lt_cnt.equalsIgnoreCase(name)) {
			purc_ddlv_lt_cnt(value);
			return;
		}
		if ($bp_itm_cnt.equalsIgnoreCase(name)) {
			bp_itm_cnt(value);
			return;
		}
		if ($proc_upri_cnt.equalsIgnoreCase(name)) {
			proc_upri_cnt(value);
			return;
		}
		if ($prov_upri_cnt.equalsIgnoreCase(name)) {
			prov_upri_cnt(value);
			return;
		}
		if ($purc_upri_cnt.equalsIgnoreCase(name)) {
			purc_upri_cnt(value);
			return;
		}
		if ($std_sls_upri_cnt.equalsIgnoreCase(name)) {
			std_sls_upri_cnt(value);
			return;
		}
		if ($itm_sls_upri_cnt.equalsIgnoreCase(name)) {
			itm_sls_upri_cnt(value);
			return;
		}
		if ($cst_sls_upri_cnt.equalsIgnoreCase(name)) {
			cst_sls_upri_cnt(value);
			return;
		}
		if ($set_itm_main_cnt.equalsIgnoreCase(name)) {
			set_itm_main_cnt(value);
			return;
		}
		if ($set_itm_set_cnt.equalsIgnoreCase(name)) {
			set_itm_set_cnt(value);
			return;
		}
		if ($if_x_cnt.equalsIgnoreCase(name)) {
			if_x_cnt(value);
			return;
		}
		if ($ctg_config_cnt.equalsIgnoreCase(name)) {
			ctg_config_cnt(value);
			return;
		}
		if ($jnl_ptn_cnt.equalsIgnoreCase(name)) {
			jnl_ptn_cnt(value);
			return;
		}
		if ($coef_config_cnt.equalsIgnoreCase(name)) {
			coef_config_cnt(value);
			return;
		}
		if ($alc_expns_cnt.equalsIgnoreCase(name)) {
			alc_expns_cnt(value);
			return;
		}
		if ($alc_inpt_cnt.equalsIgnoreCase(name)) {
			alc_inpt_cnt(value);
			return;
		}
		if ($cost_itm_out_cnt.equalsIgnoreCase(name)) {
			cost_itm_out_cnt(value);
			return;
		}
		if ($xpns_purc_alc_cnt.equalsIgnoreCase(name)) {
			xpns_purc_alc_cnt(value);
			return;
		}
		if ($itm_lg_grp_cnt.equalsIgnoreCase(name)) {
			itm_lg_grp_cnt(value);
			return;
		}
		if ($itm_str_ln_cnt.equalsIgnoreCase(name)) {
			itm_str_ln_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($itm_cnt.equalsIgnoreCase(name)) {
			itm_cnt(value);
			return;
		}
		if ($itm_sub_cnt.equalsIgnoreCase(name)) {
			itm_sub_cnt(value);
			return;
		}
		if ($itm_unit_cnt.equalsIgnoreCase(name)) {
			itm_unit_cnt(value);
			return;
		}
		if ($attach_info_cnt.equalsIgnoreCase(name)) {
			attach_info_cnt(value);
			return;
		}
		if ($itm_stop_cnt.equalsIgnoreCase(name)) {
			itm_stop_cnt(value);
			return;
		}
		if ($itm_not_fix_cnt.equalsIgnoreCase(name)) {
			itm_not_fix_cnt(value);
			return;
		}
		if ($stdcost_cnt.equalsIgnoreCase(name)) {
			stdcost_cnt(value);
			return;
		}
		if ($sundry_itm_cnt.equalsIgnoreCase(name)) {
			sundry_itm_cnt(value);
			return;
		}
		if ($itm_strg_cnt.equalsIgnoreCase(name)) {
			itm_strg_cnt(value);
			return;
		}
		if ($alloc_ctl_cnt.equalsIgnoreCase(name)) {
			alloc_ctl_cnt(value);
			return;
		}
		if ($stk_rpl_cnt.equalsIgnoreCase(name)) {
			stk_rpl_cnt(value);
			return;
		}
		if ($alt_itm_cnt.equalsIgnoreCase(name)) {
			alt_itm_cnt(value);
			return;
		}
		if ($itm_wg_cnt.equalsIgnoreCase(name)) {
			itm_wg_cnt(value);
			return;
		}
		if ($itm_dtl_cnt.equalsIgnoreCase(name)) {
			itm_dtl_cnt(value);
			return;
		}
		if ($itm_oper_cnt.equalsIgnoreCase(name)) {
			itm_oper_cnt(value);
			return;
		}
		if ($bom_par_cnt.equalsIgnoreCase(name)) {
			bom_par_cnt(value);
			return;
		}
		if ($bom_chd_cnt.equalsIgnoreCase(name)) {
			bom_chd_cnt(value);
			return;
		}
		if ($oper_wk_cost_cnt.equalsIgnoreCase(name)) {
			oper_wk_cost_cnt(value);
			return;
		}
		if ($itm_insp_ptn_cnt.equalsIgnoreCase(name)) {
			itm_insp_ptn_cnt(value);
			return;
		}
		if ($itm_insp_cnt.equalsIgnoreCase(name)) {
			itm_insp_cnt(value);
			return;
		}
		if ($insp_spec_cnt.equalsIgnoreCase(name)) {
			insp_spec_cnt(value);
			return;
		}
		if ($itm_site_cnt.equalsIgnoreCase(name)) {
			itm_site_cnt(value);
			return;
		}
		if ($itm_ver_cnt.equalsIgnoreCase(name)) {
			itm_ver_cnt(value);
			return;
		}
		if ($lot_inh_dest_cnt.equalsIgnoreCase(name)) {
			lot_inh_dest_cnt(value);
			return;
		}
		if ($lot_inh_src_cnt.equalsIgnoreCase(name)) {
			lot_inh_src_cnt(value);
			return;
		}
		if ($itm_spec_cnt.equalsIgnoreCase(name)) {
			itm_spec_cnt(value);
			return;
		}
		if ($itm_spec_desc_cnt.equalsIgnoreCase(name)) {
			itm_spec_desc_cnt(value);
			return;
		}
		if ($itm_comp_core_cnt.equalsIgnoreCase(name)) {
			itm_comp_core_cnt(value);
			return;
		}
		if ($itm_comp_comp_cnt.equalsIgnoreCase(name)) {
			itm_comp_comp_cnt(value);
			return;
		}
		if ($mps_itm_cnt.equalsIgnoreCase(name)) {
			mps_itm_cnt(value);
			return;
		}
		if ($spln_itm_conf_cnt.equalsIgnoreCase(name)) {
			spln_itm_conf_cnt(value);
			return;
		}
		if ($purc_ddlv_lt_cnt.equalsIgnoreCase(name)) {
			purc_ddlv_lt_cnt(value);
			return;
		}
		if ($bp_itm_cnt.equalsIgnoreCase(name)) {
			bp_itm_cnt(value);
			return;
		}
		if ($proc_upri_cnt.equalsIgnoreCase(name)) {
			proc_upri_cnt(value);
			return;
		}
		if ($prov_upri_cnt.equalsIgnoreCase(name)) {
			prov_upri_cnt(value);
			return;
		}
		if ($purc_upri_cnt.equalsIgnoreCase(name)) {
			purc_upri_cnt(value);
			return;
		}
		if ($std_sls_upri_cnt.equalsIgnoreCase(name)) {
			std_sls_upri_cnt(value);
			return;
		}
		if ($itm_sls_upri_cnt.equalsIgnoreCase(name)) {
			itm_sls_upri_cnt(value);
			return;
		}
		if ($cst_sls_upri_cnt.equalsIgnoreCase(name)) {
			cst_sls_upri_cnt(value);
			return;
		}
		if ($set_itm_main_cnt.equalsIgnoreCase(name)) {
			set_itm_main_cnt(value);
			return;
		}
		if ($set_itm_set_cnt.equalsIgnoreCase(name)) {
			set_itm_set_cnt(value);
			return;
		}
		if ($if_x_cnt.equalsIgnoreCase(name)) {
			if_x_cnt(value);
			return;
		}
		if ($ctg_config_cnt.equalsIgnoreCase(name)) {
			ctg_config_cnt(value);
			return;
		}
		if ($jnl_ptn_cnt.equalsIgnoreCase(name)) {
			jnl_ptn_cnt(value);
			return;
		}
		if ($coef_config_cnt.equalsIgnoreCase(name)) {
			coef_config_cnt(value);
			return;
		}
		if ($alc_expns_cnt.equalsIgnoreCase(name)) {
			alc_expns_cnt(value);
			return;
		}
		if ($alc_inpt_cnt.equalsIgnoreCase(name)) {
			alc_inpt_cnt(value);
			return;
		}
		if ($cost_itm_out_cnt.equalsIgnoreCase(name)) {
			cost_itm_out_cnt(value);
			return;
		}
		if ($xpns_purc_alc_cnt.equalsIgnoreCase(name)) {
			xpns_purc_alc_cnt(value);
			return;
		}
		if ($itm_lg_grp_cnt.equalsIgnoreCase(name)) {
			itm_lg_grp_cnt(value);
			return;
		}
		if ($itm_str_ln_cnt.equalsIgnoreCase(name)) {
			itm_str_ln_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($itm_cnt.equalsIgnoreCase(name)) {
			itm_cnt(value);
			return;
		}
		if ($itm_sub_cnt.equalsIgnoreCase(name)) {
			itm_sub_cnt(value);
			return;
		}
		if ($itm_unit_cnt.equalsIgnoreCase(name)) {
			itm_unit_cnt(value);
			return;
		}
		if ($attach_info_cnt.equalsIgnoreCase(name)) {
			attach_info_cnt(value);
			return;
		}
		if ($itm_stop_cnt.equalsIgnoreCase(name)) {
			itm_stop_cnt(value);
			return;
		}
		if ($itm_not_fix_cnt.equalsIgnoreCase(name)) {
			itm_not_fix_cnt(value);
			return;
		}
		if ($stdcost_cnt.equalsIgnoreCase(name)) {
			stdcost_cnt(value);
			return;
		}
		if ($sundry_itm_cnt.equalsIgnoreCase(name)) {
			sundry_itm_cnt(value);
			return;
		}
		if ($itm_strg_cnt.equalsIgnoreCase(name)) {
			itm_strg_cnt(value);
			return;
		}
		if ($alloc_ctl_cnt.equalsIgnoreCase(name)) {
			alloc_ctl_cnt(value);
			return;
		}
		if ($stk_rpl_cnt.equalsIgnoreCase(name)) {
			stk_rpl_cnt(value);
			return;
		}
		if ($alt_itm_cnt.equalsIgnoreCase(name)) {
			alt_itm_cnt(value);
			return;
		}
		if ($itm_wg_cnt.equalsIgnoreCase(name)) {
			itm_wg_cnt(value);
			return;
		}
		if ($itm_dtl_cnt.equalsIgnoreCase(name)) {
			itm_dtl_cnt(value);
			return;
		}
		if ($itm_oper_cnt.equalsIgnoreCase(name)) {
			itm_oper_cnt(value);
			return;
		}
		if ($bom_par_cnt.equalsIgnoreCase(name)) {
			bom_par_cnt(value);
			return;
		}
		if ($bom_chd_cnt.equalsIgnoreCase(name)) {
			bom_chd_cnt(value);
			return;
		}
		if ($oper_wk_cost_cnt.equalsIgnoreCase(name)) {
			oper_wk_cost_cnt(value);
			return;
		}
		if ($itm_insp_ptn_cnt.equalsIgnoreCase(name)) {
			itm_insp_ptn_cnt(value);
			return;
		}
		if ($itm_insp_cnt.equalsIgnoreCase(name)) {
			itm_insp_cnt(value);
			return;
		}
		if ($insp_spec_cnt.equalsIgnoreCase(name)) {
			insp_spec_cnt(value);
			return;
		}
		if ($itm_site_cnt.equalsIgnoreCase(name)) {
			itm_site_cnt(value);
			return;
		}
		if ($itm_ver_cnt.equalsIgnoreCase(name)) {
			itm_ver_cnt(value);
			return;
		}
		if ($lot_inh_dest_cnt.equalsIgnoreCase(name)) {
			lot_inh_dest_cnt(value);
			return;
		}
		if ($lot_inh_src_cnt.equalsIgnoreCase(name)) {
			lot_inh_src_cnt(value);
			return;
		}
		if ($itm_spec_cnt.equalsIgnoreCase(name)) {
			itm_spec_cnt(value);
			return;
		}
		if ($itm_spec_desc_cnt.equalsIgnoreCase(name)) {
			itm_spec_desc_cnt(value);
			return;
		}
		if ($itm_comp_core_cnt.equalsIgnoreCase(name)) {
			itm_comp_core_cnt(value);
			return;
		}
		if ($itm_comp_comp_cnt.equalsIgnoreCase(name)) {
			itm_comp_comp_cnt(value);
			return;
		}
		if ($mps_itm_cnt.equalsIgnoreCase(name)) {
			mps_itm_cnt(value);
			return;
		}
		if ($spln_itm_conf_cnt.equalsIgnoreCase(name)) {
			spln_itm_conf_cnt(value);
			return;
		}
		if ($purc_ddlv_lt_cnt.equalsIgnoreCase(name)) {
			purc_ddlv_lt_cnt(value);
			return;
		}
		if ($bp_itm_cnt.equalsIgnoreCase(name)) {
			bp_itm_cnt(value);
			return;
		}
		if ($proc_upri_cnt.equalsIgnoreCase(name)) {
			proc_upri_cnt(value);
			return;
		}
		if ($prov_upri_cnt.equalsIgnoreCase(name)) {
			prov_upri_cnt(value);
			return;
		}
		if ($purc_upri_cnt.equalsIgnoreCase(name)) {
			purc_upri_cnt(value);
			return;
		}
		if ($std_sls_upri_cnt.equalsIgnoreCase(name)) {
			std_sls_upri_cnt(value);
			return;
		}
		if ($itm_sls_upri_cnt.equalsIgnoreCase(name)) {
			itm_sls_upri_cnt(value);
			return;
		}
		if ($cst_sls_upri_cnt.equalsIgnoreCase(name)) {
			cst_sls_upri_cnt(value);
			return;
		}
		if ($set_itm_main_cnt.equalsIgnoreCase(name)) {
			set_itm_main_cnt(value);
			return;
		}
		if ($set_itm_set_cnt.equalsIgnoreCase(name)) {
			set_itm_set_cnt(value);
			return;
		}
		if ($if_x_cnt.equalsIgnoreCase(name)) {
			if_x_cnt(value);
			return;
		}
		if ($ctg_config_cnt.equalsIgnoreCase(name)) {
			ctg_config_cnt(value);
			return;
		}
		if ($jnl_ptn_cnt.equalsIgnoreCase(name)) {
			jnl_ptn_cnt(value);
			return;
		}
		if ($coef_config_cnt.equalsIgnoreCase(name)) {
			coef_config_cnt(value);
			return;
		}
		if ($alc_expns_cnt.equalsIgnoreCase(name)) {
			alc_expns_cnt(value);
			return;
		}
		if ($alc_inpt_cnt.equalsIgnoreCase(name)) {
			alc_inpt_cnt(value);
			return;
		}
		if ($cost_itm_out_cnt.equalsIgnoreCase(name)) {
			cost_itm_out_cnt(value);
			return;
		}
		if ($xpns_purc_alc_cnt.equalsIgnoreCase(name)) {
			xpns_purc_alc_cnt(value);
			return;
		}
		if ($itm_lg_grp_cnt.equalsIgnoreCase(name)) {
			itm_lg_grp_cnt(value);
			return;
		}
		if ($itm_str_ln_cnt.equalsIgnoreCase(name)) {
			itm_str_ln_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($itm_cnt.equalsIgnoreCase(name)) {
			itm_cnt(value);
			return;
		}
		if ($itm_sub_cnt.equalsIgnoreCase(name)) {
			itm_sub_cnt(value);
			return;
		}
		if ($itm_unit_cnt.equalsIgnoreCase(name)) {
			itm_unit_cnt(value);
			return;
		}
		if ($attach_info_cnt.equalsIgnoreCase(name)) {
			attach_info_cnt(value);
			return;
		}
		if ($itm_stop_cnt.equalsIgnoreCase(name)) {
			itm_stop_cnt(value);
			return;
		}
		if ($itm_not_fix_cnt.equalsIgnoreCase(name)) {
			itm_not_fix_cnt(value);
			return;
		}
		if ($stdcost_cnt.equalsIgnoreCase(name)) {
			stdcost_cnt(value);
			return;
		}
		if ($sundry_itm_cnt.equalsIgnoreCase(name)) {
			sundry_itm_cnt(value);
			return;
		}
		if ($itm_strg_cnt.equalsIgnoreCase(name)) {
			itm_strg_cnt(value);
			return;
		}
		if ($alloc_ctl_cnt.equalsIgnoreCase(name)) {
			alloc_ctl_cnt(value);
			return;
		}
		if ($stk_rpl_cnt.equalsIgnoreCase(name)) {
			stk_rpl_cnt(value);
			return;
		}
		if ($alt_itm_cnt.equalsIgnoreCase(name)) {
			alt_itm_cnt(value);
			return;
		}
		if ($itm_wg_cnt.equalsIgnoreCase(name)) {
			itm_wg_cnt(value);
			return;
		}
		if ($itm_dtl_cnt.equalsIgnoreCase(name)) {
			itm_dtl_cnt(value);
			return;
		}
		if ($itm_oper_cnt.equalsIgnoreCase(name)) {
			itm_oper_cnt(value);
			return;
		}
		if ($bom_par_cnt.equalsIgnoreCase(name)) {
			bom_par_cnt(value);
			return;
		}
		if ($bom_chd_cnt.equalsIgnoreCase(name)) {
			bom_chd_cnt(value);
			return;
		}
		if ($oper_wk_cost_cnt.equalsIgnoreCase(name)) {
			oper_wk_cost_cnt(value);
			return;
		}
		if ($itm_insp_ptn_cnt.equalsIgnoreCase(name)) {
			itm_insp_ptn_cnt(value);
			return;
		}
		if ($itm_insp_cnt.equalsIgnoreCase(name)) {
			itm_insp_cnt(value);
			return;
		}
		if ($insp_spec_cnt.equalsIgnoreCase(name)) {
			insp_spec_cnt(value);
			return;
		}
		if ($itm_site_cnt.equalsIgnoreCase(name)) {
			itm_site_cnt(value);
			return;
		}
		if ($itm_ver_cnt.equalsIgnoreCase(name)) {
			itm_ver_cnt(value);
			return;
		}
		if ($lot_inh_dest_cnt.equalsIgnoreCase(name)) {
			lot_inh_dest_cnt(value);
			return;
		}
		if ($lot_inh_src_cnt.equalsIgnoreCase(name)) {
			lot_inh_src_cnt(value);
			return;
		}
		if ($itm_spec_cnt.equalsIgnoreCase(name)) {
			itm_spec_cnt(value);
			return;
		}
		if ($itm_spec_desc_cnt.equalsIgnoreCase(name)) {
			itm_spec_desc_cnt(value);
			return;
		}
		if ($itm_comp_core_cnt.equalsIgnoreCase(name)) {
			itm_comp_core_cnt(value);
			return;
		}
		if ($itm_comp_comp_cnt.equalsIgnoreCase(name)) {
			itm_comp_comp_cnt(value);
			return;
		}
		if ($mps_itm_cnt.equalsIgnoreCase(name)) {
			mps_itm_cnt(value);
			return;
		}
		if ($spln_itm_conf_cnt.equalsIgnoreCase(name)) {
			spln_itm_conf_cnt(value);
			return;
		}
		if ($purc_ddlv_lt_cnt.equalsIgnoreCase(name)) {
			purc_ddlv_lt_cnt(value);
			return;
		}
		if ($bp_itm_cnt.equalsIgnoreCase(name)) {
			bp_itm_cnt(value);
			return;
		}
		if ($proc_upri_cnt.equalsIgnoreCase(name)) {
			proc_upri_cnt(value);
			return;
		}
		if ($prov_upri_cnt.equalsIgnoreCase(name)) {
			prov_upri_cnt(value);
			return;
		}
		if ($purc_upri_cnt.equalsIgnoreCase(name)) {
			purc_upri_cnt(value);
			return;
		}
		if ($std_sls_upri_cnt.equalsIgnoreCase(name)) {
			std_sls_upri_cnt(value);
			return;
		}
		if ($itm_sls_upri_cnt.equalsIgnoreCase(name)) {
			itm_sls_upri_cnt(value);
			return;
		}
		if ($cst_sls_upri_cnt.equalsIgnoreCase(name)) {
			cst_sls_upri_cnt(value);
			return;
		}
		if ($set_itm_main_cnt.equalsIgnoreCase(name)) {
			set_itm_main_cnt(value);
			return;
		}
		if ($set_itm_set_cnt.equalsIgnoreCase(name)) {
			set_itm_set_cnt(value);
			return;
		}
		if ($if_x_cnt.equalsIgnoreCase(name)) {
			if_x_cnt(value);
			return;
		}
		if ($ctg_config_cnt.equalsIgnoreCase(name)) {
			ctg_config_cnt(value);
			return;
		}
		if ($jnl_ptn_cnt.equalsIgnoreCase(name)) {
			jnl_ptn_cnt(value);
			return;
		}
		if ($coef_config_cnt.equalsIgnoreCase(name)) {
			coef_config_cnt(value);
			return;
		}
		if ($alc_expns_cnt.equalsIgnoreCase(name)) {
			alc_expns_cnt(value);
			return;
		}
		if ($alc_inpt_cnt.equalsIgnoreCase(name)) {
			alc_inpt_cnt(value);
			return;
		}
		if ($cost_itm_out_cnt.equalsIgnoreCase(name)) {
			cost_itm_out_cnt(value);
			return;
		}
		if ($xpns_purc_alc_cnt.equalsIgnoreCase(name)) {
			xpns_purc_alc_cnt(value);
			return;
		}
		if ($itm_lg_grp_cnt.equalsIgnoreCase(name)) {
			itm_lg_grp_cnt(value);
			return;
		}
		if ($itm_str_ln_cnt.equalsIgnoreCase(name)) {
			itm_str_ln_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($itm_cnt.equalsIgnoreCase(name)) {
			itm_cnt(value);
			return;
		}
		if ($itm_sub_cnt.equalsIgnoreCase(name)) {
			itm_sub_cnt(value);
			return;
		}
		if ($itm_unit_cnt.equalsIgnoreCase(name)) {
			itm_unit_cnt(value);
			return;
		}
		if ($attach_info_cnt.equalsIgnoreCase(name)) {
			attach_info_cnt(value);
			return;
		}
		if ($itm_stop_cnt.equalsIgnoreCase(name)) {
			itm_stop_cnt(value);
			return;
		}
		if ($itm_not_fix_cnt.equalsIgnoreCase(name)) {
			itm_not_fix_cnt(value);
			return;
		}
		if ($stdcost_cnt.equalsIgnoreCase(name)) {
			stdcost_cnt(value);
			return;
		}
		if ($sundry_itm_cnt.equalsIgnoreCase(name)) {
			sundry_itm_cnt(value);
			return;
		}
		if ($itm_strg_cnt.equalsIgnoreCase(name)) {
			itm_strg_cnt(value);
			return;
		}
		if ($alloc_ctl_cnt.equalsIgnoreCase(name)) {
			alloc_ctl_cnt(value);
			return;
		}
		if ($stk_rpl_cnt.equalsIgnoreCase(name)) {
			stk_rpl_cnt(value);
			return;
		}
		if ($alt_itm_cnt.equalsIgnoreCase(name)) {
			alt_itm_cnt(value);
			return;
		}
		if ($itm_wg_cnt.equalsIgnoreCase(name)) {
			itm_wg_cnt(value);
			return;
		}
		if ($itm_dtl_cnt.equalsIgnoreCase(name)) {
			itm_dtl_cnt(value);
			return;
		}
		if ($itm_oper_cnt.equalsIgnoreCase(name)) {
			itm_oper_cnt(value);
			return;
		}
		if ($bom_par_cnt.equalsIgnoreCase(name)) {
			bom_par_cnt(value);
			return;
		}
		if ($bom_chd_cnt.equalsIgnoreCase(name)) {
			bom_chd_cnt(value);
			return;
		}
		if ($oper_wk_cost_cnt.equalsIgnoreCase(name)) {
			oper_wk_cost_cnt(value);
			return;
		}
		if ($itm_insp_ptn_cnt.equalsIgnoreCase(name)) {
			itm_insp_ptn_cnt(value);
			return;
		}
		if ($itm_insp_cnt.equalsIgnoreCase(name)) {
			itm_insp_cnt(value);
			return;
		}
		if ($insp_spec_cnt.equalsIgnoreCase(name)) {
			insp_spec_cnt(value);
			return;
		}
		if ($itm_site_cnt.equalsIgnoreCase(name)) {
			itm_site_cnt(value);
			return;
		}
		if ($itm_ver_cnt.equalsIgnoreCase(name)) {
			itm_ver_cnt(value);
			return;
		}
		if ($lot_inh_dest_cnt.equalsIgnoreCase(name)) {
			lot_inh_dest_cnt(value);
			return;
		}
		if ($lot_inh_src_cnt.equalsIgnoreCase(name)) {
			lot_inh_src_cnt(value);
			return;
		}
		if ($itm_spec_cnt.equalsIgnoreCase(name)) {
			itm_spec_cnt(value);
			return;
		}
		if ($itm_spec_desc_cnt.equalsIgnoreCase(name)) {
			itm_spec_desc_cnt(value);
			return;
		}
		if ($itm_comp_core_cnt.equalsIgnoreCase(name)) {
			itm_comp_core_cnt(value);
			return;
		}
		if ($itm_comp_comp_cnt.equalsIgnoreCase(name)) {
			itm_comp_comp_cnt(value);
			return;
		}
		if ($mps_itm_cnt.equalsIgnoreCase(name)) {
			mps_itm_cnt(value);
			return;
		}
		if ($spln_itm_conf_cnt.equalsIgnoreCase(name)) {
			spln_itm_conf_cnt(value);
			return;
		}
		if ($purc_ddlv_lt_cnt.equalsIgnoreCase(name)) {
			purc_ddlv_lt_cnt(value);
			return;
		}
		if ($bp_itm_cnt.equalsIgnoreCase(name)) {
			bp_itm_cnt(value);
			return;
		}
		if ($proc_upri_cnt.equalsIgnoreCase(name)) {
			proc_upri_cnt(value);
			return;
		}
		if ($prov_upri_cnt.equalsIgnoreCase(name)) {
			prov_upri_cnt(value);
			return;
		}
		if ($purc_upri_cnt.equalsIgnoreCase(name)) {
			purc_upri_cnt(value);
			return;
		}
		if ($std_sls_upri_cnt.equalsIgnoreCase(name)) {
			std_sls_upri_cnt(value);
			return;
		}
		if ($itm_sls_upri_cnt.equalsIgnoreCase(name)) {
			itm_sls_upri_cnt(value);
			return;
		}
		if ($cst_sls_upri_cnt.equalsIgnoreCase(name)) {
			cst_sls_upri_cnt(value);
			return;
		}
		if ($set_itm_main_cnt.equalsIgnoreCase(name)) {
			set_itm_main_cnt(value);
			return;
		}
		if ($set_itm_set_cnt.equalsIgnoreCase(name)) {
			set_itm_set_cnt(value);
			return;
		}
		if ($if_x_cnt.equalsIgnoreCase(name)) {
			if_x_cnt(value);
			return;
		}
		if ($ctg_config_cnt.equalsIgnoreCase(name)) {
			ctg_config_cnt(value);
			return;
		}
		if ($jnl_ptn_cnt.equalsIgnoreCase(name)) {
			jnl_ptn_cnt(value);
			return;
		}
		if ($coef_config_cnt.equalsIgnoreCase(name)) {
			coef_config_cnt(value);
			return;
		}
		if ($alc_expns_cnt.equalsIgnoreCase(name)) {
			alc_expns_cnt(value);
			return;
		}
		if ($alc_inpt_cnt.equalsIgnoreCase(name)) {
			alc_inpt_cnt(value);
			return;
		}
		if ($cost_itm_out_cnt.equalsIgnoreCase(name)) {
			cost_itm_out_cnt(value);
			return;
		}
		if ($xpns_purc_alc_cnt.equalsIgnoreCase(name)) {
			xpns_purc_alc_cnt(value);
			return;
		}
		if ($itm_lg_grp_cnt.equalsIgnoreCase(name)) {
			itm_lg_grp_cnt(value);
			return;
		}
		if ($itm_str_ln_cnt.equalsIgnoreCase(name)) {
			itm_str_ln_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
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

