package mcframe.serverMSBE.MSBEL5730;

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
	 *  -- MSBEL5730_MST_SHIP_INST_D_Query_S01
	 */
	static MCQueryPlan MSBEL5730_MST_SHIP_INST_D_S01() {
		MST_SHIP_INST_D_R S0_SHIPINSTD = MST_SHIP_INST_D_R.create("SHIPINSTD");
		MSW_SHIP_INST_D_KEY_R S0_SHIPINSTDWK = MSW_SHIP_INST_D_KEY_R.create("SHIPINSTDWK");
		MST_SHIP_INST_R S0_SHIPINST = MST_SHIP_INST_R.create("SHIPINST");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SHIP_ALLOC_STS_R S0_SHIPALLOCSTS = MST_SHIP_ALLOC_STS_R.create("SHIPALLOCSTS");
		MCTempView S1_VIVSHIPINSTMAP = createTempView("VIVSHIPINSTMAP");
		MST_IV_SHIP_INST_MAP_R S1_IVSHIPINSTMAP = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5730_MST_SHIP_INST_D_Query_S01")
					.mainQuery()
					.select(
						S0_SHIPINST.ship_inst_no,
						S0_SHIPINSTD.ship_inst_d_no,
						S0_SHIPSCHD.ship_schd_no,
						S0_SHIPALLOCSTS.ship_alloc_sts_no,
						S0_SHIPALLOCSTS.base_unit_qty.subtract(nvl(S1_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).as("base_unit_qty")
					)
					.from(
						S0_SHIPINSTD
						.innerJoin(S0_SHIPINSTDWK).on(S0_SHIPINSTD.ship_inst_d_no.eq(S0_SHIPINSTDWK.ship_inst_d_no))
						.innerJoin(S0_SHIPINST).on(S0_SHIPINSTD.ship_inst_no.eq(S0_SHIPINST.ship_inst_no))
						.innerJoin(S0_SHIPSCHD).on(S0_SHIPINSTD.ship_inst_d_no.eq(S0_SHIPSCHD.ship_inst_d_no))
						.innerJoin(S0_SHIPALLOCSTS).on(
								S0_SHIPINSTD.ship_inst_d_no.eq(S0_SHIPALLOCSTS.ship_inst_d_no)
								.and(S0_SHIPSCHD.ship_schd_no.eq(S0_SHIPALLOCSTS.ship_schd_no))
								)
						.leftOuterJoin(subQuery()
								.select(
									S1_IVSHIPINSTMAP.ship_alloc_sts_no,
									sum(S1_IVSHIPINSTMAP.base_unit_qty).as("iv_qty")
								).from(S1_IVSHIPINSTMAP)
								.groupBy(S1_IVSHIPINSTMAP.ship_alloc_sts_no)
								.view(S1_VIVSHIPINSTMAP)).on(S0_SHIPALLOCSTS.ship_alloc_sts_no.eq(S1_VIVSHIPINSTMAP.pr(S1_IVSHIPINSTMAP.ship_alloc_sts_no)))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_SHIPINST.can_flg.eq(value(false)))
						.and(S0_SHIPINSTD.can_flg.eq(value(false)))
						.and(S0_SHIPALLOCSTS.base_unit_qty.subtract(nvl(S1_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).gt(value(0)))
					)
					.orderBy(	S0_SHIPINST.ship_inst_no.asc(),
						S0_SHIPINSTD.ship_inst_d_no.asc(),
						S0_SHIPSCHD.ship_schd_no.asc(),
						S0_SHIPALLOCSTS.ship_alloc_sts_no.asc())
			);
	}
	
	/**
	 *  -- MSBEL5730_MST_SHIP_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBEL5730_MST_SHIP_ACT_D_S01() {
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MSW_SHIP_ACT_D_KEY_R S0_SHIPACTDWK = MSW_SHIP_ACT_D_KEY_R.create("SHIPACTDWK");
		MST_SHIP_ACT_R S0_SHIPACT = MST_SHIP_ACT_R.create("SHIPACT");
		MST_SHIP_ALLOC_STS_R S0_SHIPALLOCSTS = MST_SHIP_ALLOC_STS_R.create("SHIPALLOCSTS");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MCTempView S1_VIVSHIPACTMAP = createTempView("VIVSHIPACTMAP");
		MST_IV_SHIP_ACT_MAP_R S1_IVSHIPACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5730_MST_SHIP_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_SHIPACT.ship_act_no,
						S0_SHIPACTD.ship_act_d_no,
						S0_SHIPSCHD.ship_schd_no,
						S0_SHIPACTD.ship_alloc_sts_no,
						S0_SHIPACTD.base_unit_qty.subtract(nvl(S1_VIVSHIPACTMAP.pr("iv_qty"), value(0))).as("base_unit_qty")
					)
					.from(
						S0_SHIPACTD
						.innerJoin(S0_SHIPACTDWK).on(S0_SHIPACTD.ship_act_d_no.eq(S0_SHIPACTDWK.ship_act_d_no))
						.innerJoin(S0_SHIPACT).on(S0_SHIPACTD.ship_act_no.eq(S0_SHIPACT.ship_act_no))
						.innerJoin(S0_SHIPALLOCSTS).on(S0_SHIPACTD.ship_alloc_sts_no.eq(S0_SHIPALLOCSTS.ship_alloc_sts_no))
						.innerJoin(S0_SHIPSCHD).on(S0_SHIPALLOCSTS.ship_schd_no.eq(S0_SHIPSCHD.ship_schd_no))
						.leftOuterJoin(subQuery()
							.select(
								S1_IVSHIPACTMAP.ship_act_d_no,
								sum(S1_IVSHIPACTMAP.base_unit_qty).as("iv_qty")
							).from(S1_IVSHIPACTMAP)
							.groupBy(S1_IVSHIPACTMAP.ship_act_d_no)
							.view(S1_VIVSHIPACTMAP)).on(S0_SHIPACTD.ship_act_d_no.eq(S1_VIVSHIPACTMAP.pr(S1_IVSHIPACTMAP.ship_act_d_no)))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_SHIPACTD.base_unit_qty.subtract(nvl(S1_VIVSHIPACTMAP.pr("iv_qty"), value(0))).gt(value(0)))
						.and(S0_SHIPACT.can_flg.eq(value(false)))
						.and(S0_SHIPACTD.can_flg.eq(value(false)))
					)
			);
	}
	
	/**
	 * -- MSBEL5730_MST_IV_MAP_S01
	 */
	static MCQueryPlan MSBEL5730_MST_IV_MAP_S01() {
		MST_IV_MAP_R S0_IVMAP = MST_IV_MAP_R.create("IVMAP");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MSW_SHIP_SCHD_KEY_R S0_SHIPSCHDWK = MSW_SHIP_SCHD_KEY_R.create("SHIPSCHDWK");
		MCTempView S1_VIVSHIPINSTMAP = createTempView("VIVSHIPINSTMAP");
		MST_IV_SHIP_INST_MAP_R S1_IVSHIPINSTMAP = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5730_MST_IV_MAP_Query_S01")
					.mainQuery()
					.select(
						S0_IV.iv_no,
						S0_IV.iv_ship_flg,
						S0_IVMAP.iv_d_no,
						S0_IVMAP.ship_schd_no,
						S0_IVMAP.base_unit_qty.subtract(nvl(S1_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).as("base_unit_qty")
					)
					.from(
						S0_IVMAP
						.innerJoin(S0_IVD).on(S0_IVMAP.iv_d_no.eq(S0_IVD.iv_d_no))
						.innerJoin(S0_IV).on(S0_IVD.iv_mng_no.eq(S0_IV.iv_mng_no))
						.innerJoin(S0_SHIPSCHD).on(S0_IVMAP.ship_schd_no.eq(S0_SHIPSCHD.ship_schd_no))
						.innerJoin(S0_SHIPSCHDWK).on(S0_SHIPSCHD.ship_schd_no.eq(S0_SHIPSCHDWK.ship_schd_no))
						.leftOuterJoin(subQuery().select(
								S1_IVSHIPINSTMAP.iv_d_no,
								S1_IVSHIPINSTMAP.ship_schd_no,
								sum(S1_IVSHIPINSTMAP.base_unit_qty).as("iv_qty")
								).from(S1_IVSHIPINSTMAP)
								.groupBy(S1_IVSHIPINSTMAP.iv_d_no,
										S1_IVSHIPINSTMAP.ship_schd_no)
								.view(S1_VIVSHIPINSTMAP))
						.on(S0_IVMAP.iv_d_no.eq(S1_VIVSHIPINSTMAP.pr(S1_IVSHIPINSTMAP.iv_d_no))
								.and(S0_IVMAP.ship_schd_no.eq(S1_VIVSHIPINSTMAP.pr(S1_IVSHIPINSTMAP.ship_schd_no))))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_IVMAP.base_unit_qty.subtract(nvl(S1_VIVSHIPINSTMAP.pr("iv_qty"), value(0))).gt(value(0)))
						.cutoff$and(S0_IV.iv_no.eq(bind("iv_no")))
					)
			);
	}
	
	/**
	 * -- MSBEL5730_MST_IV_MAP_S02
	 */
	static MCQueryPlan MSBEL5730_MST_IV_MAP_S02() {
		MST_IV_MAP_R S0_IVMAP = MST_IV_MAP_R.create("IVMAP");
		MST_IV_D_R S0_IVD = MST_IV_D_R.create("IVD");
		MST_IV_R S0_IV = MST_IV_R.create("IV");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MSW_SHIP_SCHD_KEY_R S0_SHIPSCHDWK = MSW_SHIP_SCHD_KEY_R.create("SHIPSCHDWK");
		MCTempView S1_VIVSHIPACTMAP = createTempView("VIVSHIPACTMAP");
		MST_IV_SHIP_ACT_MAP_R S1_IVSHIPACTMAP = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5730_MST_IV_MAP_Query_S02")
					.mainQuery()
					.select(
						S0_IV.iv_no,
						S0_IVMAP.iv_d_no,
						S0_IVMAP.ship_schd_no,
						S0_IVMAP.base_unit_qty.subtract(nvl(S1_VIVSHIPACTMAP.pr("iv_qty"), value(0))).as("base_unit_qty")
					)
					.from(
						S0_IVMAP
						.innerJoin(S0_IVD).on(S0_IVMAP.iv_d_no.eq(S0_IVD.iv_d_no))
						.innerJoin(S0_IV).on(S0_IVD.iv_mng_no.eq(S0_IV.iv_mng_no))
						.innerJoin(S0_SHIPSCHD).on(S0_IVMAP.ship_schd_no.eq(S0_SHIPSCHD.ship_schd_no))
						.innerJoin(S0_SHIPSCHDWK).on(S0_SHIPSCHD.ship_schd_no.eq(S0_SHIPSCHDWK.ship_schd_no))
						.leftOuterJoin(subQuery().select(
								S1_IVSHIPACTMAP.iv_d_no,
								S1_IVSHIPACTMAP.ship_schd_no,
								sum(S1_IVSHIPACTMAP.base_unit_qty).as("iv_qty")
								).from(S1_IVSHIPACTMAP)
								.groupBy(S1_IVSHIPACTMAP.iv_d_no,
										S1_IVSHIPACTMAP.ship_schd_no)
								.view(S1_VIVSHIPACTMAP))
						.on(S0_IVMAP.iv_d_no.eq(S1_VIVSHIPACTMAP.pr(S1_IVSHIPACTMAP.iv_d_no))
								.and(S0_IVMAP.ship_schd_no.eq(S1_VIVSHIPACTMAP.pr(S1_IVSHIPACTMAP.ship_schd_no))))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_IVMAP.base_unit_qty.subtract(nvl(S1_VIVSHIPACTMAP.pr("iv_qty"), value(0))).gt(value(0)))
						.cutoff$and(S0_IV.iv_no.eq(bind("iv_no")))
					)
			);
	}
	/**
	 * -- MSBEL5730_CHECK_IV_SHIP_Query_S04
	 */
	static MCQueryPlan MSBEL5730_CHECK_IV_SHIP_S04() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_D_R S0_T3 = MST_SLO_D_R.create("T3");
		MST_SLO_R S0_T4 = MST_SLO_R.create("T4");
		MST_SLS_SCHD_R S1_TX1 = MST_SLS_SCHD_R.create("TX1");
		MST_PURC_SCHD_R S1_TX2 = MST_PURC_SCHD_R.create("TX2");
		MST_ARR_PR_R S1_TX3 = MST_ARR_PR_R.create("TX3");
		MST_PO_D_R S1_TX4 = MST_PO_D_R.create("TX4");
		MST_PO_R S1_TX5 = MST_PO_R.create("TX5");
		MAM_BP_R S1_TX6 = MAM_BP_R.create("TX6");
		MSW_SHIP_SCHD_KEY_R S2_T1W = MSW_SHIP_SCHD_KEY_R.create("T1W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5730_CHECK_IV_SHIP_Query_S04")
					.mainQuery()
					.select(S0_T1.ship_schd_no)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.ship_pr_no.eq(S0_T2.ship_pr_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.slo_d_no.eq(S0_T2.slo_d_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.slo_no.eq(S0_T3.slo_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T4.iv_no.eq(bind("iv_no")))
						.and(S0_T1.base_unit_qty.subtract(S0_T1.abort_qty).subtract(S0_T1.iv_schd_qty).subtract(S0_T1.ship_ret_qty).gt(value(0)))
						.and(
							S0_T2.purc_ddlv_flg.eq(value(false))
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S1_TX1
										.innerJoin(S1_TX2).on(
											bracket(
												S1_TX1.purc_schd_no.eq(S1_TX2.purc_schd_no)
											)
										)
										.innerJoin(S1_TX3).on(
											bracket(
												S1_TX2.arr_pr_no.eq(S1_TX3.arr_pr_no)
											)
										)
										.innerJoin(S1_TX4).on(
											bracket(
												S1_TX3.po_d_no.eq(S1_TX4.po_d_no)
											)
										)
										.innerJoin(S1_TX5).on(
											bracket(
												S1_TX4.po_no.eq(S1_TX5.po_no)
											)
										)
										.leftOuterJoin(S1_TX6).on(
											bracket(
												S1_TX5.sppl_cd.eq(S1_TX6.bp_cd)
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S0_T1.ship_schd_no.eq(S1_TX1.ship_schd_no))
										.and(S1_TX1.cmpl_flg.eq(value(false)))
										.and(S1_TX1.purc_schd_no.isNotNull())
										.and(S1_TX4.rqst_can_flg.eq(value(false)))
										.and(S1_TX6.sppl_iv_flg.eq(value(false)))
									)
								)
							)
						)
						.and(
							not(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_T1W)
									.where(
										S2_T1W.ship_schd_no.eq(S0_T1.ship_schd_no)
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBEL5730_MST_SHIP_ACT_D_Query_S03
	 */
	static MCQueryPlan MSBEL5730_MST_SHIP_ACT_D_S03() {
		MST_SHIP_ACT_D_R S0_SHIPACTD = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MST_SHIP_ACT_R S0_SHIPACT = MST_SHIP_ACT_R.create("SHIPACT");
		MST_SHIP_ALLOC_STS_R S0_SHIPALLOCSTS = MST_SHIP_ALLOC_STS_R.create("SHIPALLOCSTS");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_LOC_R S0_DIVIDLOC = MAM_LOC_R.create("DIVIDLOC");
		MAVM_ITM_UNIT_R S0_TRDITMUNIT = MAVM_ITM_UNIT_R.create("TRDITMUNIT");
		MAVM_ITM_UNIT_R S0_PACKITMUNIT = MAVM_ITM_UNIT_R.create("PACKITMUNIT");
		MSW_SHIP_ACT_D_KEY_R S0_SHIPACTDWK = MSW_SHIP_ACT_D_KEY_R.create("SHIPACTDWK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5730_MST_SHIP_ACT_D_Query_S03")
					.mainQuery()
					.select(
						S0_SHIPACTD.ship_act_d_no,
						S0_SHIPACT.ship_act_no,
						S0_SHIPACTD.trd_cd,
						S0_SHIPACTD.trd_ptn_typ,
						S0_SHIPACTD.itm_cd,
						S0_SHIPACTD.itm_sub1,
						S0_SHIPACTD.itm_sub2,
						S0_SHIPACTD.itm_sub3,
						S0_SHIPACTD.itm_nm,
						S0_SHIPACTD.stk_mng_typ,
						S0_SHIPACTD.sno1_mng_typ,
						S0_SHIPACTD.sno2_mng_typ,
						S0_SHIPACTD.sno3_mng_typ,
						S0_SHIPACTD.sno4_mng_typ,
						S0_SHIPACTD.sundry_itm_flg,
						S0_SHIPACTD.ship_loc_cd,
						S0_SHIPACTD.ship_str_ln_cd,
						S0_SHIPACTD.stk_arrv_bp_cd,
						S0_SHIPACTD.lot_no,
						S0_SHIPACTD.sublot_no,
						S0_SHIPACTD.sno1,
						S0_SHIPACTD.sno2,
						S0_SHIPACTD.sno3,
						S0_SHIPACTD.sno4,
						S0_SHIPACTD.gd_cd,
						S0_SHIPACTD.quality_typ,
						S0_SHIPACTD.stk_id_typ,
						S0_SHIPACTD.stk_bp_cd,
						S0_SHIPACTD.trd_unit_qty,
						S0_SHIPACTD.trd_unit_cd,
						S0_TRDITMUNIT.dec_place.as("trd_unit_dec_place"),
						S0_TRDITMUNIT.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_TRDITMUNIT.conv_qty.as("trd_unit_conv_qty"),
						S0_TRDITMUNIT.rnd_typ.as("trd_unit_rnd_typ"),
						S0_SHIPACTD.pack_unit_qty,
						S0_SHIPACTD.pack_unit_cd,
						S0_PACKITMUNIT.dec_place.as("pack_unit_dec_place"),
						S0_PACKITMUNIT.conv_base_qty.as("pack_unit_conv_base_qty"),
						S0_PACKITMUNIT.conv_qty.as("pack_unit_conv_qty"),
						S0_PACKITMUNIT.rnd_typ.as("pack_unit_rnd_typ"),
						S0_SHIPACTD.base_unit_qty,
						S0_SHIPACTD.base_unit_cd,
						S0_SHIPACTD.ship_ret_qty,
						S0_SHIPACTD.cst_itm_cd,
						S0_SHIPACTD.cst_itm_nm,
						S0_SHIPACTD.trd_rmrks,
						S0_SHIPACTD.trd_d_rmrks,
						S0_SHIPACTD.rsn_cd,
						S0_LOC.wg_cd.as("ship_loc_cd_wg_cd"),
						S0_DIVIDLOC.wg_cd.as("dlv_id_cd_wg_cd"),
						S0_SHIPACTD.dlv_id_cd,
						S0_SHIPACTD.dlv_str_ln_cd,
						S0_SHIPACTD.trd_ptn_typ,
						S0_SHIPACTD.dlv_slip_no,
						S0_SLO.slo_no,
						S0_SLO.cst_cd
					)
					.from(
						S0_SHIPACTD
						.innerJoin(S0_SHIPACTDWK).on(S0_SHIPACTD.ship_act_d_no.eq(S0_SHIPACTDWK.ship_act_d_no))
						.innerJoin(S0_SHIPACT).on(S0_SHIPACT.ship_act_no.eq(S0_SHIPACTD.ship_act_no))
						.leftOuterJoin(S0_SHIPALLOCSTS).on(S0_SHIPACTD.ship_alloc_sts_no.eq(S0_SHIPALLOCSTS.ship_alloc_sts_no))
						.leftOuterJoin(S0_SHIPSCHD).on(S0_SHIPALLOCSTS.ship_schd_no.eq(S0_SHIPSCHD.ship_schd_no))
						.leftOuterJoin(S0_SHIPPR).on(S0_SHIPSCHD.ship_pr_no.eq(S0_SHIPPR.ship_pr_no))
						.leftOuterJoin(S0_SLOD).on(S0_SLOD.slo_d_no.eq(S0_SHIPPR.slo_d_no))
						.leftOuterJoin(S0_SLO).on(S0_SLO.slo_no.eq(S0_SLOD.slo_no))
						.leftOuterJoin(S0_LOC).on(S0_SHIPACTD.ship_loc_cd.eq(S0_LOC.loc_cd))
						.leftOuterJoin(S0_DIVIDLOC).on(S0_SHIPPR.dlv_id_cd.eq(S0_DIVIDLOC.loc_cd))
						.leftOuterJoin(S0_TRDITMUNIT).on(
							S0_SHIPACTD.itm_cd.eq(S0_TRDITMUNIT.itm_cd)
							.and(S0_SHIPACTD.itm_sub1.eq(S0_TRDITMUNIT.itm_sub1))
							.and(S0_SHIPACTD.itm_sub2.eq(S0_TRDITMUNIT.itm_sub2))
							.and(S0_SHIPACTD.itm_sub3.eq(S0_TRDITMUNIT.itm_sub3))
							.and(S0_SHIPACTD.trd_unit_cd.eq(S0_TRDITMUNIT.unit_cd))
						)
						.leftOuterJoin(S0_PACKITMUNIT).on(
							S0_SHIPACTD.itm_cd.eq(S0_PACKITMUNIT.itm_cd)
							.and(S0_SHIPACTD.itm_sub1.eq(S0_PACKITMUNIT.itm_sub1))
							.and(S0_SHIPACTD.itm_sub2.eq(S0_PACKITMUNIT.itm_sub2))
							.and(S0_SHIPACTD.itm_sub3.eq(S0_PACKITMUNIT.itm_sub3))
							.and(S0_SHIPACTD.pack_unit_cd.eq(S0_PACKITMUNIT.unit_cd))
						)
					)
			);
	}
}