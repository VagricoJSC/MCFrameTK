package mcframe.serverMSBE.MSBEL1760;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * New entry (For SQL statement search) 新規登録（SQL文検索用）.<p>
	 *
	 */
	public static final String $is_crt = "is_crt";
	/**
	 * Correct/cancel (For SQL statement search) 訂正・取消（SQL文検索用）.<p>
	 *
	 */
	public static final String $is_upd_del = "is_upd_del";
	/**
	 * Reference (For SQL statement search) 参照（SQL文検索用）.<p>
	 *
	 */
	public static final String $is_ref = "is_ref";
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	/**
	 * Completion (Scheduled) date FROM 完了（予定）日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $cmpl_schd_dt_fr = "cmpl_schd_dt_fr";
	/**
	 * Completion (Scheduled) date TO 完了（予定）日ＴＯ.<p>
	 *
	 */
	public static final String $cmpl_schd_dt_to = "cmpl_schd_dt_to";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public static final String $ship_rqst_no = "ship_rqst_no";
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public static final String $dlv_id_typ = "dlv_id_typ";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public static final String $ship_rqst_id_typ = "ship_rqst_id_typ";
	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public static final String $ship_rqst_id_cd = "ship_rqst_id_cd";
	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public static final String $ship_rqst_id_nm = "ship_rqst_id_nm";
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
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public static final String $dlv_grp_flg1 = "dlv_grp_flg1";
	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public static final String $dlv_grp_cd1 = "dlv_grp_cd1";
	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public static final String $dlv_grp_nm1 = "dlv_grp_nm1";
	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public static final String $dlv_grp_flg2 = "dlv_grp_flg2";
	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public static final String $dlv_grp_cd2 = "dlv_grp_cd2";
	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public static final String $dlv_grp_nm2 = "dlv_grp_nm2";
	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public static final String $dlv_grp_flg3 = "dlv_grp_flg3";
	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public static final String $dlv_grp_cd3 = "dlv_grp_cd3";
	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public static final String $dlv_grp_nm3 = "dlv_grp_nm3";
	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public static final String $dlv_grp_flg4 = "dlv_grp_flg4";
	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public static final String $dlv_grp_cd4 = "dlv_grp_cd4";
	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public static final String $dlv_grp_nm4 = "dlv_grp_nm4";
	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public static final String $dlv_grp_flg5 = "dlv_grp_flg5";
	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public static final String $dlv_grp_cd5 = "dlv_grp_cd5";
	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public static final String $dlv_grp_nm5 = "dlv_grp_nm5";
	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public static final String $dlv_grp_flg6 = "dlv_grp_flg6";
	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public static final String $dlv_grp_cd6 = "dlv_grp_cd6";
	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public static final String $dlv_grp_nm6 = "dlv_grp_nm6";
	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public static final String $dlv_grp_flg7 = "dlv_grp_flg7";
	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public static final String $dlv_grp_cd7 = "dlv_grp_cd7";
	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public static final String $dlv_grp_nm7 = "dlv_grp_nm7";
	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public static final String $dlv_grp_flg8 = "dlv_grp_flg8";
	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public static final String $dlv_grp_cd8 = "dlv_grp_cd8";
	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public static final String $dlv_grp_nm8 = "dlv_grp_nm8";
	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public static final String $dlv_grp_flg9 = "dlv_grp_flg9";
	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public static final String $dlv_grp_cd9 = "dlv_grp_cd9";
	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public static final String $dlv_grp_nm9 = "dlv_grp_nm9";
	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public static final String $dlv_grp_flg10 = "dlv_grp_flg10";
	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $dlv_grp_cd10 = "dlv_grp_cd10";
	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public static final String $dlv_grp_nm10 = "dlv_grp_nm10";
	/**
	 * Shipping requested classification 1 出荷依頼先分類１.<p>
	 *
	 */
	public static final String $rqst_grp_flg1 = "rqst_grp_flg1";
	/**
	 * Shipping requested classification cd.1 出荷依頼先分類ＣＤ１.<p>
	 *
	 */
	public static final String $rqst_grp_cd1 = "rqst_grp_cd1";
	/**
	 * Shipping requested classification name 1 出荷依頼先分類名１.<p>
	 *
	 */
	public static final String $rqst_grp_nm1 = "rqst_grp_nm1";
	/**
	 * Shipping requested classification 2 出荷依頼先分類２.<p>
	 *
	 */
	public static final String $rqst_grp_flg2 = "rqst_grp_flg2";
	/**
	 * Shipping requested classification cd.2 出荷依頼先分類ＣＤ２.<p>
	 *
	 */
	public static final String $rqst_grp_cd2 = "rqst_grp_cd2";
	/**
	 * Shipping requested classification name 2 出荷依頼先分類名２.<p>
	 *
	 */
	public static final String $rqst_grp_nm2 = "rqst_grp_nm2";
	/**
	 * Shipping requested classification 3 出荷依頼先分類３.<p>
	 *
	 */
	public static final String $rqst_grp_flg3 = "rqst_grp_flg3";
	/**
	 * Shipping requested classification cd.3 出荷依頼先分類ＣＤ３.<p>
	 *
	 */
	public static final String $rqst_grp_cd3 = "rqst_grp_cd3";
	/**
	 * Shipping requested classification name 3 出荷依頼先分類名３.<p>
	 *
	 */
	public static final String $rqst_grp_nm3 = "rqst_grp_nm3";
	/**
	 * Shipping requested classification 4 出荷依頼先分類４.<p>
	 *
	 */
	public static final String $rqst_grp_flg4 = "rqst_grp_flg4";
	/**
	 * Shipping requested classification cd.4 出荷依頼先分類ＣＤ４.<p>
	 *
	 */
	public static final String $rqst_grp_cd4 = "rqst_grp_cd4";
	/**
	 * Shipping requested classification name 4 出荷依頼先分類名４.<p>
	 *
	 */
	public static final String $rqst_grp_nm4 = "rqst_grp_nm4";
	/**
	 * Shipping requested classification 5 出荷依頼先分類５.<p>
	 *
	 */
	public static final String $rqst_grp_flg5 = "rqst_grp_flg5";
	/**
	 * Shipping requested classification cd.5 出荷依頼先分類ＣＤ５.<p>
	 *
	 */
	public static final String $rqst_grp_cd5 = "rqst_grp_cd5";
	/**
	 * Shipping requested classification name 5 出荷依頼先分類名５.<p>
	 *
	 */
	public static final String $rqst_grp_nm5 = "rqst_grp_nm5";
	/**
	 * Shipping requested classification 6 出荷依頼先分類６.<p>
	 *
	 */
	public static final String $rqst_grp_flg6 = "rqst_grp_flg6";
	/**
	 * Shipping requested classification cd.6 出荷依頼先分類ＣＤ６.<p>
	 *
	 */
	public static final String $rqst_grp_cd6 = "rqst_grp_cd6";
	/**
	 * Shipping requested classification name 6 出荷依頼先分類名６.<p>
	 *
	 */
	public static final String $rqst_grp_nm6 = "rqst_grp_nm6";
	/**
	 * Shipping requested classification 7 出荷依頼先分類７.<p>
	 *
	 */
	public static final String $rqst_grp_flg7 = "rqst_grp_flg7";
	/**
	 * Shipping requested classification cd.7 出荷依頼先分類ＣＤ７.<p>
	 *
	 */
	public static final String $rqst_grp_cd7 = "rqst_grp_cd7";
	/**
	 * Shipping requested classification name 7 出荷依頼先分類名７.<p>
	 *
	 */
	public static final String $rqst_grp_nm7 = "rqst_grp_nm7";
	/**
	 * Shipping requested classification 8 出荷依頼先分類８.<p>
	 *
	 */
	public static final String $rqst_grp_flg8 = "rqst_grp_flg8";
	/**
	 * Shipping requested classification cd.8 出荷依頼先分類ＣＤ８.<p>
	 *
	 */
	public static final String $rqst_grp_cd8 = "rqst_grp_cd8";
	/**
	 * Shipping requested classification name 8 出荷依頼先分類名８.<p>
	 *
	 */
	public static final String $rqst_grp_nm8 = "rqst_grp_nm8";
	/**
	 * Shipping requested classification 9 出荷依頼先分類９.<p>
	 *
	 */
	public static final String $rqst_grp_flg9 = "rqst_grp_flg9";
	/**
	 * Shipping requested classification cd.9 出荷依頼先分類ＣＤ９.<p>
	 *
	 */
	public static final String $rqst_grp_cd9 = "rqst_grp_cd9";
	/**
	 * Shipping requested classification name 9 出荷依頼先分類名９.<p>
	 *
	 */
	public static final String $rqst_grp_nm9 = "rqst_grp_nm9";
	/**
	 * Shipping requested classification cd.10 出荷依頼先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $rqst_grp_flg10 = "rqst_grp_flg10";
	/**
	 * Shipping requested classification 10 出荷依頼先分類１０.<p>
	 *
	 */
	public static final String $rqst_grp_cd10 = "rqst_grp_cd10";
	/**
	 * Shipping requested classification name 10 出荷依頼先分類名１０.<p>
	 *
	 */
	public static final String $rqst_grp_nm10 = "rqst_grp_nm10";


	public static final MCMeta is_crt_META = createCommonMeta($is_crt, mcframe.commonMA.meta.MA_META.FLG_STR);
	public static final MCMeta is_upd_del_META = createCommonMeta($is_upd_del, mcframe.commonMA.meta.MA_META.FLG_STR);
	public static final MCMeta is_ref_META = createCommonMeta($is_ref, mcframe.commonMA.meta.MA_META.FLG_STR);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta cmpl_schd_dt_fr_META = createCommonMeta($cmpl_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cmpl_schd_dt_to_META = createCommonMeta($cmpl_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta ship_rqst_no_META = createCommonMeta($ship_rqst_no, mcframe.commonMA.meta.MA_META.SHIP_RQST_NO);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta ship_rqst_id_typ_META = createCommonMeta($ship_rqst_id_typ, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP);
	public static final MCMeta ship_rqst_id_cd_META = createCommonMeta($ship_rqst_id_cd, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_CD);
	public static final MCMeta ship_rqst_id_nm_META = createCommonMeta($ship_rqst_id_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_NM);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR3);
	public static final MCMeta dlv_grp_flg1_META = createCommonMeta($dlv_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd1_META = createCommonMeta($dlv_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm1_META = createCommonMeta($dlv_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg2_META = createCommonMeta($dlv_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd2_META = createCommonMeta($dlv_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm2_META = createCommonMeta($dlv_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg3_META = createCommonMeta($dlv_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd3_META = createCommonMeta($dlv_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm3_META = createCommonMeta($dlv_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg4_META = createCommonMeta($dlv_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd4_META = createCommonMeta($dlv_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm4_META = createCommonMeta($dlv_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg5_META = createCommonMeta($dlv_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd5_META = createCommonMeta($dlv_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm5_META = createCommonMeta($dlv_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg6_META = createCommonMeta($dlv_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd6_META = createCommonMeta($dlv_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm6_META = createCommonMeta($dlv_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg7_META = createCommonMeta($dlv_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd7_META = createCommonMeta($dlv_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm7_META = createCommonMeta($dlv_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg8_META = createCommonMeta($dlv_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd8_META = createCommonMeta($dlv_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm8_META = createCommonMeta($dlv_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg9_META = createCommonMeta($dlv_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd9_META = createCommonMeta($dlv_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm9_META = createCommonMeta($dlv_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg10_META = createCommonMeta($dlv_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd10_META = createCommonMeta($dlv_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm10_META = createCommonMeta($dlv_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rqst_grp_flg1_META = createCommonMeta($rqst_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_grp_cd1_META = createCommonMeta($rqst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rqst_grp_nm1_META = createCommonMeta($rqst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rqst_grp_flg2_META = createCommonMeta($rqst_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_grp_cd2_META = createCommonMeta($rqst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rqst_grp_nm2_META = createCommonMeta($rqst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rqst_grp_flg3_META = createCommonMeta($rqst_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_grp_cd3_META = createCommonMeta($rqst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rqst_grp_nm3_META = createCommonMeta($rqst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rqst_grp_flg4_META = createCommonMeta($rqst_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_grp_cd4_META = createCommonMeta($rqst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rqst_grp_nm4_META = createCommonMeta($rqst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rqst_grp_flg5_META = createCommonMeta($rqst_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_grp_cd5_META = createCommonMeta($rqst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rqst_grp_nm5_META = createCommonMeta($rqst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rqst_grp_flg6_META = createCommonMeta($rqst_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_grp_cd6_META = createCommonMeta($rqst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rqst_grp_nm6_META = createCommonMeta($rqst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rqst_grp_flg7_META = createCommonMeta($rqst_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_grp_cd7_META = createCommonMeta($rqst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rqst_grp_nm7_META = createCommonMeta($rqst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rqst_grp_flg8_META = createCommonMeta($rqst_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_grp_cd8_META = createCommonMeta($rqst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rqst_grp_nm8_META = createCommonMeta($rqst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rqst_grp_flg9_META = createCommonMeta($rqst_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_grp_cd9_META = createCommonMeta($rqst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rqst_grp_nm9_META = createCommonMeta($rqst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta rqst_grp_flg10_META = createCommonMeta($rqst_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_grp_cd10_META = createCommonMeta($rqst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta rqst_grp_nm10_META = createCommonMeta($rqst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			is_crt_META,
			is_upd_del_META,
			is_ref_META,
			tdlv_cd_META,
			tdlv_nm_META,
			cmpl_schd_dt_fr_META,
			cmpl_schd_dt_to_META,
			iv_no_META,
			slo_no_META,
			ship_rqst_no_META,
			cst_po_no_META,
			cst_po_d_no_META,
			dlv_id_typ_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			ship_rqst_id_typ_META,
			ship_rqst_id_cd_META,
			ship_rqst_id_nm_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			dlv_grp_flg1_META,
			dlv_grp_cd1_META,
			dlv_grp_nm1_META,
			dlv_grp_flg2_META,
			dlv_grp_cd2_META,
			dlv_grp_nm2_META,
			dlv_grp_flg3_META,
			dlv_grp_cd3_META,
			dlv_grp_nm3_META,
			dlv_grp_flg4_META,
			dlv_grp_cd4_META,
			dlv_grp_nm4_META,
			dlv_grp_flg5_META,
			dlv_grp_cd5_META,
			dlv_grp_nm5_META,
			dlv_grp_flg6_META,
			dlv_grp_cd6_META,
			dlv_grp_nm6_META,
			dlv_grp_flg7_META,
			dlv_grp_cd7_META,
			dlv_grp_nm7_META,
			dlv_grp_flg8_META,
			dlv_grp_cd8_META,
			dlv_grp_nm8_META,
			dlv_grp_flg9_META,
			dlv_grp_cd9_META,
			dlv_grp_nm9_META,
			dlv_grp_flg10_META,
			dlv_grp_cd10_META,
			dlv_grp_nm10_META,
			rqst_grp_flg1_META,
			rqst_grp_cd1_META,
			rqst_grp_nm1_META,
			rqst_grp_flg2_META,
			rqst_grp_cd2_META,
			rqst_grp_nm2_META,
			rqst_grp_flg3_META,
			rqst_grp_cd3_META,
			rqst_grp_nm3_META,
			rqst_grp_flg4_META,
			rqst_grp_cd4_META,
			rqst_grp_nm4_META,
			rqst_grp_flg5_META,
			rqst_grp_cd5_META,
			rqst_grp_nm5_META,
			rqst_grp_flg6_META,
			rqst_grp_cd6_META,
			rqst_grp_nm6_META,
			rqst_grp_flg7_META,
			rqst_grp_cd7_META,
			rqst_grp_nm7_META,
			rqst_grp_flg8_META,
			rqst_grp_cd8_META,
			rqst_grp_nm8_META,
			rqst_grp_flg9_META,
			rqst_grp_cd9_META,
			rqst_grp_nm9_META,
			rqst_grp_flg10_META,
			rqst_grp_cd10_META,
			rqst_grp_nm10_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * New entry (For SQL statement search) 新規登録（SQL文検索用）.<p>
	 *
	 */
	public String is_crt() {
		return getConstString(offset + 0, $is_crt);
	}

	/**
	 * New entry (For SQL statement search) 新規登録（SQL文検索用）.<p>
	 *
	 */
	public void is_crt(String value) {
		setConstString(offset + 0, $is_crt, value);
	}


	/**
	 * Correct/cancel (For SQL statement search) 訂正・取消（SQL文検索用）.<p>
	 *
	 */
	public String is_upd_del() {
		return getConstString(offset + 1, $is_upd_del);
	}

	/**
	 * Correct/cancel (For SQL statement search) 訂正・取消（SQL文検索用）.<p>
	 *
	 */
	public void is_upd_del(String value) {
		setConstString(offset + 1, $is_upd_del, value);
	}


	/**
	 * Reference (For SQL statement search) 参照（SQL文検索用）.<p>
	 *
	 */
	public String is_ref() {
		return getConstString(offset + 2, $is_ref);
	}

	/**
	 * Reference (For SQL statement search) 参照（SQL文検索用）.<p>
	 *
	 */
	public void is_ref(String value) {
		setConstString(offset + 2, $is_ref, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 3, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 3, $tdlv_cd, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 4, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 4, $tdlv_nm, value);
	}


	/**
	 * Completion (Scheduled) date FROM 完了（予定）日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate cmpl_schd_dt_fr() {
		return getConstDate(offset + 5, $cmpl_schd_dt_fr);
	}

	/**
	 * Completion (Scheduled) date FROM 完了（予定）日ＦＲＯＭ.<p>
	 *
	 */
	public void cmpl_schd_dt_fr(MCDate value) {
		setConstDate(offset + 5, $cmpl_schd_dt_fr, value);
	}


	/**
	 * Completion (Scheduled) date TO 完了（予定）日ＴＯ.<p>
	 *
	 */
	public MCDate cmpl_schd_dt_to() {
		return getConstDate(offset + 6, $cmpl_schd_dt_to);
	}

	/**
	 * Completion (Scheduled) date TO 完了（予定）日ＴＯ.<p>
	 *
	 */
	public void cmpl_schd_dt_to(MCDate value) {
		setConstDate(offset + 6, $cmpl_schd_dt_to, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 7, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 7, $iv_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 8, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 8, $slo_no, value);
	}


	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public String ship_rqst_no() {
		return getConstString(offset + 9, $ship_rqst_no);
	}

	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public void ship_rqst_no(String value) {
		setConstString(offset + 9, $ship_rqst_no, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 10, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 10, $cst_po_no, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 11, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 11, $cst_po_d_no, value);
	}


	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 12, $dlv_id_typ);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 12, $dlv_id_typ, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 13, $dlv_id_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 13, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 14, $dlv_id_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 14, $dlv_id_nm, value);
	}


	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public String ship_rqst_id_typ() {
		return getConstString(offset + 15, $ship_rqst_id_typ);
	}

	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public void ship_rqst_id_typ(String value) {
		setConstString(offset + 15, $ship_rqst_id_typ, value);
	}


	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return getConstString(offset + 16, $ship_rqst_id_cd);
	}

	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		setConstString(offset + 16, $ship_rqst_id_cd, value);
	}


	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public String ship_rqst_id_nm() {
		return getConstString(offset + 17, $ship_rqst_id_nm);
	}

	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public void ship_rqst_id_nm(String value) {
		setConstString(offset + 17, $ship_rqst_id_nm, value);
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


	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public boolean dlv_grp_flg1() {
		return getConstBoolean(offset + 21, $dlv_grp_flg1);
	}

	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public void dlv_grp_flg1(boolean value) {
		setConstBoolean(offset + 21, $dlv_grp_flg1, value);
	}


	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public String dlv_grp_cd1() {
		return getConstString(offset + 22, $dlv_grp_cd1);
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public void dlv_grp_cd1(String value) {
		setConstString(offset + 22, $dlv_grp_cd1, value);
	}


	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public String dlv_grp_nm1() {
		return getConstString(offset + 23, $dlv_grp_nm1);
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public void dlv_grp_nm1(String value) {
		setConstString(offset + 23, $dlv_grp_nm1, value);
	}


	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public boolean dlv_grp_flg2() {
		return getConstBoolean(offset + 24, $dlv_grp_flg2);
	}

	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public void dlv_grp_flg2(boolean value) {
		setConstBoolean(offset + 24, $dlv_grp_flg2, value);
	}


	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public String dlv_grp_cd2() {
		return getConstString(offset + 25, $dlv_grp_cd2);
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public void dlv_grp_cd2(String value) {
		setConstString(offset + 25, $dlv_grp_cd2, value);
	}


	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public String dlv_grp_nm2() {
		return getConstString(offset + 26, $dlv_grp_nm2);
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public void dlv_grp_nm2(String value) {
		setConstString(offset + 26, $dlv_grp_nm2, value);
	}


	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public boolean dlv_grp_flg3() {
		return getConstBoolean(offset + 27, $dlv_grp_flg3);
	}

	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public void dlv_grp_flg3(boolean value) {
		setConstBoolean(offset + 27, $dlv_grp_flg3, value);
	}


	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public String dlv_grp_cd3() {
		return getConstString(offset + 28, $dlv_grp_cd3);
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public void dlv_grp_cd3(String value) {
		setConstString(offset + 28, $dlv_grp_cd3, value);
	}


	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public String dlv_grp_nm3() {
		return getConstString(offset + 29, $dlv_grp_nm3);
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public void dlv_grp_nm3(String value) {
		setConstString(offset + 29, $dlv_grp_nm3, value);
	}


	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public boolean dlv_grp_flg4() {
		return getConstBoolean(offset + 30, $dlv_grp_flg4);
	}

	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public void dlv_grp_flg4(boolean value) {
		setConstBoolean(offset + 30, $dlv_grp_flg4, value);
	}


	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public String dlv_grp_cd4() {
		return getConstString(offset + 31, $dlv_grp_cd4);
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public void dlv_grp_cd4(String value) {
		setConstString(offset + 31, $dlv_grp_cd4, value);
	}


	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public String dlv_grp_nm4() {
		return getConstString(offset + 32, $dlv_grp_nm4);
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public void dlv_grp_nm4(String value) {
		setConstString(offset + 32, $dlv_grp_nm4, value);
	}


	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public boolean dlv_grp_flg5() {
		return getConstBoolean(offset + 33, $dlv_grp_flg5);
	}

	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public void dlv_grp_flg5(boolean value) {
		setConstBoolean(offset + 33, $dlv_grp_flg5, value);
	}


	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public String dlv_grp_cd5() {
		return getConstString(offset + 34, $dlv_grp_cd5);
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public void dlv_grp_cd5(String value) {
		setConstString(offset + 34, $dlv_grp_cd5, value);
	}


	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public String dlv_grp_nm5() {
		return getConstString(offset + 35, $dlv_grp_nm5);
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public void dlv_grp_nm5(String value) {
		setConstString(offset + 35, $dlv_grp_nm5, value);
	}


	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public boolean dlv_grp_flg6() {
		return getConstBoolean(offset + 36, $dlv_grp_flg6);
	}

	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public void dlv_grp_flg6(boolean value) {
		setConstBoolean(offset + 36, $dlv_grp_flg6, value);
	}


	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public String dlv_grp_cd6() {
		return getConstString(offset + 37, $dlv_grp_cd6);
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public void dlv_grp_cd6(String value) {
		setConstString(offset + 37, $dlv_grp_cd6, value);
	}


	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public String dlv_grp_nm6() {
		return getConstString(offset + 38, $dlv_grp_nm6);
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public void dlv_grp_nm6(String value) {
		setConstString(offset + 38, $dlv_grp_nm6, value);
	}


	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public boolean dlv_grp_flg7() {
		return getConstBoolean(offset + 39, $dlv_grp_flg7);
	}

	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public void dlv_grp_flg7(boolean value) {
		setConstBoolean(offset + 39, $dlv_grp_flg7, value);
	}


	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public String dlv_grp_cd7() {
		return getConstString(offset + 40, $dlv_grp_cd7);
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public void dlv_grp_cd7(String value) {
		setConstString(offset + 40, $dlv_grp_cd7, value);
	}


	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public String dlv_grp_nm7() {
		return getConstString(offset + 41, $dlv_grp_nm7);
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public void dlv_grp_nm7(String value) {
		setConstString(offset + 41, $dlv_grp_nm7, value);
	}


	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public boolean dlv_grp_flg8() {
		return getConstBoolean(offset + 42, $dlv_grp_flg8);
	}

	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public void dlv_grp_flg8(boolean value) {
		setConstBoolean(offset + 42, $dlv_grp_flg8, value);
	}


	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public String dlv_grp_cd8() {
		return getConstString(offset + 43, $dlv_grp_cd8);
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public void dlv_grp_cd8(String value) {
		setConstString(offset + 43, $dlv_grp_cd8, value);
	}


	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public String dlv_grp_nm8() {
		return getConstString(offset + 44, $dlv_grp_nm8);
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public void dlv_grp_nm8(String value) {
		setConstString(offset + 44, $dlv_grp_nm8, value);
	}


	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public boolean dlv_grp_flg9() {
		return getConstBoolean(offset + 45, $dlv_grp_flg9);
	}

	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public void dlv_grp_flg9(boolean value) {
		setConstBoolean(offset + 45, $dlv_grp_flg9, value);
	}


	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public String dlv_grp_cd9() {
		return getConstString(offset + 46, $dlv_grp_cd9);
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public void dlv_grp_cd9(String value) {
		setConstString(offset + 46, $dlv_grp_cd9, value);
	}


	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public String dlv_grp_nm9() {
		return getConstString(offset + 47, $dlv_grp_nm9);
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public void dlv_grp_nm9(String value) {
		setConstString(offset + 47, $dlv_grp_nm9, value);
	}


	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public boolean dlv_grp_flg10() {
		return getConstBoolean(offset + 48, $dlv_grp_flg10);
	}

	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public void dlv_grp_flg10(boolean value) {
		setConstBoolean(offset + 48, $dlv_grp_flg10, value);
	}


	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public String dlv_grp_cd10() {
		return getConstString(offset + 49, $dlv_grp_cd10);
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public void dlv_grp_cd10(String value) {
		setConstString(offset + 49, $dlv_grp_cd10, value);
	}


	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public String dlv_grp_nm10() {
		return getConstString(offset + 50, $dlv_grp_nm10);
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public void dlv_grp_nm10(String value) {
		setConstString(offset + 50, $dlv_grp_nm10, value);
	}


	/**
	 * Shipping requested classification 1 出荷依頼先分類１.<p>
	 *
	 */
	public boolean rqst_grp_flg1() {
		return getConstBoolean(offset + 51, $rqst_grp_flg1);
	}

	/**
	 * Shipping requested classification 1 出荷依頼先分類１.<p>
	 *
	 */
	public void rqst_grp_flg1(boolean value) {
		setConstBoolean(offset + 51, $rqst_grp_flg1, value);
	}


	/**
	 * Shipping requested classification cd.1 出荷依頼先分類ＣＤ１.<p>
	 *
	 */
	public String rqst_grp_cd1() {
		return getConstString(offset + 52, $rqst_grp_cd1);
	}

	/**
	 * Shipping requested classification cd.1 出荷依頼先分類ＣＤ１.<p>
	 *
	 */
	public void rqst_grp_cd1(String value) {
		setConstString(offset + 52, $rqst_grp_cd1, value);
	}


	/**
	 * Shipping requested classification name 1 出荷依頼先分類名１.<p>
	 *
	 */
	public String rqst_grp_nm1() {
		return getConstString(offset + 53, $rqst_grp_nm1);
	}

	/**
	 * Shipping requested classification name 1 出荷依頼先分類名１.<p>
	 *
	 */
	public void rqst_grp_nm1(String value) {
		setConstString(offset + 53, $rqst_grp_nm1, value);
	}


	/**
	 * Shipping requested classification 2 出荷依頼先分類２.<p>
	 *
	 */
	public boolean rqst_grp_flg2() {
		return getConstBoolean(offset + 54, $rqst_grp_flg2);
	}

	/**
	 * Shipping requested classification 2 出荷依頼先分類２.<p>
	 *
	 */
	public void rqst_grp_flg2(boolean value) {
		setConstBoolean(offset + 54, $rqst_grp_flg2, value);
	}


	/**
	 * Shipping requested classification cd.2 出荷依頼先分類ＣＤ２.<p>
	 *
	 */
	public String rqst_grp_cd2() {
		return getConstString(offset + 55, $rqst_grp_cd2);
	}

	/**
	 * Shipping requested classification cd.2 出荷依頼先分類ＣＤ２.<p>
	 *
	 */
	public void rqst_grp_cd2(String value) {
		setConstString(offset + 55, $rqst_grp_cd2, value);
	}


	/**
	 * Shipping requested classification name 2 出荷依頼先分類名２.<p>
	 *
	 */
	public String rqst_grp_nm2() {
		return getConstString(offset + 56, $rqst_grp_nm2);
	}

	/**
	 * Shipping requested classification name 2 出荷依頼先分類名２.<p>
	 *
	 */
	public void rqst_grp_nm2(String value) {
		setConstString(offset + 56, $rqst_grp_nm2, value);
	}


	/**
	 * Shipping requested classification 3 出荷依頼先分類３.<p>
	 *
	 */
	public boolean rqst_grp_flg3() {
		return getConstBoolean(offset + 57, $rqst_grp_flg3);
	}

	/**
	 * Shipping requested classification 3 出荷依頼先分類３.<p>
	 *
	 */
	public void rqst_grp_flg3(boolean value) {
		setConstBoolean(offset + 57, $rqst_grp_flg3, value);
	}


	/**
	 * Shipping requested classification cd.3 出荷依頼先分類ＣＤ３.<p>
	 *
	 */
	public String rqst_grp_cd3() {
		return getConstString(offset + 58, $rqst_grp_cd3);
	}

	/**
	 * Shipping requested classification cd.3 出荷依頼先分類ＣＤ３.<p>
	 *
	 */
	public void rqst_grp_cd3(String value) {
		setConstString(offset + 58, $rqst_grp_cd3, value);
	}


	/**
	 * Shipping requested classification name 3 出荷依頼先分類名３.<p>
	 *
	 */
	public String rqst_grp_nm3() {
		return getConstString(offset + 59, $rqst_grp_nm3);
	}

	/**
	 * Shipping requested classification name 3 出荷依頼先分類名３.<p>
	 *
	 */
	public void rqst_grp_nm3(String value) {
		setConstString(offset + 59, $rqst_grp_nm3, value);
	}


	/**
	 * Shipping requested classification 4 出荷依頼先分類４.<p>
	 *
	 */
	public boolean rqst_grp_flg4() {
		return getConstBoolean(offset + 60, $rqst_grp_flg4);
	}

	/**
	 * Shipping requested classification 4 出荷依頼先分類４.<p>
	 *
	 */
	public void rqst_grp_flg4(boolean value) {
		setConstBoolean(offset + 60, $rqst_grp_flg4, value);
	}


	/**
	 * Shipping requested classification cd.4 出荷依頼先分類ＣＤ４.<p>
	 *
	 */
	public String rqst_grp_cd4() {
		return getConstString(offset + 61, $rqst_grp_cd4);
	}

	/**
	 * Shipping requested classification cd.4 出荷依頼先分類ＣＤ４.<p>
	 *
	 */
	public void rqst_grp_cd4(String value) {
		setConstString(offset + 61, $rqst_grp_cd4, value);
	}


	/**
	 * Shipping requested classification name 4 出荷依頼先分類名４.<p>
	 *
	 */
	public String rqst_grp_nm4() {
		return getConstString(offset + 62, $rqst_grp_nm4);
	}

	/**
	 * Shipping requested classification name 4 出荷依頼先分類名４.<p>
	 *
	 */
	public void rqst_grp_nm4(String value) {
		setConstString(offset + 62, $rqst_grp_nm4, value);
	}


	/**
	 * Shipping requested classification 5 出荷依頼先分類５.<p>
	 *
	 */
	public boolean rqst_grp_flg5() {
		return getConstBoolean(offset + 63, $rqst_grp_flg5);
	}

	/**
	 * Shipping requested classification 5 出荷依頼先分類５.<p>
	 *
	 */
	public void rqst_grp_flg5(boolean value) {
		setConstBoolean(offset + 63, $rqst_grp_flg5, value);
	}


	/**
	 * Shipping requested classification cd.5 出荷依頼先分類ＣＤ５.<p>
	 *
	 */
	public String rqst_grp_cd5() {
		return getConstString(offset + 64, $rqst_grp_cd5);
	}

	/**
	 * Shipping requested classification cd.5 出荷依頼先分類ＣＤ５.<p>
	 *
	 */
	public void rqst_grp_cd5(String value) {
		setConstString(offset + 64, $rqst_grp_cd5, value);
	}


	/**
	 * Shipping requested classification name 5 出荷依頼先分類名５.<p>
	 *
	 */
	public String rqst_grp_nm5() {
		return getConstString(offset + 65, $rqst_grp_nm5);
	}

	/**
	 * Shipping requested classification name 5 出荷依頼先分類名５.<p>
	 *
	 */
	public void rqst_grp_nm5(String value) {
		setConstString(offset + 65, $rqst_grp_nm5, value);
	}


	/**
	 * Shipping requested classification 6 出荷依頼先分類６.<p>
	 *
	 */
	public boolean rqst_grp_flg6() {
		return getConstBoolean(offset + 66, $rqst_grp_flg6);
	}

	/**
	 * Shipping requested classification 6 出荷依頼先分類６.<p>
	 *
	 */
	public void rqst_grp_flg6(boolean value) {
		setConstBoolean(offset + 66, $rqst_grp_flg6, value);
	}


	/**
	 * Shipping requested classification cd.6 出荷依頼先分類ＣＤ６.<p>
	 *
	 */
	public String rqst_grp_cd6() {
		return getConstString(offset + 67, $rqst_grp_cd6);
	}

	/**
	 * Shipping requested classification cd.6 出荷依頼先分類ＣＤ６.<p>
	 *
	 */
	public void rqst_grp_cd6(String value) {
		setConstString(offset + 67, $rqst_grp_cd6, value);
	}


	/**
	 * Shipping requested classification name 6 出荷依頼先分類名６.<p>
	 *
	 */
	public String rqst_grp_nm6() {
		return getConstString(offset + 68, $rqst_grp_nm6);
	}

	/**
	 * Shipping requested classification name 6 出荷依頼先分類名６.<p>
	 *
	 */
	public void rqst_grp_nm6(String value) {
		setConstString(offset + 68, $rqst_grp_nm6, value);
	}


	/**
	 * Shipping requested classification 7 出荷依頼先分類７.<p>
	 *
	 */
	public boolean rqst_grp_flg7() {
		return getConstBoolean(offset + 69, $rqst_grp_flg7);
	}

	/**
	 * Shipping requested classification 7 出荷依頼先分類７.<p>
	 *
	 */
	public void rqst_grp_flg7(boolean value) {
		setConstBoolean(offset + 69, $rqst_grp_flg7, value);
	}


	/**
	 * Shipping requested classification cd.7 出荷依頼先分類ＣＤ７.<p>
	 *
	 */
	public String rqst_grp_cd7() {
		return getConstString(offset + 70, $rqst_grp_cd7);
	}

	/**
	 * Shipping requested classification cd.7 出荷依頼先分類ＣＤ７.<p>
	 *
	 */
	public void rqst_grp_cd7(String value) {
		setConstString(offset + 70, $rqst_grp_cd7, value);
	}


	/**
	 * Shipping requested classification name 7 出荷依頼先分類名７.<p>
	 *
	 */
	public String rqst_grp_nm7() {
		return getConstString(offset + 71, $rqst_grp_nm7);
	}

	/**
	 * Shipping requested classification name 7 出荷依頼先分類名７.<p>
	 *
	 */
	public void rqst_grp_nm7(String value) {
		setConstString(offset + 71, $rqst_grp_nm7, value);
	}


	/**
	 * Shipping requested classification 8 出荷依頼先分類８.<p>
	 *
	 */
	public boolean rqst_grp_flg8() {
		return getConstBoolean(offset + 72, $rqst_grp_flg8);
	}

	/**
	 * Shipping requested classification 8 出荷依頼先分類８.<p>
	 *
	 */
	public void rqst_grp_flg8(boolean value) {
		setConstBoolean(offset + 72, $rqst_grp_flg8, value);
	}


	/**
	 * Shipping requested classification cd.8 出荷依頼先分類ＣＤ８.<p>
	 *
	 */
	public String rqst_grp_cd8() {
		return getConstString(offset + 73, $rqst_grp_cd8);
	}

	/**
	 * Shipping requested classification cd.8 出荷依頼先分類ＣＤ８.<p>
	 *
	 */
	public void rqst_grp_cd8(String value) {
		setConstString(offset + 73, $rqst_grp_cd8, value);
	}


	/**
	 * Shipping requested classification name 8 出荷依頼先分類名８.<p>
	 *
	 */
	public String rqst_grp_nm8() {
		return getConstString(offset + 74, $rqst_grp_nm8);
	}

	/**
	 * Shipping requested classification name 8 出荷依頼先分類名８.<p>
	 *
	 */
	public void rqst_grp_nm8(String value) {
		setConstString(offset + 74, $rqst_grp_nm8, value);
	}


	/**
	 * Shipping requested classification 9 出荷依頼先分類９.<p>
	 *
	 */
	public boolean rqst_grp_flg9() {
		return getConstBoolean(offset + 75, $rqst_grp_flg9);
	}

	/**
	 * Shipping requested classification 9 出荷依頼先分類９.<p>
	 *
	 */
	public void rqst_grp_flg9(boolean value) {
		setConstBoolean(offset + 75, $rqst_grp_flg9, value);
	}


	/**
	 * Shipping requested classification cd.9 出荷依頼先分類ＣＤ９.<p>
	 *
	 */
	public String rqst_grp_cd9() {
		return getConstString(offset + 76, $rqst_grp_cd9);
	}

	/**
	 * Shipping requested classification cd.9 出荷依頼先分類ＣＤ９.<p>
	 *
	 */
	public void rqst_grp_cd9(String value) {
		setConstString(offset + 76, $rqst_grp_cd9, value);
	}


	/**
	 * Shipping requested classification name 9 出荷依頼先分類名９.<p>
	 *
	 */
	public String rqst_grp_nm9() {
		return getConstString(offset + 77, $rqst_grp_nm9);
	}

	/**
	 * Shipping requested classification name 9 出荷依頼先分類名９.<p>
	 *
	 */
	public void rqst_grp_nm9(String value) {
		setConstString(offset + 77, $rqst_grp_nm9, value);
	}


	/**
	 * Shipping requested classification cd.10 出荷依頼先分類ＣＤ１０.<p>
	 *
	 */
	public boolean rqst_grp_flg10() {
		return getConstBoolean(offset + 78, $rqst_grp_flg10);
	}

	/**
	 * Shipping requested classification cd.10 出荷依頼先分類ＣＤ１０.<p>
	 *
	 */
	public void rqst_grp_flg10(boolean value) {
		setConstBoolean(offset + 78, $rqst_grp_flg10, value);
	}


	/**
	 * Shipping requested classification 10 出荷依頼先分類１０.<p>
	 *
	 */
	public String rqst_grp_cd10() {
		return getConstString(offset + 79, $rqst_grp_cd10);
	}

	/**
	 * Shipping requested classification 10 出荷依頼先分類１０.<p>
	 *
	 */
	public void rqst_grp_cd10(String value) {
		setConstString(offset + 79, $rqst_grp_cd10, value);
	}


	/**
	 * Shipping requested classification name 10 出荷依頼先分類名１０.<p>
	 *
	 */
	public String rqst_grp_nm10() {
		return getConstString(offset + 80, $rqst_grp_nm10);
	}

	/**
	 * Shipping requested classification name 10 出荷依頼先分類名１０.<p>
	 *
	 */
	public void rqst_grp_nm10(String value) {
		setConstString(offset + 80, $rqst_grp_nm10, value);
	}


	public String getString(String name) {
		if ($is_crt.equalsIgnoreCase(name)) {
			return is_crt();
		}
		if ($is_upd_del.equalsIgnoreCase(name)) {
			return is_upd_del();
		}
		if ($is_ref.equalsIgnoreCase(name)) {
			return is_ref();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ship_rqst_no.equalsIgnoreCase(name)) {
			return ship_rqst_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
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
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			return dlv_grp_cd1();
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			return dlv_grp_nm1();
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			return dlv_grp_cd2();
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			return dlv_grp_nm2();
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			return dlv_grp_cd3();
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			return dlv_grp_nm3();
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			return dlv_grp_cd4();
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			return dlv_grp_nm4();
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			return dlv_grp_cd5();
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			return dlv_grp_nm5();
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			return dlv_grp_cd6();
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			return dlv_grp_nm6();
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			return dlv_grp_cd7();
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			return dlv_grp_nm7();
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			return dlv_grp_cd8();
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			return dlv_grp_nm8();
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			return dlv_grp_cd9();
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			return dlv_grp_nm9();
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			return dlv_grp_cd10();
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			return dlv_grp_nm10();
		}
		if ($rqst_grp_cd1.equalsIgnoreCase(name)) {
			return rqst_grp_cd1();
		}
		if ($rqst_grp_nm1.equalsIgnoreCase(name)) {
			return rqst_grp_nm1();
		}
		if ($rqst_grp_cd2.equalsIgnoreCase(name)) {
			return rqst_grp_cd2();
		}
		if ($rqst_grp_nm2.equalsIgnoreCase(name)) {
			return rqst_grp_nm2();
		}
		if ($rqst_grp_cd3.equalsIgnoreCase(name)) {
			return rqst_grp_cd3();
		}
		if ($rqst_grp_nm3.equalsIgnoreCase(name)) {
			return rqst_grp_nm3();
		}
		if ($rqst_grp_cd4.equalsIgnoreCase(name)) {
			return rqst_grp_cd4();
		}
		if ($rqst_grp_nm4.equalsIgnoreCase(name)) {
			return rqst_grp_nm4();
		}
		if ($rqst_grp_cd5.equalsIgnoreCase(name)) {
			return rqst_grp_cd5();
		}
		if ($rqst_grp_nm5.equalsIgnoreCase(name)) {
			return rqst_grp_nm5();
		}
		if ($rqst_grp_cd6.equalsIgnoreCase(name)) {
			return rqst_grp_cd6();
		}
		if ($rqst_grp_nm6.equalsIgnoreCase(name)) {
			return rqst_grp_nm6();
		}
		if ($rqst_grp_cd7.equalsIgnoreCase(name)) {
			return rqst_grp_cd7();
		}
		if ($rqst_grp_nm7.equalsIgnoreCase(name)) {
			return rqst_grp_nm7();
		}
		if ($rqst_grp_cd8.equalsIgnoreCase(name)) {
			return rqst_grp_cd8();
		}
		if ($rqst_grp_nm8.equalsIgnoreCase(name)) {
			return rqst_grp_nm8();
		}
		if ($rqst_grp_cd9.equalsIgnoreCase(name)) {
			return rqst_grp_cd9();
		}
		if ($rqst_grp_nm9.equalsIgnoreCase(name)) {
			return rqst_grp_nm9();
		}
		if ($rqst_grp_cd10.equalsIgnoreCase(name)) {
			return rqst_grp_cd10();
		}
		if ($rqst_grp_nm10.equalsIgnoreCase(name)) {
			return rqst_grp_nm10();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($cmpl_schd_dt_fr.equalsIgnoreCase(name)) {
			return cmpl_schd_dt_fr();
		}
		if ($cmpl_schd_dt_to.equalsIgnoreCase(name)) {
			return cmpl_schd_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			return dlv_grp_flg1();
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			return dlv_grp_flg2();
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			return dlv_grp_flg3();
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			return dlv_grp_flg4();
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			return dlv_grp_flg5();
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			return dlv_grp_flg6();
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			return dlv_grp_flg7();
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			return dlv_grp_flg8();
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			return dlv_grp_flg9();
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			return dlv_grp_flg10();
		}
		if ($rqst_grp_flg1.equalsIgnoreCase(name)) {
			return rqst_grp_flg1();
		}
		if ($rqst_grp_flg2.equalsIgnoreCase(name)) {
			return rqst_grp_flg2();
		}
		if ($rqst_grp_flg3.equalsIgnoreCase(name)) {
			return rqst_grp_flg3();
		}
		if ($rqst_grp_flg4.equalsIgnoreCase(name)) {
			return rqst_grp_flg4();
		}
		if ($rqst_grp_flg5.equalsIgnoreCase(name)) {
			return rqst_grp_flg5();
		}
		if ($rqst_grp_flg6.equalsIgnoreCase(name)) {
			return rqst_grp_flg6();
		}
		if ($rqst_grp_flg7.equalsIgnoreCase(name)) {
			return rqst_grp_flg7();
		}
		if ($rqst_grp_flg8.equalsIgnoreCase(name)) {
			return rqst_grp_flg8();
		}
		if ($rqst_grp_flg9.equalsIgnoreCase(name)) {
			return rqst_grp_flg9();
		}
		if ($rqst_grp_flg10.equalsIgnoreCase(name)) {
			return rqst_grp_flg10();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($is_crt.equalsIgnoreCase(name)) {
			return is_crt();
		}
		if ($is_upd_del.equalsIgnoreCase(name)) {
			return is_upd_del();
		}
		if ($is_ref.equalsIgnoreCase(name)) {
			return is_ref();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ship_rqst_no.equalsIgnoreCase(name)) {
			return ship_rqst_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
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
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			return dlv_grp_cd1();
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			return dlv_grp_nm1();
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			return dlv_grp_cd2();
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			return dlv_grp_nm2();
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			return dlv_grp_cd3();
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			return dlv_grp_nm3();
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			return dlv_grp_cd4();
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			return dlv_grp_nm4();
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			return dlv_grp_cd5();
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			return dlv_grp_nm5();
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			return dlv_grp_cd6();
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			return dlv_grp_nm6();
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			return dlv_grp_cd7();
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			return dlv_grp_nm7();
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			return dlv_grp_cd8();
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			return dlv_grp_nm8();
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			return dlv_grp_cd9();
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			return dlv_grp_nm9();
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			return dlv_grp_cd10();
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			return dlv_grp_nm10();
		}
		if ($rqst_grp_cd1.equalsIgnoreCase(name)) {
			return rqst_grp_cd1();
		}
		if ($rqst_grp_nm1.equalsIgnoreCase(name)) {
			return rqst_grp_nm1();
		}
		if ($rqst_grp_cd2.equalsIgnoreCase(name)) {
			return rqst_grp_cd2();
		}
		if ($rqst_grp_nm2.equalsIgnoreCase(name)) {
			return rqst_grp_nm2();
		}
		if ($rqst_grp_cd3.equalsIgnoreCase(name)) {
			return rqst_grp_cd3();
		}
		if ($rqst_grp_nm3.equalsIgnoreCase(name)) {
			return rqst_grp_nm3();
		}
		if ($rqst_grp_cd4.equalsIgnoreCase(name)) {
			return rqst_grp_cd4();
		}
		if ($rqst_grp_nm4.equalsIgnoreCase(name)) {
			return rqst_grp_nm4();
		}
		if ($rqst_grp_cd5.equalsIgnoreCase(name)) {
			return rqst_grp_cd5();
		}
		if ($rqst_grp_nm5.equalsIgnoreCase(name)) {
			return rqst_grp_nm5();
		}
		if ($rqst_grp_cd6.equalsIgnoreCase(name)) {
			return rqst_grp_cd6();
		}
		if ($rqst_grp_nm6.equalsIgnoreCase(name)) {
			return rqst_grp_nm6();
		}
		if ($rqst_grp_cd7.equalsIgnoreCase(name)) {
			return rqst_grp_cd7();
		}
		if ($rqst_grp_nm7.equalsIgnoreCase(name)) {
			return rqst_grp_nm7();
		}
		if ($rqst_grp_cd8.equalsIgnoreCase(name)) {
			return rqst_grp_cd8();
		}
		if ($rqst_grp_nm8.equalsIgnoreCase(name)) {
			return rqst_grp_nm8();
		}
		if ($rqst_grp_cd9.equalsIgnoreCase(name)) {
			return rqst_grp_cd9();
		}
		if ($rqst_grp_nm9.equalsIgnoreCase(name)) {
			return rqst_grp_nm9();
		}
		if ($rqst_grp_cd10.equalsIgnoreCase(name)) {
			return rqst_grp_cd10();
		}
		if ($rqst_grp_nm10.equalsIgnoreCase(name)) {
			return rqst_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($cmpl_schd_dt_fr.equalsIgnoreCase(name)) {
			return cmpl_schd_dt_fr();
		}
		if ($cmpl_schd_dt_to.equalsIgnoreCase(name)) {
			return cmpl_schd_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			return dlv_grp_flg1();
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			return dlv_grp_flg2();
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			return dlv_grp_flg3();
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			return dlv_grp_flg4();
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			return dlv_grp_flg5();
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			return dlv_grp_flg6();
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			return dlv_grp_flg7();
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			return dlv_grp_flg8();
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			return dlv_grp_flg9();
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			return dlv_grp_flg10();
		}
		if ($rqst_grp_flg1.equalsIgnoreCase(name)) {
			return rqst_grp_flg1();
		}
		if ($rqst_grp_flg2.equalsIgnoreCase(name)) {
			return rqst_grp_flg2();
		}
		if ($rqst_grp_flg3.equalsIgnoreCase(name)) {
			return rqst_grp_flg3();
		}
		if ($rqst_grp_flg4.equalsIgnoreCase(name)) {
			return rqst_grp_flg4();
		}
		if ($rqst_grp_flg5.equalsIgnoreCase(name)) {
			return rqst_grp_flg5();
		}
		if ($rqst_grp_flg6.equalsIgnoreCase(name)) {
			return rqst_grp_flg6();
		}
		if ($rqst_grp_flg7.equalsIgnoreCase(name)) {
			return rqst_grp_flg7();
		}
		if ($rqst_grp_flg8.equalsIgnoreCase(name)) {
			return rqst_grp_flg8();
		}
		if ($rqst_grp_flg9.equalsIgnoreCase(name)) {
			return rqst_grp_flg9();
		}
		if ($rqst_grp_flg10.equalsIgnoreCase(name)) {
			return rqst_grp_flg10();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($is_crt.equalsIgnoreCase(name)) {
			is_crt(value);
			return;
		}
		if ($is_upd_del.equalsIgnoreCase(name)) {
			is_upd_del(value);
			return;
		}
		if ($is_ref.equalsIgnoreCase(name)) {
			is_ref(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($ship_rqst_no.equalsIgnoreCase(name)) {
			ship_rqst_no(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_nm(value);
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
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			dlv_grp_cd1(value);
			return;
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			dlv_grp_nm1(value);
			return;
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			dlv_grp_cd2(value);
			return;
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			dlv_grp_nm2(value);
			return;
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			dlv_grp_cd3(value);
			return;
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			dlv_grp_nm3(value);
			return;
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			dlv_grp_cd4(value);
			return;
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			dlv_grp_nm4(value);
			return;
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			dlv_grp_cd5(value);
			return;
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			dlv_grp_nm5(value);
			return;
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			dlv_grp_cd6(value);
			return;
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			dlv_grp_nm6(value);
			return;
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			dlv_grp_cd7(value);
			return;
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			dlv_grp_nm7(value);
			return;
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			dlv_grp_cd8(value);
			return;
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			dlv_grp_nm8(value);
			return;
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			dlv_grp_cd9(value);
			return;
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			dlv_grp_nm9(value);
			return;
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			dlv_grp_cd10(value);
			return;
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			dlv_grp_nm10(value);
			return;
		}
		if ($rqst_grp_cd1.equalsIgnoreCase(name)) {
			rqst_grp_cd1(value);
			return;
		}
		if ($rqst_grp_nm1.equalsIgnoreCase(name)) {
			rqst_grp_nm1(value);
			return;
		}
		if ($rqst_grp_cd2.equalsIgnoreCase(name)) {
			rqst_grp_cd2(value);
			return;
		}
		if ($rqst_grp_nm2.equalsIgnoreCase(name)) {
			rqst_grp_nm2(value);
			return;
		}
		if ($rqst_grp_cd3.equalsIgnoreCase(name)) {
			rqst_grp_cd3(value);
			return;
		}
		if ($rqst_grp_nm3.equalsIgnoreCase(name)) {
			rqst_grp_nm3(value);
			return;
		}
		if ($rqst_grp_cd4.equalsIgnoreCase(name)) {
			rqst_grp_cd4(value);
			return;
		}
		if ($rqst_grp_nm4.equalsIgnoreCase(name)) {
			rqst_grp_nm4(value);
			return;
		}
		if ($rqst_grp_cd5.equalsIgnoreCase(name)) {
			rqst_grp_cd5(value);
			return;
		}
		if ($rqst_grp_nm5.equalsIgnoreCase(name)) {
			rqst_grp_nm5(value);
			return;
		}
		if ($rqst_grp_cd6.equalsIgnoreCase(name)) {
			rqst_grp_cd6(value);
			return;
		}
		if ($rqst_grp_nm6.equalsIgnoreCase(name)) {
			rqst_grp_nm6(value);
			return;
		}
		if ($rqst_grp_cd7.equalsIgnoreCase(name)) {
			rqst_grp_cd7(value);
			return;
		}
		if ($rqst_grp_nm7.equalsIgnoreCase(name)) {
			rqst_grp_nm7(value);
			return;
		}
		if ($rqst_grp_cd8.equalsIgnoreCase(name)) {
			rqst_grp_cd8(value);
			return;
		}
		if ($rqst_grp_nm8.equalsIgnoreCase(name)) {
			rqst_grp_nm8(value);
			return;
		}
		if ($rqst_grp_cd9.equalsIgnoreCase(name)) {
			rqst_grp_cd9(value);
			return;
		}
		if ($rqst_grp_nm9.equalsIgnoreCase(name)) {
			rqst_grp_nm9(value);
			return;
		}
		if ($rqst_grp_cd10.equalsIgnoreCase(name)) {
			rqst_grp_cd10(value);
			return;
		}
		if ($rqst_grp_nm10.equalsIgnoreCase(name)) {
			rqst_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($cmpl_schd_dt_fr.equalsIgnoreCase(name)) {
			cmpl_schd_dt_fr(value);
			return;
		}
		if ($cmpl_schd_dt_to.equalsIgnoreCase(name)) {
			cmpl_schd_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			dlv_grp_flg1(value);
			return;
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			dlv_grp_flg2(value);
			return;
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			dlv_grp_flg3(value);
			return;
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			dlv_grp_flg4(value);
			return;
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			dlv_grp_flg5(value);
			return;
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			dlv_grp_flg6(value);
			return;
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			dlv_grp_flg7(value);
			return;
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			dlv_grp_flg8(value);
			return;
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			dlv_grp_flg9(value);
			return;
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			dlv_grp_flg10(value);
			return;
		}
		if ($rqst_grp_flg1.equalsIgnoreCase(name)) {
			rqst_grp_flg1(value);
			return;
		}
		if ($rqst_grp_flg2.equalsIgnoreCase(name)) {
			rqst_grp_flg2(value);
			return;
		}
		if ($rqst_grp_flg3.equalsIgnoreCase(name)) {
			rqst_grp_flg3(value);
			return;
		}
		if ($rqst_grp_flg4.equalsIgnoreCase(name)) {
			rqst_grp_flg4(value);
			return;
		}
		if ($rqst_grp_flg5.equalsIgnoreCase(name)) {
			rqst_grp_flg5(value);
			return;
		}
		if ($rqst_grp_flg6.equalsIgnoreCase(name)) {
			rqst_grp_flg6(value);
			return;
		}
		if ($rqst_grp_flg7.equalsIgnoreCase(name)) {
			rqst_grp_flg7(value);
			return;
		}
		if ($rqst_grp_flg8.equalsIgnoreCase(name)) {
			rqst_grp_flg8(value);
			return;
		}
		if ($rqst_grp_flg9.equalsIgnoreCase(name)) {
			rqst_grp_flg9(value);
			return;
		}
		if ($rqst_grp_flg10.equalsIgnoreCase(name)) {
			rqst_grp_flg10(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($is_crt.equalsIgnoreCase(name)) {
			is_crt(value);
			return;
		}
		if ($is_upd_del.equalsIgnoreCase(name)) {
			is_upd_del(value);
			return;
		}
		if ($is_ref.equalsIgnoreCase(name)) {
			is_ref(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($ship_rqst_no.equalsIgnoreCase(name)) {
			ship_rqst_no(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_nm(value);
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
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			dlv_grp_cd1(value);
			return;
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			dlv_grp_nm1(value);
			return;
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			dlv_grp_cd2(value);
			return;
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			dlv_grp_nm2(value);
			return;
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			dlv_grp_cd3(value);
			return;
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			dlv_grp_nm3(value);
			return;
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			dlv_grp_cd4(value);
			return;
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			dlv_grp_nm4(value);
			return;
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			dlv_grp_cd5(value);
			return;
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			dlv_grp_nm5(value);
			return;
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			dlv_grp_cd6(value);
			return;
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			dlv_grp_nm6(value);
			return;
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			dlv_grp_cd7(value);
			return;
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			dlv_grp_nm7(value);
			return;
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			dlv_grp_cd8(value);
			return;
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			dlv_grp_nm8(value);
			return;
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			dlv_grp_cd9(value);
			return;
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			dlv_grp_nm9(value);
			return;
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			dlv_grp_cd10(value);
			return;
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			dlv_grp_nm10(value);
			return;
		}
		if ($rqst_grp_cd1.equalsIgnoreCase(name)) {
			rqst_grp_cd1(value);
			return;
		}
		if ($rqst_grp_nm1.equalsIgnoreCase(name)) {
			rqst_grp_nm1(value);
			return;
		}
		if ($rqst_grp_cd2.equalsIgnoreCase(name)) {
			rqst_grp_cd2(value);
			return;
		}
		if ($rqst_grp_nm2.equalsIgnoreCase(name)) {
			rqst_grp_nm2(value);
			return;
		}
		if ($rqst_grp_cd3.equalsIgnoreCase(name)) {
			rqst_grp_cd3(value);
			return;
		}
		if ($rqst_grp_nm3.equalsIgnoreCase(name)) {
			rqst_grp_nm3(value);
			return;
		}
		if ($rqst_grp_cd4.equalsIgnoreCase(name)) {
			rqst_grp_cd4(value);
			return;
		}
		if ($rqst_grp_nm4.equalsIgnoreCase(name)) {
			rqst_grp_nm4(value);
			return;
		}
		if ($rqst_grp_cd5.equalsIgnoreCase(name)) {
			rqst_grp_cd5(value);
			return;
		}
		if ($rqst_grp_nm5.equalsIgnoreCase(name)) {
			rqst_grp_nm5(value);
			return;
		}
		if ($rqst_grp_cd6.equalsIgnoreCase(name)) {
			rqst_grp_cd6(value);
			return;
		}
		if ($rqst_grp_nm6.equalsIgnoreCase(name)) {
			rqst_grp_nm6(value);
			return;
		}
		if ($rqst_grp_cd7.equalsIgnoreCase(name)) {
			rqst_grp_cd7(value);
			return;
		}
		if ($rqst_grp_nm7.equalsIgnoreCase(name)) {
			rqst_grp_nm7(value);
			return;
		}
		if ($rqst_grp_cd8.equalsIgnoreCase(name)) {
			rqst_grp_cd8(value);
			return;
		}
		if ($rqst_grp_nm8.equalsIgnoreCase(name)) {
			rqst_grp_nm8(value);
			return;
		}
		if ($rqst_grp_cd9.equalsIgnoreCase(name)) {
			rqst_grp_cd9(value);
			return;
		}
		if ($rqst_grp_nm9.equalsIgnoreCase(name)) {
			rqst_grp_nm9(value);
			return;
		}
		if ($rqst_grp_cd10.equalsIgnoreCase(name)) {
			rqst_grp_cd10(value);
			return;
		}
		if ($rqst_grp_nm10.equalsIgnoreCase(name)) {
			rqst_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($cmpl_schd_dt_fr.equalsIgnoreCase(name)) {
			cmpl_schd_dt_fr(value);
			return;
		}
		if ($cmpl_schd_dt_to.equalsIgnoreCase(name)) {
			cmpl_schd_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			dlv_grp_flg1(value);
			return;
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			dlv_grp_flg2(value);
			return;
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			dlv_grp_flg3(value);
			return;
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			dlv_grp_flg4(value);
			return;
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			dlv_grp_flg5(value);
			return;
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			dlv_grp_flg6(value);
			return;
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			dlv_grp_flg7(value);
			return;
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			dlv_grp_flg8(value);
			return;
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			dlv_grp_flg9(value);
			return;
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			dlv_grp_flg10(value);
			return;
		}
		if ($rqst_grp_flg1.equalsIgnoreCase(name)) {
			rqst_grp_flg1(value);
			return;
		}
		if ($rqst_grp_flg2.equalsIgnoreCase(name)) {
			rqst_grp_flg2(value);
			return;
		}
		if ($rqst_grp_flg3.equalsIgnoreCase(name)) {
			rqst_grp_flg3(value);
			return;
		}
		if ($rqst_grp_flg4.equalsIgnoreCase(name)) {
			rqst_grp_flg4(value);
			return;
		}
		if ($rqst_grp_flg5.equalsIgnoreCase(name)) {
			rqst_grp_flg5(value);
			return;
		}
		if ($rqst_grp_flg6.equalsIgnoreCase(name)) {
			rqst_grp_flg6(value);
			return;
		}
		if ($rqst_grp_flg7.equalsIgnoreCase(name)) {
			rqst_grp_flg7(value);
			return;
		}
		if ($rqst_grp_flg8.equalsIgnoreCase(name)) {
			rqst_grp_flg8(value);
			return;
		}
		if ($rqst_grp_flg9.equalsIgnoreCase(name)) {
			rqst_grp_flg9(value);
			return;
		}
		if ($rqst_grp_flg10.equalsIgnoreCase(name)) {
			rqst_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

