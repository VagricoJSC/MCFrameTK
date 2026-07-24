package mcframe.clientMGBG.MGBGP0150;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public static final String $ctg_cd = "ctg_cd";
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public static final String $ctg_nm = "ctg_nm";
	public static final String $itm_p = "itm_p";
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
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public static final String $alc_ac_nm = "alc_ac_nm";
	/**
	 * Transfer WG cd. 振替ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $trd_wg_cd = "trd_wg_cd";
	/**
	 * Transfer WG name 振替ワーキンググループ名.<p>
	 *
	 */
	public static final String $trd_wg_nm = "trd_wg_nm";
	public static final String $term00 = "term00";
	public static final String $term01 = "term01";
	public static final String $term02 = "term02";
	public static final String $term03 = "term03";
	public static final String $term04 = "term04";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln00 = "pln00";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act00 = "act00";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln01 = "pln01";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act01 = "act01";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln02 = "pln02";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act02 = "act02";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln03 = "pln03";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act03 = "act03";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln04 = "pln04";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act04 = "act04";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln05 = "pln05";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act05 = "act05";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln06 = "pln06";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act06 = "act06";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln07 = "pln07";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act07 = "act07";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln08 = "pln08";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act08 = "act08";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln09 = "pln09";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act09 = "act09";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln10 = "pln10";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act10 = "act10";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln11 = "pln11";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act11 = "act11";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln12 = "pln12";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act12 = "act12";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln13 = "pln13";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act13 = "act13";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln14 = "pln14";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act14 = "act14";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln15 = "pln15";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act15 = "act15";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln16 = "pln16";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act16 = "act16";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln17 = "pln17";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act17 = "act17";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln18 = "pln18";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act18 = "act18";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln19 = "pln19";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act19 = "act19";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln20 = "pln20";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act20 = "act20";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln21 = "pln21";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act21 = "act21";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln22 = "pln22";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act22 = "act22";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln23 = "pln23";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act23 = "act23";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln24 = "pln24";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act24 = "act24";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln25 = "pln25";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act25 = "act25";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln26 = "pln26";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act26 = "act26";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln27 = "pln27";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act27 = "act27";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln28 = "pln28";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act28 = "act28";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln29 = "pln29";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act29 = "act29";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln30 = "pln30";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act30 = "act30";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln31 = "pln31";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act31 = "act31";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln32 = "pln32";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act32 = "act32";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln33 = "pln33";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act33 = "act33";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln34 = "pln34";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act34 = "act34";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln35 = "pln35";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act35 = "act35";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln36 = "pln36";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act36 = "act36";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln37 = "pln37";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act37 = "act37";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln38 = "pln38";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act38 = "act38";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln39 = "pln39";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act39 = "act39";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln40 = "pln40";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act40 = "act40";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln41 = "pln41";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act41 = "act41";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln42 = "pln42";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act42 = "act42";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln43 = "pln43";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act43 = "act43";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln44 = "pln44";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act44 = "act44";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln45 = "pln45";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act45 = "act45";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln46 = "pln46";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act46 = "act46";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln47 = "pln47";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act47 = "act47";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln48 = "pln48";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act48 = "act48";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln49 = "pln49";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act49 = "act49";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln50 = "pln50";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act50 = "act50";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln51 = "pln51";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act51 = "act51";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln52 = "pln52";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act52 = "act52";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln53 = "pln53";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act53 = "act53";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln54 = "pln54";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act54 = "act54";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln55 = "pln55";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act55 = "act55";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln56 = "pln56";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act56 = "act56";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln57 = "pln57";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act57 = "act57";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln58 = "pln58";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act58 = "act58";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $pln59 = "pln59";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $act59 = "act59";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ctg_cd_META = createCommonMeta($ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta ctg_nm_META = createCommonMeta($ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta trd_wg_cd_META = createCommonMeta($trd_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta trd_wg_nm_META = createCommonMeta($trd_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta term00_META = createCommonMeta($term00, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta term01_META = createCommonMeta($term01, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta term02_META = createCommonMeta($term02, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta term03_META = createCommonMeta($term03, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta term04_META = createCommonMeta($term04, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln00_META = createCommonMeta($pln00, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act00_META = createCommonMeta($act00, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln01_META = createCommonMeta($pln01, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act01_META = createCommonMeta($act01, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln02_META = createCommonMeta($pln02, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act02_META = createCommonMeta($act02, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln03_META = createCommonMeta($pln03, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act03_META = createCommonMeta($act03, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln04_META = createCommonMeta($pln04, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act04_META = createCommonMeta($act04, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln05_META = createCommonMeta($pln05, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act05_META = createCommonMeta($act05, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln06_META = createCommonMeta($pln06, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act06_META = createCommonMeta($act06, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln07_META = createCommonMeta($pln07, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act07_META = createCommonMeta($act07, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln08_META = createCommonMeta($pln08, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act08_META = createCommonMeta($act08, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln09_META = createCommonMeta($pln09, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act09_META = createCommonMeta($act09, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln10_META = createCommonMeta($pln10, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act10_META = createCommonMeta($act10, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln11_META = createCommonMeta($pln11, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act11_META = createCommonMeta($act11, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln12_META = createCommonMeta($pln12, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act12_META = createCommonMeta($act12, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln13_META = createCommonMeta($pln13, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act13_META = createCommonMeta($act13, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln14_META = createCommonMeta($pln14, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act14_META = createCommonMeta($act14, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln15_META = createCommonMeta($pln15, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act15_META = createCommonMeta($act15, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln16_META = createCommonMeta($pln16, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act16_META = createCommonMeta($act16, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln17_META = createCommonMeta($pln17, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act17_META = createCommonMeta($act17, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln18_META = createCommonMeta($pln18, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act18_META = createCommonMeta($act18, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln19_META = createCommonMeta($pln19, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act19_META = createCommonMeta($act19, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln20_META = createCommonMeta($pln20, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act20_META = createCommonMeta($act20, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln21_META = createCommonMeta($pln21, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act21_META = createCommonMeta($act21, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln22_META = createCommonMeta($pln22, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act22_META = createCommonMeta($act22, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln23_META = createCommonMeta($pln23, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act23_META = createCommonMeta($act23, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln24_META = createCommonMeta($pln24, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act24_META = createCommonMeta($act24, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln25_META = createCommonMeta($pln25, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act25_META = createCommonMeta($act25, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln26_META = createCommonMeta($pln26, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act26_META = createCommonMeta($act26, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln27_META = createCommonMeta($pln27, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act27_META = createCommonMeta($act27, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln28_META = createCommonMeta($pln28, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act28_META = createCommonMeta($act28, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln29_META = createCommonMeta($pln29, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act29_META = createCommonMeta($act29, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln30_META = createCommonMeta($pln30, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act30_META = createCommonMeta($act30, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln31_META = createCommonMeta($pln31, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act31_META = createCommonMeta($act31, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln32_META = createCommonMeta($pln32, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act32_META = createCommonMeta($act32, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln33_META = createCommonMeta($pln33, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act33_META = createCommonMeta($act33, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln34_META = createCommonMeta($pln34, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act34_META = createCommonMeta($act34, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln35_META = createCommonMeta($pln35, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act35_META = createCommonMeta($act35, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln36_META = createCommonMeta($pln36, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act36_META = createCommonMeta($act36, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln37_META = createCommonMeta($pln37, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act37_META = createCommonMeta($act37, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln38_META = createCommonMeta($pln38, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act38_META = createCommonMeta($act38, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln39_META = createCommonMeta($pln39, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act39_META = createCommonMeta($act39, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln40_META = createCommonMeta($pln40, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act40_META = createCommonMeta($act40, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln41_META = createCommonMeta($pln41, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act41_META = createCommonMeta($act41, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln42_META = createCommonMeta($pln42, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act42_META = createCommonMeta($act42, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln43_META = createCommonMeta($pln43, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act43_META = createCommonMeta($act43, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln44_META = createCommonMeta($pln44, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act44_META = createCommonMeta($act44, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln45_META = createCommonMeta($pln45, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act45_META = createCommonMeta($act45, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln46_META = createCommonMeta($pln46, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act46_META = createCommonMeta($act46, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln47_META = createCommonMeta($pln47, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act47_META = createCommonMeta($act47, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln48_META = createCommonMeta($pln48, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act48_META = createCommonMeta($act48, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln49_META = createCommonMeta($pln49, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act49_META = createCommonMeta($act49, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln50_META = createCommonMeta($pln50, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act50_META = createCommonMeta($act50, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln51_META = createCommonMeta($pln51, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act51_META = createCommonMeta($act51, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln52_META = createCommonMeta($pln52, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act52_META = createCommonMeta($act52, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln53_META = createCommonMeta($pln53, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act53_META = createCommonMeta($act53, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln54_META = createCommonMeta($pln54, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act54_META = createCommonMeta($act54, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln55_META = createCommonMeta($pln55, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act55_META = createCommonMeta($act55, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln56_META = createCommonMeta($pln56, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act56_META = createCommonMeta($act56, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln57_META = createCommonMeta($pln57, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act57_META = createCommonMeta($act57, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln58_META = createCommonMeta($pln58, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act58_META = createCommonMeta($act58, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta pln59_META = createCommonMeta($pln59, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);
	public static final MCMeta act59_META = createCommonMeta($act59, mcframe.commonMG.meta.MG_META.PRE_ALC_RATE);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dpt_cd_META,
			dpt_nm_META,
			loc_cd_META,
			loc_nm_META,
			oper_cd_META,
			oper_nm_META,
			bp_cd_META,
			bp_nm_META,
			ctg_cd_META,
			ctg_nm_META,
			itm_p_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			itm_mfg_inst_no_META,
			iv_no_META,
			po_no_META,
			slo_no_META,
			alc_ac_cd_META,
			alc_ac_nm_META,
			trd_wg_cd_META,
			trd_wg_nm_META,
			term00_META,
			term01_META,
			term02_META,
			term03_META,
			term04_META,
			pln00_META,
			act00_META,
			pln01_META,
			act01_META,
			pln02_META,
			act02_META,
			pln03_META,
			act03_META,
			pln04_META,
			act04_META,
			pln05_META,
			act05_META,
			pln06_META,
			act06_META,
			pln07_META,
			act07_META,
			pln08_META,
			act08_META,
			pln09_META,
			act09_META,
			pln10_META,
			act10_META,
			pln11_META,
			act11_META,
			pln12_META,
			act12_META,
			pln13_META,
			act13_META,
			pln14_META,
			act14_META,
			pln15_META,
			act15_META,
			pln16_META,
			act16_META,
			pln17_META,
			act17_META,
			pln18_META,
			act18_META,
			pln19_META,
			act19_META,
			pln20_META,
			act20_META,
			pln21_META,
			act21_META,
			pln22_META,
			act22_META,
			pln23_META,
			act23_META,
			pln24_META,
			act24_META,
			pln25_META,
			act25_META,
			pln26_META,
			act26_META,
			pln27_META,
			act27_META,
			pln28_META,
			act28_META,
			pln29_META,
			act29_META,
			pln30_META,
			act30_META,
			pln31_META,
			act31_META,
			pln32_META,
			act32_META,
			pln33_META,
			act33_META,
			pln34_META,
			act34_META,
			pln35_META,
			act35_META,
			pln36_META,
			act36_META,
			pln37_META,
			act37_META,
			pln38_META,
			act38_META,
			pln39_META,
			act39_META,
			pln40_META,
			act40_META,
			pln41_META,
			act41_META,
			pln42_META,
			act42_META,
			pln43_META,
			act43_META,
			pln44_META,
			act44_META,
			pln45_META,
			act45_META,
			pln46_META,
			act46_META,
			pln47_META,
			act47_META,
			pln48_META,
			act48_META,
			pln49_META,
			act49_META,
			pln50_META,
			act50_META,
			pln51_META,
			act51_META,
			pln52_META,
			act52_META,
			pln53_META,
			act53_META,
			pln54_META,
			act54_META,
			pln55_META,
			act55_META,
			pln56_META,
			act56_META,
			pln57_META,
			act57_META,
			pln58_META,
			act58_META,
			pln59_META,
			act59_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$dpt_cd,	// dpt_cd
			$loc_cd,	// loc_cd
			$oper_cd,	// oper_cd
			$bp_cd,	// bp_cd
			$ctg_cd,	// ctg_cd
			$itm_p + ".itm_cd",	// itm_p.itm_cd
			$itm_p + ".itm_sub1",	// itm_p.itm_sub1
			$itm_p + ".itm_sub2",	// itm_p.itm_sub2
			$itm_p + ".itm_sub3",	// itm_p.itm_sub3
			$lot_no,	// lot_no
			$sublot_no,	// sublot_no
			$sno1,	// sno1
			$sno2,	// sno2
			$sno3,	// sno3
			$sno4,	// sno4
			$itm_mfg_inst_no,	// itm_mfg_inst_no
			$iv_no,	// iv_no
			$po_no,	// po_no
			$slo_no,	// slo_no
			$alc_ac_cd,	// alc_ac_cd
			$trd_wg_cd	// trd_wg_cd
		}
	);

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$sno1, "SNO1"},	// sno1
				{$sno2, "SNO2"},	// sno2
				{$sno3, "SNO3"},	// sno3
				{$sno4, "SNO4"},	// sno4
				{$trd_wg_cd, "WG"},	// trd_wg_cd
				{$trd_wg_nm, "WG"}	// trd_wg_nm
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
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
				{$term00, "TERM"},	// term00
				{$term01, "TERM"},	// term01
				{$term02, "TERM"},	// term02
				{$term03, "TERM"},	// term03
				{$term04, "TERM"},	// term04
				{$pln00, "PLN"},	// pln00
				{$act00, "ACT"},	// act00
				{$pln01, "PLN"},	// pln01
				{$act01, "ACT"},	// act01
				{$pln02, "PLN"},	// pln02
				{$act02, "ACT"},	// act02
				{$pln03, "PLN"},	// pln03
				{$act03, "ACT"},	// act03
				{$pln04, "PLN"},	// pln04
				{$act04, "ACT"},	// act04
				{$pln05, "PLN"},	// pln05
				{$act05, "ACT"},	// act05
				{$pln06, "PLN"},	// pln06
				{$act06, "ACT"},	// act06
				{$pln07, "PLN"},	// pln07
				{$act07, "ACT"},	// act07
				{$pln08, "PLN"},	// pln08
				{$act08, "ACT"},	// act08
				{$pln09, "PLN"},	// pln09
				{$act09, "ACT"},	// act09
				{$pln10, "PLN"},	// pln10
				{$act10, "ACT"},	// act10
				{$pln11, "PLN"},	// pln11
				{$act11, "ACT"},	// act11
				{$pln12, "PLN"},	// pln12
				{$act12, "ACT"},	// act12
				{$pln13, "PLN"},	// pln13
				{$act13, "ACT"},	// act13
				{$pln14, "PLN"},	// pln14
				{$act14, "ACT"},	// act14
				{$pln15, "PLN"},	// pln15
				{$act15, "ACT"},	// act15
				{$pln16, "PLN"},	// pln16
				{$act16, "ACT"},	// act16
				{$pln17, "PLN"},	// pln17
				{$act17, "ACT"},	// act17
				{$pln18, "PLN"},	// pln18
				{$act18, "ACT"},	// act18
				{$pln19, "PLN"},	// pln19
				{$act19, "ACT"},	// act19
				{$pln20, "PLN"},	// pln20
				{$act20, "ACT"},	// act20
				{$pln21, "PLN"},	// pln21
				{$act21, "ACT"},	// act21
				{$pln22, "PLN"},	// pln22
				{$act22, "ACT"},	// act22
				{$pln23, "PLN"},	// pln23
				{$act23, "ACT"},	// act23
				{$pln24, "PLN"},	// pln24
				{$act24, "ACT"},	// act24
				{$pln25, "PLN"},	// pln25
				{$act25, "ACT"},	// act25
				{$pln26, "PLN"},	// pln26
				{$act26, "ACT"},	// act26
				{$pln27, "PLN"},	// pln27
				{$act27, "ACT"},	// act27
				{$pln28, "PLN"},	// pln28
				{$act28, "ACT"},	// act28
				{$pln29, "PLN"},	// pln29
				{$act29, "ACT"},	// act29
				{$pln30, "PLN"},	// pln30
				{$act30, "ACT"},	// act30
				{$pln31, "PLN"},	// pln31
				{$act31, "ACT"},	// act31
				{$pln32, "PLN"},	// pln32
				{$act32, "ACT"},	// act32
				{$pln33, "PLN"},	// pln33
				{$act33, "ACT"},	// act33
				{$pln34, "PLN"},	// pln34
				{$act34, "ACT"},	// act34
				{$pln35, "PLN"},	// pln35
				{$act35, "ACT"},	// act35
				{$pln36, "PLN"},	// pln36
				{$act36, "ACT"},	// act36
				{$pln37, "PLN"},	// pln37
				{$act37, "ACT"},	// act37
				{$pln38, "PLN"},	// pln38
				{$act38, "ACT"},	// act38
				{$pln39, "PLN"},	// pln39
				{$act39, "ACT"},	// act39
				{$pln40, "PLN"},	// pln40
				{$act40, "ACT"},	// act40
				{$pln41, "PLN"},	// pln41
				{$act41, "ACT"},	// act41
				{$pln42, "PLN"},	// pln42
				{$act42, "ACT"},	// act42
				{$pln43, "PLN"},	// pln43
				{$act43, "ACT"},	// act43
				{$pln44, "PLN"},	// pln44
				{$act44, "ACT"},	// act44
				{$pln45, "PLN"},	// pln45
				{$act45, "ACT"},	// act45
				{$pln46, "PLN"},	// pln46
				{$act46, "ACT"},	// act46
				{$pln47, "PLN"},	// pln47
				{$act47, "ACT"},	// act47
				{$pln48, "PLN"},	// pln48
				{$act48, "ACT"},	// act48
				{$pln49, "PLN"},	// pln49
				{$act49, "ACT"},	// act49
				{$pln50, "PLN"},	// pln50
				{$act50, "ACT"},	// act50
				{$pln51, "PLN"},	// pln51
				{$act51, "ACT"},	// act51
				{$pln52, "PLN"},	// pln52
				{$act52, "ACT"},	// act52
				{$pln53, "PLN"},	// pln53
				{$act53, "ACT"},	// act53
				{$pln54, "PLN"},	// pln54
				{$act54, "ACT"},	// act54
				{$pln55, "PLN"},	// pln55
				{$act55, "ACT"},	// act55
				{$pln56, "PLN"},	// pln56
				{$act56, "ACT"},	// act56
				{$pln57, "PLN"},	// pln57
				{$act57, "ACT"},	// act57
				{$pln58, "PLN"},	// pln58
				{$act58, "ACT"},	// act58
				{$pln59, "PLN"},	// pln59
				{$act59, "ACT"}	// act59
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



	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 0, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 0, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 1, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 1, $dpt_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 2, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 2, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 3, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 3, $loc_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 4, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 4, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 5, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 5, $oper_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 6, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 6, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 7, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 7, $bp_nm, value);
	}


	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 8, $ctg_cd);
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 8, $ctg_cd, value);
	}


	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public String ctg_nm() {
		return getConstString(offset + 9, $ctg_nm);
	}

	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public void ctg_nm(String value) {
		setConstString(offset + 9, $ctg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 10, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 10, $itm_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 11, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 11, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 12, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 12, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 13, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 13, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 14, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 14, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 15, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 15, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 16, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 16, $sno4, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 17, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 17, $itm_mfg_inst_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 18, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 18, $iv_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 19, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 19, $po_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 20, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 20, $slo_no, value);
	}


	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 21, $alc_ac_cd);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 21, $alc_ac_cd, value);
	}


	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 22, $alc_ac_nm);
	}

	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 22, $alc_ac_nm, value);
	}


	/**
	 * Transfer WG cd. 振替ワーキンググループＣＤ.<p>
	 *
	 */
	public String trd_wg_cd() {
		return getConstString(offset + 23, $trd_wg_cd);
	}

	/**
	 * Transfer WG cd. 振替ワーキンググループＣＤ.<p>
	 *
	 */
	public void trd_wg_cd(String value) {
		setConstString(offset + 23, $trd_wg_cd, value);
	}


	/**
	 * Transfer WG name 振替ワーキンググループ名.<p>
	 *
	 */
	public String trd_wg_nm() {
		return getConstString(offset + 24, $trd_wg_nm);
	}

	/**
	 * Transfer WG name 振替ワーキンググループ名.<p>
	 *
	 */
	public void trd_wg_nm(String value) {
		setConstString(offset + 24, $trd_wg_nm, value);
	}


	public MCNumber term00() {
		return getConstNumber(offset + 25, $term00);
	}

	public void term00(MCNumber value) {
		setConstNumber(offset + 25, $term00, value);
	}

	public void term00(int value) {
		setConstNumber(offset + 25, $term00, value);
	}

	public void term00(long value) {
		setConstNumber(offset + 25, $term00, value);
	}

	public void term00(float value) {
		setConstNumber(offset + 25, $term00, value);
	}

	public void term00(double value) {
		setConstNumber(offset + 25, $term00, value);
	}


	public MCNumber term01() {
		return getConstNumber(offset + 26, $term01);
	}

	public void term01(MCNumber value) {
		setConstNumber(offset + 26, $term01, value);
	}

	public void term01(int value) {
		setConstNumber(offset + 26, $term01, value);
	}

	public void term01(long value) {
		setConstNumber(offset + 26, $term01, value);
	}

	public void term01(float value) {
		setConstNumber(offset + 26, $term01, value);
	}

	public void term01(double value) {
		setConstNumber(offset + 26, $term01, value);
	}


	public MCNumber term02() {
		return getConstNumber(offset + 27, $term02);
	}

	public void term02(MCNumber value) {
		setConstNumber(offset + 27, $term02, value);
	}

	public void term02(int value) {
		setConstNumber(offset + 27, $term02, value);
	}

	public void term02(long value) {
		setConstNumber(offset + 27, $term02, value);
	}

	public void term02(float value) {
		setConstNumber(offset + 27, $term02, value);
	}

	public void term02(double value) {
		setConstNumber(offset + 27, $term02, value);
	}


	public MCNumber term03() {
		return getConstNumber(offset + 28, $term03);
	}

	public void term03(MCNumber value) {
		setConstNumber(offset + 28, $term03, value);
	}

	public void term03(int value) {
		setConstNumber(offset + 28, $term03, value);
	}

	public void term03(long value) {
		setConstNumber(offset + 28, $term03, value);
	}

	public void term03(float value) {
		setConstNumber(offset + 28, $term03, value);
	}

	public void term03(double value) {
		setConstNumber(offset + 28, $term03, value);
	}


	public MCNumber term04() {
		return getConstNumber(offset + 29, $term04);
	}

	public void term04(MCNumber value) {
		setConstNumber(offset + 29, $term04, value);
	}

	public void term04(int value) {
		setConstNumber(offset + 29, $term04, value);
	}

	public void term04(long value) {
		setConstNumber(offset + 29, $term04, value);
	}

	public void term04(float value) {
		setConstNumber(offset + 29, $term04, value);
	}

	public void term04(double value) {
		setConstNumber(offset + 29, $term04, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln00() {
		return getConstNumber(offset + 30, $pln00);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln00(MCNumber value) {
		setConstNumber(offset + 30, $pln00, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln00(int value) {
		setConstNumber(offset + 30, $pln00, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln00(long value) {
		setConstNumber(offset + 30, $pln00, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln00(float value) {
		setConstNumber(offset + 30, $pln00, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln00(double value) {
		setConstNumber(offset + 30, $pln00, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act00() {
		return getConstNumber(offset + 31, $act00);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act00(MCNumber value) {
		setConstNumber(offset + 31, $act00, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act00(int value) {
		setConstNumber(offset + 31, $act00, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act00(long value) {
		setConstNumber(offset + 31, $act00, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act00(float value) {
		setConstNumber(offset + 31, $act00, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act00(double value) {
		setConstNumber(offset + 31, $act00, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln01() {
		return getConstNumber(offset + 32, $pln01);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln01(MCNumber value) {
		setConstNumber(offset + 32, $pln01, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln01(int value) {
		setConstNumber(offset + 32, $pln01, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln01(long value) {
		setConstNumber(offset + 32, $pln01, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln01(float value) {
		setConstNumber(offset + 32, $pln01, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln01(double value) {
		setConstNumber(offset + 32, $pln01, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act01() {
		return getConstNumber(offset + 33, $act01);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act01(MCNumber value) {
		setConstNumber(offset + 33, $act01, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act01(int value) {
		setConstNumber(offset + 33, $act01, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act01(long value) {
		setConstNumber(offset + 33, $act01, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act01(float value) {
		setConstNumber(offset + 33, $act01, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act01(double value) {
		setConstNumber(offset + 33, $act01, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln02() {
		return getConstNumber(offset + 34, $pln02);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln02(MCNumber value) {
		setConstNumber(offset + 34, $pln02, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln02(int value) {
		setConstNumber(offset + 34, $pln02, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln02(long value) {
		setConstNumber(offset + 34, $pln02, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln02(float value) {
		setConstNumber(offset + 34, $pln02, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln02(double value) {
		setConstNumber(offset + 34, $pln02, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act02() {
		return getConstNumber(offset + 35, $act02);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act02(MCNumber value) {
		setConstNumber(offset + 35, $act02, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act02(int value) {
		setConstNumber(offset + 35, $act02, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act02(long value) {
		setConstNumber(offset + 35, $act02, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act02(float value) {
		setConstNumber(offset + 35, $act02, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act02(double value) {
		setConstNumber(offset + 35, $act02, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln03() {
		return getConstNumber(offset + 36, $pln03);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln03(MCNumber value) {
		setConstNumber(offset + 36, $pln03, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln03(int value) {
		setConstNumber(offset + 36, $pln03, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln03(long value) {
		setConstNumber(offset + 36, $pln03, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln03(float value) {
		setConstNumber(offset + 36, $pln03, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln03(double value) {
		setConstNumber(offset + 36, $pln03, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act03() {
		return getConstNumber(offset + 37, $act03);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act03(MCNumber value) {
		setConstNumber(offset + 37, $act03, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act03(int value) {
		setConstNumber(offset + 37, $act03, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act03(long value) {
		setConstNumber(offset + 37, $act03, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act03(float value) {
		setConstNumber(offset + 37, $act03, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act03(double value) {
		setConstNumber(offset + 37, $act03, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln04() {
		return getConstNumber(offset + 38, $pln04);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln04(MCNumber value) {
		setConstNumber(offset + 38, $pln04, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln04(int value) {
		setConstNumber(offset + 38, $pln04, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln04(long value) {
		setConstNumber(offset + 38, $pln04, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln04(float value) {
		setConstNumber(offset + 38, $pln04, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln04(double value) {
		setConstNumber(offset + 38, $pln04, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act04() {
		return getConstNumber(offset + 39, $act04);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act04(MCNumber value) {
		setConstNumber(offset + 39, $act04, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act04(int value) {
		setConstNumber(offset + 39, $act04, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act04(long value) {
		setConstNumber(offset + 39, $act04, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act04(float value) {
		setConstNumber(offset + 39, $act04, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act04(double value) {
		setConstNumber(offset + 39, $act04, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln05() {
		return getConstNumber(offset + 40, $pln05);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln05(MCNumber value) {
		setConstNumber(offset + 40, $pln05, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln05(int value) {
		setConstNumber(offset + 40, $pln05, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln05(long value) {
		setConstNumber(offset + 40, $pln05, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln05(float value) {
		setConstNumber(offset + 40, $pln05, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln05(double value) {
		setConstNumber(offset + 40, $pln05, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act05() {
		return getConstNumber(offset + 41, $act05);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act05(MCNumber value) {
		setConstNumber(offset + 41, $act05, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act05(int value) {
		setConstNumber(offset + 41, $act05, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act05(long value) {
		setConstNumber(offset + 41, $act05, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act05(float value) {
		setConstNumber(offset + 41, $act05, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act05(double value) {
		setConstNumber(offset + 41, $act05, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln06() {
		return getConstNumber(offset + 42, $pln06);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln06(MCNumber value) {
		setConstNumber(offset + 42, $pln06, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln06(int value) {
		setConstNumber(offset + 42, $pln06, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln06(long value) {
		setConstNumber(offset + 42, $pln06, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln06(float value) {
		setConstNumber(offset + 42, $pln06, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln06(double value) {
		setConstNumber(offset + 42, $pln06, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act06() {
		return getConstNumber(offset + 43, $act06);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act06(MCNumber value) {
		setConstNumber(offset + 43, $act06, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act06(int value) {
		setConstNumber(offset + 43, $act06, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act06(long value) {
		setConstNumber(offset + 43, $act06, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act06(float value) {
		setConstNumber(offset + 43, $act06, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act06(double value) {
		setConstNumber(offset + 43, $act06, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln07() {
		return getConstNumber(offset + 44, $pln07);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln07(MCNumber value) {
		setConstNumber(offset + 44, $pln07, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln07(int value) {
		setConstNumber(offset + 44, $pln07, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln07(long value) {
		setConstNumber(offset + 44, $pln07, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln07(float value) {
		setConstNumber(offset + 44, $pln07, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln07(double value) {
		setConstNumber(offset + 44, $pln07, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act07() {
		return getConstNumber(offset + 45, $act07);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act07(MCNumber value) {
		setConstNumber(offset + 45, $act07, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act07(int value) {
		setConstNumber(offset + 45, $act07, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act07(long value) {
		setConstNumber(offset + 45, $act07, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act07(float value) {
		setConstNumber(offset + 45, $act07, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act07(double value) {
		setConstNumber(offset + 45, $act07, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln08() {
		return getConstNumber(offset + 46, $pln08);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln08(MCNumber value) {
		setConstNumber(offset + 46, $pln08, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln08(int value) {
		setConstNumber(offset + 46, $pln08, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln08(long value) {
		setConstNumber(offset + 46, $pln08, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln08(float value) {
		setConstNumber(offset + 46, $pln08, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln08(double value) {
		setConstNumber(offset + 46, $pln08, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act08() {
		return getConstNumber(offset + 47, $act08);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act08(MCNumber value) {
		setConstNumber(offset + 47, $act08, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act08(int value) {
		setConstNumber(offset + 47, $act08, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act08(long value) {
		setConstNumber(offset + 47, $act08, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act08(float value) {
		setConstNumber(offset + 47, $act08, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act08(double value) {
		setConstNumber(offset + 47, $act08, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln09() {
		return getConstNumber(offset + 48, $pln09);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln09(MCNumber value) {
		setConstNumber(offset + 48, $pln09, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln09(int value) {
		setConstNumber(offset + 48, $pln09, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln09(long value) {
		setConstNumber(offset + 48, $pln09, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln09(float value) {
		setConstNumber(offset + 48, $pln09, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln09(double value) {
		setConstNumber(offset + 48, $pln09, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act09() {
		return getConstNumber(offset + 49, $act09);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act09(MCNumber value) {
		setConstNumber(offset + 49, $act09, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act09(int value) {
		setConstNumber(offset + 49, $act09, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act09(long value) {
		setConstNumber(offset + 49, $act09, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act09(float value) {
		setConstNumber(offset + 49, $act09, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act09(double value) {
		setConstNumber(offset + 49, $act09, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln10() {
		return getConstNumber(offset + 50, $pln10);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln10(MCNumber value) {
		setConstNumber(offset + 50, $pln10, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln10(int value) {
		setConstNumber(offset + 50, $pln10, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln10(long value) {
		setConstNumber(offset + 50, $pln10, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln10(float value) {
		setConstNumber(offset + 50, $pln10, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln10(double value) {
		setConstNumber(offset + 50, $pln10, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act10() {
		return getConstNumber(offset + 51, $act10);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act10(MCNumber value) {
		setConstNumber(offset + 51, $act10, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act10(int value) {
		setConstNumber(offset + 51, $act10, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act10(long value) {
		setConstNumber(offset + 51, $act10, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act10(float value) {
		setConstNumber(offset + 51, $act10, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act10(double value) {
		setConstNumber(offset + 51, $act10, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln11() {
		return getConstNumber(offset + 52, $pln11);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln11(MCNumber value) {
		setConstNumber(offset + 52, $pln11, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln11(int value) {
		setConstNumber(offset + 52, $pln11, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln11(long value) {
		setConstNumber(offset + 52, $pln11, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln11(float value) {
		setConstNumber(offset + 52, $pln11, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln11(double value) {
		setConstNumber(offset + 52, $pln11, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act11() {
		return getConstNumber(offset + 53, $act11);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act11(MCNumber value) {
		setConstNumber(offset + 53, $act11, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act11(int value) {
		setConstNumber(offset + 53, $act11, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act11(long value) {
		setConstNumber(offset + 53, $act11, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act11(float value) {
		setConstNumber(offset + 53, $act11, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act11(double value) {
		setConstNumber(offset + 53, $act11, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln12() {
		return getConstNumber(offset + 54, $pln12);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln12(MCNumber value) {
		setConstNumber(offset + 54, $pln12, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln12(int value) {
		setConstNumber(offset + 54, $pln12, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln12(long value) {
		setConstNumber(offset + 54, $pln12, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln12(float value) {
		setConstNumber(offset + 54, $pln12, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln12(double value) {
		setConstNumber(offset + 54, $pln12, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act12() {
		return getConstNumber(offset + 55, $act12);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act12(MCNumber value) {
		setConstNumber(offset + 55, $act12, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act12(int value) {
		setConstNumber(offset + 55, $act12, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act12(long value) {
		setConstNumber(offset + 55, $act12, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act12(float value) {
		setConstNumber(offset + 55, $act12, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act12(double value) {
		setConstNumber(offset + 55, $act12, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln13() {
		return getConstNumber(offset + 56, $pln13);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln13(MCNumber value) {
		setConstNumber(offset + 56, $pln13, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln13(int value) {
		setConstNumber(offset + 56, $pln13, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln13(long value) {
		setConstNumber(offset + 56, $pln13, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln13(float value) {
		setConstNumber(offset + 56, $pln13, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln13(double value) {
		setConstNumber(offset + 56, $pln13, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act13() {
		return getConstNumber(offset + 57, $act13);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act13(MCNumber value) {
		setConstNumber(offset + 57, $act13, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act13(int value) {
		setConstNumber(offset + 57, $act13, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act13(long value) {
		setConstNumber(offset + 57, $act13, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act13(float value) {
		setConstNumber(offset + 57, $act13, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act13(double value) {
		setConstNumber(offset + 57, $act13, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln14() {
		return getConstNumber(offset + 58, $pln14);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln14(MCNumber value) {
		setConstNumber(offset + 58, $pln14, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln14(int value) {
		setConstNumber(offset + 58, $pln14, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln14(long value) {
		setConstNumber(offset + 58, $pln14, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln14(float value) {
		setConstNumber(offset + 58, $pln14, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln14(double value) {
		setConstNumber(offset + 58, $pln14, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act14() {
		return getConstNumber(offset + 59, $act14);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act14(MCNumber value) {
		setConstNumber(offset + 59, $act14, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act14(int value) {
		setConstNumber(offset + 59, $act14, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act14(long value) {
		setConstNumber(offset + 59, $act14, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act14(float value) {
		setConstNumber(offset + 59, $act14, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act14(double value) {
		setConstNumber(offset + 59, $act14, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln15() {
		return getConstNumber(offset + 60, $pln15);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln15(MCNumber value) {
		setConstNumber(offset + 60, $pln15, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln15(int value) {
		setConstNumber(offset + 60, $pln15, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln15(long value) {
		setConstNumber(offset + 60, $pln15, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln15(float value) {
		setConstNumber(offset + 60, $pln15, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln15(double value) {
		setConstNumber(offset + 60, $pln15, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act15() {
		return getConstNumber(offset + 61, $act15);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act15(MCNumber value) {
		setConstNumber(offset + 61, $act15, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act15(int value) {
		setConstNumber(offset + 61, $act15, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act15(long value) {
		setConstNumber(offset + 61, $act15, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act15(float value) {
		setConstNumber(offset + 61, $act15, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act15(double value) {
		setConstNumber(offset + 61, $act15, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln16() {
		return getConstNumber(offset + 62, $pln16);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln16(MCNumber value) {
		setConstNumber(offset + 62, $pln16, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln16(int value) {
		setConstNumber(offset + 62, $pln16, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln16(long value) {
		setConstNumber(offset + 62, $pln16, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln16(float value) {
		setConstNumber(offset + 62, $pln16, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln16(double value) {
		setConstNumber(offset + 62, $pln16, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act16() {
		return getConstNumber(offset + 63, $act16);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act16(MCNumber value) {
		setConstNumber(offset + 63, $act16, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act16(int value) {
		setConstNumber(offset + 63, $act16, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act16(long value) {
		setConstNumber(offset + 63, $act16, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act16(float value) {
		setConstNumber(offset + 63, $act16, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act16(double value) {
		setConstNumber(offset + 63, $act16, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln17() {
		return getConstNumber(offset + 64, $pln17);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln17(MCNumber value) {
		setConstNumber(offset + 64, $pln17, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln17(int value) {
		setConstNumber(offset + 64, $pln17, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln17(long value) {
		setConstNumber(offset + 64, $pln17, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln17(float value) {
		setConstNumber(offset + 64, $pln17, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln17(double value) {
		setConstNumber(offset + 64, $pln17, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act17() {
		return getConstNumber(offset + 65, $act17);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act17(MCNumber value) {
		setConstNumber(offset + 65, $act17, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act17(int value) {
		setConstNumber(offset + 65, $act17, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act17(long value) {
		setConstNumber(offset + 65, $act17, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act17(float value) {
		setConstNumber(offset + 65, $act17, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act17(double value) {
		setConstNumber(offset + 65, $act17, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln18() {
		return getConstNumber(offset + 66, $pln18);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln18(MCNumber value) {
		setConstNumber(offset + 66, $pln18, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln18(int value) {
		setConstNumber(offset + 66, $pln18, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln18(long value) {
		setConstNumber(offset + 66, $pln18, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln18(float value) {
		setConstNumber(offset + 66, $pln18, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln18(double value) {
		setConstNumber(offset + 66, $pln18, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act18() {
		return getConstNumber(offset + 67, $act18);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act18(MCNumber value) {
		setConstNumber(offset + 67, $act18, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act18(int value) {
		setConstNumber(offset + 67, $act18, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act18(long value) {
		setConstNumber(offset + 67, $act18, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act18(float value) {
		setConstNumber(offset + 67, $act18, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act18(double value) {
		setConstNumber(offset + 67, $act18, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln19() {
		return getConstNumber(offset + 68, $pln19);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln19(MCNumber value) {
		setConstNumber(offset + 68, $pln19, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln19(int value) {
		setConstNumber(offset + 68, $pln19, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln19(long value) {
		setConstNumber(offset + 68, $pln19, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln19(float value) {
		setConstNumber(offset + 68, $pln19, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln19(double value) {
		setConstNumber(offset + 68, $pln19, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act19() {
		return getConstNumber(offset + 69, $act19);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act19(MCNumber value) {
		setConstNumber(offset + 69, $act19, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act19(int value) {
		setConstNumber(offset + 69, $act19, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act19(long value) {
		setConstNumber(offset + 69, $act19, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act19(float value) {
		setConstNumber(offset + 69, $act19, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act19(double value) {
		setConstNumber(offset + 69, $act19, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln20() {
		return getConstNumber(offset + 70, $pln20);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln20(MCNumber value) {
		setConstNumber(offset + 70, $pln20, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln20(int value) {
		setConstNumber(offset + 70, $pln20, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln20(long value) {
		setConstNumber(offset + 70, $pln20, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln20(float value) {
		setConstNumber(offset + 70, $pln20, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln20(double value) {
		setConstNumber(offset + 70, $pln20, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act20() {
		return getConstNumber(offset + 71, $act20);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act20(MCNumber value) {
		setConstNumber(offset + 71, $act20, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act20(int value) {
		setConstNumber(offset + 71, $act20, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act20(long value) {
		setConstNumber(offset + 71, $act20, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act20(float value) {
		setConstNumber(offset + 71, $act20, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act20(double value) {
		setConstNumber(offset + 71, $act20, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln21() {
		return getConstNumber(offset + 72, $pln21);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln21(MCNumber value) {
		setConstNumber(offset + 72, $pln21, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln21(int value) {
		setConstNumber(offset + 72, $pln21, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln21(long value) {
		setConstNumber(offset + 72, $pln21, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln21(float value) {
		setConstNumber(offset + 72, $pln21, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln21(double value) {
		setConstNumber(offset + 72, $pln21, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act21() {
		return getConstNumber(offset + 73, $act21);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act21(MCNumber value) {
		setConstNumber(offset + 73, $act21, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act21(int value) {
		setConstNumber(offset + 73, $act21, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act21(long value) {
		setConstNumber(offset + 73, $act21, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act21(float value) {
		setConstNumber(offset + 73, $act21, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act21(double value) {
		setConstNumber(offset + 73, $act21, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln22() {
		return getConstNumber(offset + 74, $pln22);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln22(MCNumber value) {
		setConstNumber(offset + 74, $pln22, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln22(int value) {
		setConstNumber(offset + 74, $pln22, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln22(long value) {
		setConstNumber(offset + 74, $pln22, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln22(float value) {
		setConstNumber(offset + 74, $pln22, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln22(double value) {
		setConstNumber(offset + 74, $pln22, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act22() {
		return getConstNumber(offset + 75, $act22);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act22(MCNumber value) {
		setConstNumber(offset + 75, $act22, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act22(int value) {
		setConstNumber(offset + 75, $act22, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act22(long value) {
		setConstNumber(offset + 75, $act22, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act22(float value) {
		setConstNumber(offset + 75, $act22, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act22(double value) {
		setConstNumber(offset + 75, $act22, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln23() {
		return getConstNumber(offset + 76, $pln23);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln23(MCNumber value) {
		setConstNumber(offset + 76, $pln23, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln23(int value) {
		setConstNumber(offset + 76, $pln23, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln23(long value) {
		setConstNumber(offset + 76, $pln23, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln23(float value) {
		setConstNumber(offset + 76, $pln23, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln23(double value) {
		setConstNumber(offset + 76, $pln23, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act23() {
		return getConstNumber(offset + 77, $act23);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act23(MCNumber value) {
		setConstNumber(offset + 77, $act23, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act23(int value) {
		setConstNumber(offset + 77, $act23, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act23(long value) {
		setConstNumber(offset + 77, $act23, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act23(float value) {
		setConstNumber(offset + 77, $act23, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act23(double value) {
		setConstNumber(offset + 77, $act23, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln24() {
		return getConstNumber(offset + 78, $pln24);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln24(MCNumber value) {
		setConstNumber(offset + 78, $pln24, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln24(int value) {
		setConstNumber(offset + 78, $pln24, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln24(long value) {
		setConstNumber(offset + 78, $pln24, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln24(float value) {
		setConstNumber(offset + 78, $pln24, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln24(double value) {
		setConstNumber(offset + 78, $pln24, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act24() {
		return getConstNumber(offset + 79, $act24);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act24(MCNumber value) {
		setConstNumber(offset + 79, $act24, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act24(int value) {
		setConstNumber(offset + 79, $act24, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act24(long value) {
		setConstNumber(offset + 79, $act24, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act24(float value) {
		setConstNumber(offset + 79, $act24, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act24(double value) {
		setConstNumber(offset + 79, $act24, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln25() {
		return getConstNumber(offset + 80, $pln25);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln25(MCNumber value) {
		setConstNumber(offset + 80, $pln25, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln25(int value) {
		setConstNumber(offset + 80, $pln25, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln25(long value) {
		setConstNumber(offset + 80, $pln25, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln25(float value) {
		setConstNumber(offset + 80, $pln25, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln25(double value) {
		setConstNumber(offset + 80, $pln25, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act25() {
		return getConstNumber(offset + 81, $act25);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act25(MCNumber value) {
		setConstNumber(offset + 81, $act25, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act25(int value) {
		setConstNumber(offset + 81, $act25, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act25(long value) {
		setConstNumber(offset + 81, $act25, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act25(float value) {
		setConstNumber(offset + 81, $act25, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act25(double value) {
		setConstNumber(offset + 81, $act25, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln26() {
		return getConstNumber(offset + 82, $pln26);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln26(MCNumber value) {
		setConstNumber(offset + 82, $pln26, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln26(int value) {
		setConstNumber(offset + 82, $pln26, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln26(long value) {
		setConstNumber(offset + 82, $pln26, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln26(float value) {
		setConstNumber(offset + 82, $pln26, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln26(double value) {
		setConstNumber(offset + 82, $pln26, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act26() {
		return getConstNumber(offset + 83, $act26);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act26(MCNumber value) {
		setConstNumber(offset + 83, $act26, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act26(int value) {
		setConstNumber(offset + 83, $act26, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act26(long value) {
		setConstNumber(offset + 83, $act26, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act26(float value) {
		setConstNumber(offset + 83, $act26, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act26(double value) {
		setConstNumber(offset + 83, $act26, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln27() {
		return getConstNumber(offset + 84, $pln27);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln27(MCNumber value) {
		setConstNumber(offset + 84, $pln27, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln27(int value) {
		setConstNumber(offset + 84, $pln27, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln27(long value) {
		setConstNumber(offset + 84, $pln27, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln27(float value) {
		setConstNumber(offset + 84, $pln27, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln27(double value) {
		setConstNumber(offset + 84, $pln27, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act27() {
		return getConstNumber(offset + 85, $act27);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act27(MCNumber value) {
		setConstNumber(offset + 85, $act27, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act27(int value) {
		setConstNumber(offset + 85, $act27, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act27(long value) {
		setConstNumber(offset + 85, $act27, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act27(float value) {
		setConstNumber(offset + 85, $act27, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act27(double value) {
		setConstNumber(offset + 85, $act27, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln28() {
		return getConstNumber(offset + 86, $pln28);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln28(MCNumber value) {
		setConstNumber(offset + 86, $pln28, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln28(int value) {
		setConstNumber(offset + 86, $pln28, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln28(long value) {
		setConstNumber(offset + 86, $pln28, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln28(float value) {
		setConstNumber(offset + 86, $pln28, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln28(double value) {
		setConstNumber(offset + 86, $pln28, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act28() {
		return getConstNumber(offset + 87, $act28);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act28(MCNumber value) {
		setConstNumber(offset + 87, $act28, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act28(int value) {
		setConstNumber(offset + 87, $act28, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act28(long value) {
		setConstNumber(offset + 87, $act28, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act28(float value) {
		setConstNumber(offset + 87, $act28, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act28(double value) {
		setConstNumber(offset + 87, $act28, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln29() {
		return getConstNumber(offset + 88, $pln29);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln29(MCNumber value) {
		setConstNumber(offset + 88, $pln29, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln29(int value) {
		setConstNumber(offset + 88, $pln29, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln29(long value) {
		setConstNumber(offset + 88, $pln29, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln29(float value) {
		setConstNumber(offset + 88, $pln29, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln29(double value) {
		setConstNumber(offset + 88, $pln29, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act29() {
		return getConstNumber(offset + 89, $act29);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act29(MCNumber value) {
		setConstNumber(offset + 89, $act29, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act29(int value) {
		setConstNumber(offset + 89, $act29, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act29(long value) {
		setConstNumber(offset + 89, $act29, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act29(float value) {
		setConstNumber(offset + 89, $act29, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act29(double value) {
		setConstNumber(offset + 89, $act29, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln30() {
		return getConstNumber(offset + 90, $pln30);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln30(MCNumber value) {
		setConstNumber(offset + 90, $pln30, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln30(int value) {
		setConstNumber(offset + 90, $pln30, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln30(long value) {
		setConstNumber(offset + 90, $pln30, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln30(float value) {
		setConstNumber(offset + 90, $pln30, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln30(double value) {
		setConstNumber(offset + 90, $pln30, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act30() {
		return getConstNumber(offset + 91, $act30);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act30(MCNumber value) {
		setConstNumber(offset + 91, $act30, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act30(int value) {
		setConstNumber(offset + 91, $act30, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act30(long value) {
		setConstNumber(offset + 91, $act30, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act30(float value) {
		setConstNumber(offset + 91, $act30, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act30(double value) {
		setConstNumber(offset + 91, $act30, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln31() {
		return getConstNumber(offset + 92, $pln31);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln31(MCNumber value) {
		setConstNumber(offset + 92, $pln31, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln31(int value) {
		setConstNumber(offset + 92, $pln31, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln31(long value) {
		setConstNumber(offset + 92, $pln31, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln31(float value) {
		setConstNumber(offset + 92, $pln31, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln31(double value) {
		setConstNumber(offset + 92, $pln31, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act31() {
		return getConstNumber(offset + 93, $act31);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act31(MCNumber value) {
		setConstNumber(offset + 93, $act31, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act31(int value) {
		setConstNumber(offset + 93, $act31, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act31(long value) {
		setConstNumber(offset + 93, $act31, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act31(float value) {
		setConstNumber(offset + 93, $act31, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act31(double value) {
		setConstNumber(offset + 93, $act31, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln32() {
		return getConstNumber(offset + 94, $pln32);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln32(MCNumber value) {
		setConstNumber(offset + 94, $pln32, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln32(int value) {
		setConstNumber(offset + 94, $pln32, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln32(long value) {
		setConstNumber(offset + 94, $pln32, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln32(float value) {
		setConstNumber(offset + 94, $pln32, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln32(double value) {
		setConstNumber(offset + 94, $pln32, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act32() {
		return getConstNumber(offset + 95, $act32);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act32(MCNumber value) {
		setConstNumber(offset + 95, $act32, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act32(int value) {
		setConstNumber(offset + 95, $act32, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act32(long value) {
		setConstNumber(offset + 95, $act32, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act32(float value) {
		setConstNumber(offset + 95, $act32, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act32(double value) {
		setConstNumber(offset + 95, $act32, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln33() {
		return getConstNumber(offset + 96, $pln33);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln33(MCNumber value) {
		setConstNumber(offset + 96, $pln33, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln33(int value) {
		setConstNumber(offset + 96, $pln33, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln33(long value) {
		setConstNumber(offset + 96, $pln33, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln33(float value) {
		setConstNumber(offset + 96, $pln33, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln33(double value) {
		setConstNumber(offset + 96, $pln33, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act33() {
		return getConstNumber(offset + 97, $act33);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act33(MCNumber value) {
		setConstNumber(offset + 97, $act33, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act33(int value) {
		setConstNumber(offset + 97, $act33, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act33(long value) {
		setConstNumber(offset + 97, $act33, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act33(float value) {
		setConstNumber(offset + 97, $act33, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act33(double value) {
		setConstNumber(offset + 97, $act33, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln34() {
		return getConstNumber(offset + 98, $pln34);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln34(MCNumber value) {
		setConstNumber(offset + 98, $pln34, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln34(int value) {
		setConstNumber(offset + 98, $pln34, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln34(long value) {
		setConstNumber(offset + 98, $pln34, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln34(float value) {
		setConstNumber(offset + 98, $pln34, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln34(double value) {
		setConstNumber(offset + 98, $pln34, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act34() {
		return getConstNumber(offset + 99, $act34);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act34(MCNumber value) {
		setConstNumber(offset + 99, $act34, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act34(int value) {
		setConstNumber(offset + 99, $act34, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act34(long value) {
		setConstNumber(offset + 99, $act34, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act34(float value) {
		setConstNumber(offset + 99, $act34, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act34(double value) {
		setConstNumber(offset + 99, $act34, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln35() {
		return getConstNumber(offset + 100, $pln35);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln35(MCNumber value) {
		setConstNumber(offset + 100, $pln35, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln35(int value) {
		setConstNumber(offset + 100, $pln35, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln35(long value) {
		setConstNumber(offset + 100, $pln35, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln35(float value) {
		setConstNumber(offset + 100, $pln35, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln35(double value) {
		setConstNumber(offset + 100, $pln35, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act35() {
		return getConstNumber(offset + 101, $act35);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act35(MCNumber value) {
		setConstNumber(offset + 101, $act35, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act35(int value) {
		setConstNumber(offset + 101, $act35, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act35(long value) {
		setConstNumber(offset + 101, $act35, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act35(float value) {
		setConstNumber(offset + 101, $act35, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act35(double value) {
		setConstNumber(offset + 101, $act35, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln36() {
		return getConstNumber(offset + 102, $pln36);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln36(MCNumber value) {
		setConstNumber(offset + 102, $pln36, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln36(int value) {
		setConstNumber(offset + 102, $pln36, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln36(long value) {
		setConstNumber(offset + 102, $pln36, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln36(float value) {
		setConstNumber(offset + 102, $pln36, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln36(double value) {
		setConstNumber(offset + 102, $pln36, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act36() {
		return getConstNumber(offset + 103, $act36);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act36(MCNumber value) {
		setConstNumber(offset + 103, $act36, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act36(int value) {
		setConstNumber(offset + 103, $act36, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act36(long value) {
		setConstNumber(offset + 103, $act36, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act36(float value) {
		setConstNumber(offset + 103, $act36, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act36(double value) {
		setConstNumber(offset + 103, $act36, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln37() {
		return getConstNumber(offset + 104, $pln37);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln37(MCNumber value) {
		setConstNumber(offset + 104, $pln37, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln37(int value) {
		setConstNumber(offset + 104, $pln37, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln37(long value) {
		setConstNumber(offset + 104, $pln37, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln37(float value) {
		setConstNumber(offset + 104, $pln37, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln37(double value) {
		setConstNumber(offset + 104, $pln37, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act37() {
		return getConstNumber(offset + 105, $act37);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act37(MCNumber value) {
		setConstNumber(offset + 105, $act37, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act37(int value) {
		setConstNumber(offset + 105, $act37, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act37(long value) {
		setConstNumber(offset + 105, $act37, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act37(float value) {
		setConstNumber(offset + 105, $act37, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act37(double value) {
		setConstNumber(offset + 105, $act37, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln38() {
		return getConstNumber(offset + 106, $pln38);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln38(MCNumber value) {
		setConstNumber(offset + 106, $pln38, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln38(int value) {
		setConstNumber(offset + 106, $pln38, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln38(long value) {
		setConstNumber(offset + 106, $pln38, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln38(float value) {
		setConstNumber(offset + 106, $pln38, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln38(double value) {
		setConstNumber(offset + 106, $pln38, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act38() {
		return getConstNumber(offset + 107, $act38);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act38(MCNumber value) {
		setConstNumber(offset + 107, $act38, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act38(int value) {
		setConstNumber(offset + 107, $act38, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act38(long value) {
		setConstNumber(offset + 107, $act38, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act38(float value) {
		setConstNumber(offset + 107, $act38, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act38(double value) {
		setConstNumber(offset + 107, $act38, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln39() {
		return getConstNumber(offset + 108, $pln39);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln39(MCNumber value) {
		setConstNumber(offset + 108, $pln39, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln39(int value) {
		setConstNumber(offset + 108, $pln39, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln39(long value) {
		setConstNumber(offset + 108, $pln39, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln39(float value) {
		setConstNumber(offset + 108, $pln39, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln39(double value) {
		setConstNumber(offset + 108, $pln39, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act39() {
		return getConstNumber(offset + 109, $act39);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act39(MCNumber value) {
		setConstNumber(offset + 109, $act39, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act39(int value) {
		setConstNumber(offset + 109, $act39, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act39(long value) {
		setConstNumber(offset + 109, $act39, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act39(float value) {
		setConstNumber(offset + 109, $act39, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act39(double value) {
		setConstNumber(offset + 109, $act39, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln40() {
		return getConstNumber(offset + 110, $pln40);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln40(MCNumber value) {
		setConstNumber(offset + 110, $pln40, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln40(int value) {
		setConstNumber(offset + 110, $pln40, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln40(long value) {
		setConstNumber(offset + 110, $pln40, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln40(float value) {
		setConstNumber(offset + 110, $pln40, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln40(double value) {
		setConstNumber(offset + 110, $pln40, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act40() {
		return getConstNumber(offset + 111, $act40);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act40(MCNumber value) {
		setConstNumber(offset + 111, $act40, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act40(int value) {
		setConstNumber(offset + 111, $act40, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act40(long value) {
		setConstNumber(offset + 111, $act40, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act40(float value) {
		setConstNumber(offset + 111, $act40, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act40(double value) {
		setConstNumber(offset + 111, $act40, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln41() {
		return getConstNumber(offset + 112, $pln41);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln41(MCNumber value) {
		setConstNumber(offset + 112, $pln41, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln41(int value) {
		setConstNumber(offset + 112, $pln41, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln41(long value) {
		setConstNumber(offset + 112, $pln41, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln41(float value) {
		setConstNumber(offset + 112, $pln41, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln41(double value) {
		setConstNumber(offset + 112, $pln41, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act41() {
		return getConstNumber(offset + 113, $act41);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act41(MCNumber value) {
		setConstNumber(offset + 113, $act41, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act41(int value) {
		setConstNumber(offset + 113, $act41, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act41(long value) {
		setConstNumber(offset + 113, $act41, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act41(float value) {
		setConstNumber(offset + 113, $act41, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act41(double value) {
		setConstNumber(offset + 113, $act41, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln42() {
		return getConstNumber(offset + 114, $pln42);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln42(MCNumber value) {
		setConstNumber(offset + 114, $pln42, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln42(int value) {
		setConstNumber(offset + 114, $pln42, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln42(long value) {
		setConstNumber(offset + 114, $pln42, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln42(float value) {
		setConstNumber(offset + 114, $pln42, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln42(double value) {
		setConstNumber(offset + 114, $pln42, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act42() {
		return getConstNumber(offset + 115, $act42);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act42(MCNumber value) {
		setConstNumber(offset + 115, $act42, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act42(int value) {
		setConstNumber(offset + 115, $act42, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act42(long value) {
		setConstNumber(offset + 115, $act42, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act42(float value) {
		setConstNumber(offset + 115, $act42, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act42(double value) {
		setConstNumber(offset + 115, $act42, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln43() {
		return getConstNumber(offset + 116, $pln43);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln43(MCNumber value) {
		setConstNumber(offset + 116, $pln43, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln43(int value) {
		setConstNumber(offset + 116, $pln43, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln43(long value) {
		setConstNumber(offset + 116, $pln43, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln43(float value) {
		setConstNumber(offset + 116, $pln43, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln43(double value) {
		setConstNumber(offset + 116, $pln43, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act43() {
		return getConstNumber(offset + 117, $act43);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act43(MCNumber value) {
		setConstNumber(offset + 117, $act43, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act43(int value) {
		setConstNumber(offset + 117, $act43, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act43(long value) {
		setConstNumber(offset + 117, $act43, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act43(float value) {
		setConstNumber(offset + 117, $act43, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act43(double value) {
		setConstNumber(offset + 117, $act43, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln44() {
		return getConstNumber(offset + 118, $pln44);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln44(MCNumber value) {
		setConstNumber(offset + 118, $pln44, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln44(int value) {
		setConstNumber(offset + 118, $pln44, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln44(long value) {
		setConstNumber(offset + 118, $pln44, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln44(float value) {
		setConstNumber(offset + 118, $pln44, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln44(double value) {
		setConstNumber(offset + 118, $pln44, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act44() {
		return getConstNumber(offset + 119, $act44);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act44(MCNumber value) {
		setConstNumber(offset + 119, $act44, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act44(int value) {
		setConstNumber(offset + 119, $act44, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act44(long value) {
		setConstNumber(offset + 119, $act44, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act44(float value) {
		setConstNumber(offset + 119, $act44, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act44(double value) {
		setConstNumber(offset + 119, $act44, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln45() {
		return getConstNumber(offset + 120, $pln45);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln45(MCNumber value) {
		setConstNumber(offset + 120, $pln45, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln45(int value) {
		setConstNumber(offset + 120, $pln45, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln45(long value) {
		setConstNumber(offset + 120, $pln45, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln45(float value) {
		setConstNumber(offset + 120, $pln45, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln45(double value) {
		setConstNumber(offset + 120, $pln45, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act45() {
		return getConstNumber(offset + 121, $act45);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act45(MCNumber value) {
		setConstNumber(offset + 121, $act45, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act45(int value) {
		setConstNumber(offset + 121, $act45, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act45(long value) {
		setConstNumber(offset + 121, $act45, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act45(float value) {
		setConstNumber(offset + 121, $act45, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act45(double value) {
		setConstNumber(offset + 121, $act45, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln46() {
		return getConstNumber(offset + 122, $pln46);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln46(MCNumber value) {
		setConstNumber(offset + 122, $pln46, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln46(int value) {
		setConstNumber(offset + 122, $pln46, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln46(long value) {
		setConstNumber(offset + 122, $pln46, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln46(float value) {
		setConstNumber(offset + 122, $pln46, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln46(double value) {
		setConstNumber(offset + 122, $pln46, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act46() {
		return getConstNumber(offset + 123, $act46);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act46(MCNumber value) {
		setConstNumber(offset + 123, $act46, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act46(int value) {
		setConstNumber(offset + 123, $act46, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act46(long value) {
		setConstNumber(offset + 123, $act46, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act46(float value) {
		setConstNumber(offset + 123, $act46, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act46(double value) {
		setConstNumber(offset + 123, $act46, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln47() {
		return getConstNumber(offset + 124, $pln47);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln47(MCNumber value) {
		setConstNumber(offset + 124, $pln47, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln47(int value) {
		setConstNumber(offset + 124, $pln47, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln47(long value) {
		setConstNumber(offset + 124, $pln47, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln47(float value) {
		setConstNumber(offset + 124, $pln47, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln47(double value) {
		setConstNumber(offset + 124, $pln47, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act47() {
		return getConstNumber(offset + 125, $act47);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act47(MCNumber value) {
		setConstNumber(offset + 125, $act47, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act47(int value) {
		setConstNumber(offset + 125, $act47, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act47(long value) {
		setConstNumber(offset + 125, $act47, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act47(float value) {
		setConstNumber(offset + 125, $act47, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act47(double value) {
		setConstNumber(offset + 125, $act47, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln48() {
		return getConstNumber(offset + 126, $pln48);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln48(MCNumber value) {
		setConstNumber(offset + 126, $pln48, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln48(int value) {
		setConstNumber(offset + 126, $pln48, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln48(long value) {
		setConstNumber(offset + 126, $pln48, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln48(float value) {
		setConstNumber(offset + 126, $pln48, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln48(double value) {
		setConstNumber(offset + 126, $pln48, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act48() {
		return getConstNumber(offset + 127, $act48);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act48(MCNumber value) {
		setConstNumber(offset + 127, $act48, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act48(int value) {
		setConstNumber(offset + 127, $act48, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act48(long value) {
		setConstNumber(offset + 127, $act48, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act48(float value) {
		setConstNumber(offset + 127, $act48, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act48(double value) {
		setConstNumber(offset + 127, $act48, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln49() {
		return getConstNumber(offset + 128, $pln49);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln49(MCNumber value) {
		setConstNumber(offset + 128, $pln49, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln49(int value) {
		setConstNumber(offset + 128, $pln49, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln49(long value) {
		setConstNumber(offset + 128, $pln49, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln49(float value) {
		setConstNumber(offset + 128, $pln49, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln49(double value) {
		setConstNumber(offset + 128, $pln49, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act49() {
		return getConstNumber(offset + 129, $act49);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act49(MCNumber value) {
		setConstNumber(offset + 129, $act49, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act49(int value) {
		setConstNumber(offset + 129, $act49, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act49(long value) {
		setConstNumber(offset + 129, $act49, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act49(float value) {
		setConstNumber(offset + 129, $act49, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act49(double value) {
		setConstNumber(offset + 129, $act49, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln50() {
		return getConstNumber(offset + 130, $pln50);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln50(MCNumber value) {
		setConstNumber(offset + 130, $pln50, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln50(int value) {
		setConstNumber(offset + 130, $pln50, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln50(long value) {
		setConstNumber(offset + 130, $pln50, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln50(float value) {
		setConstNumber(offset + 130, $pln50, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln50(double value) {
		setConstNumber(offset + 130, $pln50, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act50() {
		return getConstNumber(offset + 131, $act50);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act50(MCNumber value) {
		setConstNumber(offset + 131, $act50, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act50(int value) {
		setConstNumber(offset + 131, $act50, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act50(long value) {
		setConstNumber(offset + 131, $act50, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act50(float value) {
		setConstNumber(offset + 131, $act50, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act50(double value) {
		setConstNumber(offset + 131, $act50, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln51() {
		return getConstNumber(offset + 132, $pln51);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln51(MCNumber value) {
		setConstNumber(offset + 132, $pln51, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln51(int value) {
		setConstNumber(offset + 132, $pln51, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln51(long value) {
		setConstNumber(offset + 132, $pln51, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln51(float value) {
		setConstNumber(offset + 132, $pln51, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln51(double value) {
		setConstNumber(offset + 132, $pln51, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act51() {
		return getConstNumber(offset + 133, $act51);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act51(MCNumber value) {
		setConstNumber(offset + 133, $act51, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act51(int value) {
		setConstNumber(offset + 133, $act51, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act51(long value) {
		setConstNumber(offset + 133, $act51, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act51(float value) {
		setConstNumber(offset + 133, $act51, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act51(double value) {
		setConstNumber(offset + 133, $act51, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln52() {
		return getConstNumber(offset + 134, $pln52);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln52(MCNumber value) {
		setConstNumber(offset + 134, $pln52, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln52(int value) {
		setConstNumber(offset + 134, $pln52, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln52(long value) {
		setConstNumber(offset + 134, $pln52, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln52(float value) {
		setConstNumber(offset + 134, $pln52, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln52(double value) {
		setConstNumber(offset + 134, $pln52, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act52() {
		return getConstNumber(offset + 135, $act52);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act52(MCNumber value) {
		setConstNumber(offset + 135, $act52, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act52(int value) {
		setConstNumber(offset + 135, $act52, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act52(long value) {
		setConstNumber(offset + 135, $act52, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act52(float value) {
		setConstNumber(offset + 135, $act52, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act52(double value) {
		setConstNumber(offset + 135, $act52, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln53() {
		return getConstNumber(offset + 136, $pln53);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln53(MCNumber value) {
		setConstNumber(offset + 136, $pln53, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln53(int value) {
		setConstNumber(offset + 136, $pln53, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln53(long value) {
		setConstNumber(offset + 136, $pln53, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln53(float value) {
		setConstNumber(offset + 136, $pln53, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln53(double value) {
		setConstNumber(offset + 136, $pln53, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act53() {
		return getConstNumber(offset + 137, $act53);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act53(MCNumber value) {
		setConstNumber(offset + 137, $act53, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act53(int value) {
		setConstNumber(offset + 137, $act53, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act53(long value) {
		setConstNumber(offset + 137, $act53, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act53(float value) {
		setConstNumber(offset + 137, $act53, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act53(double value) {
		setConstNumber(offset + 137, $act53, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln54() {
		return getConstNumber(offset + 138, $pln54);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln54(MCNumber value) {
		setConstNumber(offset + 138, $pln54, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln54(int value) {
		setConstNumber(offset + 138, $pln54, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln54(long value) {
		setConstNumber(offset + 138, $pln54, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln54(float value) {
		setConstNumber(offset + 138, $pln54, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln54(double value) {
		setConstNumber(offset + 138, $pln54, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act54() {
		return getConstNumber(offset + 139, $act54);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act54(MCNumber value) {
		setConstNumber(offset + 139, $act54, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act54(int value) {
		setConstNumber(offset + 139, $act54, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act54(long value) {
		setConstNumber(offset + 139, $act54, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act54(float value) {
		setConstNumber(offset + 139, $act54, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act54(double value) {
		setConstNumber(offset + 139, $act54, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln55() {
		return getConstNumber(offset + 140, $pln55);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln55(MCNumber value) {
		setConstNumber(offset + 140, $pln55, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln55(int value) {
		setConstNumber(offset + 140, $pln55, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln55(long value) {
		setConstNumber(offset + 140, $pln55, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln55(float value) {
		setConstNumber(offset + 140, $pln55, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln55(double value) {
		setConstNumber(offset + 140, $pln55, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act55() {
		return getConstNumber(offset + 141, $act55);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act55(MCNumber value) {
		setConstNumber(offset + 141, $act55, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act55(int value) {
		setConstNumber(offset + 141, $act55, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act55(long value) {
		setConstNumber(offset + 141, $act55, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act55(float value) {
		setConstNumber(offset + 141, $act55, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act55(double value) {
		setConstNumber(offset + 141, $act55, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln56() {
		return getConstNumber(offset + 142, $pln56);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln56(MCNumber value) {
		setConstNumber(offset + 142, $pln56, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln56(int value) {
		setConstNumber(offset + 142, $pln56, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln56(long value) {
		setConstNumber(offset + 142, $pln56, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln56(float value) {
		setConstNumber(offset + 142, $pln56, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln56(double value) {
		setConstNumber(offset + 142, $pln56, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act56() {
		return getConstNumber(offset + 143, $act56);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act56(MCNumber value) {
		setConstNumber(offset + 143, $act56, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act56(int value) {
		setConstNumber(offset + 143, $act56, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act56(long value) {
		setConstNumber(offset + 143, $act56, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act56(float value) {
		setConstNumber(offset + 143, $act56, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act56(double value) {
		setConstNumber(offset + 143, $act56, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln57() {
		return getConstNumber(offset + 144, $pln57);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln57(MCNumber value) {
		setConstNumber(offset + 144, $pln57, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln57(int value) {
		setConstNumber(offset + 144, $pln57, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln57(long value) {
		setConstNumber(offset + 144, $pln57, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln57(float value) {
		setConstNumber(offset + 144, $pln57, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln57(double value) {
		setConstNumber(offset + 144, $pln57, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act57() {
		return getConstNumber(offset + 145, $act57);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act57(MCNumber value) {
		setConstNumber(offset + 145, $act57, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act57(int value) {
		setConstNumber(offset + 145, $act57, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act57(long value) {
		setConstNumber(offset + 145, $act57, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act57(float value) {
		setConstNumber(offset + 145, $act57, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act57(double value) {
		setConstNumber(offset + 145, $act57, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln58() {
		return getConstNumber(offset + 146, $pln58);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln58(MCNumber value) {
		setConstNumber(offset + 146, $pln58, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln58(int value) {
		setConstNumber(offset + 146, $pln58, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln58(long value) {
		setConstNumber(offset + 146, $pln58, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln58(float value) {
		setConstNumber(offset + 146, $pln58, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln58(double value) {
		setConstNumber(offset + 146, $pln58, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act58() {
		return getConstNumber(offset + 147, $act58);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act58(MCNumber value) {
		setConstNumber(offset + 147, $act58, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act58(int value) {
		setConstNumber(offset + 147, $act58, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act58(long value) {
		setConstNumber(offset + 147, $act58, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act58(float value) {
		setConstNumber(offset + 147, $act58, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act58(double value) {
		setConstNumber(offset + 147, $act58, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCNumber pln59() {
		return getConstNumber(offset + 148, $pln59);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln59(MCNumber value) {
		setConstNumber(offset + 148, $pln59, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln59(int value) {
		setConstNumber(offset + 148, $pln59, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln59(long value) {
		setConstNumber(offset + 148, $pln59, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln59(float value) {
		setConstNumber(offset + 148, $pln59, value);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void pln59(double value) {
		setConstNumber(offset + 148, $pln59, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public MCNumber act59() {
		return getConstNumber(offset + 149, $act59);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act59(MCNumber value) {
		setConstNumber(offset + 149, $act59, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act59(int value) {
		setConstNumber(offset + 149, $act59, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act59(long value) {
		setConstNumber(offset + 149, $act59, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act59(float value) {
		setConstNumber(offset + 149, $act59, value);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void act59(double value) {
		setConstNumber(offset + 149, $act59, value);
	}


	public String getString(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($trd_wg_cd.equalsIgnoreCase(name)) {
			return trd_wg_cd();
		}
		if ($trd_wg_nm.equalsIgnoreCase(name)) {
			return trd_wg_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($term00.equalsIgnoreCase(name)) {
			return term00();
		}
		if ($term01.equalsIgnoreCase(name)) {
			return term01();
		}
		if ($term02.equalsIgnoreCase(name)) {
			return term02();
		}
		if ($term03.equalsIgnoreCase(name)) {
			return term03();
		}
		if ($term04.equalsIgnoreCase(name)) {
			return term04();
		}
		if ($pln00.equalsIgnoreCase(name)) {
			return pln00();
		}
		if ($act00.equalsIgnoreCase(name)) {
			return act00();
		}
		if ($pln01.equalsIgnoreCase(name)) {
			return pln01();
		}
		if ($act01.equalsIgnoreCase(name)) {
			return act01();
		}
		if ($pln02.equalsIgnoreCase(name)) {
			return pln02();
		}
		if ($act02.equalsIgnoreCase(name)) {
			return act02();
		}
		if ($pln03.equalsIgnoreCase(name)) {
			return pln03();
		}
		if ($act03.equalsIgnoreCase(name)) {
			return act03();
		}
		if ($pln04.equalsIgnoreCase(name)) {
			return pln04();
		}
		if ($act04.equalsIgnoreCase(name)) {
			return act04();
		}
		if ($pln05.equalsIgnoreCase(name)) {
			return pln05();
		}
		if ($act05.equalsIgnoreCase(name)) {
			return act05();
		}
		if ($pln06.equalsIgnoreCase(name)) {
			return pln06();
		}
		if ($act06.equalsIgnoreCase(name)) {
			return act06();
		}
		if ($pln07.equalsIgnoreCase(name)) {
			return pln07();
		}
		if ($act07.equalsIgnoreCase(name)) {
			return act07();
		}
		if ($pln08.equalsIgnoreCase(name)) {
			return pln08();
		}
		if ($act08.equalsIgnoreCase(name)) {
			return act08();
		}
		if ($pln09.equalsIgnoreCase(name)) {
			return pln09();
		}
		if ($act09.equalsIgnoreCase(name)) {
			return act09();
		}
		if ($pln10.equalsIgnoreCase(name)) {
			return pln10();
		}
		if ($act10.equalsIgnoreCase(name)) {
			return act10();
		}
		if ($pln11.equalsIgnoreCase(name)) {
			return pln11();
		}
		if ($act11.equalsIgnoreCase(name)) {
			return act11();
		}
		if ($pln12.equalsIgnoreCase(name)) {
			return pln12();
		}
		if ($act12.equalsIgnoreCase(name)) {
			return act12();
		}
		if ($pln13.equalsIgnoreCase(name)) {
			return pln13();
		}
		if ($act13.equalsIgnoreCase(name)) {
			return act13();
		}
		if ($pln14.equalsIgnoreCase(name)) {
			return pln14();
		}
		if ($act14.equalsIgnoreCase(name)) {
			return act14();
		}
		if ($pln15.equalsIgnoreCase(name)) {
			return pln15();
		}
		if ($act15.equalsIgnoreCase(name)) {
			return act15();
		}
		if ($pln16.equalsIgnoreCase(name)) {
			return pln16();
		}
		if ($act16.equalsIgnoreCase(name)) {
			return act16();
		}
		if ($pln17.equalsIgnoreCase(name)) {
			return pln17();
		}
		if ($act17.equalsIgnoreCase(name)) {
			return act17();
		}
		if ($pln18.equalsIgnoreCase(name)) {
			return pln18();
		}
		if ($act18.equalsIgnoreCase(name)) {
			return act18();
		}
		if ($pln19.equalsIgnoreCase(name)) {
			return pln19();
		}
		if ($act19.equalsIgnoreCase(name)) {
			return act19();
		}
		if ($pln20.equalsIgnoreCase(name)) {
			return pln20();
		}
		if ($act20.equalsIgnoreCase(name)) {
			return act20();
		}
		if ($pln21.equalsIgnoreCase(name)) {
			return pln21();
		}
		if ($act21.equalsIgnoreCase(name)) {
			return act21();
		}
		if ($pln22.equalsIgnoreCase(name)) {
			return pln22();
		}
		if ($act22.equalsIgnoreCase(name)) {
			return act22();
		}
		if ($pln23.equalsIgnoreCase(name)) {
			return pln23();
		}
		if ($act23.equalsIgnoreCase(name)) {
			return act23();
		}
		if ($pln24.equalsIgnoreCase(name)) {
			return pln24();
		}
		if ($act24.equalsIgnoreCase(name)) {
			return act24();
		}
		if ($pln25.equalsIgnoreCase(name)) {
			return pln25();
		}
		if ($act25.equalsIgnoreCase(name)) {
			return act25();
		}
		if ($pln26.equalsIgnoreCase(name)) {
			return pln26();
		}
		if ($act26.equalsIgnoreCase(name)) {
			return act26();
		}
		if ($pln27.equalsIgnoreCase(name)) {
			return pln27();
		}
		if ($act27.equalsIgnoreCase(name)) {
			return act27();
		}
		if ($pln28.equalsIgnoreCase(name)) {
			return pln28();
		}
		if ($act28.equalsIgnoreCase(name)) {
			return act28();
		}
		if ($pln29.equalsIgnoreCase(name)) {
			return pln29();
		}
		if ($act29.equalsIgnoreCase(name)) {
			return act29();
		}
		if ($pln30.equalsIgnoreCase(name)) {
			return pln30();
		}
		if ($act30.equalsIgnoreCase(name)) {
			return act30();
		}
		if ($pln31.equalsIgnoreCase(name)) {
			return pln31();
		}
		if ($act31.equalsIgnoreCase(name)) {
			return act31();
		}
		if ($pln32.equalsIgnoreCase(name)) {
			return pln32();
		}
		if ($act32.equalsIgnoreCase(name)) {
			return act32();
		}
		if ($pln33.equalsIgnoreCase(name)) {
			return pln33();
		}
		if ($act33.equalsIgnoreCase(name)) {
			return act33();
		}
		if ($pln34.equalsIgnoreCase(name)) {
			return pln34();
		}
		if ($act34.equalsIgnoreCase(name)) {
			return act34();
		}
		if ($pln35.equalsIgnoreCase(name)) {
			return pln35();
		}
		if ($act35.equalsIgnoreCase(name)) {
			return act35();
		}
		if ($pln36.equalsIgnoreCase(name)) {
			return pln36();
		}
		if ($act36.equalsIgnoreCase(name)) {
			return act36();
		}
		if ($pln37.equalsIgnoreCase(name)) {
			return pln37();
		}
		if ($act37.equalsIgnoreCase(name)) {
			return act37();
		}
		if ($pln38.equalsIgnoreCase(name)) {
			return pln38();
		}
		if ($act38.equalsIgnoreCase(name)) {
			return act38();
		}
		if ($pln39.equalsIgnoreCase(name)) {
			return pln39();
		}
		if ($act39.equalsIgnoreCase(name)) {
			return act39();
		}
		if ($pln40.equalsIgnoreCase(name)) {
			return pln40();
		}
		if ($act40.equalsIgnoreCase(name)) {
			return act40();
		}
		if ($pln41.equalsIgnoreCase(name)) {
			return pln41();
		}
		if ($act41.equalsIgnoreCase(name)) {
			return act41();
		}
		if ($pln42.equalsIgnoreCase(name)) {
			return pln42();
		}
		if ($act42.equalsIgnoreCase(name)) {
			return act42();
		}
		if ($pln43.equalsIgnoreCase(name)) {
			return pln43();
		}
		if ($act43.equalsIgnoreCase(name)) {
			return act43();
		}
		if ($pln44.equalsIgnoreCase(name)) {
			return pln44();
		}
		if ($act44.equalsIgnoreCase(name)) {
			return act44();
		}
		if ($pln45.equalsIgnoreCase(name)) {
			return pln45();
		}
		if ($act45.equalsIgnoreCase(name)) {
			return act45();
		}
		if ($pln46.equalsIgnoreCase(name)) {
			return pln46();
		}
		if ($act46.equalsIgnoreCase(name)) {
			return act46();
		}
		if ($pln47.equalsIgnoreCase(name)) {
			return pln47();
		}
		if ($act47.equalsIgnoreCase(name)) {
			return act47();
		}
		if ($pln48.equalsIgnoreCase(name)) {
			return pln48();
		}
		if ($act48.equalsIgnoreCase(name)) {
			return act48();
		}
		if ($pln49.equalsIgnoreCase(name)) {
			return pln49();
		}
		if ($act49.equalsIgnoreCase(name)) {
			return act49();
		}
		if ($pln50.equalsIgnoreCase(name)) {
			return pln50();
		}
		if ($act50.equalsIgnoreCase(name)) {
			return act50();
		}
		if ($pln51.equalsIgnoreCase(name)) {
			return pln51();
		}
		if ($act51.equalsIgnoreCase(name)) {
			return act51();
		}
		if ($pln52.equalsIgnoreCase(name)) {
			return pln52();
		}
		if ($act52.equalsIgnoreCase(name)) {
			return act52();
		}
		if ($pln53.equalsIgnoreCase(name)) {
			return pln53();
		}
		if ($act53.equalsIgnoreCase(name)) {
			return act53();
		}
		if ($pln54.equalsIgnoreCase(name)) {
			return pln54();
		}
		if ($act54.equalsIgnoreCase(name)) {
			return act54();
		}
		if ($pln55.equalsIgnoreCase(name)) {
			return pln55();
		}
		if ($act55.equalsIgnoreCase(name)) {
			return act55();
		}
		if ($pln56.equalsIgnoreCase(name)) {
			return pln56();
		}
		if ($act56.equalsIgnoreCase(name)) {
			return act56();
		}
		if ($pln57.equalsIgnoreCase(name)) {
			return pln57();
		}
		if ($act57.equalsIgnoreCase(name)) {
			return act57();
		}
		if ($pln58.equalsIgnoreCase(name)) {
			return pln58();
		}
		if ($act58.equalsIgnoreCase(name)) {
			return act58();
		}
		if ($pln59.equalsIgnoreCase(name)) {
			return pln59();
		}
		if ($act59.equalsIgnoreCase(name)) {
			return act59();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($trd_wg_cd.equalsIgnoreCase(name)) {
			return trd_wg_cd();
		}
		if ($trd_wg_nm.equalsIgnoreCase(name)) {
			return trd_wg_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($term00.equalsIgnoreCase(name)) {
			return term00();
		}
		if ($term01.equalsIgnoreCase(name)) {
			return term01();
		}
		if ($term02.equalsIgnoreCase(name)) {
			return term02();
		}
		if ($term03.equalsIgnoreCase(name)) {
			return term03();
		}
		if ($term04.equalsIgnoreCase(name)) {
			return term04();
		}
		if ($pln00.equalsIgnoreCase(name)) {
			return pln00();
		}
		if ($act00.equalsIgnoreCase(name)) {
			return act00();
		}
		if ($pln01.equalsIgnoreCase(name)) {
			return pln01();
		}
		if ($act01.equalsIgnoreCase(name)) {
			return act01();
		}
		if ($pln02.equalsIgnoreCase(name)) {
			return pln02();
		}
		if ($act02.equalsIgnoreCase(name)) {
			return act02();
		}
		if ($pln03.equalsIgnoreCase(name)) {
			return pln03();
		}
		if ($act03.equalsIgnoreCase(name)) {
			return act03();
		}
		if ($pln04.equalsIgnoreCase(name)) {
			return pln04();
		}
		if ($act04.equalsIgnoreCase(name)) {
			return act04();
		}
		if ($pln05.equalsIgnoreCase(name)) {
			return pln05();
		}
		if ($act05.equalsIgnoreCase(name)) {
			return act05();
		}
		if ($pln06.equalsIgnoreCase(name)) {
			return pln06();
		}
		if ($act06.equalsIgnoreCase(name)) {
			return act06();
		}
		if ($pln07.equalsIgnoreCase(name)) {
			return pln07();
		}
		if ($act07.equalsIgnoreCase(name)) {
			return act07();
		}
		if ($pln08.equalsIgnoreCase(name)) {
			return pln08();
		}
		if ($act08.equalsIgnoreCase(name)) {
			return act08();
		}
		if ($pln09.equalsIgnoreCase(name)) {
			return pln09();
		}
		if ($act09.equalsIgnoreCase(name)) {
			return act09();
		}
		if ($pln10.equalsIgnoreCase(name)) {
			return pln10();
		}
		if ($act10.equalsIgnoreCase(name)) {
			return act10();
		}
		if ($pln11.equalsIgnoreCase(name)) {
			return pln11();
		}
		if ($act11.equalsIgnoreCase(name)) {
			return act11();
		}
		if ($pln12.equalsIgnoreCase(name)) {
			return pln12();
		}
		if ($act12.equalsIgnoreCase(name)) {
			return act12();
		}
		if ($pln13.equalsIgnoreCase(name)) {
			return pln13();
		}
		if ($act13.equalsIgnoreCase(name)) {
			return act13();
		}
		if ($pln14.equalsIgnoreCase(name)) {
			return pln14();
		}
		if ($act14.equalsIgnoreCase(name)) {
			return act14();
		}
		if ($pln15.equalsIgnoreCase(name)) {
			return pln15();
		}
		if ($act15.equalsIgnoreCase(name)) {
			return act15();
		}
		if ($pln16.equalsIgnoreCase(name)) {
			return pln16();
		}
		if ($act16.equalsIgnoreCase(name)) {
			return act16();
		}
		if ($pln17.equalsIgnoreCase(name)) {
			return pln17();
		}
		if ($act17.equalsIgnoreCase(name)) {
			return act17();
		}
		if ($pln18.equalsIgnoreCase(name)) {
			return pln18();
		}
		if ($act18.equalsIgnoreCase(name)) {
			return act18();
		}
		if ($pln19.equalsIgnoreCase(name)) {
			return pln19();
		}
		if ($act19.equalsIgnoreCase(name)) {
			return act19();
		}
		if ($pln20.equalsIgnoreCase(name)) {
			return pln20();
		}
		if ($act20.equalsIgnoreCase(name)) {
			return act20();
		}
		if ($pln21.equalsIgnoreCase(name)) {
			return pln21();
		}
		if ($act21.equalsIgnoreCase(name)) {
			return act21();
		}
		if ($pln22.equalsIgnoreCase(name)) {
			return pln22();
		}
		if ($act22.equalsIgnoreCase(name)) {
			return act22();
		}
		if ($pln23.equalsIgnoreCase(name)) {
			return pln23();
		}
		if ($act23.equalsIgnoreCase(name)) {
			return act23();
		}
		if ($pln24.equalsIgnoreCase(name)) {
			return pln24();
		}
		if ($act24.equalsIgnoreCase(name)) {
			return act24();
		}
		if ($pln25.equalsIgnoreCase(name)) {
			return pln25();
		}
		if ($act25.equalsIgnoreCase(name)) {
			return act25();
		}
		if ($pln26.equalsIgnoreCase(name)) {
			return pln26();
		}
		if ($act26.equalsIgnoreCase(name)) {
			return act26();
		}
		if ($pln27.equalsIgnoreCase(name)) {
			return pln27();
		}
		if ($act27.equalsIgnoreCase(name)) {
			return act27();
		}
		if ($pln28.equalsIgnoreCase(name)) {
			return pln28();
		}
		if ($act28.equalsIgnoreCase(name)) {
			return act28();
		}
		if ($pln29.equalsIgnoreCase(name)) {
			return pln29();
		}
		if ($act29.equalsIgnoreCase(name)) {
			return act29();
		}
		if ($pln30.equalsIgnoreCase(name)) {
			return pln30();
		}
		if ($act30.equalsIgnoreCase(name)) {
			return act30();
		}
		if ($pln31.equalsIgnoreCase(name)) {
			return pln31();
		}
		if ($act31.equalsIgnoreCase(name)) {
			return act31();
		}
		if ($pln32.equalsIgnoreCase(name)) {
			return pln32();
		}
		if ($act32.equalsIgnoreCase(name)) {
			return act32();
		}
		if ($pln33.equalsIgnoreCase(name)) {
			return pln33();
		}
		if ($act33.equalsIgnoreCase(name)) {
			return act33();
		}
		if ($pln34.equalsIgnoreCase(name)) {
			return pln34();
		}
		if ($act34.equalsIgnoreCase(name)) {
			return act34();
		}
		if ($pln35.equalsIgnoreCase(name)) {
			return pln35();
		}
		if ($act35.equalsIgnoreCase(name)) {
			return act35();
		}
		if ($pln36.equalsIgnoreCase(name)) {
			return pln36();
		}
		if ($act36.equalsIgnoreCase(name)) {
			return act36();
		}
		if ($pln37.equalsIgnoreCase(name)) {
			return pln37();
		}
		if ($act37.equalsIgnoreCase(name)) {
			return act37();
		}
		if ($pln38.equalsIgnoreCase(name)) {
			return pln38();
		}
		if ($act38.equalsIgnoreCase(name)) {
			return act38();
		}
		if ($pln39.equalsIgnoreCase(name)) {
			return pln39();
		}
		if ($act39.equalsIgnoreCase(name)) {
			return act39();
		}
		if ($pln40.equalsIgnoreCase(name)) {
			return pln40();
		}
		if ($act40.equalsIgnoreCase(name)) {
			return act40();
		}
		if ($pln41.equalsIgnoreCase(name)) {
			return pln41();
		}
		if ($act41.equalsIgnoreCase(name)) {
			return act41();
		}
		if ($pln42.equalsIgnoreCase(name)) {
			return pln42();
		}
		if ($act42.equalsIgnoreCase(name)) {
			return act42();
		}
		if ($pln43.equalsIgnoreCase(name)) {
			return pln43();
		}
		if ($act43.equalsIgnoreCase(name)) {
			return act43();
		}
		if ($pln44.equalsIgnoreCase(name)) {
			return pln44();
		}
		if ($act44.equalsIgnoreCase(name)) {
			return act44();
		}
		if ($pln45.equalsIgnoreCase(name)) {
			return pln45();
		}
		if ($act45.equalsIgnoreCase(name)) {
			return act45();
		}
		if ($pln46.equalsIgnoreCase(name)) {
			return pln46();
		}
		if ($act46.equalsIgnoreCase(name)) {
			return act46();
		}
		if ($pln47.equalsIgnoreCase(name)) {
			return pln47();
		}
		if ($act47.equalsIgnoreCase(name)) {
			return act47();
		}
		if ($pln48.equalsIgnoreCase(name)) {
			return pln48();
		}
		if ($act48.equalsIgnoreCase(name)) {
			return act48();
		}
		if ($pln49.equalsIgnoreCase(name)) {
			return pln49();
		}
		if ($act49.equalsIgnoreCase(name)) {
			return act49();
		}
		if ($pln50.equalsIgnoreCase(name)) {
			return pln50();
		}
		if ($act50.equalsIgnoreCase(name)) {
			return act50();
		}
		if ($pln51.equalsIgnoreCase(name)) {
			return pln51();
		}
		if ($act51.equalsIgnoreCase(name)) {
			return act51();
		}
		if ($pln52.equalsIgnoreCase(name)) {
			return pln52();
		}
		if ($act52.equalsIgnoreCase(name)) {
			return act52();
		}
		if ($pln53.equalsIgnoreCase(name)) {
			return pln53();
		}
		if ($act53.equalsIgnoreCase(name)) {
			return act53();
		}
		if ($pln54.equalsIgnoreCase(name)) {
			return pln54();
		}
		if ($act54.equalsIgnoreCase(name)) {
			return act54();
		}
		if ($pln55.equalsIgnoreCase(name)) {
			return pln55();
		}
		if ($act55.equalsIgnoreCase(name)) {
			return act55();
		}
		if ($pln56.equalsIgnoreCase(name)) {
			return pln56();
		}
		if ($act56.equalsIgnoreCase(name)) {
			return act56();
		}
		if ($pln57.equalsIgnoreCase(name)) {
			return pln57();
		}
		if ($act57.equalsIgnoreCase(name)) {
			return act57();
		}
		if ($pln58.equalsIgnoreCase(name)) {
			return pln58();
		}
		if ($act58.equalsIgnoreCase(name)) {
			return act58();
		}
		if ($pln59.equalsIgnoreCase(name)) {
			return pln59();
		}
		if ($act59.equalsIgnoreCase(name)) {
			return act59();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($trd_wg_cd.equalsIgnoreCase(name)) {
			trd_wg_cd(value);
			return;
		}
		if ($trd_wg_nm.equalsIgnoreCase(name)) {
			trd_wg_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($term00.equalsIgnoreCase(name)) {
			term00(value);
			return;
		}
		if ($term01.equalsIgnoreCase(name)) {
			term01(value);
			return;
		}
		if ($term02.equalsIgnoreCase(name)) {
			term02(value);
			return;
		}
		if ($term03.equalsIgnoreCase(name)) {
			term03(value);
			return;
		}
		if ($term04.equalsIgnoreCase(name)) {
			term04(value);
			return;
		}
		if ($pln00.equalsIgnoreCase(name)) {
			pln00(value);
			return;
		}
		if ($act00.equalsIgnoreCase(name)) {
			act00(value);
			return;
		}
		if ($pln01.equalsIgnoreCase(name)) {
			pln01(value);
			return;
		}
		if ($act01.equalsIgnoreCase(name)) {
			act01(value);
			return;
		}
		if ($pln02.equalsIgnoreCase(name)) {
			pln02(value);
			return;
		}
		if ($act02.equalsIgnoreCase(name)) {
			act02(value);
			return;
		}
		if ($pln03.equalsIgnoreCase(name)) {
			pln03(value);
			return;
		}
		if ($act03.equalsIgnoreCase(name)) {
			act03(value);
			return;
		}
		if ($pln04.equalsIgnoreCase(name)) {
			pln04(value);
			return;
		}
		if ($act04.equalsIgnoreCase(name)) {
			act04(value);
			return;
		}
		if ($pln05.equalsIgnoreCase(name)) {
			pln05(value);
			return;
		}
		if ($act05.equalsIgnoreCase(name)) {
			act05(value);
			return;
		}
		if ($pln06.equalsIgnoreCase(name)) {
			pln06(value);
			return;
		}
		if ($act06.equalsIgnoreCase(name)) {
			act06(value);
			return;
		}
		if ($pln07.equalsIgnoreCase(name)) {
			pln07(value);
			return;
		}
		if ($act07.equalsIgnoreCase(name)) {
			act07(value);
			return;
		}
		if ($pln08.equalsIgnoreCase(name)) {
			pln08(value);
			return;
		}
		if ($act08.equalsIgnoreCase(name)) {
			act08(value);
			return;
		}
		if ($pln09.equalsIgnoreCase(name)) {
			pln09(value);
			return;
		}
		if ($act09.equalsIgnoreCase(name)) {
			act09(value);
			return;
		}
		if ($pln10.equalsIgnoreCase(name)) {
			pln10(value);
			return;
		}
		if ($act10.equalsIgnoreCase(name)) {
			act10(value);
			return;
		}
		if ($pln11.equalsIgnoreCase(name)) {
			pln11(value);
			return;
		}
		if ($act11.equalsIgnoreCase(name)) {
			act11(value);
			return;
		}
		if ($pln12.equalsIgnoreCase(name)) {
			pln12(value);
			return;
		}
		if ($act12.equalsIgnoreCase(name)) {
			act12(value);
			return;
		}
		if ($pln13.equalsIgnoreCase(name)) {
			pln13(value);
			return;
		}
		if ($act13.equalsIgnoreCase(name)) {
			act13(value);
			return;
		}
		if ($pln14.equalsIgnoreCase(name)) {
			pln14(value);
			return;
		}
		if ($act14.equalsIgnoreCase(name)) {
			act14(value);
			return;
		}
		if ($pln15.equalsIgnoreCase(name)) {
			pln15(value);
			return;
		}
		if ($act15.equalsIgnoreCase(name)) {
			act15(value);
			return;
		}
		if ($pln16.equalsIgnoreCase(name)) {
			pln16(value);
			return;
		}
		if ($act16.equalsIgnoreCase(name)) {
			act16(value);
			return;
		}
		if ($pln17.equalsIgnoreCase(name)) {
			pln17(value);
			return;
		}
		if ($act17.equalsIgnoreCase(name)) {
			act17(value);
			return;
		}
		if ($pln18.equalsIgnoreCase(name)) {
			pln18(value);
			return;
		}
		if ($act18.equalsIgnoreCase(name)) {
			act18(value);
			return;
		}
		if ($pln19.equalsIgnoreCase(name)) {
			pln19(value);
			return;
		}
		if ($act19.equalsIgnoreCase(name)) {
			act19(value);
			return;
		}
		if ($pln20.equalsIgnoreCase(name)) {
			pln20(value);
			return;
		}
		if ($act20.equalsIgnoreCase(name)) {
			act20(value);
			return;
		}
		if ($pln21.equalsIgnoreCase(name)) {
			pln21(value);
			return;
		}
		if ($act21.equalsIgnoreCase(name)) {
			act21(value);
			return;
		}
		if ($pln22.equalsIgnoreCase(name)) {
			pln22(value);
			return;
		}
		if ($act22.equalsIgnoreCase(name)) {
			act22(value);
			return;
		}
		if ($pln23.equalsIgnoreCase(name)) {
			pln23(value);
			return;
		}
		if ($act23.equalsIgnoreCase(name)) {
			act23(value);
			return;
		}
		if ($pln24.equalsIgnoreCase(name)) {
			pln24(value);
			return;
		}
		if ($act24.equalsIgnoreCase(name)) {
			act24(value);
			return;
		}
		if ($pln25.equalsIgnoreCase(name)) {
			pln25(value);
			return;
		}
		if ($act25.equalsIgnoreCase(name)) {
			act25(value);
			return;
		}
		if ($pln26.equalsIgnoreCase(name)) {
			pln26(value);
			return;
		}
		if ($act26.equalsIgnoreCase(name)) {
			act26(value);
			return;
		}
		if ($pln27.equalsIgnoreCase(name)) {
			pln27(value);
			return;
		}
		if ($act27.equalsIgnoreCase(name)) {
			act27(value);
			return;
		}
		if ($pln28.equalsIgnoreCase(name)) {
			pln28(value);
			return;
		}
		if ($act28.equalsIgnoreCase(name)) {
			act28(value);
			return;
		}
		if ($pln29.equalsIgnoreCase(name)) {
			pln29(value);
			return;
		}
		if ($act29.equalsIgnoreCase(name)) {
			act29(value);
			return;
		}
		if ($pln30.equalsIgnoreCase(name)) {
			pln30(value);
			return;
		}
		if ($act30.equalsIgnoreCase(name)) {
			act30(value);
			return;
		}
		if ($pln31.equalsIgnoreCase(name)) {
			pln31(value);
			return;
		}
		if ($act31.equalsIgnoreCase(name)) {
			act31(value);
			return;
		}
		if ($pln32.equalsIgnoreCase(name)) {
			pln32(value);
			return;
		}
		if ($act32.equalsIgnoreCase(name)) {
			act32(value);
			return;
		}
		if ($pln33.equalsIgnoreCase(name)) {
			pln33(value);
			return;
		}
		if ($act33.equalsIgnoreCase(name)) {
			act33(value);
			return;
		}
		if ($pln34.equalsIgnoreCase(name)) {
			pln34(value);
			return;
		}
		if ($act34.equalsIgnoreCase(name)) {
			act34(value);
			return;
		}
		if ($pln35.equalsIgnoreCase(name)) {
			pln35(value);
			return;
		}
		if ($act35.equalsIgnoreCase(name)) {
			act35(value);
			return;
		}
		if ($pln36.equalsIgnoreCase(name)) {
			pln36(value);
			return;
		}
		if ($act36.equalsIgnoreCase(name)) {
			act36(value);
			return;
		}
		if ($pln37.equalsIgnoreCase(name)) {
			pln37(value);
			return;
		}
		if ($act37.equalsIgnoreCase(name)) {
			act37(value);
			return;
		}
		if ($pln38.equalsIgnoreCase(name)) {
			pln38(value);
			return;
		}
		if ($act38.equalsIgnoreCase(name)) {
			act38(value);
			return;
		}
		if ($pln39.equalsIgnoreCase(name)) {
			pln39(value);
			return;
		}
		if ($act39.equalsIgnoreCase(name)) {
			act39(value);
			return;
		}
		if ($pln40.equalsIgnoreCase(name)) {
			pln40(value);
			return;
		}
		if ($act40.equalsIgnoreCase(name)) {
			act40(value);
			return;
		}
		if ($pln41.equalsIgnoreCase(name)) {
			pln41(value);
			return;
		}
		if ($act41.equalsIgnoreCase(name)) {
			act41(value);
			return;
		}
		if ($pln42.equalsIgnoreCase(name)) {
			pln42(value);
			return;
		}
		if ($act42.equalsIgnoreCase(name)) {
			act42(value);
			return;
		}
		if ($pln43.equalsIgnoreCase(name)) {
			pln43(value);
			return;
		}
		if ($act43.equalsIgnoreCase(name)) {
			act43(value);
			return;
		}
		if ($pln44.equalsIgnoreCase(name)) {
			pln44(value);
			return;
		}
		if ($act44.equalsIgnoreCase(name)) {
			act44(value);
			return;
		}
		if ($pln45.equalsIgnoreCase(name)) {
			pln45(value);
			return;
		}
		if ($act45.equalsIgnoreCase(name)) {
			act45(value);
			return;
		}
		if ($pln46.equalsIgnoreCase(name)) {
			pln46(value);
			return;
		}
		if ($act46.equalsIgnoreCase(name)) {
			act46(value);
			return;
		}
		if ($pln47.equalsIgnoreCase(name)) {
			pln47(value);
			return;
		}
		if ($act47.equalsIgnoreCase(name)) {
			act47(value);
			return;
		}
		if ($pln48.equalsIgnoreCase(name)) {
			pln48(value);
			return;
		}
		if ($act48.equalsIgnoreCase(name)) {
			act48(value);
			return;
		}
		if ($pln49.equalsIgnoreCase(name)) {
			pln49(value);
			return;
		}
		if ($act49.equalsIgnoreCase(name)) {
			act49(value);
			return;
		}
		if ($pln50.equalsIgnoreCase(name)) {
			pln50(value);
			return;
		}
		if ($act50.equalsIgnoreCase(name)) {
			act50(value);
			return;
		}
		if ($pln51.equalsIgnoreCase(name)) {
			pln51(value);
			return;
		}
		if ($act51.equalsIgnoreCase(name)) {
			act51(value);
			return;
		}
		if ($pln52.equalsIgnoreCase(name)) {
			pln52(value);
			return;
		}
		if ($act52.equalsIgnoreCase(name)) {
			act52(value);
			return;
		}
		if ($pln53.equalsIgnoreCase(name)) {
			pln53(value);
			return;
		}
		if ($act53.equalsIgnoreCase(name)) {
			act53(value);
			return;
		}
		if ($pln54.equalsIgnoreCase(name)) {
			pln54(value);
			return;
		}
		if ($act54.equalsIgnoreCase(name)) {
			act54(value);
			return;
		}
		if ($pln55.equalsIgnoreCase(name)) {
			pln55(value);
			return;
		}
		if ($act55.equalsIgnoreCase(name)) {
			act55(value);
			return;
		}
		if ($pln56.equalsIgnoreCase(name)) {
			pln56(value);
			return;
		}
		if ($act56.equalsIgnoreCase(name)) {
			act56(value);
			return;
		}
		if ($pln57.equalsIgnoreCase(name)) {
			pln57(value);
			return;
		}
		if ($act57.equalsIgnoreCase(name)) {
			act57(value);
			return;
		}
		if ($pln58.equalsIgnoreCase(name)) {
			pln58(value);
			return;
		}
		if ($act58.equalsIgnoreCase(name)) {
			act58(value);
			return;
		}
		if ($pln59.equalsIgnoreCase(name)) {
			pln59(value);
			return;
		}
		if ($act59.equalsIgnoreCase(name)) {
			act59(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($term00.equalsIgnoreCase(name)) {
			term00(value);
			return;
		}
		if ($term01.equalsIgnoreCase(name)) {
			term01(value);
			return;
		}
		if ($term02.equalsIgnoreCase(name)) {
			term02(value);
			return;
		}
		if ($term03.equalsIgnoreCase(name)) {
			term03(value);
			return;
		}
		if ($term04.equalsIgnoreCase(name)) {
			term04(value);
			return;
		}
		if ($pln00.equalsIgnoreCase(name)) {
			pln00(value);
			return;
		}
		if ($act00.equalsIgnoreCase(name)) {
			act00(value);
			return;
		}
		if ($pln01.equalsIgnoreCase(name)) {
			pln01(value);
			return;
		}
		if ($act01.equalsIgnoreCase(name)) {
			act01(value);
			return;
		}
		if ($pln02.equalsIgnoreCase(name)) {
			pln02(value);
			return;
		}
		if ($act02.equalsIgnoreCase(name)) {
			act02(value);
			return;
		}
		if ($pln03.equalsIgnoreCase(name)) {
			pln03(value);
			return;
		}
		if ($act03.equalsIgnoreCase(name)) {
			act03(value);
			return;
		}
		if ($pln04.equalsIgnoreCase(name)) {
			pln04(value);
			return;
		}
		if ($act04.equalsIgnoreCase(name)) {
			act04(value);
			return;
		}
		if ($pln05.equalsIgnoreCase(name)) {
			pln05(value);
			return;
		}
		if ($act05.equalsIgnoreCase(name)) {
			act05(value);
			return;
		}
		if ($pln06.equalsIgnoreCase(name)) {
			pln06(value);
			return;
		}
		if ($act06.equalsIgnoreCase(name)) {
			act06(value);
			return;
		}
		if ($pln07.equalsIgnoreCase(name)) {
			pln07(value);
			return;
		}
		if ($act07.equalsIgnoreCase(name)) {
			act07(value);
			return;
		}
		if ($pln08.equalsIgnoreCase(name)) {
			pln08(value);
			return;
		}
		if ($act08.equalsIgnoreCase(name)) {
			act08(value);
			return;
		}
		if ($pln09.equalsIgnoreCase(name)) {
			pln09(value);
			return;
		}
		if ($act09.equalsIgnoreCase(name)) {
			act09(value);
			return;
		}
		if ($pln10.equalsIgnoreCase(name)) {
			pln10(value);
			return;
		}
		if ($act10.equalsIgnoreCase(name)) {
			act10(value);
			return;
		}
		if ($pln11.equalsIgnoreCase(name)) {
			pln11(value);
			return;
		}
		if ($act11.equalsIgnoreCase(name)) {
			act11(value);
			return;
		}
		if ($pln12.equalsIgnoreCase(name)) {
			pln12(value);
			return;
		}
		if ($act12.equalsIgnoreCase(name)) {
			act12(value);
			return;
		}
		if ($pln13.equalsIgnoreCase(name)) {
			pln13(value);
			return;
		}
		if ($act13.equalsIgnoreCase(name)) {
			act13(value);
			return;
		}
		if ($pln14.equalsIgnoreCase(name)) {
			pln14(value);
			return;
		}
		if ($act14.equalsIgnoreCase(name)) {
			act14(value);
			return;
		}
		if ($pln15.equalsIgnoreCase(name)) {
			pln15(value);
			return;
		}
		if ($act15.equalsIgnoreCase(name)) {
			act15(value);
			return;
		}
		if ($pln16.equalsIgnoreCase(name)) {
			pln16(value);
			return;
		}
		if ($act16.equalsIgnoreCase(name)) {
			act16(value);
			return;
		}
		if ($pln17.equalsIgnoreCase(name)) {
			pln17(value);
			return;
		}
		if ($act17.equalsIgnoreCase(name)) {
			act17(value);
			return;
		}
		if ($pln18.equalsIgnoreCase(name)) {
			pln18(value);
			return;
		}
		if ($act18.equalsIgnoreCase(name)) {
			act18(value);
			return;
		}
		if ($pln19.equalsIgnoreCase(name)) {
			pln19(value);
			return;
		}
		if ($act19.equalsIgnoreCase(name)) {
			act19(value);
			return;
		}
		if ($pln20.equalsIgnoreCase(name)) {
			pln20(value);
			return;
		}
		if ($act20.equalsIgnoreCase(name)) {
			act20(value);
			return;
		}
		if ($pln21.equalsIgnoreCase(name)) {
			pln21(value);
			return;
		}
		if ($act21.equalsIgnoreCase(name)) {
			act21(value);
			return;
		}
		if ($pln22.equalsIgnoreCase(name)) {
			pln22(value);
			return;
		}
		if ($act22.equalsIgnoreCase(name)) {
			act22(value);
			return;
		}
		if ($pln23.equalsIgnoreCase(name)) {
			pln23(value);
			return;
		}
		if ($act23.equalsIgnoreCase(name)) {
			act23(value);
			return;
		}
		if ($pln24.equalsIgnoreCase(name)) {
			pln24(value);
			return;
		}
		if ($act24.equalsIgnoreCase(name)) {
			act24(value);
			return;
		}
		if ($pln25.equalsIgnoreCase(name)) {
			pln25(value);
			return;
		}
		if ($act25.equalsIgnoreCase(name)) {
			act25(value);
			return;
		}
		if ($pln26.equalsIgnoreCase(name)) {
			pln26(value);
			return;
		}
		if ($act26.equalsIgnoreCase(name)) {
			act26(value);
			return;
		}
		if ($pln27.equalsIgnoreCase(name)) {
			pln27(value);
			return;
		}
		if ($act27.equalsIgnoreCase(name)) {
			act27(value);
			return;
		}
		if ($pln28.equalsIgnoreCase(name)) {
			pln28(value);
			return;
		}
		if ($act28.equalsIgnoreCase(name)) {
			act28(value);
			return;
		}
		if ($pln29.equalsIgnoreCase(name)) {
			pln29(value);
			return;
		}
		if ($act29.equalsIgnoreCase(name)) {
			act29(value);
			return;
		}
		if ($pln30.equalsIgnoreCase(name)) {
			pln30(value);
			return;
		}
		if ($act30.equalsIgnoreCase(name)) {
			act30(value);
			return;
		}
		if ($pln31.equalsIgnoreCase(name)) {
			pln31(value);
			return;
		}
		if ($act31.equalsIgnoreCase(name)) {
			act31(value);
			return;
		}
		if ($pln32.equalsIgnoreCase(name)) {
			pln32(value);
			return;
		}
		if ($act32.equalsIgnoreCase(name)) {
			act32(value);
			return;
		}
		if ($pln33.equalsIgnoreCase(name)) {
			pln33(value);
			return;
		}
		if ($act33.equalsIgnoreCase(name)) {
			act33(value);
			return;
		}
		if ($pln34.equalsIgnoreCase(name)) {
			pln34(value);
			return;
		}
		if ($act34.equalsIgnoreCase(name)) {
			act34(value);
			return;
		}
		if ($pln35.equalsIgnoreCase(name)) {
			pln35(value);
			return;
		}
		if ($act35.equalsIgnoreCase(name)) {
			act35(value);
			return;
		}
		if ($pln36.equalsIgnoreCase(name)) {
			pln36(value);
			return;
		}
		if ($act36.equalsIgnoreCase(name)) {
			act36(value);
			return;
		}
		if ($pln37.equalsIgnoreCase(name)) {
			pln37(value);
			return;
		}
		if ($act37.equalsIgnoreCase(name)) {
			act37(value);
			return;
		}
		if ($pln38.equalsIgnoreCase(name)) {
			pln38(value);
			return;
		}
		if ($act38.equalsIgnoreCase(name)) {
			act38(value);
			return;
		}
		if ($pln39.equalsIgnoreCase(name)) {
			pln39(value);
			return;
		}
		if ($act39.equalsIgnoreCase(name)) {
			act39(value);
			return;
		}
		if ($pln40.equalsIgnoreCase(name)) {
			pln40(value);
			return;
		}
		if ($act40.equalsIgnoreCase(name)) {
			act40(value);
			return;
		}
		if ($pln41.equalsIgnoreCase(name)) {
			pln41(value);
			return;
		}
		if ($act41.equalsIgnoreCase(name)) {
			act41(value);
			return;
		}
		if ($pln42.equalsIgnoreCase(name)) {
			pln42(value);
			return;
		}
		if ($act42.equalsIgnoreCase(name)) {
			act42(value);
			return;
		}
		if ($pln43.equalsIgnoreCase(name)) {
			pln43(value);
			return;
		}
		if ($act43.equalsIgnoreCase(name)) {
			act43(value);
			return;
		}
		if ($pln44.equalsIgnoreCase(name)) {
			pln44(value);
			return;
		}
		if ($act44.equalsIgnoreCase(name)) {
			act44(value);
			return;
		}
		if ($pln45.equalsIgnoreCase(name)) {
			pln45(value);
			return;
		}
		if ($act45.equalsIgnoreCase(name)) {
			act45(value);
			return;
		}
		if ($pln46.equalsIgnoreCase(name)) {
			pln46(value);
			return;
		}
		if ($act46.equalsIgnoreCase(name)) {
			act46(value);
			return;
		}
		if ($pln47.equalsIgnoreCase(name)) {
			pln47(value);
			return;
		}
		if ($act47.equalsIgnoreCase(name)) {
			act47(value);
			return;
		}
		if ($pln48.equalsIgnoreCase(name)) {
			pln48(value);
			return;
		}
		if ($act48.equalsIgnoreCase(name)) {
			act48(value);
			return;
		}
		if ($pln49.equalsIgnoreCase(name)) {
			pln49(value);
			return;
		}
		if ($act49.equalsIgnoreCase(name)) {
			act49(value);
			return;
		}
		if ($pln50.equalsIgnoreCase(name)) {
			pln50(value);
			return;
		}
		if ($act50.equalsIgnoreCase(name)) {
			act50(value);
			return;
		}
		if ($pln51.equalsIgnoreCase(name)) {
			pln51(value);
			return;
		}
		if ($act51.equalsIgnoreCase(name)) {
			act51(value);
			return;
		}
		if ($pln52.equalsIgnoreCase(name)) {
			pln52(value);
			return;
		}
		if ($act52.equalsIgnoreCase(name)) {
			act52(value);
			return;
		}
		if ($pln53.equalsIgnoreCase(name)) {
			pln53(value);
			return;
		}
		if ($act53.equalsIgnoreCase(name)) {
			act53(value);
			return;
		}
		if ($pln54.equalsIgnoreCase(name)) {
			pln54(value);
			return;
		}
		if ($act54.equalsIgnoreCase(name)) {
			act54(value);
			return;
		}
		if ($pln55.equalsIgnoreCase(name)) {
			pln55(value);
			return;
		}
		if ($act55.equalsIgnoreCase(name)) {
			act55(value);
			return;
		}
		if ($pln56.equalsIgnoreCase(name)) {
			pln56(value);
			return;
		}
		if ($act56.equalsIgnoreCase(name)) {
			act56(value);
			return;
		}
		if ($pln57.equalsIgnoreCase(name)) {
			pln57(value);
			return;
		}
		if ($act57.equalsIgnoreCase(name)) {
			act57(value);
			return;
		}
		if ($pln58.equalsIgnoreCase(name)) {
			pln58(value);
			return;
		}
		if ($act58.equalsIgnoreCase(name)) {
			act58(value);
			return;
		}
		if ($pln59.equalsIgnoreCase(name)) {
			pln59(value);
			return;
		}
		if ($act59.equalsIgnoreCase(name)) {
			act59(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($term00.equalsIgnoreCase(name)) {
			term00(value);
			return;
		}
		if ($term01.equalsIgnoreCase(name)) {
			term01(value);
			return;
		}
		if ($term02.equalsIgnoreCase(name)) {
			term02(value);
			return;
		}
		if ($term03.equalsIgnoreCase(name)) {
			term03(value);
			return;
		}
		if ($term04.equalsIgnoreCase(name)) {
			term04(value);
			return;
		}
		if ($pln00.equalsIgnoreCase(name)) {
			pln00(value);
			return;
		}
		if ($act00.equalsIgnoreCase(name)) {
			act00(value);
			return;
		}
		if ($pln01.equalsIgnoreCase(name)) {
			pln01(value);
			return;
		}
		if ($act01.equalsIgnoreCase(name)) {
			act01(value);
			return;
		}
		if ($pln02.equalsIgnoreCase(name)) {
			pln02(value);
			return;
		}
		if ($act02.equalsIgnoreCase(name)) {
			act02(value);
			return;
		}
		if ($pln03.equalsIgnoreCase(name)) {
			pln03(value);
			return;
		}
		if ($act03.equalsIgnoreCase(name)) {
			act03(value);
			return;
		}
		if ($pln04.equalsIgnoreCase(name)) {
			pln04(value);
			return;
		}
		if ($act04.equalsIgnoreCase(name)) {
			act04(value);
			return;
		}
		if ($pln05.equalsIgnoreCase(name)) {
			pln05(value);
			return;
		}
		if ($act05.equalsIgnoreCase(name)) {
			act05(value);
			return;
		}
		if ($pln06.equalsIgnoreCase(name)) {
			pln06(value);
			return;
		}
		if ($act06.equalsIgnoreCase(name)) {
			act06(value);
			return;
		}
		if ($pln07.equalsIgnoreCase(name)) {
			pln07(value);
			return;
		}
		if ($act07.equalsIgnoreCase(name)) {
			act07(value);
			return;
		}
		if ($pln08.equalsIgnoreCase(name)) {
			pln08(value);
			return;
		}
		if ($act08.equalsIgnoreCase(name)) {
			act08(value);
			return;
		}
		if ($pln09.equalsIgnoreCase(name)) {
			pln09(value);
			return;
		}
		if ($act09.equalsIgnoreCase(name)) {
			act09(value);
			return;
		}
		if ($pln10.equalsIgnoreCase(name)) {
			pln10(value);
			return;
		}
		if ($act10.equalsIgnoreCase(name)) {
			act10(value);
			return;
		}
		if ($pln11.equalsIgnoreCase(name)) {
			pln11(value);
			return;
		}
		if ($act11.equalsIgnoreCase(name)) {
			act11(value);
			return;
		}
		if ($pln12.equalsIgnoreCase(name)) {
			pln12(value);
			return;
		}
		if ($act12.equalsIgnoreCase(name)) {
			act12(value);
			return;
		}
		if ($pln13.equalsIgnoreCase(name)) {
			pln13(value);
			return;
		}
		if ($act13.equalsIgnoreCase(name)) {
			act13(value);
			return;
		}
		if ($pln14.equalsIgnoreCase(name)) {
			pln14(value);
			return;
		}
		if ($act14.equalsIgnoreCase(name)) {
			act14(value);
			return;
		}
		if ($pln15.equalsIgnoreCase(name)) {
			pln15(value);
			return;
		}
		if ($act15.equalsIgnoreCase(name)) {
			act15(value);
			return;
		}
		if ($pln16.equalsIgnoreCase(name)) {
			pln16(value);
			return;
		}
		if ($act16.equalsIgnoreCase(name)) {
			act16(value);
			return;
		}
		if ($pln17.equalsIgnoreCase(name)) {
			pln17(value);
			return;
		}
		if ($act17.equalsIgnoreCase(name)) {
			act17(value);
			return;
		}
		if ($pln18.equalsIgnoreCase(name)) {
			pln18(value);
			return;
		}
		if ($act18.equalsIgnoreCase(name)) {
			act18(value);
			return;
		}
		if ($pln19.equalsIgnoreCase(name)) {
			pln19(value);
			return;
		}
		if ($act19.equalsIgnoreCase(name)) {
			act19(value);
			return;
		}
		if ($pln20.equalsIgnoreCase(name)) {
			pln20(value);
			return;
		}
		if ($act20.equalsIgnoreCase(name)) {
			act20(value);
			return;
		}
		if ($pln21.equalsIgnoreCase(name)) {
			pln21(value);
			return;
		}
		if ($act21.equalsIgnoreCase(name)) {
			act21(value);
			return;
		}
		if ($pln22.equalsIgnoreCase(name)) {
			pln22(value);
			return;
		}
		if ($act22.equalsIgnoreCase(name)) {
			act22(value);
			return;
		}
		if ($pln23.equalsIgnoreCase(name)) {
			pln23(value);
			return;
		}
		if ($act23.equalsIgnoreCase(name)) {
			act23(value);
			return;
		}
		if ($pln24.equalsIgnoreCase(name)) {
			pln24(value);
			return;
		}
		if ($act24.equalsIgnoreCase(name)) {
			act24(value);
			return;
		}
		if ($pln25.equalsIgnoreCase(name)) {
			pln25(value);
			return;
		}
		if ($act25.equalsIgnoreCase(name)) {
			act25(value);
			return;
		}
		if ($pln26.equalsIgnoreCase(name)) {
			pln26(value);
			return;
		}
		if ($act26.equalsIgnoreCase(name)) {
			act26(value);
			return;
		}
		if ($pln27.equalsIgnoreCase(name)) {
			pln27(value);
			return;
		}
		if ($act27.equalsIgnoreCase(name)) {
			act27(value);
			return;
		}
		if ($pln28.equalsIgnoreCase(name)) {
			pln28(value);
			return;
		}
		if ($act28.equalsIgnoreCase(name)) {
			act28(value);
			return;
		}
		if ($pln29.equalsIgnoreCase(name)) {
			pln29(value);
			return;
		}
		if ($act29.equalsIgnoreCase(name)) {
			act29(value);
			return;
		}
		if ($pln30.equalsIgnoreCase(name)) {
			pln30(value);
			return;
		}
		if ($act30.equalsIgnoreCase(name)) {
			act30(value);
			return;
		}
		if ($pln31.equalsIgnoreCase(name)) {
			pln31(value);
			return;
		}
		if ($act31.equalsIgnoreCase(name)) {
			act31(value);
			return;
		}
		if ($pln32.equalsIgnoreCase(name)) {
			pln32(value);
			return;
		}
		if ($act32.equalsIgnoreCase(name)) {
			act32(value);
			return;
		}
		if ($pln33.equalsIgnoreCase(name)) {
			pln33(value);
			return;
		}
		if ($act33.equalsIgnoreCase(name)) {
			act33(value);
			return;
		}
		if ($pln34.equalsIgnoreCase(name)) {
			pln34(value);
			return;
		}
		if ($act34.equalsIgnoreCase(name)) {
			act34(value);
			return;
		}
		if ($pln35.equalsIgnoreCase(name)) {
			pln35(value);
			return;
		}
		if ($act35.equalsIgnoreCase(name)) {
			act35(value);
			return;
		}
		if ($pln36.equalsIgnoreCase(name)) {
			pln36(value);
			return;
		}
		if ($act36.equalsIgnoreCase(name)) {
			act36(value);
			return;
		}
		if ($pln37.equalsIgnoreCase(name)) {
			pln37(value);
			return;
		}
		if ($act37.equalsIgnoreCase(name)) {
			act37(value);
			return;
		}
		if ($pln38.equalsIgnoreCase(name)) {
			pln38(value);
			return;
		}
		if ($act38.equalsIgnoreCase(name)) {
			act38(value);
			return;
		}
		if ($pln39.equalsIgnoreCase(name)) {
			pln39(value);
			return;
		}
		if ($act39.equalsIgnoreCase(name)) {
			act39(value);
			return;
		}
		if ($pln40.equalsIgnoreCase(name)) {
			pln40(value);
			return;
		}
		if ($act40.equalsIgnoreCase(name)) {
			act40(value);
			return;
		}
		if ($pln41.equalsIgnoreCase(name)) {
			pln41(value);
			return;
		}
		if ($act41.equalsIgnoreCase(name)) {
			act41(value);
			return;
		}
		if ($pln42.equalsIgnoreCase(name)) {
			pln42(value);
			return;
		}
		if ($act42.equalsIgnoreCase(name)) {
			act42(value);
			return;
		}
		if ($pln43.equalsIgnoreCase(name)) {
			pln43(value);
			return;
		}
		if ($act43.equalsIgnoreCase(name)) {
			act43(value);
			return;
		}
		if ($pln44.equalsIgnoreCase(name)) {
			pln44(value);
			return;
		}
		if ($act44.equalsIgnoreCase(name)) {
			act44(value);
			return;
		}
		if ($pln45.equalsIgnoreCase(name)) {
			pln45(value);
			return;
		}
		if ($act45.equalsIgnoreCase(name)) {
			act45(value);
			return;
		}
		if ($pln46.equalsIgnoreCase(name)) {
			pln46(value);
			return;
		}
		if ($act46.equalsIgnoreCase(name)) {
			act46(value);
			return;
		}
		if ($pln47.equalsIgnoreCase(name)) {
			pln47(value);
			return;
		}
		if ($act47.equalsIgnoreCase(name)) {
			act47(value);
			return;
		}
		if ($pln48.equalsIgnoreCase(name)) {
			pln48(value);
			return;
		}
		if ($act48.equalsIgnoreCase(name)) {
			act48(value);
			return;
		}
		if ($pln49.equalsIgnoreCase(name)) {
			pln49(value);
			return;
		}
		if ($act49.equalsIgnoreCase(name)) {
			act49(value);
			return;
		}
		if ($pln50.equalsIgnoreCase(name)) {
			pln50(value);
			return;
		}
		if ($act50.equalsIgnoreCase(name)) {
			act50(value);
			return;
		}
		if ($pln51.equalsIgnoreCase(name)) {
			pln51(value);
			return;
		}
		if ($act51.equalsIgnoreCase(name)) {
			act51(value);
			return;
		}
		if ($pln52.equalsIgnoreCase(name)) {
			pln52(value);
			return;
		}
		if ($act52.equalsIgnoreCase(name)) {
			act52(value);
			return;
		}
		if ($pln53.equalsIgnoreCase(name)) {
			pln53(value);
			return;
		}
		if ($act53.equalsIgnoreCase(name)) {
			act53(value);
			return;
		}
		if ($pln54.equalsIgnoreCase(name)) {
			pln54(value);
			return;
		}
		if ($act54.equalsIgnoreCase(name)) {
			act54(value);
			return;
		}
		if ($pln55.equalsIgnoreCase(name)) {
			pln55(value);
			return;
		}
		if ($act55.equalsIgnoreCase(name)) {
			act55(value);
			return;
		}
		if ($pln56.equalsIgnoreCase(name)) {
			pln56(value);
			return;
		}
		if ($act56.equalsIgnoreCase(name)) {
			act56(value);
			return;
		}
		if ($pln57.equalsIgnoreCase(name)) {
			pln57(value);
			return;
		}
		if ($act57.equalsIgnoreCase(name)) {
			act57(value);
			return;
		}
		if ($pln58.equalsIgnoreCase(name)) {
			pln58(value);
			return;
		}
		if ($act58.equalsIgnoreCase(name)) {
			act58(value);
			return;
		}
		if ($pln59.equalsIgnoreCase(name)) {
			pln59(value);
			return;
		}
		if ($act59.equalsIgnoreCase(name)) {
			act59(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($term00.equalsIgnoreCase(name)) {
			term00(value);
			return;
		}
		if ($term01.equalsIgnoreCase(name)) {
			term01(value);
			return;
		}
		if ($term02.equalsIgnoreCase(name)) {
			term02(value);
			return;
		}
		if ($term03.equalsIgnoreCase(name)) {
			term03(value);
			return;
		}
		if ($term04.equalsIgnoreCase(name)) {
			term04(value);
			return;
		}
		if ($pln00.equalsIgnoreCase(name)) {
			pln00(value);
			return;
		}
		if ($act00.equalsIgnoreCase(name)) {
			act00(value);
			return;
		}
		if ($pln01.equalsIgnoreCase(name)) {
			pln01(value);
			return;
		}
		if ($act01.equalsIgnoreCase(name)) {
			act01(value);
			return;
		}
		if ($pln02.equalsIgnoreCase(name)) {
			pln02(value);
			return;
		}
		if ($act02.equalsIgnoreCase(name)) {
			act02(value);
			return;
		}
		if ($pln03.equalsIgnoreCase(name)) {
			pln03(value);
			return;
		}
		if ($act03.equalsIgnoreCase(name)) {
			act03(value);
			return;
		}
		if ($pln04.equalsIgnoreCase(name)) {
			pln04(value);
			return;
		}
		if ($act04.equalsIgnoreCase(name)) {
			act04(value);
			return;
		}
		if ($pln05.equalsIgnoreCase(name)) {
			pln05(value);
			return;
		}
		if ($act05.equalsIgnoreCase(name)) {
			act05(value);
			return;
		}
		if ($pln06.equalsIgnoreCase(name)) {
			pln06(value);
			return;
		}
		if ($act06.equalsIgnoreCase(name)) {
			act06(value);
			return;
		}
		if ($pln07.equalsIgnoreCase(name)) {
			pln07(value);
			return;
		}
		if ($act07.equalsIgnoreCase(name)) {
			act07(value);
			return;
		}
		if ($pln08.equalsIgnoreCase(name)) {
			pln08(value);
			return;
		}
		if ($act08.equalsIgnoreCase(name)) {
			act08(value);
			return;
		}
		if ($pln09.equalsIgnoreCase(name)) {
			pln09(value);
			return;
		}
		if ($act09.equalsIgnoreCase(name)) {
			act09(value);
			return;
		}
		if ($pln10.equalsIgnoreCase(name)) {
			pln10(value);
			return;
		}
		if ($act10.equalsIgnoreCase(name)) {
			act10(value);
			return;
		}
		if ($pln11.equalsIgnoreCase(name)) {
			pln11(value);
			return;
		}
		if ($act11.equalsIgnoreCase(name)) {
			act11(value);
			return;
		}
		if ($pln12.equalsIgnoreCase(name)) {
			pln12(value);
			return;
		}
		if ($act12.equalsIgnoreCase(name)) {
			act12(value);
			return;
		}
		if ($pln13.equalsIgnoreCase(name)) {
			pln13(value);
			return;
		}
		if ($act13.equalsIgnoreCase(name)) {
			act13(value);
			return;
		}
		if ($pln14.equalsIgnoreCase(name)) {
			pln14(value);
			return;
		}
		if ($act14.equalsIgnoreCase(name)) {
			act14(value);
			return;
		}
		if ($pln15.equalsIgnoreCase(name)) {
			pln15(value);
			return;
		}
		if ($act15.equalsIgnoreCase(name)) {
			act15(value);
			return;
		}
		if ($pln16.equalsIgnoreCase(name)) {
			pln16(value);
			return;
		}
		if ($act16.equalsIgnoreCase(name)) {
			act16(value);
			return;
		}
		if ($pln17.equalsIgnoreCase(name)) {
			pln17(value);
			return;
		}
		if ($act17.equalsIgnoreCase(name)) {
			act17(value);
			return;
		}
		if ($pln18.equalsIgnoreCase(name)) {
			pln18(value);
			return;
		}
		if ($act18.equalsIgnoreCase(name)) {
			act18(value);
			return;
		}
		if ($pln19.equalsIgnoreCase(name)) {
			pln19(value);
			return;
		}
		if ($act19.equalsIgnoreCase(name)) {
			act19(value);
			return;
		}
		if ($pln20.equalsIgnoreCase(name)) {
			pln20(value);
			return;
		}
		if ($act20.equalsIgnoreCase(name)) {
			act20(value);
			return;
		}
		if ($pln21.equalsIgnoreCase(name)) {
			pln21(value);
			return;
		}
		if ($act21.equalsIgnoreCase(name)) {
			act21(value);
			return;
		}
		if ($pln22.equalsIgnoreCase(name)) {
			pln22(value);
			return;
		}
		if ($act22.equalsIgnoreCase(name)) {
			act22(value);
			return;
		}
		if ($pln23.equalsIgnoreCase(name)) {
			pln23(value);
			return;
		}
		if ($act23.equalsIgnoreCase(name)) {
			act23(value);
			return;
		}
		if ($pln24.equalsIgnoreCase(name)) {
			pln24(value);
			return;
		}
		if ($act24.equalsIgnoreCase(name)) {
			act24(value);
			return;
		}
		if ($pln25.equalsIgnoreCase(name)) {
			pln25(value);
			return;
		}
		if ($act25.equalsIgnoreCase(name)) {
			act25(value);
			return;
		}
		if ($pln26.equalsIgnoreCase(name)) {
			pln26(value);
			return;
		}
		if ($act26.equalsIgnoreCase(name)) {
			act26(value);
			return;
		}
		if ($pln27.equalsIgnoreCase(name)) {
			pln27(value);
			return;
		}
		if ($act27.equalsIgnoreCase(name)) {
			act27(value);
			return;
		}
		if ($pln28.equalsIgnoreCase(name)) {
			pln28(value);
			return;
		}
		if ($act28.equalsIgnoreCase(name)) {
			act28(value);
			return;
		}
		if ($pln29.equalsIgnoreCase(name)) {
			pln29(value);
			return;
		}
		if ($act29.equalsIgnoreCase(name)) {
			act29(value);
			return;
		}
		if ($pln30.equalsIgnoreCase(name)) {
			pln30(value);
			return;
		}
		if ($act30.equalsIgnoreCase(name)) {
			act30(value);
			return;
		}
		if ($pln31.equalsIgnoreCase(name)) {
			pln31(value);
			return;
		}
		if ($act31.equalsIgnoreCase(name)) {
			act31(value);
			return;
		}
		if ($pln32.equalsIgnoreCase(name)) {
			pln32(value);
			return;
		}
		if ($act32.equalsIgnoreCase(name)) {
			act32(value);
			return;
		}
		if ($pln33.equalsIgnoreCase(name)) {
			pln33(value);
			return;
		}
		if ($act33.equalsIgnoreCase(name)) {
			act33(value);
			return;
		}
		if ($pln34.equalsIgnoreCase(name)) {
			pln34(value);
			return;
		}
		if ($act34.equalsIgnoreCase(name)) {
			act34(value);
			return;
		}
		if ($pln35.equalsIgnoreCase(name)) {
			pln35(value);
			return;
		}
		if ($act35.equalsIgnoreCase(name)) {
			act35(value);
			return;
		}
		if ($pln36.equalsIgnoreCase(name)) {
			pln36(value);
			return;
		}
		if ($act36.equalsIgnoreCase(name)) {
			act36(value);
			return;
		}
		if ($pln37.equalsIgnoreCase(name)) {
			pln37(value);
			return;
		}
		if ($act37.equalsIgnoreCase(name)) {
			act37(value);
			return;
		}
		if ($pln38.equalsIgnoreCase(name)) {
			pln38(value);
			return;
		}
		if ($act38.equalsIgnoreCase(name)) {
			act38(value);
			return;
		}
		if ($pln39.equalsIgnoreCase(name)) {
			pln39(value);
			return;
		}
		if ($act39.equalsIgnoreCase(name)) {
			act39(value);
			return;
		}
		if ($pln40.equalsIgnoreCase(name)) {
			pln40(value);
			return;
		}
		if ($act40.equalsIgnoreCase(name)) {
			act40(value);
			return;
		}
		if ($pln41.equalsIgnoreCase(name)) {
			pln41(value);
			return;
		}
		if ($act41.equalsIgnoreCase(name)) {
			act41(value);
			return;
		}
		if ($pln42.equalsIgnoreCase(name)) {
			pln42(value);
			return;
		}
		if ($act42.equalsIgnoreCase(name)) {
			act42(value);
			return;
		}
		if ($pln43.equalsIgnoreCase(name)) {
			pln43(value);
			return;
		}
		if ($act43.equalsIgnoreCase(name)) {
			act43(value);
			return;
		}
		if ($pln44.equalsIgnoreCase(name)) {
			pln44(value);
			return;
		}
		if ($act44.equalsIgnoreCase(name)) {
			act44(value);
			return;
		}
		if ($pln45.equalsIgnoreCase(name)) {
			pln45(value);
			return;
		}
		if ($act45.equalsIgnoreCase(name)) {
			act45(value);
			return;
		}
		if ($pln46.equalsIgnoreCase(name)) {
			pln46(value);
			return;
		}
		if ($act46.equalsIgnoreCase(name)) {
			act46(value);
			return;
		}
		if ($pln47.equalsIgnoreCase(name)) {
			pln47(value);
			return;
		}
		if ($act47.equalsIgnoreCase(name)) {
			act47(value);
			return;
		}
		if ($pln48.equalsIgnoreCase(name)) {
			pln48(value);
			return;
		}
		if ($act48.equalsIgnoreCase(name)) {
			act48(value);
			return;
		}
		if ($pln49.equalsIgnoreCase(name)) {
			pln49(value);
			return;
		}
		if ($act49.equalsIgnoreCase(name)) {
			act49(value);
			return;
		}
		if ($pln50.equalsIgnoreCase(name)) {
			pln50(value);
			return;
		}
		if ($act50.equalsIgnoreCase(name)) {
			act50(value);
			return;
		}
		if ($pln51.equalsIgnoreCase(name)) {
			pln51(value);
			return;
		}
		if ($act51.equalsIgnoreCase(name)) {
			act51(value);
			return;
		}
		if ($pln52.equalsIgnoreCase(name)) {
			pln52(value);
			return;
		}
		if ($act52.equalsIgnoreCase(name)) {
			act52(value);
			return;
		}
		if ($pln53.equalsIgnoreCase(name)) {
			pln53(value);
			return;
		}
		if ($act53.equalsIgnoreCase(name)) {
			act53(value);
			return;
		}
		if ($pln54.equalsIgnoreCase(name)) {
			pln54(value);
			return;
		}
		if ($act54.equalsIgnoreCase(name)) {
			act54(value);
			return;
		}
		if ($pln55.equalsIgnoreCase(name)) {
			pln55(value);
			return;
		}
		if ($act55.equalsIgnoreCase(name)) {
			act55(value);
			return;
		}
		if ($pln56.equalsIgnoreCase(name)) {
			pln56(value);
			return;
		}
		if ($act56.equalsIgnoreCase(name)) {
			act56(value);
			return;
		}
		if ($pln57.equalsIgnoreCase(name)) {
			pln57(value);
			return;
		}
		if ($act57.equalsIgnoreCase(name)) {
			act57(value);
			return;
		}
		if ($pln58.equalsIgnoreCase(name)) {
			pln58(value);
			return;
		}
		if ($act58.equalsIgnoreCase(name)) {
			act58(value);
			return;
		}
		if ($pln59.equalsIgnoreCase(name)) {
			pln59(value);
			return;
		}
		if ($act59.equalsIgnoreCase(name)) {
			act59(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($term00.equalsIgnoreCase(name)) {
			term00(value);
			return;
		}
		if ($term01.equalsIgnoreCase(name)) {
			term01(value);
			return;
		}
		if ($term02.equalsIgnoreCase(name)) {
			term02(value);
			return;
		}
		if ($term03.equalsIgnoreCase(name)) {
			term03(value);
			return;
		}
		if ($term04.equalsIgnoreCase(name)) {
			term04(value);
			return;
		}
		if ($pln00.equalsIgnoreCase(name)) {
			pln00(value);
			return;
		}
		if ($act00.equalsIgnoreCase(name)) {
			act00(value);
			return;
		}
		if ($pln01.equalsIgnoreCase(name)) {
			pln01(value);
			return;
		}
		if ($act01.equalsIgnoreCase(name)) {
			act01(value);
			return;
		}
		if ($pln02.equalsIgnoreCase(name)) {
			pln02(value);
			return;
		}
		if ($act02.equalsIgnoreCase(name)) {
			act02(value);
			return;
		}
		if ($pln03.equalsIgnoreCase(name)) {
			pln03(value);
			return;
		}
		if ($act03.equalsIgnoreCase(name)) {
			act03(value);
			return;
		}
		if ($pln04.equalsIgnoreCase(name)) {
			pln04(value);
			return;
		}
		if ($act04.equalsIgnoreCase(name)) {
			act04(value);
			return;
		}
		if ($pln05.equalsIgnoreCase(name)) {
			pln05(value);
			return;
		}
		if ($act05.equalsIgnoreCase(name)) {
			act05(value);
			return;
		}
		if ($pln06.equalsIgnoreCase(name)) {
			pln06(value);
			return;
		}
		if ($act06.equalsIgnoreCase(name)) {
			act06(value);
			return;
		}
		if ($pln07.equalsIgnoreCase(name)) {
			pln07(value);
			return;
		}
		if ($act07.equalsIgnoreCase(name)) {
			act07(value);
			return;
		}
		if ($pln08.equalsIgnoreCase(name)) {
			pln08(value);
			return;
		}
		if ($act08.equalsIgnoreCase(name)) {
			act08(value);
			return;
		}
		if ($pln09.equalsIgnoreCase(name)) {
			pln09(value);
			return;
		}
		if ($act09.equalsIgnoreCase(name)) {
			act09(value);
			return;
		}
		if ($pln10.equalsIgnoreCase(name)) {
			pln10(value);
			return;
		}
		if ($act10.equalsIgnoreCase(name)) {
			act10(value);
			return;
		}
		if ($pln11.equalsIgnoreCase(name)) {
			pln11(value);
			return;
		}
		if ($act11.equalsIgnoreCase(name)) {
			act11(value);
			return;
		}
		if ($pln12.equalsIgnoreCase(name)) {
			pln12(value);
			return;
		}
		if ($act12.equalsIgnoreCase(name)) {
			act12(value);
			return;
		}
		if ($pln13.equalsIgnoreCase(name)) {
			pln13(value);
			return;
		}
		if ($act13.equalsIgnoreCase(name)) {
			act13(value);
			return;
		}
		if ($pln14.equalsIgnoreCase(name)) {
			pln14(value);
			return;
		}
		if ($act14.equalsIgnoreCase(name)) {
			act14(value);
			return;
		}
		if ($pln15.equalsIgnoreCase(name)) {
			pln15(value);
			return;
		}
		if ($act15.equalsIgnoreCase(name)) {
			act15(value);
			return;
		}
		if ($pln16.equalsIgnoreCase(name)) {
			pln16(value);
			return;
		}
		if ($act16.equalsIgnoreCase(name)) {
			act16(value);
			return;
		}
		if ($pln17.equalsIgnoreCase(name)) {
			pln17(value);
			return;
		}
		if ($act17.equalsIgnoreCase(name)) {
			act17(value);
			return;
		}
		if ($pln18.equalsIgnoreCase(name)) {
			pln18(value);
			return;
		}
		if ($act18.equalsIgnoreCase(name)) {
			act18(value);
			return;
		}
		if ($pln19.equalsIgnoreCase(name)) {
			pln19(value);
			return;
		}
		if ($act19.equalsIgnoreCase(name)) {
			act19(value);
			return;
		}
		if ($pln20.equalsIgnoreCase(name)) {
			pln20(value);
			return;
		}
		if ($act20.equalsIgnoreCase(name)) {
			act20(value);
			return;
		}
		if ($pln21.equalsIgnoreCase(name)) {
			pln21(value);
			return;
		}
		if ($act21.equalsIgnoreCase(name)) {
			act21(value);
			return;
		}
		if ($pln22.equalsIgnoreCase(name)) {
			pln22(value);
			return;
		}
		if ($act22.equalsIgnoreCase(name)) {
			act22(value);
			return;
		}
		if ($pln23.equalsIgnoreCase(name)) {
			pln23(value);
			return;
		}
		if ($act23.equalsIgnoreCase(name)) {
			act23(value);
			return;
		}
		if ($pln24.equalsIgnoreCase(name)) {
			pln24(value);
			return;
		}
		if ($act24.equalsIgnoreCase(name)) {
			act24(value);
			return;
		}
		if ($pln25.equalsIgnoreCase(name)) {
			pln25(value);
			return;
		}
		if ($act25.equalsIgnoreCase(name)) {
			act25(value);
			return;
		}
		if ($pln26.equalsIgnoreCase(name)) {
			pln26(value);
			return;
		}
		if ($act26.equalsIgnoreCase(name)) {
			act26(value);
			return;
		}
		if ($pln27.equalsIgnoreCase(name)) {
			pln27(value);
			return;
		}
		if ($act27.equalsIgnoreCase(name)) {
			act27(value);
			return;
		}
		if ($pln28.equalsIgnoreCase(name)) {
			pln28(value);
			return;
		}
		if ($act28.equalsIgnoreCase(name)) {
			act28(value);
			return;
		}
		if ($pln29.equalsIgnoreCase(name)) {
			pln29(value);
			return;
		}
		if ($act29.equalsIgnoreCase(name)) {
			act29(value);
			return;
		}
		if ($pln30.equalsIgnoreCase(name)) {
			pln30(value);
			return;
		}
		if ($act30.equalsIgnoreCase(name)) {
			act30(value);
			return;
		}
		if ($pln31.equalsIgnoreCase(name)) {
			pln31(value);
			return;
		}
		if ($act31.equalsIgnoreCase(name)) {
			act31(value);
			return;
		}
		if ($pln32.equalsIgnoreCase(name)) {
			pln32(value);
			return;
		}
		if ($act32.equalsIgnoreCase(name)) {
			act32(value);
			return;
		}
		if ($pln33.equalsIgnoreCase(name)) {
			pln33(value);
			return;
		}
		if ($act33.equalsIgnoreCase(name)) {
			act33(value);
			return;
		}
		if ($pln34.equalsIgnoreCase(name)) {
			pln34(value);
			return;
		}
		if ($act34.equalsIgnoreCase(name)) {
			act34(value);
			return;
		}
		if ($pln35.equalsIgnoreCase(name)) {
			pln35(value);
			return;
		}
		if ($act35.equalsIgnoreCase(name)) {
			act35(value);
			return;
		}
		if ($pln36.equalsIgnoreCase(name)) {
			pln36(value);
			return;
		}
		if ($act36.equalsIgnoreCase(name)) {
			act36(value);
			return;
		}
		if ($pln37.equalsIgnoreCase(name)) {
			pln37(value);
			return;
		}
		if ($act37.equalsIgnoreCase(name)) {
			act37(value);
			return;
		}
		if ($pln38.equalsIgnoreCase(name)) {
			pln38(value);
			return;
		}
		if ($act38.equalsIgnoreCase(name)) {
			act38(value);
			return;
		}
		if ($pln39.equalsIgnoreCase(name)) {
			pln39(value);
			return;
		}
		if ($act39.equalsIgnoreCase(name)) {
			act39(value);
			return;
		}
		if ($pln40.equalsIgnoreCase(name)) {
			pln40(value);
			return;
		}
		if ($act40.equalsIgnoreCase(name)) {
			act40(value);
			return;
		}
		if ($pln41.equalsIgnoreCase(name)) {
			pln41(value);
			return;
		}
		if ($act41.equalsIgnoreCase(name)) {
			act41(value);
			return;
		}
		if ($pln42.equalsIgnoreCase(name)) {
			pln42(value);
			return;
		}
		if ($act42.equalsIgnoreCase(name)) {
			act42(value);
			return;
		}
		if ($pln43.equalsIgnoreCase(name)) {
			pln43(value);
			return;
		}
		if ($act43.equalsIgnoreCase(name)) {
			act43(value);
			return;
		}
		if ($pln44.equalsIgnoreCase(name)) {
			pln44(value);
			return;
		}
		if ($act44.equalsIgnoreCase(name)) {
			act44(value);
			return;
		}
		if ($pln45.equalsIgnoreCase(name)) {
			pln45(value);
			return;
		}
		if ($act45.equalsIgnoreCase(name)) {
			act45(value);
			return;
		}
		if ($pln46.equalsIgnoreCase(name)) {
			pln46(value);
			return;
		}
		if ($act46.equalsIgnoreCase(name)) {
			act46(value);
			return;
		}
		if ($pln47.equalsIgnoreCase(name)) {
			pln47(value);
			return;
		}
		if ($act47.equalsIgnoreCase(name)) {
			act47(value);
			return;
		}
		if ($pln48.equalsIgnoreCase(name)) {
			pln48(value);
			return;
		}
		if ($act48.equalsIgnoreCase(name)) {
			act48(value);
			return;
		}
		if ($pln49.equalsIgnoreCase(name)) {
			pln49(value);
			return;
		}
		if ($act49.equalsIgnoreCase(name)) {
			act49(value);
			return;
		}
		if ($pln50.equalsIgnoreCase(name)) {
			pln50(value);
			return;
		}
		if ($act50.equalsIgnoreCase(name)) {
			act50(value);
			return;
		}
		if ($pln51.equalsIgnoreCase(name)) {
			pln51(value);
			return;
		}
		if ($act51.equalsIgnoreCase(name)) {
			act51(value);
			return;
		}
		if ($pln52.equalsIgnoreCase(name)) {
			pln52(value);
			return;
		}
		if ($act52.equalsIgnoreCase(name)) {
			act52(value);
			return;
		}
		if ($pln53.equalsIgnoreCase(name)) {
			pln53(value);
			return;
		}
		if ($act53.equalsIgnoreCase(name)) {
			act53(value);
			return;
		}
		if ($pln54.equalsIgnoreCase(name)) {
			pln54(value);
			return;
		}
		if ($act54.equalsIgnoreCase(name)) {
			act54(value);
			return;
		}
		if ($pln55.equalsIgnoreCase(name)) {
			pln55(value);
			return;
		}
		if ($act55.equalsIgnoreCase(name)) {
			act55(value);
			return;
		}
		if ($pln56.equalsIgnoreCase(name)) {
			pln56(value);
			return;
		}
		if ($act56.equalsIgnoreCase(name)) {
			act56(value);
			return;
		}
		if ($pln57.equalsIgnoreCase(name)) {
			pln57(value);
			return;
		}
		if ($act57.equalsIgnoreCase(name)) {
			act57(value);
			return;
		}
		if ($pln58.equalsIgnoreCase(name)) {
			pln58(value);
			return;
		}
		if ($act58.equalsIgnoreCase(name)) {
			act58(value);
			return;
		}
		if ($pln59.equalsIgnoreCase(name)) {
			pln59(value);
			return;
		}
		if ($act59.equalsIgnoreCase(name)) {
			act59(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($trd_wg_cd.equalsIgnoreCase(name)) {
			trd_wg_cd(value);
			return;
		}
		if ($trd_wg_nm.equalsIgnoreCase(name)) {
			trd_wg_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($term00.equalsIgnoreCase(name)) {
			term00(value);
			return;
		}
		if ($term01.equalsIgnoreCase(name)) {
			term01(value);
			return;
		}
		if ($term02.equalsIgnoreCase(name)) {
			term02(value);
			return;
		}
		if ($term03.equalsIgnoreCase(name)) {
			term03(value);
			return;
		}
		if ($term04.equalsIgnoreCase(name)) {
			term04(value);
			return;
		}
		if ($pln00.equalsIgnoreCase(name)) {
			pln00(value);
			return;
		}
		if ($act00.equalsIgnoreCase(name)) {
			act00(value);
			return;
		}
		if ($pln01.equalsIgnoreCase(name)) {
			pln01(value);
			return;
		}
		if ($act01.equalsIgnoreCase(name)) {
			act01(value);
			return;
		}
		if ($pln02.equalsIgnoreCase(name)) {
			pln02(value);
			return;
		}
		if ($act02.equalsIgnoreCase(name)) {
			act02(value);
			return;
		}
		if ($pln03.equalsIgnoreCase(name)) {
			pln03(value);
			return;
		}
		if ($act03.equalsIgnoreCase(name)) {
			act03(value);
			return;
		}
		if ($pln04.equalsIgnoreCase(name)) {
			pln04(value);
			return;
		}
		if ($act04.equalsIgnoreCase(name)) {
			act04(value);
			return;
		}
		if ($pln05.equalsIgnoreCase(name)) {
			pln05(value);
			return;
		}
		if ($act05.equalsIgnoreCase(name)) {
			act05(value);
			return;
		}
		if ($pln06.equalsIgnoreCase(name)) {
			pln06(value);
			return;
		}
		if ($act06.equalsIgnoreCase(name)) {
			act06(value);
			return;
		}
		if ($pln07.equalsIgnoreCase(name)) {
			pln07(value);
			return;
		}
		if ($act07.equalsIgnoreCase(name)) {
			act07(value);
			return;
		}
		if ($pln08.equalsIgnoreCase(name)) {
			pln08(value);
			return;
		}
		if ($act08.equalsIgnoreCase(name)) {
			act08(value);
			return;
		}
		if ($pln09.equalsIgnoreCase(name)) {
			pln09(value);
			return;
		}
		if ($act09.equalsIgnoreCase(name)) {
			act09(value);
			return;
		}
		if ($pln10.equalsIgnoreCase(name)) {
			pln10(value);
			return;
		}
		if ($act10.equalsIgnoreCase(name)) {
			act10(value);
			return;
		}
		if ($pln11.equalsIgnoreCase(name)) {
			pln11(value);
			return;
		}
		if ($act11.equalsIgnoreCase(name)) {
			act11(value);
			return;
		}
		if ($pln12.equalsIgnoreCase(name)) {
			pln12(value);
			return;
		}
		if ($act12.equalsIgnoreCase(name)) {
			act12(value);
			return;
		}
		if ($pln13.equalsIgnoreCase(name)) {
			pln13(value);
			return;
		}
		if ($act13.equalsIgnoreCase(name)) {
			act13(value);
			return;
		}
		if ($pln14.equalsIgnoreCase(name)) {
			pln14(value);
			return;
		}
		if ($act14.equalsIgnoreCase(name)) {
			act14(value);
			return;
		}
		if ($pln15.equalsIgnoreCase(name)) {
			pln15(value);
			return;
		}
		if ($act15.equalsIgnoreCase(name)) {
			act15(value);
			return;
		}
		if ($pln16.equalsIgnoreCase(name)) {
			pln16(value);
			return;
		}
		if ($act16.equalsIgnoreCase(name)) {
			act16(value);
			return;
		}
		if ($pln17.equalsIgnoreCase(name)) {
			pln17(value);
			return;
		}
		if ($act17.equalsIgnoreCase(name)) {
			act17(value);
			return;
		}
		if ($pln18.equalsIgnoreCase(name)) {
			pln18(value);
			return;
		}
		if ($act18.equalsIgnoreCase(name)) {
			act18(value);
			return;
		}
		if ($pln19.equalsIgnoreCase(name)) {
			pln19(value);
			return;
		}
		if ($act19.equalsIgnoreCase(name)) {
			act19(value);
			return;
		}
		if ($pln20.equalsIgnoreCase(name)) {
			pln20(value);
			return;
		}
		if ($act20.equalsIgnoreCase(name)) {
			act20(value);
			return;
		}
		if ($pln21.equalsIgnoreCase(name)) {
			pln21(value);
			return;
		}
		if ($act21.equalsIgnoreCase(name)) {
			act21(value);
			return;
		}
		if ($pln22.equalsIgnoreCase(name)) {
			pln22(value);
			return;
		}
		if ($act22.equalsIgnoreCase(name)) {
			act22(value);
			return;
		}
		if ($pln23.equalsIgnoreCase(name)) {
			pln23(value);
			return;
		}
		if ($act23.equalsIgnoreCase(name)) {
			act23(value);
			return;
		}
		if ($pln24.equalsIgnoreCase(name)) {
			pln24(value);
			return;
		}
		if ($act24.equalsIgnoreCase(name)) {
			act24(value);
			return;
		}
		if ($pln25.equalsIgnoreCase(name)) {
			pln25(value);
			return;
		}
		if ($act25.equalsIgnoreCase(name)) {
			act25(value);
			return;
		}
		if ($pln26.equalsIgnoreCase(name)) {
			pln26(value);
			return;
		}
		if ($act26.equalsIgnoreCase(name)) {
			act26(value);
			return;
		}
		if ($pln27.equalsIgnoreCase(name)) {
			pln27(value);
			return;
		}
		if ($act27.equalsIgnoreCase(name)) {
			act27(value);
			return;
		}
		if ($pln28.equalsIgnoreCase(name)) {
			pln28(value);
			return;
		}
		if ($act28.equalsIgnoreCase(name)) {
			act28(value);
			return;
		}
		if ($pln29.equalsIgnoreCase(name)) {
			pln29(value);
			return;
		}
		if ($act29.equalsIgnoreCase(name)) {
			act29(value);
			return;
		}
		if ($pln30.equalsIgnoreCase(name)) {
			pln30(value);
			return;
		}
		if ($act30.equalsIgnoreCase(name)) {
			act30(value);
			return;
		}
		if ($pln31.equalsIgnoreCase(name)) {
			pln31(value);
			return;
		}
		if ($act31.equalsIgnoreCase(name)) {
			act31(value);
			return;
		}
		if ($pln32.equalsIgnoreCase(name)) {
			pln32(value);
			return;
		}
		if ($act32.equalsIgnoreCase(name)) {
			act32(value);
			return;
		}
		if ($pln33.equalsIgnoreCase(name)) {
			pln33(value);
			return;
		}
		if ($act33.equalsIgnoreCase(name)) {
			act33(value);
			return;
		}
		if ($pln34.equalsIgnoreCase(name)) {
			pln34(value);
			return;
		}
		if ($act34.equalsIgnoreCase(name)) {
			act34(value);
			return;
		}
		if ($pln35.equalsIgnoreCase(name)) {
			pln35(value);
			return;
		}
		if ($act35.equalsIgnoreCase(name)) {
			act35(value);
			return;
		}
		if ($pln36.equalsIgnoreCase(name)) {
			pln36(value);
			return;
		}
		if ($act36.equalsIgnoreCase(name)) {
			act36(value);
			return;
		}
		if ($pln37.equalsIgnoreCase(name)) {
			pln37(value);
			return;
		}
		if ($act37.equalsIgnoreCase(name)) {
			act37(value);
			return;
		}
		if ($pln38.equalsIgnoreCase(name)) {
			pln38(value);
			return;
		}
		if ($act38.equalsIgnoreCase(name)) {
			act38(value);
			return;
		}
		if ($pln39.equalsIgnoreCase(name)) {
			pln39(value);
			return;
		}
		if ($act39.equalsIgnoreCase(name)) {
			act39(value);
			return;
		}
		if ($pln40.equalsIgnoreCase(name)) {
			pln40(value);
			return;
		}
		if ($act40.equalsIgnoreCase(name)) {
			act40(value);
			return;
		}
		if ($pln41.equalsIgnoreCase(name)) {
			pln41(value);
			return;
		}
		if ($act41.equalsIgnoreCase(name)) {
			act41(value);
			return;
		}
		if ($pln42.equalsIgnoreCase(name)) {
			pln42(value);
			return;
		}
		if ($act42.equalsIgnoreCase(name)) {
			act42(value);
			return;
		}
		if ($pln43.equalsIgnoreCase(name)) {
			pln43(value);
			return;
		}
		if ($act43.equalsIgnoreCase(name)) {
			act43(value);
			return;
		}
		if ($pln44.equalsIgnoreCase(name)) {
			pln44(value);
			return;
		}
		if ($act44.equalsIgnoreCase(name)) {
			act44(value);
			return;
		}
		if ($pln45.equalsIgnoreCase(name)) {
			pln45(value);
			return;
		}
		if ($act45.equalsIgnoreCase(name)) {
			act45(value);
			return;
		}
		if ($pln46.equalsIgnoreCase(name)) {
			pln46(value);
			return;
		}
		if ($act46.equalsIgnoreCase(name)) {
			act46(value);
			return;
		}
		if ($pln47.equalsIgnoreCase(name)) {
			pln47(value);
			return;
		}
		if ($act47.equalsIgnoreCase(name)) {
			act47(value);
			return;
		}
		if ($pln48.equalsIgnoreCase(name)) {
			pln48(value);
			return;
		}
		if ($act48.equalsIgnoreCase(name)) {
			act48(value);
			return;
		}
		if ($pln49.equalsIgnoreCase(name)) {
			pln49(value);
			return;
		}
		if ($act49.equalsIgnoreCase(name)) {
			act49(value);
			return;
		}
		if ($pln50.equalsIgnoreCase(name)) {
			pln50(value);
			return;
		}
		if ($act50.equalsIgnoreCase(name)) {
			act50(value);
			return;
		}
		if ($pln51.equalsIgnoreCase(name)) {
			pln51(value);
			return;
		}
		if ($act51.equalsIgnoreCase(name)) {
			act51(value);
			return;
		}
		if ($pln52.equalsIgnoreCase(name)) {
			pln52(value);
			return;
		}
		if ($act52.equalsIgnoreCase(name)) {
			act52(value);
			return;
		}
		if ($pln53.equalsIgnoreCase(name)) {
			pln53(value);
			return;
		}
		if ($act53.equalsIgnoreCase(name)) {
			act53(value);
			return;
		}
		if ($pln54.equalsIgnoreCase(name)) {
			pln54(value);
			return;
		}
		if ($act54.equalsIgnoreCase(name)) {
			act54(value);
			return;
		}
		if ($pln55.equalsIgnoreCase(name)) {
			pln55(value);
			return;
		}
		if ($act55.equalsIgnoreCase(name)) {
			act55(value);
			return;
		}
		if ($pln56.equalsIgnoreCase(name)) {
			pln56(value);
			return;
		}
		if ($act56.equalsIgnoreCase(name)) {
			act56(value);
			return;
		}
		if ($pln57.equalsIgnoreCase(name)) {
			pln57(value);
			return;
		}
		if ($act57.equalsIgnoreCase(name)) {
			act57(value);
			return;
		}
		if ($pln58.equalsIgnoreCase(name)) {
			pln58(value);
			return;
		}
		if ($act58.equalsIgnoreCase(name)) {
			act58(value);
			return;
		}
		if ($pln59.equalsIgnoreCase(name)) {
			pln59(value);
			return;
		}
		if ($act59.equalsIgnoreCase(name)) {
			act59(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($term00.equalsIgnoreCase(name)) {
			term00(value);
			return;
		}
		if ($term01.equalsIgnoreCase(name)) {
			term01(value);
			return;
		}
		if ($term02.equalsIgnoreCase(name)) {
			term02(value);
			return;
		}
		if ($term03.equalsIgnoreCase(name)) {
			term03(value);
			return;
		}
		if ($term04.equalsIgnoreCase(name)) {
			term04(value);
			return;
		}
		if ($pln00.equalsIgnoreCase(name)) {
			pln00(value);
			return;
		}
		if ($act00.equalsIgnoreCase(name)) {
			act00(value);
			return;
		}
		if ($pln01.equalsIgnoreCase(name)) {
			pln01(value);
			return;
		}
		if ($act01.equalsIgnoreCase(name)) {
			act01(value);
			return;
		}
		if ($pln02.equalsIgnoreCase(name)) {
			pln02(value);
			return;
		}
		if ($act02.equalsIgnoreCase(name)) {
			act02(value);
			return;
		}
		if ($pln03.equalsIgnoreCase(name)) {
			pln03(value);
			return;
		}
		if ($act03.equalsIgnoreCase(name)) {
			act03(value);
			return;
		}
		if ($pln04.equalsIgnoreCase(name)) {
			pln04(value);
			return;
		}
		if ($act04.equalsIgnoreCase(name)) {
			act04(value);
			return;
		}
		if ($pln05.equalsIgnoreCase(name)) {
			pln05(value);
			return;
		}
		if ($act05.equalsIgnoreCase(name)) {
			act05(value);
			return;
		}
		if ($pln06.equalsIgnoreCase(name)) {
			pln06(value);
			return;
		}
		if ($act06.equalsIgnoreCase(name)) {
			act06(value);
			return;
		}
		if ($pln07.equalsIgnoreCase(name)) {
			pln07(value);
			return;
		}
		if ($act07.equalsIgnoreCase(name)) {
			act07(value);
			return;
		}
		if ($pln08.equalsIgnoreCase(name)) {
			pln08(value);
			return;
		}
		if ($act08.equalsIgnoreCase(name)) {
			act08(value);
			return;
		}
		if ($pln09.equalsIgnoreCase(name)) {
			pln09(value);
			return;
		}
		if ($act09.equalsIgnoreCase(name)) {
			act09(value);
			return;
		}
		if ($pln10.equalsIgnoreCase(name)) {
			pln10(value);
			return;
		}
		if ($act10.equalsIgnoreCase(name)) {
			act10(value);
			return;
		}
		if ($pln11.equalsIgnoreCase(name)) {
			pln11(value);
			return;
		}
		if ($act11.equalsIgnoreCase(name)) {
			act11(value);
			return;
		}
		if ($pln12.equalsIgnoreCase(name)) {
			pln12(value);
			return;
		}
		if ($act12.equalsIgnoreCase(name)) {
			act12(value);
			return;
		}
		if ($pln13.equalsIgnoreCase(name)) {
			pln13(value);
			return;
		}
		if ($act13.equalsIgnoreCase(name)) {
			act13(value);
			return;
		}
		if ($pln14.equalsIgnoreCase(name)) {
			pln14(value);
			return;
		}
		if ($act14.equalsIgnoreCase(name)) {
			act14(value);
			return;
		}
		if ($pln15.equalsIgnoreCase(name)) {
			pln15(value);
			return;
		}
		if ($act15.equalsIgnoreCase(name)) {
			act15(value);
			return;
		}
		if ($pln16.equalsIgnoreCase(name)) {
			pln16(value);
			return;
		}
		if ($act16.equalsIgnoreCase(name)) {
			act16(value);
			return;
		}
		if ($pln17.equalsIgnoreCase(name)) {
			pln17(value);
			return;
		}
		if ($act17.equalsIgnoreCase(name)) {
			act17(value);
			return;
		}
		if ($pln18.equalsIgnoreCase(name)) {
			pln18(value);
			return;
		}
		if ($act18.equalsIgnoreCase(name)) {
			act18(value);
			return;
		}
		if ($pln19.equalsIgnoreCase(name)) {
			pln19(value);
			return;
		}
		if ($act19.equalsIgnoreCase(name)) {
			act19(value);
			return;
		}
		if ($pln20.equalsIgnoreCase(name)) {
			pln20(value);
			return;
		}
		if ($act20.equalsIgnoreCase(name)) {
			act20(value);
			return;
		}
		if ($pln21.equalsIgnoreCase(name)) {
			pln21(value);
			return;
		}
		if ($act21.equalsIgnoreCase(name)) {
			act21(value);
			return;
		}
		if ($pln22.equalsIgnoreCase(name)) {
			pln22(value);
			return;
		}
		if ($act22.equalsIgnoreCase(name)) {
			act22(value);
			return;
		}
		if ($pln23.equalsIgnoreCase(name)) {
			pln23(value);
			return;
		}
		if ($act23.equalsIgnoreCase(name)) {
			act23(value);
			return;
		}
		if ($pln24.equalsIgnoreCase(name)) {
			pln24(value);
			return;
		}
		if ($act24.equalsIgnoreCase(name)) {
			act24(value);
			return;
		}
		if ($pln25.equalsIgnoreCase(name)) {
			pln25(value);
			return;
		}
		if ($act25.equalsIgnoreCase(name)) {
			act25(value);
			return;
		}
		if ($pln26.equalsIgnoreCase(name)) {
			pln26(value);
			return;
		}
		if ($act26.equalsIgnoreCase(name)) {
			act26(value);
			return;
		}
		if ($pln27.equalsIgnoreCase(name)) {
			pln27(value);
			return;
		}
		if ($act27.equalsIgnoreCase(name)) {
			act27(value);
			return;
		}
		if ($pln28.equalsIgnoreCase(name)) {
			pln28(value);
			return;
		}
		if ($act28.equalsIgnoreCase(name)) {
			act28(value);
			return;
		}
		if ($pln29.equalsIgnoreCase(name)) {
			pln29(value);
			return;
		}
		if ($act29.equalsIgnoreCase(name)) {
			act29(value);
			return;
		}
		if ($pln30.equalsIgnoreCase(name)) {
			pln30(value);
			return;
		}
		if ($act30.equalsIgnoreCase(name)) {
			act30(value);
			return;
		}
		if ($pln31.equalsIgnoreCase(name)) {
			pln31(value);
			return;
		}
		if ($act31.equalsIgnoreCase(name)) {
			act31(value);
			return;
		}
		if ($pln32.equalsIgnoreCase(name)) {
			pln32(value);
			return;
		}
		if ($act32.equalsIgnoreCase(name)) {
			act32(value);
			return;
		}
		if ($pln33.equalsIgnoreCase(name)) {
			pln33(value);
			return;
		}
		if ($act33.equalsIgnoreCase(name)) {
			act33(value);
			return;
		}
		if ($pln34.equalsIgnoreCase(name)) {
			pln34(value);
			return;
		}
		if ($act34.equalsIgnoreCase(name)) {
			act34(value);
			return;
		}
		if ($pln35.equalsIgnoreCase(name)) {
			pln35(value);
			return;
		}
		if ($act35.equalsIgnoreCase(name)) {
			act35(value);
			return;
		}
		if ($pln36.equalsIgnoreCase(name)) {
			pln36(value);
			return;
		}
		if ($act36.equalsIgnoreCase(name)) {
			act36(value);
			return;
		}
		if ($pln37.equalsIgnoreCase(name)) {
			pln37(value);
			return;
		}
		if ($act37.equalsIgnoreCase(name)) {
			act37(value);
			return;
		}
		if ($pln38.equalsIgnoreCase(name)) {
			pln38(value);
			return;
		}
		if ($act38.equalsIgnoreCase(name)) {
			act38(value);
			return;
		}
		if ($pln39.equalsIgnoreCase(name)) {
			pln39(value);
			return;
		}
		if ($act39.equalsIgnoreCase(name)) {
			act39(value);
			return;
		}
		if ($pln40.equalsIgnoreCase(name)) {
			pln40(value);
			return;
		}
		if ($act40.equalsIgnoreCase(name)) {
			act40(value);
			return;
		}
		if ($pln41.equalsIgnoreCase(name)) {
			pln41(value);
			return;
		}
		if ($act41.equalsIgnoreCase(name)) {
			act41(value);
			return;
		}
		if ($pln42.equalsIgnoreCase(name)) {
			pln42(value);
			return;
		}
		if ($act42.equalsIgnoreCase(name)) {
			act42(value);
			return;
		}
		if ($pln43.equalsIgnoreCase(name)) {
			pln43(value);
			return;
		}
		if ($act43.equalsIgnoreCase(name)) {
			act43(value);
			return;
		}
		if ($pln44.equalsIgnoreCase(name)) {
			pln44(value);
			return;
		}
		if ($act44.equalsIgnoreCase(name)) {
			act44(value);
			return;
		}
		if ($pln45.equalsIgnoreCase(name)) {
			pln45(value);
			return;
		}
		if ($act45.equalsIgnoreCase(name)) {
			act45(value);
			return;
		}
		if ($pln46.equalsIgnoreCase(name)) {
			pln46(value);
			return;
		}
		if ($act46.equalsIgnoreCase(name)) {
			act46(value);
			return;
		}
		if ($pln47.equalsIgnoreCase(name)) {
			pln47(value);
			return;
		}
		if ($act47.equalsIgnoreCase(name)) {
			act47(value);
			return;
		}
		if ($pln48.equalsIgnoreCase(name)) {
			pln48(value);
			return;
		}
		if ($act48.equalsIgnoreCase(name)) {
			act48(value);
			return;
		}
		if ($pln49.equalsIgnoreCase(name)) {
			pln49(value);
			return;
		}
		if ($act49.equalsIgnoreCase(name)) {
			act49(value);
			return;
		}
		if ($pln50.equalsIgnoreCase(name)) {
			pln50(value);
			return;
		}
		if ($act50.equalsIgnoreCase(name)) {
			act50(value);
			return;
		}
		if ($pln51.equalsIgnoreCase(name)) {
			pln51(value);
			return;
		}
		if ($act51.equalsIgnoreCase(name)) {
			act51(value);
			return;
		}
		if ($pln52.equalsIgnoreCase(name)) {
			pln52(value);
			return;
		}
		if ($act52.equalsIgnoreCase(name)) {
			act52(value);
			return;
		}
		if ($pln53.equalsIgnoreCase(name)) {
			pln53(value);
			return;
		}
		if ($act53.equalsIgnoreCase(name)) {
			act53(value);
			return;
		}
		if ($pln54.equalsIgnoreCase(name)) {
			pln54(value);
			return;
		}
		if ($act54.equalsIgnoreCase(name)) {
			act54(value);
			return;
		}
		if ($pln55.equalsIgnoreCase(name)) {
			pln55(value);
			return;
		}
		if ($act55.equalsIgnoreCase(name)) {
			act55(value);
			return;
		}
		if ($pln56.equalsIgnoreCase(name)) {
			pln56(value);
			return;
		}
		if ($act56.equalsIgnoreCase(name)) {
			act56(value);
			return;
		}
		if ($pln57.equalsIgnoreCase(name)) {
			pln57(value);
			return;
		}
		if ($act57.equalsIgnoreCase(name)) {
			act57(value);
			return;
		}
		if ($pln58.equalsIgnoreCase(name)) {
			pln58(value);
			return;
		}
		if ($act58.equalsIgnoreCase(name)) {
			act58(value);
			return;
		}
		if ($pln59.equalsIgnoreCase(name)) {
			pln59(value);
			return;
		}
		if ($act59.equalsIgnoreCase(name)) {
			act59(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($term00.equalsIgnoreCase(name)) {
			term00(value);
			return;
		}
		if ($term01.equalsIgnoreCase(name)) {
			term01(value);
			return;
		}
		if ($term02.equalsIgnoreCase(name)) {
			term02(value);
			return;
		}
		if ($term03.equalsIgnoreCase(name)) {
			term03(value);
			return;
		}
		if ($term04.equalsIgnoreCase(name)) {
			term04(value);
			return;
		}
		if ($pln00.equalsIgnoreCase(name)) {
			pln00(value);
			return;
		}
		if ($act00.equalsIgnoreCase(name)) {
			act00(value);
			return;
		}
		if ($pln01.equalsIgnoreCase(name)) {
			pln01(value);
			return;
		}
		if ($act01.equalsIgnoreCase(name)) {
			act01(value);
			return;
		}
		if ($pln02.equalsIgnoreCase(name)) {
			pln02(value);
			return;
		}
		if ($act02.equalsIgnoreCase(name)) {
			act02(value);
			return;
		}
		if ($pln03.equalsIgnoreCase(name)) {
			pln03(value);
			return;
		}
		if ($act03.equalsIgnoreCase(name)) {
			act03(value);
			return;
		}
		if ($pln04.equalsIgnoreCase(name)) {
			pln04(value);
			return;
		}
		if ($act04.equalsIgnoreCase(name)) {
			act04(value);
			return;
		}
		if ($pln05.equalsIgnoreCase(name)) {
			pln05(value);
			return;
		}
		if ($act05.equalsIgnoreCase(name)) {
			act05(value);
			return;
		}
		if ($pln06.equalsIgnoreCase(name)) {
			pln06(value);
			return;
		}
		if ($act06.equalsIgnoreCase(name)) {
			act06(value);
			return;
		}
		if ($pln07.equalsIgnoreCase(name)) {
			pln07(value);
			return;
		}
		if ($act07.equalsIgnoreCase(name)) {
			act07(value);
			return;
		}
		if ($pln08.equalsIgnoreCase(name)) {
			pln08(value);
			return;
		}
		if ($act08.equalsIgnoreCase(name)) {
			act08(value);
			return;
		}
		if ($pln09.equalsIgnoreCase(name)) {
			pln09(value);
			return;
		}
		if ($act09.equalsIgnoreCase(name)) {
			act09(value);
			return;
		}
		if ($pln10.equalsIgnoreCase(name)) {
			pln10(value);
			return;
		}
		if ($act10.equalsIgnoreCase(name)) {
			act10(value);
			return;
		}
		if ($pln11.equalsIgnoreCase(name)) {
			pln11(value);
			return;
		}
		if ($act11.equalsIgnoreCase(name)) {
			act11(value);
			return;
		}
		if ($pln12.equalsIgnoreCase(name)) {
			pln12(value);
			return;
		}
		if ($act12.equalsIgnoreCase(name)) {
			act12(value);
			return;
		}
		if ($pln13.equalsIgnoreCase(name)) {
			pln13(value);
			return;
		}
		if ($act13.equalsIgnoreCase(name)) {
			act13(value);
			return;
		}
		if ($pln14.equalsIgnoreCase(name)) {
			pln14(value);
			return;
		}
		if ($act14.equalsIgnoreCase(name)) {
			act14(value);
			return;
		}
		if ($pln15.equalsIgnoreCase(name)) {
			pln15(value);
			return;
		}
		if ($act15.equalsIgnoreCase(name)) {
			act15(value);
			return;
		}
		if ($pln16.equalsIgnoreCase(name)) {
			pln16(value);
			return;
		}
		if ($act16.equalsIgnoreCase(name)) {
			act16(value);
			return;
		}
		if ($pln17.equalsIgnoreCase(name)) {
			pln17(value);
			return;
		}
		if ($act17.equalsIgnoreCase(name)) {
			act17(value);
			return;
		}
		if ($pln18.equalsIgnoreCase(name)) {
			pln18(value);
			return;
		}
		if ($act18.equalsIgnoreCase(name)) {
			act18(value);
			return;
		}
		if ($pln19.equalsIgnoreCase(name)) {
			pln19(value);
			return;
		}
		if ($act19.equalsIgnoreCase(name)) {
			act19(value);
			return;
		}
		if ($pln20.equalsIgnoreCase(name)) {
			pln20(value);
			return;
		}
		if ($act20.equalsIgnoreCase(name)) {
			act20(value);
			return;
		}
		if ($pln21.equalsIgnoreCase(name)) {
			pln21(value);
			return;
		}
		if ($act21.equalsIgnoreCase(name)) {
			act21(value);
			return;
		}
		if ($pln22.equalsIgnoreCase(name)) {
			pln22(value);
			return;
		}
		if ($act22.equalsIgnoreCase(name)) {
			act22(value);
			return;
		}
		if ($pln23.equalsIgnoreCase(name)) {
			pln23(value);
			return;
		}
		if ($act23.equalsIgnoreCase(name)) {
			act23(value);
			return;
		}
		if ($pln24.equalsIgnoreCase(name)) {
			pln24(value);
			return;
		}
		if ($act24.equalsIgnoreCase(name)) {
			act24(value);
			return;
		}
		if ($pln25.equalsIgnoreCase(name)) {
			pln25(value);
			return;
		}
		if ($act25.equalsIgnoreCase(name)) {
			act25(value);
			return;
		}
		if ($pln26.equalsIgnoreCase(name)) {
			pln26(value);
			return;
		}
		if ($act26.equalsIgnoreCase(name)) {
			act26(value);
			return;
		}
		if ($pln27.equalsIgnoreCase(name)) {
			pln27(value);
			return;
		}
		if ($act27.equalsIgnoreCase(name)) {
			act27(value);
			return;
		}
		if ($pln28.equalsIgnoreCase(name)) {
			pln28(value);
			return;
		}
		if ($act28.equalsIgnoreCase(name)) {
			act28(value);
			return;
		}
		if ($pln29.equalsIgnoreCase(name)) {
			pln29(value);
			return;
		}
		if ($act29.equalsIgnoreCase(name)) {
			act29(value);
			return;
		}
		if ($pln30.equalsIgnoreCase(name)) {
			pln30(value);
			return;
		}
		if ($act30.equalsIgnoreCase(name)) {
			act30(value);
			return;
		}
		if ($pln31.equalsIgnoreCase(name)) {
			pln31(value);
			return;
		}
		if ($act31.equalsIgnoreCase(name)) {
			act31(value);
			return;
		}
		if ($pln32.equalsIgnoreCase(name)) {
			pln32(value);
			return;
		}
		if ($act32.equalsIgnoreCase(name)) {
			act32(value);
			return;
		}
		if ($pln33.equalsIgnoreCase(name)) {
			pln33(value);
			return;
		}
		if ($act33.equalsIgnoreCase(name)) {
			act33(value);
			return;
		}
		if ($pln34.equalsIgnoreCase(name)) {
			pln34(value);
			return;
		}
		if ($act34.equalsIgnoreCase(name)) {
			act34(value);
			return;
		}
		if ($pln35.equalsIgnoreCase(name)) {
			pln35(value);
			return;
		}
		if ($act35.equalsIgnoreCase(name)) {
			act35(value);
			return;
		}
		if ($pln36.equalsIgnoreCase(name)) {
			pln36(value);
			return;
		}
		if ($act36.equalsIgnoreCase(name)) {
			act36(value);
			return;
		}
		if ($pln37.equalsIgnoreCase(name)) {
			pln37(value);
			return;
		}
		if ($act37.equalsIgnoreCase(name)) {
			act37(value);
			return;
		}
		if ($pln38.equalsIgnoreCase(name)) {
			pln38(value);
			return;
		}
		if ($act38.equalsIgnoreCase(name)) {
			act38(value);
			return;
		}
		if ($pln39.equalsIgnoreCase(name)) {
			pln39(value);
			return;
		}
		if ($act39.equalsIgnoreCase(name)) {
			act39(value);
			return;
		}
		if ($pln40.equalsIgnoreCase(name)) {
			pln40(value);
			return;
		}
		if ($act40.equalsIgnoreCase(name)) {
			act40(value);
			return;
		}
		if ($pln41.equalsIgnoreCase(name)) {
			pln41(value);
			return;
		}
		if ($act41.equalsIgnoreCase(name)) {
			act41(value);
			return;
		}
		if ($pln42.equalsIgnoreCase(name)) {
			pln42(value);
			return;
		}
		if ($act42.equalsIgnoreCase(name)) {
			act42(value);
			return;
		}
		if ($pln43.equalsIgnoreCase(name)) {
			pln43(value);
			return;
		}
		if ($act43.equalsIgnoreCase(name)) {
			act43(value);
			return;
		}
		if ($pln44.equalsIgnoreCase(name)) {
			pln44(value);
			return;
		}
		if ($act44.equalsIgnoreCase(name)) {
			act44(value);
			return;
		}
		if ($pln45.equalsIgnoreCase(name)) {
			pln45(value);
			return;
		}
		if ($act45.equalsIgnoreCase(name)) {
			act45(value);
			return;
		}
		if ($pln46.equalsIgnoreCase(name)) {
			pln46(value);
			return;
		}
		if ($act46.equalsIgnoreCase(name)) {
			act46(value);
			return;
		}
		if ($pln47.equalsIgnoreCase(name)) {
			pln47(value);
			return;
		}
		if ($act47.equalsIgnoreCase(name)) {
			act47(value);
			return;
		}
		if ($pln48.equalsIgnoreCase(name)) {
			pln48(value);
			return;
		}
		if ($act48.equalsIgnoreCase(name)) {
			act48(value);
			return;
		}
		if ($pln49.equalsIgnoreCase(name)) {
			pln49(value);
			return;
		}
		if ($act49.equalsIgnoreCase(name)) {
			act49(value);
			return;
		}
		if ($pln50.equalsIgnoreCase(name)) {
			pln50(value);
			return;
		}
		if ($act50.equalsIgnoreCase(name)) {
			act50(value);
			return;
		}
		if ($pln51.equalsIgnoreCase(name)) {
			pln51(value);
			return;
		}
		if ($act51.equalsIgnoreCase(name)) {
			act51(value);
			return;
		}
		if ($pln52.equalsIgnoreCase(name)) {
			pln52(value);
			return;
		}
		if ($act52.equalsIgnoreCase(name)) {
			act52(value);
			return;
		}
		if ($pln53.equalsIgnoreCase(name)) {
			pln53(value);
			return;
		}
		if ($act53.equalsIgnoreCase(name)) {
			act53(value);
			return;
		}
		if ($pln54.equalsIgnoreCase(name)) {
			pln54(value);
			return;
		}
		if ($act54.equalsIgnoreCase(name)) {
			act54(value);
			return;
		}
		if ($pln55.equalsIgnoreCase(name)) {
			pln55(value);
			return;
		}
		if ($act55.equalsIgnoreCase(name)) {
			act55(value);
			return;
		}
		if ($pln56.equalsIgnoreCase(name)) {
			pln56(value);
			return;
		}
		if ($act56.equalsIgnoreCase(name)) {
			act56(value);
			return;
		}
		if ($pln57.equalsIgnoreCase(name)) {
			pln57(value);
			return;
		}
		if ($act57.equalsIgnoreCase(name)) {
			act57(value);
			return;
		}
		if ($pln58.equalsIgnoreCase(name)) {
			pln58(value);
			return;
		}
		if ($act58.equalsIgnoreCase(name)) {
			act58(value);
			return;
		}
		if ($pln59.equalsIgnoreCase(name)) {
			pln59(value);
			return;
		}
		if ($act59.equalsIgnoreCase(name)) {
			act59(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($term00.equalsIgnoreCase(name)) {
			term00(value);
			return;
		}
		if ($term01.equalsIgnoreCase(name)) {
			term01(value);
			return;
		}
		if ($term02.equalsIgnoreCase(name)) {
			term02(value);
			return;
		}
		if ($term03.equalsIgnoreCase(name)) {
			term03(value);
			return;
		}
		if ($term04.equalsIgnoreCase(name)) {
			term04(value);
			return;
		}
		if ($pln00.equalsIgnoreCase(name)) {
			pln00(value);
			return;
		}
		if ($act00.equalsIgnoreCase(name)) {
			act00(value);
			return;
		}
		if ($pln01.equalsIgnoreCase(name)) {
			pln01(value);
			return;
		}
		if ($act01.equalsIgnoreCase(name)) {
			act01(value);
			return;
		}
		if ($pln02.equalsIgnoreCase(name)) {
			pln02(value);
			return;
		}
		if ($act02.equalsIgnoreCase(name)) {
			act02(value);
			return;
		}
		if ($pln03.equalsIgnoreCase(name)) {
			pln03(value);
			return;
		}
		if ($act03.equalsIgnoreCase(name)) {
			act03(value);
			return;
		}
		if ($pln04.equalsIgnoreCase(name)) {
			pln04(value);
			return;
		}
		if ($act04.equalsIgnoreCase(name)) {
			act04(value);
			return;
		}
		if ($pln05.equalsIgnoreCase(name)) {
			pln05(value);
			return;
		}
		if ($act05.equalsIgnoreCase(name)) {
			act05(value);
			return;
		}
		if ($pln06.equalsIgnoreCase(name)) {
			pln06(value);
			return;
		}
		if ($act06.equalsIgnoreCase(name)) {
			act06(value);
			return;
		}
		if ($pln07.equalsIgnoreCase(name)) {
			pln07(value);
			return;
		}
		if ($act07.equalsIgnoreCase(name)) {
			act07(value);
			return;
		}
		if ($pln08.equalsIgnoreCase(name)) {
			pln08(value);
			return;
		}
		if ($act08.equalsIgnoreCase(name)) {
			act08(value);
			return;
		}
		if ($pln09.equalsIgnoreCase(name)) {
			pln09(value);
			return;
		}
		if ($act09.equalsIgnoreCase(name)) {
			act09(value);
			return;
		}
		if ($pln10.equalsIgnoreCase(name)) {
			pln10(value);
			return;
		}
		if ($act10.equalsIgnoreCase(name)) {
			act10(value);
			return;
		}
		if ($pln11.equalsIgnoreCase(name)) {
			pln11(value);
			return;
		}
		if ($act11.equalsIgnoreCase(name)) {
			act11(value);
			return;
		}
		if ($pln12.equalsIgnoreCase(name)) {
			pln12(value);
			return;
		}
		if ($act12.equalsIgnoreCase(name)) {
			act12(value);
			return;
		}
		if ($pln13.equalsIgnoreCase(name)) {
			pln13(value);
			return;
		}
		if ($act13.equalsIgnoreCase(name)) {
			act13(value);
			return;
		}
		if ($pln14.equalsIgnoreCase(name)) {
			pln14(value);
			return;
		}
		if ($act14.equalsIgnoreCase(name)) {
			act14(value);
			return;
		}
		if ($pln15.equalsIgnoreCase(name)) {
			pln15(value);
			return;
		}
		if ($act15.equalsIgnoreCase(name)) {
			act15(value);
			return;
		}
		if ($pln16.equalsIgnoreCase(name)) {
			pln16(value);
			return;
		}
		if ($act16.equalsIgnoreCase(name)) {
			act16(value);
			return;
		}
		if ($pln17.equalsIgnoreCase(name)) {
			pln17(value);
			return;
		}
		if ($act17.equalsIgnoreCase(name)) {
			act17(value);
			return;
		}
		if ($pln18.equalsIgnoreCase(name)) {
			pln18(value);
			return;
		}
		if ($act18.equalsIgnoreCase(name)) {
			act18(value);
			return;
		}
		if ($pln19.equalsIgnoreCase(name)) {
			pln19(value);
			return;
		}
		if ($act19.equalsIgnoreCase(name)) {
			act19(value);
			return;
		}
		if ($pln20.equalsIgnoreCase(name)) {
			pln20(value);
			return;
		}
		if ($act20.equalsIgnoreCase(name)) {
			act20(value);
			return;
		}
		if ($pln21.equalsIgnoreCase(name)) {
			pln21(value);
			return;
		}
		if ($act21.equalsIgnoreCase(name)) {
			act21(value);
			return;
		}
		if ($pln22.equalsIgnoreCase(name)) {
			pln22(value);
			return;
		}
		if ($act22.equalsIgnoreCase(name)) {
			act22(value);
			return;
		}
		if ($pln23.equalsIgnoreCase(name)) {
			pln23(value);
			return;
		}
		if ($act23.equalsIgnoreCase(name)) {
			act23(value);
			return;
		}
		if ($pln24.equalsIgnoreCase(name)) {
			pln24(value);
			return;
		}
		if ($act24.equalsIgnoreCase(name)) {
			act24(value);
			return;
		}
		if ($pln25.equalsIgnoreCase(name)) {
			pln25(value);
			return;
		}
		if ($act25.equalsIgnoreCase(name)) {
			act25(value);
			return;
		}
		if ($pln26.equalsIgnoreCase(name)) {
			pln26(value);
			return;
		}
		if ($act26.equalsIgnoreCase(name)) {
			act26(value);
			return;
		}
		if ($pln27.equalsIgnoreCase(name)) {
			pln27(value);
			return;
		}
		if ($act27.equalsIgnoreCase(name)) {
			act27(value);
			return;
		}
		if ($pln28.equalsIgnoreCase(name)) {
			pln28(value);
			return;
		}
		if ($act28.equalsIgnoreCase(name)) {
			act28(value);
			return;
		}
		if ($pln29.equalsIgnoreCase(name)) {
			pln29(value);
			return;
		}
		if ($act29.equalsIgnoreCase(name)) {
			act29(value);
			return;
		}
		if ($pln30.equalsIgnoreCase(name)) {
			pln30(value);
			return;
		}
		if ($act30.equalsIgnoreCase(name)) {
			act30(value);
			return;
		}
		if ($pln31.equalsIgnoreCase(name)) {
			pln31(value);
			return;
		}
		if ($act31.equalsIgnoreCase(name)) {
			act31(value);
			return;
		}
		if ($pln32.equalsIgnoreCase(name)) {
			pln32(value);
			return;
		}
		if ($act32.equalsIgnoreCase(name)) {
			act32(value);
			return;
		}
		if ($pln33.equalsIgnoreCase(name)) {
			pln33(value);
			return;
		}
		if ($act33.equalsIgnoreCase(name)) {
			act33(value);
			return;
		}
		if ($pln34.equalsIgnoreCase(name)) {
			pln34(value);
			return;
		}
		if ($act34.equalsIgnoreCase(name)) {
			act34(value);
			return;
		}
		if ($pln35.equalsIgnoreCase(name)) {
			pln35(value);
			return;
		}
		if ($act35.equalsIgnoreCase(name)) {
			act35(value);
			return;
		}
		if ($pln36.equalsIgnoreCase(name)) {
			pln36(value);
			return;
		}
		if ($act36.equalsIgnoreCase(name)) {
			act36(value);
			return;
		}
		if ($pln37.equalsIgnoreCase(name)) {
			pln37(value);
			return;
		}
		if ($act37.equalsIgnoreCase(name)) {
			act37(value);
			return;
		}
		if ($pln38.equalsIgnoreCase(name)) {
			pln38(value);
			return;
		}
		if ($act38.equalsIgnoreCase(name)) {
			act38(value);
			return;
		}
		if ($pln39.equalsIgnoreCase(name)) {
			pln39(value);
			return;
		}
		if ($act39.equalsIgnoreCase(name)) {
			act39(value);
			return;
		}
		if ($pln40.equalsIgnoreCase(name)) {
			pln40(value);
			return;
		}
		if ($act40.equalsIgnoreCase(name)) {
			act40(value);
			return;
		}
		if ($pln41.equalsIgnoreCase(name)) {
			pln41(value);
			return;
		}
		if ($act41.equalsIgnoreCase(name)) {
			act41(value);
			return;
		}
		if ($pln42.equalsIgnoreCase(name)) {
			pln42(value);
			return;
		}
		if ($act42.equalsIgnoreCase(name)) {
			act42(value);
			return;
		}
		if ($pln43.equalsIgnoreCase(name)) {
			pln43(value);
			return;
		}
		if ($act43.equalsIgnoreCase(name)) {
			act43(value);
			return;
		}
		if ($pln44.equalsIgnoreCase(name)) {
			pln44(value);
			return;
		}
		if ($act44.equalsIgnoreCase(name)) {
			act44(value);
			return;
		}
		if ($pln45.equalsIgnoreCase(name)) {
			pln45(value);
			return;
		}
		if ($act45.equalsIgnoreCase(name)) {
			act45(value);
			return;
		}
		if ($pln46.equalsIgnoreCase(name)) {
			pln46(value);
			return;
		}
		if ($act46.equalsIgnoreCase(name)) {
			act46(value);
			return;
		}
		if ($pln47.equalsIgnoreCase(name)) {
			pln47(value);
			return;
		}
		if ($act47.equalsIgnoreCase(name)) {
			act47(value);
			return;
		}
		if ($pln48.equalsIgnoreCase(name)) {
			pln48(value);
			return;
		}
		if ($act48.equalsIgnoreCase(name)) {
			act48(value);
			return;
		}
		if ($pln49.equalsIgnoreCase(name)) {
			pln49(value);
			return;
		}
		if ($act49.equalsIgnoreCase(name)) {
			act49(value);
			return;
		}
		if ($pln50.equalsIgnoreCase(name)) {
			pln50(value);
			return;
		}
		if ($act50.equalsIgnoreCase(name)) {
			act50(value);
			return;
		}
		if ($pln51.equalsIgnoreCase(name)) {
			pln51(value);
			return;
		}
		if ($act51.equalsIgnoreCase(name)) {
			act51(value);
			return;
		}
		if ($pln52.equalsIgnoreCase(name)) {
			pln52(value);
			return;
		}
		if ($act52.equalsIgnoreCase(name)) {
			act52(value);
			return;
		}
		if ($pln53.equalsIgnoreCase(name)) {
			pln53(value);
			return;
		}
		if ($act53.equalsIgnoreCase(name)) {
			act53(value);
			return;
		}
		if ($pln54.equalsIgnoreCase(name)) {
			pln54(value);
			return;
		}
		if ($act54.equalsIgnoreCase(name)) {
			act54(value);
			return;
		}
		if ($pln55.equalsIgnoreCase(name)) {
			pln55(value);
			return;
		}
		if ($act55.equalsIgnoreCase(name)) {
			act55(value);
			return;
		}
		if ($pln56.equalsIgnoreCase(name)) {
			pln56(value);
			return;
		}
		if ($act56.equalsIgnoreCase(name)) {
			act56(value);
			return;
		}
		if ($pln57.equalsIgnoreCase(name)) {
			pln57(value);
			return;
		}
		if ($act57.equalsIgnoreCase(name)) {
			act57(value);
			return;
		}
		if ($pln58.equalsIgnoreCase(name)) {
			pln58(value);
			return;
		}
		if ($act58.equalsIgnoreCase(name)) {
			act58(value);
			return;
		}
		if ($pln59.equalsIgnoreCase(name)) {
			pln59(value);
			return;
		}
		if ($act59.equalsIgnoreCase(name)) {
			act59(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($term00.equalsIgnoreCase(name)) {
			term00(value);
			return;
		}
		if ($term01.equalsIgnoreCase(name)) {
			term01(value);
			return;
		}
		if ($term02.equalsIgnoreCase(name)) {
			term02(value);
			return;
		}
		if ($term03.equalsIgnoreCase(name)) {
			term03(value);
			return;
		}
		if ($term04.equalsIgnoreCase(name)) {
			term04(value);
			return;
		}
		if ($pln00.equalsIgnoreCase(name)) {
			pln00(value);
			return;
		}
		if ($act00.equalsIgnoreCase(name)) {
			act00(value);
			return;
		}
		if ($pln01.equalsIgnoreCase(name)) {
			pln01(value);
			return;
		}
		if ($act01.equalsIgnoreCase(name)) {
			act01(value);
			return;
		}
		if ($pln02.equalsIgnoreCase(name)) {
			pln02(value);
			return;
		}
		if ($act02.equalsIgnoreCase(name)) {
			act02(value);
			return;
		}
		if ($pln03.equalsIgnoreCase(name)) {
			pln03(value);
			return;
		}
		if ($act03.equalsIgnoreCase(name)) {
			act03(value);
			return;
		}
		if ($pln04.equalsIgnoreCase(name)) {
			pln04(value);
			return;
		}
		if ($act04.equalsIgnoreCase(name)) {
			act04(value);
			return;
		}
		if ($pln05.equalsIgnoreCase(name)) {
			pln05(value);
			return;
		}
		if ($act05.equalsIgnoreCase(name)) {
			act05(value);
			return;
		}
		if ($pln06.equalsIgnoreCase(name)) {
			pln06(value);
			return;
		}
		if ($act06.equalsIgnoreCase(name)) {
			act06(value);
			return;
		}
		if ($pln07.equalsIgnoreCase(name)) {
			pln07(value);
			return;
		}
		if ($act07.equalsIgnoreCase(name)) {
			act07(value);
			return;
		}
		if ($pln08.equalsIgnoreCase(name)) {
			pln08(value);
			return;
		}
		if ($act08.equalsIgnoreCase(name)) {
			act08(value);
			return;
		}
		if ($pln09.equalsIgnoreCase(name)) {
			pln09(value);
			return;
		}
		if ($act09.equalsIgnoreCase(name)) {
			act09(value);
			return;
		}
		if ($pln10.equalsIgnoreCase(name)) {
			pln10(value);
			return;
		}
		if ($act10.equalsIgnoreCase(name)) {
			act10(value);
			return;
		}
		if ($pln11.equalsIgnoreCase(name)) {
			pln11(value);
			return;
		}
		if ($act11.equalsIgnoreCase(name)) {
			act11(value);
			return;
		}
		if ($pln12.equalsIgnoreCase(name)) {
			pln12(value);
			return;
		}
		if ($act12.equalsIgnoreCase(name)) {
			act12(value);
			return;
		}
		if ($pln13.equalsIgnoreCase(name)) {
			pln13(value);
			return;
		}
		if ($act13.equalsIgnoreCase(name)) {
			act13(value);
			return;
		}
		if ($pln14.equalsIgnoreCase(name)) {
			pln14(value);
			return;
		}
		if ($act14.equalsIgnoreCase(name)) {
			act14(value);
			return;
		}
		if ($pln15.equalsIgnoreCase(name)) {
			pln15(value);
			return;
		}
		if ($act15.equalsIgnoreCase(name)) {
			act15(value);
			return;
		}
		if ($pln16.equalsIgnoreCase(name)) {
			pln16(value);
			return;
		}
		if ($act16.equalsIgnoreCase(name)) {
			act16(value);
			return;
		}
		if ($pln17.equalsIgnoreCase(name)) {
			pln17(value);
			return;
		}
		if ($act17.equalsIgnoreCase(name)) {
			act17(value);
			return;
		}
		if ($pln18.equalsIgnoreCase(name)) {
			pln18(value);
			return;
		}
		if ($act18.equalsIgnoreCase(name)) {
			act18(value);
			return;
		}
		if ($pln19.equalsIgnoreCase(name)) {
			pln19(value);
			return;
		}
		if ($act19.equalsIgnoreCase(name)) {
			act19(value);
			return;
		}
		if ($pln20.equalsIgnoreCase(name)) {
			pln20(value);
			return;
		}
		if ($act20.equalsIgnoreCase(name)) {
			act20(value);
			return;
		}
		if ($pln21.equalsIgnoreCase(name)) {
			pln21(value);
			return;
		}
		if ($act21.equalsIgnoreCase(name)) {
			act21(value);
			return;
		}
		if ($pln22.equalsIgnoreCase(name)) {
			pln22(value);
			return;
		}
		if ($act22.equalsIgnoreCase(name)) {
			act22(value);
			return;
		}
		if ($pln23.equalsIgnoreCase(name)) {
			pln23(value);
			return;
		}
		if ($act23.equalsIgnoreCase(name)) {
			act23(value);
			return;
		}
		if ($pln24.equalsIgnoreCase(name)) {
			pln24(value);
			return;
		}
		if ($act24.equalsIgnoreCase(name)) {
			act24(value);
			return;
		}
		if ($pln25.equalsIgnoreCase(name)) {
			pln25(value);
			return;
		}
		if ($act25.equalsIgnoreCase(name)) {
			act25(value);
			return;
		}
		if ($pln26.equalsIgnoreCase(name)) {
			pln26(value);
			return;
		}
		if ($act26.equalsIgnoreCase(name)) {
			act26(value);
			return;
		}
		if ($pln27.equalsIgnoreCase(name)) {
			pln27(value);
			return;
		}
		if ($act27.equalsIgnoreCase(name)) {
			act27(value);
			return;
		}
		if ($pln28.equalsIgnoreCase(name)) {
			pln28(value);
			return;
		}
		if ($act28.equalsIgnoreCase(name)) {
			act28(value);
			return;
		}
		if ($pln29.equalsIgnoreCase(name)) {
			pln29(value);
			return;
		}
		if ($act29.equalsIgnoreCase(name)) {
			act29(value);
			return;
		}
		if ($pln30.equalsIgnoreCase(name)) {
			pln30(value);
			return;
		}
		if ($act30.equalsIgnoreCase(name)) {
			act30(value);
			return;
		}
		if ($pln31.equalsIgnoreCase(name)) {
			pln31(value);
			return;
		}
		if ($act31.equalsIgnoreCase(name)) {
			act31(value);
			return;
		}
		if ($pln32.equalsIgnoreCase(name)) {
			pln32(value);
			return;
		}
		if ($act32.equalsIgnoreCase(name)) {
			act32(value);
			return;
		}
		if ($pln33.equalsIgnoreCase(name)) {
			pln33(value);
			return;
		}
		if ($act33.equalsIgnoreCase(name)) {
			act33(value);
			return;
		}
		if ($pln34.equalsIgnoreCase(name)) {
			pln34(value);
			return;
		}
		if ($act34.equalsIgnoreCase(name)) {
			act34(value);
			return;
		}
		if ($pln35.equalsIgnoreCase(name)) {
			pln35(value);
			return;
		}
		if ($act35.equalsIgnoreCase(name)) {
			act35(value);
			return;
		}
		if ($pln36.equalsIgnoreCase(name)) {
			pln36(value);
			return;
		}
		if ($act36.equalsIgnoreCase(name)) {
			act36(value);
			return;
		}
		if ($pln37.equalsIgnoreCase(name)) {
			pln37(value);
			return;
		}
		if ($act37.equalsIgnoreCase(name)) {
			act37(value);
			return;
		}
		if ($pln38.equalsIgnoreCase(name)) {
			pln38(value);
			return;
		}
		if ($act38.equalsIgnoreCase(name)) {
			act38(value);
			return;
		}
		if ($pln39.equalsIgnoreCase(name)) {
			pln39(value);
			return;
		}
		if ($act39.equalsIgnoreCase(name)) {
			act39(value);
			return;
		}
		if ($pln40.equalsIgnoreCase(name)) {
			pln40(value);
			return;
		}
		if ($act40.equalsIgnoreCase(name)) {
			act40(value);
			return;
		}
		if ($pln41.equalsIgnoreCase(name)) {
			pln41(value);
			return;
		}
		if ($act41.equalsIgnoreCase(name)) {
			act41(value);
			return;
		}
		if ($pln42.equalsIgnoreCase(name)) {
			pln42(value);
			return;
		}
		if ($act42.equalsIgnoreCase(name)) {
			act42(value);
			return;
		}
		if ($pln43.equalsIgnoreCase(name)) {
			pln43(value);
			return;
		}
		if ($act43.equalsIgnoreCase(name)) {
			act43(value);
			return;
		}
		if ($pln44.equalsIgnoreCase(name)) {
			pln44(value);
			return;
		}
		if ($act44.equalsIgnoreCase(name)) {
			act44(value);
			return;
		}
		if ($pln45.equalsIgnoreCase(name)) {
			pln45(value);
			return;
		}
		if ($act45.equalsIgnoreCase(name)) {
			act45(value);
			return;
		}
		if ($pln46.equalsIgnoreCase(name)) {
			pln46(value);
			return;
		}
		if ($act46.equalsIgnoreCase(name)) {
			act46(value);
			return;
		}
		if ($pln47.equalsIgnoreCase(name)) {
			pln47(value);
			return;
		}
		if ($act47.equalsIgnoreCase(name)) {
			act47(value);
			return;
		}
		if ($pln48.equalsIgnoreCase(name)) {
			pln48(value);
			return;
		}
		if ($act48.equalsIgnoreCase(name)) {
			act48(value);
			return;
		}
		if ($pln49.equalsIgnoreCase(name)) {
			pln49(value);
			return;
		}
		if ($act49.equalsIgnoreCase(name)) {
			act49(value);
			return;
		}
		if ($pln50.equalsIgnoreCase(name)) {
			pln50(value);
			return;
		}
		if ($act50.equalsIgnoreCase(name)) {
			act50(value);
			return;
		}
		if ($pln51.equalsIgnoreCase(name)) {
			pln51(value);
			return;
		}
		if ($act51.equalsIgnoreCase(name)) {
			act51(value);
			return;
		}
		if ($pln52.equalsIgnoreCase(name)) {
			pln52(value);
			return;
		}
		if ($act52.equalsIgnoreCase(name)) {
			act52(value);
			return;
		}
		if ($pln53.equalsIgnoreCase(name)) {
			pln53(value);
			return;
		}
		if ($act53.equalsIgnoreCase(name)) {
			act53(value);
			return;
		}
		if ($pln54.equalsIgnoreCase(name)) {
			pln54(value);
			return;
		}
		if ($act54.equalsIgnoreCase(name)) {
			act54(value);
			return;
		}
		if ($pln55.equalsIgnoreCase(name)) {
			pln55(value);
			return;
		}
		if ($act55.equalsIgnoreCase(name)) {
			act55(value);
			return;
		}
		if ($pln56.equalsIgnoreCase(name)) {
			pln56(value);
			return;
		}
		if ($act56.equalsIgnoreCase(name)) {
			act56(value);
			return;
		}
		if ($pln57.equalsIgnoreCase(name)) {
			pln57(value);
			return;
		}
		if ($act57.equalsIgnoreCase(name)) {
			act57(value);
			return;
		}
		if ($pln58.equalsIgnoreCase(name)) {
			pln58(value);
			return;
		}
		if ($act58.equalsIgnoreCase(name)) {
			act58(value);
			return;
		}
		if ($pln59.equalsIgnoreCase(name)) {
			pln59(value);
			return;
		}
		if ($act59.equalsIgnoreCase(name)) {
			act59(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

}

