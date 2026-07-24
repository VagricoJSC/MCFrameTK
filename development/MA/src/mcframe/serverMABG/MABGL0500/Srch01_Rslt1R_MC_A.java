package mcframe.serverMABG.MABGL0500;

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
 * ブロック"Srch01_Rslt1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt1R_MC_A extends MCConstRow {

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public static final String $pre_alc_ptn_cd = "pre_alc_ptn_cd";
	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public static final String $pre_alc_ptn_nm_lcl = "pre_alc_ptn_nm_lcl";
	/**
	 * Standard Departmental alloc. pattern name 標準一次配賦パタン名.<p>
	 *
	 */
	public static final String $pre_alc_ptn_nm = "pre_alc_ptn_nm";
	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public static final String $dpt_alc_typ = "dpt_alc_typ";
	/**
	 * Dept. allocation type name 部門配賦区分名.<p>
	 *
	 */
	public static final String $dpt_alc_typ_nm = "dpt_alc_typ_nm";
	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public static final String $loc_alc_typ = "loc_alc_typ";
	/**
	 * Location allocation type name 場所配賦区分名.<p>
	 *
	 */
	public static final String $loc_alc_typ_nm = "loc_alc_typ_nm";
	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public static final String $oper_alc_typ = "oper_alc_typ";
	/**
	 * Operation allocation type name 工程配賦区分名.<p>
	 *
	 */
	public static final String $oper_alc_typ_nm = "oper_alc_typ_nm";
	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public static final String $bp_alc_typ = "bp_alc_typ";
	/**
	 * BP allocation type name 取引先配賦区分名.<p>
	 *
	 */
	public static final String $bp_alc_typ_nm = "bp_alc_typ_nm";
	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public static final String $ctg_alc_typ = "ctg_alc_typ";
	/**
	 * Item category allocation type name 品群配賦区分名.<p>
	 *
	 */
	public static final String $ctg_alc_typ_nm = "ctg_alc_typ_nm";
	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public static final String $itm_alc_typ = "itm_alc_typ";
	/**
	 * Item allocation type name 品目配賦区分名.<p>
	 *
	 */
	public static final String $itm_alc_typ_nm = "itm_alc_typ_nm";
	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public static final String $lot_alc_typ = "lot_alc_typ";
	/**
	 * Lot No. allocation type name ロットＮＯ配賦区分名.<p>
	 *
	 */
	public static final String $lot_alc_typ_nm = "lot_alc_typ_nm";
	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public static final String $sublot_alc_typ = "sublot_alc_typ";
	/**
	 * Sublot No. allocation type name サブロットＮＯ配賦区分名.<p>
	 *
	 */
	public static final String $sublot_alc_typ_nm = "sublot_alc_typ_nm";
	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public static final String $sno1_alc_typ = "sno1_alc_typ";
	/**
	 * SEIBAN No. 1 allocation type name 手配ＮＯ１配賦区分名.<p>
	 *
	 */
	public static final String $sno1_alc_typ_nm = "sno1_alc_typ_nm";
	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public static final String $sno2_alc_typ = "sno2_alc_typ";
	/**
	 * SEIBAN No. 2 allocation type name 手配ＮＯ２配賦区分名.<p>
	 *
	 */
	public static final String $sno2_alc_typ_nm = "sno2_alc_typ_nm";
	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public static final String $sno3_alc_typ = "sno3_alc_typ";
	/**
	 * SEIBAN No. 3 allocation type name 手配ＮＯ３配賦区分名.<p>
	 *
	 */
	public static final String $sno3_alc_typ_nm = "sno3_alc_typ_nm";
	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public static final String $sno4_alc_typ = "sno4_alc_typ";
	/**
	 * SEIBAN No. 4 allocation type name 手配ＮＯ４配賦区分名.<p>
	 *
	 */
	public static final String $sno4_alc_typ_nm = "sno4_alc_typ_nm";
	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public static final String $inst_alc_typ = "inst_alc_typ";
	/**
	 * Order allocation type name 指図配賦区分名.<p>
	 *
	 */
	public static final String $inst_alc_typ_nm = "inst_alc_typ_nm";
	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public static final String $iv_alc_typ = "iv_alc_typ";
	/**
	 * Invoice allocation type name インボイス配賦区分名.<p>
	 *
	 */
	public static final String $iv_alc_typ_nm = "iv_alc_typ_nm";
	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public static final String $po_alc_typ = "po_alc_typ";
	/**
	 * PO allocation type name 発注配賦区分名.<p>
	 *
	 */
	public static final String $po_alc_typ_nm = "po_alc_typ_nm";
	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public static final String $slo_alc_typ = "slo_alc_typ";
	/**
	 * Sales order allocation type name 受注配賦区分名.<p>
	 *
	 */
	public static final String $slo_alc_typ_nm = "slo_alc_typ_nm";
	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public static final String $alc_ac_alc_typ = "alc_ac_alc_typ";
	/**
	 * Allocation account allocation type name 配賦科目配賦区分名.<p>
	 *
	 */
	public static final String $alc_ac_alc_typ_nm = "alc_ac_alc_typ_nm";
	/**
	 * WG allocation type ワーキンググループ配賦区分.<p>
	 *
	 */
	public static final String $wg_alc_typ = "wg_alc_typ";
	/**
	 * WG allocation type name ワーキンググループ配賦区分名.<p>
	 *
	 */
	public static final String $wg_alc_typ_nm = "wg_alc_typ_nm";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";


	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_alc_ptn_cd_META = createCommonMeta($pre_alc_ptn_cd, mcframe.commonMA.meta.MA_META.PRE_ALC_PTN_CD);
	public static final MCMeta pre_alc_ptn_nm_lcl_META = createCommonMeta($pre_alc_ptn_nm_lcl, mcframe.commonMA.meta.MA_META.PRE_ALC_PTN_NM);
	public static final MCMeta pre_alc_ptn_nm_META = createCommonMeta($pre_alc_ptn_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_PTN_NM);
	public static final MCMeta dpt_alc_typ_META = createCommonMeta($dpt_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta dpt_alc_typ_nm_META = createCommonMeta($dpt_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta loc_alc_typ_META = createCommonMeta($loc_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta loc_alc_typ_nm_META = createCommonMeta($loc_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta oper_alc_typ_META = createCommonMeta($oper_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta oper_alc_typ_nm_META = createCommonMeta($oper_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta bp_alc_typ_META = createCommonMeta($bp_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta bp_alc_typ_nm_META = createCommonMeta($bp_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta ctg_alc_typ_META = createCommonMeta($ctg_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta ctg_alc_typ_nm_META = createCommonMeta($ctg_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta itm_alc_typ_META = createCommonMeta($itm_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta itm_alc_typ_nm_META = createCommonMeta($itm_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta lot_alc_typ_META = createCommonMeta($lot_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta lot_alc_typ_nm_META = createCommonMeta($lot_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta sublot_alc_typ_META = createCommonMeta($sublot_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sublot_alc_typ_nm_META = createCommonMeta($sublot_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta sno1_alc_typ_META = createCommonMeta($sno1_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno1_alc_typ_nm_META = createCommonMeta($sno1_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta sno2_alc_typ_META = createCommonMeta($sno2_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno2_alc_typ_nm_META = createCommonMeta($sno2_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta sno3_alc_typ_META = createCommonMeta($sno3_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno3_alc_typ_nm_META = createCommonMeta($sno3_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta sno4_alc_typ_META = createCommonMeta($sno4_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno4_alc_typ_nm_META = createCommonMeta($sno4_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta inst_alc_typ_META = createCommonMeta($inst_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta inst_alc_typ_nm_META = createCommonMeta($inst_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta iv_alc_typ_META = createCommonMeta($iv_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta iv_alc_typ_nm_META = createCommonMeta($iv_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta po_alc_typ_META = createCommonMeta($po_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta po_alc_typ_nm_META = createCommonMeta($po_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta slo_alc_typ_META = createCommonMeta($slo_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta slo_alc_typ_nm_META = createCommonMeta($slo_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta alc_ac_alc_typ_META = createCommonMeta($alc_ac_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta alc_ac_alc_typ_nm_META = createCommonMeta($alc_ac_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta wg_alc_typ_META = createCommonMeta($wg_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta wg_alc_typ_nm_META = createCommonMeta($wg_alc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<Srch01_Rslt1R> constMetas = new ConstMetaList<Srch01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			pre_alc_ptn_cd_META,
			pre_alc_ptn_nm_lcl_META,
			pre_alc_ptn_nm_META,
			dpt_alc_typ_META,
			dpt_alc_typ_nm_META,
			loc_alc_typ_META,
			loc_alc_typ_nm_META,
			oper_alc_typ_META,
			oper_alc_typ_nm_META,
			bp_alc_typ_META,
			bp_alc_typ_nm_META,
			ctg_alc_typ_META,
			ctg_alc_typ_nm_META,
			itm_alc_typ_META,
			itm_alc_typ_nm_META,
			lot_alc_typ_META,
			lot_alc_typ_nm_META,
			sublot_alc_typ_META,
			sublot_alc_typ_nm_META,
			sno1_alc_typ_META,
			sno1_alc_typ_nm_META,
			sno2_alc_typ_META,
			sno2_alc_typ_nm_META,
			sno3_alc_typ_META,
			sno3_alc_typ_nm_META,
			sno4_alc_typ_META,
			sno4_alc_typ_nm_META,
			inst_alc_typ_META,
			inst_alc_typ_nm_META,
			iv_alc_typ_META,
			iv_alc_typ_nm_META,
			po_alc_typ_META,
			po_alc_typ_nm_META,
			slo_alc_typ_META,
			slo_alc_typ_nm_META,
			alc_ac_alc_typ_META,
			alc_ac_alc_typ_nm_META,
			wg_alc_typ_META,
			wg_alc_typ_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META
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
				{$dpt_alc_typ, "MAC_PRE_ALC_TYP"},	// dpt_alc_typ
				{$loc_alc_typ, "MAC_PRE_ALC_TYP"},	// loc_alc_typ
				{$oper_alc_typ, "MAC_PRE_ALC_TYP"},	// oper_alc_typ
				{$bp_alc_typ, "MAC_PRE_ALC_TYP"},	// bp_alc_typ
				{$ctg_alc_typ, "MAC_PRE_ALC_TYP"},	// ctg_alc_typ
				{$itm_alc_typ, "MAC_PRE_ALC_TYP"},	// itm_alc_typ
				{$lot_alc_typ, "MAC_PRE_ALC_TYP"},	// lot_alc_typ
				{$sublot_alc_typ, "MAC_PRE_ALC_TYP"},	// sublot_alc_typ
				{$sno1_alc_typ, "MAC_PRE_ALC_TYP"},	// sno1_alc_typ
				{$sno2_alc_typ, "MAC_PRE_ALC_TYP"},	// sno2_alc_typ
				{$sno3_alc_typ, "MAC_PRE_ALC_TYP"},	// sno3_alc_typ
				{$sno4_alc_typ, "MAC_PRE_ALC_TYP"},	// sno4_alc_typ
				{$inst_alc_typ, "MAC_PRE_ALC_TYP"},	// inst_alc_typ
				{$iv_alc_typ, "MAC_PRE_ALC_TYP"},	// iv_alc_typ
				{$po_alc_typ, "MAC_PRE_ALC_TYP"},	// po_alc_typ
				{$slo_alc_typ, "MAC_PRE_ALC_TYP"},	// slo_alc_typ
				{$alc_ac_alc_typ, "MAC_PRE_ALC_TYP"},	// alc_ac_alc_typ
				{$wg_alc_typ, "MAC_PRE_ALC_TYP"}	// wg_alc_typ
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
	protected Srch01_Rslt1R_MC_A(ConstMetaList<? extends Srch01_Rslt1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R clone() {
		return (Srch01_Rslt1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R createInstance() {
		return (Srch01_Rslt1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R getValues(String... names) {
		return (Srch01_Rslt1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 0, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 0, $del_flg, value);
	}


	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public String pre_alc_ptn_cd() {
		return getConstString(offset + 1, $pre_alc_ptn_cd);
	}

	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public void pre_alc_ptn_cd(String value) {
		setConstString(offset + 1, $pre_alc_ptn_cd, value);
	}


	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public String pre_alc_ptn_nm_lcl() {
		return getConstString(offset + 2, $pre_alc_ptn_nm_lcl);
	}

	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public void pre_alc_ptn_nm_lcl(String value) {
		setConstString(offset + 2, $pre_alc_ptn_nm_lcl, value);
	}


	/**
	 * Standard Departmental alloc. pattern name 標準一次配賦パタン名.<p>
	 *
	 */
	public String pre_alc_ptn_nm() {
		return getConstString(offset + 3, $pre_alc_ptn_nm);
	}

	/**
	 * Standard Departmental alloc. pattern name 標準一次配賦パタン名.<p>
	 *
	 */
	public void pre_alc_ptn_nm(String value) {
		setConstString(offset + 3, $pre_alc_ptn_nm, value);
	}


	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public String dpt_alc_typ() {
		return getConstString(offset + 4, $dpt_alc_typ);
	}

	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public void dpt_alc_typ(String value) {
		setConstString(offset + 4, $dpt_alc_typ, value);
	}


	/**
	 * Dept. allocation type name 部門配賦区分名.<p>
	 *
	 */
	public String dpt_alc_typ_nm() {
		return getConstString(offset + 5, $dpt_alc_typ_nm);
	}

	/**
	 * Dept. allocation type name 部門配賦区分名.<p>
	 *
	 */
	public void dpt_alc_typ_nm(String value) {
		setConstString(offset + 5, $dpt_alc_typ_nm, value);
	}


	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public String loc_alc_typ() {
		return getConstString(offset + 6, $loc_alc_typ);
	}

	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public void loc_alc_typ(String value) {
		setConstString(offset + 6, $loc_alc_typ, value);
	}


	/**
	 * Location allocation type name 場所配賦区分名.<p>
	 *
	 */
	public String loc_alc_typ_nm() {
		return getConstString(offset + 7, $loc_alc_typ_nm);
	}

	/**
	 * Location allocation type name 場所配賦区分名.<p>
	 *
	 */
	public void loc_alc_typ_nm(String value) {
		setConstString(offset + 7, $loc_alc_typ_nm, value);
	}


	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public String oper_alc_typ() {
		return getConstString(offset + 8, $oper_alc_typ);
	}

	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public void oper_alc_typ(String value) {
		setConstString(offset + 8, $oper_alc_typ, value);
	}


	/**
	 * Operation allocation type name 工程配賦区分名.<p>
	 *
	 */
	public String oper_alc_typ_nm() {
		return getConstString(offset + 9, $oper_alc_typ_nm);
	}

	/**
	 * Operation allocation type name 工程配賦区分名.<p>
	 *
	 */
	public void oper_alc_typ_nm(String value) {
		setConstString(offset + 9, $oper_alc_typ_nm, value);
	}


	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public String bp_alc_typ() {
		return getConstString(offset + 10, $bp_alc_typ);
	}

	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public void bp_alc_typ(String value) {
		setConstString(offset + 10, $bp_alc_typ, value);
	}


	/**
	 * BP allocation type name 取引先配賦区分名.<p>
	 *
	 */
	public String bp_alc_typ_nm() {
		return getConstString(offset + 11, $bp_alc_typ_nm);
	}

	/**
	 * BP allocation type name 取引先配賦区分名.<p>
	 *
	 */
	public void bp_alc_typ_nm(String value) {
		setConstString(offset + 11, $bp_alc_typ_nm, value);
	}


	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public String ctg_alc_typ() {
		return getConstString(offset + 12, $ctg_alc_typ);
	}

	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public void ctg_alc_typ(String value) {
		setConstString(offset + 12, $ctg_alc_typ, value);
	}


	/**
	 * Item category allocation type name 品群配賦区分名.<p>
	 *
	 */
	public String ctg_alc_typ_nm() {
		return getConstString(offset + 13, $ctg_alc_typ_nm);
	}

	/**
	 * Item category allocation type name 品群配賦区分名.<p>
	 *
	 */
	public void ctg_alc_typ_nm(String value) {
		setConstString(offset + 13, $ctg_alc_typ_nm, value);
	}


	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public String itm_alc_typ() {
		return getConstString(offset + 14, $itm_alc_typ);
	}

	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public void itm_alc_typ(String value) {
		setConstString(offset + 14, $itm_alc_typ, value);
	}


	/**
	 * Item allocation type name 品目配賦区分名.<p>
	 *
	 */
	public String itm_alc_typ_nm() {
		return getConstString(offset + 15, $itm_alc_typ_nm);
	}

	/**
	 * Item allocation type name 品目配賦区分名.<p>
	 *
	 */
	public void itm_alc_typ_nm(String value) {
		setConstString(offset + 15, $itm_alc_typ_nm, value);
	}


	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public String lot_alc_typ() {
		return getConstString(offset + 16, $lot_alc_typ);
	}

	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public void lot_alc_typ(String value) {
		setConstString(offset + 16, $lot_alc_typ, value);
	}


	/**
	 * Lot No. allocation type name ロットＮＯ配賦区分名.<p>
	 *
	 */
	public String lot_alc_typ_nm() {
		return getConstString(offset + 17, $lot_alc_typ_nm);
	}

	/**
	 * Lot No. allocation type name ロットＮＯ配賦区分名.<p>
	 *
	 */
	public void lot_alc_typ_nm(String value) {
		setConstString(offset + 17, $lot_alc_typ_nm, value);
	}


	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public String sublot_alc_typ() {
		return getConstString(offset + 18, $sublot_alc_typ);
	}

	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public void sublot_alc_typ(String value) {
		setConstString(offset + 18, $sublot_alc_typ, value);
	}


	/**
	 * Sublot No. allocation type name サブロットＮＯ配賦区分名.<p>
	 *
	 */
	public String sublot_alc_typ_nm() {
		return getConstString(offset + 19, $sublot_alc_typ_nm);
	}

	/**
	 * Sublot No. allocation type name サブロットＮＯ配賦区分名.<p>
	 *
	 */
	public void sublot_alc_typ_nm(String value) {
		setConstString(offset + 19, $sublot_alc_typ_nm, value);
	}


	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public String sno1_alc_typ() {
		return getConstString(offset + 20, $sno1_alc_typ);
	}

	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public void sno1_alc_typ(String value) {
		setConstString(offset + 20, $sno1_alc_typ, value);
	}


	/**
	 * SEIBAN No. 1 allocation type name 手配ＮＯ１配賦区分名.<p>
	 *
	 */
	public String sno1_alc_typ_nm() {
		return getConstString(offset + 21, $sno1_alc_typ_nm);
	}

	/**
	 * SEIBAN No. 1 allocation type name 手配ＮＯ１配賦区分名.<p>
	 *
	 */
	public void sno1_alc_typ_nm(String value) {
		setConstString(offset + 21, $sno1_alc_typ_nm, value);
	}


	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public String sno2_alc_typ() {
		return getConstString(offset + 22, $sno2_alc_typ);
	}

	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public void sno2_alc_typ(String value) {
		setConstString(offset + 22, $sno2_alc_typ, value);
	}


	/**
	 * SEIBAN No. 2 allocation type name 手配ＮＯ２配賦区分名.<p>
	 *
	 */
	public String sno2_alc_typ_nm() {
		return getConstString(offset + 23, $sno2_alc_typ_nm);
	}

	/**
	 * SEIBAN No. 2 allocation type name 手配ＮＯ２配賦区分名.<p>
	 *
	 */
	public void sno2_alc_typ_nm(String value) {
		setConstString(offset + 23, $sno2_alc_typ_nm, value);
	}


	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public String sno3_alc_typ() {
		return getConstString(offset + 24, $sno3_alc_typ);
	}

	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public void sno3_alc_typ(String value) {
		setConstString(offset + 24, $sno3_alc_typ, value);
	}


	/**
	 * SEIBAN No. 3 allocation type name 手配ＮＯ３配賦区分名.<p>
	 *
	 */
	public String sno3_alc_typ_nm() {
		return getConstString(offset + 25, $sno3_alc_typ_nm);
	}

	/**
	 * SEIBAN No. 3 allocation type name 手配ＮＯ３配賦区分名.<p>
	 *
	 */
	public void sno3_alc_typ_nm(String value) {
		setConstString(offset + 25, $sno3_alc_typ_nm, value);
	}


	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public String sno4_alc_typ() {
		return getConstString(offset + 26, $sno4_alc_typ);
	}

	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public void sno4_alc_typ(String value) {
		setConstString(offset + 26, $sno4_alc_typ, value);
	}


	/**
	 * SEIBAN No. 4 allocation type name 手配ＮＯ４配賦区分名.<p>
	 *
	 */
	public String sno4_alc_typ_nm() {
		return getConstString(offset + 27, $sno4_alc_typ_nm);
	}

	/**
	 * SEIBAN No. 4 allocation type name 手配ＮＯ４配賦区分名.<p>
	 *
	 */
	public void sno4_alc_typ_nm(String value) {
		setConstString(offset + 27, $sno4_alc_typ_nm, value);
	}


	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public String inst_alc_typ() {
		return getConstString(offset + 28, $inst_alc_typ);
	}

	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public void inst_alc_typ(String value) {
		setConstString(offset + 28, $inst_alc_typ, value);
	}


	/**
	 * Order allocation type name 指図配賦区分名.<p>
	 *
	 */
	public String inst_alc_typ_nm() {
		return getConstString(offset + 29, $inst_alc_typ_nm);
	}

	/**
	 * Order allocation type name 指図配賦区分名.<p>
	 *
	 */
	public void inst_alc_typ_nm(String value) {
		setConstString(offset + 29, $inst_alc_typ_nm, value);
	}


	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public String iv_alc_typ() {
		return getConstString(offset + 30, $iv_alc_typ);
	}

	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public void iv_alc_typ(String value) {
		setConstString(offset + 30, $iv_alc_typ, value);
	}


	/**
	 * Invoice allocation type name インボイス配賦区分名.<p>
	 *
	 */
	public String iv_alc_typ_nm() {
		return getConstString(offset + 31, $iv_alc_typ_nm);
	}

	/**
	 * Invoice allocation type name インボイス配賦区分名.<p>
	 *
	 */
	public void iv_alc_typ_nm(String value) {
		setConstString(offset + 31, $iv_alc_typ_nm, value);
	}


	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public String po_alc_typ() {
		return getConstString(offset + 32, $po_alc_typ);
	}

	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public void po_alc_typ(String value) {
		setConstString(offset + 32, $po_alc_typ, value);
	}


	/**
	 * PO allocation type name 発注配賦区分名.<p>
	 *
	 */
	public String po_alc_typ_nm() {
		return getConstString(offset + 33, $po_alc_typ_nm);
	}

	/**
	 * PO allocation type name 発注配賦区分名.<p>
	 *
	 */
	public void po_alc_typ_nm(String value) {
		setConstString(offset + 33, $po_alc_typ_nm, value);
	}


	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public String slo_alc_typ() {
		return getConstString(offset + 34, $slo_alc_typ);
	}

	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public void slo_alc_typ(String value) {
		setConstString(offset + 34, $slo_alc_typ, value);
	}


	/**
	 * Sales order allocation type name 受注配賦区分名.<p>
	 *
	 */
	public String slo_alc_typ_nm() {
		return getConstString(offset + 35, $slo_alc_typ_nm);
	}

	/**
	 * Sales order allocation type name 受注配賦区分名.<p>
	 *
	 */
	public void slo_alc_typ_nm(String value) {
		setConstString(offset + 35, $slo_alc_typ_nm, value);
	}


	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public String alc_ac_alc_typ() {
		return getConstString(offset + 36, $alc_ac_alc_typ);
	}

	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public void alc_ac_alc_typ(String value) {
		setConstString(offset + 36, $alc_ac_alc_typ, value);
	}


	/**
	 * Allocation account allocation type name 配賦科目配賦区分名.<p>
	 *
	 */
	public String alc_ac_alc_typ_nm() {
		return getConstString(offset + 37, $alc_ac_alc_typ_nm);
	}

	/**
	 * Allocation account allocation type name 配賦科目配賦区分名.<p>
	 *
	 */
	public void alc_ac_alc_typ_nm(String value) {
		setConstString(offset + 37, $alc_ac_alc_typ_nm, value);
	}


	/**
	 * WG allocation type ワーキンググループ配賦区分.<p>
	 *
	 */
	public String wg_alc_typ() {
		return getConstString(offset + 38, $wg_alc_typ);
	}

	/**
	 * WG allocation type ワーキンググループ配賦区分.<p>
	 *
	 */
	public void wg_alc_typ(String value) {
		setConstString(offset + 38, $wg_alc_typ, value);
	}


	/**
	 * WG allocation type name ワーキンググループ配賦区分名.<p>
	 *
	 */
	public String wg_alc_typ_nm() {
		return getConstString(offset + 39, $wg_alc_typ_nm);
	}

	/**
	 * WG allocation type name ワーキンググループ配賦区分名.<p>
	 *
	 */
	public void wg_alc_typ_nm(String value) {
		setConstString(offset + 39, $wg_alc_typ_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 40, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 40, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 41, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 41, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 42, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 42, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 43, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 43, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 44, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 44, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 45, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 45, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 46, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 46, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 47, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 47, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 48, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 49, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 49, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 50, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 50, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 51, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 51, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 52, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 52, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 53, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 53, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 54, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 54, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 55, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 55, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 56, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 56, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 57, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 57, $del_ts, value);
	}


	public String getString(String name) {
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			return pre_alc_ptn_cd();
		}
		if ($pre_alc_ptn_nm_lcl.equalsIgnoreCase(name)) {
			return pre_alc_ptn_nm_lcl();
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			return pre_alc_ptn_nm();
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			return dpt_alc_typ();
		}
		if ($dpt_alc_typ_nm.equalsIgnoreCase(name)) {
			return dpt_alc_typ_nm();
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			return loc_alc_typ();
		}
		if ($loc_alc_typ_nm.equalsIgnoreCase(name)) {
			return loc_alc_typ_nm();
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			return oper_alc_typ();
		}
		if ($oper_alc_typ_nm.equalsIgnoreCase(name)) {
			return oper_alc_typ_nm();
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			return bp_alc_typ();
		}
		if ($bp_alc_typ_nm.equalsIgnoreCase(name)) {
			return bp_alc_typ_nm();
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			return ctg_alc_typ();
		}
		if ($ctg_alc_typ_nm.equalsIgnoreCase(name)) {
			return ctg_alc_typ_nm();
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			return itm_alc_typ();
		}
		if ($itm_alc_typ_nm.equalsIgnoreCase(name)) {
			return itm_alc_typ_nm();
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			return lot_alc_typ();
		}
		if ($lot_alc_typ_nm.equalsIgnoreCase(name)) {
			return lot_alc_typ_nm();
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			return sublot_alc_typ();
		}
		if ($sublot_alc_typ_nm.equalsIgnoreCase(name)) {
			return sublot_alc_typ_nm();
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			return sno1_alc_typ();
		}
		if ($sno1_alc_typ_nm.equalsIgnoreCase(name)) {
			return sno1_alc_typ_nm();
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			return sno2_alc_typ();
		}
		if ($sno2_alc_typ_nm.equalsIgnoreCase(name)) {
			return sno2_alc_typ_nm();
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			return sno3_alc_typ();
		}
		if ($sno3_alc_typ_nm.equalsIgnoreCase(name)) {
			return sno3_alc_typ_nm();
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			return sno4_alc_typ();
		}
		if ($sno4_alc_typ_nm.equalsIgnoreCase(name)) {
			return sno4_alc_typ_nm();
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			return inst_alc_typ();
		}
		if ($inst_alc_typ_nm.equalsIgnoreCase(name)) {
			return inst_alc_typ_nm();
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			return iv_alc_typ();
		}
		if ($iv_alc_typ_nm.equalsIgnoreCase(name)) {
			return iv_alc_typ_nm();
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			return po_alc_typ();
		}
		if ($po_alc_typ_nm.equalsIgnoreCase(name)) {
			return po_alc_typ_nm();
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			return slo_alc_typ();
		}
		if ($slo_alc_typ_nm.equalsIgnoreCase(name)) {
			return slo_alc_typ_nm();
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			return alc_ac_alc_typ();
		}
		if ($alc_ac_alc_typ_nm.equalsIgnoreCase(name)) {
			return alc_ac_alc_typ_nm();
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			return wg_alc_typ();
		}
		if ($wg_alc_typ_nm.equalsIgnoreCase(name)) {
			return wg_alc_typ_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			return pre_alc_ptn_cd();
		}
		if ($pre_alc_ptn_nm_lcl.equalsIgnoreCase(name)) {
			return pre_alc_ptn_nm_lcl();
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			return pre_alc_ptn_nm();
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			return dpt_alc_typ();
		}
		if ($dpt_alc_typ_nm.equalsIgnoreCase(name)) {
			return dpt_alc_typ_nm();
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			return loc_alc_typ();
		}
		if ($loc_alc_typ_nm.equalsIgnoreCase(name)) {
			return loc_alc_typ_nm();
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			return oper_alc_typ();
		}
		if ($oper_alc_typ_nm.equalsIgnoreCase(name)) {
			return oper_alc_typ_nm();
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			return bp_alc_typ();
		}
		if ($bp_alc_typ_nm.equalsIgnoreCase(name)) {
			return bp_alc_typ_nm();
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			return ctg_alc_typ();
		}
		if ($ctg_alc_typ_nm.equalsIgnoreCase(name)) {
			return ctg_alc_typ_nm();
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			return itm_alc_typ();
		}
		if ($itm_alc_typ_nm.equalsIgnoreCase(name)) {
			return itm_alc_typ_nm();
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			return lot_alc_typ();
		}
		if ($lot_alc_typ_nm.equalsIgnoreCase(name)) {
			return lot_alc_typ_nm();
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			return sublot_alc_typ();
		}
		if ($sublot_alc_typ_nm.equalsIgnoreCase(name)) {
			return sublot_alc_typ_nm();
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			return sno1_alc_typ();
		}
		if ($sno1_alc_typ_nm.equalsIgnoreCase(name)) {
			return sno1_alc_typ_nm();
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			return sno2_alc_typ();
		}
		if ($sno2_alc_typ_nm.equalsIgnoreCase(name)) {
			return sno2_alc_typ_nm();
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			return sno3_alc_typ();
		}
		if ($sno3_alc_typ_nm.equalsIgnoreCase(name)) {
			return sno3_alc_typ_nm();
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			return sno4_alc_typ();
		}
		if ($sno4_alc_typ_nm.equalsIgnoreCase(name)) {
			return sno4_alc_typ_nm();
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			return inst_alc_typ();
		}
		if ($inst_alc_typ_nm.equalsIgnoreCase(name)) {
			return inst_alc_typ_nm();
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			return iv_alc_typ();
		}
		if ($iv_alc_typ_nm.equalsIgnoreCase(name)) {
			return iv_alc_typ_nm();
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			return po_alc_typ();
		}
		if ($po_alc_typ_nm.equalsIgnoreCase(name)) {
			return po_alc_typ_nm();
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			return slo_alc_typ();
		}
		if ($slo_alc_typ_nm.equalsIgnoreCase(name)) {
			return slo_alc_typ_nm();
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			return alc_ac_alc_typ();
		}
		if ($alc_ac_alc_typ_nm.equalsIgnoreCase(name)) {
			return alc_ac_alc_typ_nm();
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			return wg_alc_typ();
		}
		if ($wg_alc_typ_nm.equalsIgnoreCase(name)) {
			return wg_alc_typ_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			pre_alc_ptn_cd(value);
			return;
		}
		if ($pre_alc_ptn_nm_lcl.equalsIgnoreCase(name)) {
			pre_alc_ptn_nm_lcl(value);
			return;
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			pre_alc_ptn_nm(value);
			return;
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			dpt_alc_typ(value);
			return;
		}
		if ($dpt_alc_typ_nm.equalsIgnoreCase(name)) {
			dpt_alc_typ_nm(value);
			return;
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			loc_alc_typ(value);
			return;
		}
		if ($loc_alc_typ_nm.equalsIgnoreCase(name)) {
			loc_alc_typ_nm(value);
			return;
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			oper_alc_typ(value);
			return;
		}
		if ($oper_alc_typ_nm.equalsIgnoreCase(name)) {
			oper_alc_typ_nm(value);
			return;
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			bp_alc_typ(value);
			return;
		}
		if ($bp_alc_typ_nm.equalsIgnoreCase(name)) {
			bp_alc_typ_nm(value);
			return;
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			ctg_alc_typ(value);
			return;
		}
		if ($ctg_alc_typ_nm.equalsIgnoreCase(name)) {
			ctg_alc_typ_nm(value);
			return;
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			itm_alc_typ(value);
			return;
		}
		if ($itm_alc_typ_nm.equalsIgnoreCase(name)) {
			itm_alc_typ_nm(value);
			return;
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			lot_alc_typ(value);
			return;
		}
		if ($lot_alc_typ_nm.equalsIgnoreCase(name)) {
			lot_alc_typ_nm(value);
			return;
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			sublot_alc_typ(value);
			return;
		}
		if ($sublot_alc_typ_nm.equalsIgnoreCase(name)) {
			sublot_alc_typ_nm(value);
			return;
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			sno1_alc_typ(value);
			return;
		}
		if ($sno1_alc_typ_nm.equalsIgnoreCase(name)) {
			sno1_alc_typ_nm(value);
			return;
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			sno2_alc_typ(value);
			return;
		}
		if ($sno2_alc_typ_nm.equalsIgnoreCase(name)) {
			sno2_alc_typ_nm(value);
			return;
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			sno3_alc_typ(value);
			return;
		}
		if ($sno3_alc_typ_nm.equalsIgnoreCase(name)) {
			sno3_alc_typ_nm(value);
			return;
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			sno4_alc_typ(value);
			return;
		}
		if ($sno4_alc_typ_nm.equalsIgnoreCase(name)) {
			sno4_alc_typ_nm(value);
			return;
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			inst_alc_typ(value);
			return;
		}
		if ($inst_alc_typ_nm.equalsIgnoreCase(name)) {
			inst_alc_typ_nm(value);
			return;
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			iv_alc_typ(value);
			return;
		}
		if ($iv_alc_typ_nm.equalsIgnoreCase(name)) {
			iv_alc_typ_nm(value);
			return;
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			po_alc_typ(value);
			return;
		}
		if ($po_alc_typ_nm.equalsIgnoreCase(name)) {
			po_alc_typ_nm(value);
			return;
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			slo_alc_typ(value);
			return;
		}
		if ($slo_alc_typ_nm.equalsIgnoreCase(name)) {
			slo_alc_typ_nm(value);
			return;
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			alc_ac_alc_typ(value);
			return;
		}
		if ($alc_ac_alc_typ_nm.equalsIgnoreCase(name)) {
			alc_ac_alc_typ_nm(value);
			return;
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			wg_alc_typ(value);
			return;
		}
		if ($wg_alc_typ_nm.equalsIgnoreCase(name)) {
			wg_alc_typ_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			pre_alc_ptn_cd(value);
			return;
		}
		if ($pre_alc_ptn_nm_lcl.equalsIgnoreCase(name)) {
			pre_alc_ptn_nm_lcl(value);
			return;
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			pre_alc_ptn_nm(value);
			return;
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			dpt_alc_typ(value);
			return;
		}
		if ($dpt_alc_typ_nm.equalsIgnoreCase(name)) {
			dpt_alc_typ_nm(value);
			return;
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			loc_alc_typ(value);
			return;
		}
		if ($loc_alc_typ_nm.equalsIgnoreCase(name)) {
			loc_alc_typ_nm(value);
			return;
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			oper_alc_typ(value);
			return;
		}
		if ($oper_alc_typ_nm.equalsIgnoreCase(name)) {
			oper_alc_typ_nm(value);
			return;
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			bp_alc_typ(value);
			return;
		}
		if ($bp_alc_typ_nm.equalsIgnoreCase(name)) {
			bp_alc_typ_nm(value);
			return;
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			ctg_alc_typ(value);
			return;
		}
		if ($ctg_alc_typ_nm.equalsIgnoreCase(name)) {
			ctg_alc_typ_nm(value);
			return;
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			itm_alc_typ(value);
			return;
		}
		if ($itm_alc_typ_nm.equalsIgnoreCase(name)) {
			itm_alc_typ_nm(value);
			return;
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			lot_alc_typ(value);
			return;
		}
		if ($lot_alc_typ_nm.equalsIgnoreCase(name)) {
			lot_alc_typ_nm(value);
			return;
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			sublot_alc_typ(value);
			return;
		}
		if ($sublot_alc_typ_nm.equalsIgnoreCase(name)) {
			sublot_alc_typ_nm(value);
			return;
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			sno1_alc_typ(value);
			return;
		}
		if ($sno1_alc_typ_nm.equalsIgnoreCase(name)) {
			sno1_alc_typ_nm(value);
			return;
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			sno2_alc_typ(value);
			return;
		}
		if ($sno2_alc_typ_nm.equalsIgnoreCase(name)) {
			sno2_alc_typ_nm(value);
			return;
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			sno3_alc_typ(value);
			return;
		}
		if ($sno3_alc_typ_nm.equalsIgnoreCase(name)) {
			sno3_alc_typ_nm(value);
			return;
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			sno4_alc_typ(value);
			return;
		}
		if ($sno4_alc_typ_nm.equalsIgnoreCase(name)) {
			sno4_alc_typ_nm(value);
			return;
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			inst_alc_typ(value);
			return;
		}
		if ($inst_alc_typ_nm.equalsIgnoreCase(name)) {
			inst_alc_typ_nm(value);
			return;
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			iv_alc_typ(value);
			return;
		}
		if ($iv_alc_typ_nm.equalsIgnoreCase(name)) {
			iv_alc_typ_nm(value);
			return;
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			po_alc_typ(value);
			return;
		}
		if ($po_alc_typ_nm.equalsIgnoreCase(name)) {
			po_alc_typ_nm(value);
			return;
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			slo_alc_typ(value);
			return;
		}
		if ($slo_alc_typ_nm.equalsIgnoreCase(name)) {
			slo_alc_typ_nm(value);
			return;
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			alc_ac_alc_typ(value);
			return;
		}
		if ($alc_ac_alc_typ_nm.equalsIgnoreCase(name)) {
			alc_ac_alc_typ_nm(value);
			return;
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			wg_alc_typ(value);
			return;
		}
		if ($wg_alc_typ_nm.equalsIgnoreCase(name)) {
			wg_alc_typ_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

