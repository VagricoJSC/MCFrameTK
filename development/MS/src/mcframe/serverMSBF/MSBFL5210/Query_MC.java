package mcframe.serverMSBF.MSBFL5210;

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
	 * -- MSBFL5210_MST_INPT_ACT_Query_S01
	 */
	static MCQueryPlan MSBFL5210_MST_INPT_ACT_S01() {
		MSW_YIELD_ACT_KEY_R S0W1 = MSW_YIELD_ACT_KEY_R.create("W1");
		MST_YIELD_ACT_R S0T1 = MST_YIELD_ACT_R.create("T1");
		MST_INPT_ACT_R S0T2 = MST_INPT_ACT_R.create("T2");
		MSVT_LOT_LIST_R S0V1 = MSVT_LOT_LIST_R.create("V1");
		MST_INPT_SCHD_R S0T3 = MST_INPT_SCHD_R.create("T3");
		MAM_ITM_R S0M1 = MAM_ITM_R.create("M1");
		MST_MFG_ACT_R S0T4 = MST_MFG_ACT_R.create("T4");
		MST_MFG_INST_R S0T5 = MST_MFG_INST_R.create("T5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5210_MST_INPT_ACT_Query_S01")
				.mainQuery()
				.selectDistinct(
					S0T2.mfg_act_no,
					S0T2.itm_cd.as("main_itm_cd"),
					S0T2.itm_sub1.as("main_itm_sub1"),
					S0T2.itm_sub2.as("main_itm_sub2"),
					S0T2.itm_sub3.as("main_itm_sub3"),
					S0T2.lot_no.as("main_lot_no"),
					S0T2.sublot_no.as("main_sublot_no"),
					S0M1.sublot_mng_typ,
					S0V1.vld_dt,
					S0V1.lmt_dt,
					S0V1.lmt_dt_frm,
					S0V1.first_gr_dt,
					S0V1.lot_seq
				)
				.from(
					S0W1
					.innerJoin(S0T1).on(
						bracket(
							S0W1.yield_act_no.eq(S0T1.yield_act_no)
						)
					)
					.innerJoin(S0T2).on(
						bracket(
							S0T1.mfg_act_no.eq(S0T2.mfg_act_no)
						)
					)
					.innerJoin(S0V1).on(
						bracket(
							S0T2.itm_cd.eq(S0V1.itm_cd)
							.and(S0T2.itm_sub1.eq(S0V1.itm_sub1))
							.and(S0T2.itm_sub2.eq(S0V1.itm_sub2))
							.and(S0T2.itm_sub3.eq(S0V1.itm_sub3))
							.and(S0T2.lot_no.eq(S0V1.lot_no))
							.and(S0T2.sublot_no.eq(S0V1.sublot_no))
						)
					)
					.innerJoin(S0T3).on(
						bracket(
							S0T2.inpt_schd_no.eq(S0T3.inpt_schd_no)
						)
					)
					.innerJoin(S0M1).on(
						bracket(
							S0T2.itm_cd.eq(S0M1.itm_cd)
							.and(S0T2.itm_sub1.eq(S0M1.itm_sub1))
							.and(S0T2.itm_sub2.eq(S0M1.itm_sub2))
							.and(S0T2.itm_sub3.eq(S0M1.itm_sub3))
						)
					)
					.innerJoin(S0T4).on(
						bracket(
							S0T1.mfg_act_no.eq(S0T4.mfg_act_no)
						)
					)
					.innerJoin(S0T5).on(
						bracket(
							S0T4.mfg_inst_no.eq(S0T5.mfg_inst_no)
						)
					)
				)
				.where(
					value(0).eq(value(0))
					.and(S0T5.mfg_inst_unit_typ.eq(value(MAC_MFG_INST_UNIT_TYP.ITM.value())))
					.and(
						S0T2.base_unit_inpt_qty.gt(value(0))
						.or(S0T2.base_unit_loss_qty.gt(value(0)))
						.or(S0T2.base_unit_fxd_loss_qty.gt(value(0)))
					)
					.and(S0T3.main_itm_flg.eq(value(true)))
				)
			);
	}
	
	/**
	 * -- MSBFL5210_MST_INPT_ACT_Query_S02
	 */
	static MCQueryPlan MSBFL5210_MST_INPT_ACT_S02() {
		MSW_ITM_MFG_INST_KEY_R S0W1 = MSW_ITM_MFG_INST_KEY_R.create("W1");
		MST_INPT_ACT_R S0T1 = MST_INPT_ACT_R.create("T1");
		MSVT_LOT_LIST_R S0T2 = MSVT_LOT_LIST_R.create("T2");
		MST_INPT_SCHD_R S0T3 = MST_INPT_SCHD_R.create("T3");
		MAM_ITM_R S0M1 = MAM_ITM_R.create("M1");
		MST_MFG_INST_R S0T5 = MST_MFG_INST_R.create("T5");
		MST_ITM_MFG_INST_R S0T6 = MST_ITM_MFG_INST_R.create("T6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5210_MST_INPT_ACT_Query_S02")
				.mainQuery()
				.selectDistinct(
					S0T1.itm_mfg_inst_no,
					S0T1.itm_cd.as("main_itm_cd"),
					S0T1.itm_sub1.as("main_itm_sub1"),
					S0T1.itm_sub2.as("main_itm_sub2"),
					S0T1.itm_sub3.as("main_itm_sub3"),
					S0T1.lot_no.as("main_lot_no"),
					S0T1.sublot_no.as("main_sublot_no"),
					S0M1.sublot_mng_typ,
					S0T2.vld_dt,
					S0T2.lmt_dt,
					S0T2.lmt_dt_frm,
					S0T2.first_gr_dt,
					S0T2.lot_seq
				)
				.from(
					S0W1
					.innerJoin(S0T1).on(
						bracket(
							S0W1.itm_mfg_inst_no.eq(S0T1.itm_mfg_inst_no)
						)
					)
					.innerJoin(S0T2).on(
						bracket(
							S0T1.itm_cd.eq(S0T2.itm_cd)
							.and(S0T1.itm_sub1.eq(S0T2.itm_sub1))
							.and(S0T1.itm_sub2.eq(S0T2.itm_sub2))
							.and(S0T1.itm_sub3.eq(S0T2.itm_sub3))
							.and(S0T1.lot_no.eq(S0T2.lot_no))
							.and(S0T1.sublot_no.eq(S0T2.sublot_no))
						)
					)
					.innerJoin(S0T3).on(
						bracket(
							S0T1.inpt_schd_no.eq(S0T3.inpt_schd_no)
						)
					)
					.innerJoin(S0M1).on(
						bracket(
							S0T1.itm_cd.eq(S0M1.itm_cd)
							.and(S0T1.itm_sub1.eq(S0M1.itm_sub1))
							.and(S0T1.itm_sub2.eq(S0M1.itm_sub2))
							.and(S0T1.itm_sub3.eq(S0M1.itm_sub3))
						)
					)
					.innerJoin(S0T5).on(
						bracket(
							S0W1.itm_mfg_inst_no.eq(S0T5.itm_mfg_inst_no)
						)
					)
					.innerJoin(S0T6).on(
						bracket(
							S0W1.itm_mfg_inst_no.eq(S0T6.itm_mfg_inst_no)
						)
					)
				)
				.where(
					value(0).eq(value(0))
					.and(
						S0T5.mfg_inst_unit_typ.eq(value(MAC_MFG_INST_UNIT_TYP.OPER.value()))
						.or(S0T6.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.EXTNL.value())))
					)
					.and(
						S0T1.base_unit_inpt_qty.gt(value(0))
						.or(S0T1.base_unit_loss_qty.gt(value(0)))
						.or(S0T1.base_unit_fxd_loss_qty.gt(value(0)))
					)
					.and(S0T3.main_itm_flg.eq(value(true)))
				)
			);
	}
	
	/**
	 * -- MSBFL5210_MST_INPT_SCHD_Query_S01
	 */
	static MCQueryPlan MSBFL5210_MST_INPT_SCHD_S01() {
		MSW_ITM_MFG_INST_KEY_R S0W1 = MSW_ITM_MFG_INST_KEY_R.create("W1");
		MST_INPT_SCHD_R S0T1 = MST_INPT_SCHD_R.create("T1");
		MSVT_LOT_LIST_R S0T2 = MSVT_LOT_LIST_R.create("T2");
		MAM_ITM_R S0M1 = MAM_ITM_R.create("M1");

		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5210_MST_INPT_SCHD_Query_S01")
				.mainQuery()
				.selectDistinct(
					S0T1.itm_mfg_inst_no,
					S0T1.itm_cd.as("main_itm_cd"),
					S0T1.itm_sub1.as("main_itm_sub1"),
					S0T1.itm_sub2.as("main_itm_sub2"),
					S0T1.itm_sub3.as("main_itm_sub3"),
					S0T1.lot_no.as("main_lot_no"),
					S0T1.sublot_no.as("main_sublot_no"),
					S0M1.sublot_mng_typ,
					S0T2.vld_dt,
					S0T2.lmt_dt,
					S0T2.lmt_dt_frm,
					S0T2.first_gr_dt,
					S0T2.lot_seq
				)
				.from(
					S0W1
					.innerJoin(S0T1).on(
						bracket(
							S0W1.itm_mfg_inst_no.eq(S0T1.itm_mfg_inst_no)
						)
					)
					.innerJoin(S0T2).on(
						bracket(
							S0T1.itm_cd.eq(S0T2.itm_cd)
							.and(S0T1.itm_sub1.eq(S0T2.itm_sub1))
							.and(S0T1.itm_sub2.eq(S0T2.itm_sub2))
							.and(S0T1.itm_sub3.eq(S0T2.itm_sub3))
							.and(S0T1.lot_no.eq(S0T2.lot_no))
							.and(S0T1.sublot_no.eq(S0T2.sublot_no))
						)
					)
					.innerJoin(S0M1).on(
						bracket(
							S0T1.itm_cd.eq(S0M1.itm_cd)
							.and(S0T1.itm_sub1.eq(S0M1.itm_sub1))
							.and(S0T1.itm_sub2.eq(S0M1.itm_sub2))
							.and(S0T1.itm_sub3.eq(S0M1.itm_sub3))
						)
					)
				)
				.where(
					value(0).eq(value(0))
					.and(
						S0T1.base_unit_inpt_qty.gt(value(0))
						.or(S0T1.base_unit_fxd_rqmt_qty.gt(value(0)))
					)
					.and(S0T1.main_itm_flg.eq(value(true)))
					.and(S0T1.can_flg.eq(value(false)))
				)
			);
	}
	
	/**
	 * -- MSBFL5210_MST_INSP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBFL5210_MST_INSP_SCHD_S01() {
		MST_INSP_SCHD_R S0_T1 = MST_INSP_SCHD_R.create("T1");
		MST_LOT_R S0_T2 = MST_LOT_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5210_MST_INSP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.insp_no,
						S0_T1.insp_typ,
						S0_T1.src_no1,
						S0_T1.src_no2,
						S0_T1.src_no3,
						S0_T1.src_no4,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.sppl_cd,
						S0_T1.maker_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.from_site_cd,
						S0_T1.loc_cd,
						S0_T1.master_dt,
						nullValue().as("lmt_dt_frm_typ"),
						nullValue().as("vld_pd"),
						nullValue().as("lmt_pd"),
						nullValue().as("calc_pd_typ"),
						S0_T2.lmt_dt
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_T2.lot_no))
								.and(
									S0_T1.sublot_no.eq(S0_T2.sublot_no)
									.or(S0_T2.sublot_no.eq(value(MAC_STR.NULL_VAL.value())))
								)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.insp_no.eq(bind("insp_no")))
					)
			);
	}
	
	/**
	 * -- MSBFL5210_MST_ITM_MFG_INST_Query_S01
	 */
	static MCQueryPlan MSBFL5210_MST_ITM_MFG_INST_S01() {
		MST_ITM_MFG_INST_R S0_T1 = MST_ITM_MFG_INST_R.create("T1");
		MST_OPER_INST_R S0_T2 = MST_OPER_INST_R.create("T2");
		MST_OPER_ACT_R S0_T3 = MST_OPER_ACT_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5210_MST_ITM_MFG_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_mfg_inst_no,
						min(S0_T3.st_act_tm).as("st_act_tm"),
						min(S0_T3.end_act_tm).as("end_act_tm")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no))
						.leftOuterJoin(S0_T3).on(S0_T2.oper_inst_no.eq(S0_T3.oper_inst_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.itm_mfg_inst_no.eq(bind("src_no2")))
						.and(S0_T2.lmt_fr_dt_flg.eq(value(true)))
					)
					.groupBy(S0_T1.itm_mfg_inst_no)
			);
	}
	
	/**
	 * -- MSBFL5210_MST_MFG_ACT_Query_S01
	 */
	static MCQueryPlan MSBFL5210_MST_MFG_ACT_S01() {
		MST_MFG_ACT_R S0_T1 = MST_MFG_ACT_R.create("T1");
		MST_ITM_MFG_INST_R S0_T2 = MST_ITM_MFG_INST_R.create("T2");
		MST_OPER_INST_R S0_T3 = MST_OPER_INST_R.create("T3");
		MST_YIELD_ACT_R S0_T4 = MST_YIELD_ACT_R.create("T4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL5210_MST_MFG_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T4.itm_cd,
						S0_T4.itm_sub1,
						S0_T4.itm_sub2,
						S0_T4.itm_sub3,
						S0_T4.lot_no,
						S0_T4.sublot_no,
						S0_T2.mfg_loc_cd,
						S0_T4.strg_loc_cd.as("loc_cd"),
						S0_T1.mfg_inst_no.as("src_no1"),
						S0_T4.itm_mfg_inst_no.as("src_no2"),
						S0_T4.yield_schd_no.as("src_no3"),
						S0_T4.yield_act_no.as("src_no4"),
						S0_T4.act_tm.as("base_dt"),
						S0_T2.site_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no))
						.innerJoin(S0_T3).on(S0_T1.itm_mfg_inst_no.eq(S0_T3.itm_mfg_inst_no))
						.innerJoin(S0_T4).on(S0_T1.mfg_act_no.eq(S0_T4.mfg_act_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.mfg_act_no.eq(bind("mfg_act_no")))
						.and(S0_T3.oper_inst_no.eq(bind("oper_inst_no")))
						.and(S0_T3.lmt_fr_dt_flg.eq(value(true)))
						.and(S0_T4.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())))
					)
			);
	}
}