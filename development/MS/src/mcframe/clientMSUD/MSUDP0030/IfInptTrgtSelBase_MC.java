package mcframe.clientMSUD.MSUDP0030;

import java.util.ArrayList;
import java.util.List;

import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonMA.constant.*;
import mcframe.commonMS.constant.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;

public interface IfInptTrgtSelBase_MC {

	/**
	 * 操作種別（検索項目）
	 */
	public static final String CND_OPE = "ope";

	/**
	 * 新規（操作種別）
	 */
	public static final String OPE_INS = "ins";

	/**
	 * 更新（操作種別）
	 */
	public static final String OPE_UPD = "upd";

	/**
	 * 投入場所ＣＤ（検索項目）
	 */
	public static final String CND_LOC_CD = "loc_cd";
	/**
	 * 投入場所名（検索項目）
	 */
	public static final String CND_LOC_NM = "loc_nm";
	/**
	 * 棚・ラインＣＤ（検索項目）
	 */
	public static final String CND_STR_LN_CD = "str_ln_cd";
	/**
	 * 棚・ライン名（検索項目）
	 */
	public static final String CND_STR_LN_NM = "str_ln_nm";
	/**
	 * 在庫着荷先ＣＤ（検索項目）
	 */
	public static final String CND_STK_ARRV_BP_CD = "stk_arrv_bp_cd";
	/**
	 * 在庫着荷先名（検索項目）
	 */
	public static final String CND_STK_ARRV_BP_NM = "stk_arrv_bp_nm";
	/**
	 * 納品先・配送先在庫を除く（検索項目）
	 */
	public static final String CND_ONLY_INT_FLG = "only_int_flg";
	/**
	 * 工場・物流倉庫ＣＤ（検索項目）
	 */
	public static final String CND_SITE_CD = "site_cd";
	/**
	 * 工場・物流倉庫名（検索項目）
	 */
	public static final String CND_SITE_NM = "site_nm";
	/**
	 * ワーキンググループＣＤ（検索項目）
	 */
	public static final String CND_WG_CD = "wg_cd";
	/**
	 * ワーキンググループ名（検索項目）
	 */
	public static final String CND_WG_NM = "wg_nm";
	/**
	 * 物流グループＣＤ（検索項目）
	 */
	public static final String CND_LG_GRP_CD = "lg_grp_cd";
	/**
	 * 物流グループ名（検索項目）
	 */
	public static final String CND_LG_GRP_NM = "lg_grp_nm";
	/**
	 * 総量引当場所グループＣＤ（検索項目）
	 */
	public static final String CND_ALLOC_GRP_CD = "alloc_grp_cd";
	/**
	 * 総量引当場所グループ名（検索項目）
	 */
	public static final String CND_ALLOC_GRP_NM = "alloc_grp_nm";
	/**
	 * 製造場所グループＣＤ（検索項目）
	 */
	public static final String CND_LOC_GRP_CD = "loc_grp_cd";
	/**
	 * 製造場所グループ名（検索項目）
	 */
	public static final String CND_LOC_GRP_NM = "loc_grp_nm";
	/**
	 * 品目区分（検索項目）
	 */
	public static final String CND_ITM_TYP = "itm_typ";
	/**
	 * 品目区分詳細（検索項目）
	 */
	public static final String CND_ITM_TYP_D_CD = "itm_typ_d_cd";
	/**
	 * 品目区分詳細名（検索項目）
	 */
	public static final String CND_ITM_TYP_D_NM = "itm_typ_d_nm";
	/**
	 * 品目ＣＤ（検索項目）
	 */
	public static final String CND_ITM_CD = "itm_cd";
	/**
	 * 枝番１（検索項目）
	 */
	public static final String CND_ITM_SUB1 = "itm_sub1";
	/**
	 * 枝番２（検索項目）
	 */
	public static final String CND_ITM_SUB2 = "itm_sub2";
	/**
	 * 枝番３（検索項目）
	 */
	public static final String CND_ITM_SUB3 = "itm_sub3";
	/**
	 * 品名（検索項目）
	 */
	public static final String CND_ITM_NM = "itm_nm";
	/**
	 * 版ＮＯ（検索項目）
	 */
	public static final String CND_VER_NO = "ver_no";
	/**
	 * ロットＮＯ（検索項目）
	 */
	public static final String CND_LOT_NO = "lot_no";
	/**
	 * サブロットＮＯ（検索項目）
	 */
	public static final String CND_SUBLOT_NO = "sublot_no";
	/**
	 * 業者ＮＯ（検索項目）
	 */
	public static final String CND_BP_LOT_NO = "bp_lot_no";
	/**
	 * 手配ＮＯ１無し可（検索項目）
	 */
	public static final String CND_SNO1_NULL_FLG = "sno1_null_flg";
	/**
	 * 手配ＮＯ１（検索項目）
	 */
	public static final String CND_SNO1 = "sno1";
	/**
	 * 手配ＮＯ２無し可（検索項目）
	 */
	public static final String CND_SNO2_NULL_FLG = "sno2_null_flg";
	/**
	 * 手配ＮＯ２（検索項目）
	 */
	public static final String CND_SNO2 = "sno2";
	/**
	 * 手配ＮＯ３無し可（検索項目）
	 */
	public static final String CND_SNO3_NULL_FLG = "sno3_null_flg";
	/**
	 * 手配ＮＯ３（検索項目）
	 */
	public static final String CND_SNO3 = "sno3";
	/**
	 * 手配ＮＯ４無し可（検索項目）
	 */
	public static final String CND_SNO4_NULL_FLG = "sno4_null_flg";
	/**
	 * 手配ＮＯ４（検索項目）
	 */
	public static final String CND_SNO4 = "sno4";
	/**
	 * 案件ＮＯ（検索項目）
	 */
	public static final String CND_WRK_NO = "wrk_no";
	/**
	 * 案件名（検索項目）
	 */
	public static final String CND_WRK_NM = "wrk_nm";
	/**
	 * 有効期限ＦＲＯＭ（検索項目）
	 */
	public static final String CND_VLD_DT_FR = "vld_dt_fr";
	/**
	 * 有効期限ＴＯ（検索項目）
	 */
	public static final String CND_VLD_DT_TO = "vld_dt_to";
	/**
	 * 使用期限ＦＲＯＭ（検索項目）
	 */
	public static final String CND_LMT_DT_FR = "lmt_dt_fr";
	/**
	 * 使用期限ＴＯ（検索項目）
	 */
	public static final String CND_LMT_DT_TO = "lmt_dt_to";
	/**
	 * 期限未設定含む（検索項目）
	 */
	public static final String CND_UNREG_LMT_FLG = "unreg_lmt_flg";
	/**
	 * 格付ＣＤ（検索項目）
	 */
	public static final String CND_GD_CD = "gd_cd";
	/**
	 * 格付名（検索項目）
	 */
	public static final String CND_GD_NM = "gd_nm";
	/**
	 * 引当可能数：整数のみ（検索項目）
	 */
	public static final String CND_POSITIVE_FLG = "positive_flg";
	/**
	 * 引当保留除く（検索項目）
	 */
	public static final String CND_EXCEPT_ALLOC_WAIT_FLG = "except_alloc_wait_flg";
	/**
	 * 在庫なし含む（検索項目）
	 */
	public static final String CND_STK_SCHD_FLG = "stk_schd_flg";
	/**
	 * 総量引当対象の入庫予定含む（検索項目）
	 */
	public static final String CND_GRS_ALLOC_FLG = "grs_alloc_flg";

