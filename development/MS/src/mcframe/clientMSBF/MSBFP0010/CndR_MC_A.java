package mcframe.clientMSBF.MSBFP0010;

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
	 * LMT_UP,Create schedule for re-inspection for expiration;INSP_SCHD,Create schedule for re-inspection for inventory;DEL_LMT_UP,Cancel schedule for re-inspection for expiration;DEL_INSP_SCHD,Cancel schedule for re-inspection for inventory LMT_UP,期限再検査予定を登録する;INSP_SCHD,在庫再検査予定を登録する;DEL_LMT_UP,期限再検査予定を取り消す;DEL_INSP_SCHD,在庫再検査予定を取り消す.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Current date 現在日付.<p>
	 *
	 */
	public static final String $today = "today";
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
	 * Remaining expiration date 残有効期限.<p>
	 *
	 */
	public static final String $rem_stk_vld_pd = "rem_stk_vld_pd";
	/**
	 * 0,Month;1,Date 0,月;1,日.<p>
	 *
	 */
	public static final String $rem_stk_vld_pd_typ = "rem_stk_vld_pd_typ";
	/**
	 * Target date (Expiration date) 対象年月日(有効期限）.<p>
	 *
	 */
	public static final String $trg_stk_vld_dt = "trg_stk_vld_dt";
	/**
	 * Remaining usage expiration date 残使用期限.<p>
	 *
	 */
	public static final String $rem_stk_lmt_pd = "rem_stk_lmt_pd";
	/**
	 * 0,Month;1,Date 0,月;1,日.<p>
	 *
	 */
	public static final String $rem_stk_lmt_pd_typ = "rem_stk_lmt_pd_typ";
	/**
	 * Target date (Usage expiration date) 対象年月日(使用期限).<p>
	 *
	 */
	public static final String $trg_stk_lmt_dt = "trg_stk_lmt_dt";
	public static final String $itm_typ_p = "itm_typ_p";
	/**
	 * Without expiration only 期限未設定のみ.<p>
	 *
	 */
	public static final String $unreg_lmt_flg = "unreg_lmt_flg";
	/**
	 * Display scheduled date to use 使用予定日表示.<p>
	 *
	 */
	public static final String $disp_mrp_use_dt_flg = "disp_mrp_use_dt_flg";
	public static final String $itm_p = "itm_p";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
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
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 * Oldest GR date FROM 最古入庫日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $first_gr_dt_fr = "first_gr_dt_fr";
	/**
	 * Oldest GR date TO 最古入庫日ＴＯ.<p>
	 *
	 */
	public static final String $first_gr_dt_to = "first_gr_dt_to";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public static final String $insp_schd_no = "insp_schd_no";
	/**
	 * Remarks (Lot) 備考（ロット）.<p>
	 *
	 */
	public static final String $lot_rmrks = "lot_rmrks";
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public static final String $insp_cnt_rmrks = "insp_cnt_rmrks";
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
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_nm = $itm_typ_p + ".itm_typ_nm";
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

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta today_META = createCommonMeta($today, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rem_stk_vld_pd_META = createNumberMeta($rem_stk_vld_pd, 6, 0, true);
	public static final MCMeta rem_stk_vld_pd_typ_META = createStringMeta($rem_stk_vld_pd_typ);
	public static final MCMeta trg_stk_vld_dt_META = createCommonMeta($trg_stk_vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rem_stk_lmt_pd_META = createNumberMeta($rem_stk_lmt_pd, 6, 0, true);
	public static final MCMeta rem_stk_lmt_pd_typ_META = createStringMeta($rem_stk_lmt_pd_typ);
	public static final MCMeta trg_stk_lmt_dt_META = createCommonMeta($trg_stk_lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta unreg_lmt_flg_META = createCommonMeta($unreg_lmt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_mrp_use_dt_flg_META = createCommonMeta($disp_mrp_use_dt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta first_gr_dt_fr_META = createCommonMeta($first_gr_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_gr_dt_to_META = createCommonMeta($first_gr_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta insp_schd_no_META = createCommonMeta($insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta insp_cnt_rmrks_META = createCommonMeta($insp_cnt_rmrks, mcframe.commonMS.meta.MS_META.INSP_CNT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INSP_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INSP_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INSP_SCHD_SUB_CHAR3);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			today_META,
			wg_cd_META,
			wg_nm_META,
			loc_cd_META,
			loc_nm_META,
			rem_stk_vld_pd_META,
			rem_stk_vld_pd_typ_META,
			trg_stk_vld_dt_META,
			rem_stk_lmt_pd_META,
			rem_stk_lmt_pd_typ_META,
			trg_stk_lmt_dt_META,
			itm_typ_p_META,
			unreg_lmt_flg_META,
			disp_mrp_use_dt_flg_META,
			itm_p_META,
			ver_no_META,
			lot_no_META,
			sublot_no_META,
			quality_typ_META,
			quality_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			sno_wrk_no_p_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			first_gr_dt_fr_META,
			first_gr_dt_to_META,
			str_ln_cd_META,
			str_ln_nm_META,
			insp_schd_no_META,
			lot_rmrks_META,
			insp_cnt_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"itm_typ",
				"itm_typ_nm",
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
				$itm_typ,
				$itm_typ_nm,
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
				{$pack_unit_cd, "unit_nm"}	// pack_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// loc_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$str_ln_cd, "loc_cd;true"}	// str_ln_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$loc_cd, "loc_is_srch_typ"},	// loc_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$str_ln_cd, "loc_cd;mode_nullval_flg"}	// str_ln_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$ver_no, "VER_NO"},	// ver_no
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"}	// str_ln_nm
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
	 * LMT_UP,Create schedule for re-inspection for expiration;INSP_SCHD,Create schedule for re-inspection for inventory;DEL_LMT_UP,Cancel schedule for re-inspection for expiration;DEL_INSP_SCHD,Cancel schedule for re-inspection for inventory LMT_UP,期限再検査予定を登録する;INSP_SCHD,在庫再検査予定を登録する;DEL_LMT_UP,期限再検査予定を取り消す;DEL_INSP_SCHD,在庫再検査予定を取り消す.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * LMT_UP,Create schedule for re-inspection for expiration;INSP_SCHD,Create schedule for re-inspection for inventory;DEL_LMT_UP,Cancel schedule for re-inspection for expiration;DEL_INSP_SCHD,Cancel schedule for re-inspection for inventory LMT_UP,期限再検査予定を登録する;INSP_SCHD,在庫再検査予定を登録する;DEL_LMT_UP,期限再検査予定を取り消す;DEL_INSP_SCHD,在庫再検査予定を取り消す.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Current date 現在日付.<p>
	 *
	 */
	public MCDate today() {
		return getConstDate(offset + 1, $today);
	}

	/**
	 * Current date 現在日付.<p>
	 *
	 */
	public void today(MCDate value) {
		setConstDate(offset + 1, $today, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 3, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 3, $wg_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 4, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 4, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 5, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 5, $loc_nm, value);
	}


	/**
	 * Remaining expiration date 残有効期限.<p>
	 *
	 */
	public MCNumber rem_stk_vld_pd() {
		return getConstNumber(offset + 6, $rem_stk_vld_pd);
	}

	/**
	 * Remaining expiration date 残有効期限.<p>
	 *
	 */
	public void rem_stk_vld_pd(MCNumber value) {
		setConstNumber(offset + 6, $rem_stk_vld_pd, value);
	}

	/**
	 * Remaining expiration date 残有効期限.<p>
	 *
	 */
	public void rem_stk_vld_pd(int value) {
		setConstNumber(offset + 6, $rem_stk_vld_pd, value);
	}

	/**
	 * Remaining expiration date 残有効期限.<p>
	 *
	 */
	public void rem_stk_vld_pd(long value) {
		setConstNumber(offset + 6, $rem_stk_vld_pd, value);
	}

	/**
	 * Remaining expiration date 残有効期限.<p>
	 *
	 */
	public void rem_stk_vld_pd(float value) {
		setConstNumber(offset + 6, $rem_stk_vld_pd, value);
	}

	/**
	 * Remaining expiration date 残有効期限.<p>
	 *
	 */
	public void rem_stk_vld_pd(double value) {
		setConstNumber(offset + 6, $rem_stk_vld_pd, value);
	}


	/**
	 * 0,Month;1,Date 0,月;1,日.<p>
	 *
	 */
	public String rem_stk_vld_pd_typ() {
		return getConstString(offset + 7, $rem_stk_vld_pd_typ);
	}

	/**
	 * 0,Month;1,Date 0,月;1,日.<p>
	 *
	 */
	public void rem_stk_vld_pd_typ(String value) {
		setConstString(offset + 7, $rem_stk_vld_pd_typ, value);
	}


	/**
	 * Target date (Expiration date) 対象年月日(有効期限）.<p>
	 *
	 */
	public MCDate trg_stk_vld_dt() {
		return getConstDate(offset + 8, $trg_stk_vld_dt);
	}

	/**
	 * Target date (Expiration date) 対象年月日(有効期限）.<p>
	 *
	 */
	public void trg_stk_vld_dt(MCDate value) {
		setConstDate(offset + 8, $trg_stk_vld_dt, value);
	}


	/**
	 * Remaining usage expiration date 残使用期限.<p>
	 *
	 */
	public MCNumber rem_stk_lmt_pd() {
		return getConstNumber(offset + 9, $rem_stk_lmt_pd);
	}

	/**
	 * Remaining usage expiration date 残使用期限.<p>
	 *
	 */
	public void rem_stk_lmt_pd(MCNumber value) {
		setConstNumber(offset + 9, $rem_stk_lmt_pd, value);
	}

	/**
	 * Remaining usage expiration date 残使用期限.<p>
	 *
	 */
	public void rem_stk_lmt_pd(int value) {
		setConstNumber(offset + 9, $rem_stk_lmt_pd, value);
	}

	/**
	 * Remaining usage expiration date 残使用期限.<p>
	 *
	 */
	public void rem_stk_lmt_pd(long value) {
		setConstNumber(offset + 9, $rem_stk_lmt_pd, value);
	}

	/**
	 * Remaining usage expiration date 残使用期限.<p>
	 *
	 */
	public void rem_stk_lmt_pd(float value) {
		setConstNumber(offset + 9, $rem_stk_lmt_pd, value);
	}

	/**
	 * Remaining usage expiration date 残使用期限.<p>
	 *
	 */
	public void rem_stk_lmt_pd(double value) {
		setConstNumber(offset + 9, $rem_stk_lmt_pd, value);
	}


	/**
	 * 0,Month;1,Date 0,月;1,日.<p>
	 *
	 */
	public String rem_stk_lmt_pd_typ() {
		return getConstString(offset + 10, $rem_stk_lmt_pd_typ);
	}

	/**
	 * 0,Month;1,Date 0,月;1,日.<p>
	 *
	 */
	public void rem_stk_lmt_pd_typ(String value) {
		setConstString(offset + 10, $rem_stk_lmt_pd_typ, value);
	}


	/**
	 * Target date (Usage expiration date) 対象年月日(使用期限).<p>
	 *
	 */
	public MCDate trg_stk_lmt_dt() {
		return getConstDate(offset + 11, $trg_stk_lmt_dt);
	}

	/**
	 * Target date (Usage expiration date) 対象年月日(使用期限).<p>
	 *
	 */
	public void trg_stk_lmt_dt(MCDate value) {
		setConstDate(offset + 11, $trg_stk_lmt_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 12, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 12, $itm_typ_p, row);
	}


	/**
	 * Without expiration only 期限未設定のみ.<p>
	 *
	 */
	public boolean unreg_lmt_flg() {
		return getConstBoolean(offset + 13, $unreg_lmt_flg);
	}

	/**
	 * Without expiration only 期限未設定のみ.<p>
	 *
	 */
	public void unreg_lmt_flg(boolean value) {
		setConstBoolean(offset + 13, $unreg_lmt_flg, value);
	}


	/**
	 * Display scheduled date to use 使用予定日表示.<p>
	 *
	 */
	public boolean disp_mrp_use_dt_flg() {
		return getConstBoolean(offset + 14, $disp_mrp_use_dt_flg);
	}

	/**
	 * Display scheduled date to use 使用予定日表示.<p>
	 *
	 */
	public void disp_mrp_use_dt_flg(boolean value) {
		setConstBoolean(offset + 14, $disp_mrp_use_dt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 15, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 15, $itm_p, row);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 16, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 16, $ver_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 17, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 17, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 18, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 18, $sublot_no, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 19, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 19, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 20, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 20, $quality_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 21, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 21, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 22, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 22, $gd_nm, value);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 23, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 23, $sno_wrk_no_p, row);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 24, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 24, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 25, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 25, $stk_id_typ_nm, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 26, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 26, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 27, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 27, $pack_unit_nm, value);
	}


	/**
	 * Oldest GR date FROM 最古入庫日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate first_gr_dt_fr() {
		return getConstDate(offset + 28, $first_gr_dt_fr);
	}

	/**
	 * Oldest GR date FROM 最古入庫日ＦＲＯＭ.<p>
	 *
	 */
	public void first_gr_dt_fr(MCDate value) {
		setConstDate(offset + 28, $first_gr_dt_fr, value);
	}


	/**
	 * Oldest GR date TO 最古入庫日ＴＯ.<p>
	 *
	 */
	public MCDate first_gr_dt_to() {
		return getConstDate(offset + 29, $first_gr_dt_to);
	}

	/**
	 * Oldest GR date TO 最古入庫日ＴＯ.<p>
	 *
	 */
	public void first_gr_dt_to(MCDate value) {
		setConstDate(offset + 29, $first_gr_dt_to, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 30, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 30, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 31, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 31, $str_ln_nm, value);
	}


	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public String insp_schd_no() {
		return getConstString(offset + 32, $insp_schd_no);
	}

	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public void insp_schd_no(String value) {
		setConstString(offset + 32, $insp_schd_no, value);
	}


	/**
	 * Remarks (Lot) 備考（ロット）.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 33, $lot_rmrks);
	}

	/**
	 * Remarks (Lot) 備考（ロット）.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 33, $lot_rmrks, value);
	}


	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return getConstString(offset + 34, $insp_cnt_rmrks);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		setConstString(offset + 34, $insp_cnt_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 35, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 35, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 36, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 36, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 37, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 37, $sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 38, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 38, $itm_grp_p, row);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($rem_stk_vld_pd_typ.equalsIgnoreCase(name)) {
			return rem_stk_vld_pd_typ();
		}
		if ($rem_stk_lmt_pd_typ.equalsIgnoreCase(name)) {
			return rem_stk_lmt_pd_typ();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
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
		if ($rem_stk_vld_pd.equalsIgnoreCase(name)) {
			return rem_stk_vld_pd();
		}
		if ($rem_stk_lmt_pd.equalsIgnoreCase(name)) {
			return rem_stk_lmt_pd();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($today.equalsIgnoreCase(name)) {
			return today();
		}
		if ($trg_stk_vld_dt.equalsIgnoreCase(name)) {
			return trg_stk_vld_dt();
		}
		if ($trg_stk_lmt_dt.equalsIgnoreCase(name)) {
			return trg_stk_lmt_dt();
		}
		if ($first_gr_dt_fr.equalsIgnoreCase(name)) {
			return first_gr_dt_fr();
		}
		if ($first_gr_dt_to.equalsIgnoreCase(name)) {
			return first_gr_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			return unreg_lmt_flg();
		}
		if ($disp_mrp_use_dt_flg.equalsIgnoreCase(name)) {
			return disp_mrp_use_dt_flg();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($rem_stk_vld_pd_typ.equalsIgnoreCase(name)) {
			return rem_stk_vld_pd_typ();
		}
		if ($rem_stk_lmt_pd_typ.equalsIgnoreCase(name)) {
			return rem_stk_lmt_pd_typ();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
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
		if ($rem_stk_vld_pd.equalsIgnoreCase(name)) {
			return rem_stk_vld_pd();
		}
		if ($rem_stk_lmt_pd.equalsIgnoreCase(name)) {
			return rem_stk_lmt_pd();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($today.equalsIgnoreCase(name)) {
			return today();
		}
		if ($trg_stk_vld_dt.equalsIgnoreCase(name)) {
			return trg_stk_vld_dt();
		}
		if ($trg_stk_lmt_dt.equalsIgnoreCase(name)) {
			return trg_stk_lmt_dt();
		}
		if ($first_gr_dt_fr.equalsIgnoreCase(name)) {
			return first_gr_dt_fr();
		}
		if ($first_gr_dt_to.equalsIgnoreCase(name)) {
			return first_gr_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			return unreg_lmt_flg();
		}
		if ($disp_mrp_use_dt_flg.equalsIgnoreCase(name)) {
			return disp_mrp_use_dt_flg();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($rem_stk_vld_pd_typ.equalsIgnoreCase(name)) {
			rem_stk_vld_pd_typ(value);
			return;
		}
		if ($rem_stk_lmt_pd_typ.equalsIgnoreCase(name)) {
			rem_stk_lmt_pd_typ(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
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
		if ($rem_stk_vld_pd.equalsIgnoreCase(name)) {
			rem_stk_vld_pd(value);
			return;
		}
		if ($rem_stk_lmt_pd.equalsIgnoreCase(name)) {
			rem_stk_lmt_pd(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rem_stk_vld_pd.equalsIgnoreCase(name)) {
			rem_stk_vld_pd(value);
			return;
		}
		if ($rem_stk_lmt_pd.equalsIgnoreCase(name)) {
			rem_stk_lmt_pd(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rem_stk_vld_pd.equalsIgnoreCase(name)) {
			rem_stk_vld_pd(value);
			return;
		}
		if ($rem_stk_lmt_pd.equalsIgnoreCase(name)) {
			rem_stk_lmt_pd(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rem_stk_vld_pd.equalsIgnoreCase(name)) {
			rem_stk_vld_pd(value);
			return;
		}
		if ($rem_stk_lmt_pd.equalsIgnoreCase(name)) {
			rem_stk_lmt_pd(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rem_stk_vld_pd.equalsIgnoreCase(name)) {
			rem_stk_vld_pd(value);
			return;
		}
		if ($rem_stk_lmt_pd.equalsIgnoreCase(name)) {
			rem_stk_lmt_pd(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($today.equalsIgnoreCase(name)) {
			today(value);
			return;
		}
		if ($trg_stk_vld_dt.equalsIgnoreCase(name)) {
			trg_stk_vld_dt(value);
			return;
		}
		if ($trg_stk_lmt_dt.equalsIgnoreCase(name)) {
			trg_stk_lmt_dt(value);
			return;
		}
		if ($first_gr_dt_fr.equalsIgnoreCase(name)) {
			first_gr_dt_fr(value);
			return;
		}
		if ($first_gr_dt_to.equalsIgnoreCase(name)) {
			first_gr_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			unreg_lmt_flg(value);
			return;
		}
		if ($disp_mrp_use_dt_flg.equalsIgnoreCase(name)) {
			disp_mrp_use_dt_flg(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($rem_stk_vld_pd_typ.equalsIgnoreCase(name)) {
			rem_stk_vld_pd_typ(value);
			return;
		}
		if ($rem_stk_lmt_pd_typ.equalsIgnoreCase(name)) {
			rem_stk_lmt_pd_typ(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
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
		if ($rem_stk_vld_pd.equalsIgnoreCase(name)) {
			rem_stk_vld_pd(value);
			return;
		}
		if ($rem_stk_lmt_pd.equalsIgnoreCase(name)) {
			rem_stk_lmt_pd(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rem_stk_vld_pd.equalsIgnoreCase(name)) {
			rem_stk_vld_pd(value);
			return;
		}
		if ($rem_stk_lmt_pd.equalsIgnoreCase(name)) {
			rem_stk_lmt_pd(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rem_stk_vld_pd.equalsIgnoreCase(name)) {
			rem_stk_vld_pd(value);
			return;
		}
		if ($rem_stk_lmt_pd.equalsIgnoreCase(name)) {
			rem_stk_lmt_pd(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rem_stk_vld_pd.equalsIgnoreCase(name)) {
			rem_stk_vld_pd(value);
			return;
		}
		if ($rem_stk_lmt_pd.equalsIgnoreCase(name)) {
			rem_stk_lmt_pd(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rem_stk_vld_pd.equalsIgnoreCase(name)) {
			rem_stk_vld_pd(value);
			return;
		}
		if ($rem_stk_lmt_pd.equalsIgnoreCase(name)) {
			rem_stk_lmt_pd(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($today.equalsIgnoreCase(name)) {
			today(value);
			return;
		}
		if ($trg_stk_vld_dt.equalsIgnoreCase(name)) {
			trg_stk_vld_dt(value);
			return;
		}
		if ($trg_stk_lmt_dt.equalsIgnoreCase(name)) {
			trg_stk_lmt_dt(value);
			return;
		}
		if ($first_gr_dt_fr.equalsIgnoreCase(name)) {
			first_gr_dt_fr(value);
			return;
		}
		if ($first_gr_dt_to.equalsIgnoreCase(name)) {
			first_gr_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			unreg_lmt_flg(value);
			return;
		}
		if ($disp_mrp_use_dt_flg.equalsIgnoreCase(name)) {
			disp_mrp_use_dt_flg(value);
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
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
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

	/**
	 * Item classification selection 1 品目分類選択１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return itm_grp_p().itm_grp_flg1();
	}

	/**
	 * Item classification selection 1 品目分類選択１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		itm_grp_p().itm_grp_flg1(value);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return itm_grp_p().itm_grp_cd1();
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		itm_grp_p().itm_grp_cd1(value);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return itm_grp_p().itm_grp_nm1();
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		itm_grp_p().itm_grp_nm1(value);
	}

	/**
	 * Item classification selection 2 品目分類選択２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return itm_grp_p().itm_grp_flg2();
	}

	/**
	 * Item classification selection 2 品目分類選択２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		itm_grp_p().itm_grp_flg2(value);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return itm_grp_p().itm_grp_cd2();
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		itm_grp_p().itm_grp_cd2(value);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return itm_grp_p().itm_grp_nm2();
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		itm_grp_p().itm_grp_nm2(value);
	}

	/**
	 * Item classification selection 3 品目分類選択３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return itm_grp_p().itm_grp_flg3();
	}

	/**
	 * Item classification selection 3 品目分類選択３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		itm_grp_p().itm_grp_flg3(value);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return itm_grp_p().itm_grp_cd3();
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		itm_grp_p().itm_grp_cd3(value);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return itm_grp_p().itm_grp_nm3();
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		itm_grp_p().itm_grp_nm3(value);
	}

	/**
	 * Item classification selection 4 品目分類選択４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return itm_grp_p().itm_grp_flg4();
	}

	/**
	 * Item classification selection 4 品目分類選択４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		itm_grp_p().itm_grp_flg4(value);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return itm_grp_p().itm_grp_cd4();
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		itm_grp_p().itm_grp_cd4(value);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return itm_grp_p().itm_grp_nm4();
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		itm_grp_p().itm_grp_nm4(value);
	}

	/**
	 * Item classification selection 5 品目分類選択５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return itm_grp_p().itm_grp_flg5();
	}

	/**
	 * Item classification selection 5 品目分類選択５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		itm_grp_p().itm_grp_flg5(value);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return itm_grp_p().itm_grp_cd5();
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		itm_grp_p().itm_grp_cd5(value);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return itm_grp_p().itm_grp_nm5();
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		itm_grp_p().itm_grp_nm5(value);
	}

	/**
	 * Item classification selection 6 品目分類選択６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return itm_grp_p().itm_grp_flg6();
	}

	/**
	 * Item classification selection 6 品目分類選択６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		itm_grp_p().itm_grp_flg6(value);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return itm_grp_p().itm_grp_cd6();
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		itm_grp_p().itm_grp_cd6(value);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return itm_grp_p().itm_grp_nm6();
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		itm_grp_p().itm_grp_nm6(value);
	}

	/**
	 * Item classification selection 7 品目分類選択７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return itm_grp_p().itm_grp_flg7();
	}

	/**
	 * Item classification selection 7 品目分類選択７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		itm_grp_p().itm_grp_flg7(value);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return itm_grp_p().itm_grp_cd7();
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		itm_grp_p().itm_grp_cd7(value);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return itm_grp_p().itm_grp_nm7();
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		itm_grp_p().itm_grp_nm7(value);
	}

	/**
	 * Item classification selection 8 品目分類選択８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return itm_grp_p().itm_grp_flg8();
	}

	/**
	 * Item classification selection 8 品目分類選択８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		itm_grp_p().itm_grp_flg8(value);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return itm_grp_p().itm_grp_cd8();
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		itm_grp_p().itm_grp_cd8(value);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return itm_grp_p().itm_grp_nm8();
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		itm_grp_p().itm_grp_nm8(value);
	}

	/**
	 * Item classification selection 9 品目分類選択９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return itm_grp_p().itm_grp_flg9();
	}

	/**
	 * Item classification selection 9 品目分類選択９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		itm_grp_p().itm_grp_flg9(value);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return itm_grp_p().itm_grp_cd9();
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		itm_grp_p().itm_grp_cd9(value);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return itm_grp_p().itm_grp_nm9();
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		itm_grp_p().itm_grp_nm9(value);
	}

	/**
	 * Item classification selection 10 品目分類選択１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return itm_grp_p().itm_grp_flg10();
	}

	/**
	 * Item classification selection 10 品目分類選択１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		itm_grp_p().itm_grp_flg10(value);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return itm_grp_p().itm_grp_cd10();
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		itm_grp_p().itm_grp_cd10(value);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return itm_grp_p().itm_grp_nm10();
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		itm_grp_p().itm_grp_nm10(value);
	}

}

