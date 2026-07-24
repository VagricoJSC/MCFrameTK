package mcframe.serverMSBE.MSBEL1410;

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
 * ブロック"Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public static final String $alloc_tgt_flg = "alloc_tgt_flg";
	/**
	 * Lot suggestion ロット提案.<p>
	 *
	 */
	public static final String $lot_prop_flg = "lot_prop_flg";
	/**
	 * Packing 梱包.<p>
	 *
	 */
	public static final String $pack_flg = "pack_flg";
	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public static final String $ship_schd_tm = "ship_schd_tm";
	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public static final String $dlv_schd_tm = "dlv_schd_tm";
	/**
	 * Shipping order date and time 出荷指図日時.<p>
	 *
	 */
	public static final String $ship_inst_tm = "ship_inst_tm";
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_to_lg_grp_cd = "ship_to_lg_grp_cd";
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public static final String $ship_to_id_typ = "ship_to_id_typ";
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public static final String $ship_to_id_cd = "ship_to_id_cd";
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public static final String $ship_to_id_nm = "ship_to_id_nm";
	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public static final String $ship_to_zip_cd = "ship_to_zip_cd";
	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public static final String $ship_to_addr1 = "ship_to_addr1";
	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public static final String $ship_to_addr2 = "ship_to_addr2";
	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public static final String $ship_to_addr3 = "ship_to_addr3";
	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public static final String $ship_to_addr4 = "ship_to_addr4";
	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public static final String $ship_to_cntct_dpt = "ship_to_cntct_dpt";
	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public static final String $ship_to_cntct_psn = "ship_to_cntct_psn";
	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public static final String $ship_to_tel = "ship_to_tel";
	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public static final String $ship_to_fax = "ship_to_fax";
	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public static final String $ship_to_sundry_flg = "ship_to_sundry_flg";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_cd = "ship_wk_cd";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public static final String $pick_prnt_flg = "pick_prnt_flg";
	/**
	 * Shipping order sheet immediate issue 出荷指図書即時発行.<p>
	 *
	 */
	public static final String $inst_prnt_flg = "inst_prnt_flg";
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public static final String $dlv_prnt_flg = "dlv_prnt_flg";
	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public static final String $adv_prnt_flg = "adv_prnt_flg";
	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public static final String $inst_rmrks = "inst_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
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
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public static final String $ship_inst_upd_cntr = "ship_inst_upd_cntr";
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
	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public static final String $list_no = "list_no";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_tgt_flg_META = createCommonMeta($alloc_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_prop_flg_META = createCommonMeta($lot_prop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_flg_META = createCommonMeta($pack_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_schd_tm_META = createCommonMeta($ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_schd_tm_META = createCommonMeta($dlv_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_inst_tm_META = createCommonMeta($ship_inst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ship_to_lg_grp_cd_META = createCommonMeta($ship_to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_id_nm_META = createCommonMeta($ship_to_id_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta ship_to_zip_cd_META = createCommonMeta($ship_to_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta ship_to_addr1_META = createCommonMeta($ship_to_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_addr2_META = createCommonMeta($ship_to_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_addr3_META = createCommonMeta($ship_to_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_addr4_META = createCommonMeta($ship_to_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ship_to_cntct_dpt_META = createCommonMeta($ship_to_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta ship_to_cntct_psn_META = createCommonMeta($ship_to_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta ship_to_tel_META = createCommonMeta($ship_to_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ship_to_fax_META = createCommonMeta($ship_to_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ship_to_sundry_flg_META = createCommonMeta($ship_to_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta pick_prnt_flg_META = createCommonMeta($pick_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_prnt_flg_META = createCommonMeta($inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_prnt_flg_META = createCommonMeta($dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adv_prnt_flg_META = createCommonMeta($adv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_rmrks_META = createCommonMeta($inst_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR3);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ship_inst_upd_cntr_META = createCommonMeta($ship_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta list_no_META = createCommonMeta($list_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);

	protected static final ConstMetaList<Chk01_DtlR> constMetas = new ConstMetaList<Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			alloc_tgt_flg_META,
			lot_prop_flg_META,
			pack_flg_META,
			ship_schd_tm_META,
			dlv_schd_tm_META,
			ship_inst_tm_META,
			ship_fr_lg_grp_cd_META,
			wg_cd_META,
			ship_to_lg_grp_cd_META,
			ship_to_id_typ_META,
			ship_to_id_cd_META,
			ship_to_id_nm_META,
			ship_to_zip_cd_META,
			ship_to_addr1_META,
			ship_to_addr2_META,
			ship_to_addr3_META,
			ship_to_addr4_META,
			ship_to_cntct_dpt_META,
			ship_to_cntct_psn_META,
			ship_to_tel_META,
			ship_to_fax_META,
			ship_to_sundry_flg_META,
			via_dlv_typ_META,
			ship_wk_cd_META,
			ship_term_cd_META,
			pick_prnt_flg_META,
			inst_prnt_flg_META,
			dlv_prnt_flg_META,
			adv_prnt_flg_META,
			inst_usr_cd_META,
			inst_dpt_cd_META,
			inst_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ship_inst_no_META,
			iv_no_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			ship_inst_upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			list_no_META,
			rtn_sts_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$ship_inst_tm, "E"}	// ship_inst_tm
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$ship_schd_tm, "schd_tm:BF"},	// ship_schd_tm
				{$dlv_schd_tm, "schd_tm:AF"}	// dlv_schd_tm
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
				{$ship_schd_tm, "schd_tm"},	// ship_schd_tm
				{$dlv_schd_tm, "schd_tm"}	// dlv_schd_tm
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$ship_wk_cd, "MA.MAUAL0010.ShipWk"},	// ship_wk_cd
				{$inst_usr_cd, "MA.MAUAL0010.Usr"},	// inst_usr_cd
				{$inst_dpt_cd, "MA.MAUAL0010.Dpt"}	// inst_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$inst_dpt_cd, "ship_inst_tm;inst_usr_cd;MAC_DPT_IS_SRCH_TYP.SHIP"}	// inst_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$inst_dpt_cd, "dt;usr_cd;dpt_is_srch_typ"}	// inst_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
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
	protected Chk01_DtlR_MC_A(ConstMetaList<? extends Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlR clone() {
		return (Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlR createInstance() {
		return (Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlR getValues(String... names) {
		return (Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public boolean alloc_tgt_flg() {
		return getConstBoolean(offset + 2, $alloc_tgt_flg);
	}

	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public void alloc_tgt_flg(boolean value) {
		setConstBoolean(offset + 2, $alloc_tgt_flg, value);
	}


	/**
	 * Lot suggestion ロット提案.<p>
	 *
	 */
	public boolean lot_prop_flg() {
		return getConstBoolean(offset + 3, $lot_prop_flg);
	}

	/**
	 * Lot suggestion ロット提案.<p>
	 *
	 */
	public void lot_prop_flg(boolean value) {
		setConstBoolean(offset + 3, $lot_prop_flg, value);
	}


	/**
	 * Packing 梱包.<p>
	 *
	 */
	public boolean pack_flg() {
		return getConstBoolean(offset + 4, $pack_flg);
	}

	/**
	 * Packing 梱包.<p>
	 *
	 */
	public void pack_flg(boolean value) {
		setConstBoolean(offset + 4, $pack_flg, value);
	}


	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public MCDate ship_schd_tm() {
		return getConstDate(offset + 5, $ship_schd_tm);
	}

	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public void ship_schd_tm(MCDate value) {
		setConstDate(offset + 5, $ship_schd_tm, value);
	}


	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public MCDate dlv_schd_tm() {
		return getConstDate(offset + 6, $dlv_schd_tm);
	}

	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public void dlv_schd_tm(MCDate value) {
		setConstDate(offset + 6, $dlv_schd_tm, value);
	}


	/**
	 * Shipping order date and time 出荷指図日時.<p>
	 *
	 */
	public MCDate ship_inst_tm() {
		return getConstDate(offset + 7, $ship_inst_tm);
	}

	/**
	 * Shipping order date and time 出荷指図日時.<p>
	 *
	 */
	public void ship_inst_tm(MCDate value) {
		setConstDate(offset + 7, $ship_inst_tm, value);
	}


	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 8, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 8, $ship_fr_lg_grp_cd, value);
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
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public String ship_to_lg_grp_cd() {
		return getConstString(offset + 10, $ship_to_lg_grp_cd);
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public void ship_to_lg_grp_cd(String value) {
		setConstString(offset + 10, $ship_to_lg_grp_cd, value);
	}


	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 11, $ship_to_id_typ);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 11, $ship_to_id_typ, value);
	}


	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 12, $ship_to_id_cd);
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 12, $ship_to_id_cd, value);
	}


	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 13, $ship_to_id_nm);
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 13, $ship_to_id_nm, value);
	}


	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return getConstString(offset + 14, $ship_to_zip_cd);
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		setConstString(offset + 14, $ship_to_zip_cd, value);
	}


	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public String ship_to_addr1() {
		return getConstString(offset + 15, $ship_to_addr1);
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		setConstString(offset + 15, $ship_to_addr1, value);
	}


	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public String ship_to_addr2() {
		return getConstString(offset + 16, $ship_to_addr2);
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		setConstString(offset + 16, $ship_to_addr2, value);
	}


	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public String ship_to_addr3() {
		return getConstString(offset + 17, $ship_to_addr3);
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		setConstString(offset + 17, $ship_to_addr3, value);
	}


	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public String ship_to_addr4() {
		return getConstString(offset + 18, $ship_to_addr4);
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		setConstString(offset + 18, $ship_to_addr4, value);
	}


	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return getConstString(offset + 19, $ship_to_cntct_dpt);
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		setConstString(offset + 19, $ship_to_cntct_dpt, value);
	}


	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return getConstString(offset + 20, $ship_to_cntct_psn);
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		setConstString(offset + 20, $ship_to_cntct_psn, value);
	}


	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public String ship_to_tel() {
		return getConstString(offset + 21, $ship_to_tel);
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		setConstString(offset + 21, $ship_to_tel, value);
	}


	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public String ship_to_fax() {
		return getConstString(offset + 22, $ship_to_fax);
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		setConstString(offset + 22, $ship_to_fax, value);
	}


	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return getConstBoolean(offset + 23, $ship_to_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 23, $ship_to_sundry_flg, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 24, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 24, $via_dlv_typ, value);
	}


	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 25, $ship_wk_cd);
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 25, $ship_wk_cd, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 26, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 26, $ship_term_cd, value);
	}


	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public boolean pick_prnt_flg() {
		return getConstBoolean(offset + 27, $pick_prnt_flg);
	}

	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public void pick_prnt_flg(boolean value) {
		setConstBoolean(offset + 27, $pick_prnt_flg, value);
	}


	/**
	 * Shipping order sheet immediate issue 出荷指図書即時発行.<p>
	 *
	 */
	public boolean inst_prnt_flg() {
		return getConstBoolean(offset + 28, $inst_prnt_flg);
	}

	/**
	 * Shipping order sheet immediate issue 出荷指図書即時発行.<p>
	 *
	 */
	public void inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 28, $inst_prnt_flg, value);
	}


	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public boolean dlv_prnt_flg() {
		return getConstBoolean(offset + 29, $dlv_prnt_flg);
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public void dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 29, $dlv_prnt_flg, value);
	}


	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public boolean adv_prnt_flg() {
		return getConstBoolean(offset + 30, $adv_prnt_flg);
	}

	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public void adv_prnt_flg(boolean value) {
		setConstBoolean(offset + 30, $adv_prnt_flg, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 31, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 31, $inst_usr_cd, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 32, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 32, $inst_dpt_cd, value);
	}


	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public String inst_rmrks() {
		return getConstString(offset + 33, $inst_rmrks);
	}

	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public void inst_rmrks(String value) {
		setConstString(offset + 33, $inst_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 34, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 34, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 35, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 35, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 36, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 36, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 37, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 37, $sub_char3, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 38, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 38, $ship_inst_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 39, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 39, $iv_no, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 40, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 40, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 41, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 41, $ins_usr_nm, value);
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 44, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 44, $ins_ts, value);
	}


	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_inst_upd_cntr() {
		return getConstNumber(offset + 45, $ship_inst_upd_cntr);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 45, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(int value) {
		setConstNumber(offset + 45, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(long value) {
		setConstNumber(offset + 45, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(float value) {
		setConstNumber(offset + 45, $ship_inst_upd_cntr, value);
	}

	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public void ship_inst_upd_cntr(double value) {
		setConstNumber(offset + 45, $ship_inst_upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 46, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 46, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 47, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 47, $upd_usr_nm, value);
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 50, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 50, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 51, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 51, $upd_srv_req_no, value);
	}


	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public MCNumber list_no() {
		return getConstNumber(offset + 52, $list_no);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(MCNumber value) {
		setConstNumber(offset + 52, $list_no, value);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(int value) {
		setConstNumber(offset + 52, $list_no, value);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(long value) {
		setConstNumber(offset + 52, $list_no, value);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(float value) {
		setConstNumber(offset + 52, $list_no, value);
	}

	/**
	 * List No. リストＮＯ.<p>
	 *
	 */
	public void list_no(double value) {
		setConstNumber(offset + 52, $list_no, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 53, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 53, $rtn_sts_typ, value);
	}


	public String getString(String name) {
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			return ship_to_zip_cd();
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			return ship_to_addr1();
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			return ship_to_addr2();
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			return ship_to_addr3();
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			return ship_to_addr4();
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			return ship_to_cntct_dpt();
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			return ship_to_cntct_psn();
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			return ship_to_tel();
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			return ship_to_fax();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			return ship_inst_upd_cntr();
		}
		if ($list_no.equalsIgnoreCase(name)) {
			return list_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($ship_inst_tm.equalsIgnoreCase(name)) {
			return ship_inst_tm();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($alloc_tgt_flg.equalsIgnoreCase(name)) {
			return alloc_tgt_flg();
		}
		if ($lot_prop_flg.equalsIgnoreCase(name)) {
			return lot_prop_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			return pick_prnt_flg();
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_flg();
		}
		if ($adv_prnt_flg.equalsIgnoreCase(name)) {
			return adv_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			return ship_to_zip_cd();
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			return ship_to_addr1();
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			return ship_to_addr2();
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			return ship_to_addr3();
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			return ship_to_addr4();
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			return ship_to_cntct_dpt();
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			return ship_to_cntct_psn();
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			return ship_to_tel();
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			return ship_to_fax();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			return ship_inst_upd_cntr();
		}
		if ($list_no.equalsIgnoreCase(name)) {
			return list_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($ship_inst_tm.equalsIgnoreCase(name)) {
			return ship_inst_tm();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($alloc_tgt_flg.equalsIgnoreCase(name)) {
			return alloc_tgt_flg();
		}
		if ($lot_prop_flg.equalsIgnoreCase(name)) {
			return lot_prop_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			return pick_prnt_flg();
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_flg();
		}
		if ($adv_prnt_flg.equalsIgnoreCase(name)) {
			return adv_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			ship_to_zip_cd(value);
			return;
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			ship_to_addr1(value);
			return;
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			ship_to_addr2(value);
			return;
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			ship_to_addr3(value);
			return;
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			ship_to_addr4(value);
			return;
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			ship_to_cntct_dpt(value);
			return;
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			ship_to_cntct_psn(value);
			return;
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			ship_to_tel(value);
			return;
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			ship_to_fax(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($ship_inst_tm.equalsIgnoreCase(name)) {
			ship_inst_tm(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($alloc_tgt_flg.equalsIgnoreCase(name)) {
			alloc_tgt_flg(value);
			return;
		}
		if ($lot_prop_flg.equalsIgnoreCase(name)) {
			lot_prop_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			pick_prnt_flg(value);
			return;
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			dlv_prnt_flg(value);
			return;
		}
		if ($adv_prnt_flg.equalsIgnoreCase(name)) {
			adv_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($ship_to_zip_cd.equalsIgnoreCase(name)) {
			ship_to_zip_cd(value);
			return;
		}
		if ($ship_to_addr1.equalsIgnoreCase(name)) {
			ship_to_addr1(value);
			return;
		}
		if ($ship_to_addr2.equalsIgnoreCase(name)) {
			ship_to_addr2(value);
			return;
		}
		if ($ship_to_addr3.equalsIgnoreCase(name)) {
			ship_to_addr3(value);
			return;
		}
		if ($ship_to_addr4.equalsIgnoreCase(name)) {
			ship_to_addr4(value);
			return;
		}
		if ($ship_to_cntct_dpt.equalsIgnoreCase(name)) {
			ship_to_cntct_dpt(value);
			return;
		}
		if ($ship_to_cntct_psn.equalsIgnoreCase(name)) {
			ship_to_cntct_psn(value);
			return;
		}
		if ($ship_to_tel.equalsIgnoreCase(name)) {
			ship_to_tel(value);
			return;
		}
		if ($ship_to_fax.equalsIgnoreCase(name)) {
			ship_to_fax(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($ship_inst_upd_cntr.equalsIgnoreCase(name)) {
			ship_inst_upd_cntr(value);
			return;
		}
		if ($list_no.equalsIgnoreCase(name)) {
			list_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($ship_inst_tm.equalsIgnoreCase(name)) {
			ship_inst_tm(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($alloc_tgt_flg.equalsIgnoreCase(name)) {
			alloc_tgt_flg(value);
			return;
		}
		if ($lot_prop_flg.equalsIgnoreCase(name)) {
			lot_prop_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			pick_prnt_flg(value);
			return;
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			dlv_prnt_flg(value);
			return;
		}
		if ($adv_prnt_flg.equalsIgnoreCase(name)) {
			adv_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

