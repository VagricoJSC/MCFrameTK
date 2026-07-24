package mcframe.serverMGBG.MGBGL0130;

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
	 * -- MGBGL0130_MGT_PRE_RATE_MLY_Query_S01
	 */
	static MCQueryPlan MGBGL0130_MGT_PRE_RATE_MLY_S01() {
		MGT_PRE_RATE_MLY_R S0_T = MGT_PRE_RATE_MLY_R.create("T");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_PRE_ALC_RATE_R S0_PRE_ALC_RATE = MAM_PRE_ALC_RATE_R.create("PRE_ALC_RATE");
		MAM_PRE_ALC_PTN_R S0_PRE_ALC_PTN = MAM_PRE_ALC_PTN_R.create("PRE_ALC_PTN");
		MAM_COST_DPT_R S0_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R S0_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ALC_AC_R S0_ALC_AC = MAM_ALC_AC_R.create("ALC_AC");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP3");
		MAM_WG_R S0_TRD_WG = MAM_WG_R.create("TRD_WG");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBGL0130_MGT_PRE_RATE_MLY_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_WG.wg_nm,
						S0_T.ym,
						S0_T.pre_alc_rate_cd,
						S0_T.dpt_cd,
						S0_T.loc_cd,
						S0_T.oper_cd,
						S0_T.bp_cd,
						S0_T.ctg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						nvl(
							S0_SUNDRY_ITM.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.itm_mfg_inst_no,
						S0_T.iv_no,
						S0_T.po_no,
						S0_T.slo_no,
						S0_T.alc_ac_cd,
						S0_ALC_AC.alc_ac_nm,
						S0_T.trd_wg_cd,
						S0_T.pre_alc_rate,
						S0_T.adj_flg,
						S0_T.rmrks.as("mly_rmrks"),
						S0_T.sub_char1.as("mly_sub_char1"),
						S0_T.sub_char2.as("mly_sub_char2"),
						S0_T.sub_char3.as("mly_sub_char3"),
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_ts,
						S0_T.ins_func_id,
						S0_T.upd_cntr,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_ts,
						S0_T.upd_func_id,
						S0_T.upd_srv_req_no,
						// this field is appended by sql coverter.
						S0_TERM.term.as("join_term_")
					)
					.from(
						S0_T
						.innerJoin(S0_WG).on(S0_T.wg_cd.eq(S0_WG.wg_cd))
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
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.sa_typ.eq(bind("sa_typ")))
						.cutoff$and(S0_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.pre_alc_rate_cd.like(bind("pre_alc_rate_cd")))
						.cutoff$and(S0_T.ym.gte(bind("ym_fr")))
						.cutoff$and(S0_T.ym.lte(bind("ym_to")))
						.cutoff$and(S0_T.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T.bp_cd.like(bind("bp_cd")))
						.cutoff$and(S0_T.ctg_cd.like(bind("ctg_cd")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_SUNDRY_ITM.itm_nm,
								S0_ITM.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T.po_no.like(bind("po_no")))
						.cutoff$and(S0_T.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T.alc_ac_cd.like(bind("alc_ac_cd")))
						.cutoff$and(S0_ALC_AC.alc_ac_nm.like(bind("alc_ac_nm")))
						.cutoff$and(S0_ALC_AC.alc_ac_grp_cd1.like(bind("alc_ac_grp_cd1")))
						.cutoff$and(S0_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("alc_ac_grp_nm1")))
						.cutoff$and(S0_ALC_AC.alc_ac_grp_cd2.like(bind("alc_ac_grp_cd2")))
						.cutoff$and(S0_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("alc_ac_grp_nm2")))
						.cutoff$and(S0_ALC_AC.alc_ac_grp_cd3.like(bind("alc_ac_grp_cd3")))
						.cutoff$and(S0_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("alc_ac_grp_nm3")))
						.cutoff$and(S0_T.trd_wg_cd.like(bind("trd_wg_cd")))
						.cutoff$and(S0_T.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.ym.asc(),
						S0_T.pre_alc_rate_cd.asc(),
						S0_T.dpt_cd.asc(),
						S0_T.loc_cd.asc(),
						S0_T.oper_cd.asc(),
						S0_T.bp_cd.asc(),
						S0_T.ctg_cd.asc(),
						S0_ITM.itm_typ.asc(),
						S0_ITM.itm_typ_d_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.lot_no.asc(),
						S0_T.sublot_no.asc(),
						S0_T.sno1.asc(),
						S0_T.sno2.asc(),
						S0_T.sno3.asc(),
						S0_T.sno4.asc(),
						S0_T.itm_mfg_inst_no.asc(),
						S0_T.iv_no.asc(),
						S0_T.po_no.asc(),
						S0_T.slo_no.asc(),
						S0_T.alc_ac_cd.asc(),
						S0_T.trd_wg_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("calc_ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_CALC_CTG).on(S0_T.calc_ctg_cd.eq(S0_CALC_CTG.calc_ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("pre_alc_rate_nm"))
					.view(v -> v.leftOuterJoin(S0_PRE_ALC_RATE).on(S0_T.pre_alc_rate_cd.eq(S0_PRE_ALC_RATE.pre_alc_rate_cd)))
					.predicate(p -> p.cutoff$and(S0_PRE_ALC_RATE.pre_alc_rate_nm.like(bind("pre_alc_rate_nm")))),
				when(boundOr("dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_DPT).on(S0_T.dpt_cd.eq(S0_DPT.dpt_cd).and(S0_TERM.term.eq(S0_DPT.term))))
					.predicate(p -> p.cutoff$and(S0_DPT.dpt_nm.like(bind("dpt_nm")))),
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
					.view(v -> v.leftOuterJoin(S0_CTG).on(S0_T.ctg_cd.eq(S0_CTG.ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CTG.ctg_nm.like(bind("ctg_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM.itm_typ.eq(S0_ITM_TYP_D.itm_typ).and(S0_ITM.itm_typ_d_cd.eq(S0_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("trd_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_TRD_WG).on(S0_T.trd_wg_cd.eq(S0_TRD_WG.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_TRD_WG.wg_nm.like(bind("trd_wg_nm"))))
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
						.add(MAM_PRE_ALC_RATE_R.class, r -> toCondition(
							r.getStringNE("pre_alc_rate_cd")
						))
						.addSelect(m -> toArray(
							m.pre_alc_ptn_cd,
							m.pre_alc_rate_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pre_alc_rate_nm", m.pre_alc_rate_nm());
							r.setStringNE("pre_alc_ptn_cd", m.pre_alc_ptn_cd());
					}),
					j -> j
						.add(MAM_PRE_ALC_PTN_R.class, r -> toCondition(
							r.getStringNE("pre_alc_ptn_cd")
						))
						.addSelect(m -> toArray(
							m.alc_ac_alc_typ,
							m.bp_alc_typ,
							m.ctg_alc_typ,
							m.dpt_alc_typ,
							m.inst_alc_typ,
							m.itm_alc_typ,
							m.iv_alc_typ,
							m.loc_alc_typ,
							m.lot_alc_typ,
							m.oper_alc_typ,
							m.po_alc_typ,
							m.pre_alc_ptn_nm,
							m.slo_alc_typ,
							m.sno1_alc_typ,
							m.sno2_alc_typ,
							m.sno3_alc_typ,
							m.sno4_alc_typ,
							m.sublot_alc_typ,
							m.wg_alc_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("pre_alc_ptn_nm", m.pre_alc_ptn_nm());
							r.setStringNE("dpt_alc_typ", m.dpt_alc_typ());
							r.setStringNE("loc_alc_typ", m.loc_alc_typ());
							r.setStringNE("oper_alc_typ", m.oper_alc_typ());
							r.setStringNE("bp_alc_typ", m.bp_alc_typ());
							r.setStringNE("ctg_alc_typ", m.ctg_alc_typ());
							r.setStringNE("itm_alc_typ", m.itm_alc_typ());
							r.setStringNE("lot_alc_typ", m.lot_alc_typ());
							r.setStringNE("sublot_alc_typ", m.sublot_alc_typ());
							r.setStringNE("sno1_alc_typ", m.sno1_alc_typ());
							r.setStringNE("sno2_alc_typ", m.sno2_alc_typ());
							r.setStringNE("sno3_alc_typ", m.sno3_alc_typ());
							r.setStringNE("sno4_alc_typ", m.sno4_alc_typ());
							r.setStringNE("inst_alc_typ", m.inst_alc_typ());
							r.setStringNE("iv_alc_typ", m.iv_alc_typ());
							r.setStringNE("po_alc_typ", m.po_alc_typ());
							r.setStringNE("slo_alc_typ", m.slo_alc_typ());
							r.setStringNE("alc_ac_alc_typ", m.alc_ac_alc_typ());
							r.setStringNE("wg_alc_typ", m.wg_alc_typ());
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
					})
				)
			);
	}
	
	/**
	 * -- MGBGL0130_MGT_PRE_RATE_TERM_Query_S01
	 */
	static MCQueryPlan MGBGL0130_MGT_PRE_RATE_TERM_S01() {
		MGT_PRE_RATE_TERM_R S0_T = MGT_PRE_RATE_TERM_R.create("T");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_PRE_ALC_RATE_R S0_PRE_ALC_RATE = MAM_PRE_ALC_RATE_R.create("PRE_ALC_RATE");
		MAM_PRE_ALC_PTN_R S0_PRE_ALC_PTN = MAM_PRE_ALC_PTN_R.create("PRE_ALC_PTN");
		MAM_COST_DPT_R S0_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R S0_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ALC_AC_R S0_ALC_AC = MAM_ALC_AC_R.create("ALC_AC");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R S0_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP3");
		MAM_WG_R S0_TRD_WG = MAM_WG_R.create("TRD_WG");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBGL0130_MGT_PRE_RATE_TERM_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_WG.wg_nm,
						S0_T.term,
						S0_T.pre_alc_rate_cd,
						S0_T.dpt_cd,
						S0_T.loc_cd,
						S0_T.oper_cd,
						S0_T.bp_cd,
						S0_T.ctg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						nvl(
							S0_SUNDRY_ITM.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.itm_mfg_inst_no,
						S0_T.iv_no,
						S0_T.po_no,
						S0_T.slo_no,
						S0_T.alc_ac_cd,
						S0_ALC_AC.alc_ac_nm,
						S0_T.trd_wg_cd,
						S0_T.pre_alc_rate,
						S0_T.adj_flg,
						S0_T.rmrks.as("term_rmrks"),
						S0_T.sub_char1.as("term_sub_char1"),
						S0_T.sub_char2.as("term_sub_char2"),
						S0_T.sub_char3.as("term_sub_char3"),
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_ts,
						S0_T.ins_func_id,
						S0_T.upd_cntr,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_ts,
						S0_T.upd_func_id,
						S0_T.upd_srv_req_no
					)
					.from(
						S0_T
						.innerJoin(S0_WG).on(S0_T.wg_cd.eq(S0_WG.wg_cd))
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
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.pre_alc_rate_cd.like(bind("pre_alc_rate_cd")))
						.cutoff$and(S0_T.term.gte(bind("term_fr")))
						.cutoff$and(S0_T.term.lte(bind("term_to")))
						.cutoff$and(S0_T.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T.bp_cd.like(bind("bp_cd")))
						.cutoff$and(S0_T.ctg_cd.like(bind("ctg_cd")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_SUNDRY_ITM.itm_nm,
								S0_ITM.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T.po_no.like(bind("po_no")))
						.cutoff$and(S0_T.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T.alc_ac_cd.like(bind("alc_ac_cd")))
						.cutoff$and(S0_ALC_AC.alc_ac_nm.like(bind("alc_ac_nm")))
						.cutoff$and(S0_ALC_AC.alc_ac_grp_cd1.like(bind("alc_ac_grp_cd1")))
						.cutoff$and(S0_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("alc_ac_grp_nm1")))
						.cutoff$and(S0_ALC_AC.alc_ac_grp_cd2.like(bind("alc_ac_grp_cd2")))
						.cutoff$and(S0_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("alc_ac_grp_nm2")))
						.cutoff$and(S0_ALC_AC.alc_ac_grp_cd3.like(bind("alc_ac_grp_cd3")))
						.cutoff$and(S0_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("alc_ac_grp_nm3")))
						.cutoff$and(S0_T.trd_wg_cd.like(bind("trd_wg_cd")))
						.cutoff$and(S0_T.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.term.asc(),
						S0_T.pre_alc_rate_cd.asc(),
						S0_T.dpt_cd.asc(),
						S0_T.loc_cd.asc(),
						S0_T.oper_cd.asc(),
						S0_T.bp_cd.asc(),
						S0_T.ctg_cd.asc(),
						S0_ITM.itm_typ.asc(),
						S0_ITM.itm_typ_d_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.lot_no.asc(),
						S0_T.sublot_no.asc(),
						S0_T.sno1.asc(),
						S0_T.sno2.asc(),
						S0_T.sno3.asc(),
						S0_T.sno4.asc(),
						S0_T.itm_mfg_inst_no.asc(),
						S0_T.iv_no.asc(),
						S0_T.po_no.asc(),
						S0_T.slo_no.asc(),
						S0_T.alc_ac_cd.asc(),
						S0_T.trd_wg_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_TERM).on(S0_T.term.eq(S0_TERM.term))),
				when(boundOr("calc_ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_CALC_CTG).on(S0_T.calc_ctg_cd.eq(S0_CALC_CTG.calc_ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("pre_alc_rate_nm"))
					.view(v -> v.leftOuterJoin(S0_PRE_ALC_RATE).on(S0_T.pre_alc_rate_cd.eq(S0_PRE_ALC_RATE.pre_alc_rate_cd)))
					.predicate(p -> p.cutoff$and(S0_PRE_ALC_RATE.pre_alc_rate_nm.like(bind("pre_alc_rate_nm")))),
				when(boundOr("dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_DPT).on(S0_T.dpt_cd.eq(S0_DPT.dpt_cd).and(S0_TERM.term.eq(S0_DPT.term))))
					.predicate(p -> p.cutoff$and(S0_DPT.dpt_nm.like(bind("dpt_nm")))),
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
					.view(v -> v.leftOuterJoin(S0_CTG).on(S0_T.ctg_cd.eq(S0_CTG.ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CTG.ctg_nm.like(bind("ctg_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM.itm_typ.eq(S0_ITM_TYP_D.itm_typ).and(S0_ITM.itm_typ_d_cd.eq(S0_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("trd_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_TRD_WG).on(S0_T.trd_wg_cd.eq(S0_TRD_WG.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_TRD_WG.wg_nm.like(bind("trd_wg_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_TERM_R.class, r -> toCondition(
							r.getDateNE("term")
						))
						.addSelect(m -> toArray(
							m.term,
							m.term_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("term_nm", m.term_nm());
							r.setDateNE("join_term_", m.term());
					}),
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
						.add(MAM_PRE_ALC_RATE_R.class, r -> toCondition(
							r.getStringNE("pre_alc_rate_cd")
						))
						.addSelect(m -> toArray(
							m.pre_alc_ptn_cd,
							m.pre_alc_rate_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pre_alc_rate_nm", m.pre_alc_rate_nm());
							r.setStringNE("pre_alc_ptn_cd", m.pre_alc_ptn_cd());
					}),
					j -> j
						.add(MAM_PRE_ALC_PTN_R.class, r -> toCondition(
							r.getStringNE("pre_alc_ptn_cd")
						))
						.addSelect(m -> toArray(
							m.alc_ac_alc_typ,
							m.bp_alc_typ,
							m.ctg_alc_typ,
							m.dpt_alc_typ,
							m.inst_alc_typ,
							m.itm_alc_typ,
							m.iv_alc_typ,
							m.loc_alc_typ,
							m.lot_alc_typ,
							m.oper_alc_typ,
							m.po_alc_typ,
							m.pre_alc_ptn_nm,
							m.slo_alc_typ,
							m.sno1_alc_typ,
							m.sno2_alc_typ,
							m.sno3_alc_typ,
							m.sno4_alc_typ,
							m.sublot_alc_typ,
							m.wg_alc_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("pre_alc_ptn_nm", m.pre_alc_ptn_nm());
							r.setStringNE("dpt_alc_typ", m.dpt_alc_typ());
							r.setStringNE("loc_alc_typ", m.loc_alc_typ());
							r.setStringNE("oper_alc_typ", m.oper_alc_typ());
							r.setStringNE("bp_alc_typ", m.bp_alc_typ());
							r.setStringNE("ctg_alc_typ", m.ctg_alc_typ());
							r.setStringNE("itm_alc_typ", m.itm_alc_typ());
							r.setStringNE("lot_alc_typ", m.lot_alc_typ());
							r.setStringNE("sublot_alc_typ", m.sublot_alc_typ());
							r.setStringNE("sno1_alc_typ", m.sno1_alc_typ());
							r.setStringNE("sno2_alc_typ", m.sno2_alc_typ());
							r.setStringNE("sno3_alc_typ", m.sno3_alc_typ());
							r.setStringNE("sno4_alc_typ", m.sno4_alc_typ());
							r.setStringNE("inst_alc_typ", m.inst_alc_typ());
							r.setStringNE("iv_alc_typ", m.iv_alc_typ());
							r.setStringNE("po_alc_typ", m.po_alc_typ());
							r.setStringNE("slo_alc_typ", m.slo_alc_typ());
							r.setStringNE("alc_ac_alc_typ", m.alc_ac_alc_typ());
							r.setStringNE("wg_alc_typ", m.wg_alc_typ());
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
					})
				)
			);
	}
}