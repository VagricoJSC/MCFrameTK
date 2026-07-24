package mcframe.clientMSBE.MSBEP1760;

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
	 * INS,Create;UPD,Modify;DEL,Cancel;REF,View INS,登録する;UPD,訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * New entry flg. (For SQL statement search) 新規登録ＦＬＧ（SQL文検索用）.<p>
	 *
	 */
	public static final String $is_crt = "is_crt";
	/**
	 * Correct/cancel flg. (For SQL statement search) 訂正・取消ＦＬＧ（SQL文検索用）.<p>
	 *
	 */
	public static final String $is_upd_del = "is_upd_del";
	/**
	 * Reference flg. (For SQL statement search) 参照ＦＬＧ（SQL文検索用）.<p>
	 *
	 */
	public static final String $is_ref = "is_ref";
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
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public static final String $dlv_id_typ = "dlv_id_typ";
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public static final String $dlv_id_typ_nm = "dlv_id_typ_nm";
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
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public static final String $ship_rqst_id_typ_nm = "ship_rqst_id_typ_nm";
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
	 * I/V No. Ｉ／ＶＮＯ.<p>
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
	public static final String $dlv_grp_p = "dlv_grp_p";
	public static final String $rqst_grp_p = "rqst_grp_p";

	public static final String $dlv_grp_lab1 = $dlv_grp_p + ".bp_grp_lab1";
	public static final String $dlv_grp_flg1 = $dlv_grp_p + ".bp_grp_flg1";
	public static final String $dlv_grp_cd1 = $dlv_grp_p + ".bp_grp_cd1";
	public static final String $dlv_grp_nm1 = $dlv_grp_p + ".bp_grp_nm1";
	public static final String $dlv_grp_lab2 = $dlv_grp_p + ".bp_grp_lab2";
	public static final String $dlv_grp_flg2 = $dlv_grp_p + ".bp_grp_flg2";
	public static final String $dlv_grp_cd2 = $dlv_grp_p + ".bp_grp_cd2";
	public static final String $dlv_grp_nm2 = $dlv_grp_p + ".bp_grp_nm2";
	public static final String $dlv_grp_lab3 = $dlv_grp_p + ".bp_grp_lab3";
	public static final String $dlv_grp_flg3 = $dlv_grp_p + ".bp_grp_flg3";
	public static final String $dlv_grp_cd3 = $dlv_grp_p + ".bp_grp_cd3";
	public static final String $dlv_grp_nm3 = $dlv_grp_p + ".bp_grp_nm3";
	public static final String $dlv_grp_lab4 = $dlv_grp_p + ".bp_grp_lab4";
	public static final String $dlv_grp_flg4 = $dlv_grp_p + ".bp_grp_flg4";
	public static final String $dlv_grp_cd4 = $dlv_grp_p + ".bp_grp_cd4";
	public static final String $dlv_grp_nm4 = $dlv_grp_p + ".bp_grp_nm4";
	public static final String $dlv_grp_lab5 = $dlv_grp_p + ".bp_grp_lab5";
	public static final String $dlv_grp_flg5 = $dlv_grp_p + ".bp_grp_flg5";
	public static final String $dlv_grp_cd5 = $dlv_grp_p + ".bp_grp_cd5";
	public static final String $dlv_grp_nm5 = $dlv_grp_p + ".bp_grp_nm5";
	public static final String $dlv_grp_lab6 = $dlv_grp_p + ".bp_grp_lab6";
	public static final String $dlv_grp_flg6 = $dlv_grp_p + ".bp_grp_flg6";
	public static final String $dlv_grp_cd6 = $dlv_grp_p + ".bp_grp_cd6";
	public static final String $dlv_grp_nm6 = $dlv_grp_p + ".bp_grp_nm6";
	public static final String $dlv_grp_lab7 = $dlv_grp_p + ".bp_grp_lab7";
	public static final String $dlv_grp_flg7 = $dlv_grp_p + ".bp_grp_flg7";
	public static final String $dlv_grp_cd7 = $dlv_grp_p + ".bp_grp_cd7";
	public static final String $dlv_grp_nm7 = $dlv_grp_p + ".bp_grp_nm7";
	public static final String $dlv_grp_lab8 = $dlv_grp_p + ".bp_grp_lab8";
	public static final String $dlv_grp_flg8 = $dlv_grp_p + ".bp_grp_flg8";
	public static final String $dlv_grp_cd8 = $dlv_grp_p + ".bp_grp_cd8";
	public static final String $dlv_grp_nm8 = $dlv_grp_p + ".bp_grp_nm8";
	public static final String $dlv_grp_lab9 = $dlv_grp_p + ".bp_grp_lab9";
	public static final String $dlv_grp_flg9 = $dlv_grp_p + ".bp_grp_flg9";
	public static final String $dlv_grp_cd9 = $dlv_grp_p + ".bp_grp_cd9";
	public static final String $dlv_grp_nm9 = $dlv_grp_p + ".bp_grp_nm9";
	public static final String $dlv_grp_lab10 = $dlv_grp_p + ".bp_grp_lab10";
	public static final String $dlv_grp_flg10 = $dlv_grp_p + ".bp_grp_flg10";
	public static final String $dlv_grp_cd10 = $dlv_grp_p + ".bp_grp_cd10";
	public static final String $dlv_grp_nm10 = $dlv_grp_p + ".bp_grp_nm10";
	public static final String $rqst_grp_lab1 = $rqst_grp_p + ".bp_grp_lab1";
	public static final String $rqst_grp_flg1 = $rqst_grp_p + ".bp_grp_flg1";
	public static final String $rqst_grp_cd1 = $rqst_grp_p + ".bp_grp_cd1";
	public static final String $rqst_grp_nm1 = $rqst_grp_p + ".bp_grp_nm1";
	public static final String $rqst_grp_lab2 = $rqst_grp_p + ".bp_grp_lab2";
	public static final String $rqst_grp_flg2 = $rqst_grp_p + ".bp_grp_flg2";
	public static final String $rqst_grp_cd2 = $rqst_grp_p + ".bp_grp_cd2";
	public static final String $rqst_grp_nm2 = $rqst_grp_p + ".bp_grp_nm2";
	public static final String $rqst_grp_lab3 = $rqst_grp_p + ".bp_grp_lab3";
	public static final String $rqst_grp_flg3 = $rqst_grp_p + ".bp_grp_flg3";
	public static final String $rqst_grp_cd3 = $rqst_grp_p + ".bp_grp_cd3";
	public static final String $rqst_grp_nm3 = $rqst_grp_p + ".bp_grp_nm3";
	public static final String $rqst_grp_lab4 = $rqst_grp_p + ".bp_grp_lab4";
	public static final String $rqst_grp_flg4 = $rqst_grp_p + ".bp_grp_flg4";
	public static final String $rqst_grp_cd4 = $rqst_grp_p + ".bp_grp_cd4";
	public static final String $rqst_grp_nm4 = $rqst_grp_p + ".bp_grp_nm4";
	public static final String $rqst_grp_lab5 = $rqst_grp_p + ".bp_grp_lab5";
	public static final String $rqst_grp_flg5 = $rqst_grp_p + ".bp_grp_flg5";
	public static final String $rqst_grp_cd5 = $rqst_grp_p + ".bp_grp_cd5";
	public static final String $rqst_grp_nm5 = $rqst_grp_p + ".bp_grp_nm5";
	public static final String $rqst_grp_lab6 = $rqst_grp_p + ".bp_grp_lab6";
	public static final String $rqst_grp_flg6 = $rqst_grp_p + ".bp_grp_flg6";
	public static final String $rqst_grp_cd6 = $rqst_grp_p + ".bp_grp_cd6";
	public static final String $rqst_grp_nm6 = $rqst_grp_p + ".bp_grp_nm6";
	public static final String $rqst_grp_lab7 = $rqst_grp_p + ".bp_grp_lab7";
	public static final String $rqst_grp_flg7 = $rqst_grp_p + ".bp_grp_flg7";
	public static final String $rqst_grp_cd7 = $rqst_grp_p + ".bp_grp_cd7";
	public static final String $rqst_grp_nm7 = $rqst_grp_p + ".bp_grp_nm7";
	public static final String $rqst_grp_lab8 = $rqst_grp_p + ".bp_grp_lab8";
	public static final String $rqst_grp_flg8 = $rqst_grp_p + ".bp_grp_flg8";
	public static final String $rqst_grp_cd8 = $rqst_grp_p + ".bp_grp_cd8";
	public static final String $rqst_grp_nm8 = $rqst_grp_p + ".bp_grp_nm8";
	public static final String $rqst_grp_lab9 = $rqst_grp_p + ".bp_grp_lab9";
	public static final String $rqst_grp_flg9 = $rqst_grp_p + ".bp_grp_flg9";
	public static final String $rqst_grp_cd9 = $rqst_grp_p + ".bp_grp_cd9";
	public static final String $rqst_grp_nm9 = $rqst_grp_p + ".bp_grp_nm9";
	public static final String $rqst_grp_lab10 = $rqst_grp_p + ".bp_grp_lab10";
	public static final String $rqst_grp_flg10 = $rqst_grp_p + ".bp_grp_flg10";
	public static final String $rqst_grp_cd10 = $rqst_grp_p + ".bp_grp_cd10";
	public static final String $rqst_grp_nm10 = $rqst_grp_p + ".bp_grp_nm10";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta is_crt_META = createCommonMeta($is_crt, mcframe.commonMA.meta.MA_META.FLG_STR);
	public static final MCMeta is_upd_del_META = createCommonMeta($is_upd_del, mcframe.commonMA.meta.MA_META.FLG_STR);
	public static final MCMeta is_ref_META = createCommonMeta($is_ref, mcframe.commonMA.meta.MA_META.FLG_STR);
	public static final MCMeta cmpl_schd_dt_fr_META = createCommonMeta($cmpl_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cmpl_schd_dt_to_META = createCommonMeta($cmpl_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_typ_nm_META = createCommonMeta($dlv_id_typ_nm, mcframe.commonMS.meta.MS_META.DLV_ID_TYP_NM);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta ship_rqst_id_typ_META = createCommonMeta($ship_rqst_id_typ, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP);
	public static final MCMeta ship_rqst_id_typ_nm_META = createCommonMeta($ship_rqst_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP_NM);
	public static final MCMeta ship_rqst_id_cd_META = createCommonMeta($ship_rqst_id_cd, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_CD);
	public static final MCMeta ship_rqst_id_nm_META = createCommonMeta($ship_rqst_id_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_NM);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta ship_rqst_no_META = createCommonMeta($ship_rqst_no, mcframe.commonMA.meta.MA_META.SHIP_RQST_NO);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR3);
	public static final MCMeta dlv_grp_p_META = createInnerRowMeta($dlv_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta rqst_grp_p_META = createInnerRowMeta($rqst_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			is_crt_META,
			is_upd_del_META,
			is_ref_META,
			cmpl_schd_dt_fr_META,
			cmpl_schd_dt_to_META,
			tdlv_cd_META,
			tdlv_nm_META,
			dlv_id_typ_META,
			dlv_id_typ_nm_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			ship_rqst_id_typ_META,
			ship_rqst_id_typ_nm_META,
			ship_rqst_id_cd_META,
			ship_rqst_id_nm_META,
			iv_no_META,
			slo_no_META,
			ship_rqst_no_META,
			cst_po_no_META,
			cst_po_d_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			dlv_grp_p_META,
			rqst_grp_p_META
		},
		new String[][]{
			{
				"dlv_grp_flg1",
				"dlv_grp_cd1",
				"dlv_grp_nm1",
				"dlv_grp_flg2",
				"dlv_grp_cd2",
				"dlv_grp_nm2",
				"dlv_grp_flg3",
				"dlv_grp_cd3",
				"dlv_grp_nm3",
				"dlv_grp_flg4",
				"dlv_grp_cd4",
				"dlv_grp_nm4",
				"dlv_grp_flg5",
				"dlv_grp_cd5",
				"dlv_grp_nm5",
				"dlv_grp_flg6",
				"dlv_grp_cd6",
				"dlv_grp_nm6",
				"dlv_grp_flg7",
				"dlv_grp_cd7",
				"dlv_grp_nm7",
				"dlv_grp_flg8",
				"dlv_grp_cd8",
				"dlv_grp_nm8",
				"dlv_grp_flg9",
				"dlv_grp_cd9",
				"dlv_grp_nm9",
				"dlv_grp_flg10",
				"dlv_grp_cd10",
				"dlv_grp_nm10",
				"rqst_grp_flg1",
				"rqst_grp_cd1",
				"rqst_grp_nm1",
				"rqst_grp_flg2",
				"rqst_grp_cd2",
				"rqst_grp_nm2",
				"rqst_grp_flg3",
				"rqst_grp_cd3",
				"rqst_grp_nm3",
				"rqst_grp_flg4",
				"rqst_grp_cd4",
				"rqst_grp_nm4",
				"rqst_grp_flg5",
				"rqst_grp_cd5",
				"rqst_grp_nm5",
				"rqst_grp_flg6",
				"rqst_grp_cd6",
				"rqst_grp_nm6",
				"rqst_grp_flg7",
				"rqst_grp_cd7",
				"rqst_grp_nm7",
				"rqst_grp_flg8",
				"rqst_grp_cd8",
				"rqst_grp_nm8",
				"rqst_grp_flg9",
				"rqst_grp_cd9",
				"rqst_grp_nm9",
				"rqst_grp_flg10",
				"rqst_grp_cd10",
				"rqst_grp_nm10"
			},
			{
				$dlv_grp_flg1,
				$dlv_grp_cd1,
				$dlv_grp_nm1,
				$dlv_grp_flg2,
				$dlv_grp_cd2,
				$dlv_grp_nm2,
				$dlv_grp_flg3,
				$dlv_grp_cd3,
				$dlv_grp_nm3,
				$dlv_grp_flg4,
				$dlv_grp_cd4,
				$dlv_grp_nm4,
				$dlv_grp_flg5,
				$dlv_grp_cd5,
				$dlv_grp_nm5,
				$dlv_grp_flg6,
				$dlv_grp_cd6,
				$dlv_grp_nm6,
				$dlv_grp_flg7,
				$dlv_grp_cd7,
				$dlv_grp_nm7,
				$dlv_grp_flg8,
				$dlv_grp_cd8,
				$dlv_grp_nm8,
				$dlv_grp_flg9,
				$dlv_grp_cd9,
				$dlv_grp_nm9,
				$dlv_grp_flg10,
				$dlv_grp_cd10,
				$dlv_grp_nm10,
				$rqst_grp_flg1,
				$rqst_grp_cd1,
				$rqst_grp_nm1,
				$rqst_grp_flg2,
				$rqst_grp_cd2,
				$rqst_grp_nm2,
				$rqst_grp_flg3,
				$rqst_grp_cd3,
				$rqst_grp_nm3,
				$rqst_grp_flg4,
				$rqst_grp_cd4,
				$rqst_grp_nm4,
				$rqst_grp_flg5,
				$rqst_grp_cd5,
				$rqst_grp_nm5,
				$rqst_grp_flg6,
				$rqst_grp_cd6,
				$rqst_grp_nm6,
				$rqst_grp_flg7,
				$rqst_grp_cd7,
				$rqst_grp_nm7,
				$rqst_grp_flg8,
				$rqst_grp_cd8,
				$rqst_grp_nm8,
				$rqst_grp_flg9,
				$rqst_grp_cd9,
				$rqst_grp_nm9,
				$rqst_grp_flg10,
				$rqst_grp_cd10,
				$rqst_grp_nm10
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$tdlv_cd, "bp_nm"}	// tdlv_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$tdlv_cd, "MAC_BP_IS_SRCH_TYP.TDLV"},	// tdlv_cd
				{$dlv_id_cd, "dlv_id_typ"},	// dlv_id_cd
				{$ship_rqst_id_cd, "ship_rqst_id_typ"}	// ship_rqst_id_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$tdlv_cd, "bp_is_srch_typ"},	// tdlv_cd
				{$dlv_id_cd, "dlv_id_typ"},	// dlv_id_cd
				{$ship_rqst_id_cd, "ship_rqst_id_typ"}	// ship_rqst_id_cd
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
	 * INS,Create;UPD,Modify;DEL,Cancel;REF,View INS,登録する;UPD,訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * INS,Create;UPD,Modify;DEL,Cancel;REF,View INS,登録する;UPD,訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * New entry flg. (For SQL statement search) 新規登録ＦＬＧ（SQL文検索用）.<p>
	 *
	 */
	public String is_crt() {
		return getConstString(offset + 1, $is_crt);
	}

	/**
	 * New entry flg. (For SQL statement search) 新規登録ＦＬＧ（SQL文検索用）.<p>
	 *
	 */
	public void is_crt(String value) {
		setConstString(offset + 1, $is_crt, value);
	}


	/**
	 * Correct/cancel flg. (For SQL statement search) 訂正・取消ＦＬＧ（SQL文検索用）.<p>
	 *
	 */
	public String is_upd_del() {
		return getConstString(offset + 2, $is_upd_del);
	}

	/**
	 * Correct/cancel flg. (For SQL statement search) 訂正・取消ＦＬＧ（SQL文検索用）.<p>
	 *
	 */
	public void is_upd_del(String value) {
		setConstString(offset + 2, $is_upd_del, value);
	}


	/**
	 * Reference flg. (For SQL statement search) 参照ＦＬＧ（SQL文検索用）.<p>
	 *
	 */
	public String is_ref() {
		return getConstString(offset + 3, $is_ref);
	}

	/**
	 * Reference flg. (For SQL statement search) 参照ＦＬＧ（SQL文検索用）.<p>
	 *
	 */
	public void is_ref(String value) {
		setConstString(offset + 3, $is_ref, value);
	}


	/**
	 * Completion (Scheduled) date FROM 完了（予定）日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate cmpl_schd_dt_fr() {
		return getConstDate(offset + 4, $cmpl_schd_dt_fr);
	}

	/**
	 * Completion (Scheduled) date FROM 完了（予定）日ＦＲＯＭ.<p>
	 *
	 */
	public void cmpl_schd_dt_fr(MCDate value) {
		setConstDate(offset + 4, $cmpl_schd_dt_fr, value);
	}


	/**
	 * Completion (Scheduled) date TO 完了（予定）日ＴＯ.<p>
	 *
	 */
	public MCDate cmpl_schd_dt_to() {
		return getConstDate(offset + 5, $cmpl_schd_dt_to);
	}

	/**
	 * Completion (Scheduled) date TO 完了（予定）日ＴＯ.<p>
	 *
	 */
	public void cmpl_schd_dt_to(MCDate value) {
		setConstDate(offset + 5, $cmpl_schd_dt_to, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 6, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 6, $tdlv_cd, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 7, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 7, $tdlv_nm, value);
	}


	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 8, $dlv_id_typ);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 8, $dlv_id_typ, value);
	}


	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public String dlv_id_typ_nm() {
		return getConstString(offset + 9, $dlv_id_typ_nm);
	}

	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public void dlv_id_typ_nm(String value) {
		setConstString(offset + 9, $dlv_id_typ_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 10, $dlv_id_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 10, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 11, $dlv_id_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 11, $dlv_id_nm, value);
	}


	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public String ship_rqst_id_typ() {
		return getConstString(offset + 12, $ship_rqst_id_typ);
	}

	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public void ship_rqst_id_typ(String value) {
		setConstString(offset + 12, $ship_rqst_id_typ, value);
	}


	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public String ship_rqst_id_typ_nm() {
		return getConstString(offset + 13, $ship_rqst_id_typ_nm);
	}

	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public void ship_rqst_id_typ_nm(String value) {
		setConstString(offset + 13, $ship_rqst_id_typ_nm, value);
	}


	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return getConstString(offset + 14, $ship_rqst_id_cd);
	}

	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		setConstString(offset + 14, $ship_rqst_id_cd, value);
	}


	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public String ship_rqst_id_nm() {
		return getConstString(offset + 15, $ship_rqst_id_nm);
	}

	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public void ship_rqst_id_nm(String value) {
		setConstString(offset + 15, $ship_rqst_id_nm, value);
	}


	/**
	 * I/V No. Ｉ／ＶＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 16, $iv_no);
	}

	/**
	 * I/V No. Ｉ／ＶＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 16, $iv_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 17, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 17, $slo_no, value);
	}


	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public String ship_rqst_no() {
		return getConstString(offset + 18, $ship_rqst_no);
	}

	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public void ship_rqst_no(String value) {
		setConstString(offset + 18, $ship_rqst_no, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 19, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 19, $cst_po_no, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 20, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 20, $cst_po_d_no, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 21, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 21, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 22, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 22, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 23, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 23, $sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR dlv_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 24, $dlv_grp_p);
	}
	
	public void dlv_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 24, $dlv_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR rqst_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 25, $rqst_grp_p);
	}
	
	public void rqst_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 25, $rqst_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
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
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			return dlv_id_typ_nm();
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
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ_nm();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
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
	public MCDate getDate(String name) {
		if ($cmpl_schd_dt_fr.equalsIgnoreCase(name)) {
			return cmpl_schd_dt_fr();
		}
		if ($cmpl_schd_dt_to.equalsIgnoreCase(name)) {
			return cmpl_schd_dt_to();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
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
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			return dlv_id_typ_nm();
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
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ_nm();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
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
	public MCDate getDateNE(String name) {
		if ($cmpl_schd_dt_fr.equalsIgnoreCase(name)) {
			return cmpl_schd_dt_fr();
		}
		if ($cmpl_schd_dt_to.equalsIgnoreCase(name)) {
			return cmpl_schd_dt_to();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
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
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			dlv_id_typ_nm(value);
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
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_typ_nm(value);
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

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
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
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			dlv_id_typ_nm(value);
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
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_typ_nm(value);
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

	public MCRow getInnerRow(String name) {
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			return dlv_grp_p();
		}
		if ($rqst_grp_p.equalsIgnoreCase(name)) {
			return rqst_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			dlv_grp_p(
				((MCContainerMeta) dlv_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($rqst_grp_p.equalsIgnoreCase(name)) {
			rqst_grp_p(
				((MCContainerMeta) rqst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Delivery destination classification flg. 1 納品先分類ＦＬＧ１.<p>
	 *
	 */
	public boolean dlv_grp_flg1() {
		return dlv_grp_p().bp_grp_flg1();
	}

	/**
	 * Delivery destination classification flg. 1 納品先分類ＦＬＧ１.<p>
	 *
	 */
	public void dlv_grp_flg1(boolean value) {
		dlv_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public String dlv_grp_cd1() {
		return dlv_grp_p().bp_grp_cd1();
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public void dlv_grp_cd1(String value) {
		dlv_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public String dlv_grp_nm1() {
		return dlv_grp_p().bp_grp_nm1();
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public void dlv_grp_nm1(String value) {
		dlv_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Delivery destination classification flg. 2 納品先分類ＦＬＧ２.<p>
	 *
	 */
	public boolean dlv_grp_flg2() {
		return dlv_grp_p().bp_grp_flg2();
	}

	/**
	 * Delivery destination classification flg. 2 納品先分類ＦＬＧ２.<p>
	 *
	 */
	public void dlv_grp_flg2(boolean value) {
		dlv_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public String dlv_grp_cd2() {
		return dlv_grp_p().bp_grp_cd2();
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public void dlv_grp_cd2(String value) {
		dlv_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public String dlv_grp_nm2() {
		return dlv_grp_p().bp_grp_nm2();
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public void dlv_grp_nm2(String value) {
		dlv_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Delivery destination classification flg. 3 納品先分類ＦＬＧ３.<p>
	 *
	 */
	public boolean dlv_grp_flg3() {
		return dlv_grp_p().bp_grp_flg3();
	}

	/**
	 * Delivery destination classification flg. 3 納品先分類ＦＬＧ３.<p>
	 *
	 */
	public void dlv_grp_flg3(boolean value) {
		dlv_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public String dlv_grp_cd3() {
		return dlv_grp_p().bp_grp_cd3();
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public void dlv_grp_cd3(String value) {
		dlv_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public String dlv_grp_nm3() {
		return dlv_grp_p().bp_grp_nm3();
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public void dlv_grp_nm3(String value) {
		dlv_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Delivery destination classification flg. 4 納品先分類ＦＬＧ４.<p>
	 *
	 */
	public boolean dlv_grp_flg4() {
		return dlv_grp_p().bp_grp_flg4();
	}

	/**
	 * Delivery destination classification flg. 4 納品先分類ＦＬＧ４.<p>
	 *
	 */
	public void dlv_grp_flg4(boolean value) {
		dlv_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public String dlv_grp_cd4() {
		return dlv_grp_p().bp_grp_cd4();
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public void dlv_grp_cd4(String value) {
		dlv_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public String dlv_grp_nm4() {
		return dlv_grp_p().bp_grp_nm4();
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public void dlv_grp_nm4(String value) {
		dlv_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Delivery destination classification flg. 5 納品先分類ＦＬＧ５.<p>
	 *
	 */
	public boolean dlv_grp_flg5() {
		return dlv_grp_p().bp_grp_flg5();
	}

	/**
	 * Delivery destination classification flg. 5 納品先分類ＦＬＧ５.<p>
	 *
	 */
	public void dlv_grp_flg5(boolean value) {
		dlv_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public String dlv_grp_cd5() {
		return dlv_grp_p().bp_grp_cd5();
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public void dlv_grp_cd5(String value) {
		dlv_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public String dlv_grp_nm5() {
		return dlv_grp_p().bp_grp_nm5();
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public void dlv_grp_nm5(String value) {
		dlv_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Delivery destination classification flg. 6 納品先分類ＦＬＧ６.<p>
	 *
	 */
	public boolean dlv_grp_flg6() {
		return dlv_grp_p().bp_grp_flg6();
	}

	/**
	 * Delivery destination classification flg. 6 納品先分類ＦＬＧ６.<p>
	 *
	 */
	public void dlv_grp_flg6(boolean value) {
		dlv_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public String dlv_grp_cd6() {
		return dlv_grp_p().bp_grp_cd6();
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public void dlv_grp_cd6(String value) {
		dlv_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public String dlv_grp_nm6() {
		return dlv_grp_p().bp_grp_nm6();
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public void dlv_grp_nm6(String value) {
		dlv_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Delivery destination classification flg. 7 納品先分類ＦＬＧ７.<p>
	 *
	 */
	public boolean dlv_grp_flg7() {
		return dlv_grp_p().bp_grp_flg7();
	}

	/**
	 * Delivery destination classification flg. 7 納品先分類ＦＬＧ７.<p>
	 *
	 */
	public void dlv_grp_flg7(boolean value) {
		dlv_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public String dlv_grp_cd7() {
		return dlv_grp_p().bp_grp_cd7();
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public void dlv_grp_cd7(String value) {
		dlv_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public String dlv_grp_nm7() {
		return dlv_grp_p().bp_grp_nm7();
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public void dlv_grp_nm7(String value) {
		dlv_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Delivery destination classification flg. 8 納品先分類ＦＬＧ８.<p>
	 *
	 */
	public boolean dlv_grp_flg8() {
		return dlv_grp_p().bp_grp_flg8();
	}

	/**
	 * Delivery destination classification flg. 8 納品先分類ＦＬＧ８.<p>
	 *
	 */
	public void dlv_grp_flg8(boolean value) {
		dlv_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public String dlv_grp_cd8() {
		return dlv_grp_p().bp_grp_cd8();
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public void dlv_grp_cd8(String value) {
		dlv_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public String dlv_grp_nm8() {
		return dlv_grp_p().bp_grp_nm8();
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public void dlv_grp_nm8(String value) {
		dlv_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Delivery destination classification flg. 9 納品先分類ＦＬＧ９.<p>
	 *
	 */
	public boolean dlv_grp_flg9() {
		return dlv_grp_p().bp_grp_flg9();
	}

	/**
	 * Delivery destination classification flg. 9 納品先分類ＦＬＧ９.<p>
	 *
	 */
	public void dlv_grp_flg9(boolean value) {
		dlv_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public String dlv_grp_cd9() {
		return dlv_grp_p().bp_grp_cd9();
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public void dlv_grp_cd9(String value) {
		dlv_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public String dlv_grp_nm9() {
		return dlv_grp_p().bp_grp_nm9();
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public void dlv_grp_nm9(String value) {
		dlv_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Delivery destination classification flg. 10 納品先分類ＦＬＧ１０.<p>
	 *
	 */
	public boolean dlv_grp_flg10() {
		return dlv_grp_p().bp_grp_flg10();
	}

	/**
	 * Delivery destination classification flg. 10 納品先分類ＦＬＧ１０.<p>
	 *
	 */
	public void dlv_grp_flg10(boolean value) {
		dlv_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public String dlv_grp_cd10() {
		return dlv_grp_p().bp_grp_cd10();
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public void dlv_grp_cd10(String value) {
		dlv_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public String dlv_grp_nm10() {
		return dlv_grp_p().bp_grp_nm10();
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public void dlv_grp_nm10(String value) {
		dlv_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Shipping requested classification flg.1 出荷依頼先分類ＦＬＧ１.<p>
	 *
	 */
	public boolean rqst_grp_flg1() {
		return rqst_grp_p().bp_grp_flg1();
	}

	/**
	 * Shipping requested classification flg.1 出荷依頼先分類ＦＬＧ１.<p>
	 *
	 */
	public void rqst_grp_flg1(boolean value) {
		rqst_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Shipping requested classification cd.1 出荷依頼先分類ＣＤ１.<p>
	 *
	 */
	public String rqst_grp_cd1() {
		return rqst_grp_p().bp_grp_cd1();
	}

	/**
	 * Shipping requested classification cd.1 出荷依頼先分類ＣＤ１.<p>
	 *
	 */
	public void rqst_grp_cd1(String value) {
		rqst_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Shipping requested classification name 1 出荷依頼先分類名１.<p>
	 *
	 */
	public String rqst_grp_nm1() {
		return rqst_grp_p().bp_grp_nm1();
	}

	/**
	 * Shipping requested classification name 1 出荷依頼先分類名１.<p>
	 *
	 */
	public void rqst_grp_nm1(String value) {
		rqst_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Shipping requested classification flg.2 出荷依頼先分類ＦＬＧ２.<p>
	 *
	 */
	public boolean rqst_grp_flg2() {
		return rqst_grp_p().bp_grp_flg2();
	}

	/**
	 * Shipping requested classification flg.2 出荷依頼先分類ＦＬＧ２.<p>
	 *
	 */
	public void rqst_grp_flg2(boolean value) {
		rqst_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Shipping requested classification cd.2 出荷依頼先分類ＣＤ２.<p>
	 *
	 */
	public String rqst_grp_cd2() {
		return rqst_grp_p().bp_grp_cd2();
	}

	/**
	 * Shipping requested classification cd.2 出荷依頼先分類ＣＤ２.<p>
	 *
	 */
	public void rqst_grp_cd2(String value) {
		rqst_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Shipping requested classification name 2 出荷依頼先分類名２.<p>
	 *
	 */
	public String rqst_grp_nm2() {
		return rqst_grp_p().bp_grp_nm2();
	}

	/**
	 * Shipping requested classification name 2 出荷依頼先分類名２.<p>
	 *
	 */
	public void rqst_grp_nm2(String value) {
		rqst_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Shipping requested classification flg.3 出荷依頼先分類ＦＬＧ３.<p>
	 *
	 */
	public boolean rqst_grp_flg3() {
		return rqst_grp_p().bp_grp_flg3();
	}

	/**
	 * Shipping requested classification flg.3 出荷依頼先分類ＦＬＧ３.<p>
	 *
	 */
	public void rqst_grp_flg3(boolean value) {
		rqst_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Shipping requested classification cd.3 出荷依頼先分類ＣＤ３.<p>
	 *
	 */
	public String rqst_grp_cd3() {
		return rqst_grp_p().bp_grp_cd3();
	}

	/**
	 * Shipping requested classification cd.3 出荷依頼先分類ＣＤ３.<p>
	 *
	 */
	public void rqst_grp_cd3(String value) {
		rqst_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Shipping requested classification name 3 出荷依頼先分類名３.<p>
	 *
	 */
	public String rqst_grp_nm3() {
		return rqst_grp_p().bp_grp_nm3();
	}

	/**
	 * Shipping requested classification name 3 出荷依頼先分類名３.<p>
	 *
	 */
	public void rqst_grp_nm3(String value) {
		rqst_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Shipping requested classification flg.4 出荷依頼先分類ＦＬＧ４.<p>
	 *
	 */
	public boolean rqst_grp_flg4() {
		return rqst_grp_p().bp_grp_flg4();
	}

	/**
	 * Shipping requested classification flg.4 出荷依頼先分類ＦＬＧ４.<p>
	 *
	 */
	public void rqst_grp_flg4(boolean value) {
		rqst_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Shipping requested classification cd.4 出荷依頼先分類ＣＤ４.<p>
	 *
	 */
	public String rqst_grp_cd4() {
		return rqst_grp_p().bp_grp_cd4();
	}

	/**
	 * Shipping requested classification cd.4 出荷依頼先分類ＣＤ４.<p>
	 *
	 */
	public void rqst_grp_cd4(String value) {
		rqst_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Shipping requested classification name 4 出荷依頼先分類名４.<p>
	 *
	 */
	public String rqst_grp_nm4() {
		return rqst_grp_p().bp_grp_nm4();
	}

	/**
	 * Shipping requested classification name 4 出荷依頼先分類名４.<p>
	 *
	 */
	public void rqst_grp_nm4(String value) {
		rqst_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Shipping requested classification flg.5 出荷依頼先分類ＦＬＧ５.<p>
	 *
	 */
	public boolean rqst_grp_flg5() {
		return rqst_grp_p().bp_grp_flg5();
	}

	/**
	 * Shipping requested classification flg.5 出荷依頼先分類ＦＬＧ５.<p>
	 *
	 */
	public void rqst_grp_flg5(boolean value) {
		rqst_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Shipping requested classification cd.5 出荷依頼先分類ＣＤ５.<p>
	 *
	 */
	public String rqst_grp_cd5() {
		return rqst_grp_p().bp_grp_cd5();
	}

	/**
	 * Shipping requested classification cd.5 出荷依頼先分類ＣＤ５.<p>
	 *
	 */
	public void rqst_grp_cd5(String value) {
		rqst_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Shipping requested classification name 5 出荷依頼先分類名５.<p>
	 *
	 */
	public String rqst_grp_nm5() {
		return rqst_grp_p().bp_grp_nm5();
	}

	/**
	 * Shipping requested classification name 5 出荷依頼先分類名５.<p>
	 *
	 */
	public void rqst_grp_nm5(String value) {
		rqst_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Shipping requested classification flg.6 出荷依頼先分類ＦＬＧ６.<p>
	 *
	 */
	public boolean rqst_grp_flg6() {
		return rqst_grp_p().bp_grp_flg6();
	}

	/**
	 * Shipping requested classification flg.6 出荷依頼先分類ＦＬＧ６.<p>
	 *
	 */
	public void rqst_grp_flg6(boolean value) {
		rqst_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Shipping requested classification cd.6 出荷依頼先分類ＣＤ６.<p>
	 *
	 */
	public String rqst_grp_cd6() {
		return rqst_grp_p().bp_grp_cd6();
	}

	/**
	 * Shipping requested classification cd.6 出荷依頼先分類ＣＤ６.<p>
	 *
	 */
	public void rqst_grp_cd6(String value) {
		rqst_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Shipping requested classification name 6 出荷依頼先分類名６.<p>
	 *
	 */
	public String rqst_grp_nm6() {
		return rqst_grp_p().bp_grp_nm6();
	}

	/**
	 * Shipping requested classification name 6 出荷依頼先分類名６.<p>
	 *
	 */
	public void rqst_grp_nm6(String value) {
		rqst_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Shipping requested classification flg.7 出荷依頼先分類ＦＬＧ７.<p>
	 *
	 */
	public boolean rqst_grp_flg7() {
		return rqst_grp_p().bp_grp_flg7();
	}

	/**
	 * Shipping requested classification flg.7 出荷依頼先分類ＦＬＧ７.<p>
	 *
	 */
	public void rqst_grp_flg7(boolean value) {
		rqst_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Shipping requested classification cd.7 出荷依頼先分類ＣＤ７.<p>
	 *
	 */
	public String rqst_grp_cd7() {
		return rqst_grp_p().bp_grp_cd7();
	}

	/**
	 * Shipping requested classification cd.7 出荷依頼先分類ＣＤ７.<p>
	 *
	 */
	public void rqst_grp_cd7(String value) {
		rqst_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Shipping requested classification name 7 出荷依頼先分類名７.<p>
	 *
	 */
	public String rqst_grp_nm7() {
		return rqst_grp_p().bp_grp_nm7();
	}

	/**
	 * Shipping requested classification name 7 出荷依頼先分類名７.<p>
	 *
	 */
	public void rqst_grp_nm7(String value) {
		rqst_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Shipping requested classification flg.8 出荷依頼先分類ＦＬＧ８.<p>
	 *
	 */
	public boolean rqst_grp_flg8() {
		return rqst_grp_p().bp_grp_flg8();
	}

	/**
	 * Shipping requested classification flg.8 出荷依頼先分類ＦＬＧ８.<p>
	 *
	 */
	public void rqst_grp_flg8(boolean value) {
		rqst_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Shipping requested classification cd.8 出荷依頼先分類ＣＤ８.<p>
	 *
	 */
	public String rqst_grp_cd8() {
		return rqst_grp_p().bp_grp_cd8();
	}

	/**
	 * Shipping requested classification cd.8 出荷依頼先分類ＣＤ８.<p>
	 *
	 */
	public void rqst_grp_cd8(String value) {
		rqst_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Shipping requested classification name 8 出荷依頼先分類名８.<p>
	 *
	 */
	public String rqst_grp_nm8() {
		return rqst_grp_p().bp_grp_nm8();
	}

	/**
	 * Shipping requested classification name 8 出荷依頼先分類名８.<p>
	 *
	 */
	public void rqst_grp_nm8(String value) {
		rqst_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Shipping requested classification flg.9 出荷依頼先分類ＦＬＧ９.<p>
	 *
	 */
	public boolean rqst_grp_flg9() {
		return rqst_grp_p().bp_grp_flg9();
	}

	/**
	 * Shipping requested classification flg.9 出荷依頼先分類ＦＬＧ９.<p>
	 *
	 */
	public void rqst_grp_flg9(boolean value) {
		rqst_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Shipping requested classification cd.9 出荷依頼先分類ＣＤ９.<p>
	 *
	 */
	public String rqst_grp_cd9() {
		return rqst_grp_p().bp_grp_cd9();
	}

	/**
	 * Shipping requested classification cd.9 出荷依頼先分類ＣＤ９.<p>
	 *
	 */
	public void rqst_grp_cd9(String value) {
		rqst_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Shipping requested classification name 9 出荷依頼先分類名９.<p>
	 *
	 */
	public String rqst_grp_nm9() {
		return rqst_grp_p().bp_grp_nm9();
	}

	/**
	 * Shipping requested classification name 9 出荷依頼先分類名９.<p>
	 *
	 */
	public void rqst_grp_nm9(String value) {
		rqst_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Shipping requested classification flg.10 出荷依頼先分類ＦＬＧ１０.<p>
	 *
	 */
	public boolean rqst_grp_flg10() {
		return rqst_grp_p().bp_grp_flg10();
	}

	/**
	 * Shipping requested classification flg.10 出荷依頼先分類ＦＬＧ１０.<p>
	 *
	 */
	public void rqst_grp_flg10(boolean value) {
		rqst_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Shipping requested classification cd.10 出荷依頼先分類ＣＤ１０.<p>
	 *
	 */
	public String rqst_grp_cd10() {
		return rqst_grp_p().bp_grp_cd10();
	}

	/**
	 * Shipping requested classification cd.10 出荷依頼先分類ＣＤ１０.<p>
	 *
	 */
	public void rqst_grp_cd10(String value) {
		rqst_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Shipping requested classification name 10 出荷依頼先分類名１０.<p>
	 *
	 */
	public String rqst_grp_nm10() {
		return rqst_grp_p().bp_grp_nm10();
	}

	/**
	 * Shipping requested classification name 10 出荷依頼先分類名１０.<p>
	 *
	 */
	public void rqst_grp_nm10(String value) {
		rqst_grp_p().bp_grp_nm10(value);
	}

}

