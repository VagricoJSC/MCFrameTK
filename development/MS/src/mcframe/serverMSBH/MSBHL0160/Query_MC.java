package mcframe.serverMSBH.MSBHL0160;

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
	 * -- MSBHL0160_MST_AP_D_Query_S01
	 */
	static MCQueryPlan MSBHL0160_MST_AP_D_S01() {
		MST_AP_D_R S0_T1 = MST_AP_D_R.create("T1");
		MST_WRK_R S0_T2 = MST_WRK_R.create("T2");
		MST_PURC_ACT_R S0_T3 = MST_PURC_ACT_R.create("T3");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S0_M7 = MAM_WG_R.create("M7");
		MAM_DPT_R S0_M8 = MAM_DPT_R.create("M8");
		MAVM_RD_DPT_R S0_D1 = MAVM_RD_DPT_R.create("D1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0160_MST_AP_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.asppl_cd,
						S0_T1.ap_dpt_cd,
						S0_M2.dpt_nm.as("ap_dpt_nm"),
						S0_M2.wg_cd.as("wg_cd"),
						S0_T1.bsppl_cd,
						S0_T1.bsppl_dpt_cd,
						S0_M4.dpt_nm.as("bsppl_dpt_nm"),
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_T1.purc_act_no.as("act_no"),
						S0_T1.purc_act_rev.as("act_rev"),
						S0_T1.purc_act_seq.as("act_seq"),
						S0_T1.purc_act_d_no.as("act_d_no"),
						S0_T1.purc_act_d_seq.as("act_d_seq"),
						S0_T3.purc_dpt_cd,
						S0_M8.dpt_nm.as("purc_dpt_nm"),
						S0_T1.ap_d_no,
						S0_T1.sw_src_pay_schd_no,
						S0_T1.pay_basis_dt,
						S0_T1.pay_crryovr_times,
						S0_T1.pay_schd_dt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("inc_tax_amt"),
						S0_T1.interim_flg,
						S0_T1.wrk_no,
						S0_T1.ap_typ,
						S0_T1.xrate,
						S0_T1.ac_ym,
						S0_T1.ac_dt,
						S0_T1.bsppl_cl_dt.as("bsppl_cl_ym"),
						S0_T1.bsppl_cl_day,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.sppl_cd,
						S0_T1.po_no,
						S0_T1.po_d_no,
						S0_T1.bp_dlv_slip_no,
						S0_T1.bp_dlv_slip_d_no,
						S0_T1.trd_cur_cd,
						S0_T1.upd_cntr.as("ap_d_upd_cntr"),
						// this field is appended by sql coverter.
						S0_T1.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T1.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T1.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T1.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.purc_act_no.eq(S0_T3.purc_act_no)
								.and(S0_T1.purc_act_seq.eq(S0_T3.purc_act_seq))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.ap_dpt_cd.eq(S0_M2.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M2.st_dt, S0_M2.end_dt))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.bsppl_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T3.purc_dpt_cd.eq(S0_M8.dpt_cd)
								.and(S0_T3.ac_dt.between(S0_M8.st_dt, S0_M8.end_dt))
							)
						)
						.innerJoin(S0_D1).on(
							bracket(
								S0_T1.ap_dpt_cd.eq(S0_D1.dpt_cd)
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.sw_flg.eq(value(false)))
						.and(S0_T1.chk_flg.eq(value(false)))
						.and(S0_T1.valid_flg.eq(value(true)))
						.and(S0_T1.bsppl_cd.eq(bind("bsppl_cd")))
						.and(S0_T1.trd_cur_cd.eq(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.bsppl_dpt_cd.like(bind("bsppl_dpt_cd")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("bsppl_dpt_nm")))
						.cutoff$and(S0_T1.asppl_cd.like(bind("asppl_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M2.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_M2.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.ap_typ.eq(bind("ap_typ")))
					)
					.orderBy(
						S0_T1.asppl_cd.asc(),
						S0_T1.ap_dpt_cd.asc(),
						S0_T1.ac_dt.asc(),
						S0_T1.trd_cd.asc(),
						S0_T1.purc_act_no.asc(),
						S0_T1.purc_act_seq.asc(),
						S0_T1.purc_act_d_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.wrk_no.eq(S0_T2.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("asppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.asppl_cd.eq(S0_M1.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.bp_nm.like(bind("asppl_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M2.wg_cd.eq(S0_M7.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.wg_nm.like(bind("wg_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MST_PURC_ACT_D_R.class, r -> toCondition(
							r.getStringNE("act_d_no"),
							r.getNumberNE("act_d_seq")
						))
						.addSelect(m -> toArray(
							m.sno1
						))
						.addMap((r, m) -> {
							r.setStringNE("join_sno1_", m.sno1());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("join_sno1_")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_wrk_no", m.wrk_no());
							r.setStringNE("purc_wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bsppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_")
						))
						.addSelect(m -> toArray(
							m.dscnt_itm_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("dscnt_itm_flg", m.dscnt_itm_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBHL0160_MST_PAY_SCHD_Query_S01
	 */
	static MCQueryPlan MSBHL0160_MST_PAY_SCHD_S01() {
		MST_PAY_CHK_R S0_T1 = MST_PAY_CHK_R.create("T1");
		MST_PAY_SCHD_R S0_T2 = MST_PAY_SCHD_R.create("T2");
		MST_WRK_R S0_T3 = MST_WRK_R.create("T3");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S0_M6 = MAM_WG_R.create("M6");
		MAVM_RD_DPT_R S0_D1 = MAVM_RD_DPT_R.create("D1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0160_MST_PAY_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T2.asppl_cd,
						S0_T2.ap_dpt_cd,
						S0_M2.dpt_nm.as("ap_dpt_nm"),
						S0_M2.wg_cd.as("wg_cd"),
						S0_T1.bsppl_cd,
						S0_T1.bsppl_dpt_cd,
						S0_M4.dpt_nm.as("bsppl_dpt_nm"),
						S0_T2.ap_sttl_cd,
						S0_T2.pay_schd_no,
						S0_T1.pay_chk_no,
						S0_T1.pay_chk_mng_no,
						S0_T2.pay_schd_dt,
						S0_T2.trd_cur_amt.as("inc_tax_amt"),
						S0_T2.trd_cur_amt.subtract(S0_T2.trd_cur_appl_amt).as("tgt_sw_amt"),
						S0_T1.wrk_no,
						S0_T2.ap_typ,
						S0_T1.bsppl_cl_dt.as("bsppl_cl_ym"),
						S0_T1.bsppl_cl_day,
						S0_T1.purc_act_no,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.trd_cur_cd,
						S0_T1.upd_cntr.as("pay_chk_upd_cntr")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.pay_chk_mng_no.eq(S0_T2.pay_chk_mng_no)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T2.ap_dpt_cd.eq(S0_M2.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M2.st_dt, S0_M2.end_dt))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.bsppl_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.innerJoin(S0_D1).on(
							bracket(
								S0_T2.ap_dpt_cd.eq(S0_D1.dpt_cd)
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.bsppl_cd.eq(bind("bsppl_cd")))
						.and(S0_T1.trd_cur_cd.eq(bind("trd_cur_cd")))
						.and(
							S0_T2.pay_sts_typ.in(
								value(MSC_PAY_STS_TYP.NOT_PAY.value()),
								value(MSC_PAY_STS_TYP.PART_PAY.value())
							)
						)
						.and(MAC_AP_STTL_TYP$IS_COM_PAID(S0_T2.ap_sttl_typ).eq(value(false)))
						.and(
							S0_T1.aprv_flg.eq(value(false))
							.or(S0_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
						)
						.cutoff$and(S0_T1.bsppl_dpt_cd.like(bind("bsppl_dpt_cd")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("bsppl_dpt_nm")))
						.cutoff$and(S0_T2.asppl_cd.like(bind("asppl_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T2.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M2.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_M2.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T2.ap_typ.eq(bind("ap_typ")))
					)
					.orderBy(
						S0_T2.asppl_cd.asc(),
						S0_T2.ap_dpt_cd.asc(),
						S0_T1.pay_chk_no.asc(),
						S0_T2.pay_schd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.wrk_no.eq(S0_T3.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("asppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T2.asppl_cd.eq(S0_M1.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.bp_nm.like(bind("asppl_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M2.wg_cd.eq(S0_M6.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.wg_nm.like(bind("wg_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bsppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ap_sttl_cd")
						))
						.addSelect(m -> toArray(
							m.ap_sttl_typ,
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ap_sttl_nm", m.sttl_nm());
							r.setStringNE("ap_sttl_typ", m.ap_sttl_typ());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					})
				)
			);
	}
}