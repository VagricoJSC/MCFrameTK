package mcframe.serverMSBF.MSBFL0050;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMB.constant.*;
import mcframe.commonMS.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMS.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;
import static mcframe.serverMS.dbc.MSLCFunction.*;
import static mcframe.serverMS.dbc.MSUAFunction.*;

public class Query_MC {
	
	/**
	 * -- MSBFL0050_MST_INSP_INST_Query_S01
	 */
	static MCQueryPlan MSBFL0050_MST_INSP_INST_S01() {
		MST_INSP_INST_R S0T1 = MST_INSP_INST_R.create("T1");
		MST_INSP_ACT_R S0T2 = MST_INSP_ACT_R.create("T2");
		MAM_ITM_R S0M1 = MAM_ITM_R.create("M1");
		MST_LOT_R S0T3 = MST_LOT_R.create("T3");
		MAM_DPT_R S0M6 = MAM_DPT_R.create("M6");
		MAVM_RD_LOC_R S1V1 = MAVM_RD_LOC_R.create("V1");
		MST_INSP_SCHD_R S1T4 = MST_INSP_SCHD_R.create("T4");
		
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0050_MST_INSP_INST_Query_S01")
					.mainQuery()
					.select(
						S0T1.insp_no,
						S0T1.insp_freq,
						S0T1.insp_sts_typ,
						S0T1.insp_typ,
						S0T1.itm_cd,
						S0T1.itm_sub1,
						S0T1.itm_sub2,
						S0T1.itm_sub3,
						nvl(
							S0T1.itm_nm,
							S0M1.itm_nm
						).as("itm_nm"),
						S0T1.lot_no,
						S0T1.sublot_no,
						S0T3.ver_no,
						S0T1.mfg_loc_cd,
						S0T1.sppl_cd,
						S0T1.to_site_cd,
						S0T1.bp_lot_no,
						S0T1.insp_std_no,
						S0T2.insp_judg_rslt_typ,
						S0T2.judg_dt,
						S0T2.judg_usr_cd,
						S0T2.judg_dpt_cd,
						S0M6.dpt_nm.as("judg_dpt_nm"),
						S0M1.std_cont_fctr,
						S0T1.act_cont_fctr,
						S0T3.vld_dt,
						S0T3.lmt_dt,
						S0T1.std_req_flg,
						S0T1.std_cnf_req_flg,
						S0T1.insp_rslt_prnt_flg,
						S0T1.insp_rslt_prnt_tm,
						S0T1.intr_rmrks,
						S0T1.sub_char1,
						S0T1.sub_char2,
						S0T1.sub_char3,
						S0T1.ins_usr_id,
						S0T1.ins_usr_nm,
						S0T1.ins_func_id,
						S0T1.ins_ts,
						S0T1.upd_usr_id,
						S0T1.upd_usr_nm,
						S0T1.upd_func_id,
						S0T1.upd_ts,
						S0T1.upd_srv_req_no,
						S0T1.upd_cntr.as("inst_upd_cntr"),
						S0M1.cont_fctr_flg
					)
					.from(
						S0T1
						.leftOuterJoin(S0T2).on(
							bracket(
								S0T1.insp_no.eq(S0T2.insp_no)
							)
						)
						.leftOuterJoin(S0M1).on(
							bracket(
								S0T1.itm_cd.eq(S0M1.itm_cd)
								.and(S0T1.itm_sub1.eq(S0M1.itm_sub1))
								.and(S0T1.itm_sub2.eq(S0M1.itm_sub2))
								.and(S0T1.itm_sub3.eq(S0M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0T3).on(
							bracket(
								S0T1.itm_cd.eq(S0T3.itm_cd)
								.and(S0T1.itm_sub1.eq(S0T3.itm_sub1))
								.and(S0T1.itm_sub2.eq(S0T3.itm_sub2))
								.and(S0T1.itm_sub3.eq(S0T3.itm_sub3))
								.and(S0T1.lot_no.eq(S0T3.lot_no))
								.and(
									bracket(
										MAC_STR$IS_NULL_VAL(S0T1.sublot_no).eq(value(true))
										.and(
											S0M1.sublot_mng_typ.in(
												value(MAC_SUBLOT_MNG_TYP.NOT_MNG.value()),
												value(MAC_SUBLOT_MNG_TYP.STK.value())
											)
										)
									)
									.or(S0T3.sublot_no.eq(S0T1.sublot_no))
								)
							)
						)
						.leftOuterJoin(S0M6).on(
							bracket(
								S0T2.judg_dpt_cd.eq(S0M6.dpt_cd)
								.and(S0T2.judg_dt.gte(S0M6.st_dt))
								.and(S0T2.judg_dt.lte(S0M6.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0T1.insp_no.eq(bind("insp_no")))
						.and(
							S0T1.insp_aprv_sts_typ.isNull()
							.or(S0T1.insp_aprv_sts_typ.neq(value(MSC_INSP_APRV_STS_TYP.INST_OPN.value())))
						)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S1V1
									.leftOuterJoin(S1T4).on(
										bracket(
											S0T1.insp_no.eq(S1T4.insp_no)
										)
									)
								)
								.where(
									S1V1.loc_cd.eq(cases()
											.when(S1T4.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
												.then(S1T4.mfg_loc_cd)
											.otherwise(S1T4.loc_cd)
									)
								)
							)
						)
						.addDynamicPredicate(REP1)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("to_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("to_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("judg_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("judg_usr_nm", m.usr_nm());
					})
				)
			);
	}

	static MCDynamicSQLInfo MSBFL0050_MST_INSP_INST_S01_WHERE01() {
		MST_INSP_INST_R S0T1 = MST_INSP_INST_R.create("T1");
		MST_STD_INSP_ACT_R S1T4 = MST_STD_INSP_ACT_R.create("T4");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return when(null).predicate(REP1, p -> p.and(
				exists(
						subQuery()
						.select(S1T4.insp_no)
						.from(S1T4)
						.where(
							S0T1.insp_no.eq(S1T4.insp_no)
						)
					)
				)
			);
	}

	static MCDynamicSQLInfo MSBFL0050_MST_INSP_INST_S01_WHERE02() {
		MST_INSP_INST_R S0T1 = MST_INSP_INST_R.create("T1");
		MST_STD_INSP_ACT_R S1T4 = MST_STD_INSP_ACT_R.create("T4");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");

		return when(null).predicate(REP1, p -> p.and(
				exists(
						subQuery()
						.select(S1T4.insp_no)
						.from(S1T4)
						.where(
							S0T1.insp_no.eq(S1T4.insp_no)
							.and(S1T4.cnf_flg.eq(value(true)))
						)
					)
				)
			);
	}
	
	/**
	 * -- MSBFL0050_MST_STD_INSP_INST_Query_S01
	 */
	static MCQueryPlan MSBFL0050_MST_STD_INSP_INST_S01() {
		MST_STD_INSP_INST_R S0_T1 = MST_STD_INSP_INST_R.create("T1");
		MST_INSP_INST_R S0_T2 = MST_INSP_INST_R.create("T2");
		MST_STD_INSP_ACT_R S0_T3 = MST_STD_INSP_ACT_R.create("T3");
		MAM_INSP_POINT_R S0_M1 = MAM_INSP_POINT_R.create("M1");
		MAM_UNIT_R S0_M2 = MAM_UNIT_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_USR_R S0_M5 = MAM_USR_R.create("M5");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0050_MST_STD_INSP_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.insp_seq,
						S0_T1.insp_point_cd,
						S0_M1.insp_point_nm,
						S0_T1.insp_qlqn_typ,
						S0_T1.ql_std_val,
						S0_T3.ql_insp_val,
						S0_T1.trd_unit_cd,
						S0_M2.unit_nm.as("trd_unit_nm"),
						S0_T1.qn_out_min,
						S0_T1.sign_out_min_typ,
						S0_T1.qn_in_min,
						S0_T1.sign_in_min_typ,
						S0_T3.qn_insp_val,
						S0_T1.sign_in_max_typ,
						S0_T1.qn_in_max,
						S0_T1.sign_out_max_typ,
						S0_T1.qn_out_max,
						trunc(
							S0_T3.st_tm,
							MCDateFmt.DD
						).as("st_dt"),
						S0_T3.st_tm.as("st_hm"),
						trunc(
							S0_T3.end_tm,
							MCDateFmt.DD
						).as("end_dt"),
						S0_T3.end_tm.as("end_hm"),
						S0_T3.usr_cd,
						S0_M3.usr_nm,
						S0_T3.dpt_cd,
						S0_M4.dpt_nm,
						S0_T3.std_insp_rslt_typ,
						S0_T3.act_intr_rmrks,
						S0_T3.sub_char1,
						S0_T3.sub_char2,
						S0_T3.sub_char3,
						S0_T3.cnf_flg,
						S0_T3.cnf_dt,
						S0_T3.cnf_usr_cd,
						S0_M5.usr_nm.as("cnf_usr_nm"),
						S0_T3.cnf_dpt_cd,
						S0_M6.dpt_nm.as("cnf_dpt_nm"),
						S0_T3.cnf_intr_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1.as("inst_sub_char1"),
						S0_T1.sub_char2.as("inst_sub_char2"),
						S0_T1.sub_char3.as("inst_sub_char3"),
						S0_T1.insp_no,
						S0_T1.std_insp_inst_no,
						S0_T3.std_insp_act_no,
						S0_T2.insp_no,
						nvl2(
							S0_T3.std_insp_act_no,
							S0_T3.ins_usr_id,
							S0_T1.ins_usr_id
						).as("ins_usr_id"),
						nvl2(
							S0_T3.std_insp_act_no,
							S0_T3.ins_usr_nm,
							S0_T1.ins_usr_nm
						).as("ins_usr_nm"),
						nvl2(
							S0_T3.std_insp_act_no,
							S0_T3.ins_func_id,
							S0_T1.ins_func_id
						).as("ins_func_id"),
						nvl2(
							S0_T3.std_insp_act_no,
							S0_T3.ins_ts,
							S0_T1.ins_ts
						).as("ins_ts"),
						nvl2(
							S0_T3.std_insp_act_no,
							S0_T3.upd_usr_id,
							S0_T1.upd_usr_id
						).as("upd_usr_id"),
						nvl2(
							S0_T3.std_insp_act_no,
							S0_T3.upd_usr_nm,
							S0_T1.upd_usr_nm
						).as("upd_usr_nm"),
						nvl2(
							S0_T3.std_insp_act_no,
							S0_T3.upd_func_id,
							S0_T1.upd_func_id
						).as("upd_func_id"),
						nvl2(
							S0_T3.std_insp_act_no,
							S0_T3.upd_ts,
							S0_T1.upd_ts
						).as("upd_ts"),
						nvl2(
							S0_T3.std_insp_act_no,
							S0_T3.upd_srv_req_no,
							S0_T1.upd_srv_req_no
						).as("upd_srv_req_no"),
						S0_T3.upd_cntr.as("std_act_upd_cntr"),
						S0_T1.qn_int_digit,
						S0_T1.qn_int_frac,
						S0_M1.auto_judg_flg
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.insp_no.eq(S0_T2.insp_no)
								.and(S0_T1.insp_freq.eq(S0_T2.insp_freq))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.std_insp_inst_no.eq(S0_T3.std_insp_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.insp_point_cd.eq(S0_M1.insp_point_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.trd_unit_cd.eq(S0_M2.unit_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T3.usr_cd.eq(S0_M3.usr_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T3.dpt_cd.eq(S0_M4.dpt_cd)
								.and(
									trunc(
										S0_T3.st_tm,
										MCDateFmt.DD
									).gte(S0_M4.st_dt)
								)
								.and(
									trunc(
										S0_T3.st_tm,
										MCDateFmt.DD
									).lte(S0_M4.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T3.cnf_usr_cd.eq(S0_M5.usr_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T3.cnf_dpt_cd.eq(S0_M6.dpt_cd)
								.and(S0_T3.cnf_dt.gte(S0_M6.st_dt))
								.and(S0_T3.cnf_dt.lte(S0_M6.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.insp_no.eq(bind("insp_no")))
					)
					.orderBy(S0_T1.insp_seq.asc())
			);
	}
}