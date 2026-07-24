package mcframe.clientMSBF.MSBFP0050;

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
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public static final String $insp_seq = "insp_seq";
	/**
	 * Inspection checkpoint cd. 検査項目ＣＤ.<p>
	 *
	 */
	public static final String $insp_point_cd = "insp_point_cd";
	/**
	 * Inspection checkpoint name 検査項目名.<p>
	 *
	 */
	public static final String $insp_point_nm = "insp_point_nm";
	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public static final String $insp_qlqn_typ = "insp_qlqn_typ";
	/**
	 * Qualitative/quantitative type name 定性定量区分名.<p>
	 *
	 */
	public static final String $insp_qlqn_typ_nm = "insp_qlqn_typ_nm";
	/**
	 * Qualitative specific value 定性規格値.<p>
	 *
	 */
	public static final String $ql_std_val = "ql_std_val";
	/**
	 * Qualitative inspection value 定性検査値.<p>
	 *
	 */
	public static final String $ql_insp_val = "ql_insp_val";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	public static final String $qn_out_min_p = "qn_out_min_p";
	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public static final String $sign_out_min_typ = "sign_out_min_typ";
	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public static final String $sign_out_min_typ_nm = "sign_out_min_typ_nm";
	public static final String $qn_in_min_p = "qn_in_min_p";
	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public static final String $sign_in_min_typ = "sign_in_min_typ";
	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public static final String $sign_in_min_typ_nm = "sign_in_min_typ_nm";
	public static final String $qn_insp_val_p = "qn_insp_val_p";
	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public static final String $sign_in_max_typ = "sign_in_max_typ";
	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public static final String $sign_in_max_typ_nm = "sign_in_max_typ_nm";
	public static final String $qn_in_max_p = "qn_in_max_p";
	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public static final String $sign_out_max_typ = "sign_out_max_typ";
	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public static final String $sign_out_max_typ_nm = "sign_out_max_typ_nm";
	public static final String $qn_out_max_p = "qn_out_max_p";
	public static final String $st_tm_p = "st_tm_p";
	public static final String $end_tm_p = "end_tm_p";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * Inspection result type 検査結果区分.<p>
	 *
	 */
	public static final String $std_insp_rslt_typ = "std_insp_rslt_typ";
	/**
	 * Inspection result type name 検査結果区分名.<p>
	 *
	 */
	public static final String $std_insp_rslt_typ_nm = "std_insp_rslt_typ_nm";
	/**
	 * Specific inspection result internal remarks 規格検査実績内部備考.<p>
	 *
	 */
	public static final String $act_intr_rmrks = "act_intr_rmrks";
	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Check flg. 確認ＦＬＧ.<p>
	 *
	 */
	public static final String $cnf_flg = "cnf_flg";
	/**
	 * Check flg. (DB) 確認ＦＬＧ(ＤＢ).<p>
	 *
	 */
	public static final String $cnf_flg_db = "cnf_flg_db";
	/**
	 * Check date 確認日.<p>
	 *
	 */
	public static final String $cnf_dt = "cnf_dt";
	public static final String $cnf_usr_dpt_p = "cnf_usr_dpt_p";
	/**
	 * Specific inspection confirmation internal remarks 規格検査確認内部備考.<p>
	 *
	 */
	public static final String $cnf_intr_rmrks = "cnf_intr_rmrks";
	/**
	 * Specific inspection order internal remarks 規格検査指図内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Order spare 1 指図予備１.<p>
	 *
	 */
	public static final String $inst_sub_char1 = "inst_sub_char1";
	/**
	 * Order spare 2 指図予備２.<p>
	 *
	 */
	public static final String $inst_sub_char2 = "inst_sub_char2";
	/**
	 * Order spare 3 指図予備３.<p>
	 *
	 */
	public static final String $inst_sub_char3 = "inst_sub_char3";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Inspection specific order No. 検査規格指図ＮＯ.<p>
	 *
	 */
	public static final String $std_insp_inst_no = "std_insp_inst_no";
	/**
	 * Inspection specific result No. 検査規格実績ＮＯ.<p>
	 *
	 */
	public static final String $std_insp_act_no = "std_insp_act_no";
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
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public static final String $qn_int_digit = "qn_int_digit";
	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public static final String $qn_int_frac = "qn_int_frac";
	/**
	 * Auto-decision flg. 自動合否判定ＦＬＧ.<p>
	 *
	 */
	public static final String $auto_judg_flg = "auto_judg_flg";

	public static final String $qn_out_min = $qn_out_min_p + ".qn_insp_val";
	public static final String $qn_in_min = $qn_in_min_p + ".qn_insp_val";
	public static final String $qn_insp_val = $qn_insp_val_p + ".qn_insp_val";
	public static final String $qn_in_max = $qn_in_max_p + ".qn_insp_val";
	public static final String $qn_out_max = $qn_out_max_p + ".qn_insp_val";
	public static final String $st_dt = $st_tm_p + ".ymd";
	public static final String $st_tm = $st_tm_p + ".hm";
	public static final String $end_dt = $end_tm_p + ".ymd";
	public static final String $end_tm = $end_tm_p + ".hm";
	public static final String $usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $cnf_usr_cd = $cnf_usr_dpt_p + ".usr_cd";
	public static final String $cnf_usr_nm = $cnf_usr_dpt_p + ".usr_nm";
	public static final String $cnf_dpt_cd = $cnf_usr_dpt_p + ".dpt_cd";
	public static final String $cnf_dpt_nm = $cnf_usr_dpt_p + ".dpt_nm";

	public static final MCMeta insp_seq_META = createCommonMeta($insp_seq, mcframe.commonMA.meta.MA_META.INSP_SEQ);
	public static final MCMeta insp_point_cd_META = createCommonMeta($insp_point_cd, mcframe.commonMA.meta.MA_META.INSP_POINT_CD);
	public static final MCMeta insp_point_nm_META = createCommonMeta($insp_point_nm, mcframe.commonMA.meta.MA_META.INSP_POINT_NM);
	public static final MCMeta insp_qlqn_typ_META = createCommonMeta($insp_qlqn_typ, mcframe.commonMA.meta.MA_META.INSP_QLQN_TYP);
	public static final MCMeta insp_qlqn_typ_nm_META = createCommonMeta($insp_qlqn_typ_nm, mcframe.commonMA.meta.MA_META.INSP_QLQN_TYP_NM);
	public static final MCMeta ql_std_val_META = createCommonMeta($ql_std_val, mcframe.commonMA.meta.MA_META.QL_STD_VAL);
	public static final MCMeta ql_insp_val_META = createCommonMeta($ql_insp_val, mcframe.commonMS.meta.MS_META.QL_INSP_VAL);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta qn_out_min_p_META = createInnerRowMeta($qn_out_min_p, mcframe.clientMAUB.MAUBP5350.QnInspValR.class);
	public static final MCMeta sign_out_min_typ_META = createCommonMeta($sign_out_min_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_out_min_typ_nm_META = createCommonMeta($sign_out_min_typ_nm, mcframe.commonMA.meta.MA_META.SIGN_TYP_NM);
	public static final MCMeta qn_in_min_p_META = createInnerRowMeta($qn_in_min_p, mcframe.clientMAUB.MAUBP5350.QnInspValR.class);
	public static final MCMeta sign_in_min_typ_META = createCommonMeta($sign_in_min_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_in_min_typ_nm_META = createCommonMeta($sign_in_min_typ_nm, mcframe.commonMA.meta.MA_META.SIGN_TYP_NM);
	public static final MCMeta qn_insp_val_p_META = createInnerRowMeta($qn_insp_val_p, mcframe.clientMAUB.MAUBP5350.QnInspValR.class);
	public static final MCMeta sign_in_max_typ_META = createCommonMeta($sign_in_max_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_in_max_typ_nm_META = createCommonMeta($sign_in_max_typ_nm, mcframe.commonMA.meta.MA_META.SIGN_TYP_NM);
	public static final MCMeta qn_in_max_p_META = createInnerRowMeta($qn_in_max_p, mcframe.clientMAUB.MAUBP5350.QnInspValR.class);
	public static final MCMeta sign_out_max_typ_META = createCommonMeta($sign_out_max_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_out_max_typ_nm_META = createCommonMeta($sign_out_max_typ_nm, mcframe.commonMA.meta.MA_META.SIGN_TYP_NM);
	public static final MCMeta qn_out_max_p_META = createInnerRowMeta($qn_out_max_p, mcframe.clientMAUB.MAUBP5350.QnInspValR.class);
	public static final MCMeta st_tm_p_META = createInnerRowMeta($st_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta end_tm_p_META = createInnerRowMeta($end_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta std_insp_rslt_typ_META = createCommonMeta($std_insp_rslt_typ, mcframe.commonMS.meta.MS_META.STD_INSP_RSLT_TYP);
	public static final MCMeta std_insp_rslt_typ_nm_META = createCommonMeta($std_insp_rslt_typ_nm, mcframe.commonMS.meta.MS_META.STD_INSP_RSLT_TYP_NM);
	public static final MCMeta act_intr_rmrks_META = createCommonMeta($act_intr_rmrks, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR3);
	public static final MCMeta cnf_flg_META = createCommonMeta($cnf_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cnf_flg_db_META = createCommonMeta($cnf_flg_db, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cnf_dt_META = createCommonMeta($cnf_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cnf_usr_dpt_p_META = createInnerRowMeta($cnf_usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta cnf_intr_rmrks_META = createCommonMeta($cnf_intr_rmrks, mcframe.commonMS.meta.MS_META.STD_INSP_CNF_INTR_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.STD_INSP_INST_INTR_RMRKS);
	public static final MCMeta inst_sub_char1_META = createCommonMeta($inst_sub_char1, mcframe.commonMS.meta.MS_META.STD_INSP_INST_SUB_CHAR1);
	public static final MCMeta inst_sub_char2_META = createCommonMeta($inst_sub_char2, mcframe.commonMS.meta.MS_META.STD_INSP_INST_SUB_CHAR2);
	public static final MCMeta inst_sub_char3_META = createCommonMeta($inst_sub_char3, mcframe.commonMS.meta.MS_META.STD_INSP_INST_SUB_CHAR3);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta std_insp_inst_no_META = createCommonMeta($std_insp_inst_no, mcframe.commonMA.meta.MA_META.STD_INSP_INST_NO);
	public static final MCMeta std_insp_act_no_META = createCommonMeta($std_insp_act_no, mcframe.commonMA.meta.MA_META.STD_INSP_ACT_NO);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta qn_int_digit_META = createCommonMeta($qn_int_digit, mcframe.commonMA.meta.MA_META.INT_DIGIT);
	public static final MCMeta qn_int_frac_META = createCommonMeta($qn_int_frac, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta auto_judg_flg_META = createCommonMeta($auto_judg_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			insp_seq_META,
			insp_point_cd_META,
			insp_point_nm_META,
			insp_qlqn_typ_META,
			insp_qlqn_typ_nm_META,
			ql_std_val_META,
			ql_insp_val_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			qn_out_min_p_META,
			sign_out_min_typ_META,
			sign_out_min_typ_nm_META,
			qn_in_min_p_META,
			sign_in_min_typ_META,
			sign_in_min_typ_nm_META,
			qn_insp_val_p_META,
			sign_in_max_typ_META,
			sign_in_max_typ_nm_META,
			qn_in_max_p_META,
			sign_out_max_typ_META,
			sign_out_max_typ_nm_META,
			qn_out_max_p_META,
			st_tm_p_META,
			end_tm_p_META,
			usr_dpt_p_META,
			std_insp_rslt_typ_META,
			std_insp_rslt_typ_nm_META,
			act_intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			cnf_flg_META,
			cnf_flg_db_META,
			cnf_dt_META,
			cnf_usr_dpt_p_META,
			cnf_intr_rmrks_META,
			intr_rmrks_META,
			inst_sub_char1_META,
			inst_sub_char2_META,
			inst_sub_char3_META,
			insp_no_META,
			std_insp_inst_no_META,
			std_insp_act_no_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			qn_int_digit_META,
			qn_int_frac_META,
			auto_judg_flg_META
		},
		new String[][]{
			{
				"qn_out_min",
				"qn_in_min",
				"qn_insp_val",
				"qn_in_max",
				"qn_out_max",
				"st_dt",
				"st_tm",
				"end_dt",
				"end_tm",
				"usr_cd",
				"usr_nm",
				"dpt_cd",
				"dpt_nm",
				"cnf_usr_cd",
				"cnf_usr_nm",
				"cnf_dpt_cd",
				"cnf_dpt_nm"
			},
			{
				$qn_out_min,
				$qn_in_min,
				$qn_insp_val,
				$qn_in_max,
				$qn_out_max,
				$st_dt,
				$st_tm,
				$end_dt,
				$end_tm,
				$usr_cd,
				$usr_nm,
				$dpt_cd,
				$dpt_nm,
				$cnf_usr_cd,
				$cnf_usr_nm,
				$cnf_dpt_cd,
				$cnf_dpt_nm
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
				{$usr_dpt_p + ".dpt_cd", "dpt_nm"},	// usr_dpt_p.dpt_cd
				{$cnf_usr_dpt_p + ".dpt_cd", "dpt_nm"}	// cnf_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "st_dt;usr_cd;MAC_DPT_IS_SRCH_TYP.INSP"},	// usr_dpt_p.dpt_cd
				{$cnf_usr_dpt_p + ".dpt_cd", "cnf_usr_cd;cnf_dt;MAC_DPT_IS_SRCH_TYP.INSP"}	// cnf_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"},	// usr_dpt_p.dpt_cd
				{$cnf_usr_dpt_p + ".dpt_cd", "usr_cd;dt;dpt_is_srch_typ"}	// cnf_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public MCNumber insp_seq() {
		return getConstNumber(offset + 0, $insp_seq);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(MCNumber value) {
		setConstNumber(offset + 0, $insp_seq, value);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(int value) {
		setConstNumber(offset + 0, $insp_seq, value);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(long value) {
		setConstNumber(offset + 0, $insp_seq, value);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(float value) {
		setConstNumber(offset + 0, $insp_seq, value);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(double value) {
		setConstNumber(offset + 0, $insp_seq, value);
	}


	/**
	 * Inspection checkpoint cd. 検査項目ＣＤ.<p>
	 *
	 */
	public String insp_point_cd() {
		return getConstString(offset + 1, $insp_point_cd);
	}

	/**
	 * Inspection checkpoint cd. 検査項目ＣＤ.<p>
	 *
	 */
	public void insp_point_cd(String value) {
		setConstString(offset + 1, $insp_point_cd, value);
	}


	/**
	 * Inspection checkpoint name 検査項目名.<p>
	 *
	 */
	public String insp_point_nm() {
		return getConstString(offset + 2, $insp_point_nm);
	}

	/**
	 * Inspection checkpoint name 検査項目名.<p>
	 *
	 */
	public void insp_point_nm(String value) {
		setConstString(offset + 2, $insp_point_nm, value);
	}


	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public String insp_qlqn_typ() {
		return getConstString(offset + 3, $insp_qlqn_typ);
	}

	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public void insp_qlqn_typ(String value) {
		setConstString(offset + 3, $insp_qlqn_typ, value);
	}


	/**
	 * Qualitative/quantitative type name 定性定量区分名.<p>
	 *
	 */
	public String insp_qlqn_typ_nm() {
		return getConstString(offset + 4, $insp_qlqn_typ_nm);
	}

	/**
	 * Qualitative/quantitative type name 定性定量区分名.<p>
	 *
	 */
	public void insp_qlqn_typ_nm(String value) {
		setConstString(offset + 4, $insp_qlqn_typ_nm, value);
	}


	/**
	 * Qualitative specific value 定性規格値.<p>
	 *
	 */
	public String ql_std_val() {
		return getConstString(offset + 5, $ql_std_val);
	}

	/**
	 * Qualitative specific value 定性規格値.<p>
	 *
	 */
	public void ql_std_val(String value) {
		setConstString(offset + 5, $ql_std_val, value);
	}


	/**
	 * Qualitative inspection value 定性検査値.<p>
	 *
	 */
	public String ql_insp_val() {
		return getConstString(offset + 6, $ql_insp_val);
	}

	/**
	 * Qualitative inspection value 定性検査値.<p>
	 *
	 */
	public void ql_insp_val(String value) {
		setConstString(offset + 6, $ql_insp_val, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 7, $trd_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 7, $trd_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 8, $trd_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 8, $trd_unit_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5350.QnInspValR qn_out_min_p(){
		return (mcframe.clientMAUB.MAUBP5350.QnInspValR) getConstInnerRow(offset + 9, $qn_out_min_p);
	}
	
	public void qn_out_min_p(mcframe.clientMAUB.MAUBP5350.QnInspValR row){
		setConstInnerRow(offset + 9, $qn_out_min_p, row);
	}


	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public String sign_out_min_typ() {
		return getConstString(offset + 10, $sign_out_min_typ);
	}

	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public void sign_out_min_typ(String value) {
		setConstString(offset + 10, $sign_out_min_typ, value);
	}


	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public String sign_out_min_typ_nm() {
		return getConstString(offset + 11, $sign_out_min_typ_nm);
	}

	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public void sign_out_min_typ_nm(String value) {
		setConstString(offset + 11, $sign_out_min_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5350.QnInspValR qn_in_min_p(){
		return (mcframe.clientMAUB.MAUBP5350.QnInspValR) getConstInnerRow(offset + 12, $qn_in_min_p);
	}
	
	public void qn_in_min_p(mcframe.clientMAUB.MAUBP5350.QnInspValR row){
		setConstInnerRow(offset + 12, $qn_in_min_p, row);
	}


	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public String sign_in_min_typ() {
		return getConstString(offset + 13, $sign_in_min_typ);
	}

	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public void sign_in_min_typ(String value) {
		setConstString(offset + 13, $sign_in_min_typ, value);
	}


	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public String sign_in_min_typ_nm() {
		return getConstString(offset + 14, $sign_in_min_typ_nm);
	}

	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public void sign_in_min_typ_nm(String value) {
		setConstString(offset + 14, $sign_in_min_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5350.QnInspValR qn_insp_val_p(){
		return (mcframe.clientMAUB.MAUBP5350.QnInspValR) getConstInnerRow(offset + 15, $qn_insp_val_p);
	}
	
	public void qn_insp_val_p(mcframe.clientMAUB.MAUBP5350.QnInspValR row){
		setConstInnerRow(offset + 15, $qn_insp_val_p, row);
	}


	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public String sign_in_max_typ() {
		return getConstString(offset + 16, $sign_in_max_typ);
	}

	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public void sign_in_max_typ(String value) {
		setConstString(offset + 16, $sign_in_max_typ, value);
	}


	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public String sign_in_max_typ_nm() {
		return getConstString(offset + 17, $sign_in_max_typ_nm);
	}

	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public void sign_in_max_typ_nm(String value) {
		setConstString(offset + 17, $sign_in_max_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5350.QnInspValR qn_in_max_p(){
		return (mcframe.clientMAUB.MAUBP5350.QnInspValR) getConstInnerRow(offset + 18, $qn_in_max_p);
	}
	
	public void qn_in_max_p(mcframe.clientMAUB.MAUBP5350.QnInspValR row){
		setConstInnerRow(offset + 18, $qn_in_max_p, row);
	}


	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public String sign_out_max_typ() {
		return getConstString(offset + 19, $sign_out_max_typ);
	}

	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public void sign_out_max_typ(String value) {
		setConstString(offset + 19, $sign_out_max_typ, value);
	}


	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public String sign_out_max_typ_nm() {
		return getConstString(offset + 20, $sign_out_max_typ_nm);
	}

	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public void sign_out_max_typ_nm(String value) {
		setConstString(offset + 20, $sign_out_max_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5350.QnInspValR qn_out_max_p(){
		return (mcframe.clientMAUB.MAUBP5350.QnInspValR) getConstInnerRow(offset + 21, $qn_out_max_p);
	}
	
	public void qn_out_max_p(mcframe.clientMAUB.MAUBP5350.QnInspValR row){
		setConstInnerRow(offset + 21, $qn_out_max_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR st_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 22, $st_tm_p);
	}
	
	public void st_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 22, $st_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR end_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 23, $end_tm_p);
	}
	
	public void end_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 23, $end_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 24, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 24, $usr_dpt_p, row);
	}


	/**
	 * Inspection result type 検査結果区分.<p>
	 *
	 */
	public String std_insp_rslt_typ() {
		return getConstString(offset + 25, $std_insp_rslt_typ);
	}

	/**
	 * Inspection result type 検査結果区分.<p>
	 *
	 */
	public void std_insp_rslt_typ(String value) {
		setConstString(offset + 25, $std_insp_rslt_typ, value);
	}


	/**
	 * Inspection result type name 検査結果区分名.<p>
	 *
	 */
	public String std_insp_rslt_typ_nm() {
		return getConstString(offset + 26, $std_insp_rslt_typ_nm);
	}

	/**
	 * Inspection result type name 検査結果区分名.<p>
	 *
	 */
	public void std_insp_rslt_typ_nm(String value) {
		setConstString(offset + 26, $std_insp_rslt_typ_nm, value);
	}


	/**
	 * Specific inspection result internal remarks 規格検査実績内部備考.<p>
	 *
	 */
	public String act_intr_rmrks() {
		return getConstString(offset + 27, $act_intr_rmrks);
	}

	/**
	 * Specific inspection result internal remarks 規格検査実績内部備考.<p>
	 *
	 */
	public void act_intr_rmrks(String value) {
		setConstString(offset + 27, $act_intr_rmrks, value);
	}


	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 28, $sub_char1);
	}

	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 28, $sub_char1, value);
	}


	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 29, $sub_char2);
	}

	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 29, $sub_char2, value);
	}


	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 30, $sub_char3);
	}

	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 30, $sub_char3, value);
	}


	/**
	 * Check flg. 確認ＦＬＧ.<p>
	 *
	 */
	public boolean cnf_flg() {
		return getConstBoolean(offset + 31, $cnf_flg);
	}

	/**
	 * Check flg. 確認ＦＬＧ.<p>
	 *
	 */
	public void cnf_flg(boolean value) {
		setConstBoolean(offset + 31, $cnf_flg, value);
	}


	/**
	 * Check flg. (DB) 確認ＦＬＧ(ＤＢ).<p>
	 *
	 */
	public boolean cnf_flg_db() {
		return getConstBoolean(offset + 32, $cnf_flg_db);
	}

	/**
	 * Check flg. (DB) 確認ＦＬＧ(ＤＢ).<p>
	 *
	 */
	public void cnf_flg_db(boolean value) {
		setConstBoolean(offset + 32, $cnf_flg_db, value);
	}


	/**
	 * Check date 確認日.<p>
	 *
	 */
	public MCDate cnf_dt() {
		return getConstDate(offset + 33, $cnf_dt);
	}

	/**
	 * Check date 確認日.<p>
	 *
	 */
	public void cnf_dt(MCDate value) {
		setConstDate(offset + 33, $cnf_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR cnf_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 34, $cnf_usr_dpt_p);
	}
	
	public void cnf_usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 34, $cnf_usr_dpt_p, row);
	}


	/**
	 * Specific inspection confirmation internal remarks 規格検査確認内部備考.<p>
	 *
	 */
	public String cnf_intr_rmrks() {
		return getConstString(offset + 35, $cnf_intr_rmrks);
	}

	/**
	 * Specific inspection confirmation internal remarks 規格検査確認内部備考.<p>
	 *
	 */
	public void cnf_intr_rmrks(String value) {
		setConstString(offset + 35, $cnf_intr_rmrks, value);
	}


	/**
	 * Specific inspection order internal remarks 規格検査指図内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 36, $intr_rmrks);
	}

	/**
	 * Specific inspection order internal remarks 規格検査指図内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 36, $intr_rmrks, value);
	}


	/**
	 * Order spare 1 指図予備１.<p>
	 *
	 */
	public String inst_sub_char1() {
		return getConstString(offset + 37, $inst_sub_char1);
	}

	/**
	 * Order spare 1 指図予備１.<p>
	 *
	 */
	public void inst_sub_char1(String value) {
		setConstString(offset + 37, $inst_sub_char1, value);
	}


	/**
	 * Order spare 2 指図予備２.<p>
	 *
	 */
	public String inst_sub_char2() {
		return getConstString(offset + 38, $inst_sub_char2);
	}

	/**
	 * Order spare 2 指図予備２.<p>
	 *
	 */
	public void inst_sub_char2(String value) {
		setConstString(offset + 38, $inst_sub_char2, value);
	}


	/**
	 * Order spare 3 指図予備３.<p>
	 *
	 */
	public String inst_sub_char3() {
		return getConstString(offset + 39, $inst_sub_char3);
	}

	/**
	 * Order spare 3 指図予備３.<p>
	 *
	 */
	public void inst_sub_char3(String value) {
		setConstString(offset + 39, $inst_sub_char3, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 40, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 40, $insp_no, value);
	}


	/**
	 * Inspection specific order No. 検査規格指図ＮＯ.<p>
	 *
	 */
	public String std_insp_inst_no() {
		return getConstString(offset + 41, $std_insp_inst_no);
	}

	/**
	 * Inspection specific order No. 検査規格指図ＮＯ.<p>
	 *
	 */
	public void std_insp_inst_no(String value) {
		setConstString(offset + 41, $std_insp_inst_no, value);
	}


	/**
	 * Inspection specific result No. 検査規格実績ＮＯ.<p>
	 *
	 */
	public String std_insp_act_no() {
		return getConstString(offset + 42, $std_insp_act_no);
	}

	/**
	 * Inspection specific result No. 検査規格実績ＮＯ.<p>
	 *
	 */
	public void std_insp_act_no(String value) {
		setConstString(offset + 42, $std_insp_act_no, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 43, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 43, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 44, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 44, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 45, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 45, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 46, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 46, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 47, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 47, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 48, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 48, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 49, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 49, $upd_usr_nm, value);
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 52, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 52, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 53, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 53, $upd_srv_req_no, value);
	}


	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public MCNumber qn_int_digit() {
		return getConstNumber(offset + 54, $qn_int_digit);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(MCNumber value) {
		setConstNumber(offset + 54, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(int value) {
		setConstNumber(offset + 54, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(long value) {
		setConstNumber(offset + 54, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(float value) {
		setConstNumber(offset + 54, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(double value) {
		setConstNumber(offset + 54, $qn_int_digit, value);
	}


	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public MCNumber qn_int_frac() {
		return getConstNumber(offset + 55, $qn_int_frac);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(MCNumber value) {
		setConstNumber(offset + 55, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(int value) {
		setConstNumber(offset + 55, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(long value) {
		setConstNumber(offset + 55, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(float value) {
		setConstNumber(offset + 55, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(double value) {
		setConstNumber(offset + 55, $qn_int_frac, value);
	}


	/**
	 * Auto-decision flg. 自動合否判定ＦＬＧ.<p>
	 *
	 */
	public boolean auto_judg_flg() {
		return getConstBoolean(offset + 56, $auto_judg_flg);
	}

	/**
	 * Auto-decision flg. 自動合否判定ＦＬＧ.<p>
	 *
	 */
	public void auto_judg_flg(boolean value) {
		setConstBoolean(offset + 56, $auto_judg_flg, value);
	}


	public String getString(String name) {
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			return insp_point_cd();
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			return insp_point_nm();
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			return insp_qlqn_typ();
		}
		if ($insp_qlqn_typ_nm.equalsIgnoreCase(name)) {
			return insp_qlqn_typ_nm();
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			return ql_std_val();
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			return ql_insp_val();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			return sign_out_min_typ();
		}
		if ($sign_out_min_typ_nm.equalsIgnoreCase(name)) {
			return sign_out_min_typ_nm();
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			return sign_in_min_typ();
		}
		if ($sign_in_min_typ_nm.equalsIgnoreCase(name)) {
			return sign_in_min_typ_nm();
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			return sign_in_max_typ();
		}
		if ($sign_in_max_typ_nm.equalsIgnoreCase(name)) {
			return sign_in_max_typ_nm();
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			return sign_out_max_typ();
		}
		if ($sign_out_max_typ_nm.equalsIgnoreCase(name)) {
			return sign_out_max_typ_nm();
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			return std_insp_rslt_typ();
		}
		if ($std_insp_rslt_typ_nm.equalsIgnoreCase(name)) {
			return std_insp_rslt_typ_nm();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
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
		if ($cnf_intr_rmrks.equalsIgnoreCase(name)) {
			return cnf_intr_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			return inst_sub_char1();
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			return inst_sub_char2();
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			return inst_sub_char3();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			return std_insp_inst_no();
		}
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			return std_insp_act_no();
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			return insp_seq();
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			return qn_int_digit();
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			return qn_int_frac();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($cnf_dt.equalsIgnoreCase(name)) {
			return cnf_dt();
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
		if ($cnf_flg.equalsIgnoreCase(name)) {
			return cnf_flg();
		}
		if ($cnf_flg_db.equalsIgnoreCase(name)) {
			return cnf_flg_db();
		}
		if ($auto_judg_flg.equalsIgnoreCase(name)) {
			return auto_judg_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			return insp_point_cd();
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			return insp_point_nm();
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			return insp_qlqn_typ();
		}
		if ($insp_qlqn_typ_nm.equalsIgnoreCase(name)) {
			return insp_qlqn_typ_nm();
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			return ql_std_val();
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			return ql_insp_val();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			return sign_out_min_typ();
		}
		if ($sign_out_min_typ_nm.equalsIgnoreCase(name)) {
			return sign_out_min_typ_nm();
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			return sign_in_min_typ();
		}
		if ($sign_in_min_typ_nm.equalsIgnoreCase(name)) {
			return sign_in_min_typ_nm();
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			return sign_in_max_typ();
		}
		if ($sign_in_max_typ_nm.equalsIgnoreCase(name)) {
			return sign_in_max_typ_nm();
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			return sign_out_max_typ();
		}
		if ($sign_out_max_typ_nm.equalsIgnoreCase(name)) {
			return sign_out_max_typ_nm();
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			return std_insp_rslt_typ();
		}
		if ($std_insp_rslt_typ_nm.equalsIgnoreCase(name)) {
			return std_insp_rslt_typ_nm();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
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
		if ($cnf_intr_rmrks.equalsIgnoreCase(name)) {
			return cnf_intr_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			return inst_sub_char1();
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			return inst_sub_char2();
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			return inst_sub_char3();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			return std_insp_inst_no();
		}
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			return std_insp_act_no();
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			return insp_seq();
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			return qn_int_digit();
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			return qn_int_frac();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($cnf_dt.equalsIgnoreCase(name)) {
			return cnf_dt();
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
		if ($cnf_flg.equalsIgnoreCase(name)) {
			return cnf_flg();
		}
		if ($cnf_flg_db.equalsIgnoreCase(name)) {
			return cnf_flg_db();
		}
		if ($auto_judg_flg.equalsIgnoreCase(name)) {
			return auto_judg_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			insp_point_cd(value);
			return;
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			insp_point_nm(value);
			return;
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			insp_qlqn_typ(value);
			return;
		}
		if ($insp_qlqn_typ_nm.equalsIgnoreCase(name)) {
			insp_qlqn_typ_nm(value);
			return;
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			ql_std_val(value);
			return;
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			ql_insp_val(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			sign_out_min_typ(value);
			return;
		}
		if ($sign_out_min_typ_nm.equalsIgnoreCase(name)) {
			sign_out_min_typ_nm(value);
			return;
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			sign_in_min_typ(value);
			return;
		}
		if ($sign_in_min_typ_nm.equalsIgnoreCase(name)) {
			sign_in_min_typ_nm(value);
			return;
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			sign_in_max_typ(value);
			return;
		}
		if ($sign_in_max_typ_nm.equalsIgnoreCase(name)) {
			sign_in_max_typ_nm(value);
			return;
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			sign_out_max_typ(value);
			return;
		}
		if ($sign_out_max_typ_nm.equalsIgnoreCase(name)) {
			sign_out_max_typ_nm(value);
			return;
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			std_insp_rslt_typ(value);
			return;
		}
		if ($std_insp_rslt_typ_nm.equalsIgnoreCase(name)) {
			std_insp_rslt_typ_nm(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
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
		if ($cnf_intr_rmrks.equalsIgnoreCase(name)) {
			cnf_intr_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			inst_sub_char1(value);
			return;
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			inst_sub_char2(value);
			return;
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			inst_sub_char3(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			std_insp_inst_no(value);
			return;
		}
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			std_insp_act_no(value);
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($cnf_dt.equalsIgnoreCase(name)) {
			cnf_dt(value);
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
		if ($cnf_flg.equalsIgnoreCase(name)) {
			cnf_flg(value);
			return;
		}
		if ($cnf_flg_db.equalsIgnoreCase(name)) {
			cnf_flg_db(value);
			return;
		}
		if ($auto_judg_flg.equalsIgnoreCase(name)) {
			auto_judg_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			insp_point_cd(value);
			return;
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			insp_point_nm(value);
			return;
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			insp_qlqn_typ(value);
			return;
		}
		if ($insp_qlqn_typ_nm.equalsIgnoreCase(name)) {
			insp_qlqn_typ_nm(value);
			return;
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			ql_std_val(value);
			return;
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			ql_insp_val(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			sign_out_min_typ(value);
			return;
		}
		if ($sign_out_min_typ_nm.equalsIgnoreCase(name)) {
			sign_out_min_typ_nm(value);
			return;
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			sign_in_min_typ(value);
			return;
		}
		if ($sign_in_min_typ_nm.equalsIgnoreCase(name)) {
			sign_in_min_typ_nm(value);
			return;
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			sign_in_max_typ(value);
			return;
		}
		if ($sign_in_max_typ_nm.equalsIgnoreCase(name)) {
			sign_in_max_typ_nm(value);
			return;
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			sign_out_max_typ(value);
			return;
		}
		if ($sign_out_max_typ_nm.equalsIgnoreCase(name)) {
			sign_out_max_typ_nm(value);
			return;
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			std_insp_rslt_typ(value);
			return;
		}
		if ($std_insp_rslt_typ_nm.equalsIgnoreCase(name)) {
			std_insp_rslt_typ_nm(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
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
		if ($cnf_intr_rmrks.equalsIgnoreCase(name)) {
			cnf_intr_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($inst_sub_char1.equalsIgnoreCase(name)) {
			inst_sub_char1(value);
			return;
		}
		if ($inst_sub_char2.equalsIgnoreCase(name)) {
			inst_sub_char2(value);
			return;
		}
		if ($inst_sub_char3.equalsIgnoreCase(name)) {
			inst_sub_char3(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			std_insp_inst_no(value);
			return;
		}
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			std_insp_act_no(value);
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($cnf_dt.equalsIgnoreCase(name)) {
			cnf_dt(value);
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
		if ($cnf_flg.equalsIgnoreCase(name)) {
			cnf_flg(value);
			return;
		}
		if ($cnf_flg_db.equalsIgnoreCase(name)) {
			cnf_flg_db(value);
			return;
		}
		if ($auto_judg_flg.equalsIgnoreCase(name)) {
			auto_judg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($qn_out_min_p.equalsIgnoreCase(name)) {
			return qn_out_min_p();
		}
		if ($qn_in_min_p.equalsIgnoreCase(name)) {
			return qn_in_min_p();
		}
		if ($qn_insp_val_p.equalsIgnoreCase(name)) {
			return qn_insp_val_p();
		}
		if ($qn_in_max_p.equalsIgnoreCase(name)) {
			return qn_in_max_p();
		}
		if ($qn_out_max_p.equalsIgnoreCase(name)) {
			return qn_out_max_p();
		}
		if ($st_tm_p.equalsIgnoreCase(name)) {
			return st_tm_p();
		}
		if ($end_tm_p.equalsIgnoreCase(name)) {
			return end_tm_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($cnf_usr_dpt_p.equalsIgnoreCase(name)) {
			return cnf_usr_dpt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($qn_out_min_p.equalsIgnoreCase(name)) {
			qn_out_min_p(
				((MCContainerMeta) qn_out_min_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5350.QnInspValR.class, value)
			);
			return;
		}
		if ($qn_in_min_p.equalsIgnoreCase(name)) {
			qn_in_min_p(
				((MCContainerMeta) qn_in_min_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5350.QnInspValR.class, value)
			);
			return;
		}
		if ($qn_insp_val_p.equalsIgnoreCase(name)) {
			qn_insp_val_p(
				((MCContainerMeta) qn_insp_val_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5350.QnInspValR.class, value)
			);
			return;
		}
		if ($qn_in_max_p.equalsIgnoreCase(name)) {
			qn_in_max_p(
				((MCContainerMeta) qn_in_max_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5350.QnInspValR.class, value)
			);
			return;
		}
		if ($qn_out_max_p.equalsIgnoreCase(name)) {
			qn_out_max_p(
				((MCContainerMeta) qn_out_max_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5350.QnInspValR.class, value)
			);
			return;
		}
		if ($st_tm_p.equalsIgnoreCase(name)) {
			st_tm_p(
				((MCContainerMeta) st_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($end_tm_p.equalsIgnoreCase(name)) {
			end_tm_p(
				((MCContainerMeta) end_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($cnf_usr_dpt_p.equalsIgnoreCase(name)) {
			cnf_usr_dpt_p(
				((MCContainerMeta) cnf_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public MCNumber qn_out_min() {
		return qn_out_min_p().qn_insp_val();
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(MCNumber value) {
		qn_out_min_p().qn_insp_val(value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(int value) {
		qn_out_min_p().qn_insp_val(value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(long value) {
		qn_out_min_p().qn_insp_val(value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(float value) {
		qn_out_min_p().qn_insp_val(value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(double value) {
		qn_out_min_p().qn_insp_val(value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public MCNumber qn_in_min() {
		return qn_in_min_p().qn_insp_val();
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(MCNumber value) {
		qn_in_min_p().qn_insp_val(value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(int value) {
		qn_in_min_p().qn_insp_val(value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(long value) {
		qn_in_min_p().qn_insp_val(value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(float value) {
		qn_in_min_p().qn_insp_val(value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(double value) {
		qn_in_min_p().qn_insp_val(value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public MCNumber qn_insp_val() {
		return qn_insp_val_p().qn_insp_val();
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(MCNumber value) {
		qn_insp_val_p().qn_insp_val(value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(int value) {
		qn_insp_val_p().qn_insp_val(value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(long value) {
		qn_insp_val_p().qn_insp_val(value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(float value) {
		qn_insp_val_p().qn_insp_val(value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(double value) {
		qn_insp_val_p().qn_insp_val(value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public MCNumber qn_in_max() {
		return qn_in_max_p().qn_insp_val();
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(MCNumber value) {
		qn_in_max_p().qn_insp_val(value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(int value) {
		qn_in_max_p().qn_insp_val(value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(long value) {
		qn_in_max_p().qn_insp_val(value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(float value) {
		qn_in_max_p().qn_insp_val(value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(double value) {
		qn_in_max_p().qn_insp_val(value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public MCNumber qn_out_max() {
		return qn_out_max_p().qn_insp_val();
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(MCNumber value) {
		qn_out_max_p().qn_insp_val(value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(int value) {
		qn_out_max_p().qn_insp_val(value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(long value) {
		qn_out_max_p().qn_insp_val(value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(float value) {
		qn_out_max_p().qn_insp_val(value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(double value) {
		qn_out_max_p().qn_insp_val(value);
	}

	/**
	 * Inspection start date 検査開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return st_tm_p().ymd();
	}

	/**
	 * Inspection start date 検査開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		st_tm_p().ymd(value);
	}

	/**
	 * Inspection start time 検査開始時刻.<p>
	 *
	 */
	public MCDate st_tm() {
		return st_tm_p().hm();
	}

	/**
	 * Inspection start time 検査開始時刻.<p>
	 *
	 */
	public void st_tm(MCDate value) {
		st_tm_p().hm(value);
	}

	/**
	 * Inspection end date 検査終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return end_tm_p().ymd();
	}

	/**
	 * Inspection end date 検査終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		end_tm_p().ymd(value);
	}

	/**
	 * Inspection end time 検査終了時刻.<p>
	 *
	 */
	public MCDate end_tm() {
		return end_tm_p().hm();
	}

	/**
	 * Inspection end time 検査終了時刻.<p>
	 *
	 */
	public void end_tm(MCDate value) {
		end_tm_p().hm(value);
	}

	/**
	 * Inspection PIC cd. 検査者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Inspection PIC cd. 検査者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Inspection PIC name 検査者名.<p>
	 *
	 */
	public String usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Inspection PIC name 検査者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Inspection dept. cd. 検査部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Inspection dept. cd. 検査部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Inspection dept. name 検査部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Inspection dept. name 検査部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

	/**
	 * Check PIC cd. 確認者ＣＤ.<p>
	 *
	 */
	public String cnf_usr_cd() {
		return cnf_usr_dpt_p().usr_cd();
	}

	/**
	 * Check PIC cd. 確認者ＣＤ.<p>
	 *
	 */
	public void cnf_usr_cd(String value) {
		cnf_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Check PIC name 確認者名.<p>
	 *
	 */
	public String cnf_usr_nm() {
		return cnf_usr_dpt_p().usr_nm();
	}

	/**
	 * Check PIC name 確認者名.<p>
	 *
	 */
	public void cnf_usr_nm(String value) {
		cnf_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Check dept. cd. 確認部門ＣＤ.<p>
	 *
	 */
	public String cnf_dpt_cd() {
		return cnf_usr_dpt_p().dpt_cd();
	}

	/**
	 * Check dept. cd. 確認部門ＣＤ.<p>
	 *
	 */
	public void cnf_dpt_cd(String value) {
		cnf_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Check dept. name 確認部門名.<p>
	 *
	 */
	public String cnf_dpt_nm() {
		return cnf_usr_dpt_p().dpt_nm();
	}

	/**
	 * Check dept. name 確認部門名.<p>
	 *
	 */
	public void cnf_dpt_nm(String value) {
		cnf_usr_dpt_p().dpt_nm(value);
	}

}

