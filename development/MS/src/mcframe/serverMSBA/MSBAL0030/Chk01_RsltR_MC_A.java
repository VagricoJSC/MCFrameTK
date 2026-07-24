package mcframe.serverMSBA.MSBAL0030;

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
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Demand No. 需要ＮＯ.<p>
	 *
	 */
	public static final String $dmnd_no = "dmnd_no";
	/**
	 * Demand date 需要日.<p>
	 *
	 */
	public static final String $dmnd_dt = "dmnd_dt";
	/**
	 * Demand period start date 需要期間開始日.<p>
	 *
	 */
	public static final String $dmnd_st_dt = "dmnd_st_dt";
	/**
	 * Demand period end date 需要期間終了日.<p>
	 *
	 */
	public static final String $dmnd_end_dt = "dmnd_end_dt";
	/**
	 * Delivery schedule period start date 納品予定期間開始日.<p>
	 *
	 */
	public static final String $dlv_schd_st_dt = "dlv_schd_st_dt";
	/**
	 * Delivery schedule period end date 納品予定期間終了日.<p>
	 *
	 */
	public static final String $dlv_schd_end_dt = "dlv_schd_end_dt";
	/**
	 * Demand period type 需要期間区分.<p>
	 *
	 */
	public static final String $dmnd_period_typ = "dmnd_period_typ";
	/**
	 * Demand period type name 需要期間区分名.<p>
	 *
	 */
	public static final String $dmnd_period_typ_nm = "dmnd_period_typ_nm";
	/**
	 * Demand type 需要区分.<p>
	 *
	 */
	public static final String $dmnd_typ = "dmnd_typ";
	/**
	 * Demand type name 需要区分名.<p>
	 *
	 */
	public static final String $dmnd_typ_nm = "dmnd_typ_nm";
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
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Entry qty. 登録数量.<p>
	 *
	 */
	public static final String $input_qty = "input_qty";
	/**
	 * Demand qty. 需要数量.<p>
	 *
	 */
	public static final String $dmnd_qty = "dmnd_qty";
	/**
	 * Matching qty. 消込数量.<p>
	 *
	 */
	public static final String $rec_qty = "rec_qty";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $dmnd_usr_cd = "dmnd_usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $dmnd_usr_nm = "dmnd_usr_nm";
	/**
	 * Demand source dept. cd. 需要元部門ＣＤ.<p>
	 *
	 */
	public static final String $dmnd_dpt_cd = "dmnd_dpt_cd";
	/**
	 * Demand source dept. name 需要元部門名.<p>
	 *
	 */
	public static final String $dmnd_dpt_nm = "dmnd_dpt_nm";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public static final String $dmnd_loc_cd = "dmnd_loc_cd";
	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public static final String $dmnd_loc_nm = "dmnd_loc_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $dmnd_loc_grp_cd = "dmnd_loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $dmnd_loc_grp_nm = "dmnd_loc_grp_nm";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $dmnd_lg_grp_cd = "dmnd_lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $dmnd_lg_grp_nm = "dmnd_lg_grp_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $dmnd_wg_cd = "dmnd_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $dmnd_wg_nm = "dmnd_wg_nm";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $dmnd_site_cd = "dmnd_site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $dmnd_site_nm = "dmnd_site_nm";
	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public static final String $to_lg_grp_cd = "to_lg_grp_cd";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public static final String $bp_ship_lt = "bp_ship_lt";
	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public static final String $xfr_lt = "xfr_lt";
	/**
	 * Without demand LT 需要情報ＬＴ無し.<p>
	 *
	 */
	public static final String $non_dmnd_lt_flg = "non_dmnd_lt_flg";
	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public static final String $ship_lt = "ship_lt";
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
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
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
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public static final String $dmnd_upd_cntr = "dmnd_upd_cntr";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta dmnd_no_META = createCommonMeta($dmnd_no, mcframe.commonMA.meta.MA_META.DMND_NO);
	public static final MCMeta dmnd_dt_META = createCommonMeta($dmnd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dmnd_st_dt_META = createCommonMeta($dmnd_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dmnd_end_dt_META = createCommonMeta($dmnd_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_schd_st_dt_META = createCommonMeta($dlv_schd_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_schd_end_dt_META = createCommonMeta($dlv_schd_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dmnd_period_typ_META = createCommonMeta($dmnd_period_typ, mcframe.commonMA.meta.MA_META.PERIOD_TYP);
	public static final MCMeta dmnd_period_typ_nm_META = createCommonMeta($dmnd_period_typ_nm, mcframe.commonMA.meta.MA_META.PERIOD_TYP_NM);
	public static final MCMeta dmnd_typ_META = createCommonMeta($dmnd_typ, mcframe.commonMS.meta.MS_META.DMND_TYP);
	public static final MCMeta dmnd_typ_nm_META = createCommonMeta($dmnd_typ_nm, mcframe.commonMS.meta.MS_META.DMND_TYP_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta input_qty_META = createCommonMeta($input_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dmnd_qty_META = createCommonMeta($dmnd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rec_qty_META = createCommonMeta($rec_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dmnd_usr_cd_META = createCommonMeta($dmnd_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta dmnd_usr_nm_META = createCommonMeta($dmnd_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta dmnd_dpt_cd_META = createCommonMeta($dmnd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dmnd_dpt_nm_META = createCommonMeta($dmnd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dmnd_loc_cd_META = createCommonMeta($dmnd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta dmnd_loc_nm_META = createCommonMeta($dmnd_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta dmnd_loc_grp_cd_META = createCommonMeta($dmnd_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta dmnd_loc_grp_nm_META = createCommonMeta($dmnd_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta dmnd_lg_grp_cd_META = createCommonMeta($dmnd_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dmnd_lg_grp_nm_META = createCommonMeta($dmnd_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta dmnd_wg_cd_META = createCommonMeta($dmnd_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dmnd_wg_nm_META = createCommonMeta($dmnd_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dmnd_site_cd_META = createCommonMeta($dmnd_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta dmnd_site_nm_META = createCommonMeta($dmnd_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta to_lg_grp_cd_META = createCommonMeta($to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta bp_ship_lt_META = createCommonMeta($bp_ship_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta xfr_lt_META = createCommonMeta($xfr_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta non_dmnd_lt_flg_META = createCommonMeta($non_dmnd_lt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_lt_META = createCommonMeta($ship_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.DMND_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR3);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta dmnd_upd_cntr_META = createCommonMeta($dmnd_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Chk01_RsltR> constMetas = new ConstMetaList<Chk01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			dmnd_no_META,
			dmnd_dt_META,
			dmnd_st_dt_META,
			dmnd_end_dt_META,
			dlv_schd_st_dt_META,
			dlv_schd_end_dt_META,
			dmnd_period_typ_META,
			dmnd_period_typ_nm_META,
			dmnd_typ_META,
			dmnd_typ_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			input_qty_META,
			dmnd_qty_META,
			rec_qty_META,
			dmnd_usr_cd_META,
			dmnd_usr_nm_META,
			dmnd_dpt_cd_META,
			dmnd_dpt_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			cst_cd_META,
			cst_nm_META,
			dmnd_loc_cd_META,
			dmnd_loc_nm_META,
			dmnd_loc_grp_cd_META,
			dmnd_loc_grp_nm_META,
			dmnd_lg_grp_cd_META,
			dmnd_lg_grp_nm_META,
			dmnd_wg_cd_META,
			dmnd_wg_nm_META,
			dmnd_site_cd_META,
			dmnd_site_nm_META,
			to_lg_grp_cd_META,
			ship_term_cd_META,
			bp_ship_lt_META,
			xfr_lt_META,
			non_dmnd_lt_flg_META,
			ship_lt_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			rtn_sts_typ_META,
			dmnd_upd_cntr_META
		},
		new String[][]{
			{
			},
			{
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
				{$dmnd_no, "E"}	// dmnd_no
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$itm_cd, "E"},	// itm_cd
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$input_qty, "E"},	// input_qty
				{$dmnd_dpt_cd, "E"},	// dmnd_dpt_cd
				{$dmnd_loc_cd, "E"}	// dmnd_loc_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$input_qty, "positive"}	// input_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$dmnd_qty, "0:"},	// dmnd_qty
				{$rec_qty, "0:"}	// rec_qty
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
				{$dmnd_no, "dmnd_no"}	// dmnd_no
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
				{$dmnd_dt, "dmnd_dt"},	// dmnd_dt
				{$dmnd_st_dt, "dmnd_dt"}	// dmnd_st_dt
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$dmnd_usr_cd, "MA.MAUAL0010.Usr"},	// dmnd_usr_cd
				{$dmnd_dpt_cd, "MA.MAUAL0010.Dpt"},	// dmnd_dpt_cd
				{$dlv_cd, "MA.MAUAL0010.Bp"},	// dlv_cd
				{$cst_cd, "MA.MAUAL0010.Bp"},	// cst_cd
				{$dmnd_loc_cd, "MS.MSUAL0030.DmndLoc"}	// dmnd_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_nm;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;base_unit_cd;base_unit_nm;base_unit_dec_place;ship_term_cd"},	// itm_sub3
				{$dmnd_usr_cd, "dmnd_usr_nm"},	// dmnd_usr_cd
				{$dmnd_dpt_cd, "dmnd_dpt_nm"},	// dmnd_dpt_cd
				{$dlv_cd, "dlv_nm;to_lg_grp_cd"},	// dlv_cd
				{$cst_cd, "cst_nm;bp_ship_lt"},	// cst_cd
				{$dmnd_loc_cd, "dmnd_loc_nm;dmnd_wg_cd;dmnd_wg_nm;dmnd_site_cd;dmnd_site_nm;dmnd_loc_grp_cd;dmnd_loc_grp_nm;dmnd_lg_grp_cd;dmnd_lg_grp_nm;dmnd_site_cd;dmnd_site_nm"}	// dmnd_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_nm;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;ship_term_cd"},	// itm_sub3
				{$dmnd_usr_cd, "usr_nm"},	// dmnd_usr_cd
				{$dmnd_dpt_cd, "dpt_nm"},	// dmnd_dpt_cd
				{$dlv_cd, "bp_nm;lg_grp_cd"},	// dlv_cd
				{$cst_cd, "bp_nm;ship_lt"},	// cst_cd
				{$dmnd_loc_cd, "loc_nm;wg_cd;wg_nm;site_cd;site_nm;loc_grp_cd;loc_grp_nm;lg_grp_cd;lg_grp_nm;site_cd;site_nm"}	// dmnd_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$dmnd_usr_cd, "dmnd_dt"},	// dmnd_usr_cd
				{$dmnd_dpt_cd, "dmnd_dt;MAC_DPT_IS_SRCH_TYP.SCE;dmnd_usr_cd"},	// dmnd_dpt_cd
				{$dlv_cd, "MAC_BP_IS_SRCH_TYP.DLV;true"},	// dlv_cd
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST;true"},	// cst_cd
				{$dmnd_loc_cd, "dlv_cd;dmnd_dpt_cd;dmnd_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// dmnd_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$dmnd_usr_cd, "dt"},	// dmnd_usr_cd
				{$dmnd_dpt_cd, "dt;dpt_is_srch_typ;usr_cd"},	// dmnd_dpt_cd
				{$dlv_cd, "bp_is_srch_typ;mode_nullval_flg"},	// dlv_cd
				{$cst_cd, "bp_is_srch_typ;mode_nullval_flg"},	// cst_cd
				{$dmnd_loc_cd, "dlv_cd;sls_dpt_cd;dt;itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// dmnd_loc_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$dmnd_period_typ, "MAC_PERIOD_TYP"},	// dmnd_period_typ
				{$dmnd_typ, "MSC_DMND_TYP"}	// dmnd_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$sno1, "E"},	// sno1
				{$sno2, "E"},	// sno2
				{$sno3, "E"},	// sno3
				{$sno4, "E"}	// sno4
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
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
	}


	/**
	 * Demand No. 需要ＮＯ.<p>
	 *
	 */
	public String dmnd_no() {
		return getConstString(offset + 3, $dmnd_no);
	}

	/**
	 * Demand No. 需要ＮＯ.<p>
	 *
	 */
	public void dmnd_no(String value) {
		setConstString(offset + 3, $dmnd_no, value);
	}


	/**
	 * Demand date 需要日.<p>
	 *
	 */
	public MCDate dmnd_dt() {
		return getConstDate(offset + 4, $dmnd_dt);
	}

	/**
	 * Demand date 需要日.<p>
	 *
	 */
	public void dmnd_dt(MCDate value) {
		setConstDate(offset + 4, $dmnd_dt, value);
	}


	/**
	 * Demand period start date 需要期間開始日.<p>
	 *
	 */
	public MCDate dmnd_st_dt() {
		return getConstDate(offset + 5, $dmnd_st_dt);
	}

	/**
	 * Demand period start date 需要期間開始日.<p>
	 *
	 */
	public void dmnd_st_dt(MCDate value) {
		setConstDate(offset + 5, $dmnd_st_dt, value);
	}


	/**
	 * Demand period end date 需要期間終了日.<p>
	 *
	 */
	public MCDate dmnd_end_dt() {
		return getConstDate(offset + 6, $dmnd_end_dt);
	}

	/**
	 * Demand period end date 需要期間終了日.<p>
	 *
	 */
	public void dmnd_end_dt(MCDate value) {
		setConstDate(offset + 6, $dmnd_end_dt, value);
	}


	/**
	 * Delivery schedule period start date 納品予定期間開始日.<p>
	 *
	 */
	public MCDate dlv_schd_st_dt() {
		return getConstDate(offset + 7, $dlv_schd_st_dt);
	}

	/**
	 * Delivery schedule period start date 納品予定期間開始日.<p>
	 *
	 */
	public void dlv_schd_st_dt(MCDate value) {
		setConstDate(offset + 7, $dlv_schd_st_dt, value);
	}


	/**
	 * Delivery schedule period end date 納品予定期間終了日.<p>
	 *
	 */
	public MCDate dlv_schd_end_dt() {
		return getConstDate(offset + 8, $dlv_schd_end_dt);
	}

	/**
	 * Delivery schedule period end date 納品予定期間終了日.<p>
	 *
	 */
	public void dlv_schd_end_dt(MCDate value) {
		setConstDate(offset + 8, $dlv_schd_end_dt, value);
	}


	/**
	 * Demand period type 需要期間区分.<p>
	 *
	 */
	public String dmnd_period_typ() {
		return getConstString(offset + 9, $dmnd_period_typ);
	}

	/**
	 * Demand period type 需要期間区分.<p>
	 *
	 */
	public void dmnd_period_typ(String value) {
		setConstString(offset + 9, $dmnd_period_typ, value);
	}


	/**
	 * Demand period type name 需要期間区分名.<p>
	 *
	 */
	public String dmnd_period_typ_nm() {
		return getConstString(offset + 10, $dmnd_period_typ_nm);
	}

	/**
	 * Demand period type name 需要期間区分名.<p>
	 *
	 */
	public void dmnd_period_typ_nm(String value) {
		setConstString(offset + 10, $dmnd_period_typ_nm, value);
	}


	/**
	 * Demand type 需要区分.<p>
	 *
	 */
	public String dmnd_typ() {
		return getConstString(offset + 11, $dmnd_typ);
	}

	/**
	 * Demand type 需要区分.<p>
	 *
	 */
	public void dmnd_typ(String value) {
		setConstString(offset + 11, $dmnd_typ, value);
	}


	/**
	 * Demand type name 需要区分名.<p>
	 *
	 */
	public String dmnd_typ_nm() {
		return getConstString(offset + 12, $dmnd_typ_nm);
	}

	/**
	 * Demand type name 需要区分名.<p>
	 *
	 */
	public void dmnd_typ_nm(String value) {
		setConstString(offset + 12, $dmnd_typ_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 13, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 13, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 14, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 14, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 15, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 15, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 16, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 16, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 17, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 17, $itm_nm, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 18, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 18, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 19, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 19, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 20, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 20, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 21, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 21, $sno4_mng_typ, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 22, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 22, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 23, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 23, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 24, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}


	/**
	 * Entry qty. 登録数量.<p>
	 *
	 */
	public MCNumber input_qty() {
		return getConstNumber(offset + 25, $input_qty);
	}

	/**
	 * Entry qty. 登録数量.<p>
	 *
	 */
	public void input_qty(MCNumber value) {
		setConstNumber(offset + 25, $input_qty, value);
	}

	/**
	 * Entry qty. 登録数量.<p>
	 *
	 */
	public void input_qty(int value) {
		setConstNumber(offset + 25, $input_qty, value);
	}

	/**
	 * Entry qty. 登録数量.<p>
	 *
	 */
	public void input_qty(long value) {
		setConstNumber(offset + 25, $input_qty, value);
	}

	/**
	 * Entry qty. 登録数量.<p>
	 *
	 */
	public void input_qty(float value) {
		setConstNumber(offset + 25, $input_qty, value);
	}

	/**
	 * Entry qty. 登録数量.<p>
	 *
	 */
	public void input_qty(double value) {
		setConstNumber(offset + 25, $input_qty, value);
	}


	/**
	 * Demand qty. 需要数量.<p>
	 *
	 */
	public MCNumber dmnd_qty() {
		return getConstNumber(offset + 26, $dmnd_qty);
	}

	/**
	 * Demand qty. 需要数量.<p>
	 *
	 */
	public void dmnd_qty(MCNumber value) {
		setConstNumber(offset + 26, $dmnd_qty, value);
	}

	/**
	 * Demand qty. 需要数量.<p>
	 *
	 */
	public void dmnd_qty(int value) {
		setConstNumber(offset + 26, $dmnd_qty, value);
	}

	/**
	 * Demand qty. 需要数量.<p>
	 *
	 */
	public void dmnd_qty(long value) {
		setConstNumber(offset + 26, $dmnd_qty, value);
	}

	/**
	 * Demand qty. 需要数量.<p>
	 *
	 */
	public void dmnd_qty(float value) {
		setConstNumber(offset + 26, $dmnd_qty, value);
	}

	/**
	 * Demand qty. 需要数量.<p>
	 *
	 */
	public void dmnd_qty(double value) {
		setConstNumber(offset + 26, $dmnd_qty, value);
	}


	/**
	 * Matching qty. 消込数量.<p>
	 *
	 */
	public MCNumber rec_qty() {
		return getConstNumber(offset + 27, $rec_qty);
	}

	/**
	 * Matching qty. 消込数量.<p>
	 *
	 */
	public void rec_qty(MCNumber value) {
		setConstNumber(offset + 27, $rec_qty, value);
	}

	/**
	 * Matching qty. 消込数量.<p>
	 *
	 */
	public void rec_qty(int value) {
		setConstNumber(offset + 27, $rec_qty, value);
	}

	/**
	 * Matching qty. 消込数量.<p>
	 *
	 */
	public void rec_qty(long value) {
		setConstNumber(offset + 27, $rec_qty, value);
	}

	/**
	 * Matching qty. 消込数量.<p>
	 *
	 */
	public void rec_qty(float value) {
		setConstNumber(offset + 27, $rec_qty, value);
	}

	/**
	 * Matching qty. 消込数量.<p>
	 *
	 */
	public void rec_qty(double value) {
		setConstNumber(offset + 27, $rec_qty, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String dmnd_usr_cd() {
		return getConstString(offset + 28, $dmnd_usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void dmnd_usr_cd(String value) {
		setConstString(offset + 28, $dmnd_usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String dmnd_usr_nm() {
		return getConstString(offset + 29, $dmnd_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void dmnd_usr_nm(String value) {
		setConstString(offset + 29, $dmnd_usr_nm, value);
	}


	/**
	 * Demand source dept. cd. 需要元部門ＣＤ.<p>
	 *
	 */
	public String dmnd_dpt_cd() {
		return getConstString(offset + 30, $dmnd_dpt_cd);
	}

	/**
	 * Demand source dept. cd. 需要元部門ＣＤ.<p>
	 *
	 */
	public void dmnd_dpt_cd(String value) {
		setConstString(offset + 30, $dmnd_dpt_cd, value);
	}


	/**
	 * Demand source dept. name 需要元部門名.<p>
	 *
	 */
	public String dmnd_dpt_nm() {
		return getConstString(offset + 31, $dmnd_dpt_nm);
	}

	/**
	 * Demand source dept. name 需要元部門名.<p>
	 *
	 */
	public void dmnd_dpt_nm(String value) {
		setConstString(offset + 31, $dmnd_dpt_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 32, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 32, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 33, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 33, $dlv_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 34, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 34, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 35, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 35, $cst_nm, value);
	}


	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public String dmnd_loc_cd() {
		return getConstString(offset + 36, $dmnd_loc_cd);
	}

	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public void dmnd_loc_cd(String value) {
		setConstString(offset + 36, $dmnd_loc_cd, value);
	}


	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public String dmnd_loc_nm() {
		return getConstString(offset + 37, $dmnd_loc_nm);
	}

	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public void dmnd_loc_nm(String value) {
		setConstString(offset + 37, $dmnd_loc_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String dmnd_loc_grp_cd() {
		return getConstString(offset + 38, $dmnd_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void dmnd_loc_grp_cd(String value) {
		setConstString(offset + 38, $dmnd_loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String dmnd_loc_grp_nm() {
		return getConstString(offset + 39, $dmnd_loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void dmnd_loc_grp_nm(String value) {
		setConstString(offset + 39, $dmnd_loc_grp_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String dmnd_lg_grp_cd() {
		return getConstString(offset + 40, $dmnd_lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void dmnd_lg_grp_cd(String value) {
		setConstString(offset + 40, $dmnd_lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String dmnd_lg_grp_nm() {
		return getConstString(offset + 41, $dmnd_lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void dmnd_lg_grp_nm(String value) {
		setConstString(offset + 41, $dmnd_lg_grp_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String dmnd_wg_cd() {
		return getConstString(offset + 42, $dmnd_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void dmnd_wg_cd(String value) {
		setConstString(offset + 42, $dmnd_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String dmnd_wg_nm() {
		return getConstString(offset + 43, $dmnd_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void dmnd_wg_nm(String value) {
		setConstString(offset + 43, $dmnd_wg_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String dmnd_site_cd() {
		return getConstString(offset + 44, $dmnd_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void dmnd_site_cd(String value) {
		setConstString(offset + 44, $dmnd_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String dmnd_site_nm() {
		return getConstString(offset + 45, $dmnd_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void dmnd_site_nm(String value) {
		setConstString(offset + 45, $dmnd_site_nm, value);
	}


	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public String to_lg_grp_cd() {
		return getConstString(offset + 46, $to_lg_grp_cd);
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public void to_lg_grp_cd(String value) {
		setConstString(offset + 46, $to_lg_grp_cd, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 47, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 47, $ship_term_cd, value);
	}


	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public MCNumber bp_ship_lt() {
		return getConstNumber(offset + 48, $bp_ship_lt);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void bp_ship_lt(MCNumber value) {
		setConstNumber(offset + 48, $bp_ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void bp_ship_lt(int value) {
		setConstNumber(offset + 48, $bp_ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void bp_ship_lt(long value) {
		setConstNumber(offset + 48, $bp_ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void bp_ship_lt(float value) {
		setConstNumber(offset + 48, $bp_ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void bp_ship_lt(double value) {
		setConstNumber(offset + 48, $bp_ship_lt, value);
	}


	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return getConstNumber(offset + 49, $xfr_lt);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		setConstNumber(offset + 49, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(int value) {
		setConstNumber(offset + 49, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(long value) {
		setConstNumber(offset + 49, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(float value) {
		setConstNumber(offset + 49, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(double value) {
		setConstNumber(offset + 49, $xfr_lt, value);
	}


	/**
	 * Without demand LT 需要情報ＬＴ無し.<p>
	 *
	 */
	public boolean non_dmnd_lt_flg() {
		return getConstBoolean(offset + 50, $non_dmnd_lt_flg);
	}

	/**
	 * Without demand LT 需要情報ＬＴ無し.<p>
	 *
	 */
	public void non_dmnd_lt_flg(boolean value) {
		setConstBoolean(offset + 50, $non_dmnd_lt_flg, value);
	}


	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public MCNumber ship_lt() {
		return getConstNumber(offset + 51, $ship_lt);
	}

	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public void ship_lt(MCNumber value) {
		setConstNumber(offset + 51, $ship_lt, value);
	}

	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public void ship_lt(int value) {
		setConstNumber(offset + 51, $ship_lt, value);
	}

	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public void ship_lt(long value) {
		setConstNumber(offset + 51, $ship_lt, value);
	}

	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public void ship_lt(float value) {
		setConstNumber(offset + 51, $ship_lt, value);
	}

	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public void ship_lt(double value) {
		setConstNumber(offset + 51, $ship_lt, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 52, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 52, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 53, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 53, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 54, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 54, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 55, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 55, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 56, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 56, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 57, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 57, $wrk_nm, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 58, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 58, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 59, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 59, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 60, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 60, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 61, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 61, $sub_char3, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 62, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 62, $rtn_sts_typ, value);
	}


	/**
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public MCNumber dmnd_upd_cntr() {
		return getConstNumber(offset + 63, $dmnd_upd_cntr);
	}

	/**
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public void dmnd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 63, $dmnd_upd_cntr, value);
	}

	/**
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public void dmnd_upd_cntr(int value) {
		setConstNumber(offset + 63, $dmnd_upd_cntr, value);
	}

	/**
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public void dmnd_upd_cntr(long value) {
		setConstNumber(offset + 63, $dmnd_upd_cntr, value);
	}

	/**
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public void dmnd_upd_cntr(float value) {
		setConstNumber(offset + 63, $dmnd_upd_cntr, value);
	}

	/**
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public void dmnd_upd_cntr(double value) {
		setConstNumber(offset + 63, $dmnd_upd_cntr, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($dmnd_no.equalsIgnoreCase(name)) {
			return dmnd_no();
		}
		if ($dmnd_period_typ.equalsIgnoreCase(name)) {
			return dmnd_period_typ();
		}
		if ($dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			return dmnd_period_typ_nm();
		}
		if ($dmnd_typ.equalsIgnoreCase(name)) {
			return dmnd_typ();
		}
		if ($dmnd_typ_nm.equalsIgnoreCase(name)) {
			return dmnd_typ_nm();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($dmnd_usr_cd.equalsIgnoreCase(name)) {
			return dmnd_usr_cd();
		}
		if ($dmnd_usr_nm.equalsIgnoreCase(name)) {
			return dmnd_usr_nm();
		}
		if ($dmnd_dpt_cd.equalsIgnoreCase(name)) {
			return dmnd_dpt_cd();
		}
		if ($dmnd_dpt_nm.equalsIgnoreCase(name)) {
			return dmnd_dpt_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_cd();
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			return dmnd_loc_nm();
		}
		if ($dmnd_loc_grp_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_grp_cd();
		}
		if ($dmnd_loc_grp_nm.equalsIgnoreCase(name)) {
			return dmnd_loc_grp_nm();
		}
		if ($dmnd_lg_grp_cd.equalsIgnoreCase(name)) {
			return dmnd_lg_grp_cd();
		}
		if ($dmnd_lg_grp_nm.equalsIgnoreCase(name)) {
			return dmnd_lg_grp_nm();
		}
		if ($dmnd_wg_cd.equalsIgnoreCase(name)) {
			return dmnd_wg_cd();
		}
		if ($dmnd_wg_nm.equalsIgnoreCase(name)) {
			return dmnd_wg_nm();
		}
		if ($dmnd_site_cd.equalsIgnoreCase(name)) {
			return dmnd_site_cd();
		}
		if ($dmnd_site_nm.equalsIgnoreCase(name)) {
			return dmnd_site_nm();
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			return to_lg_grp_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			return input_qty();
		}
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			return dmnd_qty();
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			return rec_qty();
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			return bp_ship_lt();
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			return ship_lt();
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			return dmnd_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dmnd_dt.equalsIgnoreCase(name)) {
			return dmnd_dt();
		}
		if ($dmnd_st_dt.equalsIgnoreCase(name)) {
			return dmnd_st_dt();
		}
		if ($dmnd_end_dt.equalsIgnoreCase(name)) {
			return dmnd_end_dt();
		}
		if ($dlv_schd_st_dt.equalsIgnoreCase(name)) {
			return dlv_schd_st_dt();
		}
		if ($dlv_schd_end_dt.equalsIgnoreCase(name)) {
			return dlv_schd_end_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			return non_dmnd_lt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($dmnd_no.equalsIgnoreCase(name)) {
			return dmnd_no();
		}
		if ($dmnd_period_typ.equalsIgnoreCase(name)) {
			return dmnd_period_typ();
		}
		if ($dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			return dmnd_period_typ_nm();
		}
		if ($dmnd_typ.equalsIgnoreCase(name)) {
			return dmnd_typ();
		}
		if ($dmnd_typ_nm.equalsIgnoreCase(name)) {
			return dmnd_typ_nm();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($dmnd_usr_cd.equalsIgnoreCase(name)) {
			return dmnd_usr_cd();
		}
		if ($dmnd_usr_nm.equalsIgnoreCase(name)) {
			return dmnd_usr_nm();
		}
		if ($dmnd_dpt_cd.equalsIgnoreCase(name)) {
			return dmnd_dpt_cd();
		}
		if ($dmnd_dpt_nm.equalsIgnoreCase(name)) {
			return dmnd_dpt_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_cd();
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			return dmnd_loc_nm();
		}
		if ($dmnd_loc_grp_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_grp_cd();
		}
		if ($dmnd_loc_grp_nm.equalsIgnoreCase(name)) {
			return dmnd_loc_grp_nm();
		}
		if ($dmnd_lg_grp_cd.equalsIgnoreCase(name)) {
			return dmnd_lg_grp_cd();
		}
		if ($dmnd_lg_grp_nm.equalsIgnoreCase(name)) {
			return dmnd_lg_grp_nm();
		}
		if ($dmnd_wg_cd.equalsIgnoreCase(name)) {
			return dmnd_wg_cd();
		}
		if ($dmnd_wg_nm.equalsIgnoreCase(name)) {
			return dmnd_wg_nm();
		}
		if ($dmnd_site_cd.equalsIgnoreCase(name)) {
			return dmnd_site_cd();
		}
		if ($dmnd_site_nm.equalsIgnoreCase(name)) {
			return dmnd_site_nm();
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			return to_lg_grp_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			return input_qty();
		}
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			return dmnd_qty();
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			return rec_qty();
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			return bp_ship_lt();
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			return ship_lt();
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			return dmnd_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dmnd_dt.equalsIgnoreCase(name)) {
			return dmnd_dt();
		}
		if ($dmnd_st_dt.equalsIgnoreCase(name)) {
			return dmnd_st_dt();
		}
		if ($dmnd_end_dt.equalsIgnoreCase(name)) {
			return dmnd_end_dt();
		}
		if ($dlv_schd_st_dt.equalsIgnoreCase(name)) {
			return dlv_schd_st_dt();
		}
		if ($dlv_schd_end_dt.equalsIgnoreCase(name)) {
			return dlv_schd_end_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			return non_dmnd_lt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($dmnd_no.equalsIgnoreCase(name)) {
			dmnd_no(value);
			return;
		}
		if ($dmnd_period_typ.equalsIgnoreCase(name)) {
			dmnd_period_typ(value);
			return;
		}
		if ($dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			dmnd_period_typ_nm(value);
			return;
		}
		if ($dmnd_typ.equalsIgnoreCase(name)) {
			dmnd_typ(value);
			return;
		}
		if ($dmnd_typ_nm.equalsIgnoreCase(name)) {
			dmnd_typ_nm(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($dmnd_usr_cd.equalsIgnoreCase(name)) {
			dmnd_usr_cd(value);
			return;
		}
		if ($dmnd_usr_nm.equalsIgnoreCase(name)) {
			dmnd_usr_nm(value);
			return;
		}
		if ($dmnd_dpt_cd.equalsIgnoreCase(name)) {
			dmnd_dpt_cd(value);
			return;
		}
		if ($dmnd_dpt_nm.equalsIgnoreCase(name)) {
			dmnd_dpt_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			dmnd_loc_cd(value);
			return;
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			dmnd_loc_nm(value);
			return;
		}
		if ($dmnd_loc_grp_cd.equalsIgnoreCase(name)) {
			dmnd_loc_grp_cd(value);
			return;
		}
		if ($dmnd_loc_grp_nm.equalsIgnoreCase(name)) {
			dmnd_loc_grp_nm(value);
			return;
		}
		if ($dmnd_lg_grp_cd.equalsIgnoreCase(name)) {
			dmnd_lg_grp_cd(value);
			return;
		}
		if ($dmnd_lg_grp_nm.equalsIgnoreCase(name)) {
			dmnd_lg_grp_nm(value);
			return;
		}
		if ($dmnd_wg_cd.equalsIgnoreCase(name)) {
			dmnd_wg_cd(value);
			return;
		}
		if ($dmnd_wg_nm.equalsIgnoreCase(name)) {
			dmnd_wg_nm(value);
			return;
		}
		if ($dmnd_site_cd.equalsIgnoreCase(name)) {
			dmnd_site_cd(value);
			return;
		}
		if ($dmnd_site_nm.equalsIgnoreCase(name)) {
			dmnd_site_nm(value);
			return;
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			to_lg_grp_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dmnd_dt.equalsIgnoreCase(name)) {
			dmnd_dt(value);
			return;
		}
		if ($dmnd_st_dt.equalsIgnoreCase(name)) {
			dmnd_st_dt(value);
			return;
		}
		if ($dmnd_end_dt.equalsIgnoreCase(name)) {
			dmnd_end_dt(value);
			return;
		}
		if ($dlv_schd_st_dt.equalsIgnoreCase(name)) {
			dlv_schd_st_dt(value);
			return;
		}
		if ($dlv_schd_end_dt.equalsIgnoreCase(name)) {
			dlv_schd_end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			non_dmnd_lt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($dmnd_no.equalsIgnoreCase(name)) {
			dmnd_no(value);
			return;
		}
		if ($dmnd_period_typ.equalsIgnoreCase(name)) {
			dmnd_period_typ(value);
			return;
		}
		if ($dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			dmnd_period_typ_nm(value);
			return;
		}
		if ($dmnd_typ.equalsIgnoreCase(name)) {
			dmnd_typ(value);
			return;
		}
		if ($dmnd_typ_nm.equalsIgnoreCase(name)) {
			dmnd_typ_nm(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($dmnd_usr_cd.equalsIgnoreCase(name)) {
			dmnd_usr_cd(value);
			return;
		}
		if ($dmnd_usr_nm.equalsIgnoreCase(name)) {
			dmnd_usr_nm(value);
			return;
		}
		if ($dmnd_dpt_cd.equalsIgnoreCase(name)) {
			dmnd_dpt_cd(value);
			return;
		}
		if ($dmnd_dpt_nm.equalsIgnoreCase(name)) {
			dmnd_dpt_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			dmnd_loc_cd(value);
			return;
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			dmnd_loc_nm(value);
			return;
		}
		if ($dmnd_loc_grp_cd.equalsIgnoreCase(name)) {
			dmnd_loc_grp_cd(value);
			return;
		}
		if ($dmnd_loc_grp_nm.equalsIgnoreCase(name)) {
			dmnd_loc_grp_nm(value);
			return;
		}
		if ($dmnd_lg_grp_cd.equalsIgnoreCase(name)) {
			dmnd_lg_grp_cd(value);
			return;
		}
		if ($dmnd_lg_grp_nm.equalsIgnoreCase(name)) {
			dmnd_lg_grp_nm(value);
			return;
		}
		if ($dmnd_wg_cd.equalsIgnoreCase(name)) {
			dmnd_wg_cd(value);
			return;
		}
		if ($dmnd_wg_nm.equalsIgnoreCase(name)) {
			dmnd_wg_nm(value);
			return;
		}
		if ($dmnd_site_cd.equalsIgnoreCase(name)) {
			dmnd_site_cd(value);
			return;
		}
		if ($dmnd_site_nm.equalsIgnoreCase(name)) {
			dmnd_site_nm(value);
			return;
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			to_lg_grp_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dmnd_dt.equalsIgnoreCase(name)) {
			dmnd_dt(value);
			return;
		}
		if ($dmnd_st_dt.equalsIgnoreCase(name)) {
			dmnd_st_dt(value);
			return;
		}
		if ($dmnd_end_dt.equalsIgnoreCase(name)) {
			dmnd_end_dt(value);
			return;
		}
		if ($dlv_schd_st_dt.equalsIgnoreCase(name)) {
			dlv_schd_st_dt(value);
			return;
		}
		if ($dlv_schd_end_dt.equalsIgnoreCase(name)) {
			dlv_schd_end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			non_dmnd_lt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

