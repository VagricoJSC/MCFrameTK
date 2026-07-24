package mcframe.serverMSBE.MSBEL0100;

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
	 * -- MSBEL0100_MST_INSP_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL0100_MST_INSP_ACT_S01() {
		MST_INSP_ACT_R S0_T1 = MST_INSP_ACT_R.create("T1");
		MST_INSP_INST_R S0_T2 = MST_INSP_INST_R.create("T2");
		MSW_LOT_KEY_R S0_W1 = MSW_LOT_KEY_R.create("W1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0100_MST_INSP_ACT_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.lot_no,
						S0_T1.sublot_no.as("lot_tbl_sublot_no"),
						S0_T1.insp_no,
						S0_T1.quality_typ,
						trunc(
							S0_T1.st_tm,
							MCDateFmt.DD
						).as("st_dt"),
						S0_T1.st_tm.as("st_hm"),
						trunc(
							S0_T1.end_tm,
							MCDateFmt.DD
						).as("end_dt"),
						S0_T1.end_tm.as("end_hm"),
						S0_T1.judg_dt,
						S0_T1.insp_judg_rslt_typ,
						S0_T2.to_site_cd.as("site_cd")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.insp_no.eq(S0_T2.insp_no)
							)
						)
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_W1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_W1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_W1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_W1.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_W1.lot_no))
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
							S0_T1.sublot_no.eq(cases()
									.when(S0_M1.sublot_mng_typ.eq(value(MAC_SUBLOT_MNG_TYP.STK.value())))
										.then(value(MAC_STR.NULL_VAL.value()))
									.otherwise(S0_W1.sublot_no)
							)
						)
						.and(
							S0_T1.insp_judg_rslt_typ.isNull()
							.or(S0_T1.insp_judg_rslt_typ.neq(value(MSC_INSP_JUDG_RSLT_TYP.RE.value())))
						)
						.and(S0_T2.insp_typ.neq(value(MSC_INSP_TYP.PRCD.value())))
					)
			);
	}
	
	/**
	 * -- MSBEL0100_MST_IO_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL0100_MST_IO_ACT_S01() {
		MSW_LOT_KEY_R S0_W1 = MSW_LOT_KEY_R.create("W1");
		MST_IO_ACT_R S0_T1 = MST_IO_ACT_R.create("T1");
		MSVT_LOT_LIST_R S0_T3 = MSVT_LOT_LIST_R.create("T3");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		MAM_LOC_R S0_M6 = MAM_LOC_R.create("M6");
		MAM_SITE_R S0_M8 = MAM_SITE_R.create("M8");
		MAM_STR_LN_R S0_M9 = MAM_STR_LN_R.create("M9");
		MAM_LOC_R S0_M21 = MAM_LOC_R.create("M21");
		MAM_LOC_R S0_M22 = MAM_LOC_R.create("M22");
		MAM_SUNDRY_ITM_R S0_M23 = MAM_SUNDRY_ITM_R.create("M23");
		MAM_SUNDRY_ITM_R S0_M24 = MAM_SUNDRY_ITM_R.create("M24");
		MAVM_RD_LOC_R S0_M99 = MAVM_RD_LOC_R.create("M99");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0100_MST_IO_ACT_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.slip_no,
						S0_T1.slip_seq_no,
						S0_T1.ac_dt,
						trunc(
							S0_T1.act_tm,
							MCDateFmt.DD
						).as("act_dt"),
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M23.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.sublot_mng_typ,
						S0_T3.ver_no,
						S0_T1.lot_no,
						S0_T1.sublot_no.as("act_tbl_sublot_no"),
						cases()
							.when(S0_M1.sublot_mng_typ.eq(value(MAC_SUBLOT_MNG_TYP.STK.value())))
								.then(value(MAC_STR.NULL_VAL.value()))
							.otherwise(S0_T1.sublot_no).as("lot_tbl_sublot_no"),
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.io_act_typ,
						S0_T1.io_typ,
						cases()
							.when(S0_T1.io_typ.eq(value(MSC_IO_TYP.GR.value())))
								.then(S0_T1.pack_unit_qty)
							.otherwise(value(0)).as("pack_unit_gr_qty"),
						cases()
							.when(S0_T1.io_typ.eq(value(MSC_IO_TYP.GI.value())))
								.then(S0_T1.pack_unit_qty)
							.otherwise(value(0)).as("pack_unit_gi_qty"),
						S0_T1.pack_unit_cd,
						cases()
							.when(S0_T1.io_typ.eq(value(MSC_IO_TYP.GR.value())))
								.then(S0_T1.base_unit_qty)
							.otherwise(value(0)).as("base_unit_gr_qty"),
						cases()
							.when(S0_T1.io_typ.eq(value(MSC_IO_TYP.GI.value())))
								.then(S0_T1.base_unit_qty)
							.otherwise(value(0)).as("base_unit_gi_qty"),
						S0_T1.base_unit_cd,
						cases()
							.when(S0_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.XFR_GI.value())))
								.then(S0_T1.gr_loc_cd)
							.when(S0_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.XFR_GR.value())))
								.then(S0_T1.gi_loc_cd)
							.when(S0_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.XFR_RTN_GI.value())))
								.then(S0_T1.gr_loc_cd)
							.when(S0_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.XFR_RTN_GR.value())))
								.then(S0_T1.gi_loc_cd)
							.when(
								S0_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.SHIP_OUT.value()))
								.and(
									S0_T1.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.XFR.value()),
										value(MAC_TRD_PTN_TYP.XFR_RTN.value())
									)
								)
							)
								.then(S0_T1.gr_loc_cd)
							.otherwise(nullValue()).as("xfr_loc_cd"),
						S0_M6.loc_nm.as("xfr_loc_nm"),
						S0_T1.rsn_cd,
						S0_T1.dlv_cd,
						S0_T1.tdlv_cd,
						S0_T1.cst_cd,
						S0_T1.sppl_cd,
						S0_T1.par_itm_cd,
						S0_T1.par_itm_sub1,
						S0_T1.par_itm_sub2,
						S0_T1.par_itm_sub3,
						nvl(
							S0_M24.itm_nm,
							S0_M2.itm_nm
						).as("par_itm_nm"),
						S0_T1.par_lot_no,
						S0_T1.par_sublot_no,
						S0_T1.mfg_inst_no,
						S0_T1.slo_no,
						S0_T1.po_no,
						S0_T1.act_no,
						S0_T1.act_d_no,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.trn_typ,
						S0_T3.bp_lot_no,
						S0_T3.first_gr_dt,
						S0_T3.vld_dt,
						S0_T3.lmt_dt
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_W1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_W1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_W1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_W1.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_W1.lot_no))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.itm_cd.eq(S0_T3.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T3.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_T3.lot_no))
								.and(S0_T1.sublot_no.eq(S0_T3.sublot_no))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.par_itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.par_itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.par_itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.par_itm_sub3.eq(S0_M2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								bracket(
									S0_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.XFR_GI.value()))
									.and(S0_T1.gr_loc_cd.eq(S0_M6.loc_cd))
								)
								.or(
									S0_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.XFR_GR.value()))
									.and(S0_T1.gi_loc_cd.eq(S0_M6.loc_cd))
								)
								.or(
									S0_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.XFR_RTN_GI.value()))
									.and(S0_T1.gr_loc_cd.eq(S0_M6.loc_cd))
								)
								.or(
									S0_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.XFR_RTN_GR.value()))
									.and(S0_T1.gi_loc_cd.eq(S0_M6.loc_cd))
								)
								.or(
									S0_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.SHIP_OUT.value()))
									.and(
										S0_T1.trd_ptn_typ.in(
											value(MAC_TRD_PTN_TYP.XFR.value()),
											value(MAC_TRD_PTN_TYP.XFR_RTN.value())
										)
									)
									.and(S0_T1.gr_loc_cd.eq(S0_M6.loc_cd))
								)
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T1.gi_loc_cd.eq(S0_M21.loc_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T1.gr_loc_cd.eq(S0_M22.loc_cd)
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M23.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M23.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M23.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M23.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M23.sno1))
								.and(S0_T1.sno2.eq(S0_M23.sno2))
								.and(S0_T1.sno3.eq(S0_M23.sno3))
								.and(S0_T1.sno4.eq(S0_M23.sno4))
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T1.par_itm_cd.eq(S0_M24.itm_cd)
								.and(S0_T1.par_itm_sub1.eq(S0_M24.itm_sub1))
								.and(S0_T1.par_itm_sub2.eq(S0_M24.itm_sub2))
								.and(S0_T1.par_itm_sub3.eq(S0_M24.itm_sub3))
								.and(S0_T1.par_sno1.eq(S0_M24.sno1))
								.and(S0_T1.par_sno2.eq(S0_M24.sno2))
								.and(S0_T1.par_sno3.eq(S0_M24.sno3))
								.and(S0_T1.par_sno4.eq(S0_M24.sno4))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M99.loc_cd)
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.base_unit_qty.neq(value(0)))
						.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						.and(
							S0_T1.io_act_typ.in(
								value(MSC_IO_ACT_TYP.MFG.value()),
								value(MSC_IO_ACT_TYP.BYMFG.value()),
								value(MSC_IO_ACT_TYP.INPT.value()),
								value(MSC_IO_ACT_TYP.LOSS.value()),
								value(MSC_IO_ACT_TYP.PURC_RTN_GI.value()),
								value(MSC_IO_ACT_TYP.ONR_RCV_RET_GI.value()),
								value(MSC_IO_ACT_TYP.XPNS_PURC_RTN_GI.value()),
								value(MSC_IO_ACT_TYP.SHIP_OUT.value()),
								value(MSC_IO_ACT_TYP.SHIP_RTN_GR.value()),
								value(MSC_IO_ACT_TYP.XFR_GI.value()),
								value(MSC_IO_ACT_TYP.XFR_GR.value()),
								value(MSC_IO_ACT_TYP.XFR_RTN_GI.value()),
								value(MSC_IO_ACT_TYP.XFR_RTN_GR.value()),
								value(MSC_IO_ACT_TYP.ARR.value()),
								value(MSC_IO_ACT_TYP.ARR_RTN.value()),
								value(MSC_IO_ACT_TYP.ACXFR_GI.value()),
								value(MSC_IO_ACT_TYP.ACXFR_GR.value()),
								value(MSC_IO_ACT_TYP.SCRP.value()),
								value(MSC_IO_ACT_TYP.XFR_ITM_GI.value()),
								value(MSC_IO_ACT_TYP.XFR_ITM_GR.value()),
								value(MSC_IO_ACT_TYP.XFR_LOT_SNO_GI.value()),
								value(MSC_IO_ACT_TYP.XFR_LOT_SNO_GR.value()),
								value(MSC_IO_ACT_TYP.STK_ADJST_GI.value()),
								value(MSC_IO_ACT_TYP.STK_ADJST_GR.value()),
								value(MSC_IO_ACT_TYP.INSP_SMPL_GI.value())
							)
						)
						.and(
							cases()
								.when(
									S0_T1.io_act_typ.in(
										value(MSC_IO_ACT_TYP.ACXFR_GI.value()),
										value(MSC_IO_ACT_TYP.ACXFR_GR.value())
									)
									.and(S0_T1.trn_typ.eq(value(MSC_TRN_TYP.SLS.value())))
								)
									.then(value(false))
								.when(
									S0_T1.io_act_typ.in(
										value(MSC_IO_ACT_TYP.XFR_GI.value()),
										value(MSC_IO_ACT_TYP.XFR_RTN_GI.value())
									)
									.and(S0_T1.trn_typ.eq(value(MSC_TRN_TYP.IV_SHIP.value())))
								)
									.then(value(false))
								.when(
									S0_T1.io_act_typ.in(
										value(MSC_IO_ACT_TYP.SHIP_OUT.value())
									)
									.and(S0_T1.trn_typ.eq(value(MSC_TRN_TYP.IV.value())))
								)
									.then(value(false))
								.otherwise(value(true)).eq(value(true))
						)
						.and(
							cases()
								.when(S0_M1.sublot_mng_typ.eq(value(MAC_SUBLOT_MNG_TYP.STK.value())))
									.then(S0_T1.sublot_no)
								.otherwise(S0_W1.sublot_no).eq(S0_T1.sublot_no)
						)
						.cutoff$and(
							bind("srch_site_xfr").eq(value(true))
							.and(
								S0_M21.site_cd.neq(S0_M22.site_cd)
								.or(S0_M21.site_cd.isNull())
								.or(S0_M22.site_cd.isNull())
							)
						)
						.cutoff$and(
							bind("srch_sppl_xfr").eq(value(true))
							.and(
								bracket(
									S0_M21.site_cd.neq(S0_M22.site_cd)
									.or(S0_M21.site_cd.isNull())
									.or(S0_M22.site_cd.isNull())
								)
								.or(
									S0_M21.sppl_cd.neq(S0_M22.sppl_cd)
									.or(
										S0_M21.sppl_cd.isNotNull()
										.and(S0_M22.sppl_cd.isNull())
									)
									.or(
										S0_M21.sppl_cd.isNull()
										.and(S0_M22.sppl_cd.isNotNull())
									)
								)
							)
						)
						.cutoff$and(
							bind("srch_loc_xfr").eq(value(true))
							.and(
								S0_T1.gi_loc_cd.neq(S0_T1.gr_loc_cd)
								.or(S0_T1.gi_loc_cd.isNull())
								.or(S0_T1.gr_loc_cd.isNull())
							)
						)
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.str_ln_cd.like(bind("str_ln_cd")))
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("site_nm", "loc_nm", "site_cd"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.loc_cd.eq(S0_M4.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.loc_nm.like(bind("loc_nm"))).cutoff$and(S0_M4.site_cd.like(bind("site_cd")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M4.site_cd.eq(S0_M8.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.site_nm.like(bind("site_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T1.loc_cd.eq(S0_M9.loc_cd).and(S0_T1.str_ln_cd.eq(S0_M9.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M9.str_ln_nm.like(bind("str_ln_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_sppl_cd", m.sppl_cd());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("loc_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("dlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("tdlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pack_unit_nm", m.unit_nm());
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
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("pack_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBEL0100_MSW_LOT_KEY_Query_I01
	 */
	static MCQueryPlan MSBEL0100_MSW_LOT_KEY_I01() {
		MSW_LOT_KEY_R S0 = MSW_LOT_KEY_R.create();
		MST_IO_ACT_R S1_T1 = MST_IO_ACT_R.create("T1");
		MST_LOT_R S1_T2 = MST_LOT_R.create("T2");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S1_M2 = MAM_ITM_TYP_D_R.create("M2");
		MAM_SUNDRY_ITM_R S1_M3 = MAM_SUNDRY_ITM_R.create("M3");
		MAM_LOC_R S1_M4 = MAM_LOC_R.create("M4");
		MAM_SITE_R S1_M5 = MAM_SITE_R.create("M5");
		MAM_STR_LN_R S1_M6 = MAM_STR_LN_R.create("M6");
		MAVM_RD_LOC_R S1_M99 = MAVM_RD_LOC_R.create("M99");
		MAM_ITM_GRP_R S1MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S1MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S1MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S1MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S1MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S1MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S1MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S1MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S1MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S1MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0100_MSW_LOT_KEY_Query_I01")
					.insert(S0)
					.columns(
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.lot_no,
						S0.sublot_no
					)
					.query(
						subQuery()
						.selectDistinct(
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.lot_no,
							S1_T1.sublot_no
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.itm_cd.eq(S1_T2.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_T2.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_T2.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_T2.itm_sub3))
									.and(S1_T1.lot_no.eq(S1_T2.lot_no))
								)
							)
							.innerJoin(S1_M1).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M1.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_M1.itm_typ.eq(S1_M2.itm_typ)
									.and(S1_M1.itm_typ_d_cd.eq(S1_M2.itm_typ_d_cd))
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M3.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M3.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M3.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M3.itm_sub3))
									.and(S1_T1.sno1.eq(S1_M3.sno1))
									.and(S1_T1.sno2.eq(S1_M3.sno2))
									.and(S1_T1.sno3.eq(S1_M3.sno3))
									.and(S1_T1.sno4.eq(S1_M3.sno4))
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T1.loc_cd.eq(S1_M4.loc_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_M4.site_cd.eq(S1_M5.site_cd)
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_T1.loc_cd.eq(S1_M6.loc_cd)
									.and(S1_T1.str_ln_cd.eq(S1_M6.str_ln_cd))
								)
							)
							.innerJoin(S1_M99).on(
								bracket(
									S1_T1.loc_cd.eq(S1_M99.loc_cd)
								)
							)
							.addDynamicView(DS0C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.base_unit_qty.neq(value(0)))
							.and(S1_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							.and(
								S1_T1.io_act_typ.in(
									value(MSC_IO_ACT_TYP.MFG.value()),
									value(MSC_IO_ACT_TYP.BYMFG.value()),
									value(MSC_IO_ACT_TYP.INPT.value()),
									value(MSC_IO_ACT_TYP.LOSS.value()),
									value(MSC_IO_ACT_TYP.PURC_RTN_GI.value()),
									value(MSC_IO_ACT_TYP.ONR_RCV_RET_GI.value()),
									value(MSC_IO_ACT_TYP.XPNS_PURC_RTN_GI.value()),
									value(MSC_IO_ACT_TYP.SHIP_OUT.value()),
									value(MSC_IO_ACT_TYP.SHIP_RTN_GR.value()),
									value(MSC_IO_ACT_TYP.XFR_GI.value()),
									value(MSC_IO_ACT_TYP.XFR_GR.value()),
									value(MSC_IO_ACT_TYP.XFR_RTN_GI.value()),
									value(MSC_IO_ACT_TYP.XFR_RTN_GR.value()),
									value(MSC_IO_ACT_TYP.ARR.value()),
									value(MSC_IO_ACT_TYP.ARR_RTN.value()),
									value(MSC_IO_ACT_TYP.ACXFR_GI.value()),
									value(MSC_IO_ACT_TYP.ACXFR_GR.value()),
									value(MSC_IO_ACT_TYP.SCRP.value()),
									value(MSC_IO_ACT_TYP.XFR_ITM_GI.value()),
									value(MSC_IO_ACT_TYP.XFR_ITM_GR.value()),
									value(MSC_IO_ACT_TYP.XFR_LOT_SNO_GI.value()),
									value(MSC_IO_ACT_TYP.XFR_LOT_SNO_GR.value()),
									value(MSC_IO_ACT_TYP.STK_ADJST_GI.value()),
									value(MSC_IO_ACT_TYP.STK_ADJST_GR.value()),
									value(MSC_IO_ACT_TYP.INSP_SMPL_GI.value())
								)
							)
							.and(S1_T1.act_tm.gte(bind("act_dt_fr")))
							.and(S1_T1.act_tm.lte(bind("act_dt_to")))
							.and(
								cases()
									.when(S1_M1.sublot_mng_typ.eq(value(MAC_SUBLOT_MNG_TYP.STK.value())))
										.then(value(MAC_STR.NULL_VAL.value()))
									.otherwise(S1_T1.sublot_no).eq(S1_T2.sublot_no)
							)
							.cutoff$and(S1_M1.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								nvl(
									S1_M3.itm_nm,
									S1_M1.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_T2.ver_no.like(bind("ver_no")))
							.cutoff$and(S1_T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T2.sublot_no.like(bind("lot_tbl_sublot_no")))
							.cutoff$and(S1_T1.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_M4.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_T1.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_M6.str_ln_nm.like(bind("str_ln_nm")))
							.cutoff$and(S1_M4.site_cd.like(bind("site_cd")))
							.cutoff$and(S1_M5.site_nm.like(bind("site_nm")))
							.addDynamicPredicate(DS0C_ITM_GRP)
						)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd1.as("itm_grp_cd1"), S1MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM1).on(S1_M1.itm_grp_cd1.eq(S1MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM1.itm_grp_cd.like(bind("itm_grp_cd1"))).cutoff$and(S1MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd2.as("itm_grp_cd2"), S1MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM2).on(S1_M1.itm_grp_cd2.eq(S1MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM2.itm_grp_cd.like(bind("itm_grp_cd2"))).cutoff$and(S1MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd3.as("itm_grp_cd3"), S1MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM3).on(S1_M1.itm_grp_cd3.eq(S1MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM3.itm_grp_cd.like(bind("itm_grp_cd3"))).cutoff$and(S1MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd4.as("itm_grp_cd4"), S1MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM4).on(S1_M1.itm_grp_cd4.eq(S1MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM4.itm_grp_cd.like(bind("itm_grp_cd4"))).cutoff$and(S1MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd5.as("itm_grp_cd5"), S1MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM5).on(S1_M1.itm_grp_cd5.eq(S1MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM5.itm_grp_cd.like(bind("itm_grp_cd5"))).cutoff$and(S1MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd6.as("itm_grp_cd6"), S1MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM6).on(S1_M1.itm_grp_cd6.eq(S1MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM6.itm_grp_cd.like(bind("itm_grp_cd6"))).cutoff$and(S1MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd7.as("itm_grp_cd7"), S1MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM7).on(S1_M1.itm_grp_cd7.eq(S1MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM7.itm_grp_cd.like(bind("itm_grp_cd7"))).cutoff$and(S1MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd8.as("itm_grp_cd8"), S1MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM8).on(S1_M1.itm_grp_cd8.eq(S1MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM8.itm_grp_cd.like(bind("itm_grp_cd8"))).cutoff$and(S1MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd9.as("itm_grp_cd9"), S1MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM9).on(S1_M1.itm_grp_cd9.eq(S1MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM9.itm_grp_cd.like(bind("itm_grp_cd9"))).cutoff$and(S1MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S1_M1.itm_grp_cd10.as("itm_grp_cd10"), S1MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S1MM10).on(S1_M1.itm_grp_cd10.eq(S1MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S1MM10.itm_grp_cd.like(bind("itm_grp_cd10"))).cutoff$and(S1MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
}