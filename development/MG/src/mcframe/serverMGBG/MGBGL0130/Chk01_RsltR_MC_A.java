package mcframe.serverMGBG.MGBGL0130;

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
 * ブロック"Chk01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_RsltR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	public static final String $dbc = "dbc";
	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public static final String $pre_alc_rate_nm = "pre_alc_rate_nm";
	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public static final String $pre_alc_ptn_cd = "pre_alc_ptn_cd";
	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public static final String $pre_alc_ptn_nm = "pre_alc_ptn_nm";
	/**
	 * Term name 期名称.<p>
	 *
	 */
	public static final String $term_nm = "term_nm";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public static final String $ctg_nm = "ctg_nm";
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
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public static final String $alc_ac_nm = "alc_ac_nm";
	/**
	 * Transfer WG name 振替ワーキンググループ名.<p>
	 *
	 */
	public static final String $trd_wg_nm = "trd_wg_nm";
	public static final String $typ = "typ";

	public static final String $pre_alc_rate_cd = $dbc + ".pre_alc_rate_cd";
	public static final String $term = $dbc + ".term";
	public static final String $calc_ctg_cd = $dbc + ".calc_ctg_cd";
	public static final String $wg_cd = $dbc + ".wg_cd";
	public static final String $dpt_cd = $dbc + ".dpt_cd";
	public static final String $loc_cd = $dbc + ".loc_cd";
	public static final String $oper_cd = $dbc + ".oper_cd";
	public static final String $bp_cd = $dbc + ".bp_cd";
	public static final String $ctg_cd = $dbc + ".ctg_cd";
	public static final String $itm_cd = $dbc + ".itm_cd";
	public static final String $itm_sub1 = $dbc + ".itm_sub1";
	public static final String $itm_sub2 = $dbc + ".itm_sub2";
	public static final String $itm_sub3 = $dbc + ".itm_sub3";
	public static final String $lot_no = $dbc + ".lot_no";
	public static final String $sublot_no = $dbc + ".sublot_no";
	public static final String $sno1 = $dbc + ".sno1";
	public static final String $sno2 = $dbc + ".sno2";
	public static final String $sno3 = $dbc + ".sno3";
	public static final String $sno4 = $dbc + ".sno4";
	public static final String $itm_mfg_inst_no = $dbc + ".itm_mfg_inst_no";
	public static final String $iv_no = $dbc + ".iv_no";
	public static final String $po_no = $dbc + ".po_no";
	public static final String $slo_no = $dbc + ".slo_no";
	public static final String $alc_ac_cd = $dbc + ".alc_ac_cd";
	public static final String $trd_wg_cd = $dbc + ".trd_wg_cd";
	public static final String $pre_alc_rate = $dbc + ".pre_alc_rate";
	public static final String $adj_flg = $dbc + ".adj_flg";
	public static final String $term_rmrks = $dbc + ".rmrks";
	public static final String $term_sub_char1 = $dbc + ".sub_char1";
	public static final String $term_sub_char2 = $dbc + ".sub_char2";
	public static final String $term_sub_char3 = $dbc + ".sub_char3";
	public static final String $upd_cntr = $dbc + ".upd_cntr";
	public static final String $dpt_alc_typ = $typ + ".dpt_alc_typ";
	public static final String $loc_alc_typ = $typ + ".loc_alc_typ";
	public static final String $oper_alc_typ = $typ + ".oper_alc_typ";
	public static final String $bp_alc_typ = $typ + ".bp_alc_typ";
	public static final String $ctg_alc_typ = $typ + ".ctg_alc_typ";
	public static final String $itm_alc_typ = $typ + ".itm_alc_typ";
	public static final String $lot_alc_typ = $typ + ".lot_alc_typ";
	public static final String $sublot_alc_typ = $typ + ".sublot_alc_typ";
	public static final String $sno1_alc_typ = $typ + ".sno1_alc_typ";
	public static final String $sno2_alc_typ = $typ + ".sno2_alc_typ";
	public static final String $sno3_alc_typ = $typ + ".sno3_alc_typ";
	public static final String $sno4_alc_typ = $typ + ".sno4_alc_typ";
	public static final String $inst_alc_typ = $typ + ".inst_alc_typ";
	public static final String $iv_alc_typ = $typ + ".iv_alc_typ";
	public static final String $po_alc_typ = $typ + ".po_alc_typ";
	public static final String $slo_alc_typ = $typ + ".slo_alc_typ";
	public static final String $alc_ac_alc_typ = $typ + ".alc_ac_alc_typ";
	public static final String $wg_alc_typ = $typ + ".wg_alc_typ";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta dbc_META = createInnerRowMeta($dbc, mcframe.serverMG.dbc.MGT_PRE_RATE_TERM_R.class);
	public static final MCMeta pre_alc_rate_nm_META = createCommonMeta($pre_alc_rate_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_RATE_NM);
	public static final MCMeta pre_alc_ptn_cd_META = createCommonMeta($pre_alc_ptn_cd, mcframe.commonMA.meta.MA_META.PRE_ALC_PTN_CD);
	public static final MCMeta pre_alc_ptn_nm_META = createCommonMeta($pre_alc_ptn_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_PTN_NM);
	public static final MCMeta term_nm_META = createCommonMeta($term_nm, mcframe.commonMA.meta.MA_META.TERM_NM);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ctg_nm_META = createCommonMeta($ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta trd_wg_nm_META = createCommonMeta($trd_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta typ_META = createInnerRowMeta($typ, mcframe.serverMA.dbc.MAM_PRE_ALC_PTN_R.class);

	protected static final ConstMetaList<Chk01_RsltR> constMetas = new ConstMetaList<Chk01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			rtn_sts_typ_META,
			dbc_META,
			pre_alc_rate_nm_META,
			pre_alc_ptn_cd_META,
			pre_alc_ptn_nm_META,
			term_nm_META,
			calc_ctg_nm_META,
			wg_nm_META,
			dpt_nm_META,
			loc_nm_META,
			oper_nm_META,
			bp_nm_META,
			ctg_nm_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			alc_ac_nm_META,
			trd_wg_nm_META,
			typ_META
		},
		new String[][]{
			{
				"pre_alc_rate_cd",
				"term",
				"calc_ctg_cd",
				"wg_cd",
				"dpt_cd",
				"loc_cd",
				"oper_cd",
				"bp_cd",
				"ctg_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"itm_mfg_inst_no",
				"iv_no",
				"po_no",
				"slo_no",
				"alc_ac_cd",
				"trd_wg_cd",
				"pre_alc_rate",
				"adj_flg",
				"term_rmrks",
				"term_sub_char1",
				"term_sub_char2",
				"term_sub_char3",
				"upd_cntr",
				"dpt_alc_typ",
				"loc_alc_typ",
				"oper_alc_typ",
				"bp_alc_typ",
				"ctg_alc_typ",
				"itm_alc_typ",
				"lot_alc_typ",
				"sublot_alc_typ",
				"sno1_alc_typ",
				"sno2_alc_typ",
				"sno3_alc_typ",
				"sno4_alc_typ",
				"inst_alc_typ",
				"iv_alc_typ",
				"po_alc_typ",
				"slo_alc_typ",
				"alc_ac_alc_typ",
				"wg_alc_typ"
			},
			{
				$pre_alc_rate_cd,
				$term,
				$calc_ctg_cd,
				$wg_cd,
				$dpt_cd,
				$loc_cd,
				$oper_cd,
				$bp_cd,
				$ctg_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$itm_mfg_inst_no,
				$iv_no,
				$po_no,
				$slo_no,
				$alc_ac_cd,
				$trd_wg_cd,
				$pre_alc_rate,
				$adj_flg,
				$term_rmrks,
				$term_sub_char1,
				$term_sub_char2,
				$term_sub_char3,
				$upd_cntr,
				$dpt_alc_typ,
				$loc_alc_typ,
				$oper_alc_typ,
				$bp_alc_typ,
				$ctg_alc_typ,
				$itm_alc_typ,
				$lot_alc_typ,
				$sublot_alc_typ,
				$sno1_alc_typ,
				$sno2_alc_typ,
				$sno3_alc_typ,
				$sno4_alc_typ,
				$inst_alc_typ,
				$iv_alc_typ,
				$po_alc_typ,
				$slo_alc_typ,
				$alc_ac_alc_typ,
				$wg_alc_typ
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
				{$dbc + ".pre_alc_rate_cd", "I,U"},	// dbc.pre_alc_rate_cd
				{$dbc + ".term", "I,U"},	// dbc.term
				{$dbc + ".calc_ctg_cd", "I,U"},	// dbc.calc_ctg_cd
				{$dbc + ".wg_cd", "I,U"}	// dbc.wg_cd
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$dbc + ".pre_alc_rate", "E"},	// dbc.pre_alc_rate
				{$dbc + ".adj_flg", "E"}	// dbc.adj_flg
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$dbc + ".pre_alc_rate", "0:"}	// dbc.pre_alc_rate
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
				{$dbc + ".pre_alc_rate_cd", "Key"},	// dbc.pre_alc_rate_cd
				{$dbc + ".term", "Key"},	// dbc.term
				{$dbc + ".calc_ctg_cd", "Key"},	// dbc.calc_ctg_cd
				{$dbc + ".wg_cd", "Key"},	// dbc.wg_cd
				{$dbc + ".dpt_cd", "Key"},	// dbc.dpt_cd
				{$dbc + ".loc_cd", "Key"},	// dbc.loc_cd
				{$dbc + ".oper_cd", "Key"},	// dbc.oper_cd
				{$dbc + ".bp_cd", "Key"},	// dbc.bp_cd
				{$dbc + ".ctg_cd", "Key"},	// dbc.ctg_cd
				{$dbc + ".itm_cd", "Key"},	// dbc.itm_cd
				{$dbc + ".itm_sub1", "Key"},	// dbc.itm_sub1
				{$dbc + ".itm_sub2", "Key"},	// dbc.itm_sub2
				{$dbc + ".itm_sub3", "Key"},	// dbc.itm_sub3
				{$dbc + ".lot_no", "Key"},	// dbc.lot_no
				{$dbc + ".sublot_no", "Key"},	// dbc.sublot_no
				{$dbc + ".sno1", "Key"},	// dbc.sno1
				{$dbc + ".sno2", "Key"},	// dbc.sno2
				{$dbc + ".sno3", "Key"},	// dbc.sno3
				{$dbc + ".sno4", "Key"},	// dbc.sno4
				{$dbc + ".itm_mfg_inst_no", "Key"},	// dbc.itm_mfg_inst_no
				{$dbc + ".iv_no", "Key"},	// dbc.iv_no
				{$dbc + ".po_no", "Key"},	// dbc.po_no
				{$dbc + ".slo_no", "Key"},	// dbc.slo_no
				{$dbc + ".alc_ac_cd", "Key"},	// dbc.alc_ac_cd
				{$dbc + ".trd_wg_cd", "Key"}	// dbc.trd_wg_cd
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$dbc + ".pre_alc_rate_cd", "MG.MGUAL0010.PreAlcRateInPreAlcCtgWithPtn"},	// dbc.pre_alc_rate_cd
				{$dbc + ".term", "MA.MAUAL0010.Term"},	// dbc.term
				{$dbc + ".calc_ctg_cd", "MA.MAUAL0010.CalcCtg"},	// dbc.calc_ctg_cd
				{$dbc + ".wg_cd", "MA.MAUAL0010.CostWg"},	// dbc.wg_cd
				{$dbc + ".dpt_cd", "MA.MAUAL0010.CostDpt"},	// dbc.dpt_cd
				{$dbc + ".loc_cd", "MA.MAUAL0010.Loc"},	// dbc.loc_cd
				{$dbc + ".oper_cd", "MA.MAUAL0010.Oper"},	// dbc.oper_cd
				{$dbc + ".bp_cd", "MA.MAUAL0010.Bp"},	// dbc.bp_cd
				{$dbc + ".ctg_cd", "MA.MAUAL0010.CostCtg"},	// dbc.ctg_cd
				{$dbc + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// dbc.itm_sub3
				{$dbc + ".alc_ac_cd", "MA.MAUAL0010.AlcAc"},	// dbc.alc_ac_cd
				{$dbc + ".trd_wg_cd", "MA.MAUAL0010.CostWg"}	// dbc.trd_wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$dbc + ".pre_alc_rate_cd", "pre_alc_rate_nm;pre_alc_ptn_cd;pre_alc_ptn_nm;dpt_alc_typ;loc_alc_typ;oper_alc_typ;bp_alc_typ;ctg_alc_typ;itm_alc_typ;lot_alc_typ;sublot_alc_typ;sno1_alc_typ;sno2_alc_typ;sno3_alc_typ;sno4_alc_typ;inst_alc_typ;iv_alc_typ;po_alc_typ;slo_alc_typ;alc_ac_alc_typ;wg_alc_typ"},	// dbc.pre_alc_rate_cd
				{$dbc + ".term", "term_nm"},	// dbc.term
				{$dbc + ".calc_ctg_cd", "calc_ctg_nm"},	// dbc.calc_ctg_cd
				{$dbc + ".wg_cd", "wg_nm"},	// dbc.wg_cd
				{$dbc + ".dpt_cd", "dpt_nm"},	// dbc.dpt_cd
				{$dbc + ".loc_cd", "loc_nm"},	// dbc.loc_cd
				{$dbc + ".oper_cd", "oper_nm"},	// dbc.oper_cd
				{$dbc + ".bp_cd", "bp_nm"},	// dbc.bp_cd
				{$dbc + ".ctg_cd", "ctg_nm"},	// dbc.ctg_cd
				{$dbc + ".itm_sub3", "itm_nm;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// dbc.itm_sub3
				{$dbc + ".alc_ac_cd", "alc_ac_nm"},	// dbc.alc_ac_cd
				{$dbc + ".trd_wg_cd", "trd_wg_nm"}	// dbc.trd_wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$dbc + ".trd_wg_cd", "wg_nm"}	// dbc.trd_wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dbc + ".pre_alc_rate_cd", "calc_ctg_cd;wg_cd;term;true"},	// dbc.pre_alc_rate_cd
				{$dbc + ".dpt_cd", "term"},	// dbc.dpt_cd
				{$dbc + ".loc_cd", "MAC_LOC_IS_SRCH_TYP.MFG_WG_ALL"},	// dbc.loc_cd
				{$dbc + ".bp_cd", "MAC_BP_IS_SRCH_TYP.COMM"},	// dbc.bp_cd
				{$dbc + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"}	// dbc.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dbc + ".pre_alc_rate_cd", "calc_ctg_cd;wg_cd;term;term_flg"},	// dbc.pre_alc_rate_cd
				{$dbc + ".dpt_cd", "ym"},	// dbc.dpt_cd
				{$dbc + ".loc_cd", "loc_is_srch_typ"},	// dbc.loc_cd
				{$dbc + ".bp_cd", "bp_is_srch_typ"},	// dbc.bp_cd
				{$dbc + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// dbc.itm_sub3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$dbc + ".itm_sub1", "E"},	// dbc.itm_sub1
				{$dbc + ".itm_sub2", "E"},	// dbc.itm_sub2
				{$dbc + ".itm_sub3", "E"}	// dbc.itm_sub3
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
	protected Chk01_RsltR_MC_A(ConstMetaList<? extends Chk01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR clone() {
		return (Chk01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR createInstance() {
		return (Chk01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR getValues(String... names) {
		return (Chk01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 2, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 2, $rtn_sts_typ, value);
	}


	public mcframe.serverMG.dbc.MGT_PRE_RATE_TERM_R dbc(){
		return (mcframe.serverMG.dbc.MGT_PRE_RATE_TERM_R) getConstInnerRow(offset + 3, $dbc);
	}
	
	public void dbc(mcframe.serverMG.dbc.MGT_PRE_RATE_TERM_R row){
		setConstInnerRow(offset + 3, $dbc, row);
	}


	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public String pre_alc_rate_nm() {
		return getConstString(offset + 4, $pre_alc_rate_nm);
	}

	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public void pre_alc_rate_nm(String value) {
		setConstString(offset + 4, $pre_alc_rate_nm, value);
	}


	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public String pre_alc_ptn_cd() {
		return getConstString(offset + 5, $pre_alc_ptn_cd);
	}

	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public void pre_alc_ptn_cd(String value) {
		setConstString(offset + 5, $pre_alc_ptn_cd, value);
	}


	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public String pre_alc_ptn_nm() {
		return getConstString(offset + 6, $pre_alc_ptn_nm);
	}

	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public void pre_alc_ptn_nm(String value) {
		setConstString(offset + 6, $pre_alc_ptn_nm, value);
	}


	/**
	 * Term name 期名称.<p>
	 *
	 */
	public String term_nm() {
		return getConstString(offset + 7, $term_nm);
	}

	/**
	 * Term name 期名称.<p>
	 *
	 */
	public void term_nm(String value) {
		setConstString(offset + 7, $term_nm, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 8, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 8, $calc_ctg_nm, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 9, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 9, $wg_nm, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 10, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 10, $dpt_nm, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 11, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 11, $loc_nm, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 12, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 12, $oper_nm, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 13, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 13, $bp_nm, value);
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
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 15, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 15, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 16, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 16, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 17, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 17, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 18, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 18, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 19, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 19, $itm_typ_d_nm, value);
	}


	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 20, $alc_ac_nm);
	}

	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 20, $alc_ac_nm, value);
	}


	/**
	 * Transfer WG name 振替ワーキンググループ名.<p>
	 *
	 */
	public String trd_wg_nm() {
		return getConstString(offset + 21, $trd_wg_nm);
	}

	/**
	 * Transfer WG name 振替ワーキンググループ名.<p>
	 *
	 */
	public void trd_wg_nm(String value) {
		setConstString(offset + 21, $trd_wg_nm, value);
	}


	public mcframe.serverMA.dbc.MAM_PRE_ALC_PTN_R typ(){
		return (mcframe.serverMA.dbc.MAM_PRE_ALC_PTN_R) getConstInnerRow(offset + 22, $typ);
	}
	
	public void typ(mcframe.serverMA.dbc.MAM_PRE_ALC_PTN_R row){
		setConstInnerRow(offset + 22, $typ, row);
	}


	public String getString(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			return pre_alc_rate_nm();
		}
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			return pre_alc_ptn_cd();
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			return pre_alc_ptn_nm();
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($trd_wg_nm.equalsIgnoreCase(name)) {
			return trd_wg_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			return pre_alc_rate_nm();
		}
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			return pre_alc_ptn_cd();
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			return pre_alc_ptn_nm();
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($trd_wg_nm.equalsIgnoreCase(name)) {
			return trd_wg_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			pre_alc_rate_nm(value);
			return;
		}
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			pre_alc_ptn_cd(value);
			return;
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			pre_alc_ptn_nm(value);
			return;
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($trd_wg_nm.equalsIgnoreCase(name)) {
			trd_wg_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			pre_alc_rate_nm(value);
			return;
		}
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			pre_alc_ptn_cd(value);
			return;
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			pre_alc_ptn_nm(value);
			return;
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($trd_wg_nm.equalsIgnoreCase(name)) {
			trd_wg_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dbc.equalsIgnoreCase(name)) {
			return dbc();
		}
		if ($typ.equalsIgnoreCase(name)) {
			return typ();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dbc.equalsIgnoreCase(name)) {
			dbc(
				((MCContainerMeta) dbc_META).castInnerRow(mcframe.serverMG.dbc.MGT_PRE_RATE_TERM_R.class, value)
			);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(
				((MCContainerMeta) typ_META).castInnerRow(mcframe.serverMA.dbc.MAM_PRE_ALC_PTN_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public String pre_alc_rate_cd() {
		return dbc().pre_alc_rate_cd();
	}

	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public void pre_alc_rate_cd(String value) {
		dbc().pre_alc_rate_cd(value);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return dbc().term();
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		dbc().term(value);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return dbc().calc_ctg_cd();
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		dbc().calc_ctg_cd(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return dbc().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		dbc().wg_cd(value);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return dbc().dpt_cd();
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		dbc().dpt_cd(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return dbc().loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		dbc().loc_cd(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return dbc().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		dbc().oper_cd(value);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return dbc().bp_cd();
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		dbc().bp_cd(value);
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return dbc().ctg_cd();
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		dbc().ctg_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return dbc().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		dbc().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return dbc().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		dbc().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return dbc().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		dbc().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return dbc().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		dbc().itm_sub3(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return dbc().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		dbc().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return dbc().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		dbc().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return dbc().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		dbc().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return dbc().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		dbc().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return dbc().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		dbc().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return dbc().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		dbc().sno4(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return dbc().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		dbc().itm_mfg_inst_no(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return dbc().iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		dbc().iv_no(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return dbc().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		dbc().po_no(value);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return dbc().slo_no();
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		dbc().slo_no(value);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return dbc().alc_ac_cd();
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		dbc().alc_ac_cd(value);
	}

	/**
	 * Transfer WG cd. 振替ワーキンググループＣＤ.<p>
	 *
	 */
	public String trd_wg_cd() {
		return dbc().trd_wg_cd();
	}

	/**
	 * Transfer WG cd. 振替ワーキンググループＣＤ.<p>
	 *
	 */
	public void trd_wg_cd(String value) {
		dbc().trd_wg_cd(value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public MCNumber pre_alc_rate() {
		return dbc().pre_alc_rate();
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(MCNumber value) {
		dbc().pre_alc_rate(value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(int value) {
		dbc().pre_alc_rate(value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(long value) {
		dbc().pre_alc_rate(value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(float value) {
		dbc().pre_alc_rate(value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(double value) {
		dbc().pre_alc_rate(value);
	}

	/**
	 * Difference adjustment 差額調整.<p>
	 *
	 */
	public boolean adj_flg() {
		return dbc().adj_flg();
	}

	/**
	 * Difference adjustment 差額調整.<p>
	 *
	 */
	public void adj_flg(boolean value) {
		dbc().adj_flg(value);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String term_rmrks() {
		return dbc().rmrks();
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void term_rmrks(String value) {
		dbc().rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String term_sub_char1() {
		return dbc().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void term_sub_char1(String value) {
		dbc().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String term_sub_char2() {
		return dbc().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void term_sub_char2(String value) {
		dbc().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String term_sub_char3() {
		return dbc().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void term_sub_char3(String value) {
		dbc().sub_char3(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return dbc().upd_cntr();
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public String dpt_alc_typ() {
		return typ().dpt_alc_typ();
	}

	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public void dpt_alc_typ(String value) {
		typ().dpt_alc_typ(value);
	}

	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public String loc_alc_typ() {
		return typ().loc_alc_typ();
	}

	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public void loc_alc_typ(String value) {
		typ().loc_alc_typ(value);
	}

	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public String oper_alc_typ() {
		return typ().oper_alc_typ();
	}

	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public void oper_alc_typ(String value) {
		typ().oper_alc_typ(value);
	}

	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public String bp_alc_typ() {
		return typ().bp_alc_typ();
	}

	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public void bp_alc_typ(String value) {
		typ().bp_alc_typ(value);
	}

	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public String ctg_alc_typ() {
		return typ().ctg_alc_typ();
	}

	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public void ctg_alc_typ(String value) {
		typ().ctg_alc_typ(value);
	}

	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public String itm_alc_typ() {
		return typ().itm_alc_typ();
	}

	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public void itm_alc_typ(String value) {
		typ().itm_alc_typ(value);
	}

	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public String lot_alc_typ() {
		return typ().lot_alc_typ();
	}

	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public void lot_alc_typ(String value) {
		typ().lot_alc_typ(value);
	}

	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public String sublot_alc_typ() {
		return typ().sublot_alc_typ();
	}

	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public void sublot_alc_typ(String value) {
		typ().sublot_alc_typ(value);
	}

	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public String sno1_alc_typ() {
		return typ().sno1_alc_typ();
	}

	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public void sno1_alc_typ(String value) {
		typ().sno1_alc_typ(value);
	}

	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public String sno2_alc_typ() {
		return typ().sno2_alc_typ();
	}

	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public void sno2_alc_typ(String value) {
		typ().sno2_alc_typ(value);
	}

	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public String sno3_alc_typ() {
		return typ().sno3_alc_typ();
	}

	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public void sno3_alc_typ(String value) {
		typ().sno3_alc_typ(value);
	}

	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public String sno4_alc_typ() {
		return typ().sno4_alc_typ();
	}

	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public void sno4_alc_typ(String value) {
		typ().sno4_alc_typ(value);
	}

	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public String inst_alc_typ() {
		return typ().inst_alc_typ();
	}

	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public void inst_alc_typ(String value) {
		typ().inst_alc_typ(value);
	}

	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public String iv_alc_typ() {
		return typ().iv_alc_typ();
	}

	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public void iv_alc_typ(String value) {
		typ().iv_alc_typ(value);
	}

	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public String po_alc_typ() {
		return typ().po_alc_typ();
	}

	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public void po_alc_typ(String value) {
		typ().po_alc_typ(value);
	}

	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public String slo_alc_typ() {
		return typ().slo_alc_typ();
	}

	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public void slo_alc_typ(String value) {
		typ().slo_alc_typ(value);
	}

	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public String alc_ac_alc_typ() {
		return typ().alc_ac_alc_typ();
	}

	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public void alc_ac_alc_typ(String value) {
		typ().alc_ac_alc_typ(value);
	}

	/**
	 * WG allocation type ワーキンググループ配賦区分.<p>
	 *
	 */
	public String wg_alc_typ() {
		return typ().wg_alc_typ();
	}

	/**
	 * WG allocation type ワーキンググループ配賦区分.<p>
	 *
	 */
	public void wg_alc_typ(String value) {
		typ().wg_alc_typ(value);
	}

}

