package mcframe.serverMGBG.MGBGL0150;

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
	 * -- MGBGL0150_MGT_PRE_RATE_MLY_Query_S01
	 */
	static MCQueryPlan MGBGL0150_MGT_PRE_RATE_MLY_S01() {
		MGT_PRE_RATE_MLY_R S0_T01 = MGT_PRE_RATE_MLY_R.create("T01");
		MAM_TERM_R S0_M51 = MAM_TERM_R.create("M51");
		MAM_COST_DPT_R S0_M01 = MAM_COST_DPT_R.create("M01");
		MAM_LOC_R S0_M02 = MAM_LOC_R.create("M02");
		MAM_OPER_R S0_M03 = MAM_OPER_R.create("M03");
		MAM_BP_R S0_M04 = MAM_BP_R.create("M04");
		MAM_COST_CTG_R S0_M05 = MAM_COST_CTG_R.create("M05");
		MAM_ITM_R S0_M06 = MAM_ITM_R.create("M06");
		MAM_ALC_AC_R S0_M07 = MAM_ALC_AC_R.create("M07");
		MAVM_RD_WG_R S0_M08 = MAVM_RD_WG_R.create("M08");
		MAM_SUNDRY_ITM_R S0_M09 = MAM_SUNDRY_ITM_R.create("M09");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBGL0150_MGT_PRE_RATE_MLY_Query_S01")
					.mainQuery()
					.select(
						S0_T01.pre_alc_rate_cd,
						S0_T01.calc_ctg_cd,
						S0_T01.dpt_cd,
						S0_M01.dpt_nm,
						S0_T01.loc_cd,
						S0_M02.loc_nm,
						S0_T01.oper_cd,
						S0_M03.oper_nm,
						S0_T01.bp_cd,
						S0_M04.bp_nm,
						S0_T01.ctg_cd,
						S0_M05.ctg_nm,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						nvl(
							S0_M09.itm_nm,
							S0_M06.itm_nm
						).as("itm_nm"),
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_T01.sno1,
						S0_T01.sno2,
						S0_T01.sno3,
						S0_T01.sno4,
						S0_T01.itm_mfg_inst_no,
						S0_T01.iv_no,
						S0_T01.po_no,
						S0_T01.slo_no,
						S0_T01.alc_ac_cd,
						S0_M07.alc_ac_nm,
						S0_T01.trd_wg_cd,
						S0_M08.wg_nm.as("col_all")
					)
					.from(
						S0_T01
						.innerJoin(S0_M51).on(
							bracket(
								S0_M51.term.lte(S0_T01.ym)
								.and(S0_T01.ym.lt(S0_M51.term_end_ym))
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_M01.dpt_cd.eq(S0_T01.dpt_cd)
								.and(S0_M01.term.eq(S0_M51.term))
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_M02.loc_cd.eq(S0_T01.loc_cd)
							)
						)
						.leftOuterJoin(S0_M03).on(
							bracket(
								S0_M03.oper_cd.eq(S0_T01.oper_cd)
							)
						)
						.leftOuterJoin(S0_M04).on(
							bracket(
								S0_M04.bp_cd.eq(S0_T01.bp_cd)
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_M05.ctg_cd.eq(S0_T01.ctg_cd)
							)
						)
						.leftOuterJoin(S0_M06).on(
							bracket(
								S0_M06.itm_cd.eq(S0_T01.itm_cd)
								.and(S0_M06.itm_sub1.eq(S0_T01.itm_sub1))
								.and(S0_M06.itm_sub2.eq(S0_T01.itm_sub2))
								.and(S0_M06.itm_sub3.eq(S0_T01.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M07).on(
							bracket(
								S0_M07.alc_ac_cd.eq(S0_T01.alc_ac_cd)
							)
						)
						.leftOuterJoin(S0_M08).on(
							bracket(
								S0_M08.wg_cd.eq(S0_T01.trd_wg_cd)
							)
						)
						.leftOuterJoin(S0_M09).on(
							bracket(
								S0_M09.itm_cd.eq(S0_T01.itm_cd)
								.and(S0_M09.itm_sub1.eq(S0_T01.itm_sub1))
								.and(S0_M09.itm_sub2.eq(S0_T01.itm_sub2))
								.and(S0_M09.itm_sub3.eq(S0_T01.itm_sub3))
								.and(S0_M09.sno1.eq(S0_T01.sno1))
								.and(S0_M09.sno2.eq(S0_T01.sno2))
								.and(S0_M09.sno3.eq(S0_T01.sno3))
								.and(S0_M09.sno4.eq(S0_T01.sno4))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.ym.between(bind("ym_fr"), bind("ym_to")))
						.and(S0_T01.pre_alc_rate_cd.eq(bind("pre_alc_rate_cd")))
						.and(S0_T01.wg_cd.eq(bind("wg_cd")))
						.cutoff$and(
							S0_T01.calc_ctg_cd.eq(bind("pln_only"))
							.and(S0_T01.sa_typ.eq(value(MAC_SA_TYP.PLN.value())))
						)
						.cutoff$and(
							S0_T01.calc_ctg_cd.eq(bind("act_only"))
							.and(S0_T01.sa_typ.eq(value(MAC_SA_TYP.ACT.value())))
						)
						.cutoff$and(
							bracket(
								bracket(
									S0_T01.calc_ctg_cd.eq(bind("pln"))
									.and(S0_T01.sa_typ.eq(value(MAC_SA_TYP.PLN.value())))
								)
								.or(
									S0_T01.calc_ctg_cd.eq(bind("act"))
									.and(S0_T01.sa_typ.eq(value(MAC_SA_TYP.ACT.value())))
								)
							)
						)
					)
					.groupBy(
						S0_T01.pre_alc_rate_cd,
						S0_T01.calc_ctg_cd,
						S0_T01.dpt_cd,
						S0_M01.dpt_nm,
						S0_T01.loc_cd,
						S0_M02.loc_nm,
						S0_T01.oper_cd,
						S0_M03.oper_nm,
						S0_T01.bp_cd,
						S0_M04.bp_nm,
						S0_T01.ctg_cd,
						S0_M05.ctg_nm,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						nvl(
							S0_M09.itm_nm,
							S0_M06.itm_nm
						),
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_T01.sno1,
						S0_T01.sno2,
						S0_T01.sno3,
						S0_T01.sno4,
						S0_T01.itm_mfg_inst_no,
						S0_T01.iv_no,
						S0_T01.po_no,
						S0_T01.slo_no,
						S0_T01.alc_ac_cd,
						S0_M07.alc_ac_nm,
						S0_T01.trd_wg_cd,
						S0_M08.wg_nm
					)
					.orderBy(
						S0_T01.dpt_cd.asc(),
						S0_T01.loc_cd.asc(),
						S0_T01.oper_cd.asc(),
						S0_T01.bp_cd.asc(),
						S0_T01.ctg_cd.asc(),
						S0_T01.itm_cd.asc(),
						S0_T01.itm_sub1.asc(),
						S0_T01.itm_sub2.asc(),
						S0_T01.itm_sub3.asc(),
						S0_T01.lot_no.asc(),
						S0_T01.sublot_no.asc(),
						S0_T01.sno1.asc(),
						S0_T01.sno2.asc(),
						S0_T01.sno3.asc(),
						S0_T01.sno4.asc(),
						S0_T01.itm_mfg_inst_no.asc(),
						S0_T01.iv_no.asc(),
						S0_T01.po_no.asc(),
						S0_T01.slo_no.asc(),
						S0_T01.alc_ac_cd.asc(),
						S0_T01.trd_wg_cd.asc()
					)
			);
	}
	
	static MCQueryPlan MGBGL0150_MGT_PRE_RATE_MLY_S01(List<String> bindList, boolean plnFlg, boolean actFlg) {
		MGT_PRE_RATE_MLY_R S0T01 = MGT_PRE_RATE_MLY_R.create("T01");
		MAM_TERM_R S0M51 = MAM_TERM_R.create("M51");
		MAM_COST_DPT_R S0M01 = MAM_COST_DPT_R.create("M01");
		MAM_LOC_R S0M02 = MAM_LOC_R.create("M02");
		MAM_OPER_R S0M03 = MAM_OPER_R.create("M03");
		MAM_BP_R S0M04 = MAM_BP_R.create("M04");
		MAM_COST_CTG_R S0M05 = MAM_COST_CTG_R.create("M05");
		MAM_ITM_R S0M06 = MAM_ITM_R.create("M06");
		MAM_ALC_AC_R S0M07 = MAM_ALC_AC_R.create("M07");
		MAVM_RD_WG_R S0M08 = MAVM_RD_WG_R.create("M08");
		MAM_SUNDRY_ITM_R S0M09 = MAM_SUNDRY_ITM_R.create("M09");

		return createQueryPlan()
			.setQuery(
				sql("MGBGL0150_MGT_PRE_RATE_MLY_Query_S01")
				.mainQuery()
				.select(
					MGBGL0150_MGT_PRE_RATE_MLY_S01_SELECT(bindList, plnFlg, actFlg, 
						S0T01.pre_alc_rate_cd,
						S0T01.calc_ctg_cd,
						S0T01.dpt_cd,
						S0M01.dpt_nm,
						S0T01.loc_cd,
						S0M02.loc_nm,
						S0T01.oper_cd,
						S0M03.oper_nm,
						S0T01.bp_cd,
						S0M04.bp_nm,
						S0T01.ctg_cd,
						S0M05.ctg_nm,
						S0T01.itm_cd,
						S0T01.itm_sub1,
						S0T01.itm_sub2,
						S0T01.itm_sub3,
						nvl(
							S0M09.itm_nm,
							S0M06.itm_nm
						).as("itm_nm"),
						S0T01.lot_no,
						S0T01.sublot_no,
						S0T01.sno1,
						S0T01.sno2,
						S0T01.sno3,
						S0T01.sno4,
						S0T01.itm_mfg_inst_no,
						S0T01.iv_no,
						S0T01.po_no,
						S0T01.slo_no,
						S0T01.alc_ac_cd,
						S0M07.alc_ac_nm,
						S0T01.trd_wg_cd,
						S0M08.wg_nm.as("trd_wg_nm"))
				)
				.from(
					S0T01
					.innerJoin(S0M51).on(
						bracket(
							S0M51.term.lte(S0T01.ym)
							.and(S0T01.ym.lt(S0M51.term_end_ym))
						)
					)
					.leftOuterJoin(S0M01).on(
						bracket(
							S0M01.dpt_cd.eq(S0T01.dpt_cd)
							.and(S0M01.term.eq(S0M51.term))
						)
					)
					.leftOuterJoin(S0M02).on(
						bracket(
							S0M02.loc_cd.eq(S0T01.loc_cd)
						)
					)
					.leftOuterJoin(S0M03).on(
						bracket(
							S0M03.oper_cd.eq(S0T01.oper_cd)
						)
					)
					.leftOuterJoin(S0M04).on(
						bracket(
							S0M04.bp_cd.eq(S0T01.bp_cd)
						)
					)
					.leftOuterJoin(S0M05).on(
						bracket(
							S0M05.ctg_cd.eq(S0T01.ctg_cd)
						)
					)
					.leftOuterJoin(S0M06).on(
						bracket(
							S0M06.itm_cd.eq(S0T01.itm_cd)
							.and(S0M06.itm_sub1.eq(S0T01.itm_sub1))
							.and(S0M06.itm_sub2.eq(S0T01.itm_sub2))
							.and(S0M06.itm_sub3.eq(S0T01.itm_sub3))
						)
					)
					.leftOuterJoin(S0M07).on(
						bracket(
							S0M07.alc_ac_cd.eq(S0T01.alc_ac_cd)
						)
					)
					.leftOuterJoin(S0M08).on(
						bracket(
							S0M08.wg_cd.eq(S0T01.trd_wg_cd)
						)
					)
					.leftOuterJoin(S0M09).on(
						bracket(
							S0M09.itm_cd.eq(S0T01.itm_cd)
							.and(S0M09.itm_sub1.eq(S0T01.itm_sub1))
							.and(S0M09.itm_sub2.eq(S0T01.itm_sub2))
							.and(S0M09.itm_sub3.eq(S0T01.itm_sub3))
							.and(S0M09.sno1.eq(S0T01.sno1))
							.and(S0M09.sno2.eq(S0T01.sno2))
							.and(S0M09.sno3.eq(S0T01.sno3))
							.and(S0M09.sno4.eq(S0T01.sno4))
						)
					)
				)
				.where(
					value(0).eq(value(0))
					.and(S0T01.ym.between(bind("ym_fr"), bind("ym_to")))
					.and(S0T01.pre_alc_rate_cd.eq(bind("pre_alc_rate_cd")))
					.and(S0T01.wg_cd.eq(bind("wg_cd")))
					.cutoff$and(
						S0T01.calc_ctg_cd.eq(bind("pln_only"))
						.and(S0T01.sa_typ.eq(value(MAC_SA_TYP.PLN.value())))
					)
					.cutoff$and(
						S0T01.calc_ctg_cd.eq(bind("act_only"))
						.and(S0T01.sa_typ.eq(value(MAC_SA_TYP.ACT.value())))
					)
					.cutoff$and(
						bracket(
							bracket(
								S0T01.calc_ctg_cd.eq(bind("pln"))
								.and(S0T01.sa_typ.eq(value(MAC_SA_TYP.PLN.value())))
							)
							.or(
								S0T01.calc_ctg_cd.eq(bind("act"))
								.and(S0T01.sa_typ.eq(value(MAC_SA_TYP.ACT.value())))
							)
						)
					)
				)
				.groupBy(
					S0T01.pre_alc_rate_cd,
					S0T01.calc_ctg_cd,
					S0T01.dpt_cd,
					S0M01.dpt_nm,
					S0T01.loc_cd,
					S0M02.loc_nm,
					S0T01.oper_cd,
					S0M03.oper_nm,
					S0T01.bp_cd,
					S0M04.bp_nm,
					S0T01.ctg_cd,
					S0M05.ctg_nm,
					S0T01.itm_cd,
					S0T01.itm_sub1,
					S0T01.itm_sub2,
					S0T01.itm_sub3,
					nvl(
						S0M09.itm_nm,
						S0M06.itm_nm
					),
					S0T01.lot_no,
					S0T01.sublot_no,
					S0T01.sno1,
					S0T01.sno2,
					S0T01.sno3,
					S0T01.sno4,
					S0T01.itm_mfg_inst_no,
					S0T01.iv_no,
					S0T01.po_no,
					S0T01.slo_no,
					S0T01.alc_ac_cd,
					S0M07.alc_ac_nm,
					S0T01.trd_wg_cd,
					S0M08.wg_nm
				)
				.orderBy(
					S0T01.dpt_cd.asc(),
					S0T01.loc_cd.asc(),
					S0T01.oper_cd.asc(),
					S0T01.bp_cd.asc(),
					S0T01.ctg_cd.asc(),
					S0T01.itm_cd.asc(),
					S0T01.itm_sub1.asc(),
					S0T01.itm_sub2.asc(),
					S0T01.itm_sub3.asc(),
					S0T01.lot_no.asc(),
					S0T01.sublot_no.asc(),
					S0T01.sno1.asc(),
					S0T01.sno2.asc(),
					S0T01.sno3.asc(),
					S0T01.sno4.asc(),
					S0T01.itm_mfg_inst_no.asc(),
					S0T01.iv_no.asc(),
					S0T01.po_no.asc(),
					S0T01.slo_no.asc(),
					S0T01.alc_ac_cd.asc(),
					S0T01.trd_wg_cd.asc()
				)
			);
	}

	static protected MCColumnGroup[] MGBGL0150_MGT_PRE_RATE_MLY_S01_SELECT(List<String> bindList, boolean plnFlg, boolean actFlg, MCColumnGroup...columnGroups) {
		MGT_PRE_RATE_MLY_R S0T01 = MGT_PRE_RATE_MLY_R.create("T01");
		List<MCColumnGroup> l = new ArrayList<MCColumnGroup>();
		l.addAll(Arrays.asList(columnGroups));
		for (String b : bindList) {
			if (plnFlg) {
				l.add(
						nullIf(nvl(sum(decode(S0T01.ym, bind(b),
								decode(S0T01.sa_typ,value(MAC_SA_TYP.PLN.value()),S0T01.pre_alc_rate,value(0)), value(0))), value(0)), value(0))
										.as(b.replace("ym", "pln")));
			}
			if (actFlg) {
				l.add(
						nullIf(nvl(sum(decode(S0T01.ym, bind(b),
								decode(S0T01.sa_typ,value(MAC_SA_TYP.ACT.value()),S0T01.pre_alc_rate,value(0)), value(0))), value(0)), value(0))
										.as(b.replace("ym", "act")));
			}
		}
		return l.toArray(new MCColumnGroup[0]);
	}
	
	/**
	 * -- MGBGL0150_MGT_PRE_RATE_TERM_Query_S01
	 */
	static MCQueryPlan MGBGL0150_MGT_PRE_RATE_TERM_S01() {
		MGT_PRE_RATE_TERM_R S0_T01 = MGT_PRE_RATE_TERM_R.create("T01");
		MAM_TERM_R S0_M51 = MAM_TERM_R.create("M51");
		MAM_COST_DPT_R S0_M01 = MAM_COST_DPT_R.create("M01");
		MAM_LOC_R S0_M02 = MAM_LOC_R.create("M02");
		MAM_OPER_R S0_M03 = MAM_OPER_R.create("M03");
		MAM_BP_R S0_M04 = MAM_BP_R.create("M04");
		MAM_COST_CTG_R S0_M05 = MAM_COST_CTG_R.create("M05");
		MAM_ITM_R S0_M06 = MAM_ITM_R.create("M06");
		MAM_ALC_AC_R S0_M07 = MAM_ALC_AC_R.create("M07");
		MAVM_RD_WG_R S0_M08 = MAVM_RD_WG_R.create("M08");
		MAM_SUNDRY_ITM_R S0_M09 = MAM_SUNDRY_ITM_R.create("M09");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBGL0150_MGT_PRE_RATE_TERM_Query_S01")
					.mainQuery()
					.select(
						S0_T01.pre_alc_rate_cd,
						S0_T01.calc_ctg_cd,
						S0_T01.dpt_cd,
						S0_M01.dpt_nm,
						S0_T01.loc_cd,
						S0_M02.loc_nm,
						S0_T01.oper_cd,
						S0_M03.oper_nm,
						S0_T01.bp_cd,
						S0_M04.bp_nm,
						S0_T01.ctg_cd,
						S0_M05.ctg_nm,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						nvl(
							S0_M09.itm_nm,
							S0_M06.itm_nm
						).as("itm_nm"),
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_T01.sno1,
						S0_T01.sno2,
						S0_T01.sno3,
						S0_T01.sno4,
						S0_T01.itm_mfg_inst_no,
						S0_T01.iv_no,
						S0_T01.po_no,
						S0_T01.slo_no,
						S0_T01.alc_ac_cd,
						S0_M07.alc_ac_nm,
						S0_T01.trd_wg_cd,
						S0_M08.wg_nm.as("col_all")
					)
					.from(
						S0_T01
						.innerJoin(S0_M51).on(
							bracket(
								S0_M51.term.eq(S0_T01.term)
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_M01.dpt_cd.eq(S0_T01.dpt_cd)
								.and(S0_M01.term.eq(S0_M51.term))
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_M02.loc_cd.eq(S0_T01.loc_cd)
							)
						)
						.leftOuterJoin(S0_M03).on(
							bracket(
								S0_M03.oper_cd.eq(S0_T01.oper_cd)
							)
						)
						.leftOuterJoin(S0_M04).on(
							bracket(
								S0_M04.bp_cd.eq(S0_T01.bp_cd)
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_M05.ctg_cd.eq(S0_T01.ctg_cd)
							)
						)
						.leftOuterJoin(S0_M06).on(
							bracket(
								S0_M06.itm_cd.eq(S0_T01.itm_cd)
								.and(S0_M06.itm_sub1.eq(S0_T01.itm_sub1))
								.and(S0_M06.itm_sub2.eq(S0_T01.itm_sub2))
								.and(S0_M06.itm_sub3.eq(S0_T01.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M07).on(
							bracket(
								S0_M07.alc_ac_cd.eq(S0_T01.alc_ac_cd)
							)
						)
						.leftOuterJoin(S0_M08).on(
							bracket(
								S0_M08.wg_cd.eq(S0_T01.trd_wg_cd)
							)
						)
						.leftOuterJoin(S0_M09).on(
							bracket(
								S0_M09.itm_cd.eq(S0_T01.itm_cd)
								.and(S0_M09.itm_sub1.eq(S0_T01.itm_sub1))
								.and(S0_M09.itm_sub2.eq(S0_T01.itm_sub2))
								.and(S0_M09.itm_sub3.eq(S0_T01.itm_sub3))
								.and(S0_M09.sno1.eq(S0_T01.sno1))
								.and(S0_M09.sno2.eq(S0_T01.sno2))
								.and(S0_M09.sno3.eq(S0_T01.sno3))
								.and(S0_M09.sno4.eq(S0_T01.sno4))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.term.between(bind("term_fr"), bind("term_to")))
						.and(S0_T01.pre_alc_rate_cd.eq(bind("pre_alc_rate_cd")))
						.and(S0_T01.wg_cd.eq(bind("wg_cd")))
						.and(S0_T01.calc_ctg_cd.eq(bind("calc_ctg_cd")))
					)
					.groupBy(
						S0_T01.pre_alc_rate_cd,
						S0_T01.calc_ctg_cd,
						S0_T01.dpt_cd,
						S0_M01.dpt_nm,
						S0_T01.loc_cd,
						S0_M02.loc_nm,
						S0_T01.oper_cd,
						S0_M03.oper_nm,
						S0_T01.bp_cd,
						S0_M04.bp_nm,
						S0_T01.ctg_cd,
						S0_M05.ctg_nm,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						nvl(
							S0_M09.itm_nm,
							S0_M06.itm_nm
						),
						S0_T01.lot_no,
						S0_T01.sublot_no,
						S0_T01.sno1,
						S0_T01.sno2,
						S0_T01.sno3,
						S0_T01.sno4,
						S0_T01.itm_mfg_inst_no,
						S0_T01.iv_no,
						S0_T01.po_no,
						S0_T01.slo_no,
						S0_T01.alc_ac_cd,
						S0_M07.alc_ac_nm,
						S0_T01.trd_wg_cd,
						S0_M08.wg_nm
					)
					.orderBy(
						S0_T01.dpt_cd.asc(),
						S0_T01.loc_cd.asc(),
						S0_T01.oper_cd.asc(),
						S0_T01.bp_cd.asc(),
						S0_T01.ctg_cd.asc(),
						S0_T01.itm_cd.asc(),
						S0_T01.itm_sub1.asc(),
						S0_T01.itm_sub2.asc(),
						S0_T01.itm_sub3.asc(),
						S0_T01.lot_no.asc(),
						S0_T01.sublot_no.asc(),
						S0_T01.sno1.asc(),
						S0_T01.sno2.asc(),
						S0_T01.sno3.asc(),
						S0_T01.sno4.asc(),
						S0_T01.itm_mfg_inst_no.asc(),
						S0_T01.iv_no.asc(),
						S0_T01.po_no.asc(),
						S0_T01.slo_no.asc(),
						S0_T01.alc_ac_cd.asc(),
						S0_T01.trd_wg_cd.asc()
					)
			);
	}
	
	static MCQueryPlan MGBGL0150_MGT_PRE_RATE_TERM_S01(List<String> bindList) {
		MGT_PRE_RATE_TERM_R S0T01 = MGT_PRE_RATE_TERM_R.create("T01");
		MAM_TERM_R S0M51 = MAM_TERM_R.create("M51");
		MAM_COST_DPT_R S0M01 = MAM_COST_DPT_R.create("M01");
		MAM_LOC_R S0M02 = MAM_LOC_R.create("M02");
		MAM_OPER_R S0M03 = MAM_OPER_R.create("M03");
		MAM_BP_R S0M04 = MAM_BP_R.create("M04");
		MAM_COST_CTG_R S0M05 = MAM_COST_CTG_R.create("M05");
		MAM_ITM_R S0M06 = MAM_ITM_R.create("M06");
		MAM_ALC_AC_R S0M07 = MAM_ALC_AC_R.create("M07");
		MAVM_RD_WG_R S0M08 = MAVM_RD_WG_R.create("M08");
		MAM_SUNDRY_ITM_R S0M09 = MAM_SUNDRY_ITM_R.create("M09");

		return createQueryPlan()
			.setQuery(
				sql("MGBGL0150_MGT_PRE_RATE_TERM_Query_S01")
				.mainQuery()
				.select(
					MGBGL0150_MGT_PRE_RATE_TERM_S01_SELECT(bindList,
							S0T01.pre_alc_rate_cd,
							S0T01.calc_ctg_cd,
							S0T01.dpt_cd,
							S0M01.dpt_nm,
							S0T01.loc_cd,
							S0M02.loc_nm,
							S0T01.oper_cd,
							S0M03.oper_nm,
							S0T01.bp_cd,
							S0M04.bp_nm,
							S0T01.ctg_cd,
							S0M05.ctg_nm,
							S0T01.itm_cd,
							S0T01.itm_sub1,
							S0T01.itm_sub2,
							S0T01.itm_sub3,
							nvl(
								S0M09.itm_nm,
								S0M06.itm_nm
							).as("itm_nm"),
							S0T01.lot_no,
							S0T01.sublot_no,
							S0T01.sno1,
							S0T01.sno2,
							S0T01.sno3,
							S0T01.sno4,
							S0T01.itm_mfg_inst_no,
							S0T01.iv_no,
							S0T01.po_no,
							S0T01.slo_no,
							S0T01.alc_ac_cd,
							S0M07.alc_ac_nm,
							S0T01.trd_wg_cd,
							S0M08.wg_nm.as("trd_wg_nm"))
				)
				.from(
					S0T01
					.innerJoin(S0M51).on(
						bracket(
							S0M51.term.eq(S0T01.term)
						)
					)
					.leftOuterJoin(S0M01).on(
						bracket(
							S0M01.dpt_cd.eq(S0T01.dpt_cd)
							.and(S0M01.term.eq(S0M51.term))
						)
					)
					.leftOuterJoin(S0M02).on(
						bracket(
							S0M02.loc_cd.eq(S0T01.loc_cd)
						)
					)
					.leftOuterJoin(S0M03).on(
						bracket(
							S0M03.oper_cd.eq(S0T01.oper_cd)
						)
					)
					.leftOuterJoin(S0M04).on(
						bracket(
							S0M04.bp_cd.eq(S0T01.bp_cd)
						)
					)
					.leftOuterJoin(S0M05).on(
						bracket(
							S0M05.ctg_cd.eq(S0T01.ctg_cd)
						)
					)
					.leftOuterJoin(S0M06).on(
						bracket(
							S0M06.itm_cd.eq(S0T01.itm_cd)
							.and(S0M06.itm_sub1.eq(S0T01.itm_sub1))
							.and(S0M06.itm_sub2.eq(S0T01.itm_sub2))
							.and(S0M06.itm_sub3.eq(S0T01.itm_sub3))
						)
					)
					.leftOuterJoin(S0M07).on(
						bracket(
							S0M07.alc_ac_cd.eq(S0T01.alc_ac_cd)
						)
					)
					.leftOuterJoin(S0M08).on(
						bracket(
							S0M08.wg_cd.eq(S0T01.trd_wg_cd)
						)
					)
					.leftOuterJoin(S0M09).on(
						bracket(
							S0M09.itm_cd.eq(S0T01.itm_cd)
							.and(S0M09.itm_sub1.eq(S0T01.itm_sub1))
							.and(S0M09.itm_sub2.eq(S0T01.itm_sub2))
							.and(S0M09.itm_sub3.eq(S0T01.itm_sub3))
							.and(S0M09.sno1.eq(S0T01.sno1))
							.and(S0M09.sno2.eq(S0T01.sno2))
							.and(S0M09.sno3.eq(S0T01.sno3))
							.and(S0M09.sno4.eq(S0T01.sno4))
						)
					)
				)
				.where(
					value(0).eq(value(0))
					.and(S0T01.term.between(bind("term_fr"), bind("term_to")))
					.and(S0T01.pre_alc_rate_cd.eq(bind("pre_alc_rate_cd")))
					.and(S0T01.wg_cd.eq(bind("wg_cd")))
					.and(S0T01.calc_ctg_cd.eq(bind("calc_ctg_cd")))
				)
				.groupBy(
					S0T01.pre_alc_rate_cd,
					S0T01.calc_ctg_cd,
					S0T01.dpt_cd,
					S0M01.dpt_nm,
					S0T01.loc_cd,
					S0M02.loc_nm,
					S0T01.oper_cd,
					S0M03.oper_nm,
					S0T01.bp_cd,
					S0M04.bp_nm,
					S0T01.ctg_cd,
					S0M05.ctg_nm,
					S0T01.itm_cd,
					S0T01.itm_sub1,
					S0T01.itm_sub2,
					S0T01.itm_sub3,
					nvl(
						S0M09.itm_nm,
						S0M06.itm_nm
					),
					S0T01.lot_no,
					S0T01.sublot_no,
					S0T01.sno1,
					S0T01.sno2,
					S0T01.sno3,
					S0T01.sno4,
					S0T01.itm_mfg_inst_no,
					S0T01.iv_no,
					S0T01.po_no,
					S0T01.slo_no,
					S0T01.alc_ac_cd,
					S0M07.alc_ac_nm,
					S0T01.trd_wg_cd,
					S0M08.wg_nm
				)
				.orderBy(
					S0T01.dpt_cd.asc(),
					S0T01.loc_cd.asc(),
					S0T01.oper_cd.asc(),
					S0T01.bp_cd.asc(),
					S0T01.ctg_cd.asc(),
					S0T01.itm_cd.asc(),
					S0T01.itm_sub1.asc(),
					S0T01.itm_sub2.asc(),
					S0T01.itm_sub3.asc(),
					S0T01.lot_no.asc(),
					S0T01.sublot_no.asc(),
					S0T01.sno1.asc(),
					S0T01.sno2.asc(),
					S0T01.sno3.asc(),
					S0T01.sno4.asc(),
					S0T01.itm_mfg_inst_no.asc(),
					S0T01.iv_no.asc(),
					S0T01.po_no.asc(),
					S0T01.slo_no.asc(),
					S0T01.alc_ac_cd.asc(),
					S0T01.trd_wg_cd.asc()
				)
			);
	}

	static protected MCColumnGroup[] MGBGL0150_MGT_PRE_RATE_TERM_S01_SELECT(List<String> bindList, MCColumnGroup...columnGroups) {
		MGT_PRE_RATE_TERM_R S0T01 = MGT_PRE_RATE_TERM_R.create("T01");
		List<MCColumnGroup> l = new ArrayList<MCColumnGroup>();
		l.addAll(Arrays.asList(columnGroups));
		for (String b : bindList) {
			l.add(nullIf(
					nvl(sum(decode(S0T01.term, bind(b), S0T01.pre_alc_rate, value(0))),
							value(0)),
					value(0)).as(b));
		}
		return l.toArray(new MCColumnGroup[0]);
	}
}