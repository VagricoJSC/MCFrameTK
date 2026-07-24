package mcframe.serverMABS.MABSL0190;

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
 * ブロック"Sprt01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sprt01_DtlR_MC_A extends MCConstRow {

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public static final String $st_dt_key = "st_dt_key";
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
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public static final String $lmt_ctl_flg = "lmt_ctl_flg";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
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
	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $from_site_cd = "from_site_cd";
	/**
	 * Shipping point factory/distribution warehouse name 出荷元工場・物流倉庫名.<p>
	 *
	 */
	public static final String $from_site_nm = "from_site_nm";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $to_site_cd = "to_site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $to_site_nm = "to_site_nm";
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
	 * Not for inspection 検査対象外.<p>
	 *
	 */
	public static final String $no_insp_flg = "no_insp_flg";
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public static final String $insp_ptn_nm = "insp_ptn_nm";
	/**
	 * Not for market release decision 市場出荷判定対象外.<p>
	 *
	 */
	public static final String $no_mrkt_judg_flg = "no_mrkt_judg_flg";
	/**
	 * Not for factory release approval 工場出荷承認対象外.<p>
	 *
	 */
	public static final String $no_plnt_aprv_flg = "no_plnt_aprv_flg";
	/**
	 * Not for inspection approval 検査承認対象外.<p>
	 *
	 */
	public static final String $no_insp_aprv_flg = "no_insp_aprv_flg";
	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public static final String $lmt_dt_frm_typ = "lmt_dt_frm_typ";
	/**
	 * Expiration base date type name 期限起算日区分名.<p>
	 *
	 */
	public static final String $lmt_dt_frm_typ_nm = "lmt_dt_frm_typ_nm";
	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public static final String $vld_pd = "vld_pd";
	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public static final String $lmt_pd = "lmt_pd";
	/**
	 * Valid period (At time of the extension) 有効期間（延長時）.<p>
	 *
	 */
	public static final String $lot_insp_vld_pd = "lot_insp_vld_pd";
	/**
	 * Period calculation type 期間計算区分.<p>
	 *
	 */
	public static final String $calc_pd_typ = "calc_pd_typ";
	/**
	 * Period calculation type name 期間計算区分名.<p>
	 *
	 */
	public static final String $calc_pd_typ_nm = "calc_pd_typ_nm";
	/**
	 * Expiration base date type (Extended) 期限起算日区分（延長時）.<p>
	 *
	 */
	public static final String $lot_insp_lmt_dt_frm_typ = "lot_insp_lmt_dt_frm_typ";
	/**
	 * Expiration base date type name (Extended) 期限起算日区分名（延長時）.<p>
	 *
	 */
	public static final String $lot_insp_lmt_dt_frm_typ_nm = "lot_insp_lmt_dt_frm_typ_nm";
	/**
	 * Inspection order timing type 検査指図タイミング区分.<p>
	 *
	 */
	public static final String $insp_inst_issue_typ = "insp_inst_issue_typ";
	/**
	 * Inspection order timing type name 検査指図タイミング区分名.<p>
	 *
	 */
	public static final String $insp_inst_issue_typ_nm = "insp_inst_issue_typ_nm";
	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public static final String $insp_offst = "insp_offst";
	/**
	 * Report issued at inspection order 検査指図時成績書発行.<p>
	 *
	 */
	public static final String $inst_rslt_issue_flg = "inst_rslt_issue_flg";
	/**
	 * Prior inspection valid 先行検査有効.<p>
	 *
	 */
	public static final String $pre_insp_valid_flg = "pre_insp_valid_flg";
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


	public static final MCMeta st_dt_key_META = createCommonMeta($st_dt_key, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta lmt_ctl_flg_META = createCommonMeta($lmt_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta from_site_cd_META = createCommonMeta($from_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta from_site_nm_META = createCommonMeta($from_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta to_site_cd_META = createCommonMeta($to_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta to_site_nm_META = createCommonMeta($to_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta no_insp_flg_META = createCommonMeta($no_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta insp_ptn_nm_META = createCommonMeta($insp_ptn_nm, mcframe.commonMA.meta.MA_META.INSP_PTN_NM);
	public static final MCMeta no_mrkt_judg_flg_META = createCommonMeta($no_mrkt_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_plnt_aprv_flg_META = createCommonMeta($no_plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_insp_aprv_flg_META = createCommonMeta($no_insp_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lmt_dt_frm_typ_META = createCommonMeta($lmt_dt_frm_typ, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP);
	public static final MCMeta lmt_dt_frm_typ_nm_META = createCommonMeta($lmt_dt_frm_typ_nm, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP_NM);
	public static final MCMeta vld_pd_META = createCommonMeta($vld_pd, mcframe.commonMA.meta.MA_META.VLD_PD);
	public static final MCMeta lmt_pd_META = createCommonMeta($lmt_pd, mcframe.commonMA.meta.MA_META.LMT_PD);
	public static final MCMeta lot_insp_vld_pd_META = createCommonMeta($lot_insp_vld_pd, mcframe.commonMA.meta.MA_META.VLD_PD);
	public static final MCMeta calc_pd_typ_META = createCommonMeta($calc_pd_typ, mcframe.commonMA.meta.MA_META.CALC_PD_TYP);
	public static final MCMeta calc_pd_typ_nm_META = createCommonMeta($calc_pd_typ_nm, mcframe.commonMA.meta.MA_META.CALC_PD_TYP_NM);
	public static final MCMeta lot_insp_lmt_dt_frm_typ_META = createCommonMeta($lot_insp_lmt_dt_frm_typ, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP);
	public static final MCMeta lot_insp_lmt_dt_frm_typ_nm_META = createCommonMeta($lot_insp_lmt_dt_frm_typ_nm, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP_NM);
	public static final MCMeta insp_inst_issue_typ_META = createCommonMeta($insp_inst_issue_typ, mcframe.commonMA.meta.MA_META.INSP_INST_ISSUE_TYP);
	public static final MCMeta insp_inst_issue_typ_nm_META = createCommonMeta($insp_inst_issue_typ_nm, mcframe.commonMA.meta.MA_META.INSP_INST_ISSUE_TYP_NM);
	public static final MCMeta insp_offst_META = createCommonMeta($insp_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta inst_rslt_issue_flg_META = createCommonMeta($inst_rslt_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_insp_valid_flg_META = createCommonMeta($pre_insp_valid_flg, mcframe.commonMA.meta.MA_META.FLG);
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

	protected static final ConstMetaList<Sprt01_DtlR> constMetas = new ConstMetaList<Sprt01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			st_dt_key_META,
			del_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			lmt_ctl_flg_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			from_site_cd_META,
			from_site_nm_META,
			to_site_cd_META,
			to_site_nm_META,
			st_dt_META,
			end_dt_META,
			no_insp_flg_META,
			insp_ptn_cd_META,
			insp_ptn_nm_META,
			no_mrkt_judg_flg_META,
			no_plnt_aprv_flg_META,
			no_insp_aprv_flg_META,
			lmt_dt_frm_typ_META,
			lmt_dt_frm_typ_nm_META,
			vld_pd_META,
			lmt_pd_META,
			lot_insp_vld_pd_META,
			calc_pd_typ_META,
			calc_pd_typ_nm_META,
			lot_insp_lmt_dt_frm_typ_META,
			lot_insp_lmt_dt_frm_typ_nm_META,
			insp_inst_issue_typ_META,
			insp_inst_issue_typ_nm_META,
			insp_offst_META,
			inst_rslt_issue_flg_META,
			pre_insp_valid_flg_META,
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
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$lmt_dt_frm_typ, "MAC_LMT_DT_FRM_TYP"},	// lmt_dt_frm_typ
				{$calc_pd_typ, "MAC_CALC_PD_TYP"},	// calc_pd_typ
				{$lot_insp_lmt_dt_frm_typ, "MAC_LMT_DT_FRM_TYP"},	// lot_insp_lmt_dt_frm_typ
				{$insp_inst_issue_typ, "MAC_INSP_INST_ISSUE_TYP"}	// insp_inst_issue_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$mfg_loc_cd, "E"},	// mfg_loc_cd
				{$sppl_cd, "E"},	// sppl_cd
				{$maker_cd, "E"},	// maker_cd
				{$from_site_cd, "E"},	// from_site_cd
				{$to_site_cd, "E"}	// to_site_cd
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
	protected Sprt01_DtlR_MC_A(ConstMetaList<? extends Sprt01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR clone() {
		return (Sprt01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR createInstance() {
		return (Sprt01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR getValues(String... names) {
		return (Sprt01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public MCDate st_dt_key() {
		return getConstDate(offset + 0, $st_dt_key);
	}

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public void st_dt_key(MCDate value) {
		setConstDate(offset + 0, $st_dt_key, value);
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


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 2, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 2, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 3, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 3, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 4, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 4, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 5, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 5, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 6, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 6, $itm_nm, value);
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
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public boolean lmt_ctl_flg() {
		return getConstBoolean(offset + 11, $lmt_ctl_flg);
	}

	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public void lmt_ctl_flg(boolean value) {
		setConstBoolean(offset + 11, $lmt_ctl_flg, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 12, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 12, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 13, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 13, $mfg_loc_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 14, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 14, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 15, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 15, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 16, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 16, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 17, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 17, $maker_nm, value);
	}


	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String from_site_cd() {
		return getConstString(offset + 18, $from_site_cd);
	}

	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void from_site_cd(String value) {
		setConstString(offset + 18, $from_site_cd, value);
	}


	/**
	 * Shipping point factory/distribution warehouse name 出荷元工場・物流倉庫名.<p>
	 *
	 */
	public String from_site_nm() {
		return getConstString(offset + 19, $from_site_nm);
	}

	/**
	 * Shipping point factory/distribution warehouse name 出荷元工場・物流倉庫名.<p>
	 *
	 */
	public void from_site_nm(String value) {
		setConstString(offset + 19, $from_site_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String to_site_cd() {
		return getConstString(offset + 20, $to_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void to_site_cd(String value) {
		setConstString(offset + 20, $to_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String to_site_nm() {
		return getConstString(offset + 21, $to_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void to_site_nm(String value) {
		setConstString(offset + 21, $to_site_nm, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 22, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 22, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 23, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 23, $end_dt, value);
	}


	/**
	 * Not for inspection 検査対象外.<p>
	 *
	 */
	public boolean no_insp_flg() {
		return getConstBoolean(offset + 24, $no_insp_flg);
	}

	/**
	 * Not for inspection 検査対象外.<p>
	 *
	 */
	public void no_insp_flg(boolean value) {
		setConstBoolean(offset + 24, $no_insp_flg, value);
	}


	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 25, $insp_ptn_cd);
	}

	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 25, $insp_ptn_cd, value);
	}


	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public String insp_ptn_nm() {
		return getConstString(offset + 26, $insp_ptn_nm);
	}

	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public void insp_ptn_nm(String value) {
		setConstString(offset + 26, $insp_ptn_nm, value);
	}


	/**
	 * Not for market release decision 市場出荷判定対象外.<p>
	 *
	 */
	public boolean no_mrkt_judg_flg() {
		return getConstBoolean(offset + 27, $no_mrkt_judg_flg);
	}

	/**
	 * Not for market release decision 市場出荷判定対象外.<p>
	 *
	 */
	public void no_mrkt_judg_flg(boolean value) {
		setConstBoolean(offset + 27, $no_mrkt_judg_flg, value);
	}


	/**
	 * Not for factory release approval 工場出荷承認対象外.<p>
	 *
	 */
	public boolean no_plnt_aprv_flg() {
		return getConstBoolean(offset + 28, $no_plnt_aprv_flg);
	}

	/**
	 * Not for factory release approval 工場出荷承認対象外.<p>
	 *
	 */
	public void no_plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 28, $no_plnt_aprv_flg, value);
	}


	/**
	 * Not for inspection approval 検査承認対象外.<p>
	 *
	 */
	public boolean no_insp_aprv_flg() {
		return getConstBoolean(offset + 29, $no_insp_aprv_flg);
	}

	/**
	 * Not for inspection approval 検査承認対象外.<p>
	 *
	 */
	public void no_insp_aprv_flg(boolean value) {
		setConstBoolean(offset + 29, $no_insp_aprv_flg, value);
	}


	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public String lmt_dt_frm_typ() {
		return getConstString(offset + 30, $lmt_dt_frm_typ);
	}

	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public void lmt_dt_frm_typ(String value) {
		setConstString(offset + 30, $lmt_dt_frm_typ, value);
	}


	/**
	 * Expiration base date type name 期限起算日区分名.<p>
	 *
	 */
	public String lmt_dt_frm_typ_nm() {
		return getConstString(offset + 31, $lmt_dt_frm_typ_nm);
	}

	/**
	 * Expiration base date type name 期限起算日区分名.<p>
	 *
	 */
	public void lmt_dt_frm_typ_nm(String value) {
		setConstString(offset + 31, $lmt_dt_frm_typ_nm, value);
	}


	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public MCNumber vld_pd() {
		return getConstNumber(offset + 32, $vld_pd);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(MCNumber value) {
		setConstNumber(offset + 32, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(int value) {
		setConstNumber(offset + 32, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(long value) {
		setConstNumber(offset + 32, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(float value) {
		setConstNumber(offset + 32, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(double value) {
		setConstNumber(offset + 32, $vld_pd, value);
	}


	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public MCNumber lmt_pd() {
		return getConstNumber(offset + 33, $lmt_pd);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(MCNumber value) {
		setConstNumber(offset + 33, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(int value) {
		setConstNumber(offset + 33, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(long value) {
		setConstNumber(offset + 33, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(float value) {
		setConstNumber(offset + 33, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(double value) {
		setConstNumber(offset + 33, $lmt_pd, value);
	}


	/**
	 * Valid period (At time of the extension) 有効期間（延長時）.<p>
	 *
	 */
	public MCNumber lot_insp_vld_pd() {
		return getConstNumber(offset + 34, $lot_insp_vld_pd);
	}

	/**
	 * Valid period (At time of the extension) 有効期間（延長時）.<p>
	 *
	 */
	public void lot_insp_vld_pd(MCNumber value) {
		setConstNumber(offset + 34, $lot_insp_vld_pd, value);
	}

	/**
	 * Valid period (At time of the extension) 有効期間（延長時）.<p>
	 *
	 */
	public void lot_insp_vld_pd(int value) {
		setConstNumber(offset + 34, $lot_insp_vld_pd, value);
	}

	/**
	 * Valid period (At time of the extension) 有効期間（延長時）.<p>
	 *
	 */
	public void lot_insp_vld_pd(long value) {
		setConstNumber(offset + 34, $lot_insp_vld_pd, value);
	}

	/**
	 * Valid period (At time of the extension) 有効期間（延長時）.<p>
	 *
	 */
	public void lot_insp_vld_pd(float value) {
		setConstNumber(offset + 34, $lot_insp_vld_pd, value);
	}

	/**
	 * Valid period (At time of the extension) 有効期間（延長時）.<p>
	 *
	 */
	public void lot_insp_vld_pd(double value) {
		setConstNumber(offset + 34, $lot_insp_vld_pd, value);
	}


	/**
	 * Period calculation type 期間計算区分.<p>
	 *
	 */
	public String calc_pd_typ() {
		return getConstString(offset + 35, $calc_pd_typ);
	}

	/**
	 * Period calculation type 期間計算区分.<p>
	 *
	 */
	public void calc_pd_typ(String value) {
		setConstString(offset + 35, $calc_pd_typ, value);
	}


	/**
	 * Period calculation type name 期間計算区分名.<p>
	 *
	 */
	public String calc_pd_typ_nm() {
		return getConstString(offset + 36, $calc_pd_typ_nm);
	}

	/**
	 * Period calculation type name 期間計算区分名.<p>
	 *
	 */
	public void calc_pd_typ_nm(String value) {
		setConstString(offset + 36, $calc_pd_typ_nm, value);
	}


	/**
	 * Expiration base date type (Extended) 期限起算日区分（延長時）.<p>
	 *
	 */
	public String lot_insp_lmt_dt_frm_typ() {
		return getConstString(offset + 37, $lot_insp_lmt_dt_frm_typ);
	}

	/**
	 * Expiration base date type (Extended) 期限起算日区分（延長時）.<p>
	 *
	 */
	public void lot_insp_lmt_dt_frm_typ(String value) {
		setConstString(offset + 37, $lot_insp_lmt_dt_frm_typ, value);
	}


	/**
	 * Expiration base date type name (Extended) 期限起算日区分名（延長時）.<p>
	 *
	 */
	public String lot_insp_lmt_dt_frm_typ_nm() {
		return getConstString(offset + 38, $lot_insp_lmt_dt_frm_typ_nm);
	}

	/**
	 * Expiration base date type name (Extended) 期限起算日区分名（延長時）.<p>
	 *
	 */
	public void lot_insp_lmt_dt_frm_typ_nm(String value) {
		setConstString(offset + 38, $lot_insp_lmt_dt_frm_typ_nm, value);
	}


	/**
	 * Inspection order timing type 検査指図タイミング区分.<p>
	 *
	 */
	public String insp_inst_issue_typ() {
		return getConstString(offset + 39, $insp_inst_issue_typ);
	}

	/**
	 * Inspection order timing type 検査指図タイミング区分.<p>
	 *
	 */
	public void insp_inst_issue_typ(String value) {
		setConstString(offset + 39, $insp_inst_issue_typ, value);
	}


	/**
	 * Inspection order timing type name 検査指図タイミング区分名.<p>
	 *
	 */
	public String insp_inst_issue_typ_nm() {
		return getConstString(offset + 40, $insp_inst_issue_typ_nm);
	}

	/**
	 * Inspection order timing type name 検査指図タイミング区分名.<p>
	 *
	 */
	public void insp_inst_issue_typ_nm(String value) {
		setConstString(offset + 40, $insp_inst_issue_typ_nm, value);
	}


	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return getConstNumber(offset + 41, $insp_offst);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		setConstNumber(offset + 41, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(int value) {
		setConstNumber(offset + 41, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(long value) {
		setConstNumber(offset + 41, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(float value) {
		setConstNumber(offset + 41, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(double value) {
		setConstNumber(offset + 41, $insp_offst, value);
	}


	/**
	 * Report issued at inspection order 検査指図時成績書発行.<p>
	 *
	 */
	public boolean inst_rslt_issue_flg() {
		return getConstBoolean(offset + 42, $inst_rslt_issue_flg);
	}

	/**
	 * Report issued at inspection order 検査指図時成績書発行.<p>
	 *
	 */
	public void inst_rslt_issue_flg(boolean value) {
		setConstBoolean(offset + 42, $inst_rslt_issue_flg, value);
	}


	/**
	 * Prior inspection valid 先行検査有効.<p>
	 *
	 */
	public boolean pre_insp_valid_flg() {
		return getConstBoolean(offset + 43, $pre_insp_valid_flg);
	}

	/**
	 * Prior inspection valid 先行検査有効.<p>
	 *
	 */
	public void pre_insp_valid_flg(boolean value) {
		setConstBoolean(offset + 43, $pre_insp_valid_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 44, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 44, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 45, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 45, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 46, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 46, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 47, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 47, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 48, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 48, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 49, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 49, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 50, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 50, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 51, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 51, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 52, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 53, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 53, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 54, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 54, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 55, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 55, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 56, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 56, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 57, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 57, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 58, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 58, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 59, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 59, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 60, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 60, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 61, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 61, $del_ts, value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
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
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($from_site_nm.equalsIgnoreCase(name)) {
			return from_site_nm();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			return to_site_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ_nm();
		}
		if ($calc_pd_typ.equalsIgnoreCase(name)) {
			return calc_pd_typ();
		}
		if ($calc_pd_typ_nm.equalsIgnoreCase(name)) {
			return calc_pd_typ_nm();
		}
		if ($lot_insp_lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lot_insp_lmt_dt_frm_typ();
		}
		if ($lot_insp_lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			return lot_insp_lmt_dt_frm_typ_nm();
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			return insp_inst_issue_typ();
		}
		if ($insp_inst_issue_typ_nm.equalsIgnoreCase(name)) {
			return insp_inst_issue_typ_nm();
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
		if ($vld_pd.equalsIgnoreCase(name)) {
			return vld_pd();
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			return lmt_pd();
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			return lot_insp_vld_pd();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
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
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			return lmt_ctl_flg();
		}
		if ($no_insp_flg.equalsIgnoreCase(name)) {
			return no_insp_flg();
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			return no_mrkt_judg_flg();
		}
		if ($no_plnt_aprv_flg.equalsIgnoreCase(name)) {
			return no_plnt_aprv_flg();
		}
		if ($no_insp_aprv_flg.equalsIgnoreCase(name)) {
			return no_insp_aprv_flg();
		}
		if ($inst_rslt_issue_flg.equalsIgnoreCase(name)) {
			return inst_rslt_issue_flg();
		}
		if ($pre_insp_valid_flg.equalsIgnoreCase(name)) {
			return pre_insp_valid_flg();
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
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
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($from_site_nm.equalsIgnoreCase(name)) {
			return from_site_nm();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			return to_site_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ_nm();
		}
		if ($calc_pd_typ.equalsIgnoreCase(name)) {
			return calc_pd_typ();
		}
		if ($calc_pd_typ_nm.equalsIgnoreCase(name)) {
			return calc_pd_typ_nm();
		}
		if ($lot_insp_lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lot_insp_lmt_dt_frm_typ();
		}
		if ($lot_insp_lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			return lot_insp_lmt_dt_frm_typ_nm();
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			return insp_inst_issue_typ();
		}
		if ($insp_inst_issue_typ_nm.equalsIgnoreCase(name)) {
			return insp_inst_issue_typ_nm();
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
		if ($vld_pd.equalsIgnoreCase(name)) {
			return vld_pd();
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			return lmt_pd();
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			return lot_insp_vld_pd();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
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
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			return lmt_ctl_flg();
		}
		if ($no_insp_flg.equalsIgnoreCase(name)) {
			return no_insp_flg();
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			return no_mrkt_judg_flg();
		}
		if ($no_plnt_aprv_flg.equalsIgnoreCase(name)) {
			return no_plnt_aprv_flg();
		}
		if ($no_insp_aprv_flg.equalsIgnoreCase(name)) {
			return no_insp_aprv_flg();
		}
		if ($inst_rslt_issue_flg.equalsIgnoreCase(name)) {
			return inst_rslt_issue_flg();
		}
		if ($pre_insp_valid_flg.equalsIgnoreCase(name)) {
			return pre_insp_valid_flg();
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
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
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($from_site_nm.equalsIgnoreCase(name)) {
			from_site_nm(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			to_site_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ_nm(value);
			return;
		}
		if ($calc_pd_typ.equalsIgnoreCase(name)) {
			calc_pd_typ(value);
			return;
		}
		if ($calc_pd_typ_nm.equalsIgnoreCase(name)) {
			calc_pd_typ_nm(value);
			return;
		}
		if ($lot_insp_lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lot_insp_lmt_dt_frm_typ(value);
			return;
		}
		if ($lot_insp_lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			lot_insp_lmt_dt_frm_typ_nm(value);
			return;
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			insp_inst_issue_typ(value);
			return;
		}
		if ($insp_inst_issue_typ_nm.equalsIgnoreCase(name)) {
			insp_inst_issue_typ_nm(value);
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
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
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
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			lmt_ctl_flg(value);
			return;
		}
		if ($no_insp_flg.equalsIgnoreCase(name)) {
			no_insp_flg(value);
			return;
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			no_mrkt_judg_flg(value);
			return;
		}
		if ($no_plnt_aprv_flg.equalsIgnoreCase(name)) {
			no_plnt_aprv_flg(value);
			return;
		}
		if ($no_insp_aprv_flg.equalsIgnoreCase(name)) {
			no_insp_aprv_flg(value);
			return;
		}
		if ($inst_rslt_issue_flg.equalsIgnoreCase(name)) {
			inst_rslt_issue_flg(value);
			return;
		}
		if ($pre_insp_valid_flg.equalsIgnoreCase(name)) {
			pre_insp_valid_flg(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
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
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($from_site_nm.equalsIgnoreCase(name)) {
			from_site_nm(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			to_site_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ_nm(value);
			return;
		}
		if ($calc_pd_typ.equalsIgnoreCase(name)) {
			calc_pd_typ(value);
			return;
		}
		if ($calc_pd_typ_nm.equalsIgnoreCase(name)) {
			calc_pd_typ_nm(value);
			return;
		}
		if ($lot_insp_lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lot_insp_lmt_dt_frm_typ(value);
			return;
		}
		if ($lot_insp_lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			lot_insp_lmt_dt_frm_typ_nm(value);
			return;
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			insp_inst_issue_typ(value);
			return;
		}
		if ($insp_inst_issue_typ_nm.equalsIgnoreCase(name)) {
			insp_inst_issue_typ_nm(value);
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
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($lot_insp_vld_pd.equalsIgnoreCase(name)) {
			lot_insp_vld_pd(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
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
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			lmt_ctl_flg(value);
			return;
		}
		if ($no_insp_flg.equalsIgnoreCase(name)) {
			no_insp_flg(value);
			return;
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			no_mrkt_judg_flg(value);
			return;
		}
		if ($no_plnt_aprv_flg.equalsIgnoreCase(name)) {
			no_plnt_aprv_flg(value);
			return;
		}
		if ($no_insp_aprv_flg.equalsIgnoreCase(name)) {
			no_insp_aprv_flg(value);
			return;
		}
		if ($inst_rslt_issue_flg.equalsIgnoreCase(name)) {
			inst_rslt_issue_flg(value);
			return;
		}
		if ($pre_insp_valid_flg.equalsIgnoreCase(name)) {
			pre_insp_valid_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

