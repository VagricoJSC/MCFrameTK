package mcframe.serverMSBC.MSBCL6100;

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
	 * -- MSBCL6100_MSW_VER_CHG_KEY_Query_S01
	 */
	static MCQueryPlan MSBCL6100_MSW_VER_CHG_KEY_S01() {
		MSW_VER_CHG_KEY_R S0_W1 = MSW_VER_CHG_KEY_R.create("W1");
		MST_VER_CHG_R S0_T1 = MST_VER_CHG_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6100_MSW_VER_CHG_KEY_Query_S01")
					.mainQuery()
					.select(S0_T1.prAll())
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.par_itm_cd.eq(S0_W1.par_itm_cd)
								.and(S0_T1.par_itm_sub1.eq(S0_W1.par_itm_sub1))
								.and(S0_T1.par_itm_sub2.eq(S0_W1.par_itm_sub2))
								.and(S0_T1.par_itm_sub3.eq(S0_W1.par_itm_sub3))
								.and(S0_T1.chd_itm_cd.eq(S0_W1.chd_itm_cd))
								.and(S0_T1.chd_itm_sub1.eq(S0_W1.chd_itm_sub1))
								.and(S0_T1.chd_itm_sub2.eq(S0_W1.chd_itm_sub2))
								.and(S0_T1.chd_itm_sub3.eq(S0_W1.chd_itm_sub3))
								.and(S0_T1.ver_no.eq(S0_W1.ver_no))
								.and(S0_T1.bom_ptn.eq(S0_W1.bom_ptn))
								.and(S0_T1.wg_cd.eq(S0_W1.wg_cd))
								.and(S0_T1.site_cd.eq(S0_W1.site_cd))
							)
						)
					)
					.orderBy(
						S0_W1.par_itm_cd.asc(),
						S0_W1.par_itm_sub1.asc(),
						S0_W1.par_itm_sub2.asc(),
						S0_W1.par_itm_sub3.asc(),
						S0_W1.chd_itm_cd.asc(),
						S0_W1.chd_itm_sub1.asc(),
						S0_W1.chd_itm_sub2.asc(),
						S0_W1.chd_itm_sub3.asc(),
						S0_W1.ver_no.asc(),
						S0_W1.bom_ptn.asc(),
						S0_W1.site_cd.asc(),
						S0_W1.wg_cd.asc()
					)
					.forUpdate(S0_T1.par_itm_cd)
			);
	}
	
	/**
	 * -- MSBCL6100_MSW_VER_CHG_KEY_Query_S02
	 */
	static MCQueryPlan MSBCL6100_MSW_VER_CHG_KEY_S02() {
		MSW_VER_CHG_KEY_R S0_W1 = MSW_VER_CHG_KEY_R.create("W1");
		MST_INPT_SCHD_R S0_T1 = MST_INPT_SCHD_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MST_ITM_MFG_INST_R S0_T3 = MST_ITM_MFG_INST_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6100_MSW_VER_CHG_KEY_Query_S02")
					.mainQuery()
					.select(
						S0_W1.par_itm_cd,
						S0_W1.par_itm_sub1,
						S0_W1.par_itm_sub2,
						S0_W1.par_itm_sub3,
						S0_W1.chd_itm_cd,
						S0_W1.chd_itm_sub1,
						S0_W1.chd_itm_sub2,
						S0_W1.chd_itm_sub3,
						S0_W1.ver_no,
						S0_W1.bom_ptn,
						S0_W1.site_cd,
						S0_W1.wg_cd,
						S0_T2.st_schd_tm.as("first_inst_st_tm"),
						S0_T2.mfg_inst_no.as("first_mfg_inst_no"),
						S0_T3.lot_no.as("first_inst_lot_no"),
						S0_T3.sublot_no.as("first_inst_sublot_no")
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.chd_itm_cd.eq(S0_T1.itm_cd)
								.and(S0_W1.chd_itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_W1.chd_itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_W1.chd_itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_W1.ver_no.eq(S0_T1.ver_no))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T3.itm_mfg_inst_no)
								.and(S0_W1.par_itm_cd.eq(S0_T3.itm_cd))
								.and(S0_W1.par_itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_W1.par_itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_W1.par_itm_sub3.eq(S0_T3.itm_sub3))
								.and(S0_W1.bom_ptn.eq(S0_T3.bom_ptn))
								.and(S0_W1.wg_cd.eq(S0_T3.wg_cd))
								.and(S0_W1.site_cd.eq(S0_T3.site_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.base_unit_inpt_qty.gt(value(0)))
						.and(S0_T2.abort_flg.eq(value(false)))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(
							S0_T1.alt_grp_cd.isNull()
							.or(
								S0_T1.alt_grp_cd.isNotNull()
								.and(S0_T1.alt_itm_fix_flg.eq(value(true)))
							)
						)
					)
					.orderBy(
						S0_W1.par_itm_cd.asc(),
						S0_W1.par_itm_sub1.asc(),
						S0_W1.par_itm_sub2.asc(),
						S0_W1.par_itm_sub3.asc(),
						S0_W1.chd_itm_cd.asc(),
						S0_W1.chd_itm_sub1.asc(),
						S0_W1.chd_itm_sub2.asc(),
						S0_W1.chd_itm_sub3.asc(),
						S0_W1.ver_no.asc(),
						S0_W1.bom_ptn.asc(),
						S0_W1.site_cd.asc(),
						S0_W1.wg_cd.asc(),
						S0_T2.st_schd_tm.asc(),
						S0_T2.mfg_inst_no.asc()
					)
			);
	}
	
	/**
	 * -- MSBCL6100_MSW_VER_CHG_KEY_Query_S03
	 */
	static MCQueryPlan MSBCL6100_MSW_VER_CHG_KEY_S03() {
		MSW_VER_CHG_KEY_R S0_W1 = MSW_VER_CHG_KEY_R.create("W1");
		MST_INPT_ACT_R S0_T1 = MST_INPT_ACT_R.create("T1");
		MST_MFG_ACT_R S0_T2 = MST_MFG_ACT_R.create("T2");
		MST_ITM_MFG_INST_R S0_T3 = MST_ITM_MFG_INST_R.create("T3");
		MSVT_YIELD_ACT_LOT_R S0_T4 = MSVT_YIELD_ACT_LOT_R.create("T4");
		MST_MFG_INST_R S0_T5 = MST_MFG_INST_R.create("T5");
		MSW_VER_CHG_KEY_R S1_W1 = MSW_VER_CHG_KEY_R.create("W1");
		MST_INPT_ACT_R S1_T1 = MST_INPT_ACT_R.create("T1");
		MST_ITM_MFG_INST_R S1_T3 = MST_ITM_MFG_INST_R.create("T3");
		MST_MFG_ACT_R S1_T2 = MST_MFG_ACT_R.create("T2");
		MSVT_YIELD_ACT_LOT_R S1_T4 = MSVT_YIELD_ACT_LOT_R.create("T4");
		MST_MFG_INST_R S1_T5 = MST_MFG_INST_R.create("T5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6100_MSW_VER_CHG_KEY_Query_S03")
					.mainQuery()
					.select(
						S0_W1.par_itm_cd,
						S0_W1.par_itm_sub1,
						S0_W1.par_itm_sub2,
						S0_W1.par_itm_sub3,
						S0_W1.chd_itm_cd,
						S0_W1.chd_itm_sub1,
						S0_W1.chd_itm_sub2,
						S0_W1.chd_itm_sub3,
						S0_W1.ver_no,
						S0_W1.bom_ptn,
						S0_W1.site_cd,
						S0_W1.wg_cd,
						S0_T2.st_act_tm.as("first_act_st_tm"),
						S0_T4.lot_no.as("first_act_lot_no"),
						S0_T4.sublot_no.as("first_act_sublot_no"),
						S0_T2.mfg_act_no.as("first_mfg_act_no"),
						S0_T4.act_tm,
						S0_T4.yield_act_no,
						S0_T4.arr_act_no
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.chd_itm_cd.eq(S0_T1.itm_cd)
								.and(S0_W1.chd_itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_W1.chd_itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_W1.chd_itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_W1.ver_no.eq(S0_T1.ver_no))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.mfg_act_no.eq(S0_T2.mfg_act_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T3.itm_mfg_inst_no)
								.and(S0_W1.par_itm_cd.eq(S0_T3.itm_cd))
								.and(S0_W1.par_itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_W1.par_itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_W1.par_itm_sub3.eq(S0_T3.itm_sub3))
								.and(S0_W1.bom_ptn.eq(S0_T3.bom_ptn))
								.and(S0_W1.wg_cd.eq(S0_T3.wg_cd))
								.and(S0_W1.site_cd.eq(S0_T3.site_cd))
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T2.mfg_act_no.eq(S0_T4.mfg_act_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T2.mfg_inst_no.eq(S0_T5.mfg_inst_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T1.base_unit_inpt_qty.gt(value(0))
							.or(S0_T1.base_unit_loss_qty.gt(value(0)))
						)
						.and(S0_T4.base_unit_qty.gt(value(0)))
						.and(S0_T5.mfg_inst_unit_typ.eq(value(MAC_MFG_INST_UNIT_TYP.ITM.value())))
					)
					.unionAll(
						subQuery()
						.select(
							S1_W1.par_itm_cd,
							S1_W1.par_itm_sub1,
							S1_W1.par_itm_sub2,
							S1_W1.par_itm_sub3,
							S1_W1.chd_itm_cd,
							S1_W1.chd_itm_sub1,
							S1_W1.chd_itm_sub2,
							S1_W1.chd_itm_sub3,
							S1_W1.ver_no,
							S1_W1.bom_ptn,
							S1_W1.site_cd,
							S1_W1.wg_cd,
							S1_T2.st_act_tm.as("first_act_st_tm"),
							S1_T4.lot_no.as("first_act_lot_no"),
							S1_T4.sublot_no.as("first_act_sublot_no"),
							S1_T2.mfg_act_no.as("first_mfg_act_no"),
							S1_T4.act_tm,
							S1_T4.yield_act_no,
							S1_T4.arr_act_no
						)
						.from(
							S1_W1
							.innerJoin(S1_T1).on(
								bracket(
									S1_W1.chd_itm_cd.eq(S1_T1.itm_cd)
									.and(S1_W1.chd_itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_W1.chd_itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_W1.chd_itm_sub3.eq(S1_T1.itm_sub3))
									.and(S1_W1.ver_no.eq(S1_T1.ver_no))
								)
							)
							.innerJoin(S1_T3).on(
								bracket(
									S1_T1.itm_mfg_inst_no.eq(S1_T3.itm_mfg_inst_no)
									.and(S1_W1.par_itm_cd.eq(S1_T3.itm_cd))
									.and(S1_W1.par_itm_sub1.eq(S1_T3.itm_sub1))
									.and(S1_W1.par_itm_sub2.eq(S1_T3.itm_sub2))
									.and(S1_W1.par_itm_sub3.eq(S1_T3.itm_sub3))
									.and(S1_W1.bom_ptn.eq(S1_T3.bom_ptn))
									.and(S1_W1.wg_cd.eq(S1_T3.wg_cd))
									.and(S1_W1.site_cd.eq(S1_T3.site_cd))
								)
							)
							.innerJoin(S1_T2).on(
								bracket(
									S1_T3.itm_mfg_inst_no.eq(S1_T2.itm_mfg_inst_no)
								)
							)
							.innerJoin(S1_T4).on(
								bracket(
									S1_T2.mfg_act_no.eq(S1_T4.mfg_act_no)
								)
							)
							.innerJoin(S1_T5).on(
								bracket(
									S1_T2.mfg_inst_no.eq(S1_T5.mfg_inst_no)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T1.base_unit_inpt_qty.gt(value(0))
								.or(S1_T1.base_unit_loss_qty.gt(value(0)))
							)
							.and(S1_T4.base_unit_qty.gt(value(0)))
							.and(S1_T5.mfg_inst_unit_typ.eq(value(MAC_MFG_INST_UNIT_TYP.OPER.value())))
						)
					)
					.orderBy(
						pr("par_itm_cd").asc(),
						pr("par_itm_sub1").asc(),
						pr("par_itm_sub2").asc(),
						pr("par_itm_sub3").asc(),
						pr("chd_itm_cd").asc(),
						pr("chd_itm_sub1").asc(),
						pr("chd_itm_sub2").asc(),
						pr("chd_itm_sub3").asc(),
						pr("ver_no").asc(),
						pr("bom_ptn").asc(),
						pr("site_cd").asc(),
						pr("wg_cd").asc(),
						pr("act_tm").asc(),
						pr("yield_act_no").asc(),
						pr("arr_act_no").asc()
					)
			);
	}
}