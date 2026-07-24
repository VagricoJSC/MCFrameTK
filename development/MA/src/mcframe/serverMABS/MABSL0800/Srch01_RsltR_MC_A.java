package mcframe.serverMABS.MABSL0800;

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
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
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
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
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
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * Fluctuation inventory qty. 安全在庫数量.<p>
	 *
	 */
	public static final String $buf_qty = "buf_qty";
	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public static final String $rord_stk_qty = "rord_stk_qty";
	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public static final String $gi_schd_flg = "gi_schd_flg";
	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public static final String $rord_rqst_qty = "rord_rqst_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Lot sizing ロットサイジング.<p>
	 *
	 */
	public static final String $lot_sizing_flg = "lot_sizing_flg";
	/**
	 * GI location at reorder point cd. 発注点出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * GI location at reorder point name 発注点出庫場所名.<p>
	 *
	 */
	public static final String $gi_loc_nm = "gi_loc_nm";
	/**
	 * For GI rack/line at reorder point 発注点出庫棚・ライン対象.<p>
	 *
	 */
	public static final String $gi_str_ln_tgt_flg = "gi_str_ln_tgt_flg";
	/**
	 * GI rack/line at reorder point cd. 発注点出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * GI rack/line at reorder point name 発注点出庫棚・ライン名.<p>
	 *
	 */
	public static final String $gi_str_ln_nm = "gi_str_ln_nm";
	/**
	 * Input item GI location cd. 投入品出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $inpt_gi_loc_cd = "inpt_gi_loc_cd";
	/**
	 * Input item GI location name 投入品出庫場所名.<p>
	 *
	 */
	public static final String $inpt_gi_loc_nm = "inpt_gi_loc_nm";
	/**
	 * For input item GI rack/line 投入品出庫棚・ライン対象.<p>
	 *
	 */
	public static final String $inpt_gi_str_ln_tgt_flg = "inpt_gi_str_ln_tgt_flg";
	/**
	 * Input item GI rack/line cd. 投入品出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $inpt_gi_str_ln_cd = "inpt_gi_str_ln_cd";
	/**
	 * Input item GI rack/line name 投入品出庫棚・ライン名.<p>
	 *
	 */
	public static final String $inpt_gi_str_ln_nm = "inpt_gi_str_ln_nm";
	/**
	 * Shipping item GI location cd. 出荷品出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $ship_gi_loc_cd = "ship_gi_loc_cd";
	/**
	 * Shipping item GI location name 出荷品出庫場所名.<p>
	 *
	 */
	public static final String $ship_gi_loc_nm = "ship_gi_loc_nm";
	/**
	 * For shipping item GI rack/line 出荷品出庫棚・ライン対象.<p>
	 *
	 */
	public static final String $ship_gi_str_ln_tgt_flg = "ship_gi_str_ln_tgt_flg";
	/**
	 * Shipping item GI rack/line cd. 出荷品出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $ship_gi_str_ln_cd = "ship_gi_str_ln_cd";
	/**
	 * Shipping item GI rack/line name 出荷品出庫棚・ライン名.<p>
	 *
	 */
	public static final String $ship_gi_str_ln_nm = "ship_gi_str_ln_nm";
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
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta buf_qty_META = createCommonMeta($buf_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rord_stk_qty_META = createCommonMeta($rord_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_schd_flg_META = createCommonMeta($gi_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rord_rqst_qty_META = createCommonMeta($rord_rqst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta lot_sizing_flg_META = createCommonMeta($lot_sizing_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_loc_nm_META = createCommonMeta($gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gi_str_ln_tgt_flg_META = createCommonMeta($gi_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_str_ln_nm_META = createCommonMeta($gi_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta inpt_gi_loc_cd_META = createCommonMeta($inpt_gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_gi_loc_nm_META = createCommonMeta($inpt_gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta inpt_gi_str_ln_tgt_flg_META = createCommonMeta($inpt_gi_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_gi_str_ln_cd_META = createCommonMeta($inpt_gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta inpt_gi_str_ln_nm_META = createCommonMeta($inpt_gi_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta ship_gi_loc_cd_META = createCommonMeta($ship_gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_gi_loc_nm_META = createCommonMeta($ship_gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta ship_gi_str_ln_tgt_flg_META = createCommonMeta($ship_gi_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_gi_str_ln_cd_META = createCommonMeta($ship_gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta ship_gi_str_ln_nm_META = createCommonMeta($ship_gi_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
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

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			dec_place_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			loc_cd_META,
			loc_nm_META,
			wg_cd_META,
			wg_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			st_dt_META,
			end_dt_META,
			buf_qty_META,
			rord_stk_qty_META,
			gi_schd_flg_META,
			rord_rqst_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			lot_sizing_flg_META,
			gi_loc_cd_META,
			gi_loc_nm_META,
			gi_str_ln_tgt_flg_META,
			gi_str_ln_cd_META,
			gi_str_ln_nm_META,
			inpt_gi_loc_cd_META,
			inpt_gi_loc_nm_META,
			inpt_gi_str_ln_tgt_flg_META,
			inpt_gi_str_ln_cd_META,
			inpt_gi_str_ln_nm_META,
			ship_gi_loc_cd_META,
			ship_gi_loc_nm_META,
			ship_gi_str_ln_tgt_flg_META,
			ship_gi_str_ln_cd_META,
			ship_gi_str_ln_nm_META,
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
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 5, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 5, $itm_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 6, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 6, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 6, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 6, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 6, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 6, $dec_place, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 7, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 7, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 8, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 8, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 9, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 9, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 10, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 10, $itm_typ_d_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 11, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 11, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 12, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 12, $loc_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 13, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 13, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 14, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 14, $wg_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 15, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 15, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 16, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 16, $loc_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 17, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 17, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 18, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 18, $alloc_grp_nm, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 19, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 19, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 20, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 20, $end_dt, value);
	}


	/**
	 * Fluctuation inventory qty. 安全在庫数量.<p>
	 *
	 */
	public MCNumber buf_qty() {
		return getConstNumber(offset + 21, $buf_qty);
	}

	/**
	 * Fluctuation inventory qty. 安全在庫数量.<p>
	 *
	 */
	public void buf_qty(MCNumber value) {
		setConstNumber(offset + 21, $buf_qty, value);
	}

	/**
	 * Fluctuation inventory qty. 安全在庫数量.<p>
	 *
	 */
	public void buf_qty(int value) {
		setConstNumber(offset + 21, $buf_qty, value);
	}

	/**
	 * Fluctuation inventory qty. 安全在庫数量.<p>
	 *
	 */
	public void buf_qty(long value) {
		setConstNumber(offset + 21, $buf_qty, value);
	}

	/**
	 * Fluctuation inventory qty. 安全在庫数量.<p>
	 *
	 */
	public void buf_qty(float value) {
		setConstNumber(offset + 21, $buf_qty, value);
	}

	/**
	 * Fluctuation inventory qty. 安全在庫数量.<p>
	 *
	 */
	public void buf_qty(double value) {
		setConstNumber(offset + 21, $buf_qty, value);
	}


	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public MCNumber rord_stk_qty() {
		return getConstNumber(offset + 22, $rord_stk_qty);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(MCNumber value) {
		setConstNumber(offset + 22, $rord_stk_qty, value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(int value) {
		setConstNumber(offset + 22, $rord_stk_qty, value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(long value) {
		setConstNumber(offset + 22, $rord_stk_qty, value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(float value) {
		setConstNumber(offset + 22, $rord_stk_qty, value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(double value) {
		setConstNumber(offset + 22, $rord_stk_qty, value);
	}


	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public boolean gi_schd_flg() {
		return getConstBoolean(offset + 23, $gi_schd_flg);
	}

	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public void gi_schd_flg(boolean value) {
		setConstBoolean(offset + 23, $gi_schd_flg, value);
	}


	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public MCNumber rord_rqst_qty() {
		return getConstNumber(offset + 24, $rord_rqst_qty);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(MCNumber value) {
		setConstNumber(offset + 24, $rord_rqst_qty, value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(int value) {
		setConstNumber(offset + 24, $rord_rqst_qty, value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(long value) {
		setConstNumber(offset + 24, $rord_rqst_qty, value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(float value) {
		setConstNumber(offset + 24, $rord_rqst_qty, value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(double value) {
		setConstNumber(offset + 24, $rord_rqst_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 25, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 25, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 26, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 26, $base_unit_nm, value);
	}


	/**
	 * Lot sizing ロットサイジング.<p>
	 *
	 */
	public boolean lot_sizing_flg() {
		return getConstBoolean(offset + 27, $lot_sizing_flg);
	}

	/**
	 * Lot sizing ロットサイジング.<p>
	 *
	 */
	public void lot_sizing_flg(boolean value) {
		setConstBoolean(offset + 27, $lot_sizing_flg, value);
	}


	/**
	 * GI location at reorder point cd. 発注点出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 28, $gi_loc_cd);
	}

	/**
	 * GI location at reorder point cd. 発注点出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 28, $gi_loc_cd, value);
	}


	/**
	 * GI location at reorder point name 発注点出庫場所名.<p>
	 *
	 */
	public String gi_loc_nm() {
		return getConstString(offset + 29, $gi_loc_nm);
	}

	/**
	 * GI location at reorder point name 発注点出庫場所名.<p>
	 *
	 */
	public void gi_loc_nm(String value) {
		setConstString(offset + 29, $gi_loc_nm, value);
	}


	/**
	 * For GI rack/line at reorder point 発注点出庫棚・ライン対象.<p>
	 *
	 */
	public boolean gi_str_ln_tgt_flg() {
		return getConstBoolean(offset + 30, $gi_str_ln_tgt_flg);
	}

	/**
	 * For GI rack/line at reorder point 発注点出庫棚・ライン対象.<p>
	 *
	 */
	public void gi_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 30, $gi_str_ln_tgt_flg, value);
	}


	/**
	 * GI rack/line at reorder point cd. 発注点出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 31, $gi_str_ln_cd);
	}

	/**
	 * GI rack/line at reorder point cd. 発注点出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 31, $gi_str_ln_cd, value);
	}


	/**
	 * GI rack/line at reorder point name 発注点出庫棚・ライン名.<p>
	 *
	 */
	public String gi_str_ln_nm() {
		return getConstString(offset + 32, $gi_str_ln_nm);
	}

	/**
	 * GI rack/line at reorder point name 発注点出庫棚・ライン名.<p>
	 *
	 */
	public void gi_str_ln_nm(String value) {
		setConstString(offset + 32, $gi_str_ln_nm, value);
	}


	/**
	 * Input item GI location cd. 投入品出庫場所ＣＤ.<p>
	 *
	 */
	public String inpt_gi_loc_cd() {
		return getConstString(offset + 33, $inpt_gi_loc_cd);
	}

	/**
	 * Input item GI location cd. 投入品出庫場所ＣＤ.<p>
	 *
	 */
	public void inpt_gi_loc_cd(String value) {
		setConstString(offset + 33, $inpt_gi_loc_cd, value);
	}


	/**
	 * Input item GI location name 投入品出庫場所名.<p>
	 *
	 */
	public String inpt_gi_loc_nm() {
		return getConstString(offset + 34, $inpt_gi_loc_nm);
	}

	/**
	 * Input item GI location name 投入品出庫場所名.<p>
	 *
	 */
	public void inpt_gi_loc_nm(String value) {
		setConstString(offset + 34, $inpt_gi_loc_nm, value);
	}


	/**
	 * For input item GI rack/line 投入品出庫棚・ライン対象.<p>
	 *
	 */
	public boolean inpt_gi_str_ln_tgt_flg() {
		return getConstBoolean(offset + 35, $inpt_gi_str_ln_tgt_flg);
	}

	/**
	 * For input item GI rack/line 投入品出庫棚・ライン対象.<p>
	 *
	 */
	public void inpt_gi_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 35, $inpt_gi_str_ln_tgt_flg, value);
	}


	/**
	 * Input item GI rack/line cd. 投入品出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_gi_str_ln_cd() {
		return getConstString(offset + 36, $inpt_gi_str_ln_cd);
	}

	/**
	 * Input item GI rack/line cd. 投入品出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_gi_str_ln_cd(String value) {
		setConstString(offset + 36, $inpt_gi_str_ln_cd, value);
	}


	/**
	 * Input item GI rack/line name 投入品出庫棚・ライン名.<p>
	 *
	 */
	public String inpt_gi_str_ln_nm() {
		return getConstString(offset + 37, $inpt_gi_str_ln_nm);
	}

	/**
	 * Input item GI rack/line name 投入品出庫棚・ライン名.<p>
	 *
	 */
	public void inpt_gi_str_ln_nm(String value) {
		setConstString(offset + 37, $inpt_gi_str_ln_nm, value);
	}


	/**
	 * Shipping item GI location cd. 出荷品出庫場所ＣＤ.<p>
	 *
	 */
	public String ship_gi_loc_cd() {
		return getConstString(offset + 38, $ship_gi_loc_cd);
	}

	/**
	 * Shipping item GI location cd. 出荷品出庫場所ＣＤ.<p>
	 *
	 */
	public void ship_gi_loc_cd(String value) {
		setConstString(offset + 38, $ship_gi_loc_cd, value);
	}


	/**
	 * Shipping item GI location name 出荷品出庫場所名.<p>
	 *
	 */
	public String ship_gi_loc_nm() {
		return getConstString(offset + 39, $ship_gi_loc_nm);
	}

	/**
	 * Shipping item GI location name 出荷品出庫場所名.<p>
	 *
	 */
	public void ship_gi_loc_nm(String value) {
		setConstString(offset + 39, $ship_gi_loc_nm, value);
	}


	/**
	 * For shipping item GI rack/line 出荷品出庫棚・ライン対象.<p>
	 *
	 */
	public boolean ship_gi_str_ln_tgt_flg() {
		return getConstBoolean(offset + 40, $ship_gi_str_ln_tgt_flg);
	}

	/**
	 * For shipping item GI rack/line 出荷品出庫棚・ライン対象.<p>
	 *
	 */
	public void ship_gi_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 40, $ship_gi_str_ln_tgt_flg, value);
	}


	/**
	 * Shipping item GI rack/line cd. 出荷品出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String ship_gi_str_ln_cd() {
		return getConstString(offset + 41, $ship_gi_str_ln_cd);
	}

	/**
	 * Shipping item GI rack/line cd. 出荷品出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void ship_gi_str_ln_cd(String value) {
		setConstString(offset + 41, $ship_gi_str_ln_cd, value);
	}


	/**
	 * Shipping item GI rack/line name 出荷品出庫棚・ライン名.<p>
	 *
	 */
	public String ship_gi_str_ln_nm() {
		return getConstString(offset + 42, $ship_gi_str_ln_nm);
	}

	/**
	 * Shipping item GI rack/line name 出荷品出庫棚・ライン名.<p>
	 *
	 */
	public void ship_gi_str_ln_nm(String value) {
		setConstString(offset + 42, $ship_gi_str_ln_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 43, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 43, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 44, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 44, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 45, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 45, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 46, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 46, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 47, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 47, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 48, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 48, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 49, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 49, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 50, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 50, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 51, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 52, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 52, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 53, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 53, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 54, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 54, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 55, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 55, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 56, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 56, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 57, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 57, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 58, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 58, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 59, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 59, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 60, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 60, $del_ts, value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($inpt_gi_loc_cd.equalsIgnoreCase(name)) {
			return inpt_gi_loc_cd();
		}
		if ($inpt_gi_loc_nm.equalsIgnoreCase(name)) {
			return inpt_gi_loc_nm();
		}
		if ($inpt_gi_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_gi_str_ln_cd();
		}
		if ($inpt_gi_str_ln_nm.equalsIgnoreCase(name)) {
			return inpt_gi_str_ln_nm();
		}
		if ($ship_gi_loc_cd.equalsIgnoreCase(name)) {
			return ship_gi_loc_cd();
		}
		if ($ship_gi_loc_nm.equalsIgnoreCase(name)) {
			return ship_gi_loc_nm();
		}
		if ($ship_gi_str_ln_cd.equalsIgnoreCase(name)) {
			return ship_gi_str_ln_cd();
		}
		if ($ship_gi_str_ln_nm.equalsIgnoreCase(name)) {
			return ship_gi_str_ln_nm();
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
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($buf_qty.equalsIgnoreCase(name)) {
			return buf_qty();
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			return rord_stk_qty();
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			return rord_rqst_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
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
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			return gi_schd_flg();
		}
		if ($lot_sizing_flg.equalsIgnoreCase(name)) {
			return lot_sizing_flg();
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_tgt_flg();
		}
		if ($inpt_gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return inpt_gi_str_ln_tgt_flg();
		}
		if ($ship_gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return ship_gi_str_ln_tgt_flg();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($inpt_gi_loc_cd.equalsIgnoreCase(name)) {
			return inpt_gi_loc_cd();
		}
		if ($inpt_gi_loc_nm.equalsIgnoreCase(name)) {
			return inpt_gi_loc_nm();
		}
		if ($inpt_gi_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_gi_str_ln_cd();
		}
		if ($inpt_gi_str_ln_nm.equalsIgnoreCase(name)) {
			return inpt_gi_str_ln_nm();
		}
		if ($ship_gi_loc_cd.equalsIgnoreCase(name)) {
			return ship_gi_loc_cd();
		}
		if ($ship_gi_loc_nm.equalsIgnoreCase(name)) {
			return ship_gi_loc_nm();
		}
		if ($ship_gi_str_ln_cd.equalsIgnoreCase(name)) {
			return ship_gi_str_ln_cd();
		}
		if ($ship_gi_str_ln_nm.equalsIgnoreCase(name)) {
			return ship_gi_str_ln_nm();
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
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($buf_qty.equalsIgnoreCase(name)) {
			return buf_qty();
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			return rord_stk_qty();
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			return rord_rqst_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
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
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			return gi_schd_flg();
		}
		if ($lot_sizing_flg.equalsIgnoreCase(name)) {
			return lot_sizing_flg();
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_tgt_flg();
		}
		if ($inpt_gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return inpt_gi_str_ln_tgt_flg();
		}
		if ($ship_gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return ship_gi_str_ln_tgt_flg();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
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
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($inpt_gi_loc_cd.equalsIgnoreCase(name)) {
			inpt_gi_loc_cd(value);
			return;
		}
		if ($inpt_gi_loc_nm.equalsIgnoreCase(name)) {
			inpt_gi_loc_nm(value);
			return;
		}
		if ($inpt_gi_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_gi_str_ln_cd(value);
			return;
		}
		if ($inpt_gi_str_ln_nm.equalsIgnoreCase(name)) {
			inpt_gi_str_ln_nm(value);
			return;
		}
		if ($ship_gi_loc_cd.equalsIgnoreCase(name)) {
			ship_gi_loc_cd(value);
			return;
		}
		if ($ship_gi_loc_nm.equalsIgnoreCase(name)) {
			ship_gi_loc_nm(value);
			return;
		}
		if ($ship_gi_str_ln_cd.equalsIgnoreCase(name)) {
			ship_gi_str_ln_cd(value);
			return;
		}
		if ($ship_gi_str_ln_nm.equalsIgnoreCase(name)) {
			ship_gi_str_ln_nm(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
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
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			gi_schd_flg(value);
			return;
		}
		if ($lot_sizing_flg.equalsIgnoreCase(name)) {
			lot_sizing_flg(value);
			return;
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			gi_str_ln_tgt_flg(value);
			return;
		}
		if ($inpt_gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			inpt_gi_str_ln_tgt_flg(value);
			return;
		}
		if ($ship_gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			ship_gi_str_ln_tgt_flg(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
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
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($inpt_gi_loc_cd.equalsIgnoreCase(name)) {
			inpt_gi_loc_cd(value);
			return;
		}
		if ($inpt_gi_loc_nm.equalsIgnoreCase(name)) {
			inpt_gi_loc_nm(value);
			return;
		}
		if ($inpt_gi_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_gi_str_ln_cd(value);
			return;
		}
		if ($inpt_gi_str_ln_nm.equalsIgnoreCase(name)) {
			inpt_gi_str_ln_nm(value);
			return;
		}
		if ($ship_gi_loc_cd.equalsIgnoreCase(name)) {
			ship_gi_loc_cd(value);
			return;
		}
		if ($ship_gi_loc_nm.equalsIgnoreCase(name)) {
			ship_gi_loc_nm(value);
			return;
		}
		if ($ship_gi_str_ln_cd.equalsIgnoreCase(name)) {
			ship_gi_str_ln_cd(value);
			return;
		}
		if ($ship_gi_str_ln_nm.equalsIgnoreCase(name)) {
			ship_gi_str_ln_nm(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
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
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			gi_schd_flg(value);
			return;
		}
		if ($lot_sizing_flg.equalsIgnoreCase(name)) {
			lot_sizing_flg(value);
			return;
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			gi_str_ln_tgt_flg(value);
			return;
		}
		if ($inpt_gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			inpt_gi_str_ln_tgt_flg(value);
			return;
		}
		if ($ship_gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			ship_gi_str_ln_tgt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

