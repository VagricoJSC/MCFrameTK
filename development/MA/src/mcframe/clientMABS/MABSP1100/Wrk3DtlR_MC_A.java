package mcframe.clientMABS.MABSP1100;

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
 * ブロック"Wrk3Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Wrk3DtlR_MC_A extends MCConstRow {

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
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	public static final String $dt_p = "dt_p";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public static final String $oper_lt = "oper_lt";
	public static final String $qty3_p = "qty3_p";
	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public static final String $oper_offst_typ = "oper_offst_typ";
	/**
	 * Operation offset type name 工程オフセット区分名.<p>
	 *
	 */
	public static final String $oper_offst_typ_nm = "oper_offst_typ_nm";
	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public static final String $oper_offst = "oper_offst";
	public static final String $qty4_p = "qty4_p";
	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public static final String $oper_unit_cd = "oper_unit_cd";
	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public static final String $oper_unit_nm = "oper_unit_nm";
	public static final String $qty1_p = "qty1_p";
	public static final String $qty2_p = "qty2_p";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Rounding type (Conversion) 換算端数処理区分.<p>
	 *
	 */
	public static final String $unit_conv_rnd_typ = "unit_conv_rnd_typ";
	/**
	 * Rounding type name (Conversion) 換算端数処理区分名.<p>
	 *
	 */
	public static final String $unit_conv_rnd_typ_nm = "unit_conv_rnd_typ_nm";
	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public static final String $yield_oper_flg = "yield_oper_flg";
	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public static final String $yield_oper_ratio = "yield_oper_ratio";
	/**
	 * Operation order group 工程指図グループ.<p>
	 *
	 */
	public static final String $oper_inst_grp = "oper_inst_grp";
	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public static final String $oper_loc_cd = "oper_loc_cd";
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public static final String $oper_loc_nm = "oper_loc_nm";
	/**
	 * Expiration base date use operation 期限起算日使用工程.<p>
	 *
	 */
	public static final String $lmt_fr_dt_flg = "lmt_fr_dt_flg";
	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public static final String $oper_lower_yield = "oper_lower_yield";
	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public static final String $oper_std_yield = "oper_std_yield";
	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public static final String $oper_upper_yield = "oper_upper_yield";
	/**
	 * WIP progress rate 仕掛進捗率.<p>
	 *
	 */
	public static final String $wip_rate = "wip_rate";
	public static final String $sno_p = "sno_p";
	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public static final String $not_cost_flg = "not_cost_flg";
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
	public static final String $st_dt_key = $dt_p + ".st_dt_key";
	public static final String $st_dt = $dt_p + ".st_dt";
	public static final String $end_dt = $dt_p + ".end_dt";
	public static final String $oper_lt_add_qty = $qty3_p + ".qty";
	public static final String $oper_offst_add_qty = $qty4_p + ".qty";
	public static final String $oper_std_qty = $qty1_p + ".qty";
	public static final String $oper_conv_qty = $qty2_p + ".qty";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta dt_p_META = createInnerRowMeta($dt_p, mcframe.clientMAUB.MAUBP5010.DtR.class);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_lt_META = createCommonMeta($oper_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta qty3_p_META = createInnerRowMeta($qty3_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta oper_offst_typ_META = createCommonMeta($oper_offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta oper_offst_typ_nm_META = createCommonMeta($oper_offst_typ_nm, mcframe.commonMA.meta.MA_META.OFFST_TYP_NM);
	public static final MCMeta oper_offst_META = createCommonMeta($oper_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta qty4_p_META = createInnerRowMeta($qty4_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta qty1_p_META = createInnerRowMeta($qty1_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty2_p_META = createInnerRowMeta($qty2_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unit_conv_rnd_typ_META = createCommonMeta($unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta unit_conv_rnd_typ_nm_META = createCommonMeta($unit_conv_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta yield_oper_flg_META = createCommonMeta($yield_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_oper_ratio_META = createCommonMeta($yield_oper_ratio, mcframe.commonMA.meta.MA_META.YIELD_OPER_RATIO);
	public static final MCMeta oper_inst_grp_META = createCommonMeta($oper_inst_grp, mcframe.commonMA.meta.MA_META.OPER_INST_GRP);
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_loc_nm_META = createCommonMeta($oper_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta lmt_fr_dt_flg_META = createCommonMeta($lmt_fr_dt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_lower_yield_META = createCommonMeta($oper_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_std_yield_META = createCommonMeta($oper_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_upper_yield_META = createCommonMeta($oper_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta wip_rate_META = createCommonMeta($wip_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta not_cost_flg_META = createCommonMeta($not_cost_flg, mcframe.commonMA.meta.MA_META.FLG);
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

	protected static final ConstMetaList<Wrk3DtlR> constMetas = new ConstMetaList<Wrk3DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			del_flg_META,
			itm_p_META,
			loc_cd_META,
			loc_nm_META,
			wg_cd_META,
			wg_nm_META,
			oper_ptn_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			dt_p_META,
			disp_seq_META,
			oper_lt_META,
			qty3_p_META,
			oper_offst_typ_META,
			oper_offst_typ_nm_META,
			oper_offst_META,
			qty4_p_META,
			oper_unit_cd_META,
			oper_unit_nm_META,
			qty1_p_META,
			qty2_p_META,
			dec_place_META,
			unit_conv_rnd_typ_META,
			unit_conv_rnd_typ_nm_META,
			yield_oper_flg_META,
			yield_oper_ratio_META,
			oper_inst_grp_META,
			oper_loc_cd_META,
			oper_loc_nm_META,
			lmt_fr_dt_flg_META,
			oper_lower_yield_META,
			oper_std_yield_META,
			oper_upper_yield_META,
			wip_rate_META,
			sno_p_META,
			not_cost_flg_META,
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
				"st_dt_key",
				"st_dt",
				"end_dt",
				"oper_lt_add_qty",
				"oper_offst_add_qty",
				"oper_std_qty",
				"oper_conv_qty",
				"sno1",
				"sno2",
				"sno3",
				"sno4"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$st_dt_key,
				$st_dt,
				$end_dt,
				$oper_lt_add_qty,
				$oper_offst_add_qty,
				$oper_std_qty,
				$oper_conv_qty,
				$sno1,
				$sno2,
				$sno3,
				$sno4
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
			$loc_cd,	// loc_cd
			$oper_ptn,	// oper_ptn
			$oper_cd,	// oper_cd
			$oper_seq,	// oper_seq
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
				{$oper_offst_typ, "offst_typ_nm"},	// oper_offst_typ
				{$oper_unit_cd, "unit_nm;dec_place;conv_qty;conv_base_qty;rnd_typ"},	// oper_unit_cd
				{$unit_conv_rnd_typ, "rnd_typ_nm"},	// unit_conv_rnd_typ
				{$oper_loc_cd, "loc_nm"}	// oper_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG_HOUSE;true"},	// loc_cd
				{$oper_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE_EQ_WG;wg_cd"}	// oper_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$loc_cd, "loc_is_srch_typ;wr_flg"},	// loc_cd
				{$oper_loc_cd, "loc_is_srch_typ;wg_cd"}	// oper_loc_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$oper_lower_yield, "YIELD"},	// oper_lower_yield
				{$oper_std_yield, "YIELD"},	// oper_std_yield
				{$oper_upper_yield, "YIELD"}	// oper_upper_yield
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
	protected Wrk3DtlR_MC_A(ConstMetaList<? extends Wrk3DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk3DtlR clone() {
		return (Wrk3DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk3DtlR createInstance() {
		return (Wrk3DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk3DtlR getValues(String... names) {
		return (Wrk3DtlR) super.getValues(names);
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
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 3, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 3, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 4, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 4, $loc_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 5, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 5, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 6, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 6, $wg_nm, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 7, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 7, $oper_ptn, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 8, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 8, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 9, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 9, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 10, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 10, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 10, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 10, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 10, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 10, $oper_seq, value);
	}


	public mcframe.clientMAUB.MAUBP5010.DtR dt_p(){
		return (mcframe.clientMAUB.MAUBP5010.DtR) getConstInnerRow(offset + 11, $dt_p);
	}
	
	public void dt_p(mcframe.clientMAUB.MAUBP5010.DtR row){
		setConstInnerRow(offset + 11, $dt_p, row);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 12, $disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 12, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 12, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 12, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 12, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 12, $disp_seq, value);
	}


	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public MCNumber oper_lt() {
		return getConstNumber(offset + 13, $oper_lt);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(MCNumber value) {
		setConstNumber(offset + 13, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(int value) {
		setConstNumber(offset + 13, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(long value) {
		setConstNumber(offset + 13, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(float value) {
		setConstNumber(offset + 13, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(double value) {
		setConstNumber(offset + 13, $oper_lt, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty3_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 14, $qty3_p);
	}
	
	public void qty3_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 14, $qty3_p, row);
	}


	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public String oper_offst_typ() {
		return getConstString(offset + 15, $oper_offst_typ);
	}

	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public void oper_offst_typ(String value) {
		setConstString(offset + 15, $oper_offst_typ, value);
	}


	/**
	 * Operation offset type name 工程オフセット区分名.<p>
	 *
	 */
	public String oper_offst_typ_nm() {
		return getConstString(offset + 16, $oper_offst_typ_nm);
	}

	/**
	 * Operation offset type name 工程オフセット区分名.<p>
	 *
	 */
	public void oper_offst_typ_nm(String value) {
		setConstString(offset + 16, $oper_offst_typ_nm, value);
	}


	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public MCNumber oper_offst() {
		return getConstNumber(offset + 17, $oper_offst);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(MCNumber value) {
		setConstNumber(offset + 17, $oper_offst, value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(int value) {
		setConstNumber(offset + 17, $oper_offst, value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(long value) {
		setConstNumber(offset + 17, $oper_offst, value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(float value) {
		setConstNumber(offset + 17, $oper_offst, value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(double value) {
		setConstNumber(offset + 17, $oper_offst, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty4_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 18, $qty4_p);
	}
	
	public void qty4_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 18, $qty4_p, row);
	}


	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 19, $oper_unit_cd);
	}

	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 19, $oper_unit_cd, value);
	}


	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 20, $oper_unit_nm);
	}

	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 20, $oper_unit_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty1_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 21, $qty1_p);
	}
	
	public void qty1_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 21, $qty1_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty2_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 22, $qty2_p);
	}
	
	public void qty2_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 22, $qty2_p, row);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 23, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 23, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 23, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 23, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 23, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 23, $dec_place, value);
	}


	/**
	 * Rounding type (Conversion) 換算端数処理区分.<p>
	 *
	 */
	public String unit_conv_rnd_typ() {
		return getConstString(offset + 24, $unit_conv_rnd_typ);
	}

	/**
	 * Rounding type (Conversion) 換算端数処理区分.<p>
	 *
	 */
	public void unit_conv_rnd_typ(String value) {
		setConstString(offset + 24, $unit_conv_rnd_typ, value);
	}


	/**
	 * Rounding type name (Conversion) 換算端数処理区分名.<p>
	 *
	 */
	public String unit_conv_rnd_typ_nm() {
		return getConstString(offset + 25, $unit_conv_rnd_typ_nm);
	}

	/**
	 * Rounding type name (Conversion) 換算端数処理区分名.<p>
	 *
	 */
	public void unit_conv_rnd_typ_nm(String value) {
		setConstString(offset + 25, $unit_conv_rnd_typ_nm, value);
	}


	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return getConstBoolean(offset + 26, $yield_oper_flg);
	}

	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		setConstBoolean(offset + 26, $yield_oper_flg, value);
	}


	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public MCNumber yield_oper_ratio() {
		return getConstNumber(offset + 27, $yield_oper_ratio);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(MCNumber value) {
		setConstNumber(offset + 27, $yield_oper_ratio, value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(int value) {
		setConstNumber(offset + 27, $yield_oper_ratio, value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(long value) {
		setConstNumber(offset + 27, $yield_oper_ratio, value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(float value) {
		setConstNumber(offset + 27, $yield_oper_ratio, value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(double value) {
		setConstNumber(offset + 27, $yield_oper_ratio, value);
	}


	/**
	 * Operation order group 工程指図グループ.<p>
	 *
	 */
	public String oper_inst_grp() {
		return getConstString(offset + 28, $oper_inst_grp);
	}

	/**
	 * Operation order group 工程指図グループ.<p>
	 *
	 */
	public void oper_inst_grp(String value) {
		setConstString(offset + 28, $oper_inst_grp, value);
	}


	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 29, $oper_loc_cd);
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 29, $oper_loc_cd, value);
	}


	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public String oper_loc_nm() {
		return getConstString(offset + 30, $oper_loc_nm);
	}

	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public void oper_loc_nm(String value) {
		setConstString(offset + 30, $oper_loc_nm, value);
	}


	/**
	 * Expiration base date use operation 期限起算日使用工程.<p>
	 *
	 */
	public boolean lmt_fr_dt_flg() {
		return getConstBoolean(offset + 31, $lmt_fr_dt_flg);
	}

	/**
	 * Expiration base date use operation 期限起算日使用工程.<p>
	 *
	 */
	public void lmt_fr_dt_flg(boolean value) {
		setConstBoolean(offset + 31, $lmt_fr_dt_flg, value);
	}


	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public MCNumber oper_lower_yield() {
		return getConstNumber(offset + 32, $oper_lower_yield);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(MCNumber value) {
		setConstNumber(offset + 32, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(int value) {
		setConstNumber(offset + 32, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(long value) {
		setConstNumber(offset + 32, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(float value) {
		setConstNumber(offset + 32, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(double value) {
		setConstNumber(offset + 32, $oper_lower_yield, value);
	}


	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public MCNumber oper_std_yield() {
		return getConstNumber(offset + 33, $oper_std_yield);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(MCNumber value) {
		setConstNumber(offset + 33, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(int value) {
		setConstNumber(offset + 33, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(long value) {
		setConstNumber(offset + 33, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(float value) {
		setConstNumber(offset + 33, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(double value) {
		setConstNumber(offset + 33, $oper_std_yield, value);
	}


	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public MCNumber oper_upper_yield() {
		return getConstNumber(offset + 34, $oper_upper_yield);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(MCNumber value) {
		setConstNumber(offset + 34, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(int value) {
		setConstNumber(offset + 34, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(long value) {
		setConstNumber(offset + 34, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(float value) {
		setConstNumber(offset + 34, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(double value) {
		setConstNumber(offset + 34, $oper_upper_yield, value);
	}


	/**
	 * WIP progress rate 仕掛進捗率.<p>
	 *
	 */
	public MCNumber wip_rate() {
		return getConstNumber(offset + 35, $wip_rate);
	}

	/**
	 * WIP progress rate 仕掛進捗率.<p>
	 *
	 */
	public void wip_rate(MCNumber value) {
		setConstNumber(offset + 35, $wip_rate, value);
	}

	/**
	 * WIP progress rate 仕掛進捗率.<p>
	 *
	 */
	public void wip_rate(int value) {
		setConstNumber(offset + 35, $wip_rate, value);
	}

	/**
	 * WIP progress rate 仕掛進捗率.<p>
	 *
	 */
	public void wip_rate(long value) {
		setConstNumber(offset + 35, $wip_rate, value);
	}

	/**
	 * WIP progress rate 仕掛進捗率.<p>
	 *
	 */
	public void wip_rate(float value) {
		setConstNumber(offset + 35, $wip_rate, value);
	}

	/**
	 * WIP progress rate 仕掛進捗率.<p>
	 *
	 */
	public void wip_rate(double value) {
		setConstNumber(offset + 35, $wip_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 36, $sno_p);
	}
	
	public void sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 36, $sno_p, row);
	}


	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public boolean not_cost_flg() {
		return getConstBoolean(offset + 37, $not_cost_flg);
	}

	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public void not_cost_flg(boolean value) {
		setConstBoolean(offset + 37, $not_cost_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 38, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 38, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 39, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 39, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 40, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 40, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 41, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 41, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 42, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 42, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 43, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 43, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 44, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 44, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 45, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 45, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 46, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 47, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 47, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 48, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 48, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 49, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 49, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 50, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 50, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 51, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 51, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 52, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 52, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 53, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 53, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 54, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 54, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 55, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 55, $del_ts, value);
	}


	public String getString(String name) {
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			return oper_offst_typ_nm();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ();
		}
		if ($unit_conv_rnd_typ_nm.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ_nm();
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			return oper_inst_grp();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			return oper_lt();
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			return oper_offst();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			return yield_oper_ratio();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			return wip_rate();
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
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			return lmt_fr_dt_flg();
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			return not_cost_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			return oper_offst_typ_nm();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ();
		}
		if ($unit_conv_rnd_typ_nm.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ_nm();
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			return oper_inst_grp();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			return oper_lt();
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			return oper_offst();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			return yield_oper_ratio();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			return wip_rate();
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
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			return lmt_fr_dt_flg();
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			return not_cost_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			oper_offst_typ_nm(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unit_conv_rnd_typ(value);
			return;
		}
		if ($unit_conv_rnd_typ_nm.equalsIgnoreCase(name)) {
			unit_conv_rnd_typ_nm(value);
			return;
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			oper_inst_grp(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
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
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			lmt_fr_dt_flg(value);
			return;
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			not_cost_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			oper_offst_typ_nm(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unit_conv_rnd_typ(value);
			return;
		}
		if ($unit_conv_rnd_typ_nm.equalsIgnoreCase(name)) {
			unit_conv_rnd_typ_nm(value);
			return;
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			oper_inst_grp(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
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
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($lmt_fr_dt_flg.equalsIgnoreCase(name)) {
			lmt_fr_dt_flg(value);
			return;
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			not_cost_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($dt_p.equalsIgnoreCase(name)) {
			return dt_p();
		}
		if ($qty3_p.equalsIgnoreCase(name)) {
			return qty3_p();
		}
		if ($qty4_p.equalsIgnoreCase(name)) {
			return qty4_p();
		}
		if ($qty1_p.equalsIgnoreCase(name)) {
			return qty1_p();
		}
		if ($qty2_p.equalsIgnoreCase(name)) {
			return qty2_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
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
		if ($dt_p.equalsIgnoreCase(name)) {
			dt_p(
				((MCContainerMeta) dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5010.DtR.class, value)
			);
			return;
		}
		if ($qty3_p.equalsIgnoreCase(name)) {
			qty3_p(
				((MCContainerMeta) qty3_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty4_p.equalsIgnoreCase(name)) {
			qty4_p(
				((MCContainerMeta) qty4_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
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

	public MCDate st_dt_key() {
		return dt_p().st_dt_key();
	}

	public void st_dt_key(MCDate value) {
		dt_p().st_dt_key(value);
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
	 * Operation LT add base qty. 工程ＬＴ加算基準数量.<p>
	 *
	 */
	public MCNumber oper_lt_add_qty() {
		return qty3_p().qty();
	}

	/**
	 * Operation LT add base qty. 工程ＬＴ加算基準数量.<p>
	 *
	 */
	public void oper_lt_add_qty(MCNumber value) {
		qty3_p().qty(value);
	}

	/**
	 * Operation LT add base qty. 工程ＬＴ加算基準数量.<p>
	 *
	 */
	public void oper_lt_add_qty(int value) {
		qty3_p().qty(value);
	}

	/**
	 * Operation LT add base qty. 工程ＬＴ加算基準数量.<p>
	 *
	 */
	public void oper_lt_add_qty(long value) {
		qty3_p().qty(value);
	}

	/**
	 * Operation LT add base qty. 工程ＬＴ加算基準数量.<p>
	 *
	 */
	public void oper_lt_add_qty(float value) {
		qty3_p().qty(value);
	}

	/**
	 * Operation LT add base qty. 工程ＬＴ加算基準数量.<p>
	 *
	 */
	public void oper_lt_add_qty(double value) {
		qty3_p().qty(value);
	}

	/**
	 * Operation offset add base qty. 工程オフセット加算基準数量.<p>
	 *
	 */
	public MCNumber oper_offst_add_qty() {
		return qty4_p().qty();
	}

	/**
	 * Operation offset add base qty. 工程オフセット加算基準数量.<p>
	 *
	 */
	public void oper_offst_add_qty(MCNumber value) {
		qty4_p().qty(value);
	}

	/**
	 * Operation offset add base qty. 工程オフセット加算基準数量.<p>
	 *
	 */
	public void oper_offst_add_qty(int value) {
		qty4_p().qty(value);
	}

	/**
	 * Operation offset add base qty. 工程オフセット加算基準数量.<p>
	 *
	 */
	public void oper_offst_add_qty(long value) {
		qty4_p().qty(value);
	}

	/**
	 * Operation offset add base qty. 工程オフセット加算基準数量.<p>
	 *
	 */
	public void oper_offst_add_qty(float value) {
		qty4_p().qty(value);
	}

	/**
	 * Operation offset add base qty. 工程オフセット加算基準数量.<p>
	 *
	 */
	public void oper_offst_add_qty(double value) {
		qty4_p().qty(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return qty1_p().qty();
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		qty1_p().qty(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(int value) {
		qty1_p().qty(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(long value) {
		qty1_p().qty(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(float value) {
		qty1_p().qty(value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(double value) {
		qty1_p().qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return qty2_p().qty();
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		qty2_p().qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		qty2_p().qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		qty2_p().qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		qty2_p().qty(value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		qty2_p().qty(value);
	}

	public String sno1() {
		return sno_p().sno1();
	}

	public void sno1(String value) {
		sno_p().sno1(value);
	}

	public String sno2() {
		return sno_p().sno2();
	}

	public void sno2(String value) {
		sno_p().sno2(value);
	}

	public String sno3() {
		return sno_p().sno3();
	}

	public void sno3(String value) {
		sno_p().sno3(value);
	}

	public String sno4() {
		return sno_p().sno4();
	}

	public void sno4(String value) {
		sno_p().sno4(value);
	}

}

