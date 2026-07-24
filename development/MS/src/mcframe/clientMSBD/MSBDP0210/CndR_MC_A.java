package mcframe.clientMSBD.MSBDP0210;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * UPD,Modify;DEL,Cancel;DEL_CAN,Revert cancellation;RPT,Issue report;REF,View UPD,訂正する;DEL,取り消す;DEL_CAN,取り消し戻す;RPT,帳票発行;REF,参照する.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * HDR,Header;DTL,Details HDR,ヘッダ;DTL,明細.<p>
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
	 * Latest only 最新のみ.<p>
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
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
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
	public static final String $sppl_grp_p = "sppl_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";
	/**
	 * Display last 前回表示.<p>
	 *
	 */
	public static final String $show_pre_flg = "show_pre_flg";
	/**
	 * Display base unit 基準単位表示.<p>
	 *
	 */
	public static final String $show_base_unit_flg = "show_base_unit_flg";

	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $sppl_grp_lab1 = $sppl_grp_p + ".bp_grp_lab1";
	public static final String $sppl_grp_flg1 = $sppl_grp_p + ".bp_grp_flg1";
	public static final String $sppl_grp_cd1 = $sppl_grp_p + ".bp_grp_cd1";
	public static final String $sppl_grp_nm1 = $sppl_grp_p + ".bp_grp_nm1";
	public static final String $sppl_grp_lab2 = $sppl_grp_p + ".bp_grp_lab2";
	public static final String $sppl_grp_flg2 = $sppl_grp_p + ".bp_grp_flg2";
	public static final String $sppl_grp_cd2 = $sppl_grp_p + ".bp_grp_cd2";
	public static final String $sppl_grp_nm2 = $sppl_grp_p + ".bp_grp_nm2";
	public static final String $sppl_grp_lab3 = $sppl_grp_p + ".bp_grp_lab3";
	public static final String $sppl_grp_flg3 = $sppl_grp_p + ".bp_grp_flg3";
	public static final String $sppl_grp_cd3 = $sppl_grp_p + ".bp_grp_cd3";
	public static final String $sppl_grp_nm3 = $sppl_grp_p + ".bp_grp_nm3";
	public static final String $sppl_grp_lab4 = $sppl_grp_p + ".bp_grp_lab4";
	public static final String $sppl_grp_flg4 = $sppl_grp_p + ".bp_grp_flg4";
	public static final String $sppl_grp_cd4 = $sppl_grp_p + ".bp_grp_cd4";
	public static final String $sppl_grp_nm4 = $sppl_grp_p + ".bp_grp_nm4";
	public static final String $sppl_grp_lab5 = $sppl_grp_p + ".bp_grp_lab5";
	public static final String $sppl_grp_flg5 = $sppl_grp_p + ".bp_grp_flg5";
	public static final String $sppl_grp_cd5 = $sppl_grp_p + ".bp_grp_cd5";
	public static final String $sppl_grp_nm5 = $sppl_grp_p + ".bp_grp_nm5";
	public static final String $sppl_grp_lab6 = $sppl_grp_p + ".bp_grp_lab6";
	public static final String $sppl_grp_flg6 = $sppl_grp_p + ".bp_grp_flg6";
	public static final String $sppl_grp_cd6 = $sppl_grp_p + ".bp_grp_cd6";
	public static final String $sppl_grp_nm6 = $sppl_grp_p + ".bp_grp_nm6";
	public static final String $sppl_grp_lab7 = $sppl_grp_p + ".bp_grp_lab7";
	public static final String $sppl_grp_flg7 = $sppl_grp_p + ".bp_grp_flg7";
	public static final String $sppl_grp_cd7 = $sppl_grp_p + ".bp_grp_cd7";
	public static final String $sppl_grp_nm7 = $sppl_grp_p + ".bp_grp_nm7";
	public static final String $sppl_grp_lab8 = $sppl_grp_p + ".bp_grp_lab8";
	public static final String $sppl_grp_flg8 = $sppl_grp_p + ".bp_grp_flg8";
	public static final String $sppl_grp_cd8 = $sppl_grp_p + ".bp_grp_cd8";
	public static final String $sppl_grp_nm8 = $sppl_grp_p + ".bp_grp_nm8";
	public static final String $sppl_grp_lab9 = $sppl_grp_p + ".bp_grp_lab9";
	public static final String $sppl_grp_flg9 = $sppl_grp_p + ".bp_grp_flg9";
	public static final String $sppl_grp_cd9 = $sppl_grp_p + ".bp_grp_cd9";
	public static final String $sppl_grp_nm9 = $sppl_grp_p + ".bp_grp_nm9";
	public static final String $sppl_grp_lab10 = $sppl_grp_p + ".bp_grp_lab10";
	public static final String $sppl_grp_flg10 = $sppl_grp_p + ".bp_grp_flg10";
	public static final String $sppl_grp_cd10 = $sppl_grp_p + ".bp_grp_cd10";
	public static final String $sppl_grp_nm10 = $sppl_grp_p + ".bp_grp_nm10";
	public static final String $itm_grp_flg1 = $itm_grp_p + ".itm_grp_flg1";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_flg2 = $itm_grp_p + ".itm_grp_flg2";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_flg3 = $itm_grp_p + ".itm_grp_flg3";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_flg4 = $itm_grp_p + ".itm_grp_flg4";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_flg5 = $itm_grp_p + ".itm_grp_flg5";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_flg6 = $itm_grp_p + ".itm_grp_flg6";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_flg7 = $itm_grp_p + ".itm_grp_flg7";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_flg8 = $itm_grp_p + ".itm_grp_flg8";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_flg9 = $itm_grp_p + ".itm_grp_flg9";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_flg10 = $itm_grp_p + ".itm_grp_flg10";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";

	public static final MCMeta ope_META = createStringMeta($ope);
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
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
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
	public static final MCMeta sppl_grp_p_META = createInnerRowMeta($sppl_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);
	public static final MCMeta show_pre_flg_META = createCommonMeta($show_pre_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta show_base_unit_flg_META = createCommonMeta($show_base_unit_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
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
			itm_typ_p_META,
			itm_p_META,
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
			sppl_grp_p_META,
			itm_grp_p_META,
			show_pre_flg_META,
			show_base_unit_flg_META
		},
		new String[][]{
			{
				"itm_typ",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"sppl_grp_flg1",
				"sppl_grp_cd1",
				"sppl_grp_nm1",
				"sppl_grp_flg2",
				"sppl_grp_cd2",
				"sppl_grp_nm2",
				"sppl_grp_flg3",
				"sppl_grp_cd3",
				"sppl_grp_nm3",
				"sppl_grp_flg4",
				"sppl_grp_cd4",
				"sppl_grp_nm4",
				"sppl_grp_flg5",
				"sppl_grp_cd5",
				"sppl_grp_nm5",
				"sppl_grp_flg6",
				"sppl_grp_cd6",
				"sppl_grp_nm6",
				"sppl_grp_flg7",
				"sppl_grp_cd7",
				"sppl_grp_nm7",
				"sppl_grp_flg8",
				"sppl_grp_cd8",
				"sppl_grp_nm8",
				"sppl_grp_flg9",
				"sppl_grp_cd9",
				"sppl_grp_nm9",
				"sppl_grp_flg10",
				"sppl_grp_cd10",
				"sppl_grp_nm10",
				"itm_grp_flg1",
				"itm_grp_cd1",
				"itm_grp_nm1",
				"itm_grp_flg2",
				"itm_grp_cd2",
				"itm_grp_nm2",
				"itm_grp_flg3",
				"itm_grp_cd3",
				"itm_grp_nm3",
				"itm_grp_flg4",
				"itm_grp_cd4",
				"itm_grp_nm4",
				"itm_grp_flg5",
				"itm_grp_cd5",
				"itm_grp_nm5",
				"itm_grp_flg6",
				"itm_grp_cd6",
				"itm_grp_nm6",
				"itm_grp_flg7",
				"itm_grp_cd7",
				"itm_grp_nm7",
				"itm_grp_flg8",
				"itm_grp_cd8",
				"itm_grp_nm8",
				"itm_grp_flg9",
				"itm_grp_cd9",
				"itm_grp_nm9",
				"itm_grp_flg10",
				"itm_grp_cd10",
				"itm_grp_nm10"
			},
			{
				$itm_typ,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$sppl_grp_flg1,
				$sppl_grp_cd1,
				$sppl_grp_nm1,
				$sppl_grp_flg2,
				$sppl_grp_cd2,
				$sppl_grp_nm2,
				$sppl_grp_flg3,
				$sppl_grp_cd3,
				$sppl_grp_nm3,
				$sppl_grp_flg4,
				$sppl_grp_cd4,
				$sppl_grp_nm4,
				$sppl_grp_flg5,
				$sppl_grp_cd5,
				$sppl_grp_nm5,
				$sppl_grp_flg6,
				$sppl_grp_cd6,
				$sppl_grp_nm6,
				$sppl_grp_flg7,
				$sppl_grp_cd7,
				$sppl_grp_nm7,
				$sppl_grp_flg8,
				$sppl_grp_cd8,
				$sppl_grp_nm8,
				$sppl_grp_flg9,
				$sppl_grp_cd9,
				$sppl_grp_nm9,
				$sppl_grp_flg10,
				$sppl_grp_cd10,
				$sppl_grp_nm10,
				$itm_grp_flg1,
				$itm_grp_cd1,
				$itm_grp_nm1,
				$itm_grp_flg2,
				$itm_grp_cd2,
				$itm_grp_nm2,
				$itm_grp_flg3,
				$itm_grp_cd3,
				$itm_grp_nm3,
				$itm_grp_flg4,
				$itm_grp_cd4,
				$itm_grp_nm4,
				$itm_grp_flg5,
				$itm_grp_cd5,
				$itm_grp_nm5,
				$itm_grp_flg6,
				$itm_grp_cd6,
				$itm_grp_nm6,
				$itm_grp_flg7,
				$itm_grp_cd7,
				$itm_grp_nm7,
				$itm_grp_flg8,
				$itm_grp_cd8,
				$itm_grp_nm8,
				$itm_grp_flg9,
				$itm_grp_cd9,
				$itm_grp_nm9,
				$itm_grp_flg10,
				$itm_grp_cd10,
				$itm_grp_nm10
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$pf_usr_cd, "usr_nm"},	// pf_usr_cd
				{$pf_dpt_cd, "dpt_nm"},	// pf_dpt_cd
				{$pf_wg_cd, "wg_nm"}	// pf_wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.PURC_FRCST"},	// sppl_cd
				{$pf_dpt_cd, "MAC_DPT_IS_SRCH_TYP.PURC;true"},	// pf_dpt_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.PURC_FRCST"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_cd;MAC_ITM_IS_SRCH_TYP.PURC_FRCST"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_cd;itm_sub1;MAC_ITM_IS_SRCH_TYP.PURC_FRCST"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2;MAC_ITM_IS_SRCH_TYP.PURC_FRCST"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$pf_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// pf_dpt_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_cd;itm_is_srch_typ"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_cd;itm_sub1;itm_is_srch_typ"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2;itm_is_srch_typ"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$pf_wg_cd, "WG"},	// pf_wg_cd
				{$pf_wg_nm, "WG"},	// pf_wg_nm
				{$show_base_unit_flg, "BASE_UNIT"}	// show_base_unit_flg
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * UPD,Modify;DEL,Cancel;DEL_CAN,Revert cancellation;RPT,Issue report;REF,View UPD,訂正する;DEL,取り消す;DEL_CAN,取り消し戻す;RPT,帳票発行;REF,参照する.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Modify;DEL,Cancel;DEL_CAN,Revert cancellation;RPT,Issue report;REF,View UPD,訂正する;DEL,取り消す;DEL_CAN,取り消し戻す;RPT,帳票発行;REF,参照する.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * HDR,Header;DTL,Details HDR,ヘッダ;DTL,明細.<p>
	 *
	 */
	public String disp_ope() {
		return getConstString(offset + 1, $disp_ope);
	}

	/**
	 * HDR,Header;DTL,Details HDR,ヘッダ;DTL,明細.<p>
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
	 * Latest only 最新のみ.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 14, $latest_flg);
	}

	/**
	 * Latest only 最新のみ.<p>
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


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 26, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 26, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 27, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 27, $itm_p, row);
	}


	/**
	 * Header report remarks ヘッダ帳票備考.<p>
	 *
	 */
	public String hdr_rpt_rmrks() {
		return getConstString(offset + 28, $hdr_rpt_rmrks);
	}

	/**
	 * Header report remarks ヘッダ帳票備考.<p>
	 *
	 */
	public void hdr_rpt_rmrks(String value) {
		setConstString(offset + 28, $hdr_rpt_rmrks, value);
	}


	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public String hdr_intr_rmrks() {
		return getConstString(offset + 29, $hdr_intr_rmrks);
	}

	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public void hdr_intr_rmrks(String value) {
		setConstString(offset + 29, $hdr_intr_rmrks, value);
	}


	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public String hdr_sub_char1() {
		return getConstString(offset + 30, $hdr_sub_char1);
	}

	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public void hdr_sub_char1(String value) {
		setConstString(offset + 30, $hdr_sub_char1, value);
	}


	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public String hdr_sub_char2() {
		return getConstString(offset + 31, $hdr_sub_char2);
	}

	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public void hdr_sub_char2(String value) {
		setConstString(offset + 31, $hdr_sub_char2, value);
	}


	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public String hdr_sub_char3() {
		return getConstString(offset + 32, $hdr_sub_char3);
	}

	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public void hdr_sub_char3(String value) {
		setConstString(offset + 32, $hdr_sub_char3, value);
	}


	/**
	 * Details report remarks 明細帳票備考.<p>
	 *
	 */
	public String dtl_rpt_rmrks() {
		return getConstString(offset + 33, $dtl_rpt_rmrks);
	}

	/**
	 * Details report remarks 明細帳票備考.<p>
	 *
	 */
	public void dtl_rpt_rmrks(String value) {
		setConstString(offset + 33, $dtl_rpt_rmrks, value);
	}


	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public String dtl_intr_rmrks() {
		return getConstString(offset + 34, $dtl_intr_rmrks);
	}

	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public void dtl_intr_rmrks(String value) {
		setConstString(offset + 34, $dtl_intr_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String dtl_sub_char1() {
		return getConstString(offset + 35, $dtl_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void dtl_sub_char1(String value) {
		setConstString(offset + 35, $dtl_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String dtl_sub_char2() {
		return getConstString(offset + 36, $dtl_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void dtl_sub_char2(String value) {
		setConstString(offset + 36, $dtl_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String dtl_sub_char3() {
		return getConstString(offset + 37, $dtl_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void dtl_sub_char3(String value) {
		setConstString(offset + 37, $dtl_sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 38, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 38, $sppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 39, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 39, $itm_grp_p, row);
	}


	/**
	 * Display last 前回表示.<p>
	 *
	 */
	public boolean show_pre_flg() {
		return getConstBoolean(offset + 40, $show_pre_flg);
	}

	/**
	 * Display last 前回表示.<p>
	 *
	 */
	public void show_pre_flg(boolean value) {
		setConstBoolean(offset + 40, $show_pre_flg, value);
	}


	/**
	 * Display base unit 基準単位表示.<p>
	 *
	 */
	public boolean show_base_unit_flg() {
		return getConstBoolean(offset + 41, $show_base_unit_flg);
	}

	/**
	 * Display base unit 基準単位表示.<p>
	 *
	 */
	public void show_base_unit_flg(boolean value) {
		setConstBoolean(offset + 41, $show_base_unit_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
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
		if ($show_pre_flg.equalsIgnoreCase(name)) {
			return show_pre_flg();
		}
		if ($show_base_unit_flg.equalsIgnoreCase(name)) {
			return show_base_unit_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
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
		if ($show_pre_flg.equalsIgnoreCase(name)) {
			return show_pre_flg();
		}
		if ($show_base_unit_flg.equalsIgnoreCase(name)) {
			return show_base_unit_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($show_pre_flg.equalsIgnoreCase(name)) {
			show_pre_flg(value);
			return;
		}
		if ($show_base_unit_flg.equalsIgnoreCase(name)) {
			show_base_unit_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($show_pre_flg.equalsIgnoreCase(name)) {
			show_pre_flg(value);
			return;
		}
		if ($show_base_unit_flg.equalsIgnoreCase(name)) {
			show_base_unit_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			return sppl_grp_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			itm_typ_p(
				((MCContainerMeta) itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			sppl_grp_p(
				((MCContainerMeta) sppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	public String itm_typ_d_cd() {
		return itm_typ_p().itm_typ_d_cd();
	}

	public void itm_typ_d_cd(String value) {
		itm_typ_p().itm_typ_d_cd(value);
	}

	public String itm_typ_d_nm() {
		return itm_typ_p().itm_typ_d_nm();
	}

	public void itm_typ_d_nm(String value) {
		itm_typ_p().itm_typ_d_nm(value);
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

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public boolean sppl_grp_flg1() {
		return sppl_grp_p().bp_grp_flg1();
	}

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public void sppl_grp_flg1(boolean value) {
		sppl_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return sppl_grp_p().bp_grp_cd1();
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		sppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return sppl_grp_p().bp_grp_nm1();
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		sppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public boolean sppl_grp_flg2() {
		return sppl_grp_p().bp_grp_flg2();
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public void sppl_grp_flg2(boolean value) {
		sppl_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return sppl_grp_p().bp_grp_cd2();
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		sppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return sppl_grp_p().bp_grp_nm2();
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		sppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public boolean sppl_grp_flg3() {
		return sppl_grp_p().bp_grp_flg3();
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public void sppl_grp_flg3(boolean value) {
		sppl_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return sppl_grp_p().bp_grp_cd3();
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		sppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return sppl_grp_p().bp_grp_nm3();
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		sppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public boolean sppl_grp_flg4() {
		return sppl_grp_p().bp_grp_flg4();
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public void sppl_grp_flg4(boolean value) {
		sppl_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return sppl_grp_p().bp_grp_cd4();
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		sppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return sppl_grp_p().bp_grp_nm4();
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		sppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public boolean sppl_grp_flg5() {
		return sppl_grp_p().bp_grp_flg5();
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public void sppl_grp_flg5(boolean value) {
		sppl_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return sppl_grp_p().bp_grp_cd5();
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		sppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return sppl_grp_p().bp_grp_nm5();
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		sppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public boolean sppl_grp_flg6() {
		return sppl_grp_p().bp_grp_flg6();
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public void sppl_grp_flg6(boolean value) {
		sppl_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return sppl_grp_p().bp_grp_cd6();
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		sppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return sppl_grp_p().bp_grp_nm6();
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		sppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public boolean sppl_grp_flg7() {
		return sppl_grp_p().bp_grp_flg7();
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public void sppl_grp_flg7(boolean value) {
		sppl_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return sppl_grp_p().bp_grp_cd7();
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		sppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return sppl_grp_p().bp_grp_nm7();
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		sppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public boolean sppl_grp_flg8() {
		return sppl_grp_p().bp_grp_flg8();
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public void sppl_grp_flg8(boolean value) {
		sppl_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return sppl_grp_p().bp_grp_cd8();
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		sppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return sppl_grp_p().bp_grp_nm8();
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		sppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public boolean sppl_grp_flg9() {
		return sppl_grp_p().bp_grp_flg9();
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public void sppl_grp_flg9(boolean value) {
		sppl_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return sppl_grp_p().bp_grp_cd9();
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		sppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return sppl_grp_p().bp_grp_nm9();
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		sppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public boolean sppl_grp_flg10() {
		return sppl_grp_p().bp_grp_flg10();
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public void sppl_grp_flg10(boolean value) {
		sppl_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return sppl_grp_p().bp_grp_cd10();
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		sppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return sppl_grp_p().bp_grp_nm10();
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		sppl_grp_p().bp_grp_nm10(value);
	}

	public boolean itm_grp_flg1() {
		return itm_grp_p().itm_grp_flg1();
	}

	public void itm_grp_flg1(boolean value) {
		itm_grp_p().itm_grp_flg1(value);
	}

	public String itm_grp_cd1() {
		return itm_grp_p().itm_grp_cd1();
	}

	public void itm_grp_cd1(String value) {
		itm_grp_p().itm_grp_cd1(value);
	}

	public String itm_grp_nm1() {
		return itm_grp_p().itm_grp_nm1();
	}

	public void itm_grp_nm1(String value) {
		itm_grp_p().itm_grp_nm1(value);
	}

	public boolean itm_grp_flg2() {
		return itm_grp_p().itm_grp_flg2();
	}

	public void itm_grp_flg2(boolean value) {
		itm_grp_p().itm_grp_flg2(value);
	}

	public String itm_grp_cd2() {
		return itm_grp_p().itm_grp_cd2();
	}

	public void itm_grp_cd2(String value) {
		itm_grp_p().itm_grp_cd2(value);
	}

	public String itm_grp_nm2() {
		return itm_grp_p().itm_grp_nm2();
	}

	public void itm_grp_nm2(String value) {
		itm_grp_p().itm_grp_nm2(value);
	}

	public boolean itm_grp_flg3() {
		return itm_grp_p().itm_grp_flg3();
	}

	public void itm_grp_flg3(boolean value) {
		itm_grp_p().itm_grp_flg3(value);
	}

	public String itm_grp_cd3() {
		return itm_grp_p().itm_grp_cd3();
	}

	public void itm_grp_cd3(String value) {
		itm_grp_p().itm_grp_cd3(value);
	}

	public String itm_grp_nm3() {
		return itm_grp_p().itm_grp_nm3();
	}

	public void itm_grp_nm3(String value) {
		itm_grp_p().itm_grp_nm3(value);
	}

	public boolean itm_grp_flg4() {
		return itm_grp_p().itm_grp_flg4();
	}

	public void itm_grp_flg4(boolean value) {
		itm_grp_p().itm_grp_flg4(value);
	}

	public String itm_grp_cd4() {
		return itm_grp_p().itm_grp_cd4();
	}

	public void itm_grp_cd4(String value) {
		itm_grp_p().itm_grp_cd4(value);
	}

	public String itm_grp_nm4() {
		return itm_grp_p().itm_grp_nm4();
	}

	public void itm_grp_nm4(String value) {
		itm_grp_p().itm_grp_nm4(value);
	}

	public boolean itm_grp_flg5() {
		return itm_grp_p().itm_grp_flg5();
	}

	public void itm_grp_flg5(boolean value) {
		itm_grp_p().itm_grp_flg5(value);
	}

	public String itm_grp_cd5() {
		return itm_grp_p().itm_grp_cd5();
	}

	public void itm_grp_cd5(String value) {
		itm_grp_p().itm_grp_cd5(value);
	}

	public String itm_grp_nm5() {
		return itm_grp_p().itm_grp_nm5();
	}

	public void itm_grp_nm5(String value) {
		itm_grp_p().itm_grp_nm5(value);
	}

	public boolean itm_grp_flg6() {
		return itm_grp_p().itm_grp_flg6();
	}

	public void itm_grp_flg6(boolean value) {
		itm_grp_p().itm_grp_flg6(value);
	}

	public String itm_grp_cd6() {
		return itm_grp_p().itm_grp_cd6();
	}

	public void itm_grp_cd6(String value) {
		itm_grp_p().itm_grp_cd6(value);
	}

	public String itm_grp_nm6() {
		return itm_grp_p().itm_grp_nm6();
	}

	public void itm_grp_nm6(String value) {
		itm_grp_p().itm_grp_nm6(value);
	}

	public boolean itm_grp_flg7() {
		return itm_grp_p().itm_grp_flg7();
	}

	public void itm_grp_flg7(boolean value) {
		itm_grp_p().itm_grp_flg7(value);
	}

	public String itm_grp_cd7() {
		return itm_grp_p().itm_grp_cd7();
	}

	public void itm_grp_cd7(String value) {
		itm_grp_p().itm_grp_cd7(value);
	}

	public String itm_grp_nm7() {
		return itm_grp_p().itm_grp_nm7();
	}

	public void itm_grp_nm7(String value) {
		itm_grp_p().itm_grp_nm7(value);
	}

	public boolean itm_grp_flg8() {
		return itm_grp_p().itm_grp_flg8();
	}

	public void itm_grp_flg8(boolean value) {
		itm_grp_p().itm_grp_flg8(value);
	}

	public String itm_grp_cd8() {
		return itm_grp_p().itm_grp_cd8();
	}

	public void itm_grp_cd8(String value) {
		itm_grp_p().itm_grp_cd8(value);
	}

	public String itm_grp_nm8() {
		return itm_grp_p().itm_grp_nm8();
	}

	public void itm_grp_nm8(String value) {
		itm_grp_p().itm_grp_nm8(value);
	}

	public boolean itm_grp_flg9() {
		return itm_grp_p().itm_grp_flg9();
	}

	public void itm_grp_flg9(boolean value) {
		itm_grp_p().itm_grp_flg9(value);
	}

	public String itm_grp_cd9() {
		return itm_grp_p().itm_grp_cd9();
	}

	public void itm_grp_cd9(String value) {
		itm_grp_p().itm_grp_cd9(value);
	}

	public String itm_grp_nm9() {
		return itm_grp_p().itm_grp_nm9();
	}

	public void itm_grp_nm9(String value) {
		itm_grp_p().itm_grp_nm9(value);
	}

	public boolean itm_grp_flg10() {
		return itm_grp_p().itm_grp_flg10();
	}

	public void itm_grp_flg10(boolean value) {
		itm_grp_p().itm_grp_flg10(value);
	}

	public String itm_grp_cd10() {
		return itm_grp_p().itm_grp_cd10();
	}

	public void itm_grp_cd10(String value) {
		itm_grp_p().itm_grp_cd10(value);
	}

	public String itm_grp_nm10() {
		return itm_grp_p().itm_grp_nm10();
	}

	public void itm_grp_nm10(String value) {
		itm_grp_p().itm_grp_nm10(value);
	}

}

