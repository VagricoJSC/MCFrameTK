package mcframe.serverMGBF.MGBFL0240;

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Query_MC {
	
	/**
	 * -- MGBFL0240_MAM_RPT_KEY_CONF_Query_S01
	 */
	static MCQueryPlan MGBFL0240_MAM_RPT_KEY_CONF_S01() {
		MAM_RPT_KEY_CONF_R S0T = MAM_RPT_KEY_CONF_R.create("T");
		MAM_COST_DPT_R S0DPT = MAM_COST_DPT_R.create("DPT");
		MAM_WG_R S0WG = MAM_WG_R.create("WG");
		MAM_ITM_R S0ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_JNL_R S0ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_ITM_GRP_R S0ITM_GRP = MAM_ITM_GRP_R.create("ITM_GRP");
		MAVM_RD_WG_R S1DAC = MAVM_RD_WG_R.create("DAC");

		return createQueryPlan()
				.setQuery(sql("MGBFL0240_MAM_RPT_KEY_CONF_S01")
						.mainQuery()
						.selectDistinct(
							S0T.rpt_key_seq,
							S0T.dpt_cd,
							S0DPT.dpt_nm,
							S0T.wg_cd,
							S0WG.wg_nm,
							S0T.itm_cd,
							S0T.itm_sub1,
							S0T.itm_sub2,
							S0T.itm_sub3,
							S0ITM.itm_nm,
							S0T.itm_jnl_cd,
							S0ITM_JNL.itm_jnl_nm,
							S0T.itm_grp_typ,
							S0T.itm_grp_cd,
							S0ITM_GRP.itm_grp_nm
						)
						.from(
							S0T
							.leftOuterJoin(S0DPT).on(
								S0T.dpt_cd.eq(S0DPT.dpt_cd)
								.and(bind("term").eq(S0DPT.term))
							)
							.leftOuterJoin(S0WG).on(S0T.wg_cd.eq(S0WG.wg_cd))
							.leftOuterJoin(S0ITM).on(
								S0T.itm_cd.eq(S0ITM.itm_cd)
								.and(S0T.itm_sub1.eq(S0ITM.itm_sub1))
								.and(S0T.itm_sub2.eq(S0ITM.itm_sub2))
								.and(S0T.itm_sub3.eq(S0ITM.itm_sub3))
							)
							.leftOuterJoin(S0ITM_JNL).on(S0T.itm_jnl_cd.eq(S0ITM_JNL.itm_jnl_cd))
							.leftOuterJoin(S0ITM_GRP).on(
								S0T.itm_grp_typ.eq(S0ITM_GRP.itm_grp_typ)
								.and(S0T.itm_grp_cd.eq(S0ITM_GRP.itm_grp_cd))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								S0T.wg_cd.isNull()
								.or(
									exists(
										subQuery()
										.select(S1DAC.wg_cd)
										.from(S1DAC)
										.where(
											S0T.wg_cd.eq(S1DAC.wg_cd)
										)
									)
								)
							)
							.and(S0T.rpt_key_cd.eq(bind("rpt_key_cd")))
							.cutoff$and(
								bracket(
									S0T.wg_cd.isNull()
									.or(S0T.wg_cd.like(bind("wg_cd")))
								)
							)
						));
	}
	
	/**
	 * -- MGBFL0240_MGT_RPT_Query_S01
	 */
	static MCQueryPlan MGBFL0240_MGT_RPT_S01(List<String[]> bindList, String rptKeyTyp) {
		MGT_RPT_R S0T = MGT_RPT_R.create("T");
		MAM_RPT_CONF_R S0RPT_CONF = MAM_RPT_CONF_R.create("RPT_CONF");
		MAVM_RD_WG_R S0DAC = MAVM_RD_WG_R.create("DAC");

		return createQueryPlan()
				.setQuery(
					sql("MGBFL0240_MGT_RPT_Query_S01")
					.mainQuery()
					.select(
						MGBFL0240_MGT_RPT_S01_SELECT(bindList, rptKeyTyp, 
							S0RPT_CONF.rpt_seq,
							S0RPT_CONF.rpt_tgt_typ,
							S0T.rpt_row_cd,
							S0RPT_CONF.rpt_pre_word,
							S0RPT_CONF.rpt_row_nm,
							S0RPT_CONF.fg_r,
							S0RPT_CONF.fg_g,
							S0RPT_CONF.fg_b,
							S0RPT_CONF.bg_r,
							S0RPT_CONF.bg_g,
							S0RPT_CONF.bg_b,
							S0RPT_CONF.asst_typ,
							S0RPT_CONF.alc_ac_grp_cd1,
							S0RPT_CONF.alc_ac_grp_cd2,
							S0RPT_CONF.alc_ac_grp_cd3,
							S0RPT_CONF.alc_ac_cd,
							S0RPT_CONF.ac_slip_typ,
							S0RPT_CONF.ac_rsn_cd,
							S0RPT_CONF.itm_jnl_cd.as("itm_jnl_cd2"),
							S0RPT_CONF.itm_grp_cd1,
							S0RPT_CONF.itm_grp_cd2,
							S0RPT_CONF.itm_grp_cd3,
							S0RPT_CONF.itm_grp_cd4,
							S0RPT_CONF.itm_grp_cd5,
							S0RPT_CONF.itm_grp_cd6,
							S0RPT_CONF.itm_grp_cd7,
							S0RPT_CONF.itm_grp_cd8,
							S0RPT_CONF.itm_grp_cd9,
							S0RPT_CONF.itm_grp_cd10,
							S0RPT_CONF.cost_io_typ,
							S0RPT_CONF.qty_unit_typ,
							S0RPT_CONF.cost_io_typ,
							S0RPT_CONF.qty_unit_typ,
							nvl(
								sum(S0T.rpt_val),
								value(0)
							).as("ttl"))
					)
					.from(
						S0T
						.innerJoin(S0RPT_CONF).on(
							S0RPT_CONF.rpt_ptn_cd.eq(S0T.rpt_ptn_cd)
							.and(S0RPT_CONF.rpt_row_cd.eq(S0T.rpt_row_cd))
							.and(S0RPT_CONF.hdn_flg.eq(value(false)))
						)
						.innerJoin(S0DAC).on(S0T.wg_cd.eq(S0DAC.wg_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0T.calc_no.eq(bind("calc_no")))
						.and(S0T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0T.ym.eq(bind("ym")))
						.and(S0T.rpt_ptn_cd.eq(bind("rpt_ptn_cd")))
						.and(S0T.rpt_key_cd.eq(bind("rpt_key_cd")))
						.cutoff$and(S0T.wg_cd.like(bind("wg_cd")))
					)
					.groupBy(
						S0RPT_CONF.rpt_seq,
						S0RPT_CONF.rpt_tgt_typ,
						S0T.rpt_row_cd,
						S0RPT_CONF.rpt_pre_word,
						S0RPT_CONF.rpt_row_nm,
						S0RPT_CONF.fg_r,
						S0RPT_CONF.fg_g,
						S0RPT_CONF.fg_b,
						S0RPT_CONF.bg_r,
						S0RPT_CONF.bg_g,
						S0RPT_CONF.bg_b,
						S0RPT_CONF.asst_typ,
						S0RPT_CONF.alc_ac_grp_cd1,
						S0RPT_CONF.alc_ac_grp_cd2,
						S0RPT_CONF.alc_ac_grp_cd3,
						S0RPT_CONF.alc_ac_cd,
						S0RPT_CONF.ac_slip_typ,
						S0RPT_CONF.ac_rsn_cd,
						S0RPT_CONF.itm_jnl_cd,
						S0RPT_CONF.itm_grp_cd1,
						S0RPT_CONF.itm_grp_cd2,
						S0RPT_CONF.itm_grp_cd3,
						S0RPT_CONF.itm_grp_cd4,
						S0RPT_CONF.itm_grp_cd5,
						S0RPT_CONF.itm_grp_cd6,
						S0RPT_CONF.itm_grp_cd7,
						S0RPT_CONF.itm_grp_cd8,
						S0RPT_CONF.itm_grp_cd9,
						S0RPT_CONF.itm_grp_cd10,
						S0RPT_CONF.cost_io_typ,
						S0RPT_CONF.qty_unit_typ,
						S0RPT_CONF.cost_io_typ,
						S0RPT_CONF.qty_unit_typ
					)
				);
	}
	
	static protected MCColumnGroup[] MGBFL0240_MGT_RPT_S01_SELECT(List<String[]> bindList, String rptKeyTyp, MCColumnGroup...columnGroups) {
		MGT_RPT_R S0T = MGT_RPT_R.create("T");
		List<MCColumnGroup> l = new ArrayList<MCColumnGroup>();
		l.addAll(Arrays.asList(columnGroups));
		for (String[] b : bindList) {
			String col = b[0].replace("bind_rpt_key_1", "col");

			if (MAC_RPT_KEY_TYP.isMNG_DPT(rptKeyTyp)) {
				l.add(nullIf(
						nvl(sum(decode(S0T.dpt_cd, bind(b[0]), S0T.rpt_val, value(0))),
								value(0)),
						value(0)).as(col));
			}
			else if (MAC_RPT_KEY_TYP.isWG(rptKeyTyp)) {
				l.add(nullIf(
						nvl(sum(decode(S0T.wg_cd, bind(b[0]), S0T.rpt_val, value(0))),
								value(0)),
						value(0)).as(col));
			}
			else if (MAC_RPT_KEY_TYP.isITM(rptKeyTyp)) {
				l.add(nullIf(nvl(sum(decode(S0T.itm_cd, bind(b[0]),
						decode(S0T.itm_sub1, bind(b[1]),
								decode(S0T.itm_sub2, bind(b[2]),
										decode(S0T.itm_sub3, bind(b[3]), S0T.rpt_val,
												value(0)),
										value(0)),
								value(0)),
						value(0))), value(0)), value(0)).as(col));
			}
			else if (MAC_RPT_KEY_TYP.isITM_JNL(rptKeyTyp)) {
				l.add(nullIf(nvl(
						sum(decode(S0T.itm_jnl_cd, bind(b[0]), S0T.rpt_val, value(0))),
						value(0)), value(0)).as(col));
			}
			else {
				l.add(nullIf(nvl(sum(decode(S0T.itm_grp_typ, bind(b[0]),
						decode(S0T.itm_grp_cd, bind(b[1]), S0T.rpt_val, value(0)),
						value(0))), value(0)), value(0)).as(col));
			}
		}
		return l.toArray(new MCColumnGroup[0]);
	}
}