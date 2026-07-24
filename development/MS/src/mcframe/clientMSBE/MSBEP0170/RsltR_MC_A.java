package mcframe.clientMSBE.MSBEP0170;

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
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	public static final String $itm_p = "itm_p";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	/**
	 * Replenishment method type 補充方法区分.<p>
	 *
	 */
	public static final String $op_rpl_mtd_typ = "op_rpl_mtd_typ";
	/**
	 * Replenishment method type name 補充方法区分名.<p>
	 *
	 */
	public static final String $op_rpl_mtd_typ_nm = "op_rpl_mtd_typ_nm";
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
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_sppl_cd = "mfg_loc_sppl_cd";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
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
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public static final String $rqst_loc_cd = "rqst_loc_cd";
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public static final String $rqst_loc_nm = "rqst_loc_nm";
	/**
	 * For requested rack/line 依頼先棚・ライン対象.<p>
	 *
	 */
	public static final String $rqst_str_ln_tgt_flg = "rqst_str_ln_tgt_flg";
	public static final String $str_ln_p = "str_ln_p";
	public static final String $gr_schd_qty_p = "gr_schd_qty_p";
	public static final String $stk_qty_p = "stk_qty_p";
	public static final String $gi_schd_qty_p = "gi_schd_qty_p";
	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public static final String $gi_schd_flg = "gi_schd_flg";
	public static final String $rord_stk_qty_p = "rord_stk_qty_p";
	public static final String $shortage_qty_p = "shortage_qty_p";
	public static final String $rord_rqst_qty_p = "rord_rqst_qty_p";
	public static final String $rqst_qty_p = "rqst_qty_p";
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public static final String $st_schd_dt = "st_schd_dt";
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public static final String $end_schd_dt = "end_schd_dt";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	public static final String $ver_no_p = "ver_no_p";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public static final String $inst_po_cnt_rmrks = "inst_po_cnt_rmrks";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	public static final String $gr_schd_cont_qty_p = "gr_schd_cont_qty_p";
	public static final String $stk_cont_qty_p = "stk_cont_qty_p";
	public static final String $gi_schd_cont_qty_p = "gi_schd_cont_qty_p";
	public static final String $shortage_cont_qty_p = "shortage_cont_qty_p";
	public static final String $cont_fctr_unit_p = "cont_fctr_unit_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Storage factory/distribution warehouse cd. 格納工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $strg_site_cd = "strg_site_cd";
	/**
	 * Storage factory/distribution warehouse name 格納工場・物流倉庫名.<p>
	 *
	 */
	public static final String $strg_site_nm = "strg_site_nm";
	/**
	 * Storage distribution group cd. 格納物流グループＣＤ.<p>
	 *
	 */
	public static final String $strg_lg_grp_cd = "strg_lg_grp_cd";
	/**
	 * Storage distribution group name 格納物流グループ名.<p>
	 *
	 */
	public static final String $strg_lg_grp_nm = "strg_lg_grp_nm";
	/**
	 * Storage WG cd. 格納ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $strg_wg_cd = "strg_wg_cd";
	/**
	 * Storage WG name 格納ワーキンググループ名.<p>
	 *
	 */
	public static final String $strg_wg_nm = "strg_wg_nm";
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_wg_nm = "rqst_wg_nm";
	/**
	 * Shortage 不足.<p>
	 *
	 */
	public static final String $shortage_flg = "shortage_flg";
	public static final String $rts_msg_p = "rts_msg_p";
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	public static final String $strg_sppl_cd = "strg_sppl_cd";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $rqst_str_ln_cd = $str_ln_p + ".str_ln_cd";
	public static final String $rqst_str_ln_nm = $str_ln_p + ".str_ln_nm";
	public static final String $rqst_str_ln_cd_none_flg = $str_ln_p + ".str_ln_cd_none_flg";
	public static final String $gr_schd_qty = $gr_schd_qty_p + ".qty";
	public static final String $stk_qty = $stk_qty_p + ".qty";
	public static final String $gi_schd_qty = $gi_schd_qty_p + ".qty";
	public static final String $rord_stk_qty = $rord_stk_qty_p + ".qty";
	public static final String $shortage_qty = $shortage_qty_p + ".qty";
	public static final String $rord_rqst_qty = $rord_rqst_qty_p + ".qty";
	public static final String $rqst_qty = $rqst_qty_p + ".qty";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $gr_schd_cont_qty = $gr_schd_cont_qty_p + ".cont_qty";
	public static final String $stk_cont_qty = $stk_cont_qty_p + ".cont_qty";
	public static final String $gi_schd_cont_qty = $gi_schd_cont_qty_p + ".cont_qty";
	public static final String $shortage_cont_qty = $shortage_cont_qty_p + ".cont_qty";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_p + ".cont_fctr_unit_nm";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta op_rpl_mtd_typ_META = createCommonMeta($op_rpl_mtd_typ, mcframe.commonMS.meta.MS_META.OP_RPL_MTD_TYP);
	public static final MCMeta op_rpl_mtd_typ_nm_META = createCommonMeta($op_rpl_mtd_typ_nm, mcframe.commonMS.meta.MS_META.OP_RPL_MTD_TYP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_loc_sppl_cd_META = createCommonMeta($mfg_loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_loc_nm_META = createCommonMeta($rqst_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_str_ln_tgt_flg_META = createCommonMeta($rqst_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_p_META = createInnerRowMeta($str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta gr_schd_qty_p_META = createInnerRowMeta($gr_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta stk_qty_p_META = createInnerRowMeta($stk_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gi_schd_qty_p_META = createInnerRowMeta($gi_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gi_schd_flg_META = createCommonMeta($gi_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rord_stk_qty_p_META = createInnerRowMeta($rord_stk_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta shortage_qty_p_META = createInnerRowMeta($shortage_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta rord_rqst_qty_p_META = createInnerRowMeta($rord_rqst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta rqst_qty_p_META = createInnerRowMeta($rqst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta st_schd_dt_META = createCommonMeta($st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_schd_dt_META = createCommonMeta($end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta inst_po_cnt_rmrks_META = createCommonMeta($inst_po_cnt_rmrks, mcframe.commonMS.meta.MS_META.INST_PO_CNT_RMRKS);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_schd_cont_qty_p_META = createInnerRowMeta($gr_schd_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta stk_cont_qty_p_META = createInnerRowMeta($stk_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta gi_schd_cont_qty_p_META = createInnerRowMeta($gi_schd_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta shortage_cont_qty_p_META = createInnerRowMeta($shortage_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_fctr_unit_p_META = createInnerRowMeta($cont_fctr_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta strg_site_cd_META = createCommonMeta($strg_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta strg_site_nm_META = createCommonMeta($strg_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta strg_lg_grp_cd_META = createCommonMeta($strg_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta strg_lg_grp_nm_META = createCommonMeta($strg_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta strg_wg_cd_META = createCommonMeta($strg_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta strg_wg_nm_META = createCommonMeta($strg_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta shortage_flg_META = createCommonMeta($shortage_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta strg_sppl_cd_META = createCommonMeta($strg_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			itm_p_META,
			asset_mng_typ_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			op_rpl_mtd_typ_META,
			op_rpl_mtd_typ_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			mfg_loc_sppl_cd_META,
			bom_ptn_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			rqst_loc_cd_META,
			rqst_loc_nm_META,
			rqst_str_ln_tgt_flg_META,
			str_ln_p_META,
			gr_schd_qty_p_META,
			stk_qty_p_META,
			gi_schd_qty_p_META,
			gi_schd_flg_META,
			rord_stk_qty_p_META,
			shortage_qty_p_META,
			rord_rqst_qty_p_META,
			rqst_qty_p_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			st_schd_dt_META,
			end_schd_dt_META,
			ver_flg_META,
			ver_no_p_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			sno_wrk_no_p_META,
			inst_po_cnt_rmrks_META,
			cont_fctr_flg_META,
			gr_schd_cont_qty_p_META,
			stk_cont_qty_p_META,
			gi_schd_cont_qty_p_META,
			shortage_cont_qty_p_META,
			cont_fctr_unit_p_META,
			std_cont_fctr_p_META,
			cont_fctr_dec_place_META,
			strg_site_cd_META,
			strg_site_nm_META,
			strg_lg_grp_cd_META,
			strg_lg_grp_nm_META,
			strg_wg_cd_META,
			strg_wg_nm_META,
			rqst_wg_cd_META,
			rqst_wg_nm_META,
			shortage_flg_META,
			rts_msg_p_META,
			master_dt_META,
			strg_sppl_cd_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"rqst_str_ln_cd",
				"rqst_str_ln_nm",
				"rqst_str_ln_cd_none_flg",
				"gr_schd_qty",
				"stk_qty",
				"gi_schd_qty",
				"rord_stk_qty",
				"shortage_qty",
				"rord_rqst_qty",
				"rqst_qty",
				"ver_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"gr_schd_cont_qty",
				"stk_cont_qty",
				"gi_schd_cont_qty",
				"shortage_cont_qty",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"std_cont_fctr",
				"rtn_sts_typ"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$rqst_str_ln_cd,
				$rqst_str_ln_nm,
				$rqst_str_ln_cd_none_flg,
				$gr_schd_qty,
				$stk_qty,
				$gi_schd_qty,
				$rord_stk_qty,
				$shortage_qty,
				$rord_rqst_qty,
				$rqst_qty,
				$ver_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$gr_schd_cont_qty,
				$stk_cont_qty,
				$gi_schd_cont_qty,
				$shortage_cont_qty,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$std_cont_fctr,
				$rtn_sts_typ
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
				{$mfg_loc_cd, "mfg_loc_nm;sppl_cd"},	// mfg_loc_cd
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$maker_cd, "bp_nm;rqst_wg_cd;rqst_wg_nm"},	// maker_cd
				{$rqst_loc_cd, "loc_nm;str_ln_tgt_flg;wg_cd;wg_nm"},	// rqst_loc_cd
				{$rqst_wg_cd, "wg_nm"}	// rqst_wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$mfg_loc_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;strg_wg_cd"},	// mfg_loc_cd
				{$bom_ptn, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;strg_wg_cd;mfg_loc_cd"},	// bom_ptn
				{$sppl_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;itm_nm;strg_wg_cd;strg_wg_nm;true;true;asset_mng_typ"},	// sppl_cd
				{$maker_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;itm_nm;strg_wg_cd;strg_wg_nm;sppl_cd;true;true;true;asset_mng_typ"},	// maker_cd
				{$ver_no_p + ".ver_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;strg_site_cd"},	// ver_no_p.ver_no
				{$rqst_wg_cd, "true"}	// rqst_wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$mfg_loc_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd"},	// mfg_loc_cd
				{$bom_ptn, "dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;mfg_loc_cd"},	// bom_ptn
				{$sppl_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;itm_nm;wg_cd;wg_nm;sppl_flg;manual_sppl_flg;asset_mng_typ"},	// sppl_cd
				{$maker_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;itm_nm;wg_cd;wg_nm;sppl_cd;mode_nullval_flg;maker_flg;manual_sppl_flg;asset_mng_typ"},	// maker_cd
				{$ver_no_p + ".ver_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;site_cd"},	// ver_no_p.ver_no
				{$rqst_wg_cd, "wr_flg"}	// rqst_wg_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$rqst_str_ln_tgt_flg, "STR_LN"},	// rqst_str_ln_tgt_flg
				{$strg_site_cd, "SITE"},	// strg_site_cd
				{$strg_site_nm, "SITE"},	// strg_site_nm
				{$strg_lg_grp_cd, "LG_GRP"},	// strg_lg_grp_cd
				{$strg_lg_grp_nm, "LG_GRP"},	// strg_lg_grp_nm
				{$strg_wg_cd, "WG"},	// strg_wg_cd
				{$strg_wg_nm, "WG"},	// strg_wg_nm
				{$rqst_wg_cd, "WG"},	// rqst_wg_cd
				{$rqst_wg_nm, "WG"}	// rqst_wg_nm
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
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 1, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 1, $itm_p, row);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 2, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 2, $asset_mng_typ, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 3, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 3, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 4, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 4, $strg_loc_nm, value);
	}


	/**
	 * Replenishment method type 補充方法区分.<p>
	 *
	 */
	public String op_rpl_mtd_typ() {
		return getConstString(offset + 5, $op_rpl_mtd_typ);
	}

	/**
	 * Replenishment method type 補充方法区分.<p>
	 *
	 */
	public void op_rpl_mtd_typ(String value) {
		setConstString(offset + 5, $op_rpl_mtd_typ, value);
	}


	/**
	 * Replenishment method type name 補充方法区分名.<p>
	 *
	 */
	public String op_rpl_mtd_typ_nm() {
		return getConstString(offset + 6, $op_rpl_mtd_typ_nm);
	}

	/**
	 * Replenishment method type name 補充方法区分名.<p>
	 *
	 */
	public void op_rpl_mtd_typ_nm(String value) {
		setConstString(offset + 6, $op_rpl_mtd_typ_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 7, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 7, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 8, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 8, $mfg_loc_nm, value);
	}


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String mfg_loc_sppl_cd() {
		return getConstString(offset + 9, $mfg_loc_sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void mfg_loc_sppl_cd(String value) {
		setConstString(offset + 9, $mfg_loc_sppl_cd, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 10, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 10, $bom_ptn, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 11, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 11, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 12, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 12, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 13, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 13, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 14, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 14, $maker_nm, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 15, $rqst_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 15, $rqst_loc_cd, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 16, $rqst_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 16, $rqst_loc_nm, value);
	}


	/**
	 * For requested rack/line 依頼先棚・ライン対象.<p>
	 *
	 */
	public boolean rqst_str_ln_tgt_flg() {
		return getConstBoolean(offset + 17, $rqst_str_ln_tgt_flg);
	}

	/**
	 * For requested rack/line 依頼先棚・ライン対象.<p>
	 *
	 */
	public void rqst_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 17, $rqst_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 18, $str_ln_p);
	}
	
	public void str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 18, $str_ln_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gr_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 19, $gr_schd_qty_p);
	}
	
	public void gr_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 19, $gr_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR stk_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 20, $stk_qty_p);
	}
	
	public void stk_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 20, $stk_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR gi_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 21, $gi_schd_qty_p);
	}
	
	public void gi_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 21, $gi_schd_qty_p, row);
	}


	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public boolean gi_schd_flg() {
		return getConstBoolean(offset + 22, $gi_schd_flg);
	}

	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public void gi_schd_flg(boolean value) {
		setConstBoolean(offset + 22, $gi_schd_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR rord_stk_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 23, $rord_stk_qty_p);
	}
	
	public void rord_stk_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 23, $rord_stk_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR shortage_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 24, $shortage_qty_p);
	}
	
	public void shortage_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 24, $shortage_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR rord_rqst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 25, $rord_rqst_qty_p);
	}
	
	public void rord_rqst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 25, $rord_rqst_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR rqst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 26, $rqst_qty_p);
	}
	
	public void rqst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 26, $rqst_qty_p, row);
	}


	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 27, $unit_cd);
	}

	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 27, $unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 28, $unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 28, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 29, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 29, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 29, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 29, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 29, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 29, $dec_place, value);
	}


	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public MCDate st_schd_dt() {
		return getConstDate(offset + 30, $st_schd_dt);
	}

	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public void st_schd_dt(MCDate value) {
		setConstDate(offset + 30, $st_schd_dt, value);
	}


	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate end_schd_dt() {
		return getConstDate(offset + 31, $end_schd_dt);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void end_schd_dt(MCDate value) {
		setConstDate(offset + 31, $end_schd_dt, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 32, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 32, $ver_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 33, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 33, $ver_no_p, row);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 34, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 34, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 35, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 35, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 36, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 36, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 37, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 37, $sno4_mng_typ, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 38, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 38, $sno_wrk_no_p, row);
	}


	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return getConstString(offset + 39, $inst_po_cnt_rmrks);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		setConstString(offset + 39, $inst_po_cnt_rmrks, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 40, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 40, $cont_fctr_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR gr_schd_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 41, $gr_schd_cont_qty_p);
	}
	
	public void gr_schd_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 41, $gr_schd_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR stk_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 42, $stk_cont_qty_p);
	}
	
	public void stk_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 42, $stk_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR gi_schd_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 43, $gi_schd_cont_qty_p);
	}
	
	public void gi_schd_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 43, $gi_schd_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR shortage_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 44, $shortage_cont_qty_p);
	}
	
	public void shortage_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 44, $shortage_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_fctr_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 45, $cont_fctr_unit_p);
	}
	
	public void cont_fctr_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 45, $cont_fctr_unit_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 46, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 46, $std_cont_fctr_p, row);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 47, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 47, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 47, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 47, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 47, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 47, $cont_fctr_dec_place, value);
	}


	/**
	 * Storage factory/distribution warehouse cd. 格納工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String strg_site_cd() {
		return getConstString(offset + 48, $strg_site_cd);
	}

	/**
	 * Storage factory/distribution warehouse cd. 格納工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void strg_site_cd(String value) {
		setConstString(offset + 48, $strg_site_cd, value);
	}


	/**
	 * Storage factory/distribution warehouse name 格納工場・物流倉庫名.<p>
	 *
	 */
	public String strg_site_nm() {
		return getConstString(offset + 49, $strg_site_nm);
	}

	/**
	 * Storage factory/distribution warehouse name 格納工場・物流倉庫名.<p>
	 *
	 */
	public void strg_site_nm(String value) {
		setConstString(offset + 49, $strg_site_nm, value);
	}


	/**
	 * Storage distribution group cd. 格納物流グループＣＤ.<p>
	 *
	 */
	public String strg_lg_grp_cd() {
		return getConstString(offset + 50, $strg_lg_grp_cd);
	}

	/**
	 * Storage distribution group cd. 格納物流グループＣＤ.<p>
	 *
	 */
	public void strg_lg_grp_cd(String value) {
		setConstString(offset + 50, $strg_lg_grp_cd, value);
	}


	/**
	 * Storage distribution group name 格納物流グループ名.<p>
	 *
	 */
	public String strg_lg_grp_nm() {
		return getConstString(offset + 51, $strg_lg_grp_nm);
	}

	/**
	 * Storage distribution group name 格納物流グループ名.<p>
	 *
	 */
	public void strg_lg_grp_nm(String value) {
		setConstString(offset + 51, $strg_lg_grp_nm, value);
	}


	/**
	 * Storage WG cd. 格納ワーキンググループＣＤ.<p>
	 *
	 */
	public String strg_wg_cd() {
		return getConstString(offset + 52, $strg_wg_cd);
	}

	/**
	 * Storage WG cd. 格納ワーキンググループＣＤ.<p>
	 *
	 */
	public void strg_wg_cd(String value) {
		setConstString(offset + 52, $strg_wg_cd, value);
	}


	/**
	 * Storage WG name 格納ワーキンググループ名.<p>
	 *
	 */
	public String strg_wg_nm() {
		return getConstString(offset + 53, $strg_wg_nm);
	}

	/**
	 * Storage WG name 格納ワーキンググループ名.<p>
	 *
	 */
	public void strg_wg_nm(String value) {
		setConstString(offset + 53, $strg_wg_nm, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 54, $rqst_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 54, $rqst_wg_cd, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 55, $rqst_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 55, $rqst_wg_nm, value);
	}


	/**
	 * Shortage 不足.<p>
	 *
	 */
	public boolean shortage_flg() {
		return getConstBoolean(offset + 56, $shortage_flg);
	}

	/**
	 * Shortage 不足.<p>
	 *
	 */
	public void shortage_flg(boolean value) {
		setConstBoolean(offset + 56, $shortage_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 57, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 57, $rts_msg_p, row);
	}


	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 58, $master_dt);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 58, $master_dt, value);
	}


	public String strg_sppl_cd() {
		return getConstString(offset + 59, $strg_sppl_cd);
	}

	public void strg_sppl_cd(String value) {
		setConstString(offset + 59, $strg_sppl_cd, value);
	}


	public String getString(String name) {
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($op_rpl_mtd_typ.equalsIgnoreCase(name)) {
			return op_rpl_mtd_typ();
		}
		if ($op_rpl_mtd_typ_nm.equalsIgnoreCase(name)) {
			return op_rpl_mtd_typ_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			return mfg_loc_sppl_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			return strg_site_cd();
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			return strg_site_nm();
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			return strg_lg_grp_cd();
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			return strg_lg_grp_nm();
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			return strg_wg_cd();
		}
		if ($strg_wg_nm.equalsIgnoreCase(name)) {
			return strg_wg_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			return strg_sppl_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			return st_schd_dt();
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			return end_schd_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($rqst_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return rqst_str_ln_tgt_flg();
		}
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			return gi_schd_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($shortage_flg.equalsIgnoreCase(name)) {
			return shortage_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($op_rpl_mtd_typ.equalsIgnoreCase(name)) {
			return op_rpl_mtd_typ();
		}
		if ($op_rpl_mtd_typ_nm.equalsIgnoreCase(name)) {
			return op_rpl_mtd_typ_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			return mfg_loc_sppl_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			return strg_site_cd();
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			return strg_site_nm();
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			return strg_lg_grp_cd();
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			return strg_lg_grp_nm();
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			return strg_wg_cd();
		}
		if ($strg_wg_nm.equalsIgnoreCase(name)) {
			return strg_wg_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			return strg_sppl_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			return st_schd_dt();
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			return end_schd_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($rqst_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return rqst_str_ln_tgt_flg();
		}
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			return gi_schd_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($shortage_flg.equalsIgnoreCase(name)) {
			return shortage_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($op_rpl_mtd_typ.equalsIgnoreCase(name)) {
			op_rpl_mtd_typ(value);
			return;
		}
		if ($op_rpl_mtd_typ_nm.equalsIgnoreCase(name)) {
			op_rpl_mtd_typ_nm(value);
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
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			mfg_loc_sppl_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
			return;
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			strg_site_cd(value);
			return;
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			strg_site_nm(value);
			return;
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			strg_lg_grp_cd(value);
			return;
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			strg_lg_grp_nm(value);
			return;
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			strg_wg_cd(value);
			return;
		}
		if ($strg_wg_nm.equalsIgnoreCase(name)) {
			strg_wg_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			strg_sppl_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			st_schd_dt(value);
			return;
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			end_schd_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($rqst_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			rqst_str_ln_tgt_flg(value);
			return;
		}
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			gi_schd_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($shortage_flg.equalsIgnoreCase(name)) {
			shortage_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($op_rpl_mtd_typ.equalsIgnoreCase(name)) {
			op_rpl_mtd_typ(value);
			return;
		}
		if ($op_rpl_mtd_typ_nm.equalsIgnoreCase(name)) {
			op_rpl_mtd_typ_nm(value);
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
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			mfg_loc_sppl_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
			return;
		}
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			strg_site_cd(value);
			return;
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			strg_site_nm(value);
			return;
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			strg_lg_grp_cd(value);
			return;
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			strg_lg_grp_nm(value);
			return;
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			strg_wg_cd(value);
			return;
		}
		if ($strg_wg_nm.equalsIgnoreCase(name)) {
			strg_wg_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			strg_sppl_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			st_schd_dt(value);
			return;
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			end_schd_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($rqst_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			rqst_str_ln_tgt_flg(value);
			return;
		}
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			gi_schd_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($shortage_flg.equalsIgnoreCase(name)) {
			shortage_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($str_ln_p.equalsIgnoreCase(name)) {
			return str_ln_p();
		}
		if ($gr_schd_qty_p.equalsIgnoreCase(name)) {
			return gr_schd_qty_p();
		}
		if ($stk_qty_p.equalsIgnoreCase(name)) {
			return stk_qty_p();
		}
		if ($gi_schd_qty_p.equalsIgnoreCase(name)) {
			return gi_schd_qty_p();
		}
		if ($rord_stk_qty_p.equalsIgnoreCase(name)) {
			return rord_stk_qty_p();
		}
		if ($shortage_qty_p.equalsIgnoreCase(name)) {
			return shortage_qty_p();
		}
		if ($rord_rqst_qty_p.equalsIgnoreCase(name)) {
			return rord_rqst_qty_p();
		}
		if ($rqst_qty_p.equalsIgnoreCase(name)) {
			return rqst_qty_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($gr_schd_cont_qty_p.equalsIgnoreCase(name)) {
			return gr_schd_cont_qty_p();
		}
		if ($stk_cont_qty_p.equalsIgnoreCase(name)) {
			return stk_cont_qty_p();
		}
		if ($gi_schd_cont_qty_p.equalsIgnoreCase(name)) {
			return gi_schd_cont_qty_p();
		}
		if ($shortage_cont_qty_p.equalsIgnoreCase(name)) {
			return shortage_cont_qty_p();
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			return cont_fctr_unit_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
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
		if ($str_ln_p.equalsIgnoreCase(name)) {
			str_ln_p(
				((MCContainerMeta) str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($gr_schd_qty_p.equalsIgnoreCase(name)) {
			gr_schd_qty_p(
				((MCContainerMeta) gr_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($stk_qty_p.equalsIgnoreCase(name)) {
			stk_qty_p(
				((MCContainerMeta) stk_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($gi_schd_qty_p.equalsIgnoreCase(name)) {
			gi_schd_qty_p(
				((MCContainerMeta) gi_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rord_stk_qty_p.equalsIgnoreCase(name)) {
			rord_stk_qty_p(
				((MCContainerMeta) rord_stk_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($shortage_qty_p.equalsIgnoreCase(name)) {
			shortage_qty_p(
				((MCContainerMeta) shortage_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rord_rqst_qty_p.equalsIgnoreCase(name)) {
			rord_rqst_qty_p(
				((MCContainerMeta) rord_rqst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rqst_qty_p.equalsIgnoreCase(name)) {
			rqst_qty_p(
				((MCContainerMeta) rqst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($gr_schd_cont_qty_p.equalsIgnoreCase(name)) {
			gr_schd_cont_qty_p(
				((MCContainerMeta) gr_schd_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($stk_cont_qty_p.equalsIgnoreCase(name)) {
			stk_cont_qty_p(
				((MCContainerMeta) stk_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($gi_schd_cont_qty_p.equalsIgnoreCase(name)) {
			gi_schd_cont_qty_p(
				((MCContainerMeta) gi_schd_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($shortage_cont_qty_p.equalsIgnoreCase(name)) {
			shortage_cont_qty_p(
				((MCContainerMeta) shortage_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			cont_fctr_unit_p(
				((MCContainerMeta) cont_fctr_unit_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class, value)
			);
			return;
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
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

	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public String rqst_str_ln_cd() {
		return str_ln_p().str_ln_cd();
	}

	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public void rqst_str_ln_cd(String value) {
		str_ln_p().str_ln_cd(value);
	}

	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public String rqst_str_ln_nm() {
		return str_ln_p().str_ln_nm();
	}

	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public void rqst_str_ln_nm(String value) {
		str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without rack/line (Requested) 依頼先棚・ライン無.<p>
	 *
	 */
	public boolean rqst_str_ln_cd_none_flg() {
		return str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without rack/line (Requested) 依頼先棚・ライン無.<p>
	 *
	 */
	public void rqst_str_ln_cd_none_flg(boolean value) {
		str_ln_p().str_ln_cd_none_flg(value);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public MCNumber gr_schd_qty() {
		return gr_schd_qty_p().qty();
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(MCNumber value) {
		gr_schd_qty_p().qty(value);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(int value) {
		gr_schd_qty_p().qty(value);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(long value) {
		gr_schd_qty_p().qty(value);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(float value) {
		gr_schd_qty_p().qty(value);
	}

	/**
	 * GR scheduled qty. 入庫予定数量.<p>
	 *
	 */
	public void gr_schd_qty(double value) {
		gr_schd_qty_p().qty(value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public MCNumber stk_qty() {
		return stk_qty_p().qty();
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(MCNumber value) {
		stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(int value) {
		stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(long value) {
		stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(float value) {
		stk_qty_p().qty(value);
	}

	/**
	 * Inventory qty. 在庫数量.<p>
	 *
	 */
	public void stk_qty(double value) {
		stk_qty_p().qty(value);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public MCNumber gi_schd_qty() {
		return gi_schd_qty_p().qty();
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void gi_schd_qty(MCNumber value) {
		gi_schd_qty_p().qty(value);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void gi_schd_qty(int value) {
		gi_schd_qty_p().qty(value);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void gi_schd_qty(long value) {
		gi_schd_qty_p().qty(value);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void gi_schd_qty(float value) {
		gi_schd_qty_p().qty(value);
	}

	/**
	 * GI scheduled qty. 出庫予定数量.<p>
	 *
	 */
	public void gi_schd_qty(double value) {
		gi_schd_qty_p().qty(value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public MCNumber rord_stk_qty() {
		return rord_stk_qty_p().qty();
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(MCNumber value) {
		rord_stk_qty_p().qty(value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(int value) {
		rord_stk_qty_p().qty(value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(long value) {
		rord_stk_qty_p().qty(value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(float value) {
		rord_stk_qty_p().qty(value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(double value) {
		rord_stk_qty_p().qty(value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public MCNumber shortage_qty() {
		return shortage_qty_p().qty();
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(MCNumber value) {
		shortage_qty_p().qty(value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(int value) {
		shortage_qty_p().qty(value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(long value) {
		shortage_qty_p().qty(value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(float value) {
		shortage_qty_p().qty(value);
	}

	/**
	 * Insufficient qty. 不足数量.<p>
	 *
	 */
	public void shortage_qty(double value) {
		shortage_qty_p().qty(value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public MCNumber rord_rqst_qty() {
		return rord_rqst_qty_p().qty();
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(MCNumber value) {
		rord_rqst_qty_p().qty(value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(int value) {
		rord_rqst_qty_p().qty(value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(long value) {
		rord_rqst_qty_p().qty(value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(float value) {
		rord_rqst_qty_p().qty(value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(double value) {
		rord_rqst_qty_p().qty(value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public MCNumber rqst_qty() {
		return rqst_qty_p().qty();
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(MCNumber value) {
		rqst_qty_p().qty(value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(int value) {
		rqst_qty_p().qty(value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(long value) {
		rqst_qty_p().qty(value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(float value) {
		rqst_qty_p().qty(value);
	}

	/**
	 * Request qty. 依頼数量.<p>
	 *
	 */
	public void rqst_qty(double value) {
		rqst_qty_p().qty(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
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
	 * GR schedule active ingredient 入庫予定有効成分.<p>
	 *
	 */
	public MCNumber gr_schd_cont_qty() {
		return gr_schd_cont_qty_p().cont_qty();
	}

	/**
	 * GR schedule active ingredient 入庫予定有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(MCNumber value) {
		gr_schd_cont_qty_p().cont_qty(value);
	}

	/**
	 * GR schedule active ingredient 入庫予定有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(int value) {
		gr_schd_cont_qty_p().cont_qty(value);
	}

	/**
	 * GR schedule active ingredient 入庫予定有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(long value) {
		gr_schd_cont_qty_p().cont_qty(value);
	}

	/**
	 * GR schedule active ingredient 入庫予定有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(float value) {
		gr_schd_cont_qty_p().cont_qty(value);
	}

	/**
	 * GR schedule active ingredient 入庫予定有効成分.<p>
	 *
	 */
	public void gr_schd_cont_qty(double value) {
		gr_schd_cont_qty_p().cont_qty(value);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public MCNumber stk_cont_qty() {
		return stk_cont_qty_p().cont_qty();
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(MCNumber value) {
		stk_cont_qty_p().cont_qty(value);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(int value) {
		stk_cont_qty_p().cont_qty(value);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(long value) {
		stk_cont_qty_p().cont_qty(value);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(float value) {
		stk_cont_qty_p().cont_qty(value);
	}

	/**
	 * Inventory active ingredient 在庫有効成分.<p>
	 *
	 */
	public void stk_cont_qty(double value) {
		stk_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient of GI schedule 出庫予定有効成分.<p>
	 *
	 */
	public MCNumber gi_schd_cont_qty() {
		return gi_schd_cont_qty_p().cont_qty();
	}

	/**
	 * Active ingredient of GI schedule 出庫予定有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(MCNumber value) {
		gi_schd_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient of GI schedule 出庫予定有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(int value) {
		gi_schd_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient of GI schedule 出庫予定有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(long value) {
		gi_schd_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient of GI schedule 出庫予定有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(float value) {
		gi_schd_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient of GI schedule 出庫予定有効成分.<p>
	 *
	 */
	public void gi_schd_cont_qty(double value) {
		gi_schd_cont_qty_p().cont_qty(value);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public MCNumber shortage_cont_qty() {
		return shortage_cont_qty_p().cont_qty();
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(MCNumber value) {
		shortage_cont_qty_p().cont_qty(value);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(int value) {
		shortage_cont_qty_p().cont_qty(value);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(long value) {
		shortage_cont_qty_p().cont_qty(value);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(float value) {
		shortage_cont_qty_p().cont_qty(value);
	}

	/**
	 * Shortage of active ingredient 不足有効成分.<p>
	 *
	 */
	public void shortage_cont_qty(double value) {
		shortage_cont_qty_p().cont_qty(value);
	}

	public String cont_fctr_unit_cd() {
		return cont_fctr_unit_p().cont_fctr_unit_cd();
	}

	public void cont_fctr_unit_cd(String value) {
		cont_fctr_unit_p().cont_fctr_unit_cd(value);
	}

	public String cont_fctr_unit_nm() {
		return cont_fctr_unit_p().cont_fctr_unit_nm();
	}

	public void cont_fctr_unit_nm(String value) {
		cont_fctr_unit_p().cont_fctr_unit_nm(value);
	}

	public MCNumber std_cont_fctr() {
		return std_cont_fctr_p().std_cont_fctr();
	}

	public void std_cont_fctr(MCNumber value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(int value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(long value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(float value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(double value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

}

