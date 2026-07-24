package mcframe.serverMGBD.MGBDL5010;

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
import mcframe.commonMG.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMG.dbc.*;

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
import static mcframe.serverMG.dbc.MGFunction.*;

public class Query_MC {
	
	/**
	 * -- MGBDL5010_MAM_RPT_KEY_Query_S01
	 */
	static MCQueryPlan MGBDL5010_MAM_RPT_KEY_S01() {
		MAM_RPT_KEY_R S0_M1 = MAM_RPT_KEY_R.create("M1");
		MAM_RPT_KEY_CONF_R S0_M2 = MAM_RPT_KEY_CONF_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL5010_MAM_RPT_KEY_Query_S01")
					.mainQuery()
					.select(
						S0_M1.rpt_key_cd,
						decode(
							S0_M1.rpt_key_typ,
							value(MAC_RPT_KEY_TYP.MNG_DPT.value()),
							S0_M2.dpt_cd,
							nullValue()
						).as("dpt_cd"),
						decode(
							S0_M1.rpt_key_typ,
							value(MAC_RPT_KEY_TYP.WG.value()),
							S0_M2.wg_cd,
							nullValue()
						).as("wg_cd"),
						decode(
							S0_M1.rpt_key_typ,
							value(MAC_RPT_KEY_TYP.ITM.value()),
							S0_M2.itm_cd,
							nullValue()
						).as("itm_cd"),
						decode(
							S0_M1.rpt_key_typ,
							value(MAC_RPT_KEY_TYP.ITM.value()),
							S0_M2.itm_sub1,
							nullValue()
						).as("itm_sub1"),
						decode(
							S0_M1.rpt_key_typ,
							value(MAC_RPT_KEY_TYP.ITM.value()),
							S0_M2.itm_sub2,
							nullValue()
						).as("itm_sub2"),
						decode(
							S0_M1.rpt_key_typ,
							value(MAC_RPT_KEY_TYP.ITM.value()),
							S0_M2.itm_sub3,
							nullValue()
						).as("itm_sub3"),
						decode(
							S0_M1.rpt_key_typ,
							value(MAC_RPT_KEY_TYP.ITM_JNL.value()),
							S0_M2.itm_jnl_cd,
							nullValue()
						).as("itm_jnl_cd"),
						decode(
							MAC_RPT_KEY_TYP$ITM_GRP(S0_M1.rpt_key_typ),
							S0_M2.itm_grp_typ,
							S0_M2.itm_grp_typ,
							nullValue()
						).as("itm_grp_typ"),
						decode(
							MAC_RPT_KEY_TYP$ITM_GRP(S0_M1.rpt_key_typ),
							S0_M2.itm_grp_typ,
							S0_M2.itm_grp_cd,
							nullValue()
						).as("itm_grp_cd")
					)
					.from(
						S0_M1
						.innerJoin(S0_M2).on(S0_M1.rpt_key_cd.eq(S0_M2.rpt_key_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.rpt_key_cd.eq(bind("rpt_key_cd")))
					)
			);
	}
	
	/**
	 * -- MGBDL5010_MGT_ACC_TOP_Query_S01
	 */
	static MCQueryPlan MGBDL5010_MGT_ACC_TOP_S01() {
		MGT_ACC_TOP_R S0_T1 = MGT_ACC_TOP_R.create("T1");
		MGT_ACC_TOP_R S1_T1 = MGT_ACC_TOP_R.create("T1");
		MGT_ACC_TOP_R S2_T1 = MGT_ACC_TOP_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL5010_MGT_ACC_TOP_Query_S01")
					.mainQuery()
					.select(S0_T1.wg_cd)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.calc_no.eq(bind("calc_no")))
						.and(S0_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(
							S0_T1.calc_rec_typ.in(
								value(MGC_CALC_REC_TYP.ST_WIP.value()),
								value(MGC_CALC_REC_TYP.COMP.value()),
								value(MGC_CALC_REC_TYP.END_WIP.value())
							)
						)
					)
					.union(
						subQuery()
						.select(S1_T1.wg_cd)
						.from(S1_T1)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.calc_no.eq(bind("calc_no")))
							.and(S1_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.END_WIP.value())))
							.and(
								S1_T1.ym.lte(addMonths(
										bind("end_ym"),
										value(-1)
									)
								)
							)
						)
						.union(
							subQuery()
							.select(S2_T1.wg_cd)
							.from(S2_T1)
							.where(
								value(0).eq(value(0))
								.and(S2_T1.calc_no.eq(bind("calc_no")))
								.and(S2_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
								.and(S2_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL5010_MGT_ACC_TOP_Query_U01
	 */
	static MCQueryPlan MGBDL5010_MGT_ACC_TOP_U01() {
		MGT_ACC_TOP_R S0_T = MGT_ACC_TOP_R.create("T");
		MGT_CALC_IO_TRD_R S1_X = MGT_CALC_IO_TRD_R.create("X");
		MGT_CALC_IO_TRD_R S2_W = MGT_CALC_IO_TRD_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL5010_MGT_ACC_TOP_Query_U01")
					.update(S0_T)
					.set(S0_T.trd_grp).eq(subQuery()
						.select(S1_X.trd_grp)
						.from(S1_X)
						.where(
							value(0).eq(value(0))
							.and(S1_X.calc_no.eq(S0_T.calc_no))
							.and(S1_X.calc_grp_cd.eq(S0_T.calc_grp_cd))
							.and(S1_X.act_io_id.eq(S0_T.act_id))
							.and(S1_X.act_io_id_sub.eq(S0_T.act_id_sub))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.calc_no.eq(bind("calc_no")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.trd_grp.isNull())
						.and(S0_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.IO.value())))
						.and(
							S0_T.cost_io_typ.in(
								value(MAC_COST_IO_TYP.STK_OUT.value()),
								value(MAC_COST_IO_TYP.STK_IN.value())
							)
						)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_W)
								.where(
									value(0).eq(value(0))
									.and(S2_W.calc_no.eq(S0_T.calc_no))
									.and(S2_W.calc_grp_cd.eq(S0_T.calc_grp_cd))
									.and(S2_W.act_io_id.eq(S0_T.act_id))
									.and(S2_W.act_io_id_sub.eq(S0_T.act_id_sub))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL5010_MGVT_ARG_USR_Query_S01
	 */
	static MCQueryPlan MGBDL5010_MGVT_ARG_USR_S01() {
		MGVT_ARG_USR_R S0_M = MGVT_ARG_USR_R.create("M");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL5010_MGVT_ARG_USR_Query_S01")
					.mainQuery()
					.select(S0_M.prAll())
					.from(S0_M)
					.where(
						value(0).eq(value(0))
						.and(S0_M.calc_no.eq(bind("calc_no")))
						.and(S0_M.calc_grp_cd.eq(bind("calc_grp_cd")))
					)
			);
	}
}