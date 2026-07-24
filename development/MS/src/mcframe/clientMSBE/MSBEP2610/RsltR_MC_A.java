package mcframe.clientMSBE.MSBEP2610;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Logical inventory check not required 理論在庫チェック不要.<p>
	 *
	 */
	public static final String $not_chk_tor_flg = "not_chk_tor_flg";
	/**
	 * Control target date 制御対象日.<p>
	 *
	 */
	public static final String $ctrl_tgt_dt = "ctrl_tgt_dt";
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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
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
	public static final String $itm_p = "itm_p";
	/**
	 * Inventory count classification type 棚卸種別区分.<p>
	 *
	 */
	public static final String $stktk_typ = "stktk_typ";
	/**
	 * Inventory count classification type name 棚卸種別区分名.<p>
	 *
	 */
	public static final String $stktk_typ_nm = "stktk_typ_nm";
	/**
	 * Inventory count status type 棚卸状況区分.<p>
	 *
	 */
	public static final String $stktk_sts_typ = "stktk_sts_typ";
	/**
	 * Inventory count status type name 棚卸状況区分名.<p>
	 *
	 */
	public static final String $stktk_sts_typ_nm = "stktk_sts_typ_nm";
	/**
	 * GR/GI control flg. 入出庫制御中ＦＬＧ.<p>
	 *
	 */
	public static final String $io_ctrl_flg = "io_ctrl_flg";
	/**
	 * Keep counted qty. flg. 実棚数量保持ＦＬＧ.<p>
	 *
	 */
	public static final String $act_qty_keep_flg = "act_qty_keep_flg";
	/**
	 * Last inventory base date 前回棚卸基準日.<p>
	 *
	 */
	public static final String $last_stktk_dt = "last_stktk_dt";
	/**
	 * Inventory count start date and time 棚卸開始日時.<p>
	 *
	 */
	public static final String $stktk_st_tm = "stktk_st_tm";
	/**
	 * Inventory firm date and time 在庫確定日時.<p>
	 *
	 */
	public static final String $diff_upd_tm = "diff_upd_tm";
	/**
	 * Latest inventory start date 最新棚卸開始日.<p>
	 *
	 */
	public static final String $latest_stktk_st_dt = "latest_stktk_st_dt";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * Inventory count sheet remarks 棚卸表備考.<p>
	 *
	 */
	public static final String $stktk_rpt_rmrks = "stktk_rpt_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $stktk_intr_rmrks = "stktk_intr_rmrks";
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
	public static final String $rts_msg_p = "rts_msg_p";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Inventory count control update counter 棚卸制御更新カウンタ.<p>
	 *
	 */
	public static final String $stktk_upd_cntr = "stktk_upd_cntr";
	/**
	 * Last inventory update counter 前回棚卸更新カウンタ.<p>
	 *
	 */
	public static final String $pre_stktk_upd_cntr = "pre_stktk_upd_cntr";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $act_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $act_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $act_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $act_dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";
	public static final String $rtn_sts_typ_nm = $rts_msg_p + ".rtn_sts_typ_nm";
	public static final String $msg_id = $rts_msg_p + ".msg_id";
	public static final String $msg = $rts_msg_p + ".msg";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_chk_tor_flg_META = createCommonMeta($not_chk_tor_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ctrl_tgt_dt_META = createCommonMeta($ctrl_tgt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta stktk_typ_META = createCommonMeta($stktk_typ, mcframe.commonMS.meta.MS_META.STKTK_TYP);
	public static final MCMeta stktk_typ_nm_META = createCommonMeta($stktk_typ_nm, mcframe.commonMS.meta.MS_META.STKTK_TYP_NM);
	public static final MCMeta stktk_sts_typ_META = createCommonMeta($stktk_sts_typ, mcframe.commonMS.meta.MS_META.STKTK_STS_TYP);
	public static final MCMeta stktk_sts_typ_nm_META = createCommonMeta($stktk_sts_typ_nm, mcframe.commonMS.meta.MS_META.STKTK_STS_TYP_NM);
	public static final MCMeta io_ctrl_flg_META = createCommonMeta($io_ctrl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_qty_keep_flg_META = createCommonMeta($act_qty_keep_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_stktk_dt_META = createCommonMeta($last_stktk_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta stktk_st_tm_META = createCommonMeta($stktk_st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta diff_upd_tm_META = createCommonMeta($diff_upd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta latest_stktk_st_dt_META = createCommonMeta($latest_stktk_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta stktk_rpt_rmrks_META = createCommonMeta($stktk_rpt_rmrks, mcframe.commonMS.meta.MS_META.STKTK_RPT_RMRKS);
	public static final MCMeta stktk_intr_rmrks_META = createCommonMeta($stktk_intr_rmrks, mcframe.commonMS.meta.MS_META.STKTK_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.STKTK_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.STKTK_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.STKTK_SUB_CHAR3);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta stktk_upd_cntr_META = createCommonMeta($stktk_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta pre_stktk_upd_cntr_META = createCommonMeta($pre_stktk_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			not_chk_tor_flg_META,
			ctrl_tgt_dt_META,
			loc_cd_META,
			loc_nm_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			itm_p_META,
			stktk_typ_META,
			stktk_typ_nm_META,
			stktk_sts_typ_META,
			stktk_sts_typ_nm_META,
			io_ctrl_flg_META,
			act_qty_keep_flg_META,
			last_stktk_dt_META,
			stktk_st_tm_META,
			diff_upd_tm_META,
			latest_stktk_st_dt_META,
			usr_dpt_p_META,
			stktk_rpt_rmrks_META,
			stktk_intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			rts_msg_p_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			stktk_upd_cntr_META,
			pre_stktk_upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"act_usr_cd",
				"act_usr_nm",
				"act_dpt_cd",
				"act_dpt_nm",
				"rtn_sts_typ",
				"rtn_sts_typ_nm",
				"msg_id",
				"msg"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$act_usr_cd,
				$act_usr_nm,
				$act_dpt_cd,
				$act_dpt_nm,
				$rtn_sts_typ,
				$rtn_sts_typ_nm,
				$msg_id,
				$msg
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
				{$usr_dpt_p + ".dpt_cd", "dpt_nm"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "ctrl_tgt_dt;act_usr_cd;MAC_DPT_IS_SRCH_TYP.SCE"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$lg_grp_nm, "LG_GRP"},	// lg_grp_nm
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$loc_grp_nm, "LOC_GRP"},	// loc_grp_nm
				{$alloc_grp_cd, "ALLOC_GRP"},	// alloc_grp_cd
				{$alloc_grp_nm, "ALLOC_GRP"}	// alloc_grp_nm
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
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
	 * Logical inventory check not required 理論在庫チェック不要.<p>
	 *
	 */
	public boolean not_chk_tor_flg() {
		return getConstBoolean(offset + 1, $not_chk_tor_flg);
	}

	/**
	 * Logical inventory check not required 理論在庫チェック不要.<p>
	 *
	 */
	public void not_chk_tor_flg(boolean value) {
		setConstBoolean(offset + 1, $not_chk_tor_flg, value);
	}


	/**
	 * Control target date 制御対象日.<p>
	 *
	 */
	public MCDate ctrl_tgt_dt() {
		return getConstDate(offset + 2, $ctrl_tgt_dt);
	}

	/**
	 * Control target date 制御対象日.<p>
	 *
	 */
	public void ctrl_tgt_dt(MCDate value) {
		setConstDate(offset + 2, $ctrl_tgt_dt, value);
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
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 5, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 5, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 6, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 6, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 7, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 7, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 8, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 8, $wg_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 9, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 9, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 10, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 10, $lg_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 11, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 11, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 12, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 12, $loc_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 13, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 13, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 14, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 14, $alloc_grp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 15, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 15, $itm_p, row);
	}


	/**
	 * Inventory count classification type 棚卸種別区分.<p>
	 *
	 */
	public String stktk_typ() {
		return getConstString(offset + 16, $stktk_typ);
	}

	/**
	 * Inventory count classification type 棚卸種別区分.<p>
	 *
	 */
	public void stktk_typ(String value) {
		setConstString(offset + 16, $stktk_typ, value);
	}


	/**
	 * Inventory count classification type name 棚卸種別区分名.<p>
	 *
	 */
	public String stktk_typ_nm() {
		return getConstString(offset + 17, $stktk_typ_nm);
	}

	/**
	 * Inventory count classification type name 棚卸種別区分名.<p>
	 *
	 */
	public void stktk_typ_nm(String value) {
		setConstString(offset + 17, $stktk_typ_nm, value);
	}


	/**
	 * Inventory count status type 棚卸状況区分.<p>
	 *
	 */
	public String stktk_sts_typ() {
		return getConstString(offset + 18, $stktk_sts_typ);
	}

	/**
	 * Inventory count status type 棚卸状況区分.<p>
	 *
	 */
	public void stktk_sts_typ(String value) {
		setConstString(offset + 18, $stktk_sts_typ, value);
	}


	/**
	 * Inventory count status type name 棚卸状況区分名.<p>
	 *
	 */
	public String stktk_sts_typ_nm() {
		return getConstString(offset + 19, $stktk_sts_typ_nm);
	}

	/**
	 * Inventory count status type name 棚卸状況区分名.<p>
	 *
	 */
	public void stktk_sts_typ_nm(String value) {
		setConstString(offset + 19, $stktk_sts_typ_nm, value);
	}


	/**
	 * GR/GI control flg. 入出庫制御中ＦＬＧ.<p>
	 *
	 */
	public boolean io_ctrl_flg() {
		return getConstBoolean(offset + 20, $io_ctrl_flg);
	}

	/**
	 * GR/GI control flg. 入出庫制御中ＦＬＧ.<p>
	 *
	 */
	public void io_ctrl_flg(boolean value) {
		setConstBoolean(offset + 20, $io_ctrl_flg, value);
	}


	/**
	 * Keep counted qty. flg. 実棚数量保持ＦＬＧ.<p>
	 *
	 */
	public boolean act_qty_keep_flg() {
		return getConstBoolean(offset + 21, $act_qty_keep_flg);
	}

	/**
	 * Keep counted qty. flg. 実棚数量保持ＦＬＧ.<p>
	 *
	 */
	public void act_qty_keep_flg(boolean value) {
		setConstBoolean(offset + 21, $act_qty_keep_flg, value);
	}


	/**
	 * Last inventory base date 前回棚卸基準日.<p>
	 *
	 */
	public MCDate last_stktk_dt() {
		return getConstDate(offset + 22, $last_stktk_dt);
	}

	/**
	 * Last inventory base date 前回棚卸基準日.<p>
	 *
	 */
	public void last_stktk_dt(MCDate value) {
		setConstDate(offset + 22, $last_stktk_dt, value);
	}


	/**
	 * Inventory count start date and time 棚卸開始日時.<p>
	 *
	 */
	public MCDate stktk_st_tm() {
		return getConstDate(offset + 23, $stktk_st_tm);
	}

	/**
	 * Inventory count start date and time 棚卸開始日時.<p>
	 *
	 */
	public void stktk_st_tm(MCDate value) {
		setConstDate(offset + 23, $stktk_st_tm, value);
	}


	/**
	 * Inventory firm date and time 在庫確定日時.<p>
	 *
	 */
	public MCDate diff_upd_tm() {
		return getConstDate(offset + 24, $diff_upd_tm);
	}

	/**
	 * Inventory firm date and time 在庫確定日時.<p>
	 *
	 */
	public void diff_upd_tm(MCDate value) {
		setConstDate(offset + 24, $diff_upd_tm, value);
	}


	/**
	 * Latest inventory start date 最新棚卸開始日.<p>
	 *
	 */
	public MCDate latest_stktk_st_dt() {
		return getConstDate(offset + 25, $latest_stktk_st_dt);
	}

	/**
	 * Latest inventory start date 最新棚卸開始日.<p>
	 *
	 */
	public void latest_stktk_st_dt(MCDate value) {
		setConstDate(offset + 25, $latest_stktk_st_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 26, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 26, $usr_dpt_p, row);
	}


	/**
	 * Inventory count sheet remarks 棚卸表備考.<p>
	 *
	 */
	public String stktk_rpt_rmrks() {
		return getConstString(offset + 27, $stktk_rpt_rmrks);
	}

	/**
	 * Inventory count sheet remarks 棚卸表備考.<p>
	 *
	 */
	public void stktk_rpt_rmrks(String value) {
		setConstString(offset + 27, $stktk_rpt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String stktk_intr_rmrks() {
		return getConstString(offset + 28, $stktk_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void stktk_intr_rmrks(String value) {
		setConstString(offset + 28, $stktk_intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 29, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 29, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 30, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 30, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 31, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 31, $sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 32, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 32, $rts_msg_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 33, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 33, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 34, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 34, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 35, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 35, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 36, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 36, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 37, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 37, $ins_ts, value);
	}


	/**
	 * Inventory count control update counter 棚卸制御更新カウンタ.<p>
	 *
	 */
	public MCNumber stktk_upd_cntr() {
		return getConstNumber(offset + 38, $stktk_upd_cntr);
	}

	/**
	 * Inventory count control update counter 棚卸制御更新カウンタ.<p>
	 *
	 */
	public void stktk_upd_cntr(MCNumber value) {
		setConstNumber(offset + 38, $stktk_upd_cntr, value);
	}

	/**
	 * Inventory count control update counter 棚卸制御更新カウンタ.<p>
	 *
	 */
	public void stktk_upd_cntr(int value) {
		setConstNumber(offset + 38, $stktk_upd_cntr, value);
	}

	/**
	 * Inventory count control update counter 棚卸制御更新カウンタ.<p>
	 *
	 */
	public void stktk_upd_cntr(long value) {
		setConstNumber(offset + 38, $stktk_upd_cntr, value);
	}

	/**
	 * Inventory count control update counter 棚卸制御更新カウンタ.<p>
	 *
	 */
	public void stktk_upd_cntr(float value) {
		setConstNumber(offset + 38, $stktk_upd_cntr, value);
	}

	/**
	 * Inventory count control update counter 棚卸制御更新カウンタ.<p>
	 *
	 */
	public void stktk_upd_cntr(double value) {
		setConstNumber(offset + 38, $stktk_upd_cntr, value);
	}


	/**
	 * Last inventory update counter 前回棚卸更新カウンタ.<p>
	 *
	 */
	public MCNumber pre_stktk_upd_cntr() {
		return getConstNumber(offset + 39, $pre_stktk_upd_cntr);
	}

	/**
	 * Last inventory update counter 前回棚卸更新カウンタ.<p>
	 *
	 */
	public void pre_stktk_upd_cntr(MCNumber value) {
		setConstNumber(offset + 39, $pre_stktk_upd_cntr, value);
	}

	/**
	 * Last inventory update counter 前回棚卸更新カウンタ.<p>
	 *
	 */
	public void pre_stktk_upd_cntr(int value) {
		setConstNumber(offset + 39, $pre_stktk_upd_cntr, value);
	}

	/**
	 * Last inventory update counter 前回棚卸更新カウンタ.<p>
	 *
	 */
	public void pre_stktk_upd_cntr(long value) {
		setConstNumber(offset + 39, $pre_stktk_upd_cntr, value);
	}

	/**
	 * Last inventory update counter 前回棚卸更新カウンタ.<p>
	 *
	 */
	public void pre_stktk_upd_cntr(float value) {
		setConstNumber(offset + 39, $pre_stktk_upd_cntr, value);
	}

	/**
	 * Last inventory update counter 前回棚卸更新カウンタ.<p>
	 *
	 */
	public void pre_stktk_upd_cntr(double value) {
		setConstNumber(offset + 39, $pre_stktk_upd_cntr, value);
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
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 42, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 42, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 43, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 43, $upd_func_nm, value);
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


	public String getString(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
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
		if ($stktk_typ.equalsIgnoreCase(name)) {
			return stktk_typ();
		}
		if ($stktk_typ_nm.equalsIgnoreCase(name)) {
			return stktk_typ_nm();
		}
		if ($stktk_sts_typ.equalsIgnoreCase(name)) {
			return stktk_sts_typ();
		}
		if ($stktk_sts_typ_nm.equalsIgnoreCase(name)) {
			return stktk_sts_typ_nm();
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			return stktk_rpt_rmrks();
		}
		if ($stktk_intr_rmrks.equalsIgnoreCase(name)) {
			return stktk_intr_rmrks();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($stktk_upd_cntr.equalsIgnoreCase(name)) {
			return stktk_upd_cntr();
		}
		if ($pre_stktk_upd_cntr.equalsIgnoreCase(name)) {
			return pre_stktk_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ctrl_tgt_dt.equalsIgnoreCase(name)) {
			return ctrl_tgt_dt();
		}
		if ($last_stktk_dt.equalsIgnoreCase(name)) {
			return last_stktk_dt();
		}
		if ($stktk_st_tm.equalsIgnoreCase(name)) {
			return stktk_st_tm();
		}
		if ($diff_upd_tm.equalsIgnoreCase(name)) {
			return diff_upd_tm();
		}
		if ($latest_stktk_st_dt.equalsIgnoreCase(name)) {
			return latest_stktk_st_dt();
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
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($not_chk_tor_flg.equalsIgnoreCase(name)) {
			return not_chk_tor_flg();
		}
		if ($io_ctrl_flg.equalsIgnoreCase(name)) {
			return io_ctrl_flg();
		}
		if ($act_qty_keep_flg.equalsIgnoreCase(name)) {
			return act_qty_keep_flg();
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
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
		if ($stktk_typ.equalsIgnoreCase(name)) {
			return stktk_typ();
		}
		if ($stktk_typ_nm.equalsIgnoreCase(name)) {
			return stktk_typ_nm();
		}
		if ($stktk_sts_typ.equalsIgnoreCase(name)) {
			return stktk_sts_typ();
		}
		if ($stktk_sts_typ_nm.equalsIgnoreCase(name)) {
			return stktk_sts_typ_nm();
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			return stktk_rpt_rmrks();
		}
		if ($stktk_intr_rmrks.equalsIgnoreCase(name)) {
			return stktk_intr_rmrks();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($stktk_upd_cntr.equalsIgnoreCase(name)) {
			return stktk_upd_cntr();
		}
		if ($pre_stktk_upd_cntr.equalsIgnoreCase(name)) {
			return pre_stktk_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ctrl_tgt_dt.equalsIgnoreCase(name)) {
			return ctrl_tgt_dt();
		}
		if ($last_stktk_dt.equalsIgnoreCase(name)) {
			return last_stktk_dt();
		}
		if ($stktk_st_tm.equalsIgnoreCase(name)) {
			return stktk_st_tm();
		}
		if ($diff_upd_tm.equalsIgnoreCase(name)) {
			return diff_upd_tm();
		}
		if ($latest_stktk_st_dt.equalsIgnoreCase(name)) {
			return latest_stktk_st_dt();
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
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($not_chk_tor_flg.equalsIgnoreCase(name)) {
			return not_chk_tor_flg();
		}
		if ($io_ctrl_flg.equalsIgnoreCase(name)) {
			return io_ctrl_flg();
		}
		if ($act_qty_keep_flg.equalsIgnoreCase(name)) {
			return act_qty_keep_flg();
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
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
		if ($stktk_typ.equalsIgnoreCase(name)) {
			stktk_typ(value);
			return;
		}
		if ($stktk_typ_nm.equalsIgnoreCase(name)) {
			stktk_typ_nm(value);
			return;
		}
		if ($stktk_sts_typ.equalsIgnoreCase(name)) {
			stktk_sts_typ(value);
			return;
		}
		if ($stktk_sts_typ_nm.equalsIgnoreCase(name)) {
			stktk_sts_typ_nm(value);
			return;
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			stktk_rpt_rmrks(value);
			return;
		}
		if ($stktk_intr_rmrks.equalsIgnoreCase(name)) {
			stktk_intr_rmrks(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($stktk_upd_cntr.equalsIgnoreCase(name)) {
			stktk_upd_cntr(value);
			return;
		}
		if ($pre_stktk_upd_cntr.equalsIgnoreCase(name)) {
			pre_stktk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($stktk_upd_cntr.equalsIgnoreCase(name)) {
			stktk_upd_cntr(value);
			return;
		}
		if ($pre_stktk_upd_cntr.equalsIgnoreCase(name)) {
			pre_stktk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($stktk_upd_cntr.equalsIgnoreCase(name)) {
			stktk_upd_cntr(value);
			return;
		}
		if ($pre_stktk_upd_cntr.equalsIgnoreCase(name)) {
			pre_stktk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($stktk_upd_cntr.equalsIgnoreCase(name)) {
			stktk_upd_cntr(value);
			return;
		}
		if ($pre_stktk_upd_cntr.equalsIgnoreCase(name)) {
			pre_stktk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($stktk_upd_cntr.equalsIgnoreCase(name)) {
			stktk_upd_cntr(value);
			return;
		}
		if ($pre_stktk_upd_cntr.equalsIgnoreCase(name)) {
			pre_stktk_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ctrl_tgt_dt.equalsIgnoreCase(name)) {
			ctrl_tgt_dt(value);
			return;
		}
		if ($last_stktk_dt.equalsIgnoreCase(name)) {
			last_stktk_dt(value);
			return;
		}
		if ($stktk_st_tm.equalsIgnoreCase(name)) {
			stktk_st_tm(value);
			return;
		}
		if ($diff_upd_tm.equalsIgnoreCase(name)) {
			diff_upd_tm(value);
			return;
		}
		if ($latest_stktk_st_dt.equalsIgnoreCase(name)) {
			latest_stktk_st_dt(value);
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
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($not_chk_tor_flg.equalsIgnoreCase(name)) {
			not_chk_tor_flg(value);
			return;
		}
		if ($io_ctrl_flg.equalsIgnoreCase(name)) {
			io_ctrl_flg(value);
			return;
		}
		if ($act_qty_keep_flg.equalsIgnoreCase(name)) {
			act_qty_keep_flg(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
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
		if ($stktk_typ.equalsIgnoreCase(name)) {
			stktk_typ(value);
			return;
		}
		if ($stktk_typ_nm.equalsIgnoreCase(name)) {
			stktk_typ_nm(value);
			return;
		}
		if ($stktk_sts_typ.equalsIgnoreCase(name)) {
			stktk_sts_typ(value);
			return;
		}
		if ($stktk_sts_typ_nm.equalsIgnoreCase(name)) {
			stktk_sts_typ_nm(value);
			return;
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			stktk_rpt_rmrks(value);
			return;
		}
		if ($stktk_intr_rmrks.equalsIgnoreCase(name)) {
			stktk_intr_rmrks(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($stktk_upd_cntr.equalsIgnoreCase(name)) {
			stktk_upd_cntr(value);
			return;
		}
		if ($pre_stktk_upd_cntr.equalsIgnoreCase(name)) {
			pre_stktk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($stktk_upd_cntr.equalsIgnoreCase(name)) {
			stktk_upd_cntr(value);
			return;
		}
		if ($pre_stktk_upd_cntr.equalsIgnoreCase(name)) {
			pre_stktk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($stktk_upd_cntr.equalsIgnoreCase(name)) {
			stktk_upd_cntr(value);
			return;
		}
		if ($pre_stktk_upd_cntr.equalsIgnoreCase(name)) {
			pre_stktk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($stktk_upd_cntr.equalsIgnoreCase(name)) {
			stktk_upd_cntr(value);
			return;
		}
		if ($pre_stktk_upd_cntr.equalsIgnoreCase(name)) {
			pre_stktk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($stktk_upd_cntr.equalsIgnoreCase(name)) {
			stktk_upd_cntr(value);
			return;
		}
		if ($pre_stktk_upd_cntr.equalsIgnoreCase(name)) {
			pre_stktk_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ctrl_tgt_dt.equalsIgnoreCase(name)) {
			ctrl_tgt_dt(value);
			return;
		}
		if ($last_stktk_dt.equalsIgnoreCase(name)) {
			last_stktk_dt(value);
			return;
		}
		if ($stktk_st_tm.equalsIgnoreCase(name)) {
			stktk_st_tm(value);
			return;
		}
		if ($diff_upd_tm.equalsIgnoreCase(name)) {
			diff_upd_tm(value);
			return;
		}
		if ($latest_stktk_st_dt.equalsIgnoreCase(name)) {
			latest_stktk_st_dt(value);
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
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($not_chk_tor_flg.equalsIgnoreCase(name)) {
			not_chk_tor_flg(value);
			return;
		}
		if ($io_ctrl_flg.equalsIgnoreCase(name)) {
			io_ctrl_flg(value);
			return;
		}
		if ($act_qty_keep_flg.equalsIgnoreCase(name)) {
			act_qty_keep_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
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
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
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

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

	/**
	 * Process result status type name 処理結果状況区分名.<p>
	 *
	 */
	public String rtn_sts_typ_nm() {
		return rts_msg_p().rtn_sts_typ_nm();
	}

	/**
	 * Process result status type name 処理結果状況区分名.<p>
	 *
	 */
	public void rtn_sts_typ_nm(String value) {
		rts_msg_p().rtn_sts_typ_nm(value);
	}

	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public String msg_id() {
		return rts_msg_p().msg_id();
	}

	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public void msg_id(String value) {
		rts_msg_p().msg_id(value);
	}

	/**
	 * Result info. 結果情報.<p>
	 *
	 */
	public String msg() {
		return rts_msg_p().msg();
	}

	/**
	 * Result info. 結果情報.<p>
	 *
	 */
	public void msg(String value) {
		rts_msg_p().msg(value);
	}

}

