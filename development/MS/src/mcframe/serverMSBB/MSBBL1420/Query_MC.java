package mcframe.serverMSBB.MSBBL1420;

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
	 * -- MSBBL1420_MST_SLS_ACT_Query_S01
	 */
	static MCQueryPlan MSBBL1420_MST_SLS_ACT_S01() {
		MST_SLS_ACT_R S0_T1 = MST_SLS_ACT_R.create("T1");
		MST_DLV_SLIP_R S0_T2 = MST_DLV_SLIP_R.create("T2");
		MST_SLS_ACT_D_R S0_T3 = MST_SLS_ACT_D_R.create("T3");
		MST_WRK_R S0_T4 = MST_WRK_R.create("T4");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_WG_R S0_M6 = MAM_WG_R.create("M6");
		MAVM_RD_DPT_R S0_M7 = MAVM_RD_DPT_R.create("M7");
		MAM_BP_GRP_R S0_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S0_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S0_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S0_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S0_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S0_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S0_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S0_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S0_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S0_MM110 = MAM_BP_GRP_R.create("MM110");
		MAM_BP_GRP_R S0_MM21 = MAM_BP_GRP_R.create("MM21");
		MAM_BP_GRP_R S0_MM22 = MAM_BP_GRP_R.create("MM22");
		MAM_BP_GRP_R S0_MM23 = MAM_BP_GRP_R.create("MM23");
		MAM_BP_GRP_R S0_MM24 = MAM_BP_GRP_R.create("MM24");
		MAM_BP_GRP_R S0_MM25 = MAM_BP_GRP_R.create("MM25");
		MAM_BP_GRP_R S0_MM26 = MAM_BP_GRP_R.create("MM26");
		MAM_BP_GRP_R S0_MM27 = MAM_BP_GRP_R.create("MM27");
		MAM_BP_GRP_R S0_MM28 = MAM_BP_GRP_R.create("MM28");
		MAM_BP_GRP_R S0_MM29 = MAM_BP_GRP_R.create("MM29");
		MAM_BP_GRP_R S0_MM210 = MAM_BP_GRP_R.create("MM210");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1420_MST_SLS_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_T1.sls_act_no,
						S0_T1.sls_act_rev,
						S0_T1.dlv_slip_no,
						S0_T2.dlv_slip_seq,
						S0_T2.dlv_slip_rev,
						S0_T1.ship_dlv_slip_no,
						S0_T1.sls_dt,
						S0_T1.ac_dt,
						S0_T1.cst_cd,
						S0_M2.bp_nm.as("cst_nm"),
						S0_T2.dlv_id_cd.as("dlv_cd"),
						nvl(
							S0_T2.dlv_id_nm,
							S0_M3.bp_nm
						).as("dlv_nm"),
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_M5.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.cst_po_no,
						S0_T3.wrk_no,
						S0_T1.trd_rmrks,
						S0_T1.slo_no,
						S0_T1.sls_ret_schd_no,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_func_id,
						S0_T2.ins_ts,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_func_id,
						S0_T2.upd_ts,
						S0_T2.upd_srv_req_no,
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_DLV_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.dlv_slip_no.eq(S0_T2.dlv_slip_no)
								.and(S0_T1.dlv_slip_seq.eq(S0_T2.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.sls_act_no.eq(S0_T3.sls_act_no)
								.and(S0_T1.sls_act_seq.eq(S0_T3.sls_act_seq))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.cst_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T2.dlv_id_cd.eq(S0_M3.bp_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_M5.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.innerJoin(S0_M7).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_M7.dpt_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_DLV_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.sls_prnt_flg.eq(bind("prnt_flg")))
						.cutoff$and(S0_T1.sls_dt.gte(bind("sls_dt_fr")))
						.cutoff$and(S0_T1.sls_dt.lte(bind("sls_dt_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.sls_act_no.like(bind("sls_act_no")))
						.cutoff$and(S0_T1.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.ship_dlv_slip_no.like(bind("ship_dlv_slip_no")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.sls_ret_schd_no.like(bind("sls_ret_schd_no")))
						.cutoff$and(S0_T1.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_M5.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_T2.dlv_id_cd.like(bind("dlv_cd")))
						.cutoff$and(
							nvl(
								S0_T2.dlv_id_nm,
								S0_M3.bp_nm
							).like(bind("dlv_nm"))
						)
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.slip_sts_typ.eq(decode(
									bind("inv_can_flg"),
									value(true),
									S0_T1.slip_sts_typ,
									value(MAC_SLIP_STS_TYP.CRT.value())
								)
							)
						)
						.and(S0_M2.cst_iv_flg.eq(value(false)))
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
					)
					.orderBy(
						S0_T1.sls_act_no.asc(),
						S0_T1.sls_act_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T3.wrk_no.eq(S0_T4.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T4.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T4.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.sls_usr_cd.eq(S0_M4.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T1.wg_cd.eq(S0_M6.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.wg_nm.like(bind("wg_nm")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd1.as("cst_grp_cd1"), S0_MM11.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M2.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd2.as("cst_grp_cd2"), S0_MM12.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M2.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd3.as("cst_grp_cd3"), S0_MM13.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M2.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd4.as("cst_grp_cd4"), S0_MM14.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M2.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd5.as("cst_grp_cd5"), S0_MM15.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M2.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd6.as("cst_grp_cd6"), S0_MM16.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M2.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd7.as("cst_grp_cd7"), S0_MM17.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M2.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd8.as("cst_grp_cd8"), S0_MM18.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M2.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd9.as("cst_grp_cd9"), S0_MM19.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M2.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M2.bp_grp_cd10.as("cst_grp_cd10"), S0_MM110.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M2.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M3.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM21.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M3.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M3.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM22.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M3.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M3.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM23.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M3.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M3.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM24.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M3.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M3.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM25.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M3.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M3.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM26.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M3.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M3.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM27.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M3.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M3.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM28.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M3.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M3.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM29.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M3.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M3.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM210.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M3.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("dlv_grp_nm10"))))
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