	/**
	 * 良品区分（検索項目）
	 */
	public static final String CND_QUALITY_TYP = "quality_typ";
	/**
	 * 在庫検査区分（検索項目）
	 */
	public static final String CND_STK_INSP_TYP = "stk_insp_typ";
	/**
	 * 資産区分（検索項目）
	 */
	public static final String CND_ASST_TYP = "asst_typ";
	/**
	 * 在庫識別区分（検索項目）
	 */
	public static final String CND_STK_ID_TYP = "stk_id_typ";

	/**
	 * 良品
	 */
	public static final String CND_QUALITY_TYP_GOOD_FLG = "quality_typ_good_flg";
	/**
	 * 工程不良品
	 */
	public static final String CND_QUALITY_TYP_DFCT_OPER_FLG = "quality_typ_dfct_oper_flg";
	/**
	 * 検査不良品
	 */
	public static final String CND_QUALITY_TYP_DFCT_INSP_FLG = "quality_typ_dfct_insp_flg";
	/**
	 * 保留
	 */
	public static final String CND_QUALITY_TYP_SSPND_FLG = "quality_typ_sspnd_flg";

	/**
	 * 検査待
	 */
	public static final String CND_STK_INSP_TYP_YET_FLG = "stk_insp_typ_yet_flg";
	/**
	 * 検査中
	 */
	public static final String CND_STK_INSP_TYP_ING_FLG = "stk_insp_typ_ing_flg";
	/**
	 * 判定待
	 */
	public static final String CND_STK_INSP_TYP_WAIT_JUDG_FLG = "stk_insp_typ_wait_judg_flg";
	/**
	 * 検査済
	 */
	public static final String CND_STK_INSP_TYP_FIN_FLG = "stk_insp_typ_fin_flg";

	/**
	 * 自社在庫
	 */
	public static final String CND_STK_ID_TYP_COSTK_FLG = "stk_id_typ_costk_flg";
	/**
	 * 返品検収前
	 */
	public static final String CND_STK_ID_TYP_RTN_PRE_ACCPT_FLG = "stk_id_typ_rtn_pre_accpt_flg";
	/**
	 * 預り
	 */
	public static final String CND_STK_ID_TYP_CSTSTK_FLG = "stk_id_typ_cststk_flg";
	/**
	 * VMI
	 */
	public static final String CND_STK_ID_TYP_RNT_RCV_FLG = "stk_id_typ_rnt_rcv_flg";
	/**
	 * 仕入検収前
	 */
	public static final String CND_STK_ID_TYP_PURC_PRE_ACCPT_FLG = "stk_id_typ_purc_pre_accpt_flg";
	/**
	 * 検収不良
	 */
	public static final String CND_STK_ID_TYP_ACCPT_DFCT_FLG = "stk_id_typ_accpt_dfct_flg";
	/**
	 * 無償受給
	 */
	public static final String CND_STK_ID_TYP_NCV_RCV_FLG = "stk_id_typ_ncv_rcv_flg";
	/**
	 * 有償支給
	 */
	public static final String CND_STK_ID_TYP_ONR_PROV_FLG = "stk_id_typ_onr_prov_flg";

	/**
	 * 在庫取引先ＣＤ（検索項目）
	 */
	public static final String CND_STK_BP_CD = "stk_bp_cd";
	/**
	 * 在庫取引先名（検索項目）
	 */
	public static final String CND_STK_BP_NM = "stk_bp_nm";
	/**
	 * 確定ＮＯ区分（検索項目）
	 */
	public static final String CND_FIX_NO_TYP = "fix_no_typ";
	/**
	 * 確定ＮＯ（検索項目）
	 */
	public static final String CND_FIX_NO = "fix_no";
	/**
	 * 荷姿単位ＣＤ（検索項目）
	 */
	public static final String CND_PACK_UNIT_CD = "pack_unit_cd";
	/**
	 * 荷姿単位名（検索項目）
	 */
	public static final String CND_PACK_UNIT_NM = "pack_unit_nm";
	/**
	 * 最古入庫日ＦＲＯＭ（検索項目）
	 */
	public static final String CND_FIRST_GR_DT_FR = "first_gr_dt_fr";
	/**
	 * 最古入庫日ＴＯ（検索項目）
	 */
	public static final String CND_FIRST_GR_DT_TO = "first_gr_dt_to";
	/**
	 * 予定日ＦＲＯＭ（検索項目）
	 */
	public static final String CND_SCHD_DT_FR = "schd_dt_fr";
	/**
	 * 予定日ＴＯ（検索項目）
	 */
	public static final String CND_SCHD_DT_TO = "schd_dt_to";

