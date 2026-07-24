package mcframe.serverMABC.MABCL0700;

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
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm_lcl = "loc_nm_lcl";
	/**
	 * Standard Location name 標準場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Asset management dept. cd. 資産管理部門ＣＤ.<p>
	 *
	 */
	public static final String $asst_dpt_cd = "asst_dpt_cd";
	/**
	 * Asset management dept. name 資産管理部門名.<p>
	 *
	 */
	public static final String $asst_dpt_nm = "asst_dpt_nm";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public static final String $sls_dpt_nm = "sls_dpt_nm";
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
	 * Distribution standard location 物流標準場所.<p>
	 *
	 */
	public static final String $lg_def_flg = "lg_def_flg";
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
	 * Subcontracting result leading 外注実績先行.<p>
	 *
	 */
	public static final String $pre_outsrc_act_flg = "pre_outsrc_act_flg";
	/**
	 * Direct-delivery supply inspection 直送支給検査.<p>
	 *
	 */
	public static final String $ddlv_prov_insp_flg = "ddlv_prov_insp_flg";
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public static final String $cal_nm = "cal_nm";
	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public static final String $loc_mng_typ = "loc_mng_typ";
	/**
	 * Controlling site type name 管轄区分名.<p>
	 *
	 */
	public static final String $loc_mng_typ_nm = "loc_mng_typ_nm";
	/**
	 * Numbering ID 発番ＩＤ.<p>
	 *
	 */
	public static final String $num_id = "num_id";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Country name 国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Report output locale name 帳票出力ロケール名.<p>
	 *
	 */
	public static final String $prnt_lcl_nm = "prnt_lcl_nm";
	/**
	 * For inventory count 棚卸対象.<p>
	 *
	 */
	public static final String $stktk_tgt_flg = "stktk_tgt_flg";
	/**
	 * Logical inventory initial display 理論在庫初期表示.<p>
	 *
	 */
	public static final String $stktk_tor_disp_flg = "stktk_tor_disp_flg";
	/**
	 * Exclude logical inventory qty. 0 理論在庫数０除外.<p>
	 *
	 */
	public static final String $stktk_tor_ex_zero_flg = "stktk_tor_ex_zero_flg";
	/**
	 * Counted variance qty. 0 excluded 実棚差異数０除外.<p>
	 *
	 */
	public static final String $stktk_act_ex_zero_flg = "stktk_act_ex_zero_flg";
	/**
	 * Output inventory count amount 棚卸金額出力.<p>
	 *
	 */
	public static final String $stktk_amt_flg = "stktk_amt_flg";
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	/**
	 * Allocation limited 引当限定.<p>
	 *
	 */
	public static final String $alloc_lmt_flg = "alloc_lmt_flg";
	/**
	 * SKU transfer at GI 出庫時荷姿振替.<p>
	 *
	 */
	public static final String $gi_pack_xfer_flg = "gi_pack_xfer_flg";
	/**
	 * VMI recording at GI 出庫時ＶＭＩ計上.<p>
	 *
	 */
	public static final String $gi_vmi_flg = "gi_vmi_flg";
	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public static final String $rsrc_cd1 = "rsrc_cd1";
	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public static final String $rsrc_nm1 = "rsrc_nm1";
	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public static final String $rsrc_cd2 = "rsrc_cd2";
	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public static final String $rsrc_nm2 = "rsrc_nm2";
	/**
	 * External system location type 外部システム場所区分.<p>
	 *
	 */
	public static final String $ext_sys_loc_typ = "ext_sys_loc_typ";
	/**
	 * External system location type name 外部システム場所区分名.<p>
	 *
	 */
	public static final String $ext_sys_loc_typ_nm = "ext_sys_loc_typ_nm";
	/**
	 * Location allocation group 場所配賦グループ.<p>
	 *
	 */
	public static final String $loc_alc_grp = "loc_alc_grp";
	/**
	 * Address setting 住所設定.<p>
	 *
	 */
	public static final String $addr_flg = "addr_flg";
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public static final String $tel = "tel";
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public static final String $fax = "fax";
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
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_lcl_META = createCommonMeta($loc_nm_lcl, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta asst_dpt_cd_META = createCommonMeta($asst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta asst_dpt_nm_META = createCommonMeta($asst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta lg_def_flg_META = createCommonMeta($lg_def_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta pre_outsrc_act_flg_META = createCommonMeta($pre_outsrc_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ddlv_prov_insp_flg_META = createCommonMeta($ddlv_prov_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta cal_nm_META = createCommonMeta($cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta loc_mng_typ_META = createCommonMeta($loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta loc_mng_typ_nm_META = createCommonMeta($loc_mng_typ_nm, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP_NM);
	public static final MCMeta num_id_META = createCommonMeta($num_id, mcframe.commonMA.meta.MA_META.NUM_ID);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta prnt_lcl_nm_META = createCommonMeta($prnt_lcl_nm, mcframe.commonMA.meta.MA_META.LCL_NM);
	public static final MCMeta stktk_tgt_flg_META = createCommonMeta($stktk_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_tor_disp_flg_META = createCommonMeta($stktk_tor_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_tor_ex_zero_flg_META = createCommonMeta($stktk_tor_ex_zero_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_act_ex_zero_flg_META = createCommonMeta($stktk_act_ex_zero_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_amt_flg_META = createCommonMeta($stktk_amt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_lmt_flg_META = createCommonMeta($alloc_lmt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_pack_xfer_flg_META = createCommonMeta($gi_pack_xfer_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_vmi_flg_META = createCommonMeta($gi_vmi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rsrc_cd1_META = createCommonMeta($rsrc_cd1, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_nm1_META = createCommonMeta($rsrc_nm1, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_cd2_META = createCommonMeta($rsrc_cd2, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_nm2_META = createCommonMeta($rsrc_nm2, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta ext_sys_loc_typ_META = createCommonMeta($ext_sys_loc_typ, mcframe.commonMA.meta.MA_META.EXT_SYS_LOC_TYP);
	public static final MCMeta ext_sys_loc_typ_nm_META = createCommonMeta($ext_sys_loc_typ_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_LOC_TYP_NM);
	public static final MCMeta loc_alc_grp_META = createCommonMeta($loc_alc_grp, mcframe.commonMA.meta.MA_META.LOC_ALC_GRP);
	public static final MCMeta addr_flg_META = createCommonMeta($addr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
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
			loc_cd_META,
			loc_nm_lcl_META,
			loc_nm_META,
			asst_dpt_cd_META,
			asst_dpt_nm_META,
			sls_dpt_cd_META,
			sls_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			site_cd_META,
			site_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			lg_def_flg_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			pre_outsrc_act_flg_META,
			ddlv_prov_insp_flg_META,
			cal_cd_META,
			cal_nm_META,
			loc_mng_typ_META,
			loc_mng_typ_nm_META,
			num_id_META,
			cntry_cd_META,
			cntry_nm_META,
			prnt_lcl_cd_META,
			prnt_lcl_nm_META,
			stktk_tgt_flg_META,
			stktk_tor_disp_flg_META,
			stktk_tor_ex_zero_flg_META,
			stktk_act_ex_zero_flg_META,
			stktk_amt_flg_META,
			str_ln_tgt_flg_META,
			alloc_lmt_flg_META,
			gi_pack_xfer_flg_META,
			gi_vmi_flg_META,
			rsrc_cd1_META,
			rsrc_nm1_META,
			rsrc_cd2_META,
			rsrc_nm2_META,
			ext_sys_loc_typ_META,
			ext_sys_loc_typ_nm_META,
			loc_alc_grp_META,
			addr_flg_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			tel_META,
			fax_META,
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
				{$loc_mng_typ, "MAC_LOC_MNG_TYP"},	// loc_mng_typ
				{$ext_sys_loc_typ, "MAC_EXT_SYS_LOC_TYP"}	// ext_sys_loc_typ
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
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 1, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 1, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm_lcl() {
		return getConstString(offset + 2, $loc_nm_lcl);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm_lcl(String value) {
		setConstString(offset + 2, $loc_nm_lcl, value);
	}


	/**
	 * Standard Location name 標準場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 3, $loc_nm);
	}

	/**
	 * Standard Location name 標準場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 3, $loc_nm, value);
	}


	/**
	 * Asset management dept. cd. 資産管理部門ＣＤ.<p>
	 *
	 */
	public String asst_dpt_cd() {
		return getConstString(offset + 4, $asst_dpt_cd);
	}

	/**
	 * Asset management dept. cd. 資産管理部門ＣＤ.<p>
	 *
	 */
	public void asst_dpt_cd(String value) {
		setConstString(offset + 4, $asst_dpt_cd, value);
	}


	/**
	 * Asset management dept. name 資産管理部門名.<p>
	 *
	 */
	public String asst_dpt_nm() {
		return getConstString(offset + 5, $asst_dpt_nm);
	}

	/**
	 * Asset management dept. name 資産管理部門名.<p>
	 *
	 */
	public void asst_dpt_nm(String value) {
		setConstString(offset + 5, $asst_dpt_nm, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 6, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 6, $sls_dpt_cd, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 7, $sls_dpt_nm);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 7, $sls_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 9, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 9, $wg_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 10, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 10, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 11, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 11, $site_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 12, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 12, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 13, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 13, $lg_grp_nm, value);
	}


	/**
	 * Distribution standard location 物流標準場所.<p>
	 *
	 */
	public boolean lg_def_flg() {
		return getConstBoolean(offset + 14, $lg_def_flg);
	}

	/**
	 * Distribution standard location 物流標準場所.<p>
	 *
	 */
	public void lg_def_flg(boolean value) {
		setConstBoolean(offset + 14, $lg_def_flg, value);
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
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 19, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 19, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 20, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 20, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 21, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 21, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 22, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 22, $maker_nm, value);
	}


	/**
	 * Subcontracting result leading 外注実績先行.<p>
	 *
	 */
	public boolean pre_outsrc_act_flg() {
		return getConstBoolean(offset + 23, $pre_outsrc_act_flg);
	}

	/**
	 * Subcontracting result leading 外注実績先行.<p>
	 *
	 */
	public void pre_outsrc_act_flg(boolean value) {
		setConstBoolean(offset + 23, $pre_outsrc_act_flg, value);
	}


	/**
	 * Direct-delivery supply inspection 直送支給検査.<p>
	 *
	 */
	public boolean ddlv_prov_insp_flg() {
		return getConstBoolean(offset + 24, $ddlv_prov_insp_flg);
	}

	/**
	 * Direct-delivery supply inspection 直送支給検査.<p>
	 *
	 */
	public void ddlv_prov_insp_flg(boolean value) {
		setConstBoolean(offset + 24, $ddlv_prov_insp_flg, value);
	}


	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 25, $cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 25, $cal_cd, value);
	}


	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public String cal_nm() {
		return getConstString(offset + 26, $cal_nm);
	}

	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public void cal_nm(String value) {
		setConstString(offset + 26, $cal_nm, value);
	}


	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public String loc_mng_typ() {
		return getConstString(offset + 27, $loc_mng_typ);
	}

	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public void loc_mng_typ(String value) {
		setConstString(offset + 27, $loc_mng_typ, value);
	}


	/**
	 * Controlling site type name 管轄区分名.<p>
	 *
	 */
	public String loc_mng_typ_nm() {
		return getConstString(offset + 28, $loc_mng_typ_nm);
	}

	/**
	 * Controlling site type name 管轄区分名.<p>
	 *
	 */
	public void loc_mng_typ_nm(String value) {
		setConstString(offset + 28, $loc_mng_typ_nm, value);
	}


	/**
	 * Numbering ID 発番ＩＤ.<p>
	 *
	 */
	public String num_id() {
		return getConstString(offset + 29, $num_id);
	}

	/**
	 * Numbering ID 発番ＩＤ.<p>
	 *
	 */
	public void num_id(String value) {
		setConstString(offset + 29, $num_id, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 30, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 30, $cntry_cd, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 31, $cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 31, $cntry_nm, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 32, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 32, $prnt_lcl_cd, value);
	}


	/**
	 * Report output locale name 帳票出力ロケール名.<p>
	 *
	 */
	public String prnt_lcl_nm() {
		return getConstString(offset + 33, $prnt_lcl_nm);
	}

	/**
	 * Report output locale name 帳票出力ロケール名.<p>
	 *
	 */
	public void prnt_lcl_nm(String value) {
		setConstString(offset + 33, $prnt_lcl_nm, value);
	}


	/**
	 * For inventory count 棚卸対象.<p>
	 *
	 */
	public boolean stktk_tgt_flg() {
		return getConstBoolean(offset + 34, $stktk_tgt_flg);
	}

	/**
	 * For inventory count 棚卸対象.<p>
	 *
	 */
	public void stktk_tgt_flg(boolean value) {
		setConstBoolean(offset + 34, $stktk_tgt_flg, value);
	}


	/**
	 * Logical inventory initial display 理論在庫初期表示.<p>
	 *
	 */
	public boolean stktk_tor_disp_flg() {
		return getConstBoolean(offset + 35, $stktk_tor_disp_flg);
	}

	/**
	 * Logical inventory initial display 理論在庫初期表示.<p>
	 *
	 */
	public void stktk_tor_disp_flg(boolean value) {
		setConstBoolean(offset + 35, $stktk_tor_disp_flg, value);
	}


	/**
	 * Exclude logical inventory qty. 0 理論在庫数０除外.<p>
	 *
	 */
	public boolean stktk_tor_ex_zero_flg() {
		return getConstBoolean(offset + 36, $stktk_tor_ex_zero_flg);
	}

	/**
	 * Exclude logical inventory qty. 0 理論在庫数０除外.<p>
	 *
	 */
	public void stktk_tor_ex_zero_flg(boolean value) {
		setConstBoolean(offset + 36, $stktk_tor_ex_zero_flg, value);
	}


	/**
	 * Counted variance qty. 0 excluded 実棚差異数０除外.<p>
	 *
	 */
	public boolean stktk_act_ex_zero_flg() {
		return getConstBoolean(offset + 37, $stktk_act_ex_zero_flg);
	}

	/**
	 * Counted variance qty. 0 excluded 実棚差異数０除外.<p>
	 *
	 */
	public void stktk_act_ex_zero_flg(boolean value) {
		setConstBoolean(offset + 37, $stktk_act_ex_zero_flg, value);
	}


	/**
	 * Output inventory count amount 棚卸金額出力.<p>
	 *
	 */
	public boolean stktk_amt_flg() {
		return getConstBoolean(offset + 38, $stktk_amt_flg);
	}

	/**
	 * Output inventory count amount 棚卸金額出力.<p>
	 *
	 */
	public void stktk_amt_flg(boolean value) {
		setConstBoolean(offset + 38, $stktk_amt_flg, value);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 39, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 39, $str_ln_tgt_flg, value);
	}


	/**
	 * Allocation limited 引当限定.<p>
	 *
	 */
	public boolean alloc_lmt_flg() {
		return getConstBoolean(offset + 40, $alloc_lmt_flg);
	}

	/**
	 * Allocation limited 引当限定.<p>
	 *
	 */
	public void alloc_lmt_flg(boolean value) {
		setConstBoolean(offset + 40, $alloc_lmt_flg, value);
	}


	/**
	 * SKU transfer at GI 出庫時荷姿振替.<p>
	 *
	 */
	public boolean gi_pack_xfer_flg() {
		return getConstBoolean(offset + 41, $gi_pack_xfer_flg);
	}

	/**
	 * SKU transfer at GI 出庫時荷姿振替.<p>
	 *
	 */
	public void gi_pack_xfer_flg(boolean value) {
		setConstBoolean(offset + 41, $gi_pack_xfer_flg, value);
	}


	/**
	 * VMI recording at GI 出庫時ＶＭＩ計上.<p>
	 *
	 */
	public boolean gi_vmi_flg() {
		return getConstBoolean(offset + 42, $gi_vmi_flg);
	}

	/**
	 * VMI recording at GI 出庫時ＶＭＩ計上.<p>
	 *
	 */
	public void gi_vmi_flg(boolean value) {
		setConstBoolean(offset + 42, $gi_vmi_flg, value);
	}


	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public String rsrc_cd1() {
		return getConstString(offset + 43, $rsrc_cd1);
	}

	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public void rsrc_cd1(String value) {
		setConstString(offset + 43, $rsrc_cd1, value);
	}


	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public String rsrc_nm1() {
		return getConstString(offset + 44, $rsrc_nm1);
	}

	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public void rsrc_nm1(String value) {
		setConstString(offset + 44, $rsrc_nm1, value);
	}


	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public String rsrc_cd2() {
		return getConstString(offset + 45, $rsrc_cd2);
	}

	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public void rsrc_cd2(String value) {
		setConstString(offset + 45, $rsrc_cd2, value);
	}


	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public String rsrc_nm2() {
		return getConstString(offset + 46, $rsrc_nm2);
	}

	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public void rsrc_nm2(String value) {
		setConstString(offset + 46, $rsrc_nm2, value);
	}


	/**
	 * External system location type 外部システム場所区分.<p>
	 *
	 */
	public String ext_sys_loc_typ() {
		return getConstString(offset + 47, $ext_sys_loc_typ);
	}

	/**
	 * External system location type 外部システム場所区分.<p>
	 *
	 */
	public void ext_sys_loc_typ(String value) {
		setConstString(offset + 47, $ext_sys_loc_typ, value);
	}


	/**
	 * External system location type name 外部システム場所区分名.<p>
	 *
	 */
	public String ext_sys_loc_typ_nm() {
		return getConstString(offset + 48, $ext_sys_loc_typ_nm);
	}

	/**
	 * External system location type name 外部システム場所区分名.<p>
	 *
	 */
	public void ext_sys_loc_typ_nm(String value) {
		setConstString(offset + 48, $ext_sys_loc_typ_nm, value);
	}


	/**
	 * Location allocation group 場所配賦グループ.<p>
	 *
	 */
	public String loc_alc_grp() {
		return getConstString(offset + 49, $loc_alc_grp);
	}

	/**
	 * Location allocation group 場所配賦グループ.<p>
	 *
	 */
	public void loc_alc_grp(String value) {
		setConstString(offset + 49, $loc_alc_grp, value);
	}


	/**
	 * Address setting 住所設定.<p>
	 *
	 */
	public boolean addr_flg() {
		return getConstBoolean(offset + 50, $addr_flg);
	}

	/**
	 * Address setting 住所設定.<p>
	 *
	 */
	public void addr_flg(boolean value) {
		setConstBoolean(offset + 50, $addr_flg, value);
	}


	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 51, $zip_cd);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 51, $zip_cd, value);
	}


	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 52, $addr1);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 52, $addr1, value);
	}


	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 53, $addr2);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 53, $addr2, value);
	}


	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 54, $addr3);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 54, $addr3, value);
	}


	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 55, $addr4);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 55, $addr4, value);
	}


	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 56, $tel);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 56, $tel, value);
	}


	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 57, $fax);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 57, $fax, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 58, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 58, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 59, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 59, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 60, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 60, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 61, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 61, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 62, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 62, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 63, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 63, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 64, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 64, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 65, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 65, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 66, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 66, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 67, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 67, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 68, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 68, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 69, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 69, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 70, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 70, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 71, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 71, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 72, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 72, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 73, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 73, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 74, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 74, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 75, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 75, $del_ts, value);
	}


	public String getString(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm_lcl.equalsIgnoreCase(name)) {
			return loc_nm_lcl();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($asst_dpt_cd.equalsIgnoreCase(name)) {
			return asst_dpt_cd();
		}
		if ($asst_dpt_nm.equalsIgnoreCase(name)) {
			return asst_dpt_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
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
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			return loc_mng_typ();
		}
		if ($loc_mng_typ_nm.equalsIgnoreCase(name)) {
			return loc_mng_typ_nm();
		}
		if ($num_id.equalsIgnoreCase(name)) {
			return num_id();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($prnt_lcl_nm.equalsIgnoreCase(name)) {
			return prnt_lcl_nm();
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			return rsrc_cd1();
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			return rsrc_nm1();
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			return rsrc_cd2();
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			return rsrc_nm2();
		}
		if ($ext_sys_loc_typ.equalsIgnoreCase(name)) {
			return ext_sys_loc_typ();
		}
		if ($ext_sys_loc_typ_nm.equalsIgnoreCase(name)) {
			return ext_sys_loc_typ_nm();
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			return loc_alc_grp();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
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
		if ($lg_def_flg.equalsIgnoreCase(name)) {
			return lg_def_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($ddlv_prov_insp_flg.equalsIgnoreCase(name)) {
			return ddlv_prov_insp_flg();
		}
		if ($stktk_tgt_flg.equalsIgnoreCase(name)) {
			return stktk_tgt_flg();
		}
		if ($stktk_tor_disp_flg.equalsIgnoreCase(name)) {
			return stktk_tor_disp_flg();
		}
		if ($stktk_tor_ex_zero_flg.equalsIgnoreCase(name)) {
			return stktk_tor_ex_zero_flg();
		}
		if ($stktk_act_ex_zero_flg.equalsIgnoreCase(name)) {
			return stktk_act_ex_zero_flg();
		}
		if ($stktk_amt_flg.equalsIgnoreCase(name)) {
			return stktk_amt_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($alloc_lmt_flg.equalsIgnoreCase(name)) {
			return alloc_lmt_flg();
		}
		if ($gi_pack_xfer_flg.equalsIgnoreCase(name)) {
			return gi_pack_xfer_flg();
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			return gi_vmi_flg();
		}
		if ($addr_flg.equalsIgnoreCase(name)) {
			return addr_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm_lcl.equalsIgnoreCase(name)) {
			return loc_nm_lcl();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($asst_dpt_cd.equalsIgnoreCase(name)) {
			return asst_dpt_cd();
		}
		if ($asst_dpt_nm.equalsIgnoreCase(name)) {
			return asst_dpt_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
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
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			return loc_mng_typ();
		}
		if ($loc_mng_typ_nm.equalsIgnoreCase(name)) {
			return loc_mng_typ_nm();
		}
		if ($num_id.equalsIgnoreCase(name)) {
			return num_id();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($prnt_lcl_nm.equalsIgnoreCase(name)) {
			return prnt_lcl_nm();
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			return rsrc_cd1();
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			return rsrc_nm1();
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			return rsrc_cd2();
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			return rsrc_nm2();
		}
		if ($ext_sys_loc_typ.equalsIgnoreCase(name)) {
			return ext_sys_loc_typ();
		}
		if ($ext_sys_loc_typ_nm.equalsIgnoreCase(name)) {
			return ext_sys_loc_typ_nm();
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			return loc_alc_grp();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
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
		if ($lg_def_flg.equalsIgnoreCase(name)) {
			return lg_def_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($ddlv_prov_insp_flg.equalsIgnoreCase(name)) {
			return ddlv_prov_insp_flg();
		}
		if ($stktk_tgt_flg.equalsIgnoreCase(name)) {
			return stktk_tgt_flg();
		}
		if ($stktk_tor_disp_flg.equalsIgnoreCase(name)) {
			return stktk_tor_disp_flg();
		}
		if ($stktk_tor_ex_zero_flg.equalsIgnoreCase(name)) {
			return stktk_tor_ex_zero_flg();
		}
		if ($stktk_act_ex_zero_flg.equalsIgnoreCase(name)) {
			return stktk_act_ex_zero_flg();
		}
		if ($stktk_amt_flg.equalsIgnoreCase(name)) {
			return stktk_amt_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($alloc_lmt_flg.equalsIgnoreCase(name)) {
			return alloc_lmt_flg();
		}
		if ($gi_pack_xfer_flg.equalsIgnoreCase(name)) {
			return gi_pack_xfer_flg();
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			return gi_vmi_flg();
		}
		if ($addr_flg.equalsIgnoreCase(name)) {
			return addr_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm_lcl.equalsIgnoreCase(name)) {
			loc_nm_lcl(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($asst_dpt_cd.equalsIgnoreCase(name)) {
			asst_dpt_cd(value);
			return;
		}
		if ($asst_dpt_nm.equalsIgnoreCase(name)) {
			asst_dpt_nm(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			cal_nm(value);
			return;
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			loc_mng_typ(value);
			return;
		}
		if ($loc_mng_typ_nm.equalsIgnoreCase(name)) {
			loc_mng_typ_nm(value);
			return;
		}
		if ($num_id.equalsIgnoreCase(name)) {
			num_id(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($prnt_lcl_nm.equalsIgnoreCase(name)) {
			prnt_lcl_nm(value);
			return;
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			rsrc_cd1(value);
			return;
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			rsrc_nm1(value);
			return;
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			rsrc_cd2(value);
			return;
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			rsrc_nm2(value);
			return;
		}
		if ($ext_sys_loc_typ.equalsIgnoreCase(name)) {
			ext_sys_loc_typ(value);
			return;
		}
		if ($ext_sys_loc_typ_nm.equalsIgnoreCase(name)) {
			ext_sys_loc_typ_nm(value);
			return;
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			loc_alc_grp(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
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
		if ($lg_def_flg.equalsIgnoreCase(name)) {
			lg_def_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($ddlv_prov_insp_flg.equalsIgnoreCase(name)) {
			ddlv_prov_insp_flg(value);
			return;
		}
		if ($stktk_tgt_flg.equalsIgnoreCase(name)) {
			stktk_tgt_flg(value);
			return;
		}
		if ($stktk_tor_disp_flg.equalsIgnoreCase(name)) {
			stktk_tor_disp_flg(value);
			return;
		}
		if ($stktk_tor_ex_zero_flg.equalsIgnoreCase(name)) {
			stktk_tor_ex_zero_flg(value);
			return;
		}
		if ($stktk_act_ex_zero_flg.equalsIgnoreCase(name)) {
			stktk_act_ex_zero_flg(value);
			return;
		}
		if ($stktk_amt_flg.equalsIgnoreCase(name)) {
			stktk_amt_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($alloc_lmt_flg.equalsIgnoreCase(name)) {
			alloc_lmt_flg(value);
			return;
		}
		if ($gi_pack_xfer_flg.equalsIgnoreCase(name)) {
			gi_pack_xfer_flg(value);
			return;
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			gi_vmi_flg(value);
			return;
		}
		if ($addr_flg.equalsIgnoreCase(name)) {
			addr_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm_lcl.equalsIgnoreCase(name)) {
			loc_nm_lcl(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($asst_dpt_cd.equalsIgnoreCase(name)) {
			asst_dpt_cd(value);
			return;
		}
		if ($asst_dpt_nm.equalsIgnoreCase(name)) {
			asst_dpt_nm(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			cal_nm(value);
			return;
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			loc_mng_typ(value);
			return;
		}
		if ($loc_mng_typ_nm.equalsIgnoreCase(name)) {
			loc_mng_typ_nm(value);
			return;
		}
		if ($num_id.equalsIgnoreCase(name)) {
			num_id(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($prnt_lcl_nm.equalsIgnoreCase(name)) {
			prnt_lcl_nm(value);
			return;
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			rsrc_cd1(value);
			return;
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			rsrc_nm1(value);
			return;
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			rsrc_cd2(value);
			return;
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			rsrc_nm2(value);
			return;
		}
		if ($ext_sys_loc_typ.equalsIgnoreCase(name)) {
			ext_sys_loc_typ(value);
			return;
		}
		if ($ext_sys_loc_typ_nm.equalsIgnoreCase(name)) {
			ext_sys_loc_typ_nm(value);
			return;
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			loc_alc_grp(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
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
		if ($lg_def_flg.equalsIgnoreCase(name)) {
			lg_def_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($ddlv_prov_insp_flg.equalsIgnoreCase(name)) {
			ddlv_prov_insp_flg(value);
			return;
		}
		if ($stktk_tgt_flg.equalsIgnoreCase(name)) {
			stktk_tgt_flg(value);
			return;
		}
		if ($stktk_tor_disp_flg.equalsIgnoreCase(name)) {
			stktk_tor_disp_flg(value);
			return;
		}
		if ($stktk_tor_ex_zero_flg.equalsIgnoreCase(name)) {
			stktk_tor_ex_zero_flg(value);
			return;
		}
		if ($stktk_act_ex_zero_flg.equalsIgnoreCase(name)) {
			stktk_act_ex_zero_flg(value);
			return;
		}
		if ($stktk_amt_flg.equalsIgnoreCase(name)) {
			stktk_amt_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($alloc_lmt_flg.equalsIgnoreCase(name)) {
			alloc_lmt_flg(value);
			return;
		}
		if ($gi_pack_xfer_flg.equalsIgnoreCase(name)) {
			gi_pack_xfer_flg(value);
			return;
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			gi_vmi_flg(value);
			return;
		}
		if ($addr_flg.equalsIgnoreCase(name)) {
			addr_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

