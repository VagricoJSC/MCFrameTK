package mcframe.clientMSBD.MSBDP0020;

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
	 * UPD,Create/Modify;DEL,Cancel;REF,View UPD,登録・訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public static final String $ope = "ope";
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
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
	/**
	 * Pickup rate FROM 引取率ＦＲＯＭ.<p>
	 *
	 */
	public static final String $trd_rate_fr = "trd_rate_fr";
	/**
	 * Pickup rate TO 引取率ＴＯ.<p>
	 *
	 */
	public static final String $trd_rate_to = "trd_rate_to";
	/**
	 * Remaining process month 残未処理年月.<p>
	 *
	 */
	public static final String $bal_ym = "bal_ym";
	/**
	 * Firm period only 確定期間のみ.<p>
	 *
	 */
	public static final String $fix_period_flg = "fix_period_flg";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	public static final String $sppl_grp_p = "sppl_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";
	/**
	 * Month 月.<p>
	 *
	 */
	public static final String $show_monthly_flg = "show_monthly_flg";
	/**
	 * 10 days 旬.<p>
	 *
	 */
	public static final String $show_tendays_flg = "show_tendays_flg";
	/**
	 * Week 週.<p>
	 *
	 */
	public static final String $show_weekly_flg = "show_weekly_flg";
	/**
	 * Display period 期間表示.<p>
	 *
	 */
	public static final String $show_term_flg = "show_term_flg";
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
	public static final MCMeta subcon_t_flg_META = createCommonMeta($subcon_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta subcon_f_flg_META = createCommonMeta($subcon_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_commit_t_flg_META = createCommonMeta($purc_commit_t_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_commit_f_flg_META = createCommonMeta($purc_commit_f_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ym_fr_META = createCommonMeta($ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_to_META = createCommonMeta($ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta trd_rate_fr_META = createCommonMeta($trd_rate_fr, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta trd_rate_to_META = createCommonMeta($trd_rate_to, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta bal_ym_META = createCommonMeta($bal_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta fix_period_flg_META = createCommonMeta($fix_period_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PF_BAL_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PF_BAL_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PF_BAL_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PF_BAL_SUB_CHAR3);
	public static final MCMeta sppl_grp_p_META = createInnerRowMeta($sppl_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);
	public static final MCMeta show_monthly_flg_META = createCommonMeta($show_monthly_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta show_tendays_flg_META = createCommonMeta($show_tendays_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta show_weekly_flg_META = createCommonMeta($show_weekly_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta show_term_flg_META = createCommonMeta($show_term_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta show_base_unit_flg_META = createCommonMeta($show_base_unit_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			subcon_t_flg_META,
			subcon_f_flg_META,
			purc_commit_t_flg_META,
			purc_commit_f_flg_META,
			ym_fr_META,
			ym_to_META,
			wg_cd_META,
			wg_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			itm_typ_p_META,
			itm_p_META,
			trd_rate_fr_META,
			trd_rate_to_META,
			bal_ym_META,
			fix_period_flg_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sppl_grp_p_META,
			itm_grp_p_META,
			show_monthly_flg_META,
			show_tendays_flg_META,
			show_weekly_flg_META,
			show_term_flg_META,
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
				{$sppl_cd, "bp_nm"}	// sppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.PURC_FRCST"},	// sppl_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.PURC_FRCST"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_cd;MAC_ITM_IS_SRCH_TYP.PURC_FRCST"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_cd;itm_sub1;MAC_ITM_IS_SRCH_TYP.PURC_FRCST"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2;MAC_ITM_IS_SRCH_TYP.PURC_FRCST"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
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
	 * UPD,Create/Modify;DEL,Cancel;REF,View UPD,登録・訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify;DEL,Cancel;REF,View UPD,登録・訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_t_flg() {
		return getConstBoolean(offset + 1, $subcon_t_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_t_flg(boolean value) {
		setConstBoolean(offset + 1, $subcon_t_flg, value);
	}


	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public boolean subcon_f_flg() {
		return getConstBoolean(offset + 2, $subcon_f_flg);
	}

	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public void subcon_f_flg(boolean value) {
		setConstBoolean(offset + 2, $subcon_f_flg, value);
	}


	/**
	 * For pickup responsibility 引取責任対象.<p>
	 *
	 */
	public boolean purc_commit_t_flg() {
		return getConstBoolean(offset + 3, $purc_commit_t_flg);
	}

	/**
	 * For pickup responsibility 引取責任対象.<p>
	 *
	 */
	public void purc_commit_t_flg(boolean value) {
		setConstBoolean(offset + 3, $purc_commit_t_flg, value);
	}


	/**
	 * Not for pickup responsibility 引取責任対象外.<p>
	 *
	 */
	public boolean purc_commit_f_flg() {
		return getConstBoolean(offset + 4, $purc_commit_f_flg);
	}

	/**
	 * Not for pickup responsibility 引取責任対象外.<p>
	 *
	 */
	public void purc_commit_f_flg(boolean value) {
		setConstBoolean(offset + 4, $purc_commit_f_flg, value);
	}


	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ym_fr() {
		return getConstDate(offset + 5, $ym_fr);
	}

	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public void ym_fr(MCDate value) {
		setConstDate(offset + 5, $ym_fr, value);
	}


	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDate ym_to() {
		return getConstDate(offset + 6, $ym_to);
	}

	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public void ym_to(MCDate value) {
		setConstDate(offset + 6, $ym_to, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 7, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 7, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 8, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 8, $wg_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 9, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 9, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 10, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 10, $sppl_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 11, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 11, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 12, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 12, $itm_p, row);
	}


	/**
	 * Pickup rate FROM 引取率ＦＲＯＭ.<p>
	 *
	 */
	public MCNumber trd_rate_fr() {
		return getConstNumber(offset + 13, $trd_rate_fr);
	}

	/**
	 * Pickup rate FROM 引取率ＦＲＯＭ.<p>
	 *
	 */
	public void trd_rate_fr(MCNumber value) {
		setConstNumber(offset + 13, $trd_rate_fr, value);
	}

	/**
	 * Pickup rate FROM 引取率ＦＲＯＭ.<p>
	 *
	 */
	public void trd_rate_fr(int value) {
		setConstNumber(offset + 13, $trd_rate_fr, value);
	}

	/**
	 * Pickup rate FROM 引取率ＦＲＯＭ.<p>
	 *
	 */
	public void trd_rate_fr(long value) {
		setConstNumber(offset + 13, $trd_rate_fr, value);
	}

	/**
	 * Pickup rate FROM 引取率ＦＲＯＭ.<p>
	 *
	 */
	public void trd_rate_fr(float value) {
		setConstNumber(offset + 13, $trd_rate_fr, value);
	}

	/**
	 * Pickup rate FROM 引取率ＦＲＯＭ.<p>
	 *
	 */
	public void trd_rate_fr(double value) {
		setConstNumber(offset + 13, $trd_rate_fr, value);
	}


	/**
	 * Pickup rate TO 引取率ＴＯ.<p>
	 *
	 */
	public MCNumber trd_rate_to() {
		return getConstNumber(offset + 14, $trd_rate_to);
	}

	/**
	 * Pickup rate TO 引取率ＴＯ.<p>
	 *
	 */
	public void trd_rate_to(MCNumber value) {
		setConstNumber(offset + 14, $trd_rate_to, value);
	}

	/**
	 * Pickup rate TO 引取率ＴＯ.<p>
	 *
	 */
	public void trd_rate_to(int value) {
		setConstNumber(offset + 14, $trd_rate_to, value);
	}

	/**
	 * Pickup rate TO 引取率ＴＯ.<p>
	 *
	 */
	public void trd_rate_to(long value) {
		setConstNumber(offset + 14, $trd_rate_to, value);
	}

	/**
	 * Pickup rate TO 引取率ＴＯ.<p>
	 *
	 */
	public void trd_rate_to(float value) {
		setConstNumber(offset + 14, $trd_rate_to, value);
	}

	/**
	 * Pickup rate TO 引取率ＴＯ.<p>
	 *
	 */
	public void trd_rate_to(double value) {
		setConstNumber(offset + 14, $trd_rate_to, value);
	}


	/**
	 * Remaining process month 残未処理年月.<p>
	 *
	 */
	public MCDate bal_ym() {
		return getConstDate(offset + 15, $bal_ym);
	}

	/**
	 * Remaining process month 残未処理年月.<p>
	 *
	 */
	public void bal_ym(MCDate value) {
		setConstDate(offset + 15, $bal_ym, value);
	}


	/**
	 * Firm period only 確定期間のみ.<p>
	 *
	 */
	public boolean fix_period_flg() {
		return getConstBoolean(offset + 16, $fix_period_flg);
	}

	/**
	 * Firm period only 確定期間のみ.<p>
	 *
	 */
	public void fix_period_flg(boolean value) {
		setConstBoolean(offset + 16, $fix_period_flg, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 17, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 17, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 18, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 18, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 19, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 19, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 20, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 20, $sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 21, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 21, $sppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 22, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 22, $itm_grp_p, row);
	}


	/**
	 * Month 月.<p>
	 *
	 */
	public boolean show_monthly_flg() {
		return getConstBoolean(offset + 23, $show_monthly_flg);
	}

	/**
	 * Month 月.<p>
	 *
	 */
	public void show_monthly_flg(boolean value) {
		setConstBoolean(offset + 23, $show_monthly_flg, value);
	}


	/**
	 * 10 days 旬.<p>
	 *
	 */
	public boolean show_tendays_flg() {
		return getConstBoolean(offset + 24, $show_tendays_flg);
	}

	/**
	 * 10 days 旬.<p>
	 *
	 */
	public void show_tendays_flg(boolean value) {
		setConstBoolean(offset + 24, $show_tendays_flg, value);
	}


	/**
	 * Week 週.<p>
	 *
	 */
	public boolean show_weekly_flg() {
		return getConstBoolean(offset + 25, $show_weekly_flg);
	}

	/**
	 * Week 週.<p>
	 *
	 */
	public void show_weekly_flg(boolean value) {
		setConstBoolean(offset + 25, $show_weekly_flg, value);
	}


	/**
	 * Display period 期間表示.<p>
	 *
	 */
	public boolean show_term_flg() {
		return getConstBoolean(offset + 26, $show_term_flg);
	}

	/**
	 * Display period 期間表示.<p>
	 *
	 */
	public void show_term_flg(boolean value) {
		setConstBoolean(offset + 26, $show_term_flg, value);
	}


	/**
	 * Display base unit 基準単位表示.<p>
	 *
	 */
	public boolean show_base_unit_flg() {
		return getConstBoolean(offset + 27, $show_base_unit_flg);
	}

	/**
	 * Display base unit 基準単位表示.<p>
	 *
	 */
	public void show_base_unit_flg(boolean value) {
		setConstBoolean(offset + 27, $show_base_unit_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_rate_fr.equalsIgnoreCase(name)) {
			return trd_rate_fr();
		}
		if ($trd_rate_to.equalsIgnoreCase(name)) {
			return trd_rate_to();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		if ($bal_ym.equalsIgnoreCase(name)) {
			return bal_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
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
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			return fix_period_flg();
		}
		if ($show_monthly_flg.equalsIgnoreCase(name)) {
			return show_monthly_flg();
		}
		if ($show_tendays_flg.equalsIgnoreCase(name)) {
			return show_tendays_flg();
		}
		if ($show_weekly_flg.equalsIgnoreCase(name)) {
			return show_weekly_flg();
		}
		if ($show_term_flg.equalsIgnoreCase(name)) {
			return show_term_flg();
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_rate_fr.equalsIgnoreCase(name)) {
			return trd_rate_fr();
		}
		if ($trd_rate_to.equalsIgnoreCase(name)) {
			return trd_rate_to();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		if ($bal_ym.equalsIgnoreCase(name)) {
			return bal_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
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
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			return fix_period_flg();
		}
		if ($show_monthly_flg.equalsIgnoreCase(name)) {
			return show_monthly_flg();
		}
		if ($show_tendays_flg.equalsIgnoreCase(name)) {
			return show_tendays_flg();
		}
		if ($show_weekly_flg.equalsIgnoreCase(name)) {
			return show_weekly_flg();
		}
		if ($show_term_flg.equalsIgnoreCase(name)) {
			return show_term_flg();
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_rate_fr.equalsIgnoreCase(name)) {
			trd_rate_fr(value);
			return;
		}
		if ($trd_rate_to.equalsIgnoreCase(name)) {
			trd_rate_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_rate_fr.equalsIgnoreCase(name)) {
			trd_rate_fr(value);
			return;
		}
		if ($trd_rate_to.equalsIgnoreCase(name)) {
			trd_rate_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_rate_fr.equalsIgnoreCase(name)) {
			trd_rate_fr(value);
			return;
		}
		if ($trd_rate_to.equalsIgnoreCase(name)) {
			trd_rate_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_rate_fr.equalsIgnoreCase(name)) {
			trd_rate_fr(value);
			return;
		}
		if ($trd_rate_to.equalsIgnoreCase(name)) {
			trd_rate_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_rate_fr.equalsIgnoreCase(name)) {
			trd_rate_fr(value);
			return;
		}
		if ($trd_rate_to.equalsIgnoreCase(name)) {
			trd_rate_to(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($bal_ym.equalsIgnoreCase(name)) {
			bal_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
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
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			fix_period_flg(value);
			return;
		}
		if ($show_monthly_flg.equalsIgnoreCase(name)) {
			show_monthly_flg(value);
			return;
		}
		if ($show_tendays_flg.equalsIgnoreCase(name)) {
			show_tendays_flg(value);
			return;
		}
		if ($show_weekly_flg.equalsIgnoreCase(name)) {
			show_weekly_flg(value);
			return;
		}
		if ($show_term_flg.equalsIgnoreCase(name)) {
			show_term_flg(value);
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_rate_fr.equalsIgnoreCase(name)) {
			trd_rate_fr(value);
			return;
		}
		if ($trd_rate_to.equalsIgnoreCase(name)) {
			trd_rate_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_rate_fr.equalsIgnoreCase(name)) {
			trd_rate_fr(value);
			return;
		}
		if ($trd_rate_to.equalsIgnoreCase(name)) {
			trd_rate_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_rate_fr.equalsIgnoreCase(name)) {
			trd_rate_fr(value);
			return;
		}
		if ($trd_rate_to.equalsIgnoreCase(name)) {
			trd_rate_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_rate_fr.equalsIgnoreCase(name)) {
			trd_rate_fr(value);
			return;
		}
		if ($trd_rate_to.equalsIgnoreCase(name)) {
			trd_rate_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_rate_fr.equalsIgnoreCase(name)) {
			trd_rate_fr(value);
			return;
		}
		if ($trd_rate_to.equalsIgnoreCase(name)) {
			trd_rate_to(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($bal_ym.equalsIgnoreCase(name)) {
			bal_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
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
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			fix_period_flg(value);
			return;
		}
		if ($show_monthly_flg.equalsIgnoreCase(name)) {
			show_monthly_flg(value);
			return;
		}
		if ($show_tendays_flg.equalsIgnoreCase(name)) {
			show_tendays_flg(value);
			return;
		}
		if ($show_weekly_flg.equalsIgnoreCase(name)) {
			show_weekly_flg(value);
			return;
		}
		if ($show_term_flg.equalsIgnoreCase(name)) {
			show_term_flg(value);
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