	/**
	 * 工場出荷承認状況区分
	 */
	public static final String CND_PLNT_APRV_STS_TYP = "chk_plnt_aprv_sts_typ";
	/**
	 * 市場出荷判定状況区分
	 */
	public static final String CND_MRKT_JUDG_STS_TYP = "chk_mrkt_judg_sts_typ";

	/**
	 * 未承認
	 */
	public static final String CND_PLNT_APRV_STS_TYP_OPN_FLG = "plnt_aprv_sts_typ_opn_flg";
	/**
	 * 承認済
	 */
	public static final String CND_PLNT_APRV_STS_TYP_ACPT_FLG = "plnt_aprv_sts_typ_acpt_flg";
	/**
	 * 却下
	 */
	public static final String CND_PLNT_APRV_STS_TYP_RJCT_FLG = "plnt_aprv_sts_typ_rjct_flg";
	/**
	 * 未設定
	 */
	public static final String CND_PLNT_APRV_STS_TYP_NON_FLG = "plnt_aprv_sts_typ_non_flg";
	/**
	 * 未判定
	 */
	public static final String CND_MRKT_JUDG_STS_TYP_OPN_FLG = "mrkt_judg_sts_typ_opn_flg";
	/**
	 * 出荷許可
	 */
	public static final String CND_MRKT_JUDG_STS_TYP_ACPT_FLG = "mrkt_judg_sts_typ_acpt_flg";
	/**
	 * 出荷禁止
	 */
	public static final String CND_MRKT_JUDG_STS_TYP_NOT_ACPT_FLG = "mrkt_judg_sts_typ_not_acpt_flg";
	/**
	 * 未設定
	 */
	public static final String CND_MRKT_JUDG_STS_TYP_NON_FLG = "mrkt_judg_sts_typ_non_flg";

	/**
	 * ワーキンググループＣＤ（検索項目・受注用）
	 */
	public static final String CND_SLO_WG_CD = "slo_wg_cd";
	/**
	 * 物流グループＣＤ（検索項目・受注用）
	 */
	public static final String CND_SLO_LG_GRP_CD = "slo_lg_grp_cd";

	/**
	 * 品目分類１（検索項目）
	 */
	public static final String CND_ITM_GRP_FLG1 = "itm_grp_flg1";
	/**
	 * 品目分類ＣＤ１（検索項目）
	 */
	public static final String CND_ITM_GRP_CD1 = "itm_grp_cd1";
	/**
	 * 品目分類名１（検索項目）
	 */
	public static final String CND_ITM_GRP_NM1 = "itm_grp_nm1";
	/**
	 * 品目分類２（検索項目）
	 */
	public static final String CND_ITM_GRP_FLG2 = "itm_grp_flg2";
	/**
	 * 品目分類ＣＤ２（検索項目）
	 */
	public static final String CND_ITM_GRP_CD2 = "itm_grp_cd2";
	/**
	 * 品目分類名２（検索項目）
	 */
	public static final String CND_ITM_GRP_NM2 = "itm_grp_nm2";
	/**
	 * 品目分類３（検索項目）
	 */
	public static final String CND_ITM_GRP_FLG3 = "itm_grp_flg3";
	/**
	 * 品目分類ＣＤ３（検索項目）
	 */
	public static final String CND_ITM_GRP_CD3 = "itm_grp_cd3";
	/**
	 * 品目分類名３（検索項目）
	 */
	public static final String CND_ITM_GRP_NM3 = "itm_grp_nm3";
	/**
	 * 品目分類４（検索項目）
	 */
	public static final String CND_ITM_GRP_FLG4 = "itm_grp_flg4";
	/**
	 * 品目分類ＣＤ４（検索項目）
	 */
	public static final String CND_ITM_GRP_CD4 = "itm_grp_cd4";
	/**
	 * 品目分類名４（検索項目）
	 */
	public static final String CND_ITM_GRP_NM4 = "itm_grp_nm4";
	/**
	 * 品目分類５（検索項目）
	 */
	public static final String CND_ITM_GRP_FLG5 = "itm_grp_flg5";
	/**
	 * 品目分類ＣＤ５（検索項目）
	 */
	public static final String CND_ITM_GRP_CD5 = "itm_grp_cd5";
	/**
	 * 品目分類名５（検索項目）
	 */
	public static final String CND_ITM_GRP_NM5 = "itm_grp_nm5";
	/**
	 * 品目分類６（検索項目）
	 */
	public static final String CND_ITM_GRP_FLG6 = "itm_grp_flg6";
	/**
	 * 品目分類ＣＤ６（検索項目）
	 */
	public static final String CND_ITM_GRP_CD6 = "itm_grp_cd6";
	/**
	 * 品目分類名６（検索項目）
	 */
	public static final String CND_ITM_GRP_NM6 = "itm_grp_nm6";
	/**
	 * 品目分類７（検索項目）
	 */
	public static final String CND_ITM_GRP_FLG7 = "itm_grp_flg7";
	/**
	 * 品目分類ＣＤ７（検索項目）
	 */
	public static final String CND_ITM_GRP_CD7 = "itm_grp_cd7";
	/**
	 * 品目分類名７（検索項目）
	 */
	public static final String CND_ITM_GRP_NM7 = "itm_grp_nm7";
	/**
	 * 品目分類８（検索項目）
	 */
	public static final String CND_ITM_GRP_FLG8 = "itm_grp_flg8";
	/**
	 * 品目分類ＣＤ８（検索項目）
	 */
	public static final String CND_ITM_GRP_CD8 = "itm_grp_cd8";
	/**
	 * 品目分類名８（検索項目）
	 */
	public static final String CND_ITM_GRP_NM8 = "itm_grp_nm8";
	/**
	 * 品目分類９（検索項目）
	 */
	public static final String CND_ITM_GRP_FLG9 = "itm_grp_flg9";
	/**
	 * 品目分類ＣＤ９（検索項目）
	 */
	public static final String CND_ITM_GRP_CD9 = "itm_grp_cd9";
	/**
	 * 品目分類名９（検索項目）
	 */
	public static final String CND_ITM_GRP_NM9 = "itm_grp_nm9";
	/**
	 * 品目分類１０（検索項目）
	 */
	public static final String CND_ITM_GRP_FLG10 = "itm_grp_flg10";
	/**
	 * 品目分類ＣＤ１０（検索項目）
	 */
	public static final String CND_ITM_GRP_CD10 = "itm_grp_cd10";
	/**
	 * 品目分類名１０（検索項目）
	 */
	public static final String CND_ITM_GRP_NM10 = "itm_grp_nm10";

