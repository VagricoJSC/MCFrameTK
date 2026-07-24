package mcframe.serverMSBC.MSBCB1020;

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
	 * -- MSBCB1020_MST_MFG_INST_Query_S01
	 */
	static MCQueryPlan MSBCB1020_MST_MFG_INST_S01() {
		MST_MFG_INST_R S0_T1 = MST_MFG_INST_R.create("T1");
		MST_ITM_MFG_INST_R S0_T2 = MST_ITM_MFG_INST_R.create("T2");
		MSVT_MFG_INST_PR_R S0_T3 = MSVT_MFG_INST_PR_R.create("T3");
		MST_ITM_ORDER_R S0_T4 = MST_ITM_ORDER_R.create("T4");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MST_ITM_MFG_INST_R S1_TMP = MST_ITM_MFG_INST_R.create("TMP");
		MST_INPT_SCHD_R S2_W1 = MST_INPT_SCHD_R.create("W1");
		MSVT_INPT_SCHD_PR_R S2_W2 = MSVT_INPT_SCHD_PR_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCB1020_MST_MFG_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T3.mfg_sts_typ,
						S0_T2.mfg_loc_cd,
						S0_T2.mfg_str_ln_cd,
						S0_T2.bom_ptn,
						S0_T2.strg_loc_cd,
						S0_T2.strg_str_ln_cd,
						S0_T1.base_unit_inst_qty,
						S0_T1.base_unit_yield_qty,
						S0_T1.rqst_dlv_rqst_tm,
						S0_T1.st_schd_tm,
						S0_T1.end_schd_tm,
						S0_T2.oper_ptn,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T1.inst_dt,
						S0_T1.inst_usr_cd,
						S0_T1.inst_dpt_cd,
						S0_T1.po_locked_flg,
						cases()
							.when(S0_T4.not_inst_qty.gt(value(0)))
								.then(value(false))
							.when(
								S0_T4.inst_qty.gt(subQuery()
									.select(sum(S1_TMP.base_unit_inst_qty))
									.from(S1_TMP)
									.where(
										S1_TMP.itm_ord_no.eq(S0_T4.itm_ord_no)
										.and(S1_TMP.can_flg.eq(value(false)))
									)
								)
							)
								.then(value(true))
							.otherwise(value(false)).as("ord_abort_flg"),
						S0_T1.inst_rpt_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.disp_pd,
						S0_T2.sub_char1.as("itm_mfg_inst_sub_char1"),
						S0_T2.sub_char2.as("itm_mfg_inst_sub_char2"),
						S0_T2.sub_char3.as("itm_mfg_inst_sub_char3"),
						S0_T1.sub_char1.as("mfg_inst_sub_char1"),
						S0_T1.sub_char2.as("mfg_inst_sub_char2"),
						S0_T1.sub_char3.as("mfg_inst_sub_char3"),
						S0_T1.mfg_inst_no,
						S0_T1.itm_mfg_inst_no,
						S0_T2.itm_ord_no,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_M1.loc_grp_cd,
						S0_M1.sppl_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T3.mfg_inst_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T2.itm_ord_no.eq(S0_T4.itm_ord_no)
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_T2.mfg_loc_cd.eq(S0_M1.loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(
							S0_T3.mfg_sts_typ.in(
								value(MSC_MFG_STS_TYP.SAV.value()),
								value(MSC_MFG_STS_TYP.ORD.value()),
								value(MSC_MFG_STS_TYP.STT.value())
							)
						)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S2_W1
									.innerJoin(S2_W2).on(
										bracket(
											S2_W1.inpt_schd_no.eq(S2_W2.inpt_schd_no)
										)
									)
								)
								.where(
									S0_T1.mfg_inst_no.eq(S2_W1.mfg_inst_no)
									.and(S2_W1.can_flg.eq(value(false)))
									.and(S2_W1.base_unit_rqmt_qty.add(S2_W1.base_unit_fxd_rqmt_qty).gt(value(0)))
									.and(
										S2_W2.mfg_sts_typ.in(
											value(MSC_MFG_STS_TYP.SAV.value()),
											value(MSC_MFG_STS_TYP.ORD.value())
										)
									)
									.and(
										S2_W1.alloc_ctl_typ.in(
											value(MAC_ALLOC_CTL_TYP.ALLOC_INST_NG.value()),
											value(MAC_ALLOC_CTL_TYP.ALLOC_INST_OK.value())
										)
									)
									.and(
										S2_W1.alloc_flg.eq(value(false))
										.or(bind("re_alloc_mode_flg").eq(value(true)))
									)
								)
							)
						)
						.and(S0_T2.wg_cd.eq(bind("wg_cd")))
						.cutoff$and(S0_M1.loc_grp_cd.eq(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T2.mfg_loc_cd.eq(bind("mfg_loc_cd")))
						.cutoff$and(S0_T1.st_schd_tm.gte(bind("st_schd_dt_fr")))
						.cutoff$and(S0_T1.st_schd_tm.lte(bind("st_schd_dt_to")))
					)
			);
	}
}