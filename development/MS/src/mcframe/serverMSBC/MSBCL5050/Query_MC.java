package mcframe.serverMSBC.MSBCL5050;

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
	 * -- MSBCL5050_EXP_TGT_Query_S01
	 */
	static MCQueryPlan MSBCL5050_EXP_TGT_S01() {
		MSW_WG_RQST_KEY_R S0_T1 = MSW_WG_RQST_KEY_R.create("T1");
		MST_WG_RQST_R S0_T2 = MST_WG_RQST_R.create("T2");
		MST_IO_SCHD_R S0_T3 = MST_IO_SCHD_R.create("T3");
		MSW_WG_RQST_KEY_R S1_T1 = MSW_WG_RQST_KEY_R.create("T1");
		MST_WG_RQST_R S1_T2 = MST_WG_RQST_R.create("T2");
		MST_IO_SCHD_R S1_T3 = MST_IO_SCHD_R.create("T3");
		MSW_SLO_D_KEY_R S2_T1 = MSW_SLO_D_KEY_R.create("T1");
		MST_SLO_D_R S2_T2 = MST_SLO_D_R.create("T2");
		MST_IO_SCHD_R S2_T3 = MST_IO_SCHD_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5050_EXP_TGT_Query_S01")
					.mainQuery()
					.select(
						nullValue().as("rqmt_no"),
						S0_T3.wg_cd.as("wg_cd"),
						bind("sim_mrp_no").as("sim_mrp_no"),
						bind("tree_lvl").as("tree_lvl"),
						S0_T2.wg_rqst_typ,
						S0_T2.wg_rqst_no,
						nullValue().as("slo_d_no"),
						S0_T3.io_schd_no,
						S0_T3.io_schd_typ,
						S0_T3.io_schd_sts_typ
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.wg_rqst_no.eq(S0_T1.wg_rqst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.io_schd_pr_no.eq(S0_T2.io_schd_pr_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T2.wg_rqst_typ.in(
								value(MSC_WG_RQST_TYP.PURC.value()),
								value(MSC_WG_RQST_TYP.XFR.value())
							)
						)
						.and(S0_T3.wg_cd.eq(bind("wg_cd")))
						.and(S0_T3.avl_flg.eq(value(true)))
						.and(S0_T3.io_typ.eq(value(MSC_IO_TYP.GI.value())))
					)
					.unionAll(
						subQuery()
						.select(
							nullValue().as("rqmt_no"),
							S1_T3.wg_cd.as("wg_cd"),
							bind("sim_mrp_no").as("sim_mrp_no"),
							bind("tree_lvl").as("tree_lvl"),
							S1_T2.wg_rqst_typ,
							S1_T2.wg_rqst_no,
							nullValue().as("slo_d_no"),
							S1_T3.io_schd_no,
							S1_T3.io_schd_typ,
							S1_T3.io_schd_sts_typ
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T2.wg_rqst_no.eq(S1_T1.wg_rqst_no)
								)
							)
							.innerJoin(S1_T3).on(
								bracket(
									S1_T3.io_schd_sub_typ2.eq(value(MSC_IO_SCHD_SUB_TYP.SLO_D_NO.value()))
									.and(S1_T3.io_schd_sub_no2.eq(S1_T2.slo_d_no))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T2.wg_rqst_typ.eq(value(MSC_WG_RQST_TYP.SHIP.value())))
							.and(S1_T3.wg_cd.eq(bind("wg_cd")))
							.and(S1_T3.io_typ.eq(value(MSC_IO_TYP.GI.value())))
						)
						.unionAll(
							subQuery()
							.select(
								nullValue().as("rqmt_no"),
								S2_T3.wg_cd.as("wg_cd"),
								bind("sim_mrp_no").as("sim_mrp_no"),
								bind("tree_lvl").as("tree_lvl"),
								value(MSC_WG_RQST_TYP.SHIP.value()),
								nullValue().as("wg_rqst_no"),
								S2_T2.slo_d_no.as("slo_d_no"),
								S2_T3.io_schd_no,
								S2_T3.io_schd_typ,
								S2_T3.io_schd_sts_typ
							)
							.from(
								S2_T1
								.innerJoin(S2_T2).on(
									bracket(
										S2_T2.slo_d_no.eq(S2_T1.slo_d_no)
									)
								)
								.innerJoin(S2_T3).on(
									bracket(
										S2_T3.io_schd_sub_typ2.eq(value(MSC_IO_SCHD_SUB_TYP.SLO_D_NO.value()))
										.and(S2_T3.io_schd_sub_no2.eq(S2_T2.slo_d_no))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_T3.wg_cd.eq(bind("wg_cd")))
								.and(S2_T3.io_typ.eq(value(MSC_IO_TYP.GI.value())))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL5050_MST_SIM_PRMS_RSLT_Query_D01
	 */
	static MCQueryPlan MSBCL5050_MST_SIM_PRMS_RSLT_D01() {
		MST_SIM_PRMS_RSLT_R S0_T = MST_SIM_PRMS_RSLT_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5050_MST_SIM_PRMS_RSLT_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.wg_cd.eq(bind("wg_cd")))
					)
			);
	}
	
	/**
	 * -- MSBCL5050_MSW_ITM_ORD_F_HRRCHY_Query_S01
	 */
	static MCQueryPlan MSBCL5050_MSW_ITM_ORD_F_HRRCHY_S01() {
		MSW_ITM_ORD_F_HRRCHY_R S0_T1 = MSW_ITM_ORD_F_HRRCHY_R.create("T1");
		MCTempView S0_T2 = createTempView("T2");
		MST_ITM_ORDER_R S1_T01 = MST_ITM_ORDER_R.create("T01");
		MST_SIM_ITM_ORDER_R S2_T02 = MST_SIM_ITM_ORDER_R.create("T02");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5050_MSW_ITM_ORD_F_HRRCHY_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.root_id,
						S0_T1.sort_no,
						S0_T1.hrrchy,
						S0_T1.itm_ord_no,
						S0_T1.chd_io_schd_pr_no.as("io_schd_pr_no"),
						S0_T1.chd_lot_no.as("lot_no"),
						S0_T1.chd_sublot_no.as("sublot_no"),
						S0_T1.wg_cd,
						S0_T2.pr(S1_T01.itm_ord_typ),
						S0_T2.pr(S1_T01.po_schd_dt),
						S0_T2.pr(S1_T01.mfg_st_schd_dt),
						S0_T2.pr(S1_T01.gi_schd_dt)
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T01.itm_ord_no,
								S1_T01.po_schd_dt,
								S1_T01.mfg_st_schd_dt,
								S1_T01.gi_schd_dt,
								S1_T01.itm_ord_typ
							)
							.from(S1_T01)
							.unionAll(
								subQuery()
								.select(
									S2_T02.itm_ord_no,
									S2_T02.po_schd_dt,
									S2_T02.mfg_st_schd_dt,
									S2_T02.gi_schd_dt,
									S2_T02.itm_ord_typ
								)
								.from(S2_T02)
								.where(
									S2_T02.exp_dt.isNull()
								)
							).view(S0_T2)
						).on(
							bracket(
								S0_T1.chd_io_schd_pr_no.eq(S0_T2.pr(S1_T01.itm_ord_no))
							)
						)
					)
					.orderBy(
						S0_T1.root_id.asc(),
						S0_T1.sort_no.asc()
					)
			);
	}
}