	/**
	 * 集計：ワーキンググループ
	 */
	public static final String CND_WG_FLG = "wg_flg";
	/**
	 * 集計：版ＮＯ
	 */
	public static final String CND_VER_FLG = "ver_flg";
	/**
	 * 集計：ロットＮＯ
	 */
	public static final String CND_LOT_FLG = "lot_flg";
	/**
	 * 集計：場所
	 */
	public static final String CND_LOC_FLG = "loc_flg";
	/**
	 * 集計：棚・ライン
	 */
	public static final String CND_STR_LN_FLG = "str_ln_flg";
	/**
	 * 集計：工場・物流倉庫
	 */
	public static final String CND_SITE_FLG = "site_flg";
	/**
	 * 集計：物流Ｇ
	 */
	public static final String CND_LG_GRP_FLG = "lg_grp_flg";
	/**
	 * 集計：総量引当場所Ｇ
	 */
	public static final String CND_ALLOC_GRP_FLG = "alloc_grp_flg";
	/**
	 * 集計：製造場所Ｇ
	 */
	public static final String CND_LOC_GRP_FLG = "loc_grp_flg";
	/**
	 * 集計：格付
	 */
	public static final String CND_GD_FLG = "gd_flg";
	/**
	 * 集計：手配ＮＯ１
	 */
	public static final String CND_SNO1_FLG = "sno1_flg";
	/**
	 * 集計：手配ＮＯ２
	 */
	public static final String CND_SNO2_FLG = "sno2_flg";
	/**
	 * 集計：手配ＮＯ３
	 */
	public static final String CND_SNO3_FLG = "sno3_flg";
	/**
	 * 集計：手配ＮＯ４
	 */
	public static final String CND_SNO4_FLG = "sno4_flg";
	/**
	 * 集計：在庫識別区分
	 */
	public static final String CND_STK_ID_FLG = "stk_id_flg";
	/**
	 * 集計：確定ＮＯ
	 */
	public static final String CND_FIX_NO_FLG = "fix_no_flg";
	/**
	 * 集計：予定日
	 */
	public static final String CND_SCHD_DT_FLG = "schd_dt_flg";

	/**
	 * 在庫数コピー
	 */
	public static final String CND_STK_QTY_COPY_FLG = "stk_qty_copy_flg";
	/**
	 * 引当可能数コピー
	 */
	public static final String CND_ALLOC_QTY_COPY_FLG = "alloc_qty_copy_flg";

	/**
	 * 在庫情報検索区分
	 */
	public static final String CND_STK_INFO_SRCH_TYP = "stk_info_srch_typ";
	/**
	 * 在庫情報品目区分
	 */
	public static final String CND_STK_INFO_ITM_TYP = "stk_info_itm_typ";
	/**
	 * 在庫情報場所区分
	 */
	public static final String CND_STK_INFO_LOC_TYP = "stk_info_loc_typ";

	/**
	 * 品目ＣＤ（設定項目）
	 */
	public static final String INPT_ITM_CD = "itm_cd";
	/**
	 * 枝番１（設定項目）
	 */
	public static final String INPT_ITM_SUB1 = "itm_sub1";
	/**
	 * 枝番２（設定項目）
	 */
	public static final String INPT_ITM_SUB2 = "itm_sub2";
	/**
	 * 枝番３（設定項目）
	 */
	public static final String INPT_ITM_SUB3 = "itm_sub3";
	/**
	 * 品名（設定項目）
	 */
	public static final String INPT_ITM_NM = "itm_nm";
	/**
	 * 版ＮＯ（設定項目）
	 */
	public static final String INPT_VER_NO = "ver_no";
	/**
	 * ロットＮＯ（設定項目）
	 */
	public static final String INPT_LOT_NO = "lot_no";
	/**
	 * サブロットＮＯ（設定項目）
	 */
	public static final String INPT_SUBLOT_NO = "sublot_no";
	/**
	 * 業者ロットＮＯ（設定項目）
	 */
	public static final String INPT_BP_LOT_NO = "bp_lot_no";
	/**
	 * 場所ＣＤ（設定項目）
	 */
	public static final String INPT_LOC_CD = "loc_cd";
	/**
	 * 棚・ラインＣＤ（設定項目）
	 */
	public static final String INPT_STR_LN_CD = "str_ln_cd";
	/**
	 * 棚・ライン無ＦＬＧ（設定項目）
	 */
	public static final String INPT_STR_LN_CD_NONE_FLG = "str_ln_cd_none_flg";
	/**
	 * 物流グループＣＤ（設定項目）
	 */
	public static final String INPT_LG_GRP_CD = "lg_grp_cd";
	/**
	 * 総量引当場所グループＣＤ（設定項目）
	 */
	public static final String INPT_ALLOC_GRP_CD = "alloc_grp_cd";
	/**
	 * 格付ＣＤ（設定項目）
	 */
	public static final String INPT_GD_CD = "gd_cd";
	/**
	 * 積送品区分（設定項目）
	 */
	public static final String INPT_IN_XFR_TYP = "in_xfr_typ";
	/**
	 * 良品区分（設定項目）
	 */
	public static final String INPT_QUALITY_TYP = "quality_typ";
	/**
	 * 在庫検査区分（設定項目）
	 */
	public static final String INPT_STK_INSP_TYP = "stk_insp_typ";
	/**
	 * 手配ＮＯ１（設定項目）
	 */
	public static final String INPT_SNO1 = "sno1";
	/**
	 * 手配ＮＯ２（設定項目）
	 */
	public static final String INPT_SNO2 = "sno2";
	/**
	 * 手配ＮＯ３（設定項目）
	 */
	public static final String INPT_SNO3 = "sno3";
	/**
	 * 手配ＮＯ４（設定項目）
	 */
	public static final String INPT_SNO4 = "sno4";
	/**
	 * 資産区分（設定項目）
	 */
	public static final String INPT_ASST_TYP = "asst_typ";
	/**
	 * 在庫識別区分（設定項目）
	 */
	public static final String INPT_STK_ID_TYP = "stk_id_typ";
	/**
	 * 在庫取引先ＣＤ（設定項目）
	 */
	public static final String INPT_STK_BP_CD = "stk_bp_cd";
	/**
	 * 確定ＮＯ区分（設定項目）
	 */
	public static final String INPT_FIX_NO_TYP = "fix_no_typ";
	/**
	 * 確定ＮＯ（設定項目）
	 */
	public static final String INPT_FIX_NO = "fix_no";
	/**
	 * 在庫着荷先ＣＤ（設定項目）
	 */
	public static final String INPT_STK_ARRV_BP_CD = "stk_arrv_bp_cd";
	/**
	 * 在庫数量（荷）（設定項目）
	 */
	public static final String INPT_PACK_STK_QTY = "trd_unit_qty";
	/**
	 * 荷姿単位ＣＤ（設定項目）
	 */
	public static final String INPT_PACK_UNIT_CD = "trd_unit_cd";
	/**
	 * 在庫数量（基）（設定項目）
	 */
	public static final String INPT_BASE_STK_QTY = "base_unit_qty";
	/**
	 * 基準単位ＣＤ（設定項目）
	 */
	public static final String INPT_BASE_UNIT_CD = "base_unit_cd";

