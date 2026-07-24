package mcframe.serverMSBE.MSBEL5030;

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
	 * -- MSBEL5030_MST_MLY_STK_DTL_Query_S01
	 */
	static MCQueryPlan MSBEL5030_MST_MLY_STK_DTL_S01() {
		MST_MLY_STK_DTL_R S0_T = MST_MLY_STK_DTL_R.create("T");
		MSW_MLY_STK_DTL_KEY_R S0_W = MSW_MLY_STK_DTL_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5030_MST_MLY_STK_DTL_Query_S01")
					.mainQuery()
					.select(
						S0_T.ac_ym,
						S0_T.io_act_typ,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.loc_cd,
						S0_T.str_ln_cd,
						S0_T.stk_arrv_bp_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.fix_no_typ,
						S0_T.fix_no,
						S0_T.pack_unit_cd,
						S0_T.gd_cd,
						S0_T.in_xfr_typ,
						S0_T.quality_typ,
						S0_T.asst_typ,
						S0_T.stk_insp_typ,
						S0_T.stk_id_typ,
						S0_T.stk_bp_cd,
						S0_T.pack_unit_qty,
						S0_T.base_unit_qty
					)
					.from(
						S0_T
						.innerJoin(S0_W).on(
							S0_T.ac_ym.eq(S0_W.ac_ym)
							.and(S0_T.io_act_typ.eq(S0_W.io_act_typ))
							.and(S0_T.itm_cd.eq(S0_W.itm_cd))
							.and(S0_T.itm_sub1.eq(S0_W.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_W.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_W.itm_sub3))
							.and(S0_T.loc_cd.eq(S0_W.loc_cd))
							.and(S0_T.str_ln_cd.eq(S0_W.str_ln_cd))
							.and(S0_T.stk_arrv_bp_cd.eq(S0_W.stk_arrv_bp_cd))
							.and(S0_T.lot_no.eq(S0_W.lot_no))
							.and(S0_T.sublot_no.eq(S0_W.sublot_no))
							.and(S0_T.sno1.eq(S0_W.sno1))
							.and(S0_T.sno2.eq(S0_W.sno2))
							.and(S0_T.sno3.eq(S0_W.sno3))
							.and(S0_T.sno4.eq(S0_W.sno4))
							.and(S0_T.fix_no_typ.eq(S0_W.fix_no_typ))
							.and(S0_T.fix_no.eq(S0_W.fix_no))
							.and(S0_T.pack_unit_cd.eq(S0_W.pack_unit_cd))
							.and(S0_T.gd_cd.eq(S0_W.gd_cd))
							.and(S0_T.in_xfr_typ.eq(S0_W.in_xfr_typ))
							.and(S0_T.quality_typ.eq(S0_W.quality_typ))
							.and(S0_T.asst_typ.eq(S0_W.asst_typ))
							.and(S0_T.stk_insp_typ.eq(S0_W.stk_insp_typ))
							.and(S0_T.stk_id_typ.eq(S0_W.stk_id_typ))
							.and(S0_T.stk_bp_cd.eq(S0_W.stk_bp_cd))
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.loc_cd.asc(),
						S0_T.str_ln_cd.asc(),
						S0_T.stk_arrv_bp_cd.asc(),
						S0_T.lot_no.asc(),
						S0_T.sublot_no.asc(),
						S0_T.sno1.asc(),
						S0_T.sno2.asc(),
						S0_T.sno3.asc(),
						S0_T.sno4.asc(),
						S0_T.fix_no_typ.asc(),
						S0_T.fix_no.asc(),
						S0_T.pack_unit_cd.asc(),
						S0_T.gd_cd.asc(),
						S0_T.in_xfr_typ.asc(),
						S0_T.quality_typ.asc(),
						S0_T.asst_typ.asc(),
						S0_T.stk_insp_typ.asc(),
						S0_T.stk_id_typ.asc(),
						S0_T.stk_bp_cd.asc(),
						S0_T.io_act_typ.asc(),
						S0_T.ac_ym.asc()
					)
					.forUpdate()
			);
	}
	
	/**
	 * -- MSBEL5030_MST_MLY_STK_DTL_Query_S02
	 */
	static MCQueryPlan MSBEL5030_MST_MLY_STK_DTL_S02() {
		MST_MLY_STK_DTL_R S0_T = MST_MLY_STK_DTL_R.create("T");
		MSW_MLY_STK_DTL_KEY_R S0_W = MSW_MLY_STK_DTL_KEY_R.create("W");
		MST_MLY_STK_DTL_R S1_T2 = MST_MLY_STK_DTL_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5030_MST_MLY_STK_DTL_Query_S02")
					.mainQuery()
					.select(
						S0_T.ac_ym,
						S0_T.io_act_typ,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.loc_cd,
						S0_T.str_ln_cd,
						S0_T.stk_arrv_bp_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.fix_no_typ,
						S0_T.fix_no,
						S0_T.pack_unit_cd,
						S0_T.gd_cd,
						S0_T.in_xfr_typ,
						S0_T.quality_typ,
						S0_T.asst_typ,
						S0_T.stk_insp_typ,
						S0_T.stk_id_typ,
						S0_T.stk_bp_cd,
						S0_T.pack_unit_qty,
						S0_T.base_unit_qty
					)
					.from(
						S0_T
						.innerJoin(S0_W).on(
							S0_T.ac_ym.gte(nvl(
									bracket(
										subQuery()
										.select(max(S1_T2.ac_ym))
										.from(S1_T2)
										.where(
											value(0).eq(value(0))
											.and(S1_T2.ac_ym.lte(S0_W.ac_ym))
											.and(S1_T2.io_act_typ.eq(S0_W.io_act_typ))
											.and(S1_T2.itm_cd.eq(S0_W.itm_cd))
											.and(S1_T2.itm_sub1.eq(S0_W.itm_sub1))
											.and(S1_T2.itm_sub2.eq(S0_W.itm_sub2))
											.and(S1_T2.itm_sub3.eq(S0_W.itm_sub3))
											.and(S1_T2.loc_cd.eq(S0_W.loc_cd))
											.and(S1_T2.str_ln_cd.eq(S0_W.str_ln_cd))
											.and(S1_T2.stk_arrv_bp_cd.eq(S0_W.stk_arrv_bp_cd))
											.and(S1_T2.lot_no.eq(S0_W.lot_no))
											.and(S1_T2.sublot_no.eq(S0_W.sublot_no))
											.and(S1_T2.sno1.eq(S0_W.sno1))
											.and(S1_T2.sno2.eq(S0_W.sno2))
											.and(S1_T2.sno3.eq(S0_W.sno3))
											.and(S1_T2.sno4.eq(S0_W.sno4))
											.and(S1_T2.fix_no_typ.eq(S0_W.fix_no_typ))
											.and(S1_T2.fix_no.eq(S0_W.fix_no))
											.and(S1_T2.pack_unit_cd.eq(S0_W.pack_unit_cd))
											.and(S1_T2.gd_cd.eq(S0_W.gd_cd))
											.and(S1_T2.in_xfr_typ.eq(S0_W.in_xfr_typ))
											.and(S1_T2.quality_typ.eq(S0_W.quality_typ))
											.and(S1_T2.asst_typ.eq(S0_W.asst_typ))
											.and(S1_T2.stk_insp_typ.eq(S0_W.stk_insp_typ))
											.and(S1_T2.stk_id_typ.eq(S0_W.stk_id_typ))
											.and(S1_T2.stk_bp_cd.eq(S0_W.stk_bp_cd))
										)
									),
									S0_W.ac_ym
								)
							)
							.and(S0_T.io_act_typ.eq(S0_W.io_act_typ))
							.and(S0_T.itm_cd.eq(S0_W.itm_cd))
							.and(S0_T.itm_sub1.eq(S0_W.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_W.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_W.itm_sub3))
							.and(S0_T.loc_cd.eq(S0_W.loc_cd))
							.and(S0_T.str_ln_cd.eq(S0_W.str_ln_cd))
							.and(S0_T.stk_arrv_bp_cd.eq(S0_W.stk_arrv_bp_cd))
							.and(S0_T.lot_no.eq(S0_W.lot_no))
							.and(S0_T.sublot_no.eq(S0_W.sublot_no))
							.and(S0_T.sno1.eq(S0_W.sno1))
							.and(S0_T.sno2.eq(S0_W.sno2))
							.and(S0_T.sno3.eq(S0_W.sno3))
							.and(S0_T.sno4.eq(S0_W.sno4))
							.and(S0_T.fix_no_typ.eq(S0_W.fix_no_typ))
							.and(S0_T.fix_no.eq(S0_W.fix_no))
							.and(S0_T.pack_unit_cd.eq(S0_W.pack_unit_cd))
							.and(S0_T.gd_cd.eq(S0_W.gd_cd))
							.and(S0_T.in_xfr_typ.eq(S0_W.in_xfr_typ))
							.and(S0_T.quality_typ.eq(S0_W.quality_typ))
							.and(S0_T.asst_typ.eq(S0_W.asst_typ))
							.and(S0_T.stk_insp_typ.eq(S0_W.stk_insp_typ))
							.and(S0_T.stk_id_typ.eq(S0_W.stk_id_typ))
							.and(S0_T.stk_bp_cd.eq(S0_W.stk_bp_cd))
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.loc_cd.asc(),
						S0_T.str_ln_cd.asc(),
						S0_T.stk_arrv_bp_cd.asc(),
						S0_T.lot_no.asc(),
						S0_T.sublot_no.asc(),
						S0_T.sno1.asc(),
						S0_T.sno2.asc(),
						S0_T.sno3.asc(),
						S0_T.sno4.asc(),
						S0_T.fix_no_typ.asc(),
						S0_T.fix_no.asc(),
						S0_T.pack_unit_cd.asc(),
						S0_T.gd_cd.asc(),
						S0_T.in_xfr_typ.asc(),
						S0_T.quality_typ.asc(),
						S0_T.asst_typ.asc(),
						S0_T.stk_insp_typ.asc(),
						S0_T.stk_id_typ.asc(),
						S0_T.stk_bp_cd.asc(),
						S0_T.io_act_typ.asc(),
						S0_T.ac_ym.asc()
					)
					.forUpdate()
			);
	}
	
	/**
	 * -- MSBEL5030_MST_MLY_STK_DTL_Query_S03
	 */
	static MCQueryPlan MSBEL5030_MST_MLY_STK_DTL_S03() {
		MST_MLY_STK_DTL_R S0_T = MST_MLY_STK_DTL_R.create("T");
		MST_MLY_STK_DTL_R S1_T2 = MST_MLY_STK_DTL_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5030_MST_MLY_STK_DTL_Query_S03")
					.mainQuery()
					.select(
						S0_T.ac_ym,
						S0_T.io_act_typ,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.loc_cd,
						S0_T.str_ln_cd,
						S0_T.stk_arrv_bp_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.fix_no_typ,
						S0_T.fix_no,
						S0_T.pack_unit_cd,
						S0_T.gd_cd,
						S0_T.in_xfr_typ,
						S0_T.quality_typ,
						S0_T.asst_typ,
						S0_T.stk_insp_typ,
						S0_T.stk_id_typ,
						S0_T.stk_bp_cd,
						S0_T.pack_unit_qty,
						S0_T.base_unit_qty
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.ac_ym.eq(bind("ac_ym")))
						.and(S0_T.io_act_typ.eq(value(MSC_IO_ACT_TYP.END_STK.value())))
						.and(S0_T.base_unit_qty.neq(value(0)))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S1_T2)
								.where(
									value(0).eq(value(0))
									.and(
										S1_T2.ac_ym.eq(addMonths(
												S0_T.ac_ym,
												value(1)
											)
										)
									)
									.and(S1_T2.io_act_typ.eq(S0_T.io_act_typ))
									.and(S1_T2.itm_cd.eq(S0_T.itm_cd))
									.and(S1_T2.itm_sub1.eq(S0_T.itm_sub1))
									.and(S1_T2.itm_sub2.eq(S0_T.itm_sub2))
									.and(S1_T2.itm_sub3.eq(S0_T.itm_sub3))
									.and(S1_T2.loc_cd.eq(S0_T.loc_cd))
									.and(S1_T2.str_ln_cd.eq(S0_T.str_ln_cd))
									.and(S1_T2.stk_arrv_bp_cd.eq(S0_T.stk_arrv_bp_cd))
									.and(S1_T2.lot_no.eq(S0_T.lot_no))
									.and(S1_T2.sublot_no.eq(S0_T.sublot_no))
									.and(S1_T2.sno1.eq(S0_T.sno1))
									.and(S1_T2.sno2.eq(S0_T.sno2))
									.and(S1_T2.sno3.eq(S0_T.sno3))
									.and(S1_T2.sno4.eq(S0_T.sno4))
									.and(S1_T2.fix_no_typ.eq(S0_T.fix_no_typ))
									.and(S1_T2.fix_no.eq(S0_T.fix_no))
									.and(S1_T2.pack_unit_cd.eq(S0_T.pack_unit_cd))
									.and(S1_T2.gd_cd.eq(S0_T.gd_cd))
									.and(S1_T2.in_xfr_typ.eq(S0_T.in_xfr_typ))
									.and(S1_T2.quality_typ.eq(S0_T.quality_typ))
									.and(S1_T2.asst_typ.eq(S0_T.asst_typ))
									.and(S1_T2.stk_insp_typ.eq(S0_T.stk_insp_typ))
									.and(S1_T2.stk_id_typ.eq(S0_T.stk_id_typ))
									.and(S1_T2.stk_bp_cd.eq(S0_T.stk_bp_cd))
								)
							)
						)
					)
					.forUpdate()
			);
	}
	
	/**
	 * -- MSBEL5030_MST_STK_Query_S01
	 */
	static MCQueryPlan MSBEL5030_MST_STK_S01() {
		MST_STK_R S0_T = MST_STK_R.create("T");
		MSW_STK_KEY_R S0_W = MSW_STK_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5030_MST_STK_Query_S01")
					.mainQuery()
					.select(
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.loc_cd,
						S0_T.str_ln_cd,
						S0_T.stk_arrv_bp_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.fix_no_typ,
						S0_T.fix_no,
						S0_T.pack_unit_cd,
						S0_T.gd_cd,
						S0_T.in_xfr_typ,
						S0_T.quality_typ,
						S0_T.asst_typ,
						S0_T.stk_insp_typ,
						S0_T.stk_id_typ,
						S0_T.stk_bp_cd,
						S0_T.pack_unit_qty,
						S0_T.base_unit_qty
					)
					.from(
						S0_T
						.innerJoin(S0_W).on(
							S0_T.itm_cd.eq(S0_W.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_W.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_W.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_W.itm_sub3))
							.and(S0_T.loc_cd.eq(S0_W.loc_cd))
							.and(S0_T.str_ln_cd.eq(S0_W.str_ln_cd))
							.and(S0_T.stk_arrv_bp_cd.eq(S0_W.stk_arrv_bp_cd))
							.and(S0_T.lot_no.eq(S0_W.lot_no))
							.and(S0_T.sublot_no.eq(S0_W.sublot_no))
							.and(S0_T.sno1.eq(S0_W.sno1))
							.and(S0_T.sno2.eq(S0_W.sno2))
							.and(S0_T.sno3.eq(S0_W.sno3))
							.and(S0_T.sno4.eq(S0_W.sno4))
							.and(S0_T.fix_no_typ.eq(S0_W.fix_no_typ))
							.and(S0_T.fix_no.eq(S0_W.fix_no))
							.and(S0_T.pack_unit_cd.eq(S0_W.pack_unit_cd))
							.and(S0_T.gd_cd.eq(S0_W.gd_cd))
							.and(S0_T.in_xfr_typ.eq(S0_W.in_xfr_typ))
							.and(S0_T.quality_typ.eq(S0_W.quality_typ))
							.and(S0_T.asst_typ.eq(S0_W.asst_typ))
							.and(S0_T.stk_insp_typ.eq(S0_W.stk_insp_typ))
							.and(S0_T.stk_id_typ.eq(S0_W.stk_id_typ))
							.and(S0_T.stk_bp_cd.eq(S0_W.stk_bp_cd))
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.loc_cd.asc(),
						S0_T.str_ln_cd.asc(),
						S0_T.stk_arrv_bp_cd.asc(),
						S0_T.lot_no.asc(),
						S0_T.sublot_no.asc(),
						S0_T.sno1.asc(),
						S0_T.sno2.asc(),
						S0_T.sno3.asc(),
						S0_T.sno4.asc(),
						S0_T.fix_no_typ.asc(),
						S0_T.fix_no.asc(),
						S0_T.pack_unit_cd.asc(),
						S0_T.gd_cd.asc(),
						S0_T.in_xfr_typ.asc(),
						S0_T.quality_typ.asc(),
						S0_T.asst_typ.asc(),
						S0_T.stk_insp_typ.asc(),
						S0_T.stk_id_typ.asc(),
						S0_T.stk_bp_cd.asc()
					)
					.forUpdate()
			);
	}
	
	/**
	 * -- MSBEL5030_MST_STK_Query_S02
	 */
	static MCQueryPlan MSBEL5030_MST_STK_S02() {
		MST_STK_R S0_T = MST_STK_R.create("T");
		MSW_STK_KEY_R S0_W = MSW_STK_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5030_MST_STK_Query_S02")
					.mainQuery()
					.select(
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.loc_cd,
						S0_T.str_ln_cd,
						S0_T.stk_arrv_bp_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.fix_no_typ,
						S0_T.fix_no,
						S0_T.pack_unit_cd,
						S0_T.gd_cd,
						S0_T.in_xfr_typ,
						S0_T.quality_typ,
						S0_T.asst_typ,
						S0_T.stk_insp_typ,
						S0_T.stk_id_typ,
						S0_T.stk_bp_cd,
						S0_T.pack_unit_qty,
						S0_T.base_unit_qty
					)
					.from(
						S0_T
						.innerJoin(S0_W).on(
							S0_T.fix_no_typ.eq(S0_W.fix_no_typ)
							.and(S0_T.fix_no.eq(S0_W.fix_no))
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.loc_cd.asc(),
						S0_T.str_ln_cd.asc(),
						S0_T.stk_arrv_bp_cd.asc(),
						S0_T.lot_no.asc(),
						S0_T.sublot_no.asc(),
						S0_T.sno1.asc(),
						S0_T.sno2.asc(),
						S0_T.sno3.asc(),
						S0_T.sno4.asc(),
						S0_T.fix_no_typ.asc(),
						S0_T.fix_no.asc(),
						S0_T.pack_unit_cd.asc(),
						S0_T.gd_cd.asc(),
						S0_T.in_xfr_typ.asc(),
						S0_T.quality_typ.asc(),
						S0_T.asst_typ.asc(),
						S0_T.stk_insp_typ.asc(),
						S0_T.stk_id_typ.asc(),
						S0_T.stk_bp_cd.asc()
					)
					.forUpdate()
			);
	}
}