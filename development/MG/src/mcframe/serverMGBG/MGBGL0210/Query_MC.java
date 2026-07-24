package mcframe.serverMGBG.MGBGL0210;

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
import mcframe.commonMG.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMG.dbc.*;

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
import static mcframe.serverMG.dbc.MGFunction.*;

public class Query_MC {
	
	/**
	 * -- MGBGL0210_MGT_GP_ALC_Query_S01
	 */
	static MCQueryPlan MGBGL0210_MGT_GP_ALC_S01() {
		MGT_GP_ALC_R S0_T01 = MGT_GP_ALC_R.create("T01");
		MAM_CALC_CTG_R S0_M01 = MAM_CALC_CTG_R.create("M01");
		MAVM_RD_WG_R S0_M02 = MAVM_RD_WG_R.create("M02");
		MAM_TERM_R S0_M54 = MAM_TERM_R.create("M54");
		MAM_COST_DPT_R S0_M03 = MAM_COST_DPT_R.create("M03");
		MAM_ITM_R S0_M04 = MAM_ITM_R.create("M04");
		MAM_ITM_TYP_D_R S0_M05 = MAM_ITM_TYP_D_R.create("M05");
		MAM_ITM_JNL_R S0_M06 = MAM_ITM_JNL_R.create("M06");
		MAM_SUNDRY_ITM_R S0_M55 = MAM_SUNDRY_ITM_R.create("M55");
		MAM_LOC_R S0_M07 = MAM_LOC_R.create("M07");
		MAM_SITE_R S0_M51 = MAM_SITE_R.create("M51");
		MAM_OPER_R S0_M08 = MAM_OPER_R.create("M08");
		MAM_BP_R S0_M09 = MAM_BP_R.create("M09");
		MAM_CNTRY_R S0_M52 = MAM_CNTRY_R.create("M52");
		MAM_AREA_R S0_M53 = MAM_AREA_R.create("M53");
		MAM_COST_DPT_R S0_M10 = MAM_COST_DPT_R.create("M10");
		MAM_GP_ALC_R S0_M11 = MAM_GP_ALC_R.create("M11");
		MAM_ITM_GRP_R S0_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S0_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S0_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S0_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S0_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S0_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S0_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S0_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S0_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S0_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MAM_BP_GRP_R S0_BP_GRP1 = MAM_BP_GRP_R.create("BP_GRP1");
		MAM_BP_GRP_R S0_BP_GRP2 = MAM_BP_GRP_R.create("BP_GRP2");
		MAM_BP_GRP_R S0_BP_GRP3 = MAM_BP_GRP_R.create("BP_GRP3");
		MAM_BP_GRP_R S0_BP_GRP4 = MAM_BP_GRP_R.create("BP_GRP4");
		MAM_BP_GRP_R S0_BP_GRP5 = MAM_BP_GRP_R.create("BP_GRP5");
		MAM_BP_GRP_R S0_BP_GRP6 = MAM_BP_GRP_R.create("BP_GRP6");
		MAM_BP_GRP_R S0_BP_GRP7 = MAM_BP_GRP_R.create("BP_GRP7");
		MAM_BP_GRP_R S0_BP_GRP8 = MAM_BP_GRP_R.create("BP_GRP8");
		MAM_BP_GRP_R S0_BP_GRP9 = MAM_BP_GRP_R.create("BP_GRP9");
		MAM_BP_GRP_R S0_BP_GRP10 = MAM_BP_GRP_R.create("BP_GRP10");
		
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBGL0210_MGT_GP_ALC_Query_S01")
					.mainQuery()
					.select(
						S0_T01.calc_ctg_cd,
						S0_T01.wg_cd,
						S0_M02.wg_nm,
						S0_T01.ym,
						S0_T01.mng_dpt_cd,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						nvl(
							S0_M55.itm_nm,
							S0_M04.itm_nm
						).as("itm_nm"),
						S0_M04.itm_typ,
						S0_M04.itm_typ_d_cd,
						S0_M04.itm_jnl_cd,
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_T01.sno1,
						S0_T01.sno2,
						S0_T01.sno3,
						S0_T01.sno4,
						S0_T01.loc_cd,
						S0_T01.oper_cd,
						S0_T01.bp_cd,
						S0_T01.alc_dpt_cd,
						S0_T01.itm_mfg_inst_no,
						S0_T01.po_no,
						S0_T01.slo_no,
						S0_T01.iv_no,
						S0_T01.asst_typ,
						S0_T01.gp_alc_cd,
						S0_T01.qty,
						S0_T01.amt,
						S0_T01.alc_val1,
						S0_T01.alc_val2,
						S0_T01.alc_val3,
						S0_T01.alc_val4,
						S0_T01.alc_val5,
						S0_T01.rmrks,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_func_id,
						S0_T01.ins_ts,
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_func_id,
						S0_T01.upd_ts,
						S0_T01.upd_srv_req_no,
						S0_T01.upd_cntr,
						// this field is appended by sql coverter.
						S0_M54.term.as("join_term_")
					)
					.from(
						S0_T01
						.innerJoin(S0_M02).on(S0_T01.wg_cd.eq(S0_M02.wg_cd))
						.innerJoin(S0_M54).on(
							S0_T01.ym.gte(S0_M54.term)
							.and(S0_T01.ym.lt(S0_M54.term_end_ym))
						)
						.leftOuterJoin(S0_M04).on(
							S0_T01.itm_cd.eq(S0_M04.itm_cd)
							.and(S0_T01.itm_sub1.eq(S0_M04.itm_sub1))
							.and(S0_T01.itm_sub2.eq(S0_M04.itm_sub2))
							.and(S0_T01.itm_sub3.eq(S0_M04.itm_sub3))
						)
						.leftOuterJoin(S0_M55).on(
							S0_T01.itm_cd.eq(S0_M55.itm_cd)
							.and(S0_T01.itm_sub1.eq(S0_M55.itm_sub1))
							.and(S0_T01.itm_sub2.eq(S0_M55.itm_sub2))
							.and(S0_T01.itm_sub3.eq(S0_M55.itm_sub3))
							.and(S0_T01.sno1.eq(S0_M55.sno1))
							.and(S0_T01.sno2.eq(S0_M55.sno2))
							.and(S0_T01.sno3.eq(S0_M55.sno3))
							.and(S0_T01.sno4.eq(S0_M55.sno4))
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T01.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T01.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M02.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T01.ym.gte(bind("ym_fr")))
						.cutoff$and(S0_T01.ym.lte(bind("ym_to")))
						.cutoff$and(S0_T01.mng_dpt_cd.like(bind("mng_dpt_cd")))
						.cutoff$and(S0_M04.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M04.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M04.itm_jnl_cd.like(bind("itm_jnl_cd")))
						.cutoff$and(S0_T01.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T01.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T01.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T01.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M55.itm_nm,
								S0_M04.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T01.gp_alc_cd.like(bind("gp_alc_cd")))
						.cutoff$and(S0_T01.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T01.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T01.sno1.like(bind("sno1")))
						.cutoff$and(S0_T01.sno2.like(bind("sno2")))
						.cutoff$and(S0_T01.sno3.like(bind("sno3")))
						.cutoff$and(S0_T01.sno4.like(bind("sno4")))
						.cutoff$and(S0_T01.asst_typ.like(bind("asst_typ")))
						.cutoff$and(S0_T01.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T01.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T01.bp_cd.like(bind("bp_cd")))
						.cutoff$and(S0_T01.alc_dpt_cd.like(bind("alc_dpt_cd")))
						.cutoff$and(S0_T01.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T01.po_no.like(bind("po_no")))
						.cutoff$and(S0_T01.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T01.iv_no.like(bind("iv_no")))
						.cutoff$and(
							bind("no_po_no_flg_str").eq(value(true))
							.and(S0_T01.po_no.isNull())
						)
						.cutoff$and(
							bind("no_slo_no_flg_str").eq(value(true))
							.and(S0_T01.slo_no.isNull())
						)
						.cutoff$and(
							bind("no_iv_no_flg_str").eq(value(true))
							.and(S0_T01.iv_no.isNull())
						)
						.cutoff$and(S0_T01.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T01.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T01.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T01.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_BP_GRP)
					)
					.orderBy(
						S0_T01.calc_ctg_cd.asc(),
						S0_T01.wg_cd.asc(),
						S0_T01.ym.asc(),
						S0_M04.itm_typ.asc(),
						S0_M04.itm_typ_d_cd.asc(),
						S0_M04.itm_jnl_cd.asc(),
						S0_T01.itm_cd.asc(),
						S0_T01.itm_sub1.asc(),
						S0_T01.itm_sub2.asc(),
						S0_T01.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("calc_ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_M01).on(S0_T01.calc_ctg_cd.eq(S0_M01.calc_ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_M01.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("mng_dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_M03).on(S0_T01.mng_dpt_cd.eq(S0_M03.dpt_cd).and(S0_M54.term.eq(S0_M03.term))))
					.predicate(p -> p.cutoff$and(S0_M03.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M05).on(S0_M04.itm_typ.eq(S0_M05.itm_typ).and(S0_M04.itm_typ_d_cd.eq(S0_M05.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M05.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_M06).on(S0_M04.itm_jnl_cd.eq(S0_M06.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_M06.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("site_nm", "site_cd", "loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M07).on(S0_T01.loc_cd.eq(S0_M07.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M07.site_cd.like(bind("site_cd"))).cutoff$and(S0_M07.loc_nm.like(bind("loc_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M51).on(S0_M07.site_cd.eq(S0_M51.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M51.site_nm.like(bind("site_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M08).on(S0_T01.oper_cd.eq(S0_M08.oper_cd)))
					.predicate(p -> p.cutoff$and(S0_M08.oper_nm.like(bind("oper_nm")))),
				when(boundOr("cntry_nm", "area_nm", "bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10", "bp_nm", "cntry_cd", "area_cd"))
					.view(v -> v.leftOuterJoin(S0_M09).on(S0_T01.bp_cd.eq(S0_M09.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M09.bp_nm.like(bind("bp_nm"))).cutoff$and(S0_M09.cntry_cd.like(bind("cntry_cd"))).cutoff$and(S0_M09.area_cd.like(bind("area_cd")))),
				when(boundOr("cntry_nm"))
					.view(v -> v.leftOuterJoin(S0_M52).on(S0_M09.cntry_cd.eq(S0_M52.cntry_cd)))
					.predicate(p -> p.cutoff$and(S0_M52.cntry_nm.like(bind("cntry_nm")))),
				when(boundOr("area_nm"))
					.view(v -> v.leftOuterJoin(S0_M53).on(S0_M09.area_cd.eq(S0_M53.area_cd)))
					.predicate(p -> p.cutoff$and(S0_M53.area_nm.like(bind("area_nm")))),
				when(boundOr("alc_dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(S0_T01.alc_dpt_cd.eq(S0_M10.dpt_cd).and(S0_M54.term.eq(S0_M10.term))))
					.predicate(p -> p.cutoff$and(S0_M10.dpt_nm.like(bind("alc_dpt_nm")))),
				when(boundOr("gp_alc_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(S0_T01.gp_alc_cd.eq(S0_M11.gp_alc_cd)))
					.predicate(p -> p.cutoff$and(S0_M11.gp_alc_nm.like(bind("gp_alc_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_M04.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_M04.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_M04.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_M04.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_M04.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_M04.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_M04.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_M04.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_M04.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_M04.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M04.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("bp_grp_flg1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP1).on(S0_M09.bp_grp_cd1.eq(S0_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BP_GRP1.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M09.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP2).on(S0_M09.bp_grp_cd2.eq(S0_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BP_GRP2.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M09.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP3).on(S0_M09.bp_grp_cd3.eq(S0_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BP_GRP3.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M09.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP4).on(S0_M09.bp_grp_cd4.eq(S0_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BP_GRP4.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M09.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP5).on(S0_M09.bp_grp_cd5.eq(S0_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BP_GRP5.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M09.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP6).on(S0_M09.bp_grp_cd6.eq(S0_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BP_GRP6.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M09.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP7).on(S0_M09.bp_grp_cd7.eq(S0_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BP_GRP7.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M09.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP8).on(S0_M09.bp_grp_cd8.eq(S0_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BP_GRP8.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M09.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP9).on(S0_M09.bp_grp_cd9.eq(S0_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BP_GRP9.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M09.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP10).on(S0_M09.bp_grp_cd10.eq(S0_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BP_GRP10.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M09.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_CALC_CTG_R.class, r -> toCondition(
							r.getStringNE("calc_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("calc_ctg_nm", m.calc_ctg_nm());
					}),
					j -> j
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("mng_dpt_cd"),
							r.getDateNE("join_term_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mng_dpt_nm", m.dpt_nm());
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
						.add(MAM_ITM_JNL_R.class, r -> toCondition(
							r.getStringNE("itm_jnl_cd")
						))
						.addSelect(m -> toArray(
							m.itm_jnl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_jnl_nm", m.itm_jnl_nm());
					}),
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
							r.setStringNE("join_site_cd_", m.site_cd());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bp_cd")
						))
						.addSelect(m -> toArray(
							m.area_cd,
							m.bp_nm,
							m.cntry_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("bp_nm", m.bp_nm());
							r.setStringNE("join_cntry_cd_", m.cntry_cd());
							r.setStringNE("join_area_cd_", m.area_cd());
					}),
					j -> j
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("alc_dpt_cd"),
							r.getDateNE("join_term_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alc_dpt_nm", m.dpt_nm());
					}),
					j -> j
						.add(MAM_GP_ALC_R.class, r -> toCondition(
							r.getStringNE("gp_alc_cd")
						))
						.addSelect(m -> toArray(
							m.gp_alc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gp_alc_nm", m.gp_alc_nm());
					})
				)
			);
	}
}