	/**
	 * 品目ＣＤ（設定項目）
	 */
	default public String getInptItmCdColumn() {
		return INPT_ITM_CD;
	}
	/**
	 * 枝番１（設定項目）
	 */
	default public String getInptItmSub1Column() {
		return INPT_ITM_SUB1;
	}
	/**
	 * 枝番２（設定項目）
	 */
	default public String getInptItmSub2Column() {
		return INPT_ITM_SUB2;
	}
	/**
	 * 枝番３（設定項目）
	 */
	default public String getInptItmSub3Column() {
		return INPT_ITM_SUB3;
	}
	/**
	 * 品名（設定項目）
	 */
	default public String getInptItmNmColumn() {
		return INPT_ITM_NM;
	}
	/**
	 * 版ＮＯ（設定項目）
	 */
	default public String getInptVerNoColumn() {
		return INPT_VER_NO;
	}
	/**
	 * ロットＮＯ（設定項目）
	 */
	default public String getInptLotNoColumn() {
		return INPT_LOT_NO;
	}
	/**
	 * サブロットＮＯ（設定項目）
	 */
	default public String getInptSublotNoColumn() {
		return INPT_SUBLOT_NO;
	}
	/**
	 * 業者ロットＮＯ（設定項目）
	 */
	default public String getInptBpLotNoColumn() {
		return INPT_BP_LOT_NO;
	}
	/**
	 * 場所ＣＤ（設定項目）
	 */
	default public String getInptLocCdColumn() {
		return INPT_LOC_CD;
	}
	/**
	 * 棚・ラインＣＤ（設定項目）
	 */
	default public String getInptStrLnCdColumn() {
		return INPT_STR_LN_CD;
	}
	/**
	 * 棚・ライン無ＦＬＧ（設定項目）
	 */
	default public String getInptStrLnCdNoneFlgColumn() {
		return INPT_STR_LN_CD_NONE_FLG;
	}
	/**
	 * 物流グループＣＤ（設定項目）
	 */
	default public String getInptLgGrpCdColumn() {
		return INPT_LG_GRP_CD;
	}
	/**
	 * 総量引当場所グループＣＤ（設定項目）
	 */
	default public String getInptAllocGrpCdColumn() {
		return INPT_ALLOC_GRP_CD;
	}
	/**
	 * 格付ＣＤ（設定項目）
	 */
	default public String getInptGdCdColumn() {
		return INPT_GD_CD;
	}
	/**
	 * 積送品区分（設定項目）
	 */
	default public String getInptInXfrTypColumn() {
		return INPT_IN_XFR_TYP;
	}
	/**
	 * 良品区分（設定項目）
	 */
	default public String getInptQualityTypColumn() {
		return INPT_QUALITY_TYP;
	}
	/**
	 * 在庫検査区分（設定項目）
	 */
	default public String getInptStkInspTypColumn() {
		return INPT_STK_INSP_TYP;
	}
	/**
	 * 手配ＮＯ１（設定項目）
	 */
	default public String getInptSno1Column() {
		return INPT_SNO1;
	}
	/**
	 * 手配ＮＯ２（設定項目）
	 */
	default public String getInptSno2Column() {
		return INPT_SNO2;
	}
	/**
	 * 手配ＮＯ３（設定項目）
	 */
	default public String getInptSno3Column() {
		return INPT_SNO3;
	}
	/**
	 * 手配ＮＯ４（設定項目）
	 */
	default public String getInptSno4Column() {
		return INPT_SNO4;
	}
	/**
	 * 資産区分（設定項目）
	 */
	default public String getInptAsstTypColumn() {
		return INPT_ASST_TYP;
	}
	/**
	 * 在庫識別区分（設定項目）
	 */
	default public String getInptStkIdTypColumn() {
		return INPT_STK_ID_TYP;
	}
	/**
	 * 在庫取引先ＣＤ（設定項目）
	 */
	default public String getInptStkBpCdColumn() {
		return INPT_STK_BP_CD;
	}
	/**
	 * 確定ＮＯ区分（設定項目）
	 */
	default public String getInptFixNoTypColumn() {
		return INPT_FIX_NO_TYP;
	}
	/**
	 * 確定ＮＯ（設定項目）
	 */
	default public String getInptFixNoColumn() {
		return INPT_FIX_NO;
	}
	/**
	 * 在庫着荷先ＣＤ（設定項目）
	 */
	default public String getInptStkArrvBpCdColumn() {
		return INPT_STK_ARRV_BP_CD;
	}
	/**
	 * 荷姿単位数量（設定項目）
	 */
	default public String getInptPackStkQtyColumn() {
		return INPT_PACK_STK_QTY;
	}
	/**
	 * 荷姿単位ＣＤ（設定項目）
	 */
	default public String getInptPackUnitCdColumn() {
		return INPT_PACK_UNIT_CD;
	}
	/**
	 * 基準単位数量（設定項目）
	 */
	default public String getInptBaseStkQtyColumn() {
		return INPT_BASE_STK_QTY;
	}
	/**
	 * 基準単位ＣＤ（設定項目）
	 */
	default public String getInptBaseUnitCdColumn() {
		return INPT_BASE_UNIT_CD;
	}

