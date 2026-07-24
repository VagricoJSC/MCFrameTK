package mcframe.serverMGBG.MGBGL0120;

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
	 * -- MGBGL0120_MGT_PRE_RATE_MLY_Query_S01
	 */
	static MCQueryPlan MGBGL0120_MGT_PRE_RATE_MLY_S01() {
		MGT_PRE_RATE_MLY_R S0_T = MGT_PRE_RATE_MLY_R.create("T");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S0_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R S0_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ALC_AC_R S0_ALC_AC = MAM_ALC_AC_R.create("ALC_AC");
		MAM_WG_R S0_TRD_WG = MAM_WG_R.create("TRD_WG");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBGL0120_MGT_PRE_RATE_MLY_Query_S01")
					.mainQuery()
					.select(
						S0_T.pre_alc_rate_cd,
						S0_T.sa_typ,
						S0_T.ym,
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.dpt_cd,
						S0_T.loc_cd,
						S0_T.oper_cd,
						S0_T.bp_cd,
						S0_T.ctg_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
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
						S0_T.trd_wg_cd,
						S0_T.pre_alc_rate,
						S0_T.adj_flg,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_ts,
						S0_T.ins_func_id,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_ts,
						S0_T.upd_func_id,
						S0_T.upd_srv_req_no,
						S0_T.upd_cntr,
						// this field is appended by sql coverter.
						S0_TERM.term.as("join_term_")
					)
					.from(
						S0_T
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.innerJoin(S0_TERM).on(
							S0_TERM.term.lte(S0_T.ym)
							.and(S0_TERM.term_end_ym.gt(S0_T.ym))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.pre_alc_rate_cd.eq(bind("pre_alc_rate_cd")))
						.and(S0_T.sa_typ.eq(bind("sa_typ")))
						.and(S0_T.ym.eq(bind("ym")))
						.and(S0_T.calc_ctg_cd.eq(bind("calc_ctg_cd")))
						.and(S0_T.wg_cd.eq(bind("wg_cd")))
					)
					.orderBy(
						S0_T.dpt_cd.asc(),
						S0_T.loc_cd.asc(),
						S0_T.oper_cd.asc(),
						S0_T.bp_cd.asc(),
						S0_T.ctg_cd.asc(),
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
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
					}),
					j -> j
						.add(MAM_ALC_AC_R.class, r -> toCondition(
							r.getStringNE("alc_ac_cd")
						))
						.addSelect(m -> toArray(
							m.alc_ac_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alc_ac_nm", m.alc_ac_nm());
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