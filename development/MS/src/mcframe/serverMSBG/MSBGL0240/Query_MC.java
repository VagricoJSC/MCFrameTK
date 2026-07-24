package mcframe.serverMSBG.MSBGL0240;

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
	 * -- MSBGL0240_MST_BILL_D_Query_S01
	 */
	static MCQueryPlan MSBGL0240_MST_BILL_D_S01() {
		MST_BILL_D_APPL_BAL_R S0_T1 = MST_BILL_D_APPL_BAL_R.create("T1");
		MST_BILL_D_R S0_T2 = MST_BILL_D_R.create("T2");
		MST_BILL_D_R S0_T3 = MST_BILL_D_R.create("T3");
		MST_BILL_R S0_T4 = MST_BILL_R.create("T4");
		MST_BILL_ACST_R S0_T5 = MST_BILL_ACST_R.create("T5");
		MST_WRK_R S0_T6 = MST_WRK_R.create("T6");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_DPT_R S0_M9 = MAM_DPT_R.create("M9");
		MAM_BP_R S0_M12 = MAM_BP_R.create("M12");
		MAM_BP_R S0_M13 = MAM_BP_R.create("M13");
		MAM_WG_R S0_M14 = MAM_WG_R.create("M14");
		MAVM_RD_DPT_R S0_M17 = MAVM_RD_DPT_R.create("M17");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0240_MST_BILL_D_Query_S01")
					.mainQuery()
					.select(
						S0_T5.acst_cd,
						S0_T5.ar_dpt_cd,
						S0_M2.dpt_nm.as("ar_dpt_nm"),
						S0_T4.bcst_cd,
						S0_T4.bill_dpt_cd,
						S0_M3.dpt_nm.as("bill_dpt_nm"),
						S0_T3.slip_sts_typ,
						S0_T3.trd_cd,
						S0_T3.act_no,
						S0_T3.act_seq,
						S0_T3.act_rev,
						S0_T3.act_d_no,
						S0_T3.act_d_seq,
						bracket(
							S0_T3.trd_cur_amt.add(S0_T3.trd_cur_tax_amt)
						).as("inc_tax_amt"),
						S0_T1.not_appl_bal.as("tgt_sw_amt"),
						S0_T3.wtax_amt,
						S0_T4.wrk_no,
						S0_T3.wrk_no.as("sls_wrk_no"),
						S0_T3.ar_typ,
						S0_T3.xrate,
						S0_T2.ac_dt,
						S0_T2.ac_ym,
						S0_T3.dlv_dt,
						S0_T4.base_dt.as("bill_ym"),
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_T4.base_dt,
							nvl(
								S0_T4.bill_cl_typ,
								S0_M12.bill_cl_typ
							),
							S0_T4.bill_each_sls_flg
						).as("bill_cl_day"),
						S0_T4.bill_dt,
						S0_T4.bill_no,
						S0_T3.iv_no,
						S0_T3.cst_cd,
						S0_T3.dlv_cd,
						decode(
							S0_T3.dlv_sundry_flg,
							value(true),
							S0_T3.dlv_nm,
							S0_M13.bp_nm
						).as("dlv_nm"),
						S0_T3.dest_cd1,
						S0_T3.dest_cd2,
						S0_T3.dest_cd3,
						S0_T3.sls_dpt_cd,
						S0_M9.dpt_nm.as("sls_dpt_nm"),
						S0_T3.sls_usr_cd,
						S0_T3.slo_no,
						S0_T3.slo_d_no,
						S0_T3.cst_po_no,
						S0_T3.cst_po_d_no,
						S0_T3.dlv_slip_no,
						S0_T3.dlv_slip_d_no,
						S0_T3.ship_dlv_slip_no,
						S0_T3.ship_dlv_slip_d_no,
						S0_T3.ship_dlv_slip_multi_flg,
						decode(
							S0_T4.bill_cl_sts_typ,
							value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()),
							value(false),
							value(true)
						).as("bill_flg"),
						S0_T1.bill_d_no,
						S0_T1.parent_bill_d_no,
						S0_T4.trd_cur_cd,
						S0_T1.upd_cntr.as("bill_d_appl_bal_upd_cntr"),
						S0_T3.trd_ptn_typ,
						// this field is appended by sql coverter.
						S0_T3.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T3.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T3.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T3.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.bill_d_no.eq(S0_T2.bill_d_no))
						.innerJoin(S0_T3).on(S0_T1.parent_bill_d_no.eq(S0_T3.bill_d_no))
						.innerJoin(S0_T4).on(S0_T2.bill_mng_no.eq(S0_T4.bill_mng_no))
						.innerJoin(S0_T5).on(S0_T2.bill_acst_no.eq(S0_T5.bill_acst_no))
						.leftOuterJoin(S0_M2).on(
							S0_T5.ar_dpt_cd.eq(S0_M2.dpt_cd)
							.and(S0_T3.ac_dt.between(S0_M2.st_dt, S0_M2.end_dt))
						)
						.leftOuterJoin(S0_M3).on(
							S0_T4.bill_dpt_cd.eq(S0_M3.dpt_cd)
							.and(S0_T4.base_dt.between(S0_M3.st_dt, S0_M3.end_dt))
						)
						.leftOuterJoin(S0_M9).on(
							S0_T3.sls_dpt_cd.eq(S0_M9.dpt_cd)
							.and(S0_T3.ac_dt.between(S0_M9.st_dt, S0_M9.end_dt))
						)
						.leftOuterJoin(S0_M12).on(S0_T4.bcst_cd.eq(S0_M12.bp_cd))
						.leftOuterJoin(S0_M13).on(S0_T3.dlv_cd.eq(S0_M13.bp_cd))
						.innerJoin(S0_M17).on(S0_T5.ar_dpt_cd.eq(S0_M17.dpt_cd))
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T4.bcst_cd.eq(bind("bcst_cd")))
						.and(S0_T4.trd_cur_cd.eq(bind("trd_cur_cd")))
						.cutoff$and(S0_T4.bill_dpt_cd.like(bind("bill_dpt_cd")))
						.cutoff$and(S0_M3.dpt_nm.like(bind("bill_dpt_nm")))
						.cutoff$and(S0_T5.acst_cd.like(bind("acst_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T5.ar_dpt_cd.like(bind("ar_dpt_cd")))
						.cutoff$and(S0_M2.dpt_nm.like(bind("ar_dpt_nm")))
						.cutoff$and(S0_M2.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T4.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T3.ar_typ.like(bind("ar_typ")))
						.and(S0_T1.not_appl_bal.neq(value(0)))
						.and(S0_T2.valid_flg.eq(value(true)))
						.and(S0_T3.valid_flg.eq(value(true)))
						.and(
							bind("not_bill_inc_flg").eq(value(true))
							.or(
								bind("not_bill_inc_flg").eq(value(false))
								.and(S0_T4.bill_cl_sts_typ.neq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())))
							)
						)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T6).on(S0_T4.wrk_no.eq(S0_T6.wrk_no)))
					.predicate(p -> p.cutoff$and(S0_T6.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("acst_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_T5.acst_cd.eq(S0_M1.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.bp_nm.like(bind("acst_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(S0_M3.wg_cd.eq(S0_M14.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M14.wg_nm.like(bind("wg_nm"))))
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
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("sls_wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd1")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm1", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd2")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm2", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd3")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm3", m.bp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
							r.setNumberNE("upri_dec_place", m.upri_dec_place());
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
	 * -- MSBGL0240_MST_BILL_D_Query_S02
	 */
	static MCQueryPlan MSBGL0240_MST_BILL_D_S02() {
		MST_BILL_D_R S0_T1 = MST_BILL_D_R.create("T1");
		MST_BILL_R S0_T2 = MST_BILL_R.create("T2");
		MST_BILL_ACST_R S0_T3 = MST_BILL_ACST_R.create("T3");
		MST_BILL_D_APPL_BAL_R S0_T4 = MST_BILL_D_APPL_BAL_R.create("T4");
		MST_WRK_R S0_T6 = MST_WRK_R.create("T6");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_DPT_R S0_M9 = MAM_DPT_R.create("M9");
		MAM_BP_R S0_M12 = MAM_BP_R.create("M12");
		MAM_BP_R S0_M13 = MAM_BP_R.create("M13");
		MAM_WG_R S0_M14 = MAM_WG_R.create("M14");
		MAVM_RD_DPT_R S0_M17 = MAVM_RD_DPT_R.create("M17");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0240_MST_BILL_D_Query_S02")
					.mainQuery()
					.select(
						S0_T3.acst_cd,
						S0_T3.ar_dpt_cd,
						S0_M2.dpt_nm.as("ar_dpt_nm"),
						S0_T2.bcst_cd,
						S0_T2.bill_dpt_cd,
						S0_M3.dpt_nm.as("bill_dpt_nm"),
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_T1.act_no,
						S0_T1.act_seq,
						S0_T1.act_rev,
						S0_T1.act_d_no,
						S0_T1.act_d_seq,
						bracket(
							S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt)
						).as("inc_tax_amt"),
						S0_T1.wrk_no.as("sls_wrk_no"),
						S0_T2.wrk_no,
						S0_T1.ar_typ,
						S0_T1.xrate,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.dlv_dt,
						S0_T2.base_dt.as("bill_ym"),
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_T2.base_dt,
							nvl(
								S0_T2.bill_cl_typ,
								S0_M12.bill_cl_typ
							),
							S0_T2.bill_each_sls_flg
						).as("bill_cl_day"),
						S0_T1.iv_no,
						S0_T1.cst_cd,
						S0_T1.dlv_cd,
						decode(
							S0_T1.dlv_sundry_flg,
							value(true),
							S0_T1.dlv_nm,
							S0_M13.bp_nm
						).as("dlv_nm"),
						S0_T1.dest_cd1,
						S0_T1.dest_cd2,
						S0_T1.dest_cd3,
						S0_T1.sls_dpt_cd,
						S0_M9.dpt_nm.as("sls_dpt_nm"),
						S0_T1.sls_usr_cd,
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.cst_po_no,
						S0_T1.cst_po_d_no,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						S0_T1.ship_dlv_slip_no,
						S0_T1.ship_dlv_slip_d_no,
						S0_T1.ship_dlv_slip_multi_flg,
						S0_T4.bill_d_no,
						S0_T4.parent_bill_d_no,
						S0_T2.trd_cur_cd,
						S0_T1.upd_cntr.as("bill_d_upd_cntr"),
						S0_T1.trd_ptn_typ,
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
						.innerJoin(S0_T2).on(S0_T1.bill_mng_no.eq(S0_T2.bill_mng_no))
						.innerJoin(S0_T3).on(S0_T1.bill_acst_no.eq(S0_T3.bill_acst_no))
						.innerJoin(S0_T4).on(S0_T1.bill_d_no.eq(S0_T4.bill_d_no))
						.leftOuterJoin(S0_M2).on(
							S0_T3.ar_dpt_cd.eq(S0_M2.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_M2.st_dt, S0_M2.end_dt))
						)
						.leftOuterJoin(S0_M3).on(
							S0_T2.bill_dpt_cd.eq(S0_M3.dpt_cd)
							.and(S0_T2.base_dt.between(S0_M3.st_dt, S0_M3.end_dt))
						)
						.leftOuterJoin(S0_M9).on(
							S0_T1.sls_dpt_cd.eq(S0_M9.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_M9.st_dt, S0_M9.end_dt))
						)
						.leftOuterJoin(S0_M12).on(S0_T2.bcst_cd.eq(S0_M12.bp_cd))
						.leftOuterJoin(S0_M13).on(S0_T1.dlv_cd.eq(S0_M13.bp_cd))
						.innerJoin(S0_M17).on(S0_T3.ar_dpt_cd.eq(S0_M17.dpt_cd))
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.bcst_cd.eq(bind("bcst_cd")))
						.cutoff$and(S0_T2.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T2.bill_dpt_cd.like(bind("bill_dpt_cd")))
						.cutoff$and(S0_M3.dpt_nm.like(bind("bill_dpt_nm")))
						.cutoff$and(S0_T3.acst_cd.like(bind("acst_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T3.ar_dpt_cd.like(bind("ar_dpt_cd")))
						.cutoff$and(S0_M2.dpt_nm.like(bind("ar_dpt_nm")))
						.cutoff$and(S0_M2.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.ar_typ.like(bind("ar_typ")))
						.and(
							S0_T1.ar_trd_grp_typ.in(
								value(MAC_AR_TRD_GRP_TYP.SLS.value()),
								value(MAC_AR_TRD_GRP_TYP.SLS_RTN.value()),
								value(MAC_AR_TRD_GRP_TYP.SLS_DSCNT.value()),
								value(MAC_AR_TRD_GRP_TYP.TAX_DIFF.value())
							)
						)
						.and(S0_T1.valid_flg.eq(value(true)))
						.and(S0_T4.not_appl_bal.neq(value(0)))
						.and(S0_T2.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())))
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T6).on(S0_T2.wrk_no.eq(S0_T6.wrk_no)))
					.predicate(p -> p.cutoff$and(S0_T6.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("acst_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_T3.acst_cd.eq(S0_M1.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.bp_nm.like(bind("acst_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(S0_M2.wg_cd.eq(S0_M14.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M14.wg_nm.like(bind("wg_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("sls_wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_wrk_nm", m.wrk_nm());
					}),
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
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd1")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm1", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd2")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm2", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd3")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm3", m.bp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
							r.setNumberNE("upri_dec_place", m.upri_dec_place());
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
	 * -- MSBGL0240_MST_BILL_D_Query_S03
	 */
	static MCQueryPlan MSBGL0240_MST_BILL_D_S03() {
		MST_BILL_D_R S0_TA1 = MST_BILL_D_R.create("TA1");
		MST_BILL_ACST_R S0_TA2 = MST_BILL_ACST_R.create("TA2");
		MST_BILL_R S0_TA3 = MST_BILL_R.create("TA3");
		MAM_BP_R S0_MA1 = MAM_BP_R.create("MA1");
		MST_BILL_D_APPL_BAL_R S1_TB1 = MST_BILL_D_APPL_BAL_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0240_MST_BILL_D_Query_S03")
					.mainQuery()
					.select(
						S0_TA1.bill_mng_no,
						S0_TA2.acst_cd,
						S0_TA2.ar_dpt_cd,
						S0_TA2.wg_cd,
						S0_TA1.ac_ym,
						S0_TA1.trd_cd,
						S0_TA1.ar_trd_grp_typ,
						S0_TA1.trd_ptn_typ,
						S0_TA1.ar_typ,
						S0_TA1.act_no,
						S0_TA1.act_seq,
						S0_TA1.act_rev,
						S0_TA1.act_d_no,
						S0_TA1.act_d_seq,
						S0_TA1.trd_cur_amt,
						S0_TA1.trd_cur_tax_amt,
						S0_TA1.base_cur_amt,
						S0_TA1.base_cur_tax_amt,
						S0_TA3.bcst_cd,
						S0_TA3.iv_no,
						S0_TA3.trd_cur_cd,
						S0_TA1.xrate,
						S0_TA1.iv_no.as("bill_d_iv_no"),
						S0_TA1.slip_sts_typ,
						S0_TA3.wrk_no,
						S0_TA3.bill_dpt_cd,
						S0_MA1.bp_cd.as("sw_to_acst_cd"),
						S0_TA3.bill_cl_dt.as("sw_to_bill_dt"),
						S0_TA1.bill_crryovr_times,
						S0_TA1.ac_dt.as("sw_fr_ac_dt"),
						bracket(
							subQuery()
							.select(
								nvl(
									sum(S1_TB1.appl_amt),
									value(0)
								)
							)
							.from(S1_TB1)
							.where(
								S0_TA1.bill_d_no.eq(S1_TB1.parent_bill_d_no)
							)
						).as("appl_amt"),
						S0_TA1.upd_cntr
					)
					.from(
						S0_TA1
						.innerJoin(S0_TA2).on(S0_TA1.bill_acst_no.eq(S0_TA2.bill_acst_no))
						.innerJoin(S0_TA3).on(S0_TA1.bill_mng_no.eq(S0_TA3.bill_mng_no))
						.innerJoin(S0_MA1).on(S0_MA1.bp_cd.eq(bind("sw_to_acst_cd")))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_TA1.bill_d_no.eq(bind("bill_d_no")))
						.and(S0_TA1.valid_flg.eq(value(true)))
					)
					.forUpdateNoWait(
						S0_TA1.bill_d_no,
						S0_TA2.bill_acst_no,
						S0_TA3.bill_mng_no
					)
			);
	}
	
	/**
	 * -- MSBGL0240_MST_RCV_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBGL0240_MST_RCV_ACT_D_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MCTempView S0_V2 = createTempView("V2");
		MST_RCV_ACT_D_R S1_T1 = MST_RCV_ACT_D_R.create("T1");
		MST_RCV_ACT_R S1_T2 = MST_RCV_ACT_R.create("T2");
		MST_BILL_D_APPL_ACT_R S1_T3 = MST_BILL_D_APPL_ACT_R.create("T3");
		MST_RCV_ACT_D_R S2_T1 = MST_RCV_ACT_D_R.create("T1");
		MST_RCV_ACT_R S2_T2 = MST_RCV_ACT_R.create("T2");
		MST_BILL_D_APPL_ACT_R S2_T3 = MST_BILL_D_APPL_ACT_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0240_MST_RCV_ACT_D_Query_S01")
					.mainQuery()
					.select(
						bind("wtax_amt").subtract(
							bracket(
								S0_V1.pr("wtax_amt").add(S0_V2.pr("wtax_amt"))
							)
						).as("not_appl_wtax_amt")
					)
					.from(
						subQuery()
						.select(
							nvl(
								sum(S1_T1.trd_cur_amt1),
								value(0)
							).as("wtax_amt")
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.rcv_act_no.eq(S1_T2.rcv_act_no)
									.and(S1_T1.rcv_act_seq.eq(S1_T2.rcv_act_seq))
								)
							)
							.innerJoin(S1_T3).on(
								bracket(
									S1_T1.rcv_act_d_no.eq(S1_T3.rcv_act_d_no)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							.and(S1_T2.ar_sttl_typ1.eq(value(MAC_AR_STTL_TYP.WTAX.value())))
							.and(S1_T3.bill_d_no.eq(bind("bill_d_no")))
							.and(S1_T3.parent_bill_d_no.eq(bind("parent_bill_d_no")))
						).view(S0_V1)
						.crossJoin(
							subQuery()
							.select(
								nvl(
									sum(S2_T1.trd_cur_amt2),
									value(0)
								).as("wtax_amt")
							)
							.from(
								S2_T1
								.innerJoin(S2_T2).on(
									bracket(
										S2_T1.rcv_act_no.eq(S2_T2.rcv_act_no)
										.and(S2_T1.rcv_act_seq.eq(S2_T2.rcv_act_seq))
									)
								)
								.innerJoin(S2_T3).on(
									bracket(
										S2_T1.rcv_act_d_no.eq(S2_T3.rcv_act_d_no)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								.and(S2_T2.ar_sttl_typ2.eq(value(MAC_AR_STTL_TYP.WTAX.value())))
								.and(S2_T3.bill_d_no.eq(bind("bill_d_no")))
								.and(S2_T3.parent_bill_d_no.eq(bind("parent_bill_d_no")))
							).view(S0_V2)
						)
					)
			);
	}
}