	/**
	 * 投入対象選択画面の検索項目の入力可否を取得する。<br>
	 * <br>
	 * 種別は下記の通りである。<br>
	 * <br>
	 * <table border="1">
	 * <tr><th>種別</th></tr>
	 * <tr><td> {@link #OPE_INS} </td></tr>
	 * <tr><td> {@link #OPE_UPD} </td></tr>
	 * </table>
	 * <br>
	 * 検索項目を表す定数は下記の通りである。<br>
	 * <br>
	 * <table border="1">
	 * <tr><th>検索項目を表す定数</th></tr>
	 * <tr><td> {@link #CND_LOC_CD} </td></tr>
	 * <tr><td> {@link #CND_LOC_NM} </td></tr>
	 * <tr><td> {@link #CND_STR_LN_CD} </td></tr>
	 * <tr><td> {@link #CND_STR_LN_NM} </td></tr>
	 * <tr><td> {@link #CND_STK_ARRV_BP_CD} </td></tr>
	 * <tr><td> {@link #CND_STK_ARRV_BP_NM} </td></tr>
	 * <tr><td> {@link #CND_ONLY_INT_FLG} </td></tr>
	 * <tr><td> {@link #CND_SITE_CD} </td></tr>
	 * <tr><td> {@link #CND_SITE_NM} </td></tr>
	 * <tr><td> {@link #CND_WG_CD} </td></tr>
	 * <tr><td> {@link #CND_WG_NM} </td></tr>
	 * <tr><td> {@link #CND_LG_GRP_CD} </td></tr>
	 * <tr><td> {@link #CND_LG_GRP_NM} </td></tr>
	 * <tr><td> {@link #CND_ALLOC_GRP_CD} </td></tr>
	 * <tr><td> {@link #CND_ALLOC_GRP_NM} </td></tr>
	 * <tr><td> {@link #CND_LOC_GRP_CD} </td></tr>
	 * <tr><td> {@link #CND_LOC_GRP_NM} </td></tr>
	 * <tr><td> {@link #CND_ITM_TYP} </td></tr>
	 * <tr><td> {@link #CND_ITM_TYP_D_CD} </td></tr>
	 * <tr><td> {@link #CND_ITM_TYP_D_NM} </td></tr>
	 * <tr><td> {@link #CND_ITM_CD} </td></tr>
	 * <tr><td> {@link #CND_ITM_SUB1} </td></tr>
	 * <tr><td> {@link #CND_ITM_SUB2} </td></tr>
	 * <tr><td> {@link #CND_ITM_SUB3} </td></tr>
	 * <tr><td> {@link #CND_ITM_NM} </td></tr>
	 * <tr><td> {@link #CND_VER_NO} </td></tr>
	 * <tr><td> {@link #CND_LOT_NO} </td></tr>
	 * <tr><td> {@link #CND_SUBLOT_NO} </td></tr>
	 * <tr><td> {@link #CND_BP_LOT_NO} </td></tr>
	 * <tr><td> {@link #CND_SNO1} </td></tr>
	 * <tr><td> {@link #CND_SNO2} </td></tr>
	 * <tr><td> {@link #CND_SNO3} </td></tr>
	 * <tr><td> {@link #CND_SNO4} </td></tr>
	 * <tr><td> {@link #CND_WRK_NO} </td></tr>
	 * <tr><td> {@link #CND_WRK_NM} </td></tr>
	 * <tr><td> {@link #CND_VLD_DT_FR} </td></tr>
	 * <tr><td> {@link #CND_VLD_DT_TO} </td></tr>
	 * <tr><td> {@link #CND_LMT_DT_FR} </td></tr>
	 * <tr><td> {@link #CND_LMT_DT_TO} </td></tr>
	 * <tr><td> {@link #CND_UNREG_LMT_FLG} </td></tr>
	 * <tr><td> {@link #CND_GD_CD} </td></tr>
	 * <tr><td> {@link #CND_GD_NM} </td></tr>
	 * <tr><td> {@link #CND_STK_BP_CD} </td></tr>
	 * <tr><td> {@link #CND_STK_BP_NM} </td></tr>
	 * <tr><td> {@link #CND_ASST_TYP} </td></tr>
	 * <tr><td> {@link #CND_FIX_NO_TYP} </td></tr>
	 * <tr><td> {@link #CND_FIX_NO} </td></tr>
	 * <tr><td> {@link #CND_PACK_UNIT_CD} </td></tr>
	 * <tr><td> {@link #CND_PACK_UNIT_NM} </td></tr>
	 * <tr><td> {@link #CND_FIRST_GR_DT_FR} </td></tr>
	 * <tr><td> {@link #CND_FIRST_GR_DT_TO} </td></tr>
	 * <tr><td> {@link #CND_SCHD_DT_FR} </td></tr>
	 * <tr><td> {@link #CND_SCHD_DT_TO} </td></tr>
	 * <tr><td> {@link #CND_POSITIVE_FLG} </td></tr>
	 * <tr><td> {@link #CND_EXCEPT_ALLOC_WAIT_FLG} </td></tr>
	 * <tr><td> {@link #CND_STK_SCHD_FLG} </td></tr>
	 * <tr><td> {@link #CND_GRS_ALLOC_FLG} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_FLG1} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_CD1} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_NM1} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_FLG2} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_CD2} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_NM2} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_FLG3} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_CD3} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_NM3} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_FLG4} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_CD4} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_NM4} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_FLG5} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_CD5} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_NM5} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_FLG6} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_CD6} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_NM6} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_FLG7} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_CD7} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_NM7} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_FLG8} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_CD8} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_NM8} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_FLG9} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_CD9} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_NM9} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_FLG10} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_CD10} </td></tr>
	 * <tr><td> {@link #CND_ITM_GRP_NM10} </td></tr>
	 * </table>
	 * 
	 * @param ope 種別
	 * @param name 検索項目を表す定数
	 * @return 検索項目の入力可否
	 */
	default public boolean isInptTrgtSelCndEnable(String ope, String name) {
		return true;
	}
	default public boolean isInptTrgtSelCndEnable(String ope, String name, MCTable<?> table) {
		return isInptTrgtSelCndEnable(ope, name);
	}

