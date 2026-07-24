package mcframe.clientMSBD.MSBDP0240;

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
	 * INS,Create;UPD,Modify;DEL,Cancel;REF,View;PRNT,Issue report INS,登録する;UPD,訂正する;DEL,取り消す;REF,参照する;PRNT,帳票発行.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Target 対象.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $not_edi_flg = "not_edi_flg";
	public static final String $dlv_rqst_dt_frto_p = "dlv_rqst_dt_frto_p";
	public static final String $arr_schd_dt_p = "arr_schd_dt_p";
	/**
	 * PO date FROM 発注日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $po_dt_fr = "po_dt_fr";
	/**
	 * PO date TO 発注日ＴＯ.<p>
	 *
	 */
	public static final String $po_dt_to = "po_dt_to";
	/**
	 * Delivery order date FROM 納入指示日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dlv_inst_dt_fr = "dlv_inst_dt_fr";
	/**
	 * Delivery order date TO 納入指示日ＴＯ.<p>
	 *
	 */
	public static final String $dlv_inst_dt_to = "dlv_inst_dt_to";
	/**
	 * Order promising result received date FROM 納期回答受領日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $prms_rcpt_dt_fr = "prms_rcpt_dt_fr";
	/**
	 * Order promising result received date TO 納期回答受領日ＴＯ.<p>
	 *
	 */
	public static final String $prms_rcpt_dt_to = "prms_rcpt_dt_to";
	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public static final String $purc_sts_typ = "purc_sts_typ";
	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public static final String $purc_sts_typ_nm = "purc_sts_typ_nm";
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
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Order promising result received G No. 納期回答受領ＧＮＯ.<p>
	 *
	 */
	public static final String $prms_rcpt_grp_no = "prms_rcpt_grp_no";
	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public static final String $prms_rcpt_no = "prms_rcpt_no";
	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public static final String $prms_rcpt_d_no = "prms_rcpt_d_no";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $dtl_intr_rmrks = "dtl_intr_rmrks";
	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public static final String $prms_rmrks = "prms_rmrks";
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
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $dtl_sub_char1 = "dtl_sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $dtl_sub_char2 = "dtl_sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $dtl_sub_char3 = "dtl_sub_char3";
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public static final String $incl_can_flg = "incl_can_flg";
	public static final String $bp_grp_p = "bp_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $dlv_rqst_dt_fr = $dlv_rqst_dt_frto_p + ".ymd_fr";
	public static final String $dlv_rqst_hm_fr = $dlv_rqst_dt_frto_p + ".hm_fr";
	public static final String $dlv_rqst_dt_to = $dlv_rqst_dt_frto_p + ".ymd_to";
	public static final String $dlv_rqst_hm_to = $dlv_rqst_dt_frto_p + ".hm_to";
	public static final String $arr_schd_dt_fr = $arr_schd_dt_p + ".ymd_fr";
	public static final String $arr_schd_hm_fr = $arr_schd_dt_p + ".hm_fr";
	public static final String $arr_schd_dt_to = $arr_schd_dt_p + ".ymd_to";
	public static final String $arr_schd_hm_to = $arr_schd_dt_p + ".hm_to";
	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_nm = $itm_typ_p + ".itm_typ_nm";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $bp_grp_lab1 = $bp_grp_p + ".bp_grp_lab1";
	public static final String $bp_grp_flg1 = $bp_grp_p + ".bp_grp_flg1";
	public static final String $bp_grp_cd1 = $bp_grp_p + ".bp_grp_cd1";
	public static final String $bp_grp_nm1 = $bp_grp_p + ".bp_grp_nm1";
	public static final String $bp_grp_lab2 = $bp_grp_p + ".bp_grp_lab2";
	public static final String $bp_grp_flg2 = $bp_grp_p + ".bp_grp_flg2";
	public static final String $bp_grp_cd2 = $bp_grp_p + ".bp_grp_cd2";
	public static final String $bp_grp_nm2 = $bp_grp_p + ".bp_grp_nm2";
	public static final String $bp_grp_lab3 = $bp_grp_p + ".bp_grp_lab3";
	public static final String $bp_grp_flg3 = $bp_grp_p + ".bp_grp_flg3";
	public static final String $bp_grp_cd3 = $bp_grp_p + ".bp_grp_cd3";
	public static final String $bp_grp_nm3 = $bp_grp_p + ".bp_grp_nm3";
	public static final String $bp_grp_lab4 = $bp_grp_p + ".bp_grp_lab4";
	public static final String $bp_grp_flg4 = $bp_grp_p + ".bp_grp_flg4";
	public static final String $bp_grp_cd4 = $bp_grp_p + ".bp_grp_cd4";
	public static final String $bp_grp_nm4 = $bp_grp_p + ".bp_grp_nm4";
	public static final String $bp_grp_lab5 = $bp_grp_p + ".bp_grp_lab5";
	public static final String $bp_grp_flg5 = $bp_grp_p + ".bp_grp_flg5";
	public static final String $bp_grp_cd5 = $bp_grp_p + ".bp_grp_cd5";
	public static final String $bp_grp_nm5 = $bp_grp_p + ".bp_grp_nm5";
	public static final String $bp_grp_lab6 = $bp_grp_p + ".bp_grp_lab6";
	public static final String $bp_grp_flg6 = $bp_grp_p + ".bp_grp_flg6";
	public static final String $bp_grp_cd6 = $bp_grp_p + ".bp_grp_cd6";
	public static final String $bp_grp_nm6 = $bp_grp_p + ".bp_grp_nm6";
	public static final String $bp_grp_lab7 = $bp_grp_p + ".bp_grp_lab7";
	public static final String $bp_grp_flg7 = $bp_grp_p + ".bp_grp_flg7";
	public static final String $bp_grp_cd7 = $bp_grp_p + ".bp_grp_cd7";
	public static final String $bp_grp_nm7 = $bp_grp_p + ".bp_grp_nm7";
	public static final String $bp_grp_lab8 = $bp_grp_p + ".bp_grp_lab8";
	public static final String $bp_grp_flg8 = $bp_grp_p + ".bp_grp_flg8";
	public static final String $bp_grp_cd8 = $bp_grp_p + ".bp_grp_cd8";
	public static final String $bp_grp_nm8 = $bp_grp_p + ".bp_grp_nm8";
	public static final String $bp_grp_lab9 = $bp_grp_p + ".bp_grp_lab9";
	public static final String $bp_grp_flg9 = $bp_grp_p + ".bp_grp_flg9";
	public static final String $bp_grp_cd9 = $bp_grp_p + ".bp_grp_cd9";
	public static final String $bp_grp_nm9 = $bp_grp_p + ".bp_grp_nm9";
	public static final String $bp_grp_lab10 = $bp_grp_p + ".bp_grp_lab10";
	public static final String $bp_grp_flg10 = $bp_grp_p + ".bp_grp_flg10";
	public static final String $bp_grp_cd10 = $bp_grp_p + ".bp_grp_cd10";
	public static final String $bp_grp_nm10 = $bp_grp_p + ".bp_grp_nm10";
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
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_edi_flg_META = createCommonMeta($not_edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_rqst_dt_frto_p_META = createInnerRowMeta($dlv_rqst_dt_frto_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta arr_schd_dt_p_META = createInnerRowMeta($arr_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta po_dt_fr_META = createCommonMeta($po_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_dt_to_META = createCommonMeta($po_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_dt_fr_META = createCommonMeta($dlv_inst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_dt_to_META = createCommonMeta($dlv_inst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_rcpt_dt_fr_META = createCommonMeta($prms_rcpt_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_rcpt_dt_to_META = createCommonMeta($prms_rcpt_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_sts_typ_META = createCommonMeta($purc_sts_typ, mcframe.commonMS.meta.MS_META.PURC_STS_TYP);
	public static final MCMeta purc_sts_typ_nm_META = createCommonMeta($purc_sts_typ_nm, mcframe.commonMS.meta.MS_META.PURC_STS_TYP_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta prms_rcpt_grp_no_META = createCommonMeta($prms_rcpt_grp_no, mcframe.commonMS.meta.MS_META.PRMS_RCPT_GRP_NO);
	public static final MCMeta prms_rcpt_no_META = createCommonMeta($prms_rcpt_no, mcframe.commonMA.meta.MA_META.PRMS_RCPT_NO);
	public static final MCMeta prms_rcpt_d_no_META = createCommonMeta($prms_rcpt_d_no, mcframe.commonMA.meta.MA_META.PRMS_RCPT_D_NO);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PRMS_RCPT_INTR_RMRKS);
	public static final MCMeta dtl_intr_rmrks_META = createCommonMeta($dtl_intr_rmrks, mcframe.commonMS.meta.MS_META.PRMS_RCPT_D_INTR_RMRKS);
	public static final MCMeta prms_rmrks_META = createCommonMeta($prms_rmrks, mcframe.commonMS.meta.MS_META.PRMS_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PRMS_RCPT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PRMS_RCPT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PRMS_RCPT_SUB_CHAR3);
	public static final MCMeta dtl_sub_char1_META = createCommonMeta($dtl_sub_char1, mcframe.commonMS.meta.MS_META.PRMS_RCPT_SUB_D_CHAR1);
	public static final MCMeta dtl_sub_char2_META = createCommonMeta($dtl_sub_char2, mcframe.commonMS.meta.MS_META.PRMS_RCPT_SUB_D_CHAR2);
	public static final MCMeta dtl_sub_char3_META = createCommonMeta($dtl_sub_char3, mcframe.commonMS.meta.MS_META.PRMS_RCPT_SUB_D_CHAR3);
	public static final MCMeta incl_can_flg_META = createCommonMeta($incl_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_p_META = createInnerRowMeta($bp_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			edi_flg_META,
			not_edi_flg_META,
			dlv_rqst_dt_frto_p_META,
			arr_schd_dt_p_META,
			po_dt_fr_META,
			po_dt_to_META,
			dlv_inst_dt_fr_META,
			dlv_inst_dt_to_META,
			prms_rcpt_dt_fr_META,
			prms_rcpt_dt_to_META,
			purc_sts_typ_META,
			purc_sts_typ_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			itm_typ_p_META,
			itm_p_META,
			po_no_META,
			po_d_no_META,
			prms_rcpt_grp_no_META,
			prms_rcpt_no_META,
			prms_rcpt_d_no_META,
			intr_rmrks_META,
			dtl_intr_rmrks_META,
			prms_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			dtl_sub_char1_META,
			dtl_sub_char2_META,
			dtl_sub_char3_META,
			incl_can_flg_META,
			bp_grp_p_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"dlv_rqst_dt_fr",
				"dlv_rqst_hm_fr",
				"dlv_rqst_dt_to",
				"dlv_rqst_hm_to",
				"arr_schd_dt_fr",
				"arr_schd_hm_fr",
				"arr_schd_dt_to",
				"arr_schd_hm_to",
				"itm_typ",
				"itm_typ_nm",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"bp_grp_flg1",
				"bp_grp_cd1",
				"bp_grp_nm1",
				"bp_grp_flg2",
				"bp_grp_cd2",
				"bp_grp_nm2",
				"bp_grp_flg3",
				"bp_grp_cd3",
				"bp_grp_nm3",
				"bp_grp_flg4",
				"bp_grp_cd4",
				"bp_grp_nm4",
				"bp_grp_flg5",
				"bp_grp_cd5",
				"bp_grp_nm5",
				"bp_grp_flg6",
				"bp_grp_cd6",
				"bp_grp_nm6",
				"bp_grp_flg7",
				"bp_grp_cd7",
				"bp_grp_nm7",
				"bp_grp_flg8",
				"bp_grp_cd8",
				"bp_grp_nm8",
				"bp_grp_flg9",
				"bp_grp_cd9",
				"bp_grp_nm9",
				"bp_grp_flg10",
				"bp_grp_cd10",
				"bp_grp_nm10",
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
				$dlv_rqst_dt_fr,
				$dlv_rqst_hm_fr,
				$dlv_rqst_dt_to,
				$dlv_rqst_hm_to,
				$arr_schd_dt_fr,
				$arr_schd_hm_fr,
				$arr_schd_dt_to,
				$arr_schd_hm_to,
				$itm_typ,
				$itm_typ_nm,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$bp_grp_flg1,
				$bp_grp_cd1,
				$bp_grp_nm1,
				$bp_grp_flg2,
				$bp_grp_cd2,
				$bp_grp_nm2,
				$bp_grp_flg3,
				$bp_grp_cd3,
				$bp_grp_nm3,
				$bp_grp_flg4,
				$bp_grp_cd4,
				$bp_grp_nm4,
				$bp_grp_flg5,
				$bp_grp_cd5,
				$bp_grp_nm5,
				$bp_grp_flg6,
				$bp_grp_cd6,
				$bp_grp_nm6,
				$bp_grp_flg7,
				$bp_grp_cd7,
				$bp_grp_nm7,
				$bp_grp_flg8,
				$bp_grp_cd8,
				$bp_grp_nm8,
				$bp_grp_flg9,
				$bp_grp_cd9,
				$bp_grp_nm9,
				$bp_grp_flg10,
				$bp_grp_cd10,
				$bp_grp_nm10,
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
				{$purc_sts_typ, "purc_sts_typ_nm"},	// purc_sts_typ
				{$sppl_cd, "bp_nm"}	// sppl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;true"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;true"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2;true"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ;sundry_itm_nm_rem_flg"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;sundry_itm_nm_rem_flg"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	 * INS,Create;UPD,Modify;DEL,Cancel;REF,View;PRNT,Issue report INS,登録する;UPD,訂正する;DEL,取り消す;REF,参照する;PRNT,帳票発行.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * INS,Create;UPD,Modify;DEL,Cancel;REF,View;PRNT,Issue report INS,登録する;UPD,訂正する;DEL,取り消す;REF,参照する;PRNT,帳票発行.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 1, $edi_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 1, $edi_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean not_edi_flg() {
		return getConstBoolean(offset + 2, $not_edi_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void not_edi_flg(boolean value) {
		setConstBoolean(offset + 2, $not_edi_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR dlv_rqst_dt_frto_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 3, $dlv_rqst_dt_frto_p);
	}
	
	public void dlv_rqst_dt_frto_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 3, $dlv_rqst_dt_frto_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR arr_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 4, $arr_schd_dt_p);
	}
	
	public void arr_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 4, $arr_schd_dt_p, row);
	}


	/**
	 * PO date FROM 発注日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate po_dt_fr() {
		return getConstDate(offset + 5, $po_dt_fr);
	}

	/**
	 * PO date FROM 発注日ＦＲＯＭ.<p>
	 *
	 */
	public void po_dt_fr(MCDate value) {
		setConstDate(offset + 5, $po_dt_fr, value);
	}


	/**
	 * PO date TO 発注日ＴＯ.<p>
	 *
	 */
	public MCDate po_dt_to() {
		return getConstDate(offset + 6, $po_dt_to);
	}

	/**
	 * PO date TO 発注日ＴＯ.<p>
	 *
	 */
	public void po_dt_to(MCDate value) {
		setConstDate(offset + 6, $po_dt_to, value);
	}


	/**
	 * Delivery order date FROM 納入指示日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_inst_dt_fr() {
		return getConstDate(offset + 7, $dlv_inst_dt_fr);
	}

	/**
	 * Delivery order date FROM 納入指示日ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_inst_dt_fr(MCDate value) {
		setConstDate(offset + 7, $dlv_inst_dt_fr, value);
	}


	/**
	 * Delivery order date TO 納入指示日ＴＯ.<p>
	 *
	 */
	public MCDate dlv_inst_dt_to() {
		return getConstDate(offset + 8, $dlv_inst_dt_to);
	}

	/**
	 * Delivery order date TO 納入指示日ＴＯ.<p>
	 *
	 */
	public void dlv_inst_dt_to(MCDate value) {
		setConstDate(offset + 8, $dlv_inst_dt_to, value);
	}


	/**
	 * Order promising result received date FROM 納期回答受領日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate prms_rcpt_dt_fr() {
		return getConstDate(offset + 9, $prms_rcpt_dt_fr);
	}

	/**
	 * Order promising result received date FROM 納期回答受領日ＦＲＯＭ.<p>
	 *
	 */
	public void prms_rcpt_dt_fr(MCDate value) {
		setConstDate(offset + 9, $prms_rcpt_dt_fr, value);
	}


	/**
	 * Order promising result received date TO 納期回答受領日ＴＯ.<p>
	 *
	 */
	public MCDate prms_rcpt_dt_to() {
		return getConstDate(offset + 10, $prms_rcpt_dt_to);
	}

	/**
	 * Order promising result received date TO 納期回答受領日ＴＯ.<p>
	 *
	 */
	public void prms_rcpt_dt_to(MCDate value) {
		setConstDate(offset + 10, $prms_rcpt_dt_to, value);
	}


	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public String purc_sts_typ() {
		return getConstString(offset + 11, $purc_sts_typ);
	}

	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public void purc_sts_typ(String value) {
		setConstString(offset + 11, $purc_sts_typ, value);
	}


	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public String purc_sts_typ_nm() {
		return getConstString(offset + 12, $purc_sts_typ_nm);
	}

	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public void purc_sts_typ_nm(String value) {
		setConstString(offset + 12, $purc_sts_typ_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 13, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 13, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 14, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 14, $sppl_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 15, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 15, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 16, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 16, $itm_p, row);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 17, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 17, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 18, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 18, $po_d_no, value);
	}


	/**
	 * Order promising result received G No. 納期回答受領ＧＮＯ.<p>
	 *
	 */
	public String prms_rcpt_grp_no() {
		return getConstString(offset + 19, $prms_rcpt_grp_no);
	}

	/**
	 * Order promising result received G No. 納期回答受領ＧＮＯ.<p>
	 *
	 */
	public void prms_rcpt_grp_no(String value) {
		setConstString(offset + 19, $prms_rcpt_grp_no, value);
	}


	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public String prms_rcpt_no() {
		return getConstString(offset + 20, $prms_rcpt_no);
	}

	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public void prms_rcpt_no(String value) {
		setConstString(offset + 20, $prms_rcpt_no, value);
	}


	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public String prms_rcpt_d_no() {
		return getConstString(offset + 21, $prms_rcpt_d_no);
	}

	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public void prms_rcpt_d_no(String value) {
		setConstString(offset + 21, $prms_rcpt_d_no, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 22, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 22, $intr_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String dtl_intr_rmrks() {
		return getConstString(offset + 23, $dtl_intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void dtl_intr_rmrks(String value) {
		setConstString(offset + 23, $dtl_intr_rmrks, value);
	}


	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public String prms_rmrks() {
		return getConstString(offset + 24, $prms_rmrks);
	}

	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public void prms_rmrks(String value) {
		setConstString(offset + 24, $prms_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 25, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 25, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 26, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 26, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 27, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 27, $sub_char3, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String dtl_sub_char1() {
		return getConstString(offset + 28, $dtl_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void dtl_sub_char1(String value) {
		setConstString(offset + 28, $dtl_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String dtl_sub_char2() {
		return getConstString(offset + 29, $dtl_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void dtl_sub_char2(String value) {
		setConstString(offset + 29, $dtl_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String dtl_sub_char3() {
		return getConstString(offset + 30, $dtl_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void dtl_sub_char3(String value) {
		setConstString(offset + 30, $dtl_sub_char3, value);
	}


	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public boolean incl_can_flg() {
		return getConstBoolean(offset + 31, $incl_can_flg);
	}

	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public void incl_can_flg(boolean value) {
		setConstBoolean(offset + 31, $incl_can_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR bp_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 32, $bp_grp_p);
	}
	
	public void bp_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 32, $bp_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 33, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 33, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			return purc_sts_typ();
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			return purc_sts_typ_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			return prms_rcpt_grp_no();
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			return prms_rcpt_no();
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			return prms_rcpt_d_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			return dtl_intr_rmrks();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
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
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($po_dt_fr.equalsIgnoreCase(name)) {
			return po_dt_fr();
		}
		if ($po_dt_to.equalsIgnoreCase(name)) {
			return po_dt_to();
		}
		if ($dlv_inst_dt_fr.equalsIgnoreCase(name)) {
			return dlv_inst_dt_fr();
		}
		if ($dlv_inst_dt_to.equalsIgnoreCase(name)) {
			return dlv_inst_dt_to();
		}
		if ($prms_rcpt_dt_fr.equalsIgnoreCase(name)) {
			return prms_rcpt_dt_fr();
		}
		if ($prms_rcpt_dt_to.equalsIgnoreCase(name)) {
			return prms_rcpt_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			return not_edi_flg();
		}
		if ($incl_can_flg.equalsIgnoreCase(name)) {
			return incl_can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			return purc_sts_typ();
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			return purc_sts_typ_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			return prms_rcpt_grp_no();
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			return prms_rcpt_no();
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			return prms_rcpt_d_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			return dtl_intr_rmrks();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
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
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($po_dt_fr.equalsIgnoreCase(name)) {
			return po_dt_fr();
		}
		if ($po_dt_to.equalsIgnoreCase(name)) {
			return po_dt_to();
		}
		if ($dlv_inst_dt_fr.equalsIgnoreCase(name)) {
			return dlv_inst_dt_fr();
		}
		if ($dlv_inst_dt_to.equalsIgnoreCase(name)) {
			return dlv_inst_dt_to();
		}
		if ($prms_rcpt_dt_fr.equalsIgnoreCase(name)) {
			return prms_rcpt_dt_fr();
		}
		if ($prms_rcpt_dt_to.equalsIgnoreCase(name)) {
			return prms_rcpt_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			return not_edi_flg();
		}
		if ($incl_can_flg.equalsIgnoreCase(name)) {
			return incl_can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			purc_sts_typ(value);
			return;
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			purc_sts_typ_nm(value);
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
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			prms_rcpt_grp_no(value);
			return;
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			prms_rcpt_no(value);
			return;
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			prms_rcpt_d_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			dtl_intr_rmrks(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
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
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($po_dt_fr.equalsIgnoreCase(name)) {
			po_dt_fr(value);
			return;
		}
		if ($po_dt_to.equalsIgnoreCase(name)) {
			po_dt_to(value);
			return;
		}
		if ($dlv_inst_dt_fr.equalsIgnoreCase(name)) {
			dlv_inst_dt_fr(value);
			return;
		}
		if ($dlv_inst_dt_to.equalsIgnoreCase(name)) {
			dlv_inst_dt_to(value);
			return;
		}
		if ($prms_rcpt_dt_fr.equalsIgnoreCase(name)) {
			prms_rcpt_dt_fr(value);
			return;
		}
		if ($prms_rcpt_dt_to.equalsIgnoreCase(name)) {
			prms_rcpt_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			not_edi_flg(value);
			return;
		}
		if ($incl_can_flg.equalsIgnoreCase(name)) {
			incl_can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			purc_sts_typ(value);
			return;
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			purc_sts_typ_nm(value);
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
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			prms_rcpt_grp_no(value);
			return;
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			prms_rcpt_no(value);
			return;
		}
		if ($prms_rcpt_d_no.equalsIgnoreCase(name)) {
			prms_rcpt_d_no(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			dtl_intr_rmrks(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
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
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($po_dt_fr.equalsIgnoreCase(name)) {
			po_dt_fr(value);
			return;
		}
		if ($po_dt_to.equalsIgnoreCase(name)) {
			po_dt_to(value);
			return;
		}
		if ($dlv_inst_dt_fr.equalsIgnoreCase(name)) {
			dlv_inst_dt_fr(value);
			return;
		}
		if ($dlv_inst_dt_to.equalsIgnoreCase(name)) {
			dlv_inst_dt_to(value);
			return;
		}
		if ($prms_rcpt_dt_fr.equalsIgnoreCase(name)) {
			prms_rcpt_dt_fr(value);
			return;
		}
		if ($prms_rcpt_dt_to.equalsIgnoreCase(name)) {
			prms_rcpt_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			not_edi_flg(value);
			return;
		}
		if ($incl_can_flg.equalsIgnoreCase(name)) {
			incl_can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dlv_rqst_dt_frto_p.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_frto_p();
		}
		if ($arr_schd_dt_p.equalsIgnoreCase(name)) {
			return arr_schd_dt_p();
		}
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			return bp_grp_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dlv_rqst_dt_frto_p.equalsIgnoreCase(name)) {
			dlv_rqst_dt_frto_p(
				((MCContainerMeta) dlv_rqst_dt_frto_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($arr_schd_dt_p.equalsIgnoreCase(name)) {
			arr_schd_dt_p(
				((MCContainerMeta) arr_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
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
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			bp_grp_p(
				((MCContainerMeta) bp_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
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
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_rqst_dt_fr() {
		return dlv_rqst_dt_frto_p().ymd_fr();
	}

	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_rqst_dt_fr(MCDate value) {
		dlv_rqst_dt_frto_p().ymd_fr(value);
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_rqst_hm_fr() {
		return dlv_rqst_dt_frto_p().hm_fr();
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_rqst_hm_fr(MCDate value) {
		dlv_rqst_dt_frto_p().hm_fr(value);
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public MCDate dlv_rqst_dt_to() {
		return dlv_rqst_dt_frto_p().ymd_to();
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public void dlv_rqst_dt_to(MCDate value) {
		dlv_rqst_dt_frto_p().ymd_to(value);
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public MCDate dlv_rqst_hm_to() {
		return dlv_rqst_dt_frto_p().hm_to();
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public void dlv_rqst_hm_to(MCDate value) {
		dlv_rqst_dt_frto_p().hm_to(value);
	}

	/**
	 * Scheduled receipt date FROM 入荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_schd_dt_fr() {
		return arr_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled receipt date FROM 入荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public void arr_schd_dt_fr(MCDate value) {
		arr_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Receipt schedule time FROM 入荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_schd_hm_fr() {
		return arr_schd_dt_p().hm_fr();
	}

	/**
	 * Receipt schedule time FROM 入荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void arr_schd_hm_fr(MCDate value) {
		arr_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled receipt date TO 入荷予定日ＴＯ.<p>
	 *
	 */
	public MCDate arr_schd_dt_to() {
		return arr_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled receipt date TO 入荷予定日ＴＯ.<p>
	 *
	 */
	public void arr_schd_dt_to(MCDate value) {
		arr_schd_dt_p().ymd_to(value);
	}

	/**
	 * Receipt schedule time TO 入荷予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate arr_schd_hm_to() {
		return arr_schd_dt_p().hm_to();
	}

	/**
	 * Receipt schedule time TO 入荷予定時刻ＴＯ.<p>
	 *
	 */
	public void arr_schd_hm_to(MCDate value) {
		arr_schd_dt_p().hm_to(value);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return itm_typ_p().itm_typ_nm();
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		itm_typ_p().itm_typ_nm(value);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return itm_typ_p().itm_typ_d_cd();
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		itm_typ_p().itm_typ_d_cd(value);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return itm_typ_p().itm_typ_d_nm();
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		itm_typ_p().itm_typ_d_nm(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return itm_p().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return itm_p().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public boolean bp_grp_flg1() {
		return bp_grp_p().bp_grp_flg1();
	}

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public void bp_grp_flg1(boolean value) {
		bp_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return bp_grp_p().bp_grp_cd1();
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		bp_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return bp_grp_p().bp_grp_nm1();
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		bp_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public boolean bp_grp_flg2() {
		return bp_grp_p().bp_grp_flg2();
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public void bp_grp_flg2(boolean value) {
		bp_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return bp_grp_p().bp_grp_cd2();
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		bp_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return bp_grp_p().bp_grp_nm2();
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		bp_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public boolean bp_grp_flg3() {
		return bp_grp_p().bp_grp_flg3();
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public void bp_grp_flg3(boolean value) {
		bp_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return bp_grp_p().bp_grp_cd3();
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		bp_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return bp_grp_p().bp_grp_nm3();
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		bp_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public boolean bp_grp_flg4() {
		return bp_grp_p().bp_grp_flg4();
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public void bp_grp_flg4(boolean value) {
		bp_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return bp_grp_p().bp_grp_cd4();
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		bp_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return bp_grp_p().bp_grp_nm4();
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		bp_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public boolean bp_grp_flg5() {
		return bp_grp_p().bp_grp_flg5();
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public void bp_grp_flg5(boolean value) {
		bp_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return bp_grp_p().bp_grp_cd5();
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		bp_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return bp_grp_p().bp_grp_nm5();
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		bp_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public boolean bp_grp_flg6() {
		return bp_grp_p().bp_grp_flg6();
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public void bp_grp_flg6(boolean value) {
		bp_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return bp_grp_p().bp_grp_cd6();
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		bp_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return bp_grp_p().bp_grp_nm6();
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		bp_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public boolean bp_grp_flg7() {
		return bp_grp_p().bp_grp_flg7();
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public void bp_grp_flg7(boolean value) {
		bp_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return bp_grp_p().bp_grp_cd7();
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		bp_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return bp_grp_p().bp_grp_nm7();
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		bp_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public boolean bp_grp_flg8() {
		return bp_grp_p().bp_grp_flg8();
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public void bp_grp_flg8(boolean value) {
		bp_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return bp_grp_p().bp_grp_cd8();
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		bp_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return bp_grp_p().bp_grp_nm8();
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		bp_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public boolean bp_grp_flg9() {
		return bp_grp_p().bp_grp_flg9();
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public void bp_grp_flg9(boolean value) {
		bp_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return bp_grp_p().bp_grp_cd9();
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		bp_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return bp_grp_p().bp_grp_nm9();
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		bp_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public boolean bp_grp_flg10() {
		return bp_grp_p().bp_grp_flg10();
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public void bp_grp_flg10(boolean value) {
		bp_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return bp_grp_p().bp_grp_cd10();
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		bp_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return bp_grp_p().bp_grp_nm10();
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		bp_grp_p().bp_grp_nm10(value);
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

