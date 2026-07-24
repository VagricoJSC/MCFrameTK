package mcframe.serverMSBC.MSBCL0020;

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
	 * -- MSBCL0020_MAM_MPS_ITM_Query_S01
	 */
	static MCQueryPlan MSBCL0020_MAM_MPS_ITM_S01() {
		MAM_MPS_ITM_R S0_T1 = MAM_MPS_ITM_R.create("T1");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		MAM_MPS_GRP_R S0_T2 = MAM_MPS_GRP_R.create("T2");
		MAM_ITM_R S0_T3 = MAM_ITM_R.create("T3");
		MAM_LOC_R S0_T4 = MAM_LOC_R.create("T4");
		MAM_WG_R S0_T5 = MAM_WG_R.create("T5");
		MAM_SITE_R S0_T6 = MAM_SITE_R.create("T6");
		MAM_LOC_GRP_R S0_T7 = MAM_LOC_GRP_R.create("T7");
		MAM_ITM_TYP_D_R S0_T8 = MAM_ITM_TYP_D_R.create("T8");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0020_MAM_MPS_ITM_Query_S01")
					.mainQuery()
					.select(
						S0_T1.mps_grp_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T3.itm_nm,
						S0_T1.strg_loc_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.rqst_loc_cd,
						S0_T3.unit_cd,
						S0_T3.dec_place,
						S0_T3.sno1_mng_typ,
						S0_T3.sno2_mng_typ,
						S0_T3.sno3_mng_typ,
						S0_T3.sno4_mng_typ,
						S0_T3.sno1_num_typ,
						S0_T3.sno2_num_typ,
						S0_T3.sno3_num_typ,
						S0_T3.sno4_num_typ,
						S0_T3.rqmt_sno1_flg,
						S0_T3.rqmt_sno2_flg,
						S0_T3.rqmt_sno3_flg,
						S0_T3.rqmt_sno4_flg,
						S0_T1.del_flg.as("mst_del_flg"),
						// this field is appended by sql coverter.
						S0_T1.wg_cd.as("join_wg_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_DAC.loc_cd)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_T3.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T3.itm_sub3))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.mps_grp_cd.like(bind("mps_grp_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T3.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T3.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_T3.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("mps_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.mps_grp_cd.eq(S0_T2.mps_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T2.mps_grp_nm.like(bind("mps_grp_nm")))),
				when(boundOr("site_nm", "strg_loc_grp_nm", "strg_loc_nm", "site_cd", "strg_loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T1.strg_loc_cd.eq(S0_T4.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_T4.loc_nm.like(bind("strg_loc_nm"))).cutoff$and(S0_T4.site_cd.like(bind("site_cd"))).cutoff$and(S0_T4.loc_grp_cd.like(bind("strg_loc_grp_cd")))),
				when(boundOr("wg_cm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T1.wg_cd.eq(S0_T5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_T5.wg_nm.like(bind("wg_cm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_T6).on(bracket(S0_T4.site_cd.eq(S0_T6.site_cd))))
					.predicate(p -> p.cutoff$and(S0_T6.site_nm.like(bind("site_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T7).on(bracket(S0_T4.loc_grp_cd.eq(S0_T7.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T7.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_T8).on(bracket(S0_T8.itm_typ.eq(S0_T3.itm_typ).and(S0_T8.itm_typ_d_cd.eq(S0_T3.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_T8.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_T3.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_T3.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_T3.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_T3.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_T3.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_T3.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_T3.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_T3.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_T3.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_T3.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_MPS_GRP_R.class, r -> toCondition(
							r.getStringNE("mps_grp_cd")
						))
						.addSelect(m -> toArray(
							m.mps_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mps_grp_nm", m.mps_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("wg_cd", m.wg_cd());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("join_wg_cd_")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0020_MST_PRCD_RQMT_Query_S01
	 */
	static MCQueryPlan MSBCL0020_MST_PRCD_RQMT_S01() {
		MST_PRCD_RQMT_R S0_T1 = MST_PRCD_RQMT_R.create("T1");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		MAM_ITM_R S0_T2 = MAM_ITM_R.create("T2");
		MAM_SUNDRY_ITM_R S0_T16 = MAM_SUNDRY_ITM_R.create("T16");
		MAM_LOC_R S0_T8 = MAM_LOC_R.create("T8");
		MAM_WG_R S0_T9 = MAM_WG_R.create("T9");
		MAM_LOC_GRP_R S0_T10 = MAM_LOC_GRP_R.create("T10");
		MAM_SITE_R S0_T11 = MAM_SITE_R.create("T11");
		MAM_MPS_ITM_R S0_T12 = MAM_MPS_ITM_R.create("T12");
		MAM_MPS_GRP_R S0_T13 = MAM_MPS_GRP_R.create("T13");
		MAM_ITM_TYP_D_R S0_T14 = MAM_ITM_TYP_D_R.create("T14");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0020_MST_PRCD_RQMT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.rqmt_no,
						value(MSC_MRP_TYP.PRCD.value()).as("mrp_typ"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T16.itm_nm,
							S0_T2.itm_nm
						).as("itm_nm"),
						S0_T1.due_dt,
						S0_T1.due_dt.as("old_due_dt"),
						S0_T1.rqmt_qty,
						S0_T2.unit_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T2.sno1_mng_typ,
						S0_T2.sno2_mng_typ,
						S0_T2.sno3_mng_typ,
						S0_T2.sno4_mng_typ,
						S0_T2.sno1_num_typ,
						S0_T2.sno2_num_typ,
						S0_T2.sno3_num_typ,
						S0_T2.sno4_num_typ,
						S0_T2.rqmt_sno1_flg,
						S0_T2.rqmt_sno2_flg,
						S0_T2.rqmt_sno3_flg,
						S0_T2.rqmt_sno4_flg,
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.rqst_loc_cd,
						S0_T1.fix_flg,
						S0_T1.rqmt_gnrt_typ,
						S0_T1.rqmt_typ,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						S0_T12.mps_grp_cd,
						S0_T2.itm_typ,
						S0_T2.itm_typ_d_cd,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_DAC.loc_cd)
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_T2.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_T16).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_T16.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_T16.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T16.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T16.itm_sub3))
								.and(S0_T1.sno1.eq(S0_T16.sno1))
								.and(S0_T1.sno2.eq(S0_T16.sno2))
								.and(S0_T1.sno3.eq(S0_T16.sno3))
								.and(S0_T1.sno4.eq(S0_T16.sno4))
							)
						)
						.leftOuterJoin(S0_T12).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_T12.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_T12.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T12.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T12.itm_sub3))
								.and(S0_T1.wg_cd.eq(S0_T12.wg_cd))
								.and(S0_T1.strg_loc_cd.eq(S0_T12.strg_loc_cd))
								.and(S0_T1.mfg_loc_cd.eq(S0_T12.mfg_loc_cd))
								.and(S0_T1.sppl_cd.eq(S0_T12.sppl_cd))
								.and(S0_T1.rqst_loc_cd.eq(S0_T12.rqst_loc_cd))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.due_dt.gte(bind("due_dt_fr")))
						.cutoff$and(S0_T1.due_dt.lte(bind("due_dt_to")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T16.itm_nm,
								S0_T2.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("strg_loc_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T12.mps_grp_cd.like(bind("mps_grp_cd")))
						.cutoff$and(S0_T2.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(S0_T1.rqmt_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("strg_loc_grp_nm", "site_nm", "strg_loc_nm", "site_cd", "strg_loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_T8).on(bracket(S0_T1.strg_loc_cd.eq(S0_T8.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_T8.loc_nm.like(bind("strg_loc_nm"))).cutoff$and(S0_T8.site_cd.like(bind("site_cd"))).cutoff$and(S0_T8.loc_grp_cd.like(bind("strg_loc_grp_cd")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_T9).on(bracket(S0_T1.wg_cd.eq(S0_T9.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_T9.wg_nm.like(bind("wg_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T10).on(bracket(S0_T8.loc_grp_cd.eq(S0_T10.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T10.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_T11).on(bracket(S0_T8.site_cd.eq(S0_T11.site_cd))))
					.predicate(p -> p.cutoff$and(S0_T11.site_nm.like(bind("site_nm")))),
				when(boundOr("mps_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T13).on(bracket(S0_T12.mps_grp_cd.eq(S0_T13.mps_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T13.mps_grp_nm.like(bind("mps_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_T14).on(bracket(S0_T14.itm_typ.eq(S0_T2.itm_typ).and(S0_T14.itm_typ_d_cd.eq(S0_T2.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_T14.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_T2.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_T2.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_T2.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_T2.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_T2.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_T2.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_T2.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_T2.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_T2.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_T2.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
							r.setNumberNE("dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_loc_nm", m.loc_nm());
							r.setStringNE("rqst_wg_cd", m.wg_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setStringNE("strg_loc_grp_cd", m.loc_grp_cd());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("strg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_grp_nm", m.loc_grp_nm());
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
						.add(MAM_MPS_GRP_R.class, r -> toCondition(
							r.getStringNE("mps_grp_cd")
						))
						.addSelect(m -> toArray(
							m.mps_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mps_grp_nm", m.mps_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0020_MST_PRCD_RQMT_Query_S02
	 */
	static MCQueryPlan MSBCL0020_MST_PRCD_RQMT_S02() {
		MST_PRCD_RQMT_R S0_T1 = MST_PRCD_RQMT_R.create("T1");
		MAM_MPS_ITM_R S0_T2 = MAM_MPS_ITM_R.create("T2");
		MAM_ITM_R S0_T3 = MAM_ITM_R.create("T3");
		MAM_LOC_R S0_T4 = MAM_LOC_R.create("T4");
		MAM_SITE_R S0_T5 = MAM_SITE_R.create("T5");
		MAM_LOC_GRP_R S0_T6 = MAM_LOC_GRP_R.create("T6");
		MAM_WG_R S0_T7 = MAM_WG_R.create("T7");
		MAM_MPS_GRP_R S0_T8 = MAM_MPS_GRP_R.create("T8");
		MAM_ITM_TYP_D_R S0_T9 = MAM_ITM_TYP_D_R.create("T9");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0020_MST_PRCD_RQMT_Query_S02")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.strg_loc_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.rqst_loc_cd,
						S0_T1.due_dt,
						sum(S0_T1.rqmt_qty).as("rqmt_qty")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_T2.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.wg_cd.eq(S0_T2.wg_cd))
								.and(S0_T1.strg_loc_cd.eq(S0_T2.strg_loc_cd))
								.and(S0_T1.mfg_loc_cd.eq(S0_T2.mfg_loc_cd))
								.and(S0_T1.sppl_cd.eq(S0_T2.sppl_cd))
								.and(S0_T1.rqst_loc_cd.eq(S0_T2.rqst_loc_cd))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_T3.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T3.itm_sub3))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_DAC.loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.due_dt.gte(bind("due_dt_fr")))
						.cutoff$and(S0_T1.due_dt.lte(bind("due_dt_to")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T3.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("strg_loc_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T2.mps_grp_cd.like(bind("mps_grp_cd")))
						.cutoff$and(S0_T3.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.groupBy(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.strg_loc_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.rqst_loc_cd,
						S0_T1.due_dt
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("site_nm", "strg_loc_grp_nm", "strg_loc_nm", "site_cd", "strg_loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T1.strg_loc_cd.eq(S0_T4.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_T4.loc_nm.like(bind("strg_loc_nm"))).cutoff$and(S0_T4.site_cd.like(bind("site_cd"))).cutoff$and(S0_T4.loc_grp_cd.like(bind("strg_loc_grp_cd")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T4.site_cd.eq(S0_T5.site_cd))))
					.predicate(p -> p.cutoff$and(S0_T5.site_nm.like(bind("site_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T6).on(bracket(S0_T4.loc_grp_cd.eq(S0_T6.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T6.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_T7).on(bracket(S0_T1.wg_cd.eq(S0_T7.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_T7.wg_nm.like(bind("wg_nm")))),
				when(boundOr("mps_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T8).on(bracket(S0_T2.mps_grp_cd.eq(S0_T8.mps_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T8.mps_grp_nm.like(bind("mps_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_T9).on(bracket(S0_T9.itm_typ.eq(S0_T3.itm_typ).and(S0_T9.itm_typ_d_cd.eq(S0_T3.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_T9.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_T3.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_T3.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_T3.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_T3.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_T3.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_T3.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_T3.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_T3.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_T3.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_T3.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_site_cd_", m.site_cd());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0020_MST_RQMT_Query_S01
	 */
	static MCQueryPlan MSBCL0020_MST_RQMT_S01() {
		MST_RQMT_R S0_T1 = MST_RQMT_R.create("T1");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		MAM_ITM_R S0_T2 = MAM_ITM_R.create("T2");
		MAM_SUNDRY_ITM_R S0_T16 = MAM_SUNDRY_ITM_R.create("T16");
		MAM_LOC_R S0_T8 = MAM_LOC_R.create("T8");
		MAM_WG_R S0_T9 = MAM_WG_R.create("T9");
		MAM_LOC_GRP_R S0_T10 = MAM_LOC_GRP_R.create("T10");
		MAM_SITE_R S0_T11 = MAM_SITE_R.create("T11");
		MAM_MPS_ITM_R S0_T12 = MAM_MPS_ITM_R.create("T12");
		MAM_MPS_GRP_R S0_T13 = MAM_MPS_GRP_R.create("T13");
		MAM_ITM_TYP_D_R S0_T14 = MAM_ITM_TYP_D_R.create("T14");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0020_MST_RQMT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.rqmt_no,
						value(MSC_MRP_TYP.MRP.value()).as("mrp_typ"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T16.itm_nm,
							S0_T2.itm_nm
						).as("itm_nm"),
						S0_T1.due_dt,
						S0_T1.due_dt.as("old_due_dt"),
						S0_T1.rqmt_qty,
						S0_T2.unit_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T2.sno1_mng_typ,
						S0_T2.sno2_mng_typ,
						S0_T2.sno3_mng_typ,
						S0_T2.sno4_mng_typ,
						S0_T2.sno1_num_typ,
						S0_T2.sno2_num_typ,
						S0_T2.sno3_num_typ,
						S0_T2.sno4_num_typ,
						S0_T2.rqmt_sno1_flg,
						S0_T2.rqmt_sno2_flg,
						S0_T2.rqmt_sno3_flg,
						S0_T2.rqmt_sno4_flg,
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.rqst_loc_cd,
						S0_T1.fix_flg,
						S0_T1.rqmt_gnrt_typ,
						S0_T1.rqmt_typ,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						S0_T12.mps_grp_cd,
						S0_T2.itm_typ,
						S0_T2.itm_typ_d_cd,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_DAC.loc_cd)
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_T2.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_T16).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_T16.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_T16.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T16.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T16.itm_sub3))
								.and(S0_T1.sno1.eq(S0_T16.sno1))
								.and(S0_T1.sno2.eq(S0_T16.sno2))
								.and(S0_T1.sno3.eq(S0_T16.sno3))
								.and(S0_T1.sno4.eq(S0_T16.sno4))
							)
						)
						.leftOuterJoin(S0_T12).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_T12.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_T12.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T12.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T12.itm_sub3))
								.and(S0_T1.wg_cd.eq(S0_T12.wg_cd))
								.and(S0_T1.strg_loc_cd.eq(S0_T12.strg_loc_cd))
								.and(S0_T1.mfg_loc_cd.eq(S0_T12.mfg_loc_cd))
								.and(S0_T1.sppl_cd.eq(S0_T12.sppl_cd))
								.and(S0_T1.rqst_loc_cd.eq(S0_T12.rqst_loc_cd))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.due_dt.gte(bind("due_dt_fr")))
						.cutoff$and(S0_T1.due_dt.lte(bind("due_dt_to")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T16.itm_nm,
								S0_T2.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("strg_loc_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T12.mps_grp_cd.like(bind("mps_grp_cd")))
						.cutoff$and(S0_T2.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(S0_T1.rqmt_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("strg_loc_grp_nm", "site_nm", "strg_loc_nm", "site_cd", "strg_loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_T8).on(bracket(S0_T1.strg_loc_cd.eq(S0_T8.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_T8.loc_nm.like(bind("strg_loc_nm"))).cutoff$and(S0_T8.site_cd.like(bind("site_cd"))).cutoff$and(S0_T8.loc_grp_cd.like(bind("strg_loc_grp_cd")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_T9).on(bracket(S0_T1.wg_cd.eq(S0_T9.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_T9.wg_nm.like(bind("wg_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T10).on(bracket(S0_T8.loc_grp_cd.eq(S0_T10.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T10.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_T11).on(bracket(S0_T8.site_cd.eq(S0_T11.site_cd))))
					.predicate(p -> p.cutoff$and(S0_T11.site_nm.like(bind("site_nm")))),
				when(boundOr("mps_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T13).on(bracket(S0_T12.mps_grp_cd.eq(S0_T13.mps_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T13.mps_grp_nm.like(bind("mps_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_T14).on(bracket(S0_T14.itm_typ.eq(S0_T2.itm_typ).and(S0_T14.itm_typ_d_cd.eq(S0_T2.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_T14.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_T2.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_T2.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_T2.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_T2.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_T2.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_T2.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_T2.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_T2.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_T2.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_T2.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_T2.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T2.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
							r.setNumberNE("dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_loc_nm", m.loc_nm());
							r.setStringNE("rqst_wg_cd", m.wg_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setStringNE("strg_loc_grp_cd", m.loc_grp_cd());
							r.setStringNE("site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("strg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_grp_nm", m.loc_grp_nm());
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
						.add(MAM_MPS_GRP_R.class, r -> toCondition(
							r.getStringNE("mps_grp_cd")
						))
						.addSelect(m -> toArray(
							m.mps_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mps_grp_nm", m.mps_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0020_MST_RQMT_Query_S02
	 */
	static MCQueryPlan MSBCL0020_MST_RQMT_S02() {
		MST_RQMT_R S0_T1 = MST_RQMT_R.create("T1");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		MAM_MPS_ITM_R S0_T2 = MAM_MPS_ITM_R.create("T2");
		MAM_ITM_R S0_T3 = MAM_ITM_R.create("T3");
		MAM_LOC_R S0_T4 = MAM_LOC_R.create("T4");
		MAM_SITE_R S0_T5 = MAM_SITE_R.create("T5");
		MAM_LOC_GRP_R S0_T6 = MAM_LOC_GRP_R.create("T6");
		MAM_WG_R S0_T7 = MAM_WG_R.create("T7");
		MAM_MPS_GRP_R S0_T8 = MAM_MPS_GRP_R.create("T8");
		MAM_ITM_TYP_D_R S0_T9 = MAM_ITM_TYP_D_R.create("T9");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0020_MST_RQMT_Query_S02")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.strg_loc_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.rqst_loc_cd,
						S0_T1.due_dt,
						sum(S0_T1.rqmt_qty).as("rqmt_qty")
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_DAC.loc_cd)
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_T2.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.wg_cd.eq(S0_T2.wg_cd))
								.and(S0_T1.strg_loc_cd.eq(S0_T2.strg_loc_cd))
								.and(S0_T1.mfg_loc_cd.eq(S0_T2.mfg_loc_cd))
								.and(S0_T1.sppl_cd.eq(S0_T2.sppl_cd))
								.and(S0_T1.rqst_loc_cd.eq(S0_T2.rqst_loc_cd))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_T3.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T3.itm_sub3))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.due_dt.gte(bind("due_dt_fr")))
						.cutoff$and(S0_T1.due_dt.lte(bind("due_dt_to")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T3.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("strg_loc_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T2.mps_grp_cd.like(bind("mps_grp_cd")))
						.cutoff$and(S0_T3.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.groupBy(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.strg_loc_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.rqst_loc_cd,
						S0_T1.due_dt
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("site_nm", "strg_loc_grp_nm", "strg_loc_nm", "site_cd", "strg_loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T1.strg_loc_cd.eq(S0_T4.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_T4.loc_nm.like(bind("strg_loc_nm"))).cutoff$and(S0_T4.site_cd.like(bind("site_cd"))).cutoff$and(S0_T4.loc_grp_cd.like(bind("strg_loc_grp_cd")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T4.site_cd.eq(S0_T5.site_cd))))
					.predicate(p -> p.cutoff$and(S0_T5.site_nm.like(bind("site_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T6).on(bracket(S0_T4.loc_grp_cd.eq(S0_T6.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T6.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_T7).on(bracket(S0_T1.wg_cd.eq(S0_T7.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_T7.wg_nm.like(bind("wg_nm")))),
				when(boundOr("mps_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T8).on(bracket(S0_T2.mps_grp_cd.eq(S0_T8.mps_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T8.mps_grp_nm.like(bind("mps_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_T9).on(bracket(S0_T9.itm_typ.eq(S0_T3.itm_typ).and(S0_T9.itm_typ_d_cd.eq(S0_T3.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_T9.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_T3.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_T3.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_T3.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_T3.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_T3.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_T3.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_T3.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_T3.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_T3.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_T3.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T3.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_site_cd_", m.site_cd());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0020_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBCL0020_MST_SHIP_SCHD_S01() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		MAM_LOC_R S0_T3 = MAM_LOC_R.create("T3");
		MAM_SITE_R S0_T4 = MAM_SITE_R.create("T4");
		MAM_LOC_GRP_R S0_T5 = MAM_LOC_GRP_R.create("T5");
		MAM_ITM_R S0_T6 = MAM_ITM_R.create("T6");
		MAM_ITM_TYP_D_R S0_T7 = MAM_ITM_TYP_D_R.create("T7");
		MAM_WG_R S0_T8 = MAM_WG_R.create("T8");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0020_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T2.loc_cd.as("strg_loc_cd"),
						trunc(
							S0_T1.ship_schd_tm,
							MCDateFmt.DD
						).as("due_dt"),
						sum(S0_T1.base_unit_qty).as("rqmt_qty")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.ship_pr_no.eq(S0_T2.ship_pr_no)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T2.loc_cd.eq(S0_DAC.loc_cd)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_T6.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_T6.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T6.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T6.itm_sub3))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							trunc(
								S0_T1.ship_schd_tm,
								MCDateFmt.DD
							).gte(bind("due_dt_fr"))
						)
						.and(
							trunc(
								S0_T1.ship_schd_tm,
								MCDateFmt.DD
							).lte(bind("due_dt_to"))
						)
						.and(S0_T1.abort_flg.eq(value(false)))
						.cutoff$and(S0_T2.loc_cd.like(bind("strg_loc_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T6.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T6.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_T6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.groupBy(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T2.loc_cd,
						trunc(
							S0_T1.ship_schd_tm,
							MCDateFmt.DD
						)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("site_nm", "strg_loc_grp_nm", "wg_nm", "strg_loc_nm", "site_cd", "strg_loc_grp_cd", "wg_cd"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T2.loc_cd.eq(S0_T3.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_T3.loc_nm.like(bind("strg_loc_nm"))).cutoff$and(S0_T3.site_cd.like(bind("site_cd"))).cutoff$and(S0_T3.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_T3.wg_cd.like(bind("wg_cd")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T3.site_cd.eq(S0_T4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_T4.site_nm.like(bind("site_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T3.loc_grp_cd.eq(S0_T5.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T5.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_T7).on(bracket(S0_T7.itm_typ.eq(S0_T6.itm_typ).and(S0_T7.itm_typ_d_cd.eq(S0_T6.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_T7.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_T8).on(bracket(S0_T3.wg_cd.eq(S0_T8.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_T8.wg_nm.like(bind("wg_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_T6.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_T6.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_T6.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_T6.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_T6.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_T6.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_T6.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_T6.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_T6.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_T6.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_T6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.site_cd,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_site_cd_", m.site_cd());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
							r.setStringNE("join_wg_cd_", m.wg_cd());
					})
				)
			);
	}
}