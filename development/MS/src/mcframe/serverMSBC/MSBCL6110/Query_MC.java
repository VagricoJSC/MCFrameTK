package mcframe.serverMSBC.MSBCL6110;

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
	 * -- MSBCL6110_MST_INPT_ACT_REM_Query_S01
	 */
	static MCQueryPlan MSBCL6110_MST_INPT_ACT_REM_S01() {
		MSW_MFG_INST_KEY_R S0_KEY = MSW_MFG_INST_KEY_R.create("KEY");
		MST_INPT_ACT_REM_R S0_T1 = MST_INPT_ACT_REM_R.create("T1");
		MST_INPT_SCHD_R S0_T2 = MST_INPT_SCHD_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_INPT_ACT_REM_Query_S01")
					.mainQuery()
					.select(
						S0_T1.inpt_schd_no,
						S0_T1.div_seq,
						S0_T1.mfg_sts_typ,
						S0_T1.mfg_inst_no,
						S0_T1.itm_mfg_inst_no,
						S0_T1.oper_inst_no,
						S0_T2.alt_grp_cd,
						S0_T2.alt_grp_seq,
						S0_T1.base_unit_inpt_qty,
						S0_T1.base_unit_rqmt_qty,
						S0_T1.base_unit_fxd_rqmt_qty,
						S0_T1.cont_inpt_qty,
						S0_T1.cont_rqmt_qty,
						S0_T1.cont_fxd_rqmt_qty,
						S0_T1.base_unit_inpt_rem_qty,
						S0_T1.base_unit_rqmt_rem_qty,
						S0_T1.base_unit_fxd_rqmt_rem_qty,
						S0_T1.base_unit_inpt_abort_qty,
						S0_T1.cont_inpt_rem_qty,
						S0_T1.cont_rqmt_rem_qty,
						S0_T1.cont_fxd_rqmt_rem_qty,
						S0_T2.can_flg
					)
					.from(
						S0_KEY
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_KEY.mfg_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.inpt_schd_no.eq(S0_T2.inpt_schd_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.inpt_ctl_typ.neq(value(MAC_INPT_CTL_TYP.NO_MRP_INST.value())))
						.and(S0_T1.div_seq.gt(value(0)))
					)
			);
	}
	
	/**
	 * -- MSBCL6110_MST_INPT_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL6110_MST_INPT_ACT_S01() {
		MSW_MFG_ACT_KEY_R S0_W1 = MSW_MFG_ACT_KEY_R.create("W1");
		MST_INPT_ACT_R S0_T1 = MST_INPT_ACT_R.create("T1");
		MSVT_LOT_LIST_R S0_T2 = MSVT_LOT_LIST_R.create("T2");
		MST_INPT_SCHD_R S0_T3 = MST_INPT_SCHD_R.create("T3");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_MFG_ACT_R S0_T4 = MST_MFG_ACT_R.create("T4");
		MST_MFG_INST_R S0_T5 = MST_MFG_INST_R.create("T5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_INPT_ACT_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.mfg_act_no,
						S0_T1.itm_cd.as("main_itm_cd"),
						S0_T1.itm_sub1.as("main_itm_sub1"),
						S0_T1.itm_sub2.as("main_itm_sub2"),
						S0_T1.itm_sub3.as("main_itm_sub3"),
						S0_T1.lot_no.as("main_lot_no"),
						S0_T1.sublot_no.as("main_sublot_no"),
						S0_M1.sublot_mng_typ,
						S0_T2.vld_dt,
						S0_T2.lmt_dt,
						S0_T2.lmt_dt_frm,
						S0_T2.first_gr_dt,
						S0_T2.lot_seq
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.mfg_act_no.eq(S0_T1.mfg_act_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_T2.lot_no))
								.and(S0_T1.sublot_no.eq(S0_T2.sublot_no))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.inpt_schd_no.eq(S0_T3.inpt_schd_no)
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_W1.mfg_act_no.eq(S0_T4.mfg_act_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T4.mfg_inst_no.eq(S0_T5.mfg_inst_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T5.mfg_inst_unit_typ.eq(value(MAC_MFG_INST_UNIT_TYP.ITM.value())))
						.and(
							S0_T1.base_unit_inpt_qty.gt(value(0))
							.or(S0_T1.base_unit_loss_qty.gt(value(0)))
							.or(S0_T1.base_unit_fxd_loss_qty.gt(value(0)))
						)
						.and(S0_T3.main_itm_flg.eq(value(true)))
					)
			);
	}
	
	/**
	 * -- MSBCL6110_MST_INPT_ACT_Query_S02
	 */
	static MCQueryPlan MSBCL6110_MST_INPT_ACT_S02() {
		MCTempView S0_V1 = createTempView("V1");
		MST_INPT_ACT_R S0_T1 = MST_INPT_ACT_R.create("T1");
		MSVT_LOT_LIST_R S0_T2 = MSVT_LOT_LIST_R.create("T2");
		MST_INPT_SCHD_R S0_T3 = MST_INPT_SCHD_R.create("T3");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MSW_MFG_ACT_KEY_R S1_W1 = MSW_MFG_ACT_KEY_R.create("W1");
		MST_MFG_ACT_R S1_T4 = MST_MFG_ACT_R.create("T4");
		MST_MFG_INST_R S1_T5 = MST_MFG_INST_R.create("T5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_INPT_ACT_Query_S02")
					.mainQuery()
					.selectDistinct(
						S0_T1.itm_mfg_inst_no,
						S0_T1.itm_cd.as("main_itm_cd"),
						S0_T1.itm_sub1.as("main_itm_sub1"),
						S0_T1.itm_sub2.as("main_itm_sub2"),
						S0_T1.itm_sub3.as("main_itm_sub3"),
						S0_T1.lot_no.as("main_lot_no"),
						S0_T1.sublot_no.as("main_sublot_no"),
						S0_M1.sublot_mng_typ,
						S0_T2.vld_dt,
						S0_T2.lmt_dt,
						S0_T2.lmt_dt_frm,
						S0_T2.first_gr_dt,
						S0_T2.lot_seq
					)
					.from(
						subQuery()
						.select(S1_T4.itm_mfg_inst_no)
						.from(
							S1_W1
							.innerJoin(S1_T4).on(
								bracket(
									S1_W1.mfg_act_no.eq(S1_T4.mfg_act_no)
								)
							)
							.innerJoin(S1_T5).on(
								bracket(
									S1_T4.mfg_inst_no.eq(S1_T5.mfg_inst_no)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T5.mfg_inst_unit_typ.eq(value(MAC_MFG_INST_UNIT_TYP.OPER.value())))
						).view(S0_V1)
						.innerJoin(S0_T1).on(
							bracket(
								S0_V1.pr(S1_T4.itm_mfg_inst_no).eq(S0_T1.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_T2.lot_no))
								.and(S0_T1.sublot_no.eq(S0_T2.sublot_no))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.inpt_schd_no.eq(S0_T3.inpt_schd_no)
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T1.base_unit_inpt_qty.gt(value(0))
							.or(S0_T1.base_unit_loss_qty.gt(value(0)))
							.or(S0_T1.base_unit_fxd_loss_qty.gt(value(0)))
						)
						.and(S0_T3.main_itm_flg.eq(value(true)))
					)
			);
	}
	
	/**
	 * -- MSBCL6110_MST_INPT_SCHD_Query_S01
	 */
	static MCQueryPlan MSBCL6110_MST_INPT_SCHD_S01() {
		MSW_MFG_INST_KEY_R S0_KEY = MSW_MFG_INST_KEY_R.create("KEY");
		MST_INPT_SCHD_R S0_T1 = MST_INPT_SCHD_R.create("T1");
		MCTempView S0_V2 = createTempView("V2");
		MST_INPT_ACT_REM_R S1_T2 = MST_INPT_ACT_REM_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_INPT_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.inpt_schd_no,
						S0_T1.mfg_inst_no,
						S0_T1.oper_inst_no,
						S0_T1.itm_mfg_inst_no,
						S0_T1.base_unit_inpt_qty,
						S0_T1.base_unit_rqmt_qty,
						S0_T1.base_unit_fxd_rqmt_qty,
						S0_T1.cont_inpt_qty,
						S0_T1.cont_rqmt_qty,
						S0_T1.cont_fxd_rqmt_qty,
						S0_T1.recalc_grp,
						S0_T1.recalc_grp_seq,
						S0_T1.alt_grp_cd,
						S0_T1.alt_grp_seq,
						S0_T1.chd_inpt_qty,
						S0_T1.chd_rqmt_qty,
						S0_T1.alt_itm_typ,
						S0_T1.alt_itm_ratio,
						S0_T1.alt_alloc_prio,
						S0_T1.std_cont_fctr,
						S0_T1.schd_tm,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.ver_no,
						S0_T1.inpt_loc_cd,
						S0_T1.inpt_str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno1_null_flg,
						S0_T1.sno2,
						S0_T1.sno2_null_flg,
						S0_T1.sno3,
						S0_T1.sno3_null_flg,
						S0_T1.sno4,
						S0_T1.sno4_null_flg,
						S0_T1.base_unit_cd,
						S0_T1.gd_cd,
						S0_T1.inpt_ctl_typ,
						S0_T1.prov_typ,
						S0_T1.alloc_flg,
						S0_T1.alt_itm_fix_flg,
						S0_V2.pr("sum_inpt_qty"),
						S0_V2.pr("sum_rqmt_qty"),
						S0_V2.pr("sum_fxd_rqmt_qty"),
						S0_V2.pr("sum_cont_inpt_qty"),
						S0_V2.pr("sum_cont_rqmt_qty"),
						S0_V2.pr("sum_cont_fxd_rqmt_qty"),
						S0_V2.pr("sum_inpt_rem_qty"),
						S0_V2.pr("sum_rqmt_rem_qty"),
						S0_V2.pr("sum_fxd_rqmt_rem_qty"),
						S0_V2.pr("sum_cont_inpt_rem_qty"),
						S0_V2.pr("sum_cont_rqmt_rem_qty"),
						S0_V2.pr("sum_cont_fxd_rqmt_rem_qty"),
						S0_V2.pr("max_sts_typ"),
						S0_V2.pr("min_sts_typ")
					)
					.from(
						S0_KEY
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_KEY.mfg_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T2.inpt_schd_no,
								sum(S1_T2.base_unit_inpt_qty).as("sum_inpt_qty"),
								sum(S1_T2.base_unit_rqmt_qty).as("sum_rqmt_qty"),
								sum(S1_T2.base_unit_fxd_rqmt_qty).as("sum_fxd_rqmt_qty"),
								sum(S1_T2.cont_inpt_qty).as("sum_cont_inpt_qty"),
								sum(S1_T2.cont_rqmt_qty).as("sum_cont_rqmt_qty"),
								sum(S1_T2.cont_fxd_rqmt_qty).as("sum_cont_fxd_rqmt_qty"),
								sum(S1_T2.base_unit_inpt_rem_qty).as("sum_inpt_rem_qty"),
								sum(S1_T2.base_unit_rqmt_rem_qty).as("sum_rqmt_rem_qty"),
								sum(S1_T2.base_unit_fxd_rqmt_rem_qty).as("sum_fxd_rqmt_rem_qty"),
								sum(S1_T2.cont_inpt_rem_qty).as("sum_cont_inpt_rem_qty"),
								sum(S1_T2.cont_rqmt_rem_qty).as("sum_cont_rqmt_rem_qty"),
								sum(S1_T2.cont_fxd_rqmt_rem_qty).as("sum_cont_fxd_rqmt_rem_qty"),
								max(S1_T2.mfg_sts_typ).as("max_sts_typ"),
								min(S1_T2.mfg_sts_typ).as("min_sts_typ")
							)
							.from(S0_KEY
							.innerJoin(S1_T2).on(
									bracket(
										S1_T2.mfg_inst_no.eq(S0_KEY.mfg_inst_no)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.div_seq.gt(value(0)))
							)
							.groupBy(S1_T2.inpt_schd_no).view(S0_V2)
						).on(
							bracket(
								S0_T1.inpt_schd_no.eq(S0_V2.pr(S1_T2.inpt_schd_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.cont_fctr_flg,
							m.cont_fctr_rnd_typ,
							m.cont_fctr_dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("dec_place", m.dec_place());
							r.setStringNE("rnd_typ", m.rnd_typ());
							r.setBooleanNE("cont_fctr_flg", m.cont_fctr_flg());
							r.setStringNE("cont_fctr_rnd_typ", m.cont_fctr_rnd_typ());
							r.setNumberNE("cont_fctr_dec_place", m.cont_fctr_dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL6110_MST_INPT_SCHD_Query_S02
	 */
	static MCQueryPlan MSBCL6110_MST_INPT_SCHD_S02() {
		MSW_ITM_MFG_INST_KEY_R S0_W1 = MSW_ITM_MFG_INST_KEY_R.create("W1");
		MST_INPT_SCHD_R S0_T1 = MST_INPT_SCHD_R.create("T1");
		MSVT_LOT_LIST_R S0_T2 = MSVT_LOT_LIST_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_INPT_SCHD_Query_S02")
					.mainQuery()
					.selectDistinct(
						S0_T1.itm_mfg_inst_no,
						S0_T1.itm_cd.as("main_itm_cd"),
						S0_T1.itm_sub1.as("main_itm_sub1"),
						S0_T1.itm_sub2.as("main_itm_sub2"),
						S0_T1.itm_sub3.as("main_itm_sub3"),
						S0_T1.lot_no.as("main_lot_no"),
						S0_T1.sublot_no.as("main_sublot_no"),
						S0_M1.sublot_mng_typ,
						S0_T2.vld_dt,
						S0_T2.lmt_dt,
						S0_T2.lmt_dt_frm,
						S0_T2.first_gr_dt,
						S0_T2.lot_seq
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_T2.lot_no))
								.and(S0_T1.sublot_no.eq(S0_T2.sublot_no))
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T1.base_unit_inpt_qty.gt(value(0))
							.or(S0_T1.base_unit_fxd_rqmt_qty.gt(value(0)))
						)
						.and(S0_T1.main_itm_flg.eq(value(true)))
						.and(S0_T1.can_flg.eq(value(false)))
					)
			);
	}
	
	/**
	 * -- MSBCL6110_MST_MFG_ACT_REM_Query_S01
	 */
	static MCQueryPlan MSBCL6110_MST_MFG_ACT_REM_S01() {
		MSW_MFG_INST_KEY_R S0_KEY = MSW_MFG_INST_KEY_R.create("KEY");
		MST_MFG_ACT_REM_R S0_T1 = MST_MFG_ACT_REM_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_MFG_ACT_REM_Query_S01")
					.mainQuery()
					.select(
						S0_T1.mfg_inst_no,
						S0_T1.div_seq,
						S0_T1.mfg_sts_typ,
						S0_T1.itm_mfg_inst_no,
						S0_T1.base_unit_mfg_qty,
						S0_T1.base_unit_mfg_rem_qty
					)
					.from(
						S0_KEY
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_KEY.mfg_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T2.mfg_inst_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T1.div_seq.gt(value(0)))
					)
			);
	}
	
	/**
	 * -- MSBCL6110_MST_MFG_INST_Query_S01
	 */
	static MCQueryPlan MSBCL6110_MST_MFG_INST_S01() {
		MSW_MFG_INST_KEY_R S0_KEY = MSW_MFG_INST_KEY_R.create("KEY");
		MST_MFG_INST_R S0_T1 = MST_MFG_INST_R.create("T1");
		MST_ITM_MFG_INST_R S0_T2 = MST_ITM_MFG_INST_R.create("T2");
		MSVT_MFG_INST_PR_R S0_V1 = MSVT_MFG_INST_PR_R.create("V1");
		MCTempView S0_V2 = createTempView("V2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_MFG_ACT_REM_R S1_T3 = MST_MFG_ACT_REM_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_MFG_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.mfg_inst_no,
						S0_T1.itm_mfg_inst_no,
						S0_T1.mfg_inst_unit_typ,
						S0_T1.base_unit_inst_qty,
						S0_T2.mfg_mtd_typ,
						S0_T2.io_schd_pr_no,
						S0_T2.mfg_loc_cd,
						S0_T1.st_schd_tm,
						S0_T1.end_schd_tm,
						S0_T2.itm_ord_no,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.base_unit_cd,
						S0_V1.base_unit_mfg_abort_qty,
						S0_M1.dec_place,
						S0_M1.rnd_typ,
						S0_V2.pr("sum_mfg_qty"),
						S0_V2.pr("sum_rem_qty"),
						S0_V2.pr("max_sts_typ"),
						S0_V2.pr("min_sts_typ"),
						S0_V2.pr("max_div_seq"),
						S0_V2.pr("min_div_seq")
					)
					.from(
						S0_KEY
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_KEY.mfg_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_V1.mfg_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T3.mfg_inst_no,
								sum(S1_T3.base_unit_mfg_qty).as("sum_mfg_qty"),
								sum(S1_T3.base_unit_mfg_rem_qty).as("sum_rem_qty"),
								max(S1_T3.mfg_sts_typ).as("max_sts_typ"),
								min(S1_T3.mfg_sts_typ).as("min_sts_typ"),
								max(S1_T3.div_seq).as("max_div_seq"),
								min(S1_T3.div_seq).as("min_div_seq")
							)
							.from(S1_T3)
							.where(
								value(0).eq(value(0))
								.and(S1_T3.div_seq.gt(value(0)))
							)
							.groupBy(S1_T3.mfg_inst_no).view(S0_V2)
						).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_V2.pr(S1_T3.mfg_inst_no))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
					)
			);
	}
	
	/**
	 * -- MSBCL6110_MST_MLY_WIP_Query_S01
	 */
	static MCQueryPlan MSBCL6110_MST_MLY_WIP_S01() {
		MST_MLY_WIP_R S0 = MST_MLY_WIP_R.create();
		MST_MLY_WIP_R S1_T1 = MST_MLY_WIP_R.create("T1");
		MST_MLY_WIP_R S2_T2 = MST_MLY_WIP_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_MLY_WIP_Query_S01")
					.insert(S0)
					.columns(
						S0.ym,
						S0.itm_mfg_inst_no,
						S0.mfg_act_no,
						S0.itm_ord_no,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.loc_cd,
						S0.str_ln_cd,
						S0.asst_typ,
						S0.in_xfr_typ,
						S0.quality_typ,
						S0.stk_insp_typ,
						S0.stk_id_typ,
						S0.gd_cd,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.st_ac_dt,
						S0.base_unit_schd_qty,
						S0.base_unit_act_qty,
						S0.end_ac_dt,
						S0.base_unit_cd,
						S0.base_unit_wip_qty,
						S0.wip_rate,
						S0.cmpl_flg,
						S0.closing_flg,
						S0.sub_char1,
						S0.sub_char2,
						S0.sub_char3
					)
					.query(
						subQuery()
						.select(
							addMonths(
								bind("ym"),
								value(1)
							),
							S1_T1.itm_mfg_inst_no,
							S1_T1.mfg_act_no,
							S1_T1.itm_ord_no,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.loc_cd,
							S1_T1.str_ln_cd,
							S1_T1.asst_typ,
							S1_T1.in_xfr_typ,
							S1_T1.quality_typ,
							S1_T1.stk_insp_typ,
							S1_T1.stk_id_typ,
							S1_T1.gd_cd,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T1.st_ac_dt,
							S1_T1.base_unit_schd_qty,
							S1_T1.base_unit_act_qty,
							S1_T1.end_ac_dt,
							S1_T1.base_unit_cd,
							S1_T1.base_unit_wip_qty,
							S1_T1.wip_rate,
							S1_T1.cmpl_flg,
							value(false),
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3
						)
						.from(S1_T1)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.ym.eq(bind("ym")))
							.and(S1_T1.cmpl_flg.eq(value(false)))
							.and(S1_T1.closing_flg.eq(value(true)))
							.and(S1_T1.mfg_act_no.isNotNull())
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S2_T2)
									.where(
										S1_T1.mfg_act_no.eq(S2_T2.mfg_act_no)
										.and(
											S2_T2.ym.eq(addMonths(
													bind("ym"),
													value(1)
												)
											)
										)
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL6110_MST_MLY_WIP_Query_S02
	 */
	static MCQueryPlan MSBCL6110_MST_MLY_WIP_S02() {
		MST_MLY_WIP_R S0 = MST_MLY_WIP_R.create();
		MST_MLY_WIP_R S1_T1 = MST_MLY_WIP_R.create("T1");
		MST_MLY_WIP_R S2_T2 = MST_MLY_WIP_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_MLY_WIP_Query_S02")
					.insert(S0)
					.columns(
						S0.ym,
						S0.itm_mfg_inst_no,
						S0.mfg_act_no,
						S0.itm_ord_no,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.loc_cd,
						S0.str_ln_cd,
						S0.asst_typ,
						S0.in_xfr_typ,
						S0.quality_typ,
						S0.stk_insp_typ,
						S0.stk_id_typ,
						S0.gd_cd,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.st_ac_dt,
						S0.base_unit_schd_qty,
						S0.base_unit_act_qty,
						S0.end_ac_dt,
						S0.base_unit_cd,
						S0.base_unit_wip_qty,
						S0.wip_rate,
						S0.cmpl_flg,
						S0.closing_flg,
						S0.sub_char1,
						S0.sub_char2,
						S0.sub_char3
					)
					.query(
						subQuery()
						.select(
							addMonths(
								bind("ym"),
								value(1)
							),
							S1_T1.itm_mfg_inst_no,
							S1_T1.mfg_act_no,
							S1_T1.itm_ord_no,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.loc_cd,
							S1_T1.str_ln_cd,
							S1_T1.asst_typ,
							S1_T1.in_xfr_typ,
							S1_T1.quality_typ,
							S1_T1.stk_insp_typ,
							S1_T1.stk_id_typ,
							S1_T1.gd_cd,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T1.st_ac_dt,
							S1_T1.base_unit_schd_qty,
							S1_T1.base_unit_act_qty,
							S1_T1.end_ac_dt,
							S1_T1.base_unit_cd,
							S1_T1.base_unit_wip_qty,
							S1_T1.wip_rate,
							S1_T1.cmpl_flg,
							value(false),
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3
						)
						.from(S1_T1)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.ym.eq(bind("ym")))
							.and(S1_T1.cmpl_flg.eq(value(false)))
							.and(S1_T1.closing_flg.eq(value(true)))
							.and(S1_T1.mfg_act_no.isNull())
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S2_T2)
									.where(
										S1_T1.itm_mfg_inst_no.eq(S2_T2.itm_mfg_inst_no)
										.and(
											S2_T2.ym.eq(addMonths(
													bind("ym"),
													value(1)
												)
											)
										)
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL6110_MST_OPER_ACT_REM_Query_S01
	 */
	static MCQueryPlan MSBCL6110_MST_OPER_ACT_REM_S01() {
		MSW_MFG_INST_KEY_R S0_KEY = MSW_MFG_INST_KEY_R.create("KEY");
		MST_OPER_ACT_REM_R S0_T1 = MST_OPER_ACT_REM_R.create("T1");
		MST_OPER_INST_R S0_T2 = MST_OPER_INST_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_OPER_ACT_REM_Query_S01")
					.mainQuery()
					.select(
						S0_T1.oper_inst_no,
						S0_T1.div_seq,
						S0_T1.mfg_sts_typ,
						S0_T1.mfg_inst_no,
						S0_T1.itm_mfg_inst_no,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_rem_qty,
						S0_T1.base_unit_abort_qty
					)
					.from(
						S0_KEY
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_KEY.mfg_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.oper_inst_no.eq(S0_T2.oper_inst_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T1.div_seq.gt(value(0)))
					)
			);
	}
	
	/**
	 * -- MSBCL6110_MST_OPER_INST_Query_S01
	 */
	static MCQueryPlan MSBCL6110_MST_OPER_INST_S01() {
		MSW_MFG_INST_KEY_R S0_KEY = MSW_MFG_INST_KEY_R.create("KEY");
		MST_OPER_INST_R S0_T1 = MST_OPER_INST_R.create("T1");
		MSVT_OPER_INST_PR_R S0_V1 = MSVT_OPER_INST_PR_R.create("V1");
		MCTempView S0_V2 = createTempView("V2");
		MST_OPER_ACT_REM_R S1_T2 = MST_OPER_ACT_REM_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_OPER_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.oper_inst_no,
						S0_T1.mfg_inst_no,
						S0_T1.itm_mfg_inst_no,
						S0_T1.base_unit_qty,
						S0_V2.pr("sum_qty"),
						S0_V2.pr("sum_rem_qty"),
						S0_V2.pr("max_sts_typ"),
						S0_V2.pr("min_sts_typ")
					)
					.from(
						S0_KEY
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_KEY.mfg_inst_no)
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.oper_inst_no.eq(S0_V1.oper_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T2.oper_inst_no,
								sum(S1_T2.base_unit_qty).as("sum_qty"),
								sum(S1_T2.base_unit_rem_qty).as("sum_rem_qty"),
								max(S1_T2.mfg_sts_typ).as("max_sts_typ"),
								min(S1_T2.mfg_sts_typ).as("min_sts_typ")
							)
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.div_seq.gt(value(0)))
							)
							.groupBy(S1_T2.oper_inst_no).view(S0_V2)
						).on(
							bracket(
								S0_T1.oper_inst_no.eq(S0_V2.pr(S1_T2.oper_inst_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
					)
			);
	}
	
	/**
	 * -- MSBCL6110_MST_WK_ACT_REM_Query_S01
	 */
	static MCQueryPlan MSBCL6110_MST_WK_ACT_REM_S01() {
		MSW_MFG_INST_KEY_R S0_KEY = MSW_MFG_INST_KEY_R.create("KEY");
		MST_WK_ACT_REM_R S0_T1 = MST_WK_ACT_REM_R.create("T1");
		MST_WK_SCHD_R S0_T2 = MST_WK_SCHD_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_WK_ACT_REM_Query_S01")
					.mainQuery()
					.select(
						S0_T1.wk_schd_no,
						S0_T1.div_seq,
						S0_T1.mfg_sts_typ,
						S0_T1.mfg_inst_no,
						S0_T1.itm_mfg_inst_no,
						S0_T1.oper_inst_no,
						S0_T1.wk_cost,
						S0_T1.fxd_wk_cost,
						S0_T1.rem_wk_cost,
						S0_T1.abort_wk_cost
					)
					.from(
						S0_KEY
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_KEY.mfg_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.wk_schd_no.eq(S0_T2.wk_schd_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T1.div_seq.gt(value(0)))
					)
			);
	}
	
	/**
	 * -- MSBCL6110_MST_WK_SCHD_Query_S01
	 */
	static MCQueryPlan MSBCL6110_MST_WK_SCHD_S01() {
		MSW_MFG_INST_KEY_R S0_KEY = MSW_MFG_INST_KEY_R.create("KEY");
		MST_WK_SCHD_R S0_T1 = MST_WK_SCHD_R.create("T1");
		MSVT_WK_SCHD_PR_R S0_V1 = MSVT_WK_SCHD_PR_R.create("V1");
		MCTempView S0_V2 = createTempView("V2");
		MST_WK_ACT_REM_R S1_T2 = MST_WK_ACT_REM_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_WK_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.wk_schd_no,
						S0_T1.mfg_inst_no,
						S0_T1.oper_inst_no,
						S0_T1.itm_mfg_inst_no,
						S0_T1.wk_cost,
						S0_T1.fxd_wk_cost,
						S0_V2.pr("sum_fxd_wk_cost"),
						S0_V2.pr("sum_wk_cost"),
						S0_V2.pr("sum_rem_wk_cost"),
						S0_V2.pr("max_sts_typ"),
						S0_V2.pr("min_sts_typ")
					)
					.from(
						S0_KEY
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_KEY.mfg_inst_no)
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.wk_schd_no.eq(S0_V1.wk_schd_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T2.wk_schd_no,
								sum(S1_T2.fxd_wk_cost).as("sum_fxd_wk_cost"),
								sum(S1_T2.wk_cost).as("sum_wk_cost"),
								sum(S1_T2.rem_wk_cost).as("sum_rem_wk_cost"),
								max(S1_T2.mfg_sts_typ).as("max_sts_typ"),
								min(S1_T2.mfg_sts_typ).as("min_sts_typ")
							)
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.div_seq.gt(value(0)))
							)
							.groupBy(S1_T2.wk_schd_no).view(S0_V2)
						).on(
							bracket(
								S0_T1.wk_schd_no.eq(S0_V2.pr(S1_T2.wk_schd_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
					)
			);
	}
	
	/**
	 * -- MSBCL6110_MST_YIELD_ACT_REM_Query_S03
	 */
	static MCQueryPlan MSBCL6110_MST_YIELD_ACT_REM_S03() {
		MSW_MFG_INST_KEY_R S0_KEY = MSW_MFG_INST_KEY_R.create("KEY");
		MST_YIELD_ACT_REM_R S0_T1 = MST_YIELD_ACT_REM_R.create("T1");
		MST_YIELD_SCHD_R S0_T2 = MST_YIELD_SCHD_R.create("T2");
		MST_YIELD_ACT_R S0_YACT= MST_YIELD_ACT_R.create("YACT");
		MSW_YIELD_ACT_RECV_IF_KEY_R S0_YACTRKEY = MSW_YIELD_ACT_RECV_IF_KEY_R.create("YACTRKEY");
		MST_YIELD_ACT_RECV_IF_R S0_YACTR = MST_YIELD_ACT_RECV_IF_R.create("YACTR");
		MST_YIELD_ACT_RECV_IF_R S1_YACTR = MST_YIELD_ACT_RECV_IF_R.create("YACTR1");
		MST_YIELD_ACT_RECV_IF_R S2_YACTR = MST_YIELD_ACT_RECV_IF_R.create("YACTR2");
		MCTempView S0_YACTRV = createTempView("YACTRV");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_YIELD_ACT_REM_Query_S03")
					.mainQuery()
					.select(
						S0_T1.yield_schd_no,
						S0_T1.div_seq,
						S0_T1.mfg_sts_typ,
						S0_T1.mfg_inst_no,
						S0_T1.itm_mfg_inst_no,
						S0_T1.oper_inst_no,
						S0_T1.yield_typ,
						S0_T1.trd_unit_yield_qty,
						S0_T1.base_unit_yield_qty,
						S0_T1.trd_unit_yield_rem_qty,
						S0_T1.base_unit_yield_rem_qty,
						S0_T1.trd_unit_yield_abort_qty,
						S0_T1.base_unit_yield_abort_qty,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T2.trd_unit_cd,
						S0_T2.base_unit_cd,
						cases()
						.when(S0_YACT.ext_yield_act_no.isNotNull())
							.then(
								subQuery()
								.select(S0_YACTR.abort_flg)
								.from(S0_YACTR)
								.where(
									value(0).eq(value(0))
									.and(S0_YACTR.data_lno.eq(
										subQuery()
										.select(max(S0_YACTRV.pr("data_lno")))
										.from(
											subQuery()
											.select(S1_YACTR.data_lno)
											.from(S1_YACTR)
											.where(
												value(0).eq(value(0))
												.and(S1_YACTR.exe_sts_typ.eq(value(MAC_EXE_STS_TYP.OK.value())))
												.and(S1_YACTR.ext_yield_act_no.eq(S0_YACT.ext_yield_act_no))
												.and(S1_YACTR.data_crud_typ.neq(value(MAC_DATA_CRUD_TYP.DEL.value())))
											)
											.unionAll(
												subQuery()
												.select(S2_YACTR.data_lno)
												.from(
													S0_YACTRKEY
													.innerJoin(S2_YACTR).on(
														bracket(
															S2_YACTR.data_lno.eq(S0_YACTRKEY.data_lno)
															.and(S2_YACTR.ext_yield_act_no.eq(S0_YACT.ext_yield_act_no))
														)
													)
												)
											).view(S0_YACTRV)
										)
									))
								)
							)
							.otherwise(value(false)).as("yield_abort_flg")
					)
					.from(
						S0_KEY
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_KEY.mfg_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.yield_schd_no.eq(S0_T2.yield_schd_no)
							)
						)
						.leftOuterJoin(S0_YACT).on(
							bracket(
								S0_T1.yield_schd_no.eq(S0_YACT.yield_schd_no)
								.and(S0_T1.div_seq.eq(S0_YACT.div_seq))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T1.div_seq.gt(value(0)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}))
			);
	}
	
	/**
	 * -- MSBCL6110_MST_YIELD_SCHD_Query_S03
	 */
	static MCQueryPlan MSBCL6110_MST_YIELD_SCHD_S03() {
		MSW_ITM_MFG_INST_KEY_R S0_W1 = MSW_ITM_MFG_INST_KEY_R.create("W1");
		MST_YIELD_SCHD_R S0_T1 = MST_YIELD_SCHD_R.create("T1");
		MST_ITM_MFG_INST_R S0_T2 = MST_ITM_MFG_INST_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MSVT_YIELD_SCHD_PR_R S0_T3 = MSVT_YIELD_SCHD_PR_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_YIELD_SCHD_Query_S03")
					.mainQuery()
					.selectDistinct(
						S0_T1.itm_mfg_inst_no,
						S0_T2.site_cd,
						S0_T2.mfg_loc_cd,
						S0_T1.schd_tm.as("gr_dt"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_M1.sublot_mng_typ
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.yield_schd_no.eq(S0_T3.yield_schd_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T1.lot_no.isNotNull()
							.and(S0_T1.lot_no.neq(value(MAC_STR.NULL_VAL.value())))
						)
						.and(S0_T1.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())))
						.and(
							S0_T3.mfg_sts_typ.notIn(
								value(MSC_MFG_STS_TYP.STT.value()),
								value(MSC_MFG_STS_TYP.CMPL.value())
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL6110_MST_YIELD_SCHD_Query_S04
	 */
	static MCQueryPlan MSBCL6110_MST_YIELD_SCHD_S04() {
		MSW_MFG_INST_KEY_R S0_KEY = MSW_MFG_INST_KEY_R.create("KEY");
		MST_YIELD_SCHD_R S0_T1 = MST_YIELD_SCHD_R.create("T1");
		MSVT_YIELD_SCHD_PR_R S0_V1 = MSVT_YIELD_SCHD_PR_R.create("V1");
		MCTempView S0_V2 = createTempView("V2");
		MST_YIELD_ACT_REM_R S1_T2 = MST_YIELD_ACT_REM_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MST_YIELD_SCHD_Query_S04")
					.mainQuery()
					.select(
						S0_T1.yield_schd_no,
						S0_T1.mfg_inst_no,
						S0_T1.oper_inst_no,
						S0_T1.itm_mfg_inst_no,
						S0_T1.yield_typ,
						S0_T1.trd_unit_yield_qty,
						S0_T1.base_unit_yield_qty,
						S0_T1.schd_tm,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.strg_loc_cd,
						S0_T1.strg_str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_cd,
						S0_V2.pr("sum_trd_qty"),
						S0_V2.pr("sum_base_qty"),
						S0_V2.pr("sum_trd_rem_qty"),
						S0_V2.pr("sum_base_rem_qty"),
						S0_V2.pr("max_sts_typ"),
						S0_V2.pr("min_sts_typ")
					)
					.from(
						S0_KEY
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_KEY.mfg_inst_no)
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.yield_schd_no.eq(S0_V1.yield_schd_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T2.yield_schd_no,
								sum(S1_T2.trd_unit_yield_qty).as("sum_trd_qty"),
								sum(S1_T2.base_unit_yield_qty).as("sum_base_qty"),
								sum(S1_T2.trd_unit_yield_rem_qty).as("sum_trd_rem_qty"),
								sum(S1_T2.base_unit_yield_rem_qty).as("sum_base_rem_qty"),
								max(S1_T2.mfg_sts_typ).as("max_sts_typ"),
								min(S1_T2.mfg_sts_typ).as("min_sts_typ")
							)
							.from(S1_T2)
							.where(
								value(0).eq(value(0))
								.and(S1_T2.div_seq.gt(value(0)))
							)
							.groupBy(S1_T2.yield_schd_no).view(S0_V2)
						).on(
							bracket(
								S0_T1.yield_schd_no.eq(S0_V2.pr(S1_T2.yield_schd_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					}))
			);
	}
	
	/**
	 * -- MSBCL6110_MSVT_YIELD_ACT_LOT_Query_S01
	 */
	static MCQueryPlan MSBCL6110_MSVT_YIELD_ACT_LOT_S01() {
		MSW_MFG_ACT_KEY_R S0_W1 = MSW_MFG_ACT_KEY_R.create("W1");
		MSVT_YIELD_ACT_LOT_R S0_T1 = MSVT_YIELD_ACT_LOT_R.create("T1");
		MST_ITM_MFG_INST_R S0_T2 = MST_ITM_MFG_INST_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MSVT_YIELD_ACT_LOT_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.mfg_act_no,
						S0_T2.site_cd,
						S0_T2.mfg_loc_cd,
						S0_T1.act_tm.as("gr_dt"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_M1.sublot_mng_typ
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.mfg_act_no.eq(S0_T1.mfg_act_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T1.lot_no.isNotNull()
							.and(S0_T1.lot_no.neq(value(MAC_STR.NULL_VAL.value())))
						)
					)
			);
	}
	
	/**
	 * -- MSBCL6110_MSVT_YIELD_ACT_LOT_Query_S02
	 */
	static MCQueryPlan MSBCL6110_MSVT_YIELD_ACT_LOT_S02() {
		MSW_ITM_MFG_INST_KEY_R S0_W1 = MSW_ITM_MFG_INST_KEY_R.create("W1");
		MSVT_YIELD_ACT_LOT_R S0_T1 = MSVT_YIELD_ACT_LOT_R.create("T1");
		MST_ITM_MFG_INST_R S0_T2 = MST_ITM_MFG_INST_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6110_MSVT_YIELD_ACT_LOT_Query_S02")
					.mainQuery()
					.selectDistinct(
						S0_T1.itm_mfg_inst_no,
						S0_T2.site_cd,
						S0_T2.mfg_loc_cd,
						S0_T1.act_tm.as("gr_dt"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_M1.sublot_mng_typ
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T1.lot_no.isNotNull()
							.and(S0_T1.lot_no.neq(value(MAC_STR.NULL_VAL.value())))
						)
					)
			);
	}
}