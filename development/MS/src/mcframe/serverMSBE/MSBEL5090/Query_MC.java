package mcframe.serverMSBE.MSBEL5090;

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
	 * -- MSBEL5090_MST_IO_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL5090_MST_IO_SCHD_S01() {
		MST_IO_SCHD_R S0_T1 = MST_IO_SCHD_R.create("T1");
		MAW_STR_LN_KEY_R S0_W1 = MAW_STR_LN_KEY_R.create("W1");
		MST_SHIP_SCHD_R S0_T2 = MST_SHIP_SCHD_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5090_MST_IO_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.wg_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						countAll().as("total_cnt")
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.loc_cd.eq(S0_W1.loc_cd)
								.and(S0_T1.str_ln_cd.eq(S0_W1.str_ln_cd))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.ship_schd_no.eq(S0_T1.io_schd_sub_no3)
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
						.and(S0_T2.ship_schd_tm.gte(bind("tm_fr")))
						.and(S0_T2.ship_schd_tm.lte(bind("tm_to")))
						.cutoff$and(S0_T2.ship_term_cd.eq(bind("ship_term_cd")))
						.cutoff$and(S0_T2.ship_wk_cd.eq(bind("ship_wk_cd")))
						.cutoff$and(S0_T1.alloc_flg.eq(bind("w_alloc")))
						.cutoff$and(S0_T1.alloc_flg.eq(bind("w_not_alloc")))
						.and(S0_T1.alloc_scope_typ.eq(value(MAC_ALLOC_SCOPE_TYP.ALLOC_GRP.value())))
						.and(
							S0_T1.io_schd_sts_typ.eq(value("XX"))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_schd")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_slo")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_prms")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_dlv_inst")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_ord")))
						)
						.and(S0_M1.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
					)
					.groupBy(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.wg_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd
					)
			);
	}
	
	/**
	 * -- MSBEL5090_MST_IO_SCHD_Query_S02
	 */
	static MCQueryPlan MSBEL5090_MST_IO_SCHD_S02() {
		MST_IO_SCHD_R S0_T1 = MST_IO_SCHD_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MST_SLO_R S0_T3 = MST_SLO_R.create("T3");
		MST_SHIP_SCHD_R S0_T4 = MST_SHIP_SCHD_R.create("T4");
		MSW_SHIP_STK_RPL_ITM_LOC_R S0_W1 = MSW_SHIP_STK_RPL_ITM_LOC_R.create("W1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5090_MST_IO_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_T1.io_schd_typ,
						S0_T1.io_schd_sts_typ,
						S0_T1.slip_schd_no,
						S0_T1.alloc_flg,
						S0_T1.io_schd_no,
						S0_T1.io_schd_seq,
						S0_T1.io_schd_sub_typ1,
						S0_T1.io_schd_sub_no1,
						S0_T1.io_schd_sub_typ2,
						S0_T1.io_schd_sub_no2,
						S0_T1.io_schd_sub_typ3,
						S0_T1.io_schd_sub_no3,
						S0_T1.io_schd_sub_typ4,
						S0_T1.io_schd_sub_no4,
						S0_T1.io_schd_pr_no,
						S0_T1.schd_dt,
						S0_T4.dlv_schd_tm,
						S0_T1.wg_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_M2.lg_grp_cd,
						S0_T3.cst_cd,
						nvl(
							S0_T4.dlv_cd,
							S0_T2.dlv_cd
						).as("dlv_cd"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.ver_no,
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
						S0_T1.gd_cd,
						S0_T1.pack_unit_cd,
						S0_T1.base_unit_cd,
						S0_T1.quality_typ,
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T1.stk_arrv_bp_cd,
						S0_T1.pack_unit_qty.as("pack_unit_short_qty"),
						S0_T1.base_unit_qty.as("base_unit_short_qty"),
						S0_T1.vld_dt_fr,
						S0_T4.not_lot_mix_flg,
						S0_T4.not_sublot_mix_flg,
						S0_M1.dec_place.as("base_dec_place"),
						S0_M1.rnd_typ.as("base_rnd_typ"),
						S0_M1.pack_alloc_flg
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T1.io_schd_sub_no2)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.slo_no.eq(S0_T2.slo_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.ship_schd_no.eq(S0_T1.io_schd_sub_no3)
							)
						)
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.loc_cd.eq(S0_W1.loc_cd)
								.and(S0_T1.str_ln_cd.eq(S0_W1.str_ln_cd))
								.and(S0_T1.itm_cd.eq(S0_W1.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_W1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_W1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_W1.itm_sub3))
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
						.innerJoin(S0_M2).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M2.loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T4.ship_schd_tm.gte(bind("tm_fr")))
						.and(S0_T4.ship_schd_tm.lte(bind("tm_to")))
						.and(S0_T1.alloc_scope_typ.eq(value(MAC_ALLOC_SCOPE_TYP.ALLOC_GRP.value())))
						.cutoff$and(S0_T4.ship_term_cd.eq(bind("ship_term_cd")))
						.cutoff$and(S0_T4.ship_wk_cd.eq(bind("ship_wk_cd")))
						.cutoff$and(S0_T1.alloc_flg.eq(bind("w_alloc")))
						.cutoff$and(S0_T1.alloc_flg.eq(bind("w_not_alloc")))
						.and(
							S0_T1.io_schd_sts_typ.eq(value("XX"))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_schd")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_slo")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_prms")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_dlv_inst")))
							.cutoff$or(S0_T1.io_schd_sts_typ.eq(bind("w_ord")))
						)
						.and(S0_M1.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
					)
			);
	}
	
	
	/**
	 * -- MSBEL5090_MST_SHIP_STK_RPL_LST_Query_D01
	 */
	static MCQueryPlan MSBEL5090_MST_SHIP_STK_RPL_LST_D01() {
		MST_SHIP_STK_RPL_LST_R S0_T1 = MST_SHIP_STK_RPL_LST_R.create("T1");
		MAW_STR_LN_KEY_R S1_W1 = MAW_STR_LN_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5090_MST_SHIP_STK_RPL_LST_Query_D01")
					.delete(S0_T1)
					.where(
						exists(
							subQuery()
							.select(value(0))
							.from(S1_W1)
							.where(
								S0_T1.loc_cd.eq(S1_W1.loc_cd)
								.and(S0_T1.str_ln_cd.eq(S1_W1.str_ln_cd))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBEL5090_MST_SHIP_STK_RPL_LST_Query_S01
	 */
	static MCQueryPlan MSBEL5090_MST_SHIP_STK_RPL_LST_S01() {
		MST_SHIP_STK_RPL_LST_R S0_T1 = MST_SHIP_STK_RPL_LST_R.create("T1");
		MAW_STR_LN_KEY_R S0_W1 = MAW_STR_LN_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5090_MST_SHIP_STK_RPL_LST_Query_S01")
					.mainQuery()
					.select(S0_T1.batch_data_no)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.loc_cd.eq(S0_W1.loc_cd)
								.and(S0_T1.str_ln_cd.eq(S0_W1.str_ln_cd))
							)
						)
					)
					.orderBy(S0_T1.batch_data_no.asc())
					.forUpdate(S0_T1.batch_data_no)
			);
	}
	
	/**
	 * -- MSBEL5090_MST_SHIP_STK_RPL_LST_Query_S02
	 */
	static MCQueryPlan MSBEL5090_MST_SHIP_STK_RPL_LST_S02() {
		MST_SHIP_STK_RPL_LST_R S0_T1 = MST_SHIP_STK_RPL_LST_R.create("T1");
		MAW_STR_LN_KEY_R S0_W1 = MAW_STR_LN_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5090_MST_SHIP_STK_RPL_LST_Query_S02")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.loc_cd.eq(S0_W1.loc_cd)
								.and(S0_T1.str_ln_cd.eq(S0_W1.str_ln_cd))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBEL5090_MST_XFR_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL5090_MST_XFR_SCHD_S01() {
		MST_XFR_SCHD_R S0_T1 = MST_XFR_SCHD_R.create("T1");
		MAW_STR_LN_KEY_R S0_W1 = MAW_STR_LN_KEY_R.create("W1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5090_MST_XFR_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.gr_wg_cd.as("wg_cd"),
						S0_T1.gr_loc_cd.as("loc_cd"),
						S0_T1.gr_str_ln_cd.as("str_ln_cd"),
						countAll().as("total_cnt")
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.gr_loc_cd.eq(S0_W1.loc_cd)
								.and(S0_T1.gr_str_ln_cd.eq(S0_W1.str_ln_cd))
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
						.and(S0_T1.gr_rqst_tm.gte(bind("tm_fr")))
						.and(S0_T1.gr_rqst_tm.lte(bind("tm_to")))
						.and(S0_T1.xfr_src_typ.eq(value(MSC_XFR_SRC_TYP.SHIP_RPL.value())))
						.and(S0_M1.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
					)
					.groupBy(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.gr_wg_cd,
						S0_T1.gr_loc_cd,
						S0_T1.gr_str_ln_cd
					)
			);
	}
	
	/**
	 * -- MSBEL5090_MST_XFR_SCHD_Query_S02
	 */
	static MCQueryPlan MSBEL5090_MST_XFR_SCHD_S02() {
		MST_XFR_SCHD_R S0_T1 = MST_XFR_SCHD_R.create("T1");
		MSW_SHIP_STK_RPL_ITM_LOC_R S0_W1 = MSW_SHIP_STK_RPL_ITM_LOC_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5090_MST_XFR_SCHD_Query_S02")
					.mainQuery()
					.select(S0_T1.xfr_schd_no)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.gr_loc_cd.eq(S0_W1.loc_cd)
								.and(S0_T1.gr_str_ln_cd.eq(S0_W1.str_ln_cd))
								.and(S0_T1.itm_cd.eq(S0_W1.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_W1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_W1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_W1.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.gr_rqst_tm.gte(bind("tm_fr")))
						.and(S0_T1.gr_rqst_tm.lte(bind("tm_to")))
						.and(S0_T1.xfr_src_typ.eq(value(MSC_XFR_SRC_TYP.SHIP_RPL.value())))
					)
					.orderBy(S0_T1.xfr_schd_no.asc())
			);
	}
}