package mcframe.serverMGBG.MGBGL0010;

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
	 * -- MGBGL0010_PLN_ALC_AMT_Query_S01
	 */
	static MCQueryPlan MGBGL0010_PLN_ALC_AMT_S01() {
		MGT_PLN_ALC_AMT_R S0_T = MGT_PLN_ALC_AMT_R.create("T");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_ALC_AC_R S0_ALC_AC = MAM_ALC_AC_R.create("ALC_AC");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP3");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S0_COST_DPT = MAM_COST_DPT_R.create("COST_DPT");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R S0_COST_CTG = MAM_COST_CTG_R.create("COST_CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_WG_R S0_WG2 = MAM_WG_R.create("WG2");
		MAM_CALC_GRP_R S0_CALC_GRP = MAM_CALC_GRP_R.create("CALC_GRP");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBGL0010_PLN_ALC_AMT_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_ctg_cd,
						S0_T.alc_rec_typ,
						S0_T.wg_cd,
						S0_WG.wg_nm,
						S0_T.ym,
						S0_T.alc_ac_cd,
						S0_ALC_AC.alc_ac_nm,
						S0_T.dpt_cd,
						S0_T.loc_cd,
						S0_T.oper_cd,
						S0_T.bp_cd,
						S0_T.ctg_cd,
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						nvl(
							S0_SUNDRY_ITM.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.amt,
						S0_T.trd_wg_cd,
						S0_T.trd_calc_grp_cd,
						S0_T.trd_calc_no,
						S0_T.pre_alc_fin_flg,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no,
						// this field is appended by sql coverter.
						S0_TERM.term.as("join_term_")
					)
					.from(
						S0_T
						.innerJoin(S0_WG).on(S0_T.wg_cd.eq(S0_WG.wg_cd))
						.leftOuterJoin(S0_ALC_AC).on(S0_T.alc_ac_cd.eq(S0_ALC_AC.alc_ac_cd))
						.leftOuterJoin(S0_ALC_AC_GRP1).on(
							value(MAC_ALC_AC_GRP_TYP.GRP1.value()).eq(S0_ALC_AC_GRP1.alc_ac_grp_typ)
							.and(S0_ALC_AC.alc_ac_grp_cd1.eq(S0_ALC_AC_GRP1.alc_ac_grp_cd))
						)
						.leftOuterJoin(S0_ALC_AC_GRP2).on(
							value(MAC_ALC_AC_GRP_TYP.GRP2.value()).eq(S0_ALC_AC_GRP2.alc_ac_grp_typ)
							.and(S0_ALC_AC.alc_ac_grp_cd2.eq(S0_ALC_AC_GRP2.alc_ac_grp_cd))
						)
						.leftOuterJoin(S0_ALC_AC_GRP3).on(
							value(MAC_ALC_AC_GRP_TYP.GRP3.value()).eq(S0_ALC_AC_GRP3.alc_ac_grp_typ)
							.and(S0_ALC_AC.alc_ac_grp_cd3.eq(S0_ALC_AC_GRP3.alc_ac_grp_cd))
						)
						.innerJoin(S0_TERM).on(
							S0_T.ym.gte(S0_TERM.term)
							.and(S0_T.ym.lt(S0_TERM.term_end_ym))
						)
						.leftOuterJoin(S0_ITM).on(
							S0_T.itm_cd.eq(S0_ITM.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_ITM.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_ITM.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_ITM.itm_sub3))
						)
						.leftOuterJoin(S0_SUNDRY_ITM).on(
							S0_T.itm_cd.eq(S0_SUNDRY_ITM.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_SUNDRY_ITM.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_SUNDRY_ITM.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_SUNDRY_ITM.itm_sub3))
							.and(S0_T.sno1.eq(S0_SUNDRY_ITM.sno1))
							.and(S0_T.sno2.eq(S0_SUNDRY_ITM.sno2))
							.and(S0_T.sno3.eq(S0_SUNDRY_ITM.sno3))
							.and(S0_T.sno4.eq(S0_SUNDRY_ITM.sno4))
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.addDynamicPredicate()
						.cutoff$and(S0_T.ym.gte(bind("ym_fr")))
						.cutoff$and(S0_T.ym.lte(bind("ym_to")))
						.cutoff$and(S0_T.alc_ac_cd.like(bind("alc_ac_cd")))
						.cutoff$and(S0_ALC_AC.alc_ac_nm.like(bind("alc_ac_nm")))
						.cutoff$and(S0_T.alc_rec_typ.like(bind("alc_rec_typ")))
						.cutoff$and(S0_ALC_AC.alc_ac_grp_cd1.like(bind("alc_ac_grp_cd1")))
						.cutoff$and(S0_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("alc_ac_grp_nm1")))
						.cutoff$and(S0_ALC_AC.alc_ac_grp_cd2.like(bind("alc_ac_grp_cd2")))
						.cutoff$and(S0_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("alc_ac_grp_nm2")))
						.cutoff$and(S0_ALC_AC.alc_ac_grp_cd3.like(bind("alc_ac_grp_cd3")))
						.cutoff$and(S0_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("alc_ac_grp_nm3")))
						.cutoff$and(S0_T.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T.bp_cd.like(bind("bp_cd")))
						.cutoff$and(S0_T.ctg_cd.like(bind("ctg_cd")))
						.cutoff$and(S0_T.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_ITM.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.trd_wg_cd.like(bind("trd_wg_cd")))
						.cutoff$and(S0_T.trd_calc_grp_cd.like(bind("trd_calc_grp_cd")))
						.cutoff$and(S0_T.trd_calc_no.like(bind("trd_calc_no")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
						.cutoff$and(
							bind("not_my_wg_flg_str").eq(value(true))
							.and(MGC_ALC_REC_TYP$IS_MY_WG(S0_T.alc_rec_typ).eq(value(false)))
						)
						.cutoff$and(S0_T.pre_alc_fin_flg.eq(bind("pre_alc_fin_flg_str")))
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.ym.asc(),
						S0_T.alc_rec_typ.asc(),
						S0_T.alc_ac_cd.asc(),
						S0_T.dpt_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("calc_ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_CALC_CTG).on(S0_T.calc_ctg_cd.eq(S0_CALC_CTG.calc_ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_COST_DPT).on(S0_TERM.term.eq(S0_COST_DPT.term).and(S0_T.dpt_cd.eq(S0_COST_DPT.dpt_cd))))
					.predicate(p -> p.cutoff$and(S0_COST_DPT.dpt_nm.like(bind("dpt_nm")))),
				when(boundOr("loc_nm"))
					.view(v -> v.leftOuterJoin(S0_LOC).on(S0_T.loc_cd.eq(S0_LOC.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_OPER).on(S0_T.oper_cd.eq(S0_OPER.oper_cd)))
					.predicate(p -> p.cutoff$and(S0_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("bp_nm"))
					.view(v -> v.leftOuterJoin(S0_BP).on(S0_T.bp_cd.eq(S0_BP.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_BP.bp_nm.like(bind("bp_nm")))),
				when(boundOr("ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_COST_CTG).on(S0_T.ctg_cd.eq(S0_COST_CTG.ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_COST_CTG.ctg_nm.like(bind("ctg_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM.itm_typ.eq(S0_ITM_TYP_D.itm_typ).and(S0_ITM.itm_typ_d_cd.eq(S0_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("trd_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_WG2).on(S0_T.trd_wg_cd.eq(S0_WG2.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_WG2.wg_nm.like(bind("trd_wg_nm")))),
				when(boundOr("trd_calc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_CALC_GRP).on(S0_T.trd_calc_grp_cd.eq(S0_CALC_GRP.calc_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_CALC_GRP.calc_grp_nm.like(bind("trd_calc_grp_nm"))))
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
							r.getStringNE("dpt_cd"),
							r.getDateNE("join_term_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dpt_nm", m.dpt_nm());
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
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ctg_nm", m.ctg_nm());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("trd_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_CALC_GRP_R.class, r -> toCondition(
							r.getStringNE("trd_calc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.calc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_calc_grp_nm", m.calc_grp_nm());
					})
				)
			);
	}
}