package mcframe.clientMSUA.MSUAP1020;

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
	 * Save order 指図保存.<p>
	 *
	 */
	public static final String $sav_flg = "sav_flg";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $ord_flg = "ord_flg";
	/**
	 * In process 着手中.<p>
	 *
	 */
	public static final String $stt_flg = "stt_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
	/**
	 * Mfg. order No. (Input value) 製造指図ＮＯ（入力値）.<p>
	 *
	 */
	public static final String $mfg_inst_no_input = "mfg_inst_no_input";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	public static final String $mi_st_schd_dt_p = "mi_st_schd_dt_p";
	public static final String $mi_end_schd_dt_p = "mi_end_schd_dt_p";
	public static final String $ma_st_act_dt_p = "ma_st_act_dt_p";
	public static final String $ma_end_act_dt_p = "ma_end_act_dt_p";
	public static final String $mi_rqst_dlv_rqst_dt_p = "mi_rqst_dlv_rqst_dt_p";
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $imi_mfg_mtd_typ = "imi_mfg_mtd_typ";
	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public static final String $imi_mfg_mtd_typ_nm = "imi_mfg_mtd_typ_nm";
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $imi_lot_no = "imi_lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $imi_sublot_no = "imi_sublot_no";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $imi_mfg_loc_cd = "imi_mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $imi_mfg_loc_nm = "imi_mfg_loc_nm";
	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $imi_mfg_str_ln_cd = "imi_mfg_str_ln_cd";
	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public static final String $imi_mfg_str_ln_nm = "imi_mfg_str_ln_nm";
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public static final String $imi_sppl_cd = "imi_sppl_cd";
	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public static final String $imi_sppl_nm = "imi_sppl_nm";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $mi_po_d_no = "mi_po_d_no";
	/**
	 * PO details No. required flg. 発注明細ＮＯ必須ＦＬＧ.<p>
	 *
	 */
	public static final String $mi_po_d_no_req_flg = "mi_po_d_no_req_flg";
	public static final String $itm_grp_p = "itm_grp_p";
	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public static final String $match_typ = "match_typ";

	public static final String $mi_st_schd_dt_fr = $mi_st_schd_dt_p + ".ymd_fr";
	public static final String $mi_st_schd_tm_fr = $mi_st_schd_dt_p + ".hm_fr";
	public static final String $mi_st_schd_dt_to = $mi_st_schd_dt_p + ".ymd_to";
	public static final String $mi_st_schd_tm_to = $mi_st_schd_dt_p + ".hm_to";
	public static final String $mi_end_schd_dt_fr = $mi_end_schd_dt_p + ".ymd_fr";
	public static final String $mi_end_schd_tm_fr = $mi_end_schd_dt_p + ".hm_fr";
	public static final String $mi_end_schd_dt_to = $mi_end_schd_dt_p + ".ymd_to";
	public static final String $mi_end_schd_tm_to = $mi_end_schd_dt_p + ".hm_to";
	public static final String $ma_st_act_dt_fr = $ma_st_act_dt_p + ".ymd_fr";
	public static final String $ma_st_act_tm_fr = $ma_st_act_dt_p + ".hm_fr";
	public static final String $ma_st_act_dt_to = $ma_st_act_dt_p + ".ymd_to";
	public static final String $ma_st_act_tm_to = $ma_st_act_dt_p + ".hm_to";
	public static final String $ma_end_act_dt_fr = $ma_end_act_dt_p + ".ymd_fr";
	public static final String $ma_end_act_tm_fr = $ma_end_act_dt_p + ".hm_fr";
	public static final String $ma_end_act_dt_to = $ma_end_act_dt_p + ".ymd_to";
	public static final String $ma_end_act_tm_to = $ma_end_act_dt_p + ".hm_to";
	public static final String $mi_rqst_dlv_rqst_dt_fr = $mi_rqst_dlv_rqst_dt_p + ".ymd_fr";
	public static final String $mi_rqst_dlv_rqst_tm_fr = $mi_rqst_dlv_rqst_dt_p + ".hm_fr";
	public static final String $mi_rqst_dlv_rqst_dt_to = $mi_rqst_dlv_rqst_dt_p + ".ymd_to";
	public static final String $mi_rqst_dlv_rqst_tm_to = $mi_rqst_dlv_rqst_dt_p + ".hm_to";
	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_nm = $itm_typ_p + ".itm_typ_nm";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $imi_itm_cd = $itm_p + ".itm_cd";
	public static final String $imi_itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $imi_itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $imi_itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $imi_itm_nm = $itm_p + ".itm_nm";
	public static final String $imi_sno1 = $sno_wrk_no_p + ".sno1";
	public static final String $imi_sno2 = $sno_wrk_no_p + ".sno2";
	public static final String $imi_sno3 = $sno_wrk_no_p + ".sno3";
	public static final String $imi_sno4 = $sno_wrk_no_p + ".sno4";
	public static final String $imi_wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $imi_wrk_nm = $sno_wrk_no_p + ".wrk_nm";
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

	public static final MCMeta sav_flg_META = createCommonMeta($sav_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ord_flg_META = createCommonMeta($ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stt_flg_META = createCommonMeta($stt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_no_input_META = createCommonMeta($mfg_inst_no_input, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta mi_st_schd_dt_p_META = createInnerRowMeta($mi_st_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta mi_end_schd_dt_p_META = createInnerRowMeta($mi_end_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta ma_st_act_dt_p_META = createInnerRowMeta($ma_st_act_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta ma_end_act_dt_p_META = createInnerRowMeta($ma_end_act_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta mi_rqst_dlv_rqst_dt_p_META = createInnerRowMeta($mi_rqst_dlv_rqst_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta imi_mfg_mtd_typ_META = createCommonMeta($imi_mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta imi_mfg_mtd_typ_nm_META = createCommonMeta($imi_mfg_mtd_typ_nm, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta imi_lot_no_META = createCommonMeta($imi_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta imi_sublot_no_META = createCommonMeta($imi_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta imi_mfg_loc_cd_META = createCommonMeta($imi_mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta imi_mfg_loc_nm_META = createCommonMeta($imi_mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta imi_mfg_str_ln_cd_META = createCommonMeta($imi_mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta imi_mfg_str_ln_nm_META = createCommonMeta($imi_mfg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta imi_sppl_cd_META = createCommonMeta($imi_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta imi_sppl_nm_META = createCommonMeta($imi_sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mi_po_d_no_META = createCommonMeta($mi_po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta mi_po_d_no_req_flg_META = createCommonMeta($mi_po_d_no_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);
	public static final MCMeta match_typ_META = createStringMeta($match_typ);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sav_flg_META,
			ord_flg_META,
			stt_flg_META,
			cmpl_flg_META,
			mfg_inst_no_input_META,
			mfg_inst_no_META,
			div_seq_META,
			mi_st_schd_dt_p_META,
			mi_end_schd_dt_p_META,
			ma_st_act_dt_p_META,
			ma_end_act_dt_p_META,
			mi_rqst_dlv_rqst_dt_p_META,
			imi_mfg_mtd_typ_META,
			imi_mfg_mtd_typ_nm_META,
			itm_typ_p_META,
			itm_p_META,
			imi_lot_no_META,
			imi_sublot_no_META,
			sno_wrk_no_p_META,
			imi_mfg_loc_cd_META,
			imi_mfg_loc_nm_META,
			imi_mfg_str_ln_cd_META,
			imi_mfg_str_ln_nm_META,
			imi_sppl_cd_META,
			imi_sppl_nm_META,
			mi_po_d_no_META,
			mi_po_d_no_req_flg_META,
			itm_grp_p_META,
			match_typ_META
		},
		new String[][]{
			{
				"mi_st_schd_dt_fr",
				"mi_st_schd_tm_fr",
				"mi_st_schd_dt_to",
				"mi_st_schd_tm_to",
				"mi_end_schd_dt_fr",
				"mi_end_schd_tm_fr",
				"mi_end_schd_dt_to",
				"mi_end_schd_tm_to",
				"ma_st_act_dt_fr",
				"ma_st_act_tm_fr",
				"ma_st_act_dt_to",
				"ma_st_act_tm_to",
				"ma_end_act_dt_fr",
				"ma_end_act_tm_fr",
				"ma_end_act_dt_to",
				"ma_end_act_tm_to",
				"mi_rqst_dlv_rqst_dt_fr",
				"mi_rqst_dlv_rqst_tm_fr",
				"mi_rqst_dlv_rqst_dt_to",
				"mi_rqst_dlv_rqst_tm_to",
				"itm_typ",
				"itm_typ_nm",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"imi_itm_cd",
				"imi_itm_sub1",
				"imi_itm_sub2",
				"imi_itm_sub3",
				"imi_itm_nm",
				"imi_sno1",
				"imi_sno2",
				"imi_sno3",
				"imi_sno4",
				"imi_wrk_no",
				"imi_wrk_nm",
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
				$mi_st_schd_dt_fr,
				$mi_st_schd_tm_fr,
				$mi_st_schd_dt_to,
				$mi_st_schd_tm_to,
				$mi_end_schd_dt_fr,
				$mi_end_schd_tm_fr,
				$mi_end_schd_dt_to,
				$mi_end_schd_tm_to,
				$ma_st_act_dt_fr,
				$ma_st_act_tm_fr,
				$ma_st_act_dt_to,
				$ma_st_act_tm_to,
				$ma_end_act_dt_fr,
				$ma_end_act_tm_fr,
				$ma_end_act_dt_to,
				$ma_end_act_tm_to,
				$mi_rqst_dlv_rqst_dt_fr,
				$mi_rqst_dlv_rqst_tm_fr,
				$mi_rqst_dlv_rqst_dt_to,
				$mi_rqst_dlv_rqst_tm_to,
				$itm_typ,
				$itm_typ_nm,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$imi_itm_cd,
				$imi_itm_sub1,
				$imi_itm_sub2,
				$imi_itm_sub3,
				$imi_itm_nm,
				$imi_sno1,
				$imi_sno2,
				$imi_sno3,
				$imi_sno4,
				$imi_wrk_no,
				$imi_wrk_nm,
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
				{$imi_mfg_mtd_typ, "mfg_mtd_typ_nm"},	// imi_mfg_mtd_typ
				{$imi_mfg_loc_cd, "loc_nm"},	// imi_mfg_loc_cd
				{$imi_mfg_str_ln_cd, "str_ln_nm"},	// imi_mfg_str_ln_cd
				{$imi_sppl_cd, "bp_nm"}	// imi_sppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$div_seq, "mfg_inst_no"},	// div_seq
				{$imi_mfg_loc_cd, "MAC_LOC_IS_SRCH_TYP.PRD_HOUSE"},	// imi_mfg_loc_cd
				{$imi_mfg_str_ln_cd, "imi_mfg_loc_cd;true"},	// imi_mfg_str_ln_cd
				{$imi_sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"}	// imi_sppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$div_seq, "mfg_inst_no"},	// div_seq
				{$imi_mfg_loc_cd, "loc_is_srch_typ"},	// imi_mfg_loc_cd
				{$imi_mfg_str_ln_cd, "loc_cd;mode_nullval_flg"},	// imi_mfg_str_ln_cd
				{$imi_sppl_cd, "bp_is_srch_typ"}	// imi_sppl_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$imi_mfg_str_ln_cd, "STR_LN"},	// imi_mfg_str_ln_cd
				{$imi_mfg_str_ln_nm, "STR_LN"}	// imi_mfg_str_ln_nm
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
	 * Save order 指図保存.<p>
	 *
	 */
	public boolean sav_flg() {
		return getConstBoolean(offset + 0, $sav_flg);
	}

	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public void sav_flg(boolean value) {
		setConstBoolean(offset + 0, $sav_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean ord_flg() {
		return getConstBoolean(offset + 1, $ord_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void ord_flg(boolean value) {
		setConstBoolean(offset + 1, $ord_flg, value);
	}


	/**
	 * In process 着手中.<p>
	 *
	 */
	public boolean stt_flg() {
		return getConstBoolean(offset + 2, $stt_flg);
	}

	/**
	 * In process 着手中.<p>
	 *
	 */
	public void stt_flg(boolean value) {
		setConstBoolean(offset + 2, $stt_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 3, $cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 3, $cmpl_flg, value);
	}


	/**
	 * Mfg. order No. (Input value) 製造指図ＮＯ（入力値）.<p>
	 *
	 */
	public String mfg_inst_no_input() {
		return getConstString(offset + 4, $mfg_inst_no_input);
	}

	/**
	 * Mfg. order No. (Input value) 製造指図ＮＯ（入力値）.<p>
	 *
	 */
	public void mfg_inst_no_input(String value) {
		setConstString(offset + 4, $mfg_inst_no_input, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 5, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 5, $mfg_inst_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 6, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 6, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 6, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 6, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 6, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 6, $div_seq, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR mi_st_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 7, $mi_st_schd_dt_p);
	}
	
	public void mi_st_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 7, $mi_st_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR mi_end_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 8, $mi_end_schd_dt_p);
	}
	
	public void mi_end_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 8, $mi_end_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR ma_st_act_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 9, $ma_st_act_dt_p);
	}
	
	public void ma_st_act_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 9, $ma_st_act_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR ma_end_act_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 10, $ma_end_act_dt_p);
	}
	
	public void ma_end_act_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 10, $ma_end_act_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR mi_rqst_dlv_rqst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 11, $mi_rqst_dlv_rqst_dt_p);
	}
	
	public void mi_rqst_dlv_rqst_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 11, $mi_rqst_dlv_rqst_dt_p, row);
	}


	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String imi_mfg_mtd_typ() {
		return getConstString(offset + 12, $imi_mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void imi_mfg_mtd_typ(String value) {
		setConstString(offset + 12, $imi_mfg_mtd_typ, value);
	}


	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public String imi_mfg_mtd_typ_nm() {
		return getConstString(offset + 13, $imi_mfg_mtd_typ_nm);
	}

	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public void imi_mfg_mtd_typ_nm(String value) {
		setConstString(offset + 13, $imi_mfg_mtd_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 14, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 14, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 15, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 15, $itm_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String imi_lot_no() {
		return getConstString(offset + 16, $imi_lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void imi_lot_no(String value) {
		setConstString(offset + 16, $imi_lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String imi_sublot_no() {
		return getConstString(offset + 17, $imi_sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void imi_sublot_no(String value) {
		setConstString(offset + 17, $imi_sublot_no, value);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 18, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 18, $sno_wrk_no_p, row);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String imi_mfg_loc_cd() {
		return getConstString(offset + 19, $imi_mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void imi_mfg_loc_cd(String value) {
		setConstString(offset + 19, $imi_mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String imi_mfg_loc_nm() {
		return getConstString(offset + 20, $imi_mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void imi_mfg_loc_nm(String value) {
		setConstString(offset + 20, $imi_mfg_loc_nm, value);
	}


	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String imi_mfg_str_ln_cd() {
		return getConstString(offset + 21, $imi_mfg_str_ln_cd);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void imi_mfg_str_ln_cd(String value) {
		setConstString(offset + 21, $imi_mfg_str_ln_cd, value);
	}


	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public String imi_mfg_str_ln_nm() {
		return getConstString(offset + 22, $imi_mfg_str_ln_nm);
	}

	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public void imi_mfg_str_ln_nm(String value) {
		setConstString(offset + 22, $imi_mfg_str_ln_nm, value);
	}


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String imi_sppl_cd() {
		return getConstString(offset + 23, $imi_sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void imi_sppl_cd(String value) {
		setConstString(offset + 23, $imi_sppl_cd, value);
	}


	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public String imi_sppl_nm() {
		return getConstString(offset + 24, $imi_sppl_nm);
	}

	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public void imi_sppl_nm(String value) {
		setConstString(offset + 24, $imi_sppl_nm, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String mi_po_d_no() {
		return getConstString(offset + 25, $mi_po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void mi_po_d_no(String value) {
		setConstString(offset + 25, $mi_po_d_no, value);
	}


	/**
	 * PO details No. required flg. 発注明細ＮＯ必須ＦＬＧ.<p>
	 *
	 */
	public boolean mi_po_d_no_req_flg() {
		return getConstBoolean(offset + 26, $mi_po_d_no_req_flg);
	}

	/**
	 * PO details No. required flg. 発注明細ＮＯ必須ＦＬＧ.<p>
	 *
	 */
	public void mi_po_d_no_req_flg(boolean value) {
		setConstBoolean(offset + 26, $mi_po_d_no_req_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 27, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 27, $itm_grp_p, row);
	}


	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public String match_typ() {
		return getConstString(offset + 28, $match_typ);
	}

	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public void match_typ(String value) {
		setConstString(offset + 28, $match_typ, value);
	}


	public String getString(String name) {
		if ($mfg_inst_no_input.equalsIgnoreCase(name)) {
			return mfg_inst_no_input();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($imi_mfg_mtd_typ.equalsIgnoreCase(name)) {
			return imi_mfg_mtd_typ();
		}
		if ($imi_mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			return imi_mfg_mtd_typ_nm();
		}
		if ($imi_lot_no.equalsIgnoreCase(name)) {
			return imi_lot_no();
		}
		if ($imi_sublot_no.equalsIgnoreCase(name)) {
			return imi_sublot_no();
		}
		if ($imi_mfg_loc_cd.equalsIgnoreCase(name)) {
			return imi_mfg_loc_cd();
		}
		if ($imi_mfg_loc_nm.equalsIgnoreCase(name)) {
			return imi_mfg_loc_nm();
		}
		if ($imi_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return imi_mfg_str_ln_cd();
		}
		if ($imi_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return imi_mfg_str_ln_nm();
		}
		if ($imi_sppl_cd.equalsIgnoreCase(name)) {
			return imi_sppl_cd();
		}
		if ($imi_sppl_nm.equalsIgnoreCase(name)) {
			return imi_sppl_nm();
		}
		if ($mi_po_d_no.equalsIgnoreCase(name)) {
			return mi_po_d_no();
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			return match_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($sav_flg.equalsIgnoreCase(name)) {
			return sav_flg();
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			return ord_flg();
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			return stt_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($mi_po_d_no_req_flg.equalsIgnoreCase(name)) {
			return mi_po_d_no_req_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_inst_no_input.equalsIgnoreCase(name)) {
			return mfg_inst_no_input();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($imi_mfg_mtd_typ.equalsIgnoreCase(name)) {
			return imi_mfg_mtd_typ();
		}
		if ($imi_mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			return imi_mfg_mtd_typ_nm();
		}
		if ($imi_lot_no.equalsIgnoreCase(name)) {
			return imi_lot_no();
		}
		if ($imi_sublot_no.equalsIgnoreCase(name)) {
			return imi_sublot_no();
		}
		if ($imi_mfg_loc_cd.equalsIgnoreCase(name)) {
			return imi_mfg_loc_cd();
		}
		if ($imi_mfg_loc_nm.equalsIgnoreCase(name)) {
			return imi_mfg_loc_nm();
		}
		if ($imi_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return imi_mfg_str_ln_cd();
		}
		if ($imi_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return imi_mfg_str_ln_nm();
		}
		if ($imi_sppl_cd.equalsIgnoreCase(name)) {
			return imi_sppl_cd();
		}
		if ($imi_sppl_nm.equalsIgnoreCase(name)) {
			return imi_sppl_nm();
		}
		if ($mi_po_d_no.equalsIgnoreCase(name)) {
			return mi_po_d_no();
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			return match_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sav_flg.equalsIgnoreCase(name)) {
			return sav_flg();
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			return ord_flg();
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			return stt_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($mi_po_d_no_req_flg.equalsIgnoreCase(name)) {
			return mi_po_d_no_req_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_inst_no_input.equalsIgnoreCase(name)) {
			mfg_inst_no_input(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($imi_mfg_mtd_typ.equalsIgnoreCase(name)) {
			imi_mfg_mtd_typ(value);
			return;
		}
		if ($imi_mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			imi_mfg_mtd_typ_nm(value);
			return;
		}
		if ($imi_lot_no.equalsIgnoreCase(name)) {
			imi_lot_no(value);
			return;
		}
		if ($imi_sublot_no.equalsIgnoreCase(name)) {
			imi_sublot_no(value);
			return;
		}
		if ($imi_mfg_loc_cd.equalsIgnoreCase(name)) {
			imi_mfg_loc_cd(value);
			return;
		}
		if ($imi_mfg_loc_nm.equalsIgnoreCase(name)) {
			imi_mfg_loc_nm(value);
			return;
		}
		if ($imi_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			imi_mfg_str_ln_cd(value);
			return;
		}
		if ($imi_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			imi_mfg_str_ln_nm(value);
			return;
		}
		if ($imi_sppl_cd.equalsIgnoreCase(name)) {
			imi_sppl_cd(value);
			return;
		}
		if ($imi_sppl_nm.equalsIgnoreCase(name)) {
			imi_sppl_nm(value);
			return;
		}
		if ($mi_po_d_no.equalsIgnoreCase(name)) {
			mi_po_d_no(value);
			return;
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			match_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sav_flg.equalsIgnoreCase(name)) {
			sav_flg(value);
			return;
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			ord_flg(value);
			return;
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			stt_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($mi_po_d_no_req_flg.equalsIgnoreCase(name)) {
			mi_po_d_no_req_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_inst_no_input.equalsIgnoreCase(name)) {
			mfg_inst_no_input(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($imi_mfg_mtd_typ.equalsIgnoreCase(name)) {
			imi_mfg_mtd_typ(value);
			return;
		}
		if ($imi_mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			imi_mfg_mtd_typ_nm(value);
			return;
		}
		if ($imi_lot_no.equalsIgnoreCase(name)) {
			imi_lot_no(value);
			return;
		}
		if ($imi_sublot_no.equalsIgnoreCase(name)) {
			imi_sublot_no(value);
			return;
		}
		if ($imi_mfg_loc_cd.equalsIgnoreCase(name)) {
			imi_mfg_loc_cd(value);
			return;
		}
		if ($imi_mfg_loc_nm.equalsIgnoreCase(name)) {
			imi_mfg_loc_nm(value);
			return;
		}
		if ($imi_mfg_str_ln_cd.equalsIgnoreCase(name)) {
			imi_mfg_str_ln_cd(value);
			return;
		}
		if ($imi_mfg_str_ln_nm.equalsIgnoreCase(name)) {
			imi_mfg_str_ln_nm(value);
			return;
		}
		if ($imi_sppl_cd.equalsIgnoreCase(name)) {
			imi_sppl_cd(value);
			return;
		}
		if ($imi_sppl_nm.equalsIgnoreCase(name)) {
			imi_sppl_nm(value);
			return;
		}
		if ($mi_po_d_no.equalsIgnoreCase(name)) {
			mi_po_d_no(value);
			return;
		}
		if ($match_typ.equalsIgnoreCase(name)) {
			match_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sav_flg.equalsIgnoreCase(name)) {
			sav_flg(value);
			return;
		}
		if ($ord_flg.equalsIgnoreCase(name)) {
			ord_flg(value);
			return;
		}
		if ($stt_flg.equalsIgnoreCase(name)) {
			stt_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($mi_po_d_no_req_flg.equalsIgnoreCase(name)) {
			mi_po_d_no_req_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($mi_st_schd_dt_p.equalsIgnoreCase(name)) {
			return mi_st_schd_dt_p();
		}
		if ($mi_end_schd_dt_p.equalsIgnoreCase(name)) {
			return mi_end_schd_dt_p();
		}
		if ($ma_st_act_dt_p.equalsIgnoreCase(name)) {
			return ma_st_act_dt_p();
		}
		if ($ma_end_act_dt_p.equalsIgnoreCase(name)) {
			return ma_end_act_dt_p();
		}
		if ($mi_rqst_dlv_rqst_dt_p.equalsIgnoreCase(name)) {
			return mi_rqst_dlv_rqst_dt_p();
		}
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($mi_st_schd_dt_p.equalsIgnoreCase(name)) {
			mi_st_schd_dt_p(
				((MCContainerMeta) mi_st_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($mi_end_schd_dt_p.equalsIgnoreCase(name)) {
			mi_end_schd_dt_p(
				((MCContainerMeta) mi_end_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($ma_st_act_dt_p.equalsIgnoreCase(name)) {
			ma_st_act_dt_p(
				((MCContainerMeta) ma_st_act_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($ma_end_act_dt_p.equalsIgnoreCase(name)) {
			ma_end_act_dt_p(
				((MCContainerMeta) ma_end_act_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($mi_rqst_dlv_rqst_dt_p.equalsIgnoreCase(name)) {
			mi_rqst_dlv_rqst_dt_p(
				((MCContainerMeta) mi_rqst_dlv_rqst_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
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
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class, value)
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


	/**
	 * Scheduled mfg. start date FROM 製造着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate mi_st_schd_dt_fr() {
		return mi_st_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled mfg. start date FROM 製造着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public void mi_st_schd_dt_fr(MCDate value) {
		mi_st_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Schedule mfg. start time FROM 製造着手予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate mi_st_schd_tm_fr() {
		return mi_st_schd_dt_p().hm_fr();
	}

	/**
	 * Schedule mfg. start time FROM 製造着手予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void mi_st_schd_tm_fr(MCDate value) {
		mi_st_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled mfg. start date TO 製造着手予定日ＴＯ.<p>
	 *
	 */
	public MCDate mi_st_schd_dt_to() {
		return mi_st_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled mfg. start date TO 製造着手予定日ＴＯ.<p>
	 *
	 */
	public void mi_st_schd_dt_to(MCDate value) {
		mi_st_schd_dt_p().ymd_to(value);
	}

	/**
	 * Schedule mfg. start time TO 製造着手予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate mi_st_schd_tm_to() {
		return mi_st_schd_dt_p().hm_to();
	}

	/**
	 * Schedule mfg. start time TO 製造着手予定時刻ＴＯ.<p>
	 *
	 */
	public void mi_st_schd_tm_to(MCDate value) {
		mi_st_schd_dt_p().hm_to(value);
	}

	/**
	 * Scheduled mfg. end date FROM 製造終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate mi_end_schd_dt_fr() {
		return mi_end_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled mfg. end date FROM 製造終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public void mi_end_schd_dt_fr(MCDate value) {
		mi_end_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Scheduled mfg. end time FROM 製造終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate mi_end_schd_tm_fr() {
		return mi_end_schd_dt_p().hm_fr();
	}

	/**
	 * Scheduled mfg. end time FROM 製造終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void mi_end_schd_tm_fr(MCDate value) {
		mi_end_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled mfg. end date TO 製造終了予定日ＴＯ.<p>
	 *
	 */
	public MCDate mi_end_schd_dt_to() {
		return mi_end_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled mfg. end date TO 製造終了予定日ＴＯ.<p>
	 *
	 */
	public void mi_end_schd_dt_to(MCDate value) {
		mi_end_schd_dt_p().ymd_to(value);
	}

	/**
	 * Scheduled mfg. end time TO 製造終了予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate mi_end_schd_tm_to() {
		return mi_end_schd_dt_p().hm_to();
	}

	/**
	 * Scheduled mfg. end time TO 製造終了予定時刻ＴＯ.<p>
	 *
	 */
	public void mi_end_schd_tm_to(MCDate value) {
		mi_end_schd_dt_p().hm_to(value);
	}

	/**
	 * Actual mfg. start date FROM 製造着手実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ma_st_act_dt_fr() {
		return ma_st_act_dt_p().ymd_fr();
	}

	/**
	 * Actual mfg. start date FROM 製造着手実績日ＦＲＯＭ.<p>
	 *
	 */
	public void ma_st_act_dt_fr(MCDate value) {
		ma_st_act_dt_p().ymd_fr(value);
	}

	/**
	 * Actual mfg. start time FROM 製造着手実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ma_st_act_tm_fr() {
		return ma_st_act_dt_p().hm_fr();
	}

	/**
	 * Actual mfg. start time FROM 製造着手実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ma_st_act_tm_fr(MCDate value) {
		ma_st_act_dt_p().hm_fr(value);
	}

	/**
	 * Actual mfg. start date TO 製造着手実績日ＴＯ.<p>
	 *
	 */
	public MCDate ma_st_act_dt_to() {
		return ma_st_act_dt_p().ymd_to();
	}

	/**
	 * Actual mfg. start date TO 製造着手実績日ＴＯ.<p>
	 *
	 */
	public void ma_st_act_dt_to(MCDate value) {
		ma_st_act_dt_p().ymd_to(value);
	}

	/**
	 * Actual mfg. start time TO 製造着手実績時刻ＴＯ.<p>
	 *
	 */
	public MCDate ma_st_act_tm_to() {
		return ma_st_act_dt_p().hm_to();
	}

	/**
	 * Actual mfg. start time TO 製造着手実績時刻ＴＯ.<p>
	 *
	 */
	public void ma_st_act_tm_to(MCDate value) {
		ma_st_act_dt_p().hm_to(value);
	}

	/**
	 * Actual mfg. end date FROM 製造終了実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ma_end_act_dt_fr() {
		return ma_end_act_dt_p().ymd_fr();
	}

	/**
	 * Actual mfg. end date FROM 製造終了実績日ＦＲＯＭ.<p>
	 *
	 */
	public void ma_end_act_dt_fr(MCDate value) {
		ma_end_act_dt_p().ymd_fr(value);
	}

	/**
	 * Actual mfg. end time FROM 製造終了実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ma_end_act_tm_fr() {
		return ma_end_act_dt_p().hm_fr();
	}

	/**
	 * Actual mfg. end time FROM 製造終了実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ma_end_act_tm_fr(MCDate value) {
		ma_end_act_dt_p().hm_fr(value);
	}

	/**
	 * Actual mfg. end date TO 製造終了実績日ＴＯ.<p>
	 *
	 */
	public MCDate ma_end_act_dt_to() {
		return ma_end_act_dt_p().ymd_to();
	}

	/**
	 * Actual mfg. end date TO 製造終了実績日ＴＯ.<p>
	 *
	 */
	public void ma_end_act_dt_to(MCDate value) {
		ma_end_act_dt_p().ymd_to(value);
	}

	/**
	 * Actual mfg. end time TO 製造終了実績時刻ＴＯ.<p>
	 *
	 */
	public MCDate ma_end_act_tm_to() {
		return ma_end_act_dt_p().hm_to();
	}

	/**
	 * Actual mfg. end time TO 製造終了実績時刻ＴＯ.<p>
	 *
	 */
	public void ma_end_act_tm_to(MCDate value) {
		ma_end_act_dt_p().hm_to(value);
	}

	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate mi_rqst_dlv_rqst_dt_fr() {
		return mi_rqst_dlv_rqst_dt_p().ymd_fr();
	}

	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public void mi_rqst_dlv_rqst_dt_fr(MCDate value) {
		mi_rqst_dlv_rqst_dt_p().ymd_fr(value);
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate mi_rqst_dlv_rqst_tm_fr() {
		return mi_rqst_dlv_rqst_dt_p().hm_fr();
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public void mi_rqst_dlv_rqst_tm_fr(MCDate value) {
		mi_rqst_dlv_rqst_dt_p().hm_fr(value);
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public MCDate mi_rqst_dlv_rqst_dt_to() {
		return mi_rqst_dlv_rqst_dt_p().ymd_to();
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public void mi_rqst_dlv_rqst_dt_to(MCDate value) {
		mi_rqst_dlv_rqst_dt_p().ymd_to(value);
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public MCDate mi_rqst_dlv_rqst_tm_to() {
		return mi_rqst_dlv_rqst_dt_p().hm_to();
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public void mi_rqst_dlv_rqst_tm_to(MCDate value) {
		mi_rqst_dlv_rqst_dt_p().hm_to(value);
	}

	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	public String itm_typ_nm() {
		return itm_typ_p().itm_typ_nm();
	}

	public void itm_typ_nm(String value) {
		itm_typ_p().itm_typ_nm(value);
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

	public String imi_itm_cd() {
		return itm_p().itm_cd();
	}

	public void imi_itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String imi_itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void imi_itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String imi_itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void imi_itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String imi_itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void imi_itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String imi_itm_nm() {
		return itm_p().itm_nm();
	}

	public void imi_itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	public String imi_sno1() {
		return sno_wrk_no_p().sno1();
	}

	public void imi_sno1(String value) {
		sno_wrk_no_p().sno1(value);
	}

	public String imi_sno2() {
		return sno_wrk_no_p().sno2();
	}

	public void imi_sno2(String value) {
		sno_wrk_no_p().sno2(value);
	}

	public String imi_sno3() {
		return sno_wrk_no_p().sno3();
	}

	public void imi_sno3(String value) {
		sno_wrk_no_p().sno3(value);
	}

	public String imi_sno4() {
		return sno_wrk_no_p().sno4();
	}

	public void imi_sno4(String value) {
		sno_wrk_no_p().sno4(value);
	}

	public String imi_wrk_no() {
		return sno_wrk_no_p().wrk_no();
	}

	public void imi_wrk_no(String value) {
		sno_wrk_no_p().wrk_no(value);
	}

	public String imi_wrk_nm() {
		return sno_wrk_no_p().wrk_nm();
	}

	public void imi_wrk_nm(String value) {
		sno_wrk_no_p().wrk_nm(value);
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

