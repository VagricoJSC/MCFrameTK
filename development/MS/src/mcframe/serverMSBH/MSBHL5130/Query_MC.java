package mcframe.serverMSBH.MSBHL5130;

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
	 * -- MSBHL5130_MST_PAY_ACT_Query_S01
	 */
	static MCQueryPlan MSBHL5130_MST_PAY_ACT_S01() {
		MSW_PAY_ACT_KEY_R S0_W1 = MSW_PAY_ACT_KEY_R.create("W1");
		MST_PAY_ACT_R S0_T1 = MST_PAY_ACT_R.create("T1");
		MST_PAY_ACT_R S0_T2 = MST_PAY_ACT_R.create("T2");
		MST_PAY_ACT_D_R S0_T3 = MST_PAY_ACT_D_R.create("T3");
		MST_PAY_ACT_D_R S0_T4 = MST_PAY_ACT_D_R.create("T4");
		MST_AP_D_R S0_T5 = MST_AP_D_R.create("T5");
		MST_AP_D_R S0_T6 = MST_AP_D_R.create("T6");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5130_MST_PAY_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pay_act_no,
						S0_T1.pay_act_seq,
						S0_T1.pay_act_rev,
						S0_T1.pay_dpt_cd,
						S0_M1.dpt_nm.as("pay_dpt_nm"),
						S0_T1.pay_usr_cd,
						S0_T1.pay_act_dt,
						S0_T4.bsppl_cd.as("bsppl_cd_to"),
						S0_T4.asppl_cd.as("asppl_cd_to"),
						S0_T4.bsppl_dpt_cd.as("bsppl_dpt_cd_to"),
						S0_M5.dpt_nm.as("bsppl_dpt_nm_to"),
						S0_T4.ap_dpt_cd.as("ap_dpt_cd_to"),
						S0_M6.dpt_nm.as("ap_dpt_nm_to"),
						S0_T4.wrk_no.as("wrk_no_to_data"),
						S0_T1.trd_cur_cd,
						S0_T1.trd_rmrks,
						S0_T3.bsppl_cd.as("bsppl_cd_fr"),
						S0_T1.xrate,
						S0_T1.ac_dt,
						S0_T3.ap_sttl_cd,
						S0_T3.ap_sttl_typ,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T3.disp_seq,
						S0_T3.asppl_cd.as("asppl_cd_fr"),
						S0_T3.bsppl_dpt_cd.as("bsppl_dpt_cd_fr"),
						S0_M11.dpt_nm.as("bsppl_dpt_nm_fr"),
						S0_T3.ap_dpt_cd.as("ap_dpt_cd_fr"),
						S0_M12.dpt_nm.as("ap_dpt_nm_fr"),
						S0_T3.ap_typ,
						S0_T3.wrk_no.as("wrk_no_fr_data"),
						S0_T3.rcpt_iv_no.as("rcpt_iv_no_data"),
						S0_T3.rcpt_iv_mng_no.as("rcpt_iv_mng_no_data"),
						S0_T3.ap_d_no.as("ap_d_no_fr_data"),
						S0_T3.pay_schd_no.as("pay_schd_no_fr_data"),
						S0_T3.ap_appl_schd_no.as("ap_appl_schd_no_fr_data"),
						S0_T3.trd_cur_amt,
						coalesce(
							S0_T5.ap_d_no,
							S0_T6.ap_d_no
						).as("ap_d_no_to_data"),
						S0_T3.sub_char1.as("d_sub_char1"),
						S0_T3.sub_char2.as("d_sub_char2"),
						S0_T3.sub_char3.as("d_sub_char3")
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.pay_act_no.eq(S0_W1.pay_act_no)
								.and(S0_T1.pay_act_seq.eq(S0_W1.pay_act_seq))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.par_pay_act_no.eq(S0_T1.pay_act_no)
								.and(S0_T2.par_pay_act_seq.eq(S0_T1.pay_act_seq))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.pay_act_no.eq(S0_T1.pay_act_no)
								.and(S0_T3.pay_act_seq.eq(S0_T1.pay_act_seq))
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.par_pay_act_d_no.eq(S0_T3.pay_act_d_no)
								.and(S0_T4.par_pay_act_d_seq.eq(S0_T3.pay_act_d_seq))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T5.sw_src_ap_d_no.eq(S0_T3.ap_d_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T6.sw_src_ap_appl_schd_no.eq(S0_T3.ap_appl_schd_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.pay_dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.dpt_cd.eq(S0_T4.bsppl_dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.dpt_cd.eq(S0_T4.ap_dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_M11.dpt_cd.eq(S0_T3.bsppl_dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M11.st_dt, S0_M11.end_dt))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_M12.dpt_cd.eq(S0_T3.ap_dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M12.st_dt, S0_M12.end_dt))
							)
						)
					)
					.orderBy(
						S0_T1.pay_act_no.asc(),
						S0_T1.pay_act_seq.asc(),
						S0_T3.disp_seq.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no_to_data")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm_to", m.wrk_nm());
					}),
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no_fr_data")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm_fr", m.wrk_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("pay_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pay_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bsppl_cd_to")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bsppl_nm_to", m.bp_nm());
							r.setStringNE("bsppl_alt_nm1_to", m.bp_alt_nm1());
							r.setStringNE("bsppl_alt_nm2_to", m.bp_alt_nm2());
							r.setStringNE("bsppl_alt_nm3_to", m.bp_alt_nm3());
							r.setStringNE("bsppl_alt_nm4_to", m.bp_alt_nm4());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("asppl_cd_to")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm_to", m.bp_nm());
							r.setStringNE("asppl_alt_nm1_to", m.bp_alt_nm1());
							r.setStringNE("asppl_alt_nm2_to", m.bp_alt_nm2());
							r.setStringNE("asppl_alt_nm3_to", m.bp_alt_nm3());
							r.setStringNE("asppl_alt_nm4_to", m.bp_alt_nm4());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bsppl_cd_fr")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bsppl_nm_fr", m.bp_nm());
							r.setStringNE("bsppl_alt_nm1_fr", m.bp_alt_nm1());
							r.setStringNE("bsppl_alt_nm2_fr", m.bp_alt_nm2());
							r.setStringNE("bsppl_alt_nm3_fr", m.bp_alt_nm3());
							r.setStringNE("bsppl_alt_nm4_fr", m.bp_alt_nm4());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ap_sttl_cd")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("report_title", m.sttl_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("asppl_cd_fr")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm_fr", m.bp_nm());
							r.setStringNE("asppl_alt_nm1_fr", m.bp_alt_nm1());
							r.setStringNE("asppl_alt_nm2_fr", m.bp_alt_nm2());
							r.setStringNE("asppl_alt_nm3_fr", m.bp_alt_nm3());
							r.setStringNE("asppl_alt_nm4_fr", m.bp_alt_nm4());
					})
				)
			);
	}
}