package mcframe.serverMSBD.MSBDL0170;

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
	 * -- MSBDL0170_MST_PURC_RET_ACT_Query_S01
	 */
	static MCQueryPlan MSBDL0170_MST_PURC_RET_ACT_S01() {
		MST_PURC_RET_ACT_R S0_T1 = MST_PURC_RET_ACT_R.create("T1");
		MST_PURC_ACT_R S0_T2 = MST_PURC_ACT_R.create("T2");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_USR_R S0_M6 = MAM_USR_R.create("M6");
		MAM_CUR_R S0_M7 = MAM_CUR_R.create("M7");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
		MAM_BP_GRP_R S0_MM1 = MAM_BP_GRP_R.create("MM1");
		MAM_BP_GRP_R S0_MM2 = MAM_BP_GRP_R.create("MM2");
		MAM_BP_GRP_R S0_MM3 = MAM_BP_GRP_R.create("MM3");
		MAM_BP_GRP_R S0_MM4 = MAM_BP_GRP_R.create("MM4");
		MAM_BP_GRP_R S0_MM5 = MAM_BP_GRP_R.create("MM5");
		MAM_BP_GRP_R S0_MM6 = MAM_BP_GRP_R.create("MM6");
		MAM_BP_GRP_R S0_MM7 = MAM_BP_GRP_R.create("MM7");
		MAM_BP_GRP_R S0_MM8 = MAM_BP_GRP_R.create("MM8");
		MAM_BP_GRP_R S0_MM9 = MAM_BP_GRP_R.create("MM9");
		MAM_BP_GRP_R S0_MM10 = MAM_BP_GRP_R.create("MM10");
		MST_PURC_ACT_R S1_PURC = MST_PURC_ACT_R.create("PURC");
		MST_PURC_ACT_D_R S0_T3 = MST_PURC_ACT_D_R.create("T3");
		MAM_ITM_R itmR = MAM_ITM_R.create("ITM");
		MCTempView S0_T3_TempView = createTempView("S0_T3_View");
		MCSingleView S0_T3_View = subQuery().select(
				S0_T3.purc_act_no,
				S0_T3.purc_act_seq,
				sum(
					decode(
						itmR.dscnt_itm_flg,
						value(true),
						S0_T3.trd_cur_amt.multiply(value(-1)).add(
							bracket(
								S0_T3.trd_cur_tax_amt.multiply(value(-1))
							)
						),
						S0_T3.trd_cur_amt.add(S0_T3.trd_cur_tax_amt))
				).as("trd_cur_amt_inc_tax_cur_amt")
				)
				.from(
						S0_T3
						.leftOuterJoin(itmR).on(
							bracket(
								S0_T3.itm_cd.eq(itmR.itm_cd)
								.and(S0_T3.itm_sub1.eq(itmR.itm_sub1))
								.and(S0_T3.itm_sub2.eq(itmR.itm_sub2))
								.and(S0_T3.itm_sub3.eq(itmR.itm_sub3))
							)
						)
				)
				.groupBy(
				S0_T3.purc_act_no,
				S0_T3.purc_act_seq
				).view(S0_T3_TempView);
		
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0170_MST_PURC_RET_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.sppl_cd,
						S0_M2.bp_nm.as("sppl_nm"),
						S0_T2.asppl_cd,
						S0_T1.ret_sppl_nm,
						S0_T1.ret_sppl_cntct_dpt,
						S0_T1.ret_sppl_cntct_psn,
						S0_T1.ret_sppl_cntct_psn_title,
						S0_T1.ret_sppl_zip_cd,
						S0_T1.ret_sppl_addr1,
						S0_T1.ret_sppl_addr2,
						S0_T1.ret_sppl_addr3,
						S0_T1.ret_sppl_addr4,
						S0_T1.ret_sppl_tel,
						S0_T1.ret_sppl_fax,
						S0_T1.ret_sppl_fax,
						S0_T1.rcpt_iv_no,
						S0_T1.ref_rcpt_iv_no,
						S0_T1.purc_dpt_cd,
						S0_M4.dpt_nm.as("purc_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.purc_usr_cd,
						S0_T1.purc_ret_print_dt,
						S0_T1.purc_ret_print_flg,
						S0_T1.purc_ret_dt,
						S0_T1.ac_dt,
						S0_T2.trd_cur_cd,
						S0_T2.xrate,
						S0_T2.base_cur_cd,
						S0_T2.ptax_cur_cd,
						S0_T2.ptax_dt,
						S0_T2.ptax_xrate,
						S0_T2.tterm_cd1,
						S0_T2.tterm_rmrks1,
						S0_T2.tterm_cd2,
						S0_T2.tterm_rmrks2,
						S0_T2.tterm_cd3,
						S0_T2.tterm_rmrks3,
						S0_T1.purc_ret_print_rmrks,
						S0_T1.trd_rmrks.as("act_trd_rmrks"),
						S0_T1.intr_rmrks.as("act_intr_rmrks"),
						S0_T1.purc_ret_act_no,
						S0_T1.purc_ret_act_rev,
						S0_T1.purc_ret_schd_no,
						S0_T1.sub_char1.as("act_sub_char1"),
						S0_T1.sub_char2.as("act_sub_char2"),
						S0_T1.sub_char3.as("act_sub_char3"),
						S0_T1.can_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T3_TempView.pr("trd_cur_amt_inc_tax_cur_amt"),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.purc_ret_act_no.eq(S0_T2.purc_ret_act_no)
								.and(S0_T1.purc_ret_act_rev.eq(S0_T2.purc_ret_act_rev))
								.and(
									bind("inc_can_flg").eq(value(false))
									.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									.or(
										bind("inc_can_flg").eq(value(true))
										.and(
											bracket(
												S0_T1.can_flg.eq(value(true))
												.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
												.and(
													S0_T2.purc_act_rev.in(
														subQuery()
														.select(max(S1_PURC.purc_act_rev).as("purc_act_rev"))
														.from(S1_PURC)
														.where(
															S1_PURC.purc_ret_act_no.eq(S0_T2.purc_ret_act_no)
															.and(S1_PURC.purc_ret_act_rev.eq(S0_T2.purc_ret_act_rev))
															.and(S1_PURC.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
														)
													)
												)
											)
											.or(
												S0_T1.can_flg.eq(value(false))
												.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
											)
										)
									)
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_V1.dpt_cd)
							)
						)
						.leftOuterJoin(S0_T3_View)
						.on(
							value(0).eq(value(0))
							.and(S0_T3_TempView.pr(MST_PURC_ACT_D_R.$purc_act_no).eq(S0_T2.purc_act_no))
							.and(S0_T3_TempView.pr(MST_PURC_ACT_D_R.$purc_act_seq).eq(S0_T2.purc_act_seq))
						)
						.addDynamicView()
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bind("inc_can_flg").eq(value(true))
							.or(
								bind("inc_can_flg").eq(value(false))
								.and(S0_T1.can_flg.eq(value(false)))
							)
						)
						.and(
							bracket(
								bind("not_issue_flg").eq(value(true))
								.and(S0_T1.purc_ret_print_flg.eq(value(false)))
							)
							.or(
								bind("issue_flg").eq(value(true))
								.and(S0_T1.purc_ret_print_flg.eq(value(true)))
							)
						)
						.and(
							bracket(
								bind("iv_trgt_flg").eq(value(true))
								.and(S0_M2.sppl_iv_flg.eq(value(true)))
							)
							.or(
								bind("iv_not_trgt_flg").eq(value(true))
								.and(S0_M2.sppl_iv_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.purc_ret_print_dt.gte(bind("purc_ret_print_dt_fr")))
						.cutoff$and(S0_T1.purc_ret_print_dt.lte(bind("purc_ret_print_dt_to")))
						.cutoff$and(S0_T1.purc_ret_dt.gte(bind("purc_ret_dt_fr")))
						.cutoff$and(S0_T1.purc_ret_dt.lte(bind("purc_ret_dt_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_T1.ret_sppl_nm.like(bind("ret_sppl_nm")))
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("purc_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("purc_dpt_wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_T2.po_no.like(bind("po_no")))
						.cutoff$and(S0_T1.purc_ret_act_no.like(bind("purc_ret_act_no")))
						.cutoff$and(S0_T1.purc_ret_schd_no.like(bind("purc_ret_schd_no")))
						.cutoff$and(S0_T2.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.purc_ret_print_rmrks.like(bind("purc_ret_print_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("act_trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("act_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("act_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("act_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("act_sub_char3")))
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T1.purc_ret_act_no.asc(),
						S0_T1.purc_ret_act_rev.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("purc_dpt_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("purc_dpt_wg_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T1.purc_usr_cd.eq(S0_M6.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T2.trd_cur_cd.eq(S0_M7.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("purc_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					})
				)
			);
	}
	/**
	 * -- MSBDL0170_MST_PURC_RET_ACT_P_Query_S01
	 */
	static MCQueryPlan MSBDL0170_MST_PURC_RET_ACT_P_S01() {
		MST_PURC_RET_ACT_P_R S0_T1 = MST_PURC_RET_ACT_P_R.create("T1");
		MST_PURC_ACT_R S0_T2 = MST_PURC_ACT_R.create("T2");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_USR_R S0_M6 = MAM_USR_R.create("M6");
		MAM_CUR_R S0_M7 = MAM_CUR_R.create("M7");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
		MAM_BP_GRP_R S0_MM1 = MAM_BP_GRP_R.create("MM1");
		MAM_BP_GRP_R S0_MM2 = MAM_BP_GRP_R.create("MM2");
		MAM_BP_GRP_R S0_MM3 = MAM_BP_GRP_R.create("MM3");
		MAM_BP_GRP_R S0_MM4 = MAM_BP_GRP_R.create("MM4");
		MAM_BP_GRP_R S0_MM5 = MAM_BP_GRP_R.create("MM5");
		MAM_BP_GRP_R S0_MM6 = MAM_BP_GRP_R.create("MM6");
		MAM_BP_GRP_R S0_MM7 = MAM_BP_GRP_R.create("MM7");
		MAM_BP_GRP_R S0_MM8 = MAM_BP_GRP_R.create("MM8");
		MAM_BP_GRP_R S0_MM9 = MAM_BP_GRP_R.create("MM9");
		MAM_BP_GRP_R S0_MM10 = MAM_BP_GRP_R.create("MM10");
		MST_PURC_ACT_D_R S0_T3 = MST_PURC_ACT_D_R.create("T3");
		MCTempView S0_T3_TempView = createTempView("S0_T3_View");
		MCSingleView S0_T3_View = subQuery().select(
				S0_T3.purc_act_no,
				S0_T3.purc_act_seq,
				sum(S0_T3.trd_cur_amt).add(sum(S0_T3.trd_cur_tax_amt)).as("trd_cur_amt_inc_tax_cur_amt")
				)
				.from(
						S0_T3
				)
				.groupBy(
				S0_T3.purc_act_no,
				S0_T3.purc_act_seq
				).view(S0_T3_TempView);
		
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0170_MST_PURC_RET_ACT_P_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.sppl_cd,
						S0_M2.bp_nm.as("sppl_nm"),
						S0_T2.asppl_cd,
						S0_T1.ret_sppl_nm,
						S0_T1.ret_sppl_cntct_dpt,
						S0_T1.ret_sppl_cntct_psn,
						S0_T1.ret_sppl_cntct_psn_title,
						S0_T1.ret_sppl_zip_cd,
						S0_T1.ret_sppl_addr1,
						S0_T1.ret_sppl_addr2,
						S0_T1.ret_sppl_addr3,
						S0_T1.ret_sppl_addr4,
						S0_T1.ret_sppl_tel,
						S0_T1.ret_sppl_fax,
						S0_T1.ret_sppl_fax,
						S0_T1.rcpt_iv_no,
						S0_T1.ref_rcpt_iv_no,
						S0_T1.purc_dpt_cd,
						S0_M4.dpt_nm.as("purc_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.purc_usr_cd,
						S0_T1.purc_ret_print_dt,
						S0_T1.purc_ret_print_flg,
						S0_T1.purc_ret_dt,
						S0_T1.ac_dt,
						S0_T2.trd_cur_cd,
						S0_T2.xrate,
						S0_T2.base_cur_cd,
						S0_T2.ptax_cur_cd,
						S0_T2.ptax_dt,
						S0_T2.ptax_xrate,
						S0_T2.tterm_cd1,
						S0_T2.tterm_rmrks1,
						S0_T2.tterm_cd2,
						S0_T2.tterm_rmrks2,
						S0_T2.tterm_cd3,
						S0_T2.tterm_rmrks3,
						S0_T1.purc_ret_print_rmrks,
						S0_T1.trd_rmrks.as("act_trd_rmrks"),
						S0_T1.intr_rmrks.as("act_intr_rmrks"),
						S0_T1.purc_ret_act_no,
						S0_T1.purc_ret_act_rev,
						S0_T1.purc_ret_schd_no,
						S0_T1.sub_char1.as("act_sub_char1"),
						S0_T1.sub_char2.as("act_sub_char2"),
						S0_T1.sub_char3.as("act_sub_char3"),
						S0_T1.can_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T3_TempView.pr("trd_cur_amt_inc_tax_cur_amt"),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.purc_ret_act_no.eq(S0_T2.purc_ret_act_no)
								.and(S0_T1.purc_ret_act_rev.eq(S0_T2.purc_ret_act_rev))
								.and(
									S0_T2.slip_sts_typ.in(value(MAC_SLIP_STS_TYP.CRT.value()),value(MAC_SLIP_STS_TYP.DIS.value()))
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_V1.dpt_cd)
							)
						)
						.leftOuterJoin(S0_T3_View)
						.on(
							value(0).eq(value(0))
							.and(S0_T3_TempView.pr(MST_PURC_ACT_D_R.$purc_act_no).eq(S0_T2.purc_act_no))
							.and(S0_T3_TempView.pr(MST_PURC_ACT_D_R.$purc_act_seq).eq(S0_T2.purc_act_seq))
						)
						.addDynamicView()
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("not_issue_flg").eq(value(true))
								.and(S0_T1.purc_ret_print_flg.eq(value(false)))
							)
							.or(
								bind("issue_flg").eq(value(true))
								.and(S0_T1.purc_ret_print_flg.eq(value(true)))
							)
						)
						.and(
							bracket(
								bind("iv_trgt_flg").eq(value(true))
								.and(S0_M2.sppl_iv_flg.eq(value(true)))
							)
							.or(
								bind("iv_not_trgt_flg").eq(value(true))
								.and(S0_M2.sppl_iv_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.purc_ret_print_dt.gte(bind("purc_ret_print_dt_fr")))
						.cutoff$and(S0_T1.purc_ret_print_dt.lte(bind("purc_ret_print_dt_to")))
						.cutoff$and(S0_T1.purc_ret_dt.gte(bind("purc_ret_dt_fr")))
						.cutoff$and(S0_T1.purc_ret_dt.lte(bind("purc_ret_dt_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_T1.ret_sppl_nm.like(bind("ret_sppl_nm")))
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("purc_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("purc_dpt_wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_T2.po_no.like(bind("po_no")))
						.cutoff$and(S0_T1.purc_ret_act_no.like(bind("purc_ret_act_no")))
						.cutoff$and(S0_T1.purc_ret_schd_no.like(bind("purc_ret_schd_no")))
						.cutoff$and(S0_T2.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.purc_ret_print_rmrks.like(bind("purc_ret_print_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("act_trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("act_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("act_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("act_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("act_sub_char3")))
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T1.purc_ret_act_no.asc(),
						S0_T1.purc_ret_act_rev.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("purc_dpt_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("purc_dpt_wg_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T1.purc_usr_cd.eq(S0_M6.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T2.trd_cur_cd.eq(S0_M7.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("purc_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					})
				)
			);
	}
	/**
	 * -- MSBDL0170_MST_PURC_RET_ACT_Query_S02
	 */
	static MCQueryPlan MSBDL0170_MST_PURC_RET_ACT_S02() {
		MST_PURC_RET_ACT_R S0_T1 = MST_PURC_RET_ACT_R.create("T1");
		MST_PURC_ACT_R S0_T2 = MST_PURC_ACT_R.create("T2");
		MST_PURC_RET_ACT_D_R S0_T3 = MST_PURC_RET_ACT_D_R.create("T3");
		MSVT_WRK_SNO_R S0_T4 = MSVT_WRK_SNO_R.create("T4");
		MST_PURC_ACT_D_R S0_T6 = MST_PURC_ACT_D_R.create("T6");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_USR_R S0_M6 = MAM_USR_R.create("M6");
		MAM_CUR_R S0_M7 = MAM_CUR_R.create("M7");
		MAM_CUR_R S0_M8 = MAM_CUR_R.create("M8");
		MAM_CUR_R S0_M9 = MAM_CUR_R.create("M9");
		MAM_TTERM_R S0_M10 = MAM_TTERM_R.create("M10");
		MAM_TTERM_R S0_M11 = MAM_TTERM_R.create("M11");
		MAM_TTERM_R S0_M12 = MAM_TTERM_R.create("M12");
		MAM_ITM_R S0_M13 = MAM_ITM_R.create("M13");
		MAM_ITM_TYP_D_R S0_M34 = MAM_ITM_TYP_D_R.create("M34");
		MAM_LOC_R S0_M14 = MAM_LOC_R.create("M14");
		MAM_SITE_R S0_M15 = MAM_SITE_R.create("M15");
		MAM_WG_R S0_M16 = MAM_WG_R.create("M16");
		MAM_STR_LN_R S0_M17 = MAM_STR_LN_R.create("M17");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_UNIT_R S0_M19 = MAM_UNIT_R.create("M19");
		MAM_BIZ_RSN_R S0_M20 = MAM_BIZ_RSN_R.create("M20");
		MAM_TAX_R S0_M21 = MAM_TAX_R.create("M21");
		MAM_STK_GD_R S0_M22 = MAM_STK_GD_R.create("M22");
		MAM_BIZ_RSN_R S0_M23 = MAM_BIZ_RSN_R.create("M23");
		MAM_DPT_R S0_M24 = MAM_DPT_R.create("M24");
		MAM_DPT_R S0_M25 = MAM_DPT_R.create("M25");
		MAM_ITM_R S0_M26 = MAM_ITM_R.create("M26");
		MAM_LOC_R S0_M27 = MAM_LOC_R.create("M27");
		MAM_COST_CTG_R S0_M28 = MAM_COST_CTG_R.create("M28");
		MAM_OPER_R S0_M29 = MAM_OPER_R.create("M29");
		MAM_UNIT_R S0_M30 = MAM_UNIT_R.create("M30");
		MAM_UNIT_R S0_M32 = MAM_UNIT_R.create("M32");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
		MAM_ITM_LCL_R S0_M33 = MAM_ITM_LCL_R.create("M33");
		MAM_BP_GRP_R S0_SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R S0_SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R S0_SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R S0_SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R S0_SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R S0_SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R S0_SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R S0_SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R S0_SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R S0_SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");
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
		MCTempView S1_T2 = createTempView("T2");
		MST_PURC_ACT_D_R S1_T6 = MST_PURC_ACT_D_R.create("T6");
		MSVT_WRK_SNO_R S1_T4 = MSVT_WRK_SNO_R.create("T4");
		MAM_TRD_R S1_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S1_M2 = MAM_BP_R.create("M2");
		MAM_BP_R S1_M3 = MAM_BP_R.create("M3");
		MAM_DPT_R S1_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S1_M5 = MAM_WG_R.create("M5");
		MAM_USR_R S1_M6 = MAM_USR_R.create("M6");
		MAM_CUR_R S1_M7 = MAM_CUR_R.create("M7");
		MAM_CUR_R S1_M8 = MAM_CUR_R.create("M8");
		MAM_CUR_R S1_M9 = MAM_CUR_R.create("M9");
		MAM_TTERM_R S1_M10 = MAM_TTERM_R.create("M10");
		MAM_TTERM_R S1_M11 = MAM_TTERM_R.create("M11");
		MAM_TTERM_R S1_M12 = MAM_TTERM_R.create("M12");
		MAM_ITM_R S1_M13 = MAM_ITM_R.create("M13");
		MAM_ITM_TYP_D_R S1_M34 = MAM_ITM_TYP_D_R.create("M34");
		MAM_BP_R S1_M18 = MAM_BP_R.create("M18");
		MAM_UNIT_R S1_M19 = MAM_UNIT_R.create("M19");
		MAM_BIZ_RSN_R S1_M20 = MAM_BIZ_RSN_R.create("M20");
		MAM_TAX_R S1_M21 = MAM_TAX_R.create("M21");
		MAM_STK_GD_R S1_M22 = MAM_STK_GD_R.create("M22");
		MAM_BIZ_RSN_R S1_M23 = MAM_BIZ_RSN_R.create("M23");
		MAM_DPT_R S1_M24 = MAM_DPT_R.create("M24");
		MAM_DPT_R S1_M25 = MAM_DPT_R.create("M25");
		MAM_ITM_R S1_M26 = MAM_ITM_R.create("M26");
		MAM_LOC_R S1_M27 = MAM_LOC_R.create("M27");
		MAM_COST_CTG_R S1_M28 = MAM_COST_CTG_R.create("M28");
		MAM_OPER_R S1_M29 = MAM_OPER_R.create("M29");
		MAM_UNIT_R S1_M30 = MAM_UNIT_R.create("M30");
		MAM_UNIT_R S1_M32 = MAM_UNIT_R.create("M32");
		MAVM_RD_DPT_R S1_V1 = MAVM_RD_DPT_R.create("V1");
		MAM_ITM_LCL_R S1_M33 = MAM_ITM_LCL_R.create("M33");
		MAM_BP_GRP_R S1_SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R S1_SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R S1_SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R S1_SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R S1_SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R S1_SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R S1_SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R S1_SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R S1_SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R S1_SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");
		MAM_ITM_GRP_R S1_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S1_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S1_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S1_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S1_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S1_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S1_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S1_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S1_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S1_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MST_PURC_ACT_R S2_T2 = MST_PURC_ACT_R.create("T2");
		MST_PURC_ACT_R S1_PURC = MST_PURC_ACT_R.create("PURC");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		MCDynamicSQLID DS1C_ITM_GRP = createDynamicSQLID("DS1C_ITM_GRP");
		MCDynamicSQLID DS1C_SPPL_GRP = createDynamicSQLID("DS1C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0170_MST_PURC_RET_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_M1.trd_nm,
						S0_T1.sppl_cd,
						S0_M2.bp_nm.as("sppl_nm"),
						S0_T2.asppl_cd,
						S0_M3.bp_nm.as("asppl_nm"),
						S0_T1.ret_sppl_nm,
						S0_T1.ret_sppl_cntct_dpt,
						S0_T1.ret_sppl_cntct_psn,
						S0_T1.ret_sppl_cntct_psn_title,
						S0_T1.ret_sppl_zip_cd,
						S0_T1.ret_sppl_addr1,
						S0_T1.ret_sppl_addr2,
						S0_T1.ret_sppl_addr3,
						S0_T1.ret_sppl_addr4,
						S0_T1.ret_sppl_tel,
						S0_T1.ret_sppl_fax,
						S0_T1.ret_sppl_fax,
						S0_T1.rcpt_iv_no,
						S0_T1.ref_rcpt_iv_no,
						S0_T1.purc_dpt_cd,
						S0_M4.dpt_nm.as("purc_dpt_nm"),
						S0_T1.wg_cd,
						S0_M5.wg_nm,
						S0_T1.purc_usr_cd,
						S0_M6.usr_nm.as("purc_usr_nm"),
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						decode(
							S0_T3.sundry_itm_flg,
							value(true),
							S0_T3.itm_nm,
							S0_M13.itm_nm
						).as("itm_nm"),
						decode(
							S0_M2.sppl_iv_flg,
							value(true),
							decode(
								S0_T3.sundry_itm_flg,
								value(true),
								S0_T3.iv_itm_nm,
								S0_M33.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_T3.sundry_itm_flg,
						S0_M14.site_cd,
						S0_M15.site_nm,
						S0_M14.wg_cd.as("loc_wg_cd"),
						S0_M16.wg_nm.as("loc_wg_nm"),
						S0_T3.purc_ret_loc_cd,
						S0_M14.loc_nm.as("purc_ret_loc_nm"),
						S0_T3.str_ln_cd,
						S0_M17.str_ln_nm,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.ver_no,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T4.wrk_no,
						S0_T4.wrk_nm,
						S0_T3.maker_cd,
						S0_M18.bp_nm.as("maker_nm"),
						S0_T3.sppl_itm_cd,
						S0_T3.sppl_itm_nm,
						S0_T3.purc_id_typ,
						S0_T1.purc_ret_print_dt,
						S0_T1.purc_ret_print_flg,
						S0_T1.purc_ret_dt,
						S0_T1.ac_dt,
						S0_T3.trd_unit_qty,
						S0_T3.trd_unit_cd,
						S0_M19.unit_nm.as("trd_unit_nm"),
						S0_M19.dec_place.as("trd_qty_dec_place"),
						S0_T3.base_unit_qty,
						S0_T3.base_unit_cd,
						S0_M30.unit_nm.as("base_unit_nm"),
						S0_M30.dec_place.as("base_qty_dec_place"),
						S0_T6.trd_cur_upri,
						decode(S0_T6.purc_typ, value(MAC_PURC_TYP.PURC_ITM.value()), value(false), S0_M2.repurc_obli_flg).as("repurc_obli_flg"),
						S0_T6.trd_cur_proc_upri,
						S0_T6.trd_cur_onr_prov_upri,
						S0_T6.interim_flg,
						S0_T6.trd_cur_dscnt_amt,
						S0_T6.dscnt_rsn_cd,
						S0_M20.biz_rsn_nm.as("dscnt_rsn_nm"),
						S0_T6.trd_cur_amt,
						S0_T6.trd_cur_proc_amt,
						S0_T6.trd_cur_onr_prov_amt,
						bracket(
							S0_T6.trd_cur_amt.add(S0_T6.trd_cur_tax_amt)
						).as("trd_cur_amt_inc_tax_cur_amt"),
						S0_T6.tax_cd,
						S0_M21.tax_nm,
						S0_M21.tax_rate,
						S0_T6.trd_cur_tax_amt,
						S0_T6.pay_crryovr_times,
						S0_T2.trd_cur_cd,
						S0_M7.cur_nm.as("trd_cur_nm"),
						S0_M7.amt_dec_place.as("trd_amt_dec_place"),
						S0_M7.upri_dec_place.as("trd_upri_dec_place"),
						S0_T2.xrate,
						S0_T6.base_cur_upri,
						S0_T6.base_cur_proc_upri,
						S0_T6.base_cur_onr_prov_upri,
						S0_T6.base_cur_dscnt_amt,
						S0_T6.base_cur_amt,
						S0_T6.base_cur_proc_amt,
						S0_T6.base_cur_onr_prov_amt,
						bracket(
							S0_T6.base_cur_amt.add(S0_T6.base_cur_tax_amt)
						).as("base_cur_amt_inc_tax_cur_amt"),
						S0_T6.base_cur_tax_amt,
						S0_T2.base_cur_cd,
						S0_M8.cur_nm.as("base_cur_nm"),
						S0_M8.amt_dec_place.as("base_amt_dec_place"),
						S0_M8.upri_dec_place.as("base_upri_dec_place"),
						S0_T2.ptax_cur_cd,
						S0_M9.cur_nm.as("ptax_cur_nm"),
						S0_M9.amt_dec_place.as("ptax_amt_dec_place"),
						S0_M9.upri_dec_place.as("ptax_upri_dec_place"),
						S0_T2.ptax_dt,
						S0_T2.ptax_xrate,
						S0_T6.ptax_cur_upri,
						S0_T6.ptax_cur_proc_upri,
						S0_T6.ptax_cur_onr_prov_upri,
						S0_T6.ptax_cur_dscnt_amt,
						S0_T6.ptax_cur_amt,
						S0_T6.ptax_cur_tax_amt,
						bracket(
							S0_T6.ptax_cur_amt.add(S0_T6.ptax_cur_tax_amt)
						).as("ptax_cur_inc_tax_amt"),
						S0_T6.wtax_rate,
						S0_T6.wtax_amt,
						S0_T3.purc_typ,
						S0_T3.mfg_inst_no,
						S0_T3.po_no,
						S0_T3.gd_cd,
						S0_M22.gd_nm,
						S0_T3.ret_rsn_cd,
						S0_M23.biz_rsn_nm.as("ret_rsn_nm"),
						S0_T6.ap_dpt_cd,
						S0_M24.dpt_nm.as("ap_dpt_nm"),
						S0_T6.bd_dpt_cd,
						S0_M25.dpt_nm.as("bd_dpt_nm"),
						S0_T6.bd_itm_cd,
						S0_T6.bd_itm_sub1,
						S0_T6.bd_itm_sub2,
						S0_T6.bd_itm_sub3,
						S0_M26.itm_nm.as("bd_itm_nm"),
						S0_T6.bd_lot_no,
						S0_T6.bd_sublot_no,
						S0_T6.bd_sno1,
						S0_T6.bd_sno2,
						S0_T6.bd_sno3,
						S0_T6.bd_sno4,
						S0_T6.bd_loc_cd,
						S0_M27.loc_nm.as("bd_loc_nm"),
						S0_T6.bd_ctg_cd,
						S0_M28.ctg_nm.as("bd_ctg_nm"),
						S0_T6.bd_oper_cd,
						S0_M29.oper_nm.as("bd_oper_nm"),
						S0_T6.bd_iv_no,
						S0_T6.bd_slo_no,
						S0_T6.bd_po_no,
						S0_M13.cont_fctr_flg,
						S0_M13.cont_fctr_dec_place,
						S0_M13.cont_fctr_rnd_typ,
						S0_M13.cont_fctr_unit_cd,
						S0_M32.unit_nm.as("cont_fctr_unit_nm"),
						S0_M13.std_cont_fctr,
						S0_T3.purc_cont_qty,
						S0_T2.tterm_cd1,
						S0_M10.tterm_nm.as("tterm_nm1"),
						S0_T2.tterm_rmrks1,
						S0_T2.tterm_cd2,
						S0_M11.tterm_nm.as("tterm_nm2"),
						S0_T2.tterm_rmrks2,
						S0_T2.tterm_cd3,
						S0_M12.tterm_nm.as("tterm_nm3"),
						S0_T2.tterm_rmrks3,
						S0_T1.purc_ret_print_rmrks,
						S0_T3.purc_ret_print_d_rmrks,
						S0_T1.trd_rmrks.as("act_trd_rmrks"),
						S0_T3.trd_d_rmrks.as("act_trd_d_rmrks"),
						S0_T1.intr_rmrks.as("act_intr_rmrks"),
						S0_T3.intr_rmrks.as("act_intr_d_rmrks"),
						nullValue().as("purc_act_no"),
						nullValue().as("purc_act_d_no"),
						S0_T1.purc_ret_act_no,
						S0_T1.purc_ret_act_rev,
						S0_T3.purc_ret_act_d_no,
						S0_T3.disp_seq,
						S0_T1.purc_ret_schd_no,
						S0_T3.purc_ret_schd_d_no,
						S0_T3.ref_purc_act_no,
						S0_T3.ref_purc_act_d_no,
						S0_T6.base_purc_ac_dt,
						S0_T1.sub_char1.as("act_sub_char1"),
						S0_T1.sub_char2.as("act_sub_char2"),
						S0_T1.sub_char3.as("act_sub_char3"),
						S0_T3.sub_char1.as("act_d_sub_char1"),
						S0_T3.sub_char2.as("act_d_sub_char2"),
						S0_T3.sub_char3.as("act_d_sub_char3"),
						S0_T3.can_flg,
						S0_T3.ins_usr_id,
						S0_T3.ins_usr_nm,
						S0_T3.ins_func_id,
						S0_T3.ins_ts,
						S0_T3.upd_usr_id,
						S0_T3.upd_usr_nm,
						S0_T3.upd_func_id,
						S0_T3.upd_ts,
						S0_T3.upd_srv_req_no,
						addDynamicSelect(DS0C_SPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.purc_ret_act_no.eq(S0_T2.purc_ret_act_no)
								.and(S0_T1.purc_ret_act_rev.eq(S0_T2.purc_ret_act_rev))
								.and(
									bind("inc_can_flg").eq(value(false))
									.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									.or(
										bind("inc_can_flg").eq(value(true))
										.and(
											bracket(
												S0_T1.can_flg.eq(value(true))
												.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
												.and(
														S0_T2.purc_act_rev.in(
														subQuery()
														.select(max(S1_PURC.purc_act_rev).as("purc_act_rev"))
														.from(S1_PURC)
														.where(
															S1_PURC.purc_ret_act_no.eq(S0_T2.purc_ret_act_no)
															.and(S1_PURC.purc_ret_act_rev.eq(S0_T2.purc_ret_act_rev))
															.and(S1_PURC.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
														)
													)
												)
											)
											.or(
												S0_T1.can_flg.eq(value(false))
												.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
											)
										)
									)
								)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.purc_ret_act_no.eq(S0_T3.purc_ret_act_no)
								.and(
									bind("inc_can_flg").eq(value(true))
									.or(
										bind("inc_can_flg").eq(value(false))
										.and(S0_T3.can_flg.eq(value(false)))
									)
								)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.sno1.eq(S0_T4.sno1)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T3.purc_ret_act_d_no.eq(S0_T6.purc_ret_act_d_no)
								.and(S0_T2.purc_act_no.eq(S0_T6.purc_act_no))
								.and(S0_T2.purc_act_seq.eq(S0_T6.purc_act_seq))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.trd_cd.eq(S0_M1.trd_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T2.asppl_cd.eq(S0_M3.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.wg_cd.eq(S0_M5.wg_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.purc_usr_cd.eq(S0_M6.usr_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T2.trd_cur_cd.eq(S0_M7.cur_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T2.base_cur_cd.eq(S0_M8.cur_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T2.ptax_cur_cd.eq(S0_M9.cur_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T2.tterm_cd1.eq(S0_M10.tterm_cd)
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T2.tterm_cd2.eq(S0_M11.tterm_cd)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T2.tterm_cd3.eq(S0_M12.tterm_cd)
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M13.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M13.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M13.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M13.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M34).on(
							S0_M13.itm_typ.eq(S0_M34.itm_typ)
							.and(S0_M13.itm_typ_d_cd.eq(S0_M34.itm_typ_d_cd))
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_T3.purc_ret_loc_cd.eq(S0_M14.loc_cd)
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_M14.site_cd.eq(S0_M15.site_cd)
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_M14.wg_cd.eq(S0_M16.wg_cd)
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_M14.loc_cd.eq(S0_M17.loc_cd)
								.and(S0_T3.str_ln_cd.eq(S0_M17.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T3.maker_cd.eq(S0_M18.bp_cd)
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_T3.trd_unit_cd.eq(S0_M19.unit_cd)
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T6.dscnt_rsn_cd.eq(S0_M20.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T6.tax_cd.eq(S0_M21.tax_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T3.gd_cd.eq(S0_M22.gd_cd)
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_T3.ret_rsn_cd.eq(S0_M23.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T6.ap_dpt_cd.eq(S0_M24.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M24.st_dt, S0_M24.end_dt))
							)
						)
						.leftOuterJoin(S0_M25).on(
							bracket(
								S0_T6.bd_dpt_cd.eq(S0_M25.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M25.st_dt, S0_M25.end_dt))
							)
						)
						.leftOuterJoin(S0_M26).on(
							bracket(
								S0_T6.bd_itm_cd.eq(S0_M26.itm_cd)
								.and(S0_T6.bd_itm_sub1.eq(S0_M26.itm_sub1))
								.and(S0_T6.bd_itm_sub2.eq(S0_M26.itm_sub2))
								.and(S0_T6.bd_itm_sub3.eq(S0_M26.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_T6.bd_loc_cd.eq(S0_M27.loc_cd)
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_T6.bd_ctg_cd.eq(S0_M28.ctg_cd)
							)
						)
						.leftOuterJoin(S0_M29).on(
							bracket(
								S0_T6.bd_oper_cd.eq(S0_M29.oper_cd)
							)
						)
						.leftOuterJoin(S0_M30).on(
							bracket(
								S0_T3.base_unit_cd.eq(S0_M30.unit_cd)
							)
						)
						.leftOuterJoin(S0_M32).on(
							bracket(
								S0_M13.cont_fctr_unit_cd.eq(S0_M32.unit_cd)
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_V1.dpt_cd)
							)
						)
						.leftOuterJoin(S0_M33).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M33.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M33.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M33.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M33.itm_sub3))
								.and(S0_M33.lcl_cd.eq(S0_M2.prnt_lcl_cd))
							)
						)
						.addDynamicView(DS0C_SPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bind("inc_can_flg").eq(value(true))
							.or(
								bind("inc_can_flg").eq(value(false))
								.and(S0_T1.can_flg.eq(value(false)))
							)
						)
						.and(
							bracket(
								bind("not_issue_flg").eq(value(true))
								.and(S0_T1.purc_ret_print_flg.eq(value(false)))
							)
							.or(
								bind("issue_flg").eq(value(true))
								.and(S0_T1.purc_ret_print_flg.eq(value(true)))
							)
						)
						.and(
							bracket(
								bind("iv_trgt_flg").eq(value(true))
								.and(S0_M2.sppl_iv_flg.eq(value(true)))
							)
							.or(
								bind("iv_not_trgt_flg").eq(value(true))
								.and(S0_M2.sppl_iv_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.purc_ret_print_dt.gte(bind("purc_ret_print_dt_fr")))
						.cutoff$and(S0_T1.purc_ret_print_dt.lte(bind("purc_ret_print_dt_to")))
						.cutoff$and(S0_T1.purc_ret_dt.gte(bind("purc_ret_dt_fr")))
						.cutoff$and(S0_T1.purc_ret_dt.lte(bind("purc_ret_dt_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_M14.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_M15.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_T1.ret_sppl_nm.like(bind("ret_sppl_nm")))
						.cutoff$and(S0_M14.wg_cd.like(bind("loc_wg_cd")))
						.cutoff$and(S0_M16.wg_nm.like(bind("loc_wg_nm")))
						.cutoff$and(S0_T3.purc_ret_loc_cd.like(bind("purc_ret_loc_cd")))
						.cutoff$and(S0_M14.loc_nm.like(bind("purc_ret_loc_nm")))
						.cutoff$and(S0_T3.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_M17.str_ln_nm.like(bind("str_ln_nm")))
						.cutoff$and(S0_M13.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M13.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M34.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
						.cutoff$and(S0_T3.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T3.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T3.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T3.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T3.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T3.itm_nm,
								S0_M13.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T3.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T3.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T3.sublot_no.like(bind("sublot_no")))
						.cutoff$and(
							nvl(
								S0_T3.iv_itm_nm,
								S0_M33.itm_nm
							).like(bind("iv_itm_nm"))
						)
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T3.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_M22.gd_nm.like(bind("gd_nm")))
						.cutoff$and(S0_T3.sno1.like(bind("sno1")))
						.cutoff$and(S0_T3.sno2.like(bind("sno2")))
						.cutoff$and(S0_T3.sno3.like(bind("sno3")))
						.cutoff$and(S0_T3.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("purc_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("purc_dpt_wg_cd")))
						.cutoff$and(S0_M5.wg_nm.like(bind("purc_dpt_wg_nm")))
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_M6.usr_nm.like(bind("purc_usr_nm")))
						.cutoff$and(S0_T6.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M24.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_T3.po_no.like(bind("po_no")))
						.cutoff$and(S0_T1.purc_ret_act_no.like(bind("purc_ret_act_no")))
						.cutoff$and(S0_T3.purc_ret_act_d_no.like(bind("purc_ret_act_d_no")))
						.cutoff$and(S0_T1.purc_ret_schd_no.like(bind("purc_ret_schd_no")))
						.cutoff$and(S0_T3.maker_cd.like(bind("maker_cd")))
						.cutoff$and(S0_M18.bp_nm.like(bind("maker_nm")))
						.cutoff$and(S0_T2.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_M7.cur_nm.like(bind("trd_cur_nm")))
						.cutoff$and(S0_T1.purc_ret_print_rmrks.like(bind("purc_ret_print_rmrks")))
						.cutoff$and(S0_T3.purc_ret_print_d_rmrks.like(bind("purc_ret_print_d_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("act_trd_rmrks")))
						.cutoff$and(S0_T3.trd_d_rmrks.like(bind("act_trd_d_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("act_intr_rmrks")))
						.cutoff$and(S0_T3.intr_rmrks.like(bind("act_intr_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("act_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("act_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("act_sub_char3")))
						.cutoff$and(S0_T3.sub_char1.like(bind("act_d_sub_char1")))
						.cutoff$and(S0_T3.sub_char2.like(bind("act_d_sub_char2")))
						.cutoff$and(S0_T3.sub_char3.like(bind("act_d_sub_char3")))
						.cutoff$and(S0_T3.purc_ret_schd_d_no.like(bind("purc_ret_schd_d_no")))
						.addDynamicPredicate(DS0C_SPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.unionAll(
						subQuery()
						.select(
							S1_T2.pr("trd_cd"),
							S1_M1.trd_nm,
							S1_T2.pr("sppl_cd"),
							S1_M2.bp_nm.as("sppl_nm"),
							S1_T2.pr("asppl_cd"),
							S1_M3.bp_nm.as("asppl_nm"),
							nullValue().as("ret_sppl_nm"),
							nullValue().as("ret_sppl_cntct_dpt"),
							nullValue().as("ret_sppl_cntct_psn"),
							nullValue().as("ret_sppl_cntct_psn_title"),
							nullValue().as("ret_sppl_zip_cd"),
							nullValue().as("ret_sppl_addr1"),
							nullValue().as("ret_sppl_addr2"),
							nullValue().as("ret_sppl_addr3"),
							nullValue().as("ret_sppl_addr4"),
							nullValue().as("ret_sppl_tel"),
							nullValue().as("ret_sppl_fax"),
							nullValue().as("ret_sppl_fax"),
							S1_T2.pr("rcpt_iv_no"),
							S1_T2.pr("ref_rcpt_iv_no"),
							S1_T2.pr("purc_dpt_cd"),
							S1_M4.dpt_nm.as("purc_dpt_nm"),
							S1_T2.pr("wg_cd"),
							S1_M5.wg_nm,
							S1_T2.pr("purc_usr_cd"),
							S1_M6.usr_nm.as("purc_usr_nm"),
							S1_T6.itm_cd,
							S1_T6.itm_sub1,
							S1_T6.itm_sub2,
							S1_T6.itm_sub3,
							decode(
								S1_T6.sundry_itm_flg,
								value(true),
								S1_T6.itm_nm,
								S1_M13.itm_nm
							).as("itm_nm"),
							decode(
								S1_M2.sppl_iv_flg,
								value(true),
								decode(
									S1_T6.sundry_itm_flg,
									value(true),
									S1_T6.iv_itm_nm,
									S1_M33.itm_nm
								),
								nullValue()
							).as("iv_itm_nm"),
							S1_T6.sundry_itm_flg,
							nullValue().as("site_cd"),
							nullValue().as("site_nm"),
							nullValue().as("loc_wg_cd"),
							nullValue().as("loc_wg_nm"),
							nullValue().as("purc_ret_loc_cd"),
							nullValue().as("purc_ret_loc_nm"),
							nullValue().as("str_ln_cd"),
							nullValue().as("str_ln_nm"),
							S1_T6.lot_no,
							S1_T6.sublot_no,
							S1_T6.ver_no,
							S1_T6.sno1,
							S1_T6.sno2,
							S1_T6.sno3,
							S1_T6.sno4,
							S1_T4.wrk_no,
							S1_T4.wrk_nm,
							S1_T6.maker_cd,
							S1_M18.bp_nm.as("maker_nm"),
							S1_T6.sppl_itm_cd,
							S1_T6.sppl_itm_nm,
							S1_T6.purc_id_typ,
							nullValue().as("purc_ret_print_dt"),
							nullValue().as("purc_ret_print_flg"),
							nullValue().as("purc_ret_dt"),
							S1_T2.pr("ac_dt"),
							S1_T6.trd_unit_qty,
							S1_T6.trd_unit_cd,
							S1_M19.unit_nm.as("trd_unit_nm"),
							S1_M19.dec_place.as("trd_qty_dec_place"),
							S1_T6.base_unit_qty,
							S1_T6.base_unit_cd,
							S1_M30.unit_nm.as("base_unit_nm"),
							S1_M30.dec_place.as("base_qty_dec_place"),
							S1_T6.trd_cur_upri,
							value(false).as("repurc_obli_flg"),
							S1_T6.trd_cur_proc_upri,
							S1_T6.trd_cur_onr_prov_upri,
							S1_T6.interim_flg,
							S1_T6.trd_cur_dscnt_amt,
							S1_T6.dscnt_rsn_cd,
							S1_M20.biz_rsn_nm.as("dscnt_rsn_nm"),
							S1_T6.trd_cur_amt,
							S1_T6.trd_cur_proc_amt,
							S1_T6.trd_cur_onr_prov_amt,
							bracket(
								S1_T6.trd_cur_amt.add(S1_T6.trd_cur_tax_amt)
							).as("trd_cur_amt_inc_tax_cur_amt"),
							S1_T6.tax_cd,
							S1_M21.tax_nm,
							S1_M21.tax_rate,
							S1_T6.trd_cur_tax_amt,
							S1_T6.pay_crryovr_times,
							S1_T2.pr("trd_cur_cd"),
							S1_M7.cur_nm.as("trd_cur_nm"),
							S1_M7.amt_dec_place.as("trd_amt_dec_place"),
							S1_M7.upri_dec_place.as("trd_upri_dec_place"),
							S1_T2.pr("xrate"),
							S1_T6.base_cur_upri,
							S1_T6.base_cur_proc_upri,
							S1_T6.base_cur_onr_prov_upri,
							S1_T6.base_cur_dscnt_amt,
							S1_T6.base_cur_amt,
							S1_T6.base_cur_proc_amt,
							S1_T6.base_cur_onr_prov_amt,
							bracket(
								S1_T6.base_cur_amt.add(S1_T6.base_cur_tax_amt)
							).as("base_cur_amt_inc_tax_cur_amt"),
							S1_T6.base_cur_tax_amt,
							S1_T2.pr("base_cur_cd"),
							S1_M8.cur_nm.as("base_cur_nm"),
							S1_M8.amt_dec_place.as("base_amt_dec_place"),
							S1_M8.upri_dec_place.as("base_upri_dec_place"),
							S1_T2.pr("ptax_cur_cd"),
							S1_M9.cur_nm.as("ptax_cur_nm"),
							S1_M9.amt_dec_place.as("ptax_amt_dec_place"),
							S1_M9.upri_dec_place.as("ptax_upri_dec_place"),
							S1_T2.pr("ptax_dt"),
							S1_T2.pr("ptax_xrate"),
							S1_T6.ptax_cur_upri,
							S1_T6.ptax_cur_proc_upri,
							S1_T6.ptax_cur_onr_prov_upri,
							S1_T6.ptax_cur_dscnt_amt,
							S1_T6.ptax_cur_amt,
							S1_T6.ptax_cur_tax_amt,
							bracket(
								S1_T6.ptax_cur_amt.add(S1_T6.ptax_cur_tax_amt)
							).as("ptax_cur_inc_tax_amt"),
							S1_T6.wtax_rate,
							S1_T6.wtax_amt,
							S1_T6.purc_typ,
							S1_T6.mfg_inst_no,
							S1_T6.po_no,
							S1_T6.gd_cd,
							S1_M22.gd_nm,
							S1_T6.rsn_cd.as("ret_rsn_cd"),
							S1_M23.biz_rsn_nm.as("ret_rsn_nm"),
							S1_T6.ap_dpt_cd,
							S1_M24.dpt_nm.as("ap_dpt_nm"),
							S1_T6.bd_dpt_cd,
							S1_M25.dpt_nm.as("bd_dpt_nm"),
							S1_T6.bd_itm_cd,
							S1_T6.bd_itm_sub1,
							S1_T6.bd_itm_sub2,
							S1_T6.bd_itm_sub3,
							S1_M26.itm_nm.as("bd_itm_nm"),
							S1_T6.bd_lot_no,
							S1_T6.bd_sublot_no,
							S1_T6.bd_sno1,
							S1_T6.bd_sno2,
							S1_T6.bd_sno3,
							S1_T6.bd_sno4,
							S1_T6.bd_loc_cd,
							S1_M27.loc_nm.as("bd_loc_nm"),
							S1_T6.bd_ctg_cd,
							S1_M28.ctg_nm.as("bd_ctg_nm"),
							S1_T6.bd_oper_cd,
							S1_M29.oper_nm.as("bd_oper_nm"),
							S1_T6.bd_iv_no,
							S1_T6.bd_slo_no,
							S1_T6.bd_po_no,
							nullValue().as("cont_fctr_flg"),
							nullValue().as("cont_fctr_dec_place"),
							nullValue().as("cont_fctr_rnd_typ"),
							nullValue().as("cont_fctr_unit_cd"),
							nullValue().as("cont_fctr_unit_nm"),
							nullValue().as("std_cont_fctr"),
							nullValue().as("purc_cont_qty"),
							S1_T2.pr("tterm_cd1"),
							S1_M10.tterm_nm.as("tterm_nm1"),
							S1_T2.pr("tterm_rmrks1"),
							S1_T2.pr("tterm_cd2"),
							S1_M11.tterm_nm.as("tterm_nm2"),
							S1_T2.pr("tterm_rmrks2"),
							S1_T2.pr("tterm_cd3"),
							S1_M12.tterm_nm.as("tterm_nm3"),
							S1_T2.pr("tterm_rmrks3"),
							nullValue().as("purc_ret_print_rmrks"),
							nullValue().as("purc_ret_print_d_rmrks"),
							nullValue().as("act_trd_rmrks"),
							nullValue().as("act_trd_d_rmrks"),
							nullValue().as("act_intr_rmrks"),
							nullValue().as("act_intr_d_rmrks"),
							S1_T6.purc_act_no,
							S1_T6.purc_act_d_no,
							nullValue().as("purc_ret_act_no"),
							nullValue().as("purc_ret_act_rev"),
							nullValue().as("purc_ret_act_d_no"),
							nullValue().as("disp_seq"),
							nullValue().as("purc_ret_schd_no"),
							nullValue().as("purc_ret_schd_d_no"),
							nullValue().as("ref_purc_act_no"),
							nullValue().as("ref_purc_act_d_no"),
							S1_T6.base_purc_ac_dt,
							nullValue().as("act_sub_char1"),
							nullValue().as("act_sub_char2"),
							nullValue().as("act_sub_char3"),
							nullValue().as("act_d_sub_char1"),
							nullValue().as("act_d_sub_char2"),
							nullValue().as("act_d_sub_char3"),
							decode(
								S1_T2.pr("slip_sts_typ"),
								value(MAC_SLIP_STS_TYP.CAN.value()),
								value(true),
								value(false)
							).as("can_flg"),
							S1_T6.ins_usr_id,
							S1_T6.ins_usr_nm,
							S1_T6.ins_func_id,
							S1_T6.ins_ts,
							S1_T6.upd_usr_id,
							S1_T6.upd_usr_nm,
							S1_T6.upd_func_id,
							S1_T6.upd_ts,
							S1_T6.upd_srv_req_no,
							addDynamicSelect(DS1C_SPPL_GRP),
							addDynamicSelect(DS1C_ITM_GRP)
						)
						.from(
							subQuery()
							.select(S2_T2.prAll())
							.from(S2_T2)
							.where(
								value(0).eq(value(0))
								.and(
									bind("inc_can_flg").eq(value(false))
									.and(S2_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									.or(
										bind("inc_can_flg").eq(value(true))
										.and(
											S2_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
											.or(S2_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value())))
										)
									)
								)
							).view(S1_T2)
							.innerJoin(S1_T6).on(
								bracket(
									S1_T2.pr("purc_act_no").eq(S1_T6.purc_act_no)
									.and(S1_T2.pr("purc_act_seq").eq(S1_T6.purc_act_seq))
								)
							)
							.leftOuterJoin(S1_T4).on(
								bracket(
									S1_T6.sno1.eq(S1_T4.sno1)
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_T2.pr("trd_cd").eq(S1_M1.trd_cd)
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_T2.pr("sppl_cd").eq(S1_M2.bp_cd)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_T2.pr("asppl_cd").eq(S1_M3.bp_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T2.pr("purc_dpt_cd").eq(S1_M4.dpt_cd)
									.and(S1_T2.pr("ac_dt").between(S1_M4.st_dt, S1_M4.end_dt))
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T2.pr("wg_cd").eq(S1_M5.wg_cd)
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_T2.pr("purc_usr_cd").eq(S1_M6.usr_cd)
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_T2.pr("trd_cur_cd").eq(S1_M7.cur_cd)
								)
							)
							.leftOuterJoin(S1_M8).on(
								bracket(
									S1_T2.pr("base_cur_cd").eq(S1_M8.cur_cd)
								)
							)
							.leftOuterJoin(S1_M9).on(
								bracket(
									S1_T2.pr("ptax_cur_cd").eq(S1_M9.cur_cd)
								)
							)
							.leftOuterJoin(S1_M10).on(
								bracket(
									S1_T2.pr("tterm_cd1").eq(S1_M10.tterm_cd)
								)
							)
							.leftOuterJoin(S1_M11).on(
								bracket(
									S1_T2.pr("tterm_cd2").eq(S1_M11.tterm_cd)
								)
							)
							.leftOuterJoin(S1_M12).on(
								bracket(
									S1_T2.pr("tterm_cd3").eq(S1_M12.tterm_cd)
								)
							)
							.leftOuterJoin(S1_M13).on(
								bracket(
									S1_T6.itm_cd.eq(S1_M13.itm_cd)
									.and(S1_T6.itm_sub1.eq(S1_M13.itm_sub1))
									.and(S1_T6.itm_sub2.eq(S1_M13.itm_sub2))
									.and(S1_T6.itm_sub3.eq(S1_M13.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M34).on(
								S1_M13.itm_typ.eq(S1_M34.itm_typ)
								.and(S1_M13.itm_typ_d_cd.eq(S1_M34.itm_typ_d_cd))
							)
							.leftOuterJoin(S1_M18).on(
								bracket(
									S1_T6.maker_cd.eq(S1_M18.bp_cd)
								)
							)
							.leftOuterJoin(S1_M19).on(
								bracket(
									S1_T6.trd_unit_cd.eq(S1_M19.unit_cd)
								)
							)
							.leftOuterJoin(S1_M20).on(
								bracket(
									S1_T6.dscnt_rsn_cd.eq(S1_M20.biz_rsn_cd)
								)
							)
							.leftOuterJoin(S1_M21).on(
								bracket(
									S1_T6.tax_cd.eq(S1_M21.tax_cd)
								)
							)
							.leftOuterJoin(S1_M22).on(
								bracket(
									S1_T6.gd_cd.eq(S1_M22.gd_cd)
								)
							)
							.leftOuterJoin(S1_M23).on(
								bracket(
									S1_T6.rsn_cd.eq(S1_M23.biz_rsn_cd)
								)
							)
							.leftOuterJoin(S1_M24).on(
								bracket(
									S1_T6.ap_dpt_cd.eq(S1_M24.dpt_cd)
									.and(S1_T2.pr("ac_dt").between(S1_M24.st_dt, S1_M24.end_dt))
								)
							)
							.leftOuterJoin(S1_M25).on(
								bracket(
									S1_T6.bd_dpt_cd.eq(S1_M25.dpt_cd)
									.and(S1_T2.pr("ac_dt").between(S1_M25.st_dt, S1_M25.end_dt))
								)
							)
							.leftOuterJoin(S1_M26).on(
								bracket(
									S1_T6.bd_itm_cd.eq(S1_M26.itm_cd)
									.and(S1_T6.bd_itm_sub1.eq(S1_M26.itm_sub1))
									.and(S1_T6.bd_itm_sub2.eq(S1_M26.itm_sub2))
									.and(S1_T6.bd_itm_sub3.eq(S1_M26.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M27).on(
								bracket(
									S1_T6.bd_loc_cd.eq(S1_M27.loc_cd)
								)
							)
							.leftOuterJoin(S1_M28).on(
								bracket(
									S1_T6.bd_ctg_cd.eq(S1_M28.ctg_cd)
								)
							)
							.leftOuterJoin(S1_M29).on(
								bracket(
									S1_T6.bd_oper_cd.eq(S1_M29.oper_cd)
								)
							)
							.leftOuterJoin(S1_M30).on(
								bracket(
									S1_T6.base_unit_cd.eq(S1_M30.unit_cd)
								)
							)
							.leftOuterJoin(S1_M32).on(
								bracket(
									S1_M13.cont_fctr_unit_cd.eq(S1_M32.unit_cd)
								)
							)
							.innerJoin(S1_V1).on(
								bracket(
									S1_T2.pr("purc_dpt_cd").eq(S1_V1.dpt_cd)
								)
							)
							.leftOuterJoin(S1_M33).on(
								bracket(
									S1_T6.itm_cd.eq(S1_M33.itm_cd)
									.and(S1_T6.itm_sub1.eq(S1_M33.itm_sub1))
									.and(S1_T6.itm_sub2.eq(S1_M33.itm_sub2))
									.and(S1_T6.itm_sub3.eq(S1_M33.itm_sub3))
									.and(S1_M33.lcl_cd.eq(S1_M2.prnt_lcl_cd))
								)
							)
							.addDynamicView(DS1C_SPPL_GRP)
							.addDynamicView(DS1C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(
								bracket(
									bind("iv_trgt_flg").eq(value(true))
									.and(S1_M2.sppl_iv_flg.eq(value(true)))
								)
								.or(
									bind("iv_not_trgt_flg").eq(value(true))
									.and(S1_M2.sppl_iv_flg.eq(value(false)))
								)
							)
							.cutoff$and(S1_T2.pr("ac_dt").gte(bind("ac_dt_fr")))
							.cutoff$and(S1_T2.pr("ac_dt").lte(bind("ac_dt_to")))
							.cutoff$and(S1_T2.pr("sppl_cd").like(bind("sppl_cd")))
							.cutoff$and(S1_M2.bp_nm.like(bind("sppl_nm")))
							.cutoff$and(S1_M13.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_M13.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_M34.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1_T6.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T6.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T6.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T6.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T6.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								nvl(
									S1_T6.itm_nm,
									S1_M13.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_T6.ver_no.like(bind("ver_no")))
							.cutoff$and(S1_T6.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T6.sublot_no.like(bind("sublot_no")))
							.cutoff$and(
								nvl(
									S1_T6.iv_itm_nm,
									S1_M33.itm_nm
								).like(bind("iv_itm_nm"))
							)
							.cutoff$and(S1_T2.pr("rcpt_iv_no").like(bind("iv_no")))
							.cutoff$and(S1_T6.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1_M22.gd_nm.like(bind("gd_nm")))
							.cutoff$and(S1_T6.sno1.like(bind("sno1")))
							.cutoff$and(S1_T6.sno2.like(bind("sno2")))
							.cutoff$and(S1_T6.sno3.like(bind("sno3")))
							.cutoff$and(S1_T6.sno4.like(bind("sno4")))
							.cutoff$and(S1_T2.pr("purc_dpt_cd").like(bind("purc_dpt_cd")))
							.cutoff$and(S1_M4.dpt_nm.like(bind("purc_dpt_nm")))
							.cutoff$and(S1_T2.pr("wg_cd").like(bind("purc_dpt_wg_cd")))
							.cutoff$and(S1_M5.wg_nm.like(bind("purc_dpt_wg_nm")))
							.cutoff$and(S1_T2.pr("purc_usr_cd").like(bind("purc_usr_cd")))
							.cutoff$and(S1_M6.usr_nm.like(bind("purc_usr_nm")))
							.cutoff$and(S1_T6.ap_dpt_cd.like(bind("ap_dpt_cd")))
							.cutoff$and(S1_M24.dpt_nm.like(bind("ap_dpt_nm")))
							.cutoff$and(S1_T6.po_no.like(bind("po_no")))
							.cutoff$and(S1_T6.maker_cd.like(bind("maker_cd")))
							.cutoff$and(S1_M18.bp_nm.like(bind("maker_nm")))
							.cutoff$and(S1_T2.pr("trd_cur_cd").like(bind("trd_cur_cd")))
							.cutoff$and(S1_M7.cur_nm.like(bind("trd_cur_nm")))
							.and(
								bind("inc_ret_dscnt_flg").eq(value(true))
								.and(S1_M23.purc_rtn_flg.eq(value(true)))
								.and(S1_M23.purc_dscnt_flg.eq(value(true)))
								.and(
									S1_M1.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.PURC_DSCNT.value()),
										value(MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS.value()),
										value(MAC_TRD_PTN_TYP.PURC_XTRA.value()),
										value(MAC_TRD_PTN_TYP.PURC_XTRA_XPNS.value())
									)
								)
							)
							.addDynamicPredicate(DS1C_SPPL_GRP)
							.addDynamicPredicate(DS1C_ITM_GRP)
						)
					)
					.orderBy(
						pr("purc_ret_act_no").asc(),
						pr("purc_ret_act_rev").asc(),
						pr("disp_seq").asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd1.as("sppl_grp_cd1"), S0_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP1).on(S0_M2.bp_grp_cd1.eq(S0_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd2.as("sppl_grp_cd2"), S0_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP2).on(S0_M2.bp_grp_cd2.eq(S0_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd3.as("sppl_grp_cd3"), S0_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP3).on(S0_M2.bp_grp_cd3.eq(S0_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd4.as("sppl_grp_cd4"), S0_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP4).on(S0_M2.bp_grp_cd4.eq(S0_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd5.as("sppl_grp_cd5"), S0_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP5).on(S0_M2.bp_grp_cd5.eq(S0_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd6.as("sppl_grp_cd6"), S0_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP6).on(S0_M2.bp_grp_cd6.eq(S0_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd7.as("sppl_grp_cd7"), S0_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP7).on(S0_M2.bp_grp_cd7.eq(S0_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd8.as("sppl_grp_cd8"), S0_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP8).on(S0_M2.bp_grp_cd8.eq(S0_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd9.as("sppl_grp_cd9"), S0_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP9).on(S0_M2.bp_grp_cd9.eq(S0_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd10.as("sppl_grp_cd10"), S0_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP10).on(S0_M2.bp_grp_cd10.eq(S0_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd1.as("itm_grp_cd1"), S0_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_M13.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd2.as("itm_grp_cd2"), S0_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_M13.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd3.as("itm_grp_cd3"), S0_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_M13.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd4.as("itm_grp_cd4"), S0_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_M13.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd5.as("itm_grp_cd5"), S0_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_M13.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd6.as("itm_grp_cd6"), S0_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_M13.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd7.as("itm_grp_cd7"), S0_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_M13.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd8.as("itm_grp_cd8"), S0_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_M13.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd9.as("itm_grp_cd9"), S0_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_M13.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd10.as("itm_grp_cd10"), S0_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_M13.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd1.as("sppl_grp_cd1"), S1_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP1).on(S1_M2.bp_grp_cd1.eq(S1_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S1_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd2.as("sppl_grp_cd2"), S1_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP2).on(S1_M2.bp_grp_cd2.eq(S1_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S1_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd3.as("sppl_grp_cd3"), S1_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP3).on(S1_M2.bp_grp_cd3.eq(S1_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S1_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd4.as("sppl_grp_cd4"), S1_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP4).on(S1_M2.bp_grp_cd4.eq(S1_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S1_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd5.as("sppl_grp_cd5"), S1_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP5).on(S1_M2.bp_grp_cd5.eq(S1_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S1_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd6.as("sppl_grp_cd6"), S1_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP6).on(S1_M2.bp_grp_cd6.eq(S1_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S1_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd7.as("sppl_grp_cd7"), S1_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP7).on(S1_M2.bp_grp_cd7.eq(S1_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S1_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd8.as("sppl_grp_cd8"), S1_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP8).on(S1_M2.bp_grp_cd8.eq(S1_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S1_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd9.as("sppl_grp_cd9"), S1_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP9).on(S1_M2.bp_grp_cd9.eq(S1_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S1_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd10.as("sppl_grp_cd10"), S1_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP10).on(S1_M2.bp_grp_cd10.eq(S1_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S1_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd1.as("itm_grp_cd1"), S1_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP1).on(S1_M13.itm_grp_cd1.eq(S1_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S1_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd2.as("itm_grp_cd2"), S1_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP2).on(S1_M13.itm_grp_cd2.eq(S1_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S1_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd3.as("itm_grp_cd3"), S1_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP3).on(S1_M13.itm_grp_cd3.eq(S1_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S1_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd4.as("itm_grp_cd4"), S1_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP4).on(S1_M13.itm_grp_cd4.eq(S1_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S1_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd5.as("itm_grp_cd5"), S1_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP5).on(S1_M13.itm_grp_cd5.eq(S1_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S1_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd6.as("itm_grp_cd6"), S1_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP6).on(S1_M13.itm_grp_cd6.eq(S1_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S1_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd7.as("itm_grp_cd7"), S1_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP7).on(S1_M13.itm_grp_cd7.eq(S1_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S1_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd8.as("itm_grp_cd8"), S1_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP8).on(S1_M13.itm_grp_cd8.eq(S1_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S1_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd9.as("itm_grp_cd9"), S1_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP9).on(S1_M13.itm_grp_cd9.eq(S1_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S1_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd10.as("itm_grp_cd10"), S1_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP10).on(S1_M13.itm_grp_cd10.eq(S1_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S1_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBDL0170_MST_PURC_RET_ACT_Query_S03
	 */
	static MCQueryPlan MSBDL0170_MST_PURC_RET_ACT_S03() {
		MST_PURC_RET_ACT_R S0_T1 = MST_PURC_RET_ACT_R.create("T1");
		MST_PURC_ACT_R S0_T2 = MST_PURC_ACT_R.create("T2");
		MST_PURC_RET_ACT_D_R S0_T3 = MST_PURC_RET_ACT_D_R.create("T3");
		MSVT_WRK_SNO_R S0_T4 = MSVT_WRK_SNO_R.create("T4");
		MST_PURC_ACT_D_R S0_T6 = MST_PURC_ACT_D_R.create("T6");
		MST_PURC_RET_ACT_IO_R S0_T7 = MST_PURC_RET_ACT_IO_R.create("T7");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_USR_R S0_M6 = MAM_USR_R.create("M6");
		MAM_CUR_R S0_M7 = MAM_CUR_R.create("M7");
		MAM_CUR_R S0_M8 = MAM_CUR_R.create("M8");
		MAM_CUR_R S0_M9 = MAM_CUR_R.create("M9");
		MAM_TTERM_R S0_M10 = MAM_TTERM_R.create("M10");
		MAM_TTERM_R S0_M11 = MAM_TTERM_R.create("M11");
		MAM_TTERM_R S0_M12 = MAM_TTERM_R.create("M12");
		MAM_ITM_R S0_M13 = MAM_ITM_R.create("M13");
		MAM_ITM_TYP_D_R S0_M34 = MAM_ITM_TYP_D_R.create("M34");
		MAM_LOC_R S0_M14 = MAM_LOC_R.create("M14");
		MAM_SITE_R S0_M15 = MAM_SITE_R.create("M15");
		MAM_WG_R S0_M16 = MAM_WG_R.create("M16");
		MAM_STR_LN_R S0_M17 = MAM_STR_LN_R.create("M17");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_UNIT_R S0_M19 = MAM_UNIT_R.create("M19");
		MAM_BIZ_RSN_R S0_M20 = MAM_BIZ_RSN_R.create("M20");
		MAM_TAX_R S0_M21 = MAM_TAX_R.create("M21");
		MAM_STK_GD_R S0_M22 = MAM_STK_GD_R.create("M22");
		MAM_BIZ_RSN_R S0_M23 = MAM_BIZ_RSN_R.create("M23");
		MAM_DPT_R S0_M24 = MAM_DPT_R.create("M24");
		MAM_DPT_R S0_M25 = MAM_DPT_R.create("M25");
		MAM_ITM_R S0_M26 = MAM_ITM_R.create("M26");
		MAM_LOC_R S0_M27 = MAM_LOC_R.create("M27");
		MAM_COST_CTG_R S0_M28 = MAM_COST_CTG_R.create("M28");
		MAM_OPER_R S0_M29 = MAM_OPER_R.create("M29");
		MAM_UNIT_R S0_M30 = MAM_UNIT_R.create("M30");
		MAM_BIZ_RSN_R S0_M31 = MAM_BIZ_RSN_R.create("M31");
		MAM_UNIT_R S0_M32 = MAM_UNIT_R.create("M32");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
		MAM_ITM_LCL_R S0_M33 = MAM_ITM_LCL_R.create("M33");
		MAM_BP_GRP_R S0_SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R S0_SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R S0_SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R S0_SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R S0_SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R S0_SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R S0_SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R S0_SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R S0_SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R S0_SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");
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
		MCTempView S1_T2 = createTempView("T2");
		MST_PURC_ACT_D_R S1_T6 = MST_PURC_ACT_D_R.create("T6");
		MST_PURC_ACT_IO_R S1_T7 = MST_PURC_ACT_IO_R.create("T7");
		MST_ARR_ACT_R S1_T10 = MST_ARR_ACT_R.create("T10");
		MSVT_WRK_SNO_R S1_T4 = MSVT_WRK_SNO_R.create("T4");
		MAM_TRD_R S1_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S1_M2 = MAM_BP_R.create("M2");
		MAM_BP_R S1_M3 = MAM_BP_R.create("M3");
		MAM_DPT_R S1_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S1_M5 = MAM_WG_R.create("M5");
		MAM_USR_R S1_M6 = MAM_USR_R.create("M6");
		MAM_CUR_R S1_M7 = MAM_CUR_R.create("M7");
		MAM_CUR_R S1_M8 = MAM_CUR_R.create("M8");
		MAM_CUR_R S1_M9 = MAM_CUR_R.create("M9");
		MAM_TTERM_R S1_M10 = MAM_TTERM_R.create("M10");
		MAM_TTERM_R S1_M11 = MAM_TTERM_R.create("M11");
		MAM_TTERM_R S1_M12 = MAM_TTERM_R.create("M12");
		MAM_ITM_R S1_M13 = MAM_ITM_R.create("M13");
		MAM_ITM_TYP_D_R S1_M34 = MAM_ITM_TYP_D_R.create("M34");
		MAM_WG_R S1_M14 = MAM_WG_R.create("M14");
		MAM_BP_R S1_M18 = MAM_BP_R.create("M18");
		MAM_UNIT_R S1_M19 = MAM_UNIT_R.create("M19");
		MAM_BIZ_RSN_R S1_M20 = MAM_BIZ_RSN_R.create("M20");
		MAM_TAX_R S1_M21 = MAM_TAX_R.create("M21");
		MAM_STK_GD_R S1_M22 = MAM_STK_GD_R.create("M22");
		MAM_BIZ_RSN_R S1_M23 = MAM_BIZ_RSN_R.create("M23");
		MAM_DPT_R S1_M24 = MAM_DPT_R.create("M24");
		MAM_DPT_R S1_M25 = MAM_DPT_R.create("M25");
		MAM_ITM_R S1_M26 = MAM_ITM_R.create("M26");
		MAM_LOC_R S1_M27 = MAM_LOC_R.create("M27");
		MAM_COST_CTG_R S1_M28 = MAM_COST_CTG_R.create("M28");
		MAM_OPER_R S1_M29 = MAM_OPER_R.create("M29");
		MAM_UNIT_R S1_M30 = MAM_UNIT_R.create("M30");
		MAM_UNIT_R S1_M32 = MAM_UNIT_R.create("M32");
		MAVM_RD_DPT_R S1_V1 = MAVM_RD_DPT_R.create("V1");
		MAM_ITM_LCL_R S1_M33 = MAM_ITM_LCL_R.create("M33");
		MAM_BP_GRP_R S1_SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R S1_SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R S1_SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R S1_SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R S1_SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R S1_SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R S1_SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R S1_SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R S1_SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R S1_SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");
		MAM_ITM_GRP_R S1_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S1_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S1_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S1_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S1_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S1_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S1_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S1_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S1_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S1_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MST_PURC_ACT_R S2_T2 = MST_PURC_ACT_R.create("T2");
		MST_PURC_ACT_R S1_PURC = MST_PURC_ACT_R.create("PURC");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		MCDynamicSQLID DS1C_ITM_GRP = createDynamicSQLID("DS1C_ITM_GRP");
		MCDynamicSQLID DS1C_SPPL_GRP = createDynamicSQLID("DS1C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0170_MST_PURC_RET_ACT_Query_S03")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_M1.trd_nm,
						S0_T1.sppl_cd,
						S0_M2.bp_nm.as("sppl_nm"),
						S0_T2.asppl_cd,
						S0_M3.bp_nm.as("asppl_nm"),
						S0_T1.ret_sppl_nm,
						S0_T1.ret_sppl_cntct_dpt,
						S0_T1.ret_sppl_cntct_psn,
						S0_T1.ret_sppl_cntct_psn_title,
						S0_T1.ret_sppl_zip_cd,
						S0_T1.ret_sppl_addr1,
						S0_T1.ret_sppl_addr2,
						S0_T1.ret_sppl_addr3,
						S0_T1.ret_sppl_addr4,
						S0_T1.ret_sppl_tel,
						S0_T1.ret_sppl_fax,
						S0_T1.ret_sppl_fax,
						S0_T1.rcpt_iv_no,
						S0_T1.ref_rcpt_iv_no,
						S0_T1.purc_dpt_cd,
						S0_M4.dpt_nm.as("purc_dpt_nm"),
						S0_T1.wg_cd,
						S0_M5.wg_nm,
						S0_T1.purc_usr_cd,
						S0_M6.usr_nm.as("purc_usr_nm"),
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						decode(
							S0_T3.sundry_itm_flg,
							value(true),
							S0_T3.itm_nm,
							S0_M13.itm_nm
						).as("itm_nm"),
						decode(
							S0_M2.sppl_iv_flg,
							value(true),
							decode(
								S0_T3.sundry_itm_flg,
								value(true),
								S0_T3.iv_itm_nm,
								S0_M33.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_T3.sundry_itm_flg,
						S0_M14.site_cd,
						S0_M15.site_nm,
						S0_M14.wg_cd.as("loc_wg_cd"),
						S0_M16.wg_nm.as("loc_wg_nm"),
						S0_T7.purc_ret_loc_cd,
						S0_M14.loc_nm.as("purc_ret_loc_nm"),
						S0_T7.str_ln_cd,
						S0_M17.str_ln_nm,
						S0_T7.lot_no,
						S0_T7.sublot_no,
						S0_T7.ver_no,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T4.wrk_no,
						S0_T4.wrk_nm,
						S0_T3.maker_cd,
						S0_M18.bp_nm.as("maker_nm"),
						S0_T3.sppl_itm_cd,
						S0_T3.sppl_itm_nm,
						S0_T3.purc_id_typ,
						S0_T1.purc_ret_print_dt,
						S0_T1.purc_ret_print_flg,
						S0_T1.purc_ret_dt,
						S0_T1.ac_dt,
						S0_T7.trd_unit_qty,
						S0_T7.trd_unit_cd,
						S0_M19.unit_nm.as("trd_unit_nm"),
						S0_M19.dec_place.as("trd_qty_dec_place"),
						S0_T7.base_unit_qty,
						S0_T7.base_unit_cd,
						S0_M30.unit_nm.as("base_unit_nm"),
						S0_M30.dec_place.as("base_qty_dec_place"),
						S0_T2.trd_cur_cd,
						S0_M7.cur_nm.as("trd_cur_nm"),
						S0_M7.amt_dec_place.as("trd_amt_dec_place"),
						S0_M7.upri_dec_place.as("trd_upri_dec_place"),
						S0_T2.xrate,
						S0_T2.base_cur_cd,
						S0_M8.cur_nm.as("base_cur_nm"),
						S0_M8.amt_dec_place.as("base_amt_dec_place"),
						S0_M8.upri_dec_place.as("base_upri_dec_place"),
						S0_T2.ptax_cur_cd,
						S0_M9.cur_nm.as("ptax_cur_nm"),
						S0_M9.amt_dec_place.as("ptax_amt_dec_place"),
						S0_M9.upri_dec_place.as("ptax_upri_dec_place"),
						S0_T2.ptax_dt,
						S0_T2.ptax_xrate,
						S0_T3.purc_typ,
						S0_T3.mfg_inst_no,
						S0_T3.po_no,
						S0_T7.quality_typ,
						S0_T7.stk_insp_typ,
						S0_T7.stk_id_typ,
						S0_T7.gd_cd,
						S0_M22.gd_nm,
						S0_T3.ret_rsn_cd,
						S0_M23.biz_rsn_nm.as("ret_rsn_nm"),
						S0_T6.ap_dpt_cd,
						S0_M24.dpt_nm.as("ap_dpt_nm"),
						S0_T6.bd_dpt_cd,
						S0_M25.dpt_nm.as("bd_dpt_nm"),
						S0_T6.bd_itm_cd,
						S0_T6.bd_itm_sub1,
						S0_T6.bd_itm_sub2,
						S0_T6.bd_itm_sub3,
						S0_M26.itm_nm.as("bd_itm_nm"),
						S0_T6.bd_lot_no,
						S0_T6.bd_sublot_no,
						S0_T6.bd_sno1,
						S0_T6.bd_sno2,
						S0_T6.bd_sno3,
						S0_T6.bd_sno4,
						S0_T6.bd_loc_cd,
						S0_M27.loc_nm.as("bd_loc_nm"),
						S0_T6.bd_ctg_cd,
						S0_M28.ctg_nm.as("bd_ctg_nm"),
						S0_T6.bd_oper_cd,
						S0_M29.oper_nm.as("bd_oper_nm"),
						S0_T6.bd_iv_no,
						S0_T6.bd_slo_no,
						S0_T6.bd_po_no,
						S0_M13.cont_fctr_flg,
						S0_M13.cont_fctr_dec_place,
						S0_M13.cont_fctr_rnd_typ,
						S0_M13.cont_fctr_unit_cd,
						S0_M32.unit_nm.as("cont_fctr_unit_nm"),
						S0_M13.std_cont_fctr,
						S0_T7.purc_cont_qty,
						S0_T2.tterm_cd1,
						S0_M10.tterm_nm.as("tterm_nm1"),
						S0_T2.tterm_rmrks1,
						S0_T2.tterm_cd2,
						S0_M11.tterm_nm.as("tterm_nm2"),
						S0_T2.tterm_rmrks2,
						S0_T2.tterm_cd3,
						S0_M12.tterm_nm.as("tterm_nm3"),
						S0_T2.tterm_rmrks3,
						S0_T1.purc_ret_print_rmrks,
						S0_T3.purc_ret_print_d_rmrks,
						S0_T1.trd_rmrks.as("act_trd_rmrks"),
						S0_T3.trd_d_rmrks.as("act_trd_d_rmrks"),
						S0_T1.intr_rmrks.as("act_intr_rmrks"),
						S0_T3.intr_rmrks.as("act_intr_d_rmrks"),
						nullValue().as("purc_act_no"),
						nullValue().as("purc_act_d_no"),
						S0_T1.purc_ret_act_no,
						S0_T1.purc_ret_act_rev,
						S0_T3.purc_ret_act_d_no,
						S0_T3.disp_seq,
						S0_T7.purc_ret_act_io_no,
						S0_T1.purc_ret_schd_no,
						S0_T3.purc_ret_schd_d_no,
						S0_T7.purc_ret_schd_io_no,
						S0_T3.ref_purc_act_no,
						S0_T3.ref_purc_act_d_no,
						S0_T6.base_purc_ac_dt,
						S0_T1.sub_char1.as("act_sub_char1"),
						S0_T1.sub_char2.as("act_sub_char2"),
						S0_T1.sub_char3.as("act_sub_char3"),
						S0_T3.sub_char1.as("act_d_sub_char1"),
						S0_T3.sub_char2.as("act_d_sub_char2"),
						S0_T3.sub_char3.as("act_d_sub_char3"),
						S0_T7.sub_char1.as("act_io_sub_char1"),
						S0_T7.sub_char2.as("act_io_sub_char2"),
						S0_T7.sub_char3.as("act_io_sub_char3"),
						S0_T7.can_flg,
						S0_T7.ins_usr_id,
						S0_T7.ins_usr_nm,
						S0_T7.ins_func_id,
						S0_T7.ins_ts,
						S0_T7.upd_usr_id,
						S0_T7.upd_usr_nm,
						S0_T7.upd_func_id,
						S0_T7.upd_ts,
						S0_T7.upd_srv_req_no,
						addDynamicSelect(DS0C_SPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.purc_ret_act_no.eq(S0_T2.purc_ret_act_no)
								.and(S0_T1.purc_ret_act_rev.eq(S0_T2.purc_ret_act_rev))
								.and(
									bind("inc_can_flg").eq(value(false))
									.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									.or(
										bind("inc_can_flg").eq(value(true))
										.and(
											bracket(
												S0_T1.can_flg.eq(value(true))
												.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
												.and(
													S0_T2.purc_act_rev.in(
														subQuery()
														.select(max(S1_PURC.purc_act_rev).as("purc_act_rev"))
														.from(S1_PURC)
														.where(
															S1_PURC.purc_ret_act_no.eq(S0_T2.purc_ret_act_no)
															.and(S1_PURC.purc_ret_act_rev.eq(S0_T2.purc_ret_act_rev))
															.and(S1_PURC.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value())))
														)
													)
												)
											)
											.or(
												S0_T1.can_flg.eq(value(false))
												.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
											)
										)
									)
								)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.purc_ret_act_no.eq(S0_T3.purc_ret_act_no)
								.and(
									bind("inc_can_flg").eq(value(true))
									.or(
										bind("inc_can_flg").eq(value(false))
										.and(S0_T3.can_flg.eq(value(false)))
									)
								)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.sno1.eq(S0_T4.sno1)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T3.purc_ret_act_d_no.eq(S0_T6.purc_ret_act_d_no)
								.and(S0_T2.purc_act_no.eq(S0_T6.purc_act_no))
								.and(S0_T2.purc_act_seq.eq(S0_T6.purc_act_seq))
							)
						)
						.innerJoin(S0_T7).on(
							bracket(
								S0_T3.purc_ret_act_d_no.eq(S0_T7.purc_ret_act_d_no)
								.and(
									bind("inc_can_flg").eq(value(true))
									.or(
										bind("inc_can_flg").eq(value(false))
										.and(S0_T7.can_flg.eq(value(false)))
									)
								)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.trd_cd.eq(S0_M1.trd_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T2.asppl_cd.eq(S0_M3.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.wg_cd.eq(S0_M5.wg_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.purc_usr_cd.eq(S0_M6.usr_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T2.trd_cur_cd.eq(S0_M7.cur_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T2.base_cur_cd.eq(S0_M8.cur_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T2.ptax_cur_cd.eq(S0_M9.cur_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T2.tterm_cd1.eq(S0_M10.tterm_cd)
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T2.tterm_cd2.eq(S0_M11.tterm_cd)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T2.tterm_cd3.eq(S0_M12.tterm_cd)
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M13.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M13.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M13.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M13.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M34).on(
							S0_M13.itm_typ.eq(S0_M34.itm_typ)
							.and(S0_M13.itm_typ_d_cd.eq(S0_M34.itm_typ_d_cd))
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_T7.purc_ret_loc_cd.eq(S0_M14.loc_cd)
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_M14.site_cd.eq(S0_M15.site_cd)
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_M14.wg_cd.eq(S0_M16.wg_cd)
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_M14.loc_cd.eq(S0_M17.loc_cd)
								.and(S0_T7.str_ln_cd.eq(S0_M17.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_T3.maker_cd.eq(S0_M18.bp_cd)
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_T7.trd_unit_cd.eq(S0_M19.unit_cd)
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T6.dscnt_rsn_cd.eq(S0_M20.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T6.tax_cd.eq(S0_M21.tax_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T7.gd_cd.eq(S0_M22.gd_cd)
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_T3.ret_rsn_cd.eq(S0_M23.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T6.ap_dpt_cd.eq(S0_M24.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M24.st_dt, S0_M24.end_dt))
							)
						)
						.leftOuterJoin(S0_M25).on(
							bracket(
								S0_T6.bd_dpt_cd.eq(S0_M25.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M25.st_dt, S0_M25.end_dt))
							)
						)
						.leftOuterJoin(S0_M26).on(
							bracket(
								S0_T6.bd_itm_cd.eq(S0_M26.itm_cd)
								.and(S0_T6.bd_itm_sub1.eq(S0_M26.itm_sub1))
								.and(S0_T6.bd_itm_sub2.eq(S0_M26.itm_sub2))
								.and(S0_T6.bd_itm_sub3.eq(S0_M26.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_T6.bd_loc_cd.eq(S0_M27.loc_cd)
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_T6.bd_ctg_cd.eq(S0_M28.ctg_cd)
							)
						)
						.leftOuterJoin(S0_M29).on(
							bracket(
								S0_T6.bd_oper_cd.eq(S0_M29.oper_cd)
							)
						)
						.leftOuterJoin(S0_M30).on(
							bracket(
								S0_T7.base_unit_cd.eq(S0_M30.unit_cd)
							)
						)
						.leftOuterJoin(S0_M31).on(
							bracket(
								S0_T3.ret_rsn_cd.eq(S0_M31.biz_rsn_cd)
							)
						)
						.leftOuterJoin(S0_M32).on(
							bracket(
								S0_M13.cont_fctr_unit_cd.eq(S0_M32.unit_cd)
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_V1.dpt_cd)
							)
						)
						.leftOuterJoin(S0_M33).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M33.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M33.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M33.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M33.itm_sub3))
								.and(S0_M33.lcl_cd.eq(S0_M2.prnt_lcl_cd))
							)
						)
						.addDynamicView(DS0C_SPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bind("inc_can_flg").eq(value(true))
							.or(
								bind("inc_can_flg").eq(value(false))
								.and(S0_T1.can_flg.eq(value(false)))
							)
						)
						.and(
							bracket(
								bind("issue_flg").eq(value(true))
								.and(S0_T1.purc_ret_print_flg.eq(value(true)))
							)
							.or(
								bind("not_issue_flg").eq(value(true))
								.and(S0_T1.purc_ret_print_flg.eq(value(false)))
							)
						)
						.and(
							bracket(
								bind("iv_trgt_flg").eq(value(true))
								.and(S0_M2.sppl_iv_flg.eq(value(true)))
							)
							.or(
								bind("iv_not_trgt_flg").eq(value(true))
								.and(S0_M2.sppl_iv_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.purc_ret_print_dt.gte(bind("purc_ret_print_dt_fr")))
						.cutoff$and(S0_T1.purc_ret_print_dt.lte(bind("purc_ret_print_dt_to")))
						.cutoff$and(S0_T1.purc_ret_dt.gte(bind("purc_ret_dt_fr")))
						.cutoff$and(S0_T1.purc_ret_dt.lte(bind("purc_ret_dt_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_M14.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_M15.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_T1.ret_sppl_nm.like(bind("ret_sppl_nm")))
						.cutoff$and(S0_M14.wg_cd.like(bind("loc_wg_cd")))
						.cutoff$and(S0_M16.wg_nm.like(bind("loc_wg_nm")))
						.cutoff$and(S0_T7.purc_ret_loc_cd.like(bind("purc_ret_loc_cd")))
						.cutoff$and(S0_M14.loc_nm.like(bind("purc_ret_loc_nm")))
						.cutoff$and(S0_T7.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_M17.str_ln_nm.like(bind("str_ln_nm")))
						.cutoff$and(S0_M13.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M13.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M34.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
						.cutoff$and(S0_T3.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T3.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T3.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T3.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T3.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T3.itm_nm,
								S0_M13.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T7.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T7.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T7.sublot_no.like(bind("sublot_no")))
						.cutoff$and(
							nvl(
								S0_T3.iv_itm_nm,
								S0_M33.itm_nm
							).like(bind("iv_itm_nm"))
						)
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T7.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_M22.gd_nm.like(bind("gd_nm")))
						.cutoff$and(S0_T3.sno1.like(bind("sno1")))
						.cutoff$and(S0_T3.sno2.like(bind("sno2")))
						.cutoff$and(S0_T3.sno3.like(bind("sno3")))
						.cutoff$and(S0_T3.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("purc_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("purc_dpt_wg_cd")))
						.cutoff$and(S0_M5.wg_nm.like(bind("purc_dpt_wg_nm")))
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_M6.usr_nm.like(bind("purc_usr_nm")))
						.cutoff$and(S0_T6.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M24.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_T3.po_no.like(bind("po_no")))
						.cutoff$and(S0_T1.purc_ret_act_no.like(bind("purc_ret_act_no")))
						.cutoff$and(S0_T3.purc_ret_act_d_no.like(bind("purc_ret_act_d_no")))
						.cutoff$and(S0_T1.purc_ret_schd_no.like(bind("purc_ret_schd_no")))
						.cutoff$and(S0_T3.maker_cd.like(bind("maker_cd")))
						.cutoff$and(S0_M18.bp_nm.like(bind("maker_nm")))
						.cutoff$and(S0_T2.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_M7.cur_nm.like(bind("trd_cur_nm")))
						.cutoff$and(S0_T1.purc_ret_print_rmrks.like(bind("purc_ret_print_rmrks")))
						.cutoff$and(S0_T3.purc_ret_print_d_rmrks.like(bind("purc_ret_print_d_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("act_trd_rmrks")))
						.cutoff$and(S0_T3.trd_d_rmrks.like(bind("act_trd_d_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("act_intr_rmrks")))
						.cutoff$and(S0_T3.intr_rmrks.like(bind("act_intr_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("act_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("act_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("act_sub_char3")))
						.cutoff$and(S0_T3.sub_char1.like(bind("act_d_sub_char1")))
						.cutoff$and(S0_T3.sub_char2.like(bind("act_d_sub_char2")))
						.cutoff$and(S0_T3.sub_char3.like(bind("act_d_sub_char3")))
						.cutoff$and(S0_T7.sub_char1.like(bind("act_io_sub_char1")))
						.cutoff$and(S0_T7.sub_char2.like(bind("act_io_sub_char2")))
						.cutoff$and(S0_T7.sub_char3.like(bind("act_io_sub_char3")))
						.cutoff$and(S0_T3.purc_ret_schd_d_no.like(bind("purc_ret_schd_d_no")))
						.addDynamicPredicate(DS0C_SPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.unionAll(
						subQuery()
						.select(
							S1_T2.pr("trd_cd"),
							S1_M1.trd_nm,
							S1_T2.pr("sppl_cd"),
							S1_M2.bp_nm.as("sppl_nm"),
							S1_T2.pr("asppl_cd"),
							S1_M3.bp_nm.as("asppl_nm"),
							nullValue().as("ret_sppl_nm"),
							nullValue().as("ret_sppl_cntct_dpt"),
							nullValue().as("ret_sppl_cntct_psn"),
							nullValue().as("ret_sppl_cntct_psn_title"),
							nullValue().as("ret_sppl_zip_cd"),
							nullValue().as("ret_sppl_addr1"),
							nullValue().as("ret_sppl_addr2"),
							nullValue().as("ret_sppl_addr3"),
							nullValue().as("ret_sppl_addr4"),
							nullValue().as("ret_sppl_tel"),
							nullValue().as("ret_sppl_fax"),
							nullValue().as("ret_sppl_fax"),
							S1_T2.pr("rcpt_iv_no"),
							S1_T2.pr("ref_rcpt_iv_no"),
							S1_T2.pr("purc_dpt_cd"),
							S1_M4.dpt_nm.as("purc_dpt_nm"),
							S1_T2.pr("wg_cd"),
							S1_M5.wg_nm,
							S1_T2.pr("purc_usr_cd"),
							S1_M6.usr_nm.as("purc_usr_nm"),
							S1_T6.itm_cd,
							S1_T6.itm_sub1,
							S1_T6.itm_sub2,
							S1_T6.itm_sub3,
							decode(
								S1_T6.sundry_itm_flg,
								value(true),
								S1_T6.itm_nm,
								S1_M13.itm_nm
							).as("itm_nm"),
							decode(
								S1_M2.sppl_iv_flg,
								value(true),
								decode(
									S1_T6.sundry_itm_flg,
									value(true),
									S1_T6.iv_itm_nm,
									S1_M33.itm_nm
								),
								nullValue()
							).as("iv_itm_nm"),
							S1_T6.sundry_itm_flg,
							nullValue().as("site_cd"),
							nullValue().as("site_nm"),
							nullValue().as("loc_wg_cd"),
							nullValue().as("loc_wg_nm"),
							nullValue().as("purc_ret_loc_cd"),
							nullValue().as("purc_ret_loc_nm"),
							nullValue().as("str_ln_cd"),
							nullValue().as("str_ln_nm"),
							S1_T7.lot_no,
							S1_T7.sublot_no,
							S1_T7.ver_no,
							S1_T6.sno1,
							S1_T6.sno2,
							S1_T6.sno3,
							S1_T6.sno4,
							S1_T4.wrk_no,
							S1_T4.wrk_nm,
							S1_T6.maker_cd,
							S1_M18.bp_nm.as("maker_nm"),
							S1_T6.sppl_itm_cd,
							S1_T6.sppl_itm_nm,
							S1_T6.purc_id_typ,
							nullValue().as("purc_ret_print_dt"),
							nullValue().as("purc_ret_print_flg"),
							nullValue().as("purc_ret_dt"),
							S1_T2.pr("ac_dt"),
							S1_T7.trd_unit_qty,
							S1_T7.trd_unit_cd,
							S1_M19.unit_nm.as("trd_unit_nm"),
							S1_M19.dec_place.as("trd_qty_dec_place"),
							S1_T7.base_unit_qty,
							S1_T7.base_unit_cd,
							S1_M30.unit_nm.as("base_unit_nm"),
							S1_M30.dec_place.as("base_qty_dec_place"),
							S1_T2.pr("trd_cur_cd"),
							S1_M7.cur_nm.as("trd_cur_nm"),
							S1_M7.amt_dec_place.as("trd_amt_dec_place"),
							S1_M7.upri_dec_place.as("trd_upri_dec_place"),
							S1_T2.pr("xrate"),
							S1_T2.pr("base_cur_cd"),
							S1_M8.cur_nm.as("base_cur_nm"),
							S1_M8.amt_dec_place.as("base_amt_dec_place"),
							S1_M8.upri_dec_place.as("base_upri_dec_place"),
							S1_T2.pr("ptax_cur_cd"),
							S1_M9.cur_nm.as("ptax_cur_nm"),
							S1_M9.amt_dec_place.as("ptax_amt_dec_place"),
							S1_M9.upri_dec_place.as("ptax_upri_dec_place"),
							S1_T2.pr("ptax_dt"),
							S1_T2.pr("ptax_xrate"),
							S1_T6.purc_typ,
							S1_T6.mfg_inst_no,
							S1_T6.po_no,
							S1_T7.quality_typ,
							S1_T7.stk_insp_typ,
							S1_T7.stk_id_typ,
							S1_T7.gd_cd,
							S1_M22.gd_nm,
							S1_T6.rsn_cd.as("ret_rsn_cd"),
							S1_M23.biz_rsn_nm.as("ret_rsn_nm"),
							S1_T6.ap_dpt_cd,
							S1_M24.dpt_nm.as("ap_dpt_nm"),
							S1_T6.bd_dpt_cd,
							S1_M25.dpt_nm.as("bd_dpt_nm"),
							S1_T6.bd_itm_cd,
							S1_T6.bd_itm_sub1,
							S1_T6.bd_itm_sub2,
							S1_T6.bd_itm_sub3,
							S1_M26.itm_nm.as("bd_itm_nm"),
							S1_T6.bd_lot_no,
							S1_T6.bd_sublot_no,
							S1_T6.bd_sno1,
							S1_T6.bd_sno2,
							S1_T6.bd_sno3,
							S1_T6.bd_sno4,
							S1_T6.bd_loc_cd,
							S1_M27.loc_nm.as("bd_loc_nm"),
							S1_T6.bd_ctg_cd,
							S1_M28.ctg_nm.as("bd_ctg_nm"),
							S1_T6.bd_oper_cd,
							S1_M29.oper_nm.as("bd_oper_nm"),
							S1_T6.bd_iv_no,
							S1_T6.bd_slo_no,
							S1_T6.bd_po_no,
							S1_M13.cont_fctr_flg,
							S1_M13.cont_fctr_dec_place,
							S1_M13.cont_fctr_rnd_typ,
							S1_M13.cont_fctr_unit_cd,
							S1_M32.unit_nm.as("cont_fctr_unit_nm"),
							S1_M13.std_cont_fctr,
							S1_T10.purc_cont_qty,
							S1_T2.pr("tterm_cd1"),
							S1_M10.tterm_nm.as("tterm_nm1"),
							S1_T2.pr("tterm_rmrks1"),
							S1_T2.pr("tterm_cd2"),
							S1_M11.tterm_nm.as("tterm_nm2"),
							S1_T2.pr("tterm_rmrks2"),
							S1_T2.pr("tterm_cd3"),
							S1_M12.tterm_nm.as("tterm_nm3"),
							S1_T2.pr("tterm_rmrks3"),
							nullValue().as("purc_ret_print_rmrks"),
							nullValue().as("purc_ret_print_d_rmrks"),
							nullValue().as("act_trd_rmrks"),
							nullValue().as("act_trd_d_rmrks"),
							nullValue().as("act_intr_rmrks"),
							nullValue().as("act_intr_d_rmrks"),
							S1_T6.purc_act_no,
							S1_T6.purc_act_d_no,
							nullValue().as("purc_ret_act_no"),
							nullValue().as("purc_ret_act_rev"),
							nullValue().as("purc_ret_act_d_no"),
							nullValue().as("disp_seq"),
							nullValue().as("purc_ret_act_io_no"),
							nullValue().as("purc_ret_schd_no"),
							nullValue().as("purc_ret_schd_d_no"),
							nullValue().as("purc_ret_schd_io_no"),
							nullValue().as("ref_purc_act_no"),
							nullValue().as("ref_purc_act_d_no"),
							S1_T6.base_purc_ac_dt,
							nullValue().as("act_sub_char1"),
							nullValue().as("act_sub_char2"),
							nullValue().as("act_sub_char3"),
							nullValue().as("act_d_sub_char1"),
							nullValue().as("act_d_sub_char2"),
							nullValue().as("act_d_sub_char3"),
							nullValue().as("act_io_sub_char1"),
							nullValue().as("act_io_sub_char2"),
							nullValue().as("act_io_sub_char3"),
							decode(
								S1_T2.pr("slip_sts_typ"),
								value(MAC_SLIP_STS_TYP.CAN.value()),
								value(true),
								value(false)
							).as("can_flg"),
							S1_T7.ins_usr_id,
							S1_T7.ins_usr_nm,
							S1_T7.ins_func_id,
							S1_T7.ins_ts,
							S1_T7.upd_usr_id,
							S1_T7.upd_usr_nm,
							S1_T7.upd_func_id,
							S1_T7.upd_ts,
							S1_T7.upd_srv_req_no,
							addDynamicSelect(DS1C_SPPL_GRP),
							addDynamicSelect(DS1C_ITM_GRP)
						)
						.from(
							subQuery()
							.select(S2_T2.prAll())
							.from(S2_T2)
							.where(
								value(0).eq(value(0))
								.and(
									bind("inc_can_flg").eq(value(false))
									.and(S2_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
									.or(
										bind("inc_can_flg").eq(value(true))
										.and(
											S2_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
											.or(S2_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value())))
										)
									)
								)
							).view(S1_T2)
							.innerJoin(S1_T6).on(
								bracket(
									S1_T2.pr("purc_act_no").eq(S1_T6.purc_act_no)
									.and(S1_T2.pr("purc_act_seq").eq(S1_T6.purc_act_seq))
								)
							)
							.innerJoin(S1_T7).on(
								bracket(
									S1_T6.purc_act_d_no.eq(S1_T7.purc_act_d_no)
									.and(S1_T6.purc_act_d_seq.eq(S1_T7.purc_act_d_seq))
								)
							)
							.leftOuterJoin(S1_T10).on(
								bracket(
									S1_T7.arr_act_no.eq(S1_T10.arr_act_no)
								)
							)
							.leftOuterJoin(S1_T4).on(
								bracket(
									S1_T6.sno1.eq(S1_T4.sno1)
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_T2.pr("trd_cd").eq(S1_M1.trd_cd)
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_T2.pr("sppl_cd").eq(S1_M2.bp_cd)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_T2.pr("asppl_cd").eq(S1_M3.bp_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T2.pr("purc_dpt_cd").eq(S1_M4.dpt_cd)
									.and(S1_T2.pr("ac_dt").between(S1_M4.st_dt, S1_M4.end_dt))
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T2.pr("wg_cd").eq(S1_M5.wg_cd)
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_T2.pr("purc_usr_cd").eq(S1_M6.usr_cd)
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_T2.pr("trd_cur_cd").eq(S1_M7.cur_cd)
								)
							)
							.leftOuterJoin(S1_M8).on(
								bracket(
									S1_T2.pr("base_cur_cd").eq(S1_M8.cur_cd)
								)
							)
							.leftOuterJoin(S1_M9).on(
								bracket(
									S1_T2.pr("ptax_cur_cd").eq(S1_M9.cur_cd)
								)
							)
							.leftOuterJoin(S1_M10).on(
								bracket(
									S1_T2.pr("tterm_cd1").eq(S1_M10.tterm_cd)
								)
							)
							.leftOuterJoin(S1_M11).on(
								bracket(
									S1_T2.pr("tterm_cd2").eq(S1_M11.tterm_cd)
								)
							)
							.leftOuterJoin(S1_M12).on(
								bracket(
									S1_T2.pr("tterm_cd3").eq(S1_M12.tterm_cd)
								)
							)
							.leftOuterJoin(S1_M13).on(
								bracket(
									S1_T6.itm_cd.eq(S1_M13.itm_cd)
									.and(S1_T6.itm_sub1.eq(S1_M13.itm_sub1))
									.and(S1_T6.itm_sub2.eq(S1_M13.itm_sub2))
									.and(S1_T6.itm_sub3.eq(S1_M13.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M34).on(
								S1_M13.itm_typ.eq(S1_M34.itm_typ)
								.and(S1_M13.itm_typ_d_cd.eq(S1_M34.itm_typ_d_cd))
							)
							.leftOuterJoin(S1_M14).on(
								bracket(
									S1_T6.in_to_loc_wg_cd.eq(S1_M14.wg_cd)
								)
							)
							.leftOuterJoin(S1_M18).on(
								bracket(
									S1_T6.maker_cd.eq(S1_M18.bp_cd)
								)
							)
							.leftOuterJoin(S1_M19).on(
								bracket(
									S1_T6.trd_unit_cd.eq(S1_M19.unit_cd)
								)
							)
							.leftOuterJoin(S1_M20).on(
								bracket(
									S1_T6.dscnt_rsn_cd.eq(S1_M20.biz_rsn_cd)
								)
							)
							.leftOuterJoin(S1_M21).on(
								bracket(
									S1_T6.tax_cd.eq(S1_M21.tax_cd)
								)
							)
							.leftOuterJoin(S1_M22).on(
								bracket(
									S1_T6.gd_cd.eq(S1_M22.gd_cd)
								)
							)
							.leftOuterJoin(S1_M23).on(
								bracket(
									S1_T6.rsn_cd.eq(S1_M23.biz_rsn_cd)
								)
							)
							.leftOuterJoin(S1_M24).on(
								bracket(
									S1_T6.ap_dpt_cd.eq(S1_M24.dpt_cd)
									.and(S1_T2.pr("ac_dt").between(S1_M24.st_dt, S1_M24.end_dt))
								)
							)
							.leftOuterJoin(S1_M25).on(
								bracket(
									S1_T6.bd_dpt_cd.eq(S1_M25.dpt_cd)
									.and(S1_T2.pr("ac_dt").between(S1_M25.st_dt, S1_M25.end_dt))
								)
							)
							.leftOuterJoin(S1_M26).on(
								bracket(
									S1_T6.bd_itm_cd.eq(S1_M26.itm_cd)
									.and(S1_T6.bd_itm_sub1.eq(S1_M26.itm_sub1))
									.and(S1_T6.bd_itm_sub2.eq(S1_M26.itm_sub2))
									.and(S1_T6.bd_itm_sub3.eq(S1_M26.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M27).on(
								bracket(
									S1_T6.bd_loc_cd.eq(S1_M27.loc_cd)
								)
							)
							.leftOuterJoin(S1_M28).on(
								bracket(
									S1_T6.bd_ctg_cd.eq(S1_M28.ctg_cd)
								)
							)
							.leftOuterJoin(S1_M29).on(
								bracket(
									S1_T6.bd_oper_cd.eq(S1_M29.oper_cd)
								)
							)
							.leftOuterJoin(S1_M30).on(
								bracket(
									S1_T6.base_unit_cd.eq(S1_M30.unit_cd)
								)
							)
							.leftOuterJoin(S1_M32).on(
								bracket(
									S1_M13.cont_fctr_unit_cd.eq(S1_M32.unit_cd)
								)
							)
							.innerJoin(S1_V1).on(
								bracket(
									S1_T2.pr("purc_dpt_cd").eq(S1_V1.dpt_cd)
								)
							)
							.leftOuterJoin(S1_M33).on(
								bracket(
									S1_T6.itm_cd.eq(S1_M33.itm_cd)
									.and(S1_T6.itm_sub1.eq(S1_M33.itm_sub1))
									.and(S1_T6.itm_sub2.eq(S1_M33.itm_sub2))
									.and(S1_T6.itm_sub3.eq(S1_M33.itm_sub3))
									.and(S1_M33.lcl_cd.eq(S1_M2.prnt_lcl_cd))
								)
							)
							.addDynamicView(DS1C_SPPL_GRP)
							.addDynamicView(DS1C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(
								bracket(
									bind("iv_trgt_flg").eq(value(true))
									.and(S1_M2.sppl_iv_flg.eq(value(true)))
								)
								.or(
									bind("iv_not_trgt_flg").eq(value(true))
									.and(S1_M2.sppl_iv_flg.eq(value(false)))
								)
							)
							.cutoff$and(S1_T2.pr("ac_dt").gte(bind("ac_dt_fr")))
							.cutoff$and(S1_T2.pr("ac_dt").lte(bind("ac_dt_to")))
							.cutoff$and(S1_T2.pr("sppl_cd").like(bind("sppl_cd")))
							.cutoff$and(S1_M2.bp_nm.like(bind("sppl_nm")))
							.cutoff$and(S1_T6.in_to_loc_wg_cd.like(bind("loc_wg_cd")))
							.cutoff$and(S1_M14.wg_nm.like(bind("loc_wg_nm")))
							.cutoff$and(S1_M13.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_M13.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_M34.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1_T6.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T6.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T6.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T6.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T6.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								nvl(
									S1_T6.itm_nm,
									S1_M13.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_T7.ver_no.like(bind("ver_no")))
							.cutoff$and(S1_T7.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T7.sublot_no.like(bind("sublot_no")))
							.cutoff$and(
								nvl(
									S1_T6.iv_itm_nm,
									S1_M33.itm_nm
								).like(bind("iv_itm_nm"))
							)
							.cutoff$and(S1_T2.pr("rcpt_iv_no").like(bind("iv_no")))
							.cutoff$and(S1_T7.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1_M22.gd_nm.like(bind("gd_nm")))
							.cutoff$and(S1_T6.sno1.like(bind("sno1")))
							.cutoff$and(S1_T6.sno2.like(bind("sno2")))
							.cutoff$and(S1_T6.sno3.like(bind("sno3")))
							.cutoff$and(S1_T6.sno4.like(bind("sno4")))
							.cutoff$and(S1_T2.pr("purc_dpt_cd").like(bind("purc_dpt_cd")))
							.cutoff$and(S1_M4.dpt_nm.like(bind("purc_dpt_nm")))
							.cutoff$and(S1_T2.pr("wg_cd").like(bind("purc_dpt_wg_cd")))
							.cutoff$and(S1_M5.wg_nm.like(bind("purc_dpt_wg_nm")))
							.cutoff$and(S1_T2.pr("purc_usr_cd").like(bind("purc_usr_cd")))
							.cutoff$and(S1_M6.usr_nm.like(bind("purc_usr_nm")))
							.cutoff$and(S1_T6.ap_dpt_cd.like(bind("ap_dpt_cd")))
							.cutoff$and(S1_M24.dpt_nm.like(bind("ap_dpt_nm")))
							.cutoff$and(S1_T2.pr("po_no").like(bind("po_no")))
							.cutoff$and(S1_T6.maker_cd.like(bind("maker_cd")))
							.cutoff$and(S1_M18.bp_nm.like(bind("maker_nm")))
							.cutoff$and(S1_T2.pr("trd_cur_cd").like(bind("trd_cur_cd")))
							.cutoff$and(S1_M7.cur_nm.like(bind("trd_cur_nm")))
							.and(
								bind("inc_ret_dscnt_flg").eq(value(true))
								.and(S1_M23.purc_rtn_flg.eq(value(true)))
								.and(S1_M23.purc_dscnt_flg.eq(value(true)))
								.and(
									S1_M1.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.PURC_DSCNT.value()),
										value(MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS.value()),
										value(MAC_TRD_PTN_TYP.PURC_XTRA.value()),
										value(MAC_TRD_PTN_TYP.PURC_XTRA_XPNS.value())
									)
								)
							)
							.addDynamicPredicate(DS1C_SPPL_GRP)
							.addDynamicPredicate(DS1C_ITM_GRP)
						)
					)
					.orderBy(
						pr("purc_ret_act_no").asc(),
						pr("purc_ret_act_rev").asc(),
						pr("disp_seq").asc(),
						pr("purc_ret_act_io_no").asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd1.as("sppl_grp_cd1"), S0_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP1).on(S0_M2.bp_grp_cd1.eq(S0_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd2.as("sppl_grp_cd2"), S0_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP2).on(S0_M2.bp_grp_cd2.eq(S0_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd3.as("sppl_grp_cd3"), S0_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP3).on(S0_M2.bp_grp_cd3.eq(S0_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd4.as("sppl_grp_cd4"), S0_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP4).on(S0_M2.bp_grp_cd4.eq(S0_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd5.as("sppl_grp_cd5"), S0_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP5).on(S0_M2.bp_grp_cd5.eq(S0_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd6.as("sppl_grp_cd6"), S0_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP6).on(S0_M2.bp_grp_cd6.eq(S0_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd7.as("sppl_grp_cd7"), S0_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP7).on(S0_M2.bp_grp_cd7.eq(S0_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd8.as("sppl_grp_cd8"), S0_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP8).on(S0_M2.bp_grp_cd8.eq(S0_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd9.as("sppl_grp_cd9"), S0_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP9).on(S0_M2.bp_grp_cd9.eq(S0_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd10.as("sppl_grp_cd10"), S0_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP10).on(S0_M2.bp_grp_cd10.eq(S0_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd1.as("itm_grp_cd1"), S0_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_M13.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd2.as("itm_grp_cd2"), S0_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_M13.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd3.as("itm_grp_cd3"), S0_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_M13.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd4.as("itm_grp_cd4"), S0_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_M13.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd5.as("itm_grp_cd5"), S0_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_M13.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd6.as("itm_grp_cd6"), S0_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_M13.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd7.as("itm_grp_cd7"), S0_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_M13.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd8.as("itm_grp_cd8"), S0_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_M13.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd9.as("itm_grp_cd9"), S0_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_M13.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M13.itm_grp_cd10.as("itm_grp_cd10"), S0_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_M13.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M13.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd1.as("sppl_grp_cd1"), S1_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP1).on(S1_M2.bp_grp_cd1.eq(S1_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S1_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd2.as("sppl_grp_cd2"), S1_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP2).on(S1_M2.bp_grp_cd2.eq(S1_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S1_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd3.as("sppl_grp_cd3"), S1_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP3).on(S1_M2.bp_grp_cd3.eq(S1_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S1_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd4.as("sppl_grp_cd4"), S1_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP4).on(S1_M2.bp_grp_cd4.eq(S1_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S1_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd5.as("sppl_grp_cd5"), S1_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP5).on(S1_M2.bp_grp_cd5.eq(S1_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S1_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd6.as("sppl_grp_cd6"), S1_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP6).on(S1_M2.bp_grp_cd6.eq(S1_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S1_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd7.as("sppl_grp_cd7"), S1_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP7).on(S1_M2.bp_grp_cd7.eq(S1_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S1_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd8.as("sppl_grp_cd8"), S1_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP8).on(S1_M2.bp_grp_cd8.eq(S1_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S1_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd9.as("sppl_grp_cd9"), S1_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP9).on(S1_M2.bp_grp_cd9.eq(S1_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S1_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS1C_SPPL_GRP, S1_M2.bp_grp_cd10.as("sppl_grp_cd10"), S1_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS1C_SPPL_GRP, v -> v.leftOuterJoin(S1_SPPL_GRP10).on(S1_M2.bp_grp_cd10.eq(S1_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS1C_SPPL_GRP, p -> p.cutoff$and(S1_M2.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S1_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd1.as("itm_grp_cd1"), S1_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP1).on(S1_M13.itm_grp_cd1.eq(S1_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S1_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd2.as("itm_grp_cd2"), S1_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP2).on(S1_M13.itm_grp_cd2.eq(S1_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S1_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd3.as("itm_grp_cd3"), S1_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP3).on(S1_M13.itm_grp_cd3.eq(S1_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S1_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd4.as("itm_grp_cd4"), S1_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP4).on(S1_M13.itm_grp_cd4.eq(S1_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S1_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd5.as("itm_grp_cd5"), S1_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP5).on(S1_M13.itm_grp_cd5.eq(S1_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S1_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd6.as("itm_grp_cd6"), S1_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP6).on(S1_M13.itm_grp_cd6.eq(S1_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S1_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd7.as("itm_grp_cd7"), S1_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP7).on(S1_M13.itm_grp_cd7.eq(S1_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S1_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd8.as("itm_grp_cd8"), S1_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP8).on(S1_M13.itm_grp_cd8.eq(S1_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S1_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd9.as("itm_grp_cd9"), S1_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP9).on(S1_M13.itm_grp_cd9.eq(S1_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S1_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS1C_ITM_GRP, S1_M13.itm_grp_cd10.as("itm_grp_cd10"), S1_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP10).on(S1_M13.itm_grp_cd10.eq(S1_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M13.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S1_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBDL0170_MST_PURC_RET_SCHD_Query_S01
	 */
	static MCQueryPlan MSBDL0170_MST_PURC_RET_SCHD_S01() {
		MST_PURC_RET_SCHD_R S0_T1 = MST_PURC_RET_SCHD_R.create("T1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_USR_R S0_M6 = MAM_USR_R.create("M6");
		MAM_CUR_R S0_M7 = MAM_CUR_R.create("M7");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
		MAM_BP_GRP_R S0_MM1 = MAM_BP_GRP_R.create("MM1");
		MAM_BP_GRP_R S0_MM2 = MAM_BP_GRP_R.create("MM2");
		MAM_BP_GRP_R S0_MM3 = MAM_BP_GRP_R.create("MM3");
		MAM_BP_GRP_R S0_MM4 = MAM_BP_GRP_R.create("MM4");
		MAM_BP_GRP_R S0_MM5 = MAM_BP_GRP_R.create("MM5");
		MAM_BP_GRP_R S0_MM6 = MAM_BP_GRP_R.create("MM6");
		MAM_BP_GRP_R S0_MM7 = MAM_BP_GRP_R.create("MM7");
		MAM_BP_GRP_R S0_MM8 = MAM_BP_GRP_R.create("MM8");
		MAM_BP_GRP_R S0_MM9 = MAM_BP_GRP_R.create("MM9");
		MAM_BP_GRP_R S0_MM10 = MAM_BP_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0170_MST_PURC_RET_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.sppl_cd,
						S0_M2.bp_nm.as("sppl_nm"),
						S0_M2.asppl_cd,
						S0_T1.ret_sppl_nm,
						S0_T1.ret_sppl_cntct_dpt,
						S0_T1.ret_sppl_cntct_psn,
						S0_T1.ret_sppl_cntct_psn_title,
						S0_T1.ret_sppl_zip_cd,
						S0_T1.ret_sppl_addr1,
						S0_T1.ret_sppl_addr2,
						S0_T1.ret_sppl_addr3,
						S0_T1.ret_sppl_addr4,
						S0_T1.ret_sppl_tel,
						S0_T1.ret_sppl_fax,
						S0_T1.ret_sppl_fax,
						S0_T1.rcpt_iv_no,
						S0_T1.ref_rcpt_iv_no,
						S0_T1.purc_dpt_cd,
						S0_M4.dpt_nm.as("purc_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.purc_usr_cd,
						S0_T1.schd_dt,
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.trd_rmrks.as("schd_trd_rmrks"),
						S0_T1.intr_rmrks.as("schd_intr_rmrks"),
						S0_T1.purc_ret_schd_no,
						S0_T1.sub_char1.as("schd_sub_char1"),
						S0_T1.sub_char2.as("schd_sub_char2"),
						S0_T1.sub_char3.as("schd_sub_char3"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_V1.dpt_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("iv_trgt_flg").eq(value(true))
								.and(S0_M2.sppl_iv_flg.eq(value(true)))
							)
							.or(
								bind("iv_not_trgt_flg").eq(value(true))
								.and(S0_M2.sppl_iv_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.schd_dt.gte(bind("schd_dt_fr")))
						.cutoff$and(S0_T1.schd_dt.lte(bind("schd_dt_to")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_T1.ret_sppl_nm.like(bind("ret_sppl_nm")))
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("purc_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("purc_dpt_wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_T1.purc_ret_schd_no.like(bind("purc_ret_schd_no")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("schd_trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("schd_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("schd_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("schd_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("schd_sub_char3")))
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(S0_T1.purc_ret_schd_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("purc_dpt_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("purc_dpt_wg_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T1.purc_usr_cd.eq(S0_M6.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.trd_cur_cd.eq(S0_M7.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("purc_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0170_MST_PURC_RET_SCHD_Query_S02
	 */
	static MCQueryPlan MSBDL0170_MST_PURC_RET_SCHD_S02() {
		MST_PURC_RET_SCHD_R S0_T1 = MST_PURC_RET_SCHD_R.create("T1");
		MST_PURC_RET_SCHD_D_R S0_T2 = MST_PURC_RET_SCHD_D_R.create("T2");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_USR_R S0_M6 = MAM_USR_R.create("M6");
		MAM_CUR_R S0_M7 = MAM_CUR_R.create("M7");
		MAM_ITM_R S0_M11 = MAM_ITM_R.create("M11");
		MAM_ITM_TYP_D_R S0_M31 = MAM_ITM_TYP_D_R.create("M31");
		MAM_LOC_R S0_M12 = MAM_LOC_R.create("M12");
		MAM_SITE_R S0_M13 = MAM_SITE_R.create("M13");
		MAM_WG_R S0_M14 = MAM_WG_R.create("M14");
		MAM_STR_LN_R S0_M15 = MAM_STR_LN_R.create("M15");
		MAM_BP_R S0_M16 = MAM_BP_R.create("M16");
		MAM_STK_GD_R S0_M20 = MAM_STK_GD_R.create("M20");
		MAM_DPT_R S0_M22 = MAM_DPT_R.create("M22");
		MAM_DPT_R S0_M23 = MAM_DPT_R.create("M23");
		MAM_ITM_LCL_R S0_M30 = MAM_ITM_LCL_R.create("M30");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
		MCTempView S0_V2 = createTempView("V2");
		MAM_BP_GRP_R S0_SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R S0_SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R S0_SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R S0_SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R S0_SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R S0_SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R S0_SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R S0_SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R S0_SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R S0_SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");
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
		MST_PURC_RET_ACT_D_R S1_AD = MST_PURC_RET_ACT_D_R.create("AD");
		MST_PURC_RET_ACT_R S1_A1 = MST_PURC_RET_ACT_R.create("A1");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0170_MST_PURC_RET_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_T2.abort_flg,
						cases()
							.when(S0_T2.abort_flg.eq(value(true)))
								.then(value(MSC_PRET_SCHD_STS_TYP.PRET_ABORT.value()))
							.when(
								S0_V2.pr("base_unit_qty").isNull()
								.or(S0_V2.pr("base_unit_qty").eq(value(0)))
							)
								.then(value(MSC_PRET_SCHD_STS_TYP.NON.value()))
							.when(
								value(0).lt(S0_V2.pr("base_unit_qty"))
								.and(S0_V2.pr("base_unit_qty").lt(S0_T2.base_unit_qty))
							)
								.then(value(MSC_PRET_SCHD_STS_TYP.PART.value()))
							.when(S0_V2.pr("base_unit_qty").gte(S0_T2.base_unit_qty))
								.then(value(MSC_PRET_SCHD_STS_TYP.COMPL.value()))
							.otherwise(nullValue()).as("sret_schd_sts_typ"),
						S0_T1.trd_cd,
						S0_T1.sppl_cd,
						S0_M2.bp_nm.as("sppl_nm"),
						S0_M2.asppl_cd,
						S0_T1.ret_sppl_nm,
						S0_T1.ret_sppl_cntct_dpt,
						S0_T1.ret_sppl_cntct_psn,
						S0_T1.ret_sppl_cntct_psn_title,
						S0_T1.ret_sppl_zip_cd,
						S0_T1.ret_sppl_addr1,
						S0_T1.ret_sppl_addr2,
						S0_T1.ret_sppl_addr3,
						S0_T1.ret_sppl_addr4,
						S0_T1.ret_sppl_tel,
						S0_T1.ret_sppl_fax,
						S0_T1.ret_sppl_fax,
						S0_T1.rcpt_iv_no,
						S0_T1.ref_rcpt_iv_no,
						S0_T1.purc_dpt_cd,
						S0_M4.dpt_nm.as("purc_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.purc_usr_cd,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							S0_T2.itm_nm,
							S0_M11.itm_nm
						).as("itm_nm"),
						decode(
							S0_M2.sppl_iv_flg,
							value(true),
							decode(
								S0_T2.sundry_itm_flg,
								value(true),
								S0_T2.iv_itm_nm,
								S0_M30.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_T2.sundry_itm_flg,
						S0_T2.purc_ret_loc_cd,
						S0_T2.str_ln_cd,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.ver_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.maker_cd,
						S0_T2.sppl_itm_cd,
						S0_T2.sppl_itm_nm,
						S0_T2.purc_id_typ,
						S0_T1.schd_dt,
						S0_T2.trd_unit_qty,
						S0_T2.trd_unit_cd,
						S0_T2.base_unit_qty,
						S0_T2.base_unit_cd,
						S0_V2.pr("base_unit_qty").as("ret_qty"),
						S0_T2.trd_cur_upri,
						decode(S0_T2.purc_typ, value(MAC_PURC_TYP.PURC_ITM.value()), value(false), S0_M2.repurc_obli_flg).as("repurc_obli_flg"),
						S0_T2.trd_cur_proc_upri,
						S0_T2.trd_cur_onr_prov_upri,
						S0_T2.interim_flg,
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T2.trd_cur_amt,
						S0_T2.trd_cur_proc_amt,
						S0_T2.trd_cur_onr_prov_amt,
						bracket(
							S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt)
						).as("trd_cur_amt_inc_tax_cur_amt"),
						S0_T2.tax_cd,
						S0_T2.trd_cur_tax_amt,
						S0_T2.pay_crryovr_times,
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.purc_typ,
						S0_T2.mfg_inst_no,
						S0_T2.po_no,
						S0_T2.gd_cd,
						S0_T2.ret_rsn_cd,
						S0_T2.ap_dpt_cd,
						S0_M22.dpt_nm.as("ap_dpt_nm"),
						S0_T2.bd_dpt_cd,
						S0_M23.dpt_nm.as("bd_dpt_nm"),
						S0_T2.bd_itm_cd,
						S0_T2.bd_itm_sub1,
						S0_T2.bd_itm_sub2,
						S0_T2.bd_itm_sub3,
						S0_T2.bd_lot_no,
						S0_T2.bd_sublot_no,
						S0_T2.bd_sno1,
						S0_T2.bd_sno2,
						S0_T2.bd_sno3,
						S0_T2.bd_sno4,
						S0_T2.bd_loc_cd,
						S0_T2.bd_ctg_cd,
						S0_T2.bd_oper_cd,
						S0_T2.bd_iv_no,
						S0_T2.bd_slo_no,
						S0_T2.bd_po_no,
						S0_M11.cont_fctr_flg,
						S0_M11.cont_fctr_dec_place,
						S0_M11.cont_fctr_rnd_typ,
						S0_M11.cont_fctr_unit_cd,
						S0_M11.std_cont_fctr,
						S0_T2.purc_cont_qty,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.trd_rmrks.as("schd_trd_rmrks"),
						S0_T2.trd_d_rmrks.as("schd_trd_d_rmrks"),
						S0_T1.intr_rmrks.as("schd_intr_rmrks"),
						S0_T2.intr_rmrks.as("schd_intr_d_rmrks"),
						S0_T1.purc_ret_schd_no,
						S0_T2.purc_ret_schd_d_no,
						S0_T2.ref_purc_act_no,
						S0_T2.ref_purc_act_d_no,
						S0_T2.base_purc_ac_dt,
						S0_T1.sub_char1.as("schd_sub_char1"),
						S0_T1.sub_char2.as("schd_sub_char2"),
						S0_T1.sub_char3.as("schd_sub_char3"),
						S0_T2.sub_char1.as("schd_d_sub_char1"),
						S0_T2.sub_char2.as("schd_d_sub_char2"),
						S0_T2.sub_char3.as("schd_d_sub_char3"),
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_func_id,
						S0_T2.ins_ts,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_func_id,
						S0_T2.upd_ts,
						S0_T2.upd_srv_req_no,
						addDynamicSelect(DS0C_SPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.purc_ret_schd_no.eq(S0_T2.purc_ret_schd_no)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M11.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M11.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M11.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M11.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T2.ap_dpt_cd.eq(S0_M22.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M22.st_dt, S0_M22.end_dt))
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_M23.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M23.st_dt, S0_M23.end_dt))
							)
						)
						.leftOuterJoin(S0_M30).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M30.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M30.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M30.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M30.itm_sub3))
								.and(S0_M30.lcl_cd.eq(S0_M2.prnt_lcl_cd))
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_V1.dpt_cd)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_AD.purc_ret_schd_d_no,
								sum(S1_AD.base_unit_qty).as("base_unit_qty")
							)
							.from(
								S1_AD
								.innerJoin(S1_A1).on(
									bracket(
										S1_AD.purc_ret_act_no.eq(S1_A1.purc_ret_act_no)
										.and(S1_A1.can_flg.eq(value(false)))
									)
								)
							)
							.where(
								S1_AD.can_flg.eq(value(false))
							)
							.groupBy(S1_AD.purc_ret_schd_d_no).view(S0_V2)
						).on(
							bracket(
								S0_T2.purc_ret_schd_d_no.eq(S0_V2.pr(S1_AD.purc_ret_schd_d_no))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_SPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("not_transt_flg").eq(value(true))
								.and(
									S0_V2.pr("base_unit_qty").isNull()
									.or(S0_V2.pr("base_unit_qty").eq(value(0)))
								)
								.and(S0_T2.abort_flg.eq(value(false)))
							)
							.or(
								bind("part_transt_flg").eq(value(true))
								.and(value(0).lt(S0_V2.pr("base_unit_qty")))
								.and(S0_V2.pr("base_unit_qty").lt(S0_T2.base_unit_qty))
								.and(S0_T2.abort_flg.eq(value(false)))
							)
							.or(
								bind("all_transt_flg").eq(value(true))
								.and(S0_V2.pr("base_unit_qty").gte(S0_T2.base_unit_qty))
								.and(S0_T2.abort_flg.eq(value(false)))
							)
							.or(
								bind("sret_abort_flg").eq(value(true))
								.and(S0_T2.abort_flg.eq(value(true)))
							)
						)
						.and(
							bracket(
								bind("iv_trgt_flg").eq(value(true))
								.and(S0_M2.sppl_iv_flg.eq(value(true)))
							)
							.or(
								bind("iv_not_trgt_flg").eq(value(true))
								.and(S0_M2.sppl_iv_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.schd_dt.gte(bind("schd_dt_fr")))
						.cutoff$and(S0_T1.schd_dt.lte(bind("schd_dt_to")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_T1.ret_sppl_nm.like(bind("ret_sppl_nm")))
						.cutoff$and(S0_T2.purc_ret_loc_cd.like(bind("purc_ret_loc_cd")))
						.cutoff$and(S0_T2.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_M11.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M11.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T2.itm_nm,
								S0_M11.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T2.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T2.sublot_no.like(bind("sublot_no")))
						.cutoff$and(
							nvl(
								S0_T2.iv_itm_nm,
								S0_M30.itm_nm
							).like(bind("iv_itm_nm"))
						)
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T2.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T2.sno1.like(bind("sno1")))
						.cutoff$and(S0_T2.sno2.like(bind("sno2")))
						.cutoff$and(S0_T2.sno3.like(bind("sno3")))
						.cutoff$and(S0_T2.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("purc_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("purc_dpt_wg_cd")))
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_T2.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M22.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_T2.po_no.like(bind("po_no")))
						.cutoff$and(S0_T1.purc_ret_schd_no.like(bind("purc_ret_schd_no")))
						.cutoff$and(S0_T2.purc_ret_schd_d_no.like(bind("purc_ret_schd_d_no")))
						.cutoff$and(S0_T2.maker_cd.like(bind("maker_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("schd_trd_rmrks")))
						.cutoff$and(S0_T2.trd_d_rmrks.like(bind("schd_trd_d_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("schd_intr_rmrks")))
						.cutoff$and(S0_T2.intr_rmrks.like(bind("schd_intr_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("schd_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("schd_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("schd_sub_char3")))
						.cutoff$and(S0_T2.sub_char1.like(bind("schd_d_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("schd_d_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("schd_d_sub_char3")))
						.addDynamicPredicate(DS0C_SPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.purc_ret_schd_no.asc(),
						S0_T2.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("purc_dpt_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("purc_dpt_wg_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T1.purc_usr_cd.eq(S0_M6.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.trd_cur_cd.eq(S0_M7.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M31).on(S0_M11.itm_typ.eq(S0_M31.itm_typ).and(S0_M11.itm_typ_d_cd.eq(S0_M31.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M31.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("site_nm", "loc_wg_nm", "str_ln_nm", "site_cd", "loc_wg_cd", "purc_ret_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T2.purc_ret_loc_cd.eq(S0_M12.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.site_cd.like(bind("site_cd"))).cutoff$and(S0_M12.wg_cd.like(bind("loc_wg_cd"))).cutoff$and(S0_M12.loc_nm.like(bind("purc_ret_loc_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M12.site_cd.eq(S0_M13.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_M12.wg_cd.eq(S0_M14.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.wg_nm.like(bind("loc_wg_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(bracket(S0_M12.loc_cd.eq(S0_M15.loc_cd).and(S0_T2.str_ln_cd.eq(S0_M15.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M15.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("maker_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(bracket(S0_T2.maker_cd.eq(S0_M16.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M16.bp_nm.like(bind("maker_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(bracket(S0_T2.gd_cd.eq(S0_M20.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M20.gd_nm.like(bind("gd_nm")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd1.as("sppl_grp_cd1"), S0_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP1).on(S0_M2.bp_grp_cd1.eq(S0_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd2.as("sppl_grp_cd2"), S0_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP2).on(S0_M2.bp_grp_cd2.eq(S0_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd3.as("sppl_grp_cd3"), S0_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP3).on(S0_M2.bp_grp_cd3.eq(S0_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd4.as("sppl_grp_cd4"), S0_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP4).on(S0_M2.bp_grp_cd4.eq(S0_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd5.as("sppl_grp_cd5"), S0_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP5).on(S0_M2.bp_grp_cd5.eq(S0_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd6.as("sppl_grp_cd6"), S0_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP6).on(S0_M2.bp_grp_cd6.eq(S0_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd7.as("sppl_grp_cd7"), S0_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP7).on(S0_M2.bp_grp_cd7.eq(S0_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd8.as("sppl_grp_cd8"), S0_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP8).on(S0_M2.bp_grp_cd8.eq(S0_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd9.as("sppl_grp_cd9"), S0_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP9).on(S0_M2.bp_grp_cd9.eq(S0_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd10.as("sppl_grp_cd10"), S0_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP10).on(S0_M2.bp_grp_cd10.eq(S0_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd1.as("itm_grp_cd1"), S0_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_M11.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd2.as("itm_grp_cd2"), S0_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_M11.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd3.as("itm_grp_cd3"), S0_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_M11.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd4.as("itm_grp_cd4"), S0_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_M11.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd5.as("itm_grp_cd5"), S0_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_M11.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd6.as("itm_grp_cd6"), S0_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_M11.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd7.as("itm_grp_cd7"), S0_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_M11.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd8.as("itm_grp_cd8"), S0_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_M11.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd9.as("itm_grp_cd9"), S0_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_M11.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd10.as("itm_grp_cd10"), S0_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_M11.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("purc_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("trd_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_cd,
							m.loc_nm,
							m.site_cd,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("loc_wg_cd", m.wg_cd());
							r.setStringNE("purc_ret_loc_nm", m.loc_nm());
							r.setStringNE("join_loc_cd_", m.loc_cd());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("join_loc_cd_"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
							r.setNumberNE("trd_qty_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("ret_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ret_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("bd_itm_cd"),
							r.getStringNE("bd_itm_sub1"),
							r.getStringNE("bd_itm_sub2"),
							r.getStringNE("bd_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("bd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("bd_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_ctg_nm", m.ctg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("bd_oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_qty_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL0170_MST_PURC_RET_SCHD_Query_S03
	 */
	static MCQueryPlan MSBDL0170_MST_PURC_RET_SCHD_S03() {
		MST_PURC_RET_SCHD_R S0_T1 = MST_PURC_RET_SCHD_R.create("T1");
		MST_PURC_RET_SCHD_D_R S0_T2 = MST_PURC_RET_SCHD_D_R.create("T2");
		MST_PURC_RET_SCHD_IO_R S0_T5 = MST_PURC_RET_SCHD_IO_R.create("T5");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_USR_R S0_M6 = MAM_USR_R.create("M6");
		MAM_CUR_R S0_M7 = MAM_CUR_R.create("M7");
		MAM_ITM_R S0_M11 = MAM_ITM_R.create("M11");
		MAM_ITM_TYP_D_R S0_M31 = MAM_ITM_TYP_D_R.create("M31");
		MAM_LOC_R S0_M12 = MAM_LOC_R.create("M12");
		MAM_SITE_R S0_M13 = MAM_SITE_R.create("M13");
		MAM_WG_R S0_M14 = MAM_WG_R.create("M14");
		MAM_STR_LN_R S0_M15 = MAM_STR_LN_R.create("M15");
		MAM_BP_R S0_M16 = MAM_BP_R.create("M16");
		MAM_STK_GD_R S0_M20 = MAM_STK_GD_R.create("M20");
		MAM_DPT_R S0_M22 = MAM_DPT_R.create("M22");
		MAM_DPT_R S0_M23 = MAM_DPT_R.create("M23");
		MAM_ITM_LCL_R S0_M30 = MAM_ITM_LCL_R.create("M30");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
		MCTempView S0_V2 = createTempView("V2");
		MCTempView S0_V3 = createTempView("V3");
		MAM_BP_GRP_R S0_SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R S0_SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R S0_SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R S0_SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R S0_SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R S0_SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R S0_SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R S0_SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R S0_SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R S0_SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");
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
		MST_PURC_RET_ACT_D_R S1_AD = MST_PURC_RET_ACT_D_R.create("AD");
		MST_PURC_RET_ACT_R S1_A1 = MST_PURC_RET_ACT_R.create("A1");
		MST_PURC_RET_ACT_IO_R S2_AD = MST_PURC_RET_ACT_IO_R.create("AD");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0170_MST_PURC_RET_SCHD_Query_S03")
					.mainQuery()
					.select(
						S0_T2.abort_flg,
						cases()
							.when(S0_T2.abort_flg.eq(value(true)))
								.then(value(MSC_PRET_SCHD_STS_TYP.PRET_ABORT.value()))
							.when(
								S0_V2.pr("base_unit_qty").isNull()
								.or(S0_V2.pr("base_unit_qty").eq(value(0)))
							)
								.then(value(MSC_PRET_SCHD_STS_TYP.NON.value()))
							.when(
								value(0).lt(S0_V2.pr("base_unit_qty"))
								.and(S0_V2.pr("base_unit_qty").lt(S0_T2.base_unit_qty))
							)
								.then(value(MSC_PRET_SCHD_STS_TYP.PART.value()))
							.when(S0_V2.pr("base_unit_qty").gte(S0_T2.base_unit_qty))
								.then(value(MSC_PRET_SCHD_STS_TYP.COMPL.value()))
							.otherwise(nullValue()).as("sret_schd_sts_typ"),
						S0_T1.trd_cd,
						S0_T1.sppl_cd,
						S0_M2.bp_nm.as("sppl_nm"),
						S0_M2.asppl_cd,
						S0_T1.ret_sppl_nm,
						S0_T1.ret_sppl_cntct_dpt,
						S0_T1.ret_sppl_cntct_psn,
						S0_T1.ret_sppl_cntct_psn_title,
						S0_T1.ret_sppl_zip_cd,
						S0_T1.ret_sppl_addr1,
						S0_T1.ret_sppl_addr2,
						S0_T1.ret_sppl_addr3,
						S0_T1.ret_sppl_addr4,
						S0_T1.ret_sppl_tel,
						S0_T1.ret_sppl_fax,
						S0_T1.ret_sppl_fax,
						S0_T1.rcpt_iv_no,
						S0_T1.ref_rcpt_iv_no,
						S0_T1.purc_dpt_cd,
						S0_M4.dpt_nm.as("purc_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.purc_usr_cd,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							S0_T2.itm_nm,
							S0_M11.itm_nm
						).as("itm_nm"),
						decode(
							S0_M2.sppl_iv_flg,
							value(true),
							decode(
								S0_T2.sundry_itm_flg,
								value(true),
								S0_T2.iv_itm_nm,
								S0_M30.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_T2.sundry_itm_flg,
						S0_T5.purc_ret_loc_cd,
						S0_T5.str_ln_cd,
						S0_T5.lot_no,
						S0_T5.sublot_no,
						S0_T5.ver_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.maker_cd,
						S0_T2.sppl_itm_cd,
						S0_T2.sppl_itm_nm,
						S0_T2.purc_id_typ,
						S0_T1.schd_dt,
						S0_T5.trd_unit_qty,
						S0_T5.trd_unit_cd,
						S0_T5.base_unit_qty,
						S0_T5.base_unit_cd,
						S0_V3.pr("base_unit_qty").as("ret_qty"),
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.purc_typ,
						S0_T2.mfg_inst_no,
						S0_T2.po_no,
						S0_T5.quality_typ,
						S0_T5.stk_insp_typ,
						S0_T5.stk_id_typ,
						S0_T5.gd_cd,
						S0_T2.ret_rsn_cd,
						S0_T2.ap_dpt_cd,
						S0_M22.dpt_nm.as("ap_dpt_nm"),
						S0_T2.bd_dpt_cd,
						S0_M23.dpt_nm.as("bd_dpt_nm"),
						S0_T2.bd_itm_cd,
						S0_T2.bd_itm_sub1,
						S0_T2.bd_itm_sub2,
						S0_T2.bd_itm_sub3,
						S0_T2.bd_lot_no,
						S0_T2.bd_sublot_no,
						S0_T2.bd_sno1,
						S0_T2.bd_sno2,
						S0_T2.bd_sno3,
						S0_T2.bd_sno4,
						S0_T2.bd_loc_cd,
						S0_T2.bd_ctg_cd,
						S0_T2.bd_oper_cd,
						S0_T2.bd_iv_no,
						S0_T2.bd_slo_no,
						S0_T2.bd_po_no,
						S0_M11.cont_fctr_flg,
						S0_M11.cont_fctr_dec_place,
						S0_M11.cont_fctr_rnd_typ,
						S0_M11.cont_fctr_unit_cd,
						S0_M11.std_cont_fctr,
						S0_T5.purc_cont_qty,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.trd_rmrks.as("schd_trd_rmrks"),
						S0_T2.trd_d_rmrks.as("schd_trd_d_rmrks"),
						S0_T1.intr_rmrks.as("schd_intr_rmrks"),
						S0_T2.intr_rmrks.as("schd_intr_d_rmrks"),
						S0_T1.purc_ret_schd_no,
						S0_T2.purc_ret_schd_d_no,
						S0_T5.purc_ret_schd_io_no,
						S0_T2.ref_purc_act_no,
						S0_T2.ref_purc_act_d_no,
						S0_T2.base_purc_ac_dt,
						S0_T1.sub_char1.as("schd_sub_char1"),
						S0_T1.sub_char2.as("schd_sub_char2"),
						S0_T1.sub_char3.as("schd_sub_char3"),
						S0_T2.sub_char1.as("schd_d_sub_char1"),
						S0_T2.sub_char2.as("schd_d_sub_char2"),
						S0_T2.sub_char3.as("schd_d_sub_char3"),
						S0_T5.sub_char1.as("schd_io_sub_char1"),
						S0_T5.sub_char2.as("schd_io_sub_char2"),
						S0_T5.sub_char3.as("schd_io_sub_char3"),
						S0_T5.ins_usr_id,
						S0_T5.ins_usr_nm,
						S0_T5.ins_func_id,
						S0_T5.ins_ts,
						S0_T5.upd_usr_id,
						S0_T5.upd_usr_nm,
						S0_T5.upd_func_id,
						S0_T5.upd_ts,
						S0_T5.upd_srv_req_no,
						addDynamicSelect(DS0C_SPPL_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.purc_ret_schd_no.eq(S0_T2.purc_ret_schd_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T2.purc_ret_schd_d_no.eq(S0_T5.purc_ret_schd_d_no)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M11.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M11.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M11.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M11.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T2.ap_dpt_cd.eq(S0_M22.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M22.st_dt, S0_M22.end_dt))
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_T2.bd_dpt_cd.eq(S0_M23.dpt_cd)
								.and(S0_T1.reg_dt.between(S0_M23.st_dt, S0_M23.end_dt))
							)
						)
						.leftOuterJoin(S0_M30).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M30.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M30.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M30.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M30.itm_sub3))
								.and(S0_M30.lcl_cd.eq(S0_M2.prnt_lcl_cd))
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.purc_dpt_cd.eq(S0_V1.dpt_cd)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_AD.purc_ret_schd_d_no,
								sum(S1_AD.base_unit_qty).as("base_unit_qty")
							)
							.from(
								S1_AD
								.innerJoin(S1_A1).on(
									bracket(
										S1_AD.purc_ret_act_no.eq(S1_A1.purc_ret_act_no)
										.and(S1_A1.can_flg.eq(value(false)))
									)
								)
							)
							.where(
								S1_AD.can_flg.eq(value(false))
							)
							.groupBy(S1_AD.purc_ret_schd_d_no).view(S0_V2)
						).on(
							bracket(
								S0_T2.purc_ret_schd_d_no.eq(S0_V2.pr(S1_AD.purc_ret_schd_d_no))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S2_AD.purc_ret_schd_io_no,
								sum(S2_AD.base_unit_qty).as("base_unit_qty")
							)
							.from(S2_AD)
							.where(
								S2_AD.can_flg.eq(value(false))
							)
							.groupBy(S2_AD.purc_ret_schd_io_no).view(S0_V3)
						).on(
							bracket(
								S0_T5.purc_ret_schd_io_no.eq(S0_V3.pr(S2_AD.purc_ret_schd_io_no))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_SPPL_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("not_transt_flg").eq(value(true))
								.and(
									S0_V2.pr("base_unit_qty").isNull()
									.or(S0_V2.pr("base_unit_qty").eq(value(0)))
								)
								.and(S0_T2.abort_flg.eq(value(false)))
							)
							.or(
								bind("part_transt_flg").eq(value(true))
								.and(value(0).lt(S0_V2.pr("base_unit_qty")))
								.and(S0_V2.pr("base_unit_qty").lt(S0_T2.base_unit_qty))
								.and(S0_T2.abort_flg.eq(value(false)))
							)
							.or(
								bind("all_transt_flg").eq(value(true))
								.and(S0_V2.pr("base_unit_qty").gte(S0_T2.base_unit_qty))
								.and(S0_T2.abort_flg.eq(value(false)))
							)
							.or(
								bind("sret_abort_flg").eq(value(true))
								.and(S0_T2.abort_flg.eq(value(true)))
							)
						)
						.and(
							bracket(
								bind("iv_trgt_flg").eq(value(true))
								.and(S0_M2.sppl_iv_flg.eq(value(true)))
							)
							.or(
								bind("iv_not_trgt_flg").eq(value(true))
								.and(S0_M2.sppl_iv_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.schd_dt.gte(bind("schd_dt_fr")))
						.cutoff$and(S0_T1.schd_dt.lte(bind("schd_dt_to")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_T1.ret_sppl_nm.like(bind("ret_sppl_nm")))
						.cutoff$and(S0_T5.purc_ret_loc_cd.like(bind("purc_ret_loc_cd")))
						.cutoff$and(S0_T5.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_M11.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M11.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T2.itm_nm,
								S0_M11.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T5.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T5.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T5.sublot_no.like(bind("sublot_no")))
						.cutoff$and(
							nvl(
								S0_T2.iv_itm_nm,
								S0_M30.itm_nm
							).like(bind("iv_itm_nm"))
						)
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T5.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T2.sno1.like(bind("sno1")))
						.cutoff$and(S0_T2.sno2.like(bind("sno2")))
						.cutoff$and(S0_T2.sno3.like(bind("sno3")))
						.cutoff$and(S0_T2.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("purc_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("purc_dpt_wg_cd")))
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_T2.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M22.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_T2.po_no.like(bind("po_no")))
						.cutoff$and(S0_T1.purc_ret_schd_no.like(bind("purc_ret_schd_no")))
						.cutoff$and(S0_T2.purc_ret_schd_d_no.like(bind("purc_ret_schd_d_no")))
						.cutoff$and(S0_T2.maker_cd.like(bind("maker_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("schd_trd_rmrks")))
						.cutoff$and(S0_T2.trd_d_rmrks.like(bind("schd_trd_d_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("schd_intr_rmrks")))
						.cutoff$and(S0_T2.intr_rmrks.like(bind("schd_intr_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("schd_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("schd_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("schd_sub_char3")))
						.cutoff$and(S0_T2.sub_char1.like(bind("schd_d_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("schd_d_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("schd_d_sub_char3")))
						.cutoff$and(S0_T5.sub_char1.like(bind("schd_io_sub_char1")))
						.cutoff$and(S0_T5.sub_char2.like(bind("schd_io_sub_char2")))
						.cutoff$and(S0_T5.sub_char3.like(bind("schd_io_sub_char3")))
						.addDynamicPredicate(DS0C_SPPL_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.purc_ret_schd_no.asc(),
						S0_T2.disp_seq.asc(),
						S0_T5.purc_ret_schd_io_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("purc_dpt_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("purc_dpt_wg_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T1.purc_usr_cd.eq(S0_M6.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.trd_cur_cd.eq(S0_M7.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M31).on(S0_M11.itm_typ.eq(S0_M31.itm_typ).and(S0_M11.itm_typ_d_cd.eq(S0_M31.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M31.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("site_nm", "loc_wg_nm", "str_ln_nm", "site_cd", "loc_wg_cd", "purc_ret_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T5.purc_ret_loc_cd.eq(S0_M12.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.site_cd.like(bind("site_cd"))).cutoff$and(S0_M12.wg_cd.like(bind("loc_wg_cd"))).cutoff$and(S0_M12.loc_nm.like(bind("purc_ret_loc_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M12.site_cd.eq(S0_M13.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_M12.wg_cd.eq(S0_M14.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.wg_nm.like(bind("loc_wg_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(bracket(S0_M12.loc_cd.eq(S0_M15.loc_cd).and(S0_T5.str_ln_cd.eq(S0_M15.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M15.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("maker_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(bracket(S0_T2.maker_cd.eq(S0_M16.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M16.bp_nm.like(bind("maker_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(bracket(S0_T5.gd_cd.eq(S0_M20.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M20.gd_nm.like(bind("gd_nm")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd1.as("sppl_grp_cd1"), S0_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP1).on(S0_M2.bp_grp_cd1.eq(S0_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd2.as("sppl_grp_cd2"), S0_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP2).on(S0_M2.bp_grp_cd2.eq(S0_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd3.as("sppl_grp_cd3"), S0_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP3).on(S0_M2.bp_grp_cd3.eq(S0_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd4.as("sppl_grp_cd4"), S0_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP4).on(S0_M2.bp_grp_cd4.eq(S0_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd5.as("sppl_grp_cd5"), S0_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP5).on(S0_M2.bp_grp_cd5.eq(S0_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd6.as("sppl_grp_cd6"), S0_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP6).on(S0_M2.bp_grp_cd6.eq(S0_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd7.as("sppl_grp_cd7"), S0_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP7).on(S0_M2.bp_grp_cd7.eq(S0_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd8.as("sppl_grp_cd8"), S0_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP8).on(S0_M2.bp_grp_cd8.eq(S0_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd9.as("sppl_grp_cd9"), S0_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP9).on(S0_M2.bp_grp_cd9.eq(S0_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M2.bp_grp_cd10.as("sppl_grp_cd10"), S0_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_SPPL_GRP10).on(S0_M2.bp_grp_cd10.eq(S0_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd1.as("itm_grp_cd1"), S0_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_M11.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd2.as("itm_grp_cd2"), S0_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_M11.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd3.as("itm_grp_cd3"), S0_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_M11.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd4.as("itm_grp_cd4"), S0_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_M11.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd5.as("itm_grp_cd5"), S0_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_M11.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd6.as("itm_grp_cd6"), S0_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_M11.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd7.as("itm_grp_cd7"), S0_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_M11.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd8.as("itm_grp_cd8"), S0_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_M11.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd9.as("itm_grp_cd9"), S0_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_M11.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd10.as("itm_grp_cd10"), S0_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_M11.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("purc_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("trd_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("purc_ret_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_cd,
							m.loc_nm,
							m.site_cd,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("loc_wg_cd", m.wg_cd());
							r.setStringNE("purc_ret_loc_nm", m.loc_nm());
							r.setStringNE("join_loc_cd_", m.loc_cd());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("join_loc_cd_"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
							r.setNumberNE("trd_qty_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("ret_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ret_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("bd_itm_cd"),
							r.getStringNE("bd_itm_sub1"),
							r.getStringNE("bd_itm_sub2"),
							r.getStringNE("bd_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("bd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("bd_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_ctg_nm", m.ctg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("bd_oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_qty_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
					})
				)
			);
	}
}