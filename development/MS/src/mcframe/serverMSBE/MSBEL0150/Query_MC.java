package mcframe.serverMSBE.MSBEL0150;

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
	 * -- MSBEL0150_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL0150_MST_SHIP_SCHD_S01() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_D_R S0_T3 = MST_SLO_D_R.create("T3");
		MST_SHIP_ALLOC_STS_R S1_ST1 = MST_SHIP_ALLOC_STS_R.create("ST1");
		MAVM_RD_LG_GRP_R S2_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0150_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.sno1,
						S0_T1.sno1_null_flg,
						S0_T1.sno2,
						S0_T1.sno2_null_flg,
						S0_T1.sno3,
						S0_T1.sno3_null_flg,
						S0_T1.sno4,
						S0_T1.sno4_null_flg
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.ship_pr_no.eq(S0_T1.ship_pr_no))
						.leftOuterJoin(S0_T3).on(S0_T3.slo_d_no.eq(S0_T2.slo_d_no))
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.IMMED.value()))
								.and(S0_T1.wait_qty.gt(value(0)))
							)
							.or(
								S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.LATER.value()))
								.and(S0_T1.wait_qty.gt(value(0)))
							)
							.or(
								S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value()))
								.and(S0_T2.xfr_schd_no.isNotNull())
								.and(S0_T1.base_unit_qty.subtract(S0_T1.alloc_qty).gt(value(0)))
							)
							.or(
								S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value()))
								.and(S0_T3.slo_no.isNotNull())
							)
						)
						.and(S0_T1.abort_flg.eq(value(false)))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_ST1)
								.where(
									value(0).eq(value(0))
									.and(S1_ST1.ship_schd_no.eq(S0_T1.ship_schd_no))
									.and(S1_ST1.alloc_flg.eq(value(false)))
								)
							)
						)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_RD1)
								.where(
									S2_RD1.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
								)
							)
						)
						.and(S0_T1.itm_cd.eq(bind("itm_cd")))
						.and(S0_T1.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T1.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T1.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T1.ship_fr_lg_grp_cd.eq(bind("lg_grp_cd")))
						.and(S0_T1.gd_cd.eq(bind("gd_cd")))
						.cutoff$and(S0_T1.sno1.eq(bind("sno1")))
						.cutoff$and(S0_T1.sno2.eq(bind("sno2")))
						.cutoff$and(S0_T1.sno3.eq(bind("sno3")))
						.cutoff$and(S0_T1.sno4.eq(bind("sno4")))
					)
			);
	}
	
	/**
	 * -- MSBEL0150_MST_SHIP_SCHD_Query_S02
	 */
	static MCQueryPlan MSBEL0150_MST_SHIP_SCHD_S02() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_D_R S0_T3 = MST_SLO_D_R.create("T3");
		MST_SLO_R S0_T3H = MST_SLO_R.create("T3H");
		MST_SLO_PRMS_R S0_T4 = MST_SLO_PRMS_R.create("T4");
		MST_IV_MAP_R S0_T5 = MST_IV_MAP_R.create("T5");
		MST_XFR_SCHD_R S0_T8 = MST_XFR_SCHD_R.create("T8");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MSVM_DLV_ID_R S0_M3 = MSVM_DLV_ID_R.create("M3");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_SUNDRY_ITM_R S0_M7 = MAM_SUNDRY_ITM_R.create("M7");
		MST_SHIP_ALLOC_STS_R S1_ST1 = MST_SHIP_ALLOC_STS_R.create("ST1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0150_MST_SHIP_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_T1.alloc_prio.as("pre_alloc_prio"),
						S0_T2.trd_cd,
						S0_T2.trd_ptn_typ,
						S0_T3.slo_no,
						S0_T3.slo_d_no,
						S0_T2.xfr_schd_no,
						S0_T1.ship_schd_no,
						trunc(
							S0_T1.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T1.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T4.prms_dlv_tm,
							MCDateFmt.DD
						).as("prms_dlv_dt"),
						S0_T4.prms_dlv_tm.as("prms_dlv_hm"),
						S0_T2.alloc_typ,
						S0_T1.pr_sts_typ,
						S0_T2.cst_cd,
						S0_T3H.cst_po_no,
						S0_T2.dlv_id_typ,
						nvl(
							S0_T1.dlv_cd,
							S0_T2.dlv_id_cd
						).as("dlv_id_cd"),
						nvl(
							S0_T1.dlv_nm,
							nvl(
								S0_T2.dlv_id_nm,
								S0_M3.dlv_id_nm
							)
						).as("dlv_id_nm"),
						S0_T2.dlv_str_ln_cd,
						S0_T2.def_loc_cd,
						S0_T2.loc_cd,
						S0_T2.str_ln_cd,
						S0_T2.rqst_dpt_cd,
						S0_M6.dpt_nm.as("rqst_dpt_nm"),
						S0_T2.alloc_grp_cd,
						S0_T2.alloc_scope_typ,
						S0_T1.ship_fr_lg_grp_cd,
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_lg_grp_cd,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_lg_grp_cd,
									S0_T2.ship_to_lg_grp_cd
								),
								S0_T2.ship_to_lg_grp_cd
							)
						).as("ship_to_lg_grp_cd"),
						S0_T1.wg_cd,
						S0_T1.ship_schd_tm,
						S0_T1.dlv_schd_tm,
						S0_T1.ship_term_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						decode(
							S0_T1.sundry_itm_flg,
							value(true),
							nvl(
								S0_T1.itm_nm,
								S0_M7.itm_nm
							),
							S0_M2.itm_nm
						).as("itm_nm"),
						S0_T1.sno1,
						S0_T1.sno1_null_flg,
						S0_T1.sno2,
						S0_T1.sno2_null_flg,
						S0_T1.sno3,
						S0_T1.sno3_null_flg,
						S0_T1.sno4,
						S0_T1.sno4_null_flg,
						S0_T1.ver_no,
						S0_T1.gd_cd,
						S0_T1.quality_typ,
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.alloc_qty,
						S0_T1.alloc_qty.as("schd_alloc_qty"),
						cases()
							.when(S0_T2.xfr_schd_no.isNotNull())
								.then(S0_T1.base_unit_qty.subtract(S0_T1.alloc_qty))
							.otherwise(S0_T1.wait_qty).as("wait_qty"),
						S0_T1.not_lot_mix_flg,
						S0_T1.not_sublot_mix_flg,
						cases()
							.when(S0_T2.slo_d_no.isNotNull())
								.then(S0_T3H.intr_rmrks)
							.otherwise(S0_T8.intr_rmrks).as("intr_rmrks"),
						S0_T3.intr_rmrks.as("intr_d_rmrks"),
						S0_M2.dec_place.as("base_unit_dec_place"),
						S0_M2.rnd_typ.as("base_unit_rnd_typ"),
						S0_M2.pack_alloc_flg,
						S0_T1.upd_cntr,
						S0_T2.upd_cntr.as("ship_pr_upd_cntr"),
						S0_T2.ship_pr_no,
						S0_T1.ship_inst_qty,
						S0_T1.ship_act_qty,
						S0_T3.sls_cststk_flg,
						S0_T3.sls_schd_dt,
						// this field is appended by sql coverter.
						S0_T5.iv_d_no.as("join_iv_d_no_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.ship_pr_no.eq(S0_T1.ship_pr_no))
						.leftOuterJoin(S0_T3).on(S0_T3.slo_d_no.eq(S0_T2.slo_d_no))
						.leftOuterJoin(S0_T3H).on(S0_T3H.slo_no.eq(S0_T3.slo_no))
						.leftOuterJoin(S0_T4).on(S0_T1.slo_prms_no.eq(S0_T4.slo_prms_no))
						.leftOuterJoin(S0_T5).on(S0_T5.ship_schd_no.eq(S0_T1.ship_schd_no))
						.leftOuterJoin(S0_T8).on(S0_T8.xfr_schd_no.eq(S0_T2.xfr_schd_no))
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.dlv_id_typ.eq(S0_T2.dlv_id_typ)
								.and(
									S0_M3.dlv_id_cd.eq(nvl(
											S0_T1.dlv_cd,
											S0_T2.dlv_id_cd
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T2.rqst_dpt_cd.eq(S0_M6.dpt_cd)
								.and(
									trunc(
										S0_T1.ship_schd_tm,
										MCDateFmt.DD
									).between(S0_M6.st_dt, S0_M6.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M7.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M7.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M7.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M7.sno1.eq(S0_T1.sno1))
								.and(S0_M7.sno2.eq(S0_T1.sno2))
								.and(S0_M7.sno3.eq(S0_T1.sno3))
								.and(S0_M7.sno4.eq(S0_T1.sno4))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.IMMED.value()))
								.and(S0_T1.wait_qty.gt(value(0)))
							)
							.or(
								S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.LATER.value()))
								.and(S0_T1.wait_qty.gt(value(0)))
							)
							.or(
								S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value()))
								.and(S0_T2.xfr_schd_no.isNotNull())
								.and(S0_T1.base_unit_qty.subtract(S0_T1.alloc_qty).gt(value(0)))
							)
							.or(
								S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value()))
								.and(S0_T3.slo_no.isNotNull())
							)
						)
						.and(S0_T1.abort_flg.eq(value(false)))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_ST1)
								.where(
									value(0).eq(value(0))
									.and(S1_ST1.ship_schd_no.eq(S0_T1.ship_schd_no))
									.and(S1_ST1.alloc_flg.eq(value(false)))
								)
							)
						)
						.and(S0_T1.itm_cd.eq(bind("itm_cd")))
						.and(S0_T1.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T1.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T1.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T1.ship_fr_lg_grp_cd.eq(bind("lg_grp_cd")))
						.and(S0_T1.gd_cd.eq(bind("gd_cd")))
						.cutoff$and(
							bracket(
								bracket(
									bind("sno1_null_flg").eq(value(true))
									.and(S0_T1.sno1.eq(value(MAC_STR.NULL_VAL.value())))
								)
								.or(S0_T1.sno1.eq(bind("sno1")))
							)
						)
						.cutoff$and(
							bracket(
								bracket(
									bind("sno2_null_flg").eq(value(true))
									.and(S0_T1.sno2.eq(value(MAC_STR.NULL_VAL.value())))
								)
								.or(S0_T1.sno2.eq(bind("sno2")))
							)
						)
						.cutoff$and(
							bracket(
								bracket(
									bind("sno3_null_flg").eq(value(true))
									.and(S0_T1.sno3.eq(value(MAC_STR.NULL_VAL.value())))
								)
								.or(S0_T1.sno3.eq(bind("sno3")))
							)
						)
						.cutoff$and(
							bracket(
								bracket(
									bind("sno4_null_flg").eq(value(true))
									.and(S0_T1.sno4.eq(value(MAC_STR.NULL_VAL.value())))
								)
								.or(S0_T1.sno4.eq(bind("sno4")))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_IV_D_R.class, r -> toCondition(
							r.getStringNE("join_iv_d_no_")
						))
						.addSelect(m -> toArray(
							m.iv_mng_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_iv_mng_no_", m.iv_mng_no());
					}),
					j -> j
						.add(MST_IV_R.class, r -> toCondition(
							r.getStringNE("join_iv_mng_no_")
						))
						.addSelect(m -> toArray(
							m.iv_no
						))
						.addMap((r, m) -> {
							r.setStringNE("iv_no", m.iv_no());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
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
							m.pack_flg,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setBooleanNE("pack_flg", m.pack_flg());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					})
				)
			);
	}
}