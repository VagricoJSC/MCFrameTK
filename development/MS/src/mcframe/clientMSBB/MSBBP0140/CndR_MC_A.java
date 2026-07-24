package mcframe.clientMSBB.MSBBP0140;

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
	 * USR,Input;SUM,Aggregate USR,入力;SUM,集計.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Plan month FROM 計画年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $usr_ym_fr = "usr_ym_fr";
	/**
	 * Plan month TO 計画年月ＴＯ.<p>
	 *
	 */
	public static final String $usr_ym_to = "usr_ym_to";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_usr_cd = "usr_usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_usr_nm = "usr_usr_nm";
	/**
	 * By dept. 部門別.<p>
	 *
	 */
	public static final String $usr_dpt_flg = "usr_dpt_flg";
	/**
	 * By customer 得意先別.<p>
	 *
	 */
	public static final String $usr_cst_flg = "usr_cst_flg";
	/**
	 * By sales project No. 案件ＮＯ別.<p>
	 *
	 */
	public static final String $usr_wrk_flg = "usr_wrk_flg";
	/**
	 * Editing 編集中.<p>
	 *
	 */
	public static final String $usr_edited_f_flg = "usr_edited_f_flg";
	/**
	 * Edited 編集済.<p>
	 *
	 */
	public static final String $usr_edited_t_flg = "usr_edited_t_flg";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $usr_dpt_cd = "usr_dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $usr_dpt_nm = "usr_dpt_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $usr_wg_cd = "usr_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $usr_wg_nm = "usr_wg_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $usr_cst_cd = "usr_cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $usr_cst_nm = "usr_cst_nm";
	public static final String $usr_wrk_no_p = "usr_wrk_no_p";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $usr_intr_rmrks = "usr_intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $usr_sub_char1 = "usr_sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $usr_sub_char2 = "usr_sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $usr_sub_char3 = "usr_sub_char3";
	/**
	 * Plan month FROM 計画年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $sum_ym_fr = "sum_ym_fr";
	/**
	 * Plan month TO 計画年月ＴＯ.<p>
	 *
	 */
	public static final String $sum_ym_to = "sum_ym_to";
	/**
	 * Version バージョン.<p>
	 *
	 */
	public static final String $sum_spln_vers = "sum_spln_vers";
	/**
	 * Editing 編集中.<p>
	 *
	 */
	public static final String $sum_edited_f_flg = "sum_edited_f_flg";
	/**
	 * Edited 編集済.<p>
	 *
	 */
	public static final String $sum_edited_t_flg = "sum_edited_t_flg";
	/**
	 * Adopt 採用.<p>
	 *
	 */
	public static final String $sum_adopted_t_flg = "sum_adopted_t_flg";
	/**
	 * Not adopted 不採用.<p>
	 *
	 */
	public static final String $sum_adopted_f_flg = "sum_adopted_f_flg";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $sum_dpt_cd = "sum_dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $sum_dpt_nm = "sum_dpt_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $sum_wg_cd = "sum_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $sum_wg_nm = "sum_wg_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $sum_cst_cd = "sum_cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $sum_cst_nm = "sum_cst_nm";
	public static final String $sum_wrk_no_p = "sum_wrk_no_p";
	/**
	 * Aggregation PIC cd. 集計担当者ＣＤ.<p>
	 *
	 */
	public static final String $sum_usr_cd = "sum_usr_cd";
	/**
	 * Aggregation PIC name 集計担当者名.<p>
	 *
	 */
	public static final String $sum_usr_nm = "sum_usr_nm";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $sum_intr_rmrks = "sum_intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sum_sub_char1 = "sum_sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sum_sub_char2 = "sum_sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sum_sub_char3 = "sum_sub_char3";
	public static final String $bp_grp_p = "bp_grp_p";

	public static final String $usr_wrk_no = $usr_wrk_no_p + ".wrk_no";
	public static final String $usr_wrk_nm = $usr_wrk_no_p + ".wrk_nm";
	public static final String $sum_wrk_no = $sum_wrk_no_p + ".wrk_no";
	public static final String $sum_wrk_nm = $sum_wrk_no_p + ".wrk_nm";
	public static final String $bp_grp_lab1 = $bp_grp_p + ".bp_grp_lab1";
	public static final String $bp_grp_flg1 = $bp_grp_p + ".bp_grp_flg1";
	public static final String $bp_grp_cd1 = $bp_grp_p + ".bp_grp_cd1";
	public static final String $bp_grp_nm1 = $bp_grp_p + ".bp_grp_nm1";
	public static final String $bp_grp_lab2 = $bp_grp_p + ".bp_grp_lab2";
	public static final String $bp_grp_flg2 = $bp_grp_p + ".bp_grp_flg2";
	public static final String $bp_grp_cd2 = $bp_grp_p + ".bp_grp_cd2";
	public static final String $bp_grp_nm2 = $bp_grp_p + ".bp_grp_nm2";
	public static final String $bp_grp_lab3 = $bp_grp_p + ".bp_grp_lab3";
	public static final String $bp_grp_flg3 = $bp_grp_p + ".bp_grp_flg3";
	public static final String $bp_grp_cd3 = $bp_grp_p + ".bp_grp_cd3";
	public static final String $bp_grp_nm3 = $bp_grp_p + ".bp_grp_nm3";
	public static final String $bp_grp_lab4 = $bp_grp_p + ".bp_grp_lab4";
	public static final String $bp_grp_flg4 = $bp_grp_p + ".bp_grp_flg4";
	public static final String $bp_grp_cd4 = $bp_grp_p + ".bp_grp_cd4";
	public static final String $bp_grp_nm4 = $bp_grp_p + ".bp_grp_nm4";
	public static final String $bp_grp_lab5 = $bp_grp_p + ".bp_grp_lab5";
	public static final String $bp_grp_flg5 = $bp_grp_p + ".bp_grp_flg5";
	public static final String $bp_grp_cd5 = $bp_grp_p + ".bp_grp_cd5";
	public static final String $bp_grp_nm5 = $bp_grp_p + ".bp_grp_nm5";
	public static final String $bp_grp_lab6 = $bp_grp_p + ".bp_grp_lab6";
	public static final String $bp_grp_flg6 = $bp_grp_p + ".bp_grp_flg6";
	public static final String $bp_grp_cd6 = $bp_grp_p + ".bp_grp_cd6";
	public static final String $bp_grp_nm6 = $bp_grp_p + ".bp_grp_nm6";
	public static final String $bp_grp_lab7 = $bp_grp_p + ".bp_grp_lab7";
	public static final String $bp_grp_flg7 = $bp_grp_p + ".bp_grp_flg7";
	public static final String $bp_grp_cd7 = $bp_grp_p + ".bp_grp_cd7";
	public static final String $bp_grp_nm7 = $bp_grp_p + ".bp_grp_nm7";
	public static final String $bp_grp_lab8 = $bp_grp_p + ".bp_grp_lab8";
	public static final String $bp_grp_flg8 = $bp_grp_p + ".bp_grp_flg8";
	public static final String $bp_grp_cd8 = $bp_grp_p + ".bp_grp_cd8";
	public static final String $bp_grp_nm8 = $bp_grp_p + ".bp_grp_nm8";
	public static final String $bp_grp_lab9 = $bp_grp_p + ".bp_grp_lab9";
	public static final String $bp_grp_flg9 = $bp_grp_p + ".bp_grp_flg9";
	public static final String $bp_grp_cd9 = $bp_grp_p + ".bp_grp_cd9";
	public static final String $bp_grp_nm9 = $bp_grp_p + ".bp_grp_nm9";
	public static final String $bp_grp_lab10 = $bp_grp_p + ".bp_grp_lab10";
	public static final String $bp_grp_flg10 = $bp_grp_p + ".bp_grp_flg10";
	public static final String $bp_grp_cd10 = $bp_grp_p + ".bp_grp_cd10";
	public static final String $bp_grp_nm10 = $bp_grp_p + ".bp_grp_nm10";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta usr_ym_fr_META = createCommonMeta($usr_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta usr_ym_to_META = createCommonMeta($usr_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta usr_usr_cd_META = createCommonMeta($usr_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_usr_nm_META = createCommonMeta($usr_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_dpt_flg_META = createCommonMeta($usr_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_cst_flg_META = createCommonMeta($usr_cst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_wrk_flg_META = createCommonMeta($usr_wrk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_edited_f_flg_META = createCommonMeta($usr_edited_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_edited_t_flg_META = createCommonMeta($usr_edited_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_dpt_cd_META = createCommonMeta($usr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta usr_dpt_nm_META = createCommonMeta($usr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta usr_wg_cd_META = createCommonMeta($usr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta usr_wg_nm_META = createCommonMeta($usr_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta usr_cst_cd_META = createCommonMeta($usr_cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta usr_cst_nm_META = createCommonMeta($usr_cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta usr_wrk_no_p_META = createInnerRowMeta($usr_wrk_no_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta usr_intr_rmrks_META = createCommonMeta($usr_intr_rmrks, mcframe.commonMS.meta.MS_META.SPLN_USR_INTR_RMRKS);
	public static final MCMeta usr_sub_char1_META = createCommonMeta($usr_sub_char1, mcframe.commonMS.meta.MS_META.SPLN_USR_SUB_CHAR1);
	public static final MCMeta usr_sub_char2_META = createCommonMeta($usr_sub_char2, mcframe.commonMS.meta.MS_META.SPLN_USR_SUB_CHAR2);
	public static final MCMeta usr_sub_char3_META = createCommonMeta($usr_sub_char3, mcframe.commonMS.meta.MS_META.SPLN_USR_SUB_CHAR3);
	public static final MCMeta sum_ym_fr_META = createCommonMeta($sum_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sum_ym_to_META = createCommonMeta($sum_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sum_spln_vers_META = createCommonMeta($sum_spln_vers, mcframe.commonMS.meta.MS_META.SPLN_VERS);
	public static final MCMeta sum_edited_f_flg_META = createCommonMeta($sum_edited_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum_edited_t_flg_META = createCommonMeta($sum_edited_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum_adopted_t_flg_META = createCommonMeta($sum_adopted_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum_adopted_f_flg_META = createCommonMeta($sum_adopted_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum_dpt_cd_META = createCommonMeta($sum_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sum_dpt_nm_META = createCommonMeta($sum_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta sum_wg_cd_META = createCommonMeta($sum_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta sum_wg_nm_META = createCommonMeta($sum_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta sum_cst_cd_META = createCommonMeta($sum_cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sum_cst_nm_META = createCommonMeta($sum_cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sum_wrk_no_p_META = createInnerRowMeta($sum_wrk_no_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta sum_usr_cd_META = createCommonMeta($sum_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sum_usr_nm_META = createCommonMeta($sum_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta sum_intr_rmrks_META = createCommonMeta($sum_intr_rmrks, mcframe.commonMS.meta.MS_META.SPLN_SUM_INTR_RMRKS);
	public static final MCMeta sum_sub_char1_META = createCommonMeta($sum_sub_char1, mcframe.commonMS.meta.MS_META.SPLN_SUM_SUB_CHAR1);
	public static final MCMeta sum_sub_char2_META = createCommonMeta($sum_sub_char2, mcframe.commonMS.meta.MS_META.SPLN_SUM_SUB_CHAR2);
	public static final MCMeta sum_sub_char3_META = createCommonMeta($sum_sub_char3, mcframe.commonMS.meta.MS_META.SPLN_SUM_SUB_CHAR3);
	public static final MCMeta bp_grp_p_META = createInnerRowMeta($bp_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			usr_ym_fr_META,
			usr_ym_to_META,
			usr_usr_cd_META,
			usr_usr_nm_META,
			usr_dpt_flg_META,
			usr_cst_flg_META,
			usr_wrk_flg_META,
			usr_edited_f_flg_META,
			usr_edited_t_flg_META,
			usr_dpt_cd_META,
			usr_dpt_nm_META,
			usr_wg_cd_META,
			usr_wg_nm_META,
			usr_cst_cd_META,
			usr_cst_nm_META,
			usr_wrk_no_p_META,
			usr_intr_rmrks_META,
			usr_sub_char1_META,
			usr_sub_char2_META,
			usr_sub_char3_META,
			sum_ym_fr_META,
			sum_ym_to_META,
			sum_spln_vers_META,
			sum_edited_f_flg_META,
			sum_edited_t_flg_META,
			sum_adopted_t_flg_META,
			sum_adopted_f_flg_META,
			sum_dpt_cd_META,
			sum_dpt_nm_META,
			sum_wg_cd_META,
			sum_wg_nm_META,
			sum_cst_cd_META,
			sum_cst_nm_META,
			sum_wrk_no_p_META,
			sum_usr_cd_META,
			sum_usr_nm_META,
			sum_intr_rmrks_META,
			sum_sub_char1_META,
			sum_sub_char2_META,
			sum_sub_char3_META,
			bp_grp_p_META
		},
		new String[][]{
			{
				"usr_wrk_no",
				"usr_wrk_nm",
				"sum_wrk_no",
				"sum_wrk_nm",
				"bp_grp_flg1",
				"bp_grp_cd1",
				"bp_grp_nm1",
				"bp_grp_flg2",
				"bp_grp_cd2",
				"bp_grp_nm2",
				"bp_grp_flg3",
				"bp_grp_cd3",
				"bp_grp_nm3",
				"bp_grp_flg4",
				"bp_grp_cd4",
				"bp_grp_nm4",
				"bp_grp_flg5",
				"bp_grp_cd5",
				"bp_grp_nm5",
				"bp_grp_flg6",
				"bp_grp_cd6",
				"bp_grp_nm6",
				"bp_grp_flg7",
				"bp_grp_cd7",
				"bp_grp_nm7",
				"bp_grp_flg8",
				"bp_grp_cd8",
				"bp_grp_nm8",
				"bp_grp_flg9",
				"bp_grp_cd9",
				"bp_grp_nm9",
				"bp_grp_flg10",
				"bp_grp_cd10",
				"bp_grp_nm10"
			},
			{
				$usr_wrk_no,
				$usr_wrk_nm,
				$sum_wrk_no,
				$sum_wrk_nm,
				$bp_grp_flg1,
				$bp_grp_cd1,
				$bp_grp_nm1,
				$bp_grp_flg2,
				$bp_grp_cd2,
				$bp_grp_nm2,
				$bp_grp_flg3,
				$bp_grp_cd3,
				$bp_grp_nm3,
				$bp_grp_flg4,
				$bp_grp_cd4,
				$bp_grp_nm4,
				$bp_grp_flg5,
				$bp_grp_cd5,
				$bp_grp_nm5,
				$bp_grp_flg6,
				$bp_grp_cd6,
				$bp_grp_nm6,
				$bp_grp_flg7,
				$bp_grp_cd7,
				$bp_grp_nm7,
				$bp_grp_flg8,
				$bp_grp_cd8,
				$bp_grp_nm8,
				$bp_grp_flg9,
				$bp_grp_cd9,
				$bp_grp_nm9,
				$bp_grp_flg10,
				$bp_grp_cd10,
				$bp_grp_nm10
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
				{$usr_usr_cd, "usr_nm"},	// usr_usr_cd
				{$usr_dpt_cd, "dpt_nm"},	// usr_dpt_cd
				{$usr_wg_cd, "wg_nm"},	// usr_wg_cd
				{$usr_cst_cd, "bp_nm"},	// usr_cst_cd
				{$usr_wrk_no_p + ".wrk_no", "wrk_nm"},	// usr_wrk_no_p.wrk_no
				{$sum_dpt_cd, "dpt_nm"},	// sum_dpt_cd
				{$sum_wg_cd, "wg_nm"},	// sum_wg_cd
				{$sum_cst_cd, "bp_nm"},	// sum_cst_cd
				{$sum_wrk_no_p + ".wrk_no", "wrk_nm"},	// sum_wrk_no_p.wrk_no
				{$sum_usr_cd, "usr_nm"}	// sum_usr_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$usr_dpt_cd, "MAC_DPT_IS_SRCH_TYP.SLS;true"},	// usr_dpt_cd
				{$usr_cst_cd, "MAC_BP_IS_SRCH_TYP.CST"},	// usr_cst_cd
				{$sum_dpt_cd, "MAC_DPT_IS_SRCH_TYP.SLS;true"},	// sum_dpt_cd
				{$sum_cst_cd, "MAC_BP_IS_SRCH_TYP.CST"}	// sum_cst_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// usr_dpt_cd
				{$usr_cst_cd, "bp_is_srch_typ"},	// usr_cst_cd
				{$sum_dpt_cd, "dpt_is_srch_typ;mode_today_flg"},	// sum_dpt_cd
				{$sum_cst_cd, "bp_is_srch_typ"}	// sum_cst_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$usr_wrk_flg, "WRK"},	// usr_wrk_flg
				{$usr_wg_cd, "WG"},	// usr_wg_cd
				{$usr_wg_nm, "WG"},	// usr_wg_nm
				{$sum_wg_cd, "WG"},	// sum_wg_cd
				{$sum_wg_nm, "WG"}	// sum_wg_nm
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
	 * USR,Input;SUM,Aggregate USR,入力;SUM,集計.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * USR,Input;SUM,Aggregate USR,入力;SUM,集計.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Plan month FROM 計画年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate usr_ym_fr() {
		return getConstDate(offset + 1, $usr_ym_fr);
	}

	/**
	 * Plan month FROM 計画年月ＦＲＯＭ.<p>
	 *
	 */
	public void usr_ym_fr(MCDate value) {
		setConstDate(offset + 1, $usr_ym_fr, value);
	}


	/**
	 * Plan month TO 計画年月ＴＯ.<p>
	 *
	 */
	public MCDate usr_ym_to() {
		return getConstDate(offset + 2, $usr_ym_to);
	}

	/**
	 * Plan month TO 計画年月ＴＯ.<p>
	 *
	 */
	public void usr_ym_to(MCDate value) {
		setConstDate(offset + 2, $usr_ym_to, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_usr_cd() {
		return getConstString(offset + 3, $usr_usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_usr_cd(String value) {
		setConstString(offset + 3, $usr_usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_usr_nm() {
		return getConstString(offset + 4, $usr_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_usr_nm(String value) {
		setConstString(offset + 4, $usr_usr_nm, value);
	}


	/**
	 * By dept. 部門別.<p>
	 *
	 */
	public boolean usr_dpt_flg() {
		return getConstBoolean(offset + 5, $usr_dpt_flg);
	}

	/**
	 * By dept. 部門別.<p>
	 *
	 */
	public void usr_dpt_flg(boolean value) {
		setConstBoolean(offset + 5, $usr_dpt_flg, value);
	}


	/**
	 * By customer 得意先別.<p>
	 *
	 */
	public boolean usr_cst_flg() {
		return getConstBoolean(offset + 6, $usr_cst_flg);
	}

	/**
	 * By customer 得意先別.<p>
	 *
	 */
	public void usr_cst_flg(boolean value) {
		setConstBoolean(offset + 6, $usr_cst_flg, value);
	}


	/**
	 * By sales project No. 案件ＮＯ別.<p>
	 *
	 */
	public boolean usr_wrk_flg() {
		return getConstBoolean(offset + 7, $usr_wrk_flg);
	}

	/**
	 * By sales project No. 案件ＮＯ別.<p>
	 *
	 */
	public void usr_wrk_flg(boolean value) {
		setConstBoolean(offset + 7, $usr_wrk_flg, value);
	}


	/**
	 * Editing 編集中.<p>
	 *
	 */
	public boolean usr_edited_f_flg() {
		return getConstBoolean(offset + 8, $usr_edited_f_flg);
	}

	/**
	 * Editing 編集中.<p>
	 *
	 */
	public void usr_edited_f_flg(boolean value) {
		setConstBoolean(offset + 8, $usr_edited_f_flg, value);
	}


	/**
	 * Edited 編集済.<p>
	 *
	 */
	public boolean usr_edited_t_flg() {
		return getConstBoolean(offset + 9, $usr_edited_t_flg);
	}

	/**
	 * Edited 編集済.<p>
	 *
	 */
	public void usr_edited_t_flg(boolean value) {
		setConstBoolean(offset + 9, $usr_edited_t_flg, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String usr_dpt_cd() {
		return getConstString(offset + 10, $usr_dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void usr_dpt_cd(String value) {
		setConstString(offset + 10, $usr_dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String usr_dpt_nm() {
		return getConstString(offset + 11, $usr_dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void usr_dpt_nm(String value) {
		setConstString(offset + 11, $usr_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String usr_wg_cd() {
		return getConstString(offset + 12, $usr_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void usr_wg_cd(String value) {
		setConstString(offset + 12, $usr_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String usr_wg_nm() {
		return getConstString(offset + 13, $usr_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void usr_wg_nm(String value) {
		setConstString(offset + 13, $usr_wg_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String usr_cst_cd() {
		return getConstString(offset + 14, $usr_cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void usr_cst_cd(String value) {
		setConstString(offset + 14, $usr_cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String usr_cst_nm() {
		return getConstString(offset + 15, $usr_cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void usr_cst_nm(String value) {
		setConstString(offset + 15, $usr_cst_nm, value);
	}


	public mcframe.clientMSUB.MSUBP0010.WrkNoR usr_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 16, $usr_wrk_no_p);
	}
	
	public void usr_wrk_no_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 16, $usr_wrk_no_p, row);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String usr_intr_rmrks() {
		return getConstString(offset + 17, $usr_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void usr_intr_rmrks(String value) {
		setConstString(offset + 17, $usr_intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String usr_sub_char1() {
		return getConstString(offset + 18, $usr_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void usr_sub_char1(String value) {
		setConstString(offset + 18, $usr_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String usr_sub_char2() {
		return getConstString(offset + 19, $usr_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void usr_sub_char2(String value) {
		setConstString(offset + 19, $usr_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String usr_sub_char3() {
		return getConstString(offset + 20, $usr_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void usr_sub_char3(String value) {
		setConstString(offset + 20, $usr_sub_char3, value);
	}


	/**
	 * Plan month FROM 計画年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate sum_ym_fr() {
		return getConstDate(offset + 21, $sum_ym_fr);
	}

	/**
	 * Plan month FROM 計画年月ＦＲＯＭ.<p>
	 *
	 */
	public void sum_ym_fr(MCDate value) {
		setConstDate(offset + 21, $sum_ym_fr, value);
	}


	/**
	 * Plan month TO 計画年月ＴＯ.<p>
	 *
	 */
	public MCDate sum_ym_to() {
		return getConstDate(offset + 22, $sum_ym_to);
	}

	/**
	 * Plan month TO 計画年月ＴＯ.<p>
	 *
	 */
	public void sum_ym_to(MCDate value) {
		setConstDate(offset + 22, $sum_ym_to, value);
	}


	/**
	 * Version バージョン.<p>
	 *
	 */
	public String sum_spln_vers() {
		return getConstString(offset + 23, $sum_spln_vers);
	}

	/**
	 * Version バージョン.<p>
	 *
	 */
	public void sum_spln_vers(String value) {
		setConstString(offset + 23, $sum_spln_vers, value);
	}


	/**
	 * Editing 編集中.<p>
	 *
	 */
	public boolean sum_edited_f_flg() {
		return getConstBoolean(offset + 24, $sum_edited_f_flg);
	}

	/**
	 * Editing 編集中.<p>
	 *
	 */
	public void sum_edited_f_flg(boolean value) {
		setConstBoolean(offset + 24, $sum_edited_f_flg, value);
	}


	/**
	 * Edited 編集済.<p>
	 *
	 */
	public boolean sum_edited_t_flg() {
		return getConstBoolean(offset + 25, $sum_edited_t_flg);
	}

	/**
	 * Edited 編集済.<p>
	 *
	 */
	public void sum_edited_t_flg(boolean value) {
		setConstBoolean(offset + 25, $sum_edited_t_flg, value);
	}


	/**
	 * Adopt 採用.<p>
	 *
	 */
	public boolean sum_adopted_t_flg() {
		return getConstBoolean(offset + 26, $sum_adopted_t_flg);
	}

	/**
	 * Adopt 採用.<p>
	 *
	 */
	public void sum_adopted_t_flg(boolean value) {
		setConstBoolean(offset + 26, $sum_adopted_t_flg, value);
	}


	/**
	 * Not adopted 不採用.<p>
	 *
	 */
	public boolean sum_adopted_f_flg() {
		return getConstBoolean(offset + 27, $sum_adopted_f_flg);
	}

	/**
	 * Not adopted 不採用.<p>
	 *
	 */
	public void sum_adopted_f_flg(boolean value) {
		setConstBoolean(offset + 27, $sum_adopted_f_flg, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String sum_dpt_cd() {
		return getConstString(offset + 28, $sum_dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void sum_dpt_cd(String value) {
		setConstString(offset + 28, $sum_dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String sum_dpt_nm() {
		return getConstString(offset + 29, $sum_dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void sum_dpt_nm(String value) {
		setConstString(offset + 29, $sum_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String sum_wg_cd() {
		return getConstString(offset + 30, $sum_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void sum_wg_cd(String value) {
		setConstString(offset + 30, $sum_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String sum_wg_nm() {
		return getConstString(offset + 31, $sum_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void sum_wg_nm(String value) {
		setConstString(offset + 31, $sum_wg_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String sum_cst_cd() {
		return getConstString(offset + 32, $sum_cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void sum_cst_cd(String value) {
		setConstString(offset + 32, $sum_cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String sum_cst_nm() {
		return getConstString(offset + 33, $sum_cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void sum_cst_nm(String value) {
		setConstString(offset + 33, $sum_cst_nm, value);
	}


	public mcframe.clientMSUB.MSUBP0010.WrkNoR sum_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 34, $sum_wrk_no_p);
	}
	
	public void sum_wrk_no_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 34, $sum_wrk_no_p, row);
	}


	/**
	 * Aggregation PIC cd. 集計担当者ＣＤ.<p>
	 *
	 */
	public String sum_usr_cd() {
		return getConstString(offset + 35, $sum_usr_cd);
	}

	/**
	 * Aggregation PIC cd. 集計担当者ＣＤ.<p>
	 *
	 */
	public void sum_usr_cd(String value) {
		setConstString(offset + 35, $sum_usr_cd, value);
	}


	/**
	 * Aggregation PIC name 集計担当者名.<p>
	 *
	 */
	public String sum_usr_nm() {
		return getConstString(offset + 36, $sum_usr_nm);
	}

	/**
	 * Aggregation PIC name 集計担当者名.<p>
	 *
	 */
	public void sum_usr_nm(String value) {
		setConstString(offset + 36, $sum_usr_nm, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String sum_intr_rmrks() {
		return getConstString(offset + 37, $sum_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void sum_intr_rmrks(String value) {
		setConstString(offset + 37, $sum_intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sum_sub_char1() {
		return getConstString(offset + 38, $sum_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sum_sub_char1(String value) {
		setConstString(offset + 38, $sum_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sum_sub_char2() {
		return getConstString(offset + 39, $sum_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sum_sub_char2(String value) {
		setConstString(offset + 39, $sum_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sum_sub_char3() {
		return getConstString(offset + 40, $sum_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sum_sub_char3(String value) {
		setConstString(offset + 40, $sum_sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR bp_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 41, $bp_grp_p);
	}
	
	public void bp_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 41, $bp_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($usr_usr_cd.equalsIgnoreCase(name)) {
			return usr_usr_cd();
		}
		if ($usr_usr_nm.equalsIgnoreCase(name)) {
			return usr_usr_nm();
		}
		if ($usr_dpt_cd.equalsIgnoreCase(name)) {
			return usr_dpt_cd();
		}
		if ($usr_dpt_nm.equalsIgnoreCase(name)) {
			return usr_dpt_nm();
		}
		if ($usr_wg_cd.equalsIgnoreCase(name)) {
			return usr_wg_cd();
		}
		if ($usr_wg_nm.equalsIgnoreCase(name)) {
			return usr_wg_nm();
		}
		if ($usr_cst_cd.equalsIgnoreCase(name)) {
			return usr_cst_cd();
		}
		if ($usr_cst_nm.equalsIgnoreCase(name)) {
			return usr_cst_nm();
		}
		if ($usr_intr_rmrks.equalsIgnoreCase(name)) {
			return usr_intr_rmrks();
		}
		if ($usr_sub_char1.equalsIgnoreCase(name)) {
			return usr_sub_char1();
		}
		if ($usr_sub_char2.equalsIgnoreCase(name)) {
			return usr_sub_char2();
		}
		if ($usr_sub_char3.equalsIgnoreCase(name)) {
			return usr_sub_char3();
		}
		if ($sum_spln_vers.equalsIgnoreCase(name)) {
			return sum_spln_vers();
		}
		if ($sum_dpt_cd.equalsIgnoreCase(name)) {
			return sum_dpt_cd();
		}
		if ($sum_dpt_nm.equalsIgnoreCase(name)) {
			return sum_dpt_nm();
		}
		if ($sum_wg_cd.equalsIgnoreCase(name)) {
			return sum_wg_cd();
		}
		if ($sum_wg_nm.equalsIgnoreCase(name)) {
			return sum_wg_nm();
		}
		if ($sum_cst_cd.equalsIgnoreCase(name)) {
			return sum_cst_cd();
		}
		if ($sum_cst_nm.equalsIgnoreCase(name)) {
			return sum_cst_nm();
		}
		if ($sum_usr_cd.equalsIgnoreCase(name)) {
			return sum_usr_cd();
		}
		if ($sum_usr_nm.equalsIgnoreCase(name)) {
			return sum_usr_nm();
		}
		if ($sum_intr_rmrks.equalsIgnoreCase(name)) {
			return sum_intr_rmrks();
		}
		if ($sum_sub_char1.equalsIgnoreCase(name)) {
			return sum_sub_char1();
		}
		if ($sum_sub_char2.equalsIgnoreCase(name)) {
			return sum_sub_char2();
		}
		if ($sum_sub_char3.equalsIgnoreCase(name)) {
			return sum_sub_char3();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($usr_ym_fr.equalsIgnoreCase(name)) {
			return usr_ym_fr();
		}
		if ($usr_ym_to.equalsIgnoreCase(name)) {
			return usr_ym_to();
		}
		if ($sum_ym_fr.equalsIgnoreCase(name)) {
			return sum_ym_fr();
		}
		if ($sum_ym_to.equalsIgnoreCase(name)) {
			return sum_ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($usr_dpt_flg.equalsIgnoreCase(name)) {
			return usr_dpt_flg();
		}
		if ($usr_cst_flg.equalsIgnoreCase(name)) {
			return usr_cst_flg();
		}
		if ($usr_wrk_flg.equalsIgnoreCase(name)) {
			return usr_wrk_flg();
		}
		if ($usr_edited_f_flg.equalsIgnoreCase(name)) {
			return usr_edited_f_flg();
		}
		if ($usr_edited_t_flg.equalsIgnoreCase(name)) {
			return usr_edited_t_flg();
		}
		if ($sum_edited_f_flg.equalsIgnoreCase(name)) {
			return sum_edited_f_flg();
		}
		if ($sum_edited_t_flg.equalsIgnoreCase(name)) {
			return sum_edited_t_flg();
		}
		if ($sum_adopted_t_flg.equalsIgnoreCase(name)) {
			return sum_adopted_t_flg();
		}
		if ($sum_adopted_f_flg.equalsIgnoreCase(name)) {
			return sum_adopted_f_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($usr_usr_cd.equalsIgnoreCase(name)) {
			return usr_usr_cd();
		}
		if ($usr_usr_nm.equalsIgnoreCase(name)) {
			return usr_usr_nm();
		}
		if ($usr_dpt_cd.equalsIgnoreCase(name)) {
			return usr_dpt_cd();
		}
		if ($usr_dpt_nm.equalsIgnoreCase(name)) {
			return usr_dpt_nm();
		}
		if ($usr_wg_cd.equalsIgnoreCase(name)) {
			return usr_wg_cd();
		}
		if ($usr_wg_nm.equalsIgnoreCase(name)) {
			return usr_wg_nm();
		}
		if ($usr_cst_cd.equalsIgnoreCase(name)) {
			return usr_cst_cd();
		}
		if ($usr_cst_nm.equalsIgnoreCase(name)) {
			return usr_cst_nm();
		}
		if ($usr_intr_rmrks.equalsIgnoreCase(name)) {
			return usr_intr_rmrks();
		}
		if ($usr_sub_char1.equalsIgnoreCase(name)) {
			return usr_sub_char1();
		}
		if ($usr_sub_char2.equalsIgnoreCase(name)) {
			return usr_sub_char2();
		}
		if ($usr_sub_char3.equalsIgnoreCase(name)) {
			return usr_sub_char3();
		}
		if ($sum_spln_vers.equalsIgnoreCase(name)) {
			return sum_spln_vers();
		}
		if ($sum_dpt_cd.equalsIgnoreCase(name)) {
			return sum_dpt_cd();
		}
		if ($sum_dpt_nm.equalsIgnoreCase(name)) {
			return sum_dpt_nm();
		}
		if ($sum_wg_cd.equalsIgnoreCase(name)) {
			return sum_wg_cd();
		}
		if ($sum_wg_nm.equalsIgnoreCase(name)) {
			return sum_wg_nm();
		}
		if ($sum_cst_cd.equalsIgnoreCase(name)) {
			return sum_cst_cd();
		}
		if ($sum_cst_nm.equalsIgnoreCase(name)) {
			return sum_cst_nm();
		}
		if ($sum_usr_cd.equalsIgnoreCase(name)) {
			return sum_usr_cd();
		}
		if ($sum_usr_nm.equalsIgnoreCase(name)) {
			return sum_usr_nm();
		}
		if ($sum_intr_rmrks.equalsIgnoreCase(name)) {
			return sum_intr_rmrks();
		}
		if ($sum_sub_char1.equalsIgnoreCase(name)) {
			return sum_sub_char1();
		}
		if ($sum_sub_char2.equalsIgnoreCase(name)) {
			return sum_sub_char2();
		}
		if ($sum_sub_char3.equalsIgnoreCase(name)) {
			return sum_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($usr_ym_fr.equalsIgnoreCase(name)) {
			return usr_ym_fr();
		}
		if ($usr_ym_to.equalsIgnoreCase(name)) {
			return usr_ym_to();
		}
		if ($sum_ym_fr.equalsIgnoreCase(name)) {
			return sum_ym_fr();
		}
		if ($sum_ym_to.equalsIgnoreCase(name)) {
			return sum_ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($usr_dpt_flg.equalsIgnoreCase(name)) {
			return usr_dpt_flg();
		}
		if ($usr_cst_flg.equalsIgnoreCase(name)) {
			return usr_cst_flg();
		}
		if ($usr_wrk_flg.equalsIgnoreCase(name)) {
			return usr_wrk_flg();
		}
		if ($usr_edited_f_flg.equalsIgnoreCase(name)) {
			return usr_edited_f_flg();
		}
		if ($usr_edited_t_flg.equalsIgnoreCase(name)) {
			return usr_edited_t_flg();
		}
		if ($sum_edited_f_flg.equalsIgnoreCase(name)) {
			return sum_edited_f_flg();
		}
		if ($sum_edited_t_flg.equalsIgnoreCase(name)) {
			return sum_edited_t_flg();
		}
		if ($sum_adopted_t_flg.equalsIgnoreCase(name)) {
			return sum_adopted_t_flg();
		}
		if ($sum_adopted_f_flg.equalsIgnoreCase(name)) {
			return sum_adopted_f_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($usr_usr_cd.equalsIgnoreCase(name)) {
			usr_usr_cd(value);
			return;
		}
		if ($usr_usr_nm.equalsIgnoreCase(name)) {
			usr_usr_nm(value);
			return;
		}
		if ($usr_dpt_cd.equalsIgnoreCase(name)) {
			usr_dpt_cd(value);
			return;
		}
		if ($usr_dpt_nm.equalsIgnoreCase(name)) {
			usr_dpt_nm(value);
			return;
		}
		if ($usr_wg_cd.equalsIgnoreCase(name)) {
			usr_wg_cd(value);
			return;
		}
		if ($usr_wg_nm.equalsIgnoreCase(name)) {
			usr_wg_nm(value);
			return;
		}
		if ($usr_cst_cd.equalsIgnoreCase(name)) {
			usr_cst_cd(value);
			return;
		}
		if ($usr_cst_nm.equalsIgnoreCase(name)) {
			usr_cst_nm(value);
			return;
		}
		if ($usr_intr_rmrks.equalsIgnoreCase(name)) {
			usr_intr_rmrks(value);
			return;
		}
		if ($usr_sub_char1.equalsIgnoreCase(name)) {
			usr_sub_char1(value);
			return;
		}
		if ($usr_sub_char2.equalsIgnoreCase(name)) {
			usr_sub_char2(value);
			return;
		}
		if ($usr_sub_char3.equalsIgnoreCase(name)) {
			usr_sub_char3(value);
			return;
		}
		if ($sum_spln_vers.equalsIgnoreCase(name)) {
			sum_spln_vers(value);
			return;
		}
		if ($sum_dpt_cd.equalsIgnoreCase(name)) {
			sum_dpt_cd(value);
			return;
		}
		if ($sum_dpt_nm.equalsIgnoreCase(name)) {
			sum_dpt_nm(value);
			return;
		}
		if ($sum_wg_cd.equalsIgnoreCase(name)) {
			sum_wg_cd(value);
			return;
		}
		if ($sum_wg_nm.equalsIgnoreCase(name)) {
			sum_wg_nm(value);
			return;
		}
		if ($sum_cst_cd.equalsIgnoreCase(name)) {
			sum_cst_cd(value);
			return;
		}
		if ($sum_cst_nm.equalsIgnoreCase(name)) {
			sum_cst_nm(value);
			return;
		}
		if ($sum_usr_cd.equalsIgnoreCase(name)) {
			sum_usr_cd(value);
			return;
		}
		if ($sum_usr_nm.equalsIgnoreCase(name)) {
			sum_usr_nm(value);
			return;
		}
		if ($sum_intr_rmrks.equalsIgnoreCase(name)) {
			sum_intr_rmrks(value);
			return;
		}
		if ($sum_sub_char1.equalsIgnoreCase(name)) {
			sum_sub_char1(value);
			return;
		}
		if ($sum_sub_char2.equalsIgnoreCase(name)) {
			sum_sub_char2(value);
			return;
		}
		if ($sum_sub_char3.equalsIgnoreCase(name)) {
			sum_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($usr_ym_fr.equalsIgnoreCase(name)) {
			usr_ym_fr(value);
			return;
		}
		if ($usr_ym_to.equalsIgnoreCase(name)) {
			usr_ym_to(value);
			return;
		}
		if ($sum_ym_fr.equalsIgnoreCase(name)) {
			sum_ym_fr(value);
			return;
		}
		if ($sum_ym_to.equalsIgnoreCase(name)) {
			sum_ym_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($usr_dpt_flg.equalsIgnoreCase(name)) {
			usr_dpt_flg(value);
			return;
		}
		if ($usr_cst_flg.equalsIgnoreCase(name)) {
			usr_cst_flg(value);
			return;
		}
		if ($usr_wrk_flg.equalsIgnoreCase(name)) {
			usr_wrk_flg(value);
			return;
		}
		if ($usr_edited_f_flg.equalsIgnoreCase(name)) {
			usr_edited_f_flg(value);
			return;
		}
		if ($usr_edited_t_flg.equalsIgnoreCase(name)) {
			usr_edited_t_flg(value);
			return;
		}
		if ($sum_edited_f_flg.equalsIgnoreCase(name)) {
			sum_edited_f_flg(value);
			return;
		}
		if ($sum_edited_t_flg.equalsIgnoreCase(name)) {
			sum_edited_t_flg(value);
			return;
		}
		if ($sum_adopted_t_flg.equalsIgnoreCase(name)) {
			sum_adopted_t_flg(value);
			return;
		}
		if ($sum_adopted_f_flg.equalsIgnoreCase(name)) {
			sum_adopted_f_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($usr_usr_cd.equalsIgnoreCase(name)) {
			usr_usr_cd(value);
			return;
		}
		if ($usr_usr_nm.equalsIgnoreCase(name)) {
			usr_usr_nm(value);
			return;
		}
		if ($usr_dpt_cd.equalsIgnoreCase(name)) {
			usr_dpt_cd(value);
			return;
		}
		if ($usr_dpt_nm.equalsIgnoreCase(name)) {
			usr_dpt_nm(value);
			return;
		}
		if ($usr_wg_cd.equalsIgnoreCase(name)) {
			usr_wg_cd(value);
			return;
		}
		if ($usr_wg_nm.equalsIgnoreCase(name)) {
			usr_wg_nm(value);
			return;
		}
		if ($usr_cst_cd.equalsIgnoreCase(name)) {
			usr_cst_cd(value);
			return;
		}
		if ($usr_cst_nm.equalsIgnoreCase(name)) {
			usr_cst_nm(value);
			return;
		}
		if ($usr_intr_rmrks.equalsIgnoreCase(name)) {
			usr_intr_rmrks(value);
			return;
		}
		if ($usr_sub_char1.equalsIgnoreCase(name)) {
			usr_sub_char1(value);
			return;
		}
		if ($usr_sub_char2.equalsIgnoreCase(name)) {
			usr_sub_char2(value);
			return;
		}
		if ($usr_sub_char3.equalsIgnoreCase(name)) {
			usr_sub_char3(value);
			return;
		}
		if ($sum_spln_vers.equalsIgnoreCase(name)) {
			sum_spln_vers(value);
			return;
		}
		if ($sum_dpt_cd.equalsIgnoreCase(name)) {
			sum_dpt_cd(value);
			return;
		}
		if ($sum_dpt_nm.equalsIgnoreCase(name)) {
			sum_dpt_nm(value);
			return;
		}
		if ($sum_wg_cd.equalsIgnoreCase(name)) {
			sum_wg_cd(value);
			return;
		}
		if ($sum_wg_nm.equalsIgnoreCase(name)) {
			sum_wg_nm(value);
			return;
		}
		if ($sum_cst_cd.equalsIgnoreCase(name)) {
			sum_cst_cd(value);
			return;
		}
		if ($sum_cst_nm.equalsIgnoreCase(name)) {
			sum_cst_nm(value);
			return;
		}
		if ($sum_usr_cd.equalsIgnoreCase(name)) {
			sum_usr_cd(value);
			return;
		}
		if ($sum_usr_nm.equalsIgnoreCase(name)) {
			sum_usr_nm(value);
			return;
		}
		if ($sum_intr_rmrks.equalsIgnoreCase(name)) {
			sum_intr_rmrks(value);
			return;
		}
		if ($sum_sub_char1.equalsIgnoreCase(name)) {
			sum_sub_char1(value);
			return;
		}
		if ($sum_sub_char2.equalsIgnoreCase(name)) {
			sum_sub_char2(value);
			return;
		}
		if ($sum_sub_char3.equalsIgnoreCase(name)) {
			sum_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($usr_ym_fr.equalsIgnoreCase(name)) {
			usr_ym_fr(value);
			return;
		}
		if ($usr_ym_to.equalsIgnoreCase(name)) {
			usr_ym_to(value);
			return;
		}
		if ($sum_ym_fr.equalsIgnoreCase(name)) {
			sum_ym_fr(value);
			return;
		}
		if ($sum_ym_to.equalsIgnoreCase(name)) {
			sum_ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($usr_dpt_flg.equalsIgnoreCase(name)) {
			usr_dpt_flg(value);
			return;
		}
		if ($usr_cst_flg.equalsIgnoreCase(name)) {
			usr_cst_flg(value);
			return;
		}
		if ($usr_wrk_flg.equalsIgnoreCase(name)) {
			usr_wrk_flg(value);
			return;
		}
		if ($usr_edited_f_flg.equalsIgnoreCase(name)) {
			usr_edited_f_flg(value);
			return;
		}
		if ($usr_edited_t_flg.equalsIgnoreCase(name)) {
			usr_edited_t_flg(value);
			return;
		}
		if ($sum_edited_f_flg.equalsIgnoreCase(name)) {
			sum_edited_f_flg(value);
			return;
		}
		if ($sum_edited_t_flg.equalsIgnoreCase(name)) {
			sum_edited_t_flg(value);
			return;
		}
		if ($sum_adopted_t_flg.equalsIgnoreCase(name)) {
			sum_adopted_t_flg(value);
			return;
		}
		if ($sum_adopted_f_flg.equalsIgnoreCase(name)) {
			sum_adopted_f_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($usr_wrk_no_p.equalsIgnoreCase(name)) {
			return usr_wrk_no_p();
		}
		if ($sum_wrk_no_p.equalsIgnoreCase(name)) {
			return sum_wrk_no_p();
		}
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			return bp_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($usr_wrk_no_p.equalsIgnoreCase(name)) {
			usr_wrk_no_p(
				((MCContainerMeta) usr_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0010.WrkNoR.class, value)
			);
			return;
		}
		if ($sum_wrk_no_p.equalsIgnoreCase(name)) {
			sum_wrk_no_p(
				((MCContainerMeta) sum_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0010.WrkNoR.class, value)
			);
			return;
		}
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			bp_grp_p(
				((MCContainerMeta) bp_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String usr_wrk_no() {
		return usr_wrk_no_p().wrk_no();
	}

	public void usr_wrk_no(String value) {
		usr_wrk_no_p().wrk_no(value);
	}

	public String usr_wrk_nm() {
		return usr_wrk_no_p().wrk_nm();
	}

	public void usr_wrk_nm(String value) {
		usr_wrk_no_p().wrk_nm(value);
	}

	public String sum_wrk_no() {
		return sum_wrk_no_p().wrk_no();
	}

	public void sum_wrk_no(String value) {
		sum_wrk_no_p().wrk_no(value);
	}

	public String sum_wrk_nm() {
		return sum_wrk_no_p().wrk_nm();
	}

	public void sum_wrk_nm(String value) {
		sum_wrk_no_p().wrk_nm(value);
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public boolean bp_grp_flg1() {
		return bp_grp_p().bp_grp_flg1();
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public void bp_grp_flg1(boolean value) {
		bp_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return bp_grp_p().bp_grp_cd1();
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		bp_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return bp_grp_p().bp_grp_nm1();
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		bp_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public boolean bp_grp_flg2() {
		return bp_grp_p().bp_grp_flg2();
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public void bp_grp_flg2(boolean value) {
		bp_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return bp_grp_p().bp_grp_cd2();
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		bp_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return bp_grp_p().bp_grp_nm2();
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		bp_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public boolean bp_grp_flg3() {
		return bp_grp_p().bp_grp_flg3();
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public void bp_grp_flg3(boolean value) {
		bp_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return bp_grp_p().bp_grp_cd3();
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		bp_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return bp_grp_p().bp_grp_nm3();
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		bp_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public boolean bp_grp_flg4() {
		return bp_grp_p().bp_grp_flg4();
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public void bp_grp_flg4(boolean value) {
		bp_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return bp_grp_p().bp_grp_cd4();
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		bp_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return bp_grp_p().bp_grp_nm4();
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		bp_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public boolean bp_grp_flg5() {
		return bp_grp_p().bp_grp_flg5();
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public void bp_grp_flg5(boolean value) {
		bp_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return bp_grp_p().bp_grp_cd5();
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		bp_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return bp_grp_p().bp_grp_nm5();
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		bp_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public boolean bp_grp_flg6() {
		return bp_grp_p().bp_grp_flg6();
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public void bp_grp_flg6(boolean value) {
		bp_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return bp_grp_p().bp_grp_cd6();
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		bp_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return bp_grp_p().bp_grp_nm6();
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		bp_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public boolean bp_grp_flg7() {
		return bp_grp_p().bp_grp_flg7();
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public void bp_grp_flg7(boolean value) {
		bp_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return bp_grp_p().bp_grp_cd7();
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		bp_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return bp_grp_p().bp_grp_nm7();
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		bp_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public boolean bp_grp_flg8() {
		return bp_grp_p().bp_grp_flg8();
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public void bp_grp_flg8(boolean value) {
		bp_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return bp_grp_p().bp_grp_cd8();
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		bp_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return bp_grp_p().bp_grp_nm8();
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		bp_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public boolean bp_grp_flg9() {
		return bp_grp_p().bp_grp_flg9();
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public void bp_grp_flg9(boolean value) {
		bp_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return bp_grp_p().bp_grp_cd9();
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		bp_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return bp_grp_p().bp_grp_nm9();
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		bp_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public boolean bp_grp_flg10() {
		return bp_grp_p().bp_grp_flg10();
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public void bp_grp_flg10(boolean value) {
		bp_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return bp_grp_p().bp_grp_cd10();
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		bp_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return bp_grp_p().bp_grp_nm10();
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		bp_grp_p().bp_grp_nm10(value);
	}

}

