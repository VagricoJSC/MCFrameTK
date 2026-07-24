package mcframe.serverMSBD.MSBDL0210;

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
	public static final String $screen_ope = "screen_ope";
	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public static final String $disp_ope = "disp_ope";
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public static final String $fix_f_flg = "fix_f_flg";
	/**
	 * Firmed 確定済.<p>
	 *
	 */
	public static final String $fix_t_flg = "fix_t_flg";
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public static final String $rpt_f_flg = "rpt_f_flg";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $rpt_t_flg = "rpt_t_flg";
	/**
	 * Valid 有効.<p>
	 *
	 */
	public static final String $del_f_flg = "del_f_flg";
	/**
	 * Invalid 無効.<p>
	 *
	 */
	public static final String $del_t_flg = "del_t_flg";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_t_flg = "subcon_t_flg";
	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public static final String $subcon_f_flg = "subcon_f_flg";
	/**
	 * For pickup responsibility 引取責任対象.<p>
	 *
	 */
	public static final String $purc_commit_t_flg = "purc_commit_t_flg";
	/**
	 * Not for pickup responsibility 引取責任対象外.<p>
	 *
	 */
	public static final String $purc_commit_f_flg = "purc_commit_f_flg";
	/**
	 * Forecast date FROM 内示日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $pf_dt_fr = "pf_dt_fr";
	/**
	 * Forecast date TO 内示日ＴＯ.<p>
	 *
	 */
	public static final String $pf_dt_to = "pf_dt_to";
	/**
	 * Latest 最新.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";
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
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Forecast PIC cd. 内示担当者ＣＤ.<p>
	 *
	 */
	public static final String $pf_usr_cd = "pf_usr_cd";
	/**
	 * Forecast PIC name 内示担当者名.<p>
	 *
	 */
	public static final String $pf_usr_nm = "pf_usr_nm";
	/**
	 * Forecast dept. cd. 内示部門ＣＤ.<p>
	 *
	 */
	public static final String $pf_dpt_cd = "pf_dpt_cd";
	/**
	 * Forecast dept. name 内示部門名.<p>
	 *
	 */
	public static final String $pf_dpt_nm = "pf_dpt_nm";
	/**
	 * Forecast dept. WG cd. 内示部門ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $pf_wg_cd = "pf_wg_cd";
	/**
	 * Forecast dept. WG name 内示部門ワーキンググループ名.<p>
	 *
	 */
	public static final String $pf_wg_nm = "pf_wg_nm";
	/**
	 * Forecast list No. 内示書ＮＯ.<p>
	 *
	 */
	public static final String $pf_rpt_no = "pf_rpt_no";
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
	 * Header report remarks ヘッダ帳票備考.<p>
	 *
	 */
	public static final String $hdr_rpt_rmrks = "hdr_rpt_rmrks";
	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public static final String $hdr_intr_rmrks = "hdr_intr_rmrks";
	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public static final String $hdr_sub_char1 = "hdr_sub_char1";
	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public static final String $hdr_sub_char2 = "hdr_sub_char2";
	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public static final String $hdr_sub_char3 = "hdr_sub_char3";
	/**
	 * Details report remarks 明細帳票備考.<p>
	 *
	 */
	public static final String $dtl_rpt_rmrks = "dtl_rpt_rmrks";
	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public static final String $dtl_intr_rmrks = "dtl_intr_rmrks";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $dtl_sub_char1 = "dtl_sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $dtl_sub_char2 = "dtl_sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $dtl_sub_char3 = "dtl_sub_char3";
	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public static final String $sppl_grp_flg1 = "sppl_grp_flg1";
	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public static final String $sppl_grp_cd1 = "sppl_grp_cd1";
	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public static final String $sppl_grp_nm1 = "sppl_grp_nm1";
	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public static final String $sppl_grp_flg2 = "sppl_grp_flg2";
	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public static final String $sppl_grp_cd2 = "sppl_grp_cd2";
	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public static final String $sppl_grp_nm2 = "sppl_grp_nm2";
	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public static final String $sppl_grp_flg3 = "sppl_grp_flg3";
	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public static final String $sppl_grp_cd3 = "sppl_grp_cd3";
	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public static final String $sppl_grp_nm3 = "sppl_grp_nm3";
	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public static final String $sppl_grp_flg4 = "sppl_grp_flg4";
	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public static final String $sppl_grp_cd4 = "sppl_grp_cd4";
	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public static final String $sppl_grp_nm4 = "sppl_grp_nm4";
	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public static final String $sppl_grp_flg5 = "sppl_grp_flg5";
	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public static final String $sppl_grp_cd5 = "sppl_grp_cd5";
	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public static final String $sppl_grp_nm5 = "sppl_grp_nm5";
	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public static final String $sppl_grp_flg6 = "sppl_grp_flg6";
	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public static final String $sppl_grp_cd6 = "sppl_grp_cd6";
	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public static final String $sppl_grp_nm6 = "sppl_grp_nm6";
	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public static final String $sppl_grp_flg7 = "sppl_grp_flg7";
	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public static final String $sppl_grp_cd7 = "sppl_grp_cd7";
	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public static final String $sppl_grp_nm7 = "sppl_grp_nm7";
	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public static final String $sppl_grp_flg8 = "sppl_grp_flg8";
	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public static final String $sppl_grp_cd8 = "sppl_grp_cd8";
	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public static final String $sppl_grp_nm8 = "sppl_grp_nm8";
	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public static final String $sppl_grp_flg9 = "sppl_grp_flg9";
	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public static final String $sppl_grp_cd9 = "sppl_grp_cd9";
	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public static final String $sppl_grp_nm9 = "sppl_grp_nm9";
	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public static final String $sppl_grp_flg10 = "sppl_grp_flg10";
	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $sppl_grp_cd10 = "sppl_grp_cd10";
	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public static final String $sppl_grp_nm10 = "sppl_grp_nm10";
	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public static final String $itm_grp_flg1 = "itm_grp_flg1";
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
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public static final String $itm_grp_flg2 = "itm_grp_flg2";
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
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public static final String $itm_grp_flg3 = "itm_grp_flg3";
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
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public static final String $itm_grp_flg4 = "itm_grp_flg4";
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
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public static final String $itm_grp_flg5 = "itm_grp_flg5";
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
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public static final String $itm_grp_flg6 = "itm_grp_flg6";
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
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public static final String $itm_grp_flg7 = "itm_grp_flg7";
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
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public static final String $itm_grp_flg8 = "itm_grp_flg8";
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
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public static final String $itm_grp_flg9 = "itm_grp_flg9";
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
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public static final String $itm_grp_flg10 = "itm_grp_flg10";
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


	public static final MCMeta screen_ope_META = createStringMeta($screen_ope);
	public static final MCMeta disp_ope_META = createStringMeta($disp_ope);
	public static final MCMeta fix_f_flg_META = createCommonMeta($fix_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_t_flg_META = createCommonMeta($fix_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rpt_f_flg_META = createCommonMeta($rpt_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rpt_t_flg_META = createCommonMeta($rpt_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_f_flg_META = createCommonMeta($del_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_t_flg_META = createCommonMeta($del_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta subcon_t_flg_META = createCommonMeta($subcon_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta subcon_f_flg_META = createCommonMeta($subcon_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_commit_t_flg_META = createCommonMeta($purc_commit_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_commit_f_flg_META = createCommonMeta($purc_commit_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pf_dt_fr_META = createCommonMeta($pf_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pf_dt_to_META = createCommonMeta($pf_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta pf_usr_cd_META = createCommonMeta($pf_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta pf_usr_nm_META = createCommonMeta($pf_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta pf_dpt_cd_META = createCommonMeta($pf_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pf_dpt_nm_META = createCommonMeta($pf_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta pf_wg_cd_META = createCommonMeta($pf_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta pf_wg_nm_META = createCommonMeta($pf_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta pf_rpt_no_META = createCommonMeta($pf_rpt_no, mcframe.commonMA.meta.MA_META.PF_RPT_NO);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta hdr_rpt_rmrks_META = createCommonMeta($hdr_rpt_rmrks, mcframe.commonMS.meta.MS_META.PF_HDR_RPT_RMRKS);
	public static final MCMeta hdr_intr_rmrks_META = createCommonMeta($hdr_intr_rmrks, mcframe.commonMS.meta.MS_META.PF_HDR_INTR_RMRKS);
	public static final MCMeta hdr_sub_char1_META = createCommonMeta($hdr_sub_char1, mcframe.commonMS.meta.MS_META.PF_HDR_SUB_CHAR1);
	public static final MCMeta hdr_sub_char2_META = createCommonMeta($hdr_sub_char2, mcframe.commonMS.meta.MS_META.PF_HDR_SUB_CHAR2);
	public static final MCMeta hdr_sub_char3_META = createCommonMeta($hdr_sub_char3, mcframe.commonMS.meta.MS_META.PF_HDR_SUB_CHAR3);
	public static final MCMeta dtl_rpt_rmrks_META = createCommonMeta($dtl_rpt_rmrks, mcframe.commonMS.meta.MS_META.PF_FIX_RPT_RMRKS);
	public static final MCMeta dtl_intr_rmrks_META = createCommonMeta($dtl_intr_rmrks, mcframe.commonMS.meta.MS_META.PF_FIX_INTR_RMRKS);
	public static final MCMeta dtl_sub_char1_META = createCommonMeta($dtl_sub_char1, mcframe.commonMS.meta.MS_META.PF_FIX_SUB_CHAR1);
	public static final MCMeta dtl_sub_char2_META = createCommonMeta($dtl_sub_char2, mcframe.commonMS.meta.MS_META.PF_FIX_SUB_CHAR2);
	public static final MCMeta dtl_sub_char3_META = createCommonMeta($dtl_sub_char3, mcframe.commonMS.meta.MS_META.PF_FIX_SUB_CHAR3);
	public static final MCMeta sppl_grp_flg1_META = createCommonMeta($sppl_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd1_META = createCommonMeta($sppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm1_META = createCommonMeta($sppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg2_META = createCommonMeta($sppl_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd2_META = createCommonMeta($sppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm2_META = createCommonMeta($sppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg3_META = createCommonMeta($sppl_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd3_META = createCommonMeta($sppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm3_META = createCommonMeta($sppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg4_META = createCommonMeta($sppl_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd4_META = createCommonMeta($sppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm4_META = createCommonMeta($sppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg5_META = createCommonMeta($sppl_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd5_META = createCommonMeta($sppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm5_META = createCommonMeta($sppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg6_META = createCommonMeta($sppl_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd6_META = createCommonMeta($sppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm6_META = createCommonMeta($sppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg7_META = createCommonMeta($sppl_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd7_META = createCommonMeta($sppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm7_META = createCommonMeta($sppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg8_META = createCommonMeta($sppl_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd8_META = createCommonMeta($sppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm8_META = createCommonMeta($sppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg9_META = createCommonMeta($sppl_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd9_META = createCommonMeta($sppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm9_META = createCommonMeta($sppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg10_META = createCommonMeta($sppl_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd10_META = createCommonMeta($sppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm10_META = createCommonMeta($sppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta itm_grp_flg1_META = createCommonMeta($itm_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg2_META = createCommonMeta($itm_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg3_META = createCommonMeta($itm_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg4_META = createCommonMeta($itm_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg5_META = createCommonMeta($itm_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg6_META = createCommonMeta($itm_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg7_META = createCommonMeta($itm_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg8_META = createCommonMeta($itm_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg9_META = createCommonMeta($itm_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg10_META = createCommonMeta($itm_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			screen_ope_META,
			disp_ope_META,
			fix_f_flg_META,
			fix_t_flg_META,
			rpt_f_flg_META,
			rpt_t_flg_META,
			del_f_flg_META,
			del_t_flg_META,
			subcon_t_flg_META,
			subcon_f_flg_META,
			purc_commit_t_flg_META,
			purc_commit_f_flg_META,
			pf_dt_fr_META,
			pf_dt_to_META,
			latest_flg_META,
			wg_cd_META,
			wg_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			pf_usr_cd_META,
			pf_usr_nm_META,
			pf_dpt_cd_META,
			pf_dpt_nm_META,
			pf_wg_cd_META,
			pf_wg_nm_META,
			pf_rpt_no_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			hdr_rpt_rmrks_META,
			hdr_intr_rmrks_META,
			hdr_sub_char1_META,
			hdr_sub_char2_META,
			hdr_sub_char3_META,
			dtl_rpt_rmrks_META,
			dtl_intr_rmrks_META,
			dtl_sub_char1_META,
			dtl_sub_char2_META,
			dtl_sub_char3_META,
			sppl_grp_flg1_META,
			sppl_grp_cd1_META,
			sppl_grp_nm1_META,
			sppl_grp_flg2_META,
			sppl_grp_cd2_META,
			sppl_grp_nm2_META,
			sppl_grp_flg3_META,
			sppl_grp_cd3_META,
			sppl_grp_nm3_META,
			sppl_grp_flg4_META,
			sppl_grp_cd4_META,
			sppl_grp_nm4_META,
			sppl_grp_flg5_META,
			sppl_grp_cd5_META,
			sppl_grp_nm5_META,
			sppl_grp_flg6_META,
			sppl_grp_cd6_META,
			sppl_grp_nm6_META,
			sppl_grp_flg7_META,
			sppl_grp_cd7_META,
			sppl_grp_nm7_META,
			sppl_grp_flg8_META,
			sppl_grp_cd8_META,
			sppl_grp_nm8_META,
			sppl_grp_flg9_META,
			sppl_grp_cd9_META,
			sppl_grp_nm9_META,
			sppl_grp_flg10_META,
			sppl_grp_cd10_META,
			sppl_grp_nm10_META,
			itm_grp_flg1_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_flg2_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_flg3_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_flg4_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_flg5_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_flg6_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_flg7_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_flg8_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_flg9_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_flg10_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META
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
	public String screen_ope() {
		return getConstString(offset + 0, $screen_ope);
	}

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public void screen_ope(String value) {
		setConstString(offset + 0, $screen_ope, value);
	}


	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public String disp_ope() {
		return getConstString(offset + 1, $disp_ope);
	}

	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public void disp_ope(String value) {
		setConstString(offset + 1, $disp_ope, value);
	}


	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean fix_f_flg() {
		return getConstBoolean(offset + 2, $fix_f_flg);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void fix_f_flg(boolean value) {
		setConstBoolean(offset + 2, $fix_f_flg, value);
	}


	/**
	 * Firmed 確定済.<p>
	 *
	 */
	public boolean fix_t_flg() {
		return getConstBoolean(offset + 3, $fix_t_flg);
	}

	/**
	 * Firmed 確定済.<p>
	 *
	 */
	public void fix_t_flg(boolean value) {
		setConstBoolean(offset + 3, $fix_t_flg, value);
	}


	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public boolean rpt_f_flg() {
		return getConstBoolean(offset + 4, $rpt_f_flg);
	}

	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public void rpt_f_flg(boolean value) {
		setConstBoolean(offset + 4, $rpt_f_flg, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean rpt_t_flg() {
		return getConstBoolean(offset + 5, $rpt_t_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void rpt_t_flg(boolean value) {
		setConstBoolean(offset + 5, $rpt_t_flg, value);
	}


	/**
	 * Valid 有効.<p>
	 *
	 */
	public boolean del_f_flg() {
		return getConstBoolean(offset + 6, $del_f_flg);
	}

	/**
	 * Valid 有効.<p>
	 *
	 */
	public void del_f_flg(boolean value) {
		setConstBoolean(offset + 6, $del_f_flg, value);
	}


	/**
	 * Invalid 無効.<p>
	 *
	 */
	public boolean del_t_flg() {
		return getConstBoolean(offset + 7, $del_t_flg);
	}

	/**
	 * Invalid 無効.<p>
	 *
	 */
	public void del_t_flg(boolean value) {
		setConstBoolean(offset + 7, $del_t_flg, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_t_flg() {
		return getConstBoolean(offset + 8, $subcon_t_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_t_flg(boolean value) {
		setConstBoolean(offset + 8, $subcon_t_flg, value);
	}


	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public boolean subcon_f_flg() {
		return getConstBoolean(offset + 9, $subcon_f_flg);
	}

	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public void subcon_f_flg(boolean value) {
		setConstBoolean(offset + 9, $subcon_f_flg, value);
	}


	/**
	 * For pickup responsibility 引取責任対象.<p>
	 *
	 */
	public boolean purc_commit_t_flg() {
		return getConstBoolean(offset + 10, $purc_commit_t_flg);
	}

	/**
	 * For pickup responsibility 引取責任対象.<p>
	 *
	 */
	public void purc_commit_t_flg(boolean value) {
		setConstBoolean(offset + 10, $purc_commit_t_flg, value);
	}


	/**
	 * Not for pickup responsibility 引取責任対象外.<p>
	 *
	 */
	public boolean purc_commit_f_flg() {
		return getConstBoolean(offset + 11, $purc_commit_f_flg);
	}

	/**
	 * Not for pickup responsibility 引取責任対象外.<p>
	 *
	 */
	public void purc_commit_f_flg(boolean value) {
		setConstBoolean(offset + 11, $purc_commit_f_flg, value);
	}


	/**
	 * Forecast date FROM 内示日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate pf_dt_fr() {
		return getConstDate(offset + 12, $pf_dt_fr);
	}

	/**
	 * Forecast date FROM 内示日ＦＲＯＭ.<p>
	 *
	 */
	public void pf_dt_fr(MCDate value) {
		setConstDate(offset + 12, $pf_dt_fr, value);
	}


	/**
	 * Forecast date TO 内示日ＴＯ.<p>
	 *
	 */
	public MCDate pf_dt_to() {
		return getConstDate(offset + 13, $pf_dt_to);
	}

	/**
	 * Forecast date TO 内示日ＴＯ.<p>
	 *
	 */
	public void pf_dt_to(MCDate value) {
		setConstDate(offset + 13, $pf_dt_to, value);
	}


	/**
	 * Latest 最新.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 14, $latest_flg);
	}

	/**
	 * Latest 最新.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 14, $latest_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 15, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 15, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 16, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 16, $wg_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 17, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 17, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 18, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 18, $sppl_nm, value);
	}


	/**
	 * Forecast PIC cd. 内示担当者ＣＤ.<p>
	 *
	 */
	public String pf_usr_cd() {
		return getConstString(offset + 19, $pf_usr_cd);
	}

	/**
	 * Forecast PIC cd. 内示担当者ＣＤ.<p>
	 *
	 */
	public void pf_usr_cd(String value) {
		setConstString(offset + 19, $pf_usr_cd, value);
	}


	/**
	 * Forecast PIC name 内示担当者名.<p>
	 *
	 */
	public String pf_usr_nm() {
		return getConstString(offset + 20, $pf_usr_nm);
	}

	/**
	 * Forecast PIC name 内示担当者名.<p>
	 *
	 */
	public void pf_usr_nm(String value) {
		setConstString(offset + 20, $pf_usr_nm, value);
	}


	/**
	 * Forecast dept. cd. 内示部門ＣＤ.<p>
	 *
	 */
	public String pf_dpt_cd() {
		return getConstString(offset + 21, $pf_dpt_cd);
	}

	/**
	 * Forecast dept. cd. 内示部門ＣＤ.<p>
	 *
	 */
	public void pf_dpt_cd(String value) {
		setConstString(offset + 21, $pf_dpt_cd, value);
	}


	/**
	 * Forecast dept. name 内示部門名.<p>
	 *
	 */
	public String pf_dpt_nm() {
		return getConstString(offset + 22, $pf_dpt_nm);
	}

	/**
	 * Forecast dept. name 内示部門名.<p>
	 *
	 */
	public void pf_dpt_nm(String value) {
		setConstString(offset + 22, $pf_dpt_nm, value);
	}


	/**
	 * Forecast dept. WG cd. 内示部門ワーキンググループＣＤ.<p>
	 *
	 */
	public String pf_wg_cd() {
		return getConstString(offset + 23, $pf_wg_cd);
	}

	/**
	 * Forecast dept. WG cd. 内示部門ワーキンググループＣＤ.<p>
	 *
	 */
	public void pf_wg_cd(String value) {
		setConstString(offset + 23, $pf_wg_cd, value);
	}


	/**
	 * Forecast dept. WG name 内示部門ワーキンググループ名.<p>
	 *
	 */
	public String pf_wg_nm() {
		return getConstString(offset + 24, $pf_wg_nm);
	}

	/**
	 * Forecast dept. WG name 内示部門ワーキンググループ名.<p>
	 *
	 */
	public void pf_wg_nm(String value) {
		setConstString(offset + 24, $pf_wg_nm, value);
	}


	/**
	 * Forecast list No. 内示書ＮＯ.<p>
	 *
	 */
	public String pf_rpt_no() {
		return getConstString(offset + 25, $pf_rpt_no);
	}

	/**
	 * Forecast list No. 内示書ＮＯ.<p>
	 *
	 */
	public void pf_rpt_no(String value) {
		setConstString(offset + 25, $pf_rpt_no, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 26, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 26, $itm_typ, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 27, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 27, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 28, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 28, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 29, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 29, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 30, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 30, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 31, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 31, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 32, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 32, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 33, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 33, $itm_nm, value);
	}


	/**
	 * Header report remarks ヘッダ帳票備考.<p>
	 *
	 */
	public String hdr_rpt_rmrks() {
		return getConstString(offset + 34, $hdr_rpt_rmrks);
	}

	/**
	 * Header report remarks ヘッダ帳票備考.<p>
	 *
	 */
	public void hdr_rpt_rmrks(String value) {
		setConstString(offset + 34, $hdr_rpt_rmrks, value);
	}


	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public String hdr_intr_rmrks() {
		return getConstString(offset + 35, $hdr_intr_rmrks);
	}

	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public void hdr_intr_rmrks(String value) {
		setConstString(offset + 35, $hdr_intr_rmrks, value);
	}


	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public String hdr_sub_char1() {
		return getConstString(offset + 36, $hdr_sub_char1);
	}

	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public void hdr_sub_char1(String value) {
		setConstString(offset + 36, $hdr_sub_char1, value);
	}


	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public String hdr_sub_char2() {
		return getConstString(offset + 37, $hdr_sub_char2);
	}

	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public void hdr_sub_char2(String value) {
		setConstString(offset + 37, $hdr_sub_char2, value);
	}


	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public String hdr_sub_char3() {
		return getConstString(offset + 38, $hdr_sub_char3);
	}

	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public void hdr_sub_char3(String value) {
		setConstString(offset + 38, $hdr_sub_char3, value);
	}


	/**
	 * Details report remarks 明細帳票備考.<p>
	 *
	 */
	public String dtl_rpt_rmrks() {
		return getConstString(offset + 39, $dtl_rpt_rmrks);
	}

	/**
	 * Details report remarks 明細帳票備考.<p>
	 *
	 */
	public void dtl_rpt_rmrks(String value) {
		setConstString(offset + 39, $dtl_rpt_rmrks, value);
	}


	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public String dtl_intr_rmrks() {
		return getConstString(offset + 40, $dtl_intr_rmrks);
	}

	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public void dtl_intr_rmrks(String value) {
		setConstString(offset + 40, $dtl_intr_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String dtl_sub_char1() {
		return getConstString(offset + 41, $dtl_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void dtl_sub_char1(String value) {
		setConstString(offset + 41, $dtl_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String dtl_sub_char2() {
		return getConstString(offset + 42, $dtl_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void dtl_sub_char2(String value) {
		setConstString(offset + 42, $dtl_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String dtl_sub_char3() {
		return getConstString(offset + 43, $dtl_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void dtl_sub_char3(String value) {
		setConstString(offset + 43, $dtl_sub_char3, value);
	}


	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public boolean sppl_grp_flg1() {
		return getConstBoolean(offset + 44, $sppl_grp_flg1);
	}

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public void sppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 44, $sppl_grp_flg1, value);
	}


	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return getConstString(offset + 45, $sppl_grp_cd1);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		setConstString(offset + 45, $sppl_grp_cd1, value);
	}


	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return getConstString(offset + 46, $sppl_grp_nm1);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		setConstString(offset + 46, $sppl_grp_nm1, value);
	}


	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public boolean sppl_grp_flg2() {
		return getConstBoolean(offset + 47, $sppl_grp_flg2);
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public void sppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 47, $sppl_grp_flg2, value);
	}


	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return getConstString(offset + 48, $sppl_grp_cd2);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		setConstString(offset + 48, $sppl_grp_cd2, value);
	}


	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return getConstString(offset + 49, $sppl_grp_nm2);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		setConstString(offset + 49, $sppl_grp_nm2, value);
	}


	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public boolean sppl_grp_flg3() {
		return getConstBoolean(offset + 50, $sppl_grp_flg3);
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public void sppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 50, $sppl_grp_flg3, value);
	}


	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return getConstString(offset + 51, $sppl_grp_cd3);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		setConstString(offset + 51, $sppl_grp_cd3, value);
	}


	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return getConstString(offset + 52, $sppl_grp_nm3);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		setConstString(offset + 52, $sppl_grp_nm3, value);
	}


	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public boolean sppl_grp_flg4() {
		return getConstBoolean(offset + 53, $sppl_grp_flg4);
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public void sppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 53, $sppl_grp_flg4, value);
	}


	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return getConstString(offset + 54, $sppl_grp_cd4);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		setConstString(offset + 54, $sppl_grp_cd4, value);
	}


	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return getConstString(offset + 55, $sppl_grp_nm4);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		setConstString(offset + 55, $sppl_grp_nm4, value);
	}


	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public boolean sppl_grp_flg5() {
		return getConstBoolean(offset + 56, $sppl_grp_flg5);
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public void sppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 56, $sppl_grp_flg5, value);
	}


	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return getConstString(offset + 57, $sppl_grp_cd5);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		setConstString(offset + 57, $sppl_grp_cd5, value);
	}


	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return getConstString(offset + 58, $sppl_grp_nm5);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		setConstString(offset + 58, $sppl_grp_nm5, value);
	}


	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public boolean sppl_grp_flg6() {
		return getConstBoolean(offset + 59, $sppl_grp_flg6);
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public void sppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 59, $sppl_grp_flg6, value);
	}


	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return getConstString(offset + 60, $sppl_grp_cd6);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		setConstString(offset + 60, $sppl_grp_cd6, value);
	}


	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return getConstString(offset + 61, $sppl_grp_nm6);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		setConstString(offset + 61, $sppl_grp_nm6, value);
	}


	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public boolean sppl_grp_flg7() {
		return getConstBoolean(offset + 62, $sppl_grp_flg7);
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public void sppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 62, $sppl_grp_flg7, value);
	}


	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return getConstString(offset + 63, $sppl_grp_cd7);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		setConstString(offset + 63, $sppl_grp_cd7, value);
	}


	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return getConstString(offset + 64, $sppl_grp_nm7);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		setConstString(offset + 64, $sppl_grp_nm7, value);
	}


	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public boolean sppl_grp_flg8() {
		return getConstBoolean(offset + 65, $sppl_grp_flg8);
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public void sppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 65, $sppl_grp_flg8, value);
	}


	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return getConstString(offset + 66, $sppl_grp_cd8);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		setConstString(offset + 66, $sppl_grp_cd8, value);
	}


	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return getConstString(offset + 67, $sppl_grp_nm8);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		setConstString(offset + 67, $sppl_grp_nm8, value);
	}


	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public boolean sppl_grp_flg9() {
		return getConstBoolean(offset + 68, $sppl_grp_flg9);
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public void sppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 68, $sppl_grp_flg9, value);
	}


	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return getConstString(offset + 69, $sppl_grp_cd9);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		setConstString(offset + 69, $sppl_grp_cd9, value);
	}


	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return getConstString(offset + 70, $sppl_grp_nm9);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		setConstString(offset + 70, $sppl_grp_nm9, value);
	}


	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public boolean sppl_grp_flg10() {
		return getConstBoolean(offset + 71, $sppl_grp_flg10);
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public void sppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 71, $sppl_grp_flg10, value);
	}


	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return getConstString(offset + 72, $sppl_grp_cd10);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		setConstString(offset + 72, $sppl_grp_cd10, value);
	}


	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return getConstString(offset + 73, $sppl_grp_nm10);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		setConstString(offset + 73, $sppl_grp_nm10, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 74, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 74, $itm_grp_flg1, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 75, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 75, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 76, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 76, $itm_grp_nm1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 77, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 77, $itm_grp_flg2, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 78, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 78, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 79, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 79, $itm_grp_nm2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 80, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 80, $itm_grp_flg3, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 81, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 81, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 82, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 82, $itm_grp_nm3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 83, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 83, $itm_grp_flg4, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 84, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 84, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 85, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 85, $itm_grp_nm4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 86, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 86, $itm_grp_flg5, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 87, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 87, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 88, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 88, $itm_grp_nm5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 89, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 89, $itm_grp_flg6, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 90, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 90, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 91, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 91, $itm_grp_nm6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 92, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 92, $itm_grp_flg7, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 93, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 93, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 94, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 94, $itm_grp_nm7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 95, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 95, $itm_grp_flg8, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 96, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 96, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 97, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 97, $itm_grp_nm8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 98, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 98, $itm_grp_flg9, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 99, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 99, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 100, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 100, $itm_grp_nm9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 101, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 101, $itm_grp_flg10, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 102, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 102, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 103, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 103, $itm_grp_nm10, value);
	}


	public String getString(String name) {
		if ($screen_ope.equalsIgnoreCase(name)) {
			return screen_ope();
		}
		if ($disp_ope.equalsIgnoreCase(name)) {
			return disp_ope();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			return pf_usr_cd();
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			return pf_usr_nm();
		}
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			return pf_dpt_cd();
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			return pf_dpt_nm();
		}
		if ($pf_wg_cd.equalsIgnoreCase(name)) {
			return pf_wg_cd();
		}
		if ($pf_wg_nm.equalsIgnoreCase(name)) {
			return pf_wg_nm();
		}
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			return pf_rpt_no();
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
		if ($hdr_rpt_rmrks.equalsIgnoreCase(name)) {
			return hdr_rpt_rmrks();
		}
		if ($hdr_intr_rmrks.equalsIgnoreCase(name)) {
			return hdr_intr_rmrks();
		}
		if ($hdr_sub_char1.equalsIgnoreCase(name)) {
			return hdr_sub_char1();
		}
		if ($hdr_sub_char2.equalsIgnoreCase(name)) {
			return hdr_sub_char2();
		}
		if ($hdr_sub_char3.equalsIgnoreCase(name)) {
			return hdr_sub_char3();
		}
		if ($dtl_rpt_rmrks.equalsIgnoreCase(name)) {
			return dtl_rpt_rmrks();
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			return dtl_intr_rmrks();
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
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
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($pf_dt_fr.equalsIgnoreCase(name)) {
			return pf_dt_fr();
		}
		if ($pf_dt_to.equalsIgnoreCase(name)) {
			return pf_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($fix_f_flg.equalsIgnoreCase(name)) {
			return fix_f_flg();
		}
		if ($fix_t_flg.equalsIgnoreCase(name)) {
			return fix_t_flg();
		}
		if ($rpt_f_flg.equalsIgnoreCase(name)) {
			return rpt_f_flg();
		}
		if ($rpt_t_flg.equalsIgnoreCase(name)) {
			return rpt_t_flg();
		}
		if ($del_f_flg.equalsIgnoreCase(name)) {
			return del_f_flg();
		}
		if ($del_t_flg.equalsIgnoreCase(name)) {
			return del_t_flg();
		}
		if ($subcon_t_flg.equalsIgnoreCase(name)) {
			return subcon_t_flg();
		}
		if ($subcon_f_flg.equalsIgnoreCase(name)) {
			return subcon_f_flg();
		}
		if ($purc_commit_t_flg.equalsIgnoreCase(name)) {
			return purc_commit_t_flg();
		}
		if ($purc_commit_f_flg.equalsIgnoreCase(name)) {
			return purc_commit_f_flg();
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			return sppl_grp_flg1();
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			return sppl_grp_flg2();
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			return sppl_grp_flg3();
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			return sppl_grp_flg4();
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			return sppl_grp_flg5();
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			return sppl_grp_flg6();
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			return sppl_grp_flg7();
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			return sppl_grp_flg8();
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			return sppl_grp_flg9();
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			return sppl_grp_flg10();
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($screen_ope.equalsIgnoreCase(name)) {
			return screen_ope();
		}
		if ($disp_ope.equalsIgnoreCase(name)) {
			return disp_ope();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			return pf_usr_cd();
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			return pf_usr_nm();
		}
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			return pf_dpt_cd();
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			return pf_dpt_nm();
		}
		if ($pf_wg_cd.equalsIgnoreCase(name)) {
			return pf_wg_cd();
		}
		if ($pf_wg_nm.equalsIgnoreCase(name)) {
			return pf_wg_nm();
		}
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			return pf_rpt_no();
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
		if ($hdr_rpt_rmrks.equalsIgnoreCase(name)) {
			return hdr_rpt_rmrks();
		}
		if ($hdr_intr_rmrks.equalsIgnoreCase(name)) {
			return hdr_intr_rmrks();
		}
		if ($hdr_sub_char1.equalsIgnoreCase(name)) {
			return hdr_sub_char1();
		}
		if ($hdr_sub_char2.equalsIgnoreCase(name)) {
			return hdr_sub_char2();
		}
		if ($hdr_sub_char3.equalsIgnoreCase(name)) {
			return hdr_sub_char3();
		}
		if ($dtl_rpt_rmrks.equalsIgnoreCase(name)) {
			return dtl_rpt_rmrks();
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			return dtl_intr_rmrks();
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
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
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pf_dt_fr.equalsIgnoreCase(name)) {
			return pf_dt_fr();
		}
		if ($pf_dt_to.equalsIgnoreCase(name)) {
			return pf_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($fix_f_flg.equalsIgnoreCase(name)) {
			return fix_f_flg();
		}
		if ($fix_t_flg.equalsIgnoreCase(name)) {
			return fix_t_flg();
		}
		if ($rpt_f_flg.equalsIgnoreCase(name)) {
			return rpt_f_flg();
		}
		if ($rpt_t_flg.equalsIgnoreCase(name)) {
			return rpt_t_flg();
		}
		if ($del_f_flg.equalsIgnoreCase(name)) {
			return del_f_flg();
		}
		if ($del_t_flg.equalsIgnoreCase(name)) {
			return del_t_flg();
		}
		if ($subcon_t_flg.equalsIgnoreCase(name)) {
			return subcon_t_flg();
		}
		if ($subcon_f_flg.equalsIgnoreCase(name)) {
			return subcon_f_flg();
		}
		if ($purc_commit_t_flg.equalsIgnoreCase(name)) {
			return purc_commit_t_flg();
		}
		if ($purc_commit_f_flg.equalsIgnoreCase(name)) {
			return purc_commit_f_flg();
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			return sppl_grp_flg1();
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			return sppl_grp_flg2();
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			return sppl_grp_flg3();
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			return sppl_grp_flg4();
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			return sppl_grp_flg5();
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			return sppl_grp_flg6();
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			return sppl_grp_flg7();
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			return sppl_grp_flg8();
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			return sppl_grp_flg9();
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			return sppl_grp_flg10();
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($screen_ope.equalsIgnoreCase(name)) {
			screen_ope(value);
			return;
		}
		if ($disp_ope.equalsIgnoreCase(name)) {
			disp_ope(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			pf_usr_cd(value);
			return;
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			pf_usr_nm(value);
			return;
		}
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			pf_dpt_cd(value);
			return;
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			pf_dpt_nm(value);
			return;
		}
		if ($pf_wg_cd.equalsIgnoreCase(name)) {
			pf_wg_cd(value);
			return;
		}
		if ($pf_wg_nm.equalsIgnoreCase(name)) {
			pf_wg_nm(value);
			return;
		}
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			pf_rpt_no(value);
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
		if ($hdr_rpt_rmrks.equalsIgnoreCase(name)) {
			hdr_rpt_rmrks(value);
			return;
		}
		if ($hdr_intr_rmrks.equalsIgnoreCase(name)) {
			hdr_intr_rmrks(value);
			return;
		}
		if ($hdr_sub_char1.equalsIgnoreCase(name)) {
			hdr_sub_char1(value);
			return;
		}
		if ($hdr_sub_char2.equalsIgnoreCase(name)) {
			hdr_sub_char2(value);
			return;
		}
		if ($hdr_sub_char3.equalsIgnoreCase(name)) {
			hdr_sub_char3(value);
			return;
		}
		if ($dtl_rpt_rmrks.equalsIgnoreCase(name)) {
			dtl_rpt_rmrks(value);
			return;
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			dtl_intr_rmrks(value);
			return;
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
			return;
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
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
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pf_dt_fr.equalsIgnoreCase(name)) {
			pf_dt_fr(value);
			return;
		}
		if ($pf_dt_to.equalsIgnoreCase(name)) {
			pf_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($fix_f_flg.equalsIgnoreCase(name)) {
			fix_f_flg(value);
			return;
		}
		if ($fix_t_flg.equalsIgnoreCase(name)) {
			fix_t_flg(value);
			return;
		}
		if ($rpt_f_flg.equalsIgnoreCase(name)) {
			rpt_f_flg(value);
			return;
		}
		if ($rpt_t_flg.equalsIgnoreCase(name)) {
			rpt_t_flg(value);
			return;
		}
		if ($del_f_flg.equalsIgnoreCase(name)) {
			del_f_flg(value);
			return;
		}
		if ($del_t_flg.equalsIgnoreCase(name)) {
			del_t_flg(value);
			return;
		}
		if ($subcon_t_flg.equalsIgnoreCase(name)) {
			subcon_t_flg(value);
			return;
		}
		if ($subcon_f_flg.equalsIgnoreCase(name)) {
			subcon_f_flg(value);
			return;
		}
		if ($purc_commit_t_flg.equalsIgnoreCase(name)) {
			purc_commit_t_flg(value);
			return;
		}
		if ($purc_commit_f_flg.equalsIgnoreCase(name)) {
			purc_commit_f_flg(value);
			return;
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			sppl_grp_flg1(value);
			return;
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			sppl_grp_flg2(value);
			return;
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			sppl_grp_flg3(value);
			return;
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			sppl_grp_flg4(value);
			return;
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			sppl_grp_flg5(value);
			return;
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			sppl_grp_flg6(value);
			return;
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			sppl_grp_flg7(value);
			return;
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			sppl_grp_flg8(value);
			return;
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			sppl_grp_flg9(value);
			return;
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			sppl_grp_flg10(value);
			return;
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($screen_ope.equalsIgnoreCase(name)) {
			screen_ope(value);
			return;
		}
		if ($disp_ope.equalsIgnoreCase(name)) {
			disp_ope(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			pf_usr_cd(value);
			return;
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			pf_usr_nm(value);
			return;
		}
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			pf_dpt_cd(value);
			return;
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			pf_dpt_nm(value);
			return;
		}
		if ($pf_wg_cd.equalsIgnoreCase(name)) {
			pf_wg_cd(value);
			return;
		}
		if ($pf_wg_nm.equalsIgnoreCase(name)) {
			pf_wg_nm(value);
			return;
		}
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			pf_rpt_no(value);
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
		if ($hdr_rpt_rmrks.equalsIgnoreCase(name)) {
			hdr_rpt_rmrks(value);
			return;
		}
		if ($hdr_intr_rmrks.equalsIgnoreCase(name)) {
			hdr_intr_rmrks(value);
			return;
		}
		if ($hdr_sub_char1.equalsIgnoreCase(name)) {
			hdr_sub_char1(value);
			return;
		}
		if ($hdr_sub_char2.equalsIgnoreCase(name)) {
			hdr_sub_char2(value);
			return;
		}
		if ($hdr_sub_char3.equalsIgnoreCase(name)) {
			hdr_sub_char3(value);
			return;
		}
		if ($dtl_rpt_rmrks.equalsIgnoreCase(name)) {
			dtl_rpt_rmrks(value);
			return;
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			dtl_intr_rmrks(value);
			return;
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
			return;
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
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
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pf_dt_fr.equalsIgnoreCase(name)) {
			pf_dt_fr(value);
			return;
		}
		if ($pf_dt_to.equalsIgnoreCase(name)) {
			pf_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($fix_f_flg.equalsIgnoreCase(name)) {
			fix_f_flg(value);
			return;
		}
		if ($fix_t_flg.equalsIgnoreCase(name)) {
			fix_t_flg(value);
			return;
		}
		if ($rpt_f_flg.equalsIgnoreCase(name)) {
			rpt_f_flg(value);
			return;
		}
		if ($rpt_t_flg.equalsIgnoreCase(name)) {
			rpt_t_flg(value);
			return;
		}
		if ($del_f_flg.equalsIgnoreCase(name)) {
			del_f_flg(value);
			return;
		}
		if ($del_t_flg.equalsIgnoreCase(name)) {
			del_t_flg(value);
			return;
		}
		if ($subcon_t_flg.equalsIgnoreCase(name)) {
			subcon_t_flg(value);
			return;
		}
		if ($subcon_f_flg.equalsIgnoreCase(name)) {
			subcon_f_flg(value);
			return;
		}
		if ($purc_commit_t_flg.equalsIgnoreCase(name)) {
			purc_commit_t_flg(value);
			return;
		}
		if ($purc_commit_f_flg.equalsIgnoreCase(name)) {
			purc_commit_f_flg(value);
			return;
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			sppl_grp_flg1(value);
			return;
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			sppl_grp_flg2(value);
			return;
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			sppl_grp_flg3(value);
			return;
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			sppl_grp_flg4(value);
			return;
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			sppl_grp_flg5(value);
			return;
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			sppl_grp_flg6(value);
			return;
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			sppl_grp_flg7(value);
			return;
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			sppl_grp_flg8(value);
			return;
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			sppl_grp_flg9(value);
			return;
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			sppl_grp_flg10(value);
			return;
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

