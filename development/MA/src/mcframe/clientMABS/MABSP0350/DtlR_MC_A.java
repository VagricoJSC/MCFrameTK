package mcframe.clientMABS.MABSP0350;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	public static final String $itm_p = "itm_p";
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
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public static final String $def_plnt_aprv_flg = "def_plnt_aprv_flg";
	/**
	 * Factory release approval role cd. 工場出荷承認役割ＣＤ.<p>
	 *
	 */
	public static final String $def_plnt_aprv_role_cd = "def_plnt_aprv_role_cd";
	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public static final String $def_insp_aprv_flg = "def_insp_aprv_flg";
	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public static final String $def_insp_aprv_role_cd = "def_insp_aprv_role_cd";
	/**
	 * For mfg. approval 製造承認対象.<p>
	 *
	 */
	public static final String $def_mfg_aprv_flg = "def_mfg_aprv_flg";
	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public static final String $def_mfg_aprv_role_cd = "def_mfg_aprv_role_cd";
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
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public static final String $ntfy_nm = "ntfy_nm";
	/**
	 * Numbering ID 発番ＩＤ.<p>
	 *
	 */
	public static final String $num_id = "num_id";
	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public static final String $plnt_aprv_flg = "plnt_aprv_flg";
	/**
	 * Factory release approval role cd. 工場出荷承認役割ＣＤ.<p>
	 *
	 */
	public static final String $plnt_aprv_role_cd = "plnt_aprv_role_cd";
	/**
	 * Factory release approval role name 工場出荷承認役割名.<p>
	 *
	 */
	public static final String $plnt_aprv_role_nm = "plnt_aprv_role_nm";
	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public static final String $insp_aprv_flg = "insp_aprv_flg";
	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public static final String $insp_aprv_role_cd = "insp_aprv_role_cd";
	/**
	 * Inspection approval role name 検査承認役割名.<p>
	 *
	 */
	public static final String $insp_aprv_role_nm = "insp_aprv_role_nm";
	/**
	 * For mfg. approval 製造承認対象.<p>
	 *
	 */
	public static final String $mfg_aprv_flg = "mfg_aprv_flg";
	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public static final String $mfg_aprv_role_cd = "mfg_aprv_role_cd";
	/**
	 * Mfg. approval role name 製造承認役割名.<p>
	 *
	 */
	public static final String $mfg_aprv_role_nm = "mfg_aprv_role_nm";
	/**
	 * Lot No. transfer at transport receipt 移送入荷時ロットＮＯ振替.<p>
	 *
	 */
	public static final String $xfr_lot_flg = "xfr_lot_flg";
	/**
	 * Allow inspecting lot shipment 検査中ロット出荷許可.<p>
	 *
	 */
	public static final String $so_prmt_insp_flg = "so_prmt_insp_flg";
	/**
	 * Allow inspecting lot use 検査中ロット使用許可.<p>
	 *
	 */
	public static final String $in_prmt_insp_flg = "in_prmt_insp_flg";
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

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta def_plnt_aprv_flg_META = createCommonMeta($def_plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_plnt_aprv_role_cd_META = createCommonMeta($def_plnt_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta def_insp_aprv_flg_META = createCommonMeta($def_insp_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_insp_aprv_role_cd_META = createCommonMeta($def_insp_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta def_mfg_aprv_flg_META = createCommonMeta($def_mfg_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_mfg_aprv_role_cd_META = createCommonMeta($def_mfg_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_mng_typ_nm_META = createCommonMeta($lot_mng_typ_nm, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP_NM);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_nm_META = createCommonMeta($sublot_mng_typ_nm, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta ntfy_nm_META = createCommonMeta($ntfy_nm, mcframe.commonMA.meta.MA_META.NTFY_NM);
	public static final MCMeta num_id_META = createCommonMeta($num_id, mcframe.commonMA.meta.MA_META.NUM_ID);
	public static final MCMeta plnt_aprv_flg_META = createCommonMeta($plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta plnt_aprv_role_cd_META = createCommonMeta($plnt_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta plnt_aprv_role_nm_META = createCommonMeta($plnt_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta insp_aprv_flg_META = createCommonMeta($insp_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_aprv_role_cd_META = createCommonMeta($insp_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta insp_aprv_role_nm_META = createCommonMeta($insp_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta mfg_aprv_flg_META = createCommonMeta($mfg_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_aprv_role_cd_META = createCommonMeta($mfg_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta mfg_aprv_role_nm_META = createCommonMeta($mfg_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta xfr_lot_flg_META = createCommonMeta($xfr_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta so_prmt_insp_flg_META = createCommonMeta($so_prmt_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_prmt_insp_flg_META = createCommonMeta($in_prmt_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
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

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			del_flg_META,
			itm_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			def_plnt_aprv_flg_META,
			def_plnt_aprv_role_cd_META,
			def_insp_aprv_flg_META,
			def_insp_aprv_role_cd_META,
			def_mfg_aprv_flg_META,
			def_mfg_aprv_role_cd_META,
			lot_mng_typ_META,
			lot_mng_typ_nm_META,
			sublot_mng_typ_META,
			sublot_mng_typ_nm_META,
			site_cd_META,
			site_nm_META,
			ntfy_nm_META,
			num_id_META,
			plnt_aprv_flg_META,
			plnt_aprv_role_cd_META,
			plnt_aprv_role_nm_META,
			insp_aprv_flg_META,
			insp_aprv_role_cd_META,
			insp_aprv_role_nm_META,
			mfg_aprv_flg_META,
			mfg_aprv_role_cd_META,
			mfg_aprv_role_nm_META,
			xfr_lot_flg_META,
			so_prmt_insp_flg_META,
			in_prmt_insp_flg_META,
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
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$itm_p + ".itm_cd",	// itm_p.itm_cd
			$itm_p + ".itm_sub1",	// itm_p.itm_sub1
			$itm_p + ".itm_sub2",	// itm_p.itm_sub2
			$itm_p + ".itm_sub3",	// itm_p.itm_sub3
			$site_cd	// site_cd
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
				{$itm_typ_d_cd, "def_plnt_aprv_flg;def_plnt_aprv_role_cd;def_insp_aprv_flg;def_insp_aprv_role_cd;def_mfg_aprv_flg;def_mfg_aprv_role_cd"},	// itm_typ_d_cd
				{$plnt_aprv_role_cd, "aprv_role_nm"},	// plnt_aprv_role_cd
				{$insp_aprv_role_cd, "aprv_role_nm"},	// insp_aprv_role_cd
				{$mfg_aprv_role_cd, "aprv_role_nm"}	// mfg_aprv_role_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK1_ASSET1"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK1_ASSET1;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK1_ASSET1;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1_ASSET1;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$itm_typ_d_cd, "itm_typ"}	// itm_typ_d_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$itm_typ_d_cd, "itm_typ"}	// itm_typ_d_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$insp_aprv_flg, "MFG_APRV"},	// insp_aprv_flg
				{$insp_aprv_role_cd, "MFG_APRV"},	// insp_aprv_role_cd
				{$insp_aprv_role_nm, "MFG_APRV"},	// insp_aprv_role_nm
				{$mfg_aprv_flg, "MFG_APRV"},	// mfg_aprv_flg
				{$mfg_aprv_role_cd, "MFG_APRV"},	// mfg_aprv_role_cd
				{$mfg_aprv_role_nm, "MFG_APRV"},	// mfg_aprv_role_nm
				{$in_prmt_insp_flg, "IN_PRMT_INSP"}	// in_prmt_insp_flg
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
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


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 1, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 1, $del_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 2, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 2, $itm_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 3, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 3, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 4, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 4, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 5, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 5, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 6, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 6, $itm_typ_d_nm, value);
	}


	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public boolean def_plnt_aprv_flg() {
		return getConstBoolean(offset + 7, $def_plnt_aprv_flg);
	}

	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public void def_plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 7, $def_plnt_aprv_flg, value);
	}


	/**
	 * Factory release approval role cd. 工場出荷承認役割ＣＤ.<p>
	 *
	 */
	public String def_plnt_aprv_role_cd() {
		return getConstString(offset + 8, $def_plnt_aprv_role_cd);
	}

	/**
	 * Factory release approval role cd. 工場出荷承認役割ＣＤ.<p>
	 *
	 */
	public void def_plnt_aprv_role_cd(String value) {
		setConstString(offset + 8, $def_plnt_aprv_role_cd, value);
	}


	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public boolean def_insp_aprv_flg() {
		return getConstBoolean(offset + 9, $def_insp_aprv_flg);
	}

	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public void def_insp_aprv_flg(boolean value) {
		setConstBoolean(offset + 9, $def_insp_aprv_flg, value);
	}


	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public String def_insp_aprv_role_cd() {
		return getConstString(offset + 10, $def_insp_aprv_role_cd);
	}

	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public void def_insp_aprv_role_cd(String value) {
		setConstString(offset + 10, $def_insp_aprv_role_cd, value);
	}


	/**
	 * For mfg. approval 製造承認対象.<p>
	 *
	 */
	public boolean def_mfg_aprv_flg() {
		return getConstBoolean(offset + 11, $def_mfg_aprv_flg);
	}

	/**
	 * For mfg. approval 製造承認対象.<p>
	 *
	 */
	public void def_mfg_aprv_flg(boolean value) {
		setConstBoolean(offset + 11, $def_mfg_aprv_flg, value);
	}


	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public String def_mfg_aprv_role_cd() {
		return getConstString(offset + 12, $def_mfg_aprv_role_cd);
	}

	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public void def_mfg_aprv_role_cd(String value) {
		setConstString(offset + 12, $def_mfg_aprv_role_cd, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 13, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 13, $lot_mng_typ, value);
	}


	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public String lot_mng_typ_nm() {
		return getConstString(offset + 14, $lot_mng_typ_nm);
	}

	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public void lot_mng_typ_nm(String value) {
		setConstString(offset + 14, $lot_mng_typ_nm, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 15, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 15, $sublot_mng_typ, value);
	}


	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public String sublot_mng_typ_nm() {
		return getConstString(offset + 16, $sublot_mng_typ_nm);
	}

	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public void sublot_mng_typ_nm(String value) {
		setConstString(offset + 16, $sublot_mng_typ_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 17, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 17, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 18, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 18, $site_nm, value);
	}


	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public String ntfy_nm() {
		return getConstString(offset + 19, $ntfy_nm);
	}

	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public void ntfy_nm(String value) {
		setConstString(offset + 19, $ntfy_nm, value);
	}


	/**
	 * Numbering ID 発番ＩＤ.<p>
	 *
	 */
	public String num_id() {
		return getConstString(offset + 20, $num_id);
	}

	/**
	 * Numbering ID 発番ＩＤ.<p>
	 *
	 */
	public void num_id(String value) {
		setConstString(offset + 20, $num_id, value);
	}


	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public boolean plnt_aprv_flg() {
		return getConstBoolean(offset + 21, $plnt_aprv_flg);
	}

	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public void plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 21, $plnt_aprv_flg, value);
	}


	/**
	 * Factory release approval role cd. 工場出荷承認役割ＣＤ.<p>
	 *
	 */
	public String plnt_aprv_role_cd() {
		return getConstString(offset + 22, $plnt_aprv_role_cd);
	}

	/**
	 * Factory release approval role cd. 工場出荷承認役割ＣＤ.<p>
	 *
	 */
	public void plnt_aprv_role_cd(String value) {
		setConstString(offset + 22, $plnt_aprv_role_cd, value);
	}


	/**
	 * Factory release approval role name 工場出荷承認役割名.<p>
	 *
	 */
	public String plnt_aprv_role_nm() {
		return getConstString(offset + 23, $plnt_aprv_role_nm);
	}

	/**
	 * Factory release approval role name 工場出荷承認役割名.<p>
	 *
	 */
	public void plnt_aprv_role_nm(String value) {
		setConstString(offset + 23, $plnt_aprv_role_nm, value);
	}


	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public boolean insp_aprv_flg() {
		return getConstBoolean(offset + 24, $insp_aprv_flg);
	}

	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public void insp_aprv_flg(boolean value) {
		setConstBoolean(offset + 24, $insp_aprv_flg, value);
	}


	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public String insp_aprv_role_cd() {
		return getConstString(offset + 25, $insp_aprv_role_cd);
	}

	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public void insp_aprv_role_cd(String value) {
		setConstString(offset + 25, $insp_aprv_role_cd, value);
	}


	/**
	 * Inspection approval role name 検査承認役割名.<p>
	 *
	 */
	public String insp_aprv_role_nm() {
		return getConstString(offset + 26, $insp_aprv_role_nm);
	}

	/**
	 * Inspection approval role name 検査承認役割名.<p>
	 *
	 */
	public void insp_aprv_role_nm(String value) {
		setConstString(offset + 26, $insp_aprv_role_nm, value);
	}


	/**
	 * For mfg. approval 製造承認対象.<p>
	 *
	 */
	public boolean mfg_aprv_flg() {
		return getConstBoolean(offset + 27, $mfg_aprv_flg);
	}

	/**
	 * For mfg. approval 製造承認対象.<p>
	 *
	 */
	public void mfg_aprv_flg(boolean value) {
		setConstBoolean(offset + 27, $mfg_aprv_flg, value);
	}


	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public String mfg_aprv_role_cd() {
		return getConstString(offset + 28, $mfg_aprv_role_cd);
	}

	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public void mfg_aprv_role_cd(String value) {
		setConstString(offset + 28, $mfg_aprv_role_cd, value);
	}


	/**
	 * Mfg. approval role name 製造承認役割名.<p>
	 *
	 */
	public String mfg_aprv_role_nm() {
		return getConstString(offset + 29, $mfg_aprv_role_nm);
	}

	/**
	 * Mfg. approval role name 製造承認役割名.<p>
	 *
	 */
	public void mfg_aprv_role_nm(String value) {
		setConstString(offset + 29, $mfg_aprv_role_nm, value);
	}


	/**
	 * Lot No. transfer at transport receipt 移送入荷時ロットＮＯ振替.<p>
	 *
	 */
	public boolean xfr_lot_flg() {
		return getConstBoolean(offset + 30, $xfr_lot_flg);
	}

	/**
	 * Lot No. transfer at transport receipt 移送入荷時ロットＮＯ振替.<p>
	 *
	 */
	public void xfr_lot_flg(boolean value) {
		setConstBoolean(offset + 30, $xfr_lot_flg, value);
	}


	/**
	 * Allow inspecting lot shipment 検査中ロット出荷許可.<p>
	 *
	 */
	public boolean so_prmt_insp_flg() {
		return getConstBoolean(offset + 31, $so_prmt_insp_flg);
	}

	/**
	 * Allow inspecting lot shipment 検査中ロット出荷許可.<p>
	 *
	 */
	public void so_prmt_insp_flg(boolean value) {
		setConstBoolean(offset + 31, $so_prmt_insp_flg, value);
	}


	/**
	 * Allow inspecting lot use 検査中ロット使用許可.<p>
	 *
	 */
	public boolean in_prmt_insp_flg() {
		return getConstBoolean(offset + 32, $in_prmt_insp_flg);
	}

	/**
	 * Allow inspecting lot use 検査中ロット使用許可.<p>
	 *
	 */
	public void in_prmt_insp_flg(boolean value) {
		setConstBoolean(offset + 32, $in_prmt_insp_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 33, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 33, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 34, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 34, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 35, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 35, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 36, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 36, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 37, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 37, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 38, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 38, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 39, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 39, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 40, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 40, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 41, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 41, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 41, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 41, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 41, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 41, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 42, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 42, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 43, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 43, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 44, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 44, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 45, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 45, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 46, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 46, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 47, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 47, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 48, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 48, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 49, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 49, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 50, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 50, $del_ts, value);
	}


	public String getString(String name) {
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
		if ($def_plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_plnt_aprv_role_cd();
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_insp_aprv_role_cd();
		}
		if ($def_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_mfg_aprv_role_cd();
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			return ntfy_nm();
		}
		if ($num_id.equalsIgnoreCase(name)) {
			return num_id();
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			return plnt_aprv_role_cd();
		}
		if ($plnt_aprv_role_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_role_nm();
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return insp_aprv_role_cd();
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			return insp_aprv_role_nm();
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return mfg_aprv_role_cd();
		}
		if ($mfg_aprv_role_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_role_nm();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($def_plnt_aprv_flg.equalsIgnoreCase(name)) {
			return def_plnt_aprv_flg();
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			return def_insp_aprv_flg();
		}
		if ($def_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return def_mfg_aprv_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			return insp_aprv_flg();
		}
		if ($mfg_aprv_flg.equalsIgnoreCase(name)) {
			return mfg_aprv_flg();
		}
		if ($xfr_lot_flg.equalsIgnoreCase(name)) {
			return xfr_lot_flg();
		}
		if ($so_prmt_insp_flg.equalsIgnoreCase(name)) {
			return so_prmt_insp_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($def_plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_plnt_aprv_role_cd();
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_insp_aprv_role_cd();
		}
		if ($def_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_mfg_aprv_role_cd();
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			return ntfy_nm();
		}
		if ($num_id.equalsIgnoreCase(name)) {
			return num_id();
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			return plnt_aprv_role_cd();
		}
		if ($plnt_aprv_role_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_role_nm();
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return insp_aprv_role_cd();
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			return insp_aprv_role_nm();
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return mfg_aprv_role_cd();
		}
		if ($mfg_aprv_role_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_role_nm();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($def_plnt_aprv_flg.equalsIgnoreCase(name)) {
			return def_plnt_aprv_flg();
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			return def_insp_aprv_flg();
		}
		if ($def_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return def_mfg_aprv_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			return insp_aprv_flg();
		}
		if ($mfg_aprv_flg.equalsIgnoreCase(name)) {
			return mfg_aprv_flg();
		}
		if ($xfr_lot_flg.equalsIgnoreCase(name)) {
			return xfr_lot_flg();
		}
		if ($so_prmt_insp_flg.equalsIgnoreCase(name)) {
			return so_prmt_insp_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($def_plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			def_plnt_aprv_role_cd(value);
			return;
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			def_insp_aprv_role_cd(value);
			return;
		}
		if ($def_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			def_mfg_aprv_role_cd(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			ntfy_nm(value);
			return;
		}
		if ($num_id.equalsIgnoreCase(name)) {
			num_id(value);
			return;
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			plnt_aprv_role_cd(value);
			return;
		}
		if ($plnt_aprv_role_nm.equalsIgnoreCase(name)) {
			plnt_aprv_role_nm(value);
			return;
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			insp_aprv_role_cd(value);
			return;
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			insp_aprv_role_nm(value);
			return;
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			mfg_aprv_role_cd(value);
			return;
		}
		if ($mfg_aprv_role_nm.equalsIgnoreCase(name)) {
			mfg_aprv_role_nm(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($def_plnt_aprv_flg.equalsIgnoreCase(name)) {
			def_plnt_aprv_flg(value);
			return;
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			def_insp_aprv_flg(value);
			return;
		}
		if ($def_mfg_aprv_flg.equalsIgnoreCase(name)) {
			def_mfg_aprv_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			insp_aprv_flg(value);
			return;
		}
		if ($mfg_aprv_flg.equalsIgnoreCase(name)) {
			mfg_aprv_flg(value);
			return;
		}
		if ($xfr_lot_flg.equalsIgnoreCase(name)) {
			xfr_lot_flg(value);
			return;
		}
		if ($so_prmt_insp_flg.equalsIgnoreCase(name)) {
			so_prmt_insp_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($def_plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			def_plnt_aprv_role_cd(value);
			return;
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			def_insp_aprv_role_cd(value);
			return;
		}
		if ($def_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			def_mfg_aprv_role_cd(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			ntfy_nm(value);
			return;
		}
		if ($num_id.equalsIgnoreCase(name)) {
			num_id(value);
			return;
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			plnt_aprv_role_cd(value);
			return;
		}
		if ($plnt_aprv_role_nm.equalsIgnoreCase(name)) {
			plnt_aprv_role_nm(value);
			return;
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			insp_aprv_role_cd(value);
			return;
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			insp_aprv_role_nm(value);
			return;
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			mfg_aprv_role_cd(value);
			return;
		}
		if ($mfg_aprv_role_nm.equalsIgnoreCase(name)) {
			mfg_aprv_role_nm(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($def_plnt_aprv_flg.equalsIgnoreCase(name)) {
			def_plnt_aprv_flg(value);
			return;
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			def_insp_aprv_flg(value);
			return;
		}
		if ($def_mfg_aprv_flg.equalsIgnoreCase(name)) {
			def_mfg_aprv_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			insp_aprv_flg(value);
			return;
		}
		if ($mfg_aprv_flg.equalsIgnoreCase(name)) {
			mfg_aprv_flg(value);
			return;
		}
		if ($xfr_lot_flg.equalsIgnoreCase(name)) {
			xfr_lot_flg(value);
			return;
		}
		if ($so_prmt_insp_flg.equalsIgnoreCase(name)) {
			so_prmt_insp_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
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

}

