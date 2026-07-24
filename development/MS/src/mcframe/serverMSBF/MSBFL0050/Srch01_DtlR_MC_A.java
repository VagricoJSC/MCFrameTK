package mcframe.serverMSBF.MSBFL0050;

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
 * ブロック"Srch01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlR_MC_A extends MCConstRow {

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
	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public static final String $qn_out_min = "qn_out_min";
	/**
	 * Sign type (Lower limit of external specification) 外規格下限符号区分.<p>
	 *
	 */
	public static final String $sign_out_min_typ = "sign_out_min_typ";
	/**
	 * Sign type name (Lower limit of external specification) 外規格下限符号区分名.<p>
	 *
	 */
	public static final String $sign_out_min_typ_nm = "sign_out_min_typ_nm";
	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public static final String $qn_in_min = "qn_in_min";
	/**
	 * Sign type (Lower limit of internal specification) 内規格下限符号区分.<p>
	 *
	 */
	public static final String $sign_in_min_typ = "sign_in_min_typ";
	/**
	 * Sign type name (Lower limit of internal specification) 内規格下限符号区分名.<p>
	 *
	 */
	public static final String $sign_in_min_typ_nm = "sign_in_min_typ_nm";
	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public static final String $qn_insp_val = "qn_insp_val";
	/**
	 * Sign type (Upper limit of internal specification) 内規格上限符号区分.<p>
	 *
	 */
	public static final String $sign_in_max_typ = "sign_in_max_typ";
	/**
	 * Sign type name (Upper limit of internal specification) 内規格上限符号区分名.<p>
	 *
	 */
	public static final String $sign_in_max_typ_nm = "sign_in_max_typ_nm";
	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public static final String $qn_in_max = "qn_in_max";
	/**
	 * Sign type (Upper limit of external specification) 外規格上限符号区分.<p>
	 *
	 */
	public static final String $sign_out_max_typ = "sign_out_max_typ";
	/**
	 * Sign type name (Upper limit of external specification) 外規格上限符号区分名.<p>
	 *
	 */
	public static final String $sign_out_max_typ_nm = "sign_out_max_typ_nm";
	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public static final String $qn_out_max = "qn_out_max";
	/**
	 * Start date and time 開始日時.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Start date and time 開始日時.<p>
	 *
	 */
	public static final String $st_hm = "st_hm";
	/**
	 * End date and time 終了日時.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * End date and time 終了日時.<p>
	 *
	 */
	public static final String $end_hm = "end_hm";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Specific inspection result type 規格検査結果区分.<p>
	 *
	 */
	public static final String $std_insp_rslt_typ = "std_insp_rslt_typ";
	/**
	 * Specific inspection result type name 規格検査結果区分名.<p>
	 *
	 */
	public static final String $std_insp_rslt_typ_nm = "std_insp_rslt_typ_nm";
	/**
	 * Result internal remarks 実績内部備考.<p>
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
	 * Check date 確認日.<p>
	 *
	 */
	public static final String $cnf_dt = "cnf_dt";
	/**
	 * Check PIC cd. 確認者ＣＤ.<p>
	 *
	 */
	public static final String $cnf_usr_cd = "cnf_usr_cd";
	/**
	 * Check PIC name 確認者名.<p>
	 *
	 */
	public static final String $cnf_usr_nm = "cnf_usr_nm";
	/**
	 * Check dept. cd. 確認部門ＣＤ.<p>
	 *
	 */
	public static final String $cnf_dpt_cd = "cnf_dpt_cd";
	/**
	 * Check dept. name 確認部門名.<p>
	 *
	 */
	public static final String $cnf_dpt_nm = "cnf_dpt_nm";
	/**
	 * Check internal remarks 確認内部備考.<p>
	 *
	 */
	public static final String $cnf_intr_rmrks = "cnf_intr_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
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
	 * Specific inspection order No. 規格検査指図ＮＯ.<p>
	 *
	 */
	public static final String $std_insp_inst_no = "std_insp_inst_no";
	/**
	 * Specific inspection result No. 規格検査実績ＮＯ.<p>
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


	public static final MCMeta insp_seq_META = createCommonMeta($insp_seq, mcframe.commonMA.meta.MA_META.INSP_SEQ);
	public static final MCMeta insp_point_cd_META = createCommonMeta($insp_point_cd, mcframe.commonMA.meta.MA_META.INSP_POINT_CD);
	public static final MCMeta insp_point_nm_META = createCommonMeta($insp_point_nm, mcframe.commonMA.meta.MA_META.INSP_POINT_NM);
	public static final MCMeta insp_qlqn_typ_META = createCommonMeta($insp_qlqn_typ, mcframe.commonMA.meta.MA_META.INSP_QLQN_TYP);
	public static final MCMeta insp_qlqn_typ_nm_META = createCommonMeta($insp_qlqn_typ_nm, mcframe.commonMA.meta.MA_META.INSP_QLQN_TYP_NM);
	public static final MCMeta ql_std_val_META = createCommonMeta($ql_std_val, mcframe.commonMA.meta.MA_META.QL_STD_VAL);
	public static final MCMeta ql_insp_val_META = createCommonMeta($ql_insp_val, mcframe.commonMS.meta.MS_META.QL_INSP_VAL);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta qn_out_min_META = createCommonMeta($qn_out_min, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta sign_out_min_typ_META = createCommonMeta($sign_out_min_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_out_min_typ_nm_META = createCommonMeta($sign_out_min_typ_nm, mcframe.commonMA.meta.MA_META.SIGN_TYP_NM);
	public static final MCMeta qn_in_min_META = createCommonMeta($qn_in_min, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta sign_in_min_typ_META = createCommonMeta($sign_in_min_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_in_min_typ_nm_META = createCommonMeta($sign_in_min_typ_nm, mcframe.commonMA.meta.MA_META.SIGN_TYP_NM);
	public static final MCMeta qn_insp_val_META = createCommonMeta($qn_insp_val, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta sign_in_max_typ_META = createCommonMeta($sign_in_max_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_in_max_typ_nm_META = createCommonMeta($sign_in_max_typ_nm, mcframe.commonMA.meta.MA_META.SIGN_TYP_NM);
	public static final MCMeta qn_in_max_META = createCommonMeta($qn_in_max, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta sign_out_max_typ_META = createCommonMeta($sign_out_max_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_out_max_typ_nm_META = createCommonMeta($sign_out_max_typ_nm, mcframe.commonMA.meta.MA_META.SIGN_TYP_NM);
	public static final MCMeta qn_out_max_META = createCommonMeta($qn_out_max, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_hm_META = createCommonMeta($st_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_hm_META = createCommonMeta($end_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta std_insp_rslt_typ_META = createCommonMeta($std_insp_rslt_typ, mcframe.commonMS.meta.MS_META.STD_INSP_RSLT_TYP);
	public static final MCMeta std_insp_rslt_typ_nm_META = createCommonMeta($std_insp_rslt_typ_nm, mcframe.commonMS.meta.MS_META.STD_INSP_RSLT_TYP_NM);
	public static final MCMeta act_intr_rmrks_META = createCommonMeta($act_intr_rmrks, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR3);
	public static final MCMeta cnf_flg_META = createCommonMeta($cnf_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cnf_dt_META = createCommonMeta($cnf_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cnf_usr_cd_META = createCommonMeta($cnf_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cnf_usr_nm_META = createCommonMeta($cnf_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta cnf_dpt_cd_META = createCommonMeta($cnf_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cnf_dpt_nm_META = createCommonMeta($cnf_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
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

	protected static final ConstMetaList<Srch01_DtlR> constMetas = new ConstMetaList<Srch01_DtlR>(
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
			qn_out_min_META,
			sign_out_min_typ_META,
			sign_out_min_typ_nm_META,
			qn_in_min_META,
			sign_in_min_typ_META,
			sign_in_min_typ_nm_META,
			qn_insp_val_META,
			sign_in_max_typ_META,
			sign_in_max_typ_nm_META,
			qn_in_max_META,
			sign_out_max_typ_META,
			sign_out_max_typ_nm_META,
			qn_out_max_META,
			st_dt_META,
			st_hm_META,
			end_dt_META,
			end_hm_META,
			usr_cd_META,
			usr_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			std_insp_rslt_typ_META,
			std_insp_rslt_typ_nm_META,
			act_intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			cnf_flg_META,
			cnf_dt_META,
			cnf_usr_cd_META,
			cnf_usr_nm_META,
			cnf_dpt_cd_META,
			cnf_dpt_nm_META,
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
				{$insp_qlqn_typ, "MAC_INSP_QLQN_TYP"},	// insp_qlqn_typ
				{$sign_out_min_typ, "MAC_SIGN_TYP"},	// sign_out_min_typ
				{$sign_in_min_typ, "MAC_SIGN_TYP"},	// sign_in_min_typ
				{$sign_in_max_typ, "MAC_SIGN_TYP"},	// sign_in_max_typ
				{$sign_out_max_typ, "MAC_SIGN_TYP"},	// sign_out_max_typ
				{$std_insp_rslt_typ, "MSC_STD_INSP_RSLT_TYP"}	// std_insp_rslt_typ
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
	protected Srch01_DtlR_MC_A(ConstMetaList<? extends Srch01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR clone() {
		return (Srch01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR createInstance() {
		return (Srch01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR getValues(String... names) {
		return (Srch01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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


	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public MCNumber qn_out_min() {
		return getConstNumber(offset + 9, $qn_out_min);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(MCNumber value) {
		setConstNumber(offset + 9, $qn_out_min, value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(int value) {
		setConstNumber(offset + 9, $qn_out_min, value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(long value) {
		setConstNumber(offset + 9, $qn_out_min, value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(float value) {
		setConstNumber(offset + 9, $qn_out_min, value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(double value) {
		setConstNumber(offset + 9, $qn_out_min, value);
	}


	/**
	 * Sign type (Lower limit of external specification) 外規格下限符号区分.<p>
	 *
	 */
	public String sign_out_min_typ() {
		return getConstString(offset + 10, $sign_out_min_typ);
	}

	/**
	 * Sign type (Lower limit of external specification) 外規格下限符号区分.<p>
	 *
	 */
	public void sign_out_min_typ(String value) {
		setConstString(offset + 10, $sign_out_min_typ, value);
	}


	/**
	 * Sign type name (Lower limit of external specification) 外規格下限符号区分名.<p>
	 *
	 */
	public String sign_out_min_typ_nm() {
		return getConstString(offset + 11, $sign_out_min_typ_nm);
	}

	/**
	 * Sign type name (Lower limit of external specification) 外規格下限符号区分名.<p>
	 *
	 */
	public void sign_out_min_typ_nm(String value) {
		setConstString(offset + 11, $sign_out_min_typ_nm, value);
	}


	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public MCNumber qn_in_min() {
		return getConstNumber(offset + 12, $qn_in_min);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(MCNumber value) {
		setConstNumber(offset + 12, $qn_in_min, value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(int value) {
		setConstNumber(offset + 12, $qn_in_min, value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(long value) {
		setConstNumber(offset + 12, $qn_in_min, value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(float value) {
		setConstNumber(offset + 12, $qn_in_min, value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(double value) {
		setConstNumber(offset + 12, $qn_in_min, value);
	}


	/**
	 * Sign type (Lower limit of internal specification) 内規格下限符号区分.<p>
	 *
	 */
	public String sign_in_min_typ() {
		return getConstString(offset + 13, $sign_in_min_typ);
	}

	/**
	 * Sign type (Lower limit of internal specification) 内規格下限符号区分.<p>
	 *
	 */
	public void sign_in_min_typ(String value) {
		setConstString(offset + 13, $sign_in_min_typ, value);
	}


	/**
	 * Sign type name (Lower limit of internal specification) 内規格下限符号区分名.<p>
	 *
	 */
	public String sign_in_min_typ_nm() {
		return getConstString(offset + 14, $sign_in_min_typ_nm);
	}

	/**
	 * Sign type name (Lower limit of internal specification) 内規格下限符号区分名.<p>
	 *
	 */
	public void sign_in_min_typ_nm(String value) {
		setConstString(offset + 14, $sign_in_min_typ_nm, value);
	}


	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public MCNumber qn_insp_val() {
		return getConstNumber(offset + 15, $qn_insp_val);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(MCNumber value) {
		setConstNumber(offset + 15, $qn_insp_val, value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(int value) {
		setConstNumber(offset + 15, $qn_insp_val, value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(long value) {
		setConstNumber(offset + 15, $qn_insp_val, value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(float value) {
		setConstNumber(offset + 15, $qn_insp_val, value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(double value) {
		setConstNumber(offset + 15, $qn_insp_val, value);
	}


	/**
	 * Sign type (Upper limit of internal specification) 内規格上限符号区分.<p>
	 *
	 */
	public String sign_in_max_typ() {
		return getConstString(offset + 16, $sign_in_max_typ);
	}

	/**
	 * Sign type (Upper limit of internal specification) 内規格上限符号区分.<p>
	 *
	 */
	public void sign_in_max_typ(String value) {
		setConstString(offset + 16, $sign_in_max_typ, value);
	}


	/**
	 * Sign type name (Upper limit of internal specification) 内規格上限符号区分名.<p>
	 *
	 */
	public String sign_in_max_typ_nm() {
		return getConstString(offset + 17, $sign_in_max_typ_nm);
	}

	/**
	 * Sign type name (Upper limit of internal specification) 内規格上限符号区分名.<p>
	 *
	 */
	public void sign_in_max_typ_nm(String value) {
		setConstString(offset + 17, $sign_in_max_typ_nm, value);
	}


	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public MCNumber qn_in_max() {
		return getConstNumber(offset + 18, $qn_in_max);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(MCNumber value) {
		setConstNumber(offset + 18, $qn_in_max, value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(int value) {
		setConstNumber(offset + 18, $qn_in_max, value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(long value) {
		setConstNumber(offset + 18, $qn_in_max, value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(float value) {
		setConstNumber(offset + 18, $qn_in_max, value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(double value) {
		setConstNumber(offset + 18, $qn_in_max, value);
	}


	/**
	 * Sign type (Upper limit of external specification) 外規格上限符号区分.<p>
	 *
	 */
	public String sign_out_max_typ() {
		return getConstString(offset + 19, $sign_out_max_typ);
	}

	/**
	 * Sign type (Upper limit of external specification) 外規格上限符号区分.<p>
	 *
	 */
	public void sign_out_max_typ(String value) {
		setConstString(offset + 19, $sign_out_max_typ, value);
	}


	/**
	 * Sign type name (Upper limit of external specification) 外規格上限符号区分名.<p>
	 *
	 */
	public String sign_out_max_typ_nm() {
		return getConstString(offset + 20, $sign_out_max_typ_nm);
	}

	/**
	 * Sign type name (Upper limit of external specification) 外規格上限符号区分名.<p>
	 *
	 */
	public void sign_out_max_typ_nm(String value) {
		setConstString(offset + 20, $sign_out_max_typ_nm, value);
	}


	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public MCNumber qn_out_max() {
		return getConstNumber(offset + 21, $qn_out_max);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(MCNumber value) {
		setConstNumber(offset + 21, $qn_out_max, value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(int value) {
		setConstNumber(offset + 21, $qn_out_max, value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(long value) {
		setConstNumber(offset + 21, $qn_out_max, value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(float value) {
		setConstNumber(offset + 21, $qn_out_max, value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(double value) {
		setConstNumber(offset + 21, $qn_out_max, value);
	}


	/**
	 * Start date and time 開始日時.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 22, $st_dt);
	}

	/**
	 * Start date and time 開始日時.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 22, $st_dt, value);
	}


	/**
	 * Start date and time 開始日時.<p>
	 *
	 */
	public MCDate st_hm() {
		return getConstDate(offset + 23, $st_hm);
	}

	/**
	 * Start date and time 開始日時.<p>
	 *
	 */
	public void st_hm(MCDate value) {
		setConstDate(offset + 23, $st_hm, value);
	}


	/**
	 * End date and time 終了日時.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 24, $end_dt);
	}

	/**
	 * End date and time 終了日時.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 24, $end_dt, value);
	}


	/**
	 * End date and time 終了日時.<p>
	 *
	 */
	public MCDate end_hm() {
		return getConstDate(offset + 25, $end_hm);
	}

	/**
	 * End date and time 終了日時.<p>
	 *
	 */
	public void end_hm(MCDate value) {
		setConstDate(offset + 25, $end_hm, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 26, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 26, $usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 27, $usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 27, $usr_nm, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 28, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 28, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 29, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 29, $dpt_nm, value);
	}


	/**
	 * Specific inspection result type 規格検査結果区分.<p>
	 *
	 */
	public String std_insp_rslt_typ() {
		return getConstString(offset + 30, $std_insp_rslt_typ);
	}

	/**
	 * Specific inspection result type 規格検査結果区分.<p>
	 *
	 */
	public void std_insp_rslt_typ(String value) {
		setConstString(offset + 30, $std_insp_rslt_typ, value);
	}


	/**
	 * Specific inspection result type name 規格検査結果区分名.<p>
	 *
	 */
	public String std_insp_rslt_typ_nm() {
		return getConstString(offset + 31, $std_insp_rslt_typ_nm);
	}

	/**
	 * Specific inspection result type name 規格検査結果区分名.<p>
	 *
	 */
	public void std_insp_rslt_typ_nm(String value) {
		setConstString(offset + 31, $std_insp_rslt_typ_nm, value);
	}


	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public String act_intr_rmrks() {
		return getConstString(offset + 32, $act_intr_rmrks);
	}

	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public void act_intr_rmrks(String value) {
		setConstString(offset + 32, $act_intr_rmrks, value);
	}


	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 33, $sub_char1);
	}

	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 33, $sub_char1, value);
	}


	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 34, $sub_char2);
	}

	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 34, $sub_char2, value);
	}


	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 35, $sub_char3);
	}

	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 35, $sub_char3, value);
	}


	/**
	 * Check flg. 確認ＦＬＧ.<p>
	 *
	 */
	public boolean cnf_flg() {
		return getConstBoolean(offset + 36, $cnf_flg);
	}

	/**
	 * Check flg. 確認ＦＬＧ.<p>
	 *
	 */
	public void cnf_flg(boolean value) {
		setConstBoolean(offset + 36, $cnf_flg, value);
	}


	/**
	 * Check date 確認日.<p>
	 *
	 */
	public MCDate cnf_dt() {
		return getConstDate(offset + 37, $cnf_dt);
	}

	/**
	 * Check date 確認日.<p>
	 *
	 */
	public void cnf_dt(MCDate value) {
		setConstDate(offset + 37, $cnf_dt, value);
	}


	/**
	 * Check PIC cd. 確認者ＣＤ.<p>
	 *
	 */
	public String cnf_usr_cd() {
		return getConstString(offset + 38, $cnf_usr_cd);
	}

	/**
	 * Check PIC cd. 確認者ＣＤ.<p>
	 *
	 */
	public void cnf_usr_cd(String value) {
		setConstString(offset + 38, $cnf_usr_cd, value);
	}


	/**
	 * Check PIC name 確認者名.<p>
	 *
	 */
	public String cnf_usr_nm() {
		return getConstString(offset + 39, $cnf_usr_nm);
	}

	/**
	 * Check PIC name 確認者名.<p>
	 *
	 */
	public void cnf_usr_nm(String value) {
		setConstString(offset + 39, $cnf_usr_nm, value);
	}


	/**
	 * Check dept. cd. 確認部門ＣＤ.<p>
	 *
	 */
	public String cnf_dpt_cd() {
		return getConstString(offset + 40, $cnf_dpt_cd);
	}

	/**
	 * Check dept. cd. 確認部門ＣＤ.<p>
	 *
	 */
	public void cnf_dpt_cd(String value) {
		setConstString(offset + 40, $cnf_dpt_cd, value);
	}


	/**
	 * Check dept. name 確認部門名.<p>
	 *
	 */
	public String cnf_dpt_nm() {
		return getConstString(offset + 41, $cnf_dpt_nm);
	}

	/**
	 * Check dept. name 確認部門名.<p>
	 *
	 */
	public void cnf_dpt_nm(String value) {
		setConstString(offset + 41, $cnf_dpt_nm, value);
	}


	/**
	 * Check internal remarks 確認内部備考.<p>
	 *
	 */
	public String cnf_intr_rmrks() {
		return getConstString(offset + 42, $cnf_intr_rmrks);
	}

	/**
	 * Check internal remarks 確認内部備考.<p>
	 *
	 */
	public void cnf_intr_rmrks(String value) {
		setConstString(offset + 42, $cnf_intr_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 43, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 43, $intr_rmrks, value);
	}


	/**
	 * Order spare 1 指図予備１.<p>
	 *
	 */
	public String inst_sub_char1() {
		return getConstString(offset + 44, $inst_sub_char1);
	}

	/**
	 * Order spare 1 指図予備１.<p>
	 *
	 */
	public void inst_sub_char1(String value) {
		setConstString(offset + 44, $inst_sub_char1, value);
	}


	/**
	 * Order spare 2 指図予備２.<p>
	 *
	 */
	public String inst_sub_char2() {
		return getConstString(offset + 45, $inst_sub_char2);
	}

	/**
	 * Order spare 2 指図予備２.<p>
	 *
	 */
	public void inst_sub_char2(String value) {
		setConstString(offset + 45, $inst_sub_char2, value);
	}


	/**
	 * Order spare 3 指図予備３.<p>
	 *
	 */
	public String inst_sub_char3() {
		return getConstString(offset + 46, $inst_sub_char3);
	}

	/**
	 * Order spare 3 指図予備３.<p>
	 *
	 */
	public void inst_sub_char3(String value) {
		setConstString(offset + 46, $inst_sub_char3, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 47, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 47, $insp_no, value);
	}


	/**
	 * Specific inspection order No. 規格検査指図ＮＯ.<p>
	 *
	 */
	public String std_insp_inst_no() {
		return getConstString(offset + 48, $std_insp_inst_no);
	}

	/**
	 * Specific inspection order No. 規格検査指図ＮＯ.<p>
	 *
	 */
	public void std_insp_inst_no(String value) {
		setConstString(offset + 48, $std_insp_inst_no, value);
	}


	/**
	 * Specific inspection result No. 規格検査実績ＮＯ.<p>
	 *
	 */
	public String std_insp_act_no() {
		return getConstString(offset + 49, $std_insp_act_no);
	}

	/**
	 * Specific inspection result No. 規格検査実績ＮＯ.<p>
	 *
	 */
	public void std_insp_act_no(String value) {
		setConstString(offset + 49, $std_insp_act_no, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 50, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 50, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 51, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 51, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 52, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 52, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 53, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 53, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 54, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 54, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 55, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 55, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 56, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 56, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 57, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 57, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 58, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 58, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 59, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 59, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 60, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 60, $upd_srv_req_no, value);
	}


	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public MCNumber qn_int_digit() {
		return getConstNumber(offset + 61, $qn_int_digit);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(MCNumber value) {
		setConstNumber(offset + 61, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(int value) {
		setConstNumber(offset + 61, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(long value) {
		setConstNumber(offset + 61, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(float value) {
		setConstNumber(offset + 61, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(double value) {
		setConstNumber(offset + 61, $qn_int_digit, value);
	}


	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public MCNumber qn_int_frac() {
		return getConstNumber(offset + 62, $qn_int_frac);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(MCNumber value) {
		setConstNumber(offset + 62, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(int value) {
		setConstNumber(offset + 62, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(long value) {
		setConstNumber(offset + 62, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(float value) {
		setConstNumber(offset + 62, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(double value) {
		setConstNumber(offset + 62, $qn_int_frac, value);
	}


	/**
	 * Auto-decision flg. 自動合否判定ＦＬＧ.<p>
	 *
	 */
	public boolean auto_judg_flg() {
		return getConstBoolean(offset + 63, $auto_judg_flg);
	}

	/**
	 * Auto-decision flg. 自動合否判定ＦＬＧ.<p>
	 *
	 */
	public void auto_judg_flg(boolean value) {
		setConstBoolean(offset + 63, $auto_judg_flg, value);
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
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
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
		if ($cnf_usr_cd.equalsIgnoreCase(name)) {
			return cnf_usr_cd();
		}
		if ($cnf_usr_nm.equalsIgnoreCase(name)) {
			return cnf_usr_nm();
		}
		if ($cnf_dpt_cd.equalsIgnoreCase(name)) {
			return cnf_dpt_cd();
		}
		if ($cnf_dpt_nm.equalsIgnoreCase(name)) {
			return cnf_dpt_nm();
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
		if ($qn_out_min.equalsIgnoreCase(name)) {
			return qn_out_min();
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			return qn_in_min();
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			return qn_insp_val();
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			return qn_in_max();
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			return qn_out_max();
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
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			return st_hm();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			return end_hm();
		}
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
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
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
		if ($cnf_usr_cd.equalsIgnoreCase(name)) {
			return cnf_usr_cd();
		}
		if ($cnf_usr_nm.equalsIgnoreCase(name)) {
			return cnf_usr_nm();
		}
		if ($cnf_dpt_cd.equalsIgnoreCase(name)) {
			return cnf_dpt_cd();
		}
		if ($cnf_dpt_nm.equalsIgnoreCase(name)) {
			return cnf_dpt_nm();
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
		if ($qn_out_min.equalsIgnoreCase(name)) {
			return qn_out_min();
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			return qn_in_min();
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			return qn_insp_val();
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			return qn_in_max();
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			return qn_out_max();
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
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			return st_hm();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			return end_hm();
		}
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
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($cnf_usr_cd.equalsIgnoreCase(name)) {
			cnf_usr_cd(value);
			return;
		}
		if ($cnf_usr_nm.equalsIgnoreCase(name)) {
			cnf_usr_nm(value);
			return;
		}
		if ($cnf_dpt_cd.equalsIgnoreCase(name)) {
			cnf_dpt_cd(value);
			return;
		}
		if ($cnf_dpt_nm.equalsIgnoreCase(name)) {
			cnf_dpt_nm(value);
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
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
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
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
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
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
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
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
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
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
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
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			st_hm(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			end_hm(value);
			return;
		}
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
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
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
		if ($cnf_usr_cd.equalsIgnoreCase(name)) {
			cnf_usr_cd(value);
			return;
		}
		if ($cnf_usr_nm.equalsIgnoreCase(name)) {
			cnf_usr_nm(value);
			return;
		}
		if ($cnf_dpt_cd.equalsIgnoreCase(name)) {
			cnf_dpt_cd(value);
			return;
		}
		if ($cnf_dpt_nm.equalsIgnoreCase(name)) {
			cnf_dpt_nm(value);
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
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
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
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
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
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
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
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
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
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
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
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			st_hm(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			end_hm(value);
			return;
		}
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
		if ($auto_judg_flg.equalsIgnoreCase(name)) {
			auto_judg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

