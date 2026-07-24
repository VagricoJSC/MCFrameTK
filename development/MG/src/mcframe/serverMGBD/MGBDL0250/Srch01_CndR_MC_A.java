package mcframe.serverMGBD.MGBDL0250;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ym_fr = "ym_fr";
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public static final String $ym_to = "ym_to";
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
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
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
	 * Allocation source WG cd. 配賦元ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $src_wg_cd = "src_wg_cd";
	/**
	 * Allocation source WG name 配賦元ワーキンググループ名.<p>
	 *
	 */
	public static final String $src_wg_nm = "src_wg_nm";
	/**
	 * Allocation source allocation account cd. 配賦元配賦科目ＣＤ.<p>
	 *
	 */
	public static final String $src_alc_ac_cd = "src_alc_ac_cd";
	/**
	 * Allocation source allocation account name 配賦元配賦科目名.<p>
	 *
	 */
	public static final String $src_alc_ac_nm = "src_alc_ac_nm";
	/**
	 * Allocation source allocation account group cd. 1 配賦元配賦科目グループＣＤ１.<p>
	 *
	 */
	public static final String $src_alc_ac_grp_cd1 = "src_alc_ac_grp_cd1";
	/**
	 * Allocation source allocation account group name 1 配賦元配賦科目グループ名１.<p>
	 *
	 */
	public static final String $src_alc_ac_grp_nm1 = "src_alc_ac_grp_nm1";
	/**
	 * Allocating source allocation account group cd. 2 配賦元配賦科目グループＣＤ２.<p>
	 *
	 */
	public static final String $src_alc_ac_grp_cd2 = "src_alc_ac_grp_cd2";
	/**
	 * Allocating source allocation account group name 2 配賦元配賦科目グループ名２.<p>
	 *
	 */
	public static final String $src_alc_ac_grp_nm2 = "src_alc_ac_grp_nm2";
	/**
	 * Allocating source allocation account group cd. 3 配賦元配賦科目グループＣＤ３.<p>
	 *
	 */
	public static final String $src_alc_ac_grp_cd3 = "src_alc_ac_grp_cd3";
	/**
	 * Allocating source allocation account group name 3 配賦元配賦科目グループ名３.<p>
	 *
	 */
	public static final String $src_alc_ac_grp_nm3 = "src_alc_ac_grp_nm3";
	/**
	 * Allocated WG cd. 配賦先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $dest_wg_cd = "dest_wg_cd";
	/**
	 * Allocated WG name 配賦先ワーキンググループ名.<p>
	 *
	 */
	public static final String $dest_wg_nm = "dest_wg_nm";
	/**
	 * Allocation destination allocation account cd. 配賦先配賦科目ＣＤ.<p>
	 *
	 */
	public static final String $dest_alc_ac_cd = "dest_alc_ac_cd";
	/**
	 * Allocation destination allocation account name 配賦先配賦科目名.<p>
	 *
	 */
	public static final String $dest_alc_ac_nm = "dest_alc_ac_nm";
	/**
	 * Allocation destination allocation account group cd. 1 配賦先配賦科目グループＣＤ１.<p>
	 *
	 */
	public static final String $dest_alc_ac_grp_cd1 = "dest_alc_ac_grp_cd1";
	/**
	 * Allocation destination allocation account group name 1 配賦先配賦科目グループ名１.<p>
	 *
	 */
	public static final String $dest_alc_ac_grp_nm1 = "dest_alc_ac_grp_nm1";
	/**
	 * Allocated destination allocation account group cd. 2 配賦先配賦科目グループＣＤ２.<p>
	 *
	 */
	public static final String $dest_alc_ac_grp_cd2 = "dest_alc_ac_grp_cd2";
	/**
	 * Allocated destination allocation account group name 2 配賦先配賦科目グループ名２.<p>
	 *
	 */
	public static final String $dest_alc_ac_grp_nm2 = "dest_alc_ac_grp_nm2";
	/**
	 * Allocated destination allocation account group cd. 3 配賦先配賦科目グループＣＤ３.<p>
	 *
	 */
	public static final String $dest_alc_ac_grp_cd3 = "dest_alc_ac_grp_cd3";
	/**
	 * Allocated destination allocation account group name 3 配賦先配賦科目グループ名３.<p>
	 *
	 */
	public static final String $dest_alc_ac_grp_nm3 = "dest_alc_ac_grp_nm3";
	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public static final String $pre_alc_lvl_flg = "pre_alc_lvl_flg";
	/**
	 * Allocation source WG 配賦元ワーキンググループ.<p>
	 *
	 */
	public static final String $src_wg_flg = "src_wg_flg";
	/**
	 * Allocation source allocation account 配賦元配賦科目.<p>
	 *
	 */
	public static final String $src_alc_ac_flg = "src_alc_ac_flg";
	/**
	 * Allocation destination WG 配賦先ワーキンググループ.<p>
	 *
	 */
	public static final String $dest_wg_flg = "dest_wg_flg";
	/**
	 * Allocation destination allocation account 配賦先配賦科目.<p>
	 *
	 */
	public static final String $dest_alc_ac_flg = "dest_alc_ac_flg";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym_flg = "ym_flg";
	/**
	 * Dept. 部門.<p>
	 *
	 */
	public static final String $dpt_flg = "dpt_flg";
	/**
	 * Location 場所.<p>
	 *
	 */
	public static final String $loc_flg = "loc_flg";
	/**
	 * Operation 工程.<p>
	 *
	 */
	public static final String $oper_flg = "oper_flg";
	/**
	 * BP 取引先.<p>
	 *
	 */
	public static final String $bp_flg = "bp_flg";
	/**
	 * Item category 品群.<p>
	 *
	 */
	public static final String $ctg_flg = "ctg_flg";
	/**
	 * Item 品目.<p>
	 *
	 */
	public static final String $itm_flg = "itm_flg";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ_flg = "itm_typ_flg";
	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public static final String $itm_typ_d_flg = "itm_typ_d_flg";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_flg = "lot_flg";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_flg = "sublot_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1_flg = "sno1_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2_flg = "sno2_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3_flg = "sno3_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4_flg = "sno4_flg";
	/**
	 * Item mfg. order 品目製造指図.<p>
	 *
	 */
	public static final String $itm_mfg_inst_flg = "itm_mfg_inst_flg";
	/**
	 * Invoice インボイス.<p>
	 *
	 */
	public static final String $iv_flg = "iv_flg";
	/**
	 * PO 発注.<p>
	 *
	 */
	public static final String $po_flg = "po_flg";
	/**
	 * Sales order 受注.<p>
	 *
	 */
	public static final String $slo_flg = "slo_flg";
	public static final String $down0_flg = "down0_flg";
	public static final String $down1_flg = "down1_flg";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta ym_fr_META = createCommonMeta($ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_to_META = createCommonMeta($ym_to, mcframe.commonMA.meta.MA_META.YM);
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
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
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
	public static final MCMeta src_wg_cd_META = createCommonMeta($src_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta src_wg_nm_META = createCommonMeta($src_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta src_alc_ac_cd_META = createCommonMeta($src_alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta src_alc_ac_nm_META = createCommonMeta($src_alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta src_alc_ac_grp_cd1_META = createCommonMeta($src_alc_ac_grp_cd1, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta src_alc_ac_grp_nm1_META = createCommonMeta($src_alc_ac_grp_nm1, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta src_alc_ac_grp_cd2_META = createCommonMeta($src_alc_ac_grp_cd2, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta src_alc_ac_grp_nm2_META = createCommonMeta($src_alc_ac_grp_nm2, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta src_alc_ac_grp_cd3_META = createCommonMeta($src_alc_ac_grp_cd3, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta src_alc_ac_grp_nm3_META = createCommonMeta($src_alc_ac_grp_nm3, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta dest_wg_cd_META = createCommonMeta($dest_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dest_wg_nm_META = createCommonMeta($dest_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dest_alc_ac_cd_META = createCommonMeta($dest_alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta dest_alc_ac_nm_META = createCommonMeta($dest_alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta dest_alc_ac_grp_cd1_META = createCommonMeta($dest_alc_ac_grp_cd1, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta dest_alc_ac_grp_nm1_META = createCommonMeta($dest_alc_ac_grp_nm1, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta dest_alc_ac_grp_cd2_META = createCommonMeta($dest_alc_ac_grp_cd2, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta dest_alc_ac_grp_nm2_META = createCommonMeta($dest_alc_ac_grp_nm2, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta dest_alc_ac_grp_cd3_META = createCommonMeta($dest_alc_ac_grp_cd3, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta dest_alc_ac_grp_nm3_META = createCommonMeta($dest_alc_ac_grp_nm3, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_NM);
	public static final MCMeta pre_alc_lvl_flg_META = createCommonMeta($pre_alc_lvl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta src_wg_flg_META = createCommonMeta($src_wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta src_alc_ac_flg_META = createCommonMeta($src_alc_ac_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_wg_flg_META = createCommonMeta($dest_wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_alc_ac_flg_META = createCommonMeta($dest_alc_ac_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ym_flg_META = createCommonMeta($ym_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_flg_META = createCommonMeta($dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_flg_META = createCommonMeta($loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_flg_META = createCommonMeta($oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_flg_META = createCommonMeta($bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ctg_flg_META = createCommonMeta($ctg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_flg_META = createCommonMeta($itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_typ_flg_META = createCommonMeta($itm_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_typ_d_flg_META = createCommonMeta($itm_typ_d_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_flg_META = createCommonMeta($lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_flg_META = createCommonMeta($sublot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_flg_META = createCommonMeta($sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_flg_META = createCommonMeta($sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_flg_META = createCommonMeta($sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_flg_META = createCommonMeta($sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_mfg_inst_flg_META = createCommonMeta($itm_mfg_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_flg_META = createCommonMeta($iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_flg_META = createCommonMeta($po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_flg_META = createCommonMeta($slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta down0_flg_META = createCommonMeta($down0_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta down1_flg_META = createCommonMeta($down1_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			calc_grp_cd_META,
			calc_no_META,
			ym_fr_META,
			ym_to_META,
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
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
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
			src_wg_cd_META,
			src_wg_nm_META,
			src_alc_ac_cd_META,
			src_alc_ac_nm_META,
			src_alc_ac_grp_cd1_META,
			src_alc_ac_grp_nm1_META,
			src_alc_ac_grp_cd2_META,
			src_alc_ac_grp_nm2_META,
			src_alc_ac_grp_cd3_META,
			src_alc_ac_grp_nm3_META,
			dest_wg_cd_META,
			dest_wg_nm_META,
			dest_alc_ac_cd_META,
			dest_alc_ac_nm_META,
			dest_alc_ac_grp_cd1_META,
			dest_alc_ac_grp_nm1_META,
			dest_alc_ac_grp_cd2_META,
			dest_alc_ac_grp_nm2_META,
			dest_alc_ac_grp_cd3_META,
			dest_alc_ac_grp_nm3_META,
			pre_alc_lvl_flg_META,
			src_wg_flg_META,
			src_alc_ac_flg_META,
			dest_wg_flg_META,
			dest_alc_ac_flg_META,
			ym_flg_META,
			dpt_flg_META,
			loc_flg_META,
			oper_flg_META,
			bp_flg_META,
			ctg_flg_META,
			itm_flg_META,
			itm_typ_flg_META,
			itm_typ_d_flg_META,
			lot_flg_META,
			sublot_flg_META,
			sno1_flg_META,
			sno2_flg_META,
			sno3_flg_META,
			sno4_flg_META,
			itm_mfg_inst_flg_META,
			iv_flg_META,
			po_flg_META,
			slo_flg_META,
			down0_flg_META,
			down1_flg_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}


	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 2, $calc_no);
	}

	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 2, $calc_no, value);
	}


	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ym_fr() {
		return getConstDate(offset + 3, $ym_fr);
	}

	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public void ym_fr(MCDate value) {
		setConstDate(offset + 3, $ym_fr, value);
	}


	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDate ym_to() {
		return getConstDate(offset + 4, $ym_to);
	}

	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public void ym_to(MCDate value) {
		setConstDate(offset + 4, $ym_to, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 5, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 5, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 6, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 6, $dpt_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 7, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 7, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 8, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 8, $loc_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 9, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 9, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 10, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 10, $oper_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 11, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 11, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 12, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 12, $bp_nm, value);
	}


	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 13, $ctg_cd);
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 13, $ctg_cd, value);
	}


	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public String ctg_nm() {
		return getConstString(offset + 14, $ctg_nm);
	}

	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public void ctg_nm(String value) {
		setConstString(offset + 14, $ctg_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 15, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 15, $itm_typ, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 16, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 16, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 17, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 17, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 18, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 18, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 19, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 19, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 20, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 20, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 21, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 21, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 22, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 22, $itm_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 23, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 23, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 24, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 24, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 25, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 25, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 26, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 26, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 27, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 27, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 28, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 28, $sno4, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 29, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 29, $itm_mfg_inst_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 30, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 30, $iv_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 31, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 31, $po_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 32, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 32, $slo_no, value);
	}


	/**
	 * Allocation source WG cd. 配賦元ワーキンググループＣＤ.<p>
	 *
	 */
	public String src_wg_cd() {
		return getConstString(offset + 33, $src_wg_cd);
	}

	/**
	 * Allocation source WG cd. 配賦元ワーキンググループＣＤ.<p>
	 *
	 */
	public void src_wg_cd(String value) {
		setConstString(offset + 33, $src_wg_cd, value);
	}


	/**
	 * Allocation source WG name 配賦元ワーキンググループ名.<p>
	 *
	 */
	public String src_wg_nm() {
		return getConstString(offset + 34, $src_wg_nm);
	}

	/**
	 * Allocation source WG name 配賦元ワーキンググループ名.<p>
	 *
	 */
	public void src_wg_nm(String value) {
		setConstString(offset + 34, $src_wg_nm, value);
	}


	/**
	 * Allocation source allocation account cd. 配賦元配賦科目ＣＤ.<p>
	 *
	 */
	public String src_alc_ac_cd() {
		return getConstString(offset + 35, $src_alc_ac_cd);
	}

	/**
	 * Allocation source allocation account cd. 配賦元配賦科目ＣＤ.<p>
	 *
	 */
	public void src_alc_ac_cd(String value) {
		setConstString(offset + 35, $src_alc_ac_cd, value);
	}


	/**
	 * Allocation source allocation account name 配賦元配賦科目名.<p>
	 *
	 */
	public String src_alc_ac_nm() {
		return getConstString(offset + 36, $src_alc_ac_nm);
	}

	/**
	 * Allocation source allocation account name 配賦元配賦科目名.<p>
	 *
	 */
	public void src_alc_ac_nm(String value) {
		setConstString(offset + 36, $src_alc_ac_nm, value);
	}


	/**
	 * Allocation source allocation account group cd. 1 配賦元配賦科目グループＣＤ１.<p>
	 *
	 */
	public String src_alc_ac_grp_cd1() {
		return getConstString(offset + 37, $src_alc_ac_grp_cd1);
	}

	/**
	 * Allocation source allocation account group cd. 1 配賦元配賦科目グループＣＤ１.<p>
	 *
	 */
	public void src_alc_ac_grp_cd1(String value) {
		setConstString(offset + 37, $src_alc_ac_grp_cd1, value);
	}


	/**
	 * Allocation source allocation account group name 1 配賦元配賦科目グループ名１.<p>
	 *
	 */
	public String src_alc_ac_grp_nm1() {
		return getConstString(offset + 38, $src_alc_ac_grp_nm1);
	}

	/**
	 * Allocation source allocation account group name 1 配賦元配賦科目グループ名１.<p>
	 *
	 */
	public void src_alc_ac_grp_nm1(String value) {
		setConstString(offset + 38, $src_alc_ac_grp_nm1, value);
	}


	/**
	 * Allocating source allocation account group cd. 2 配賦元配賦科目グループＣＤ２.<p>
	 *
	 */
	public String src_alc_ac_grp_cd2() {
		return getConstString(offset + 39, $src_alc_ac_grp_cd2);
	}

	/**
	 * Allocating source allocation account group cd. 2 配賦元配賦科目グループＣＤ２.<p>
	 *
	 */
	public void src_alc_ac_grp_cd2(String value) {
		setConstString(offset + 39, $src_alc_ac_grp_cd2, value);
	}


	/**
	 * Allocating source allocation account group name 2 配賦元配賦科目グループ名２.<p>
	 *
	 */
	public String src_alc_ac_grp_nm2() {
		return getConstString(offset + 40, $src_alc_ac_grp_nm2);
	}

	/**
	 * Allocating source allocation account group name 2 配賦元配賦科目グループ名２.<p>
	 *
	 */
	public void src_alc_ac_grp_nm2(String value) {
		setConstString(offset + 40, $src_alc_ac_grp_nm2, value);
	}


	/**
	 * Allocating source allocation account group cd. 3 配賦元配賦科目グループＣＤ３.<p>
	 *
	 */
	public String src_alc_ac_grp_cd3() {
		return getConstString(offset + 41, $src_alc_ac_grp_cd3);
	}

	/**
	 * Allocating source allocation account group cd. 3 配賦元配賦科目グループＣＤ３.<p>
	 *
	 */
	public void src_alc_ac_grp_cd3(String value) {
		setConstString(offset + 41, $src_alc_ac_grp_cd3, value);
	}


	/**
	 * Allocating source allocation account group name 3 配賦元配賦科目グループ名３.<p>
	 *
	 */
	public String src_alc_ac_grp_nm3() {
		return getConstString(offset + 42, $src_alc_ac_grp_nm3);
	}

	/**
	 * Allocating source allocation account group name 3 配賦元配賦科目グループ名３.<p>
	 *
	 */
	public void src_alc_ac_grp_nm3(String value) {
		setConstString(offset + 42, $src_alc_ac_grp_nm3, value);
	}


	/**
	 * Allocated WG cd. 配賦先ワーキンググループＣＤ.<p>
	 *
	 */
	public String dest_wg_cd() {
		return getConstString(offset + 43, $dest_wg_cd);
	}

	/**
	 * Allocated WG cd. 配賦先ワーキンググループＣＤ.<p>
	 *
	 */
	public void dest_wg_cd(String value) {
		setConstString(offset + 43, $dest_wg_cd, value);
	}


	/**
	 * Allocated WG name 配賦先ワーキンググループ名.<p>
	 *
	 */
	public String dest_wg_nm() {
		return getConstString(offset + 44, $dest_wg_nm);
	}

	/**
	 * Allocated WG name 配賦先ワーキンググループ名.<p>
	 *
	 */
	public void dest_wg_nm(String value) {
		setConstString(offset + 44, $dest_wg_nm, value);
	}


	/**
	 * Allocation destination allocation account cd. 配賦先配賦科目ＣＤ.<p>
	 *
	 */
	public String dest_alc_ac_cd() {
		return getConstString(offset + 45, $dest_alc_ac_cd);
	}

	/**
	 * Allocation destination allocation account cd. 配賦先配賦科目ＣＤ.<p>
	 *
	 */
	public void dest_alc_ac_cd(String value) {
		setConstString(offset + 45, $dest_alc_ac_cd, value);
	}


	/**
	 * Allocation destination allocation account name 配賦先配賦科目名.<p>
	 *
	 */
	public String dest_alc_ac_nm() {
		return getConstString(offset + 46, $dest_alc_ac_nm);
	}

	/**
	 * Allocation destination allocation account name 配賦先配賦科目名.<p>
	 *
	 */
	public void dest_alc_ac_nm(String value) {
		setConstString(offset + 46, $dest_alc_ac_nm, value);
	}


	/**
	 * Allocation destination allocation account group cd. 1 配賦先配賦科目グループＣＤ１.<p>
	 *
	 */
	public String dest_alc_ac_grp_cd1() {
		return getConstString(offset + 47, $dest_alc_ac_grp_cd1);
	}

	/**
	 * Allocation destination allocation account group cd. 1 配賦先配賦科目グループＣＤ１.<p>
	 *
	 */
	public void dest_alc_ac_grp_cd1(String value) {
		setConstString(offset + 47, $dest_alc_ac_grp_cd1, value);
	}


	/**
	 * Allocation destination allocation account group name 1 配賦先配賦科目グループ名１.<p>
	 *
	 */
	public String dest_alc_ac_grp_nm1() {
		return getConstString(offset + 48, $dest_alc_ac_grp_nm1);
	}

	/**
	 * Allocation destination allocation account group name 1 配賦先配賦科目グループ名１.<p>
	 *
	 */
	public void dest_alc_ac_grp_nm1(String value) {
		setConstString(offset + 48, $dest_alc_ac_grp_nm1, value);
	}


	/**
	 * Allocated destination allocation account group cd. 2 配賦先配賦科目グループＣＤ２.<p>
	 *
	 */
	public String dest_alc_ac_grp_cd2() {
		return getConstString(offset + 49, $dest_alc_ac_grp_cd2);
	}

	/**
	 * Allocated destination allocation account group cd. 2 配賦先配賦科目グループＣＤ２.<p>
	 *
	 */
	public void dest_alc_ac_grp_cd2(String value) {
		setConstString(offset + 49, $dest_alc_ac_grp_cd2, value);
	}


	/**
	 * Allocated destination allocation account group name 2 配賦先配賦科目グループ名２.<p>
	 *
	 */
	public String dest_alc_ac_grp_nm2() {
		return getConstString(offset + 50, $dest_alc_ac_grp_nm2);
	}

	/**
	 * Allocated destination allocation account group name 2 配賦先配賦科目グループ名２.<p>
	 *
	 */
	public void dest_alc_ac_grp_nm2(String value) {
		setConstString(offset + 50, $dest_alc_ac_grp_nm2, value);
	}


	/**
	 * Allocated destination allocation account group cd. 3 配賦先配賦科目グループＣＤ３.<p>
	 *
	 */
	public String dest_alc_ac_grp_cd3() {
		return getConstString(offset + 51, $dest_alc_ac_grp_cd3);
	}

	/**
	 * Allocated destination allocation account group cd. 3 配賦先配賦科目グループＣＤ３.<p>
	 *
	 */
	public void dest_alc_ac_grp_cd3(String value) {
		setConstString(offset + 51, $dest_alc_ac_grp_cd3, value);
	}


	/**
	 * Allocated destination allocation account group name 3 配賦先配賦科目グループ名３.<p>
	 *
	 */
	public String dest_alc_ac_grp_nm3() {
		return getConstString(offset + 52, $dest_alc_ac_grp_nm3);
	}

	/**
	 * Allocated destination allocation account group name 3 配賦先配賦科目グループ名３.<p>
	 *
	 */
	public void dest_alc_ac_grp_nm3(String value) {
		setConstString(offset + 52, $dest_alc_ac_grp_nm3, value);
	}


	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public boolean pre_alc_lvl_flg() {
		return getConstBoolean(offset + 53, $pre_alc_lvl_flg);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void pre_alc_lvl_flg(boolean value) {
		setConstBoolean(offset + 53, $pre_alc_lvl_flg, value);
	}


	/**
	 * Allocation source WG 配賦元ワーキンググループ.<p>
	 *
	 */
	public boolean src_wg_flg() {
		return getConstBoolean(offset + 54, $src_wg_flg);
	}

	/**
	 * Allocation source WG 配賦元ワーキンググループ.<p>
	 *
	 */
	public void src_wg_flg(boolean value) {
		setConstBoolean(offset + 54, $src_wg_flg, value);
	}


	/**
	 * Allocation source allocation account 配賦元配賦科目.<p>
	 *
	 */
	public boolean src_alc_ac_flg() {
		return getConstBoolean(offset + 55, $src_alc_ac_flg);
	}

	/**
	 * Allocation source allocation account 配賦元配賦科目.<p>
	 *
	 */
	public void src_alc_ac_flg(boolean value) {
		setConstBoolean(offset + 55, $src_alc_ac_flg, value);
	}


	/**
	 * Allocation destination WG 配賦先ワーキンググループ.<p>
	 *
	 */
	public boolean dest_wg_flg() {
		return getConstBoolean(offset + 56, $dest_wg_flg);
	}

	/**
	 * Allocation destination WG 配賦先ワーキンググループ.<p>
	 *
	 */
	public void dest_wg_flg(boolean value) {
		setConstBoolean(offset + 56, $dest_wg_flg, value);
	}


	/**
	 * Allocation destination allocation account 配賦先配賦科目.<p>
	 *
	 */
	public boolean dest_alc_ac_flg() {
		return getConstBoolean(offset + 57, $dest_alc_ac_flg);
	}

	/**
	 * Allocation destination allocation account 配賦先配賦科目.<p>
	 *
	 */
	public void dest_alc_ac_flg(boolean value) {
		setConstBoolean(offset + 57, $dest_alc_ac_flg, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public boolean ym_flg() {
		return getConstBoolean(offset + 58, $ym_flg);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym_flg(boolean value) {
		setConstBoolean(offset + 58, $ym_flg, value);
	}


	/**
	 * Dept. 部門.<p>
	 *
	 */
	public boolean dpt_flg() {
		return getConstBoolean(offset + 59, $dpt_flg);
	}

	/**
	 * Dept. 部門.<p>
	 *
	 */
	public void dpt_flg(boolean value) {
		setConstBoolean(offset + 59, $dpt_flg, value);
	}


	/**
	 * Location 場所.<p>
	 *
	 */
	public boolean loc_flg() {
		return getConstBoolean(offset + 60, $loc_flg);
	}

	/**
	 * Location 場所.<p>
	 *
	 */
	public void loc_flg(boolean value) {
		setConstBoolean(offset + 60, $loc_flg, value);
	}


	/**
	 * Operation 工程.<p>
	 *
	 */
	public boolean oper_flg() {
		return getConstBoolean(offset + 61, $oper_flg);
	}

	/**
	 * Operation 工程.<p>
	 *
	 */
	public void oper_flg(boolean value) {
		setConstBoolean(offset + 61, $oper_flg, value);
	}


	/**
	 * BP 取引先.<p>
	 *
	 */
	public boolean bp_flg() {
		return getConstBoolean(offset + 62, $bp_flg);
	}

	/**
	 * BP 取引先.<p>
	 *
	 */
	public void bp_flg(boolean value) {
		setConstBoolean(offset + 62, $bp_flg, value);
	}


	/**
	 * Item category 品群.<p>
	 *
	 */
	public boolean ctg_flg() {
		return getConstBoolean(offset + 63, $ctg_flg);
	}

	/**
	 * Item category 品群.<p>
	 *
	 */
	public void ctg_flg(boolean value) {
		setConstBoolean(offset + 63, $ctg_flg, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public boolean itm_flg() {
		return getConstBoolean(offset + 64, $itm_flg);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_flg(boolean value) {
		setConstBoolean(offset + 64, $itm_flg, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public boolean itm_typ_flg() {
		return getConstBoolean(offset + 65, $itm_typ_flg);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ_flg(boolean value) {
		setConstBoolean(offset + 65, $itm_typ_flg, value);
	}


	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public boolean itm_typ_d_flg() {
		return getConstBoolean(offset + 66, $itm_typ_d_flg);
	}

	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public void itm_typ_d_flg(boolean value) {
		setConstBoolean(offset + 66, $itm_typ_d_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public boolean lot_flg() {
		return getConstBoolean(offset + 67, $lot_flg);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_flg(boolean value) {
		setConstBoolean(offset + 67, $lot_flg, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public boolean sublot_flg() {
		return getConstBoolean(offset + 68, $sublot_flg);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_flg(boolean value) {
		setConstBoolean(offset + 68, $sublot_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public boolean sno1_flg() {
		return getConstBoolean(offset + 69, $sno1_flg);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1_flg(boolean value) {
		setConstBoolean(offset + 69, $sno1_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public boolean sno2_flg() {
		return getConstBoolean(offset + 70, $sno2_flg);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2_flg(boolean value) {
		setConstBoolean(offset + 70, $sno2_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public boolean sno3_flg() {
		return getConstBoolean(offset + 71, $sno3_flg);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3_flg(boolean value) {
		setConstBoolean(offset + 71, $sno3_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public boolean sno4_flg() {
		return getConstBoolean(offset + 72, $sno4_flg);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4_flg(boolean value) {
		setConstBoolean(offset + 72, $sno4_flg, value);
	}


	/**
	 * Item mfg. order 品目製造指図.<p>
	 *
	 */
	public boolean itm_mfg_inst_flg() {
		return getConstBoolean(offset + 73, $itm_mfg_inst_flg);
	}

	/**
	 * Item mfg. order 品目製造指図.<p>
	 *
	 */
	public void itm_mfg_inst_flg(boolean value) {
		setConstBoolean(offset + 73, $itm_mfg_inst_flg, value);
	}


	/**
	 * Invoice インボイス.<p>
	 *
	 */
	public boolean iv_flg() {
		return getConstBoolean(offset + 74, $iv_flg);
	}

	/**
	 * Invoice インボイス.<p>
	 *
	 */
	public void iv_flg(boolean value) {
		setConstBoolean(offset + 74, $iv_flg, value);
	}


	/**
	 * PO 発注.<p>
	 *
	 */
	public boolean po_flg() {
		return getConstBoolean(offset + 75, $po_flg);
	}

	/**
	 * PO 発注.<p>
	 *
	 */
	public void po_flg(boolean value) {
		setConstBoolean(offset + 75, $po_flg, value);
	}


	/**
	 * Sales order 受注.<p>
	 *
	 */
	public boolean slo_flg() {
		return getConstBoolean(offset + 76, $slo_flg);
	}

	/**
	 * Sales order 受注.<p>
	 *
	 */
	public void slo_flg(boolean value) {
		setConstBoolean(offset + 76, $slo_flg, value);
	}


	public boolean down0_flg() {
		return getConstBoolean(offset + 77, $down0_flg);
	}

	public void down0_flg(boolean value) {
		setConstBoolean(offset + 77, $down0_flg, value);
	}


	public boolean down1_flg() {
		return getConstBoolean(offset + 78, $down1_flg);
	}

	public void down1_flg(boolean value) {
		setConstBoolean(offset + 78, $down1_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
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
		if ($src_wg_cd.equalsIgnoreCase(name)) {
			return src_wg_cd();
		}
		if ($src_wg_nm.equalsIgnoreCase(name)) {
			return src_wg_nm();
		}
		if ($src_alc_ac_cd.equalsIgnoreCase(name)) {
			return src_alc_ac_cd();
		}
		if ($src_alc_ac_nm.equalsIgnoreCase(name)) {
			return src_alc_ac_nm();
		}
		if ($src_alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return src_alc_ac_grp_cd1();
		}
		if ($src_alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			return src_alc_ac_grp_nm1();
		}
		if ($src_alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return src_alc_ac_grp_cd2();
		}
		if ($src_alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			return src_alc_ac_grp_nm2();
		}
		if ($src_alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return src_alc_ac_grp_cd3();
		}
		if ($src_alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			return src_alc_ac_grp_nm3();
		}
		if ($dest_wg_cd.equalsIgnoreCase(name)) {
			return dest_wg_cd();
		}
		if ($dest_wg_nm.equalsIgnoreCase(name)) {
			return dest_wg_nm();
		}
		if ($dest_alc_ac_cd.equalsIgnoreCase(name)) {
			return dest_alc_ac_cd();
		}
		if ($dest_alc_ac_nm.equalsIgnoreCase(name)) {
			return dest_alc_ac_nm();
		}
		if ($dest_alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return dest_alc_ac_grp_cd1();
		}
		if ($dest_alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			return dest_alc_ac_grp_nm1();
		}
		if ($dest_alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return dest_alc_ac_grp_cd2();
		}
		if ($dest_alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			return dest_alc_ac_grp_nm2();
		}
		if ($dest_alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return dest_alc_ac_grp_cd3();
		}
		if ($dest_alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			return dest_alc_ac_grp_nm3();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($pre_alc_lvl_flg.equalsIgnoreCase(name)) {
			return pre_alc_lvl_flg();
		}
		if ($src_wg_flg.equalsIgnoreCase(name)) {
			return src_wg_flg();
		}
		if ($src_alc_ac_flg.equalsIgnoreCase(name)) {
			return src_alc_ac_flg();
		}
		if ($dest_wg_flg.equalsIgnoreCase(name)) {
			return dest_wg_flg();
		}
		if ($dest_alc_ac_flg.equalsIgnoreCase(name)) {
			return dest_alc_ac_flg();
		}
		if ($ym_flg.equalsIgnoreCase(name)) {
			return ym_flg();
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			return dpt_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			return oper_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			return ctg_flg();
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			return itm_flg();
		}
		if ($itm_typ_flg.equalsIgnoreCase(name)) {
			return itm_typ_flg();
		}
		if ($itm_typ_d_flg.equalsIgnoreCase(name)) {
			return itm_typ_d_flg();
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			return lot_flg();
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			return sublot_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($itm_mfg_inst_flg.equalsIgnoreCase(name)) {
			return itm_mfg_inst_flg();
		}
		if ($iv_flg.equalsIgnoreCase(name)) {
			return iv_flg();
		}
		if ($po_flg.equalsIgnoreCase(name)) {
			return po_flg();
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			return slo_flg();
		}
		if ($down0_flg.equalsIgnoreCase(name)) {
			return down0_flg();
		}
		if ($down1_flg.equalsIgnoreCase(name)) {
			return down1_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
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
		if ($src_wg_cd.equalsIgnoreCase(name)) {
			return src_wg_cd();
		}
		if ($src_wg_nm.equalsIgnoreCase(name)) {
			return src_wg_nm();
		}
		if ($src_alc_ac_cd.equalsIgnoreCase(name)) {
			return src_alc_ac_cd();
		}
		if ($src_alc_ac_nm.equalsIgnoreCase(name)) {
			return src_alc_ac_nm();
		}
		if ($src_alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return src_alc_ac_grp_cd1();
		}
		if ($src_alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			return src_alc_ac_grp_nm1();
		}
		if ($src_alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return src_alc_ac_grp_cd2();
		}
		if ($src_alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			return src_alc_ac_grp_nm2();
		}
		if ($src_alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return src_alc_ac_grp_cd3();
		}
		if ($src_alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			return src_alc_ac_grp_nm3();
		}
		if ($dest_wg_cd.equalsIgnoreCase(name)) {
			return dest_wg_cd();
		}
		if ($dest_wg_nm.equalsIgnoreCase(name)) {
			return dest_wg_nm();
		}
		if ($dest_alc_ac_cd.equalsIgnoreCase(name)) {
			return dest_alc_ac_cd();
		}
		if ($dest_alc_ac_nm.equalsIgnoreCase(name)) {
			return dest_alc_ac_nm();
		}
		if ($dest_alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			return dest_alc_ac_grp_cd1();
		}
		if ($dest_alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			return dest_alc_ac_grp_nm1();
		}
		if ($dest_alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			return dest_alc_ac_grp_cd2();
		}
		if ($dest_alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			return dest_alc_ac_grp_nm2();
		}
		if ($dest_alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			return dest_alc_ac_grp_cd3();
		}
		if ($dest_alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			return dest_alc_ac_grp_nm3();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($pre_alc_lvl_flg.equalsIgnoreCase(name)) {
			return pre_alc_lvl_flg();
		}
		if ($src_wg_flg.equalsIgnoreCase(name)) {
			return src_wg_flg();
		}
		if ($src_alc_ac_flg.equalsIgnoreCase(name)) {
			return src_alc_ac_flg();
		}
		if ($dest_wg_flg.equalsIgnoreCase(name)) {
			return dest_wg_flg();
		}
		if ($dest_alc_ac_flg.equalsIgnoreCase(name)) {
			return dest_alc_ac_flg();
		}
		if ($ym_flg.equalsIgnoreCase(name)) {
			return ym_flg();
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			return dpt_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			return oper_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			return ctg_flg();
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			return itm_flg();
		}
		if ($itm_typ_flg.equalsIgnoreCase(name)) {
			return itm_typ_flg();
		}
		if ($itm_typ_d_flg.equalsIgnoreCase(name)) {
			return itm_typ_d_flg();
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			return lot_flg();
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			return sublot_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($itm_mfg_inst_flg.equalsIgnoreCase(name)) {
			return itm_mfg_inst_flg();
		}
		if ($iv_flg.equalsIgnoreCase(name)) {
			return iv_flg();
		}
		if ($po_flg.equalsIgnoreCase(name)) {
			return po_flg();
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			return slo_flg();
		}
		if ($down0_flg.equalsIgnoreCase(name)) {
			return down0_flg();
		}
		if ($down1_flg.equalsIgnoreCase(name)) {
			return down1_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
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
		if ($src_wg_cd.equalsIgnoreCase(name)) {
			src_wg_cd(value);
			return;
		}
		if ($src_wg_nm.equalsIgnoreCase(name)) {
			src_wg_nm(value);
			return;
		}
		if ($src_alc_ac_cd.equalsIgnoreCase(name)) {
			src_alc_ac_cd(value);
			return;
		}
		if ($src_alc_ac_nm.equalsIgnoreCase(name)) {
			src_alc_ac_nm(value);
			return;
		}
		if ($src_alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			src_alc_ac_grp_cd1(value);
			return;
		}
		if ($src_alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			src_alc_ac_grp_nm1(value);
			return;
		}
		if ($src_alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			src_alc_ac_grp_cd2(value);
			return;
		}
		if ($src_alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			src_alc_ac_grp_nm2(value);
			return;
		}
		if ($src_alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			src_alc_ac_grp_cd3(value);
			return;
		}
		if ($src_alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			src_alc_ac_grp_nm3(value);
			return;
		}
		if ($dest_wg_cd.equalsIgnoreCase(name)) {
			dest_wg_cd(value);
			return;
		}
		if ($dest_wg_nm.equalsIgnoreCase(name)) {
			dest_wg_nm(value);
			return;
		}
		if ($dest_alc_ac_cd.equalsIgnoreCase(name)) {
			dest_alc_ac_cd(value);
			return;
		}
		if ($dest_alc_ac_nm.equalsIgnoreCase(name)) {
			dest_alc_ac_nm(value);
			return;
		}
		if ($dest_alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			dest_alc_ac_grp_cd1(value);
			return;
		}
		if ($dest_alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			dest_alc_ac_grp_nm1(value);
			return;
		}
		if ($dest_alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			dest_alc_ac_grp_cd2(value);
			return;
		}
		if ($dest_alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			dest_alc_ac_grp_nm2(value);
			return;
		}
		if ($dest_alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			dest_alc_ac_grp_cd3(value);
			return;
		}
		if ($dest_alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			dest_alc_ac_grp_nm3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($pre_alc_lvl_flg.equalsIgnoreCase(name)) {
			pre_alc_lvl_flg(value);
			return;
		}
		if ($src_wg_flg.equalsIgnoreCase(name)) {
			src_wg_flg(value);
			return;
		}
		if ($src_alc_ac_flg.equalsIgnoreCase(name)) {
			src_alc_ac_flg(value);
			return;
		}
		if ($dest_wg_flg.equalsIgnoreCase(name)) {
			dest_wg_flg(value);
			return;
		}
		if ($dest_alc_ac_flg.equalsIgnoreCase(name)) {
			dest_alc_ac_flg(value);
			return;
		}
		if ($ym_flg.equalsIgnoreCase(name)) {
			ym_flg(value);
			return;
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			dpt_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			oper_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			ctg_flg(value);
			return;
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			itm_flg(value);
			return;
		}
		if ($itm_typ_flg.equalsIgnoreCase(name)) {
			itm_typ_flg(value);
			return;
		}
		if ($itm_typ_d_flg.equalsIgnoreCase(name)) {
			itm_typ_d_flg(value);
			return;
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			lot_flg(value);
			return;
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			sublot_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($itm_mfg_inst_flg.equalsIgnoreCase(name)) {
			itm_mfg_inst_flg(value);
			return;
		}
		if ($iv_flg.equalsIgnoreCase(name)) {
			iv_flg(value);
			return;
		}
		if ($po_flg.equalsIgnoreCase(name)) {
			po_flg(value);
			return;
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			slo_flg(value);
			return;
		}
		if ($down0_flg.equalsIgnoreCase(name)) {
			down0_flg(value);
			return;
		}
		if ($down1_flg.equalsIgnoreCase(name)) {
			down1_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
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
		if ($src_wg_cd.equalsIgnoreCase(name)) {
			src_wg_cd(value);
			return;
		}
		if ($src_wg_nm.equalsIgnoreCase(name)) {
			src_wg_nm(value);
			return;
		}
		if ($src_alc_ac_cd.equalsIgnoreCase(name)) {
			src_alc_ac_cd(value);
			return;
		}
		if ($src_alc_ac_nm.equalsIgnoreCase(name)) {
			src_alc_ac_nm(value);
			return;
		}
		if ($src_alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			src_alc_ac_grp_cd1(value);
			return;
		}
		if ($src_alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			src_alc_ac_grp_nm1(value);
			return;
		}
		if ($src_alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			src_alc_ac_grp_cd2(value);
			return;
		}
		if ($src_alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			src_alc_ac_grp_nm2(value);
			return;
		}
		if ($src_alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			src_alc_ac_grp_cd3(value);
			return;
		}
		if ($src_alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			src_alc_ac_grp_nm3(value);
			return;
		}
		if ($dest_wg_cd.equalsIgnoreCase(name)) {
			dest_wg_cd(value);
			return;
		}
		if ($dest_wg_nm.equalsIgnoreCase(name)) {
			dest_wg_nm(value);
			return;
		}
		if ($dest_alc_ac_cd.equalsIgnoreCase(name)) {
			dest_alc_ac_cd(value);
			return;
		}
		if ($dest_alc_ac_nm.equalsIgnoreCase(name)) {
			dest_alc_ac_nm(value);
			return;
		}
		if ($dest_alc_ac_grp_cd1.equalsIgnoreCase(name)) {
			dest_alc_ac_grp_cd1(value);
			return;
		}
		if ($dest_alc_ac_grp_nm1.equalsIgnoreCase(name)) {
			dest_alc_ac_grp_nm1(value);
			return;
		}
		if ($dest_alc_ac_grp_cd2.equalsIgnoreCase(name)) {
			dest_alc_ac_grp_cd2(value);
			return;
		}
		if ($dest_alc_ac_grp_nm2.equalsIgnoreCase(name)) {
			dest_alc_ac_grp_nm2(value);
			return;
		}
		if ($dest_alc_ac_grp_cd3.equalsIgnoreCase(name)) {
			dest_alc_ac_grp_cd3(value);
			return;
		}
		if ($dest_alc_ac_grp_nm3.equalsIgnoreCase(name)) {
			dest_alc_ac_grp_nm3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($pre_alc_lvl_flg.equalsIgnoreCase(name)) {
			pre_alc_lvl_flg(value);
			return;
		}
		if ($src_wg_flg.equalsIgnoreCase(name)) {
			src_wg_flg(value);
			return;
		}
		if ($src_alc_ac_flg.equalsIgnoreCase(name)) {
			src_alc_ac_flg(value);
			return;
		}
		if ($dest_wg_flg.equalsIgnoreCase(name)) {
			dest_wg_flg(value);
			return;
		}
		if ($dest_alc_ac_flg.equalsIgnoreCase(name)) {
			dest_alc_ac_flg(value);
			return;
		}
		if ($ym_flg.equalsIgnoreCase(name)) {
			ym_flg(value);
			return;
		}
		if ($dpt_flg.equalsIgnoreCase(name)) {
			dpt_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			oper_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($ctg_flg.equalsIgnoreCase(name)) {
			ctg_flg(value);
			return;
		}
		if ($itm_flg.equalsIgnoreCase(name)) {
			itm_flg(value);
			return;
		}
		if ($itm_typ_flg.equalsIgnoreCase(name)) {
			itm_typ_flg(value);
			return;
		}
		if ($itm_typ_d_flg.equalsIgnoreCase(name)) {
			itm_typ_d_flg(value);
			return;
		}
		if ($lot_flg.equalsIgnoreCase(name)) {
			lot_flg(value);
			return;
		}
		if ($sublot_flg.equalsIgnoreCase(name)) {
			sublot_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($itm_mfg_inst_flg.equalsIgnoreCase(name)) {
			itm_mfg_inst_flg(value);
			return;
		}
		if ($iv_flg.equalsIgnoreCase(name)) {
			iv_flg(value);
			return;
		}
		if ($po_flg.equalsIgnoreCase(name)) {
			po_flg(value);
			return;
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			slo_flg(value);
			return;
		}
		if ($down0_flg.equalsIgnoreCase(name)) {
			down0_flg(value);
			return;
		}
		if ($down1_flg.equalsIgnoreCase(name)) {
			down1_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

