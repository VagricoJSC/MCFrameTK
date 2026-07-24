package mcframe.serverMSBF.MSBFL0100;

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
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public static final String $mrkt_judg_no = "mrkt_judg_no";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
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
	 * Notification name 届出名.<p>
	 *
	 */
	public static final String $ntfy_nm = "ntfy_nm";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Shipping point factory/distribution warehouse name 出荷元工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Update date 更新日.<p>
	 *
	 */
	public static final String $upd_dt = "upd_dt";
	/**
	 * Updater cd. 更新者ＣＤ.<p>
	 *
	 */
	public static final String $mrkt_upd_usr_cd = "mrkt_upd_usr_cd";
	/**
	 * Update user name 更新者名.<p>
	 *
	 */
	public static final String $mrkt_upd_usr_nm = "mrkt_upd_usr_nm";
	/**
	 * Update dept. cd. 更新部門ＣＤ.<p>
	 *
	 */
	public static final String $mrkt_upd_dpt_cd = "mrkt_upd_dpt_cd";
	/**
	 * Update dept. name 更新部門名.<p>
	 *
	 */
	public static final String $mrkt_upd_dpt_nm = "mrkt_upd_dpt_nm";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Remarks 特記事項.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Shipping approval result from mfg. site 製造所からの出荷承認結果.<p>
	 *
	 */
	public static final String $mfg_so_aprv_typ = "mfg_so_aprv_typ";
	/**
	 * Shipping approval result name from mfg. site 製造所からの出荷承認結果名.<p>
	 *
	 */
	public static final String $mfg_so_aprv_typ_nm = "mfg_so_aprv_typ_nm";
	/**
	 * Inspection result 品質管理結果.<p>
	 *
	 */
	public static final String $quality_mng_typ = "quality_mng_typ";
	/**
	 * Inspection result name 品質管理結果名.<p>
	 *
	 */
	public static final String $quality_mng_typ_nm = "quality_mng_typ_nm";
	/**
	 * Mfg. management result 製造管理結果.<p>
	 *
	 */
	public static final String $mfg_mng_typ = "mfg_mng_typ";
	/**
	 * Mfg. management result name 製造管理結果名.<p>
	 *
	 */
	public static final String $mfg_mng_typ_nm = "mfg_mng_typ_nm";
	/**
	 * Existence of deviation 逸脱有無.<p>
	 *
	 */
	public static final String $deviant_typ = "deviant_typ";
	/**
	 * Existence of deviation name 逸脱有無名.<p>
	 *
	 */
	public static final String $deviant_typ_nm = "deviant_typ_nm";
	/**
	 * Deviation measure 逸脱措置.<p>
	 *
	 */
	public static final String $deviant_msr_typ = "deviant_msr_typ";
	/**
	 * Deviation measure name 逸脱措置名.<p>
	 *
	 */
	public static final String $deviant_msr_typ_nm = "deviant_msr_typ_nm";
	/**
	 * Product info. of quality/validity/safety 製品の品質・有効性・安全性の情報.<p>
	 *
	 */
	public static final String $prod_itm_info_typ = "prod_itm_info_typ";
	/**
	 * Product info. name of quality/validity/safety 製品の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public static final String $prod_itm_info_typ_nm = "prod_itm_info_typ_nm";
	/**
	 * Raw material quality/validity/safety info. 原材料の品質・有効性・安全性の情報.<p>
	 *
	 */
	public static final String $chd_itm_info_typ = "chd_itm_info_typ";
	/**
	 * Raw material quality/validity/safety info. name 原材料の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public static final String $chd_itm_info_typ_nm = "chd_itm_info_typ_nm";
	/**
	 * Creation source cancel not possible 作成元取消不可.<p>
	 *
	 */
	public static final String $no_del_flg = "no_del_flg";
	/**
	 * Add 追加.<p>
	 *
	 */
	public static final String $add_flg = "add_flg";
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
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ = "mrkt_judg_sts_typ";
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ_nm = "mrkt_judg_sts_typ_nm";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Market release decision update role cd. 市場出荷判定更新役割ＣＤ.<p>
	 *
	 */
	public static final String $mrkt_judg_upd_role_cd = "mrkt_judg_upd_role_cd";
	/**
	 * Market release decision approval role cd. 市場出荷判定承認役割ＣＤ.<p>
	 *
	 */
	public static final String $mrkt_judg_role_cd = "mrkt_judg_role_cd";
	/**
	 * Not for market release decision flg. 市場出荷判定対象外ＦＬＧ.<p>
	 *
	 */
	public static final String $no_mrkt_judg_flg = "no_mrkt_judg_flg";
	/**
	 * For market release decision flg. 市場出荷判定対象ＦＬＧ.<p>
	 *
	 */
	public static final String $mrkt_judg_flg = "mrkt_judg_flg";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $from_site_cd = "from_site_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $to_site_cd = "to_site_cd";
	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta mrkt_judg_no_META = createCommonMeta($mrkt_judg_no, mcframe.commonMA.meta.MA_META.MRKT_JUDG_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ntfy_nm_META = createCommonMeta($ntfy_nm, mcframe.commonMA.meta.MA_META.NTFY_NM);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta upd_dt_META = createCommonMeta($upd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrkt_upd_usr_cd_META = createCommonMeta($mrkt_upd_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta mrkt_upd_usr_nm_META = createCommonMeta($mrkt_upd_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta mrkt_upd_dpt_cd_META = createCommonMeta($mrkt_upd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta mrkt_upd_dpt_nm_META = createCommonMeta($mrkt_upd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.MRKT_JUDG_INTR_RMRKS);
	public static final MCMeta mfg_so_aprv_typ_META = createCommonMeta($mfg_so_aprv_typ, mcframe.commonMS.meta.MS_META.MFG_SO_APRV_TYP);
	public static final MCMeta mfg_so_aprv_typ_nm_META = createCommonMeta($mfg_so_aprv_typ_nm, mcframe.commonMS.meta.MS_META.MFG_SO_APRV_TYP_NM);
	public static final MCMeta quality_mng_typ_META = createCommonMeta($quality_mng_typ, mcframe.commonMS.meta.MS_META.QUALITY_MNG_TYP);
	public static final MCMeta quality_mng_typ_nm_META = createCommonMeta($quality_mng_typ_nm, mcframe.commonMS.meta.MS_META.QUALITY_MNG_TYP_NM);
	public static final MCMeta mfg_mng_typ_META = createCommonMeta($mfg_mng_typ, mcframe.commonMS.meta.MS_META.MFG_MNG_TYP);
	public static final MCMeta mfg_mng_typ_nm_META = createCommonMeta($mfg_mng_typ_nm, mcframe.commonMS.meta.MS_META.MFG_MNG_TYP_NM);
	public static final MCMeta deviant_typ_META = createCommonMeta($deviant_typ, mcframe.commonMS.meta.MS_META.DEVIANT_TYP);
	public static final MCMeta deviant_typ_nm_META = createCommonMeta($deviant_typ_nm, mcframe.commonMS.meta.MS_META.DEVIANT_TYP_NM);
	public static final MCMeta deviant_msr_typ_META = createCommonMeta($deviant_msr_typ, mcframe.commonMS.meta.MS_META.DEVIANT_MSR_TYP);
	public static final MCMeta deviant_msr_typ_nm_META = createCommonMeta($deviant_msr_typ_nm, mcframe.commonMS.meta.MS_META.DEVIANT_MSR_TYP_NM);
	public static final MCMeta prod_itm_info_typ_META = createCommonMeta($prod_itm_info_typ, mcframe.commonMS.meta.MS_META.PROD_ITM_INFO_TYP);
	public static final MCMeta prod_itm_info_typ_nm_META = createCommonMeta($prod_itm_info_typ_nm, mcframe.commonMS.meta.MS_META.PROD_ITM_INFO_TYP_NM);
	public static final MCMeta chd_itm_info_typ_META = createCommonMeta($chd_itm_info_typ, mcframe.commonMS.meta.MS_META.CHD_ITM_INFO_TYP);
	public static final MCMeta chd_itm_info_typ_nm_META = createCommonMeta($chd_itm_info_typ_nm, mcframe.commonMS.meta.MS_META.CHD_ITM_INFO_TYP_NM);
	public static final MCMeta no_del_flg_META = createCommonMeta($no_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta add_flg_META = createCommonMeta($add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.MRKT_JUDG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.MRKT_JUDG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.MRKT_JUDG_SUB_CHAR3);
	public static final MCMeta mrkt_judg_sts_typ_META = createCommonMeta($mrkt_judg_sts_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP);
	public static final MCMeta mrkt_judg_sts_typ_nm_META = createCommonMeta($mrkt_judg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP_NM);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta mrkt_judg_upd_role_cd_META = createCommonMeta($mrkt_judg_upd_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta mrkt_judg_role_cd_META = createCommonMeta($mrkt_judg_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta no_mrkt_judg_flg_META = createCommonMeta($no_mrkt_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_flg_META = createCommonMeta($mrkt_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta from_site_cd_META = createCommonMeta($from_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta to_site_cd_META = createCommonMeta($to_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);

	protected static final ConstMetaList<Chk01_RsltR> constMetas = new ConstMetaList<Chk01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			mrkt_judg_no_META,
			upd_cntr_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			ntfy_nm_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			lot_no_META,
			site_cd_META,
			site_nm_META,
			upd_dt_META,
			mrkt_upd_usr_cd_META,
			mrkt_upd_usr_nm_META,
			mrkt_upd_dpt_cd_META,
			mrkt_upd_dpt_nm_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_qty_META,
			vld_dt_META,
			intr_rmrks_META,
			mfg_so_aprv_typ_META,
			mfg_so_aprv_typ_nm_META,
			quality_mng_typ_META,
			quality_mng_typ_nm_META,
			mfg_mng_typ_META,
			mfg_mng_typ_nm_META,
			deviant_typ_META,
			deviant_typ_nm_META,
			deviant_msr_typ_META,
			deviant_msr_typ_nm_META,
			prod_itm_info_typ_META,
			prod_itm_info_typ_nm_META,
			chd_itm_info_typ_META,
			chd_itm_info_typ_nm_META,
			no_del_flg_META,
			add_flg_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			mrkt_judg_sts_typ_META,
			mrkt_judg_sts_typ_nm_META,
			rtn_sts_typ_META,
			mrkt_judg_upd_role_cd_META,
			mrkt_judg_role_cd_META,
			no_mrkt_judg_flg_META,
			mrkt_judg_flg_META,
			mfg_loc_cd_META,
			sppl_cd_META,
			maker_cd_META,
			from_site_cd_META,
			to_site_cd_META,
			insp_typ_META
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
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$upd_dt, "E"},	// upd_dt
				{$base_unit_qty, "E"}	// base_unit_qty
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$base_unit_qty, "positive"}	// base_unit_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$upd_dt, "bfToday"}	// upd_dt
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
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$lot_no, "MS.MSUAL0070.LotNo"},	// lot_no
				{$site_cd, "MA.MAUAL0010.Site"},	// site_cd
				{$mrkt_upd_usr_cd, "MA.MAUAL0010.Usr"},	// mrkt_upd_usr_cd
				{$mrkt_upd_dpt_cd, "MA.MAUAL0010.Dpt"}	// mrkt_upd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_nm;lot_mng_typ;sublot_mng_typ;base_unit_cd;base_unit_nm;base_unit_dec_place"},	// itm_sub3
				{$site_cd, "site_nm"},	// site_cd
				{$mrkt_upd_usr_cd, "mrkt_upd_usr_nm"},	// mrkt_upd_usr_cd
				{$mrkt_upd_dpt_cd, "mrkt_upd_dpt_nm"}	// mrkt_upd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_nm;lot_mng_typ;sublot_mng_typ;unit_cd;unit_nm;dec_place"},	// itm_sub3
				{$mrkt_upd_usr_cd, "usr_nm"},	// mrkt_upd_usr_cd
				{$mrkt_upd_dpt_cd, "dpt_nm"}	// mrkt_upd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$mrkt_upd_dpt_cd, "upd_dt;mrkt_upd_usr_cd;MAC_DPT_IS_SRCH_TYP.INSP"}	// mrkt_upd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$mrkt_upd_dpt_cd, "dt;usr_cd;dpt_is_srch_typ"}	// mrkt_upd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$mfg_so_aprv_typ, "MSC_MFG_SO_APRV_TYP"},	// mfg_so_aprv_typ
				{$quality_mng_typ, "MSC_QUALITY_MNG_TYP"},	// quality_mng_typ
				{$mfg_mng_typ, "MSC_MFG_MNG_TYP"},	// mfg_mng_typ
				{$deviant_typ, "MSC_DEVIANT_TYP"},	// deviant_typ
				{$deviant_msr_typ, "MSC_DEVIANT_MSR_TYP"},	// deviant_msr_typ
				{$prod_itm_info_typ, "MSC_PROD_ITM_INFO_TYP"},	// prod_itm_info_typ
				{$chd_itm_info_typ, "MSC_CHD_ITM_INFO_TYP"}	// chd_itm_info_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"}	// itm_sub3
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
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
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
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public String mrkt_judg_no() {
		return getConstString(offset + 3, $mrkt_judg_no);
	}

	/**
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public void mrkt_judg_no(String value) {
		setConstString(offset + 3, $mrkt_judg_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 4, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 5, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 5, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 6, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 6, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 7, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 7, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 8, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 8, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 9, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 9, $itm_nm, value);
	}


	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public String ntfy_nm() {
		return getConstString(offset + 10, $ntfy_nm);
	}

	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public void ntfy_nm(String value) {
		setConstString(offset + 10, $ntfy_nm, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 11, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 11, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 12, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 12, $sublot_mng_typ, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 13, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 13, $lot_no, value);
	}


	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 14, $site_cd);
	}

	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 14, $site_cd, value);
	}


	/**
	 * Shipping point factory/distribution warehouse name 出荷元工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 15, $site_nm);
	}

	/**
	 * Shipping point factory/distribution warehouse name 出荷元工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 15, $site_nm, value);
	}


	/**
	 * Update date 更新日.<p>
	 *
	 */
	public MCDate upd_dt() {
		return getConstDate(offset + 16, $upd_dt);
	}

	/**
	 * Update date 更新日.<p>
	 *
	 */
	public void upd_dt(MCDate value) {
		setConstDate(offset + 16, $upd_dt, value);
	}


	/**
	 * Updater cd. 更新者ＣＤ.<p>
	 *
	 */
	public String mrkt_upd_usr_cd() {
		return getConstString(offset + 17, $mrkt_upd_usr_cd);
	}

	/**
	 * Updater cd. 更新者ＣＤ.<p>
	 *
	 */
	public void mrkt_upd_usr_cd(String value) {
		setConstString(offset + 17, $mrkt_upd_usr_cd, value);
	}


	/**
	 * Update user name 更新者名.<p>
	 *
	 */
	public String mrkt_upd_usr_nm() {
		return getConstString(offset + 18, $mrkt_upd_usr_nm);
	}

	/**
	 * Update user name 更新者名.<p>
	 *
	 */
	public void mrkt_upd_usr_nm(String value) {
		setConstString(offset + 18, $mrkt_upd_usr_nm, value);
	}


	/**
	 * Update dept. cd. 更新部門ＣＤ.<p>
	 *
	 */
	public String mrkt_upd_dpt_cd() {
		return getConstString(offset + 19, $mrkt_upd_dpt_cd);
	}

	/**
	 * Update dept. cd. 更新部門ＣＤ.<p>
	 *
	 */
	public void mrkt_upd_dpt_cd(String value) {
		setConstString(offset + 19, $mrkt_upd_dpt_cd, value);
	}


	/**
	 * Update dept. name 更新部門名.<p>
	 *
	 */
	public String mrkt_upd_dpt_nm() {
		return getConstString(offset + 20, $mrkt_upd_dpt_nm);
	}

	/**
	 * Update dept. name 更新部門名.<p>
	 *
	 */
	public void mrkt_upd_dpt_nm(String value) {
		setConstString(offset + 20, $mrkt_upd_dpt_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 21, $base_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 21, $base_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 22, $base_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 22, $base_unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 23, $base_unit_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 23, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 23, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 23, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 23, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 23, $base_unit_dec_place, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 24, $base_unit_qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 24, $base_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 24, $base_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 24, $base_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 24, $base_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 24, $base_unit_qty, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 25, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 25, $vld_dt, value);
	}


	/**
	 * Remarks 特記事項.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 26, $intr_rmrks);
	}

	/**
	 * Remarks 特記事項.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 26, $intr_rmrks, value);
	}


	/**
	 * Shipping approval result from mfg. site 製造所からの出荷承認結果.<p>
	 *
	 */
	public String mfg_so_aprv_typ() {
		return getConstString(offset + 27, $mfg_so_aprv_typ);
	}

	/**
	 * Shipping approval result from mfg. site 製造所からの出荷承認結果.<p>
	 *
	 */
	public void mfg_so_aprv_typ(String value) {
		setConstString(offset + 27, $mfg_so_aprv_typ, value);
	}


	/**
	 * Shipping approval result name from mfg. site 製造所からの出荷承認結果名.<p>
	 *
	 */
	public String mfg_so_aprv_typ_nm() {
		return getConstString(offset + 28, $mfg_so_aprv_typ_nm);
	}

	/**
	 * Shipping approval result name from mfg. site 製造所からの出荷承認結果名.<p>
	 *
	 */
	public void mfg_so_aprv_typ_nm(String value) {
		setConstString(offset + 28, $mfg_so_aprv_typ_nm, value);
	}


	/**
	 * Inspection result 品質管理結果.<p>
	 *
	 */
	public String quality_mng_typ() {
		return getConstString(offset + 29, $quality_mng_typ);
	}

	/**
	 * Inspection result 品質管理結果.<p>
	 *
	 */
	public void quality_mng_typ(String value) {
		setConstString(offset + 29, $quality_mng_typ, value);
	}


	/**
	 * Inspection result name 品質管理結果名.<p>
	 *
	 */
	public String quality_mng_typ_nm() {
		return getConstString(offset + 30, $quality_mng_typ_nm);
	}

	/**
	 * Inspection result name 品質管理結果名.<p>
	 *
	 */
	public void quality_mng_typ_nm(String value) {
		setConstString(offset + 30, $quality_mng_typ_nm, value);
	}


	/**
	 * Mfg. management result 製造管理結果.<p>
	 *
	 */
	public String mfg_mng_typ() {
		return getConstString(offset + 31, $mfg_mng_typ);
	}

	/**
	 * Mfg. management result 製造管理結果.<p>
	 *
	 */
	public void mfg_mng_typ(String value) {
		setConstString(offset + 31, $mfg_mng_typ, value);
	}


	/**
	 * Mfg. management result name 製造管理結果名.<p>
	 *
	 */
	public String mfg_mng_typ_nm() {
		return getConstString(offset + 32, $mfg_mng_typ_nm);
	}

	/**
	 * Mfg. management result name 製造管理結果名.<p>
	 *
	 */
	public void mfg_mng_typ_nm(String value) {
		setConstString(offset + 32, $mfg_mng_typ_nm, value);
	}


	/**
	 * Existence of deviation 逸脱有無.<p>
	 *
	 */
	public String deviant_typ() {
		return getConstString(offset + 33, $deviant_typ);
	}

	/**
	 * Existence of deviation 逸脱有無.<p>
	 *
	 */
	public void deviant_typ(String value) {
		setConstString(offset + 33, $deviant_typ, value);
	}


	/**
	 * Existence of deviation name 逸脱有無名.<p>
	 *
	 */
	public String deviant_typ_nm() {
		return getConstString(offset + 34, $deviant_typ_nm);
	}

	/**
	 * Existence of deviation name 逸脱有無名.<p>
	 *
	 */
	public void deviant_typ_nm(String value) {
		setConstString(offset + 34, $deviant_typ_nm, value);
	}


	/**
	 * Deviation measure 逸脱措置.<p>
	 *
	 */
	public String deviant_msr_typ() {
		return getConstString(offset + 35, $deviant_msr_typ);
	}

	/**
	 * Deviation measure 逸脱措置.<p>
	 *
	 */
	public void deviant_msr_typ(String value) {
		setConstString(offset + 35, $deviant_msr_typ, value);
	}


	/**
	 * Deviation measure name 逸脱措置名.<p>
	 *
	 */
	public String deviant_msr_typ_nm() {
		return getConstString(offset + 36, $deviant_msr_typ_nm);
	}

	/**
	 * Deviation measure name 逸脱措置名.<p>
	 *
	 */
	public void deviant_msr_typ_nm(String value) {
		setConstString(offset + 36, $deviant_msr_typ_nm, value);
	}


	/**
	 * Product info. of quality/validity/safety 製品の品質・有効性・安全性の情報.<p>
	 *
	 */
	public String prod_itm_info_typ() {
		return getConstString(offset + 37, $prod_itm_info_typ);
	}

	/**
	 * Product info. of quality/validity/safety 製品の品質・有効性・安全性の情報.<p>
	 *
	 */
	public void prod_itm_info_typ(String value) {
		setConstString(offset + 37, $prod_itm_info_typ, value);
	}


	/**
	 * Product info. name of quality/validity/safety 製品の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public String prod_itm_info_typ_nm() {
		return getConstString(offset + 38, $prod_itm_info_typ_nm);
	}

	/**
	 * Product info. name of quality/validity/safety 製品の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public void prod_itm_info_typ_nm(String value) {
		setConstString(offset + 38, $prod_itm_info_typ_nm, value);
	}


	/**
	 * Raw material quality/validity/safety info. 原材料の品質・有効性・安全性の情報.<p>
	 *
	 */
	public String chd_itm_info_typ() {
		return getConstString(offset + 39, $chd_itm_info_typ);
	}

	/**
	 * Raw material quality/validity/safety info. 原材料の品質・有効性・安全性の情報.<p>
	 *
	 */
	public void chd_itm_info_typ(String value) {
		setConstString(offset + 39, $chd_itm_info_typ, value);
	}


	/**
	 * Raw material quality/validity/safety info. name 原材料の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public String chd_itm_info_typ_nm() {
		return getConstString(offset + 40, $chd_itm_info_typ_nm);
	}

	/**
	 * Raw material quality/validity/safety info. name 原材料の品質・有効性・安全性の情報名.<p>
	 *
	 */
	public void chd_itm_info_typ_nm(String value) {
		setConstString(offset + 40, $chd_itm_info_typ_nm, value);
	}


	/**
	 * Creation source cancel not possible 作成元取消不可.<p>
	 *
	 */
	public boolean no_del_flg() {
		return getConstBoolean(offset + 41, $no_del_flg);
	}

	/**
	 * Creation source cancel not possible 作成元取消不可.<p>
	 *
	 */
	public void no_del_flg(boolean value) {
		setConstBoolean(offset + 41, $no_del_flg, value);
	}


	/**
	 * Add 追加.<p>
	 *
	 */
	public boolean add_flg() {
		return getConstBoolean(offset + 42, $add_flg);
	}

	/**
	 * Add 追加.<p>
	 *
	 */
	public void add_flg(boolean value) {
		setConstBoolean(offset + 42, $add_flg, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 43, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 43, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 44, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 44, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 45, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 45, $sub_char3, value);
	}


	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 46, $mrkt_judg_sts_typ);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 46, $mrkt_judg_sts_typ, value);
	}


	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 47, $mrkt_judg_sts_typ_nm);
	}

	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 47, $mrkt_judg_sts_typ_nm, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 48, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 48, $rtn_sts_typ, value);
	}


	/**
	 * Market release decision update role cd. 市場出荷判定更新役割ＣＤ.<p>
	 *
	 */
	public String mrkt_judg_upd_role_cd() {
		return getConstString(offset + 49, $mrkt_judg_upd_role_cd);
	}

	/**
	 * Market release decision update role cd. 市場出荷判定更新役割ＣＤ.<p>
	 *
	 */
	public void mrkt_judg_upd_role_cd(String value) {
		setConstString(offset + 49, $mrkt_judg_upd_role_cd, value);
	}


	/**
	 * Market release decision approval role cd. 市場出荷判定承認役割ＣＤ.<p>
	 *
	 */
	public String mrkt_judg_role_cd() {
		return getConstString(offset + 50, $mrkt_judg_role_cd);
	}

	/**
	 * Market release decision approval role cd. 市場出荷判定承認役割ＣＤ.<p>
	 *
	 */
	public void mrkt_judg_role_cd(String value) {
		setConstString(offset + 50, $mrkt_judg_role_cd, value);
	}


	/**
	 * Not for market release decision flg. 市場出荷判定対象外ＦＬＧ.<p>
	 *
	 */
	public boolean no_mrkt_judg_flg() {
		return getConstBoolean(offset + 51, $no_mrkt_judg_flg);
	}

	/**
	 * Not for market release decision flg. 市場出荷判定対象外ＦＬＧ.<p>
	 *
	 */
	public void no_mrkt_judg_flg(boolean value) {
		setConstBoolean(offset + 51, $no_mrkt_judg_flg, value);
	}


	/**
	 * For market release decision flg. 市場出荷判定対象ＦＬＧ.<p>
	 *
	 */
	public boolean mrkt_judg_flg() {
		return getConstBoolean(offset + 52, $mrkt_judg_flg);
	}

	/**
	 * For market release decision flg. 市場出荷判定対象ＦＬＧ.<p>
	 *
	 */
	public void mrkt_judg_flg(boolean value) {
		setConstBoolean(offset + 52, $mrkt_judg_flg, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 53, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 53, $mfg_loc_cd, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 54, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 54, $sppl_cd, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 55, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 55, $maker_cd, value);
	}


	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String from_site_cd() {
		return getConstString(offset + 56, $from_site_cd);
	}

	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void from_site_cd(String value) {
		setConstString(offset + 56, $from_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String to_site_cd() {
		return getConstString(offset + 57, $to_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void to_site_cd(String value) {
		setConstString(offset + 57, $to_site_cd, value);
	}


	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 58, $insp_typ);
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 58, $insp_typ, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			return mrkt_judg_no();
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
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			return ntfy_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($mrkt_upd_usr_cd.equalsIgnoreCase(name)) {
			return mrkt_upd_usr_cd();
		}
		if ($mrkt_upd_usr_nm.equalsIgnoreCase(name)) {
			return mrkt_upd_usr_nm();
		}
		if ($mrkt_upd_dpt_cd.equalsIgnoreCase(name)) {
			return mrkt_upd_dpt_cd();
		}
		if ($mrkt_upd_dpt_nm.equalsIgnoreCase(name)) {
			return mrkt_upd_dpt_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ();
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ_nm();
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			return quality_mng_typ();
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			return quality_mng_typ_nm();
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			return mfg_mng_typ();
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mng_typ_nm();
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			return deviant_typ();
		}
		if ($deviant_typ_nm.equalsIgnoreCase(name)) {
			return deviant_typ_nm();
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			return deviant_msr_typ();
		}
		if ($deviant_msr_typ_nm.equalsIgnoreCase(name)) {
			return deviant_msr_typ_nm();
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			return prod_itm_info_typ();
		}
		if ($prod_itm_info_typ_nm.equalsIgnoreCase(name)) {
			return prod_itm_info_typ_nm();
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			return chd_itm_info_typ();
		}
		if ($chd_itm_info_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_info_typ_nm();
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
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_upd_role_cd();
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_role_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($upd_dt.equalsIgnoreCase(name)) {
			return upd_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($no_del_flg.equalsIgnoreCase(name)) {
			return no_del_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			return no_mrkt_judg_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			return mrkt_judg_no();
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
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			return ntfy_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($mrkt_upd_usr_cd.equalsIgnoreCase(name)) {
			return mrkt_upd_usr_cd();
		}
		if ($mrkt_upd_usr_nm.equalsIgnoreCase(name)) {
			return mrkt_upd_usr_nm();
		}
		if ($mrkt_upd_dpt_cd.equalsIgnoreCase(name)) {
			return mrkt_upd_dpt_cd();
		}
		if ($mrkt_upd_dpt_nm.equalsIgnoreCase(name)) {
			return mrkt_upd_dpt_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ();
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ_nm();
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			return quality_mng_typ();
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			return quality_mng_typ_nm();
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			return mfg_mng_typ();
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mng_typ_nm();
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			return deviant_typ();
		}
		if ($deviant_typ_nm.equalsIgnoreCase(name)) {
			return deviant_typ_nm();
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			return deviant_msr_typ();
		}
		if ($deviant_msr_typ_nm.equalsIgnoreCase(name)) {
			return deviant_msr_typ_nm();
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			return prod_itm_info_typ();
		}
		if ($prod_itm_info_typ_nm.equalsIgnoreCase(name)) {
			return prod_itm_info_typ_nm();
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			return chd_itm_info_typ();
		}
		if ($chd_itm_info_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_info_typ_nm();
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
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_upd_role_cd();
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_role_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($upd_dt.equalsIgnoreCase(name)) {
			return upd_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($no_del_flg.equalsIgnoreCase(name)) {
			return no_del_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			return no_mrkt_judg_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			mrkt_judg_no(value);
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
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			ntfy_nm(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($mrkt_upd_usr_cd.equalsIgnoreCase(name)) {
			mrkt_upd_usr_cd(value);
			return;
		}
		if ($mrkt_upd_usr_nm.equalsIgnoreCase(name)) {
			mrkt_upd_usr_nm(value);
			return;
		}
		if ($mrkt_upd_dpt_cd.equalsIgnoreCase(name)) {
			mrkt_upd_dpt_cd(value);
			return;
		}
		if ($mrkt_upd_dpt_nm.equalsIgnoreCase(name)) {
			mrkt_upd_dpt_nm(value);
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ(value);
			return;
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ_nm(value);
			return;
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			quality_mng_typ(value);
			return;
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			quality_mng_typ_nm(value);
			return;
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			mfg_mng_typ(value);
			return;
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			mfg_mng_typ_nm(value);
			return;
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			deviant_typ(value);
			return;
		}
		if ($deviant_typ_nm.equalsIgnoreCase(name)) {
			deviant_typ_nm(value);
			return;
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			deviant_msr_typ(value);
			return;
		}
		if ($deviant_msr_typ_nm.equalsIgnoreCase(name)) {
			deviant_msr_typ_nm(value);
			return;
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			prod_itm_info_typ(value);
			return;
		}
		if ($prod_itm_info_typ_nm.equalsIgnoreCase(name)) {
			prod_itm_info_typ_nm(value);
			return;
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			chd_itm_info_typ(value);
			return;
		}
		if ($chd_itm_info_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_info_typ_nm(value);
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
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_upd_role_cd(value);
			return;
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_role_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($upd_dt.equalsIgnoreCase(name)) {
			upd_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($no_del_flg.equalsIgnoreCase(name)) {
			no_del_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			no_mrkt_judg_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			mrkt_judg_no(value);
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
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			ntfy_nm(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($mrkt_upd_usr_cd.equalsIgnoreCase(name)) {
			mrkt_upd_usr_cd(value);
			return;
		}
		if ($mrkt_upd_usr_nm.equalsIgnoreCase(name)) {
			mrkt_upd_usr_nm(value);
			return;
		}
		if ($mrkt_upd_dpt_cd.equalsIgnoreCase(name)) {
			mrkt_upd_dpt_cd(value);
			return;
		}
		if ($mrkt_upd_dpt_nm.equalsIgnoreCase(name)) {
			mrkt_upd_dpt_nm(value);
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ(value);
			return;
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ_nm(value);
			return;
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			quality_mng_typ(value);
			return;
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			quality_mng_typ_nm(value);
			return;
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			mfg_mng_typ(value);
			return;
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			mfg_mng_typ_nm(value);
			return;
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			deviant_typ(value);
			return;
		}
		if ($deviant_typ_nm.equalsIgnoreCase(name)) {
			deviant_typ_nm(value);
			return;
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			deviant_msr_typ(value);
			return;
		}
		if ($deviant_msr_typ_nm.equalsIgnoreCase(name)) {
			deviant_msr_typ_nm(value);
			return;
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			prod_itm_info_typ(value);
			return;
		}
		if ($prod_itm_info_typ_nm.equalsIgnoreCase(name)) {
			prod_itm_info_typ_nm(value);
			return;
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			chd_itm_info_typ(value);
			return;
		}
		if ($chd_itm_info_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_info_typ_nm(value);
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
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_upd_role_cd(value);
			return;
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_role_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($upd_dt.equalsIgnoreCase(name)) {
			upd_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($no_del_flg.equalsIgnoreCase(name)) {
			no_del_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			no_mrkt_judg_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

