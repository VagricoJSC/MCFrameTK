package mcframe.serverMSBE.MSBEL5010;

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
	 * -- MSBEL5010_MST_STK_Query_S01
	 */
	static MCQueryPlan MSBEL5010_MST_STK_S01() {
		MST_STK_R S0_T = MST_STK_R.create("T");
		MSW_STK_KEY_R S0_W = MSW_STK_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5010_MST_STK_Query_S01")
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
			);
	}
	
	/**
	 * -- MSBEL5010_MST_STK_Query_S02
	 */
	static MCQueryPlan MSBEL5010_MST_STK_S02() {
		MST_STK_R S0_T = MST_STK_R.create("T");
		MSW_STK_KEY_R S0_W = MSW_STK_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5010_MST_STK_Query_S02")
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
						S0_T.fix_no_typ.asc(),
						S0_T.fix_no.desc()
					)
			);
	}
	
	/**
	 * -- MSBEL5010_MST_MLY_STK_DTL_Query_S01
	 */
	static MCQueryPlan MSBEL5010_MST_MLY_STK_DTL_S01() {
		MST_MLY_STK_DTL_R MLY_STK_DTL1 = MST_MLY_STK_DTL_R.create("MLY_STK_DTL1");
		MSW_MLY_STK_DTL_KEY_R MLY_STK_DTL_KEY1 = MSW_MLY_STK_DTL_KEY_R.create("MLY_STK_DTL_KEY1");
		MCTempView V1 = createTempView("V1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5010_MST_MLY_STK_DTL_Query_S01")
					.mainQuery()
					.select(
						V1.pr("ac_ym"),
						V1.pr("itm_cd"),
						V1.pr("itm_sub1"),
						V1.pr("itm_sub2"),
						V1.pr("itm_sub3"),
						V1.pr("loc_cd"),
						V1.pr("str_ln_cd"),
						V1.pr("stk_arrv_bp_cd"),
						V1.pr("lot_no"),
						V1.pr("sublot_no"),
						V1.pr("sno1"),
						V1.pr("sno2"),
						V1.pr("sno3"),
						V1.pr("sno4"),
						V1.pr("fix_no_typ"),
						V1.pr("fix_no"),
						V1.pr("pack_unit_cd"),
						V1.pr("gd_cd"),
						V1.pr("in_xfr_typ"),
						V1.pr("quality_typ"),
						V1.pr("asst_typ"),
						V1.pr("stk_insp_typ"),
						V1.pr("stk_id_typ"),
						V1.pr("stk_bp_cd"),
						V1.pr("pack_unit_qty"),
						V1.pr("base_unit_qty")
					)
					.from(
						subQuery()
						.select(
							MLY_STK_DTL1.ac_ym,
							MLY_STK_DTL1.itm_cd,
							MLY_STK_DTL1.itm_sub1,
							MLY_STK_DTL1.itm_sub2,
							MLY_STK_DTL1.itm_sub3,
							MLY_STK_DTL1.loc_cd,
							MLY_STK_DTL1.str_ln_cd,
							MLY_STK_DTL1.stk_arrv_bp_cd,
							MLY_STK_DTL1.lot_no,
							MLY_STK_DTL1.sublot_no,
							MLY_STK_DTL1.sno1,
							MLY_STK_DTL1.sno2,
							MLY_STK_DTL1.sno3,
							MLY_STK_DTL1.sno4,
							MLY_STK_DTL1.fix_no_typ,
							MLY_STK_DTL1.fix_no,
							MLY_STK_DTL1.pack_unit_cd,
							MLY_STK_DTL1.gd_cd,
							MLY_STK_DTL1.in_xfr_typ,
							MLY_STK_DTL1.quality_typ,
							MLY_STK_DTL1.asst_typ,
							MLY_STK_DTL1.stk_insp_typ,
							MLY_STK_DTL1.stk_id_typ,
							MLY_STK_DTL1.stk_bp_cd,
							MLY_STK_DTL1.pack_unit_qty,
							MLY_STK_DTL1.base_unit_qty,
							rowNumber()
								.over()
								.partitionBy(
									MLY_STK_DTL1.itm_cd,
									MLY_STK_DTL1.itm_sub1,
									MLY_STK_DTL1.itm_sub2,
									MLY_STK_DTL1.itm_sub3,
									MLY_STK_DTL1.loc_cd,
									MLY_STK_DTL1.str_ln_cd,
									MLY_STK_DTL1.stk_arrv_bp_cd,
									MLY_STK_DTL1.lot_no,
									MLY_STK_DTL1.sublot_no,
									MLY_STK_DTL1.sno1,
									MLY_STK_DTL1.sno2,
									MLY_STK_DTL1.sno3,
									MLY_STK_DTL1.sno4,
									MLY_STK_DTL1.fix_no_typ,
									MLY_STK_DTL1.fix_no,
									MLY_STK_DTL1.pack_unit_cd,
									MLY_STK_DTL1.gd_cd,
									MLY_STK_DTL1.in_xfr_typ,
									MLY_STK_DTL1.quality_typ,
									MLY_STK_DTL1.asst_typ,
									MLY_STK_DTL1.stk_insp_typ,
									MLY_STK_DTL1.stk_id_typ,
									MLY_STK_DTL1.stk_bp_cd
								)
								.orderBy(MLY_STK_DTL1.ac_ym.desc())
								.as("RN")
						)
						.from(
							MLY_STK_DTL1
							.innerJoin(MLY_STK_DTL_KEY1).on(
								MLY_STK_DTL1.ac_ym.lte(MLY_STK_DTL_KEY1.ac_ym)
								.and(MLY_STK_DTL1.itm_cd.eq(MLY_STK_DTL_KEY1.itm_cd))
								.and(MLY_STK_DTL1.itm_sub1.eq(MLY_STK_DTL_KEY1.itm_sub1))
								.and(MLY_STK_DTL1.itm_sub2.eq(MLY_STK_DTL_KEY1.itm_sub2))
								.and(MLY_STK_DTL1.itm_sub3.eq(MLY_STK_DTL_KEY1.itm_sub3))
								.and(MLY_STK_DTL1.loc_cd.eq(MLY_STK_DTL_KEY1.loc_cd))
								.and(MLY_STK_DTL1.str_ln_cd.eq(MLY_STK_DTL_KEY1.str_ln_cd))
								.and(MLY_STK_DTL1.stk_arrv_bp_cd.eq(MLY_STK_DTL_KEY1.stk_arrv_bp_cd))
								.and(MLY_STK_DTL1.lot_no.eq(MLY_STK_DTL_KEY1.lot_no))
								.and(MLY_STK_DTL1.sublot_no.eq(MLY_STK_DTL_KEY1.sublot_no))
								.and(MLY_STK_DTL1.sno1.eq(MLY_STK_DTL_KEY1.sno1))
								.and(MLY_STK_DTL1.sno2.eq(MLY_STK_DTL_KEY1.sno2))
								.and(MLY_STK_DTL1.sno3.eq(MLY_STK_DTL_KEY1.sno3))
								.and(MLY_STK_DTL1.sno4.eq(MLY_STK_DTL_KEY1.sno4))
								.and(MLY_STK_DTL1.pack_unit_cd.eq(MLY_STK_DTL_KEY1.pack_unit_cd))
								.and(MLY_STK_DTL1.gd_cd.eq(MLY_STK_DTL_KEY1.gd_cd))
								.and(MLY_STK_DTL1.in_xfr_typ.eq(MLY_STK_DTL_KEY1.in_xfr_typ))
								.and(MLY_STK_DTL1.quality_typ.eq(MLY_STK_DTL_KEY1.quality_typ))
								.and(MLY_STK_DTL1.asst_typ.eq(MLY_STK_DTL_KEY1.asst_typ))
								.and(MLY_STK_DTL1.stk_insp_typ.eq(MLY_STK_DTL_KEY1.stk_insp_typ))
								.and(MLY_STK_DTL1.stk_id_typ.eq(MLY_STK_DTL_KEY1.stk_id_typ))
								.and(MLY_STK_DTL1.stk_bp_cd.eq(MLY_STK_DTL_KEY1.stk_bp_cd))
							)
						)
						.view(V1)
					)
					.where(
						value(0).eq(value(0))
						.and(V1.pr("RN").eq(value(1)))
						.and(V1.pr("pack_unit_qty").neq(value(0)))
						.and(V1.pr("base_unit_qty").neq(value(0)))
					)
			);
	}
}