	/**
	 * 投入対象選択画面の初期種別を取得する。<br>
	 * <br>
	 * 戻り値は下記の通りとする。<br>
	 * <br>
	 * <table border="1">
	 * <tr><th>戻り値</th></tr>
	 * <tr><td> {@link #OPE_INS} </td></tr>
	 * <tr><td> {@link #OPE_UPD} </td></tr>
	 * </table>
	 * 
	 * @param table 表示元画面のテーブル
	 * @param index 処理対象行
	 * @return 投入対象選択画面の初期種別
	 */
	default public String getInptTrgtSelOpeType(MCTable<?> table, int index) {
		return IfInptTrgtSelBase.OPE_INS;
	}

	/**
	 * 投入対象選択で決定した内容を表示元画面のテーブルに反映してよいかどうか。
	 * @param ope 種別
	 * @param inptList 投入対象選択で決定した内容
	 * @param msgList 値反映してよくない場合に表示するメッセージ
	 * @return 値反映してよい場合はtrue
	 */
	default public boolean isCommittableInptTrgtData(String ope, MCList<MCRow> inptList, MCMessageList msgList) {
		return true;
	}

	/**
	 * 投入対象選択を開いたときに検索を実行するかどうか。
	 * @param openTyp 起動タイプ
	 * @param bind バインド値
	 * @param args 
	 * @return 検索する場合はtrue
	 */
	default public boolean isInptTrgtSrch(String openTyp, MCRow bind, Object... args) {
		return true;
	}

	/**
	 * 投入対象選択で決定した内容を対象行に反映してよいかどうか。
	 * @param panel 埋込画面
	 * @param index 表示元画面のテーブルの処理対象行
	 * @return 値反映してよい場合はtrue
	 * @see mcframe.clientSP.SPP0000.IfInptTrgtSelBase#isEditableInptTrgtData(MCRootPanel, int)
	 */
	default public boolean isEditableInptTrgtData(MCRootPanel panel, int index) {
		return true;
	}

	/**
	 * 投入対象選択画面の表示可否を判断する。<br>
	 * <br>
	 * 投入対象選択画面を表示する場合は true を返す。
	 * 
	 * @param panel 埋込画面
	 * @return 投入対象選択画面を表示しない場合は false
	 */
	default public boolean checkOpenInptTrgtSelPanel(MCRootPanel panel) {
		if (panel == null) {
			return false;
		}

		if (!(panel instanceof mcframe.clientMSUB.MSUBP0080.MSUBP_InptTrgtSel_H)) {
			return false;
		}

		return true;
	}

	/**
	 * 「種別」の選択可否を判断する。<br>
	 * 指定された「種別」を選択できる場合は true を返す。<br>
	 * <br>
	 * 種別は下記の通りである。<br>
	 * <br>
	 * <table border="1">
	 * <tr><th>種別</th></tr>
	 * <tr><td> {@link #OPE_INS} </td></tr>
	 * <tr><td> {@link #OPE_UPD} </td></tr>
	 * </table>
	 * 
	 * @param panel 埋込画面
	 * @param index 処理対象行
	 * @param ope 種別
	 * @return 「種別」を選択できない場合は false
	 */
	default public boolean isOpeTypEnable(MCRootPanel panel, int index, String ope) {
		if (ope == IfInptTrgtSelBase.OPE_INS) {
			return true;
		}

		return false;
	}

