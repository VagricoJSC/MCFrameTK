package mcframe.serverMGBD.MGBDL0230;

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
	 * -- MGBDL0230_MGT_ALC_CALC_DTL_Query_S01
	 */
	static MCQueryPlan MGBDL0230_MGT_ALC_CALC_DTL_S01() {
		MGT_ALC_CALC_DTL_R S0_T = MGT_ALC_CALC_DTL_R.create("T");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S0_COST_DPT = MAM_COST_DPT_R.create("COST_DPT");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_AC_RSN_R S0_AC_RSN = MAM_AC_RSN_R.create("AC_RSN");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_WK_COST_R S0_WK_COST = MAM_WK_COST_R.create("WK_COST");
		MAM_WK_RSN_R S0_WK_RSN = MAM_WK_RSN_R.create("WK_RSN");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_COST_DPT_R S0_ALC_DPT = MAM_COST_DPT_R.create("ALC_DPT");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_GP_ALC_R S0_GP_ALC = MAM_GP_ALC_R.create("GP_ALC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0230_MGT_ALC_CALC_DTL_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_no,
						S0_T.calc_grp_cd,
						S0_T.alc_grp_id,
						S0_T.wg_cd,
						S0_T.ym,
						S0_T.mng_dpt_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.itm_mfg_inst_no,
						S0_T.mfg_act_no,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.ac_slip_typ,
						S0_T.ac_rsn_cd,
						S0_T.loc_cd,
						S0_T.str_ln_cd,
						S0_T.oper_act_no,
						S0_T.oper_cd,
						S0_T.wk_cost_cd,
						S0_T.wk_rsn_cd,
						S0_T.bp_cd,
						S0_T.iv_no,
						S0_T.po_no,
						S0_T.slo_no,
						S0_T.alc_dpt_cd,
						S0_T.act_sls_id,
						S0_T.act_sls_id_sub,
						S0_T.asst_typ,
						S0_T.gp_alc_cd,
						S0_T.alc_tgt_val,
						S0_T.alc_amt,
						S0_T.adj_amt,
						S0_T.std_alc_amt,
						S0_T.coef_val,
						nvl(
							S0_T.alc_org_tgt_val,
							decode(
								S0_T.coef_val,
								value(0),
								value(0),
								nvl(
									S0_T.alc_tgt_val.divide(S0_T.coef_val),
									value(0)
								)
							)
						).as("alc_org_tgt_val"),
						nvl(
							S0_SUNDRY_ITM.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM.itm_jnl_cd,
						// this field is appended by sql coverter.
						S0_TERM.term.as("join_term_")
					)
					.from(
						S0_T
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
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T.alc_tgt_val.neq(value(0))
							.or(S0_T.alc_amt.neq(value(0)))
							.or(S0_T.adj_amt.neq(value(0)))
						)
						.cutoff$and(S0_T.calc_no.eq(bind("calc_no")))
						.cutoff$and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.cutoff$and(S0_T.alc_grp_id.eq(bind("alc_grp_id")))
					)
					.orderBy(
						S0_T.wg_cd.asc(),
						S0_T.ym.asc(),
						S0_T.mng_dpt_cd.asc(),
						S0_ITM.itm_jnl_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.itm_mfg_inst_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_AC_RSN_R.class, r -> toCondition(
							r.getStringNE("ac_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.ac_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ac_rsn_nm", m.ac_rsn_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
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
						.add(MAM_WK_COST_R.class, r -> toCondition(
							r.getStringNE("wk_cost_cd")
						))
						.addSelect(m -> toArray(
							m.wk_cost_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wk_cost_nm", m.wk_cost_nm());
					}),
					j -> j
						.add(MAM_WK_RSN_R.class, r -> toCondition(
							r.getStringNE("wk_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.wk_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wk_rsn_nm", m.wk_rsn_nm());
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