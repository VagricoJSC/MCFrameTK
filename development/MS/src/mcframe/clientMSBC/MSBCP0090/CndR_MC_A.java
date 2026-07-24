package mcframe.clientMSBC.MSBCP0090;

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
	 * Unfirm 未確定.<p>
	 *
	 */
	public static final String $opn_flg = "opn_flg";
	/**
	 * Save 保存.<p>
	 *
	 */
	public static final String $sav_flg = "sav_flg";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Partially ordered 一部指図済.<p>
	 *
	 */
	public static final String $part_inst_flg = "part_inst_flg";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $inst_flg = "inst_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
	/**
	 * Order to be imported オーダ受信対象.<p>
	 *
	 */
	public static final String $ord_rcv_tgt_flg = "ord_rcv_tgt_flg";
	/**
	 * Order not to be imported オーダ受信対象外.<p>
	 *
	 */
	public static final String $not_ord_rcv_tgt_flg = "not_ord_rcv_tgt_flg";
	/**
	 * Order to be exported オーダ送信対象.<p>
	 *
	 */
	public static final String $ord_snd_tgt_flg = "ord_snd_tgt_flg";
	/**
	 * Order not to be exported オーダ送信対象外.<p>
	 *
	 */
	public static final String $not_ord_snd_tgt_flg = "not_ord_snd_tgt_flg";
	/**
	 * Scheduled item start date FROM 品目着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $mfg_st_schd_dt_fr = "mfg_st_schd_dt_fr";
	/**
	 * Scheduled item start date TO 品目着手予定日ＴＯ.<p>
	 *
	 */
	public static final String $mfg_st_schd_dt_to = "mfg_st_schd_dt_to";
	/**
	 * Scheduled item end date FROM 品目終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $mfg_end_schd_dt_fr = "mfg_end_schd_dt_fr";
	/**
	 * Scheduled item end date TO 品目終了予定日ＴＯ.<p>
	 *
	 */
	public static final String $mfg_end_schd_dt_to = "mfg_end_schd_dt_to";
	public static final String $stSchd_p = "stSchd_p";
	public static final String $endSchd_p = "endSchd_p";
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
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $mfg_site_cd = "mfg_site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $mfg_site_nm = "mfg_site_nm";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
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
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public static final String $oper_rsrc = "oper_rsrc";
	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public static final String $oper_ord_no = "oper_ord_no";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
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
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public static final String $ext_sys_nm = "ext_sys_nm";
	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public static final String $ext_itm_ord_no = "ext_itm_ord_no";
	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public static final String $ext_oper_ord_no = "ext_oper_ord_no";
	public static final String $itm_grp_p = "itm_grp_p";
	/**
	 * No abnormality 異常なし.<p>
	 *
	 */
	public static final String $no_problem_flg = "no_problem_flg";
	/**
	 * Operation shortage qty. 工程数量不足.<p>
	 *
	 */
	public static final String $oper_qty_red_flg = "oper_qty_red_flg";
	/**
	 * Operation start date and time delayed 工程着手日時遅れ.<p>
	 *
	 */
	public static final String $st_dt_red_flg = "st_dt_red_flg";
	/**
	 * Operation finish date and time delayed 工程終了日時遅れ.<p>
	 *
	 */
	public static final String $end_dt_red_flg = "end_dt_red_flg";

	public static final String $st_schd_dt_fr = $stSchd_p + ".ymd_fr";
	public static final String $st_schd_hm_fr = $stSchd_p + ".hm_fr";
	public static final String $st_schd_dt_to = $stSchd_p + ".ymd_to";
	public static final String $st_schd_hm_to = $stSchd_p + ".hm_to";
	public static final String $end_schd_dt_fr = $endSchd_p + ".ymd_fr";
	public static final String $end_schd_hm_fr = $endSchd_p + ".hm_fr";
	public static final String $end_schd_dt_to = $endSchd_p + ".ymd_to";
	public static final String $end_schd_hm_to = $endSchd_p + ".hm_to";
	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $sno1 = $sno_wrk_no_p + ".sno1";
	public static final String $sno2 = $sno_wrk_no_p + ".sno2";
	public static final String $sno3 = $sno_wrk_no_p + ".sno3";
	public static final String $sno4 = $sno_wrk_no_p + ".sno4";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
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

	public static final MCMeta opn_flg_META = createCommonMeta($opn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sav_flg_META = createCommonMeta($sav_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_inst_flg_META = createCommonMeta($part_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_flg_META = createCommonMeta($inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ord_rcv_tgt_flg_META = createCommonMeta($ord_rcv_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_ord_rcv_tgt_flg_META = createCommonMeta($not_ord_rcv_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ord_snd_tgt_flg_META = createCommonMeta($ord_snd_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_ord_snd_tgt_flg_META = createCommonMeta($not_ord_snd_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_st_schd_dt_fr_META = createCommonMeta($mfg_st_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_st_schd_dt_to_META = createCommonMeta($mfg_st_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_schd_dt_fr_META = createCommonMeta($mfg_end_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_schd_dt_to_META = createCommonMeta($mfg_end_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta stSchd_p_META = createInnerRowMeta($stSchd_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta endSchd_p_META = createInnerRowMeta($endSchd_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mfg_site_cd_META = createCommonMeta($mfg_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta mfg_site_nm_META = createCommonMeta($mfg_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta oper_rsrc_META = createCommonMeta($oper_rsrc, mcframe.commonMA.meta.MA_META.OPER_RSRC);
	public static final MCMeta oper_ord_no_META = createCommonMeta($oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMS.meta.MS_META.OORDER_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.OORDER_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.OORDER_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.OORDER_SUB_CHAR3);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_itm_ord_no_META = createCommonMeta($ext_itm_ord_no, mcframe.commonMA.meta.MA_META.EXT_ITM_ORD_NO);
	public static final MCMeta ext_oper_ord_no_META = createCommonMeta($ext_oper_ord_no, mcframe.commonMA.meta.MA_META.EXT_OPER_ORD_NO);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);
	public static final MCMeta no_problem_flg_META = createCommonMeta($no_problem_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_qty_red_flg_META = createCommonMeta($oper_qty_red_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_dt_red_flg_META = createCommonMeta($st_dt_red_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta end_dt_red_flg_META = createCommonMeta($end_dt_red_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			opn_flg_META,
			sav_flg_META,
			fix_flg_META,
			part_inst_flg_META,
			inst_flg_META,
			cmpl_flg_META,
			ord_rcv_tgt_flg_META,
			not_ord_rcv_tgt_flg_META,
			ord_snd_tgt_flg_META,
			not_ord_snd_tgt_flg_META,
			mfg_st_schd_dt_fr_META,
			mfg_st_schd_dt_to_META,
			mfg_end_schd_dt_fr_META,
			mfg_end_schd_dt_to_META,
			stSchd_p_META,
			endSchd_p_META,
			wg_cd_META,
			wg_nm_META,
			mfg_site_cd_META,
			mfg_site_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			loc_cd_META,
			loc_nm_META,
			oper_ptn_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			itm_typ_p_META,
			itm_p_META,
			sno_wrk_no_p_META,
			oper_rsrc_META,
			oper_ord_no_META,
			itm_ord_no_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_itm_ord_no_META,
			ext_oper_ord_no_META,
			itm_grp_p_META,
			no_problem_flg_META,
			oper_qty_red_flg_META,
			st_dt_red_flg_META,
			end_dt_red_flg_META
		},
		new String[][]{
			{
				"st_schd_dt_fr",
				"st_schd_hm_fr",
				"st_schd_dt_to",
				"st_schd_hm_to",
				"end_schd_dt_fr",
				"end_schd_hm_fr",
				"end_schd_dt_to",
				"end_schd_hm_to",
				"itm_typ",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
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
				$st_schd_dt_fr,
				$st_schd_hm_fr,
				$st_schd_dt_to,
				$st_schd_hm_to,
				$end_schd_dt_fr,
				$end_schd_hm_fr,
				$end_schd_dt_to,
				$end_schd_hm_to,
				$itm_typ,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
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
				{$mfg_site_cd, "site_nm"},	// mfg_site_cd
				{$mfg_loc_cd, "loc_nm"},	// mfg_loc_cd
				{$loc_cd, "loc_nm"}	// loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$mfg_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// mfg_loc_cd
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"}	// loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$mfg_loc_cd, "loc_is_srch_typ"},	// mfg_loc_cd
				{$loc_cd, "loc_is_srch_typ"}	// loc_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$mfg_site_cd, "SITE"},	// mfg_site_cd
				{$mfg_site_nm, "SITE"},	// mfg_site_nm
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$loc_grp_nm, "LOC_GRP"}	// loc_grp_nm
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
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean opn_flg() {
		return getConstBoolean(offset + 0, $opn_flg);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void opn_flg(boolean value) {
		setConstBoolean(offset + 0, $opn_flg, value);
	}


	/**
	 * Save 保存.<p>
	 *
	 */
	public boolean sav_flg() {
		return getConstBoolean(offset + 1, $sav_flg);
	}

	/**
	 * Save 保存.<p>
	 *
	 */
	public void sav_flg(boolean value) {
		setConstBoolean(offset + 1, $sav_flg, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 2, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 2, $fix_flg, value);
	}


	/**
	 * Partially ordered 一部指図済.<p>
	 *
	 */
	public boolean part_inst_flg() {
		return getConstBoolean(offset + 3, $part_inst_flg);
	}

	/**
	 * Partially ordered 一部指図済.<p>
	 *
	 */
	public void part_inst_flg(boolean value) {
		setConstBoolean(offset + 3, $part_inst_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean inst_flg() {
		return getConstBoolean(offset + 4, $inst_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void inst_flg(boolean value) {
		setConstBoolean(offset + 4, $inst_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 5, $cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 5, $cmpl_flg, value);
	}


	/**
	 * Order to be imported オーダ受信対象.<p>
	 *
	 */
	public boolean ord_rcv_tgt_flg() {
		return getConstBoolean(offset + 6, $ord_rcv_tgt_flg);
	}

	/**
	 * Order to be imported オーダ受信対象.<p>
	 *
	 */
	public void ord_rcv_tgt_flg(boolean value) {
		setConstBoolean(offset + 6, $ord_rcv_tgt_flg, value);
	}


	/**
	 * Order not to be imported オーダ受信対象外.<p>
	 *
	 */
	public boolean not_ord_rcv_tgt_flg() {
		return getConstBoolean(offset + 7, $not_ord_rcv_tgt_flg);
	}

	/**
	 * Order not to be imported オーダ受信対象外.<p>
	 *
	 */
	public void not_ord_rcv_tgt_flg(boolean value) {
		setConstBoolean(offset + 7, $not_ord_rcv_tgt_flg, value);
	}


	/**
	 * Order to be exported オーダ送信対象.<p>
	 *
	 */
	public boolean ord_snd_tgt_flg() {
		return getConstBoolean(offset + 8, $ord_snd_tgt_flg);
	}

	/**
	 * Order to be exported オーダ送信対象.<p>
	 *
	 */
	public void ord_snd_tgt_flg(boolean value) {
		setConstBoolean(offset + 8, $ord_snd_tgt_flg, value);
	}


	/**
	 * Order not to be exported オーダ送信対象外.<p>
	 *
	 */
	public boolean not_ord_snd_tgt_flg() {
		return getConstBoolean(offset + 9, $not_ord_snd_tgt_flg);
	}

	/**
	 * Order not to be exported オーダ送信対象外.<p>
	 *
	 */
	public void not_ord_snd_tgt_flg(boolean value) {
		setConstBoolean(offset + 9, $not_ord_snd_tgt_flg, value);
	}


	/**
	 * Scheduled item start date FROM 品目着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt_fr() {
		return getConstDate(offset + 10, $mfg_st_schd_dt_fr);
	}

	/**
	 * Scheduled item start date FROM 品目着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public void mfg_st_schd_dt_fr(MCDate value) {
		setConstDate(offset + 10, $mfg_st_schd_dt_fr, value);
	}


	/**
	 * Scheduled item start date TO 品目着手予定日ＴＯ.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt_to() {
		return getConstDate(offset + 11, $mfg_st_schd_dt_to);
	}

	/**
	 * Scheduled item start date TO 品目着手予定日ＴＯ.<p>
	 *
	 */
	public void mfg_st_schd_dt_to(MCDate value) {
		setConstDate(offset + 11, $mfg_st_schd_dt_to, value);
	}


	/**
	 * Scheduled item end date FROM 品目終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt_fr() {
		return getConstDate(offset + 12, $mfg_end_schd_dt_fr);
	}

	/**
	 * Scheduled item end date FROM 品目終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public void mfg_end_schd_dt_fr(MCDate value) {
		setConstDate(offset + 12, $mfg_end_schd_dt_fr, value);
	}


	/**
	 * Scheduled item end date TO 品目終了予定日ＴＯ.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt_to() {
		return getConstDate(offset + 13, $mfg_end_schd_dt_to);
	}

	/**
	 * Scheduled item end date TO 品目終了予定日ＴＯ.<p>
	 *
	 */
	public void mfg_end_schd_dt_to(MCDate value) {
		setConstDate(offset + 13, $mfg_end_schd_dt_to, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR stSchd_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 14, $stSchd_p);
	}
	
	public void stSchd_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 14, $stSchd_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR endSchd_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 15, $endSchd_p);
	}
	
	public void endSchd_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 15, $endSchd_p, row);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 16, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 16, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 17, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 17, $wg_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String mfg_site_cd() {
		return getConstString(offset + 18, $mfg_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void mfg_site_cd(String value) {
		setConstString(offset + 18, $mfg_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String mfg_site_nm() {
		return getConstString(offset + 19, $mfg_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void mfg_site_nm(String value) {
		setConstString(offset + 19, $mfg_site_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 20, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 20, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 21, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 21, $mfg_loc_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 22, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 22, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 23, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 23, $loc_grp_nm, value);
	}


	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 24, $loc_cd);
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 24, $loc_cd, value);
	}


	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 25, $loc_nm);
	}

	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 25, $loc_nm, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 26, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 26, $oper_ptn, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 27, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 27, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 28, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 28, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 29, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 29, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 29, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 29, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 29, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 29, $oper_seq, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 30, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 30, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 31, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 31, $itm_p, row);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 32, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 32, $sno_wrk_no_p, row);
	}


	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public String oper_rsrc() {
		return getConstString(offset + 33, $oper_rsrc);
	}

	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public void oper_rsrc(String value) {
		setConstString(offset + 33, $oper_rsrc, value);
	}


	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return getConstString(offset + 34, $oper_ord_no);
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		setConstString(offset + 34, $oper_ord_no, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 35, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 35, $itm_ord_no, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 36, $rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 36, $rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 37, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 37, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 38, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 38, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 39, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 39, $sub_char3, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 40, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 40, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 41, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 41, $ext_sys_nm, value);
	}


	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public String ext_itm_ord_no() {
		return getConstString(offset + 42, $ext_itm_ord_no);
	}

	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public void ext_itm_ord_no(String value) {
		setConstString(offset + 42, $ext_itm_ord_no, value);
	}


	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public String ext_oper_ord_no() {
		return getConstString(offset + 43, $ext_oper_ord_no);
	}

	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public void ext_oper_ord_no(String value) {
		setConstString(offset + 43, $ext_oper_ord_no, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 44, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 44, $itm_grp_p, row);
	}


	/**
	 * No abnormality 異常なし.<p>
	 *
	 */
	public boolean no_problem_flg() {
		return getConstBoolean(offset + 45, $no_problem_flg);
	}

	/**
	 * No abnormality 異常なし.<p>
	 *
	 */
	public void no_problem_flg(boolean value) {
		setConstBoolean(offset + 45, $no_problem_flg, value);
	}


	/**
	 * Operation shortage qty. 工程数量不足.<p>
	 *
	 */
	public boolean oper_qty_red_flg() {
		return getConstBoolean(offset + 46, $oper_qty_red_flg);
	}

	/**
	 * Operation shortage qty. 工程数量不足.<p>
	 *
	 */
	public void oper_qty_red_flg(boolean value) {
		setConstBoolean(offset + 46, $oper_qty_red_flg, value);
	}


	/**
	 * Operation start date and time delayed 工程着手日時遅れ.<p>
	 *
	 */
	public boolean st_dt_red_flg() {
		return getConstBoolean(offset + 47, $st_dt_red_flg);
	}

	/**
	 * Operation start date and time delayed 工程着手日時遅れ.<p>
	 *
	 */
	public void st_dt_red_flg(boolean value) {
		setConstBoolean(offset + 47, $st_dt_red_flg, value);
	}


	/**
	 * Operation finish date and time delayed 工程終了日時遅れ.<p>
	 *
	 */
	public boolean end_dt_red_flg() {
		return getConstBoolean(offset + 48, $end_dt_red_flg);
	}

	/**
	 * Operation finish date and time delayed 工程終了日時遅れ.<p>
	 *
	 */
	public void end_dt_red_flg(boolean value) {
		setConstBoolean(offset + 48, $end_dt_red_flg, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mfg_site_cd.equalsIgnoreCase(name)) {
			return mfg_site_cd();
		}
		if ($mfg_site_nm.equalsIgnoreCase(name)) {
			return mfg_site_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_itm_ord_no.equalsIgnoreCase(name)) {
			return ext_itm_ord_no();
		}
		if ($ext_oper_ord_no.equalsIgnoreCase(name)) {
			return ext_oper_ord_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($mfg_st_schd_dt_fr.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt_fr();
		}
		if ($mfg_st_schd_dt_to.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt_to();
		}
		if ($mfg_end_schd_dt_fr.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt_fr();
		}
		if ($mfg_end_schd_dt_to.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($opn_flg.equalsIgnoreCase(name)) {
			return opn_flg();
		}
		if ($sav_flg.equalsIgnoreCase(name)) {
			return sav_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($part_inst_flg.equalsIgnoreCase(name)) {
			return part_inst_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($ord_rcv_tgt_flg.equalsIgnoreCase(name)) {
			return ord_rcv_tgt_flg();
		}
		if ($not_ord_rcv_tgt_flg.equalsIgnoreCase(name)) {
			return not_ord_rcv_tgt_flg();
		}
		if ($ord_snd_tgt_flg.equalsIgnoreCase(name)) {
			return ord_snd_tgt_flg();
		}
		if ($not_ord_snd_tgt_flg.equalsIgnoreCase(name)) {
			return not_ord_snd_tgt_flg();
		}
		if ($no_problem_flg.equalsIgnoreCase(name)) {
			return no_problem_flg();
		}
		if ($oper_qty_red_flg.equalsIgnoreCase(name)) {
			return oper_qty_red_flg();
		}
		if ($st_dt_red_flg.equalsIgnoreCase(name)) {
			return st_dt_red_flg();
		}
		if ($end_dt_red_flg.equalsIgnoreCase(name)) {
			return end_dt_red_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mfg_site_cd.equalsIgnoreCase(name)) {
			return mfg_site_cd();
		}
		if ($mfg_site_nm.equalsIgnoreCase(name)) {
			return mfg_site_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_itm_ord_no.equalsIgnoreCase(name)) {
			return ext_itm_ord_no();
		}
		if ($ext_oper_ord_no.equalsIgnoreCase(name)) {
			return ext_oper_ord_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mfg_st_schd_dt_fr.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt_fr();
		}
		if ($mfg_st_schd_dt_to.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt_to();
		}
		if ($mfg_end_schd_dt_fr.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt_fr();
		}
		if ($mfg_end_schd_dt_to.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($opn_flg.equalsIgnoreCase(name)) {
			return opn_flg();
		}
		if ($sav_flg.equalsIgnoreCase(name)) {
			return sav_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($part_inst_flg.equalsIgnoreCase(name)) {
			return part_inst_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($ord_rcv_tgt_flg.equalsIgnoreCase(name)) {
			return ord_rcv_tgt_flg();
		}
		if ($not_ord_rcv_tgt_flg.equalsIgnoreCase(name)) {
			return not_ord_rcv_tgt_flg();
		}
		if ($ord_snd_tgt_flg.equalsIgnoreCase(name)) {
			return ord_snd_tgt_flg();
		}
		if ($not_ord_snd_tgt_flg.equalsIgnoreCase(name)) {
			return not_ord_snd_tgt_flg();
		}
		if ($no_problem_flg.equalsIgnoreCase(name)) {
			return no_problem_flg();
		}
		if ($oper_qty_red_flg.equalsIgnoreCase(name)) {
			return oper_qty_red_flg();
		}
		if ($st_dt_red_flg.equalsIgnoreCase(name)) {
			return st_dt_red_flg();
		}
		if ($end_dt_red_flg.equalsIgnoreCase(name)) {
			return end_dt_red_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mfg_site_cd.equalsIgnoreCase(name)) {
			mfg_site_cd(value);
			return;
		}
		if ($mfg_site_nm.equalsIgnoreCase(name)) {
			mfg_site_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
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
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			oper_rsrc(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_itm_ord_no.equalsIgnoreCase(name)) {
			ext_itm_ord_no(value);
			return;
		}
		if ($ext_oper_ord_no.equalsIgnoreCase(name)) {
			ext_oper_ord_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mfg_st_schd_dt_fr.equalsIgnoreCase(name)) {
			mfg_st_schd_dt_fr(value);
			return;
		}
		if ($mfg_st_schd_dt_to.equalsIgnoreCase(name)) {
			mfg_st_schd_dt_to(value);
			return;
		}
		if ($mfg_end_schd_dt_fr.equalsIgnoreCase(name)) {
			mfg_end_schd_dt_fr(value);
			return;
		}
		if ($mfg_end_schd_dt_to.equalsIgnoreCase(name)) {
			mfg_end_schd_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($opn_flg.equalsIgnoreCase(name)) {
			opn_flg(value);
			return;
		}
		if ($sav_flg.equalsIgnoreCase(name)) {
			sav_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($part_inst_flg.equalsIgnoreCase(name)) {
			part_inst_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($ord_rcv_tgt_flg.equalsIgnoreCase(name)) {
			ord_rcv_tgt_flg(value);
			return;
		}
		if ($not_ord_rcv_tgt_flg.equalsIgnoreCase(name)) {
			not_ord_rcv_tgt_flg(value);
			return;
		}
		if ($ord_snd_tgt_flg.equalsIgnoreCase(name)) {
			ord_snd_tgt_flg(value);
			return;
		}
		if ($not_ord_snd_tgt_flg.equalsIgnoreCase(name)) {
			not_ord_snd_tgt_flg(value);
			return;
		}
		if ($no_problem_flg.equalsIgnoreCase(name)) {
			no_problem_flg(value);
			return;
		}
		if ($oper_qty_red_flg.equalsIgnoreCase(name)) {
			oper_qty_red_flg(value);
			return;
		}
		if ($st_dt_red_flg.equalsIgnoreCase(name)) {
			st_dt_red_flg(value);
			return;
		}
		if ($end_dt_red_flg.equalsIgnoreCase(name)) {
			end_dt_red_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mfg_site_cd.equalsIgnoreCase(name)) {
			mfg_site_cd(value);
			return;
		}
		if ($mfg_site_nm.equalsIgnoreCase(name)) {
			mfg_site_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
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
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			oper_rsrc(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_itm_ord_no.equalsIgnoreCase(name)) {
			ext_itm_ord_no(value);
			return;
		}
		if ($ext_oper_ord_no.equalsIgnoreCase(name)) {
			ext_oper_ord_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mfg_st_schd_dt_fr.equalsIgnoreCase(name)) {
			mfg_st_schd_dt_fr(value);
			return;
		}
		if ($mfg_st_schd_dt_to.equalsIgnoreCase(name)) {
			mfg_st_schd_dt_to(value);
			return;
		}
		if ($mfg_end_schd_dt_fr.equalsIgnoreCase(name)) {
			mfg_end_schd_dt_fr(value);
			return;
		}
		if ($mfg_end_schd_dt_to.equalsIgnoreCase(name)) {
			mfg_end_schd_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($opn_flg.equalsIgnoreCase(name)) {
			opn_flg(value);
			return;
		}
		if ($sav_flg.equalsIgnoreCase(name)) {
			sav_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($part_inst_flg.equalsIgnoreCase(name)) {
			part_inst_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($ord_rcv_tgt_flg.equalsIgnoreCase(name)) {
			ord_rcv_tgt_flg(value);
			return;
		}
		if ($not_ord_rcv_tgt_flg.equalsIgnoreCase(name)) {
			not_ord_rcv_tgt_flg(value);
			return;
		}
		if ($ord_snd_tgt_flg.equalsIgnoreCase(name)) {
			ord_snd_tgt_flg(value);
			return;
		}
		if ($not_ord_snd_tgt_flg.equalsIgnoreCase(name)) {
			not_ord_snd_tgt_flg(value);
			return;
		}
		if ($no_problem_flg.equalsIgnoreCase(name)) {
			no_problem_flg(value);
			return;
		}
		if ($oper_qty_red_flg.equalsIgnoreCase(name)) {
			oper_qty_red_flg(value);
			return;
		}
		if ($st_dt_red_flg.equalsIgnoreCase(name)) {
			st_dt_red_flg(value);
			return;
		}
		if ($end_dt_red_flg.equalsIgnoreCase(name)) {
			end_dt_red_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($stSchd_p.equalsIgnoreCase(name)) {
			return stSchd_p();
		}
		if ($endSchd_p.equalsIgnoreCase(name)) {
			return endSchd_p();
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
		if ($stSchd_p.equalsIgnoreCase(name)) {
			stSchd_p(
				((MCContainerMeta) stSchd_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($endSchd_p.equalsIgnoreCase(name)) {
			endSchd_p(
				((MCContainerMeta) endSchd_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
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
	 * Scheduled operation start date FROM 工程着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_schd_dt_fr() {
		return stSchd_p().ymd_fr();
	}

	/**
	 * Scheduled operation start date FROM 工程着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public void st_schd_dt_fr(MCDate value) {
		stSchd_p().ymd_fr(value);
	}

	/**
	 * Scheduled operation start time FROM 工程着手予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_schd_hm_fr() {
		return stSchd_p().hm_fr();
	}

	/**
	 * Scheduled operation start time FROM 工程着手予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void st_schd_hm_fr(MCDate value) {
		stSchd_p().hm_fr(value);
	}

	/**
	 * Scheduled operation start date TO 工程着手予定日ＴＯ.<p>
	 *
	 */
	public MCDate st_schd_dt_to() {
		return stSchd_p().ymd_to();
	}

	/**
	 * Scheduled operation start date TO 工程着手予定日ＴＯ.<p>
	 *
	 */
	public void st_schd_dt_to(MCDate value) {
		stSchd_p().ymd_to(value);
	}

	/**
	 * Scheduled operation start time TO 工程着手予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate st_schd_hm_to() {
		return stSchd_p().hm_to();
	}

	/**
	 * Scheduled operation start time TO 工程着手予定時刻ＴＯ.<p>
	 *
	 */
	public void st_schd_hm_to(MCDate value) {
		stSchd_p().hm_to(value);
	}

	/**
	 * Scheduled operation end date FROM 工程終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_schd_dt_fr() {
		return endSchd_p().ymd_fr();
	}

	/**
	 * Scheduled operation end date FROM 工程終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public void end_schd_dt_fr(MCDate value) {
		endSchd_p().ymd_fr(value);
	}

	/**
	 * Scheduled operation end time FROM 工程終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_schd_hm_fr() {
		return endSchd_p().hm_fr();
	}

	/**
	 * Scheduled operation end time FROM 工程終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void end_schd_hm_fr(MCDate value) {
		endSchd_p().hm_fr(value);
	}

	/**
	 * Scheduled operation end date TO 工程終了予定日ＴＯ.<p>
	 *
	 */
	public MCDate end_schd_dt_to() {
		return endSchd_p().ymd_to();
	}

	/**
	 * Scheduled operation end date TO 工程終了予定日ＴＯ.<p>
	 *
	 */
	public void end_schd_dt_to(MCDate value) {
		endSchd_p().ymd_to(value);
	}

	/**
	 * Scheduled operation end time TO 工程終了予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate end_schd_hm_to() {
		return endSchd_p().hm_to();
	}

	/**
	 * Scheduled operation end time TO 工程終了予定時刻ＴＯ.<p>
	 *
	 */
	public void end_schd_hm_to(MCDate value) {
		endSchd_p().hm_to(value);
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

	public String sno1() {
		return sno_wrk_no_p().sno1();
	}

	public void sno1(String value) {
		sno_wrk_no_p().sno1(value);
	}

	public String sno2() {
		return sno_wrk_no_p().sno2();
	}

	public void sno2(String value) {
		sno_wrk_no_p().sno2(value);
	}

	public String sno3() {
		return sno_wrk_no_p().sno3();
	}

	public void sno3(String value) {
		sno_wrk_no_p().sno3(value);
	}

	public String sno4() {
		return sno_wrk_no_p().sno4();
	}

	public void sno4(String value) {
		sno_wrk_no_p().sno4(value);
	}

	public String wrk_no() {
		return sno_wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
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