	/**
	 * 投入対象選択画面から表示元画面の項目への値の設定可否を判断する。<br>
	 * <br>
	 * 種別は下記の通りである。<br>
	 * <br>
	 * <table border="1">
	 * <tr><th>種別</th></tr>
	 * <tr><td> {@link #OPE_INS} </td></tr>
	 * <tr><td> {@link #OPE_UPD} </td></tr>
	 * </table>
	 * <br>
	 * 項目を表す定数は下記の通りである。<br>
	 * <br>
	 * <table border="1">
	 * <tr><th>項目を表す定数</th></tr>
	 * <tr><td> {@link #INPT_ITM_CD} </td></tr>
	 * <tr><td> {@link #INPT_ITM_SUB1} </td></tr>
	 * <tr><td> {@link #INPT_ITM_SUB2} </td></tr>
	 * <tr><td> {@link #INPT_ITM_SUB3} </td></tr>
	 * <tr><td> {@link #INPT_VER_NO} </td></tr>
	 * <tr><td> {@link #INPT_LOT_NO} </td></tr>
	 * <tr><td> {@link #INPT_SUBLOT_NO} </td></tr>
	 * <tr><td> {@link #INPT_BP_LOT_NO} </td></tr>
	 * <tr><td> {@link #INPT_LOC_CD} </td></tr>
	 * <tr><td> {@link #INPT_STR_LN_CD} </td></tr>
	 * <tr><td> {@link #INPT_STR_LN_CD_NONE_FLG} </td></tr>
	 * <tr><td> {@link #INPT_LG_GRP_CD} </td></tr>
	 * <tr><td> {@link #INPT_ALLOC_GRP_CD} </td></tr>
	 * <tr><td> {@link #INPT_GD_CD} </td></tr>
	 * <tr><td> {@link #INPT_IN_XFR_TYP} </td></tr>
	 * <tr><td> {@link #INPT_QUALITY_TYP} </td></tr>
	 * <tr><td> {@link #INPT_STK_INSP_TYP} </td></tr>
	 * <tr><td> {@link #INPT_SNO1} </td></tr>
	 * <tr><td> {@link #INPT_SNO2} </td></tr>
	 * <tr><td> {@link #INPT_SNO3} </td></tr>
	 * <tr><td> {@link #INPT_SNO4} </td></tr>
	 * <tr><td> {@link #INPT_ASST_TYP} </td></tr>
	 * <tr><td> {@link #INPT_STK_ID_TYP} </td></tr>
	 * <tr><td> {@link #INPT_STK_BP_CD} </td></tr>
	 * <tr><td> {@link #INPT_FIX_NO_TYP} </td></tr>
	 * <tr><td> {@link #INPT_FIX_NO} </td></tr>
	 * <tr><td> {@link #INPT_STK_ARRV_BP_CD} </td></tr>
	 * <tr><td> {@link #INPT_PACK_STK_QTY} </td></tr>
	 * <tr><td> {@link #INPT_PACK_UNIT_CD} </td></tr>
	 * <tr><td> {@link #INPT_BASE_STK_QTY} </td></tr>
	 * <tr><td> {@link #INPT_BASE_UNIT_CD} </td></tr>
	 * <tr><td> {@link #INPT_ALLOC_QTY} </td></tr>
	 * </table>
	 * <br>
	 * <font color="red">
	 * 表示元画面の項目がヘッダ項目の場合は、このメソッドを呼び出すことなく、
	 * 表示元画面の項目に値を設定しません。
	 * </font>
	 * 
	 * @param panel 埋込画面
	 * @param index 処理対象行
	 * @param ope 種別
	 * @param name 項目を表す定数
	 * @return 値の設定可否
	 */
	default public boolean isValueLink(MCRootPanel panel, int index, String ope, String name) {
		return true;
	}

	/**
	 * 在庫情報を表示するテーブルを取得する。
	 * 
	 * @param panel 埋込画面
	 * @return テーブル
	 */
	public MCTable<?> getInptTable(MCRootPanel panel);

	/**
	 * 在庫情報を表示するテーブルを取得する。
	 * 
	 * @param panel 埋込画面
	 * @return テーブル
	 */
	public MCRow get_open_MSBCP1060_bind_Row(MCTable<?> table);

	/**
	 * 表示元画面のテーブルに行を追加する。<br>
	 * 投入対象選択画面の種別が「新規」の場合に実行される。
	 * 
	 * @param table 表示元画面のテーブル
	 * @return 追加された行
	 */
	default public MCConstRow insertInptTrgtRow(MCTable<?> table) {
		if (table == null) {
			return null;
		}

		return getInsertRow(table);
	}

	/**
	 * 引数の対象テーブルから新規追加行を取得する。<br>
	 * 取得できない場合、対象テーブルの末尾に新しい行を作る
	 * @param table 対象テーブル
	 * @return 新規追加行
	 */
	default public MCConstRow getInsertRow(MCTable<?> table) {
		int i = 0;
		if (table.getRowCount() > 0 && table.getSelectedMCRow() != null) {
			i = table.getSelectedMCRow().getGUIIndex();
		}

		if (i < 0) i = 0;
		MCConstRow row = null;
		for (; i < table.getRowCount(); i++) {
			if (canBeInsertedRow(table.getRow(i))) {
				row = table.getRow(i);
				table.selectRowNoFocus(i);
				break;
			}
		}

		if (row == null) {;
			table.insertRowLast();
			row = table.getRow(table.getRowCount() -1);
		}

		return row;
	}

	/**
	 * 引数の対象行を新規追加行として、可能かどうかチェックする。
	 * @param row 対象行
	 * @return true: 新規追加行としてＯＫ, false: 新規追加行としてＮＧ
	 */
	default public boolean canBeInsertedRow(MCConstRow row) {
		if (row == null) {
			return false;
		}
		if (row.isStatusDelete() || row.isStatusModify()) {
			return false;
		}
		if (row.getStringNE("itm_cd") != null) {
			return false;
		}

		return true;
	}

	/**
	 * 投入対象選択画面のデータを表示元画面のテーブルに設定した後に実行される。<br>
	 * 投入対象選択画面の種別が「新規」の場合に実行される。
	 * 
	 * @param panel 埋込画面
	 * @param index 表示元画面のテーブルの処理対象行
	 * @see #afterUpdInptTrgtData(MCRootPanel, int)
	 */
	default public void afterInsInptTrgtData(MCRootPanel panel, int index) {
	}

	/**
	 * 投入対象選択画面のデータを表示元画面のテーブルに設定した後に実行される。<br>
	 * 投入対象選択画面の種別が「更新」の場合に実行される。
	 * 
	 * @param panel 埋込画面
	 * @param index 表示元画面のテーブルの処理対象行
	 * @see #afterInsInptTrgtData(MCRootPanel, int)
	 */
	default public void afterUpdInptTrgtData(MCRootPanel panel, int index) {
	}

	/**
	 * 呼び出し元画面の項目に値を設定時に、エラーを無視する項目リストを返す。
	 * @return エラーを無視する項目リスト
	 */
	default public List<String> getIgnoreErrItems() {
		return new ArrayList<>();
	}

	/**
	 * 表示元画面に配置されている埋込画面を取得する時の関連情報
	 */
	public interface GetStkPartsInfo_MC {

		/**
		 * 「フォーカス行に反映」の場合
		 */
		public static int EVENT_TYPE_UPD = 1;

		/**
		 * 「行追加して反映」の場合
		 */
		public static int EVENT_TYPE_INS = 2;

		/**
		 * どのイベントに関連する埋込画面の取得かを表す区分を返す。
		 *  
		 * @return {@link #EVENT_TYPE_UPD} 又は {@link #EVENT_TYPE_INS}
		 */
		public int getEventType();
	}
}