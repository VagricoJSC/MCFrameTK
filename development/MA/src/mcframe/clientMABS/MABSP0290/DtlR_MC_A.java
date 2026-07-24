package mcframe.clientMABS.MABSP0290;

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
	public static final String $core_itm_p = "core_itm_p";
	/**
	 * Main item type 主品目区分.<p>
	 *
	 */
	public static final String $core_itm_typ = "core_itm_typ";
	/**
	 * Main item type name 主品目区分名.<p>
	 *
	 */
	public static final String $core_itm_typ_nm = "core_itm_typ_nm";
	/**
	 * Main item type details cd. 主品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $core_itm_typ_d_cd = "core_itm_typ_d_cd";
	/**
	 * Main item type details name 主品目区分詳細名.<p>
	 *
	 */
	public static final String $core_itm_typ_d_nm = "core_itm_typ_d_nm";
	/**
	 * Main item unit cd. 主品目単位ＣＤ.<p>
	 *
	 */
	public static final String $core_itm_unit_cd = "core_itm_unit_cd";
	/**
	 * Main item unit name 主品目単位名.<p>
	 *
	 */
	public static final String $core_itm_unit_nm = "core_itm_unit_nm";
	/**
	 * Main item number of decimal places 主品目小数部有効桁数.<p>
	 *
	 */
	public static final String $core_itm_dec_place = "core_itm_dec_place";
	public static final String $core_qty_p = "core_qty_p";
	public static final String $comp_itm_p = "comp_itm_p";
	/**
	 * Component item type 構成品目区分.<p>
	 *
	 */
	public static final String $comp_itm_typ = "comp_itm_typ";
	/**
	 * Component item type name 構成品目区分名.<p>
	 *
	 */
	public static final String $comp_itm_typ_nm = "comp_itm_typ_nm";
	/**
	 * Component item type details cd. 構成品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $comp_itm_typ_d_cd = "comp_itm_typ_d_cd";
	/**
	 * Component item type details name 構成品目区分詳細名.<p>
	 *
	 */
	public static final String $comp_itm_typ_d_nm = "comp_itm_typ_d_nm";
	/**
	 * Component item unit cd. 構成品目単位ＣＤ.<p>
	 *
	 */
	public static final String $comp_itm_unit_cd = "comp_itm_unit_cd";
	/**
	 * Component item unit name 構成品目単位名.<p>
	 *
	 */
	public static final String $comp_itm_unit_nm = "comp_itm_unit_nm";
	/**
	 * Component item number of decimal places 構成品目小数部有効桁数.<p>
	 *
	 */
	public static final String $comp_itm_dec_place = "comp_itm_dec_place";
	public static final String $comp_qty_p = "comp_qty_p";
	/**
	 * Item configuration group cd. 品目構成グループＣＤ.<p>
	 *
	 */
	public static final String $itm_comp_grp_cd = "itm_comp_grp_cd";
	/**
	 * Item configuration group name 品目構成グループ名.<p>
	 *
	 */
	public static final String $itm_comp_grp_nm = "itm_comp_grp_nm";
	/**
	 * Normal configuration 通常構成.<p>
	 *
	 */
	public static final String $def_flg = "def_flg";
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

	public static final String $core_itm_cd = $core_itm_p + ".itm_cd";
	public static final String $core_itm_sub1 = $core_itm_p + ".itm_sub1";
	public static final String $core_itm_sub2 = $core_itm_p + ".itm_sub2";
	public static final String $core_itm_sub3 = $core_itm_p + ".itm_sub3";
	public static final String $core_itm_nm = $core_itm_p + ".itm_nm";
	public static final String $core_itm_qty = $core_qty_p + ".qty";
	public static final String $comp_itm_cd = $comp_itm_p + ".itm_cd";
	public static final String $comp_itm_sub1 = $comp_itm_p + ".itm_sub1";
	public static final String $comp_itm_sub2 = $comp_itm_p + ".itm_sub2";
	public static final String $comp_itm_sub3 = $comp_itm_p + ".itm_sub3";
	public static final String $comp_itm_nm = $comp_itm_p + ".itm_nm";
	public static final String $comp_itm_qty = $comp_qty_p + ".qty";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta core_itm_p_META = createInnerRowMeta($core_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta core_itm_typ_META = createCommonMeta($core_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta core_itm_typ_nm_META = createCommonMeta($core_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta core_itm_typ_d_cd_META = createCommonMeta($core_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta core_itm_typ_d_nm_META = createCommonMeta($core_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta core_itm_unit_cd_META = createCommonMeta($core_itm_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta core_itm_unit_nm_META = createCommonMeta($core_itm_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta core_itm_dec_place_META = createCommonMeta($core_itm_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta core_qty_p_META = createInnerRowMeta($core_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta comp_itm_p_META = createInnerRowMeta($comp_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta comp_itm_typ_META = createCommonMeta($comp_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta comp_itm_typ_nm_META = createCommonMeta($comp_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta comp_itm_typ_d_cd_META = createCommonMeta($comp_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta comp_itm_typ_d_nm_META = createCommonMeta($comp_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta comp_itm_unit_cd_META = createCommonMeta($comp_itm_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta comp_itm_unit_nm_META = createCommonMeta($comp_itm_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta comp_itm_dec_place_META = createCommonMeta($comp_itm_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta comp_qty_p_META = createInnerRowMeta($comp_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta itm_comp_grp_cd_META = createCommonMeta($itm_comp_grp_cd, mcframe.commonMA.meta.MA_META.ITM_COMP_GRP_CD);
	public static final MCMeta itm_comp_grp_nm_META = createCommonMeta($itm_comp_grp_nm, mcframe.commonMA.meta.MA_META.ITM_COMP_GRP_NM);
	public static final MCMeta def_flg_META = createCommonMeta($def_flg, mcframe.commonMA.meta.MA_META.FLG);
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
			core_itm_p_META,
			core_itm_typ_META,
			core_itm_typ_nm_META,
			core_itm_typ_d_cd_META,
			core_itm_typ_d_nm_META,
			core_itm_unit_cd_META,
			core_itm_unit_nm_META,
			core_itm_dec_place_META,
			core_qty_p_META,
			comp_itm_p_META,
			comp_itm_typ_META,
			comp_itm_typ_nm_META,
			comp_itm_typ_d_cd_META,
			comp_itm_typ_d_nm_META,
			comp_itm_unit_cd_META,
			comp_itm_unit_nm_META,
			comp_itm_dec_place_META,
			comp_qty_p_META,
			itm_comp_grp_cd_META,
			itm_comp_grp_nm_META,
			def_flg_META,
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
				"core_itm_cd",
				"core_itm_sub1",
				"core_itm_sub2",
				"core_itm_sub3",
				"core_itm_nm",
				"core_itm_qty",
				"comp_itm_cd",
				"comp_itm_sub1",
				"comp_itm_sub2",
				"comp_itm_sub3",
				"comp_itm_nm",
				"comp_itm_qty"
			},
			{
				$core_itm_cd,
				$core_itm_sub1,
				$core_itm_sub2,
				$core_itm_sub3,
				$core_itm_nm,
				$core_itm_qty,
				$comp_itm_cd,
				$comp_itm_sub1,
				$comp_itm_sub2,
				$comp_itm_sub3,
				$comp_itm_nm,
				$comp_itm_qty
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$core_itm_p + ".itm_cd",	// core_itm_p.itm_cd
			$core_itm_p + ".itm_sub1",	// core_itm_p.itm_sub1
			$core_itm_p + ".itm_sub2",	// core_itm_p.itm_sub2
			$core_itm_p + ".itm_sub3",	// core_itm_p.itm_sub3
			$comp_itm_p + ".itm_cd",	// comp_itm_p.itm_cd
			$comp_itm_p + ".itm_sub1",	// comp_itm_p.itm_sub1
			$comp_itm_p + ".itm_sub2",	// comp_itm_p.itm_sub2
			$comp_itm_p + ".itm_sub3"	// comp_itm_p.itm_sub3
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
				{$core_itm_p + ".itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;ship_unit_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// core_itm_p.itm_cd
				{$core_itm_p + ".itm_sub1", "itm_sub2;itm_sub3;itm_nm;ship_unit_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// core_itm_p.itm_sub1
				{$core_itm_p + ".itm_sub2", "itm_sub3;itm_nm;ship_unit_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// core_itm_p.itm_sub2
				{$core_itm_p + ".itm_sub3", "itm_nm;ship_unit_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// core_itm_p.itm_sub3
				{$core_itm_unit_cd, "unit_nm;dec_place"},	// core_itm_unit_cd
				{$comp_itm_p + ".itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;unit_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// comp_itm_p.itm_cd
				{$comp_itm_p + ".itm_sub1", "itm_sub2;itm_sub3;itm_nm;unit_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// comp_itm_p.itm_sub1
				{$comp_itm_p + ".itm_sub2", "itm_sub3;itm_nm;unit_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// comp_itm_p.itm_sub2
				{$comp_itm_p + ".itm_sub3", "itm_nm;unit_cd;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm"},	// comp_itm_p.itm_sub3
				{$comp_itm_unit_cd, "unit_nm;dec_place"}	// comp_itm_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$core_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.COMP_CORE_ITM"},	// core_itm_p.itm_cd
				{$core_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.COMP_CORE_ITM;core_itm_cd"},	// core_itm_p.itm_sub1
				{$core_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.COMP_CORE_ITM;core_itm_cd;core_itm_sub1"},	// core_itm_p.itm_sub2
				{$core_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.COMP_CORE_ITM;core_itm_cd;core_itm_sub1;core_itm_sub2"},	// core_itm_p.itm_sub3
				{$core_itm_unit_cd, "core_itm_cd;core_itm_sub1;core_itm_sub2;core_itm_sub3"},	// core_itm_unit_cd
				{$comp_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// comp_itm_p.itm_cd
				{$comp_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;comp_itm_cd"},	// comp_itm_p.itm_sub1
				{$comp_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;comp_itm_cd;comp_itm_sub1"},	// comp_itm_p.itm_sub2
				{$comp_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;comp_itm_cd;comp_itm_sub1;comp_itm_sub2"},	// comp_itm_p.itm_sub3
				{$comp_itm_unit_cd, "comp_itm_cd;comp_itm_sub1;comp_itm_sub2;comp_itm_sub3"}	// comp_itm_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$core_itm_p + ".itm_cd", "itm_is_srch_typ"},	// core_itm_p.itm_cd
				{$core_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// core_itm_p.itm_sub1
				{$core_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// core_itm_p.itm_sub2
				{$core_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// core_itm_p.itm_sub3
				{$core_itm_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// core_itm_unit_cd
				{$comp_itm_p + ".itm_cd", "itm_is_srch_typ"},	// comp_itm_p.itm_cd
				{$comp_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// comp_itm_p.itm_sub1
				{$comp_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// comp_itm_p.itm_sub2
				{$comp_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// comp_itm_p.itm_sub3
				{$comp_itm_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// comp_itm_unit_cd
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


	public mcframe.clientMAUB.MAUBP5030.ItmR core_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 2, $core_itm_p);
	}
	
	public void core_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 2, $core_itm_p, row);
	}


	/**
	 * Main item type 主品目区分.<p>
	 *
	 */
	public String core_itm_typ() {
		return getConstString(offset + 3, $core_itm_typ);
	}

	/**
	 * Main item type 主品目区分.<p>
	 *
	 */
	public void core_itm_typ(String value) {
		setConstString(offset + 3, $core_itm_typ, value);
	}


	/**
	 * Main item type name 主品目区分名.<p>
	 *
	 */
	public String core_itm_typ_nm() {
		return getConstString(offset + 4, $core_itm_typ_nm);
	}

	/**
	 * Main item type name 主品目区分名.<p>
	 *
	 */
	public void core_itm_typ_nm(String value) {
		setConstString(offset + 4, $core_itm_typ_nm, value);
	}


	/**
	 * Main item type details cd. 主品目区分詳細ＣＤ.<p>
	 *
	 */
	public String core_itm_typ_d_cd() {
		return getConstString(offset + 5, $core_itm_typ_d_cd);
	}

	/**
	 * Main item type details cd. 主品目区分詳細ＣＤ.<p>
	 *
	 */
	public void core_itm_typ_d_cd(String value) {
		setConstString(offset + 5, $core_itm_typ_d_cd, value);
	}


	/**
	 * Main item type details name 主品目区分詳細名.<p>
	 *
	 */
	public String core_itm_typ_d_nm() {
		return getConstString(offset + 6, $core_itm_typ_d_nm);
	}

	/**
	 * Main item type details name 主品目区分詳細名.<p>
	 *
	 */
	public void core_itm_typ_d_nm(String value) {
		setConstString(offset + 6, $core_itm_typ_d_nm, value);
	}


	/**
	 * Main item unit cd. 主品目単位ＣＤ.<p>
	 *
	 */
	public String core_itm_unit_cd() {
		return getConstString(offset + 7, $core_itm_unit_cd);
	}

	/**
	 * Main item unit cd. 主品目単位ＣＤ.<p>
	 *
	 */
	public void core_itm_unit_cd(String value) {
		setConstString(offset + 7, $core_itm_unit_cd, value);
	}


	/**
	 * Main item unit name 主品目単位名.<p>
	 *
	 */
	public String core_itm_unit_nm() {
		return getConstString(offset + 8, $core_itm_unit_nm);
	}

	/**
	 * Main item unit name 主品目単位名.<p>
	 *
	 */
	public void core_itm_unit_nm(String value) {
		setConstString(offset + 8, $core_itm_unit_nm, value);
	}


	/**
	 * Main item number of decimal places 主品目小数部有効桁数.<p>
	 *
	 */
	public MCNumber core_itm_dec_place() {
		return getConstNumber(offset + 9, $core_itm_dec_place);
	}

	/**
	 * Main item number of decimal places 主品目小数部有効桁数.<p>
	 *
	 */
	public void core_itm_dec_place(MCNumber value) {
		setConstNumber(offset + 9, $core_itm_dec_place, value);
	}

	/**
	 * Main item number of decimal places 主品目小数部有効桁数.<p>
	 *
	 */
	public void core_itm_dec_place(int value) {
		setConstNumber(offset + 9, $core_itm_dec_place, value);
	}

	/**
	 * Main item number of decimal places 主品目小数部有効桁数.<p>
	 *
	 */
	public void core_itm_dec_place(long value) {
		setConstNumber(offset + 9, $core_itm_dec_place, value);
	}

	/**
	 * Main item number of decimal places 主品目小数部有効桁数.<p>
	 *
	 */
	public void core_itm_dec_place(float value) {
		setConstNumber(offset + 9, $core_itm_dec_place, value);
	}

	/**
	 * Main item number of decimal places 主品目小数部有効桁数.<p>
	 *
	 */
	public void core_itm_dec_place(double value) {
		setConstNumber(offset + 9, $core_itm_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR core_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 10, $core_qty_p);
	}
	
	public void core_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 10, $core_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR comp_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 11, $comp_itm_p);
	}
	
	public void comp_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 11, $comp_itm_p, row);
	}


	/**
	 * Component item type 構成品目区分.<p>
	 *
	 */
	public String comp_itm_typ() {
		return getConstString(offset + 12, $comp_itm_typ);
	}

	/**
	 * Component item type 構成品目区分.<p>
	 *
	 */
	public void comp_itm_typ(String value) {
		setConstString(offset + 12, $comp_itm_typ, value);
	}


	/**
	 * Component item type name 構成品目区分名.<p>
	 *
	 */
	public String comp_itm_typ_nm() {
		return getConstString(offset + 13, $comp_itm_typ_nm);
	}

	/**
	 * Component item type name 構成品目区分名.<p>
	 *
	 */
	public void comp_itm_typ_nm(String value) {
		setConstString(offset + 13, $comp_itm_typ_nm, value);
	}


	/**
	 * Component item type details cd. 構成品目区分詳細ＣＤ.<p>
	 *
	 */
	public String comp_itm_typ_d_cd() {
		return getConstString(offset + 14, $comp_itm_typ_d_cd);
	}

	/**
	 * Component item type details cd. 構成品目区分詳細ＣＤ.<p>
	 *
	 */
	public void comp_itm_typ_d_cd(String value) {
		setConstString(offset + 14, $comp_itm_typ_d_cd, value);
	}


	/**
	 * Component item type details name 構成品目区分詳細名.<p>
	 *
	 */
	public String comp_itm_typ_d_nm() {
		return getConstString(offset + 15, $comp_itm_typ_d_nm);
	}

	/**
	 * Component item type details name 構成品目区分詳細名.<p>
	 *
	 */
	public void comp_itm_typ_d_nm(String value) {
		setConstString(offset + 15, $comp_itm_typ_d_nm, value);
	}


	/**
	 * Component item unit cd. 構成品目単位ＣＤ.<p>
	 *
	 */
	public String comp_itm_unit_cd() {
		return getConstString(offset + 16, $comp_itm_unit_cd);
	}

	/**
	 * Component item unit cd. 構成品目単位ＣＤ.<p>
	 *
	 */
	public void comp_itm_unit_cd(String value) {
		setConstString(offset + 16, $comp_itm_unit_cd, value);
	}


	/**
	 * Component item unit name 構成品目単位名.<p>
	 *
	 */
	public String comp_itm_unit_nm() {
		return getConstString(offset + 17, $comp_itm_unit_nm);
	}

	/**
	 * Component item unit name 構成品目単位名.<p>
	 *
	 */
	public void comp_itm_unit_nm(String value) {
		setConstString(offset + 17, $comp_itm_unit_nm, value);
	}


	/**
	 * Component item number of decimal places 構成品目小数部有効桁数.<p>
	 *
	 */
	public MCNumber comp_itm_dec_place() {
		return getConstNumber(offset + 18, $comp_itm_dec_place);
	}

	/**
	 * Component item number of decimal places 構成品目小数部有効桁数.<p>
	 *
	 */
	public void comp_itm_dec_place(MCNumber value) {
		setConstNumber(offset + 18, $comp_itm_dec_place, value);
	}

	/**
	 * Component item number of decimal places 構成品目小数部有効桁数.<p>
	 *
	 */
	public void comp_itm_dec_place(int value) {
		setConstNumber(offset + 18, $comp_itm_dec_place, value);
	}

	/**
	 * Component item number of decimal places 構成品目小数部有効桁数.<p>
	 *
	 */
	public void comp_itm_dec_place(long value) {
		setConstNumber(offset + 18, $comp_itm_dec_place, value);
	}

	/**
	 * Component item number of decimal places 構成品目小数部有効桁数.<p>
	 *
	 */
	public void comp_itm_dec_place(float value) {
		setConstNumber(offset + 18, $comp_itm_dec_place, value);
	}

	/**
	 * Component item number of decimal places 構成品目小数部有効桁数.<p>
	 *
	 */
	public void comp_itm_dec_place(double value) {
		setConstNumber(offset + 18, $comp_itm_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR comp_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 19, $comp_qty_p);
	}
	
	public void comp_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 19, $comp_qty_p, row);
	}


	/**
	 * Item configuration group cd. 品目構成グループＣＤ.<p>
	 *
	 */
	public String itm_comp_grp_cd() {
		return getConstString(offset + 20, $itm_comp_grp_cd);
	}

	/**
	 * Item configuration group cd. 品目構成グループＣＤ.<p>
	 *
	 */
	public void itm_comp_grp_cd(String value) {
		setConstString(offset + 20, $itm_comp_grp_cd, value);
	}


	/**
	 * Item configuration group name 品目構成グループ名.<p>
	 *
	 */
	public String itm_comp_grp_nm() {
		return getConstString(offset + 21, $itm_comp_grp_nm);
	}

	/**
	 * Item configuration group name 品目構成グループ名.<p>
	 *
	 */
	public void itm_comp_grp_nm(String value) {
		setConstString(offset + 21, $itm_comp_grp_nm, value);
	}


	/**
	 * Normal configuration 通常構成.<p>
	 *
	 */
	public boolean def_flg() {
		return getConstBoolean(offset + 22, $def_flg);
	}

	/**
	 * Normal configuration 通常構成.<p>
	 *
	 */
	public void def_flg(boolean value) {
		setConstBoolean(offset + 22, $def_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 23, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 23, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 24, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 24, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 25, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 25, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 26, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 26, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 27, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 27, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 28, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 28, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 29, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 29, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 30, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 30, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 31, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 32, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 32, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 33, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 33, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 34, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 34, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 35, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 35, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 36, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 36, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 37, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 37, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 38, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 38, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 39, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 39, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 40, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 40, $del_ts, value);
	}


	public String getString(String name) {
		if ($core_itm_typ.equalsIgnoreCase(name)) {
			return core_itm_typ();
		}
		if ($core_itm_typ_nm.equalsIgnoreCase(name)) {
			return core_itm_typ_nm();
		}
		if ($core_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return core_itm_typ_d_cd();
		}
		if ($core_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return core_itm_typ_d_nm();
		}
		if ($core_itm_unit_cd.equalsIgnoreCase(name)) {
			return core_itm_unit_cd();
		}
		if ($core_itm_unit_nm.equalsIgnoreCase(name)) {
			return core_itm_unit_nm();
		}
		if ($comp_itm_typ.equalsIgnoreCase(name)) {
			return comp_itm_typ();
		}
		if ($comp_itm_typ_nm.equalsIgnoreCase(name)) {
			return comp_itm_typ_nm();
		}
		if ($comp_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return comp_itm_typ_d_cd();
		}
		if ($comp_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return comp_itm_typ_d_nm();
		}
		if ($comp_itm_unit_cd.equalsIgnoreCase(name)) {
			return comp_itm_unit_cd();
		}
		if ($comp_itm_unit_nm.equalsIgnoreCase(name)) {
			return comp_itm_unit_nm();
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			return itm_comp_grp_cd();
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			return itm_comp_grp_nm();
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
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			return core_itm_dec_place();
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			return comp_itm_dec_place();
		}
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
		if ($def_flg.equalsIgnoreCase(name)) {
			return def_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($core_itm_typ.equalsIgnoreCase(name)) {
			return core_itm_typ();
		}
		if ($core_itm_typ_nm.equalsIgnoreCase(name)) {
			return core_itm_typ_nm();
		}
		if ($core_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return core_itm_typ_d_cd();
		}
		if ($core_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return core_itm_typ_d_nm();
		}
		if ($core_itm_unit_cd.equalsIgnoreCase(name)) {
			return core_itm_unit_cd();
		}
		if ($core_itm_unit_nm.equalsIgnoreCase(name)) {
			return core_itm_unit_nm();
		}
		if ($comp_itm_typ.equalsIgnoreCase(name)) {
			return comp_itm_typ();
		}
		if ($comp_itm_typ_nm.equalsIgnoreCase(name)) {
			return comp_itm_typ_nm();
		}
		if ($comp_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return comp_itm_typ_d_cd();
		}
		if ($comp_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return comp_itm_typ_d_nm();
		}
		if ($comp_itm_unit_cd.equalsIgnoreCase(name)) {
			return comp_itm_unit_cd();
		}
		if ($comp_itm_unit_nm.equalsIgnoreCase(name)) {
			return comp_itm_unit_nm();
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			return itm_comp_grp_cd();
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			return itm_comp_grp_nm();
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
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			return core_itm_dec_place();
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			return comp_itm_dec_place();
		}
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
		if ($def_flg.equalsIgnoreCase(name)) {
			return def_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($core_itm_typ.equalsIgnoreCase(name)) {
			core_itm_typ(value);
			return;
		}
		if ($core_itm_typ_nm.equalsIgnoreCase(name)) {
			core_itm_typ_nm(value);
			return;
		}
		if ($core_itm_typ_d_cd.equalsIgnoreCase(name)) {
			core_itm_typ_d_cd(value);
			return;
		}
		if ($core_itm_typ_d_nm.equalsIgnoreCase(name)) {
			core_itm_typ_d_nm(value);
			return;
		}
		if ($core_itm_unit_cd.equalsIgnoreCase(name)) {
			core_itm_unit_cd(value);
			return;
		}
		if ($core_itm_unit_nm.equalsIgnoreCase(name)) {
			core_itm_unit_nm(value);
			return;
		}
		if ($comp_itm_typ.equalsIgnoreCase(name)) {
			comp_itm_typ(value);
			return;
		}
		if ($comp_itm_typ_nm.equalsIgnoreCase(name)) {
			comp_itm_typ_nm(value);
			return;
		}
		if ($comp_itm_typ_d_cd.equalsIgnoreCase(name)) {
			comp_itm_typ_d_cd(value);
			return;
		}
		if ($comp_itm_typ_d_nm.equalsIgnoreCase(name)) {
			comp_itm_typ_d_nm(value);
			return;
		}
		if ($comp_itm_unit_cd.equalsIgnoreCase(name)) {
			comp_itm_unit_cd(value);
			return;
		}
		if ($comp_itm_unit_nm.equalsIgnoreCase(name)) {
			comp_itm_unit_nm(value);
			return;
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			itm_comp_grp_cd(value);
			return;
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			itm_comp_grp_nm(value);
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
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
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
		if ($def_flg.equalsIgnoreCase(name)) {
			def_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($core_itm_typ.equalsIgnoreCase(name)) {
			core_itm_typ(value);
			return;
		}
		if ($core_itm_typ_nm.equalsIgnoreCase(name)) {
			core_itm_typ_nm(value);
			return;
		}
		if ($core_itm_typ_d_cd.equalsIgnoreCase(name)) {
			core_itm_typ_d_cd(value);
			return;
		}
		if ($core_itm_typ_d_nm.equalsIgnoreCase(name)) {
			core_itm_typ_d_nm(value);
			return;
		}
		if ($core_itm_unit_cd.equalsIgnoreCase(name)) {
			core_itm_unit_cd(value);
			return;
		}
		if ($core_itm_unit_nm.equalsIgnoreCase(name)) {
			core_itm_unit_nm(value);
			return;
		}
		if ($comp_itm_typ.equalsIgnoreCase(name)) {
			comp_itm_typ(value);
			return;
		}
		if ($comp_itm_typ_nm.equalsIgnoreCase(name)) {
			comp_itm_typ_nm(value);
			return;
		}
		if ($comp_itm_typ_d_cd.equalsIgnoreCase(name)) {
			comp_itm_typ_d_cd(value);
			return;
		}
		if ($comp_itm_typ_d_nm.equalsIgnoreCase(name)) {
			comp_itm_typ_d_nm(value);
			return;
		}
		if ($comp_itm_unit_cd.equalsIgnoreCase(name)) {
			comp_itm_unit_cd(value);
			return;
		}
		if ($comp_itm_unit_nm.equalsIgnoreCase(name)) {
			comp_itm_unit_nm(value);
			return;
		}
		if ($itm_comp_grp_cd.equalsIgnoreCase(name)) {
			itm_comp_grp_cd(value);
			return;
		}
		if ($itm_comp_grp_nm.equalsIgnoreCase(name)) {
			itm_comp_grp_nm(value);
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
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($core_itm_dec_place.equalsIgnoreCase(name)) {
			core_itm_dec_place(value);
			return;
		}
		if ($comp_itm_dec_place.equalsIgnoreCase(name)) {
			comp_itm_dec_place(value);
			return;
		}
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
		if ($def_flg.equalsIgnoreCase(name)) {
			def_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($core_itm_p.equalsIgnoreCase(name)) {
			return core_itm_p();
		}
		if ($core_qty_p.equalsIgnoreCase(name)) {
			return core_qty_p();
		}
		if ($comp_itm_p.equalsIgnoreCase(name)) {
			return comp_itm_p();
		}
		if ($comp_qty_p.equalsIgnoreCase(name)) {
			return comp_qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($core_itm_p.equalsIgnoreCase(name)) {
			core_itm_p(
				((MCContainerMeta) core_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($core_qty_p.equalsIgnoreCase(name)) {
			core_qty_p(
				((MCContainerMeta) core_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($comp_itm_p.equalsIgnoreCase(name)) {
			comp_itm_p(
				((MCContainerMeta) comp_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($comp_qty_p.equalsIgnoreCase(name)) {
			comp_qty_p(
				((MCContainerMeta) comp_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Main item cd. 主品目ＣＤ.<p>
	 *
	 */
	public String core_itm_cd() {
		return core_itm_p().itm_cd();
	}

	/**
	 * Main item cd. 主品目ＣＤ.<p>
	 *
	 */
	public void core_itm_cd(String value) {
		core_itm_p().itm_cd(value);
	}

	/**
	 * Main branch No. 1 主枝番１.<p>
	 *
	 */
	public String core_itm_sub1() {
		return core_itm_p().itm_sub1();
	}

	/**
	 * Main branch No. 1 主枝番１.<p>
	 *
	 */
	public void core_itm_sub1(String value) {
		core_itm_p().itm_sub1(value);
	}

	/**
	 * Main branch No. 2 主枝番２.<p>
	 *
	 */
	public String core_itm_sub2() {
		return core_itm_p().itm_sub2();
	}

	/**
	 * Main branch No. 2 主枝番２.<p>
	 *
	 */
	public void core_itm_sub2(String value) {
		core_itm_p().itm_sub2(value);
	}

	/**
	 * Main branch No. 3 主枝番３.<p>
	 *
	 */
	public String core_itm_sub3() {
		return core_itm_p().itm_sub3();
	}

	/**
	 * Main branch No. 3 主枝番３.<p>
	 *
	 */
	public void core_itm_sub3(String value) {
		core_itm_p().itm_sub3(value);
	}

	/**
	 * Main item name 主品名.<p>
	 *
	 */
	public String core_itm_nm() {
		return core_itm_p().itm_nm();
	}

	/**
	 * Main item name 主品名.<p>
	 *
	 */
	public void core_itm_nm(String value) {
		core_itm_p().itm_nm(value);
	}

	/**
	 * Main item qty. 主品目数量.<p>
	 *
	 */
	public MCNumber core_itm_qty() {
		return core_qty_p().qty();
	}

	/**
	 * Main item qty. 主品目数量.<p>
	 *
	 */
	public void core_itm_qty(MCNumber value) {
		core_qty_p().qty(value);
	}

	/**
	 * Main item qty. 主品目数量.<p>
	 *
	 */
	public void core_itm_qty(int value) {
		core_qty_p().qty(value);
	}

	/**
	 * Main item qty. 主品目数量.<p>
	 *
	 */
	public void core_itm_qty(long value) {
		core_qty_p().qty(value);
	}

	/**
	 * Main item qty. 主品目数量.<p>
	 *
	 */
	public void core_itm_qty(float value) {
		core_qty_p().qty(value);
	}

	/**
	 * Main item qty. 主品目数量.<p>
	 *
	 */
	public void core_itm_qty(double value) {
		core_qty_p().qty(value);
	}

	/**
	 * Component item cd. 構成品目ＣＤ.<p>
	 *
	 */
	public String comp_itm_cd() {
		return comp_itm_p().itm_cd();
	}

	/**
	 * Component item cd. 構成品目ＣＤ.<p>
	 *
	 */
	public void comp_itm_cd(String value) {
		comp_itm_p().itm_cd(value);
	}

	/**
	 * Configuration branch 1 構成枝番１.<p>
	 *
	 */
	public String comp_itm_sub1() {
		return comp_itm_p().itm_sub1();
	}

	/**
	 * Configuration branch 1 構成枝番１.<p>
	 *
	 */
	public void comp_itm_sub1(String value) {
		comp_itm_p().itm_sub1(value);
	}

	/**
	 * Configuration branch 2 構成枝番２.<p>
	 *
	 */
	public String comp_itm_sub2() {
		return comp_itm_p().itm_sub2();
	}

	/**
	 * Configuration branch 2 構成枝番２.<p>
	 *
	 */
	public void comp_itm_sub2(String value) {
		comp_itm_p().itm_sub2(value);
	}

	/**
	 * Configuration branch 3 構成枝番３.<p>
	 *
	 */
	public String comp_itm_sub3() {
		return comp_itm_p().itm_sub3();
	}

	/**
	 * Configuration branch 3 構成枝番３.<p>
	 *
	 */
	public void comp_itm_sub3(String value) {
		comp_itm_p().itm_sub3(value);
	}

	/**
	 * Component name 構成品名.<p>
	 *
	 */
	public String comp_itm_nm() {
		return comp_itm_p().itm_nm();
	}

	/**
	 * Component name 構成品名.<p>
	 *
	 */
	public void comp_itm_nm(String value) {
		comp_itm_p().itm_nm(value);
	}

	/**
	 * Component item qty. 構成品目数量.<p>
	 *
	 */
	public MCNumber comp_itm_qty() {
		return comp_qty_p().qty();
	}

	/**
	 * Component item qty. 構成品目数量.<p>
	 *
	 */
	public void comp_itm_qty(MCNumber value) {
		comp_qty_p().qty(value);
	}

	/**
	 * Component item qty. 構成品目数量.<p>
	 *
	 */
	public void comp_itm_qty(int value) {
		comp_qty_p().qty(value);
	}

	/**
	 * Component item qty. 構成品目数量.<p>
	 *
	 */
	public void comp_itm_qty(long value) {
		comp_qty_p().qty(value);
	}

	/**
	 * Component item qty. 構成品目数量.<p>
	 *
	 */
	public void comp_itm_qty(float value) {
		comp_qty_p().qty(value);
	}

	/**
	 * Component item qty. 構成品目数量.<p>
	 *
	 */
	public void comp_itm_qty(double value) {
		comp_qty_p().qty(value);
	}

}

