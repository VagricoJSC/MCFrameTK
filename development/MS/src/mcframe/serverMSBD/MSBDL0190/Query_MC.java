package mcframe.serverMSBD.MSBDL0190;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;

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
	 * -- MSBDL0190_MST_PURC_ACT_Query_S04
	 */
	static MCQueryPlan MSBDL0190_MST_PURC_ACT_S04() {
		MST_PURC_ACT_R S0_T1 = MST_PURC_ACT_R.create("T1");
		MST_PURC_ACT_D_R S0_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_RET_ACT_P_R S0_T8 = MST_PURC_RET_ACT_P_R.create("T8");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
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
		MAM_LOC_R S0_IN_TO_LOC = MAM_LOC_R.create("IN_TO_LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_CUR_R S0_TRD_CUR = MAM_CUR_R.create("TRD_CUR");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
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
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_BP_R S0_ASPPL = MAM_BP_R.create("ASPPL");
		MAM_BP_GRP_R S0_ASPPL_GRP1 = MAM_BP_GRP_R.create("ASPPL_GRP1");
		MAM_BP_GRP_R S0_ASPPL_GRP2 = MAM_BP_GRP_R.create("ASPPL_GRP2");
		MAM_BP_GRP_R S0_ASPPL_GRP3 = MAM_BP_GRP_R.create("ASPPL_GRP3");
		MAM_BP_GRP_R S0_ASPPL_GRP4 = MAM_BP_GRP_R.create("ASPPL_GRP4");
		MAM_BP_GRP_R S0_ASPPL_GRP5 = MAM_BP_GRP_R.create("ASPPL_GRP5");
		MAM_BP_GRP_R S0_ASPPL_GRP6 = MAM_BP_GRP_R.create("ASPPL_GRP6");
		MAM_BP_GRP_R S0_ASPPL_GRP7 = MAM_BP_GRP_R.create("ASPPL_GRP7");
		MAM_BP_GRP_R S0_ASPPL_GRP8 = MAM_BP_GRP_R.create("ASPPL_GRP8");
		MAM_BP_GRP_R S0_ASPPL_GRP9 = MAM_BP_GRP_R.create("ASPPL_GRP9");
		MAM_BP_GRP_R S0_ASPPL_GRP10 = MAM_BP_GRP_R.create("ASPPL_GRP10");
		MAM_BP_R S0_BSPPL = MAM_BP_R.create("BSPPL");
		MAM_USR_R S0_PURC_USR = MAM_USR_R.create("PURC_USR");
		MAM_DPT_R S0_PURC_DPT = MAM_DPT_R.create("PURC_DPT");
		MAM_WG_R S0_PURC_DPT_WG = MAM_WG_R.create("PURC_DPT_WG");
		MST_PO_R S0_PO = MST_PO_R.create("PO");
		MST_PO_D_R S0_PO_D = MST_PO_D_R.create("PO_D");
		MAVM_RD_DPT_R S1_M99 = MAVM_RD_DPT_R.create("M99");
		MST_PURC_ACT_R purcActR = MST_PURC_ACT_R.create("PURCACT");
		MAM_ITM_R itmR = MAM_ITM_R.create("ITM");
		MCTempView S0_T2_TempView = createTempView("S0_T2_View");
		MCSingleView S0_T2_View = subQuery().select(
				S0_T2.purc_act_no,
				S0_T2.purc_act_seq,
				sum(
					cases()
						.when(
							itmR.dscnt_itm_flg.eq(value(true))
							.and(purcActR.trd_ptn_typ.neq(value(MAC_TRD_PTN_TYP.PURC_DSCNT.value())))
						)
						.then(
							S0_T2.trd_cur_amt.multiply(value(-1)).add(
								bracket(
									S0_T2.trd_cur_tax_amt.multiply(value(-1))
								)
							)
						)
					.otherwise(S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt))
				).as("trd_cur_inc_tax_amt"),
				max(S0_T2.temp_ap_flg).as("temp_ap_flg")
				)
				.from(
						S0_T2
						.innerJoin(purcActR).on(
							bracket(
								S0_T2.purc_act_no.eq(purcActR.purc_act_no)
								.and(S0_T2.purc_act_seq.eq(purcActR.purc_act_seq))
							)
						)
						.leftOuterJoin(itmR).on(
							bracket(
								S0_T2.itm_cd.eq(itmR.itm_cd)
								.and(S0_T2.itm_sub1.eq(itmR.itm_sub1))
								.and(S0_T2.itm_sub2.eq(itmR.itm_sub2))
								.and(S0_T2.itm_sub3.eq(itmR.itm_sub3))
							)
						)
				)
				.groupBy(
				S0_T2.purc_act_no,
				S0_T2.purc_act_seq
				).view(S0_T2_TempView);
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0190_MST_PURC_ACT_Query_S04")
					.mainQuery()
					.select(
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.purc_dt,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.trd_cur_cd,
						S0_T1.sppl_cd,
						S0_T1.asppl_cd,
						S0_T1.bsppl_cd,
						S0_T8.ret_sppl_nm,
						S0_T1.xrate,
						S0_T1.base_cur_cd,
						S0_T1.ptax_xrate,
						S0_T1.ptax_cur_cd,
						S0_T1.ptax_dt,
						S0_T1.pay_basis_dt,
						S0_T1.pay_schd_dt,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.purc_usr_cd,
						S0_T1.purc_dpt_cd,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.rcpt_iv_rev,
						nvl(
							S0_T1.ref_rcpt_iv_no,
							S0_T8.ref_rcpt_iv_no
						).as("ref_rcpt_iv_no"),
						S0_T1.sub_char1.as("purc_act_sub_char1"),
						S0_T1.sub_char2.as("purc_act_sub_char2"),
						S0_T1.sub_char3.as("purc_act_sub_char3"),
						S0_T1.purc_act_no,
						S0_T1.purc_act_rev,
						S0_T8.purc_ret_act_no,
						S0_T8.purc_ret_act_rev,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T8.purc_ret_dt,
						S0_T2_TempView.pr("trd_cur_inc_tax_amt"),
						S0_T2_TempView.pr("temp_ap_flg"),
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T8).on(
							S0_T8.purc_ret_act_no.eq(S0_T1.purc_ret_act_no)
							.and(S0_T8.purc_ret_act_rev.eq(S0_T1.purc_ret_act_rev))
						)
						.leftOuterJoin(S0_T2_View)
						.on(
							value(0).eq(value(0))
							.and(S0_T2_TempView.pr(MST_PURC_ACT_D_R.$purc_act_no).eq(S0_T1.purc_act_no))
							.and(S0_T2_TempView.pr(MST_PURC_ACT_D_R.$purc_act_seq).eq(S0_T1.purc_act_seq))
						)
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_M99)
								.where(
									S0_T1.purc_dpt_cd.eq(S1_M99.dpt_cd)
								)
							)
						)
						.and(
							bracket(
								S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							)
							.or(bind("tmp_dis_can_disp_flg").eq(value(true)))
							.or(
								S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.DIS.value()))
								.and(bind("tmp_inc_past_flg").eq(value(true)))
							)
						)
						.cutoff$and(S0_T1.purc_dt.gte(bind("purc_dt_from")))
						.cutoff$and(S0_T1.purc_dt.lte(bind("purc_dt_to")))
						.cutoff$and(S0_T1.ac_ym.gte(bind("ac_ym_from")))
						.cutoff$and(S0_T1.ac_ym.lte(bind("ac_ym_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_from")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.purc_act_no.like(bind("purc_act_no")))
						.cutoff$and(S0_T8.purc_ret_act_no.like(bind("purc_ret_act_no")))
						.cutoff$and(S0_T1.base_cur_cd.notLike(bind("tmp_base_cur_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_xpns")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_vmi")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_dscnt")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_dscnt_xpns")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_xtra")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_xtra_xpns")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_rtn")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_rtn_xpns")))
						)
						.cutoff$and(
							bind("tmp_foreign").eq(value(true))
							.and(S0_T1.trd_cur_cd.neq(S0_T1.base_cur_cd))
						)
						.and(
								S0_T2_TempView.pr("temp_ap_flg").eq(value(false))
							.or(
								bind("incl_temp_ap_flg").eq(value(true))
								.and(S0_T2_TempView.pr("temp_ap_flg").eq(value(true)))
							)
						)
					)
					.orderBy(
						S0_T1.purc_act_no.asc(),
						S0_T1.purc_act_rev.asc()
					)
			)
			.setDynamicSQLInfo(
					when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM).on(S0_ITM.itm_cd.eq(S0_T2.itm_cd).and(S0_ITM.itm_sub1.eq(S0_T2.itm_sub1)).and(S0_ITM.itm_sub2.eq(S0_T2.itm_sub2)).and(S0_ITM.itm_sub3.eq(S0_T2.itm_sub3))))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_T2.itm_nm,S0_ITM.itm_nm).like(bind("itm_nm"))).cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1", "itm_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS0D, S0_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2", "itm_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS0D, S0_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3", "itm_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS0D, S0_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4", "itm_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS0D, S0_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5", "itm_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS0D, S0_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6", "itm_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS0D, S0_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7", "itm_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS0D, S0_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8", "itm_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS0D, S0_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9", "itm_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS0D, S0_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10", "itm_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS0D, S0_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_nm", "tmp_iv_trgt", "tmp_subcon", "asppl_cd", "asppl_nm", "bsppl_cd", "bsppl_nm", "sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "asppl_grp_flg1", "asppl_grp_flg2", "asppl_grp_flg3", "asppl_grp_flg4", "asppl_grp_flg5", "asppl_grp_flg6", "asppl_grp_flg7", "asppl_grp_flg8", "asppl_grp_flg9", "asppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL).on(S0_SPPL.bp_cd.eq(S0_T1.sppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm"))).cutoff$and(S0_SPPL.sppl_iv_flg.eq(bind("tmp_iv_trgt"))).cutoff$and(S0_SPPL.subcon_flg.eq(bind("tmp_subcon")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL.bp_grp_cd1.as("sppl_grp_cd1"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd1),
				when(boundOr("sppl_grp_flg1", "sppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.groupBy(DS0D, S0_SPPL_GRP1.bp_grp_nm),
				when(boundOr("sppl_grp_flg1", "sppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP1).on(S0_SPPL.bp_grp_cd1.eq(S0_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL.bp_grp_cd2.as("sppl_grp_cd2"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd2),
				when(boundOr("sppl_grp_flg2", "sppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.groupBy(DS0D, S0_SPPL_GRP2.bp_grp_nm),
				when(boundOr("sppl_grp_flg2", "sppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP2).on(S0_SPPL.bp_grp_cd2.eq(S0_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL.bp_grp_cd3.as("sppl_grp_cd3"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd3),
				when(boundOr("sppl_grp_flg3", "sppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.groupBy(DS0D, S0_SPPL_GRP3.bp_grp_nm),
				when(boundOr("sppl_grp_flg3", "sppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP3).on(S0_SPPL.bp_grp_cd3.eq(S0_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL.bp_grp_cd4.as("sppl_grp_cd4"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd4),
				when(boundOr("sppl_grp_flg4", "sppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.groupBy(DS0D, S0_SPPL_GRP4.bp_grp_nm),
				when(boundOr("sppl_grp_flg4", "sppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP4).on(S0_SPPL.bp_grp_cd4.eq(S0_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL.bp_grp_cd5.as("sppl_grp_cd5"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd5),
				when(boundOr("sppl_grp_flg5", "sppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.groupBy(DS0D, S0_SPPL_GRP5.bp_grp_nm),
				when(boundOr("sppl_grp_flg5", "sppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP5).on(S0_SPPL.bp_grp_cd5.eq(S0_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL.bp_grp_cd6.as("sppl_grp_cd6"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd6),
				when(boundOr("sppl_grp_flg6", "sppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.groupBy(DS0D, S0_SPPL_GRP6.bp_grp_nm),
				when(boundOr("sppl_grp_flg6", "sppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP6).on(S0_SPPL.bp_grp_cd6.eq(S0_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL.bp_grp_cd7.as("sppl_grp_cd7"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd7),
				when(boundOr("sppl_grp_flg7", "sppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.groupBy(DS0D, S0_SPPL_GRP7.bp_grp_nm),
				when(boundOr("sppl_grp_flg7", "sppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP7).on(S0_SPPL.bp_grp_cd7.eq(S0_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL.bp_grp_cd8.as("sppl_grp_cd8"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd8),
				when(boundOr("sppl_grp_flg8", "sppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.groupBy(DS0D, S0_SPPL_GRP8.bp_grp_nm),
				when(boundOr("sppl_grp_flg8", "sppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP8).on(S0_SPPL.bp_grp_cd8.eq(S0_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL.bp_grp_cd9.as("sppl_grp_cd9"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd9),
				when(boundOr("sppl_grp_flg9", "sppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.groupBy(DS0D, S0_SPPL_GRP9.bp_grp_nm),
				when(boundOr("sppl_grp_flg9", "sppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP9).on(S0_SPPL.bp_grp_cd9.eq(S0_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL.bp_grp_cd10.as("sppl_grp_cd10"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd10),
				when(boundOr("sppl_grp_flg10", "sppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.groupBy(DS0D, S0_SPPL_GRP10.bp_grp_nm),
				when(boundOr("sppl_grp_flg10", "sppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP10).on(S0_SPPL.bp_grp_cd10.eq(S0_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("asppl_cd", "asppl_nm", "bsppl_cd", "bsppl_nm", "asppl_grp_flg1", "asppl_grp_flg2", "asppl_grp_flg3", "asppl_grp_flg4", "asppl_grp_flg5", "asppl_grp_flg6", "asppl_grp_flg7", "asppl_grp_flg8", "asppl_grp_flg9", "asppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL).on(S0_ASPPL.bp_cd.eq(S0_SPPL.asppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_cd.like(bind("asppl_cd"))).cutoff$and(S0_ASPPL.bp_nm.like(bind("asppl_nm"))).cutoff$and(S0_ASPPL.bsppl_cd.like(bind("bsppl_cd")))),
				when(boundOr("asppl_grp_flg1"))
					.select(DS0D, S0_ASPPL.bp_grp_cd1.as("asppl_grp_cd1"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd1),
				when(boundOr("asppl_grp_flg1", "asppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd1.like(bind("asppl_grp_cd1")))),
				when(boundOr("asppl_grp_flg1"))
					.select(DS0D, S0_ASPPL_GRP1.bp_grp_nm.as("asppl_grp_nm1"))
					.groupBy(DS0D, S0_ASPPL_GRP1.bp_grp_nm),
				when(boundOr("asppl_grp_flg1", "asppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP1).on(S0_ASPPL.bp_grp_cd1.eq(S0_ASPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_ASPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP1.bp_grp_nm.like(bind("asppl_grp_nm1")))),
				when(boundOr("asppl_grp_flg2"))
					.select(DS0D, S0_ASPPL.bp_grp_cd2.as("asppl_grp_cd2"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd2),
				when(boundOr("asppl_grp_flg2", "asppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd2.like(bind("asppl_grp_cd2")))),
				when(boundOr("asppl_grp_flg2"))
					.select(DS0D, S0_ASPPL_GRP2.bp_grp_nm.as("asppl_grp_nm2"))
					.groupBy(DS0D, S0_ASPPL_GRP2.bp_grp_nm),
				when(boundOr("asppl_grp_flg2", "asppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP2).on(S0_ASPPL.bp_grp_cd2.eq(S0_ASPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_ASPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP2.bp_grp_nm.like(bind("asppl_grp_nm2")))),
				when(boundOr("asppl_grp_flg3"))
					.select(DS0D, S0_ASPPL.bp_grp_cd3.as("asppl_grp_cd3"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd3),
				when(boundOr("asppl_grp_flg3", "asppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd3.like(bind("asppl_grp_cd3")))),
				when(boundOr("asppl_grp_flg3"))
					.select(DS0D, S0_ASPPL_GRP3.bp_grp_nm.as("asppl_grp_nm3"))
					.groupBy(DS0D, S0_ASPPL_GRP3.bp_grp_nm),
				when(boundOr("asppl_grp_flg3", "asppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP3).on(S0_ASPPL.bp_grp_cd3.eq(S0_ASPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_ASPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP3.bp_grp_nm.like(bind("asppl_grp_nm3")))),
				when(boundOr("asppl_grp_flg4"))
					.select(DS0D, S0_ASPPL.bp_grp_cd4.as("asppl_grp_cd4"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd4),
				when(boundOr("asppl_grp_flg4", "asppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd4.like(bind("asppl_grp_cd4")))),
				when(boundOr("asppl_grp_flg4"))
					.select(DS0D, S0_ASPPL_GRP4.bp_grp_nm.as("asppl_grp_nm4"))
					.groupBy(DS0D, S0_ASPPL_GRP4.bp_grp_nm),
				when(boundOr("asppl_grp_flg4", "asppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP4).on(S0_ASPPL.bp_grp_cd4.eq(S0_ASPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_ASPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP4.bp_grp_nm.like(bind("asppl_grp_nm4")))),
				when(boundOr("asppl_grp_flg5"))
					.select(DS0D, S0_ASPPL.bp_grp_cd5.as("asppl_grp_cd5"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd5),
				when(boundOr("asppl_grp_flg5", "asppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd5.like(bind("asppl_grp_cd5")))),
				when(boundOr("asppl_grp_flg5"))
					.select(DS0D, S0_ASPPL_GRP5.bp_grp_nm.as("asppl_grp_nm5"))
					.groupBy(DS0D, S0_ASPPL_GRP5.bp_grp_nm),
				when(boundOr("asppl_grp_flg5", "asppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP5).on(S0_ASPPL.bp_grp_cd5.eq(S0_ASPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_ASPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP5.bp_grp_nm.like(bind("asppl_grp_nm5")))),
				when(boundOr("asppl_grp_flg6"))
					.select(DS0D, S0_ASPPL.bp_grp_cd6.as("asppl_grp_cd6"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd6),
				when(boundOr("asppl_grp_flg6", "asppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd6.like(bind("asppl_grp_cd6")))),
				when(boundOr("asppl_grp_flg6"))
					.select(DS0D, S0_ASPPL_GRP6.bp_grp_nm.as("asppl_grp_nm6"))
					.groupBy(DS0D, S0_ASPPL_GRP6.bp_grp_nm),
				when(boundOr("asppl_grp_flg6", "asppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP6).on(S0_ASPPL.bp_grp_cd6.eq(S0_ASPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_ASPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP6.bp_grp_nm.like(bind("asppl_grp_nm6")))),
				when(boundOr("asppl_grp_flg7"))
					.select(DS0D, S0_ASPPL.bp_grp_cd7.as("asppl_grp_cd7"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd7),
				when(boundOr("asppl_grp_flg7", "asppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd7.like(bind("asppl_grp_cd7")))),
				when(boundOr("asppl_grp_flg7"))
					.select(DS0D, S0_ASPPL_GRP7.bp_grp_nm.as("asppl_grp_nm7"))
					.groupBy(DS0D, S0_ASPPL_GRP7.bp_grp_nm),
				when(boundOr("asppl_grp_flg7", "asppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP7).on(S0_ASPPL.bp_grp_cd7.eq(S0_ASPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_ASPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP7.bp_grp_nm.like(bind("asppl_grp_nm7")))),
				when(boundOr("asppl_grp_flg8"))
					.select(DS0D, S0_ASPPL.bp_grp_cd8.as("asppl_grp_cd8"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd8),
				when(boundOr("asppl_grp_flg8", "asppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd8.like(bind("asppl_grp_cd8")))),
				when(boundOr("asppl_grp_flg8"))
					.select(DS0D, S0_ASPPL_GRP8.bp_grp_nm.as("asppl_grp_nm8"))
					.groupBy(DS0D, S0_ASPPL_GRP8.bp_grp_nm),
				when(boundOr("asppl_grp_flg8", "asppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP8).on(S0_ASPPL.bp_grp_cd8.eq(S0_ASPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_ASPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP8.bp_grp_nm.like(bind("asppl_grp_nm8")))),
				when(boundOr("asppl_grp_flg9"))
					.select(DS0D, S0_ASPPL.bp_grp_cd9.as("asppl_grp_cd9"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd9),
				when(boundOr("asppl_grp_flg9", "asppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd9.like(bind("asppl_grp_cd9")))),
				when(boundOr("asppl_grp_flg9"))
					.select(DS0D, S0_ASPPL_GRP9.bp_grp_nm.as("asppl_grp_nm9"))
					.groupBy(DS0D, S0_ASPPL_GRP9.bp_grp_nm),
				when(boundOr("asppl_grp_flg9", "asppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP9).on(S0_ASPPL.bp_grp_cd9.eq(S0_ASPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_ASPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP9.bp_grp_nm.like(bind("asppl_grp_nm9")))),
				when(boundOr("asppl_grp_flg10"))
					.select(DS0D, S0_ASPPL.bp_grp_cd10.as("asppl_grp_cd10"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd10),
				when(boundOr("asppl_grp_flg10", "asppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd10.like(bind("asppl_grp_cd10")))),
				when(boundOr("asppl_grp_flg10"))
					.select(DS0D, S0_ASPPL_GRP10.bp_grp_nm.as("asppl_grp_nm10"))
					.groupBy(DS0D, S0_ASPPL_GRP10.bp_grp_nm),
				when(boundOr("asppl_grp_flg10", "asppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP10).on(S0_ASPPL.bp_grp_cd10.eq(S0_ASPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_ASPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP10.bp_grp_nm.like(bind("asppl_grp_nm10")))),
				when(boundOr("trd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD).on(S0_TRD.trd_cd.eq(S0_T1.trd_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))),
				when(boundOr("site_cd", "site_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_IN_TO_LOC.site_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SITE.site_cd.like(bind("site_cd"))).cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(DS0D, v -> v.innerJoin(S0_TRD_CUR).on(S0_TRD_CUR.cur_cd.eq(S0_T1.trd_cur_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD_CUR.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("bsppl_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL).on(S0_BSPPL.bp_cd.eq(S0_ASPPL.bsppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_nm.like(bind("bsppl_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PURC_USR).on(S0_PURC_USR.usr_cd.eq(S0_T1.purc_usr_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PURC_USR.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("purc_dpt_nm", "wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PURC_DPT).on(S0_PURC_DPT.dpt_cd.eq(S0_T1.purc_dpt_cd).and(S0_T1.ac_dt.between(S0_PURC_DPT.st_dt, S0_PURC_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PURC_DPT.dpt_nm.like(bind("purc_dpt_nm")))),
				when(boundOr("wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PURC_DPT_WG).on(S0_PURC_DPT_WG.wg_cd.eq(S0_PURC_DPT.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PURC_DPT_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("po_no"))
					.view(DS0D, v -> v.innerJoin(S0_PO).on(S0_PO.po_no.eq(S0_PO_D.po_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO.po_no.like(bind("po_no"))))
			);
	}
	
	/**
	 * -- MSBDL0190_MST_PURC_ACT_Query_S05
	 */
	static MCQueryPlan MSBDL0190_MST_PURC_ACT_S05() {
		MST_PURC_ACT_R S0_T1 = MST_PURC_ACT_R.create("T1");
		MST_PURC_ACT_D_R S0_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_RET_ACT_P_R S0_T8 = MST_PURC_RET_ACT_P_R.create("T8");
		MST_PURC_RET_ACT_R S0_T3 = MST_PURC_RET_ACT_R.create("T3");
		MST_PURC_RET_ACT_D_P_R S0_T9 = MST_PURC_RET_ACT_D_P_R.create("T9");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
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
		MAM_LOC_R S0_IN_TO_LOC = MAM_LOC_R.create("IN_TO_LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_CUR_R S0_TRD_CUR = MAM_CUR_R.create("TRD_CUR");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
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
		MAVM_BP_NM_R S0_MAKER = MAVM_BP_NM_R.create("MAKER");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_BP_R S0_ASPPL = MAM_BP_R.create("ASPPL");
		MAM_BP_GRP_R S0_ASPPL_GRP1 = MAM_BP_GRP_R.create("ASPPL_GRP1");
		MAM_BP_GRP_R S0_ASPPL_GRP2 = MAM_BP_GRP_R.create("ASPPL_GRP2");
		MAM_BP_GRP_R S0_ASPPL_GRP3 = MAM_BP_GRP_R.create("ASPPL_GRP3");
		MAM_BP_GRP_R S0_ASPPL_GRP4 = MAM_BP_GRP_R.create("ASPPL_GRP4");
		MAM_BP_GRP_R S0_ASPPL_GRP5 = MAM_BP_GRP_R.create("ASPPL_GRP5");
		MAM_BP_GRP_R S0_ASPPL_GRP6 = MAM_BP_GRP_R.create("ASPPL_GRP6");
		MAM_BP_GRP_R S0_ASPPL_GRP7 = MAM_BP_GRP_R.create("ASPPL_GRP7");
		MAM_BP_GRP_R S0_ASPPL_GRP8 = MAM_BP_GRP_R.create("ASPPL_GRP8");
		MAM_BP_GRP_R S0_ASPPL_GRP9 = MAM_BP_GRP_R.create("ASPPL_GRP9");
		MAM_BP_GRP_R S0_ASPPL_GRP10 = MAM_BP_GRP_R.create("ASPPL_GRP10");
		MAM_DPT_R S0_AP_DPT = MAM_DPT_R.create("AP_DPT");
		MAM_BP_R S0_BSPPL = MAM_BP_R.create("BSPPL");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_USR_R S0_PURC_USR = MAM_USR_R.create("PURC_USR");
		MAM_DPT_R S0_PURC_DPT = MAM_DPT_R.create("PURC_DPT");
		MAM_WG_R S0_PURC_DPT_WG = MAM_WG_R.create("PURC_DPT_WG");
		MAM_STK_GD_R S0_STK_GD = MAM_STK_GD_R.create("STK_GD");
		MST_PO_R S0_PO = MST_PO_R.create("PO");
		MST_PO_D_R S0_PO_D = MST_PO_D_R.create("PO_D");
		MSVT_WRK_SNO_R S0_WRK_SNO = MSVT_WRK_SNO_R.create("WRK_SNO");
		MST_PURC_SCHD_R S0_T10 = MST_PURC_SCHD_R.create("T10");
		MST_ARR_SCHD_R S0_T11 = MST_ARR_SCHD_R.create("T11");
		MST_RCPT_IV_D_R S0_T12 = MST_RCPT_IV_D_R.create("T12");
		MST_PRMS_RCPT_D_R S0_T13 = MST_PRMS_RCPT_D_R.create("T13");
		MST_DLV_INST_D_R S0_T14 = MST_DLV_INST_D_R.create("T14");
		MST_PO_D_R S0_T15 = MST_PO_D_R.create("T15");
		MST_SLO_D_R S0_T20 = MST_SLO_D_R.create("T20");
		MAM_BP_R S0_MDLV = MAM_BP_R.create("MDLV");
		MAM_BP_R S0_MTDLV = MAM_BP_R.create("MTDLV");
		MAVM_RD_DPT_R S1_M99 = MAVM_RD_DPT_R.create("M99");
		MAM_BP_R S0_SPPL_2 = MAM_BP_R.create("BSPPL2");
		MST_PURC_RET_SCHD_D_R S0_PURC_RET_SCHD = MST_PURC_RET_SCHD_D_R.create("S0_PURC_RET_SCHD");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0190_MST_PURC_ACT_Query_S05")
					.mainQuery()
					.select(
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_ts,
						S0_T2.ins_func_id,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_ts,
						S0_T2.upd_func_id,
						S0_T2.upd_srv_req_no,
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.purc_dt,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T2.itm_nm,
						S0_T2.iv_itm_nm,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.ver_no,
						S0_T2.purc_typ,
						S0_T2.in_to_loc_cd,
						S0_T2.in_to_loc_wg_cd.as("in_to_loc_wg_cd"),
						S0_T2.str_ln_cd,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						S0_T1.trd_cur_cd,
						S0_T1.sppl_cd,
						S0_T1.asppl_cd,
						S0_T1.bsppl_cd,
						S0_T2.maker_cd,
						S0_T8.ret_sppl_nm,
						S0_T2.sppl_itm_cd,
						S0_T2.sppl_itm_nm,
						MAPA_BP$F_GET_AP_DPT_CD_NE(
							S0_SPPL_2.asppl_cd,
							bind("today"),
							value(false)
						).as("mst_ap_dpt_cd"),
						bracket(
								cases()
									.when(S0_T15.dlv_cd.isNotNull())
										.then(S0_T20.cst_itm_cd)
									.otherwise(nullValue())
							).as("cst_itm_cd"),
						bracket(
								cases()
									.when(S0_T15.dlv_cd.isNotNull())
										.then(S0_T20.cst_itm_nm)
									.otherwise(nullValue())
							).as("cst_itm_nm"),
						S0_T2.ap_dpt_cd,
						S0_T2.upri_not_tgt_flg,
						S0_T2.trd_cur_upri,
						S0_T2.trd_cur_upri.as("old_trd_cur_upri"),
						S0_T2.interim_flg,
						S0_T2.trd_cur_amt,
						S0_T2.trd_cur_amt.add(S0_T2.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T2.tax_cd,
						decode(
								S0_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.PURC_DSCNT.value()),
								value(false),
								value(MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS.value()),
								value(false),
								value(MAC_TRD_PTN_TYP.PURC_XTRA.value()),
								value(false),
								value(MAC_TRD_PTN_TYP.PURC_XTRA_XPNS.value()),
								value(false),
								value(MAC_TRD_PTN_TYP.PURC_RTN.value()),
								nvl(
									S0_PURC_RET_SCHD.tax_fix_flg,
									value(false)
								),
								value(MAC_TRD_PTN_TYP.PURC_RTN_XPNS.value()),
								nvl(
									S0_PURC_RET_SCHD.tax_fix_flg,
									value(false)
								),
								nvl2(
									S0_T12.rcpt_iv_d_no,
									S0_T12.tax_fix_flg,
									S0_T15.tax_fix_flg
								)
							).as("tax_fix_flg"),
						S0_T2.trd_cur_tax_amt,
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T2.trd_cur_proc_upri,
						S0_T2.trd_cur_proc_upri.as("old_trd_cur_proc_upri"),
						S0_T2.trd_cur_proc_amt,
						S0_T2.trd_cur_onr_prov_upri,
						S0_T2.trd_cur_onr_prov_upri.as("old_trd_cur_onr_prov_upri"),
						S0_T2.trd_cur_onr_prov_amt,
						S0_T1.xrate,
						S0_T1.base_cur_cd,
						S0_T2.base_cur_upri,
						S0_T2.base_cur_amt,
						S0_T2.base_cur_amt.add(S0_T2.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
						S0_T2.base_cur_tax_amt,
						S0_T2.base_cur_proc_upri,
						S0_T2.base_cur_proc_amt,
						S0_T2.base_cur_onr_prov_upri,
						S0_T2.base_cur_onr_prov_amt,
						S0_T2.base_cur_dscnt_amt,
						S0_T1.ptax_xrate,
						S0_T1.ptax_cur_cd,
						S0_T2.ptax_cur_upri,
						S0_T2.ptax_cur_amt,
						S0_T2.ptax_cur_amt.add(S0_T2.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
						S0_T2.ptax_cur_tax_amt,
						S0_T2.ptax_cur_proc_upri,
						S0_T2.ptax_cur_proc_amt,
						S0_T2.ptax_cur_onr_prov_upri,
						S0_T2.ptax_cur_onr_prov_amt,
						S0_T2.ptax_cur_dscnt_amt,
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T1.ptax_dt,
						S0_T2.pay_crryovr_times,
						S0_T1.pay_basis_dt,
						S0_T1.pay_schd_dt,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T2.gd_cd,
						S0_T1.purc_usr_cd,
						S0_T1.purc_dpt_cd,
						S0_T2.bp_dlv_slip_no,
						S0_T2.bp_dlv_slip_d_no,
						S0_T2.bp_lot_no,
						S0_T2.po_d_no,
						S0_T2.mfg_inst_no,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.rcpt_iv_rev,
						S0_T2.rcpt_iv_d_no,
						nvl(
							S0_T1.ref_rcpt_iv_no,
							S0_T8.ref_rcpt_iv_no
						).as("ref_rcpt_iv_no"),
						S0_T2.purc_schd_no,
						S0_T2.rsn_cd,
						S0_T2.trd_d_rmrks,
						S0_T2.intr_rmrks.as("intr_d_rmrks"),
						S0_T1.sub_char1.as("purc_act_sub_char1"),
						S0_T1.sub_char2.as("purc_act_sub_char2"),
						S0_T1.sub_char3.as("purc_act_sub_char3"),
						S0_T2.sub_char1.as("purc_act_d_sub_char1"),
						S0_T2.sub_char2.as("purc_act_d_sub_char2"),
						S0_T2.sub_char3.as("purc_act_d_sub_char3"),
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.ncv_flg,
						S0_T2.edi_flg,
						S0_T2.sync_flg,
						S0_T2.accpt_dfct_flg,
						S0_T2.re_arr_flg,
						S0_T2.temp_ap_flg,
						S0_T1.purc_act_no,
						S0_T1.purc_act_seq,
						S0_T1.purc_act_rev,
						S0_T2.purc_act_d_no,
						S0_T2.purc_act_d_seq,
						S0_T2.purc_src_typ,
						S0_T2.purc_src_no,
						S0_T8.purc_ret_act_no,
						S0_T8.purc_ret_act_rev,
						S0_T9.purc_ret_act_d_no,
						S0_T2.base_purc_ac_dt,
						S0_T8.purc_ret_schd_no,
						S0_T9.purc_ret_schd_d_no,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T2.disp_seq,
						S0_T2.trd_unit_cd.as("base_trd_unit_cd"),
						S0_T2.trd_unit_qty.as("base_trd_unit_qty"),
						S0_T2.base_unit_qty.as("base_base_unit_qty"),
						S0_T1.trd_cur_cd.as("base_trd_cur_cd"),
						S0_T2.in_to_loc_wg_cd.as("base_in_to_loc_wg_cd"),
						S0_T2.in_to_loc_cd.as("base_in_to_loc_cd"),
						S0_T1.ac_dt.as("sbst_dt"),
						S0_T2.tax_cd.as("base_tax_cd"),
						S0_T2.bd_itm_cd,
						S0_T2.bd_itm_sub1,
						S0_T2.bd_itm_sub2,
						S0_T2.bd_itm_sub3,
						S0_T2.bd_sno1,
						S0_T2.bd_sno2,
						S0_T2.bd_sno3,
						S0_T2.bd_sno4,
						S0_T2.bd_loc_cd,
						S0_T2.bd_lot_no,
						S0_T2.bd_sublot_no,
						S0_T2.bd_dpt_cd,
						S0_T2.bd_ctg_cd,
						S0_T2.bd_oper_cd,
						S0_T2.bd_slo_no,
						S0_T2.bd_iv_no,
						S0_T2.bd_po_no,
						S0_T1.upd_cntr.as("purc_upd_cntr"),
						S0_T3.upd_cntr.as("purc_ret_upd_cntr"),
						nvl(
							S0_T14.dlv_cd,
							S0_T15.dlv_cd
						).as("dlv_cd"),
						nvl2(
							S0_T14.dlv_cd,
							nvl(
								S0_T14.dlv_nm,
								S0_MDLV.bp_nm
							),
							nvl(
								S0_T15.dlv_nm,
								S0_MDLV.bp_nm
							)
						).as("dlv_nm"),
						nvl2(
							S0_T14.dlv_cd,
							S0_T14.dlv_sundry_flg,
							S0_T15.dlv_sundry_flg
						).as("dlv_sundry_flg"),
						nvl2(
							S0_T14.dlv_cd,
							S0_T14.dlv_cntct_dpt,
							S0_T15.dlv_cntct_dpt
						).as("dlv_cntct_dpt"),
						nvl2(
							S0_T14.dlv_cd,
							S0_T14.dlv_cntct_psn,
							S0_T15.dlv_cntct_psn
						).as("dlv_cntct_psn"),
						nvl2(
							S0_T14.dlv_cd,
							S0_T14.dlv_zip_cd,
							S0_T15.dlv_zip_cd
						).as("dlv_zip_cd"),
						nvl2(
							S0_T14.dlv_cd,
							S0_T14.dlv_addr1,
							S0_T15.dlv_addr1
						).as("dlv_addr1"),
						nvl2(
							S0_T14.dlv_cd,
							S0_T14.dlv_addr2,
							S0_T15.dlv_addr2
						).as("dlv_addr2"),
						nvl2(
							S0_T14.dlv_cd,
							S0_T14.dlv_addr3,
							S0_T15.dlv_addr3
						).as("dlv_addr3"),
						nvl2(
							S0_T14.dlv_cd,
							S0_T14.dlv_addr4,
							S0_T15.dlv_addr4
						).as("dlv_addr4"),
						nvl2(
							S0_T14.dlv_cd,
							S0_T14.dlv_tel,
							S0_T15.dlv_tel
						).as("dlv_tel"),
						nvl2(
							S0_T14.dlv_cd,
							S0_T14.dlv_fax,
							S0_T15.dlv_fax
						).as("dlv_fax"),
						S0_MDLV.cntry_cd.as("dlv_cntry_cd"),
						nvl(
							S0_T14.tdlv_cd,
							S0_T15.tdlv_cd
						).as("tdlv_cd"),
						nvl2(
							S0_T14.tdlv_cd,
							nvl(
								S0_T14.tdlv_nm,
								S0_MTDLV.bp_nm
							),
							nvl(
								S0_T15.tdlv_nm,
								S0_MTDLV.bp_nm
							)
						).as("tdlv_nm"),
						nvl2(
							S0_T14.tdlv_cd,
							S0_T14.tdlv_cntct_dpt,
							S0_T15.tdlv_cntct_dpt
						).as("tdlv_cntct_dpt"),
						nvl2(
							S0_T14.tdlv_cd,
							S0_T14.tdlv_cntct_psn,
							S0_T15.tdlv_cntct_psn
						).as("tdlv_cntct_psn"),
						nvl2(
							S0_T14.tdlv_cd,
							S0_T14.tdlv_sundry_flg,
							S0_T15.tdlv_sundry_flg
						).as("tdlv_sundry_flg"),
						nvl2(
							S0_T14.tdlv_cd,
							S0_T14.tdlv_zip_cd,
							S0_T15.tdlv_zip_cd
						).as("tdlv_zip_cd"),
						nvl2(
							S0_T14.tdlv_cd,
							S0_T14.tdlv_addr1,
							S0_T15.tdlv_addr1
						).as("tdlv_addr1"),
						nvl2(
							S0_T14.tdlv_cd,
							S0_T14.tdlv_addr2,
							S0_T15.tdlv_addr2
						).as("tdlv_addr2"),
						nvl2(
							S0_T14.tdlv_cd,
							S0_T14.tdlv_addr3,
							S0_T15.tdlv_addr3
						).as("tdlv_addr3"),
						nvl2(
							S0_T14.tdlv_cd,
							S0_T14.tdlv_addr4,
							S0_T15.tdlv_addr4
						).as("tdlv_addr4"),
						nvl2(
							S0_T14.tdlv_cd,
							S0_T14.tdlv_tel,
							S0_T15.tdlv_tel
						).as("tdlv_tel"),
						nvl2(
							S0_T14.tdlv_cd,
							S0_T14.tdlv_fax,
							S0_T15.tdlv_fax
						).as("tdlv_fax"),
						S0_MTDLV.cntry_cd.as("tdlv_cntry_cd"),
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							S0_T1.purc_act_no.eq(S0_T2.purc_act_no)
							.and(S0_T1.purc_act_seq.eq(S0_T2.purc_act_seq))
						)
						.leftOuterJoin(S0_T8).on(
							S0_T8.purc_ret_act_no.eq(S0_T1.purc_ret_act_no)
							.and(S0_T8.purc_ret_act_rev.eq(S0_T1.purc_ret_act_rev))
						)
						.leftOuterJoin(S0_T3).on(
							S0_T8.purc_ret_act_no.eq(S0_T3.purc_ret_act_no)
							.and(S0_T8.purc_ret_act_rev.eq(S0_T3.purc_ret_act_rev))
						)
						.leftOuterJoin(S0_T9).on(
							S0_T9.purc_ret_act_no.eq(S0_T8.purc_ret_act_no)
							.and(S0_T9.purc_ret_act_rev.eq(S0_T8.purc_ret_act_rev))
							.and(S0_T2.purc_ret_act_d_no.eq(S0_T9.purc_ret_act_d_no))
						)
						.addDynamicView(DS0D)
						.leftOuterJoin(S0_T10).on(S0_T10.purc_schd_no.eq(S0_T2.purc_schd_no))
						.leftOuterJoin(S0_T11).on(S0_T11.arr_schd_no.eq(S0_T10.arr_schd_no))
						.leftOuterJoin(S0_T12).on(S0_T12.rcpt_iv_d_no.eq(S0_T2.rcpt_iv_d_no))
						.leftOuterJoin(S0_T13).on(
							S0_T13.prms_rcpt_d_no.eq(nvl(
									S0_T11.prms_rcpt_d_no,
									S0_T12.ref_prms_rcpt_d_no
								)
							)
						)
						.leftOuterJoin(S0_T14).on(
							S0_T14.dlv_inst_d_no.eq(coalesce(
									S0_T11.dlv_inst_d_no,
									S0_T13.dlv_inst_d_no,
									S0_T12.ref_dlv_inst_d_no
								)
							)
						)
						.leftOuterJoin(S0_T15).on(S0_T15.po_d_no.eq(S0_T2.po_d_no))
						.leftOuterJoin(S0_PURC_RET_SCHD).on(S0_PURC_RET_SCHD.purc_ret_schd_d_no.eq(S0_T9.purc_ret_schd_d_no))
						.leftOuterJoin(S0_MDLV).on(
							S0_MDLV.bp_cd.eq(nvl(
									S0_T14.dlv_cd,
									S0_T15.dlv_cd
								)
							)
						)
						.leftOuterJoin(S0_MTDLV).on(
							S0_MTDLV.bp_cd.eq(nvl(
									S0_T14.tdlv_cd,
									S0_T15.tdlv_cd
								)
							)
						)
						.leftOuterJoin(S0_T20).on
							(bracket(
									S0_T20.slo_d_no.eq(S0_T15.slo_d_no)
								)
						)
						.leftOuterJoin(S0_SPPL_2).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_SPPL_2.bp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_M99)
								.where(
									S0_T1.purc_dpt_cd.eq(S1_M99.dpt_cd)
								)
							)
						)
						.and(
							bracket(
								S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							)
							.or(bind("tmp_dis_can_disp_flg").eq(value(true)))
						)
						.and(
							bracket(
								S0_T8.purc_ret_act_no.isNotNull()
								.and(S0_T9.purc_ret_act_no.isNotNull())
							)
							.or(S0_T8.purc_ret_act_no.isNull())
						)
						.cutoff$and(S0_T1.purc_dt.gte(bind("purc_dt_from")))
						.cutoff$and(S0_T1.purc_dt.lte(bind("purc_dt_to")))
						.cutoff$and(S0_T1.ac_ym.gte(bind("ac_ym_from")))
						.cutoff$and(S0_T1.ac_ym.lte(bind("ac_ym_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_from")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T2.in_to_loc_cd.like(bind("in_to_loc_cd")))
						.cutoff$and(S0_T2.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T2.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T2.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T2.sno1.like(bind("sno1")))
						.cutoff$and(S0_T2.sno2.like(bind("sno2")))
						.cutoff$and(S0_T2.sno3.like(bind("sno3")))
						.cutoff$and(S0_T2.sno4.like(bind("sno4")))
						.cutoff$and(S0_T2.maker_cd.like(bind("maker_cd")))
						.cutoff$and(S0_T2.sppl_itm_cd.like(bind("sppl_itm_cd")))
						.cutoff$and(S0_T2.sppl_itm_nm.like(bind("sppl_itm_nm")))
						.cutoff$and(S0_T2.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T2.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T2.bp_lot_no.like(bind("bp_lot_no")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.purc_act_no.like(bind("purc_act_no")))
						.cutoff$and(S0_T2.purc_act_d_no.like(bind("purc_act_d_no")))
						.cutoff$and(S0_T2.purc_src_typ.like(bind("purc_src_typ")))
						.cutoff$and(S0_T2.purc_src_no.like(bind("purc_src_no")))
						.cutoff$and(S0_T8.purc_ret_act_no.like(bind("purc_ret_act_no")))
						.cutoff$and(S0_T9.purc_ret_act_d_no.like(bind("purc_ret_act_d_no")))
						.cutoff$and(S0_T1.base_cur_cd.notLike(bind("tmp_base_cur_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T2.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T2.intr_rmrks.like(bind("dtl_intr_rmrks")))
						.cutoff$and(S0_T2.trd_d_rmrks.like(bind("dtl_trd_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.sub_char1.like(bind("dtl_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("dtl_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("dtl_sub_char3")))
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
						.cutoff$and(S0_T2.rcpt_iv_d_no.like(bind("rcpt_iv_d_no")))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_xpns")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_vmi")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_dscnt")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_dscnt_xpns")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_xtra")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_xtra_xpns")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_rtn")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_rtn_xpns")))
						)
						.cutoff$and(S0_T2.interim_flg.eq(bind("tmp_interim")))
						.cutoff$and(
							bind("tmp_foreign").eq(value(true))
							.and(S0_T1.trd_cur_cd.neq(S0_T1.base_cur_cd))
						)
						.and(
							value(false).eq(bind("except_can_not_upd_flg"))
							.or(
								value(true).eq(bind("except_can_not_upd_flg"))
								.and(S0_T2.accpt_dfct_flg.eq(value(false)))
								.and(S0_T2.ncv_flg.eq(value(false)))
							)
						)
						.and(
							S0_T2.temp_ap_flg.eq(value(false))
							.or(
								bind("incl_temp_ap_flg").eq(value(true))
								.and(S0_T2.temp_ap_flg.eq(value(true)))
							)
						)
						.cutoff$and(
							nvl(
								S0_T14.dlv_cd,
								S0_T15.dlv_cd
							).like(bind("dlv_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T14.dlv_cd,
								nvl(
									S0_T14.dlv_nm,
									S0_MDLV.bp_nm
								),
								nvl(
									S0_T15.dlv_nm,
									S0_MDLV.bp_nm
								)
							).like(bind("dlv_nm"))
						)
						.cutoff$and(
							nvl(
								S0_T14.tdlv_cd,
								S0_T15.tdlv_cd
							).like(bind("tdlv_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T14.tdlv_cd,
								nvl(
									S0_T14.tdlv_nm,
									S0_MTDLV.bp_nm
								),
								nvl(
									S0_T15.tdlv_nm,
									S0_MTDLV.bp_nm
								)
							).like(bind("tdlv_nm"))
						)
						.cutoff$and(S0_T20.cst_itm_cd.like(bind("cst_itm_cd"))
								.and(S0_T15.dlv_cd.isNotNull()))
						.cutoff$and(S0_T20.cst_itm_nm.like(bind("cst_itm_nm"))
								.and(S0_T15.dlv_cd.isNotNull()))
					)
					.orderBy(
						S0_T1.purc_act_no.asc(),
						S0_T1.purc_act_seq.asc(),
						S0_T2.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM).on(S0_ITM.itm_cd.eq(S0_T2.itm_cd).and(S0_ITM.itm_sub1.eq(S0_T2.itm_sub1)).and(S0_ITM.itm_sub2.eq(S0_T2.itm_sub2)).and(S0_ITM.itm_sub3.eq(S0_T2.itm_sub3))))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_T2.itm_nm,S0_ITM.itm_nm).like(bind("itm_nm"))).cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1", "itm_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS0D, S0_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2", "itm_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS0D, S0_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3", "itm_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS0D, S0_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4", "itm_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS0D, S0_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5", "itm_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS0D, S0_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6", "itm_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS0D, S0_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7", "itm_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS0D, S0_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8", "itm_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS0D, S0_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9", "itm_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS0D, S0_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10", "itm_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS0D, S0_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_nm", "tmp_iv_trgt", "tmp_subcon", "asppl_cd", "asppl_nm", "bsppl_cd", "bsppl_nm", "sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "asppl_grp_flg1", "asppl_grp_flg2", "asppl_grp_flg3", "asppl_grp_flg4", "asppl_grp_flg5", "asppl_grp_flg6", "asppl_grp_flg7", "asppl_grp_flg8", "asppl_grp_flg9", "asppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL).on(S0_SPPL.bp_cd.eq(S0_T1.sppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm"))).cutoff$and(S0_SPPL.sppl_iv_flg.eq(bind("tmp_iv_trgt"))).cutoff$and(S0_SPPL.subcon_flg.eq(bind("tmp_subcon")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL.bp_grp_cd1.as("sppl_grp_cd1"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd1),
				when(boundOr("sppl_grp_flg1", "sppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.groupBy(DS0D, S0_SPPL_GRP1.bp_grp_nm),
				when(boundOr("sppl_grp_flg1", "sppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP1).on(S0_SPPL.bp_grp_cd1.eq(S0_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL.bp_grp_cd2.as("sppl_grp_cd2"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd2),
				when(boundOr("sppl_grp_flg2", "sppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.groupBy(DS0D, S0_SPPL_GRP2.bp_grp_nm),
				when(boundOr("sppl_grp_flg2", "sppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP2).on(S0_SPPL.bp_grp_cd2.eq(S0_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL.bp_grp_cd3.as("sppl_grp_cd3"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd3),
				when(boundOr("sppl_grp_flg3", "sppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.groupBy(DS0D, S0_SPPL_GRP3.bp_grp_nm),
				when(boundOr("sppl_grp_flg3", "sppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP3).on(S0_SPPL.bp_grp_cd3.eq(S0_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL.bp_grp_cd4.as("sppl_grp_cd4"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd4),
				when(boundOr("sppl_grp_flg4", "sppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.groupBy(DS0D, S0_SPPL_GRP4.bp_grp_nm),
				when(boundOr("sppl_grp_flg4", "sppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP4).on(S0_SPPL.bp_grp_cd4.eq(S0_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL.bp_grp_cd5.as("sppl_grp_cd5"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd5),
				when(boundOr("sppl_grp_flg5", "sppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.groupBy(DS0D, S0_SPPL_GRP5.bp_grp_nm),
				when(boundOr("sppl_grp_flg5", "sppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP5).on(S0_SPPL.bp_grp_cd5.eq(S0_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL.bp_grp_cd6.as("sppl_grp_cd6"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd6),
				when(boundOr("sppl_grp_flg6", "sppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.groupBy(DS0D, S0_SPPL_GRP6.bp_grp_nm),
				when(boundOr("sppl_grp_flg6", "sppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP6).on(S0_SPPL.bp_grp_cd6.eq(S0_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL.bp_grp_cd7.as("sppl_grp_cd7"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd7),
				when(boundOr("sppl_grp_flg7", "sppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.groupBy(DS0D, S0_SPPL_GRP7.bp_grp_nm),
				when(boundOr("sppl_grp_flg7", "sppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP7).on(S0_SPPL.bp_grp_cd7.eq(S0_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL.bp_grp_cd8.as("sppl_grp_cd8"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd8),
				when(boundOr("sppl_grp_flg8", "sppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.groupBy(DS0D, S0_SPPL_GRP8.bp_grp_nm),
				when(boundOr("sppl_grp_flg8", "sppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP8).on(S0_SPPL.bp_grp_cd8.eq(S0_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL.bp_grp_cd9.as("sppl_grp_cd9"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd9),
				when(boundOr("sppl_grp_flg9", "sppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.groupBy(DS0D, S0_SPPL_GRP9.bp_grp_nm),
				when(boundOr("sppl_grp_flg9", "sppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP9).on(S0_SPPL.bp_grp_cd9.eq(S0_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL.bp_grp_cd10.as("sppl_grp_cd10"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd10),
				when(boundOr("sppl_grp_flg10", "sppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.groupBy(DS0D, S0_SPPL_GRP10.bp_grp_nm),
				when(boundOr("sppl_grp_flg10", "sppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP10).on(S0_SPPL.bp_grp_cd10.eq(S0_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("asppl_cd", "asppl_nm", "bsppl_cd", "bsppl_nm", "asppl_grp_flg1", "asppl_grp_flg2", "asppl_grp_flg3", "asppl_grp_flg4", "asppl_grp_flg5", "asppl_grp_flg6", "asppl_grp_flg7", "asppl_grp_flg8", "asppl_grp_flg9", "asppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL).on(S0_ASPPL.bp_cd.eq(S0_SPPL.asppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_cd.like(bind("asppl_cd"))).cutoff$and(S0_ASPPL.bp_nm.like(bind("asppl_nm"))).cutoff$and(S0_ASPPL.bsppl_cd.like(bind("bsppl_cd")))),
				when(boundOr("asppl_grp_flg1"))
					.select(DS0D, S0_ASPPL.bp_grp_cd1.as("asppl_grp_cd1"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd1),
				when(boundOr("asppl_grp_flg1", "asppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd1.like(bind("asppl_grp_cd1")))),
				when(boundOr("asppl_grp_flg1"))
					.select(DS0D, S0_ASPPL_GRP1.bp_grp_nm.as("asppl_grp_nm1"))
					.groupBy(DS0D, S0_ASPPL_GRP1.bp_grp_nm),
				when(boundOr("asppl_grp_flg1", "asppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP1).on(S0_ASPPL.bp_grp_cd1.eq(S0_ASPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_ASPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP1.bp_grp_nm.like(bind("asppl_grp_nm1")))),
				when(boundOr("asppl_grp_flg2"))
					.select(DS0D, S0_ASPPL.bp_grp_cd2.as("asppl_grp_cd2"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd2),
				when(boundOr("asppl_grp_flg2", "asppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd2.like(bind("asppl_grp_cd2")))),
				when(boundOr("asppl_grp_flg2"))
					.select(DS0D, S0_ASPPL_GRP2.bp_grp_nm.as("asppl_grp_nm2"))
					.groupBy(DS0D, S0_ASPPL_GRP2.bp_grp_nm),
				when(boundOr("asppl_grp_flg2", "asppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP2).on(S0_ASPPL.bp_grp_cd2.eq(S0_ASPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_ASPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP2.bp_grp_nm.like(bind("asppl_grp_nm2")))),
				when(boundOr("asppl_grp_flg3"))
					.select(DS0D, S0_ASPPL.bp_grp_cd3.as("asppl_grp_cd3"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd3),
				when(boundOr("asppl_grp_flg3", "asppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd3.like(bind("asppl_grp_cd3")))),
				when(boundOr("asppl_grp_flg3"))
					.select(DS0D, S0_ASPPL_GRP3.bp_grp_nm.as("asppl_grp_nm3"))
					.groupBy(DS0D, S0_ASPPL_GRP3.bp_grp_nm),
				when(boundOr("asppl_grp_flg3", "asppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP3).on(S0_ASPPL.bp_grp_cd3.eq(S0_ASPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_ASPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP3.bp_grp_nm.like(bind("asppl_grp_nm3")))),
				when(boundOr("asppl_grp_flg4"))
					.select(DS0D, S0_ASPPL.bp_grp_cd4.as("asppl_grp_cd4"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd4),
				when(boundOr("asppl_grp_flg4", "asppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd4.like(bind("asppl_grp_cd4")))),
				when(boundOr("asppl_grp_flg4"))
					.select(DS0D, S0_ASPPL_GRP4.bp_grp_nm.as("asppl_grp_nm4"))
					.groupBy(DS0D, S0_ASPPL_GRP4.bp_grp_nm),
				when(boundOr("asppl_grp_flg4", "asppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP4).on(S0_ASPPL.bp_grp_cd4.eq(S0_ASPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_ASPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP4.bp_grp_nm.like(bind("asppl_grp_nm4")))),
				when(boundOr("asppl_grp_flg5"))
					.select(DS0D, S0_ASPPL.bp_grp_cd5.as("asppl_grp_cd5"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd5),
				when(boundOr("asppl_grp_flg5", "asppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd5.like(bind("asppl_grp_cd5")))),
				when(boundOr("asppl_grp_flg5"))
					.select(DS0D, S0_ASPPL_GRP5.bp_grp_nm.as("asppl_grp_nm5"))
					.groupBy(DS0D, S0_ASPPL_GRP5.bp_grp_nm),
				when(boundOr("asppl_grp_flg5", "asppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP5).on(S0_ASPPL.bp_grp_cd5.eq(S0_ASPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_ASPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP5.bp_grp_nm.like(bind("asppl_grp_nm5")))),
				when(boundOr("asppl_grp_flg6"))
					.select(DS0D, S0_ASPPL.bp_grp_cd6.as("asppl_grp_cd6"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd6),
				when(boundOr("asppl_grp_flg6", "asppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd6.like(bind("asppl_grp_cd6")))),
				when(boundOr("asppl_grp_flg6"))
					.select(DS0D, S0_ASPPL_GRP6.bp_grp_nm.as("asppl_grp_nm6"))
					.groupBy(DS0D, S0_ASPPL_GRP6.bp_grp_nm),
				when(boundOr("asppl_grp_flg6", "asppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP6).on(S0_ASPPL.bp_grp_cd6.eq(S0_ASPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_ASPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP6.bp_grp_nm.like(bind("asppl_grp_nm6")))),
				when(boundOr("asppl_grp_flg7"))
					.select(DS0D, S0_ASPPL.bp_grp_cd7.as("asppl_grp_cd7"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd7),
				when(boundOr("asppl_grp_flg7", "asppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd7.like(bind("asppl_grp_cd7")))),
				when(boundOr("asppl_grp_flg7"))
					.select(DS0D, S0_ASPPL_GRP7.bp_grp_nm.as("asppl_grp_nm7"))
					.groupBy(DS0D, S0_ASPPL_GRP7.bp_grp_nm),
				when(boundOr("asppl_grp_flg7", "asppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP7).on(S0_ASPPL.bp_grp_cd7.eq(S0_ASPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_ASPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP7.bp_grp_nm.like(bind("asppl_grp_nm7")))),
				when(boundOr("asppl_grp_flg8"))
					.select(DS0D, S0_ASPPL.bp_grp_cd8.as("asppl_grp_cd8"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd8),
				when(boundOr("asppl_grp_flg8", "asppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd8.like(bind("asppl_grp_cd8")))),
				when(boundOr("asppl_grp_flg8"))
					.select(DS0D, S0_ASPPL_GRP8.bp_grp_nm.as("asppl_grp_nm8"))
					.groupBy(DS0D, S0_ASPPL_GRP8.bp_grp_nm),
				when(boundOr("asppl_grp_flg8", "asppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP8).on(S0_ASPPL.bp_grp_cd8.eq(S0_ASPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_ASPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP8.bp_grp_nm.like(bind("asppl_grp_nm8")))),
				when(boundOr("asppl_grp_flg9"))
					.select(DS0D, S0_ASPPL.bp_grp_cd9.as("asppl_grp_cd9"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd9),
				when(boundOr("asppl_grp_flg9", "asppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd9.like(bind("asppl_grp_cd9")))),
				when(boundOr("asppl_grp_flg9"))
					.select(DS0D, S0_ASPPL_GRP9.bp_grp_nm.as("asppl_grp_nm9"))
					.groupBy(DS0D, S0_ASPPL_GRP9.bp_grp_nm),
				when(boundOr("asppl_grp_flg9", "asppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP9).on(S0_ASPPL.bp_grp_cd9.eq(S0_ASPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_ASPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP9.bp_grp_nm.like(bind("asppl_grp_nm9")))),
				when(boundOr("asppl_grp_flg10"))
					.select(DS0D, S0_ASPPL.bp_grp_cd10.as("asppl_grp_cd10"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd10),
				when(boundOr("asppl_grp_flg10", "asppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd10.like(bind("asppl_grp_cd10")))),
				when(boundOr("asppl_grp_flg10"))
					.select(DS0D, S0_ASPPL_GRP10.bp_grp_nm.as("asppl_grp_nm10"))
					.groupBy(DS0D, S0_ASPPL_GRP10.bp_grp_nm),
				when(boundOr("asppl_grp_flg10", "asppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP10).on(S0_ASPPL.bp_grp_cd10.eq(S0_ASPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_ASPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP10.bp_grp_nm.like(bind("asppl_grp_nm10")))),
				when(boundOr("gd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_STK_GD).on(S0_STK_GD.gd_cd.eq(S0_T2.gd_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_STK_GD.gd_nm.like(bind("gd_nm")))),
				when(boundOr("trd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD).on(S0_TRD.trd_cd.eq(S0_T1.trd_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))),
				when(boundOr("in_to_loc_nm", "site_cd", "site_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_IN_TO_LOC).on(S0_IN_TO_LOC.loc_cd.eq(S0_T2.in_to_loc_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_IN_TO_LOC.loc_nm.like(bind("in_to_loc_nm")))),
				when(boundOr("site_cd", "site_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_IN_TO_LOC.site_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SITE.site_cd.like(bind("site_cd"))).cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("in_to_loc_wg_cd", "in_to_loc_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T2.in_to_loc_wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_WG.wg_cd.like(bind("in_to_loc_wg_cd"))).cutoff$and(S0_WG.wg_nm.like(bind("in_to_loc_wg_nm")))),
				when(boundOr("str_ln_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_STR_LN).on(S0_STR_LN.str_ln_cd.eq(S0_T2.str_ln_cd).and(S0_STR_LN.loc_cd.eq(S0_T2.in_to_loc_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(DS0D, v -> v.innerJoin(S0_TRD_CUR).on(S0_TRD_CUR.cur_cd.eq(S0_T1.trd_cur_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD_CUR.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("maker_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_MAKER).on(S0_MAKER.bp_cd.eq(S0_T2.maker_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_MAKER.bp_nm.like(bind("maker_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("ap_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_AP_DPT).on(S0_AP_DPT.dpt_cd.eq(S0_T2.ap_dpt_cd).and(S0_T1.ac_dt.between(S0_AP_DPT.st_dt, S0_AP_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_AP_DPT.dpt_nm.like(bind("ap_dpt_nm")))),
				when(boundOr("bsppl_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL).on(S0_BSPPL.bp_cd.eq(S0_ASPPL.bsppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_nm.like(bind("bsppl_nm")))),
				when(boundOr("tax_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TAX).on(S0_TAX.tax_cd.eq(S0_T2.tax_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_TAX.tax_nm.like(bind("tax_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PURC_USR).on(S0_PURC_USR.usr_cd.eq(S0_T1.purc_usr_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PURC_USR.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("purc_dpt_nm", "wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PURC_DPT).on(S0_PURC_DPT.dpt_cd.eq(S0_T1.purc_dpt_cd).and(S0_T1.ac_dt.between(S0_PURC_DPT.st_dt, S0_PURC_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PURC_DPT.dpt_nm.like(bind("purc_dpt_nm")))),
				when(boundOr("wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PURC_DPT_WG).on(S0_PURC_DPT_WG.wg_cd.eq(S0_PURC_DPT.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PURC_DPT_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("po_d_no", "po_no"))
					.view(DS0D, v -> v.innerJoin(S0_PO_D).on(S0_PO_D.po_d_no.eq(S0_T2.po_d_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_D.po_d_no.like(bind("po_d_no")))),
				when(boundOr("po_no"))
					.view(DS0D, v -> v.innerJoin(S0_PO).on(S0_PO.po_no.eq(S0_PO_D.po_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO.po_no.like(bind("po_no")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WRK_SNO).on(S0_WRK_SNO.sno1.eq(S0_T2.sno1)))
					.predicate(DS0D, p -> p.cutoff$and(S0_WRK_SNO.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_WRK_SNO.wrk_nm.like(bind("wrk_nm"))))
			);
	}
	
	/**
	 * -- MSBDL0190_MST_PURC_ACT_Query_S06
	 */
	static MCQueryPlan MSBDL0190_MST_PURC_ACT_S06() {
		MST_PURC_ACT_R S0_T1 = MST_PURC_ACT_R.create("T1");
		MCTempView S0_T2 = createTempView("T2");
		MST_PURC_RET_ACT_P_R S0_T8 = MST_PURC_RET_ACT_P_R.create("T8");
		MST_PURC_RET_ACT_D_P_R S0_T9 = MST_PURC_RET_ACT_D_P_R.create("T9");
		MST_PURC_RET_ACT_IO_P_R S0_T10 = MST_PURC_RET_ACT_IO_P_R.create("T10");
		MST_PURC_SCHD_R S0_T11 = MST_PURC_SCHD_R.create("T11");
		MST_ARR_SCHD_R S0_T12 = MST_ARR_SCHD_R.create("T12");
		MST_RCPT_IV_D_R S0_T13 = MST_RCPT_IV_D_R.create("T13");
		MST_PRMS_RCPT_D_R S0_T14 = MST_PRMS_RCPT_D_R.create("T14");
		MST_DLV_INST_D_R S0_T15 = MST_DLV_INST_D_R.create("T15");
		MST_PO_D_R S0_T16 = MST_PO_D_R.create("T16");
		MAM_BP_R S0_MDLV = MAM_BP_R.create("MDLV");
		MAM_BP_R S0_MTDLV = MAM_BP_R.create("MTDLV");
		MAM_TRD_R S0_TRD = MAM_TRD_R.create("TRD");
		MST_ARR_ACT_R S0_ARR_ACT = MST_ARR_ACT_R.create("ARR_ACT");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
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
		MAM_LOC_R S0_IN_TO_LOC = MAM_LOC_R.create("IN_TO_LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_CUR_R S0_TRD_CUR = MAM_CUR_R.create("TRD_CUR");
		MAM_BP_R S0_SPPL = MAM_BP_R.create("SPPL");
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
		MAVM_BP_NM_R S0_MAKER = MAVM_BP_NM_R.create("MAKER");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_BP_R S0_ASPPL = MAM_BP_R.create("ASPPL");
		MAM_BP_GRP_R S0_ASPPL_GRP1 = MAM_BP_GRP_R.create("ASPPL_GRP1");
		MAM_BP_GRP_R S0_ASPPL_GRP2 = MAM_BP_GRP_R.create("ASPPL_GRP2");
		MAM_BP_GRP_R S0_ASPPL_GRP3 = MAM_BP_GRP_R.create("ASPPL_GRP3");
		MAM_BP_GRP_R S0_ASPPL_GRP4 = MAM_BP_GRP_R.create("ASPPL_GRP4");
		MAM_BP_GRP_R S0_ASPPL_GRP5 = MAM_BP_GRP_R.create("ASPPL_GRP5");
		MAM_BP_GRP_R S0_ASPPL_GRP6 = MAM_BP_GRP_R.create("ASPPL_GRP6");
		MAM_BP_GRP_R S0_ASPPL_GRP7 = MAM_BP_GRP_R.create("ASPPL_GRP7");
		MAM_BP_GRP_R S0_ASPPL_GRP8 = MAM_BP_GRP_R.create("ASPPL_GRP8");
		MAM_BP_GRP_R S0_ASPPL_GRP9 = MAM_BP_GRP_R.create("ASPPL_GRP9");
		MAM_BP_GRP_R S0_ASPPL_GRP10 = MAM_BP_GRP_R.create("ASPPL_GRP10");
		MAM_DPT_R S0_AP_DPT = MAM_DPT_R.create("AP_DPT");
		MAM_BP_R S0_BSPPL = MAM_BP_R.create("BSPPL");
		MAM_TAX_R S0_TAX = MAM_TAX_R.create("TAX");
		MAM_USR_R S0_PURC_USR = MAM_USR_R.create("PURC_USR");
		MAM_DPT_R S0_PURC_DPT = MAM_DPT_R.create("PURC_DPT");
		MAM_WG_R S0_PURC_DPT_WG = MAM_WG_R.create("PURC_DPT_WG");
		MAM_STK_GD_R S0_STK_GD = MAM_STK_GD_R.create("STK_GD");
		MST_PO_R S0_PO = MST_PO_R.create("PO");
		MST_PO_D_R S0_PO_D = MST_PO_D_R.create("PO_D");
		MSVT_WRK_SNO_R S0_WRK_SNO = MSVT_WRK_SNO_R.create("WRK_SNO");
		MST_PURC_ACT_D_R S1_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_IO_R S1_T3 = MST_PURC_ACT_IO_R.create("T3");
		MST_SLO_D_R S0_T20 = MST_SLO_D_R.create("T20");
		MAVM_RD_DPT_R S2_M99 = MAVM_RD_DPT_R.create("M99");
		MST_PURC_RET_SCHD_D_R S0_PURC_RET_SCHD = MST_PURC_RET_SCHD_D_R.create("PURC_RET_SCHD");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0190_MST_PURC_ACT_Query_S06")
					.mainQuery()
					.select(
						S0_T2.pr(S1_T3.ins_usr_id),
						S0_T2.pr(S1_T3.ins_usr_nm),
						S0_T2.pr(S1_T3.ins_ts),
						S0_T2.pr(S1_T3.ins_func_id),
						S0_T2.pr(S1_T3.upd_usr_id),
						S0_T2.pr(S1_T3.upd_usr_nm),
						S0_T2.pr(S1_T3.upd_ts),
						S0_T2.pr(S1_T3.upd_func_id),
						S0_T2.pr(S1_T3.upd_srv_req_no),
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.purc_dt,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T2.pr(S1_T2.itm_cd),
						S0_T2.pr(S1_T2.itm_sub1),
						S0_T2.pr(S1_T2.itm_sub2),
						S0_T2.pr(S1_T2.itm_sub3),
						S0_T2.pr(S1_T2.itm_nm),
						S0_T2.pr(S1_T2.iv_itm_nm),
						S0_T2.pr(S1_T3.lot_no),
						S0_T2.pr(S1_T3.sublot_no),
						S0_T2.pr(S1_T3.ver_no),
						S0_T2.pr(S1_T2.purc_typ),
						S0_T2.pr(S1_T3.in_to_loc_cd),
						S0_T2.pr(S1_T3.in_to_loc_wg_cd).as("in_to_loc_wg_cd"),
						S0_T2.pr(S1_T3.str_ln_cd),
						S0_T2.pr(S1_T3.trd_unit_cd),
						S0_T2.pr(S1_T3.trd_unit_qty),
						S0_T2.pr(S1_T3.base_unit_cd),
						S0_T2.pr(S1_T3.base_unit_qty),
						S0_T1.trd_cur_cd,
						S0_T1.sppl_cd,
						S0_T1.asppl_cd,
						S0_T1.bsppl_cd,
						S0_T2.pr(S1_T2.maker_cd),
						S0_T8.ret_sppl_nm,
						S0_T2.pr(S1_T2.sppl_itm_cd),
						S0_T2.pr(S1_T2.sppl_itm_nm),
						bracket(
								cases()
									.when(S0_T16.dlv_cd.isNotNull())
										.then(S0_T20.cst_itm_cd)
									.otherwise(nullValue())
							).as("cst_itm_cd"),
						bracket(
								cases()
									.when(S0_T16.dlv_cd.isNotNull())
										.then(S0_T20.cst_itm_nm)
									.otherwise(nullValue())
							).as("cst_itm_nm"),
						S0_T2.pr(S1_T2.ap_dpt_cd),
						decode(
							S0_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.PURC_DSCNT.value()),
							value(false),
							value(MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS.value()),
							value(false),
							value(MAC_TRD_PTN_TYP.PURC_XTRA.value()),
							value(false),
							value(MAC_TRD_PTN_TYP.PURC_XTRA_XPNS.value()),
							value(false),
							value(MAC_TRD_PTN_TYP.PURC_RTN.value()),
							nvl(
								S0_PURC_RET_SCHD.tax_fix_flg,
								value(false)
							),
							value(MAC_TRD_PTN_TYP.PURC_RTN_XPNS.value()),
							nvl(
								S0_PURC_RET_SCHD.tax_fix_flg,
								value(false)
							),
							nvl2(
								S0_T13.rcpt_iv_d_no,
								S0_T13.tax_fix_flg,
								S0_T16.tax_fix_flg
							)
						).as("tax_fix_flg"),
						S0_T2.pr(S1_T2.upri_not_tgt_flg),
						S0_T2.pr(S1_T3.trd_cur_upri),
						S0_T2.pr(S1_T3.trd_cur_upri).as("old_trd_cur_upri"),
						S0_T2.pr(S1_T2.interim_flg),
						S0_T2.pr(S1_T3.trd_cur_amt),
						S0_T2.pr("trd_cur_inc_tax_amt"),
						S0_T2.pr(S1_T2.tax_cd),
						S0_T2.pr(S1_T3.trd_cur_tax_amt),
						S0_T2.pr(S1_T3.trd_cur_dscnt_amt),
						S0_T2.pr(S1_T2.dscnt_rsn_cd),
						S0_T2.pr(S1_T3.trd_cur_proc_upri),
						S0_T2.pr(S1_T3.trd_cur_proc_upri).as("old_trd_cur_proc_upri"),
						S0_T2.pr(S1_T3.trd_cur_proc_amt),
						S0_T2.pr(S1_T3.trd_cur_onr_prov_upri),
						S0_T2.pr(S1_T3.trd_cur_onr_prov_upri).as("old_trd_cur_onr_prov_upri"),
						S0_T2.pr(S1_T3.trd_cur_onr_prov_amt),
						S0_T1.xrate,
						S0_T1.base_cur_cd,
						S0_T2.pr(S1_T3.base_cur_upri),
						S0_T2.pr(S1_T3.base_cur_amt),
						S0_T2.pr("base_cur_inc_tax_amt"),
						S0_T2.pr(S1_T3.base_cur_tax_amt),
						S0_T2.pr(S1_T3.base_cur_proc_upri),
						S0_T2.pr(S1_T3.base_cur_proc_amt),
						S0_T2.pr(S1_T3.base_cur_onr_prov_upri),
						S0_T2.pr(S1_T3.base_cur_onr_prov_amt),
						S0_T2.pr(S1_T3.base_cur_dscnt_amt),
						S0_T1.ptax_xrate,
						S0_T1.ptax_cur_cd,
						S0_T2.pr(S1_T3.ptax_cur_upri),
						S0_T2.pr(S1_T3.ptax_cur_amt),
						S0_T2.pr("ptax_cur_inc_tax_amt"),
						S0_T2.pr(S1_T3.ptax_cur_tax_amt),
						S0_T2.pr(S1_T3.ptax_cur_proc_upri),
						S0_T2.pr(S1_T3.ptax_cur_proc_amt),
						S0_T2.pr(S1_T3.ptax_cur_onr_prov_upri),
						S0_T2.pr(S1_T3.ptax_cur_onr_prov_amt),
						S0_T2.pr(S1_T3.ptax_cur_dscnt_amt),
						S0_T2.pr(S1_T2.wtax_rate),
						S0_T2.pr(S1_T3.wtax_amt),
						S0_T1.ptax_dt,
						S0_T2.pr(S1_T2.pay_crryovr_times),
						S0_T1.pay_basis_dt,
						S0_T1.pay_schd_dt,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T2.pr(S1_T3.gd_cd),
						S0_T1.purc_usr_cd,
						S0_T1.purc_dpt_cd,
						S0_T2.pr(S1_T3.bp_dlv_slip_no),
						S0_T2.pr(S1_T3.bp_dlv_slip_d_no),
						S0_T2.pr(S1_T3.bp_lot_no),
						S0_T2.pr(S1_T2.po_d_no),
						S0_T2.pr(S1_T2.mfg_inst_no),
						S0_T1.rcpt_iv_no,
						S0_T2.pr(S1_T2.rcpt_iv_d_no),
						nvl(
							S0_T1.ref_rcpt_iv_no,
							S0_T8.ref_rcpt_iv_no
						).as("ref_rcpt_iv_no"),
						S0_T1.rcpt_iv_mng_no,
						S0_T1.rcpt_iv_rev,
						S0_T2.pr(S1_T2.purc_schd_no),
						S0_T2.pr(S1_T3.arr_act_no),
						S0_T2.pr(S1_T2.rsn_cd),
						S0_T2.pr(S1_T2.trd_d_rmrks),
						S0_T2.pr(S1_T2.intr_rmrks).as("intr_d_rmrks"),
						S0_T1.sub_char1.as("purc_act_sub_char1"),
						S0_T1.sub_char2.as("purc_act_sub_char2"),
						S0_T1.sub_char3.as("purc_act_sub_char3"),
						S0_T2.pr(S1_T2.sub_char1).as("purc_act_d_sub_char1"),
						S0_T2.pr(S1_T2.sub_char2).as("purc_act_d_sub_char2"),
						S0_T2.pr(S1_T2.sub_char3).as("purc_act_d_sub_char3"),
						S0_T2.pr(S1_T2.sno1),
						S0_T2.pr(S1_T2.sno2),
						S0_T2.pr(S1_T2.sno3),
						S0_T2.pr(S1_T2.sno4),
						S0_T2.pr(S1_T2.ncv_flg),
						S0_T2.pr(S1_T2.edi_flg),
						S0_T2.pr(S1_T2.sync_flg),
						S0_T2.pr(S1_T2.accpt_dfct_flg),
						S0_T2.pr(S1_T2.re_arr_flg),
						S0_T1.purc_act_no,
						S0_T1.purc_act_rev,
						S0_T2.pr(S1_T2.purc_act_d_no),
						S0_T2.pr(S1_T3.purc_act_io_no),
						S0_T2.pr(S1_T2.purc_src_typ),
						S0_T2.pr(S1_T2.purc_src_no),
						S0_T8.purc_ret_act_no,
						S0_T8.purc_ret_act_rev,
						S0_T9.purc_ret_act_d_no,
						S0_T10.purc_ret_act_io_no,
						S0_T2.pr(S1_T2.base_purc_ac_dt),
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T2.pr(S1_T2.bd_itm_cd),
						S0_T2.pr(S1_T2.bd_itm_sub1),
						S0_T2.pr(S1_T2.bd_itm_sub2),
						S0_T2.pr(S1_T2.bd_itm_sub3),
						S0_T2.pr(S1_T2.bd_sno1),
						S0_T2.pr(S1_T2.bd_sno2),
						S0_T2.pr(S1_T2.bd_sno3),
						S0_T2.pr(S1_T2.bd_sno4),
						S0_T2.pr(S1_T2.bd_loc_cd),
						S0_T2.pr(S1_T2.bd_lot_no),
						S0_T2.pr(S1_T2.bd_sublot_no),
						S0_T2.pr(S1_T2.bd_dpt_cd),
						S0_T2.pr(S1_T2.bd_ctg_cd),
						S0_T2.pr(S1_T2.bd_oper_cd),
						S0_T2.pr(S1_T2.bd_slo_no),
						S0_T2.pr(S1_T2.bd_iv_no),
						S0_T2.pr(S1_T2.bd_po_no),
						S0_T2.pr(S1_T2.disp_seq),
						S0_T2.pr(S1_T2.temp_ap_flg),
						nvl(
							S0_T15.dlv_cd,
							S0_T16.dlv_cd
						).as("dlv_cd"),
						nvl2(
							S0_T15.dlv_cd,
							nvl(
								S0_T15.dlv_nm,
								S0_MDLV.bp_nm
							),
							nvl(
								S0_T16.dlv_nm,
								S0_MDLV.bp_nm
							)
						).as("dlv_nm"),
						nvl2(
							S0_T15.dlv_cd,
							S0_T15.dlv_sundry_flg,
							S0_T16.dlv_sundry_flg
						).as("dlv_sundry_flg"),
						nvl2(
							S0_T15.dlv_cd,
							S0_T15.dlv_cntct_dpt,
							S0_T16.dlv_cntct_dpt
						).as("dlv_cntct_dpt"),
						nvl2(
							S0_T15.dlv_cd,
							S0_T15.dlv_cntct_psn,
							S0_T16.dlv_cntct_psn
						).as("dlv_cntct_psn"),
						nvl2(
							S0_T15.dlv_cd,
							S0_T15.dlv_zip_cd,
							S0_T16.dlv_zip_cd
						).as("dlv_zip_cd"),
						nvl2(
							S0_T15.dlv_cd,
							S0_T15.dlv_addr1,
							S0_T16.dlv_addr1
						).as("dlv_addr1"),
						nvl2(
							S0_T15.dlv_cd,
							S0_T15.dlv_addr2,
							S0_T16.dlv_addr2
						).as("dlv_addr2"),
						nvl2(
							S0_T15.dlv_cd,
							S0_T15.dlv_addr3,
							S0_T16.dlv_addr3
						).as("dlv_addr3"),
						nvl2(
							S0_T15.dlv_cd,
							S0_T15.dlv_addr4,
							S0_T16.dlv_addr4
						).as("dlv_addr4"),
						nvl2(
							S0_T15.dlv_cd,
							S0_T15.dlv_tel,
							S0_T16.dlv_tel
						).as("dlv_tel"),
						nvl2(
							S0_T15.dlv_cd,
							S0_T15.dlv_fax,
							S0_T16.dlv_fax
						).as("dlv_fax"),
						S0_MDLV.cntry_cd.as("dlv_cntry_cd"),
						nvl(
							S0_T15.tdlv_cd,
							S0_T16.tdlv_cd
						).as("tdlv_cd"),
						nvl2(
							S0_T15.tdlv_cd,
							nvl(
								S0_T15.tdlv_nm,
								S0_MTDLV.bp_nm
							),
							nvl(
								S0_T16.tdlv_nm,
								S0_MTDLV.bp_nm
							)
						).as("tdlv_nm"),
						nvl2(
							S0_T15.tdlv_cd,
							S0_T15.tdlv_cntct_dpt,
							S0_T16.tdlv_cntct_dpt
						).as("tdlv_cntct_dpt"),
						nvl2(
							S0_T15.tdlv_cd,
							S0_T15.tdlv_cntct_psn,
							S0_T16.tdlv_cntct_psn
						).as("tdlv_cntct_psn"),
						nvl2(
							S0_T15.tdlv_cd,
							S0_T15.tdlv_sundry_flg,
							S0_T16.tdlv_sundry_flg
						).as("tdlv_sundry_flg"),
						nvl2(
							S0_T15.tdlv_cd,
							S0_T15.tdlv_zip_cd,
							S0_T16.tdlv_zip_cd
						).as("tdlv_zip_cd"),
						nvl2(
							S0_T15.tdlv_cd,
							S0_T15.tdlv_addr1,
							S0_T16.tdlv_addr1
						).as("tdlv_addr1"),
						nvl2(
							S0_T15.tdlv_cd,
							S0_T15.tdlv_addr2,
							S0_T16.tdlv_addr2
						).as("tdlv_addr2"),
						nvl2(
							S0_T15.tdlv_cd,
							S0_T15.tdlv_addr3,
							S0_T16.tdlv_addr3
						).as("tdlv_addr3"),
						nvl2(
							S0_T15.tdlv_cd,
							S0_T15.tdlv_addr4,
							S0_T16.tdlv_addr4
						).as("tdlv_addr4"),
						nvl2(
							S0_T15.tdlv_cd,
							S0_T15.tdlv_tel,
							S0_T16.tdlv_tel
						).as("tdlv_tel"),
						nvl2(
							S0_T15.tdlv_cd,
							S0_T15.tdlv_fax,
							S0_T16.tdlv_fax
						).as("tdlv_fax"),
						S0_MTDLV.cntry_cd.as("tdlv_cntry_cd"),
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T1
						.innerJoin(
							subQuery()
							.select(
								S1_T3.ins_usr_id,
								S1_T3.ins_usr_nm,
								S1_T3.ins_ts,
								S1_T3.ins_func_id,
								S1_T3.upd_usr_id,
								S1_T3.upd_usr_nm,
								S1_T3.upd_ts,
								S1_T3.upd_func_id,
								S1_T3.upd_srv_req_no,
								S1_T2.itm_cd,
								S1_T2.itm_sub1,
								S1_T2.itm_sub2,
								S1_T2.itm_sub3,
								S1_T2.itm_nm,
								S1_T2.iv_itm_nm,
								S1_T3.lot_no,
								S1_T3.sublot_no,
								S1_T3.ver_no,
								S1_T2.purc_typ,
								S1_T3.in_to_loc_cd,
								S1_T3.in_to_loc_wg_cd,
								S1_T3.str_ln_cd,
								S1_T3.trd_unit_cd,
								S1_T3.trd_unit_qty,
								S1_T3.base_unit_cd,
								S1_T3.base_unit_qty,
								S1_T2.maker_cd,
								S1_T2.sppl_itm_cd,
								S1_T2.sppl_itm_nm,
								S1_T2.ap_dpt_cd,
								S1_T2.upri_not_tgt_flg,
								S1_T3.trd_cur_upri,
								S1_T2.interim_flg,
								S1_T3.trd_cur_amt,
								S1_T3.trd_cur_amt.add(S1_T3.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
								S1_T2.tax_cd,
								S1_T3.trd_cur_tax_amt,
								S1_T3.trd_cur_dscnt_amt,
								S1_T2.dscnt_rsn_cd,
								S1_T3.trd_cur_proc_upri,
								S1_T3.trd_cur_proc_amt,
								S1_T3.trd_cur_onr_prov_upri,
								S1_T3.trd_cur_onr_prov_amt,
								S1_T3.base_cur_upri,
								S1_T3.base_cur_amt,
								S1_T3.base_cur_amt.add(S1_T3.base_cur_tax_amt).as("base_cur_inc_tax_amt"),
								S1_T3.base_cur_tax_amt,
								S1_T3.base_cur_proc_upri,
								S1_T3.base_cur_proc_amt,
								S1_T3.base_cur_onr_prov_upri,
								S1_T3.base_cur_onr_prov_amt,
								S1_T3.base_cur_dscnt_amt,
								S1_T3.ptax_cur_upri,
								S1_T3.ptax_cur_amt,
								S1_T3.ptax_cur_amt.add(S1_T3.ptax_cur_tax_amt).as("ptax_cur_inc_tax_amt"),
								S1_T3.ptax_cur_tax_amt,
								S1_T3.ptax_cur_proc_upri,
								S1_T3.ptax_cur_proc_amt,
								S1_T3.ptax_cur_onr_prov_upri,
								S1_T3.ptax_cur_onr_prov_amt,
								S1_T3.ptax_cur_dscnt_amt,
								S1_T2.wtax_rate,
								S1_T3.wtax_amt,
								S1_T2.pay_crryovr_times,
								S1_T3.gd_cd,
								S1_T3.bp_dlv_slip_no,
								S1_T3.bp_dlv_slip_d_no,
								S1_T3.bp_lot_no,
								S1_T2.po_d_no,
								S1_T2.mfg_inst_no,
								S1_T2.rcpt_iv_d_no,
								S1_T2.purc_schd_no,
								S1_T3.arr_act_no,
								S1_T2.rsn_cd,
								S1_T2.trd_d_rmrks,
								S1_T2.intr_rmrks,
								S1_T2.sub_char1,
								S1_T2.sub_char2,
								S1_T2.sub_char3,
								S1_T2.sno1,
								S1_T2.sno2,
								S1_T2.sno3,
								S1_T2.sno4,
								S1_T2.ncv_flg,
								S1_T2.edi_flg,
								S1_T2.sync_flg,
								S1_T2.accpt_dfct_flg,
								S1_T2.re_arr_flg,
								S1_T2.purc_act_d_no,
								S1_T3.purc_act_io_no,
								S1_T2.purc_src_typ,
								S1_T2.purc_src_no,
								S1_T2.bd_itm_cd,
								S1_T2.bd_itm_sub1,
								S1_T2.bd_itm_sub2,
								S1_T2.bd_itm_sub3,
								S1_T2.bd_sno1,
								S1_T2.bd_sno2,
								S1_T2.bd_sno3,
								S1_T2.bd_sno4,
								S1_T2.bd_loc_cd,
								S1_T2.bd_lot_no,
								S1_T2.bd_sublot_no,
								S1_T2.bd_dpt_cd,
								S1_T2.bd_ctg_cd,
								S1_T2.bd_oper_cd,
								S1_T2.bd_slo_no,
								S1_T2.bd_iv_no,
								S1_T2.bd_po_no,
								S1_T2.disp_seq,
								S1_T3.purc_ret_act_io_no,
								S1_T2.purc_ret_act_d_no,
								S1_T2.purc_act_seq,
								S1_T2.purc_act_no,
								S1_T2.base_purc_ac_dt,
								S1_T2.temp_ap_flg
							)
							.from(
								S1_T2
								.innerJoin(S1_T3).on(
									S1_T2.purc_act_d_no.eq(S1_T3.purc_act_d_no)
									.and(S1_T2.purc_act_d_seq.eq(S1_T3.purc_act_d_seq))
								)
							).view(S0_T2)
						).on(
							S0_T1.purc_act_no.eq(S0_T2.pr(S1_T2.purc_act_no))
							.and(S0_T1.purc_act_seq.eq(S0_T2.pr(S1_T2.purc_act_seq)))
						)
						.leftOuterJoin(S0_T8).on(
							S0_T8.purc_ret_act_no.eq(S0_T1.purc_ret_act_no)
							.and(S0_T8.purc_ret_act_rev.eq(S0_T1.purc_ret_act_rev))
						)
						.leftOuterJoin(S0_T9).on(
							S0_T9.purc_ret_act_no.eq(S0_T8.purc_ret_act_no)
							.and(S0_T9.purc_ret_act_rev.eq(S0_T8.purc_ret_act_rev))
							.and(S0_T2.pr(S1_T2.purc_ret_act_d_no).eq(S0_T9.purc_ret_act_d_no))
						)
						.leftOuterJoin(S0_T10).on(
							S0_T10.purc_ret_act_no.eq(S0_T9.purc_ret_act_no)
							.and(S0_T10.purc_ret_act_rev.eq(S0_T9.purc_ret_act_rev))
							.and(S0_T9.purc_ret_act_d_no.eq(S0_T10.purc_ret_act_d_no))
							.and(S0_T2.pr(S1_T3.purc_ret_act_io_no).eq(S0_T10.purc_ret_act_io_no))
						)
						.leftOuterJoin(S0_PURC_RET_SCHD).on(S0_PURC_RET_SCHD.purc_ret_schd_d_no.eq(S0_T9.purc_ret_schd_d_no))
						.leftOuterJoin(S0_T11).on(S0_T11.purc_schd_no.eq(S0_T2.pr(S1_T2.purc_schd_no)))
						.leftOuterJoin(S0_T12).on(S0_T12.arr_schd_no.eq(S0_T11.arr_schd_no))
						.leftOuterJoin(S0_T13).on(S0_T13.rcpt_iv_d_no.eq(S0_T2.pr(S1_T2.rcpt_iv_d_no)))
						.leftOuterJoin(S0_T14).on(
							S0_T14.prms_rcpt_d_no.eq(nvl(
									S0_T12.prms_rcpt_d_no,
									S0_T13.ref_prms_rcpt_d_no
								)
							)
						)
						.leftOuterJoin(S0_T15).on(
							S0_T15.dlv_inst_d_no.eq(coalesce(
									S0_T12.dlv_inst_d_no,
									S0_T14.dlv_inst_d_no,
									S0_T13.ref_dlv_inst_d_no
								)
							)
						)
						.leftOuterJoin(S0_T16).on(S0_T16.po_d_no.eq(S0_T2.pr(S1_T2.po_d_no)))
						.leftOuterJoin(S0_MDLV).on(
							S0_MDLV.bp_cd.eq(nvl(
									S0_T15.dlv_cd,
									S0_T16.dlv_cd
								)
							)
						)
						.leftOuterJoin(S0_MTDLV).on(
							S0_MTDLV.bp_cd.eq(nvl(
									S0_T15.tdlv_cd,
									S0_T16.tdlv_cd
								)
							)
						)
						.leftOuterJoin(S0_T20).on
							(bracket(
									S0_T20.slo_d_no.eq(S0_T16.slo_d_no)
								)
						)
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_M99)
								.where(
									S0_T1.purc_dpt_cd.eq(S2_M99.dpt_cd)
								)
							)
						)
						.and(
							bracket(
								S0_T8.purc_ret_act_no.isNotNull()
								.and(S0_T10.purc_ret_act_no.isNotNull())
							)
							.or(S0_T8.purc_ret_act_no.isNull())
						)
						.and(
							bracket(
								S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							)
							.or(bind("tmp_dis_can_disp_flg").eq(value(true)))
						)
						.cutoff$and(S0_T1.purc_dt.gte(bind("purc_dt_from")))
						.cutoff$and(S0_T1.purc_dt.lte(bind("purc_dt_to")))
						.cutoff$and(S0_T1.ac_ym.gte(bind("ac_ym_from")))
						.cutoff$and(S0_T1.ac_ym.lte(bind("ac_ym_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_from")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T2.pr(S1_T3.in_to_loc_cd).like(bind("in_to_loc_cd")))
						.cutoff$and(S0_T2.pr(S1_T3.str_ln_cd).like(bind("str_ln_cd")))
						.cutoff$and(S0_T1.purc_usr_cd.like(bind("purc_usr_cd")))
						.cutoff$and(S0_T1.purc_dpt_cd.like(bind("purc_dpt_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T2.pr(S1_T2.ap_dpt_cd).like(bind("ap_dpt_cd")))
						.cutoff$and(S0_T2.pr(S1_T2.itm_cd).like(bind("itm_cd")))
						.cutoff$and(S0_T2.pr(S1_T2.itm_sub1).like(bind("itm_sub1")))
						.cutoff$and(S0_T2.pr(S1_T2.itm_sub2).like(bind("itm_sub2")))
						.cutoff$and(S0_T2.pr(S1_T2.itm_sub3).like(bind("itm_sub3")))
						.cutoff$and(S0_T2.pr(S1_T3.ver_no).like(bind("ver_no")))
						.cutoff$and(S0_T2.pr(S1_T3.gd_cd).like(bind("gd_cd")))
						.cutoff$and(S0_T2.pr(S1_T2.sno1).like(bind("sno1")))
						.cutoff$and(S0_T2.pr(S1_T2.sno2).like(bind("sno2")))
						.cutoff$and(S0_T2.pr(S1_T2.sno3).like(bind("sno3")))
						.cutoff$and(S0_T2.pr(S1_T2.sno4).like(bind("sno4")))
						.cutoff$and(S0_T2.pr(S1_T2.maker_cd).like(bind("maker_cd")))
						.cutoff$and(S0_T2.pr(S1_T2.sppl_itm_cd).like(bind("sppl_itm_cd")))
						.cutoff$and(S0_T2.pr(S1_T2.sppl_itm_nm).like(bind("sppl_itm_nm")))
						.cutoff$and(S0_T2.pr(S1_T3.lot_no).like(bind("lot_no")))
						.cutoff$and(S0_T2.pr(S1_T3.sublot_no).like(bind("sublot_no")))
						.cutoff$and(S0_T2.pr(S1_T3.bp_lot_no).like(bind("bp_lot_no")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.purc_act_no.like(bind("purc_act_no")))
						.cutoff$and(S0_T2.pr(S1_T2.purc_act_d_no).like(bind("purc_act_d_no")))
						.cutoff$and(S0_T2.pr(S1_T2.purc_src_typ).like(bind("purc_src_typ")))
						.cutoff$and(S0_T2.pr(S1_T2.purc_src_no).like(bind("purc_src_no")))
						.cutoff$and(S0_T2.pr(S1_T3.arr_act_no).like(bind("arr_act_no")))
						.cutoff$and(S0_T8.purc_ret_act_no.like(bind("purc_ret_act_no")))
						.cutoff$and(S0_T9.purc_ret_act_d_no.like(bind("purc_ret_act_d_no")))
						.cutoff$and(S0_T1.base_cur_cd.notLike(bind("tmp_base_cur_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T2.pr(S1_T2.tax_cd).like(bind("tax_cd")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T2.pr(S1_T2.intr_rmrks).like(bind("dtl_intr_rmrks")))
						.cutoff$and(S0_T2.pr(S1_T2.trd_d_rmrks).like(bind("dtl_trd_d_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.pr(S1_T2.sub_char1).like(bind("dtl_sub_char1")))
						.cutoff$and(S0_T2.pr(S1_T2.sub_char2).like(bind("dtl_sub_char2")))
						.cutoff$and(S0_T2.pr(S1_T2.sub_char3).like(bind("dtl_sub_char3")))
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
						.cutoff$and(S0_T2.pr(S1_T2.rcpt_iv_d_no).like(bind("rcpt_iv_d_no")))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_xpns")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_vmi")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_dscnt")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_dscnt_xpns")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_xtra")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_xtra_xpns")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_rtn")))
							.cutoff$or(S0_T1.trd_ptn_typ.eq(bind("tmp_trd_ptn_purc_rtn_xpns")))
						)
						.cutoff$and(S0_T2.pr(S1_T2.interim_flg).eq(bind("tmp_interim")))
						.cutoff$and(
							bind("tmp_foreign").eq(value(true))
							.and(S0_T1.trd_cur_cd.neq(S0_T1.base_cur_cd))
						)
						.cutoff$and(
							nvl(
								S0_T15.dlv_cd,
								S0_T16.dlv_cd
							).like(bind("dlv_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T15.dlv_cd,
								nvl(
									S0_T15.dlv_nm,
									S0_MDLV.bp_nm
								),
								nvl(
									S0_T16.dlv_nm,
									S0_MDLV.bp_nm
								)
							).like(bind("dlv_nm"))
						)
						.cutoff$and(
							nvl(
								S0_T15.tdlv_cd,
								S0_T16.tdlv_cd
							).like(bind("tdlv_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T15.tdlv_cd,
								nvl(
									S0_T15.tdlv_nm,
									S0_MTDLV.bp_nm
								),
								nvl(
									S0_T16.tdlv_nm,
									S0_MTDLV.bp_nm
								)
							).like(bind("tdlv_nm"))
						)

						.and(
							S0_T2.pr(S1_T2.temp_ap_flg).eq(value(false))
							.or(
								bind("incl_temp_ap_flg").eq(value(true))
								.and(S0_T2.pr(S1_T2.temp_ap_flg).eq(value(true)))
							)
						)
						.cutoff$and(S0_T20.cst_itm_cd.like(bind("cst_itm_cd"))
								.and(S0_T16.dlv_cd.isNotNull()))
						.cutoff$and(S0_T20.cst_itm_nm.like(bind("cst_itm_nm"))
								.and(S0_T16.dlv_cd.isNotNull()))
					)
					.orderBy(
						S0_T1.purc_act_no.asc(),
						S0_T1.purc_act_rev.asc(),
						S0_T2.pr(S1_T2.disp_seq).asc(),
						S0_T2.pr(S1_T3.purc_act_io_no).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM).on(S0_ITM.itm_cd.eq(S0_T2.pr(S1_T2.itm_cd)).and(S0_ITM.itm_sub1.eq(S0_T2.pr(S1_T2.itm_sub1))).and(S0_ITM.itm_sub2.eq(S0_T2.pr(S1_T2.itm_sub2))).and(S0_ITM.itm_sub3.eq(S0_T2.pr(S1_T2.itm_sub3)))))
					.predicate(DS0D, p -> p.cutoff$and(nvl(S0_T2.pr(S1_T2.itm_nm),S0_ITM.itm_nm).like(bind("itm_nm"))).cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1", "itm_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS0D, S0_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2", "itm_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS0D, S0_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3", "itm_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS0D, S0_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4", "itm_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS0D, S0_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5", "itm_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS0D, S0_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6", "itm_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS0D, S0_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7", "itm_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS0D, S0_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8", "itm_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS0D, S0_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9", "itm_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS0D, S0_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS0D, S0_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10", "itm_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS0D, S0_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("gd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_STK_GD).on(S0_STK_GD.gd_cd.eq(S0_T2.pr(S1_T3.gd_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_STK_GD.gd_nm.like(bind("gd_nm")))),
				when(boundOr("sppl_nm", "tmp_iv_trgt", "tmp_subcon", "asppl_cd", "asppl_nm", "bsppl_cd", "bsppl_nm", "sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "asppl_grp_flg1", "asppl_grp_flg2", "asppl_grp_flg3", "asppl_grp_flg4", "asppl_grp_flg5", "asppl_grp_flg6", "asppl_grp_flg7", "asppl_grp_flg8", "asppl_grp_flg9", "asppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL).on(S0_SPPL.bp_cd.eq(S0_T1.sppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_nm.like(bind("sppl_nm"))).cutoff$and(S0_SPPL.sppl_iv_flg.eq(bind("tmp_iv_trgt"))).cutoff$and(S0_SPPL.subcon_flg.eq(bind("tmp_subcon")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL.bp_grp_cd1.as("sppl_grp_cd1"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd1),
				when(boundOr("sppl_grp_flg1", "sppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.groupBy(DS0D, S0_SPPL_GRP1.bp_grp_nm),
				when(boundOr("sppl_grp_flg1", "sppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP1).on(S0_SPPL.bp_grp_cd1.eq(S0_SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_SPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL.bp_grp_cd2.as("sppl_grp_cd2"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd2),
				when(boundOr("sppl_grp_flg2", "sppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.groupBy(DS0D, S0_SPPL_GRP2.bp_grp_nm),
				when(boundOr("sppl_grp_flg2", "sppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP2).on(S0_SPPL.bp_grp_cd2.eq(S0_SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_SPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL.bp_grp_cd3.as("sppl_grp_cd3"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd3),
				when(boundOr("sppl_grp_flg3", "sppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.groupBy(DS0D, S0_SPPL_GRP3.bp_grp_nm),
				when(boundOr("sppl_grp_flg3", "sppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP3).on(S0_SPPL.bp_grp_cd3.eq(S0_SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_SPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL.bp_grp_cd4.as("sppl_grp_cd4"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd4),
				when(boundOr("sppl_grp_flg4", "sppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.groupBy(DS0D, S0_SPPL_GRP4.bp_grp_nm),
				when(boundOr("sppl_grp_flg4", "sppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP4).on(S0_SPPL.bp_grp_cd4.eq(S0_SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_SPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL.bp_grp_cd5.as("sppl_grp_cd5"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd5),
				when(boundOr("sppl_grp_flg5", "sppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.groupBy(DS0D, S0_SPPL_GRP5.bp_grp_nm),
				when(boundOr("sppl_grp_flg5", "sppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP5).on(S0_SPPL.bp_grp_cd5.eq(S0_SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_SPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL.bp_grp_cd6.as("sppl_grp_cd6"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd6),
				when(boundOr("sppl_grp_flg6", "sppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.groupBy(DS0D, S0_SPPL_GRP6.bp_grp_nm),
				when(boundOr("sppl_grp_flg6", "sppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP6).on(S0_SPPL.bp_grp_cd6.eq(S0_SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_SPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL.bp_grp_cd7.as("sppl_grp_cd7"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd7),
				when(boundOr("sppl_grp_flg7", "sppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.groupBy(DS0D, S0_SPPL_GRP7.bp_grp_nm),
				when(boundOr("sppl_grp_flg7", "sppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP7).on(S0_SPPL.bp_grp_cd7.eq(S0_SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_SPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL.bp_grp_cd8.as("sppl_grp_cd8"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd8),
				when(boundOr("sppl_grp_flg8", "sppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.groupBy(DS0D, S0_SPPL_GRP8.bp_grp_nm),
				when(boundOr("sppl_grp_flg8", "sppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP8).on(S0_SPPL.bp_grp_cd8.eq(S0_SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_SPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL.bp_grp_cd9.as("sppl_grp_cd9"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd9),
				when(boundOr("sppl_grp_flg9", "sppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.groupBy(DS0D, S0_SPPL_GRP9.bp_grp_nm),
				when(boundOr("sppl_grp_flg9", "sppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP9).on(S0_SPPL.bp_grp_cd9.eq(S0_SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_SPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL.bp_grp_cd10.as("sppl_grp_cd10"))
					.groupBy(DS0D, S0_SPPL.bp_grp_cd10),
				when(boundOr("sppl_grp_flg10", "sppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.groupBy(DS0D, S0_SPPL_GRP10.bp_grp_nm),
				when(boundOr("sppl_grp_flg10", "sppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SPPL_GRP10).on(S0_SPPL.bp_grp_cd10.eq(S0_SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_SPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("asppl_cd", "asppl_nm", "bsppl_cd", "bsppl_nm", "asppl_grp_flg1", "asppl_grp_flg2", "asppl_grp_flg3", "asppl_grp_flg4", "asppl_grp_flg5", "asppl_grp_flg6", "asppl_grp_flg7", "asppl_grp_flg8", "asppl_grp_flg9", "asppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL).on(S0_ASPPL.bp_cd.eq(S0_SPPL.asppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_cd.like(bind("asppl_cd"))).cutoff$and(S0_ASPPL.bp_nm.like(bind("asppl_nm"))).cutoff$and(S0_ASPPL.bsppl_cd.like(bind("bsppl_cd")))),
				when(boundOr("asppl_grp_flg1"))
					.select(DS0D, S0_ASPPL.bp_grp_cd1.as("asppl_grp_cd1"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd1),
				when(boundOr("asppl_grp_flg1", "asppl_grp_cd1"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd1.like(bind("asppl_grp_cd1")))),
				when(boundOr("asppl_grp_flg1"))
					.select(DS0D, S0_ASPPL_GRP1.bp_grp_nm.as("asppl_grp_nm1"))
					.groupBy(DS0D, S0_ASPPL_GRP1.bp_grp_nm),
				when(boundOr("asppl_grp_flg1", "asppl_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP1).on(S0_ASPPL.bp_grp_cd1.eq(S0_ASPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_ASPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP1.bp_grp_nm.like(bind("asppl_grp_nm1")))),
				when(boundOr("asppl_grp_flg2"))
					.select(DS0D, S0_ASPPL.bp_grp_cd2.as("asppl_grp_cd2"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd2),
				when(boundOr("asppl_grp_flg2", "asppl_grp_cd2"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd2.like(bind("asppl_grp_cd2")))),
				when(boundOr("asppl_grp_flg2"))
					.select(DS0D, S0_ASPPL_GRP2.bp_grp_nm.as("asppl_grp_nm2"))
					.groupBy(DS0D, S0_ASPPL_GRP2.bp_grp_nm),
				when(boundOr("asppl_grp_flg2", "asppl_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP2).on(S0_ASPPL.bp_grp_cd2.eq(S0_ASPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_ASPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP2.bp_grp_nm.like(bind("asppl_grp_nm2")))),
				when(boundOr("asppl_grp_flg3"))
					.select(DS0D, S0_ASPPL.bp_grp_cd3.as("asppl_grp_cd3"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd3),
				when(boundOr("asppl_grp_flg3", "asppl_grp_cd3"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd3.like(bind("asppl_grp_cd3")))),
				when(boundOr("asppl_grp_flg3"))
					.select(DS0D, S0_ASPPL_GRP3.bp_grp_nm.as("asppl_grp_nm3"))
					.groupBy(DS0D, S0_ASPPL_GRP3.bp_grp_nm),
				when(boundOr("asppl_grp_flg3", "asppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP3).on(S0_ASPPL.bp_grp_cd3.eq(S0_ASPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_ASPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP3.bp_grp_nm.like(bind("asppl_grp_nm3")))),
				when(boundOr("asppl_grp_flg4"))
					.select(DS0D, S0_ASPPL.bp_grp_cd4.as("asppl_grp_cd4"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd4),
				when(boundOr("asppl_grp_flg4", "asppl_grp_cd4"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd4.like(bind("asppl_grp_cd4")))),
				when(boundOr("asppl_grp_flg4"))
					.select(DS0D, S0_ASPPL_GRP4.bp_grp_nm.as("asppl_grp_nm4"))
					.groupBy(DS0D, S0_ASPPL_GRP4.bp_grp_nm),
				when(boundOr("asppl_grp_flg4", "asppl_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP4).on(S0_ASPPL.bp_grp_cd4.eq(S0_ASPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_ASPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP4.bp_grp_nm.like(bind("asppl_grp_nm4")))),
				when(boundOr("asppl_grp_flg5"))
					.select(DS0D, S0_ASPPL.bp_grp_cd5.as("asppl_grp_cd5"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd5),
				when(boundOr("asppl_grp_flg5", "asppl_grp_cd5"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd5.like(bind("asppl_grp_cd5")))),
				when(boundOr("asppl_grp_flg5"))
					.select(DS0D, S0_ASPPL_GRP5.bp_grp_nm.as("asppl_grp_nm5"))
					.groupBy(DS0D, S0_ASPPL_GRP5.bp_grp_nm),
				when(boundOr("asppl_grp_flg5", "asppl_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP5).on(S0_ASPPL.bp_grp_cd5.eq(S0_ASPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_ASPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP5.bp_grp_nm.like(bind("asppl_grp_nm5")))),
				when(boundOr("asppl_grp_flg6"))
					.select(DS0D, S0_ASPPL.bp_grp_cd6.as("asppl_grp_cd6"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd6),
				when(boundOr("asppl_grp_flg6", "asppl_grp_cd6"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd6.like(bind("asppl_grp_cd6")))),
				when(boundOr("asppl_grp_flg6"))
					.select(DS0D, S0_ASPPL_GRP6.bp_grp_nm.as("asppl_grp_nm6"))
					.groupBy(DS0D, S0_ASPPL_GRP6.bp_grp_nm),
				when(boundOr("asppl_grp_flg6", "asppl_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP6).on(S0_ASPPL.bp_grp_cd6.eq(S0_ASPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_ASPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP6.bp_grp_nm.like(bind("asppl_grp_nm6")))),
				when(boundOr("asppl_grp_flg7"))
					.select(DS0D, S0_ASPPL.bp_grp_cd7.as("asppl_grp_cd7"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd7),
				when(boundOr("asppl_grp_flg7", "asppl_grp_cd7"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd7.like(bind("asppl_grp_cd7")))),
				when(boundOr("asppl_grp_flg7"))
					.select(DS0D, S0_ASPPL_GRP7.bp_grp_nm.as("asppl_grp_nm7"))
					.groupBy(DS0D, S0_ASPPL_GRP7.bp_grp_nm),
				when(boundOr("asppl_grp_flg7", "asppl_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP7).on(S0_ASPPL.bp_grp_cd7.eq(S0_ASPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_ASPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP7.bp_grp_nm.like(bind("asppl_grp_nm7")))),
				when(boundOr("asppl_grp_flg8"))
					.select(DS0D, S0_ASPPL.bp_grp_cd8.as("asppl_grp_cd8"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd8),
				when(boundOr("asppl_grp_flg8", "asppl_grp_cd8"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd8.like(bind("asppl_grp_cd8")))),
				when(boundOr("asppl_grp_flg8"))
					.select(DS0D, S0_ASPPL_GRP8.bp_grp_nm.as("asppl_grp_nm8"))
					.groupBy(DS0D, S0_ASPPL_GRP8.bp_grp_nm),
				when(boundOr("asppl_grp_flg8", "asppl_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP8).on(S0_ASPPL.bp_grp_cd8.eq(S0_ASPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_ASPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP8.bp_grp_nm.like(bind("asppl_grp_nm8")))),
				when(boundOr("asppl_grp_flg9"))
					.select(DS0D, S0_ASPPL.bp_grp_cd9.as("asppl_grp_cd9"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd9),
				when(boundOr("asppl_grp_flg9", "asppl_grp_cd9"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd9.like(bind("asppl_grp_cd9")))),
				when(boundOr("asppl_grp_flg9"))
					.select(DS0D, S0_ASPPL_GRP9.bp_grp_nm.as("asppl_grp_nm9"))
					.groupBy(DS0D, S0_ASPPL_GRP9.bp_grp_nm),
				when(boundOr("asppl_grp_flg9", "asppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP9).on(S0_ASPPL.bp_grp_cd9.eq(S0_ASPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_ASPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP9.bp_grp_nm.like(bind("asppl_grp_nm9")))),
				when(boundOr("asppl_grp_flg10"))
					.select(DS0D, S0_ASPPL.bp_grp_cd10.as("asppl_grp_cd10"))
					.groupBy(DS0D, S0_ASPPL.bp_grp_cd10),
				when(boundOr("asppl_grp_flg10", "asppl_grp_cd10"))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL.bp_grp_cd10.like(bind("asppl_grp_cd10")))),
				when(boundOr("asppl_grp_flg10"))
					.select(DS0D, S0_ASPPL_GRP10.bp_grp_nm.as("asppl_grp_nm10"))
					.groupBy(DS0D, S0_ASPPL_GRP10.bp_grp_nm),
				when(boundOr("asppl_grp_flg10", "asppl_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP10).on(S0_ASPPL.bp_grp_cd10.eq(S0_ASPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_ASPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP10.bp_grp_nm.like(bind("asppl_grp_nm10")))),
				when(boundOr("trd_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TRD).on(S0_TRD.trd_cd.eq(S0_T1.trd_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD.trd_nm.like(bind("trd_nm")))),
				when(boundOr("arr_hm_fr", "arr_hm_to", "edi_bp_dlv_slip_no"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ARR_ACT).on(S0_ARR_ACT.arr_act_no.eq(S0_T2.pr(S1_T3.arr_act_no))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ARR_ACT.arr_tm.gte(bind("arr_hm_fr"))).cutoff$and(S0_ARR_ACT.arr_tm.lte(bind("arr_hm_to"))).cutoff$and(S0_ARR_ACT.edi_bp_dlv_slip_no.like(bind("edi_bp_dlv_slip_no")))),
				when(boundOr("in_to_loc_nm", "site_cd", "site_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_IN_TO_LOC).on(S0_IN_TO_LOC.loc_cd.eq(S0_T2.pr(S1_T3.in_to_loc_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_IN_TO_LOC.loc_nm.like(bind("in_to_loc_nm")))),
				when(boundOr("site_cd", "site_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_IN_TO_LOC.site_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_SITE.site_cd.like(bind("site_cd"))).cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("in_to_loc_wg_cd", "in_to_loc_wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T2.pr(S1_T3.in_to_loc_wg_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_WG.wg_cd.like(bind("in_to_loc_wg_cd"))).cutoff$and(S0_WG.wg_nm.like(bind("in_to_loc_wg_nm")))),
				when(boundOr("str_ln_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_STR_LN).on(S0_STR_LN.str_ln_cd.eq(S0_T2.pr(S1_T3.str_ln_cd)).and(S0_STR_LN.loc_cd.eq(S0_T2.pr(S1_T3.in_to_loc_cd)))))
					.predicate(DS0D, p -> p.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(DS0D, v -> v.innerJoin(S0_TRD_CUR).on(S0_TRD_CUR.cur_cd.eq(S0_T1.trd_cur_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_TRD_CUR.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("maker_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_MAKER).on(S0_MAKER.bp_cd.eq(S0_T2.pr(S1_T2.maker_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_MAKER.bp_nm.like(bind("maker_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("ap_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_AP_DPT).on(S0_AP_DPT.dpt_cd.eq(S0_T2.pr(S1_T2.ap_dpt_cd)).and(S0_T1.ac_dt.between(S0_AP_DPT.st_dt, S0_AP_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_AP_DPT.dpt_nm.like(bind("ap_dpt_nm")))),
				when(boundOr("bsppl_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL).on(S0_BSPPL.bp_cd.eq(S0_ASPPL.bsppl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_nm.like(bind("bsppl_nm")))),
				when(boundOr("tax_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_TAX).on(S0_TAX.tax_cd.eq(S0_T2.pr(S1_T2.tax_cd))))
					.predicate(DS0D, p -> p.cutoff$and(S0_TAX.tax_nm.like(bind("tax_nm")))),
				when(boundOr("purc_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PURC_USR).on(S0_PURC_USR.usr_cd.eq(S0_T1.purc_usr_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PURC_USR.usr_nm.like(bind("purc_usr_nm")))),
				when(boundOr("purc_dpt_nm", "wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PURC_DPT).on(S0_PURC_DPT.dpt_cd.eq(S0_T1.purc_dpt_cd).and(S0_T1.ac_dt.between(S0_PURC_DPT.st_dt, S0_PURC_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PURC_DPT.dpt_nm.like(bind("purc_dpt_nm")))),
				when(boundOr("wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PURC_DPT_WG).on(S0_PURC_DPT_WG.wg_cd.eq(S0_PURC_DPT.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PURC_DPT_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("po_d_no", "po_no"))
					.view(DS0D, v -> v.innerJoin(S0_PO_D).on(S0_PO_D.po_d_no.eq(S0_T2.pr(S1_T2.po_d_no))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_D.po_d_no.like(bind("po_d_no")))),
				when(boundOr("po_no"))
					.view(DS0D, v -> v.innerJoin(S0_PO).on(S0_PO.po_no.eq(S0_PO_D.po_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO.po_no.like(bind("po_no")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WRK_SNO).on(S0_WRK_SNO.sno1.eq(S0_T2.pr(S1_T2.sno1))))
					.predicate(DS0D, p -> p.cutoff$and(S0_WRK_SNO.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_WRK_SNO.wrk_nm.like(bind("wrk_nm"))))
			);
	}
	
	static MCJoinerList<Srch01_DtlR> MSBDL0190_Srch01_DtlR_J01() {
		return joinInfo(
			j -> j
				.add(MAM_TRD_R.class, r -> toCondition(
					r.trd_cd()
				))
				.addSelect(m -> toArray(
					m.trd_nm
				))
				.addMap((r, m) -> {
					r.trd_nm(m.trd_nm());
				}),
			j -> j
				.add(MST_ARR_ACT_R.class, r -> toCondition(
					r.arr_act_no()
				))
				.addSelect(m -> toArray(
					m.arr_tm,
					m.purc_cont_qty
				))
				.addMap((r, m) -> {
					r.arr_dt(m.arr_tm());
					r.arr_hm(m.arr_tm());
					r.purc_cont_qty(m.purc_cont_qty());
				}),
			j -> j
				.add(MAM_ITM_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()
				))
				.addSelect(m -> toArray(
					m.asset_mng_typ,
					m.cont_fctr_dec_place,
					m.cont_fctr_flg,
					m.cont_fctr_rnd_typ,
					m.cont_fctr_unit_cd,
					m.dscnt_itm_flg,
					m.itm_nm,
					m.itm_typ,
					m.itm_typ_d_cd,
					m.std_cont_fctr,
					m.sundry_itm_flg,
					m.ver_flg
				))
				.addMap((r, m) -> {
					r.sundry_itm_flg(m.sundry_itm_flg());
					r.itm_nm_itm(m.itm_nm());
					r.asset_mng_typ(m.asset_mng_typ());
					r.dscnt_itm_flg(m.dscnt_itm_flg());
					r.ver_flg(m.ver_flg());
					r.std_cont_fctr(m.std_cont_fctr());
					r.cont_fctr_unit_cd(m.cont_fctr_unit_cd());
					r.cont_fctr_flg(m.cont_fctr_flg());
					r.cont_fctr_rnd_typ(m.cont_fctr_rnd_typ());
					r.cont_fctr_dec_place(m.cont_fctr_dec_place());
					r.itm_typ(m.itm_typ());
					r.itm_typ_d_cd(m.itm_typ_d_cd());
					r.setStringNE("join_itm_typ_", m.itm_typ());
					r.setStringNE("join_itm_typ_d_cd_", m.itm_typ_d_cd());
				}),
			j -> j
				.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
					r.getStringNE("join_itm_typ_"), r.getStringNE("join_itm_typ_d_cd_")
				))
				.addSelect(m -> toArray(
					m.itm_typ_d_nm
				))
				.addMap((r, m) -> {
					r.itm_typ_d_nm(m.itm_typ_d_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.sppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.prnt_lcl_cd,
					m.purc_amt_rnd_typ,
					m.purc_tax_calc_typ,
					m.purc_tax_rnd_typ,
					m.sppl_cal_cd,
					m.sppl_iv_flg,
					m.repurc_obli_flg,
					m.outsrc_upri_typ
				))
				.addMap((r, m) -> {
					r.lcl_cd(m.prnt_lcl_cd());
					r.sppl_nm(m.bp_nm());
					r.sppl_cal_cd(m.sppl_cal_cd());
					r.purc_amt_rnd_typ(m.purc_amt_rnd_typ());
					r.purc_tax_rnd_typ(m.purc_tax_rnd_typ());
					r.purc_tax_calc_typ(m.purc_tax_calc_typ());
					r.sppl_iv_flg(m.sppl_iv_flg());
					if(MAC_PURC_TYP.isOUTSRC_ITM_FFR(r.getStringNE("purc_typ"))|| MAC_PURC_TYP.isOUTSRC_ITM_ONR_SS(r.getStringNE("purc_typ"))) {
						r.repurc_obli_flg(m.repurc_obli_flg());
						r.outsrc_upri_typ(m.outsrc_upri_typ() == null ? getCo().outsrc_upri_typ() : m.outsrc_upri_typ());
					} else {
						r.repurc_obli_flg(false);
						r.outsrc_upri_typ(null);
					}
				}),
			j -> j
				.add(MAM_LOC_R.class, r -> toCondition(
					r.in_to_loc_cd()
				))
				.addSelect(m -> toArray(
					m.cal_cd,
					m.lg_grp_cd,
					m.loc_nm,
					m.site_cd,
					m.sppl_cd,
					m.str_ln_tgt_flg
				))
				.addMap((r, m) -> {
					r.in_to_loc_nm(m.loc_nm());
					r.site_cd(m.site_cd());
					r.in_to_loc_cal_cd(m.cal_cd());
					r.outsrc_sppl_cd(m.sppl_cd());
					r.lg_grp_cd(m.lg_grp_cd());
					r.str_ln_tgt_flg(m.str_ln_tgt_flg());
					r.setStringNE("join_site_cd_", m.site_cd());
				}),
			j -> j
				.add(MAM_SITE_R.class, r -> toCondition(
					r.getStringNE("join_site_cd_")
				))
				.addSelect(m -> toArray(
					m.site_nm
				))
				.addMap((r, m) -> {
					r.site_nm(m.site_nm());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.in_to_loc_wg_cd()
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.in_to_loc_wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MAM_STR_LN_R.class, r -> toCondition(
					r.in_to_loc_cd(), r.str_ln_cd()
				))
				.addSelect(m -> toArray(
					m.str_ln_nm
				))
				.addMap((r, m) -> {
					r.str_ln_nm(m.str_ln_nm());
				}),
			j -> j
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.conv_base_qty,
					m.conv_qty,
					m.unit_cd
				))
				.addMap((r, m) -> {
					r.trd_unit_conv_base_qty(m.conv_base_qty());
					r.trd_unit_conv_qty(m.conv_qty());
					r.setStringNE("join_unit_cd_", m.unit_cd());
				}),
			j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.getStringNE("join_unit_cd_")
				))
				.addSelect(m -> toArray(
					m.dec_place,
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.trd_unit_nm(m.unit_nm());
					r.trd_unit_dec_place(m.dec_place());
				}),
			j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.base_unit_cd()
				))
				.addSelect(m -> toArray(
					m.dec_place,
					m.rnd_typ,
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.base_unit_nm(m.unit_nm());
					r.base_unit_dec_place(m.dec_place());
					r.base_unit_rnd_typ(m.rnd_typ());
				}),
			j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.cont_fctr_unit_cd()
				))
				.addSelect(m -> toArray(
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.cont_fctr_unit_nm(m.unit_nm());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.trd_cur_cd()
				))
				.addSelect(m -> toArray(
					m.amt_dec_place,
					m.cur_nm,
					m.upri_dec_place
				))
				.addMap((r, m) -> {
					r.trd_cur_nm(m.cur_nm());
					r.trd_cur_amt_dec_place(m.amt_dec_place());
					r.trd_cur_upri_dec_place(m.upri_dec_place());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.maker_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.maker_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.asppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.asppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.ap_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.ap_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.bsppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.pay_spot_flg
				))
				.addMap((r, m) -> {
					r.bsppl_nm(m.bp_nm());
					r.pay_spot_flg(m.pay_spot_flg());
				}),
			j -> j
				.add(MAM_TAX_R.class, r -> toCondition(
					r.tax_cd()
				))
				.addSelect(m -> toArray(
					m.inc_tax_flg,
					m.tax_nm,
					m.tax_rate,
					m.tax_typ
				))
				.addMap((r, m) -> {
					r.tax_nm(m.tax_nm());
					r.tax_rate(m.tax_rate());
					r.tax_typ(m.tax_typ());
					r.inc_tax_flg(m.inc_tax_flg());
				}),
			j -> j
				.add(MAM_BIZ_RSN_R.class, r -> toCondition(
					r.dscnt_rsn_cd()
				))
				.addSelect(m -> toArray(
					m.biz_rsn_nm
				))
				.addMap((r, m) -> {
					r.dscnt_rsn_nm(m.biz_rsn_nm());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.base_cur_cd()
				))
				.addSelect(m -> toArray(
					m.amt_dec_place,
					m.cur_nm,
					m.upri_dec_place
				))
				.addMap((r, m) -> {
					r.base_cur_nm(m.cur_nm());
					r.base_cur_amt_dec_place(m.amt_dec_place());
					r.base_cur_upri_dec_place(m.upri_dec_place());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.ptax_cur_cd()
				))
				.addSelect(m -> toArray(
					m.amt_dec_place,
					m.cur_nm,
					m.upri_dec_place
				))
				.addMap((r, m) -> {
					r.ptax_cur_nm(m.cur_nm());
					r.ptax_cur_amt_dec_place(m.amt_dec_place());
					r.ptax_cur_upri_dec_place(m.upri_dec_place());
				}),
			j -> j
				.add(MAM_CNTRY_R.class, r -> toCondition(
					r.dlv_cntry_cd()
				))
				.addSelect(m -> toArray(
					m.cntry_nm
				))
				.addMap((r, m) -> {
					r.dlv_cntry_nm(m.cntry_nm());
				}),
			j -> j
				.add(MAM_CNTRY_R.class, r -> toCondition(
					r.tdlv_cntry_cd()
				))
				.addSelect(m -> toArray(
					m.cntry_nm
				))
				.addMap((r, m) -> {
					r.tdlv_cntry_nm(m.cntry_nm());
				}),
			j -> j
				.add(MAM_USR_R.class, r -> toCondition(
					r.purc_usr_cd()
				))
				.addSelect(m -> toArray(
					m.usr_nm
				))
				.addMap((r, m) -> {
					r.purc_usr_nm(m.usr_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.purc_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm,
					m.wg_cd
				))
				.addMap((r, m) -> {
					r.purc_dpt_nm(m.dpt_nm());
					r.purc_dpt_wg_cd(m.wg_cd());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.purc_dpt_wg_cd()
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.purc_dpt_wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MAM_BIZ_RSN_R.class, r -> toCondition(
					r.rsn_cd()
				))
				.addSelect(m -> toArray(
					m.biz_rsn_nm,
					m.purc_dscnt_loc_mng_typ,
					m.xpns_purc_flg
				))
				.addMap((r, m) -> {
					r.rsn_nm(m.biz_rsn_nm());
					r.xpns_purc_flg(m.xpns_purc_flg());
					r.purc_dscnt_loc_mng_typ(m.purc_dscnt_loc_mng_typ());
				}),
			j -> j
				.add(MSVT_WRK_SNO_R.class, r -> toCondition(
					r.sno1()
				))
				.addSelect(m -> toArray(
					m.wrk_nm,
					m.wrk_no
				))
				.addMap((r, m) -> {
					r.wrk_no(m.wrk_no());
					r.wrk_nm(m.wrk_nm());
				}),
			j -> j
				.add(MAM_ITM_R.class, r -> toCondition(
					r.bd_itm_cd(), r.bd_itm_sub1(), r.bd_itm_sub2(), r.bd_itm_sub3()
				))
				.addSelect(m -> toArray(
					m.itm_nm,
					m.lot_mng_typ,
					m.lot_no_typ,
					m.sno1_mng_typ,
					m.sno2_mng_typ,
					m.sno3_mng_typ,
					m.sno4_mng_typ,
					m.sublot_mng_typ,
					m.sublot_no_typ
				))
				.addMap((r, m) -> {
					r.bd_itm_nm(m.itm_nm());
					r.bd_lot_mng_typ(m.lot_mng_typ());
					r.bd_sublot_mng_typ(m.sublot_mng_typ());
					r.bd_lot_no_typ(m.lot_no_typ());
					r.bd_sublot_no_typ(m.sublot_no_typ());
					r.bd_sno1_mng_typ(m.sno1_mng_typ());
					r.bd_sno2_mng_typ(m.sno2_mng_typ());
					r.bd_sno3_mng_typ(m.sno3_mng_typ());
					r.bd_sno4_mng_typ(m.sno4_mng_typ());
				}),
			j -> j
				.add(MAM_LOC_R.class, r -> toCondition(
					r.bd_loc_cd()
				))
				.addSelect(m -> toArray(
					m.loc_nm
				))
				.addMap((r, m) -> {
					r.bd_loc_nm(m.loc_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.bd_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.bd_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAM_COST_CTG_R.class, r -> toCondition(
					r.bd_ctg_cd()
				))
				.addSelect(m -> toArray(
					m.ctg_nm
				))
				.addMap((r, m) -> {
					r.bd_ctg_nm(m.ctg_nm());
				}),
			j -> j
				.add(MAM_OPER_R.class, r -> toCondition(
					r.bd_oper_cd()
				))
				.addSelect(m -> toArray(
					m.oper_nm
				))
				.addMap((r, m) -> {
					r.bd_oper_nm(m.oper_nm());
				}),
			j -> j
				.add(MAM_TTERM_R.class, r -> toCondition(
					r.tterm_cd1()
				))
				.addSelect(m -> toArray(
					m.tterm_nm
				))
				.addMap((r, m) -> {
					r.tterm_nm1(m.tterm_nm());
				}),
			j -> j
				.add(MAM_TTERM_R.class, r -> toCondition(
					r.tterm_cd2()
				))
				.addSelect(m -> toArray(
					m.tterm_nm
				))
				.addMap((r, m) -> {
					r.tterm_nm2(m.tterm_nm());
				}),
			j -> j
				.add(MAM_TTERM_R.class, r -> toCondition(
					r.tterm_cd3()
				))
				.addSelect(m -> toArray(
					m.tterm_nm
				))
				.addMap((r, m) -> {
					r.tterm_nm3(m.tterm_nm());
				}),
			j -> j
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.base_trd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.unit_cd
				))
				.addMap((r, m) -> {
					r.setStringNE("join_unit_cd_", m.unit_cd());
				}),
			j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.getStringNE("join_unit_cd_")
				))
				.addSelect(m -> toArray(
					m.dec_place,
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.base_trd_unit_nm(m.unit_nm());
					r.base_trd_unit_dec_place(m.dec_place());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.base_trd_cur_cd()
				))
				.addSelect(m -> toArray(
					m.cur_nm
				))
				.addMap((r, m) -> {
					r.base_trd_cur_nm(m.cur_nm());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.base_in_to_loc_wg_cd()
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.base_in_to_loc_wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MAM_LOC_R.class, r -> toCondition(
					r.base_in_to_loc_cd()
				))
				.addSelect(m -> toArray(
					m.loc_nm
				))
				.addMap((r, m) -> {
					r.base_in_to_loc_nm(m.loc_nm());
				}),
			j -> j
				.add(MAM_TAX_R.class, r -> toCondition(
					r.base_tax_cd()
				))
				.addSelect(m -> toArray(
					m.tax_nm
				))
				.addMap((r, m) -> {
					r.base_tax_nm(m.tax_nm());
				}),
			j -> j
				.add(MAM_STK_GD_R.class, r -> toCondition(
					r.gd_cd()
				))
				.addSelect(m -> toArray(
					m.gd_nm
				))
				.addMap((r, m) -> {
					r.gd_nm(m.gd_nm());
				})
		);
	}
}