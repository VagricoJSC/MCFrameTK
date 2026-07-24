package mcframe.clientMABS.MABSP1110;

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
 * ブロック"Wrk1Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Wrk1DtlR_MC_A extends MCConstRow {

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
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	public static final String $dt_p = "dt_p";
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public static final String $purc_id_typ_nm = "purc_id_typ_nm";
	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public static final String $purc_lt = "purc_lt";
	public static final String $purc_lt_add_qty_p = "purc_lt_add_qty_p";
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public static final String $purc_basis_typ = "purc_basis_typ";
	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public static final String $purc_basis_typ_nm = "purc_basis_typ_nm";
	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public static final String $accpt_insp_lt = "accpt_insp_lt";
	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public static final String $buf_lt = "buf_lt";
	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public static final String $ord_fix_pd = "ord_fix_pd";
	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public static final String $sz_day_week_typ = "sz_day_week_typ";
	/**
	 * Aggregation (by day of week) type name 曜日まとめ区分名.<p>
	 *
	 */
	public static final String $sz_day_week_typ_nm = "sz_day_week_typ_nm";
	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public static final String $sz_week = "sz_week";
	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public static final String $lot_sz_pd = "lot_sz_pd";
	public static final String $min_lot_qty_p = "min_lot_qty_p";
	public static final String $batch_lot_qty_p = "batch_lot_qty_p";
	public static final String $max_lot_qty_p = "max_lot_qty_p";
	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public static final String $max_order = "max_order";
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public static final String $prio = "prio";
	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public static final String $order_ratio = "order_ratio";
	/**
	 * For long LT 先行手配対象.<p>
	 *
	 */
	public static final String $pre_po_tgt_flg = "pre_po_tgt_flg";
	/**
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_wg_nm = "rqst_wg_nm";
	/**
	 * PO batch 発注バッチ.<p>
	 *
	 */
	public static final String $po_batch_flg = "po_batch_flg";
	public static final String $sno_p = "sno_p";
	/**
	 * Not for MRP ＭＲＰ対象外.<p>
	 *
	 */
	public static final String $not_mrp_flg = "not_mrp_flg";
	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public static final String $cost_ratio = "cost_ratio";
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
	public static final String $purc_lt_add_qty = $purc_lt_add_qty_p + ".qty";
	public static final String $min_lot_qty = $min_lot_qty_p + ".qty";
	public static final String $batch_lot_qty = $batch_lot_qty_p + ".qty";
	public static final String $max_lot_qty = $max_lot_qty_p + ".qty";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dt_p_META = createInnerRowMeta($dt_p, mcframe.clientMAUB.MAUBP5010.DtR.class);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta purc_id_typ_nm_META = createCommonMeta($purc_id_typ_nm, mcframe.commonMA.meta.MA_META.PURC_ID_TYP_NM);
	public static final MCMeta purc_lt_META = createCommonMeta($purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta purc_lt_add_qty_p_META = createInnerRowMeta($purc_lt_add_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta purc_basis_typ_nm_META = createCommonMeta($purc_basis_typ_nm, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP_NM);
	public static final MCMeta accpt_insp_lt_META = createCommonMeta($accpt_insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta buf_lt_META = createCommonMeta($buf_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta ord_fix_pd_META = createCommonMeta($ord_fix_pd, mcframe.commonMA.meta.MA_META.ORD_FIX_PD);
	public static final MCMeta sz_day_week_typ_META = createCommonMeta($sz_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta sz_day_week_typ_nm_META = createCommonMeta($sz_day_week_typ_nm, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP_NM);
	public static final MCMeta sz_week_META = createCommonMeta($sz_week, mcframe.commonMA.meta.MA_META.SZ_WEEK);
	public static final MCMeta lot_sz_pd_META = createCommonMeta($lot_sz_pd, mcframe.commonMA.meta.MA_META.LOT_SZ_PD);
	public static final MCMeta min_lot_qty_p_META = createInnerRowMeta($min_lot_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta batch_lot_qty_p_META = createInnerRowMeta($batch_lot_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta max_lot_qty_p_META = createInnerRowMeta($max_lot_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta max_order_META = createCommonMeta($max_order, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta order_ratio_META = createCommonMeta($order_ratio, mcframe.commonMA.meta.MA_META.ORDER_RATIO);
	public static final MCMeta pre_po_tgt_flg_META = createCommonMeta($pre_po_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta po_batch_flg_META = createCommonMeta($po_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta not_mrp_flg_META = createCommonMeta($not_mrp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cost_ratio_META = createCommonMeta($cost_ratio, mcframe.commonMA.meta.MA_META.COST_RATIO);
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

	protected static final ConstMetaList<Wrk1DtlR> constMetas = new ConstMetaList<Wrk1DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			del_flg_META,
			itm_p_META,
			wg_cd_META,
			wg_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			dt_p_META,
			purc_id_typ_META,
			purc_id_typ_nm_META,
			purc_lt_META,
			purc_lt_add_qty_p_META,
			purc_basis_typ_META,
			purc_basis_typ_nm_META,
			accpt_insp_lt_META,
			buf_lt_META,
			ord_fix_pd_META,
			sz_day_week_typ_META,
			sz_day_week_typ_nm_META,
			sz_week_META,
			lot_sz_pd_META,
			min_lot_qty_p_META,
			batch_lot_qty_p_META,
			max_lot_qty_p_META,
			max_order_META,
			prio_META,
			order_ratio_META,
			pre_po_tgt_flg_META,
			rqst_wg_cd_META,
			rqst_wg_nm_META,
			po_batch_flg_META,
			sno_p_META,
			not_mrp_flg_META,
			cost_ratio_META,
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
				"purc_lt_add_qty",
				"min_lot_qty",
				"batch_lot_qty",
				"max_lot_qty",
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
				$purc_lt_add_qty,
				$min_lot_qty,
				$batch_lot_qty,
				$max_lot_qty,
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
			$wg_cd,	// wg_cd
			$sppl_cd,	// sppl_cd
			$maker_cd,	// maker_cd
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
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$maker_cd, "bp_nm"},	// maker_cd
				{$sz_day_week_typ, "day_week_typ_nm"},	// sz_day_week_typ
				{$rqst_wg_cd, "wg_nm"}	// rqst_wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"},	// wg_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "wr_flg"},	// wg_cd
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$maker_cd, "bp_is_srch_typ"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$rqst_wg_cd, "WG"},	// rqst_wg_cd
				{$rqst_wg_nm, "WG"}	// rqst_wg_nm
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
	protected Wrk1DtlR_MC_A(ConstMetaList<? extends Wrk1DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk1DtlR clone() {
		return (Wrk1DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk1DtlR createInstance() {
		return (Wrk1DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk1DtlR getValues(String... names) {
		return (Wrk1DtlR) super.getValues(names);
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 3, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 3, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 4, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 4, $wg_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 5, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 5, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 6, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 6, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 7, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 7, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 8, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 8, $maker_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5010.DtR dt_p(){
		return (mcframe.clientMAUB.MAUBP5010.DtR) getConstInnerRow(offset + 9, $dt_p);
	}
	
	public void dt_p(mcframe.clientMAUB.MAUBP5010.DtR row){
		setConstInnerRow(offset + 9, $dt_p, row);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 10, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 10, $purc_id_typ, value);
	}


	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public String purc_id_typ_nm() {
		return getConstString(offset + 11, $purc_id_typ_nm);
	}

	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public void purc_id_typ_nm(String value) {
		setConstString(offset + 11, $purc_id_typ_nm, value);
	}


	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return getConstNumber(offset + 12, $purc_lt);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		setConstNumber(offset + 12, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		setConstNumber(offset + 12, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		setConstNumber(offset + 12, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		setConstNumber(offset + 12, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		setConstNumber(offset + 12, $purc_lt, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_lt_add_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 13, $purc_lt_add_qty_p);
	}
	
	public void purc_lt_add_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 13, $purc_lt_add_qty_p, row);
	}


	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 14, $purc_basis_typ);
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 14, $purc_basis_typ, value);
	}


	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public String purc_basis_typ_nm() {
		return getConstString(offset + 15, $purc_basis_typ_nm);
	}

	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public void purc_basis_typ_nm(String value) {
		setConstString(offset + 15, $purc_basis_typ_nm, value);
	}


	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return getConstNumber(offset + 16, $accpt_insp_lt);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		setConstNumber(offset + 16, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		setConstNumber(offset + 16, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		setConstNumber(offset + 16, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		setConstNumber(offset + 16, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		setConstNumber(offset + 16, $accpt_insp_lt, value);
	}


	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public MCNumber buf_lt() {
		return getConstNumber(offset + 17, $buf_lt);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(MCNumber value) {
		setConstNumber(offset + 17, $buf_lt, value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(int value) {
		setConstNumber(offset + 17, $buf_lt, value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(long value) {
		setConstNumber(offset + 17, $buf_lt, value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(float value) {
		setConstNumber(offset + 17, $buf_lt, value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(double value) {
		setConstNumber(offset + 17, $buf_lt, value);
	}


	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public MCNumber ord_fix_pd() {
		return getConstNumber(offset + 18, $ord_fix_pd);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(MCNumber value) {
		setConstNumber(offset + 18, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(int value) {
		setConstNumber(offset + 18, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(long value) {
		setConstNumber(offset + 18, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(float value) {
		setConstNumber(offset + 18, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(double value) {
		setConstNumber(offset + 18, $ord_fix_pd, value);
	}


	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public String sz_day_week_typ() {
		return getConstString(offset + 19, $sz_day_week_typ);
	}

	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public void sz_day_week_typ(String value) {
		setConstString(offset + 19, $sz_day_week_typ, value);
	}


	/**
	 * Aggregation (by day of week) type name 曜日まとめ区分名.<p>
	 *
	 */
	public String sz_day_week_typ_nm() {
		return getConstString(offset + 20, $sz_day_week_typ_nm);
	}

	/**
	 * Aggregation (by day of week) type name 曜日まとめ区分名.<p>
	 *
	 */
	public void sz_day_week_typ_nm(String value) {
		setConstString(offset + 20, $sz_day_week_typ_nm, value);
	}


	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public MCNumber sz_week() {
		return getConstNumber(offset + 21, $sz_week);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(MCNumber value) {
		setConstNumber(offset + 21, $sz_week, value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(int value) {
		setConstNumber(offset + 21, $sz_week, value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(long value) {
		setConstNumber(offset + 21, $sz_week, value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(float value) {
		setConstNumber(offset + 21, $sz_week, value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(double value) {
		setConstNumber(offset + 21, $sz_week, value);
	}


	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public MCNumber lot_sz_pd() {
		return getConstNumber(offset + 22, $lot_sz_pd);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(MCNumber value) {
		setConstNumber(offset + 22, $lot_sz_pd, value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(int value) {
		setConstNumber(offset + 22, $lot_sz_pd, value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(long value) {
		setConstNumber(offset + 22, $lot_sz_pd, value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(float value) {
		setConstNumber(offset + 22, $lot_sz_pd, value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(double value) {
		setConstNumber(offset + 22, $lot_sz_pd, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR min_lot_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 23, $min_lot_qty_p);
	}
	
	public void min_lot_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 23, $min_lot_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR batch_lot_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 24, $batch_lot_qty_p);
	}
	
	public void batch_lot_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 24, $batch_lot_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR max_lot_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 25, $max_lot_qty_p);
	}
	
	public void max_lot_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 25, $max_lot_qty_p, row);
	}


	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public MCNumber max_order() {
		return getConstNumber(offset + 26, $max_order);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(MCNumber value) {
		setConstNumber(offset + 26, $max_order, value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(int value) {
		setConstNumber(offset + 26, $max_order, value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(long value) {
		setConstNumber(offset + 26, $max_order, value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(float value) {
		setConstNumber(offset + 26, $max_order, value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(double value) {
		setConstNumber(offset + 26, $max_order, value);
	}


	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 27, $prio);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 27, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 27, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 27, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 27, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 27, $prio, value);
	}


	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public MCNumber order_ratio() {
		return getConstNumber(offset + 28, $order_ratio);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(MCNumber value) {
		setConstNumber(offset + 28, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(int value) {
		setConstNumber(offset + 28, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(long value) {
		setConstNumber(offset + 28, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(float value) {
		setConstNumber(offset + 28, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(double value) {
		setConstNumber(offset + 28, $order_ratio, value);
	}


	/**
	 * For long LT 先行手配対象.<p>
	 *
	 */
	public boolean pre_po_tgt_flg() {
		return getConstBoolean(offset + 29, $pre_po_tgt_flg);
	}

	/**
	 * For long LT 先行手配対象.<p>
	 *
	 */
	public void pre_po_tgt_flg(boolean value) {
		setConstBoolean(offset + 29, $pre_po_tgt_flg, value);
	}


	/**
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 30, $rqst_wg_cd);
	}

	/**
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 30, $rqst_wg_cd, value);
	}


	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 31, $rqst_wg_nm);
	}

	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 31, $rqst_wg_nm, value);
	}


	/**
	 * PO batch 発注バッチ.<p>
	 *
	 */
	public boolean po_batch_flg() {
		return getConstBoolean(offset + 32, $po_batch_flg);
	}

	/**
	 * PO batch 発注バッチ.<p>
	 *
	 */
	public void po_batch_flg(boolean value) {
		setConstBoolean(offset + 32, $po_batch_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 33, $sno_p);
	}
	
	public void sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 33, $sno_p, row);
	}


	/**
	 * Not for MRP ＭＲＰ対象外.<p>
	 *
	 */
	public boolean not_mrp_flg() {
		return getConstBoolean(offset + 34, $not_mrp_flg);
	}

	/**
	 * Not for MRP ＭＲＰ対象外.<p>
	 *
	 */
	public void not_mrp_flg(boolean value) {
		setConstBoolean(offset + 34, $not_mrp_flg, value);
	}


	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public MCNumber cost_ratio() {
		return getConstNumber(offset + 35, $cost_ratio);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(MCNumber value) {
		setConstNumber(offset + 35, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(int value) {
		setConstNumber(offset + 35, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(long value) {
		setConstNumber(offset + 35, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(float value) {
		setConstNumber(offset + 35, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(double value) {
		setConstNumber(offset + 35, $cost_ratio, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 36, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 36, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 37, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 37, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 38, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 38, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 39, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 39, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 40, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 40, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 41, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 41, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 42, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 42, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 43, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 43, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 44, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 44, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 44, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 44, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 44, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 44, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 45, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 45, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 46, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 46, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 47, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 47, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 48, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 48, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 49, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 49, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 50, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 50, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 51, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 51, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 52, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 52, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 53, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 53, $del_ts, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			return sz_day_week_typ();
		}
		if ($sz_day_week_typ_nm.equalsIgnoreCase(name)) {
			return sz_day_week_typ_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
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
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			return buf_lt();
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			return ord_fix_pd();
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			return sz_week();
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			return lot_sz_pd();
		}
		if ($max_order.equalsIgnoreCase(name)) {
			return max_order();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			return order_ratio();
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			return cost_ratio();
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
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			return pre_po_tgt_flg();
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			return po_batch_flg();
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			return not_mrp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			return sz_day_week_typ();
		}
		if ($sz_day_week_typ_nm.equalsIgnoreCase(name)) {
			return sz_day_week_typ_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
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
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			return buf_lt();
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			return ord_fix_pd();
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			return sz_week();
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			return lot_sz_pd();
		}
		if ($max_order.equalsIgnoreCase(name)) {
			return max_order();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			return order_ratio();
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			return cost_ratio();
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
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			return pre_po_tgt_flg();
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			return po_batch_flg();
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			return not_mrp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
			return;
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			sz_day_week_typ(value);
			return;
		}
		if ($sz_day_week_typ_nm.equalsIgnoreCase(name)) {
			sz_day_week_typ_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
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
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
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
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			pre_po_tgt_flg(value);
			return;
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			po_batch_flg(value);
			return;
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			not_mrp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
			return;
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			sz_day_week_typ(value);
			return;
		}
		if ($sz_day_week_typ_nm.equalsIgnoreCase(name)) {
			sz_day_week_typ_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
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
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
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
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			pre_po_tgt_flg(value);
			return;
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			po_batch_flg(value);
			return;
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			not_mrp_flg(value);
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
		if ($purc_lt_add_qty_p.equalsIgnoreCase(name)) {
			return purc_lt_add_qty_p();
		}
		if ($min_lot_qty_p.equalsIgnoreCase(name)) {
			return min_lot_qty_p();
		}
		if ($batch_lot_qty_p.equalsIgnoreCase(name)) {
			return batch_lot_qty_p();
		}
		if ($max_lot_qty_p.equalsIgnoreCase(name)) {
			return max_lot_qty_p();
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
		if ($purc_lt_add_qty_p.equalsIgnoreCase(name)) {
			purc_lt_add_qty_p(
				((MCContainerMeta) purc_lt_add_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($min_lot_qty_p.equalsIgnoreCase(name)) {
			min_lot_qty_p(
				((MCContainerMeta) min_lot_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($batch_lot_qty_p.equalsIgnoreCase(name)) {
			batch_lot_qty_p(
				((MCContainerMeta) batch_lot_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($max_lot_qty_p.equalsIgnoreCase(name)) {
			max_lot_qty_p(
				((MCContainerMeta) max_lot_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public MCNumber purc_lt_add_qty() {
		return purc_lt_add_qty_p().qty();
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(MCNumber value) {
		purc_lt_add_qty_p().qty(value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(int value) {
		purc_lt_add_qty_p().qty(value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(long value) {
		purc_lt_add_qty_p().qty(value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(float value) {
		purc_lt_add_qty_p().qty(value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(double value) {
		purc_lt_add_qty_p().qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public MCNumber min_lot_qty() {
		return min_lot_qty_p().qty();
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(MCNumber value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(int value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(long value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(float value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(double value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public MCNumber batch_lot_qty() {
		return batch_lot_qty_p().qty();
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(MCNumber value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(int value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(long value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(float value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(double value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public MCNumber max_lot_qty() {
		return max_lot_qty_p().qty();
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(MCNumber value) {
		max_lot_qty_p().qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(int value) {
		max_lot_qty_p().qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(long value) {
		max_lot_qty_p().qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(float value) {
		max_lot_qty_p().qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(double value) {
		max_lot_qty_p().qty(value);
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

