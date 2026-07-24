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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

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
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public static final String $lot_seq = "lot_seq";
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public static final String $schd_flg = "schd_flg";
	/**
	 * Save oldest date 最古日保存.<p>
	 *
	 */
	public static final String $first_gr_dt_save_flg = "first_gr_dt_save_flg";
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
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
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
	 * Factory release approval type 工場出荷承認区分.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ = "plnt_aprv_sts_typ";
	/**
	 * Factory release approval type name 工場出荷承認区分名.<p>
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
	 * Lot No. management type ロットＮＯ管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Lot No. management type name ロットＮＯ管理区分名.<p>
	 *
	 */
	public static final String $lot_mng_typ_nm = "lot_mng_typ_nm";
	/**
	 * Sublot No. management type サブロットＮＯ管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Sublot No. management type name サブロットＮＯ管理区分名.<p>
	 *
	 */
	public static final String $sublot_mng_typ_nm = "sublot_mng_typ_nm";
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
	 * Inventory record exists 在庫レコードあり.<p>
	 *
	 */
	public static final String $stk_flg = "stk_flg";
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
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
	/**
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function 登録機能.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function 更新機能.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_seq_META = createCommonMeta($lot_seq, mcframe.commonMA.meta.MA_META.LOT_SEQ);
	public static final MCMeta schd_flg_META = createCommonMeta($schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta first_gr_dt_save_flg_META = createCommonMeta($first_gr_dt_save_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_gr_dt_META = createCommonMeta($base_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta unreg_lmt_flg_META = createCommonMeta($unreg_lmt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta mfg_aprv_sts_typ_nm_META = createCommonMeta($mfg_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta insp_aprv_sts_typ_nm_META = createCommonMeta($insp_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP_NM);
	public static final MCMeta plnt_aprv_sts_typ_META = createCommonMeta($plnt_aprv_sts_typ, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP);
	public static final MCMeta plnt_aprv_sts_typ_nm_META = createCommonMeta($plnt_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP_NM);
	public static final MCMeta mrkt_judg_sts_typ_META = createCommonMeta($mrkt_judg_sts_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP);
	public static final MCMeta mrkt_judg_sts_typ_nm_META = createCommonMeta($mrkt_judg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP_NM);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_mng_typ_nm_META = createCommonMeta($lot_mng_typ_nm, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP_NM);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_nm_META = createCommonMeta($sublot_mng_typ_nm, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP_NM);
	public static final MCMeta lmt_dt_frm_typ_META = createCommonMeta($lmt_dt_frm_typ, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP);
	public static final MCMeta lmt_dt_frm_typ_nm_META = createCommonMeta($lmt_dt_frm_typ_nm, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP_NM);
	public static final MCMeta lmt_dt_frm_META = createCommonMeta($lmt_dt_frm, mcframe.commonMA.meta.MA_META.DT);
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
	public static final MCMeta stk_flg_META = createCommonMeta($stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			sundry_itm_flg_META,
			cont_fctr_flg_META,
			ver_flg_META,
			lot_no_META,
			sublot_no_META,
			ver_no_META,
			lot_seq_META,
			schd_flg_META,
			first_gr_dt_save_flg_META,
			first_gr_dt_META,
			base_gr_dt_META,
			unreg_lmt_flg_META,
			vld_dt_META,
			lmt_dt_META,
			act_cont_fctr_META,
			bp_lot_no_META,
			mfg_aprv_sts_typ_META,
			mfg_aprv_sts_typ_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			insp_aprv_sts_typ_META,
			insp_aprv_sts_typ_nm_META,
			plnt_aprv_sts_typ_META,
			plnt_aprv_sts_typ_nm_META,
			mrkt_judg_sts_typ_META,
			mrkt_judg_sts_typ_nm_META,
			lot_mng_typ_META,
			lot_mng_typ_nm_META,
			sublot_mng_typ_META,
			sublot_mng_typ_nm_META,
			lmt_dt_frm_typ_META,
			lmt_dt_frm_typ_nm_META,
			lmt_dt_frm_META,
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
			stk_flg_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$mfg_aprv_sts_typ, "MSC_MFG_APRV_STS_TYP"},	// mfg_aprv_sts_typ
				{$stk_insp_typ, "MSC_STK_INSP_TYP"},	// stk_insp_typ
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$insp_aprv_sts_typ, "MSC_INSP_APRV_STS_TYP"},	// insp_aprv_sts_typ
				{$plnt_aprv_sts_typ, "MSC_PLNT_APRV_STS_TYP"},	// plnt_aprv_sts_typ
				{$mrkt_judg_sts_typ, "MSC_MRKT_JUDG_STS_TYP"},	// mrkt_judg_sts_typ
				{$lot_mng_typ, "MAC_LOT_MNG_TYP"},	// lot_mng_typ
				{$sublot_mng_typ, "MAC_SUBLOT_MNG_TYP"},	// sublot_mng_typ
				{$lmt_dt_frm_typ, "MAC_LMT_DT_FRM_TYP"},	// lmt_dt_frm_typ
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 4, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 4, $itm_nm, value);
	}


	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 5, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 5, $sundry_itm_flg, value);
	}


	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 6, $cont_fctr_flg);
	}

	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 6, $cont_fctr_flg, value);
	}


	/**
	 * For version control flg. 版管理対象ＦＬＧ.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 7, $ver_flg);
	}

	/**
	 * For version control flg. 版管理対象ＦＬＧ.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 7, $ver_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 8, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 8, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 9, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 9, $sublot_no, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 10, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 10, $ver_no, value);
	}


	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public String lot_seq() {
		return getConstString(offset + 11, $lot_seq);
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public void lot_seq(String value) {
		setConstString(offset + 11, $lot_seq, value);
	}


	/**
	 * Schedule 予定.<p>
	 *
	 */
	public boolean schd_flg() {
		return getConstBoolean(offset + 12, $schd_flg);
	}

	/**
	 * Schedule 予定.<p>
	 *
	 */
	public void schd_flg(boolean value) {
		setConstBoolean(offset + 12, $schd_flg, value);
	}


	/**
	 * Save oldest date 最古日保存.<p>
	 *
	 */
	public boolean first_gr_dt_save_flg() {
		return getConstBoolean(offset + 13, $first_gr_dt_save_flg);
	}

	/**
	 * Save oldest date 最古日保存.<p>
	 *
	 */
	public void first_gr_dt_save_flg(boolean value) {
		setConstBoolean(offset + 13, $first_gr_dt_save_flg, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 14, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 14, $first_gr_dt, value);
	}


	/**
	 * Standard GR date 基準入庫日.<p>
	 *
	 */
	public MCDate base_gr_dt() {
		return getConstDate(offset + 15, $base_gr_dt);
	}

	/**
	 * Standard GR date 基準入庫日.<p>
	 *
	 */
	public void base_gr_dt(MCDate value) {
		setConstDate(offset + 15, $base_gr_dt, value);
	}


	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public boolean unreg_lmt_flg() {
		return getConstBoolean(offset + 16, $unreg_lmt_flg);
	}

	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public void unreg_lmt_flg(boolean value) {
		setConstBoolean(offset + 16, $unreg_lmt_flg, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 17, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 17, $vld_dt, value);
	}


	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 18, $lmt_dt);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 18, $lmt_dt, value);
	}


	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 19, $act_cont_fctr);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 19, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 19, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 19, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 19, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 19, $act_cont_fctr, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 20, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 20, $bp_lot_no, value);
	}


	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 21, $mfg_aprv_sts_typ);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 21, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public String mfg_aprv_sts_typ_nm() {
		return getConstString(offset + 22, $mfg_aprv_sts_typ_nm);
	}

	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public void mfg_aprv_sts_typ_nm(String value) {
		setConstString(offset + 22, $mfg_aprv_sts_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 23, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 23, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 24, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 24, $stk_insp_typ_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 25, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 25, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 26, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 26, $quality_typ_nm, value);
	}


	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 27, $insp_aprv_sts_typ);
	}

	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 27, $insp_aprv_sts_typ, value);
	}


	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public String insp_aprv_sts_typ_nm() {
		return getConstString(offset + 28, $insp_aprv_sts_typ_nm);
	}

	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public void insp_aprv_sts_typ_nm(String value) {
		setConstString(offset + 28, $insp_aprv_sts_typ_nm, value);
	}


	/**
	 * Factory release approval type 工場出荷承認区分.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return getConstString(offset + 29, $plnt_aprv_sts_typ);
	}

	/**
	 * Factory release approval type 工場出荷承認区分.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		setConstString(offset + 29, $plnt_aprv_sts_typ, value);
	}


	/**
	 * Factory release approval type name 工場出荷承認区分名.<p>
	 *
	 */
	public String plnt_aprv_sts_typ_nm() {
		return getConstString(offset + 30, $plnt_aprv_sts_typ_nm);
	}

	/**
	 * Factory release approval type name 工場出荷承認区分名.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_nm(String value) {
		setConstString(offset + 30, $plnt_aprv_sts_typ_nm, value);
	}


	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 31, $mrkt_judg_sts_typ);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 31, $mrkt_judg_sts_typ, value);
	}


	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 32, $mrkt_judg_sts_typ_nm);
	}

	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 32, $mrkt_judg_sts_typ_nm, value);
	}


	/**
	 * Lot No. management type ロットＮＯ管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 33, $lot_mng_typ);
	}

	/**
	 * Lot No. management type ロットＮＯ管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 33, $lot_mng_typ, value);
	}


	/**
	 * Lot No. management type name ロットＮＯ管理区分名.<p>
	 *
	 */
	public String lot_mng_typ_nm() {
		return getConstString(offset + 34, $lot_mng_typ_nm);
	}

	/**
	 * Lot No. management type name ロットＮＯ管理区分名.<p>
	 *
	 */
	public void lot_mng_typ_nm(String value) {
		setConstString(offset + 34, $lot_mng_typ_nm, value);
	}


	/**
	 * Sublot No. management type サブロットＮＯ管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 35, $sublot_mng_typ);
	}

	/**
	 * Sublot No. management type サブロットＮＯ管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 35, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. management type name サブロットＮＯ管理区分名.<p>
	 *
	 */
	public String sublot_mng_typ_nm() {
		return getConstString(offset + 36, $sublot_mng_typ_nm);
	}

	/**
	 * Sublot No. management type name サブロットＮＯ管理区分名.<p>
	 *
	 */
	public void sublot_mng_typ_nm(String value) {
		setConstString(offset + 36, $sublot_mng_typ_nm, value);
	}


	/**
	 * Base date type 起算日区分.<p>
	 *
	 */
	public String lmt_dt_frm_typ() {
		return getConstString(offset + 37, $lmt_dt_frm_typ);
	}

	/**
	 * Base date type 起算日区分.<p>
	 *
	 */
	public void lmt_dt_frm_typ(String value) {
		setConstString(offset + 37, $lmt_dt_frm_typ, value);
	}


	/**
	 * Base date type name 起算日区分名.<p>
	 *
	 */
	public String lmt_dt_frm_typ_nm() {
		return getConstString(offset + 38, $lmt_dt_frm_typ_nm);
	}

	/**
	 * Base date type name 起算日区分名.<p>
	 *
	 */
	public void lmt_dt_frm_typ_nm(String value) {
		setConstString(offset + 38, $lmt_dt_frm_typ_nm, value);
	}


	/**
	 * Base date 起算日.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return getConstDate(offset + 39, $lmt_dt_frm);
	}

	/**
	 * Base date 起算日.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		setConstDate(offset + 39, $lmt_dt_frm, value);
	}


	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 40, $lot_rmrks);
	}

	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 40, $lot_rmrks, value);
	}


	/**
	 * Lot spare (String) 1 ロット予備（文字列）１.<p>
	 *
	 */
	public String lot_sub_char1() {
		return getConstString(offset + 41, $lot_sub_char1);
	}

	/**
	 * Lot spare (String) 1 ロット予備（文字列）１.<p>
	 *
	 */
	public void lot_sub_char1(String value) {
		setConstString(offset + 41, $lot_sub_char1, value);
	}


	/**
	 * Lot spare (String) 2 ロット予備（文字列）２.<p>
	 *
	 */
	public String lot_sub_char2() {
		return getConstString(offset + 42, $lot_sub_char2);
	}

	/**
	 * Lot spare (String) 2 ロット予備（文字列）２.<p>
	 *
	 */
	public void lot_sub_char2(String value) {
		setConstString(offset + 42, $lot_sub_char2, value);
	}


	/**
	 * Lot spare (String) 3 ロット予備（文字列）３.<p>
	 *
	 */
	public String lot_sub_char3() {
		return getConstString(offset + 43, $lot_sub_char3);
	}

	/**
	 * Lot spare (String) 3 ロット予備（文字列）３.<p>
	 *
	 */
	public void lot_sub_char3(String value) {
		setConstString(offset + 43, $lot_sub_char3, value);
	}


	/**
	 * Lot spare (String) 4 ロット予備（文字列）４.<p>
	 *
	 */
	public String lot_sub_char4() {
		return getConstString(offset + 44, $lot_sub_char4);
	}

	/**
	 * Lot spare (String) 4 ロット予備（文字列）４.<p>
	 *
	 */
	public void lot_sub_char4(String value) {
		setConstString(offset + 44, $lot_sub_char4, value);
	}


	/**
	 * Lot spare (String) 5 ロット予備（文字列）５.<p>
	 *
	 */
	public String lot_sub_char5() {
		return getConstString(offset + 45, $lot_sub_char5);
	}

	/**
	 * Lot spare (String) 5 ロット予備（文字列）５.<p>
	 *
	 */
	public void lot_sub_char5(String value) {
		setConstString(offset + 45, $lot_sub_char5, value);
	}


	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public MCNumber lot_sub_num1() {
		return getConstNumber(offset + 46, $lot_sub_num1);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(MCNumber value) {
		setConstNumber(offset + 46, $lot_sub_num1, value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(int value) {
		setConstNumber(offset + 46, $lot_sub_num1, value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(long value) {
		setConstNumber(offset + 46, $lot_sub_num1, value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(float value) {
		setConstNumber(offset + 46, $lot_sub_num1, value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(double value) {
		setConstNumber(offset + 46, $lot_sub_num1, value);
	}


	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public MCNumber lot_sub_num2() {
		return getConstNumber(offset + 47, $lot_sub_num2);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(MCNumber value) {
		setConstNumber(offset + 47, $lot_sub_num2, value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(int value) {
		setConstNumber(offset + 47, $lot_sub_num2, value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(long value) {
		setConstNumber(offset + 47, $lot_sub_num2, value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(float value) {
		setConstNumber(offset + 47, $lot_sub_num2, value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(double value) {
		setConstNumber(offset + 47, $lot_sub_num2, value);
	}


	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public MCNumber lot_sub_num3() {
		return getConstNumber(offset + 48, $lot_sub_num3);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(MCNumber value) {
		setConstNumber(offset + 48, $lot_sub_num3, value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(int value) {
		setConstNumber(offset + 48, $lot_sub_num3, value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(long value) {
		setConstNumber(offset + 48, $lot_sub_num3, value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(float value) {
		setConstNumber(offset + 48, $lot_sub_num3, value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(double value) {
		setConstNumber(offset + 48, $lot_sub_num3, value);
	}


	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public MCNumber lot_sub_num4() {
		return getConstNumber(offset + 49, $lot_sub_num4);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(MCNumber value) {
		setConstNumber(offset + 49, $lot_sub_num4, value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(int value) {
		setConstNumber(offset + 49, $lot_sub_num4, value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(long value) {
		setConstNumber(offset + 49, $lot_sub_num4, value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(float value) {
		setConstNumber(offset + 49, $lot_sub_num4, value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(double value) {
		setConstNumber(offset + 49, $lot_sub_num4, value);
	}


	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public MCNumber lot_sub_num5() {
		return getConstNumber(offset + 50, $lot_sub_num5);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(MCNumber value) {
		setConstNumber(offset + 50, $lot_sub_num5, value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(int value) {
		setConstNumber(offset + 50, $lot_sub_num5, value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(long value) {
		setConstNumber(offset + 50, $lot_sub_num5, value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(float value) {
		setConstNumber(offset + 50, $lot_sub_num5, value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(double value) {
		setConstNumber(offset + 50, $lot_sub_num5, value);
	}


	/**
	 * Lot spare (Date) 1 ロット予備（日付）１.<p>
	 *
	 */
	public MCDate lot_sub_dt1() {
		return getConstDate(offset + 51, $lot_sub_dt1);
	}

	/**
	 * Lot spare (Date) 1 ロット予備（日付）１.<p>
	 *
	 */
	public void lot_sub_dt1(MCDate value) {
		setConstDate(offset + 51, $lot_sub_dt1, value);
	}


	/**
	 * Lot spare (Date) 2 ロット予備（日付）２.<p>
	 *
	 */
	public MCDate lot_sub_dt2() {
		return getConstDate(offset + 52, $lot_sub_dt2);
	}

	/**
	 * Lot spare (Date) 2 ロット予備（日付）２.<p>
	 *
	 */
	public void lot_sub_dt2(MCDate value) {
		setConstDate(offset + 52, $lot_sub_dt2, value);
	}


	/**
	 * Lot spare (Date) 3 ロット予備（日付）３.<p>
	 *
	 */
	public MCDate lot_sub_dt3() {
		return getConstDate(offset + 53, $lot_sub_dt3);
	}

	/**
	 * Lot spare (Date) 3 ロット予備（日付）３.<p>
	 *
	 */
	public void lot_sub_dt3(MCDate value) {
		setConstDate(offset + 53, $lot_sub_dt3, value);
	}


	/**
	 * Lot spare (Date) 4 ロット予備（日付）４.<p>
	 *
	 */
	public MCDate lot_sub_dt4() {
		return getConstDate(offset + 54, $lot_sub_dt4);
	}

	/**
	 * Lot spare (Date) 4 ロット予備（日付）４.<p>
	 *
	 */
	public void lot_sub_dt4(MCDate value) {
		setConstDate(offset + 54, $lot_sub_dt4, value);
	}


	/**
	 * Lot spare (Date) 5 ロット予備（日付）５.<p>
	 *
	 */
	public MCDate lot_sub_dt5() {
		return getConstDate(offset + 55, $lot_sub_dt5);
	}

	/**
	 * Lot spare (Date) 5 ロット予備（日付）５.<p>
	 *
	 */
	public void lot_sub_dt5(MCDate value) {
		setConstDate(offset + 55, $lot_sub_dt5, value);
	}


	/**
	 * Lot spare (flg.) 1 ロット予備（ＦＬＧ）１.<p>
	 *
	 */
	public boolean lot_sub_flg1() {
		return getConstBoolean(offset + 56, $lot_sub_flg1);
	}

	/**
	 * Lot spare (flg.) 1 ロット予備（ＦＬＧ）１.<p>
	 *
	 */
	public void lot_sub_flg1(boolean value) {
		setConstBoolean(offset + 56, $lot_sub_flg1, value);
	}


	/**
	 * Lot spare (flg.) 2 ロット予備（ＦＬＧ）２.<p>
	 *
	 */
	public boolean lot_sub_flg2() {
		return getConstBoolean(offset + 57, $lot_sub_flg2);
	}

	/**
	 * Lot spare (flg.) 2 ロット予備（ＦＬＧ）２.<p>
	 *
	 */
	public void lot_sub_flg2(boolean value) {
		setConstBoolean(offset + 57, $lot_sub_flg2, value);
	}


	/**
	 * Lot spare (flg.) 3 ロット予備（ＦＬＧ）３.<p>
	 *
	 */
	public boolean lot_sub_flg3() {
		return getConstBoolean(offset + 58, $lot_sub_flg3);
	}

	/**
	 * Lot spare (flg.) 3 ロット予備（ＦＬＧ）３.<p>
	 *
	 */
	public void lot_sub_flg3(boolean value) {
		setConstBoolean(offset + 58, $lot_sub_flg3, value);
	}


	/**
	 * Lot spare (flg.) 4 ロット予備（ＦＬＧ）４.<p>
	 *
	 */
	public boolean lot_sub_flg4() {
		return getConstBoolean(offset + 59, $lot_sub_flg4);
	}

	/**
	 * Lot spare (flg.) 4 ロット予備（ＦＬＧ）４.<p>
	 *
	 */
	public void lot_sub_flg4(boolean value) {
		setConstBoolean(offset + 59, $lot_sub_flg4, value);
	}


	/**
	 * Lot spare (flg.) 5 ロット予備（ＦＬＧ）５.<p>
	 *
	 */
	public boolean lot_sub_flg5() {
		return getConstBoolean(offset + 60, $lot_sub_flg5);
	}

	/**
	 * Lot spare (flg.) 5 ロット予備（ＦＬＧ）５.<p>
	 *
	 */
	public void lot_sub_flg5(boolean value) {
		setConstBoolean(offset + 60, $lot_sub_flg5, value);
	}


	/**
	 * Inventory record exists 在庫レコードあり.<p>
	 *
	 */
	public boolean stk_flg() {
		return getConstBoolean(offset + 61, $stk_flg);
	}

	/**
	 * Inventory record exists 在庫レコードあり.<p>
	 *
	 */
	public void stk_flg(boolean value) {
		setConstBoolean(offset + 61, $stk_flg, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 62, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 62, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 63, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 63, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 64, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 64, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 65, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 65, $itm_typ_d_nm, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 66, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 66, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 67, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 67, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 68, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 68, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 69, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 69, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 70, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 70, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 71, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 71, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 72, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 72, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 73, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 73, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 74, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 74, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 75, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 75, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 76, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 76, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 77, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 77, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 78, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 78, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 79, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 79, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 80, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 80, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 81, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 81, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 82, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 82, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 83, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 83, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 84, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 84, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 85, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 85, $itm_grp_nm10, value);
	}


	/**
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 86, $ins_usr_id);
	}

	/**
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 86, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 87, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 87, $ins_usr_nm, value);
	}


	/**
	 * Entry function 登録機能.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 88, $ins_func_id);
	}

	/**
	 * Entry function 登録機能.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 88, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 89, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 89, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 90, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 90, $ins_ts, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 91, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 91, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 91, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 91, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 91, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 91, $upd_cntr, value);
	}


	/**
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 92, $upd_usr_id);
	}

	/**
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 92, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 93, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 93, $upd_usr_nm, value);
	}


	/**
	 * Update function 更新機能.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 94, $upd_func_id);
	}

	/**
	 * Update function 更新機能.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 94, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 95, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 95, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 96, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 96, $upd_ts, value);
	}


	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 97, $upd_srv_req_no);
	}

	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 97, $upd_srv_req_no, value);
	}


	public String getString(String name) {
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
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
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ_nm();
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
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
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
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
		if ($first_gr_dt_save_flg.equalsIgnoreCase(name)) {
			return first_gr_dt_save_flg();
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			return unreg_lmt_flg();
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
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
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
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ_nm();
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
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
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
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
		if ($first_gr_dt_save_flg.equalsIgnoreCase(name)) {
			return first_gr_dt_save_flg();
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			return unreg_lmt_flg();
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
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ_nm(value);
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
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
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
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
		if ($first_gr_dt_save_flg.equalsIgnoreCase(name)) {
			first_gr_dt_save_flg(value);
			return;
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			unreg_lmt_flg(value);
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
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ_nm(value);
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
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
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
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
		if ($first_gr_dt_save_flg.equalsIgnoreCase(name)) {
			first_gr_dt_save_flg(value);
			return;
		}
		if ($unreg_lmt_flg.equalsIgnoreCase(name)) {
			unreg_lmt_flg(value);
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
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

