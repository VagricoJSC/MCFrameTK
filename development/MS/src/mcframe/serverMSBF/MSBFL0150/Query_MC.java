package mcframe.serverMSBF.MSBFL0150;

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
	 * -- MSBFL0150_MST_ITM_MFG_INST_Query_S01
	 */
	static MCQueryPlan MSBFL0150_MST_ITM_MFG_INST_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MST_ITM_MFG_INST_R S1_T1 = MST_ITM_MFG_INST_R.create("T1");
		MST_MFG_INST_R S1_T2 = MST_MFG_INST_R.create("T2");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MSVT_YIELD_ACT_LOT_R S2_T1 = MSVT_YIELD_ACT_LOT_R.create("T1");
		MST_ITM_MFG_INST_R S2_T2 = MST_ITM_MFG_INST_R.create("T2");
		MAM_ITM_R S2_M1 = MAM_ITM_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0150_MST_ITM_MFG_INST_Query_S01")
					.mainQuery()
					.select(
						S0_V1.pr(S1_T1.itm_mfg_inst_no),
						S0_V1.pr("mfg_act_no")
					)
					.from(
						subQuery()
						.select(
							S1_T1.itm_mfg_inst_no,
							nullValue().as("mfg_act_no"),
							S1_T2.end_schd_tm.as("tm")
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(S1_T1.frst_mfg_inst_no.eq(S1_T2.mfg_inst_no))
							.innerJoin(S1_M1).on(
								S1_T1.itm_cd.eq(S1_M1.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.itm_cd.eq(bind("itm_cd")))
							.and(S1_T1.itm_sub1.eq(bind("itm_sub1")))
							.and(S1_T1.itm_sub2.eq(bind("itm_sub2")))
							.and(S1_T1.itm_sub3.eq(bind("itm_sub3")))
							.and(S1_T1.lot_no.eq(bind("lot_no")))
							.and(
								S1_M1.sublot_mng_typ.eq(value(MAC_SUBLOT_MNG_TYP.STK.value()))
								.or(S1_T1.sublot_no.eq(bind("sublot_no")))
							)
							.and(S1_T1.wg_cd.eq(bind("wg_cd")))
							.and(S1_T1.can_flg.eq(value(false)))
						)
						.unionAll(
							subQuery()
							.select(
								S2_T1.itm_mfg_inst_no,
								S2_T1.mfg_act_no,
								S2_T1.act_tm
							)
							.from(
								S2_T1
								.innerJoin(S2_T2).on(S2_T1.itm_mfg_inst_no.eq(S2_T2.itm_mfg_inst_no))
								.innerJoin(S2_M1).on(
									S2_T1.itm_cd.eq(S2_M1.itm_cd)
									.and(S2_T1.itm_sub1.eq(S2_M1.itm_sub1))
									.and(S2_T1.itm_sub2.eq(S2_M1.itm_sub2))
									.and(S2_T1.itm_sub3.eq(S2_M1.itm_sub3))
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_T1.itm_cd.eq(bind("itm_cd")))
								.and(S2_T1.itm_sub1.eq(bind("itm_sub1")))
								.and(S2_T1.itm_sub2.eq(bind("itm_sub2")))
								.and(S2_T1.itm_sub3.eq(bind("itm_sub3")))
								.and(S2_T1.lot_no.eq(bind("lot_no")))
								.and(
									S2_M1.sublot_mng_typ.eq(value(MAC_SUBLOT_MNG_TYP.STK.value()))
									.or(S2_T1.sublot_no.eq(bind("sublot_no")))
								)
								.and(S2_T2.wg_cd.eq(bind("wg_cd")))
								.and(S2_T2.can_flg.eq(value(false)))
							)
						)
						.orderBy(
							pr("tm").desc(),
							pr("itm_mfg_inst_no").desc(),
							pr("mfg_act_no").desc()
						).view(S0_V1)
					)
			);
	}
	
	/**
	 * -- MSBFL0150_MST_ITM_MFG_INST_Query_S02
	 */
	static MCQueryPlan MSBFL0150_MST_ITM_MFG_INST_S02() {
		MST_ITM_MFG_INST_R S0_T1 = MST_ITM_MFG_INST_R.create("T1");
		MAM_LOT_INH_DEST_R S1_M1 = MAM_LOT_INH_DEST_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0150_MST_ITM_MFG_INST_Query_S02")
					.mainQuery()
					.select(
						S0_T1.itm_mfg_inst_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.bom_ptn,
						S0_T1.wg_cd,
						S0_T1.mfg_loc_cd,
						decode(
							bracket(
								subQuery()
								.select(countAll())
								.from(S1_M1)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.itm_cd.eq(S1_M1.par_itm_cd))
									.and(S0_T1.itm_sub1.eq(S1_M1.par_itm_sub1))
									.and(S0_T1.itm_sub2.eq(S1_M1.par_itm_sub2))
									.and(S0_T1.itm_sub3.eq(S1_M1.par_itm_sub3))
									.and(
										S0_T1.wg_cd.eq(S1_M1.wg_cd)
										.or(S1_M1.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))
									)
								)
							),
							value(0),
							nullValue(),
							value(MAC_STR.NULL_VAL.value())
						).as("lot_no")
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")))
						.and(S0_T1.can_flg.eq(value(false)))
					)
					.forUpdate(S0_T1.itm_mfg_inst_no)
			);
	}
	
}