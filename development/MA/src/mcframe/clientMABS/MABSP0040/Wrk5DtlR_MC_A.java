package mcframe.clientMABS.MABSP0040;

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
 * ブロック"Wrk5Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Wrk5DtlR_MC_A extends MCConstRow {

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	public static final String $Itm_p = "Itm_p";
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
	public static final String $dt_p = "dt_p";
	public static final String $qty1_p = "qty1_p";
	public static final String $qty2_p = "qty2_p";
	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public static final String $gi_schd_flg = "gi_schd_flg";
	public static final String $qty3_p = "qty3_p";
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
	public static final String $str_ln1_p = "str_ln1_p";
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
	public static final String $str_ln2_p = "str_ln2_p";
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
	public static final String $str_ln3_p = "str_ln3_p";
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

	public static final String $itm_cd = $Itm_p + ".itm_cd";
	public static final String $itm_sub1 = $Itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $Itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $Itm_p + ".itm_sub3";
	public static final String $itm_nm = $Itm_p + ".itm_nm";
	public static final String $st_dt = $dt_p + ".st_dt";
	public static final String $end_dt = $dt_p + ".end_dt";
	public static final String $buf_qty = $qty1_p + ".qty";
	public static final String $rord_stk_qty = $qty2_p + ".qty";
	public static final String $rord_rqst_qty = $qty3_p + ".qty";
	public static final String $gi_str_ln_cd = $str_ln1_p + ".str_ln_cd";
	public static final String $gi_str_ln_nm = $str_ln1_p + ".str_ln_nm";
	public static final String $gi_str_ln_cd_none_flg = $str_ln1_p + ".str_ln_cd_none_flg";
	public static final String $inpt_gi_str_ln_cd = $str_ln2_p + ".str_ln_cd";
	public static final String $inpt_gi_str_ln_nm = $str_ln2_p + ".str_ln_nm";
	public static final String $inpt_gi_str_ln_cd_none_flg = $str_ln2_p + ".str_ln_cd_none_flg";
	public static final String $ship_gi_str_ln_cd = $str_ln3_p + ".str_ln_cd";
	public static final String $ship_gi_str_ln_nm = $str_ln3_p + ".str_ln_nm";
	public static final String $ship_gi_str_ln_cd_none_flg = $str_ln3_p + ".str_ln_cd_none_flg";

	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta Itm_p_META = createInnerRowMeta($Itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dt_p_META = createInnerRowMeta($dt_p, mcframe.clientMAUB.MAUBP5010.DtR.class);
	public static final MCMeta qty1_p_META = createInnerRowMeta($qty1_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty2_p_META = createInnerRowMeta($qty2_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gi_schd_flg_META = createCommonMeta($gi_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qty3_p_META = createInnerRowMeta($qty3_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta lot_sizing_flg_META = createCommonMeta($lot_sizing_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_loc_nm_META = createCommonMeta($gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gi_str_ln_tgt_flg_META = createCommonMeta($gi_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln1_p_META = createInnerRowMeta($str_ln1_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta inpt_gi_loc_cd_META = createCommonMeta($inpt_gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_gi_loc_nm_META = createCommonMeta($inpt_gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta inpt_gi_str_ln_tgt_flg_META = createCommonMeta($inpt_gi_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln2_p_META = createInnerRowMeta($str_ln2_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta ship_gi_loc_cd_META = createCommonMeta($ship_gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_gi_loc_nm_META = createCommonMeta($ship_gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta ship_gi_str_ln_tgt_flg_META = createCommonMeta($ship_gi_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln3_p_META = createInnerRowMeta($str_ln3_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
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

	protected static final ConstMetaList<Wrk5DtlR> constMetas = new ConstMetaList<Wrk5DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			Itm_p_META,
			dec_place_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			loc_cd_META,
			loc_nm_META,
			wg_cd_META,
			wg_nm_META,
			dt_p_META,
			qty1_p_META,
			qty2_p_META,
			gi_schd_flg_META,
			qty3_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			lot_sizing_flg_META,
			gi_loc_cd_META,
			gi_loc_nm_META,
			gi_str_ln_tgt_flg_META,
			str_ln1_p_META,
			inpt_gi_loc_cd_META,
			inpt_gi_loc_nm_META,
			inpt_gi_str_ln_tgt_flg_META,
			str_ln2_p_META,
			ship_gi_loc_cd_META,
			ship_gi_loc_nm_META,
			ship_gi_str_ln_tgt_flg_META,
			str_ln3_p_META,
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
				"itm_nm",
				"st_dt",
				"end_dt",
				"buf_qty",
				"rord_stk_qty",
				"rord_rqst_qty",
				"gi_str_ln_cd",
				"gi_str_ln_nm",
				"gi_str_ln_cd_none_flg",
				"inpt_gi_str_ln_cd",
				"inpt_gi_str_ln_nm",
				"inpt_gi_str_ln_cd_none_flg",
				"ship_gi_str_ln_cd",
				"ship_gi_str_ln_nm",
				"ship_gi_str_ln_cd_none_flg"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$st_dt,
				$end_dt,
				$buf_qty,
				$rord_stk_qty,
				$rord_rqst_qty,
				$gi_str_ln_cd,
				$gi_str_ln_nm,
				$gi_str_ln_cd_none_flg,
				$inpt_gi_str_ln_cd,
				$inpt_gi_str_ln_nm,
				$inpt_gi_str_ln_cd_none_flg,
				$ship_gi_str_ln_cd,
				$ship_gi_str_ln_nm,
				$ship_gi_str_ln_cd_none_flg
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$Itm_p + ".itm_cd",	// Itm_p.itm_cd
			$Itm_p + ".itm_sub1",	// Itm_p.itm_sub1
			$Itm_p + ".itm_sub2",	// Itm_p.itm_sub2
			$Itm_p + ".itm_sub3",	// Itm_p.itm_sub3
			$loc_cd,	// loc_cd
			$dt_p + ".st_dt"	// dt_p.st_dt
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
				{$gi_loc_cd, "loc_nm;str_ln_tgt_flg"},	// gi_loc_cd
				{$inpt_gi_loc_cd, "loc_nm;str_ln_tgt_flg"},	// inpt_gi_loc_cd
				{$ship_gi_loc_cd, "loc_nm;str_ln_tgt_flg"}	// ship_gi_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$gi_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE_EQ_WG;wg_cd"},	// gi_loc_cd
				{$inpt_gi_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE;loc_grp_cd"},	// inpt_gi_loc_cd
				{$ship_gi_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE;alloc_grp_cd"}	// ship_gi_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$gi_loc_cd, "loc_is_srch_typ;wg_cd"},	// gi_loc_cd
				{$inpt_gi_loc_cd, "loc_is_srch_typ;loc_grp_cd"},	// inpt_gi_loc_cd
				{$ship_gi_loc_cd, "loc_is_srch_typ;alloc_grp_cd"}	// ship_gi_loc_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	protected Wrk5DtlR_MC_A(ConstMetaList<? extends Wrk5DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk5DtlR clone() {
		return (Wrk5DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk5DtlR createInstance() {
		return (Wrk5DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk5DtlR getValues(String... names) {
		return (Wrk5DtlR) super.getValues(names);
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


	public mcframe.clientMAUB.MAUBP5030.ItmR Itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 1, $Itm_p);
	}
	
	public void Itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 1, $Itm_p, row);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 2, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 2, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 2, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 2, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 2, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 2, $dec_place, value);
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
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 7, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 7, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 8, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 8, $loc_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 9, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 9, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 10, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 10, $wg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5010.DtR dt_p(){
		return (mcframe.clientMAUB.MAUBP5010.DtR) getConstInnerRow(offset + 11, $dt_p);
	}
	
	public void dt_p(mcframe.clientMAUB.MAUBP5010.DtR row){
		setConstInnerRow(offset + 11, $dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty1_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 12, $qty1_p);
	}
	
	public void qty1_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 12, $qty1_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty2_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 13, $qty2_p);
	}
	
	public void qty2_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 13, $qty2_p, row);
	}


	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public boolean gi_schd_flg() {
		return getConstBoolean(offset + 14, $gi_schd_flg);
	}

	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public void gi_schd_flg(boolean value) {
		setConstBoolean(offset + 14, $gi_schd_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty3_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 15, $qty3_p);
	}
	
	public void qty3_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 15, $qty3_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 16, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 16, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 17, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 17, $base_unit_nm, value);
	}


	/**
	 * Lot sizing ロットサイジング.<p>
	 *
	 */
	public boolean lot_sizing_flg() {
		return getConstBoolean(offset + 18, $lot_sizing_flg);
	}

	/**
	 * Lot sizing ロットサイジング.<p>
	 *
	 */
	public void lot_sizing_flg(boolean value) {
		setConstBoolean(offset + 18, $lot_sizing_flg, value);
	}


	/**
	 * GI location at reorder point cd. 発注点出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 19, $gi_loc_cd);
	}

	/**
	 * GI location at reorder point cd. 発注点出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 19, $gi_loc_cd, value);
	}


	/**
	 * GI location at reorder point name 発注点出庫場所名.<p>
	 *
	 */
	public String gi_loc_nm() {
		return getConstString(offset + 20, $gi_loc_nm);
	}

	/**
	 * GI location at reorder point name 発注点出庫場所名.<p>
	 *
	 */
	public void gi_loc_nm(String value) {
		setConstString(offset + 20, $gi_loc_nm, value);
	}


	/**
	 * For GI rack/line at reorder point 発注点出庫棚・ライン対象.<p>
	 *
	 */
	public boolean gi_str_ln_tgt_flg() {
		return getConstBoolean(offset + 21, $gi_str_ln_tgt_flg);
	}

	/**
	 * For GI rack/line at reorder point 発注点出庫棚・ライン対象.<p>
	 *
	 */
	public void gi_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 21, $gi_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR str_ln1_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 22, $str_ln1_p);
	}
	
	public void str_ln1_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 22, $str_ln1_p, row);
	}


	/**
	 * Input item GI location cd. 投入品出庫場所ＣＤ.<p>
	 *
	 */
	public String inpt_gi_loc_cd() {
		return getConstString(offset + 23, $inpt_gi_loc_cd);
	}

	/**
	 * Input item GI location cd. 投入品出庫場所ＣＤ.<p>
	 *
	 */
	public void inpt_gi_loc_cd(String value) {
		setConstString(offset + 23, $inpt_gi_loc_cd, value);
	}


	/**
	 * Input item GI location name 投入品出庫場所名.<p>
	 *
	 */
	public String inpt_gi_loc_nm() {
		return getConstString(offset + 24, $inpt_gi_loc_nm);
	}

	/**
	 * Input item GI location name 投入品出庫場所名.<p>
	 *
	 */
	public void inpt_gi_loc_nm(String value) {
		setConstString(offset + 24, $inpt_gi_loc_nm, value);
	}


	/**
	 * For input item GI rack/line 投入品出庫棚・ライン対象.<p>
	 *
	 */
	public boolean inpt_gi_str_ln_tgt_flg() {
		return getConstBoolean(offset + 25, $inpt_gi_str_ln_tgt_flg);
	}

	/**
	 * For input item GI rack/line 投入品出庫棚・ライン対象.<p>
	 *
	 */
	public void inpt_gi_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 25, $inpt_gi_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR str_ln2_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 26, $str_ln2_p);
	}
	
	public void str_ln2_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 26, $str_ln2_p, row);
	}


	/**
	 * Shipping item GI location cd. 出荷品出庫場所ＣＤ.<p>
	 *
	 */
	public String ship_gi_loc_cd() {
		return getConstString(offset + 27, $ship_gi_loc_cd);
	}

	/**
	 * Shipping item GI location cd. 出荷品出庫場所ＣＤ.<p>
	 *
	 */
	public void ship_gi_loc_cd(String value) {
		setConstString(offset + 27, $ship_gi_loc_cd, value);
	}


	/**
	 * Shipping item GI location name 出荷品出庫場所名.<p>
	 *
	 */
	public String ship_gi_loc_nm() {
		return getConstString(offset + 28, $ship_gi_loc_nm);
	}

	/**
	 * Shipping item GI location name 出荷品出庫場所名.<p>
	 *
	 */
	public void ship_gi_loc_nm(String value) {
		setConstString(offset + 28, $ship_gi_loc_nm, value);
	}


	/**
	 * For shipping item GI rack/line 出荷品出庫棚・ライン対象.<p>
	 *
	 */
	public boolean ship_gi_str_ln_tgt_flg() {
		return getConstBoolean(offset + 29, $ship_gi_str_ln_tgt_flg);
	}

	/**
	 * For shipping item GI rack/line 出荷品出庫棚・ライン対象.<p>
	 *
	 */
	public void ship_gi_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 29, $ship_gi_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR str_ln3_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 30, $str_ln3_p);
	}
	
	public void str_ln3_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 30, $str_ln3_p, row);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 31, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 31, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 32, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 32, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 33, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 33, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 34, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 34, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 35, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 35, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 36, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 36, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 37, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 37, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 38, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 38, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 39, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 40, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 40, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 41, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 41, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 42, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 42, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 43, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 43, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 44, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 44, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 45, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 45, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 46, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 46, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 47, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 47, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 48, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 48, $del_ts, value);
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
		if ($inpt_gi_loc_cd.equalsIgnoreCase(name)) {
			return inpt_gi_loc_cd();
		}
		if ($inpt_gi_loc_nm.equalsIgnoreCase(name)) {
			return inpt_gi_loc_nm();
		}
		if ($ship_gi_loc_cd.equalsIgnoreCase(name)) {
			return ship_gi_loc_cd();
		}
		if ($ship_gi_loc_nm.equalsIgnoreCase(name)) {
			return ship_gi_loc_nm();
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
		if ($inpt_gi_loc_cd.equalsIgnoreCase(name)) {
			return inpt_gi_loc_cd();
		}
		if ($inpt_gi_loc_nm.equalsIgnoreCase(name)) {
			return inpt_gi_loc_nm();
		}
		if ($ship_gi_loc_cd.equalsIgnoreCase(name)) {
			return ship_gi_loc_cd();
		}
		if ($ship_gi_loc_nm.equalsIgnoreCase(name)) {
			return ship_gi_loc_nm();
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
		if ($inpt_gi_loc_cd.equalsIgnoreCase(name)) {
			inpt_gi_loc_cd(value);
			return;
		}
		if ($inpt_gi_loc_nm.equalsIgnoreCase(name)) {
			inpt_gi_loc_nm(value);
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
		if ($inpt_gi_loc_cd.equalsIgnoreCase(name)) {
			inpt_gi_loc_cd(value);
			return;
		}
		if ($inpt_gi_loc_nm.equalsIgnoreCase(name)) {
			inpt_gi_loc_nm(value);
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

	public MCRow getInnerRow(String name) {
		if ($Itm_p.equalsIgnoreCase(name)) {
			return Itm_p();
		}
		if ($dt_p.equalsIgnoreCase(name)) {
			return dt_p();
		}
		if ($qty1_p.equalsIgnoreCase(name)) {
			return qty1_p();
		}
		if ($qty2_p.equalsIgnoreCase(name)) {
			return qty2_p();
		}
		if ($qty3_p.equalsIgnoreCase(name)) {
			return qty3_p();
		}
		if ($str_ln1_p.equalsIgnoreCase(name)) {
			return str_ln1_p();
		}
		if ($str_ln2_p.equalsIgnoreCase(name)) {
			return str_ln2_p();
		}
		if ($str_ln3_p.equalsIgnoreCase(name)) {
			return str_ln3_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($Itm_p.equalsIgnoreCase(name)) {
			Itm_p(
				((MCContainerMeta) Itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($dt_p.equalsIgnoreCase(name)) {
			dt_p(
				((MCContainerMeta) dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5010.DtR.class, value)
			);
			return;
		}
		if ($qty1_p.equalsIgnoreCase(name)) {
			qty1_p(
				((MCContainerMeta) qty1_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty2_p.equalsIgnoreCase(name)) {
			qty2_p(
				((MCContainerMeta) qty2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty3_p.equalsIgnoreCase(name)) {
			qty3_p(
				((MCContainerMeta) qty3_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($str_ln1_p.equalsIgnoreCase(name)) {
			str_ln1_p(
				((MCContainerMeta) str_ln1_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($str_ln2_p.equalsIgnoreCase(name)) {
			str_ln2_p(
				((MCContainerMeta) str_ln2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($str_ln3_p.equalsIgnoreCase(name)) {
			str_ln3_p(
				((MCContainerMeta) str_ln3_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_cd() {
		return Itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		Itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return Itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		Itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return Itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		Itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return Itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		Itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return Itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		Itm_p().itm_nm(value);
	}

	public MCDate st_dt() {
		return dt_p().st_dt();
	}

	public void st_dt(MCDate value) {
		dt_p().st_dt(value);
	}

	public MCDate end_dt() {
		return dt_p().end_dt();
	}

	public void end_dt(MCDate value) {
		dt_p().end_dt(value);
	}

	/**
	 * Fluctuation inventory qty. 安全在庫数量.<p>
	 *
	 */
	public MCNumber buf_qty() {
		return qty1_p().qty();
	}

	/**
	 * Fluctuation inventory qty. 安全在庫数量.<p>
	 *
	 */
	public void buf_qty(MCNumber value) {
		qty1_p().qty(value);
	}

	/**
	 * Fluctuation inventory qty. 安全在庫数量.<p>
	 *
	 */
	public void buf_qty(int value) {
		qty1_p().qty(value);
	}

	/**
	 * Fluctuation inventory qty. 安全在庫数量.<p>
	 *
	 */
	public void buf_qty(long value) {
		qty1_p().qty(value);
	}

	/**
	 * Fluctuation inventory qty. 安全在庫数量.<p>
	 *
	 */
	public void buf_qty(float value) {
		qty1_p().qty(value);
	}

	/**
	 * Fluctuation inventory qty. 安全在庫数量.<p>
	 *
	 */
	public void buf_qty(double value) {
		qty1_p().qty(value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public MCNumber rord_stk_qty() {
		return qty2_p().qty();
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(MCNumber value) {
		qty2_p().qty(value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(int value) {
		qty2_p().qty(value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(long value) {
		qty2_p().qty(value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(float value) {
		qty2_p().qty(value);
	}

	/**
	 * Reorder point inventory qty. 発注点在庫数量.<p>
	 *
	 */
	public void rord_stk_qty(double value) {
		qty2_p().qty(value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public MCNumber rord_rqst_qty() {
		return qty3_p().qty();
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(MCNumber value) {
		qty3_p().qty(value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(int value) {
		qty3_p().qty(value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(long value) {
		qty3_p().qty(value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(float value) {
		qty3_p().qty(value);
	}

	/**
	 * Reorder point request qty. 発注点依頼数量.<p>
	 *
	 */
	public void rord_rqst_qty(double value) {
		qty3_p().qty(value);
	}

	/**
	 * GI rack/line at reorder point cd. 発注点出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return str_ln1_p().str_ln_cd();
	}

	/**
	 * GI rack/line at reorder point cd. 発注点出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		str_ln1_p().str_ln_cd(value);
	}

	/**
	 * GI rack/line at reorder point name 発注点出庫棚・ライン名.<p>
	 *
	 */
	public String gi_str_ln_nm() {
		return str_ln1_p().str_ln_nm();
	}

	/**
	 * GI rack/line at reorder point name 発注点出庫棚・ライン名.<p>
	 *
	 */
	public void gi_str_ln_nm(String value) {
		str_ln1_p().str_ln_nm(value);
	}

	/**
	 * Without line ライン無.<p>
	 *
	 */
	public boolean gi_str_ln_cd_none_flg() {
		return str_ln1_p().str_ln_cd_none_flg();
	}

	/**
	 * Without line ライン無.<p>
	 *
	 */
	public void gi_str_ln_cd_none_flg(boolean value) {
		str_ln1_p().str_ln_cd_none_flg(value);
	}

	/**
	 * Input item GI rack/line cd. 投入品出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_gi_str_ln_cd() {
		return str_ln2_p().str_ln_cd();
	}

	/**
	 * Input item GI rack/line cd. 投入品出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_gi_str_ln_cd(String value) {
		str_ln2_p().str_ln_cd(value);
	}

	/**
	 * Input item GI rack/line name 投入品出庫棚・ライン名.<p>
	 *
	 */
	public String inpt_gi_str_ln_nm() {
		return str_ln2_p().str_ln_nm();
	}

	/**
	 * Input item GI rack/line name 投入品出庫棚・ライン名.<p>
	 *
	 */
	public void inpt_gi_str_ln_nm(String value) {
		str_ln2_p().str_ln_nm(value);
	}

	/**
	 * Without line ライン無.<p>
	 *
	 */
	public boolean inpt_gi_str_ln_cd_none_flg() {
		return str_ln2_p().str_ln_cd_none_flg();
	}

	/**
	 * Without line ライン無.<p>
	 *
	 */
	public void inpt_gi_str_ln_cd_none_flg(boolean value) {
		str_ln2_p().str_ln_cd_none_flg(value);
	}

	/**
	 * Shipping item GI rack/line cd. 出荷品出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String ship_gi_str_ln_cd() {
		return str_ln3_p().str_ln_cd();
	}

	/**
	 * Shipping item GI rack/line cd. 出荷品出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void ship_gi_str_ln_cd(String value) {
		str_ln3_p().str_ln_cd(value);
	}

	/**
	 * Shipping item GI rack/line name 出荷品出庫棚・ライン名.<p>
	 *
	 */
	public String ship_gi_str_ln_nm() {
		return str_ln3_p().str_ln_nm();
	}

	/**
	 * Shipping item GI rack/line name 出荷品出庫棚・ライン名.<p>
	 *
	 */
	public void ship_gi_str_ln_nm(String value) {
		str_ln3_p().str_ln_nm(value);
	}

	/**
	 * Without line ライン無.<p>
	 *
	 */
	public boolean ship_gi_str_ln_cd_none_flg() {
		return str_ln3_p().str_ln_cd_none_flg();
	}

	/**
	 * Without line ライン無.<p>
	 *
	 */
	public void ship_gi_str_ln_cd_none_flg(boolean value) {
		str_ln3_p().str_ln_cd_none_flg(value);
	}

}

