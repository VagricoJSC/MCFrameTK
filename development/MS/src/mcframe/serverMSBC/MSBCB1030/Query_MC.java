package mcframe.serverMSBC.MSBCB1030;

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
	 * -- MSBCB1030_MST_OPER_ACT_Query_S01
	 */
	static MCQueryPlan MSBCB1030_MST_OPER_ACT_S01() {
		MST_OPER_ACT_R S0_T1 = MST_OPER_ACT_R.create("T1");
		MST_OPER_ACT_REM_R S0_T2 = MST_OPER_ACT_REM_R.create("T2");
		MST_MFG_ACT_REM_R S0_T3 = MST_MFG_ACT_REM_R.create("T3");
		MST_MFG_ACT_R S0_T4 = MST_MFG_ACT_R.create("T4");
		MST_ITM_MFG_INST_R S0_T5 = MST_ITM_MFG_INST_R.create("T5");
		MST_OPER_INST_R S0_T6 = MST_OPER_INST_R.create("T6");
		MSVT_MFG_INST_PR_R S0_T7 = MSVT_MFG_INST_PR_R.create("T7");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCB1030_MST_OPER_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T2.mfg_sts_typ,
						S0_T1.st_act_tm,
						S0_T4.st_ac_dt,
						S0_T1.end_act_tm,
						S0_T4.end_ac_dt,
						S0_T3.base_unit_mfg_qty.as("base_unit_st_act_qty"),
						bracket(
							cases()
								.when(S0_T7.base_unit_mfg_abort_qty.gt(value(0)))
									.then(value(true))
								.otherwise(value(false))
						).as("rem_abort_flg"),
						S0_T4.act_usr_cd,
						S0_T4.act_dpt_cd,
						S0_T4.act_rpt_rmrks.as("mfg_act_rpt_rmrks"),
						S0_T4.intr_rmrks.as("mfg_act_intr_rmrks"),
						S0_T4.sub_char1.as("mfg_act_sub_char1"),
						S0_T4.sub_char2.as("mfg_act_sub_char2"),
						S0_T4.sub_char3.as("mfg_act_sub_char3"),
						S0_T4.itm_yield,
						S0_T1.oper_unit_qty.as("oper_unit_act_qty"),
						S0_T1.intr_rmrks.as("oper_act_intr_rmrks"),
						S0_T1.act_rpt_rmrks.as("oper_act_rpt_rmrks"),
						S0_T1.sub_char1.as("oper_act_sub_char1"),
						S0_T1.sub_char2.as("oper_act_sub_char2"),
						S0_T1.sub_char3.as("oper_act_sub_char3"),
						S0_T1.oper_yield,
						S0_T1.oper_inst_no,
						S0_T1.oper_act_no,
						S0_T2.mfg_inst_no,
						S0_T2.div_seq,
						S0_T1.mfg_act_no,
						S0_T5.itm_cd,
						S0_T5.itm_sub1,
						S0_T5.itm_sub2,
						S0_T5.itm_sub3,
						S0_M1.loc_grp_cd,
						S0_T5.mfg_loc_cd,
						S0_T6.oper_cd,
						cases()
							.when(
								S0_T2.mfg_sts_typ.eq(value(MSC_MFG_STS_TYP.STT.value()))
								.and(S0_T1.end_act_tm.isNotNull())
							)
								.then(value(true))
							.otherwise(value(false)).as("not_cmpl_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.oper_inst_no.eq(S0_T2.oper_inst_no)
								.and(S0_T1.div_seq.eq(S0_T2.div_seq))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.mfg_inst_no.eq(S0_T3.mfg_inst_no)
								.and(S0_T2.div_seq.eq(S0_T3.div_seq))
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T1.mfg_act_no.eq(S0_T4.mfg_act_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T5.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T6).on(
							bracket(
								S0_T1.oper_inst_no.eq(S0_T6.oper_inst_no)
							)
						)
						.innerJoin(S0_T7).on(
							bracket(
								S0_T2.mfg_inst_no.eq(S0_T7.mfg_inst_no)
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_T5.mfg_loc_cd.eq(S0_M1.loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.bkf_not_ref_flg.eq(value(true)))
						.and(S0_T1.bkf_ctl_flg.eq(value(true)))
						.and(S0_T5.wg_cd.eq(bind("wg_cd")))
						.cutoff$and(S0_M1.loc_grp_cd.eq(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T5.mfg_loc_cd.eq(bind("mfg_loc_cd")))
					)
			);
	}
}