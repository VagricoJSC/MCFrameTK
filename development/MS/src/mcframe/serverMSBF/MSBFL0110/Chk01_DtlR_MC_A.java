package mcframe.serverMSBF.MSBFL0110;

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
 * ブロック"Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_DtlR_MC_A extends MCConstRow {

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
	 * Item_[Before change] 品目_[変更前].<p>
	 *
	 */
	public static final String $itm_cd_key = "itm_cd_key";
	/**
	 * Branch No. 1_[Before change] 枝番１_[変更前].<p>
	 *
	 */
	public static final String $itm_sub1_key = "itm_sub1_key";
	/**
	 * Branch No. 2_[Before change] 枝番２_[変更前].<p>
	 *
	 */
	public static final String $itm_sub2_key = "itm_sub2_key";
	/**
	 * Branch No. 3_[Before change] 枝番３_[変更前].<p>
	 *
	 */
	public static final String $itm_sub3_key = "itm_sub3_key";
	/**
	 * Lot No._[Before change] ロットＮＯ_[変更前].<p>
	 *
	 */
	public static final String $lot_no_key = "lot_no_key";
	/**
	 * Sublot No._[Before change] サブロットＮＯ_[変更前].<p>
	 *
	 */
	public static final String $sublot_no_key = "sublot_no_key";
	/**
	 * Item 品目.<p>
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
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * For version control flg. 版管理対象ＦＬＧ.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public static final String $lot_mng_typ_nm = "lot_mng_typ_nm";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public static final String $sublot_mng_typ_nm = "sublot_mng_typ_nm";
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
	 * Schedule 予定.<p>
	 *
	 */
	public static final String $schd_flg = "schd_flg";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	/**
	 * Standard GR date 基準入庫日.<p>
	 *
	 */
	public static final String $base_gr_dt = "base_gr_dt";
	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public static final String $unreg_lmt_flg = "unreg_lmt_flg";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public static final String $stk_insp_typ_nm = "stk_insp_typ_nm";
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
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ_nm = "mfg_aprv_sts_typ_nm";
	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ = "insp_aprv_sts_typ";
	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ_nm = "insp_aprv_sts_typ_nm";
	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ = "plnt_aprv_sts_typ";
	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ_nm = "plnt_aprv_sts_typ_nm";
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
	 * Save oldest date 最古日保存.<p>
	 *
	 */
	public static final String $first_gr_dt_save_flg = "first_gr_dt_save_flg";
	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	/**
	 * Base date type 起算日区分.<p>
	 *
	 */
	public static final String $lmt_dt_frm_typ = "lmt_dt_frm_typ";
	/**
	 * Base date type name 起算日区分名.<p>
	 *
	 */
	public static final String $lmt_dt_frm_typ_nm = "lmt_dt_frm_typ_nm";
	/**
	 * Base date 起算日.<p>
	 *
	 */
	public static final String $lmt_dt_frm = "lmt_dt_frm";
	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public static final String $lot_seq = "lot_seq";
	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public static final String $lot_rmrks = "lot_rmrks";
	/**
	 * Lot spare (String) 1 ロット予備（文字列）１.<p>
	 *
	 */
	public static final String $lot_sub_char1 = "lot_sub_char1";
	/**
	 * Lot spare (String) 2 ロット予備（文字列）２.<p>
	 *
	 */
	public static final String $lot_sub_char2 = "lot_sub_char2";
	/**
	 * Lot spare (String) 3 ロット予備（文字列）３.<p>
	 *
	 */
	public static final String $lot_sub_char3 = "lot_sub_char3";
	/**
	 * Lot spare (String) 4 ロット予備（文字列）４.<p>
	 *
	 */
	public static final String $lot_sub_char4 = "lot_sub_char4";
	/**
	 * Lot spare (String) 5 ロット予備（文字列）５.<p>
	 *
	 */
	public static final String $lot_sub_char5 = "lot_sub_char5";
	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public static final String $lot_sub_num1 = "lot_sub_num1";
	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public static final String $lot_sub_num2 = "lot_sub_num2";
	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public static final String $lot_sub_num3 = "lot_sub_num3";
	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public static final String $lot_sub_num4 = "lot_sub_num4";
	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public static final String $lot_sub_num5 = "lot_sub_num5";
	/**
	 * Lot spare (Date) 1 ロット予備（日付）１.<p>
	 *
	 */
	public static final String $lot_sub_dt1 = "lot_sub_dt1";
	/**
	 * Lot spare (Date) 2 ロット予備（日付）２.<p>
	 *
	 */
	public static final String $lot_sub_dt2 = "lot_sub_dt2";
	/**
	 * Lot spare (Date) 3 ロット予備（日付）３.<p>
	 *
	 */
	public static final String $lot_sub_dt3 = "lot_sub_dt3";
	/**
	 * Lot spare (Date) 4 ロット予備（日付）４.<p>
	 *
	 */
	public static final String $lot_sub_dt4 = "lot_sub_dt4";
	/**
	 * Lot spare (Date) 5 ロット予備（日付）５.<p>
	 *
	 */
	public static final String $lot_sub_dt5 = "lot_sub_dt5";
	/**
	 * Lot spare (flg.) 1 ロット予備（ＦＬＧ）１.<p>
	 *
	 */
	public static final String $lot_sub_flg1 = "lot_sub_flg1";
	/**
	 * Lot spare (flg.) 2 ロット予備（ＦＬＧ）２.<p>
	 *
	 */
	public static final String $lot_sub_flg2 = "lot_sub_flg2";
	/**
	 * Lot spare (flg.) 3 ロット予備（ＦＬＧ）３.<p>
	 *
	 */
	public static final String $lot_sub_flg3 = "lot_sub_flg3";
	/**
	 * Lot spare (flg.) 4 ロット予備（ＦＬＧ）４.<p>
	 *
	 */
	public static final String $lot_sub_flg4 = "lot_sub_flg4";
	/**
	 * Lot spare (flg.) 5 ロット予備（ＦＬＧ）５.<p>
	 *
	 */
	public static final String $lot_sub_flg5 = "lot_sub_flg5";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_key_META = createCommonMeta($itm_cd_key, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_key_META = createCommonMeta($itm_sub1_key, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_key_META = createCommonMeta($itm_sub2_key, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_key_META = createCommonMeta($itm_sub3_key, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_no_key_META = createCommonMeta($lot_no_key, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_key_META = createCommonMeta($sublot_no_key, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_mng_typ_nm_META = createCommonMeta($lot_mng_typ_nm, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP_NM);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_nm_META = createCommonMeta($sublot_mng_typ_nm, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta schd_flg_META = createCommonMeta($schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_gr_dt_META = createCommonMeta($base_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta unreg_lmt_flg_META = createCommonMeta($unreg_lmt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta mfg_aprv_sts_typ_nm_META = createCommonMeta($mfg_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP_NM);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta insp_aprv_sts_typ_nm_META = createCommonMeta($insp_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP_NM);
	public static final MCMeta plnt_aprv_sts_typ_META = createCommonMeta($plnt_aprv_sts_typ, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP);
	public static final MCMeta plnt_aprv_sts_typ_nm_META = createCommonMeta($plnt_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP_NM);
	public static final MCMeta mrkt_judg_sts_typ_META = createCommonMeta($mrkt_judg_sts_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP);
	public static final MCMeta mrkt_judg_sts_typ_nm_META = createCommonMeta($mrkt_judg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP_NM);
	public static final MCMeta first_gr_dt_save_flg_META = createCommonMeta($first_gr_dt_save_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta lmt_dt_frm_typ_META = createCommonMeta($lmt_dt_frm_typ, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP);
	public static final MCMeta lmt_dt_frm_typ_nm_META = createCommonMeta($lmt_dt_frm_typ_nm, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP_NM);
	public static final MCMeta lmt_dt_frm_META = createCommonMeta($lmt_dt_frm, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_seq_META = createCommonMeta($lot_seq, mcframe.commonMA.meta.MA_META.LOT_SEQ);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta lot_sub_char1_META = createCommonMeta($lot_sub_char1, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR1);
	public static final MCMeta lot_sub_char2_META = createCommonMeta($lot_sub_char2, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR2);
	public static final MCMeta lot_sub_char3_META = createCommonMeta($lot_sub_char3, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR3);
	public static final MCMeta lot_sub_char4_META = createCommonMeta($lot_sub_char4, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR4);
	public static final MCMeta lot_sub_char5_META = createCommonMeta($lot_sub_char5, mcframe.commonMS.meta.MS_META.LOT_SUB_CHAR5);
	public static final MCMeta lot_sub_num1_META = createCommonMeta($lot_sub_num1, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM1);
	public static final MCMeta lot_sub_num2_META = createCommonMeta($lot_sub_num2, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM2);
	public static final MCMeta lot_sub_num3_META = createCommonMeta($lot_sub_num3, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM3);
	public static final MCMeta lot_sub_num4_META = createCommonMeta($lot_sub_num4, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM4);
	public static final MCMeta lot_sub_num5_META = createCommonMeta($lot_sub_num5, mcframe.commonMS.meta.MS_META.LOT_SUB_NUM5);
	public static final MCMeta lot_sub_dt1_META = createCommonMeta($lot_sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_dt2_META = createCommonMeta($lot_sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_dt3_META = createCommonMeta($lot_sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_dt4_META = createCommonMeta($lot_sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_dt5_META = createCommonMeta($lot_sub_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_sub_flg1_META = createCommonMeta($lot_sub_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_sub_flg2_META = createCommonMeta($lot_sub_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_sub_flg3_META = createCommonMeta($lot_sub_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_sub_flg4_META = createCommonMeta($lot_sub_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_sub_flg5_META = createCommonMeta($lot_sub_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Chk01_DtlR> constMetas = new ConstMetaList<Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			itm_cd_key_META,
			itm_sub1_key_META,
			itm_sub2_key_META,
			itm_sub3_key_META,
			lot_no_key_META,
			sublot_no_key_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			cont_fctr_flg_META,
			ver_flg_META,
			lot_mng_typ_META,
			lot_mng_typ_nm_META,
			sublot_mng_typ_META,
			sublot_mng_typ_nm_META,
			lot_no_META,
			sublot_no_META,
			schd_flg_META,
			ver_no_META,
			first_gr_dt_META,
			base_gr_dt_META,
			unreg_lmt_flg_META,
			vld_dt_META,
			lmt_dt_META,
			bp_lot_no_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			mfg_aprv_sts_typ_META,
			mfg_aprv_sts_typ_nm_META,
			insp_aprv_sts_typ_META,
			insp_aprv_sts_typ_nm_META,
			plnt_aprv_sts_typ_META,
			plnt_aprv_sts_typ_nm_META,
			mrkt_judg_sts_typ_META,
			mrkt_judg_sts_typ_nm_META,
			first_gr_dt_save_flg_META,
			act_cont_fctr_META,
			lmt_dt_frm_typ_META,
			lmt_dt_frm_typ_nm_META,
			lmt_dt_frm_META,
			lot_seq_META,
			lot_rmrks_META,
			lot_sub_char1_META,
			lot_sub_char2_META,
			lot_sub_char3_META,
			lot_sub_char4_META,
			lot_sub_char5_META,
			lot_sub_num1_META,
			lot_sub_num2_META,
			lot_sub_num3_META,
			lot_sub_num4_META,
			lot_sub_num5_META,
			lot_sub_dt1_META,
			lot_sub_dt2_META,
			lot_sub_dt3_META,
			lot_sub_dt4_META,
			lot_sub_dt5_META,
			lot_sub_flg1_META,
			lot_sub_flg2_META,
			lot_sub_flg3_META,
			lot_sub_flg4_META,
			lot_sub_flg5_META,
			rtn_sts_typ_META,
			upd_cntr_META
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
				{$itm_cd_key, "U"},	// itm_cd_key
				{$itm_sub1_key, "U"},	// itm_sub1_key
				{$itm_sub2_key, "U"},	// itm_sub2_key
				{$itm_sub3_key, "U"},	// itm_sub3_key
				{$lot_no_key, "U"},	// lot_no_key
				{$sublot_no_key, "U"},	// sublot_no_key
				{$itm_cd, "I"},	// itm_cd
				{$itm_sub1, "I"},	// itm_sub1
				{$itm_sub2, "I"},	// itm_sub2
				{$itm_sub3, "I"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$itm_cd, "E"},	// itm_cd
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$first_gr_dt, "E"}	// first_gr_dt
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$act_cont_fctr, "positive"}	// act_cont_fctr
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$lot_sub_num1, "0:"},	// lot_sub_num1
				{$lot_sub_num2, "0:"},	// lot_sub_num2
				{$lot_sub_num3, "0:"},	// lot_sub_num3
				{$lot_sub_num4, "0:"},	// lot_sub_num4
				{$lot_sub_num5, "0:"}	// lot_sub_num5
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$vld_dt, "E1:BF"},	// vld_dt
				{$lmt_dt, "E1:AF"}	// lmt_dt
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
				{$itm_cd, "key"},	// itm_cd
				{$itm_sub1, "key"},	// itm_sub1
				{$itm_sub2, "key"},	// itm_sub2
				{$itm_sub3, "key"},	// itm_sub3
				{$lot_no, "key"},	// lot_no
				{$sublot_no, "key"}	// sublot_no
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
				{$ver_no, "MA.MAUAL0010.ItmVer"}	// ver_no
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_nm;lot_mng_typ;lot_mng_typ_nm;sublot_mng_typ;sublot_mng_typ_nm;cont_fctr_flg;ver_flg"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.LOT;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$ver_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// ver_no
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$ver_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// ver_no
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$stk_insp_typ, "MSC_STK_INSP_TYP"},	// stk_insp_typ
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$mfg_aprv_sts_typ, "MSC_MFG_APRV_STS_TYP"},	// mfg_aprv_sts_typ
				{$insp_aprv_sts_typ, "MSC_INSP_APRV_STS_TYP"},	// insp_aprv_sts_typ
				{$plnt_aprv_sts_typ, "MSC_PLNT_APRV_STS_TYP"},	// plnt_aprv_sts_typ
				{$mrkt_judg_sts_typ, "MSC_MRKT_JUDG_STS_TYP"},	// mrkt_judg_sts_typ
				{$lmt_dt_frm_typ, "MAC_LMT_DT_FRM_TYP"}	// lmt_dt_frm_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$lot_no, "E"},	// lot_no
				{$sublot_no, "E"}	// sublot_no
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
	protected Chk01_DtlR_MC_A(ConstMetaList<? extends Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlR clone() {
		return (Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlR createInstance() {
		return (Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlR getValues(String... names) {
		return (Chk01_DtlR) super.getValues(names);
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
	 * Item_[Before change] 品目_[変更前].<p>
	 *
	 */
	public String itm_cd_key() {
		return getConstString(offset + 2, $itm_cd_key);
	}

	/**
	 * Item_[Before change] 品目_[変更前].<p>
	 *
	 */
	public void itm_cd_key(String value) {
		setConstString(offset + 2, $itm_cd_key, value);
	}


	/**
	 * Branch No. 1_[Before change] 枝番１_[変更前].<p>
	 *
	 */
	public String itm_sub1_key() {
		return getConstString(offset + 3, $itm_sub1_key);
	}

	/**
	 * Branch No. 1_[Before change] 枝番１_[変更前].<p>
	 *
	 */
	public void itm_sub1_key(String value) {
		setConstString(offset + 3, $itm_sub1_key, value);
	}


	/**
	 * Branch No. 2_[Before change] 枝番２_[変更前].<p>
	 *
	 */
	public String itm_sub2_key() {
		return getConstString(offset + 4, $itm_sub2_key);
	}

	/**
	 * Branch No. 2_[Before change] 枝番２_[変更前].<p>
	 *
	 */
	public void itm_sub2_key(String value) {
		setConstString(offset + 4, $itm_sub2_key, value);
	}


	/**
	 * Branch No. 3_[Before change] 枝番３_[変更前].<p>
	 *
	 */
	public String itm_sub3_key() {
		return getConstString(offset + 5, $itm_sub3_key);
	}

	/**
	 * Branch No. 3_[Before change] 枝番３_[変更前].<p>
	 *
	 */
	public void itm_sub3_key(String value) {
		setConstString(offset + 5, $itm_sub3_key, value);
	}


	/**
	 * Lot No._[Before change] ロットＮＯ_[変更前].<p>
	 *
	 */
	public String lot_no_key() {
		return getConstString(offset + 6, $lot_no_key);
	}

	/**
	 * Lot No._[Before change] ロットＮＯ_[変更前].<p>
	 *
	 */
	public void lot_no_key(String value) {
		setConstString(offset + 6, $lot_no_key, value);
	}


	/**
	 * Sublot No._[Before change] サブロットＮＯ_[変更前].<p>
	 *
	 */
	public String sublot_no_key() {
		return getConstString(offset + 7, $sublot_no_key);
	}

	/**
	 * Sublot No._[Before change] サブロットＮＯ_[変更前].<p>
	 *
	 */
	public void sublot_no_key(String value) {
		setConstString(offset + 7, $sublot_no_key, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 8, $itm_cd);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 8, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 9, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 9, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 10, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 10, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 11, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 11, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 12, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 12, $itm_nm, value);
	}


	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 13, $cont_fctr_flg);
	}

	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 13, $cont_fctr_flg, value);
	}


	/**
	 * For version control flg. 版管理対象ＦＬＧ.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 14, $ver_flg);
	}

	/**
	 * For version control flg. 版管理対象ＦＬＧ.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 14, $ver_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 15, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 15, $lot_mng_typ, value);
	}


	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public String lot_mng_typ_nm() {
		return getConstString(offset + 16, $lot_mng_typ_nm);
	}

	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public void lot_mng_typ_nm(String value) {
		setConstString(offset + 16, $lot_mng_typ_nm, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 17, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 17, $sublot_mng_typ, value);
	}


	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public String sublot_mng_typ_nm() {
		return getConstString(offset + 18, $sublot_mng_typ_nm);
	}

	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public void sublot_mng_typ_nm(String value) {
		setConstString(offset + 18, $sublot_mng_typ_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 19, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 19, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 20, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 20, $sublot_no, value);
	}


	/**
	 * Schedule 予定.<p>
	 *
	 */
	public boolean schd_flg() {
		return getConstBoolean(offset + 21, $schd_flg);
	}

	/**
	 * Schedule 予定.<p>
	 *
	 */
	public void schd_flg(boolean value) {
		setConstBoolean(offset + 21, $schd_flg, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 22, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 22, $ver_no, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 23, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 23, $first_gr_dt, value);
	}


	/**
	 * Standard GR date 基準入庫日.<p>
	 *
	 */
	public MCDate base_gr_dt() {
		return getConstDate(offset + 24, $base_gr_dt);
	}

	/**
	 * Standard GR date 基準入庫日.<p>
	 *
	 */
	public void base_gr_dt(MCDate value) {
		setConstDate(offset + 24, $base_gr_dt, value);
	}


	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public boolean unreg_lmt_flg() {
		return getConstBoolean(offset + 25, $unreg_lmt_flg);
	}

	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public void unreg_lmt_flg(boolean value) {
		setConstBoolean(offset + 25, $unreg_lmt_flg, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 26, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 26, $vld_dt, value);
	}


	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 27, $lmt_dt);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 27, $lmt_dt, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 28, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 28, $bp_lot_no, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 29, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 29, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 30, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 30, $stk_insp_typ_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 31, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 31, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 32, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 32, $quality_typ_nm, value);
	}


	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 33, $mfg_aprv_sts_typ);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 33, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public String mfg_aprv_sts_typ_nm() {
		return getConstString(offset + 34, $mfg_aprv_sts_typ_nm);
	}

	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public void mfg_aprv_sts_typ_nm(String value) {
		setConstString(offset + 34, $mfg_aprv_sts_typ_nm, value);
	}


	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 35, $insp_aprv_sts_typ);
	}

	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 35, $insp_aprv_sts_typ, value);
	}


	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public String insp_aprv_sts_typ_nm() {
		return getConstString(offset + 36, $insp_aprv_sts_typ_nm);
	}

	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public void insp_aprv_sts_typ_nm(String value) {
		setConstString(offset + 36, $insp_aprv_sts_typ_nm, value);
	}


	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return getConstString(offset + 37, $plnt_aprv_sts_typ);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		setConstString(offset + 37, $plnt_aprv_sts_typ, value);
	}


	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public String plnt_aprv_sts_typ_nm() {
		return getConstString(offset + 38, $plnt_aprv_sts_typ_nm);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_nm(String value) {
		setConstString(offset + 38, $plnt_aprv_sts_typ_nm, value);
	}


	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 39, $mrkt_judg_sts_typ);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 39, $mrkt_judg_sts_typ, value);
	}


	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 40, $mrkt_judg_sts_typ_nm);
	}

	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 40, $mrkt_judg_sts_typ_nm, value);
	}


	/**
	 * Save oldest date 最古日保存.<p>
	 *
	 */
	public boolean first_gr_dt_save_flg() {
		return getConstBoolean(offset + 41, $first_gr_dt_save_flg);
	}

	/**
	 * Save oldest date 最古日保存.<p>
	 *
	 */
	public void first_gr_dt_save_flg(boolean value) {
		setConstBoolean(offset + 41, $first_gr_dt_save_flg, value);
	}


	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 42, $act_cont_fctr);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 42, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 42, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 42, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 42, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 42, $act_cont_fctr, value);
	}


	/**
	 * Base date type 起算日区分.<p>
	 *
	 */
	public String lmt_dt_frm_typ() {
		return getConstString(offset + 43, $lmt_dt_frm_typ);
	}

	/**
	 * Base date type 起算日区分.<p>
	 *
	 */
	public void lmt_dt_frm_typ(String value) {
		setConstString(offset + 43, $lmt_dt_frm_typ, value);
	}


	/**
	 * Base date type name 起算日区分名.<p>
	 *
	 */
	public String lmt_dt_frm_typ_nm() {
		return getConstString(offset + 44, $lmt_dt_frm_typ_nm);
	}

	/**
	 * Base date type name 起算日区分名.<p>
	 *
	 */
	public void lmt_dt_frm_typ_nm(String value) {
		setConstString(offset + 44, $lmt_dt_frm_typ_nm, value);
	}


	/**
	 * Base date 起算日.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return getConstDate(offset + 45, $lmt_dt_frm);
	}

	/**
	 * Base date 起算日.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		setConstDate(offset + 45, $lmt_dt_frm, value);
	}


	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public String lot_seq() {
		return getConstString(offset + 46, $lot_seq);
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public void lot_seq(String value) {
		setConstString(offset + 46, $lot_seq, value);
	}


	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 47, $lot_rmrks);
	}

	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 47, $lot_rmrks, value);
	}


	/**
	 * Lot spare (String) 1 ロット予備（文字列）１.<p>
	 *
	 */
	public String lot_sub_char1() {
		return getConstString(offset + 48, $lot_sub_char1);
	}

	/**
	 * Lot spare (String) 1 ロット予備（文字列）１.<p>
	 *
	 */
	public void lot_sub_char1(String value) {
		setConstString(offset + 48, $lot_sub_char1, value);
	}


	/**
	 * Lot spare (String) 2 ロット予備（文字列）２.<p>
	 *
	 */
	public String lot_sub_char2() {
		return getConstString(offset + 49, $lot_sub_char2);
	}

	/**
	 * Lot spare (String) 2 ロット予備（文字列）２.<p>
	 *
	 */
	public void lot_sub_char2(String value) {
		setConstString(offset + 49, $lot_sub_char2, value);
	}


	/**
	 * Lot spare (String) 3 ロット予備（文字列）３.<p>
	 *
	 */
	public String lot_sub_char3() {
		return getConstString(offset + 50, $lot_sub_char3);
	}

	/**
	 * Lot spare (String) 3 ロット予備（文字列）３.<p>
	 *
	 */
	public void lot_sub_char3(String value) {
		setConstString(offset + 50, $lot_sub_char3, value);
	}


	/**
	 * Lot spare (String) 4 ロット予備（文字列）４.<p>
	 *
	 */
	public String lot_sub_char4() {
		return getConstString(offset + 51, $lot_sub_char4);
	}

	/**
	 * Lot spare (String) 4 ロット予備（文字列）４.<p>
	 *
	 */
	public void lot_sub_char4(String value) {
		setConstString(offset + 51, $lot_sub_char4, value);
	}


	/**
	 * Lot spare (String) 5 ロット予備（文字列）５.<p>
	 *
	 */
	public String lot_sub_char5() {
		return getConstString(offset + 52, $lot_sub_char5);
	}

	/**
	 * Lot spare (String) 5 ロット予備（文字列）５.<p>
	 *
	 */
	public void lot_sub_char5(String value) {
		setConstString(offset + 52, $lot_sub_char5, value);
	}


	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public MCNumber lot_sub_num1() {
		return getConstNumber(offset + 53, $lot_sub_num1);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(MCNumber value) {
		setConstNumber(offset + 53, $lot_sub_num1, value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(int value) {
		setConstNumber(offset + 53, $lot_sub_num1, value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(long value) {
		setConstNumber(offset + 53, $lot_sub_num1, value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(float value) {
		setConstNumber(offset + 53, $lot_sub_num1, value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(double value) {
		setConstNumber(offset + 53, $lot_sub_num1, value);
	}


	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public MCNumber lot_sub_num2() {
		return getConstNumber(offset + 54, $lot_sub_num2);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(MCNumber value) {
		setConstNumber(offset + 54, $lot_sub_num2, value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(int value) {
		setConstNumber(offset + 54, $lot_sub_num2, value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(long value) {
		setConstNumber(offset + 54, $lot_sub_num2, value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(float value) {
		setConstNumber(offset + 54, $lot_sub_num2, value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(double value) {
		setConstNumber(offset + 54, $lot_sub_num2, value);
	}


	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public MCNumber lot_sub_num3() {
		return getConstNumber(offset + 55, $lot_sub_num3);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(MCNumber value) {
		setConstNumber(offset + 55, $lot_sub_num3, value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(int value) {
		setConstNumber(offset + 55, $lot_sub_num3, value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(long value) {
		setConstNumber(offset + 55, $lot_sub_num3, value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(float value) {
		setConstNumber(offset + 55, $lot_sub_num3, value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(double value) {
		setConstNumber(offset + 55, $lot_sub_num3, value);
	}


	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public MCNumber lot_sub_num4() {
		return getConstNumber(offset + 56, $lot_sub_num4);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(MCNumber value) {
		setConstNumber(offset + 56, $lot_sub_num4, value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(int value) {
		setConstNumber(offset + 56, $lot_sub_num4, value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(long value) {
		setConstNumber(offset + 56, $lot_sub_num4, value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(float value) {
		setConstNumber(offset + 56, $lot_sub_num4, value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(double value) {
		setConstNumber(offset + 56, $lot_sub_num4, value);
	}


	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public MCNumber lot_sub_num5() {
		return getConstNumber(offset + 57, $lot_sub_num5);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(MCNumber value) {
		setConstNumber(offset + 57, $lot_sub_num5, value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(int value) {
		setConstNumber(offset + 57, $lot_sub_num5, value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(long value) {
		setConstNumber(offset + 57, $lot_sub_num5, value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(float value) {
		setConstNumber(offset + 57, $lot_sub_num5, value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(double value) {
		setConstNumber(offset + 57, $lot_sub_num5, value);
	}


	/**
	 * Lot spare (Date) 1 ロット予備（日付）１.<p>
	 *
	 */
	public MCDate lot_sub_dt1() {
		return getConstDate(offset + 58, $lot_sub_dt1);
	}

	/**
	 * Lot spare (Date) 1 ロット予備（日付）１.<p>
	 *
	 */
	public void lot_sub_dt1(MCDate value) {
		setConstDate(offset + 58, $lot_sub_dt1, value);
	}


	/**
	 * Lot spare (Date) 2 ロット予備（日付）２.<p>
	 *
	 */
	public MCDate lot_sub_dt2() {
		return getConstDate(offset + 59, $lot_sub_dt2);
	}

	/**
	 * Lot spare (Date) 2 ロット予備（日付）２.<p>
	 *
	 */
	public void lot_sub_dt2(MCDate value) {
		setConstDate(offset + 59, $lot_sub_dt2, value);
	}


	/**
	 * Lot spare (Date) 3 ロット予備（日付）３.<p>
	 *
	 */
	public MCDate lot_sub_dt3() {
		return getConstDate(offset + 60, $lot_sub_dt3);
	}

	/**
	 * Lot spare (Date) 3 ロット予備（日付）３.<p>
	 *
	 */
	public void lot_sub_dt3(MCDate value) {
		setConstDate(offset + 60, $lot_sub_dt3, value);
	}


	/**
	 * Lot spare (Date) 4 ロット予備（日付）４.<p>
	 *
	 */
	public MCDate lot_sub_dt4() {
		return getConstDate(offset + 61, $lot_sub_dt4);
	}

	/**
	 * Lot spare (Date) 4 ロット予備（日付）４.<p>
	 *
	 */
	public void lot_sub_dt4(MCDate value) {
		setConstDate(offset + 61, $lot_sub_dt4, value);
	}


	/**
	 * Lot spare (Date) 5 ロット予備（日付）５.<p>
	 *
	 */
	public MCDate lot_sub_dt5() {
		return getConstDate(offset + 62, $lot_sub_dt5);
	}

	/**
	 * Lot spare (Date) 5 ロット予備（日付）５.<p>
	 *
	 */
	public void lot_sub_dt5(MCDate value) {
		setConstDate(offset + 62, $lot_sub_dt5, value);
	}


	/**
	 * Lot spare (flg.) 1 ロット予備（ＦＬＧ）１.<p>
	 *
	 */
	public boolean lot_sub_flg1() {
		return getConstBoolean(offset + 63, $lot_sub_flg1);
	}

	/**
	 * Lot spare (flg.) 1 ロット予備（ＦＬＧ）１.<p>
	 *
	 */
	public void lot_sub_flg1(boolean value) {
		setConstBoolean(offset + 63, $lot_sub_flg1, value);
	}


	/**
	 * Lot spare (flg.) 2 ロット予備（ＦＬＧ）２.<p>
	 *
	 */
	public boolean lot_sub_flg2() {
		return getConstBoolean(offset + 64, $lot_sub_flg2);
	}

	/**
	 * Lot spare (flg.) 2 ロット予備（ＦＬＧ）２.<p>
	 *
	 */
	public void lot_sub_flg2(boolean value) {
		setConstBoolean(offset + 64, $lot_sub_flg2, value);
	}


	/**
	 * Lot spare (flg.) 3 ロット予備（ＦＬＧ）３.<p>
	 *
	 */
	public boolean lot_sub_flg3() {
		return getConstBoolean(offset + 65, $lot_sub_flg3);
	}

	/**
	 * Lot spare (flg.) 3 ロット予備（ＦＬＧ）３.<p>
	 *
	 */
	public void lot_sub_flg3(boolean value) {
		setConstBoolean(offset + 65, $lot_sub_flg3, value);
	}


	/**
	 * Lot spare (flg.) 4 ロット予備（ＦＬＧ）４.<p>
	 *
	 */
	public boolean lot_sub_flg4() {
		return getConstBoolean(offset + 66, $lot_sub_flg4);
	}

	/**
	 * Lot spare (flg.) 4 ロット予備（ＦＬＧ）４.<p>
	 *
	 */
	public void lot_sub_flg4(boolean value) {
		setConstBoolean(offset + 66, $lot_sub_flg4, value);
	}


	/**
	 * Lot spare (flg.) 5 ロット予備（ＦＬＧ）５.<p>
	 *
	 */
	public boolean lot_sub_flg5() {
		return getConstBoolean(offset + 67, $lot_sub_flg5);
	}

	/**
	 * Lot spare (flg.) 5 ロット予備（ＦＬＧ）５.<p>
	 *
	 */
	public void lot_sub_flg5(boolean value) {
		setConstBoolean(offset + 67, $lot_sub_flg5, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 68, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 68, $rtn_sts_typ, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 69, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($itm_cd_key.equalsIgnoreCase(name)) {
			return itm_cd_key();
		}
		if ($itm_sub1_key.equalsIgnoreCase(name)) {
			return itm_sub1_key();
		}
		if ($itm_sub2_key.equalsIgnoreCase(name)) {
			return itm_sub2_key();
		}
		if ($itm_sub3_key.equalsIgnoreCase(name)) {
			return itm_sub3_key();
		}
		if ($lot_no_key.equalsIgnoreCase(name)) {
			return lot_no_key();
		}
		if ($sublot_no_key.equalsIgnoreCase(name)) {
			return sublot_no_key();
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_mng_typ_nm.equalsIgnoreCase(name)) {
			return lot_mng_typ_nm();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			return sublot_mng_typ_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ();
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_nm();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ_nm();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			return lot_sub_char1();
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			return lot_sub_char2();
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			return lot_sub_char3();
		}
		if ($lot_sub_char4.equalsIgnoreCase(name)) {
			return lot_sub_char4();
		}
		if ($lot_sub_char5.equalsIgnoreCase(name)) {
			return lot_sub_char5();
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
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			return lot_sub_num1();
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			return lot_sub_num2();
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			return lot_sub_num3();
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			return lot_sub_num4();
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			return lot_sub_num5();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($base_gr_dt.equalsIgnoreCase(name)) {
			return base_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($lot_sub_dt1.equalsIgnoreCase(name)) {
			return lot_sub_dt1();
		}
		if ($lot_sub_dt2.equalsIgnoreCase(name)) {
			return lot_sub_dt2();
		}
		if ($lot_sub_dt3.equalsIgnoreCase(name)) {
			return lot_sub_dt3();
		}
		if ($lot_sub_dt4.equalsIgnoreCase(name)) {
			return lot_sub_dt4();
		}
		if ($lot_sub_dt5.equalsIgnoreCase(name)) {
			return lot_sub_dt5();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			return schd_flg();
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			return unreg_lmt_flg();
		}
		if ($first_gr_dt_save_flg.equalsIgnoreCase(name)) {
			return first_gr_dt_save_flg();
		}
		if ($lot_sub_flg1.equalsIgnoreCase(name)) {
			return lot_sub_flg1();
		}
		if ($lot_sub_flg2.equalsIgnoreCase(name)) {
			return lot_sub_flg2();
		}
		if ($lot_sub_flg3.equalsIgnoreCase(name)) {
			return lot_sub_flg3();
		}
		if ($lot_sub_flg4.equalsIgnoreCase(name)) {
			return lot_sub_flg4();
		}
		if ($lot_sub_flg5.equalsIgnoreCase(name)) {
			return lot_sub_flg5();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd_key.equalsIgnoreCase(name)) {
			return itm_cd_key();
		}
		if ($itm_sub1_key.equalsIgnoreCase(name)) {
			return itm_sub1_key();
		}
		if ($itm_sub2_key.equalsIgnoreCase(name)) {
			return itm_sub2_key();
		}
		if ($itm_sub3_key.equalsIgnoreCase(name)) {
			return itm_sub3_key();
		}
		if ($lot_no_key.equalsIgnoreCase(name)) {
			return lot_no_key();
		}
		if ($sublot_no_key.equalsIgnoreCase(name)) {
			return sublot_no_key();
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_mng_typ_nm.equalsIgnoreCase(name)) {
			return lot_mng_typ_nm();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			return sublot_mng_typ_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ();
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_nm();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ_nm();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			return lot_sub_char1();
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			return lot_sub_char2();
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			return lot_sub_char3();
		}
		if ($lot_sub_char4.equalsIgnoreCase(name)) {
			return lot_sub_char4();
		}
		if ($lot_sub_char5.equalsIgnoreCase(name)) {
			return lot_sub_char5();
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
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			return lot_sub_num1();
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			return lot_sub_num2();
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			return lot_sub_num3();
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			return lot_sub_num4();
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			return lot_sub_num5();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($base_gr_dt.equalsIgnoreCase(name)) {
			return base_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($lot_sub_dt1.equalsIgnoreCase(name)) {
			return lot_sub_dt1();
		}
		if ($lot_sub_dt2.equalsIgnoreCase(name)) {
			return lot_sub_dt2();
		}
		if ($lot_sub_dt3.equalsIgnoreCase(name)) {
			return lot_sub_dt3();
		}
		if ($lot_sub_dt4.equalsIgnoreCase(name)) {
			return lot_sub_dt4();
		}
		if ($lot_sub_dt5.equalsIgnoreCase(name)) {
			return lot_sub_dt5();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			return schd_flg();
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			return unreg_lmt_flg();
		}
		if ($first_gr_dt_save_flg.equalsIgnoreCase(name)) {
			return first_gr_dt_save_flg();
		}
		if ($lot_sub_flg1.equalsIgnoreCase(name)) {
			return lot_sub_flg1();
		}
		if ($lot_sub_flg2.equalsIgnoreCase(name)) {
			return lot_sub_flg2();
		}
		if ($lot_sub_flg3.equalsIgnoreCase(name)) {
			return lot_sub_flg3();
		}
		if ($lot_sub_flg4.equalsIgnoreCase(name)) {
			return lot_sub_flg4();
		}
		if ($lot_sub_flg5.equalsIgnoreCase(name)) {
			return lot_sub_flg5();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd_key.equalsIgnoreCase(name)) {
			itm_cd_key(value);
			return;
		}
		if ($itm_sub1_key.equalsIgnoreCase(name)) {
			itm_sub1_key(value);
			return;
		}
		if ($itm_sub2_key.equalsIgnoreCase(name)) {
			itm_sub2_key(value);
			return;
		}
		if ($itm_sub3_key.equalsIgnoreCase(name)) {
			itm_sub3_key(value);
			return;
		}
		if ($lot_no_key.equalsIgnoreCase(name)) {
			lot_no_key(value);
			return;
		}
		if ($sublot_no_key.equalsIgnoreCase(name)) {
			sublot_no_key(value);
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_mng_typ_nm.equalsIgnoreCase(name)) {
			lot_mng_typ_nm(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			sublot_mng_typ_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ_nm(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
			return;
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ(value);
			return;
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_nm(value);
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
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ_nm(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			lot_sub_char1(value);
			return;
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			lot_sub_char2(value);
			return;
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			lot_sub_char3(value);
			return;
		}
		if ($lot_sub_char4.equalsIgnoreCase(name)) {
			lot_sub_char4(value);
			return;
		}
		if ($lot_sub_char5.equalsIgnoreCase(name)) {
			lot_sub_char5(value);
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
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($base_gr_dt.equalsIgnoreCase(name)) {
			base_gr_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($lot_sub_dt1.equalsIgnoreCase(name)) {
			lot_sub_dt1(value);
			return;
		}
		if ($lot_sub_dt2.equalsIgnoreCase(name)) {
			lot_sub_dt2(value);
			return;
		}
		if ($lot_sub_dt3.equalsIgnoreCase(name)) {
			lot_sub_dt3(value);
			return;
		}
		if ($lot_sub_dt4.equalsIgnoreCase(name)) {
			lot_sub_dt4(value);
			return;
		}
		if ($lot_sub_dt5.equalsIgnoreCase(name)) {
			lot_sub_dt5(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			schd_flg(value);
			return;
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			unreg_lmt_flg(value);
			return;
		}
		if ($first_gr_dt_save_flg.equalsIgnoreCase(name)) {
			first_gr_dt_save_flg(value);
			return;
		}
		if ($lot_sub_flg1.equalsIgnoreCase(name)) {
			lot_sub_flg1(value);
			return;
		}
		if ($lot_sub_flg2.equalsIgnoreCase(name)) {
			lot_sub_flg2(value);
			return;
		}
		if ($lot_sub_flg3.equalsIgnoreCase(name)) {
			lot_sub_flg3(value);
			return;
		}
		if ($lot_sub_flg4.equalsIgnoreCase(name)) {
			lot_sub_flg4(value);
			return;
		}
		if ($lot_sub_flg5.equalsIgnoreCase(name)) {
			lot_sub_flg5(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd_key.equalsIgnoreCase(name)) {
			itm_cd_key(value);
			return;
		}
		if ($itm_sub1_key.equalsIgnoreCase(name)) {
			itm_sub1_key(value);
			return;
		}
		if ($itm_sub2_key.equalsIgnoreCase(name)) {
			itm_sub2_key(value);
			return;
		}
		if ($itm_sub3_key.equalsIgnoreCase(name)) {
			itm_sub3_key(value);
			return;
		}
		if ($lot_no_key.equalsIgnoreCase(name)) {
			lot_no_key(value);
			return;
		}
		if ($sublot_no_key.equalsIgnoreCase(name)) {
			sublot_no_key(value);
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
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_mng_typ_nm.equalsIgnoreCase(name)) {
			lot_mng_typ_nm(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ_nm.equalsIgnoreCase(name)) {
			sublot_mng_typ_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ_nm(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
			return;
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ(value);
			return;
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_nm(value);
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
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ_nm(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($lot_sub_char1.equalsIgnoreCase(name)) {
			lot_sub_char1(value);
			return;
		}
		if ($lot_sub_char2.equalsIgnoreCase(name)) {
			lot_sub_char2(value);
			return;
		}
		if ($lot_sub_char3.equalsIgnoreCase(name)) {
			lot_sub_char3(value);
			return;
		}
		if ($lot_sub_char4.equalsIgnoreCase(name)) {
			lot_sub_char4(value);
			return;
		}
		if ($lot_sub_char5.equalsIgnoreCase(name)) {
			lot_sub_char5(value);
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
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($lot_sub_num1.equalsIgnoreCase(name)) {
			lot_sub_num1(value);
			return;
		}
		if ($lot_sub_num2.equalsIgnoreCase(name)) {
			lot_sub_num2(value);
			return;
		}
		if ($lot_sub_num3.equalsIgnoreCase(name)) {
			lot_sub_num3(value);
			return;
		}
		if ($lot_sub_num4.equalsIgnoreCase(name)) {
			lot_sub_num4(value);
			return;
		}
		if ($lot_sub_num5.equalsIgnoreCase(name)) {
			lot_sub_num5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($base_gr_dt.equalsIgnoreCase(name)) {
			base_gr_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($lot_sub_dt1.equalsIgnoreCase(name)) {
			lot_sub_dt1(value);
			return;
		}
		if ($lot_sub_dt2.equalsIgnoreCase(name)) {
			lot_sub_dt2(value);
			return;
		}
		if ($lot_sub_dt3.equalsIgnoreCase(name)) {
			lot_sub_dt3(value);
			return;
		}
		if ($lot_sub_dt4.equalsIgnoreCase(name)) {
			lot_sub_dt4(value);
			return;
		}
		if ($lot_sub_dt5.equalsIgnoreCase(name)) {
			lot_sub_dt5(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($schd_flg.equalsIgnoreCase(name)) {
			schd_flg(value);
			return;
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			unreg_lmt_flg(value);
			return;
		}
		if ($first_gr_dt_save_flg.equalsIgnoreCase(name)) {
			first_gr_dt_save_flg(value);
			return;
		}
		if ($lot_sub_flg1.equalsIgnoreCase(name)) {
			lot_sub_flg1(value);
			return;
		}
		if ($lot_sub_flg2.equalsIgnoreCase(name)) {
			lot_sub_flg2(value);
			return;
		}
		if ($lot_sub_flg3.equalsIgnoreCase(name)) {
			lot_sub_flg3(value);
			return;
		}
		if ($lot_sub_flg4.equalsIgnoreCase(name)) {
			lot_sub_flg4(value);
			return;
		}
		if ($lot_sub_flg5.equalsIgnoreCase(name)) {
			lot_sub_flg5(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

